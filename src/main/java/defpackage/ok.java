package defpackage;

/* renamed from: ok */
public final class ok {
    int ad;
    int aj = 0;
    mb al;
    mb[] aq;
    mb ar;

    public ok(int i) {
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

    public mb aa() {
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

    public void ae(mb mbVar, long j) {
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

    public mb ag() {
        this.aj = 0;
        return al();
    }

    public void ai(mb mbVar, long j) {
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

    public mb aj(long j) {
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

    public void am(mb mbVar, long j) {
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

    public mb ap() {
        this.aj = 0;
        return al();
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

    public mb ar() {
        this.aj = 0;
        return al();
    }

    public void as(mb mbVar, long j) {
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

    public mb au() {
        this.aj = 0;
        return al();
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

    public mb az() {
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
}
