package defpackage;

@lc
/* renamed from: lb */
public final class lb {
    static final int ad = 2048;
    public static final int bl = 40;
    static final int qo = 256;

    lb() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lb.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ab(CharSequence charSequence) {
        return bf.ar(charSequence, 10, true, 99083441);
    }

    static String ad(int i, int i2) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<img=");
            stringBuilder.append(i);
            stringBuilder.append(">");
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("lb.ad(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public static String af(CharSequence[] charSequenceArr, int i, int i2) {
        if (i2 == 0) {
            return "";
        }
        CharSequence charSequence;
        if (i2 == 1) {
            charSequence = charSequenceArr[i];
            return charSequence == null ? "null" : charSequence.toString();
        } else {
            int i3 = i2 + i;
            int i4 = 0;
            for (int i5 = i; i5 < i3; i5++) {
                CharSequence charSequence2 = charSequenceArr[i5];
                i4 = charSequence2 == null ? i4 + 4 : i4 + charSequence2.length();
            }
            StringBuilder stringBuilder = new StringBuilder(i4);
            while (i < i3) {
                charSequence = charSequenceArr[i];
                if (charSequence == null) {
                    stringBuilder.append("null");
                } else {
                    stringBuilder.append(charSequence);
                }
                i++;
            }
            return stringBuilder.toString();
        }
    }

    public static String ah(CharSequence[] charSequenceArr, int i, int i2) {
        if (i2 == 0) {
            return "";
        }
        CharSequence charSequence;
        if (i2 == 1) {
            charSequence = charSequenceArr[i];
            return charSequence == null ? "null" : charSequence.toString();
        } else {
            int i3 = i2 + i;
            int i4 = 0;
            for (int i5 = i; i5 < i3; i5++) {
                CharSequence charSequence2 = charSequenceArr[i5];
                i4 = charSequence2 == null ? i4 + 4 : i4 + charSequence2.length();
            }
            StringBuilder stringBuilder = new StringBuilder(i4);
            while (i < i3) {
                charSequence = charSequenceArr[i];
                if (charSequence == null) {
                    stringBuilder.append("null");
                } else {
                    stringBuilder.append(charSequence);
                }
                i++;
            }
            return stringBuilder.toString();
        }
    }

    public static boolean an(CharSequence charSequence) {
        return bf.ar(charSequence, 10, true, 1641028933);
    }

