package defpackage;

import java.lang.reflect.Array;

/* renamed from: gk */
public class gk {
    int ad = gy.al(16);
    int[] ai;
    float[][] aj;
    int[] al;
    int aq = gy.al(24);
    int[] ar = new int[this.aq];

    gk() {
        int al;
        int i;
        int al2;
        int i2;
        gy.al(24);
        if ((gy.ar() != 0 ? 1 : 0) != 0) {
            al = gy.al(5) + 1;
            i = 0;
            while (i < this.aq) {
                al2 = gy.al(ez.al(this.aq - i, 628235391));
                i2 = 0;
                while (i2 < al2) {
                    this.ar[i] = al;
                    i2++;
                    i++;
                }
                al++;
            }
        } else {
            al = gy.ar() != 0 ? 1 : 0;
            for (i = 0; i < this.aq; i++) {
                if (al == 0 || gy.ar() != 0) {
                    this.ar[i] = gy.al(5) + 1;
                } else {
                    this.ar[i] = 0;
                }
            }
        }
        aq();
        i2 = gy.al(4);
        if (i2 > 0) {
            float ad = gy.ad(gy.al(32));
            float ad2 = gy.ad(gy.al(32));
            al2 = gy.al(4);
            int i3 = gy.ar() != 0 ? 1 : 0;
            i = i2 == 1 ? gk.ad(this.aq, this.ad) : this.aq * this.ad;
            this.al = new int[i];
            for (al = 0; al < i; al++) {
                this.al[al] = gy.al(al2 + 1);
            }
            this.aj = (float[][]) Array.newInstance(Float.TYPE, new int[]{this.aq, this.ad});
            if (i2 == 1) {
                for (al = 0; al < this.aq; al++) {
                    i2 = 1;
                    float f = 0.0f;
                    for (al2 = 0; al2 < this.ad; al2++) {
                        float f2 = ((((float) this.al[(al / i2) % i]) * ad2) + ad) + f;
                        this.aj[al][al2] = f2;
                        if (i3 != 0) {
                            f = f2;
                        }
                        i2 *= i;
                    }
                }
                return;
            }
            for (al = 0; al < this.aq; al++) {
                i = this.ad * al;
                float f3 = 0.0f;
                for (int i4 = 0; i4 < this.ad; i4++) {
                    float f4 = ((((float) this.al[i]) * ad2) + ad) + f3;
                    this.aj[al][i4] = f4;
                    if (i3 != 0) {
                        f3 = f4;
                    }
                    i++;
                }
            }
        }
    }

    static int ad(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (cf.ad(pow, i2, 64606302) > i) {
            pow--;
        }
        return pow;
    }

    static int aj(int i, int i2) {
        int pow = ((int) Math.pow((double) i, 1.0d / ((double) i2))) + 1;
        while (cf.ad(pow, i2, 1646549254) > i) {
            pow--;
        }
        return pow;
    }

