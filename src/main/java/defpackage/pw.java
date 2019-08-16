package defpackage;

/* renamed from: pw */
public class pw {
    static final int ac = 5;
    public static final int ah = 67;

    pw() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pw.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ae(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int i3 = (i + i2) / 2;
            String str = strArr[i3];
            strArr[i3] = strArr[i2];
            strArr[i2] = str;
            short s = sArr[i3];
            sArr[i3] = sArr[i2];
            sArr[i2] = s;
            i3 = i;
            int i4 = i;
            while (i4 < i2) {
                if (str == null || (strArr[i4] != null && strArr[i4].compareTo(str) < (i4 & 1))) {
                    String str2 = strArr[i4];
                    strArr[i4] = strArr[i3];
                    strArr[i3] = str2;
                    short s2 = sArr[i4];
                    sArr[i4] = sArr[i3];
                    sArr[i3] = s2;
                    i3++;
                }
                i4++;
            }
            strArr[i2] = strArr[i3];
            strArr[i3] = str;
            sArr[i2] = sArr[i3];
            sArr[i3] = s;
            ex.aq(strArr, sArr, i, i3 - 1, 1713086794);
            ex.aq(strArr, sArr, i3 + 1, i2, 2043049524);
        }
    }

    static void ai(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int i3 = (i + i2) / 2;
            String str = strArr[i3];
            strArr[i3] = strArr[i2];
            strArr[i2] = str;
            short s = sArr[i3];
            sArr[i3] = sArr[i2];
            sArr[i2] = s;
            i3 = i;
            int i4 = i;
            while (i4 < i2) {
                if (str == null || (strArr[i4] != null && strArr[i4].compareTo(str) < (i4 & 1))) {
                    String str2 = strArr[i4];
                    strArr[i4] = strArr[i3];
                    strArr[i3] = str2;
                    short s2 = sArr[i4];
                    sArr[i4] = sArr[i3];
                    sArr[i3] = s2;
                    i3++;
                }
                i4++;
            }
            strArr[i2] = strArr[i3];
            strArr[i3] = str;
            sArr[i2] = sArr[i3];
            sArr[i3] = s;
            ex.aq(strArr, sArr, i, i3 - 1, 1382273503);
            ex.aq(strArr, sArr, i3 + 1, i2, -1500871116);
        }
    }

    public static void aj(String[] strArr, short[] sArr) {
        ex.aq(strArr, sArr, 0, strArr.length - 1, 1144366382);
    }

    public static void al(String[] strArr, short[] sArr) {
        ex.aq(strArr, sArr, 0, strArr.length - 1, -1633749938);
    }

    static void am(String[] strArr, short[] sArr, int i, int i2) {
        if (i < i2) {
            int i3 = (i + i2) / 2;
            String str = strArr[i3];
            strArr[i3] = strArr[i2];
            strArr[i2] = str;
            short s = sArr[i3];
            sArr[i3] = sArr[i2];
            sArr[i2] = s;
            i3 = i;
            int i4 = i;
            while (i4 < i2) {
                if (str == null || (strArr[i4] != null && strArr[i4].compareTo(str) < (i4 & 1))) {
                    String str2 = strArr[i4];
                    strArr[i4] = strArr[i3];
                    strArr[i3] = str2;
                    short s2 = sArr[i4];
                    sArr[i4] = sArr[i3];
                    sArr[i3] = s2;
                    i3++;
                }
                i4++;
            }
            strArr[i2] = strArr[i3];
            strArr[i3] = str;
            sArr[i2] = sArr[i3];
            sArr[i3] = s;
            ex.aq(strArr, sArr, i, i3 - 1, -1778602439);
            ex.aq(strArr, sArr, i3 + 1, i2, 280572457);
        }
    }

    public static void ar(String[] strArr, short[] sArr) {
        ex.aq(strArr, sArr, 0, strArr.length - 1, 570589924);
    }
}
