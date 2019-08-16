package defpackage;

import java.util.Collection;

/* renamed from: ce */
public class ce {
    static kh ad = null;
    static final int aj = 3;
    static byte[][][] ak = null;
    public static final int bo = 34;
    public static final int cn = 1005;
    static bc fk;
    static Collection rm;

    ce() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ce.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, kh khVar2, int i) {
        try {
            oc.ad = khVar;
            lf.aq = khVar2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ce.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, kh khVar2, kh khVar3, kh khVar4, int i) {
        try {
            bz.ak = khVar;
            al.as = khVar2;
            aw.ag = khVar3;
            cf.ap = khVar4;
            dt.ae = new al[bz.ak.aw(722610785)][];
            oh.am = new boolean[bz.ak.aw(-345931367)];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ce.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static String al(lj ljVar, int i, short s) {
        try {
            int bl = ljVar.bl(2131034147);
            if (bl > i) {
                bl = i;
            }
            byte[] bArr = new byte[bl];
            ljVar.al = (ks.ad.aq(ljVar.ar, -1631454091 * ljVar.al, bArr, 0, bl, -266162992) * -879823907) + ljVar.al;
            return eq.ai(bArr, 0, bl, -1806662067);
        } catch (Exception e) {
            return "Cabbage";
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ce.al(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public static final int aq(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        if (d2 != 0.0d) {
            d4 = d3 < 0.5d ? (1.0d + d2) * d3 : (d3 + d2) - (d2 * d3);
            double d7 = (2.0d * d3) - d4;
            d5 = 0.3333333333333333d + d;
            d6 = d5 > 1.0d ? d5 - 1.0d : d5;
            d5 = d - 0.3333333333333333d;
            if (d5 < 0.0d) {
                d5 += 1.0d;
            }
            d3 = 6.0d * d6 < 1.0d ? (d6 * ((d4 - d7) * 6.0d)) + d7 : 2.0d * d6 < 1.0d ? d4 : 3.0d * d6 < 2.0d ? (((0.6666666666666666d - d6) * (d4 - d7)) * 6.0d) + d7 : d7;
            d6 = 6.0d * d < 1.0d ? (((d4 - d7) * 6.0d) * d) + d7 : 2.0d * d < 1.0d ? d4 : 3.0d * d < 2.0d ? (((d4 - d7) * (0.6666666666666666d - d)) * 6.0d) + d7 : d7;
            if (6.0d * d5 < 1.0d) {
                d4 = (d5 * ((d4 - d7) * 6.0d)) + d7;
                d5 = d3;
            } else if (2.0d * d5 < 1.0d) {
                d5 = d3;
            } else if (3.0d * d5 < 2.0d) {
                d4 = d7 + (((0.6666666666666666d - d5) * (d4 - d7)) * 6.0d);
                d5 = d3;
            } else {
                d5 = d3;
                d4 = d7;
            }
        } else {
            d5 = d3;
            d4 = d3;
            d6 = d3;
        }
        return ((((int) (d5 * 256.0d)) << 16) + (((int) (256.0d * d6)) << 8)) + ((int) (d4 * 256.0d));
    }

    public static final int ar(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        if (d2 != 0.0d) {
            d4 = d3 < 0.5d ? (1.0d + d2) * d3 : (d3 + d2) - (d2 * d3);
            double d7 = (2.0d * d3) - d4;
            d5 = 0.3333333333333333d + d;
            d6 = d5 > 1.0d ? d5 - 1.0d : d5;
            d5 = d - 0.3333333333333333d;
            if (d5 < 0.0d) {
                d5 += 1.0d;
            }
            d3 = 6.0d * d6 < 1.0d ? (d6 * ((d4 - d7) * 6.0d)) + d7 : 2.0d * d6 < 1.0d ? d4 : 3.0d * d6 < 2.0d ? (((0.6666666666666666d - d6) * (d4 - d7)) * 6.0d) + d7 : d7;
            d6 = 6.0d * d < 1.0d ? (((d4 - d7) * 6.0d) * d) + d7 : 2.0d * d < 1.0d ? d4 : 3.0d * d < 2.0d ? (((d4 - d7) * (0.6666666666666666d - d)) * 6.0d) + d7 : d7;
            if (6.0d * d5 < 1.0d) {
                d4 = (d5 * ((d4 - d7) * 6.0d)) + d7;
                d5 = d3;
            } else if (2.0d * d5 < 1.0d) {
                d5 = d3;
            } else if (3.0d * d5 < 2.0d) {
                d4 = d7 + (((0.6666666666666666d - d5) * (d4 - d7)) * 6.0d);
                d5 = d3;
            } else {
                d5 = d3;
                d4 = d7;
            }
        } else {
            d5 = d3;
            d4 = d3;
            d6 = d3;
        }
        return ((((int) (d5 * 256.0d)) << 16) + (((int) (256.0d * d6)) << 8)) + ((int) (d4 * 256.0d));
    }
}
