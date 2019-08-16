package defpackage;

import android.support.v4.internal.view.SupportMenu;

/* renamed from: bo */
public class bo extends br {
    static int[] bb = new int[10000];
    static int bc = 0;
    static final int[] bg = bl.ao;
    static int[] bi = new int[10000];
    static final int[] bv = bl.aa;
    short[] aa;
    int[][] ab;
    byte[] ac;
    int ad;
    int[] ae;
    int[] af;
    byte[] ag;
    short[] ah;
    int[] ai;
    int aj;
    byte[] ak;
    int[] al;
    int[] am;
    int[][] an;
    short[] ao;
    byte[] ap;
    int[] aq;
    int[] ar;
    byte[] as;
    bi[] at;
    short[] au;
    bv[] av;
    int aw;
    byte ax;
    int[] ay;
    short[] az;
    public short ba;
    int bd;
    int bf;
    bi[] bk;
    int bl;
    boolean bm;
    int bo;
    int bq;
    public short bs;

    bo() {
        this.ad = 0;
        this.aj = 0;
        this.ax = (byte) 0;
        this.bm = false;
    }

    public bo(bo boVar, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        int i2 = 0;
        this.ad = 0;
        this.aj = 0;
        this.ax = (byte) 0;
        this.bm = false;
        this.ad = boVar.ad;
        this.aj = boVar.aj;
        this.aw = boVar.aw;
        if (z) {
            this.aq = boVar.aq;
            this.ar = boVar.ar;
            this.al = boVar.al;
        } else {
            this.aq = new int[this.ad];
            this.ar = new int[this.ad];
            this.al = new int[this.ad];
            for (i = 0; i < this.ad; i++) {
                this.aq[i] = boVar.aq[i];
                this.ar[i] = boVar.ar[i];
                this.al[i] = boVar.al[i];
            }
        }
        if (z2) {
            this.au = boVar.au;
        } else {
            this.au = new short[this.aj];
            for (i = 0; i < this.aj; i++) {
                this.au[i] = boVar.au[i];
            }
        }
        if (z3 || boVar.az == null) {
            this.az = boVar.az;
        } else {
            this.az = new short[this.aj];
            for (i = 0; i < this.aj; i++) {
                this.az[i] = boVar.az[i];
            }
        }
        if (z4) {
            this.ag = boVar.ag;
        } else {
            this.ag = new byte[this.aj];
            if (boVar.ag == null) {
                for (i = 0; i < this.aj; i++) {
                    this.ag[i] = (byte) 0;
                }
            } else {
                while (i2 < this.aj) {
                    this.ag[i2] = boVar.ag[i2];
                    i2++;
                }
            }
        }
        this.ai = boVar.ai;
        this.ae = boVar.ae;
        this.am = boVar.am;
        this.ak = boVar.ak;
        this.as = boVar.as;
        this.ap = boVar.ap;
        this.ax = boVar.ax;
        this.ac = boVar.ac;
        this.aa = boVar.aa;
        this.ao = boVar.ao;
        this.ah = boVar.ah;
        this.af = boVar.af;
        this.ay = boVar.ay;
        this.an = boVar.an;
        this.ab = boVar.ab;
        this.at = boVar.at;
        this.av = boVar.av;
        this.bk = boVar.bk;
        this.ba = boVar.ba;
        this.bs = boVar.bs;
    }

    bo(byte[] bArr) {
        this.ad = 0;
        this.aj = 0;
        this.ax = (byte) 0;
        this.bm = false;
        if (bArr[bArr.length - 1] == (byte) -1 && bArr[bArr.length - 2] == (byte) -1) {
            aq(bArr);
        } else {
            ar(bArr);
        }
    }

