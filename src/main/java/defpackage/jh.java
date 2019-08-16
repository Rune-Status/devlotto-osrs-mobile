package defpackage;

/* renamed from: jh */
public final class jh implements mx {
    int ad;

    jh() {
        try {
            this.ad = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jh.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        int i2;
        synchronized (this) {
            try {
                i2 = this.ad;
                this.ad = 0;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jh.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return i2 * -851007085;
    }

    public int aq() {
        int i;
        synchronized (this) {
            i = this.ad;
            this.ad = 0;
        }
        return i * -851007085;
    }

    public int ar() {
        int i;
        synchronized (this) {
            i = this.ad;
            this.ad = 0;
        }
        return i * -851007085;
    }
}
