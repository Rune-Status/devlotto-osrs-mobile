package defpackage;

import android.support.v4.view.InputDeviceCompat;

/* renamed from: hf */
public class hf extends hq {
    int ad;
    int ae;
    boolean ag;
    int ai;
    int aj;
    int ak;
    int al;
    int am;
    int ap;
    int aq;
    int ar;
    int as;
    int au;
    int ax;
    int az;

    hf(ht htVar, int i, int i2) {
        this.aa = htVar;
        this.ak = htVar.al;
        this.as = htVar.aj;
        this.ag = htVar.ai;
        this.aq = i;
        this.ar = i2;
        this.al = 8192;
        this.ad = 0;
        aj();
    }

    hf(ht htVar, int i, int i2, int i3) {
        this.aa = htVar;
        this.ak = htVar.al;
        this.as = htVar.aj;
        this.ag = htVar.ai;
        this.aq = i;
        this.ar = i2;
        this.al = i3;
        this.ad = 0;
        aj();
    }

    static int ad(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (16384 - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    public static hf al(ht htVar, int i, int i2, int i3) {
        return (htVar.ar == null || htVar.ar.length == 0) ? null : new hf(htVar, i, i2, i3);
    }

    static int aq(int i, int i2) {
        return i2 < 0 ? -i : (int) ((((double) i) * Math.sqrt(((double) i2) * 1.220703125E-4d)) + 0.5d);
    }

    public static hf ar(ht htVar, int i, int i2) {
        return (htVar.ar == null || htVar.ar.length == 0) ? null : new hf(htVar, (int) (((((long) htVar.aq) * 256) * ((long) i)) / ((long) (hd.ad * 1895484228))), i2 << 6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016 A:{LOOP_END, LOOP:0: B:4:0x0014->B:5:0x0016} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A:{LOOP_END, LOOP:1: B:9:0x0043->B:11:0x0047} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int be(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12++;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                while (i12 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    iArr[i12] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
                    i13 += i9;
                    i12++;
                }
                hfVar.ad = i13;
                return i12;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
        }
        if (i9 != 0) {
        }
        while (i12 < i7) {
        }
        hfVar.ad = i13;
        return i12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017 A:{LOOP_END, LOOP:0: B:4:0x0015->B:5:0x0017} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046 A:{LOOP_END, LOOP:1: B:9:0x0042->B:11:0x0046} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int bh(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 + 256) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    iArr[i12] = (((((bArr[i14] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12++;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                while (i12 < i7) {
                    iArr[i12] = iArr[i12] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (i13 & 255))) * i5) >> 6);
                    i13 += i9;
                    i12++;
                }
                hfVar.ad = i13;
                return i12;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
        }
        if (i9 != 0) {
        }
        while (i12 < i7) {
        }
        hfVar.ad = i13;
        return i12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055 A:{LOOP_END, LOOP:1: B:12:0x0051->B:14:0x0055} */
    /* JADX WARNING: Missing block: B:2:0x000d, code skipped:
            if (r1 > r17) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int bj(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 != 0) {
            i12 = ((((i9 - i3) + i10) - 257) / i10) + i4;
        }
        i12 = i8;
        int i15 = i4 << 1;
        int i16 = i3;
        while (i15 < (i12 << 1)) {
            i13 = i16 >> 8;
            byte b = bArr[i13];
            i13 = ((bArr[i13 + 1] - b) * (i16 & 255)) + (b << 8);
            i14 = i15 + 1;
            iArr[i15] = iArr[i15] + ((i13 * i5) >> 6);
            i15 = i14 + 1;
            iArr[i14] = ((i13 * i6) >> 6) + iArr[i14];
            i16 += i10;
        }
        if (i10 != 0) {
            i13 = ((((i9 - i16) + i10) - 1) / i10) + (i15 >> 1);
            if (i13 <= i8) {
                i12 = i16;
                i8 = i13;
                while (i15 < (i8 << 1)) {
                    byte b2 = bArr[i12 >> 8];
                    i13 = (b2 << 8) + ((i11 - b2) * (i12 & 255));
                    i14 = i15 + 1;
                    iArr[i15] = iArr[i15] + ((i13 * i5) >> 6);
                    i16 = i14 + 1;
                    iArr[i14] = ((i13 * i6) >> 6) + iArr[i14];
                    i12 += i10;
                    i15 = i16;
                }
                hfVar.ad = i12;
                return i15 >> 1;
            }
        }
        i12 = i16;
        while (i15 < (i8 << 1)) {
        }
        hfVar.ad = i12;
        return i15 >> 1;
    }

    static int bn(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, hf hfVar) {
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = i4 << 2;
        int i11 = ((i7 >> 8) + i2) - i8;
        if (i11 <= i6) {
            i6 = i11;
        }
        int i12 = i6 - i2;
        hfVar.ai += hfVar.az * i12;
        hfVar.ae += hfVar.ax * i12;
        i12 = i6 - 3;
        i11 = i9;
        int i13 = i2;
        while (i13 < i12) {
            i9 = i13 + 1;
            int i14 = i8 + 1;
            iArr[i13] = (bArr[i8] * i11) + iArr[i13];
            i11 += i10;
            i13 = i9 + 1;
            int i15 = i14 + 1;
            iArr[i9] = iArr[i9] + (bArr[i14] * i11);
            i11 += i10;
            i8 = i13 + 1;
            i14 = i15 + 1;
            iArr[i13] = iArr[i13] + (bArr[i15] * i11);
            i11 += i10;
            iArr[i8] = iArr[i8] + (bArr[i14] * i11);
            i11 += i10;
            i13 = i8 + 1;
            i8 = i14 + 1;
        }
        while (i13 < i12 + 3) {
            iArr[i13] = iArr[i13] + (bArr[i8] * i11);
            i11 += i10;
            i13++;
            i8++;
        }
        hfVar.aj = i11 >> 2;
        hfVar.ad = i8 << 8;
        return i13;
    }

    static int bp(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, hf hfVar) {
        int i11;
        byte b;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = (i3 + i12) - ((i10 >> 8) - 1);
        if (i17 <= i9) {
            i9 = i17;
        }
        hfVar.aj += hfVar.au * (i9 - i3);
        int i18 = i3 << 1;
        int i19 = (i9 << 1) - 6;
        i17 = i13;
        while (i18 < i19) {
            i13 = i12 - 1;
            byte b2 = bArr[i12];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b2 * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b2 * i14) + iArr[i11];
            i12 = i14 + i16;
            i14 = i13 - 1;
            b = bArr[i13];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i12) + iArr[i11];
            i12 += i16;
            i13 = i14 - 1;
            byte b3 = bArr[i14];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b3 * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b3 * i12) + iArr[i11];
            i14 = i12 + i16;
            i12 = i13 - 1;
            b = bArr[i13];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i14) + iArr[i11];
            i14 += i16;
        }
        while (i18 < i19 + 6) {
            b = bArr[i12];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i14) + iArr[i11];
            i14 += i16;
            i12--;
        }
        hfVar.ai = i17 >> 2;
        hfVar.ae = i14 >> 2;
        hfVar.ad = i12 << 8;
        return i18 >> 1;
    }

    static int br(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar) {
        int i9;
        byte b;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = (i3 + i10) - ((i8 >> 8) - 1);
        if (i13 <= i7) {
            i7 = i13;
        }
        int i14 = i3 << 1;
        int i15 = (i7 << 1) - 6;
        i13 = i10;
        while (i14 < i15) {
            i10 = i13 - 1;
            byte b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 - 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i10 = i13 - 1;
            b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 - 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
        }
        while (i14 < i15 + 6) {
            b = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i13--;
        }
        hfVar.ad = i13 << 8;
        return i14 >> 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A:{LOOP_END, LOOP:1: B:12:0x0050->B:14:0x0054} */
    /* JADX WARNING: Missing block: B:2:0x000e, code skipped:
            if (r1 > r17) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int bt(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 != 0) {
            i12 = ((((i9 + 256) - i3) + i10) / i10) + i4;
        }
        i12 = i8;
        int i15 = i4 << 1;
        int i16 = i3;
        while (i15 < (i12 << 1)) {
            i13 = i16 >> 8;
            byte b = bArr[i13 - 1];
            i13 = ((bArr[i13] - b) * (i16 & 255)) + (b << 8);
            i14 = i15 + 1;
            iArr[i15] = iArr[i15] + ((i13 * i5) >> 6);
            i15 = i14 + 1;
            iArr[i14] = ((i13 * i6) >> 6) + iArr[i14];
            i16 += i10;
        }
        if (i10 != 0) {
            i13 = (((i9 - i16) + i10) / i10) + (i15 >> 1);
            if (i13 <= i8) {
                i12 = i16;
                i8 = i13;
                while (i15 < (i8 << 1)) {
                    i13 = ((bArr[i12 >> 8] - i11) * (i12 & 255)) + (i11 << 8);
                    i14 = i15 + 1;
                    iArr[i15] = iArr[i15] + ((i13 * i5) >> 6);
                    i16 = i14 + 1;
                    iArr[i14] = ((i13 * i6) >> 6) + iArr[i14];
                    i12 += i10;
                    i15 = i16;
                }
                hfVar.ad = i12;
                return i15 >> 1;
            }
        }
        i12 = i16;
        while (i15 < (i8 << 1)) {
        }
        hfVar.ad = i12;
        return i15 >> 1;
    }

    static int bu(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar) {
        int i9;
        byte b;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        int i14 = i3 << 1;
        int i15 = (i7 << 1) - 6;
        i13 = i10;
        while (i14 < i15) {
            i10 = i13 + 1;
            byte b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 + 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i10 = i13 + 1;
            b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 + 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
        }
        while (i14 < i15 + 6) {
            b = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i13++;
        }
        hfVar.ad = i13 << 8;
        return i14 >> 1;
    }

    static int bw(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, hf hfVar) {
        int i7 = i >> 8;
        int i8 = i3 << 2;
        int i9 = (i2 + i7) - ((i6 >> 8) - 1);
        if (i9 <= i5) {
            i5 = i9;
        }
        int i10 = i5 - 3;
        i9 = i2;
        while (i9 < i10) {
            int i11 = i9 + 1;
            int i12 = i7 - 1;
            iArr[i9] = (bArr[i7] * i8) + iArr[i9];
            i9 = i11 + 1;
            int i13 = i12 - 1;
            iArr[i11] = iArr[i11] + (bArr[i12] * i8);
            i7 = i9 + 1;
            i12 = i13 - 1;
            iArr[i9] = iArr[i9] + (bArr[i13] * i8);
            iArr[i7] = iArr[i7] + (bArr[i12] * i8);
            i9 = i7 + 1;
            i7 = i12 - 1;
        }
        while (i9 < i10 + 3) {
            iArr[i9] = iArr[i9] + (bArr[i7] * i8);
            i9++;
            i7--;
        }
        hfVar.ad = i7 << 8;
        return i9;
    }

    static int bx(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, hf hfVar) {
        int i7 = i >> 8;
        int i8 = i3 << 2;
        int i9 = ((i6 >> 8) + i2) - i7;
        if (i9 <= i5) {
            i5 = i9;
        }
        int i10 = i5 - 3;
        i9 = i2;
        while (i9 < i10) {
            int i11 = i9 + 1;
            int i12 = i7 + 1;
            iArr[i9] = (bArr[i7] * i8) + iArr[i9];
            i9 = i11 + 1;
            int i13 = i12 + 1;
            iArr[i11] = iArr[i11] + (bArr[i12] * i8);
            i7 = i9 + 1;
            i12 = i13 + 1;
            iArr[i9] = iArr[i9] + (bArr[i13] * i8);
            iArr[i7] = iArr[i7] + (bArr[i12] * i8);
            i9 = i7 + 1;
            i7 = i12 + 1;
        }
        while (i9 < i10 + 3) {
            iArr[i9] = iArr[i9] + (bArr[i7] * i8);
            i9++;
            i7++;
        }
        hfVar.ad = i7 << 8;
        return i9;
    }

    static int by(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, hf hfVar) {
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = i4 << 2;
        int i11 = (i2 + i8) - ((i7 >> 8) - 1);
        if (i11 <= i6) {
            i6 = i11;
        }
        int i12 = i6 - i2;
        hfVar.ai += hfVar.az * i12;
        hfVar.ae += hfVar.ax * i12;
        i12 = i6 - 3;
        i11 = i9;
        int i13 = i2;
        while (i13 < i12) {
            i9 = i13 + 1;
            int i14 = i8 - 1;
            iArr[i13] = (bArr[i8] * i11) + iArr[i13];
            i11 += i10;
            i13 = i9 + 1;
            int i15 = i14 - 1;
            iArr[i9] = iArr[i9] + (bArr[i14] * i11);
            i11 += i10;
            i8 = i13 + 1;
            i14 = i15 - 1;
            iArr[i13] = iArr[i13] + (bArr[i15] * i11);
            i11 += i10;
            iArr[i8] = iArr[i8] + (bArr[i14] * i11);
            i11 += i10;
            i13 = i8 + 1;
            i8 = i14 - 1;
        }
        while (i13 < i12 + 3) {
            iArr[i13] = iArr[i13] + (bArr[i8] * i11);
            i11 += i10;
            i13++;
            i8--;
        }
        hfVar.aj = i11 >> 2;
        hfVar.ad = i8 << 8;
        return i13;
    }

    static int bz(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, hf hfVar) {
        int i11;
        byte b;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = ((i10 >> 8) + i3) - i12;
        if (i17 <= i9) {
            i9 = i17;
        }
        hfVar.aj += hfVar.au * (i9 - i3);
        int i18 = i3 << 1;
        int i19 = (i9 << 1) - 6;
        i17 = i13;
        while (i18 < i19) {
            i13 = i12 + 1;
            byte b2 = bArr[i12];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b2 * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b2 * i14) + iArr[i11];
            i12 = i14 + i16;
            i14 = i13 + 1;
            b = bArr[i13];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i12) + iArr[i11];
            i12 += i16;
            i13 = i14 + 1;
            byte b3 = bArr[i14];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b3 * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b3 * i12) + iArr[i11];
            i14 = i12 + i16;
            i12 = i13 + 1;
            b = bArr[i13];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i14) + iArr[i11];
            i14 += i16;
        }
        while (i18 < i19 + 6) {
            b = bArr[i12];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i14) + iArr[i11];
            i14 += i16;
            i12++;
        }
        hfVar.ai = i17 >> 2;
        hfVar.ae = i14 >> 2;
        hfVar.ad = i12 << 8;
        return i18 >> 1;
    }

    public static hf ca(ht htVar, int i, int i2) {
        return (htVar.ar == null || htVar.ar.length == 0) ? null : new hf(htVar, (int) (((((long) htVar.aq) * 256) * ((long) i)) / ((long) (hd.ad * 1895484228))), i2 << 6);
    }

    static int cb(int i, int i2) {
        return i2 < 0 ? -i : (int) ((((double) i) * Math.sqrt(((double) i2) * 1.220703125E-4d)) + 0.5d);
    }

    static int ce(int i, int i2) {
        return i2 < 0 ? -i : (int) ((((double) i) * Math.sqrt(((double) i2) * 1.220703125E-4d)) + 0.5d);
    }

    static int ci(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (690217783 - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    /* JADX WARNING: Missing block: B:3:0x001b, code skipped:
            if (r1 > r21) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int cj(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, hf hfVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        hfVar.aj -= hfVar.au * i4;
        if (i12 != 0) {
            i14 = ((((i11 - i3) + i12) - 257) / i12) + i4;
        }
        i14 = i10;
        int i17 = i4 << 1;
        int i18 = i5;
        int i19 = i6;
        int i20 = i3;
        while (i17 < (i14 << 1)) {
            i15 = i20 >> 8;
            byte b = bArr[i15];
            i15 = ((bArr[i15 + 1] - b) * (i20 & 255)) + (b << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i18 += i7;
            i17 = i16 + 1;
            iArr[i16] = ((i15 * i19) >> 6) + iArr[i16];
            i19 += i8;
            i20 += i12;
        }
        if (i12 != 0) {
            i14 = ((((i11 - i20) + i12) - 1) / i12) + (i17 >> 1);
            if (i14 <= i10) {
                i10 = i14;
            }
        }
        while (i17 < (i10 << 1)) {
            byte b2 = bArr[i20 >> 8];
            i15 = (b2 << 8) + ((i13 - b2) * (i20 & 255));
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i14 = i18 + i7;
            i17 = i16 + 1;
            iArr[i16] = iArr[i16] + ((i15 * i19) >> 6);
            i19 += i8;
            i20 += i12;
            i18 = i14;
        }
        i14 = i17 >> 1;
        hfVar.aj += hfVar.au * i14;
        hfVar.ai = i18;
        hfVar.ae = i19;
        hfVar.ad = i20;
        return i14;
    }

    public static hf ck(ht htVar, int i, int i2, int i3) {
        return (htVar.ar == null || htVar.ar.length == 0) ? null : new hf(htVar, i, i2, i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0034 A:{LOOP_END, LOOP:0: B:5:0x0032->B:6:0x0034} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a A:{LOOP_END, LOOP:1: B:11:0x0066->B:13:0x006a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int cm(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        hfVar.ai -= hfVar.az * i4;
        hfVar.ae -= hfVar.ax * i4;
        if (i10 != 0) {
            i12 = i4 + ((((i9 + 256) - i3) + i10) / i10);
            if (i12 <= i8) {
                i13 = i5;
                i14 = i3;
                i15 = i4;
                while (i15 < i12) {
                    int i16 = i14 >> 8;
                    byte b = bArr[i16 - 1];
                    iArr[i15] = (((((bArr[i16] - b) * (i14 & 255)) + (b << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                if (i10 != 0) {
                    i12 = (((i9 - i14) + i10) / i10) + i15;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                while (i15 < i8) {
                    iArr[i15] = iArr[i15] + ((((i11 << 8) + ((bArr[i14 >> 8] - i11) * (i14 & 255))) * i13) >> 6);
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                hfVar.ai += hfVar.az * i15;
                hfVar.ae += hfVar.ax * i15;
                hfVar.aj = i13;
                hfVar.ad = i14;
                return i15;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i3;
        i15 = i4;
        while (i15 < i12) {
        }
        if (i10 != 0) {
        }
        while (i15 < i8) {
        }
        hfVar.ai += hfVar.az * i15;
        hfVar.ae += hfVar.ax * i15;
        hfVar.aj = i13;
        hfVar.ad = i14;
        return i15;
    }

    static int cn(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (16384 - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    public static hf co(ht htVar, int i, int i2, int i3) {
        return (htVar.ar == null || htVar.ar.length == 0) ? null : new hf(htVar, i, i2, i3);
    }

    static int cp(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (16384 - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    /* JADX WARNING: Missing block: B:3:0x001c, code skipped:
            if (r1 > r21) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int cq(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, hf hfVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        hfVar.aj -= hfVar.au * i4;
        if (i12 != 0) {
            i14 = ((((i11 + 256) - i3) + i12) / i12) + i4;
        }
        i14 = i10;
        int i17 = i4 << 1;
        int i18 = i5;
        int i19 = i6;
        int i20 = i3;
        while (i17 < (i14 << 1)) {
            i15 = i20 >> 8;
            byte b = bArr[i15 - 1];
            i15 = ((bArr[i15] - b) * (i20 & 255)) + (b << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i18 += i7;
            i17 = i16 + 1;
            iArr[i16] = ((i15 * i19) >> 6) + iArr[i16];
            i19 += i8;
            i20 += i12;
        }
        if (i12 != 0) {
            i14 = (((i11 - i20) + i12) / i12) + (i17 >> 1);
            if (i14 <= i10) {
                i10 = i14;
            }
        }
        while (i17 < (i10 << 1)) {
            i15 = ((bArr[i20 >> 8] - i13) * (i20 & 255)) + (i13 << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i14 = i18 + i7;
            i17 = i16 + 1;
            iArr[i16] = iArr[i16] + ((i15 * i19) >> 6);
            i19 += i8;
            i20 += i12;
            i18 = i14;
        }
        i14 = i17 >> 1;
        hfVar.aj += hfVar.au * i14;
        hfVar.ai = i18;
        hfVar.ae = i19;
        hfVar.ad = i20;
        return i14;
    }

    public static hf ct(ht htVar, int i, int i2, int i3) {
        return (htVar.ar == null || htVar.ar.length == 0) ? null : new hf(htVar, i, i2, i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0033 A:{LOOP_END, LOOP:0: B:5:0x0031->B:6:0x0033} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006b A:{LOOP_END, LOOP:1: B:11:0x0067->B:13:0x006b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int cv(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        hfVar.ai -= hfVar.az * i4;
        hfVar.ae -= hfVar.ax * i4;
        if (i10 != 0) {
            i12 = i4 + ((((i9 - i3) + i10) - 257) / i10);
            if (i12 <= i8) {
                i13 = i5;
                i14 = i3;
                i15 = i4;
                while (i15 < i12) {
                    int i16 = i14 >> 8;
                    byte b = bArr[i16];
                    iArr[i15] = (((((bArr[i16 + 1] - b) * (i14 & 255)) + (b << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i14) + i10) - 1) / i10) + i15;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                while (i15 < i8) {
                    byte b2 = bArr[i14 >> 8];
                    iArr[i15] = (((((i11 - b2) * (i14 & 255)) + (b2 << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                hfVar.ai += hfVar.az * i15;
                hfVar.ae += hfVar.ax * i15;
                hfVar.aj = i13;
                hfVar.ad = i14;
                return i15;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i3;
        i15 = i4;
        while (i15 < i12) {
        }
        if (i10 != 0) {
        }
        while (i15 < i8) {
        }
        hfVar.ai += hfVar.az * i15;
        hfVar.ae += hfVar.ax * i15;
        hfVar.aj = i13;
        hfVar.ad = i14;
        return i15;
    }

    static int cw(int i, int i2) {
        return i2 < 0 ? i : (int) ((((double) i) * Math.sqrt(((double) (-536070072 - i2)) * 1.220703125E-4d)) + 0.5d);
    }

    public static hf cx(ht htVar, int i, int i2) {
        return (htVar.ar == null || htVar.ar.length == 0) ? null : new hf(htVar, (int) (((((long) htVar.aq) * 256) * ((long) i)) / ((long) (hd.ad * 1895484228))), i2 << 6);
    }

    static int ef(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, hf hfVar) {
        int i7 = i >> 8;
        int i8 = i3 << 2;
        int i9 = ((i6 >> 8) + i2) - i7;
        if (i9 <= i5) {
            i5 = i9;
        }
        int i10 = i5 - 3;
        i9 = i2;
        while (i9 < i10) {
            int i11 = i9 + 1;
            int i12 = i7 + 1;
            iArr[i9] = (bArr[i7] * i8) + iArr[i9];
            i9 = i11 + 1;
            int i13 = i12 + 1;
            iArr[i11] = iArr[i11] + (bArr[i12] * i8);
            i7 = i9 + 1;
            i12 = i13 + 1;
            iArr[i9] = iArr[i9] + (bArr[i13] * i8);
            iArr[i7] = iArr[i7] + (bArr[i12] * i8);
            i9 = i7 + 1;
            i7 = i12 + 1;
        }
        while (i9 < i10 + 3) {
            iArr[i9] = iArr[i9] + (bArr[i7] * i8);
            i9++;
            i7++;
        }
        hfVar.ad = i7 << 8;
        return i9;
    }

    static int ej(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar) {
        int i9;
        byte b;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        int i14 = i3 << 1;
        int i15 = (i7 << 1) - 6;
        i13 = i10;
        while (i14 < i15) {
            i10 = i13 + 1;
            byte b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 + 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i10 = i13 + 1;
            b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 + 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
        }
        while (i14 < i15 + 6) {
            b = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i13++;
        }
        hfVar.ad = i13 << 8;
        return i14 >> 1;
    }

    static int em(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, hf hfVar) {
        int i7 = i >> 8;
        int i8 = i3 << 2;
        int i9 = ((i6 >> 8) + i2) - i7;
        if (i9 <= i5) {
            i5 = i9;
        }
        int i10 = i5 - 3;
        i9 = i2;
        while (i9 < i10) {
            int i11 = i9 + 1;
            int i12 = i7 + 1;
            iArr[i9] = (bArr[i7] * i8) + iArr[i9];
            i9 = i11 + 1;
            int i13 = i12 + 1;
            iArr[i11] = iArr[i11] + (bArr[i12] * i8);
            i7 = i9 + 1;
            i12 = i13 + 1;
            iArr[i9] = iArr[i9] + (bArr[i13] * i8);
            iArr[i7] = iArr[i7] + (bArr[i12] * i8);
            i9 = i7 + 1;
            i7 = i12 + 1;
        }
        while (i9 < i10 + 3) {
            iArr[i9] = iArr[i9] + (bArr[i7] * i8);
            i9++;
            i7++;
        }
        hfVar.ad = i7 << 8;
        return i9;
    }

    static int es(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar) {
        int i9;
        byte b;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        int i14 = i3 << 1;
        int i15 = (i7 << 1) - 6;
        i13 = i10;
        while (i14 < i15) {
            i10 = i13 + 1;
            byte b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 + 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i10 = i13 + 1;
            b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 + 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
        }
        while (i14 < i15 + 6) {
            b = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i13++;
        }
        hfVar.ad = i13 << 8;
        return i14 >> 1;
    }

    static int ex(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar) {
        int i9;
        byte b;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        int i14 = i3 << 1;
        int i15 = (i7 << 1) - 6;
        i13 = i10;
        while (i14 < i15) {
            i10 = i13 + 1;
            byte b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 + 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i10 = i13 + 1;
            b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 + 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
        }
        while (i14 < i15 + 6) {
            b = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i13++;
        }
        hfVar.ad = i13 << 8;
        return i14 >> 1;
    }

    static int fb(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, hf hfVar) {
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = i4 << 2;
        int i11 = ((i7 >> 8) + i2) - i8;
        if (i11 <= i6) {
            i6 = i11;
        }
        int i12 = i6 - i2;
        hfVar.ai += hfVar.az * i12;
        hfVar.ae += hfVar.ax * i12;
        i12 = i6 - 3;
        i11 = i9;
        int i13 = i2;
        while (i13 < i12) {
            i9 = i13 + 1;
            int i14 = i8 + 1;
            iArr[i13] = (bArr[i8] * i11) + iArr[i13];
            i11 += i10;
            i13 = i9 + 1;
            int i15 = i14 + 1;
            iArr[i9] = iArr[i9] + (bArr[i14] * i11);
            i11 += i10;
            i8 = i13 + 1;
            i14 = i15 + 1;
            iArr[i13] = iArr[i13] + (bArr[i15] * i11);
            i11 += i10;
            iArr[i8] = iArr[i8] + (bArr[i14] * i11);
            i11 += i10;
            i13 = i8 + 1;
            i8 = i14 + 1;
        }
        while (i13 < i12 + 3) {
            iArr[i13] = iArr[i13] + (bArr[i8] * i11);
            i11 += i10;
            i13++;
            i8++;
        }
        hfVar.aj = i11 >> 2;
        hfVar.ad = i8 << 8;
        return i13;
    }

    static int fc(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, hf hfVar) {
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = i4 << 2;
        int i11 = ((i7 >> 8) + i2) - i8;
        if (i11 <= i6) {
            i6 = i11;
        }
        int i12 = i6 - i2;
        hfVar.ai += hfVar.az * i12;
        hfVar.ae += hfVar.ax * i12;
        i12 = i6 - 3;
        i11 = i9;
        int i13 = i2;
        while (i13 < i12) {
            i9 = i13 + 1;
            int i14 = i8 + 1;
            iArr[i13] = (bArr[i8] * i11) + iArr[i13];
            i11 += i10;
            i13 = i9 + 1;
            int i15 = i14 + 1;
            iArr[i9] = iArr[i9] + (bArr[i14] * i11);
            i11 += i10;
            i8 = i13 + 1;
            i14 = i15 + 1;
            iArr[i13] = iArr[i13] + (bArr[i15] * i11);
            i11 += i10;
            iArr[i8] = iArr[i8] + (bArr[i14] * i11);
            i11 += i10;
            i13 = i8 + 1;
            i8 = i14 + 1;
        }
        while (i13 < i12 + 3) {
            iArr[i13] = iArr[i13] + (bArr[i8] * i11);
            i11 += i10;
            i13++;
            i8++;
        }
        hfVar.aj = i11 >> 2;
        hfVar.ad = i8 << 8;
        return i13;
    }

    static int fe(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, hf hfVar) {
        int i8 = i >> 8;
        int i9 = i3 << 2;
        int i10 = i4 << 2;
        int i11 = (i2 + i8) - ((i7 >> 8) - 1);
        if (i11 <= i6) {
            i6 = i11;
        }
        int i12 = i6 - i2;
        hfVar.ai += hfVar.az * i12;
        hfVar.ae += hfVar.ax * i12;
        i12 = i6 - 3;
        i11 = i9;
        int i13 = i2;
        while (i13 < i12) {
            i9 = i13 + 1;
            int i14 = i8 - 1;
            iArr[i13] = (bArr[i8] * i11) + iArr[i13];
            i11 += i10;
            i13 = i9 + 1;
            int i15 = i14 - 1;
            iArr[i9] = iArr[i9] + (bArr[i14] * i11);
            i11 += i10;
            i8 = i13 + 1;
            i14 = i15 - 1;
            iArr[i13] = iArr[i13] + (bArr[i15] * i11);
            i11 += i10;
            iArr[i8] = iArr[i8] + (bArr[i14] * i11);
            i11 += i10;
            i13 = i8 + 1;
            i8 = i14 - 1;
        }
        while (i13 < i12 + 3) {
            iArr[i13] = iArr[i13] + (bArr[i8] * i11);
            i11 += i10;
            i13++;
            i8--;
        }
        hfVar.aj = i11 >> 2;
        hfVar.ad = i8 << 8;
        return i13;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017 A:{LOOP_END, LOOP:0: B:4:0x0015->B:5:0x0017} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0048 A:{LOOP_END, LOOP:1: B:9:0x0044->B:11:0x0048} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fg(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 + 256) - i3) + i9) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14 - 1];
                    iArr[i12] = (((((bArr[i14] - b) * (1731616823 & i13)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12++;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = (((i8 - i13) + i9) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                while (i12 < i7) {
                    iArr[i12] = iArr[i12] + ((((i10 << 8) + ((bArr[i13 >> 8] - i10) * (-2037907104 & i13))) * i5) >> 6);
                    i13 += i9;
                    i12++;
                }
                hfVar.ad = i13;
                return i12;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
        }
        if (i9 != 0) {
        }
        while (i12 < i7) {
        }
        hfVar.ad = i13;
        return i12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016 A:{LOOP_END, LOOP:0: B:4:0x0014->B:5:0x0016} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A:{LOOP_END, LOOP:1: B:9:0x0043->B:11:0x0047} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fh(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12++;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                while (i12 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    iArr[i12] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
                    i13 += i9;
                    i12++;
                }
                hfVar.ad = i13;
                return i12;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
        }
        if (i9 != 0) {
        }
        while (i12 < i7) {
        }
        hfVar.ad = i13;
        return i12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A:{LOOP_END, LOOP:1: B:12:0x0050->B:14:0x0054} */
    /* JADX WARNING: Missing block: B:2:0x000e, code skipped:
            if (r1 > r17) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fi(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 != 0) {
            i12 = ((((i9 + 256) - i3) + i10) / i10) + i4;
        }
        i12 = i8;
        int i15 = i4 << 1;
        int i16 = i3;
        while (i15 < (i12 << 1)) {
            i13 = i16 >> 8;
            byte b = bArr[i13 - 1];
            i13 = ((bArr[i13] - b) * (i16 & 255)) + (b << 8);
            i14 = i15 + 1;
            iArr[i15] = iArr[i15] + ((i13 * i5) >> 6);
            i15 = i14 + 1;
            iArr[i14] = ((i13 * i6) >> 6) + iArr[i14];
            i16 += i10;
        }
        if (i10 != 0) {
            i13 = (((i9 - i16) + i10) / i10) + (i15 >> 1);
            if (i13 <= i8) {
                i12 = i16;
                i8 = i13;
                while (i15 < (i8 << 1)) {
                    i13 = ((bArr[i12 >> 8] - i11) * (i12 & 255)) + (i11 << 8);
                    i14 = i15 + 1;
                    iArr[i15] = iArr[i15] + ((i13 * i5) >> 6);
                    i16 = i14 + 1;
                    iArr[i14] = ((i13 * i6) >> 6) + iArr[i14];
                    i12 += i10;
                    i15 = i16;
                }
                hfVar.ad = i12;
                return i15 >> 1;
            }
        }
        i12 = i16;
        while (i15 < (i8 << 1)) {
        }
        hfVar.ad = i12;
        return i15 >> 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A:{LOOP_END, LOOP:1: B:12:0x0050->B:14:0x0054} */
    /* JADX WARNING: Missing block: B:2:0x000e, code skipped:
            if (r1 > r17) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fj(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 != 0) {
            i12 = ((((i9 + 256) - i3) + i10) / i10) + i4;
        }
        i12 = i8;
        int i15 = i4 << 1;
        int i16 = i3;
        while (i15 < (i12 << 1)) {
            i13 = i16 >> 8;
            byte b = bArr[i13 - 1];
            i13 = ((bArr[i13] - b) * (i16 & 255)) + (b << 8);
            i14 = i15 + 1;
            iArr[i15] = iArr[i15] + ((i13 * i5) >> 6);
            i15 = i14 + 1;
            iArr[i14] = ((i13 * i6) >> 6) + iArr[i14];
            i16 += i10;
        }
        if (i10 != 0) {
            i13 = (((i9 - i16) + i10) / i10) + (i15 >> 1);
            if (i13 <= i8) {
                i12 = i16;
                i8 = i13;
                while (i15 < (i8 << 1)) {
                    i13 = ((bArr[i12 >> 8] - i11) * (i12 & 255)) + (i11 << 8);
                    i14 = i15 + 1;
                    iArr[i15] = iArr[i15] + ((i13 * i5) >> 6);
                    i16 = i14 + 1;
                    iArr[i14] = ((i13 * i6) >> 6) + iArr[i14];
                    i12 += i10;
                    i15 = i16;
                }
                hfVar.ad = i12;
                return i15 >> 1;
            }
        }
        i12 = i16;
        while (i15 < (i8 << 1)) {
        }
        hfVar.ad = i12;
        return i15 >> 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0033 A:{LOOP_END, LOOP:0: B:5:0x0031->B:6:0x0033} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006b A:{LOOP_END, LOOP:1: B:11:0x0067->B:13:0x006b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fk(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        hfVar.ai -= hfVar.az * i4;
        hfVar.ae -= hfVar.ax * i4;
        if (i10 != 0) {
            i12 = i4 + ((((i9 - i3) + i10) - 257) / i10);
            if (i12 <= i8) {
                i13 = i5;
                i14 = i3;
                i15 = i4;
                while (i15 < i12) {
                    int i16 = i14 >> 8;
                    byte b = bArr[i16];
                    iArr[i15] = (((((bArr[i16 + 1] - b) * (i14 & 255)) + (b << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i14) + i10) - 1) / i10) + i15;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                while (i15 < i8) {
                    byte b2 = bArr[i14 >> 8];
                    iArr[i15] = (((((i11 - b2) * (i14 & 255)) + (b2 << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                hfVar.ai += hfVar.az * i15;
                hfVar.ae += hfVar.ax * i15;
                hfVar.aj = i13;
                hfVar.ad = i14;
                return i15;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i3;
        i15 = i4;
        while (i15 < i12) {
        }
        if (i10 != 0) {
        }
        while (i15 < i8) {
        }
        hfVar.ai += hfVar.az * i15;
        hfVar.ae += hfVar.ax * i15;
        hfVar.aj = i13;
        hfVar.ad = i14;
        return i15;
    }

    static int fl(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, hf hfVar) {
        int i11;
        byte b;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = (i3 + i12) - ((i10 >> 8) - 1);
        if (i17 <= i9) {
            i9 = i17;
        }
        hfVar.aj += hfVar.au * (i9 - i3);
        int i18 = i3 << 1;
        int i19 = (i9 << 1) - 6;
        i17 = i13;
        while (i18 < i19) {
            i13 = i12 - 1;
            byte b2 = bArr[i12];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b2 * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b2 * i14) + iArr[i11];
            i12 = i14 + i16;
            i14 = i13 - 1;
            b = bArr[i13];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i12) + iArr[i11];
            i12 += i16;
            i13 = i14 - 1;
            byte b3 = bArr[i14];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b3 * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b3 * i12) + iArr[i11];
            i14 = i12 + i16;
            i12 = i13 - 1;
            b = bArr[i13];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i14) + iArr[i11];
            i14 += i16;
        }
        while (i18 < i19 + 6) {
            b = bArr[i12];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i14) + iArr[i11];
            i14 += i16;
            i12--;
        }
        hfVar.ai = i17 >> 2;
        hfVar.ae = i14 >> 2;
        hfVar.ad = i12 << 8;
        return i18 >> 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016 A:{LOOP_END, LOOP:0: B:4:0x0014->B:5:0x0016} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A:{LOOP_END, LOOP:1: B:9:0x0043->B:11:0x0047} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fm(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12++;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                while (i12 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    iArr[i12] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
                    i13 += i9;
                    i12++;
                }
                hfVar.ad = i13;
                return i12;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
        }
        if (i9 != 0) {
        }
        while (i12 < i7) {
        }
        hfVar.ad = i13;
        return i12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0018 A:{LOOP_END, LOOP:0: B:4:0x0016->B:5:0x0018} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b A:{LOOP_END, LOOP:1: B:9:0x0047->B:11:0x004b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fn(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) + 2036346206) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (1565696432 & i13)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12++;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                while (i12 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    iArr[i12] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
                    i13 += i9;
                    i12++;
                }
                hfVar.ad = i13;
                return i12;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
        }
        if (i9 != 0) {
        }
        while (i12 < i7) {
        }
        hfVar.ad = i13;
        return i12;
    }

    static int fo(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, hf hfVar) {
        int i11;
        byte b;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = ((i10 >> 8) + i3) - i12;
        if (i17 <= i9) {
            i9 = i17;
        }
        hfVar.aj += hfVar.au * (i9 - i3);
        int i18 = i3 << 1;
        int i19 = (i9 << 1) - 6;
        i17 = i13;
        while (i18 < i19) {
            i13 = i12 + 1;
            byte b2 = bArr[i12];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b2 * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b2 * i14) + iArr[i11];
            i12 = i14 + i16;
            i14 = i13 + 1;
            b = bArr[i13];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i12) + iArr[i11];
            i12 += i16;
            i13 = i14 + 1;
            byte b3 = bArr[i14];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b3 * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b3 * i12) + iArr[i11];
            i14 = i12 + i16;
            i12 = i13 + 1;
            b = bArr[i13];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i14) + iArr[i11];
            i14 += i16;
        }
        while (i18 < i19 + 6) {
            b = bArr[i12];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i14) + iArr[i11];
            i14 += i16;
            i12++;
        }
        hfVar.ai = i17 >> 2;
        hfVar.ae = i14 >> 2;
        hfVar.ad = i12 << 8;
        return i18 >> 1;
    }

    static int fp(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, hf hfVar) {
        int i11;
        byte b;
        int i12 = i2 >> 8;
        int i13 = i4 << 2;
        int i14 = i5 << 2;
        int i15 = i6 << 2;
        int i16 = i7 << 2;
        int i17 = ((i10 >> 8) + i3) - i12;
        if (i17 <= i9) {
            i9 = i17;
        }
        hfVar.aj += hfVar.au * (i9 - i3);
        int i18 = i3 << 1;
        int i19 = (i9 << 1) - 6;
        i17 = i13;
        while (i18 < i19) {
            i13 = i12 + 1;
            byte b2 = bArr[i12];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b2 * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b2 * i14) + iArr[i11];
            i12 = i14 + i16;
            i14 = i13 + 1;
            b = bArr[i13];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i12) + iArr[i11];
            i12 += i16;
            i13 = i14 + 1;
            byte b3 = bArr[i14];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b3 * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b3 * i12) + iArr[i11];
            i14 = i12 + i16;
            i12 = i13 + 1;
            b = bArr[i13];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i14) + iArr[i11];
            i14 += i16;
        }
        while (i18 < i19 + 6) {
            b = bArr[i12];
            i11 = i18 + 1;
            iArr[i18] = iArr[i18] + (b * i17);
            i17 += i15;
            i18 = i11 + 1;
            iArr[i11] = (b * i14) + iArr[i11];
            i14 += i16;
            i12++;
        }
        hfVar.ai = i17 >> 2;
        hfVar.ae = i14 >> 2;
        hfVar.ad = i12 << 8;
        return i18 >> 1;
    }

    static int fq(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar) {
        int i9;
        byte b;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = ((i8 >> 8) + i3) - i10;
        if (i13 <= i7) {
            i7 = i13;
        }
        int i14 = i3 << 1;
        int i15 = (i7 << 1) - 6;
        i13 = i10;
        while (i14 < i15) {
            i10 = i13 + 1;
            byte b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 + 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i10 = i13 + 1;
            b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 + 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
        }
        while (i14 < i15 + 6) {
            b = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i13++;
        }
        hfVar.ad = i13 << 8;
        return i14 >> 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016 A:{LOOP_END, LOOP:0: B:4:0x0014->B:5:0x0016} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A:{LOOP_END, LOOP:1: B:9:0x0043->B:11:0x0047} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fs(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 != 0) {
            i11 = ((((i8 - i3) + i9) - 257) / i9) + i4;
            if (i11 <= i7) {
                i12 = i4;
                i13 = i3;
                while (i12 < i11) {
                    int i14 = i13 >> 8;
                    byte b = bArr[i14];
                    iArr[i12] = (((((bArr[i14 + 1] - b) * (i13 & 255)) + (b << 8)) * i5) >> 6) + iArr[i12];
                    i12++;
                    i13 += i9;
                }
                if (i9 != 0) {
                    i11 = ((((i8 - i13) + i9) - 1) / i9) + i12;
                    if (i11 <= i7) {
                        i7 = i11;
                    }
                }
                while (i12 < i7) {
                    byte b2 = bArr[i13 >> 8];
                    iArr[i12] = (((((i10 - b2) * (i13 & 255)) + (b2 << 8)) * i5) >> 6) + iArr[i12];
                    i13 += i9;
                    i12++;
                }
                hfVar.ad = i13;
                return i12;
            }
        }
        i11 = i7;
        i12 = i4;
        i13 = i3;
        while (i12 < i11) {
        }
        if (i9 != 0) {
        }
        while (i12 < i7) {
        }
        hfVar.ad = i13;
        return i12;
    }

    static int ft(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, hf hfVar) {
        int i7 = i >> 8;
        int i8 = i3 << 2;
        int i9 = (i2 + i7) - ((i6 >> 8) - 1);
        if (i9 <= i5) {
            i5 = i9;
        }
        int i10 = i5 - 3;
        i9 = i2;
        while (i9 < i10) {
            int i11 = i9 + 1;
            int i12 = i7 - 1;
            iArr[i9] = (bArr[i7] * i8) + iArr[i9];
            i9 = i11 + 1;
            int i13 = i12 - 1;
            iArr[i11] = iArr[i11] + (bArr[i12] * i8);
            i7 = i9 + 1;
            i12 = i13 - 1;
            iArr[i9] = iArr[i9] + (bArr[i13] * i8);
            iArr[i7] = iArr[i7] + (bArr[i12] * i8);
            i9 = i7 + 1;
            i7 = i12 - 1;
        }
        while (i9 < i10 + 3) {
            iArr[i9] = iArr[i9] + (bArr[i7] * i8);
            i9++;
            i7--;
        }
        hfVar.ad = i7 << 8;
        return i9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056 A:{LOOP_END, LOOP:1: B:12:0x0052->B:14:0x0056} */
    /* JADX WARNING: Missing block: B:2:0x000e, code skipped:
            if (r1 > r17) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int fu(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 != 0) {
            i12 = ((((i9 + 256) - i3) + i10) / i10) + i4;
        }
        i12 = i8;
        int i15 = i4 << 1;
        int i16 = i3;
        while (i15 < (i12 << 1)) {
            i13 = i16 >> 8;
            byte b = bArr[i13 - 1];
            i13 = ((bArr[i13] - b) * (-1805985425 & i16)) + (b << 8);
            i14 = i15 + 1;
            iArr[i15] = iArr[i15] + ((i13 * i5) >> 6);
            i15 = i14 + 1;
            iArr[i14] = ((i13 * i6) >> 6) + iArr[i14];
            i16 += i10;
        }
        if (i10 != 0) {
            i13 = (((i9 - i16) + i10) / i10) + (i15 >> 1);
            if (i13 <= i8) {
                i12 = i16;
                i8 = i13;
                while (i15 < (i8 << 1)) {
                    i13 = ((bArr[i12 >> 8] - i11) * (-76194433 & i12)) + (i11 << 8);
                    i14 = i15 + 1;
                    iArr[i15] = iArr[i15] + ((i13 * i5) >> 6);
                    i16 = i14 + 1;
                    iArr[i14] = ((i13 * i6) >> 6) + iArr[i14];
                    i12 += i10;
                    i15 = i16;
                }
                hfVar.ad = i12;
                return i15 >> 1;
            }
        }
        i12 = i16;
        while (i15 < (i8 << 1)) {
        }
        hfVar.ad = i12;
        return i15 >> 1;
    }

    static int fw(int i, byte[] bArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, hf hfVar) {
        int i9;
        byte b;
        int i10 = i2 >> 8;
        int i11 = i4 << 2;
        int i12 = i5 << 2;
        int i13 = (i3 + i10) - ((i8 >> 8) - 1);
        if (i13 <= i7) {
            i7 = i13;
        }
        int i14 = i3 << 1;
        int i15 = (i7 << 1) - 6;
        i13 = i10;
        while (i14 < i15) {
            i10 = i13 - 1;
            byte b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 - 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i10 = i13 - 1;
            b2 = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b2 * i11);
            i14 = i9 + 1;
            iArr[i9] = (b2 * i12) + iArr[i9];
            i13 = i10 - 1;
            b = bArr[i10];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
        }
        while (i14 < i15 + 6) {
            b = bArr[i13];
            i9 = i14 + 1;
            iArr[i14] = iArr[i14] + (b * i11);
            i14 = i9 + 1;
            iArr[i9] = (b * i12) + iArr[i9];
            i13--;
        }
        hfVar.ad = i13 << 8;
        return i14 >> 1;
    }

    static int fx(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, hf hfVar) {
        int i7 = i >> 8;
        int i8 = i3 << 2;
        int i9 = (i2 + i7) - ((i6 >> 8) - 1);
        if (i9 <= i5) {
            i5 = i9;
        }
        int i10 = i5 - 3;
        i9 = i2;
        while (i9 < i10) {
            int i11 = i9 + 1;
            int i12 = i7 - 1;
            iArr[i9] = (bArr[i7] * i8) + iArr[i9];
            i9 = i11 + 1;
            int i13 = i12 - 1;
            iArr[i11] = iArr[i11] + (bArr[i12] * i8);
            i7 = i9 + 1;
            i12 = i13 - 1;
            iArr[i9] = iArr[i9] + (bArr[i13] * i8);
            iArr[i7] = iArr[i7] + (bArr[i12] * i8);
            i9 = i7 + 1;
            i7 = i12 - 1;
        }
        while (i9 < i10 + 3) {
            iArr[i9] = iArr[i9] + (bArr[i7] * i8);
            i9++;
            i7--;
        }
        hfVar.ad = i7 << 8;
        return i9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0033 A:{LOOP_END, LOOP:0: B:5:0x0031->B:6:0x0033} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006b A:{LOOP_END, LOOP:1: B:11:0x0067->B:13:0x006b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gc(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        hfVar.ai -= hfVar.az * i4;
        hfVar.ae -= hfVar.ax * i4;
        if (i10 != 0) {
            i12 = i4 + ((((i9 - i3) + i10) - 257) / i10);
            if (i12 <= i8) {
                i13 = i5;
                i14 = i3;
                i15 = i4;
                while (i15 < i12) {
                    int i16 = i14 >> 8;
                    byte b = bArr[i16];
                    iArr[i15] = (((((bArr[i16 + 1] - b) * (i14 & 255)) + (b << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i14) + i10) - 1) / i10) + i15;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                while (i15 < i8) {
                    byte b2 = bArr[i14 >> 8];
                    iArr[i15] = (((((i11 - b2) * (i14 & 255)) + (b2 << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                hfVar.ai += hfVar.az * i15;
                hfVar.ae += hfVar.ax * i15;
                hfVar.aj = i13;
                hfVar.ad = i14;
                return i15;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i3;
        i15 = i4;
        while (i15 < i12) {
        }
        if (i10 != 0) {
        }
        while (i15 < i8) {
        }
        hfVar.ai += hfVar.az * i15;
        hfVar.ae += hfVar.ax * i15;
        hfVar.aj = i13;
        hfVar.ad = i14;
        return i15;
    }

    /* JADX WARNING: Missing block: B:3:0x001d, code skipped:
            if (r1 > r21) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int ge(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, hf hfVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        hfVar.aj -= hfVar.au * i4;
        if (i12 != 0) {
            i14 = ((((i11 - 1424756387) - i3) + i12) / i12) + i4;
        }
        i14 = i10;
        int i17 = i4 << 1;
        int i18 = i5;
        int i19 = i6;
        int i20 = i3;
        while (i17 < (i14 << 1)) {
            i15 = i20 >> 8;
            byte b = bArr[i15 - 1];
            i15 = ((bArr[i15] - b) * (59355445 & i20)) + (b << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i18 += i7;
            i17 = i16 + 1;
            iArr[i16] = ((i15 * i19) >> 6) + iArr[i16];
            i19 += i8;
            i20 += i12;
        }
        if (i12 != 0) {
            i14 = (((i11 - i20) + i12) / i12) + (i17 >> 1);
            if (i14 <= i10) {
                i10 = i14;
            }
        }
        while (i17 < (i10 << 1)) {
            i15 = ((bArr[i20 >> 8] - i13) * (i20 & 255)) + (i13 << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i14 = i18 + i7;
            i17 = i16 + 1;
            iArr[i16] = iArr[i16] + ((i15 * i19) >> 6);
            i19 += i8;
            i20 += i12;
            i18 = i14;
        }
        i14 = i17 >> 1;
        hfVar.aj += hfVar.au * i14;
        hfVar.ai = i18;
        hfVar.ae = i19;
        hfVar.ad = i20;
        return i14;
    }

    /* JADX WARNING: Missing block: B:3:0x001b, code skipped:
            if (r1 > r21) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gh(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, hf hfVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        hfVar.aj -= hfVar.au * i4;
        if (i12 != 0) {
            i14 = ((((i11 - i3) + i12) - 257) / i12) + i4;
        }
        i14 = i10;
        int i17 = i4 << 1;
        int i18 = i5;
        int i19 = i6;
        int i20 = i3;
        while (i17 < (i14 << 1)) {
            i15 = i20 >> 8;
            byte b = bArr[i15];
            i15 = ((bArr[i15 + 1] - b) * (i20 & 255)) + (b << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i18 += i7;
            i17 = i16 + 1;
            iArr[i16] = ((i15 * i19) >> 6) + iArr[i16];
            i19 += i8;
            i20 += i12;
        }
        if (i12 != 0) {
            i14 = ((((i11 - i20) + i12) - 1) / i12) + (i17 >> 1);
            if (i14 <= i10) {
                i10 = i14;
            }
        }
        while (i17 < (i10 << 1)) {
            byte b2 = bArr[i20 >> 8];
            i15 = (b2 << 8) + ((i13 - b2) * (-839502636 & i20));
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i14 = i18 + i7;
            i17 = i16 + 1;
            iArr[i16] = iArr[i16] + ((i15 * i19) >> 6);
            i19 += i8;
            i20 += i12;
            i18 = i14;
        }
        i14 = i17 >> 1;
        hfVar.aj += hfVar.au * i14;
        hfVar.ai = i18;
        hfVar.ae = i19;
        hfVar.ad = i20;
        return i14;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0034 A:{LOOP_END, LOOP:0: B:5:0x0032->B:6:0x0034} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a A:{LOOP_END, LOOP:1: B:11:0x0066->B:13:0x006a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gi(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        hfVar.ai -= hfVar.az * i4;
        hfVar.ae -= hfVar.ax * i4;
        if (i10 != 0) {
            i12 = i4 + ((((i9 + 256) - i3) + i10) / i10);
            if (i12 <= i8) {
                i13 = i5;
                i14 = i3;
                i15 = i4;
                while (i15 < i12) {
                    int i16 = i14 >> 8;
                    byte b = bArr[i16 - 1];
                    iArr[i15] = (((((bArr[i16] - b) * (i14 & 255)) + (b << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                if (i10 != 0) {
                    i12 = (((i9 - i14) + i10) / i10) + i15;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                while (i15 < i8) {
                    iArr[i15] = iArr[i15] + ((((i11 << 8) + ((bArr[i14 >> 8] - i11) * (i14 & 255))) * i13) >> 6);
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                hfVar.ai += hfVar.az * i15;
                hfVar.ae += hfVar.ax * i15;
                hfVar.aj = i13;
                hfVar.ad = i14;
                return i15;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i3;
        i15 = i4;
        while (i15 < i12) {
        }
        if (i10 != 0) {
        }
        while (i15 < i8) {
        }
        hfVar.ai += hfVar.az * i15;
        hfVar.ae += hfVar.ax * i15;
        hfVar.aj = i13;
        hfVar.ad = i14;
        return i15;
    }

    /* JADX WARNING: Missing block: B:3:0x001b, code skipped:
            if (r1 > r21) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gl(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, hf hfVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        hfVar.aj -= hfVar.au * i4;
        if (i12 != 0) {
            i14 = ((((i11 - i3) + i12) - 257) / i12) + i4;
        }
        i14 = i10;
        int i17 = i4 << 1;
        int i18 = i5;
        int i19 = i6;
        int i20 = i3;
        while (i17 < (i14 << 1)) {
            i15 = i20 >> 8;
            byte b = bArr[i15];
            i15 = ((bArr[i15 + 1] - b) * (i20 & 255)) + (b << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i18 += i7;
            i17 = i16 + 1;
            iArr[i16] = ((i15 * i19) >> 6) + iArr[i16];
            i19 += i8;
            i20 += i12;
        }
        if (i12 != 0) {
            i14 = ((((i11 - i20) + i12) - 1) / i12) + (i17 >> 1);
            if (i14 <= i10) {
                i10 = i14;
            }
        }
        while (i17 < (i10 << 1)) {
            byte b2 = bArr[i20 >> 8];
            i15 = (b2 << 8) + ((i13 - b2) * (i20 & 255));
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i14 = i18 + i7;
            i17 = i16 + 1;
            iArr[i16] = iArr[i16] + ((i15 * i19) >> 6);
            i19 += i8;
            i20 += i12;
            i18 = i14;
        }
        i14 = i17 >> 1;
        hfVar.aj += hfVar.au * i14;
        hfVar.ai = i18;
        hfVar.ae = i19;
        hfVar.ad = i20;
        return i14;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0034 A:{LOOP_END, LOOP:0: B:5:0x0032->B:6:0x0034} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a A:{LOOP_END, LOOP:1: B:11:0x0066->B:13:0x006a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gn(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        hfVar.ai -= hfVar.az * i4;
        hfVar.ae -= hfVar.ax * i4;
        if (i10 != 0) {
            i12 = i4 + ((((i9 + 256) - i3) + i10) / i10);
            if (i12 <= i8) {
                i13 = i5;
                i14 = i3;
                i15 = i4;
                while (i15 < i12) {
                    int i16 = i14 >> 8;
                    byte b = bArr[i16 - 1];
                    iArr[i15] = (((((bArr[i16] - b) * (i14 & 255)) + (b << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                if (i10 != 0) {
                    i12 = (((i9 - i14) + i10) / i10) + i15;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                while (i15 < i8) {
                    iArr[i15] = iArr[i15] + ((((i11 << 8) + ((bArr[i14 >> 8] - i11) * (i14 & 255))) * i13) >> 6);
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                hfVar.ai += hfVar.az * i15;
                hfVar.ae += hfVar.ax * i15;
                hfVar.aj = i13;
                hfVar.ad = i14;
                return i15;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i3;
        i15 = i4;
        while (i15 < i12) {
        }
        if (i10 != 0) {
        }
        while (i15 < i8) {
        }
        hfVar.ai += hfVar.az * i15;
        hfVar.ae += hfVar.ax * i15;
        hfVar.aj = i13;
        hfVar.ad = i14;
        return i15;
    }

    /* JADX WARNING: Missing block: B:3:0x001b, code skipped:
            if (r1 > r21) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int go(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, hf hfVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        hfVar.aj -= hfVar.au * i4;
        if (i12 != 0) {
            i14 = ((((i11 - i3) + i12) - 257) / i12) + i4;
        }
        i14 = i10;
        int i17 = i4 << 1;
        int i18 = i5;
        int i19 = i6;
        int i20 = i3;
        while (i17 < (i14 << 1)) {
            i15 = i20 >> 8;
            byte b = bArr[i15];
            i15 = ((bArr[i15 + 1] - b) * (i20 & 255)) + (b << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i18 += i7;
            i17 = i16 + 1;
            iArr[i16] = ((i15 * i19) >> 6) + iArr[i16];
            i19 += i8;
            i20 += i12;
        }
        if (i12 != 0) {
            i14 = ((((i11 - i20) + i12) - 1) / i12) + (i17 >> 1);
            if (i14 <= i10) {
                i10 = i14;
            }
        }
        while (i17 < (i10 << 1)) {
            byte b2 = bArr[i20 >> 8];
            i15 = (b2 << 8) + ((i13 - b2) * (i20 & 255));
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i14 = i18 + i7;
            i17 = i16 + 1;
            iArr[i16] = iArr[i16] + ((i15 * i19) >> 6);
            i19 += i8;
            i20 += i12;
            i18 = i14;
        }
        i14 = i17 >> 1;
        hfVar.aj += hfVar.au * i14;
        hfVar.ai = i18;
        hfVar.ae = i19;
        hfVar.ad = i20;
        return i14;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0035 A:{LOOP_END, LOOP:0: B:5:0x0033->B:6:0x0035} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006d A:{LOOP_END, LOOP:1: B:11:0x0069->B:13:0x006d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gp(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        hfVar.ai -= hfVar.az * i4;
        hfVar.ae -= hfVar.ax * i4;
        if (i10 != 0) {
            i12 = i4 + ((((i9 - i3) + i10) + 726652116) / i10);
            if (i12 <= i8) {
                i13 = i5;
                i14 = i3;
                i15 = i4;
                while (i15 < i12) {
                    int i16 = i14 >> 8;
                    byte b = bArr[i16];
                    iArr[i15] = (((((bArr[i16 + 1] - b) * (i14 & 255)) + (b << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i14) + i10) - 1) / i10) + i15;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                while (i15 < i8) {
                    byte b2 = bArr[i14 >> 8];
                    iArr[i15] = (((((i11 - b2) * (-495223713 & i14)) + (b2 << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                hfVar.ai += hfVar.az * i15;
                hfVar.ae += hfVar.ax * i15;
                hfVar.aj = i13;
                hfVar.ad = i14;
                return i15;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i3;
        i15 = i4;
        while (i15 < i12) {
        }
        if (i10 != 0) {
        }
        while (i15 < i8) {
        }
        hfVar.ai += hfVar.az * i15;
        hfVar.ae += hfVar.ax * i15;
        hfVar.aj = i13;
        hfVar.ad = i14;
        return i15;
    }

    /* JADX WARNING: Missing block: B:3:0x001c, code skipped:
            if (r1 > r21) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gs(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, hf hfVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        hfVar.aj -= hfVar.au * i4;
        if (i12 != 0) {
            i14 = ((((i11 + 256) - i3) + i12) / i12) + i4;
        }
        i14 = i10;
        int i17 = i4 << 1;
        int i18 = i5;
        int i19 = i6;
        int i20 = i3;
        while (i17 < (i14 << 1)) {
            i15 = i20 >> 8;
            byte b = bArr[i15 - 1];
            i15 = ((bArr[i15] - b) * (-259956371 & i20)) + (b << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i18 += i7;
            i17 = i16 + 1;
            iArr[i16] = ((i15 * i19) >> 6) + iArr[i16];
            i19 += i8;
            i20 += i12;
        }
        if (i12 != 0) {
            i14 = (((i11 - i20) + i12) / i12) + (i17 >> 1);
            if (i14 <= i10) {
                i10 = i14;
            }
        }
        while (i17 < (i10 << 1)) {
            i15 = ((bArr[i20 >> 8] - i13) * (1725028956 & i20)) + (i13 << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i14 = i18 + i7;
            i17 = i16 + 1;
            iArr[i16] = iArr[i16] + ((i15 * i19) >> 6);
            i19 += i8;
            i20 += i12;
            i18 = i14;
        }
        i14 = i17 >> 1;
        hfVar.aj += hfVar.au * i14;
        hfVar.ai = i18;
        hfVar.ae = i19;
        hfVar.ad = i20;
        return i14;
    }

    /* JADX WARNING: Missing block: B:3:0x001c, code skipped:
            if (r1 > r21) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gu(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, hf hfVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        hfVar.aj -= hfVar.au * i4;
        if (i12 != 0) {
            i14 = ((((i11 + 256) - i3) + i12) / i12) + i4;
        }
        i14 = i10;
        int i17 = i4 << 1;
        int i18 = i5;
        int i19 = i6;
        int i20 = i3;
        while (i17 < (i14 << 1)) {
            i15 = i20 >> 8;
            byte b = bArr[i15 - 1];
            i15 = ((bArr[i15] - b) * (i20 & 255)) + (b << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i18 += i7;
            i17 = i16 + 1;
            iArr[i16] = ((i15 * i19) >> 6) + iArr[i16];
            i19 += i8;
            i20 += i12;
        }
        if (i12 != 0) {
            i14 = (((i11 - i20) + i12) / i12) + (i17 >> 1);
            if (i14 <= i10) {
                i10 = i14;
            }
        }
        while (i17 < (i10 << 1)) {
            i15 = ((bArr[i20 >> 8] - i13) * (i20 & 255)) + (i13 << 8);
            i16 = i17 + 1;
            iArr[i17] = iArr[i17] + ((i15 * i18) >> 6);
            i14 = i18 + i7;
            i17 = i16 + 1;
            iArr[i16] = iArr[i16] + ((i15 * i19) >> 6);
            i19 += i8;
            i20 += i12;
            i18 = i14;
        }
        i14 = i17 >> 1;
        hfVar.aj += hfVar.au * i14;
        hfVar.ai = i18;
        hfVar.ae = i19;
        hfVar.ad = i20;
        return i14;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0034 A:{LOOP_END, LOOP:0: B:5:0x0032->B:6:0x0034} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a A:{LOOP_END, LOOP:1: B:11:0x0066->B:13:0x006a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gv(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        hfVar.ai -= hfVar.az * i4;
        hfVar.ae -= hfVar.ax * i4;
        if (i10 != 0) {
            i12 = i4 + ((((i9 + 256) - i3) + i10) / i10);
            if (i12 <= i8) {
                i13 = i5;
                i14 = i3;
                i15 = i4;
                while (i15 < i12) {
                    int i16 = i14 >> 8;
                    byte b = bArr[i16 - 1];
                    iArr[i15] = (((((bArr[i16] - b) * (i14 & 255)) + (b << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                if (i10 != 0) {
                    i12 = (((i9 - i14) + i10) / i10) + i15;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                while (i15 < i8) {
                    iArr[i15] = iArr[i15] + ((((i11 << 8) + ((bArr[i14 >> 8] - i11) * (i14 & 255))) * i13) >> 6);
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                hfVar.ai += hfVar.az * i15;
                hfVar.ae += hfVar.ax * i15;
                hfVar.aj = i13;
                hfVar.ad = i14;
                return i15;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i3;
        i15 = i4;
        while (i15 < i12) {
        }
        if (i10 != 0) {
        }
        while (i15 < i8) {
        }
        hfVar.ai += hfVar.az * i15;
        hfVar.ae += hfVar.ax * i15;
        hfVar.aj = i13;
        hfVar.ad = i14;
        return i15;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0033 A:{LOOP_END, LOOP:0: B:5:0x0031->B:6:0x0033} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006b A:{LOOP_END, LOOP:1: B:11:0x0067->B:13:0x006b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int gw(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, hf hfVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        hfVar.ai -= hfVar.az * i4;
        hfVar.ae -= hfVar.ax * i4;
        if (i10 != 0) {
            i12 = i4 + ((((i9 - i3) + i10) - 257) / i10);
            if (i12 <= i8) {
                i13 = i5;
                i14 = i3;
                i15 = i4;
                while (i15 < i12) {
                    int i16 = i14 >> 8;
                    byte b = bArr[i16];
                    iArr[i15] = (((((bArr[i16 + 1] - b) * (i14 & 255)) + (b << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                if (i10 != 0) {
                    i12 = ((((i9 - i14) + i10) - 1) / i10) + i15;
                    if (i12 <= i8) {
                        i8 = i12;
                    }
                }
                while (i15 < i8) {
                    byte b2 = bArr[i14 >> 8];
                    iArr[i15] = (((((i11 - b2) * (i14 & 255)) + (b2 << 8)) * i13) >> 6) + iArr[i15];
                    i13 += i6;
                    i14 += i10;
                    i15++;
                }
                hfVar.ai += hfVar.az * i15;
                hfVar.ae += hfVar.ax * i15;
                hfVar.aj = i13;
                hfVar.ad = i14;
                return i15;
            }
        }
        i12 = i8;
        i13 = i5;
        i14 = i3;
        i15 = i4;
        while (i15 < i12) {
        }
        if (i10 != 0) {
        }
        while (i15 < i8) {
        }
        hfVar.ai += hfVar.az * i15;
        hfVar.ae += hfVar.ax * i15;
        hfVar.aj = i13;
        hfVar.ad = i14;
        return i15;
    }

    public void aa(boolean z) {
        synchronized (this) {
            this.aq = (this.aq ^ (this.aq >> 31)) + (this.aq >>> 31);
            if (z) {
                this.aq = -this.aq;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ab() {
        return null;
    }

    public void ac(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((ht) this.aa).ar.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.ad = length;
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ae() {
        return null;
    }

    public void af(int i, int i2, int i3) {
        synchronized (this) {
            if (i == 0) {
                az(i2, i3);
                return;
            }
            int ad = hf.ad(i2, i3);
            int aq = hf.aq(i2, i3);
            if (this.ai == ad && this.ae == aq) {
                this.ap = 0;
                return;
            }
            int i4 = i2 - this.aj;
            if (this.aj - i2 > i4) {
                i4 = this.aj - i2;
            }
            if (ad - this.ai > i4) {
                i4 = ad - this.ai;
            }
            if (this.ai - ad > i4) {
                i4 = this.ai - ad;
            }
            if (aq - this.ae > i4) {
                i4 = aq - this.ae;
            }
            if (this.ae - aq > i4) {
                i4 = this.ae - aq;
            }
            if (i > i4) {
                i = i4;
            }
            this.ap = i;
            this.ar = i2;
            this.al = i3;
            this.au = (i2 - this.aj) / i;
            this.az = (ad - this.ai) / i;
            this.ax = (aq - this.ae) / i;
        }
    }

    /* JADX WARNING: Missing block: B:84:0x0123, code skipped:
            if (r3 == 0) goto L_0x0125;
     */
    /* JADX WARNING: Missing block: B:143:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:146:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:150:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ag(int i) {
        synchronized (this) {
            if (this.ap > 0) {
                if (i >= this.ap) {
                    if (this.ar == Integer.MIN_VALUE) {
                        this.ar = 0;
                        this.ae = 0;
                        this.ai = 0;
                        this.aj = 0;
                        ky();
                        i = this.ap;
                    }
                    this.ap = 0;
                    aj();
                } else {
                    this.aj += this.au * i;
                    this.ai += this.az * i;
                    this.ae += this.ax * i;
                    this.ap -= i;
                }
            }
            int i2 = this.ak << 8;
            int i3 = this.as << 8;
            int length = ((ht) this.aa).ar.length << 8;
            int i4 = i3 - i2;
            if (i4 <= 0) {
                this.am = 0;
            }
            if (this.ad < 0) {
                if (this.aq > 0) {
                    this.ad = 0;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            if (this.ad >= length) {
                if (this.aq < 0) {
                    this.ad = length - 1;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            this.ad += this.aq * i;
            if (this.am >= 0) {
                if (this.am > 0) {
                    if (this.ag) {
                        if (this.aq < 0) {
                            if (this.ad >= i2) {
                                return;
                            }
                            this.ad = ((i2 + i2) - 1) - this.ad;
                            this.aq = -this.aq;
                            i4 = this.am - 1;
                            this.am = i4;
                        }
                        do {
                            if (this.ad < i3) {
                                return;
                            }
                            this.ad = ((i3 + i3) - 1) - this.ad;
                            this.aq = -this.aq;
                            i4 = this.am - 1;
                            this.am = i4;
                            if (i4 == 0) {
                                break;
                            } else if (this.ad >= i2) {
                                return;
                            } else {
                                this.ad = ((i2 + i2) - 1) - this.ad;
                                this.aq = -this.aq;
                                i4 = this.am - 1;
                                this.am = i4;
                            }
                        } while (i4 != 0);
                    } else if (this.aq < 0) {
                        if (this.ad >= i2) {
                            return;
                        }
                        i2 = ((i3 - 1) - this.ad) / i4;
                        if (i2 >= this.am) {
                            this.ad += this.am * i4;
                            this.am = 0;
                        } else {
                            this.ad += i4 * i2;
                            this.am -= i2;
                        }
                    } else if (this.ad < i3) {
                        return;
                    } else {
                        i2 = (this.ad - i2) / i4;
                        if (i2 >= this.am) {
                            this.ad -= this.am * i4;
                            this.am = 0;
                        } else {
                            this.ad -= i4 * i2;
                            this.am -= i2;
                        }
                    }
                }
                if (this.aq < 0) {
                    if (this.ad < 0) {
                        this.ad = -1;
                        ao();
                        ky();
                    }
                } else if (this.ad >= length) {
                    this.ad = length;
                    ao();
                    ky();
                }
            } else if (this.ag) {
                if (this.aq < 0) {
                    if (this.ad >= i2) {
                        return;
                    }
                    this.ad = ((i2 + i2) - 1) - this.ad;
                    this.aq = -this.aq;
                }
                while (this.ad >= i3) {
                    this.ad = ((i3 + i3) - 1) - this.ad;
                    this.aq = -this.aq;
                    if (this.ad >= i2) {
                        return;
                    }
                    this.ad = ((i2 + i2) - 1) - this.ad;
                    this.aq = -this.aq;
                }
            } else if (this.aq < 0) {
                if (this.ad >= i2) {
                } else {
                    length = i3 - 1;
                    this.ad = length - ((length - this.ad) % i4);
                }
            } else if (this.ad < i3) {
            } else {
                this.ad = ((this.ad - i2) % i4) + i2;
            }
        }
    }

    public void ah(int i, int i2) {
        synchronized (this) {
            af(i, i2, aw());
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ai() {
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void aj() {
        this.aj = this.ar;
        this.ai = hf.ad(this.ar, this.al);
        this.ae = hf.aq(this.ar, this.al);
    }

    /* JADX WARNING: Missing block: B:155:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ak(int[] iArr, int i, int i2) {
        synchronized (this) {
            if (this.ar == 0 && this.ap == 0) {
                ag(i2);
                return;
            }
            ht htVar = (ht) this.aa;
            int i3 = this.ak << 8;
            int i4 = this.as << 8;
            int length = htVar.ar.length << 8;
            int i5 = i4 - i3;
            if (i5 <= 0) {
                this.am = 0;
            }
            int i6 = i2 + i;
            if (this.ad < 0) {
                if (this.aq > 0) {
                    this.ad = 0;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            if (this.ad >= length) {
                if (this.aq < 0) {
                    this.ad = length - 1;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            int i7;
            int bv;
            int i8;
            if (this.am >= 0) {
                if (this.am <= 0) {
                    i7 = i;
                } else if (this.ag) {
                    if (this.aq < 0) {
                        bv = bv(iArr, i, i3, i6, htVar.ar[this.ak]);
                        if (this.ad >= i3) {
                            return;
                        }
                        this.ad = ((i3 + i3) - 1) - this.ad;
                        this.aq = -this.aq;
                        i8 = this.am - 1;
                        this.am = i8;
                        if (i8 == 0) {
                            i7 = bv;
                        }
                    } else {
                        bv = i;
                    }
                    do {
                        i7 = bc(iArr, bv, i4, i6, htVar.ar[this.as - 1]);
                        if (this.ad >= i4) {
                            this.ad = ((i4 + i4) - 1) - this.ad;
                            this.aq = -this.aq;
                            i8 = this.am - 1;
                            this.am = i8;
                            if (i8 == 0) {
                                break;
                            }
                            bv = bv(iArr, i7, i3, i6, htVar.ar[this.ak]);
                            if (this.ad >= i3) {
                                return;
                            }
                            this.ad = ((i3 + i3) - 1) - this.ad;
                            this.aq = -this.aq;
                            i8 = this.am - 1;
                            this.am = i8;
                        } else {
                            return;
                        }
                    } while (i8 != 0);
                    i7 = bv;
                } else if (this.aq < 0) {
                    i7 = i;
                    while (true) {
                        bv = bv(iArr, i7, i3, i6, htVar.ar[this.as - 1]);
                        if (this.ad >= i3) {
                            return;
                        }
                        i8 = ((i4 - 1) - this.ad) / i5;
                        if (i8 >= this.am) {
                            this.ad += this.am * i5;
                            this.am = 0;
                            i7 = bv;
                            break;
                        }
                        this.ad += i5 * i8;
                        this.am -= i8;
                        i7 = bv;
                    }
                } else {
                    bv = i;
                    while (true) {
                        bv = bc(iArr, bv, i4, i6, htVar.ar[this.ak]);
                        if (this.ad < i4) {
                            return;
                        }
                        i8 = (this.ad - i3) / i5;
                        if (i8 >= this.am) {
                            this.ad -= this.am * i5;
                            this.am = 0;
                            i7 = bv;
                            break;
                        }
                        this.ad -= i5 * i8;
                        this.am -= i8;
                    }
                }
                if (this.aq < 0) {
                    bv(iArr, i7, 0, i6, 0);
                    if (this.ad < 0) {
                        this.ad = -1;
                        ao();
                        ky();
                    }
                } else {
                    bc(iArr, i7, length, i6, 0);
                    if (this.ad >= length) {
                        this.ad = length;
                        ao();
                        ky();
                    }
                }
            } else if (this.ag) {
                if (this.aq < 0) {
                    bv = bv(iArr, i, i3, i6, htVar.ar[this.ak]);
                    if (this.ad >= i3) {
                        return;
                    }
                    this.ad = ((i3 + i3) - 1) - this.ad;
                    this.aq = -this.aq;
                } else {
                    bv = i;
                }
                while (true) {
                    i7 = bc(iArr, bv, i4, i6, htVar.ar[this.as - 1]);
                    if (this.ad < i4) {
                        return;
                    }
                    this.ad = ((i4 + i4) - 1) - this.ad;
                    this.aq = -this.aq;
                    bv = bv(iArr, i7, i3, i6, htVar.ar[this.ak]);
                    if (this.ad >= i3) {
                        return;
                    }
                    this.ad = ((i3 + i3) - 1) - this.ad;
                    this.aq = -this.aq;
                }
            } else if (this.aq < 0) {
                i7 = i;
                while (true) {
                    i7 = bv(iArr, i7, i3, i6, htVar.ar[this.as - 1]);
                    if (this.ad >= i3) {
                        return;
                    } else {
                        i8 = i4 - 1;
                        this.ad = i8 - ((i8 - this.ad) % i5);
                    }
                }
            } else {
                bv = i;
                while (true) {
                    bv = bc(iArr, bv, i4, i6, htVar.ar[this.ak]);
                    if (this.ad < i4) {
                        return;
                    }
                    this.ad = ((this.ad - i3) % i5) + i3;
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public int am() {
        return (this.ar == 0 && this.ap == 0) ? 0 : 1;
    }

    /* Access modifiers changed, original: protected */
    public hq an() {
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void ao() {
        if (this.ap != 0) {
            if (this.ar == Integer.MIN_VALUE) {
                this.ar = 0;
            }
            this.ap = 0;
            aj();
        }
    }

    public void ap(int i) {
        synchronized (this) {
            az(i << 6, aw());
        }
    }

    public void as(int i) {
        synchronized (this) {
            this.am = i;
        }
    }

    /* Access modifiers changed, original: protected */
    public int at() {
        return (this.ar == 0 && this.ap == 0) ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public void au(int i) {
        synchronized (this) {
            az(i, aw());
        }
    }

    /* Access modifiers changed, original: protected */
    public int av() {
        return (this.ar == 0 && this.ap == 0) ? 0 : 1;
    }

    public int aw() {
        int i;
        synchronized (this) {
            i = this.al < 0 ? -1 : this.al;
        }
        return i;
    }

    public int ax() {
        int i;
        synchronized (this) {
            i = this.ar == Integer.MIN_VALUE ? 0 : this.ar;
        }
        return i;
    }

    /* Access modifiers changed, original: protected */
    public hq ay() {
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void az(int i, int i2) {
        synchronized (this) {
            this.ar = i;
            this.al = i2;
            this.ap = 0;
            aj();
        }
    }

    /* JADX WARNING: Missing block: B:155:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ba(int[] iArr, int i, int i2) {
        synchronized (this) {
            if (this.ar == 0 && this.ap == 0) {
                ag(i2);
                return;
            }
            ht htVar = (ht) this.aa;
            int i3 = this.ak << 8;
            int i4 = this.as << 8;
            int length = htVar.ar.length << 8;
            int i5 = i4 - i3;
            if (i5 <= 0) {
                this.am = 0;
            }
            int i6 = i2 + i;
            if (this.ad < 0) {
                if (this.aq > 0) {
                    this.ad = 0;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            if (this.ad >= length) {
                if (this.aq < 0) {
                    this.ad = length - 1;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            int i7;
            int bv;
            int i8;
            if (this.am >= 0) {
                if (this.am <= 0) {
                    i7 = i;
                } else if (this.ag) {
                    if (this.aq < 0) {
                        bv = bv(iArr, i, i3, i6, htVar.ar[this.ak]);
                        if (this.ad >= i3) {
                            return;
                        }
                        this.ad = ((i3 + i3) - 1) - this.ad;
                        this.aq = -this.aq;
                        i8 = this.am - 1;
                        this.am = i8;
                        if (i8 == 0) {
                            i7 = bv;
                        }
                    } else {
                        bv = i;
                    }
                    do {
                        i7 = bc(iArr, bv, i4, i6, htVar.ar[this.as - 1]);
                        if (this.ad >= i4) {
                            this.ad = ((i4 + i4) - 1) - this.ad;
                            this.aq = -this.aq;
                            i8 = this.am - 1;
                            this.am = i8;
                            if (i8 == 0) {
                                break;
                            }
                            bv = bv(iArr, i7, i3, i6, htVar.ar[this.ak]);
                            if (this.ad >= i3) {
                                return;
                            }
                            this.ad = ((i3 + i3) - 1) - this.ad;
                            this.aq = -this.aq;
                            i8 = this.am - 1;
                            this.am = i8;
                        } else {
                            return;
                        }
                    } while (i8 != 0);
                    i7 = bv;
                } else if (this.aq < 0) {
                    i7 = i;
                    while (true) {
                        bv = bv(iArr, i7, i3, i6, htVar.ar[this.as - 1]);
                        if (this.ad >= i3) {
                            return;
                        }
                        i8 = ((i4 - 1) - this.ad) / i5;
                        if (i8 >= this.am) {
                            this.ad += this.am * i5;
                            this.am = 0;
                            i7 = bv;
                            break;
                        }
                        this.ad += i5 * i8;
                        this.am -= i8;
                        i7 = bv;
                    }
                } else {
                    bv = i;
                    while (true) {
                        bv = bc(iArr, bv, i4, i6, htVar.ar[this.ak]);
                        if (this.ad < i4) {
                            return;
                        }
                        i8 = (this.ad - i3) / i5;
                        if (i8 >= this.am) {
                            this.ad -= this.am * i5;
                            this.am = 0;
                            i7 = bv;
                            break;
                        }
                        this.ad -= i5 * i8;
                        this.am -= i8;
                    }
                }
                if (this.aq < 0) {
                    bv(iArr, i7, 0, i6, 0);
                    if (this.ad < 0) {
                        this.ad = -1;
                        ao();
                        ky();
                    }
                } else {
                    bc(iArr, i7, length, i6, 0);
                    if (this.ad >= length) {
                        this.ad = length;
                        ao();
                        ky();
                    }
                }
            } else if (this.ag) {
                if (this.aq < 0) {
                    bv = bv(iArr, i, i3, i6, htVar.ar[this.ak]);
                    if (this.ad >= i3) {
                        return;
                    }
                    this.ad = ((i3 + i3) - 1) - this.ad;
                    this.aq = -this.aq;
                } else {
                    bv = i;
                }
                while (true) {
                    i7 = bc(iArr, bv, i4, i6, htVar.ar[this.as - 1]);
                    if (this.ad < i4) {
                        return;
                    }
                    this.ad = ((i4 + i4) - 1) - this.ad;
                    this.aq = -this.aq;
                    bv = bv(iArr, i7, i3, i6, htVar.ar[this.ak]);
                    if (this.ad >= i3) {
                        return;
                    }
                    this.ad = ((i3 + i3) - 1) - this.ad;
                    this.aq = -this.aq;
                }
            } else if (this.aq < 0) {
                i7 = i;
                while (true) {
                    i7 = bv(iArr, i7, i3, i6, htVar.ar[this.as - 1]);
                    if (this.ad >= i3) {
                        return;
                    } else {
                        i8 = i4 - 1;
                        this.ad = i8 - ((i8 - this.ad) % i5);
                    }
                }
            } else {
                bv = i;
                while (true) {
                    bv = bc(iArr, bv, i4, i6, htVar.ar[this.ak]);
                    if (this.ad < i4) {
                        return;
                    }
                    this.ad = ((this.ad - i3) % i5) + i3;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int bb() {
        int i;
        int i2 = (this.aj * 3) >> 6;
        int i3 = ((i2 >> 31) ^ i2) + (i2 >>> 31);
        if (this.am == 0) {
            i = this.ad * i3;
            i2 = ((ht) this.aa).ar.length << 8;
        } else if (this.am >= 0) {
            i = this.ak * i3;
            i2 = ((ht) this.aa).ar.length;
        } else {
            i2 = i3;
            return i2 <= 255 ? 255 : i2;
        }
        i2 = i3 - (i / i2);
        if (i2 <= 255) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bc(int[] iArr, int i, int i2, int i3, int i4) {
        hf hfVar = this;
        int i5 = i;
        while (hfVar.ap > 0) {
            hf hfVar2;
            int i6 = hfVar.ap + i5;
            if (i6 > i3) {
                i6 = i3;
            }
            hfVar.ap += i5;
            if (hfVar.aq == 256 && (hfVar.ad & 255) == 0) {
                int bz;
                if (hd.aq) {
                    bz = hf.bz(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this);
                } else {
                    bz = hf.bn(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, hfVar.au, 0, i6, i2, this);
                }
                hfVar2 = hfVar;
                i5 = bz;
            } else if (hd.aq) {
                i5 = hf.cj(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this, hfVar.aq, i4);
                hfVar2 = this;
            } else {
                i5 = hf.cv(0, 0, ((ht) this.aa).ar, iArr, this.ad, i5, this.aj, this.au, 0, i6, i2, this, this.aq, i4);
                hfVar2 = this;
            }
            hfVar2.ap -= i5;
            if (hfVar2.ap != 0) {
                return i5;
            }
            if (bg()) {
                return i3;
            }
            hfVar = hfVar2;
        }
        if (hfVar.aq == 256 && (hfVar.ad & 255) == 0) {
            if (hd.aq) {
                return hf.bu(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this);
            }
            return hf.bx(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this);
        } else if (hd.aq) {
            return hf.bj(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this, hfVar.aq, i4);
        } else {
            return hf.be(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this, hfVar.aq, i4);
        }
    }

    /* JADX WARNING: Missing block: B:84:0x0123, code skipped:
            if (r3 == 0) goto L_0x0125;
     */
    /* JADX WARNING: Missing block: B:143:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:146:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:150:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bd(int i) {
        synchronized (this) {
            if (this.ap > 0) {
                if (i >= this.ap) {
                    if (this.ar == Integer.MIN_VALUE) {
                        this.ar = 0;
                        this.ae = 0;
                        this.ai = 0;
                        this.aj = 0;
                        ky();
                        i = this.ap;
                    }
                    this.ap = 0;
                    aj();
                } else {
                    this.aj += this.au * i;
                    this.ai += this.az * i;
                    this.ae += this.ax * i;
                    this.ap -= i;
                }
            }
            int i2 = this.ak << 8;
            int i3 = this.as << 8;
            int length = ((ht) this.aa).ar.length << 8;
            int i4 = i3 - i2;
            if (i4 <= 0) {
                this.am = 0;
            }
            if (this.ad < 0) {
                if (this.aq > 0) {
                    this.ad = 0;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            if (this.ad >= length) {
                if (this.aq < 0) {
                    this.ad = length - 1;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            this.ad += this.aq * i;
            if (this.am >= 0) {
                if (this.am > 0) {
                    if (this.ag) {
                        if (this.aq < 0) {
                            if (this.ad >= i2) {
                                return;
                            }
                            this.ad = ((i2 + i2) - 1) - this.ad;
                            this.aq = -this.aq;
                            i4 = this.am - 1;
                            this.am = i4;
                        }
                        do {
                            if (this.ad < i3) {
                                return;
                            }
                            this.ad = ((i3 + i3) - 1) - this.ad;
                            this.aq = -this.aq;
                            i4 = this.am - 1;
                            this.am = i4;
                            if (i4 == 0) {
                                break;
                            } else if (this.ad >= i2) {
                                return;
                            } else {
                                this.ad = ((i2 + i2) - 1) - this.ad;
                                this.aq = -this.aq;
                                i4 = this.am - 1;
                                this.am = i4;
                            }
                        } while (i4 != 0);
                    } else if (this.aq < 0) {
                        if (this.ad >= i2) {
                            return;
                        }
                        i2 = ((i3 - 1) - this.ad) / i4;
                        if (i2 >= this.am) {
                            this.ad += this.am * i4;
                            this.am = 0;
                        } else {
                            this.ad += i4 * i2;
                            this.am -= i2;
                        }
                    } else if (this.ad < i3) {
                        return;
                    } else {
                        i2 = (this.ad - i2) / i4;
                        if (i2 >= this.am) {
                            this.ad -= this.am * i4;
                            this.am = 0;
                        } else {
                            this.ad -= i4 * i2;
                            this.am -= i2;
                        }
                    }
                }
                if (this.aq < 0) {
                    if (this.ad < 0) {
                        this.ad = -1;
                        ao();
                        ky();
                    }
                } else if (this.ad >= length) {
                    this.ad = length;
                    ao();
                    ky();
                }
            } else if (this.ag) {
                if (this.aq < 0) {
                    if (this.ad >= i2) {
                        return;
                    }
                    this.ad = ((i2 + i2) - 1) - this.ad;
                    this.aq = -this.aq;
                }
                while (this.ad >= i3) {
                    this.ad = ((i3 + i3) - 1) - this.ad;
                    this.aq = -this.aq;
                    if (this.ad >= i2) {
                        return;
                    }
                    this.ad = ((i2 + i2) - 1) - this.ad;
                    this.aq = -this.aq;
                }
            } else if (this.aq < 0) {
                if (this.ad >= i2) {
                } else {
                    length = i3 - 1;
                    this.ad = length - ((length - this.ad) % i4);
                }
            } else if (this.ad < i3) {
            } else {
                this.ad = ((this.ad - i2) % i4) + i2;
            }
        }
    }

    public boolean bf() {
        return this.ad < 0 || this.ad >= (((ht) this.aa).ar.length << 8);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bg() {
        int i;
        int i2;
        int i3 = this.ar;
        if (i3 == Integer.MIN_VALUE) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = hf.ad(i3, this.al);
            i = hf.aq(i3, this.al);
        }
        if (this.aj != i3 || this.ai != i2 || this.ae != i) {
            if (this.aj < i3) {
                this.au = 1;
                this.ap = i3 - this.aj;
            } else if (this.aj > i3) {
                this.au = -1;
                this.ap = this.aj - i3;
            } else {
                this.au = 0;
            }
            if (this.ai < i2) {
                this.az = 1;
                if (this.ap == 0 || this.ap > i2 - this.ai) {
                    this.ap = i2 - this.ai;
                }
            } else if (this.ai > i2) {
                this.az = -1;
                if (this.ap == 0 || this.ap > this.ai - i2) {
                    this.ap = this.ai - i2;
                }
            } else {
                this.az = 0;
            }
            if (this.ae < i) {
                this.ax = 1;
                if (this.ap != 0 && this.ap <= i - this.ae) {
                    return false;
                }
                this.ap = i - this.ae;
                return false;
            } else if (this.ae > i) {
                this.ax = -1;
                if (this.ap != 0 && this.ap <= this.ae - i) {
                    return false;
                }
                this.ap = this.ae - i;
                return false;
            } else {
                this.ax = 0;
                return false;
            }
        } else if (this.ar == Integer.MIN_VALUE) {
            this.ar = 0;
            this.ae = 0;
            this.ai = 0;
            this.aj = 0;
            ky();
            return true;
        } else {
            aj();
            return false;
        }
    }

    public boolean bi() {
        return this.ap != 0;
    }

    /* Access modifiers changed, original: protected */
    public int bk() {
        return (this.ar == 0 && this.ap == 0) ? 0 : 1;
    }

    public int bl() {
        int i;
        synchronized (this) {
            i = this.aq < 0 ? -this.aq : this.aq;
        }
        return i;
    }

    /* JADX WARNING: Missing block: B:155:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bm(int[] iArr, int i, int i2) {
        synchronized (this) {
            if (this.ar == 0 && this.ap == 0) {
                ag(i2);
                return;
            }
            ht htVar = (ht) this.aa;
            int i3 = this.ak << 8;
            int i4 = this.as << 8;
            int length = htVar.ar.length << 8;
            int i5 = i4 - i3;
            if (i5 <= 0) {
                this.am = 0;
            }
            int i6 = i2 + i;
            if (this.ad < 0) {
                if (this.aq > 0) {
                    this.ad = 0;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            if (this.ad >= length) {
                if (this.aq < 0) {
                    this.ad = length - 1;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            int i7;
            int bv;
            int i8;
            if (this.am >= 0) {
                if (this.am <= 0) {
                    i7 = i;
                } else if (this.ag) {
                    if (this.aq < 0) {
                        bv = bv(iArr, i, i3, i6, htVar.ar[this.ak]);
                        if (this.ad >= i3) {
                            return;
                        }
                        this.ad = ((i3 + i3) - 1) - this.ad;
                        this.aq = -this.aq;
                        i8 = this.am - 1;
                        this.am = i8;
                        if (i8 == 0) {
                            i7 = bv;
                        }
                    } else {
                        bv = i;
                    }
                    do {
                        i7 = bc(iArr, bv, i4, i6, htVar.ar[this.as - 1]);
                        if (this.ad >= i4) {
                            this.ad = ((i4 + i4) - 1) - this.ad;
                            this.aq = -this.aq;
                            i8 = this.am - 1;
                            this.am = i8;
                            if (i8 == 0) {
                                break;
                            }
                            bv = bv(iArr, i7, i3, i6, htVar.ar[this.ak]);
                            if (this.ad >= i3) {
                                return;
                            }
                            this.ad = ((i3 + i3) - 1) - this.ad;
                            this.aq = -this.aq;
                            i8 = this.am - 1;
                            this.am = i8;
                        } else {
                            return;
                        }
                    } while (i8 != 0);
                    i7 = bv;
                } else if (this.aq < 0) {
                    i7 = i;
                    while (true) {
                        bv = bv(iArr, i7, i3, i6, htVar.ar[this.as - 1]);
                        if (this.ad >= i3) {
                            return;
                        }
                        i8 = ((i4 - 1) - this.ad) / i5;
                        if (i8 >= this.am) {
                            this.ad += this.am * i5;
                            this.am = 0;
                            i7 = bv;
                            break;
                        }
                        this.ad += i5 * i8;
                        this.am -= i8;
                        i7 = bv;
                    }
                } else {
                    bv = i;
                    while (true) {
                        bv = bc(iArr, bv, i4, i6, htVar.ar[this.ak]);
                        if (this.ad < i4) {
                            return;
                        }
                        i8 = (this.ad - i3) / i5;
                        if (i8 >= this.am) {
                            this.ad -= this.am * i5;
                            this.am = 0;
                            i7 = bv;
                            break;
                        }
                        this.ad -= i5 * i8;
                        this.am -= i8;
                    }
                }
                if (this.aq < 0) {
                    bv(iArr, i7, 0, i6, 0);
                    if (this.ad < 0) {
                        this.ad = -1;
                        ao();
                        ky();
                    }
                } else {
                    bc(iArr, i7, length, i6, 0);
                    if (this.ad >= length) {
                        this.ad = length;
                        ao();
                        ky();
                    }
                }
            } else if (this.ag) {
                if (this.aq < 0) {
                    bv = bv(iArr, i, i3, i6, htVar.ar[this.ak]);
                    if (this.ad >= i3) {
                        return;
                    }
                    this.ad = ((i3 + i3) - 1) - this.ad;
                    this.aq = -this.aq;
                } else {
                    bv = i;
                }
                while (true) {
                    i7 = bc(iArr, bv, i4, i6, htVar.ar[this.as - 1]);
                    if (this.ad < i4) {
                        return;
                    }
                    this.ad = ((i4 + i4) - 1) - this.ad;
                    this.aq = -this.aq;
                    bv = bv(iArr, i7, i3, i6, htVar.ar[this.ak]);
                    if (this.ad >= i3) {
                        return;
                    }
                    this.ad = ((i3 + i3) - 1) - this.ad;
                    this.aq = -this.aq;
                }
            } else if (this.aq < 0) {
                i7 = i;
                while (true) {
                    i7 = bv(iArr, i7, i3, i6, htVar.ar[this.as - 1]);
                    if (this.ad >= i3) {
                        return;
                    } else {
                        i8 = i4 - 1;
                        this.ad = i8 - ((i8 - this.ad) % i5);
                    }
                }
            } else {
                bv = i;
                while (true) {
                    bv = bc(iArr, bv, i4, i6, htVar.ar[this.ak]);
                    if (this.ad < i4) {
                        return;
                    }
                    this.ad = ((this.ad - i3) % i5) + i3;
                }
            }
        }
    }

    public void bo(int i) {
        synchronized (this) {
            if (this.aq < 0) {
                this.aq = -i;
            } else {
                this.aq = i;
            }
        }
    }

    public void bq(int i) {
        synchronized (this) {
            if (i == 0) {
                au(0);
                ky();
            } else if (this.ai == 0 && this.ae == 0) {
                this.ap = 0;
                this.ar = 0;
                this.aj = 0;
                ky();
            } else {
                int i2 = -this.aj;
                if (this.aj > i2) {
                    i2 = this.aj;
                }
                if ((-this.ai) > i2) {
                    i2 = -this.ai;
                }
                if (this.ai > i2) {
                    i2 = this.ai;
                }
                if ((-this.ae) > i2) {
                    i2 = -this.ae;
                }
                if (this.ae > i2) {
                    i2 = this.ae;
                }
                if (i > i2) {
                    i = i2;
                }
                this.ap = i;
                this.ar = Integer.MIN_VALUE;
                this.au = (-this.aj) / i;
                this.az = (-this.ai) / i;
                this.ax = (-this.ae) / i;
            }
        }
    }

    /* JADX WARNING: Missing block: B:155:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bs(int[] iArr, int i, int i2) {
        synchronized (this) {
            if (this.ar == 0 && this.ap == 0) {
                ag(i2);
                return;
            }
            ht htVar = (ht) this.aa;
            int i3 = this.ak << 8;
            int i4 = this.as << 8;
            int length = htVar.ar.length << 8;
            int i5 = i4 - i3;
            if (i5 <= 0) {
                this.am = 0;
            }
            int i6 = i2 + i;
            if (this.ad < 0) {
                if (this.aq > 0) {
                    this.ad = 0;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            if (this.ad >= length) {
                if (this.aq < 0) {
                    this.ad = length - 1;
                } else {
                    ao();
                    ky();
                    return;
                }
            }
            int i7;
            int bv;
            int i8;
            if (this.am >= 0) {
                if (this.am <= 0) {
                    i7 = i;
                } else if (this.ag) {
                    if (this.aq < 0) {
                        bv = bv(iArr, i, i3, i6, htVar.ar[this.ak]);
                        if (this.ad >= i3) {
                            return;
                        }
                        this.ad = ((i3 + i3) - 1) - this.ad;
                        this.aq = -this.aq;
                        i8 = this.am - 1;
                        this.am = i8;
                        if (i8 == 0) {
                            i7 = bv;
                        }
                    } else {
                        bv = i;
                    }
                    do {
                        i7 = bc(iArr, bv, i4, i6, htVar.ar[this.as - 1]);
                        if (this.ad >= i4) {
                            this.ad = ((i4 + i4) - 1) - this.ad;
                            this.aq = -this.aq;
                            i8 = this.am - 1;
                            this.am = i8;
                            if (i8 == 0) {
                                break;
                            }
                            bv = bv(iArr, i7, i3, i6, htVar.ar[this.ak]);
                            if (this.ad >= i3) {
                                return;
                            }
                            this.ad = ((i3 + i3) - 1) - this.ad;
                            this.aq = -this.aq;
                            i8 = this.am - 1;
                            this.am = i8;
                        } else {
                            return;
                        }
                    } while (i8 != 0);
                    i7 = bv;
                } else if (this.aq < 0) {
                    i7 = i;
                    while (true) {
                        bv = bv(iArr, i7, i3, i6, htVar.ar[this.as - 1]);
                        if (this.ad >= i3) {
                            return;
                        }
                        i8 = ((i4 - 1) - this.ad) / i5;
                        if (i8 >= this.am) {
                            this.ad += this.am * i5;
                            this.am = 0;
                            i7 = bv;
                            break;
                        }
                        this.ad += i5 * i8;
                        this.am -= i8;
                        i7 = bv;
                    }
                } else {
                    bv = i;
                    while (true) {
                        bv = bc(iArr, bv, i4, i6, htVar.ar[this.ak]);
                        if (this.ad < i4) {
                            return;
                        }
                        i8 = (this.ad - i3) / i5;
                        if (i8 >= this.am) {
                            this.ad -= this.am * i5;
                            this.am = 0;
                            i7 = bv;
                            break;
                        }
                        this.ad -= i5 * i8;
                        this.am -= i8;
                    }
                }
                if (this.aq < 0) {
                    bv(iArr, i7, 0, i6, 0);
                    if (this.ad < 0) {
                        this.ad = -1;
                        ao();
                        ky();
                    }
                } else {
                    bc(iArr, i7, length, i6, 0);
                    if (this.ad >= length) {
                        this.ad = length;
                        ao();
                        ky();
                    }
                }
            } else if (this.ag) {
                if (this.aq < 0) {
                    bv = bv(iArr, i, i3, i6, htVar.ar[this.ak]);
                    if (this.ad >= i3) {
                        return;
                    }
                    this.ad = ((i3 + i3) - 1) - this.ad;
                    this.aq = -this.aq;
                } else {
                    bv = i;
                }
                while (true) {
                    i7 = bc(iArr, bv, i4, i6, htVar.ar[this.as - 1]);
                    if (this.ad < i4) {
                        return;
                    }
                    this.ad = ((i4 + i4) - 1) - this.ad;
                    this.aq = -this.aq;
                    bv = bv(iArr, i7, i3, i6, htVar.ar[this.ak]);
                    if (this.ad >= i3) {
                        return;
                    }
                    this.ad = ((i3 + i3) - 1) - this.ad;
                    this.aq = -this.aq;
                }
            } else if (this.aq < 0) {
                i7 = i;
                while (true) {
                    i7 = bv(iArr, i7, i3, i6, htVar.ar[this.as - 1]);
                    if (this.ad >= i3) {
                        return;
                    } else {
                        i8 = i4 - 1;
                        this.ad = i8 - ((i8 - this.ad) % i5);
                    }
                }
            } else {
                bv = i;
                while (true) {
                    bv = bc(iArr, bv, i4, i6, htVar.ar[this.ak]);
                    if (this.ad < i4) {
                        return;
                    }
                    this.ad = ((this.ad - i3) % i5) + i3;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bv(int[] iArr, int i, int i2, int i3, int i4) {
        hf hfVar = this;
        int i5 = i;
        while (hfVar.ap > 0) {
            hf hfVar2;
            int i6 = hfVar.ap + i5;
            if (i6 > i3) {
                i6 = i3;
            }
            hfVar.ap += i5;
            if (hfVar.aq == InputDeviceCompat.SOURCE_ANY && (hfVar.ad & 255) == 0) {
                int bp;
                if (hd.aq) {
                    bp = hf.bp(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this);
                } else {
                    bp = hf.by(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, hfVar.au, 0, i6, i2, this);
                }
                hfVar2 = hfVar;
                i5 = bp;
            } else if (hd.aq) {
                i5 = hf.cq(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this, hfVar.aq, i4);
                hfVar2 = this;
            } else {
                i5 = hf.cm(0, 0, ((ht) this.aa).ar, iArr, this.ad, i5, this.aj, this.au, 0, i6, i2, this, this.aq, i4);
                hfVar2 = this;
            }
            hfVar2.ap -= i5;
            if (hfVar2.ap != 0) {
                return i5;
            }
            if (bg()) {
                return i3;
            }
            hfVar = hfVar2;
        }
        if (hfVar.aq == InputDeviceCompat.SOURCE_ANY && (hfVar.ad & 255) == 0) {
            if (hd.aq) {
                return hf.br(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this);
            }
            return hf.bw(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this);
        } else if (hd.aq) {
            return hf.bt(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this, hfVar.aq, i4);
        } else {
            return hf.bh(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this, hfVar.aq, i4);
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int cc() {
        int i;
        int i2 = (this.aj * 3) >> 6;
        int i3 = ((i2 >> -1845075353) ^ i2) + (i2 >>> 31);
        if (this.am == 0) {
            i = this.ad * i3;
            i2 = ((ht) this.aa).ar.length << 8;
        } else if (this.am >= 0) {
            i = this.ak * i3;
            i2 = ((ht) this.aa).ar.length;
        } else {
            i2 = i3;
            return i2 <= 255 ? 473916388 : i2;
        }
        i2 = i3 - (i / i2);
        if (i2 <= 255) {
        }
    }

    public void cd(int i) {
        synchronized (this) {
            this.am = i;
        }
    }

    public void cf(int i) {
        synchronized (this) {
            az(i << 6, aw());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cg(int i, int i2) {
        synchronized (this) {
            this.ar = i;
            this.al = i2;
            this.ap = 0;
            aj();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ch(int i, int i2) {
        synchronized (this) {
            this.ar = i;
            this.al = i2;
            this.ap = 0;
            aj();
        }
    }

    public void cl(int i) {
        synchronized (this) {
            this.am = i;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int cr() {
        int i = (this.aj * 3) >> 6;
        int i2 = ((i >> 31) ^ i) + (i >>> 31);
        i = this.am == 0 ? i2 - ((this.ad * i2) / (((ht) this.aa).ar.length << 8)) : this.am >= 0 ? i2 - ((this.ak * i2) / ((ht) this.aa).ar.length) : i2;
        return i > 255 ? 255 : i;
    }

    /* Access modifiers changed, original: 0000 */
    public int cs() {
        int i = (this.aj * 3) >> 6;
        int i2 = ((i >> 31) ^ i) + (i >>> 31);
        i = this.am == 0 ? i2 - ((this.ad * i2) / (((ht) this.aa).ar.length << 8)) : this.am >= 0 ? i2 - ((this.ak * i2) / ((ht) this.aa).ar.length) : i2;
        return i > 255 ? 255 : i;
    }

    /* Access modifiers changed, original: 0000 */
    public void cu() {
        this.aj = this.ar;
        this.ai = hf.ad(this.ar, this.al);
        this.ae = hf.aq(this.ar, this.al);
    }

    /* Access modifiers changed, original: 0000 */
    public int cy() {
        int i = (this.aj * 3) >> 6;
        int i2 = ((i >> 31) ^ i) + (i >>> 31);
        i = this.am == 0 ? i2 - ((this.ad * i2) / (((ht) this.aa).ar.length << 8)) : this.am >= 0 ? i2 - ((this.ak * i2) / ((ht) this.aa).ar.length) : i2;
        return i > 255 ? 255 : i;
    }

    public void cz(int i) {
        synchronized (this) {
            this.am = i;
        }
    }

    public void da(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((ht) this.aa).ar.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.ad = length;
        }
    }

    public void db(boolean z) {
        synchronized (this) {
            this.aq = (this.aq ^ (this.aq >> 31)) + (this.aq >>> 31);
            if (z) {
                this.aq = -this.aq;
            }
        }
    }

    public void dc(boolean z) {
        synchronized (this) {
            this.aq = (this.aq ^ (this.aq >> 31)) + (this.aq >>> 31);
            if (z) {
                this.aq = -this.aq;
            }
        }
    }

    public int dd() {
        int i;
        synchronized (this) {
            i = this.ar == Integer.MIN_VALUE ? 0 : this.ar;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public void de() {
        if (this.ap != 0) {
            if (this.ar == Integer.MIN_VALUE) {
                this.ar = 0;
            }
            this.ap = 0;
            aj();
        }
    }

    public void df(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((ht) this.aa).ar.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.ad = length;
        }
    }

    public void dg(int i) {
        synchronized (this) {
            if (i == 0) {
                au(0);
                ky();
            } else if (this.ai == 0 && this.ae == 0) {
                this.ap = 0;
                this.ar = 0;
                this.aj = 0;
                ky();
            } else {
                int i2 = -this.aj;
                if (this.aj > i2) {
                    i2 = this.aj;
                }
                if ((-this.ai) > i2) {
                    i2 = -this.ai;
                }
                if (this.ai > i2) {
                    i2 = this.ai;
                }
                if ((-this.ae) > i2) {
                    i2 = -this.ae;
                }
                if (this.ae > i2) {
                    i2 = this.ae;
                }
                if (i > i2) {
                    i = i2;
                }
                this.ap = i;
                this.ar = Integer.MIN_VALUE;
                this.au = (-this.aj) / i;
                this.az = (-this.ai) / i;
                this.ax = (-this.ae) / i;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dh() {
        if (this.ap != 0) {
            if (this.ar == -739687360) {
                this.ar = 0;
            }
            this.ap = 0;
            aj();
        }
    }

    public int di() {
        int i;
        synchronized (this) {
            i = this.al < 0 ? -1 : this.al;
        }
        return i;
    }

    public void dj(int i) {
        synchronized (this) {
            if (i == 0) {
                au(0);
                ky();
            } else if (this.ai == 0 && this.ae == 0) {
                this.ap = 0;
                this.ar = 0;
                this.aj = 0;
                ky();
            } else {
                int i2 = -this.aj;
                if (this.aj > i2) {
                    i2 = this.aj;
                }
                if ((-this.ai) > i2) {
                    i2 = -this.ai;
                }
                if (this.ai > i2) {
                    i2 = this.ai;
                }
                if ((-this.ae) > i2) {
                    i2 = -this.ae;
                }
                if (this.ae > i2) {
                    i2 = this.ae;
                }
                if (i > i2) {
                    i = i2;
                }
                this.ap = i;
                this.ar = Integer.MIN_VALUE;
                this.au = (-this.aj) / i;
                this.az = (-this.ai) / i;
                this.ax = (-this.ae) / i;
            }
        }
    }

    public void dk(int i, int i2, int i3) {
        synchronized (this) {
            if (i == 0) {
                az(i2, i3);
                return;
            }
            int ad = hf.ad(i2, i3);
            int aq = hf.aq(i2, i3);
            if (this.ai == ad && this.ae == aq) {
                this.ap = 0;
                return;
            }
            int i4 = i2 - this.aj;
            if (this.aj - i2 > i4) {
                i4 = this.aj - i2;
            }
            if (ad - this.ai > i4) {
                i4 = ad - this.ai;
            }
            if (this.ai - ad > i4) {
                i4 = this.ai - ad;
            }
            if (aq - this.ae > i4) {
                i4 = aq - this.ae;
            }
            if (this.ae - aq > i4) {
                i4 = this.ae - aq;
            }
            if (i > i4) {
                i = i4;
            }
            this.ap = i;
            this.ar = i2;
            this.al = i3;
            this.au = (i2 - this.aj) / i;
            this.az = (ad - this.ai) / i;
            this.ax = (aq - this.ae) / i;
        }
    }

    public int dl() {
        int i;
        synchronized (this) {
            i = this.al < 0 ? -1 : this.al;
        }
        return i;
    }

    public int dm() {
        int i;
        synchronized (this) {
            i = this.ar == Integer.MIN_VALUE ? 0 : this.ar;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public void dn() {
        if (this.ap != 0) {
            if (this.ar == 1606053286) {
                this.ar = 0;
            }
            this.ap = 0;
            aj();
        }
    }

    /* renamed from: do */
    public void m220do(int i, int i2) {
        synchronized (this) {
            af(i, i2, aw());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dp() {
        if (this.ap != 0) {
            if (this.ar == Integer.MIN_VALUE) {
                this.ar = 0;
            }
            this.ap = 0;
            aj();
        }
    }

    public void dq(int i, int i2) {
        synchronized (this) {
            af(i, i2, aw());
        }
    }

    public void dr(int i) {
        int i2 = -1;
        synchronized (this) {
            int length = ((ht) this.aa).ar.length << 8;
            if (i >= -1) {
                i2 = i;
            }
            if (i2 <= length) {
                length = i2;
            }
            this.ad = length;
        }
    }

    public void ds(int i, int i2) {
        synchronized (this) {
            af(i, i2, aw());
        }
    }

    public int dt() {
        int i;
        synchronized (this) {
            i = this.al < 0 ? -1 : this.al;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public void du() {
        if (this.ap != 0) {
            if (this.ar == Integer.MIN_VALUE) {
                this.ar = 0;
            }
            this.ap = 0;
            aj();
        }
    }

    public int dv() {
        int i;
        synchronized (this) {
            i = this.al < 0 ? -1 : this.al;
        }
        return i;
    }

    public void dw(int i, int i2, int i3) {
        synchronized (this) {
            if (i == 0) {
                az(i2, i3);
                return;
            }
            int ad = hf.ad(i2, i3);
            int aq = hf.aq(i2, i3);
            if (this.ai == ad && this.ae == aq) {
                this.ap = 0;
                return;
            }
            int i4 = i2 - this.aj;
            if (this.aj - i2 > i4) {
                i4 = this.aj - i2;
            }
            if (ad - this.ai > i4) {
                i4 = ad - this.ai;
            }
            if (this.ai - ad > i4) {
                i4 = this.ai - ad;
            }
            if (aq - this.ae > i4) {
                i4 = aq - this.ae;
            }
            if (this.ae - aq > i4) {
                i4 = this.ae - aq;
            }
            if (i > i4) {
                i = i4;
            }
            this.ap = i;
            this.ar = i2;
            this.al = i3;
            this.au = (i2 - this.aj) / i;
            this.az = (ad - this.ai) / i;
            this.ax = (aq - this.ae) / i;
        }
    }

    public void dx(int i, int i2) {
        synchronized (this) {
            af(i, i2, aw());
        }
    }

    public void dy(int i, int i2) {
        synchronized (this) {
            af(i, i2, aw());
        }
    }

    public void dz(int i) {
        synchronized (this) {
            if (i == 0) {
                au(0);
                ky();
            } else if (this.ai == 0 && this.ae == 0) {
                this.ap = 0;
                this.ar = 0;
                this.aj = 0;
                ky();
            } else {
                int i2 = -this.aj;
                if (this.aj > i2) {
                    i2 = this.aj;
                }
                if ((-this.ai) > i2) {
                    i2 = -this.ai;
                }
                if (this.ai > i2) {
                    i2 = this.ai;
                }
                if ((-this.ae) > i2) {
                    i2 = -this.ae;
                }
                if (this.ae > i2) {
                    i2 = this.ae;
                }
                if (i > i2) {
                    i = i2;
                }
                this.ap = i;
                this.ar = 1640501195;
                this.au = (-this.aj) / i;
                this.az = (-this.ai) / i;
                this.ax = (-this.ae) / i;
            }
        }
    }

    public boolean ea() {
        return this.ad < 0 || this.ad >= (((ht) this.aa).ar.length << 8);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean eb() {
        int i;
        int i2;
        int i3 = this.ar;
        if (i3 == Integer.MIN_VALUE) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = hf.ad(i3, this.al);
            i = hf.aq(i3, this.al);
        }
        if (this.aj != i3 || this.ai != i2 || this.ae != i) {
            if (this.aj < i3) {
                this.au = 1;
                this.ap = i3 - this.aj;
            } else if (this.aj > i3) {
                this.au = -1;
                this.ap = this.aj - i3;
            } else {
                this.au = 0;
            }
            if (this.ai < i2) {
                this.az = 1;
                if (this.ap == 0 || this.ap > i2 - this.ai) {
                    this.ap = i2 - this.ai;
                }
            } else if (this.ai > i2) {
                this.az = -1;
                if (this.ap == 0 || this.ap > this.ai - i2) {
                    this.ap = this.ai - i2;
                }
            } else {
                this.az = 0;
            }
            if (this.ae < i) {
                this.ax = 1;
                if (this.ap != 0 && this.ap <= i - this.ae) {
                    return false;
                }
                this.ap = i - this.ae;
                return false;
            } else if (this.ae > i) {
                this.ax = -1;
                if (this.ap != 0 && this.ap <= this.ae - i) {
                    return false;
                }
                this.ap = this.ae - i;
                return false;
            } else {
                this.ax = 0;
                return false;
            }
        } else if (this.ar == Integer.MIN_VALUE) {
            this.ar = 0;
            this.ae = 0;
            this.ai = 0;
            this.aj = 0;
            ky();
            return true;
        } else {
            aj();
            return false;
        }
    }

    public int ec() {
        int i;
        synchronized (this) {
            i = this.aq < 0 ? -this.aq : this.aq;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public int ed(int[] iArr, int i, int i2, int i3, int i4) {
        hf hfVar = this;
        int i5 = i;
        while (hfVar.ap > 0) {
            hf hfVar2;
            int i6 = hfVar.ap + i5;
            if (i6 > i3) {
                i6 = i3;
            }
            hfVar.ap += i5;
            if (hfVar.aq == 256 && (hfVar.ad & 255) == 0) {
                int bz;
                if (hd.aq) {
                    bz = hf.bz(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this);
                } else {
                    bz = hf.bn(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, hfVar.au, 0, i6, i2, this);
                }
                hfVar2 = hfVar;
                i5 = bz;
            } else if (hd.aq) {
                i5 = hf.cj(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this, hfVar.aq, i4);
                hfVar2 = this;
            } else {
                i5 = hf.cv(0, 0, ((ht) this.aa).ar, iArr, this.ad, i5, this.aj, this.au, 0, i6, i2, this, this.aq, i4);
                hfVar2 = this;
            }
            hfVar2.ap -= i5;
            if (hfVar2.ap != 0) {
                return i5;
            }
            if (bg()) {
                return i3;
            }
            hfVar = hfVar2;
        }
        if (hfVar.aq == 256 && (hfVar.ad & 255) == 0) {
            if (hd.aq) {
                return hf.bu(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this);
            }
            return hf.bx(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this);
        } else if (hd.aq) {
            return hf.bj(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this, hfVar.aq, i4);
        } else {
            return hf.be(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this, hfVar.aq, i4);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ee(int[] iArr, int i, int i2, int i3, int i4) {
        hf hfVar = this;
        int i5 = i;
        while (hfVar.ap > 0) {
            hf hfVar2;
            int i6 = hfVar.ap + i5;
            if (i6 > i3) {
                i6 = i3;
            }
            hfVar.ap += i5;
            if (hfVar.aq == InputDeviceCompat.SOURCE_ANY && (hfVar.ad & 255) == 0) {
                int bp;
                if (hd.aq) {
                    bp = hf.bp(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this);
                } else {
                    bp = hf.by(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, hfVar.au, 0, i6, i2, this);
                }
                hfVar2 = hfVar;
                i5 = bp;
            } else if (hd.aq) {
                i5 = hf.cq(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this, hfVar.aq, i4);
                hfVar2 = this;
            } else {
                i5 = hf.cm(0, 0, ((ht) this.aa).ar, iArr, this.ad, i5, this.aj, this.au, 0, i6, i2, this, this.aq, i4);
                hfVar2 = this;
            }
            hfVar2.ap -= i5;
            if (hfVar2.ap != 0) {
                return i5;
            }
            if (bg()) {
                return i3;
            }
            hfVar = hfVar2;
        }
        if (hfVar.aq == InputDeviceCompat.SOURCE_ANY && (hfVar.ad & 255) == 0) {
            if (hd.aq) {
                return hf.br(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this);
            }
            return hf.bw(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this);
        } else if (hd.aq) {
            return hf.bt(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this, hfVar.aq, i4);
        } else {
            return hf.bh(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this, hfVar.aq, i4);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int eg(int[] iArr, int i, int i2, int i3, int i4) {
        hf hfVar = this;
        int i5 = i;
        while (hfVar.ap > 0) {
            hf hfVar2;
            int i6 = hfVar.ap + i5;
            if (i6 > i3) {
                i6 = i3;
            }
            hfVar.ap += i5;
            if (hfVar.aq == 256 && (hfVar.ad & 255) == 0) {
                int bz;
                if (hd.aq) {
                    bz = hf.bz(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this);
                } else {
                    bz = hf.bn(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, hfVar.au, 0, i6, i2, this);
                }
                hfVar2 = hfVar;
                i5 = bz;
            } else if (hd.aq) {
                i5 = hf.cj(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this, hfVar.aq, i4);
                hfVar2 = this;
            } else {
                i5 = hf.cv(0, 0, ((ht) this.aa).ar, iArr, this.ad, i5, this.aj, this.au, 0, i6, i2, this, this.aq, i4);
                hfVar2 = this;
            }
            hfVar2.ap -= i5;
            if (hfVar2.ap != 0) {
                return i5;
            }
            if (bg()) {
                return i3;
            }
            hfVar = hfVar2;
        }
        if (hfVar.aq == 256 && (hfVar.ad & 255) == 0) {
            if (hd.aq) {
                return hf.bu(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this);
            }
            return hf.bx(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this);
        } else if (hd.aq) {
            return hf.bj(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this, hfVar.aq, i4);
        } else {
            return hf.be(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this, hfVar.aq, i4);
        }
    }

    public int eh() {
        int i;
        synchronized (this) {
            i = this.aq < 0 ? -this.aq : this.aq;
        }
        return i;
    }

    public boolean ei() {
        return this.ad < 0 || this.ad >= (((ht) this.aa).ar.length << 8);
    }

    public boolean ek() {
        return this.ad < 0 || this.ad >= (((ht) this.aa).ar.length << 8);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean el() {
        int i;
        int i2;
        int i3 = this.ar;
        if (i3 == 769530294) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = hf.ad(i3, this.al);
            i = hf.aq(i3, this.al);
        }
        if (this.aj != i3 || this.ai != i2 || this.ae != i) {
            if (this.aj < i3) {
                this.au = 1;
                this.ap = i3 - this.aj;
            } else if (this.aj > i3) {
                this.au = -1;
                this.ap = this.aj - i3;
            } else {
                this.au = 0;
            }
            if (this.ai < i2) {
                this.az = 1;
                if (this.ap == 0 || this.ap > i2 - this.ai) {
                    this.ap = i2 - this.ai;
                }
            } else if (this.ai > i2) {
                this.az = -1;
                if (this.ap == 0 || this.ap > this.ai - i2) {
                    this.ap = this.ai - i2;
                }
            } else {
                this.az = 0;
            }
            if (this.ae < i) {
                this.ax = 1;
                if (this.ap != 0 && this.ap <= i - this.ae) {
                    return false;
                }
                this.ap = i - this.ae;
                return false;
            } else if (this.ae > i) {
                this.ax = -1;
                if (this.ap != 0 && this.ap <= this.ae - i) {
                    return false;
                }
                this.ap = this.ae - i;
                return false;
            } else {
                this.ax = 0;
                return false;
            }
        } else if (this.ar == Integer.MIN_VALUE) {
            this.ar = 0;
            this.ae = 0;
            this.ai = 0;
            this.aj = 0;
            ky();
            return true;
        } else {
            aj();
            return false;
        }
    }

    public boolean en() {
        return this.ap != 0;
    }

    public int eo() {
        int i;
        synchronized (this) {
            i = this.aq < 0 ? -this.aq : this.aq;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ep() {
        int i;
        int i2;
        int i3 = this.ar;
        if (i3 == -237660768) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = hf.ad(i3, this.al);
            i = hf.aq(i3, this.al);
        }
        if (this.aj != i3 || this.ai != i2 || this.ae != i) {
            if (this.aj < i3) {
                this.au = 1;
                this.ap = i3 - this.aj;
            } else if (this.aj > i3) {
                this.au = -1;
                this.ap = this.aj - i3;
            } else {
                this.au = 0;
            }
            if (this.ai < i2) {
                this.az = 1;
                if (this.ap == 0 || this.ap > i2 - this.ai) {
                    this.ap = i2 - this.ai;
                }
            } else if (this.ai > i2) {
                this.az = -1;
                if (this.ap == 0 || this.ap > this.ai - i2) {
                    this.ap = this.ai - i2;
                }
            } else {
                this.az = 0;
            }
            if (this.ae < i) {
                this.ax = 1;
                if (this.ap != 0 && this.ap <= i - this.ae) {
                    return false;
                }
                this.ap = i - this.ae;
                return false;
            } else if (this.ae > i) {
                this.ax = -1;
                if (this.ap != 0 && this.ap <= this.ae - i) {
                    return false;
                }
                this.ap = this.ae - i;
                return false;
            } else {
                this.ax = 0;
                return false;
            }
        } else if (this.ar == Integer.MIN_VALUE) {
            this.ar = 0;
            this.ae = 0;
            this.ai = 0;
            this.aj = 0;
            ky();
            return true;
        } else {
            aj();
            return false;
        }
    }

    public void eq(int i) {
        synchronized (this) {
            if (this.aq < 0) {
                this.aq = -i;
            } else {
                this.aq = i;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int er(int[] iArr, int i, int i2, int i3, int i4) {
        hf hfVar = this;
        int i5 = i;
        while (hfVar.ap > 0) {
            hf hfVar2;
            int i6 = hfVar.ap + i5;
            if (i6 > i3) {
                i6 = i3;
            }
            hfVar.ap += i5;
            if (hfVar.aq == -1278237690 && (hfVar.ad & 255) == 0) {
                int bz;
                if (hd.aq) {
                    bz = hf.bz(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this);
                } else {
                    bz = hf.bn(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, hfVar.au, 0, i6, i2, this);
                }
                hfVar2 = hfVar;
                i5 = bz;
            } else if (hd.aq) {
                i5 = hf.cj(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this, hfVar.aq, i4);
                hfVar2 = this;
            } else {
                i5 = hf.cv(0, 0, ((ht) this.aa).ar, iArr, this.ad, i5, this.aj, this.au, 0, i6, i2, this, this.aq, i4);
                hfVar2 = this;
            }
            hfVar2.ap -= i5;
            if (hfVar2.ap != 0) {
                return i5;
            }
            if (bg()) {
                return i3;
            }
            hfVar = hfVar2;
        }
        if (hfVar.aq == 256 && (hfVar.ad & 255) == 0) {
            if (hd.aq) {
                return hf.bu(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this);
            }
            return hf.bx(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this);
        } else if (hd.aq) {
            return hf.bj(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this, hfVar.aq, i4);
        } else {
            return hf.be(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this, hfVar.aq, i4);
        }
    }

    public void et(int i) {
        synchronized (this) {
            if (this.aq < 0) {
                this.aq = -i;
            } else {
                this.aq = i;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int eu(int[] iArr, int i, int i2, int i3, int i4) {
        hf hfVar = this;
        int i5 = i;
        while (hfVar.ap > 0) {
            hf hfVar2;
            int i6 = hfVar.ap + i5;
            if (i6 > i3) {
                i6 = i3;
            }
            hfVar.ap += i5;
            if (hfVar.aq == InputDeviceCompat.SOURCE_ANY && (hfVar.ad & 255) == 0) {
                int bp;
                if (hd.aq) {
                    bp = hf.bp(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this);
                } else {
                    bp = hf.by(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, hfVar.au, 0, i6, i2, this);
                }
                hfVar2 = hfVar;
                i5 = bp;
            } else if (hd.aq) {
                i5 = hf.cq(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this, hfVar.aq, i4);
                hfVar2 = this;
            } else {
                i5 = hf.cm(0, 0, ((ht) this.aa).ar, iArr, this.ad, i5, this.aj, this.au, 0, i6, i2, this, this.aq, i4);
                hfVar2 = this;
            }
            hfVar2.ap -= i5;
            if (hfVar2.ap != 0) {
                return i5;
            }
            if (bg()) {
                return i3;
            }
            hfVar = hfVar2;
        }
        if (hfVar.aq == InputDeviceCompat.SOURCE_ANY && (hfVar.ad & 255) == 0) {
            if (hd.aq) {
                return hf.br(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this);
            }
            return hf.bw(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this);
        } else if (hd.aq) {
            return hf.bt(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this, hfVar.aq, i4);
        } else {
            return hf.bh(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this, hfVar.aq, i4);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ev() {
        int i;
        int i2;
        int i3 = this.ar;
        if (i3 == Integer.MIN_VALUE) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i2 = hf.ad(i3, this.al);
            i = hf.aq(i3, this.al);
        }
        if (this.aj != i3 || this.ai != i2 || this.ae != i) {
            if (this.aj < i3) {
                this.au = 1;
                this.ap = i3 - this.aj;
            } else if (this.aj > i3) {
                this.au = -1;
                this.ap = this.aj - i3;
            } else {
                this.au = 0;
            }
            if (this.ai < i2) {
                this.az = 1;
                if (this.ap == 0 || this.ap > i2 - this.ai) {
                    this.ap = i2 - this.ai;
                }
            } else if (this.ai > i2) {
                this.az = -1;
                if (this.ap == 0 || this.ap > this.ai - i2) {
                    this.ap = this.ai - i2;
                }
            } else {
                this.az = 0;
            }
            if (this.ae < i) {
                this.ax = 1;
                if (this.ap != 0 && this.ap <= i - this.ae) {
                    return false;
                }
                this.ap = i - this.ae;
                return false;
            } else if (this.ae > i) {
                this.ax = -1;
                if (this.ap != 0 && this.ap <= this.ae - i) {
                    return false;
                }
                this.ap = this.ae - i;
                return false;
            } else {
                this.ax = 0;
                return false;
            }
        } else if (this.ar == -2119253520) {
            this.ar = 0;
            this.ae = 0;
            this.ai = 0;
            this.aj = 0;
            ky();
            return true;
        } else {
            aj();
            return false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ew(int[] iArr, int i, int i2, int i3, int i4) {
        hf hfVar = this;
        int i5 = i;
        while (hfVar.ap > 0) {
            hf hfVar2;
            int i6 = hfVar.ap + i5;
            if (i6 > i3) {
                i6 = i3;
            }
            hfVar.ap += i5;
            if (hfVar.aq == InputDeviceCompat.SOURCE_ANY && (hfVar.ad & 255) == 0) {
                int bp;
                if (hd.aq) {
                    bp = hf.bp(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this);
                } else {
                    bp = hf.by(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, hfVar.au, 0, i6, i2, this);
                }
                hfVar2 = hfVar;
                i5 = bp;
            } else if (hd.aq) {
                i5 = hf.cq(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, hfVar.az, hfVar.ax, 0, i6, i2, this, hfVar.aq, i4);
                hfVar2 = this;
            } else {
                i5 = hf.cm(0, 0, ((ht) this.aa).ar, iArr, this.ad, i5, this.aj, this.au, 0, i6, i2, this, this.aq, i4);
                hfVar2 = this;
            }
            hfVar2.ap -= i5;
            if (hfVar2.ap != 0) {
                return i5;
            }
            if (bg()) {
                return i3;
            }
            hfVar = hfVar2;
        }
        if (hfVar.aq == InputDeviceCompat.SOURCE_ANY && (hfVar.ad & 255) == 0) {
            if (hd.aq) {
                return hf.br(0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this);
            }
            return hf.bw(((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this);
        } else if (hd.aq) {
            return hf.bt(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.ai, hfVar.ae, 0, i3, i2, this, hfVar.aq, i4);
        } else {
            return hf.bh(0, 0, ((ht) hfVar.aa).ar, iArr, hfVar.ad, i5, hfVar.aj, 0, i3, i2, this, hfVar.aq, i4);
        }
    }

    public boolean ey() {
        return this.ap != 0;
    }

    public void ez(int i) {
        synchronized (this) {
            if (this.aq < 0) {
                this.aq = -i;
            } else {
                this.aq = i;
            }
        }
    }
}
