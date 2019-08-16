package defpackage;

/* renamed from: hy */
public class hy extends mb {
    static final int an = 7;
    public static final int cx = 89;
    int ad;
    int al;
    int aq;
    int ar;

    hy(int i, int i2, int i3, int i4) {
        try {
            this.ad = 1290694271 * i;
            this.aq = 1972647485 * i2;
            this.ar = 1547186925 * i3;
            this.al = 1772750183 * i4;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hy.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static oi ae(kh khVar, kh khVar2, int i, int i2, short s) {
        try {
            return !bv.ah(khVar, i, i2, -934748730) ? null : cu.ao(khVar2.ar(i, i2, 1845456578), -1388721776);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hy.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int be(int i, int i2, int i3, int i4, byte b) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static void dt(int i) {
        try {
            if (client.jt) {
                cn.dl(da.jc, false, -1490481109);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hy.dt(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final boolean hk(al alVar, byte b) {
        try {
            int i = 365070409 * alVar.an;
            if (205 == i) {
                client.ep = -1744733038;
                return true;
            }
            if (i >= 300 && i <= 313) {
                client.re.aq((i - 300) / 2, 1 == (i & 1), 2130903127);
            }
            if (i >= 314 && i <= 323) {
                client.re.ar((i - 314) / 2, (i & 1) == 1, 2139045193);
            }
            if (324 == i) {
                client.re.al(false, (byte) 25);
            }
            if (325 == i) {
                client.re.al(true, (byte) 25);
            }
            if (i != 326) {
                return false;
            }
            ns aq = ib.aq(no.au, client.eb.aj, 1442094105);
            client.re.aj(aq.ar, -717352420);
            client.eb.ar(aq, -1178076287);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hy.hk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ho(byte b) {
        try {
            ns aq = ib.aq(no.dd, client.eb.aj, -588094119);
            aq.ar.al(0, -1650912759);
            client.eb.ar(aq, -1044286085);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hy.ho(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i, int i2, int i3, int i4, int i5) {
        try {
            this.ad = 1290694271 * i;
            this.aq = 1972647485 * i2;
            this.ar = 1547186925 * i3;
            this.al = 1772750183 * i4;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hy.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(int i, int i2, int i3, int i4) {
        this.ad = 1290694271 * i;
        this.aq = 1972647485 * i2;
        this.ar = 1547186925 * i3;
        this.al = 1772750183 * i4;
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i, int i2, int i3, int i4) {
        this.ad = 1290694271 * i;
        this.aq = 1972647485 * i2;
        this.ar = 1547186925 * i3;
        this.al = 1772750183 * i4;
    }
}
