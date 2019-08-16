package defpackage;

/* renamed from: nx */
public class nx {
    static int[] ae = null;
    public static final int ag = 11;
    public static final int ao = 1;
    public final int ad;
    String aj;
    String al;
    public final long aq;
    public final nk ar;

    nx(lj ljVar, byte b, int i) {
        try {
            this.al = ljVar.bm(1135253135);
            this.aj = ljVar.bm(2029106623);
            this.ad = ljVar.an(-1464407032) * -1675035559;
            this.aq = ljVar.bk(-485718219) * 136525510512922167L;
            int at = ljVar.at((byte) -118);
            int at2 = ljVar.at((byte) -126);
            this.ar = new nk();
            this.ar.aj(2, (byte) -1);
            this.ar.ai(b, (byte) 80);
            this.ar.ar = at * 1355918505;
            this.ar.al = at2 * 907517525;
            this.ar.aj = 0;
            this.ar.ai = 0;
            this.ar.aq = 1943592117 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nx.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String ad(byte b) {
        try {
            return this.al;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nx.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String aj() {
        return this.aj;
    }

    public String al() {
        return this.aj;
    }

    public String aq(int i) {
        try {
            return this.aj;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nx.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String ar() {
        return this.al;
    }
}
