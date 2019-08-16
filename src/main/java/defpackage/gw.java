package defpackage;

/* renamed from: gw */
public class gw {
    static final int ad = 8;
    static final int aq = 40000;
    public static final int ar = 16;
    static String ct;
    static ow fr;

    gw() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gw.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ae(int i, int i2) {
        return ((i - 1396759196) << 8) + i2;
    }

    public static int ai(int i, int i2) {
        return ((40000 + i) << 8) + i2;
    }

    public static int aj(int i, int i2) {
        return (i << 8) + i2;
    }

    /* renamed from: aj */
    static void m219aj(int i, int i2) {
        try {
            jl jlVar = (jl) jl.ad.ad((long) i);
            if (jlVar != null) {
                for (int i3 = 0; i3 < jlVar.aq.length; i3++) {
                    jlVar.aq[i3] = -1;
                    jlVar.ar[i3] = 0;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gw.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int al(int i, int i2) {
        return (i << 8) + i2;
    }

    public static int ar(int i, int i2) {
        return (i << 8) + i2;
    }
}
