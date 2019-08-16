package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CycleDetector {

    private static class ComponentNode {
        private final Component<?> component;
        private final Set<ComponentNode> dependencies = new HashSet();
        private final Set<ComponentNode> dependents = new HashSet();

        ComponentNode(Component<?> component) {
            this.component = component;
        }

        /* Access modifiers changed, original: 0000 */
        public void addDependency(ComponentNode componentNode) {
            this.dependencies.add(componentNode);
        }

        /* Access modifiers changed, original: 0000 */
        public void addDependent(ComponentNode componentNode) {
            this.dependents.add(componentNode);
        }

        /* Access modifiers changed, original: 0000 */
        public Component<?> getComponent() {
            return this.component;
        }

        /* Access modifiers changed, original: 0000 */
        public Set<ComponentNode> getDependencies() {
            return this.dependencies;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean isLeaf() {
            return this.dependencies.isEmpty();
        }

        /* Access modifiers changed, original: 0000 */
        public boolean isRoot() {
            return this.dependents.isEmpty();
        }

        /* Access modifiers changed, original: 0000 */
        public void removeDependent(ComponentNode componentNode) {
            this.dependents.remove(componentNode);
        }
    }

    private static class Dep {
        private final Class<?> anInterface;
        private final boolean set;

        private Dep(Class<?> cls, boolean z) {
            this.anInterface = cls;
            this.set = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Dep)) {
                return false;
            }
            Dep dep = (Dep) obj;
            return dep.anInterface.equals(this.anInterface) && dep.set == this.set;
        }

        public int hashCode() {
            return ((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.set).hashCode();
        }
    }

    CycleDetector() {
    }

    static void detect(List<Component<?>> list) {
        ComponentNode componentNode;
        Set<ComponentNode> toGraph = toGraph(list);
        Set roots = getRoots(toGraph);
        int i = 0;
        while (!roots.isEmpty()) {
            componentNode = (ComponentNode) roots.iterator().next();
            roots.remove(componentNode);
            int i2 = i + 1;
            for (ComponentNode componentNode2 : componentNode.getDependencies()) {
                componentNode2.removeDependent(componentNode);
                if (componentNode2.isRoot()) {
                    roots.add(componentNode2);
                }
            }
            i = i2;
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (ComponentNode componentNode3 : toGraph) {
                if (!(componentNode3.isRoot() || componentNode3.isLeaf())) {
                    arrayList.add(componentNode3.getComponent());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    private static Set<ComponentNode> getRoots(Set<ComponentNode> set) {
        HashSet hashSet = new HashSet();
        for (ComponentNode componentNode : set) {
            if (componentNode.isRoot()) {
                hashSet.add(componentNode);
            }
        }
        return hashSet;
    }

    private static Set<ComponentNode> toGraph(List<Component<?>> list) {
        HashMap hashMap = new HashMap(list.size());
        for (Component component : list) {
            ComponentNode componentNode = new ComponentNode(component);
            for (Class dep : component.getProvidedInterfaces()) {
                Dep dep2 = new Dep(dep, component.isValue() ^ 1);
                if (!hashMap.containsKey(dep2)) {
                    hashMap.put(dep2, new HashSet());
                }
                Set set = (Set) hashMap.get(dep2);
                if (set.isEmpty() || dep2.set) {
                    set.add(componentNode);
                } else {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{dep}));
                }
            }
        }
        for (Set<ComponentNode> it : hashMap.values()) {
            for (ComponentNode componentNode2 : it) {
                for (Dependency dependency : componentNode2.getComponent().getDependencies()) {
                    if (dependency.isDirectInjection()) {
                        Set<ComponentNode> set2 = (Set) hashMap.get(new Dep(dependency.getInterface(), dependency.isSet()));
                        if (set2 != null) {
                            for (ComponentNode componentNode3 : set2) {
                                componentNode2.addDependency(componentNode3);
                                componentNode3.addDependent(componentNode2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
