package defpackage;

import java.io.IOException;

/* renamed from: gh */
public class gh implements lk {
    static final gh aa = new gh(19, 2);
    static final gh ac = new gh(18, 2);
    public static final gh ad = new gh(0, 0);
    static final gh ae = new gh(5, 1);
    static final gh af = new gh(10, 2);
    static final gh ag = new gh(12, 2);
    static final gh ah = new gh(21, 2);
    static final gh ai = new gh(4, 1);
    public static final gh aj = new gh(9, 2);
    static final gh ak = new gh(7, 1);
    public static final gh al = new gh(3, 0);
    static final gh am = new gh(6, 1);
    static final gh an = new gh(22, 3);
    static final gh ao = new gh(20, 2);
    static final gh ap = new gh(13, 2);
    static final gh aq = new gh(1, 0);
    public static final gh ar = new gh(2, 0);
    static final gh as = new gh(8, 1);
    static final gh au = new gh(14, 2);
    static final gh aw = new gh(17, 2);
    static final gh ax = new gh(16, 2);
    static final gh ay = new gh(11, 2);
    static final gh az = new gh(15, 2);
    public final int ab;

    gh(int i, int i2) {
        try {
            this.ab = 1526136325 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gh.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ag(int i) {
        return i >= af.ab * -1664117099 && i <= ay.ab * -179691827;
    }

    public static boolean ak(int i) {
        return i >= af.ab * -179691827 && i <= ay.ab * -179691827;
    }

    static he al(byte b) {
        int i = 0;
        try {
            oq aq;
            he heVar;
            he heVar2 = new he();
            try {
                aq = iz.aq("", ne.ae.ae, false, (byte) 37);
                try {
                    byte[] bArr = new byte[((int) aq.aj((byte) 33))];
                    while (i < bArr.length) {
                        int ai = aq.ai(bArr, i, bArr.length - i, -855521408);
                        if (-1 != ai) {
                            i += ai;
                        } else {
                            throw new IOException();
                        }
                    }
                    heVar = new he(new lj(bArr));
                } catch (Exception e) {
                    heVar = heVar2;
                }
            } catch (Exception e2) {
                aq = null;
                heVar = heVar2;
            }
            if (aq != null) {
                try {
                    aq.ar(-585399321);
                } catch (Exception e3) {
                }
            }
            return heVar;
        } catch (RuntimeException e4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gh.al(");
            stringBuilder.append(')');
            throw mv.aq(e4, stringBuilder.toString());
        }
    }

    public static boolean am(int i) {
        return (i >= ad.ab * -179691827 && i <= al.ab * -179691827) || aj.ab * -539661156 == i;
    }

    public static boolean ap(int i) {
        return i == an.ab * -179691827;
    }

    public static boolean as(int i) {
        return i >= af.ab * -179691827 && i <= ay.ab * -437441221;
    }

    public static boolean au(int i) {
        return i == an.ab * -179691827;
    }

    static int bb(int i, int i2) {
        try {
            return (int) (((Math.log((double) i) / hl.ab) - 7.0d) * 256.0d);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gh.bb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        try {
            return this.ab * -179691827;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gh.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.ab * -179691827;
    }

    public int aj() {
        return this.ab * 845602378;
    }

    public int al() {
        return this.ab * -179691827;
    }
}
