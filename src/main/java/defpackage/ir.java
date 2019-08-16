package defpackage;

import android.support.v4.view.ViewCompat;

/* renamed from: ir */
public final class ir extends br {
    double aa;
    int ab;
    double ac;
    int ad;
    int ae;
    int af;
    int ag;
    double ah;
    int ai;
    int aj;
    int ak;
    int al;
    int am;
    dp an;
    double ao;
    boolean ap;
    int aq;
    int ar;
    int as;
    double au;
    int av;
    double aw;
    double ax;
    int ay;
    double az;

    ir(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        try {
            this.ap = false;
            this.ab = 0;
            this.av = 0;
            this.ad = 1768871775 * i;
            this.aq = -1982655893 * i2;
            this.ar = -1224955513 * i3;
            this.al = 1234578783 * i4;
            this.aj = 586862381 * i5;
            this.ae = -552066815 * i6;
            this.am = 1493424905 * i7;
            this.ak = -1182850807 * i8;
            this.as = 2054075803 * i9;
            this.ag = 249064735 * i10;
            this.ai = 147372737 * i11;
            this.ap = false;
            int i12 = dd.aq(this.ad * 1357726879, 812886062).ae * -1443510939;
            if (-1 != i12) {
                this.an = gn.aq(i12, 1681482626);
            } else {
                this.an = null;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ir.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int aq(int i, int i2, short s) {
        return ((nq.ad + i) << 8) + i2;
    }

    static char ar(char c, int i) {
        return 198 == c ? 'E' : 230 == c ? 'e' : c == 223 ? 's' : c != 338 ? c == 339 ? 'e' : 0 : 'E';
    }

    /* JADX WARNING: Removed duplicated region for block: B:530:0x0cb8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e3 A:{Catch:{ RuntimeException -> 0x0269 }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f9 A:{Catch:{ RuntimeException -> 0x0269 }} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02c1 A:{Catch:{ RuntimeException -> 0x0269 }} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0229 A:{Catch:{ RuntimeException -> 0x0269 }} */
    /* JADX WARNING: Missing block: B:105:0x01cc, code skipped:
            if ((r22.ao * -1227024251) == (-1209395387 * defpackage.client.lk)) goto L_0x01ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void gv(al[] alVarArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        while (true) {
            try {
                int i10 = i9;
                if (i10 < alVarArr.length) {
                    al alVar = alVarArr[i10];
                    if (alVar != null) {
                        if (i == alVar.bc * -38514547 && (!alVar.aa || alVar.af * 1845699613 == 0 || alVar.eh || hs.hy(alVar, (byte) 54) != 0 || client.lo == alVar || al.aq == alVar.an * 365070409)) {
                            int i11;
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            int i17;
                            boolean z;
                            if (alVar.aa) {
                                if (kq.hl(alVar, 1570854673)) {
                                }
                            } else if (alVar.af * 1845699613 == 0 && iq.kc != alVar && kq.hl(alVar, 1570854673)) {
                            }
                            int i18 = (alVar.bd * 562220279) + i6;
                            int i19 = (alVar.bo * -1014301405) + i7;
                            int i20;
                            if (alVar.af * 1845699613 == 2) {
                                i11 = i2;
                                i12 = i3;
                                i13 = i4;
                                i14 = i5;
                            } else if (alVar.af * 1845699613 == 9) {
                                i9 = (alVar.bl * 1272191791) + i18;
                                i15 = (alVar.bf * 1813264797) + i19;
                                if (i9 < i18) {
                                    i16 = i18;
                                    i20 = i9;
                                } else {
                                    i16 = i9;
                                    i20 = i18;
                                }
                                if (i15 < i19) {
                                    i9 = i19;
                                    i17 = i15;
                                } else {
                                    i9 = i15;
                                    i17 = i19;
                                }
                                i15 = i16 + 1;
                                i9++;
                                if (i20 <= i2) {
                                    i20 = i2;
                                }
                                if (i17 <= i3) {
                                    i17 = i3;
                                }
                                if (i15 >= i4) {
                                    i15 = i4;
                                }
                                if (i9 >= i5) {
                                    i9 = i5;
                                }
                                i11 = i20;
                                i12 = i17;
                                i13 = i15;
                                i14 = i9;
                            } else {
                                i15 = (alVar.bl * 1272191791) + i18;
                                i9 = (alVar.bf * 1813264797) + i19;
                                i20 = i18 > i2 ? i18 : i2;
                                i17 = i19 > i3 ? i19 : i3;
                                if (i15 >= i4) {
                                    i15 = i4;
                                }
                                if (i9 >= i5) {
                                    i9 = i5;
                                }
                                i11 = i20;
                                i12 = i17;
                                i13 = i15;
                                i14 = i9;
                            }
                            if (alVar == client.lx) {
                                client.lu = true;
                                client.lt = 1644220521 * i18;
                                client.ll = 1277975707 * i19;
                                client.bh.ah = true;
                            }
                            if (alVar == client.mi) {
                                lz.mu = true;
                                client.bh.ao = true;
                            }
                            if (alVar.dh) {
                                i9 = client.lb * 1788110205;
                                if (i9 != 0) {
                                    switch (i9) {
                                        case 2:
                                            if (client.lk * -1209395387 == ((alVar.ao * -1227024251) >>> 16)) {
                                                break;
                                            }
                                            break;
                                        case 3:
                                            break;
                                    }
                                }
                                int i21 = 1;
                                if (!(i21 == null && alVar.aa && (i11 >= i13 || i12 >= i14))) {
                                    il ilVar;
                                    i15 = -1;
                                    if (fg.bg(-1355349013)) {
                                        i17 = -1;
                                    } else {
                                        i17 = 1685737557 * client.bh.ag;
                                        i15 = -878530631 * client.bh.as;
                                    }
                                    if (alVar.aa) {
                                        if (alVar.gi) {
                                            if (i15 >= i11 && i17 >= i12 && i15 < i13 && i17 < i14) {
                                                for (ilVar = (il) client.nx.ae(); ilVar != null; ilVar = (il) client.nx.ak()) {
                                                    if (ilVar.aq) {
                                                        ilVar.ky();
                                                        ilVar.ar.fe = false;
                                                    }
                                                }
                                                if (ck.ld * -307113283 == 0) {
                                                    client.lx = null;
                                                    client.lo = null;
                                                }
                                                client.bh.ay((byte) -59);
                                                if (fg.bg(-1368498583)) {
                                                    gc.km.bn(1822875252);
                                                }
                                            }
                                        } else if (alVar.gn && i15 >= i11 && i17 >= i12 && i15 < i13 && i17 < i14) {
                                            ilVar = (il) client.nx.ae();
                                            while (ilVar != null) {
                                                if (ilVar.aq && ilVar.ar.es == ilVar.ad) {
                                                    ilVar.ky();
                                                }
                                                ilVar = (il) client.nx.ak();
                                            }
                                        }
                                    }
                                    z = i15 < i11 && i17 >= i12 && i15 < i13 && i17 < i14;
                                    if (al.ad != alVar.an * 365070409) {
                                        if (!client.be && fg.bg(-1790927917) && z) {
                                            gc.km.bd(-878530631 * client.bh.as, client.bh.ag * 1685737557, client.ql * 618079109, client.qp * -1964052589, 1281737814);
                                            if (client.bh.ax) {
                                                client.bh.aa = true;
                                            }
                                        } else {
                                            gc.km.bd = false;
                                        }
                                    } else if (alVar.an * 365070409 == al.aq) {
                                        gd.by(alVar, i18, i19, (byte) 63);
                                    } else {
                                        int i22;
                                        if (alVar.an * 365070409 == af.al) {
                                            gi.rz.ar(i15, i17, z, i18, i19, alVar.bl * 1272191791, alVar.bf * 1813264797, 1616881481);
                                        }
                                        if (fg.bg(-809594284) && z) {
                                            if (alVar.an * 365070409 == af.al) {
                                                gi.rz.cm(i18, i19, alVar.bl * 1272191791, alVar.bf * 1813264797, i15, i17, 1379844792);
                                                client.bh.ah = true;
                                            } else {
                                                gc.km.bc(alVar, client.bh.am[0] - i18, client.bh.ak[0] - i19, -1610863912);
                                            }
                                        }
                                        if (i21 != null) {
                                            int i23 = 0;
                                            while (i23 < alVar.de.length) {
                                                Object obj;
                                                Object obj2;
                                                if (alVar.de[i23] != null) {
                                                    Object obj3 = null;
                                                    for (i22 = 0; i22 < alVar.de[i23].length; i22++) {
                                                        boolean ba = alVar.gh != null ? client.bh.ba(alVar.de[i23][i22], -1620542321) : false;
                                                        if (cr.gs(alVar.de[i23][i22], 952168312) || ba) {
                                                            if (alVar.gh == null || alVar.gh[i23] <= client.bj * 2133672263) {
                                                                byte b = alVar.ds[i23][i22];
                                                                obj3 = (b == (byte) 0 || (((b & 8) == 0 || !(client.bh.ba(86, -1620542321) || client.bh.ba(82, -1620542321) || client.bh.ba(81, -1620542321))) && (((b & 2) == 0 || client.bh.ba(86, -1620542321)) && (((b & 1) == 0 || client.bh.ba(82, -1620542321)) && ((b & 4) == 0 || client.bh.ba(81, -1620542321)))))) ? 1 : 1;
                                                            } else {
                                                                obj3 = null;
                                                            }
                                                            obj = 1;
                                                            obj2 = obj3;
                                                        }
                                                    }
                                                    obj = obj3;
                                                    obj2 = null;
                                                } else {
                                                    obj = null;
                                                    obj2 = null;
                                                }
                                                if (obj2 != null) {
                                                    if (i23 < 10) {
                                                        is.fs(i23 + 1, -1227024251 * alVar.ao, 988026877 * alVar.ah, -1806633963 * alVar.fu, "", 413637127);
                                                    } else if (i23 == 10) {
                                                        gc.km.ac(-1251058888);
                                                        gc.km.aw(-1227024251 * alVar.ao, 988026877 * alVar.ah, et.ar(hs.hy(alVar, (byte) 34), 673509092), -1806633963 * alVar.fu, (short) -16109);
                                                        String hj = de.hj(alVar, -1524364796);
                                                        if (hj == null) {
                                                            hj = go.ak;
                                                        }
                                                        StringBuilder stringBuilder = new StringBuilder();
                                                        stringBuilder.append(alVar.dg);
                                                        stringBuilder.append(hs.aq(ViewCompat.MEASURED_SIZE_MASK, -701163988));
                                                        gc.km.aa(hj, stringBuilder.toString(), -1495452192);
                                                    }
                                                    i9 = alVar.f0do[i23];
                                                    if (alVar.gh == null) {
                                                        alVar.gh = new int[alVar.de.length];
                                                    }
                                                    if (alVar.dy == null) {
                                                        alVar.dy = new int[alVar.de.length];
                                                    }
                                                    if (i9 == 0) {
                                                        alVar.gh[i23] = Integer.MAX_VALUE;
                                                    } else if (alVar.gh[i23] == 0) {
                                                        alVar.gh[i23] = (i9 + (client.bj * 2133672263)) + alVar.dy[i23];
                                                    } else {
                                                        alVar.gh[i23] = i9 + (client.bj * 2133672263);
                                                    }
                                                }
                                                if (obj == null && alVar.gh != null) {
                                                    alVar.gh[i23] = 0;
                                                }
                                                i23++;
                                            }
                                        }
                                        if (alVar.aa) {
                                            z = i15 >= i11 && i17 >= i12 && i15 < i13 && i17 < i14;
                                            int i24 = (z && client.bh.ba) ? 1 : 0;
                                            if (z && io.aq == client.bh.ad) {
                                                dr.ga(alVar, i15 - i18, i17 - i19, -95010364);
                                                if (alVar.bw * 901029295 > alVar.bf * 1813264797 || alVar.bu * -1004867185 > alVar.bl * 1272191791) {
                                                    lz.gr(alVar, Byte.MAX_VALUE);
                                                }
                                                i9 = 1;
                                            } else {
                                                i9 = 0;
                                            }
                                            if (alVar.an * 365070409 == af.al) {
                                                gi.rz.al(i15, i17, z & i9, z & i24, -1235993922);
                                            }
                                            if (client.lx != null && client.lx != alVar && z && oz.aj(hs.hy(alVar, (byte) 82), (byte) 112)) {
                                                client.lf = alVar;
                                            }
                                            if (alVar == client.lo) {
                                                client.lj = true;
                                                client.lv = 610932515 * i18;
                                                client.li = -2099241781 * i19;
                                            }
                                            if (alVar.eh) {
                                                il ilVar2;
                                                if (client.lx == null && en.iu == null && !gc.km.cv((byte) -116)) {
                                                    i16 = i24;
                                                } else {
                                                    z = false;
                                                    i16 = 0;
                                                    i9 = 0;
                                                }
                                                if (!(alVar.fl || r8 == 0)) {
                                                    alVar.fl = true;
                                                    if (alVar.ea != null) {
                                                        ilVar2 = new il();
                                                        ilVar2.aq = true;
                                                        ilVar2.ar = alVar;
                                                        ilVar2.al = (i15 - i18) * 1473536497;
                                                        ilVar2.aj = (i17 - i19) * 547000725;
                                                        ilVar2.ad = alVar.ea;
                                                        client.nx.aq(ilVar2);
                                                    }
                                                }
                                                if (!(!alVar.fl || i9 == 0 || alVar.ek == null)) {
                                                    ilVar2 = new il();
                                                    ilVar2.aq = true;
                                                    ilVar2.ar = alVar;
                                                    ilVar2.al = (i15 - i18) * 1473536497;
                                                    ilVar2.aj = (i17 - i19) * 547000725;
                                                    ilVar2.ad = alVar.ek;
                                                    client.nx.aq(ilVar2);
                                                }
                                                if (alVar.fl && i9 == 0) {
                                                    alVar.fl = false;
                                                    if (alVar.ei != null) {
                                                        ilVar2 = new il();
                                                        ilVar2.aq = true;
                                                        ilVar2.ar = alVar;
                                                        ilVar2.al = (i15 - i18) * 1473536497;
                                                        ilVar2.aj = (i17 - i19) * 547000725;
                                                        ilVar2.ad = alVar.ei;
                                                        client.nv.aq(ilVar2);
                                                    }
                                                }
                                                if (!(i9 == 0 || alVar.en == null)) {
                                                    ilVar = new il();
                                                    ilVar.aq = true;
                                                    ilVar.ar = alVar;
                                                    ilVar.al = (i15 - i18) * 1473536497;
                                                    ilVar.aj = (i17 - i19) * 547000725;
                                                    ilVar.ad = alVar.en;
                                                    client.nx.aq(ilVar);
                                                }
                                                if (!alVar.fe && r5) {
                                                    alVar.fe = true;
                                                    if (alVar.ey != null) {
                                                        ilVar = new il();
                                                        ilVar.aq = true;
                                                        ilVar.ar = alVar;
                                                        ilVar.al = (i15 - i18) * 1473536497;
                                                        ilVar.aj = (i17 - i19) * 547000725;
                                                        ilVar.ad = alVar.ey;
                                                        client.nx.aq(ilVar);
                                                    }
                                                }
                                                if (alVar.fe && r5 && alVar.eg != null) {
                                                    ilVar = new il();
                                                    ilVar.aq = true;
                                                    ilVar.ar = alVar;
                                                    ilVar.al = (i15 - i18) * 1473536497;
                                                    ilVar.aj = (i17 - i19) * 547000725;
                                                    ilVar.ad = alVar.eg;
                                                    client.nx.aq(ilVar);
                                                }
                                                if (alVar.fe && !r5) {
                                                    alVar.fe = false;
                                                    if (alVar.ed != null) {
                                                        ilVar = new il();
                                                        ilVar.aq = true;
                                                        ilVar.ar = alVar;
                                                        ilVar.al = (i15 - i18) * 1473536497;
                                                        ilVar.aj = (i17 - i19) * 547000725;
                                                        ilVar.ad = alVar.ed;
                                                        client.nv.aq(ilVar);
                                                    }
                                                }
                                                if (((alVar.ao * -1227024251) >>> 16) == client.ko * 1373838397 && client.ni * 1388230167 != 0) {
                                                    client.nh = client.ni * 736071783;
                                                    z = true;
                                                }
                                                if (alVar.es != null && ((client.mi == alVar && fj.mc) || (z && client.nh * 1403805393 != 0))) {
                                                    ilVar2 = new il();
                                                    ilVar2.aq = true;
                                                    ilVar2.ar = alVar;
                                                    i9 = (alVar == client.mi && fj.mc) ? 0 : client.nh * 1403805393;
                                                    ilVar2.aj = i9 * 547000725;
                                                    ilVar2.ad = alVar.es;
                                                    client.nx.aq(ilVar2);
                                                }
                                                if (alVar.ex != null) {
                                                    ilVar = new il();
                                                    ilVar.ar = alVar;
                                                    ilVar.ad = alVar.ex;
                                                    client.nz.aq(ilVar);
                                                }
                                                if (alVar.el != null && client.mo * 176082583 > alVar.gc * -325457387) {
                                                    if (alVar.eb == null || (client.mo * 176082583) - (alVar.gc * -325457387) > 32) {
                                                        ilVar = new il();
                                                        ilVar.ar = alVar;
                                                        ilVar.ad = alVar.el;
                                                        client.nx.aq(ilVar);
                                                    } else {
                                                        i9 = alVar.gc * -325457387;
                                                        while (true) {
                                                            i16 = i9;
                                                            if (i16 < client.mo * 176082583) {
                                                                i22 = client.mb[i16 & 31];
                                                                i9 = 0;
                                                                while (i9 < alVar.eb.length) {
                                                                    if (alVar.eb[i9] == i22) {
                                                                        ilVar = new il();
                                                                        ilVar.ar = alVar;
                                                                        ilVar.ad = alVar.el;
                                                                        client.nx.aq(ilVar);
                                                                    } else {
                                                                        i9++;
                                                                    }
                                                                }
                                                                i9 = i16 + 1;
                                                            }
                                                        }
                                                    }
                                                    alVar.gc = client.mo * 2097945851;
                                                }
                                                if (alVar.ev != null && client.mh * 336817999 > alVar.gw * -507996701) {
                                                    if (alVar.ep == null || (client.mh * 336817999) - (alVar.gw * -507996701) > 32) {
                                                        ilVar = new il();
                                                        ilVar.ar = alVar;
                                                        ilVar.ad = alVar.ev;
                                                        client.nx.aq(ilVar);
                                                    } else {
                                                        i9 = alVar.gw * -507996701;
                                                        while (true) {
                                                            i16 = i9;
                                                            if (i16 < client.mh * 336817999) {
                                                                i22 = client.mf[i16 & 31];
                                                                i9 = 0;
                                                                while (i9 < alVar.ep.length) {
                                                                    if (i22 == alVar.ep[i9]) {
                                                                        ilVar = new il();
                                                                        ilVar.ar = alVar;
                                                                        ilVar.ad = alVar.ev;
                                                                        client.nx.aq(ilVar);
                                                                    } else {
                                                                        i9++;
                                                                    }
                                                                }
                                                                i9 = i16 + 1;
                                                            }
                                                        }
                                                    }
                                                    alVar.gw = client.mh * 391257253;
                                                }
                                                if (alVar.em != null && client.mk * -806667711 > alVar.gp * 1999388789) {
                                                    if (alVar.ef == null || (client.mk * -806667711) - (alVar.gp * 1999388789) > 32) {
                                                        ilVar = new il();
                                                        ilVar.ar = alVar;
                                                        ilVar.ad = alVar.em;
                                                        client.nx.aq(ilVar);
                                                    } else {
                                                        i9 = alVar.gp * 1999388789;
                                                        while (true) {
                                                            i16 = i9;
                                                            if (i16 < client.mk * -806667711) {
                                                                i22 = client.mz[i16 & 31];
                                                                i9 = 0;
                                                                while (i9 < alVar.ef.length) {
                                                                    if (i22 == alVar.ef[i9]) {
                                                                        ilVar = new il();
                                                                        ilVar.ar = alVar;
                                                                        ilVar.ad = alVar.em;
                                                                        client.nx.aq(ilVar);
                                                                    } else {
                                                                        i9++;
                                                                    }
                                                                }
                                                                i9 = i16 + 1;
                                                            }
                                                        }
                                                    }
                                                    alVar.gp = client.mk * -610625251;
                                                }
                                                if (client.mg * -2094848019 > alVar.fk * -514492017 && alVar.fq != null) {
                                                    ilVar = new il();
                                                    ilVar.ar = alVar;
                                                    ilVar.ad = alVar.fq;
                                                    client.nx.aq(ilVar);
                                                }
                                                if (client.mt * 667155597 > alVar.fk * -514492017 && alVar.ft != null) {
                                                    ilVar = new il();
                                                    ilVar.ar = alVar;
                                                    ilVar.ad = alVar.ft;
                                                    client.nx.aq(ilVar);
                                                }
                                                if (client.mv * -1528468987 > alVar.fk * -514492017 && alVar.fw != null) {
                                                    ilVar = new il();
                                                    ilVar.ar = alVar;
                                                    ilVar.ad = alVar.fw;
                                                    client.nx.aq(ilVar);
                                                }
                                                if (client.my * -1824158415 > alVar.fk * -514492017 && alVar.fy != null) {
                                                    ilVar = new il();
                                                    ilVar.ar = alVar;
                                                    ilVar.ad = alVar.fy;
                                                    client.nx.aq(ilVar);
                                                }
                                                if (client.ma * 1246225547 > alVar.fk * -514492017 && alVar.fr != null) {
                                                    ilVar = new il();
                                                    ilVar.ar = alVar;
                                                    ilVar.ad = alVar.fr;
                                                    client.nx.aq(ilVar);
                                                }
                                                if (client.mw * -114923331 > alVar.fk * -514492017 && alVar.fn != null) {
                                                    ilVar = new il();
                                                    ilVar.ar = alVar;
                                                    ilVar.ad = alVar.fn;
                                                    client.nx.aq(ilVar);
                                                }
                                                alVar.fk = client.mm * -1459833355;
                                                if (alVar.fx != null) {
                                                    for (i9 = 0; i9 < client.bh.bm * 2015638429; i9++) {
                                                        ilVar2 = new il();
                                                        ilVar2.ar = alVar;
                                                        ilVar2.am = client.bh.bq[i9] * 1807138517;
                                                        ilVar2.ak = client.bh.bd[i9] * -188921151;
                                                        ilVar2.ad = alVar.fx;
                                                        client.nx.aq(ilVar2);
                                                    }
                                                }
                                            }
                                        }
                                        if (!alVar.aa) {
                                            if (client.lx == null && en.iu == null && !gc.km.cv((byte) -62)) {
                                                if ((alVar.fv * -1632338161 >= 0 || alVar.bj * 1129348853 != 0) && i15 >= i11 && i17 >= i12 && i15 < i13 && i17 < i14) {
                                                    if (alVar.fv * -1632338161 >= 0) {
                                                        iq.kc = alVarArr[alVar.fv * -1632338161];
                                                    } else {
                                                        iq.kc = alVar;
                                                    }
                                                }
                                                if (2 == alVar.af * 1845699613 && z) {
                                                    client.bh.ah = true;
                                                }
                                                if (alVar.af * 1845699613 == 8 && i15 >= i11 && i17 >= i12 && i15 < i13 && i17 < i14) {
                                                    hz.kp = alVar;
                                                }
                                                if (alVar.bw * 901029295 > alVar.bf * 1813264797) {
                                                    if (z && io.aq == client.bh.ad) {
                                                        client.bh.ao = true;
                                                        lz.gr(alVar, (byte) 110);
                                                    }
                                                    lo.gp(alVar, i18 + (alVar.bl * 1272191791), i19, alVar.bf * 1813264797, alVar.bw * 901029295, i15, i17, 640189896);
                                                }
                                            }
                                        }
                                        if (alVar.af * 1845699613 == 0) {
                                            ir.gv(alVarArr, -1227024251 * alVar.ao, i11, i12, i13, i14, i18 - (817114559 * alVar.bg), i19 - (-1344834291 * alVar.bx), -1750876462);
                                            if (alVar.fo != null) {
                                                ir.gv(alVar.fo, alVar.ao * -1227024251, i11, i12, i13, i14, i18 - (alVar.bg * 817114559), i19 - (alVar.bx * -1344834291), -1543776495);
                                            }
                                            is isVar = (is) client.kd.ad((long) (alVar.ao * -1227024251));
                                            if (isVar != null) {
                                                if (isVar.aq * 657938815 == 0 && i15 >= i11 && i17 >= i12 && i15 < i13 && i17 < i14 && !gc.km.cv((byte) -76)) {
                                                    mb ae = client.nx.ae();
                                                    while (true) {
                                                        il ilVar3 = (il) ae;
                                                        if (ilVar3 != null) {
                                                            if (ilVar3.aq) {
                                                                ilVar3.ky();
                                                                ilVar3.ar.fe = false;
                                                            }
                                                            ae = client.nx.ak();
                                                        } else {
                                                            if (ck.ld * -307113283 == 0) {
                                                                client.lx = null;
                                                                client.lo = null;
                                                            }
                                                            if (fg.bg(-2132374312)) {
                                                                gc.km.bn(1673180517);
                                                            }
                                                        }
                                                    }
                                                }
                                                in.gn(isVar.ad * 1810639839, i11, i12, i13, i14, i18, i19, 1278383437);
                                            }
                                        }
                                    }
                                }
                            }
                            Object i212 = null;
                            i15 = -1;
                            if (fg.bg(-1355349013)) {
                            }
                            if (alVar.aa) {
                            }
                            if (i15 < i11) {
                            }
                            if (al.ad != alVar.an * 365070409) {
                            }
                        }
                    }
                    i9 = i10 + 1;
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("ir.gv(");
                stringBuilder2.append(')');
                throw mv.aq(e, stringBuilder2.toString());
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bp ab() {
        try {
            bp aj = dd.aq(this.ad * 1357726879, 812886062).aj(this.ab * -1254791569, (byte) 41);
            if (aj == null) {
                return null;
            }
            aj.aw(this.ay * 590655401);
            return aj;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ir.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ad(int i, int i2, int i3, int i4, int i5) {
        try {
            double d;
            if (!this.ap) {
                d = (double) (i - (this.ar * -1973367753));
                double d2 = (double) (i2 - (this.al * 983920287));
                double sqrt = Math.sqrt((d2 * d2) + (d * d));
                this.au = ((d * ((double) (this.as * 1975560339))) / sqrt) + ((double) (this.ar * -1973367753));
                this.az = ((((double) (this.as * 1975560339)) * d2) / sqrt) + ((double) (this.al * 983920287));
                this.ax = (double) (this.aj * -1102751579);
            }
            d = (double) (((this.am * 270672697) + 1) - i4);
            this.aw = (((double) i) - this.au) / d;
            this.ac = (((double) i2) - this.az) / d;
            this.aa = Math.sqrt((this.aw * this.aw) + (this.ac * this.ac));
            if (!this.ap) {
                this.ao = (-this.aa) * Math.tan(((double) (this.ak * -2040611527)) * 0.02454369d);
            }
            this.ah = (((((double) i3) - this.ax) - (this.ao * d)) * 2.0d) / (d * d);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ir.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ae(int i) {
        this.ap = true;
        double d = (double) i;
        this.au += this.aw * d;
        this.az += this.ac * d;
        this.ax += (((this.ah * 0.5d) * d) * d) + (this.ao * d);
        this.ao += d * this.ah;
        this.af = ((((int) (Math.atan2(this.aw, this.ac) * 325.949d)) + 625470011) & 2047) * 1221492472;
        this.ay = (((int) (Math.atan2(this.ao, this.aa) * 325.949d)) & 2047) * -1509272327;
        if (this.an != null) {
            this.av += -3663376 * i;
            while (this.av * 637356933 > this.an.am[this.ab * 1696204970]) {
                this.av -= this.an.am[this.ab * -1254791569] * 700720172;
                this.ab += 1496627343;
                if (this.ab * 1147240032 >= this.an.ai.length) {
                    this.ab -= this.an.as * -1327066547;
                    if (this.ab * -1254791569 < 0 || this.ab * -1254791569 >= this.an.ai.length) {
                        this.ab = 0;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ai(int i) {
        this.ap = true;
        double d = (double) i;
        this.au += this.aw * d;
        this.az += this.ac * d;
        this.ax += (((this.ah * 0.5d) * d) * d) + (this.ao * d);
        this.ao += d * this.ah;
        this.af = ((((int) (Math.atan2(this.aw, this.ac) * 325.949d)) + 571203122) & -1624555188) * 795223958;
        this.ay = (((int) (Math.atan2(this.ao, this.aa) * 325.949d)) & 2047) * 1558013081;
        if (this.an != null) {
            this.av += 969344405 * i;
            while (this.av * 637356933 > this.an.am[this.ab * -1254791569]) {
                this.av -= this.an.am[this.ab * 2111089546] * 322612435;
                this.ab += 1496627343;
                if (this.ab * -1254791569 >= this.an.ai.length) {
                    this.ab -= this.an.as * -1378123341;
                    if (this.ab * -1254791569 < 0 || this.ab * -1254791569 >= this.an.ai.length) {
                        this.ab = 0;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void aj(int i, int i2, int i3, int i4) {
        double d;
        if (!this.ap) {
            d = (double) (i - (this.ar * -1973367753));
            double d2 = (double) (i2 - (this.al * 983920287));
            double sqrt = Math.sqrt((d2 * d2) + (d * d));
            this.au = ((d * ((double) (this.as * 1975560339))) / sqrt) + ((double) (this.ar * -1973367753));
            this.az = ((((double) (this.as * 1975560339)) * d2) / sqrt) + ((double) (this.al * 983920287));
            this.ax = (double) (this.aj * -1102751579);
        }
        d = (double) (((this.am * 270672697) + 1) - i4);
        this.aw = (((double) i) - this.au) / d;
        this.ac = (((double) i2) - this.az) / d;
        this.aa = Math.sqrt((this.aw * this.aw) + (this.ac * this.ac));
        if (!this.ap) {
            this.ao = (-this.aa) * Math.tan(((double) (this.ak * -2040611527)) * 0.02454369d);
        }
        this.ah = (((((double) i3) - this.ax) - (this.ao * d)) * 2.0d) / (d * d);
    }

    /* Access modifiers changed, original: final */
    public final void al(int i, int i2, int i3, int i4) {
        double d;
        if (!this.ap) {
            d = (double) (i - (this.ar * -1973367753));
            double d2 = (double) (i2 - (this.al * 983920287));
            double sqrt = Math.sqrt((d2 * d2) + (d * d));
            this.au = ((d * ((double) (this.as * 1975560339))) / sqrt) + ((double) (this.ar * -1973367753));
            this.az = ((((double) (this.as * 1975560339)) * d2) / sqrt) + ((double) (this.al * 983920287));
            this.ax = (double) (this.aj * -1102751579);
        }
        d = (double) (((this.am * 270672697) + 1) - i4);
        this.aw = (((double) i) - this.au) / d;
        this.ac = (((double) i2) - this.az) / d;
        this.aa = Math.sqrt((this.aw * this.aw) + (this.ac * this.ac));
        if (!this.ap) {
            this.ao = (-this.aa) * Math.tan(((double) (this.ak * -2040611527)) * 0.02454369d);
        }
        this.ah = (((((double) i3) - this.ax) - (this.ao * d)) * 2.0d) / (d * d);
    }

    /* Access modifiers changed, original: final */
    public final void aq(int i, int i2) {
        try {
            this.ap = true;
            double d = (double) i;
            this.au += this.aw * d;
            this.az += this.ac * d;
            this.ax += (((this.ah * 0.5d) * d) * d) + (this.ao * d);
            this.ao += d * this.ah;
            this.af = ((((int) (Math.atan2(this.aw, this.ac) * 325.949d)) + 1024) & 2047) * 850915935;
            this.ay = (((int) (Math.atan2(this.ao, this.aa) * 325.949d)) & 2047) * 1558013081;
            if (this.an != null) {
                this.av += i * -1870465715;
                while (this.av * 637356933 > this.an.am[this.ab * -1254791569]) {
                    this.av -= this.an.am[this.ab * -1254791569] * -1870465715;
                    this.ab += 1496627343;
                    if (this.ab * -1254791569 >= this.an.ai.length) {
                        this.ab -= this.an.as * -1327066547;
                        if (this.ab * -1254791569 < 0 || this.ab * -1254791569 >= this.an.ai.length) {
                            this.ab = 0;
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ir.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ar(int i, int i2, int i3, int i4) {
        double d;
        if (!this.ap) {
            d = (double) (i - (this.ar * -969757070));
            double d2 = (double) (i2 - (this.al * 983920287));
            double sqrt = Math.sqrt((d2 * d2) + (d * d));
            this.au = ((d * ((double) (this.as * 1975560339))) / sqrt) + ((double) (this.ar * 1556198146));
            this.az = ((((double) (this.as * 354967039)) * d2) / sqrt) + ((double) (this.al * 983920287));
            this.ax = (double) (this.aj * -1102751579);
        }
        d = (double) (((this.am * -360000169) + 1) - i4);
        this.aw = (((double) i) - this.au) / d;
        this.ac = (((double) i2) - this.az) / d;
        this.aa = Math.sqrt((this.aw * this.aw) + (this.ac * this.ac));
        if (!this.ap) {
            this.ao = (-this.aa) * Math.tan(((double) (this.ak * -2040611527)) * 0.02454369d);
        }
        this.ah = (((((double) i3) - this.ax) - (this.ao * d)) * 2.0d) / (d * d);
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dd() {
        bp aj = dd.aq(this.ad * 1357726879, 812886062).aj(this.ab * -1254791569, (byte) -56);
        if (aj == null) {
            return null;
        }
        aj.aw(this.ay * 590655401);
        return aj;
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dm() {
        bp aj = dd.aq(this.ad * 1357726879, 812886062).aj(this.ab * -1254791569, (byte) 2);
        if (aj == null) {
            return null;
        }
        aj.aw(this.ay * 590655401);
        return aj;
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dt() {
        bp aj = dd.aq(this.ad * 1374942191, 812886062).aj(this.ab * -1254791569, (byte) -23);
        if (aj == null) {
            return null;
        }
        aj.aw(this.ay * -1630367654);
        return aj;
    }
}
