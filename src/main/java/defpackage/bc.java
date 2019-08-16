package defpackage;

import android.support.v4.view.ViewCompat;
import java.lang.reflect.Array;

/* renamed from: bc */
public class bc {
    static int aa = 0;
    static int ab = 0;
    static int ac = 0;
    public static boolean ad = true;
    static int af = 0;
    static final int ag = 128;
    static int ah = 0;
    static int an = 0;
    static int ao = 0;
    static final int ap = 64;
    static int at = 0;
    static final int au = 25;
    static int av = 0;
    static int aw = 0;
    static int ax = 0;
    static int ay = 0;
    static final int az = 50;
    static int ba = 0;
    public static int bb = -1;
    static boolean bc = false;
    static boolean bd = false;
    static ay[] be = new ay[500];
    public static int bf = 0;
    static final int bg = 128;
    static final int[] bh = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
    public static int bi = -1;
    static fy bj = new fy();
    static int bk = 0;
    public static int bl = 0;
    static int bm = 0;
    static final int[] bn = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
    static int bo = 0;
    static final int[] bp = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
    static cj[] bq = new cj[100];
    static int br = 0;
    static int bs = 0;
    static final int[] bt = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
    static int[] bu = new int[bx];
    static final int bv = 32;
    static ay[][] bw = ((ay[][]) Array.newInstance(ay.class, new int[]{bx, 500}));
    static int bx = 4;
    static final int[] by = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
    static final int[] bz = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
    static int ca = 0;
    static int cc = 0;
    static boolean[][][][] ce = ((boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{8, 32, 51, 51}));
    static bw cj = null;
    static by cm = null;
    public static final int cn = 383;
    public static final int cp = 9;
    public static final int cq = 128;
    static int cr = 0;
    static int cs = 0;
    static int ct = 0;
    static final int[] cv = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
    public static final int cw = 32;
    static int cx;
    static boolean[][] cy;
    int ae = 0;
    bb[][][] ai;
    int[][][] aj;
    cj[] ak = new cj[5000];
    int al;
    int am = 0;
    int aq;
    int ar;
    int[][][] as;
    int[][] cb;
    int[][] ci;

    public bc(int i, int i2, int i3, int[][][] iArr) {
        int[] iArr2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0};
        this.ci = new int[][]{new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, new int[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, iArr2, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
        this.cb = new int[][]{new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new int[]{12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, new int[]{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, new int[]{3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
        this.aq = i;
        this.ar = i2;
        this.al = i3;
        this.ai = (bb[][][]) Array.newInstance(bb.class, new int[]{i, i2, i3});
        this.as = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{i, i2 + 1, i3 + 1});
        this.aj = iArr;
        ad();
    }

    public static void al(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ay ayVar = new ay();
        ayVar.ad = (i3 / 128) * 919001399;
        ayVar.aq = (i4 / 128) * 2111428213;
        ayVar.ar = (i5 / 128) * -780545373;
        ayVar.al = (i6 / 128) * -1745150389;
        ayVar.aj = -1080316117 * i2;
        ayVar.ai = -2143160427 * i3;
        ayVar.ae = 955836759 * i4;
        ayVar.am = 1150660807 * i5;
        ayVar.ak = 1837938241 * i6;
        ayVar.as = 97089311 * i7;
        ayVar.ag = -67330851 * i8;
        ay[] ayVarArr = bw[i];
        int[] iArr = bu;
        int i9 = iArr[i];
        iArr[i] = i9 + 1;
        ayVarArr[i9] = ayVar;
    }

    public static void bb(int[] iArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        cr = 0;
        ca = 0;
        cx = i3;
        ct = i4;
        cc = i3 / 2;
        cs = i4 / 2;
        boolean[][][][] zArr = (boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{iArr.length, 32, 53, 53});
        int i11 = 128;
        while (true) {
            i5 = i11;
            if (i5 > cn) {
                break;
            }
            i11 = 0;
            while (true) {
                i6 = i11;
                if (i6 >= 2048) {
                    break;
                }
                bk = bl.aa[i5];
                ba = bl.ao[i5];
                bs = bl.aa[i6];
                bm = bl.ao[i6];
                i7 = (i5 - 128) / 32;
                i8 = i6 / 64;
                i11 = -26;
                while (true) {
                    i9 = i11;
                    if (i9 >= 26) {
                        break;
                    }
                    i11 = -26;
                    while (true) {
                        i10 = i11;
                        if (i10 >= 26) {
                            break;
                        }
                        for (i11 = -i; i11 <= i2; i11 += 128) {
                            if (bc.bi(i9 * 128, iArr[i7] + i11, i10 * 128)) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        zArr[i7][i8][(i9 + 25) + 1][(i10 + 25) + 1] = z;
                        i11 = i10 + 1;
                    }
                    i11 = i9 + 1;
                }
                i11 = i6 + 64;
            }
            i11 = i5 + 32;
        }
        i11 = 0;
        while (true) {
            i10 = i11;
            if (i10 < 8) {
                i11 = 0;
                while (true) {
                    i9 = i11;
                    if (i9 >= 32) {
                        break;
                    }
                    i11 = -25;
                    while (true) {
                        i6 = i11;
                        if (i6 >= 25) {
                            break;
                        }
                        i11 = -25;
                        while (true) {
                            i5 = i11;
                            if (i5 >= 25) {
                                break;
                            }
                            for (i11 = -1; i11 <= 1; i11++) {
                                i7 = -1;
                                while (i7 <= 1) {
                                    int i12 = ((i6 + i11) + 25) + 1;
                                    int i13 = ((i5 + i7) + 25) + 1;
                                    if (!zArr[i10][i9][i12][i13]) {
                                        int i14 = (i9 + 1) % 31;
                                        if (!zArr[i10][i14][i12][i13]) {
                                            i8 = i10 + 1;
                                            if (!(zArr[i8][i9][i12][i13] || zArr[i8][i14][i12][i13])) {
                                                i7++;
                                            }
                                        }
                                    }
                                    z = true;
                                }
                            }
                            z = false;
                            ce[i10][i9][i6 + 25][i5 + 25] = z;
                            i11 = i5 + 1;
                        }
                        i11 = i6 + 1;
                    }
                    i11 = i9 + 1;
                }
                i11 = i10 + 1;
            } else {
                return;
            }
        }
    }

    public static boolean bg() {
        return bc && bb != -1;
    }

    static boolean bi(int i, int i2, int i3) {
        int i4 = bs;
        int i5 = bm;
        int i6 = ((bm * i3) - (bs * i)) >> 16;
        int i7 = ((bk * i2) + (ba * i6)) >> 16;
        int i8 = ba;
        int i9 = bk;
        if (i7 < 50 || i7 > 3500) {
            return false;
        }
        i4 = (((((i4 * i3) + (i5 * i)) >> 16) * 128) / i7) + cc;
        i5 = cs + (((((i8 * i2) - (i6 * i9)) >> 16) * 128) / i7);
        return i4 >= cr && i4 <= cx && i5 >= ca && i5 <= ct;
    }

    static boolean br(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 < i3 && i2 < i4 && i2 < i5) {
            return false;
        }
        if (i2 > i3 && i2 > i4 && i2 > i5) {
            return false;
        }
        if (i < i6 && i < i7 && i < i8) {
            return false;
        }
        if (i > i6 && i > i7 && i > i8) {
            return false;
        }
        int i9 = ((i2 - i3) * (i7 - i6)) - ((i - i6) * (i4 - i3));
        int i10 = ((i2 - i4) * (i8 - i7)) - ((i - i7) * (i5 - i4));
        int i11 = ((i2 - i5) * (i6 - i8)) - ((i - i8) * (i3 - i5));
        return i9 != 0 ? i9 < 0 ? i10 <= 0 && i11 <= 0 : i10 >= 0 && i11 >= 0 : i10 != 0 ? i10 < 0 ? i11 <= 0 : i11 >= 0 : true;
    }

    public static void bx() {
        bb = -1;
        bc = false;
    }

    public static void ci(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ay ayVar = new ay();
        ayVar.ad = (i3 / 128) * 919001399;
        ayVar.aq = (i4 / 128) * 2111428213;
        ayVar.ar = (i5 / 128) * -780545373;
        ayVar.al = (i6 / 128) * -1745150389;
        ayVar.aj = -1080316117 * i2;
        ayVar.ai = -2143160427 * i3;
        ayVar.ae = 955836759 * i4;
        ayVar.am = 1150660807 * i5;
        ayVar.ak = 1837938241 * i6;
        ayVar.as = 97089311 * i7;
        ayVar.ag = -67330851 * i8;
        ay[] ayVarArr = bw[i];
        int[] iArr = bu;
        int i9 = iArr[i];
        iArr[i] = i9 + 1;
        ayVarArr[i9] = ayVar;
    }

    public static boolean fe() {
        return bc && bb != -1;
    }

    static boolean fg(int i, int i2, int i3) {
        int i4 = bs;
        int i5 = bm;
        int i6 = ((bm * i3) - (bs * i)) >> 16;
        int i7 = ((bk * i2) + (ba * i6)) >> 16;
        int i8 = ba;
        int i9 = bk;
        if (i7 < 50 || i7 > 3500) {
            return false;
        }
        i4 = (((((i4 * i3) + (i5 * i)) >> 16) * 128) / i7) + cc;
        i5 = cs + (((((i8 * i2) - (i6 * i9)) >> 16) * 128) / i7);
        return i4 >= cr && i4 <= cx && i5 >= ca && i5 <= ct;
    }

    public static void fh(int[] iArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        cr = 0;
        ca = 0;
        cx = i3;
        ct = i4;
        cc = i3 / 2;
        cs = i4 / 2;
        boolean[][][][] zArr = (boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{iArr.length, 32, 53, 53});
        int i11 = 128;
        while (true) {
            i5 = i11;
            if (i5 > cn) {
                break;
            }
            i11 = 0;
            while (true) {
                i6 = i11;
                if (i6 >= 2048) {
                    break;
                }
                bk = bl.aa[i5];
                ba = bl.ao[i5];
                bs = bl.aa[i6];
                bm = bl.ao[i6];
                i7 = (i5 - 128) / 32;
                i8 = i6 / 64;
                i11 = -26;
                while (true) {
                    i9 = i11;
                    if (i9 >= 26) {
                        break;
                    }
                    i11 = -26;
                    while (true) {
                        i10 = i11;
                        if (i10 >= 26) {
                            break;
                        }
                        for (i11 = -i; i11 <= i2; i11 += 128) {
                            if (bc.bi(i9 * 128, iArr[i7] + i11, i10 * 128)) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        zArr[i7][i8][(i9 + 25) + 1][(i10 + 25) + 1] = z;
                        i11 = i10 + 1;
                    }
                    i11 = i9 + 1;
                }
                i11 = i6 + 64;
            }
            i11 = i5 + 32;
        }
        i11 = 0;
        while (true) {
            i10 = i11;
            if (i10 < 8) {
                i11 = 0;
                while (true) {
                    i9 = i11;
                    if (i9 >= 32) {
                        break;
                    }
                    i11 = -25;
                    while (true) {
                        i6 = i11;
                        if (i6 >= 25) {
                            break;
                        }
                        i11 = -25;
                        while (true) {
                            i5 = i11;
                            if (i5 >= 25) {
                                break;
                            }
                            for (i11 = -1; i11 <= 1; i11++) {
                                i7 = -1;
                                while (i7 <= 1) {
                                    int i12 = ((i6 + i11) + 25) + 1;
                                    int i13 = ((i5 + i7) + 25) + 1;
                                    if (!zArr[i10][i9][i12][i13]) {
                                        int i14 = (i9 + 1) % 31;
                                        if (!zArr[i10][i14][i12][i13]) {
                                            i8 = i10 + 1;
                                            if (!(zArr[i8][i9][i12][i13] || zArr[i8][i14][i12][i13])) {
                                                i7++;
                                            }
                                        }
                                    }
                                    z = true;
                                }
                            }
                            z = false;
                            ce[i10][i9][i6 + 25][i5 + 25] = z;
                            i11 = i5 + 1;
                        }
                        i11 = i6 + 1;
                    }
                    i11 = i9 + 1;
                }
                i11 = i10 + 1;
            } else {
                return;
            }
        }
    }

    static boolean fi(int i, int i2, int i3) {
        int i4 = bs;
        int i5 = bm;
        int i6 = ((bm * i3) - (bs * i)) >> 16;
        int i7 = ((bk * i2) + (ba * i6)) >> 16;
        int i8 = ba;
        int i9 = bk;
        if (i7 < 50 || i7 > 3500) {
            return false;
        }
        i4 = (((((i4 * i3) + (i5 * i)) >> 16) * 128) / i7) + cc;
        i5 = cs + (((((i8 * i2) - (i6 * i9)) >> 16) * 128) / i7);
        return i4 >= cr && i4 <= cx && i5 >= ca && i5 <= ct;
    }

    static boolean fj(int i, int i2, int i3) {
        int i4 = bs;
        int i5 = bm;
        int i6 = ((bm * i3) - (bs * i)) >> 16;
        int i7 = ((bk * i2) + (ba * i6)) >> 16;
        int i8 = ba;
        int i9 = bk;
        if (i7 < 993901405 || i7 > 3500) {
            return false;
        }
        i4 = (((((i4 * i3) + (i5 * i)) >> 16) * -1545577964) / i7) + cc;
        i5 = cs + (((((i8 * i2) - (i6 * i9)) >> 16) * 128) / i7);
        return i4 >= cr && i4 <= cx && i5 >= ca && i5 <= ct;
    }

    public static void fk() {
        bb = -1;
        bc = false;
    }

    public static void fl() {
        bb = -1;
        bc = false;
    }

    public static void fm(int[] iArr, int i, int i2, int i3, int i4) {
        cr = 0;
        ca = 0;
        cx = i3;
        ct = i4;
        cc = i3 / 2;
        cs = i4 / 2;
        boolean[][][][] zArr = (boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{iArr.length, -140879214, 53, -703847302});
        int i5 = -1649659837;
        while (true) {
            int i6 = i5;
            if (i6 > cn) {
                break;
            }
            for (int i7 = 0; i7 < 2048; i7 += 64) {
                bk = bl.aa[i6];
                ba = bl.ao[i6];
                bs = bl.aa[i7];
                bm = bl.ao[i7];
                i5 = (i6 - 128) / 800622591;
                i5 = i7 / 64;
                for (i5 = -1035826589; i5 < 26; i5++) {
                }
            }
            i5 = i6 + 32;
        }
        for (i5 = 0; i5 < 8; i5++) {
        }
    }

    public static boolean fo() {
        return bc && bb != -1;
    }

    public static boolean fp() {
        return bc && bb != -1;
    }

    public static void fs(int[] iArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        cr = 0;
        ca = 0;
        cx = i3;
        ct = i4;
        cc = i3 / 2;
        cs = i4 / 2;
        boolean[][][][] zArr = (boolean[][][][]) Array.newInstance(Boolean.TYPE, new int[]{iArr.length, 32, 53, 53});
        int i11 = 128;
        while (true) {
            i5 = i11;
            if (i5 > cn) {
                break;
            }
            i11 = 0;
            while (true) {
                i6 = i11;
                if (i6 >= 2048) {
                    break;
                }
                bk = bl.aa[i5];
                ba = bl.ao[i5];
                bs = bl.aa[i6];
                bm = bl.ao[i6];
                i7 = (i5 - 128) / 32;
                i8 = i6 / 64;
                i11 = -26;
                while (true) {
                    i9 = i11;
                    if (i9 >= 26) {
                        break;
                    }
                    i11 = -26;
                    while (true) {
                        i10 = i11;
                        if (i10 >= 26) {
                            break;
                        }
                        for (i11 = -i; i11 <= i2; i11 += 128) {
                            if (bc.bi(i9 * 128, iArr[i7] + i11, i10 * 128)) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        zArr[i7][i8][(i9 + 25) + 1][(i10 + 25) + 1] = z;
                        i11 = i10 + 1;
                    }
                    i11 = i9 + 1;
                }
                i11 = i6 + 64;
            }
            i11 = i5 + 32;
        }
        i11 = 0;
        while (true) {
            i10 = i11;
            if (i10 < 8) {
                i11 = 0;
                while (true) {
                    i9 = i11;
                    if (i9 >= 32) {
                        break;
                    }
                    i11 = -25;
                    while (true) {
                        i6 = i11;
                        if (i6 >= 25) {
                            break;
                        }
                        i11 = -25;
                        while (true) {
                            i5 = i11;
                            if (i5 >= 25) {
                                break;
                            }
                            for (i11 = -1; i11 <= 1; i11++) {
                                i7 = -1;
                                while (i7 <= 1) {
                                    int i12 = ((i6 + i11) + 25) + 1;
                                    int i13 = ((i5 + i7) + 25) + 1;
                                    if (!zArr[i10][i9][i12][i13]) {
                                        int i14 = (i9 + 1) % 31;
                                        if (!zArr[i10][i14][i12][i13]) {
                                            i8 = i10 + 1;
                                            if (!(zArr[i8][i9][i12][i13] || zArr[i8][i14][i12][i13])) {
                                                i7++;
                                            }
                                        }
                                    }
                                    z = true;
                                }
                            }
                            z = false;
                            ce[i10][i9][i6 + 25][i5 + 25] = z;
                            i11 = i5 + 1;
                        }
                        i11 = i6 + 1;
                    }
                    i11 = i9 + 1;
                }
                i11 = i10 + 1;
            } else {
                return;
            }
        }
    }

    public static void gc() {
        bb = -1;
        bc = false;
    }

    static boolean gh(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 < i3 && i2 < i4 && i2 < i5) {
            return false;
        }
        if (i2 > i3 && i2 > i4 && i2 > i5) {
            return false;
        }
        if (i < i6 && i < i7 && i < i8) {
            return false;
        }
        if (i > i6 && i > i7 && i > i8) {
            return false;
        }
        int i9 = ((i2 - i3) * (i7 - i6)) - ((i - i6) * (i4 - i3));
        int i10 = ((i2 - i4) * (i8 - i7)) - ((i - i7) * (i5 - i4));
        int i11 = ((i2 - i5) * (i6 - i8)) - ((i - i8) * (i3 - i5));
        return i9 != 0 ? i9 < 0 ? i10 <= 0 && i11 <= 0 : i10 >= 0 && i11 >= 0 : i10 != 0 ? i10 < 0 ? i11 <= 0 : i11 >= 0 : true;
    }

    static boolean gi(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 < i3 && i2 < i4 && i2 < i5) {
            return false;
        }
        if (i2 > i3 && i2 > i4 && i2 > i5) {
            return false;
        }
        if (i < i6 && i < i7 && i < i8) {
            return false;
        }
        if (i > i6 && i > i7 && i > i8) {
            return false;
        }
        int i9 = ((i2 - i3) * (i7 - i6)) - ((i - i6) * (i4 - i3));
        int i10 = ((i2 - i4) * (i8 - i7)) - ((i - i7) * (i5 - i4));
        int i11 = ((i2 - i5) * (i6 - i8)) - ((i - i8) * (i3 - i5));
        return i9 != 0 ? i9 < 0 ? i10 <= 0 && i11 <= 0 : i10 >= 0 && i11 >= 0 : i10 != 0 ? i10 < 0 ? i11 <= 0 : i11 >= 0 : true;
    }

    static boolean gn(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 < i3 && i2 < i4 && i2 < i5) {
            return false;
        }
        if (i2 > i3 && i2 > i4 && i2 > i5) {
            return false;
        }
        if (i < i6 && i < i7 && i < i8) {
            return false;
        }
        if (i > i6 && i > i7 && i > i8) {
            return false;
        }
        int i9 = ((i2 - i3) * (i7 - i6)) - ((i - i6) * (i4 - i3));
        int i10 = ((i2 - i4) * (i8 - i7)) - ((i - i7) * (i5 - i4));
        int i11 = ((i2 - i5) * (i6 - i8)) - ((i - i8) * (i3 - i5));
        return i9 != 0 ? i9 < 0 ? i10 <= 0 && i11 <= 0 : i10 >= 0 && i11 >= 0 : i10 != 0 ? i10 < 0 ? i11 <= 0 : i11 >= 0 : true;
    }

    public void aa(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.ae = null;
        }
    }

    public bq ab(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return bbVar == null ? null : bbVar.am;
    }

    public void ac(int i, int i2, int i3, int i4) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bq bqVar = bbVar.am;
            if (bqVar != null) {
                bqVar.ai = (((bqVar.ai * 239961307) * i4) / 16) * -1543579821;
                bqVar.ae = (((bqVar.ae * -1713161321) * i4) / 16) * -35982297;
            }
        }
    }

    public void ad() {
        int i;
        int i2;
        int i3 = 0;
        for (i = 0; i < this.aq; i++) {
            for (i2 = 0; i2 < this.ar; i2++) {
                for (int i4 = 0; i4 < this.al; i4++) {
                    this.ai[i][i2][i4] = null;
                }
            }
        }
        for (i = 0; i < bx; i++) {
            for (i2 = 0; i2 < bu[i]; i2++) {
                bw[i][i2] = null;
            }
            bu[i] = 0;
        }
        for (i = 0; i < this.am; i++) {
            this.ak[i] = null;
        }
        this.am = 0;
        while (i3 < bq.length) {
            bq[i3] = null;
            i3++;
        }
    }

    public void ae(int i, int i2, int i3, int i4, br brVar, long j, int i5) {
        if (brVar != null) {
            bh bhVar = new bh();
            bhVar.al = brVar;
            bhVar.aq = (179832704 * i2) - 2057567296;
            bhVar.ar = (-277396096 * i3) + 2008785600;
            bhVar.ad = -907283143 * i4;
            bhVar.aj = 4105961552768114081L * j;
            bhVar.ai = -191196863 * i5;
            if (this.ai[i][i2][i3] == null) {
                this.ai[i][i2][i3] = new bb(i, i2, i3);
            }
            this.ai[i][i2][i3].ak = bhVar;
        }
    }

