package defpackage;

import java.util.Iterator;

/* renamed from: fr */
public class fr implements Iterator {
    fh ad;
    mp aq;
    mp ar = null;

    fr(fh fhVar) {
        this.ad = fhVar;
        this.aq = this.ad.ad.de;
        this.ar = null;
    }

    public Object ad() {
        mp mpVar = null;
        mp mpVar2 = this.aq;
        if (mpVar2 == this.ad.ad) {
            this.aq = null;
        } else {
            this.aq = mpVar2.de;
            mpVar = mpVar2;
        }
        this.ar = mpVar;
        return mpVar;
    }

    public void ae() {
        if (this.ar != null) {
            this.ar.di();
            this.ar = null;
            return;
        }
        throw new IllegalStateException();
    }

    public boolean ai() {
        return this.aq != this.ad.ad;
    }

    public boolean aj() {
        return this.aq != this.ad.ad;
    }

    public void ak() {
        if (this.ar != null) {
            this.ar.di();
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
            this.ar.di();
            this.ar = null;
            return;
        }
        throw new IllegalStateException();
    }

    public Object aq() {
        mp mpVar = null;
        mp mpVar2 = this.aq;
        if (mpVar2 == this.ad.ad) {
            this.aq = null;
        } else {
            this.aq = mpVar2.de;
            mpVar = mpVar2;
        }
        this.ar = mpVar;
        return mpVar;
    }

    public Object ar() {
        mp mpVar = null;
        mp mpVar2 = this.aq;
        if (mpVar2 == this.ad.ad) {
            this.aq = null;
        } else {
            this.aq = mpVar2.de;
            mpVar = mpVar2;
        }
        this.ar = mpVar;
        return mpVar;
    }

    public void as() {
        if (this.ar != null) {
            this.ar.di();
            this.ar = null;
            return;
        }
        throw new IllegalStateException();
    }

    public boolean hasNext() {
        return this.aq != this.ad.ad;
    }

    public Object next() {
        mp mpVar = null;
        mp mpVar2 = this.aq;
        if (mpVar2 == this.ad.ad) {
            this.aq = null;
        } else {
            this.aq = mpVar2.de;
            mpVar = mpVar2;
        }
        this.ar = mpVar;
        return mpVar;
    }

    public void remove() {
        if (this.ar != null) {
            this.ar.di();
            this.ar = null;
            return;
        }
        throw new IllegalStateException();
    }
}
