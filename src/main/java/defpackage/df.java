package defpackage;

import java.util.Collection;

/* renamed from: df */
public class df extends mp {
    public static final int ab = 24;
    static kh ad = null;
    static final int ag = 1024;
    static gz aq = new gz(64, null);
    public static final int az = 16;
    public static final int bz = 51;
    static kv di = null;
    static final int ej = 300;
    static final int eq = 8;
    public int ar;

    df() {
        try {
            this.ar = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("df.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(kh khVar) {
        ad = khVar;
    }

    public static void ai(kh khVar) {
        ad = khVar;
    }

    public static df ak(int i) {
        long j = (long) i;
        df dfVar = (df) aq.ad(j);
        if (dfVar == null) {
            byte[] ar = ad.ar(5, i, 1453884453);
            dfVar = new df();
            if (ar != null) {
                dfVar.ar(new lj(ar), (byte) 0);
            }
            aq.ar(dfVar, j);
        }
        return dfVar;
    }

    public static df am(int i) {
        long j = (long) i;
        df dfVar = (df) aq.ad(j);
        if (dfVar == null) {
            byte[] ar = ad.ar(5, i, 969012390);
            dfVar = new df();
            if (ar != null) {
                dfVar.ar(new lj(ar), (byte) -107);
            }
            aq.ar(dfVar, j);
        }
        return dfVar;
    }

    public static gc[] aq(byte b) {
        try {
            gc gcVar = gc.aj;
            gc gcVar2 = gc.ai;
            gc gcVar3 = gc.al;
            gc gcVar4 = gc.ar;
            gc gcVar5 = gc.aq;
            gc gcVar6 = gc.ad;
            return new gc[]{gcVar, gcVar2, gcVar3, gcVar4, gcVar5, gcVar6};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("df.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aw(Collection collection) {
        collection.add(aq);
    }

    public static void ax(Collection collection) {
        collection.add(aq);
    }

    public static void az(Collection collection) {
        collection.add(aq);
    }

    static final int bh(int i, int i2, int i3, int i4, int i5) {
        return ((i * i3) - (i4 * i2)) >> 16;
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 420116676);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, int i2) {
        if (2 == i) {
            try {
                this.ar = ljVar.an(-1464407032) * 1355341201;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("df.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(lj ljVar, int i) {
        if (2 == i) {
            this.ar = ljVar.an(-1464407032) * 1355341201;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, byte b) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    al(ljVar, af, 1355273115);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("df.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 413278078);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(lj ljVar, int i) {
        if (2 == i) {
            this.ar = ljVar.an(-1464407032) * 1355341201;
        }
    }
}
