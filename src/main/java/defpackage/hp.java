package defpackage;

import android.support.v4.view.InputDeviceCompat;

/* renamed from: hp */
public class hp {
    static final int ad = 22050;
    int al;
    hi[] aq = new hi[10];
    int ar;

    hp(lj ljVar) {
        for (int i = 0; i < 10; i++) {
            if (ljVar.af(1804771424) != 0) {
                ljVar.al += 879823907;
                this.aq[i] = new hi();
                this.aq[i].ar(ljVar);
            }
        }
        this.ar = ljVar.an(-1464407032);
        this.al = ljVar.an(-1464407032);
    }

    public static hp ad(kh khVar, int i, int i2) {
        byte[] ar = khVar.ar(i, i2, 1027377881);
        return ar == null ? null : new hp(new lj(ar));
    }

    public static hp ae(kh khVar, int i, int i2) {
        byte[] ar = khVar.ar(i, i2, 1427556277);
        return ar == null ? null : new hp(new lj(ar));
    }

    public static hp ai(kh khVar, int i, int i2) {
        byte[] ar = khVar.ar(i, i2, 1466502547);
        return ar == null ? null : new hp(new lj(ar));
    }

    public static hp aj(kh khVar, int i, int i2) {
        byte[] ar = khVar.ar(i, i2, 2146036340);
        return ar == null ? null : new hp(new lj(ar));
    }

