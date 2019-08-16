package defpackage;

import java.util.Collection;

/* renamed from: dy */
public class dy extends mp {
    static kh ad = null;
    public static final int ag = 55;
    static gz al = new gz(256, null);
    static dy[] aq = null;
    public static int ar = 0;
    public static final int ce = 1010;
    int aa;
    int ac;
    int ae;
    int[] af;
    public dq ah;
    public int ai;
    public final int aj;
    public int ak;
    public String am;
    public int an;
    public dn ao;
    public String[] ap;
    public int as;
    public String au;
    int aw;
    int ax;
    byte[] ay;
    int[] az;

    dy(int i) {
        try {
            this.ai = -236647;
            this.ae = 834864443;
            this.as = 0;
            this.ap = new String[5];
            this.ax = -814584763;
            this.aw = -1781648351;
            this.ac = Integer.MIN_VALUE;
            this.aa = Integer.MIN_VALUE;
            this.ao = dn.aq;
            this.ah = dq.aq;
            this.an = 1724182535;
            this.aj = -292701133 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dy.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ag(kh khVar, kh khVar2) {
        int i = 0;
        ad = khVar2;
        if (!khVar.am(1631873133)) {
            return false;
        }
        ar = khVar.ax(35, (byte) 85) * 1866360171;
        aq = new dy[(ar * -494231741)];
        while (i < ar * -494231741) {
            byte[] ar = khVar.ar(35, i, 906335736);
            aq[i] = new dy(i);
            if (ar != null) {
                aq[i].ar(new lj(ar), -657701408);
                aq[i].aj(-1819778683);
            }
            i++;
        }
        return true;
    }

    public static boolean ap(kh khVar, kh khVar2) {
        int i = 0;
        ad = khVar2;
        if (!khVar.am(1631873133)) {
            return false;
        }
        ar = khVar.ax(-421057607, (byte) 123) * -1980586277;
        aq = new dy[(ar * -369329979)];
        while (i < ar * -494231741) {
            byte[] ar = khVar.ar(35, i, 1609112063);
            aq[i] = new dy(i);
            if (ar != null) {
                aq[i].ar(new lj(ar), -788755458);
                aq[i].aj(-1718016300);
            }
            i++;
        }
        return true;
    }

    public static da aq(int i, int i2) {
        try {
            long j = (long) i;
            da daVar = (da) da.aq.ad(j);
            if (daVar == null) {
                byte[] ar = da.ad.ar(11, i, 1954996236);
                daVar = new da();
                if (ar != null) {
                    daVar.al(new lj(ar), (byte) 1);
                }
                daVar.ar(-2139263953);
                da.aq.ar(daVar, j);
            }
            return daVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dy.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String aq(long j) {
        if (j <= 0 || j >= 6582952005840035281L || j % 37 == 0) {
            return null;
        }
        int i = 0;
        long j2 = j;
        while (j2 != 0) {
            i++;
            try {
                j2 /= 37;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dy.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder(i);
        while (0 != j) {
            j2 = j / 37;
            stringBuilder2.append(ly.ad[(int) (j - (j2 * 37))]);
            j = j2;
        }
        return stringBuilder2.reverse().toString();
    }

    public static boolean as(kh khVar, kh khVar2) {
        int i = 0;
        ad = khVar2;
        if (!khVar.am(1631873133)) {
            return false;
        }
        ar = khVar.ax(-1122504741, (byte) 119) * 1866360171;
        aq = new dy[(ar * -1082830348)];
        while (i < ar * 533447303) {
            byte[] ar = khVar.ar(35, i, 714702651);
            aq[i] = new dy(i);
            if (ar != null) {
                aq[i].ar(new lj(ar), -1911171439);
                aq[i].aj(-1963708007);
            }
            i++;
        }
        return true;
    }

    public static dy au(int i) {
        return (i < 0 || i >= aq.length || aq[i] == null) ? new dy(i) : aq[i];
    }

    public static dy az(int i) {
        return (i < 0 || i >= aq.length || aq[i] == null) ? new dy(i) : aq[i];
    }

    public static void ba(Collection collection) {
        collection.add(al);
    }

    public static void bs(Collection collection) {
        collection.add(al);
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(lj ljVar, int i) {
        int i2 = 0;
        if (i == 1) {
            this.ai = ljVar.bi(1522563621) * 236647;
        } else if (2 == i) {
            this.ae = ljVar.bi(594777164) * -834864443;
        } else if (3 == i) {
            this.am = ljVar.bm(1692241407);
        } else if (4 == i) {
            this.ak = ljVar.av((byte) -46) * -3776973;
        } else if (5 == i) {
            ljVar.av((byte) -69);
        } else if (i == 6) {
            this.as = ljVar.af(1804771424) * -626245327;
        } else if (7 == i) {
            ljVar.af(1804771424);
        } else if (8 == i) {
            ljVar.af(1804771424);
        } else if (i >= 10 && i <= 14) {
            this.ap[i - 10] = ljVar.bm(1200078007);
        } else if (i == 15) {
            int i3;
            int af = ljVar.af(1804771424);
            int i4 = af * 2;
            this.az = new int[i4];
            for (i3 = 0; i3 < i4; i3++) {
                this.az[i3] = ljVar.ab(430864491);
            }
            ljVar.at((byte) -103);
            this.af = new int[ljVar.af(1804771424)];
            for (i3 = 0; i3 < this.af.length; i3++) {
                this.af[i3] = ljVar.at((byte) -65);
            }
            this.ay = new byte[af];
            while (i2 < af) {
                this.ay[i2] = ljVar.ay(-218016152);
                i2++;
            }
        } else if (16 == i) {
        } else {
            if (17 == i) {
                this.au = ljVar.bm(1449476911);
            } else if (18 == i) {
                ljVar.bi(804889276);
            } else if (19 == i) {
                this.an = ljVar.an(-1464407032) * -1724182535;
            } else if (i == 21) {
                ljVar.at((byte) -74);
            } else if (i == 22) {
                ljVar.at((byte) -78);
            } else if (23 == i) {
                ljVar.af(1804771424);
                ljVar.af(1804771424);
                ljVar.af(1804771424);
            } else if (i == 24) {
                ljVar.ab(-2084868061);
                ljVar.ab(-1749792381);
            } else if (25 == i) {
                ljVar.bi(1933674354);
            } else if (28 == i) {
                ljVar.af(1804771424);
            } else if (29 == i) {
                this.ao = (dn) oz.ad(cf.aq(2027702652), ljVar.af(1804771424), (byte) 99);
            } else if (i == 30) {
                this.ah = (dq) oz.ad(cz.aq(-1395049881), ljVar.af(1804771424), (byte) -88);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ee ab(int i) {
        if (i < 0) {
            return null;
        }
        long j = (long) i;
        ee eeVar = (ee) al.ad(j);
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(ad, i, 0, (byte) -20);
        if (eeVar == null) {
            return eeVar;
        }
        al.ar(eeVar, j);
        return eeVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(lj ljVar, int i) {
        int i2 = 0;
        if (i == 1) {
            this.ai = ljVar.bi(1512587066) * 236647;
        } else if (2 == i) {
            this.ae = ljVar.bi(-436743014) * -834864443;
        } else if (3 == i) {
            this.am = ljVar.bm(1418504247);
        } else if (4 == i) {
            this.ak = ljVar.av((byte) -116) * -3776973;
        } else if (5 == i) {
            ljVar.av((byte) -38);
        } else if (i == 6) {
            this.as = ljVar.af(1804771424) * -626245327;
        } else if (7 == i) {
            ljVar.af(1804771424);
        } else if (8 == i) {
            ljVar.af(1804771424);
        } else if (i >= 10 && i <= 14) {
            this.ap[i - 10] = ljVar.bm(1989489909);
        } else if (i == 15) {
            int i3;
            int af = ljVar.af(1804771424);
            int i4 = af * 2;
            this.az = new int[i4];
            for (i3 = 0; i3 < i4; i3++) {
                this.az[i3] = ljVar.ab(83582952);
            }
            ljVar.at((byte) -55);
            this.af = new int[ljVar.af(1804771424)];
            for (i3 = 0; i3 < this.af.length; i3++) {
                this.af[i3] = ljVar.at((byte) -47);
            }
            this.ay = new byte[af];
            while (i2 < af) {
                this.ay[i2] = ljVar.ay(1142284523);
                i2++;
            }
        } else if (16 == i) {
        } else {
            if (17 == i) {
                this.au = ljVar.bm(1069735514);
            } else if (18 == i) {
                ljVar.bi(122368335);
            } else if (19 == i) {
                this.an = ljVar.an(-1464407032) * -1724182535;
            } else if (i == 21) {
                ljVar.at((byte) -70);
            } else if (i == 22) {
                ljVar.at((byte) -97);
            } else if (23 == i) {
                ljVar.af(1804771424);
                ljVar.af(1804771424);
                ljVar.af(1804771424);
            } else if (i == 24) {
                ljVar.ab(1874115814);
                ljVar.ab(-242233019);
            } else if (25 == i) {
                ljVar.bi(1000289183);
            } else if (28 == i) {
                ljVar.af(1804771424);
            } else if (29 == i) {
                this.ao = (dn) oz.ad(cf.aq(2027702652), ljVar.af(1804771424), (byte) -25);
            } else if (i == 30) {
                this.ah = (dq) oz.ad(cz.aq(1612905254), ljVar.af(1804771424), (byte) -18);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ee ae(int i, int i2) {
        if (i < 0) {
            return null;
        }
        try {
            long j = (long) i;
            ee eeVar = (ee) al.ad(j);
            if (eeVar != null) {
                return eeVar;
            }
            eeVar = jc.ai(ad, i, 0, (byte) -34);
            if (eeVar == null) {
                return eeVar;
            }
            al.ar(eeVar, j);
            return eeVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dy.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af() {
        if (this.az != null) {
            for (int i = 0; i < this.az.length; i += 2) {
                if (this.az[i] < this.ax * -1080596959) {
                    this.ax = this.az[i] * -1332898885;
                } else if (this.az[i] > this.ac * -2113508760) {
                    this.ac = this.az[i] * 1804046479;
                }
                int i2 = i + 1;
                if (this.az[i2] < this.aw * -502157281) {
                    this.aw = this.az[i2] * 575565154;
                } else if (this.az[i2] > this.aa * 1943173077) {
                    this.aa = this.az[i2] * 191957373;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah() {
        if (this.az != null) {
            for (int i = 0; i < this.az.length; i += 2) {
                if (this.az[i] < this.ax * 174471539) {
                    this.ax = this.az[i] * -1332898885;
                } else if (this.az[i] > this.ac * -202928529) {
                    this.ac = this.az[i] * 1804046479;
                }
                int i2 = i + 1;
                if (this.az[i2] < this.aw * -502157281) {
                    this.aw = this.az[i2] * -365835297;
                } else if (this.az[i2] > this.aa * 1943173077) {
                    this.aa = this.az[i2] * 191957373;
                }
            }
        }
    }

    public ee ai(boolean z, int i) {
        int i2;
        if (z) {
            try {
                i2 = this.ae * 1552839693;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dy.ai(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        i2 = -584859817 * this.ai;
        return ae(i2, -645429428);
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i) {
        try {
            if (this.az != null) {
                for (int i2 = 0; i2 < this.az.length; i2 += 2) {
                    if (this.az[i2] < this.ax * 174471539) {
                        this.ax = this.az[i2] * -1332898885;
                    } else if (this.az[i2] > this.ac * -202928529) {
                        this.ac = this.az[i2] * 1804046479;
                    }
                    int i3 = i2 + 1;
                    if (this.az[i3] < this.aw * -502157281) {
                        this.aw = this.az[i3] * -365835297;
                    } else if (this.az[i3] > this.aa * 1943173077) {
                        this.aa = this.az[i3] * 191957373;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dy.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, int i2) {
        int i3 = 0;
        if (i == 1) {
            try {
                this.ai = ljVar.bi(318506306) * 236647;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dy.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (2 == i) {
            this.ae = ljVar.bi(-125561854) * -834864443;
        } else if (3 == i) {
            this.am = ljVar.bm(1334681936);
        } else if (4 == i) {
            this.ak = ljVar.av((byte) -66) * -3776973;
        } else if (5 == i) {
            ljVar.av((byte) -68);
        } else if (i == 6) {
            this.as = ljVar.af(1804771424) * -626245327;
        } else if (7 == i) {
            ljVar.af(1804771424);
        } else if (8 == i) {
            ljVar.af(1804771424);
        } else if (i >= 10 && i <= 14) {
            this.ap[i - 10] = ljVar.bm(1178746549);
        } else if (i == 15) {
            int i4;
            int af = ljVar.af(1804771424);
            int i5 = af * 2;
            this.az = new int[i5];
            for (i4 = 0; i4 < i5; i4++) {
                this.az[i4] = ljVar.ab(-1910426755);
            }
            ljVar.at((byte) -41);
            this.af = new int[ljVar.af(1804771424)];
            for (i4 = 0; i4 < this.af.length; i4++) {
                this.af[i4] = ljVar.at((byte) -82);
            }
            this.ay = new byte[af];
            while (i3 < af) {
                this.ay[i3] = ljVar.ay(789726644);
                i3++;
            }
        } else if (16 != i) {
            if (17 == i) {
                this.au = ljVar.bm(1826203710);
            } else if (18 == i) {
                ljVar.bi(1919664040);
            } else if (19 == i) {
                this.an = ljVar.an(-1464407032) * -1724182535;
            } else if (i == 21) {
                ljVar.at((byte) -46);
            } else if (i == 22) {
                ljVar.at((byte) -105);
            } else if (23 == i) {
                ljVar.af(1804771424);
                ljVar.af(1804771424);
                ljVar.af(1804771424);
            } else if (i == 24) {
                ljVar.ab(-1782027206);
                ljVar.ab(1869468874);
            } else if (25 == i) {
                ljVar.bi(-496870472);
            } else if (28 == i) {
                ljVar.af(1804771424);
            } else if (29 == i) {
                this.ao = (dn) oz.ad(cf.aq(2027702652), ljVar.af(1804771424), (byte) -18);
            } else if (i == 30) {
                this.ah = (dq) oz.ad(cz.aq(2063982719), ljVar.af(1804771424), (byte) 24);
            }
        }
    }

    public int am(int i) {
        try {
            return this.aj * -1701077253;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dy.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ee an(boolean z) {
        return ae(z ? this.ae * 1552839693 : -584859817 * this.ai, 1009027999);
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(lj ljVar, int i) {
        int i2 = 0;
        if (i == 1) {
            this.ai = ljVar.bi(1898780690) * -138470435;
        } else if (2 == i) {
            this.ae = ljVar.bi(1037467368) * 1533076034;
        } else if (3 == i) {
            this.am = ljVar.bm(1126930394);
        } else if (4 == i) {
            this.ak = ljVar.av((byte) -8) * -1706165265;
        } else if (5 == i) {
            ljVar.av((byte) -92);
        } else if (i == 6) {
            this.as = ljVar.af(1804771424) * 701478366;
        } else if (7 == i) {
            ljVar.af(1804771424);
        } else if (8 == i) {
            ljVar.af(1804771424);
        } else if (i >= 10 && i <= 14) {
            this.ap[i - 10] = ljVar.bm(1253053477);
        } else if (i == 15) {
            int i3;
            int af = ljVar.af(1804771424);
            int i4 = af * 2;
            this.az = new int[i4];
            for (i3 = 0; i3 < i4; i3++) {
                this.az[i3] = ljVar.ab(-1374286131);
            }
            ljVar.at((byte) -60);
            this.af = new int[ljVar.af(1804771424)];
            for (i3 = 0; i3 < this.af.length; i3++) {
                this.af[i3] = ljVar.at((byte) -86);
            }
            this.ay = new byte[af];
            while (i2 < af) {
                this.ay[i2] = ljVar.ay(-1104395729);
                i2++;
            }
        } else if (16 == i) {
        } else {
            if (17 == i) {
                this.au = ljVar.bm(1230961353);
            } else if (18 == i) {
                ljVar.bi(2057681196);
            } else if (19 == i) {
                this.an = ljVar.an(-1464407032) * -1724182535;
            } else if (i == 21) {
                ljVar.at((byte) -7);
            } else if (i == 22) {
                ljVar.at((byte) -85);
            } else if (23 == i) {
                ljVar.af(1804771424);
                ljVar.af(1804771424);
                ljVar.af(1804771424);
            } else if (i == 24) {
                ljVar.ab(-317173764);
                ljVar.ab(1783804051);
            } else if (25 == i) {
                ljVar.bi(402215300);
            } else if (28 == i) {
                ljVar.af(1804771424);
            } else if (29 == i) {
                this.ao = (dn) oz.ad(cf.aq(2027702652), ljVar.af(1804771424), (byte) 48);
            } else if (i == 30) {
                this.ah = (dq) oz.ad(cz.aq(886854831), ljVar.af(1804771424), (byte) 98);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, int i) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    al(ljVar, af, 1469926505);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dy.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public int at() {
        return this.aj * -1701077253;
    }

    public int av() {
        return this.aj * -2072010748;
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 1007138488);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 1403938823);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ay() {
        if (this.az != null) {
            for (int i = 0; i < this.az.length; i += 2) {
                if (this.az[i] < this.ax * 174471539) {
                    this.ax = this.az[i] * -1332898885;
                } else if (this.az[i] > this.ac * -202928529) {
                    this.ac = this.az[i] * 1804046479;
                }
                int i2 = i + 1;
                if (this.az[i2] < this.aw * -502157281) {
                    this.aw = this.az[i2] * -365835297;
                } else if (this.az[i2] > this.aa * 1943173077) {
                    this.aa = this.az[i2] * 191957373;
                }
            }
        }
    }

    public int bk() {
        return this.aj * -1701077253;
    }
}
