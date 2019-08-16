package defpackage;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;

/* renamed from: fl */
public class fl {
    public static final int ad = 25;
    static final int an = 19136770;
    public static final boolean[] aq = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
    public static int[] ar = new int[99];
    static final int bj = 5;
    public static final int bw = 55;
    static int mp;

    static {
        int i = 0;
        int i2 = 0;
        while (i2 < 99) {
            int i3 = i2 + 1;
            double d = (double) i3;
            i += (int) (d + (Math.pow(2.0d, d / 7.0d) * 300.0d));
            ar[i2] = i / 4;
            i2 = i3;
        }
    }

    fl() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fl.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int aa(int i, hw hwVar, boolean z, int i2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:244)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    public static int ao(int i, int i2) {
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }

    public static void aq(int i, int i2, byte b) {
        try {
            do aq = kq.aq(i, 1693511307);
            int i3 = aq.ar * -691049261;
            int i4 = aq.al * 216187991;
            int i5 = aj.ad[(aq.aj * 311003969) - i4];
            if (i2 < 0 || i2 > i5) {
                i2 = 0;
            }
            i5 <<= i4;
            aj.ar[i3] = (i5 & aj.ar[i3]) | ((i2 << i4) & i5);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fl.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void cu(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (i11 >= 255) {
            try {
                ea.an(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, i8, i9, i10, (byte) -53);
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fl.cu(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        int i13 = 255 - i11;
        int i14 = i11 << 24;
        int i15 = i4;
        for (int i16 = -i7; i16 < 0; i16++) {
            int i17 = i2;
            int i18 = -i6;
            while (i18 < 0) {
                int i19;
                int i20 = iArr2[(i17 >> 16) + ((i3 >> 16) * i10)];
                if (i20 != 0) {
                    i19 = iArr[i15];
                    if (i19 == 0) {
                        i19 = i15 + 1;
                        iArr[i15] = (i20 & ViewCompat.MEASURED_SIZE_MASK) | i14;
                    } else {
                        i20 = (((i20 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i11) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i19) * i13)) & 16711680;
                        iArr[i15] = ((i19 | i14) & ViewCompat.MEASURED_STATE_MASK) | ((i20 + ((((16711935 & i19) * i13) + ((16711935 & i20) * i11)) & -16711936)) >>> 8);
                        i19 = i15 + 1;
                    }
                } else {
                    i19 = i15 + 1;
                }
                i17 += i8;
                i18++;
                i15 = i19;
            }
            i3 += i9;
            i15 += i5;
        }
    }
}
