package defpackage;

/* renamed from: is */
public class is extends mb {
    public static final int ag = 13;
    static int az = 0;
    static int dz = 0;
    static String ex = null;
    static final int ms = 32;
    int ad;
    int aq;
    boolean ar;

    is() {
        try {
            this.ar = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("is.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ba ad(kh khVar, kh khVar2, int i, boolean z, int i2) {
        try {
            int[] az = khVar.az(i, -381883787);
            int i3 = 1;
            for (int ag : az) {
                int ag2;
                byte[] ag3 = khVar.ag(i, ag2, (byte) -36);
                if (ag3 != null) {
                    ag2 = (ag3[1] & 255) | ((ag3[0] & 255) << 8);
                    if ((z ? khVar2.ag(0, ag2, (byte) 75) : khVar2.ag(ag2, 0, (byte) -5)) != null) {
                    }
                }
                i3 = 0;
            }
            if (i3 == 0) {
                return null;
            }
            try {
                return new ba(khVar, khVar2, i, z);
            } catch (Exception e) {
                return null;
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("is.ad(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    static hw al(byte[] bArr, int i) {
        int i2 = 0;
        try {
            int an;
            hw hwVar = new hw();
            lj ljVar = new lj(bArr);
            ljVar.al = (ljVar.ar.length - 2) * -879823907;
            int length = ((ljVar.ar.length - 2) - ljVar.an(-1464407032)) - 12;
            ljVar.al = -879823907 * length;
            int at = ljVar.at((byte) -5);
            hwVar.aj = ljVar.an(-1464407032) * -34584879;
            hwVar.ai = ljVar.an(-1464407032) * -1093680201;
            hwVar.ae = ljVar.an(-1464407032) * 982808713;
            hwVar.am = ljVar.an(-1464407032) * -118480267;
            int af = ljVar.af(1804771424);
            if (af > 0) {
                hwVar.ak = hwVar.aj(af, -1361916635);
                for (int i3 = 0; i3 < af; i3++) {
                    an = ljVar.an(-1464407032);
                    ot otVar = new ot(an > 0 ? la.ar(an, 1964962371) : 1);
                    hwVar.ak[i3] = otVar;
                    while (an > 0) {
                        otVar.aq(new ms(ljVar.at((byte) -80)), (long) ljVar.at((byte) -67));
                        an--;
                    }
                }
            }
            ljVar.al = 0;
            ljVar.bs(-1406432815);
            hwVar.aq = new int[at];
            hwVar.ar = new int[at];
            hwVar.al = new String[at];
            while (ljVar.al * -1631454091 < length) {
                an = ljVar.an(-1464407032);
                if (an == 3) {
                    hwVar.al[i2] = ljVar.bm(1908401573);
                } else if (an >= 100 || 21 == an || an == 38 || 39 == an) {
                    hwVar.ar[i2] = ljVar.af(1804771424);
                } else {
                    hwVar.ar[i2] = ljVar.at((byte) -10);
                }
                hwVar.aq[i2] = an;
                i2++;
            }
            return hwVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("is.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void fs(int i, int i2, int i3, int i4, String str, int i5) {
        try {
            al ar = gi.ar(i2, i3, -1201935479);
            if (ar != null) {
                if (ar.ej != null) {
                    il ilVar = new il();
                    ilVar.ar = ar;
                    ilVar.ai = 65812847 * i;
                    ilVar.as = str;
                    ilVar.ad = ar.ej;
                    dm.ad(ilVar, -978265659);
                }
                if ((ar.an * 365070409 > 0 ? hy.hk(ar, (byte) 3) : true) && ai.aq(hs.hy(ar, (byte) 88), i - 1, -1692381268)) {
                    ns aq;
                    if (i == 1) {
                        aq = ib.aq(no.ct, client.eb.aj, -665991342);
                        aq.ar.ae(i2, (byte) 91);
                        aq.ar.aj(i3, 1677200500);
                        aq.ar.aj(i4, -794501970);
                        client.eb.ar(aq, -1160762618);
                    }
                    if (2 == i) {
                        aq = ib.aq(no.ay, client.eb.aj, 266959689);
                        aq.ar.ae(i2, (byte) 2);
                        aq.ar.aj(i3, -337447719);
                        aq.ar.aj(i4, -808748789);
                        client.eb.ar(aq, -670614737);
                    }
                    if (3 == i) {
                        aq = ib.aq(no.bn, client.eb.aj, 603086142);
                        aq.ar.ae(i2, (byte) 97);
                        aq.ar.aj(i3, -957634006);
                        aq.ar.aj(i4, 1247040099);
                        client.eb.ar(aq, -1806194931);
                    }
                    if (i == 4) {
                        aq = ib.aq(no.ah, client.eb.aj, -474487630);
                        aq.ar.ae(i2, (byte) 10);
                        aq.ar.aj(i3, -961791532);
                        aq.ar.aj(i4, -778188249);
                        client.eb.ar(aq, -1350706674);
                    }
                    if (5 == i) {
                        aq = ib.aq(no.bx, client.eb.aj, 838971201);
                        aq.ar.ae(i2, (byte) 16);
                        aq.ar.aj(i3, 668326727);
                        aq.ar.aj(i4, -383694053);
                        client.eb.ar(aq, -1913073143);
                    }
                    if (i == 6) {
                        aq = ib.aq(no.ca, client.eb.aj, 220435423);
                        aq.ar.ae(i2, (byte) 119);
                        aq.ar.aj(i3, -392116896);
                        aq.ar.aj(i4, -1511391554);
                        client.eb.ar(aq, -2003435522);
                    }
                    if (7 == i) {
                        aq = ib.aq(no.df, client.eb.aj, 974044793);
                        aq.ar.ae(i2, (byte) 91);
                        aq.ar.aj(i3, 1382507666);
                        aq.ar.aj(i4, 623807491);
                        client.eb.ar(aq, 945138568);
                    }
                    if (8 == i) {
                        aq = ib.aq(no.ax, client.eb.aj, 74592992);
                        aq.ar.ae(i2, (byte) 119);
                        aq.ar.aj(i3, 1136747325);
                        aq.ar.aj(i4, 14076646);
                        client.eb.ar(aq, 921935246);
                    }
                    if (9 == i) {
                        aq = ib.aq(no.dr, client.eb.aj, -164651124);
                        aq.ar.ae(i2, (byte) 118);
                        aq.ar.aj(i3, -660149884);
                        aq.ar.aj(i4, 39157301);
                        client.eb.ar(aq, 858289490);
                    }
                    if (i == 10) {
                        aq = ib.aq(no.ad, client.eb.aj, -236263139);
                        aq.ar.ae(i2, (byte) 30);
                        aq.ar.aj(i3, -88460146);
                        aq.ar.aj(i4, -771377957);
                        client.eb.ar(aq, -274533688);
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("is.fs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
