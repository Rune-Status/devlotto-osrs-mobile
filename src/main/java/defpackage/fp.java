package defpackage;

/* renamed from: fp */
public final class fp {
    public static final int ad = 1;
    public static final int ae = 9;
    public static final int ai = 8;
    public static final int aj = 6;
    public static final int ak = 11;
    public static final int al = 5;
    public static final int ao = 35;
    public static final int aq = 3;
    public static final int ar = 4;
    public static final int as = 12;
    public static final int cc = 1012;
    public static final int cy = 1011;

    fp() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fp.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ao(String str, int i) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(go.ht);
            stringBuilder.append(str);
            stringBuilder.append(go.hx);
            oz.ak(stringBuilder.toString(), -769293814);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("fp.ao(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    static void bi(es esVar, int i) {
        try {
            int i2 = (hm.as * 1034216923) - (fk.aa.aq - 383);
            if (i2 > 0) {
                esVar.ah(fk.aa, 0, 0, fk.aa.aq * 2, fk.aa.ar * 2, -436309052);
                esVar.ah(hs.ao, (esVar.aq * 1462922907) - (hs.ao.aq * 2), 0, hs.ao.aq * 2, hs.ao.ar * 2, -1683949056);
            }
            esVar.az(fk.aa, i2, 0, -1298564983);
            esVar.az(hs.ao, (hm.as * 1034216923) + 382, 0, -1702445224);
            esVar.aa(el.ah, (((hm.as * 1034216923) + 382) - (el.ah.ar / 2)) - el.ah.aj, 89 - (el.ah.al / 2), (byte) -5);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fp.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void cw(int i) {
        int i2 = 0;
        try {
            int i3;
            int i4;
            if (client.ha * -1897849765 == 0) {
                i3 = da.jc.bq * -1444273727;
                i4 = da.jc.bd * -1690563339;
                if ((eo.hv * 1897176415) - i3 < -500 || (eo.hv * 1897176415) - i3 > 500 || (cl.hs * 1983928325) - i4 < -500 || (cl.hs * 1983928325) - i4 > 500) {
                    eo.hv = -1665991009 * i3;
                    cl.hs = -1071729459 * i4;
                }
                if (eo.hv * 1897176415 != i3) {
                    eo.hv = (((i3 - (eo.hv * 1897176415)) / 16) * -1665991009) + eo.hv;
                }
                if (i4 != cl.hs * 1983928325) {
                    cl.hs += ((i4 - (cl.hs * 1983928325)) / 16) * -1071729459;
                }
                int i5 = (eo.hv * 1897176415) >> 7;
                int i6 = (cl.hs * 1983928325) >> 7;
                int dg = nh.dg(eo.hv * 1897176415, cl.hs * 1983928325, am.jy * 1973701849, -1639082459);
                if (i5 > 3 && i6 > 3 && i5 < 100 && i6 < 100) {
                    int i7 = i5 - 4;
                    while (i7 <= i5 + 4) {
                        i4 = i6 - 4;
                        i3 = i2;
                        while (i4 <= i6 + 4) {
                            i2 = am.jy * 1973701849;
                            if (i2 < 3 && 2 == (in.aq[1][i7][i4] & 2)) {
                                i2++;
                            }
                            i2 = dg - in.ad[i2][i7][i4];
                            if (i2 <= i3) {
                                i2 = i3;
                            }
                            i4++;
                            i3 = i2;
                        }
                        i7++;
                        i2 = i3;
                    }
                }
                i2 *= 192;
                if (i2 > 98048) {
                    i2 = 98048;
                }
                if (i2 < 32768) {
                    i2 = 32768;
                }
                if (i2 > client.f2if * 2128975215) {
                    client.f2if = (((i2 - (client.f2if * 2128975215)) / 24) * -830903921) + client.f2if;
                } else if (i2 < client.f2if * 2128975215) {
                    client.f2if = (((i2 - (client.f2if * 2128975215)) / 80) * -830903921) + client.f2if;
                }
                ne.hz = (nh.dg(da.jc.bq * -1444273727, da.jc.bd * -1690563339, am.jy * 1973701849, -1942320780) - (client.he * 911832523)) * -405904583;
            } else if (client.ha * -1897849765 == 1) {
                cy.ih(-1781000972);
                i3 = client.bh.ba(33, -1620542321) ? 0 : client.bh.ba(49, -1620542321) ? 1024 : -1;
                i4 = client.bh.ba(48, -1620542321) ? i3 == 0 ? ox.ak : 1024 == i3 ? kr.ae : oy.am : client.bh.ba(50, -1620542321) ? i3 == 0 ? 256 : 1024 == i3 ? ox.aj : 512 : i3;
                i3 = client.bh.ba(35, -1620542321) ? -1 : client.bh.ba(51, -1620542321) ? 1 : 0;
                if (i4 >= 0 || i3 != 0) {
                    i2 = (client.bh.ba(81, -1620542321) ? client.hn * 1604231987 : client.hy * 2006414001) * 16;
                    client.hm = i4 * -1725431645;
                    client.ho = i3 * 2052322317;
                }
                if (client.hw * 2026536889 < i2) {
                    client.hw += (i2 / 8) * -398076279;
                    if (client.hw * 2026536889 > i2) {
                        client.hw = i2 * -398076279;
                    }
                } else if (client.hw * 2026536889 > i2) {
                    client.hw = ((client.hw * 1058962817) / 10) * -398076279;
                }
                if (client.hw * 2026536889 > 0) {
                    i2 = (client.hw * 2026536889) / 16;
                    if (client.hm * -1858948341 >= 0) {
                        i3 = ((client.hm * -1858948341) - (gs.hd * 772603733)) & 2047;
                        i4 = bl.aa[i3];
                        i3 = bl.ao[i3];
                        eo.hv = (((i4 * i2) / 65536) * -1665991009) + eo.hv;
                        cl.hs = (((i3 * i2) / 65536) * -1071729459) + cl.hs;
                    }
                    if (client.ho * -1900840251 != 0) {
                        ne.hz = ((i2 * (client.ho * -1900840251)) * -405904583) + ne.hz;
                        if (ne.hz * -1979475191 > 0) {
                            ne.hz = 0;
                        }
                    }
                } else {
                    client.hm = 1725431645;
                    client.ho = -2052322317;
                }
                if (client.bh.ba(13, -1620542321)) {
                    jg.ix(-1365987160);
                }
            }
            if (io.ap == client.bh.ad) {
                i2 = client.bh.am[client.bh.br * -1839915979];
                i3 = client.bh.ak[client.bh.br * -1839915979];
                i4 = i3 - (client.hu * 857671497);
                client.hx = -1965662470 * i4;
                if (!(-1 == i4 || 1 == i4)) {
                    i3 = (i3 + (client.hu * 857671497)) / 2;
                }
                client.hu = i3 * -1997497607;
                i3 = (client.hi * 1913441363) - i2;
                client.ht = 774354390 * i3;
                if (!(-1 == i3 || i3 == 1)) {
                    i2 = (i2 + (client.hi * 1913441363)) / 2;
                }
                client.hi = i2 * -665888805;
            } else {
                if (client.bh.ba(96, -1620542321)) {
                    client.ht += ((-72 - (client.ht * -1472661175)) / 4) * 387177195;
                } else if (client.bh.ba(97, -1620542321)) {
                    client.ht += ((72 - (client.ht * -1472661175)) / 4) * 387177195;
                } else {
                    client.ht = ((client.ht * 940768707) / 2) * 387177195;
                }
                if (client.bh.ba(98, -1620542321)) {
                    client.hx += ((36 - (client.hx * -1470233217)) / 4) * 1164652413;
                } else if (client.bh.ba(99, -1620542321)) {
                    client.hx += ((-36 - (client.hx * -1470233217)) / 4) * 1164652413;
                } else {
                    client.hx = ((client.hx * -490077739) / 2) * 1164652413;
                }
                client.hu = client.bh.ak[0] * -1997497607;
                client.hi = client.bh.am[0] * -665888805;
            }
            client.hq = (((client.hh * -509637623) + (client.hq * 1091227615)) & 2047) * 1490660383;
            client.hf += client.hk * -1545665205;
            client.hh = ((client.ht * 940768707) / 2) * -851197383;
            client.hk = ((client.hx * -490077739) / 2) * 1288814663;
            if (client.hf * 738069765 < 128) {
                client.hf = -2032408960;
            }
            if (client.hf * 738069765 > bc.cn) {
                client.hf = 1199963059;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fp.cw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
