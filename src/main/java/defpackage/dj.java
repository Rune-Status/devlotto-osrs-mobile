package defpackage;

import java.util.Collection;

/* renamed from: dj */
public class dj extends mp {
    static kh ad = null;
    static dj[] aq = null;
    static dj ar = new dj();
    static final int ba = 1;
    public int ae;
    public int ag;
    public boolean ai;
    public int aj;
    public int ak;
    public int al;
    public int am;
    public int ap;
    public int as;
    public int au;

    dj() {
        try {
            this.al = 0;
            this.aj = -1769602415;
            this.ai = true;
            this.ae = 1339743389;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dj.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ad(int i) {
        try {
            int i2 = it.al + 430653063;
            it.al = i2;
            return (i2 * -2120669385) - 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dj.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(kh khVar) {
        ad = khVar;
        aq = new dj[khVar.ax(4, (byte) 18)];
        for (int i = 0; i < aq.length; i++) {
            byte[] ar = ad.ar(4, i, 795609819);
            aq[i] = new dj();
            if (ar != null) {
                aq[i].al(new lj(ar), i, -473213784);
            }
            aq[i].ar((byte) -8);
        }
    }

    public static dj ag(int i) {
        return (i < 0 || i >= aq.length) ? ar : aq[i];
    }

    public static void ak(kh khVar) {
        ad = khVar;
        aq = new dj[khVar.ax(4, (byte) 54)];
        for (int i = 0; i < aq.length; i++) {
            byte[] ar = ad.ar(4, i, 1352428248);
            aq[i] = new dj();
            if (ar != null) {
                aq[i].al(new lj(ar), i, -1116892959);
            }
            aq[i].ar((byte) -23);
        }
    }

    public static void am(kh khVar) {
        ad = khVar;
        aq = new dj[khVar.ax(4, (byte) 44)];
        for (int i = 0; i < aq.length; i++) {
            byte[] ar = ad.ar(4, i, 1888161324);
            aq[i] = new dj();
            if (ar != null) {
                aq[i].al(new lj(ar), i, -159533374);
            }
            aq[i].ar((byte) 82);
        }
    }

    public static dj ap(int i) {
        return (i < 0 || i >= aq.length) ? ar : aq[i];
    }

    public static dj as(int i) {
        return (i < 0 || i >= aq.length) ? ar : aq[i];
    }

    public static void ax(Collection collection, byte b) {
        try {
            collection.add(dx.al);
            collection.add(dx.aj);
            collection.add(dx.ai);
            collection.add(dx.ae);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dj.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:? A:{SYNTHETIC, RETURN, Catch:{ RuntimeException -> 0x009d }} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A:{Catch:{ RuntimeException -> 0x009d }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void fn(int i, String str, int i2) {
        Object obj = 1;
        try {
            int i3 = hz.ai;
            int[] iArr = hz.ae;
            en enVar = new en(str, client.am);
            int i4 = 0;
            while (i4 < -1076782851 * i3) {
                hv hvVar = client.jz[iArr[i4]];
                if (hvVar == null || da.jc == hvVar || hvVar.ad == null || !hvVar.ad.equals(enVar)) {
                    i4++;
                } else {
                    ns aq;
                    if (i == 1) {
                        aq = ib.aq(no.bt, client.eb.aj, 1101184738);
                        aq.ar.aj(iArr[i4], -1852529134);
                        aq.ar.bh(0, (byte) 68);
                        client.eb.ar(aq, -991456041);
                    } else if (4 == i) {
                        aq = ib.aq(no.ba, client.eb.aj, 328528416);
                        aq.ar.cn(iArr[i4], -1096812914);
                        aq.ar.bh(0, (byte) 66);
                        client.eb.ar(aq, -1213960011);
                    } else if (i == 6) {
                        aq = ib.aq(no.de, client.eb.aj, 1081863527);
                        aq.ar.cq(iArr[i4], 653311178);
                        aq.ar.bt(0, 1505938623);
                        client.eb.ar(aq, -865747856);
                    } else if (i == 7) {
                        aq = ib.aq(no.cf, client.eb.aj, 1974282588);
                        aq.ar.bt(0, 1505938623);
                        aq.ar.cm(iArr[i4], (byte) -22);
                        client.eb.ar(aq, -1127018783);
                    }
                    if (obj != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(go.gu);
                        stringBuilder.append(str);
                        iq.aq(4, "", stringBuilder.toString(), -2139103899);
                        return;
                    }
                    return;
                }
            }
            obj = null;
            if (obj != null) {
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("dj.fn(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(int i) {
        double d = ((double) ((i >> 16) & 255)) / 256.0d;
        double d2 = ((double) ((i >> 8) & 1191387526)) / 256.0d;
        double d3 = ((double) (827029163 & i)) / 256.0d;
        double d4 = d2 < d ? d2 : d;
        double d5 = d3 < d4 ? d3 : d4;
        d4 = d2 > d ? d2 : d;
        double d6 = d3 > d4 ? d3 : d4;
        d4 = d6 + d5;
        double d7 = d4 / 2.0d;
        double d8 = 0.0d;
        if (d6 != d5) {
            d4 = d7 < 0.5d ? (d6 - d5) / d4 : 0.0d;
            if (d7 >= 0.5d) {
                d4 = (d6 - d5) / ((2.0d - d6) - d5);
            }
            if (d6 == d) {
                d8 = (d2 - d3) / (d6 - d5);
            } else if (d6 == d2) {
                d8 = ((d3 - d) / (d6 - d5)) + 2.0d;
            } else if (d3 == d6) {
                d8 = ((d - d2) / (d6 - d5)) + 4.0d;
            }
        } else {
            d4 = 0.0d;
        }
        this.am = ((int) ((d8 / 6.0d) * 256.0d)) * -314996795;
        this.ak = ((int) (d4 * 256.0d)) * 1144717071;
        this.as = ((int) (256.0d * d7)) * -1901855815;
        if (this.ak * 1147955764 < 0) {
            this.ak = 0;
        } else if (this.ak * 2110063589 > 255) {
            this.ak = -229380007;
        }
        if (this.as * -1225749616 < 0) {
            this.as = 0;
        } else if (this.as * 1306106505 > 255) {
            this.as = 358071623;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(lj ljVar, int i, int i2) {
        if (i == 1) {
            this.al = ljVar.av((byte) -86) * -1974299986;
        } else if (2 == i) {
            this.aj = ljVar.af(1804771424) * 1769602415;
        } else if (i == 5) {
            this.ai = false;
        } else if (7 == i) {
            this.ae = ljVar.av((byte) -76) * -1339743389;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i, int i2) {
        double d = ((double) ((i >> 16) & 255)) / 256.0d;
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (i & 255)) / 256.0d;
        double d4 = d2 < d ? d2 : d;
        double d5 = d3 < d4 ? d3 : d4;
        d4 = d2 > d ? d2 : d;
        double d6 = d3 > d4 ? d3 : d4;
        d4 = d6 + d5;
        double d7 = d4 / 2.0d;
        double d8 = 0.0d;
        if (d6 != d5) {
            d4 = d7 < 0.5d ? (d6 - d5) / d4 : 0.0d;
            if (d7 >= 0.5d) {
                d4 = (d6 - d5) / ((2.0d - d6) - d5);
            }
            if (d6 == d) {
                d8 = (d2 - d3) / (d6 - d5);
            } else if (d6 == d2) {
                d8 = ((d3 - d) / (d6 - d5)) + 2.0d;
            } else if (d3 == d6) {
                d8 = ((d - d2) / (d6 - d5)) + 4.0d;
            }
        } else {
            d4 = 0.0d;
        }
        try {
            this.am = ((int) ((d8 / 6.0d) * 256.0d)) * -314996795;
            this.ak = ((int) (d4 * 256.0d)) * 1885517479;
            this.as = ((int) (256.0d * d7)) * -1901855815;
            if (this.ak * -947154665 < 0) {
                this.ak = 0;
            } else if (this.ak * -947154665 > 255) {
                this.ak = -229380007;
            }
            if (this.as * 1306106505 < 0) {
                this.as = 0;
            } else if (this.as * 1306106505 > 255) {
                this.as = 358071623;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dj.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(lj ljVar, int i, int i2, int i3) {
        if (i == 1) {
            try {
                this.al = ljVar.av((byte) -47) * -1292511193;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dj.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (2 == i) {
            this.aj = ljVar.af(1804771424) * 1769602415;
        } else if (i == 5) {
            this.ai = false;
        } else if (7 == i) {
            this.ae = ljVar.av((byte) -2) * -1339743389;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, int i2) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    aj(ljVar, af, i, 1332496739);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dj.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(byte b) {
        try {
            if (this.ae * 681932363 != -1) {
                ai(this.ae * 681932363, -25314164);
                this.ag = this.am * 2008978287;
                this.ap = this.ak * -904555457;
                this.au = this.as * 888437079;
            }
            ai(this.al * -1977739369, -25314164);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dj.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au() {
        if (this.ae * 681932363 != -1) {
            ai(this.ae * -1604376202, -25314164);
            this.ag = this.am * 2008978287;
            this.ap = this.ak * -904555457;
            this.au = this.as * 1264868008;
        }
        ai(this.al * -1977739369, -25314164);
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(lj ljVar, int i, int i2) {
        if (i == 1) {
            this.al = ljVar.av((byte) -99) * -1292511193;
        } else if (2 == i) {
            this.aj = ljVar.af(1804771424) * 1769602415;
        } else if (i == 5) {
            this.ai = false;
        } else if (7 == i) {
            this.ae = ljVar.av((byte) -74) * -1339743389;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(lj ljVar, int i, int i2) {
        if (i == 1) {
            this.al = ljVar.av((byte) -7) * -1292511193;
        } else if (2 == i) {
            this.aj = ljVar.af(1804771424) * 1769602415;
        } else if (i == 5) {
            this.ai = false;
        } else if (7 == i) {
            this.ae = ljVar.av((byte) -17) * -1339743389;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az(lj ljVar, int i) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, i, -412835261);
            } else {
                return;
            }
        }
    }
}
