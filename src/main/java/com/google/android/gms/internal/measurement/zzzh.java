package com.google.android.gms.internal.measurement;

class zzzh extends zzzg {
    protected final byte[] zzbtj;

    zzzh(byte[] bArr) {
        this.zzbtj = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzzb)) {
            return false;
        }
        if (size() != ((zzzb) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzzh)) {
            return obj.equals(this);
        }
        zzzh zzzh = (zzzh) obj;
        int zztm = zztm();
        int zztm2 = zzzh.zztm();
        return (zztm == 0 || zztm2 == 0 || zztm == zztm2) ? zza(zzzh, 0, size()) : false;
    }

    public int size() {
        return this.zzbtj.length;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zza(int i, int i2, int i3) {
        return zzzw.zza(i, this.zzbtj, zztn(), i3);
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(zzzb zzzb, int i, int i2) {
        int size;
        StringBuilder stringBuilder;
        if (i2 > zzzb.size()) {
            size = size();
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(size);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 > zzzb.size()) {
            size = zzzb.size();
            stringBuilder = new StringBuilder(59);
            stringBuilder.append("Ran off end of other: 0, ");
            stringBuilder.append(i2);
            stringBuilder.append(", ");
            stringBuilder.append(size);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!(zzzb instanceof zzzh)) {
            return zzzb.zzb(0, i2).equals(zzb(0, i2));
        } else {
            zzzh zzzh = (zzzh) zzzb;
            byte[] bArr = this.zzbtj;
            byte[] bArr2 = zzzh.zzbtj;
            int zztn = zztn();
            int zztn2 = zztn();
            int zztn3 = zzzh.zztn();
            while (zztn2 < zztn + i2) {
                if (bArr[zztn2] != bArr2[zztn3]) {
                    return false;
                }
                zztn2++;
                zztn3++;
            }
            return true;
        }
    }

    public byte zzae(int i) {
        return this.zzbtj[i];
    }

    public final zzzb zzb(int i, int i2) {
        int zzb = zzzb.zzb(0, i2, size());
        return zzb == 0 ? zzzb.zzbte : new zzze(this.zzbtj, zztn(), zzb);
    }

    /* Access modifiers changed, original: protected */
    public int zztn() {
        return 0;
    }
}
