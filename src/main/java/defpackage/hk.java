package defpackage;

import android.support.v4.internal.view.SupportMenu;

/* renamed from: hk */
public class hk {
    int ad = 2;
    int ae;
    int ag;
    int ai;
    int aj;
    int ak;
    int al;
    int am;
    int[] aq = new int[2];
    int[] ar = new int[2];
    int as;

    hk() {
        this.aq[0] = 0;
        this.aq[1] = SupportMenu.USER_MASK;
        this.ar[0] = 0;
        this.ar[1] = SupportMenu.USER_MASK;
    }

    /* Access modifiers changed, original: final */
    public final void ad(lj ljVar) {
        this.ai = ljVar.af(1804771424);
        this.al = ljVar.at((byte) -118);
        this.aj = ljVar.at((byte) -54);
        aq(ljVar);
    }

    /* Access modifiers changed, original: final */
    public final void ae(lj ljVar) {
        this.ai = ljVar.af(1804771424);
        this.al = ljVar.at((byte) -2);
        this.aj = ljVar.at((byte) -24);
        aq(ljVar);
    }

    /* Access modifiers changed, original: final */
    public final void ag(lj ljVar) {
        this.ad = ljVar.af(1804771424);
        this.aq = new int[this.ad];
        this.ar = new int[this.ad];
        for (int i = 0; i < this.ad; i++) {
            this.aq[i] = ljVar.an(-1464407032);
            this.ar[i] = ljVar.an(-1464407032);
        }
    }

    /* Access modifiers changed, original: final */
    public final void ai(lj ljVar) {
        this.ai = ljVar.af(1804771424);
        this.al = ljVar.at((byte) -106);
        this.aj = ljVar.at((byte) -28);
        aq(ljVar);
    }

    /* Access modifiers changed, original: final */
    public final void aj(lj ljVar) {
        this.ai = ljVar.af(1804771424);
        this.al = ljVar.at((byte) -84);
        this.aj = ljVar.at((byte) -73);
        aq(ljVar);
    }

    /* Access modifiers changed, original: final */
    public final void ak(lj ljVar) {
        this.ad = ljVar.af(1804771424);
        this.aq = new int[this.ad];
        this.ar = new int[this.ad];
        for (int i = 0; i < this.ad; i++) {
            this.aq[i] = ljVar.an(-1464407032);
            this.ar[i] = ljVar.an(-1464407032);
        }
    }

    /* Access modifiers changed, original: final */
    public final int al(int i) {
        if (this.ag >= this.ae) {
            int[] iArr = this.ar;
            int i2 = this.am;
            this.am = i2 + 1;
            this.as = iArr[i2] << 15;
            if (this.am >= this.ad) {
                this.am = this.ad - 1;
            }
            this.ae = (int) ((((double) this.aq[this.am]) / 65536.0d) * ((double) i));
            if (this.ae > this.ag) {
                this.ak = ((this.ar[this.am] << 15) - this.as) / (this.ae - this.ag);
            }
        }
        this.as += this.ak;
        this.ag++;
        return (this.as - this.ak) >> 15;
    }

    /* Access modifiers changed, original: final */
    public final void am(lj ljVar) {
        this.ad = ljVar.af(1804771424);
        this.aq = new int[this.ad];
        this.ar = new int[this.ad];
        for (int i = 0; i < this.ad; i++) {
            this.aq[i] = ljVar.an(-1464407032);
            this.ar[i] = ljVar.an(-1464407032);
        }
    }

    /* Access modifiers changed, original: final */
    public final void ap() {
        this.ae = 0;
        this.am = 0;
        this.ak = 0;
        this.as = 0;
        this.ag = 0;
    }

    /* Access modifiers changed, original: final */
    public final void aq(lj ljVar) {
        this.ad = ljVar.af(1804771424);
        this.aq = new int[this.ad];
        this.ar = new int[this.ad];
        for (int i = 0; i < this.ad; i++) {
            this.aq[i] = ljVar.an(-1464407032);
            this.ar[i] = ljVar.an(-1464407032);
        }
    }

    /* Access modifiers changed, original: final */
    public final void ar() {
        this.ae = 0;
        this.am = 0;
        this.ak = 0;
        this.as = 0;
        this.ag = 0;
    }

    /* Access modifiers changed, original: final */
    public final void as(lj ljVar) {
        this.ad = ljVar.af(1804771424);
        this.aq = new int[this.ad];
        this.ar = new int[this.ad];
        for (int i = 0; i < this.ad; i++) {
            this.aq[i] = ljVar.an(-1464407032);
            this.ar[i] = ljVar.an(-1464407032);
        }
    }

    /* Access modifiers changed, original: final */
    public final void au() {
        this.ae = 0;
        this.am = 0;
        this.ak = 0;
        this.as = 0;
        this.ag = 0;
    }

    /* Access modifiers changed, original: final */
    public final int aw(int i) {
        if (this.ag >= this.ae) {
            int[] iArr = this.ar;
            int i2 = this.am;
            this.am = i2 + 1;
            this.as = iArr[i2] << 15;
            if (this.am >= this.ad) {
                this.am = this.ad - 1;
            }
            this.ae = (int) ((((double) this.aq[this.am]) / 65536.0d) * ((double) i));
            if (this.ae > this.ag) {
                this.ak = ((this.ar[this.am] << 15) - this.as) / (this.ae - this.ag);
            }
        }
        this.as += this.ak;
        this.ag++;
        return (this.as - this.ak) >> 15;
    }

    /* Access modifiers changed, original: final */
    public final int ax(int i) {
        if (this.ag >= this.ae) {
            int[] iArr = this.ar;
            int i2 = this.am;
            this.am = i2 + 1;
            this.as = iArr[i2] << 15;
            if (this.am >= this.ad) {
                this.am = this.ad - 1;
            }
            this.ae = (int) ((((double) this.aq[this.am]) / 65536.0d) * ((double) i));
            if (this.ae > this.ag) {
                this.ak = ((this.ar[this.am] << 15) - this.as) / (this.ae - this.ag);
            }
        }
        this.as += this.ak;
        this.ag++;
        return (this.as - this.ak) >> 15;
    }

    /* Access modifiers changed, original: final */
    public final void az() {
        this.ae = 0;
        this.am = 0;
        this.ak = 0;
        this.as = 0;
        this.ag = 0;
    }
}
