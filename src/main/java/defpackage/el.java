package defpackage;

/* renamed from: el */
public class el extends ev implements bd {
    static ef ah = null;
    public static final int an = 23;
    static final int bm = 19136995;
    static final int pu = 1024;
    static int rj;
    final bn ad;
    an aq;

    public el(int i, int i2) {
        try {
            this.ad = fw.ar(-1659940620);
            az(i, i2, (byte) -43);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ef[] ad(byte[] bArr, int i) {
        try {
            ab.ay(bArr, 761824442);
            return cw.ax(2131689870);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void af(String str, byte b) {
        try {
            ns aq = ib.aq(no.dp, client.eb.aj, 397386517);
            aq.ar.al(hs.ag(str, (short) -16879), -1062730298);
            aq.ar.ap(str, 635769462);
            client.eb.ar(aq, -645827319);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ak(byte[] bArr, int i, int i2, bc bcVar, gs[] gsVarArr, int i3) {
        try {
            lj ljVar = new lj(bArr);
            int i4 = -1;
            while (true) {
                int bf = ljVar.bf((byte) -62);
                if (bf != 0) {
                    i4 += bf;
                    bf = 0;
                    while (true) {
                        int bl = ljVar.bl(2131034147);
                        if (bl != 0) {
                            int i5 = bf + (bl - 1);
                            bf = i5 >> 12;
                            int af = ljVar.af(1804771424);
                            bl = ((i5 >> 6) & 63) + i;
                            int i6 = (i5 & 63) + i2;
                            if (bl <= 0 || i6 <= 0 || bl >= 103 || i6 >= 103) {
                                bf = i5;
                            } else {
                                int i7 = (in.aq[1][bl][i6] & 2) == 2 ? bf - 1 : bf;
                                dd.ag(bf, bl, i6, i4, af & 3, af >> 2, bcVar, i7 >= 0 ? gsVarArr[i7] : null, 770966425);
                                bf = i5;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static long al(int i, int i2) {
        try {
            return bu.ac[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ct(int i) {
        try {
            return client.ny ? 2 : 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.ct(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aa(int i, int i2) {
        this.al = 740372033 * i;
        this.aj = -818478513 * i2;
        if (this.aq == null) {
            this.aq = this.ad.as(1574880468);
        }
        ax(this.aq, 1147286549);
    }

    /* Access modifiers changed, original: final */
    public final void ab(int i, int i2) {
        ax(this.ad.ag(this.aq, -1254327367), 1753126911);
    }

    /* Access modifiers changed, original: final */
    public final void ac(int i, int i2, int i3, int i4, byte b) {
    }

    public final an ad(int i) {
        try {
            return this.aq;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final int ae() {
        return this.al * 1175839169;
    }

    /* Access modifiers changed, original: final */
    public final void af(an anVar) {
        this.aq = anVar;
        this.aq.ad(this.al * -1447631268, this.aj * -909847377, (byte) 90);
        this.ar = this.aq.ar((byte) 36);
    }

    public final int ag() {
        return this.aj * 1240284712;
    }

    /* Access modifiers changed, original: final */
    public final void ah(int i, int i2) {
        this.al = 740372033 * i;
        this.aj = -818478513 * i2;
        if (this.aq == null) {
            this.aq = this.ad.as(1574880468);
        }
        ax(this.aq, -459675784);
    }

    public final int ai() {
        return this.al * 1175839169;
    }

    public final an aj() {
        return this.aq;
    }

    public final int ak() {
        return this.al * 1175839169;
    }

    public final an al() {
        return this.aq;
    }

    public final int am() {
        return this.al * -144865459;
    }

    /* Access modifiers changed, original: final */
    public final void an(an anVar) {
        this.aq = anVar;
        this.aq.ad(this.al * 1175839169, this.aj * -909847377, (byte) 10);
        this.ar = this.aq.ar((byte) 60);
    }

    /* Access modifiers changed, original: final */
    public final void ao(int i, int i2) {
        this.al = 740372033 * i;
        this.aj = -818478513 * i2;
        if (this.aq == null) {
            this.aq = this.ad.as(1574880468);
        }
        ax(this.aq, -355420422);
    }

    public final int ap() {
        return this.aj * -909847377;
    }

    public final int aq(int i) {
        try {
            return this.al * 1175839169;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final int ar(int i) {
        try {
            return this.aj * -909847377;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final int as() {
        return this.aj * -909847377;
    }

    /* Access modifiers changed, original: final */
    public final void at(int i, int i2) {
        ax(this.ad.ag(this.aq, -1205636373), -850039823);
    }

    public final int au() {
        return this.aj * -909847377;
    }

    /* Access modifiers changed, original: final */
    public final void av(int i, int i2) {
        ax(this.ad.ag(this.aq, -1724901427), 1000456852);
    }

    /* Access modifiers changed, original: final */
    public final void aw(int i, int i2, int i3) {
        try {
            ax(this.ad.ag(this.aq, -1375340078), -688728989);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ax(an anVar, int i) {
        try {
            this.aq = anVar;
            this.aq.ad(this.al * 1175839169, this.aj * -909847377, (byte) 5);
            this.ar = this.aq.ar((byte) 23);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ay(an anVar) {
        this.aq = anVar;
        this.aq.ad(this.al * 1175839169, this.aj * -909847377, (byte) -98);
        this.ar = this.aq.ar((byte) 12);
    }

    /* Access modifiers changed, original: final */
    public final void az(int i, int i2, byte b) {
        try {
            this.al = 740372033 * i;
            this.aj = -818478513 * i2;
            if (this.aq == null) {
                this.aq = this.ad.as(1574880468);
            }
            ax(this.aq, -1788042273);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("el.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ba(int i, int i2, int i3, int i4) {
    }

    /* Access modifiers changed, original: final */
    public final void bk(int i, int i2, int i3, int i4) {
    }
}
