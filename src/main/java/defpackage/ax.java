package defpackage;

/* renamed from: ax */
public class ax {
    final boolean ad;

    public ax(boolean z) {
        try {
            this.ad = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ax.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ci(int i) {
        int i2 = 0;
        while (i2 < client.ed * -1087962683) {
            try {
                iq iqVar = client.eg[client.er[i2]];
                if (iqVar != null) {
                    gd.cb(iqVar, iqVar.ad.ae * -735434895, 1826468741);
                }
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ax.ci(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public boolean ad(int i) {
        try {
            return this.ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ax.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean aq() {
        return this.ad;
    }
}
