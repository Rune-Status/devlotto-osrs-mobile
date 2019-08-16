package defpackage;

/* renamed from: jz */
public class jz extends ex {
    static ef av = null;
    public static final int aw = 18;

    jz(int i, int i2) {
        try {
            this.ad = fw.ar(153062162);
            this.al = new el(i, i2);
            this.aq = new em(this.al.ar, i, i2);
            this.ar = new at(this.al);
            this.aj = new bf(this.ar);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jz.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
