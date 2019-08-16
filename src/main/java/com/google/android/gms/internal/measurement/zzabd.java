package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzabd<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzbnw;
    private final int zzbwe;
    private List<zzabi> zzbwf;
    private Map<K, V> zzbwg;
    private volatile zzabk zzbwh;
    private Map<K, V> zzbwi;

    private zzabd(int i) {
        this.zzbwe = i;
        this.zzbwf = Collections.emptyList();
        this.zzbwg = Collections.emptyMap();
        this.zzbwi = Collections.emptyMap();
    }

    /* synthetic */ zzabd(int i, zzabe zzabe) {
        this(i);
    }

    private final int zza(K k) {
        int compareTo;
        int size = this.zzbwf.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo((Comparable) ((zzabi) this.zzbwf.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = size;
        int i2 = 0;
        while (i2 <= i) {
            size = (i2 + i) / 2;
            compareTo = k.compareTo((Comparable) ((zzabi) this.zzbwf.get(size)).getKey());
            if (compareTo < 0) {
                i = size - 1;
            } else if (compareTo <= 0) {
                return size;
            } else {
                i2 = size + 1;
            }
        }
        return -(i2 + 1);
    }

    static <FieldDescriptorType extends zzzt<FieldDescriptorType>> zzabd<FieldDescriptorType, Object> zzag(int i) {
        return new zzabe(i);
    }

    private final V zzai(int i) {
        zzva();
        Object value = ((zzabi) this.zzbwf.remove(i)).getValue();
        if (!this.zzbwg.isEmpty()) {
            Iterator it = zzvb().entrySet().iterator();
            this.zzbwf.add(new zzabi(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final void zzva() {
        if (this.zzbnw) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzvb() {
        zzva();
        if (this.zzbwg.isEmpty() && !(this.zzbwg instanceof TreeMap)) {
            this.zzbwg = new TreeMap();
            this.zzbwi = ((TreeMap) this.zzbwg).descendingMap();
        }
        return (SortedMap) this.zzbwg;
    }

    public void clear() {
        zzva();
        if (!this.zzbwf.isEmpty()) {
            this.zzbwf.clear();
        }
        if (!this.zzbwg.isEmpty()) {
            this.zzbwg.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzbwg.containsKey(comparable);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.zzbwh == null) {
            this.zzbwh = new zzabk(this, null);
        }
        return this.zzbwh;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzabd)) {
            return super.equals(obj);
        }
        zzabd zzabd = (zzabd) obj;
        int size = size();
        if (size != zzabd.size()) {
            return false;
        }
        int zzuy = zzuy();
        if (zzuy != zzabd.zzuy()) {
            return entrySet().equals(zzabd.entrySet());
        }
        for (int i = 0; i < zzuy; i++) {
            if (!zzah(i).equals(zzabd.zzah(i))) {
                return false;
            }
        }
        return zzuy != size ? this.zzbwg.equals(zzabd.zzbwg) : true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        return zza >= 0 ? ((zzabi) this.zzbwf.get(zza)).getValue() : this.zzbwg.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < zzuy(); i2++) {
            i += ((zzabi) this.zzbwf.get(i2)).hashCode();
        }
        return this.zzbwg.size() > 0 ? this.zzbwg.hashCode() + i : i;
    }

    public final boolean isImmutable() {
        return this.zzbnw;
    }

    public V remove(Object obj) {
        zzva();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        return zza >= 0 ? zzai(zza) : this.zzbwg.isEmpty() ? null : this.zzbwg.remove(comparable);
    }

    public int size() {
        return this.zzbwf.size() + this.zzbwg.size();
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzva();
        int zza = zza((Comparable) k);
        if (zza >= 0) {
            return ((zzabi) this.zzbwf.get(zza)).setValue(v);
        }
        zzva();
        if (this.zzbwf.isEmpty() && !(this.zzbwf instanceof ArrayList)) {
            this.zzbwf = new ArrayList(this.zzbwe);
        }
        int i = -(zza + 1);
        if (i >= this.zzbwe) {
            return zzvb().put(k, v);
        }
        if (this.zzbwf.size() == this.zzbwe) {
            zzabi zzabi = (zzabi) this.zzbwf.remove(this.zzbwe - 1);
            zzvb().put((Comparable) zzabi.getKey(), zzabi.getValue());
        }
        this.zzbwf.add(i, new zzabi(this, k, v));
        return null;
    }

    public final Entry<K, V> zzah(int i) {
        return (Entry) this.zzbwf.get(i);
    }

    public void zzru() {
        if (!this.zzbnw) {
            this.zzbwg = this.zzbwg.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzbwg);
            this.zzbwi = this.zzbwi.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzbwi);
            this.zzbnw = true;
        }
    }

    public final int zzuy() {
        return this.zzbwf.size();
    }

    public final Iterable<Entry<K, V>> zzuz() {
        return this.zzbwg.isEmpty() ? zzabf.zzvc() : this.zzbwg.entrySet();
    }
}
