package defpackage;

import com.jagex.jagex3.client.input.softkeyboard.al;

/* renamed from: il */
public class il extends mb {
    public static bg ax;
    static ow fh;
    public Object[] ad;
    al ae;
    int ag;
    int ai;
    int aj;
    int ak;
    int al;
    int am;
    int ap = -1709229372;
    boolean aq;
    public al ar;
    String as;

    static al ab(int i) {
        try {
            al ac = client.aq.abx((byte) 9).ac(3, 2066806294);
            ac.av(hm.cg, -424876299);
            return ac;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("il.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    protected static final void adv(int i) {
        int i2 = 0;
        try {
            jp.tz.aq(-73036795);
            for (int i3 = 0; i3 < 32; i3++) {
                jd.ta[i3] = 0;
            }
            while (i2 < 32) {
                jd.tq[i2] = 0;
                i2++;
            }
            ds.tm = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("il.adv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ai(int i, kh khVar, String str, String str2, int i2, boolean z, int i3) {
        try {
            int af = khVar.af(str, 1365008694);
            lh.ae(i, khVar, af, khVar.ay(af, str2, (byte) -12), i2, z, (byte) 1);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("il.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ad(Object[] objArr, int i) {
        try {
            this.ad = objArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("il.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ae(int i) {
        this.ap = -1974127217 * i;
    }

    public void ai(int i) {
        this.ap = 436508178 * i;
    }

    public void aj(Object[] objArr) {
        this.ad = objArr;
    }

    public void al(Object[] objArr) {
        this.ad = objArr;
    }

    public void aq(int i, int i2) {
        try {
            this.ap = -983206229 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("il.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(Object[] objArr) {
        this.ad = objArr;
    }
}
