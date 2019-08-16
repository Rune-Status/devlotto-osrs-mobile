package defpackage;

/* renamed from: gg */
public class gg extends hd {
    static int ac = 0;
    public static final int dk = 4;
    public static final int dw = 8;

    gg() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gg.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ag(al alVar, int i, int i2) {
        try {
            if (alVar.de != null) {
                if (alVar.gh == null) {
                    alVar.gh = new int[alVar.de.length];
                }
                alVar.gh[i] = Integer.MAX_VALUE;
                return;
            }
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gg.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void bt(int i) {
        try {
            hm.cu = 461952968;
            lv.bs(go.lz, go.lg, go.lh, -1804322940);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gg.bt(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ex(hv hvVar, int i, int i2, byte b, byte b2) {
        try {
            int i3 = hvVar.db[0];
            int i4 = hvVar.dc[0];
            int am = hvVar.am(975666045);
            if (i3 >= am) {
                int i5 = 104 - am;
                if (i3 < i5 && i4 >= am && i4 < i5 && i >= am && i < i5 && i2 >= am && i2 < i5) {
                    i4 = dt.ad(i3, i4, hvVar.am(-1543467405), cp.ej(i, i2, -1943587530), client.gc[hvVar.ab * -1300496125], true, client.sz, client.sf, (byte) -25);
                    if (i4 >= 1) {
                        for (i3 = 0; i3 < i4 - 1; i3++) {
                            hvVar.ag(client.sz[i3], client.sf[i3], b, (byte) -24);
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gg.ex(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i) {
        synchronized (this) {
            int i2 = 0;
            while (i2 < this.az * 1742034145) {
                try {
                    au(this.ag, 256);
                    i2 += 256;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("gg.ad(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al() {
        synchronized (this) {
            for (int i = 0; i < this.az * 1742034145; i += 256) {
                au(this.ag, 256);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq() {
        synchronized (this) {
            for (int i = 0; i < this.az * -1399829516; i += 256) {
                au(this.ag, -1612554844);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar() {
        synchronized (this) {
            for (int i = 0; i < this.az * 1742034145; i += 256) {
                au(this.ag, 256);
            }
        }
    }
}
