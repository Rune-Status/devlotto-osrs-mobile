package com.google.android.gms.internal.measurement;

public final class zzacf implements Cloneable {
    private static final zzacg zzbzh = new zzacg();
    private int mSize;
    private boolean zzbzi;
    private int[] zzbzj;
    private zzacg[] zzbzk;

    zzacf() {
        this(10);
    }

    private zzacf(int i) {
        this.zzbzi = false;
        int idealIntArraySize = idealIntArraySize(i);
        this.zzbzj = new int[idealIntArraySize];
        this.zzbzk = new zzacg[idealIntArraySize];
        this.mSize = 0;
    }

    private static int idealIntArraySize(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            int i4 = i3;
            if (i4 >= 32) {
                i3 = i2;
                break;
            }
            i3 = (1 << i4) - 12;
            if (i2 <= i3) {
                break;
            }
            i3 = i4 + 1;
        }
        return i3 / 4;
    }

    private final int zzav(int i) {
        int i2 = 0;
        int i3 = this.mSize - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.zzbzj[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.mSize;
        zzacf zzacf = new zzacf(i);
        System.arraycopy(this.zzbzj, 0, zzacf.zzbzj, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzbzk[i2] != null) {
                zzacf.zzbzk[i2] = (zzacg) this.zzbzk[i2].clone();
            }
        }
        zzacf.mSize = i;
        return zzacf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacf)) {
            return false;
        }
        zzacf zzacf = (zzacf) obj;
        if (this.mSize != zzacf.mSize) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.zzbzj;
        int[] iArr2 = zzacf.zzbzj;
        int i2 = this.mSize;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            zzacg[] zzacgArr = this.zzbzk;
            zzacg[] zzacgArr2 = zzacf.zzbzk;
            i2 = this.mSize;
            for (i = 0; i < i2; i++) {
                if (!zzacgArr[i].equals(zzacgArr2[i])) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.zzbzj[i2]) * 31) + this.zzbzk[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    /* Access modifiers changed, original: final */
    public final int size() {
        return this.mSize;
    }

    /* Access modifiers changed, original: final */
    public final void zza(int i, zzacg zzacg) {
        int zzav = zzav(i);
        if (zzav >= 0) {
            this.zzbzk[zzav] = zzacg;
        } else if (zzav >= this.mSize || this.zzbzk[zzav] != zzbzh) {
            if (this.mSize >= this.zzbzj.length) {
                int idealIntArraySize = idealIntArraySize(this.mSize + 1);
                int[] iArr = new int[idealIntArraySize];
                zzacg[] zzacgArr = new zzacg[idealIntArraySize];
                System.arraycopy(this.zzbzj, 0, iArr, 0, this.zzbzj.length);
                System.arraycopy(this.zzbzk, 0, zzacgArr, 0, this.zzbzk.length);
                this.zzbzj = iArr;
                this.zzbzk = zzacgArr;
            }
            if (this.mSize - zzav != 0) {
                int i2 = zzav + 1;
                System.arraycopy(this.zzbzj, zzav, this.zzbzj, i2, this.mSize - zzav);
                System.arraycopy(this.zzbzk, zzav, this.zzbzk, i2, this.mSize - zzav);
            }
            this.zzbzj[zzav] = i;
            this.zzbzk[zzav] = zzacg;
            this.mSize++;
        } else {
            this.zzbzj[zzav] = i;
            this.zzbzk[zzav] = zzacg;
        }
    }

    /* Access modifiers changed, original: final */
    public final zzacg zzat(int i) {
        int zzav = zzav(i);
        return (zzav < 0 || this.zzbzk[zzav] == zzbzh) ? null : this.zzbzk[zzav];
    }

    /* Access modifiers changed, original: final */
    public final zzacg zzau(int i) {
        return this.zzbzk[i];
    }
}
