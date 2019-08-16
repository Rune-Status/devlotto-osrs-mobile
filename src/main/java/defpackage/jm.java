package defpackage;

/* renamed from: jm */
public class jm extends eo {
    public static final String aa = "wgahnagl";
    final boolean aq;

    public jm(boolean z) {
        try {
            this.aq = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jm.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void an(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, byte b) {
        int i10 = i3;
        for (int i11 = -i6; i11 < 0; i11++) {
            int i12 = i;
            int i13 = -i5;
            while (i13 < 0) {
                byte b2 = bArr[(i12 >> 16) + ((i2 >> 16) * i9)];
                if (b2 != (byte) 0) {
                    iArr[i10] = iArr2[b2 & 255];
                }
                i12 += i7;
                i13++;
                i10++;
            }
            i2 += i8;
            i10 += i4;
        }
    }

    public int ag(Object obj, Object obj2) {
        return ap((er) obj, (er) obj2, (byte) 66);
    }

    /* Access modifiers changed, original: 0000 */
    public int ap(er erVar, er erVar2, byte b) {
        try {
            return (erVar.aj * -356714521 == 0 || erVar2.aj * -356714521 == 0) ? aq(erVar, erVar2, 1416841416) : this.aq ? erVar.ae((byte) 1).ar(erVar2.ae((byte) 1), 828804812) : erVar2.ae((byte) 1).ar(erVar.ae((byte) 1), 828804812);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jm.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ap((er) obj, (er) obj2, (byte) 2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jm.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
