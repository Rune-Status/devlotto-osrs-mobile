package defpackage;

/* renamed from: ox */
public class ox {
    static final int ad = 2048;
    static final int[] ag = new int[2048];
    public static final int aj = 768;
    public static final int ak = 1792;
    public static final int aq = 65536;
    static final int[] as = new int[2048];

    static {
        for (int i = 0; i < 2048; i++) {
            double d = ((double) i) * 0.0030679615757712823d;
            as[i] = (int) (Math.sin(d) * 65536.0d);
            ag[i] = (int) (Math.cos(d) * 65536.0d);
        }
    }

    ox() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ox.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
