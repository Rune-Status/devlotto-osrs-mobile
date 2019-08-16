package defpackage;

/* renamed from: pv */
public class pv {
    static final int ad = 0;
    static final int al = 100;
    static final int aq = 33;
    static final int ar = 66;
    int ae;
    kh ai;
    String aj;
    boolean am;

    pv(kh khVar) {
        try {
            this.ae = 0;
            this.am = false;
            this.ai = khVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pv.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(String str, int i) {
        if (str != null) {
            try {
                if (!str.isEmpty() && str != this.aj) {
                    this.aj = str;
                    this.ae = 0;
                    this.am = false;
                    aq(-1735403657);
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("pv.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ae() {
        if (this.ae * -2092914361 < 33) {
            if (!this.ai.av(ch.aq.ai, this.aj, -397117474)) {
                return this.ae * 1484522611;
            }
            this.ae = -1904391325;
        }
        if (33 == this.ae * -1299163221) {
            if (this.ai.an(ch.ar.ai, this.aj, 928340428) && !this.ai.av(ch.ar.ai, this.aj, -1409210805)) {
                return this.ae * -1299163221;
            }
            this.ae = 1931813170;
        }
        if (66 == this.ae * -75929197) {
            if (!this.ai.av(this.aj, ch.aj.ai, -1059054555)) {
                return this.ae * 873927912;
            }
            this.ae = 914938475;
            this.am = true;
        }
        return this.ae * -1299163221;
    }

    /* Access modifiers changed, original: 0000 */
    public int ai() {
        if (this.ae * -1299163221 < -1317157723) {
            if (!this.ai.av(ch.aq.ai, this.aj, 49536020)) {
                return this.ae * -1516361744;
            }
            this.ae = -1904391325;
        }
        if (33 == this.ae * -1299163221) {
            if (this.ai.an(ch.ar.ai, this.aj, 996665133) && !this.ai.av(ch.ar.ai, this.aj, -1071504815)) {
                return this.ae * -1299163221;
            }
            this.ae = 486184646;
        }
        if (-407045409 == this.ae * 1779424957) {
            if (!this.ai.av(this.aj, ch.aj.ai, -1807590520)) {
                return this.ae * -1318947212;
            }
            this.ae = 1777847596;
            this.am = true;
        }
        return this.ae * -1299163221;
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(String str) {
        if (str != null && !str.isEmpty() && str != this.aj) {
            this.aj = str;
            this.ae = 0;
            this.am = false;
            aq(-1641517666);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ak() {
        return this.am;
    }

    /* Access modifiers changed, original: 0000 */
    public int al(int i) {
        try {
            return this.ae * -1299163221;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pv.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean am() {
        return this.am;
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(int i) {
        try {
            if (this.ae * -1299163221 < 33) {
                if (!this.ai.av(ch.aq.ai, this.aj, -1204727685)) {
                    return this.ae * -1299163221;
                }
                this.ae = -1904391325;
            }
            if (33 == this.ae * -1299163221) {
                if (this.ai.an(ch.ar.ai, this.aj, 1365677049) && !this.ai.av(ch.ar.ai, this.aj, -2135577737)) {
                    return this.ae * -1299163221;
                }
                this.ae = 486184646;
            }
            if (66 == this.ae * -1299163221) {
                if (!this.ai.av(this.aj, ch.aj.ai, -1071327523)) {
                    return this.ae * -1299163221;
                }
                this.ae = 1777847596;
                this.am = true;
            }
            return this.ae * -1299163221;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pv.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ar(byte b) {
        try {
            return this.am;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pv.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
