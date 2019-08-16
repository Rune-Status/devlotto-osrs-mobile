package defpackage;

import java.util.Iterator;

/* renamed from: ot */
public final class ot implements Iterable {
    int ad;
    int aj = 0;
    mb al;
    mb[] aq;
    mb ar;

    public ot(int i) {
        int i2 = 0;
        this.ad = i;
        this.aq = new mb[i];
        while (i2 < i) {
            mb[] mbVarArr = this.aq;
            mb mbVar = new mb();
            mbVarArr[i2] = mbVar;
            mbVar.gu = mbVar;
            mbVar.ge = mbVar;
            i2++;
        }
    }

    public mb ac() {
        mb mbVar;
        if (this.aj <= 0 || this.al == this.aq[this.aj - 1]) {
            while (this.aj < this.ad) {
                mb[] mbVarArr = this.aq;
                int i = this.aj;
                this.aj = i + 1;
                mbVar = mbVarArr[i].gu;
                if (mbVar != this.aq[this.aj - 1]) {
                    this.al = mbVar.gu;
                    return mbVar;
                }
            }
            return null;
        }
        mbVar = this.al;
        this.al = mbVar.gu;
        return mbVar;
    }

    public mb ad(long j) {
        mb mbVar = this.aq[(int) (((long) (this.ad - 1)) & j)];
        this.ar = mbVar.gu;
        while (this.ar != mbVar) {
            if (this.ar.gs == j) {
                mb mbVar2 = this.ar;
                this.ar = this.ar.gu;
                return mbVar2;
            }
            this.ar = this.ar.gu;
        }
        this.ar = null;
        return null;
    }

    public mb ae(long j) {
        mb mbVar = this.aq[(int) (((long) (this.ad - 1)) & j)];
        this.ar = mbVar.gu;
        while (this.ar != mbVar) {
            if (this.ar.gs == j) {
                mb mbVar2 = this.ar;
                this.ar = this.ar.gu;
                return mbVar2;
            }
            this.ar = this.ar.gu;
        }
        this.ar = null;
        return null;
    }

    public void ag() {
        for (int i = 0; i < this.ad; i++) {
            mb mbVar = this.aq[i];
            while (true) {
                mb mbVar2 = mbVar.gu;
                if (mbVar2 == mbVar) {
                    break;
                }
                mbVar2.ky();
            }
        }
        this.ar = null;
        this.al = null;
    }

    public mb ai(long j) {
        mb mbVar = this.aq[(int) (((long) (this.ad - 1)) & j)];
        this.ar = mbVar.gu;
        while (this.ar != mbVar) {
            if (this.ar.gs == j) {
                mb mbVar2 = this.ar;
                this.ar = this.ar.gu;
                return mbVar2;
            }
            this.ar = this.ar.gu;
        }
        this.ar = null;
        return null;
    }

    public mb aj() {
        mb mbVar;
        if (this.aj <= 0 || this.al == this.aq[this.aj - 1]) {
            while (this.aj < this.ad) {
                mb[] mbVarArr = this.aq;
                int i = this.aj;
                this.aj = i + 1;
                mbVar = mbVarArr[i].gu;
                if (mbVar != this.aq[this.aj - 1]) {
                    this.al = mbVar.gu;
                    return mbVar;
                }
            }
            return null;
        }
        mbVar = this.al;
        this.al = mbVar.gu;
        return mbVar;
    }

    public void ak(mb mbVar, long j) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mb mbVar2 = this.aq[(int) (((long) (this.ad - 1)) & j)];
        mbVar.ge = mbVar2.ge;
        mbVar.gu = mbVar2;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
        mbVar.gs = j;
    }

    public mb al() {
        this.aj = 0;
        return aj();
    }

    public mb am(long j) {
        mb mbVar = this.aq[(int) (((long) (this.ad - 1)) & j)];
        this.ar = mbVar.gu;
        while (this.ar != mbVar) {
            if (this.ar.gs == j) {
                mb mbVar2 = this.ar;
                this.ar = this.ar.gu;
                return mbVar2;
            }
            this.ar = this.ar.gu;
        }
        this.ar = null;
        return null;
    }

    public mb ap() {
        this.aj = 0;
        return aj();
    }

    public void aq(mb mbVar, long j) {
        if (mbVar.ge != null) {
            mbVar.ky();
        }
        mb mbVar2 = this.aq[(int) (((long) (this.ad - 1)) & j)];
        mbVar.ge = mbVar2.ge;
        mbVar.gu = mbVar2;
        mbVar.ge.gu = mbVar;
        mbVar.gu.ge = mbVar;
        mbVar.gs = j;
    }

    public void ar() {
        for (int i = 0; i < this.ad; i++) {
            mb mbVar = this.aq[i];
            while (true) {
                mb mbVar2 = mbVar.gu;
                if (mbVar2 == mbVar) {
                    break;
                }
                mbVar2.ky();
            }
        }
        this.ar = null;
        this.al = null;
    }

    public void as() {
        for (int i = 0; i < this.ad; i++) {
            mb mbVar = this.aq[i];
            while (true) {
                mb mbVar2 = mbVar.gu;
                if (mbVar2 == mbVar) {
                    break;
                }
                mbVar2.ky();
            }
        }
        this.ar = null;
        this.al = null;
    }

    public mb au() {
        this.aj = 0;
        return aj();
    }

    public mb aw() {
        mb mbVar;
        if (this.aj <= 0 || this.al == this.aq[this.aj - 1]) {
            while (this.aj < this.ad) {
                mb[] mbVarArr = this.aq;
                int i = this.aj;
                this.aj = i + 1;
                mbVar = mbVarArr[i].gu;
                if (mbVar != this.aq[this.aj - 1]) {
                    this.al = mbVar.gu;
                    return mbVar;
                }
            }
            return null;
        }
        mbVar = this.al;
        this.al = mbVar.gu;
        return mbVar;
    }

    public mb ax() {
        this.aj = 0;
        return aj();
    }

    public mb az() {
        this.aj = 0;
        return aj();
    }

    public Iterator bs() {
        return new om(this);
    }

    public Iterator iterator() {
        return new om(this);
    }
}
