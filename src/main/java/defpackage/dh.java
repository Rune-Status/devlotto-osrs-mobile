package defpackage;

import android.support.v4.view.ViewCompat;
import java.util.Collection;

/* renamed from: dh */
public class dh extends mp {
    public static final int ad = 0;
    public static int ag = 0;
    static final int aj = -2;
    static final int al = -1;
    static gz ap = new gz(64, null);
    public static final int aq = 1;
    static final int as = 512;
    static gz au = new gz(50, null);
    static final ej aw = new ej();
    static oi ax;
    static gz az = new gz(200, null);
    static kv ch;
    int aa;
    public int ab;
    public int ac;
    short[] af;
    short[] ah;
    short[] an;
    public String ao;
    public int at;
    public int av;
    short[] ay;
    public int ba;
    int bb;
    int bc;
    public boolean bd;
    int be;
    int bg;
    int bh;
    int bi;
    int bj;
    public int bk;
    public String[] bl;
    public int bm;
    int[] bn;
    public String[] bo;
    public int bp;
    public int bq;
    int br;
    public int bs;
    int bt;
    int bu;
    int bv;
    int bw;
    int bx;
    public int by;
    int[] bz;
    int cb;
    public int cc;
    int ce;
    public boolean ci;
    int cj;
    int cm;
    public int cn;
    ot cp;
    public int cq;
    int cv;
    public int cw;
    public int cy;

