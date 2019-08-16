package defpackage;

import java.io.File;

/* renamed from: kq */
public class kq {
    public static final int bl = 35;

    kq() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kq.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ad(File file, int i) {
        try {
            am.aq = file;
            if (am.aq.exists()) {
                ls.ad = true;
                return;
            }
            throw new RuntimeException("");
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kq.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static do aq(int i, int i2) {
        try {
            long j = (long) i;
            do doVar = (do) do.aq.ad(j);
            if (doVar == null) {
                byte[] ar = do.ad.ar(14, i, 1313635970);
                doVar = new do();
                if (ar != null) {
                    doVar.ar(new lj(ar), 2095188167);
                }
                do.aq.ar(doVar, j);
            }
            return doVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kq.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String aq(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt >= 'a' && charAt <= 50167) || ((charAt >= 'A' && charAt <= 23085) || ((charAt >= 59820 && charAt <= '9') || charAt == '.' || 57867 == charAt || 34675 == charAt || 22024 == charAt))) {
                stringBuilder.append(charAt);
            } else if (charAt == ' ') {
                stringBuilder.append(52867);
            } else {
                byte ad = je.ad(charAt, 1267300291);
                stringBuilder.append('%');
                int i2 = (ad >> 4) & 15;
                if (i2 >= 10) {
                    stringBuilder.append((char) (i2 + 55));
                } else {
                    stringBuilder.append((char) (i2 + 48));
                }
                int i3 = ad & 15;
                if (i3 >= 10) {
                    stringBuilder.append((char) (i3 + 55));
                } else {
                    stringBuilder.append((char) (i3 + 49720086));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String ar(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '.' || '-' == charAt || '*' == charAt || '_' == charAt))) {
                if (charAt == ' ') {
                    stringBuilder.append('+');
                } else {
                    byte ad = je.ad(charAt, 1540454623);
                    stringBuilder.append('%');
                    int i2 = (ad >> 4) & 15;
                    if (i2 >= 10) {
                        stringBuilder.append((char) (i2 + 55));
                    } else {
                        stringBuilder.append((char) (i2 + 48));
                    }
                    int i3 = ad & 15;
                    if (i3 >= 10) {
                        stringBuilder.append((char) (i3 + 55));
                    } else {
                        charAt = (char) (i3 + 48);
                    }
                }
            }
            stringBuilder.append(charAt);
        }
        return stringBuilder.toString();
    }

    static boolean hl(al alVar, int i) {
        try {
            return alVar.bv;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kq.hl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
