package defpackage;

/* renamed from: gr */
public final class gr {
    int ad;
    gu aj;
    fh al = new fh();
    int aq;
    ot ar;

    public gr(int i, int i2) {
        this.ad = i;
        this.aq = i;
        int i3 = 1;
        while (true) {
            int i4 = i3 + i3;
            if (i4 >= i || i3 >= i2) {
                this.ar = new ot(i3);
            } else {
                i3 = i4;
            }
        }
        this.ar = new ot(i3);
    }

    public void aa() {
        this.al.ad();
        this.ar.ar();
        this.aq = this.ad;
    }

    public void ac(int i) {
        mp aj = this.al.aj();
        while (true) {
            gb gbVar = (gb) aj;
            if (gbVar != null) {
                if (!gbVar.aq()) {
                    long j = gbVar.dh + 1;
                    gbVar.dh = j;
                    if (j > ((long) i)) {
                        ge geVar = new ge(gbVar.ad(), gbVar.aq);
                        this.ar.aq(geVar, gbVar.gs);
                        fh.ar(geVar, gbVar);
                        gbVar.ky();
                        gbVar.di();
                    }
                } else if (gbVar.ad() == null) {
                    gbVar.ky();
                    gbVar.di();
                    this.aq = gbVar.aq + this.aq;
                }
                aj = this.al.ae();
            } else {
                return;
            }
        }
    }

    public Object ad(long j) {
        gb gbVar = (gb) this.ar.ad(j);
        if (gbVar == null) {
            return null;
        }
        Object ad = gbVar.ad();
        if (ad == null) {
            gbVar.ky();
            gbVar.di();
            this.aq = gbVar.aq + this.aq;
            return null;
        } else if (gbVar.aq()) {
            gj gjVar = new gj(ad, gbVar.aq);
            this.ar.aq(gjVar, gbVar.gs);
            this.al.aq(gjVar);
            gjVar.dh = 0;
            gbVar.ky();
            gbVar.di();
            return ad;
        } else {
            this.al.aq(gbVar);
            gbVar.dh = 0;
            return ad;
        }
    }

