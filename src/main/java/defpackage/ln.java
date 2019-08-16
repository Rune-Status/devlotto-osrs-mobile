package defpackage;

/* renamed from: ln */
public class ln {
    static final ln ad = new ln();
    public static final int al = 512;
    static final ln aq = new ln();
    static final ln ar = new ln();
    public static final int au = 91;
    public static final int cr = 87;
    static ef ek;

    ln() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ln.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ag(String str, byte b) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(go.hg);
            oz.ak(stringBuilder.toString(), -769293814);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("ln.ag(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public static int al(int i, int i2) {
        return (i >> 17) & 7;
    }

    public static et aq(int i, int i2) {
        try {
            long j = (long) i;
            et etVar = (et) et.ar.ad(j);
            if (etVar == null) {
                byte[] ar = et.ad.ar(9, i, 1393161250);
                etVar = new et();
                etVar.aj = 235106851 * i;
                if (ar != null) {
                    etVar.al(new lj(ar), 1484270165);
                }
                etVar.ar((byte) 26);
                et.ar.ar(etVar, j);
            }
            return etVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ln.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void hs(int i) {
        try {
            client.mv = client.mm * 1866663263;
            dl.ob = true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ln.hs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
