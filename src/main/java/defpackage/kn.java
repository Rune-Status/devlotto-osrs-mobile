package defpackage;

/* renamed from: kn */
public class kn {
    static final int ae = 32;

    kn() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kn.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ae(CharSequence charSequence, CharSequence charSequence2, lz lzVar) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i = 0;
        int i2 = 0;
        char c = 0;
        char c2 = 0;
        while (true) {
            int i3 = i - c;
            int i4;
            char charAt;
            if (i3 >= length && i2 - c2 >= length2) {
                i3 = Math.min(length, length2);
                for (i4 = 0; i4 < i3; i4++) {
                    if (lzVar == lz.ar) {
                        i = (length - 1) - i4;
                        i2 = (length2 - 1) - i4;
                    } else {
                        i2 = i4;
                        i = i4;
                    }
                    charAt = charSequence.charAt(i);
                    char charAt2 = charSequence2.charAt(i2);
                    if (!(charAt2 == charAt || Character.toUpperCase(charAt) == Character.toUpperCase(charAt2))) {
                        charAt = Character.toLowerCase(charAt);
                        charAt2 = Character.toLowerCase(charAt2);
                        if (charAt2 != charAt) {
                            return eq.al(charAt, lzVar, 1831762508) - eq.al(charAt2, lzVar, 1831762508);
                        }
                    }
                }
                i2 = length - length2;
                if (i2 != 0) {
                    return i2;
                }
                for (i2 = 0; i2 < i3; i2++) {
                    c2 = charSequence.charAt(i2);
                    charAt = charSequence2.charAt(i2);
                    if (charAt != c2) {
                        return eq.al(c2, lzVar, 1831762508) - eq.al(charAt, lzVar, 1831762508);
                    }
                }
                return 0;
            } else if (i3 >= length) {
                return -1;
            } else {
                if (i2 - c2 >= length2) {
                    return 1;
                }
                if (c != 0) {
                    i3 = i;
                } else {
                    i3 = i + 1;
                    c = charSequence.charAt(i);
                }
                if (c2 != 0) {
                    charAt = c2;
                } else {
                    i4 = i2 + 1;
                    charAt = charSequence2.charAt(i2);
                    i2 = i4;
                }
                char ar = ir.ar(c, 53544972);
                c2 = ir.ar(charAt, 916468245);
                c = dt.aq(c, lzVar, (byte) -67);
                charAt = dt.aq(charAt, lzVar, (byte) 36);
                if (!(charAt == c || Character.toUpperCase(c) == Character.toUpperCase(charAt))) {
                    c = Character.toLowerCase(c);
                    charAt = Character.toLowerCase(charAt);
                    if (c != charAt) {
                        return eq.al(c, lzVar, 1831762508) - eq.al(charAt, lzVar, 1831762508);
                    }
                }
                i = i3;
                c = ar;
            }
        }
    }

    static int ag(char c, lz lzVar) {
        int i = c << 4;
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            c = Character.toLowerCase(c);
            i = (c << 4) + 1;
        }
        return (c == 241 && lzVar == lz.ai) ? 736094230 : i;
    }

    public static int ai(CharSequence charSequence, CharSequence charSequence2, lz lzVar) {
        int i;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i2 = 0;
        int i3 = 0;
        char c = 0;
        char c2 = 0;
        while (true) {
            int i4 = i2 - c;
            char charAt;
            if (i4 >= length && i3 - c2 >= length2) {
                i4 = Math.min(length, length2);
                for (i = 0; i < i4; i++) {
                    if (lzVar == lz.ar) {
                        i2 = (length - 1) - i;
                        i3 = (length2 - 1) - i;
                    } else {
                        i3 = i;
                        i2 = i;
                    }
                    charAt = charSequence.charAt(i2);
                    char charAt2 = charSequence2.charAt(i3);
                    if (!(charAt2 == charAt || Character.toUpperCase(charAt) == Character.toUpperCase(charAt2))) {
                        charAt = Character.toLowerCase(charAt);
                        charAt2 = Character.toLowerCase(charAt2);
                        if (charAt2 != charAt) {
                            i = eq.al(charAt, lzVar, 1831762508);
                            i3 = eq.al(charAt2, lzVar, 1831762508);
                        }
                    }
                }
                i3 = length - length2;
                if (i3 != 0) {
                    return i3;
                }
                for (i3 = 0; i3 < i4; i3++) {
                    c2 = charSequence.charAt(i3);
                    charAt = charSequence2.charAt(i3);
                    if (charAt != c2) {
                        return eq.al(c2, lzVar, 1831762508) - eq.al(charAt, lzVar, 1831762508);
                    }
                }
                return 0;
            } else if (i4 >= length) {
                return -1;
            } else {
                if (i3 - c2 >= length2) {
                    return 1;
                }
                if (c != 0) {
                    i4 = i2;
                } else {
                    i4 = i2 + 1;
                    c = charSequence.charAt(i2);
                }
                if (c2 != 0) {
                    charAt = c2;
                } else {
                    i = i3 + 1;
                    charAt = charSequence2.charAt(i3);
                    i3 = i;
                }
                char ar = ir.ar(c, 1177632648);
                c2 = ir.ar(charAt, 1143927034);
                c = dt.aq(c, lzVar, (byte) 13);
                charAt = dt.aq(charAt, lzVar, (byte) -18);
                if (!(charAt == c || Character.toUpperCase(c) == Character.toUpperCase(charAt))) {
                    c = Character.toLowerCase(c);
                    charAt = Character.toLowerCase(charAt);
                    if (c != charAt) {
                        i = eq.al(c, lzVar, 1831762508);
                        i3 = eq.al(charAt, lzVar, 1831762508);
                        break;
                    }
                }
                i2 = i4;
                c = ar;
            }
        }
        return i - i3;
    }

    public static int aj(CharSequence charSequence, CharSequence charSequence2, lz lzVar) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i = 0;
        int i2 = 0;
        char c = 0;
        char c2 = 0;
        while (true) {
            int i3 = i - c;
            int i4;
            char charAt;
            if (i3 >= length && i2 - c2 >= length2) {
                i3 = Math.min(length, length2);
                for (i4 = 0; i4 < i3; i4++) {
                    if (lzVar == lz.ar) {
                        i = (length - 1) - i4;
                        i2 = (length2 - 1) - i4;
                    } else {
                        i2 = i4;
                        i = i4;
                    }
                    charAt = charSequence.charAt(i);
                    char charAt2 = charSequence2.charAt(i2);
                    if (!(charAt2 == charAt || Character.toUpperCase(charAt) == Character.toUpperCase(charAt2))) {
                        charAt = Character.toLowerCase(charAt);
                        charAt2 = Character.toLowerCase(charAt2);
                        if (charAt2 != charAt) {
                            return eq.al(charAt, lzVar, 1831762508) - eq.al(charAt2, lzVar, 1831762508);
                        }
                    }
                }
                i2 = length - length2;
                if (i2 != 0) {
                    return i2;
                }
                for (i2 = 0; i2 < i3; i2++) {
                    c2 = charSequence.charAt(i2);
                    charAt = charSequence2.charAt(i2);
                    if (charAt != c2) {
                        return eq.al(c2, lzVar, 1831762508) - eq.al(charAt, lzVar, 1831762508);
                    }
                }
                return 0;
            } else if (i3 >= length) {
                return -1;
            } else {
                if (i2 - c2 >= length2) {
                    return 1;
                }
                if (c != 0) {
                    i3 = i;
                } else {
                    i3 = i + 1;
                    c = charSequence.charAt(i);
                }
                if (c2 != 0) {
                    charAt = c2;
                } else {
                    i4 = i2 + 1;
                    charAt = charSequence2.charAt(i2);
                    i2 = i4;
                }
                char ar = ir.ar(c, -234115036);
                c2 = ir.ar(charAt, -371399320);
                c = dt.aq(c, lzVar, (byte) -38);
                charAt = dt.aq(charAt, lzVar, (byte) 26);
                if (!(charAt == c || Character.toUpperCase(c) == Character.toUpperCase(charAt))) {
                    c = Character.toLowerCase(c);
                    charAt = Character.toLowerCase(charAt);
                    if (c != charAt) {
                        return eq.al(c, lzVar, 1831762508) - eq.al(charAt, lzVar, 1831762508);
                    }
                }
                i = i3;
                c = ar;
            }
        }
    }

    static char ak(char c, lz lzVar) {
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
            if (c == 209 && lz.ai != lzVar) {
                return 'N';
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

    public static int am(CharSequence charSequence, CharSequence charSequence2, lz lzVar) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i = 0;
        int i2 = 0;
        char c = 0;
        char c2 = 0;
        while (true) {
            int i3 = i - c;
            int i4;
            char charAt;
            if (i3 >= length && i2 - c2 >= length2) {
                i3 = Math.min(length, length2);
                for (i4 = 0; i4 < i3; i4++) {
                    if (lzVar == lz.ar) {
                        i = (length - 1) - i4;
                        i2 = (length2 - 1) - i4;
                    } else {
                        i2 = i4;
                        i = i4;
                    }
                    charAt = charSequence.charAt(i);
                    char charAt2 = charSequence2.charAt(i2);
                    if (!(charAt2 == charAt || Character.toUpperCase(charAt) == Character.toUpperCase(charAt2))) {
                        charAt = Character.toLowerCase(charAt);
                        charAt2 = Character.toLowerCase(charAt2);
                        if (charAt2 != charAt) {
                            return eq.al(charAt, lzVar, 1831762508) - eq.al(charAt2, lzVar, 1831762508);
                        }
                    }
                }
                i2 = length - length2;
                if (i2 != 0) {
                    return i2;
                }
                for (i2 = 0; i2 < i3; i2++) {
                    c2 = charSequence.charAt(i2);
                    charAt = charSequence2.charAt(i2);
                    if (charAt != c2) {
                        return eq.al(c2, lzVar, 1831762508) - eq.al(charAt, lzVar, 1831762508);
                    }
                }
                return 0;
            } else if (i3 >= length) {
                return -1;
            } else {
                if (i2 - c2 >= length2) {
                    return 1;
                }
                if (c != 0) {
                    i3 = i;
                } else {
                    i3 = i + 1;
                    c = charSequence.charAt(i);
                }
                if (c2 != 0) {
                    charAt = c2;
                } else {
                    i4 = i2 + 1;
                    charAt = charSequence2.charAt(i2);
                    i2 = i4;
                }
                char ar = ir.ar(c, 1135299668);
                c2 = ir.ar(charAt, 1377553716);
                c = dt.aq(c, lzVar, (byte) 50);
                charAt = dt.aq(charAt, lzVar, (byte) -28);
                if (!(charAt == c || Character.toUpperCase(c) == Character.toUpperCase(charAt))) {
                    c = Character.toLowerCase(c);
                    charAt = Character.toLowerCase(charAt);
                    if (c != charAt) {
                        return eq.al(c, lzVar, 1831762508) - eq.al(charAt, lzVar, 1831762508);
                    }
                }
                i = i3;
                c = ar;
            }
        }
    }

    static char as(char c) {
        return 198 == c ? 'E' : 230 == c ? 'e' : c == 223 ? 's' : c != 338 ? c == 339 ? 'e' : 0 : 'E';
    }
}
