package defpackage;

/* renamed from: ch */
public class ch {
    public static final int aa = 2;
    public static final ch ad = new ch("details");
    static final int ae = 1;
    public static final ch aj = new ch("labels");
    static final ch al = new ch("area");
    public static final ch aq = new ch("compositemap");
    public static final ch ar = new ch("compositetexture");
    static final int av = 75;
    static ow co;
    static final int kn = 0;
    static int te;
    public final String ai;

    ch(String str) {
        try {
            this.ai = str;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ch.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static hw ar(int i, int i2, int i3) {
        try {
            long j = (long) (i << 16);
            hw hwVar = (hw) hw.ad.ad(j);
            if (hwVar != null) {
                return hwVar;
            }
            int af = at.dr.af(String.valueOf(i), -269046656);
            if (af == -1) {
                return null;
            }
            byte[] as = at.dr.as(af, (byte) 0);
            if (as != null) {
                if (as.length <= 1) {
                    return null;
                }
                hwVar = is.al(as, 900354567);
                if (hwVar != null) {
                    hw.ad.ar(hwVar, j);
                    return hwVar;
                }
            }
            return null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ch.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
