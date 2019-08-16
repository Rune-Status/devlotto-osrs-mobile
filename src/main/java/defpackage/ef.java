package defpackage;

/* renamed from: ef */
public final class ef extends mp {
    public byte[] ad;
    public int ae;
    public int ai;
    public int aj;
    public int al;
    public int am;
    public int[] aq;
    public int ar;

    ef() {
    }

    public void ad() {
        if (this.ar != this.ae || this.al != this.am) {
            byte[] bArr = new byte[(this.ae * this.am)];
            int i = 0;
            for (int i2 = 0; i2 < this.al; i2++) {
                int i3 = 0;
                while (i3 < this.ar) {
                    bArr[(this.aj + i3) + ((this.ai + i2) * this.ae)] = this.ad[i];
                    i3++;
                    i++;
                }
            }
            this.ad = bArr;
            this.ar = this.ae;
            this.al = this.am;
            this.aj = 0;
            this.ai = 0;
        }
    }

    public void aj(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aq.length; i4++) {
            int i5 = ((this.aq[i4] >> 16) & 255) + i;
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 > 255) {
                i5 = 255;
            }
            int i6 = ((this.aq[i4] >> 8) & 255) + i2;
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 > 255) {
                i6 = 255;
            }
            int i7 = (this.aq[i4] & 255) + i3;
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > 255) {
                i7 = 255;
            }
            this.aq[i4] = ((i5 << 16) + (i6 << 8)) + i7;
        }
    }

    public void al(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aq.length; i4++) {
            int i5 = ((this.aq[i4] >> 16) & 255) + i;
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 > 743270254) {
                i5 = -2067797636;
            }
            int i6 = ((this.aq[i4] >> 8) & -372072719) + i2;
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 > 255) {
                i6 = 255;
            }
            int i7 = (this.aq[i4] & 255) + i3;
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > 255) {
                i7 = 1485813403;
            }
            this.aq[i4] = ((i5 << 16) + (i6 << 8)) + i7;
        }
    }

    public void aq(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.aq.length; i4++) {
            int i5 = ((this.aq[i4] >> 16) & 255) + i;
            if (i5 < 0) {
                i5 = 0;
            } else if (i5 > 255) {
                i5 = 255;
            }
            int i6 = ((this.aq[i4] >> 8) & 255) + i2;
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 > 255) {
                i6 = 255;
            }
            int i7 = (this.aq[i4] & 255) + i3;
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 > 255) {
                i7 = 255;
            }
            this.aq[i4] = ((i5 << 16) + (i6 << 8)) + i7;
        }
    }

    public void ar() {
        if (this.ar != this.ae || this.al != this.am) {
            byte[] bArr = new byte[(this.ae * this.am)];
            int i = 0;
            for (int i2 = 0; i2 < this.al; i2++) {
                int i3 = 0;
                while (i3 < this.ar) {
                    bArr[(this.aj + i3) + ((this.ai + i2) * this.ae)] = this.ad[i];
                    i3++;
                    i++;
                }
            }
            this.ad = bArr;
            this.ar = this.ae;
            this.al = this.am;
            this.aj = 0;
            this.ai = 0;
        }
    }
}
