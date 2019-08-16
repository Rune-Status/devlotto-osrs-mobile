package defpackage;

/* renamed from: ks */
public class ks {
    static kb ad = null;
    static final int aq = 4;
    static final int at = 32;
    public static final int ax = 4;

    ks() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ks.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ae(lj ljVar, String str) {
        int i = ljVar.al;
        byte[] al = jn.al(str, 2127513387);
        ljVar.ao(al.length, 904242749);
        ljVar.al = (ad.ad(al, 0, al.length, ljVar.ar, ljVar.al * 1858868598, 2143018872) * 1016837612) + ljVar.al;
        return (ljVar.al * 2053512166) - (-1631454091 * i);
    }

    public static String ag(lj ljVar) {
        return ce.al(ljVar, 32767, (short) -29288);
    }

    public static void ai(kb kbVar) {
        ad = kbVar;
    }

    public static void aj(kb kbVar) {
        ad = kbVar;
    }

    public static int ak(lj ljVar, String str) {
        int i = ljVar.al;
        byte[] al = jn.al(str, 387781493);
        ljVar.ao(al.length, 904242749);
        ljVar.al = (ad.ad(al, 0, al.length, ljVar.ar, ljVar.al * -1631454091, 2146018863) * 2008871370) + ljVar.al;
        return (ljVar.al * -324231276) - (i * -1631454091);
    }

    public static int am(lj ljVar, String str) {
        int i = ljVar.al;
        byte[] al = jn.al(str, 1714666839);
        ljVar.ao(al.length, 904242749);
        ljVar.al = (ad.ad(al, 0, al.length, ljVar.ar, ljVar.al * -1120005904, 2133650105) * -879823907) + ljVar.al;
        return (ljVar.al * -1007496837) - (-1631454091 * i);
    }

    public static String ap(lj ljVar) {
        return ce.al(ljVar, 742296003, (short) -28172);
    }

    public static String as(lj ljVar) {
        return ce.al(ljVar, 32767, (short) -28677);
    }

    static String au(lj ljVar, int i) {
        try {
            int bl = ljVar.bl(2131034147);
            if (bl > i) {
                bl = i;
            }
            byte[] bArr = new byte[bl];
            ljVar.al = (ad.aq(ljVar.ar, -1631454091 * ljVar.al, bArr, 0, bl, -266162992) * -879823907) + ljVar.al;
            return eq.ai(bArr, 0, bl, 352907229);
        } catch (Exception e) {
            return "Cabbage";
        }
    }

    static String az(lj ljVar, int i) {
        try {
            int bl = ljVar.bl(2131034147);
            if (bl > i) {
                bl = i;
            }
            byte[] bArr = new byte[bl];
            ljVar.al = (ad.aq(ljVar.ar, -1631454091 * ljVar.al, bArr, 0, bl, -266162992) * -879823907) + ljVar.al;
            return eq.ai(bArr, 0, bl, -1809927417);
        } catch (Exception e) {
            return "Cabbage";
        }
    }

    static kv bs(int i, boolean z, boolean z2, boolean z3, int i2) {
        mh mhVar = null;
        try {
            if (mc.ag != null) {
                mhVar = new mh(i, mc.ag, im.au[i], 1000000);
            }
            return new kv(mhVar, dq.ru, i, z, z2, z3);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ks.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
