package defpackage;

/* renamed from: dq */
public class dq implements lk {
    static final dq ad = new dq(2, 0);
    public static final int af = 21;
    static final dq aq = new dq(0, 1);
    static final dq ar = new dq(1, 2);
    static final int ay = 1;
    static mh ru;
    final int aj;
    public final int al;

    dq(int i, int i2) {
        try {
            this.al = 852832309 * i;
            this.aj = 639790931 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dq.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static dq[] ae() {
        return new dq[]{aq, ar, ad};
    }

    static int ah(int i, hw hwVar, boolean z, int i2) {
        int[] iArr;
        int i3;
        al aq;
        int[] iArr2;
        int i4;
        if (i == 2700) {
            try {
                iArr = hl.ae;
                i3 = ds.am + 564452847;
                ds.am = i3;
                aq = da.aq(iArr[i3 * -757592335], -550158556);
                iArr2 = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr2[(i4 * -757592335) - 1] = aq.fu * -1806633963;
                return 1;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dq.ah(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (2701 == i) {
            iArr = hl.ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            aq = da.aq(iArr[i3 * -757592335], -550158556);
            if (aq.fu * -1806633963 != -1) {
                iArr2 = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr2[(i4 * -757592335) - 1] = aq.fc * -1405353077;
                return 1;
            }
            iArr = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = 0;
            return 1;
        } else if (i == 2702) {
            iArr = hl.ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            if (((is) client.kd.ad((long) iArr[i3 * -757592335])) != null) {
                iArr = hl.ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr[(i3 * -757592335) - 1] = 1;
                return 1;
            }
            iArr = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = 0;
            return 1;
        } else if (i != 2706) {
            return 2;
        } else {
            iArr = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = client.ka * 676917989;
            return 1;
        }
    }

    static dq[] ar() {
        return new dq[]{aq, ar, ad};
    }

    static void bx(int i) {
        try {
            aa bx = client.aq.abx((byte) 73).bx(-1270907343);
            if (bx != null) {
                bx.an(407930246);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dq.bx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean gy(int i) {
        try {
            return en.iu != null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dq.gy(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        try {
            return this.aj * 644197595;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dq.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.aj * 644197595;
    }

    public int aj() {
        return this.aj * 644197595;
    }

    public int al() {
        return this.aj * 644197595;
    }
}
