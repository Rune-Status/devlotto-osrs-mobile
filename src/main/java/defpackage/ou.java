package defpackage;

/* renamed from: ou */
public class ou implements lk {
    public static final ou ad = new ou(3, 0);
    public static final ou al = new ou(0, 3);
    public static final ou aq = new ou(1, 1);
    public static final ou ar = new ou(2, 2);
    static final int oo = 512;
    final int ai;
    public final int aj;

    ou(int i, int i2) {
        try {
            this.aj = -2043344445 * i;
            this.ai = -684123927 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ou.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        try {
            return this.ai * 1555906393;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ou.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.ai * 1555906393;
    }

    public int aj() {
        return this.ai * -411283773;
    }

    public int al() {
        return this.ai * 636510436;
    }
}
