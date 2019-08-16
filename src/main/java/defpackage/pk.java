package defpackage;

/* renamed from: pk */
public class pk {
    int[] ad;

    public pk(int[] iArr) {
        int i = 0;
        try {
            int i2;
            int i3 = 1;
            while (i3 <= (iArr.length >> 1) + iArr.length) {
                i3 <<= 1;
            }
            int i4 = i3 + i3;
            this.ad = new int[i4];
            for (i2 = 0; i2 < i4; i2++) {
                this.ad[i2] = -1;
            }
            while (true) {
                i2 = i;
                if (i2 < iArr.length) {
                    int i5;
                    int i6;
                    i = iArr[i2];
                    i4 = i3 - 1;
                    while (true) {
                        i &= i4;
                        i5 = i + i;
                        i6 = i5 + 1;
                        if (-1 == this.ad[i6]) {
                            break;
                        }
                        i++;
                    }
                    this.ad[i5] = iArr[i2];
                    this.ad[i6] = i2;
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pk.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int aq(ot otVar, int i, int i2, int i3) {
        if (otVar == null) {
            return i2;
        }
        try {
            ms msVar = (ms) otVar.ad((long) i);
            return msVar != null ? msVar.ad : i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pk.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i, int i2) {
        try {
            int length = (this.ad.length >> 1) - 1;
            int i3 = i & length;
            while (true) {
                int i4 = i3;
                int i5 = i4 + i4;
                i3 = this.ad[i5 + 1];
                if (i3 == -1) {
                    return -1;
                }
                if (i == this.ad[i5]) {
                    return i3;
                }
                i3 = (i4 + 1) & length;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pk.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int aj(int i) {
        int length = (this.ad.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = i2 + i2;
            int i4 = this.ad[i3 + 1];
            if (i4 == -1) {
                return -1;
            }
            if (i == this.ad[i3]) {
                return i4;
            }
            i2 = (i2 + 1) & length;
        }
    }

    public int al(int i) {
        int length = (this.ad.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = i2 + i2;
            int i4 = this.ad[i3 + 1];
            if (i4 == -1) {
                return -1;
            }
            if (i == this.ad[i3]) {
                return i4;
            }
            i2 = (i2 + 1) & length;
        }
    }

    public int aq(int i) {
        int length = (this.ad.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = i2 + i2;
            int i4 = this.ad[i3 + 1];
            if (i4 == -1) {
                return -1;
            }
            if (i == this.ad[i3]) {
                return i4;
            }
            i2 = (i2 + 1) & length;
        }
    }

    public int ar(int i) {
        int length = (this.ad.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = i2 + i2;
            int i4 = this.ad[i3 + 1];
            if (i4 == -1) {
                return -1;
            }
            if (i == this.ad[i3]) {
                return i4;
            }
            i2 = (i2 + 1) & length;
        }
    }
}
