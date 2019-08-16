package defpackage;

/* renamed from: ai */
public class ai {
    public static int al;
    static kh am;

    ai() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ai.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static ee[] ac(int i) {
        try {
            ee[] eeVarArr = new ee[(fq.ad * 268010259)];
            ca.ab((byte) 4);
            for (int i2 = 0; i2 < fq.ad * 268010259; i2++) {
                ee eeVar = new ee();
                eeVarArr[i2] = eeVar;
                eeVar.ai = fq.aq * 1679085813;
                eeVar.ae = fq.ar * -1789448811;
                eeVar.al = fq.al[i2];
                eeVar.aj = fq.aj[i2];
                eeVar.aq = dv.ai[i2];
                eeVar.ar = fq.ae[i2];
                int i3 = eeVar.ar * eeVar.aq;
                byte[] bArr = eh.ak[i2];
                eeVar.ad = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    eeVar.ad[i4] = fq.am[bArr[i4] & 255];
                }
            }
            jn.an(-775768833);
            return eeVarArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ai.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ae(int i, int i2, int i3) {
        int i4 = i3 & 3;
        return i4 == 0 ? i2 : i4 == 1 ? 7 - i : i4 == 2 ? 7 - i2 : i;
    }

    public static int ag(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if ((i6 & 1) == 1) {
            i7 = i5;
            i8 = i4;
        } else {
            i7 = i4;
            i8 = i5;
        }
        int i9 = i3 & 3;
        return i9 == 0 ? i : 1 == i9 ? i2 : 2 == i9 ? (7 - i) - (i7 - 1) : (7 - i2) - (i8 - 1);
    }

    public static int ai(int i, int i2, int i3) {
        int i4 = i3 & 3;
        return i4 == 0 ? i : i4 == 1 ? i2 : i4 == 2 ? 7 - i : 7 - i2;
    }

    public static int aj(int i, int i2, int i3) {
        int i4 = i3 & 3;
        return i4 == 0 ? i : i4 == 1 ? i2 : i4 == 2 ? 7 - i : 7 - i2;
    }

    public static int ak(int i, int i2, int i3) {
        int i4 = i3 & 3;
        return i4 == 0 ? i2 : i4 == 1 ? 7 - i : i4 == 2 ? 7 - i2 : i;
    }

    public static int am(int i, int i2, int i3) {
        int i4 = i3 & 3;
        return i4 == 0 ? i2 : i4 == 1 ? 7 - i : i4 == 2 ? 7 - i2 : i;
    }

    public static int ap(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if ((i6 & 1) == 1) {
            i7 = i5;
            i8 = i4;
        } else {
            i7 = i4;
            i8 = i5;
        }
        int i9 = i3 & 3;
        return i9 == 0 ? i : 1 == i9 ? i2 : 2 == i9 ? (7 - i) - (i7 - 1) : (7 - i2) - (i8 - 1);
    }

    public static boolean aq(int i, int i2, int i3) {
        return ((i >> (i2 + 1)) & 1) != 0;
    }

    public static boolean ar(long j) {
        if (0 != j) {
            try {
                if (!np.ag(j)) {
                    return true;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ai.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return false;
    }

    public static int as(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if ((i6 & 1) == 1) {
            i7 = i5;
            i8 = i4;
        } else {
            i7 = i4;
            i8 = i5;
        }
        int i9 = i3 & 3;
        return i9 == 0 ? i : 1 == i9 ? i2 : 2 == i9 ? (7 - i) - (i7 - 1) : (7 - i2) - (i8 - 1);
    }

    public static int au(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if ((i6 & 1) == 1) {
            i7 = i5;
            i8 = i4;
        } else {
            i7 = i4;
            i8 = i5;
        }
        int i9 = i3 & 3;
        return i9 == 0 ? i2 : 1 == i9 ? (7 - i) - (i7 - 1) : i9 == 2 ? (7 - i2) - (i8 - 1) : i;
    }

    public static int ax(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if ((i6 & 1) == 1) {
            i7 = i5;
            i8 = i4;
        } else {
            i7 = i4;
            i8 = i5;
        }
        int i9 = i3 & 3;
        return i9 == 0 ? i2 : 1 == i9 ? (7 - i) - (i7 - 1) : i9 == 2 ? (7 - i2) - (i8 - 1) : i;
    }

    public static int az(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if ((i6 & 1) == 1) {
            i7 = i5;
            i8 = i4;
        } else {
            i7 = i4;
            i8 = i5;
        }
        int i9 = i3 & 3;
        return i9 == 0 ? i2 : 1 == i9 ? (7 - i) - (i7 - 1) : i9 == 2 ? (7 - i2) - (i8 - 1) : i;
    }

    static final void en(int i) {
        try {
            for (iw iwVar = (iw) client.kh.ae(); iwVar != null; iwVar = (iw) client.kh.ak()) {
                if (-1 == iwVar.ap * -1874610465) {
                    iwVar.ag = 0;
                    kh.ey(iwVar, -625885926);
                } else {
                    iwVar.ky();
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ai.en(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ir(byte b) {
        try {
            if (di.rl != null) {
                client.rg = client.bj * 1179580815;
                di.rl.aj(613209018);
                for (int i = 0; i < client.jz.length; i++) {
                    if (client.jz[i] != null) {
                        di.rl.al(((client.jz[i].bq * -1444273727) >> 7) + (oz.ff * 2060098323), ((client.jz[i].bd * -1690563339) >> 7) + (cq.fz * -1866366501), 2112147599);
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ai.ir(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
