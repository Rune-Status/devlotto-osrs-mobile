package defpackage;

import java.util.Iterator;

/* renamed from: fh */
public class fh implements Iterable {
    public mp ad = new mp();
    mp aq;

    public static void ac(mp mpVar, mp mpVar2) {
        if (mpVar.ds != null) {
            mpVar.di();
        }
        mpVar.ds = mpVar2;
        mpVar.de = mpVar2.de;
        mpVar.ds.de = mpVar;
        mpVar.de.ds = mpVar;
    }

    public static void ap(mp mpVar, mp mpVar2) {
        if (mpVar.ds != null) {
            mpVar.di();
        }
        mpVar.ds = mpVar2;
        mpVar.de = mpVar2.de;
        mpVar.ds.de = mpVar;
        mpVar.de.ds = mpVar;
    }

    public static void ar(mp mpVar, mp mpVar2) {
        if (mpVar.ds != null) {
            mpVar.di();
        }
        mpVar.ds = mpVar2;
        mpVar.de = mpVar2.de;
        mpVar.ds.de = mpVar;
        mpVar.de.ds = mpVar;
    }

    public static void au(mp mpVar, mp mpVar2) {
        if (mpVar.ds != null) {
            mpVar.di();
        }
        mpVar.ds = mpVar2;
        mpVar.de = mpVar2.de;
        mpVar.ds.de = mpVar;
        mpVar.de.ds = mpVar;
    }

    public static void aw(mp mpVar, mp mpVar2) {
        if (mpVar.ds != null) {
            mpVar.di();
        }
        mpVar.ds = mpVar2;
        mpVar.de = mpVar2.de;
        mpVar.ds.de = mpVar;
        mpVar.de.ds = mpVar;
    }

    public static void ax(mp mpVar, mp mpVar2) {
        if (mpVar.ds != null) {
            mpVar.di();
        }
        mpVar.ds = mpVar2;
        mpVar.de = mpVar2.de;
        mpVar.ds.de = mpVar;
        mpVar.de.ds = mpVar;
    }

    public static void az(mp mpVar, mp mpVar2) {
        if (mpVar.ds != null) {
            mpVar.di();
        }
        mpVar.ds = mpVar2;
        mpVar.de = mpVar2.de;
        mpVar.ds.de = mpVar;
        mpVar.de.ds = mpVar;
    }

    public mp aa() {
        mp mpVar = this.ad.de;
        if (mpVar == this.ad) {
            return null;
        }
        mpVar.di();
        return mpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public mp ab(mp mpVar) {
        if (mpVar == null) {
            mpVar = this.ad.de;
        }
        if (mpVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mpVar.de;
        return mpVar;
    }

    public void ad() {
        while (this.ad.de != this.ad) {
            this.ad.de.di();
        }
    }

    public mp ae() {
        mp mpVar = this.aq;
        if (mpVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mpVar.de;
        return mpVar;
    }

    public mp af() {
        mp mpVar = this.ad.de;
        if (mpVar == this.ad) {
            return null;
        }
        mpVar.di();
        return mpVar;
    }

    public void ag(mp mpVar) {
        if (mpVar.ds != null) {
            mpVar.di();
        }
        mpVar.ds = this.ad.ds;
        mpVar.de = this.ad;
        mpVar.ds.de = mpVar;
        mpVar.de.ds = mpVar;
    }

    public mp ah() {
        mp mpVar = this.ad.de;
        if (mpVar == this.ad) {
            return null;
        }
        mpVar.di();
        return mpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public mp ai(mp mpVar) {
        if (mpVar == null) {
            mpVar = this.ad.de;
        }
        if (mpVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mpVar.de;
        return mpVar;
    }

    public mp aj() {
        return ai(null);
    }

    public void ak() {
        while (this.ad.de != this.ad) {
            this.ad.de.di();
        }
    }

    public mp al() {
        mp mpVar = this.ad.de;
        if (mpVar == this.ad) {
            return null;
        }
        mpVar.di();
        return mpVar;
    }

    public void am() {
        while (this.ad.de != this.ad) {
            this.ad.de.di();
        }
    }

    public mp an() {
        return ai(null);
    }

    public mp ao() {
        mp mpVar = this.ad.de;
        if (mpVar == this.ad) {
            return null;
        }
        mpVar.di();
        return mpVar;
    }

    public void aq(mp mpVar) {
        if (mpVar.ds != null) {
            mpVar.di();
        }
        mpVar.ds = this.ad.ds;
        mpVar.de = this.ad;
        mpVar.ds.de = mpVar;
        mpVar.de.ds = mpVar;
    }

    public void as() {
        while (this.ad.de != this.ad) {
            this.ad.de.di();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public mp at(mp mpVar) {
        if (mpVar == null) {
            mpVar = this.ad.de;
        }
        if (mpVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mpVar.de;
        return mpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public mp av(mp mpVar) {
        if (mpVar == null) {
            mpVar = this.ad.de;
        }
        if (mpVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mpVar.de;
        return mpVar;
    }

    public mp ay() {
        return ai(null);
    }

    public mp ba() {
        mp mpVar = this.aq;
        if (mpVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mpVar.de;
        return mpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public mp bk(mp mpVar) {
        if (mpVar == null) {
            mpVar = this.ad.de;
        }
        if (mpVar == this.ad) {
            this.aq = null;
            return null;
        }
        this.aq = mpVar.de;
        return mpVar;
    }

    public Iterator bs() {
        return new fr(this);
    }

    public Iterator iterator() {
        return new fr(this);
    }
}
