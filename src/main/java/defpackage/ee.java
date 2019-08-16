package defpackage;

/* renamed from: ee */
public final class ee extends mp {
    public int[] ad;
    public int ae;
    public int ai;
    int aj;
    public int al;
    public int aq;
    public int ar;

    ee() {
    }

    public ee(int i, int i2) {
        this(new int[(i * i2)], i, i2);
    }

    public ee(int[] iArr, int i, int i2) {
        this.ad = iArr;
        this.ai = i;
        this.aq = i;
        this.ae = i2;
        this.ar = i2;
        this.aj = 0;
        this.al = 0;
    }

    public void aa() {
        int[] iArr = new int[(this.aq * this.ar)];
        int i = 0;
        for (int i2 = this.ar - 1; i2 >= 0; i2--) {
            int i3 = 0;
            while (i3 < this.aq) {
                iArr[i] = this.ad[(this.aq * i2) + i3];
                i3++;
                i++;
            }
        }
        this.ad = iArr;
        this.aj = (this.ae - this.ar) - this.aj;
    }

    public void ab(int i) {
        int[] iArr = new int[(this.aq * this.ar)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.ar) {
            int i4 = 0;
            while (i4 < this.aq) {
                int i5 = this.ad[i3];
                if (i5 == 0 && ((i4 > 0 && this.ad[i3 - 1] != 0) || ((i2 > 0 && this.ad[i3 - this.aq] != 0) || ((i4 < this.aq - 1 && this.ad[i3 + 1] != 0) || (i2 < this.ar - 1 && this.ad[this.aq + i3] != 0))))) {
                    i5 = i;
                }
                iArr[i3] = i5;
                i4++;
                i3++;
            }
            i2++;
        }
        this.ad = iArr;
    }

    public void ac() {
        int[] iArr = new int[(this.aq * this.ar)];
        int i = 0;
        for (int i2 = this.ar - 1; i2 >= 0; i2--) {
            int i3 = 0;
            while (i3 < this.aq) {
                iArr[i] = this.ad[(this.aq * i2) + i3];
                i3++;
                i++;
            }
        }
        this.ad = iArr;
        this.aj = (this.ae - this.ar) - this.aj;
    }

    public ee ad() {
        ee eeVar = new ee(this.aq, this.ar);
        eeVar.ai = this.ai;
        eeVar.ae = this.ae;
        eeVar.al = (this.ai - this.aq) - this.al;
        eeVar.aj = this.aj;
        for (int i = 0; i < this.ar; i++) {
            for (int i2 = 0; i2 < this.aq; i2++) {
                eeVar.ad[(this.aq * i) + i2] = this.ad[(((this.aq * i) + this.aq) - 1) - i2];
            }
        }
        return eeVar;
    }

    public void ae(int i) {
        int[] iArr = new int[(this.aq * this.ar)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.ar) {
            int i4 = 0;
            while (i4 < this.aq) {
                int i5 = this.ad[i3];
                if (i5 == 0 && ((i4 > 0 && this.ad[i3 - 1] != 0) || ((i2 > 0 && this.ad[i3 - this.aq] != 0) || ((i4 < this.aq - 1 && this.ad[i3 + 1] != 0) || (i2 < this.ar - 1 && this.ad[this.aq + i3] != 0))))) {
                    i5 = i;
                }
                iArr[i3] = i5;
                i4++;
                i3++;
            }
            i2++;
        }
        this.ad = iArr;
    }

    public void af(int i) {
        int[] iArr = new int[(this.aq * this.ar)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.ar) {
            int i4 = 0;
            while (i4 < this.aq) {
                int i5 = this.ad[i3];
                if (i5 == 0 && ((i4 > 0 && this.ad[i3 - 1] != 0) || ((i2 > 0 && this.ad[i3 - this.aq] != 0) || ((i4 < this.aq - 1 && this.ad[i3 + 1] != 0) || (i2 < this.ar - 1 && this.ad[this.aq + i3] != 0))))) {
                    i5 = i;
                }
                iArr[i3] = i5;
                i4++;
                i3++;
            }
            i2++;
        }
        this.ad = iArr;
    }

    public ee ag() {
        ee eeVar = new ee(this.aq, this.ar);
        eeVar.ai = this.ai;
        eeVar.ae = this.ae;
        eeVar.al = (this.ai - this.aq) - this.al;
        eeVar.aj = this.aj;
        for (int i = 0; i < this.ar; i++) {
            for (int i2 = 0; i2 < this.aq; i2++) {
                eeVar.ad[(this.aq * i) + i2] = this.ad[(((this.aq * i) + this.aq) - 1) - i2];
            }
        }
        return eeVar;
    }