    public Object ae(long j) {
        gb gbVar = (gb) this.ar.ad(j);
        if (gbVar == null) {
            return null;
        }
        Object ad = gbVar.ad();
        if (ad == null) {
            gbVar.ky();
            gbVar.di();
            this.aq = gbVar.aq + this.aq;
            return null;
        } else if (gbVar.aq()) {
            gj gjVar = new gj(ad, gbVar.aq);
            this.ar.aq(gjVar, gbVar.gs);
            this.al.aq(gjVar);
            gjVar.dh = 0;
            gbVar.ky();
            gbVar.di();
            return ad;
        } else {
            this.al.aq(gbVar);
            gbVar.dh = 0;
            return ad;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(long j) {
        ar((gb) this.ar.ad(j));
    }

    public void ai() {
        this.al.ad();
        this.ar.ar();
        this.aq = this.ad;
    }

    public void aj(int i) {
        mp aj = this.al.aj();
        while (true) {
            gb gbVar = (gb) aj;
            if (gbVar != null) {
                if (!gbVar.aq()) {
                    long j = gbVar.dh + 1;
                    gbVar.dh = j;
                    if (j > ((long) i)) {
                        ge geVar = new ge(gbVar.ad(), gbVar.aq);
                        this.ar.aq(geVar, gbVar.gs);
                        fh.ar(geVar, gbVar);
                        gbVar.ky();
                        gbVar.di();
                    }
                } else if (gbVar.ad() == null) {
                    gbVar.ky();
                    gbVar.di();
                    this.aq = gbVar.aq + this.aq;
                }
                aj = this.al.ae();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(long j) {
        ar((gb) this.ar.ad(j));
    }

    public void al(Object obj, long j, int i) {
        if (i <= this.ad) {
            aq(j);
            this.aq -= i;
            while (this.aq < 0) {
                gb gbVar = (gb) this.al.al();
                if (gbVar != null) {
                    gbVar.aq();
                    ar(gbVar);
                    if (this.aj != null) {
                        this.aj.ad(gbVar.ad());
                    }
                } else {
                    throw new RuntimeException("");
                }
            }
            gj gjVar = new gj(obj, i);
            this.ar.aq(gjVar, j);
            this.al.aq(gjVar);
            gjVar.dh = 0;
            return;
        }
        throw new IllegalStateException();
    }

    /* Access modifiers changed, original: 0000 */
    public void am(long j) {
        ar((gb) this.ar.ad(j));
    }

    public void ao() {
        this.al.ad();
        this.ar.ar();
        this.aq = this.ad;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(gb gbVar) {
        if (gbVar != null) {
            gbVar.ky();
            gbVar.di();
            this.aq += gbVar.aq;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(long j) {
        ar((gb) this.ar.ad(j));
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(gb gbVar) {
        if (gbVar != null) {
            gbVar.ky();
            gbVar.di();
            this.aq += gbVar.aq;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(long j) {
        ar((gb) this.ar.ad(j));
    }

    public void au(Object obj, long j, int i) {
        if (i <= this.ad) {
            aq(j);
            this.aq -= i;
            while (this.aq < 0) {
                gb gbVar = (gb) this.al.al();
                if (gbVar != null) {
                    gbVar.aq();
                    ar(gbVar);
                    if (this.aj != null) {
                        this.aj.ad(gbVar.ad());
                    }
                } else {
                    throw new RuntimeException("");
                }
            }
            gj gjVar = new gj(obj, i);
            this.ar.aq(gjVar, j);
            this.al.aq(gjVar);
            gjVar.dh = 0;
            return;
        }
        throw new IllegalStateException();
    }

    public void aw(int i) {
        mp aj = this.al.aj();
        while (true) {
            gb gbVar = (gb) aj;
            if (gbVar != null) {
                if (!gbVar.aq()) {
                    long j = gbVar.dh + 1;
                    gbVar.dh = j;
                    if (j > ((long) i)) {
                        ge geVar = new ge(gbVar.ad(), gbVar.aq);
                        this.ar.aq(geVar, gbVar.gs);
                        fh.ar(geVar, gbVar);
                        gbVar.ky();
                        gbVar.di();
                    }
                } else if (gbVar.ad() == null) {
                    gbVar.ky();
                    gbVar.di();
                    this.aq = gbVar.aq + this.aq;
                }
                aj = this.al.ae();
            } else {
                return;
            }
        }
    }

    public void ax(int i) {
        mp aj = this.al.aj();
        while (true) {
            gb gbVar = (gb) aj;
            if (gbVar != null) {
                if (!gbVar.aq()) {
                    long j = gbVar.dh + 1;
                    gbVar.dh = j;
                    if (j > ((long) i)) {
                        ge geVar = new ge(gbVar.ad(), gbVar.aq);
                        this.ar.aq(geVar, gbVar.gs);
                        fh.ar(geVar, gbVar);
                        gbVar.ky();
                        gbVar.di();
                    }
                } else if (gbVar.ad() == null) {
                    gbVar.ky();
                    gbVar.di();
                    this.aq = gbVar.aq + this.aq;
                }
                aj = this.al.ae();
            } else {
                return;
            }
        }
    }

    public void az(Object obj, long j, int i) {
        if (i <= this.ad) {
            aq(j);
            this.aq -= i;
            while (this.aq < 0) {
                gb gbVar = (gb) this.al.al();
                if (gbVar != null) {
                    gbVar.aq();
                    ar(gbVar);
                    if (this.aj != null) {
                        this.aj.ad(gbVar.ad());
                    }
                } else {
                    throw new RuntimeException("");
                }
            }
            gj gjVar = new gj(obj, i);
            this.ar.aq(gjVar, j);
            this.al.aq(gjVar);
            gjVar.dh = 0;
            return;
        }
        throw new IllegalStateException();
    }
}
