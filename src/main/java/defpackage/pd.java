package defpackage;

import android.support.v4.internal.view.SupportMenu;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: pd */
public class pd {
    static final lq ag = lq.aj;
    static final int aj = 3;
    static final lq ap = lq.ai;
    static final int aq = -1;
    static final int ar = 8;
    static final lq as = lq.al;
    dm aa;
    int ab = 1916201627;
    dm ac;
    kh ae;
    pv af;
    cw ah;
    kh ak;
    kh am;
    int an;
    dm ao;
    float at;
    oi au;
    int av = 275052497;
    HashMap aw;
    ef[] ax;
    int ay;
    HashMap az;
    int ba = 1024262441;
    int bb = 1667079907;
    int bc = 882013319;
    int bd = 1909922589;
    HashSet bf = null;
    long bg;
    HashSet bh = new HashSet();
    int bi = 2123297327;
    HashSet bj = new HashSet();
    float bk;
    boolean bl = false;
    int bm = -1706875699;
    HashSet bn = new HashSet();
    int bo = -177632082;
    int bq = -703213023;
    int bs = 1300130107;
    HashSet bt = new HashSet();
    int bu;
    int bv = 23967645;
    boolean bw = true;
    int bx;
    int by = 0;
    boolean bz = false;
    int cb = -1431580969;
    int ce = -415884435;
    int ci;
    List cj;
    Iterator cm;
    ag cn = null;
    ee cp;
    HashSet cq = new HashSet();
    final int[] cv = new int[]{1008, 1009, 1010, 1011, 1012};
    public boolean cw = false;
    int cy = 1507855227;

