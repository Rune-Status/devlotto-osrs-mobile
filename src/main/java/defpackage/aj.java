package defpackage;

/* renamed from: aj */
public class aj {
    static int[] ad = new int[32];
    static final int ai = 256;
    public static int[] aq = new int[4000];
    public static int[] ar = new int[4000];
    public static final String as = "gcu2QC";
    static ef[] gt;

    static {
        int i = 2;
        for (int i2 = 0; i2 < 32; i2++) {
            ad[i2] = i - 1;
            i += i;
        }
    }

    aj() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("aj.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, int i) {
        try {
            dk.ad = khVar;
            dk.aq = dk.ad.ax(16, (byte) 55) * -965677975;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("aj.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(int i, int i2) {
        do aq = kq.aq(i, 1693511307);
        int i3 = aq.ar * -691049261;
        int i4 = aq.al * -605420369;
        int i5 = ad[(aq.aj * 311003969) - i4];
        if (i2 < 0 || i2 > i5) {
            i2 = 0;
        }
        i5 <<= i4;
        ar[i3] = (i5 & ar[i3]) | ((i2 << i4) & i5);
    }

    public static void ai(int i, int i2) {
        do aq = kq.aq(i, 1693511307);
        int i3 = aq.ar * -691049261;
        int i4 = aq.al * 216187991;
        int i5 = ad[(aq.aj * 311003969) - i4];
        if (i2 < 0 || i2 > i5) {
            i2 = 0;
        }
        i5 <<= i4;
        ar[i3] = (i5 & ar[i3]) | ((i2 << i4) & i5);
    }

    public static int aj(int i) {
        do aq = kq.aq(i, 1693511307);
        int i2 = aq.ar;
        int i3 = aq.al * 216187991;
        return ad[(aq.aj * -1838385070) - i3] & (ar[i2 * -21714600] >> i3);
    }

    public static int al(int i) {
        do aq = kq.aq(i, 1693511307);
        int i2 = aq.ar;
        int i3 = aq.al * 216187991;
        return ad[(aq.aj * 311003969) - i3] & (ar[i2 * -691049261] >> i3);
    }

    public static void am(int i, int i2) {
        do aq = kq.aq(i, 1693511307);
        int i3 = aq.ar * -691049261;
        int i4 = aq.al * 216187991;
        int i5 = ad[(aq.aj * 311003969) - i4];
        if (i2 < 0 || i2 > i5) {
            i2 = 0;
        }
        i5 <<= i4;
        ar[i3] = (i5 & ar[i3]) | ((i2 << i4) & i5);
    }

    public static dx aq(int i, int i2) {
        try {
            long j = (long) i;
            dx dxVar = (dx) dx.al.ad(j);
            if (dxVar == null) {
                byte[] ar = dx.aq.ar(6, i, 1077338559);
                dxVar = new dx();
                dxVar.ak = 1634955975 * i;
                if (ar != null) {
                    dxVar.al(new lj(ar), -1410682553);
                }
                dxVar.ar(-1643547413);
                if (dxVar.bx) {
                    dxVar.ao = 0;
                    dxVar.ah = false;
                }
                dx.al.ar(dxVar, j);
            }
            return dxVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("aj.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ar(int i) {
        do aq = kq.aq(i, 1693511307);
        int i2 = aq.ar;
        int i3 = aq.al * 1399208086;
        return ad[(aq.aj * 311003969) - i3] & (ar[i2 * -1186810323] >> i3);
    }

    public static final boolean fq(int i, int i2, long j) {
        try {
            return ce.fk.bq(1973701849 * am.jy, i, i2, j) >= 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("aj.fq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final void ft(int i, int i2, int i3, int i4, byte b) {
        int i5 = 0;
        while (i5 < client.nt * 1948056185) {
            try {
                if (client.no[i5] + client.nl[i5] > i && client.no[i5] < i3 + i && client.ns[i5] + client.nj[i5] > i2 && client.ns[i5] < i4 + i2) {
                    client.ng[i5] = true;
                }
                i5++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("aj.ft(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }
}
