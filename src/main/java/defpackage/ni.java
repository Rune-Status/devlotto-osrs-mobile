package defpackage;

/* renamed from: ni */
public class ni {
    public static final int ad = 10;
    public static final int ah = 20;
    public static final int ai = 15;
    public static final int aj = 14;
    public static final int ak = 76;
    public static final int al = 13;
    public static final int am = 17;
    public static final int aq = 11;
    public static final int ar = 12;
    public static final int bx = 53;

    ni() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ni.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean aq(int i) {
        return i == 10 || i == 11 || 12 == i || i == 13 || 14 == i || 15 == i || 16 == i || 17 == i;
    }

    static final void as(al alVar, int i, int i2, int i3, int i4) {
        try {
            if (alVar.f0do != null) {
                alVar.f0do[i] = i2;
                alVar.dy[i] = i3;
                return;
            }
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ni.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
