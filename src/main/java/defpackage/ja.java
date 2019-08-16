package defpackage;

/* renamed from: ja */
public final class ja extends br {
    static byte[][][] ae = null;
    public static final int aj = 4;
    public static final int br = 45;
    public int ad;
    int aq;

    ja() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ja.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ae(int i, int i2, byte b) {
        try {
            return (kk.aa == null || kk.aa.gs != ((long) ((i << 16) + i2))) ? 0 : ((kk.ah.al * 1694802239) / (kk.ah.ar.length - kk.aa.ar)) + 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ja.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void af(bl blVar, byte b) {
        try {
            if (!bu.ai) {
                int i = bc.bk;
                int i2 = bc.ba;
                int i3 = bc.bs;
                int i4 = bc.bm;
                int i5 = (((bu.al * 1111875095) - (blVar.bd * -1240378447)) * 50) / (blVar.bq * 1516652957);
                int i6 = (((bu.aj * -645814395) - (blVar.bo * -1165057787)) * 50) / (blVar.bq * 1516652957);
                int i7 = (((bu.al * 1111875095) - (blVar.bd * -1240378447)) * 3500) / (blVar.bq * 1516652957);
                int i8 = (((bu.aj * -645814395) - (blVar.bo * -1165057787)) * 3500) / (blVar.bq * 1516652957);
                int bn = af.bn(i6, 50, i2, i, 515685278);
                i6 = ak.bz(i6, 50, i2, i, (byte) 20);
                int bn2 = af.bn(i8, 3500, i2, i, -1800756196);
                i = ak.bz(i8, 3500, i2, i, (byte) 84);
                i2 = df.bh(i5, i6, i4, i3, 788053927);
                i5 = et.bt(i5, i6, i4, i3, (byte) -13);
                i6 = df.bh(i7, i, i4, i3, 788053927);
                i = et.bt(i7, i, i4, i3, (byte) -68);
                bu.ae = ((i2 + i6) / 2) * 1650422263;
                bu.am = ((bn2 + bn) / 2) * -1796605221;
                bf.ak = ((i5 + i) / 2) * -401541101;
                mf.as = ((i6 - i2) / 2) * -301758225;
                bu.ag = ((bn2 - bn) / 2) * 2033472713;
                at.ap = ((i - i5) / 2) * -1186422359;
                bw.au = Math.abs(mf.as * 1828759055) * -1906883241;
                is.az = Math.abs(bu.ag * -2051275399) * -2008037255;
                ix.ax = Math.abs(at.ap * 1432195737) * -424440581;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ja.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void bk(int i) {
        try {
            hm.cg = hm.cg.trim();
            if (hm.cg.length() == 0) {
                lv.bs(go.mp, go.me, go.mm, -1804322940);
                return;
            }
            long ad = ea.ad(996267135);
            switch (ad == 0 ? 5 : ew.aq(ad, hm.cg, -1525326948)) {
                case 2:
                    client.aq.abx((byte) 105).gs(aw.al, -1638519007);
                    lv.bs(go.ms, go.md, go.mb, -1804322940);
                    hm.cu = 1189230066;
                    return;
                case 3:
                    lv.bs(go.mo, go.mf, go.mh, -1804322940);
                    return;
                case 4:
                    lv.bs(go.mz, go.mk, go.mg, -1804322940);
                    return;
                case 5:
                    lv.bs(go.mt, go.mv, go.my, -1804322940);
                    return;
                case 6:
                    lv.bs(go.ma, go.mw, go.na, -1804322940);
                    return;
                case 7:
                    lv.bs(go.nc, go.nh, go.ni, -1804322940);
                    return;
                default:
                    return;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ja.bk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean gd(int i) {
        try {
            return client.lx != null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ja.gd(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bp ab() {
        try {
            return gl.aq(this.ad * -1830817693, 610461425).as(this.aq * 583844683, 2120296547);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ja.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dd() {
        return gl.aq(this.ad * -1830817693, 755416350).as(this.aq * 583844683, -498877506);
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dm() {
        return gl.aq(this.ad * -1830817693, 447160774).as(this.aq * 583844683, -845776683);
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dt() {
        return gl.aq(this.ad * -1830817693, -1774928509).as(this.aq * 583844683, 214693285);
    }
}
