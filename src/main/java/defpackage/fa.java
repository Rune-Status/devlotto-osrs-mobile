package defpackage;

import java.util.Iterator;

/* renamed from: fa */
public class fa implements Iterator {
    fz ad;
    mb aq;
    mb ar = null;

    fa(fz fzVar) {
        ag(fzVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void aa() {
        this.aq = this.ad != null ? this.ad.ad.gu : null;
        this.ar = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(fz fzVar) {
        this.ad = fzVar;
        ap();
    }

    public Object ad() {
        mb mbVar = null;
        mb mbVar2 = this.aq;
        if (mbVar2 == this.ad.ad) {
            this.aq = null;
        } else {
            this.aq = mbVar2.gu;
            mbVar = mbVar2;
        }
        this.ar = mbVar;
        return mbVar;
    }

    public void ae() {
        if (this.ar != null) {
            this.ar.ky();
            this.ar = null;
            return;
        }
        throw new IllegalStateException();
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(fz fzVar) {
        this.ad = fzVar;
        ap();
    }

    public boolean ai() {
        return this.aq != this.ad.ad;
    }

    public boolean aj() {
        return this.aq != this.ad.ad;
    }

    public void ak() {
        if (this.ar != null) {
            this.ar.ky();
            this.ar = null;
            return;
        }
        throw new IllegalStateException();
    }

    public boolean al() {
        return this.aq != this.ad.ad;
    }

    public void am() {
        if (this.ar != null) {
            this.ar.ky();
            this.ar = null;
            return;
        }
        throw new IllegalStateException();
    }

    /* Access modifiers changed, original: 0000 */
    public void ao() {
        this.aq = this.ad != null ? this.ad.ad.gu : null;
        this.ar = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap() {
        this.aq = this.ad != null ? this.ad.ad.gu : null;
        this.ar = null;
    }

    public Object aq() {
        mb mbVar = null;
        mb mbVar2 = this.aq;
        if (mbVar2 == this.ad.ad) {
            this.aq = null;
        } else {
            this.aq = mbVar2.gu;
            mbVar = mbVar2;
        }
        this.ar = mbVar;
        return mbVar;
    }

    public Object ar() {
        mb mbVar = null;
        mb mbVar2 = this.aq;
        if (mbVar2 == this.ad.ad) {
            this.aq = null;
        } else {
            this.aq = mbVar2.gu;
            mbVar = mbVar2;
        }
        this.ar = mbVar;
        return mbVar;
    }

    public void as() {
        if (this.ar != null) {
            this.ar.ky();
            this.ar = null;
            return;
        }
        throw new IllegalStateException();
    }

    /* Access modifiers changed, original: 0000 */
    public void au(fz fzVar) {
        this.ad = fzVar;
        ap();
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(fz fzVar) {
        this.ad = fzVar;
        ap();
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(fz fzVar) {
        this.ad = fzVar;
        ap();
    }

    /* Access modifiers changed, original: 0000 */
    public void az(fz fzVar) {
        this.ad = fzVar;
        ap();
    }

    public boolean hasNext() {
        return this.aq != this.ad.ad;
    }

    public Object next() {
        mb mbVar = null;
        mb mbVar2 = this.aq;
        if (mbVar2 == this.ad.ad) {
            this.aq = null;
        } else {
            this.aq = mbVar2.gu;
            mbVar = mbVar2;
        }
        this.ar = mbVar;
        return mbVar;
    }

    public void remove() {
        if (this.ar != null) {
            this.ar.ky();
            this.ar = null;
            return;
        }
        throw new IllegalStateException();
    }
}
