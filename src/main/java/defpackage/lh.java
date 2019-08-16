package defpackage;

import android.support.v4.view.ViewCompat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: lh */
public class lh implements lk {
    static final lh ad = new lh("", 0, new ln[]{ln.ar});
    static final lh ae = new lh("", 6, new ln[]{ln.ar});
    static final lh ag = new lh("", 11, new ln[]{ln.aq});
    static final lh ai = new lh("", 5, new ln[]{ln.aq, ln.ar});
    static final lh aj = new lh("", 4);
    static final lh ak = new lh("", 9, new ln[]{ln.aq, ln.ad});
    static final lh al = new lh("", 3, new ln[]{ln.aq});
    static final lh am = new lh("", 8, new ln[]{ln.aq, ln.ar});
    static final lh ap = new lh("", 12, new ln[]{ln.aq, ln.ar});
    static final lh aq = new lh("", 1, new ln[]{ln.aq, ln.ar});
    static final lh ar = new lh("", 2, new ln[]{ln.aq, ln.ad, ln.ar});
    static final lh as = new lh("", 10, new ln[]{ln.aq});
    static final lh au = new lh("", 13, new ln[]{ln.aq});
    public static final int aw = 63;
    static final int be = 5;
    public static final int bl = 3;
    public static final int bm = 36;
    static final int cw = 1006;
    static int[][] fo = null;
    static oi fs = null;
    static final int oi = 100;
    final Set ax;
    final int az;

    static {
        lh.aq(2139640761);
    }

