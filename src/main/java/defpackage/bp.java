package defpackage;

/* renamed from: bp */
public class bp extends br {
    static bp ad = new bp();
    static byte[] al = new byte[1];
    static byte[] aq = new byte[1];
    static bp ar = new bp();
    static final int[] bh = bl.aa;
    static int bm = 0;
    static int bn;
    static final int[] bt = bl.ao;
    static int by;
    static int bz;
    byte[] aa;
    int[] ab;
    byte[] ac;
    int[] ae;
    int af = 0;
    int[] ag;
    byte ah = (byte) 0;
    int[] ai;
    int aj = 0;
    int ak = 0;
    int[] am;
    int[] an;
    short[] ao;
    int[] ap;
    int[] as;
    int[][] at;
    int[] au;
    int[][] av;
    byte[] aw;
    int[] ax;
    int[] ay;
    int[] az;
    int[] ba;
    int bb;
    int bc;
    boolean bd;
    int be;
    int bf;
    int bg;
    int bi;
    int bj;
    int[] bk;
    boolean bl;
    int bo;
    int bq;
    int br;
    public boolean bs = false;
    int bu;
    int bv;
    int bw;

    bp() {
        int i = bm;
        bm = i + 1;
        this.bq = i;
        this.bd = true;
        this.bo = -1;
        this.bl = false;
        this.br = -1;
        this.be = -1;
        this.bj = -1;
    }

    /* JADX WARNING: Missing block: B:22:0x0074, code skipped:
            if (r13.ah != r8.ah) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bp(bp[] bpVarArr, int i) {
        int i2 = bm;
        bm = i2 + 1;
        this.bq = i2;
        this.bd = true;
        this.bo = -1;
        this.bl = false;
        this.br = -1;
        this.be = -1;
        this.bj = -1;
        this.aj = 0;
        this.ak = 0;
        this.af = 0;
        this.ah = (byte) -1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        i2 = 0;
        while (i3 < i) {
            bp bpVar = bpVarArr[i3];
            if (bpVar != null) {
                this.aj += bpVar.aj;
                this.ak += bpVar.ak;
                this.af += bpVar.af;
                if (bpVar.aw == null) {
                    if (this.ah == (byte) -1) {
                        this.ah = bpVar.ah;
                    }
                }
                i2 = true;
                i4 |= bpVar.ac != null ? 1 : 0;
                i5 |= bpVar.ao != null ? 1 : 0;
                i6 |= bpVar.aa != null ? 1 : 0;
            }
            i3++;
            i4 = i4;
        }
        this.ai = new int[this.aj];
        this.ae = new int[this.aj];
        this.am = new int[this.aj];
        this.as = new int[this.ak];
        this.ag = new int[this.ak];
        this.ap = new int[this.ak];
        this.au = new int[this.ak];
        this.az = new int[this.ak];
        this.ax = new int[this.ak];
        if (i2 != 0) {
            this.aw = new byte[this.ak];
        }
        if (i4 != 0) {
            this.ac = new byte[this.ak];
        }
        if (i5 != 0) {
            this.ao = new short[this.ak];
        }
        if (i6 != 0) {
            this.aa = new byte[this.ak];
        }
        if (this.af > 0) {
            this.ay = new int[this.af];
            this.an = new int[this.af];
            this.ab = new int[this.af];
        }
        this.aj = 0;
        this.ak = 0;
        this.af = 0;
        for (int i7 = 0; i7 < i; i7++) {
            bp bpVar2 = bpVarArr[i7];
            if (bpVar2 != null) {
                int i8 = 0;
                while (i8 < bpVar2.ak) {
                    this.as[this.ak] = bpVar2.as[i8] + this.aj;
                    this.ag[this.ak] = bpVar2.ag[i8] + this.aj;
                    this.ap[this.ak] = bpVar2.ap[i8] + this.aj;
                    this.au[this.ak] = bpVar2.au[i8];
                    this.az[this.ak] = bpVar2.az[i8];
                    this.ax[this.ak] = bpVar2.ax[i8];
                    if (i2 != 0) {
                        if (bpVar2.aw != null) {
                            this.aw[this.ak] = bpVar2.aw[i8];
                        } else {
                            this.aw[this.ak] = bpVar2.ah;
                        }
                    }
                    if (!(i4 == 0 || bpVar2.ac == null)) {
                        this.ac[this.ak] = bpVar2.ac[i8];
                    }
                    if (i5 != 0) {
                        if (bpVar2.ao != null) {
                            this.ao[this.ak] = bpVar2.ao[i8];
                        } else {
                            this.ao[this.ak] = (short) -1;
                        }
                    }
                    if (i6 != 0) {
                        if (bpVar2.aa == null || bpVar2.aa[i8] == (byte) -1) {
                            this.aa[this.ak] = (byte) -1;
                        } else {
                            this.aa[this.ak] = (byte) (bpVar2.aa[i8] + this.af);
                        }
                    }
                    this.ak++;
                    i8++;
                }
                for (i8 = 0; i8 < bpVar2.af; i8++) {
                    this.ay[this.af] = bpVar2.ay[i8] + this.aj;
                    this.an[this.af] = bpVar2.an[i8] + this.aj;
                    this.ab[this.af] = bpVar2.ab[i8] + this.aj;
                    this.af++;
                }
                for (i8 = 0; i8 < bpVar2.aj; i8++) {
                    this.ai[this.aj] = bpVar2.ai[i8];
                    this.ae[this.aj] = bpVar2.ae[i8];
                    this.am[this.aj] = bpVar2.am[i8];
                    this.aj++;
                }
            }
        }
    }

    public void aa(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            this.ai[i4] = (this.ai[i4] * i) / 128;
            this.ae[i4] = (this.ae[i4] * i2) / 128;
            this.am[i4] = (this.am[i4] * i3) / 128;
        }
        ak();
    }

    /* Access modifiers changed, original: protected|final */
    public final bp ab() {
        return this;
    }

