package defpackage;

/* renamed from: dt */
public class dt {
    public static al[][] ae = null;
    static String ap = null;
    static final int av = 25;
    static final int bc = 11;
    static final int bg = 13;
    static int dg;
    public int ad;
    public ag aq;
    public ag ar;

    public dt(int i, ag agVar, ag agVar2) {
        try {
            this.ad = -773483609 * i;
            this.aq = agVar;
            this.ar = agVar2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dt.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ad(int i, int i2, byte b) {
        return (i << 8) + i2;
    }

    public static int ad(int i, int i2, int i3, gn gnVar, gs gsVar, boolean z, int[] iArr, int[] iArr2, byte b) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        while (true) {
            i4 = i8;
            if (i4 >= 128) {
                break;
            }
            i8 = 0;
            while (i8 < 128) {
                try {
                    gv.ar[i4][i8] = 0;
                    gv.al[i4][i8] = 99999999;
                    i8++;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("dt.ad(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            i8 = i4 + 1;
        }
        boolean aq = 1 == i3 ? ds.aq(i, i2, gnVar, gsVar, (byte) -80) : 2 == i3 ? hb.ar(i, i2, gnVar, gsVar, (byte) -77) : bl.al(i, i2, i3, gnVar, gsVar, 593527475);
        int i9 = i - 64;
        int i10 = i2 - 64;
        i4 = di.aj * -1603170411;
        int i11 = gv.ai * -543561189;
        if (aq) {
            i8 = i11;
        } else if (!z) {
            return -1;
        } else {
            int i12 = gnVar.ad * -1340400467;
            int i13 = gnVar.aq * 900786495;
            int i14 = gnVar.ar;
            int i15 = gnVar.al * -1067384283;
            i5 = i12 - 10;
            i6 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            i8 = i11;
            i7 = i4;
            while (i5 <= i12 + 10) {
                i4 = i13 - 10;
                i11 = i16;
                int i17 = i7;
                while (i4 <= i13 + 10) {
                    int i18 = i5 - i9;
                    int i19 = i4 - i10;
                    if (i18 >= 0 && i19 >= 0 && i18 < 128 && i19 < 128 && gv.al[i18][i19] < 100) {
                        if (i5 < i12) {
                            i16 = i12 - i5;
                        } else {
                            i7 = ((-639385695 * i14) + i12) - 1;
                            i16 = i5 > i7 ? i5 - i7 : 0;
                        }
                        if (i4 < i13) {
                            i7 = i13 - i4;
                        } else {
                            i7 = (i15 + i13) - 1;
                            i7 = i4 > i7 ? i4 - i7 : 0;
                        }
                        i7 = (i7 * i7) + (i16 * i16);
                        if (i7 < i11 || (i11 == i7 && gv.al[i18][i19] < i6)) {
                            i6 = gv.al[i18][i19];
                            i8 = i4;
                            i11 = i7;
                            i17 = i5;
                        }
                    }
                    i4++;
                }
                i5++;
                i16 = i11;
                i7 = i17;
            }
            if (i16 == Integer.MAX_VALUE) {
                return -1;
            }
            i4 = i7;
        }
        i11 = 1;
        if (i == i4 && i8 == i2) {
            return 0;
        }
        gv.am[0] = i4;
        gv.ak[0] = i8;
        i5 = gv.ar[i4 - i9][i8 - i10];
        i7 = i5;
        i6 = i5;
        while (true) {
            if (i == i4 && i2 == i8) {
                break;
            }
            if (i7 != i6) {
                gv.am[i11] = i4;
                gv.ak[i11] = i8;
                i11++;
                i7 = i6;
            }
            if ((i6 & 2) != 0) {
                i4++;
            } else if ((i6 & 8) != 0) {
                i4--;
            }
            if ((i6 & 1) != 0) {
                i8++;
            } else if ((i6 & 4) != 0) {
                i8--;
            }
            i6 = gv.ar[i4 - i9][i8 - i10];
        }
        i4 = 0;
        while (true) {
            i7 = i11 - 1;
            if (i11 <= 0) {
                return i4;
            }
            iArr[i4] = gv.am[i7];
            i8 = i4 + 1;
            iArr2[i4] = gv.ak[i7];
            if (i8 >= iArr.length) {
                return i8;
            }
            i11 = i7;
            i4 = i8;
        }
    }

    public static int ad(CharSequence charSequence, CharSequence charSequence2, lz lzVar, byte b) {
        try {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            int i = 0;
            char c = 0;
            char c2 = 0;
            int i2 = 0;
            while (true) {
                int i3 = i - c;
                char charAt;
                if (i3 >= length && i2 - c2 >= length2) {
                    int i4;
                    i = Math.min(length, length2);
                    for (i3 = 0; i3 < i; i3++) {
                        if (lzVar == lz.ar) {
                            i2 = (length - 1) - i3;
                            i4 = (length2 - 1) - i3;
                        } else {
                            i4 = i3;
                            i2 = i3;
                        }
                        charAt = charSequence.charAt(i2);
                        c2 = charSequence2.charAt(i4);
                        if (!(c2 == charAt || Character.toUpperCase(charAt) == Character.toUpperCase(c2))) {
                            charAt = Character.toLowerCase(charAt);
                            c2 = Character.toLowerCase(c2);
                            if (c2 != charAt) {
                                return eq.al(charAt, lzVar, 1831762508) - eq.al(c2, lzVar, 1831762508);
                            }
                        }
                    }
                    i4 = length - length2;
                    if (i4 != 0) {
                        return i4;
                    }
                    for (i4 = 0; i4 < i; i4++) {
                        char charAt2 = charSequence.charAt(i4);
                        charAt = charSequence2.charAt(i4);
                        if (charAt != charAt2) {
                            return eq.al(charAt2, lzVar, 1831762508) - eq.al(charAt, lzVar, 1831762508);
                        }
                    }
                    return 0;
                } else if (i3 >= length) {
                    return -1;
                } else {
                    if (i2 - c2 >= length2) {
                        return 1;
                    }
                    if (c == 0) {
                        i3 = i + 1;
                        c = charSequence.charAt(i);
                        i = i3;
                    }
                    if (c2 != 0) {
                        i3 = i2;
                    } else {
                        i3 = i2 + 1;
                        c2 = charSequence2.charAt(i2);
                    }
                    char ar = ir.ar(c, -250180882);
                    char ar2 = ir.ar(c2, 262771323);
                    charAt = dt.aq(c, lzVar, (byte) 4);
                    c2 = dt.aq(c2, lzVar, (byte) -9);
                    if (!(c2 == charAt || Character.toUpperCase(charAt) == Character.toUpperCase(c2))) {
                        charAt = Character.toLowerCase(charAt);
                        c2 = Character.toLowerCase(c2);
                        if (charAt != c2) {
                            return eq.al(charAt, lzVar, 1831762508) - eq.al(c2, lzVar, 1831762508);
                        }
                    }
                    c = ar;
                    c2 = ar2;
                    i2 = i3;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dt.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, int i) {
        try {
            du.ad = khVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dt.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static char aq(char c, lz lzVar, byte b) {
        if (c >= 192 && c <= 255) {
            if (c >= 192 && c <= 198) {
                return 'A';
            }
            if (c == 199) {
                return 'C';
            }
            if (c >= 200 && c <= 203) {
                return 'E';
            }
            if (c >= 204 && c <= 207) {
                return 'I';
            }
            if (c == 209) {
                try {
                    if (lz.ai != lzVar) {
                        return 'N';
                    }
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("dt.aq(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            if (c >= 210 && c <= 214) {
                return 'O';
            }
            if (c >= 217 && c <= 220) {
                return 'U';
            }
            if (221 == c) {
                return 'Y';
            }
            if (c == 223) {
                return 's';
            }
            if (c >= 224 && c <= 230) {
                return 'a';
            }
            if (c == 231) {
                return 'c';
            }
            if (c >= 232 && c <= 235) {
                return 'e';
            }
            if (c >= 236 && c <= 239) {
                return 'i';
            }
            if (241 == c && lz.ai != lzVar) {
                return 'n';
            }
            if (c >= 242 && c <= 246) {
                return 'o';
            }
            if (c >= 249 && c <= 252) {
                return 'u';
            }
            if (c == 253 || c == 255) {
                return 'y';
            }
        }
        return c == 338 ? 'O' : c == 339 ? 'o' : 376 == c ? 'Y' : c;
    }

    static String ar(ot otVar, int i, String str, int i2) {
        if (otVar == null) {
            return str;
        }
        try {
            md mdVar = (md) otVar.ad((long) i);
            return mdVar != null ? (String) mdVar.ad : str;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dt.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean gz(byte b) {
        try {
            return 1 == client.kl * 670966157;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dt.gz(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