    public void af(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.ak = null;
        }
    }

    public boolean ag(int i, int i2, int i3, int i4, int i5, int i6, br brVar, int i7, long j, int i8) {
        if (brVar == null) {
            return true;
        }
        return az(i, i2, i3, i5, i6, (i2 * 128) + (i5 * 64), (i3 * 128) + (i6 * 64), i4, brVar, i7, false, j, i8);
    }

    public void ah(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            for (int i4 = 0; i4 < bbVar.ag * 1744025137; i4++) {
                cj cjVar = bbVar.ap[i4];
                if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i2 && cjVar.ak * 2076633559 == i3) {
                    aw(cjVar);
                    return;
                }
            }
        }
    }

    public void ai(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        av avVar;
        int i21;
        if (i4 == 0) {
            avVar = new av(i11, i12, i13, i14, -1, i19, false);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ai[i21][i2][i3] == null) {
                    this.ai[i21][i2][i3] = new bb(i21, i2, i3);
                }
            }
            this.ai[i][i2][i3].aj = avVar;
            return;
        }
        boolean z = true;
        if (i4 == 1) {
            if (!(i7 == i8 && i7 == i9 && i7 == i10)) {
                z = false;
            }
            avVar = new av(i15, i16, i17, i18, i6, i20, z);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ai[i21][i2][i3] == null) {
                    this.ai[i21][i2][i3] = new bb(i21, i2, i3);
                }
            }
            this.ai[i][i2][i3].aj = avVar;
            return;
        }
        bs bsVar = new bs(i4, i5, i6, i2, i3, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20);
        for (i21 = i; i21 >= 0; i21--) {
            if (this.ai[i21][i2][i3] == null) {
                this.ai[i21][i2][i3] = new bb(i21, i2, i3);
            }
        }
        this.ai[i][i2][i3].ai = bsVar;
    }

    public void aj(int i, int i2, int i3, int i4) {
        if (this.ai[i][i2][i3] != null) {
            this.ai[i][i2][i3].ax = 679157751 * i4;
        }
    }

    public void ak(int i, int i2, int i3, int i4, br brVar, br brVar2, int i5, int i6, long j, int i7) {
        if (brVar != null || brVar2 != null) {
            bm bmVar = new bm();
            bmVar.am = 5826360528745369325L * j;
            bmVar.ak = -331211547 * i7;
            bmVar.aq = (-501550720 * i2) + 1896708288;
            bmVar.ar = (298499456 * i3) + 149249728;
            bmVar.ad = 1970038125 * i4;
            bmVar.ai = brVar;
            bmVar.ae = brVar2;
            bmVar.al = 735746809 * i5;
            bmVar.aj = 2139257839 * i6;
            for (int i8 = i; i8 >= 0; i8--) {
                if (this.ai[i8][i2][i3] == null) {
                    this.ai[i8][i2][i3] = new bb(i8, i2, i3);
                }
            }
            this.ai[i][i2][i3].ae = bmVar;
        }
    }

    public void am(int i, int i2, int i3, int i4, br brVar, long j, br brVar2, br brVar3) {
        ab abVar = new ab();
        abVar.al = brVar;
        abVar.aq = (-1538870656 * i2) + 1378048320;
        abVar.ar = (-222803840 * i3) + 2036081728;
        abVar.ad = 1853747099 * i4;
        abVar.ae = -3125052279042097579L * j;
        abVar.aj = brVar2;
        abVar.ai = brVar3;
        bb bbVar = this.ai[i][i2][i3];
        int i5 = 0;
        if (bbVar != null) {
            i5 = 0;
            int i6 = 0;
            while (i6 < bbVar.ag * 1744025137) {
                int i7;
                if (((bbVar.ap[i6].az * -393609465) & 256) == 256 && (bbVar.ap[i6].aj instanceof bp)) {
                    bp bpVar = (bp) bbVar.ap[i6].aj;
                    bpVar.ai();
                    if (bpVar.bx * -1736982785 > i5) {
                        i7 = bpVar.bx * -1736982785;
                        i6++;
                        i5 = i7;
                    }
                }
                i7 = i5;
                i6++;
                i5 = i7;
            }
        }
        abVar.am = 854022763 * i5;
        if (this.ai[i][i2][i3] == null) {
            this.ai[i][i2][i3] = new bb(i, i2, i3);
        }
        this.ai[i][i2][i3].as = abVar;
    }

    public bm an(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return bbVar == null ? null : bbVar.ae;
    }

    public void ao(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.am = null;
        }
    }

    public boolean ap(int i, int i2, int i3, int i4, int i5, br brVar, int i6, long j, boolean z) {
        if (brVar == null) {
            return true;
        }
        int i7;
        int i8;
        int i9 = i2 - i5;
        int i10 = i3 - i5;
        int i11 = i2 + i5;
        int i12 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i12 += 128;
            }
            if (i6 > 1152 && i6 < 1920) {
                i11 += 128;
            }
            if (i6 > 1664 || i6 < 384) {
                i10 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i9 -= 128;
                i7 = i12;
                i8 = i11;
                i12 = i9 / 128;
                i11 = i10 / 128;
                return az(i, i12, i11, ((i8 / 128) - i12) + 1, ((i7 / 128) - i11) + 1, i2, i3, i4, brVar, i6, true, j, 0);
            }
        }
        i7 = i12;
        i8 = i11;
        i12 = i9 / 128;
        i11 = i10 / 128;
        return az(i, i12, i11, ((i8 / 128) - i12) + 1, ((i7 / 128) - i11) + 1, i2, i3, i4, brVar, i6, true, j, 0);
    }

    public void aq(int i) {
        this.ae = i;
        for (int i2 = 0; i2 < this.ar; i2++) {
            for (int i3 = 0; i3 < this.al; i3++) {
                if (this.ai[i][i2][i3] == null) {
                    this.ai[i][i2][i3] = new bb(i, i2, i3);
                }
            }
        }
    }

    public void ar(int i, int i2) {
        bb bbVar = this.ai[0][i][i2];
        int i3 = 0;
        while (i3 < 3) {
            bb[] bbVarArr = this.ai[i3][i];
            int i4 = i3 + 1;
            bb bbVar2 = this.ai[i4][i][i2];
            bbVarArr[i2] = bbVar2;
            if (bbVar2 != null) {
                bbVar2.ad += 1353652805;
                for (i3 = 0; i3 < bbVar2.ag * 1744025137; i3++) {
                    cj cjVar = bbVar2.ap[i3];
                    if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i && cjVar.ak * 2076633559 == i2) {
                        cjVar.ad -= 1455945163;
                    }
                }
            }
            i3 = i4;
        }
        if (this.ai[0][i][i2] == null) {
            this.ai[0][i][i2] = new bb(0, i, i2);
        }
        this.ai[0][i][i2].an = bbVar;
        this.ai[3][i][i2] = null;
    }

    public void as(int i, int i2, int i3, int i4, br brVar, br brVar2, int i5, int i6, int i7, int i8, long j, int i9) {
        if (brVar != null) {
            bq bqVar = new bq();
            bqVar.as = -8152327660955743721L * j;
            bqVar.ag = 394198241 * i9;
            bqVar.aq = (-218820736 * i2) - 109410368;
            bqVar.ar = (-1213427328 * i3) - 606713664;
            bqVar.ad = -2022629383 * i4;
            bqVar.am = brVar;
            bqVar.ak = brVar2;
            bqVar.al = 1209599043 * i5;
            bqVar.aj = -907386935 * i6;
            bqVar.ai = -1543579821 * i7;
            bqVar.ae = -35982297 * i8;
            for (int i10 = i; i10 >= 0; i10--) {
                if (this.ai[i10][i2][i3] == null) {
                    this.ai[i10][i2][i3] = new bb(i10, i2, i3);
                }
            }
            this.ai[i][i2][i3].am = bqVar;
        }
    }

    public bh at(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.ak == null) ? null : bbVar.ak;
    }

    public boolean au(int i, int i2, int i3, int i4, int i5, br brVar, int i6, long j, int i7, int i8, int i9, int i10) {
        if (brVar == null) {
            return true;
        }
        return az(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, brVar, i6, true, j, 0);
    }

    public cj av(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar == null) {
            return null;
        }
        for (int i4 = 0; i4 < bbVar.ag * 1744025137; i4++) {
            cj cjVar = bbVar.ap[i4];
            if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i2 && cjVar.ak * 2076633559 == i3) {
                return cjVar;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d A:{LOOP_END, LOOP:4: B:19:0x0068->B:21:0x006d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void aw(cj cjVar) {
        for (int i = cjVar.ae * -1865206717; i <= cjVar.am * 1001322405; i++) {
            for (int i2 = cjVar.ak * 2076633559; i2 <= cjVar.as * -1105506265; i2++) {
                bb bbVar = this.ai[cjVar.ad * -1546024989][i][i2];
                if (bbVar != null) {
                    int i3 = 0;
                    while (i3 < bbVar.ag * 1744025137) {
                        if (bbVar.ap[i3] == cjVar) {
                            bbVar.ag -= 1426186961;
                            while (i3 < bbVar.ag * 1744025137) {
                                int i4 = i3 + 1;
                                bbVar.ap[i3] = bbVar.ap[i4];
                                bbVar.au[i3] = bbVar.au[i4];
                                i3 = i4;
                            }
                            bbVar.ap[bbVar.ag * 1744025137] = null;
                            bbVar.az = 0;
                            for (i3 = 0; i3 < bbVar.ag * 1744025137; i3++) {
                                bbVar.az = ((bbVar.az * -1642971931) | bbVar.au[i3]) * 1684873453;
                            }
                        } else {
                            i3++;
                        }
                    }
                    bbVar.az = 0;
                    while (i3 < bbVar.ag * 1744025137) {
                    }
                }
            }
        }
    }

    public void ax() {
        for (int i = 0; i < this.am; i++) {
            aw(this.ak[i]);
            this.ak[i] = null;
        }
        this.am = 0;
    }

    public void ay(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.as = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean az(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, br brVar, int i9, boolean z, long j, int i10) {
        int i11 = i2;
        loop0:
        while (true) {
            int i12 = i2 + i4;
            int i13;
            bb bbVar;
            if (i11 < i12) {
                i13 = i3;
                while (i13 < i3 + i5) {
                    if (i11 >= 0 && i13 >= 0 && i11 < this.ar) {
                        if (i13 >= this.al) {
                            return false;
                        }
                        bbVar = this.ai[i][i11][i13];
                        if (bbVar != null && bbVar.ag * 1744025137 >= 5) {
                            return false;
                        }
                        i13++;
                    }
                }
                i11++;
            } else {
                cj cjVar = new cj();
                cjVar.au = 4491614666738664103L * j;
                cjVar.az = -1661911369 * i10;
                cjVar.ad = 1455945163 * i;
                cjVar.ar = -1409386065 * i6;
                cjVar.al = 152909799 * i7;
                cjVar.aq = -1502166075 * i8;
                cjVar.aj = brVar;
                cjVar.ai = -497565757 * i9;
                cjVar.ae = -1759266709 * i2;
                cjVar.ak = 1864047079 * i3;
                int i14 = i12 - 1;
                cjVar.am = 1748703277 * i14;
                int i15 = i3 + i5;
                int i16 = i15 - 1;
                cjVar.as = 632889239 * i16;
                i11 = i2;
                while (i11 < i12) {
                    for (int i17 = i3; i17 < i15; i17++) {
                        i13 = i11 > i2 ? 1 : 0;
                        if (i11 < i14) {
                            i13 += 4;
                        }
                        if (i17 > i3) {
                            i13 += 8;
                        }
                        if (i17 < i16) {
                            i13 += 2;
                        }
                        for (int i18 = i; i18 >= 0; i18--) {
                            if (this.ai[i18][i11][i17] == null) {
                                this.ai[i18][i11][i17] = new bb(i18, i11, i17);
                            }
                        }
                        bbVar = this.ai[i][i11][i17];
                        bbVar.ap[bbVar.ag * 1744025137] = cjVar;
                        bbVar.au[bbVar.ag * 1744025137] = i13;
                        bbVar.az = (i13 | (bbVar.az * -1642971931)) * 1684873453;
                        bbVar.ag += 1426186961;
                    }
                    i11++;
                }
                if (z) {
                    cj[] cjVarArr = this.ak;
                    i11 = this.am;
                    this.am = i11 + 1;
                    cjVarArr[i11] = cjVar;
                }
                return true;
            }
        }
        return false;
    }

    public long ba(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.am == null) ? 0 : bbVar.am.as * 8643948037242326439L;
    }

    public void bc(int i, int i2, int i3, boolean z) {
        if (!bc.bg() || z) {
            bd = true;
            bc = z;
            bo = i;
            bl = i2;
            bf = i3;
            bb = -1;
            bi = -1;
        }
    }

    public void bd(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aq; i4++) {
            for (int i5 = 0; i5 < this.ar; i5++) {
                for (int i6 = 0; i6 < this.al; i6++) {
                    bb bbVar = this.ai[i4][i5][i6];
                    if (bbVar != null) {
                        bo boVar;
                        bm bmVar = bbVar.ae;
                        if (bmVar != null && (bmVar.ai instanceof bo)) {
                            boVar = (bo) bmVar.ai;
                            bl(boVar, i4, i5, i6, 1, 1);
                            if (bmVar.ae instanceof bo) {
                                bo boVar2 = (bo) bmVar.ae;
                                bl(boVar2, i4, i5, i6, 1, 1);
                                bo.ah(boVar, boVar2, 0, 0, 0, false);
                                bmVar.ae = boVar2.af(boVar2.ba, boVar2.bs, i, i2, i3);
                            }
                            bmVar.ai = boVar.af(boVar.ba, boVar.bs, i, i2, i3);
                        }
                        int i7 = 0;
                        while (true) {
                            int i8 = i7;
                            if (i8 >= bbVar.ag * 1744025137) {
                                break;
                            }
                            cj cjVar = bbVar.ap[i8];
                            if (cjVar != null && (cjVar.aj instanceof bo)) {
                                boVar = (bo) cjVar.aj;
                                bl(boVar, i4, i5, i6, ((cjVar.am * 1001322405) - (cjVar.ae * -1865206717)) + 1, ((cjVar.as * -1105506265) - (cjVar.ak * 2076633559)) + 1);
                                cjVar.aj = boVar.af(boVar.ba, boVar.bs, i, i2, i3);
                            }
                            i7 = i8 + 1;
                        }
                        bh bhVar = bbVar.ak;
                        if (bhVar != null && (bhVar.al instanceof bo)) {
                            bo boVar3 = (bo) bhVar.al;
                            bo(boVar3, i4, i5, i6);
                            bhVar.al = boVar3.af(boVar3.ba, boVar3.bs, i, i2, i3);
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void be() {
        int i = bu[aw];
        ay[] ayVarArr = bw[aw];
        br = 0;
        for (int i2 = 0; i2 < i; i2++) {
            ay ayVar = ayVarArr[i2];
            int i3 = 50;
            int i4;
            int i5;
            int i6;
            Object obj;
            ay[] ayVarArr2;
            int i7;
            if (ayVar.aj * -1551263869 == 1) {
                i4 = ((ayVar.ad * -576574329) - ay) + 25;
                if (i4 >= 0 && i4 <= 50) {
                    i5 = ((ayVar.ar * -1515294453) - an) + 25;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i6 = ((ayVar.al * 1018706787) - an) + 25;
                    if (i6 <= 50) {
                        i3 = i6;
                    }
                    while (i5 <= i3) {
                        if (cy[i4][i5]) {
                            obj = 1;
                            break;
                        }
                        i5++;
                    }
                    obj = null;
                    if (obj != null) {
                        i5 = ab - (ayVar.ai * -678323267);
                        if (i5 > 32) {
                            ayVar.ap = 867610651;
                        } else if (i5 < -32) {
                            ayVar.ap = 1735221302;
                            i5 = -i5;
                        }
                        ayVar.ax = ((((ayVar.am * -1454763785) - at) << 8) / i5) * -814992125;
                        ayVar.aw = ((((ayVar.ak * 101603777) - at) << 8) / i5) * -1956336467;
                        ayVar.ac = ((((ayVar.as * -477936417) - av) << 8) / i5) * 993519935;
                        ayVar.aa = ((((ayVar.ag * -2139808907) - av) << 8) / i5) * -1817944301;
                        ayVarArr2 = be;
                        i7 = br;
                        br = i7 + 1;
                        ayVarArr2[i7] = ayVar;
                    }
                }
            } else if (ayVar.aj * -1551263869 == 2) {
                i6 = ((ayVar.ar * -1515294453) - an) + 25;
                if (i6 >= 0 && i6 <= 50) {
                    i5 = ((ayVar.ad * -576574329) - ay) + 25;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i7 = ((ayVar.aq * 2035337693) - ay) + 25;
                    if (i7 <= 50) {
                        i3 = i7;
                    }
                    while (i5 <= i3) {
                        if (cy[i5][i6]) {
                            obj = 1;
                            break;
                        }
                        i5++;
                    }
                    obj = null;
                    if (obj != null) {
                        i5 = at - (ayVar.am * -1454763785);
                        if (i5 > 32) {
                            ayVar.ap = -1692135343;
                        } else if (i5 < -32) {
                            ayVar.ap = -824524692;
                            i5 = -i5;
                        }
                        ayVar.au = ((((ayVar.ai * -678323267) - ab) << 8) / i5) * -1150964081;
                        ayVar.az = ((((ayVar.ae * 1457394279) - ab) << 8) / i5) * -1642138067;
                        ayVar.ac = ((((ayVar.as * -477936417) - av) << 8) / i5) * 993519935;
                        ayVar.aa = ((((ayVar.ag * -2139808907) - av) << 8) / i5) * -1817944301;
                        ayVarArr2 = be;
                        i7 = br;
                        br = i7 + 1;
                        ayVarArr2[i7] = ayVar;
                    }
                }
            } else if (ayVar.aj * -1551263869 == 4) {
                int i8 = (ayVar.as * -477936417) - av;
                if (i8 > 128) {
                    i5 = ((ayVar.ar * -1515294453) - an) + 25;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i7 = ((ayVar.al * 1018706787) - an) + 25;
                    int i9 = i7 > 50 ? 50 : i7;
                    if (i5 <= i9) {
                        i7 = ((ayVar.ad * -576574329) - ay) + 25;
                        if (i7 < 0) {
                            i7 = 0;
                        }
                        i4 = ((ayVar.aq * 2035337693) - ay) + 25;
                        if (i4 > 50) {
                            i6 = i7;
                        } else {
                            i6 = i7;
                            i3 = i4;
                        }
                        while (i6 <= i3) {
                            for (i7 = i5; i7 <= i9; i7++) {
                                if (cy[i6][i7]) {
                                    obj = 1;
                                    break;
                                }
                            }
                            i6++;
                        }
                        obj = null;
                        if (obj != null) {
                            ayVar.ap = 43085959;
                            ayVar.au = ((((ayVar.ai * -678323267) - ab) << 8) / i8) * -1150964081;
                            ayVar.az = ((((ayVar.ae * 1457394279) - ab) << 8) / i8) * -1642138067;
                            ayVar.ax = ((((ayVar.am * -1454763785) - at) << 8) / i8) * -814992125;
                            ayVar.aw = ((((ayVar.ak * 101603777) - at) << 8) / i8) * -1956336467;
                            ayVarArr2 = be;
                            i7 = br;
                            br = i7 + 1;
                            ayVarArr2[i7] = ayVar;
                        }
                    }
                }
            }
        }
    }

    public void bf(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        bb bbVar = this.ai[i3][i4][i5];
        if (bbVar != null) {
            av avVar = bbVar.aj;
            int i7;
            if (avVar != null) {
                i7 = avVar.ae * -2093583885;
                if (i7 != 0) {
                    while (i6 < 4) {
                        iArr[i] = i7;
                        iArr[i + 1] = i7;
                        iArr[i + 2] = i7;
                        iArr[i + 3] = i7;
                        i += i2;
                        i6++;
                    }
                    return;
                }
                return;
            }
            bs bsVar = bbVar.ai;
            if (bsVar != null) {
                int i8 = bsVar.ap;
                int i9 = bsVar.au;
                int i10 = bsVar.az;
                int i11 = bsVar.ax;
                int[] iArr2 = this.ci[i8];
                int[] iArr3 = this.cb[i9];
                if ((ViewCompat.MEASURED_SIZE_MASK & i10) != 0) {
                    i7 = 0;
                    i8 = 0;
                    while (i8 < 4) {
                        i6 = i7 + 1;
                        iArr[i] = iArr2[iArr3[i7]] == 0 ? i10 : i11;
                        int i12 = i6 + 1;
                        iArr[i + 1] = iArr2[iArr3[i6]] == 0 ? i10 : i11;
                        i6 = i12 + 1;
                        iArr[i + 2] = iArr2[iArr3[i12]] == 0 ? i10 : i11;
                        iArr[i + 3] = iArr2[iArr3[i6]] == 0 ? i10 : i11;
                        i += i2;
                        i8++;
                        i7 = i6 + 1;
                    }
                    return;
                }
                i7 = 0;
                for (i10 = 0; i10 < 4; i10++) {
                    i6 = i7 + 1;
                    if (iArr2[iArr3[i7]] != 0) {
                        iArr[i] = i11;
                    }
                    i7 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 1] = i11;
                    }
                    i6 = i7 + 1;
                    if (iArr2[iArr3[i7]] != 0) {
                        iArr[i + 2] = i11;
                    }
                    i7 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 3] = i11;
                    }
                    i += i2;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bh(int i, int i2, int i3, int i4) {
        if (!bj(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        int i7 = this.aj[i][i2][i3] - 1;
        int i8 = i7 - 120;
        int i9 = i7 - 230;
        if (i4 < 16) {
            if (i4 == 1) {
                return (i5 <= ab || (bz(i5, i7, i6) && bz(i5, i7, i6 + 128))) ? (i <= 0 || (bz(i5, i8, i6) && bz(i5, i8, i6 + 128))) && bz(i5, i9, i6) && bz(i5, i9, i6 + 128) : false;
            } else {
                int i10;
                if (i4 == 2) {
                    if (i6 < at) {
                        i10 = i6 + 128;
                        if (!(bz(i5, i7, i10) && bz(i5 + 128, i7, i10))) {
                            return false;
                        }
                    }
                    if (i > 0) {
                        i7 = i6 + 128;
                        if (!(bz(i5, i8, i7) && bz(i5 + 128, i8, i7))) {
                            return false;
                        }
                    }
                    i6 += 128;
                    return bz(i5, i9, i6) && bz(i5 + 128, i9, i6);
                } else if (i4 == 4) {
                    if (i5 < ab) {
                        i10 = i5 + 128;
                        if (!(bz(i10, i7, i6) && bz(i10, i7, i6 + 128))) {
                            return false;
                        }
                    }
                    if (i > 0) {
                        i7 = i5 + 128;
                        if (!(bz(i7, i8, i6) && bz(i7, i8, i6 + 128))) {
                            return false;
                        }
                    }
                    i5 += 128;
                    return bz(i5, i9, i6) && bz(i5, i9, i6 + 128);
                } else if (i4 == 8) {
                    return (i6 <= at || (bz(i5, i7, i6) && bz(i5 + 128, i7, i6))) ? (i <= 0 || (bz(i5, i8, i6) && bz(i5 + 128, i8, i6))) && bz(i5, i9, i6) && bz(i5 + 128, i9, i6) : false;
                }
            }
        }
        return bz(i5 + 64, i7 + -238, i6 + 64) ? i4 == 16 ? bz(i5, i9, i6 + 128) : i4 == 32 ? bz(i5 + 128, i9, i6 + 128) : i4 == 64 ? bz(i5 + 128, i9, i6) : i4 == 128 ? bz(i5, i9, i6) : true : false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bj(int i, int i2, int i3) {
        int i4 = this.as[i][i2][i3];
        if (i4 == (-ac)) {
            return false;
        }
        if (i4 == ac) {
            return true;
        }
        i4 = i2 << 7;
        int i5 = i3 << 7;
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        if (bz(i6, this.aj[i][i2][i3], i7)) {
            i4 = (i4 + 128) - 1;
            int i8 = i2 + 1;
            if (bz(i4, this.aj[i][i8][i3], i7)) {
                i7 = i3 + 1;
                i5 = (i5 + 128) - 1;
                if (bz(i4, this.aj[i][i8][i7], i5) && bz(i6, this.aj[i][i2][i7], i5)) {
                    this.as[i][i2][i3] = ac;
                    return true;
                }
            }
        }
        this.as[i][i2][i3] = -ac;
        return false;
    }

    public long bk(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.ae == null) ? 0 : bbVar.ae.am * 481275275846680293L;
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(bo boVar, int i, int i2, int i3, int i4, int i5) {
        int i6 = i2 + i4;
        int i7 = i3 + i5;
        boolean z = true;
        int i8 = i;
        int i9 = i2;
        while (i8 <= i + 1) {
            int i10;
            if (i8 == this.aq) {
                i10 = i9;
            } else {
                int i11 = i9;
                while (i11 <= i6) {
                    if (i11 >= 0 && i11 < this.ar) {
                        int i12 = i3 - 1;
                        while (i12 <= i7) {
                            if (i12 >= 0 && i12 < this.al && (!z || i11 >= i6 || i12 >= i7 || (i12 < i3 && i11 != i2))) {
                                bb bbVar = this.ai[i8][i11][i12];
                                if (bbVar != null) {
                                    int i13 = i11 + 1;
                                    int i14 = i12 + 1;
                                    int i15 = i2 + 1;
                                    int i16 = i3 + 1;
                                    i15 = ((((this.aj[i8][i11][i12] + this.aj[i8][i13][i12]) + this.aj[i8][i11][i14]) + this.aj[i8][i13][i14]) / 4) - ((((this.aj[i][i2][i3] + this.aj[i][i15][i3]) + this.aj[i][i2][i16]) + this.aj[i][i15][i16]) / 4);
                                    bm bmVar = bbVar.ae;
                                    if (bmVar != null) {
                                        bo boVar2;
                                        if (bmVar.ai instanceof bo) {
                                            boVar2 = boVar;
                                            bo.ah(boVar2, (bo) bmVar.ai, ((1 - i4) * 64) + ((i11 - i2) * 128), i15, ((1 - i5) * 64) + ((i12 - i3) * 128), z);
                                        }
                                        if (bmVar.ae instanceof bo) {
                                            boVar2 = boVar;
                                            bo.ah(boVar2, (bo) bmVar.ae, ((1 - i4) * 64) + ((i11 - i2) * 128), i15, ((1 - i5) * 64) + ((i12 - i3) * 128), z);
                                        }
                                    }
                                    i10 = 0;
                                    while (true) {
                                        i16 = i10;
                                        if (i16 >= bbVar.ag * 1744025137) {
                                            break;
                                        }
                                        cj cjVar = bbVar.ap[i16];
                                        if (cjVar != null && (cjVar.aj instanceof bo)) {
                                            bo boVar3 = (bo) cjVar.aj;
                                            i13 = cjVar.am;
                                            i14 = cjVar.ae;
                                            bo.ah(boVar, boVar3, (((((i13 * 1001322405) - (i14 * -1865206717)) + 1) - i4) * 64) + (((cjVar.ae * -1865206717) - i2) * 128), i15, (((((-1105506265 * cjVar.as) - (2076633559 * cjVar.ak)) + 1) - i5) * 64) + (((cjVar.ak * 2076633559) - i3) * 128), z);
                                        }
                                        i10 = i16 + 1;
                                    }
                                }
                            }
                            i12++;
                        }
                    }
                    i11++;
                    i6 = i6;
                }
                i10 = i9 - 1;
                z = false;
            }
            i8++;
            i9 = i10;
        }
    }

    public long bm(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.ak == null) ? 0 : bbVar.ak.aj * -6633027865852279199L;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bn(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        if (i2 != i3 || i4 != i5) {
            for (i7 = i2; i7 <= i3; i7++) {
                for (i8 = i4; i8 <= i5; i8++) {
                    if (this.as[i][i7][i8] == (-ac)) {
                        return false;
                    }
                }
            }
            i8 = (i2 << 7) + 1;
            i7 = (i4 << 7) + 2;
            i9 = this.aj[i][i2][i4] - i6;
            if (!bz(i8, i9, i7)) {
                return false;
            }
            int i10 = (i3 << 7) - 1;
            if (!bz(i10, i9, i7)) {
                return false;
            }
            i7 = (i5 << 7) - 1;
            return bz(i8, i9, i7) && bz(i10, i9, i7);
        } else if (!bj(i, i2, i4)) {
            return false;
        } else {
            i8 = i2 << 7;
            i7 = i4 << 7;
            i9 = i8 + 1;
            int i11 = i7 + 1;
            if (!bz(i9, this.aj[i][i2][i4] - i6, i11)) {
                return false;
            }
            i8 = (i8 + 128) - 1;
            int i12 = i2 + 1;
            if (!bz(i8, this.aj[i][i12][i4] - i6, i11)) {
                return false;
            }
            i11 = i4 + 1;
            i7 = (i7 + 128) - 1;
            return bz(i8, this.aj[i][i12][i11] - i6, i7) && bz(i9, this.aj[i][i2][i11] - i6, i7);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(bo boVar, int i, int i2, int i3) {
        bb bbVar;
        if (i2 < this.ar) {
            bbVar = this.ai[i][i2 + 1][i3];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 128, 0, 0, true);
            }
        }
        if (i3 < this.ar) {
            bbVar = this.ai[i][i2][i3 + 1];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 0, 0, 128, true);
            }
        }
        if (i2 < this.ar && i3 < this.al) {
            bbVar = this.ai[i][i2 + 1][i3 + 1];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 128, 0, 128, true);
            }
        }
        if (i2 < this.ar && i3 > 0) {
            bbVar = this.ai[i][i2 + 1][i3 - 1];
            if (bbVar != null && bbVar.ak != null && (bbVar.ak.al instanceof bo)) {
                bo.ah(boVar, (bo) bbVar.ak.al, 128, 0, -128, true);
            }
        }
    }

    public void bp() {
        int i;
        int i2;
        int i3 = 0;
        for (i = 0; i < this.aq; i++) {
            for (i2 = 0; i2 < this.ar; i2++) {
                for (int i4 = 0; i4 < this.al; i4++) {
                    this.ai[i][i2][i4] = null;
                }
            }
        }
        for (i = 0; i < bx; i++) {
            for (i2 = 0; i2 < bu[i]; i2++) {
                bw[i][i2] = null;
            }
            bu[i] = 0;
        }
        for (i = 0; i < this.am; i++) {
            this.ak[i] = null;
        }
        this.am = 0;
        while (i3 < bq.length) {
            bq[i3] = null;
            i3++;
        }
    }

    public int bq(int i, int i2, int i3, long j) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar == null) {
            return -1;
        }
        if (bbVar.ae != null && bbVar.ae.am * 481275275846680293L == j) {
            return (bbVar.ae.ak * -634765075) & 255;
        }
        int i4;
        int i5;
        if (bbVar.am != null && bbVar.am.as * 8643948037242326439L == j) {
            i4 = bbVar.am.ag;
            i5 = 157239073;
        } else if (bbVar.ak != null && bbVar.ak.aj * -6633027865852279199L == j) {
            return (bbVar.ak.ai * 182124225) & 255;
        } else {
            i5 = 0;
            while (i5 < bbVar.ag * 1744025137) {
                if (bbVar.ap[i5].au * -455156638817647337L == j) {
                    i4 = bbVar.ap[i5].az;
                    i5 = -393609465;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        return (i5 * i4) & 255;
    }

    public long bs(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar == null) {
            return 0;
        }
        for (int i4 = 0; i4 < bbVar.ag * 1744025137; i4++) {
            cj cjVar = bbVar.ap[i4];
            if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i2 && cjVar.ak * 2076633559 == i3) {
                return cjVar.au * -455156638817647337L;
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bt(int i, int i2, int i3, int i4) {
        if (!bj(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        int i7 = i5 + 1;
        int i8 = i6 + 1;
        if (!bz(i7, this.aj[i][i2][i3] - i4, i8)) {
            return false;
        }
        i5 = (i5 + 128) - 1;
        int i9 = i2 + 1;
        if (!bz(i5, this.aj[i][i9][i3] - i4, i8)) {
            return false;
        }
        i8 = i3 + 1;
        i6 = (i6 + 128) - 1;
        return bz(i5, this.aj[i][i9][i8] - i4, i6) && bz(i7, this.aj[i][i2][i8] - i4, i6);
    }

    public void bu(bw bwVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        bb[][] bbVarArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        bb bbVar;
        bb bbVar2;
        cj = bwVar;
        cm = cj.aq((byte) -3);
        if (i < 0) {
            i = 0;
        } else if (i >= this.ar * 128) {
            i = (this.ar * 128) - 1;
        }
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 >= this.al * 128) {
            i3 = (this.al * 128) - 1;
        }
        if (i4 < 128) {
            i4 = 128;
        } else if (i4 > 383) {
            i4 = cn;
        }
        ac++;
        bk = bl.aa[i4];
        ba = bl.ao[i4];
        bs = bl.aa[i5];
        bm = bl.ao[i5];
        cy = ce[(i4 - 128) / 32][i5 / 64];
        ab = i;
        av = i2;
        at = i3;
        ay = i / 128;
        an = i3 / 128;
        aw = i6;
        aa = ay - 25;
        if (aa < 0) {
            aa = 0;
        }
        ah = an - 25;
        if (ah < 0) {
            ah = 0;
        }
        ao = ay + 25;
        if (ao > this.ar) {
            ao = this.ar;
        }
        af = an + 25;
        if (af > this.al) {
            af = this.al;
        }
        be();
        ax = 0;
        int i13 = this.ae;
        while (true) {
            i7 = i13;
            if (i7 >= this.aq) {
                break;
            }
            bbVarArr = this.ai[i7];
            i13 = aa;
            while (i13 < ao) {
                i8 = ah;
                while (i8 < af) {
                    bb bbVar3 = bbVarArr[i13][i8];
                    if (bbVar3 != null) {
                        if (bbVar3.ax * -1527033401 > i6 || (!cy[(i13 - ay) + 25][(i8 - an) + 25] && this.aj[i7][i13][i8] - i2 < 2000)) {
                            bbVar3.aw = false;
                            bbVar3.ac = false;
                            bbVar3.ao = 0;
                        } else {
                            bbVar3.aw = true;
                            bbVar3.ac = true;
                            if (bbVar3.ag * 1744025137 > 0) {
                                bbVar3.aa = true;
                            } else {
                                bbVar3.aa = false;
                            }
                            ax++;
                        }
                    }
                    i8++;
                }
                i13++;
            }
            i13 = i7 + 1;
        }
        for (i13 = this.ae; i13 < this.aq; i13++) {
            bbVarArr = this.ai[i13];
            for (i7 = -25; i7 <= 0; i7++) {
                i9 = ay + i7;
                i10 = ay - i7;
                if (i9 >= aa || i10 < ao) {
                    for (i8 = -25; i8 <= 0; i8++) {
                        i11 = an + i8;
                        i12 = an - i8;
                        if (i9 >= aa) {
                            if (i11 >= ah) {
                                bbVar = bbVarArr[i9][i11];
                                if (bbVar != null && bbVar.aw) {
                                    bw(bbVar, true);
                                }
                            }
                            if (i12 < af) {
                                bbVar = bbVarArr[i9][i12];
                                if (bbVar != null && bbVar.aw) {
                                    bw(bbVar, true);
                                }
                            }
                        }
                        if (i10 < ao) {
                            if (i11 >= ah) {
                                bbVar2 = bbVarArr[i10][i11];
                                if (bbVar2 != null && bbVar2.aw) {
                                    bw(bbVar2, true);
                                }
                            }
                            if (i12 < af) {
                                bbVar2 = bbVarArr[i10][i12];
                                if (bbVar2 != null && bbVar2.aw) {
                                    bw(bbVar2, true);
                                }
                            }
                        }
                        if (ax == 0) {
                            bd = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        for (i13 = this.ae; i13 < this.aq; i13++) {
            bbVarArr = this.ai[i13];
            for (i7 = -25; i7 <= 0; i7++) {
                i9 = ay + i7;
                i10 = ay - i7;
                if (i9 >= aa || i10 < ao) {
                    for (i8 = -25; i8 <= 0; i8++) {
                        i11 = an + i8;
                        i12 = an - i8;
                        if (i9 >= aa) {
                            if (i11 >= ah) {
                                bbVar = bbVarArr[i9][i11];
                                if (bbVar != null && bbVar.aw) {
                                    bw(bbVar, false);
                                }
                            }
                            if (i12 < af) {
                                bbVar = bbVarArr[i9][i12];
                                if (bbVar != null && bbVar.aw) {
                                    bw(bbVar, false);
                                }
                            }
                        }
                        if (i10 < ao) {
                            if (i11 >= ah) {
                                bbVar2 = bbVarArr[i10][i11];
                                if (bbVar2 != null && bbVar2.aw) {
                                    bw(bbVar2, false);
                                }
                            }
                            if (i12 < af) {
                                bbVar2 = bbVarArr[i10][i12];
                                if (bbVar2 != null && bbVar2.aw) {
                                    bw(bbVar2, false);
                                }
                            }
                        }
                        if (ax == 0) {
                            bd = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        bd = false;
    }

    public void bv() {
        bc = true;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0238 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x049b  */
    /* JADX WARNING: Missing block: B:341:0x094b, code skipped:
            if (r24.aa != false) goto L_0x0801;
     */
    /* JADX WARNING: Missing block: B:349:0x0961, code skipped:
            if (r2.ac != false) goto L_0x0801;
     */
    /* JADX WARNING: Missing block: B:357:0x0977, code skipped:
            if (r2.ac != false) goto L_0x0801;
     */
    /* JADX WARNING: Missing block: B:365:0x098b, code skipped:
            if (r2.ac != false) goto L_0x0801;
     */
    /* JADX WARNING: Missing block: B:373:0x09a1, code skipped:
            if (r2.ac != false) goto L_0x0801;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bw(bb bbVar, boolean z) {
        bj.aq(bbVar);
        boolean z2 = z;
        while (true) {
            bb bbVar2 = (bb) bj.aj();
            if (bbVar2 != null) {
                if (bbVar2.ac) {
                    bb bbVar3;
                    bm bmVar;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    ab abVar;
                    boolean z3;
                    int i7;
                    int i8 = bbVar2.aq * -84329529;
                    int i9 = bbVar2.ar * 1977372143;
                    int i10 = bbVar2.ad * -1019275405;
                    int i11 = bbVar2.al * -1948950653;
                    bb[][] bbVarArr = this.ai[i10];
                    if (bbVar2.aw) {
                        boolean z4;
                        Object obj;
                        bm bmVar2;
                        bq bqVar;
                        if (z2) {
                            if (i10 > 0) {
                                bbVar3 = this.ai[i10 - 1][i8][i9];
                                if (bbVar3 != null && bbVar3.ac) {
                                }
                            }
                            if (i8 <= ay && i8 > aa) {
                                bbVar3 = bbVarArr[i8 - 1][i9];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * -1642971931) & 1) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i8 >= ay && i8 < ao - 1) {
                                bbVar3 = bbVarArr[i8 + 1][i9];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * -1642971931) & 4) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i9 <= an && i9 > ah) {
                                bbVar3 = bbVarArr[i8][i9 - 1];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * -1642971931) & 8) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i9 >= an && i9 < af - 1) {
                                bbVar3 = bbVarArr[i8][i9 + 1];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * -1642971931) & 2) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            z4 = z2;
                        } else {
                            z4 = true;
                        }
                        bbVar2.aw = false;
                        if (bbVar2.an != null) {
                            bb bbVar4 = bbVar2.an;
                            if (bbVar4.aj != null) {
                                if (!bj(0, i8, i9)) {
                                    cj.ar(this, bbVar4.aj, 0, bk, ba, bs, bm, i8, i9, (byte) -107);
                                }
                            } else if (!(bbVar4.ai == null || bj(0, i8, i9))) {
                                cj.al(this, bbVar4.ai, bk, ba, bs, bm, i8, i9, -675246187);
                            }
                            bmVar = bbVar4.ae;
                            if (bmVar != null) {
                                cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * 1509583973) - av, (bmVar.ar * 1372258739) - at, bmVar.am * 481275275846680293L);
                            }
                            for (i = 0; i < bbVar4.ag * 1744025137; i++) {
                                cj cjVar = bbVar4.ap[i];
                                if (cjVar != null) {
                                    cm.ar(cjVar.aj, cjVar.ai * -414603029, bk, ba, bs, bm, (cjVar.ar * -1621983921) - ab, (cjVar.aq * 1510327053) - av, (cjVar.al * -1609307177) - at, cjVar.au * -455156638817647337L);
                                }
                            }
                        }
                        if (bbVar2.aj != null) {
                            if (!bj(i11, i8, i9)) {
                                if (bbVar2.aj.ar * -881587749 == 12345678) {
                                    if (!bd) {
                                        i = i10;
                                    } else if (i10 > bo) {
                                        i = i10;
                                    }
                                }
                                cj.ar(this, bbVar2.aj, i11, bk, ba, bs, bm, i8, i9, (byte) -95);
                                i = i10;
                            }
                            obj = null;
                            bmVar2 = bbVar2.ae;
                            bqVar = bbVar2.am;
                            if (bmVar2 == null || bqVar != null) {
                                i = ay == i8 ? 1 : ay < i8 ? 2 : 0;
                                if (an == i9) {
                                    i += 3;
                                } else if (an > i9) {
                                    i += 6;
                                }
                                i2 = bh[i];
                                bbVar2.ay = bn[i] * -1237749589;
                            } else {
                                i2 = 0;
                                i = 0;
                            }
                            if (bmVar2 != null) {
                                if (((bmVar2.al * -1105918135) & bt[i]) == 0) {
                                    bbVar2.ao = 0;
                                } else if (bmVar2.al * -1105918135 == 16) {
                                    bbVar2.ao = -1058912729;
                                    bbVar2.ah = bz[i] * 141635957;
                                    bbVar2.af = -806857785 - (bbVar2.ah * 314882457);
                                } else if (bmVar2.al * -1105918135 == 32) {
                                    bbVar2.ao = -2117825458;
                                    bbVar2.ah = by[i] * 141635957;
                                    bbVar2.af = -1613715570 - (bbVar2.ah * 314882457);
                                } else if (bmVar2.al * -1105918135 == 64) {
                                    bbVar2.ao = 59316380;
                                    bbVar2.ah = bp[i] * 141635957;
                                    bbVar2.af = 1067536156 - (bbVar2.ah * 314882457);
                                } else {
                                    bbVar2.ao = 1118229109;
                                    bbVar2.ah = cv[i] * 141635957;
                                    bbVar2.af = 1874393941 - (bbVar2.ah * 314882457);
                                }
                                if (((bmVar2.al * -1105918135) & i2) != 0) {
                                    if (!bh(i11, i8, i9, bmVar2.al * -1105918135)) {
                                        cm.ar(bmVar2.ai, 0, bk, ba, bs, bm, (bmVar2.aq * -1832077365) - ab, (bmVar2.ad * 1509583973) - av, (bmVar2.ar * 1372258739) - at, 481275275846680293L * bmVar2.am);
                                    }
                                }
                                if (((bmVar2.aj * -1571286257) & i2) != 0) {
                                    if (!bh(i11, i8, i9, bmVar2.aj * -1571286257)) {
                                        cm.ar(bmVar2.ae, 0, bk, ba, bs, bm, (bmVar2.aq * -1832077365) - ab, (bmVar2.ad * 1509583973) - av, (bmVar2.ar * 1372258739) - at, 481275275846680293L * bmVar2.am);
                                    }
                                }
                            }
                            if (bqVar != null) {
                                if (!bt(i11, i8, i9, bqVar.am.bx * -1736982785)) {
                                    if (((bqVar.al * -1477416853) & i2) != 0) {
                                        cm.ar(bqVar.am, 0, bk, ba, bs, bm, ((bqVar.aq * 1244860895) - ab) + (bqVar.ai * 239961307), (bqVar.ad * -1765182903) - av, ((bqVar.ar * -296903029) - at) + (bqVar.ae * -1713161321), bqVar.as * 8643948037242326439L);
                                    } else if (bqVar.al * -1477416853 == 256) {
                                        i3 = (bqVar.aq * 1244860895) - ab;
                                        i4 = (bqVar.ad * -1765182903) - av;
                                        i5 = (bqVar.ar * -296903029) - at;
                                        i6 = bqVar.aj * 1389619833;
                                        i2 = (i6 == 1 || i6 == 2) ? -i3 : i3;
                                        i = (i6 == 2 || i6 == 3) ? -i5 : i5;
                                        if (i < i2) {
                                            cm.ar(bqVar.am, 0, bk, ba, bs, bm, i3 + (bqVar.ai * 239961307), i4, i5 + (bqVar.ae * -1713161321), bqVar.as * 8643948037242326439L);
                                        } else if (bqVar.ak != null) {
                                            cm.ar(bqVar.ak, 0, bk, ba, bs, bm, i3, i4, i5, bqVar.as * 8643948037242326439L);
                                        }
                                    }
                                }
                            }
                            if (obj != null) {
                                bh bhVar = bbVar2.ak;
                                if (bhVar != null) {
                                    cm.ar(bhVar.al, 0, bk, ba, bs, bm, (bhVar.aq * -1797554449) - ab, (bhVar.ad * 941648137) - av, (bhVar.ar * -1221097181) - at, bhVar.aj * -6633027865852279199L);
                                }
                                abVar = bbVar2.as;
                                if (abVar != null && abVar.am * -1998880189 == 0) {
                                    if (abVar.aj != null) {
                                        cm.ar(abVar.aj, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, (abVar.ad * -878322029) - av, (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                                    }
                                    if (abVar.ai != null) {
                                        cm.ar(abVar.ai, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, (abVar.ad * -878322029) - av, (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                                    }
                                    if (abVar.al != null) {
                                        cm.ar(abVar.al, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, (abVar.ad * -878322029) - av, (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                                    }
                                }
                            }
                            i = bbVar2.az * -1642971931;
                            if (i != 0) {
                                bb bbVar5;
                                if (i8 < ay && (i & 4) != 0) {
                                    bbVar5 = bbVarArr[i8 + 1][i9];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i9 < an && (i & 2) != 0) {
                                    bbVar5 = bbVarArr[i8][i9 + 1];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i8 > ay && (i & 1) != 0) {
                                    bbVar5 = bbVarArr[i8 - 1][i9];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i9 > an && (i & 8) != 0) {
                                    bbVar3 = bbVarArr[i8][i9 - 1];
                                    if (bbVar3 != null && bbVar3.ac) {
                                        bj.aq(bbVar3);
                                        z3 = z4;
                                    }
                                }
                            }
                            z3 = z4;
                        } else {
                            if (!(bbVar2.ai == null || bj(i11, i8, i9))) {
                                cj.al(this, bbVar2.ai, bk, ba, bs, bm, i8, i9, 1165817916);
                                i = i10;
                            }
                            obj = null;
                            bmVar2 = bbVar2.ae;
                            bqVar = bbVar2.am;
                            if (bmVar2 == null) {
                            }
                            if (ay == i8) {
                            }
                            if (an == i9) {
                            }
                            i2 = bh[i];
                            bbVar2.ay = bn[i] * -1237749589;
                            if (bmVar2 != null) {
                            }
                            if (bqVar != null) {
                            }
                            if (obj != null) {
                            }
                            i = bbVar2.az * -1642971931;
                            if (i != 0) {
                            }
                            z3 = z4;
                        }
                        obj = 1;
                        i10 = i;
                        bmVar2 = bbVar2.ae;
                        bqVar = bbVar2.am;
                        if (bmVar2 == null) {
                        }
                        if (ay == i8) {
                        }
                        if (an == i9) {
                        }
                        i2 = bh[i];
                        bbVar2.ay = bn[i] * -1237749589;
                        if (bmVar2 != null) {
                        }
                        if (bqVar != null) {
                        }
                        if (obj != null) {
                        }
                        i = bbVar2.az * -1642971931;
                        if (i != 0) {
                        }
                        z3 = z4;
                    } else {
                        z3 = z2;
                    }
                    if (bbVar2.ao * -1639555899 != 0) {
                        Object obj2;
                        i = 0;
                        while (i < bbVar2.ag * 1744025137) {
                            if (bbVar2.ap[i].ap * 61232071 != ac && (bbVar2.au[i] & (bbVar2.ao * -1639555899)) == bbVar2.ah * 413095645) {
                                obj2 = null;
                                break;
                            }
                            i++;
                        }
                        obj2 = 1;
                        if (obj2 != null) {
                            bmVar = bbVar2.ae;
                            if (!bh(i11, i8, i9, bmVar.al * -1105918135)) {
                                cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * 1509583973) - av, (bmVar.ar * 1372258739) - at, bmVar.am * 481275275846680293L);
                            }
                            bbVar2.ao = 0;
                        }
                    }
                    if (bbVar2.aa) {
                        try {
                            int i12 = bbVar2.ag;
                            bbVar2.aa = false;
                            int i13 = 0;
                            i6 = 0;
                            while (i6 < 1744025137 * i12) {
                                cj cjVar2 = bbVar2.ap[i6];
                                if (cjVar2.ap * 61232071 != ac) {
                                    i = cjVar2.ae * -1865206717;
                                    while (true) {
                                        i2 = i;
                                        if (i2 <= cjVar2.am * 1001322405) {
                                            i = cjVar2.ak * 2076633559;
                                            while (true) {
                                                i7 = i;
                                                if (i7 > cjVar2.as * -1105506265) {
                                                    break;
                                                }
                                                bb bbVar6 = bbVarArr[i2][i7];
                                                if (bbVar6.aw) {
                                                    bbVar2.aa = true;
                                                    i = i13;
                                                    break;
                                                }
                                                if (bbVar6.ao * -1639555899 != 0) {
                                                    i = i2 > cjVar2.ae * -1865206717 ? 1 : 0;
                                                    if (i2 < cjVar2.am * 1001322405) {
                                                        i += 4;
                                                    }
                                                    if (i7 > cjVar2.ak * 2076633559) {
                                                        i += 8;
                                                    }
                                                    if (i7 < cjVar2.as * -1105506265) {
                                                        i += 2;
                                                    }
                                                    if ((i & (bbVar6.ao * -1639555899)) == bbVar2.af * -171148827) {
                                                        bbVar2.aa = true;
                                                        i = i13;
                                                        break;
                                                    }
                                                }
                                                i = i7 + 1;
                                            }
                                        } else {
                                            bq[i13] = cjVar2;
                                            i7 = ay - (cjVar2.ae * -1865206717);
                                            i = (cjVar2.am * 1001322405) - ay;
                                            if (i <= i7) {
                                                i = i7;
                                            }
                                            i7 = an - (cjVar2.ak * 2076633559);
                                            i2 = (cjVar2.as * -1105506265) - an;
                                            if (i2 > i7) {
                                                cjVar2.ag = (i + i2) * -998662539;
                                            } else {
                                                cjVar2.ag = (i + i7) * -998662539;
                                            }
                                            i = i13 + 1;
                                        }
                                        i = i2 + 1;
                                    }
                                } else {
                                    i = i13;
                                }
                                i6++;
                                i13 = i;
                            }
                            while (i13 > 0) {
                                i7 = -1;
                                i = -50;
                                for (i2 = 0; i2 < i13; i2++) {
                                    cj cjVar3 = bq[i2];
                                    if (cjVar3.ap * 61232071 != ac) {
                                        if (cjVar3.ag * -1361264163 > i) {
                                            i = cjVar3.ag * -1361264163;
                                        } else if (cjVar3.ag * -1361264163 == i) {
                                            i12 = (cjVar3.ar * -1621983921) - ab;
                                            i6 = (cjVar3.al * -1609307177) - at;
                                            int i14 = (bq[i7].ar * -1621983921) - ab;
                                            int i15 = (bq[i7].al * -1609307177) - at;
                                            if ((i6 * i6) + (i12 * i12) > (i14 * i14) + (i15 * i15)) {
                                            }
                                        }
                                        i7 = i2;
                                    }
                                }
                                if (i7 == -1) {
                                    break;
                                }
                                cj cjVar4 = bq[i7];
                                cjVar4.ap = ac * -444891657;
                                if (!bn(i11, cjVar4.ae * -1865206717, cjVar4.am * 1001322405, cjVar4.ak * 2076633559, cjVar4.as * -1105506265, cjVar4.aj.bx * -1736982785)) {
                                    cm.ar(cjVar4.aj, cjVar4.ai * -414603029, bk, ba, bs, bm, (cjVar4.ar * -1621983921) - ab, (cjVar4.aq * 1510327053) - av, (cjVar4.al * -1609307177) - at, cjVar4.au * -455156638817647337L);
                                }
                                i = cjVar4.ae * -1865206717;
                                while (true) {
                                    i7 = i;
                                    if (i7 <= cjVar4.am * 1001322405) {
                                        i = cjVar4.ak * 2076633559;
                                        while (i <= cjVar4.as * -1105506265) {
                                            bb bbVar7 = bbVarArr[i7][i];
                                            if (bbVar7.ao * -1639555899 != 0) {
                                                bj.aq(bbVar7);
                                            } else if (!(i7 == i8 && i == i9) && bbVar7.ac) {
                                                bj.aq(bbVar7);
                                            }
                                            i++;
                                        }
                                        i = i7 + 1;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            bbVar2.aa = false;
                        }
                    }
                    if (bbVar2.ac && bbVar2.ao * -1639555899 == 0) {
                        if (i8 <= ay && i8 > aa) {
                            bbVar3 = bbVarArr[i8 - 1][i9];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i8 >= ay && i8 < ao - 1) {
                            bbVar3 = bbVarArr[i8 + 1][i9];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i9 <= an && i9 > ah) {
                            bbVar3 = bbVarArr[i8][i9 - 1];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i9 >= an && i9 < af - 1) {
                            bbVar3 = bbVarArr[i8][i9 + 1];
                            if (bbVar3 != null) {
                            }
                        }
                        bbVar2.ac = false;
                        ax--;
                        abVar = bbVar2.as;
                        if (!(abVar == null || abVar.am * -1998880189 == 0)) {
                            if (abVar.aj != null) {
                                cm.ar(abVar.aj, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, ((abVar.ad * -878322029) - av) - (abVar.am * -1998880189), (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                            }
                            if (abVar.ai != null) {
                                cm.ar(abVar.ai, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, ((abVar.ad * -878322029) - av) - (abVar.am * -1998880189), (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                            }
                            if (abVar.al != null) {
                                cm.ar(abVar.al, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, ((abVar.ad * -878322029) - av) - (abVar.am * -1998880189), (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                            }
                        }
                        if (bbVar2.ay * 516360707 != 0) {
                            bq bqVar2 = bbVar2.am;
                            if (bqVar2 != null) {
                                if (!bt(i11, i8, i9, bqVar2.am.bx * -1736982785)) {
                                    if (((bqVar2.al * -1477416853) & (bbVar2.ay * 516360707)) != 0) {
                                        cm.ar(bqVar2.am, 0, bk, ba, bs, bm, ((bqVar2.aq * 1244860895) - ab) + (bqVar2.ai * 239961307), (bqVar2.ad * -1765182903) - av, ((bqVar2.ar * -296903029) - at) + (bqVar2.ae * -1713161321), bqVar2.as * 8643948037242326439L);
                                    } else if (bqVar2.al * -1477416853 == 256) {
                                        i3 = (bqVar2.aq * 1244860895) - ab;
                                        i4 = (bqVar2.ad * -1765182903) - av;
                                        i5 = (bqVar2.ar * -296903029) - at;
                                        i6 = bqVar2.aj * 1389619833;
                                        i7 = (i6 == 1 || i6 == 2) ? -i3 : i3;
                                        i = (i6 == 2 || i6 == 3) ? -i5 : i5;
                                        if (i >= i7) {
                                            cm.ar(bqVar2.am, 0, bk, ba, bs, bm, i3 + (bqVar2.ai * 239961307), i4, i5 + (bqVar2.ae * -1713161321), bqVar2.as * 8643948037242326439L);
                                        } else if (bqVar2.ak != null) {
                                            cm.ar(bqVar2.ak, 0, bk, ba, bs, bm, i3, i4, i5, bqVar2.as * 8643948037242326439L);
                                        }
                                    }
                                }
                            }
                            bmVar = bbVar2.ae;
                            if (bmVar != null) {
                                if (((bmVar.aj * -1571286257) & (bbVar2.ay * 516360707)) != 0) {
                                    if (!bh(i11, i8, i9, bmVar.aj * -1571286257)) {
                                        cm.ar(bmVar.ae, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * 1509583973) - av, (bmVar.ar * 1372258739) - at, bmVar.am * 481275275846680293L);
                                    }
                                }
                                if (((bmVar.al * -1105918135) & (bbVar2.ay * 516360707)) != 0) {
                                    if (!bh(i11, i8, i9, bmVar.al * -1105918135)) {
                                        cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * 1509583973) - av, (bmVar.ar * 1372258739) - at, bmVar.am * 481275275846680293L);
                                    }
                                }
                            }
                        }
                        if (i10 < this.aq - 1) {
                            bbVar3 = this.ai[i10 + 1][i8][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i8 < ay) {
                            bbVar3 = bbVarArr[i8 + 1][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i9 < an) {
                            bbVar3 = bbVarArr[i8][i9 + 1];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i8 > ay) {
                            bbVar3 = bbVarArr[i8 - 1][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i9 > an) {
                            bbVar3 = bbVarArr[i8][i9 - 1];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                    }
                    z2 = z3;
                }
            } else {
                return;
            }
        }
    }

    public void by() {
        int i;
        int i2;
        int i3 = 0;
        for (i = 0; i < this.aq; i++) {
            for (i2 = 0; i2 < this.ar; i2++) {
                for (int i4 = 0; i4 < this.al; i4++) {
                    this.ai[i][i2][i4] = null;
                }
            }
        }
        for (i = 0; i < bx; i++) {
            for (i2 = 0; i2 < bu[i]; i2++) {
                bw[i][i2] = null;
            }
            bu[i] = 0;
        }
        for (i = 0; i < this.am; i++) {
            this.ak[i] = null;
        }
        this.am = 0;
        while (i3 < bq.length) {
            bq[i3] = null;
            i3++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bz(int i, int i2, int i3) {
        for (int i4 = 0; i4 < br; i4++) {
            ay ayVar = be[i4];
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            if (ayVar.ap * 1735240211 == 1) {
                i5 = (ayVar.ai * -678323267) - i;
                if (i5 > 0) {
                    i6 = ayVar.am;
                    i7 = ayVar.ax;
                    i8 = ayVar.ak;
                    i9 = ayVar.aw;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i3 >= (i6 * -1454763785) + (((i7 * 2091376043) * i5) >> 8) && i3 <= (101603777 * i8) + (((-1390569691 * i9) * i5) >> 8) && i2 >= (-477936417 * i10) + (((-2075228481 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * 1696088859) * i5) >> 8) + (-2139808907 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * 1735240211 == 2) {
                i5 = i - (ayVar.ai * -678323267);
                if (i5 > 0) {
                    i6 = ayVar.am;
                    i7 = ayVar.ax;
                    i8 = ayVar.ak;
                    i9 = ayVar.aw;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i3 >= (i6 * -1454763785) + (((i7 * 2091376043) * i5) >> 8) && i3 <= (101603777 * i8) + (((-1390569691 * i9) * i5) >> 8) && i2 >= (-477936417 * i10) + (((-2075228481 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * 1696088859) * i5) >> 8) + (-2139808907 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * 1735240211 == 3) {
                i5 = (ayVar.am * -1454763785) - i3;
                if (i5 > 0) {
                    i6 = ayVar.ai;
                    i7 = ayVar.au;
                    i8 = ayVar.ae;
                    i9 = ayVar.az;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i >= (i6 * -678323267) + (((i7 * -30822289) * i5) >> 8) && i <= (1457394279 * i8) + (((1829423525 * i9) * i5) >> 8) && i2 >= (-477936417 * i10) + (((-2075228481 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * 1696088859) * i5) >> 8) + (-2139808907 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * 1735240211 == 4) {
                i5 = i3 - (ayVar.am * -1454763785);
                if (i5 > 0) {
                    i6 = ayVar.ai;
                    i7 = ayVar.au;
                    i8 = ayVar.ae;
                    i9 = ayVar.az;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i >= (i6 * -678323267) + (((i7 * -30822289) * i5) >> 8) && i <= (1457394279 * i8) + (((1829423525 * i9) * i5) >> 8) && i2 >= (-477936417 * i10) + (((-2075228481 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * 1696088859) * i5) >> 8) + (-2139808907 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * 1735240211 == 5) {
                i5 = i2 - (ayVar.as * -477936417);
                if (i5 > 0) {
                    i6 = ayVar.ai;
                    i7 = ayVar.au;
                    i8 = ayVar.ae;
                    i9 = ayVar.az;
                    i10 = ayVar.am;
                    i11 = ayVar.ax;
                    i12 = ayVar.ak;
                    i13 = ayVar.aw;
                    if (i >= (i6 * -678323267) + (((i7 * -30822289) * i5) >> 8) && i <= (1457394279 * i8) + (((1829423525 * i9) * i5) >> 8) && i3 >= (-1454763785 * i10) + (((2091376043 * i11) * i5) >> 8)) {
                        if (i3 <= (((i13 * -1390569691) * i5) >> 8) + (101603777 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void ca(int i, int i2, int i3, int i4, br brVar, long j, int i5) {
        if (brVar != null) {
            bh bhVar = new bh();
            bhVar.al = brVar;
            bhVar.aq = (179832704 * i2) - 2057567296;
            bhVar.ar = (-277396096 * i3) + 2008785600;
            bhVar.ad = -907283143 * i4;
            bhVar.aj = 4105961552768114081L * j;
            bhVar.ai = -191196863 * i5;
            if (this.ai[i][i2][i3] == null) {
                this.ai[i][i2][i3] = new bb(i, i2, i3);
            }
            this.ai[i][i2][i3].ak = bhVar;
        }
    }

    public void cb(int i, int i2, int i3, int i4) {
        if (this.ai[i][i2][i3] != null) {
            this.ai[i][i2][i3].ax = 679157751 * i4;
        }
    }

    public void cc(int i, int i2, int i3, int i4) {
        if (this.ai[i][i2][i3] != null) {
            this.ai[i][i2][i3].ax = 679157751 * i4;
        }
    }

    public void cd(int i, int i2, int i3, int i4, br brVar, br brVar2, int i5, int i6, long j, int i7) {
        if (brVar != null || brVar2 != null) {
            bm bmVar = new bm();
            bmVar.am = 5826360528745369325L * j;
            bmVar.ak = -331211547 * i7;
            bmVar.aq = (-501550720 * i2) + 1896708288;
            bmVar.ar = (298499456 * i3) - 1266031253;
            bmVar.ad = 1970038125 * i4;
            bmVar.ai = brVar;
            bmVar.ae = brVar2;
            bmVar.al = 735746809 * i5;
            bmVar.aj = -667336701 * i6;
            for (int i8 = i; i8 >= 0; i8--) {
                if (this.ai[i8][i2][i3] == null) {
                    this.ai[i8][i2][i3] = new bb(i8, i2, i3);
                }
            }
            this.ai[i][i2][i3].ae = bmVar;
        }
    }

    public void ce(int i, int i2, int i3, int i4) {
        if (this.ai[i][i2][i3] != null) {
            this.ai[i][i2][i3].ax = 679157751 * i4;
        }
    }

    public void cf(int i, int i2, int i3, int i4, br brVar, br brVar2, int i5, int i6, int i7, int i8, long j, int i9) {
        if (brVar != null) {
            bq bqVar = new bq();
            bqVar.as = -8152327660955743721L * j;
            bqVar.ag = 1331509688 * i9;
            bqVar.aq = (-218820736 * i2) - 109410368;
            bqVar.ar = (-1213427328 * i3) - 1167717068;
            bqVar.ad = -2022629383 * i4;
            bqVar.am = brVar;
            bqVar.ak = brVar2;
            bqVar.al = -1255028885 * i5;
            bqVar.aj = -907386935 * i6;
            bqVar.ai = -1543579821 * i7;
            bqVar.ae = -35982297 * i8;
            for (int i10 = i; i10 >= 0; i10--) {
                if (this.ai[i10][i2][i3] == null) {
                    this.ai[i10][i2][i3] = new bb(i10, i2, i3);
                }
            }
            this.ai[i][i2][i3].am = bqVar;
        }
    }

    public boolean cg(int i, int i2, int i3, int i4, int i5, int i6, br brVar, int i7, long j, int i8) {
        if (brVar == null) {
            return true;
        }
        return az(i, i2, i3, i5, i6, (i2 * 128) + (i5 * 64), (i3 * 128) + (i6 * 64), i4, brVar, i7, false, j, i8);
    }

    public boolean ch(int i, int i2, int i3, int i4, int i5, int i6, br brVar, int i7, long j, int i8) {
        if (brVar == null) {
            return true;
        }
        return az(i, i2, i3, i5, i6, (i2 * 128) + (i5 * 64), (i3 * 128) + (i6 * 64), i4, brVar, i7, false, j, i8);
    }

    public void cj(int i) {
        this.ae = i;
        for (int i2 = 0; i2 < this.ar; i2++) {
            for (int i3 = 0; i3 < this.al; i3++) {
                if (this.ai[i][i2][i3] == null) {
                    this.ai[i][i2][i3] = new bb(i, i2, i3);
                }
            }
        }
    }

    public void ck(int i, int i2, int i3, int i4, br brVar, long j, br brVar2, br brVar3) {
        ab abVar = new ab();
        abVar.al = brVar;
        abVar.aq = (-1538870656 * i2) + 1378048320;
        abVar.ar = (-222803840 * i3) + 2036081728;
        abVar.ad = 1853747099 * i4;
        abVar.ae = -3125052279042097579L * j;
        abVar.aj = brVar2;
        abVar.ai = brVar3;
        bb bbVar = this.ai[i][i2][i3];
        int i5 = 0;
        if (bbVar != null) {
            i5 = 0;
            int i6 = 0;
            while (i6 < bbVar.ag * 1744025137) {
                int i7;
                if (((bbVar.ap[i6].az * -393609465) & 256) == 256 && (bbVar.ap[i6].aj instanceof bp)) {
                    bp bpVar = (bp) bbVar.ap[i6].aj;
                    bpVar.ai();
                    if (bpVar.bx * -1736982785 > i5) {
                        i7 = bpVar.bx * -1736982785;
                        i6++;
                        i5 = i7;
                    }
                }
                i7 = i5;
                i6++;
                i5 = i7;
            }
        }
        abVar.am = 854022763 * i5;
        if (this.ai[i][i2][i3] == null) {
            this.ai[i][i2][i3] = new bb(i, i2, i3);
        }
        this.ai[i][i2][i3].as = abVar;
    }

    public void cl(int i, int i2, int i3, int i4, br brVar, br brVar2, int i5, int i6, long j, int i7) {
        if (brVar != null || brVar2 != null) {
            bm bmVar = new bm();
            bmVar.am = 5826360528745369325L * j;
            bmVar.ak = -331211547 * i7;
            bmVar.aq = (-501550720 * i2) + 1896708288;
            bmVar.ar = (298499456 * i3) + 149249728;
            bmVar.ad = 1970038125 * i4;
            bmVar.ai = brVar;
            bmVar.ae = brVar2;
            bmVar.al = 735746809 * i5;
            bmVar.aj = 2139257839 * i6;
            for (int i8 = i; i8 >= 0; i8--) {
                if (this.ai[i8][i2][i3] == null) {
                    this.ai[i8][i2][i3] = new bb(i8, i2, i3);
                }
            }
            this.ai[i][i2][i3].ae = bmVar;
        }
    }

    public void cm(int i) {
        this.ae = i;
        for (int i2 = 0; i2 < this.ar; i2++) {
            for (int i3 = 0; i3 < this.al; i3++) {
                if (this.ai[i][i2][i3] == null) {
                    this.ai[i][i2][i3] = new bb(i, i2, i3);
                }
            }
        }
    }

    public void cn(int i, int i2) {
        bb bbVar = this.ai[0][i][i2];
        int i3 = 0;
        while (i3 < 3) {
            bb[] bbVarArr = this.ai[i3][i];
            int i4 = i3 + 1;
            bb bbVar2 = this.ai[i4][i][i2];
            bbVarArr[i2] = bbVar2;
            if (bbVar2 != null) {
                bbVar2.ad += 1353652805;
                for (i3 = 0; i3 < bbVar2.ag * 1744025137; i3++) {
                    cj cjVar = bbVar2.ap[i3];
                    if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i && cjVar.ak * 2076633559 == i2) {
                        cjVar.ad -= 1455945163;
                    }
                }
            }
            i3 = i4;
        }
        if (this.ai[0][i][i2] == null) {
            this.ai[0][i][i2] = new bb(0, i, i2);
        }
        this.ai[0][i][i2].an = bbVar;
        this.ai[3][i][i2] = null;
    }

    public void co(int i, int i2, int i3, int i4, br brVar, long j, br brVar2, br brVar3) {
        ab abVar = new ab();
        abVar.al = brVar;
        abVar.aq = (-1538870656 * i2) + 1378048320;
        abVar.ar = (-222803840 * i3) + 2036081728;
        abVar.ad = 1853747099 * i4;
        abVar.ae = -3125052279042097579L * j;
        abVar.aj = brVar2;
        abVar.ai = brVar3;
        bb bbVar = this.ai[i][i2][i3];
        int i5 = 0;
        if (bbVar != null) {
            i5 = 0;
            int i6 = 0;
            while (i6 < bbVar.ag * 1744025137) {
                int i7;
                if (((bbVar.ap[i6].az * -393609465) & 256) == 256 && (bbVar.ap[i6].aj instanceof bp)) {
                    bp bpVar = (bp) bbVar.ap[i6].aj;
                    bpVar.ai();
                    if (bpVar.bx * -1736982785 > i5) {
                        i7 = bpVar.bx * -1736982785;
                        i6++;
                        i5 = i7;
                    }
                }
                i7 = i5;
                i6++;
                i5 = i7;
            }
        }
        abVar.am = 854022763 * i5;
        if (this.ai[i][i2][i3] == null) {
            this.ai[i][i2][i3] = new bb(i, i2, i3);
        }
        this.ai[i][i2][i3].as = abVar;
    }

    public void cp(int i, int i2) {
        bb bbVar = this.ai[0][i][i2];
        int i3 = 0;
        while (i3 < 3) {
            bb[] bbVarArr = this.ai[i3][i];
            int i4 = i3 + 1;
            bb bbVar2 = this.ai[i4][i][i2];
            bbVarArr[i2] = bbVar2;
            if (bbVar2 != null) {
                bbVar2.ad += 1353652805;
                for (i3 = 0; i3 < bbVar2.ag * 1744025137; i3++) {
                    cj cjVar = bbVar2.ap[i3];
                    if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i && cjVar.ak * 2076633559 == i2) {
                        cjVar.ad -= 1455945163;
                    }
                }
            }
            i3 = i4;
        }
        if (this.ai[0][i][i2] == null) {
            this.ai[0][i][i2] = new bb(0, i, i2);
        }
        this.ai[0][i][i2].an = bbVar;
        this.ai[3][i][i2] = null;
    }

    public void cq(int i, int i2) {
        bb bbVar = this.ai[0][i][i2];
        int i3 = 0;
        while (i3 < 3) {
            bb[] bbVarArr = this.ai[i3][i];
            int i4 = i3 + 1;
            bb bbVar2 = this.ai[i4][i][i2];
            bbVarArr[i2] = bbVar2;
            if (bbVar2 != null) {
                bbVar2.ad += 1353652805;
                for (i3 = 0; i3 < bbVar2.ag * 1744025137; i3++) {
                    cj cjVar = bbVar2.ap[i3];
                    if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i && cjVar.ak * 2076633559 == i2) {
                        cjVar.ad -= 1455945163;
                    }
                }
            }
            i3 = i4;
        }
        if (this.ai[0][i][i2] == null) {
            this.ai[0][i][i2] = new bb(0, i, i2);
        }
        this.ai[0][i][i2].an = bbVar;
        this.ai[3][i][i2] = null;
    }

    public void cr(int i, int i2, int i3, int i4, br brVar, long j, int i5) {
        if (brVar != null) {
            bh bhVar = new bh();
            bhVar.al = brVar;
            bhVar.aq = (731374877 * i2) - 2057567296;
            bhVar.ar = (-277396096 * i3) - 1595911544;
            bhVar.ad = -907283143 * i4;
            bhVar.aj = 4105961552768114081L * j;
            bhVar.ai = -329881069 * i5;
            if (this.ai[i][i2][i3] == null) {
                this.ai[i][i2][i3] = new bb(i, i2, i3);
            }
            this.ai[i][i2][i3].ak = bhVar;
        }
    }

    public void cs(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        av avVar;
        int i21;
        if (i4 == 0) {
            avVar = new av(i11, i12, i13, i14, -1, i19, false);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ai[i21][i2][i3] == null) {
                    this.ai[i21][i2][i3] = new bb(i21, i2, i3);
                }
            }
            this.ai[i][i2][i3].aj = avVar;
            return;
        }
        boolean z = true;
        if (i4 == 1) {
            if (!(i7 == i8 && i7 == i9 && i7 == i10)) {
                z = false;
            }
            avVar = new av(i15, i16, i17, i18, i6, i20, z);
            for (i21 = i; i21 >= 0; i21--) {
                if (this.ai[i21][i2][i3] == null) {
                    this.ai[i21][i2][i3] = new bb(i21, i2, i3);
                }
            }
            this.ai[i][i2][i3].aj = avVar;
            return;
        }
        bs bsVar = new bs(i4, i5, i6, i2, i3, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20);
        for (i21 = i; i21 >= 0; i21--) {
            if (this.ai[i21][i2][i3] == null) {
                this.ai[i21][i2][i3] = new bb(i21, i2, i3);
            }
        }
        this.ai[i][i2][i3].ai = bsVar;
    }

    public void ct(int i, int i2, int i3, int i4, br brVar, long j, int i5) {
        if (brVar != null) {
            bh bhVar = new bh();
            bhVar.al = brVar;
            bhVar.aq = (179832704 * i2) - 2057567296;
            bhVar.ar = (-277396096 * i3) + 2008785600;
            bhVar.ad = -907283143 * i4;
            bhVar.aj = 4105961552768114081L * j;
            bhVar.ai = -191196863 * i5;
            if (this.ai[i][i2][i3] == null) {
                this.ai[i][i2][i3] = new bb(i, i2, i3);
            }
            this.ai[i][i2][i3].ak = bhVar;
        }
    }

    public void cu(int i, int i2, int i3, int i4, br brVar, long j, br brVar2, br brVar3) {
        ab abVar = new ab();
        abVar.al = brVar;
        abVar.aq = (-1538870656 * i2) + 1378048320;
        abVar.ar = (-222803840 * i3) + 2036081728;
        abVar.ad = 1853747099 * i4;
        abVar.ae = -3125052279042097579L * j;
        abVar.aj = brVar2;
        abVar.ai = brVar3;
        bb bbVar = this.ai[i][i2][i3];
        int i5 = 0;
        if (bbVar != null) {
            i5 = 0;
            int i6 = 0;
            while (i6 < bbVar.ag * 1744025137) {
                int i7;
                if (((bbVar.ap[i6].az * -393609465) & 256) == 256 && (bbVar.ap[i6].aj instanceof bp)) {
                    bp bpVar = (bp) bbVar.ap[i6].aj;
                    bpVar.ai();
                    if (bpVar.bx * -1736982785 > i5) {
                        i7 = bpVar.bx * -1736982785;
                        i6++;
                        i5 = i7;
                    }
                }
                i7 = i5;
                i6++;
                i5 = i7;
            }
        }
        abVar.am = 854022763 * i5;
        if (this.ai[i][i2][i3] == null) {
            this.ai[i][i2][i3] = new bb(i, i2, i3);
        }
        this.ai[i][i2][i3].as = abVar;
    }

    public void cv(int i) {
        this.ae = i;
        for (int i2 = 0; i2 < this.ar; i2++) {
            for (int i3 = 0; i3 < this.al; i3++) {
                if (this.ai[i][i2][i3] == null) {
                    this.ai[i][i2][i3] = new bb(i, i2, i3);
                }
            }
        }
    }

    public void cw(int i, int i2) {
        bb bbVar = this.ai[0][i][i2];
        int i3 = 0;
        while (i3 < 3) {
            bb[] bbVarArr = this.ai[i3][i];
            int i4 = i3 + 1;
            bb bbVar2 = this.ai[i4][i][i2];
            bbVarArr[i2] = bbVar2;
            if (bbVar2 != null) {
                bbVar2.ad += 1353652805;
                for (i3 = 0; i3 < bbVar2.ag * 24771820; i3++) {
                    cj cjVar = bbVar2.ap[i3];
                    if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * 1164087197 == i && cjVar.ak * 2076633559 == i2) {
                        cjVar.ad -= 870019322;
                    }
                }
            }
            i3 = i4;
        }
        if (this.ai[0][i][i2] == null) {
            this.ai[0][i][i2] = new bb(0, i, i2);
        }
        this.ai[0][i][i2].an = bbVar;
        this.ai[3][i][i2] = null;
    }

    public void cx(int i, int i2, int i3, int i4, br brVar, long j, int i5) {
        if (brVar != null) {
            bh bhVar = new bh();
            bhVar.al = brVar;
            bhVar.aq = (-384261172 * i2) - 2057567296;
            bhVar.ar = (-277396096 * i3) + 2008785600;
            bhVar.ad = 734658649 * i4;
            bhVar.aj = 4105961552768114081L * j;
            bhVar.ai = 1110464464 * i5;
            if (this.ai[i][i2][i3] == null) {
                this.ai[i][i2][i3] = new bb(i, i2, i3);
            }
            this.ai[i][i2][i3].ak = bhVar;
        }
    }

    public void cy(int i, int i2, int i3, int i4) {
        if (this.ai[i][i2][i3] != null) {
            this.ai[i][i2][i3].ax = 679157751 * i4;
        }
    }

    public void cz(int i, int i2, int i3, int i4, br brVar, br brVar2, int i5, int i6, long j, int i7) {
        if (brVar != null || brVar2 != null) {
            bm bmVar = new bm();
            bmVar.am = 5826360528745369325L * j;
            bmVar.ak = -1846116295 * i7;
            bmVar.aq = (-501550720 * i2) + 1896708288;
            bmVar.ar = (-2114427320 * i3) - 615153595;
            bmVar.ad = 1970038125 * i4;
            bmVar.ai = brVar;
            bmVar.ae = brVar2;
            bmVar.al = 735746809 * i5;
            bmVar.aj = 2139257839 * i6;
            for (int i8 = i; i8 >= 0; i8--) {
                if (this.ai[i8][i2][i3] == null) {
                    this.ai[i8][i2][i3] = new bb(i8, i2, i3);
                }
            }
            this.ai[i][i2][i3].ae = bmVar;
        }
    }

    public boolean da(int i, int i2, int i3, int i4, int i5, br brVar, int i6, long j, int i7, int i8, int i9, int i10) {
        if (brVar == null) {
            return true;
        }
        return az(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, brVar, i6, true, j, 0);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean db(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, br brVar, int i9, boolean z, long j, int i10) {
        int i11 = i2;
        loop0:
        while (true) {
            int i12 = i2 + i4;
            int i13;
            bb bbVar;
            if (i11 < i12) {
                i13 = i3;
                while (i13 < i3 + i5) {
                    if (i11 >= 0 && i13 >= 0 && i11 < this.ar) {
                        if (i13 >= this.al) {
                            return false;
                        }
                        bbVar = this.ai[i][i11][i13];
                        if (bbVar != null && bbVar.ag * 1744025137 >= 5) {
                            return false;
                        }
                        i13++;
                    }
                }
                i11++;
            } else {
                cj cjVar = new cj();
                cjVar.au = 4491614666738664103L * j;
                cjVar.az = -1661911369 * i10;
                cjVar.ad = 1455945163 * i;
                cjVar.ar = -1409386065 * i6;
                cjVar.al = 152909799 * i7;
                cjVar.aq = -1502166075 * i8;
                cjVar.aj = brVar;
                cjVar.ai = -497565757 * i9;
                cjVar.ae = -1759266709 * i2;
                cjVar.ak = 1864047079 * i3;
                int i14 = i12 - 1;
                cjVar.am = 1748703277 * i14;
                int i15 = i3 + i5;
                int i16 = i15 - 1;
                cjVar.as = 632889239 * i16;
                i11 = i2;
                while (i11 < i12) {
                    for (int i17 = i3; i17 < i15; i17++) {
                        i13 = i11 > i2 ? 1 : 0;
                        if (i11 < i14) {
                            i13 += 4;
                        }
                        if (i17 > i3) {
                            i13 += 8;
                        }
                        if (i17 < i16) {
                            i13 += 2;
                        }
                        for (int i18 = i; i18 >= 0; i18--) {
                            if (this.ai[i18][i11][i17] == null) {
                                this.ai[i18][i11][i17] = new bb(i18, i11, i17);
                            }
                        }
                        bbVar = this.ai[i][i11][i17];
                        bbVar.ap[bbVar.ag * 1744025137] = cjVar;
                        bbVar.au[bbVar.ag * 1744025137] = i13;
                        bbVar.az = (i13 | (bbVar.az * -1642971931)) * 1684873453;
                        bbVar.ag += 1426186961;
                    }
                    i11++;
                }
                if (z) {
                    cj[] cjVarArr = this.ak;
                    i11 = this.am;
                    this.am = i11 + 1;
                    cjVarArr[i11] = cjVar;
                }
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean dc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, br brVar, int i9, boolean z, long j, int i10) {
        int i11 = i2;
        loop0:
        while (true) {
            int i12 = i2 + i4;
            int i13;
            bb bbVar;
            if (i11 < i12) {
                i13 = i3;
                while (i13 < i3 + i5) {
                    if (i11 >= 0 && i13 >= 0 && i11 < this.ar) {
                        if (i13 >= this.al) {
                            return false;
                        }
                        bbVar = this.ai[i][i11][i13];
                        if (bbVar != null && bbVar.ag * 1744025137 >= 5) {
                            return false;
                        }
                        i13++;
                    }
                }
                i11++;
            } else {
                cj cjVar = new cj();
                cjVar.au = 4491614666738664103L * j;
                cjVar.az = -1661911369 * i10;
                cjVar.ad = 1455945163 * i;
                cjVar.ar = -1409386065 * i6;
                cjVar.al = 152909799 * i7;
                cjVar.aq = -1502166075 * i8;
                cjVar.aj = brVar;
                cjVar.ai = -497565757 * i9;
                cjVar.ae = -1759266709 * i2;
                cjVar.ak = 1864047079 * i3;
                int i14 = i12 - 1;
                cjVar.am = 1748703277 * i14;
                int i15 = i3 + i5;
                int i16 = i15 - 1;
                cjVar.as = 632889239 * i16;
                i11 = i2;
                while (i11 < i12) {
                    for (int i17 = i3; i17 < i15; i17++) {
                        i13 = i11 > i2 ? 1 : 0;
                        if (i11 < i14) {
                            i13 += 4;
                        }
                        if (i17 > i3) {
                            i13 += 8;
                        }
                        if (i17 < i16) {
                            i13 += 2;
                        }
                        for (int i18 = i; i18 >= 0; i18--) {
                            if (this.ai[i18][i11][i17] == null) {
                                this.ai[i18][i11][i17] = new bb(i18, i11, i17);
                            }
                        }
                        bbVar = this.ai[i][i11][i17];
                        bbVar.ap[bbVar.ag * 1744025137] = cjVar;
                        bbVar.au[bbVar.ag * 1744025137] = i13;
                        bbVar.az = (i13 | (bbVar.az * -1642971931)) * 1684873453;
                        bbVar.ag += 1426186961;
                    }
                    i11++;
                }
                if (z) {
                    cj[] cjVarArr = this.ak;
                    i11 = this.am;
                    this.am = i11 + 1;
                    cjVarArr[i11] = cjVar;
                }
                return true;
            }
        }
        return false;
    }

    public boolean dd(int i, int i2, int i3, int i4, int i5, int i6, br brVar, int i7, long j, int i8) {
        if (brVar == null) {
            return true;
        }
        return az(i, i2, i3, i5, i6, (i2 * 128) + (i5 * 64), (i3 * 128) + (i6 * 64), i4, brVar, i7, false, j, i8);
    }

    public void de(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.ae = null;
        }
    }

    public boolean df(int i, int i2, int i3, int i4, int i5, br brVar, int i6, long j, int i7, int i8, int i9, int i10) {
        if (brVar == null) {
            return true;
        }
        return az(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, brVar, i6, true, j, 0);
    }

    public void dg(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.ak = null;
        }
    }

    public void dh(int i, int i2, int i3, int i4) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bq bqVar = bbVar.am;
            if (bqVar != null) {
                bqVar.ai = (((bqVar.ai * -589949966) * i4) / 16) * -1543579821;
                bqVar.ae = (((bqVar.ae * 752080774) * i4) / 16) * 2137309873;
            }
        }
    }

    public boolean di(int i, int i2, int i3, int i4, int i5, br brVar, int i6, long j, boolean z) {
        if (brVar == null) {
            return true;
        }
        int i7;
        int i8;
        int i9 = i2 - i5;
        int i10 = i3 - i5;
        int i11 = i2 + i5;
        int i12 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i12 += 128;
            }
            if (i6 > 1152 && i6 < 1920) {
                i11 += 128;
            }
            if (i6 > 1664 || i6 < 384) {
                i10 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i9 -= 128;
                i7 = i12;
                i8 = i11;
                i12 = i9 / 128;
                i11 = i10 / 128;
                return az(i, i12, i11, ((i8 / 128) - i12) + 1, ((i7 / 128) - i11) + 1, i2, i3, i4, brVar, i6, true, j, 0);
            }
        }
        i7 = i12;
        i8 = i11;
        i12 = i9 / 128;
        i11 = i10 / 128;
        return az(i, i12, i11, ((i8 / 128) - i12) + 1, ((i7 / 128) - i11) + 1, i2, i3, i4, brVar, i6, true, j, 0);
    }

    public void dj(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.as = null;
        }
    }

    public void dk(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.ak = null;
        }
    }

    public boolean dl(int i, int i2, int i3, int i4, int i5, br brVar, int i6, long j, int i7, int i8, int i9, int i10) {
        if (brVar == null) {
            return true;
        }
        return az(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, brVar, i6, true, j, 0);
    }

    public boolean dm(int i, int i2, int i3, int i4, int i5, br brVar, int i6, long j, boolean z) {
        if (brVar == null) {
            return true;
        }
        int i7;
        int i8;
        int i9 = i2 - i5;
        int i10 = i3 - i5;
        int i11 = i2 + i5;
        int i12 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i12 += 128;
            }
            if (i6 > 1152 && i6 < 1920) {
                i11 += 128;
            }
            if (i6 > 1664 || i6 < 384) {
                i10 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i9 -= 128;
                i7 = i12;
                i8 = i11;
                i12 = i9 / 128;
                i11 = i10 / 128;
                return az(i, i12, i11, ((i8 / 128) - i12) + 1, ((i7 / 128) - i11) + 1, i2, i3, i4, brVar, i6, true, j, 0);
            }
        }
        i7 = i12;
        i8 = i11;
        i12 = i9 / 128;
        i11 = i10 / 128;
        return az(i, i12, i11, ((i8 / 128) - i12) + 1, ((i7 / 128) - i11) + 1, i2, i3, i4, brVar, i6, true, j, 0);
    }

    public void dn(int i, int i2, int i3, int i4) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bq bqVar = bbVar.am;
            if (bqVar != null) {
                bqVar.ai = (((bqVar.ai * 239961307) * i4) / 16) * -1543579821;
                bqVar.ae = (((bqVar.ae * 697054657) * i4) / 16) * -1444790304;
            }
        }
    }

    /* renamed from: do */
    public void m2do(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.ae = null;
        }
    }

    public void dp(int i, int i2, int i3, int i4) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bq bqVar = bbVar.am;
            if (bqVar != null) {
                bqVar.ai = (((bqVar.ai * 1819967378) * i4) / 16) * 73692522;
                bqVar.ae = (((bqVar.ae * -1713161321) * i4) / 16) * -35982297;
            }
        }
    }

    public void dq(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            for (int i4 = 0; i4 < bbVar.ag * 1744025137; i4++) {
                cj cjVar = bbVar.ap[i4];
                if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i2 && cjVar.ak * 2076633559 == i3) {
                    aw(cjVar);
                    return;
                }
            }
        }
    }

    public boolean dr(int i, int i2, int i3, int i4, int i5, br brVar, int i6, long j, int i7, int i8, int i9, int i10) {
        if (brVar == null) {
            return true;
        }
        return az(i, i7, i8, (i9 - i7) + 1, (i10 - i8) + 1, i2, i3, i4, brVar, i6, true, j, 0);
    }

    public void ds(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.ae = null;
        }
    }

    public boolean dt(int i, int i2, int i3, int i4, int i5, br brVar, int i6, long j, boolean z) {
        if (brVar == null) {
            return true;
        }
        int i7;
        int i8;
        int i9 = i2 - i5;
        int i10 = i3 - i5;
        int i11 = i2 + i5;
        int i12 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i12 += 128;
            }
            if (i6 > 1152 && i6 < 1920) {
                i11 += 128;
            }
            if (i6 > 1664 || i6 < 384) {
                i10 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i9 -= 128;
                i7 = i12;
                i8 = i11;
                i12 = i9 / 128;
                i11 = i10 / 1178575922;
                return az(i, i12, i11, ((i8 / 128) - i12) + 1, ((i7 / 718854306) - i11) + 1, i2, i3, i4, brVar, i6, true, j, 0);
            }
        }
        i7 = i12;
        i8 = i11;
        i12 = i9 / 128;
        i11 = i10 / 1178575922;
        return az(i, i12, i11, ((i8 / 128) - i12) + 1, ((i7 / 718854306) - i11) + 1, i2, i3, i4, brVar, i6, true, j, 0);
    }

    public void du() {
        for (int i = 0; i < this.am; i++) {
            aw(this.ak[i]);
            this.ak[i] = null;
        }
        this.am = 0;
    }

    public boolean dv(int i, int i2, int i3, int i4, int i5, br brVar, int i6, long j, boolean z) {
        if (brVar == null) {
            return true;
        }
        int i7;
        int i8;
        int i9 = i2 - i5;
        int i10 = i3 - i5;
        int i11 = i2 + i5;
        int i12 = i3 + i5;
        if (z) {
            if (i6 > 640 && i6 < 1408) {
                i12 += 128;
            }
            if (i6 > 1152 && i6 < 1920) {
                i11 += 128;
            }
            if (i6 > 1664 || i6 < 384) {
                i10 -= 128;
            }
            if (i6 > 128 && i6 < 896) {
                i9 -= 128;
                i7 = i12;
                i8 = i11;
                i12 = i9 / 128;
                i11 = i10 / 128;
                return az(i, i12, i11, ((i8 / 128) - i12) + 1, ((i7 / 128) - i11) + 1, i2, i3, i4, brVar, i6, true, j, 0);
            }
        }
        i7 = i12;
        i8 = i11;
        i12 = i9 / 128;
        i11 = i10 / 128;
        return az(i, i12, i11, ((i8 / 128) - i12) + 1, ((i7 / 128) - i11) + 1, i2, i3, i4, brVar, i6, true, j, 0);
    }

    public void dw(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.ak = null;
        }
    }

    public void dx(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            for (int i4 = 0; i4 < bbVar.ag * 1744025137; i4++) {
                cj cjVar = bbVar.ap[i4];
                if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i2 && cjVar.ak * 2076633559 == i3) {
                    aw(cjVar);
                    return;
                }
            }
        }
    }

    public void dy(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.am = null;
        }
    }

    public void dz(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.ak = null;
        }
    }

    public bq ea(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return bbVar == null ? null : bbVar.am;
    }

    public int eb(int i, int i2, int i3, long j) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar == null) {
            return -1;
        }
        if (bbVar.ae != null && bbVar.ae.am * 481275275846680293L == j) {
            return (bbVar.ae.ak * -634765075) & 255;
        }
        if (bbVar.am != null && bbVar.am.as * 8643948037242326439L == j) {
            return (bbVar.am.ag * 157239073) & 255;
        }
        int i4;
        int i5;
        if (bbVar.ak == null || bbVar.ak.aj * -6633027865852279199L != j) {
            i4 = 0;
            while (i4 < bbVar.ag * 1744025137) {
                if (bbVar.ap[i4].au * -455156638817647337L == j) {
                    i5 = bbVar.ap[i4].az;
                    i4 = -393609465;
                } else {
                    i4++;
                }
            }
            return -1;
        }
        i5 = bbVar.ak.ai;
        i4 = 182124225;
        return (i4 * i5) & 255;
    }

    public bq ec(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return bbVar == null ? null : bbVar.am;
    }

    public long ed(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar == null) {
            return 0;
        }
        for (int i4 = 0; i4 < bbVar.ag * 1744025137; i4++) {
            cj cjVar = bbVar.ap[i4];
            if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i2 && cjVar.ak * 1584751320 == i3) {
                return cjVar.au * -455156638817647337L;
            }
        }
        return 0;
    }

    public long ee(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.ak == null) ? 0 : bbVar.ak.aj * -6633027865852279199L;
    }

    /* Access modifiers changed, original: 0000 */
    public void ef(bo boVar, int i, int i2, int i3) {
        bb bbVar;
        if (i2 < this.ar) {
            bbVar = this.ai[i][i2 + 1][i3];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 128, 0, 0, true);
            }
        }
        if (i3 < this.ar) {
            bbVar = this.ai[i][i2][i3 + 1];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 0, 0, -9147204, true);
            }
        }
        if (i2 < this.ar && i3 < this.al) {
            bbVar = this.ai[i][i2 + 1][i3 + 1];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 2117503152, 0, -1516644194, true);
            }
        }
        if (i2 < this.ar && i3 > 0) {
            bbVar = this.ai[i][i2 + 1][i3 - 1];
            if (bbVar != null && bbVar.ak != null && (bbVar.ak.al instanceof bo)) {
                bo.ah(boVar, (bo) bbVar.ak.al, -87605761, 0, -766792966, true);
            }
        }
    }

    public long eg(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.am == null) ? 0 : bbVar.am.as * 8643948037242326439L;
    }

    public bm eh(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return bbVar == null ? null : bbVar.ae;
    }

    public bh ei(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.ak == null) ? null : bbVar.ak;
    }

    /* Access modifiers changed, original: 0000 */
    public void ej(bo boVar, int i, int i2, int i3, int i4, int i5) {
        int i6 = i2 + i4;
        int i7 = i3 + i5;
        boolean z = true;
        int i8 = i;
        int i9 = i2;
        while (i8 <= i + 1) {
            int i10;
            if (i8 == this.aq) {
                i10 = i9;
            } else {
                int i11 = i9;
                while (i11 <= i6) {
                    if (i11 >= 0 && i11 < this.ar) {
                        int i12 = i3 - 1;
                        while (i12 <= i7) {
                            if (i12 >= 0 && i12 < this.al && (!z || i11 >= i6 || i12 >= i7 || (i12 < i3 && i11 != i2))) {
                                bb bbVar = this.ai[i8][i11][i12];
                                if (bbVar != null) {
                                    int i13 = i11 + 1;
                                    int i14 = i12 + 1;
                                    int i15 = i2 + 1;
                                    int i16 = i3 + 1;
                                    i15 = ((((this.aj[i8][i11][i12] + this.aj[i8][i13][i12]) + this.aj[i8][i11][i14]) + this.aj[i8][i13][i14]) / 4) - ((((this.aj[i][i2][i3] + this.aj[i][i15][i3]) + this.aj[i][i2][i16]) + this.aj[i][i15][i16]) / 4);
                                    bm bmVar = bbVar.ae;
                                    if (bmVar != null) {
                                        bo boVar2;
                                        if (bmVar.ai instanceof bo) {
                                            boVar2 = boVar;
                                            bo.ah(boVar2, (bo) bmVar.ai, ((1 - i4) * 64) + ((i11 - i2) * 128), i15, ((1 - i5) * 64) + ((i12 - i3) * 128), z);
                                        }
                                        if (bmVar.ae instanceof bo) {
                                            boVar2 = boVar;
                                            bo.ah(boVar2, (bo) bmVar.ae, ((1 - i4) * 64) + ((i11 - i2) * 128), i15, ((1 - i5) * 64) + ((i12 - i3) * 128), z);
                                        }
                                    }
                                    i10 = 0;
                                    while (true) {
                                        i16 = i10;
                                        if (i16 >= bbVar.ag * 1744025137) {
                                            break;
                                        }
                                        cj cjVar = bbVar.ap[i16];
                                        if (cjVar != null && (cjVar.aj instanceof bo)) {
                                            bo boVar3 = (bo) cjVar.aj;
                                            i13 = cjVar.am;
                                            i14 = cjVar.ae;
                                            bo.ah(boVar, boVar3, (((((i13 * 1001322405) - (i14 * -1865206717)) + 1) - i4) * 64) + (((cjVar.ae * -1865206717) - i2) * 128), i15, (((((-1105506265 * cjVar.as) - (2076633559 * cjVar.ak)) + 1) - i5) * 64) + (((cjVar.ak * 2076633559) - i3) * 128), z);
                                        }
                                        i10 = i16 + 1;
                                    }
                                }
                            }
                            i12++;
                        }
                    }
                    i11++;
                    i6 = i6;
                }
                i10 = i9 - 1;
                z = false;
            }
            i8++;
            i9 = i10;
        }
    }

    public cj ek(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar == null) {
            return null;
        }
        for (int i4 = 0; i4 < bbVar.ag * 1744025137; i4++) {
            cj cjVar = bbVar.ap[i4];
            if (ml.aq(cjVar.au * -455156638817647337L) && cjVar.ae * -1865206717 == i2 && cjVar.ak * 2076633559 == i3) {
                return cjVar;
            }
        }
        return null;
    }

    public int el(int i, int i2, int i3, long j) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar == null) {
            return -1;
        }
        int i4;
        int i5;
        if (bbVar.ae != null && bbVar.ae.am * 481275275846680293L == j) {
            i4 = bbVar.ae.ak;
            i5 = -634765075;
        } else if (bbVar.am != null && bbVar.am.as * 8643948037242326439L == j) {
            return (bbVar.am.ag * 157239073) & 255;
        } else {
            if (bbVar.ak == null || bbVar.ak.aj * -6633027865852279199L != j) {
                i5 = 0;
                while (i5 < bbVar.ag * 1744025137) {
                    if (bbVar.ap[i5].au * -455156638817647337L == j) {
                        i4 = bbVar.ap[i5].az;
                        i5 = -393609465;
                    } else {
                        i5++;
                    }
                }
                return -1;
            }
            i4 = bbVar.ak.ai;
            i5 = 182124225;
        }
        return (i5 * i4) & 255;
    }

    /* Access modifiers changed, original: 0000 */
    public void em(bo boVar, int i, int i2, int i3) {
        bb bbVar;
        if (i2 < this.ar) {
            bbVar = this.ai[i][i2 + 1][i3];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 128, 0, 0, true);
            }
        }
        if (i3 < this.ar) {
            bbVar = this.ai[i][i2][i3 + 1];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 0, 0, 555391909, true);
            }
        }
        if (i2 < this.ar && i3 < this.al) {
            bbVar = this.ai[i][i2 + 1][i3 + 1];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, -726280873, 0, 128, true);
            }
        }
        if (i2 < this.ar && i3 > 0) {
            bbVar = this.ai[i][i2 + 1][i3 - 1];
            if (bbVar != null && bbVar.ak != null && (bbVar.ak.al instanceof bo)) {
                bo.ah(boVar, (bo) bbVar.ak.al, 128, 0, -128, true);
            }
        }
    }

    public long en(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.ae == null) ? 0 : bbVar.ae.am * 481275275846680293L;
    }

    public bm eo(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return bbVar == null ? null : bbVar.ae;
    }

    public void ep(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aq; i4++) {
            for (int i5 = 0; i5 < this.ar; i5++) {
                for (int i6 = 0; i6 < this.al; i6++) {
                    bb bbVar = this.ai[i4][i5][i6];
                    if (bbVar != null) {
                        bo boVar;
                        bm bmVar = bbVar.ae;
                        if (bmVar != null && (bmVar.ai instanceof bo)) {
                            boVar = (bo) bmVar.ai;
                            bl(boVar, i4, i5, i6, 1, 1);
                            if (bmVar.ae instanceof bo) {
                                bo boVar2 = (bo) bmVar.ae;
                                bl(boVar2, i4, i5, i6, 1, 1);
                                bo.ah(boVar, boVar2, 0, 0, 0, false);
                                bmVar.ae = boVar2.af(boVar2.ba, boVar2.bs, i, i2, i3);
                            }
                            bmVar.ai = boVar.af(boVar.ba, boVar.bs, i, i2, i3);
                        }
                        int i7 = 0;
                        while (true) {
                            int i8 = i7;
                            if (i8 >= bbVar.ag * 1744025137) {
                                break;
                            }
                            cj cjVar = bbVar.ap[i8];
                            if (cjVar != null && (cjVar.aj instanceof bo)) {
                                boVar = (bo) cjVar.aj;
                                bl(boVar, i4, i5, i6, ((cjVar.am * 1001322405) - (cjVar.ae * -1865206717)) + 1, ((cjVar.as * -1105506265) - (cjVar.ak * 2076633559)) + 1);
                                cjVar.aj = boVar.af(boVar.ba, boVar.bs, i, i2, i3);
                            }
                            i7 = i8 + 1;
                        }
                        bh bhVar = bbVar.ak;
                        if (bhVar != null && (bhVar.al instanceof bo)) {
                            bo boVar3 = (bo) bhVar.al;
                            bo(boVar3, i4, i5, i6);
                            bhVar.al = boVar3.af(boVar3.ba, boVar3.bs, i, i2, i3);
                        }
                    }
                }
            }
        }
    }

    public void eq(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.as = null;
        }
    }

    public long er(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.ak == null) ? 0 : bbVar.ak.aj * -6633027865852279199L;
    }

    /* Access modifiers changed, original: 0000 */
    public void es(bo boVar, int i, int i2, int i3, int i4, int i5) {
        int i6 = i2 + i4;
        int i7 = i3 + i5;
        boolean z = true;
        int i8 = i;
        int i9 = i2;
        while (i8 <= i + 1) {
            int i10;
            if (i8 == this.aq) {
                i10 = i9;
            } else {
                int i11 = i9;
                while (i11 <= i6) {
                    if (i11 >= 0 && i11 < this.ar) {
                        int i12 = i3 - 1;
                        while (i12 <= i7) {
                            if (i12 >= 0 && i12 < this.al && (!z || i11 >= i6 || i12 >= i7 || (i12 < i3 && i11 != i2))) {
                                bb bbVar = this.ai[i8][i11][i12];
                                if (bbVar != null) {
                                    int i13 = i11 + 1;
                                    int i14 = i12 + 1;
                                    int i15 = i2 + 1;
                                    int i16 = i3 + 1;
                                    i15 = ((((this.aj[i8][i11][i12] + this.aj[i8][i13][i12]) + this.aj[i8][i11][i14]) + this.aj[i8][i13][i14]) / 4) - ((((this.aj[i][i2][i3] + this.aj[i][i15][i3]) + this.aj[i][i2][i16]) + this.aj[i][i15][i16]) / 4);
                                    bm bmVar = bbVar.ae;
                                    if (bmVar != null) {
                                        bo boVar2;
                                        if (bmVar.ai instanceof bo) {
                                            boVar2 = boVar;
                                            bo.ah(boVar2, (bo) bmVar.ai, ((1 - i4) * 956701426) + ((i11 - i2) * 128), i15, ((1 - i5) * 64) + ((i12 - i3) * 128), z);
                                        }
                                        if (bmVar.ae instanceof bo) {
                                            boVar2 = boVar;
                                            bo.ah(boVar2, (bo) bmVar.ae, ((1 - i4) * 1784823629) + ((i11 - i2) * 724974859), i15, ((1 - i5) * -1650216699) + ((i12 - i3) * 1060561950), z);
                                        }
                                    }
                                    i10 = 0;
                                    while (true) {
                                        i16 = i10;
                                        if (i16 >= bbVar.ag * -1338963743) {
                                            break;
                                        }
                                        cj cjVar = bbVar.ap[i16];
                                        if (cjVar != null && (cjVar.aj instanceof bo)) {
                                            bo boVar3 = (bo) cjVar.aj;
                                            i13 = cjVar.am;
                                            i14 = cjVar.ae;
                                            bo.ah(boVar, boVar3, (((((i13 * -1033415457) - (i14 * -944429978)) + 1) - i4) * -1466989788) + (((cjVar.ae * -1880286130) - i2) * 273102783), i15, (((((-1105506265 * cjVar.as) - (610676628 * cjVar.ak)) + 1) - i5) * 1084966291) + (((cjVar.ak * 2076633559) - i3) * 1025063993), z);
                                        }
                                        i10 = i16 + 1;
                                    }
                                }
                            }
                            i12++;
                        }
                    }
                    i11++;
                    i6 = i6;
                }
                i10 = i9 - 1;
                z = false;
            }
            i8++;
            i9 = i10;
        }
    }

    public void et(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar != null) {
            bbVar.as = null;
        }
    }

    public long eu(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.ak == null) ? 0 : bbVar.ak.aj * -6633027865852279199L;
    }

    public int ev(int i, int i2, int i3, long j) {
        bb bbVar = this.ai[i][i2][i3];
        if (bbVar == null) {
            return -1;
        }
        if (bbVar.ae != null && bbVar.ae.am * 481275275846680293L == j) {
            return (bbVar.ae.ak * -634765075) & 255;
        }
        int i4;
        int i5;
        if (bbVar.am != null && bbVar.am.as * 8643948037242326439L == j) {
            i4 = bbVar.am.ag;
            i5 = 157239073;
        } else if (bbVar.ak == null || bbVar.ak.aj * -6633027865852279199L != j) {
            for (i5 = 0; i5 < bbVar.ag * 1744025137; i5++) {
                if (bbVar.ap[i5].au * -455156638817647337L == j) {
                    return (bbVar.ap[i5].az * -393609465) & 255;
                }
            }
            return -1;
        } else {
            i4 = bbVar.ak.ai;
            i5 = 182124225;
        }
        return (i5 * i4) & 255;
    }

    public long ew(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.ak == null) ? 0 : bbVar.ak.aj * -6633027865852279199L;
    }

    /* Access modifiers changed, original: 0000 */
    public void ex(bo boVar, int i, int i2, int i3) {
        bb bbVar;
        if (i2 < this.ar) {
            bbVar = this.ai[i][i2 + 1][i3];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 128, 0, 0, true);
            }
        }
        if (i3 < this.ar) {
            bbVar = this.ai[i][i2][i3 + 1];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 0, 0, 128, true);
            }
        }
        if (i2 < this.ar && i3 < this.al) {
            bbVar = this.ai[i][i2 + 1][i3 + 1];
            if (!(bbVar == null || bbVar.ak == null || !(bbVar.ak.al instanceof bo))) {
                bo.ah(boVar, (bo) bbVar.ak.al, 128, 0, 128, true);
            }
        }
        if (i2 < this.ar && i3 > 0) {
            bbVar = this.ai[i][i2 + 1][i3 - 1];
            if (bbVar != null && bbVar.ak != null && (bbVar.ak.al instanceof bo)) {
                bo.ah(boVar, (bo) bbVar.ak.al, 128, 0, -128, true);
            }
        }
    }

    public long ey(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return (bbVar == null || bbVar.am == null) ? 0 : bbVar.am.as * 8643948037242326439L;
    }

    public bm ez(int i, int i2, int i3) {
        bb bbVar = this.ai[i][i2][i3];
        return bbVar == null ? null : bbVar.ae;
    }

    public void fb() {
        bc = true;
    }

    public void fc(int i, int i2, int i3, boolean z) {
        if (!bc.bg() || z) {
            bd = true;
            bc = z;
            bo = i;
            bl = i2;
            bf = i3;
            bb = -1;
            bi = -1;
        }
    }

    public void fn(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        bb bbVar = this.ai[i3][i4][i5];
        if (bbVar != null) {
            av avVar = bbVar.aj;
            int i7;
            if (avVar != null) {
                i7 = avVar.ae * -2093583885;
                if (i7 != 0) {
                    while (i6 < 4) {
                        iArr[i] = i7;
                        iArr[i + 1] = i7;
                        iArr[i + 2] = i7;
                        iArr[i + 3] = i7;
                        i += i2;
                        i6++;
                    }
                    return;
                }
                return;
            }
            bs bsVar = bbVar.ai;
            if (bsVar != null) {
                int i8 = bsVar.ap;
                int i9 = bsVar.au;
                int i10 = bsVar.az;
                int i11 = bsVar.ax;
                int[] iArr2 = this.ci[i8];
                int[] iArr3 = this.cb[i9];
                if ((ViewCompat.MEASURED_SIZE_MASK & i10) != 0) {
                    i7 = 0;
                    i8 = 0;
                    while (i8 < 4) {
                        i6 = i7 + 1;
                        iArr[i] = iArr2[iArr3[i7]] == 0 ? i10 : i11;
                        int i12 = i6 + 1;
                        iArr[i + 1] = iArr2[iArr3[i6]] == 0 ? i10 : i11;
                        i6 = i12 + 1;
                        iArr[i + 2] = iArr2[iArr3[i12]] == 0 ? i10 : i11;
                        iArr[i + 3] = iArr2[iArr3[i6]] == 0 ? i10 : i11;
                        i += i2;
                        i8++;
                        i7 = i6 + 1;
                    }
                    return;
                }
                i7 = 0;
                for (i10 = 0; i10 < 4; i10++) {
                    i6 = i7 + 1;
                    if (iArr2[iArr3[i7]] != 0) {
                        iArr[i] = i11;
                    }
                    i7 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 1] = i11;
                    }
                    i6 = i7 + 1;
                    if (iArr2[iArr3[i7]] != 0) {
                        iArr[i + 2] = i11;
                    }
                    i7 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 3] = i11;
                    }
                    i += i2;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fq(bo boVar, int i, int i2, int i3, int i4, int i5) {
        int i6 = i2 + i4;
        int i7 = i3 + i5;
        boolean z = true;
        int i8 = i;
        int i9 = i2;
        while (i8 <= i + 1) {
            int i10;
            if (i8 == this.aq) {
                i10 = i9;
            } else {
                int i11 = i9;
                while (i11 <= i6) {
                    if (i11 >= 0 && i11 < this.ar) {
                        int i12 = i3 - 1;
                        while (i12 <= i7) {
                            if (i12 >= 0 && i12 < this.al && (!z || i11 >= i6 || i12 >= i7 || (i12 < i3 && i11 != i2))) {
                                bb bbVar = this.ai[i8][i11][i12];
                                if (bbVar != null) {
                                    int i13 = i11 + 1;
                                    int i14 = i12 + 1;
                                    int i15 = i2 + 1;
                                    int i16 = i3 + 1;
                                    i15 = ((((this.aj[i8][i11][i12] + this.aj[i8][i13][i12]) + this.aj[i8][i11][i14]) + this.aj[i8][i13][i14]) / 4) - ((((this.aj[i][i2][i3] + this.aj[i][i15][i3]) + this.aj[i][i2][i16]) + this.aj[i][i15][i16]) / 4);
                                    bm bmVar = bbVar.ae;
                                    if (bmVar != null) {
                                        bo boVar2;
                                        if (bmVar.ai instanceof bo) {
                                            boVar2 = boVar;
                                            bo.ah(boVar2, (bo) bmVar.ai, ((1 - i4) * -2061159665) + ((i11 - i2) * -792436900), i15, ((1 - i5) * -1837697009) + ((i12 - i3) * 128), z);
                                        }
                                        if (bmVar.ae instanceof bo) {
                                            boVar2 = boVar;
                                            bo.ah(boVar2, (bo) bmVar.ae, ((1 - i4) * 4737423) + ((i11 - i2) * 128), i15, ((1 - i5) * 64) + ((i12 - i3) * 518760226), z);
                                        }
                                    }
                                    i10 = 0;
                                    while (true) {
                                        i16 = i10;
                                        if (i16 >= bbVar.ag * 1744025137) {
                                            break;
                                        }
                                        cj cjVar = bbVar.ap[i16];
                                        if (cjVar != null && (cjVar.aj instanceof bo)) {
                                            bo boVar3 = (bo) cjVar.aj;
                                            i13 = cjVar.am;
                                            i14 = cjVar.ae;
                                            bo.ah(boVar, boVar3, (((((i13 * 1001322405) - (i14 * -431057802)) + 1) - i4) * 64) + (((cjVar.ae * -583237967) - i2) * -448436345), i15, (((((1308017909 * cjVar.as) - (2076633559 * cjVar.ak)) + 1) - i5) * 64) + (((cjVar.ak * 2076633559) - i3) * 128), z);
                                        }
                                        i10 = i16 + 1;
                                    }
                                }
                            }
                            i12++;
                        }
                    }
                    i11++;
                    i6 = i6;
                }
                i10 = i9 - 1;
                z = false;
            }
            i8++;
            i9 = i10;
        }
    }

    public void ft(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        bb bbVar = this.ai[i3][i4][i5];
        if (bbVar != null) {
            av avVar = bbVar.aj;
            int i7;
            if (avVar != null) {
                i7 = avVar.ae * -2093583885;
                if (i7 != 0) {
                    while (i6 < 4) {
                        iArr[i] = i7;
                        iArr[i + 1] = i7;
                        iArr[i + 2] = i7;
                        iArr[i + 3] = i7;
                        i += i2;
                        i6++;
                    }
                    return;
                }
                return;
            }
            bs bsVar = bbVar.ai;
            if (bsVar != null) {
                int i8 = bsVar.ap;
                int i9 = bsVar.au;
                int i10 = bsVar.az;
                int i11 = bsVar.ax;
                int[] iArr2 = this.ci[i8];
                int[] iArr3 = this.cb[i9];
                if ((ViewCompat.MEASURED_SIZE_MASK & i10) != 0) {
                    i7 = 0;
                    i8 = 0;
                    while (i8 < 4) {
                        i6 = i7 + 1;
                        iArr[i] = iArr2[iArr3[i7]] == 0 ? i10 : i11;
                        int i12 = i6 + 1;
                        iArr[i + 1] = iArr2[iArr3[i6]] == 0 ? i10 : i11;
                        i6 = i12 + 1;
                        iArr[i + 2] = iArr2[iArr3[i12]] == 0 ? i10 : i11;
                        iArr[i + 3] = iArr2[iArr3[i6]] == 0 ? i10 : i11;
                        i += i2;
                        i8++;
                        i7 = i6 + 1;
                    }
                    return;
                }
                i7 = 0;
                for (i10 = 0; i10 < 4; i10++) {
                    i6 = i7 + 1;
                    if (iArr2[iArr3[i7]] != 0) {
                        iArr[i] = i11;
                    }
                    i7 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 1] = i11;
                    }
                    i6 = i7 + 1;
                    if (iArr2[iArr3[i7]] != 0) {
                        iArr[i + 2] = i11;
                    }
                    i7 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 3] = i11;
                    }
                    i += i2;
                }
            }
        }
    }

    public void fu(int i, int i2, int i3, boolean z) {
        if (!bc.bg() || z) {
            bd = true;
            bc = z;
            bo = i;
            bl = i2;
            bf = i3;
            bb = -1;
            bi = -1;
        }
    }

    public void fw(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        bb bbVar = this.ai[i3][i4][i5];
        if (bbVar != null) {
            av avVar = bbVar.aj;
            int i7;
            if (avVar != null) {
                i7 = avVar.ae * -2093583885;
                if (i7 != 0) {
                    while (i6 < 4) {
                        iArr[i] = i7;
                        iArr[i + 1] = i7;
                        iArr[i + 2] = i7;
                        iArr[i + 3] = i7;
                        i += i2;
                        i6++;
                    }
                    return;
                }
                return;
            }
            bs bsVar = bbVar.ai;
            if (bsVar != null) {
                int i8 = bsVar.ap;
                int i9 = bsVar.au;
                int i10 = bsVar.az;
                int i11 = bsVar.ax;
                int[] iArr2 = this.ci[i8];
                int[] iArr3 = this.cb[i9];
                if ((ViewCompat.MEASURED_SIZE_MASK & i10) != 0) {
                    i7 = 0;
                    i8 = 0;
                    while (i8 < 4) {
                        i6 = i7 + 1;
                        iArr[i] = iArr2[iArr3[i7]] == 0 ? i10 : i11;
                        int i12 = i6 + 1;
                        iArr[i + 1] = iArr2[iArr3[i6]] == 0 ? i10 : i11;
                        i6 = i12 + 1;
                        iArr[i + 2] = iArr2[iArr3[i12]] == 0 ? i10 : i11;
                        iArr[i + 3] = iArr2[iArr3[i6]] == 0 ? i10 : i11;
                        i += i2;
                        i8++;
                        i7 = i6 + 1;
                    }
                    return;
                }
                i7 = 0;
                for (i10 = 0; i10 < 4; i10++) {
                    i6 = i7 + 1;
                    if (iArr2[iArr3[i7]] != 0) {
                        iArr[i] = i11;
                    }
                    i7 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 1] = i11;
                    }
                    i6 = i7 + 1;
                    if (iArr2[iArr3[i7]] != 0) {
                        iArr[i + 2] = i11;
                    }
                    i7 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 3] = i11;
                    }
                    i += i2;
                }
            }
        }
    }

    public void fx(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        bb bbVar = this.ai[i3][i4][i5];
        if (bbVar != null) {
            av avVar = bbVar.aj;
            int i7;
            if (avVar != null) {
                i7 = avVar.ae * -2093583885;
                if (i7 != 0) {
                    while (i6 < 4) {
                        iArr[i] = i7;
                        iArr[i + 1] = i7;
                        iArr[i + 2] = i7;
                        iArr[i + 3] = i7;
                        i += i2;
                        i6++;
                    }
                    return;
                }
                return;
            }
            bs bsVar = bbVar.ai;
            if (bsVar != null) {
                int i8 = bsVar.ap;
                int i9 = bsVar.au;
                int i10 = bsVar.az;
                int i11 = bsVar.ax;
                int[] iArr2 = this.ci[i8];
                int[] iArr3 = this.cb[i9];
                if ((ViewCompat.MEASURED_SIZE_MASK & i10) != 0) {
                    i7 = 0;
                    i8 = 0;
                    while (i8 < 4) {
                        i6 = i7 + 1;
                        iArr[i] = iArr2[iArr3[i7]] == 0 ? i10 : i11;
                        int i12 = i6 + 1;
                        iArr[i + 1] = iArr2[iArr3[i6]] == 0 ? i10 : i11;
                        i6 = i12 + 1;
                        iArr[i + 2] = iArr2[iArr3[i12]] == 0 ? i10 : i11;
                        iArr[i + 3] = iArr2[iArr3[i6]] == 0 ? i10 : i11;
                        i += i2;
                        i8++;
                        i7 = i6 + 1;
                    }
                    return;
                }
                i7 = 0;
                for (i10 = 0; i10 < 4; i10++) {
                    i6 = i7 + 1;
                    if (iArr2[iArr3[i7]] != 0) {
                        iArr[i] = i11;
                    }
                    i7 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 1] = i11;
                    }
                    i6 = i7 + 1;
                    if (iArr2[iArr3[i7]] != 0) {
                        iArr[i + 2] = i11;
                    }
                    i7 = i6 + 1;
                    if (iArr2[iArr3[i6]] != 0) {
                        iArr[i + 3] = i11;
                    }
                    i += i2;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ga(int i, int i2, int i3, int i4) {
        if (!bj(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        int i7 = i5 + 1;
        int i8 = i6 + 1;
        if (!bz(i7, this.aj[i][i2][i3] - i4, i8)) {
            return false;
        }
        int i9 = i2 + 1;
        if (!bz((1760729798 + i5) - 1, this.aj[i][i9][i3] - i4, i8)) {
            return false;
        }
        i8 = i3 + 1;
        return bz((i5 - 1346865063) + -1, this.aj[i][i9][i8] - i4, (-232853715 + i6) + -1) && bz(i7, this.aj[i][i2][i8] - i4, (i6 + 128) - 1);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gb(int i, int i2, int i3) {
        int i4 = this.as[i][i2][i3];
        if (i4 == (-ac)) {
            return false;
        }
        if (i4 == ac) {
            return true;
        }
        i4 = i2 << 7;
        int i5 = i3 << 7;
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        if (bz(i6, this.aj[i][i2][i3], i7)) {
            i4 = (i4 + 128) - 1;
            int i8 = i2 + 1;
            if (bz(i4, this.aj[i][i8][i3], i7)) {
                i7 = i3 + 1;
                i5 = (i5 + 128) - 1;
                if (bz(i4, this.aj[i][i8][i7], i5) && bz(i6, this.aj[i][i2][i7], i5)) {
                    this.as[i][i2][i3] = ac;
                    return true;
                }
            }
        }
        this.as[i][i2][i3] = -ac;
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void ge() {
        int i = bu[aw];
        ay[] ayVarArr = bw[aw];
        br = 0;
        for (int i2 = 0; i2 < i; i2++) {
            ay ayVar = ayVarArr[i2];
            int i3 = 50;
            int i4;
            int i5;
            int i6;
            Object obj;
            ay[] ayVarArr2;
            int i7;
            if (ayVar.aj * -1551263869 == 1) {
                i4 = ((ayVar.ad * -576574329) - ay) + 25;
                if (i4 >= 0 && i4 <= 50) {
                    i5 = ((ayVar.ar * -1515294453) - an) + 25;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i6 = ((ayVar.al * 1018706787) - an) + 25;
                    if (i6 <= 50) {
                        i3 = i6;
                    }
                    while (i5 <= i3) {
                        if (cy[i4][i5]) {
                            obj = 1;
                            break;
                        }
                        i5++;
                    }
                    obj = null;
                    if (obj != null) {
                        i5 = ab - (ayVar.ai * -678323267);
                        if (i5 > 32) {
                            ayVar.ap = 867610651;
                        } else if (i5 < -32) {
                            ayVar.ap = 1735221302;
                            i5 = -i5;
                        }
                        ayVar.ax = ((((ayVar.am * -1454763785) - at) << 8) / i5) * -814992125;
                        ayVar.aw = ((((ayVar.ak * 101603777) - at) << 8) / i5) * -1956336467;
                        ayVar.ac = ((((ayVar.as * -477936417) - av) << 8) / i5) * 993519935;
                        ayVar.aa = ((((ayVar.ag * -2139808907) - av) << 8) / i5) * -1817944301;
                        ayVarArr2 = be;
                        i7 = br;
                        br = i7 + 1;
                        ayVarArr2[i7] = ayVar;
                    }
                }
            } else if (ayVar.aj * -1551263869 == 2) {
                i6 = ((ayVar.ar * -1515294453) - an) + 25;
                if (i6 >= 0 && i6 <= 50) {
                    i5 = ((ayVar.ad * -576574329) - ay) + 25;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i7 = ((ayVar.aq * 2035337693) - ay) + 25;
                    if (i7 <= 50) {
                        i3 = i7;
                    }
                    while (i5 <= i3) {
                        if (cy[i5][i6]) {
                            obj = 1;
                            break;
                        }
                        i5++;
                    }
                    obj = null;
                    if (obj != null) {
                        i5 = at - (ayVar.am * -1454763785);
                        if (i5 > 32) {
                            ayVar.ap = -1692135343;
                        } else if (i5 < -32) {
                            ayVar.ap = -824524692;
                            i5 = -i5;
                        }
                        ayVar.au = ((((ayVar.ai * -678323267) - ab) << 8) / i5) * -1150964081;
                        ayVar.az = ((((ayVar.ae * 1457394279) - ab) << 8) / i5) * -1642138067;
                        ayVar.ac = ((((ayVar.as * -477936417) - av) << 8) / i5) * 993519935;
                        ayVar.aa = ((((ayVar.ag * -2139808907) - av) << 8) / i5) * -1817944301;
                        ayVarArr2 = be;
                        i7 = br;
                        br = i7 + 1;
                        ayVarArr2[i7] = ayVar;
                    }
                }
            } else if (ayVar.aj * -1551263869 == 4) {
                int i8 = (ayVar.as * -477936417) - av;
                if (i8 > 128) {
                    i5 = ((ayVar.ar * -1515294453) - an) + 25;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i7 = ((ayVar.al * 1018706787) - an) + 25;
                    int i9 = i7 > 50 ? 50 : i7;
                    if (i5 <= i9) {
                        i7 = ((ayVar.ad * -576574329) - ay) + 25;
                        if (i7 < 0) {
                            i7 = 0;
                        }
                        i4 = ((ayVar.aq * 2035337693) - ay) + 25;
                        if (i4 > 50) {
                            i6 = i7;
                        } else {
                            i6 = i7;
                            i3 = i4;
                        }
                        while (i6 <= i3) {
                            for (i7 = i5; i7 <= i9; i7++) {
                                if (cy[i6][i7]) {
                                    obj = 1;
                                    break;
                                }
                            }
                            i6++;
                        }
                        obj = null;
                        if (obj != null) {
                            ayVar.ap = 43085959;
                            ayVar.au = ((((ayVar.ai * -678323267) - ab) << 8) / i8) * -1150964081;
                            ayVar.az = ((((ayVar.ae * 1457394279) - ab) << 8) / i8) * -1642138067;
                            ayVar.ax = ((((ayVar.am * -1454763785) - at) << 8) / i8) * -814992125;
                            ayVar.aw = ((((ayVar.ak * 101603777) - at) << 8) / i8) * -1956336467;
                            ayVarArr2 = be;
                            i7 = br;
                            br = i7 + 1;
                            ayVarArr2[i7] = ayVar;
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gf(int i, int i2, int i3) {
        for (int i4 = 0; i4 < br; i4++) {
            ay ayVar = be[i4];
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            if (ayVar.ap * -1399941066 == 1) {
                i5 = (ayVar.ai * -19237500) - i;
                if (i5 > 0) {
                    i6 = ayVar.am;
                    i7 = ayVar.ax;
                    i8 = ayVar.ak;
                    i9 = ayVar.aw;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i3 >= (i6 * -1454763785) + (((i7 * 2091376043) * i5) >> 8) && i3 <= (101603777 * i8) + (((-195341331 * i9) * i5) >> 8) && i2 >= (-1049892790 * i10) + (((1096405773 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * 1696088859) * i5) >> 8) + (-233995216 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * -774010909 == 2) {
                i5 = i - (ayVar.ai * 1939727885);
                if (i5 > 0) {
                    i6 = ayVar.am;
                    i7 = ayVar.ax;
                    i8 = ayVar.ak;
                    i9 = ayVar.aw;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i3 >= (i6 * 34076414) + (((i7 * 2091376043) * i5) >> 8) && i3 <= (101603777 * i8) + (((498139162 * i9) * i5) >> 8) && i2 >= (-477936417 * i10) + (((1882759650 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * 1696088859) * i5) >> 8) + (-2139808907 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * 1808593767 == 3) {
                i5 = (ayVar.am * -1454763785) - i3;
                if (i5 > 0) {
                    i6 = ayVar.ai;
                    i7 = ayVar.au;
                    i8 = ayVar.ae;
                    i9 = ayVar.az;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i >= (i6 * -2064862381) + (((i7 * 2122801747) * i5) >> 8) && i <= (-63372568 * i8) + (((-213502328 * i9) * i5) >> 8) && i2 >= (-1147085220 * i10) + (((-2075228481 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * -1337758006) * i5) >> 8) + (-2139808907 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * 1735240211 == 4) {
                i5 = i3 - (ayVar.am * -1422456433);
                if (i5 > 0) {
                    i6 = ayVar.ai;
                    i7 = ayVar.au;
                    i8 = ayVar.ae;
                    i9 = ayVar.az;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i >= (i6 * -1742258680) + (((i7 * 19109880) * i5) >> 8) && i <= (-1515584971 * i8) + (((860178082 * i9) * i5) >> 8) && i2 >= (-477936417 * i10) + (((-2075228481 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * -520935480) * i5) >> 8) + (-2139808907 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * -729139565 == 5) {
                i5 = i2 - (ayVar.as * -477936417);
                if (i5 > 0) {
                    i6 = ayVar.ai;
                    i7 = ayVar.au;
                    i8 = ayVar.ae;
                    i9 = ayVar.az;
                    i10 = ayVar.am;
                    i11 = ayVar.ax;
                    i12 = ayVar.ak;
                    i13 = ayVar.aw;
                    if (i >= (i6 * -1212958435) + (((i7 * -30822289) * i5) >> 8) && i <= (1457394279 * i8) + (((1829423525 * i9) * i5) >> 8) && i3 >= (-1454763785 * i10) + (((2091376043 * i11) * i5) >> 8)) {
                        if (i3 <= (((i13 * -1390569691) * i5) >> 8) + (1803556634 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gg(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        if (i2 != i3 || i4 != i5) {
            for (i7 = i2; i7 <= i3; i7++) {
                for (i8 = i4; i8 <= i5; i8++) {
                    if (this.as[i][i7][i8] == (-ac)) {
                        return false;
                    }
                }
            }
            i8 = (i2 << 7) + 1;
            i7 = (i4 << 7) + 2;
            i9 = this.aj[i][i2][i4] - i6;
            if (!bz(i8, i9, i7)) {
                return false;
            }
            int i10 = (i3 << 7) - 1;
            if (!bz(i10, i9, i7)) {
                return false;
            }
            i7 = (i5 << 7) - 1;
            return bz(i8, i9, i7) && bz(i10, i9, i7);
        } else if (!bj(i, i2, i4)) {
            return false;
        } else {
            i8 = i2 << 7;
            i7 = i4 << 7;
            i9 = i8 + 1;
            int i11 = i7 + 1;
            if (!bz(i9, this.aj[i][i2][i4] - i6, i11)) {
                return false;
            }
            i8 = (i8 + 128) - 1;
            int i12 = i2 + 1;
            if (!bz(i8, this.aj[i][i12][i4] - i6, i11)) {
                return false;
            }
            i11 = i4 + 1;
            i7 = (i7 + 128) - 1;
            return bz(i8, this.aj[i][i12][i11] - i6, i7) && bz(i9, this.aj[i][i2][i11] - i6, i7);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gj(int i, int i2, int i3, int i4) {
        if (!bj(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        int i7 = i5 + 1;
        int i8 = i6 + 1;
        if (!bz(i7, this.aj[i][i2][i3] - i4, i8)) {
            return false;
        }
        i5 = (i5 + 128) - 1;
        int i9 = i2 + 1;
        if (!bz(i5, this.aj[i][i9][i3] - i4, i8)) {
            return false;
        }
        i8 = i3 + 1;
        i6 = (i6 + 128) - 1;
        return bz(i5, this.aj[i][i9][i8] - i4, i6) && bz(i7, this.aj[i][i2][i8] - i4, i6);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gk(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        if (i2 != i3 || i4 != i5) {
            for (i7 = i2; i7 <= i3; i7++) {
                for (i8 = i4; i8 <= i5; i8++) {
                    if (this.as[i][i7][i8] == (-ac)) {
                        return false;
                    }
                }
            }
            i8 = (i2 << 7) + 1;
            i7 = (i4 << 7) + 2;
            i9 = this.aj[i][i2][i4] - i6;
            if (!bz(i8, i9, i7)) {
                return false;
            }
            int i10 = (i3 << 7) - 1;
            if (!bz(i10, i9, i7)) {
                return false;
            }
            i7 = (i5 << 7) - 1;
            return bz(i8, i9, i7) && bz(i10, i9, i7);
        } else if (!bj(i, i2, i4)) {
            return false;
        } else {
            i8 = i2 << 7;
            i7 = i4 << 7;
            i9 = i8 + 1;
            int i11 = i7 + 1;
            if (!bz(i9, this.aj[i][i2][i4] - i6, i11)) {
                return false;
            }
            i8 = (i8 + 128) - 1;
            int i12 = i2 + 1;
            if (!bz(i8, this.aj[i][i12][i4] - i6, i11)) {
                return false;
            }
            i11 = i4 + 1;
            i7 = (i7 + 128) - 1;
            return bz(i8, this.aj[i][i12][i11] - i6, i7) && bz(i9, this.aj[i][i2][i11] - i6, i7);
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0238 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x049b  */
    /* JADX WARNING: Missing block: B:341:0x094d, code skipped:
            if (r24.aa != false) goto L_0x0803;
     */
    /* JADX WARNING: Missing block: B:349:0x0963, code skipped:
            if (r2.ac != false) goto L_0x0803;
     */
    /* JADX WARNING: Missing block: B:357:0x0979, code skipped:
            if (r2.ac != false) goto L_0x0803;
     */
    /* JADX WARNING: Missing block: B:365:0x098d, code skipped:
            if (r2.ac != false) goto L_0x0803;
     */
    /* JADX WARNING: Missing block: B:373:0x09a3, code skipped:
            if (r2.ac != false) goto L_0x0803;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void gl(bb bbVar, boolean z) {
        bj.aq(bbVar);
        boolean z2 = z;
        while (true) {
            bb bbVar2 = (bb) bj.aj();
            if (bbVar2 != null) {
                if (bbVar2.ac) {
                    bb bbVar3;
                    bm bmVar;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    ab abVar;
                    boolean z3;
                    int i7;
                    int i8 = bbVar2.aq * -1521138591;
                    int i9 = bbVar2.ar * -101201519;
                    int i10 = bbVar2.ad * 997726127;
                    int i11 = bbVar2.al * -1948950653;
                    bb[][] bbVarArr = this.ai[i10];
                    if (bbVar2.aw) {
                        boolean z4;
                        Object obj;
                        bm bmVar2;
                        bq bqVar;
                        if (z2) {
                            if (i10 > 0) {
                                bbVar3 = this.ai[i10 - 1][i8][i9];
                                if (bbVar3 != null && bbVar3.ac) {
                                }
                            }
                            if (i8 <= ay && i8 > aa) {
                                bbVar3 = bbVarArr[i8 - 1][i9];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * -1642971931) & 1) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i8 >= ay && i8 < ao - 1) {
                                bbVar3 = bbVarArr[i8 + 1][i9];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * 468550130) & 4) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i9 <= an && i9 > ah) {
                                bbVar3 = bbVarArr[i8][i9 - 1];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * -1642971931) & 8) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i9 >= an && i9 < af - 1) {
                                bbVar3 = bbVarArr[i8][i9 + 1];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * -1642971931) & 2) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            z4 = z2;
                        } else {
                            z4 = true;
                        }
                        bbVar2.aw = false;
                        if (bbVar2.an != null) {
                            bb bbVar4 = bbVar2.an;
                            if (bbVar4.aj != null) {
                                if (!bj(0, i8, i9)) {
                                    cj.ar(this, bbVar4.aj, 0, bk, ba, bs, bm, i8, i9, (byte) -63);
                                }
                            } else if (!(bbVar4.ai == null || bj(0, i8, i9))) {
                                cj.al(this, bbVar4.ai, bk, ba, bs, bm, i8, i9, -1726396501);
                            }
                            bmVar = bbVar4.ae;
                            if (bmVar != null) {
                                cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * 1815063731) - ab, (bmVar.ad * 1509583973) - av, (bmVar.ar * 973905843) - at, bmVar.am * 481275275846680293L);
                            }
                            for (i = 0; i < bbVar4.ag * 1744025137; i++) {
                                cj cjVar = bbVar4.ap[i];
                                if (cjVar != null) {
                                    cm.ar(cjVar.aj, cjVar.ai * -414603029, bk, ba, bs, bm, (cjVar.ar * 1303844441) - ab, (cjVar.aq * 1618712535) - av, (cjVar.al * -1873967472) - at, cjVar.au * -455156638817647337L);
                                }
                            }
                        }
                        if (bbVar2.aj != null) {
                            if (!bj(i11, i8, i9)) {
                                if (bbVar2.aj.ar * -1289286900 == 2006820192) {
                                    if (!bd) {
                                        i = i10;
                                    } else if (i10 > bo) {
                                        i = i10;
                                    }
                                }
                                cj.ar(this, bbVar2.aj, i11, bk, ba, bs, bm, i8, i9, (byte) -82);
                                i = i10;
                            }
                            obj = null;
                            bmVar2 = bbVar2.ae;
                            bqVar = bbVar2.am;
                            if (bmVar2 == null || bqVar != null) {
                                i = ay == i8 ? 1 : ay < i8 ? 2 : 0;
                                if (an == i9) {
                                    i += 3;
                                } else if (an > i9) {
                                    i += 6;
                                }
                                i2 = bh[i];
                                bbVar2.ay = bn[i] * -1237749589;
                            } else {
                                i2 = 0;
                                i = 0;
                            }
                            if (bmVar2 != null) {
                                if (((bmVar2.al * 945801009) & bt[i]) == 0) {
                                    bbVar2.ao = 0;
                                } else if (bmVar2.al * 1596897862 == 16) {
                                    bbVar2.ao = -1058912729;
                                    bbVar2.ah = bz[i] * -409528552;
                                    bbVar2.af = -806857785 - (bbVar2.ah * 314882457);
                                } else if (bmVar2.al * -843277884 == 1787939592) {
                                    bbVar2.ao = -2117825458;
                                    bbVar2.ah = by[i] * 141635957;
                                    bbVar2.af = 1278347970 - (bbVar2.ah * 314882457);
                                } else if (bmVar2.al * -534559564 == 64) {
                                    bbVar2.ao = 59316380;
                                    bbVar2.ah = bp[i] * 378774384;
                                    bbVar2.af = 1971489790 - (bbVar2.ah * -866512587);
                                } else {
                                    bbVar2.ao = 1118229109;
                                    bbVar2.ah = cv[i] * 141635957;
                                    bbVar2.af = 1566443253 - (bbVar2.ah * -1647060069);
                                }
                                if (((bmVar2.al * -1105918135) & i2) != 0) {
                                    if (!bh(i11, i8, i9, bmVar2.al * 982702649)) {
                                        cm.ar(bmVar2.ai, 0, bk, ba, bs, bm, (bmVar2.aq * -315324960) - ab, (bmVar2.ad * -633331888) - av, (bmVar2.ar * 1372258739) - at, 481275275846680293L * bmVar2.am);
                                    }
                                }
                                if (((bmVar2.aj * -1571286257) & i2) != 0) {
                                    if (!bh(i11, i8, i9, bmVar2.aj * -1571286257)) {
                                        cm.ar(bmVar2.ae, 0, bk, ba, bs, bm, (bmVar2.aq * 1225496502) - ab, (bmVar2.ad * 1509583973) - av, (bmVar2.ar * 854187713) - at, 481275275846680293L * bmVar2.am);
                                    }
                                }
                            }
                            if (bqVar != null) {
                                if (!bt(i11, i8, i9, bqVar.am.bx * -1736982785)) {
                                    if (((bqVar.al * -1477416853) & i2) != 0) {
                                        cm.ar(bqVar.am, 0, bk, ba, bs, bm, ((bqVar.aq * 1244860895) - ab) + (bqVar.ai * 239961307), (bqVar.ad * -1521825133) - av, ((bqVar.ar * -1502926745) - at) + (bqVar.ae * -1713161321), bqVar.as * 8643948037242326439L);
                                    } else if (bqVar.al * -1477416853 == -1364720929) {
                                        i3 = (bqVar.aq * 1244860895) - ab;
                                        i4 = (bqVar.ad * -1765182903) - av;
                                        i5 = (bqVar.ar * -296903029) - at;
                                        i6 = bqVar.aj * 662069296;
                                        i2 = (i6 == 1 || i6 == 2) ? -i3 : i3;
                                        i = (i6 == 2 || i6 == 3) ? -i5 : i5;
                                        if (i < i2) {
                                            cm.ar(bqVar.am, 0, bk, ba, bs, bm, i3 + (bqVar.ai * 1051774913), i4, i5 + (bqVar.ae * -1713161321), bqVar.as * 8643948037242326439L);
                                        } else if (bqVar.ak != null) {
                                            cm.ar(bqVar.ak, 0, bk, ba, bs, bm, i3, i4, i5, bqVar.as * 8643948037242326439L);
                                        }
                                    }
                                }
                            }
                            if (obj != null) {
                                bh bhVar = bbVar2.ak;
                                if (bhVar != null) {
                                    cm.ar(bhVar.al, 0, bk, ba, bs, bm, (bhVar.aq * 1276822213) - ab, (bhVar.ad * 941648137) - av, (bhVar.ar * -1221097181) - at, bhVar.aj * -6633027865852279199L);
                                }
                                abVar = bbVar2.as;
                                if (abVar != null && abVar.am * 1553566440 == 0) {
                                    if (abVar.aj != null) {
                                        cm.ar(abVar.aj, 0, bk, ba, bs, bm, (abVar.aq * -571085571) - ab, (abVar.ad * 953849773) - av, (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                                    }
                                    if (abVar.ai != null) {
                                        cm.ar(abVar.ai, 0, bk, ba, bs, bm, (abVar.aq * -539001157) - ab, (abVar.ad * -878322029) - av, (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                                    }
                                    if (abVar.al != null) {
                                        cm.ar(abVar.al, 0, bk, ba, bs, bm, (abVar.aq * 1619151735) - ab, (abVar.ad * -1734960849) - av, (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                                    }
                                }
                            }
                            i = bbVar2.az * -1642971931;
                            if (i != 0) {
                                bb bbVar5;
                                if (i8 < ay && (i & 4) != 0) {
                                    bbVar5 = bbVarArr[i8 + 1][i9];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i9 < an && (i & 2) != 0) {
                                    bbVar5 = bbVarArr[i8][i9 + 1];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i8 > ay && (i & 1) != 0) {
                                    bbVar5 = bbVarArr[i8 - 1][i9];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i9 > an && (i & 8) != 0) {
                                    bbVar3 = bbVarArr[i8][i9 - 1];
                                    if (bbVar3 != null && bbVar3.ac) {
                                        bj.aq(bbVar3);
                                        z3 = z4;
                                    }
                                }
                            }
                            z3 = z4;
                        } else {
                            if (!(bbVar2.ai == null || bj(i11, i8, i9))) {
                                cj.al(this, bbVar2.ai, bk, ba, bs, bm, i8, i9, 671167479);
                                i = i10;
                            }
                            obj = null;
                            bmVar2 = bbVar2.ae;
                            bqVar = bbVar2.am;
                            if (bmVar2 == null) {
                            }
                            if (ay == i8) {
                            }
                            if (an == i9) {
                            }
                            i2 = bh[i];
                            bbVar2.ay = bn[i] * -1237749589;
                            if (bmVar2 != null) {
                            }
                            if (bqVar != null) {
                            }
                            if (obj != null) {
                            }
                            i = bbVar2.az * -1642971931;
                            if (i != 0) {
                            }
                            z3 = z4;
                        }
                        obj = 1;
                        i10 = i;
                        bmVar2 = bbVar2.ae;
                        bqVar = bbVar2.am;
                        if (bmVar2 == null) {
                        }
                        if (ay == i8) {
                        }
                        if (an == i9) {
                        }
                        i2 = bh[i];
                        bbVar2.ay = bn[i] * -1237749589;
                        if (bmVar2 != null) {
                        }
                        if (bqVar != null) {
                        }
                        if (obj != null) {
                        }
                        i = bbVar2.az * -1642971931;
                        if (i != 0) {
                        }
                        z3 = z4;
                    } else {
                        z3 = z2;
                    }
                    if (bbVar2.ao * -1639555899 != 0) {
                        Object obj2;
                        i = 0;
                        while (i < bbVar2.ag * -411757214) {
                            if (bbVar2.ap[i].ap * -1269013794 != ac && (bbVar2.au[i] & (bbVar2.ao * -1639555899)) == bbVar2.ah * 1702883387) {
                                obj2 = null;
                                break;
                            }
                            i++;
                        }
                        obj2 = 1;
                        if (obj2 != null) {
                            bmVar = bbVar2.ae;
                            if (!bh(i11, i8, i9, bmVar.al * 1773173409)) {
                                cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * -545388198) - av, (bmVar.ar * 1841417777) - at, bmVar.am * 481275275846680293L);
                            }
                            bbVar2.ao = 0;
                        }
                    }
                    if (bbVar2.aa) {
                        try {
                            int i12 = bbVar2.ag;
                            bbVar2.aa = false;
                            int i13 = 0;
                            i6 = 0;
                            while (i6 < 1744025137 * i12) {
                                cj cjVar2 = bbVar2.ap[i6];
                                if (cjVar2.ap * 292301745 != ac) {
                                    i = cjVar2.ae * -1865206717;
                                    while (true) {
                                        i2 = i;
                                        if (i2 <= cjVar2.am * 1001322405) {
                                            i = cjVar2.ak * 2076633559;
                                            while (true) {
                                                i7 = i;
                                                if (i7 > cjVar2.as * 2138867206) {
                                                    break;
                                                }
                                                bb bbVar6 = bbVarArr[i2][i7];
                                                if (bbVar6.aw) {
                                                    bbVar2.aa = true;
                                                    i = i13;
                                                    break;
                                                }
                                                if (bbVar6.ao * 1811910717 != 0) {
                                                    i = i2 > cjVar2.ae * -1865206717 ? 1 : 0;
                                                    if (i2 < cjVar2.am * 1001322405) {
                                                        i += 4;
                                                    }
                                                    if (i7 > cjVar2.ak * 2076633559) {
                                                        i += 8;
                                                    }
                                                    if (i7 < cjVar2.as * -1105506265) {
                                                        i += 2;
                                                    }
                                                    if ((i & (bbVar6.ao * -1639555899)) == bbVar2.af * -858392795) {
                                                        bbVar2.aa = true;
                                                        i = i13;
                                                        break;
                                                    }
                                                }
                                                i = i7 + 1;
                                            }
                                        } else {
                                            bq[i13] = cjVar2;
                                            i7 = ay - (cjVar2.ae * -1865206717);
                                            i = (cjVar2.am * -1657454394) - ay;
                                            if (i <= i7) {
                                                i = i7;
                                            }
                                            i7 = an - (cjVar2.ak * 2076633559);
                                            i2 = (cjVar2.as * 2097964278) - an;
                                            if (i2 > i7) {
                                                cjVar2.ag = (i + i2) * -998662539;
                                            } else {
                                                cjVar2.ag = (i + i7) * -998662539;
                                            }
                                            i = i13 + 1;
                                        }
                                        i = i2 + 1;
                                    }
                                } else {
                                    i = i13;
                                }
                                i6++;
                                i13 = i;
                            }
                            while (i13 > 0) {
                                i7 = -1;
                                i = -50;
                                for (i2 = 0; i2 < i13; i2++) {
                                    cj cjVar3 = bq[i2];
                                    if (cjVar3.ap * 1813748335 != ac) {
                                        if (cjVar3.ag * 212918365 > i) {
                                            i = cjVar3.ag * -1361264163;
                                        } else if (cjVar3.ag * -1361264163 == i) {
                                            i12 = (cjVar3.ar * 1697614929) - ab;
                                            i6 = (cjVar3.al * -1609307177) - at;
                                            int i14 = (bq[i7].ar * -1621983921) - ab;
                                            int i15 = (bq[i7].al * -1609307177) - at;
                                            if ((i6 * i6) + (i12 * i12) > (i14 * i14) + (i15 * i15)) {
                                            }
                                        }
                                        i7 = i2;
                                    }
                                }
                                if (i7 == -1) {
                                    break;
                                }
                                cj cjVar4 = bq[i7];
                                cjVar4.ap = ac * -444891657;
                                if (!bn(i11, cjVar4.ae * -1426696779, cjVar4.am * 1001322405, cjVar4.ak * 474569018, cjVar4.as * -1105506265, cjVar4.aj.bx * 151157302)) {
                                    cm.ar(cjVar4.aj, cjVar4.ai * 110195883, bk, ba, bs, bm, (cjVar4.ar * 79971107) - ab, (cjVar4.aq * 1510327053) - av, (cjVar4.al * -1609307177) - at, cjVar4.au * -455156638817647337L);
                                }
                                i = cjVar4.ae * 1251347004;
                                while (true) {
                                    i7 = i;
                                    if (i7 <= cjVar4.am * -815367645) {
                                        i = cjVar4.ak * -963834302;
                                        while (i <= cjVar4.as * 304184566) {
                                            bb bbVar7 = bbVarArr[i7][i];
                                            if (bbVar7.ao * -1419733765 != 0) {
                                                bj.aq(bbVar7);
                                            } else if (!(i7 == i8 && i == i9) && bbVar7.ac) {
                                                bj.aq(bbVar7);
                                            }
                                            i++;
                                        }
                                        i = i7 + 1;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            bbVar2.aa = false;
                        }
                    }
                    if (bbVar2.ac && bbVar2.ao * -1298728813 == 0) {
                        if (i8 <= ay && i8 > aa) {
                            bbVar3 = bbVarArr[i8 - 1][i9];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i8 >= ay && i8 < ao - 1) {
                            bbVar3 = bbVarArr[i8 + 1][i9];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i9 <= an && i9 > ah) {
                            bbVar3 = bbVarArr[i8][i9 - 1];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i9 >= an && i9 < af - 1) {
                            bbVar3 = bbVarArr[i8][i9 + 1];
                            if (bbVar3 != null) {
                            }
                        }
                        bbVar2.ac = false;
                        ax--;
                        abVar = bbVar2.as;
                        if (!(abVar == null || abVar.am * -1998880189 == 0)) {
                            if (abVar.aj != null) {
                                cm.ar(abVar.aj, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, ((abVar.ad * -1457620205) - av) - (abVar.am * -1154913677), (abVar.ar * 290283014) - at, abVar.ae * 4460578327839330045L);
                            }
                            if (abVar.ai != null) {
                                cm.ar(abVar.ai, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, ((abVar.ad * -878322029) - av) - (abVar.am * -1998880189), (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                            }
                            if (abVar.al != null) {
                                cm.ar(abVar.al, 0, bk, ba, bs, bm, (abVar.aq * 1027584193) - ab, ((abVar.ad * -878322029) - av) - (abVar.am * 940038719), (abVar.ar * -1171343164) - at, abVar.ae * 4460578327839330045L);
                            }
                        }
                        if (bbVar2.ay * -1692006436 != 0) {
                            bq bqVar2 = bbVar2.am;
                            if (bqVar2 != null) {
                                if (!bt(i11, i8, i9, bqVar2.am.bx * -1736982785)) {
                                    if (((bqVar2.al * -979924268) & (bbVar2.ay * 516360707)) != 0) {
                                        cm.ar(bqVar2.am, 0, bk, ba, bs, bm, ((bqVar2.aq * 1244860895) - ab) + (bqVar2.ai * 1984684610), (bqVar2.ad * 2146270563) - av, ((bqVar2.ar * -296903029) - at) + (bqVar2.ae * -1713161321), bqVar2.as * 8643948037242326439L);
                                    } else if (bqVar2.al * -1477416853 == -580218541) {
                                        i3 = (bqVar2.aq * 533049260) - ab;
                                        i4 = (bqVar2.ad * -1765182903) - av;
                                        i5 = (bqVar2.ar * -296903029) - at;
                                        i6 = bqVar2.aj * 1389619833;
                                        i7 = (i6 == 1 || i6 == 2) ? -i3 : i3;
                                        i = (i6 == 2 || i6 == 3) ? -i5 : i5;
                                        if (i >= i7) {
                                            cm.ar(bqVar2.am, 0, bk, ba, bs, bm, i3 + (bqVar2.ai * -1695946407), i4, i5 + (bqVar2.ae * -41019523), bqVar2.as * 8643948037242326439L);
                                        } else if (bqVar2.ak != null) {
                                            cm.ar(bqVar2.ak, 0, bk, ba, bs, bm, i3, i4, i5, bqVar2.as * 8643948037242326439L);
                                        }
                                    }
                                }
                            }
                            bmVar = bbVar2.ae;
                            if (bmVar != null) {
                                if (((bmVar.aj * -1571286257) & (bbVar2.ay * 516360707)) != 0) {
                                    if (!bh(i11, i8, i9, bmVar.aj * -1571286257)) {
                                        cm.ar(bmVar.ae, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * -1204539017) - av, (bmVar.ar * 358888912) - at, bmVar.am * 481275275846680293L);
                                    }
                                }
                                if (((bmVar.al * 1152341371) & (bbVar2.ay * 516360707)) != 0) {
                                    if (!bh(i11, i8, i9, bmVar.al * -1105918135)) {
                                        cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * 1509583973) - av, (bmVar.ar * 1372258739) - at, bmVar.am * 481275275846680293L);
                                    }
                                }
                            }
                        }
                        if (i10 < this.aq - 1) {
                            bbVar3 = this.ai[i10 + 1][i8][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i8 < ay) {
                            bbVar3 = bbVarArr[i8 + 1][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i9 < an) {
                            bbVar3 = bbVarArr[i8][i9 + 1];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i8 > ay) {
                            bbVar3 = bbVarArr[i8 - 1][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i9 > an) {
                            bbVar3 = bbVarArr[i8][i9 - 1];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                    }
                    z2 = z3;
                }
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gm(int i, int i2, int i3, int i4) {
        if (!bj(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        int i7 = i5 + 1;
        int i8 = i6 + 1;
        if (!bz(i7, this.aj[i][i2][i3] - i4, i8)) {
            return false;
        }
        int i9 = i2 + 1;
        if (!bz((75382689 + i5) - 1, this.aj[i][i9][i3] - i4, i8)) {
            return false;
        }
        i8 = i3 + 1;
        return bz((i5 + 128) + -1, this.aj[i][i9][i8] - i4, (90166936 + i6) + -1) && bz(i7, this.aj[i][i2][i8] - i4, (i6 + 128) - 1);
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0238 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x049b  */
    /* JADX WARNING: Missing block: B:341:0x094d, code skipped:
            if (r24.aa != false) goto L_0x0802;
     */
    /* JADX WARNING: Missing block: B:349:0x0963, code skipped:
            if (r2.ac != false) goto L_0x0802;
     */
    /* JADX WARNING: Missing block: B:357:0x0979, code skipped:
            if (r2.ac != false) goto L_0x0802;
     */
    /* JADX WARNING: Missing block: B:365:0x098d, code skipped:
            if (r2.ac != false) goto L_0x0802;
     */
    /* JADX WARNING: Missing block: B:373:0x09a3, code skipped:
            if (r2.ac != false) goto L_0x0802;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void go(bb bbVar, boolean z) {
        bj.aq(bbVar);
        boolean z2 = z;
        while (true) {
            bb bbVar2 = (bb) bj.aj();
            if (bbVar2 != null) {
                if (bbVar2.ac) {
                    bb bbVar3;
                    bm bmVar;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    ab abVar;
                    boolean z3;
                    int i7;
                    int i8 = bbVar2.aq * -84329529;
                    int i9 = bbVar2.ar * -1773123389;
                    int i10 = bbVar2.ad * -1019275405;
                    int i11 = bbVar2.al * -599574517;
                    bb[][] bbVarArr = this.ai[i10];
                    if (bbVar2.aw) {
                        boolean z4;
                        Object obj;
                        bm bmVar2;
                        bq bqVar;
                        if (z2) {
                            if (i10 > 0) {
                                bbVar3 = this.ai[i10 - 1][i8][i9];
                                if (bbVar3 != null && bbVar3.ac) {
                                }
                            }
                            if (i8 <= ay && i8 > aa) {
                                bbVar3 = bbVarArr[i8 - 1][i9];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * 61013433) & 1) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i8 >= ay && i8 < ao - 1) {
                                bbVar3 = bbVarArr[i8 + 1][i9];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * 767659299) & 4) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i9 <= an && i9 > ah) {
                                bbVar3 = bbVarArr[i8][i9 - 1];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * 276266045) & 8) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i9 >= an && i9 < af - 1) {
                                bbVar3 = bbVarArr[i8][i9 + 1];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * 308702080) & 2) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            z4 = z2;
                        } else {
                            z4 = true;
                        }
                        bbVar2.aw = false;
                        if (bbVar2.an != null) {
                            bb bbVar4 = bbVar2.an;
                            if (bbVar4.aj != null) {
                                if (!bj(0, i8, i9)) {
                                    cj.ar(this, bbVar4.aj, 0, bk, ba, bs, bm, i8, i9, (byte) -15);
                                }
                            } else if (!(bbVar4.ai == null || bj(0, i8, i9))) {
                                cj.al(this, bbVar4.ai, bk, ba, bs, bm, i8, i9, 76036152);
                            }
                            bmVar = bbVar4.ae;
                            if (bmVar != null) {
                                cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * 1644890081) - ab, (bmVar.ad * 1509583973) - av, (bmVar.ar * 1466844459) - at, bmVar.am * 481275275846680293L);
                            }
                            for (i = 0; i < bbVar4.ag * 412304225; i++) {
                                cj cjVar = bbVar4.ap[i];
                                if (cjVar != null) {
                                    cm.ar(cjVar.aj, cjVar.ai * 83619272, bk, ba, bs, bm, (cjVar.ar * -1621983921) - ab, (cjVar.aq * -1977148640) - av, (cjVar.al * -506411359) - at, cjVar.au * -455156638817647337L);
                                }
                            }
                        }
                        if (bbVar2.aj != null) {
                            if (!bj(i11, i8, i9)) {
                                if (bbVar2.aj.ar * -89071613 == 925347610) {
                                    if (!bd) {
                                        i = i10;
                                    } else if (i10 > bo) {
                                        i = i10;
                                    }
                                }
                                cj.ar(this, bbVar2.aj, i11, bk, ba, bs, bm, i8, i9, (byte) -15);
                                i = i10;
                            }
                            obj = null;
                            bmVar2 = bbVar2.ae;
                            bqVar = bbVar2.am;
                            if (bmVar2 == null || bqVar != null) {
                                i = ay == i8 ? 1 : ay < i8 ? 2 : 0;
                                if (an == i9) {
                                    i += 3;
                                } else if (an > i9) {
                                    i += 6;
                                }
                                i2 = bh[i];
                                bbVar2.ay = bn[i] * 1730412795;
                            } else {
                                i2 = 0;
                                i = 0;
                            }
                            if (bmVar2 != null) {
                                if (((bmVar2.al * -1105918135) & bt[i]) == 0) {
                                    bbVar2.ao = 0;
                                } else if (bmVar2.al * 1869789667 == 16) {
                                    bbVar2.ao = 459569687;
                                    bbVar2.ah = bz[i] * 321141545;
                                    bbVar2.af = 1323231756 - (bbVar2.ah * 1057178591);
                                } else if (bmVar2.al * -1105918135 == 32) {
                                    bbVar2.ao = 1086310855;
                                    bbVar2.ah = by[i] * 141635957;
                                    bbVar2.af = 1188382862 - (bbVar2.ah * 314882457);
                                } else if (bmVar2.al * -635851119 == 901082158) {
                                    bbVar2.ao = 59316380;
                                    bbVar2.ah = bp[i] * 141635957;
                                    bbVar2.af = 1067536156 - (bbVar2.ah * 314882457);
                                } else {
                                    bbVar2.ao = 1118229109;
                                    bbVar2.ah = cv[i] * -2711203;
                                    bbVar2.af = 2129593324 - (bbVar2.ah * 314882457);
                                }
                                if (((bmVar2.al * -1105918135) & i2) != 0) {
                                    if (!bh(i11, i8, i9, bmVar2.al * 1027007814)) {
                                        cm.ar(bmVar2.ai, 0, bk, ba, bs, bm, (bmVar2.aq * -1832077365) - ab, (bmVar2.ad * -966463978) - av, (bmVar2.ar * 1372258739) - at, 481275275846680293L * bmVar2.am);
                                    }
                                }
                                if (((bmVar2.aj * -1571286257) & i2) != 0) {
                                    if (!bh(i11, i8, i9, bmVar2.aj * 952329125)) {
                                        cm.ar(bmVar2.ae, 0, bk, ba, bs, bm, (bmVar2.aq * 1686898123) - ab, (bmVar2.ad * -1942151661) - av, (bmVar2.ar * -1958198801) - at, 481275275846680293L * bmVar2.am);
                                    }
                                }
                            }
                            if (bqVar != null) {
                                if (!bt(i11, i8, i9, bqVar.am.bx * -1022222849)) {
                                    if (((bqVar.al * -1477416853) & i2) != 0) {
                                        cm.ar(bqVar.am, 0, bk, ba, bs, bm, ((bqVar.aq * 381214118) - ab) + (bqVar.ai * 239961307), (bqVar.ad * -1765182903) - av, ((bqVar.ar * -296903029) - at) + (bqVar.ae * -1713161321), bqVar.as * 8643948037242326439L);
                                    } else if (bqVar.al * -1316456062 == 256) {
                                        i3 = (bqVar.aq * 1244860895) - ab;
                                        i4 = (bqVar.ad * -999327313) - av;
                                        i5 = (bqVar.ar * -296903029) - at;
                                        i6 = bqVar.aj * 1295645540;
                                        i2 = (i6 == 1 || i6 == 2) ? -i3 : i3;
                                        i = (i6 == 2 || i6 == 3) ? -i5 : i5;
                                        if (i < i2) {
                                            cm.ar(bqVar.am, 0, bk, ba, bs, bm, i3 + (bqVar.ai * -1519078696), i4, i5 + (bqVar.ae * -1713161321), bqVar.as * 8643948037242326439L);
                                        } else if (bqVar.ak != null) {
                                            cm.ar(bqVar.ak, 0, bk, ba, bs, bm, i3, i4, i5, bqVar.as * 8643948037242326439L);
                                        }
                                    }
                                }
                            }
                            if (obj != null) {
                                bh bhVar = bbVar2.ak;
                                if (bhVar != null) {
                                    cm.ar(bhVar.al, 0, bk, ba, bs, bm, (bhVar.aq * 897677244) - ab, (bhVar.ad * 1839722015) - av, (bhVar.ar * -1221097181) - at, bhVar.aj * -6633027865852279199L);
                                }
                                abVar = bbVar2.as;
                                if (abVar != null && abVar.am * -1237283636 == 0) {
                                    if (abVar.aj != null) {
                                        cm.ar(abVar.aj, 0, bk, ba, bs, bm, (abVar.aq * -2033008020) - ab, (abVar.ad * -903615965) - av, (abVar.ar * -1660009450) - at, abVar.ae * 4460578327839330045L);
                                    }
                                    if (abVar.ai != null) {
                                        cm.ar(abVar.ai, 0, bk, ba, bs, bm, (abVar.aq * -612610337) - ab, (abVar.ad * -878322029) - av, (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                                    }
                                    if (abVar.al != null) {
                                        cm.ar(abVar.al, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, (abVar.ad * 1621736000) - av, (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                                    }
                                }
                            }
                            i = bbVar2.az * 1322845876;
                            if (i != 0) {
                                bb bbVar5;
                                if (i8 < ay && (i & 4) != 0) {
                                    bbVar5 = bbVarArr[i8 + 1][i9];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i9 < an && (i & 2) != 0) {
                                    bbVar5 = bbVarArr[i8][i9 + 1];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i8 > ay && (i & 1) != 0) {
                                    bbVar5 = bbVarArr[i8 - 1][i9];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i9 > an && (i & 8) != 0) {
                                    bbVar3 = bbVarArr[i8][i9 - 1];
                                    if (bbVar3 != null && bbVar3.ac) {
                                        bj.aq(bbVar3);
                                        z3 = z4;
                                    }
                                }
                            }
                            z3 = z4;
                        } else {
                            if (!(bbVar2.ai == null || bj(i11, i8, i9))) {
                                cj.al(this, bbVar2.ai, bk, ba, bs, bm, i8, i9, -653333196);
                                i = i10;
                            }
                            obj = null;
                            bmVar2 = bbVar2.ae;
                            bqVar = bbVar2.am;
                            if (bmVar2 == null) {
                            }
                            if (ay == i8) {
                            }
                            if (an == i9) {
                            }
                            i2 = bh[i];
                            bbVar2.ay = bn[i] * 1730412795;
                            if (bmVar2 != null) {
                            }
                            if (bqVar != null) {
                            }
                            if (obj != null) {
                            }
                            i = bbVar2.az * 1322845876;
                            if (i != 0) {
                            }
                            z3 = z4;
                        }
                        obj = 1;
                        i10 = i;
                        bmVar2 = bbVar2.ae;
                        bqVar = bbVar2.am;
                        if (bmVar2 == null) {
                        }
                        if (ay == i8) {
                        }
                        if (an == i9) {
                        }
                        i2 = bh[i];
                        bbVar2.ay = bn[i] * 1730412795;
                        if (bmVar2 != null) {
                        }
                        if (bqVar != null) {
                        }
                        if (obj != null) {
                        }
                        i = bbVar2.az * 1322845876;
                        if (i != 0) {
                        }
                        z3 = z4;
                    } else {
                        z3 = z2;
                    }
                    if (bbVar2.ao * -1639555899 != 0) {
                        Object obj2;
                        i = 0;
                        while (i < bbVar2.ag * 1744025137) {
                            if (bbVar2.ap[i].ap * 968163597 != ac && (bbVar2.au[i] & (bbVar2.ao * -231847808)) == bbVar2.ah * -249304364) {
                                obj2 = null;
                                break;
                            }
                            i++;
                        }
                        obj2 = 1;
                        if (obj2 != null) {
                            bmVar = bbVar2.ae;
                            if (!bh(i11, i8, i9, bmVar.al * -1105918135)) {
                                cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * 1187648460) - ab, (bmVar.ad * 514968442) - av, (bmVar.ar * 1372258739) - at, bmVar.am * 481275275846680293L);
                            }
                            bbVar2.ao = 0;
                        }
                    }
                    if (bbVar2.aa) {
                        try {
                            int i12 = bbVar2.ag;
                            bbVar2.aa = false;
                            int i13 = 0;
                            i6 = 0;
                            while (i6 < -1011697542 * i12) {
                                cj cjVar2 = bbVar2.ap[i6];
                                if (cjVar2.ap * -1770208022 != ac) {
                                    i = cjVar2.ae * 1764598959;
                                    while (true) {
                                        i2 = i;
                                        if (i2 <= cjVar2.am * 1001322405) {
                                            i = cjVar2.ak * 2076633559;
                                            while (true) {
                                                i7 = i;
                                                if (i7 > cjVar2.as * -1105506265) {
                                                    break;
                                                }
                                                bb bbVar6 = bbVarArr[i2][i7];
                                                if (bbVar6.aw) {
                                                    bbVar2.aa = true;
                                                    i = i13;
                                                    break;
                                                }
                                                if (bbVar6.ao * -1639555899 != 0) {
                                                    i = i2 > cjVar2.ae * -1865206717 ? 1 : 0;
                                                    if (i2 < cjVar2.am * -218323562) {
                                                        i += 4;
                                                    }
                                                    if (i7 > cjVar2.ak * 2076633559) {
                                                        i += 8;
                                                    }
                                                    if (i7 < cjVar2.as * -38137985) {
                                                        i += 2;
                                                    }
                                                    if ((i & (bbVar6.ao * -440286699)) == bbVar2.af * 1904883448) {
                                                        bbVar2.aa = true;
                                                        i = i13;
                                                        break;
                                                    }
                                                }
                                                i = i7 + 1;
                                            }
                                        } else {
                                            bq[i13] = cjVar2;
                                            i7 = ay - (cjVar2.ae * 1230718895);
                                            i = (cjVar2.am * 1001322405) - ay;
                                            if (i <= i7) {
                                                i = i7;
                                            }
                                            i7 = an - (cjVar2.ak * 2076633559);
                                            i2 = (cjVar2.as * -726581445) - an;
                                            if (i2 > i7) {
                                                cjVar2.ag = (i + i2) * -998662539;
                                            } else {
                                                cjVar2.ag = (i + i7) * -824930953;
                                            }
                                            i = i13 + 1;
                                        }
                                        i = i2 + 1;
                                    }
                                } else {
                                    i = i13;
                                }
                                i6++;
                                i13 = i;
                            }
                            while (i13 > 0) {
                                i7 = -1;
                                i = -662260557;
                                for (i2 = 0; i2 < i13; i2++) {
                                    cj cjVar3 = bq[i2];
                                    if (cjVar3.ap * 1419711128 != ac) {
                                        if (cjVar3.ag * 1831914561 > i) {
                                            i = cjVar3.ag * -1361264163;
                                        } else if (cjVar3.ag * -1030249226 == i) {
                                            i12 = (cjVar3.ar * 972683983) - ab;
                                            i6 = (cjVar3.al * -1609307177) - at;
                                            int i14 = (bq[i7].ar * -1665774684) - ab;
                                            int i15 = (bq[i7].al * -494535656) - at;
                                            if ((i6 * i6) + (i12 * i12) > (i14 * i14) + (i15 * i15)) {
                                            }
                                        }
                                        i7 = i2;
                                    }
                                }
                                if (i7 == -1) {
                                    break;
                                }
                                cj cjVar4 = bq[i7];
                                cjVar4.ap = ac * 90292243;
                                if (!bn(i11, cjVar4.ae * -1865206717, cjVar4.am * 1001322405, cjVar4.ak * 2076633559, cjVar4.as * 355106563, cjVar4.aj.bx * -1900313050)) {
                                    cm.ar(cjVar4.aj, cjVar4.ai * -414603029, bk, ba, bs, bm, (cjVar4.ar * -1621983921) - ab, (cjVar4.aq * 1510327053) - av, (cjVar4.al * -1609307177) - at, cjVar4.au * -455156638817647337L);
                                }
                                i = cjVar4.ae * -1865206717;
                                while (true) {
                                    i7 = i;
                                    if (i7 <= cjVar4.am * -203777276) {
                                        i = cjVar4.ak * 2076633559;
                                        while (i <= cjVar4.as * -1105506265) {
                                            bb bbVar7 = bbVarArr[i7][i];
                                            if (bbVar7.ao * -1639555899 != 0) {
                                                bj.aq(bbVar7);
                                            } else if (!(i7 == i8 && i == i9) && bbVar7.ac) {
                                                bj.aq(bbVar7);
                                            }
                                            i++;
                                        }
                                        i = i7 + 1;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            bbVar2.aa = false;
                        }
                    }
                    if (bbVar2.ac && bbVar2.ao * -1618847706 == 0) {
                        if (i8 <= ay && i8 > aa) {
                            bbVar3 = bbVarArr[i8 - 1][i9];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i8 >= ay && i8 < ao - 1) {
                            bbVar3 = bbVarArr[i8 + 1][i9];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i9 <= an && i9 > ah) {
                            bbVar3 = bbVarArr[i8][i9 - 1];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i9 >= an && i9 < af - 1) {
                            bbVar3 = bbVarArr[i8][i9 + 1];
                            if (bbVar3 != null) {
                            }
                        }
                        bbVar2.ac = false;
                        ax--;
                        abVar = bbVar2.as;
                        if (!(abVar == null || abVar.am * -76856233 == 0)) {
                            if (abVar.aj != null) {
                                cm.ar(abVar.aj, 0, bk, ba, bs, bm, (abVar.aq * 1828654442) - ab, ((abVar.ad * -878322029) - av) - (abVar.am * -1998880189), (abVar.ar * 1563012660) - at, abVar.ae * 4460578327839330045L);
                            }
                            if (abVar.ai != null) {
                                cm.ar(abVar.ai, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, ((abVar.ad * -2127383108) - av) - (abVar.am * -1998880189), (abVar.ar * 998195165) - at, abVar.ae * 4460578327839330045L);
                            }
                            if (abVar.al != null) {
                                cm.ar(abVar.al, 0, bk, ba, bs, bm, (abVar.aq * 1559571354) - ab, ((abVar.ad * -645105072) - av) - (abVar.am * -1998880189), (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                            }
                        }
                        if (bbVar2.ay * 1615776083 != 0) {
                            bq bqVar2 = bbVar2.am;
                            if (bqVar2 != null) {
                                if (!bt(i11, i8, i9, bqVar2.am.bx * -1736982785)) {
                                    if (((bqVar2.al * 1734685679) & (bbVar2.ay * 2133646699)) != 0) {
                                        cm.ar(bqVar2.am, 0, bk, ba, bs, bm, ((bqVar2.aq * 1244860895) - ab) + (bqVar2.ai * -2063386174), (bqVar2.ad * 379722142) - av, ((bqVar2.ar * -296903029) - at) + (bqVar2.ae * -1713161321), bqVar2.as * 8643948037242326439L);
                                    } else if (bqVar2.al * 51452812 == -1943630374) {
                                        i3 = (bqVar2.aq * 126282605) - ab;
                                        i4 = (bqVar2.ad * -1765182903) - av;
                                        i5 = (bqVar2.ar * -296903029) - at;
                                        i6 = bqVar2.aj * 1389619833;
                                        i7 = (i6 == 1 || i6 == 2) ? -i3 : i3;
                                        i = (i6 == 2 || i6 == 3) ? -i5 : i5;
                                        if (i >= i7) {
                                            cm.ar(bqVar2.am, 0, bk, ba, bs, bm, i3 + (bqVar2.ai * -266101565), i4, i5 + (bqVar2.ae * 1058849173), bqVar2.as * 8643948037242326439L);
                                        } else if (bqVar2.ak != null) {
                                            cm.ar(bqVar2.ak, 0, bk, ba, bs, bm, i3, i4, i5, bqVar2.as * 8643948037242326439L);
                                        }
                                    }
                                }
                            }
                            bmVar = bbVar2.ae;
                            if (bmVar != null) {
                                if (((bmVar.aj * 923365027) & (bbVar2.ay * -399295459)) != 0) {
                                    if (!bh(i11, i8, i9, bmVar.aj * 911272499)) {
                                        cm.ar(bmVar.ae, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * 1509583973) - av, (bmVar.ar * 1372258739) - at, bmVar.am * 481275275846680293L);
                                    }
                                }
                                if (((bmVar.al * 1933325806) & (bbVar2.ay * 516360707)) != 0) {
                                    if (!bh(i11, i8, i9, bmVar.al * -839580781)) {
                                        cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * 1509583973) - av, (bmVar.ar * -2024630561) - at, bmVar.am * 481275275846680293L);
                                    }
                                }
                            }
                        }
                        if (i10 < this.aq - 1) {
                            bbVar3 = this.ai[i10 + 1][i8][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i8 < ay) {
                            bbVar3 = bbVarArr[i8 + 1][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i9 < an) {
                            bbVar3 = bbVarArr[i8][i9 + 1];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i8 > ay) {
                            bbVar3 = bbVarArr[i8 - 1][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i9 > an) {
                            bbVar3 = bbVarArr[i8][i9 - 1];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                    }
                    z2 = z3;
                }
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0238 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x049b  */
    /* JADX WARNING: Missing block: B:341:0x094c, code skipped:
            if (r24.aa != false) goto L_0x0802;
     */
    /* JADX WARNING: Missing block: B:349:0x0962, code skipped:
            if (r2.ac != false) goto L_0x0802;
     */
    /* JADX WARNING: Missing block: B:357:0x0978, code skipped:
            if (r2.ac != false) goto L_0x0802;
     */
    /* JADX WARNING: Missing block: B:365:0x098c, code skipped:
            if (r2.ac != false) goto L_0x0802;
     */
    /* JADX WARNING: Missing block: B:373:0x09a2, code skipped:
            if (r2.ac != false) goto L_0x0802;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void gp(bb bbVar, boolean z) {
        bj.aq(bbVar);
        boolean z2 = z;
        while (true) {
            bb bbVar2 = (bb) bj.aj();
            if (bbVar2 != null) {
                if (bbVar2.ac) {
                    bb bbVar3;
                    bm bmVar;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    ab abVar;
                    boolean z3;
                    int i7;
                    int i8 = bbVar2.aq * 760915131;
                    int i9 = bbVar2.ar * 1977372143;
                    int i10 = bbVar2.ad * -1019275405;
                    int i11 = bbVar2.al * -1948950653;
                    bb[][] bbVarArr = this.ai[i10];
                    if (bbVar2.aw) {
                        boolean z4;
                        Object obj;
                        bm bmVar2;
                        bq bqVar;
                        if (z2) {
                            if (i10 > 0) {
                                bbVar3 = this.ai[i10 - 1][i8][i9];
                                if (bbVar3 != null && bbVar3.ac) {
                                }
                            }
                            if (i8 <= ay && i8 > aa) {
                                bbVar3 = bbVarArr[i8 - 1][i9];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * 599574337) & 1) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i8 >= ay && i8 < ao - 1) {
                                bbVar3 = bbVarArr[i8 + 1][i9];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * -1049567594) & 4) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i9 <= an && i9 > ah) {
                                bbVar3 = bbVarArr[i8][i9 - 1];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * -1642971931) & 8) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (i9 >= an && i9 < af - 1) {
                                bbVar3 = bbVarArr[i8][i9 + 1];
                                if (bbVar3 != null) {
                                    if (bbVar3.ac) {
                                        if (!bbVar3.aw) {
                                            if (((bbVar2.az * 1353572741) & 2) == 0) {
                                            }
                                        }
                                    }
                                }
                            }
                            z4 = z2;
                        } else {
                            z4 = true;
                        }
                        bbVar2.aw = false;
                        if (bbVar2.an != null) {
                            bb bbVar4 = bbVar2.an;
                            if (bbVar4.aj != null) {
                                if (!bj(0, i8, i9)) {
                                    cj.ar(this, bbVar4.aj, 0, bk, ba, bs, bm, i8, i9, (byte) -24);
                                }
                            } else if (!(bbVar4.ai == null || bj(0, i8, i9))) {
                                cj.al(this, bbVar4.ai, bk, ba, bs, bm, i8, i9, -883516251);
                            }
                            bmVar = bbVar4.ae;
                            if (bmVar != null) {
                                cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * -648669403) - ab, (bmVar.ad * 111919674) - av, (bmVar.ar * 787002718) - at, bmVar.am * 481275275846680293L);
                            }
                            for (i = 0; i < bbVar4.ag * 1744025137; i++) {
                                cj cjVar = bbVar4.ap[i];
                                if (cjVar != null) {
                                    cm.ar(cjVar.aj, cjVar.ai * 133805894, bk, ba, bs, bm, (cjVar.ar * -449802014) - ab, (cjVar.aq * 1510327053) - av, (cjVar.al * -1609307177) - at, cjVar.au * -455156638817647337L);
                                }
                            }
                        }
                        if (bbVar2.aj != null) {
                            if (!bj(i11, i8, i9)) {
                                if (bbVar2.aj.ar * -1332195424 == 12345678) {
                                    if (!bd) {
                                        i = i10;
                                    } else if (i10 > bo) {
                                        i = i10;
                                    }
                                }
                                cj.ar(this, bbVar2.aj, i11, bk, ba, bs, bm, i8, i9, (byte) -78);
                                i = i10;
                            }
                            obj = null;
                            bmVar2 = bbVar2.ae;
                            bqVar = bbVar2.am;
                            if (bmVar2 == null || bqVar != null) {
                                i = ay == i8 ? 1 : ay < i8 ? 2 : 0;
                                if (an == i9) {
                                    i += 3;
                                } else if (an > i9) {
                                    i += 6;
                                }
                                i2 = bh[i];
                                bbVar2.ay = bn[i] * -1536112715;
                            } else {
                                i2 = 0;
                                i = 0;
                            }
                            if (bmVar2 != null) {
                                if (((bmVar2.al * -1105918135) & bt[i]) == 0) {
                                    bbVar2.ao = 0;
                                } else if (bmVar2.al * -1105918135 == 16) {
                                    bbVar2.ao = -822819717;
                                    bbVar2.ah = bz[i] * -52966950;
                                    bbVar2.af = 682417610 - (bbVar2.ah * 314882457);
                                } else if (bmVar2.al * -1105918135 == -40866856) {
                                    bbVar2.ao = -2117825458;
                                    bbVar2.ah = by[i] * -1787411409;
                                    bbVar2.af = -1613715570 - (bbVar2.ah * -1497839514);
                                } else if (bmVar2.al * -1105918135 == 64) {
                                    bbVar2.ao = -1758083989;
                                    bbVar2.ah = bp[i] * 141635957;
                                    bbVar2.af = 1067536156 - (bbVar2.ah * 1104793130);
                                } else {
                                    bbVar2.ao = 1118229109;
                                    bbVar2.ah = cv[i] * 141635957;
                                    bbVar2.af = 1874393941 - (bbVar2.ah * 1177764752);
                                }
                                if (((bmVar2.al * 436107347) & i2) != 0) {
                                    if (!bh(i11, i8, i9, bmVar2.al * 762158409)) {
                                        cm.ar(bmVar2.ai, 0, bk, ba, bs, bm, (bmVar2.aq * -349183270) - ab, (bmVar2.ad * -1575582776) - av, (bmVar2.ar * 1372258739) - at, 481275275846680293L * bmVar2.am);
                                    }
                                }
                                if (((bmVar2.aj * -1571286257) & i2) != 0) {
                                    if (!bh(i11, i8, i9, bmVar2.aj * -1571286257)) {
                                        cm.ar(bmVar2.ae, 0, bk, ba, bs, bm, (bmVar2.aq * -1813987076) - ab, (bmVar2.ad * -827315285) - av, (bmVar2.ar * -743134521) - at, 481275275846680293L * bmVar2.am);
                                    }
                                }
                            }
                            if (bqVar != null) {
                                if (!bt(i11, i8, i9, bqVar.am.bx * -466942258)) {
                                    if (((bqVar.al * -1477416853) & i2) != 0) {
                                        cm.ar(bqVar.am, 0, bk, ba, bs, bm, ((bqVar.aq * 1244860895) - ab) + (bqVar.ai * -1030613705), (bqVar.ad * 1560693255) - av, ((bqVar.ar * -296903029) - at) + (bqVar.ae * -614918479), bqVar.as * 8643948037242326439L);
                                    } else if (bqVar.al * 1581310165 == 256) {
                                        i3 = (bqVar.aq * 602140298) - ab;
                                        i4 = (bqVar.ad * 1738987951) - av;
                                        i5 = (bqVar.ar * 1367379485) - at;
                                        i6 = bqVar.aj * 1389619833;
                                        i2 = (i6 == 1 || i6 == 2) ? -i3 : i3;
                                        i = (i6 == 2 || i6 == 3) ? -i5 : i5;
                                        if (i < i2) {
                                            cm.ar(bqVar.am, 0, bk, ba, bs, bm, i3 + (bqVar.ai * 239961307), i4, i5 + (bqVar.ae * -590443002), bqVar.as * 8643948037242326439L);
                                        } else if (bqVar.ak != null) {
                                            cm.ar(bqVar.ak, 0, bk, ba, bs, bm, i3, i4, i5, bqVar.as * 8643948037242326439L);
                                        }
                                    }
                                }
                            }
                            if (obj != null) {
                                bh bhVar = bbVar2.ak;
                                if (bhVar != null) {
                                    cm.ar(bhVar.al, 0, bk, ba, bs, bm, (bhVar.aq * 541190615) - ab, (bhVar.ad * -1607331987) - av, (bhVar.ar * -1221097181) - at, bhVar.aj * -6633027865852279199L);
                                }
                                abVar = bbVar2.as;
                                if (abVar != null && abVar.am * 72836349 == 0) {
                                    if (abVar.aj != null) {
                                        cm.ar(abVar.aj, 0, bk, ba, bs, bm, (abVar.aq * 1146349599) - ab, (abVar.ad * -192817265) - av, (abVar.ar * -962368799) - at, abVar.ae * 4460578327839330045L);
                                    }
                                    if (abVar.ai != null) {
                                        cm.ar(abVar.ai, 0, bk, ba, bs, bm, (abVar.aq * 1668203820) - ab, (abVar.ad * 1162829186) - av, (abVar.ar * -1220279614) - at, abVar.ae * 4460578327839330045L);
                                    }
                                    if (abVar.al != null) {
                                        cm.ar(abVar.al, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, (abVar.ad * -878322029) - av, (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                                    }
                                }
                            }
                            i = bbVar2.az * -1642971931;
                            if (i != 0) {
                                bb bbVar5;
                                if (i8 < ay && (i & 4) != 0) {
                                    bbVar5 = bbVarArr[i8 + 1][i9];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i9 < an && (i & 2) != 0) {
                                    bbVar5 = bbVarArr[i8][i9 + 1];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i8 > ay && (i & 1) != 0) {
                                    bbVar5 = bbVarArr[i8 - 1][i9];
                                    if (bbVar5 != null && bbVar5.ac) {
                                        bj.aq(bbVar5);
                                    }
                                }
                                if (i9 > an && (i & 8) != 0) {
                                    bbVar3 = bbVarArr[i8][i9 - 1];
                                    if (bbVar3 != null && bbVar3.ac) {
                                        bj.aq(bbVar3);
                                        z3 = z4;
                                    }
                                }
                            }
                            z3 = z4;
                        } else {
                            if (!(bbVar2.ai == null || bj(i11, i8, i9))) {
                                cj.al(this, bbVar2.ai, bk, ba, bs, bm, i8, i9, -568348121);
                                i = i10;
                            }
                            obj = null;
                            bmVar2 = bbVar2.ae;
                            bqVar = bbVar2.am;
                            if (bmVar2 == null) {
                            }
                            if (ay == i8) {
                            }
                            if (an == i9) {
                            }
                            i2 = bh[i];
                            bbVar2.ay = bn[i] * -1536112715;
                            if (bmVar2 != null) {
                            }
                            if (bqVar != null) {
                            }
                            if (obj != null) {
                            }
                            i = bbVar2.az * -1642971931;
                            if (i != 0) {
                            }
                            z3 = z4;
                        }
                        obj = 1;
                        i10 = i;
                        bmVar2 = bbVar2.ae;
                        bqVar = bbVar2.am;
                        if (bmVar2 == null) {
                        }
                        if (ay == i8) {
                        }
                        if (an == i9) {
                        }
                        i2 = bh[i];
                        bbVar2.ay = bn[i] * -1536112715;
                        if (bmVar2 != null) {
                        }
                        if (bqVar != null) {
                        }
                        if (obj != null) {
                        }
                        i = bbVar2.az * -1642971931;
                        if (i != 0) {
                        }
                        z3 = z4;
                    } else {
                        z3 = z2;
                    }
                    if (bbVar2.ao * -1639555899 != 0) {
                        Object obj2;
                        i = 0;
                        while (i < bbVar2.ag * 544931586) {
                            if (bbVar2.ap[i].ap * -377725844 != ac && (bbVar2.au[i] & (bbVar2.ao * -1639555899)) == bbVar2.ah * 1672531202) {
                                obj2 = null;
                                break;
                            }
                            i++;
                        }
                        obj2 = 1;
                        if (obj2 != null) {
                            bmVar = bbVar2.ae;
                            if (!bh(i11, i8, i9, bmVar.al * -1105918135)) {
                                cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * 1348438207) - av, (bmVar.ar * 1705797047) - at, bmVar.am * 481275275846680293L);
                            }
                            bbVar2.ao = 0;
                        }
                    }
                    if (bbVar2.aa) {
                        try {
                            int i12 = bbVar2.ag;
                            bbVar2.aa = false;
                            int i13 = 0;
                            i6 = 0;
                            while (i6 < 1744025137 * i12) {
                                cj cjVar2 = bbVar2.ap[i6];
                                if (cjVar2.ap * 1867085005 != ac) {
                                    i = cjVar2.ae * -334913439;
                                    while (true) {
                                        i2 = i;
                                        if (i2 <= cjVar2.am * 1001322405) {
                                            i = cjVar2.ak * 2048937554;
                                            while (true) {
                                                i7 = i;
                                                if (i7 > cjVar2.as * 2038981971) {
                                                    break;
                                                }
                                                bb bbVar6 = bbVarArr[i2][i7];
                                                if (bbVar6.aw) {
                                                    bbVar2.aa = true;
                                                    i = i13;
                                                    break;
                                                }
                                                if (bbVar6.ao * -1639555899 != 0) {
                                                    i = i2 > cjVar2.ae * 955508750 ? 1 : 0;
                                                    if (i2 < cjVar2.am * 1001322405) {
                                                        i += 4;
                                                    }
                                                    if (i7 > cjVar2.ak * 2090000572) {
                                                        i += 8;
                                                    }
                                                    if (i7 < cjVar2.as * -1105506265) {
                                                        i += 2;
                                                    }
                                                    if ((i & (bbVar6.ao * -1287314087)) == bbVar2.af * -171148827) {
                                                        bbVar2.aa = true;
                                                        i = i13;
                                                        break;
                                                    }
                                                }
                                                i = i7 + 1;
                                            }
                                        } else {
                                            bq[i13] = cjVar2;
                                            i7 = ay - (cjVar2.ae * -1071873277);
                                            i = (cjVar2.am * 1001322405) - ay;
                                            if (i <= i7) {
                                                i = i7;
                                            }
                                            i7 = an - (cjVar2.ak * 806891075);
                                            i2 = (cjVar2.as * 1564843713) - an;
                                            if (i2 > i7) {
                                                cjVar2.ag = (i + i2) * 2022381391;
                                            } else {
                                                cjVar2.ag = (i + i7) * -1493654153;
                                            }
                                            i = i13 + 1;
                                        }
                                        i = i2 + 1;
                                    }
                                } else {
                                    i = i13;
                                }
                                i6++;
                                i13 = i;
                            }
                            while (i13 > 0) {
                                i7 = -1;
                                i = -50;
                                for (i2 = 0; i2 < i13; i2++) {
                                    cj cjVar3 = bq[i2];
                                    if (cjVar3.ap * 61232071 != ac) {
                                        if (cjVar3.ag * -1361264163 > i) {
                                            i = cjVar3.ag * -210461319;
                                        } else if (cjVar3.ag * 1383572069 == i) {
                                            i12 = (cjVar3.ar * -1621983921) - ab;
                                            i6 = (cjVar3.al * -1609307177) - at;
                                            int i14 = (bq[i7].ar * -1621983921) - ab;
                                            int i15 = (bq[i7].al * -1609307177) - at;
                                            if ((i6 * i6) + (i12 * i12) > (i14 * i14) + (i15 * i15)) {
                                            }
                                        }
                                        i7 = i2;
                                    }
                                }
                                if (i7 == -1) {
                                    break;
                                }
                                cj cjVar4 = bq[i7];
                                cjVar4.ap = ac * -444891657;
                                if (!bn(i11, cjVar4.ae * -1865206717, cjVar4.am * 1001322405, cjVar4.ak * 865201007, cjVar4.as * -393668331, cjVar4.aj.bx * -1736982785)) {
                                    cm.ar(cjVar4.aj, cjVar4.ai * -414603029, bk, ba, bs, bm, (cjVar4.ar * -1621983921) - ab, (cjVar4.aq * 1510327053) - av, (cjVar4.al * -698626778) - at, cjVar4.au * -455156638817647337L);
                                }
                                i = cjVar4.ae * 1096563754;
                                while (true) {
                                    i7 = i;
                                    if (i7 <= cjVar4.am * 747024482) {
                                        i = cjVar4.ak * 118455087;
                                        while (i <= cjVar4.as * 1070889544) {
                                            bb bbVar7 = bbVarArr[i7][i];
                                            if (bbVar7.ao * 1494789113 != 0) {
                                                bj.aq(bbVar7);
                                            } else if (!(i7 == i8 && i == i9) && bbVar7.ac) {
                                                bj.aq(bbVar7);
                                            }
                                            i++;
                                        }
                                        i = i7 + 1;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            bbVar2.aa = false;
                        }
                    }
                    if (bbVar2.ac && bbVar2.ao * 665494061 == 0) {
                        if (i8 <= ay && i8 > aa) {
                            bbVar3 = bbVarArr[i8 - 1][i9];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i8 >= ay && i8 < ao - 1) {
                            bbVar3 = bbVarArr[i8 + 1][i9];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i9 <= an && i9 > ah) {
                            bbVar3 = bbVarArr[i8][i9 - 1];
                            if (bbVar3 != null) {
                            }
                        }
                        if (i9 >= an && i9 < af - 1) {
                            bbVar3 = bbVarArr[i8][i9 + 1];
                            if (bbVar3 != null) {
                            }
                        }
                        bbVar2.ac = false;
                        ax--;
                        abVar = bbVar2.as;
                        if (!(abVar == null || abVar.am * -403324711 == 0)) {
                            if (abVar.aj != null) {
                                cm.ar(abVar.aj, 0, bk, ba, bs, bm, (abVar.aq * 1153840930) - ab, ((abVar.ad * 1560472021) - av) - (abVar.am * -1998880189), (abVar.ar * 1018972415) - at, abVar.ae * 4460578327839330045L);
                            }
                            if (abVar.ai != null) {
                                cm.ar(abVar.ai, 0, bk, ba, bs, bm, (abVar.aq * 1345930193) - ab, ((abVar.ad * 760552560) - av) - (abVar.am * 807060652), (abVar.ar * 968229634) - at, abVar.ae * 4460578327839330045L);
                            }
                            if (abVar.al != null) {
                                cm.ar(abVar.al, 0, bk, ba, bs, bm, (abVar.aq * 2133187693) - ab, ((abVar.ad * 501253203) - av) - (abVar.am * 683503471), (abVar.ar * -1546891151) - at, abVar.ae * 4460578327839330045L);
                            }
                        }
                        if (bbVar2.ay * 516360707 != 0) {
                            bq bqVar2 = bbVar2.am;
                            if (bqVar2 != null) {
                                if (!bt(i11, i8, i9, bqVar2.am.bx * -31733616)) {
                                    if (((bqVar2.al * 1934551817) & (bbVar2.ay * 1952659680)) != 0) {
                                        cm.ar(bqVar2.am, 0, bk, ba, bs, bm, ((bqVar2.aq * 1244860895) - ab) + (bqVar2.ai * -1960352484), (bqVar2.ad * 1232842945) - av, ((bqVar2.ar * -296903029) - at) + (bqVar2.ae * -1713161321), bqVar2.as * 8643948037242326439L);
                                    } else if (bqVar2.al * -1477416853 == -1121742497) {
                                        i3 = (bqVar2.aq * 1244860895) - ab;
                                        i4 = (bqVar2.ad * -1765182903) - av;
                                        i5 = (bqVar2.ar * -296903029) - at;
                                        i6 = bqVar2.aj * 1389619833;
                                        i7 = (i6 == 1 || i6 == 2) ? -i3 : i3;
                                        i = (i6 == 2 || i6 == 3) ? -i5 : i5;
                                        if (i >= i7) {
                                            cm.ar(bqVar2.am, 0, bk, ba, bs, bm, i3 + (bqVar2.ai * 239961307), i4, i5 + (bqVar2.ae * 1766951283), bqVar2.as * 8643948037242326439L);
                                        } else if (bqVar2.ak != null) {
                                            cm.ar(bqVar2.ak, 0, bk, ba, bs, bm, i3, i4, i5, bqVar2.as * 8643948037242326439L);
                                        }
                                    }
                                }
                            }
                            bmVar = bbVar2.ae;
                            if (bmVar != null) {
                                if (((bmVar.aj * 800555472) & (bbVar2.ay * 516360707)) != 0) {
                                    if (!bh(i11, i8, i9, bmVar.aj * 1405491774)) {
                                        cm.ar(bmVar.ae, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * 836913679) - av, (bmVar.ar * 691600265) - at, bmVar.am * 481275275846680293L);
                                    }
                                }
                                if (((bmVar.al * -592298710) & (bbVar2.ay * 472126464)) != 0) {
                                    if (!bh(i11, i8, i9, bmVar.al * -2094457189)) {
                                        cm.ar(bmVar.ai, 0, bk, ba, bs, bm, (bmVar.aq * -1832077365) - ab, (bmVar.ad * -265648927) - av, (bmVar.ar * 1372258739) - at, bmVar.am * 481275275846680293L);
                                    }
                                }
                            }
                        }
                        if (i10 < this.aq - 1) {
                            bbVar3 = this.ai[i10 + 1][i8][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i8 < ay) {
                            bbVar3 = bbVarArr[i8 + 1][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i9 < an) {
                            bbVar3 = bbVarArr[i8][i9 + 1];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i8 > ay) {
                            bbVar3 = bbVarArr[i8 - 1][i9];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                        if (i9 > an) {
                            bbVar3 = bbVarArr[i8][i9 - 1];
                            if (bbVar3 != null && bbVar3.ac) {
                                bj.aq(bbVar3);
                            }
                        }
                    }
                    z2 = z3;
                }
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gq(int i, int i2, int i3) {
        for (int i4 = 0; i4 < br; i4++) {
            ay ayVar = be[i4];
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            if (ayVar.ap * 1735240211 == 1) {
                i5 = (ayVar.ai * -678323267) - i;
                if (i5 > 0) {
                    i6 = ayVar.am;
                    i7 = ayVar.ax;
                    i8 = ayVar.ak;
                    i9 = ayVar.aw;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i3 >= (i6 * -1454763785) + (((i7 * 2091376043) * i5) >> 8) && i3 <= (101603777 * i8) + (((1782941461 * i9) * i5) >> 8) && i2 >= (1922366229 * i10) + (((-923822746 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * 1696088859) * i5) >> 8) + (1185814466 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * 868460173 == 2) {
                i5 = i - (ayVar.ai * -1048223817);
                if (i5 > 0) {
                    i6 = ayVar.am;
                    i7 = ayVar.ax;
                    i8 = ayVar.ak;
                    i9 = ayVar.aw;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i3 >= (i6 * 34064751) + (((i7 * 2091376043) * i5) >> 8) && i3 <= (-857525941 * i8) + (((-1390569691 * i9) * i5) >> 8) && i2 >= (-988256616 * i10) + (((1167222548 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * 1696088859) * i5) >> 8) + (-2139808907 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * 1735240211 == 3) {
                i5 = (ayVar.am * -1454763785) - i3;
                if (i5 > 0) {
                    i6 = ayVar.ai;
                    i7 = ayVar.au;
                    i8 = ayVar.ae;
                    i9 = ayVar.az;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i >= (i6 * -678323267) + (((i7 * -30822289) * i5) >> 8) && i <= (207971864 * i8) + (((1829423525 * i9) * i5) >> 8) && i2 >= (360663409 * i10) + (((-2075228481 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * -31136301) * i5) >> 8) + (-2139808907 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * 1735240211 == 4) {
                i5 = i3 - (ayVar.am * -1454763785);
                if (i5 > 0) {
                    i6 = ayVar.ai;
                    i7 = ayVar.au;
                    i8 = ayVar.ae;
                    i9 = ayVar.az;
                    i10 = ayVar.as;
                    i11 = ayVar.ac;
                    i12 = ayVar.ag;
                    i13 = ayVar.aa;
                    if (i >= (i6 * 1210349601) + (((i7 * 426636688) * i5) >> 8) && i <= (516078724 * i8) + (((1829423525 * i9) * i5) >> 8) && i2 >= (-477936417 * i10) + (((-2075228481 * i11) * i5) >> 8)) {
                        if (i2 <= (((i13 * 1696088859) * i5) >> 8) + (915504785 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (ayVar.ap * 1735240211 == 5) {
                i5 = i2 - (ayVar.as * 924402024);
                if (i5 > 0) {
                    i6 = ayVar.ai;
                    i7 = ayVar.au;
                    i8 = ayVar.ae;
                    i9 = ayVar.az;
                    i10 = ayVar.am;
                    i11 = ayVar.ax;
                    i12 = ayVar.ak;
                    i13 = ayVar.aw;
                    if (i >= (i6 * -678323267) + (((i7 * -30822289) * i5) >> 8) && i <= (487001307 * i8) + (((-999038643 * i9) * i5) >> 8) && i3 >= (-1454763785 * i10) + (((2091376043 * i11) * i5) >> 8)) {
                        if (i3 <= (((i13 * -1748808486) * i5) >> 8) + (-1471075497 * i12)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gr(int i, int i2, int i3) {
        int i4 = this.as[i][i2][i3];
        if (i4 == (-ac)) {
            return false;
        }
        if (i4 == ac) {
            return true;
        }
        i4 = i2 << 7;
        int i5 = i3 << 7;
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        if (bz(i6, this.aj[i][i2][i3], i7)) {
            i4 = (i4 + 128) - 1;
            int i8 = i2 + 1;
            if (bz(i4, this.aj[i][i8][i3], i7)) {
                i7 = i3 + 1;
                i5 = (i5 + 128) - 1;
                if (bz(i4, this.aj[i][i8][i7], i5) && bz(i6, this.aj[i][i2][i7], i5)) {
                    this.as[i][i2][i3] = ac;
                    return true;
                }
            }
        }
        this.as[i][i2][i3] = -ac;
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void gs() {
        int i = bu[aw];
        ay[] ayVarArr = bw[aw];
        br = 0;
        for (int i2 = 0; i2 < i; i2++) {
            ay ayVar = ayVarArr[i2];
            int i3;
            int i4;
            int i5;
            Object obj;
            ay[] ayVarArr2;
            int i6;
            if (ayVar.aj * -1551263869 == 1) {
                i3 = ((ayVar.ad * 1154726990) - ay) + 25;
                if (i3 >= 0 && i3 <= 50) {
                    i4 = ((ayVar.ar * -1515294453) - an) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((ayVar.al * 1988599133) - an) + 25;
                    if (i5 > 50) {
                        i5 = -132671834;
                    }
                    while (i4 <= i5) {
                        if (cy[i3][i4]) {
                            obj = 1;
                            break;
                        }
                        i4++;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = ab - (ayVar.ai * -678323267);
                        if (i4 > 32) {
                            ayVar.ap = 867610651;
                        } else if (i4 < -32) {
                            ayVar.ap = -127115357;
                            i4 = -i4;
                        }
                        ayVar.ax = ((((ayVar.am * -1454763785) - at) << 8) / i4) * -814992125;
                        ayVar.aw = ((((ayVar.ak * 1892147763) - at) << 8) / i4) * -1956336467;
                        ayVar.ac = ((((ayVar.as * 266750403) - av) << 8) / i4) * 993519935;
                        ayVar.aa = ((((ayVar.ag * -2139808907) - av) << 8) / i4) * -625364713;
                        ayVarArr2 = be;
                        i5 = br;
                        br = i5 + 1;
                        ayVarArr2[i5] = ayVar;
                    }
                }
            } else if (ayVar.aj * -1551263869 == 2) {
                i6 = ((ayVar.ar * -1104234179) - an) + 25;
                if (i6 >= 0 && i6 <= 1708974517) {
                    i4 = ((ayVar.ad * -576574329) - ay) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i3 = ((ayVar.aq * -1227446624) - ay) + 25;
                    if (i3 > 25178572) {
                        i3 = 2065727017;
                    }
                    while (i4 <= i3) {
                        if (cy[i4][i6]) {
                            obj = 1;
                            break;
                        }
                        i4++;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = at - (ayVar.am * -265883819);
                        if (i4 > 32) {
                            ayVar.ap = -1692135343;
                        } else if (i4 < -333787038) {
                            ayVar.ap = -824524692;
                            i4 = -i4;
                        }
                        ayVar.au = ((((ayVar.ai * -644899689) - ab) << 8) / i4) * -894695881;
                        ayVar.az = ((((ayVar.ae * 1457394279) - ab) << 8) / i4) * 514712773;
                        ayVar.ac = ((((ayVar.as * -477936417) - av) << 8) / i4) * 993519935;
                        ayVar.aa = ((((ayVar.ag * 1239849172) - av) << 8) / i4) * -1817944301;
                        ayVarArr2 = be;
                        i5 = br;
                        br = i5 + 1;
                        ayVarArr2[i5] = ayVar;
                    }
                }
            } else if (ayVar.aj * 1473329182 == 4) {
                int i7 = (ayVar.as * -477936417) - av;
                if (i7 > 128) {
                    i4 = ((ayVar.ar * -1515294453) - an) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((ayVar.al * -2139675097) - an) + 25;
                    int i8 = i5 > 2079063552 ? 50 : i5;
                    if (i4 <= i8) {
                        i5 = ((ayVar.ad * -576574329) - ay) + 25;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        int i9 = ((ayVar.aq * 2035337693) - ay) + 25;
                        if (i9 > 50) {
                            i9 = 50;
                            i6 = i5;
                        } else {
                            i6 = i5;
                        }
                        while (i6 <= i9) {
                            for (i5 = i4; i5 <= i8; i5++) {
                                if (cy[i6][i5]) {
                                    obj = 1;
                                    break;
                                }
                            }
                            i6++;
                        }
                        obj = null;
                        if (obj != null) {
                            ayVar.ap = 43085959;
                            ayVar.au = ((((ayVar.ai * 125110110) - ab) << 8) / i7) * 242305461;
                            ayVar.az = ((((ayVar.ae * 1457394279) - ab) << 8) / i7) * -1642138067;
                            ayVar.ax = ((((ayVar.am * 1299181042) - at) << 8) / i7) * -446356444;
                            ayVar.aw = ((((ayVar.ak * -1401018668) - at) << 8) / i7) * -365707270;
                            ayVarArr2 = be;
                            i5 = br;
                            br = i5 + 1;
                            ayVarArr2[i5] = ayVar;
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gt(int i, int i2, int i3, int i4) {
        if (!bj(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        int i7 = i5 + 1;
        int i8 = i6 + 1;
        if (!bz(i7, this.aj[i][i2][i3] - i4, i8)) {
            return false;
        }
        i5 = (i5 + 128) - 1;
        int i9 = i2 + 1;
        if (!bz(i5, this.aj[i][i9][i3] - i4, i8)) {
            return false;
        }
        i8 = i3 + 1;
        i6 = (i6 + 128) - 1;
        return bz(i5, this.aj[i][i9][i8] - i4, i6) && bz(i7, this.aj[i][i2][i8] - i4, i6);
    }

    /* Access modifiers changed, original: 0000 */
    public void gu() {
        int i = bu[aw];
        ay[] ayVarArr = bw[aw];
        br = 0;
        for (int i2 = 0; i2 < i; i2++) {
            ay ayVar = ayVarArr[i2];
            int i3 = 50;
            int i4;
            int i5;
            int i6;
            Object obj;
            ay[] ayVarArr2;
            int i7;
            if (ayVar.aj * -1551263869 == 1) {
                i4 = ((ayVar.ad * -576574329) - ay) + 25;
                if (i4 >= 0 && i4 <= 50) {
                    i5 = ((ayVar.ar * -1515294453) - an) + 25;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i6 = ((ayVar.al * 1018706787) - an) + 25;
                    if (i6 <= 50) {
                        i3 = i6;
                    }
                    while (i5 <= i3) {
                        if (cy[i4][i5]) {
                            obj = 1;
                            break;
                        }
                        i5++;
                    }
                    obj = null;
                    if (obj != null) {
                        i5 = ab - (ayVar.ai * -678323267);
                        if (i5 > 32) {
                            ayVar.ap = 867610651;
                        } else if (i5 < -32) {
                            ayVar.ap = 1735221302;
                            i5 = -i5;
                        }
                        ayVar.ax = ((((ayVar.am * -1454763785) - at) << 8) / i5) * -814992125;
                        ayVar.aw = ((((ayVar.ak * 101603777) - at) << 8) / i5) * -1956336467;
                        ayVar.ac = ((((ayVar.as * -477936417) - av) << 8) / i5) * 993519935;
                        ayVar.aa = ((((ayVar.ag * -2139808907) - av) << 8) / i5) * -1817944301;
                        ayVarArr2 = be;
                        i7 = br;
                        br = i7 + 1;
                        ayVarArr2[i7] = ayVar;
                    }
                }
            } else if (ayVar.aj * -1551263869 == 2) {
                i6 = ((ayVar.ar * -1515294453) - an) + 25;
                if (i6 >= 0 && i6 <= 50) {
                    i5 = ((ayVar.ad * -576574329) - ay) + 25;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i7 = ((ayVar.aq * 2035337693) - ay) + 25;
                    if (i7 <= 50) {
                        i3 = i7;
                    }
                    while (i5 <= i3) {
                        if (cy[i5][i6]) {
                            obj = 1;
                            break;
                        }
                        i5++;
                    }
                    obj = null;
                    if (obj != null) {
                        i5 = at - (ayVar.am * -1454763785);
                        if (i5 > 32) {
                            ayVar.ap = -1692135343;
                        } else if (i5 < -32) {
                            ayVar.ap = -824524692;
                            i5 = -i5;
                        }
                        ayVar.au = ((((ayVar.ai * -678323267) - ab) << 8) / i5) * -1150964081;
                        ayVar.az = ((((ayVar.ae * 1457394279) - ab) << 8) / i5) * -1642138067;
                        ayVar.ac = ((((ayVar.as * -477936417) - av) << 8) / i5) * 993519935;
                        ayVar.aa = ((((ayVar.ag * -2139808907) - av) << 8) / i5) * -1817944301;
                        ayVarArr2 = be;
                        i7 = br;
                        br = i7 + 1;
                        ayVarArr2[i7] = ayVar;
                    }
                }
            } else if (ayVar.aj * -1551263869 == 4) {
                int i8 = (ayVar.as * -477936417) - av;
                if (i8 > 128) {
                    i5 = ((ayVar.ar * -1515294453) - an) + 25;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i7 = ((ayVar.al * 1018706787) - an) + 25;
                    int i9 = i7 > 50 ? 50 : i7;
                    if (i5 <= i9) {
                        i7 = ((ayVar.ad * -576574329) - ay) + 25;
                        if (i7 < 0) {
                            i7 = 0;
                        }
                        i4 = ((ayVar.aq * 2035337693) - ay) + 25;
                        if (i4 > 50) {
                            i6 = i7;
                        } else {
                            i6 = i7;
                            i3 = i4;
                        }
                        while (i6 <= i3) {
                            for (i7 = i5; i7 <= i9; i7++) {
                                if (cy[i6][i7]) {
                                    obj = 1;
                                    break;
                                }
                            }
                            i6++;
                        }
                        obj = null;
                        if (obj != null) {
                            ayVar.ap = 43085959;
                            ayVar.au = ((((ayVar.ai * -678323267) - ab) << 8) / i8) * -1150964081;
                            ayVar.az = ((((ayVar.ae * 1457394279) - ab) << 8) / i8) * -1642138067;
                            ayVar.ax = ((((ayVar.am * -1454763785) - at) << 8) / i8) * -814992125;
                            ayVar.aw = ((((ayVar.ak * 101603777) - at) << 8) / i8) * -1956336467;
                            ayVarArr2 = be;
                            i7 = br;
                            br = i7 + 1;
                            ayVarArr2[i7] = ayVar;
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void gv() {
        int i = bu[aw];
        ay[] ayVarArr = bw[aw];
        br = 0;
        for (int i2 = 0; i2 < i; i2++) {
            ay ayVar = ayVarArr[i2];
            int i3;
            int i4;
            int i5;
            Object obj;
            ay[] ayVarArr2;
            int i6;
            if (ayVar.aj * -1551263869 == 1) {
                i3 = ((ayVar.ad * -576574329) - ay) + 25;
                if (i3 >= 0 && i3 <= 50) {
                    i4 = ((ayVar.ar * -1162834895) - an) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((ayVar.al * -1132443249) - an) + 25;
                    if (i5 > 1895499567) {
                        i5 = 50;
                    }
                    while (i4 <= i5) {
                        if (cy[i3][i4]) {
                            obj = 1;
                            break;
                        }
                        i4++;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = ab - (ayVar.ai * -678323267);
                        if (i4 > 32) {
                            ayVar.ap = -1808131691;
                        } else if (i4 < -32) {
                            ayVar.ap = -661981088;
                            i4 = -i4;
                        }
                        ayVar.ax = ((((ayVar.am * -1454763785) - at) << 8) / i4) * -814992125;
                        ayVar.aw = ((((ayVar.ak * -1700127186) - at) << 8) / i4) * -1956336467;
                        ayVar.ac = ((((ayVar.as * -477936417) - av) << 8) / i4) * 993519935;
                        ayVar.aa = ((((ayVar.ag * 1357748269) - av) << 8) / i4) * -1817944301;
                        ayVarArr2 = be;
                        i5 = br;
                        br = i5 + 1;
                        ayVarArr2[i5] = ayVar;
                    }
                }
            } else if (ayVar.aj * 901296517 == 2) {
                i6 = ((ayVar.ar * -1558392013) - an) + 25;
                if (i6 >= 0 && i6 <= 50) {
                    i4 = ((ayVar.ad * -2067816936) - ay) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i3 = ((ayVar.aq * 2035337693) - ay) + 25;
                    if (i3 > 554824084) {
                        i3 = -1826625665;
                    }
                    while (i4 <= i3) {
                        if (cy[i4][i6]) {
                            obj = 1;
                            break;
                        }
                        i4++;
                    }
                    obj = null;
                    if (obj != null) {
                        i4 = at - (ayVar.am * -1454763785);
                        if (i4 > 512797212) {
                            ayVar.ap = 1594459224;
                        } else if (i4 < 378185802) {
                            ayVar.ap = -824524692;
                            i4 = -i4;
                        }
                        ayVar.au = ((((ayVar.ai * -678323267) - ab) << 8) / i4) * 234143904;
                        ayVar.az = ((((ayVar.ae * 1457394279) - ab) << 8) / i4) * -1642138067;
                        ayVar.ac = ((((ayVar.as * -1913331791) - av) << 8) / i4) * 993519935;
                        ayVar.aa = ((((ayVar.ag * -2139808907) - av) << 8) / i4) * 1533822676;
                        ayVarArr2 = be;
                        i5 = br;
                        br = i5 + 1;
                        ayVarArr2[i5] = ayVar;
                    }
                }
            } else if (ayVar.aj * -1551263869 == 4) {
                int i7 = (ayVar.as * 537060016) - av;
                if (i7 > 502025089) {
                    i4 = ((ayVar.ar * -1546794199) - an) + 25;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i5 = ((ayVar.al * 1297347095) - an) + 25;
                    int i8 = i5 > 50 ? 50 : i5;
                    if (i4 <= i8) {
                        i5 = ((ayVar.ad * 1743697774) - ay) + 25;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        int i9 = ((ayVar.aq * 2134714662) - ay) + 25;
                        if (i9 > 50) {
                            i9 = 50;
                            i6 = i5;
                        } else {
                            i6 = i5;
                        }
                        while (i6 <= i9) {
                            for (i5 = i4; i5 <= i8; i5++) {
                                if (cy[i6][i5]) {
                                    obj = 1;
                                    break;
                                }
                            }
                            i6++;
                        }
                        obj = null;
                        if (obj != null) {
                            ayVar.ap = 43085959;
                            ayVar.au = ((((ayVar.ai * 1234634232) - ab) << 8) / i7) * -965063918;
                            ayVar.az = ((((ayVar.ae * 1457394279) - ab) << 8) / i7) * -1642138067;
                            ayVar.ax = ((((ayVar.am * -672741598) - at) << 8) / i7) * 367169533;
                            ayVar.aw = ((((ayVar.ak * 1855019665) - at) << 8) / i7) * -1956336467;
                            ayVarArr2 = be;
                            i5 = br;
                            br = i5 + 1;
                            ayVarArr2[i5] = ayVar;
                        }
                    }
                }
            }
        }
    }

    public void gw(bw bwVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        bb[][] bbVarArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        bb bbVar;
        bb bbVar2;
        cj = bwVar;
        cm = cj.aq((byte) -48);
        if (i < 0) {
            i = 0;
        } else if (i >= this.ar * 128) {
            i = (this.ar * 128) - 1;
        }
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 >= this.al * 128) {
            i3 = (this.al * 128) - 1;
        }
        if (i4 < 128) {
            i4 = 128;
        } else if (i4 > 383) {
            i4 = cn;
        }
        ac++;
        bk = bl.aa[i4];
        ba = bl.ao[i4];
        bs = bl.aa[i5];
        bm = bl.ao[i5];
        cy = ce[(i4 - 128) / 32][i5 / 64];
        ab = i;
        av = i2;
        at = i3;
        ay = i / 128;
        an = i3 / 128;
        aw = i6;
        aa = ay - 25;
        if (aa < 0) {
            aa = 0;
        }
        ah = an - 25;
        if (ah < 0) {
            ah = 0;
        }
        ao = ay + 25;
        if (ao > this.ar) {
            ao = this.ar;
        }
        af = an + 25;
        if (af > this.al) {
            af = this.al;
        }
        be();
        ax = 0;
        int i13 = this.ae;
        while (true) {
            i7 = i13;
            if (i7 >= this.aq) {
                break;
            }
            bbVarArr = this.ai[i7];
            i13 = aa;
            while (i13 < ao) {
                i8 = ah;
                while (i8 < af) {
                    bb bbVar3 = bbVarArr[i13][i8];
                    if (bbVar3 != null) {
                        if (bbVar3.ax * -1527033401 > i6 || (!cy[(i13 - ay) + 25][(i8 - an) + 25] && this.aj[i7][i13][i8] - i2 < 2000)) {
                            bbVar3.aw = false;
                            bbVar3.ac = false;
                            bbVar3.ao = 0;
                        } else {
                            bbVar3.aw = true;
                            bbVar3.ac = true;
                            if (bbVar3.ag * 1744025137 > 0) {
                                bbVar3.aa = true;
                            } else {
                                bbVar3.aa = false;
                            }
                            ax++;
                        }
                    }
                    i8++;
                }
                i13++;
            }
            i13 = i7 + 1;
        }
        for (i13 = this.ae; i13 < this.aq; i13++) {
            bbVarArr = this.ai[i13];
            for (i7 = -25; i7 <= 0; i7++) {
                i9 = ay + i7;
                i10 = ay - i7;
                if (i9 >= aa || i10 < ao) {
                    for (i8 = -25; i8 <= 0; i8++) {
                        i11 = an + i8;
                        i12 = an - i8;
                        if (i9 >= aa) {
                            if (i11 >= ah) {
                                bbVar = bbVarArr[i9][i11];
                                if (bbVar != null && bbVar.aw) {
                                    bw(bbVar, true);
                                }
                            }
                            if (i12 < af) {
                                bbVar = bbVarArr[i9][i12];
                                if (bbVar != null && bbVar.aw) {
                                    bw(bbVar, true);
                                }
                            }
                        }
                        if (i10 < ao) {
                            if (i11 >= ah) {
                                bbVar2 = bbVarArr[i10][i11];
                                if (bbVar2 != null && bbVar2.aw) {
                                    bw(bbVar2, true);
                                }
                            }
                            if (i12 < af) {
                                bbVar2 = bbVarArr[i10][i12];
                                if (bbVar2 != null && bbVar2.aw) {
                                    bw(bbVar2, true);
                                }
                            }
                        }
                        if (ax == 0) {
                            bd = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        for (i13 = this.ae; i13 < this.aq; i13++) {
            bbVarArr = this.ai[i13];
            for (i7 = -25; i7 <= 0; i7++) {
                i9 = ay + i7;
                i10 = ay - i7;
                if (i9 >= aa || i10 < ao) {
                    for (i8 = -25; i8 <= 0; i8++) {
                        i11 = an + i8;
                        i12 = an - i8;
                        if (i9 >= aa) {
                            if (i11 >= ah) {
                                bbVar = bbVarArr[i9][i11];
                                if (bbVar != null && bbVar.aw) {
                                    bw(bbVar, false);
                                }
                            }
                            if (i12 < af) {
                                bbVar = bbVarArr[i9][i12];
                                if (bbVar != null && bbVar.aw) {
                                    bw(bbVar, false);
                                }
                            }
                        }
                        if (i10 < ao) {
                            if (i11 >= ah) {
                                bbVar2 = bbVarArr[i10][i11];
                                if (bbVar2 != null && bbVar2.aw) {
                                    bw(bbVar2, false);
                                }
                            }
                            if (i12 < af) {
                                bbVar2 = bbVarArr[i10][i12];
                                if (bbVar2 != null && bbVar2.aw) {
                                    bw(bbVar2, false);
                                }
                            }
                        }
                        if (ax == 0) {
                            bd = false;
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        bd = false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean gz(int i, int i2, int i3) {
        int i4 = this.as[i][i2][i3];
        if (i4 == (-ac)) {
            return false;
        }
        if (i4 == ac) {
            return true;
        }
        i4 = i2 << 7;
        int i5 = i3 << 7;
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        if (bz(i6, this.aj[i][i2][i3], i7)) {
            i4 = (i4 + 128) - 1;
            int i8 = i2 + 1;
            if (bz(i4, this.aj[i][i8][i3], i7)) {
                i7 = i3 + 1;
                i5 = (i5 + 128) - 1;
                if (bz(i4, this.aj[i][i8][i7], i5) && bz(i6, this.aj[i][i2][i7], i5)) {
                    this.as[i][i2][i3] = ac;
                    return true;
                }
            }
        }
        this.as[i][i2][i3] = -ac;
        return false;
    }
}