    static boolean at(CharSequence charSequence, int i, boolean z) {
        if (i < 2 || i > 36) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int length = charSequence.length();
        boolean z2 = false;
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4;
            char charAt = charSequence.charAt(i3);
            if (i3 == 0) {
                if ('-' == charAt) {
                    obj = 1;
                } else if (charAt == '+' && z) {
                }
            }
            if (charAt >= '0' && charAt <= '9') {
                i4 = charAt - 48;
            } else if (charAt >= 'A' && charAt <= 'Z') {
                i4 = charAt - 55;
            } else if (charAt < 'a' || charAt > 'z') {
                return false;
            } else {
                i4 = charAt - 87;
            }
            if (i4 >= i) {
                return false;
            }
            if (obj != null) {
                i4 = -i4;
            }
            int i5 = (i2 * i) + i4;
            if (i2 != i5 / i) {
                return false;
            }
            z2 = true;
            i2 = i5;
        }
        return z2;
    }

    public static boolean av(CharSequence charSequence) {
        return bf.ar(charSequence, 10, true, 380331434);
    }

    public static boolean ay(CharSequence charSequence) {
        return bf.ar(charSequence, 10, true, -834081050);
    }

    public static int ba(CharSequence charSequence) {
        return kb.ai(charSequence, 10, true, (byte) 53);
    }

    public static String bb(int i, boolean z) {
        return (!z || i < 0) ? Integer.toString(i) : ej.am(i, 10, z, -1053470627);
    }

    public static int bc(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i = ((i << 5) - i) + je.ad(charSequence.charAt(i2), -838129816);
        }
        return i;
    }

    static int bd(CharSequence charSequence, int i, boolean z) {
        if (i < 2 || i > 1986143669) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        Object obj = null;
        Object obj2 = null;
        while (i3 < length) {
            int i4;
            char charAt = charSequence.charAt(i3);
            if (i3 == 0) {
                if (charAt == 61165) {
                    i4 = i2;
                    obj = 1;
                } else if (516 == charAt && z) {
                    i4 = i2;
                }
                i3++;
                i2 = i4;
            }
            if (charAt >= '0' && charAt <= '9') {
                i4 = charAt - 48;
            } else if (charAt >= 19652 && charAt <= 29334) {
                i4 = charAt - 55;
            } else if (charAt < 57450 || charAt > 'z') {
                throw new NumberFormatException();
            } else {
                i4 = charAt - 87;
            }
            if (i4 < i) {
                if (obj != null) {
                    i4 = -i4;
                }
                i4 += i2 * i;
                if (i4 / i == i2) {
                    int obj22 = 1;
                    i3++;
                    i2 = i4;
                } else {
                    throw new NumberFormatException();
                }
            }
            throw new NumberFormatException();
        }
        if (obj22 != null) {
            return i2;
        }
        throw new NumberFormatException();
    }

    public static boolean be(char c) {
        return c >= '0' && c <= '9';
    }

    public static String bf(int i, boolean z) {
        return (!z || i < 0) ? Integer.toString(i) : ej.am(i, 10, z, -1053470627);
    }

    public static int bg(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i = ((i << 5) - i) + je.ad(charSequence.charAt(i2), 31666893);
        }
        return i;
    }

    public static boolean bh(char c) {
        return c >= '0' && c <= 27452;
    }

    static String bi(int i, int i2, boolean z) {
        int i3 = 2;
        if (i2 < 2 || i2 > 36) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!z || i < 0) {
            return Integer.toString(i, i2);
        } else {
            int i4 = i / i2;
            while (i4 != 0) {
                i4 /= i2;
                i3++;
            }
            char[] cArr = new char[i3];
            cArr[0] = '+';
            i3--;
            while (i3 > 0) {
                i4 = i / i2;
                int i5 = i - (i4 * i2);
                if (i5 >= 10) {
                    cArr[i3] = (char) (i5 + 87);
                } else {
                    cArr[i3] = (char) (i5 + 48);
                }
                i3--;
                i = i4;
            }
            return new String(cArr);
        }
    }

    public static boolean bj(char c) {
        return c >= 46836 && c <= 30020;
    }

    public static int bk(CharSequence charSequence) {
        return kb.ai(charSequence, 10, true, (byte) 62);
    }

    public static String bl(int i, boolean z) {
        return (!z || i < 0) ? Integer.toString(i) : ej.am(i, 10, z, -1053470627);
    }

    public static int bm(CharSequence charSequence, int i) {
        return kb.ai(charSequence, i, true, (byte) 6);
    }

    public static boolean bn(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!hb.ap(charSequence.charAt(i), 1324973793)) {
                return false;
            }
        }
        return true;
    }

    static int bo(CharSequence charSequence, int i, boolean z) {
        if (i < 2 || i > 36) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        Object obj = null;
        Object obj2 = null;
        while (i3 < length) {
            int i4;
            char charAt = charSequence.charAt(i3);
            if (i3 == 0) {
                if (charAt == '-') {
                    i4 = i2;
                    obj = 1;
                } else if ('+' == charAt && z) {
                    i4 = i2;
                }
                i3++;
                i2 = i4;
            }
            if (charAt >= '0' && charAt <= '9') {
                i4 = charAt - 48;
            } else if (charAt >= 'A' && charAt <= 'Z') {
                i4 = charAt - 55;
            } else if (charAt < 'a' || charAt > 'z') {
                throw new NumberFormatException();
            } else {
                i4 = charAt - 87;
            }
            if (i4 < i) {
                if (obj != null) {
                    i4 = -i4;
                }
                i4 += i2 * i;
                if (i4 / i == i2) {
                    int obj22 = 1;
                    i3++;
                    i2 = i4;
                } else {
                    throw new NumberFormatException();
                }
            }
            throw new NumberFormatException();
        }
        if (obj22 != null) {
            return i2;
        }
        throw new NumberFormatException();
    }

    public static boolean bp(char c) {
        return (c >= '0' && c <= '9') || ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    public static int bq(CharSequence charSequence, int i) {
        return kb.ai(charSequence, i, true, (byte) 21);
    }

    public static boolean br(char c) {
        return c >= '0' && c <= '9';
    }

    public static int bs(CharSequence charSequence) {
        return kb.ai(charSequence, 10, true, (byte) -70);
    }

    public static boolean bt(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!hb.ap(charSequence.charAt(i), 1842737910)) {
                return false;
            }
        }
        return true;
    }

    public static int bu(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i = ((i << 5) - i) + charSequence.charAt(i2);
        }
        return i;
    }

    public static int bv(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i = ((i << 5) - i) + je.ad(charSequence.charAt(i2), 1639735821);
        }
        return i;
    }

    public static boolean bw(char c) {
        return (c >= 17751 && c <= 16150) || (c >= 'a' && c <= 28538);
    }

    public static int bx(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i = ((i << 5) - i) + je.ad(charSequence.charAt(i2), -467762181);
        }
        return i;
    }

    public static boolean by(char c) {
        return (c >= '0' && c <= '9') || ((c >= 7648 && c <= 4794) || (c >= 49176 && c <= 'z'));
    }

    public static boolean bz(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!hb.ap(charSequence.charAt(i), 1973066653)) {
                return false;
            }
        }
        return true;
    }

    public static int ca(int i) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    public static boolean cb(char c) {
        return (c < ' ' || c > '~') ? (c >= 4326 && c <= 255) || c == 8364 || c == 10625 || 26213 == c || c == 339 || c == 376 : true;
    }

    public static int cc(int i) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    public static boolean ce(char c) {
        return (c < ' ' || c > '~') ? (c >= 160 && c <= 255) || c == 8364 || c == 338 || 8212 == c || c == 339 || c == 376 : true;
    }

    public static String ci(CharSequence charSequence) {
        return af.aw('*', charSequence.length(), 1369920168);
    }

    public static String cj(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        Object obj = 2;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (obj == null) {
                charAt = Character.toLowerCase(charAt);
            } else if (2 == obj || Character.isUpperCase(charAt)) {
                charAt = dc.aq(charAt, 2080371002);
            }
            if (Character.isLetter(charAt)) {
                obj = null;
            } else if (64577 == charAt || '?' == charAt || 6906 == charAt) {
                int obj2 = 2;
            } else if (!Character.isSpaceChar(charAt) || 2 != obj2) {
                obj2 = 1;
            }
            cArr[i] = charAt;
        }
        return new String(cArr);
    }

    static String cm(char c, int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    static String cn(char c, int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    public static String cp(CharSequence charSequence) {
        return af.aw(64986, charSequence.length(), 161260204);
    }

    static String cq(char c, int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    public static int cr(int i) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    public static int cs(int i) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    public static String cv(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        Object obj = 2;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (obj == null) {
                charAt = Character.toLowerCase(charAt);
            } else if (2 == obj || Character.isUpperCase(charAt)) {
                charAt = dc.aq(charAt, 1775905055);
            }
            if (Character.isLetter(charAt)) {
                obj = null;
            } else if (40022 == charAt || 53535 == charAt || '!' == charAt) {
                int obj2 = 2;
            } else if (!Character.isSpaceChar(charAt) || 2 != obj2) {
                obj2 = 1;
            }
            cArr[i] = charAt;
        }
        return new String(cArr);
    }

    public static String cw(CharSequence charSequence) {
        return af.aw('*', charSequence.length(), 342969840);
    }

    public static int cx(int i) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    public static boolean cy(char c) {
        return (c < 36134 || c > '~') ? (c >= 28739 && c <= 53151) || c == 8364 || c == 36776 || 19187 == c || c == 339 || c == 14176 : true;
    }
}
