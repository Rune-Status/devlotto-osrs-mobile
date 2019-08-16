package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzzr<FieldDescriptorType extends zzzt<FieldDescriptorType>> {
    private static final zzzr zzbub = new zzzr(true);
    private boolean zzbnw;
    private final zzabd<FieldDescriptorType, Object> zzbtz = zzabd.zzag(16);
    private boolean zzbua = false;

    private zzzr() {
    }

    private zzzr(boolean z) {
        if (!this.zzbnw) {
            this.zzbtz.zzru();
            this.zzbnw = true;
        }
    }

    /* JADX WARNING: Missing block: B:7:0x001c, code skipped:
            if ((r3 instanceof com.google.android.gms.internal.measurement.zzzz) == false) goto L_0x0013;
     */
    /* JADX WARNING: Missing block: B:8:0x001e, code skipped:
            r0 = true;
     */
    /* JADX WARNING: Missing block: B:12:0x0026, code skipped:
            if ((r3 instanceof com.google.android.gms.internal.measurement.zzzx) == false) goto L_0x0013;
     */
    /* JADX WARNING: Missing block: B:16:0x002f, code skipped:
            if ((r3 instanceof byte[]) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(zzabu zzabu, Object obj) {
        zzzw.checkNotNull(obj);
        boolean z = false;
        switch (zzzs.zzbuc[zzabu.zzvk().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzzb)) {
                    break;
                }
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
            case 9:
                if (!(obj instanceof zzaaq)) {
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private final void zza(FieldDescriptorType fieldDescriptorType, Object obj) {
        Object obj2;
        if (!fieldDescriptorType.zztz()) {
            zza(fieldDescriptorType.zzty(), obj);
            obj2 = obj;
        } else if (obj instanceof List) {
            obj2 = new ArrayList();
            obj2.addAll((List) obj);
            ArrayList arrayList = (ArrayList) obj2;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                zza(fieldDescriptorType.zzty(), obj3);
            }
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj2 instanceof zzzz) {
            this.zzbua = true;
        }
        this.zzbtz.put((Comparable) fieldDescriptorType, obj2);
    }

    public static <T extends zzzt<T>> zzzr<T> zztx() {
        return zzbub;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzzr zzzr = new zzzr();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.zzbtz.zzuy()) {
                break;
            }
            Entry zzah = this.zzbtz.zzah(i2);
            zzzr.zza((zzzt) zzah.getKey(), zzah.getValue());
            i = i2 + 1;
        }
        for (Entry entry : this.zzbtz.zzuz()) {
            zzzr.zza((zzzt) entry.getKey(), entry.getValue());
        }
        zzzr.zzbua = this.zzbua;
        return zzzr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzr)) {
            return false;
        }
        return this.zzbtz.equals(((zzzr) obj).zzbtz);
    }

    public final int hashCode() {
        return this.zzbtz.hashCode();
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzbua ? new zzaac(this.zzbtz.entrySet().iterator()) : this.zzbtz.entrySet().iterator();
    }
}
