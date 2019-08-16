package defpackage;

/* renamed from: gf */
public class gf extends hq {
    fy ad = new fy();
    int al = -1;
    fy aq = new fy();
    int ar = 0;

    /* Access modifiers changed, original: 0000 */
    public void aa(mb mbVar, ha haVar) {
        mb mbVar2 = mbVar;
        while (mbVar2 != this.aq.ad && ((ha) mbVar2).ad <= haVar.ad) {
            mbVar2 = mbVar2.gu;
        }
        fy.al(haVar, mbVar2);
        this.al = ((ha) this.aq.ad.gu).ad;
    }

    /* Access modifiers changed, original: protected */
    public hq ab() {
        return (hq) this.ad.ak();
    }

    /* Access modifiers changed, original: 0000 */
    public void ac() {
        if (this.ar > 0) {
            mb ae = this.aq.ae();
            while (true) {
                ha haVar = (ha) ae;
                if (haVar != null) {
                    haVar.ad -= this.ar;
                    ae = this.aq.ak();
                } else {
                    this.al -= this.ar;
                    this.ar = 0;
                    return;
                }
            }
        }
    }

    public final void ad(hq hqVar) {
        synchronized (this) {
            this.ad.ar(hqVar);
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ae() {
        return (hq) this.ad.ak();
    }

    /* Access modifiers changed, original: 0000 */
    public void af(ha haVar) {
        haVar.ky();
        haVar.ad();
        mb mbVar = this.aq.ad.gu;
        if (mbVar == this.aq.ad) {
            this.al = -1;
        } else {
            this.al = ((ha) mbVar).ad;
        }
    }

    public final void ag(int i) {
        synchronized (this) {
            do {
                if (this.al < 0) {
                    ap(i);
                    return;
                } else if (this.ar + i < this.al) {
                    this.ar += i;
                    ap(i);
                    return;
                } else {
                    int i2 = this.al - this.ar;
                    ap(i2);
                    i -= i2;
                    this.ar = i2 + this.ar;
                    ar();
                    ha haVar = (ha) this.aq.ae();
                    synchronized (haVar) {
                        int aq = haVar.aq(this);
                        if (aq < 0) {
                            haVar.ad = 0;
                            aj(haVar);
                        } else {
                            haVar.ad = aq;
                            al(haVar.gu, haVar);
                        }
                    }
                }
            } while (i != 0);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(ha haVar) {
        haVar.ky();
        haVar.ad();
        mb mbVar = this.aq.ad.gu;
        if (mbVar == this.aq.ad) {
            this.al = -1;
        } else {
            this.al = ((ha) mbVar).ad;
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ai() {
        return (hq) this.ad.ae();
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(ha haVar) {
        haVar.ky();
        haVar.ad();
        mb mbVar = this.aq.ad.gu;
        if (mbVar == this.aq.ad) {
            this.al = -1;
        } else {
            this.al = ((ha) mbVar).ad;
        }
    }

    public final void ak(int[] iArr, int i, int i2) {
        synchronized (this) {
            do {
                if (this.al < 0) {
                    as(iArr, i, i2);
                    return;
                } else if (this.ar + i2 < this.al) {
                    this.ar += i2;
                    as(iArr, i, i2);
                    return;
                } else {
                    int i3 = this.al - this.ar;
                    as(iArr, i, i3);
                    i += i3;
                    i2 -= i3;
                    this.ar = i3 + this.ar;
                    ar();
                    ha haVar = (ha) this.aq.ae();
                    synchronized (haVar) {
                        int aq = haVar.aq(this);
                        if (aq < 0) {
                            haVar.ad = 0;
                            aj(haVar);
                        } else {
                            haVar.ad = aq;
                            al(haVar.gu, haVar);
                        }
                    }
                }
            } while (i2 != 0);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(mb mbVar, ha haVar) {
        mb mbVar2 = mbVar;
        while (mbVar2 != this.aq.ad && ((ha) mbVar2).ad <= haVar.ad) {
            mbVar2 = mbVar2.gu;
        }
        fy.al(haVar, mbVar2);
        this.al = ((ha) this.aq.ad.gu).ad;
    }

    /* Access modifiers changed, original: protected */
    public int am() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public hq an() {
        return (hq) this.ad.ae();
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(ha haVar) {
        haVar.ky();
        haVar.ad();
        mb mbVar = this.aq.ad.gu;
        if (mbVar == this.aq.ad) {
            this.al = -1;
        } else {
            this.al = ((ha) mbVar).ad;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(int i) {
        mb ae = this.ad.ae();
        while (true) {
            hq hqVar = (hq) ae;
            if (hqVar != null) {
                hqVar.ag(i);
                ae = this.ad.ak();
            } else {
                return;
            }
        }
    }

    public final void aq(hq hqVar) {
        synchronized (this) {
            hqVar.ky();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar() {
        if (this.ar > 0) {
            mb ae = this.aq.ae();
            while (true) {
                ha haVar = (ha) ae;
                if (haVar != null) {
                    haVar.ad -= this.ar;
                    ae = this.aq.ak();
                } else {
                    this.al -= this.ar;
                    this.ar = 0;
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(int[] iArr, int i, int i2) {
        mb ae = this.ad.ae();
        while (true) {
            hq hqVar = (hq) ae;
            if (hqVar != null) {
                hqVar.gz(iArr, i, i2);
                ae = this.ad.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public int at() {
        return 0;
    }

    public final void au(hq hqVar) {
        synchronized (this) {
            this.ad.ar(hqVar);
        }
    }

    /* Access modifiers changed, original: protected */
    public int av() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void aw() {
        if (this.ar > 0) {
            mb ae = this.aq.ae();
            while (true) {
                ha haVar = (ha) ae;
                if (haVar != null) {
                    haVar.ad -= this.ar;
                    ae = this.aq.ak();
                } else {
                    this.al -= this.ar;
                    this.ar = 0;
                    return;
                }
            }
        }
    }

    public final void ax(hq hqVar) {
        synchronized (this) {
            hqVar.ky();
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ay() {
        return (hq) this.ad.ae();
    }

    public final void az(hq hqVar) {
        synchronized (this) {
            hqVar.ky();
        }
    }

    public final void ba(int[] iArr, int i, int i2) {
        synchronized (this) {
            do {
                if (this.al < 0) {
                    as(iArr, i, i2);
                    return;
                } else if (this.ar + i2 < this.al) {
                    this.ar += i2;
                    as(iArr, i, i2);
                    return;
                } else {
                    int i3 = this.al - this.ar;
                    as(iArr, i, i3);
                    i += i3;
                    i2 -= i3;
                    this.ar = i3 + this.ar;
                    ar();
                    ha haVar = (ha) this.aq.ae();
                    synchronized (haVar) {
                        int aq = haVar.aq(this);
                        if (aq < 0) {
                            haVar.ad = 0;
                            aj(haVar);
                        } else {
                            haVar.ad = aq;
                            al(haVar.gu, haVar);
                        }
                    }
                }
            } while (i2 != 0);
        }
    }

    public final void bd(int i) {
        synchronized (this) {
            do {
                if (this.al < 0) {
                    ap(i);
                    return;
                } else if (this.ar + i < this.al) {
                    this.ar += i;
                    ap(i);
                    return;
                } else {
                    int i2 = this.al - this.ar;
                    ap(i2);
                    i -= i2;
                    this.ar = i2 + this.ar;
                    ar();
                    ha haVar = (ha) this.aq.ae();
                    synchronized (haVar) {
                        int aq = haVar.aq(this);
                        if (aq < 0) {
                            haVar.ad = 0;
                            aj(haVar);
                        } else {
                            haVar.ad = aq;
                            al(haVar.gu, haVar);
                        }
                    }
                }
            } while (i != 0);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bf(int i) {
        mb ae = this.ad.ae();
        while (true) {
            hq hqVar = (hq) ae;
            if (hqVar != null) {
                hqVar.ag(i);
                ae = this.ad.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public int bk() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(int i) {
        mb ae = this.ad.ae();
        while (true) {
            hq hqVar = (hq) ae;
            if (hqVar != null) {
                hqVar.ag(i);
                ae = this.ad.ak();
            } else {
                return;
            }
        }
    }

    public final void bm(int[] iArr, int i, int i2) {
        synchronized (this) {
            do {
                if (this.al < 0) {
                    as(iArr, i, i2);
                    return;
                } else if (this.ar + i2 < this.al) {
                    this.ar += i2;
                    as(iArr, i, i2);
                    return;
                } else {
                    int i3 = this.al - this.ar;
                    as(iArr, i, i3);
                    i += i3;
                    i2 -= i3;
                    this.ar = i3 + this.ar;
                    ar();
                    ha haVar = (ha) this.aq.ae();
                    synchronized (haVar) {
                        int aq = haVar.aq(this);
                        if (aq < 0) {
                            haVar.ad = 0;
                            aj(haVar);
                        } else {
                            haVar.ad = aq;
                            al(haVar.gu, haVar);
                        }
                    }
                }
            } while (i2 != 0);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(int i) {
        mb ae = this.ad.ae();
        while (true) {
            hq hqVar = (hq) ae;
            if (hqVar != null) {
                hqVar.ag(i);
                ae = this.ad.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bq(int[] iArr, int i, int i2) {
        mb ae = this.ad.ae();
        while (true) {
            hq hqVar = (hq) ae;
            if (hqVar != null) {
                hqVar.gz(iArr, i, i2);
                ae = this.ad.ak();
            } else {
                return;
            }
        }
    }

    public final void bs(int[] iArr, int i, int i2) {
        synchronized (this) {
            do {
                if (this.al < 0) {
                    as(iArr, i, i2);
                    return;
                } else if (this.ar + i2 < this.al) {
                    this.ar += i2;
                    as(iArr, i, i2);
                    return;
                } else {
                    int i3 = this.al - this.ar;
                    as(iArr, i, i3);
                    i += i3;
                    i2 -= i3;
                    this.ar = i3 + this.ar;
                    ar();
                    ha haVar = (ha) this.aq.ae();
                    synchronized (haVar) {
                        int aq = haVar.aq(this);
                        if (aq < 0) {
                            haVar.ad = 0;
                            aj(haVar);
                        } else {
                            haVar.ad = aq;
                            al(haVar.gu, haVar);
                        }
                    }
                }
            } while (i2 != 0);
        }
    }
}