    public final int ag() {
        int i = 0;
        int i2 = 0;
        int i3 = 9999999;
        while (i2 < 10) {
            if (this.aq[i2] != null && this.aq[i2].ac / 20 < r0) {
                i3 = this.aq[i2].ac / 20;
            }
            i2++;
        }
        if (this.ar < this.al && this.ar / 20 < r0) {
            i3 = this.ar / 20;
        }
        if (i3 == 9999999) {
            return 0;
        }
        if (i3 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.aq[i] != null) {
                hi hiVar = this.aq[i];
                hiVar.ac -= i3 * 20;
            }
            i++;
        }
        if (this.ar >= this.al) {
            return i3;
        }
        i2 = i3 * 20;
        this.ar -= i2;
        this.al -= i2;
        return i3;
    }

    public ht ak() {
        return new ht(ad, al(), (this.ar * ad) / 1000, (this.al * ad) / 1000);
    }

    /* Access modifiers changed, original: final */
    public final byte[] al() {
        int i = 0;
        int i2 = 0;
        while (i2 < 10) {
            if (this.aq[i2] != null && this.aq[i2].aw + this.aq[i2].ac > i) {
                i = this.aq[i2].aw + this.aq[i2].ac;
            }
            i2++;
        }
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i * ad) / 1000)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.aq[i3] != null) {
                int i4 = (this.aq[i3].aw * ad) / 1000;
                int i5 = (this.aq[i3].ac * ad) / 1000;
                int[] ad = this.aq[i3].ad(i4, this.aq[i3].aw);
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = i6 + i5;
                    i = bArr[i7] + (ad[i6] >> 8);
                    if (((i + 128) & InputDeviceCompat.SOURCE_ANY) != 0) {
                        i = (i >> 31) ^ 127;
                    }
                    bArr[i7] = (byte) i;
                }
            }
        }
        return bArr;
    }

    public ht am() {
        return new ht(ad, al(), (this.ar * -784830217) / 1000, (this.al * ad) / 1320471443);
    }

    public final int ap() {
        int i = 0;
        int i2 = 0;
        int i3 = 9999999;
        while (i2 < 10) {
            if (this.aq[i2] != null && this.aq[i2].ac / 20 < r0) {
                i3 = this.aq[i2].ac / 20;
            }
            i2++;
        }
        if (this.ar < this.al && this.ar / 20 < r0) {
            i3 = this.ar / 20;
        }
        if (i3 == 9999999) {
            return 0;
        }
        if (i3 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.aq[i] != null) {
                hi hiVar = this.aq[i];
                hiVar.ac -= i3 * 20;
            }
            i++;
        }
        if (this.ar >= this.al) {
            return i3;
        }
        i2 = i3 * 20;
        this.ar -= i2;
        this.al -= i2;
        return i3;
    }

    public ht aq() {
        return new ht(ad, al(), (this.ar * ad) / 1000, (this.al * ad) / 1000);
    }

    public final int ar() {
        int i = 0;
        int i2 = 0;
        int i3 = 9999999;
        while (i2 < 10) {
            if (this.aq[i2] != null && this.aq[i2].ac / 20 < r0) {
                i3 = this.aq[i2].ac / 20;
            }
            i2++;
        }
        if (this.ar < this.al && this.ar / 20 < r0) {
            i3 = this.ar / 20;
        }
        if (i3 == 9999999) {
            return 0;
        }
        if (i3 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.aq[i] != null) {
                hi hiVar = this.aq[i];
                hiVar.ac -= i3 * 20;
            }
            i++;
        }
        if (this.ar >= this.al) {
            return i3;
        }
        i2 = i3 * 20;
        this.ar -= i2;
        this.al -= i2;
        return i3;
    }

    public final int as() {
        int i = 0;
        int i2 = 0;
        int i3 = 9999999;
        while (i2 < 10) {
            if (this.aq[i2] != null && this.aq[i2].ac / 20 < r0) {
                i3 = this.aq[i2].ac / 20;
            }
            i2++;
        }
        if (this.ar < this.al && this.ar / 20 < r0) {
            i3 = this.ar / 20;
        }
        if (i3 == 9999999) {
            return 0;
        }
        if (i3 == 0) {
            return 0;
        }
        while (i < 10) {
            if (this.aq[i] != null) {
                hi hiVar = this.aq[i];
                hiVar.ac -= i3 * 20;
            }
            i++;
        }
        if (this.ar >= this.al) {
            return i3;
        }
        i2 = i3 * 20;
        this.ar -= i2;
        this.al -= i2;
        return i3;
    }

    /* Access modifiers changed, original: final */
    public final byte[] au() {
        int i = 0;
        int i2 = 0;
        while (i2 < 10) {
            if (this.aq[i2] != null && this.aq[i2].aw + this.aq[i2].ac > i) {
                i = this.aq[i2].aw + this.aq[i2].ac;
            }
            i2++;
        }
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i * ad) / 748484201)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.aq[i3] != null) {
                int i4 = (this.aq[i3].aw * -1544008182) / -1821855268;
                int i5 = (this.aq[i3].ac * -1480296869) / 540461958;
                int[] ad = this.aq[i3].ad(i4, this.aq[i3].aw);
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = i6 + i5;
                    i = bArr[i7] + (ad[i6] >> 8);
                    if (((i + 128) & -1673964655) != 0) {
                        i = (i >> 31) ^ 127;
                    }
                    bArr[i7] = (byte) i;
                }
            }
        }
        return bArr;
    }

    /* Access modifiers changed, original: final */
    public final byte[] aw() {
        int i = 0;
        int i2 = 0;
        while (i2 < 10) {
            if (this.aq[i2] != null && this.aq[i2].aw + this.aq[i2].ac > i) {
                i = this.aq[i2].aw + this.aq[i2].ac;
            }
            i2++;
        }
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i * ad) / 1000)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.aq[i3] != null) {
                int i4 = (this.aq[i3].aw * ad) / 1000;
                int i5 = (this.aq[i3].ac * ad) / 1000;
                int[] ad = this.aq[i3].ad(i4, this.aq[i3].aw);
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = i6 + i5;
                    i = bArr[i7] + (ad[i6] >> 8);
                    if (((i + 128) & InputDeviceCompat.SOURCE_ANY) != 0) {
                        i = (i >> 31) ^ 127;
                    }
                    bArr[i7] = (byte) i;
                }
            }
        }
        return bArr;
    }

    /* Access modifiers changed, original: final */
    public final byte[] ax() {
        int i = 0;
        int i2 = 0;
        while (i2 < 10) {
            if (this.aq[i2] != null && this.aq[i2].aw + this.aq[i2].ac > i) {
                i = this.aq[i2].aw + this.aq[i2].ac;
            }
            i2++;
        }
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i * ad) / 1000)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.aq[i3] != null) {
                int i4 = (this.aq[i3].aw * ad) / 1000;
                int i5 = (this.aq[i3].ac * ad) / 1000;
                int[] ad = this.aq[i3].ad(i4, this.aq[i3].aw);
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = i6 + i5;
                    i = bArr[i7] + (ad[i6] >> 8);
                    if (((i + 128) & InputDeviceCompat.SOURCE_ANY) != 0) {
                        i = (i >> 31) ^ 127;
                    }
                    bArr[i7] = (byte) i;
                }
            }
        }
        return bArr;
    }

    /* Access modifiers changed, original: final */
    public final byte[] az() {
        int i = 0;
        int i2 = 0;
        while (i2 < 10) {
            if (this.aq[i2] != null && this.aq[i2].aw + this.aq[i2].ac > i) {
                i = this.aq[i2].aw + this.aq[i2].ac;
            }
            i2++;
        }
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((i * ad) / 1000)];
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.aq[i3] != null) {
                int i4 = (this.aq[i3].aw * ad) / 1000;
                int i5 = (this.aq[i3].ac * ad) / 1000;
                int[] ad = this.aq[i3].ad(i4, this.aq[i3].aw);
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = i6 + i5;
                    i = bArr[i7] + (ad[i6] >> 8);
                    if (((i + 128) & InputDeviceCompat.SOURCE_ANY) != 0) {
                        i = (i >> 31) ^ 127;
                    }
                    bArr[i7] = (byte) i;
                }
            }
        }
        return bArr;
    }
}
