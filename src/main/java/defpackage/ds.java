package defpackage;

/* renamed from: ds */
public class ds {
    static int am = 0;
    public static final int aq = 2;
    static final int dh = 0;
    static int tm;

    ds() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ds.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ad(lv lvVar, int i) {
        try {
            lvVar.jt(1153685242);
            int i2 = 869197827 * client.jj;
            hv[] hvVarArr = client.jz;
            hv hvVar = new hv();
            hvVarArr[i2] = hvVar;
            da.jc = hvVar;
            hvVar.av = 886128595 * i2;
            int jm = lvVar.jm(30, -1742485233);
            byte b = (byte) (jm >> 28);
            hvVar.db[0] = ((jm >> 14) & 16383) - (oz.ff * 2060098323);
            hvVar.bq = ((hvVar.db[0] << 7) + (hvVar.am(1144051532) << 6)) * 590147137;
            hvVar.dc[0] = (jm & 16383) - (cq.fz * -1866366501);
            hvVar.bd = ((hvVar.dc[0] << 7) + (hvVar.am(-594760040) << 6)) * -995934371;
            jm = -762089045 * b;
            hvVar.ab = jm;
            am.jy = jm * -23215301;
            if (hz.aj[i2] != null) {
                hvVar.ad(hz.aj[i2], 2073848384);
            }
            hz.ai = 0;
            int[] iArr = hz.ae;
            int i3 = hz.ai + 1600734293;
            hz.ai = i3;
            iArr[(i3 * -1076782851) - 1] = i2;
            hz.ar[i2] = (byte) 0;
            hz.am = 0;
            for (jm = 1; jm < 2048; jm++) {
                if (jm != i2) {
                    i3 = lvVar.jm(18, 781086750);
                    hz.as[jm] = (i3 & 597) + (((i3 >> 16) << 28) + (((i3 >> 8) & 597) << 14));
                    hz.ag[jm] = 0;
                    hz.ap[jm] = -1;
                    int[] iArr2 = hz.ak;
                    int i4 = hz.am - 178737783;
                    hz.am = i4;
                    iArr2[(i4 * 1674041529) - 1] = jm;
                    hz.ar[jm] = (byte) 0;
                }
            }
            lvVar.js(-1056657961);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ds.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ae(ot otVar, int i, int i2) {
        if (otVar == null) {
            return i2;
        }
        ms msVar = (ms) otVar.ad((long) i);
        return msVar != null ? msVar.ad : i2;
    }

    public static int ai(int i, int i2, int i3) {
        int i4 = i >>> 31;
        try {
            return ((i + i4) / i2) - i4;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ds.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ai(ot otVar, int i, int i2) {
        if (otVar == null) {
            return i2;
        }
        ms msVar = (ms) otVar.ad((long) i);
        return msVar != null ? msVar.ad : i2;
    }

    static int aj(ot otVar, int i, int i2) {
        if (otVar == null) {
            return i2;
        }
        ms msVar = (ms) otVar.ad((long) i);
        return msVar != null ? msVar.ad : i2;
    }

    static int al(ot otVar, int i, int i2) {
        if (otVar == null) {
            return i2;
        }
        ms msVar = (ms) otVar.ad((long) i);
        return msVar != null ? msVar.ad : i2;
    }

    static String am(ot otVar, int i, String str) {
        if (otVar == null) {
            return str;
        }
        md mdVar = (md) otVar.ad((long) i);
        return mdVar != null ? (String) mdVar.ad : str;
    }

    public static dj aq(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < dj.aq.length) {
                    return dj.aq[i];
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ds.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return dj.ar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ac A:{Catch:{ RuntimeException -> 0x02a6 }} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e0 A:{Catch:{ RuntimeException -> 0x02a6 }} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0115 A:{Catch:{ RuntimeException -> 0x02a6 }} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x028f A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final boolean aq(int i, int i2, gn gnVar, gs gsVar, byte b) {
        try {
            gv.ar[64][64] = 99;
            gv.al[64][64] = 0;
            gv.am[0] = i;
            gv.ak[0] = i2;
            int[][] iArr = gsVar.bc;
            int i3 = i2;
            int i4 = 0;
            int i5 = i;
            int i6;
            for (int i7 = 1; i4 != i7; i7 = i6) {
                i5 = gv.am[i4];
                i3 = gv.ak[i4];
                int i8 = i5 - (i - 64);
                int i9 = i3 - (i2 - 64);
                int i10 = i5 - (gsVar.bl * -1403677009);
                int i11 = i3 - (gsVar.bf * -342516413);
                if (gnVar.ad(1, i5, i3, gsVar, (byte) -14)) {
                    di.aj = 872498109 * i5;
                    gv.ai = 1542774803 * i3;
                    return true;
                }
                int i12;
                int i13 = gv.al[i8][i9] + 1;
                if (i8 > 0) {
                    int i14 = i8 - 1;
                    if (gv.ar[i14][i9] == 0 && (iArr[i10 - 1][i11] & 19136776) == 0) {
                        int i15;
                        gv.am[i7] = i5 - 1;
                        gv.ak[i7] = i3;
                        i6 = (i7 + 1) & 4095;
                        gv.ar[i14][i9] = 2;
                        gv.al[i14][i9] = i13;
                        if (i8 < 127) {
                            i12 = i8 + 1;
                            if (gv.ar[i12][i9] == 0 && (iArr[i10 + 1][i11] & 19136896) == 0) {
                                gv.am[i6] = i5 + 1;
                                gv.ak[i6] = i3;
                                i6 = (i6 + 1) & 4095;
                                gv.ar[i12][i9] = 8;
                                gv.al[i12][i9] = i13;
                            }
                        }
                        if (i9 > 0) {
                            i12 = i9 - 1;
                            if (gv.ar[i8][i12] == 0 && (iArr[i10][i11 - 1] & 19136770) == 0) {
                                gv.am[i6] = i5;
                                gv.ak[i6] = i3 - 1;
                                i6 = (i6 + 1) & 4095;
                                gv.ar[i8][i12] = 1;
                                gv.al[i8][i12] = i13;
                            }
                        }
                        if (i9 < 127) {
                            i12 = i9 + 1;
                            if (gv.ar[i8][i12] == 0 && (iArr[i10][i11 + 1] & 19136800) == 0) {
                                gv.am[i6] = i5;
                                gv.ak[i6] = i3 + 1;
                                i6 = (i6 + 1) & 4095;
                                gv.ar[i8][i12] = 4;
                                gv.al[i8][i12] = i13;
                            }
                        }
                        if (i8 > 0 && i9 > 0) {
                            i12 = i8 - 1;
                            i7 = i9 - 1;
                            if (gv.ar[i12][i7] == 0) {
                                i14 = i10 - 1;
                                i15 = i11 - 1;
                                if ((iArr[i14][i15] & 19136782) == 0 && (iArr[i14][i11] & 19136776) == 0 && (iArr[i10][i15] & 19136770) == 0) {
                                    gv.am[i6] = i5 - 1;
                                    gv.ak[i6] = i3 - 1;
                                    i6 = (i6 + 1) & 4095;
                                    gv.ar[i12][i7] = 3;
                                    gv.al[i12][i7] = i13;
                                }
                            }
                        }
                        if (i8 < 127 && i9 > 0) {
                            i12 = i8 + 1;
                            i7 = i9 - 1;
                            if (gv.ar[i12][i7] == 0) {
                                i14 = i10 + 1;
                                i15 = i11 - 1;
                                if ((iArr[i14][i15] & 19136899) == 0 && (iArr[i14][i11] & 19136896) == 0 && (19136770 & iArr[i10][i15]) == 0) {
                                    gv.am[i6] = i5 + 1;
                                    gv.ak[i6] = i3 - 1;
                                    i6 = (i6 + 1) & 4095;
                                    gv.ar[i12][i7] = 9;
                                    gv.al[i12][i7] = i13;
                                }
                            }
                        }
                        if (i8 > 0 && i9 < 127) {
                            i12 = i8 - 1;
                            i7 = i9 + 1;
                            if (gv.ar[i12][i7] == 0) {
                                i14 = i10 - 1;
                                i15 = i11 + 1;
                                if ((iArr[i14][i15] & 19136824) == 0 && (iArr[i14][i11] & 19136776) == 0 && (iArr[i10][i15] & 19136800) == 0) {
                                    gv.am[i6] = i5 - 1;
                                    gv.ak[i6] = i3 + 1;
                                    i6 = (i6 + 1) & 4095;
                                    gv.ar[i12][i7] = 6;
                                    gv.al[i12][i7] = i13;
                                }
                            }
                        }
                        if (i8 < 127 && i9 < 127) {
                            i12 = i8 + 1;
                            i7 = i9 + 1;
                            if (gv.ar[i12][i7] != 0) {
                                i14 = i10 + 1;
                                i9 = i11 + 1;
                                if ((iArr[i14][i9] & 19136992) == 0 && (iArr[i14][i11] & 19136896) == 0 && (iArr[i10][i9] & 19136800) == 0) {
                                    gv.am[i6] = i5 + 1;
                                    gv.ak[i6] = i3 + 1;
                                    gv.ar[i12][i7] = 12;
                                    gv.al[i12][i7] = i13;
                                    i6 = (i6 + 1) & 4095;
                                }
                            }
                        }
                        i4 = (i4 + 1) & 4095;
                    }
                }
                i6 = i7;
                if (i8 < 127) {
                }
                if (i9 > 0) {
                }
                if (i9 < 127) {
                }
                i12 = i8 - 1;
                i7 = i9 - 1;
                if (gv.ar[i12][i7] == 0) {
                }
                i12 = i8 + 1;
                i7 = i9 - 1;
                if (gv.ar[i12][i7] == 0) {
                }
                i12 = i8 - 1;
                i7 = i9 + 1;
                if (gv.ar[i12][i7] == 0) {
                }
                i12 = i8 + 1;
                i7 = i9 + 1;
                if (gv.ar[i12][i7] != 0) {
                }
                i4 = (i4 + 1) & 4095;
            }
            di.aj = 872498109 * i5;
            gv.ai = 1542774803 * i3;
            return false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ds.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int as(long j) {
        return (int) ((j >>> 14) & 3);
    }

    public static int au(String str, int i) {
        try {
            return str.length() + 2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ds.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int ax(int i, int i2, int i3, int i4) {
        try {
            int i5 = i / i3;
            int i6 = i3 - 1;
            int i7 = i & i6;
            int i8 = i2 / i3;
            int ac = dz.ac(i5, i8, 1771962059);
            int i9 = i5 + 1;
            int ac2 = dz.ac(i9, i8, -1172528101);
            i8++;
            return lt.aw(lt.aw(ac, ac2, i7, i3, (byte) 4), lt.aw(dz.ac(i5, i8, -1992364540), dz.ac(i9, i8, -1413328203), i7, i3, (byte) 4), i6 & i2, i3, (byte) 4);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ds.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ba(int i) {
        StringBuilder stringBuilder;
        try {
            int i2 = 0;
            int ec;
            int ec2;
            StringBuilder stringBuilder2;
            if (client.ca * 1349663281 == 0) {
                client.aq.ade(client.ai * 975409481 == 2, -1241954957);
                ce.fk = new bc(4, 104, 104, in.ad);
                for (i2 = 0; i2 < 4; i2++) {
                    client.gc[i2] = new gs(104, 104);
                }
                ix.oj = new ee(512, 512);
                fn.ox = new eb(ix.oj.ad, 512, 512);
                hm.bi = go.ax;
                hm.bb = -2123584971;
                client.ca = -1481545644;
            } else if (client.ca * 1349663281 == 20) {
                hm.bi = go.aw;
                hm.bb = 47797354;
                client.ca = 2072648830;
            } else if (client.ca * 1349663281 == 30) {
                boolean gw = hr.um.gw(-2087751512);
                ho.cl = ks.bs(0, false, true, gw, 824695289);
                af.cz = ks.bs(1, false, true, gw, 1955325413);
                bn.cd = ks.bs(2, true, false, gw, 703984987);
                gn.cf = ks.bs(3, false, true, gw, 1107731852);
                av.cg = ks.bs(4, false, true, gw, 140052);
                dh.ch = ks.bs(5, true, true, gw, -12411878);
                cw.dd = ks.bs(6, true, true, gw, 621690832);
                ac.dm = ks.bs(7, false, true, gw, -1069014021);
                fx.dt = ks.bs(8, false, true, gw, 375761439);
                dk.dv = ks.bs(9, false, true, gw, -1678203158);
                df.di = ks.bs(10, false, true, gw, 106160005);
                cy.dl = ks.bs(11, false, true, gw, -170415757);
                at.dr = ks.bs(12, false, true, gw, -1878140286);
                dn.df = ks.bs(13, true, false, gw, -328269937);
                cj.da = ks.bs(14, false, true, gw, -556187223);
                bl.db = ks.bs(15, false, true, gw, -700990926);
                hl.dn = ks.bs(17, true, true, gw, 1490909102);
                bv.du = ks.bs(18, false, true, gw, -1040556589);
                hl.dc = ks.bs(19, false, true, gw, -1095000969);
                do.dp = ks.bs(20, false, true, gw, 36827656);
                hm.bi = go.ac;
                hm.bb = 95594708;
                client.ca = 1331876008;
            } else if (40 == client.ca * 1349663281) {
                ec = (ho.cl.ec(2113677904) * 4) / 100;
                int ec3 = (af.cz.ec(2113677904) * 4) / 100;
                ec2 = (bn.cd.ec(2113677904) * 2) / 100;
                int ec4 = (gn.cf.ec(2113677904) * 2) / 100;
                int ec5 = (av.cg.ec(2113677904) * 6) / 100;
                int ec6 = (dh.ch.ec(2113677904) * 4) / 100;
                int ec7 = (cw.dd.ec(2113677904) * 2) / 100;
                int ec8 = (ac.dm.ec(2113677904) * 56) / 100;
                int ec9 = (fx.dt.ec(2113677904) * 2) / 100;
                int ec10 = (dk.dv.ec(2113677904) * 2) / 100;
                int ec11 = (df.di.ec(2113677904) * 2) / 100;
                int ec12 = (cy.dl.ec(2113677904) * 2) / 100;
                int ec13 = (at.dr.ec(2113677904) * 2) / 100;
                int ec14 = (dn.df.ec(2113677904) * 2) / 100;
                int ec15 = (cj.da.ec(2113677904) * 2) / 100;
                int ec16 = (bl.db.ec(2113677904) * 2) / 100;
                int ec17 = (hl.dc.ec(2113677904) * 1) / 100;
                int ec18 = (bv.du.ec(2113677904) * 1) / 100;
                int ec19 = (do.dp.ec(2113677904) * 1) / 100;
                if (hl.dn.eh(1349524144) && hl.dn.am(1631873133)) {
                    i2 = 1;
                }
                i2 += ((((((((((((((((((ec + 0) + ec3) + ec2) + ec4) + ec5) + ec6) + ec7) + ec8) + ec9) + ec10) + ec11) + ec12) + ec13) + ec14) + ec15) + ec16) + ec17) + ec18) + ec19;
                if (100 != i2) {
                    if (i2 != 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(go.aa);
                        stringBuilder.append(i2);
                        stringBuilder.append("%");
                        hm.bi = stringBuilder.toString();
                    }
                    hm.bb = 143392062;
                    return;
                }
                eg.ay(ho.cl, "Animations", 2131689796);
                eg.ay(af.cz, "Skeletons", 2131689796);
                eg.ay(av.cg, "Sound FX", 2131689796);
                eg.ay(dh.ch, "Maps", 2131689796);
                eg.ay(cw.dd, "Music Tracks", 2131689796);
                eg.ay(ac.dm, "Models", 2131689796);
                eg.ay(fx.dt, "Sprites", 2131689796);
                eg.ay(cy.dl, "Music Jingles", 2131689796);
                eg.ay(cj.da, "Music Samples", 2131689796);
                eg.ay(bl.db, "Music Patches", 2131689796);
                eg.ay(hl.dc, "World Map", 2131689796);
                eg.ay(bv.du, "World Map Geography", 2131689796);
                eg.ay(do.dp, "World Map Ground", 2131689796);
                ar.de = new og();
                ar.de.ad(hl.dn, -1708189560);
                hm.bi = go.ao;
                hm.bb = 143392062;
                client.ca = 961489597;
            } else if (45 == client.ca * 1349663281) {
                dk.ai(22050, !client.as, 2, 473075613);
                hd.pn = new kp();
                hd.pn.az(9, 128, 632158636);
                ay.ad(bl.db, cj.da, av.cg, hd.pn, -463842022);
                em.pt = am.ae(mi.sm, 0, 2048, -980434798);
                gd.pf = new gf();
                gf gfVar = new gf();
                gfVar.ad(hd.pn);
                gfVar.ad(gd.pf);
                em.pt.am(gfVar, (byte) 1);
                dk.px = new hx(22050, hd.ad * -754139271);
                hm.bi = go.ah;
                hm.bb = -1980192909;
                client.ca = 591103186;
                du.fw = new lr(fx.dt, dn.df);
            } else if (50 == client.ca * 1349663281) {
                i2 = lq.ad(-2102564008).length;
                client.fh = du.fw.ad(lq.ad(-2102564008), 1992623952);
                if (client.fh.size() < i2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(go.af);
                    stringBuilder.append((client.fh.size() * 100) / i2);
                    stringBuilder.append("%");
                    hm.bi = stringBuilder.toString();
                    hm.bb = 191189416;
                    return;
                }
                dz.fn = (oi) client.fh.get(lq.ad);
                client.fm = (oi) client.fh.get(lq.aq);
                lh.fs = (oi) client.fh.get(lq.ar);
                client.rc = new pu(client.aq);
                bu.rv = client.rc.ad((byte) 1);
                hm.bi = go.ay;
                hm.bb = 191189416;
                client.ca = -149669636;
            } else if (60 == client.ca * 1349663281) {
                i2 = fi.ad(df.di, fx.dt, (byte) 4);
                ec = fu.aq(-1275528730);
                if (i2 < ec) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(go.an);
                    stringBuilder3.append((i2 * 100) / ec);
                    stringBuilder3.append("%");
                    hm.bi = stringBuilder3.toString();
                    hm.bb = 238986770;
                    return;
                }
                hm.bi = go.ab;
                hm.bb = 238986770;
                if (br.adb(1910320000)) {
                    he.ac(5, (byte) 102);
                    client.ca = -890442458;
                    iw.adq(1887172284);
                }
            } else if (client.ca * 1349663281 == 70) {
                if (bn.cd.am(1631873133)) {
                    ag.ad(bn.cd, -1759355046);
                    client.ad(bn.cd, (byte) -100);
                    kw.ad(bn.cd, ac.dm, -899601308);
                    cd.ad(bn.cd, ac.dm, client.as, 927836470);
                    lz.ad(bn.cd, ac.dm, -599669851);
                    ej.ad(bn.cd, (byte) 35);
                    ag.ad(bn.cd, ac.dm, client.ak, dz.fn, 1187205326);
                    fk.ad(bn.cd, ho.cl, af.cz, -176008455);
                    ce.ad(bn.cd, ac.dm, 2130903483);
                    bv.ad(bn.cd, -2049760360);
                    aj.ad(bn.cd, 1408148019);
                    ce.ad(gn.cf, ac.dm, fx.dt, dn.df, 285496183);
                    cn.ad(bn.cd, 1703094101);
                    dt.ad(bn.cd, -1376102787);
                    iw.ad(bn.cd, 1346508633);
                    ay.ad(bn.cd, 1681752252);
                    ec.na = new jv();
                    cu.ad(bn.cd, fx.dt, dn.df, 2129016902);
                    bi.ad(bn.cd, fx.dt, 313665279);
                    dd.ad(bn.cd, fx.dt, 1297887431);
                    hm.bi = go.at;
                    hm.bb = 286784124;
                    client.ca = -1631215280;
                    return;
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(go.av);
                stringBuilder2.append(bn.cd.ed(-926389182));
                stringBuilder2.append("%");
                hm.bi = stringBuilder2.toString();
                hm.bb = 286784124;
            } else if (80 == client.ca * 1349663281) {
                if (cx.gn == null) {
                    cx.gn = jc.ai(fx.dt, ar.de.ad * -650584137, 0, (byte) -69);
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                if (hw.gv == null) {
                    hw.gv = jc.ai(fx.dt, ar.de.aq * -534949635, 0, (byte) -32);
                } else {
                    i2++;
                }
                if (az.gs == null) {
                    az.gs = jf.aq(fx.dt, ar.de.ar * -337716555, 0, -511128376);
                } else {
                    i2++;
                }
                if (client.gu == null) {
                    client.gu = ec.aj(fx.dt, ar.de.al * -221986925, 0, 128565742);
                } else {
                    i2++;
                }
                if (lo.ge == null) {
                    lo.ge = ec.aj(fx.dt, ar.de.aj * -606859743, 0, 214375637);
                } else {
                    i2++;
                }
                if (bi.gz == null) {
                    bi.gz = ec.aj(fx.dt, ar.de.ai * -1510559807, 0, -78207256);
                } else {
                    i2++;
                }
                if (jf.gr == null) {
                    jf.gr = ec.aj(fx.dt, ar.de.ae * -1163942901, 0, -287123310);
                } else {
                    i2++;
                }
                if (dm.gb == null) {
                    dm.gb = ec.aj(fx.dt, ar.de.am * 1488931939, 0, -265220638);
                } else {
                    i2++;
                }
                if (dr.gj == null) {
                    dr.gj = ec.aj(fx.dt, ar.de.ak * -1475849459, 0, -1746382903);
                } else {
                    i2++;
                }
                if (cu.ga == null) {
                    cu.ga = jf.aq(fx.dt, ar.de.as * 566930839, 0, -511128376);
                } else {
                    i2++;
                }
                if (aj.gt == null) {
                    aj.gt = jf.aq(fx.dt, ar.de.ag * 1164551965, 0, -511128376);
                } else {
                    i2++;
                }
                if (i2 < 11) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(go.bk);
                    stringBuilder.append((i2 * 100) / 12);
                    stringBuilder.append("%");
                    hm.bi = stringBuilder.toString();
                    hm.bb = 334581478;
                    return;
                }
                oi.ag = aj.gt;
                hw.gv.ar();
                ec2 = ((int) (Math.random() * 41.0d)) - 20;
                az.gs[0].aq((((int) (Math.random() * 21.0d)) - 10) + ec2, (((int) (Math.random() * 21.0d)) - 10) + ec2, (((int) (Math.random() * 21.0d)) - 10) + ec2);
                gc.km = new fu(lh.fs, dm.gb, true, fx.dt);
                hm.bi = go.ba;
                hm.bb = 334581478;
                client.ca = 1922979194;
            } else if (client.ca * 1349663281 == 90) {
                if (dk.dv.am(1631873133)) {
                    eu.jk = new cv(dk.dv, fx.dt, 20, 0.8d, client.as ? 64 : 128);
                    cy.bf(eu.jk, -589221538);
                    ed.bd(0.8d);
                    client.ca = 1182206372;
                    return;
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(go.bs);
                stringBuilder2.append("0%");
                hm.bi = stringBuilder2.toString();
                hm.bb = 430176186;
            } else if (100 == client.ca * 1349663281) {
                i2 = eu.jk.av(-1103306616);
                if (i2 < 100) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(go.bs);
                    stringBuilder.append(i2);
                    stringBuilder.append("%");
                    hm.bi = stringBuilder.toString();
                    hm.bb = 430176186;
                    return;
                }
                hm.bi = go.bm;
                hm.bb = 430176186;
                client.ca = -299339272;
            } else if (client.ca * 1349663281 == 120) {
                if (df.di.av("huffman", "", -113666397)) {
                    af.ad(new kb(df.di.ab("huffman", "", (byte) -33)), 829869293);
                    hm.bi = go.bd;
                    hm.bb = -2127685250;
                    client.ca = -1040112094;
                    return;
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(go.bq);
                stringBuilder2.append(0);
                stringBuilder2.append("%");
                hm.bi = stringBuilder2.toString();
                hm.bb = -2127685250;
            } else if (client.ca * 1349663281 == 130) {
                if (!gn.cf.am(1631873133)) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(go.bo);
                    stringBuilder2.append((gn.cf.ed(-1611781153) * 4) / 5);
                    stringBuilder2.append("%");
                    hm.bi = stringBuilder2.toString();
                    hm.bb = -1259132320;
                } else if (!at.dr.am(1631873133)) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(go.bo);
                    stringBuilder2.append((at.dr.ed(-965007621) / 6) + 80);
                    stringBuilder2.append("%");
                    hm.bi = stringBuilder2.toString();
                    hm.bb = -1259132320;
                } else if (dn.df.am(1631873133)) {
                    hm.bi = go.bl;
                    hm.bb = -390579390;
                    client.ca = -1780884916;
                } else {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(go.bo);
                    stringBuilder2.append((dn.df.ed(847246100) / 50) + 96);
                    stringBuilder2.append("%");
                    hm.bi = stringBuilder2.toString();
                    hm.bb = -1259132320;
                }
            } else if (client.ca * 1349663281 == 140) {
                hm.bb = 477973540;
                if (hl.dc.at(ch.ad.ai, (byte) -1)) {
                    if (gi.rz == null) {
                        gi.rz = new pd();
                        gi.rz.ad(hl.dc, bv.du, do.dp, lh.fs, client.fh, az.gs, 370475968);
                    }
                    hm.bi = go.bb;
                    client.ca = 1773309558;
                    return;
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(go.bf);
                stringBuilder2.append(hl.dc.ba(ch.ad.ai, (byte) -65) / 10);
                stringBuilder2.append("%");
                hm.bi = stringBuilder2.toString();
            } else if (client.ca * 1349663281 == 150) {
                jv.bo(2138747886);
                he.ac(10, (byte) 102);
                if (he.rw != null) {
                    he.rw.ad(682548002);
                    he.rw = null;
                }
            }
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("ds.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void bo(jd jdVar, es esVar, int i) {
        try {
            int i2 = hm.fw.ar * 767223527;
            int i3 = hm.fw.al * 1488950355;
            boolean z = hm.fw.aj;
            boolean z2 = hm.fw.ae;
            boolean z3 = hm.fw.ak;
            boolean z4 = hm.fw.as;
            hm.fw.ar((byte) -35);
            if (z2) {
                fg.bb(esVar, -1932070308);
                return;
            }
            if (z3 && hm.eg * 1754320713 > 0 && bw.ei != null) {
                hm.eg -= 901337849;
            }
            if (z4 && hm.eg * 1754320713 < hm.ed * -970116975 && fe.en != null) {
                hm.eg += 901337849;
            }
            if (z) {
                int i4 = (hm.as * 1034216923) + 280;
                if (i2 >= i4 && i2 <= i4 + 14 && i3 >= 4 && i3 <= 18) {
                    am.aq(0, 0, 1900087023);
                } else if (i2 < i4 + 15 || i2 > i4 + 80 || i3 < 4 || i3 > 18) {
                    i4 = (hm.as * 1034216923) + 390;
                    if (i2 >= i4 && i2 <= i4 + 14 && i3 >= 4 && i3 <= 18) {
                        am.aq(1, 0, 1661898246);
                    } else if (i2 < i4 + 15 || i2 > i4 + 80 || i3 < 4 || i3 > 18) {
                        i4 = (hm.as * 1034216923) + 500;
                        if (i2 >= i4 && i2 <= i4 + 14 && i3 >= 4 && i3 <= 18) {
                            am.aq(2, 0, 874803995);
                        } else if (i2 < i4 + 15 || i2 > i4 + 80 || i3 < 4 || i3 > 18) {
                            i4 = (hm.as * 1034216923) + 610;
                            if (i2 >= i4 && i2 <= i4 + 14 && i3 >= 4 && i3 <= 18) {
                                am.aq(3, 0, 1509313955);
                            } else if (i2 >= i4 + 15 && i2 <= i4 + 80 && i3 >= 4 && i3 <= 18) {
                                am.aq(3, 1, 1803228830);
                            } else if (i2 >= (hm.as * 1034216923) + 708 && i3 >= 4 && i2 <= ((hm.as * 1034216923) + 708) + 50 && i3 <= 20) {
                                fg.bb(esVar, -539950180);
                            } else if (-1 != hm.ey * 387458271 && hm.ey * 387458271 == gc.bd(2147255242)) {
                                cf.bl(ii.aj[hm.ey * 387458271], 1387583478);
                                fg.bb(esVar, -210993111);
                            } else if (hm.er != null) {
                                if (hm.eg * 1754320713 > 0 && bw.ei != null && i2 >= 0 && i2 <= ((hm.as * 1034216923) + (hm.er.ae * 987359585)) - (hm.er.aj * 1653025354) && i3 >= ((jw.tx * -1083397279) / 2) - 100 && i3 <= ((jw.tx * -1083397279) / 2) + 100) {
                                    hm.eg -= 901337849;
                                }
                                if (hm.eg * 1754320713 < hm.ed * -970116975 && fe.en != null && i2 >= (((hl.tk * 1350811837) - (hm.as * 1034216923)) - (hm.er.ae * 987359585)) + (hm.er.aj * 1653025354) && i2 <= hl.tk * 1350811837 && i3 >= ((jw.tx * -1083397279) / 2) - 100 && i3 <= ((jw.tx * -1083397279) / 2) + 100) {
                                    hm.eg += 901337849;
                                }
                            }
                        } else {
                            am.aq(2, 1, 1838327007);
                        }
                    } else {
                        am.aq(1, 1, 714852043);
                    }
                } else {
                    am.aq(0, 1, 1608293824);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ds.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
