package defpackage;

/* renamed from: mj */
public final class mj {
    static final int ad = 8;
    static final int aq = 256;
    static final int ar = 1020;
    int ae;
    int[] ai;
    int[] aj;
    int ak;
    int al;
    int am;

    public mj(int[] iArr) {
        try {
            this.ai = new int[256];
            this.aj = new int[256];
            for (int i = 0; i < iArr.length; i++) {
                this.aj[i] = iArr[i];
            }
            al(-131516424);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mj.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static double ad(double d) {
        try {
            return Math.exp(((-d) * d) / 2.0d) / Math.sqrt(6.283185307179586d);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mj.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean ad(int i, int i2, int i3) {
        return 4 != i || i2 < 8;
    }

    public final int ad(int i) {
        try {
            if (this.al * -2041489559 == 0) {
                ar(1979161239);
                this.al = 816371968;
            }
            int[] iArr = this.aj;
            int i2 = this.al - 1613801689;
            this.al = i2;
            return iArr[i2 * -2041489559];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mj.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final int ae() {
        if (this.al * -2041489559 == 0) {
            ar(1979161239);
            this.al = 816371968;
        }
        int[] iArr = this.aj;
        int i = this.al - 1613801689;
        this.al = i;
        return iArr[i * -2041489559];
    }

    /* Access modifiers changed, original: final */
    public final void ag() {
        int i = this.am;
        int i2 = this.ak - 158514527;
        this.ak = i2;
        this.am = i + (i2 * -1169765243);
        for (i = 0; i < 256; i++) {
            i2 = this.ai[i];
            if ((i & 2) == 0) {
                if ((i & 1) == 0) {
                    this.ae = ((this.ae * 1993115063) ^ ((this.ae * 1993115063) << 13)) * 707528977;
                } else {
                    this.ae = ((this.ae * -497460144) ^ ((this.ae * 1993115063) >>> 6)) * -1768265721;
                }
            } else if ((i & 1) == 0) {
                this.ae = ((this.ae * -630976076) ^ ((this.ae * 1993115063) << 2)) * -1768265721;
            } else {
                this.ae = ((this.ae * 1993115063) ^ ((this.ae * -1002939085) >>> 16)) * 1577863928;
            }
            this.ae += this.ai[(i + 128) & 255] * -1739851727;
            int i3 = (this.am * 1087786029) + ((this.ae * -340123749) + this.ai[(i2 & 1020) >> 2]);
            this.ai[i] = i3;
            int[] iArr = this.aj;
            i2 = (i2 + this.ai[((i3 >> 8) & 1020) >> 2]) * -2050366555;
            this.am = i2;
            iArr[i] = i2 * 1087786029;
        }
    }

    public final int ai() {
        if (this.al * -2041489559 == 0) {
            ar(1979161239);
            this.al = 816371968;
        }
        int[] iArr = this.aj;
        int i = this.al - 1613801689;
        this.al = i;
        return iArr[i * -2041489559];
    }

    public final int aj() {
        if (this.al * -2041489559 == 0) {
            ar(1979161239);
            this.al = 816371968;
        }
        int[] iArr = this.aj;
        int i = this.al - 851349248;
        this.al = i;
        return iArr[i * -2041489559];
    }

    public final int ak() {
        if (this.al * -2041489559 == 0) {
            ar(1979161239);
            this.al = 816371968;
        }
        return this.aj[(this.al * -2041489559) - 1];
    }

    /* Access modifiers changed, original: final */
    public final void al(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = -1640531527;
        int i12 = -1640531527;
        int i13 = -1640531527;
        int i14 = -1640531527;
        int i15 = -1640531527;
        int i16 = -1640531527;
        int i17 = -1640531527;
        int i18 = -1640531527;
        for (i2 = 0; i2 < 4; i2++) {
            i11 ^= i12 << 11;
            i13 += i11;
            i12 = (i12 + i14) ^ (i14 >>> 2);
            i15 += i12;
            i14 = (i14 + i13) ^ (i13 << 8);
            i16 += i14;
            i13 = (i13 + i15) ^ (i15 >>> 16);
            i17 += i13;
            i15 = (i15 + i16) ^ (i16 << 10);
            i18 += i15;
            i16 = (i16 + i17) ^ (i17 >>> 4);
            i11 += i16;
            i17 = (i17 + i18) ^ (i18 << 8);
            i12 += i17;
            i18 = (i18 + i11) ^ (i11 >>> 9);
            i14 += i18;
            i11 += i12;
        }
        i2 = 0;
        while (i2 < 256) {
            try {
                i3 = this.aj[i2];
                i4 = i2 + 1;
                i12 += this.aj[i4];
                i5 = i2 + 2;
                i14 += this.aj[i5];
                i6 = i2 + 3;
                i7 = this.aj[i6];
                i8 = i2 + 4;
                i9 = this.aj[i8];
                int i19 = i2 + 5;
                i10 = this.aj[i19];
                int i20 = i2 + 6;
                int i21 = i2 + 7;
                i11 = (i11 + i3) ^ (i12 << 11);
                i13 = (i13 + i7) + i11;
                i12 = (i12 + i14) ^ (i14 >>> 2);
                i15 = (i15 + i9) + i12;
                i14 = (i14 + i13) ^ (i13 << 8);
                i16 = (i16 + i10) + i14;
                i13 = (i13 + i15) ^ (i15 >>> 16);
                i17 = (i17 + this.aj[i20]) + i13;
                i15 = (i15 + i16) ^ (i16 << 10);
                i18 = (i18 + this.aj[i21]) + i15;
                i16 = (i16 + i17) ^ (i17 >>> 4);
                i11 += i16;
                i17 = (i17 + i18) ^ (i18 << 8);
                i12 += i17;
                i18 = (i18 + i11) ^ (i11 >>> 9);
                i14 += i18;
                i11 += i12;
                this.ai[i2] = i11;
                this.ai[i4] = i12;
                this.ai[i5] = i14;
                this.ai[i6] = i13;
                this.ai[i8] = i15;
                this.ai[i19] = i16;
                this.ai[i20] = i17;
                this.ai[i21] = i18;
                i2 += 8;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mj.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        for (int i22 = 0; i22 < 256; i22 += 8) {
            i2 = this.ai[i22];
            i7 = i22 + 1;
            i12 += this.ai[i7];
            i4 = i22 + 2;
            i14 += this.ai[i4];
            i5 = i22 + 3;
            i3 = this.ai[i5];
            i9 = i22 + 4;
            i6 = this.ai[i9];
            i10 = i22 + 5;
            i8 = this.ai[i10];
            int i23 = i22 + 6;
            int i24 = i22 + 7;
            i11 = (i11 + i2) ^ (i12 << 11);
            i13 = (i13 + i3) + i11;
            i12 = (i12 + i14) ^ (i14 >>> 2);
            i15 = (i15 + i6) + i12;
            i14 = (i14 + i13) ^ (i13 << 8);
            i16 = (i16 + i8) + i14;
            i13 = (i13 + i15) ^ (i15 >>> 16);
            i17 = (i17 + this.ai[i23]) + i13;
            i15 = (i15 + i16) ^ (i16 << 10);
            i18 = (i18 + this.ai[i24]) + i15;
            i16 = (i16 + i17) ^ (i17 >>> 4);
            i11 += i16;
            i17 = (i17 + i18) ^ (i18 << 8);
            i12 += i17;
            i18 = (i18 + i11) ^ (i11 >>> 9);
            i14 += i18;
            i11 += i12;
            this.ai[i22] = i11;
            this.ai[i7] = i12;
            this.ai[i4] = i14;
            this.ai[i5] = i13;
            this.ai[i9] = i15;
            this.ai[i10] = i16;
            this.ai[i23] = i17;
            this.ai[i24] = i18;
        }
        ar(1979161239);
        this.al = 816371968;
    }

    public final int am() {
        if (this.al * -2041489559 == 0) {
            ar(1979161239);
            this.al = 816371968;
        }
        return this.aj[(this.al * -2041489559) - 1];
    }

    /* Access modifiers changed, original: final */
    public final void ap() {
        int i = this.am;
        int i2 = this.ak - 158514527;
        this.ak = i2;
        this.am = i + (i2 * -1748290134);
        i = 0;
        while (true) {
            int i3 = i;
            if (i3 < 256) {
                int i4 = this.ai[i3];
                if ((i3 & 2) == 0) {
                    if ((i3 & 1) == 0) {
                        this.ae = ((this.ae * 1593621708) ^ ((this.ae * 1993115063) << 13)) * -1768265721;
                    } else {
                        i2 = ((this.ae * 1993115063) >>> 6) ^ (this.ae * 1993115063);
                        i = 1831376664;
                        this.ae = i * i2;
                    }
                } else if ((i3 & 1) == 0) {
                    i2 = ((this.ae * 1993115063) << 2) ^ (this.ae * 1533418335);
                    i = -1768265721;
                    this.ae = i * i2;
                } else {
                    this.ae = ((this.ae * 1993115063) ^ ((this.ae * 1638979656) >>> 16)) * -1768265721;
                }
                this.ae += this.ai[(i3 + 128) & 255] * 1888898915;
                i2 = (this.am * 511278120) + ((this.ae * 1993115063) + this.ai[(-1829407662 & i4) >> 2]);
                this.ai[i3] = i2;
                int[] iArr = this.aj;
                i2 = (this.ai[((i2 >> 8) & 1020) >> 2] + i4) * 2079740367;
                this.am = i2;
                iArr[i3] = i2 * 1087786029;
                i = i3 + 1;
            } else {
                return;
            }
        }
    }

    public final int aq(int i) {
        try {
            if (this.al * -2041489559 == 0) {
                ar(1979161239);
                this.al = 816371968;
            }
            return this.aj[(this.al * -2041489559) - 1];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mj.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ar(int i) {
        try {
            int i2 = this.am;
            int i3 = this.ak - 158514527;
            this.ak = i3;
            this.am = i2 + (i3 * -708409723);
            for (i2 = 0; i2 < 256; i2++) {
                i3 = this.ai[i2];
                if ((i2 & 2) == 0) {
                    if ((i2 & 1) == 0) {
                        this.ae = ((this.ae * 1993115063) ^ ((this.ae * 1993115063) << 13)) * -1768265721;
                    } else {
                        this.ae = ((this.ae * 1993115063) ^ ((this.ae * 1993115063) >>> 6)) * -1768265721;
                    }
                } else if ((i2 & 1) == 0) {
                    this.ae = ((this.ae * 1993115063) ^ ((this.ae * 1993115063) << 2)) * -1768265721;
                } else {
                    this.ae = ((this.ae * 1993115063) ^ ((this.ae * 1993115063) >>> 16)) * -1768265721;
                }
                this.ae += this.ai[(i2 + 128) & 255] * -1768265721;
                int i4 = (this.am * 1087786029) + ((this.ae * 1993115063) + this.ai[(i3 & 1020) >> 2]);
                this.ai[i2] = i4;
                int[] iArr = this.aj;
                i3 = (i3 + this.ai[((i4 >> 8) & 1020) >> 2]) * -2050366555;
                this.am = i3;
                iArr[i2] = i3 * 1087786029;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mj.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final int as() {
        if (this.al * -2041489559 == 0) {
            ar(1979161239);
            this.al = 816371968;
        }
        return this.aj[(this.al * -2041489559) - 1];
    }

    /* Access modifiers changed, original: final */
    public final void au() {
        int i = this.am;
        int i2 = this.ak + 311801082;
        this.ak = i2;
        this.am = i + (i2 * -2009045592);
        for (i = 0; i < 256; i++) {
            i2 = this.ai[i];
            if ((i & 2) == 0) {
                if ((i & 1) == 0) {
                    this.ae = ((this.ae * 1211287581) ^ ((this.ae * 1993115063) << 13)) * -1768265721;
                } else {
                    this.ae = ((this.ae * 1993115063) ^ ((this.ae * 653147680) >>> 6)) * -1768265721;
                }
            } else if ((i & 1) == 0) {
                this.ae = ((this.ae * -152972119) ^ ((this.ae * -1999228126) << 2)) * -116990249;
            } else {
                this.ae = ((this.ae * 34160247) ^ ((this.ae * -1344640151) >>> 16)) * 1054599994;
            }
            this.ae += this.ai[(i + 128) & 1501675690] * -1768265721;
            int i3 = (this.am * -1988062159) + ((this.ae * 1993115063) + this.ai[(i2 & 1020) >> 2]);
            this.ai[i] = i3;
            int[] iArr = this.aj;
            i2 = (i2 + this.ai[((i3 >> 8) & 532087320) >> 2]) * -1224804266;
            this.am = i2;
            iArr[i] = i2 * 1087786029;
        }
    }

    /* Access modifiers changed, original: final */
    public final void aw() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = -1640531527;
        int i11 = -1640531527;
        int i12 = -1640531527;
        int i13 = -1640531527;
        int i14 = -1640531527;
        int i15 = -1640531527;
        int i16 = -1640531527;
        int i17 = -1640531527;
        for (i = 0; i < 4; i++) {
            i10 ^= i11 << 11;
            i12 += i10;
            i11 = (i11 + i13) ^ (i13 >>> 2);
            i14 += i11;
            i13 = (i13 + i12) ^ (i12 << 8);
            i15 += i13;
            i12 = (i12 + i14) ^ (i14 >>> 16);
            i16 += i12;
            i14 = (i14 + i15) ^ (i15 << 10);
            i17 += i14;
            i15 = (i15 + i16) ^ (i16 >>> 4);
            i10 += i15;
            i16 = (i16 + i17) ^ (i17 << 8);
            i11 += i16;
            i17 = (i17 + i10) ^ (i10 >>> 9);
            i13 += i17;
            i10 += i11;
        }
        for (i = 0; i < 256; i += 8) {
            i2 = this.aj[i];
            i3 = i + 1;
            i11 += this.aj[i3];
            i4 = i + 2;
            i13 += this.aj[i4];
            i5 = i + 3;
            i6 = this.aj[i5];
            i7 = i + 4;
            i8 = this.aj[i7];
            int i18 = i + 5;
            i9 = this.aj[i18];
            int i19 = i + 6;
            int i20 = i + 7;
            i10 = (i10 + i2) ^ (i11 << 11);
            i12 = (i12 + i6) + i10;
            i11 = (i11 + i13) ^ (i13 >>> 2);
            i14 = (i14 + i8) + i11;
            i13 = (i13 + i12) ^ (i12 << 8);
            i15 = (i15 + i9) + i13;
            i12 = (i12 + i14) ^ (i14 >>> 16);
            i16 = (i16 + this.aj[i19]) + i12;
            i14 = (i14 + i15) ^ (i15 << 10);
            i17 = (i17 + this.aj[i20]) + i14;
            i15 = (i15 + i16) ^ (i16 >>> 4);
            i10 += i15;
            i16 = (i16 + i17) ^ (i17 << 8);
            i11 += i16;
            i17 = (i17 + i10) ^ (i10 >>> 9);
            i13 += i17;
            i10 += i11;
            this.ai[i] = i10;
            this.ai[i3] = i11;
            this.ai[i4] = i13;
            this.ai[i5] = i12;
            this.ai[i7] = i14;
            this.ai[i18] = i15;
            this.ai[i19] = i16;
            this.ai[i20] = i17;
        }
        for (int i21 = 0; i21 < 256; i21 += 8) {
            i = this.ai[i21];
            i6 = i21 + 1;
            i11 += this.ai[i6];
            i3 = i21 + 2;
            i13 += this.ai[i3];
            i4 = i21 + 3;
            i2 = this.ai[i4];
            i8 = i21 + 4;
            i5 = this.ai[i8];
            i9 = i21 + 5;
            i7 = this.ai[i9];
            int i22 = i21 + 6;
            int i23 = i21 + 7;
            i10 = (i10 + i) ^ (i11 << 11);
            i12 = (i12 + i2) + i10;
            i11 = (i11 + i13) ^ (i13 >>> 2);
            i14 = (i14 + i5) + i11;
            i13 = (i13 + i12) ^ (i12 << 8);
            i15 = (i15 + i7) + i13;
            i12 = (i12 + i14) ^ (i14 >>> 16);
            i16 = (i16 + this.ai[i22]) + i12;
            i14 = (i14 + i15) ^ (i15 << 10);
            i17 = (i17 + this.ai[i23]) + i14;
            i15 = (i15 + i16) ^ (i16 >>> 4);
            i10 += i15;
            i16 = (i16 + i17) ^ (i17 << 8);
            i11 += i16;
            i17 = (i17 + i10) ^ (i10 >>> 9);
            i13 += i17;
            i10 += i11;
            this.ai[i21] = i10;
            this.ai[i6] = i11;
            this.ai[i3] = i13;
            this.ai[i4] = i12;
            this.ai[i8] = i14;
            this.ai[i9] = i15;
            this.ai[i22] = i16;
            this.ai[i23] = i17;
        }
        ar(1979161239);
        this.al = 816371968;
    }

    /* Access modifiers changed, original: final */
    public final void ax() {
        int i;
        int i2 = -1640531527;
        int i3 = -1640531527;
        int i4 = -1919318763;
        int i5 = -1603341313;
        int i6 = 1520667576;
        int i7 = -1640531527;
        int i8 = -1640531527;
        int i9 = -1640531527;
        for (i = 0; i < 4; i++) {
            i2 ^= i3 << 11;
            i4 += i2;
            i3 = (i3 + i5) ^ (i5 >>> 2);
            i6 += i3;
            i5 = (i5 + i4) ^ (i4 << 8);
            i7 += i5;
            i4 = (i4 + i6) ^ (i6 >>> 16);
            i8 += i4;
            i6 = (i6 + i7) ^ (i7 << 10);
            i9 += i6;
            i7 = (i7 + i8) ^ (i8 >>> 4);
            i2 += i7;
            i8 = (i8 + i9) ^ (i9 << 8);
            i3 += i8;
            i9 = (i9 + i2) ^ (i2 >>> 9);
            i5 += i9;
            i2 += i3;
        }
        for (int i10 = 0; i10 < 256; i10 += 8) {
            i = this.ai[i10];
            int i11 = i10 + 1;
            i3 += this.ai[i11];
            int i12 = i10 + 2;
            i5 += this.ai[i12];
            int i13 = i10 + 3;
            int i14 = this.ai[i13];
            int i15 = i10 + 4;
            int i16 = this.ai[i15];
            int i17 = i10 + 5;
            int i18 = this.ai[i17];
            int i19 = i10 + 6;
            int i20 = i10 + 7;
            i2 = (i2 + i) ^ (i3 << 11);
            i4 = (i4 + i14) + i2;
            i3 = (i3 + i5) ^ (i5 >>> 2);
            i6 = (i6 + i16) + i3;
            i5 = (i5 + i4) ^ (i4 << 8);
            i7 = (i7 + i18) + i5;
            i4 = (i4 + i6) ^ (i6 >>> 16);
            i8 = (i8 + this.ai[i19]) + i4;
            i6 = (i6 + i7) ^ (i7 << 10);
            i9 = (i9 + this.ai[i20]) + i6;
            i7 = (i7 + i8) ^ (i8 >>> 4);
            i2 += i7;
            i8 = (i8 + i9) ^ (i9 << 8);
            i3 += i8;
            i9 = (i9 + i2) ^ (i2 >>> 9);
            i5 += i9;
            i2 += i3;
            this.ai[i10] = i2;
            this.ai[i11] = i3;
            this.ai[i12] = i5;
            this.ai[i13] = i4;
            this.ai[i15] = i6;
            this.ai[i17] = i7;
            this.ai[i19] = i8;
            this.ai[i20] = i9;
        }
        ar(1979161239);
        this.al = -509420839;
    }

    /* Access modifiers changed, original: final */
    public final void az() {
        int i = this.am;
        int i2 = this.ak - 1784715798;
        this.ak = i2;
        this.am = i + (i2 * -708409723);
        for (i = 0; i < 256; i++) {
            i2 = this.ai[i];
            if ((i & 2) == 0) {
                if ((i & 1) == 0) {
                    this.ae = ((this.ae * 328379512) ^ ((this.ae * 1993115063) << 13)) * 1610469717;
                } else {
                    this.ae = ((this.ae * 1993115063) ^ ((this.ae * 1993115063) >>> 6)) * -1768265721;
                }
            } else if ((i & 1) == 0) {
                this.ae = ((this.ae * -711951605) ^ ((this.ae * -801492755) << 2)) * -1768265721;
            } else {
                this.ae = ((this.ae * -1404785409) ^ ((this.ae * -1597455232) >>> 16)) * -1768265721;
            }
            this.ae += this.ai[(i + 128) & 1206798835] * -781160866;
            int i3 = (this.am * 178432368) + ((this.ae * 1993115063) + this.ai[(779923058 & i2) >> 2]);
            this.ai[i] = i3;
            int[] iArr = this.aj;
            i2 = (i2 + this.ai[((i3 >> 8) & -1508224788) >> 2]) * 81082135;
            this.am = i2;
            iArr[i] = i2 * -24832458;
        }
    }
}
