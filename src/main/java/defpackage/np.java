package defpackage;

/* renamed from: np */
public class np {
    public static final int ad = 8;
    static final byte ai = (byte) 0;
    public static final int al = 2;
    static final int ap = 2048;
    public static final int aq = 0;
    public static final int ar = 1;

    np() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("np.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean ag(long j) {
        return ((int) ((j >>> 16) & 1)) == 1;
    }
}
