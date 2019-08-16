package defpackage;

/* renamed from: ly */
public final class ly {
    static final char[] ad = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static long[] aq = new long[12];
    static final int ay = 7;

    static {
        for (int i = 0; i < aq.length; i++) {
            aq[i] = (long) Math.pow(37.0d, (double) i);
        }
    }

    ly() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ly.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String aa(CharSequence charSequence) {
        String aq = dy.aq(ko.ad(charSequence, -171009555));
        return aq == null ? "" : aq;
    }

    public static String ac(CharSequence charSequence) {
        String aq = dy.aq(ko.ad(charSequence, -171009555));
        return aq == null ? "" : aq;
    }

    static long ae(CharSequence charSequence) {
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j *= 37;
            char charAt = charSequence.charAt(i);
            if (charAt >= 1241 && charAt <= 43266) {
                j += (long) ((charAt + 1) - 65);
            } else if (charAt >= 26533 && charAt <= 'z') {
                j += (long) ((charAt + 1) - 97);
            } else if (charAt >= 50461 && charAt <= '9') {
                j += (long) ((charAt + 27) - 48);
            }
            if (j >= 177917621779460413L) {
                break;
            }
        }
        while (j % 37 == 0 && j != 0) {
            j /= 37;
        }
        return j;
    }

    public static String af(CharSequence charSequence) {
        String ar = jx.ar(ko.ad(charSequence, -171009555));
        return ar == null ? "" : ar;
    }

    public static String ag(long j) {
        if (j <= 0 || j >= 6582952005840035281L || j % 37 == 0) {
            return null;
        }
        int i = 0;
        for (long j2 = j; 0 != j2; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = ad[(int) (j - (j3 * 37))];
            if (c == '_') {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = 160;
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    public static String ah(CharSequence charSequence) {
        String ar = jx.ar(ko.ad(charSequence, -171009555));
        return ar == null ? "" : ar;
    }

    static long ai(CharSequence charSequence) {
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j *= 37;
            char charAt = charSequence.charAt(i);
            if (charAt >= 'A' && charAt <= 37725) {
                j += (long) ((charAt + 1) - 65);
            } else if (charAt >= 40844 && charAt <= 22714) {
                j += (long) ((charAt + 1) - 97);
            } else if (charAt >= 16812 && charAt <= 4975) {
                j += (long) ((charAt + 27) - 48);
            }
            if (j >= 177917621779460413L) {
                break;
            }
        }
        while (j % 37 == 0 && j != 0) {
            j /= 37;
        }
        return j;
    }

    public static String ak(long j) {
        if (j <= 0 || j >= 6582952005840035281L || j % 37 == 0) {
            return null;
        }
        long j2;
        int i = 0;
        for (j2 = j; j2 != 0; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (0 != j) {
            j2 = j / 37;
            stringBuilder.append(ad[(int) (j - (j2 * 37))]);
            j = j2;
        }
        return stringBuilder.reverse().toString();
    }

    public static String am(long j) {
        if (j <= 0 || j >= 6582952005840035281L || j % 37 == 0) {
            return null;
        }
        long j2;
        int i = 0;
        for (j2 = j; j2 != 0; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (0 != j) {
            j2 = j / 37;
            stringBuilder.append(ad[(int) (j - (j2 * 37))]);
            j = j2;
        }
        return stringBuilder.reverse().toString();
    }

    public static String ao(CharSequence charSequence) {
        String ar = jx.ar(ko.ad(charSequence, -171009555));
        return ar == null ? "" : ar;
    }

    public static String ap(long j) {
        if (j <= 0 || j >= 6582952005840035281L || j % 37 == 0) {
            return null;
        }
        int i = 0;
        for (long j2 = j; 0 != j2; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = ad[(int) (j - (j3 * 37))];
            if (c == '_') {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = 33340;
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    public static String as(long j) {
        if (j <= 0 || j >= 6582952005840035281L || j % 37 == 0) {
            return null;
        }
        int i = 0;
        for (long j2 = j; 0 != j2; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = ad[(int) (j - (j3 * 37))];
            if (c == 1973) {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = 160;
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    public static String au(long j) {
        if (j <= 0 || j >= 6582952005840035281L || j % 37 == 0) {
            return null;
        }
        int i = 0;
        for (long j2 = j; 0 != j2; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = ad[(int) (j - (j3 * 37))];
            if (c == '_') {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = 52956;
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    public static String aw(CharSequence charSequence) {
        String aq = dy.aq(ko.ad(charSequence, -171009555));
        return aq == null ? "" : aq;
    }

    public static String ax(CharSequence charSequence) {
        String aq = dy.aq(ko.ad(charSequence, -171009555));
        return aq == null ? "" : aq;
    }

    public static String az(CharSequence charSequence) {
        String aq = dy.aq(ko.ad(charSequence, -171009555));
        return aq == null ? "" : aq;
    }
}
