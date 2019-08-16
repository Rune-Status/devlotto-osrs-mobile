package defpackage;

/* renamed from: gz */
public final class gz {
    mp ad = new mp();
    fh aj = new fh();
    ot al;
    int aq;
    int ar;

    public gz(int i, String str) {
        this.aq = i;
        this.ar = i;
        int i2 = 1;
        while (true) {
            int i3 = i2 + i2;
            if (i3 < i) {
                i2 = i3;
            } else {
                this.al = new ot(i2);
                return;
            }
        }
    }

    public mp ad(long j) {
        mp mpVar = (mp) this.al.ad(j);
        if (mpVar != null) {
            this.aj.aq(mpVar);
        }
        return mpVar;
    }

    public void ae(long j) {
        mp mpVar = (mp) this.al.ad(j);
        if (mpVar != null) {
            mpVar.ky();
            mpVar.di();
            this.ar++;
        }
    }

    public void ag(mp mpVar, long j) {
        if (this.ar == 0) {
            mp al = this.aj.al();
            al.ky();
            al.di();
            if (al == this.ad) {
                al = this.aj.al();
                al.ky();
                al.di();
            }
        } else {
            this.ar--;
        }
        this.al.aq(mpVar, j);
        this.aj.aq(mpVar);
    }

    public void ai(long j) {
        mp mpVar = (mp) this.al.ad(j);
        if (mpVar != null) {
            mpVar.ky();
            mpVar.di();
            this.ar++;
        }
    }

    public mp aj(long j) {
        mp mpVar = (mp) this.al.ad(j);
        if (mpVar != null) {
            this.aj.aq(mpVar);
        }
        return mpVar;
    }

    public void ak(mp mpVar, long j) {
        if (this.ar == 0) {
            mp al = this.aj.al();
            al.ky();
            al.di();
            if (al == this.ad) {
                al = this.aj.al();
                al.ky();
                al.di();
            }
        } else {
            this.ar--;
        }
        this.al.aq(mpVar, j);
        this.aj.aq(mpVar);
    }

    public void al() {
        this.aj.ad();
        this.al.ar();
        this.ad = new mp();
        this.ar = this.aq;
    }

    public void am(mp mpVar, long j) {
        if (this.ar == 0) {
            mp al = this.aj.al();
            al.ky();
            al.di();
            if (al == this.ad) {
                al = this.aj.al();
                al.ky();
                al.di();
            }
        } else {
            this.ar--;
        }
        this.al.aq(mpVar, j);
        this.aj.aq(mpVar);
    }

    public void ap() {
        this.aj.ad();
        this.al.ar();
        this.ad = new mp();
        this.ar = this.aq;
    }

    public void aq(long j) {
        mp mpVar = (mp) this.al.ad(j);
        if (mpVar != null) {
            mpVar.ky();
            mpVar.di();
            this.ar++;
        }
    }

    public void ar(mp mpVar, long j) {
        if (this.ar == 0) {
            mp al = this.aj.al();
            al.ky();
            al.di();
            if (al == this.ad) {
                al = this.aj.al();
                al.ky();
                al.di();
            }
        } else {
            this.ar--;
        }
        this.al.aq(mpVar, j);
        this.aj.aq(mpVar);
    }

    public void as(mp mpVar, long j) {
        if (this.ar == 0) {
            mp al = this.aj.al();
            al.ky();
            al.di();
            if (al == this.ad) {
                al = this.aj.al();
                al.ky();
                al.di();
            }
        } else {
            this.ar--;
        }
        this.al.aq(mpVar, j);
        this.aj.aq(mpVar);
    }

    public void au() {
        this.aj.ad();
        this.al.ar();
        this.ad = new mp();
        this.ar = this.aq;
    }

    public String fa() {
        return "";
    }

    public String fd() {
        return "";
    }

    public String fv() {
        return "";
    }

    public String fz() {
        return "";
    }

    public String toString() {
        return "";
    }
}
