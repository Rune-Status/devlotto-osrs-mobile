package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzabk extends AbstractSet<Entry<K, V>> {
    private final /* synthetic */ zzabd zzbwm;

    private zzabk(zzabd zzabd) {
        this.zzbwm = zzabd;
    }

    /* synthetic */ zzabk(zzabd zzabd, zzabe zzabe) {
        this(zzabd);
    }

    public final /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzbwm.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.zzbwm.clear();
    }

    public final boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.zzbwm.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new zzabj(this.zzbwm, null);
    }

    public final boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzbwm.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.zzbwm.size();
    }
}
