package defpackage;

import android.support.v4.view.ViewCompat;

/* renamed from: bl */
public abstract class bl {
    public static final int[] aa = new int[2048];
    static final int[] ac = new int[2048];
    public static final int[] ao = new int[2048];
    static final int as = 14;
    static final int au = 512;
    static final int[] aw = new int[512];
    public static final int[] az = new int[65536];
    static kv db;
    int ab;
    int af;
    int ah;
    int an;
    boolean at;
    int av;
    int ay;
    boolean ba;
    int bb;
    int bc;
    int bd;
    int bf;
    int[] bg;
    int bi;
    boolean bk;
    int bl;
    int bm;
    int bo;
    int bq;
    boolean bs;
    int bv;

    bl() {
        int i = 1;
        try {
            this.ay = 0;
            this.an = 0;
            this.ab = 0;
            this.av = 0;
            this.at = false;
            this.bk = false;
            this.ba = false;
            this.bs = true;
            this.bm = 0;
            this.bq = -1693881856;
            this.bg = new int[1024];
            for (int i2 = 1; i2 < 512; i2++) {
                aw[i2] = 32768 / i2;
            }
            while (i < 2048) {
                ac[i] = 65536 / i;
                i++;
            }
            for (int i3 = 0; i3 < 2048; i3++) {
                double d = ((double) i3) * 0.0030679615d;
                aa[i3] = (int) (Math.sin(d) * 65536.0d);
                ao[i3] = (int) (Math.cos(d) * 65536.0d);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final boolean al(int i, int i2, int i3, gn gnVar, gs gsVar, int i4) {
        try {
            gv.ar[64][64] = 99;
            gv.al[64][64] = 0;
            gv.am[0] = i;
            gv.ak[0] = i2;
            int[][] iArr = gsVar.bc;
            int i5 = 1;
            int i6 = i2;
            int i7 = 0;
            int i8 = i;
            while (i7 != i5) {
                i8 = gv.am[i7];
                i6 = gv.ak[i7];
                int i9 = i8 - (i - 64);
                int i10 = i6 - (i2 - 64);
                int i11 = i8 - (gsVar.bl * -1403677009);
                int i12 = i6 - (gsVar.bf * -342516413);
                if (gnVar.ad(i3, i8, i6, gsVar, (byte) -18)) {
                    di.aj = 872498109 * i8;
                    gv.ai = 1542774803 * i6;
                    return true;
                }
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19 = gv.al[i9][i10] + 1;
                if (i9 > 0) {
                    i13 = i9 - 1;
                    if (gv.ar[i13][i10] != 0) {
                        i14 = i5;
                    } else {
                        i14 = i11 - 1;
                        if ((iArr[i14][i12] & 19136782) != 0) {
                            i14 = i5;
                        } else if ((iArr[i14][(i12 + i3) - 1] & 19136824) != 0) {
                            i14 = i5;
                        } else {
                            for (i15 = 1; i15 < i3 - 1; i15++) {
                                if ((iArr[i14][i12 + i15] & 19136830) != 0) {
                                    i14 = i5;
                                    break;
                                }
                            }
                            gv.am[i5] = i8 - 1;
                            gv.ak[i5] = i6;
                            i14 = (i5 + 1) & 4095;
                            gv.ar[i13][i10] = 2;
                            gv.al[i13][i10] = i19;
                        }
                    }
                } else {
                    i14 = i5;
                }
                i13 = 128 - i3;
                if (i9 < i13) {
                    i5 = i9 + 1;
                    if (gv.ar[i5][i10] == 0) {
                        i16 = i3 + i11;
                        if ((iArr[i16][i12] & 19136899) == 0 && (iArr[i16][(i12 + i3) - 1] & 19136992) == 0) {
                            for (i15 = 1; i15 < i3 - 1; i15++) {
                                if ((iArr[i16][i12 + i15] & 19136995) != 0) {
                                    break;
                                }
                            }
                            gv.am[i14] = i8 + 1;
                            gv.ak[i14] = i6;
                            i14 = (i14 + 1) & 4095;
                            gv.ar[i5][i10] = 8;
                            gv.al[i5][i10] = i19;
                        }
                    }
                }
                if (i10 > 0) {
                    i5 = i10 - 1;
                    if (gv.ar[i9][i5] == 0) {
                        i16 = i12 - 1;
                        if ((iArr[i11][i16] & 19136782) == 0 && (iArr[(i3 + i11) - 1][i16] & 19136899) == 0) {
                            for (i15 = 1; i15 < i3 - 1; i15++) {
                                if ((iArr[i15 + i11][i16] & 19136911) != 0) {
                                    break;
                                }
                            }
                            gv.am[i14] = i8;
                            gv.ak[i14] = i6 - 1;
                            i14 = (i14 + 1) & 4095;
                            gv.ar[i9][i5] = 1;
                            gv.al[i9][i5] = i19;
                        }
                    }
                }
                if (i10 < i13) {
                    i5 = i10 + 1;
                    if (gv.ar[i9][i5] == 0) {
                        i16 = i12 + i3;
                        if ((iArr[i11][i16] & 19136824) == 0 && (iArr[(i3 + i11) - 1][i16] & 19136992) == 0) {
                            for (i15 = 1; i15 < i3 - 1; i15++) {
                                if ((iArr[i11 + i15][i16] & 19137016) != 0) {
                                    break;
                                }
                            }
                            gv.am[i14] = i8;
                            gv.ak[i14] = i6 + 1;
                            i14 = (i14 + 1) & 4095;
                            gv.ar[i9][i5] = 4;
                            gv.al[i9][i5] = i19;
                        }
                    }
                }
                if (i9 > 0 && i10 > 0) {
                    i5 = i9 - 1;
                    i16 = i10 - 1;
                    if (gv.ar[i5][i16] == 0) {
                        i17 = i11 - 1;
                        i18 = i12 - 1;
                        if ((iArr[i17][i18] & 19136782) == 0) {
                            i15 = 1;
                            while (i15 < i3) {
                                if ((iArr[i17][i15 + i18] & 19136830) != 0 || (iArr[i15 + i17][i18] & 19136911) != 0) {
                                    break;
                                }
                                i15++;
                            }
                            gv.am[i14] = i8 - 1;
                            gv.ak[i14] = i6 - 1;
                            i14 = (i14 + 1) & 4095;
                            gv.ar[i5][i16] = 3;
                            gv.al[i5][i16] = i19;
                        }
                    }
                }
                if (i9 < i13 && i10 > 0) {
                    i5 = i9 + 1;
                    i16 = i10 - 1;
                    if (gv.ar[i5][i16] == 0) {
                        i17 = i3 + i11;
                        i18 = i12 - 1;
                        if ((iArr[i17][i18] & 19136899) == 0) {
                            i15 = 1;
                            while (i15 < i3) {
                                if ((iArr[i17][i18 + i15] & 19136995) != 0 || (iArr[i15 + i11][i18] & 19136911) != 0) {
                                    break;
                                }
                                i15++;
                            }
                            gv.am[i14] = i8 + 1;
                            gv.ak[i14] = i6 - 1;
                            i14 = (i14 + 1) & 4095;
                            gv.ar[i5][i16] = 9;
                            gv.al[i5][i16] = i19;
                        }
                    }
                }
                if (i9 <= 0 || i10 >= i13) {
                    i15 = i14;
                } else {
                    i5 = i9 - 1;
                    i16 = i10 + 1;
                    if (gv.ar[i5][i16] != 0) {
                        i15 = i14;
                    } else {
                        i17 = i11 - 1;
                        i18 = i12 + i3;
                        if ((iArr[i17][i18] & 19136824) != 0) {
                            i15 = i14;
                        } else {
                            i15 = 1;
                            while (i15 < i3) {
                                if ((iArr[i17][i15 + i12] & 19136830) != 0) {
                                    i15 = i14;
                                    break;
                                } else if ((iArr[i17 + i15][i18] & 19137016) != 0) {
                                    i15 = i14;
                                    break;
                                } else {
                                    i15++;
                                }
                            }
                            gv.am[i14] = i8 - 1;
                            gv.ak[i14] = i6 + 1;
                            i15 = (i14 + 1) & 4095;
                            gv.ar[i5][i16] = 6;
                            gv.al[i5][i16] = i19;
                        }
                    }
                }
                if (i9 < i13 && i10 < i13) {
                    i13 = i9 + 1;
                    i5 = i10 + 1;
                    if (gv.ar[i13][i5] == 0) {
                        i9 = i11 + i3;
                        i10 = i12 + i3;
                        if ((iArr[i9][i10] & 19136992) == 0) {
                            i14 = 1;
                            while (i14 < i3) {
                                if ((iArr[i11 + i14][i10] & 19137016) != 0 || (iArr[i9][i12 + i14] & 19136995) != 0) {
                                    break;
                                }
                                i14++;
                            }
                            gv.am[i15] = i8 + 1;
                            gv.ak[i15] = i6 + 1;
                            gv.ar[i13][i5] = 12;
                            gv.al[i13][i5] = i19;
                            i15 = (i15 + 1) & 4095;
                        }
                    }
                }
                i7 = (i7 + 1) & 4095;
                i5 = i15;
            }
            di.aj = 872498109 * i8;
            gv.ai = 1542774803 * i6;
            return false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final void bp(double d) {
        ep.bo(d, 0, 512, -261994739);
    }

    public static final void by(double d) {
        ep.bo(d, 0, 512, -337822580);
    }

    static final int cd(int i, int i2) {
        int i3 = 2;
        int i4 = ((-1155498298 & i) * i2) >> 7;
        if (i4 >= 2) {
            i3 = i4 > 1783815098 ? 1665070726 : i4;
        }
        return i3 + (65408 & i);
    }

    static final int cf(int i, int i2, int i3, int i4) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static final int cg(int i, int i2, int i3, int i4) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static final int ch(int i, int i2, int i3, int i4) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static final int cj(int i, double d) {
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (i & 255)) / 256.0d;
        return (((((int) (Math.pow(((double) ((i >> 16) & 255)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(d2, d) * 256.0d)) << 8)) + ((int) (Math.pow(d3, d) * 256.0d))) | (ViewCompat.MEASURED_STATE_MASK & i);
    }

    static final int cm(int i, double d) {
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (-1709635694 & i)) / 256.0d;
        return (((((int) (Math.pow(((double) ((i >> 16) & 255)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(d2, d) * 256.0d)) << 8)) + ((int) (Math.pow(d3, d) * 256.0d))) | (ViewCompat.MEASURED_STATE_MASK & i);
    }

    public static final void cn(bg bgVar) {
        il.ax = bgVar;
    }

    public static final void cq(bg bgVar) {
        il.ax = bgVar;
    }

    static final void cv(double d, int i, int i2) {
        double random = Math.random();
        int i3 = i * 128;
        while (i < i2) {
            int i4;
            double d2 = (((double) (i >> 3)) / 64.0d) + 0.0078125d;
            double d3 = (((double) (i & 7)) / 8.0d) + 0.0625d;
            int i5 = 0;
            while (true) {
                int i6 = i5;
                i4 = i3;
                if (i6 >= 128) {
                    break;
                }
                double d4;
                double d5;
                double d6;
                double d7 = ((double) i6) / 128.0d;
                if (d3 != 0.0d) {
                    d4 = d7 < 0.5d ? (1.0d + d3) * d7 : (d3 + d7) - (d7 * d3);
                    double d8 = (2.0d * d7) - d4;
                    d5 = 0.3333333333333333d + d2;
                    d7 = d5 > 1.0d ? d5 - 1.0d : d5;
                    d5 = d2 - 0.3333333333333333d;
                    d6 = d5 < 0.0d ? d5 + 1.0d : d5;
                    d5 = 6.0d * d7 < 1.0d ? (((d4 - d8) * 6.0d) * d7) + d8 : 2.0d * d7 < 1.0d ? d4 : 3.0d * d7 < 2.0d ? (((0.6666666666666666d - d7) * (d4 - d8)) * 6.0d) + d8 : d8;
                    d7 = 6.0d * d2 < 1.0d ? (((d4 - d8) * 6.0d) * d2) + d8 : 2.0d * d2 < 1.0d ? d4 : 3.0d * d2 < 2.0d ? (((d4 - d8) * (0.6666666666666666d - d2)) * 6.0d) + d8 : d8;
                    if (6.0d * d6 < 1.0d) {
                        d4 = (d6 * ((d4 - d8) * 6.0d)) + d8;
                        d6 = d7;
                    } else if (2.0d * d6 < 1.0d) {
                        d6 = d7;
                    } else if (3.0d * d6 < 2.0d) {
                        d4 = d8 + (((0.6666666666666666d - d6) * (d4 - d8)) * 6.0d);
                        d6 = d7;
                    } else {
                        d6 = d7;
                        d4 = d8;
                    }
                } else {
                    d5 = d7;
                    d6 = d7;
                    d4 = d7;
                }
                i5 = fo.bl(((((int) (d5 * 256.0d)) << 16) + (((int) (256.0d * d6)) << 8)) + ((int) (256.0d * d4)), ((0.03d * random) - 0.015d) + d);
                if (i5 == 0) {
                    i5 = 1;
                }
                az[i4] = i5;
                i5 = i6 + 1;
                i3 = i4 + 1;
            }
            i++;
            i3 = i4;
        }
    }

    static final int da(int i, int i2, int i3, int i4) {
        return ((i3 * i2) + (i4 * i)) >> 16;
    }

    static final int db(int i, int i2, int i3, int i4) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static final int dc(int i, int i2, int i3, int i4) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static final int dd(int i, int i2, int i3, int i4) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static final int de(int i, int i2, int i3, int i4) {
        return ((i2 * i3) - (i * i4)) >> 16;
    }

    static final int df(int i, int i2, int i3, int i4) {
        return ((i * i3) - (i4 * i2)) >> 16;
    }

    static final int dh(int i, int i2, int i3, int i4) {
        return ((i2 * i3) - (i * i4)) >> 16;
    }

    static final int di(int i, int i2, int i3, int i4) {
        return ((i * i3) - (i4 * i2)) >> 16;
    }

    static final int dl(int i, int i2, int i3, int i4) {
        return ((i * i3) - (i4 * i2)) >> 16;
    }

    static final int dm(int i, int i2, int i3, int i4) {
        return ((i2 * i3) - (i4 * i)) >> 16;
    }

    static final int dn(int i, int i2, int i3, int i4) {
        return ((i2 * i3) - (i * i4)) >> 16;
    }

    static final int dp(int i, int i2, int i3, int i4) {
        return ((i2 * i3) - (i * i4)) >> 16;
    }

    static final int dr(int i, int i2, int i3, int i4) {
        return ((i * i3) - (i4 * i2)) >> 16;
    }

    static final int dt(int i, int i2, int i3, int i4) {
        return ((i2 * i3) - (i4 * i)) >> 16;
    }

    static final int du(int i, int i2, int i3, int i4) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static final int dv(int i, int i2, int i3, int i4) {
        return ((i2 * i3) - (i4 * i)) >> 16;
    }

    static final void hw(String str, int i) {
        try {
            if (li.or != null) {
                ns aq = ib.aq(no.az, client.eb.aj, 15241314);
                aq.ar.al(hs.ag(str, (short) 7732), -1507080249);
                aq.ar.ap(str, 635769462);
                client.eb.ar(aq, 963108358);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.hw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aa(int i) {
        bb(i, (byte) 1);
    }

    public void ac(int i) {
        bb(i, (byte) 1);
    }

    public abstract void ad(byte b);

    public abstract void ag();

    public abstract void ap();

    /* Access modifiers changed, original: 0000 */
    public void aq(int i, int i2, int i3, int i4, int i5) {
        try {
            this.bl = (i3 - i) * -329731099;
            this.bf = (i4 - i2) * 2042796701;
            bx((byte) -84);
            if (this.bg.length < this.bf * 651738037) {
                this.bg = new int[la.ar(this.bf * 651738037, 763470048)];
            }
            int i6 = ((this.ah * 1956907281) * i2) + i;
            for (int i7 = 0; i7 < this.bf * 651738037; i7++) {
                this.bg[i7] = i6;
                i6 += this.ah * 1956907281;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(int i, short s) {
        try {
            bb(i, (byte) 1);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract void as();

    public abstract void au();

    /* Access modifiers changed, original: 0000 */
    public void aw(int i, int i2, int i3, int i4) {
        this.bl = (i3 - i) * -329731099;
        this.bf = (i4 - i2) * 2042796701;
        bx((byte) -26);
        if (this.bg.length < this.bf * -1750716071) {
            this.bg = new int[la.ar(this.bf * 651738037, 1174181792)];
        }
        int i5 = ((this.ah * -2136057438) * i2) + i;
        for (int i6 = 0; i6 < this.bf * -626588632; i6++) {
            this.bg[i6] = i5;
            i5 += this.ah * 1956907281;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(int i, int i2, int i3, int i4) {
        this.bl = (i3 - i) * -329731099;
        this.bf = (i4 - i2) * 2042796701;
        bx((byte) -83);
        if (this.bg.length < this.bf * 651738037) {
            this.bg = new int[la.ar(this.bf * 651738037, -1545413208)];
        }
        int i5 = ((this.ah * 1956907281) * i2) + i;
        for (int i6 = 0; i6 < this.bf * 651738037; i6++) {
            this.bg[i6] = i5;
            i5 += this.ah * 1956907281;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az(int i, int i2, int i3, int i4) {
        this.bl = (i3 - i) * -1300183254;
        this.bf = (i4 - i2) * 2042796701;
        bx((byte) 36);
        if (this.bg.length < this.bf * -1605269439) {
            this.bg = new int[la.ar(this.bf * 952660516, -123296375)];
        }
        int i5 = ((this.ah * -1372665859) * i2) + i;
        for (int i6 = 0; i6 < this.bf * -133773363; i6++) {
            this.bg[i6] = i5;
            i5 += this.ah * -1797024288;
        }
    }

    public final void bb(int i, byte b) {
        try {
            this.bq = 1775076533 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.bb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void bc(boolean z, int i) {
        try {
            this.bs = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.bc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void bg(int i) {
        try {
            aq(-1067412043 * this.ab, 1919039471 * this.ay, -671829675 * this.av, -319386649 * this.an, 699552804);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.bg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final int bi(int i) {
        try {
            return this.bq * 1516652957;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void bu(int i, int i2, int i3) {
        try {
            int i4 = this.bg[0];
            int i5 = i4 / (this.ah * 1956907281);
            this.bd = (i - (i4 - ((this.ah * 1956907281) * i5))) * 1607931217;
            this.bo = (i2 - i5) * -852622387;
            this.bb = -(this.bd * -525173889);
            this.bi = (this.bl * -184242821) - (this.bd * 1169062359);
            this.bc = -(this.bo * -281656585);
            this.bv = (this.bf * 615370321) - (this.bo * -1967975071);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.bu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void bv(int i, int i2, int i3, int i4, int i5) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            if (i3 > this.ah * 1956907281) {
                i3 = this.ah * 1956907281;
            }
            if (i4 > this.af * -2139243361) {
                i4 = this.af * -2139243361;
            }
            this.ab = -246320995 * i;
            this.ay = 403429135 * i2;
            this.av = -1816804355 * i3;
            this.an = 2094225367 * i4;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.bv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bw(int i, int i2, int i3, int i4) {
        boolean z;
        if (i >= 0) {
            try {
                if (i <= this.bl * 1505645037 && i2 >= 0 && i2 <= this.bl * 1505645037 && i3 >= 0 && i3 <= this.bl * 1505645037) {
                    z = false;
                    this.at = z;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bl.bw(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        z = true;
        this.at = z;
    }

    public final void bx(byte b) {
        try {
            this.bd = ((this.bl * 1505645037) / 2) * 1607931217;
            this.bo = ((this.bf * 651738037) / 2) * -852622387;
            this.bb = -(this.bd * -525173889);
            this.bi = (this.bl * -184242821) - (this.bd * 1169062359);
            this.bc = -(this.bo * -281656585);
            this.bv = (this.bf * 615370321) - (this.bo * -1967975071);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bl.bx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ca() {
        aq(-1067412043 * this.ab, 1919039471 * this.ay, -671829675 * this.av, -319386649 * this.an, -438175272);
    }

    public final void cb(boolean z) {
        this.bs = z;
    }

    public final void cc(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.ah * 1956907281) {
            i3 = this.ah * 1956907281;
        }
        if (i4 > this.af * -2139243361) {
            i4 = this.af * -2139243361;
        }
        this.ab = -246320995 * i;
        this.ay = 403429135 * i2;
        this.av = -1816804355 * i3;
        this.an = 2094225367 * i4;
    }

    public final void ce(boolean z) {
        this.bs = z;
    }

    public final void ci(boolean z) {
        this.bs = z;
    }

    public final void ck() {
        this.bd = ((this.bl * 1067457615) / 2) * 1607931217;
        this.bo = ((this.bf * 1246411656) / 2) * -852622387;
        this.bb = -(this.bd * -2107828303);
        this.bi = (this.bl * -184242821) - (this.bd * 1169062359);
        this.bc = -(this.bo * -281656585);
        this.bv = (this.bf * 615370321) - (this.bo * -1408348421);
    }

    public void cl(int i, int i2, int i3) {
        boolean z = i < 0 || i > this.bl * 1505645037 || i2 < 0 || i2 > this.bl * 1505645037 || i3 < 0 || i3 > this.bl * 1505645037;
        this.at = z;
    }

    public final void co() {
        this.bd = ((this.bl * 1505645037) / 2) * 1607931217;
        this.bo = ((this.bf * 651738037) / 2) * -852622387;
        this.bb = -(this.bd * -525173889);
        this.bi = (this.bl * -184242821) - (this.bd * 1169062359);
        this.bc = -(this.bo * -281656585);
        this.bv = (this.bf * 615370321) - (this.bo * -1967975071);
    }

    public final void cp(boolean z) {
        this.bs = z;
    }

    public final void cr() {
        aq(-1067412043 * this.ab, 1919039471 * this.ay, -671829675 * this.av, 1529451997 * this.an, 1722630856);
    }

    public final void cs(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.ah * 1956907281) {
            i3 = this.ah * 1956907281;
        }
        if (i4 > this.af * -2139243361) {
            i4 = this.af * -2139243361;
        }
        this.ab = -246320995 * i;
        this.ay = -854577255 * i2;
        this.av = 939063793 * i3;
        this.an = 2094225367 * i4;
    }

    public final void ct() {
        this.bd = ((this.bl * 1505645037) / 2) * 1607931217;
        this.bo = ((this.bf * 651738037) / 2) * -852622387;
        this.bb = -(this.bd * -525173889);
        this.bi = (this.bl * -184242821) - (this.bd * 1169062359);
        this.bc = -(this.bo * -281656585);
        this.bv = (this.bf * 615370321) - (this.bo * -1967975071);
    }

    public void cu(int i, int i2, int i3) {
        boolean z = i < 0 || i > this.bl * 1505645037 || i2 < 0 || i2 > this.bl * 1505645037 || i3 < 0 || i3 > this.bl * 1505645037;
        this.at = z;
    }

    public final int cw() {
        return this.bq * 1516652957;
    }

    public final void cx() {
        aq(-1067412043 * this.ab, 1919039471 * this.ay, -671829675 * this.av, -319386649 * this.an, -1528327513);
    }

    public final void cy(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.ah * 1956907281) {
            i3 = this.ah * 1956907281;
        }
        if (i4 > this.af * -2139243361) {
            i4 = this.af * -2139243361;
        }
        this.ab = -246320995 * i;
        this.ay = 403429135 * i2;
        this.av = -1816804355 * i3;
        this.an = 2094225367 * i4;
    }

    public void cz(int i, int i2, int i3) {
        boolean z = i < 0 || i > this.bl * 1505645037 || i2 < 0 || i2 > this.bl * 1290527246 || i3 < 0 || i3 > this.bl * 1713080311;
        this.at = z;
    }
}
