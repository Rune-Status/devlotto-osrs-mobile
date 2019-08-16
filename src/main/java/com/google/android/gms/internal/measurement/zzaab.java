package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

final class zzaab<K> implements Entry<K, Object> {
    private Entry<K, zzzz> zzbvb;

    private zzaab(Entry<K, zzzz> entry) {
        this.zzbvb = entry;
    }

    public final K getKey() {
        return this.zzbvb.getKey();
    }

    public final Object getValue() {
        return ((zzzz) this.zzbvb.getValue()) == null ? null : zzzz.zzud();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzaaq) {
            return ((zzzz) this.zzbvb.getValue()).zzc((zzaaq) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
