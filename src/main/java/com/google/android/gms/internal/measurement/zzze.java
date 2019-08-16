package com.google.android.gms.internal.measurement;

final class zzze extends zzzh {
    private final int zzbth;
    private final int zzbti;

    zzze(byte[] bArr, int i, int i2) {
        super(bArr);
        zzzb.zzb(i, i + i2, bArr.length);
        this.zzbth = i;
        this.zzbti = i2;
    }

    public final int size() {
        return this.zzbti;
    }

    public final byte zzae(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzbtj[this.zzbth + i];
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("Index < 0: ");
            stringBuilder.append(i);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("Index > length: ");
        stringBuilder2.append(i);
        stringBuilder2.append(", ");
        stringBuilder2.append(size);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final int zztn() {
        return this.zzbth;
    }
}
