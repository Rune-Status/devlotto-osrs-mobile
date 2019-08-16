package defpackage;

/* renamed from: ov */
public class ov {
    public static final int ad = 1;
    static final int ae = 16776960;
    public static final int aq = 2;
    public static final int cq = 73;

    ov() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ov.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static double aq(double d, double d2, double d3) {
        try {
            return mj.ad((d - d2) / d3) / d3;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ov.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
