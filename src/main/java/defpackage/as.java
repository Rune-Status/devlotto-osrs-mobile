package defpackage;

/* renamed from: as */
public class as extends mp {
    static final int ae = 400;
    public static final int cg = 104;
    static int pm;
    public final int ad;
    public final int[] al;
    public final int aq;
    public final int[] ar;

    as(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        try {
            this.ad = 1650874345 * i;
            this.aq = -1879197305 * i2;
            this.ar = iArr;
            this.al = iArr2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("as.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean aq(CharSequence charSequence, int i) {
        try {
            return bf.ar(charSequence, 10, true, 1229022309);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("as.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final String au(int i, int i2) {
        StringBuilder stringBuilder;
        if (i < 100000) {
            try {
                stringBuilder = new StringBuilder();
                stringBuilder.append("<col=ffff00>");
                stringBuilder.append(i);
                stringBuilder.append("</col>");
                return stringBuilder.toString();
            } catch (RuntimeException e) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("as.au(");
                stringBuilder2.append(')');
                throw mv.aq(e, stringBuilder2.toString());
            }
        } else if (i < 10000000) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("<col=ffffff>");
            stringBuilder.append(i / 1000);
            stringBuilder.append(go.gx);
            stringBuilder.append("</col>");
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("<col=00ff80>");
            stringBuilder.append(i / 1000000);
            stringBuilder.append(go.gy);
            stringBuilder.append("</col>");
            return stringBuilder.toString();
        }
    }

    static void fg(String str, int i, int i2, int i3) {
        try {
            fs.fj(str, i, i2, 16776960, 1907798897);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("as.fg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ad(int i, int i2, int i3) {
        if (i2 >= 0) {
            try {
                if (i2 < this.al.length) {
                    int i4 = this.al[i2];
                    if (i >= i4 && i <= i4 + this.ar[i2]) {
                        return true;
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("as.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return false;
    }
}
