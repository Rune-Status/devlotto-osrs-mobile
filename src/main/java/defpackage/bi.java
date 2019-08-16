package defpackage;

import java.util.Collection;

/* renamed from: bi */
public class bi {
    static int[] ak = null;
    public static final int cy = 86;
    static ef[] ea;
    static ee[] gz;
    int ad;
    int al;
    int aq;
    int ar;

    bi() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bi.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    bi(bi biVar) {
        try {
            this.ad = biVar.ad * 1;
            this.aq = biVar.aq * 1;
            this.ar = biVar.ar * 1;
            this.al = biVar.al * 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bi.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, kh khVar2, int i) {
        try {
            dg.ad = khVar;
            dg.aq = khVar2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bi.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void al(byte[] bArr, int i, int i2, int i3, int i4, gs[] gsVarArr, byte b) {
        int i5;
        int i6;
        int i7 = 0;
        while (true) {
            i5 = i7;
            if (i5 >= 4) {
                break;
            }
            i7 = 0;
            while (true) {
                i6 = i7;
                if (i6 >= 64) {
                    break;
                }
                for (i7 = 0; i7 < 64; i7++) {
                    int i8 = i6 + i;
                    if (i8 > 0 && i8 < 103) {
                        int i9 = i2 + i7;
                        if (i9 > 0 && i9 < 103) {
                            try {
                                int[] iArr = gsVarArr[i5].bc[i8];
                                iArr[i9] = iArr[i9] & -16777217;
                            } catch (RuntimeException e) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("bi.al(");
                                stringBuilder.append(')');
                                throw mv.aq(e, stringBuilder.toString());
                            }
                        }
                    }
                }
                i7 = i6 + 1;
            }
            i7 = i5 + 1;
        }
        lj ljVar = new lj(bArr);
        for (i6 = 0; i6 < 4; i6++) {
            i5 = 0;
            while (true) {
                int i10 = i5;
                if (i10 >= 64) {
                    break;
                }
                i5 = 0;
                while (true) {
                    int i11 = i5;
                    if (i11 >= 64) {
                        break;
                    }
                    du.ae(ljVar, i6, i10 + i, i2 + i11, i3, i4, 0, -326118711);
                    i5 = i11 + 1;
                }
                i5 = i10 + 1;
            }
        }
    }

    public static void ap(Collection collection, int i) {
        try {
            collection.add(dp.al);
            collection.add(dp.aj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bi.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static byte[] ar(int i, int i2) {
        byte[] aq;
        synchronized (bi.class) {
            try {
                aq = mn.aq(i, false, 1542957535);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bi.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            } catch (Throwable th) {
                Class cls = bi.class;
            }
        }
        return aq;
    }

    static final void ce(ih ihVar, int i) {
        try {
            int i2 = (ihVar.dd * 1994646357) - (client.bj * 2133672263);
            int i3 = ihVar.bl;
            int i4 = ihVar.cd;
            int i5 = ihVar.bl;
            int i6 = ihVar.cg;
            ihVar.bq = (((((i3 * -203209664) + (i4 * -467575936)) - (ihVar.bq * -1444273727)) / i2) * 590147137) + ihVar.bq;
            ihVar.bd = (((((i5 * -203209664) + (1063806336 * i6)) - (ihVar.bd * -1690563339)) / i2) * -995934371) + ihVar.bd;
            ihVar.dp = 0;
            ihVar.dl = ihVar.dt * -1181544753;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bi.ce(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