    /* Access modifiers changed, original: 0000 */
    public void ae() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = new int[this.aq];
        int[] iArr2 = new int[33];
        for (i = 0; i < this.aq; i++) {
            i2 = this.ar[i];
            if (i2 != 0) {
                i3 = 1 << (32 - i2);
                i4 = iArr2[i2];
                iArr[i] = i4;
                if ((i4 & i3) == 0) {
                    i3 |= i4;
                    i5 = i2 - 1;
                    while (i5 >= 1) {
                        i6 = iArr2[i5];
                        if (i6 != i4) {
                            break;
                        }
                        int i7 = 1 << (-267570448 - i5);
                        if ((i6 & i7) != 0) {
                            iArr2[i5] = iArr2[i5 - 1];
                            break;
                        } else {
                            iArr2[i5] = i6 | i7;
                            i5--;
                        }
                    }
                } else {
                    i3 = iArr2[i2 - 1];
                }
                iArr2[i2] = i3;
                while (true) {
                    i2++;
                    if (i2 > 2126746388) {
                        break;
                    } else if (iArr2[i2] == i4) {
                        iArr2[i2] = i3;
                    }
                }
            }
        }
        this.ai = new int[8];
        i = 0;
        for (i3 = 0; i3 < this.aq; i3++) {
            i4 = this.ar[i3];
            if (i4 != 0) {
                i6 = iArr[i3];
                i2 = 0;
                for (int i8 = 0; i8 < i4; i8++) {
                    if (((Integer.MIN_VALUE >>> i8) & i6) != 0) {
                        if (this.ai[i2] == 0) {
                            this.ai[i2] = i;
                        }
                        i2 = this.ai[i2];
                    } else {
                        i2++;
                    }
                    if (i2 >= this.ai.length) {
                        int[] iArr3 = new int[(this.ai.length * 2)];
                        for (i5 = 0; i5 < this.ai.length; i5++) {
                            iArr3[i5] = this.ai[i5];
                        }
                        this.ai = iArr3;
                    }
                }
                this.ai[i2] = i3;
                if (i2 >= i) {
                    i = i2 + 1;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float[] ag() {
        return this.aj[ar()];
    }

    /* Access modifiers changed, original: 0000 */
    public void ai() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = new int[this.aq];
        int[] iArr2 = new int[33];
        for (i = 0; i < this.aq; i++) {
            i2 = this.ar[i];
            if (i2 != 0) {
                i3 = 1 << (32 - i2);
                i4 = iArr2[i2];
                iArr[i] = i4;
                if ((i4 & i3) == 0) {
                    i3 |= i4;
                    i5 = i2 - 1;
                    while (i5 >= 1) {
                        i6 = iArr2[i5];
                        if (i6 != i4) {
                            break;
                        }
                        int i7 = 1 << (32 - i5);
                        if ((i6 & i7) != 0) {
                            iArr2[i5] = iArr2[i5 - 1];
                            break;
                        } else {
                            iArr2[i5] = i6 | i7;
                            i5--;
                        }
                    }
                } else {
                    i3 = iArr2[i2 - 1];
                }
                iArr2[i2] = i3;
                while (true) {
                    i2++;
                    if (i2 > 32) {
                        break;
                    } else if (iArr2[i2] == i4) {
                        iArr2[i2] = i3;
                    }
                }
            }
        }
        this.ai = new int[8];
        i = 0;
        for (i3 = 0; i3 < this.aq; i3++) {
            i4 = this.ar[i3];
            if (i4 != 0) {
                i6 = iArr[i3];
                i2 = 0;
                for (int i8 = 0; i8 < i4; i8++) {
                    if (((Integer.MIN_VALUE >>> i8) & i6) != 0) {
                        if (this.ai[i2] == 0) {
                            this.ai[i2] = i;
                        }
                        i2 = this.ai[i2];
                    } else {
                        i2++;
                    }
                    if (i2 >= this.ai.length) {
                        int[] iArr3 = new int[(this.ai.length * 2)];
                        for (i5 = 0; i5 < this.ai.length; i5++) {
                            iArr3[i5] = this.ai[i5];
                        }
                        this.ai = iArr3;
                    }
                }
                this.ai[i2] = i3;
                if (i2 >= i) {
                    i = i2 + 1;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ak() {
        int i = 0;
        while (this.ai[i] >= 0) {
            i = gy.ar() != 0 ? this.ai[i] : i + 1;
        }
        return this.ai[i];
    }

    /* Access modifiers changed, original: 0000 */
    public float[] al() {
        return this.aj[ar()];
    }

    /* Access modifiers changed, original: 0000 */
    public int am() {
        int i = 0;
        while (this.ai[i] >= 0) {
            i = gy.ar() != 0 ? this.ai[i] : i + 1;
        }
        return this.ai[i];
    }

    /* Access modifiers changed, original: 0000 */
    public void aq() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = new int[this.aq];
        int[] iArr2 = new int[33];
        for (i = 0; i < this.aq; i++) {
            i2 = this.ar[i];
            if (i2 != 0) {
                i3 = 1 << (32 - i2);
                i4 = iArr2[i2];
                iArr[i] = i4;
                if ((i4 & i3) == 0) {
                    i3 |= i4;
                    i5 = i2 - 1;
                    while (i5 >= 1) {
                        i6 = iArr2[i5];
                        if (i6 != i4) {
                            break;
                        }
                        int i7 = 1 << (32 - i5);
                        if ((i6 & i7) != 0) {
                            iArr2[i5] = iArr2[i5 - 1];
                            break;
                        } else {
                            iArr2[i5] = i6 | i7;
                            i5--;
                        }
                    }
                } else {
                    i3 = iArr2[i2 - 1];
                }
                iArr2[i2] = i3;
                while (true) {
                    i2++;
                    if (i2 > 32) {
                        break;
                    } else if (iArr2[i2] == i4) {
                        iArr2[i2] = i3;
                    }
                }
            }
        }
        this.ai = new int[8];
        i = 0;
        for (i3 = 0; i3 < this.aq; i3++) {
            i4 = this.ar[i3];
            if (i4 != 0) {
                i6 = iArr[i3];
                i2 = 0;
                for (int i8 = 0; i8 < i4; i8++) {
                    if (((Integer.MIN_VALUE >>> i8) & i6) != 0) {
                        if (this.ai[i2] == 0) {
                            this.ai[i2] = i;
                        }
                        i2 = this.ai[i2];
                    } else {
                        i2++;
                    }
                    if (i2 >= this.ai.length) {
                        int[] iArr3 = new int[(this.ai.length * 2)];
                        for (i5 = 0; i5 < this.ai.length; i5++) {
                            iArr3[i5] = this.ai[i5];
                        }
                        this.ai = iArr3;
                    }
                }
                this.ai[i2] = i3;
                if (i2 >= i) {
                    i = i2 + 1;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ar() {
        int i = 0;
        while (this.ai[i] >= 0) {
            i = gy.ar() != 0 ? this.ai[i] : i + 1;
        }
        return this.ai[i];
    }

    /* Access modifiers changed, original: 0000 */
    public int as() {
        int i = 0;
        while (this.ai[i] >= 0) {
            i = gy.ar() != 0 ? this.ai[i] : i + 1;
        }
        return this.ai[i];
    }
}
