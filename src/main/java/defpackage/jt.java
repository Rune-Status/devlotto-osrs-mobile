package defpackage;

import java.util.Hashtable;

/* renamed from: jt */
public class jt {
    static final int ai = 50;
    public Hashtable ad;
    public Hashtable aq;
    Hashtable ar;

    jt(String str) {
        try {
            this.ad = new Hashtable();
            this.aq = new Hashtable();
            this.ar = new Hashtable();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jt.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ai(String str, int i) {
        if (str != null) {
            try {
                if (!(str.isEmpty() || str.charAt(0) == '#')) {
                    return str;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jt.ai(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return "";
    }

    static String aq(byte[] bArr, int i, int i2, int i3) {
        StringBuilder stringBuilder;
        try {
            stringBuilder = new StringBuilder();
            for (int i4 = i; i4 < i2 + i; i4 += 3) {
                int i5 = bArr[i4] & 255;
                stringBuilder.append(kf.ad[i5 >>> 2]);
                if (i4 < i2 - 1) {
                    int i6 = bArr[i4 + 1] & 255;
                    stringBuilder.append(kf.ad[((i5 & 3) << 4) | (i6 >>> 4)]);
                    if (i4 < i2 - 2) {
                        i5 = bArr[i4 + 2] & 255;
                        stringBuilder.append(kf.ad[((i6 & 15) << 2) | (i5 >>> 6)]);
                        stringBuilder.append(kf.ad[i5 & 63]);
                    } else {
                        stringBuilder.append(kf.ad[(i6 & 15) << 2]);
                        stringBuilder.append("=");
                    }
                } else {
                    stringBuilder.append(kf.ad[(i5 & 3) << 4]);
                    stringBuilder.append("==");
                }
            }
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("jt.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
