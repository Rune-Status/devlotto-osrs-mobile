package defpackage;

/* renamed from: hr */
public class hr implements hh {
    protected static lp um;

    static final void ar(int i, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        while (true) {
            int i7 = i2 + i4;
            if (i6 <= i7) {
                int i8 = i;
                while (true) {
                    int i9 = i + i3;
                    if (i8 > i9) {
                        break;
                    }
                    if (i8 >= 0 && i8 < 104 && i6 >= 0 && i6 < 104) {
                        try {
                            in.am[0][i8][i6] = Byte.MAX_VALUE;
                            if (i == i8 && i8 > 0) {
                                in.ad[0][i8][i6] = in.ad[0][i8 - 1][i6];
                            }
                            if (i8 == i9 && i8 < 103) {
                                in.ad[0][i8][i6] = in.ad[0][i8 + 1][i6];
                            }
                            if (i6 == i2 && i6 > 0) {
                                in.ad[0][i8][i6] = in.ad[0][i8][i6 - 1];
                            }
                            if (i6 == i7 && i6 < 103) {
                                in.ad[0][i8][i6] = in.ad[0][i8][i6 + 1];
                            }
                        } catch (RuntimeException e) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("hr.ar(");
                            stringBuilder.append(')');
                            throw mv.aq(e, stringBuilder.toString());
                        }
                    }
                    i8++;
                }
                i6++;
            } else {
                return;
            }
        }
    }

    static void av(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = i6;
        int i14 = i4;
        for (int i15 = -i9; i15 < 0; i15++) {
            int i16 = -i8;
            int i17 = i14;
            while (i16 < 0) {
                i14 = iArr2[i17];
                if (i14 != 0) {
                    int i18 = iArr[i13];
                    int i19 = i18 + i14;
                    i14 = (i14 & 16711935) + (i18 & 16711935);
                    i14 = (i14 & 16777472) + ((i19 - i14) & 65536);
                    iArr[i13] = (i19 - i14) | (i14 - (i14 >>> 8));
                }
                i16++;
                i17++;
                i13++;
            }
            i13 += i10;
            i14 = i17 + i11;
        }
    }

    static void iv(lj ljVar, int i, int i2) {
        try {
            ay.ie(ljVar.ar, i, -1493570478);
            cd.aj(ljVar, i, 2134734968);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hr.iv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public hd ad(int i) {
        try {
            return new hu();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hr.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public hd aq() {
        return new hu();
    }

    public hd ar() {
        return new hu();
    }
}
