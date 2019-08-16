package defpackage;

/* renamed from: au */
public class au {
    public static final int ad = 1;
    public static final int aq = 2;
    public static final int bt = 49;
    static final int en = 32768;
    final int al;
    final boolean ar;

    public au(boolean z, int i) {
        try {
            this.ar = z;
            this.al = -450385737 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("au.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ad(byte[] bArr, int i) {
        try {
            return jt.aq(bArr, 0, bArr.length, 1629140228);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("au.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void af(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        int i7 = -(i3 >> 2);
        int i8 = -(i3 & 3);
        int i9 = i2;
        int i10 = i;
        for (int i11 = -i4; i11 < 0; i11++) {
            int i12;
            int i13;
            byte b2;
            int i14 = i7;
            while (i14 < 0) {
                i12 = i10 + 1;
                byte b3 = bArr[i10];
                if (b3 != (byte) 0) {
                    i13 = i9 + 1;
                    iArr[i9] = iArr2[b3 & 255];
                } else {
                    i13 = i9 + 1;
                }
                i10 = i12 + 1;
                b2 = bArr[i12];
                if (b2 != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = iArr2[b2 & 255];
                    i13 = i12;
                } else {
                    i13++;
                }
                i9 = i10 + 1;
                b3 = bArr[i10];
                if (b3 != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = iArr2[b3 & 255];
                    i13 = i12;
                } else {
                    i13++;
                }
                i10 = i9 + 1;
                byte b4 = bArr[i9];
                if (b4 != (byte) 0) {
                    iArr[i13] = iArr2[b4 & 255];
                }
                i14++;
                i9 = i13 + 1;
            }
            i12 = i8;
            i13 = i9;
            while (i12 < 0) {
                b2 = bArr[i10];
                if (b2 != (byte) 0) {
                    iArr[i13] = iArr2[b2 & 255];
                }
                i13++;
                i12++;
                i10++;
            }
            i9 = i13 + i5;
            i10 += i6;
        }
    }

    public static boolean ak(byte b) {
        try {
            return ko.aj * -557713751 != 0 ? true : ji.al.au(310195269);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("au.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final void ax(int i, int i2, boolean z, int i3) {
        try {
            bu.al = -1502660185 * i;
            bu.aj = -1155253939 * i2;
            bu.ar = z;
            bu.aw = 0;
            bu.ai = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("au.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ad(int i) {
        try {
            return this.ar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("au.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.al * -1335380729;
    }

    public boolean aj() {
        return this.ar;
    }

    public boolean al() {
        return this.ar;
    }

    public int aq(int i) {
        try {
            return this.al * -1335380729;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("au.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ar() {
        return this.ar;
    }
}
