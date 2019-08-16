package defpackage;

/* renamed from: hs */
public class hs {
    static final int ad = 0;
    static ee ao = null;
    static final int aq = 1;
    int ae;
    public final ek ai;
    public final ea aj;
    final my al;

    hs(my myVar) {
        try {
            this.ae = 0;
            this.al = myVar;
            this.aj = new ea(myVar);
            this.ai = new ek(myVar);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ag(String str, short s) {
        try {
            return str.length() + 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int ah(int i, int i2, int i3) {
        int i4 = 126;
        if (i == -2) {
            return 12345678;
        }
        if (i != -1) {
            try {
                int i5 = ((i & 127) * i2) / 128;
                if (i5 < 2) {
                    i4 = 2;
                } else if (i5 <= 126) {
                    i4 = i5;
                }
                return (65408 & i) + i4;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("hs.ah(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (i2 < 2) {
            return 2;
        } else {
            if (i2 > 126) {
                i2 = 126;
            }
            return i2;
        }
    }

    static Class aj(String str, int i) throws ClassNotFoundException {
        try {
            return str.equals("B") ? Byte.TYPE : str.equals("I") ? Integer.TYPE : str.equals("S") ? Short.TYPE : str.equals("J") ? Long.TYPE : str.equals("Z") ? Boolean.TYPE : str.equals("F") ? Float.TYPE : str.equals("D") ? Double.TYPE : str.equals("C") ? Character.TYPE : str.equals("void") ? Void.TYPE : Class.forName(str);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String aq(int i, int i2) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<col=");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(">");
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("hs.aq(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    static final void bh(String str) {
        iq.aq(30, "", str, 129278213);
    }

    static final void bj(String str) {
        iq.aq(30, "", str, -2010854604);
    }

    static final void bn(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(go.hg);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void bp(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(go.hk);
        stringBuilder.append(str);
        stringBuilder.append(go.hh);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void bt(String str) {
        iq.aq(30, "", str, -154887399);
    }

    static final void by(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(go.hg);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void bz(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(go.hg);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void cd(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(go.hd);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void cf(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(go.ht);
        stringBuilder.append(str);
        stringBuilder.append(go.hx);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void cg(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(go.ht);
        stringBuilder.append(str);
        stringBuilder.append(go.hx);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void ch() {
        oz.ak(go.hq, -769293814);
    }

    static final void cj(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(go.hk);
        stringBuilder.append(str);
        stringBuilder.append(go.hh);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void ck() {
        oz.ak(go.hr, -769293814);
    }

    static final void cl(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(go.hd);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void cm() {
        oz.ak(go.hf, -769293814);
    }

    static final void cn(String str) {
        ns aq = ib.aq(no.dc, client.eb.aj, -60667500);
        aq.ar.al(hs.ag(str, (short) -8169), -1013248233);
        aq.ar.ap(str, 635769462);
        client.eb.ar(aq, -840294789);
    }

    static final void co() {
        oz.ak(go.hr, -769293814);
    }

    static final void cq(String str) {
        ns aq = ib.aq(no.dc, client.eb.aj, 212345595);
        aq.ar.al(hs.ag(str, (short) -7180), -2087622788);
        aq.ar.ap(str, 635769462);
        client.eb.ar(aq, 741767460);
    }

    static final void cu() {
        oz.ak(go.hr, -769293814);
    }

    static final void cv(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(go.hk);
        stringBuilder.append(str);
        stringBuilder.append(go.hh);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void cw(String str) {
        ns aq = ib.aq(no.dc, client.eb.aj, 149946773);
        aq.ar.al(hs.ag(str, (short) 24123), -1764858473);
        aq.ar.ap(str, 635769462);
        client.eb.ar(aq, -1528358708);
    }

    static final void cz(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(go.hd);
        oz.ak(stringBuilder.toString(), -769293814);
    }

    static final void db(String str, int i) {
        ns aq = ib.aq(no.ch, client.eb.aj, 1800874397);
        aq.ar.al(hs.ag(str, (short) 17716) + 1, -1330012229);
        aq.ar.ap(str, 635769462);
        aq.ar.al(i, -677661036);
        client.eb.ar(aq, -1031099485);
    }

    static final void dc(String str, int i) {
        ns aq = ib.aq(no.ch, client.eb.aj, -290569289);
        aq.ar.al(hs.ag(str, (short) 27039) + 1, -2081449655);
        aq.ar.ap(str, 635769462);
        aq.ar.al(i, -974245744);
        client.eb.ar(aq, -744843149);
    }

    static final void dd() {
        oz.ak(go.hq, -769293814);
    }

    static final void dm() {
        oz.ak(go.hq, -769293814);
    }

    static final void dt(String str) {
        ns aq = ib.aq(no.dp, client.eb.aj, -314064125);
        aq.ar.al(hs.ag(str, (short) -301), -1557662931);
        aq.ar.ap(str, 635769462);
        client.eb.ar(aq, -269735911);
    }

    static final void du(String str, int i) {
        ns aq = ib.aq(no.ch, client.eb.aj, 1084642183);
        aq.ar.al(hs.ag(str, (short) -21502) + 1, -510244104);
        aq.ar.ap(str, 635769462);
        aq.ar.al(i, -837666958);
        client.eb.ar(aq, 76461404);
    }

    static final void dv(String str) {
        ns aq = ib.aq(no.dp, client.eb.aj, 1264981121);
        aq.ar.al(hs.ag(str, (short) 7863), -1811318276);
        aq.ar.ap(str, 635769462);
        client.eb.ar(aq, -809065619);
    }

    static final void ee(byte b) {
        try {
            int i;
            lv lvVar = client.eb.ai;
            lvVar.jt(1153685242);
            int jm = lvVar.jm(8, -1471705317);
            if (jm < client.ed * -1087962683) {
                for (i = jm; i < client.ed * -1087962683; i++) {
                    int[] iArr = client.ku;
                    int i2 = client.ji - 537524569;
                    client.ji = i2;
                    iArr[(i2 * -389857001) - 1] = client.er[i];
                }
            }
            if (jm <= client.ed * -1087962683) {
                client.ed = 0;
                for (i = 0; i < jm; i++) {
                    int i3 = client.er[i];
                    iq iqVar = client.eg[i3];
                    int[] iArr2;
                    int i4;
                    if (lvVar.jm(1, 1859967074) == 0) {
                        iArr2 = client.er;
                        i4 = client.ed + 1629279501;
                        client.ed = i4;
                        iArr2[(i4 * -1087962683) - 1] = i3;
                        iqVar.dv = client.bj * 327012327;
                    } else {
                        int jm2 = lvVar.jm(2, -1954947600);
                        int[] iArr3;
                        if (jm2 == 0) {
                            iArr2 = client.er;
                            i4 = client.ed + 1629279501;
                            client.ed = i4;
                            iArr2[(i4 * -1087962683) - 1] = i3;
                            iqVar.dv = client.bj * 327012327;
                            iArr3 = client.ee;
                            jm2 = client.eu + 36070333;
                            client.eu = jm2;
                            iArr3[(jm2 * -434278507) - 1] = i3;
                        } else if (jm2 == 1) {
                            iArr2 = client.er;
                            i4 = client.ed + 1629279501;
                            client.ed = i4;
                            iArr2[(i4 * -1087962683) - 1] = i3;
                            iqVar.dv = client.bj * 327012327;
                            iqVar.ad(lvVar.jm(3, -390553154), (byte) 1, (byte) 25);
                            if (1 == lvVar.jm(1, -371040425)) {
                                iArr3 = client.ee;
                                jm2 = client.eu + 36070333;
                                client.eu = jm2;
                                iArr3[(jm2 * -434278507) - 1] = i3;
                            }
                        } else if (2 == jm2) {
                            iArr2 = client.er;
                            i4 = client.ed + 1629279501;
                            client.ed = i4;
                            iArr2[(i4 * -1087962683) - 1] = i3;
                            iqVar.dv = client.bj * 327012327;
                            iqVar.ad(lvVar.jm(3, 708623165), (byte) 2, (byte) 25);
                            iqVar.ad(lvVar.jm(3, -1782843783), (byte) 2, (byte) 25);
                            if (lvVar.jm(1, 1104012166) == 1) {
                                iArr3 = client.ee;
                                jm2 = client.eu + 36070333;
                                client.eu = jm2;
                                iArr3[(jm2 * -434278507) - 1] = i3;
                            }
                        } else if (jm2 == 3) {
                            iArr3 = client.ku;
                            jm2 = client.ji - 537524569;
                            client.ji = jm2;
                            iArr3[(jm2 * -389857001) - 1] = i3;
                        }
                    }
                }
                return;
            }
            throw new RuntimeException("");
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.ee(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int hy(al alVar, byte b) {
        try {
            ms msVar = (ms) client.nf.ad((((long) (alVar.ao * -1227024251)) << 32) + ((long) (alVar.ah * 988026877)));
            return msVar != null ? msVar.ad : alVar.dn * 1715409227;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.hy(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ab(String str, byte b) {
        if (str != null) {
            try {
                en enVar = new en(str, this.al);
                if (enVar.aq((short) -15770)) {
                    if (this.ai.am(enVar, (byte) -23)) {
                        ml.hz((byte) 11);
                        ns aq = ib.aq(no.bs, client.eb.aj, 2030015821);
                        aq.ar.al(hs.ag(str, (short) -8533), -2112295780);
                        aq.ar.ap(str, 635769462);
                        client.eb.ar(aq, -338382476);
                    }
                    nr.he(-1009937692);
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("hs.ab(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ad(int i) {
        try {
            return 2 == this.ae * 1127115835;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean ae(en enVar, int i) {
        if (enVar == null) {
            return false;
        }
        try {
            return this.ai.al(enVar, (byte) 76);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean ai(en enVar, boolean z, int i) {
        if (enVar == null) {
            return false;
        }
        try {
            return enVar.equals(da.jc.ad) ? true : this.aj.cx(enVar, z, 1014369168);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aj(int i) {
        try {
            this.ae = 0;
            this.aj.ad(-1731523066);
            this.ai.ad(1867225482);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void al(byte b) {
        StringBuilder stringBuilder;
        try {
            me aq = this.aj.ag.aq();
            while (true) {
                eq eqVar = (eq) aq;
                if (eqVar != null) {
                    if (((long) (eqVar.ad * 518372545)) < (gq.ad((byte) -18) / 1000) - 5) {
                        if (eqVar.ar > (short) 0) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(eqVar.aq);
                            stringBuilder.append(go.gv);
                            iq.aq(5, "", stringBuilder.toString(), -1931636040);
                        }
                        if (eqVar.ar == (short) 0) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(eqVar.aq);
                            stringBuilder.append(go.gs);
                            iq.aq(5, "", stringBuilder.toString(), -2104672242);
                        }
                        eqVar.ad();
                    }
                    aq = this.aj.ag.ar();
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("hs.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void am(String str, short s) {
        if (str != null) {
            try {
                en enVar = new en(str, this.al);
                if (!enVar.aq((short) -1767)) {
                    return;
                }
                if (ax((short) -403)) {
                    bf.as(1972656831);
                } else if (da.jc.ad.equals(enVar)) {
                    hx.au(-1963758062);
                } else if (ai(enVar, false, 1808341733)) {
                    ln.ag(str, (byte) -122);
                } else if (ae(enVar, 2044830623)) {
                    bj.ap(str, -124467401);
                } else {
                    kb.az(str, (byte) -114);
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("hs.am(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void an(String str, int i) {
        if (str != null) {
            try {
                en enVar = new en(str, this.al);
                if (enVar.aq((short) 1522)) {
                    if (this.aj.am(enVar, (byte) -9)) {
                        ml.hz((byte) -39);
                        ns aq = ib.aq(no.cm, client.eb.aj, 683148690);
                        aq.ar.al(hs.ag(str, (short) -437), -802632605);
                        aq.ar.ap(str, 635769462);
                        client.eb.ar(aq, 118963245);
                    }
                    br.ha((byte) -93);
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("hs.an(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void aq(byte b) {
        try {
            this.ae = 1045269747;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ar(lj ljVar, int i, int i2) {
        try {
            this.aj.ct(ljVar, i, (byte) 33);
            this.ae = 2090539494;
            br.ha((byte) -35);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean at(en enVar, byte b) {
        try {
            eu euVar = (eu) this.aj.aj(enVar, (byte) 16);
            return euVar != null && euVar.bu(410747336);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.at(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aw(String str, int i) {
        if (str != null) {
            try {
                en enVar = new en(str, this.al);
                if (!enVar.aq((short) -12885)) {
                    return;
                }
                if (ay(1166674826)) {
                    kj.ac(-2031143333);
                } else if (da.jc.ad.equals(enVar)) {
                    ew.ah((byte) -87);
                } else if (ae(enVar, 2044830623)) {
                    fj.aa(str, (byte) 75);
                } else if (ai(enVar, false, 1808341733)) {
                    fp.ao(str, -1393595843);
                } else {
                    el.af(str, (byte) -34);
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("hs.aw(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean ax(short s) {
        try {
            return !this.aj.ar((byte) -49) ? this.aj.aq((byte) -70) >= 200 && 1 != client.jb * -1133231419 : true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean ay(int i) {
        try {
            return !this.ai.ar((byte) 20) ? this.ai.aq((byte) -55) >= 100 && 1 != client.jb * -1133231419 : true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hs.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ba() {
        return 2 == this.ae * 1127115835;
    }

    /* Access modifiers changed, original: final */
    public final void bb() {
        this.ae = 0;
        this.aj.ad(1688615931);
        this.ai.ad(-1604894115);
    }

    /* Access modifiers changed, original: final */
    public final boolean bc(en enVar, boolean z) {
        return enVar == null ? false : enVar.equals(da.jc.ad) ? true : this.aj.cx(enVar, z, -800781067);
    }

    /* Access modifiers changed, original: final */
    public final void bd(lj ljVar, int i) {
        this.aj.ct(ljVar, i, (byte) 90);
        this.ae = 2090539494;
        br.ha((byte) -17);
    }

    /* Access modifiers changed, original: final */
    public final void be(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (!enVar.aq((short) -16898)) {
                return;
            }
            if (ax((short) 25438)) {
                bf.as(-1912614989);
            } else if (da.jc.ad.equals(enVar)) {
                hx.au(-1999532399);
            } else if (ai(enVar, false, 1808341733)) {
                ln.ag(str, (byte) 99);
            } else if (ae(enVar, 2044830623)) {
                bj.ap(str, -124467401);
            } else {
                kb.az(str, (byte) -33);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void bf() {
        this.ae = 0;
        this.aj.ad(494020966);
        this.ai.ad(1797945041);
    }

    /* Access modifiers changed, original: final */
    public final boolean bg(en enVar, boolean z) {
        return enVar == null ? false : enVar.equals(da.jc.ad) ? true : this.aj.cx(enVar, z, -1019326947);
    }

    /* Access modifiers changed, original: final */
    public final boolean bi(en enVar, boolean z) {
        return enVar == null ? false : enVar.equals(da.jc.ad) ? true : this.aj.cx(enVar, z, -417864539);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bk() {
        return 2 == this.ae * 1127115835;
    }

    /* Access modifiers changed, original: final */
    public final void bl() {
        this.ae = 0;
        this.aj.ad(-1691067416);
        this.ai.ad(1061996187);
    }

    /* Access modifiers changed, original: final */
    public final void bm() {
        this.ae = 983617701;
    }

    /* Access modifiers changed, original: final */
    public final void bo() {
        this.ae = 0;
        this.aj.ad(-39237618);
        this.ai.ad(1773761510);
    }

    /* Access modifiers changed, original: final */
    public final void bq(lj ljVar, int i) {
        this.aj.ct(ljVar, i, (byte) 64);
        this.ae = -1471213872;
        br.ha((byte) -117);
    }

    /* Access modifiers changed, original: final */
    public final void br(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (!enVar.aq((short) -6160)) {
                return;
            }
            if (ax((short) 14451)) {
                bf.as(1832964251);
            } else if (da.jc.ad.equals(enVar)) {
                hx.au(-2013200635);
            } else if (ai(enVar, false, 1808341733)) {
                ln.ag(str, (byte) 86);
            } else if (ae(enVar, 2044830623)) {
                bj.ap(str, -124467401);
            } else {
                kb.az(str, (byte) -79);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bs() {
        return 2 == this.ae * 1127115835;
    }

    /* Access modifiers changed, original: final */
    public final boolean bu(en enVar) {
        return enVar != null && this.ai.al(enVar, (byte) -6);
    }

    /* Access modifiers changed, original: final */
    public final boolean bv(en enVar, boolean z) {
        return enVar == null ? false : enVar.equals(da.jc.ad) ? true : this.aj.cx(enVar, z, -986023874);
    }

    /* Access modifiers changed, original: final */
    public final boolean bw(en enVar) {
        return enVar != null && this.ai.al(enVar, (byte) 12);
    }

    /* Access modifiers changed, original: final */
    public final boolean bx(en enVar) {
        return enVar != null && this.ai.al(enVar, (byte) 43);
    }

    /* Access modifiers changed, original: final */
    public final void ca(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (!enVar.aq((short) 2690)) {
                return;
            }
            if (ay(1214477284)) {
                kj.ac(760522393);
            } else if (da.jc.ad.equals(enVar)) {
                ew.ah((byte) 76);
            } else if (ae(enVar, 2044830623)) {
                fj.aa(str, (byte) -31);
            } else if (ai(enVar, false, 1808341733)) {
                fp.ao(str, -1393595843);
            } else {
                el.af(str, (byte) -25);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean cb() {
        return !this.aj.ar((byte) 77) ? this.aj.aq((byte) -65) >= 200 && 1 != client.jb * -1133231419 : true;
    }

    /* Access modifiers changed, original: final */
    public final boolean cc() {
        return !this.aj.ar((byte) 66) ? this.aj.aq((byte) -112) >= 200 && 1 != client.jb * -1133231419 : true;
    }

    /* Access modifiers changed, original: final */
    public final boolean ce() {
        return !this.aj.ar((byte) -61) ? this.aj.aq((byte) -126) >= 859653513 && 1 != client.jb * 15502991 : true;
    }

    /* Access modifiers changed, original: final */
    public final boolean ci() {
        return !this.aj.ar((byte) -49) ? this.aj.aq((byte) -6) >= 200 && 1 != client.jb * -1133231419 : true;
    }

    /* Access modifiers changed, original: final */
    public final boolean cp() {
        return !this.aj.ar((byte) 64) ? this.aj.aq((byte) -44) >= 200 && 1 != client.jb * -1133231419 : true;
    }

    /* Access modifiers changed, original: final */
    public final void cr(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (!enVar.aq((short) -27193)) {
                return;
            }
            if (ay(1586295759)) {
                kj.ac(1679984965);
            } else if (da.jc.ad.equals(enVar)) {
                ew.ah((byte) 13);
            } else if (ae(enVar, 2044830623)) {
                fj.aa(str, (byte) 55);
            } else if (ai(enVar, false, 1808341733)) {
                fp.ao(str, -1393595843);
            } else {
                el.af(str, (byte) 11);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cs(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (!enVar.aq((short) -895)) {
                return;
            }
            if (ay(2067401930)) {
                kj.ac(-1795362903);
            } else if (da.jc.ad.equals(enVar)) {
                ew.ah((byte) 86);
            } else if (ae(enVar, 2044830623)) {
                fj.aa(str, (byte) -39);
            } else if (ai(enVar, false, 1808341733)) {
                fp.ao(str, -1393595843);
            } else {
                el.af(str, (byte) -57);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ct(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (!enVar.aq((short) -11197)) {
                return;
            }
            if (ay(1599330419)) {
                kj.ac(8033610);
            } else if (da.jc.ad.equals(enVar)) {
                ew.ah((byte) 10);
            } else if (ae(enVar, 2044830623)) {
                fj.aa(str, (byte) -62);
            } else if (ai(enVar, false, 1808341733)) {
                fp.ao(str, -1393595843);
            } else {
                el.af(str, (byte) 16);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cx(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (!enVar.aq((short) -23321)) {
                return;
            }
            if (ay(1794618944)) {
                kj.ac(-1084412006);
            } else if (da.jc.ad.equals(enVar)) {
                ew.ah((byte) -41);
            } else if (ae(enVar, 2044830623)) {
                fj.aa(str, (byte) -98);
            } else if (ai(enVar, false, 1808341733)) {
                fp.ao(str, -1393595843);
            } else {
                el.af(str, (byte) -88);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean cy() {
        return !this.aj.ar((byte) 46) ? this.aj.aq((byte) -77) >= 200 && 1 != client.jb * 1657558176 : true;
    }

    /* Access modifiers changed, original: final */
    public final void da(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (enVar.aq((short) -30082)) {
                if (this.ai.am(enVar, (byte) -92)) {
                    ml.hz((byte) -40);
                    ns aq = ib.aq(no.bs, client.eb.aj, -378245277);
                    aq.ar.al(hs.ag(str, (short) -21803), -895592697);
                    aq.ar.ap(str, 635769462);
                    client.eb.ar(aq, -649481094);
                }
                nr.he(460862271);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void df(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (enVar.aq((short) -2544)) {
                if (this.aj.am(enVar, (byte) -20)) {
                    ml.hz((byte) 79);
                    ns aq = ib.aq(no.cm, client.eb.aj, 1748785360);
                    aq.ar.al(hs.ag(str, (short) -9939), -513274181);
                    aq.ar.ap(str, 635769462);
                    client.eb.ar(aq, -2050497821);
                }
                br.ha((byte) -57);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean di() {
        return !this.ai.ar((byte) 107) ? this.ai.aq((byte) -12) >= 100 && 1 != client.jb * -1133231419 : true;
    }

    /* Access modifiers changed, original: final */
    public final void dl(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (enVar.aq((short) -23523)) {
                if (this.aj.am(enVar, (byte) -69)) {
                    ml.hz((byte) -52);
                    ns aq = ib.aq(no.cm, client.eb.aj, -386176162);
                    aq.ar.al(hs.ag(str, (short) 14879), -2017254546);
                    aq.ar.ap(str, 635769462);
                    client.eb.ar(aq, 731743961);
                }
                br.ha((byte) -109);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean dn(en enVar) {
        eu euVar = (eu) this.aj.aj(enVar, (byte) 16);
        return euVar != null && euVar.bu(410747336);
    }

    /* Access modifiers changed, original: final */
    public final boolean dp(en enVar) {
        eu euVar = (eu) this.aj.aj(enVar, (byte) 16);
        return euVar != null && euVar.bu(410747336);
    }

    /* Access modifiers changed, original: final */
    public final void dr(String str) {
        if (str != null) {
            en enVar = new en(str, this.al);
            if (enVar.aq((short) -236)) {
                if (this.aj.am(enVar, (byte) -8)) {
                    ml.hz((byte) -64);
                    ns aq = ib.aq(no.cm, client.eb.aj, 522929538);
                    aq.ar.al(hs.ag(str, (short) 445), -208028576);
                    aq.ar.ap(str, 635769462);
                    client.eb.ar(aq, -333614101);
                }
                br.ha((byte) -106);
            }
        }
    }
}
