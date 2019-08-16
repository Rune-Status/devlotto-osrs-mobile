package defpackage;

import java.util.Collection;

/* renamed from: lq */
public class lq {
    public static final lq ad = new lq("p11_full");
    public static final lq ai = new lq("verdana_15pt_regular");
    public static final lq aj = new lq("verdana_13pt_regular");
    public static final lq al = new lq("verdana_11pt_regular");
    public static final lq aq = new lq("p12_full");
    public static final lq ar = new lq("b12_full");
    static final int av = 1000;
    public static final int bs = 29;
    static int[] ea;
    String ae;

    lq(String str) {
        try {
            this.ae = str;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lq.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ac(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        int i7 = i2;
        int i8 = i;
        for (int i9 = -i4; i9 < 0; i9++) {
            int i10 = (i7 + i3) - 3;
            while (i7 < i10) {
                int i11 = i7 + 1;
                int i12 = i8 + 1;
                iArr[i7] = iArr2[i8];
                i8 = i11 + 1;
                i7 = i12 + 1;
                iArr[i11] = iArr2[i12];
                i11 = i8 + 1;
                i12 = i7 + 1;
                iArr[i8] = iArr2[i7];
                i7 = i11 + 1;
                i8 = i12 + 1;
                iArr[i11] = iArr2[i12];
            }
            while (i7 < i10 + 3) {
                iArr[i7] = iArr2[i8];
                i7++;
                i8++;
            }
            i7 += i5;
            i8 += i6;
        }
    }

    public static lq[] ad(int i) {
        try {
            lq lqVar = aq;
            lq lqVar2 = ar;
            lq lqVar3 = al;
            lq lqVar4 = aj;
            lq lqVar5 = ad;
            lq lqVar6 = ai;
            return new lq[]{lqVar, lqVar2, lqVar3, lqVar4, lqVar5, lqVar6};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lq.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aj(Collection collection, int i) {
        try {
            collection.add(do.aq);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lq.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static lq[] aq() {
        return new lq[]{aq, ar, al, aj, ad, ai};
    }
}
