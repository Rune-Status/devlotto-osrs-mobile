package defpackage;

import java.util.Comparator;

/* renamed from: eo */
public abstract class eo implements Comparator {
    public static final String am = "crsG39";
    public static final int av = 27;
    public static final int dx = 2;
    static int hv;
    Comparator ad;

    protected eo() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eo.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aw(byte b) {
        try {
            kg.ad.ac(2039816659);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eo.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ad(Comparator comparator, byte b) {
        try {
            if (this.ad == null) {
                this.ad = comparator;
            } else if (this.ad instanceof eo) {
                ((eo) this.ad).ad(comparator, (byte) 83);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eo.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int ae(eg egVar, eg egVar2) {
        return this.ad == null ? 0 : this.ad.compare(egVar, egVar2);
    }

    /* Access modifiers changed, original: protected|final */
    public final int ai(eg egVar, eg egVar2) {
        return this.ad == null ? 0 : this.ad.compare(egVar, egVar2);
    }

    /* Access modifiers changed, original: protected|final */
    public final int aj(eg egVar, eg egVar2) {
        return this.ad == null ? 0 : this.ad.compare(egVar, egVar2);
    }

    /* Access modifiers changed, original: protected|final */
    public final int ak(eg egVar, eg egVar2) {
        return this.ad == null ? 0 : this.ad.compare(egVar, egVar2);
    }

    /* Access modifiers changed, original: final */
    public final void al(Comparator comparator) {
        if (this.ad == null) {
            this.ad = comparator;
        } else if (this.ad instanceof eo) {
            ((eo) this.ad).ad(comparator, (byte) -56);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int am(eg egVar, eg egVar2) {
        return this.ad == null ? 0 : this.ad.compare(egVar, egVar2);
    }

    /* Access modifiers changed, original: protected|final */
    public final int aq(eg egVar, eg egVar2, int i) {
        try {
            return this.ad == null ? 0 : this.ad.compare(egVar, egVar2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eo.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ar(Comparator comparator) {
        if (this.ad == null) {
            this.ad = comparator;
        } else if (this.ad instanceof eo) {
            ((eo) this.ad).ad(comparator, (byte) -18);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int as(eg egVar, eg egVar2) {
        return this.ad == null ? 0 : this.ad.compare(egVar, egVar2);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eo.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }
}
