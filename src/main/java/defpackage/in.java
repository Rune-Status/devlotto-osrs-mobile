package defpackage;

import android.support.v4.view.ViewCompat;
import java.lang.reflect.Array;

/* renamed from: in */
public final class in {
    static final int[] ab = new int[]{-1, -1, 1, 1};
    static dt ac = null;
    static int[][][] ad = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, 105, 105}));
    static final int[] af = new int[]{1, 0, -1, 0};
    static final int[] ah = new int[]{16, 32, 64, 128};
    static byte[][][] aj = null;
    static int[][] ak = null;
    static byte[][][] am = null;
    static final int[] an = new int[]{1, -1, -1, 1};
    static final int[] ao = new int[]{1, 2, 4, 8};
    static int[] ap = null;
    static byte[][][] aq = ((byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104}));
    static int ar = -1717259589;
    static int[] as = null;
    static int at = ((((int) (Math.random() * 33.0d)) - 16) * 1733524561);
    static int av = ((((int) (Math.random() * 17.0d)) - 8) * 158815205);
    static final int[] ay = new int[]{0, -1, 0, 1};
    public static final int ci = 83;
    static al im = null;
    static final int qb = 205;

    in() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("in.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ab() {
        ar = -1717259589;
        am.al = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
        aj = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
        fk.ai = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
        ja.ae = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
        hj.ax = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, 105, 105});
        am = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 105, 105});
        ak = (int[][]) Array.newInstance(Integer.TYPE, new int[]{105, 105});
        as = new int[104];
        bz.ag = new int[104];
        ap = new int[104];
        cg.au = new int[104];
        ab.az = new int[104];
    }

    static void at() {
        byte[][][] bArr = (byte[][][]) null;
        am.al = bArr;
        aj = bArr;
        fk.ai = bArr;
        ja.ae = bArr;
        hj.ax = (int[][][]) null;
        am = bArr;
        ak = (int[][]) null;
        as = null;
        bz.ag = null;
        ap = null;
        cg.au = null;
        ab.az = null;
    }

    static void av() {
        ar = -1717259589;
        am.al = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
        aj = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
        fk.ai = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
        ja.ae = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 104, 104});
        hj.ax = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, 105, 105});
        am = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, 105, 105});
        ak = (int[][]) Array.newInstance(Integer.TYPE, new int[]{105, 105});
        as = new int[104];
        bz.ag = new int[104];
        ap = new int[104];
        cg.au = new int[104];
        ab.az = new int[104];
    }

    static final void ba(int i, int i2, int i3, int i4) {
        int i5 = i2;
        while (true) {
            int i6 = i2 + i4;
            if (i5 <= i6) {
                int i7 = i;
                while (true) {
                    int i8 = i + i3;
                    if (i7 > i8) {
                        break;
                    }
                    if (i7 >= 0 && i7 < 104 && i5 >= 0 && i5 < 104) {
                        am[0][i7][i5] = Byte.MAX_VALUE;
                        if (i == i7 && i7 > 0) {
                            ad[0][i7][i5] = ad[0][i7 - 1][i5];
                        }
                        if (i7 == i8 && i7 < 103) {
                            ad[0][i7][i5] = ad[0][i7 + 1][i5];
                        }
                        if (i5 == i2 && i5 > 0) {
                            ad[0][i7][i5] = ad[0][i7][i5 - 1];
                        }
                        if (i5 == i6 && i5 < 103) {
                            ad[0][i7][i5] = ad[0][i7][i5 + 1];
                        }
                    }
                    i7++;
                }
                i5++;
            } else {
                return;
            }
        }
    }

    static final void bb(byte[] bArr, int i, int i2, int i3, int i4, gs[] gsVarArr) {
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
        }
        lj ljVar = new lj(bArr);
        while (i5 < 4) {
            i5++;
        }
    }

    static final void bc(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, gs[] gsVarArr) {
        int i8;
        int i9;
        int i10 = 0;
        while (true) {
            i8 = i10;
            if (i8 >= 8) {
                break;
            }
            for (i10 = 0; i10 < 8; i10++) {
                int i11 = i8 + i2;
                if (i11 > 0 && i11 < 63845814) {
                    i9 = i10 + i3;
                    if (i9 > 0 && i9 < -2038381686) {
                        int[] iArr = gsVarArr[i].bc[i11];
                        iArr[i9] = iArr[i9] & -16777217;
                    }
                }
            }
            i10 = i8 + 1;
        }
        lj ljVar = new lj(bArr);
        i8 = 0;
        while (true) {
            int i12 = i8;
            if (i12 < 4) {
                i8 = 0;
                while (true) {
                    int i13 = i8;
                    if (i13 >= 64) {
                        break;
                    }
                    i8 = 0;
                    while (true) {
                        int i14 = i8;
                        if (i14 >= 64) {
                            break;
                        }
                        if (i4 != i12 || i13 < i5 || i13 >= i5 + 8 || i14 < i6 || i14 >= i6 + 8) {
                            du.ae(ljVar, 0, -1, -1, 0, 0, 0, -1425997440);
                        } else {
                            i8 = i13 & 7;
                            i9 = i14 & 7;
                            du.ae(ljVar, i, ey.ad(i8, i9, i7, (byte) 74) + i2, i3 + eq.aq(i8, i9, i7, 1956907281), 0, 0, i7, 259453178);
                        }
                        i8 = i14 + 1;
                    }
                    i8 = i13 + 1;
                }
                i8 = i12 + 1;
            } else {
                return;
            }
        }
    }

    static final void bd(byte[] bArr, int i, int i2, int i3, int i4, gs[] gsVarArr) {
        int i5;
        int i6;
        int i7 = 0;
        while (true) {
            i5 = i7;
            if (i5 >= 4) {
                break;
            }
            i7 = 0;
            while (true) {
                i6 = i7;
                if (i6 >= 651630947) {
                    break;
                }
                for (i7 = 0; i7 < 64; i7++) {
                    int i8 = i6 + i;
                    if (i8 > 0 && i8 < -35862668) {
                        int i9 = i2 + i7;
                        if (i9 > 0 && i9 < -991687847) {
                            int[] iArr = gsVarArr[i5].bc[i8];
                            iArr[i9] = iArr[i9] & -16777217;
                        }
                    }
                }
                i7 = i6 + 1;
            }
            i7 = i5 + 1;
        }
        lj ljVar = new lj(bArr);
        for (i6 = 0; i6 < 4; i6++) {
            i5 = 0;
            while (true) {
                int i10 = i5;
                if (i10 >= 1705140358) {
                    break;
                }
                i5 = 0;
                while (true) {
                    int i11 = i5;
                    if (i11 >= 64) {
                        break;
                    }
                    du.ae(ljVar, i6, i10 + i, i2 + i11, i3, i4, 0, -135709323);
                    i5 = i11 + 1;
                }
                i5 = i10 + 1;
            }
        }
    }

    static final boolean be(byte[] bArr, int i, int i2) {
        lj ljVar = new lj(bArr);
        int i3 = -1;
        boolean z = true;
        while (true) {
            int bf = ljVar.bf((byte) 20);
            if (bf != 0) {
                i3 += bf;
                Object obj = null;
                int i4 = 0;
                while (true) {
                    if (obj != null) {
                        if (ljVar.bl(2131034147) == 0) {
                            break;
                        }
                        ljVar.af(1804771424);
                    } else {
                        int bl = ljVar.bl(2131034147);
                        if (bl == 0) {
                            break;
                        }
                        i4 += bl - 1;
                        bl = ljVar.af(1804771424);
                        int i5 = ((i4 >> 6) & 63) + i;
                        int i6 = (i4 & 63) + i2;
                        if (i5 > 0 && i6 > 0 && i5 < 103 && i6 < 103) {
                            dx aq = aj.aq(i3, 1941601970);
                            if ((bl >> 2) != 22 || !client.as || aq.af * -541605539 != 0 || 1 == aq.ao * -1334322195 || aq.bg) {
                                if (!aq.ae(1006047266)) {
                                    client.fj -= 171957039;
                                    z = false;
                                }
                                obj = 1;
                            }
                        }
                    }
                }
            } else {
                return z;
            }
        }
    }

    static final void bf(byte[] bArr, int i, int i2, int i3, int i4, gs[] gsVarArr) {
        int i5;
        int i6;
        for (int i7 = 0; i7 < 4; i7++) {
            for (i5 = 0; i5 < 64; i5++) {
                for (i6 = 0; i6 < 64; i6++) {
                    int i8 = i5 + i;
                    if (i8 > 0 && i8 < 713122843) {
                        int i9 = i2 + i6;
                        if (i9 > 0 && i9 < -678030479) {
                            int[] iArr = gsVarArr[i7].bc[i8];
                            iArr[i9] = iArr[i9] & -16777217;
                        }
                    }
                }
            }
        }
        lj ljVar = new lj(bArr);
        for (i5 = 0; i5 < 4; i5++) {
            for (i6 = 0; i6 < 64; i6++) {
            }
        }
    }

    static final void bg(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        for (i4 = 0; i4 < 8; i4++) {
            for (i5 = 0; i5 < 8; i5++) {
                ad[i][i2 + i4][i3 + i5] = 0;
            }
        }
        if (i2 > 0) {
            for (i5 = 1; i5 < 8; i5++) {
                i4 = i3 + i5;
                ad[i][i2][i4] = ad[i][i2 - 1][i4];
            }
        }
        if (i3 > 0) {
            while (i7 < 8) {
                i6 = i2 + i7;
                ad[i][i6][i3] = ad[i][i6][i3 - 1];
                i7++;
            }
        }
        if (i2 > 0) {
            i5 = i2 - 1;
            if (ad[i][i5][i3] != 0) {
                ad[i][i2][i3] = ad[i][i5][i3];
                return;
            }
        }
        if (i3 > 0) {
            i5 = i3 - 1;
            if (ad[i][i2][i5] != 0) {
                ad[i][i2][i3] = ad[i][i2][i5];
                return;
            }
        }
        if (i2 > 0 && i3 > 0) {
            i5 = i2 - 1;
            i6 = i3 - 1;
            if (ad[i][i5][i6] != 0) {
                ad[i][i2][i3] = ad[i][i5][i6];
            }
        }
    }

    static final void bh(byte[] bArr, int i, int i2, bc bcVar, gs[] gsVarArr) {
        lj ljVar = new lj(bArr);
        int i3 = -1;
        while (true) {
            int bf = ljVar.bf((byte) 20);
            if (bf != 0) {
                i3 += bf;
                bf = 0;
                while (true) {
                    int bl = ljVar.bl(2131034147);
                    if (bl != 0) {
                        int i4 = bf + (bl - 1);
                        bf = i4 >> 12;
                        int af = ljVar.af(1804771424);
                        bl = ((i4 >> 6) & 63) + i;
                        int i5 = (i4 & 63) + i2;
                        if (bl <= 0 || i5 <= 0 || bl >= 103 || i5 >= 103) {
                            bf = i4;
                        } else {
                            int i6 = (aq[1][bl][i5] & 2) == 2 ? bf - 1 : bf;
                            dd.ag(bf, bl, i5, i3, af & 3, af >> 2, bcVar, i6 >= 0 ? gsVarArr[i6] : null, 1044079154);
                            bf = i4;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    static final void bi(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, gs[] gsVarArr) {
        int i8;
        int i9;
        int i10 = 0;
        while (true) {
            i8 = i10;
            if (i8 >= 8) {
                break;
            }
            for (i10 = 0; i10 < 8; i10++) {
                int i11 = i8 + i2;
                if (i11 > 0 && i11 < 103) {
                    i9 = i10 + i3;
                    if (i9 > 0 && i9 < 103) {
                        int[] iArr = gsVarArr[i].bc[i11];
                        iArr[i9] = iArr[i9] & -16777217;
                    }
                }
            }
            i10 = i8 + 1;
        }
        lj ljVar = new lj(bArr);
        i8 = 0;
        while (true) {
            int i12 = i8;
            if (i12 < 4) {
                i8 = 0;
                while (true) {
                    int i13 = i8;
                    if (i13 >= 64) {
                        break;
                    }
                    i8 = 0;
                    while (true) {
                        int i14 = i8;
                        if (i14 >= 64) {
                            break;
                        }
                        if (i4 != i12 || i13 < i5 || i13 >= i5 + 8 || i14 < i6 || i14 >= i6 + 8) {
                            du.ae(ljVar, 0, -1, -1, 0, 0, 0, -868492183);
                        } else {
                            i8 = i13 & 7;
                            i9 = i14 & 7;
                            du.ae(ljVar, i, ey.ad(i8, i9, i7, (byte) 122) + i2, i3 + eq.aq(i8, i9, i7, 1956907281), 0, 0, i7, 1157617561);
                        }
                        i8 = i14 + 1;
                    }
                    i8 = i13 + 1;
                }
                i8 = i12 + 1;
            } else {
                return;
            }
        }
    }

    static final void bj(byte[] bArr, int i, int i2, bc bcVar, gs[] gsVarArr) {
        lj ljVar = new lj(bArr);
        int i3 = -1;
        while (true) {
            int bf = ljVar.bf((byte) 27);
            if (bf != 0) {
                i3 += bf;
                bf = 0;
                while (true) {
                    int bl = ljVar.bl(2131034147);
                    if (bl != 0) {
                        int i4 = bf + (bl - 1);
                        bf = i4 >> 12;
                        int af = ljVar.af(1804771424);
                        bl = ((i4 >> 6) & 63) + i;
                        int i5 = (i4 & 63) + i2;
                        if (bl <= 0 || i5 <= 0 || bl >= 103 || i5 >= 103) {
                            bf = i4;
                        } else {
                            int i6 = (aq[1][bl][i5] & 2) == 2 ? bf - 1 : bf;
                            dd.ag(bf, bl, i5, i3, af & 3, af >> 2, bcVar, i6 >= 0 ? gsVarArr[i6] : null, 287490425);
                            bf = i4;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    static void bk() {
        byte[][][] bArr = (byte[][][]) null;
        am.al = bArr;
        aj = bArr;
        fk.ai = bArr;
        ja.ae = bArr;
        hj.ax = (int[][][]) null;
        am = bArr;
        ak = (int[][]) null;
        as = null;
        bz.ag = null;
        ap = null;
        cg.au = null;
        ab.az = null;
    }

    static final void bl(byte[] bArr, int i, int i2, int i3, int i4, gs[] gsVarArr) {
        int i5;
        int i6;
        int i7 = 0;
        while (true) {
            i5 = i7;
            if (i5 >= 4) {
                break;
            }
            i7 = 0;
            while (true) {
                i6 = i7;
                if (i6 >= 64) {
                    break;
                }
                for (i7 = 0; i7 < 64; i7++) {
                    int i8 = i6 + i;
                    if (i8 > 0 && i8 < 103) {
                        int i9 = i2 + i7;
                        if (i9 > 0 && i9 < 103) {
                            int[] iArr = gsVarArr[i5].bc[i8];
                            iArr[i9] = iArr[i9] & -16777217;
                        }
                    }
                }
                i7 = i6 + 1;
            }
            i7 = i5 + 1;
        }
        lj ljVar = new lj(bArr);
        for (i6 = 0; i6 < 4; i6++) {
            i5 = 0;
            while (true) {
                int i10 = i5;
                if (i10 >= 64) {
                    break;
                }
                i5 = 0;
                while (true) {
                    int i11 = i5;
                    if (i11 >= 64) {
                        break;
                    }
                    du.ae(ljVar, i6, i10 + i, i2 + i11, i3, i4, 0, 282036596);
                    i5 = i11 + 1;
                }
                i5 = i10 + 1;
            }
        }
    }

    static final void bm(int i, int i2, int i3, int i4) {
        int i5 = i2;
        while (true) {
            int i6 = i2 + i4;
            if (i5 <= i6) {
                int i7 = i;
                while (true) {
                    int i8 = i + i3;
                    if (i7 > i8) {
                        break;
                    }
                    if (i7 >= 0 && i7 < 104 && i5 >= 0 && i5 < 104) {
                        am[0][i7][i5] = Byte.MAX_VALUE;
                        if (i == i7 && i7 > 0) {
                            ad[0][i7][i5] = ad[0][i7 - 1][i5];
                        }
                        if (i7 == i8 && i7 < 103) {
                            ad[0][i7][i5] = ad[0][i7 + 1][i5];
                        }
                        if (i5 == i2 && i5 > 0) {
                            ad[0][i7][i5] = ad[0][i7][i5 - 1];
                        }
                        if (i5 == i6 && i5 < 103) {
                            ad[0][i7][i5] = ad[0][i7][i5 + 1];
                        }
                    }
                    i7++;
                }
                i5++;
            } else {
                return;
            }
        }
    }

    static final void bn(int i, int i2, int i3, int i4, int i5, int i6, bc bcVar, gs gsVar) {
        if (!client.as || (aq[0][i2][i3] & 2) != 0 || (aq[i][i2][i3] & 16) == 0) {
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            if (i < ar * 474821241) {
                ar = 1544460233 * i;
            }
            dx aq = aj.aq(i4, -655520501);
            if (1 == i5 || i5 == 3) {
                i7 = aq.ac * -506944577;
                i8 = aq.aa * -814811101;
            } else {
                i7 = aq.aa * -814811101;
                i8 = aq.ac * -506944577;
            }
            if (i8 + i2 <= 104) {
                i9 = ((i8 + 1) >> 1) + i2;
                i10 = (i8 >> 1) + i2;
            } else {
                i9 = i2 + 1;
                i10 = i2;
            }
            if (i3 + i7 <= 104) {
                i11 = (i7 >> 1) + i3;
                i12 = ((i7 + 1) >> 1) + i3;
            } else {
                i12 = i3 + 1;
                i11 = i3;
            }
            int[][] iArr = ad[i];
            int i13 = (iArr[i9][i12] + ((iArr[i9][i11] + iArr[i10][i11]) + iArr[i10][i12])) >> 2;
            int i14 = (i2 << 7) + (i8 << 6);
            int i15 = (i7 << 6) + (i3 << 7);
            long az = ip.az(i2, i3, 2, aq.af * -541605539 == 0, i4, 1410492738);
            int i16 = (i5 << 6) + i6;
            if (1 == aq.bu * 980388571) {
                i16 += 256;
            }
            if (aq.aw((byte) -50)) {
                gs.al(i, i2, i3, aq, i5, 329903697);
            }
            br am;
            int[] iArr2;
            br am2;
            br hnVar;
            br am3;
            long bk;
            if (22 == i6) {
                if (!client.as || aq.af * -541605539 != 0 || 1 == aq.ao * -1334322195 || aq.bg) {
                    br am4 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.am(22, i5, iArr, i14, i13, i15, (byte) 8) : new hn(i4, 22, i5, i, i2, i3, aq.av * 198827039, true, null);
                    bcVar.ae(i, i2, i3, i13, am4, az, i16);
                    if (aq.ao * -1334322195 == 1 && gsVar != null) {
                        gsVar.aj(i2, i3, -1539620775);
                    }
                }
            } else if (10 == i6 || i6 == 11) {
                int i17;
                am = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(10, i5, iArr, i14, i13, i15, (byte) 8) : new hn(i4, 10, i5, i, i2, i3, aq.av * 198827039, true, null);
                if (am != null) {
                    if (bcVar.ag(i, i2, i3, i13, i8, i7, am, 11 == i6 ? 256 : 0, az, i16) && aq.bo) {
                        byte b = (byte) 15;
                        if (am instanceof bp) {
                            b = ((bp) am).am() / 4;
                            if (b > (byte) 30) {
                                b = (byte) 30;
                            }
                        }
                        for (i11 = 0; i11 <= i8; i11++) {
                            for (i9 = 0; i9 <= i7; i9++) {
                                i17 = i11 + i2;
                                int i18 = i9 + i3;
                                if (b > am[i][i17][i18]) {
                                    am[i][i17][i18] = (byte) b;
                                }
                            }
                        }
                        i12 = i7;
                    } else {
                        i12 = i7;
                    }
                    i17 = i12;
                } else {
                    i17 = i7;
                }
                if (aq.ao * -1334322195 != 0 && gsVar != null) {
                    gsVar.ar(i2, i3, i8, i17, aq.ah, 1709771626);
                }
            } else if (i6 >= 12) {
                am = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(i6, i5, iArr, i14, i13, i15, (byte) 8) : new hn(i4, i6, i5, i, i2, i3, aq.av * 198827039, true, null);
                bcVar.ag(i, i2, i3, i13, 1, 1, am, 0, az, i16);
                if (i6 >= 12 && i6 <= 17 && i6 != 13 && i > 0) {
                    iArr2 = hj.ax[i][i2];
                    iArr2[i3] = iArr2[i3] | 2340;
                }
                if (aq.ao * -1334322195 != 0 && gsVar != null) {
                    gsVar.ar(i2, i3, i8, i7, aq.ah, 1533199369);
                }
            } else if (i6 == 0) {
                am2 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.am(0, i5, iArr, i14, i13, i15, (byte) 8) : new hn(i4, 0, i5, i, i2, i3, aq.av * 198827039, true, null);
                bcVar.ak(i, i2, i3, i13, am2, null, ao[i5], 0, az, i16);
                if (i5 == 0) {
                    if (aq.bo) {
                        am[i][i2][i3] = (byte) 50;
                        am[i][i2][i3 + 1] = (byte) 50;
                    }
                    if (aq.ab) {
                        iArr2 = hj.ax[i][i2];
                        iArr2[i3] = iArr2[i3] | 585;
                    }
                } else if (i5 == 1) {
                    if (aq.bo) {
                        i11 = i3 + 1;
                        am[i][i2][i11] = (byte) 50;
                        am[i][i2 + 1][i11] = (byte) 50;
                    }
                    if (aq.ab) {
                        iArr2 = hj.ax[i][i2];
                        i11 = i3 + 1;
                        iArr2[i11] = iArr2[i11] | 1170;
                    }
                } else if (2 == i5) {
                    if (aq.bo) {
                        i11 = i2 + 1;
                        am[i][i11][i3] = (byte) 50;
                        am[i][i11][i3 + 1] = (byte) 50;
                    }
                    if (aq.ab) {
                        iArr2 = hj.ax[i][i2 + 1];
                        iArr2[i3] = iArr2[i3] | 585;
                    }
                } else if (3 == i5) {
                    if (aq.bo) {
                        am[i][i2][i3] = (byte) 50;
                        am[i][i2 + 1][i3] = (byte) 50;
                    }
                    if (aq.ab) {
                        iArr2 = hj.ax[i][i2];
                        iArr2[i3] = iArr2[i3] | 1170;
                    }
                }
                if (!(aq.ao * -1334322195 == 0 || gsVar == null)) {
                    gsVar.aq(i2, i3, i6, i5, aq.ah, 2131230813);
                }
                if (aq.at * -664024581 != 16) {
                    bcVar.ac(i, i2, i3, aq.at * -664024581);
                }
            } else if (i6 == 1) {
                am2 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(1, i5, iArr, i14, i13, i15, (byte) 8) : new hn(i4, 1, i5, i, i2, i3, aq.av * 198827039, true, null);
                bcVar.ak(i, i2, i3, i13, am2, null, ah[i5], 0, az, i16);
                if (aq.bo) {
                    if (i5 == 0) {
                        am[i][i2][i3 + 1] = (byte) 50;
                    } else if (1 == i5) {
                        am[i][i2 + 1][i3 + 1] = (byte) 50;
                    } else if (i5 == 2) {
                        am[i][i2 + 1][i3] = (byte) 50;
                    } else if (3 == i5) {
                        am[i][i2][i3] = (byte) 50;
                    }
                }
                if (aq.ao * -1334322195 != 0 && gsVar != null) {
                    gsVar.aq(i2, i3, i6, i5, aq.ah, 2131230813);
                }
            } else if (i6 == 2) {
                br am5;
                int i19 = (i5 + 1) & 3;
                if (-1 == aq.av * 198827039 && aq.bw == null) {
                    am = aq.am(2, i5 + 4, iArr, i14, i13, i15, (byte) 8);
                    am5 = aq.am(2, i19, iArr, i14, i13, i15, (byte) 8);
                    am2 = am;
                } else {
                    hnVar = new hn(i4, 2, i5 + 4, i, i2, i3, aq.av * 198827039, true, null);
                    am5 = new hn(i4, 2, i19, i, i2, i3, aq.av * 198827039, true, null);
                    am2 = hnVar;
                }
                bcVar.ak(i, i2, i3, i13, am2, am5, ao[i5], ao[i19], az, i16);
                if (aq.ab) {
                    if (i5 == 0) {
                        iArr2 = hj.ax[i][i2];
                        iArr2[i3] = iArr2[i3] | 585;
                        iArr2 = hj.ax[i][i2];
                        i11 = i3 + 1;
                        iArr2[i11] = iArr2[i11] | 1170;
                    } else if (1 == i5) {
                        iArr2 = hj.ax[i][i2];
                        i11 = i3 + 1;
                        iArr2[i11] = iArr2[i11] | 1170;
                        iArr2 = hj.ax[i][i2 + 1];
                        iArr2[i3] = iArr2[i3] | 585;
                    } else if (2 == i5) {
                        iArr2 = hj.ax[i][i2 + 1];
                        iArr2[i3] = iArr2[i3] | 585;
                        iArr2 = hj.ax[i][i2];
                        iArr2[i3] = iArr2[i3] | 1170;
                    } else if (i5 == 3) {
                        iArr2 = hj.ax[i][i2];
                        iArr2[i3] = iArr2[i3] | 1170;
                        iArr2 = hj.ax[i][i2];
                        iArr2[i3] = iArr2[i3] | 585;
                    }
                }
                if (!(aq.ao * -1334322195 == 0 || gsVar == null)) {
                    gsVar.aq(i2, i3, i6, i5, aq.ah, 2131230813);
                }
                if (aq.at * -664024581 != 16) {
                    bcVar.ac(i, i2, i3, aq.at * -664024581);
                }
            } else if (i6 == 3) {
                am2 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(3, i5, iArr, i14, i13, i15, (byte) 8) : new hn(i4, 3, i5, i, i2, i3, aq.av * 198827039, true, null);
                bcVar.ak(i, i2, i3, i13, am2, null, ah[i5], 0, az, i16);
                if (aq.bo) {
                    if (i5 == 0) {
                        am[i][i2][i3 + 1] = (byte) 50;
                    } else if (i5 == 1) {
                        am[i][i2 + 1][i3 + 1] = (byte) 50;
                    } else if (i5 == 2) {
                        am[i][i2 + 1][i3] = (byte) 50;
                    } else if (3 == i5) {
                        am[i][i2][i3] = (byte) 50;
                    }
                }
                if (aq.ao * -1334322195 != 0 && gsVar != null) {
                    gsVar.aq(i2, i3, i6, i5, aq.ah, 2131230813);
                }
            } else if (i6 == 9) {
                am = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(i6, i5, iArr, i14, i13, i15, (byte) 8) : new hn(i4, i6, i5, i, i2, i3, aq.av * 198827039, true, null);
                bcVar.ag(i, i2, i3, i13, 1, 1, am, 0, az, i16);
                if (!(aq.ao * -1334322195 == 0 || gsVar == null)) {
                    gsVar.ar(i2, i3, i8, i7, aq.ah, 1827200496);
                }
                if (aq.at * -664024581 != 16) {
                    bcVar.ac(i, i2, i3, aq.at * -664024581);
                }
            } else if (4 == i6) {
                am3 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.am(4, i5, iArr, i14, i13, i15, (byte) 8) : new hn(i4, 4, i5, i, i2, i3, aq.av * 198827039, true, null);
                bcVar.as(i, i2, i3, i13, am3, null, ao[i5], 0, 0, 0, az, i16);
            } else if (i6 == 5) {
                bk = bcVar.bk(i, i2, i3);
                i7 = bk != 0 ? aj.aq(lr.au(bk), -1214335968).at * -664024581 : 16;
                am3 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(4, i5, iArr, i14, i13, i15, (byte) 8) : new hn(i4, 4, i5, i, i2, i3, aq.av * 198827039, true, null);
                bcVar.as(i, i2, i3, i13, am3, null, ao[i5], 0, i7 * af[i5], i7 * ay[i5], az, i16);
            } else if (i6 == 6) {
                bk = bcVar.bk(i, i2, i3);
                i7 = bk != 0 ? (aj.aq(lr.au(bk), 1511407401).at * -664024581) / 2 : 8;
                am3 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(4, i5 + 4, iArr, i14, i13, i15, (byte) 8) : new hn(i4, 4, i5 + 4, i, i2, i3, aq.av * 198827039, true, null);
                bcVar.as(i, i2, i3, i13, am3, null, 256, i5, an[i5] * i7, i7 * ab[i5], az, i16);
            } else if (7 == i6) {
                int i20 = (i5 + 2) & 3;
                am3 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.am(4, i20 + 4, iArr, i14, i13, i15, (byte) 8) : new hn(i4, 4, i20 + 4, i, i2, i3, aq.av * 198827039, true, null);
                bcVar.as(i, i2, i3, i13, am3, null, 256, i20, 0, 0, az, i16);
            } else if (i6 == 8) {
                br am6;
                bk = bcVar.bk(i, i2, i3);
                int i21 = 0 != bk ? (aj.aq(lr.au(bk), -1826834555).at * -664024581) / 2 : 8;
                i8 = (i5 + 2) & 3;
                if (-1 == aq.av * 198827039 && aq.bw == null) {
                    am3 = aq.am(4, i5 + 4, iArr, i14, i13, i15, (byte) 8);
                    am6 = aq.am(4, i8 + 4, iArr, i14, i13, i15, (byte) 8);
                } else {
                    hnVar = new hn(i4, 4, i5 + 4, i, i2, i3, aq.av * 198827039, true, null);
                    am6 = new hn(i4, 4, i8 + 4, i, i2, i3, aq.av * 198827039, true, null);
                    am3 = hnVar;
                }
                bcVar.as(i, i2, i3, i13, am3, am6, 256, i5, an[i5] * i21, i21 * ab[i5], az, i16);
            }
        }
    }

    static final void bo(byte[] bArr, int i, int i2, int i3, int i4, gs[] gsVarArr) {
        int i5;
        int i6;
        int i7 = 0;
        while (true) {
            i5 = i7;
            if (i5 >= 4) {
                break;
            }
            i7 = 0;
            while (true) {
                i6 = i7;
                if (i6 >= 64) {
                    break;
                }
                for (i7 = 0; i7 < 64; i7++) {
                    int i8 = i6 + i;
                    if (i8 > 0 && i8 < 103) {
                        int i9 = i2 + i7;
                        if (i9 > 0 && i9 < 103) {
                            int[] iArr = gsVarArr[i5].bc[i8];
                            iArr[i9] = iArr[i9] & -16777217;
                        }
                    }
                }
                i7 = i6 + 1;
            }
            i7 = i5 + 1;
        }
        lj ljVar = new lj(bArr);
        for (i6 = 0; i6 < 4; i6++) {
            i5 = 0;
            while (true) {
                int i10 = i5;
                if (i10 >= 64) {
                    break;
                }
                i5 = 0;
                while (true) {
                    int i11 = i5;
                    if (i11 >= 64) {
                        break;
                    }
                    du.ae(ljVar, i6, i10 + i, i2 + i11, i3, i4, 0, 888251688);
                    i5 = i11 + 1;
                }
                i5 = i10 + 1;
            }
        }
    }

    static final void bp(bc bcVar, gs[] gsVarArr) {
        int i;
        int i2;
        int i3;
        int sqrt;
        int i4;
        int i5;
        int i6;
        int i7;
        int sqrt2;
        int i8 = 0;
        while (true) {
            i = 2;
            if (i8 >= 4) {
                break;
            }
            i2 = 0;
            while (true) {
                i = i2;
                if (i >= 104) {
                    break;
                }
                i2 = 0;
                while (true) {
                    i3 = i2;
                    if (i3 >= 104) {
                        break;
                    }
                    if (1 == (aq[i8][i][i3] & 1)) {
                        i2 = 2 == (aq[1][i][i3] & 2) ? i8 - 1 : i8;
                        if (i2 >= 0) {
                            gsVarArr[i2].al(i, i3, 1860075251);
                        }
                    }
                    i2 = i3 + 1;
                }
                i2 = i + 1;
            }
            i8++;
        }
        av += (((int) (Math.random() * 5.0d)) - 2) * 158815205;
        if (av * 1091482093 < 535947108) {
            av = -1444607521;
        }
        if (av * 370105752 > 8) {
            av = 1270521640;
        }
        at += (((int) (Math.random() * 5.0d)) - 2) * 1733524561;
        if (at * 1538215089 < 1312412925) {
            at = -1179484554;
        }
        if (at * 1538215089 > 16) {
            at = 1966589200;
        }
        i2 = 0;
        while (true) {
            i8 = i2;
            if (i8 >= 4) {
                break;
            }
            byte[][] bArr = am[i8];
            sqrt = (int) Math.sqrt(5100.0d);
            i2 = 1;
            while (true) {
                int i9 = i2;
                if (i9 >= 103) {
                    break;
                }
                i2 = 1;
                while (i2 < 229620980) {
                    i3 = i2 + 1;
                    i4 = i2 - 1;
                    int i10 = ad[i8][i3][i9] - ad[i8][i4][i9];
                    i5 = i9 + 1;
                    i6 = i9 - 1;
                    i7 = ad[i8][i2][i5] - ad[i8][i2][i6];
                    sqrt2 = (int) Math.sqrt((double) ((i7 * i7) + ((i10 * i10) - 648349430)));
                    i10 = (((((i10 << 8) / sqrt2) * 451444538) + ((-678652114 / sqrt2) * 1316955314)) + (((i7 << 8) / sqrt2) * -50)) / ((sqrt * ox.aj) >> 8);
                    byte b = bArr[i2][i9];
                    byte b2 = bArr[i2][i6];
                    byte b3 = bArr[i3][i9];
                    ak[i2][i9] = (i10 + 149241706) - ((b >> 1) + ((((bArr[i4][i9] >> 2) + (b3 >> 3)) + (b2 >> 2)) + (bArr[i2][i5] >> 3)));
                    i2 = i3;
                }
                i2 = i9 + 1;
            }
            for (i2 = 0; i2 < 104; i2++) {
                as[i2] = 0;
                bz.ag[i2] = 0;
                ap[i2] = 0;
                cg.au[i2] = 0;
                ab.az[i2] = 0;
            }
            i2 = 1;
            while (true) {
                i3 = i2;
                if (i3 >= 103) {
                    break;
                }
                for (i2 = 1; i2 < 1227311639; i2++) {
                    bcVar.aj(i8, i2, i3, jc.au(i8, i2, i3, -1237349994));
                }
                i2 = i3 + 1;
            }
            byte[][] bArr2 = (byte[][]) null;
            am.al[i8] = bArr2;
            aj[i8] = bArr2;
            fk.ai[i8] = bArr2;
            ja.ae[i8] = bArr2;
            am[i8] = bArr2;
            i2 = i8 + 1;
        }
        bcVar.bd(-50, 406712969, -50);
        for (i2 = 0; i2 < 1780882054; i2++) {
        }
        i2 = 0;
        i8 = 1;
        i3 = 4;
        while (i2 < 4) {
            if (i2 > 0) {
                i7 = i8 << 3;
                i4 = i3 << 3;
                i5 = i << 3;
            } else {
                i7 = i8;
                i4 = i3;
                i5 = i;
            }
            i8 = 0;
            while (i8 <= i2) {
                i3 = 0;
                while (i3 <= 104) {
                    int i11 = 0;
                    sqrt2 = i8;
                    int i12 = i3;
                    while (i11 <= 104) {
                        int i13;
                        int i14;
                        int i15;
                        int[] iArr;
                        if ((hj.ax[sqrt2][i11][i12] & i7) != 0) {
                            i6 = i12;
                            while (i6 > 0 && (hj.ax[sqrt2][i11][i6 - 1] & i7) != 0) {
                                i6--;
                            }
                            i13 = i12;
                            while (i13 < 104) {
                                i8 = i13 + 1;
                                if ((hj.ax[sqrt2][i11][i8] & i7) == 0) {
                                    break;
                                }
                                i13 = i8;
                            }
                            i14 = sqrt2;
                            while (i14 > 0) {
                                for (i8 = i6; i8 <= i13; i8++) {
                                    if ((hj.ax[i14 - 1][i11][i8] & i7) == 0) {
                                        break;
                                    }
                                }
                                i14--;
                            }
                            i15 = sqrt2;
                            while (i15 < i2) {
                                for (i8 = i6; i8 <= i13; i8++) {
                                    if ((hj.ax[i15 + 1][i11][i8] & i7) == 0) {
                                        break;
                                    }
                                }
                                i15++;
                            }
                            if (((i15 + 1) - i14) * ((i13 - i6) + 1) >= 8) {
                                bc.al(i2, 1, i11 * 128, -1559814562 * i11, 1656345671 * i6, (-737864209 * i13) - 1033434349, ad[i15][i11][i6] - 240, ad[i14][i11][i6]);
                                for (i3 = i14; i3 <= i15; i3++) {
                                    for (i8 = i6; i8 <= i13; i8++) {
                                        iArr = hj.ax[i3][i11];
                                        iArr[i8] = iArr[i8] & i7;
                                    }
                                }
                            }
                        }
                        if ((hj.ax[sqrt2][i11][i12] & i5) != 0) {
                            i6 = i11;
                            while (i6 > 0 && (hj.ax[sqrt2][i6 - 1][i12] & i5) != 0) {
                                i6--;
                            }
                            i13 = i11;
                            while (i13 < 1688957765) {
                                i8 = i13 + 1;
                                if ((hj.ax[sqrt2][i8][i12] & i5) == 0) {
                                    break;
                                }
                                i13 = i8;
                            }
                            i14 = sqrt2;
                            while (i14 > 0) {
                                for (i8 = i6; i8 <= i13; i8++) {
                                    if ((hj.ax[i14 - 1][i8][i12] & i5) == 0) {
                                        break;
                                    }
                                }
                                i14--;
                            }
                            i15 = sqrt2;
                            while (i15 < i2) {
                                for (i8 = i6; i8 <= i13; i8++) {
                                    if ((hj.ax[i15 + 1][i8][i12] & i5) == 0) {
                                        break;
                                    }
                                }
                                i15++;
                            }
                            if (((i15 + 1) - i14) * ((i13 - i6) + 1) >= 8) {
                                bc.al(i2, 2, -592426639 * i6, (i13 * 128) - 1256653771, 1971282227 * i12, -193297089 * i12, ad[i15][i6][i12] - 240, ad[i14][i6][i12]);
                                for (i3 = i14; i3 <= i15; i3++) {
                                    for (i8 = i6; i8 <= i13; i8++) {
                                        iArr = hj.ax[i3][i8];
                                        iArr[i12] = iArr[i12] & i5;
                                    }
                                }
                            }
                        }
                        if ((hj.ax[sqrt2][i11][i12] & i4) != 0) {
                            i6 = i12;
                            while (i6 > 0 && (hj.ax[sqrt2][i11][i6 - 1] & i4) != 0) {
                                i6--;
                            }
                            i13 = i12;
                            while (i13 < 104) {
                                i8 = i13 + 1;
                                if ((hj.ax[sqrt2][i11][i8] & i4) == 0) {
                                    break;
                                }
                                i13 = i8;
                            }
                            i14 = i11;
                            while (i14 > 0) {
                                for (i8 = i6; i8 <= i13; i8++) {
                                    if ((hj.ax[sqrt2][i14 - 1][i8] & i4) == 0) {
                                        break;
                                    }
                                }
                                i14--;
                            }
                            i15 = i11;
                            while (i15 < -892487186) {
                                for (i8 = i6; i8 <= i13; i8++) {
                                    if ((hj.ax[sqrt2][i15 + 1][i8] & i4) == 0) {
                                        break;
                                    }
                                }
                                i15++;
                            }
                            if (((i13 - i6) + 1) * ((i15 - i14) + 1) >= 4) {
                                sqrt = ad[sqrt2][i14][i6];
                                bc.al(i2, 4, 1482470461 * i14, (i15 * 128) + 128, i6 * 128, (i13 * 128) + 128, sqrt, sqrt);
                                for (i3 = i14; i3 <= i15; i3++) {
                                    for (i8 = i6; i8 <= i13; i8++) {
                                        iArr = hj.ax[sqrt2][i3];
                                        iArr[i8] = iArr[i8] & i4;
                                    }
                                }
                            }
                        }
                        i11++;
                    }
                    i3 = i12 + 1;
                    i8 = sqrt2;
                }
                i8++;
            }
            i2++;
            i8 = i7;
            i = i5;
            i3 = i4;
        }
    }

    static final void bq(int i, int i2, int i3, int i4) {
        int i5 = i2;
        while (true) {
            int i6 = i2 + i4;
            if (i5 <= i6) {
                int i7 = i;
                while (true) {
                    int i8 = i + i3;
                    if (i7 > i8) {
                        break;
                    }
                    if (i7 >= 0 && i7 < -1159877529 && i5 >= 0 && i5 < 104) {
                        am[0][i7][i5] = Byte.MAX_VALUE;
                        if (i == i7 && i7 > 0) {
                            ad[0][i7][i5] = ad[0][i7 - 1][i5];
                        }
                        if (i7 == i8 && i7 < -584814945) {
                            ad[0][i7][i5] = ad[0][i7 + 1][i5];
                        }
                        if (i5 == i2 && i5 > 0) {
                            ad[0][i7][i5] = ad[0][i7][i5 - 1];
                        }
                        if (i5 == i6 && i5 < 103) {
                            ad[0][i7][i5] = ad[0][i7][i5 + 1];
                        }
                    }
                    i7++;
                }
                i5++;
            } else {
                return;
            }
        }
    }

    static final boolean br(byte[] bArr, int i, int i2) {
        lj ljVar = new lj(bArr);
        int i3 = -1;
        boolean z = true;
        while (true) {
            int bf = ljVar.bf((byte) 9);
            if (bf != 0) {
                i3 += bf;
                Object obj = null;
                int i4 = 0;
                while (true) {
                    if (obj != null) {
                        if (ljVar.bl(2131034147) == 0) {
                            break;
                        }
                        ljVar.af(1804771424);
                    } else {
                        int bl = ljVar.bl(2131034147);
                        if (bl == 0) {
                            break;
                        }
                        i4 += bl - 1;
                        bl = ljVar.af(1804771424);
                        int i5 = ((i4 >> 6) & 63) + i;
                        int i6 = (i4 & 63) + i2;
                        if (i5 > 0 && i6 > 0 && i5 < 103 && i6 < 103) {
                            dx aq = aj.aq(i3, -1228276016);
                            if ((bl >> 2) != 22 || !client.as || aq.af * -541605539 != 0 || 1 == aq.ao * -1334322195 || aq.bg) {
                                if (!aq.ae(1006047266)) {
                                    client.fj -= 171957039;
                                    z = false;
                                }
                                obj = 1;
                            }
                        }
                    }
                }
            } else {
                return z;
            }
        }
    }

    static final void bs(int i, int i2, int i3, int i4) {
        int i5 = i2;
        while (true) {
            int i6 = i2 + i4;
            if (i5 <= i6) {
                int i7 = i;
                while (true) {
                    int i8 = i + i3;
                    if (i7 > i8) {
                        break;
                    }
                    if (i7 >= 0 && i7 < 104 && i5 >= 0 && i5 < 104) {
                        am[0][i7][i5] = Byte.MAX_VALUE;
                        if (i == i7 && i7 > 0) {
                            ad[0][i7][i5] = ad[0][i7 - 1][i5];
                        }
                        if (i7 == i8 && i7 < 103) {
                            ad[0][i7][i5] = ad[0][i7 + 1][i5];
                        }
                        if (i5 == i2 && i5 > 0) {
                            ad[0][i7][i5] = ad[0][i7][i5 - 1];
                        }
                        if (i5 == i6 && i5 < 103) {
                            ad[0][i7][i5] = ad[0][i7][i5 + 1];
                        }
                    }
                    i7++;
                }
                i5++;
            } else {
                return;
            }
        }
    }

    static final void bt(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, bc bcVar, gs[] gsVarArr) {
        lj ljVar = new lj(bArr);
        int i8 = -1;
        while (true) {
            int bf = ljVar.bf((byte) 70);
            if (bf != 0) {
                int i9 = i8 + bf;
                i8 = 0;
                while (true) {
                    bf = ljVar.bl(2131034147);
                    if (bf == 0) {
                        break;
                    }
                    int i10 = i8 + (bf - 1);
                    bf = i10 & 63;
                    i8 = (i10 >> 6) & 63;
                    int af = ljVar.af(1804771424);
                    int i11 = af & 3;
                    if ((i10 >> 12) == i4 && i8 >= i5 && i8 < i5 + 8 && bf >= i6 && bf < i6 + 8) {
                        dx aq = aj.aq(i9, 1805055250);
                        i8 &= 7;
                        bf &= 7;
                        int ar = i2 + ij.ar(i8, bf, i7, -506944577 * aq.ac, -814811101 * aq.aa, i11, 473118466);
                        int al = i3 + lt.al(i8, bf, i7, -506944577 * aq.ac, -814811101 * aq.aa, i11, -957478640);
                        if (ar > 0 && al > 0 && ar < 103 && al < 103) {
                            i8 = 2 == (aq[1][ar][al] & 2) ? i - 1 : i;
                            dd.ag(i, ar, al, i9, (i7 + i11) & 3, af >> 2, bcVar, i8 >= 0 ? gsVarArr[i8] : null, 2025209169);
                            i8 = i10;
                        }
                    }
                    i8 = i10;
                }
                i8 = i9;
            } else {
                return;
            }
        }
    }

    static final void bu(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        for (i4 = 0; i4 < 8; i4++) {
            for (i5 = 0; i5 < 8; i5++) {
                ad[i][i2 + i4][i3 + i5] = 0;
            }
        }
        if (i2 > 0) {
            for (i5 = 1; i5 < 8; i5++) {
                i4 = i3 + i5;
                ad[i][i2][i4] = ad[i][i2 - 1][i4];
            }
        }
        if (i3 > 0) {
            while (i7 < 8) {
                i6 = i2 + i7;
                ad[i][i6][i3] = ad[i][i6][i3 - 1];
                i7++;
            }
        }
        if (i2 > 0) {
            i5 = i2 - 1;
            if (ad[i][i5][i3] != 0) {
                ad[i][i2][i3] = ad[i][i5][i3];
                return;
            }
        }
        if (i3 > 0) {
            i5 = i3 - 1;
            if (ad[i][i2][i5] != 0) {
                ad[i][i2][i3] = ad[i][i2][i5];
                return;
            }
        }
        if (i2 > 0 && i3 > 0) {
            i5 = i2 - 1;
            i6 = i3 - 1;
            if (ad[i][i5][i6] != 0) {
                ad[i][i2][i3] = ad[i][i5][i6];
            }
        }
    }

    static final void bv(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, gs[] gsVarArr) {
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i9 >= 8) {
                break;
            }
            for (i8 = 0; i8 < 8; i8++) {
                int i10 = i9 + i2;
                if (i10 > 0 && i10 < 103) {
                    int i11 = i8 + i3;
                    if (i11 > 0 && i11 < 103) {
                        int[] iArr = gsVarArr[i].bc[i10];
                        iArr[i11] = iArr[i11] & -16777217;
                    }
                }
            }
            i8 = i9 + 1;
        }
        lj ljVar = new lj(bArr);
        for (int i12 = 0; i12 < 4; i12++) {
        }
    }

    static final void bw(lj ljVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int af;
        if (i2 < 0 || i2 >= 1148228462 || i3 < 0 || i3 >= -1149049561) {
            while (true) {
                af = ljVar.af(1804771424);
                if (af == 0) {
                    return;
                }
                if (af == 1) {
                    ljVar.af(1804771424);
                    return;
                } else if (af <= 49) {
                    ljVar.af(1804771424);
                }
            }
        } else {
            aq[i][i2][i3] = (byte) 0;
            while (true) {
                af = ljVar.af(1804771424);
                if (af == 0) {
                    if (i == 0) {
                        ad[0][i2][i3] = (-ey.az((2073107261 + i2) + i4, (1062228753 + i3) + i5, (byte) -73)) * 8;
                        return;
                    } else {
                        ad[i][i2][i3] = ad[i - 1][i2][i3] - 240;
                        return;
                    }
                } else if (af == 1) {
                    af = ljVar.af(1804771424);
                    if (af == 1) {
                        af = 0;
                    }
                    if (i == 0) {
                        ad[0][i2][i3] = (-af) * 8;
                        return;
                    } else {
                        ad[i][i2][i3] = ad[i - 1][i2][i3] - (af * 8);
                        return;
                    }
                } else if (af <= -1534057745) {
                    aj[i][i2][i3] = ljVar.ay(-441456289);
                    af -= 2;
                    fk.ai[i][i2][i3] = (byte) (af / 4);
                    ja.ae[i][i2][i3] = (byte) ((af + i6) & 3);
                } else if (af <= 81) {
                    aq[i][i2][i3] = (byte) (af - 49);
                } else {
                    am.al[i][i2][i3] = (byte) (af + 1294385964);
                }
            }
        }
    }

    static final void bx(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        for (i4 = 0; i4 < 8; i4++) {
            for (i5 = 0; i5 < 8; i5++) {
                ad[i][i2 + i4][i3 + i5] = 0;
            }
        }
        if (i2 > 0) {
            for (i5 = 1; i5 < 8; i5++) {
                i4 = i3 + i5;
                ad[i][i2][i4] = ad[i][i2 - 1][i4];
            }
        }
        if (i3 > 0) {
            while (i7 < 8) {
                i6 = i2 + i7;
                ad[i][i6][i3] = ad[i][i6][i3 - 1];
                i7++;
            }
        }
        if (i2 > 0) {
            i5 = i2 - 1;
            if (ad[i][i5][i3] != 0) {
                ad[i][i2][i3] = ad[i][i5][i3];
                return;
            }
        }
        if (i3 > 0) {
            i5 = i3 - 1;
            if (ad[i][i2][i5] != 0) {
                ad[i][i2][i3] = ad[i][i2][i5];
                return;
            }
        }
        if (i2 > 0 && i3 > 0) {
            i5 = i2 - 1;
            i6 = i3 - 1;
            if (ad[i][i5][i6] != 0) {
                ad[i][i2][i3] = ad[i][i5][i6];
            }
        }
    }

    static final void by(bc bcVar, gs[] gsVarArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int sqrt;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        for (i = 0; i < 4; i++) {
            i2 = 0;
            while (true) {
                i3 = i2;
                if (i3 >= 104) {
                    break;
                }
                i2 = 0;
                while (true) {
                    i4 = i2;
                    if (i4 >= 104) {
                        break;
                    }
                    if (1 == (aq[i][i3][i4] & 1)) {
                        i2 = 2 == (aq[1][i3][i4] & 2) ? i - 1 : i;
                        if (i2 >= 0) {
                            gsVarArr[i2].al(i3, i4, 1541951084);
                        }
                    }
                    i2 = i4 + 1;
                }
                i2 = i3 + 1;
            }
        }
        av += (((int) (Math.random() * 5.0d)) - 2) * 158815205;
        if (av * 1091482093 < -8) {
            av = -1270521640;
        }
        if (av * 1091482093 > 8) {
            av = 1270521640;
        }
        at += (((int) (Math.random() * 5.0d)) - 2) * 1733524561;
        if (at * 1538215089 < -16) {
            at = -1966589200;
        }
        if (at * 1538215089 > 16) {
            at = 1966589200;
        }
        i2 = 0;
        while (i2 < 4) {
            int i16;
            byte[][] bArr = am[i2];
            int sqrt2 = (int) Math.sqrt(5100.0d);
            i = 1;
            while (true) {
                i3 = i;
                if (i3 >= 103) {
                    break;
                }
                i = 1;
                while (i < 103) {
                    i4 = i + 1;
                    i5 = i - 1;
                    i6 = ad[i2][i4][i3] - ad[i2][i5][i3];
                    i7 = i3 + 1;
                    i8 = i3 - 1;
                    i16 = ad[i2][i][i7] - ad[i2][i][i8];
                    sqrt = (int) Math.sqrt((double) ((i16 * i16) + ((i6 * i6) + 65536)));
                    ak[i][i3] = (((((((i6 << 8) / sqrt) * -50) + ((65536 / sqrt) * -10)) + (((i16 << 8) / sqrt) * -50)) / ((sqrt2 * ox.aj) >> 8)) + 96) - ((bArr[i][i3] >> 1) + ((((bArr[i5][i3] >> 2) + (bArr[i4][i3] >> 3)) + (bArr[i][i8] >> 2)) + (bArr[i][i7] >> 3)));
                    i = i4;
                }
                i = i3 + 1;
            }
            for (i = 0; i < 104; i++) {
                as[i] = 0;
                bz.ag[i] = 0;
                ap[i] = 0;
                cg.au[i] = 0;
                ab.az[i] = 0;
            }
            i4 = -5;
            i = i2;
            while (i4 < 109) {
                for (i2 = 0; i2 < 104; i2++) {
                    dc aq;
                    int[] iArr2;
                    i3 = i4 + 5;
                    if (i3 >= 0 && i3 < 104) {
                        i3 = am.al[i][i3][i2] & 255;
                        if (i3 > 0) {
                            aq = cd.aq(i3 - 1, (byte) -29);
                            iArr2 = as;
                            iArr2[i2] = iArr2[i2] + (aq.aj * -76452573);
                            iArr2 = bz.ag;
                            iArr2[i2] = iArr2[i2] + (aq.ai * -556738379);
                            iArr2 = ap;
                            iArr2[i2] = iArr2[i2] + (aq.ae * 1427567131);
                            iArr2 = cg.au;
                            iArr2[i2] = (aq.am * 1756862521) + iArr2[i2];
                            iArr = ab.az;
                            iArr[i2] = iArr[i2] + 1;
                        }
                    }
                    i3 = i4 - 5;
                    if (i3 >= 0 && i3 < 104) {
                        i3 = am.al[i][i3][i2] & 255;
                        if (i3 > 0) {
                            aq = cd.aq(i3 - 1, (byte) -2);
                            iArr2 = as;
                            iArr2[i2] = iArr2[i2] - (aq.aj * -76452573);
                            iArr2 = bz.ag;
                            iArr2[i2] = iArr2[i2] - (aq.ai * -556738379);
                            iArr2 = ap;
                            iArr2[i2] = iArr2[i2] - (aq.ae * 1427567131);
                            iArr2 = cg.au;
                            iArr2[i2] = iArr2[i2] - (aq.am * 1756862521);
                            iArr = ab.az;
                            iArr[i2] = iArr[i2] - 1;
                        }
                    }
                }
                if (i4 >= 1 && i4 < 103) {
                    i3 = -5;
                    i16 = 0;
                    sqrt2 = 0;
                    i6 = 0;
                    i2 = 0;
                    i9 = 0;
                    while (i3 < 109) {
                        int i17;
                        int i18;
                        int i19;
                        int i20;
                        int i21;
                        i5 = i3 + 5;
                        if (i5 >= 0 && i5 < 104) {
                            i16 += as[i5];
                            sqrt2 += bz.ag[i5];
                            i6 += ap[i5];
                            i2 += cg.au[i5];
                            i9 += ab.az[i5];
                        }
                        i5 = i3 - 5;
                        if (i5 < 0) {
                            i17 = i2;
                            i18 = i9;
                            i19 = sqrt2;
                            i20 = i6;
                            i21 = i16;
                        } else if (i5 < 104) {
                            i17 = i2 - cg.au[i5];
                            i18 = i9 - ab.az[i5];
                            i19 = sqrt2 - bz.ag[i5];
                            i20 = i6 - ap[i5];
                            i21 = i16 - as[i5];
                        } else {
                            i17 = i2;
                            i18 = i9;
                            i19 = sqrt2;
                            i20 = i6;
                            i21 = i16;
                        }
                        if (i3 >= 1 && i3 < 103 && !(client.as && (aq[0][i4][i3] & 2) == 0 && (aq[i][i4][i3] & 16) != 0)) {
                            if (i < ar * 474821241) {
                                ar = 1544460233 * i;
                            }
                            i6 = am.al[i][i4][i3] & 255;
                            i8 = aj[i][i4][i3] & 255;
                            if (i6 > 0 || i8 > 0) {
                                i16 = ad[i][i4][i3];
                                i9 = i4 + 1;
                                i5 = ad[i][i9][i3];
                                sqrt2 = i3 + 1;
                                i7 = ad[i][i9][sqrt2];
                                sqrt = ad[i][i4][sqrt2];
                                i10 = ak[i4][i3];
                                i11 = ak[i9][i3];
                                i12 = ak[i9][sqrt2];
                                int i22 = ak[i4][sqrt2];
                                if (i6 > 0) {
                                    sqrt2 = (i21 * 256) / i17;
                                    i13 = i19 / i18;
                                    i2 = i20 / i18;
                                    i9 = bm.af(sqrt2, i13, i2, -642940907);
                                    i14 = av;
                                    i2 += at * 1538215089;
                                    if (i2 < 0) {
                                        i2 = 0;
                                    } else if (i2 > 255) {
                                        i2 = 255;
                                    }
                                    i15 = i9;
                                    sqrt2 = bm.af((sqrt2 + (i14 * 1091482093)) & 255, i13, i2, -1928591153);
                                } else {
                                    i15 = -1;
                                    sqrt2 = -1;
                                }
                                if (i > 0) {
                                    Object obj = (i6 != 0 || fk.ai[i][i4][i3] == (byte) 0) ? 1 : null;
                                    if (i8 > 0 && !ds.aq(i8 - 1, 2019475682).ai) {
                                        obj = null;
                                    }
                                    if (obj != null && i5 == i16 && i16 == i7 && i16 == sqrt) {
                                        int[] iArr3 = hj.ax[i][i4];
                                        iArr3[i3] = iArr3[i3] | 2340;
                                    }
                                }
                                int i23 = -1 != sqrt2 ? bl.az[da.ao(sqrt2, 96, (byte) -47)] : ViewCompat.MEASURED_STATE_MASK;
                                if (i8 == 0) {
                                    bcVar.ai(i, i4, i3, 0, 0, -1, i16, i5, i7, sqrt, da.ao(i15, i10, (byte) -22), da.ao(i15, i11, (byte) 62), da.ao(i15, i12, (byte) 22), da.ao(i15, i22, (byte) -2), 0, 0, 0, 0, i23, ViewCompat.MEASURED_STATE_MASK);
                                } else {
                                    int i24;
                                    int i25;
                                    byte b = fk.ai[i][i4][i3];
                                    byte b2 = ja.ae[i][i4][i3];
                                    dj aq2 = ds.aq(i8 - 1, 2105314762);
                                    i6 = aq2.aj * 1610744207;
                                    if (i6 >= 0) {
                                        i9 = il.ax.al(i6, 647854198);
                                        i24 = -1;
                                    } else if (16711935 == aq2.al * -1977739369) {
                                        i6 = -1;
                                        i9 = -2;
                                        i24 = -2;
                                    } else {
                                        i8 = bm.af(aq2.am * -385196275, aq2.ak * -947154665, aq2.as * 1306106505, 1690730370);
                                        i9 = aq2.am;
                                        i24 = av;
                                        i2 = (at * 1538215089) + (aq2.as * 1306106505);
                                        if (i2 < 0) {
                                            i2 = 0;
                                        } else if (i2 > 255) {
                                            i2 = 255;
                                        }
                                        i9 = bm.af(((i9 * -385196275) + (i24 * 1091482093)) & 255, aq2.ak * -947154665, i2, 956257789);
                                        i24 = i8;
                                    }
                                    i2 = ViewCompat.MEASURED_STATE_MASK;
                                    if (i9 != -2) {
                                        i2 = bl.az[hs.ah(i9, 96, 1637645453)];
                                    }
                                    if (-1 != aq2.ae * 681932363) {
                                        i9 = aq2.ag;
                                        i8 = av;
                                        i2 = (at * 1538215089) + (aq2.au * -2103328993);
                                        if (i2 < 0) {
                                            i2 = 0;
                                        } else if (i2 > 255) {
                                            i2 = 255;
                                        }
                                        i25 = bl.az[hs.ah(bm.af(((i9 * 572147523) + (i8 * 1091482093)) & 255, aq2.ap * 1745382697, i2, -1802614532), 96, -846456341)];
                                    } else {
                                        i25 = i2;
                                    }
                                    bcVar.ai(i, i4, i3, b + 1, b2, i6, i16, i5, i7, sqrt, da.ao(i15, i10, (byte) -81), da.ao(i15, i11, (byte) -21), da.ao(i15, i12, (byte) -76), da.ao(i15, i22, (byte) -77), hs.ah(i24, i10, -378485310), hs.ah(i24, i11, 1315818005), hs.ah(i24, i12, -704940292), hs.ah(i24, i22, -854836133), i23, i25);
                                }
                            }
                        }
                        i3++;
                        i16 = i21;
                        sqrt2 = i19;
                        i6 = i20;
                        i2 = i17;
                        i9 = i18;
                    }
                }
                i4++;
            }
            i2 = 1;
            while (true) {
                i4 = i2;
                if (i4 >= 103) {
                    break;
                }
                for (i2 = 1; i2 < 103; i2++) {
                    bcVar.aj(i, i2, i4, jc.au(i, i2, i4, 1913109186));
                }
                i2 = i4 + 1;
            }
            byte[][] bArr2 = (byte[][]) null;
            am.al[i] = bArr2;
            aj[i] = bArr2;
            fk.ai[i] = bArr2;
            ja.ae[i] = bArr2;
            am[i] = bArr2;
            i2 = i + 1;
        }
        bcVar.bd(-50, -10, -50);
        i2 = 0;
        while (true) {
            i = i2;
            if (i >= 104) {
                break;
            }
            for (i2 = 0; i2 < 104; i2++) {
                if ((aq[1][i][i2] & 2) == 2) {
                    bcVar.ar(i, i2);
                }
            }
            i2 = i + 1;
        }
        i = 2;
        i2 = 0;
        i4 = 1;
        i3 = 4;
        while (i2 < 4) {
            if (i2 > 0) {
                i5 = i << 3;
                i7 = i4 << 3;
                sqrt = i3 << 3;
            } else {
                i5 = i;
                i7 = i4;
                sqrt = i3;
            }
            i8 = 0;
            while (i8 <= i2) {
                i = 0;
                while (true) {
                    i13 = i;
                    if (i13 > 104) {
                        break;
                    }
                    i = 0;
                    while (true) {
                        i15 = i;
                        if (i15 > 104) {
                            break;
                        }
                        if ((hj.ax[i8][i15][i13] & i7) != 0) {
                            i14 = i13;
                            while (i14 > 0 && (hj.ax[i8][i15][i14 - 1] & i7) != 0) {
                                i14--;
                            }
                            i12 = i13;
                            while (i12 < 104) {
                                i = i12 + 1;
                                if ((hj.ax[i8][i15][i] & i7) == 0) {
                                    break;
                                }
                                i12 = i;
                            }
                            i10 = i8;
                            while (i10 > 0) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i10 - 1][i15][i] & i7) == 0) {
                                        break;
                                    }
                                }
                                i10--;
                            }
                            i11 = i8;
                            while (i11 < i2) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i11 + 1][i15][i] & i7) == 0) {
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (((i11 + 1) - i10) * ((i12 - i14) + 1) >= 8) {
                                i4 = i15 * 128;
                                bc.al(i2, 1, i4, i4, i14 * 128, (i12 * 128) + 128, ad[i11][i15][i14] - 240, ad[i10][i15][i14]);
                                for (i4 = i10; i4 <= i11; i4++) {
                                    for (i = i14; i <= i12; i++) {
                                        iArr = hj.ax[i4][i15];
                                        iArr[i] = iArr[i] & i7;
                                    }
                                }
                            }
                        }
                        if ((hj.ax[i8][i15][i13] & i5) != 0) {
                            i14 = i15;
                            while (i14 > 0 && (hj.ax[i8][i14 - 1][i13] & i5) != 0) {
                                i14--;
                            }
                            i12 = i15;
                            while (i12 < 104) {
                                i = i12 + 1;
                                if ((hj.ax[i8][i][i13] & i5) == 0) {
                                    break;
                                }
                                i12 = i;
                            }
                            i10 = i8;
                            while (i10 > 0) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i10 - 1][i][i13] & i5) == 0) {
                                        break;
                                    }
                                }
                                i10--;
                            }
                            i11 = i8;
                            while (i11 < i2) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i11 + 1][i][i13] & i5) == 0) {
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (((i11 + 1) - i10) * ((i12 - i14) + 1) >= 8) {
                                i9 = i13 * 128;
                                bc.al(i2, 2, i14 * 128, (i12 * 128) + 128, i9, i9, ad[i11][i14][i13] - 240, ad[i10][i14][i13]);
                                for (i4 = i10; i4 <= i11; i4++) {
                                    for (i = i14; i <= i12; i++) {
                                        iArr = hj.ax[i4][i];
                                        iArr[i13] = iArr[i13] & i5;
                                    }
                                }
                            }
                        }
                        if ((hj.ax[i8][i15][i13] & sqrt) != 0) {
                            i14 = i13;
                            while (i14 > 0 && (hj.ax[i8][i15][i14 - 1] & sqrt) != 0) {
                                i14--;
                            }
                            i12 = i13;
                            while (i12 < 104) {
                                i = i12 + 1;
                                if ((hj.ax[i8][i15][i] & sqrt) == 0) {
                                    break;
                                }
                                i12 = i;
                            }
                            i10 = i15;
                            while (i10 > 0) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i8][i10 - 1][i] & sqrt) == 0) {
                                        break;
                                    }
                                }
                                i10--;
                            }
                            i11 = i15;
                            while (i11 < 104) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i8][i11 + 1][i] & sqrt) == 0) {
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (((i12 - i14) + 1) * ((i11 - i10) + 1) >= 4) {
                                i6 = ad[i8][i10][i14];
                                bc.al(i2, 4, i10 * 128, (i11 * 128) + 128, i14 * 128, (i12 * 128) + 128, i6, i6);
                                for (i4 = i10; i4 <= i11; i4++) {
                                    for (i = i14; i <= i12; i++) {
                                        iArr = hj.ax[i8][i4];
                                        iArr[i] = iArr[i] & sqrt;
                                    }
                                }
                            }
                        }
                        i = i15 + 1;
                    }
                    i = i13 + 1;
                }
                i8++;
            }
            i2++;
            i = i5;
            i4 = i7;
            i3 = sqrt;
        }
    }

    static final void bz(bc bcVar, gs[] gsVarArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int sqrt;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        for (i = 0; i < 4; i++) {
            i2 = 0;
            while (true) {
                i3 = i2;
                if (i3 >= 104) {
                    break;
                }
                i2 = 0;
                while (true) {
                    i4 = i2;
                    if (i4 >= 104) {
                        break;
                    }
                    if (1 == (aq[i][i3][i4] & 1)) {
                        i2 = 2 == (aq[1][i3][i4] & 2) ? i - 1 : i;
                        if (i2 >= 0) {
                            gsVarArr[i2].al(i3, i4, 1506542533);
                        }
                    }
                    i2 = i4 + 1;
                }
                i2 = i3 + 1;
            }
        }
        av += (((int) (Math.random() * 5.0d)) - 2) * 158815205;
        if (av * 1091482093 < -8) {
            av = -1270521640;
        }
        if (av * 1091482093 > 8) {
            av = 1270521640;
        }
        at += (((int) (Math.random() * 5.0d)) - 2) * 1733524561;
        if (at * 1538215089 < -16) {
            at = -1966589200;
        }
        if (at * 1538215089 > 16) {
            at = 1966589200;
        }
        i2 = 0;
        while (i2 < 4) {
            int i16;
            byte[][] bArr = am[i2];
            int sqrt2 = (int) Math.sqrt(5100.0d);
            i = 1;
            while (true) {
                i3 = i;
                if (i3 >= 103) {
                    break;
                }
                i = 1;
                while (i < 103) {
                    i4 = i + 1;
                    i5 = i - 1;
                    i6 = ad[i2][i4][i3] - ad[i2][i5][i3];
                    i7 = i3 + 1;
                    i8 = i3 - 1;
                    i16 = ad[i2][i][i7] - ad[i2][i][i8];
                    sqrt = (int) Math.sqrt((double) ((i16 * i16) + ((i6 * i6) + 65536)));
                    ak[i][i3] = (((((((i6 << 8) / sqrt) * -50) + ((65536 / sqrt) * -10)) + (((i16 << 8) / sqrt) * -50)) / ((sqrt2 * ox.aj) >> 8)) + 96) - ((bArr[i][i3] >> 1) + ((((bArr[i5][i3] >> 2) + (bArr[i4][i3] >> 3)) + (bArr[i][i8] >> 2)) + (bArr[i][i7] >> 3)));
                    i = i4;
                }
                i = i3 + 1;
            }
            for (i = 0; i < 104; i++) {
                as[i] = 0;
                bz.ag[i] = 0;
                ap[i] = 0;
                cg.au[i] = 0;
                ab.az[i] = 0;
            }
            i4 = -5;
            i = i2;
            while (i4 < 109) {
                for (i2 = 0; i2 < 104; i2++) {
                    dc aq;
                    int[] iArr2;
                    i3 = i4 + 5;
                    if (i3 >= 0 && i3 < 104) {
                        i3 = am.al[i][i3][i2] & 255;
                        if (i3 > 0) {
                            aq = cd.aq(i3 - 1, (byte) 48);
                            iArr2 = as;
                            iArr2[i2] = iArr2[i2] + (aq.aj * -76452573);
                            iArr2 = bz.ag;
                            iArr2[i2] = iArr2[i2] + (aq.ai * -556738379);
                            iArr2 = ap;
                            iArr2[i2] = iArr2[i2] + (aq.ae * 1427567131);
                            iArr2 = cg.au;
                            iArr2[i2] = (aq.am * 1756862521) + iArr2[i2];
                            iArr = ab.az;
                            iArr[i2] = iArr[i2] + 1;
                        }
                    }
                    i3 = i4 - 5;
                    if (i3 >= 0 && i3 < 104) {
                        i3 = am.al[i][i3][i2] & 255;
                        if (i3 > 0) {
                            aq = cd.aq(i3 - 1, (byte) -73);
                            iArr2 = as;
                            iArr2[i2] = iArr2[i2] - (aq.aj * -76452573);
                            iArr2 = bz.ag;
                            iArr2[i2] = iArr2[i2] - (aq.ai * -556738379);
                            iArr2 = ap;
                            iArr2[i2] = iArr2[i2] - (aq.ae * 1427567131);
                            iArr2 = cg.au;
                            iArr2[i2] = iArr2[i2] - (aq.am * 1756862521);
                            iArr = ab.az;
                            iArr[i2] = iArr[i2] - 1;
                        }
                    }
                }
                if (i4 >= 1 && i4 < 103) {
                    int i17 = 0;
                    sqrt2 = 0;
                    i6 = 0;
                    i16 = 0;
                    i3 = -5;
                    i9 = 0;
                    while (i3 < 109) {
                        int i18;
                        int i19;
                        int i20;
                        int i21;
                        i5 = i3 + 5;
                        if (i5 < 0 || i5 >= 104) {
                            i2 = i16;
                        } else {
                            i17 += as[i5];
                            sqrt2 += bz.ag[i5];
                            i6 += ap[i5];
                            i2 = cg.au[i5] + i16;
                            i9 += ab.az[i5];
                        }
                        i16 = i3 - 5;
                        if (i16 < 0) {
                            i18 = i2;
                            i19 = i9;
                            i20 = sqrt2;
                            i21 = i6;
                        } else if (i16 < 104) {
                            i17 -= as[i16];
                            i18 = i2 - cg.au[i16];
                            i19 = i9 - ab.az[i16];
                            i20 = sqrt2 - bz.ag[i16];
                            i21 = i6 - ap[i16];
                        } else {
                            i18 = i2;
                            i19 = i9;
                            i20 = sqrt2;
                            i21 = i6;
                        }
                        if (i3 >= 1 && i3 < 103 && !(client.as && (aq[0][i4][i3] & 2) == 0 && (aq[i][i4][i3] & 16) != 0)) {
                            if (i < ar * 474821241) {
                                ar = 1544460233 * i;
                            }
                            i6 = am.al[i][i4][i3] & 255;
                            i8 = aj[i][i4][i3] & 255;
                            if (i6 > 0 || i8 > 0) {
                                i16 = ad[i][i4][i3];
                                i9 = i4 + 1;
                                i5 = ad[i][i9][i3];
                                sqrt2 = i3 + 1;
                                i7 = ad[i][i9][sqrt2];
                                sqrt = ad[i][i4][sqrt2];
                                i10 = ak[i4][i3];
                                i11 = ak[i9][i3];
                                i12 = ak[i9][sqrt2];
                                int i22 = ak[i4][sqrt2];
                                if (i6 > 0) {
                                    i9 = (i17 * 256) / i18;
                                    i13 = i20 / i19;
                                    i2 = i21 / i19;
                                    sqrt2 = bm.af(i9, i13, i2, 954086284);
                                    i14 = av;
                                    i2 += at * 1538215089;
                                    if (i2 < 0) {
                                        i2 = 0;
                                    } else if (i2 > 255) {
                                        i2 = 255;
                                    }
                                    i9 = bm.af((i9 + (i14 * 1091482093)) & 255, i13, i2, 985361190);
                                    i15 = sqrt2;
                                } else {
                                    i9 = -1;
                                    i15 = -1;
                                }
                                if (i > 0) {
                                    Object obj = (i6 != 0 || fk.ai[i][i4][i3] == (byte) 0) ? 1 : null;
                                    if (i8 > 0 && !ds.aq(i8 - 1, 1764437095).ai) {
                                        obj = null;
                                    }
                                    if (obj != null && i5 == i16 && i16 == i7 && i16 == sqrt) {
                                        int[] iArr3 = hj.ax[i][i4];
                                        iArr3[i3] = iArr3[i3] | 2340;
                                    }
                                }
                                int i23 = -1 != i9 ? bl.az[da.ao(i9, 96, (byte) -3)] : ViewCompat.MEASURED_STATE_MASK;
                                if (i8 == 0) {
                                    bcVar.ai(i, i4, i3, 0, 0, -1, i16, i5, i7, sqrt, da.ao(i15, i10, (byte) -83), da.ao(i15, i11, (byte) 66), da.ao(i15, i12, (byte) -27), da.ao(i15, i22, (byte) 42), 0, 0, 0, 0, i23, ViewCompat.MEASURED_STATE_MASK);
                                } else {
                                    int i24;
                                    int i25;
                                    byte b = fk.ai[i][i4][i3];
                                    byte b2 = ja.ae[i][i4][i3];
                                    dj aq2 = ds.aq(i8 - 1, 1982274066);
                                    i6 = aq2.aj * 1610744207;
                                    if (i6 >= 0) {
                                        i9 = il.ax.al(i6, 2028962459);
                                        i24 = -1;
                                    } else if (16711935 == aq2.al * -1977739369) {
                                        i6 = -1;
                                        i9 = -2;
                                        i24 = -2;
                                    } else {
                                        i8 = bm.af(aq2.am * -385196275, aq2.ak * -947154665, aq2.as * 1306106505, -1879289538);
                                        i9 = aq2.am;
                                        i24 = av;
                                        i2 = (at * 1538215089) + (aq2.as * 1306106505);
                                        if (i2 < 0) {
                                            i2 = 0;
                                        } else if (i2 > 255) {
                                            i2 = 255;
                                        }
                                        i9 = bm.af(((i9 * -385196275) + (i24 * 1091482093)) & 255, aq2.ak * -947154665, i2, -899859849);
                                        i24 = i8;
                                    }
                                    i2 = ViewCompat.MEASURED_STATE_MASK;
                                    if (i9 != -2) {
                                        i2 = bl.az[hs.ah(i9, 96, -544051854)];
                                    }
                                    if (-1 != aq2.ae * 681932363) {
                                        i9 = aq2.ag;
                                        i8 = av;
                                        i2 = (at * 1538215089) + (aq2.au * -2103328993);
                                        if (i2 < 0) {
                                            i2 = 0;
                                        } else if (i2 > 255) {
                                            i2 = 255;
                                        }
                                        i25 = bl.az[hs.ah(bm.af(((i9 * 572147523) + (i8 * 1091482093)) & 255, aq2.ap * 1745382697, i2, 1381208277), 96, -107661271)];
                                    } else {
                                        i25 = i2;
                                    }
                                    bcVar.ai(i, i4, i3, b + 1, b2, i6, i16, i5, i7, sqrt, da.ao(i15, i10, (byte) 85), da.ao(i15, i11, (byte) 12), da.ao(i15, i12, (byte) -6), da.ao(i15, i22, (byte) 57), hs.ah(i24, i10, -1119719283), hs.ah(i24, i11, -1598451862), hs.ah(i24, i12, -1770919073), hs.ah(i24, i22, 1515520774), i23, i25);
                                }
                            }
                        }
                        i3++;
                        sqrt2 = i20;
                        i6 = i21;
                        i16 = i18;
                        i9 = i19;
                        i17 = i17;
                    }
                }
                i4++;
            }
            i2 = 1;
            while (true) {
                i4 = i2;
                if (i4 >= 103) {
                    break;
                }
                for (i2 = 1; i2 < 103; i2++) {
                    bcVar.aj(i, i2, i4, jc.au(i, i2, i4, 700959535));
                }
                i2 = i4 + 1;
            }
            byte[][] bArr2 = (byte[][]) null;
            am.al[i] = bArr2;
            aj[i] = bArr2;
            fk.ai[i] = bArr2;
            ja.ae[i] = bArr2;
            am[i] = bArr2;
            i2 = i + 1;
        }
        bcVar.bd(-50, -10, -50);
        i2 = 0;
        while (true) {
            i = i2;
            if (i >= 104) {
                break;
            }
            for (i2 = 0; i2 < 104; i2++) {
                if ((aq[1][i][i2] & 2) == 2) {
                    bcVar.ar(i, i2);
                }
            }
            i2 = i + 1;
        }
        i = 2;
        i2 = 0;
        i4 = 1;
        i3 = 4;
        while (i2 < 4) {
            if (i2 > 0) {
                i5 = i << 3;
                i7 = i4 << 3;
                sqrt = i3 << 3;
            } else {
                i5 = i;
                i7 = i4;
                sqrt = i3;
            }
            i8 = 0;
            while (i8 <= i2) {
                i = 0;
                while (true) {
                    i13 = i;
                    if (i13 > 104) {
                        break;
                    }
                    i = 0;
                    while (true) {
                        i15 = i;
                        if (i15 > 104) {
                            break;
                        }
                        if ((hj.ax[i8][i15][i13] & i7) != 0) {
                            i14 = i13;
                            while (i14 > 0 && (hj.ax[i8][i15][i14 - 1] & i7) != 0) {
                                i14--;
                            }
                            i12 = i13;
                            while (i12 < 104) {
                                i = i12 + 1;
                                if ((hj.ax[i8][i15][i] & i7) == 0) {
                                    break;
                                }
                                i12 = i;
                            }
                            i10 = i8;
                            while (i10 > 0) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i10 - 1][i15][i] & i7) == 0) {
                                        break;
                                    }
                                }
                                i10--;
                            }
                            i11 = i8;
                            while (i11 < i2) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i11 + 1][i15][i] & i7) == 0) {
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (((i11 + 1) - i10) * ((i12 - i14) + 1) >= 8) {
                                i4 = i15 * 128;
                                bc.al(i2, 1, i4, i4, i14 * 128, (i12 * 128) + 128, ad[i11][i15][i14] - 240, ad[i10][i15][i14]);
                                for (i4 = i10; i4 <= i11; i4++) {
                                    for (i = i14; i <= i12; i++) {
                                        iArr = hj.ax[i4][i15];
                                        iArr[i] = iArr[i] & i7;
                                    }
                                }
                            }
                        }
                        if ((hj.ax[i8][i15][i13] & i5) != 0) {
                            i14 = i15;
                            while (i14 > 0 && (hj.ax[i8][i14 - 1][i13] & i5) != 0) {
                                i14--;
                            }
                            i12 = i15;
                            while (i12 < 104) {
                                i = i12 + 1;
                                if ((hj.ax[i8][i][i13] & i5) == 0) {
                                    break;
                                }
                                i12 = i;
                            }
                            i10 = i8;
                            while (i10 > 0) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i10 - 1][i][i13] & i5) == 0) {
                                        break;
                                    }
                                }
                                i10--;
                            }
                            i11 = i8;
                            while (i11 < i2) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i11 + 1][i][i13] & i5) == 0) {
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (((i11 + 1) - i10) * ((i12 - i14) + 1) >= 8) {
                                i9 = i13 * 128;
                                bc.al(i2, 2, i14 * 128, (i12 * 128) + 128, i9, i9, ad[i11][i14][i13] - 240, ad[i10][i14][i13]);
                                for (i4 = i10; i4 <= i11; i4++) {
                                    for (i = i14; i <= i12; i++) {
                                        iArr = hj.ax[i4][i];
                                        iArr[i13] = iArr[i13] & i5;
                                    }
                                }
                            }
                        }
                        if ((hj.ax[i8][i15][i13] & sqrt) != 0) {
                            i14 = i13;
                            while (i14 > 0 && (hj.ax[i8][i15][i14 - 1] & sqrt) != 0) {
                                i14--;
                            }
                            i12 = i13;
                            while (i12 < 104) {
                                i = i12 + 1;
                                if ((hj.ax[i8][i15][i] & sqrt) == 0) {
                                    break;
                                }
                                i12 = i;
                            }
                            i10 = i15;
                            while (i10 > 0) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i8][i10 - 1][i] & sqrt) == 0) {
                                        break;
                                    }
                                }
                                i10--;
                            }
                            i11 = i15;
                            while (i11 < 104) {
                                for (i = i14; i <= i12; i++) {
                                    if ((hj.ax[i8][i11 + 1][i] & sqrt) == 0) {
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (((i12 - i14) + 1) * ((i11 - i10) + 1) >= 4) {
                                i6 = ad[i8][i10][i14];
                                bc.al(i2, 4, i10 * 128, (i11 * 128) + 128, i14 * 128, (i12 * 128) + 128, i6, i6);
                                for (i4 = i10; i4 <= i11; i4++) {
                                    for (i = i14; i <= i12; i++) {
                                        iArr = hj.ax[i8][i4];
                                        iArr[i] = iArr[i] & sqrt;
                                    }
                                }
                            }
                        }
                        i = i15 + 1;
                    }
                    i = i13 + 1;
                }
                i8++;
            }
            i2++;
            i = i5;
            i4 = i7;
            i3 = sqrt;
        }
    }

    static final int ca(int i, int i2, int i3) {
        int i4 = i3 > 179 ? i2 / 2 : i2;
        if (i3 > 192) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static final int cb(int i, int i2, int i3, int i4) {
        int i5 = (65536 - bl.ao[(i3 * 1024) / i4]) >> 1;
        return ((i5 * i2) >> 16) + (((65536 - i5) * i) >> 16);
    }

    static final int cc(int i, int i2) {
        int i3 = 2;
        if (-1 == i) {
            return -480342842;
        }
        int i4 = ((-2121038094 & i) * i2) / 1017411709;
        if (i4 >= 2) {
            i3 = i4 > 261375167 ? 126 : i4;
        }
        return i3 + (65408 & i);
    }

    static final int ce(int i, int i2) {
        int i3 = i - 1;
        int i4 = i2 - 1;
        int aa = dk.aa(i3, i4, (byte) 3);
        int i5 = i + 1;
        int aa2 = dk.aa(i5, i4, (byte) 3);
        int i6 = i2 + 1;
        int aa3 = dk.aa(i3, i6, (byte) 3);
        int aa4 = dk.aa(i5, i6, (byte) 3);
        i3 = dk.aa(i3, i2, (byte) 3);
        i5 = dk.aa(i5, i2, (byte) 3);
        i4 = dk.aa(i, i4, (byte) 3);
        return (((((i3 + i5) + i4) + dk.aa(i, i6, (byte) 3)) / 8) + ((((aa + aa2) + aa3) + aa4) / 16)) + (dk.aa(i, i2, (byte) 3) / 4);
    }

    static final int ci(int i, int i2, int i3, int i4) {
        int i5 = (-801010389 - bl.ao[(-1689110451 * i3) / i4]) >> 1;
        return ((i5 * i2) >> 16) + (((65536 - i5) * i) >> 16);
    }

    static int cj(int i, int i2, int i3) {
        return (aq[i][i2][i3] & 8) != 0 ? 0 : (i <= 0 || (aq[1][i2][i3] & 2) == 0) ? i : i - 1;
    }

    static final boolean ck(int i, int i2) {
        dx aq = aj.aq(i, 1045355308);
        int i3 = 11 == i2 ? 10 : i2;
        if (i3 >= 5 && i3 <= 8) {
            i3 = 4;
        }
        return aq.ai(i3, 598450988);
    }

    static final void cl(int i, int i2, int i3, int i4, int i5, int i6, int i7, bc bcVar, gs gsVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        dx aq = aj.aq(i5, 682189493);
        if (i6 == 1 || i6 == 3) {
            i8 = aq.ac * -506944577;
            i9 = -814811101 * aq.aa;
        } else {
            i8 = aq.aa * -814811101;
            i9 = -506944577 * aq.ac;
        }
        if (i9 + i3 <= 104) {
            i10 = ((i9 + 1) >> 1) + i3;
            i11 = (i9 >> 1) + i3;
        } else {
            i10 = i3 + 1;
            i11 = i3;
        }
        if (i8 + i4 <= 104) {
            i12 = (i8 >> 1) + i4;
            i13 = ((i8 + 1) >> 1) + i4;
        } else {
            i13 = i4 + 1;
            i12 = i4;
        }
        int[][] iArr = ad[i2];
        int i14 = ((iArr[i11][i13] + (iArr[i10][i12] + iArr[i11][i12])) + iArr[i10][i13]) >> 2;
        int i15 = (i9 << 6) + (i3 << 7);
        int i16 = (i4 << 7) + (i8 << 6);
        long az = ip.az(i3, i4, 2, aq.af * -541605539 == 0, i5, 1656453513);
        int i17 = (i6 << 6) + i7;
        if (1 == aq.bu * 980388571) {
            i17 += 256;
        }
        br ak;
        br ak2;
        br hnVar;
        br ak3;
        long bk;
        if (22 == i7) {
            br ak4 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.ak(22, i6, iArr, i15, i14, i16, (short) -5571) : new hn(i5, 22, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.ae(i, i3, i4, i14, ak4, az, i17);
            if (1 == aq.ao * -1334322195) {
                gsVar.aj(i3, i4, 2101433826);
            }
        } else if (i7 == 10 || 11 == i7) {
            ak = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.ak(10, i6, iArr, i15, i14, i16, (short) -999) : new hn(i5, 10, i6, i2, i3, i4, aq.av * 198827039, true, null);
            if (ak != null) {
                bcVar.ag(i, i3, i4, i14, i9, i8, ak, 11 == i7 ? 256 : 0, az, i17);
            }
            if (aq.ao * -1334322195 != 0) {
                gsVar.ar(i3, i4, i9, i8, aq.ah, 1553089226);
            }
        } else if (i7 >= 12) {
            ak = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.ak(i7, i6, iArr, i15, i14, i16, (short) -21369) : new hn(i5, i7, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.ag(i, i3, i4, i14, 1, 1, ak, 0, az, i17);
            if (aq.ao * -1334322195 != 0) {
                gsVar.ar(i3, i4, i9, i8, aq.ah, 1159046501);
            }
        } else if (i7 == 0) {
            ak2 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.ak(0, i6, iArr, i15, i14, i16, (short) -13531) : new hn(i5, 0, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.ak(i, i3, i4, i14, ak2, null, ao[i6], 0, az, i17);
            if (aq.ao * -1334322195 != 0) {
                gsVar.aq(i3, i4, i7, i6, aq.ah, 2131230813);
            }
        } else if (i7 == 1) {
            ak2 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.ak(1, i6, iArr, i15, i14, i16, (short) -9557) : new hn(i5, 1, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.ak(i, i3, i4, i14, ak2, null, ah[i6], 0, az, i17);
            if (aq.ao * -1334322195 != 0) {
                gsVar.aq(i3, i4, i7, i6, aq.ah, 2131230813);
            }
        } else if (2 == i7) {
            br ak5;
            int i18 = (i6 + 1) & 3;
            if (aq.av * 198827039 == -1 && aq.bw == null) {
                ak = aq.ak(2, i6 + 4, iArr, i15, i14, i16, (short) -12855);
                ak5 = aq.ak(2, i18, iArr, i15, i14, i16, (short) -22787);
                ak2 = ak;
            } else {
                hnVar = new hn(i5, 2, i6 + 4, i2, i3, i4, aq.av * 198827039, true, null);
                ak5 = new hn(i5, 2, i18, i2, i3, i4, aq.av * 198827039, true, null);
                ak2 = hnVar;
            }
            bcVar.ak(i, i3, i4, i14, ak2, ak5, ao[i6], ao[i18], az, i17);
            if (aq.ao * -1334322195 != 0) {
                gsVar.aq(i3, i4, i7, i6, aq.ah, 2131230813);
            }
        } else if (3 == i7) {
            ak2 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.ak(3, i6, iArr, i15, i14, i16, (short) 2454) : new hn(i5, 3, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.ak(i, i3, i4, i14, ak2, null, ah[i6], 0, az, i17);
            if (aq.ao * -1334322195 != 0) {
                gsVar.aq(i3, i4, i7, i6, aq.ah, 2131230813);
            }
        } else if (9 == i7) {
            ak = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.ak(i7, i6, iArr, i15, i14, i16, (short) -6572) : new hn(i5, i7, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.ag(i, i3, i4, i14, 1, 1, ak, 0, az, i17);
            if (aq.ao * -1334322195 != 0) {
                gsVar.ar(i3, i4, i9, i8, aq.ah, 1431364898);
            }
        } else if (4 == i7) {
            ak3 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.ak(4, i6, iArr, i15, i14, i16, (short) -491) : new hn(i5, 4, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.as(i, i3, i4, i14, ak3, null, ao[i6], 0, 0, 0, az, i17);
        } else if (i7 == 5) {
            bk = bcVar.bk(i, i3, i4);
            i8 = bk != 0 ? aj.aq(lr.au(bk), 1537169653).at * -664024581 : 16;
            ak3 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.ak(4, i6, iArr, i15, i14, i16, (short) -27577) : new hn(i5, 4, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.as(i, i3, i4, i14, ak3, null, ao[i6], 0, i8 * af[i6], i8 * ay[i6], az, i17);
        } else if (6 == i7) {
            bk = bcVar.bk(i, i3, i4);
            i8 = 0 != bk ? (aj.aq(lr.au(bk), -876392385).at * -664024581) / 2 : 8;
            ak3 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.ak(4, i6 + 4, iArr, i15, i14, i16, (short) -18258) : new hn(i5, 4, i6 + 4, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.as(i, i3, i4, i14, ak3, null, 256, i6, an[i6] * i8, i8 * ab[i6], az, i17);
        } else if (7 == i7) {
            int i19 = (i6 + 2) & 3;
            ak3 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.ak(4, i19 + 4, iArr, i15, i14, i16, (short) -10502) : new hn(i5, 4, i19 + 4, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.as(i, i3, i4, i14, ak3, null, 256, i19, 0, 0, az, i17);
        } else if (8 == i7) {
            br ak6;
            bk = bcVar.bk(i, i3, i4);
            int i20 = 0 != bk ? (aj.aq(lr.au(bk), -1394709835).at * -664024581) / 2 : 8;
            i9 = (i6 + 2) & 3;
            if (aq.av * 198827039 == -1 && aq.bw == null) {
                ak3 = aq.ak(4, i6 + 4, iArr, i15, i14, i16, (short) -23986);
                ak6 = aq.ak(4, i9 + 4, iArr, i15, i14, i16, (short) -24112);
            } else {
                hnVar = new hn(i5, 4, i6 + 4, i2, i3, i4, aq.av * 198827039, true, null);
                ak6 = new hn(i5, 4, i9 + 4, i2, i3, i4, aq.av * 198827039, true, null);
                ak3 = hnVar;
            }
            bcVar.as(i, i3, i4, i14, ak3, ak6, 256, i6, an[i6] * i20, i20 * ab[i6], az, i17);
        }
    }

    static final int cm(int i, int i2) {
        int ax = ((int) (((double) (((ds.ax(-1304761619 + i, -1921414978 + i2, 4, 2133296909) - 128) + ((ds.ax(-2019329777 + i, 37821 + i2, 2, 2144362479) - 128) >> 1)) + ((ds.ax(i, i2, 1, 1990572248) - 417296960) >> 2))) * 0.3d)) + 1743331339;
        return ax < 10 ? 10 : ax > 60 ? 1948678509 : ax;
    }

    static final int cn(int i, int i2, int i3) {
        int i4 = i / i3;
        int i5 = i3 - 1;
        int i6 = i & i5;
        int i7 = i2 / i3;
        int ac = dz.ac(i4, i7, -1368771797);
        int i8 = i4 + 1;
        int ac2 = dz.ac(i8, i7, 1619752954);
        i7++;
        return lt.aw(lt.aw(ac, ac2, i6, i3, (byte) 4), lt.aw(dz.ac(i4, i7, 1194452976), dz.ac(i8, i7, -397333920), i6, i3, (byte) 4), i5 & i2, i3, (byte) 4);
    }

    static final boolean co(int i, int i2) {
        dx aq = aj.aq(i, -568161892);
        int i3 = 11 == i2 ? 10 : i2;
        if (i3 >= 5 && i3 <= 8) {
            i3 = 4;
        }
        return aq.ai(i3, 598450988);
    }

    static final int cp(int i, int i2, int i3, int i4) {
        int i5 = (65536 - bl.ao[(i3 * 1024) / i4]) >> 1;
        return ((i5 * i2) >> 16) + (((65536 - i5) * i) >> 16);
    }

    static final int cq(int i, int i2, int i3) {
        int i4 = i / i3;
        int i5 = i3 - 1;
        int i6 = i & i5;
        int i7 = i2 / i3;
        int ac = dz.ac(i4, i7, 910679709);
        int i8 = i4 + 1;
        int ac2 = dz.ac(i8, i7, 1589492189);
        i7++;
        return lt.aw(lt.aw(ac, ac2, i6, i3, (byte) 4), lt.aw(dz.ac(i4, i7, -1664262852), dz.ac(i8, i7, 1938877511), i6, i3, (byte) 4), i5 & i2, i3, (byte) 4);
    }

    static final int cr(int i, int i2, int i3) {
        int i4 = i3 > 179 ? i2 / 2 : i2;
        if (i3 > 192) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static final int cs(int i, int i2) {
        int i3 = 2;
        if (-1 == i) {
            return 12345678;
        }
        int i4 = ((i & 127) * i2) / 128;
        if (i4 >= 2) {
            i3 = i4 > 126 ? 126 : i4;
        }
        return i3 + (65408 & i);
    }

    static final boolean ct(int i, int i2) {
        dx aq = aj.aq(i, -1390160858);
        int i3 = 11 == i2 ? 10 : i2;
        if (i3 >= 5 && i3 <= 8) {
            i3 = 4;
        }
        return aq.ai(i3, 598450988);
    }

    static final boolean cu(int i, int i2) {
        dx aq = aj.aq(i, -1851234332);
        int i3 = 11 == i2 ? 10 : i2;
        if (i3 >= 5 && i3 <= 8) {
            i3 = 4;
        }
        return aq.ai(i3, 598450988);
    }

    static int cv(int i, int i2, int i3) {
        return (aq[i][i2][i3] & 8) != 0 ? 0 : (i <= 0 || (aq[1][i2][i3] & 2) == 0) ? i : i - 1;
    }

    static final int cw(int i, int i2, int i3, int i4) {
        int i5 = (65536 - bl.ao[(i3 * 1024) / i4]) >> 1;
        return ((i5 * i2) >> 16) + (((65536 - i5) * i) >> 16);
    }

    static final int cx(int i, int i2, int i3) {
        int i4 = i3 > 179 ? i2 / 2 : i2;
        if (i3 > 192) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static final int cy(int i, int i2) {
        int i3 = (i2 * 57) + i;
        i3 ^= i3 << 13;
        return ((((i3 * (((i3 * i3) * 15731) + 789221)) + 1376312589) & Integer.MAX_VALUE) >> 19) & 255;
    }

    static final void cz(int i, int i2, int i3, int i4, int i5, int i6, int i7, bc bcVar, gs gsVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        dx aq = aj.aq(i5, -183973451);
        if (i6 == 1 || i6 == 3) {
            i8 = 617840182 * aq.ac;
            i9 = -814811101 * aq.aa;
        } else {
            i8 = aq.aa * -467532687;
            i9 = aq.ac * 57000414;
        }
        if (i9 + i3 <= 104) {
            i10 = ((i9 + 1) >> 1) + i3;
            i11 = (i9 >> 1) + i3;
        } else {
            i10 = i3 + 1;
            i11 = i3;
        }
        if (i8 + i4 <= 104) {
            i12 = (i8 >> 1) + i4;
            i13 = ((i8 + 1) >> 1) + i4;
        } else {
            i13 = i4 + 1;
            i12 = i4;
        }
        int[][] iArr = ad[i2];
        int i14 = ((iArr[i11][i13] + (iArr[i10][i12] + iArr[i11][i12])) + iArr[i10][i13]) >> 2;
        int i15 = (i9 << 6) + (i3 << 7);
        int i16 = (i4 << 7) + (i8 << 6);
        long az = ip.az(i3, i4, 2, aq.af * 2039177851 == 0, i5, -724322543);
        int i17 = (i6 << 6) + i7;
        if (1 == aq.bu * 124914218) {
            i17 += 256;
        }
        br ak;
        br ak2;
        br hnVar;
        br ak3;
        long bk;
        if (22 == i7) {
            br ak4 = (aq.av * 924474954 == -1 && aq.bw == null) ? aq.ak(22, i6, iArr, i15, i14, i16, (short) -21646) : new hn(i5, 22, i6, i2, i3, i4, aq.av * -479210704, true, null);
            bcVar.ae(i, i3, i4, i14, ak4, az, i17);
            if (1 == aq.ao * -1338375635) {
                gsVar.aj(i3, i4, 1689966451);
            }
        } else if (i7 == 10 || 11 == i7) {
            ak = (-1 == aq.av * -39943077 && aq.bw == null) ? aq.ak(10, i6, iArr, i15, i14, i16, (short) -1857) : new hn(i5, 10, i6, i2, i3, i4, aq.av * -1769739243, true, null);
            if (ak != null) {
                bcVar.ag(i, i3, i4, i14, i9, i8, ak, 11 == i7 ? 256 : 0, az, i17);
            }
            if (aq.ao * -1334322195 != 0) {
                gsVar.ar(i3, i4, i9, i8, aq.ah, 2134860723);
            }
        } else if (i7 >= 12) {
            ak = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.ak(i7, i6, iArr, i15, i14, i16, (short) -21874) : new hn(i5, i7, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.ag(i, i3, i4, i14, 1, 1, ak, 0, az, i17);
            if (aq.ao * 1055028357 != 0) {
                gsVar.ar(i3, i4, i9, i8, aq.ah, 1436517272);
            }
        } else if (i7 == 0) {
            ak2 = (-1 == aq.av * -1520238458 && aq.bw == null) ? aq.ak(0, i6, iArr, i15, i14, i16, (short) -14101) : new hn(i5, 0, i6, i2, i3, i4, aq.av * -1651417379, true, null);
            bcVar.ak(i, i3, i4, i14, ak2, null, ao[i6], 0, az, i17);
            if (aq.ao * -1334322195 != 0) {
                gsVar.aq(i3, i4, i7, i6, aq.ah, 2131230813);
            }
        } else if (i7 == 1) {
            ak2 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.ak(1, i6, iArr, i15, i14, i16, (short) 2933) : new hn(i5, 1, i6, i2, i3, i4, aq.av * 493771860, true, null);
            bcVar.ak(i, i3, i4, i14, ak2, null, ah[i6], 0, az, i17);
            if (aq.ao * 589731840 != 0) {
                gsVar.aq(i3, i4, i7, i6, aq.ah, 2131230813);
            }
        } else if (2 == i7) {
            br ak5;
            int i18 = (i6 + 1) & 3;
            if (aq.av * -1646108180 == -1 && aq.bw == null) {
                ak = aq.ak(2, i6 + 4, iArr, i15, i14, i16, (short) -18365);
                ak5 = aq.ak(2, i18, iArr, i15, i14, i16, (short) -23582);
                ak2 = ak;
            } else {
                hnVar = new hn(i5, 2, i6 + 4, i2, i3, i4, aq.av * -660483530, true, null);
                ak5 = new hn(i5, 2, i18, i2, i3, i4, aq.av * -1410432705, true, null);
                ak2 = hnVar;
            }
            bcVar.ak(i, i3, i4, i14, ak2, ak5, ao[i6], ao[i18], az, i17);
            if (aq.ao * -1334322195 != 0) {
                gsVar.aq(i3, i4, i7, i6, aq.ah, 2131230813);
            }
        } else if (3 == i7) {
            ak2 = (-1 == aq.av * 192719316 && aq.bw == null) ? aq.ak(3, i6, iArr, i15, i14, i16, (short) -3687) : new hn(i5, 3, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.ak(i, i3, i4, i14, ak2, null, ah[i6], 0, az, i17);
            if (aq.ao * -1334322195 != 0) {
                gsVar.aq(i3, i4, i7, i6, aq.ah, 2131230813);
            }
        } else if (9 == i7) {
            ak = (aq.av * -436749369 == -1 && aq.bw == null) ? aq.ak(i7, i6, iArr, i15, i14, i16, (short) -9354) : new hn(i5, i7, i6, i2, i3, i4, aq.av * 294640113, true, null);
            bcVar.ag(i, i3, i4, i14, 1, 1, ak, 0, az, i17);
            if (aq.ao * -1334322195 != 0) {
                gsVar.ar(i3, i4, i9, i8, aq.ah, 1614509802);
            }
        } else if (4 == i7) {
            ak3 = (aq.av * 198827039 == -1 && aq.bw == null) ? aq.ak(4, i6, iArr, i15, i14, i16, (short) -31747) : new hn(i5, 4, i6, i2, i3, i4, aq.av * -406126692, true, null);
            bcVar.as(i, i3, i4, i14, ak3, null, ao[i6], 0, 0, 0, az, i17);
        } else if (i7 == 5) {
            bk = bcVar.bk(i, i3, i4);
            i8 = bk != 0 ? aj.aq(lr.au(bk), -339770867).at * -2141416535 : 16;
            ak3 = (aq.av * 69763956 == -1 && aq.bw == null) ? aq.ak(4, i6, iArr, i15, i14, i16, (short) -23274) : new hn(i5, 4, i6, i2, i3, i4, aq.av * 198827039, true, null);
            bcVar.as(i, i3, i4, i14, ak3, null, ao[i6], 0, i8 * af[i6], i8 * ay[i6], az, i17);
        } else if (6 == i7) {
            bk = bcVar.bk(i, i3, i4);
            i8 = 0 != bk ? (aj.aq(lr.au(bk), -1679825065).at * -664024581) / 2 : 8;
            ak3 = (aq.av * 107831184 == -1 && aq.bw == null) ? aq.ak(4, i6 + 4, iArr, i15, i14, i16, (short) -16947) : new hn(i5, 4, i6 + 4, i2, i3, i4, aq.av * -1877541218, true, null);
            bcVar.as(i, i3, i4, i14, ak3, null, -1248238685, i6, an[i6] * i8, i8 * ab[i6], az, i17);
        } else if (7 == i7) {
            int i19 = (i6 + 2) & 3;
            ak3 = (-1 == aq.av * 198827039 && aq.bw == null) ? aq.ak(4, i19 + 4, iArr, i15, i14, i16, (short) -24306) : new hn(i5, 4, i19 + 4, i2, i3, i4, aq.av * -1096537254, true, null);
            bcVar.as(i, i3, i4, i14, ak3, null, 256, i19, 0, 0, az, i17);
        } else if (8 == i7) {
            br ak6;
            bk = bcVar.bk(i, i3, i4);
            int i20 = 0 != bk ? (aj.aq(lr.au(bk), 1218116883).at * 684131604) / 2 : 8;
            i9 = (i6 + 2) & 3;
            if (aq.av * 198827039 == -1 && aq.bw == null) {
                ak3 = aq.ak(4, i6 + 4, iArr, i15, i14, i16, (short) -17234);
                ak6 = aq.ak(4, i9 + 4, iArr, i15, i14, i16, (short) -17234);
            } else {
                hnVar = new hn(i5, 4, i6 + 4, i2, i3, i4, aq.av * 1812514680, true, null);
                ak6 = new hn(i5, 4, i9 + 4, i2, i3, i4, aq.av * 1508795005, true, null);
                ak3 = hnVar;
            }
            bcVar.as(i, i3, i4, i14, ak3, ak6, 256, i6, an[i6] * i20, i20 * ab[i6], az, i17);
        }
    }

    static final void gn(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (cs.al(i, -2116636845)) {
                ir.gv(dt.ae[i], -1, i2, i3, i4, i5, i6, i7, -884010092);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("in.gn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