    /* JADX WARNING: Missing block: B:28:0x0073, code skipped:
            if (r13.ax != r8.ax) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bo(bo[] boVarArr, int i) {
        bo boVar;
        this.ad = 0;
        this.aj = 0;
        this.ax = (byte) 0;
        this.bm = false;
        this.ad = 0;
        this.aj = 0;
        this.aw = 0;
        this.ax = (byte) -1;
        int i2 = 0;
        Object obj = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i7 < i) {
            boVar = boVarArr[i7];
            if (boVar != null) {
                this.ad += boVar.ad;
                this.aj += boVar.aj;
                this.aw += boVar.aw;
                if (boVar.as == null) {
                    if (this.ax == (byte) -1) {
                        this.ax = boVar.ax;
                    }
                }
                obj = 1;
                i2 |= boVar.ak != null ? 1 : 0;
                i3 |= boVar.ag != null ? 1 : 0;
                i4 |= boVar.ay != null ? 1 : 0;
                i5 |= boVar.az != null ? 1 : 0;
                i6 |= boVar.ap != null ? 1 : 0;
            }
            i7++;
            i2 = i2;
        }
        this.aq = new int[this.ad];
        this.ar = new int[this.ad];
        this.al = new int[this.ad];
        this.af = new int[this.ad];
        this.ai = new int[this.aj];
        this.ae = new int[this.aj];
        this.am = new int[this.aj];
        if (i2 != 0) {
            this.ak = new byte[this.aj];
        }
        if (obj != null) {
            this.as = new byte[this.aj];
        }
        if (i3 != 0) {
            this.ag = new byte[this.aj];
        }
        if (i4 != 0) {
            this.ay = new int[this.aj];
        }
        if (i5 != 0) {
            this.az = new short[this.aj];
        }
        if (i6 != 0) {
            this.ap = new byte[this.aj];
        }
        this.au = new short[this.aj];
        if (this.aw > 0) {
            this.ac = new byte[this.aw];
            this.aa = new short[this.aw];
            this.ao = new short[this.aw];
            this.ah = new short[this.aw];
        }
        this.ad = 0;
        this.aj = 0;
        this.aw = 0;
        for (i7 = 0; i7 < i; i7++) {
            boVar = boVarArr[i7];
            if (boVar != null) {
                int i8 = 0;
                while (i8 < boVar.aj) {
                    if (!(i2 == 0 || boVar.ak == null)) {
                        this.ak[this.aj] = boVar.ak[i8];
                    }
                    if (obj != null) {
                        if (boVar.as != null) {
                            this.as[this.aj] = boVar.as[i8];
                        } else {
                            this.as[this.aj] = boVar.ax;
                        }
                    }
                    if (!(i3 == 0 || boVar.ag == null)) {
                        this.ag[this.aj] = boVar.ag[i8];
                    }
                    if (!(i4 == 0 || boVar.ay == null)) {
                        this.ay[this.aj] = boVar.ay[i8];
                    }
                    if (i5 != 0) {
                        if (boVar.az != null) {
                            this.az[this.aj] = boVar.az[i8];
                        } else {
                            this.az[this.aj] = (short) -1;
                        }
                    }
                    if (i6 != 0) {
                        if (boVar.ap == null || boVar.ap[i8] == (byte) -1) {
                            this.ap[this.aj] = (byte) -1;
                        } else {
                            this.ap[this.aj] = (byte) (boVar.ap[i8] + this.aw);
                        }
                    }
                    this.au[this.aj] = boVar.au[i8];
                    this.ai[this.aj] = al(boVar, boVar.ai[i8]);
                    this.ae[this.aj] = al(boVar, boVar.ae[i8]);
                    this.am[this.aj] = al(boVar, boVar.am[i8]);
                    this.aj++;
                    i8++;
                }
                for (i8 = 0; i8 < boVar.aw; i8++) {
                    byte[] bArr = this.ac;
                    int i9 = this.aw;
                    byte b = boVar.ac[i8];
                    bArr[i9] = b;
                    if (b == (byte) 0) {
                        this.aa[this.aw] = (short) al(boVar, boVar.aa[i8]);
                        this.ao[this.aw] = (short) al(boVar, boVar.ao[i8]);
                        this.ah[this.aw] = (short) al(boVar, boVar.ah[i8]);
                    }
                    this.aw++;
                }
            }
        }
    }

    public static bo ad(kh khVar, int i, int i2) {
        byte[] ar = khVar.ar(i, i2, 1348247440);
        return ar == null ? null : new bo(ar);
    }

    static void ah(bo boVar, bo boVar2, int i, int i2, int i3, boolean z) {
        int i4;
        boVar.ao();
        boVar.ac();
        boVar2.ao();
        boVar2.ac();
        bc++;
        int[] iArr = boVar2.aq;
        int i5 = boVar2.ad;
        int i6 = 0;
        for (i4 = 0; i4 < boVar.ad; i4++) {
            bi biVar = boVar.at[i4];
            if (biVar.al * 414722111 != 0) {
                int i7 = boVar.ar[i4] - i2;
                if (i7 <= boVar2.bq) {
                    int i8 = boVar.aq[i4] - i;
                    if (i8 >= boVar2.bd && i8 <= boVar2.bo) {
                        int i9 = boVar.al[i4] - i3;
                        if (i9 >= boVar2.bf && i9 <= boVar2.bl) {
                            int i10 = 0;
                            int i11 = i6;
                            while (i10 < i5) {
                                bi biVar2 = boVar2.at[i10];
                                if (i8 != iArr[i10] || i9 != boVar2.al[i10] || i7 != boVar2.ar[i10]) {
                                    i6 = i11;
                                } else if (biVar2.al * 414722111 != 0) {
                                    if (boVar.bk == null) {
                                        boVar.bk = new bi[boVar.ad];
                                    }
                                    if (boVar2.bk == null) {
                                        boVar2.bk = new bi[i5];
                                    }
                                    bi biVar3 = boVar.bk[i4];
                                    if (biVar3 == null) {
                                        bi[] biVarArr = boVar.bk;
                                        biVar3 = new bi(biVar);
                                        biVarArr[i4] = biVar3;
                                    }
                                    bi biVar4 = boVar2.bk[i10];
                                    if (biVar4 == null) {
                                        bi[] biVarArr2 = boVar2.bk;
                                        biVar4 = new bi(biVar2);
                                        biVarArr2[i10] = biVar4;
                                    }
                                    biVar3.ad += biVar2.ad * 1;
                                    biVar3.aq += biVar2.aq * 1;
                                    biVar3.ar += biVar2.ar * 1;
                                    biVar3.al = (biVar2.al * 1) + biVar3.al;
                                    biVar4.ad += biVar.ad * 1;
                                    biVar4.aq += biVar.aq * 1;
                                    biVar4.ar += biVar.ar * 1;
                                    biVar4.al += biVar.al * 1;
                                    i6 = i11 + 1;
                                    bb[i4] = bc;
                                    bi[i10] = bc;
                                } else {
                                    i6 = i11;
                                }
                                i10++;
                                i11 = i6;
                            }
                            i6 = i11;
                        }
                    }
                }
            }
        }
        if (i6 >= 3 && z) {
            i4 = 0;
            while (i4 < boVar.aj) {
                if (bb[boVar.ai[i4]] == bc && bb[boVar.ae[i4]] == bc && bb[boVar.am[i4]] == bc) {
                    if (boVar.ak == null) {
                        boVar.ak = new byte[boVar.aj];
                    }
                    boVar.ak[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < boVar2.aj) {
                if (bi[boVar2.ai[i4]] == bc && bi[boVar2.ae[i4]] == bc && bi[boVar2.am[i4]] == bc) {
                    if (boVar2.ak == null) {
                        boVar2.ak = new byte[boVar2.aj];
                    }
                    boVar2.ak[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    static final int an(int i) {
        return i < 2 ? 2 : i > 126 ? 126 : i;
    }

    public static bo at(kh khVar, int i, int i2) {
        byte[] ar = khVar.ar(i, i2, 1311897459);
        return ar == null ? null : new bo(ar);
    }

    public static bo av(kh khVar, int i, int i2) {
        byte[] ar = khVar.ar(i, i2, 1854779423);
        return ar == null ? null : new bo(ar);
    }

    static final int ay(int i, int i2) {
        int i3 = 2;
        int i4 = ((i & 127) * i2) >> 7;
        if (i4 >= 2) {
            i3 = i4 > 126 ? 126 : i4;
        }
        return i3 + (65408 & i);
    }

    static final int cd(int i, int i2) {
        int i3 = 2;
        int i4 = ((i & 127) * i2) >> 7;
        if (i4 >= 2) {
            i3 = i4 > 126 ? 126 : i4;
        }
        return i3 + (65408 & i);
    }

    static final int cf(int i) {
        return i < 2 ? 2 : i > 126 ? 126 : i;
    }

    static final int cg(int i) {
        return i < 2 ? 2 : i > 126 ? 126 : i;
    }

    static final int ch(int i) {
        return i < 2 ? 2 : i > 126 ? 126 : i;
    }

    static void co(bo boVar, bo boVar2, int i, int i2, int i3, boolean z) {
        int i4;
        boVar.ao();
        boVar.ac();
        boVar2.ao();
        boVar2.ac();
        bc++;
        int[] iArr = boVar2.aq;
        int i5 = boVar2.ad;
        int i6 = 0;
        for (i4 = 0; i4 < boVar.ad; i4++) {
            bi biVar = boVar.at[i4];
            if (biVar.al * 414722111 != 0) {
                int i7 = boVar.ar[i4] - i2;
                if (i7 <= boVar2.bq) {
                    int i8 = boVar.aq[i4] - i;
                    if (i8 >= boVar2.bd && i8 <= boVar2.bo) {
                        int i9 = boVar.al[i4] - i3;
                        if (i9 >= boVar2.bf && i9 <= boVar2.bl) {
                            int i10 = 0;
                            int i11 = i6;
                            while (i10 < i5) {
                                bi biVar2 = boVar2.at[i10];
                                if (i8 != iArr[i10] || i9 != boVar2.al[i10] || i7 != boVar2.ar[i10]) {
                                    i6 = i11;
                                } else if (biVar2.al * 414722111 != 0) {
                                    if (boVar.bk == null) {
                                        boVar.bk = new bi[boVar.ad];
                                    }
                                    if (boVar2.bk == null) {
                                        boVar2.bk = new bi[i5];
                                    }
                                    bi biVar3 = boVar.bk[i4];
                                    if (biVar3 == null) {
                                        bi[] biVarArr = boVar.bk;
                                        biVar3 = new bi(biVar);
                                        biVarArr[i4] = biVar3;
                                    }
                                    bi biVar4 = boVar2.bk[i10];
                                    if (biVar4 == null) {
                                        bi[] biVarArr2 = boVar2.bk;
                                        biVar4 = new bi(biVar2);
                                        biVarArr2[i10] = biVar4;
                                    }
                                    biVar3.ad += biVar2.ad * 1;
                                    biVar3.aq += biVar2.aq * 1;
                                    biVar3.ar += biVar2.ar * 1;
                                    biVar3.al = (biVar2.al * 1) + biVar3.al;
                                    biVar4.ad += biVar.ad * 1;
                                    biVar4.aq += biVar.aq * 1;
                                    biVar4.ar += biVar.ar * 1;
                                    biVar4.al += biVar.al * 1;
                                    i6 = i11 + 1;
                                    bb[i4] = bc;
                                    bi[i10] = bc;
                                } else {
                                    i6 = i11;
                                }
                                i10++;
                                i11 = i6;
                            }
                            i6 = i11;
                        }
                    }
                }
            }
        }
        if (i6 >= 3 && z) {
            i4 = 0;
            while (i4 < boVar.aj) {
                if (bb[boVar.ai[i4]] == bc && bb[boVar.ae[i4]] == bc && bb[boVar.am[i4]] == bc) {
                    if (boVar.ak == null) {
                        boVar.ak = new byte[boVar.aj];
                    }
                    boVar.ak[i4] = (byte) 2;
                }
                i4++;
            }
            i4 = 0;
            while (i4 < boVar2.aj) {
                if (bi[boVar2.ai[i4]] == bc && bi[boVar2.ae[i4]] == bc && bi[boVar2.am[i4]] == bc) {
                    if (boVar2.ak == null) {
                        boVar2.ak = new byte[boVar2.aj];
                    }
                    boVar2.ak[i4] = (byte) 2;
                }
                i4++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa() {
        this.at = null;
        this.bk = null;
        this.av = null;
        this.bm = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final bp ab() {
        return null;
    }

    public void ac() {
        if (this.at == null) {
            int i;
            this.at = new bi[this.ad];
            for (i = 0; i < this.ad; i++) {
                this.at[i] = new bi();
            }
            i = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                int i5 = this.aq[i3] - this.aq[i2];
                int i6 = this.ar[i3] - this.ar[i2];
                int i7 = this.al[i3] - this.al[i2];
                int i8 = this.aq[i4] - this.aq[i2];
                int i9 = this.ar[i4] - this.ar[i2];
                int i10 = this.al[i4] - this.al[i2];
                int i11 = (i6 * i10) - (i9 * i7);
                i7 = (i7 * i8) - (i10 * i5);
                i6 = (i5 * i9) - (i6 * i8);
                while (true) {
                    i5 = i11;
                    if (i5 <= 8192 && i7 <= 8192 && i6 <= 8192 && i5 >= -8192 && i7 >= -8192 && i6 >= -8192) {
                        break;
                    }
                    i11 = i5 >> 1;
                    i7 >>= 1;
                    i6 >>= 1;
                }
                i11 = (int) Math.sqrt((double) (((i5 * i5) + (i7 * i7)) + (i6 * i6)));
                if (i11 <= 0) {
                    i11 = 1;
                }
                i5 = (i5 * 256) / i11;
                i7 = (i7 * 256) / i11;
                i6 = (i6 * 256) / i11;
                byte b = this.ak == null ? (byte) 0 : this.ak[i];
                if (b == (byte) 0) {
                    bi biVar = this.at[i2];
                    i5 *= -695993433;
                    biVar.ad += i5;
                    i7 *= -1731277735;
                    biVar.aq += i7;
                    i6 *= -1904993905;
                    biVar.ar += i6;
                    biVar.al += 208652223;
                    biVar = this.at[i3];
                    biVar.ad += i5;
                    biVar.aq += i7;
                    biVar.ar += i6;
                    biVar.al += 208652223;
                    biVar = this.at[i4];
                    biVar.ad = i5 + biVar.ad;
                    biVar.aq += i7;
                    biVar.ar += i6;
                    biVar.al += 208652223;
                } else if (b == (byte) 1) {
                    if (this.av == null) {
                        this.av = new bv[this.aj];
                    }
                    bv[] bvVarArr = this.av;
                    bv bvVar = new bv();
                    bvVarArr[i] = bvVar;
                    bvVar.ad = 2058008807 * i5;
                    bvVar.aq = -1861728855 * i7;
                    bvVar.ar = 501691771 * i6;
                }
                i++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.af != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.ad; i2++) {
                i3 = this.af[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.an = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.an[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.ad; i2++) {
                i = this.af[i2];
                int[] iArr2 = this.an[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.ay != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.aj; i2++) {
                i3 = this.ay[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.ab = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.ab[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.aj) {
                i2 = this.ay[i4];
                int[] iArr3 = this.ab[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    public final bp af(int i, int i2, int i3, int i4, int i5) {
        int i6;
        ac();
        int sqrt = (((int) Math.sqrt((double) (((i3 * i3) + (i4 * i4)) + (i5 * i5)))) * i2) >> 8;
        bp bpVar = new bp();
        bpVar.au = new int[this.aj];
        bpVar.az = new int[this.aj];
        bpVar.ax = new int[this.aj];
        if (this.aw > 0 && this.ap != null) {
            int i7;
            int[] iArr = new int[this.aw];
            for (i6 = 0; i6 < this.aj; i6++) {
                if (this.ap[i6] != (byte) -1) {
                    i7 = this.ap[i6] & 255;
                    iArr[i7] = iArr[i7] + 1;
                }
            }
            bpVar.af = 0;
            i6 = 0;
            while (i6 < this.aw) {
                if (iArr[i6] > 0 && this.ac[i6] == (byte) 0) {
                    bpVar.af++;
                }
                i6++;
            }
            bpVar.ay = new int[bpVar.af];
            bpVar.an = new int[bpVar.af];
            bpVar.ab = new int[bpVar.af];
            i7 = 0;
            i6 = 0;
            while (i7 < this.aw) {
                if (iArr[i7] <= 0 || this.ac[i7] != (byte) 0) {
                    iArr[i7] = -1;
                } else {
                    bpVar.ay[i6] = this.aa[i7] & SupportMenu.USER_MASK;
                    bpVar.an[i6] = this.ao[i7] & SupportMenu.USER_MASK;
                    bpVar.ab[i6] = this.ah[i7] & SupportMenu.USER_MASK;
                    iArr[i7] = i6;
                    i6++;
                }
                i7++;
            }
            bpVar.aa = new byte[this.aj];
            for (i6 = 0; i6 < this.aj; i6++) {
                if (this.ap[i6] != (byte) -1) {
                    bpVar.aa[i6] = (byte) iArr[this.ap[i6] & 255];
                } else {
                    bpVar.aa[i6] = (byte) -1;
                }
            }
        }
        i6 = 0;
        while (i6 < this.aj) {
            byte b = this.ak == null ? (byte) 0 : this.ak[i6];
            byte b2 = this.ag == null ? (byte) 0 : this.ag[i6];
            short s = this.az == null ? (short) -1 : this.az[i6];
            if (b2 == (byte) -2) {
                b = (byte) 3;
            }
            if (b2 == (byte) -1) {
                b = (byte) 2;
            }
            bi biVar;
            bv bvVar;
            if (s == (short) -1) {
                if (b == (byte) 0) {
                    int i8 = SupportMenu.USER_MASK & this.au[i6];
                    biVar = (this.bk == null || this.bk[this.ai[i6]] == null) ? this.at[this.ai[i6]] : this.bk[this.ai[i6]];
                    bpVar.au[i6] = bo.ay(i8, (((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                    biVar = (this.bk == null || this.bk[this.ae[i6]] == null) ? this.at[this.ae[i6]] : this.bk[this.ae[i6]];
                    bpVar.az[i6] = bo.ay(i8, (((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                    biVar = (this.bk == null || this.bk[this.am[i6]] == null) ? this.at[this.am[i6]] : this.bk[this.am[i6]];
                    bpVar.ax[i6] = bo.ay(i8, (((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                } else if (b == (byte) 1) {
                    bvVar = this.av[i6];
                    bpVar.au[i6] = bo.ay(this.au[i6] & SupportMenu.USER_MASK, ((((bvVar.ar * -1835638349) * i5) + (((bvVar.ad * 1715919575) * i3) + ((bvVar.aq * 1803169433) * i4))) / ((sqrt / 2) + sqrt)) + i);
                    bpVar.ax[i6] = -1;
                } else if (b == (byte) 3) {
                    bpVar.au[i6] = 128;
                    bpVar.ax[i6] = -1;
                } else {
                    bpVar.ax[i6] = -2;
                }
            } else if (b == (byte) 0) {
                biVar = (this.bk == null || this.bk[this.ai[i6]] == null) ? this.at[this.ai[i6]] : this.bk[this.ai[i6]];
                bpVar.au[i6] = bo.an((((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                biVar = (this.bk == null || this.bk[this.ae[i6]] == null) ? this.at[this.ae[i6]] : this.bk[this.ae[i6]];
                bpVar.az[i6] = bo.an((((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                biVar = (this.bk == null || this.bk[this.am[i6]] == null) ? this.at[this.am[i6]] : this.bk[this.am[i6]];
                bpVar.ax[i6] = bo.an((((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
            } else if (b == (byte) 1) {
                bvVar = this.av[i6];
                bpVar.au[i6] = bo.an(((((bvVar.ar * -1835638349) * i5) + (((bvVar.ad * 1715919575) * i3) + ((bvVar.aq * 1803169433) * i4))) / ((sqrt / 2) + sqrt)) + i);
                bpVar.ax[i6] = -1;
            } else {
                bpVar.ax[i6] = -2;
            }
            i6++;
        }
        ae();
        bpVar.aj = this.ad;
        bpVar.ai = this.aq;
        bpVar.ae = this.ar;
        bpVar.am = this.al;
        bpVar.ak = this.aj;
        bpVar.as = this.ai;
        bpVar.ag = this.ae;
        bpVar.ap = this.am;
        bpVar.aw = this.as;
        bpVar.ac = this.ag;
        bpVar.ah = this.ax;
        bpVar.av = this.an;
        bpVar.at = this.ab;
        bpVar.bk = this.af;
        bpVar.ba = this.ay;
        bpVar.ao = this.az;
        return bpVar;
    }

    public void ag(int i) {
        int i2 = bv[i];
        int i3 = bg[i];
        for (int i4 = 0; i4 < this.ad; i4++) {
            int i5 = this.al[i4];
            int i6 = this.aq[i4];
            this.al[i4] = ((this.al[i4] * i3) - (this.aq[i4] * i2)) >> 16;
            this.aq[i4] = ((i5 * i2) + (i6 * i3)) >> 16;
        }
        aa();
    }

    public bo ai(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        ao();
        int i5 = i + this.bd;
        int i6 = i + this.bo;
        int i7 = i3 + this.bf;
        int i8 = i3 + this.bl;
        if (i5 < 0 || ((i6 + 128) >> 7) >= iArr.length || i7 < 0) {
            return this;
        }
        if (((i8 + 128) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 127) >> 7;
        i7 >>= 7;
        i8 = (i8 + 127) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        bo boVar;
        if (z) {
            boVar = new bo();
            boVar.ad = this.ad;
            boVar.aj = this.aj;
            boVar.aw = this.aw;
            boVar.aq = this.aq;
            boVar.al = this.al;
            boVar.ai = this.ai;
            boVar.ae = this.ae;
            boVar.am = this.am;
            boVar.ak = this.ak;
            boVar.as = this.as;
            boVar.ag = this.ag;
            boVar.ap = this.ap;
            boVar.au = this.au;
            boVar.az = this.az;
            boVar.ax = this.ax;
            boVar.ac = this.ac;
            boVar.aa = this.aa;
            boVar.ao = this.ao;
            boVar.ah = this.ah;
            boVar.af = this.af;
            boVar.ay = this.ay;
            boVar.an = this.an;
            boVar.ab = this.ab;
            boVar.ba = this.ba;
            boVar.bs = this.bs;
            boVar.ar = new int[boVar.ad];
        } else {
            boVar = this;
        }
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (i4 == 0) {
            for (i9 = 0; i9 < boVar.ad; i9++) {
                i10 = this.aq[i9] + i;
                i6 = this.al[i9] + i3;
                i7 = i10 & 127;
                i8 = i6 & 127;
                i10 >>= 7;
                i6 >>= 7;
                i11 = iArr[i10][i6];
                i12 = 128 - i7;
                i13 = i10 + 1;
                i14 = iArr[i13][i6];
                i6++;
                boVar.ar[i9] = (((((((iArr[i10][i6] * i12) + (iArr[i13][i6] * i7)) >> 7) * i8) + ((((i11 * i12) + (i14 * i7)) >> 7) * (128 - i8))) >> 7) + this.ar[i9]) - i2;
            }
        } else {
            for (i9 = 0; i9 < boVar.ad; i9++) {
                i10 = ((-this.ar[i9]) << 16) / (this.bx * -1736982785);
                if (i10 < i4) {
                    i6 = this.aq[i9] + i;
                    i7 = this.al[i9] + i3;
                    i8 = i6 & 127;
                    i11 = i7 & 127;
                    i6 >>= 7;
                    i7 >>= 7;
                    i12 = iArr[i6][i7];
                    i13 = 128 - i8;
                    i14 = i6 + 1;
                    int i15 = iArr[i14][i7];
                    i7++;
                    i10 = i4 - i10;
                    boVar.ar[i9] = ((i10 * (((((((iArr[i6][i7] * i13) + (iArr[i14][i7] * i8)) >> 7) * i11) + ((((i12 * i13) + (i15 * i8)) >> 7) * (128 - i11))) >> 7) - i2)) / i4) + this.ar[i9];
                }
            }
        }
        boVar.aa();
        return boVar;
    }

    public bo aj() {
        bo boVar = new bo();
        if (this.ak != null) {
            boVar.ak = new byte[this.aj];
            for (int i = 0; i < this.aj; i++) {
                boVar.ak[i] = this.ak[i];
            }
        }
        boVar.ad = this.ad;
        boVar.aj = this.aj;
        boVar.aw = this.aw;
        boVar.aq = this.aq;
        boVar.ar = this.ar;
        boVar.al = this.al;
        boVar.ai = this.ai;
        boVar.ae = this.ae;
        boVar.am = this.am;
        boVar.as = this.as;
        boVar.ag = this.ag;
        boVar.ap = this.ap;
        boVar.au = this.au;
        boVar.az = this.az;
        boVar.ax = this.ax;
        boVar.ac = this.ac;
        boVar.aa = this.aa;
        boVar.ao = this.ao;
        boVar.ah = this.ah;
        boVar.af = this.af;
        boVar.ay = this.ay;
        boVar.an = this.an;
        boVar.ab = this.ab;
        boVar.at = this.at;
        boVar.av = this.av;
        boVar.ba = this.ba;
        boVar.bs = this.bs;
        return boVar;
    }

    public void ak() {
        for (int i = 0; i < this.ad; i++) {
            this.aq[i] = -this.aq[i];
            this.al[i] = -this.al[i];
        }
        aa();
    }

    /* Access modifiers changed, original: final */
    public final int al(bo boVar, int i) {
        int i2 = boVar.aq[i];
        int i3 = boVar.ar[i];
        int i4 = boVar.al[i];
        int i5 = 0;
        while (i5 < this.ad) {
            if (i2 == this.aq[i5] && i3 == this.ar[i5] && i4 == this.al[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.aq[this.ad] = i2;
        this.ar[this.ad] = i3;
        this.al[this.ad] = i4;
        if (boVar.af != null) {
            this.af[this.ad] = boVar.af[i];
        }
        i5 = this.ad;
        this.ad = i5 + 1;
        return i5;
    }

    public void am() {
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.aq[i];
            this.aq[i] = this.al[i];
            this.al[i] = -i2;
        }
        aa();
    }

    /* Access modifiers changed, original: 0000 */
    public void ao() {
        int i = 0;
        if (!this.bm) {
            this.bx = 0;
            this.bq = 0;
            this.bd = 999999;
            this.bo = -999999;
            this.bl = -99999;
            this.bf = 99999;
            while (i < this.ad) {
                int i2 = this.aq[i];
                int i3 = this.ar[i];
                int i4 = this.al[i];
                if (i2 < this.bd) {
                    this.bd = i2;
                }
                if (i2 > this.bo) {
                    this.bo = i2;
                }
                if (i4 < this.bf) {
                    this.bf = i4;
                }
                if (i4 > this.bl) {
                    this.bl = i4;
                }
                i2 = -i3;
                if (i2 > this.bx * -1736982785) {
                    this.bx = i2 * 134693119;
                }
                if (i3 > this.bq) {
                    this.bq = i3;
                }
                i++;
            }
            this.bm = true;
        }
    }

    public void ap(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad; i4++) {
            int[] iArr = this.aq;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ar;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.al;
            iArr[i4] = iArr[i4] + i3;
        }
        aa();
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        lj ljVar;
        int i5;
        lj ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        lj ljVar3 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2.al = (bArr.length - 23) * -879823907;
        int an = ljVar2.an(-1464407032);
        int an2 = ljVar2.an(-1464407032);
        int af = ljVar2.af(1804771424);
        int af2 = ljVar2.af(1804771424);
        int af3 = ljVar2.af(1804771424);
        int af4 = ljVar2.af(1804771424);
        int af5 = ljVar2.af(1804771424);
        int af6 = ljVar2.af(1804771424);
        int af7 = ljVar2.af(1804771424);
        int an3 = ljVar2.an(-1464407032);
        int an4 = ljVar2.an(-1464407032);
        int an5 = ljVar2.an(-1464407032);
        int an6 = ljVar2.an(-1464407032);
        int an7 = ljVar2.an(-1464407032);
        if (af > 0) {
            this.ac = new byte[af];
            ljVar2.al = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            for (i4 = 0; i4 < af; i4++) {
                byte[] bArr2 = this.ac;
                byte ay = ljVar2.ay(1739046782);
                bArr2[i4] = ay;
                if (ay == (byte) 0) {
                    i++;
                }
                if (ay >= (byte) 1 && ay <= (byte) 3) {
                    i2++;
                }
                if (ay == (byte) 2) {
                    i3++;
                }
            }
            ljVar = ljVar3;
            i4 = i;
            i5 = i3;
        } else {
            i2 = 0;
            ljVar = ljVar3;
            i4 = 0;
            i5 = 0;
        }
        int i6 = af + an;
        int i7 = af2 == 1 ? i6 + an2 : i6;
        int i8 = i7 + an2;
        int i9 = af3 == 255 ? i8 + an2 : i8;
        i = af5 == 1 ? i9 + an2 : i9;
        int i10 = af7 == 1 ? i + an : i;
        int i11 = af4 == 1 ? i10 + an2 : i10;
        int i12 = i11 + an6;
        i3 = af6 == 1 ? (an2 * 2) + i12 : i12;
        an7 += i3;
        an6 = (an2 * 2) + an7;
        an3 += an6;
        an4 += an3;
        int i13 = an4 + an5;
        int i14 = i13 + (i4 * 6);
        i4 = i2 * 6;
        int i15 = i14 + i4;
        int i16 = i15 + i4;
        int i17 = i2 * 2;
        int i18 = i16 + i17;
        int i19 = i18 + i2;
        this.ad = an;
        this.aj = an2;
        this.aw = af;
        this.aq = new int[an];
        this.ar = new int[an];
        this.al = new int[an];
        this.ai = new int[an2];
        this.ae = new int[an2];
        this.am = new int[an2];
        if (af7 == 1) {
            this.af = new int[an];
        }
        if (af2 == 1) {
            this.ak = new byte[an2];
        }
        if (af3 == 255) {
            this.as = new byte[an2];
        } else {
            this.ax = (byte) af3;
        }
        if (af4 == 1) {
            this.ag = new byte[an2];
        }
        if (af5 == 1) {
            this.ay = new int[an2];
        }
        if (af6 == 1) {
            this.az = new short[an2];
        }
        if (af6 == 1 && af > 0) {
            this.ap = new byte[an2];
        }
        this.au = new short[an2];
        if (af > 0) {
            this.aa = new short[af];
            this.ao = new short[af];
            this.ah = new short[af];
        }
        ljVar2.al = -879823907 * af;
        ljVar2.al = -879823907 * an6;
        ljVar2.al = -879823907 * an3;
        ljVar2.al = -879823907 * an4;
        ljVar.al = i * -879823907;
        an6 = 0;
        i2 = 0;
        i4 = 0;
        i = 0;
        while (true) {
            an3 = i;
            an4 = i4;
            an5 = i2;
            if (an6 >= an) {
                break;
            }
            int af8 = ljVar2.af(1804771424);
            i2 = (af8 & 1) != 0 ? ljVar2.bo((byte) -71) : 0;
            i4 = (af8 & 2) != 0 ? ljVar2.bo((byte) 1) : 0;
            i = (af8 & 4) != 0 ? ljVar2.bo((byte) -35) : 0;
            this.aq[an6] = i2 + an5;
            this.ar[an6] = i4 + an4;
            this.al[an6] = i + an3;
            i2 = this.aq[an6];
            i4 = this.ar[an6];
            i = this.al[an6];
            if (af7 == 1) {
                this.af[an6] = ljVar.af(1804771424);
            }
            an6++;
        }
        ljVar2.al = -879823907 * an7;
        ljVar2.al = -879823907 * i6;
        ljVar2.al = -879823907 * i8;
        ljVar2.al = -879823907 * i10;
        ljVar.al = -879823907 * i9;
        ljVar2.al = i12 * -879823907;
        ljVar2.al = i3 * -879823907;
        i3 = 0;
        while (i3 < an2) {
            this.au[i3] = (short) ljVar2.an(-1464407032);
            if (af2 == 1) {
                this.ak[i3] = ljVar2.ay(-154164328);
            }
            if (af3 == 255) {
                this.as[i3] = ljVar2.ay(-1218280055);
            }
            if (af4 == 1) {
                this.ag[i3] = ljVar2.ay(-1083593044);
            }
            if (af5 == 1) {
                this.ay[i3] = ljVar.af(1804771424);
            }
            if (af6 == 1) {
                this.az[i3] = (short) (ljVar2.an(-1464407032) - 1);
            }
            if (!(this.ap == null || this.az[i3] == (short) -1)) {
                this.ap[i3] = (byte) (ljVar2.af(1804771424) - 1);
            }
            i3++;
        }
        ljVar2.al = -879823907 * i11;
        ljVar2.al = -879823907 * i7;
        i4 = 0;
        i2 = 0;
        i = 0;
        i12 = 0;
        an5 = 0;
        while (an5 < an2) {
            an4 = ljVar2.af(1804771424);
            if (an4 == 1) {
                i = ljVar2.bo((byte) -68) + i4;
                i12 = ljVar2.bo((byte) 14) + i;
                i3 = ljVar2.bo((byte) -1) + i12;
                this.ai[an5] = i;
                this.ae[an5] = i12;
                this.am[an5] = i3;
                i4 = i3;
                i2 = i3;
            }
            if (an4 == 2) {
                i3 = ljVar2.bo((byte) -36) + i4;
                this.ai[an5] = i;
                this.ae[an5] = i2;
                this.am[an5] = i3;
                i4 = i3;
                an3 = i3;
                i12 = i2;
            } else {
                an3 = i2;
            }
            if (an4 == 3) {
                i3 = ljVar2.bo((byte) -103) + i4;
                this.ai[an5] = an3;
                this.ae[an5] = i12;
                this.am[an5] = i3;
                i4 = i3;
                i = an3;
                i2 = i3;
            } else {
                i2 = an3;
            }
            if (an4 == 4) {
                i2 = ljVar2.bo((byte) -94) + i4;
                this.ai[an5] = i12;
                this.ae[an5] = i;
                this.am[an5] = i2;
                i3 = i12;
                i4 = i2;
                an3 = i2;
                an4 = i;
            } else {
                i3 = i;
                an3 = i2;
                an4 = i12;
            }
            an5++;
            i = i3;
            i2 = an3;
            i12 = an4;
        }
        ljVar2.al = -879823907 * i13;
        ljVar2.al = -879823907 * i14;
        ljVar2.al = -879823907 * i15;
        ljVar2.al = -879823907 * i16;
        ljVar.al = -879823907 * i18;
        ljVar2.al = -879823907 * i19;
        for (i3 = 0; i3 < af; i3++) {
            if ((this.ac[i3] & 255) == 0) {
                this.aa[i3] = (short) ljVar2.an(-1464407032);
                this.ao[i3] = (short) ljVar2.an(-1464407032);
                this.ah[i3] = (short) ljVar2.an(-1464407032);
            }
        }
        ljVar2.al = (((i5 * 2) + i17) + i19) * -879823907;
        if (ljVar2.af(1804771424) != 0) {
            bz bzVar = new bz();
            ljVar2.an(-1464407032);
            ljVar2.an(-1464407032);
            ljVar2.an(-1464407032);
            ljVar2.at((byte) -114);
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02f0 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ar(byte[] bArr) {
        int i;
        int i2;
        lj ljVar = new lj(bArr);
        lj ljVar2 = new lj(bArr);
        lj ljVar3 = new lj(bArr);
        ljVar3 = new lj(bArr);
        ljVar3 = new lj(bArr);
        ljVar.al = (bArr.length - 18) * -879823907;
        int an = ljVar.an(-1464407032);
        int an2 = ljVar.an(-1464407032);
        int af = ljVar.af(1804771424);
        int af2 = ljVar.af(1804771424);
        int af3 = ljVar.af(1804771424);
        int af4 = ljVar.af(1804771424);
        int af5 = ljVar.af(1804771424);
        int af6 = ljVar.af(1804771424);
        int an3 = ljVar.an(-1464407032);
        int an4 = ljVar.an(-1464407032);
        ljVar.an(-1464407032);
        int an5 = ljVar.an(-1464407032);
        int i3 = an + 0;
        int i4 = i3 + an2;
        int i5 = af3 == 255 ? i4 + an2 : i4;
        int i6 = af5 == 1 ? i5 + an2 : i5;
        int i7 = af2 == 1 ? i6 + an2 : i6;
        int i8 = af6 == 1 ? i7 + an : i7;
        int i9 = af4 == 1 ? i8 + an2 : i8;
        int i10 = i9 + an5;
        int i11 = i10 + (an2 * 2);
        an5 = (af * 6) + i11;
        an3 += an5;
        this.ad = an;
        this.aj = an2;
        this.aw = af;
        this.aq = new int[an];
        this.ar = new int[an];
        this.al = new int[an];
        this.ai = new int[an2];
        this.ae = new int[an2];
        this.am = new int[an2];
        if (af > 0) {
            this.ac = new byte[af];
            this.aa = new short[af];
            this.ao = new short[af];
            this.ah = new short[af];
        }
        if (af6 == 1) {
            this.af = new int[an];
        }
        if (af2 == 1) {
            this.ak = new byte[an2];
            this.ap = new byte[an2];
            this.az = new short[an2];
        }
        if (af3 == 255) {
            this.as = new byte[an2];
        } else {
            this.ax = (byte) af3;
        }
        if (af4 == 1) {
            this.ag = new byte[an2];
        }
        if (af5 == 1) {
            this.ay = new int[an2];
        }
        this.au = new short[an2];
        ljVar.al = 0;
        ljVar2.al = an5 * -879823907;
        ljVar3.al = -879823907 * an3;
        ljVar3.al = (an3 + an4) * -879823907;
        ljVar3.al = i7 * -879823907;
        int i12 = 0;
        an4 = 0;
        an3 = 0;
        i7 = 0;
        while (true) {
            an5 = i7;
            i = an3;
            i2 = an4;
            if (i12 >= an) {
                break;
            }
            int af7 = ljVar.af(1804771424);
            an4 = (af7 & 1) != 0 ? ljVar2.bo((byte) -49) : 0;
            an3 = (af7 & 2) != 0 ? ljVar3.bo((byte) -33) : 0;
            i7 = (af7 & 4) != 0 ? ljVar3.bo((byte) -96) : 0;
            this.aq[i12] = an4 + i2;
            this.ar[i12] = an3 + i;
            this.al[i12] = i7 + an5;
            an4 = this.aq[i12];
            an3 = this.ar[i12];
            i7 = this.al[i12];
            if (af6 == 1) {
                this.af[i12] = ljVar3.af(1804771424);
            }
            i12++;
        }
        ljVar.al = -879823907 * i10;
        ljVar2.al = -879823907 * i6;
        ljVar3.al = -879823907 * i4;
        ljVar3.al = i8 * -879823907;
        ljVar3.al = -879823907 * i5;
        Object obj = null;
        Object obj2 = null;
        an3 = 0;
        while (an3 < an2) {
            Object obj3;
            this.au[an3] = (short) ljVar.an(-1464407032);
            if (af2 == 1) {
                i7 = ljVar2.af(1804771424);
                if ((i7 & 1) == 1) {
                    this.ak[an3] = (byte) 1;
                    obj = 1;
                } else {
                    this.ak[an3] = (byte) 0;
                }
                if ((i7 & 2) == 2) {
                    this.ap[an3] = (byte) (i7 >> 2);
                    this.az[an3] = this.au[an3];
                    this.au[an3] = (short) 127;
                    if (this.az[an3] != (short) -1) {
                        obj3 = 1;
                        if (af3 == 255) {
                            this.as[an3] = ljVar3.ay(1726245049);
                        }
                        if (af4 == 1) {
                            this.ag[an3] = ljVar3.ay(-187040544);
                        }
                        if (af5 != 1) {
                            this.ay[an3] = ljVar3.af(1804771424);
                        }
                        an3++;
                        obj2 = obj3;
                    }
                } else {
                    this.ap[an3] = (byte) -1;
                    this.az[an3] = (short) -1;
                }
            }
            obj3 = obj2;
            if (af3 == 255) {
            }
            if (af4 == 1) {
            }
            if (af5 != 1) {
            }
            an3++;
            obj2 = obj3;
        }
        ljVar.al = i9 * -879823907;
        ljVar2.al = -879823907 * i3;
        i9 = 0;
        i = 0;
        an3 = 0;
        an5 = 0;
        i12 = 0;
        while (i12 < an2) {
            i2 = ljVar2.af(1804771424);
            if (i2 == 1) {
                i = ljVar.bo((byte) -106) + i9;
                an5 = ljVar.bo((byte) -3) + i;
                i7 = ljVar.bo((byte) -67) + an5;
                this.ai[i12] = i;
                this.ae[i12] = an5;
                this.am[i12] = i7;
                i9 = i7;
                an3 = i7;
            }
            if (i2 == 2) {
                i7 = ljVar.bo((byte) -43) + i9;
                this.ai[i12] = i;
                this.ae[i12] = an3;
                this.am[i12] = i7;
                i9 = i7;
                an4 = i7;
                an5 = an3;
            } else {
                an4 = an3;
            }
            if (i2 == 3) {
                an3 = i9 + ljVar.bo((byte) -125);
                this.ai[i12] = an4;
                this.ae[i12] = an5;
                this.am[i12] = an3;
                i9 = an3;
                i = an4;
                i7 = an3;
            } else {
                i7 = an4;
            }
            if (i2 == 4) {
                i7 = ljVar.bo((byte) -35) + i9;
                this.ai[i12] = an5;
                this.ae[i12] = i;
                this.am[i12] = i7;
                i9 = i7;
                an3 = i7;
                an4 = an5;
                i2 = i;
            } else {
                an3 = i7;
                an4 = i;
                i2 = an5;
            }
            i12++;
            i = an4;
            an5 = i2;
        }
        ljVar.al = -879823907 * i11;
        for (i9 = 0; i9 < af; i9++) {
            this.ac[i9] = (byte) 0;
            this.aa[i9] = (short) ljVar.an(-1464407032);
            this.ao[i9] = (short) ljVar.an(-1464407032);
            this.ah[i9] = (short) ljVar.an(-1464407032);
        }
        i7 = 0;
        if (this.ap != null) {
            Object obj4 = null;
            while (i7 < an2) {
                an3 = this.ap[i7] & 255;
                if (an3 != 255) {
                    if ((this.aa[an3] & SupportMenu.USER_MASK) == this.ai[i7] && (this.ao[an3] & SupportMenu.USER_MASK) == this.ae[i7] && (this.ah[an3] & SupportMenu.USER_MASK) == this.am[i7]) {
                        this.ap[i7] = (byte) -1;
                    } else {
                        obj4 = 1;
                    }
                }
                i7++;
            }
            if (obj4 == null) {
                this.ap = null;
            }
        }
        if (obj2 == null) {
            this.az = null;
        }
        if (obj == null) {
            this.ak = null;
        }
    }

    public void as() {
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.al[i];
            this.al[i] = this.aq[i];
            this.aq[i] = -i2;
        }
        aa();
    }

    public void au(short s, short s2) {
        for (int i = 0; i < this.aj; i++) {
            if (this.au[i] == s) {
                this.au[i] = s2;
            }
        }
    }

    public void aw(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad; i4++) {
            this.aq[i4] = (this.aq[i4] * i) / 128;
            this.ar[i4] = (this.ar[i4] * i2) / 128;
            this.al[i4] = (this.al[i4] * i3) / 128;
        }
        aa();
    }

    public void ax() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.ad; i++) {
            this.al[i] = -this.al[i];
        }
        while (i2 < this.aj) {
            i = this.ai[i2];
            this.ai[i2] = this.am[i2];
            this.am[i2] = i;
            i2++;
        }
        aa();
    }

    public void az(short s, short s2) {
        if (this.az != null) {
            for (int i = 0; i < this.aj; i++) {
                if (this.az[i] == s) {
                    this.az[i] = s2;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ba(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        lj ljVar;
        int i5;
        lj ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        lj ljVar3 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2.al = (bArr.length - 23) * -879823907;
        int an = ljVar2.an(-1464407032);
        int an2 = ljVar2.an(-1464407032);
        int af = ljVar2.af(1804771424);
        int af2 = ljVar2.af(1804771424);
        int af3 = ljVar2.af(1804771424);
        int af4 = ljVar2.af(1804771424);
        int af5 = ljVar2.af(1804771424);
        int af6 = ljVar2.af(1804771424);
        int af7 = ljVar2.af(1804771424);
        int an3 = ljVar2.an(-1464407032);
        int an4 = ljVar2.an(-1464407032);
        int an5 = ljVar2.an(-1464407032);
        int an6 = ljVar2.an(-1464407032);
        int an7 = ljVar2.an(-1464407032);
        if (af > 0) {
            this.ac = new byte[af];
            ljVar2.al = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            for (i4 = 0; i4 < af; i4++) {
                byte[] bArr2 = this.ac;
                byte ay = ljVar2.ay(-1891467394);
                bArr2[i4] = ay;
                if (ay == (byte) 0) {
                    i++;
                }
                if (ay >= (byte) 1 && ay <= (byte) 3) {
                    i2++;
                }
                if (ay == (byte) 2) {
                    i3++;
                }
            }
            ljVar = ljVar3;
            i4 = i;
            i5 = i3;
        } else {
            i2 = 0;
            ljVar = ljVar3;
            i4 = 0;
            i5 = 0;
        }
        int i6 = af + an;
        int i7 = af2 == 1 ? i6 + an2 : i6;
        int i8 = i7 + an2;
        int i9 = af3 == 255 ? i8 + an2 : i8;
        i = af5 == 1 ? i9 + an2 : i9;
        int i10 = af7 == 1 ? i + an : i;
        int i11 = af4 == 1 ? i10 + an2 : i10;
        int i12 = i11 + an6;
        i3 = af6 == 1 ? (an2 * 2) + i12 : i12;
        an7 += i3;
        an6 = (an2 * 2) + an7;
        an3 += an6;
        an4 += an3;
        int i13 = an4 + an5;
        int i14 = i13 + (i4 * 6);
        i4 = i2 * 6;
        int i15 = i14 + i4;
        int i16 = i15 + i4;
        int i17 = i2 * 2;
        int i18 = i16 + i17;
        int i19 = i18 + i2;
        this.ad = an;
        this.aj = an2;
        this.aw = af;
        this.aq = new int[an];
        this.ar = new int[an];
        this.al = new int[an];
        this.ai = new int[an2];
        this.ae = new int[an2];
        this.am = new int[an2];
        if (af7 == 1) {
            this.af = new int[an];
        }
        if (af2 == 1) {
            this.ak = new byte[an2];
        }
        if (af3 == 255) {
            this.as = new byte[an2];
        } else {
            this.ax = (byte) af3;
        }
        if (af4 == 1) {
            this.ag = new byte[an2];
        }
        if (af5 == 1) {
            this.ay = new int[an2];
        }
        if (af6 == 1) {
            this.az = new short[an2];
        }
        if (af6 == 1 && af > 0) {
            this.ap = new byte[an2];
        }
        this.au = new short[an2];
        if (af > 0) {
            this.aa = new short[af];
            this.ao = new short[af];
            this.ah = new short[af];
        }
        ljVar2.al = -879823907 * af;
        ljVar2.al = -879823907 * an6;
        ljVar2.al = -879823907 * an3;
        ljVar2.al = -879823907 * an4;
        ljVar.al = i * -879823907;
        an6 = 0;
        i2 = 0;
        i4 = 0;
        i = 0;
        while (true) {
            an3 = i;
            an4 = i4;
            an5 = i2;
            if (an6 >= an) {
                break;
            }
            int af8 = ljVar2.af(1804771424);
            i2 = (af8 & 1) != 0 ? ljVar2.bo((byte) -32) : 0;
            i4 = (af8 & 2) != 0 ? ljVar2.bo((byte) 2) : 0;
            i = (af8 & 4) != 0 ? ljVar2.bo((byte) -16) : 0;
            this.aq[an6] = i2 + an5;
            this.ar[an6] = i4 + an4;
            this.al[an6] = i + an3;
            i2 = this.aq[an6];
            i4 = this.ar[an6];
            i = this.al[an6];
            if (af7 == 1) {
                this.af[an6] = ljVar.af(1804771424);
            }
            an6++;
        }
        ljVar2.al = -879823907 * an7;
        ljVar2.al = -879823907 * i6;
        ljVar2.al = -879823907 * i8;
        ljVar2.al = -879823907 * i10;
        ljVar.al = -879823907 * i9;
        ljVar2.al = i12 * -879823907;
        ljVar2.al = i3 * -879823907;
        i3 = 0;
        while (i3 < an2) {
            this.au[i3] = (short) ljVar2.an(-1464407032);
            if (af2 == 1) {
                this.ak[i3] = ljVar2.ay(686751140);
            }
            if (af3 == 255) {
                this.as[i3] = ljVar2.ay(2037544770);
            }
            if (af4 == 1) {
                this.ag[i3] = ljVar2.ay(2074018831);
            }
            if (af5 == 1) {
                this.ay[i3] = ljVar.af(1804771424);
            }
            if (af6 == 1) {
                this.az[i3] = (short) (ljVar2.an(-1464407032) - 1);
            }
            if (!(this.ap == null || this.az[i3] == (short) -1)) {
                this.ap[i3] = (byte) (ljVar2.af(1804771424) - 1);
            }
            i3++;
        }
        ljVar2.al = -879823907 * i11;
        ljVar2.al = -879823907 * i7;
        i3 = 0;
        an3 = 0;
        i = 0;
        i2 = 0;
        an5 = 0;
        while (an5 < an2) {
            an4 = ljVar2.af(1804771424);
            if (an4 == 1) {
                an3 = ljVar2.bo((byte) -35) + i3;
                i2 = ljVar2.bo((byte) -94) + an3;
                i12 = ljVar2.bo((byte) -42) + i2;
                this.ai[an5] = an3;
                this.ae[an5] = i2;
                this.am[an5] = i12;
                i3 = i12;
                i = i12;
            }
            if (an4 == 2) {
                i12 = ljVar2.bo((byte) -3) + i3;
                this.ai[an5] = an3;
                this.ae[an5] = i;
                this.am[an5] = i12;
                i3 = i12;
                i4 = i12;
                i2 = i;
            } else {
                i4 = i;
            }
            if (an4 == 3) {
                i = ljVar2.bo((byte) 0) + i3;
                this.ai[an5] = i4;
                this.ae[an5] = i2;
                this.am[an5] = i;
                i3 = i;
                an3 = i4;
                i12 = i;
            } else {
                i12 = i4;
            }
            if (an4 == 4) {
                i12 = ljVar2.bo((byte) -122) + i3;
                this.ai[an5] = i2;
                this.ae[an5] = an3;
                this.am[an5] = i12;
                i3 = i12;
                i = i12;
                i4 = i2;
                an4 = an3;
            } else {
                i = i12;
                i4 = an3;
                an4 = i2;
            }
            an5++;
            an3 = i4;
            i2 = an4;
        }
        ljVar2.al = -879823907 * i13;
        ljVar2.al = -879823907 * i14;
        ljVar2.al = -879823907 * i15;
        ljVar2.al = -879823907 * i16;
        ljVar.al = -879823907 * i18;
        ljVar2.al = -879823907 * i19;
        for (i3 = 0; i3 < af; i3++) {
            if ((this.ac[i3] & 255) == 0) {
                this.aa[i3] = (short) ljVar2.an(-1464407032);
                this.ao[i3] = (short) ljVar2.an(-1464407032);
                this.ah[i3] = (short) ljVar2.an(-1464407032);
            }
        }
        ljVar2.al = (((i5 * 2) + i17) + i19) * -879823907;
        if (ljVar2.af(1804771424) != 0) {
            bz bzVar = new bz();
            ljVar2.an(-1464407032);
            ljVar2.an(-1464407032);
            ljVar2.an(-1464407032);
            ljVar2.at((byte) -73);
        }
    }

    public bo bb() {
        bo boVar = new bo();
        if (this.ak != null) {
            boVar.ak = new byte[this.aj];
            for (int i = 0; i < this.aj; i++) {
                boVar.ak[i] = this.ak[i];
            }
        }
        boVar.ad = this.ad;
        boVar.aj = this.aj;
        boVar.aw = this.aw;
        boVar.aq = this.aq;
        boVar.ar = this.ar;
        boVar.al = this.al;
        boVar.ai = this.ai;
        boVar.ae = this.ae;
        boVar.am = this.am;
        boVar.as = this.as;
        boVar.ag = this.ag;
        boVar.ap = this.ap;
        boVar.au = this.au;
        boVar.az = this.az;
        boVar.ax = this.ax;
        boVar.ac = this.ac;
        boVar.aa = this.aa;
        boVar.ao = this.ao;
        boVar.ah = this.ah;
        boVar.af = this.af;
        boVar.ay = this.ay;
        boVar.an = this.an;
        boVar.ab = this.ab;
        boVar.at = this.at;
        boVar.av = this.av;
        boVar.ba = this.ba;
        boVar.bs = this.bs;
        return boVar;
    }

    public bo bc() {
        bo boVar = new bo();
        if (this.ak != null) {
            boVar.ak = new byte[this.aj];
            for (int i = 0; i < this.aj; i++) {
                boVar.ak[i] = this.ak[i];
            }
        }
        boVar.ad = this.ad;
        boVar.aj = this.aj;
        boVar.aw = this.aw;
        boVar.aq = this.aq;
        boVar.ar = this.ar;
        boVar.al = this.al;
        boVar.ai = this.ai;
        boVar.ae = this.ae;
        boVar.am = this.am;
        boVar.as = this.as;
        boVar.ag = this.ag;
        boVar.ap = this.ap;
        boVar.au = this.au;
        boVar.az = this.az;
        boVar.ax = this.ax;
        boVar.ac = this.ac;
        boVar.aa = this.aa;
        boVar.ao = this.ao;
        boVar.ah = this.ah;
        boVar.af = this.af;
        boVar.ay = this.ay;
        boVar.an = this.an;
        boVar.ab = this.ab;
        boVar.at = this.at;
        boVar.av = this.av;
        boVar.ba = this.ba;
        boVar.bs = this.bs;
        return boVar;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02ef A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bd(byte[] bArr) {
        int i;
        int i2;
        lj ljVar = new lj(bArr);
        lj ljVar2 = new lj(bArr);
        lj ljVar3 = new lj(bArr);
        ljVar3 = new lj(bArr);
        ljVar3 = new lj(bArr);
        ljVar.al = (bArr.length - 18) * -879823907;
        int an = ljVar.an(-1464407032);
        int an2 = ljVar.an(-1464407032);
        int af = ljVar.af(1804771424);
        int af2 = ljVar.af(1804771424);
        int af3 = ljVar.af(1804771424);
        int af4 = ljVar.af(1804771424);
        int af5 = ljVar.af(1804771424);
        int af6 = ljVar.af(1804771424);
        int an3 = ljVar.an(-1464407032);
        int an4 = ljVar.an(-1464407032);
        ljVar.an(-1464407032);
        int an5 = ljVar.an(-1464407032);
        int i3 = an + 0;
        int i4 = i3 + an2;
        int i5 = af3 == 255 ? i4 + an2 : i4;
        int i6 = af5 == 1 ? i5 + an2 : i5;
        int i7 = af2 == 1 ? i6 + an2 : i6;
        int i8 = af6 == 1 ? i7 + an : i7;
        int i9 = af4 == 1 ? i8 + an2 : i8;
        int i10 = i9 + an5;
        int i11 = i10 + (an2 * 2);
        an5 = (af * 6) + i11;
        an3 += an5;
        this.ad = an;
        this.aj = an2;
        this.aw = af;
        this.aq = new int[an];
        this.ar = new int[an];
        this.al = new int[an];
        this.ai = new int[an2];
        this.ae = new int[an2];
        this.am = new int[an2];
        if (af > 0) {
            this.ac = new byte[af];
            this.aa = new short[af];
            this.ao = new short[af];
            this.ah = new short[af];
        }
        if (af6 == 1) {
            this.af = new int[an];
        }
        if (af2 == 1) {
            this.ak = new byte[an2];
            this.ap = new byte[an2];
            this.az = new short[an2];
        }
        if (af3 == 255) {
            this.as = new byte[an2];
        } else {
            this.ax = (byte) af3;
        }
        if (af4 == 1) {
            this.ag = new byte[an2];
        }
        if (af5 == 1) {
            this.ay = new int[an2];
        }
        this.au = new short[an2];
        ljVar.al = 0;
        ljVar2.al = an5 * -879823907;
        ljVar3.al = -879823907 * an3;
        ljVar3.al = (an3 + an4) * -879823907;
        ljVar3.al = i7 * -879823907;
        int i12 = 0;
        an4 = 0;
        an3 = 0;
        i7 = 0;
        while (true) {
            an5 = i7;
            i = an3;
            i2 = an4;
            if (i12 >= an) {
                break;
            }
            int af7 = ljVar.af(1804771424);
            an4 = (af7 & 1) != 0 ? ljVar2.bo((byte) -31) : 0;
            an3 = (af7 & 2) != 0 ? ljVar3.bo((byte) -106) : 0;
            i7 = (af7 & 4) != 0 ? ljVar3.bo((byte) -2) : 0;
            this.aq[i12] = an4 + i2;
            this.ar[i12] = an3 + i;
            this.al[i12] = i7 + an5;
            an4 = this.aq[i12];
            an3 = this.ar[i12];
            i7 = this.al[i12];
            if (af6 == 1) {
                this.af[i12] = ljVar3.af(1804771424);
            }
            i12++;
        }
        ljVar.al = -879823907 * i10;
        ljVar2.al = -879823907 * i6;
        ljVar3.al = -879823907 * i4;
        ljVar3.al = i8 * -879823907;
        ljVar3.al = -879823907 * i5;
        Object obj = null;
        Object obj2 = null;
        an3 = 0;
        while (an3 < an2) {
            Object obj3;
            this.au[an3] = (short) ljVar.an(-1464407032);
            if (af2 == 1) {
                i7 = ljVar2.af(1804771424);
                if ((i7 & 1) == 1) {
                    this.ak[an3] = (byte) 1;
                    obj = 1;
                } else {
                    this.ak[an3] = (byte) 0;
                }
                if ((i7 & 2) == 2) {
                    this.ap[an3] = (byte) (i7 >> 2);
                    this.az[an3] = this.au[an3];
                    this.au[an3] = (short) 127;
                    if (this.az[an3] != (short) -1) {
                        obj3 = 1;
                        if (af3 == 255) {
                            this.as[an3] = ljVar3.ay(209467974);
                        }
                        if (af4 == 1) {
                            this.ag[an3] = ljVar3.ay(1204679752);
                        }
                        if (af5 != 1) {
                            this.ay[an3] = ljVar3.af(1804771424);
                        }
                        an3++;
                        obj2 = obj3;
                    }
                } else {
                    this.ap[an3] = (byte) -1;
                    this.az[an3] = (short) -1;
                }
            }
            obj3 = obj2;
            if (af3 == 255) {
            }
            if (af4 == 1) {
            }
            if (af5 != 1) {
            }
            an3++;
            obj2 = obj3;
        }
        ljVar.al = i9 * -879823907;
        ljVar2.al = -879823907 * i3;
        i9 = 0;
        i = 0;
        an3 = 0;
        an5 = 0;
        i12 = 0;
        while (i12 < an2) {
            i2 = ljVar2.af(1804771424);
            if (i2 == 1) {
                i = ljVar.bo((byte) 8) + i9;
                an5 = ljVar.bo((byte) -102) + i;
                i7 = ljVar.bo((byte) -72) + an5;
                this.ai[i12] = i;
                this.ae[i12] = an5;
                this.am[i12] = i7;
                i9 = i7;
                an3 = i7;
            }
            if (i2 == 2) {
                i7 = ljVar.bo((byte) -15) + i9;
                this.ai[i12] = i;
                this.ae[i12] = an3;
                this.am[i12] = i7;
                i9 = i7;
                an4 = i7;
                an5 = an3;
            } else {
                an4 = an3;
            }
            if (i2 == 3) {
                an3 = i9 + ljVar.bo((byte) -73);
                this.ai[i12] = an4;
                this.ae[i12] = an5;
                this.am[i12] = an3;
                i9 = an3;
                i = an4;
                i7 = an3;
            } else {
                i7 = an4;
            }
            if (i2 == 4) {
                i7 = ljVar.bo((byte) 13) + i9;
                this.ai[i12] = an5;
                this.ae[i12] = i;
                this.am[i12] = i7;
                i9 = i7;
                an3 = i7;
                an4 = an5;
                i2 = i;
            } else {
                an3 = i7;
                an4 = i;
                i2 = an5;
            }
            i12++;
            i = an4;
            an5 = i2;
        }
        ljVar.al = -879823907 * i11;
        for (i9 = 0; i9 < af; i9++) {
            this.ac[i9] = (byte) 0;
            this.aa[i9] = (short) ljVar.an(-1464407032);
            this.ao[i9] = (short) ljVar.an(-1464407032);
            this.ah[i9] = (short) ljVar.an(-1464407032);
        }
        i7 = 0;
        if (this.ap != null) {
            Object obj4 = null;
            while (i7 < an2) {
                an3 = this.ap[i7] & 255;
                if (an3 != 255) {
                    if ((this.aa[an3] & SupportMenu.USER_MASK) == this.ai[i7] && (this.ao[an3] & SupportMenu.USER_MASK) == this.ae[i7] && (this.ah[an3] & SupportMenu.USER_MASK) == this.am[i7]) {
                        this.ap[i7] = (byte) -1;
                    } else {
                        obj4 = 1;
                    }
                }
                i7++;
            }
            if (obj4 == null) {
                this.ap = null;
            }
        }
        if (obj2 == null) {
            this.az = null;
        }
        if (obj == null) {
            this.ak = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void be() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.af != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.ad; i2++) {
                i3 = this.af[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.an = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.an[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.ad; i2++) {
                i = this.af[i2];
                int[] iArr2 = this.an[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.ay != null) {
            iArr = new int[-1689351654];
            i = 0;
            for (i2 = 0; i2 < this.aj; i2++) {
                i3 = this.ay[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.ab = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.ab[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.aj) {
                i2 = this.ay[i4];
                int[] iArr3 = this.ab[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final int bf(bo boVar, int i) {
        int i2 = boVar.aq[i];
        int i3 = boVar.ar[i];
        int i4 = boVar.al[i];
        int i5 = 0;
        while (i5 < this.ad) {
            if (i2 == this.aq[i5] && i3 == this.ar[i5] && i4 == this.al[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.aq[this.ad] = i2;
        this.ar[this.ad] = i3;
        this.al[this.ad] = i4;
        if (boVar.af != null) {
            this.af[this.ad] = boVar.af[i];
        }
        i5 = this.ad;
        this.ad = i5 + 1;
        return i5;
    }

    public bo bg() {
        bo boVar = new bo();
        if (this.ak != null) {
            boVar.ak = new byte[this.aj];
            for (int i = 0; i < this.aj; i++) {
                boVar.ak[i] = this.ak[i];
            }
        }
        boVar.ad = this.ad;
        boVar.aj = this.aj;
        boVar.aw = this.aw;
        boVar.aq = this.aq;
        boVar.ar = this.ar;
        boVar.al = this.al;
        boVar.ai = this.ai;
        boVar.ae = this.ae;
        boVar.am = this.am;
        boVar.as = this.as;
        boVar.ag = this.ag;
        boVar.ap = this.ap;
        boVar.au = this.au;
        boVar.az = this.az;
        boVar.ax = this.ax;
        boVar.ac = this.ac;
        boVar.aa = this.aa;
        boVar.ao = this.ao;
        boVar.ah = this.ah;
        boVar.af = this.af;
        boVar.ay = this.ay;
        boVar.an = this.an;
        boVar.ab = this.ab;
        boVar.at = this.at;
        boVar.av = this.av;
        boVar.ba = this.ba;
        boVar.bs = this.bs;
        return boVar;
    }

    public void bh() {
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.aq[i];
            this.aq[i] = this.al[i];
            this.al[i] = -i2;
        }
        aa();
    }

    public bo bi() {
        bo boVar = new bo();
        if (this.ak != null) {
            boVar.ak = new byte[this.aj];
            for (int i = 0; i < this.aj; i++) {
                boVar.ak[i] = this.ak[i];
            }
        }
        boVar.ad = this.ad;
        boVar.aj = this.aj;
        boVar.aw = this.aw;
        boVar.aq = this.aq;
        boVar.ar = this.ar;
        boVar.al = this.al;
        boVar.ai = this.ai;
        boVar.ae = this.ae;
        boVar.am = this.am;
        boVar.as = this.as;
        boVar.ag = this.ag;
        boVar.ap = this.ap;
        boVar.au = this.au;
        boVar.az = this.az;
        boVar.ax = this.ax;
        boVar.ac = this.ac;
        boVar.aa = this.aa;
        boVar.ao = this.ao;
        boVar.ah = this.ah;
        boVar.af = this.af;
        boVar.ay = this.ay;
        boVar.an = this.an;
        boVar.ab = this.ab;
        boVar.at = this.at;
        boVar.av = this.av;
        boVar.ba = this.ba;
        boVar.bs = this.bs;
        return boVar;
    }

    public void bj() {
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.aq[i];
            this.aq[i] = this.al[i];
            this.al[i] = -i2;
        }
        aa();
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        lj ljVar;
        int i5;
        lj ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        lj ljVar3 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2.al = (bArr.length - 23) * -572688668;
        int an = ljVar2.an(-1464407032);
        int an2 = ljVar2.an(-1464407032);
        int af = ljVar2.af(1804771424);
        int af2 = ljVar2.af(1804771424);
        int af3 = ljVar2.af(1804771424);
        int af4 = ljVar2.af(1804771424);
        int af5 = ljVar2.af(1804771424);
        int af6 = ljVar2.af(1804771424);
        int af7 = ljVar2.af(1804771424);
        int an3 = ljVar2.an(-1464407032);
        int an4 = ljVar2.an(-1464407032);
        int an5 = ljVar2.an(-1464407032);
        int an6 = ljVar2.an(-1464407032);
        int an7 = ljVar2.an(-1464407032);
        if (af > 0) {
            this.ac = new byte[af];
            ljVar2.al = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            for (i4 = 0; i4 < af; i4++) {
                byte[] bArr2 = this.ac;
                byte ay = ljVar2.ay(-1881016699);
                bArr2[i4] = ay;
                if (ay == (byte) 0) {
                    i++;
                }
                if (ay >= (byte) 1 && ay <= (byte) 3) {
                    i2++;
                }
                if (ay == (byte) 2) {
                    i3++;
                }
            }
            ljVar = ljVar3;
            i5 = i3;
            i4 = i;
        } else {
            i2 = 0;
            ljVar = ljVar3;
            i5 = 0;
            i4 = 0;
        }
        int i6 = af + an;
        int i7 = af2 == 1 ? i6 + an2 : i6;
        int i8 = i7 + an2;
        int i9 = af3 == 255 ? i8 + an2 : i8;
        i = af5 == 1 ? i9 + an2 : i9;
        int i10 = af7 == 1 ? i + an : i;
        int i11 = af4 == 1 ? i10 + an2 : i10;
        int i12 = i11 + an6;
        i3 = af6 == 1 ? (an2 * 2) + i12 : i12;
        an7 += i3;
        an6 = (an2 * 2) + an7;
        an3 += an6;
        an4 += an3;
        int i13 = an4 + an5;
        int i14 = i13 + (i4 * 6);
        i4 = i2 * 6;
        int i15 = i14 + i4;
        int i16 = i15 + i4;
        int i17 = i2 * 2;
        int i18 = i16 + i17;
        int i19 = i18 + i2;
        this.ad = an;
        this.aj = an2;
        this.aw = af;
        this.aq = new int[an];
        this.ar = new int[an];
        this.al = new int[an];
        this.ai = new int[an2];
        this.ae = new int[an2];
        this.am = new int[an2];
        if (af7 == 1) {
            this.af = new int[an];
        }
        if (af2 == 1) {
            this.ak = new byte[an2];
        }
        if (af3 == 255) {
            this.as = new byte[an2];
        } else {
            this.ax = (byte) af3;
        }
        if (af4 == 1) {
            this.ag = new byte[an2];
        }
        if (af5 == 1) {
            this.ay = new int[an2];
        }
        if (af6 == 1) {
            this.az = new short[an2];
        }
        if (af6 == 1 && af > 0) {
            this.ap = new byte[an2];
        }
        this.au = new short[an2];
        if (af > 0) {
            this.aa = new short[af];
            this.ao = new short[af];
            this.ah = new short[af];
        }
        ljVar2.al = 688772884 * af;
        ljVar2.al = -879823907 * an6;
        ljVar2.al = -879823907 * an3;
        ljVar2.al = -879823907 * an4;
        ljVar.al = i * -879823907;
        an6 = 0;
        i2 = 0;
        i4 = 0;
        i = 0;
        while (true) {
            an3 = i;
            an4 = i4;
            an5 = i2;
            if (an6 >= an) {
                break;
            }
            int af8 = ljVar2.af(1804771424);
            i2 = (af8 & 1) != 0 ? ljVar2.bo((byte) -48) : 0;
            i4 = (af8 & 2) != 0 ? ljVar2.bo((byte) -63) : 0;
            i = (af8 & 4) != 0 ? ljVar2.bo((byte) -76) : 0;
            this.aq[an6] = i2 + an5;
            this.ar[an6] = i4 + an4;
            this.al[an6] = i + an3;
            i2 = this.aq[an6];
            i4 = this.ar[an6];
            i = this.al[an6];
            if (af7 == 1) {
                this.af[an6] = ljVar.af(1804771424);
            }
            an6++;
        }
        ljVar2.al = -879823907 * an7;
        ljVar2.al = -879823907 * i6;
        ljVar2.al = -879823907 * i8;
        ljVar2.al = -879823907 * i10;
        ljVar.al = 1217201281 * i9;
        ljVar2.al = i12 * -1118024188;
        ljVar2.al = i3 * -879823907;
        i3 = 0;
        while (i3 < an2) {
            this.au[i3] = (short) ljVar2.an(-1464407032);
            if (af2 == 1) {
                this.ak[i3] = ljVar2.ay(1817391836);
            }
            if (af3 == 255) {
                this.as[i3] = ljVar2.ay(-1487062154);
            }
            if (af4 == 1) {
                this.ag[i3] = ljVar2.ay(-525867294);
            }
            if (af5 == 1) {
                this.ay[i3] = ljVar.af(1804771424);
            }
            if (af6 == 1) {
                this.az[i3] = (short) (ljVar2.an(-1464407032) - 1);
            }
            if (!(this.ap == null || this.az[i3] == (short) -1)) {
                this.ap[i3] = (byte) (ljVar2.af(1804771424) - 1);
            }
            i3++;
        }
        ljVar2.al = 1862983440 * i11;
        ljVar2.al = -879823907 * i7;
        i3 = 0;
        an3 = 0;
        i = 0;
        i2 = 0;
        an5 = 0;
        while (an5 < an2) {
            an4 = ljVar2.af(1804771424);
            if (an4 == 1) {
                an3 = ljVar2.bo((byte) -24) + i3;
                i2 = ljVar2.bo((byte) -102) + an3;
                i12 = ljVar2.bo((byte) -13) + i2;
                this.ai[an5] = an3;
                this.ae[an5] = i2;
                this.am[an5] = i12;
                i3 = i12;
                i = i12;
            }
            if (an4 == 2) {
                i12 = ljVar2.bo((byte) -62) + i3;
                this.ai[an5] = an3;
                this.ae[an5] = i;
                this.am[an5] = i12;
                i3 = i12;
                i4 = i12;
                i2 = i;
            } else {
                i4 = i;
            }
            if (an4 == 3) {
                i = i3 + ljVar2.bo((byte) -57);
                this.ai[an5] = i4;
                this.ae[an5] = i2;
                this.am[an5] = i;
                i3 = i;
                an3 = i4;
                i12 = i;
            } else {
                i12 = i4;
            }
            if (an4 == 4) {
                i12 = ljVar2.bo((byte) -36) + i3;
                this.ai[an5] = i2;
                this.ae[an5] = an3;
                this.am[an5] = i12;
                i3 = i12;
                i = i12;
                i4 = i2;
                an4 = an3;
            } else {
                i = i12;
                i4 = an3;
                an4 = i2;
            }
            an5++;
            an3 = i4;
            i2 = an4;
        }
        ljVar2.al = -879823907 * i13;
        ljVar2.al = -879823907 * i14;
        ljVar2.al = -879823907 * i15;
        ljVar2.al = 818663677 * i16;
        ljVar.al = -879823907 * i18;
        ljVar2.al = 1796123881 * i19;
        for (i3 = 0; i3 < af; i3++) {
            if ((this.ac[i3] & 255) == 0) {
                this.aa[i3] = (short) ljVar2.an(-1464407032);
                this.ao[i3] = (short) ljVar2.an(-1464407032);
                this.ah[i3] = (short) ljVar2.an(-1464407032);
            }
        }
        ljVar2.al = (((i5 * 2) + i17) + i19) * -879823907;
        if (ljVar2.af(1804771424) != 0) {
            bz bzVar = new bz();
            ljVar2.an(-1464407032);
            ljVar2.an(-1464407032);
            ljVar2.an(-1464407032);
            ljVar2.at((byte) -6);
        }
    }

    /* Access modifiers changed, original: final */
    public final int bl(bo boVar, int i) {
        int i2 = boVar.aq[i];
        int i3 = boVar.ar[i];
        int i4 = boVar.al[i];
        int i5 = 0;
        while (i5 < this.ad) {
            if (i2 == this.aq[i5] && i3 == this.ar[i5] && i4 == this.al[i5]) {
                break;
            }
            i5++;
        }
        i5 = -1;
        if (i5 != -1) {
            return i5;
        }
        this.aq[this.ad] = i2;
        this.ar[this.ad] = i3;
        this.al[this.ad] = i4;
        if (boVar.af != null) {
            this.af[this.ad] = boVar.af[i];
        }
        i5 = this.ad;
        this.ad = i5 + 1;
        return i5;
    }

    /* Access modifiers changed, original: 0000 */
    public void bm(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        lj ljVar;
        int i5;
        lj ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        lj ljVar3 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2.al = (bArr.length - 23) * -879823907;
        int an = ljVar2.an(-1464407032);
        int an2 = ljVar2.an(-1464407032);
        int af = ljVar2.af(1804771424);
        int af2 = ljVar2.af(1804771424);
        int af3 = ljVar2.af(1804771424);
        int af4 = ljVar2.af(1804771424);
        int af5 = ljVar2.af(1804771424);
        int af6 = ljVar2.af(1804771424);
        int af7 = ljVar2.af(1804771424);
        int an3 = ljVar2.an(-1464407032);
        int an4 = ljVar2.an(-1464407032);
        int an5 = ljVar2.an(-1464407032);
        int an6 = ljVar2.an(-1464407032);
        int an7 = ljVar2.an(-1464407032);
        if (af > 0) {
            this.ac = new byte[af];
            ljVar2.al = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            for (i4 = 0; i4 < af; i4++) {
                byte[] bArr2 = this.ac;
                byte ay = ljVar2.ay(-741664361);
                bArr2[i4] = ay;
                if (ay == (byte) 0) {
                    i++;
                }
                if (ay >= (byte) 1 && ay <= (byte) 3) {
                    i2++;
                }
                if (ay == (byte) 2) {
                    i3++;
                }
            }
            ljVar = ljVar3;
            i5 = i3;
            i4 = i;
        } else {
            i2 = 0;
            ljVar = ljVar3;
            i5 = 0;
            i4 = 0;
        }
        int i6 = af + an;
        int i7 = af2 == 1 ? i6 + an2 : i6;
        int i8 = i7 + an2;
        int i9 = af3 == -1831602249 ? i8 + an2 : i8;
        i = af5 == 1 ? i9 + an2 : i9;
        int i10 = af7 == 1 ? i + an : i;
        int i11 = af4 == 1 ? i10 + an2 : i10;
        int i12 = i11 + an6;
        i3 = af6 == 1 ? (an2 * 2) + i12 : i12;
        an7 += i3;
        an6 = (an2 * 2) + an7;
        an3 += an6;
        an4 += an3;
        int i13 = an4 + an5;
        int i14 = i13 + (i4 * 6);
        i4 = i2 * 6;
        int i15 = i14 + i4;
        int i16 = i15 + i4;
        int i17 = i2 * 2;
        int i18 = i16 + i17;
        int i19 = i18 + i2;
        this.ad = an;
        this.aj = an2;
        this.aw = af;
        this.aq = new int[an];
        this.ar = new int[an];
        this.al = new int[an];
        this.ai = new int[an2];
        this.ae = new int[an2];
        this.am = new int[an2];
        if (af7 == 1) {
            this.af = new int[an];
        }
        if (af2 == 1) {
            this.ak = new byte[an2];
        }
        if (af3 == 1790595237) {
            this.as = new byte[an2];
        } else {
            this.ax = (byte) af3;
        }
        if (af4 == 1) {
            this.ag = new byte[an2];
        }
        if (af5 == 1) {
            this.ay = new int[an2];
        }
        if (af6 == 1) {
            this.az = new short[an2];
        }
        if (af6 == 1 && af > 0) {
            this.ap = new byte[an2];
        }
        this.au = new short[an2];
        if (af > 0) {
            this.aa = new short[af];
            this.ao = new short[af];
            this.ah = new short[af];
        }
        ljVar2.al = -879823907 * af;
        ljVar2.al = 20800263 * an6;
        ljVar2.al = 607362585 * an3;
        ljVar2.al = -1226775064 * an4;
        ljVar.al = i * 2091419300;
        an6 = 0;
        i2 = 0;
        i4 = 0;
        i = 0;
        while (true) {
            an3 = i;
            an4 = i4;
            an5 = i2;
            if (an6 >= an) {
                break;
            }
            int af8 = ljVar2.af(1804771424);
            i2 = (af8 & 1) != 0 ? ljVar2.bo((byte) -101) : 0;
            i4 = (af8 & 2) != 0 ? ljVar2.bo((byte) 13) : 0;
            i = (af8 & 4) != 0 ? ljVar2.bo((byte) -46) : 0;
            this.aq[an6] = i2 + an5;
            this.ar[an6] = i4 + an4;
            this.al[an6] = i + an3;
            i2 = this.aq[an6];
            i4 = this.ar[an6];
            i = this.al[an6];
            if (af7 == 1) {
                this.af[an6] = ljVar.af(1804771424);
            }
            an6++;
        }
        ljVar2.al = 1029670937 * an7;
        ljVar2.al = -417976102 * i6;
        ljVar2.al = 2120365061 * i8;
        ljVar2.al = 1945520802 * i10;
        ljVar.al = 1238733123 * i9;
        ljVar2.al = i12 * -879823907;
        ljVar2.al = i3 * -879823907;
        i3 = 0;
        while (i3 < an2) {
            this.au[i3] = (short) ljVar2.an(-1464407032);
            if (af2 == 1) {
                this.ak[i3] = ljVar2.ay(-1688380360);
            }
            if (af3 == 172753646) {
                this.as[i3] = ljVar2.ay(-1226702124);
            }
            if (af4 == 1) {
                this.ag[i3] = ljVar2.ay(589342408);
            }
            if (af5 == 1) {
                this.ay[i3] = ljVar.af(1804771424);
            }
            if (af6 == 1) {
                this.az[i3] = (short) (ljVar2.an(-1464407032) - 1);
            }
            if (!(this.ap == null || this.az[i3] == (short) -1)) {
                this.ap[i3] = (byte) (ljVar2.af(1804771424) - 1);
            }
            i3++;
        }
        ljVar2.al = -879823907 * i11;
        ljVar2.al = 1288674244 * i7;
        i3 = 0;
        i2 = 0;
        an3 = 0;
        i = 0;
        an5 = 0;
        while (an5 < an2) {
            an4 = ljVar2.af(1804771424);
            if (an4 == 1) {
                i2 = ljVar2.bo((byte) 14) + i3;
                an3 = ljVar2.bo((byte) -31) + i2;
                i12 = ljVar2.bo((byte) -127) + an3;
                this.ai[an5] = i2;
                this.ae[an5] = an3;
                this.am[an5] = i12;
                i3 = i12;
                i = i12;
            }
            if (an4 == 2) {
                i12 = ljVar2.bo((byte) -82) + i3;
                this.ai[an5] = i2;
                this.ae[an5] = i;
                this.am[an5] = i12;
                i3 = i12;
                i4 = i12;
                an3 = i;
            } else {
                i4 = i;
            }
            if (an4 == 3) {
                i = i3 + ljVar2.bo((byte) -56);
                this.ai[an5] = i4;
                this.ae[an5] = an3;
                this.am[an5] = i;
                i3 = i;
                i2 = i4;
                i12 = i;
            } else {
                i12 = i4;
            }
            if (an4 == 4) {
                i12 = ljVar2.bo((byte) -105) + i3;
                this.ai[an5] = an3;
                this.ae[an5] = i2;
                this.am[an5] = i12;
                i3 = i12;
                i = i12;
                i4 = i2;
                an4 = an3;
            } else {
                i = i12;
                i4 = an3;
                an4 = i2;
            }
            an5++;
            an3 = i4;
            i2 = an4;
        }
        ljVar2.al = 662055269 * i13;
        ljVar2.al = 1123164996 * i14;
        ljVar2.al = -1303491321 * i15;
        ljVar2.al = 1750127336 * i16;
        ljVar.al = 1505787223 * i18;
        ljVar2.al = -879823907 * i19;
        for (i3 = 0; i3 < af; i3++) {
            if ((this.ac[i3] & 255) == 0) {
                this.aa[i3] = (short) ljVar2.an(-1464407032);
                this.ao[i3] = (short) ljVar2.an(-1464407032);
                this.ah[i3] = (short) ljVar2.an(-1464407032);
            }
        }
        ljVar2.al = 182645123 * (((i5 * 2) + i17) + i19);
        if (ljVar2.af(1804771424) != 0) {
            bz bzVar = new bz();
            ljVar2.an(-1464407032);
            ljVar2.an(-1464407032);
            ljVar2.an(-1464407032);
            ljVar2.at((byte) -126);
        }
    }

    public void bn() {
        for (int i = 0; i < this.ad; i++) {
            this.aq[i] = -this.aq[i];
            this.al[i] = -this.al[i];
        }
        aa();
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(byte[] bArr) {
        int i;
        int i2;
        lj ljVar = new lj(bArr);
        lj ljVar2 = new lj(bArr);
        lj ljVar3 = new lj(bArr);
        ljVar3 = new lj(bArr);
        ljVar3 = new lj(bArr);
        ljVar.al = (bArr.length - 18) * -879823907;
        int an = ljVar.an(-1464407032);
        int an2 = ljVar.an(-1464407032);
        int af = ljVar.af(1804771424);
        int af2 = ljVar.af(1804771424);
        int af3 = ljVar.af(1804771424);
        int af4 = ljVar.af(1804771424);
        int af5 = ljVar.af(1804771424);
        int af6 = ljVar.af(1804771424);
        int an3 = ljVar.an(-1464407032);
        int an4 = ljVar.an(-1464407032);
        ljVar.an(-1464407032);
        int an5 = ljVar.an(-1464407032);
        int i3 = an + 0;
        int i4 = i3 + an2;
        int i5 = af3 == 2001622457 ? i4 + an2 : i4;
        int i6 = af5 == 1 ? i5 + an2 : i5;
        int i7 = af2 == 1 ? i6 + an2 : i6;
        int i8 = af6 == 1 ? i7 + an : i7;
        int i9 = af4 == 1 ? i8 + an2 : i8;
        int i10 = i9 + an5;
        int i11 = i10 + (an2 * 2);
        an5 = (af * 6) + i11;
        an3 += an5;
        this.ad = an;
        this.aj = an2;
        this.aw = af;
        this.aq = new int[an];
        this.ar = new int[an];
        this.al = new int[an];
        this.ai = new int[an2];
        this.ae = new int[an2];
        this.am = new int[an2];
        if (af > 0) {
            this.ac = new byte[af];
            this.aa = new short[af];
            this.ao = new short[af];
            this.ah = new short[af];
        }
        if (af6 == 1) {
            this.af = new int[an];
        }
        if (af2 == 1) {
            this.ak = new byte[an2];
            this.ap = new byte[an2];
            this.az = new short[an2];
        }
        if (af3 == 255) {
            this.as = new byte[an2];
        } else {
            this.ax = (byte) af3;
        }
        if (af4 == 1) {
            this.ag = new byte[an2];
        }
        if (af5 == 1) {
            this.ay = new int[an2];
        }
        this.au = new short[an2];
        ljVar.al = 0;
        ljVar2.al = an5 * -879823907;
        ljVar3.al = -879823907 * an3;
        ljVar3.al = (an3 + an4) * 531446611;
        ljVar3.al = i7 * -879823907;
        int i12 = 0;
        an4 = 0;
        an3 = 0;
        i7 = 0;
        while (true) {
            an5 = i7;
            i = an3;
            i2 = an4;
            if (i12 >= an) {
                break;
            }
            int af7 = ljVar.af(1804771424);
            an4 = (af7 & 1) != 0 ? ljVar2.bo((byte) -115) : 0;
            an3 = (af7 & 2) != 0 ? ljVar3.bo((byte) -109) : 0;
            i7 = (af7 & 4) != 0 ? ljVar3.bo((byte) -99) : 0;
            this.aq[i12] = an4 + i2;
            this.ar[i12] = an3 + i;
            this.al[i12] = i7 + an5;
            an4 = this.aq[i12];
            an3 = this.ar[i12];
            i7 = this.al[i12];
            if (af6 == 1) {
                this.af[i12] = ljVar3.af(1804771424);
            }
            i12++;
        }
        ljVar.al = -879823907 * i10;
        ljVar2.al = -879823907 * i6;
        ljVar3.al = -879823907 * i4;
        ljVar3.al = i8 * 99113530;
        ljVar3.al = -879823907 * i5;
        Object obj = null;
        Object obj2 = null;
        an3 = 0;
        while (an3 < an2) {
            Object obj3;
            Object obj4;
            this.au[an3] = (short) ljVar.an(-1464407032);
            if (af2 == 1) {
                i8 = ljVar2.af(1804771424);
                if ((i8 & 1) == 1) {
                    this.ak[an3] = (byte) 1;
                    obj3 = 1;
                } else {
                    this.ak[an3] = (byte) 0;
                    obj3 = obj;
                }
                if ((i8 & 2) == 2) {
                    this.ap[an3] = (byte) (i8 >> 2);
                    this.az[an3] = this.au[an3];
                    this.au[an3] = (short) 26899;
                    obj4 = this.az[an3] != (short) -1 ? 1 : obj2;
                } else {
                    this.ap[an3] = (byte) -1;
                    this.az[an3] = (short) -1;
                    obj4 = obj2;
                }
            } else {
                obj4 = obj2;
                obj3 = obj;
            }
            if (af3 == -336068143) {
                this.as[an3] = ljVar3.ay(1852105542);
            }
            if (af4 == 1) {
                this.ag[an3] = ljVar3.ay(1135749372);
            }
            if (af5 == 1) {
                this.ay[an3] = ljVar3.af(1804771424);
            }
            an3++;
            obj2 = obj4;
            obj = obj3;
        }
        ljVar.al = i9 * -1396143545;
        ljVar2.al = -1703200939 * i3;
        an3 = 0;
        an4 = 0;
        i7 = 0;
        i8 = 0;
        i2 = 0;
        while (i2 < an2) {
            i = ljVar2.af(1804771424);
            if (i == 1) {
                i7 = ljVar.bo((byte) -59) + an3;
                i8 = ljVar.bo((byte) -7) + i7;
                i9 = ljVar.bo((byte) -111) + i8;
                this.ai[i2] = i7;
                this.ae[i2] = i8;
                this.am[i2] = i9;
                an3 = i9;
                an4 = i9;
            }
            if (i == 2) {
                i9 = ljVar.bo((byte) -86) + an3;
                this.ai[i2] = i7;
                this.ae[i2] = an4;
                this.am[i2] = i9;
                an3 = i9;
                an5 = i9;
                i8 = an4;
            } else {
                an5 = an4;
            }
            if (i == 3) {
                i9 = ljVar.bo((byte) 1) + an3;
                this.ai[i2] = an5;
                this.ae[i2] = i8;
                this.am[i2] = i9;
                an3 = i9;
                i7 = an5;
                an4 = i9;
            } else {
                an4 = an5;
            }
            if (i == 4) {
                an4 = ljVar.bo((byte) -64) + an3;
                this.ai[i2] = i8;
                this.ae[i2] = i7;
                this.am[i2] = an4;
                i9 = i8;
                an3 = an4;
                an5 = an4;
                i = i7;
            } else {
                i9 = i7;
                an5 = an4;
                i = i8;
            }
            i2++;
            i7 = i9;
            an4 = an5;
            i8 = i;
        }
        ljVar.al = -879823907 * i11;
        for (i9 = 0; i9 < af; i9++) {
            this.ac[i9] = (byte) 0;
            this.aa[i9] = (short) ljVar.an(-1464407032);
            this.ao[i9] = (short) ljVar.an(-1464407032);
            this.ah[i9] = (short) ljVar.an(-1464407032);
        }
        i8 = 0;
        if (this.ap != null) {
            Object obj5 = null;
            while (i8 < an2) {
                i7 = this.ap[i8] & -158648594;
                if (i7 != 1528565139) {
                    if ((this.aa[i7] & 1569126960) == this.ai[i8] && (this.ao[i7] & -1412443045) == this.ae[i8] && (this.ah[i7] & 644502154) == this.am[i8]) {
                        this.ap[i8] = (byte) -1;
                    } else {
                        obj5 = 1;
                    }
                }
                i8++;
            }
            if (obj5 == null) {
                this.ap = null;
            }
        }
        if (obj2 == null) {
            this.az = null;
        }
        if (obj == null) {
            this.ak = null;
        }
    }

    public void bp(int i) {
        int i2 = bv[i];
        int i3 = bg[i];
        for (int i4 = 0; i4 < this.ad; i4++) {
            int i5 = this.al[i4];
            int i6 = this.aq[i4];
            this.al[i4] = ((this.al[i4] * i3) - (this.aq[i4] * i2)) >> 16;
            this.aq[i4] = ((i5 * i2) + (i6 * i3)) >> 16;
        }
        aa();
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02f3 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bq(byte[] bArr) {
        int i;
        int i2;
        lj ljVar = new lj(bArr);
        lj ljVar2 = new lj(bArr);
        lj ljVar3 = new lj(bArr);
        ljVar3 = new lj(bArr);
        ljVar3 = new lj(bArr);
        ljVar.al = (bArr.length - 18) * -879823907;
        int an = ljVar.an(-1464407032);
        int an2 = ljVar.an(-1464407032);
        int af = ljVar.af(1804771424);
        int af2 = ljVar.af(1804771424);
        int af3 = ljVar.af(1804771424);
        int af4 = ljVar.af(1804771424);
        int af5 = ljVar.af(1804771424);
        int af6 = ljVar.af(1804771424);
        int an3 = ljVar.an(-1464407032);
        int an4 = ljVar.an(-1464407032);
        ljVar.an(-1464407032);
        int an5 = ljVar.an(-1464407032);
        int i3 = an + 0;
        int i4 = i3 + an2;
        int i5 = af3 == -1994011033 ? i4 + an2 : i4;
        int i6 = af5 == 1 ? i5 + an2 : i5;
        int i7 = af2 == 1 ? i6 + an2 : i6;
        int i8 = af6 == 1 ? i7 + an : i7;
        int i9 = af4 == 1 ? i8 + an2 : i8;
        int i10 = i9 + an5;
        int i11 = i10 + (an2 * 2);
        an5 = (af * 6) + i11;
        an3 += an5;
        this.ad = an;
        this.aj = an2;
        this.aw = af;
        this.aq = new int[an];
        this.ar = new int[an];
        this.al = new int[an];
        this.ai = new int[an2];
        this.ae = new int[an2];
        this.am = new int[an2];
        if (af > 0) {
            this.ac = new byte[af];
            this.aa = new short[af];
            this.ao = new short[af];
            this.ah = new short[af];
        }
        if (af6 == 1) {
            this.af = new int[an];
        }
        if (af2 == 1) {
            this.ak = new byte[an2];
            this.ap = new byte[an2];
            this.az = new short[an2];
        }
        if (af3 == 614657041) {
            this.as = new byte[an2];
        } else {
            this.ax = (byte) af3;
        }
        if (af4 == 1) {
            this.ag = new byte[an2];
        }
        if (af5 == 1) {
            this.ay = new int[an2];
        }
        this.au = new short[an2];
        ljVar.al = 0;
        ljVar2.al = an5 * -879823907;
        ljVar3.al = -879823907 * an3;
        ljVar3.al = (an3 + an4) * -1786466995;
        ljVar3.al = i7 * 224181519;
        int i12 = 0;
        an4 = 0;
        an3 = 0;
        i7 = 0;
        while (true) {
            an5 = i7;
            i = an3;
            i2 = an4;
            if (i12 >= an) {
                break;
            }
            int af7 = ljVar.af(1804771424);
            an4 = (af7 & 1) != 0 ? ljVar2.bo((byte) -45) : 0;
            an3 = (af7 & 2) != 0 ? ljVar3.bo((byte) -25) : 0;
            i7 = (af7 & 4) != 0 ? ljVar3.bo((byte) -89) : 0;
            this.aq[i12] = an4 + i2;
            this.ar[i12] = an3 + i;
            this.al[i12] = i7 + an5;
            an4 = this.aq[i12];
            an3 = this.ar[i12];
            i7 = this.al[i12];
            if (af6 == 1) {
                this.af[i12] = ljVar3.af(1804771424);
            }
            i12++;
        }
        ljVar.al = -66161083 * i10;
        ljVar2.al = -879823907 * i6;
        ljVar3.al = 2141890473 * i4;
        ljVar3.al = i8 * -879823907;
        ljVar3.al = 1047163345 * i5;
        Object obj = null;
        Object obj2 = null;
        an3 = 0;
        while (an3 < an2) {
            Object obj3;
            this.au[an3] = (short) ljVar.an(-1464407032);
            if (af2 == 1) {
                i7 = ljVar2.af(1804771424);
                if ((i7 & 1) == 1) {
                    this.ak[an3] = (byte) 1;
                    obj = 1;
                } else {
                    this.ak[an3] = (byte) 0;
                }
                if ((i7 & 2) == 2) {
                    this.ap[an3] = (byte) (i7 >> 2);
                    this.az[an3] = this.au[an3];
                    this.au[an3] = (short) -21314;
                    if (this.az[an3] != (short) -1) {
                        obj3 = 1;
                        if (af3 == 255) {
                            this.as[an3] = ljVar3.ay(-1676435054);
                        }
                        if (af4 == 1) {
                            this.ag[an3] = ljVar3.ay(1426412200);
                        }
                        if (af5 != 1) {
                            this.ay[an3] = ljVar3.af(1804771424);
                        }
                        an3++;
                        obj2 = obj3;
                    }
                } else {
                    this.ap[an3] = (byte) -1;
                    this.az[an3] = (short) -1;
                }
            }
            obj3 = obj2;
            if (af3 == 255) {
            }
            if (af4 == 1) {
            }
            if (af5 != 1) {
            }
            an3++;
            obj2 = obj3;
        }
        ljVar.al = i9 * -879823907;
        ljVar2.al = -755430510 * i3;
        i9 = 0;
        an5 = 0;
        i = 0;
        an3 = 0;
        i12 = 0;
        while (i12 < an2) {
            i2 = ljVar2.af(1804771424);
            if (i2 == 1) {
                an5 = ljVar.bo((byte) -86) + i9;
                i = ljVar.bo((byte) -56) + an5;
                i7 = ljVar.bo((byte) -4) + i;
                this.ai[i12] = an5;
                this.ae[i12] = i;
                this.am[i12] = i7;
                i9 = i7;
                an3 = i7;
            }
            if (i2 == 2) {
                i7 = ljVar.bo((byte) -120) + i9;
                this.ai[i12] = an5;
                this.ae[i12] = an3;
                this.am[i12] = i7;
                i9 = i7;
                an4 = i7;
                i = an3;
            } else {
                an4 = an3;
            }
            if (i2 == 3) {
                an3 = i9 + ljVar.bo((byte) -39);
                this.ai[i12] = an4;
                this.ae[i12] = i;
                this.am[i12] = an3;
                i9 = an3;
                an5 = an4;
                i7 = an3;
            } else {
                i7 = an4;
            }
            if (i2 == 4) {
                i7 = ljVar.bo((byte) 9) + i9;
                this.ai[i12] = i;
                this.ae[i12] = an5;
                this.am[i12] = i7;
                i9 = i7;
                an3 = i7;
                an4 = an5;
                i2 = i;
            } else {
                an3 = i7;
                an4 = i;
                i2 = an5;
            }
            i12++;
            i = an4;
            an5 = i2;
        }
        ljVar.al = -879823907 * i11;
        for (i9 = 0; i9 < af; i9++) {
            this.ac[i9] = (byte) 0;
            this.aa[i9] = (short) ljVar.an(-1464407032);
            this.ao[i9] = (short) ljVar.an(-1464407032);
            this.ah[i9] = (short) ljVar.an(-1464407032);
        }
        i7 = 0;
        if (this.ap != null) {
            Object obj4 = null;
            while (i7 < an2) {
                an3 = this.ap[i7] & 392935897;
                if (an3 != 255) {
                    if ((this.aa[an3] & 863574713) == this.ai[i7] && (this.ao[an3] & SupportMenu.USER_MASK) == this.ae[i7] && (this.ah[an3] & -1938523454) == this.am[i7]) {
                        this.ap[i7] = (byte) -1;
                    } else {
                        obj4 = 1;
                    }
                }
                i7++;
            }
            if (obj4 == null) {
                this.ap = null;
            }
        }
        if (obj2 == null) {
            this.az = null;
        }
        if (obj == null) {
            this.ak = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void br() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.af != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.ad; i2++) {
                i3 = this.af[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.an = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.an[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.ad; i2++) {
                i = this.af[i2];
                int[] iArr2 = this.an[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.ay != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.aj; i2++) {
                i3 = this.ay[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.ab = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.ab[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.aj) {
                i2 = this.ay[i4];
                int[] iArr3 = this.ab[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        lj ljVar;
        int i5;
        lj ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        lj ljVar3 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2 = new lj(bArr);
        ljVar2.al = (bArr.length - 23) * -879823907;
        int an = ljVar2.an(-1464407032);
        int an2 = ljVar2.an(-1464407032);
        int af = ljVar2.af(1804771424);
        int af2 = ljVar2.af(1804771424);
        int af3 = ljVar2.af(1804771424);
        int af4 = ljVar2.af(1804771424);
        int af5 = ljVar2.af(1804771424);
        int af6 = ljVar2.af(1804771424);
        int af7 = ljVar2.af(1804771424);
        int an3 = ljVar2.an(-1464407032);
        int an4 = ljVar2.an(-1464407032);
        int an5 = ljVar2.an(-1464407032);
        int an6 = ljVar2.an(-1464407032);
        int an7 = ljVar2.an(-1464407032);
        if (af > 0) {
            this.ac = new byte[af];
            ljVar2.al = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            for (i4 = 0; i4 < af; i4++) {
                byte[] bArr2 = this.ac;
                byte ay = ljVar2.ay(1836857965);
                bArr2[i4] = ay;
                if (ay == (byte) 0) {
                    i++;
                }
                if (ay >= (byte) 1 && ay <= (byte) 3) {
                    i2++;
                }
                if (ay == (byte) 2) {
                    i3++;
                }
            }
            ljVar = ljVar3;
            i4 = i;
            i5 = i3;
        } else {
            i2 = 0;
            ljVar = ljVar3;
            i4 = 0;
            i5 = 0;
        }
        int i6 = af + an;
        int i7 = af2 == 1 ? i6 + an2 : i6;
        int i8 = i7 + an2;
        int i9 = af3 == -217099076 ? i8 + an2 : i8;
        i = af5 == 1 ? i9 + an2 : i9;
        int i10 = af7 == 1 ? i + an : i;
        int i11 = af4 == 1 ? i10 + an2 : i10;
        int i12 = i11 + an6;
        i3 = af6 == 1 ? (an2 * 2) + i12 : i12;
        an7 += i3;
        an6 = (an2 * 2) + an7;
        an3 += an6;
        an4 += an3;
        int i13 = an4 + an5;
        int i14 = i13 + (i4 * 6);
        i4 = i2 * 6;
        int i15 = i14 + i4;
        int i16 = i15 + i4;
        int i17 = i2 * 2;
        int i18 = i16 + i17;
        int i19 = i18 + i2;
        this.ad = an;
        this.aj = an2;
        this.aw = af;
        this.aq = new int[an];
        this.ar = new int[an];
        this.al = new int[an];
        this.ai = new int[an2];
        this.ae = new int[an2];
        this.am = new int[an2];
        if (af7 == 1) {
            this.af = new int[an];
        }
        if (af2 == 1) {
            this.ak = new byte[an2];
        }
        if (af3 == -893046052) {
            this.as = new byte[an2];
        } else {
            this.ax = (byte) af3;
        }
        if (af4 == 1) {
            this.ag = new byte[an2];
        }
        if (af5 == 1) {
            this.ay = new int[an2];
        }
        if (af6 == 1) {
            this.az = new short[an2];
        }
        if (af6 == 1 && af > 0) {
            this.ap = new byte[an2];
        }
        this.au = new short[an2];
        if (af > 0) {
            this.aa = new short[af];
            this.ao = new short[af];
            this.ah = new short[af];
        }
        ljVar2.al = -78200954 * af;
        ljVar2.al = -879823907 * an6;
        ljVar2.al = -264323458 * an3;
        ljVar2.al = -879823907 * an4;
        ljVar.al = i * 1825760430;
        an6 = 0;
        i2 = 0;
        i4 = 0;
        i = 0;
        while (true) {
            an3 = i;
            an4 = i4;
            an5 = i2;
            if (an6 >= an) {
                break;
            }
            int af8 = ljVar2.af(1804771424);
            i2 = (af8 & 1) != 0 ? ljVar2.bo((byte) -122) : 0;
            i4 = (af8 & 2) != 0 ? ljVar2.bo((byte) 6) : 0;
            i = (af8 & 4) != 0 ? ljVar2.bo((byte) -127) : 0;
            this.aq[an6] = i2 + an5;
            this.ar[an6] = i4 + an4;
            this.al[an6] = i + an3;
            i2 = this.aq[an6];
            i4 = this.ar[an6];
            i = this.al[an6];
            if (af7 == 1) {
                this.af[an6] = ljVar.af(1804771424);
            }
            an6++;
        }
        ljVar2.al = 2130037639 * an7;
        ljVar2.al = -210717744 * i6;
        ljVar2.al = 244075393 * i8;
        ljVar2.al = -879823907 * i10;
        ljVar.al = -879823907 * i9;
        ljVar2.al = i12 * -879823907;
        ljVar2.al = i3 * -879823907;
        i3 = 0;
        while (i3 < an2) {
            this.au[i3] = (short) ljVar2.an(-1464407032);
            if (af2 == 1) {
                this.ak[i3] = ljVar2.ay(695424543);
            }
            if (af3 == 255) {
                this.as[i3] = ljVar2.ay(-1306636547);
            }
            if (af4 == 1) {
                this.ag[i3] = ljVar2.ay(1808458411);
            }
            if (af5 == 1) {
                this.ay[i3] = ljVar.af(1804771424);
            }
            if (af6 == 1) {
                this.az[i3] = (short) (ljVar2.an(-1464407032) - 1);
            }
            if (!(this.ap == null || this.az[i3] == (short) -1)) {
                this.ap[i3] = (byte) (ljVar2.af(1804771424) - 1);
            }
            i3++;
        }
        ljVar2.al = -1727066578 * i11;
        ljVar2.al = -879823907 * i7;
        i3 = 0;
        an3 = 0;
        i = 0;
        i2 = 0;
        an5 = 0;
        while (an5 < an2) {
            an4 = ljVar2.af(1804771424);
            if (an4 == 1) {
                an3 = ljVar2.bo((byte) -50) + i3;
                i2 = ljVar2.bo((byte) 5) + an3;
                i12 = ljVar2.bo((byte) -34) + i2;
                this.ai[an5] = an3;
                this.ae[an5] = i2;
                this.am[an5] = i12;
                i3 = i12;
                i = i12;
            }
            if (an4 == 2) {
                i12 = ljVar2.bo((byte) -114) + i3;
                this.ai[an5] = an3;
                this.ae[an5] = i;
                this.am[an5] = i12;
                i3 = i12;
                i4 = i12;
                i2 = i;
            } else {
                i4 = i;
            }
            if (an4 == 3) {
                i = i3 + ljVar2.bo((byte) -2);
                this.ai[an5] = i4;
                this.ae[an5] = i2;
                this.am[an5] = i;
                i3 = i;
                an3 = i4;
                i12 = i;
            } else {
                i12 = i4;
            }
            if (an4 == 4) {
                i12 = ljVar2.bo((byte) -17) + i3;
                this.ai[an5] = i2;
                this.ae[an5] = an3;
                this.am[an5] = i12;
                i3 = i12;
                i = i12;
                i4 = i2;
                an4 = an3;
            } else {
                i = i12;
                i4 = an3;
                an4 = i2;
            }
            an5++;
            an3 = i4;
            i2 = an4;
        }
        ljVar2.al = 154770215 * i13;
        ljVar2.al = -879823907 * i14;
        ljVar2.al = -1109158575 * i15;
        ljVar2.al = -879823907 * i16;
        ljVar.al = -820234750 * i18;
        ljVar2.al = -879823907 * i19;
        for (i3 = 0; i3 < af; i3++) {
            if ((this.ac[i3] & 1716712745) == 0) {
                this.aa[i3] = (short) ljVar2.an(-1464407032);
                this.ao[i3] = (short) ljVar2.an(-1464407032);
                this.ah[i3] = (short) ljVar2.an(-1464407032);
            }
        }
        ljVar2.al = -1757479382 * (((i5 * 2) + i17) + i19);
        if (ljVar2.af(1804771424) != 0) {
            bz bzVar = new bz();
            ljVar2.an(-1464407032);
            ljVar2.an(-1464407032);
            ljVar2.an(-1464407032);
            ljVar2.at((byte) -11);
        }
    }

    public void bt() {
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.aq[i];
            this.aq[i] = this.al[i];
            this.al[i] = -i2;
        }
        aa();
    }

    public bo bu(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        ao();
        int i5 = i + this.bd;
        int i6 = i + this.bo;
        int i7 = i3 + this.bf;
        int i8 = i3 + this.bl;
        if (i5 < 0 || ((i6 + 128) >> 7) >= iArr.length || i7 < 0) {
            return this;
        }
        if (((1385135571 + i8) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 127) >> 7;
        i7 >>= 7;
        i8 = (i8 - 1113409084) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        bo boVar;
        if (z) {
            boVar = new bo();
            boVar.ad = this.ad;
            boVar.aj = this.aj;
            boVar.aw = this.aw;
            boVar.aq = this.aq;
            boVar.al = this.al;
            boVar.ai = this.ai;
            boVar.ae = this.ae;
            boVar.am = this.am;
            boVar.ak = this.ak;
            boVar.as = this.as;
            boVar.ag = this.ag;
            boVar.ap = this.ap;
            boVar.au = this.au;
            boVar.az = this.az;
            boVar.ax = this.ax;
            boVar.ac = this.ac;
            boVar.aa = this.aa;
            boVar.ao = this.ao;
            boVar.ah = this.ah;
            boVar.af = this.af;
            boVar.ay = this.ay;
            boVar.an = this.an;
            boVar.ab = this.ab;
            boVar.ba = this.ba;
            boVar.bs = this.bs;
            boVar.ar = new int[boVar.ad];
        } else {
            boVar = this;
        }
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (i4 == 0) {
            for (i9 = 0; i9 < boVar.ad; i9++) {
                i10 = this.aq[i9] + i;
                i6 = this.al[i9] + i3;
                i7 = -279391731 & i10;
                i8 = i6 & 127;
                i10 >>= 7;
                i6 >>= 7;
                i11 = iArr[i10][i6];
                i12 = 128 - i7;
                i13 = i10 + 1;
                i14 = iArr[i13][i6];
                i6++;
                boVar.ar[i9] = (((((((iArr[i10][i6] * i12) + (iArr[i13][i6] * i7)) >> 7) * i8) + ((((i11 * i12) + (i14 * i7)) >> 7) * (128 - i8))) >> 7) + this.ar[i9]) - i2;
            }
        } else {
            for (i9 = 0; i9 < boVar.ad; i9++) {
                i10 = ((-this.ar[i9]) << 16) / (this.bx * -2077403470);
                if (i10 < i4) {
                    i6 = this.aq[i9] + i;
                    i7 = this.al[i9] + i3;
                    i8 = 1774651910 & i6;
                    i11 = i7 & 127;
                    i6 >>= 7;
                    i7 >>= 7;
                    i12 = iArr[i6][i7];
                    i13 = 128 - i8;
                    i14 = i6 + 1;
                    int i15 = iArr[i14][i7];
                    i7++;
                    i10 = i4 - i10;
                    boVar.ar[i9] = ((i10 * (((((((iArr[i6][i7] * i13) + (iArr[i14][i7] * i8)) >> 7) * i11) + ((((i12 * i13) + (i15 * i8)) >> 7) * (577571330 - i11))) >> 7) - i2)) / i4) + this.ar[i9];
                }
            }
        }
        boVar.aa();
        return boVar;
    }

    public bo bv() {
        bo boVar = new bo();
        if (this.ak != null) {
            boVar.ak = new byte[this.aj];
            for (int i = 0; i < this.aj; i++) {
                boVar.ak[i] = this.ak[i];
            }
        }
        boVar.ad = this.ad;
        boVar.aj = this.aj;
        boVar.aw = this.aw;
        boVar.aq = this.aq;
        boVar.ar = this.ar;
        boVar.al = this.al;
        boVar.ai = this.ai;
        boVar.ae = this.ae;
        boVar.am = this.am;
        boVar.as = this.as;
        boVar.ag = this.ag;
        boVar.ap = this.ap;
        boVar.au = this.au;
        boVar.az = this.az;
        boVar.ax = this.ax;
        boVar.ac = this.ac;
        boVar.aa = this.aa;
        boVar.ao = this.ao;
        boVar.ah = this.ah;
        boVar.af = this.af;
        boVar.ay = this.ay;
        boVar.an = this.an;
        boVar.ab = this.ab;
        boVar.at = this.at;
        boVar.av = this.av;
        boVar.ba = this.ba;
        boVar.bs = this.bs;
        return boVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void bw() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.af != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.ad; i2++) {
                i3 = this.af[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.an = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.an[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            for (i2 = 0; i2 < this.ad; i2++) {
                i = this.af[i2];
                int[] iArr2 = this.an[i];
                int i5 = iArr[i];
                iArr[i] = i5 + 1;
                iArr2[i5] = i2;
            }
        }
        if (this.ay != null) {
            iArr = new int[256];
            i = 0;
            for (i2 = 0; i2 < this.aj; i2++) {
                i3 = this.ay[i2];
                iArr[i3] = iArr[i3] + 1;
                if (i3 > i) {
                    i = i3;
                }
            }
            this.ab = new int[(i + 1)][];
            for (i2 = 0; i2 <= i; i2++) {
                this.ab[i2] = new int[iArr[i2]];
                iArr[i2] = 0;
            }
            while (i4 < this.aj) {
                i2 = this.ay[i4];
                int[] iArr3 = this.ab[i2];
                i3 = iArr[i2];
                iArr[i2] = i3 + 1;
                iArr3[i3] = i4;
                i4++;
            }
        }
    }

    public bo bx(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        ao();
        int i5 = i + this.bd;
        int i6 = i + this.bo;
        int i7 = i3 + this.bf;
        int i8 = i3 + this.bl;
        if (i5 < 0 || ((i6 + 128) >> 7) >= iArr.length || i7 < 0) {
            return this;
        }
        if (((i8 + 128) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 127) >> 7;
        i7 >>= 7;
        i8 = (i8 + 127) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        bo boVar;
        if (z) {
            boVar = new bo();
            boVar.ad = this.ad;
            boVar.aj = this.aj;
            boVar.aw = this.aw;
            boVar.aq = this.aq;
            boVar.al = this.al;
            boVar.ai = this.ai;
            boVar.ae = this.ae;
            boVar.am = this.am;
            boVar.ak = this.ak;
            boVar.as = this.as;
            boVar.ag = this.ag;
            boVar.ap = this.ap;
            boVar.au = this.au;
            boVar.az = this.az;
            boVar.ax = this.ax;
            boVar.ac = this.ac;
            boVar.aa = this.aa;
            boVar.ao = this.ao;
            boVar.ah = this.ah;
            boVar.af = this.af;
            boVar.ay = this.ay;
            boVar.an = this.an;
            boVar.ab = this.ab;
            boVar.ba = this.ba;
            boVar.bs = this.bs;
            boVar.ar = new int[boVar.ad];
        } else {
            boVar = this;
        }
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (i4 == 0) {
            for (i9 = 0; i9 < boVar.ad; i9++) {
                i10 = this.aq[i9] + i;
                i6 = this.al[i9] + i3;
                i7 = i10 & 127;
                i8 = i6 & 127;
                i10 >>= 7;
                i6 >>= 7;
                i11 = iArr[i10][i6];
                i12 = 128 - i7;
                i13 = i10 + 1;
                i14 = iArr[i13][i6];
                i6++;
                boVar.ar[i9] = (((((((iArr[i10][i6] * i12) + (iArr[i13][i6] * i7)) >> 7) * i8) + ((((i11 * i12) + (i14 * i7)) >> 7) * (128 - i8))) >> 7) + this.ar[i9]) - i2;
            }
        } else {
            for (i9 = 0; i9 < boVar.ad; i9++) {
                i10 = ((-this.ar[i9]) << 16) / (this.bx * -1736982785);
                if (i10 < i4) {
                    i6 = this.aq[i9] + i;
                    i7 = this.al[i9] + i3;
                    i8 = i6 & 127;
                    i11 = i7 & 127;
                    i6 >>= 7;
                    i7 >>= 7;
                    i12 = iArr[i6][i7];
                    i13 = 128 - i8;
                    i14 = i6 + 1;
                    int i15 = iArr[i14][i7];
                    i7++;
                    i10 = i4 - i10;
                    boVar.ar[i9] = ((i10 * (((((((iArr[i6][i7] * i13) + (iArr[i14][i7] * i8)) >> 7) * i11) + ((((i12 * i13) + (i15 * i8)) >> 7) * (128 - i11))) >> 7) - i2)) / i4) + this.ar[i9];
                }
            }
        }
        boVar.aa();
        return boVar;
    }

    public void by(int i) {
        int i2 = bv[i];
        int i3 = bg[i];
        for (int i4 = 0; i4 < this.ad; i4++) {
            int i5 = this.al[i4];
            int i6 = this.aq[i4];
            this.al[i4] = ((this.al[i4] * i3) - (this.aq[i4] * i2)) >> 16;
            this.aq[i4] = ((i5 * i2) + (i6 * i3)) >> 16;
        }
        aa();
    }

    public void bz() {
        for (int i = 0; i < this.ad; i++) {
            int i2 = this.al[i];
            this.al[i] = this.aq[i];
            this.aq[i] = -i2;
        }
        aa();
    }

    public void ca() {
        if (this.at == null) {
            int i;
            this.at = new bi[this.ad];
            for (i = 0; i < this.ad; i++) {
                this.at[i] = new bi();
            }
            i = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                int i5 = this.aq[i3] - this.aq[i2];
                int i6 = this.ar[i3] - this.ar[i2];
                int i7 = this.al[i3] - this.al[i2];
                int i8 = this.aq[i4] - this.aq[i2];
                int i9 = this.ar[i4] - this.ar[i2];
                int i10 = this.al[i4] - this.al[i2];
                int i11 = (i6 * i10) - (i9 * i7);
                i7 = (i7 * i8) - (i10 * i5);
                i6 = (i5 * i9) - (i6 * i8);
                while (true) {
                    i5 = i11;
                    if (i5 <= 8192 && i7 <= 8192 && i6 <= 8192 && i5 >= -8192 && i7 >= -8192 && i6 >= -8192) {
                        break;
                    }
                    i11 = i5 >> 1;
                    i7 >>= 1;
                    i6 >>= 1;
                }
                i11 = (int) Math.sqrt((double) (((i5 * i5) + (i7 * i7)) + (i6 * i6)));
                if (i11 <= 0) {
                    i11 = 1;
                }
                i5 = (i5 * 256) / i11;
                i7 = (i7 * 256) / i11;
                i6 = (i6 * 256) / i11;
                byte b = this.ak == null ? (byte) 0 : this.ak[i];
                if (b == (byte) 0) {
                    bi biVar = this.at[i2];
                    i5 *= -695993433;
                    biVar.ad += i5;
                    i7 *= -1731277735;
                    biVar.aq += i7;
                    i6 *= -1904993905;
                    biVar.ar += i6;
                    biVar.al += 208652223;
                    biVar = this.at[i3];
                    biVar.ad += i5;
                    biVar.aq += i7;
                    biVar.ar += i6;
                    biVar.al += 208652223;
                    biVar = this.at[i4];
                    biVar.ad = i5 + biVar.ad;
                    biVar.aq += i7;
                    biVar.ar += i6;
                    biVar.al += 208652223;
                } else if (b == (byte) 1) {
                    if (this.av == null) {
                        this.av = new bv[this.aj];
                    }
                    bv[] bvVarArr = this.av;
                    bv bvVar = new bv();
                    bvVarArr[i] = bvVar;
                    bvVar.ad = 2058008807 * i5;
                    bvVar.aq = -1861728855 * i7;
                    bvVar.ar = 501691771 * i6;
                }
                i++;
            }
        }
    }

    public void cb() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.ad; i++) {
            this.al[i] = -this.al[i];
        }
        while (i2 < this.aj) {
            i = this.ai[i2];
            this.ai[i2] = this.am[i2];
            this.am[i2] = i;
            i2++;
        }
        aa();
    }

    public void cc(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad; i4++) {
            this.aq[i4] = (this.aq[i4] * i) / 128;
            this.ar[i4] = (this.ar[i4] * i2) / 128;
            this.al[i4] = (this.al[i4] * i3) / 128;
        }
        aa();
    }

    public void ce() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.ad; i++) {
            this.al[i] = -this.al[i];
        }
        while (i2 < this.aj) {
            i = this.ai[i2];
            this.ai[i2] = this.am[i2];
            this.am[i2] = i;
            i2++;
        }
        aa();
    }

    public void ci(short s, short s2) {
        if (this.az != null) {
            for (int i = 0; i < this.aj; i++) {
                if (this.az[i] == s) {
                    this.az[i] = s2;
                }
            }
        }
    }

    public void cj(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad; i4++) {
            int[] iArr = this.aq;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ar;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.al;
            iArr[i4] = iArr[i4] + i3;
        }
        aa();
    }

    /* Access modifiers changed, original: 0000 */
    public void ck() {
        int i = 0;
        if (!this.bm) {
            this.bx = 0;
            this.bq = 0;
            this.bd = 999999;
            this.bo = -999999;
            this.bl = -99999;
            this.bf = 99999;
            while (i < this.ad) {
                int i2 = this.aq[i];
                int i3 = this.ar[i];
                int i4 = this.al[i];
                if (i2 < this.bd) {
                    this.bd = i2;
                }
                if (i2 > this.bo) {
                    this.bo = i2;
                }
                if (i4 < this.bf) {
                    this.bf = i4;
                }
                if (i4 > this.bl) {
                    this.bl = i4;
                }
                i2 = -i3;
                if (i2 > this.bx * -1736982785) {
                    this.bx = i2 * 134693119;
                }
                if (i3 > this.bq) {
                    this.bq = i3;
                }
                i++;
            }
            this.bm = true;
        }
    }

    public final bp cl(int i, int i2, int i3, int i4, int i5) {
        int i6;
        ac();
        int sqrt = (((int) Math.sqrt((double) (((i3 * i3) + (i4 * i4)) + (i5 * i5)))) * i2) >> 8;
        bp bpVar = new bp();
        bpVar.au = new int[this.aj];
        bpVar.az = new int[this.aj];
        bpVar.ax = new int[this.aj];
        if (this.aw > 0 && this.ap != null) {
            int i7;
            int[] iArr = new int[this.aw];
            for (i6 = 0; i6 < this.aj; i6++) {
                if (this.ap[i6] != (byte) -1) {
                    i7 = this.ap[i6] & -431770527;
                    iArr[i7] = iArr[i7] + 1;
                }
            }
            bpVar.af = 0;
            i6 = 0;
            while (i6 < this.aw) {
                if (iArr[i6] > 0 && this.ac[i6] == (byte) 0) {
                    bpVar.af++;
                }
                i6++;
            }
            bpVar.ay = new int[bpVar.af];
            bpVar.an = new int[bpVar.af];
            bpVar.ab = new int[bpVar.af];
            i7 = 0;
            i6 = 0;
            while (i7 < this.aw) {
                if (iArr[i7] <= 0 || this.ac[i7] != (byte) 0) {
                    iArr[i7] = -1;
                } else {
                    bpVar.ay[i6] = this.aa[i7] & SupportMenu.USER_MASK;
                    bpVar.an[i6] = this.ao[i7] & SupportMenu.USER_MASK;
                    bpVar.ab[i6] = this.ah[i7] & SupportMenu.USER_MASK;
                    iArr[i7] = i6;
                    i6++;
                }
                i7++;
            }
            bpVar.aa = new byte[this.aj];
            for (i6 = 0; i6 < this.aj; i6++) {
                if (this.ap[i6] != (byte) -1) {
                    bpVar.aa[i6] = (byte) iArr[this.ap[i6] & 255];
                } else {
                    bpVar.aa[i6] = (byte) -1;
                }
            }
        }
        i6 = 0;
        while (i6 < this.aj) {
            byte b = this.ak == null ? (byte) 0 : this.ak[i6];
            byte b2 = this.ag == null ? (byte) 0 : this.ag[i6];
            short s = this.az == null ? (short) -1 : this.az[i6];
            if (b2 == (byte) 107) {
                b = (byte) 3;
            }
            if (b2 == (byte) -1) {
                b = (byte) 2;
            }
            bi biVar;
            bv bvVar;
            if (s == (short) -1) {
                if (b == (byte) 0) {
                    int i8 = SupportMenu.USER_MASK & this.au[i6];
                    biVar = (this.bk == null || this.bk[this.ai[i6]] == null) ? this.at[this.ai[i6]] : this.bk[this.ai[i6]];
                    bpVar.au[i6] = bo.ay(i8, (((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1779053036) * i4)) + ((biVar.ar * 1527641202) * i5)) / ((biVar.al * -1438437030) * sqrt)) + i);
                    biVar = (this.bk == null || this.bk[this.ae[i6]] == null) ? this.at[this.ae[i6]] : this.bk[this.ae[i6]];
                    bpVar.az[i6] = bo.ay(i8, (((((biVar.ad * -1894467670) * i3) + ((biVar.aq * -1240303346) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                    biVar = (this.bk == null || this.bk[this.am[i6]] == null) ? this.at[this.am[i6]] : this.bk[this.am[i6]];
                    bpVar.ax[i6] = bo.ay(i8, (((((biVar.ad * 647915000) * i3) + ((biVar.aq * 965249368) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 1229519091) * sqrt)) + i);
                } else if (b == (byte) 1) {
                    bvVar = this.av[i6];
                    bpVar.au[i6] = bo.ay(this.au[i6] & -1378543268, ((((bvVar.ar * 258074715) * i5) + (((bvVar.ad * 1715919575) * i3) + ((bvVar.aq * 1063990775) * i4))) / ((sqrt / 2) + sqrt)) + i);
                    bpVar.ax[i6] = -1;
                } else if (b == (byte) 3) {
                    bpVar.au[i6] = 128;
                    bpVar.ax[i6] = -1;
                } else {
                    bpVar.ax[i6] = -1182209670;
                }
            } else if (b == (byte) 0) {
                biVar = (this.bk == null || this.bk[this.ai[i6]] == null) ? this.at[this.ai[i6]] : this.bk[this.ai[i6]];
                bpVar.au[i6] = bo.an((((((biVar.ad * -608895977) * i3) + ((biVar.aq * -183031832) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 1981784992) * sqrt)) + i);
                biVar = (this.bk == null || this.bk[this.ae[i6]] == null) ? this.at[this.ae[i6]] : this.bk[this.ae[i6]];
                bpVar.az[i6] = bo.an((((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 659840733) * sqrt)) + i);
                biVar = (this.bk == null || this.bk[this.am[i6]] == null) ? this.at[this.am[i6]] : this.bk[this.am[i6]];
                bpVar.ax[i6] = bo.an((((((biVar.ad * 2108043056) * i3) + ((biVar.aq * 1229149182) * i4)) + ((biVar.ar * 330333964) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
            } else if (b == (byte) 1) {
                bvVar = this.av[i6];
                bpVar.au[i6] = bo.an(((((bvVar.ar * -1835638349) * i5) + (((bvVar.ad * 1715919575) * i3) + ((bvVar.aq * 1803169433) * i4))) / ((sqrt / 2) + sqrt)) + i);
                bpVar.ax[i6] = -1;
            } else {
                bpVar.ax[i6] = -2;
            }
            i6++;
        }
        ae();
        bpVar.aj = this.ad;
        bpVar.ai = this.aq;
        bpVar.ae = this.ar;
        bpVar.am = this.al;
        bpVar.ak = this.aj;
        bpVar.as = this.ai;
        bpVar.ag = this.ae;
        bpVar.ap = this.am;
        bpVar.aw = this.as;
        bpVar.ac = this.ag;
        bpVar.ah = this.ax;
        bpVar.av = this.an;
        bpVar.at = this.ab;
        bpVar.bk = this.af;
        bpVar.ba = this.ay;
        bpVar.ao = this.az;
        return bpVar;
    }

    public void cm(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad; i4++) {
            int[] iArr = this.aq;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ar;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.al;
            iArr[i4] = iArr[i4] + i3;
        }
        aa();
    }

    public void cn(short s, short s2) {
        if (this.az != null) {
            for (int i = 0; i < this.aj; i++) {
                if (this.az[i] == s) {
                    this.az[i] = s2;
                }
            }
        }
    }

    public void cp(short s, short s2) {
        if (this.az != null) {
            for (int i = 0; i < this.aj; i++) {
                if (this.az[i] == s) {
                    this.az[i] = s2;
                }
            }
        }
    }

    public void cq(short s, short s2) {
        for (int i = 0; i < this.aj; i++) {
            if (this.au[i] == s) {
                this.au[i] = s2;
            }
        }
    }

    public void cr(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad; i4++) {
            this.aq[i4] = (this.aq[i4] * i) / 128;
            this.ar[i4] = (this.ar[i4] * i2) / 128;
            this.al[i4] = (this.al[i4] * i3) / 128;
        }
        aa();
    }

    public void cs(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.ad; i4++) {
            this.aq[i4] = (this.aq[i4] * i) / 128;
            this.ar[i4] = (this.ar[i4] * i2) / 128;
            this.al[i4] = (this.al[i4] * i3) / 128;
        }
        aa();
    }

    public void ct() {
        if (this.at == null) {
            int i;
            this.at = new bi[this.ad];
            for (i = 0; i < this.ad; i++) {
                this.at[i] = new bi();
            }
            i = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                int i5 = this.aq[i3] - this.aq[i2];
                int i6 = this.ar[i3] - this.ar[i2];
                int i7 = this.al[i3] - this.al[i2];
                int i8 = this.aq[i4] - this.aq[i2];
                int i9 = this.ar[i4] - this.ar[i2];
                int i10 = this.al[i4] - this.al[i2];
                int i11 = (i6 * i10) - (i9 * i7);
                i7 = (i7 * i8) - (i10 * i5);
                i6 = (i5 * i9) - (i6 * i8);
                while (true) {
                    i5 = i11;
                    if (i5 <= 8192 && i7 <= 8192 && i6 <= 8192 && i5 >= -2031380471 && i7 >= -1196175186 && i6 >= 1007262357) {
                        break;
                    }
                    i11 = i5 >> 1;
                    i7 >>= 1;
                    i6 >>= 1;
                }
                i11 = (int) Math.sqrt((double) (((i5 * i5) + (i7 * i7)) + (i6 * i6)));
                if (i11 <= 0) {
                    i11 = 1;
                }
                i5 = (i5 * -1239560503) / i11;
                i7 = (i7 * 256) / i11;
                i6 = (i6 * -1102459586) / i11;
                byte b = this.ak == null ? (byte) 0 : this.ak[i];
                if (b == (byte) 0) {
                    bi biVar = this.at[i2];
                    i8 = -695993433 * i5;
                    biVar.ad += i8;
                    biVar.aq += -2144684579 * i7;
                    biVar.ar += -1904993905 * i6;
                    biVar.al += 208652223;
                    biVar = this.at[i3];
                    biVar.ad = (i5 * -722310021) + biVar.ad;
                    biVar.aq += -1731277735 * i7;
                    biVar.ar += -2118661151 * i6;
                    biVar.al += 208652223;
                    biVar = this.at[i4];
                    biVar.ad += i8;
                    biVar.aq += i7 * -754915926;
                    biVar.ar += -2031396889 * i6;
                    biVar.al -= 1195551196;
                } else if (b == (byte) 1) {
                    if (this.av == null) {
                        this.av = new bv[this.aj];
                    }
                    bv[] bvVarArr = this.av;
                    bv bvVar = new bv();
                    bvVarArr[i] = bvVar;
                    bvVar.ad = 2058008807 * i5;
                    bvVar.aq = -1861728855 * i7;
                    bvVar.ar = 501691771 * i6;
                }
                i++;
            }
        }
    }

    public final bp cu(int i, int i2, int i3, int i4, int i5) {
        int i6;
        ac();
        int sqrt = (((int) Math.sqrt((double) (((i3 * i3) + (i4 * i4)) + (i5 * i5)))) * i2) >> 8;
        bp bpVar = new bp();
        bpVar.au = new int[this.aj];
        bpVar.az = new int[this.aj];
        bpVar.ax = new int[this.aj];
        if (this.aw > 0 && this.ap != null) {
            int i7;
            int[] iArr = new int[this.aw];
            for (i6 = 0; i6 < this.aj; i6++) {
                if (this.ap[i6] != (byte) -1) {
                    i7 = this.ap[i6] & 255;
                    iArr[i7] = iArr[i7] + 1;
                }
            }
            bpVar.af = 0;
            i6 = 0;
            while (i6 < this.aw) {
                if (iArr[i6] > 0 && this.ac[i6] == (byte) 0) {
                    bpVar.af++;
                }
                i6++;
            }
            bpVar.ay = new int[bpVar.af];
            bpVar.an = new int[bpVar.af];
            bpVar.ab = new int[bpVar.af];
            i7 = 0;
            i6 = 0;
            while (i7 < this.aw) {
                if (iArr[i7] <= 0 || this.ac[i7] != (byte) 0) {
                    iArr[i7] = -1;
                } else {
                    bpVar.ay[i6] = this.aa[i7] & SupportMenu.USER_MASK;
                    bpVar.an[i6] = this.ao[i7] & 773667811;
                    bpVar.ab[i6] = this.ah[i7] & -150973649;
                    iArr[i7] = i6;
                    i6++;
                }
                i7++;
            }
            bpVar.aa = new byte[this.aj];
            for (i6 = 0; i6 < this.aj; i6++) {
                if (this.ap[i6] != (byte) -1) {
                    bpVar.aa[i6] = (byte) iArr[this.ap[i6] & 255];
                } else {
                    bpVar.aa[i6] = (byte) -1;
                }
            }
        }
        i6 = 0;
        while (i6 < this.aj) {
            byte b = this.ak == null ? (byte) 0 : this.ak[i6];
            byte b2 = this.ag == null ? (byte) 0 : this.ag[i6];
            short s = this.az == null ? (short) -1 : this.az[i6];
            if (b2 == (byte) 82) {
                b = (byte) 3;
            }
            if (b2 == (byte) -1) {
                b = (byte) 2;
            }
            bi biVar;
            bv bvVar;
            if (s == (short) -1) {
                if (b == (byte) 0) {
                    int i8 = -388743541 & this.au[i6];
                    biVar = (this.bk == null || this.bk[this.ai[i6]] == null) ? this.at[this.ai[i6]] : this.bk[this.ai[i6]];
                    bpVar.au[i6] = bo.ay(i8, (((((biVar.ad * -608895977) * i3) + ((biVar.aq * -2043202457) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                    biVar = (this.bk == null || this.bk[this.ae[i6]] == null) ? this.at[this.ae[i6]] : this.bk[this.ae[i6]];
                    bpVar.az[i6] = bo.ay(i8, (((((biVar.ad * 1232442817) * i3) + ((biVar.aq * -1772647898) * i4)) + ((biVar.ar * -851571660) * i5)) / ((biVar.al * 775454125) * sqrt)) + i);
                    biVar = (this.bk == null || this.bk[this.am[i6]] == null) ? this.at[this.am[i6]] : this.bk[this.am[i6]];
                    bpVar.ax[i6] = bo.ay(i8, (((((biVar.ad * -1739895591) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                } else if (b == (byte) 1) {
                    bvVar = this.av[i6];
                    bpVar.au[i6] = bo.ay(this.au[i6] & 763495947, ((((bvVar.ar * -1835638349) * i5) + (((bvVar.ad * 1715919575) * i3) + ((bvVar.aq * 1803169433) * i4))) / ((sqrt / 2) + sqrt)) + i);
                    bpVar.ax[i6] = -1;
                } else if (b == (byte) 3) {
                    bpVar.au[i6] = 128;
                    bpVar.ax[i6] = -1;
                } else {
                    bpVar.ax[i6] = -2;
                }
            } else if (b == (byte) 0) {
                biVar = (this.bk == null || this.bk[this.ai[i6]] == null) ? this.at[this.ai[i6]] : this.bk[this.ai[i6]];
                bpVar.au[i6] = bo.an((((((biVar.ad * -608895977) * i3) + ((biVar.aq * 636519487) * i4)) + ((biVar.ar * -1702570732) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                biVar = (this.bk == null || this.bk[this.ae[i6]] == null) ? this.at[this.ae[i6]] : this.bk[this.ae[i6]];
                bpVar.az[i6] = bo.an((((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 1936214486) * sqrt)) + i);
                biVar = (this.bk == null || this.bk[this.am[i6]] == null) ? this.at[this.am[i6]] : this.bk[this.am[i6]];
                bpVar.ax[i6] = bo.an((((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * -1924560295) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
            } else if (b == (byte) 1) {
                bvVar = this.av[i6];
                bpVar.au[i6] = bo.an(((((bvVar.ar * 1774142165) * i5) + (((bvVar.ad * -1184156205) * i3) + ((bvVar.aq * 1803169433) * i4))) / ((sqrt / 2) + sqrt)) + i);
                bpVar.ax[i6] = -1;
            } else {
                bpVar.ax[i6] = 1171160405;
            }
            i6++;
        }
        ae();
        bpVar.aj = this.ad;
        bpVar.ai = this.aq;
        bpVar.ae = this.ar;
        bpVar.am = this.al;
        bpVar.ak = this.aj;
        bpVar.as = this.ai;
        bpVar.ag = this.ae;
        bpVar.ap = this.am;
        bpVar.aw = this.as;
        bpVar.ac = this.ag;
        bpVar.ah = this.ax;
        bpVar.av = this.an;
        bpVar.at = this.ab;
        bpVar.bk = this.af;
        bpVar.ba = this.ay;
        bpVar.ao = this.az;
        return bpVar;
    }

    public void cv(int i) {
        int i2 = bv[i];
        int i3 = bg[i];
        for (int i4 = 0; i4 < this.ad; i4++) {
            int i5 = this.al[i4];
            int i6 = this.aq[i4];
            this.al[i4] = ((this.al[i4] * i3) - (this.aq[i4] * i2)) >> 16;
            this.aq[i4] = ((i5 * i2) + (i6 * i3)) >> 16;
        }
        aa();
    }

    public void cw(short s, short s2) {
        if (this.az != null) {
            for (int i = 0; i < this.aj; i++) {
                if (this.az[i] == s) {
                    this.az[i] = s2;
                }
            }
        }
    }

    public void cx() {
        if (this.at == null) {
            int i;
            this.at = new bi[this.ad];
            for (i = 0; i < this.ad; i++) {
                this.at[i] = new bi();
            }
            i = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                int i5 = this.aq[i3] - this.aq[i2];
                int i6 = this.ar[i3] - this.ar[i2];
                int i7 = this.al[i3] - this.al[i2];
                int i8 = this.aq[i4] - this.aq[i2];
                int i9 = this.ar[i4] - this.ar[i2];
                int i10 = this.al[i4] - this.al[i2];
                int i11 = (i6 * i10) - (i9 * i7);
                i7 = (i7 * i8) - (i10 * i5);
                i6 = (i5 * i9) - (i6 * i8);
                while (true) {
                    i5 = i11;
                    if (i5 <= -2004610701 && i7 <= -1758142948 && i6 <= -322421624 && i5 >= 1038235548 && i7 >= 1707750240 && i6 >= -8192) {
                        break;
                    }
                    i11 = i5 >> 1;
                    i7 >>= 1;
                    i6 >>= 1;
                }
                i11 = (int) Math.sqrt((double) (((i5 * i5) + (i7 * i7)) + (i6 * i6)));
                if (i11 <= 0) {
                    i11 = 1;
                }
                i5 = (i5 * 1056643623) / i11;
                i7 = (i7 * 256) / i11;
                i6 = (i6 * 256) / i11;
                byte b = this.ak == null ? (byte) 0 : this.ak[i];
                if (b == (byte) 0) {
                    bi biVar = this.at[i2];
                    i5 *= -695993433;
                    biVar.ad += i5;
                    i8 = -1731277735 * i7;
                    biVar.aq += i8;
                    biVar.ar += -1904993905 * i6;
                    biVar.al -= 642300152;
                    biVar = this.at[i3];
                    biVar.ad += i5;
                    biVar.aq = (i7 * -323308772) + biVar.aq;
                    biVar.ar += -1585538618 * i6;
                    biVar.al += 369463870;
                    biVar = this.at[i4];
                    biVar.ad = i5 + biVar.ad;
                    biVar.aq += i8;
                    biVar.ar += 2040833587 * i6;
                    biVar.al += 581584312;
                } else if (b == (byte) 1) {
                    if (this.av == null) {
                        this.av = new bv[this.aj];
                    }
                    bv[] bvVarArr = this.av;
                    bv bvVar = new bv();
                    bvVarArr[i] = bvVar;
                    bvVar.ad = 1399244897 * i5;
                    bvVar.aq = 483313183 * i7;
                    bvVar.ar = 260181631 * i6;
                }
                i++;
            }
        }
    }

    public void cy() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.ad; i++) {
            this.al[i] = -this.al[i];
        }
        while (i2 < this.aj) {
            i = this.ai[i2];
            this.ai[i2] = this.am[i2];
            this.am[i2] = i;
            i2++;
        }
        aa();
    }

    public final bp cz(int i, int i2, int i3, int i4, int i5) {
        int i6;
        ac();
        int sqrt = (((int) Math.sqrt((double) (((i3 * i3) + (i4 * i4)) + (i5 * i5)))) * i2) >> 8;
        bp bpVar = new bp();
        bpVar.au = new int[this.aj];
        bpVar.az = new int[this.aj];
        bpVar.ax = new int[this.aj];
        if (this.aw > 0 && this.ap != null) {
            int i7;
            int[] iArr = new int[this.aw];
            for (i6 = 0; i6 < this.aj; i6++) {
                if (this.ap[i6] != (byte) -1) {
                    i7 = this.ap[i6] & -1886574096;
                    iArr[i7] = iArr[i7] + 1;
                }
            }
            bpVar.af = 0;
            i6 = 0;
            while (i6 < this.aw) {
                if (iArr[i6] > 0 && this.ac[i6] == (byte) 0) {
                    bpVar.af++;
                }
                i6++;
            }
            bpVar.ay = new int[bpVar.af];
            bpVar.an = new int[bpVar.af];
            bpVar.ab = new int[bpVar.af];
            i7 = 0;
            i6 = 0;
            while (i7 < this.aw) {
                if (iArr[i7] <= 0 || this.ac[i7] != (byte) 0) {
                    iArr[i7] = -1;
                } else {
                    bpVar.ay[i6] = this.aa[i7] & 870658040;
                    bpVar.an[i6] = this.ao[i7] & SupportMenu.USER_MASK;
                    bpVar.ab[i6] = this.ah[i7] & SupportMenu.USER_MASK;
                    iArr[i7] = i6;
                    i6++;
                }
                i7++;
            }
            bpVar.aa = new byte[this.aj];
            for (i6 = 0; i6 < this.aj; i6++) {
                if (this.ap[i6] != (byte) -1) {
                    bpVar.aa[i6] = (byte) iArr[this.ap[i6] & 255];
                } else {
                    bpVar.aa[i6] = (byte) -1;
                }
            }
        }
        i6 = 0;
        while (i6 < this.aj) {
            byte b = this.ak == null ? (byte) 0 : this.ak[i6];
            byte b2 = this.ag == null ? (byte) 0 : this.ag[i6];
            short s = this.az == null ? (short) -1 : this.az[i6];
            if (b2 == (byte) 122) {
                b = (byte) 3;
            }
            if (b2 == (byte) -1) {
                b = (byte) 2;
            }
            bi biVar;
            bv bvVar;
            if (s == (short) -1) {
                if (b == (byte) 0) {
                    int i8 = SupportMenu.USER_MASK & this.au[i6];
                    biVar = (this.bk == null || this.bk[this.ai[i6]] == null) ? this.at[this.ai[i6]] : this.bk[this.ai[i6]];
                    bpVar.au[i6] = bo.ay(i8, (((((biVar.ad * -673974692) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 887133158) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                    biVar = (this.bk == null || this.bk[this.ae[i6]] == null) ? this.at[this.ae[i6]] : this.bk[this.ae[i6]];
                    bpVar.az[i6] = bo.ay(i8, (((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * 770723426) * sqrt)) + i);
                    biVar = (this.bk == null || this.bk[this.am[i6]] == null) ? this.at[this.am[i6]] : this.bk[this.am[i6]];
                    bpVar.ax[i6] = bo.ay(i8, (((((biVar.ad * -608895977) * i3) + ((biVar.aq * 1681636329) * i4)) + ((biVar.ar * 440487713) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                } else if (b == (byte) 1) {
                    bvVar = this.av[i6];
                    bpVar.au[i6] = bo.ay(this.au[i6] & -853127179, ((((bvVar.ar * -1835638349) * i5) + (((bvVar.ad * 1353505165) * i3) + ((bvVar.aq * 1803169433) * i4))) / ((sqrt / 2) + sqrt)) + i);
                    bpVar.ax[i6] = -1;
                } else if (b == (byte) 3) {
                    bpVar.au[i6] = 1303476817;
                    bpVar.ax[i6] = -1;
                } else {
                    bpVar.ax[i6] = -2;
                }
            } else if (b == (byte) 0) {
                biVar = (this.bk == null || this.bk[this.ai[i6]] == null) ? this.at[this.ai[i6]] : this.bk[this.ai[i6]];
                bpVar.au[i6] = bo.an((((((biVar.ad * -608895977) * i3) + ((biVar.aq * -1072295232) * i4)) + ((biVar.ar * 1141698456) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
                biVar = (this.bk == null || this.bk[this.ae[i6]] == null) ? this.at[this.ae[i6]] : this.bk[this.ae[i6]];
                bpVar.az[i6] = bo.an((((((biVar.ad * -608895977) * i3) + ((biVar.aq * 702164158) * i4)) + ((biVar.ar * 1953817967) * i5)) / ((biVar.al * -1715766083) * sqrt)) + i);
                biVar = (this.bk == null || this.bk[this.am[i6]] == null) ? this.at[this.am[i6]] : this.bk[this.am[i6]];
                bpVar.ax[i6] = bo.an((((((biVar.ad * 1930541483) * i3) + ((biVar.aq * 984106637) * i4)) + ((biVar.ar * -1962221255) * i5)) / ((biVar.al * 414722111) * sqrt)) + i);
            } else if (b == (byte) 1) {
                bvVar = this.av[i6];
                bpVar.au[i6] = bo.an(((((bvVar.ar * 458111657) * i5) + (((bvVar.ad * 128188972) * i3) + ((bvVar.aq * 2031719953) * i4))) / ((sqrt / 2) + sqrt)) + i);
                bpVar.ax[i6] = -1;
            } else {
                bpVar.ax[i6] = 810205190;
            }
            i6++;
        }
        ae();
        bpVar.aj = this.ad;
        bpVar.ai = this.aq;
        bpVar.ae = this.ar;
        bpVar.am = this.al;
        bpVar.ak = this.aj;
        bpVar.as = this.ai;
        bpVar.ag = this.ae;
        bpVar.ap = this.am;
        bpVar.aw = this.as;
        bpVar.ac = this.ag;
        bpVar.ah = this.ax;
        bpVar.av = this.an;
        bpVar.at = this.ab;
        bpVar.bk = this.af;
        bpVar.ba = this.ay;
        bpVar.ao = this.az;
        return bpVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dd() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dm() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dt() {
        return null;
    }
}
