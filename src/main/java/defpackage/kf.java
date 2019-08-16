package defpackage;

/* renamed from: kf */
public class kf {
    static char[] ad = new char[64];
    static int[] al = new int[128];
    static char[] aq = new char[64];
    static char[] ar = new char[64];
    public static final int ck = 91;

    static {
        int i;
        int i2 = 0;
        int i3 = 52;
        int i4 = 26;
        for (i = 0; i < 26; i++) {
            ad[i] = (char) (i + 65);
        }
        for (i = 26; i < 52; i++) {
            ad[i] = (char) ((i + 97) - 26);
        }
        for (i = 52; i < 62; i++) {
            ad[i] = (char) ((i + 48) - 52);
        }
        ad[62] = '+';
        ad[63] = '/';
        for (i = 0; i < 26; i++) {
            aq[i] = (char) (i + 65);
        }
        for (i = 26; i < 52; i++) {
            aq[i] = (char) ((i + 97) - 26);
        }
        for (i = 52; i < 62; i++) {
            aq[i] = (char) ((i + 48) - 52);
        }
        aq[62] = '*';
        aq[63] = '-';
        for (i = 0; i < 26; i++) {
            ar[i] = (char) (i + 65);
        }
        while (i4 < 52) {
            ar[i4] = (char) ((i4 + 97) - 26);
            i4++;
        }
        while (i3 < 62) {
            ar[i3] = (char) ((i3 + 48) - 52);
            i3++;
        }
        ar[62] = '-';
        ar[63] = '_';
        while (i2 < al.length) {
            al[i2] = -1;
            i2++;
        }
        for (i2 = 65; i2 <= 90; i2++) {
            al[i2] = i2 - 65;
        }
        for (i2 = 97; i2 <= 122; i2++) {
            al[i2] = (i2 - 97) + 26;
        }
        for (i2 = 48; i2 <= 57; i2++) {
            al[i2] = (i2 - 48) + 52;
        }
        int[] iArr = al;
        al[43] = 62;
        iArr[42] = 62;
        iArr = al;
        al[47] = 63;
        iArr[45] = 63;
    }

    kf() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kf.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String al(byte[] bArr) {
        return jt.aq(bArr, 0, bArr.length, 1568532868);
    }

    public static String ar(byte[] bArr) {
        return jt.aq(bArr, 0, bArr.length, -805020432);
    }
}
