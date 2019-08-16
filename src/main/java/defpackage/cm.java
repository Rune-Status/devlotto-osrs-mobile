package defpackage;

/* renamed from: cm */
public class cm implements lk {
    static final cm ad = new cm(0, -1);
    static final cm aq = new cm(1, 1);
    static final cm ar = new cm(2, 3);
    static final float oa = 1.77778f;
    final int aj;
    public final int al;

    cm(int i, int i2) {
        try {
            this.al = -2033313527 * i;
            this.aj = 1570967517 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cm.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static cm[] ae() {
        return new cm[]{ad, aq, ar};
    }

    static hw aq(int i, int i2, int i3, byte b) {
        try {
            hw ar = ch.ar(dt.ad(i2, i, (byte) 67), i, -1862938347);
            if (ar != null) {
                return ar;
            }
            ar = ch.ar(ir.aq(i3, i, (short) 11269), i, 320274943);
            return ar == null ? null : ar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cm.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static cm[] ar() {
        return new cm[]{ad, aq, ar};
    }

    public int ad(int i) {
        try {
            return this.aj * 1269088373;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cm.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.aj * 1269088373;
    }

    public int aj() {
        return this.aj * 1269088373;
    }

    public int al() {
        return this.aj * 1269088373;
    }
}
