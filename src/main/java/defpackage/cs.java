package defpackage;

import android.support.v4.internal.view.SupportMenu;

/* renamed from: cs */
public class cs {
    static final int ad = 0;
    static final int ae = 24;
    static final int ai = 3;
    static final int ao = 286331153;
    static final int aq = 1;

    cs() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cs.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean al(int i, int i2) {
        try {
            if (oh.am[i]) {
                return true;
            }
            if (!bz.ak.ae(i, 711871819)) {
                return false;
            }
            int ax = bz.ak.ax(i, (byte) 103);
            if (ax == 0) {
                oh.am[i] = true;
                return true;
            }
            if (dt.ae[i] == null) {
                dt.ae[i] = new al[ax];
            }
            for (int i3 = 0; i3 < ax; i3++) {
                if (dt.ae[i][i3] == null) {
                    byte[] ar = bz.ak.ar(i, i3, 1358277956);
                    if (ar != null) {
                        dt.ae[i][i3] = new al();
                        dt.ae[i][i3].ao = ((i << 16) + i3) * -1386012595;
                        if (ar[0] == (byte) -1) {
                            dt.ae[i][i3].ae(new lj(ar), (short) 29021);
                        } else {
                            dt.ae[i][i3].ai(new lj(ar), (byte) 19);
                        }
                    }
                }
            }
            oh.am[i] = true;
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cs.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static dw aq(int i, int i2) {
        try {
            long j = (long) i;
            dw dwVar = (dw) dw.al.ad(j);
            if (dwVar == null) {
                byte[] ar = dw.ad.ar(3, i, 1804464313);
                dwVar = new dw();
                if (ar != null) {
                    dwVar.ar(new lj(ar), -359324642);
                }
                dw.al.ar(dwVar, j);
            }
            return dwVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cs.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ar(kh khVar, kh khVar2, boolean z, int i, es esVar, int i2) {
        if (i == 4) {
            try {
                di.an((byte) 1).ay(-1435099557);
                hm.cu = i * -1949278637;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cs.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        if (!hm.ak) {
            client client = client.aq;
            client.bh.bs(1783882971);
            client.aq.acr(hm.fw, 1169496435);
            client.aq.abx((byte) 9).ba(false, -875043169);
            hm.fw.ad = client.aq.ax ^ 1;
            if (i == 0) {
                oz.ao(z, 1814231166);
            } else {
                hm.cu = i * -1949278637;
            }
            esVar.aq(-468566721);
            fk.aa = ey.ad(khVar.ab("titlewide.jpg", "", (byte) -27), -1778510587);
            hs.ao = fk.aa.ad();
            if (((client.al * -925529453) & ol.ae) != 0) {
                el.ah = ji.ak(khVar2, "logo_deadman_mode", "", -1635909539);
            } else {
                el.ah = ji.ak(khVar2, "logo_osrs", "", -1635909539);
            }
            hm.ag = ji.ak(khVar2, "titlebox", "", -1635909539);
            gg.ac = hm.ag.al * -54109893;
            jg.ap = ji.ak(khVar2, "titlebutton", "", -1635909539);
            dc.au = ji.ak(khVar2, "titlebutton_large", "", -1635909539);
            gq.az = ji.ak(khVar2, "play_now_text", "", -1635909539);
            cg.ax = ji.ak(khVar2, "titlebutton_wide42,1", "", -1635909539);
            fj.aw = ed.am(khVar2, "login_icons", "", -152522515);
            mw.af = ed.am(khVar2, "title_mute", "", -152522515);
            jk.ay = ji.ak(khVar2, "options_radio_buttons,0", "", -1635909539);
            jd.an = ji.ak(khVar2, "options_radio_buttons,4", "", -1635909539);
            bv.ab = ji.ak(khVar2, "options_radio_buttons,2", "", -1635909539);
            jz.av = ji.ak(khVar2, "options_radio_buttons,6", "", -1635909539);
            cw.dl = jk.ay.ar * -593456167;
            ab.dr = jk.ay.al * 1500444365;
            bb.at = new ia(ed.am(khVar2, "runes", "", -152522515));
            if (z) {
                hm.cg = "";
                hm.ch = "";
            }
            gd.dc = 0;
            hw.du = "";
            hm.dp = true;
            hm.ez = false;
            hm.bo = -169728173;
            hm.bq = 54063909;
            hm.bd = (float) (hm.bq * 916439951);
            if (dc.rx.al) {
                ae.am(2, 2000970832);
            } else {
                il.ai(2, cw.dd, "scape main", "", 255, false, -242658056);
            }
            ia.aq(false, 1831914561);
            hm.ak = true;
            hm.as = (((hl.tk * 1350811837) - 765) / 2) * -214004141;
            hm.bl = (hm.as * -503487303) + 1535064078;
            an.bf = (hm.bl * -1579142247) - 2115169764;
        }
    }

    static int bm(int i, hw hwVar, boolean z, byte b) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        dh aq;
        String[] strArr;
        int i5;
        String[] strArr2;
        int[] iArr2;
        if (i == 4200) {
            try {
                iArr = hl.ae;
                i2 = ds.am + 564452847;
                ds.am = i2;
                i3 = iArr[i2 * -757592335];
                String[] strArr3 = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr3[(i4 * -1883296125) - 1] = gl.aq(i3, 1699370575).ao;
                return 1;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cs.bm(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (4201 == i) {
            ds.am += 1128905694;
            i3 = hl.ae[ds.am * -757592335];
            i2 = hl.ae[(ds.am * -757592335) + 1];
            aq = gl.aq(i3, -240916312);
            if (i2 >= 1 && i2 <= 5) {
                i2--;
                if (aq.bo[i2] != null) {
                    strArr = hl.ak;
                    i5 = hl.as - 1490481109;
                    hl.as = i5;
                    strArr[(i5 * -1883296125) - 1] = aq.bo[i2];
                    return 1;
                }
            }
            strArr2 = hl.ak;
            i2 = hl.as - 1490481109;
            hl.as = i2;
            strArr2[(i2 * -1883296125) - 1] = "";
            return 1;
        } else if (4202 == i) {
            ds.am += 1128905694;
            i3 = hl.ae[ds.am * -757592335];
            i2 = hl.ae[(ds.am * -757592335) + 1];
            aq = gl.aq(i3, -569811001);
            if (i2 >= 1 && i2 <= 5) {
                i2--;
                if (aq.bl[i2] != null) {
                    strArr = hl.ak;
                    i5 = hl.as - 1490481109;
                    hl.as = i5;
                    strArr[(i5 * -1883296125) - 1] = aq.bl[i2];
                    return 1;
                }
            }
            strArr2 = hl.ak;
            i2 = hl.as - 1490481109;
            hl.as = i2;
            strArr2[(i2 * -1883296125) - 1] = "";
            return 1;
        } else if (i == 4203) {
            iArr = hl.ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -757592335];
            iArr2 = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr2[(i4 * -757592335) - 1] = gl.aq(i3, -1910549281).bq * -1195053793;
            return 1;
        } else {
            i3 = 0;
            int[] iArr3;
            dh aq2;
            if (4204 == i) {
                iArr2 = hl.ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                i2 = iArr2[i4 * -757592335];
                iArr3 = hl.ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                if (gl.aq(i2, -841512916).bm * -1954437925 == 1) {
                    i3 = 1;
                }
                iArr3[(i5 * -757592335) - 1] = i3;
                return 1;
            } else if (i == 4205) {
                iArr = hl.ae;
                i2 = ds.am + 564452847;
                ds.am = i2;
                i3 = iArr[i2 * -757592335];
                aq2 = gl.aq(i3, -140335872);
                if (aq2.bp * 518600683 != -1 || aq2.by * 1269103785 < 0) {
                    iArr2 = hl.ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = i3;
                    return 1;
                }
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = aq2.by * 1269103785;
                return 1;
            } else if (4206 == i) {
                iArr = hl.ae;
                i2 = ds.am + 564452847;
                ds.am = i2;
                i3 = iArr[i2 * -757592335];
                aq2 = gl.aq(i3, 1097421411);
                if (aq2.bp * 518600683 < 0 || aq2.by * 1269103785 < 0) {
                    iArr2 = hl.ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = i3;
                    return 1;
                }
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = aq2.by * 1269103785;
                return 1;
            } else if (4207 == i) {
                iArr = hl.ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                i3 = iArr[i4 * -757592335];
                iArr3 = hl.ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                iArr3[(i5 * -757592335) - 1] = gl.aq(i3, 2091697908).bd ? 1 : 0;
                return 1;
            } else if (i == 4208) {
                iArr = hl.ae;
                i2 = ds.am + 564452847;
                ds.am = i2;
                i3 = iArr[i2 * -757592335];
                aq2 = gl.aq(i3, 765565091);
                if (aq2.cc * 335744487 != -1 || aq2.cy * -1499517591 < 0) {
                    iArr2 = hl.ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = i3;
                    return 1;
                }
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = aq2.cy * -1499517591;
                return 1;
            } else if (4209 == i) {
                iArr = hl.ae;
                i2 = ds.am + 564452847;
                ds.am = i2;
                i3 = iArr[i2 * -757592335];
                aq2 = gl.aq(i3, -1559681684);
                if (aq2.cc * 335744487 < 0 || aq2.cy * -1499517591 < 0) {
                    iArr2 = hl.ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr2[(i4 * -757592335) - 1] = i3;
                    return 1;
                }
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = aq2.cy * -1499517591;
                return 1;
            } else if (4210 == i) {
                strArr2 = hl.ak;
                i2 = hl.as + 1490481109;
                hl.as = i2;
                String str = strArr2[i2 * -1883296125];
                iArr = hl.ae;
                i5 = ds.am + 564452847;
                ds.am = i5;
                gi.m218if(str, iArr[i5 * -757592335] == 1, 1830476449);
                iArr = hl.ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                iArr[(i2 * -757592335) - 1] = if.rt * 697017025;
                return 1;
            } else if (i == 4211) {
                if (ib.ra == null || el.rj * 1948118835 >= if.rt * 697017025) {
                    iArr = hl.ae;
                    i2 = ds.am - 564452847;
                    ds.am = i2;
                    iArr[(i2 * -757592335) - 1] = -1;
                    return 1;
                }
                iArr = hl.ae;
                i2 = ds.am - 564452847;
                ds.am = i2;
                short[] sArr = ib.ra;
                i5 = el.rj - 1891392517;
                el.rj = i5;
                iArr[(i2 * -757592335) - 1] = sArr[(i5 * 1948118835) - 1] & SupportMenu.USER_MASK;
                return 1;
            } else if (i != 4212) {
                return 2;
            } else {
                el.rj = 0;
                return 1;
            }
        }
    }
}
