package defpackage;

/* renamed from: dn */
public class dn implements lk {
    static final dn ad = new dn(1, 0);
    static final dn aq = new dn(0, 1);
    static final dn ar = new dn(2, 2);
    public static final int ax = 19;
    public static final int cv = 1001;
    static kv df;
    final int aj;
    public final int al;

    dn(int i, int i2) {
        try {
            this.al = 1685268259 * i;
            this.aj = -1199369881 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dn.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static dn[] ae() {
        return new dn[]{aq, ad, ar};
    }

    static dn[] ar() {
        return new dn[]{aq, ad, ar};
    }

    public int ad(int i) {
        try {
            return this.aj * 1967553111;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dn.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.aj * 1967553111;
    }

    public int aj() {
        return this.aj * 1967553111;
    }

    public int al() {
        return this.aj * 1967553111;
    }
}
