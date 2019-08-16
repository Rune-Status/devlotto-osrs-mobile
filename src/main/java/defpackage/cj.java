package defpackage;

/* renamed from: cj */
public final class cj {
    static final int ao = 0;
    static kv da;
    static String dk;
    int ad;
    int ae;
    int ag;
    int ai;
    public br aj;
    int ak;
    int al;
    int am;
    int ap;
    int aq;
    int ar;
    int as;
    public long au;
    int az;

    cj() {
        try {
            this.au = 0;
            this.az = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cj.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void aj(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, gs[] gsVarArr, int i8) {
        int i9;
        int i10;
        int i11 = 0;
        while (true) {
            i9 = i11;
            if (i9 >= 8) {
                break;
            }
            for (i11 = 0; i11 < 8; i11++) {
                int i12 = i9 + i2;
                if (i12 > 0 && i12 < 103) {
                    i10 = i11 + i3;
                    if (i10 > 0 && i10 < 103) {
                        try {
                            int[] iArr = gsVarArr[i].bc[i12];
                            iArr[i10] = iArr[i10] & -16777217;
                        } catch (RuntimeException e) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("cj.aj(");
                            stringBuilder.append(')');
                            throw mv.aq(e, stringBuilder.toString());
                        }
                    }
                }
            }
            i11 = i9 + 1;
        }
        lj ljVar = new lj(bArr);
        i9 = 0;
        while (true) {
            int i13 = i9;
            if (i13 < 4) {
                i9 = 0;
                while (true) {
                    int i14 = i9;
                    if (i14 >= 64) {
                        break;
                    }
                    int i15 = 0;
                    while (i15 < 64) {
                        if (i4 != i13 || i14 < i5 || i14 >= i5 + 8 || i15 < i6 || i15 >= i6 + 8) {
                            du.ae(ljVar, 0, -1, -1, 0, 0, 0, -1403145942);
                        } else {
                            i9 = i14 & 7;
                            i10 = i15 & 7;
                            du.ae(ljVar, i, ey.ad(i9, i10, i7, (byte) 87) + i2, i3 + eq.aq(i9, i10, i7, 1956907281), 0, 0, i7, 2001917592);
                        }
                        i15++;
                    }
                    i9 = i14 + 1;
                }
                i9 = i13 + 1;
            } else {
                return;
            }
        }
    }

    static void aq(int i) {
        try {
            am.al = (byte[][][]) null;
            in.aj = (byte[][][]) null;
            fk.ai = (byte[][][]) null;
            ja.ae = (byte[][][]) null;
            hj.ax = (int[][][]) null;
            in.am = (byte[][][]) null;
            in.ak = (int[][]) null;
            in.as = null;
            bz.ag = null;
            in.ap = null;
            cg.au = null;
            ab.az = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cj.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
