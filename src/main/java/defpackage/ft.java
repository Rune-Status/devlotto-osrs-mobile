package defpackage;

/* renamed from: ft */
public abstract class ft {
    public static final String aw = "fhtagn";
    public static final int az = 99;
    public static final int by = 68;
    protected fm ad;

    protected ft() {
        try {
            this.ad = new fs();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ft.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ad(fm fmVar, int i) {
        if (fmVar != null) {
            try {
                this.ad = fmVar;
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ft.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final long ae() {
        return gq.ad((byte) -118);
    }

    /* Access modifiers changed, original: protected|final */
    public final long ai() {
        return gq.ad((byte) -16);
    }

    public void aj(fm fmVar) {
        if (fmVar != null) {
            this.ad = fmVar;
            return;
        }
        throw new NullPointerException();
    }

    public void al(fm fmVar) {
        if (fmVar != null) {
            this.ad = fmVar;
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final long am() {
        return gq.ad((byte) 7);
    }

    /* Access modifiers changed, original: protected|final */
    public final long aq(int i) {
        try {
            return gq.ad((byte) 7);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ft.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(fm fmVar) {
        if (fmVar != null) {
            this.ad = fmVar;
            return;
        }
        throw new NullPointerException();
    }
}