    public void aa(dm dmVar, ag agVar, ag agVar2, boolean z, byte b) {
        if (dmVar != null) {
            try {
                if (this.aa == null || dmVar != this.aa) {
                    ac(dmVar, (byte) -72);
                }
                if (z || !this.aa.ak(agVar.ad * 1224907159, agVar.aq * -1822118049, agVar.ar * 738029977, (byte) 61)) {
                    ao(agVar2.ad * 1224907159, agVar2.aq * -1822118049, agVar2.ar * 738029977, 1267777625);
                } else {
                    ao(agVar.ad * 1224907159, agVar.aq * -1822118049, agVar.ar * 738029977, 1267777625);
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("pd.aa(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void ab(int i, int i2) {
        try {
            this.bk = at(i, (byte) 69);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(dm dmVar, byte b) {
        try {
            this.aa = dmVar;
            this.ah = new cw(this.ax, this.az, this.am, this.ak);
            this.af.ad(this.aa.aw(1519170241), 1471793531);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ad(kh khVar, kh khVar2, kh khVar3, oi oiVar, HashMap hashMap, ef[] efVarArr, int i) {
        try {
            this.ax = efVarArr;
            this.ae = khVar;
            this.am = khVar2;
            this.ak = khVar3;
            this.au = oiVar;
            this.az = new HashMap();
            this.az.put(ca.ad, hashMap.get(as));
            this.az.put(ca.aq, hashMap.get(ag));
            this.az.put(ca.ar, hashMap.get(ap));
            this.af = new pv(khVar);
            int af = this.ae.af(ch.ad.ai, -625807963);
            int[] az = this.ae.az(af, -381883787);
            this.aw = new HashMap(az.length);
            for (int i2 = 0; i2 < az.length; i2++) {
                lj ljVar = new lj(this.ae.ar(af, az[i2], 1280074593));
                dm dmVar = new dm();
                dmVar.ae(ljVar, az[i2], -849709542);
                this.aw.put(dmVar.aw(-1289805458), dmVar);
                if (dmVar.ax(667947146)) {
                    this.ac = dmVar;
                }
            }
            aw(this.ac, (byte) 43);
            this.ao = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(int i) {
        try {
            if (as((byte) 37)) {
                int i2 = (this.ab * -1803676563) - (this.ay * 1228486495);
                int i3 = (this.av * -777568561) - (this.an * 1448508407);
                if (i2 != 0) {
                    i2 /= Math.min(8, Math.abs(i2));
                }
                if (i3 != 0) {
                    i3 /= Math.min(8, Math.abs(i3));
                }
                am(i2 + (this.ay * 1228486495), i3 + (this.an * 1448508407), true, 1603554598);
                if (this.ab * -1803676563 == this.ay * 1228486495 && this.av * -777568561 == this.an * 1448508407) {
                    this.ab = 1916201627;
                    this.av = 275052497;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean af(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            if (this.cp == null || this.cp.aq != i || this.cp.ar != i2 || this.ci * -1503302671 != this.ah.aw * -1301601889) {
                return true;
            }
            return this.cy * -314973107 != client.rg * -799559479 || i3 > 0 || i4 > 0 || i + i3 < i5 || i2 + i4 < i6;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public dm ag(int i, int i2, int i3, byte b) {
        try {
            for (dm dmVar : this.aw.values()) {
                if (dmVar.ak(i, i2, i3, (byte) 3)) {
                    return dmVar;
                }
            }
            return null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ah(int i, int i2, int i3, int i4, int i5, es esVar, byte b) {
        StringBuilder stringBuilder;
        try {
            int[] iArr = new int[4];
            esVar.el(iArr, -274032175);
            int i6 = i + i3;
            int i7 = i4 + i2;
            esVar.ee(i, i2, i6, i7, 1464333137);
            esVar.al(i, i2, i3, i4, 0, (byte) 1);
            int al = this.af.al(-1360464119);
            if (al < 100) {
                av(i, i2, i3, i4, al, esVar, -1824358700);
                return;
            }
            if (!this.ah.am(1653948753)) {
                this.ah.ad(this.ae, this.aa.aw(-843380059), client.ak, (byte) 20);
                if (!this.ah.am(2076240787)) {
                    return;
                }
            }
            if (this.bf != null) {
                this.bi -= 2123297327;
                if ((this.bi * 1186360113) % (this.bo * 1013188367) == 0) {
                    this.bi = 0;
                    this.bb -= 1667079907;
                }
                if (this.bb * 1244752181 >= this.bd * 1048411551 && !this.bl) {
                    this.bf = null;
                }
            }
            int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
            int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
            this.ah.ar((this.ay * 1228486495) - (ceil / 2), (this.an * 1448508407) - (ceil2 / 2), (this.ay * 1228486495) + (ceil / 2), (ceil2 / 2) + (this.an * 1448508407), i, i2, i6, i7, esVar, (byte) 43);
            if (!this.bz) {
                boolean z;
                if (i5 - (this.by * 1265232603) > 100) {
                    this.by = 26870099 * i5;
                    z = true;
                } else {
                    z = false;
                }
                this.ah.al((this.ay * 1228486495) - (ceil / 2), (this.an * 1448508407) - (ceil2 / 2), (ceil / 2) + (this.ay * 1228486495), (ceil2 / 2) + (this.an * 1448508407), i, i2, i6, i7, this.bn, this.bf, this.bi * 1186360113, this.bo * 1013188367, z, esVar, 1822879164);
            }
            ay(i, i2, i3, i4, ceil, ceil2, esVar, (byte) 19);
            if (jg.iq(1274133781) && this.cw && this.cn != null) {
                oi oiVar = this.au;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Coord: ");
                stringBuilder.append(this.cn);
                oiVar.ak(stringBuilder.toString(), (esVar.ai * 1947951707) + 10, (esVar.al * -709973917) + 20, 16776960, -1, esVar);
            }
            this.ba = -1024262441 * ceil;
            this.bs = -1300130107 * ceil2;
            this.bm = 1706875699 * i;
            this.bq = 703213023 * i2;
            esVar.eb(iArr, 1693511307);
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i) {
        try {
            if (di.rl != null) {
                this.at = this.bk;
                return;
            }
            if (this.at < this.bk) {
                this.at = Math.min(this.bk, this.at + (this.at / 30.0f));
            }
            if (this.at > this.bk) {
                this.at = Math.max(this.bk, this.at - (this.at / 30.0f));
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i, int i2, boolean z, long j) {
        try {
            if (this.aa != null) {
                this.cn = this.aa.ap(((int) (((float) (this.ay * 1228486495)) + ((((float) (i - (this.bm * -1420912645))) - ((((float) bc(1510154179)) * this.at) / 2.0f)) / this.at))) + (this.aa.ah(-1821916464) * 64), ((int) (((float) (this.an * 1448508407)) - ((((float) (i2 - (this.bq * 1973800479))) - ((((float) bv(1479898378)) * this.at) / 2.0f)) / this.at))) + (this.aa.ay((byte) 106) * 64), 739061304);
                if (this.cn != null && z) {
                    if (jg.iq(-368293578) && client.bh.ba(82, -1620542321) && client.bh.ba(81, -1620542321)) {
                        ap.iw(this.cn.aq * -1822118049, this.cn.ar * 738029977, this.cn.ad * 1224907159, false, (byte) 78);
                        return;
                    }
                    Object obj = 1;
                    if (this.bw) {
                        int i3 = i - (this.bx * -1378942765);
                        int i4 = i2 - (this.bu * -77711363);
                        if (j - (this.bg * 2579558854688007097L) > 500 || i3 < -25 || i3 > 25 || i4 < -25 || i4 > 25) {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        ns aq = ib.aq(no.bj, client.eb.aj, 1858116491);
                        aq.ar.cs(this.cn.ad((byte) 101), 1097022590);
                        client.eb.ar(aq, -1485553251);
                        this.bg = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            this.cn = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ak(int i) {
        try {
            this.bv = 23967645;
            this.bc = 882013319;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void al(int i, int i2, boolean z, boolean z2, int i3) {
        try {
            long ad = gq.ad((byte) -69);
            aj(i, i2, z2, ad);
            if (as((byte) -16) || io.ae != client.bh.ad) {
                ak(408053800);
            } else {
                i = client.bh.am[0];
                i2 = client.bh.ak[0];
                if (-1 == this.bc * -1842614583) {
                    this.bc = this.ay * -1785806617;
                    this.bv = this.an * 2066573445;
                }
                if (-1 != this.bc * -1842614583) {
                    am((this.bc * -1842614583) - ((int) (((float) (client.bh.am[0] - client.bh.ai[0])) / this.bk)), ((int) (((float) (client.bh.ak[0] - client.bh.ae[0])) / this.bk)) + (this.bv * 1169848651), false, 1603554598);
                }
            }
            if (z2) {
                this.bg = 5119601343147848329L * ad;
                this.bx = -613329061 * i;
                this.bu = -1450517163 * i2;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void am(int i, int i2, boolean z, int i3) {
        try {
            this.ay = 1603986591 * i;
            this.an = -1545554489 * i2;
            gq.ad((byte) -4);
            if (z) {
                ak(408053800);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void an(int i, int i2, int i3, int i4, es esVar, int i5) {
        try {
            if (this.af.ar((byte) 54)) {
                if (!this.ah.am(2034057132)) {
                    this.ah.ad(this.ae, this.aa.aw(-325856599), client.ak, (byte) 30);
                    if (!this.ah.am(1997547694)) {
                        return;
                    }
                }
                this.ah.aj(i, i2, i3, i4, this.bf, this.bi * 1186360113, this.bo * 1013188367, esVar, -1482726111);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(int i, int i2, int i3, int i4) {
        try {
            if (this.aa != null) {
                int[] ag = this.aa.ag(i, i2, i3, (byte) 39);
                if (ag == null) {
                    ag = this.aa.ag(this.aa.av((byte) 60), this.aa.ab(2017735727), this.aa.at(-2058685144), (byte) -35);
                }
                am(ag[0] - (this.aa.ah(-1821916464) * 64), ag[1] - (this.aa.ay((byte) 53) * 64), true, 1603554598);
                this.ab = 1916201627;
                this.av = 275052497;
                this.at = at(this.aa.ao(303330576), (byte) 45);
                this.bk = this.at;
                this.cj = null;
                this.cm = null;
                this.ah.aq(1231285416);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ap(int i, int i2, int i3, boolean z, int i4) {
        Object obj = null;
        try {
            dm ag = ag(i, i2, i3, (byte) 0);
            if (ag == null) {
                if (z) {
                    ag = this.ac;
                } else {
                    return;
                }
            }
            if (this.ao != ag || z) {
                this.ao = ag;
                aw(ag, (byte) -8);
                obj = 1;
            }
            if (obj != null || z) {
                ao(i, i2, i3, 1267777625);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aq(int i) {
        try {
            ac.aj((byte) -10);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7) {
        try {
            if (this.af.ar((byte) -18)) {
                ai(-1359131270);
                ae(1586881371);
                if (z) {
                    il ilVar;
                    int ceil = (int) Math.ceil((double) (((float) i5) / this.at));
                    int ceil2 = (int) Math.ceil((double) (((float) i6) / this.at));
                    List<cf> ai = this.ah.ai(((this.ay * 1228486495) - (ceil / 2)) - 1, ((this.an * 1448508407) - (ceil2 / 2)) - 1, ((ceil / 2) + (this.ay * 1228486495)) + 1, ((ceil2 / 2) + (this.an * 1448508407)) + 1, i3, i4, i5, i6, i, i2, (byte) 111);
                    HashSet hashSet = new HashSet();
                    for (cf cfVar : ai) {
                        hashSet.add(cfVar);
                        ilVar = new il();
                        ilVar.ad(new Object[]{new dt(cfVar.aq((byte) -4), cfVar.aq, cfVar.ad), Integer.valueOf(i), Integer.valueOf(i2)}, 700748031);
                        if (this.cq.contains(cfVar)) {
                            ilVar.aq(17, -346577829);
                        } else {
                            ilVar.aq(15, 2141848657);
                        }
                        dm.ad(ilVar, -1031683787);
                    }
                    Iterator it = this.cq.iterator();
                    while (it.hasNext()) {
                        if (!hashSet.contains((cf) it.next())) {
                            ilVar = new il();
                            ilVar.ad(new Object[]{new dt(cfVar.aq((byte) 101), cfVar.aq, cfVar.ad), Integer.valueOf(i), Integer.valueOf(i2)}, -29344587);
                            ilVar.aq(16, 1876205998);
                            dm.ad(ilVar, -1339657304);
                        }
                    }
                    this.cq = hashSet;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean as(byte b) {
        try {
            return (-1 == this.ab * -1803676563 || this.av * -777568561 == -1) ? false : true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float at(int i, byte b) {
        return i == 25 ? 1.0f : 37 == i ? 1.5f : 50 == i ? 2.0f : 75 == i ? 3.0f : i == 100 ? 4.0f : 8.0f;
    }

    public void au(int i, int i2) {
        try {
            dm bm = bm(i, (byte) 14);
            if (bm != null) {
                aw(bm, (byte) -73);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void av(int i, int i2, int i3, int i4, int i5, es esVar, int i6) {
        Throwable e;
        StringBuilder stringBuilder;
        try {
            int i7 = i + (i3 / 2);
            int i8 = (((i4 / 2) + i2) - 18) - 20;
            esVar.al(i, i2, i3, i4, 0, (byte) 1);
            esVar.em(i7 - 152, i8, 304, 34, SupportMenu.CATEGORY_MASK, -132121616);
            esVar.al(i7 - 150, i8 + 2, i5 * 3, 30, SupportMenu.CATEGORY_MASK, (byte) 1);
            try {
                this.au.ap(go.nj, i7, i8 + 20, -1, -1, esVar);
            } catch (RuntimeException e2) {
                e = e2;
                stringBuilder = new StringBuilder();
                stringBuilder.append("pd.av(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } catch (RuntimeException e3) {
            e = e3;
            stringBuilder = new StringBuilder();
            stringBuilder.append("pd.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(dm dmVar, byte b) {
        try {
            if (this.aa == null || dmVar != this.aa) {
                ac(dmVar, (byte) 10);
                ao(-1, -1, -1, 1267777625);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public dm ax(int i) {
        try {
            return this.aa;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(int i, int i2, int i3, int i4, int i5, int i6, es esVar, byte b) {
        try {
            if (di.rl != null) {
                int i7 = 512 / (this.ah.aw * 1691763518);
                int i8 = i3 + 512;
                int i9 = i4 + 512;
                int bb = (bb(1566442976) - (i6 / 2)) - i7;
                int bf = ((bf((short) 21168) - (i5 / 2)) - i7) + i7;
                int i10 = i - ((-1301601889 * this.ah.aw) * (bf - (this.cb * 410319641)));
                int i11 = i2 - ((i7 - (bb - (this.ce * 1278663067))) * (this.ah.aw * -1301601889));
                if (af(i8, i9, i10, i11, i3, i4, -685741453)) {
                    if (this.cp != null && i8 == this.cp.aq && this.cp.ar == i9) {
                        Arrays.fill(this.cp.ad, 0);
                    } else {
                        this.cp = new ee(i8, i9);
                    }
                    this.cb = ((bf((short) 26311) - (i5 / 2)) - i7) * 1431580969;
                    this.ce = ((bb(1943099298) - (i6 / 2)) - i7) * 415884435;
                    this.ci = this.ah.aw * -437307761;
                    di.rl.ai(this.cb * 410319641, this.ce * 1278663067, this.cp, (float) (this.ci * -1503302671), 1215178129);
                    this.cy = client.rg * -1872401299;
                    i7 = i - ((bf - (this.cb * 410319641)) * (this.ah.aw * -1301601889));
                    bb = i2 - ((this.ah.aw * -1301601889) * (i7 - (bb - (this.ce * 1278663067))));
                } else {
                    i7 = i10;
                    bb = i11;
                }
                esVar.ar(i, i2, i3, i4, 0, 128, (byte) 15);
                esVar.ab(this.cp, i7, bb, 192, (short) -12664);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int az(int i) {
        try {
            return this.aa == null ? -1 : this.aa.az(48570684);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ba(int i) {
        try {
            this.af.aq(-1993845533);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bb(int i) {
        try {
            if (this.aa == null) {
                return -1;
            }
            return (this.an * 1448508407) + (this.aa.ay((byte) 83) * 64);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bc(int i) {
        try {
            return this.ba * -1516317465;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bd(int i, int i2, int i3) {
        try {
            if (this.aa != null) {
                am(i - (this.aa.ah(-1821916464) * 64), i2 - (this.aa.ay((byte) -12) * 64), true, 1603554598);
                this.ab = 1916201627;
                this.av = 275052497;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bd(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void be(int i, int i2) {
        try {
            this.bf = new HashSet();
            this.bf.add(Integer.valueOf(i));
            this.bb = 0;
            this.bi = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.be(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bf(short s) {
        try {
            if (this.aa == null) {
                return -1;
            }
            return (this.ay * 1228486495) + (this.aa.ah(-1821916464) * 64);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bg(int i, byte b) {
        if (i >= 1) {
            try {
                this.bd = 636640863 * i;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("pd.bg(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void bh(int i) {
        try {
            this.bf = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ag bi(byte b) {
        try {
            return this.aa == null ? null : this.aa.ap(bf((short) 20455), bb(1960066710), 924496426);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bj(int i, byte b) {
        int i2 = 0;
        try {
            this.bf = new HashSet();
            this.bb = 0;
            this.bi = 0;
            while (i2 < dy.ar * -494231741) {
                if (jg.aq(i2, (byte) 69) != null && jg.aq(i2, (byte) 20).an * -345210295 == i) {
                    this.bf.add(Integer.valueOf(jg.aq(i2, (byte) 112).aj * -1701077253));
                }
                i2++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bk(byte b) {
        try {
            return 1.0d == ((double) this.bk) ? 25 : 1.5d == ((double) this.bk) ? 37 : 2.0d == ((double) this.bk) ? 50 : ((double) this.bk) == 3.0d ? 75 : ((double) this.bk) == 4.0d ? 100 : 200;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bl(int i, int i2, int i3, byte b) {
        try {
            if (this.aa != null) {
                int[] ag = this.aa.ag(i, i2, i3, (byte) -19);
                if (ag != null) {
                    bd(ag[0], ag[1], -2079750152);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public dm bm(int i, byte b) {
        try {
            for (dm dmVar : this.aw.values()) {
                if (dmVar.az(771161328) == i) {
                    return dmVar;
                }
            }
            return null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bn(int i, boolean z, int i2) {
        if (z) {
            this.bj.remove(Integer.valueOf(i));
        } else {
            try {
                this.bj.add(Integer.valueOf(i));
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("pd.bn(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        cj(1763738445);
    }

    public void bo(int i, int i2, int i3, int i4) {
        try {
            if (this.aa != null) {
                int[] ag = this.aa.ag(i, i2, i3, (byte) 12);
                if (ag != null) {
                    bq(ag[0], ag[1], (byte) -66);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean bp(int i, int i2) {
        try {
            return !this.bj.contains(Integer.valueOf(i));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bq(int i, int i2, byte b) {
        try {
            if (this.aa != null && this.aa.as(i, i2, 106269327)) {
                this.ab = (i - (this.aa.ah(-1821916464) * 64)) * -1916201627;
                this.av = (i2 - (this.aa.ay((byte) -44) * 64)) * -275052497;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void br(boolean z, byte b) {
        try {
            this.bl = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.br(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean bs(byte b) {
        try {
            return this.af.ar((byte) 22);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bt(boolean z, int i) {
        try {
            this.bz = !z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bt(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bu(int i, byte b) {
        if (i >= 1) {
            try {
                this.bo = 1456736239 * i;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("pd.bu(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public int bv(int i) {
        try {
            return this.bs * 28538893;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bw(int i) {
        try {
            this.bo = -177632082;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bx(short s) {
        try {
            this.bd = 1909922589;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.bx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean by(int i) {
        try {
            return !this.bz;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.by(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bz(int i, boolean z, int i2) {
        if (z) {
            this.bh.remove(Integer.valueOf(i));
        } else {
            try {
                this.bh.add(Integer.valueOf(i));
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("pd.bz(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        for (int i3 = 0; i3 < dy.ar * -494231741; i3++) {
            if (jg.aq(i3, (byte) 103) != null) {
                if (jg.aq(i3, (byte) 29).an * -345210295 == i) {
                    int i4 = jg.aq(i3, (byte) 52).aj * -1701077253;
                    if (z) {
                        this.bt.remove(Integer.valueOf(i4));
                    } else {
                        this.bt.add(Integer.valueOf(i4));
                    }
                }
            }
        }
        cj(704941538);
    }

    public void ca(int i, int i2, boolean z, boolean z2) {
        long ad = gq.ad((byte) -41);
        aj(i, i2, z2, ad);
        if (as((byte) -17) || io.ae != client.bh.ad) {
            ak(408053800);
        } else {
            i = client.bh.am[0];
            i2 = client.bh.ak[0];
            if (-1 == this.bc * -1842614583) {
                this.bc = this.ay * -1785806617;
                this.bv = this.an * 2066573445;
            }
            if (-1 != this.bc * -1842614583) {
                am((this.bc * -1842614583) - ((int) (((float) (client.bh.am[0] - client.bh.ai[0])) / this.bk)), ((int) (((float) (client.bh.ak[0] - client.bh.ae[0])) / this.bk)) + (this.bv * 1169848651), false, 1603554598);
            }
        }
        if (z2) {
            this.bg = 5119601343147848329L * ad;
            this.bx = -613329061 * i;
            this.bu = -1450517163 * i2;
        }
    }

    public void cb() {
        ac.aj((byte) -31);
    }

    public void cc(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (this.af.ar((byte) 7)) {
            ai(-1110329538);
            ae(-1489705946);
            if (z) {
                il ilVar;
                int ceil = (int) Math.ceil((double) (((float) i5) / this.at));
                int ceil2 = (int) Math.ceil((double) (((float) i6) / this.at));
                int i7 = ceil / 2;
                int i8 = ceil2 / 2;
                List<cf> ai = this.ah.ai(((1228486495 * this.ay) - i7) - 1, ((1448508407 * this.an) - i8) - 1, ((this.ay * 1228486495) + i7) + 1, ((this.an * -1682167034) + i8) + 1, i3, i4, i5, i6, i, i2, (byte) 48);
                HashSet hashSet = new HashSet();
                for (cf cfVar : ai) {
                    hashSet.add(cfVar);
                    ilVar = new il();
                    ilVar.ad(new Object[]{new dt(cfVar.aq((byte) -19), cfVar.aq, cfVar.ad), Integer.valueOf(i), Integer.valueOf(i2)}, 1694856084);
                    if (this.cq.contains(cfVar)) {
                        ilVar.aq(17, -1283445726);
                    } else {
                        ilVar.aq(15, 341004482);
                    }
                    dm.ad(ilVar, -1042691415);
                }
                Iterator it = this.cq.iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains((cf) it.next())) {
                        ilVar = new il();
                        ilVar.ad(new Object[]{new dt(cfVar.aq((byte) -34), cfVar.aq, cfVar.ad), Integer.valueOf(i), Integer.valueOf(i2)}, 1654642565);
                        ilVar.aq(16, 279090853);
                        dm.ad(ilVar, -793666944);
                    }
                }
                this.cq = hashSet;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cd() {
        this.bv = 23967645;
        this.bc = 882013319;
    }

    public void ce() {
        ac.aj((byte) -100);
    }

    /* Access modifiers changed, original: final */
    public final void cf() {
        this.bv = 23967645;
        this.bc = 882013319;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean cg() {
        return (-1 == this.ab * -1803676563 || this.av * -777568561 == -1) ? false : true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ch() {
        return (-1 == this.ab * -2118751393 || this.av * 1615198704 == -1) ? false : true;
    }

    public void ci(kh khVar, kh khVar2, kh khVar3, oi oiVar, HashMap hashMap, ef[] efVarArr) {
        this.ax = efVarArr;
        this.ae = khVar;
        this.am = khVar2;
        this.ak = khVar3;
        this.au = oiVar;
        this.az = new HashMap();
        this.az.put(ca.ad, hashMap.get(as));
        this.az.put(ca.aq, hashMap.get(ag));
        this.az.put(ca.ar, hashMap.get(ap));
        this.af = new pv(khVar);
        int af = this.ae.af(ch.ad.ai, 1062236074);
        int[] az = this.ae.az(af, -381883787);
        this.aw = new HashMap(az.length);
        for (int i = 0; i < az.length; i++) {
            lj ljVar = new lj(this.ae.ar(af, az[i], 1420172756));
            dm dmVar = new dm();
            dmVar.ae(ljVar, az[i], -1112067356);
            this.aw.put(dmVar.aw(1047340012), dmVar);
            if (dmVar.ax(-48399212)) {
                this.ac = dmVar;
            }
        }
        aw(this.ac, (byte) 40);
        this.ao = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void cj(int i) {
        try {
            this.bn.clear();
            this.bn.addAll(this.bj);
            this.bn.addAll(this.bt);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.cj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ck() {
        if (di.rl != null) {
            this.at = this.bk;
            return;
        }
        if (this.at < this.bk) {
            this.at = Math.min(this.bk, this.at + (this.at / 30.0f));
        }
        if (this.at > this.bk) {
            this.at = Math.max(this.bk, this.at - (this.at / 30.0f));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cl() {
        if (as((byte) -11)) {
            int i = (this.ab * 1256582841) - (this.ay * 1617498494);
            int i2 = (this.av * 1702394483) - (this.an * 1448508407);
            if (i != 0) {
                i /= Math.min(8, Math.abs(i));
            }
            if (i2 != 0) {
                i2 /= Math.min(8, Math.abs(i2));
            }
            am(i + (this.ay * 1228486495), i2 + (this.an * 670830129), true, 1603554598);
            if (this.ab * 74010608 == this.ay * 1778403317 && this.av * 1777304088 == this.an * 1448508407) {
                this.ab = 1916201627;
                this.av = -30275971;
            }
        }
    }

    public void cm(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            if (this.af.ar((byte) -44)) {
                int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
                int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
                List<cf> ai = this.ah.ai(((this.ay * 1228486495) - (ceil / 2)) - 1, ((this.an * 1448508407) - (ceil2 / 2)) - 1, ((ceil / 2) + (this.ay * 1228486495)) + 1, ((ceil2 / 2) + (this.an * 1448508407)) + 1, i, i2, i3, i4, i5, i6, (byte) 41);
                if (!ai.isEmpty()) {
                    for (cf cfVar : ai) {
                        dy aq = jg.aq(cfVar.aq((byte) 72), (byte) 28);
                        Object obj = null;
                        for (int length = this.cv.length - 1; length >= 0; length--) {
                            if (aq.ap[length] != null) {
                                gc.km.bi(aq.ap[length], aq.au, this.cv[length], cfVar.aq((byte) -48), cfVar.aq.ad((byte) 20), cfVar.ad.ad((byte) 33), (byte) 1);
                                obj = 1;
                            }
                        }
                        if (obj != null) {
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.cm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cn(int i, int i2, ag agVar, ag agVar2, int i3) {
        try {
            il ilVar = new il();
            ilVar.ad(new Object[]{new dt(i2, agVar, agVar2)}, 257297581);
            switch (i) {
                case 1008:
                    ilVar.aq(10, -90800281);
                    break;
                case 1009:
                    ilVar.aq(11, -638428007);
                    break;
                case 1010:
                    ilVar.aq(12, 1183620647);
                    break;
                case 1011:
                    ilVar.aq(13, 2080689817);
                    break;
                case 1012:
                    ilVar.aq(14, 1754717820);
                    break;
            }
            dm.ad(ilVar, -259773061);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.cn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void co() {
        if (di.rl != null) {
            this.at = this.bk;
            return;
        }
        if (this.at < this.bk) {
            this.at = Math.min(this.bk, this.at + (this.at / 30.0f));
        }
        if (this.at > this.bk) {
            this.at = Math.max(this.bk, this.at - (this.at / 30.0f));
        }
    }

    public cf cp(byte b) {
        try {
            if (this.cm == null) {
                return null;
            }
            while (this.cm.hasNext()) {
                cf cfVar = (cf) this.cm.next();
                if (cfVar.aq((byte) -40) != -1) {
                    return cfVar;
                }
            }
            return null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.cp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ag cq(int i, ag agVar, int i2) {
        cf cfVar = null;
        try {
            if (!this.af.ar((byte) 109)) {
                return null;
            }
            if (!this.ah.am(1671510044)) {
                return null;
            }
            if (!this.aa.as(agVar.aq * -1822118049, agVar.ar * 738029977, -1149166469)) {
                return null;
            }
            List<cf> list = (List) this.ah.ak((byte) -86).get(Integer.valueOf(i));
            if (list == null) {
                return null;
            }
            if (list.isEmpty()) {
                return null;
            }
            int i3 = -1;
            for (cf cfVar2 : list) {
                int i4 = (cfVar2.ad.aq * -1822118049) - (agVar.aq * -1822118049);
                int i5 = (cfVar2.ad.ar * 738029977) - (agVar.ar * 738029977);
                i4 = (i4 * i4) + (i5 * i5);
                if (i4 == 0) {
                    return cfVar2.ad;
                }
                if (i4 < i3 || cfVar == null) {
                    cfVar = cfVar2;
                    i3 = i4;
                }
            }
            return cfVar.ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.cq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cr(int i, int i2, boolean z, boolean z2) {
        long ad = gq.ad((byte) 103);
        aj(i, i2, z2, ad);
        if (as((byte) 83) || io.ae != client.bh.ad) {
            ak(408053800);
        } else {
            i = client.bh.am[0];
            i2 = client.bh.ak[0];
            if (-1 == this.bc * -1842614583) {
                this.bc = this.ay * -1785806617;
                this.bv = this.an * 2066573445;
            }
            if (-1 != this.bc * -1842614583) {
                am((this.bc * -1842614583) - ((int) (((float) (client.bh.am[0] - client.bh.ai[0])) / this.bk)), ((int) (((float) (client.bh.ak[0] - client.bh.ae[0])) / this.bk)) + (this.bv * 1169848651), false, 1603554598);
            }
        }
        if (z2) {
            this.bg = 5119601343147848329L * ad;
            this.bx = -613329061 * i;
            this.bu = -1450517163 * i2;
        }
    }

    public void cs(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (this.af.ar((byte) -57)) {
            ai(-1298630561);
            ae(1958111679);
            if (z) {
                il ilVar;
                int ceil = (int) Math.ceil((double) (((float) i5) / this.at));
                int ceil2 = (int) Math.ceil((double) (((float) i6) / this.at));
                int i7 = ceil / 2;
                int i8 = ceil2 / 2;
                List<cf> ai = this.ah.ai(((1228486495 * this.ay) - i7) - 1, ((1448508407 * this.an) - i8) - 1, ((this.ay * 1228486495) + i7) + 1, ((this.an * 1448508407) + i8) + 1, i3, i4, i5, i6, i, i2, (byte) 44);
                HashSet hashSet = new HashSet();
                for (cf cfVar : ai) {
                    hashSet.add(cfVar);
                    ilVar = new il();
                    ilVar.ad(new Object[]{new dt(cfVar.aq((byte) -33), cfVar.aq, cfVar.ad), Integer.valueOf(i), Integer.valueOf(i2)}, 1585843872);
                    if (this.cq.contains(cfVar)) {
                        ilVar.aq(17, -1495026694);
                    } else {
                        ilVar.aq(15, -1496981357);
                    }
                    dm.ad(ilVar, 71711838);
                }
                Iterator it = this.cq.iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains((cf) it.next())) {
                        ilVar = new il();
                        ilVar.ad(new Object[]{new dt(cfVar.aq((byte) 79), cfVar.aq, cfVar.ad), Integer.valueOf(i), Integer.valueOf(i2)}, 669553801);
                        ilVar.aq(16, -686821301);
                        dm.ad(ilVar, -803588519);
                    }
                }
                this.cq = hashSet;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ct(int i, int i2, boolean z, long j) {
        if (this.aa != null) {
            this.cn = this.aa.ap(((int) (((float) (this.ay * 1228486495)) + ((((float) (i - (this.bm * -1420912645))) - ((((float) bc(1798011106)) * this.at) / 2.0f)) / this.at))) + (this.aa.ah(-1821916464) * 64), ((int) (((float) (this.an * 1448508407)) - ((((float) (i2 - (this.bq * 1973800479))) - ((((float) bv(1950402327)) * this.at) / 2.0f)) / this.at))) + (this.aa.ay((byte) 52) * 64), 1704722390);
            if (this.cn != null && z) {
                if (jg.iq(-557631197) && client.bh.ba(82, -1620542321) && client.bh.ba(81, -1620542321)) {
                    ap.iw(this.cn.aq * -1822118049, this.cn.ar * 738029977, this.cn.ad * 1224907159, false, (byte) -41);
                    return;
                }
                boolean z2 = true;
                if (this.bw) {
                    int i3 = i - (this.bx * -1378942765);
                    int i4 = i2 - (this.bu * -77711363);
                    if (j - (this.bg * 2579558854688007097L) > 500 || i3 < -25 || i3 > 25 || i4 < -25 || i4 > 25) {
                        z2 = false;
                    }
                }
                if (z2) {
                    ns aq = ib.aq(no.bj, client.eb.aj, 801949197);
                    aq.ar.cs(this.cn.ad((byte) 19), 965353730);
                    client.eb.ar(aq, -385890183);
                    this.bg = 0;
                    return;
                }
                return;
            }
            return;
        }
        this.cn = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void cu() {
        if (as((byte) -58)) {
            int i = (this.ab * 929132637) - (this.ay * -1118085459);
            int i2 = (this.av * -777568561) - (this.an * -414441157);
            if (i != 0) {
                i /= Math.min(8, Math.abs(i));
            }
            if (i2 != 0) {
                i2 /= Math.min(8, Math.abs(i2));
            }
            am(i + (this.ay * -1302520767), i2 + (this.an * 1508366395), true, 1603554598);
            if (this.ab * 725742788 == this.ay * 1228486495 && this.av * -777568561 == this.an * 608950838) {
                this.ab = 1916201627;
                this.av = -950547029;
            }
        }
    }

    public boolean cv(int i, byte b) {
        try {
            return !this.bh.contains(Integer.valueOf(i));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.cv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public cf cw(int i) {
        try {
            if (!this.af.ar((byte) 82) || !this.ah.am(1642041828)) {
                return null;
            }
            HashMap ak = this.ah.ak((byte) 13);
            this.cj = new LinkedList();
            for (List addAll : ak.values()) {
                this.cj.addAll(addAll);
            }
            this.cm = this.cj.iterator();
            return cp((byte) 47);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pd.cw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cx(int i, int i2, boolean z, long j) {
        if (this.aa != null) {
            this.cn = this.aa.ap(((int) (((float) (this.ay * -1120173682)) + ((((float) (i - (this.bm * -1420912645))) - ((((float) bc(2002446358)) * this.at) / 2.0f)) / this.at))) + (this.aa.ah(-1821916464) * -2009892354), ((int) (((float) (this.an * 1416463100)) - ((((float) (i2 - (this.bq * -1946134215))) - ((((float) bv(1797223466)) * this.at) / 2.0f)) / this.at))) + (this.aa.ay((byte) 2) * -1010087148), 1983394969);
            if (this.cn != null && z) {
                if (jg.iq(1972221610) && client.bh.ba(1299754472, -1620542321) && client.bh.ba(81, -1620542321)) {
                    ap.iw(this.cn.aq * -1822118049, this.cn.ar * -255601484, this.cn.ad * 1224907159, false, (byte) -26);
                    return;
                }
                boolean z2 = true;
                if (this.bw) {
                    int i3 = i - (this.bx * 1716356390);
                    int i4 = i2 - (this.bu * 219889119);
                    if (j - (this.bg * 2579558854688007097L) > 500 || i3 < 124394472 || i3 > 25 || i4 < -1468671374 || i4 > 25) {
                        z2 = false;
                    }
                }
                if (z2) {
                    ns aq = ib.aq(no.bj, client.eb.aj, 1723904769);
                    aq.ar.cs(this.cn.ad((byte) 53), 1793390706);
                    client.eb.ar(aq, -945058836);
                    this.bg = 0;
                    return;
                }
                return;
            }
            return;
        }
        this.cn = null;
    }

    public void cy(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        if (this.af.ar((byte) 71)) {
            ai(-965384206);
            ae(617770404);
            if (z) {
                il ilVar;
                int ceil = (int) Math.ceil((double) (((float) i5) / this.at));
                int ceil2 = (int) Math.ceil((double) (((float) i6) / this.at));
                int i7 = ceil / 2;
                int i8 = ceil2 / 2;
                List<cf> ai = this.ah.ai(((-814032263 * this.ay) - i7) - 1, ((1448508407 * this.an) - i8) - 1, ((this.ay * 939830668) + i7) + 1, ((this.an * -1015055960) + i8) + 1, i3, i4, i5, i6, i, i2, (byte) 89);
                HashSet hashSet = new HashSet();
                for (cf cfVar : ai) {
                    hashSet.add(cfVar);
                    ilVar = new il();
                    ilVar.ad(new Object[]{new dt(cfVar.aq((byte) -18), cfVar.aq, cfVar.ad), Integer.valueOf(i), Integer.valueOf(i2)}, 167358982);
                    if (this.cq.contains(cfVar)) {
                        ilVar.aq(17, 1880140493);
                    } else {
                        ilVar.aq(15, 1373463819);
                    }
                    dm.ad(ilVar, -2123643056);
                }
                Iterator it = this.cq.iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains((cf) it.next())) {
                        ilVar = new il();
                        ilVar.ad(new Object[]{new dt(cfVar.aq((byte) 25), cfVar.aq, cfVar.ad), Integer.valueOf(i), Integer.valueOf(i2)}, 1896490120);
                        ilVar.aq(16, -629205844);
                        dm.ad(ilVar, -1537853320);
                    }
                }
                this.cq = hashSet;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cz() {
        this.bv = 23967645;
        this.bc = 882013319;
    }

    public int da() {
        return this.aa == null ? -1 : this.aa.az(1200789875);
    }

    public int db() {
        return this.aa == null ? -1 : this.aa.az(1458626233);
    }

    public dm dc() {
        return this.aa;
    }

    public dm dd(int i, int i2, int i3) {
        for (dm dmVar : this.aw.values()) {
            if (dmVar.ak(i, i2, i3, (byte) -10)) {
                return dmVar;
            }
        }
        return null;
    }

    public void de(dm dmVar, ag agVar, ag agVar2, boolean z) {
        if (dmVar != null) {
            if (this.aa == null || dmVar != this.aa) {
                ac(dmVar, (byte) -30);
            }
            if (z || !this.aa.ak(agVar.ad * 1224907159, agVar.aq * -1822118049, agVar.ar * 738029977, (byte) -37)) {
                ao(agVar2.ad * 1224907159, agVar2.aq * -1822118049, agVar2.ar * 738029977, 1267777625);
            } else {
                ao(agVar.ad * 1224907159, agVar.aq * -1822118049, agVar.ar * 738029977, 1267777625);
            }
        }
    }

    public int df() {
        return this.aa == null ? -1 : this.aa.az(-619918769);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean dg(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.cp == null || this.cp.aq != i || this.cp.ar != i2 || this.ci * -1754505695 != this.ah.aw * -1301601889 || this.cy * -1033917611 != client.rg * -828580552 || i3 > 0 || i4 > 0 || i + i3 < i5 || i2 + i4 < i6;
    }

    public void dh(dm dmVar, ag agVar, ag agVar2, boolean z) {
        if (dmVar != null) {
            if (this.aa == null || dmVar != this.aa) {
                ac(dmVar, (byte) 63);
            }
            if (z || !this.aa.ak(agVar.ad * 1224907159, agVar.aq * -1822118049, agVar.ar * 738029977, (byte) -72)) {
                ao(agVar2.ad * 1224907159, agVar2.aq * -1822118049, agVar2.ar * 738029977, 1267777625);
            } else {
                ao(agVar.ad * 1224907159, agVar.aq * -1822118049, agVar.ar * 738029977, 1267777625);
            }
        }
    }

    public void di(int i, int i2, int i3, boolean z) {
        byte b;
        dm ag = ag(i, i2, i3, (byte) 0);
        if (ag == null) {
            if (z) {
                ag = this.ac;
            } else {
                return;
            }
        }
        if (this.ao != ag || z) {
            this.ao = ag;
            aw(ag, (byte) 8);
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        if (b != (byte) 0 || z) {
            ao(i, i2, i3, 1267777625);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean dj(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.cp == null || this.cp.aq != i || this.cp.ar != i2 || this.ci * -24745661 != this.ah.aw * -1965893627 || this.cy * 91036102 != client.rg * -420597315 || i3 > 0 || i4 > 0 || i + i3 < i5 || i2 + i4 < i6;
    }

    public void dk(int i, int i2, int i3, int i4, int i5, es esVar) {
        int[] iArr = new int[4];
        esVar.el(iArr, 282114450);
        int i6 = i + i3;
        int i7 = i4 + i2;
        esVar.ee(i, i2, i6, i7, 2075438660);
        esVar.al(i, i2, i3, i4, 0, (byte) 1);
        int al = this.af.al(-1360464119);
        if (al < 100) {
            av(i, i2, i3, i4, al, esVar, -1824358700);
            return;
        }
        if (!this.ah.am(1897056918)) {
            this.ah.ad(this.ae, this.aa.aw(-1256485402), client.ak, (byte) -6);
            if (!this.ah.am(1914350200)) {
                return;
            }
        }
        if (this.bf != null) {
            this.bi -= 2123297327;
            if ((this.bi * 1186360113) % (this.bo * 1013188367) == 0) {
                this.bi = 0;
                this.bb -= 1667079907;
            }
            if (this.bb * 1244752181 >= this.bd * 1048411551 && !this.bl) {
                this.bf = null;
            }
        }
        int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
        int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
        int i8 = ceil / 2;
        int i9 = ceil2 / 2;
        this.ah.ar((this.ay * 1228486495) - i8, (1448508407 * this.an) - i9, (this.ay * 1228486495) + i8, i9 + (this.an * 1448508407), i, i2, i6, i7, esVar, (byte) -59);
        if (!this.bz) {
            boolean z;
            if (i5 - (this.by * 1265232603) > 100) {
                this.by = 26870099 * i5;
                z = true;
            } else {
                z = false;
            }
            this.ah.al((this.ay * 1228486495) - i8, (this.an * 1448508407) - i9, i8 + (this.ay * 1228486495), i9 + (this.an * 1448508407), i, i2, i6, i7, this.bn, this.bf, this.bi * 1186360113, this.bo * 1013188367, z, esVar, 2094357015);
        }
        ay(i, i2, i3, i4, ceil, ceil2, esVar, (byte) 107);
        if (jg.iq(7340370) && this.cw && this.cn != null) {
            oi oiVar = this.au;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Coord: ");
            stringBuilder.append(this.cn);
            oiVar.ak(stringBuilder.toString(), (esVar.ai * 1947951707) + 10, (esVar.al * -709973917) + 20, 16776960, -1, esVar);
        }
        this.ba = -1024262441 * ceil;
        this.bs = -1300130107 * ceil2;
        this.bm = 1706875699 * i;
        this.bq = 703213023 * i2;
        esVar.eb(iArr, 1693511307);
    }

    public void dl(int i, int i2, int i3, boolean z) {
        byte b;
        dm ag = ag(i, i2, i3, (byte) 0);
        if (ag == null) {
            if (z) {
                ag = this.ac;
            } else {
                return;
            }
        }
        if (this.ao != ag || z) {
            this.ao = ag;
            aw(ag, (byte) 54);
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        if (b != (byte) 0 || z) {
            ao(i, i2, i3, 1267777625);
        }
    }

    public dm dm(int i, int i2, int i3) {
        for (dm dmVar : this.aw.values()) {
            if (dmVar.ak(i, i2, i3, (byte) -12)) {
                return dmVar;
            }
        }
        return null;
    }

    public void dn(dm dmVar, ag agVar, ag agVar2, boolean z) {
        if (dmVar != null) {
            if (this.aa == null || dmVar != this.aa) {
                ac(dmVar, (byte) -50);
            }
            if (z || !this.aa.ak(agVar.ad * 1991753933, agVar.aq * -1822118049, agVar.ar * 738029977, (byte) -71)) {
                ao(agVar2.ad * 1224907159, agVar2.aq * -1822118049, agVar2.ar * -278516635, 1267777625);
            } else {
                ao(agVar.ad * -431327704, agVar.aq * 1827008637, agVar.ar * 196081197, 1267777625);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: do */
    public void m233do(int i, int i2, int i3) {
        if (this.aa != null) {
            int[] ag = this.aa.ag(i, i2, i3, (byte) 3);
            if (ag == null) {
                ag = this.aa.ag(this.aa.av((byte) 92), this.aa.ab(2009812160), this.aa.at(94533261), (byte) 3);
            }
            am(ag[0] - (this.aa.ah(-1821916464) * 64), ag[1] - (this.aa.ay((byte) 57) * 64), true, 1603554598);
            this.ab = 1916201627;
            this.av = 275052497;
            this.at = at(this.aa.ao(752840281), (byte) 123);
            this.bk = this.at;
            this.cj = null;
            this.cm = null;
            this.ah.aq(-1033864365);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dp(dm dmVar) {
        if (this.aa == null || dmVar != this.aa) {
            ac(dmVar, (byte) 11);
            ao(-1, -1, -1, 1267777625);
        }
    }

    public void dq(int i, int i2, int i3, int i4, int i5, es esVar) {
        int[] iArr = new int[4];
        esVar.el(iArr, -305505457);
        int i6 = i + i3;
        int i7 = i4 + i2;
        esVar.ee(i, i2, i6, i7, 1865516111);
        esVar.al(i, i2, i3, i4, 0, (byte) 1);
        int al = this.af.al(-1360464119);
        if (al < 100) {
            av(i, i2, i3, i4, al, esVar, -1824358700);
            return;
        }
        if (!this.ah.am(1888849267)) {
            this.ah.ad(this.ae, this.aa.aw(-299675469), client.ak, (byte) 36);
            if (!this.ah.am(1827903354)) {
                return;
            }
        }
        boolean z = false;
        if (this.bf != null) {
            this.bi -= 2027847985;
            if ((this.bi * -907732832) % (this.bo * 798219090) == 0) {
                this.bi = 0;
                this.bb -= 344023678;
            }
            if (this.bb * 1244752181 >= this.bd * 1892353738 && !this.bl) {
                this.bf = null;
            }
        }
        int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
        int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
        int i8 = ceil / 2;
        int i9 = ceil2 / 2;
        this.ah.ar((this.ay * 1228486495) - i8, (877180558 * this.an) - i9, (this.ay * -1967745904) + i8, (this.an * 1448508407) + i9, i, i2, i6, i7, esVar, (byte) 69);
        if (!this.bz) {
            if (i5 - (this.by * 1265232603) > 684230093) {
                this.by = 26870099 * i5;
                z = true;
            }
            this.ah.al((this.ay * 1228486495) - i8, (this.an * -18832323) - i9, (this.ay * 354778864) + i8, i9 + (this.an * 1448508407), i, i2, i6, i7, this.bn, this.bf, this.bi * 1186360113, 1013188367 * this.bo, z, esVar, 1218785990);
        }
        ay(i, i2, i3, i4, ceil, ceil2, esVar, (byte) 41);
        if (jg.iq(258679234) && this.cw && this.cn != null) {
            oi oiVar = this.au;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Coord: ");
            stringBuilder.append(this.cn);
            oiVar.ak(stringBuilder.toString(), (esVar.ai * 1947951707) + 10, (esVar.al * -1836047097) + 20, 16776960, -1, esVar);
        }
        this.ba = -1375946132 * ceil;
        this.bs = -1300130107 * ceil2;
        this.bm = 1883253889 * i;
        this.bq = 703213023 * i2;
        esVar.eb(iArr, 1693511307);
    }

    public void dr(int i) {
        dm bm = bm(i, (byte) 38);
        if (bm != null) {
            aw(bm, (byte) 92);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ds(int i, int i2, int i3) {
        if (this.aa != null) {
            int[] ag = this.aa.ag(i, i2, i3, (byte) 27);
            if (ag == null) {
                ag = this.aa.ag(this.aa.av((byte) 95), this.aa.ab(2076742304), this.aa.at(-35886278), (byte) -79);
            }
            am(ag[0] - (this.aa.ah(-1821916464) * 64), ag[1] - (this.aa.ay((byte) 46) * -1393693737), true, 1603554598);
            this.ab = -1009642643;
            this.av = 275052497;
            this.at = at(this.aa.ao(-2036115137), (byte) 124);
            this.bk = this.at;
            this.cj = null;
            this.cm = null;
            this.ah.aq(-1441007811);
        }
    }

    public dm dt(int i, int i2, int i3) {
        for (dm dmVar : this.aw.values()) {
            if (dmVar.ak(i, i2, i3, (byte) -55)) {
                return dmVar;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void du(dm dmVar) {
        if (this.aa == null || dmVar != this.aa) {
            ac(dmVar, (byte) -22);
            ao(-1, -1, -1, 1267777625);
        }
    }

    public void dv(int i, int i2, int i3, boolean z) {
        byte b;
        dm ag = ag(i, i2, i3, (byte) 0);
        if (ag == null) {
            if (z) {
                ag = this.ac;
            } else {
                return;
            }
        }
        if (this.ao != ag || z) {
            this.ao = ag;
            aw(ag, (byte) -23);
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        if (b != (byte) 0 || z) {
            ao(i, i2, i3, 1267777625);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean dw(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.cp == null || this.cp.aq != i || this.cp.ar != i2 || this.ci * -1727764402 != this.ah.aw * 1549245871 || this.cy * 1751445235 != client.rg * -799559479 || i3 > 0 || i4 > 0 || i + i3 < i5 || i2 + i4 < i6;
    }

    public void dx(int i, int i2, int i3, int i4, int i5, es esVar) {
        int[] iArr = new int[4];
        esVar.el(iArr, 1356754065);
        int i6 = i + i3;
        int i7 = i4 + i2;
        esVar.ee(i, i2, i6, i7, 1452152325);
        esVar.al(i, i2, i3, i4, 0, (byte) 1);
        int al = this.af.al(-1360464119);
        if (al < 160422485) {
            av(i, i2, i3, i4, al, esVar, -1824358700);
            return;
        }
        if (!this.ah.am(1721595219)) {
            this.ah.ad(this.ae, this.aa.aw(1781171592), client.ak, (byte) 39);
            if (!this.ah.am(1611583315)) {
                return;
            }
        }
        boolean z = false;
        if (this.bf != null) {
            this.bi -= 1602741365;
            if ((this.bi * 1186360113) % (this.bo * 56140922) == 0) {
                this.bi = 0;
                this.bb -= 1667079907;
            }
            if (this.bb * 187773607 >= this.bd * -1069594817 && !this.bl) {
                this.bf = null;
            }
        }
        int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
        int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
        int i8 = ceil / 2;
        int i9 = ceil2 / 2;
        this.ah.ar((this.ay * 767956957) - i8, (1448508407 * this.an) - i9, (this.ay * 1721839130) + i8, (this.an * 735881431) + i9, i, i2, i6, i7, esVar, (byte) -23);
        if (!this.bz) {
            if (i5 - (this.by * 1921948573) > -1040199614) {
                this.by = 26870099 * i5;
                z = true;
            }
            this.ah.al((this.ay * 726672668) - i8, (this.an * -1548096074) - i9, i8 + (this.ay * 1228486495), i9 + (this.an * -120366841), i, i2, i6, i7, this.bn, this.bf, this.bi * 617100509, 1013188367 * this.bo, z, esVar, 1064475056);
        }
        ay(i, i2, i3, i4, ceil, ceil2, esVar, (byte) 104);
        if (jg.iq(-1805308780) && this.cw && this.cn != null) {
            oi oiVar = this.au;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Coord: ");
            stringBuilder.append(this.cn);
            oiVar.ak(stringBuilder.toString(), (esVar.ai * 1947951707) + 10, (esVar.al * 1511516136) + 20, 16776960, -1, esVar);
        }
        this.ba = -1623960366 * ceil;
        this.bs = -1300130107 * ceil2;
        this.bm = 1706875699 * i;
        this.bq = -526454300 * i2;
        esVar.eb(iArr, 1693511307);
    }

    public void dy(int i, int i2, int i3, int i4, int i5, es esVar) {
        int[] iArr = new int[4];
        esVar.el(iArr, 1828410295);
        int i6 = i + i3;
        int i7 = i4 + i2;
        esVar.ee(i, i2, i6, i7, 1693690606);
        esVar.al(i, i2, i3, i4, 0, (byte) 1);
        int al = this.af.al(-1360464119);
        if (al < 100) {
            av(i, i2, i3, i4, al, esVar, -1824358700);
            return;
        }
        if (!this.ah.am(2053422071)) {
            this.ah.ad(this.ae, this.aa.aw(297842435), client.ak, (byte) 8);
            if (!this.ah.am(1750601613)) {
                return;
            }
        }
        if (this.bf != null) {
            this.bi -= 2123297327;
            if ((this.bi * 1186360113) % (this.bo * 1013188367) == 0) {
                this.bi = 0;
                this.bb -= 1667079907;
            }
            if (this.bb * 1244752181 >= this.bd * 1048411551 && !this.bl) {
                this.bf = null;
            }
        }
        int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
        int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
        int i8 = ceil / 2;
        int i9 = ceil2 / 2;
        this.ah.ar((this.ay * 1228486495) - i8, (1448508407 * this.an) - i9, (this.ay * 1228486495) + i8, i9 + (this.an * 1448508407), i, i2, i6, i7, esVar, (byte) -77);
        if (!this.bz) {
            boolean z;
            if (i5 - (this.by * 1265232603) > 100) {
                this.by = 26870099 * i5;
                z = true;
            } else {
                z = false;
            }
            this.ah.al((this.ay * 1228486495) - i8, (this.an * 1448508407) - i9, i8 + (this.ay * 1228486495), i9 + (this.an * 1448508407), i, i2, i6, i7, this.bn, this.bf, this.bi * 1186360113, this.bo * 1013188367, z, esVar, 1777946146);
        }
        ay(i, i2, i3, i4, ceil, ceil2, esVar, (byte) 32);
        if (jg.iq(187967626) && this.cw && this.cn != null) {
            oi oiVar = this.au;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Coord: ");
            stringBuilder.append(this.cn);
            oiVar.ak(stringBuilder.toString(), (esVar.ai * 1947951707) + 10, (esVar.al * -709973917) + 20, 16776960, -1, esVar);
        }
        this.ba = -1024262441 * ceil;
        this.bs = -1300130107 * ceil2;
        this.bm = 1706875699 * i;
        this.bq = 703213023 * i2;
        esVar.eb(iArr, 1693511307);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean dz(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.cp == null || this.cp.aq != i || this.cp.ar != i2 || this.ci * -1503302671 != this.ah.aw * -1301601889 || this.cy * -314973107 != client.rg * -799559479 || i3 > 0 || i4 > 0 || i + i3 < i5 || i2 + i4 < i6;
    }

    public void ea(int i) {
        this.bk = at(i, (byte) 123);
    }

    /* Access modifiers changed, original: 0000 */
    public float eb(int i) {
        return i == 25 ? 1.0f : 2016062503 == i ? 1.5f : 1192255387 == i ? 2.0f : 1438717632 == i ? 3.0f : i == 1860512731 ? 4.0f : 8.0f;
    }

    public void ec(int i, int i2, int i3, int i4, es esVar) {
        if (this.af.ar((byte) -4)) {
            if (!this.ah.am(2006265398)) {
                this.ah.ad(this.ae, this.aa.aw(914463829), client.ak, (byte) -44);
                if (!this.ah.am(1896230333)) {
                    return;
                }
            }
            this.ah.aj(i, i2, i3, i4, this.bf, this.bi * 1186360113, this.bo * 33318385, esVar, -1482726111);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ed(int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = i + (i3 / 2);
        int i7 = (((i4 / 2) + i2) - 18) - 20;
        esVar.al(i, i2, i3, i4, 0, (byte) 1);
        esVar.em(i6 - 152, i7, 304, 34, SupportMenu.CATEGORY_MASK, -774269319);
        esVar.al(i6 - 150, i7 + 2, i5 * 3, 30, SupportMenu.CATEGORY_MASK, (byte) 1);
        this.au.ap(go.nj, i6, i7 + 20, -1, -1, esVar);
    }

    /* Access modifiers changed, original: 0000 */
    public float ee(int i) {
        return i == 25 ? 1.0f : 37 == i ? 1.5f : 50 == i ? 2.0f : 75 == i ? 3.0f : i == 100 ? 4.0f : 8.0f;
    }

    public boolean ef() {
        return this.af.ar((byte) -5);
    }

    /* Access modifiers changed, original: 0000 */
    public void eg(int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = i + (i3 / 2);
        int i7 = (((i4 / 2) + i2) - 18) - 20;
        esVar.al(i, i2, i3, i4, 0, (byte) 1);
        esVar.em(i6 - 152, i7, 304, 34, SupportMenu.CATEGORY_MASK, 1137125322);
        esVar.al(i6 - 150, i7 + 2, i5 * 3, 30, SupportMenu.CATEGORY_MASK, (byte) 1);
        this.au.ap(go.nj, i6, i7 + 20, -1, -1, esVar);
    }

    public void eh(int i, int i2, int i3, int i4, es esVar) {
        if (this.af.ar((byte) -8)) {
            if (!this.ah.am(1688245331)) {
                this.ah.ad(this.ae, this.aa.aw(-1066310837), client.ak, (byte) 43);
                if (!this.ah.am(1662671831)) {
                    return;
                }
            }
            this.ah.aj(i, i2, i3, i4, this.bf, this.bi * 1186360113, this.bo * -524458685, esVar, -1482726111);
        }
    }

    public void ei(int i) {
        this.bk = at(i, (byte) 111);
    }

    public boolean ej() {
        return this.af.ar((byte) -47);
    }

    public void ek(int i) {
        this.bk = at(i, (byte) 33);
    }

    /* Access modifiers changed, original: 0000 */
    public float el(int i) {
        return i == 25 ? 1.0f : 37 == i ? 1.5f : 50 == i ? 2.0f : 75 == i ? 3.0f : i == 100 ? 4.0f : 8.0f;
    }

    public void em() {
        this.af.aq(-576930526);
    }

    public void en(int i) {
        this.bk = at(i, (byte) 104);
    }

    public void eo(int i, int i2, int i3, int i4, es esVar) {
        if (this.af.ar((byte) -44)) {
            if (!this.ah.am(1725699648)) {
                this.ah.ad(this.ae, this.aa.aw(298844646), client.ak, (byte) -62);
                if (!this.ah.am(1953141839)) {
                    return;
                }
            }
            this.ah.aj(i, i2, i3, i4, this.bf, this.bi * -1354406176, this.bo * -48795552, esVar, -1482726111);
        }
    }

    public int ep() {
        return 1.0d == ((double) this.bk) ? 25 : 1.5d == ((double) this.bk) ? 37 : 2.0d == ((double) this.bk) ? 50 : ((double) this.bk) == 3.0d ? 75 : ((double) this.bk) == 4.0d ? 100 : 200;
    }

    /* Access modifiers changed, original: 0000 */
    public void eq(int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (di.rl != null) {
            int i7 = 512 / (this.ah.aw * 1691763518);
            int i8 = i3 + 512;
            int i9 = i4 + 512;
            int i10 = i5 / 2;
            int i11 = i6 / 2;
            int bb = (bb(2018038096) - i11) - i7;
            int bf = ((bf((short) 22397) - i10) - i7) + i7;
            int i12 = i - ((-1301601889 * this.ah.aw) * (bf - (this.cb * 410319641)));
            int i13 = i2 - ((i7 - (bb - (this.ce * 1278663067))) * (this.ah.aw * -1301601889));
            if (af(i8, i9, i12, i13, i3, i4, -685741453)) {
                if (this.cp != null && i8 == this.cp.aq && this.cp.ar == i9) {
                    Arrays.fill(this.cp.ad, 0);
                } else {
                    this.cp = new ee(i8, i9);
                }
                this.cb = ((bf((short) 29744) - i10) - i7) * 1431580969;
                this.ce = ((bb(2124279224) - i11) - i7) * 415884435;
                this.ci = this.ah.aw * -437307761;
                di.rl.ai(this.cb * 410319641, this.ce * 1278663067, this.cp, (float) (this.ci * -1503302671), 1159237800);
                this.cy = client.rg * -1872401299;
                i7 = i - ((bf - (this.cb * 410319641)) * (this.ah.aw * -1301601889));
                i10 = i2 - ((this.ah.aw * -1301601889) * (i7 - (bb - (this.ce * 1278663067))));
            } else {
                i7 = i12;
                i10 = i13;
            }
            esVar.ar(i, i2, i3, i4, 0, 128, (byte) 15);
            esVar.ab(this.cp, i7, i10, 192, (short) 7493);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void er(int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = i + (i3 / 2);
        int i7 = (((i4 / 2) + i2) - 18) - 20;
        esVar.al(i, i2, i3, i4, 0, (byte) 1);
        esVar.em(i6 - 152, i7, 304, 34, SupportMenu.CATEGORY_MASK, -1346183658);
        esVar.al(i6 - 150, i7 + 2, i5 * 3, 30, SupportMenu.CATEGORY_MASK, (byte) 1);
        this.au.ap(go.nj, i6, i7 + 20, -1, -1, esVar);
    }

    public dm es(int i) {
        for (dm dmVar : this.aw.values()) {
            if (dmVar.az(1074380753) == i) {
                return dmVar;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void et(int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (di.rl != null) {
            int i7 = 512 / (this.ah.aw * -1083879936);
            int i8 = i3 - 1515122016;
            int i9 = i4 + 1658535910;
            int i10 = i5 / 2;
            int i11 = i6 / 2;
            int bb = (bb(1629384981) - i11) - i7;
            int bf = ((bf((short) 13343) - i10) - i7) + i7;
            int i12 = i - ((-1301601889 * this.ah.aw) * (bf - (this.cb * 410319641)));
            int i13 = i2 - ((i7 - (bb - (this.ce * 1278663067))) * (this.ah.aw * -1301601889));
            if (af(i8, i9, i12, i13, i3, i4, -685741453)) {
                if (this.cp != null && i8 == this.cp.aq && this.cp.ar == i9) {
                    Arrays.fill(this.cp.ad, 0);
                } else {
                    this.cp = new ee(i8, i9);
                }
                this.cb = ((bf((short) 29662) - i10) - i7) * 1431580969;
                this.ce = ((bb(1842027493) - i11) - i7) * 20295729;
                this.ci = this.ah.aw * 1712742116;
                di.rl.ai(1980030349 * this.cb, this.ce * -1477084940, this.cp, (float) (this.ci * -1503302671), 1023687344);
                this.cy = client.rg * 4370841;
                i7 = i - ((bf - (this.cb * 410319641)) * (this.ah.aw * -1169203056));
                i10 = i2 - ((this.ah.aw * -1301601889) * (i7 - (bb - (this.ce * 1306279721))));
            } else {
                i7 = i12;
                i10 = i13;
            }
            esVar.ar(i, i2, i3, i4, 0, 128, (byte) 15);
            esVar.ab(this.cp, i7, i10, -482148934, (short) 4866);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void eu(int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = i + (i3 / 2);
        int i7 = (((i4 / 2) + i2) - 18) - 20;
        esVar.al(i, i2, i3, i4, 0, (byte) 1);
        esVar.em(i6 - 152, i7, 304, 34, SupportMenu.CATEGORY_MASK, -457272440);
        esVar.al(i6 - 135862209, i7 + 2, i5 * 3, 30, SupportMenu.CATEGORY_MASK, (byte) 1);
        this.au.ap(go.nj, i6, i7 + 20, -1, -1, esVar);
    }

    public int ev() {
        return 1.0d == ((double) this.bk) ? 25 : 1.5d == ((double) this.bk) ? 37 : 2.0d == ((double) this.bk) ? 50 : ((double) this.bk) == 3.0d ? 75 : ((double) this.bk) == 4.0d ? 100 : 200;
    }

    /* Access modifiers changed, original: 0000 */
    public float ew(int i) {
        return i == 25 ? 1.0f : -281407204 == i ? 1.5f : 50 == i ? 2.0f : -1298851168 == i ? 3.0f : i == 100 ? 4.0f : 8.0f;
    }

    public boolean ex() {
        return this.af.ar((byte) -22);
    }

    /* Access modifiers changed, original: 0000 */
    public void ey(int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = i + (i3 / 2);
        int i7 = (((i4 / 2) + i2) - 18) - 20;
        esVar.al(i, i2, i3, i4, 0, (byte) 1);
        esVar.em(i6 - 152, i7, 304, 34, SupportMenu.CATEGORY_MASK, -811994406);
        esVar.al(i6 - 150, i7 + 2, i5 * 3, 30, SupportMenu.CATEGORY_MASK, (byte) 1);
        this.au.ap(go.nj, i6, i7 + 20, -1, -1, esVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void ez(int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (di.rl != null) {
            int i7 = 512 / (this.ah.aw * 1691763518);
            int i8 = i3 - 1638797228;
            int i9 = i4 - 1061796647;
            int i10 = i5 / 2;
            int i11 = i6 / 2;
            int bb = (bb(1753819183) - i11) - i7;
            int bf = ((bf((short) 17253) - i10) - i7) + i7;
            int i12 = i - ((-1301601889 * this.ah.aw) * (bf - (this.cb * -633450740)));
            int i13 = i2 - ((i7 - (bb - (this.ce * -1361565345))) * (this.ah.aw * -1302132045));
            if (af(i8, i9, i12, i13, i3, i4, -685741453)) {
                if (this.cp != null && i8 == this.cp.aq && this.cp.ar == i9) {
                    Arrays.fill(this.cp.ad, 0);
                } else {
                    this.cp = new ee(i8, i9);
                }
                this.cb = ((bf((short) 11370) - i10) - i7) * 1431580969;
                this.ce = ((bb(1782542932) - i11) - i7) * -1120830502;
                this.ci = this.ah.aw * -437307761;
                di.rl.ai(1286036165 * this.cb, this.ce * 1278663067, this.cp, (float) (this.ci * -938944351), 1258164508);
                this.cy = client.rg * 276691783;
                i7 = i - ((bf - (this.cb * 410319641)) * (this.ah.aw * -1301601889));
                i10 = i2 - ((this.ah.aw * -2080369047) * (i7 - (bb - (this.ce * 1278663067))));
            } else {
                i7 = i12;
                i10 = i13;
            }
            esVar.ar(i, i2, i3, i4, 0, 128, (byte) 15);
            esVar.ab(this.cp, i7, i10, 1119690145, (short) 11730);
        }
    }

    public int fb() {
        return this.aa == null ? -1 : (this.ay * 1228486495) + (this.aa.ah(-1821916464) * 64);
    }

    public int fc() {
        return this.aa == null ? -1 : (this.ay * 1228486495) + (this.aa.ah(-1821916464) * 64);
    }

    public int fe() {
        return this.aa == null ? -1 : (this.an * 1448508407) + (this.aa.ay((byte) -3) * -435428384);
    }

    public void fg(int i, int i2, int i3) {
        if (this.aa != null) {
            int[] ag = this.aa.ag(i, i2, i3, (byte) 30);
            if (ag != null) {
                bd(ag[0], ag[1], -2079750152);
            }
        }
    }

    public void fh(int i, int i2, int i3) {
        if (this.aa != null) {
            int[] ag = this.aa.ag(i, i2, i3, (byte) -106);
            if (ag != null) {
                bq(ag[0], ag[1], (byte) -46);
            }
        }
    }

    public void fi(int i, int i2, int i3) {
        if (this.aa != null) {
            int[] ag = this.aa.ag(i, i2, i3, (byte) -5);
            if (ag != null) {
                bd(ag[0], ag[1], -2079750152);
            }
        }
    }

    public void fj(int i, int i2, int i3) {
        if (this.aa != null) {
            int[] ag = this.aa.ag(i, i2, i3, (byte) 51);
            if (ag != null) {
                bd(ag[0], ag[1], -2079750152);
            }
        }
    }

    public ag fk() {
        return this.aa == null ? null : this.aa.ap(bf((short) 16277), bb(1594244919), 1648440750);
    }

    public int fl() {
        if (this.aa == null) {
            return -1;
        }
        return (this.aa.ay((byte) -1) * 64) + (this.an * 1448508407);
    }

    public void fm(int i, int i2) {
        if (this.aa != null) {
            am(i - (this.aa.ah(-1821916464) * 64), i2 - (this.aa.ay((byte) -56) * 64), true, 1603554598);
            this.ab = 1916201627;
            this.av = 275052497;
        }
    }

    public void fn(int i, int i2) {
        if (this.aa != null) {
            am(i - (this.aa.ah(-1821916464) * 64), i2 - (this.aa.ay((byte) -13) * 64), true, 1603554598);
            this.ab = 1916201627;
            this.av = 275052497;
        }
    }

    public int fo() {
        return this.aa == null ? -1 : (this.an * 1448508407) + (this.aa.ay((byte) 65) * 64);
    }

    public int fp() {
        return this.aa == null ? -1 : (this.an * -1260903870) + (this.aa.ay((byte) 6) * 64);
    }

    public dm fq(int i) {
        for (dm dmVar : this.aw.values()) {
            if (dmVar.az(1000209454) == i) {
                return dmVar;
            }
        }
        return null;
    }

    public void fs(int i, int i2) {
        if (this.aa != null) {
            am(i - (this.aa.ah(-1821916464) * 64), i2 - (this.aa.ay((byte) 18) * 64), true, 1603554598);
            this.ab = 1916201627;
            this.av = 275052497;
        }
    }

    public dm ft(int i) {
        for (dm dmVar : this.aw.values()) {
            if (dmVar.az(502984917) == i) {
                return dmVar;
            }
        }
        return null;
    }

    public int fu() {
        return this.aa == null ? -1 : (this.ay * 1228486495) + (this.aa.ah(-1821916464) * -747008238);
    }

    public void fw(int i, int i2) {
        if (this.aa != null && this.aa.as(i, i2, -1460030825)) {
            this.ab = (i - (this.aa.ah(-1821916464) * 64)) * -1916201627;
            this.av = (i2 - (this.aa.ay((byte) 7) * 723169771)) * -275052497;
        }
    }

    public dm fx(int i) {
        for (dm dmVar : this.aw.values()) {
            if (dmVar.az(-648969781) == i) {
                return dmVar;
            }
        }
        return null;
    }

    public void ga() {
        this.bo = -177632082;
    }

    public void gb(int i) {
        if (i >= 1) {
            this.bo = 1456736239 * i;
        }
    }

    public int gc() {
        return this.ba * -1516317465;
    }

    public void gd(int i) {
        int i2 = 0;
        this.bf = new HashSet();
        this.bb = 0;
        this.bi = 0;
        while (i2 < dy.ar * -494231741) {
            if (jg.aq(i2, (byte) 79) != null && jg.aq(i2, (byte) 82).an * -345210295 == i) {
                this.bf.add(Integer.valueOf(jg.aq(i2, (byte) 65).aj * -1701077253));
            }
            i2++;
        }
    }

    public void ge() {
        this.bd = 1909922589;
    }

    public void gf(int i) {
        int i2 = 0;
        this.bf = new HashSet();
        this.bb = 0;
        this.bi = 0;
        while (i2 < dy.ar * -494231741) {
            if (jg.aq(i2, (byte) 71) != null && jg.aq(i2, (byte) 114).an * -345210295 == i) {
                this.bf.add(Integer.valueOf(jg.aq(i2, (byte) 17).aj * -1701077253));
            }
            i2++;
        }
    }

    public void gg(int i) {
        this.bf = new HashSet();
        this.bf.add(Integer.valueOf(i));
        this.bb = 0;
        this.bi = 0;
    }

    public void gh(int i) {
        if (i >= 1) {
            this.bd = 636640863 * i;
        }
    }

    public void gi(int i) {
        if (i >= 1) {
            this.bd = 636640863 * i;
        }
    }

    public void gj(int i) {
        if (i >= 1) {
            this.bo = 1456736239 * i;
        }
    }

    public void gk(boolean z) {
        this.bl = z;
    }

    public int gl() {
        return this.bs * 28538893;
    }

    public void gm(boolean z) {
        this.bl = z;
    }

    public void gn(int i) {
        if (i >= 1) {
            this.bd = 636640863 * i;
        }
    }

    public int go() {
        return this.bs * 28538893;
    }

    public int gp() {
        return this.ba * -2136847635;
    }

    public void gq(int i) {
        this.bf = new HashSet();
        this.bf.add(Integer.valueOf(i));
        this.bb = 0;
        this.bi = 0;
    }

    public void gr(int i) {
        if (i >= 1) {
            this.bo = 1456736239 * i;
        }
    }

    public void gs() {
        this.bd = 1943391703;
    }

    public void gt() {
        this.bo = -177632082;
    }

    public void gu() {
        this.bd = 1909922589;
    }

    public void gv() {
        this.bd = 1909922589;
    }

    public int gw() {
        return this.ba * 1681075096;
    }

    public void gx() {
        this.bf = null;
    }

    public void gy(int i) {
        int i2 = 0;
        this.bf = new HashSet();
        this.bb = 0;
        this.bi = 0;
        while (i2 < dy.ar * -494231741) {
            if (jg.aq(i2, (byte) 107) != null && jg.aq(i2, (byte) 54).an * -345210295 == i) {
                this.bf.add(Integer.valueOf(jg.aq(i2, (byte) 120).aj * -1701077253));
            }
            i2++;
        }
    }

    public void gz() {
        this.bd = 1909922589;
    }

    public boolean ha() {
        return !this.bz;
    }

    public boolean hb(int i) {
        return !this.bh.contains(Integer.valueOf(i));
    }

    public void hc() {
        this.bf = null;
    }

    public void hd(boolean z) {
        this.bz = !z;
    }

    public boolean he() {
        return !this.bz;
    }

    public void hf(boolean z) {
        this.bz = !z;
    }

    public void hg() {
        this.bf = null;
    }

    public void hh(int i, boolean z) {
        if (z) {
            this.bj.remove(Integer.valueOf(i));
        } else {
            this.bj.add(Integer.valueOf(i));
        }
        cj(1470739949);
    }

    public void hi(int i, boolean z) {
        if (z) {
            this.bh.remove(Integer.valueOf(i));
        } else {
            this.bh.add(Integer.valueOf(i));
        }
        int i2 = 0;
        while (i2 < dy.ar * -494231741) {
            if (jg.aq(i2, (byte) 100) != null && jg.aq(i2, (byte) 12).an * -345210295 == i) {
                int i3 = jg.aq(i2, (byte) 108).aj * -1701077253;
                if (z) {
                    this.bt.remove(Integer.valueOf(i3));
                } else {
                    this.bt.add(Integer.valueOf(i3));
                }
            }
            i2++;
        }
        cj(-1242550722);
    }

    public void hj(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.af.ar((byte) 49)) {
            int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
            int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
            int i7 = ceil / 2;
            int i8 = ceil2 / 2;
            List<cf> ai = this.ah.ai(((1228486495 * this.ay) - i7) - 1, ((1448508407 * this.an) - i8) - 1, ((this.ay * 1228486495) + i7) + 1, ((this.an * 1448508407) + i8) + 1, i, i2, i3, i4, i5, i6, (byte) 46);
            if (!ai.isEmpty()) {
                for (cf cfVar : ai) {
                    dy aq = jg.aq(cfVar.aq((byte) -8), (byte) 93);
                    Object obj = null;
                    for (int length = this.cv.length - 1; length >= 0; length--) {
                        if (aq.ap[length] != null) {
                            gc.km.bi(aq.ap[length], aq.au, this.cv[length], cfVar.aq((byte) 37), cfVar.aq.ad((byte) -69), cfVar.ad.ad((byte) -59), (byte) 1);
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        return;
                    }
                }
            }
        }
    }

    public void hk(int i, boolean z) {
        if (z) {
            this.bj.remove(Integer.valueOf(i));
        } else {
            this.bj.add(Integer.valueOf(i));
        }
        cj(2102264995);
    }

    public void hl(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.af.ar((byte) -39)) {
            int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
            int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
            int i7 = ceil / 2;
            int i8 = ceil2 / 2;
            List<cf> ai = this.ah.ai(((1228486495 * this.ay) - i7) - 1, ((1448508407 * this.an) - i8) - 1, ((this.ay * 1228486495) + i7) + 1, ((this.an * 1448508407) + i8) + 1, i, i2, i3, i4, i5, i6, (byte) 101);
            if (!ai.isEmpty()) {
                for (cf cfVar : ai) {
                    dy aq = jg.aq(cfVar.aq((byte) -98), (byte) 35);
                    Object obj = null;
                    for (int length = this.cv.length - 1; length >= 0; length--) {
                        if (aq.ap[length] != null) {
                            gc.km.bi(aq.ap[length], aq.au, this.cv[length], cfVar.aq((byte) 12), cfVar.aq.ad((byte) -43), cfVar.ad.ad((byte) 101), (byte) 1);
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        return;
                    }
                }
            }
        }
    }

    public boolean hm(int i) {
        return !this.bh.contains(Integer.valueOf(i));
    }

    /* Access modifiers changed, original: 0000 */
    public void hn() {
        this.bn.clear();
        this.bn.addAll(this.bj);
        this.bn.addAll(this.bt);
    }

    public boolean ho(int i) {
        return !this.bh.contains(Integer.valueOf(i));
    }

    public void hp() {
        this.bf = null;
    }

    public void hq(boolean z) {
        this.bz = !z;
    }

    public void hr(boolean z) {
        this.bz = !z;
    }

    public boolean hs(int i) {
        return !this.bj.contains(Integer.valueOf(i));
    }

    public void ht(int i, boolean z) {
        if (z) {
            this.bh.remove(Integer.valueOf(i));
        } else {
            this.bh.add(Integer.valueOf(i));
        }
        int i2 = 0;
        while (i2 < dy.ar * -494231741) {
            if (jg.aq(i2, (byte) 25) != null && jg.aq(i2, (byte) 13).an * -345210295 == i) {
                int i3 = jg.aq(i2, (byte) 64).aj * -1701077253;
                if (z) {
                    this.bt.remove(Integer.valueOf(i3));
                } else {
                    this.bt.add(Integer.valueOf(i3));
                }
            }
            i2++;
        }
        cj(92525768);
    }

    public void hu(int i, boolean z) {
        if (z) {
            this.bh.remove(Integer.valueOf(i));
        } else {
            this.bh.add(Integer.valueOf(i));
        }
        int i2 = 0;
        while (i2 < dy.ar * -2124125878) {
            if (jg.aq(i2, (byte) 58) != null && jg.aq(i2, (byte) 83).an * 954833145 == i) {
                int i3 = jg.aq(i2, (byte) 74).aj * -177226;
                if (z) {
                    this.bt.remove(Integer.valueOf(i3));
                } else {
                    this.bt.add(Integer.valueOf(i3));
                }
            }
            i2++;
        }
        cj(2039500255);
    }

    public boolean hv(int i) {
        return !this.bj.contains(Integer.valueOf(i));
    }

    public boolean hw(int i) {
        return !this.bj.contains(Integer.valueOf(i));
    }

    public void hx(int i, boolean z) {
        if (z) {
            this.bh.remove(Integer.valueOf(i));
        } else {
            this.bh.add(Integer.valueOf(i));
        }
        int i2 = 0;
        while (i2 < dy.ar * -494231741) {
            if (jg.aq(i2, (byte) 33) != null && jg.aq(i2, (byte) 97).an * -622677045 == i) {
                int i3 = jg.aq(i2, (byte) 122).aj * 803555543;
                if (z) {
                    this.bt.remove(Integer.valueOf(i3));
                } else {
                    this.bt.add(Integer.valueOf(i3));
                }
            }
            i2++;
        }
        cj(324218505);
    }

    public boolean hy(int i) {
        return !this.bh.contains(Integer.valueOf(i));
    }

    public boolean hz(int i) {
        return !this.bj.contains(Integer.valueOf(i));
    }

    public void ic(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.af.ar((byte) 70)) {
            int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
            int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
            int i7 = ceil / 2;
            int i8 = ceil2 / 2;
            List<cf> ai = this.ah.ai(((1228486495 * this.ay) - i7) - 1, ((1448508407 * this.an) - i8) - 1, ((this.ay * 1228486495) + i7) + 1, ((this.an * 1448508407) + i8) + 1, i, i2, i3, i4, i5, i6, (byte) 45);
            if (!ai.isEmpty()) {
                for (cf cfVar : ai) {
                    dy aq = jg.aq(cfVar.aq((byte) -22), (byte) 61);
                    Object obj = null;
                    for (int length = this.cv.length - 1; length >= 0; length--) {
                        if (aq.ap[length] != null) {
                            gc.km.bi(aq.ap[length], aq.au, this.cv[length], cfVar.aq((byte) 6), cfVar.aq.ad((byte) -56), cfVar.ad.ad((byte) -46), (byte) 1);
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        return;
                    }
                }
            }
        }
    }

    public void id(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.af.ar((byte) 0)) {
            int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
            int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
            int i7 = ceil / 2;
            int i8 = ceil2 / 2;
            List<cf> ai = this.ah.ai(((1228486495 * this.ay) - i7) - 1, ((1448508407 * this.an) - i8) - 1, ((this.ay * 1228486495) + i7) + 1, ((this.an * 1448508407) + i8) + 1, i, i2, i3, i4, i5, i6, (byte) 54);
            if (!ai.isEmpty()) {
                for (cf cfVar : ai) {
                    dy aq = jg.aq(cfVar.aq((byte) -5), (byte) 86);
                    Object obj = null;
                    for (int length = this.cv.length - 1; length >= 0; length--) {
                        if (aq.ap[length] != null) {
                            gc.km.bi(aq.ap[length], aq.au, this.cv[length], cfVar.aq((byte) -27), cfVar.aq.ad((byte) 85), cfVar.ad.ad((byte) -93), (byte) 1);
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        return;
                    }
                }
            }
        }
    }

    public ag ie(int i, ag agVar) {
        cf cfVar = null;
        if (!this.af.ar((byte) 65) || !this.ah.am(2054974872) || !this.aa.as(agVar.aq * -1822118049, agVar.ar * 738029977, -942000951)) {
            return null;
        }
        List<cf> list = (List) this.ah.ak((byte) -36).get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i2 = -1;
        for (cf cfVar2 : list) {
            int i3 = (cfVar2.ad.aq * -1822118049) - (agVar.aq * -1822118049);
            int i4 = (cfVar2.ad.ar * 738029977) - (agVar.ar * 738029977);
            i3 = (i3 * i3) + (i4 * i4);
            if (i3 == 0) {
                return cfVar2.ad;
            }
            if (i3 < i2 || cfVar == null) {
                cfVar = cfVar2;
                i2 = i3;
            }
        }
        return cfVar.ad;
    }

    /* renamed from: if */
    public void m234if(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.af.ar((byte) -5)) {
            int ceil = (int) Math.ceil((double) (((float) i3) / this.at));
            int ceil2 = (int) Math.ceil((double) (((float) i4) / this.at));
            int i7 = ceil / 2;
            int i8 = ceil2 / 2;
            List<cf> ai = this.ah.ai(((1228486495 * this.ay) - i7) - 1, ((1759482038 * this.an) - i8) - 1, ((this.ay * 1228486495) + i7) + 1, ((this.an * 1448508407) + i8) + 1, i, i2, i3, i4, i5, i6, (byte) 42);
            if (!ai.isEmpty()) {
                for (cf cfVar : ai) {
                    dy aq = jg.aq(cfVar.aq((byte) 39), (byte) 65);
                    Object obj = null;
                    for (int length = this.cv.length - 1; length >= 0; length--) {
                        if (aq.ap[length] != null) {
                            gc.km.bi(aq.ap[length], aq.au, this.cv[length], cfVar.aq((byte) -61), cfVar.aq.ad((byte) -71), cfVar.ad.ad((byte) -7), (byte) 1);
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        return;
                    }
                }
            }
        }
    }

    public cf ih() {
        if (this.cm == null) {
            return null;
        }
        while (this.cm.hasNext()) {
            cf cfVar = (cf) this.cm.next();
            if (cfVar.aq((byte) -18) != -1) {
                return cfVar;
            }
        }
        return null;
    }

    public cf ik() {
        if (this.cm == null) {
            return null;
        }
        while (this.cm.hasNext()) {
            cf cfVar = (cf) this.cm.next();
            if (cfVar.aq((byte) 18) != -1) {
                return cfVar;
            }
        }
        return null;
    }

    public cf in() {
        if (this.cm == null) {
            return null;
        }
        while (this.cm.hasNext()) {
            cf cfVar = (cf) this.cm.next();
            if (cfVar.aq((byte) -28) != -1) {
                return cfVar;
            }
        }
        return null;
    }

    public void io(int i, int i2, ag agVar, ag agVar2) {
        il ilVar = new il();
        ilVar.ad(new Object[]{new dt(i2, agVar, agVar2)}, 210212877);
        switch (i) {
            case 1008:
                ilVar.aq(10, -1241127690);
                break;
            case 1009:
                ilVar.aq(11, -507904966);
                break;
            case 1010:
                ilVar.aq(12, -612245890);
                break;
            case 1011:
                ilVar.aq(13, -217872322);
                break;
            case 1012:
                ilVar.aq(14, 1793190053);
                break;
        }
        dm.ad(ilVar, 1930405848);
    }

    public cf iq() {
        if (!this.af.ar((byte) -30) || !this.ah.am(2143049774)) {
            return null;
        }
        HashMap ak = this.ah.ak((byte) 29);
        this.cj = new LinkedList();
        for (List addAll : ak.values()) {
            this.cj.addAll(addAll);
        }
        this.cm = this.cj.iterator();
        return cp((byte) 100);
    }

    public void iv(int i, int i2, ag agVar, ag agVar2) {
        il ilVar = new il();
        ilVar.ad(new Object[]{new dt(i2, agVar, agVar2)}, 323163299);
        switch (i) {
            case 1008:
                ilVar.aq(10, -285826677);
                break;
            case 1009:
                ilVar.aq(11, -561655068);
                break;
            case 1010:
                ilVar.aq(12, -298454755);
                break;
            case 1011:
                ilVar.aq(13, 1969152467);
                break;
            case 1012:
                ilVar.aq(14, -537363315);
                break;
        }
        dm.ad(ilVar, 1417347259);
    }

    public void iw(int i, int i2, ag agVar, ag agVar2) {
        il ilVar = new il();
        ilVar.ad(new Object[]{new dt(i2, agVar, agVar2)}, 159240932);
        switch (i) {
            case 1008:
                ilVar.aq(10, 980980360);
                break;
            case 1009:
                ilVar.aq(11, 1540704200);
                break;
            case 1010:
                ilVar.aq(12, -112414721);
                break;
            case 1011:
                ilVar.aq(13, 1423992628);
                break;
            case 1012:
                ilVar.aq(14, 538464608);
                break;
        }
        dm.ad(ilVar, -1357169987);
    }

    public cf ix() {
        if (this.cm == null) {
            return null;
        }
        while (this.cm.hasNext()) {
            cf cfVar = (cf) this.cm.next();
            if (cfVar.aq((byte) 68) != -1) {
                return cfVar;
            }
        }
        return null;
    }
}
