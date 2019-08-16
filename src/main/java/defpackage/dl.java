package defpackage;

/* renamed from: dl */
public class dl extends cf {
    public static final int ah = 22;
    static final int av = 19136776;
    public static final int bm = 10000;
    static boolean ob;
    int ae;
    final ci ai;
    final int aj;
    int ak;
    cx am;
    int as;

    dl(ag agVar, ag agVar2, int i, ci ciVar) {
        try {
            super(agVar, agVar2);
            this.aj = 15065325 * i;
            this.ai = ciVar;
            bq(1080402611);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dl.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final boolean ar(char c, byte b) {
        return 160 == c || c == ' ' || c == '_' || '-' == c;
    }

    static final void cv(String str, short s) {
        boolean z = true;
        try {
            if (str.equalsIgnoreCase("toggleroof")) {
                dc.rx.ar = !dc.rx.ar;
                gn.aj(-13450133);
                if (dc.rx.ar) {
                    iq.aq(99, "", "Roofs are now all hidden", -1319367173);
                } else {
                    iq.aq(99, "", "Roofs will only be removed selectively", 303826875);
                }
            }
            if (str.equalsIgnoreCase("displayfps")) {
                client.cj ^= 1;
            }
            if (str.equalsIgnoreCase("renderself")) {
                client.jt = !client.jt;
            }
            if (str.equalsIgnoreCase("mouseovertext")) {
                gc.km.cq = !gc.km.cq;
            }
            if (client.lq * -408822943 >= 2) {
                if (str.equalsIgnoreCase("errortest")) {
                    throw new RuntimeException();
                }
                if (str.equalsIgnoreCase("harderror")) {
                    client.cq = true;
                }
                if (str.equalsIgnoreCase("showcoord")) {
                    pd pdVar = gi.rz;
                    if (gi.rz.cw) {
                        z = false;
                    }
                    pdVar.cw = z;
                }
                if (str.equalsIgnoreCase("fpson")) {
                    client.cj = true;
                }
                if (str.equalsIgnoreCase("fpsoff")) {
                    client.cj = false;
                }
                if (str.equalsIgnoreCase("gc")) {
                    System.gc();
                }
                if (str.equalsIgnoreCase("clientdrop")) {
                    ay.bc((byte) -71);
                }
                if (str.startsWith("fpslimit ")) {
                    client.aq.uk.ak(nz.al(str.substring(9), (byte) 61), (byte) 8);
                }
                if (str.equalsIgnoreCase("copydevicetoken")) {
                    aa bx = hr.um.bx(-1468096865);
                    if (bx != null) {
                        bx.ax(2138478277);
                    }
                }
            }
            ns aq = ib.aq(no.cb, client.eb.aj, -701980074);
            aq.ar.al(str.length() + 1, 128664374);
            aq.ar.ap(str, 635769462);
            client.eb.ar(aq, 92058831);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dl.cv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void dk(ih ihVar, int i, byte b) {
        try {
            fs.dw(ihVar.bq * -1444273727, ihVar.bd * -1690563339, i, (byte) 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dl.dk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public cx aa() {
        return this.am;
    }

    /* Access modifiers changed, original: 0000 */
    public cx ac() {
        return this.am;
    }

    /* Access modifiers changed, original: 0000 */
    public int af() {
        return this.as * 1323517237;
    }

    /* Access modifiers changed, original: 0000 */
    public int ah() {
        return this.as * 1323517237;
    }

    /* Access modifiers changed, original: 0000 */
    public int aj(int i) {
        try {
            return this.as * 1323517237;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dl.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int al(int i) {
        try {
            return this.ak * -1380806653;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dl.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ao() {
        return this.ak * -1380806653;
    }

    public int aq(byte b) {
        try {
            return this.ae * 934710007;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dl.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public cx ar(int i) {
        try {
            return this.am;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dl.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int aw() {
        return this.ae * 73799213;
    }

    public int ax() {
        return this.ae * 934710007;
    }

    /* Access modifiers changed, original: 0000 */
    public void bd() {
        this.ae = aj.aq(this.aj * 1917213607, -1364099948).ap(-1023006830).bm * -815399914;
        this.am = this.ai.bi(jg.aq(this.ae * 1154592087, (byte) 111), 1951710759);
        ee ai = jg.aq(aq((byte) -46), (byte) 55).ai(false, -330190719);
        if (ai != null) {
            this.ak = ai.aq * 84449963;
            this.as = ai.ar * 1841336673;
            return;
        }
        this.ak = 0;
        this.as = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bl() {
        this.ae = aj.aq(this.aj * -1696111040, 440317606).ap(296238442).bm * 1738659943;
        this.am = this.ai.bi(jg.aq(this.ae * 888800403, (byte) 118), 1897489699);
        ee ai = jg.aq(aq((byte) -73), (byte) 102).ai(false, -1318669526);
        if (ai != null) {
            this.ak = ai.aq * 1285408517;
            this.as = ai.ar * -724654819;
            return;
        }
        this.ak = 0;
        this.as = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bo() {
        this.ae = aj.aq(this.aj * 518349248, 1258764088).ap(309669388).bm * -719715089;
        this.am = this.ai.bi(jg.aq(this.ae * 934710007, (byte) 13), 1809706904);
        ee ai = jg.aq(aq((byte) 31), (byte) 24).ai(false, -1584252640);
        if (ai != null) {
            this.ak = ai.aq * 84449963;
            this.as = ai.ar * -724654819;
            return;
        }
        this.ak = 0;
        this.as = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bq(int i) {
        try {
            this.ae = aj.aq(this.aj * 1354202341, -987099854).ap(-884717112).bm * 1738659943;
            this.am = this.ai.bi(jg.aq(this.ae * 934710007, (byte) 53), 1745510786);
            ee ai = jg.aq(aq((byte) -58), (byte) 88).ai(false, -317469376);
            if (ai != null) {
                this.ak = ai.aq * 84449963;
                this.as = ai.ar * -724654819;
                return;
            }
            this.ak = 0;
            this.as = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dl.bq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
