package defpackage;

/* renamed from: mf */
public class mf {
    static int as = 0;
    public static final int bi = 49;
    final Class ad;
    final Object[] aq;
    int ar;

    public mf(Class cls, int i) {
        try {
            this.ad = cls;
            this.aq = new Object[i];
            this.ar = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mf.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Object ad(int i) {
        try {
            return this.ad.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException();
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mf.ad(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Object ae() {
        try {
            return this.ad.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException();
        }
    }

    public Object ag() {
        Object ad;
        synchronized (this) {
            if (this.ar * -2085514221 == 0) {
                ad = ad(2131689645);
            } else {
                ad = aq(-330786722);
            }
        }
        return ad;
    }

    /* Access modifiers changed, original: 0000 */
    public Object ai() {
        try {
            return this.ad.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Object aj() {
        try {
            return this.ad.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Object ak() {
        Object[] objArr = this.aq;
        int i = this.ar + 715964991;
        this.ar = i;
        return objArr[i * 1523192013];
    }

    public void al(Object obj, int i) {
        synchronized (this) {
            try {
                if (this.ar * 1523192013 < this.aq.length) {
                    Object[] objArr = this.aq;
                    int i2 = this.ar + 2081709061;
                    this.ar = i2;
                    objArr[(i2 * 1523192013) - 1] = obj;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mf.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Object am() {
        Object[] objArr = this.aq;
        int i = this.ar - 2081709061;
        this.ar = i;
        return objArr[i * 1523192013];
    }

    public Object ap() {
        Object ad;
        synchronized (this) {
            if (this.ar * 1523192013 == 0) {
                ad = ad(2131689645);
            } else {
                ad = aq(-1102352129);
            }
        }
        return ad;
    }

    /* Access modifiers changed, original: 0000 */
    public Object aq(int i) {
        try {
            Object[] objArr = this.aq;
            int i2 = this.ar - 2081709061;
            this.ar = i2;
            return objArr[i2 * 1523192013];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mf.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public Object ar(byte b) {
        Object ad;
        synchronized (this) {
            try {
                if (this.ar * 1523192013 == 0) {
                    ad = ad(2131689645);
                } else {
                    ad = aq(791261663);
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mf.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return ad;
    }

    /* Access modifiers changed, original: 0000 */
    public Object as() {
        Object[] objArr = this.aq;
        int i = this.ar + 1162984873;
        this.ar = i;
        return objArr[i * -285142937];
    }

    public void au(Object obj) {
        synchronized (this) {
            if (this.ar * 1523192013 < this.aq.length) {
                Object[] objArr = this.aq;
                int i = this.ar + 2081709061;
                this.ar = i;
                objArr[(i * 1523192013) - 1] = obj;
            }
        }
    }
}
