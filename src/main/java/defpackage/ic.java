package defpackage;

/* renamed from: ic */
public class ic extends gn {
    ic() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ic.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ae(int i, boolean z, byte b) {
        if (z && i >= 0) {
            return ej.am(i, 10, z, -1053470627);
        }
        try {
            return Integer.toString(i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ic.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final void fx(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        while (i6 < client.nt * 1948056185) {
            try {
                if (client.no[i6] + client.nl[i6] > i && client.no[i6] < i + i3 && client.nj[i6] + client.ns[i6] > i2 && client.ns[i6] < i4 + i2) {
                    client.nk[i6] = true;
                }
                i6++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ic.fx(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean ad(int i, int i2, int i3, gs gsVar, byte b) {
        try {
            return i2 == this.ad * -1340400467 && this.aq * 900786495 == i3;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ic.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean aq(int i, int i2, int i3, gs gsVar) {
        return i2 == this.ad * -1340400467 && this.aq * 900786495 == i3;
    }

    /* Access modifiers changed, original: protected */
    public boolean ar(int i, int i2, int i3, gs gsVar) {
        return i2 == this.ad * -1340400467 && this.aq * 900786495 == i3;
    }
}
