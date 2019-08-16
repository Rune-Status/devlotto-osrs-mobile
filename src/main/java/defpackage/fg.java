package defpackage;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;

/* renamed from: fg */
public class fg implements fd {
    static kh ad = null;
    static final int bl = 14;
    public static final int bt = 0;
    public static final int ct = 90;
    static int dj;

    static ef al(boolean z, boolean z2, int i) {
        if (!z) {
            return z2 ? jd.an : jk.ay;
        } else {
            if (!z2) {
                return bv.ab;
            }
            try {
                return jz.av;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fg.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public static void al(byte[] bArr, int i) {
        synchronized (fg.class) {
            byte[][] bArr2;
            int i2;
            if (100 == bArr.length && mn.ad * -1290352141 < 1000) {
                bArr2 = mn.al;
                i2 = mn.ad + 1929574203;
                mn.ad = i2;
                bArr2[(i2 * -1290352141) - 1] = bArr;
            } else if (5000 != bArr.length || mn.aq * 732323627 >= Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
                try {
                    if (bArr.length != 30000 || mn.ar * -1099774893 >= 50) {
                        if (ce.ak != null) {
                            int i3 = 0;
                            while (i3 < nx.ae.length) {
                                if (nx.ae[i3] != bArr.length || mn.am[i3] >= ce.ak[i3].length) {
                                    i3++;
                                } else {
                                    byte[][] bArr3 = ce.ak[i3];
                                    int[] iArr = mn.am;
                                    int i4 = iArr[i3];
                                    iArr[i3] = i4 + 1;
                                    bArr3[i4] = bArr;
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    bArr2 = mn.ai;
                    i2 = mn.ar - 666624037;
                    mn.ar = i2;
                    bArr2[(i2 * -1099774893) - 1] = bArr;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("fg.al(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                } catch (Throwable th) {
                    Class cls = fg.class;
                }
            } else {
                bArr2 = mn.aj;
                i2 = mn.aq + 456746883;
                mn.aq = i2;
                bArr2[(i2 * 732323627) - 1] = bArr;
            }
        }
    }

    static void aq(byte b) {
        try {
            mb ae = ib.ad.ae();
            while (true) {
                ib ibVar = (ib) ae;
                if (ibVar != null) {
                    if (ibVar.ax != null) {
                        ibVar.ar(1237447994);
                    }
                    ae = ib.ad.ak();
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fg.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ba(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = 256 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = -i4;
            while (i15 < 0) {
                int i16 = iArr2[i13];
                if (i16 != 0) {
                    iArr[i12] = (((((i16 & 16711935) * i8) & -16711936) | (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i16) * i8) & 16711680)) >>> 8) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i11) & 16711680) | (((16711935 & i9) * i11) & -16711936)) >>> 8);
                }
                i12++;
                i15++;
                i13++;
            }
            i12 += i6;
            i13 += i7;
        }
    }

    static void bb(es esVar, int i) {
        try {
            hm.ez = false;
            fp.bi(esVar, 668405479);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fg.bb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void bg(int i) {
        StringBuilder stringBuilder;
        try {
            lp abx = client.aq.abx((byte) 25);
            aa bx = abx.bx(-928653021);
            if (bx != null) {
                bx.ao(ji.aj, 664816602);
                bx.ak(-1180123021);
                return;
            }
            lu gv = abx.gv(-41186858);
            stringBuilder = new StringBuilder();
            stringBuilder.append(hn.id("secure", true, 1518957261));
            stringBuilder.append("m=account-creation/g=oldscape/create_account_funnel.ws");
            gv.ad(stringBuilder.toString(), true, -2013070925);
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("fg.bg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* renamed from: bg */
    static boolean m212bg(int i) {
        try {
            return (client.bh.as * -878530631 == -1 || gc.km.cv((byte) -26)) ? false : true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fg.bg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0241 A:{Catch:{ RuntimeException -> 0x021d }} */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0587 A:{Catch:{ RuntimeException -> 0x021d }} */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x048a A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x05a7 A:{Catch:{ RuntimeException -> 0x021d }} */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0a86  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0 A:{Catch:{ RuntimeException -> 0x021d }} */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x027f A:{Catch:{ RuntimeException -> 0x021d }} */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0491 A:{Catch:{ RuntimeException -> 0x021d }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0287 A:{Catch:{ RuntimeException -> 0x021d }} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0474 A:{Catch:{ RuntimeException -> 0x021d }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: do */
    static final void m213do(ih ihVar, int i, int i2, int i3, int i4, int i5, byte b) {
        try {
            es ad = client.aq.uk.ad(-601277067);
            if (ihVar != null && ihVar.ap(-940313553)) {
                et etVar;
                int i6;
                int i7;
                int i8;
                int i9;
                es esVar;
                ih ihVar2;
                es esVar2;
                int i10;
                if (ihVar instanceof iq) {
                    etVar = ((iq) ihVar).ad;
                    if (etVar.bq != null) {
                        etVar = etVar.am(1365966270);
                    }
                    if (etVar == null) {
                        return;
                    }
                }
                int i11 = hz.ai * -1076782851;
                int[] iArr = hz.ae;
                if (i < i11 && client.bj * 2133672263 == ihVar.bf * -1970822951 && cd.ds((hv) ihVar, (short) -22155)) {
                    hv hvVar = (hv) ihVar;
                    if (i < i11) {
                        ee aj;
                        int i12;
                        int i13;
                        int i14;
                        int i15;
                        int i16;
                        int i17;
                        dl.dk(ihVar, (ihVar.di * -1716041837) + 15, (byte) 2);
                        ((oi) client.fh.get(lq.aq)).ap(hvVar.ad.ad(1274572818), (client.ig * 186539459) + i2, ((client.iy * -639843857) + i3) - 9, ViewCompat.MEASURED_SIZE_MASK, 0, ad);
                        i6 = 18;
                        i7 = -2;
                        if (ihVar.cw.ak()) {
                            dl.dk(ihVar, (ihVar.di * -1716041837) + 15, (byte) 2);
                            ig igVar = (ig) ihVar.cw.aj();
                            int i18 = i11;
                            while (igVar != null) {
                                hy aq = igVar.aq(client.bj * 2133672263, (byte) -57);
                                if (aq != null) {
                                    dg dgVar = igVar.ar;
                                    ee ai = dgVar.ai(-2046394850);
                                    aj = dgVar.aj(1881288357);
                                    if (ai == null || aj == null) {
                                        i8 = 0;
                                        i12 = dgVar.ax * 769371475;
                                    } else {
                                        i9 = dgVar.aw * -388744674 < aj.aq ? dgVar.aw * 1953111311 : 0;
                                        i8 = i9;
                                        i12 = aj.aq - (i9 * 2);
                                    }
                                    i13 = (client.bj * 2133672263) - (aq.ad * 213864831);
                                    i9 = ((aq.ar * 622590693) * i12) / (dgVar.ax * 769371475);
                                    if (aq.al * 865224279 > i13) {
                                        i13 = dgVar.ag * -122205789 == 0 ? 0 : (i13 / (dgVar.ag * -122205789)) * (dgVar.ag * -122205789);
                                        i14 = ((aq.aq * 428577045) * i12) / (dgVar.ax * 769371475);
                                        i9 = (((i9 - i14) * i13) / (aq.al * 865224279)) + i14;
                                    } else {
                                        i15 = aq.al;
                                        i16 = dgVar.ap;
                                        if (dgVar.as * 221852667 >= 0) {
                                            i16 = ((((i15 * 865224279) + (i16 * 1256351561)) - i13) << 8) / ((dgVar.ap * 1256351561) - (dgVar.as * 221852667));
                                            i15 = i9;
                                            if (aq.ar * 622590693 > 0 && r10 < 1) {
                                                i15 = 1;
                                            }
                                            if (ai != null || aj == null) {
                                                i9 = i7 + 5;
                                                if (client.ig * 186539459 > -1) {
                                                    i11 = ((client.ig * 186539459) + i2) - (i12 >> 1);
                                                    i14 = ((client.iy * -639843857) + i3) - i9;
                                                    ad.al(i11, i14, i15, 5, MotionEventCompat.ACTION_POINTER_INDEX_MASK, (byte) 1);
                                                    ad.al(i11 + i15, i14, i12 - i15, 5, 16711680, (byte) 1);
                                                }
                                                i7 = i9 + 2;
                                            } else {
                                                i9 = i12 == i15 ? (i8 * 2) + i15 : i15 + i8;
                                                i13 = ai.ar;
                                                i17 = i7 + i13;
                                                i15 = ((client.iy * -639843857) + i3) - i17;
                                                i14 = (((client.ig * 186539459) + i2) - (i12 >> 1)) - i8;
                                                if (i16 < 0 || i16 >= 255) {
                                                    ad.aw(ai, i14, i15, 16711935);
                                                    ad.ew(i14, i15, i9 + i14, i15 + i13, 1687690963);
                                                    ad.aw(aj, i14, i15, 16711935);
                                                } else {
                                                    ad.bs(ai, i14, i15, i16, (byte) 7);
                                                    ad.ew(i14, i15, i14 + i9, i15 + i13, -2021299882);
                                                    ad.bs(aj, i14, i15, i16, (byte) 7);
                                                }
                                                ad.ee(i2, i3, i4 + i2, i3 + i5, 1905927089);
                                                i7 = i17 + 2;
                                            }
                                        }
                                    }
                                    i16 = 255;
                                    i15 = i9;
                                    i15 = 1;
                                    if (ai != null) {
                                    }
                                    i9 = i7 + 5;
                                    if (client.ig * 186539459 > -1) {
                                    }
                                    i7 = i9 + 2;
                                } else if (igVar.ar((byte) -6)) {
                                    igVar.ky();
                                }
                                igVar = (ig) ihVar.cw.ae();
                            }
                            esVar = ad;
                            i8 = i18;
                            i9 = i7;
                        } else {
                            esVar = ad;
                            i8 = i11;
                            i9 = -2;
                        }
                        if (-2 == i9) {
                            i9 += 7;
                        }
                        i7 = i9 + i6;
                        if (i >= i8) {
                            hv hvVar2 = (hv) ihVar;
                            if (!hvVar2.ay) {
                                if (!(hvVar2.ar * -42615967 == -1 && hvVar2.al * -721277169 == -1)) {
                                    dl.dk(ihVar, (ihVar.di * -1716041837) + 15, (byte) 2);
                                    if (client.ig * 186539459 > -1) {
                                        if (hvVar2.ar * -42615967 != -1) {
                                            i7 += 25;
                                            esVar.aw(client.gu[hvVar2.ar * -42615967], ((client.ig * 186539459) + i2) - 12, ((client.iy * -639843857) + i3) - i7, 16711935);
                                        }
                                        if (-1 != hvVar2.al * -721277169) {
                                            i7 += 25;
                                            esVar.aw(lo.ge[hvVar2.al * -721277169], ((client.ig * 186539459) + i2) - 12, ((client.iy * -639843857) + i3) - i7, 16711935);
                                        }
                                    }
                                }
                                if (i >= 0 && client.cn * -72155399 == 10 && iArr[i] == client.cp * -1090286633) {
                                    dl.dk(ihVar, (ihVar.di * -1716041837) + 15, (byte) 2);
                                    if (client.ig * 186539459 > -1) {
                                        esVar.aw(bi.gz[1], ((client.ig * 186539459) + i2) - 12, ((client.iy * -639843857) + i3) - (bi.gz[1].ar + i7), 16711935);
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        etVar = ((iq) ihVar).ad;
                        if (etVar.bq != null) {
                            etVar = etVar.am(-1150326857);
                        }
                        if (etVar.bs * -1432948381 >= 0 && etVar.bs * -1432948381 < lo.ge.length) {
                            dl.dk(ihVar, (ihVar.di * -1716041837) + 15, (byte) 2);
                            if (client.ig * 186539459 > -1) {
                                esVar.aw(lo.ge[etVar.bs * -1432948381], ((client.ig * 186539459) + i2) - 12, ((client.iy * -639843857) + i3) - 30, 16711935);
                            }
                        }
                        if (client.cn * -72155399 == 1 && client.cw * -1864715215 == client.er[i - i8] && (client.bj * 2133672263) % 20 < 10) {
                            dl.dk(ihVar, (ihVar.di * -1716041837) + 15, (byte) 2);
                            if (client.ig * 186539459 > -1) {
                                esVar.aw(bi.gz[0], ((client.ig * 186539459) + i2) - 12, ((client.iy * -639843857) + i3) - 28, 16711935);
                            }
                        }
                        if (ihVar.be != null && (i >= i8 || (!ihVar.bh && (client.of * 1639794603 == 4 || (!ihVar.bj && (client.of * 1639794603 == 0 || client.of * 1639794603 == 3 || (1 == client.of * 1639794603 && ((hv) ihVar).aq(-2116150200)))))))) {
                            dl.dk(ihVar, ihVar.di * -1716041837, (byte) 2);
                            if (client.ig * 186539459 > -1 && client.ie * 1711909053 < client.iv * 604511589) {
                                client.ik[client.ie * 1711909053] = lh.fs.al(ihVar.be) / 2;
                                client.iq[client.ie * 1711909053] = lh.fs.ae;
                                client.io[client.ie * 1711909053] = client.ig * 186539459;
                                client.iw[client.ie * 1711909053] = client.iy * -639843857;
                                client.in[client.ie * 1711909053] = ihVar.bn * 1784677751;
                                client.ih[client.ie * 1711909053] = ihVar.bz * 1827916901;
                                client.ib[client.ie * 1711909053] = ihVar.bt * 1765530939;
                                client.ir[client.ie * 1711909053] = ihVar.be;
                                client.ie += 1367970453;
                            }
                        }
                        ihVar2 = ihVar;
                        esVar2 = esVar;
                        for (i10 = 0; i10 < 4; i10++) {
                            i8 = ihVar2.cm[i10];
                            dr drVar;
                            if (ihVar2.cv[i10] >= 0) {
                                if (i8 > client.bj * 2133672263) {
                                    dr drVar2;
                                    dr aq2 = ba.aq(ihVar2.cv[i10], 1769972448);
                                    i13 = aq2.az * 1274925921;
                                    if (!(aq2 == null || aq2.av == null)) {
                                        aq2 = aq2.aj(-1908354711);
                                        if (aq2 == null) {
                                            ihVar2.cm[i10] = -1;
                                        }
                                    }
                                    drVar = aq2;
                                    i7 = ihVar2.cq[i10];
                                    if (i7 < 0) {
                                        aq2 = ba.aq(i7, -792147027);
                                        if (!(aq2 == null || aq2.av == null)) {
                                            aq2 = aq2.aj(-1842839343);
                                        }
                                        drVar2 = aq2;
                                    } else {
                                        drVar2 = null;
                                    }
                                    if (i8 - i13 <= client.bj * 2133672263) {
                                        if (drVar == null) {
                                            ihVar2.cm[i10] = -1;
                                        } else {
                                            dl.dk(ihVar2, (ihVar2.di * -1716041837) / 2, (byte) 2);
                                            if (client.ig * 186539459 > -1) {
                                                int i19;
                                                int i20;
                                                int i21;
                                                int i22;
                                                int i23;
                                                int i24;
                                                int i25;
                                                int i26;
                                                int i27;
                                                int i28;
                                                int i29;
                                                int i30;
                                                ee eeVar;
                                                ee eeVar2;
                                                ee eeVar3;
                                                int i31;
                                                int i32;
                                                int i33;
                                                int i34;
                                                int i35;
                                                oi oiVar;
                                                String str;
                                                int i36;
                                                int i37;
                                                if (i10 == 1) {
                                                    client.iy += 1492450004;
                                                }
                                                if (i10 == 2) {
                                                    client.ig += 201575483;
                                                    client.iy -= 1401258646;
                                                }
                                                if (3 == i10) {
                                                    client.ig -= 201575483;
                                                    client.iy -= 1401258646;
                                                }
                                                ee ae = drVar.ae((byte) -29);
                                                if (ae != null) {
                                                    i13 = ae.aq;
                                                    i12 = ae.ar;
                                                    if (i12 <= 0) {
                                                        i12 = 0;
                                                    }
                                                    i19 = i13;
                                                    i20 = ae.al;
                                                } else {
                                                    i12 = 0;
                                                    i19 = 0;
                                                    i20 = 0;
                                                }
                                                ee am = drVar.am(-2031929444);
                                                if (am != null) {
                                                    i13 = am.aq;
                                                    i8 = am.ar;
                                                    if (i8 > i12) {
                                                        i12 = i8;
                                                    }
                                                    i21 = i13;
                                                    i22 = am.al;
                                                } else {
                                                    i21 = 0;
                                                    i22 = 0;
                                                }
                                                ee ak = drVar.ak(1633648055);
                                                if (ak != null) {
                                                    i13 = ak.aq;
                                                    i8 = ak.ar;
                                                    if (i8 > i12) {
                                                        i12 = i8;
                                                    }
                                                    i23 = i13;
                                                    i11 = ak.al;
                                                } else {
                                                    i23 = 0;
                                                    i11 = 0;
                                                }
                                                ee as = drVar.as(852264738);
                                                if (as != null) {
                                                    i13 = as.aq;
                                                    i24 = as.ar;
                                                    if (i24 <= i12) {
                                                        i24 = i12;
                                                    }
                                                    i25 = i13;
                                                    i26 = as.al;
                                                } else {
                                                    i25 = 0;
                                                    i26 = 0;
                                                    i24 = i12;
                                                }
                                                if (drVar2 != null) {
                                                    ee ae2 = drVar2.ae((byte) 34);
                                                    if (ae2 != null) {
                                                        i27 = ae2.aq;
                                                        i12 = ae2.ar;
                                                        if (i12 <= i24) {
                                                            i12 = i24;
                                                        }
                                                        i17 = ae2.al;
                                                    } else {
                                                        i17 = 0;
                                                        i27 = 0;
                                                        i12 = i24;
                                                    }
                                                    ee am2 = drVar2.am(-1662647515);
                                                    if (am2 != null) {
                                                        i13 = am2.aq;
                                                        i8 = am2.ar;
                                                        if (i8 > i12) {
                                                            i12 = i8;
                                                        }
                                                        i28 = i13;
                                                        i14 = am2.al;
                                                    } else {
                                                        i28 = 0;
                                                        i14 = 0;
                                                    }
                                                    ee ak2 = drVar2.ak(1445932529);
                                                    if (ak2 != null) {
                                                        i13 = ak2.aq;
                                                        i8 = ak2.ar;
                                                        if (i8 > i12) {
                                                            i12 = i8;
                                                        }
                                                        i8 = ak2.al;
                                                    } else {
                                                        i8 = 0;
                                                        i13 = 0;
                                                    }
                                                    ee as2 = drVar2.as(-1504155042);
                                                    if (as2 != null) {
                                                        i29 = as2.aq;
                                                        i6 = as2.ar;
                                                        if (i6 > i12) {
                                                            i12 = i6;
                                                        }
                                                        i30 = as2.al;
                                                        eeVar = ae2;
                                                        eeVar2 = as2;
                                                        eeVar3 = am2;
                                                        aj = ak2;
                                                        i31 = i14;
                                                        i32 = i28;
                                                        i33 = i12;
                                                        i34 = i8;
                                                        i35 = i13;
                                                    } else {
                                                        i30 = 0;
                                                        i29 = 0;
                                                        eeVar = ae2;
                                                        eeVar2 = as2;
                                                        eeVar3 = am2;
                                                        aj = ak2;
                                                        i31 = i14;
                                                        i32 = i28;
                                                        i33 = i12;
                                                        i34 = i8;
                                                        i35 = i13;
                                                    }
                                                } else {
                                                    i30 = 0;
                                                    i27 = 0;
                                                    i35 = 0;
                                                    i34 = 0;
                                                    eeVar = null;
                                                    eeVar2 = null;
                                                    eeVar3 = null;
                                                    aj = null;
                                                    i17 = 0;
                                                    i31 = 0;
                                                    i32 = 0;
                                                    i29 = 0;
                                                    i33 = i24;
                                                }
                                                oi ag = drVar.ag(-229609658);
                                                oi oiVar2 = ag == null ? dz.fn : ag;
                                                if (drVar2 != null) {
                                                    ag = drVar2.ag(594341481);
                                                    oiVar = ag == null ? dz.fn : ag;
                                                } else {
                                                    oiVar = dz.fn;
                                                }
                                                String ai2 = drVar.ai(ihVar2.cj[i10], 2098832743);
                                                i12 = oiVar2.al(ai2);
                                                if (drVar2 != null) {
                                                    String ai3 = drVar2.ai(ihVar2.cn[i10], 2098832743);
                                                    str = ai3;
                                                    i14 = oiVar.al(ai3);
                                                } else {
                                                    str = null;
                                                    i14 = 0;
                                                }
                                                int i38 = i21 > 0 ? (ak == null && as == null) ? 1 : (i12 / i21) + 1 : 0;
                                                int i39 = (drVar2 == null || i32 <= 0) ? 0 : (aj == null && eeVar2 == null) ? 1 : (i14 / i32) + 1;
                                                int i40 = (i19 > 0 ? i19 + 0 : 0) + 2;
                                                i24 = i23 > 0 ? i40 + i23 : i40;
                                                if (i21 > 0) {
                                                    i13 = i21 * i38;
                                                    i16 = i24 + i13;
                                                    i36 = ((i13 - i12) / 2) + i24;
                                                } else {
                                                    i16 = i24 + i12;
                                                    i36 = i24;
                                                }
                                                i8 = i25 > 0 ? i16 + i25 : i16;
                                                if (drVar2 != null) {
                                                    i23 = i8 + 2;
                                                    i12 = (i27 > 0 ? i23 + i27 : i23) + 2;
                                                    i15 = i35 > 0 ? i12 + i35 : i12;
                                                    if (i32 > 0) {
                                                        i8 = i32 * i39;
                                                        i13 = i15 + i8;
                                                        i14 = i15 + ((i8 - i14) / 2);
                                                    } else {
                                                        i13 = i15 + i14;
                                                        i14 = i15;
                                                    }
                                                    if (i29 > 0) {
                                                        i8 = i13 + i29;
                                                        i35 = i13;
                                                        i27 = i12;
                                                        i25 = i23;
                                                        i19 = i14;
                                                        i37 = i15;
                                                    } else {
                                                        i35 = i13;
                                                        i8 = i13;
                                                        i27 = i12;
                                                        i25 = i23;
                                                        i19 = i14;
                                                        i37 = i15;
                                                    }
                                                } else {
                                                    i35 = 0;
                                                    i27 = 0;
                                                    i25 = 0;
                                                    i19 = 0;
                                                    i37 = 0;
                                                }
                                                i12 = ihVar2.cm[i10] - (client.bj * 2133672263);
                                                int i41 = ((drVar.ao * 817138053) - (((drVar.ao * 817138053) * i12) / (drVar.az * 1274925921))) + (((client.ig * 186539459) + i2) - (i8 >> 1));
                                                i8 = (((client.iy * -639843857) + i3) - 12) + ((((drVar.ah * -929823073) * i12) / (drVar.az * 1274925921)) + (-(drVar.ah * -929823073)));
                                                i13 = i8 + 15;
                                                i14 = (drVar.ab * 136247481) + i13;
                                                i23 = oiVar2.am;
                                                i15 = oiVar2.ak;
                                                if (i14 - i23 < i8) {
                                                }
                                                if (i15 + i14 > i8 + i33) {
                                                }
                                                if (drVar2 != null) {
                                                    i13 += drVar2.ab * 136247481;
                                                    i23 = oiVar.am;
                                                    i23 = oiVar.ak;
                                                    i29 = i13;
                                                } else {
                                                    i29 = 0;
                                                }
                                                i12 = drVar.af * -581271277 >= 0 ? (i12 << 8) / ((drVar.az * 1274925921) - (drVar.af * -581271277)) : 255;
                                                if (i12 < 0 || i12 >= 255) {
                                                    if (ae != null) {
                                                        esVar2.aw(ae, (i41 + 0) - i20, i8, 16711935);
                                                    }
                                                    if (ak != null) {
                                                        esVar2.aw(ak, (i40 + i41) - i11, i8, 16711935);
                                                    }
                                                    if (am != null) {
                                                        for (i7 = 0; i7 < i38; i7++) {
                                                            esVar2.aw(am, (i21 * i7) + ((i41 + i24) - i22), i8, 16711935);
                                                        }
                                                    }
                                                    if (as != null) {
                                                        esVar2.aw(as, (i41 + i16) - i26, i8, 16711935);
                                                    }
                                                    oiVar2.ak(ai2, i41 + i36, i14, (drVar.au * -938145999) | ViewCompat.MEASURED_STATE_MASK, 0, esVar2);
                                                    if (drVar2 != null) {
                                                        if (eeVar != null) {
                                                            esVar2.aw(eeVar, (i25 + i41) - i17, i8, 16711935);
                                                        }
                                                        if (aj != null) {
                                                            esVar2.aw(aj, (i27 + i41) - i34, i8, 16711935);
                                                        }
                                                        if (eeVar3 != null) {
                                                            for (i7 = 0; i7 < i39; i7++) {
                                                                esVar2.aw(eeVar3, (i7 * i32) + ((i37 + i41) - i31), i8, 16711935);
                                                            }
                                                        }
                                                        if (eeVar2 != null) {
                                                            esVar2.aw(eeVar2, (i41 + i35) - i30, i8, 16711935);
                                                        }
                                                        oiVar.ak(str, i41 + i19, i29, (drVar2.au * -938145999) | ViewCompat.MEASURED_STATE_MASK, 0, esVar2);
                                                    }
                                                } else {
                                                    if (ae != null) {
                                                        esVar2.bs(ae, (i41 + 0) - i20, i8, i12, (byte) 7);
                                                    }
                                                    if (ak != null) {
                                                        esVar2.bs(ak, (i40 + i41) - i11, i8, i12, (byte) 7);
                                                    }
                                                    if (am != null) {
                                                        for (i11 = 0; i11 < i38; i11++) {
                                                            esVar2.bs(am, (i11 * i21) + ((i24 + i41) - i22), i8, i12, (byte) 7);
                                                        }
                                                    }
                                                    if (as != null) {
                                                        esVar2.bs(as, (i41 + i16) - i26, i8, i12, (byte) 7);
                                                    }
                                                    oiVar2.as(ai2, i36 + i41, i14, drVar.au * -938145999, 0, i12, esVar2);
                                                    if (drVar2 != null) {
                                                        if (eeVar != null) {
                                                            esVar2.bs(eeVar, (i25 + i41) - i17, i8, i12, (byte) 7);
                                                        }
                                                        if (aj != null) {
                                                            esVar2.bs(aj, (i41 + i27) - i34, i8, i12, (byte) 7);
                                                        }
                                                        if (eeVar3 != null) {
                                                            for (i28 = 0; i28 < i39; i28++) {
                                                                esVar2.bs(eeVar3, (i32 * i28) + ((i41 + i37) - i31), i8, i12, (byte) 7);
                                                            }
                                                        }
                                                        if (eeVar2 != null) {
                                                            esVar2.bs(eeVar2, (i41 + i35) - i30, i8, i12, (byte) 7);
                                                        }
                                                        oiVar.as(str, i41 + i19, i29, drVar2.au * -938145999, 0, i12, esVar2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i8 >= 0) {
                                i13 = 0;
                                drVar = null;
                                i7 = ihVar2.cq[i10];
                                if (i7 < 0) {
                                }
                                if (i8 - i13 <= client.bj * 2133672263) {
                                }
                            }
                            ihVar2 = ihVar;
                        }
                    }
                }
                i6 = 0;
                i7 = -2;
                if (ihVar.cw.ak()) {
                }
                if (-2 == i9) {
                }
                i7 = i9 + i6;
                if (i >= i8) {
                }
                dl.dk(ihVar, ihVar.di * -1716041837, (byte) 2);
                client.ik[client.ie * 1711909053] = lh.fs.al(ihVar.be) / 2;
                client.iq[client.ie * 1711909053] = lh.fs.ae;
                client.io[client.ie * 1711909053] = client.ig * 186539459;
                client.iw[client.ie * 1711909053] = client.iy * -639843857;
                client.in[client.ie * 1711909053] = ihVar.bn * 1784677751;
                client.ih[client.ie * 1711909053] = ihVar.bz * 1827916901;
                client.ib[client.ie * 1711909053] = ihVar.bt * 1765530939;
                client.ir[client.ie * 1711909053] = ihVar.be;
                client.ie += 1367970453;
                ihVar2 = ihVar;
                esVar2 = esVar;
                while (i10 < 4) {
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fg.do(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public float ad(float f, int i) {
        try {
            return ((float) (Math.cos(((double) (1.0f + f)) * 3.141592653589793d) / 2.0d)) + 0.5f;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fg.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public float aq(float f) {
        return ((float) (Math.cos(((double) (1.0f + f)) * 3.141592653589793d) / 2.0d)) + 0.5f;
    }

    public float ar(float f) {
        return ((float) (Math.cos(((double) (1.0f + f)) * 3.141592653589793d) / 2.0d)) + 0.5f;
    }
}
