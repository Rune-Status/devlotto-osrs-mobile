package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

final class zzabi implements Comparable<zzabi>, Entry<K, V> {
    private V value;
    private final K zzbwl;
    private final /* synthetic */ zzabd zzbwm;

    zzabi(zzabd zzabd, K k, V v) {
        this.zzbwm = zzabd;
        this.zzbwl = k;
        this.value = v;
    }

    zzabi(zzabd zzabd, Entry<K, V> entry) {
        this(zzabd, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzabi) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return equals(this.zzbwl, entry.getKey()) && equals(this.value, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.zzbwl;
    }

    public final V getValue() {
        return this.value;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.zzbwl == null ? 0 : this.zzbwl.hashCode();
        if (this.value != null) {
            i = this.value.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.zzbwm.zzva();
        Object obj = this.value;
        this.value = v;
        return obj;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzbwl);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("=");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }
}
