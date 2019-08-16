package defpackage;

/* renamed from: eq */
public class eq extends me {
    public static final int bi = 38;
    public int ad;
    public en aq;
    public short ar;

    eq(en enVar, int i) {
        try {
            this.ad = ((int) (gq.ad((byte) 15) / 1000)) * -619130047;
            this.aq = enVar;
            this.ar = (short) i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eq.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ae(lv lvVar, byte b) {
        int i = 0;
        while (true) {
            try {
                int i2 = i;
                if (i2 < hz.au * -1082782879) {
                    int i3 = hz.az[i2];
                    hv hvVar = client.jz[i3];
                    i = lvVar.af(1804771424);
                    if ((i & 8) != 0) {
                        i += lvVar.af(1804771424) << 8;
                    }
                    cl.am(lvVar, i3, hvVar, i, 1854930797);
                    i = i2 + 1;
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("eq.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public static String ai(byte[] bArr, int i, int i2, int i3) {
        try {
            char[] cArr = new char[i2];
            int i4 = 0;
            int i5 = 0;
            while (i5 < i2) {
                int i6 = bArr[i5 + i] & 255;
                if (i6 == 0) {
                    i6 = i4;
                } else {
                    if (i6 >= 128 && i6 < 160) {
                        i6 = ki.ad[i6 - 128];
                        if (i6 == 0) {
                            i6 = 63;
                        }
                    }
                    cArr[i4] = (char) i6;
                    i6 = i4 + 1;
                }
                i5++;
                i4 = i6;
            }
            return new String(cArr, 0, i4);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eq.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int al(char c, lz lzVar, int i) {
        int i2 = c << 4;
        try {
            if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
                c = Character.toLowerCase(c);
                i2 = (c << 4) + 1;
            }
            return (c == 241 && lzVar == lz.ai) ? 1762 : i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eq.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int am(long j) {
        return (int) ((j >>> 7) & 127);
    }

    public static int aq(int i, int i2, int i3, int i4) {
        int i5 = i3 & 3;
        return i5 == 0 ? i2 : i5 == 1 ? 7 - i : i5 == 2 ? 7 - i2 : i;
    }

    static void bh(int i, int i2) {
        if (i == -1) {
            try {
                if (!client.pv) {
                    ao.aj(-2034242735);
                    client.pl = 325394341 * i;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("eq.bh(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        if (!(-1 == i || client.pl * -1843875795 == i || client.ph * -413365419 == 0 || client.pv)) {
            lh.ae(2, cw.dd, i, 0, -413365419 * client.ph, false, (byte) 1);
        }
        client.pl = 325394341 * i;
    }
}
