package defpackage;

/* renamed from: oj */
public class oj {
    public static final int ad = 2;
    static final String ae = "main_file_cache.idx";
    static final int aj = 16;
    public static final int ax = 15;

    oj() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oj.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static double[] ae(double d, double d2, int i) {
        double[] dArr = new double[((i * 2) + 1)];
        int i2 = -i;
        int i3 = 0;
        while (i2 <= i) {
            dArr[i3] = ov.aq((double) i2, d, d2);
            i2++;
            i3++;
        }
        return dArr;
    }

    public static double[] ai(double d, double d2, int i) {
        double[] dArr = new double[((i * 2) + 1)];
        int i2 = -i;
        int i3 = 0;
        while (i2 <= i) {
            dArr[i3] = ov.aq((double) i2, d, d2);
            i2++;
            i3++;
        }
        return dArr;
    }

    static double aj(double d) {
        return Math.exp(((-d) * d) / 2.0d) / Math.sqrt(6.283185307179586d);
    }

    static double al(double d) {
        return Math.exp(((-d) * d) / 2.0d) / Math.sqrt(6.283185307179586d);
    }
}
