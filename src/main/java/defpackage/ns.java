package defpackage;

/* renamed from: ns */
public class ns extends mb {
    static int ai = 0;
    static ns[] aj = new ns[300];
    public static final int am = 10000;
    no ad;
    public int al;
    int aq;
    public lv ar;

    ns() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ns.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ns ae(no noVar, mj mjVar) {
        ns ad = ci.ad(-2145010737);
        ad.ad = noVar;
        ad.aq = noVar.dg * -1133827239;
        if (ad.aq * 1850281161 == -1) {
            ad.ar = new lv(la.ae);
        } else if (-2 == ad.aq * 1850281161) {
            ad.ar = new lv(10000);
        } else if (ad.aq * 1850281161 <= 18) {
            ad.ar = new lv(20);
        } else if (ad.aq * 1850281161 <= 98) {
            ad.ar = new lv(100);
        } else {
            ad.ar = new lv(la.ae);
        }
        ad.ar.jh(mjVar, (byte) -27);
        ad.ar.jz(ad.ad.dw * -95871395, 41807352);
        ad.al = 0;
        return ad;
    }

    static ns ai() {
        if (ai * -1236528075 == 0) {
            return new ns();
        }
        ns[] nsVarArr = aj;
        int i = ai + 2094187449;
        ai = i;
        return nsVarArr[i * 547351863];
    }

    static ns aj() {
        if (ai * -1236528075 == 0) {
            return new ns();
        }
        ns[] nsVarArr = aj;
        int i = ai - 1013292573;
        ai = i;
        return nsVarArr[i * -1236528075];
    }

    public static ns ak() {
        ns ad = ci.ad(-1853064503);
        ad.ad = null;
        ad.aq = 0;
        ad.ar = new lv(5000);
        return ad;
    }

    public static ns am(no noVar, mj mjVar) {
        ns ad = ci.ad(-1910569293);
        ad.ad = noVar;
        ad.aq = noVar.dg * -1636224628;
        if (ad.aq * 1850281161 == -1) {
            ad.ar = new lv(116362966);
        } else if (-944514491 == ad.aq * -113563621) {
            ad.ar = new lv(10000);
        } else if (ad.aq * 1850281161 <= 18) {
            ad.ar = new lv(20);
        } else if (ad.aq * -1233636266 <= 1208275182) {
            ad.ar = new lv(100);
        } else {
            ad.ar = new lv(la.ae);
        }
        ad.ar.jh(mjVar, (byte) -42);
        ad.ar.jz(ad.ad.dw * -95871395, 41807352);
        ad.al = 0;
        return ad;
    }

    public static ns as() {
        ns ad = ci.ad(-1970107994);
        ad.ad = null;
        ad.aq = 0;
        ad.ar = new lv(5000);
        return ad;
    }

    public void ag() {
        if (ai * -1236528075 < aj.length) {
            ns[] nsVarArr = aj;
            int i = ai + 1013292573;
            ai = i;
            nsVarArr[(i * -1236528075) - 1] = this;
        }
    }

    public void al(int i) {
        try {
            if (ai * -1236528075 < aj.length) {
                ns[] nsVarArr = aj;
                int i2 = ai + 1013292573;
                ai = i2;
                nsVarArr[(i2 * -1236528075) - 1] = this;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ns.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ap() {
        if (ai * -939837488 < aj.length) {
            ns[] nsVarArr = aj;
            int i = ai - 131514144;
            ai = i;
            nsVarArr[(i * -1236528075) - 1] = this;
        }
    }
}