    lh(String str, int i) {
        try {
            this.ax = new HashSet();
            this.az = -1036728275 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lh.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    lh(String str, int i, ln[] lnVarArr) {
        try {
            this.ax = new HashSet();
            this.az = -1036728275 * i;
            for (Object add : lnVarArr) {
                this.ax.add(add);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lh.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(int i, kh khVar, int i2, int i3, int i4, boolean z, byte b) {
        try {
            ko.aj = -515568231;
            ko.ai = khVar;
            ko.ae = 1495124335 * i2;
            ne.am = 1291550091 * i3;
            mo.ak = -779850513 * i4;
            fx.ag = z;
            ko.as = -783619209 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lh.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static lh[] ae() {
        return new lh[]{aj, ad, ag, ak, ae, au, al, ai, am, aq, ap, as, ar};
    }

    static void ak(short s) {
        try {
            Iterator it = it.aq.iterator();
            while (it.hasNext()) {
                ((ip) it.next()).aj((byte) 84);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lh.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static fb[] aq(int i) {
        try {
            fb fbVar = fb.al;
            fb fbVar2 = fb.aq;
            fb fbVar3 = fb.ad;
            fb fbVar4 = fb.ar;
            return new fb[]{fbVar, fbVar2, fbVar3, fbVar4};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lh.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* renamed from: aq */
    static lh[] m229aq(int i) {
        try {
            lh lhVar = aj;
            lh lhVar2 = ad;
            lh lhVar3 = ag;
            lh lhVar4 = ak;
            lh lhVar5 = ae;
            lh lhVar6 = au;
            lh lhVar7 = al;
            lh lhVar8 = ai;
            lh lhVar9 = am;
            lh lhVar10 = aq;
            lh lhVar11 = ap;
            lh lhVar12 = as;
            lh lhVar13 = ar;
            return new lh[]{lhVar, lhVar2, lhVar3, lhVar4, lhVar5, lhVar6, lhVar7, lhVar8, lhVar9, lhVar10, lhVar11, lhVar12, lhVar13};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lh.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static lh[] ar() {
        return new lh[]{aj, ad, ag, ak, ae, au, al, ai, am, aq, ap, as, ar};
    }

    static void av(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i3;
        for (int i12 = -i6; i12 < 0; i12++) {
            int i13 = i;
            int i14 = -i5;
            while (i14 < 0) {
                byte b = bArr[(i13 >> 16) + ((i2 >> 16) * i9)];
                if (b != (byte) 0) {
                    iArr[i11] = iArr2[b & 255];
                }
                i13 += i7;
                i14++;
                i11++;
            }
            i2 += i8;
            i11 += i4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0426 A:{Catch:{ RuntimeException -> 0x051f }} */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x049f A:{Catch:{ RuntimeException -> 0x051f }} */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x04da A:{Catch:{ RuntimeException -> 0x051f }} */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x03dc A:{Catch:{ RuntimeException -> 0x051f }} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x03eb A:{Catch:{ RuntimeException -> 0x051f }} */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0426 A:{Catch:{ RuntimeException -> 0x051f }} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x049f A:{Catch:{ RuntimeException -> 0x051f }} */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x054a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void bm(oi oiVar, oi oiVar2, es esVar, int i) {
        try {
            int i2;
            int i3 = hm.fw.ar * 767223527;
            int i4 = hm.fw.al * 1488950355;
            if (cr.eo == null) {
                cr.eo = cf.as(fx.dt, "sl_back", "", 774882532);
            }
            if (oh.eh == null) {
                oh.eh = ed.am(fx.dt, "sl_flags", "", -152522515);
            }
            if (cn.ec == null) {
                cn.ec = ed.am(fx.dt, "sl_arrows", "", -152522515);
            }
            if (bi.ea == null) {
                bi.ea = ed.am(fx.dt, "sl_stars", "", -152522515);
            }
            if (bw.ei == null) {
                bw.ei = ji.ak(fx.dt, "leftarrow", "", -1635909539);
            }
            if (fe.en == null) {
                fe.en = ji.ak(fx.dt, "rightarrow", "", -1635909539);
            }
            esVar.al(1034216923 * hm.as, 23, 765, 480, 0, (byte) 1);
            esVar.ep(1034216923 * hm.as, 0, 125, 23, 12425273, 9135624, (byte) -82);
            esVar.ep((hm.as * 1034216923) + 125, 0, 640, 23, 5197647, 2697513, (byte) -17);
            oiVar.ap(go.np, (hm.as * 1034216923) + 62, 15, 0, -1, esVar);
            if (bi.ea != null) {
                esVar.aa(bi.ea[1], (hm.as * 1034216923) + 140, 1, (byte) -96);
                oiVar2.ak(go.nt, (hm.as * 1034216923) + 152, 10, ViewCompat.MEASURED_SIZE_MASK, -1, esVar);
                esVar.aa(bi.ea[0], (hm.as * 1034216923) + 140, 12, (byte) -16);
                oiVar2.ak(go.nm, (hm.as * 1034216923) + 152, 21, ViewCompat.MEASURED_SIZE_MASK, -1, esVar);
            }
            if (cn.ec != null) {
                ef efVar = (ii.ak[0] == 0 && 1 == ii.am[0]) ? cn.ec[2] : cn.ec[0];
                ef efVar2 = (ii.ak[0] == 0 && ii.am[0] == 1) ? cn.ec[3] : cn.ec[1];
                i2 = (hm.as * 1034216923) + 280;
                esVar.aa(efVar, i2, 4, (byte) -117);
                esVar.aa(efVar2, i2 + 15, 4, (byte) -117);
                oiVar.ak(go.nk, i2 + 32, 17, ViewCompat.MEASURED_SIZE_MASK, -1, esVar);
                i2 = (hm.as * 1034216923) + 390;
                esVar.aa(efVar, i2, 4, (byte) -84);
                esVar.aa(efVar2, i2 + 15, 4, (byte) 1);
                oiVar.ak(go.ng, i2 + 32, 17, ViewCompat.MEASURED_SIZE_MASK, -1, esVar);
                i2 = (hm.as * 1034216923) + 500;
                esVar.aa(efVar, i2, 4, (byte) -16);
                esVar.aa(efVar2, i2 + 15, 4, (byte) -60);
                oiVar.ak(go.nu, i2 + 32, 17, ViewCompat.MEASURED_SIZE_MASK, -1, esVar);
                i2 = (hm.as * 1034216923) + 610;
                esVar.aa(efVar, i2, 4, (byte) -104);
                esVar.aa(efVar2, i2 + 15, 4, (byte) -111);
                oiVar.ak(go.no, i2 + 32, 17, ViewCompat.MEASURED_SIZE_MASK, -1, esVar);
            }
            esVar.al((hm.as * 1034216923) + 708, 4, 50, 16, 0, (byte) 1);
            oiVar2.ap(go.lj, ((hm.as * 1034216923) + 708) + 25, 16, ViewCompat.MEASURED_SIZE_MASK, -1, esVar);
            hm.ey = -1613535007;
            if (cr.eo != null) {
                int i5;
                hm.er = ck.bq(-1078800826);
                hm.ed = (((((hm.er.al * -507697637) + (ii.ai * 1909797369)) - 1) / (hm.er.al * -507697637)) - (hm.er.ar * -1826743065)) * -1929605007;
                if (bw.ei != null && hm.eg * 1754320713 > 0) {
                    esVar.aa(bw.ei, (((hm.er.ae * 987359585) + (hm.as * 1034216923)) - bw.ei.ar) - (hm.er.aj * 1653025354), ((jw.tx * -1083397279) / 2) - (bw.ei.al / 2), (byte) -14);
                }
                if (fe.en != null && hm.eg * 1754320713 < hm.ed * -970116975) {
                    esVar.aa(fe.en, (hm.er.aj * 1653025354) + ((hm.er.am * -1484866783) + (hm.as * 1034216923)), ((jw.tx * -1083397279) / 2) - (fe.en.al / 2), (byte) -105);
                }
                int i6 = hm.eg * 1754320713;
                int i7 = (hm.er.ak * -844626013) + 23;
                int i8 = (987359585 * hm.er.ae) + (1034216923 * hm.as);
                Object obj = null;
                int i9 = (-507697637 * hm.er.al) * i6;
                int i10 = 0;
                while (i9 < ii.ai * 1909797369 && i6 - (hm.eg * 1754320713) < hm.er.ar * -1826743065) {
                    Object obj2;
                    String str;
                    int i11;
                    Object obj3;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    ii iiVar = ii.aj[i9];
                    String num = Integer.toString(iiVar.au * 2040602315);
                    if (-1 == iiVar.au * 2040602315) {
                        num = go.ns;
                    } else if (iiVar.au * 2040602315 > 1980) {
                        num = go.nl;
                    } else {
                        obj2 = 1;
                        str = num;
                        if (!iiVar.ax(2094022225)) {
                            i2 = iiVar.as(2139152915) ? 7 : 6;
                        } else if (iiVar.az(-757592335)) {
                            i2 = iiVar.as(2132575941) ? 5 : 4;
                            i11 = 16711680;
                            if (i3 >= i8 || i4 < i7 || i3 >= (hm.er.ad * -1025891283) + i8 || i4 >= (hm.er.aq * -415854127) + i7 || obj2 == null) {
                                esVar.az(cr.eo[i2], i8, i7, -1141134102);
                                obj3 = obj;
                            } else {
                                hm.ey = 1613535007 * i9;
                                esVar.bk(cr.eo[i2], i8, i7, 128, ViewCompat.MEASURED_SIZE_MASK, (byte) 20);
                                obj3 = 1;
                            }
                            if (oh.eh != null) {
                                esVar.aa(oh.eh[(iiVar.as(2146966285) ? 8 : 0) + (iiVar.aw * -2015421483)], i8 + 29, i7, (byte) -107);
                            }
                            oiVar.ap(Integer.toString(iiVar.ag * -936955627), i8 + 15, (((hm.er.aq * -415854127) / 2) + i7) + 5, i11, -1, esVar);
                            oiVar2.ap(str, i8 + 60, (((hm.er.aq * -415854127) / 2) + i7) + 5, 268435455, -1, esVar);
                            i7 += (hm.er.ai * 1921233033) + (hm.er.aq * -415854127);
                            i12 = i10 + 1;
                            if (i12 >= hm.er.al * -507697637) {
                                i13 = (-844626013 * hm.er.ak) + 23;
                                i5 = i6 + 1;
                                i14 = 0;
                                i15 = i8 + ((hm.er.ad * -1025891283) + (hm.er.aj * -1320970971));
                            } else {
                                i5 = i6;
                                i14 = i12;
                                i15 = i8;
                                i13 = i7;
                            }
                            i6 = i5;
                            i9++;
                            i10 = i14;
                            obj = obj3;
                            i8 = i15;
                            i7 = i13;
                        } else {
                            i2 = iiVar.ap((byte) 0) ? iiVar.as(2134773795) ? 3 : 2 : iiVar.as(2140169435) ? 1 : 0;
                        }
                        i11 = 0;
                        if (i3 >= i8) {
                        }
                        esVar.az(cr.eo[i2], i8, i7, -1141134102);
                        obj3 = obj;
                        if (oh.eh != null) {
                        }
                        oiVar.ap(Integer.toString(iiVar.ag * -936955627), i8 + 15, (((hm.er.aq * -415854127) / 2) + i7) + 5, i11, -1, esVar);
                        oiVar2.ap(str, i8 + 60, (((hm.er.aq * -415854127) / 2) + i7) + 5, 268435455, -1, esVar);
                        i7 += (hm.er.ai * 1921233033) + (hm.er.aq * -415854127);
                        i12 = i10 + 1;
                        if (i12 >= hm.er.al * -507697637) {
                        }
                        i6 = i5;
                        i9++;
                        i10 = i14;
                        obj = obj3;
                        i8 = i15;
                        i7 = i13;
                    }
                    obj2 = null;
                    str = num;
                    if (!iiVar.ax(2094022225)) {
                    }
                    i11 = 0;
                    if (i3 >= i8) {
                    }
                    esVar.az(cr.eo[i2], i8, i7, -1141134102);
                    obj3 = obj;
                    if (oh.eh != null) {
                    }
                    oiVar.ap(Integer.toString(iiVar.ag * -936955627), i8 + 15, (((hm.er.aq * -415854127) / 2) + i7) + 5, i11, -1, esVar);
                    oiVar2.ap(str, i8 + 60, (((hm.er.aq * -415854127) / 2) + i7) + 5, 268435455, -1, esVar);
                    i7 += (hm.er.ai * 1921233033) + (hm.er.aq * -415854127);
                    i12 = i10 + 1;
                    if (i12 >= hm.er.al * -507697637) {
                    }
                    i6 = i5;
                    i9++;
                    i10 = i14;
                    obj = obj3;
                    i8 = i15;
                    i7 = i13;
                }
                if (obj != null) {
                    i7 = oiVar2.al(ii.aj[hm.ey * 387458271].ax) + 6;
                    i5 = oiVar2.ae + 8;
                    i8 = i4 + 25;
                    if (i5 + i8 > 480) {
                        i8 = (i4 - 25) - i5;
                    }
                    esVar.al(i3 - (i7 / 2), i8, i7, i5, 16777120, (byte) 1);
                    esVar.em(i3 - (i7 / 2), i8, i7, i5, 0, 424839917);
                    oiVar2.ap(ii.aj[hm.ey * 387458271].ax, i3, (oiVar2.ae + i8) + 4, 0, -1, esVar);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lh.bm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        try {
            return this.az * 1507903397;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lh.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.az * 1507903397;
    }

    public int aj() {
        return this.az * 1507903397;
    }

    public int al() {
        return this.az * 1507903397;
    }
}
