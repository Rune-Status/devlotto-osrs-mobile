package defpackage;

import android.support.v4.internal.view.SupportMenu;
import java.util.Collection;

/* renamed from: dr */
public class dr extends mp {
    static kh ad = null;
    static gz ai = new gz(20, null);
    static gz aj = new gz(64, null);
    public static final int ak = 1;
    static gz al = new gz(64, null);
    static kh aq;
    static kh ar;
    static ee[] gj;
    int aa;
    public int ab;
    int ac;
    public int af;
    public int ah;
    public int an;
    public int ao;
    int ap;
    int at;
    public int au;
    public int[] av;
    int aw;
    int ax;
    String ay;
    public int az;
    int bk;

    dr() {
        try {
            this.ap = 1487160337;
            this.au = -386986449;
            this.az = -252408826;
            this.ax = 1241862821;
            this.aw = -2018736021;
            this.ac = 1004376671;
            this.aa = -2080100933;
            this.ao = 0;
            this.ah = 0;
            this.af = -1408856347;
            this.ay = "";
            this.an = -685622857;
            this.ab = 0;
            this.at = 825639421;
            this.bk = -745626577;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dr.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String aj(CharSequence charSequence, int i) {
        try {
            String ar = jx.ar(ko.ad(charSequence, -171009555));
            return ar == null ? "" : ar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dr.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void au(kh khVar, kh khVar2, kh khVar3) {
        ad = khVar;
        aq = khVar2;
        ar = khVar3;
    }

    public static dr aw(int i) {
        long j = (long) i;
        dr drVar = (dr) al.ad(j);
        if (drVar == null) {
            byte[] ar = ad.ar(32, i, 1303575316);
            drVar = new dr();
            if (ar != null) {
                drVar.ar(new lj(ar), -907787660);
            }
            al.ar(drVar, j);
        }
        return drVar;
    }

    public static dr ax(int i) {
        long j = (long) i;
        dr drVar = (dr) al.ad(j);
        if (drVar == null) {
            byte[] ar = ad.ar(-195790367, i, 1248089087);
            drVar = new dr();
            if (ar != null) {
                drVar.ar(new lj(ar), -907787660);
            }
            al.ar(drVar, j);
        }
        return drVar;
    }

    public static void az(kh khVar, kh khVar2, kh khVar3) {
        ad = khVar;
        aq = khVar2;
        ar = khVar3;
    }

    public static void bg(Collection collection) {
        collection.add(al);
        collection.add(aj);
        collection.add(ai);
    }

    public static void bu(Collection collection) {
        collection.add(al);
        collection.add(aj);
        collection.add(ai);
    }

    public static void bx(Collection collection) {
        collection.add(al);
        collection.add(aj);
        collection.add(ai);
    }

    static final void ga(al alVar, int i, int i2, int i3) {
        try {
            if (client.lx == null && !gc.km.cv((byte) -81) && alVar != null && ji.gq(alVar, 1362235980) != null) {
                client.bh.ah = true;
                client.lx = alVar;
                client.lo = ji.gq(alVar, 2088267783);
                client.le = -639717277 * i;
                client.la = -1026271039 * i2;
                ck.ld = 0;
                client.lp = false;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dr.ga(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, (byte) 16);
            } else {
                return;
            }
        }
    }

    public String ab(int i) {
        String str = this.ay;
        while (true) {
            int indexOf = str.indexOf("%1");
            if (indexOf < 0) {
                return str;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str.substring(0, indexOf));
            stringBuilder.append(ic.ae(i, false, (byte) -71));
            stringBuilder.append(str.substring(indexOf + 2));
            str = stringBuilder.toString();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, (byte) 126);
            } else {
                return;
            }
        }
    }

    public ee ae(byte b) {
        try {
            if (this.ax * -1585595693 < 0) {
                return null;
            }
            ee eeVar = (ee) aj.ad((long) (this.ax * -1585595693));
            if (eeVar != null) {
                return eeVar;
            }
            eeVar = jc.ai(aq, this.ax * -1585595693, 0, (byte) 10);
            if (eeVar == null) {
                return eeVar;
            }
            aj.ar(eeVar, (long) (this.ax * -1585595693));
            return eeVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dr.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final dr af() {
        int ad = -1 != this.at * 2041011371 ? cd.ad(this.at * 2041011371, 995014669) : this.bk * -1511334607 != -1 ? aj.ar[this.bk * -1511334607] : -1;
        ad = (ad < 0 || ad >= this.av.length - 1) ? this.av[this.av.length - 1] : this.av[ad];
        return ad != -1 ? ba.aq(ad, 70441239) : null;
    }

    public oi ag(int i) {
        try {
            if (this.ap * 333894415 == -1) {
                return null;
            }
            oi oiVar = (oi) ai.ad((long) (this.ap * 333894415));
            if (oiVar != null) {
                return oiVar;
            }
            oiVar = hy.ae(aq, ar, this.ap * 333894415, 0, (short) -6927);
            if (oiVar == null) {
                return oiVar;
            }
            ai.ar(oiVar, (long) (this.ap * 333894415));
            return oiVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dr.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:53:0x012c, code skipped:
            if (r0 == android.support.v4.internal.view.SupportMenu.USER_MASK) goto L_0x012e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ah(lj ljVar, int i) {
        int i2 = 0;
        if (i == 1) {
            this.ap = ljVar.bi(699940790) * -1487160337;
        } else if (2 == i) {
            this.au = ljVar.av((byte) -94) * -1025921688;
        } else if (3 == i) {
            this.ax = ljVar.bi(1963184799) * -1846823329;
        } else if (i == 4) {
            this.ac = ljVar.bi(1374065061) * -1004376671;
        } else if (i == 5) {
            this.aw = ljVar.bi(-406532111) * 681036910;
        } else if (i == 6) {
            this.aa = ljVar.bi(1537787967) * 2080100933;
        } else if (7 == i) {
            this.ao = ljVar.ab(1548452526) * 1831864141;
        } else if (i == 8) {
            this.ay = ljVar.bq(800519949);
        } else if (i == 9) {
            this.az = ljVar.an(-1464407032) * -842575499;
        } else if (i == 10) {
            this.ah = ljVar.ab(-1966458139) * -1934842273;
        } else if (i == 11) {
            this.af = 0;
        } else if (i == 12) {
            this.an = ljVar.af(1804771424) * -728083249;
        } else if (i == 13) {
            this.ab = ljVar.ab(-499178665) * -1466920051;
        } else if (14 == i) {
            this.af = ljVar.an(-1464407032) * -1468019469;
        } else if (i == 17 || 18 == i) {
            int an;
            this.at = ljVar.an(-1464407032) * -488280700;
            if (976222788 == this.at * 2041011371) {
                this.at = 980931177;
            }
            this.bk = ljVar.an(-1464407032) * 745626577;
            if (this.bk * 1662167630 == SupportMenu.USER_MASK) {
                this.bk = -745626577;
            }
            if (18 == i) {
                an = ljVar.an(-1464407032);
            }
            an = -1;
            int af = ljVar.af(1804771424);
            this.av = new int[(af + 2)];
            while (i2 <= af) {
                this.av[i2] = ljVar.an(-1464407032);
                if (this.av[i2] == 65535) {
                    this.av[i2] = -1;
                }
                i2++;
            }
            this.av[af + 1] = an;
        }
    }

    public String ai(int i, int i2) {
        try {
            String str = this.ay;
            while (true) {
                int indexOf = str.indexOf("%1");
                if (indexOf < 0) {
                    return str;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.substring(0, indexOf));
                stringBuilder.append(ic.ae(i, false, (byte) 26));
                stringBuilder.append(str.substring(indexOf + 2));
                str = stringBuilder.toString();
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("dr.ai(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public final dr aj(int i) {
        try {
            int ad = -1 != this.at * 2041011371 ? cd.ad(this.at * 2041011371, 709264442) : this.bk * -1511334607 != -1 ? aj.ar[this.bk * -1511334607] : -1;
            ad = (ad < 0 || ad >= this.av.length - 1) ? this.av[this.av.length - 1] : this.av[ad];
            return ad != -1 ? ba.aq(ad, -505345355) : null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dr.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ee ak(int i) {
        try {
            if (this.ac * -293292447 < 0) {
                return null;
            }
            ee eeVar = (ee) aj.ad((long) (this.ac * -293292447));
            if (eeVar != null) {
                return eeVar;
            }
            eeVar = jc.ai(aq, this.ac * -293292447, 0, (byte) -101);
            if (eeVar == null) {
                return eeVar;
            }
            aj.ar(eeVar, (long) (this.ac * -293292447));
            return eeVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dr.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:60:0x0150, code skipped:
            if (r0 == android.support.v4.internal.view.SupportMenu.USER_MASK) goto L_0x0152;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void al(lj ljVar, int i, byte b) {
        if (i == 1) {
            try {
                this.ap = ljVar.bi(876141757) * -1487160337;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dr.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (2 == i) {
            this.au = ljVar.av((byte) -57) * -401542703;
        } else if (3 == i) {
            this.ax = ljVar.bi(1485721488) * -1241862821;
        } else if (i == 4) {
            this.ac = ljVar.bi(-194847720) * -1004376671;
        } else if (i == 5) {
            this.aw = ljVar.bi(1855886919) * 2018736021;
        } else if (i == 6) {
            this.aa = ljVar.bi(1061344661) * 2080100933;
        } else if (7 == i) {
            this.ao = ljVar.ab(1979163110) * 1831864141;
        } else if (i == 8) {
            this.ay = ljVar.bq(800519949);
        } else if (i == 9) {
            this.az = ljVar.an(-1464407032) * -249032543;
        } else if (i == 10) {
            this.ah = ljVar.ab(180165028) * 241800543;
        } else if (i == 11) {
            this.af = 0;
        } else if (i == 12) {
            this.an = ljVar.af(1804771424) * 685622857;
        } else if (i == 13) {
            this.ab = ljVar.ab(1361052973) * -1234727543;
        } else if (14 == i) {
            this.af = ljVar.an(-1464407032) * 1408856347;
        } else if (i == 17 || 18 == i) {
            int an;
            this.at = ljVar.an(-1464407032) * -825639421;
            if (SupportMenu.USER_MASK == this.at * 2041011371) {
                this.at = 825639421;
            }
            this.bk = ljVar.an(-1464407032) * 745626577;
            if (this.bk * -1511334607 == SupportMenu.USER_MASK) {
                this.bk = -745626577;
            }
            if (18 == i) {
                an = ljVar.an(-1464407032);
            }
            an = -1;
            int af = ljVar.af(1804771424);
            this.av = new int[(af + 2)];
            for (int i2 = 0; i2 <= af; i2++) {
                this.av[i2] = ljVar.an(-1464407032);
                if (this.av[i2] == 65535) {
                    this.av[i2] = -1;
                }
            }
            this.av[af + 1] = an;
        }
    }

    public ee am(int i) {
        try {
            if (this.aw * 682892221 < 0) {
                return null;
            }
            ee eeVar = (ee) aj.ad((long) (this.aw * 682892221));
            if (eeVar != null) {
                return eeVar;
            }
            eeVar = jc.ai(aq, this.aw * 682892221, 0, (byte) -52);
            if (eeVar == null) {
                return eeVar;
            }
            aj.ar(eeVar, (long) (this.aw * 682892221));
            return eeVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dr.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String an(int i) {
        String str = this.ay;
        while (true) {
            int indexOf = str.indexOf("%1");
            if (indexOf < 0) {
                return str;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str.substring(0, indexOf));
            stringBuilder.append(ic.ae(i, false, (byte) 7));
            stringBuilder.append(str.substring(indexOf + 2));
            str = stringBuilder.toString();
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:53:0x012f, code skipped:
            if (r0 == 1752302559) goto L_0x0131;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ao(lj ljVar, int i) {
        int i2 = 0;
        if (i == 1) {
            this.ap = ljVar.bi(-331489950) * -1487160337;
        } else if (2 == i) {
            this.au = ljVar.av((byte) -70) * -401542703;
        } else if (3 == i) {
            this.ax = ljVar.bi(-722145593) * -1241862821;
        } else if (i == 4) {
            this.ac = ljVar.bi(-759764369) * -372623564;
        } else if (i == 5) {
            this.aw = ljVar.bi(-159543910) * -1623747449;
        } else if (i == 6) {
            this.aa = ljVar.bi(-95638494) * 1307515942;
        } else if (7 == i) {
            this.ao = ljVar.ab(-1143869288) * -1128333761;
        } else if (i == 8) {
            this.ay = ljVar.bq(800519949);
        } else if (i == 9) {
            this.az = ljVar.an(-1464407032) * -249032543;
        } else if (i == 10) {
            this.ah = ljVar.ab(141292665) * 1106259341;
        } else if (i == 11) {
            this.af = 0;
        } else if (i == 12) {
            this.an = ljVar.af(1804771424) * 1562762251;
        } else if (i == 13) {
            this.ab = ljVar.ab(437437787) * -1617750397;
        } else if (14 == i) {
            this.af = ljVar.an(-1464407032) * 386121948;
        } else if (i == 17 || 18 == i) {
            int an;
            this.at = ljVar.an(-1464407032) * -290387118;
            if (-1879822135 == this.at * -774005427) {
                this.at = 825639421;
            }
            this.bk = ljVar.an(-1464407032) * 745626577;
            if (this.bk * -1511334607 == SupportMenu.USER_MASK) {
                this.bk = -745626577;
            }
            if (18 == i) {
                an = ljVar.an(-1464407032);
            }
            an = -1;
            int af = ljVar.af(1804771424);
            this.av = new int[(af + 2)];
            while (i2 <= af) {
                this.av[i2] = ljVar.an(-1464407032);
                if (this.av[i2] == 65535) {
                    this.av[i2] = -1;
                }
                i2++;
            }
            this.av[af + 1] = an;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, int i) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    al(ljVar, af, (byte) 120);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dr.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public ee as(int i) {
        try {
            if (this.aa * -1115459443 < 0) {
                return null;
            }
            ee eeVar = (ee) aj.ad((long) (this.aa * -1115459443));
            if (eeVar != null) {
                return eeVar;
            }
            eeVar = jc.ai(aq, this.aa * -1115459443, 0, (byte) 34);
            if (eeVar == null) {
                return eeVar;
            }
            aj.ar(eeVar, (long) (this.aa * -1115459443));
            return eeVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dr.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ee at() {
        if (this.ax * -1585595693 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.ax * -1585595693));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.ax * -1585595693, 0, (byte) 66);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.ax * -1585595693));
        return eeVar;
    }

    public String av(int i) {
        String str = this.ay;
        while (true) {
            int indexOf = str.indexOf("%1");
            if (indexOf < 0) {
                return str;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str.substring(0, indexOf));
            stringBuilder.append(ic.ae(i, false, (byte) 1));
            stringBuilder.append(str.substring(indexOf + 2));
            str = stringBuilder.toString();
        }
    }

    public final dr ay() {
        int ad = -1 != this.at * 2041011371 ? cd.ad(this.at * 2041011371, 1924145717) : this.bk * 1288513536 != -1 ? aj.ar[this.bk * -1511334607] : -1;
        ad = (ad < 0 || ad >= this.av.length - 1) ? this.av[this.av.length - 1] : this.av[ad];
        return ad != -1 ? ba.aq(ad, 849680992) : null;
    }

    public ee ba() {
        if (this.ax * 1929513506 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.ax * 1494931811));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.ax * 449785940, 0, (byte) 25);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.ax * 584305983));
        return eeVar;
    }

    public ee bb() {
        if (this.ac * 609747043 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.ac * 834733812));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.ac * -293292447, 0, (byte) -7);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.ac * 1863610565));
        return eeVar;
    }

    public ee bc() {
        if (this.aa * -1115459443 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.aa * -1115459443));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.aa * -1115459443, 0, (byte) 9);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.aa * -1115459443));
        return eeVar;
    }

    public ee bd() {
        if (this.aw * 494681397 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.aw * 2109420398));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.aw * 682892221, 0, (byte) -33);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.aw * 682892221));
        return eeVar;
    }

    public ee bf() {
        if (this.ac * -293292447 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.ac * -293292447));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.ac * -293292447, 0, (byte) 50);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.ac * -293292447));
        return eeVar;
    }

    public ee bi() {
        if (this.aa * -1115459443 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.aa * -787607645));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.aa * -223415999, 0, (byte) -27);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.aa * 86517841));
        return eeVar;
    }

    public ee bk() {
        if (this.ax * -1585595693 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.ax * -1585595693));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.ax * -1585595693, 0, (byte) -50);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.ax * -1585595693));
        return eeVar;
    }

    public ee bl() {
        if (this.ac * -293292447 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.ac * -293292447));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.ac * -293292447, 0, (byte) 66);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.ac * -293292447));
        return eeVar;
    }

    public ee bm() {
        if (this.aw * 682892221 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.aw * 682892221));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.aw * 682892221, 0, (byte) -98);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.aw * 682892221));
        return eeVar;
    }

    public ee bo() {
        if (this.ac * -293292447 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.ac * -293292447));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.ac * -293292447, 0, (byte) 22);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.ac * -293292447));
        return eeVar;
    }

    public ee bq() {
        if (this.aw * 682892221 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.aw * 198792179));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.aw * 1283647204, 0, (byte) -51);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.aw * 938218731));
        return eeVar;
    }

    public ee bs() {
        if (this.ax * -1418401551 < 0) {
            return null;
        }
        ee eeVar = (ee) aj.ad((long) (this.ax * -1585595693));
        if (eeVar != null) {
            return eeVar;
        }
        eeVar = jc.ai(aq, this.ax * 774393656, 0, (byte) -29);
        if (eeVar == null) {
            return eeVar;
        }
        aj.ar(eeVar, (long) (this.ax * 297534649));
        return eeVar;
    }

    public oi bv() {
        if (this.ap * 217655249 == -1) {
            return null;
        }
        oi oiVar = (oi) ai.ad((long) (this.ap * 333894415));
        if (oiVar != null) {
            return oiVar;
        }
        oiVar = hy.ae(aq, ar, this.ap * 333894415, 0, (short) -14454);
        if (oiVar == null) {
            return oiVar;
        }
        ai.ar(oiVar, (long) (this.ap * 333894415));
        return oiVar;
    }
}
