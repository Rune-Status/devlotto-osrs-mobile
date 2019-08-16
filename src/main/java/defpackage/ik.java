package defpackage;

/* renamed from: ik */
public class ik implements fm {
    static final int an = 2;
    boolean aa;
    int ab;
    boolean ac;
    public io ad;
    public int[] ae;
    int ag;
    boolean ah;
    public int[] ai;
    long aj;
    public int[] ak;
    int al;
    public int[] am;
    boolean ao;
    int ap;
    int ar;
    int as;
    int au;
    boolean aw;
    boolean ax;
    boolean az;
    boolean ba;
    boolean bb;
    char[] bd;
    int bf;
    int[] bg;
    mo bh;
    long bi;
    int bk;
    int bl;
    int bm;
    boolean[] bo;
    int[] bq;
    int br;
    mo bt;
    long[] bu;
    int bv;
    double bw;
    int[] bx;

    ik() {
        try {
            this.ad = io.ad;
            this.ar = 0;
            this.al = 0;
            this.ai = new int[4];
            this.ae = new int[4];
            this.am = new int[4];
            this.ak = new int[4];
            this.as = -2062460553;
            this.ag = -135277821;
            this.ap = -771210303;
            this.au = -1547843517;
            this.az = false;
            this.ax = true;
            this.aw = true;
            this.ac = false;
            this.aa = false;
            this.ao = false;
            this.ah = false;
            this.ba = false;
            this.bm = 0;
            this.bq = new int[128];
            this.bd = new char[128];
            this.bo = new boolean[106];
            this.bl = 962450571;
            this.bf = 349612019;
            this.bv = 0;
            this.bg = new int[500];
            this.bx = new int[500];
            this.bu = new long[500];
            this.br = 0;
            this.bh = new mo(5);
            this.bt = new mo(5);
            ar(100, -595335362);
            av(-1552848527);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(int i, int i2, int i3) {
        try {
            this.as = 2062460553 * i;
            this.ag = 135277821 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ab(int i) {
        try {
            if (io.aq == this.ad) {
                ac((byte) 4);
                if (this.ac) {
                    bk(0);
                } else if (this.az || this.al * -1690525005 == 0) {
                    an(io.ar, -2106115348);
                } else if (this.aw && this.al * -1690525005 == 1 && gq.ad((byte) 31) >= (this.aj * -928872075157084601L) + 600) {
                    an(io.al, -2119580344);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(byte b) {
        try {
            this.ag = -135277821;
            this.as = -2062460553;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(int i) {
        try {
            int aq = (int) this.bh.aq(1393716348);
            this.bh.ar((byte) -40);
            return (aq <= -5 || aq >= 5) ? aq : 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ae(int i, long j) {
        try {
            this.bo[i] = false;
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af(int i) {
        try {
            this.bm = 0;
            this.ba = false;
            aj(325552933);
            int i2 = this.ad.aw * 492426277;
            if (i2 == 0 || i2 == 4) {
                an(io.ax, -2132172579);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ag(int i, int i2, int i3, long j) {
        if (i >= 4) {
            return true;
        }
        StringBuilder stringBuilder;
        try {
            int cn;
            long ad = gq.ad((byte) -22);
            int i4 = this.ak[i];
            if (1 == this.ar * -1892634803) {
                this.bt.ad((long) (i2 - this.am[0]));
                this.bh.ad((long) (i3 - this.ak[0]));
            }
            this.am[i] = i2;
            this.ak[i] = i3;
            if (this.al * -1690525005 == 2 && this.ad.aw * 492426277 == 9) {
                cn = (int) ((cn(0, 1, 30739624) - this.bw) / 5.0d);
                this.bw += (double) (cn * 5);
                client.ni = ((-cn) * 2046550439) + client.ni;
            }
            if (i == 0) {
                aw(i2, i3, j);
                if (this.ar * -1892634803 == 1 && ad >= this.aj * -928872075157084601L) {
                    cn = this.ai[0];
                    int i5 = this.ae[0];
                    if (i2 < cn - (this.bk * 1574127547) || i2 > cn + (this.bk * 1574127547) || i3 < i5 - (this.bk * 1574127547) || i3 > (this.bk * 1574127547) + i5) {
                        this.ac = true;
                        cn = this.ad.aw * 492426277;
                        if (cn == 3) {
                            client.nh = (i3 - i4) * 1623112241;
                        } else if (cn != 5) {
                            switch (cn) {
                                case 10:
                                    an(io.aj, -2055441702);
                                    return true;
                                case 11:
                                    an(io.ax, -2140432986);
                                    return true;
                                default:
                                    return true;
                            }
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("ik.ag(");
                            stringBuilder.append(')');
                            throw mv.aq(e, stringBuilder.toString());
                        } else if (!this.ba) {
                            bk(ad);
                            return true;
                        }
                    }
                }
            }
            return true;
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(int i) {
        try {
            this.bk = ((this.ab * 743213797) / 200) * -1497471629;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ai(int i, long j) {
        try {
            if (this.bm * 2015638429 < this.bq.length) {
                this.bq[this.bm * 2015638429] = i;
                this.bd[this.bm * 2015638429] = 0;
                this.bm -= 805115211;
            }
            this.bo[i] = true;
            if (client.lq * -408822943 >= 2 && i == 66 && this.bo[82]) {
                er.bx((byte) -41);
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i) {
        try {
            this.bf = 349612019;
            this.bl = 962450571;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ak(int i, int i2, int i3, int i4, long j) {
        if (i >= 4) {
            return true;
        }
        try {
            if (i > this.ar * -1892634803) {
                return true;
            }
            if (i == 0) {
                this.aj = gq.ad((byte) -13) * 274262716501877623L;
            }
            if (i == this.ar * -1892634803) {
                this.ar -= 745791099;
                this.ai[i] = i3;
                this.ae[i] = i4;
            }
            this.al -= 809182085;
            this.am[i] = i3;
            this.ak[i] = i4;
            int i5;
            if (this.ar * -1892634803 == 1) {
                this.ba = true;
                i5 = this.ad.aw * 492426277;
                if (i5 != 8) {
                    if (i5 != 14) {
                        return true;
                    }
                    if (i2 == 4 && cl.cs) {
                        an(io.ap, -2121708820);
                        return true;
                    }
                    aa(i3, i4, 1427907258);
                    if (2 == i2) {
                        an(io.al, -2098333176);
                    } else {
                        an(io.aq, -2075155959);
                    }
                    ax(i3, i4, j, i2 == 2, 1037018172);
                    return true;
                } else if (this.az) {
                    an(io.ar, -2067641119);
                    return true;
                }
            } else if (this.ar * -1892634803 == 2) {
                i5 = this.ad.aw * 492426277;
                if (i5 != 5 && i5 != 7 && i5 != 14) {
                    return true;
                }
                an(io.au, -2054897480);
                this.bw = cn(0, 1, -610043826);
                bm(0, 1, 387030863);
                Math.log((double) client.qi);
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(int i) {
        try {
            this.bv = 0;
            aj(-648639126);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean am(char c, long j) {
        try {
            if (this.bm * 2015638429 < this.bq.length) {
                this.bq[this.bm * 2015638429] = -1;
                this.bd[this.bm * 2015638429] = c;
                this.bm -= 805115211;
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void an(io ioVar, int i) {
        StringBuilder stringBuilder;
        try {
            this.ad = ioVar;
            int i2 = this.ad.aw * 492426277;
            if (i2 != 10) {
                switch (i2) {
                    case 6:
                        if (this.ap * -1009372225 != -1) {
                            aa(this.ap * -1009372225, this.au * 1549876117, 1427907258);
                            this.am[0] = this.ap * -1009372225;
                            this.ak[0] = this.au * 1549876117;
                        } else {
                            ac((byte) 4);
                        }
                        av(-2136345821);
                        return;
                    case 7:
                        client.hi = this.am[this.br * -1839915979] * -665888805;
                        client.hu = this.ak[this.br * -1839915979] * -1997497607;
                        return;
                    default:
                        return;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("ik.an(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            } else if (this.al * -1690525005 == 0) {
                this.ad = io.aj;
            }
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("ik.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(int i) {
        try {
            aa(this.am[0], this.ak[0], 1427907258);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ap(int i, int i2, long j) {
        try {
            this.ap = 771210303 * i;
            this.au = 1547843517 * i2;
            aw(i, i2, j);
            int i3 = this.ad.aw * 492426277;
            if (i3 == 8 || i3 == 10) {
                if (io.al == this.ad) {
                    an(io.aj, -2103730062);
                }
                this.am[0] = i;
                this.ak[0] = i2;
            } else if (i3 == 14) {
                this.am[0] = i;
                this.ak[0] = i2;
                aa(i, i2, 1427907258);
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(byte b) {
        try {
            int aq = (int) this.bt.aq(383480512);
            this.bt.ar((byte) -45);
            return (aq <= -5 || aq >= 5) ? aq : 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i, int i2) {
        try {
            this.ab = 211314981 * i;
            ah(359080032);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean as(int i, int i2, int i3, int i4, long j) {
        int i5 = 0;
        if (i < 4) {
            try {
                if (this.al * -1690525005 != 0) {
                    this.al += 809182085;
                    if (this.al * -1690525005 == 0) {
                        int i6 = this.ad.aw * 492426277;
                        if (i6 == 1) {
                            an(io.am, -2097501623);
                        } else if (i6 != 3) {
                            switch (i6) {
                                case 5:
                                    an(io.ar, -2023036805);
                                    break;
                                case 6:
                                    av(-1152228747);
                                    break;
                                case 7:
                                case 9:
                                    an(io.ax, -2025364369);
                                    break;
                                case 8:
                                    an(io.ar, -2050150464);
                                    break;
                                case 10:
                                    an(io.aj, -2120153556);
                                    this.am[0] = this.ap * -1009372225;
                                    this.ak[0] = this.au * 1549876117;
                                    break;
                                case 11:
                                    an(io.ar, -2080445679);
                                    break;
                                case 12:
                                    an(io.as, -2104976728);
                                    break;
                            }
                        } else {
                            an(io.ax, -2116058404);
                        }
                    }
                    if (this.al * -1690525005 == 1 && io.au == this.ad) {
                        if (i == 0) {
                            i5 = 1;
                        }
                        this.br = i5 * 161109533;
                        an(io.ap, -2031870050);
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ik.as(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void at(int i) {
        int i2 = 0;
        while (i2 < 4) {
            try {
                int[] iArr = this.ai;
                this.ae[i2] = -1;
                iArr[i2] = -1;
                iArr = this.am;
                this.ak[i2] = -1;
                iArr[i2] = -1;
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ik.at(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public boolean au(int i, long j) {
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void av(int i) {
        try {
            if (this.al * -1690525005 == 0) {
                this.ad = io.ad;
                ay((byte) -48);
                this.ar = 0;
                at(-2146209351);
                if (this.ap * -1009372225 != -1) {
                    this.am[0] = this.ap * -1009372225;
                    this.ak[0] = this.au * 1549876117;
                }
                this.br = 0;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(int i, int i2, long j) {
        try {
            if (this.bv * 755624735 > 0 && this.bu[(this.bv * 755624735) - 1] / 50 == j / 50) {
                this.bv -= 1666044127;
            } else if (this.bv * 755624735 >= 500) {
                return;
            }
            this.bg[this.bv * 755624735] = i;
            this.bx[this.bv * 755624735] = i2;
            this.bu[this.bv * 755624735] = j;
            this.bv += 1666044127;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(int i, int i2, long j, boolean z, int i3) {
        try {
            this.bl = -962450571 * i;
            this.bf = -349612019 * i2;
            this.bi = 1591504137385911185L * j;
            this.bb = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ay(byte b) {
        try {
            this.aa = false;
            this.ah = false;
            this.ao = false;
            this.ac = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean az(int i, long j) {
        return true;
    }

    public boolean ba(int i, int i2) {
        try {
            return this.bo[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean bb(int i, long j) {
        if (this.bm * 2015638429 < this.bq.length) {
            this.bq[this.bm * 2015638429] = i;
            this.bd[this.bm * 2015638429] = 0;
            this.bm -= 805115211;
        }
        this.bo[i] = true;
        if (client.lq * -408822943 >= 2 && i == 66 && this.bo[82]) {
            er.bx((byte) -55);
        }
        return true;
    }

    public boolean bc(int i, long j) {
        this.bo[i] = false;
        return true;
    }

    public boolean bd(int i, long j) {
        if (this.bm * -1922821750 < this.bq.length) {
            this.bq[this.bm * -2113695924] = i;
            this.bd[this.bm * 2015638429] = 0;
            this.bm -= 805115211;
        }
        this.bo[i] = true;
        if (client.lq * -408822943 >= 2 && i == 66 && this.bo[82]) {
            er.bx((byte) -125);
        }
        return true;
    }

    public boolean be(int i, int i2, long j) {
        this.ap = -491979452 * i;
        this.au = -1830577554 * i2;
        aw(i, i2, j);
        int i3 = this.ad.aw * 612347301;
        if (i3 == 8 || i3 == 10) {
            if (io.al == this.ad) {
                an(io.aj, -2044753878);
            }
            this.am[0] = i;
            this.ak[0] = i2;
        } else if (i3 == 14) {
            this.am[0] = i;
            this.ak[0] = i2;
            aa(i, i2, 1427907258);
        }
        return true;
    }

    public boolean bf(int i, long j) {
        if (this.bm * 237821343 < this.bq.length) {
            this.bq[this.bm * 2015638429] = i;
            this.bd[this.bm * 2015638429] = 0;
            this.bm -= 400712140;
        }
        this.bo[i] = true;
        if (client.lq * 814933938 >= 2 && i == 1672641789 && this.bo[619364182]) {
            er.bx((byte) -51);
        }
        return true;
    }

    public boolean bg(int i, int i2, int i3, int i4, long j) {
        if (i >= 4) {
            return true;
        }
        if (i > this.ar * -1892634803) {
            return true;
        }
        if (i == 0) {
            this.aj = gq.ad((byte) 82) * 274262716501877623L;
        }
        if (i == this.ar * -1892634803) {
            this.ar -= 745791099;
            this.ai[i] = i3;
            this.ae[i] = i4;
        }
        this.al -= 809182085;
        this.am[i] = i3;
        this.ak[i] = i4;
        int i5;
        if (this.ar * -1892634803 == 1) {
            this.ba = true;
            i5 = this.ad.aw * 492426277;
            if (i5 != 8) {
                if (i5 != 14) {
                    return true;
                }
                if (i2 == 4 && cl.cs) {
                    an(io.ap, -2069182114);
                    return true;
                }
                aa(i3, i4, 1427907258);
                if (2 == i2) {
                    an(io.al, -2030102995);
                } else {
                    an(io.aq, -2111077679);
                }
                ax(i3, i4, j, i2 == 2, -1520224646);
                return true;
            } else if (this.az) {
                an(io.ar, -2083855194);
                return true;
            }
        } else if (this.ar * -1892634803 == 2) {
            i5 = this.ad.aw * 492426277;
            if (i5 != 5 && i5 != 7 && i5 != 14) {
                return true;
            }
            an(io.au, -2111974537);
            this.bw = cn(0, 1, -383611506);
            bm(0, 1, 387030863);
            Math.log((double) client.qi);
        }
        return true;
    }

    public boolean bh(int i, long j) {
        return true;
    }

    public boolean bi(int i, long j) {
        this.bo[i] = false;
        return true;
    }

    public boolean bj(int i, int i2, long j) {
        this.ap = 771210303 * i;
        this.au = 1547843517 * i2;
        aw(i, i2, j);
        int i3 = this.ad.aw * 877320411;
        if (i3 == 8 || i3 == 10) {
            if (io.al == this.ad) {
                an(io.aj, -2113889490);
            }
            this.am[0] = i;
            this.ak[0] = i2;
        } else if (i3 == 14) {
            this.am[0] = i;
            this.ak[0] = i2;
            aa(i, i2, 1427907258);
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(long j) {
        try {
            if (this.ah && (!this.ao || j >= (this.aj * -928872075157084601L) + 150)) {
                an(io.ae, -2076839011);
            } else if (this.ao) {
                an(io.ak, -2088521769);
            } else if (this.aa) {
                an(io.ap, -2124650497);
            } else {
                an(io.ax, -2080277395);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.bk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean bl(int i, long j) {
        if (this.bm * -2078848860 < this.bq.length) {
            this.bq[this.bm * -1114064869] = i;
            this.bd[this.bm * 1370935974] = 0;
            this.bm -= 1201390626;
        }
        this.bo[i] = true;
        if (client.lq * -421612545 >= 2 && i == 1321733428 && this.bo[82]) {
            er.bx((byte) -93);
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public double bm(int i, int i2, int i3) {
        try {
            return Math.atan2((double) (this.am[i] - this.am[i2]), (double) (this.ak[i] - this.ak[i2]));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.bm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean bn(int i, long j) {
        return true;
    }

    public boolean bo(int i, long j) {
        if (this.bm * 948375824 < this.bq.length) {
            this.bq[this.bm * 2015638429] = i;
            this.bd[this.bm * 768326503] = 0;
            this.bm -= 805115211;
        }
        this.bo[i] = true;
        if (client.lq * -408822943 >= 2 && i == 1166003802 && this.bo[82]) {
            er.bx((byte) -79);
        }
        return true;
    }

    public boolean bp(int i, long j) {
        return true;
    }

    public boolean bq(int i, long j) {
        if (this.bm * 2015638429 < this.bq.length) {
            this.bq[this.bm * 2015638429] = i;
            this.bd[this.bm * 2015638429] = 0;
            this.bm -= 805115211;
        }
        this.bo[i] = true;
        if (client.lq * -408822943 >= 2 && i == 66 && this.bo[82]) {
            er.bx((byte) -51);
        }
        return true;
    }

    public boolean br(int i, int i2, int i3, int i4, long j) {
        int i5 = 0;
        if (i < 4 && this.al * -215133051 != 0) {
            this.al += 809182085;
            if (this.al * -1690525005 == 0) {
                int i6 = this.ad.aw * -2061057903;
                if (i6 == 1) {
                    an(io.am, -2122824672);
                } else if (i6 != 3) {
                    switch (i6) {
                        case 5:
                            an(io.ar, -2090601846);
                            break;
                        case 6:
                            av(-1548014314);
                            break;
                        case 7:
                        case 9:
                            an(io.ax, -2089914267);
                            break;
                        case 8:
                            an(io.ar, -2091657383);
                            break;
                        case 10:
                            an(io.aj, -2115507695);
                            this.am[0] = this.ap * 1738997414;
                            this.ak[0] = this.au * 2123792669;
                            break;
                        case 11:
                            an(io.ar, -2077004045);
                            break;
                        case 12:
                            an(io.as, -2081702246);
                            break;
                    }
                } else {
                    an(io.ax, -2062282454);
                }
            }
            if (this.al * -1690525005 == 1 && io.au == this.ad) {
                if (i == 0) {
                    i5 = 1;
                }
                this.br = i5 * 161109533;
                an(io.ap, -2102160500);
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(int i) {
        try {
            this.al = 0;
            av(-1007310891);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean bt(int i, long j) {
        return true;
    }

    public boolean bu(int i, int i2, int i3, int i4, long j) {
        if (i >= 4) {
            return true;
        }
        if (i > this.ar * -1892634803) {
            return true;
        }
        if (i == 0) {
            this.aj = gq.ad((byte) 96) * 274262716501877623L;
        }
        if (i == this.ar * -1125302816) {
            this.ar -= 745791099;
            this.ai[i] = i3;
            this.ae[i] = i4;
        }
        this.al -= 809182085;
        this.am[i] = i3;
        this.ak[i] = i4;
        int i5;
        if (this.ar * -1024524511 == 1) {
            this.ba = true;
            i5 = this.ad.aw * 492426277;
            if (i5 != 8) {
                if (i5 != 14) {
                    return true;
                }
                if (i2 == 4 && cl.cs) {
                    an(io.ap, -2098147623);
                    return true;
                }
                aa(i3, i4, 1427907258);
                if (2 == i2) {
                    an(io.al, -2113048336);
                } else {
                    an(io.aq, -2080871471);
                }
                ax(i3, i4, j, i2 == 2, -1461043376);
                return true;
            } else if (this.az) {
                an(io.ar, -2051304548);
                return true;
            }
        } else if (this.ar * -1892634803 == 2) {
            i5 = this.ad.aw * 492426277;
            if (i5 != 5 && i5 != 7 && i5 != 14) {
                return true;
            }
            an(io.au, -2050712449);
            this.bw = cn(0, 1, 1451461602);
            bm(0, 1, 387030863);
            Math.log((double) client.qi);
        }
        return true;
    }

    public boolean bv(char c, long j) {
        if (this.bm * 2015638429 < this.bq.length) {
            this.bq[this.bm * 2015638429] = -1;
            this.bd[this.bm * 2015638429] = c;
            this.bm += 1075454429;
        }
        return true;
    }

    public boolean bw(int i, int i2, int i3, int i4, long j) {
        int i5 = 0;
        if (i < 4 && this.al * 542332993 != 0) {
            this.al -= 852303245;
            if (this.al * -1690525005 == 0) {
                int i6 = this.ad.aw * 492426277;
                if (i6 == 1) {
                    an(io.am, -2063042649);
                } else if (i6 != 3) {
                    switch (i6) {
                        case 5:
                            an(io.ar, -2034071714);
                            break;
                        case 6:
                            av(-1420930600);
                            break;
                        case 7:
                        case 9:
                            an(io.ax, -2111209421);
                            break;
                        case 8:
                            an(io.ar, -2062726149);
                            break;
                        case 10:
                            an(io.aj, -2052839680);
                            this.am[0] = this.ap * 1077563284;
                            this.ak[0] = this.au * -1715313448;
                            break;
                        case 11:
                            an(io.ar, -2022730269);
                            break;
                        case 12:
                            an(io.as, -2072863609);
                            break;
                    }
                } else {
                    an(io.ax, -2123479940);
                }
            }
            if (this.al * -1491311559 == 1 && io.au == this.ad) {
                if (i == 0) {
                    i5 = 1;
                }
                this.br = i5 * 161109533;
                an(io.ap, -2116790505);
            }
        }
        return true;
    }

    public boolean bx(int i, int i2, int i3, int i4, long j) {
        if (i >= 4) {
            return true;
        }
        if (i > this.ar * -1892634803) {
            return true;
        }
        if (i == 0) {
            this.aj = gq.ad((byte) -109) * 274262716501877623L;
        }
        if (i == this.ar * -1892634803) {
            this.ar -= 745791099;
            this.ai[i] = i3;
            this.ae[i] = i4;
        }
        this.al -= 809182085;
        this.am[i] = i3;
        this.ak[i] = i4;
        int i5;
        if (this.ar * -1892634803 == 1) {
            this.ba = true;
            i5 = this.ad.aw * 492426277;
            if (i5 != 8) {
                if (i5 != 14) {
                    return true;
                }
                if (i2 == 4 && cl.cs) {
                    an(io.ap, -2130569961);
                    return true;
                }
                aa(i3, i4, 1427907258);
                if (2 == i2) {
                    an(io.al, -2103472391);
                } else {
                    an(io.aq, -2049906361);
                }
                ax(i3, i4, j, i2 == 2, -585076126);
                return true;
            } else if (this.az) {
                an(io.ar, -2053098231);
                return true;
            }
        } else if (this.ar * -1892634803 == 2) {
            i5 = this.ad.aw * 492426277;
            if (i5 != 5 && i5 != 7 && i5 != 14) {
                return true;
            }
            an(io.au, -2041930065);
            this.bw = cn(0, 1, -817616906);
            bm(0, 1, 387030863);
            Math.log((double) client.qi);
        }
        return true;
    }

    public boolean by(int i, long j) {
        return true;
    }

    public boolean bz(int i, long j) {
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void ca(int i, int i2, long j, boolean z) {
        this.bl = -962450571 * i;
        this.bf = -349612019 * i2;
        this.bi = 1591504137385911185L * j;
        this.bb = z;
    }

    /* Access modifiers changed, original: 0000 */
    public void cb(int i) {
        this.ab = 211314981 * i;
        ah(-960655744);
    }

    /* Access modifiers changed, original: 0000 */
    public void cc() {
        this.bf = 1028026434;
        this.bl = 962450571;
    }

    /* Access modifiers changed, original: 0000 */
    public void cd(int i, int i2) {
        this.as = 2062460553 * i;
        this.ag = 135277821 * i2;
    }

    /* Access modifiers changed, original: 0000 */
    public void ce() {
        this.bv = 0;
        aj(-1333837876);
    }

    /* Access modifiers changed, original: 0000 */
    public void cf(int i, int i2) {
        this.as = 2062460553 * i;
        this.ag = -1395730104 * i2;
    }

    /* Access modifiers changed, original: 0000 */
    public void cg() {
        aa(this.am[0], this.ak[0], 1427907258);
    }

    /* Access modifiers changed, original: 0000 */
    public void ch() {
        aa(this.am[0], this.ak[0], 1427907258);
    }

    /* Access modifiers changed, original: 0000 */
    public int ci() {
        int aq = (int) this.bt.aq(1674467431);
        this.bt.ar((byte) 40);
        return (aq <= 1617878889 || aq >= 5) ? aq : 0;
    }

    public boolean cj(int i, int i2, int i3, long j) {
        if (i >= 4) {
            return true;
        }
        int cn;
        long ad = gq.ad((byte) -60);
        int i4 = this.ak[i];
        if (1 == this.ar * -1892634803) {
            this.bt.ad((long) (i2 - this.am[0]));
            this.bh.ad((long) (i3 - this.ak[0]));
        }
        this.am[i] = i2;
        this.ak[i] = i3;
        if (this.al * -1690525005 == 2 && this.ad.aw * 492426277 == 9) {
            cn = (int) ((cn(0, 1, -124915710) - this.bw) / 5.0d);
            this.bw += (double) (cn * 5);
            client.ni = ((-cn) * 2046550439) + client.ni;
        }
        if (i == 0) {
            aw(i2, i3, j);
            if (this.ar * -1892634803 == 1 && ad >= this.aj * -928872075157084601L) {
                cn = this.ai[0];
                int i5 = this.ae[0];
                if (i2 < cn - (this.bk * 1574127547) || i2 > cn + (this.bk * 1574127547) || i3 < i5 - (this.bk * 1574127547) || i3 > (this.bk * 1574127547) + i5) {
                    this.ac = true;
                    cn = this.ad.aw * 492426277;
                    if (cn == 3) {
                        client.nh = (i3 - i4) * 1623112241;
                    } else if (cn != 5) {
                        switch (cn) {
                            case 10:
                                an(io.aj, -2130350940);
                                return true;
                            case 11:
                                an(io.ax, -2035943933);
                                return true;
                            default:
                                return true;
                        }
                    } else if (!this.ba) {
                        bk(ad);
                        return true;
                    }
                }
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void ck(int i, int i2, long j) {
        if (this.bv * 755624735 > 0 && this.bu[(this.bv * 755624735) - 1] / 50 == j / 50) {
            this.bv -= 482091681;
        } else if (this.bv * 1968653415 >= 747906231) {
            return;
        }
        this.bg[this.bv * 755624735] = i;
        this.bx[this.bv * 755624735] = i2;
        this.bu[this.bv * 1400866986] = j;
        this.bv -= 1468481036;
    }

    /* Access modifiers changed, original: 0000 */
    public void cl() {
        this.ag = -135277821;
        this.as = -2062460553;
    }

    public boolean cm(int i, int i2, int i3, long j) {
        if (i >= 4) {
            return true;
        }
        int cn;
        long ad = gq.ad((byte) -10);
        int i4 = this.ak[i];
        if (1 == this.ar * -1892634803) {
            this.bt.ad((long) (i2 - this.am[0]));
            this.bh.ad((long) (i3 - this.ak[0]));
        }
        this.am[i] = i2;
        this.ak[i] = i3;
        if (this.al * 967380769 == 2 && this.ad.aw * -1905343268 == 9) {
            cn = (int) ((cn(0, 1, -1414839873) - this.bw) / 5.0d);
            this.bw += (double) (cn * 5);
            client.ni = ((-cn) * 461479707) + client.ni;
        }
        if (i == 0) {
            aw(i2, i3, j);
            if (this.ar * -1293011734 == 1 && ad >= this.aj * -928872075157084601L) {
                cn = this.ai[0];
                int i5 = this.ae[0];
                if (i2 < cn - (this.bk * 1574127547) || i2 > cn + (this.bk * 1574127547) || i3 < i5 - (this.bk * 1574127547) || i3 > (this.bk * -1244793743) + i5) {
                    this.ac = true;
                    cn = this.ad.aw * 492426277;
                    if (cn == 3) {
                        client.nh = (i3 - i4) * -267068311;
                    } else if (cn != 5) {
                        switch (cn) {
                            case 10:
                                an(io.aj, -2088487724);
                                return true;
                            case 11:
                                an(io.ax, -2065136827);
                                return true;
                            default:
                                return true;
                        }
                    } else if (!this.ba) {
                        bk(ad);
                        return true;
                    }
                }
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public double cn(int i, int i2, int i3) {
        try {
            return Math.hypot((double) (this.am[i] - this.am[i2]), (double) (this.ak[i] - this.ak[i2]));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ik.cn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void co(int i, int i2, long j) {
        if (this.bv * -240711663 > 0 && this.bu[(this.bv * 755624735) - 1] / 50 == j / 50) {
            this.bv -= 334719164;
        } else if (this.bv * 755624735 >= 500) {
            return;
        }
        this.bg[this.bv * -1183195084] = i;
        this.bx[this.bv * 991231640] = i2;
        this.bu[this.bv * 755624735] = j;
        this.bv += 1721241762;
    }

    /* Access modifiers changed, original: 0000 */
    public int cp() {
        int aq = (int) this.bh.aq(637413693);
        this.bh.ar((byte) 53);
        return (aq <= -5 || aq >= 5) ? aq : 0;
    }

    public boolean cq(int i, int i2, int i3, long j) {
        if (i >= 4) {
            return true;
        }
        int cn;
        long ad = gq.ad((byte) -6);
        int i4 = this.ak[i];
        if (1 == this.ar * -1892634803) {
            this.bt.ad((long) (i2 - this.am[0]));
            this.bh.ad((long) (i3 - this.ak[0]));
        }
        this.am[i] = i2;
        this.ak[i] = i3;
        if (this.al * -63221699 == 2 && this.ad.aw * -970019526 == 9) {
            cn = (int) ((cn(0, 1, -1464746119) - this.bw) / 5.0d);
            this.bw += (double) (cn * 5);
            client.ni = ((-cn) * 2046550439) + client.ni;
        }
        if (i == 0) {
            aw(i2, i3, j);
            if (this.ar * -1331781026 == 1 && ad >= this.aj * -928872075157084601L) {
                cn = this.ai[0];
                int i5 = this.ae[0];
                if (i2 < cn - (this.bk * -419254973) || i2 > cn + (this.bk * 913437280) || i3 < i5 - (this.bk * 1574127547) || i3 > (this.bk * 1574127547) + i5) {
                    this.ac = true;
                    cn = this.ad.aw * 492426277;
                    if (cn == 3) {
                        client.nh = (i3 - i4) * 1623112241;
                    } else if (cn != 5) {
                        switch (cn) {
                            case 10:
                                an(io.aj, -2138099519);
                                return true;
                            case 11:
                                an(io.ax, -2131272548);
                                return true;
                            default:
                                return true;
                        }
                    } else if (!this.ba) {
                        bk(ad);
                        return true;
                    }
                }
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void cr() {
        this.bf = 349612019;
        this.bl = 962450571;
    }

    /* Access modifiers changed, original: 0000 */
    public void cs() {
        this.bf = 349612019;
        this.bl = 962450571;
    }

    /* Access modifiers changed, original: 0000 */
    public void ct(int i, int i2, long j) {
        if (this.bv * 755624735 > 0 && this.bu[(this.bv * -1715094026) - 1] / 50 == j / 50) {
            this.bv += 1612071566;
        } else if (this.bv * 755624735 >= 500) {
            return;
        }
        this.bg[this.bv * 2043227442] = i;
        this.bx[this.bv * 755624735] = i2;
        this.bu[this.bv * 1454941551] = j;
        this.bv += 148190788;
    }

    /* Access modifiers changed, original: 0000 */
    public void cu() {
        this.ag = -135277821;
        this.as = -2062460553;
    }

    public boolean cv(int i, long j) {
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public int cw() {
        int aq = (int) this.bh.aq(43890313);
        this.bh.ar((byte) -92);
        return (aq <= -5 || aq >= 5) ? aq : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void cx(int i, int i2, long j, boolean z) {
        this.bl = -1704745089 * i;
        this.bf = 1928731321 * i2;
        this.bi = 1591504137385911185L * j;
        this.bb = z;
    }

    /* Access modifiers changed, original: 0000 */
    public void cy() {
        this.bv = 0;
        aj(-1317719031);
    }

    /* Access modifiers changed, original: 0000 */
    public void cz(int i, int i2) {
        this.as = 2062460553 * i;
        this.ag = 135277821 * i2;
    }

    public void da() {
        if (io.aq == this.ad) {
            ac((byte) 4);
            if (this.ac) {
                bk(0);
            } else if (this.az || this.al * -1690525005 == 0) {
                an(io.ar, -2062502024);
            } else if (this.aw && this.al * -1690525005 == 1 && gq.ad((byte) -62) >= (this.aj * -928872075157084601L) + 600) {
                an(io.al, -2138011118);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void db() {
        if (this.al * -1390997060 == 0) {
            this.ad = io.ad;
            ay((byte) 30);
            this.ar = 0;
            at(-2088339390);
            if (this.ap * 17252028 != -1) {
                this.am[0] = this.ap * 785955458;
                this.ak[0] = this.au * -1311143760;
            }
            this.br = 0;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dc() {
        if (this.al * -1690525005 == 0) {
            this.ad = io.ad;
            ay((byte) -19);
            this.ar = 0;
            at(-2079464034);
            if (this.ap * -1009372225 != -1) {
                this.am[0] = this.ap * -1009372225;
                this.ak[0] = this.au * 1549876117;
            }
            this.br = 0;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dd() {
        this.bk = ((this.ab * 403613667) / -234372978) * -1261687095;
    }

    public boolean de(int i) {
        return this.bo[i];
    }

    public void df(io ioVar) {
        this.ad = ioVar;
        int i = this.ad.aw * -1705560886;
        if (i != 10) {
            switch (i) {
                case 6:
                    if (this.ap * -1009372225 != -1) {
                        aa(this.ap * -1009372225, this.au * 1549876117, 1427907258);
                        this.am[0] = this.ap * -2128981280;
                        this.ak[0] = this.au * -440484928;
                    } else {
                        ac((byte) 4);
                    }
                    av(-1827581124);
                    return;
                case 7:
                    client.hi = this.am[this.br * 1874125129] * -558109448;
                    client.hu = this.ak[this.br * 2039149351] * -1997497607;
                    return;
                default:
                    return;
            }
        } else if (this.al * -1690525005 == 0) {
            this.ad = io.aj;
        }
    }

    public boolean dh(int i) {
        return this.bo[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void di() {
        this.bm = 0;
        this.ba = false;
        aj(-1778816701);
        int i = this.ad.aw * 492426277;
        if (i == 0 || i == 4) {
            an(io.ax, -2096203044);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public double dk(int i, int i2) {
        return Math.hypot((double) (this.am[i] - this.am[i2]), (double) (this.ak[i] - this.ak[i2]));
    }

    public void dl() {
        this.aa = false;
        this.ah = false;
        this.ao = false;
        this.ac = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void dm() {
        this.bm = 0;
        this.ba = false;
        aj(785159546);
        int i = this.ad.aw * 492426277;
        if (i == 0 || i == 4) {
            an(io.ax, -2101386403);
        }
    }

    public boolean dn(int i) {
        return this.bo[i];
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: do */
    public double m224do(int i, int i2) {
        return Math.hypot((double) (this.am[i] - this.am[i2]), (double) (this.ak[i] - this.ak[i2]));
    }

    /* Access modifiers changed, original: 0000 */
    public void dp(long j) {
        if (this.ah && (!this.ao || j >= (this.aj * -928872075157084601L) + 150)) {
            an(io.ae, -2111656522);
        } else if (this.ao) {
            an(io.ak, -2021740046);
        } else if (this.aa) {
            an(io.ap, -2091686897);
        } else {
            an(io.ax, -2022747223);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public double dq(int i, int i2) {
        return Math.hypot((double) (this.am[i] - this.am[i2]), (double) (this.ak[i] - this.ak[i2]));
    }

    public void dr() {
        this.aa = false;
        this.ah = false;
        this.ao = false;
        this.ac = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void ds() {
        this.al = 0;
        av(-1832936647);
    }

    /* Access modifiers changed, original: 0000 */
    public void dt() {
        this.bm = 0;
        this.ba = false;
        aj(2043430550);
        int i = this.ad.aw * 492426277;
        if (i == 0 || i == 4) {
            an(io.ax, -2113886957);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void du() {
        for (int i = 0; i < 4; i++) {
            int[] iArr = this.ai;
            this.ae[i] = -1;
            iArr[i] = -1;
            iArr = this.am;
            this.ak[i] = -1;
            iArr[i] = -1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dv() {
        this.bm = 0;
        this.ba = false;
        aj(-1773366539);
        int i = this.ad.aw * 492426277;
        if (i == 0 || i == 4) {
            an(io.ax, -2096794705);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public double dw(int i, int i2) {
        return Math.hypot((double) (this.am[i] - this.am[i2]), (double) (this.ak[i] - this.ak[i2]));
    }

    /* Access modifiers changed, original: 0000 */
    public double dx(int i, int i2) {
        return Math.hypot((double) (this.am[i] - this.am[i2]), (double) (this.ak[i] - this.ak[i2]));
    }

    /* Access modifiers changed, original: 0000 */
    public double dy(int i, int i2) {
        return Math.hypot((double) (this.am[i] - this.am[i2]), (double) (this.ak[i] - this.ak[i2]));
    }
}
