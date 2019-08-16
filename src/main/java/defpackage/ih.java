package defpackage;

/* renamed from: ih */
public abstract class ih extends br {
    static final int by = 4;
    static final int qw = 2;
    boolean an;
    int bb;
    int bc;
    public int bd;
    String be;
    int bf;
    int bg;
    boolean bh;
    int bi;
    boolean bj;
    int bl;
    int bn;
    int bo;
    byte bp;
    public int bq;
    int br;
    int bt;
    int bu;
    int bv;
    int bw;
    int bz;
    int ca;
    int cb;
    int cc;
    int cd;
    int ce;
    int cf;
    int cg;
    int ch;
    boolean ci;
    int[] cj;
    int ck;
    int cl;
    int[] cm;
    int[] cn;
    int co;
    int cp;
    int[] cq;
    int cr;
    int cs;
    int ct;
    int cu;
    int[] cv;
    fz cw;
    int cx;
    int cy;
    int cz;
    int da;
    int[] db;
    int[] dc;
    int dd;
    int df;
    int di;
    int dl;
    int dm;
    int dn;
    int dp;
    int dr;
    int dt;
    byte[] du;
    int dv;

    ih() {
        try {
            this.an = false;
            this.bl = 2007303153;
            this.bb = 1250387479;
            this.bi = -890276019;
            this.bc = -914156109;
            this.bv = 1992105323;
            this.bg = 249539349;
            this.bu = 2051759891;
            this.bw = 1243557089;
            this.br = 20034989;
            this.be = null;
            this.bh = false;
            this.bt = -1027126548;
            this.bn = 0;
            this.bz = 0;
            this.bp = (byte) 0;
            this.cv = new int[4];
            this.cj = new int[4];
            this.cm = new int[4];
            this.cq = new int[4];
            this.cn = new int[4];
            this.cw = new fz();
            this.cp = -260026025;
            this.ci = false;
            this.cb = 950206681;
            this.ce = 1377230225;
            this.cy = 0;
            this.cc = 0;
            this.cs = -1835762113;
            this.cr = 0;
            this.ca = 0;
            this.cx = 0;
            this.ct = 0;
            this.ck = 109561753;
            this.co = 0;
            this.cu = 0;
            this.dv = 0;
            this.di = 695363864;
            this.dr = 0;
            this.df = -704192032;
            this.da = 0;
            this.db = new int[10];
            this.dc = new int[10];
            this.du = new byte[10];
            this.dp = 0;
            this.dn = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ih.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int aq(int i, int i2, int i3) {
        try {
            jl jlVar = (jl) jl.ad.ad((long) i);
            return jlVar == null ? 0 : i2 >= 0 ? i2 >= jlVar.ar.length ? 0 : jlVar.ar[i2] : 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ih.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void gj(int i) {
        try {
            if (!lz.mu) {
                client.mi = null;
            } else if (io.aq == client.bh.ad) {
                jj.mr = client.mi.bg * 124826507;
                ho.mj = client.mi.bx * 630438017;
                al.mq = 0;
                kg.mn = 0;
            } else {
                fj.mc = false;
                if (client.bh.ad == io.ak) {
                    kg.mn = (client.bh.am[0] - client.bh.ai[0]) * -1429967187;
                    al.mq = (client.bh.ak[0] - client.bh.ae[0]) * 795871319;
                    ed.me = 0;
                    fl.mp = 0;
                } else {
                    if (io.as == client.bh.ad) {
                        fl.mp = client.bh.aq((byte) 50) * -695818139;
                        ed.me = client.bh.ad(-1402211322) * 1649995735;
                    }
                    kg.mn += fl.mp * -160172887;
                    fl.mp = ((fl.mp * -1897704883) / 100) * -695818139;
                    al.mq += ed.me * -1495753855;
                    ed.me = ((ed.me * -147199353) / 100) * 1649995735;
                }
                if (!(kg.mn * 145827109 == 0 && al.mq * -620403865 == 0)) {
                    int i2 = client.mi.bg;
                    int i3 = client.mi.bx;
                    client.mi.bg = (jj.mr * -580592605) - (kg.mn * -1861198794);
                    if (client.mi.bg * 817114559 > (client.mi.bu * -1004867185) - (client.mi.bl * 1272191791)) {
                        client.mi.bg = (client.mi.bu * 911069233) - (client.mi.bl * 1370115729);
                    }
                    if (client.mi.bg * 817114559 < 0) {
                        client.mi.bg = 0;
                    }
                    client.mi.bx = (ho.mj * 675579777) - (al.mq * -650835322);
                    if (client.mi.bx * -1344834291 > (client.mi.bw * 901029295) - (client.mi.bf * 1813264797)) {
                        client.mi.bx = (client.mi.bw * 1672455851) - (client.mi.bf * -2087857455);
                    }
                    if (client.mi.bx * -1344834291 < 0) {
                        client.mi.bx = 0;
                    }
                    if (!(i2 * 817114559 == client.mi.bg * 817114559 && i3 * -1344834291 == client.mi.bx * -1344834291)) {
                        da.gk(client.mi, (byte) 2);
                        fj.mc = true;
                    }
                }
                if (!fj.mc) {
                    ed.me = 0;
                    fl.mp = 0;
                    if (io.ak != client.bh.ad) {
                        client.mi = null;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ih.gj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ap(int i) {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void be(int i) {
        try {
            this.da = 0;
            this.dn = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ih.be(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void bh(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            ig igVar;
            dg aq = di.aq(i, -655785171);
            mb igVar2 = (ig) this.cw.aj();
            int i8 = 1579892315 * aq.ak;
            mb mbVar = null;
            mb mbVar2 = null;
            int i9 = 0;
            while (igVar2 != null) {
                int i10 = i9 + 1;
                if (igVar2.ar.aj * -761829421 == aq.aj * -761829421) {
                    igVar2.ad(i2 + i4, i5, i6, i3, (byte) 0);
                    return;
                }
                mb mbVar3;
                if (igVar2.ar.am * 1180492733 <= aq.am * 1180492733) {
                    mbVar = igVar2;
                }
                if (igVar2.ar.ak * 1579892315 > i8) {
                    i8 = 1579892315 * igVar2.ar.ak;
                    mbVar3 = igVar2;
                } else {
                    mbVar3 = mbVar2;
                }
                igVar2 = (ig) this.cw.ae();
                mbVar2 = mbVar3;
                i9 = i10;
            }
            if (mbVar2 != null || i9 < 4) {
                igVar2 = new ig(aq);
                if (mbVar == null) {
                    this.cw.ar(igVar2);
                } else {
                    fz.al(igVar2, mbVar);
                }
                igVar2.ad(i4 + i2, i5, i6, i3, (byte) 0);
                if (i9 >= 4) {
                    mbVar2.ky();
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ih.bh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void bj(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10 = 0;
        Object obj = 1;
        Object obj2 = 1;
        while (i10 < 4) {
            try {
                if (this.cm[i10] > i5) {
                    obj = null;
                } else {
                    obj2 = null;
                }
                i10++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ih.bj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        if (i >= 0) {
            dr aq = ba.aq(i, -68126424);
            i10 = aq.an * 782044153;
            i8 = aq.az * 1274925921;
        } else {
            i8 = 0;
            i10 = -1;
        }
        int i11;
        if (obj2 == null) {
            if (obj != null) {
                this.bp = (byte) 0;
                i11 = 0;
            } else {
                i11 = 0;
            }
            while (i11 < 4) {
                i9 = this.bp;
                this.bp = (byte) ((this.bp + 1) % 4);
                if (this.cm[i9] <= i5) {
                    break;
                }
                i11++;
            }
            i9 = -1;
        } else if (i10 != -1) {
            i11 = i10 == 0 ? this.cm[0] : i10 == 1 ? this.cj[0] : 0;
            int i12 = 1;
            i9 = 0;
            while (i12 < 4) {
                if (i10 != 0) {
                    if (1 == i10 && this.cj[i12] < i11) {
                        i11 = this.cj[i12];
                    }
                    i12++;
                } else if (this.cm[i12] < i11) {
                    i11 = this.cm[i12];
                } else {
                    i12++;
                }
                i9 = i12;
                i12++;
            }
            if (1 == i10 && i11 >= i2) {
                return;
            }
        } else {
            return;
        }
        if (i9 >= 0) {
            this.cv[i9] = i;
            this.cj[i9] = i2;
            this.cq[i9] = i3;
            this.cn[i9] = i4;
            this.cm[i9] = (i8 + i5) + i6;
        }
    }

    /* Access modifiers changed, original: final */
    public final void bn() {
        this.da = 0;
        this.dn = 0;
    }

    /* Access modifiers changed, original: final */
    public final void bp(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 1;
        int i11 = 1;
        for (i7 = 0; i7 < 4; i7++) {
            if (this.cm[i7] > i5) {
                i11 = 0;
            } else {
                i10 = 0;
            }
        }
        if (i >= 0) {
            dr aq = ba.aq(i, 1936752316);
            i7 = aq.an * 782044153;
            i8 = aq.az * 1274925921;
        } else {
            i7 = -1;
            i8 = 0;
        }
        if (i10 == 0) {
            if (i11 != 0) {
                this.bp = (byte) 0;
                i10 = 0;
            } else {
                i10 = 0;
            }
            while (i10 < 4) {
                i9 = this.bp;
                this.bp = (byte) ((this.bp + 1) % 4);
                if (this.cm[i9] <= i5) {
                    break;
                }
                i10++;
            }
            i9 = -1;
        } else if (i7 != -1) {
            i10 = i7 == 0 ? this.cm[0] : i7 == 1 ? this.cj[0] : 0;
            i11 = 1;
            while (i11 < 4) {
                if (i7 != 0) {
                    if (1 == i7 && this.cj[i11] < i10) {
                        i10 = this.cj[i11];
                    }
                    i11++;
                } else if (this.cm[i11] < i10) {
                    i10 = this.cm[i11];
                } else {
                    i11++;
                }
                i9 = i11;
                i11++;
            }
            if (1 == i7 && i10 >= i2) {
                return;
            }
        } else {
            return;
        }
        if (i9 >= 0) {
            this.cv[i9] = i;
            this.cj[i9] = i2;
            this.cq[i9] = i3;
            this.cn[i9] = i4;
            this.cm[i9] = (i8 + i5) + i6;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean br() {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void bt(int i, int i2) {
        try {
            dg aq = di.aq(i, -655785171);
            mb aj = this.cw.aj();
            while (true) {
                ig igVar = (ig) aj;
                if (igVar == null) {
                    return;
                }
                if (aq == igVar.ar) {
                    igVar.ky();
                    return;
                }
                aj = this.cw.ae();
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ih.bt(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bw() {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void by(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 1;
        int i11 = 1;
        for (i7 = 0; i7 < 4; i7++) {
            if (this.cm[i7] > i5) {
                i11 = 0;
            } else {
                i10 = 0;
            }
        }
        if (i >= 0) {
            dr aq = ba.aq(i, -1213442596);
            i7 = aq.an * 782044153;
            i8 = aq.az * 1274925921;
        } else {
            i7 = -1;
            i8 = 0;
        }
        if (i10 == 0) {
            if (i11 != 0) {
                this.bp = (byte) 0;
                i10 = 0;
            } else {
                i10 = 0;
            }
            while (i10 < 4) {
                i9 = this.bp;
                this.bp = (byte) ((this.bp + 1) % 4);
                if (this.cm[i9] <= i5) {
                    break;
                }
                i10++;
            }
            i9 = -1;
        } else if (i7 != -1) {
            i10 = i7 == 0 ? this.cm[0] : i7 == 1 ? this.cj[0] : 0;
            i11 = 1;
            while (i11 < 4) {
                if (i7 != 0) {
                    if (1 == i7 && this.cj[i11] < i10) {
                        i10 = this.cj[i11];
                    }
                    i11++;
                } else if (this.cm[i11] < i10) {
                    i10 = this.cm[i11];
                } else {
                    i11++;
                }
                i9 = i11;
                i11++;
            }
            if (1 == i7 && i10 >= i2) {
                return;
            }
        } else {
            return;
        }
        if (i9 >= 0) {
            this.cv[i9] = i;
            this.cj[i9] = i2;
            this.cq[i9] = i3;
            this.cn[i9] = i4;
            this.cm[i9] = (i8 + i5) + i6;
        }
    }

    /* Access modifiers changed, original: final */
    public final void bz() {
        this.da = 0;
        this.dn = 0;
    }

    /* Access modifiers changed, original: final */
    public final void cj(int i, int i2, int i3, int i4, int i5, int i6) {
        ig igVar;
        dg aq = di.aq(i, -655785171);
        int i7 = aq.ak * 1579892315;
        mb igVar2 = (ig) this.cw.aj();
        mb mbVar = null;
        mb mbVar2 = null;
        int i8 = 0;
        while (igVar2 != null) {
            int i9 = i8 + 1;
            if (igVar2.ar.aj * -761829421 == aq.aj * -761829421) {
                igVar2.ad(i2 + i4, i5, i6, i3, (byte) 0);
                return;
            }
            mb mbVar3;
            if (igVar2.ar.am * 1180492733 <= aq.am * 1180492733) {
                mbVar2 = igVar2;
            }
            if (igVar2.ar.ak * 1579892315 > i7) {
                i7 = 1579892315 * igVar2.ar.ak;
                mbVar3 = igVar2;
            } else {
                mbVar3 = mbVar;
            }
            igVar2 = (ig) this.cw.ae();
            mbVar = mbVar3;
            i8 = i9;
        }
        if (mbVar != null || i8 < 4) {
            igVar2 = new ig(aq);
            if (mbVar2 == null) {
                this.cw.ar(igVar2);
            } else {
                fz.al(igVar2, mbVar2);
            }
            igVar2.ad(i4 + i2, i5, i6, i3, (byte) 0);
            if (i8 >= 4) {
                mbVar.ky();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cm(int i, int i2, int i3, int i4, int i5, int i6) {
        ig igVar;
        dg aq = di.aq(i, -655785171);
        mb igVar2 = (ig) this.cw.aj();
        mb mbVar = null;
        int i7 = aq.ak * 1579892315;
        mb mbVar2 = null;
        int i8 = 0;
        while (igVar2 != null) {
            int i9 = i8 + 1;
            if (igVar2.ar.aj * -761829421 == aq.aj * -761829421) {
                igVar2.ad(i2 + i4, i5, i6, i3, (byte) 0);
                return;
            }
            mb mbVar3;
            if (igVar2.ar.am * 1180492733 <= aq.am * 1180492733) {
                mbVar2 = igVar2;
            }
            if (igVar2.ar.ak * 1579892315 > i7) {
                i7 = 1579892315 * igVar2.ar.ak;
                mbVar3 = igVar2;
            } else {
                mbVar3 = mbVar;
            }
            igVar2 = (ig) this.cw.ae();
            mbVar = mbVar3;
            i8 = i9;
        }
        if (mbVar != null || i8 < 4) {
            igVar2 = new ig(aq);
            if (mbVar2 == null) {
                this.cw.ar(igVar2);
            } else {
                fz.al(igVar2, mbVar2);
            }
            igVar2.ad(i4 + i2, i5, i6, i3, (byte) 0);
            if (i8 >= 4) {
                mbVar.ky();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cn(int i) {
        dg aq = di.aq(i, -655785171);
        mb aj = this.cw.aj();
        while (true) {
            ig igVar = (ig) aj;
            if (igVar == null) {
                return;
            }
            if (aq == igVar.ar) {
                igVar.ky();
                return;
            }
            aj = this.cw.ae();
        }
    }

    /* Access modifiers changed, original: final */
    public final void cq(int i) {
        dg aq = di.aq(i, -655785171);
        mb aj = this.cw.aj();
        while (true) {
            ig igVar = (ig) aj;
            if (igVar == null) {
                return;
            }
            if (aq == igVar.ar) {
                igVar.ky();
                return;
            }
            aj = this.cw.ae();
        }
    }

    /* Access modifiers changed, original: final */
    public final void cv(int i, int i2, int i3, int i4, int i5, int i6) {
        ig igVar;
        dg aq = di.aq(i, -655785171);
        mb igVar2 = (ig) this.cw.aj();
        mb mbVar = null;
        int i7 = aq.ak * 1579892315;
        mb mbVar2 = null;
        int i8 = 0;
        while (igVar2 != null) {
            int i9 = i8 + 1;
            if (igVar2.ar.aj * -361161088 == aq.aj * 1855866972) {
                igVar2.ad(i2 + i4, i5, i6, i3, (byte) 0);
                return;
            }
            mb mbVar3;
            if (igVar2.ar.am * 1482176204 <= aq.am * 1180492733) {
                mbVar2 = igVar2;
            }
            if (igVar2.ar.ak * 1579892315 > i7) {
                i7 = 1579892315 * igVar2.ar.ak;
                mbVar3 = igVar2;
            } else {
                mbVar3 = mbVar;
            }
            igVar2 = (ig) this.cw.ae();
            mbVar = mbVar3;
            i8 = i9;
        }
        if (mbVar != null || i8 < 4) {
            igVar2 = new ig(aq);
            if (mbVar2 == null) {
                this.cw.ar(igVar2);
            } else {
                fz.al(igVar2, mbVar2);
            }
            igVar2.ad(i4 + i2, i5, i6, i3, (byte) 0);
            if (i8 >= 4) {
                mbVar.ky();
            }
        }
    }
}
