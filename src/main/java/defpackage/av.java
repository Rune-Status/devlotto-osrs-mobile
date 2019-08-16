package defpackage;

import java.util.Collection;

/* renamed from: av */
public final class av {
    public static final int ap = 12;
    public static final int bk = 33;
    static kv cg = null;
    public static final int ci = 1008;
    static final int dx = 0;
    int ad;
    int ae;
    boolean ai;
    int aj;
    int al;
    int aq;
    int ar;

    av(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        try {
            this.ai = true;
            this.ad = -599925499 * i;
            this.aq = 1972382053 * i2;
            this.ar = -252786093 * i3;
            this.al = 1612554973 * i4;
            this.aj = 297268963 * i5;
            this.ae = -96497861 * i6;
            this.ai = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("av.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(Collection collection, byte b) {
        try {
            collection.add(da.aq);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("av.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
