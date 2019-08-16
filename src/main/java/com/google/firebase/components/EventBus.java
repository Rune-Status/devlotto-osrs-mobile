package com.google.firebase.components;

import android.support.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class EventBus implements Subscriber, Publisher {
    private final Executor defaultExecutor;
    @GuardedBy("this")
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> handlerMap = new HashMap();
    @GuardedBy("this")
    private Queue<Event<?>> pendingEvents = new ArrayDeque();

    EventBus(Executor executor) {
        this.defaultExecutor = executor;
    }

    private Set<Entry<EventHandler<Object>, Executor>> getHandlers(Event<?> event) {
        Set<Entry<EventHandler<Object>, Executor>> emptySet;
        synchronized (this) {
            Map map = (Map) this.handlerMap.get(event.getType());
            emptySet = map == null ? Collections.emptySet() : map.entrySet();
        }
        return emptySet;
    }

    /* Access modifiers changed, original: 0000 */
    public void enablePublishingAndFlushPending() {
        Queue queue = null;
        synchronized (this) {
            if (this.pendingEvents != null) {
                queue = this.pendingEvents;
                this.pendingEvents = null;
            }
        }
        if (queue != null) {
            for (Event publish : queue) {
                publish(publish);
            }
        }
    }

    /* JADX WARNING: Missing block: B:8:0x0010, code skipped:
            r2 = getHandlers(r4).iterator();
     */
    /* JADX WARNING: Missing block: B:10:0x001c, code skipped:
            if (r2.hasNext() == false) goto L_0x000e;
     */
    /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            r0 = (java.util.Map.Entry) r2.next();
            ((java.util.concurrent.Executor) r0.getValue()).execute(com.google.firebase.components.EventBus$$Lambda$1.lambdaFactory$(r0, r4));
     */
    /* JADX WARNING: Missing block: B:21:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void publish(Event<?> event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            if (this.pendingEvents != null) {
                this.pendingEvents.add(event);
            }
        }
    }

    public <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.defaultExecutor, eventHandler);
    }

    public <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        synchronized (this) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            Preconditions.checkNotNull(executor);
            if (!this.handlerMap.containsKey(cls)) {
                this.handlerMap.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.handlerMap.get(cls)).put(eventHandler, executor);
        }
    }

    /* JADX WARNING: Missing block: B:14:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        synchronized (this) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            if (this.handlerMap.containsKey(cls)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.handlerMap.get(cls);
                concurrentHashMap.remove(eventHandler);
                if (concurrentHashMap.isEmpty()) {
                    this.handlerMap.remove(cls);
                }
            }
        }
    }
}
