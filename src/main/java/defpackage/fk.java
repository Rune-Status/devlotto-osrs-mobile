package defpackage;

/* renamed from: fk */
public class fk {
    static ee aa = null;
    static final int ad = 0;
    static byte[][][] ai = null;
    public static final byte aq = (byte) 1;
    public static final byte ar = (byte) 2;
    static final int di = 5;

    fk() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fk.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, kh khVar2, kh khVar3, int i) {
        try {
            ce.ad = khVar;
            dp.aq = khVar2;
            dp.ar = khVar3;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fk.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final int ep(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < client.er.length) {
                    return client.er[i];
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fk.ep(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return -1;
    }
}
