package defpackage;

/* renamed from: ao */
public class ao implements lk {
    public static final ao ad = new ao(8, 0);
    public static final ao ae = new ao(1, 6);
    public static final ao ai = new ao(5, 5);
    @Deprecated
    static final ao aj = new ao(4, 4);
    static final ao ak = new ao(0, 8);
    @Deprecated
    static final ao al = new ao(2, 3);
    public static final ao am = new ao(3, 7);
    @Deprecated
    static final ao aq = new ao(6, 1);
    public static final ao ar = new ao(7, 2);
    final int ag;
    public final int as;

    ao(int i, int i2) {
        try {
            this.as = 714351279 * i;
            this.ag = 1544701545 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ao.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aj(int i) {
        try {
            ji.al.ap(-640650544);
            ko.aj = -515568231;
            ko.ai = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ao.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int at(int i, int i2) {
        return (i * 3) + 600;
    }

    static void bq(byte b) {
        int i = 0;
        try {
            int i2;
            client.bt = 7870706390006885767L;
            dk.uf = true;
            client.cv = true;
            client.oc = 7256369591142745279L;
            mr.ad(2114011769);
            client.eb.ad(25801684);
            client.eb.ai.al = 0;
            client.eb.ae = null;
            client.eb.ap = null;
            client.eb.au = null;
            client.eb.az = null;
            client.eb.am = 0;
            client.eb.as = 0;
            dw.ez.ak(-1208188129);
            client.cm = 0;
            client.ep = 0;
            client.cn = 0;
            gc.km.bt(213499629);
            fw.bp = gq.ad((byte) 35) * 7368450362842643319L;
            client.bh.al(-750854385);
            hw.ae(453198046);
            client.ky = 0;
            gc.km.ah(false, -1236848067);
            client.pq = 0;
            client.hq = 0;
            client.ha = 0;
            di.rl = null;
            client.pk = 0;
            client.ou = 83162897;
            client.os = 0;
            client.ow = 0;
            gc.km.cm(fb.al, 170839276);
            gc.km.cq(fb.al, (byte) 77);
            client.ed = 0;
            cc.ak(-1215408273);
            for (i2 = 0; i2 < 2048; i2++) {
                client.jz[i2] = null;
            }
            for (i2 = 0; i2 < 32768; i2++) {
                client.eg[i2] = null;
            }
            client.kw = -5287105;
            client.kv.ad();
            client.kg.ad();
            for (int i3 = 0; i3 < 4; i3++) {
                for (int i4 = 0; i4 < 104; i4++) {
                    for (i2 = 0; i2 < 104; i2++) {
                        client.kk[i3][i4][i2] = null;
                    }
                }
            }
            client.kh = new fy();
            al.rd.aj(-842804959);
            for (i2 = 0; i2 < dk.aq * -660380711; i2++) {
                if (bn.aq(i2, (byte) 16) != null) {
                    aj.aq[i2] = 0;
                    aj.ar[i2] = 0;
                }
            }
            ec.na.ae((byte) 0);
            client.lr = -65914701;
            if (-1 != client.ka * 676917989) {
                ae.aj(client.ka * 676917989, (byte) -28);
            }
            mb ar = client.kd.ar();
            while (true) {
                is isVar = (is) ar;
                if (isVar == null) {
                    break;
                }
                ay.hq(isVar, true, (byte) 50);
                ar = client.kd.al();
            }
            client.ka = 1645315347;
            client.kd = new ok(8);
            client.lh = null;
            gc.km.bt(-2069324184);
            client.re.ad(null, new int[]{0, 0, 0, 0, 0}, false, -1, (byte) -28);
            gc.km.az(-798498864);
            ix.ae(71226355);
            client.be = true;
            for (i2 = 0; i2 < 100; i2++) {
                client.nk[i2] = true;
            }
            cx.cu(-1909765752);
            li.or = null;
            while (i < 8) {
                client.rr[i] = new nk();
                i++;
            }
            nc.rb = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ao.bq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        try {
            return this.ag * -386946599;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ao.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ae() {
        return this == ar || this == al;
    }

    public int ai() {
        return this.ag * -386946599;
    }

    public int aj() {
        return this.ag * -386946599;
    }

    public boolean ak() {
        return ai == this || ae == this || this == am || ak == this;
    }

    public int al() {
        return this.ag * -386946599;
    }

    public boolean am() {
        return ai == this || ae == this || this == am || ak == this;
    }

    public boolean aq(byte b) {
        try {
            return this == ar || this == al;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ao.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ar(int i) {
        try {
            return ai == this || ae == this || this == am || ak == this;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ao.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
