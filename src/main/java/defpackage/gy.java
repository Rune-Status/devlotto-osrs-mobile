package defpackage;

import android.support.v4.view.InputDeviceCompat;

/* renamed from: gy */
public class gy extends mb {
    static boolean aa;
    static float[] ab;
    static int[] ac;
    static byte[] ae;
    static int ag;
    static int ak;
    static int am;
    static float[] an;
    static gk[] ap;
    static int as;
    static float[] at;
    static ga[] au;
    static float[] av;
    static boolean[] aw;
    static gm[] ax;
    static hc[] az;
    static float[] ba;
    static float[] bk;
    static int[] bm;
    static int[] bq;
    static float[] bs;
    byte[][] ad;
    int af;
    int ah;
    boolean ai;
    int aj;
    int al;
    float[] ao;
    int aq;
    int ar;
    boolean ay;
    byte[] bd;
    int bl;
    int bo;

    gy(byte[] bArr) {
        aj(bArr);
    }

    static int aa(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i >= 8 - ak) {
            int i4 = 8 - ak;
            i3 += (((1 << i4) - 1) & (ae[am] >> ak)) << i2;
            ak = 0;
            am++;
            i2 += i4;
            i -= i4;
        }
        if (i <= 0) {
            return i3;
        }
        i3 += (((1 << i) - 1) & (ae[am] >> ak)) << i2;
        ak += i;
        return i3;
    }

    static int ac(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i >= 8 - ak) {
            int i4 = 8 - ak;
            i3 += (((1 << i4) - 1) & (ae[am] >> ak)) << i2;
            ak = 0;
            am++;
            i2 += i4;
            i -= i4;
        }
        if (i <= 0) {
            return i3;
        }
        i3 += (((1 << i) - 1) & (ae[am] >> ak)) << i2;
        ak += i;
        return i3;
    }

    static float ad(int i) {
        int i2 = 2097151 & i;
        if ((Integer.MIN_VALUE & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (((2145386496 & i) >> 21) - 788)));
    }

    static float ag(int i) {
        int i2 = 2097151 & i;
        if ((1144612253 & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (((-830407751 & i) >> 21) - 1466229907)));
    }

    static void ai(byte[] bArr) {
        int i;
        int i2;
        gy.aq(bArr, 0);
        as = 1 << gy.al(4);
        ag = 1 << gy.al(4);
        an = new float[ag];
        int i3 = 0;
        while (true) {
            i = i3;
            if (i >= 2) {
                break;
            }
            int i4;
            double d;
            i3 = i != 0 ? ag : as;
            int i5 = i3 >> 1;
            int i6 = i3 >> 2;
            int i7 = i3 >> 3;
            float[] fArr = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                i4 = i2 * 2;
                d = (((double) (i2 * 4)) * 3.141592653589793d) / ((double) i3);
                fArr[i4] = (float) Math.cos(d);
                fArr[i4 + 1] = -((float) Math.sin(d));
            }
            float[] fArr2 = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                i4 = i2 * 2;
                int i8 = i4 + 1;
                double d2 = (((double) i8) * 3.141592653589793d) / ((double) (i3 * 2));
                fArr2[i4] = (float) Math.cos(d2);
                fArr2[i8] = (float) Math.sin(d2);
            }
            float[] fArr3 = new float[i6];
            for (i2 = 0; i2 < i7; i2++) {
                i4 = i2 * 2;
                d = (((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i3);
                fArr3[i4] = (float) Math.cos(d);
                fArr3[i4 + 1] = -((float) Math.sin(d));
            }
            int[] iArr = new int[i7];
            i4 = ez.al(i7 - 1, 628235391);
            for (i3 = 0; i3 < i7; i3++) {
                iArr[i3] = gd.aj(i3, i4, 1244860895);
            }
            if (i != 0) {
                bk = fArr;
                ba = fArr2;
                bs = fArr3;
                bq = iArr;
            } else {
                ab = fArr;
                av = fArr2;
                at = fArr3;
                bm = iArr;
            }
            i3 = i + 1;
        }
        i = gy.al(8) + 1;
        ap = new gk[i];
        for (i3 = 0; i3 < i; i3++) {
            ap[i3] = new gk();
        }
        i = gy.al(6);
        for (i3 = 0; i3 < i + 1; i3++) {
            gy.al(16);
        }
        i = gy.al(6) + 1;
        au = new ga[i];
        for (i3 = 0; i3 < i; i3++) {
            au[i3] = new ga();
        }
        i = gy.al(6) + 1;
        az = new hc[i];
        for (i3 = 0; i3 < i; i3++) {
            az[i3] = new hc();
        }
        i = gy.al(6) + 1;
        ax = new gm[i];
        for (i3 = 0; i3 < i; i3++) {
            ax[i3] = new gm();
        }
        i2 = gy.al(6) + 1;
        aw = new boolean[i2];
        ac = new int[i2];
        for (i = 0; i < i2; i++) {
            aw[i] = gy.ar() != 0;
            gy.al(16);
            gy.al(16);
            ac[i] = gy.al(8);
        }
    }

    static gy ak(kh khVar, int i, int i2) {
        if (gy.am(khVar)) {
            byte[] ar = khVar.ar(i, i2, 1925176768);
            return ar != null ? new gy(ar) : null;
        } else {
            khVar.aj(i, i2, -329409678);
            return null;
        }
    }

    static int al(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i >= 8 - ak) {
            int i4 = 8 - ak;
            i3 += (((1 << i4) - 1) & (ae[am] >> ak)) << i2;
            ak = 0;
            am++;
            i2 += i4;
            i -= i4;
        }
        if (i <= 0) {
            return i3;
        }
        i3 += (((1 << i) - 1) & (ae[am] >> ak)) << i2;
        ak += i;
        return i3;
    }

    static boolean am(kh khVar) {
        if (!aa) {
            byte[] ar = khVar.ar(0, 0, 2033043808);
            if (ar == null) {
                return false;
            }
            gy.ai(ar);
            aa = true;
        }
        return true;
    }

    static int ao(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i >= 8 - ak) {
            int i4 = 8 - ak;
            i3 += (((1 << i4) - 1) & (ae[am] >> ak)) << i2;
            ak = 0;
            am++;
            i2 += i4;
            i -= i4;
        }
        if (i <= 0) {
            return i3;
        }
        i3 += (((1 << i) - 1) & (ae[am] >> ak)) << i2;
        ak += i;
        return i3;
    }

    static float ap(int i) {
        int i2 = 2097151 & i;
        if ((Integer.MIN_VALUE & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (((2145386496 & i) >> 21) - 788)));
    }

    static void aq(byte[] bArr, int i) {
        ae = bArr;
        am = i;
        ak = 0;
    }

    static int ar() {
        byte b = ae[am];
        int i = ak;
        ak++;
        am += ak >> 3;
        ak &= 7;
        return (b >> i) & 1;
    }

    static void at(byte[] bArr) {
        int i;
        int i2;
        gy.aq(bArr, 0);
        as = 1 << gy.al(4);
        ag = 1 << gy.al(4);
        an = new float[ag];
        int i3 = 0;
        while (true) {
            i = i3;
            if (i >= 2) {
                break;
            }
            int i4;
            double d;
            i3 = i != 0 ? ag : as;
            int i5 = i3 >> 1;
            int i6 = i3 >> 2;
            int i7 = i3 >> 3;
            float[] fArr = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                i4 = i2 * 2;
                d = (((double) (i2 * 4)) * 3.141592653589793d) / ((double) i3);
                fArr[i4] = (float) Math.cos(d);
                fArr[i4 + 1] = -((float) Math.sin(d));
            }
            float[] fArr2 = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                i4 = i2 * 2;
                int i8 = i4 + 1;
                double d2 = (((double) i8) * 3.141592653589793d) / ((double) (i3 * 2));
                fArr2[i4] = (float) Math.cos(d2);
                fArr2[i8] = (float) Math.sin(d2);
            }
            float[] fArr3 = new float[i6];
            for (i2 = 0; i2 < i7; i2++) {
                i4 = i2 * 2;
                d = (((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i3);
                fArr3[i4] = (float) Math.cos(d);
                fArr3[i4 + 1] = -((float) Math.sin(d));
            }
            int[] iArr = new int[i7];
            i4 = ez.al(i7 - 1, 628235391);
            for (i3 = 0; i3 < i7; i3++) {
                iArr[i3] = gd.aj(i3, i4, 1244860895);
            }
            if (i != 0) {
                bk = fArr;
                ba = fArr2;
                bs = fArr3;
                bq = iArr;
            } else {
                ab = fArr;
                av = fArr2;
                at = fArr3;
                bm = iArr;
            }
            i3 = i + 1;
        }
        i = gy.al(8) + 1;
        ap = new gk[i];
        for (i3 = 0; i3 < i; i3++) {
            ap[i3] = new gk();
        }
        i = gy.al(6);
        for (i3 = 0; i3 < i + 1; i3++) {
            gy.al(16);
        }
        i = gy.al(6) + 1;
        au = new ga[i];
        for (i3 = 0; i3 < i; i3++) {
            au[i3] = new ga();
        }
        i = gy.al(6) + 1;
        az = new hc[i];
        for (i3 = 0; i3 < i; i3++) {
            az[i3] = new hc();
        }
        i = gy.al(6) + 1;
        ax = new gm[i];
        for (i3 = 0; i3 < i; i3++) {
            ax[i3] = new gm();
        }
        i2 = gy.al(6) + 1;
        aw = new boolean[i2];
        ac = new int[i2];
        for (i = 0; i < i2; i++) {
            aw[i] = gy.ar() != 0;
            gy.al(16);
            gy.al(16);
            ac[i] = gy.al(8);
        }
    }

    static void au(byte[] bArr, int i) {
        ae = bArr;
        am = i;
        ak = 0;
    }

    static void av(byte[] bArr) {
        int i;
        int i2;
        gy.aq(bArr, 0);
        as = 1 << gy.al(4);
        ag = 1 << gy.al(4);
        an = new float[ag];
        int i3 = 0;
        while (true) {
            i = i3;
            if (i >= 2) {
                break;
            }
            int i4;
            double d;
            i3 = i != 0 ? ag : as;
            int i5 = i3 >> 1;
            int i6 = i3 >> 2;
            int i7 = i3 >> 3;
            float[] fArr = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                i4 = i2 * 2;
                d = (((double) (i2 * 4)) * 3.141592653589793d) / ((double) i3);
                fArr[i4] = (float) Math.cos(d);
                fArr[i4 + 1] = -((float) Math.sin(d));
            }
            float[] fArr2 = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                i4 = i2 * 2;
                int i8 = i4 + 1;
                double d2 = (((double) i8) * 3.141592653589793d) / ((double) (i3 * 2));
                fArr2[i4] = (float) Math.cos(d2);
                fArr2[i8] = (float) Math.sin(d2);
            }
            float[] fArr3 = new float[i6];
            for (i2 = 0; i2 < i7; i2++) {
                i4 = i2 * 2;
                d = (((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i3);
                fArr3[i4] = (float) Math.cos(d);
                fArr3[i4 + 1] = -((float) Math.sin(d));
            }
            int[] iArr = new int[i7];
            i4 = ez.al(i7 - 1, 628235391);
            for (i3 = 0; i3 < i7; i3++) {
                iArr[i3] = gd.aj(i3, i4, 1244860895);
            }
            if (i != 0) {
                bk = fArr;
                ba = fArr2;
                bs = fArr3;
                bq = iArr;
            } else {
                ab = fArr;
                av = fArr2;
                at = fArr3;
                bm = iArr;
            }
            i3 = i + 1;
        }
        i = gy.al(8) + 1;
        ap = new gk[i];
        for (i3 = 0; i3 < i; i3++) {
            ap[i3] = new gk();
        }
        i = gy.al(6);
        for (i3 = 0; i3 < i + 1; i3++) {
            gy.al(16);
        }
        i = gy.al(6) + 1;
        au = new ga[i];
        for (i3 = 0; i3 < i; i3++) {
            au[i3] = new ga();
        }
        i = gy.al(6) + 1;
        az = new hc[i];
        for (i3 = 0; i3 < i; i3++) {
            az[i3] = new hc();
        }
        i = gy.al(6) + 1;
        ax = new gm[i];
        for (i3 = 0; i3 < i; i3++) {
            ax[i3] = new gm();
        }
        i2 = gy.al(6) + 1;
        aw = new boolean[i2];
        ac = new int[i2];
        for (i = 0; i < i2; i++) {
            aw[i] = gy.ar() != 0;
            gy.al(16);
            gy.al(16);
            ac[i] = gy.al(8);
        }
    }

    static int aw(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i >= 8 - ak) {
            int i4 = 8 - ak;
            i3 += (((1 << i4) - 1) & (ae[am] >> ak)) << i2;
            ak = 0;
            am++;
            i2 += i4;
            i -= i4;
        }
        if (i <= 0) {
            return i3;
        }
        i3 += (((1 << i) - 1) & (ae[am] >> ak)) << i2;
        ak += i;
        return i3;
    }

    static int ax() {
        byte b = ae[am];
        int i = ak;
        ak++;
        am += ak >> 3;
        ak &= 7;
        return (b >> i) & 1;
    }

    static int az() {
        byte b = ae[am];
        int i = ak;
        ak++;
        am += ak >> 3;
        ak &= 7;
        return (b >> i) & 1;
    }

    static void ba(byte[] bArr) {
        int i;
        int i2;
        gy.aq(bArr, 0);
        as = 1 << gy.al(4);
        ag = 1 << gy.al(4);
        an = new float[ag];
        int i3 = 0;
        while (true) {
            i = i3;
            if (i >= 2) {
                break;
            }
            int i4;
            double d;
            i3 = i != 0 ? ag : as;
            int i5 = i3 >> 1;
            int i6 = i3 >> 2;
            int i7 = i3 >> 3;
            float[] fArr = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                i4 = i2 * 2;
                d = (((double) (i2 * 4)) * 3.141592653589793d) / ((double) i3);
                fArr[i4] = (float) Math.cos(d);
                fArr[i4 + 1] = -((float) Math.sin(d));
            }
            float[] fArr2 = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                i4 = i2 * 2;
                int i8 = i4 + 1;
                double d2 = (((double) i8) * 3.141592653589793d) / ((double) (i3 * 2));
                fArr2[i4] = (float) Math.cos(d2);
                fArr2[i8] = (float) Math.sin(d2);
            }
            float[] fArr3 = new float[i6];
            for (i2 = 0; i2 < i7; i2++) {
                i4 = i2 * 2;
                d = (((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i3);
                fArr3[i4] = (float) Math.cos(d);
                fArr3[i4 + 1] = -((float) Math.sin(d));
            }
            int[] iArr = new int[i7];
            i4 = ez.al(i7 - 1, 628235391);
            for (i3 = 0; i3 < i7; i3++) {
                iArr[i3] = gd.aj(i3, i4, 1244860895);
            }
            if (i != 0) {
                bk = fArr;
                ba = fArr2;
                bs = fArr3;
                bq = iArr;
            } else {
                ab = fArr;
                av = fArr2;
                at = fArr3;
                bm = iArr;
            }
            i3 = i + 1;
        }
        i = gy.al(8) + 1;
        ap = new gk[i];
        for (i3 = 0; i3 < i; i3++) {
            ap[i3] = new gk();
        }
        i = gy.al(6);
        for (i3 = 0; i3 < i + 1; i3++) {
            gy.al(16);
        }
        i = gy.al(6) + 1;
        au = new ga[i];
        for (i3 = 0; i3 < i; i3++) {
            au[i3] = new ga();
        }
        i = gy.al(6) + 1;
        az = new hc[i];
        for (i3 = 0; i3 < i; i3++) {
            az[i3] = new hc();
        }
        i = gy.al(6) + 1;
        ax = new gm[i];
        for (i3 = 0; i3 < i; i3++) {
            ax[i3] = new gm();
        }
        i2 = gy.al(6) + 1;
        aw = new boolean[i2];
        ac = new int[i2];
        for (i = 0; i < i2; i++) {
            aw[i] = gy.ar() != 0;
            gy.al(16);
            gy.al(16);
            ac[i] = gy.al(8);
        }
    }

    static gy bd(kh khVar, int i, int i2) {
        if (gy.am(khVar)) {
            byte[] ar = khVar.ar(i, i2, 964745497);
            return ar != null ? new gy(ar) : null;
        } else {
            khVar.aj(i, i2, -1381209706);
            return null;
        }
    }

    static void bk(byte[] bArr) {
        int i;
        int i2;
        gy.aq(bArr, 0);
        as = 1 << gy.al(4);
        ag = 1 << gy.al(4);
        an = new float[ag];
        int i3 = 0;
        while (true) {
            i = i3;
            if (i >= 2) {
                break;
            }
            int i4;
            double d;
            i3 = i != 0 ? ag : as;
            int i5 = i3 >> 1;
            int i6 = i3 >> 2;
            int i7 = i3 >> 3;
            float[] fArr = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                i4 = i2 * 2;
                d = (((double) (i2 * 4)) * 3.141592653589793d) / ((double) i3);
                fArr[i4] = (float) Math.cos(d);
                fArr[i4 + 1] = -((float) Math.sin(d));
            }
            float[] fArr2 = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                i4 = i2 * 2;
                int i8 = i4 + 1;
                double d2 = (((double) i8) * 3.141592653589793d) / ((double) (i3 * 2));
                fArr2[i4] = (float) Math.cos(d2);
                fArr2[i8] = (float) Math.sin(d2);
            }
            float[] fArr3 = new float[i6];
            for (i2 = 0; i2 < i7; i2++) {
                i4 = i2 * 2;
                d = (((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i3);
                fArr3[i4] = (float) Math.cos(d);
                fArr3[i4 + 1] = -((float) Math.sin(d));
            }
            int[] iArr = new int[i7];
            i4 = ez.al(i7 - 1, 628235391);
            for (i3 = 0; i3 < i7; i3++) {
                iArr[i3] = gd.aj(i3, i4, 1244860895);
            }
            if (i != 0) {
                bk = fArr;
                ba = fArr2;
                bs = fArr3;
                bq = iArr;
            } else {
                ab = fArr;
                av = fArr2;
                at = fArr3;
                bm = iArr;
            }
            i3 = i + 1;
        }
        i = gy.al(8) + 1;
        ap = new gk[i];
        for (i3 = 0; i3 < i; i3++) {
            ap[i3] = new gk();
        }
        i = gy.al(6);
        for (i3 = 0; i3 < i + 1; i3++) {
            gy.al(16);
        }
        i = gy.al(6) + 1;
        au = new ga[i];
        for (i3 = 0; i3 < i; i3++) {
            au[i3] = new ga();
        }
        i = gy.al(6) + 1;
        az = new hc[i];
        for (i3 = 0; i3 < i; i3++) {
            az[i3] = new hc();
        }
        i = gy.al(6) + 1;
        ax = new gm[i];
        for (i3 = 0; i3 < i; i3++) {
            ax[i3] = new gm();
        }
        i2 = gy.al(6) + 1;
        aw = new boolean[i2];
        ac = new int[i2];
        for (i = 0; i < i2; i++) {
            aw[i] = gy.ar() != 0;
            gy.al(16);
            gy.al(16);
            ac[i] = gy.al(8);
        }
    }

    static boolean bm(kh khVar) {
        if (!aa) {
            byte[] ar = khVar.ar(0, 0, 1894219053);
            if (ar == null) {
                return false;
            }
            gy.ai(ar);
            aa = true;
        }
        return true;
    }

    static gy bq(kh khVar, int i, int i2) {
        if (gy.am(khVar)) {
            byte[] ar = khVar.ar(i, i2, 1033246607);
            return ar != null ? new gy(ar) : null;
        } else {
            khVar.aj(i, i2, 1951360189);
            return null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ab(byte[] bArr) {
        lj ljVar = new lj(bArr);
        this.aq = ljVar.at((byte) -87);
        this.ar = ljVar.at((byte) -69);
        this.al = ljVar.at((byte) -126);
        this.aj = ljVar.at((byte) -117);
        if (this.aj < 0) {
            this.aj = this.aj;
            this.ai = true;
        }
        int at = ljVar.at((byte) -37);
        this.ad = new byte[at][];
        for (int i = 0; i < at; i++) {
            int i2 = 0;
            int af;
            do {
                af = ljVar.af(1804771424);
                i2 += af;
            } while (af >= 255);
            byte[] bArr2 = new byte[i2];
            ljVar.bd(bArr2, 0, i2, (byte) 0);
            this.ad[i] = bArr2;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float[] ae(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float[] fArr;
        gy.aq(this.ad[i], 0);
        gy.ar();
        int al = gy.al(ez.al(ac.length - 1, 628235391));
        boolean z = aw[al];
        int i9 = z ? ag : as;
        Object obj;
        Object obj2;
        if (z) {
            obj = gy.ar() != 0 ? 1 : null;
            if (gy.ar() != 0) {
                obj2 = 1;
            }
            obj2 = null;
        } else {
            obj = null;
            obj2 = null;
        }
        int i10 = i9 >> 1;
        if (z && obj == null) {
            i2 = i9 >> 2;
            i3 = i2 - (as >> 2);
            i4 = i2 + (as >> 2);
            i5 = as >> 1;
        } else {
            i3 = 0;
            i4 = i10;
            i5 = i10;
        }
        if (z && obj2 == null) {
            i2 = i9 - (i9 >> 2);
            i6 = i2 - (as >> 2);
            i7 = (as >> 2) + i2;
            i2 = as >> 1;
        } else {
            i2 = i10;
            i6 = i10;
            i7 = i9;
        }
        gm gmVar = ax[ac[al]];
        boolean z2 = !au[gmVar.ar[gmVar.aq]].ai();
        for (i8 = 0; i8 < gmVar.ad; i8++) {
            az[gmVar.al[i8]].ad(an, i10, z2);
        }
        if (!z2) {
            au[gmVar.ar[gmVar.aq]].ae(an, i10);
        }
        if (z2) {
            for (i2 = i10; i2 < i9; i2++) {
                an[i2] = 0.0f;
            }
        } else {
            int i11;
            int i12;
            int i13;
            int i14;
            float f;
            float f2;
            int i15;
            float f3;
            float f4;
            int i16;
            int i17;
            int i18;
            float f5;
            float f6;
            int i19;
            float f7;
            float f8;
            float f9;
            int i20;
            float sin;
            float[] fArr2;
            double d;
            int i21 = i9 >> 2;
            int i22 = i9 >> 3;
            float[] fArr3 = an;
            for (i8 = 0; i8 < i10; i8++) {
                fArr3[i8] = fArr3[i8] * 0.5f;
            }
            for (i8 = i10; i8 < i9; i8++) {
                fArr3[i8] = -fArr3[(i9 - i8) - 1];
            }
            float[] fArr4 = z ? bk : ab;
            float[] fArr5 = z ? ba : av;
            float[] fArr6 = z ? bs : at;
            int[] iArr = z ? bq : bm;
            for (i11 = 0; i11 < i21; i11++) {
                i12 = i11 * 4;
                i13 = i9 - i12;
                i14 = i13 - 1;
                f = fArr3[i12] - fArr3[i14];
                i13 -= 3;
                f2 = fArr3[i12 + 2] - fArr3[i13];
                i15 = i11 * 2;
                f3 = fArr4[i15];
                f4 = fArr4[i15 + 1];
                fArr3[i14] = (f * f3) - (f2 * f4);
                fArr3[i13] = (f2 * f3) + (f * f4);
            }
            for (i11 = 0; i11 < i22; i11++) {
                i12 = i11 * 4;
                i16 = (i10 + 3) + i12;
                float f10 = fArr3[i16];
                i14 = (i10 + 1) + i12;
                f4 = fArr3[i14];
                i17 = i12 + 3;
                float f11 = fArr3[i17];
                i18 = i12 + 1;
                f5 = fArr3[i18];
                fArr3[i16] = f10 + f11;
                fArr3[i14] = f4 + f5;
                f = fArr4[(i10 - 4) - i12];
                f2 = fArr4[(i10 - 3) - i12];
                f10 -= f11;
                f6 = f4 - f5;
                fArr3[i17] = (f10 * f) - (f6 * f2);
                fArr3[i18] = (f2 * f10) + (f * f6);
            }
            i13 = i9 - 1;
            i14 = ez.al(i13, 628235391);
            i11 = 0;
            while (true) {
                i16 = i11;
                if (i16 >= i14 - 3) {
                    break;
                }
                i15 = i9 >> (i16 + 2);
                i11 = 0;
                while (true) {
                    i12 = i11;
                    if (i12 >= (2 << i16)) {
                        break;
                    }
                    i17 = i9 - ((i15 * 2) * i12);
                    i19 = i9 - (((i12 * 2) + 1) * i15);
                    for (i11 = 0; i11 < (i9 >> (i16 + 4)); i11++) {
                        i18 = i11 * 4;
                        int i23 = (i17 - 1) - i18;
                        f7 = fArr3[i23];
                        int i24 = (i17 - 3) - i18;
                        f8 = fArr3[i24];
                        int i25 = (i19 - 1) - i18;
                        float f12 = fArr3[i25];
                        i18 = (i19 - 3) - i18;
                        float f13 = fArr3[i18];
                        fArr3[i23] = f7 + f12;
                        fArr3[i24] = f8 + f13;
                        i23 = (8 << i16) * i11;
                        f9 = fArr4[i23];
                        f5 = fArr4[i23 + 1];
                        f7 -= f12;
                        f8 -= f13;
                        fArr3[i25] = (f7 * f9) - (f8 * f5);
                        fArr3[i18] = (f5 * f7) + (f9 * f8);
                    }
                    i11 = i12 + 1;
                }
                i11 = i16 + 1;
            }
            for (i11 = 1; i11 < i22 - 1; i11++) {
                i12 = iArr[i11];
                if (i11 < i12) {
                    i16 = i11 * 8;
                    i12 *= 8;
                    i20 = i16 + 1;
                    f6 = fArr3[i20];
                    i15 = i12 + 1;
                    fArr3[i20] = fArr3[i15];
                    fArr3[i15] = f6;
                    i20 = i16 + 3;
                    f6 = fArr3[i20];
                    i15 = i12 + 3;
                    fArr3[i20] = fArr3[i15];
                    fArr3[i15] = f6;
                    i20 = i16 + 5;
                    f6 = fArr3[i20];
                    i15 = i12 + 5;
                    fArr3[i20] = fArr3[i15];
                    fArr3[i15] = f6;
                    i16 += 7;
                    float f14 = fArr3[i16];
                    i12 += 7;
                    fArr3[i16] = fArr3[i12];
                    fArr3[i12] = f14;
                }
            }
            for (i8 = 0; i8 < i10; i8++) {
                fArr3[i8] = fArr3[(i8 * 2) + 1];
            }
            for (i8 = 0; i8 < i22; i8++) {
                i11 = i8 * 2;
                i12 = i8 * 4;
                fArr3[i13 - i11] = fArr3[i12];
                fArr3[(i9 - 2) - i11] = fArr3[i12 + 1];
                i16 = i9 - i21;
                fArr3[(i16 - 1) - i11] = fArr3[i12 + 2];
                fArr3[(i16 - 2) - i11] = fArr3[i12 + 3];
            }
            for (i8 = 0; i8 < i22; i8++) {
                i11 = i8 * 2;
                f2 = fArr6[i11];
                f = fArr6[i11 + 1];
                i20 = i10 + i11;
                f6 = fArr3[i20];
                i15 = i20 + 1;
                f3 = fArr3[i15];
                i19 = (i9 - 2) - i11;
                float f15 = fArr3[i19];
                i11 = i13 - i11;
                f5 = fArr3[i11];
                f7 = f6 - f15;
                f9 = f3 + f5;
                f8 = (f * f7) + (f2 * f9);
                f6 += f15;
                fArr3[i20] = (f6 + f8) * 0.5f;
                fArr3[i19] = (f6 - f8) * 0.5f;
                f2 = (f * f9) - (f2 * f7);
                fArr3[i15] = ((f3 - f5) + f2) * 0.5f;
                fArr3[i11] = (f2 + ((-f3) + f5)) * 0.5f;
            }
            for (i8 = 0; i8 < i21; i8++) {
                i11 = i8 * 2;
                i12 = i11 + i10;
                i20 = i11 + 1;
                i22 = i20 + i10;
                fArr3[i8] = (fArr3[i12] * fArr5[i11]) + (fArr3[i22] * fArr5[i20]);
                fArr3[(i10 - 1) - i8] = (fArr3[i12] * fArr5[i20]) - (fArr5[i11] * fArr3[i22]);
            }
            for (i8 = 0; i8 < i21; i8++) {
                fArr3[(i9 - i21) + i8] = -fArr3[i8];
            }
            for (i8 = 0; i8 < i21; i8++) {
                fArr3[i8] = fArr3[i21 + i8];
            }
            for (i8 = 0; i8 < i21; i8++) {
                fArr3[i21 + i8] = -fArr3[(i21 - i8) - 1];
            }
            for (i8 = 0; i8 < i21; i8++) {
                fArr3[i10 + i8] = fArr3[(i9 - i8) - 1];
            }
            for (i8 = i3; i8 < i4; i8++) {
                sin = (float) Math.sin((((((double) (i8 - i3)) + 0.5d) / ((double) i5)) * 0.5d) * 3.141592653589793d);
                fArr2 = an;
                d = (double) sin;
                fArr2[i8] = ((float) Math.sin(d * (1.5707963267948966d * d))) * fArr2[i8];
            }
            for (i8 = i6; i8 < i7; i8++) {
                sin = (float) Math.sin(((((((double) (i8 - i6)) + 0.5d) / ((double) i2)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d);
                fArr2 = an;
                d = (double) sin;
                fArr2[i8] = ((float) Math.sin(d * (1.5707963267948966d * d))) * fArr2[i8];
            }
        }
        float[] fArr7 = null;
        if (this.ah > 0) {
            fArr = new float[((this.ah + i9) >> 2)];
            if (!this.ay) {
                for (i2 = 0; i2 < this.af; i2++) {
                    fArr[i2] = this.ao[(this.ah >> 1) + i2] + fArr[i2];
                }
            }
            if (!z2) {
                for (i2 = i3; i2 < i10; i2++) {
                    i8 = (fArr.length - i10) + i2;
                    fArr[i8] = fArr[i8] + an[i2];
                }
            }
            fArr7 = fArr;
        }
        fArr = this.ao;
        this.ao = an;
        an = fArr;
        this.ah = i9;
        this.af = i7 - i10;
        this.ay = z2;
        return fArr7;
    }

    /* Access modifiers changed, original: 0000 */
    public void af(byte[] bArr) {
        lj ljVar = new lj(bArr);
        this.aq = ljVar.at((byte) -39);
        this.ar = ljVar.at((byte) -60);
        this.al = ljVar.at((byte) -4);
        this.aj = ljVar.at((byte) -41);
        if (this.aj < 0) {
            this.aj = this.aj;
            this.ai = true;
        }
        int at = ljVar.at((byte) -58);
        this.ad = new byte[at][];
        for (int i = 0; i < at; i++) {
            int i2 = 0;
            int af;
            do {
                af = ljVar.af(1804771424);
                i2 += af;
            } while (af >= 85198741);
            byte[] bArr2 = new byte[i2];
            ljVar.bd(bArr2, 0, i2, (byte) 0);
            this.ad[i] = bArr2;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(byte[] bArr) {
        lj ljVar = new lj(bArr);
        this.aq = ljVar.at((byte) -8);
        this.ar = ljVar.at((byte) -38);
        this.al = ljVar.at((byte) -110);
        this.aj = ljVar.at((byte) -36);
        if (this.aj < 0) {
            this.aj = this.aj;
            this.ai = true;
        }
        int at = ljVar.at((byte) -29);
        this.ad = new byte[at][];
        for (int i = 0; i < at; i++) {
            int i2 = 0;
            int af;
            do {
                af = ljVar.af(1804771424);
                i2 += af;
            } while (af >= 255);
            byte[] bArr2 = new byte[i2];
            ljVar.bd(bArr2, 0, i2, (byte) 0);
            this.ad[i] = bArr2;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(byte[] bArr) {
        lj ljVar = new lj(bArr);
        this.aq = ljVar.at((byte) 0);
        this.ar = ljVar.at((byte) -92);
        this.al = ljVar.at((byte) -2);
        this.aj = ljVar.at((byte) -59);
        if (this.aj < 0) {
            this.aj = this.aj;
            this.ai = true;
        }
        int at = ljVar.at((byte) -41);
        this.ad = new byte[at][];
        for (int i = 0; i < at; i++) {
            int i2 = 0;
            int af;
            do {
                af = ljVar.af(1804771424);
                i2 += af;
            } while (af >= 255);
            byte[] bArr2 = new byte[i2];
            ljVar.bd(bArr2, 0, i2, (byte) 0);
            this.ad[i] = bArr2;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void an(byte[] bArr) {
        lj ljVar = new lj(bArr);
        this.aq = ljVar.at((byte) -35);
        this.ar = ljVar.at((byte) -106);
        this.al = ljVar.at((byte) -69);
        this.aj = ljVar.at((byte) -5);
        if (this.aj < 0) {
            this.aj = this.aj;
            this.ai = true;
        }
        int at = ljVar.at((byte) -107);
        this.ad = new byte[at][];
        for (int i = 0; i < at; i++) {
            int i2 = 0;
            int af;
            do {
                af = ljVar.af(1804771424);
                i2 += af;
            } while (af >= 255);
            byte[] bArr2 = new byte[i2];
            ljVar.bd(bArr2, 0, i2, (byte) 0);
            this.ad[i] = bArr2;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ht as(int[] iArr) {
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        if (this.bd == null) {
            this.ah = 0;
            this.ao = new float[ag];
            this.bd = new byte[this.ar];
            this.bo = 0;
            this.bl = 0;
        }
        while (this.bl < this.ad.length) {
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            float[] ae = ae(this.bl);
            if (ae != null) {
                int i = this.bo;
                int length = ae.length;
                if (length > this.ar - i) {
                    length = this.ar - i;
                }
                int i2 = i;
                for (int i3 = 0; i3 < length; i3++) {
                    i = (int) ((ae[i3] * 128.0f) + 128.0f);
                    if ((i & InputDeviceCompat.SOURCE_ANY) != 0) {
                        i >>= 31;
                    }
                    this.bd[i2] = (byte) (i - 128);
                    i2++;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] - (i2 - this.bo);
                }
                this.bo = i2;
            }
            this.bl++;
        }
        this.ao = null;
        byte[] bArr = this.bd;
        this.bd = null;
        return new ht(this.aq, bArr, this.al, this.aj, this.ai);
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(byte[] bArr) {
        lj ljVar = new lj(bArr);
        this.aq = ljVar.at((byte) -71);
        this.ar = ljVar.at((byte) -117);
        this.al = ljVar.at((byte) -79);
        this.aj = ljVar.at((byte) -32);
        if (this.aj < 0) {
            this.aj = this.aj;
            this.ai = true;
        }
        int at = ljVar.at((byte) -112);
        this.ad = new byte[at][];
        for (int i = 0; i < at; i++) {
            int i2 = 0;
            int af;
            do {
                af = ljVar.af(1804771424);
                i2 += af;
            } while (af >= 255);
            byte[] bArr2 = new byte[i2];
            ljVar.bd(bArr2, 0, i2, (byte) 0);
            this.ad[i] = bArr2;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ht bo(int[] iArr) {
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        if (this.bd == null) {
            this.ah = 0;
            this.ao = new float[ag];
            this.bd = new byte[this.ar];
            this.bo = 0;
            this.bl = 0;
        }
        while (this.bl < this.ad.length) {
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            float[] ae = ae(this.bl);
            if (ae != null) {
                int i = this.bo;
                int length = ae.length;
                if (length > this.ar - i) {
                    length = this.ar - i;
                }
                int i2 = i;
                for (int i3 = 0; i3 < length; i3++) {
                    i = (int) ((ae[i3] * 128.0f) + 128.0f);
                    if ((i & InputDeviceCompat.SOURCE_ANY) != 0) {
                        i >>= 31;
                    }
                    this.bd[i2] = (byte) (i - 128);
                    i2++;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] - (i2 - this.bo);
                }
                this.bo = i2;
            }
            this.bl++;
        }
        this.ao = null;
        byte[] bArr = this.bd;
        this.bd = null;
        return new ht(this.aq, bArr, this.al, this.aj, this.ai);
    }

    /* Access modifiers changed, original: 0000 */
    public float[] bs(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        gy.aq(this.ad[i], 0);
        gy.ar();
        int al = gy.al(ez.al(ac.length - 1, 628235391));
        boolean z = aw[al];
        int i8 = z ? ag : as;
        Object obj;
        Object obj2;
        if (z) {
            obj = gy.ar() != 0 ? 1 : null;
            if (gy.ar() != 0) {
                obj2 = 1;
            }
            obj2 = null;
        } else {
            obj = null;
            obj2 = null;
        }
        int i9 = i8 >> 1;
        if (z && obj == null) {
            i2 = i8 >> 2;
            i3 = i2 - (as >> 2);
            i4 = i2 + (as >> 2);
            i5 = as >> 1;
        } else {
            i3 = 0;
            i4 = i9;
            i5 = i9;
        }
        if (z && obj2 == null) {
            i2 = i8 - (i8 >> 2);
            i6 = i2 - (as >> 2);
            i7 = (as >> 2) + i2;
            i2 = as >> 1;
        } else {
            i2 = i9;
            i6 = i9;
            i7 = i8;
        }
        gm gmVar = ax[ac[al]];
        boolean ai = au[gmVar.ar[gmVar.aq]].ai() ^ 1;
        for (al = 0; al < gmVar.ad; al++) {
            az[gmVar.al[al]].ad(an, i9, ai);
        }
        if (!ai) {
            au[gmVar.ar[gmVar.aq]].ae(an, i9);
        }
        if (ai) {
            for (i2 = i9; i2 < i8; i2++) {
                an[i2] = 0.0f;
            }
        } else {
            int i10;
            int i11;
            int i12;
            int i13;
            float f;
            float f2;
            int i14;
            float f3;
            float f4;
            int i15;
            int i16;
            int i17;
            float f5;
            float f6;
            int i18;
            float f7;
            float f8;
            float f9;
            int i19;
            float sin;
            float[] fArr2;
            double d;
            int i20 = i8 >> 2;
            int i21 = i8 >> 3;
            float[] fArr3 = an;
            for (al = 0; al < i9; al++) {
                fArr3[al] = fArr3[al] * 0.5f;
            }
            for (al = i9; al < i8; al++) {
                fArr3[al] = -fArr3[(i8 - al) - 1];
            }
            float[] fArr4 = z ? bk : ab;
            float[] fArr5 = z ? ba : av;
            float[] fArr6 = z ? bs : at;
            int[] iArr = z ? bq : bm;
            for (i10 = 0; i10 < i20; i10++) {
                i11 = i10 * 4;
                i12 = i8 - i11;
                i13 = i12 - 1;
                f = fArr3[i11] - fArr3[i13];
                i12 -= 3;
                f2 = fArr3[i11 + 2] - fArr3[i12];
                i14 = i10 * 2;
                f3 = fArr4[i14];
                f4 = fArr4[i14 + 1];
                fArr3[i13] = (f * f3) - (f2 * f4);
                fArr3[i12] = (f2 * f3) + (f * f4);
            }
            for (i10 = 0; i10 < i21; i10++) {
                i11 = i10 * 4;
                i15 = (i9 + 3) + i11;
                float f10 = fArr3[i15];
                i13 = (i9 + 1) + i11;
                f4 = fArr3[i13];
                i16 = i11 + 3;
                float f11 = fArr3[i16];
                i17 = i11 + 1;
                f5 = fArr3[i17];
                fArr3[i15] = f10 + f11;
                fArr3[i13] = f4 + f5;
                f = fArr4[(i9 - 4) - i11];
                f2 = fArr4[(i9 - 3) - i11];
                f10 -= f11;
                f6 = f4 - f5;
                fArr3[i16] = (f10 * f) - (f6 * f2);
                fArr3[i17] = (f2 * f10) + (f * f6);
            }
            i12 = i8 - 1;
            i13 = ez.al(i12, 628235391);
            i10 = 0;
            while (true) {
                i15 = i10;
                if (i15 >= i13 - 3) {
                    break;
                }
                i14 = i8 >> (i15 + 2);
                i10 = 0;
                while (true) {
                    i11 = i10;
                    if (i11 >= (2 << i15)) {
                        break;
                    }
                    i16 = i8 - ((i14 * 2) * i11);
                    i18 = i8 - (((i11 * 2) + 1) * i14);
                    for (i10 = 0; i10 < (i8 >> (i15 + 4)); i10++) {
                        i17 = i10 * 4;
                        int i22 = (i16 - 1) - i17;
                        f7 = fArr3[i22];
                        int i23 = (i16 - 3) - i17;
                        f8 = fArr3[i23];
                        int i24 = (i18 - 1) - i17;
                        float f12 = fArr3[i24];
                        i17 = (i18 - 3) - i17;
                        float f13 = fArr3[i17];
                        fArr3[i22] = f7 + f12;
                        fArr3[i23] = f8 + f13;
                        i22 = (8 << i15) * i10;
                        f9 = fArr4[i22];
                        f5 = fArr4[i22 + 1];
                        f7 -= f12;
                        f8 -= f13;
                        fArr3[i24] = (f7 * f9) - (f8 * f5);
                        fArr3[i17] = (f5 * f7) + (f9 * f8);
                    }
                    i10 = i11 + 1;
                }
                i10 = i15 + 1;
            }
            for (i10 = 1; i10 < i21 - 1; i10++) {
                i11 = iArr[i10];
                if (i10 < i11) {
                    i15 = i10 * 8;
                    i11 *= 8;
                    i19 = i15 + 1;
                    f6 = fArr3[i19];
                    i14 = i11 + 1;
                    fArr3[i19] = fArr3[i14];
                    fArr3[i14] = f6;
                    i19 = i15 + 3;
                    f6 = fArr3[i19];
                    i14 = i11 + 3;
                    fArr3[i19] = fArr3[i14];
                    fArr3[i14] = f6;
                    i19 = i15 + 5;
                    f6 = fArr3[i19];
                    i14 = i11 + 5;
                    fArr3[i19] = fArr3[i14];
                    fArr3[i14] = f6;
                    i15 += 7;
                    float f14 = fArr3[i15];
                    i11 += 7;
                    fArr3[i15] = fArr3[i11];
                    fArr3[i11] = f14;
                }
            }
            for (al = 0; al < i9; al++) {
                fArr3[al] = fArr3[(al * 2) + 1];
            }
            for (al = 0; al < i21; al++) {
                i10 = al * 2;
                i11 = al * 4;
                fArr3[i12 - i10] = fArr3[i11];
                fArr3[(i8 - 2) - i10] = fArr3[i11 + 1];
                i15 = i8 - i20;
                fArr3[(i15 - 1) - i10] = fArr3[i11 + 2];
                fArr3[(i15 - 2) - i10] = fArr3[i11 + 3];
            }
            for (al = 0; al < i21; al++) {
                i10 = al * 2;
                f2 = fArr6[i10];
                f = fArr6[i10 + 1];
                i19 = i9 + i10;
                f6 = fArr3[i19];
                i14 = i19 + 1;
                f3 = fArr3[i14];
                i18 = (i8 - 2) - i10;
                float f15 = fArr3[i18];
                i10 = i12 - i10;
                f5 = fArr3[i10];
                f7 = f6 - f15;
                f9 = f3 + f5;
                f8 = (f * f7) + (f2 * f9);
                f6 += f15;
                fArr3[i19] = (f6 + f8) * 0.5f;
                fArr3[i18] = (f6 - f8) * 0.5f;
                f2 = (f * f9) - (f2 * f7);
                fArr3[i14] = ((f3 - f5) + f2) * 0.5f;
                fArr3[i10] = (f2 + ((-f3) + f5)) * 0.5f;
            }
            for (al = 0; al < i20; al++) {
                i10 = al * 2;
                i11 = i10 + i9;
                i19 = i10 + 1;
                i21 = i19 + i9;
                fArr3[al] = (fArr3[i11] * fArr5[i10]) + (fArr3[i21] * fArr5[i19]);
                fArr3[(i9 - 1) - al] = (fArr3[i11] * fArr5[i19]) - (fArr5[i10] * fArr3[i21]);
            }
            for (al = 0; al < i20; al++) {
                fArr3[(i8 - i20) + al] = -fArr3[al];
            }
            for (al = 0; al < i20; al++) {
                fArr3[al] = fArr3[i20 + al];
            }
            for (al = 0; al < i20; al++) {
                fArr3[i20 + al] = -fArr3[(i20 - al) - 1];
            }
            for (al = 0; al < i20; al++) {
                fArr3[i9 + al] = fArr3[(i8 - al) - 1];
            }
            for (al = i3; al < i4; al++) {
                sin = (float) Math.sin((((((double) (al - i3)) + 0.5d) / ((double) i5)) * 0.5d) * 3.141592653589793d);
                fArr2 = an;
                d = (double) sin;
                fArr2[al] = ((float) Math.sin(d * (1.5707963267948966d * d))) * fArr2[al];
            }
            for (al = i6; al < i7; al++) {
                sin = (float) Math.sin(((((((double) (al - i6)) + 0.5d) / ((double) i2)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d);
                fArr2 = an;
                d = (double) sin;
                fArr2[al] = ((float) Math.sin(d * (1.5707963267948966d * d))) * fArr2[al];
            }
        }
        float[] fArr7 = null;
        if (this.ah > 0) {
            fArr = new float[((this.ah + i8) >> 2)];
            if (!this.ay) {
                for (i2 = 0; i2 < this.af; i2++) {
                    fArr[i2] = this.ao[(this.ah >> 1) + i2] + fArr[i2];
                }
            }
            if (!ai) {
                for (i2 = i3; i2 < i9; i2++) {
                    al = (fArr.length - i9) + i2;
                    fArr[al] = fArr[al] + an[i2];
                }
            }
            fArr7 = fArr;
        }
        fArr = this.ao;
        this.ao = an;
        an = fArr;
        this.ah = i8;
        this.af = i7 - i9;
        this.ay = ai;
        return fArr7;
    }
}