    public void ac(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            int[] iArr = this.ai;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ae;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.am;
            iArr[i4] = iArr[i4] + i3;
        }
        ak();
    }

    public bp ad(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        ai();
        int i5 = i - this.bi;
        int i6 = i + this.bi;
        int i7 = i3 - this.bi;
        int i8 = i3 + this.bi;
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
        bp bpVar;
        if (z) {
            bpVar = new bp();
            bpVar.aj = this.aj;
            bpVar.ak = this.ak;
            bpVar.af = this.af;
            bpVar.ai = this.ai;
            bpVar.am = this.am;
            bpVar.as = this.as;
            bpVar.ag = this.ag;
            bpVar.ap = this.ap;
            bpVar.au = this.au;
            bpVar.az = this.az;
            bpVar.ax = this.ax;
            bpVar.aw = this.aw;
            bpVar.ac = this.ac;
            bpVar.aa = this.aa;
            bpVar.ao = this.ao;
            bpVar.ah = this.ah;
            bpVar.ay = this.ay;
            bpVar.an = this.an;
            bpVar.ab = this.ab;
            bpVar.av = this.av;
            bpVar.at = this.at;
            bpVar.bk = this.bk;
            bpVar.ba = this.ba;
            bpVar.bs = this.bs;
            bpVar.ae = new int[bpVar.aj];
        } else {
            bpVar = this;
        }
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (i4 == 0) {
            for (i9 = 0; i9 < bpVar.aj; i9++) {
                i10 = this.ai[i9] + i;
                i6 = this.am[i9] + i3;
                i7 = i10 & 127;
                i8 = i6 & 127;
                i10 >>= 7;
                i6 >>= 7;
                i11 = iArr[i10][i6];
                i12 = 128 - i7;
                i13 = i10 + 1;
                i14 = iArr[i13][i6];
                i6++;
                bpVar.ae[i9] = (((((((iArr[i10][i6] * i12) + (iArr[i13][i6] * i7)) >> 7) * i8) + ((((i11 * i12) + (i14 * i7)) >> 7) * (128 - i8))) >> 7) + this.ae[i9]) - i2;
            }
        } else {
            for (i9 = 0; i9 < bpVar.aj; i9++) {
                i10 = ((-this.ae[i9]) << 16) / (this.bx * -1736982785);
                if (i10 < i4) {
                    i6 = this.ai[i9] + i;
                    i7 = this.am[i9] + i3;
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
                    bpVar.ae[i9] = ((i10 * (((((((iArr[i6][i7] * i13) + (iArr[i14][i7] * i8)) >> 7) * i11) + ((((i12 * i13) + (i15 * i8)) >> 7) * (128 - i11))) >> 7) - i2)) / i4) + this.ae[i9];
                }
            }
        }
        bpVar.ak();
        return bpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void ae() {
        int i = 0;
        if (this.bf != 2) {
            this.bf = 2;
            this.bi = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                i2 = ((i2 * i2) + (i4 * i4)) + (i3 * i3);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bv = this.bi;
            this.bc = this.bi + this.bi;
        }
    }

    public bp af(boolean z) {
        if (!z && aq.length < this.ak) {
            aq = new byte[(this.ak - 1639999123)];
        }
        return al(z, ad, aq);
    }

    public void ag(ba baVar, int i, ba baVar2, int i2, int[] iArr) {
        if (i != -1) {
            if (iArr == null || i2 == -1) {
                as(baVar, i);
                return;
            }
            int i3;
            int i4;
            int i5;
            bk bkVar = baVar.ad[i];
            bk bkVar2 = baVar2.ad[i2];
            bj bjVar = bkVar.aj;
            bn = 0;
            bz = 0;
            by = 0;
            int i6 = iArr[0];
            int i7 = 0;
            int i8 = 1;
            while (true) {
                i3 = i7;
                if (i3 >= bkVar.ai) {
                    break;
                }
                i7 = bkVar.ae[i3];
                i4 = i6;
                i5 = i8;
                while (i7 > i4) {
                    i4 = iArr[i5];
                    i5++;
                }
                if (i7 != i4 || bjVar.ar[i7] == 0) {
                    ap(bjVar.ar[i7], bjVar.al[i7], bkVar.am[i3], bkVar.ak[i3], bkVar.as[i3]);
                }
                i7 = i3 + 1;
                i6 = i4;
                i8 = i5;
            }
            bn = 0;
            bz = 0;
            by = 0;
            i6 = iArr[0];
            i8 = 1;
            for (i3 = 0; i3 < bkVar2.ai; i3++) {
                i7 = bkVar2.ae[i3];
                i4 = i6;
                i5 = i8;
                while (i7 > i4) {
                    i4 = iArr[i5];
                    i5++;
                }
                if (i7 == i4 || bjVar.ar[i7] == 0) {
                    ap(bjVar.ar[i7], bjVar.al[i7], bkVar2.am[i3], bkVar2.ak[i3], bkVar2.as[i3]);
                }
                i6 = i4;
                i8 = i5;
            }
            ak();
        }
    }

    public bp ah(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        ai();
        int i5 = i - this.bi;
        int i6 = i + this.bi;
        int i7 = i3 - this.bi;
        int i8 = i3 + this.bi;
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
        bp bpVar;
        if (z) {
            bpVar = new bp();
            bpVar.aj = this.aj;
            bpVar.ak = this.ak;
            bpVar.af = this.af;
            bpVar.ai = this.ai;
            bpVar.am = this.am;
            bpVar.as = this.as;
            bpVar.ag = this.ag;
            bpVar.ap = this.ap;
            bpVar.au = this.au;
            bpVar.az = this.az;
            bpVar.ax = this.ax;
            bpVar.aw = this.aw;
            bpVar.ac = this.ac;
            bpVar.aa = this.aa;
            bpVar.ao = this.ao;
            bpVar.ah = this.ah;
            bpVar.ay = this.ay;
            bpVar.an = this.an;
            bpVar.ab = this.ab;
            bpVar.av = this.av;
            bpVar.at = this.at;
            bpVar.bk = this.bk;
            bpVar.ba = this.ba;
            bpVar.bs = this.bs;
            bpVar.ae = new int[bpVar.aj];
        } else {
            bpVar = this;
        }
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (i4 == 0) {
            for (i9 = 0; i9 < bpVar.aj; i9++) {
                i10 = this.ai[i9] + i;
                i6 = this.am[i9] + i3;
                i7 = i10 & 127;
                i8 = i6 & 127;
                i10 >>= 7;
                i6 >>= 7;
                i11 = iArr[i10][i6];
                i12 = 128 - i7;
                i13 = i10 + 1;
                i14 = iArr[i13][i6];
                i6++;
                bpVar.ae[i9] = (((((((iArr[i10][i6] * i12) + (iArr[i13][i6] * i7)) >> 7) * i8) + ((((i11 * i12) + (i14 * i7)) >> 7) * (128 - i8))) >> 7) + this.ae[i9]) - i2;
            }
        } else {
            for (i9 = 0; i9 < bpVar.aj; i9++) {
                i10 = ((-this.ae[i9]) << 16) / (this.bx * -1736982785);
                if (i10 < i4) {
                    i6 = this.ai[i9] + i;
                    i7 = this.am[i9] + i3;
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
                    bpVar.ae[i9] = ((i10 * (((((((iArr[i6][i7] * i13) + (iArr[i14][i7] * i8)) >> 7) * i11) + ((((i12 * i13) + (i15 * i8)) >> 7) * (128 - i11))) >> 7) - i2)) / i4) + this.ae[i9];
                }
            }
        }
        bpVar.ak();
        return bpVar;
    }

    public void ai() {
        int i = 0;
        if (this.bf != 1) {
            this.bf = 1;
            this.bx = 0;
            this.bb = 0;
            this.bi = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                int i5 = -i3;
                if (i5 > this.bx * -1736982785) {
                    this.bx = i5 * 134693119;
                }
                if (i3 > this.bb) {
                    this.bb = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bv = (int) (Math.sqrt((double) ((this.bi * this.bi) + ((this.bx * -1736982785) * (this.bx * -1736982785)))) + 0.99d);
            this.bc = this.bv + ((int) (Math.sqrt((double) ((this.bi * this.bi) + (this.bb * this.bb))) + 0.99d));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i) {
        if (this.br == -1) {
            int i2 = bt[i];
            int i3 = bh[i];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < this.aj; i10++) {
                int be = hy.be(this.ai[i10], this.am[i10], i2, i3, (byte) -59);
                int i11 = this.ae[i10];
                int bj = mh.bj(this.ai[i10], this.am[i10], i2, i3, -1572183737);
                if (be < i5) {
                    i5 = be;
                }
                if (be > i4) {
                    i4 = be;
                }
                if (i11 < i7) {
                    i7 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (bj < i9) {
                    i9 = bj;
                }
                if (bj > i8) {
                    i8 = bj;
                }
            }
            this.bg = (i4 + i5) / 2;
            this.bu = (i6 + i7) / 2;
            this.bw = (i8 + i9) / 2;
            this.br = ((i4 - i5) + 1) / 2;
            this.be = ((i6 - i7) + 1) / 2;
            this.bj = ((i8 - i9) + 1) / 2;
            if (this.br < 32) {
                this.br = 32;
            }
            if (this.bj < 32) {
                this.bj = 32;
            }
            if (this.bs) {
                this.br += 8;
                this.bj += 8;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak() {
        this.bf = 0;
        this.br = -1;
        this.bd = true;
    }

    /* Access modifiers changed, original: 0000 */
    public bp al(boolean z, bp bpVar, byte[] bArr) {
        int i;
        int i2 = 0;
        bpVar.aj = this.aj;
        bpVar.ak = this.ak;
        bpVar.af = this.af;
        if (bpVar.ai == null || bpVar.ai.length < this.aj) {
            bpVar.ai = new int[(this.aj + 100)];
            bpVar.ae = new int[(this.aj + 100)];
            bpVar.am = new int[(this.aj + 100)];
        }
        for (i = 0; i < this.aj; i++) {
            bpVar.ai[i] = this.ai[i];
            bpVar.ae[i] = this.ae[i];
            bpVar.am[i] = this.am[i];
        }
        if (z) {
            bpVar.ac = this.ac;
        } else {
            bpVar.ac = bArr;
            if (this.ac == null) {
                for (i = 0; i < this.ak; i++) {
                    bpVar.ac[i] = (byte) 0;
                }
            } else {
                while (i2 < this.ak) {
                    bpVar.ac[i2] = this.ac[i2];
                    i2++;
                }
            }
        }
        bpVar.as = this.as;
        bpVar.ag = this.ag;
        bpVar.ap = this.ap;
        bpVar.au = this.au;
        bpVar.az = this.az;
        bpVar.ax = this.ax;
        bpVar.aw = this.aw;
        bpVar.aa = this.aa;
        bpVar.ao = this.ao;
        bpVar.ah = this.ah;
        bpVar.ay = this.ay;
        bpVar.an = this.an;
        bpVar.ab = this.ab;
        bpVar.av = this.av;
        bpVar.at = this.at;
        bpVar.bk = this.bk;
        bpVar.ba = this.ba;
        bpVar.bs = this.bs;
        i = bm;
        bm = i + 1;
        bpVar.bq = i;
        bpVar.bl = true;
        bpVar.ak();
        return bpVar;
    }

    public int am() {
        ai();
        return this.bi;
    }

    public bp an(boolean z) {
        if (!z && al.length < this.ak) {
            al = new byte[(this.ak + 100)];
        }
        return al(z, ar, al);
    }

    public bp ao(int[][] iArr, int i, int i2, int i3, boolean z, int i4) {
        ai();
        int i5 = i - this.bi;
        int i6 = this.bi + i;
        int i7 = i3 - this.bi;
        int i8 = this.bi + i3;
        if (i5 < 0 || ((i6 + 128) >> 7) >= iArr.length || i7 < 0) {
            return this;
        }
        if (((i8 + 128) >> 7) >= iArr[0].length) {
            return this;
        }
        i5 >>= 7;
        i6 = (i6 + 1415339689) >> 7;
        i7 >>= 7;
        i8 = (i8 + 127) >> 7;
        if (iArr[i5][i7] == i2 && iArr[i6][i7] == i2 && iArr[i5][i8] == i2 && iArr[i6][i8] == i2) {
            return this;
        }
        bp bpVar;
        if (z) {
            bpVar = new bp();
            bpVar.aj = this.aj;
            bpVar.ak = this.ak;
            bpVar.af = this.af;
            bpVar.ai = this.ai;
            bpVar.am = this.am;
            bpVar.as = this.as;
            bpVar.ag = this.ag;
            bpVar.ap = this.ap;
            bpVar.au = this.au;
            bpVar.az = this.az;
            bpVar.ax = this.ax;
            bpVar.aw = this.aw;
            bpVar.ac = this.ac;
            bpVar.aa = this.aa;
            bpVar.ao = this.ao;
            bpVar.ah = this.ah;
            bpVar.ay = this.ay;
            bpVar.an = this.an;
            bpVar.ab = this.ab;
            bpVar.av = this.av;
            bpVar.at = this.at;
            bpVar.bk = this.bk;
            bpVar.ba = this.ba;
            bpVar.bs = this.bs;
            bpVar.ae = new int[bpVar.aj];
        } else {
            bpVar = this;
        }
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (i4 == 0) {
            for (i9 = 0; i9 < bpVar.aj; i9++) {
                i10 = this.ai[i9] + i;
                i6 = this.am[i9] + i3;
                i7 = 235787805 & i10;
                i8 = -579630163 & i6;
                i10 >>= 7;
                i6 >>= 7;
                i11 = iArr[i10][i6];
                i12 = i10 + 1;
                i13 = iArr[i12][i6];
                i6++;
                i11 = (((i11 * (1128505157 - i7)) + (i13 * i7)) >> 7) * (-1257616291 - i8);
                bpVar.ae[i9] = (((((((iArr[i10][i6] * (-227962204 - i7)) + (iArr[i12][i6] * i7)) >> 7) * i8) + i11) >> 7) + this.ae[i9]) - i2;
            }
        } else {
            for (i9 = 0; i9 < bpVar.aj; i9++) {
                i10 = ((-this.ae[i9]) << 16) / (this.bx * -1836136058);
                if (i10 < i4) {
                    i6 = this.ai[i9] + i;
                    i7 = this.am[i9] + i3;
                    i8 = i6 & 127;
                    i11 = i7 & 127;
                    i6 >>= 7;
                    i7 >>= 7;
                    i12 = iArr[i6][i7];
                    i13 = i6 + 1;
                    int i14 = iArr[i13][i7];
                    i7++;
                    i12 = (((i12 * (-562181164 - i8)) + (i14 * i8)) >> 7) * (128 - i11);
                    i10 = i4 - i10;
                    bpVar.ae[i9] = ((i10 * (((((((iArr[i6][i7] * (128 - i8)) + (iArr[i13][i7] * i8)) >> 7) * i11) + i12) >> 7) - i2)) / i4) + this.ae[i9];
                }
            }
        }
        bpVar.ak();
        return bpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int[] iArr2;
        int i6;
        int[] iArr3;
        int[] iArr4;
        if (i == 0) {
            bn = 0;
            bz = 0;
            by = 0;
            i5 = 0;
            for (int i7 : iArr) {
                if (i7 < this.av.length) {
                    iArr2 = this.av[i7];
                    for (int i62 : iArr2) {
                        bn += this.ai[i62];
                        bz += this.ae[i62];
                        by = this.am[i62] + by;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bn = (bn / i5) + i2;
                bz = (bz / i5) + i3;
                by = (by / i5) + i4;
                return;
            }
            bn = i2;
            bz = i3;
            by = i4;
        } else if (i == 1) {
            for (int i72 : iArr) {
                if (i72 < this.av.length) {
                    iArr3 = this.av[i72];
                    for (int i8 : iArr3) {
                        iArr4 = this.ai;
                        iArr4[i8] = iArr4[i8] + i2;
                        iArr4 = this.ae;
                        iArr4[i8] = iArr4[i8] + i3;
                        iArr4 = this.am;
                        iArr4[i8] = iArr4[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i722 : iArr) {
                if (i722 < this.av.length) {
                    iArr3 = this.av[i722];
                    for (int i82 : iArr3) {
                        int i9;
                        int i10;
                        iArr4 = this.ai;
                        iArr4[i82] = iArr4[i82] - bn;
                        iArr4 = this.ae;
                        iArr4[i82] = iArr4[i82] - bz;
                        iArr4 = this.am;
                        iArr4[i82] = iArr4[i82] - by;
                        i62 = (i2 & 255) * 8;
                        int i11 = (i3 & 255) * 8;
                        int i12 = (i4 & 255) * 8;
                        if (i12 != 0) {
                            i9 = bh[i12];
                            i12 = bt[i12];
                            i10 = this.ae[i82];
                            int i13 = this.ai[i82];
                            this.ae[i82] = ((this.ae[i82] * i12) - (this.ai[i82] * i9)) >> 16;
                            this.ai[i82] = ((i12 * i13) + (i9 * i10)) >> 16;
                        }
                        if (i62 != 0) {
                            i12 = bh[i62];
                            i62 = bt[i62];
                            i9 = this.ae[i82];
                            i10 = this.am[i82];
                            this.am[i82] = ((this.ae[i82] * i12) + (this.am[i82] * i62)) >> 16;
                            this.ae[i82] = ((i62 * i9) - (i12 * i10)) >> 16;
                        }
                        if (i11 != 0) {
                            i62 = bh[i11];
                            i11 = bt[i11];
                            i12 = this.am[i82];
                            i9 = this.ai[i82];
                            this.am[i82] = ((this.am[i82] * i11) - (this.ai[i82] * i62)) >> 16;
                            this.ai[i82] = ((i62 * i12) + (i11 * i9)) >> 16;
                        }
                        iArr4 = this.ai;
                        iArr4[i82] = iArr4[i82] + bn;
                        iArr4 = this.ae;
                        iArr4[i82] = iArr4[i82] + bz;
                        iArr4 = this.am;
                        iArr4[i82] = iArr4[i82] + by;
                    }
                }
            }
        } else if (i == 3) {
            for (int i7222 : iArr) {
                if (i7222 < this.av.length) {
                    iArr3 = this.av[i7222];
                    for (int i822 : iArr3) {
                        iArr4 = this.ai;
                        iArr4[i822] = iArr4[i822] - bn;
                        iArr4 = this.ae;
                        iArr4[i822] = iArr4[i822] - bz;
                        iArr4 = this.am;
                        iArr4[i822] = iArr4[i822] - by;
                        this.ai[i822] = (this.ai[i822] * i2) / 128;
                        this.ae[i822] = (this.ae[i822] * i3) / 128;
                        this.am[i822] = (this.am[i822] * i4) / 128;
                        iArr4 = this.ai;
                        iArr4[i822] = iArr4[i822] + bn;
                        iArr4 = this.ae;
                        iArr4[i822] = iArr4[i822] + bz;
                        iArr4 = this.am;
                        iArr4[i822] = iArr4[i822] + by;
                    }
                }
            }
        } else if (i == 5 && this.at != null && this.ac != null) {
            for (int i72222 : iArr) {
                if (i72222 < this.at.length) {
                    iArr2 = this.at[i72222];
                    for (int i622 : iArr2) {
                        i5 = (this.ac[i622] & 255) + (i2 * 8);
                        if (i5 < 0) {
                            i5 = 0;
                        } else if (i5 > 255) {
                            i5 = 255;
                        }
                        this.ac[i622] = (byte) i5;
                    }
                }
            }
        }
    }

    public bp aq(boolean z) {
        if (!z && aq.length < this.ak) {
            aq = new byte[(this.ak + 100)];
        }
        return al(z, ad, aq);
    }

    public bp ar(boolean z) {
        if (!z && al.length < this.ak) {
            al = new byte[(this.ak + 100)];
        }
        return al(z, ar, al);
    }

    public void as(ba baVar, int i) {
        int i2 = 0;
        if (this.av != null && i != -1) {
            bk bkVar = baVar.ad[i];
            bj bjVar = bkVar.aj;
            bn = 0;
            bz = 0;
            by = 0;
            int i3 = 0;
            while (i3 < bkVar.ai && bjVar.ar[bkVar.ae[i3]] != 5) {
                i3++;
            }
            while (true) {
                int i4 = i2;
                if (i4 < bkVar.ai) {
                    i3 = bkVar.ae[i4];
                    ap(bjVar.ar[i3], bjVar.al[i3], bkVar.am[i4], bkVar.ak[i4], bkVar.as[i4]);
                    i2 = i4 + 1;
                } else {
                    ak();
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public bp at(boolean z, bp bpVar, byte[] bArr) {
        int i;
        int i2 = 0;
        bpVar.aj = this.aj;
        bpVar.ak = this.ak;
        bpVar.af = this.af;
        if (bpVar.ai == null || bpVar.ai.length < this.aj) {
            bpVar.ai = new int[(this.aj + 100)];
            bpVar.ae = new int[(this.aj + 100)];
            bpVar.am = new int[(this.aj + 100)];
        }
        for (i = 0; i < this.aj; i++) {
            bpVar.ai[i] = this.ai[i];
            bpVar.ae[i] = this.ae[i];
            bpVar.am[i] = this.am[i];
        }
        if (z) {
            bpVar.ac = this.ac;
        } else {
            bpVar.ac = bArr;
            if (this.ac == null) {
                for (i = 0; i < this.ak; i++) {
                    bpVar.ac[i] = (byte) 0;
                }
            } else {
                while (i2 < this.ak) {
                    bpVar.ac[i2] = this.ac[i2];
                    i2++;
                }
            }
        }
        bpVar.as = this.as;
        bpVar.ag = this.ag;
        bpVar.ap = this.ap;
        bpVar.au = this.au;
        bpVar.az = this.az;
        bpVar.ax = this.ax;
        bpVar.aw = this.aw;
        bpVar.aa = this.aa;
        bpVar.ao = this.ao;
        bpVar.ah = this.ah;
        bpVar.ay = this.ay;
        bpVar.an = this.an;
        bpVar.ab = this.ab;
        bpVar.av = this.av;
        bpVar.at = this.at;
        bpVar.bk = this.bk;
        bpVar.ba = this.ba;
        bpVar.bs = this.bs;
        i = bm;
        bm = i + 1;
        bpVar.bq = i;
        bpVar.bl = true;
        bpVar.ak();
        return bpVar;
    }

    public void au() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.ai[i];
            this.ai[i] = this.am[i];
            this.am[i] = -i2;
        }
        ak();
    }

    public bp av(boolean z) {
        if (!z && al.length < this.ak) {
            al = new byte[(this.ak + 100)];
        }
        return al(z, ar, al);
    }

    public void aw(int i) {
        int i2 = bh[i];
        int i3 = bt[i];
        for (int i4 = 0; i4 < this.aj; i4++) {
            int i5 = this.ae[i4];
            int i6 = this.am[i4];
            this.am[i4] = ((this.ae[i4] * i2) + (this.am[i4] * i3)) >> 16;
            this.ae[i4] = ((i5 * i3) - (i6 * i2)) >> 16;
        }
        ak();
    }

    public void ax() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.am[i];
            this.am[i] = this.ai[i];
            this.ai[i] = -i2;
        }
        ak();
    }

    public bp ay(boolean z) {
        if (!z && aq.length < this.ak) {
            aq = new byte[(this.ak + 100)];
        }
        return al(z, ad, aq);
    }

    public void az() {
        for (int i = 0; i < this.aj; i++) {
            this.ai[i] = -this.ai[i];
            this.am[i] = -this.am[i];
        }
        ak();
    }

    /* Access modifiers changed, original: 0000 */
    public bp ba(boolean z, bp bpVar, byte[] bArr) {
        int i;
        int i2 = 0;
        bpVar.aj = this.aj;
        bpVar.ak = this.ak;
        bpVar.af = this.af;
        if (bpVar.ai == null || bpVar.ai.length < this.aj) {
            bpVar.ai = new int[(this.aj + 100)];
            bpVar.ae = new int[(this.aj + 100)];
            bpVar.am = new int[(this.aj + 100)];
        }
        for (i = 0; i < this.aj; i++) {
            bpVar.ai[i] = this.ai[i];
            bpVar.ae[i] = this.ae[i];
            bpVar.am[i] = this.am[i];
        }
        if (z) {
            bpVar.ac = this.ac;
        } else {
            bpVar.ac = bArr;
            if (this.ac == null) {
                for (i = 0; i < this.ak; i++) {
                    bpVar.ac[i] = (byte) 0;
                }
            } else {
                while (i2 < this.ak) {
                    bpVar.ac[i2] = this.ac[i2];
                    i2++;
                }
            }
        }
        bpVar.as = this.as;
        bpVar.ag = this.ag;
        bpVar.ap = this.ap;
        bpVar.au = this.au;
        bpVar.az = this.az;
        bpVar.ax = this.ax;
        bpVar.aw = this.aw;
        bpVar.aa = this.aa;
        bpVar.ao = this.ao;
        bpVar.ah = this.ah;
        bpVar.ay = this.ay;
        bpVar.an = this.an;
        bpVar.ab = this.ab;
        bpVar.av = this.av;
        bpVar.at = this.at;
        bpVar.bk = this.bk;
        bpVar.ba = this.ba;
        bpVar.bs = this.bs;
        i = bm;
        bm = i + 1;
        bpVar.bq = i;
        bpVar.bl = true;
        bpVar.ak();
        return bpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void bb() {
        int i = 0;
        if (this.bf != 2) {
            this.bf = 2;
            this.bi = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                i2 = ((i2 * i2) + (i4 * i4)) + (i3 * i3);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bv = this.bi;
            this.bc = this.bi + this.bi;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bc() {
        int i = 0;
        if (this.bf != 2) {
            this.bf = 2;
            this.bi = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                i2 = ((i2 * i2) + (i4 * i4)) + (i3 * i3);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bv = this.bi;
            this.bc = this.bi + this.bi;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bd(int i) {
        if (this.br == -1) {
            int i2 = bt[i];
            int i3 = bh[i];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < this.aj; i10++) {
                int be = hy.be(this.ai[i10], this.am[i10], i2, i3, (byte) -102);
                int i11 = this.ae[i10];
                int bj = mh.bj(this.ai[i10], this.am[i10], i2, i3, -1572183737);
                if (be < i5) {
                    i5 = be;
                }
                if (be > i4) {
                    i4 = be;
                }
                if (i11 < i7) {
                    i7 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (bj < i9) {
                    i9 = bj;
                }
                if (bj > i8) {
                    i8 = bj;
                }
            }
            this.bg = (i4 + i5) / 2;
            this.bu = (i6 + i7) / 2;
            this.bw = (i8 + i9) / 2;
            this.br = ((i4 - i5) + 1) / 2;
            this.be = ((i6 - i7) + 1) / 2;
            this.bj = ((i8 - i9) + 1) / 2;
            if (this.br < 32) {
                this.br = 32;
            }
            if (this.bj < 32) {
                this.bj = 32;
            }
            if (this.bs) {
                this.br += 8;
                this.bj += 8;
            }
        }
    }

    public void be(ba baVar, int i, ba baVar2, int i2, int[] iArr) {
        if (i != -1) {
            if (iArr == null || i2 == -1) {
                as(baVar, i);
                return;
            }
            int i3;
            int i4;
            int i5;
            bk bkVar = baVar.ad[i];
            bk bkVar2 = baVar2.ad[i2];
            bj bjVar = bkVar.aj;
            bn = 0;
            bz = 0;
            by = 0;
            int i6 = iArr[0];
            int i7 = 0;
            int i8 = 1;
            while (true) {
                i3 = i7;
                if (i3 >= bkVar.ai) {
                    break;
                }
                i7 = bkVar.ae[i3];
                i4 = i6;
                i5 = i8;
                while (i7 > i4) {
                    i4 = iArr[i5];
                    i5++;
                }
                if (i7 != i4 || bjVar.ar[i7] == 0) {
                    ap(bjVar.ar[i7], bjVar.al[i7], bkVar.am[i3], bkVar.ak[i3], bkVar.as[i3]);
                }
                i7 = i3 + 1;
                i6 = i4;
                i8 = i5;
            }
            bn = 0;
            bz = 0;
            by = 0;
            i6 = iArr[0];
            i8 = 1;
            for (i3 = 0; i3 < bkVar2.ai; i3++) {
                i7 = bkVar2.ae[i3];
                i4 = i6;
                i5 = i8;
                while (i7 > i4) {
                    i4 = iArr[i5];
                    i5++;
                }
                if (i7 == i4 || bjVar.ar[i7] == 0) {
                    ap(bjVar.ar[i7], bjVar.al[i7], bkVar2.am[i3], bkVar2.ak[i3], bkVar2.as[i3]);
                }
                i6 = i4;
                i8 = i5;
            }
            ak();
        }
    }

    public void bf() {
        int i = 0;
        if (this.bf != 1) {
            this.bf = 1;
            this.bx = 0;
            this.bb = 0;
            this.bi = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                int i5 = -i3;
                if (i5 > this.bx * -1736982785) {
                    this.bx = i5 * 134693119;
                }
                if (i3 > this.bb) {
                    this.bb = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bv = (int) (Math.sqrt((double) ((this.bi * this.bi) + ((this.bx * -1736982785) * (this.bx * -1736982785)))) + 0.99d);
            this.bc = this.bv + ((int) (Math.sqrt((double) ((this.bi * this.bi) + (this.bb * this.bb))) + 0.99d));
        }
    }

    public int bg() {
        ai();
        return this.bi;
    }

    /* Access modifiers changed, original: 0000 */
    public void bh(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int[] iArr2;
        int i6;
        int[] iArr3;
        int[] iArr4;
        if (i == 0) {
            bn = 0;
            bz = 0;
            by = 0;
            i5 = 0;
            for (int i7 : iArr) {
                if (i7 < this.av.length) {
                    iArr2 = this.av[i7];
                    for (int i62 : iArr2) {
                        bn += this.ai[i62];
                        bz += this.ae[i62];
                        by = this.am[i62] + by;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bn = (bn / i5) + i2;
                bz = (bz / i5) + i3;
                by = (by / i5) + i4;
                return;
            }
            bn = i2;
            bz = i3;
            by = i4;
        } else if (i == 1) {
            for (int i72 : iArr) {
                if (i72 < this.av.length) {
                    iArr3 = this.av[i72];
                    for (int i8 : iArr3) {
                        iArr4 = this.ai;
                        iArr4[i8] = iArr4[i8] + i2;
                        iArr4 = this.ae;
                        iArr4[i8] = iArr4[i8] + i3;
                        iArr4 = this.am;
                        iArr4[i8] = iArr4[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i722 : iArr) {
                if (i722 < this.av.length) {
                    iArr3 = this.av[i722];
                    for (int i82 : iArr3) {
                        int i9;
                        int i10;
                        iArr4 = this.ai;
                        iArr4[i82] = iArr4[i82] - bn;
                        iArr4 = this.ae;
                        iArr4[i82] = iArr4[i82] - bz;
                        iArr4 = this.am;
                        iArr4[i82] = iArr4[i82] - by;
                        i62 = (i2 & 255) * 8;
                        int i11 = (1451994886 & i3) * 8;
                        int i12 = (i4 & 255) * 8;
                        if (i12 != 0) {
                            i9 = bh[i12];
                            i12 = bt[i12];
                            i10 = this.ae[i82];
                            int i13 = this.ai[i82];
                            this.ae[i82] = ((this.ae[i82] * i12) - (this.ai[i82] * i9)) >> 16;
                            this.ai[i82] = ((i12 * i13) + (i9 * i10)) >> 16;
                        }
                        if (i62 != 0) {
                            i12 = bh[i62];
                            i62 = bt[i62];
                            i9 = this.ae[i82];
                            i10 = this.am[i82];
                            this.am[i82] = ((this.ae[i82] * i12) + (this.am[i82] * i62)) >> 16;
                            this.ae[i82] = ((i62 * i9) - (i12 * i10)) >> 16;
                        }
                        if (i11 != 0) {
                            i62 = bh[i11];
                            i11 = bt[i11];
                            i12 = this.am[i82];
                            i9 = this.ai[i82];
                            this.am[i82] = ((this.am[i82] * i11) - (this.ai[i82] * i62)) >> 16;
                            this.ai[i82] = ((i62 * i12) + (i11 * i9)) >> 16;
                        }
                        iArr4 = this.ai;
                        iArr4[i82] = iArr4[i82] + bn;
                        iArr4 = this.ae;
                        iArr4[i82] = iArr4[i82] + bz;
                        iArr4 = this.am;
                        iArr4[i82] = iArr4[i82] + by;
                    }
                }
            }
        } else if (i == 3) {
            for (int i7222 : iArr) {
                if (i7222 < this.av.length) {
                    iArr3 = this.av[i7222];
                    for (int i822 : iArr3) {
                        iArr4 = this.ai;
                        iArr4[i822] = iArr4[i822] - bn;
                        iArr4 = this.ae;
                        iArr4[i822] = iArr4[i822] - bz;
                        iArr4 = this.am;
                        iArr4[i822] = iArr4[i822] - by;
                        this.ai[i822] = (this.ai[i822] * i2) / 1557271113;
                        this.ae[i822] = (this.ae[i822] * i3) / 128;
                        this.am[i822] = (this.am[i822] * i4) / 128;
                        iArr4 = this.ai;
                        iArr4[i822] = iArr4[i822] + bn;
                        iArr4 = this.ae;
                        iArr4[i822] = iArr4[i822] + bz;
                        iArr4 = this.am;
                        iArr4[i822] = iArr4[i822] + by;
                    }
                }
            }
        } else if (i == 5 && this.at != null && this.ac != null) {
            for (int i72222 : iArr) {
                if (i72222 < this.at.length) {
                    iArr2 = this.at[i72222];
                    for (int i622 : iArr2) {
                        i5 = (this.ac[i622] & -1547335263) + (i2 * 8);
                        if (i5 < 0) {
                            i5 = 0;
                        } else if (i5 > 207226805) {
                            i5 = 255;
                        }
                        this.ac[i622] = (byte) i5;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bi() {
        int i = 0;
        if (this.bf != 2) {
            this.bf = 2;
            this.bi = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                i2 = ((i2 * i2) + (i4 * i4)) + (i3 * i3);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bv = this.bi;
            this.bc = this.bi + this.bi;
        }
    }

    public void bj(ba baVar, int i, ba baVar2, int i2, int[] iArr) {
        if (i != -1) {
            if (iArr == null || i2 == -1) {
                as(baVar, i);
                return;
            }
            int i3;
            int i4;
            int i5;
            bk bkVar = baVar.ad[i];
            bk bkVar2 = baVar2.ad[i2];
            bj bjVar = bkVar.aj;
            bn = 0;
            bz = 0;
            by = 0;
            int i6 = iArr[0];
            int i7 = 0;
            int i8 = 1;
            while (true) {
                i3 = i7;
                if (i3 >= bkVar.ai) {
                    break;
                }
                i7 = bkVar.ae[i3];
                i4 = i6;
                i5 = i8;
                while (i7 > i4) {
                    i4 = iArr[i5];
                    i5++;
                }
                if (i7 != i4 || bjVar.ar[i7] == 0) {
                    ap(bjVar.ar[i7], bjVar.al[i7], bkVar.am[i3], bkVar.ak[i3], bkVar.as[i3]);
                }
                i7 = i3 + 1;
                i6 = i4;
                i8 = i5;
            }
            bn = 0;
            bz = 0;
            by = 0;
            i6 = iArr[0];
            i8 = 1;
            for (i3 = 0; i3 < bkVar2.ai; i3++) {
                i7 = bkVar2.ae[i3];
                i4 = i6;
                i5 = i8;
                while (i7 > i4) {
                    i4 = iArr[i5];
                    i5++;
                }
                if (i7 == i4 || bjVar.ar[i7] == 0) {
                    ap(bjVar.ar[i7], bjVar.al[i7], bkVar2.am[i3], bkVar2.ak[i3], bkVar2.as[i3]);
                }
                i6 = i4;
                i8 = i5;
            }
            ak();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public bp bk(boolean z, bp bpVar, byte[] bArr) {
        int i;
        int i2 = 0;
        bpVar.aj = this.aj;
        bpVar.ak = this.ak;
        bpVar.af = this.af;
        if (bpVar.ai == null || bpVar.ai.length < this.aj) {
            bpVar.ai = new int[(this.aj - 460481729)];
            bpVar.ae = new int[(this.aj + 100)];
            bpVar.am = new int[(this.aj + 100)];
        }
        for (i = 0; i < this.aj; i++) {
            bpVar.ai[i] = this.ai[i];
            bpVar.ae[i] = this.ae[i];
            bpVar.am[i] = this.am[i];
        }
        if (z) {
            bpVar.ac = this.ac;
        } else {
            bpVar.ac = bArr;
            if (this.ac == null) {
                for (i = 0; i < this.ak; i++) {
                    bpVar.ac[i] = (byte) 0;
                }
            } else {
                while (i2 < this.ak) {
                    bpVar.ac[i2] = this.ac[i2];
                    i2++;
                }
            }
        }
        bpVar.as = this.as;
        bpVar.ag = this.ag;
        bpVar.ap = this.ap;
        bpVar.au = this.au;
        bpVar.az = this.az;
        bpVar.ax = this.ax;
        bpVar.aw = this.aw;
        bpVar.aa = this.aa;
        bpVar.ao = this.ao;
        bpVar.ah = this.ah;
        bpVar.ay = this.ay;
        bpVar.an = this.an;
        bpVar.ab = this.ab;
        bpVar.av = this.av;
        bpVar.at = this.at;
        bpVar.bk = this.bk;
        bpVar.ba = this.ba;
        bpVar.bs = this.bs;
        i = bm;
        bm = i + 1;
        bpVar.bq = i;
        bpVar.bl = true;
        bpVar.ak();
        return bpVar;
    }

    public void bl() {
        int i = 0;
        if (this.bf != 1) {
            this.bf = 1;
            this.bx = 0;
            this.bb = 0;
            this.bi = 0;
            while (i < this.aj) {
                int i2 = this.ai[i];
                int i3 = this.ae[i];
                int i4 = this.am[i];
                int i5 = -i3;
                if (i5 > this.bx * -1736982785) {
                    this.bx = i5 * 1430980238;
                }
                if (i3 > this.bb) {
                    this.bb = i3;
                }
                i2 = (i2 * i2) + (i4 * i4);
                if (i2 > this.bi) {
                    this.bi = i2;
                }
                i++;
            }
            this.bi = (int) (Math.sqrt((double) this.bi) + 0.99d);
            this.bv = (int) (Math.sqrt((double) ((this.bi * this.bi) + ((this.bx * -1736982785) * (this.bx * -1736982785)))) + 0.99d);
            this.bc = this.bv + ((int) (Math.sqrt((double) ((this.bi * this.bi) + (this.bb * this.bb))) + 0.99d));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public bp bm(boolean z, bp bpVar, byte[] bArr) {
        int i;
        int i2 = 0;
        bpVar.aj = this.aj;
        bpVar.ak = this.ak;
        bpVar.af = this.af;
        if (bpVar.ai == null || bpVar.ai.length < this.aj) {
            bpVar.ai = new int[(this.aj + 100)];
            bpVar.ae = new int[(this.aj - 1638278652)];
            bpVar.am = new int[(this.aj + 1601452577)];
        }
        for (i = 0; i < this.aj; i++) {
            bpVar.ai[i] = this.ai[i];
            bpVar.ae[i] = this.ae[i];
            bpVar.am[i] = this.am[i];
        }
        if (z) {
            bpVar.ac = this.ac;
        } else {
            bpVar.ac = bArr;
            if (this.ac == null) {
                for (i = 0; i < this.ak; i++) {
                    bpVar.ac[i] = (byte) 0;
                }
            } else {
                while (i2 < this.ak) {
                    bpVar.ac[i2] = this.ac[i2];
                    i2++;
                }
            }
        }
        bpVar.as = this.as;
        bpVar.ag = this.ag;
        bpVar.ap = this.ap;
        bpVar.au = this.au;
        bpVar.az = this.az;
        bpVar.ax = this.ax;
        bpVar.aw = this.aw;
        bpVar.aa = this.aa;
        bpVar.ao = this.ao;
        bpVar.ah = this.ah;
        bpVar.ay = this.ay;
        bpVar.an = this.an;
        bpVar.ab = this.ab;
        bpVar.av = this.av;
        bpVar.at = this.at;
        bpVar.bk = this.bk;
        bpVar.ba = this.ba;
        bpVar.bs = this.bs;
        i = bm;
        bm = i + 1;
        bpVar.bq = i;
        bpVar.bl = true;
        bpVar.ak();
        return bpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void bn(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int[] iArr2;
        int i6;
        int[] iArr3;
        int[] iArr4;
        if (i == 0) {
            bn = 0;
            bz = 0;
            by = 0;
            i5 = 0;
            for (int i7 : iArr) {
                if (i7 < this.av.length) {
                    iArr2 = this.av[i7];
                    for (int i62 : iArr2) {
                        bn += this.ai[i62];
                        bz += this.ae[i62];
                        by = this.am[i62] + by;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bn = (bn / i5) + i2;
                bz = (bz / i5) + i3;
                by = (by / i5) + i4;
                return;
            }
            bn = i2;
            bz = i3;
            by = i4;
        } else if (i == 1) {
            for (int i72 : iArr) {
                if (i72 < this.av.length) {
                    iArr3 = this.av[i72];
                    for (int i8 : iArr3) {
                        iArr4 = this.ai;
                        iArr4[i8] = iArr4[i8] + i2;
                        iArr4 = this.ae;
                        iArr4[i8] = iArr4[i8] + i3;
                        iArr4 = this.am;
                        iArr4[i8] = iArr4[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i722 : iArr) {
                if (i722 < this.av.length) {
                    iArr3 = this.av[i722];
                    for (int i82 : iArr3) {
                        int i9;
                        int i10;
                        iArr4 = this.ai;
                        iArr4[i82] = iArr4[i82] - bn;
                        iArr4 = this.ae;
                        iArr4[i82] = iArr4[i82] - bz;
                        iArr4 = this.am;
                        iArr4[i82] = iArr4[i82] - by;
                        i62 = (-579074589 & i2) * 8;
                        int i11 = (-1546592715 & i3) * 8;
                        int i12 = (i4 & 255) * 8;
                        if (i12 != 0) {
                            i9 = bh[i12];
                            i12 = bt[i12];
                            i10 = this.ae[i82];
                            int i13 = this.ai[i82];
                            this.ae[i82] = ((this.ae[i82] * i12) - (this.ai[i82] * i9)) >> 16;
                            this.ai[i82] = ((i12 * i13) + (i9 * i10)) >> 16;
                        }
                        if (i62 != 0) {
                            i12 = bh[i62];
                            i62 = bt[i62];
                            i9 = this.ae[i82];
                            i10 = this.am[i82];
                            this.am[i82] = ((this.ae[i82] * i12) + (this.am[i82] * i62)) >> 16;
                            this.ae[i82] = ((i62 * i9) - (i12 * i10)) >> 16;
                        }
                        if (i11 != 0) {
                            i62 = bh[i11];
                            i11 = bt[i11];
                            i12 = this.am[i82];
                            i9 = this.ai[i82];
                            this.am[i82] = ((this.am[i82] * i11) - (this.ai[i82] * i62)) >> 16;
                            this.ai[i82] = ((i62 * i12) + (i11 * i9)) >> 16;
                        }
                        iArr4 = this.ai;
                        iArr4[i82] = iArr4[i82] + bn;
                        iArr4 = this.ae;
                        iArr4[i82] = iArr4[i82] + bz;
                        iArr4 = this.am;
                        iArr4[i82] = iArr4[i82] + by;
                    }
                }
            }
        } else if (i == 3) {
            for (int i7222 : iArr) {
                if (i7222 < this.av.length) {
                    iArr3 = this.av[i7222];
                    for (int i822 : iArr3) {
                        iArr4 = this.ai;
                        iArr4[i822] = iArr4[i822] - bn;
                        iArr4 = this.ae;
                        iArr4[i822] = iArr4[i822] - bz;
                        iArr4 = this.am;
                        iArr4[i822] = iArr4[i822] - by;
                        this.ai[i822] = (this.ai[i822] * i2) / -537954570;
                        this.ae[i822] = (this.ae[i822] * i3) / 128;
                        this.am[i822] = (this.am[i822] * i4) / 128;
                        iArr4 = this.ai;
                        iArr4[i822] = iArr4[i822] + bn;
                        iArr4 = this.ae;
                        iArr4[i822] = iArr4[i822] + bz;
                        iArr4 = this.am;
                        iArr4[i822] = iArr4[i822] + by;
                    }
                }
            }
        } else if (i == 5 && this.at != null && this.ac != null) {
            for (int i72222 : iArr) {
                if (i72222 < this.at.length) {
                    iArr2 = this.at[i72222];
                    for (int i622 : iArr2) {
                        i5 = (this.ac[i622] & 255) + (i2 * 8);
                        if (i5 < 0) {
                            i5 = 0;
                        } else if (i5 > -1989844178) {
                            i5 = 950366501;
                        }
                        this.ac[i622] = (byte) i5;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(int i) {
        if (this.br == -1) {
            int i2 = bt[i];
            int i3 = bh[i];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < this.aj; i10++) {
                int be = hy.be(this.ai[i10], this.am[i10], i2, i3, (byte) -110);
                int i11 = this.ae[i10];
                int bj = mh.bj(this.ai[i10], this.am[i10], i2, i3, -1572183737);
                if (be < i4) {
                    i4 = be;
                }
                if (be > i5) {
                    i5 = be;
                }
                if (i11 < i7) {
                    i7 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (bj < i9) {
                    i9 = bj;
                }
                if (bj > i8) {
                    i8 = bj;
                }
            }
            this.bg = (i5 + i4) / 2;
            this.bu = (i6 + i7) / 2;
            this.bw = (i8 + i9) / 2;
            this.br = ((i5 - i4) + 1) / 2;
            this.be = ((i6 - i7) + 1) / 2;
            this.bj = ((i8 - i9) + 1) / 2;
            if (this.br < -1634925335) {
                this.br = -1460785744;
            }
            if (this.bj < 32) {
                this.bj = 32;
            }
            if (this.bs) {
                this.br += 8;
                this.bj += 8;
            }
        }
    }

    public void bp() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.ai[i];
            this.ai[i] = this.am[i];
            this.am[i] = -i2;
        }
        ak();
    }

    /* Access modifiers changed, original: 0000 */
    public void bq(int i) {
        if (this.br == -1) {
            int i2 = bt[i];
            int i3 = bh[i];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < this.aj; i10++) {
                int be = hy.be(this.ai[i10], this.am[i10], i2, i3, (byte) -33);
                int i11 = this.ae[i10];
                int bj = mh.bj(this.ai[i10], this.am[i10], i2, i3, -1572183737);
                if (be < i5) {
                    i5 = be;
                }
                if (be > i4) {
                    i4 = be;
                }
                if (i11 < i7) {
                    i7 = i11;
                }
                if (i11 > i6) {
                    i6 = i11;
                }
                if (bj < i9) {
                    i9 = bj;
                }
                if (bj > i8) {
                    i8 = bj;
                }
            }
            this.bg = (i4 + i5) / 2;
            this.bu = (i6 + i7) / 2;
            this.bw = (i8 + i9) / 2;
            this.br = ((i4 - i5) + 1) / 2;
            this.be = ((i6 - i7) + 1) / 2;
            this.bj = ((i8 - i9) + 1) / 2;
            if (this.br < 32) {
                this.br = 32;
            }
            if (this.bj < 32) {
                this.bj = 32;
            }
            if (this.bs) {
                this.br += 8;
                this.bj += 8;
            }
        }
    }

    public void br(ba baVar, int i) {
        int i2 = 0;
        if (this.av != null && i != -1) {
            bk bkVar = baVar.ad[i];
            bj bjVar = bkVar.aj;
            bn = 0;
            bz = 0;
            by = 0;
            int i3 = 0;
            while (i3 < bkVar.ai && bjVar.ar[bkVar.ae[i3]] != 5) {
                i3++;
            }
            while (true) {
                int i4 = i2;
                if (i4 < bkVar.ai) {
                    i3 = bkVar.ae[i4];
                    ap(bjVar.ar[i3], bjVar.al[i3], bkVar.am[i4], bkVar.ak[i4], bkVar.as[i4]);
                    i2 = i4 + 1;
                } else {
                    ak();
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public bp bs(boolean z, bp bpVar, byte[] bArr) {
        int i;
        int i2 = 0;
        bpVar.aj = this.aj;
        bpVar.ak = this.ak;
        bpVar.af = this.af;
        if (bpVar.ai == null || bpVar.ai.length < this.aj) {
            bpVar.ai = new int[(this.aj + 100)];
            bpVar.ae = new int[(this.aj - 1932349519)];
            bpVar.am = new int[(this.aj + 100)];
        }
        for (i = 0; i < this.aj; i++) {
            bpVar.ai[i] = this.ai[i];
            bpVar.ae[i] = this.ae[i];
            bpVar.am[i] = this.am[i];
        }
        if (z) {
            bpVar.ac = this.ac;
        } else {
            bpVar.ac = bArr;
            if (this.ac == null) {
                for (i = 0; i < this.ak; i++) {
                    bpVar.ac[i] = (byte) 0;
                }
            } else {
                while (i2 < this.ak) {
                    bpVar.ac[i2] = this.ac[i2];
                    i2++;
                }
            }
        }
        bpVar.as = this.as;
        bpVar.ag = this.ag;
        bpVar.ap = this.ap;
        bpVar.au = this.au;
        bpVar.az = this.az;
        bpVar.ax = this.ax;
        bpVar.aw = this.aw;
        bpVar.aa = this.aa;
        bpVar.ao = this.ao;
        bpVar.ah = this.ah;
        bpVar.ay = this.ay;
        bpVar.an = this.an;
        bpVar.ab = this.ab;
        bpVar.av = this.av;
        bpVar.at = this.at;
        bpVar.bk = this.bk;
        bpVar.ba = this.ba;
        bpVar.bs = this.bs;
        i = bm;
        bm = i + 1;
        bpVar.bq = i;
        bpVar.bl = true;
        bpVar.ak();
        return bpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void bt(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int[] iArr2;
        int i6;
        int[] iArr3;
        int[] iArr4;
        if (i == 0) {
            bn = 0;
            bz = 0;
            by = 0;
            i5 = 0;
            for (int i7 : iArr) {
                if (i7 < this.av.length) {
                    iArr2 = this.av[i7];
                    for (int i62 : iArr2) {
                        bn += this.ai[i62];
                        bz += this.ae[i62];
                        by = this.am[i62] + by;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bn = (bn / i5) + i2;
                bz = (bz / i5) + i3;
                by = (by / i5) + i4;
                return;
            }
            bn = i2;
            bz = i3;
            by = i4;
        } else if (i == 1) {
            for (int i72 : iArr) {
                if (i72 < this.av.length) {
                    iArr3 = this.av[i72];
                    for (int i8 : iArr3) {
                        iArr4 = this.ai;
                        iArr4[i8] = iArr4[i8] + i2;
                        iArr4 = this.ae;
                        iArr4[i8] = iArr4[i8] + i3;
                        iArr4 = this.am;
                        iArr4[i8] = iArr4[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i722 : iArr) {
                if (i722 < this.av.length) {
                    iArr3 = this.av[i722];
                    for (int i82 : iArr3) {
                        int i9;
                        int i10;
                        iArr4 = this.ai;
                        iArr4[i82] = iArr4[i82] - bn;
                        iArr4 = this.ae;
                        iArr4[i82] = iArr4[i82] - bz;
                        iArr4 = this.am;
                        iArr4[i82] = iArr4[i82] - by;
                        i62 = (-368177415 & i2) * 8;
                        int i11 = (i3 & 255) * 8;
                        int i12 = (i4 & 255) * 8;
                        if (i12 != 0) {
                            i9 = bh[i12];
                            i12 = bt[i12];
                            i10 = this.ae[i82];
                            int i13 = this.ai[i82];
                            this.ae[i82] = ((this.ae[i82] * i12) - (this.ai[i82] * i9)) >> 16;
                            this.ai[i82] = ((i12 * i13) + (i9 * i10)) >> 16;
                        }
                        if (i62 != 0) {
                            i12 = bh[i62];
                            i62 = bt[i62];
                            i9 = this.ae[i82];
                            i10 = this.am[i82];
                            this.am[i82] = ((this.ae[i82] * i12) + (this.am[i82] * i62)) >> 16;
                            this.ae[i82] = ((i62 * i9) - (i12 * i10)) >> 16;
                        }
                        if (i11 != 0) {
                            i62 = bh[i11];
                            i11 = bt[i11];
                            i12 = this.am[i82];
                            i9 = this.ai[i82];
                            this.am[i82] = ((this.am[i82] * i11) - (this.ai[i82] * i62)) >> 16;
                            this.ai[i82] = ((i62 * i12) + (i11 * i9)) >> 16;
                        }
                        iArr4 = this.ai;
                        iArr4[i82] = iArr4[i82] + bn;
                        iArr4 = this.ae;
                        iArr4[i82] = iArr4[i82] + bz;
                        iArr4 = this.am;
                        iArr4[i82] = iArr4[i82] + by;
                    }
                }
            }
        } else if (i == 3) {
            for (int i7222 : iArr) {
                if (i7222 < this.av.length) {
                    iArr3 = this.av[i7222];
                    for (int i822 : iArr3) {
                        iArr4 = this.ai;
                        iArr4[i822] = iArr4[i822] - bn;
                        iArr4 = this.ae;
                        iArr4[i822] = iArr4[i822] - bz;
                        iArr4 = this.am;
                        iArr4[i822] = iArr4[i822] - by;
                        this.ai[i822] = (this.ai[i822] * i2) / -775555552;
                        this.ae[i822] = (this.ae[i822] * i3) / 128;
                        this.am[i822] = (this.am[i822] * i4) / -1290356382;
                        iArr4 = this.ai;
                        iArr4[i822] = iArr4[i822] + bn;
                        iArr4 = this.ae;
                        iArr4[i822] = iArr4[i822] + bz;
                        iArr4 = this.am;
                        iArr4[i822] = iArr4[i822] + by;
                    }
                }
            }
        } else if (i == 5 && this.at != null && this.ac != null) {
            for (int i72222 : iArr) {
                if (i72222 < this.at.length) {
                    iArr2 = this.at[i72222];
                    for (int i622 : iArr2) {
                        i5 = (this.ac[i622] & 255) + (i2 * 8);
                        if (i5 < 0) {
                            i5 = 0;
                        } else if (i5 > -1637033385) {
                            i5 = 255;
                        }
                        this.ac[i622] = (byte) i5;
                    }
                }
            }
        }
    }

    public void bu(ba baVar, int i) {
        int i2 = 0;
        if (this.av != null && i != -1) {
            bk bkVar = baVar.ad[i];
            bj bjVar = bkVar.aj;
            bn = 0;
            bz = 0;
            by = 0;
            int i3 = 0;
            while (i3 < bkVar.ai && bjVar.ar[bkVar.ae[i3]] != 5) {
                i3++;
            }
            while (true) {
                int i4 = i2;
                if (i4 < bkVar.ai) {
                    i3 = bkVar.ae[i4];
                    ap(bjVar.ar[i3], bjVar.al[i3], bkVar.am[i4], bkVar.ak[i4], bkVar.as[i4]);
                    i2 = i4 + 1;
                } else {
                    ak();
                    return;
                }
            }
        }
    }

    public int bv() {
        ai();
        return this.bi;
    }

    public void bw(ba baVar, int i) {
        int i2 = 0;
        if (this.av != null && i != -1) {
            bk bkVar = baVar.ad[i];
            bj bjVar = bkVar.aj;
            bn = 0;
            bz = 0;
            by = 0;
            int i3 = 0;
            while (i3 < bkVar.ai && bjVar.ar[bkVar.ae[i3]] != 5) {
                i3++;
            }
            while (true) {
                int i4 = i2;
                if (i4 < bkVar.ai) {
                    i3 = bkVar.ae[i4];
                    ap(bjVar.ar[i3], bjVar.al[i3], bkVar.am[i4], bkVar.ak[i4], bkVar.as[i4]);
                    i2 = i4 + 1;
                } else {
                    ak();
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bx() {
        this.bf = 0;
        this.br = -1;
        this.bd = true;
    }

    public void by() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.ai[i];
            this.ai[i] = this.am[i];
            this.am[i] = -i2;
        }
        ak();
    }

    /* Access modifiers changed, original: 0000 */
    public void bz(int i, int[] iArr, int i2, int i3, int i4) {
        int i5;
        int[] iArr2;
        int i6;
        int[] iArr3;
        int[] iArr4;
        if (i == 0) {
            bn = 0;
            bz = 0;
            by = 0;
            i5 = 0;
            for (int i7 : iArr) {
                if (i7 < this.av.length) {
                    iArr2 = this.av[i7];
                    for (int i62 : iArr2) {
                        bn += this.ai[i62];
                        bz += this.ae[i62];
                        by = this.am[i62] + by;
                        i5++;
                    }
                }
            }
            if (i5 > 0) {
                bn = (bn / i5) + i2;
                bz = (bz / i5) + i3;
                by = (by / i5) + i4;
                return;
            }
            bn = i2;
            bz = i3;
            by = i4;
        } else if (i == 1) {
            for (int i72 : iArr) {
                if (i72 < this.av.length) {
                    iArr3 = this.av[i72];
                    for (int i8 : iArr3) {
                        iArr4 = this.ai;
                        iArr4[i8] = iArr4[i8] + i2;
                        iArr4 = this.ae;
                        iArr4[i8] = iArr4[i8] + i3;
                        iArr4 = this.am;
                        iArr4[i8] = iArr4[i8] + i4;
                    }
                }
            }
        } else if (i == 2) {
            for (int i722 : iArr) {
                if (i722 < this.av.length) {
                    iArr3 = this.av[i722];
                    for (int i82 : iArr3) {
                        int i9;
                        int i10;
                        iArr4 = this.ai;
                        iArr4[i82] = iArr4[i82] - bn;
                        iArr4 = this.ae;
                        iArr4[i82] = iArr4[i82] - bz;
                        iArr4 = this.am;
                        iArr4[i82] = iArr4[i82] - by;
                        i62 = (i2 & 255) * 8;
                        int i11 = (i3 & 255) * 8;
                        int i12 = (i4 & 255) * 8;
                        if (i12 != 0) {
                            i9 = bh[i12];
                            i12 = bt[i12];
                            i10 = this.ae[i82];
                            int i13 = this.ai[i82];
                            this.ae[i82] = ((this.ae[i82] * i12) - (this.ai[i82] * i9)) >> 16;
                            this.ai[i82] = ((i12 * i13) + (i9 * i10)) >> 16;
                        }
                        if (i62 != 0) {
                            i12 = bh[i62];
                            i62 = bt[i62];
                            i9 = this.ae[i82];
                            i10 = this.am[i82];
                            this.am[i82] = ((this.ae[i82] * i12) + (this.am[i82] * i62)) >> 16;
                            this.ae[i82] = ((i62 * i9) - (i12 * i10)) >> 16;
                        }
                        if (i11 != 0) {
                            i62 = bh[i11];
                            i11 = bt[i11];
                            i12 = this.am[i82];
                            i9 = this.ai[i82];
                            this.am[i82] = ((this.am[i82] * i11) - (this.ai[i82] * i62)) >> 16;
                            this.ai[i82] = ((i62 * i12) + (i11 * i9)) >> 16;
                        }
                        iArr4 = this.ai;
                        iArr4[i82] = iArr4[i82] + bn;
                        iArr4 = this.ae;
                        iArr4[i82] = iArr4[i82] + bz;
                        iArr4 = this.am;
                        iArr4[i82] = iArr4[i82] + by;
                    }
                }
            }
        } else if (i == 3) {
            for (int i7222 : iArr) {
                if (i7222 < this.av.length) {
                    iArr3 = this.av[i7222];
                    for (int i822 : iArr3) {
                        iArr4 = this.ai;
                        iArr4[i822] = iArr4[i822] - bn;
                        iArr4 = this.ae;
                        iArr4[i822] = iArr4[i822] - bz;
                        iArr4 = this.am;
                        iArr4[i822] = iArr4[i822] - by;
                        this.ai[i822] = (this.ai[i822] * i2) / 128;
                        this.ae[i822] = (this.ae[i822] * i3) / 128;
                        this.am[i822] = (this.am[i822] * i4) / 128;
                        iArr4 = this.ai;
                        iArr4[i822] = iArr4[i822] + bn;
                        iArr4 = this.ae;
                        iArr4[i822] = iArr4[i822] + bz;
                        iArr4 = this.am;
                        iArr4[i822] = iArr4[i822] + by;
                    }
                }
            }
        } else if (i == 5 && this.at != null && this.ac != null) {
            for (int i72222 : iArr) {
                if (i72222 < this.at.length) {
                    iArr2 = this.at[i72222];
                    for (int i622 : iArr2) {
                        i5 = (this.ac[i622] & 255) + (i2 * 8);
                        if (i5 < 0) {
                            i5 = 0;
                        } else if (i5 > 255) {
                            i5 = 255;
                        }
                        this.ac[i622] = (byte) i5;
                    }
                }
            }
        }
    }

    public void cb(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            int[] iArr = this.ai;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ae;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.am;
            iArr[i4] = iArr[i4] + i3;
        }
        ak();
    }

    public void cc(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            this.ai[i4] = (this.ai[i4] * i) / 128;
            this.ae[i4] = (this.ae[i4] * i2) / 128;
            this.am[i4] = (this.am[i4] * i3) / 128;
        }
        ak();
    }

    public void ce(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            int[] iArr = this.ai;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ae;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.am;
            iArr[i4] = iArr[i4] + i3;
        }
        ak();
    }

    public void ci(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            int[] iArr = this.ai;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ae;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.am;
            iArr[i4] = iArr[i4] + i3;
        }
        ak();
    }

    public void cj() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.ai[i];
            this.ai[i] = this.am[i];
            this.am[i] = -i2;
        }
        ak();
    }

    public void cm() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.ai[i];
            this.ai[i] = this.am[i];
            this.am[i] = -i2;
        }
        ak();
    }

    public void cn(int i) {
        int i2 = bh[i];
        int i3 = bt[i];
        for (int i4 = 0; i4 < this.aj; i4++) {
            int i5 = this.ae[i4];
            int i6 = this.am[i4];
            this.am[i4] = ((this.ae[i4] * i2) + (this.am[i4] * i3)) >> 16;
            this.ae[i4] = ((i5 * i3) - (i6 * i2)) >> 16;
        }
        ak();
    }

    public void cp(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            int[] iArr = this.ai;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ae;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.am;
            iArr[i4] = iArr[i4] + i3;
        }
        ak();
    }

    public void cq() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.am[i];
            this.am[i] = this.ai[i];
            this.ai[i] = -i2;
        }
        ak();
    }

    public void cr(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            this.ai[i4] = (this.ai[i4] * i) / 128;
            this.ae[i4] = (this.ae[i4] * i2) / 128;
            this.am[i4] = (this.am[i4] * i3) / 128;
        }
        ak();
    }

    public void cs(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            this.ai[i4] = (this.ai[i4] * i) / 128;
            this.ae[i4] = (this.ae[i4] * i2) / 128;
            this.am[i4] = (this.am[i4] * i3) / 128;
        }
        ak();
    }

    public void cv() {
        for (int i = 0; i < this.aj; i++) {
            int i2 = this.ai[i];
            this.ai[i] = this.am[i];
            this.am[i] = -i2;
        }
        ak();
    }

    public void cw(int i) {
        int i2 = bh[i];
        int i3 = bt[i];
        for (int i4 = 0; i4 < this.aj; i4++) {
            int i5 = this.ae[i4];
            int i6 = this.am[i4];
            this.am[i4] = ((this.ae[i4] * i2) + (this.am[i4] * i3)) >> 16;
            this.ae[i4] = ((i5 * i3) - (i6 * i2)) >> 16;
        }
        ak();
    }

    public void cy(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aj; i4++) {
            int[] iArr = this.ai;
            iArr[i4] = iArr[i4] + i;
            iArr = this.ae;
            iArr[i4] = iArr[i4] + i2;
            iArr = this.am;
            iArr[i4] = iArr[i4] + i3;
        }
        ak();
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dd() {
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dm() {
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dt() {
        return this;
    }
}
