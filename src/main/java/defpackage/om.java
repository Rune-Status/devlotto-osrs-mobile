package defpackage;

import java.util.Iterator;

/* renamed from: om */
public class om implements Iterator {
    ot ad;
    mb al = null;
    mb aq;
    int ar;

    om(ot otVar) {
        this.ad = otVar;
        ag();
    }

    public Object ad() {
        mb mbVar;
        if (this.aq != this.ad.aq[this.ar - 1]) {
            mbVar = this.aq;
            this.aq = mbVar.gu;
            this.al = mbVar;
            return mbVar;
        }
        while (this.ar < this.ad.ad) {
            mb[] mbVarArr = this.ad.aq;
            int i = this.ar;
            this.ar = i + 1;
            mbVar = mbVarArr[i].gu;
            if (mbVar != this.ad.aq[this.ar - 1]) {
                this.aq = mbVar.gu;
                this.al = mbVar;
                return mbVar;
            }
        }
        return null;
    }

    public void ae() {
        if (this.al != null) {
            this.al.ky();
            this.al = null;
            return;
        }
        throw new IllegalStateException();
    }

    /* Access modifiers changed, original: 0000 */
    public void ag() {
        this.aq = this.ad.aq[0].gu;
        this.ar = 1;
        this.al = null;
    }

    public boolean ai() {
        if (this.aq != this.ad.aq[this.ar - 1]) {
            return true;
        }
        while (this.ar < this.ad.ad) {
            mb[] mbVarArr = this.ad.aq;
            int i = this.ar;
            this.ar = i + 1;
            if (mbVarArr[i].gu != this.ad.aq[this.ar - 1]) {
                this.aq = this.ad.aq[this.ar - 1].gu;
                return true;
            }
            this.aq = this.ad.aq[this.ar - 1];
        }
        return false;
    }

    public boolean aj() {
        if (this.aq != this.ad.aq[this.ar - 1]) {
            return true;
        }
        while (this.ar < this.ad.ad) {
            mb[] mbVarArr = this.ad.aq;
            int i = this.ar;
            this.ar = i + 1;
            if (mbVarArr[i].gu != this.ad.aq[this.ar - 1]) {
                this.aq = this.ad.aq[this.ar - 1].gu;
                return true;
            }
            this.aq = this.ad.aq[this.ar - 1];
        }
        return false;
    }

    public void ak() {
        if (this.al != null) {
            this.al.ky();
            this.al = null;
            return;
        }
        throw new IllegalStateException();
    }

    public boolean al() {
        if (this.aq != this.ad.aq[this.ar - 1]) {
            return true;
        }
        while (this.ar < this.ad.ad) {
            mb[] mbVarArr = this.ad.aq;
            int i = this.ar;
            this.ar = i + 1;
            if (mbVarArr[i].gu != this.ad.aq[this.ar - 1]) {
                this.aq = this.ad.aq[this.ar - 1].gu;
                return true;
            }
            this.aq = this.ad.aq[this.ar - 1];
        }
        return false;
    }

    public void am() {
        if (this.al != null) {
            this.al.ky();
            this.al = null;
            return;
        }
        throw new IllegalStateException();
    }

    /* Access modifiers changed, original: 0000 */
    public void ap() {
        this.aq = this.ad.aq[0].gu;
        this.ar = 1;
        this.al = null;
    }

    public Object aq() {
        mb mbVar;
        if (this.aq != this.ad.aq[this.ar - 1]) {
            mbVar = this.aq;
            this.aq = mbVar.gu;
            this.al = mbVar;
            return mbVar;
        }
        while (this.ar < this.ad.ad) {
            mb[] mbVarArr = this.ad.aq;
            int i = this.ar;
            this.ar = i + 1;
            mbVar = mbVarArr[i].gu;
            if (mbVar != this.ad.aq[this.ar - 1]) {
                this.aq = mbVar.gu;
                this.al = mbVar;
                return mbVar;
            }
        }
        return null;
    }

    public Object ar() {
        mb mbVar;
        if (this.aq != this.ad.aq[this.ar - 1]) {
            mbVar = this.aq;
            this.aq = mbVar.gu;
            this.al = mbVar;
            return mbVar;
        }
        while (this.ar < this.ad.ad) {
            mb[] mbVarArr = this.ad.aq;
            int i = this.ar;
            this.ar = i + 1;
            mbVar = mbVarArr[i].gu;
            if (mbVar != this.ad.aq[this.ar - 1]) {
                this.aq = mbVar.gu;
                this.al = mbVar;
                return mbVar;
            }
        }
        return null;
    }

    public void as() {
        if (this.al != null) {
            this.al.ky();
            this.al = null;
            return;
        }
        throw new IllegalStateException();
    }

    public boolean hasNext() {
        if (this.aq != this.ad.aq[this.ar - 1]) {
            return true;
        }
        while (this.ar < this.ad.ad) {
            mb[] mbVarArr = this.ad.aq;
            int i = this.ar;
            this.ar = i + 1;
            if (mbVarArr[i].gu != this.ad.aq[this.ar - 1]) {
                this.aq = this.ad.aq[this.ar - 1].gu;
                return true;
            }
            this.aq = this.ad.aq[this.ar - 1];
        }
        return false;
    }

    public Object next() {
        mb mbVar;
        if (this.aq != this.ad.aq[this.ar - 1]) {
            mbVar = this.aq;
            this.aq = mbVar.gu;
            this.al = mbVar;
            return mbVar;
        }
        while (this.ar < this.ad.ad) {
            mb[] mbVarArr = this.ad.aq;
            int i = this.ar;
            this.ar = i + 1;
            mbVar = mbVarArr[i].gu;
            if (mbVar != this.ad.aq[this.ar - 1]) {
                this.aq = mbVar.gu;
                this.al = mbVar;
                return mbVar;
            }
        }
        return null;
    }

    public void remove() {
        if (this.al != null) {
            this.al.ky();
            this.al = null;
            return;
        }
        throw new IllegalStateException();
    }
}
