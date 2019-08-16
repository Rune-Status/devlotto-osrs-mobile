package defpackage;

/* renamed from: cu */
public class cu implements lk {
    static final cu ad = new cu(3, (byte) 0);
    static final cu al = new cu(2, (byte) 3);
    static final int ap = 4095;
    static final cu aq = new cu(1, (byte) 1);
    static final cu ar = new cu(0, (byte) 2);
    static final int bx = 14;
    static ef[] ga;
    final byte ai;
    final int aj;

    cu(int i, byte b) {
        try {
            this.aj = 56295385 * i;
            this.ai = b;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cu.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, kh khVar2, kh khVar3, int i) {
        try {
            dr.ad = khVar;
            dr.aq = khVar2;
            dr.ar = khVar3;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cu.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int am(boolean z, boolean z2, int i) {
        int i2 = 0;
        if (z) {
            try {
                i2 = ((kk.ag * -745028503) + (kk.ak * -89514111)) + 0;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cu.am(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        if (!z2) {
            return i2;
        }
        return i2 + ((kk.az * -1006905) + (kk.aw * 1858318389));
    }

    static oi ao(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        try {
            oi oiVar = new oi(bArr, fq.al, fq.aj, dv.ai, fq.ae, fq.am, eh.ak);
            jn.an(-1399592634);
            return oiVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cu.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static ee aq(int i, int i2, int i3, short s) {
        try {
            return (ee) ci.ae.ad(bz.ad(i, i2, i3, 892790325));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cu.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static cu[] aq(byte b) {
        try {
            cu cuVar = aq;
            cu cuVar2 = al;
            cu cuVar3 = ad;
            cu cuVar4 = ar;
            return new cu[]{cuVar, cuVar2, cuVar3, cuVar4};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cu.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static cu[] ar() {
        return new cu[]{aq, al, ad, ar};
    }

    public int ad(int i) {
        try {
            return this.ai;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cu.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.ai;
    }

    public int aj() {
        return this.ai;
    }

    public int al() {
        return this.ai;
    }
}
