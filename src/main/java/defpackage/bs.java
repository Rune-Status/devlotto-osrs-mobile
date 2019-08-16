package defpackage;

/* renamed from: bs */
public final class bs {
    static int[] aa = new int[6];
    static int[] ac = new int[6];
    static final int[][] af;
    static int[] ah = new int[6];
    static int[] ao = new int[6];
    static int[] aw = new int[6];
    static final int[][] ay;
    int[] ad;
    int[] ae;
    boolean ag = true;
    int[] ai;
    int[] aj;
    int[] ak;
    int[] al;
    int[] am;
    int ap;
    int[] aq;
    int[] ar;
    int[] as;
    int au;
    int ax;
    int az;

    static {
        int[] iArr = new int[]{1, 3, 5, 7};
        int[] iArr2 = new int[]{1, 3, 5, 7, 6};
        int[] iArr3 = new int[]{1, 3, 5, 7, 2, 8};
        int[] iArr4 = new int[]{1, 3, 5, 7, 13, 14};
        af = new int[][]{new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7}, iArr, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, iArr2, new int[]{1, 3, 5, 7, 2, 6}, iArr3, new int[]{1, 3, 5, 7, 2, 8}, new int[]{1, 3, 5, 7, 11, 12}, new int[]{1, 3, 5, 7, 11, 12}, iArr4};
        iArr = new int[]{0, 1, 2, 3, 1, 0, 1, 3};
        iArr2 = new int[]{0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4};
        ay = new int[][]{new int[]{0, 1, 2, 3, 0, 0, 1, 3}, new int[]{1, 1, 2, 3, 1, 0, 1, 3}, iArr, new int[]{0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, new int[]{0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, iArr2, new int[]{0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, new int[]{0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, new int[]{0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, new int[]{0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, new int[]{0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, new int[]{1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, new int[]{1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
    }

    bs(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        if (!(i6 == i7 && i6 == i8 && i6 == i9)) {
            this.ag = false;
        }
        this.ap = i;
        this.au = i2;
        this.az = i18;
        this.ax = i19;
        int[] iArr = af[i];
        int length = iArr.length;
        this.ad = new int[length];
        this.aq = new int[length];
        this.ar = new int[length];
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int i25 = i4 * 128;
        int i26 = i5 * 128;
        for (int i27 = 0; i27 < length; i27++) {
            int i28;
            int i29;
            i20 = iArr[i27];
            if ((i20 & 1) == 0 && i20 <= 8) {
                i20 = ((((i20 - i2) - i2) - 1) & 7) + 1;
            }
            if (i20 > 8 && i20 <= 12) {
                i20 = (((i20 - 9) - i2) & 3) + 9;
            }
            if (i20 > 12 && i20 <= 16) {
                i20 = (((i20 - 13) - i2) & 3) + 13;
            }
            if (i20 == 1) {
                i20 = i26;
                i21 = i10;
                i22 = i6;
                i23 = i14;
                i28 = i25;
            } else {
                if (i20 == 2) {
                    i28 = i25 + 64;
                    i21 = (i10 + i11) >> 1;
                    i22 = (i6 + i7) >> 1;
                    i24 = i26;
                    i29 = (i14 + i15) >> 1;
                } else if (i20 == 3) {
                    i28 = i25 + 128;
                    i20 = i26;
                    i21 = i11;
                    i22 = i7;
                    i23 = i15;
                } else {
                    if (i20 == 4) {
                        i28 = i25 + 128;
                        i23 = i26 + 64;
                        i21 = (i11 + i12) >> 1;
                        i20 = (i15 + i16) >> 1;
                        i22 = (i7 + i8) >> 1;
                    } else if (i20 == 5) {
                        i28 = i25 + 128;
                        i20 = i26 + 128;
                        i21 = i12;
                        i22 = i8;
                        i23 = i16;
                    } else if (i20 == 6) {
                        i28 = i25 + 64;
                        i22 = (i8 + i9) >> 1;
                        i20 = (i16 + i17) >> 1;
                        i21 = (i12 + i13) >> 1;
                        i23 = i26 + 128;
                    } else if (i20 == 7) {
                        i20 = i26 + 128;
                        i21 = i13;
                        i22 = i9;
                        i23 = i17;
                        i28 = i25;
                    } else if (i20 == 8) {
                        i21 = (i13 + i10) >> 1;
                        i20 = (i17 + i14) >> 1;
                        i23 = i26 + 64;
                        i22 = (i9 + i6) >> 1;
                        i28 = i25;
                    } else if (i20 == 9) {
                        i28 = i25 + 64;
                        i23 = i26 + 32;
                        i22 = (i6 + i7) >> 1;
                        i21 = (i10 + i11) >> 1;
                        i20 = (i14 + i15) >> 1;
                    } else if (i20 == 10) {
                        i28 = i25 + 96;
                        i23 = i26 + 64;
                        i22 = (i7 + i8) >> 1;
                        i21 = (i11 + i12) >> 1;
                        i20 = (i15 + i16) >> 1;
                    } else if (i20 == 11) {
                        i28 = i25 + 64;
                        i23 = i26 + 96;
                        i22 = (i8 + i9) >> 1;
                        i21 = (i12 + i13) >> 1;
                        i20 = (i16 + i17) >> 1;
                    } else if (i20 == 12) {
                        i28 = i25 + 32;
                        i23 = i26 + 64;
                        i22 = (i9 + i6) >> 1;
                        i21 = (i13 + i10) >> 1;
                        i20 = (i17 + i14) >> 1;
                    } else if (i20 == 13) {
                        i28 = i25 + 32;
                        i23 = i26 + 32;
                        i20 = i14;
                        i21 = i10;
                        i22 = i6;
                    } else if (i20 == 14) {
                        i28 = i25 + 96;
                        i23 = i26 + 32;
                        i20 = i15;
                        i21 = i11;
                        i22 = i7;
                    } else if (i20 == 15) {
                        i28 = i25 + 96;
                        i23 = i26 + 96;
                        i20 = i16;
                        i21 = i12;
                        i22 = i8;
                    } else {
                        i28 = i25 + 32;
                        i23 = i26 + 96;
                        i20 = i17;
                        i21 = i13;
                        i22 = i9;
                    }
                    i24 = i23;
                    i29 = i20;
                }
                this.ad[i27] = i28;
                this.aq[i27] = i22;
                this.ar[i27] = i24;
                iArr2[i27] = i21;
                iArr3[i27] = i29;
            }
            i24 = i20;
            i29 = i23;
            this.ad[i27] = i28;
            this.aq[i27] = i22;
            this.ar[i27] = i24;
            iArr2[i27] = i21;
            iArr3[i27] = i29;
        }
        int[] iArr4 = ay[i];
        i25 = iArr4.length / 4;
        this.ae = new int[i25];
        this.am = new int[i25];
        this.ak = new int[i25];
        this.al = new int[i25];
        this.aj = new int[i25];
        this.ai = new int[i25];
        if (i3 != -1) {
            this.as = new int[i25];
        }
        i22 = 0;
        for (i23 = 0; i23 < i25; i23++) {
            i24 = iArr4[i22];
            i21 = iArr4[i22 + 1];
            i26 = iArr4[i22 + 2];
            i20 = iArr4[i22 + 3];
            i22 += 4;
            if (i21 < 4) {
                i21 = (i21 - i2) & 3;
            }
            if (i26 < 4) {
                i26 = (i26 - i2) & 3;
            }
            if (i20 < 4) {
                i20 = (i20 - i2) & 3;
            }
            this.ae[i23] = i21;
            this.am[i23] = i26;
            this.ak[i23] = i20;
            if (i24 == 0) {
                this.al[i23] = iArr2[i21];
                this.aj[i23] = iArr2[i26];
                this.ai[i23] = iArr2[i20];
                if (this.as != null) {
                    this.as[i23] = -1;
                }
            } else {
                this.al[i23] = iArr3[i21];
                this.aj[i23] = iArr3[i26];
                this.ai[i23] = iArr3[i20];
                if (this.as != null) {
                    this.as[i23] = i3;
                }
            }
        }
        i26 = i7 < i6 ? i7 : i6;
        if (i8 < i26) {
            i26 = i8;
        }
        i20 = i8 > i7 ? i8 : i7;
        if (i9 < i26) {
            i26 = i9;
        }
        if (i9 <= i20) {
            i9 = i20;
        }
        i20 = i26 / 14;
        i20 = i9 / 14;
    }
}
