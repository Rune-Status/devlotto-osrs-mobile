package butterknife.internal;

import java.util.AbstractList;
import java.util.RandomAccess;

final class ImmutableList<T> extends AbstractList<T> implements RandomAccess {
    private final T[] views;

    ImmutableList(T[] tArr) {
        this.views = tArr;
    }

    public boolean contains(Object obj) {
        for (Object obj2 : this.views) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    public T get(int i) {
        return this.views[i];
    }

    public int size() {
        return this.views.length;
    }
}
