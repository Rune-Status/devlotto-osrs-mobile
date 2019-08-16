package defpackage;

/* renamed from: ak */
public class ak {
    public static final short[] ad = new short[]{(short) 6798, (short) 8741, (short) 25238, (short) 4626, (short) 4550};
    static final int ae = 24;
    public static final int ai = 1402;
    public static final short[][] al = new short[][]{new short[]{(short) 6554, (short) 115, (short) 10304, (short) 28, (short) 5702, (short) 7756, (short) 5681, (short) 4510, (short) -31835, (short) 22437, (short) 2859, (short) -11339, (short) 16, (short) 5157, (short) 10446, (short) 3658, (short) -27314, (short) -21965, (short) 472, (short) 580, (short) 784, (short) 21966, (short) 28950, (short) -15697, (short) -14002}, new short[]{(short) 9104, (short) 10275, (short) 7595, (short) 3610, (short) 7975, (short) 8526, (short) 918, (short) -26734, (short) 24466, (short) 10145, (short) -6882, (short) 5027, (short) 1457, (short) 16565, (short) -30545, (short) 25486, (short) 24, (short) 5392, (short) 10429, (short) 3673, (short) -27335, (short) -21957, (short) 192, (short) 687, (short) 412, (short) 21821, (short) 28835, (short) -15460, (short) -14019}, new short[0], new short[0], new short[0]};
    public static final short[][] aq;
    public static final short[] ar = new short[]{(short) -10304, (short) 9104, (short) -1, (short) -1, (short) -1};
    static final int ay = 1600;
    static final int bw = 5;
    static int fv;

    static {
        short[] sArr = new short[]{(short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010};
        short[] sArr2 = new short[]{(short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758, (short) 10270};
        short[] sArr3 = new short[]{(short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790, (short) 6806, (short) 8076, (short) 4574, (short) 17050, (short) 0, (short) 127, (short) -31821, (short) -17991};
        aq = new short[][]{new short[]{(short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797, (short) 7744, (short) 5799, (short) 4634, (short) -31839, (short) 22433, (short) 2983, (short) -11343, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, new short[]{(short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 25239, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, sArr, sArr2, sArr3};
    }

    ak() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ak.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ac(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i3;
        int i11 = i2;
        for (int i12 = -i5; i12 < 0; i12++) {
            int i13;
            int i14;
            int i15 = i8;
            while (i15 < 0) {
                i13 = i11 + 1;
                i11 = iArr2[i11];
                if (i11 != 0) {
                    i14 = i10 + 1;
                    iArr[i10] = i11;
                } else {
                    i14 = i10 + 1;
                }
                i11 = i13 + 1;
                i10 = iArr2[i13];
                if (i10 != 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i10;
                    i14 = i13;
                } else {
                    i14++;
                }
                i10 = i11 + 1;
                i11 = iArr2[i11];
                if (i11 != 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i11;
                    i14 = i13;
                } else {
                    i14++;
                }
                i11 = i10 + 1;
                i13 = iArr2[i10];
                if (i13 != 0) {
                    iArr[i14] = i13;
                }
                i15++;
                i10 = i14 + 1;
            }
            i13 = i9;
            i14 = i10;
            while (i13 < 0) {
                i10 = iArr2[i11];
                if (i10 != 0) {
                    iArr[i14] = i10;
                }
                i14++;
                i13++;
                i11++;
            }
            i10 = i14 + i6;
            i11 += i7;
        }
    }

    static void af(int i) {
        try {
            dh.ap.al();
            dh.au.al();
            dh.az.al();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ak.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ai(long j) {
        return (int) ((j >>> null) & 127);
    }

    static void ai(int i, int i2, int i3) {
        try {
            kx kxVar = (kx) kk.au.ad((long) ((i << 16) + i2));
            if (kxVar != null) {
                kk.ap.aq(kxVar);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ak.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean aq(int i, int i2) {
        return 4 != i || i2 < 8;
    }

    static boolean ar(int i, int i2) {
        return 4 != i || i2 < 8;
    }

    static boolean by(int i, int i2) {
        return 57 == i || 58 == i || i == 1007 || i == 25 || 30 == i;
    }

    static final int bz(int i, int i2, int i3, int i4, byte b) {
        return ((i2 * i3) - (i * i4)) >> 16;
    }
}
