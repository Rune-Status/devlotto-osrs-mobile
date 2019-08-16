package defpackage;

/* renamed from: nb */
public class nb implements nl {
    public static final nb ad = new nb(14, 0);
    static final nb[] ae = new nb[32];
    static final nb aj = new nb(27, 0);
    public static final nb al = new nb(18, -2);
    static final nb aq = new nb(15, 4);
    public static final nb ar = new nb(16, -2);
    public static final int cs = 74;
    public final int ai;

    static {
        int i = 0;
        nb[] ad = fu.ad((byte) 57);
        while (i < ad.length) {
            ae[ad[i].ai * -938974633] = ad[i];
            i++;
        }
    }

    nb(int i, int i2) {
        try {
            this.ai = -1026315929 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nb.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ag(int i) {
        try {
            if (ko.aj * -557713751 == 2) {
                if (di.ap == null) {
                    di.ap = ka.ad(ko.ai, ko.ae * 1134540175, ne.am * -775929309);
                    if (di.ap == null) {
                        return false;
                    }
                }
                if (ko.au == null) {
                    ko.au = new gq(en.ar, ko.aq);
                }
                if (ji.al.ar(di.ap, fg.ad, ko.au, 22050, -55762925)) {
                    ji.al.al(1677326388);
                    ji.al.ad(mo.ak * 223887887, (byte) 47);
                    ji.al.as(di.ap, fx.ag, 1262545265);
                    ko.aj = 0;
                    di.ap = null;
                    ko.au = null;
                    ko.ai = null;
                    return true;
                }
            }
        } catch (Exception e) {
            try {
                e.printStackTrace();
                ji.al.ap(-640650544);
                ko.aj = 0;
                di.ap = null;
                ko.au = null;
                ko.ai = null;
            } catch (RuntimeException e2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("nb.ag(");
                stringBuilder.append(')');
                throw mv.aq(e2, stringBuilder.toString());
            }
        }
        return false;
    }

    public static boolean am(int i, int i2) {
        return ((i >> 29) & 1) != 0;
    }

    static nb[] aq() {
        return new nb[]{aq, aj, ar, al, ad};
    }

    static nb[] ar() {
        return new nb[]{aq, aj, ar, al, ad};
    }
}
