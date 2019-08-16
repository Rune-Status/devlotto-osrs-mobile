package defpackage;

/* renamed from: ec */
public class ec extends ez {
    static final int ae = 100;
    static final int ax = 16384;
    static jv na;
    static float rs;
    public String ag;
    final ei ak;
    final my am;
    public byte ap;
    public String as;
    public int au;
    int az;

    public ec(my myVar, ei eiVar) {
        try {
            super(100);
            this.as = null;
            this.ag = null;
            this.az = -260439901;
            this.am = myVar;
            this.ak = eiVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ec.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ee[] aj(kh khVar, int i, int i2, int i3) {
        try {
            return !bv.ah(khVar, i, i2, 345177293) ? null : ai.ac(2130903499);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ec.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg[] af(int i, int i2) {
        try {
            return new ed[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ec.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg ah(byte b) {
        try {
            return new ed();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ec.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg cb() {
        return new ed();
    }

    /* Access modifiers changed, original: 0000 */
    public eg[] cc(int i) {
        return new ed[i];
    }

    /* Access modifiers changed, original: final */
    public final void cd(String str) {
        this.as = dr.aj(str, -1742400076);
    }

    /* Access modifiers changed, original: 0000 */
    public eg ce() {
        return new ed();
    }

    /* Access modifiers changed, original: final */
    public final void cf(String str) {
        this.as = dr.aj(str, -2088077428);
    }

    /* Access modifiers changed, original: final */
    public final void cg(String str) {
        this.ag = dr.aj(str, 109694687);
    }

    /* Access modifiers changed, original: final */
    public final void ch(String str) {
        this.ag = dr.aj(str, 1636038457);
    }

    public final void ck(lj ljVar, int i) {
        try {
            ct(ljVar.bm(1325851761), 458490454);
            cx(dy.aq(ljVar.bk(-1686254940)), -1433296527);
            this.ap = ljVar.ay(1236921977);
            int af = ljVar.af(1804771424);
            if (af != 255) {
                ad(-549797872);
                for (int i2 = 0; i2 < af; i2++) {
                    ed edVar = (ed) as(new en(ljVar.bm(1466287810), this.am), -400786231);
                    int an = ljVar.an(-1464407032);
                    int i3 = this.az - 260439901;
                    this.az = i3;
                    edVar.bg(an, (i3 * -412044533) - 1, -509333356);
                    edVar.ae = ljVar.ay(-906799757) * -1759235731;
                    ljVar.bm(2128606020);
                    cz(edVar, -1883698856);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ec.ck(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void cl(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            try {
                if (i3 < aq((byte) -3)) {
                    ((ed) ap(i3, 601786415)).aj(1350110947);
                    i2 = i3 + 1;
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ec.cl(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public final void co(lj ljVar, byte b) {
        try {
            en enVar = new en(ljVar.bm(1841574009), this.am);
            int an = ljVar.an(-1464407032);
            byte ay = ljVar.ay(1610471229);
            Object obj = null;
            if (ay == Byte.MIN_VALUE) {
                obj = 1;
            }
            ed edVar;
            if (obj == null) {
                ljVar.bm(2018929141);
                edVar = (ed) ai(enVar, 781900225);
                if (edVar == null) {
                    if (aq((byte) -61) <= this.ad * -368498347) {
                        edVar = (ed) as(enVar, -400786231);
                    } else {
                        return;
                    }
                }
                int i = this.az - 260439901;
                this.az = i;
                edVar.bg(an, (i * -412044533) - 1, -581635267);
                edVar.ae = -1759235731 * ay;
                cz(edVar, -1351854700);
            } else if (aq((byte) -73) != 0) {
                edVar = (ed) ai(enVar, 1287182996);
                if (edVar != null && edVar.bx(-886312257) == an) {
                    ak(edVar, (byte) 8);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ec.co(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ct(String str, int i) {
        try {
            this.ag = dr.aj(str, -215731388);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ec.ct(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void cu(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            try {
                if (i3 < aq((byte) -118)) {
                    ((ed) ap(i3, 601786415)).ad(-1450753527);
                    i2 = i3 + 1;
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ec.cu(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cx(String str, int i) {
        try {
            this.as = dr.aj(str, 1748549719);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ec.cx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg cy() {
        return new ed();
    }

    /* Access modifiers changed, original: final */
    public final void cz(ed edVar, int i) {
        try {
            if (edVar.ae((byte) 1).equals(this.ak.ar(1525569166))) {
                this.au = edVar.ae * -183193393;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ec.cz(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void da() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < aq((byte) -87)) {
                ((ed) ap(i2, 601786415)).aj(1350110947);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public final void db() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < aq((byte) -119)) {
                ((ed) ap(i2, 601786415)).aj(1350110947);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void dc(ed edVar) {
        if (edVar.ae((byte) 1).equals(this.ak.ar(1301640526))) {
            this.au = edVar.ae * -183193393;
        }
    }

    /* Access modifiers changed, original: final */
    public final void dd(String str) {
        this.ag = dr.aj(str, 1864296513);
    }

    public final void df() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < aq((byte) -43)) {
                ((ed) ap(i2, 601786415)).aj(1350110947);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public final void di(lj ljVar) {
        en enVar = new en(ljVar.bm(1034472742), this.am);
        int an = ljVar.an(-1464407032);
        byte ay = ljVar.ay(752837853);
        Object obj = null;
        if (ay == (byte) -35) {
            obj = 1;
        }
        ed edVar;
        if (obj == null) {
            ljVar.bm(1246611781);
            edVar = (ed) ai(enVar, 662124570);
            if (edVar == null) {
                if (aq((byte) -14) <= this.ad * -1864450155) {
                    edVar = (ed) as(enVar, -400786231);
                } else {
                    return;
                }
            }
            int i = this.az - 260439901;
            this.az = i;
            edVar.bg(an, (i * -412044533) - 1, 2105962248);
            edVar.ae = -1759235731 * ay;
            cz(edVar, 58219444);
        } else if (aq((byte) -28) != 0) {
            edVar = (ed) ai(enVar, 869867760);
            if (edVar != null && edVar.bx(-886312257) == an) {
                ak(edVar, (byte) 102);
            }
        }
    }

    public final void dl(lj ljVar) {
        en enVar = new en(ljVar.bm(915852998), this.am);
        int an = ljVar.an(-1464407032);
        byte ay = ljVar.ay(-1659028572);
        Object obj = null;
        if (ay == (byte) -9) {
            obj = 1;
        }
        ed edVar;
        if (obj == null) {
            ljVar.bm(1550487486);
            edVar = (ed) ai(enVar, 1390446599);
            if (edVar == null) {
                if (aq((byte) -63) <= this.ad * -368498347) {
                    edVar = (ed) as(enVar, -400786231);
                } else {
                    return;
                }
            }
            int i = this.az + 1195634886;
            this.az = i;
            edVar.bg(an, (i * -412044533) - 1, 1615123157);
            edVar.ae = -1759235731 * ay;
            cz(edVar, 537048194);
        } else if (aq((byte) -18) != 0) {
            edVar = (ed) ai(enVar, 1517072087);
            if (edVar != null && edVar.bx(-886312257) == an) {
                ak(edVar, (byte) 88);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void dm(String str) {
        this.ag = dr.aj(str, -489756145);
    }

    /* Access modifiers changed, original: final */
    public final void dp(ed edVar) {
        if (edVar.ae((byte) 1).equals(this.ak.ar(164559199))) {
            this.au = edVar.ae * -183193393;
        }
    }

    public final void dr() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < aq((byte) -98)) {
                ((ed) ap(i2, 601786415)).ad(-334728315);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public final void dt(lj ljVar) {
        ct(ljVar.bm(1914531318), -42642915);
        cx(dy.aq(ljVar.bk(-1994461333)), -2142781348);
        this.ap = ljVar.ay(609466691);
        int af = ljVar.af(1804771424);
        if (af != 255) {
            ad(31030673);
            for (int i = 0; i < af; i++) {
                ed edVar = (ed) as(new en(ljVar.bm(2145042869), this.am), -400786231);
                int an = ljVar.an(-1464407032);
                int i2 = this.az - 260439901;
                this.az = i2;
                edVar.bg(an, (i2 * -412044533) - 1, -715613323);
                edVar.ae = ljVar.ay(1779454851) * -1759235731;
                ljVar.bm(1632742460);
                cz(edVar, 1246263705);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void du(ed edVar) {
        if (edVar.ae((byte) 1).equals(this.ak.ar(515819118))) {
            this.au = edVar.ae * -183193393;
        }
    }

    public final void dv(lj ljVar) {
        ct(ljVar.bm(2010801245), 1661933323);
        cx(dy.aq(ljVar.bk(-1694412833)), 1600631248);
        this.ap = ljVar.ay(941066032);
        int af = ljVar.af(1804771424);
        if (af != 589482735) {
            ad(1325497683);
            for (int i = 0; i < af; i++) {
                ed edVar = (ed) as(new en(ljVar.bm(1254944318), this.am), -400786231);
                int an = ljVar.an(-1464407032);
                int i2 = this.az + 744827776;
                this.az = i2;
                edVar.bg(an, (i2 * -412044533) - 1, 940359747);
                edVar.ae = ljVar.ay(941054004) * -1759235731;
                ljVar.bm(1966782446);
                cz(edVar, -665748685);
            }
        }
    }
}
