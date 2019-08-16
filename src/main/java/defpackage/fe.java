package defpackage;

/* renamed from: fe */
public class fe implements lk {
    static final fe ad = new fe("runescape", "RuneScape", 0);
    public static final fe ai = new fe("oldscape", "RuneScape 2007", 5);
    static final fe aj = new fe("game5", "Game 5", 4);
    static final fe al = new fe("game4", "Game 4", 3);
    static final fe aq = new fe("stellardawn", "Stellar Dawn", 1);
    static final fe ar = new fe("game3", "Game 3", 2);
    static final int az = 1;
    static ef en = null;
    static final int jh = 2048;
    static final int np = 100;
    public final String ae;
    final int am;

    fe(String str, String str2, int i) {
        try {
            this.ae = str;
            this.am = 21674923 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fe.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static fe[] ae() {
        return new fe[]{ar, aj, al, ai, aq, ad};
    }

    public static fe[] ak() {
        return new fe[]{ar, aj, al, ai, aq, ad};
    }

    public static fe[] am() {
        return new fe[]{ar, aj, al, ai, aq, ad};
    }

    public static fe[] ar() {
        return new fe[]{ar, aj, al, ai, aq, ad};
    }

    public static final fy ef(int i, int i2, int i3, int i4) {
        try {
            return client.kk[i][i2][i3];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fe.ef(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        try {
            return this.am * 1373267715;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fe.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.am * 1373267715;
    }

    public int aj() {
        return this.am * 1373267715;
    }

    public int al() {
        return this.am * 1373267715;
    }
}
