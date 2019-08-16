package defpackage;

import java.security.SecureRandom;

/* renamed from: gd */
public class gd implements Runnable {
    public static final int bk = 28;
    static int dc = 0;
    static final int es = 5000;
    static gf pf = null;
    static final int sa = 4;
    volatile hd[] ad;

    gd() {
        try {
            this.ad = new hd[2];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gd.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static SecureRandom ad(byte b) {
        try {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextInt();
            return secureRandom;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gd.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ad(int i, int i2) {
        return i == 10 || i == 11 || 12 == i || i == 13 || 14 == i || 15 == i || 16 == i || 17 == i;
    }

    public static int aj(int i, int i2, int i3) {
        int i4 = 0;
        while (i2 > 0) {
            i4 = (i4 << 1) | (i & 1);
            i >>>= 1;
            i2--;
        }
        return i4;
    }

    static final void by(al alVar, int i, int i2, byte b) {
        try {
            if ((client.pk * 495226541 == 0 || client.pk * 495226541 == 3) && client.bh.ad == io.ar && !gc.km.cv((byte) -110)) {
                int i3 = 1;
                as ax = alVar.ax(true, 409184797);
                if (ax != null) {
                    int i4 = client.bh.am[0] - i;
                    int i5 = client.bh.ak[0] - i2;
                    if (ax.ad(i4, i5, -1705941401)) {
                        i4 -= (ax.ad * 140111961) / 2;
                        int i6 = i5 - ((ax.aq * -112018377) / 2);
                        i5 = (client.hq * 1091227615) & 2047;
                        int i7 = bl.aa[i5];
                        i5 = bl.ao[i5];
                        int i8 = ((((i6 * i7) + (i5 * i4)) >> 11) + (da.jc.bq * -1444273727)) >> 7;
                        i5 = ((da.jc.bd * -1690563339) - (((i5 * i6) - (i7 * i4)) >> 11)) >> 7;
                        ns aq = ib.aq(no.cv, client.eb.aj, 678028005);
                        aq.ar.al(18, -1116991201);
                        aq.ar.cq((cq.fz * -1866366501) + i5, -1845421836);
                        aq.ar.cq((oz.ff * 2060098323) + i8, -1215292858);
                        lv lvVar = aq.ar;
                        if (!client.bh.ba(82, -1620542321)) {
                            i3 = 0;
                        } else if (client.bh.ba(81, -1620542321)) {
                            i3 = 2;
                        }
                        lvVar.bj(i3, 856444469);
                        aq.ar.al(i4, -818316516);
                        aq.ar.al(i6, -350732431);
                        aq.ar.aj(client.hq * 1091227615, 328876501);
                        aq.ar.al(57, -1641060914);
                        aq.ar.al(0, -919873533);
                        aq.ar.al(0, -1662800171);
                        aq.ar.al(89, -1041658209);
                        aq.ar.aj(da.jc.bq * -1444273727, -1637328417);
                        aq.ar.aj(da.jc.bd * -1690563339, 581570649);
                        aq.ar.al(63, -412589446);
                        client.eb.ar(aq, -743400216);
                        client.os = -137671343 * i8;
                        client.ow = -89456149 * i5;
                        client.bh.an(io.ax, -2110310516);
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gd.by(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void cb(ih ihVar, int i, int i2) {
        try {
            if (ihVar.dd * 1994646357 > client.bj * 2133672263) {
                bi.ce(ihVar, -930821477);
            } else if (ihVar.dm * 1739202913 >= client.bj * 2133672263) {
                em.cy(ihVar, 141836103);
            } else {
                hz.cc(ihVar, -268090351);
            }
            if (ihVar.bq * -1444273727 < 128 || ihVar.bd * -1690563339 < 128 || ihVar.bq * -1444273727 >= 13184 || ihVar.bd * -1690563339 >= 13184) {
                ihVar.cs = -1835762113;
                ihVar.ck = 109561753;
                ihVar.dd = 0;
                ihVar.dm = 0;
                ihVar.bq = (ihVar.bl * -1322789824) + (ihVar.db[0] * -1770577792);
                ihVar.bd = (ihVar.bl * -65303744) + (ihVar.dc[0] * 1369419392);
                ihVar.be(1181187965);
            }
            if (da.jc == ihVar && (ihVar.bq * -1444273727 < oy.am || ihVar.bd * -1690563339 < oy.am || ihVar.bq * -1444273727 >= 11776 || ihVar.bd * -1690563339 >= 11776)) {
                ihVar.cs = -1835762113;
                ihVar.ck = 109561753;
                ihVar.dd = 0;
                ihVar.dm = 0;
                ihVar.bq = (ihVar.db[0] * -1770577792) + (ihVar.bl * -1322789824);
                ihVar.bd = (ihVar.dc[0] * 1369419392) + (ihVar.bl * -65303744);
                ihVar.be(616272635);
            }
            hz.cs(ihVar, (byte) 22);
            dc.cr(ihVar, 1720225579);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gd.cb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ad() {
        int i = 0;
        while (i < 2) {
            try {
                hd hdVar = this.ad[i];
                if (hdVar != null) {
                    hdVar.ad(-1253693404);
                }
                i++;
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                return;
            }
        }
    }

    public void aq() {
        int i = 0;
        while (i < 2) {
            try {
                hd hdVar = this.ad[i];
                if (hdVar != null) {
                    hdVar.ad(-2129683306);
                }
                i++;
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                return;
            }
        }
    }

    public void run() {
        int i = 0;
        while (i < 2) {
            try {
                hd hdVar = this.ad[i];
                if (hdVar != null) {
                    hdVar.ad(-1319858581);
                }
                i++;
            } catch (Exception e) {
                try {
                    iv.ad(null, e, 1692244937);
                    return;
                } catch (RuntimeException e2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("gd.run(");
                    stringBuilder.append(')');
                    throw mv.aq(e2, stringBuilder.toString());
                }
            }
        }
    }
}
