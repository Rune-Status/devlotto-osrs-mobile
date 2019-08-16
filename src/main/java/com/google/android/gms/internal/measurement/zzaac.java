package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzaac<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> zzbvc;

    public zzaac(Iterator<Entry<K, Object>> it) {
        this.zzbvc = it;
    }

    public final boolean hasNext() {
        return this.zzbvc.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.zzbvc.next();
        return entry.getValue() instanceof zzzz ? new zzaab(entry) : entry;
    }

    public final void remove() {
        this.zzbvc.remove();
    }
}
