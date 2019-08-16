package defpackage;

/* renamed from: cd */
public final class cd {
    static final int ad = 4096;
    public static final int aj = 5;
    public static short[][] am = null;
    public static final int ar = 4;
    static final int bs = 19136896;
    static ef uh;
    final int[] aq;

    cd() {
        try {
            this.aq = new int[4096];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cd.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    cd(int[] iArr) {
        try {
            this.aq = iArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cd.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ad(int i, int i2) {
        try {
            do aq = kq.aq(i, 1693511307);
            int i3 = aq.ar;
            int i4 = aq.al * 216187991;
            return aj.ad[(aq.aj * 311003969) - i4] & (aj.ar[i3 * -691049261] >> i4);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cd.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, kh khVar2, boolean z, int i) {
        try {
            dx.aq = khVar;
            oc.ar = khVar2;
            dx.ad = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cd.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aj(lj ljVar, int i, int i2) {
        try {
            if (mc.as != null) {
                try {
                    mc.as.aq(0);
                    mc.as.ae(ljVar.ar, i, 24, 1912467506);
                } catch (Exception e) {
                }
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cd.aj(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    static cd al(byte[] bArr) {
        return bArr == null ? new cd() : new cd(ey.ad(bArr, -311913911).ad);
    }

    public static dc aq(int i, byte b) {
        if (i >= 0) {
            try {
                if (i < dc.aq.length) {
                    return dc.aq[i];
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cd.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return dc.ar;
    }

    static cd ar(byte[] bArr) {
        return bArr == null ? new cd() : new cd(ey.ad(bArr, 1911622742).ad);
    }

    static boolean ds(hv hvVar, short s) {
        try {
            return client.je * -683458643 == 0 ? false : hvVar != da.jc ? no.dp(-709896363) || ((dx.dn(1184995349) && hvVar.aq(-2125603350)) || (fu.dh((byte) 86) && hvVar.aj(1942974243))) : ed.de(-1510559807);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cd.ds(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void dv(int i) {
        try {
            if (client.kw * 1452663617 >= 0 && client.jz[client.kw * 1452663617] != null) {
                cn.dl(client.jz[client.kw * 1452663617], false, -1490481109);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cd.dv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final int ae(int i, int i2) {
        return this.aq[(i2 * 64) + i];
    }

    /* Access modifiers changed, original: final */
    public final int ai(int i, int i2) {
        return this.aq[(i2 * 64) + i];
    }

    /* Access modifiers changed, original: final */
    public final int aj(int i, int i2) {
        return this.aq[(i2 * 64) + i];
    }

    /* Access modifiers changed, original: final */
    public final int aq(int i, int i2, int i3) {
        try {
            return this.aq[(i2 * 64) + i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cd.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