    dh() {
        try {
            this.ao = go.ak;
            this.ab = 1153769168;
            this.av = 0;
            this.at = 0;
            this.bk = 0;
            this.ba = 0;
            this.bs = 0;
            this.bm = 0;
            this.bq = 386551519;
            this.bd = false;
            this.bo = new String[]{null, null, go.aq, null, null};
            this.bl = new String[]{null, null, null, null, go.ar};
            this.bb = 689854054;
            this.bi = 354000419;
            this.bc = 1988999309;
            this.bv = 0;
            this.bg = 424876299;
            this.bx = -1956068183;
            this.bu = 0;
            this.bw = -712131791;
            this.br = -585725397;
            this.be = -2027832663;
            this.bj = 1162697049;
            this.bh = 2134864411;
            this.bt = -1509310241;
            this.by = 1544198247;
            this.bp = -798832835;
            this.cv = 885908352;
            this.cj = 122868096;
            this.cm = 402884736;
            this.cq = 0;
            this.cn = 0;
            this.cw = 0;
            this.ci = false;
            this.cb = 2039351195;
            this.ce = -1618149715;
            this.cy = -538194649;
            this.cc = 785533481;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final void aj(hh hhVar, int i) {
        try {
            hd.ak = hhVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void an(int i) {
        try {
            az.al();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static dh at(int i) {
        long j = (long) i;
        dh dhVar = (dh) ap.ad(j);
        if (dhVar != null) {
            return dhVar;
        }
        byte[] ar = ai.am.ar(10, i, 740391119);
        dh dhVar2 = new dh();
        dhVar2.ac = 1005713433 * i;
        if (ar != null) {
            dhVar2.al(new lj(ar), 612987945);
        }
        dhVar2.ar((byte) 16);
        if (-1 != dhVar2.bp * 883087278) {
            dhVar2.ai(gl.aq(dhVar2.bp * -1443445584, -1511644416), gl.aq(dhVar2.by * 1269103785, 1012631665), 228826042);
        }
        if (-1 != dhVar2.ce * -755438885) {
            dhVar2.ae(gl.aq(dhVar2.ce * -755438885, -2007256306), gl.aq(dhVar2.cb * 871627117, 310865204), (byte) 2);
        }
        if (-1 != dhVar2.cc * 335744487) {
            dhVar2.am(gl.aq(dhVar2.cc * 1189899687, 838783488), gl.aq(dhVar2.cy * -1499517591, 106254525), -1736520333);
        }
        if (!if.as && dhVar2.bd) {
            dhVar2.ao = go.ad;
            dhVar2.ci = false;
            dhVar2.bo = null;
            dhVar2.bl = null;
            dhVar2.bb = -990003317;
            dhVar2.cw = 0;
            if (dhVar2.cp != null) {
                boolean z = false;
                for (mb al = dhVar2.cp.al(); al != null; al = dhVar2.cp.aj()) {
                    if (dy.aq((int) al.gs, 2135157182).ai) {
                        al.ky();
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    dhVar2.cp = null;
                }
            }
        }
        ap.ar(dhVar2, j);
        return dhVar2;
    }

    public static void av(kh khVar, kh khVar2, boolean z, oi oiVar) {
        ai.am = khVar;
        da.ak = khVar2;
        if.as = z;
        ag = ai.am.ax(10, (byte) 77) * -1565188967;
        ax = oiVar;
    }

    public static dh bk(int i) {
        long j = (long) i;
        dh dhVar = (dh) ap.ad(j);
        if (dhVar != null) {
            return dhVar;
        }
        byte[] ar = ai.am.ar(10, i, 971753207);
        dh dhVar2 = new dh();
        dhVar2.ac = -1425429800 * i;
        if (ar != null) {
            dhVar2.al(new lj(ar), 1419839835);
        }
        dhVar2.ar((byte) 16);
        if (-1 != dhVar2.bp * 1726822940) {
            dhVar2.ai(gl.aq(dhVar2.bp * 518600683, 1239586890), gl.aq(dhVar2.by * 1182793154, 1266769271), 419626262);
        }
        if (-1 != dhVar2.ce * -61637321) {
            dhVar2.ae(gl.aq(dhVar2.ce * -755438885, 592262563), gl.aq(dhVar2.cb * 468463557, 1977844070), (byte) 2);
        }
        if (-1 != dhVar2.cc * 1397969379) {
            dhVar2.am(gl.aq(dhVar2.cc * 335744487, -1398271745), gl.aq(dhVar2.cy * -1499517591, -1970356415), 176044610);
        }
        if (!if.as && dhVar2.bd) {
            dhVar2.ao = go.ad;
            dhVar2.ci = false;
            dhVar2.bo = null;
            dhVar2.bl = null;
            dhVar2.bb = -1802556621;
            dhVar2.cw = 0;
            if (dhVar2.cp != null) {
                boolean z = false;
                for (mb al = dhVar2.cp.al(); al != null; al = dhVar2.cp.aj()) {
                    if (dy.aq((int) al.gs, 2141205054).ai) {
                        al.ky();
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    dhVar2.cp = null;
                }
            }
        }
        ap.ar(dhVar2, j);
        return dhVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final ee bp(int i, int i2, int i3, int i4, int i5, boolean z) {
        ee eeVar;
        dh aq;
        bp as;
        if (i2 == -1) {
            i5 = 0;
        } else if (i5 == 2 && i2 != 1) {
            i5 = 1;
        }
        long j = (((long) i4) << 42) + ((((long) i5) << 40) + (((((long) i2) << 16) + ((long) i)) + (((long) i3) << 38)));
        if (!z) {
            eeVar = (ee) az.ad(j);
            if (eeVar != null) {
                return eeVar;
            }
        }
        dh aq2 = gl.aq(i, 2088108238);
        if (i2 > 1 && aq2.bn != null) {
            int i6 = 0;
            int i7 = -1;
            while (i6 < 10) {
                if (i2 >= aq2.bz[i6] && aq2.bz[i6] != 0) {
                    i7 = aq2.bn[i6];
                }
                i6++;
            }
            if (-1 != i7) {
                aq = gl.aq(i7, 1357825804);
                as = aq.as(1, 662620823);
                if (as != null) {
                    return null;
                }
                ee eeVar2;
                if (-1 != aq.bp * 518600683) {
                    eeVar = oz.ap(aq.by * 1269103785, 10, 1, 0, 0, true, (short) 9669);
                    if (eeVar == null) {
                        return null;
                    }
                    eeVar2 = eeVar;
                } else {
                    if (aq.ce * -755438885 != -1) {
                        eeVar = oz.ap(871627117 * aq.cb, i2, i3, i4, 0, false, (short) -18352);
                        if (eeVar == null) {
                            return null;
                        }
                    } else if (aq.cc * 335744487 != -1) {
                        eeVar = oz.ap(-1499517591 * aq.cy, i2, 0, 0, 0, false, (short) 10720);
                        if (eeVar == null) {
                            return null;
                        }
                    } else {
                        eeVar2 = null;
                    }
                    eeVar2 = eeVar;
                }
                ee eeVar3 = new ee(36, 32);
                aw.bm(eeVar3.ad, 36, 32, 1550980350);
                es esVar = (eb) aw.ad(-601277067);
                be beVar = (be) aw.aq(1767714714);
                by aq3 = aw.ar(-803845538).aq((byte) 78);
                beVar.bg(1616356072);
                beVar.bu(16, 16, -1246235450);
                beVar.bc(false, 2125073564);
                if (-1 != aq.cc * 335744487) {
                    esVar.aw(eeVar2, 0, 0, 16711935);
                }
                int i8 = aq.ab * 1131009745;
                if (z) {
                    i8 = (int) (((double) i8) * 1.5d);
                } else if (2 == i3) {
                    i8 = (int) (((double) i8) * 1.04d);
                }
                int i9 = bl.aa[aq.av * -982903351];
                int i10 = bl.ao[aq.av * -982903351];
                as.ai();
                aq3.ad(as, 0, aq.at * 1504316109, aq.bk * 2098879407, aq.av * -982903351, aq.ba * 1131163891, (((i9 * i8) >> 16) + ((as.bx * -1736982785) / 2)) + (aq.bs * -1844861847), (aq.bs * -1844861847) + ((i8 * i10) >> 16), 2146986393);
                if (aq.ce * -755438885 != -1) {
                    esVar.aw(eeVar2, 0, 0, 16711935);
                }
                if (i3 >= 1) {
                    eeVar3.ae(1);
                }
                if (i3 >= 2) {
                    eeVar3.ae(ViewCompat.MEASURED_SIZE_MASK);
                }
                if (i4 != 0) {
                    eeVar3.am(i4);
                }
                aw.bm(eeVar3.ad, 36, 32, 1789493307);
                if (-1 != aq.bp * 518600683) {
                    esVar.aw(eeVar2, 0, 0, 16711935);
                }
                if (1 == i5 || (i5 == 2 && aq.bm * -1954437925 == 1)) {
                    ax.ak(as.au(i2, -2040956550), 0, 9, 16776960, 1, esVar);
                    i7 = 0;
                } else {
                    i7 = 0;
                }
                while (i7 < eeVar3.ad.length) {
                    if (eeVar3.ad[i7] != 0) {
                        int[] iArr = eeVar3.ad;
                        iArr[i7] = iArr[i7] | ViewCompat.MEASURED_STATE_MASK;
                    }
                    i7++;
                }
                if (!z) {
                    az.ar(eeVar3, j);
                }
                return eeVar3;
            }
        }
        aq = aq2;
        as = aq.as(1, 662620823);
        if (as != null) {
        }
    }

    public static void cd(Collection collection) {
        collection.add(ap);
        collection.add(au);
        collection.add(az);
    }

    public static void cf() {
        az.al();
    }

    public static void cg() {
        az.al();
    }

    public static void ch() {
        az.al();
    }

    static final String cj(int i) {
        StringBuilder stringBuilder;
        if (i < 100000) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("<col=ffff00>");
            stringBuilder.append(i);
            stringBuilder.append("</col>");
            return stringBuilder.toString();
        } else if (i < 10000000) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("<col=ffffff>");
            stringBuilder.append(i / 1000);
            stringBuilder.append(go.gx);
            stringBuilder.append("</col>");
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("<col=00ff80>");
            stringBuilder.append(i / 1000000);
            stringBuilder.append(go.gy);
            stringBuilder.append("</col>");
            return stringBuilder.toString();
        }
    }

    public static void cl(Collection collection) {
        collection.add(ap);
        collection.add(au);
        collection.add(az);
    }

    static void co() {
        ap.al();
        au.al();
        az.al();
    }

    public static void cu(Collection collection) {
        collection.add(ap);
        collection.add(au);
        collection.add(az);
    }

    static final String cv(int i) {
        StringBuilder stringBuilder;
        if (i < -223918824) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("<col=ffff00>");
            stringBuilder.append(i);
            stringBuilder.append("</col>");
            return stringBuilder.toString();
        } else if (i < -2078352919) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("<col=ffffff>");
            stringBuilder.append(i / -262765421);
            stringBuilder.append(go.gx);
            stringBuilder.append("</col>");
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("<col=00ff80>");
            stringBuilder.append(i / -92105311);
            stringBuilder.append(go.gy);
            stringBuilder.append("</col>");
            return stringBuilder.toString();
        }
    }

    public static void cz(Collection collection) {
        collection.add(ap);
        collection.add(au);
        collection.add(az);
    }

    public static void dd() {
        az.al();
    }

    public static void dm(boolean z) {
        if (z != if.as) {
            ak.af(1966397562);
            if.as = z;
        }
    }

    public static void dt(boolean z) {
        if (z != if.as) {
            ak.af(160161643);
            if.as = z;
        }
    }

    public static void dv(boolean z) {
        if (z != if.as) {
            ak.af(494184710);
            if.as = z;
        }
    }

    public int aa(int i, int i2, int i3) {
        try {
            return pk.aq(this.cp, i, i2, 1446074127);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final bo ac(boolean z, int i) {
        int i2 = 0;
        try {
            int i3;
            int i4 = 1287943783 * this.be;
            int i5 = this.bj * -1338203881;
            if (z) {
                i4 = 867690477 * this.bh;
                i3 = 1356203233 * this.bt;
            } else {
                i3 = i5;
            }
            if (-1 == i4) {
                return null;
            }
            bo boVar;
            bo ad = bo.ad(da.ak, i4, 0);
            if (i3 != -1) {
                boVar = new bo(new bo[]{ad, bo.ad(da.ak, i3, 0)}, 2);
            } else {
                boVar = ad;
            }
            if (this.ah != null) {
                for (i4 = 0; i4 < this.ah.length; i4++) {
                    boVar.au(this.ah[i4], this.af[i4]);
                }
            }
            if (this.ay == null) {
                return boVar;
            }
            while (i2 < this.ay.length) {
                boVar.az(this.ay[i2], this.an[i2]);
                i2++;
            }
            return boVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(dh dhVar, dh dhVar2, byte b) {
        try {
            this.aa = dhVar.aa * 1;
            this.ab = dhVar.ab * 1;
            this.av = dhVar.av * 1;
            this.at = dhVar.at * 1;
            this.bk = dhVar.bk * 1;
            this.ba = dhVar.ba * 1;
            this.bs = dhVar.bs * 1;
            this.ah = dhVar2.ah;
            this.af = dhVar2.af;
            this.ay = dhVar2.ay;
            this.an = dhVar2.an;
            this.ao = dhVar2.ao;
            this.bd = dhVar2.bd;
            this.bm = dhVar2.bm * 1;
            this.bi = dhVar2.bi * 1;
            this.bc = dhVar2.bc * 1;
            this.bw = dhVar2.bw * 1;
            this.bg = dhVar2.bg * 1;
            this.bx = dhVar2.bx * 1;
            this.br = dhVar2.br * 1;
            this.be = dhVar2.be * 1;
            this.bj = dhVar2.bj * 1;
            this.bh = dhVar2.bh * 1;
            this.bt = dhVar2.bt * 1;
            this.cw = dhVar2.cw * 1;
            this.bo = dhVar2.bo;
            this.bl = new String[5];
            if (dhVar2.bl != null) {
                for (int i = 0; i < 4; i++) {
                    this.bl[i] = dhVar2.bl[i];
                }
            }
            this.bl[4] = go.am;
            this.bq = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public dh ag(int i, byte b) {
        try {
            if (this.bn == null || i <= 1) {
                return this;
            }
            int i2 = 0;
            int i3 = -1;
            while (i2 < 10) {
                if (i >= this.bz[i2] && this.bz[i2] != 0) {
                    i3 = this.bn[i2];
                }
                i2++;
            }
            return -1 != i3 ? gl.aq(i3, -1091197627) : this;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ah(int i) {
        int i2 = 4;
        try {
            if (this.bb * -516212731 == -1 || this.bl == null) {
                return -1;
            }
            if (this.bb * -516212731 >= 0) {
                return this.bl[this.bb * -516212731] != null ? this.bb * -516212731 : -1;
            } else {
                if (!go.ar.equalsIgnoreCase(this.bl[4])) {
                    i2 = -1;
                }
                return i2;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(dh dhVar, dh dhVar2, int i) {
        try {
            this.aa = dhVar.aa * 1;
            this.ab = dhVar.ab * 1;
            this.av = dhVar.av * 1;
            this.at = dhVar.at * 1;
            this.bk = dhVar.bk * 1;
            this.ba = dhVar.ba * 1;
            this.bs = dhVar.bs * 1;
            this.ah = dhVar.ah;
            this.af = dhVar.af;
            this.ay = dhVar.ay;
            this.an = dhVar.an;
            this.ao = dhVar2.ao;
            this.bd = dhVar2.bd;
            this.bq = dhVar2.bq * 1;
            this.bm = -82987181;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(lj ljVar, int i, byte b) {
        int i2 = 0;
        int i3;
        if (i == 1) {
            try {
                this.aa = ljVar.an(-1464407032) * 136411681;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dh.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (2 == i) {
            this.ao = ljVar.bm(1219018625);
        } else if (i == 4) {
            this.ab = ljVar.an(-1464407032) * 1755071025;
        } else if (i == 5) {
            this.av = ljVar.an(-1464407032) * -504884103;
        } else if (i == 6) {
            this.at = ljVar.an(-1464407032) * -145165819;
        } else if (i == 7) {
            this.ba = ljVar.an(-1464407032) * -1332058053;
            if (this.ba * 1131163891 > 32767) {
                this.ba -= 1748697088;
            }
        } else if (i == 8) {
            this.bs = ljVar.an(-1464407032) * 1053174745;
            if (this.bs * -1844861847 > 32767) {
                this.bs -= 735641600;
            }
        } else if (i == 11) {
            this.bm = -82987181;
        } else if (12 == i) {
            this.bq = ljVar.at((byte) -75) * 386551519;
        } else if (16 == i) {
            this.bd = true;
        } else if (i == 23) {
            this.bi = ljVar.an(-1464407032) * -354000419;
            this.bv = ljVar.af(1804771424) * 897785727;
        } else if (24 == i) {
            this.bc = ljVar.an(-1464407032) * -1988999309;
        } else if (i == 25) {
            this.bg = ljVar.an(-1464407032) * -424876299;
            this.bu = ljVar.af(1804771424) * -890797903;
        } else if (i == 26) {
            this.bx = ljVar.an(-1464407032) * 1956068183;
        } else if (i >= 30 && i < 35) {
            i3 = i - 30;
            this.bo[i3] = ljVar.bm(1196780259);
            if (this.bo[i3].equalsIgnoreCase(go.al)) {
                this.bo[i3] = null;
            }
        } else if (i >= 35 && i < 40) {
            this.bl[i - 35] = ljVar.bm(1673889100);
        } else if (i == 40) {
            i3 = ljVar.af(1804771424);
            this.ah = new short[i3];
            this.af = new short[i3];
            while (i2 < i3) {
                this.ah[i2] = (short) ljVar.an(-1464407032);
                this.af[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i == 41) {
            i3 = ljVar.af(1804771424);
            this.ay = new short[i3];
            this.an = new short[i3];
            while (i2 < i3) {
                this.ay[i2] = (short) ljVar.an(-1464407032);
                this.an[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (42 == i) {
            this.bb = ljVar.ay(-200581653) * 1802556621;
        } else if (i == 65) {
            this.ci = true;
        } else if (i == 78) {
            this.bw = ljVar.an(-1464407032) * 712131791;
        } else if (79 == i) {
            this.br = ljVar.an(-1464407032) * 585725397;
        } else if (90 == i) {
            this.be = ljVar.an(-1464407032) * 2027832663;
        } else if (i == 91) {
            this.bh = ljVar.an(-1464407032) * -2134864411;
        } else if (i == 92) {
            this.bj = ljVar.an(-1464407032) * -1162697049;
        } else if (93 == i) {
            this.bt = ljVar.an(-1464407032) * 1509310241;
        } else if (95 == i) {
            this.bk = ljVar.an(-1464407032) * -1086203057;
        } else if (97 == i) {
            this.by = ljVar.an(-1464407032) * -1544198247;
        } else if (98 == i) {
            this.bp = ljVar.an(-1464407032) * 798832835;
        } else if (i >= 100 && i < 110) {
            if (this.bn == null) {
                this.bn = new int[10];
                this.bz = new int[10];
            }
            i3 = i - 100;
            this.bn[i3] = ljVar.an(-1464407032);
            this.bz[i3] = ljVar.an(-1464407032);
        } else if (110 == i) {
            this.cv = ljVar.an(-1464407032) * 1986632647;
        } else if (i == 111) {
            this.cj = ljVar.an(-1464407032) * 1074701731;
        } else if (i == 112) {
            this.cm = ljVar.an(-1464407032) * 70256401;
        } else if (113 == i) {
            this.cq = ljVar.ay(2020560697) * -1085728567;
        } else if (114 == i) {
            this.cn = ljVar.ay(90358775) * -1048355905;
        } else if (115 == i) {
            this.cw = ljVar.af(1804771424) * 1958330299;
        } else if (i == 139) {
            this.cb = ljVar.an(-1464407032) * -2039351195;
        } else if (i == 140) {
            this.ce = ljVar.an(-1464407032) * 1618149715;
        } else if (148 == i) {
            this.cy = ljVar.an(-1464407032) * 538194649;
        } else if (149 == i) {
            this.cc = ljVar.an(-1464407032) * -785533481;
        } else if (249 == i) {
            this.cp = af.ad(ljVar, this.cp, (byte) 1);
        }
    }

    public final bo ak(int i, int i2) {
        int i3 = 0;
        try {
            int i4;
            if (this.bn != null && i > 1) {
                int i5 = -1;
                i4 = 0;
                while (i4 < 10) {
                    if (i >= this.bz[i4] && this.bz[i4] != 0) {
                        i5 = this.bn[i4];
                    }
                    i4++;
                }
                if (-1 != i5) {
                    return gl.aq(i5, -1964973604).ak(1, -882577200);
                }
            }
            bo ad = bo.ad(da.ak, this.aa * 423135713, 0);
            if (ad == null) {
                return null;
            }
            if (!(this.cv * -581847561 == 128 && this.cj * -876628469 == 128 && 128 == this.cm * -412235279)) {
                ad.aw(this.cv * -581847561, this.cj * -876628469, this.cm * -412235279);
            }
            if (this.ah != null) {
                for (i4 = 0; i4 < this.ah.length; i4++) {
                    ad.au(this.ah[i4], this.af[i4]);
                }
            }
            if (this.ay == null) {
                return ad;
            }
            while (i3 < this.ay.length) {
                ad.az(this.ay[i3], this.an[i3]);
                i3++;
            }
            return ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    aj(ljVar, af, (byte) -8);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dh.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void am(dh dhVar, dh dhVar2, int i) {
        try {
            this.aa = dhVar.aa * 1;
            this.ab = dhVar.ab * 1;
            this.av = dhVar.av * 1;
            this.at = dhVar.at * 1;
            this.bk = dhVar.bk * 1;
            this.ba = dhVar.ba * 1;
            this.bs = dhVar.bs * 1;
            this.ah = dhVar.ah;
            this.af = dhVar.af;
            this.ay = dhVar.ay;
            this.an = dhVar.an;
            this.bm = dhVar.bm * 1;
            this.ao = dhVar2.ao;
            this.bq = 0;
            this.bd = false;
            this.ci = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String ao(int i, String str, int i2) {
        try {
            return dt.ar(this.cp, i, str, 2122732708);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(byte b) {
    }

    public final bp as(int i, int i2) {
        int i3 = 0;
        try {
            int i4;
            if (this.bn != null && i > 1) {
                int i5 = -1;
                i4 = 0;
                while (i4 < 10) {
                    if (i >= this.bz[i4] && this.bz[i4] != 0) {
                        i5 = this.bn[i4];
                    }
                    i4++;
                }
                if (-1 != i5) {
                    return gl.aq(i5, -938675525).as(1, 712209455);
                }
            }
            bp bpVar = (bp) au.ad((long) (this.ac * -1129192407));
            if (bpVar != null) {
                return bpVar;
            }
            bo ad = bo.ad(da.ak, this.aa * 423135713, 0);
            if (ad == null) {
                return null;
            }
            if (!(this.cv * -581847561 == 128 && 128 == this.cj * -876628469 && this.cm * -412235279 == 128)) {
                ad.aw(this.cv * -581847561, this.cj * -876628469, this.cm * -412235279);
            }
            if (this.ah != null) {
                for (i4 = 0; i4 < this.ah.length; i4++) {
                    ad.au(this.ah[i4], this.af[i4]);
                }
            }
            if (this.ay != null) {
                while (i3 < this.ay.length) {
                    ad.az(this.ay[i3], this.an[i3]);
                    i3++;
                }
            }
            bpVar = ad.af((this.cq * 709263737) + 64, (this.cn * -1537678021) + ox.aj, -50, -10, -50);
            bpVar.bs = true;
            au.ar(bpVar, (long) (this.ac * -1129192407));
            return bpVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final boolean aw(boolean z, int i) {
        boolean z2 = true;
        try {
            int i2 = this.be * 1287943783;
            int i3 = this.bj * -1338203881;
            if (z) {
                i2 = this.bh * 867690477;
                i3 = this.bt * 1356203233;
            }
            if (-1 == i2) {
                return true;
            }
            if (!da.ak.aj(i2, 0, -90441909)) {
                z2 = false;
            }
            return (-1 == i3 || da.ak.aj(i3, 0, -1265183706)) ? z2 : false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final bo ax(boolean z, int i) {
        int i2 = 0;
        try {
            int i3;
            int i4 = this.bi * -364052875;
            int i5 = this.bc * -1885784645;
            int i6 = this.bw * -1372044753;
            if (z) {
                i4 = this.bg * -1601825443;
                i5 = 750641255 * this.bx;
                i3 = -398189699 * this.br;
            } else {
                i3 = i6;
            }
            if (i4 == -1) {
                return null;
            }
            bo boVar;
            bo ad = bo.ad(da.ak, i4, 0);
            if (i5 != -1) {
                bo ad2 = bo.ad(da.ak, i5, 0);
                if (i3 != -1) {
                    boVar = new bo(new bo[]{ad, ad2, bo.ad(da.ak, i3, 0)}, 3);
                } else {
                    boVar = new bo(new bo[]{ad, ad2}, 2);
                }
            } else {
                boVar = ad;
            }
            if (!(z || this.bv * 566009983 == 0)) {
                boVar.ap(0, this.bv * 566009983, 0);
            }
            if (z && this.bu * 823576657 != 0) {
                boVar.ap(0, this.bu * 823576657, 0);
            }
            if (this.ah != null) {
                for (i6 = 0; i6 < this.ah.length; i6++) {
                    boVar.au(this.ah[i6], this.af[i6]);
                }
            }
            if (this.ay == null) {
                return boVar;
            }
            while (i2 < this.ay.length) {
                boVar.az(this.ay[i2], this.an[i2]);
                i2++;
            }
            return boVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final boolean az(boolean z, int i) {
        boolean z2 = true;
        try {
            int i2 = this.bi * -364052875;
            int i3 = -1885784645 * this.bc;
            int i4 = this.bw * -1372044753;
            if (z) {
                i2 = this.bg * -1601825443;
                i3 = 750641255 * this.bx;
                i4 = this.br * -398189699;
            }
            if (i2 == -1) {
                return true;
            }
            if (!da.ak.aj(i2, 0, 1948182325)) {
                z2 = false;
            }
            if (!(-1 == i3 || da.ak.aj(i3, 0, -265361650))) {
                z2 = false;
            }
            return (-1 == i4 || da.ak.aj(i4, 0, 1806009042)) ? z2 : false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dh.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ba() {
    }

    /* Access modifiers changed, original: 0000 */
    public void bb(lj ljVar, int i) {
        int i2 = 0;
        int i3;
        if (i == 1) {
            this.aa = ljVar.an(-1464407032) * 136411681;
        } else if (2 == i) {
            this.ao = ljVar.bm(1646073277);
        } else if (i == 4) {
            this.ab = ljVar.an(-1464407032) * 1755071025;
        } else if (i == 5) {
            this.av = ljVar.an(-1464407032) * -504884103;
        } else if (i == 6) {
            this.at = ljVar.an(-1464407032) * -145165819;
        } else if (i == 7) {
            this.ba = ljVar.an(-1464407032) * -1332058053;
            if (this.ba * 1131163891 > 32767) {
                this.ba -= 1748697088;
            }
        } else if (i == 8) {
            this.bs = ljVar.an(-1464407032) * 1053174745;
            if (this.bs * -1844861847 > 32767) {
                this.bs -= 735641600;
            }
        } else if (i == 11) {
            this.bm = -82987181;
        } else if (12 == i) {
            this.bq = ljVar.at((byte) -75) * 386551519;
        } else if (16 == i) {
            this.bd = true;
        } else if (i == 23) {
            this.bi = ljVar.an(-1464407032) * -354000419;
            this.bv = ljVar.af(1804771424) * 897785727;
        } else if (24 == i) {
            this.bc = ljVar.an(-1464407032) * -1988999309;
        } else if (i == 25) {
            this.bg = ljVar.an(-1464407032) * -424876299;
            this.bu = ljVar.af(1804771424) * -890797903;
        } else if (i == 26) {
            this.bx = ljVar.an(-1464407032) * 1956068183;
        } else if (i >= 30 && i < 35) {
            i3 = i - 30;
            this.bo[i3] = ljVar.bm(1016478690);
            if (this.bo[i3].equalsIgnoreCase(go.al)) {
                this.bo[i3] = null;
            }
        } else if (i >= 35 && i < 40) {
            this.bl[i - 35] = ljVar.bm(1215706018);
        } else if (i == 40) {
            i3 = ljVar.af(1804771424);
            this.ah = new short[i3];
            this.af = new short[i3];
            while (i2 < i3) {
                this.ah[i2] = (short) ljVar.an(-1464407032);
                this.af[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i == 41) {
            i3 = ljVar.af(1804771424);
            this.ay = new short[i3];
            this.an = new short[i3];
            while (i2 < i3) {
                this.ay[i2] = (short) ljVar.an(-1464407032);
                this.an[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (42 == i) {
            this.bb = ljVar.ay(468644323) * 1802556621;
        } else if (i == 65) {
            this.ci = true;
        } else if (i == 78) {
            this.bw = ljVar.an(-1464407032) * 712131791;
        } else if (79 == i) {
            this.br = ljVar.an(-1464407032) * 585725397;
        } else if (90 == i) {
            this.be = ljVar.an(-1464407032) * 2027832663;
        } else if (i == 91) {
            this.bh = ljVar.an(-1464407032) * -2134864411;
        } else if (i == 92) {
            this.bj = ljVar.an(-1464407032) * -1162697049;
        } else if (93 == i) {
            this.bt = ljVar.an(-1464407032) * 1509310241;
        } else if (95 == i) {
            this.bk = ljVar.an(-1464407032) * -1086203057;
        } else if (97 == i) {
            this.by = ljVar.an(-1464407032) * -1544198247;
        } else if (98 == i) {
            this.bp = ljVar.an(-1464407032) * 798832835;
        } else if (i >= 100 && i < 110) {
            if (this.bn == null) {
                this.bn = new int[10];
                this.bz = new int[10];
            }
            i3 = i - 100;
            this.bn[i3] = ljVar.an(-1464407032);
            this.bz[i3] = ljVar.an(-1464407032);
        } else if (110 == i) {
            this.cv = ljVar.an(-1464407032) * 1986632647;
        } else if (i == 111) {
            this.cj = ljVar.an(-1464407032) * 1074701731;
        } else if (i == 112) {
            this.cm = ljVar.an(-1464407032) * 70256401;
        } else if (113 == i) {
            this.cq = ljVar.ay(-1174594967) * -1085728567;
        } else if (114 == i) {
            this.cn = ljVar.ay(-1193408266) * -1048355905;
        } else if (115 == i) {
            this.cw = ljVar.af(1804771424) * 1958330299;
        } else if (i == 139) {
            this.cb = ljVar.an(-1464407032) * -2039351195;
        } else if (i == 140) {
            this.ce = ljVar.an(-1464407032) * 1618149715;
        } else if (148 == i) {
            this.cy = ljVar.an(-1464407032) * 538194649;
        } else if (149 == i) {
            this.cc = ljVar.an(-1464407032) * -785533481;
        } else if (249 == i) {
            this.cp = af.ad(ljVar, this.cp, (byte) 1);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bc(dh dhVar, dh dhVar2) {
        this.aa = dhVar.aa * 1;
        this.ab = dhVar.ab * 1;
        this.av = dhVar.av * 1;
        this.at = dhVar.at * 1;
        this.bk = dhVar.bk * 1;
        this.ba = dhVar.ba * 1;
        this.bs = dhVar.bs * 1;
        this.ah = dhVar.ah;
        this.af = dhVar.af;
        this.ay = dhVar.ay;
        this.an = dhVar.an;
        this.ao = dhVar2.ao;
        this.bd = dhVar2.bd;
        this.bq = dhVar2.bq * 1;
        this.bm = -82987181;
    }

    /* Access modifiers changed, original: 0000 */
    public void bd() {
    }

    /* Access modifiers changed, original: 0000 */
    public void be(dh dhVar, dh dhVar2) {
        this.aa = dhVar.aa * 1;
        this.ab = dhVar.ab * 1;
        this.av = dhVar.av * 1;
        this.at = dhVar.at * 1;
        this.bk = dhVar.bk * 1;
        this.ba = dhVar.ba * 1;
        this.bs = dhVar.bs * 1;
        this.ah = dhVar.ah;
        this.af = dhVar.af;
        this.ay = dhVar.ay;
        this.an = dhVar.an;
        this.bm = dhVar.bm * 1;
        this.ao = dhVar2.ao;
        this.bq = 0;
        this.bd = false;
        this.ci = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void bf(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, (byte) -37);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bg(dh dhVar, dh dhVar2) {
        this.aa = dhVar.aa * 1;
        this.ab = dhVar.ab * 1;
        this.av = dhVar.av * 1;
        this.at = dhVar.at * 1;
        this.bk = dhVar.bk * 1;
        this.ba = dhVar.ba * 1;
        this.bs = dhVar.bs * 1;
        this.ah = dhVar.ah;
        this.af = dhVar.af;
        this.ay = dhVar.ay;
        this.an = dhVar.an;
        this.ao = dhVar2.ao;
        this.bd = dhVar2.bd;
        this.bq = dhVar2.bq * 1;
        this.bm = 1644111663;
    }

    public final bo bh(int i) {
        int i2;
        int i3 = 0;
        if (this.bn != null && i > 1) {
            i2 = -1;
            int i4 = 0;
            while (i4 < 10) {
                if (i >= this.bz[i4] && this.bz[i4] != 0) {
                    i2 = this.bn[i4];
                }
                i4++;
            }
            if (-1 != i2) {
                return gl.aq(i2, -987295856).ak(1, -885568509);
            }
        }
        bo ad = bo.ad(da.ak, this.aa * -130136239, 0);
        if (ad == null) {
            return null;
        }
        if (!(this.cv * -581847561 == -1024601985 && this.cj * 853772526 == 1251482364 && 853551960 == this.cm * -412235279)) {
            ad.aw(this.cv * 1511698931, this.cj * -876628469, this.cm * -2118408651);
        }
        if (this.ah != null) {
            for (i2 = 0; i2 < this.ah.length; i2++) {
                ad.au(this.ah[i2], this.af[i2]);
            }
        }
        if (this.ay != null) {
            while (i3 < this.ay.length) {
                ad.az(this.ay[i3], this.an[i3]);
                i3++;
            }
        }
        return ad;
    }

    /* Access modifiers changed, original: 0000 */
    public void bi(lj ljVar, int i) {
        int i2 = 0;
        int i3;
        if (i == 1) {
            this.aa = ljVar.an(-1464407032) * 136411681;
        } else if (2 == i) {
            this.ao = ljVar.bm(1555422101);
        } else if (i == 4) {
            this.ab = ljVar.an(-1464407032) * 1755071025;
        } else if (i == 5) {
            this.av = ljVar.an(-1464407032) * -504884103;
        } else if (i == 6) {
            this.at = ljVar.an(-1464407032) * -145165819;
        } else if (i == 7) {
            this.ba = ljVar.an(-1464407032) * -1332058053;
            if (this.ba * 613440132 > 32767) {
                this.ba -= 1748697088;
            }
        } else if (i == 8) {
            this.bs = ljVar.an(-1464407032) * 1053174745;
            if (this.bs * -1961595226 > 32767) {
                this.bs -= 735641600;
            }
        } else if (i == 11) {
            this.bm = -82987181;
        } else if (12 == i) {
            this.bq = ljVar.at((byte) -113) * -1481481613;
        } else if (16 == i) {
            this.bd = true;
        } else if (i == 23) {
            this.bi = ljVar.an(-1464407032) * -750510127;
            this.bv = ljVar.af(1804771424) * 897785727;
        } else if (24 == i) {
            this.bc = ljVar.an(-1464407032) * -1988999309;
        } else if (i == 25) {
            this.bg = ljVar.an(-1464407032) * -1524096522;
            this.bu = ljVar.af(1804771424) * -890797903;
        } else if (i == 26) {
            this.bx = ljVar.an(-1464407032) * 1227228957;
        } else if (i >= 30 && i < -1826735765) {
            i3 = i - 30;
            this.bo[i3] = ljVar.bm(1286270685);
            if (this.bo[i3].equalsIgnoreCase(go.al)) {
                this.bo[i3] = null;
            }
        } else if (i >= -1978500423 && i < 40) {
            this.bl[i - 35] = ljVar.bm(2009074767);
        } else if (i == 1317749454) {
            i3 = ljVar.af(1804771424);
            this.ah = new short[i3];
            this.af = new short[i3];
            while (i2 < i3) {
                this.ah[i2] = (short) ljVar.an(-1464407032);
                this.af[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i == 1372967613) {
            i3 = ljVar.af(1804771424);
            this.ay = new short[i3];
            this.an = new short[i3];
            while (i2 < i3) {
                this.ay[i2] = (short) ljVar.an(-1464407032);
                this.an[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (42 == i) {
            this.bb = ljVar.ay(-1485033310) * 1802556621;
        } else if (i == -473881885) {
            this.ci = true;
        } else if (i == 1676424239) {
            this.bw = ljVar.an(-1464407032) * -834029031;
        } else if (79 == i) {
            this.br = ljVar.an(-1464407032) * -907752935;
        } else if (-1526631238 == i) {
            this.be = ljVar.an(-1464407032) * -567873046;
        } else if (i == 1743534168) {
            this.bh = ljVar.an(-1464407032) * -2134864411;
        } else if (i == 92) {
            this.bj = ljVar.an(-1464407032) * 2041387181;
        } else if (93 == i) {
            this.bt = ljVar.an(-1464407032) * 1509310241;
        } else if (1015971959 == i) {
            this.bk = ljVar.an(-1464407032) * -1086203057;
        } else if (-503529219 == i) {
            this.by = ljVar.an(-1464407032) * -1057484981;
        } else if (98 == i) {
            this.bp = ljVar.an(-1464407032) * 798832835;
        } else if (i >= 1343706260 && i < -792968435) {
            if (this.bn == null) {
                this.bn = new int[10];
                this.bz = new int[10];
            }
            this.bn[1836311889 + i] = ljVar.an(-1464407032);
            this.bz[i - 100] = ljVar.an(-1464407032);
        } else if (110 == i) {
            this.cv = ljVar.an(-1464407032) * 1986632647;
        } else if (i == 111) {
            this.cj = ljVar.an(-1464407032) * 1074701731;
        } else if (i == 112) {
            this.cm = ljVar.an(-1464407032) * 519016595;
        } else if (1924546917 == i) {
            this.cq = ljVar.ay(-683513015) * -1085728567;
        } else if (114 == i) {
            this.cn = ljVar.ay(1592228159) * -59309209;
        } else if (115 == i) {
            this.cw = ljVar.af(1804771424) * -1881990211;
        } else if (i == 1102035561) {
            this.cb = ljVar.an(-1464407032) * -2039351195;
        } else if (i == 140) {
            this.ce = ljVar.an(-1464407032) * 152166636;
        } else if (148 == i) {
            this.cy = ljVar.an(-1464407032) * -866075399;
        } else if (149 == i) {
            this.cc = ljVar.an(-1464407032) * -785533481;
        } else if (249 == i) {
            this.cp = af.ad(ljVar, this.cp, (byte) 1);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bj(dh dhVar, dh dhVar2) {
        this.aa = dhVar.aa * 1;
        this.ab = dhVar.ab * 1;
        this.av = dhVar.av * 1;
        this.at = dhVar.at * 1;
        this.bk = dhVar.bk * 1;
        this.ba = dhVar.ba * 1;
        this.bs = dhVar.bs * 1;
        this.ah = dhVar.ah;
        this.af = dhVar.af;
        this.ay = dhVar.ay;
        this.an = dhVar.an;
        this.bm = dhVar.bm * 1;
        this.ao = dhVar2.ao;
        this.bq = 0;
        this.bd = false;
        this.ci = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, (byte) -57);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bm() {
    }

    public dh bn(int i) {
        if (this.bn == null || i <= 1) {
            return this;
        }
        int i2 = 0;
        int i3 = -1;
        while (i2 < 10) {
            if (i >= this.bz[i2] && this.bz[i2] != 0) {
                i3 = this.bn[i2];
            }
            i2++;
        }
        return -1 != i3 ? gl.aq(i3, 57750680) : this;
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, (byte) -93);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bq() {
    }

    /* Access modifiers changed, original: 0000 */
    public void br(dh dhVar, dh dhVar2) {
        this.aa = dhVar.aa * 1;
        this.ab = dhVar.ab * 1;
        this.av = dhVar.av * 1;
        this.at = dhVar.at * 1;
        this.bk = dhVar.bk * 1;
        this.ba = dhVar.ba * 1;
        this.bs = dhVar.bs * 1;
        this.ah = dhVar2.ah;
        this.af = dhVar2.af;
        this.ay = dhVar2.ay;
        this.an = dhVar2.an;
        this.ao = dhVar2.ao;
        this.bd = dhVar2.bd;
        this.bm = dhVar2.bm * 1;
        this.bi = dhVar2.bi * 1;
        this.bc = dhVar2.bc * 1;
        this.bw = dhVar2.bw * 1;
        this.bg = dhVar2.bg * 1;
        this.bx = dhVar2.bx * 1;
        this.br = dhVar2.br * 1;
        this.be = dhVar2.be * 1;
        this.bj = dhVar2.bj * 1;
        this.bh = dhVar2.bh * 1;
        this.bt = dhVar2.bt * 1;
        this.cw = dhVar2.cw * 1;
        this.bo = dhVar2.bo;
        this.bl = new String[5];
        if (dhVar2.bl != null) {
            for (int i = 0; i < 4; i++) {
                this.bl[i] = dhVar2.bl[i];
            }
        }
        this.bl[4] = go.am;
        this.bq = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bs() {
    }

    public final bp bt(int i) {
        int i2;
        int i3 = 0;
        if (this.bn != null && i > 1) {
            int i4 = -1;
            i2 = 0;
            while (i2 < 10) {
                if (i >= this.bz[i2] && this.bz[i2] != 0) {
                    i4 = this.bn[i2];
                }
                i2++;
            }
            if (-1 != i4) {
                return gl.aq(i4, -2097666115).as(1, -1668624812);
            }
        }
        bp bpVar = (bp) au.ad((long) (this.ac * -1129192407));
        if (bpVar != null) {
            return bpVar;
        }
        bo ad = bo.ad(da.ak, this.aa * 423135713, 0);
        if (ad == null) {
            return null;
        }
        if (!(this.cv * -581847561 == 128 && 128 == this.cj * -876628469 && this.cm * -412235279 == 128)) {
            ad.aw(this.cv * -581847561, this.cj * -876628469, this.cm * -412235279);
        }
        if (this.ah != null) {
            for (i2 = 0; i2 < this.ah.length; i2++) {
                ad.au(this.ah[i2], this.af[i2]);
            }
        }
        if (this.ay != null) {
            while (i3 < this.ay.length) {
                ad.az(this.ay[i3], this.an[i3]);
                i3++;
            }
        }
        bpVar = ad.af((this.cq * 709263737) + 64, (this.cn * -1537678021) + ox.aj, -50, -10, -50);
        bpVar.bs = true;
        au.ar(bpVar, (long) (this.ac * -1129192407));
        return bpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void bu(dh dhVar, dh dhVar2) {
        this.aa = dhVar.aa * 1;
        this.ab = dhVar.ab * 1;
        this.av = dhVar.av * 1;
        this.at = dhVar.at * 1;
        this.bk = dhVar.bk * 1;
        this.ba = dhVar.ba * 1;
        this.bs = dhVar.bs * 1;
        this.ah = dhVar2.ah;
        this.af = dhVar2.af;
        this.ay = dhVar2.ay;
        this.an = dhVar2.an;
        this.ao = dhVar2.ao;
        this.bd = dhVar2.bd;
        this.bm = dhVar2.bm * 1;
        this.bi = dhVar2.bi * 1;
        this.bc = dhVar2.bc * 1;
        this.bw = dhVar2.bw * 1;
        this.bg = dhVar2.bg * 1;
        this.bx = dhVar2.bx * 1;
        this.br = dhVar2.br * 1;
        this.be = dhVar2.be * 1;
        this.bj = dhVar2.bj * 1;
        this.bh = dhVar2.bh * 1;
        this.bt = dhVar2.bt * 1;
        this.cw = dhVar2.cw * 1;
        this.bo = dhVar2.bo;
        this.bl = new String[5];
        if (dhVar2.bl != null) {
            for (int i = 0; i < 4; i++) {
                this.bl[i] = dhVar2.bl[i];
            }
        }
        this.bl[4] = go.am;
        this.bq = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bv(dh dhVar, dh dhVar2) {
        this.aa = dhVar.aa * 1;
        this.ab = dhVar.ab * 1;
        this.av = dhVar.av * 1;
        this.at = dhVar.at * 1;
        this.bk = dhVar.bk * 1;
        this.ba = dhVar.ba * 1;
        this.bs = dhVar.bs * 1;
        this.ah = dhVar.ah;
        this.af = dhVar.af;
        this.ay = dhVar.ay;
        this.an = dhVar.an;
        this.ao = dhVar2.ao;
        this.bd = dhVar2.bd;
        this.bq = dhVar2.bq * 1;
        this.bm = -82987181;
    }

    /* Access modifiers changed, original: 0000 */
    public void bw(dh dhVar, dh dhVar2) {
        this.aa = dhVar.aa * 1;
        this.ab = dhVar.ab * 1;
        this.av = dhVar.av * 1;
        this.at = dhVar.at * 1;
        this.bk = dhVar.bk * 1;
        this.ba = dhVar.ba * 1;
        this.bs = dhVar.bs * 1;
        this.ah = dhVar2.ah;
        this.af = dhVar2.af;
        this.ay = dhVar2.ay;
        this.an = dhVar2.an;
        this.ao = dhVar2.ao;
        this.bd = dhVar2.bd;
        this.bm = dhVar2.bm * 1;
        this.bi = dhVar2.bi * 1;
        this.bc = dhVar2.bc * 1;
        this.bw = dhVar2.bw * 1;
        this.bg = dhVar2.bg * 1;
        this.bx = dhVar2.bx * 1;
        this.br = dhVar2.br * 1;
        this.be = dhVar2.be * 1;
        this.bj = dhVar2.bj * 1;
        this.bh = dhVar2.bh * 1;
        this.bt = dhVar2.bt * 1;
        this.cw = dhVar2.cw * 1;
        this.bo = dhVar2.bo;
        this.bl = new String[5];
        if (dhVar2.bl != null) {
            for (int i = 0; i < 4; i++) {
                this.bl[i] = dhVar2.bl[i];
            }
        }
        this.bl[4] = go.am;
        this.bq = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bx(dh dhVar, dh dhVar2) {
        this.aa = dhVar.aa * 1;
        this.ab = dhVar.ab * 1;
        this.av = dhVar.av * 1;
        this.at = dhVar.at * 1;
        this.bk = dhVar.bk * 1;
        this.ba = dhVar.ba * 1;
        this.bs = dhVar.bs * 1;
        this.ah = dhVar.ah;
        this.af = dhVar.af;
        this.ay = dhVar.ay;
        this.an = dhVar.an;
        this.ao = dhVar2.ao;
        this.bd = dhVar2.bd;
        this.bq = dhVar2.bq * 1;
        this.bm = -82987181;
    }

    public dh by(int i) {
        if (this.bn == null || i <= 1) {
            return this;
        }
        int i2 = 0;
        int i3 = -1;
        while (i2 < 10) {
            if (i >= this.bz[i2] && this.bz[i2] != 0) {
                i3 = this.bn[i2];
            }
            i2++;
        }
        return -1 != i3 ? gl.aq(i3, -492476575) : this;
    }

    public dh bz(int i) {
        if (this.bn == null || i <= 1) {
            return this;
        }
        int i2 = 0;
        int i3 = -1;
        while (i2 < 10) {
            if (i >= this.bz[i2] && this.bz[i2] != 0) {
                i3 = this.bn[i2];
            }
            i2++;
        }
        return -1 != i3 ? gl.aq(i3, 1984084084) : this;
    }

    public String ca(int i, String str) {
        return dt.ar(this.cp, i, str, 2122732708);
    }

    public final boolean cb(boolean z) {
        boolean z2 = true;
        int i = 1287943783 * this.be;
        int i2 = this.bj * -1338203881;
        if (z) {
            i = 867690477 * this.bh;
            i2 = this.bt * 1356203233;
        }
        if (-1 == i) {
            return true;
        }
        if (!da.ak.aj(i, 0, 1866088128)) {
            z2 = false;
        }
        return (-1 == i2 || da.ak.aj(i2, 0, 1159882659)) ? z2 : false;
    }

    public final bo cc(boolean z) {
        int i;
        int i2 = 0;
        int i3 = 1287943783 * this.be;
        int i4 = this.bj * -1338203881;
        if (z) {
            i3 = 867690477 * this.bh;
            i = 1356203233 * this.bt;
        } else {
            i = i4;
        }
        if (-1 == i3) {
            return null;
        }
        bo boVar;
        bo ad = bo.ad(da.ak, i3, 0);
        if (i != -1) {
            boVar = new bo(new bo[]{ad, bo.ad(da.ak, i, 0)}, 2);
        } else {
            boVar = ad;
        }
        if (this.ah != null) {
            for (i3 = 0; i3 < this.ah.length; i3++) {
                boVar.au(this.ah[i3], this.af[i3]);
            }
        }
        if (this.ay == null) {
            return boVar;
        }
        while (i2 < this.ay.length) {
            boVar.az(this.ay[i2], this.an[i2]);
            i2++;
        }
        return boVar;
    }

    public final boolean ce(boolean z) {
        boolean z2 = true;
        int i = 1436421204 * this.be;
        int i2 = this.bj * 787234334;
        if (z) {
            i = 867690477 * this.bh;
            i2 = this.bt * 1356203233;
        }
        if (-1 == i) {
            return true;
        }
        if (!da.ak.aj(i, 0, 550275178)) {
            z2 = false;
        }
        return (-1 == i2 || da.ak.aj(i2, 0, 566722875)) ? z2 : false;
    }

    public final boolean ci(boolean z) {
        int i;
        int i2 = this.be * 1287943783;
        int i3 = this.bj * -1338203881;
        if (z) {
            i2 = this.bh * 1551216838;
            i = this.bt * 1356203233;
        } else {
            i = i3;
        }
        if (-1 == i2) {
            return true;
        }
        return (-1 == i || da.ak.aj(i, 0, -372228223)) ? da.ak.aj(i2, 0, -742691590) : false;
    }

    public int ck() {
        return (this.bb * -516212731 == -1 || this.bl == null) ? -1 : this.bb * -516212731 >= 0 ? this.bl[this.bb * -516212731] != null ? this.bb * -516212731 : -1 : go.ar.equalsIgnoreCase(this.bl[4]) ? 4 : -1;
    }

    public final boolean cm(boolean z) {
        boolean z2 = true;
        int i = this.bi * -786581346;
        int i2 = this.bc * 147526599;
        int i3 = this.bw * -859437043;
        if (z) {
            i = this.bg * -234764679;
            i2 = this.bx * 750641255;
            i3 = this.br * -398189699;
        }
        if (i == -1) {
            return true;
        }
        if (!da.ak.aj(i, 0, -415591466)) {
            z2 = false;
        }
        if (!(-1 == i2 || da.ak.aj(i2, 0, -1099125847))) {
            z2 = false;
        }
        return (-1 == i3 || da.ak.aj(i3, 0, -1659637462)) ? z2 : false;
    }

    public final bo cn(boolean z) {
        int i;
        int i2 = 0;
        int i3 = this.bi * -364052875;
        int i4 = -1885784645 * this.bc;
        int i5 = this.bw * -1372044753;
        if (z) {
            i3 = this.bg * -1601825443;
            i4 = this.bx * 750641255;
            i = -398189699 * this.br;
        } else {
            i = i5;
        }
        if (i3 == -1) {
            return null;
        }
        bo boVar;
        bo ad = bo.ad(da.ak, i3, 0);
        if (i4 != -1) {
            bo ad2 = bo.ad(da.ak, i4, 0);
            if (i != -1) {
                boVar = new bo(new bo[]{ad, ad2, bo.ad(da.ak, i, 0)}, 3);
            } else {
                boVar = new bo(new bo[]{ad, ad2}, 2);
            }
        } else {
            boVar = ad;
        }
        if (!(z || this.bv * 566009983 == 0)) {
            boVar.ap(0, this.bv * 566009983, 0);
        }
        if (z && this.bu * 823576657 != 0) {
            boVar.ap(0, this.bu * 823576657, 0);
        }
        if (this.ah != null) {
            for (i5 = 0; i5 < this.ah.length; i5++) {
                boVar.au(this.ah[i5], this.af[i5]);
            }
        }
        if (this.ay != null) {
            while (i2 < this.ay.length) {
                boVar.az(this.ay[i2], this.an[i2]);
                i2++;
            }
        }
        return boVar;
    }

    public final boolean cp(boolean z) {
        boolean z2 = true;
        int i = 1287943783 * this.be;
        int i2 = this.bj * -1769044475;
        if (z) {
            i = 867690477 * this.bh;
            i2 = this.bt * 385897544;
        }
        if (-1 == i) {
            return true;
        }
        if (!da.ak.aj(i, 0, -1533292683)) {
            z2 = false;
        }
        return (-1 == i2 || da.ak.aj(i2, 0, -1585512817)) ? z2 : false;
    }

    public final bo cq(boolean z) {
        int i;
        int i2 = 0;
        int i3 = this.bi * 685170130;
        int i4 = -1885784645 * this.bc;
        int i5 = this.bw * -1935320423;
        if (z) {
            i3 = this.bg * -1601825443;
            i4 = this.bx * -1368177177;
            i = 2019422866 * this.br;
        } else {
            i = i5;
        }
        if (i3 == -1) {
            return null;
        }
        bo boVar;
        bo ad = bo.ad(da.ak, i3, 0);
        if (i4 != -1) {
            bo ad2 = bo.ad(da.ak, i4, 0);
            if (i != -1) {
                boVar = new bo(new bo[]{ad, ad2, bo.ad(da.ak, i, 0)}, 3);
            } else {
                boVar = new bo(new bo[]{ad, ad2}, 2);
            }
        } else {
            boVar = ad;
        }
        if (!(z || this.bv * 566009983 == 0)) {
            boVar.ap(0, this.bv * 566009983, 0);
        }
        if (z && this.bu * 251549580 != 0) {
            boVar.ap(0, this.bu * 823576657, 0);
        }
        if (this.ah != null) {
            for (i5 = 0; i5 < this.ah.length; i5++) {
                boVar.au(this.ah[i5], this.af[i5]);
            }
        }
        if (this.ay != null) {
            while (i2 < this.ay.length) {
                boVar.az(this.ay[i2], this.an[i2]);
                i2++;
            }
        }
        return boVar;
    }

    public String cr(int i, String str) {
        return dt.ar(this.cp, i, str, 2122732708);
    }

    public int cs(int i, int i2) {
        return pk.aq(this.cp, i, i2, 1700379473);
    }

    public int ct() {
        return (this.bb * -516212731 == -1 || this.bl == null) ? -1 : this.bb * -516212731 >= 0 ? this.bl[this.bb * -516212731] != null ? this.bb * 2062589293 : -1 : go.ar.equalsIgnoreCase(this.bl[4]) ? 4 : -1;
    }

    public final boolean cw(boolean z) {
        boolean z2 = true;
        int i = 1287943783 * this.be;
        int i2 = this.bj * 642911457;
        if (z) {
            i = 867690477 * this.bh;
            i2 = this.bt * 1356203233;
        }
        if (-1 == i) {
            return true;
        }
        if (!da.ak.aj(i, 0, 1203259143)) {
            z2 = false;
        }
        return (-1 == i2 || da.ak.aj(i2, 0, -72277892)) ? z2 : false;
    }

    public int cx() {
        return (this.bb * -516212731 == -1 || this.bl == null) ? -1 : this.bb * -516212731 >= 0 ? this.bl[this.bb * -516212731] != null ? this.bb * -516212731 : -1 : go.ar.equalsIgnoreCase(this.bl[4]) ? 4 : -1;
    }

    public final bo cy(boolean z) {
        int i;
        int i2 = 0;
        int i3 = 1287943783 * this.be;
        int i4 = this.bj * -1338203881;
        if (z) {
            i3 = 867690477 * this.bh;
            i = 1356203233 * this.bt;
        } else {
            i = i4;
        }
        if (-1 == i3) {
            return null;
        }
        bo boVar;
        bo ad = bo.ad(da.ak, i3, 0);
        if (i != -1) {
            boVar = new bo(new bo[]{ad, bo.ad(da.ak, i, 0)}, 2);
        } else {
            boVar = ad;
        }
        if (this.ah != null) {
            for (i3 = 0; i3 < this.ah.length; i3++) {
                boVar.au(this.ah[i3], this.af[i3]);
            }
        }
        if (this.ay == null) {
            return boVar;
        }
        while (i2 < this.ay.length) {
            boVar.az(this.ay[i2], this.an[i2]);
            i2++;
        }
        return boVar;
    }
}
