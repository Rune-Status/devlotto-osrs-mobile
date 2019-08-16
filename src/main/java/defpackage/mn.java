package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;

/* renamed from: mn */
public class mn {
    public static final int aa = 20;
    static int ad;
    static byte[][] ai = new byte[50][];
    static byte[][] aj = new byte[Callback.DEFAULT_SWIPE_ANIMATION_DURATION][];
    static byte[][] al = new byte[1000][];
    static int[] am;
    static int aq;
    static int ar;

    mn() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mn.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static byte[] ae(int i, boolean z) {
        byte[] bArr;
        int i2 = 0;
        synchronized (mn.class) {
            byte[][] bArr2;
            int i3;
            if (i == 100 || (i < 100 && z)) {
                byte[][] bArr3;
                try {
                    if (ad * -1290352141 > 0) {
                        bArr2 = al;
                        i3 = ad - 1929574203;
                        ad = i3;
                        bArr = bArr2[i3 * -1290352141];
                        bArr3 = al;
                        bArr3[ad * -1290352141] = null;
                    }
                } finally {
                    bArr3 = mn.class;
                }
            }
            if (i == 5000 || (i < 5000 && z)) {
                if (aq * 732323627 > 0) {
                    bArr2 = aj;
                    i3 = aq - 456746883;
                    aq = i3;
                    bArr = bArr2[i3 * 732323627];
                    aj[aq * 732323627] = null;
                }
            }
            if (30000 == i || (i < 30000 && z)) {
                if (ar * -1099774893 > 0) {
                    bArr2 = ai;
                    i3 = ar + 666624037;
                    ar = i3;
                    bArr = bArr2[i3 * -1099774893];
                    ai[ar * -1099774893] = null;
                }
            }
            if (ce.ak != null) {
                i3 = 0;
                while (i3 < nx.ae.length) {
                    if ((nx.ae[i3] == i || (i < nx.ae[i3] && z)) && am[i3] > 0) {
                        bArr2 = ce.ak[i3];
                        int[] iArr = am;
                        int i4 = iArr[i3] - 1;
                        iArr[i3] = i4;
                        bArr = bArr2[i4];
                        ce.ak[i3][am[i3]] = null;
                        break;
                    }
                    i3++;
                }
            }
            if (z) {
                if (nx.ae != null) {
                    while (i2 < nx.ae.length) {
                        if (i <= nx.ae[i2] && am[i2] < ce.ak[i2].length) {
                            bArr = new byte[nx.ae[i2]];
                            break;
                        }
                        i2++;
                    }
                }
            }
            bArr = new byte[i];
        }
        return bArr;
    }

    public static byte[] ag(int i) {
        synchronized (mn.class) {
            int i2 = 1542957535;
            try {
                byte[] aq = mn.aq(i, false, 1542957535);
                return aq;
            } finally {
                i2 = mn.class;
            }
        }
    }

