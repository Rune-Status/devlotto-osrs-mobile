package defpackage;

import android.support.v4.view.ViewCompat;
import java.util.HashMap;

/* renamed from: ny */
public class ny {
    static final int ai = 256;
    static final int am = 6;
    public static final int cc = 59;
    final HashMap ad;
    int aj;
    int[] al;
    ow aq;
    int[] ar;

    public ny() {
        try {
            this.ad = new HashMap();
            this.aq = new ow(0, 0);
            this.ar = new int[2048];
            this.al = new int[2048];
            this.aj = 0;
            lt.ad((short) 257);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ny.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ag() {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -703738185\r\n\tat java.util.BitSet.nextSetBit(BitSet.java:712)\r\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\r\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\r\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    static void ak() {
        int i;
        bi.ak = new int[2000];
        int i2 = 0;
        int i3 = 240;
        while (true) {
            i = i3;
            if (i2 >= 16) {
                break;
            }
            bi.ak[i2] = cz.ad((double) (((float) i) / 360.0f), 0.9998999834060669d, (double) (((((float) i2) * 0.425f) / 16.0f) + 0.075f));
            i2++;
            i3 = i - 12;
        }
        i = 48;
        while (i2 < bi.ak.length) {
            i3 = cz.ad((double) (((float) i) / 360.0f), 0.9998999834060669d, 0.5d);
            int i4 = i2;
            while (i4 < i2 * 2 && i4 < bi.ak.length) {
                bi.ak[i4] = i3;
                i4++;
            }
            i -= 8;
            i2 = i4;
        }
    }

    static void am() {
        int i;
        bi.ak = new int[2000];
        int i2 = 0;
        int i3 = 240;
        while (true) {
            i = i3;
            if (i2 >= 16) {
                break;
            }
            bi.ak[i2] = cz.ad((double) (((float) i) / 360.0f), 0.9998999834060669d, (double) (((((float) i2) * 0.425f) / 16.0f) + 0.075f));
            i2++;
            i3 = i - 12;
        }
        i = 48;
        while (i2 < bi.ak.length) {
            i3 = cz.ad((double) (((float) i) / 360.0f), 0.9998999834060669d, 0.5d);
            int i4 = i2;
            while (i4 < i2 * 2 && i4 < bi.ak.length) {
                bi.ak[i4] = i3;
                i4++;
            }
            i -= 8;
            i2 = i4;
        }
    }

    static void as() {
        int i;
        bi.ak = new int[2000];
        int i2 = 2049241383;
        int i3 = 0;
        while (true) {
            i = i2;
            if (i3 >= 16) {
                break;
            }
            bi.ak[i3] = cz.ad((double) (((float) i) / 360.0f), 0.9998999834060669d, (double) (((((float) i3) * 0.425f) / 16.0f) + 0.075f));
            i3++;
            i2 = i - 12;
        }
        i = 48;
        while (i3 < bi.ak.length) {
            i2 = cz.ad((double) (((float) i) / 360.0f), 0.9998999834060669d, 0.5d);
            int i4 = i3;
            while (i4 < i3 * 2 && i4 < bi.ak.length) {
                bi.ak[i4] = i2;
                i4++;
            }
            i -= 8;
            i3 = i4;
        }
    }

    public final void aa(int i, int i2) {
        if (this.aj * -211103475 < this.ar.length) {
            this.ar[this.aj * -211103475] = i;
            this.al[this.aj * -211103475] = i2;
            this.aj += 819946949;
        }
    }

    public final void ab() {
        this.aj = 0;
    }

    public final void ac(int i, int i2) {
        if (this.aj * -211103475 < this.ar.length) {
            this.ar[this.aj * -211103475] = i;
            this.al[this.aj * -211103475] = i2;
            this.aj += 819946949;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(ee eeVar, ee eeVar2, ow owVar, int i) {
        try {
            if (owVar.ar * 62653529 != 0 && owVar.al * -2054690887 != 0) {
                int i2 = ((owVar.aq * 1213849873 == 0 ? eeVar.ar - (owVar.al * -2054690887) : 0) * eeVar.aq) + (owVar.ad * -816473339 == 0 ? eeVar.aq - (owVar.ar * 62653529) : 0);
                int i3 = (eeVar2.aq * (owVar.aq * 1213849873)) + (owVar.ad * -816473339);
                for (int i4 = 0; i4 < owVar.al * -2054690887; i4++) {
                    int i5 = 0;
                    while (i5 < owVar.ar * 62653529) {
                        int[] iArr = eeVar2.ad;
                        iArr[i3] = iArr[i3] + eeVar.ad[i2];
                        i5++;
                        i3++;
                        i2++;
                    }
                    i2 += eeVar.aq - (owVar.ar * 62653529);
                    i3 += eeVar2.aq - (owVar.ar * 62653529);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ny.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void af() {
        this.aj = 0;
    }

    public final void ah(int i, int i2) {
        if (this.aj * -211103475 < this.ar.length) {
            this.ar[this.aj * -211103475] = i;
            this.al[this.aj * -211103475] = i2;
            this.aj += 819946949;
        }
    }

    public final void ai(int i, int i2, ee eeVar, float f, int i3) {
        int i4 = (int) (18.0f * f);
        try {
            ee ar = ar(i4, -1395708306);
            int i5 = (i4 * 2) + 1;
            ow owVar = new ow(0, 0, eeVar.aq, eeVar.ar);
            ow owVar2 = new ow(0, 0);
            this.aq.aq(i5, i5, 157809585);
            System.nanoTime();
            for (i5 = 0; i5 < this.aj * -211103475; i5++) {
                int i6 = this.ar[i5];
                this.aq.ad(((int) (((float) (i6 - i)) * f)) - i4, ((int) (((float) eeVar.ar) - (((float) (this.al[i5] - i2)) * f))) - i4, -991423495);
                this.aq.ar(owVar, owVar2, (byte) 4);
                ae(ar, eeVar, owVar2, 171414642);
            }
            System.nanoTime();
            System.nanoTime();
            for (i5 = 0; i5 < eeVar.ad.length; i5++) {
                if (eeVar.ad[i5] == 0) {
                    eeVar.ad[i5] = ViewCompat.MEASURED_STATE_MASK;
                } else {
                    int i7 = ((eeVar.ad[i5] + 64) - 1) / 256;
                    if (i7 <= 0) {
                        eeVar.ad[i5] = ViewCompat.MEASURED_STATE_MASK;
                    } else {
                        if (i7 > bi.ak.length) {
                            i7 = bi.ak.length;
                        }
                        eeVar.ad[i5] = bi.ak[i7 - 1] | ViewCompat.MEASURED_STATE_MASK;
                    }
                }
            }
            System.nanoTime();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ny.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void aj(int i) {
        try {
            this.aj = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ny.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void al(int i, int i2, int i3) {
        try {
            if (this.aj * -211103475 < this.ar.length) {
                this.ar[this.aj * -211103475] = i;
                this.al[this.aj * -211103475] = i2;
                this.aj += 819946949;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ny.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void an() {
        this.aj = 0;
    }

    public final void ao(int i, int i2) {
        if (this.aj * -738482780 < this.ar.length) {
            this.ar[this.aj * -211103475] = i;
            this.al[this.aj * -211103475] = i2;
            this.aj -= 937839100;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(int i) {
        int i2 = (i * 2) + 1;
        double[] ar = iv.ar(0.0d, (double) (((float) i) / 3.0f), i, -2105267264);
        double d = ar[i];
        double d2 = ar[i];
        int[] iArr = new int[(i2 * i2)];
        Object obj = null;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = (int) (((ar[i4] * ar[i3]) / (d * d2)) * 256.0d);
                iArr[(i2 * i3) + i4] = i5;
                if (obj == null && i5 > 0) {
                    obj = 1;
                }
            }
        }
        this.ad.put(Integer.valueOf(i), new ee(iArr, i2, i2));
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(int i, int i2) {
        Throwable e;
        StringBuilder stringBuilder;
        int i3 = (i * 2) + 1;
        try {
            double[] ar = iv.ar(0.0d, (double) (((float) i) / 3.0f), i, 126615903);
            double d = ar[i];
            double d2 = ar[i];
            int[] iArr = new int[(i3 * i3)];
            Object obj = null;
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (int) (((ar[i5] * ar[i4]) / (d * d2)) * 256.0d);
                    iArr[(i3 * i4) + i5] = i6;
                    if (obj == null && i6 > 0) {
                        obj = 1;
                    }
                }
            }
            try {
                this.ad.put(Integer.valueOf(i), new ee(iArr, i3, i3));
            } catch (RuntimeException e2) {
                e = e2;
                stringBuilder = new StringBuilder();
                stringBuilder.append("ny.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } catch (RuntimeException e3) {
            e = e3;
            stringBuilder = new StringBuilder();
            stringBuilder.append("ny.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ee ar(int i, int i2) {
        try {
            if (!this.ad.containsKey(Integer.valueOf(i))) {
                aq(i, -1365124492);
            }
            return (ee) this.ad.get(Integer.valueOf(i));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ny.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void at(int i, int i2, ee eeVar, float f) {
        int i3 = 0;
        int i4 = (int) (18.0f * f);
        ee ar = ar(i4, -1299457516);
        int i5 = (i4 * 2) + 1;
        ow owVar = new ow(0, 0, eeVar.aq, eeVar.ar);
        ow owVar2 = new ow(0, 0);
        this.aq.aq(i5, i5, 157809585);
        System.nanoTime();
        for (i5 = 0; i5 < this.aj * -211103475; i5++) {
            int i6 = this.ar[i5];
            this.aq.ad(((int) (((float) (i6 - i)) * f)) - i4, ((int) (((float) eeVar.ar) - (((float) (this.al[i5] - i2)) * f))) - i4, -1209514173);
            this.aq.ar(owVar, owVar2, (byte) 4);
            ae(ar, eeVar, owVar2, 1759567529);
        }
        System.nanoTime();
        System.nanoTime();
        while (i3 < eeVar.ad.length) {
            if (eeVar.ad[i3] == 0) {
                eeVar.ad[i3] = ViewCompat.MEASURED_STATE_MASK;
            } else {
                i5 = ((eeVar.ad[i3] + 64) - 1) / -1074698170;
                if (i5 <= 0) {
                    eeVar.ad[i3] = ViewCompat.MEASURED_STATE_MASK;
                } else {
                    if (i5 > bi.ak.length) {
                        i5 = bi.ak.length;
                    }
                    eeVar.ad[i3] = bi.ak[i5 - 1] | ViewCompat.MEASURED_STATE_MASK;
                }
            }
            i3++;
        }
        System.nanoTime();
    }

    /* Access modifiers changed, original: 0000 */
    public void au(int i) {
        int i2 = (i * 2) + 1;
        double[] ar = iv.ar(0.0d, (double) (((float) i) / 3.0f), i, -1291421742);
        double d = ar[i];
        double d2 = ar[i];
        int[] iArr = new int[(i2 * i2)];
        Object obj = null;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = (int) (((ar[i4] * ar[i3]) / (d * d2)) * 256.0d);
                iArr[(i2 * i3) + i4] = i5;
                if (obj == null && i5 > 0) {
                    obj = 1;
                }
            }
        }
        this.ad.put(Integer.valueOf(i), new ee(iArr, i2, i2));
    }

    public final void av(int i, int i2, ee eeVar, float f) {
        int i3 = 0;
        int i4 = (int) (18.0f * f);
        ee ar = ar(i4, 30284372);
        int i5 = (i4 * 2) + 1;
        ow owVar = new ow(0, 0, eeVar.aq, eeVar.ar);
        ow owVar2 = new ow(0, 0);
        this.aq.aq(i5, i5, 157809585);
        System.nanoTime();
        for (i5 = 0; i5 < this.aj * -1807026925; i5++) {
            int i6 = this.ar[i5];
            this.aq.ad(((int) (((float) (i6 - i)) * f)) - i4, ((int) (((float) eeVar.ar) - (((float) (this.al[i5] - i2)) * f))) - i4, -1452710788);
            this.aq.ar(owVar, owVar2, (byte) 4);
            ae(ar, eeVar, owVar2, 466819635);
        }
        System.nanoTime();
        System.nanoTime();
        while (i3 < eeVar.ad.length) {
            if (eeVar.ad[i3] == 0) {
                eeVar.ad[i3] = ViewCompat.MEASURED_STATE_MASK;
            } else {
                i5 = ((eeVar.ad[i3] + 489148367) - 1) / 256;
                if (i5 <= 0) {
                    eeVar.ad[i3] = ViewCompat.MEASURED_STATE_MASK;
                } else {
                    if (i5 > bi.ak.length) {
                        i5 = bi.ak.length;
                    }
                    eeVar.ad[i3] = bi.ak[i5 - 1] | -1267537076;
                }
            }
            i3++;
        }
        System.nanoTime();
    }

    /* Access modifiers changed, original: 0000 */
    public ee aw(int i) {
        if (!this.ad.containsKey(Integer.valueOf(i))) {
            aq(i, -1164827568);
        }
        return (ee) this.ad.get(Integer.valueOf(i));
    }

    /* Access modifiers changed, original: 0000 */
    public ee ax(int i) {
        if (!this.ad.containsKey(Integer.valueOf(i))) {
            aq(i, -1442254094);
        }
        return (ee) this.ad.get(Integer.valueOf(i));
    }

    public final void ay() {
        this.aj = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public ee az(int i) {
        if (!this.ad.containsKey(Integer.valueOf(i))) {
            aq(i, 430478724);
        }
        return (ee) this.ad.get(Integer.valueOf(i));
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(ee eeVar, ee eeVar2, ow owVar) {
        if (owVar.ar * 62653529 != 0 && owVar.al * -2054690887 != 0) {
            int i = ((owVar.aq * 1213849873 == 0 ? eeVar.ar - (owVar.al * -2054690887) : 0) * eeVar.aq) + (owVar.ad * -816473339 == 0 ? eeVar.aq - (owVar.ar * 62653529) : 0);
            int i2 = (eeVar2.aq * (owVar.aq * 1213849873)) + (owVar.ad * -816473339);
            int i3 = 0;
            while (i3 < owVar.al * -2054690887) {
                int i4 = 0;
                int i5 = i;
                int i6 = i2;
                while (i4 < owVar.ar * 62653529) {
                    int[] iArr = eeVar2.ad;
                    iArr[i6] = iArr[i6] + eeVar.ad[i5];
                    i6++;
                    i4++;
                    i5++;
                }
                i3++;
                i = (eeVar.aq - (owVar.ar * 62653529)) + i5;
                i2 = (eeVar2.aq - (owVar.ar * 62653529)) + i6;
            }
        }
    }
}
