package defpackage;

/* renamed from: eh */
public class eh {
    public static final eh ad = new eh();
    static byte[][] ak = null;
    public static final int al = 32;
    public static final eh aq = new eh();
    public static final eh ar = new eh();
    protected static final String ax = "D26Pdv7QqeyK23LpPkdUAA";

    eh() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eh.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ca(int i) {
        try {
            if (gi.rz != null) {
                gi.rz.ap(1973701849 * am.jy, ((da.jc.bq * -1444273727) >> 7) + (oz.ff * 2060098323), ((da.jc.bd * -1690563339) >> 7) + (cq.fz * -1866366501), false, -394599043);
                gi.rz.ba(-1574939323);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eh.ca(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int dz(int i, int i2, byte b) {
        int i3 = 100;
        int i4 = i2 - 334;
        if (i4 < 0) {
            i3 = 0;
        } else if (i4 <= 100) {
            i3 = i4;
        }
        try {
            return ((((i3 * (client.qe - client.qm)) / 100) + client.qm) * i) / 256;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eh.dz(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