    public static void ai(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr2 == null) {
            nx.ae = null;
            am = null;
            ce.ak = (byte[][][]) null;
            return;
        }
        nx.ae = iArr;
        am = new int[iArr.length];
        ce.ak = new byte[iArr.length][][];
        for (int i = 0; i < nx.ae.length; i++) {
            ce.ak[i] = new byte[iArr2[i]][];
        }
    }

    public static void aj(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr2 == null) {
            nx.ae = null;
            am = null;
            ce.ak = (byte[][][]) null;
            return;
        }
        nx.ae = iArr;
        am = new int[iArr.length];
        ce.ak = new byte[iArr.length][][];
        for (int i = 0; i < nx.ae.length; i++) {
            ce.ak[i] = new byte[iArr2[i]][];
        }
    }

    public static byte[] ak(int i) {
        synchronized (mn.class) {
            int i2 = 1542957535;
            try {
                byte[] aq = mn.aq(i, false, 1542957535);
                return aq;
            } finally {
                i2 = mn.class;
            }
        }
    }

    static byte[] am(int i, boolean z) {
        byte[] bArr;
        int i2 = 0;
        synchronized (mn.class) {
            byte[][] bArr2;
            int i3;
            if (i == 100 || (i < 100 && z)) {
                byte[][] bArr3;
                try {
                    if (ad * 1187632689 > 0) {
                        bArr2 = al;
                        i3 = ad + 122923329;
                        ad = i3;
                        bArr = bArr2[i3 * -1290352141];
                        bArr3 = al;
                        bArr3[ad * -1290352141] = null;
                    }
                } finally {
                    bArr3 = mn.class;
                }
            }
            if (i == 5000 || (i < 5000 && z)) {
                if (aq * 732323627 > 0) {
                    bArr2 = aj;
                    i3 = aq - 456746883;
                    aq = i3;
                    bArr = bArr2[i3 * 31942494];
                    aj[aq * 1506133951] = null;
                }
            }
            if (-591904933 == i || (i < 30000 && z)) {
                if (ar * 1722469871 > 0) {
                    bArr2 = ai;
                    i3 = ar + 666624037;
                    ar = i3;
                    bArr = bArr2[i3 * -1099774893];
                    ai[ar * -291004502] = null;
                }
            }
            if (ce.ak != null) {
                i3 = 0;
                while (i3 < nx.ae.length) {
                    if ((nx.ae[i3] == i || (i < nx.ae[i3] && z)) && am[i3] > 0) {
                        bArr2 = ce.ak[i3];
                        int[] iArr = am;
                        int i4 = iArr[i3] - 1;
                        iArr[i3] = i4;
                        bArr = bArr2[i4];
                        ce.ak[i3][am[i3]] = null;
                        break;
                    }
                    i3++;
                }
            }
            if (z) {
                if (nx.ae != null) {
                    while (i2 < nx.ae.length) {
                        if (i <= nx.ae[i2] && am[i2] < ce.ak[i2].length) {
                            bArr = new byte[nx.ae[i2]];
                            break;
                        }
                        i2++;
                    }
                }
            }
            bArr = new byte[i];
        }
        return bArr;
    }

    public static void ap(byte[] bArr) {
        synchronized (mn.class) {
            byte[][] bArr2;
            int i;
            if (100 == bArr.length && ad * -1290352141 < 1000) {
                bArr2 = al;
                i = ad + 1929574203;
                ad = i;
                bArr2[(i * -1290352141) - 1] = bArr;
            } else if (5000 != bArr.length || aq * 732323627 >= Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
                try {
                    if (bArr.length != 30000 || ar * -1099774893 >= 50) {
                        if (ce.ak != null) {
                            int i2 = 0;
                            while (i2 < nx.ae.length) {
                                if (nx.ae[i2] != bArr.length || am[i2] >= ce.ak[i2].length) {
                                    i2++;
                                } else {
                                    byte[][] bArr3 = ce.ak[i2];
                                    int[] iArr = am;
                                    int i3 = iArr[i2];
                                    iArr[i2] = i3 + 1;
                                    bArr3[i3] = bArr;
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    bArr2 = ai;
                    i = ar - 666624037;
                    ar = i;
                    bArr2[(i * -1099774893) - 1] = bArr;
                } finally {
                    Class cls = mn.class;
                }
            } else {
                bArr2 = aj;
                i = aq + 456746883;
                aq = i;
                bArr2[(i * 732323627) - 1] = bArr;
            }
        }
    }

    static byte[] aq(int i, boolean z, int i2) {
        byte[] bArr;
        int i3 = 0;
        synchronized (mn.class) {
            byte[][] bArr2;
            int i4;
            if (i == 100 || (i < 100 && z)) {
                try {
                    if (ad * -1290352141 > 0) {
                        bArr2 = al;
                        i4 = ad - 1929574203;
                        ad = i4;
                        bArr = bArr2[i4 * -1290352141];
                        al[ad * -1290352141] = null;
                    }
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("mn.aq(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                } catch (Throwable th) {
                    Class cls = mn.class;
                }
            }
            if (i == 5000 || (i < 5000 && z)) {
                if (aq * 732323627 > 0) {
                    bArr2 = aj;
                    i4 = aq - 456746883;
                    aq = i4;
                    bArr = bArr2[i4 * 732323627];
                    aj[aq * 732323627] = null;
                }
            }
            if (30000 == i || (i < 30000 && z)) {
                if (ar * -1099774893 > 0) {
                    bArr2 = ai;
                    i4 = ar + 666624037;
                    ar = i4;
                    bArr = bArr2[i4 * -1099774893];
                    ai[ar * -1099774893] = null;
                }
            }
            if (ce.ak != null) {
                i4 = 0;
                while (i4 < nx.ae.length) {
                    if ((nx.ae[i4] == i || (i < nx.ae[i4] && z)) && am[i4] > 0) {
                        bArr2 = ce.ak[i4];
                        int[] iArr = am;
                        int i5 = iArr[i4] - 1;
                        iArr[i4] = i5;
                        bArr = bArr2[i5];
                        ce.ak[i4][am[i4]] = null;
                        break;
                    }
                    i4++;
                }
            }
            if (z) {
                if (nx.ae != null) {
                    while (i3 < nx.ae.length) {
                        if (i <= nx.ae[i3] && am[i3] < ce.ak[i3].length) {
                            bArr = new byte[nx.ae[i3]];
                            break;
                        }
                        i3++;
                    }
                }
            }
            bArr = new byte[i];
        }
        return bArr;
    }

    public static byte[] as(int i) {
        synchronized (mn.class) {
            int i2 = 1542957535;
            try {
                byte[] aq = mn.aq(i, false, 1542957535);
                return aq;
            } finally {
                i2 = mn.class;
            }
        }
    }

    public static void au(byte[] bArr) {
        synchronized (mn.class) {
            byte[][] bArr2;
            int i;
            if (100 == bArr.length && ad * -1290352141 < -1941259790) {
                bArr2 = al;
                i = ad + 1929574203;
                ad = i;
                bArr2[(i * -1443327443) - 1] = bArr;
            } else if (5000 != bArr.length || aq * 732323627 >= 1666539346) {
                try {
                    if (bArr.length != 30000 || ar * 966588266 >= 50) {
                        if (ce.ak != null) {
                            int i2 = 0;
                            while (i2 < nx.ae.length) {
                                if (nx.ae[i2] != bArr.length || am[i2] >= ce.ak[i2].length) {
                                    i2++;
                                } else {
                                    byte[][] bArr3 = ce.ak[i2];
                                    int[] iArr = am;
                                    int i3 = iArr[i2];
                                    iArr[i2] = i3 + 1;
                                    bArr3[i3] = bArr;
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    bArr2 = ai;
                    i = ar + 525330706;
                    ar = i;
                    bArr2[(i * 16270718) - 1] = bArr;
                } finally {
                    Class cls = mn.class;
                }
            } else {
                bArr2 = aj;
                i = aq - 1932243421;
                aq = i;
                bArr2[(i * 2072817602) - 1] = bArr;
            }
        }
    }
}
