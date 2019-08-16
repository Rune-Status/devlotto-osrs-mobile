package defpackage;

import android.support.v4.view.ViewCompat;

/* renamed from: fo */
public class fo {
    static final fo ad = new fo("LIVE", 0);
    public static final int af = 16777216;
    static final fo al = new fo("WIP", 2);
    public static final int am = 8;
    public static final int ap = 56;
    static final fo aq = new fo("BUILDLIVE", 3);
    static final fo ar = new fo("RC", 1);
    static final int as = 5;
    final int ai;
    public final String aj;

    fo(String str, int i) {
        try {
            this.aj = str;
            this.ai = 579227911 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fo.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(String[] strArr, short[] sArr, byte b) {
        try {
            ex.aq(strArr, sArr, 0, strArr.length - 1, 1625825142);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fo.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean ad(int i, int i2) {
        try {
            int[] iArr = fi.cs;
            for (int i3 : iArr) {
                if (i == i3) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fo.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static fo[] ae() {
        return new fo[]{aq, al, ad, ar};
    }

    static fo[] ai() {
        return new fo[]{aq, al, ad, ar};
    }

    static fo[] aj() {
        return new fo[]{aq, al, ad, ar};
    }

    static ip al(int i, int i2, int i3) {
        try {
            return ((ie) it.ad.get(Integer.valueOf(i))).aq(i2, 863865572);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fo.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static fo[] al() {
        return new fo[]{aq, al, ad, ar};
    }

    public static fo am(int i) {
        fo[] ad = er.ad(-2092527145);
        for (fo foVar : ad) {
            if (foVar.ai * -1028917871 == i) {
                return foVar;
            }
        }
        return null;
    }

    static fo[] ar() {
        return new fo[]{aq, al, ad, ar};
    }

    public static boolean az(char c, int i) {
        return (c >= '0' && c <= '9') || ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    static final int bl(int i, double d) {
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        try {
            return (((((int) (Math.pow(((double) ((i >> 16) & 255)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(d2, d) * 256.0d)) << 8)) + ((int) (Math.pow(((double) (i & 255)) / 256.0d, d) * 256.0d))) | (ViewCompat.MEASURED_STATE_MASK & i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fo.bl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
