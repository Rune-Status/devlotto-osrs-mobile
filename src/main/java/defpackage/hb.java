package defpackage;

/* renamed from: hb */
public class hb implements fm {
    static int[] fb;
    boolean ad;
    boolean ae;
    boolean ai;
    boolean aj;
    boolean ak;
    int al;
    boolean am;
    int aq;
    int ar;
    boolean as;

    hb() {
        try {
            this.ad = true;
            this.aq = 0;
            this.aj = false;
            this.ai = false;
            this.ae = false;
            this.am = false;
            this.ak = false;
            this.as = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ap(char c, int i) {
        return c >= '0' && c <= '9';
    }

    static final boolean ar(int i, int i2, gn gnVar, gs gsVar, byte b) {
        try {
            gv.ar[64][64] = 99;
            gv.al[64][64] = 0;
            gv.am[0] = i;
            gv.ak[0] = i2;
            int[][] iArr = gsVar.bc;
            int i3 = i2;
            int i4 = 0;
            int i5 = i;
            int i6;
            for (int i7 = 1; i7 != i4; i7 = i6) {
                i5 = gv.am[i4];
                i3 = gv.ak[i4];
                int i8 = i5 - (i - 64);
                int i9 = i3 - (i2 - 64);
                int i10 = i5 - (gsVar.bl * -1403677009);
                int i11 = i3 - (gsVar.bf * -342516413);
                if (gnVar.ad(2, i5, i3, gsVar, (byte) -5)) {
                    di.aj = 872498109 * i5;
                    gv.ai = 1542774803 * i3;
                    return true;
                }
                int i12;
                int i13;
                int i14;
                int i15 = gv.al[i8][i9] + 1;
                if (i8 > 0) {
                    i12 = i8 - 1;
                    if (gv.ar[i12][i9] != 0) {
                        i6 = i7;
                    } else {
                        i6 = i10 - 1;
                        if ((iArr[i6][i11] & 19136782) != 0) {
                            i6 = i7;
                        } else if ((iArr[i6][i11 + 1] & 19136824) != 0) {
                            i6 = i7;
                        } else {
                            gv.am[i7] = i5 - 1;
                            gv.ak[i7] = i3;
                            i6 = (i7 + 1) & 4095;
                            gv.ar[i12][i9] = 2;
                            gv.al[i12][i9] = i15;
                        }
                    }
                } else {
                    i6 = i7;
                }
                if (i8 < 126) {
                    i13 = i8 + 1;
                    if (gv.ar[i13][i9] == 0) {
                        i12 = i10 + 2;
                        if ((iArr[i12][i11] & 19136899) == 0 && (iArr[i12][i11 + 1] & 19136992) == 0) {
                            gv.am[i6] = i5 + 1;
                            gv.ak[i6] = i3;
                            i6 = (i6 + 1) & 4095;
                            gv.ar[i13][i9] = 8;
                            gv.al[i13][i9] = i15;
                        }
                    }
                }
                if (i9 > 0) {
                    i13 = i9 - 1;
                    if (gv.ar[i8][i13] == 0) {
                        i7 = i11 - 1;
                        if ((iArr[i10][i7] & 19136782) == 0 && (iArr[i10 + 1][i7] & 19136899) == 0) {
                            gv.am[i6] = i5;
                            gv.ak[i6] = i3 - 1;
                            i6 = (i6 + 1) & 4095;
                            gv.ar[i8][i13] = 1;
                            gv.al[i8][i13] = i15;
                        }
                    }
                }
                if (i9 < 126) {
                    i13 = i9 + 1;
                    if (gv.ar[i8][i13] == 0) {
                        i7 = i11 + 2;
                        if ((iArr[i10][i7] & 19136824) == 0 && (iArr[i10 + 1][i7] & 19136992) == 0) {
                            gv.am[i6] = i5;
                            gv.ak[i6] = i3 + 1;
                            i6 = (i6 + 1) & 4095;
                            gv.ar[i8][i13] = 4;
                            gv.al[i8][i13] = i15;
                        }
                    }
                }
                if (i8 > 0 && i9 > 0) {
                    i13 = i8 - 1;
                    i7 = i9 - 1;
                    if (gv.ar[i13][i7] == 0) {
                        i12 = i10 - 1;
                        if ((iArr[i12][i11] & 19136830) == 0) {
                            i14 = i11 - 1;
                            if ((iArr[i12][i14] & 19136782) == 0 && (iArr[i10][i14] & 19136911) == 0) {
                                gv.am[i6] = i5 - 1;
                                gv.ak[i6] = i3 - 1;
                                i6 = (i6 + 1) & 4095;
                                gv.ar[i13][i7] = 3;
                                gv.al[i13][i7] = i15;
                            }
                        }
                    }
                }
                if (i8 < 126 && i9 > 0) {
                    i13 = i8 + 1;
                    i7 = i9 - 1;
                    if (gv.ar[i13][i7] == 0) {
                        i14 = i11 - 1;
                        if ((iArr[i10 + 1][i14] & 19136911) == 0) {
                            i12 = i10 + 2;
                            if ((iArr[i12][i14] & 19136899) == 0 && (iArr[i12][i11] & 19136995) == 0) {
                                gv.am[i6] = i5 + 1;
                                gv.ak[i6] = i3 - 1;
                                i6 = (i6 + 1) & 4095;
                                gv.ar[i13][i7] = 9;
                                gv.al[i13][i7] = i15;
                            }
                        }
                    }
                }
                if (i8 > 0 && i9 < 126) {
                    i13 = i8 - 1;
                    i7 = i9 + 1;
                    if (gv.ar[i13][i7] == 0) {
                        i12 = i10 - 1;
                        if ((iArr[i12][i11 + 1] & 19136830) == 0) {
                            i14 = i11 + 2;
                            if ((iArr[i12][i14] & 19136824) == 0 && (iArr[i10][i14] & 19137016) == 0) {
                                gv.am[i6] = i5 - 1;
                                gv.ak[i6] = i3 + 1;
                                i6 = (i6 + 1) & 4095;
                                gv.ar[i13][i7] = 6;
                                gv.al[i13][i7] = i15;
                            }
                        }
                    }
                }
                if (i8 < 126 && i9 < 126) {
                    i13 = i8 + 1;
                    i7 = i9 + 1;
                    if (gv.ar[i13][i7] == 0) {
                        i8 = i11 + 2;
                        if ((iArr[i10 + 1][i8] & 19137016) == 0) {
                            i12 = i10 + 2;
                            if ((iArr[i12][i8] & 19136992) == 0 && (iArr[i12][i11 + 1] & 19136995) == 0) {
                                gv.am[i6] = i5 + 1;
                                gv.ak[i6] = i3 + 1;
                                gv.ar[i13][i7] = 12;
                                gv.al[i13][i7] = i15;
                                i6 = (i6 + 1) & 4095;
                            }
                        }
                    }
                }
                i4 = (i4 + 1) & 4095;
            }
            di.aj = 872498109 * i5;
            gv.ai = 1542774803 * i3;
            return false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa() {
        this.aj = false;
        this.ai = false;
        this.ae = false;
        this.am = false;
        this.ak = false;
        this.as = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void ac() {
        this.aj = false;
        this.ai = false;
        this.ae = false;
        this.am = false;
        this.ak = false;
        this.as = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i, int i2, byte b) {
        try {
            this.ar = 2126040279 * i;
            this.al = 1384107995 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ae(int i, long j) {
        return true;
    }

    public boolean ag(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean ai(int i, long j) {
        if (84 == i) {
            try {
                this.ai = true;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("hb.ai(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (13 == i) {
            this.ae = true;
        } else if (i == 80) {
            this.am = true;
        } else if (85 == i) {
            ml.ax(1556802434);
        } else if (96 == i) {
            this.ak = true;
        } else if (97 == i) {
            this.as = true;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i, int i2) {
        this.ar = 2126040279 * i;
        this.al = 1384107995 * i2;
    }

    public boolean ak(int i, int i2, int i3, int i4, long j) {
        try {
            if (!this.ad) {
                this.aq = (i + 1) * -1054996645;
            } else if (i == 0) {
                aq(i2, i3, i4, -1696479612);
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(int i) {
        try {
            this.ad = false;
            this.aq = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean am(char c, long j) {
        try {
            ah.az(c, 1703432459);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ao() {
        this.ad = false;
        this.aq = 0;
    }

    public boolean ap(int i, int i2, long j) {
        try {
            if (!this.aj) {
                ad(i, i2, (byte) 63);
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(int i, int i2, int i3, int i4) {
        try {
            if (!this.aj) {
                if (i == 0 || i == 1 || (!cl.cs && i == 4)) {
                    ad(i2, i3, (byte) 29);
                    this.aj = true;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(byte b) {
        try {
            this.aj = false;
            this.ai = false;
            this.ae = false;
            this.am = false;
            this.ak = false;
            this.as = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean as(int i, int i2, int i3, int i4, long j) {
        try {
            if (!this.ad && this.aq * -1011691309 == 1) {
                aq(i2, i3, i4, -619216583);
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean au(int i, long j) {
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(int i, int i2, int i3) {
        if (!this.aj) {
            if (i == 0 || i == 1 || (!cl.cs && i == 4)) {
                ad(i2, i3, (byte) 76);
                this.aj = true;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(int i, int i2, int i3) {
        if (!this.aj) {
            if (i == 0 || i == 1 || (!cl.cs && i == 4)) {
                ad(i2, i3, (byte) 21);
                this.aj = true;
            }
        }
    }

    public boolean az(int i, long j) {
        try {
            cc.au(i, (byte) 54);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hb.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean bb(int i, long j) {
        if (36926812 == i) {
            this.ai = true;
        } else if (13 == i) {
            this.ae = true;
        } else if (i == 80) {
            this.am = true;
        } else if (85 == i) {
            ml.ax(-919946241);
        } else if (281591571 == i) {
            this.ak = true;
        } else if (-1829737418 == i) {
            this.as = true;
        }
        return true;
    }

    public boolean bc(int i, long j) {
        return true;
    }

    public boolean bd(int i, long j) {
        if (84 == i) {
            this.ai = true;
        } else if (13 == i) {
            this.ae = true;
        } else if (i == 80) {
            this.am = true;
        } else if (85 == i) {
            ml.ax(-470140697);
        } else if (96 == i) {
            this.ak = true;
        } else if (97 == i) {
            this.as = true;
        }
        return true;
    }

    public boolean be(int i, int i2, long j) {
        if (!this.aj) {
            ad(i, i2, (byte) 25);
        }
        return true;
    }

    public boolean bf(int i, long j) {
        if (84 == i) {
            this.ai = true;
        } else if (13 == i) {
            this.ae = true;
        } else if (i == 80) {
            this.am = true;
        } else if (85 == i) {
            ml.ax(-569541294);
        } else if (96 == i) {
            this.ak = true;
        } else if (97 == i) {
            this.as = true;
        }
        return true;
    }

    public boolean bg(int i, int i2, int i3, int i4, long j) {
        if (!this.ad) {
            this.aq = (i + 1) * -1054996645;
        } else if (i == 0) {
            aq(i2, i3, i4, -1022538776);
        }
        return true;
    }

    public boolean bh(int i, long j) {
        return true;
    }

    public boolean bi(int i, long j) {
        return true;
    }

    public boolean bj(int i, int i2, long j) {
        if (!this.aj) {
            ad(i, i2, (byte) 113);
        }
        return true;
    }

    public boolean bl(int i, long j) {
        if (84 == i) {
            this.ai = true;
        } else if (13 == i) {
            this.ae = true;
        } else if (i == 80) {
            this.am = true;
        } else if (85 == i) {
            ml.ax(-1449182878);
        } else if (96 == i) {
            this.ak = true;
        } else if (97 == i) {
            this.as = true;
        }
        return true;
    }

    public boolean bn(int i, long j) {
        return true;
    }

    public boolean bo(int i, long j) {
        if (84 == i) {
            this.ai = true;
        } else if (13 == i) {
            this.ae = true;
        } else if (i == 80) {
            this.am = true;
        } else if (85 == i) {
            ml.ax(-807604111);
        } else if (96 == i) {
            this.ak = true;
        } else if (97 == i) {
            this.as = true;
        }
        return true;
    }

    public boolean bp(int i, long j) {
        cc.au(i, (byte) 92);
        return true;
    }

    public boolean bq(int i, long j) {
        if (84 == i) {
            this.ai = true;
        } else if (13 == i) {
            this.ae = true;
        } else if (i == 80) {
            this.am = true;
        } else if (85 == i) {
            ml.ax(1093540719);
        } else if (96 == i) {
            this.ak = true;
        } else if (97 == i) {
            this.as = true;
        }
        return true;
    }

    public boolean br(int i, int i2, int i3, int i4, long j) {
        if (!this.ad && this.aq * 1542644011 == 1) {
            aq(i2, i3, i4, -108690916);
        }
        return true;
    }

    public boolean bt(int i, long j) {
        return true;
    }

    public boolean bu(int i, int i2, int i3, int i4, long j) {
        if (!this.ad) {
            this.aq = (i + 1) * -1054996645;
        } else if (i == 0) {
            aq(i2, i3, i4, 196420788);
        }
        return true;
    }

    public boolean bv(char c, long j) {
        ah.az(c, 1703432459);
        return true;
    }

    public boolean bw(int i, int i2, int i3, int i4, long j) {
        if (!this.ad && this.aq * 549196392 == 1) {
            aq(i2, i3, i4, -651614503);
        }
        return true;
    }

    public boolean bx(int i, int i2, int i3, int i4, long j) {
        if (!this.ad) {
            this.aq = (i + 1) * -1068041361;
        } else if (i == 0) {
            aq(i2, i3, i4, -1815867314);
        }
        return true;
    }

    public boolean by(int i, long j) {
        cc.au(i, (byte) 48);
        return true;
    }

    public boolean bz(int i, long j) {
        return true;
    }

    public boolean cj(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean cm(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean cq(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean cv(int i, long j) {
        cc.au(i, (byte) 61);
        return true;
    }
}
