package defpackage;

/* renamed from: mo */
public class mo {
    static int ak;
    final long[] ad;
    int al;
    int aq;
    long ar;

    public mo(int i) {
        try {
            this.aq = 0;
            this.ar = 0;
            this.al = 0;
            this.ad = new long[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mo.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ad(long j) {
        try {
            if (this.al * 1751852101 < this.ad.length) {
                this.al += 254824077;
            } else {
                this.ar -= this.ad[this.aq * -1687751277] * 8192575524642608951L;
            }
            this.ar += 8192575524642608951L * j;
            this.ad[this.aq * -1687751277] = j;
            this.aq = (((this.aq * -1687751277) + 1) % this.ad.length) * -511479653;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mo.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public long ae() {
        return this.al * 1751852101 == 0 ? 0 : (this.ar * 1314899298343816839L) / ((long) (this.al * 384880024));
    }

    public long ai() {
        return this.al * 1751852101 == 0 ? 0 : (this.ar * 1314899298343816839L) / ((long) (this.al * 1751852101));
    }

    public void aj(long j) {
        if (this.al * 1751852101 < this.ad.length) {
            this.al += 254824077;
        } else {
            this.ar -= this.ad[this.aq * -1687751277] * 8192575524642608951L;
        }
        this.ar += 8192575524642608951L * j;
        this.ad[this.aq * -1687751277] = j;
        this.aq = (((this.aq * -1687751277) + 1) % this.ad.length) * -511479653;
    }

    public void ak() {
        this.aq = 0;
        this.al = 0;
        this.ar = 0;
    }

    public void al(long j) {
        if (this.al * 1751852101 < this.ad.length) {
            this.al += 254824077;
        } else {
            this.ar -= this.ad[this.aq * -1687751277] * 8192575524642608951L;
        }
        this.ar += 8192575524642608951L * j;
        this.ad[this.aq * -1687751277] = j;
        this.aq = (((this.aq * -1687751277) + 1) % this.ad.length) * -511479653;
    }

    public long am() {
        return this.al * 1751852101 == 0 ? 0 : (this.ar * 1314899298343816839L) / ((long) (this.al * 1751852101));
    }

    public long aq(int i) {
        try {
            return this.al * 1751852101 == 0 ? 0 : (this.ar * 1314899298343816839L) / ((long) (this.al * 1751852101));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mo.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(byte b) {
        try {
            this.aq = 0;
            this.al = 0;
            this.ar = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mo.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as() {
        this.aq = 0;
        this.al = 0;
        this.ar = 0;
    }
}
