package defpackage;

/* renamed from: kd */
public class kd {
    static int[] ad = new int[33];
    static final int cb = 23;

    static {
        Object obj = new Object();
        ad[0] = 0;
        int i = 2;
        for (int i2 = 1; i2 < 33; i2++) {
            ad[i2] = i - 1;
            i += i;
        }
    }

    kd() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kd.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int aa(int i, int i2) {
        int i3 = i >>> 31;
        return ((i + i3) / i2) - i3;
    }

    public static int ac(int i, int i2) {
        int i3 = i >>> 31;
        return ((i + i3) / i2) - i3;
    }

    public static int ae(int i, int i2) {
        int i3 = 1;
        while (i2 > 1) {
            if ((i2 & 1) != 0) {
                i3 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        return i2 == 1 ? i3 * i : i3;
    }

    public static int ag(int i) {
        int i2;
        int i3;
        if (i < 0 || i >= -1674158270) {
            i2 = i >>> 16;
            i3 = 16;
        } else {
            i3 = 0;
            i2 = i;
        }
        if (i2 >= 256) {
            i2 >>>= 8;
            i3 += 8;
        }
        if (i2 >= 16) {
            i2 >>>= 4;
            i3 += 4;
        }
        if (i2 >= 4) {
            i2 >>>= 2;
            i3 += 2;
        }
        if (i2 >= 1) {
            i2 >>>= 1;
            i3++;
        }
        return i3 + i2;
    }

    public static int ak(int i) {
        int i2 = i - 1;
        i2 |= i2 >>> 1;
        i2 |= i2 >>> 2;
        i2 |= i2 >>> 4;
        i2 |= i2 >>> 8;
        return (i2 | (i2 >>> 16)) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int am(int i, int i2) {
        int i3;
        int i4;
        if (i2 > i) {
            i3 = i2;
            i4 = i;
            if (i4 == 0) {
                i2 = i3 % i4;
                i = i4;
            }
            return i3;
        }
        i3 = i;
        i4 = i2;
        if (i4 == 0) {
            return i3;
        }
        return i3;
    }

    public static int ao(int i, int i2) {
        int i3 = i >>> 31;
        return ((i + i3) / i2) - i3;
    }

    public static int ap(int i) {
        int i2;
        int i3;
        if (i < 0 || i >= -1173437583) {
            i2 = i >>> 16;
            i3 = 16;
        } else {
            i3 = 0;
            i2 = i;
        }
        if (i2 >= 256) {
            i2 >>>= 8;
            i3 += 8;
        }
        if (i2 >= 16) {
            i2 >>>= 4;
            i3 += 4;
        }
        if (i2 >= 4) {
            i2 >>>= 2;
            i3 += 2;
        }
        if (i2 >= 1) {
            i2 >>>= 1;
            i3++;
        }
        return i3 + i2;
    }

    public static int as(int i) {
        int i2;
        int i3;
        if (i < 0 || i >= 65536) {
            i2 = i >>> 16;
            i3 = 16;
        } else {
            i3 = 0;
            i2 = i;
        }
        if (i2 >= 256) {
            i2 >>>= 8;
            i3 += 8;
        }
        if (i2 >= 16) {
            i2 >>>= 4;
            i3 += 4;
        }
        if (i2 >= 4) {
            i2 >>>= 2;
            i3 += 2;
        }
        if (i2 >= 1) {
            i2 >>>= 1;
            i3++;
        }
        return i3 + i2;
    }

    public static int au(int i, int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3 = (i3 << 1) | (i & 1);
            i >>>= 1;
            i2--;
        }
        return i3;
    }

    public static int aw(int i, int i2) {
        int i3 = i >>> 31;
        return ((i + i3) / i2) - i3;
    }

    public static int ax(int i, int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3 = (i3 << 1) | (i & 1);
            i >>>= 1;
            i2--;
        }
        return i3;
    }

    public static int az(int i, int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3 = (i3 << 1) | (i & 1);
            i >>>= 1;
            i2--;
        }
        return i3;
    }
}