    public void ah() {
        int[] iArr = new int[(this.aq * this.ar)];
        int i = 0;
        for (int i2 = this.ar - 1; i2 >= 0; i2--) {
            int i3 = 0;
            while (i3 < this.aq) {
                iArr[i] = this.ad[(this.aq * i2) + i3];
                i3++;
                i++;
            }
        }
        this.ad = iArr;
        this.aj = (this.ae - this.ar) - this.aj;
    }

    public void ai() {
        int[] iArr = new int[(this.aq * this.ar)];
        int i = 0;
        for (int i2 = this.ar - 1; i2 >= 0; i2--) {
            int i3 = 0;
            while (i3 < this.aq) {
                iArr[i] = this.ad[(this.aq * i2) + i3];
                i3++;
                i++;
            }
        }
        this.ad = iArr;
        this.aj = (this.ae - this.ar) - this.aj;
    }

    public void aj() {
        int i = 0;
        int[] iArr = new int[(this.aq * this.ar)];
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i3 < this.ar) {
                i = this.aq - 1;
                while (i >= 0) {
                    iArr[i2] = this.ad[(this.aq * i3) + i];
                    i--;
                    i2++;
                }
                i = i3 + 1;
            } else {
                this.ad = iArr;
                this.al = (this.ai - this.aq) - this.al;
                return;
            }
        }
    }

    public ee ak() {
        ee eeVar = new ee(this.aq, this.ar);
        eeVar.ai = this.ai;
        eeVar.ae = this.ae;
        eeVar.al = (this.ai - this.aq) - this.al;
        eeVar.aj = this.aj;
        for (int i = 0; i < this.ar; i++) {
            for (int i2 = 0; i2 < this.aq; i2++) {
                eeVar.ad[(this.aq * i) + i2] = this.ad[(((this.aq * i) + this.aq) - 1) - i2];
            }
        }
        return eeVar;
    }

    public void al(int i) {
        if (this.aq != this.ai || this.ar != this.ae) {
            int i2 = i > this.al ? this.al : i;
            int i3 = (this.al + i) + this.aq > this.ai ? (this.ai - this.al) - this.aq : i;
            int i4 = i > this.aj ? this.aj : i;
            if ((this.aj + i) + this.ar > this.ae) {
                i = (this.ae - this.aj) - this.ar;
            }
            int i5 = (this.aq + i2) + i3;
            int i6 = (this.ar + i4) + i;
            int[] iArr = new int[(i5 * i6)];
            for (i3 = 0; i3 < this.ar; i3++) {
                for (int i7 = 0; i7 < this.aq; i7++) {
                    iArr[((i3 + i4) * i5) + (i7 + i2)] = this.ad[(this.aq * i3) + i7];
                }
            }
            this.ad = iArr;
            this.aq = i5;
            this.ar = i6;
            this.al -= i2;
            this.aj -= i4;
        }
    }

    public void am(int i) {
        for (int i2 = this.ar - 1; i2 > 0; i2--) {
            int i3 = this.aq;
            for (int i4 = this.aq - 1; i4 > 0; i4--) {
                int i5 = (i3 * i2) + i4;
                if (this.ad[i5] == 0 && this.ad[(i5 - 1) - this.aq] != 0) {
                    this.ad[i5] = i;
                }
            }
        }
    }

    public void an(int i) {
        int[] iArr = new int[(this.aq * this.ar)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.ar) {
            int i4 = 0;
            while (i4 < this.aq) {
                int i5 = this.ad[i3];
                if (i5 == 0 && ((i4 > 0 && this.ad[i3 - 1] != 0) || ((i2 > 0 && this.ad[i3 - this.aq] != 0) || ((i4 < this.aq - 1 && this.ad[i3 + 1] != 0) || (i2 < this.ar - 1 && this.ad[this.aq + i3] != 0))))) {
                    i5 = i;
                }
                iArr[i3] = i5;
                i4++;
                i3++;
            }
            i2++;
        }
        this.ad = iArr;
    }

    public void ao() {
        int[] iArr = new int[(this.aq * this.ar)];
        int i = 0;
        for (int i2 = this.ar - 1; i2 >= 0; i2--) {
            int i3 = 0;
            while (i3 < this.aq) {
                iArr[i] = this.ad[(this.aq * i2) + i3];
                i3++;
                i++;
            }
        }
        this.ad = iArr;
        this.aj = (this.ae - this.ar) - this.aj;
    }

    public ee ap() {
        ee eeVar = new ee(this.ai, this.ae);
        for (int i = 0; i < this.ar; i++) {
            for (int i2 = 0; i2 < this.aq; i2++) {
                eeVar.ad[((this.aj + i) * this.ai) + (this.al + i2)] = this.ad[(this.aq * i) + i2];
            }
        }
        return eeVar;
    }

    public ee aq() {
        ee eeVar = new ee(this.ai, this.ae);
        for (int i = 0; i < this.ar; i++) {
            for (int i2 = 0; i2 < this.aq; i2++) {
                eeVar.ad[((this.aj + i) * this.ai) + (this.al + i2)] = this.ad[(this.aq * i) + i2];
            }
        }
        return eeVar;
    }

    public void ar() {
        if (this.aq != this.ai || this.ar != this.ae) {
            int[] iArr = new int[(this.ai * this.ae)];
            for (int i = 0; i < this.ar; i++) {
                for (int i2 = 0; i2 < this.aq; i2++) {
                    iArr[((this.aj + i) * this.ai) + (this.al + i2)] = this.ad[(this.aq * i) + i2];
                }
            }
            this.ad = iArr;
            this.aq = this.ai;
            this.ar = this.ae;
            this.al = 0;
            this.aj = 0;
        }
    }

    public ee as() {
        ee eeVar = new ee(this.aq, this.ar);
        eeVar.ai = this.ai;
        eeVar.ae = this.ae;
        eeVar.al = (this.ai - this.aq) - this.al;
        eeVar.aj = this.aj;
        for (int i = 0; i < this.ar; i++) {
            for (int i2 = 0; i2 < this.aq; i2++) {
                eeVar.ad[(this.aq * i) + i2] = this.ad[(((this.aq * i) + this.aq) - 1) - i2];
            }
        }
        return eeVar;
    }

    public ee au() {
        ee eeVar = new ee(this.ai, this.ae);
        for (int i = 0; i < this.ar; i++) {
            for (int i2 = 0; i2 < this.aq; i2++) {
                eeVar.ad[((this.aj + i) * this.ai) + (this.al + i2)] = this.ad[(this.aq * i) + i2];
            }
        }
        return eeVar;
    }

    public void av(int i) {
        int[] iArr = new int[(this.aq * this.ar)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.ar) {
            int i4 = 0;
            while (i4 < this.aq) {
                int i5 = this.ad[i3];
                if (i5 == 0 && ((i4 > 0 && this.ad[i3 - 1] != 0) || ((i2 > 0 && this.ad[i3 - this.aq] != 0) || ((i4 < this.aq - 1 && this.ad[i3 + 1] != 0) || (i2 < this.ar - 1 && this.ad[this.aq + i3] != 0))))) {
                    i5 = i;
                }
                iArr[i3] = i5;
                i4++;
                i3++;
            }
            i2++;
        }
        this.ad = iArr;
    }

    public void aw() {
        int i = 0;
        int[] iArr = new int[(this.aq * this.ar)];
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i3 < this.ar) {
                i = this.aq - 1;
                while (i >= 0) {
                    iArr[i2] = this.ad[(this.aq * i3) + i];
                    i--;
                    i2++;
                }
                i = i3 + 1;
            } else {
                this.ad = iArr;
                this.al = (this.ai - this.aq) - this.al;
                return;
            }
        }
    }

    public void ax() {
        int i = 0;
        int[] iArr = new int[(this.aq * this.ar)];
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i3 < this.ar) {
                i = this.aq - 1;
                while (i >= 0) {
                    iArr[i2] = this.ad[(this.aq * i3) + i];
                    i--;
                    i2++;
                }
                i = i3 + 1;
            } else {
                this.ad = iArr;
                this.al = (this.ai - this.aq) - this.al;
                return;
            }
        }
    }

    public void ay(int i) {
        int[] iArr = new int[(this.aq * this.ar)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.ar) {
            int i4 = 0;
            while (i4 < this.aq) {
                int i5 = this.ad[i3];
                if (i5 == 0 && ((i4 > 0 && this.ad[i3 - 1] != 0) || ((i2 > 0 && this.ad[i3 - this.aq] != 0) || ((i4 < this.aq - 1 && this.ad[i3 + 1] != 0) || (i2 < this.ar - 1 && this.ad[this.aq + i3] != 0))))) {
                    i5 = i;
                }
                iArr[i3] = i5;
                i4++;
                i3++;
            }
            i2++;
        }
        this.ad = iArr;
    }

    public void az() {
        if (this.aq != this.ai || this.ar != this.ae) {
            int[] iArr = new int[(this.ai * this.ae)];
            for (int i = 0; i < this.ar; i++) {
                for (int i2 = 0; i2 < this.aq; i2++) {
                    iArr[((this.aj + i) * this.ai) + (this.al + i2)] = this.ad[(this.aq * i) + i2];
                }
            }
            this.ad = iArr;
            this.aq = this.ai;
            this.ar = this.ae;
            this.al = 0;
            this.aj = 0;
        }
    }
}
