package defpackage;

/* renamed from: ep */
public class ep implements lk {
    public static final ep ad = new ep(0, 0);
    static final ep aq = new ep(1, 1);
    static final ep ar = new ep(2, 2);
    static final int ay = 150;
    static int hp;
    final int aj;
    public final int al;

    ep(int i, int i2) {
        try {
            this.al = -1407172269 * i;
            this.aj = 373831645 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ep.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ep[] ae() {
        return new ep[]{ad, aq, ar};
    }

    static ba ag(int i, int i2) {
        try {
            long j = (long) i;
            ba baVar = (ba) dp.aj.ad(j);
            if (baVar == null) {
                baVar = is.ad(dp.aq, dp.ar, i, false, -859143178);
                if (baVar != null) {
                    dp.aj.ar(baVar, j);
                }
            }
            return baVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ep.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ap(int i, byte b) {
        try {
            return lr.au(bu.ac[i]);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ep.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ep[] ar() {
        return new ep[]{ad, aq, ar};
    }

    static final void bo(double d, int i, int i2, int i3) {
        try {
            double random = Math.random();
            int i4 = i * 128;
            while (i < i2) {
                int i5;
                double d2 = (((double) (i >> 3)) / 64.0d) + 0.0078125d;
                double d3 = (((double) (i & 7)) / 8.0d) + 0.0625d;
                int i6 = 0;
                while (true) {
                    int i7 = i6;
                    i5 = i4;
                    if (i7 >= 128) {
                        break;
                    }
                    double d4;
                    double d5;
                    double d6;
                    double d7 = ((double) i7) / 128.0d;
                    if (d3 != 0.0d) {
                        d4 = d7 < 0.5d ? (1.0d + d3) * d7 : (d3 + d7) - (d7 * d3);
                        double d8 = (2.0d * d7) - d4;
                        d5 = 0.3333333333333333d + d2;
                        d7 = d5 > 1.0d ? d5 - 1.0d : d5;
                        d5 = d2 - 0.3333333333333333d;
                        d6 = d5 < 0.0d ? d5 + 1.0d : d5;
                        d7 = 6.0d * d7 < 1.0d ? (((d4 - d8) * 6.0d) * d7) + d8 : 2.0d * d7 < 1.0d ? d4 : 3.0d * d7 < 2.0d ? d8 + (((0.6666666666666666d - d7) * (d4 - d8)) * 6.0d) : d8;
                        d5 = 6.0d * d2 < 1.0d ? (((d4 - d8) * 6.0d) * d2) + d8 : 2.0d * d2 < 1.0d ? d4 : 3.0d * d2 < 2.0d ? (((d4 - d8) * (0.6666666666666666d - d2)) * 6.0d) + d8 : d8;
                        if (6.0d * d6 < 1.0d) {
                            d4 = (d6 * ((d4 - d8) * 6.0d)) + d8;
                            d6 = d7;
                        } else if (2.0d * d6 < 1.0d) {
                            d6 = d7;
                        } else if (3.0d * d6 < 2.0d) {
                            d4 = d8 + (((0.6666666666666666d - d6) * (d4 - d8)) * 6.0d);
                            d6 = d7;
                        } else {
                            d6 = d7;
                            d4 = d8;
                        }
                    } else {
                        d5 = d7;
                        d6 = d7;
                        d4 = d7;
                    }
                    i6 = fo.bl(((((int) (d5 * 256.0d)) << 8) + (((int) (256.0d * d6)) << 16)) + ((int) (256.0d * d4)), ((0.03d * random) - 0.015d) + d);
                    if (i6 == 0) {
                        i6 = 1;
                    }
                    bl.az[i5] = i6;
                    i6 = i7 + 1;
                    i4 = i5 + 1;
                }
                i++;
                i4 = i5;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ep.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        try {
            return this.aj * -645080971;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ep.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.aj * -645080971;
    }

    public int aj() {
        return this.aj * -645080971;
    }

    public int al() {
        return this.aj * -645080971;
    }
}
