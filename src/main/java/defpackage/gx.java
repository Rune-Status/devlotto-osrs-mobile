package defpackage;

import java.lang.reflect.Array;

/* renamed from: gx */
public class gx {
    static int[][] ae = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{2, 8}));
    static final float ag = 8.0f;
    static float[][] ai = ((float[][]) Array.newInstance(Float.TYPE, new int[]{2, 8}));
    static int ak = 0;
    static float am = 0.0f;
    static final float ap = 32.703197f;
    static final int aq = 4;
    static final float as = 100.0f;
    int[] ad = new int[2];
    int[] aj = new int[2];
    int[][][] al = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{2, 2, 4}));
    int[][][] ar = ((int[][][]) Array.newInstance(Integer.TYPE, new int[]{2, 2, 4}));

    gx() {
    }

    static float ag(float f) {
        return ((((float) Math.pow(2.0d, (double) f)) * ap) * 3.1415927f) / 11025.0f;
    }

    static float ak(float f) {
        return ((((float) Math.pow(2.0d, (double) f)) * ap) * 3.1415927f) / 11025.0f;
    }

    static float aq(float f) {
        return ((((float) Math.pow(2.0d, (double) f)) * ap) * 3.1415927f) / 11025.0f;
    }

    static float as(float f) {
        return ((((float) Math.pow(2.0d, (double) f)) * ap) * 3.1415927f) / 11025.0f;
    }

    /* Access modifiers changed, original: final */
    public final void aa(lj ljVar, hk hkVar) {
        int af = ljVar.af(1804771424);
        this.ad[0] = af >> 4;
        this.ad[1] = af & 15;
        if (af != 0) {
            int i;
            this.aj[0] = ljVar.an(-1464407032);
            this.aj[1] = ljVar.an(-1464407032);
            int af2 = ljVar.af(1804771424);
            for (i = 0; i < 2; i++) {
                for (af = 0; af < this.ad[i]; af++) {
                    this.ar[i][0][af] = ljVar.an(-1464407032);
                    this.al[i][0][af] = ljVar.an(-1464407032);
                }
            }
            for (i = 0; i < 2; i++) {
                for (af = 0; af < this.ad[i]; af++) {
                    if ((((1 << (i * 4)) << af) & af2) != 0) {
                        this.ar[i][1][af] = ljVar.an(-1464407032);
                        this.al[i][1][af] = ljVar.an(-1464407032);
                    } else {
                        this.ar[i][1][af] = this.ar[i][0][af];
                        this.al[i][1][af] = this.al[i][0][af];
                    }
                }
            }
            if (af2 != 0 || this.aj[1] != this.aj[0]) {
                hkVar.aq(ljVar);
                return;
            }
            return;
        }
        int[] iArr = this.aj;
        this.aj[1] = 0;
        iArr[0] = 0;
    }

    /* Access modifiers changed, original: final */
    public final void ac(lj ljVar, hk hkVar) {
        int af = ljVar.af(1804771424);
        this.ad[0] = af >> 4;
        this.ad[1] = af & 15;
        if (af != 0) {
            int i;
            this.aj[0] = ljVar.an(-1464407032);
            this.aj[1] = ljVar.an(-1464407032);
            int af2 = ljVar.af(1804771424);
            for (i = 0; i < 2; i++) {
                for (af = 0; af < this.ad[i]; af++) {
                    this.ar[i][0][af] = ljVar.an(-1464407032);
                    this.al[i][0][af] = ljVar.an(-1464407032);
                }
            }
            for (i = 0; i < 2; i++) {
                for (af = 0; af < this.ad[i]; af++) {
                    if ((((1 << (i * 4)) << af) & af2) != 0) {
                        this.ar[i][1][af] = ljVar.an(-1464407032);
                        this.al[i][1][af] = ljVar.an(-1464407032);
                    } else {
                        this.ar[i][1][af] = this.ar[i][0][af];
                        this.al[i][1][af] = this.al[i][0][af];
                    }
                }
            }
            if (af2 != 0 || this.aj[1] != this.aj[0]) {
                hkVar.aq(ljVar);
                return;
            }
            return;
        }
        int[] iArr = this.aj;
        this.aj[1] = 0;
        iArr[0] = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public float ad(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.al[i][0][i2]) + (((float) (this.al[i][1][i2] - this.al[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    /* Access modifiers changed, original: 0000 */
    public float ae(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.al[i][0][i2]) + (((float) (this.al[i][1][i2] - this.al[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    /* Access modifiers changed, original: 0000 */
    public float ai(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.al[i][0][i2]) + (((float) (this.al[i][1][i2] - this.al[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    /* Access modifiers changed, original: final */
    public final void aj(lj ljVar, hk hkVar) {
        int af = ljVar.af(1804771424);
        this.ad[0] = af >> 4;
        this.ad[1] = af & 15;
        if (af != 0) {
            int i;
            this.aj[0] = ljVar.an(-1464407032);
            this.aj[1] = ljVar.an(-1464407032);
            int af2 = ljVar.af(1804771424);
            for (i = 0; i < 2; i++) {
                for (af = 0; af < this.ad[i]; af++) {
                    this.ar[i][0][af] = ljVar.an(-1464407032);
                    this.al[i][0][af] = ljVar.an(-1464407032);
                }
            }
            for (i = 0; i < 2; i++) {
                for (af = 0; af < this.ad[i]; af++) {
                    if ((((1 << (i * 4)) << af) & af2) != 0) {
                        this.ar[i][1][af] = ljVar.an(-1464407032);
                        this.al[i][1][af] = ljVar.an(-1464407032);
                    } else {
                        this.ar[i][1][af] = this.ar[i][0][af];
                        this.al[i][1][af] = this.al[i][0][af];
                    }
                }
            }
            if (af2 != 0 || this.aj[1] != this.aj[0]) {
                hkVar.aq(ljVar);
                return;
            }
            return;
        }
        int[] iArr = this.aj;
        this.aj[1] = 0;
        iArr[0] = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int al(int i, float f) {
        int i2 = 0;
        if (i == 0) {
            am = (float) Math.pow(0.1d, (double) (((((float) this.aj[0]) + (((float) (this.aj[1] - this.aj[0])) * f)) * 0.0030517578f) / 20.0f));
            ak = (int) (am * 65536.0f);
        }
        if (this.ad[i] == 0) {
            return 0;
        }
        int i3;
        float ad = ad(i, 0, f);
        ai[i][0] = (ad * -2.0f) * ((float) Math.cos((double) ar(i, 0, f)));
        ai[i][1] = ad * ad;
        for (i3 = 1; i3 < this.ad[i]; i3++) {
            float ad2 = ad(i, i3, f);
            float cos = (ad2 * -2.0f) * ((float) Math.cos((double) ar(i, i3, f)));
            float f2 = ad2 * ad2;
            int i4 = i3 * 2;
            int i5 = i4 - 1;
            ai[i][i4 + 1] = ai[i][i5] * f2;
            ai[i][i4] = (ai[i][i5] * cos) + (ai[i][i4 - 2] * f2);
            while (i5 >= 2) {
                float[] fArr = ai[i];
                fArr[i5] = fArr[i5] + ((ai[i][i5 - 1] * cos) + (ai[i][i5 - 2] * f2));
                i5--;
            }
            float[] fArr2 = ai[i];
            fArr2[1] = (f2 + (ai[i][0] * cos)) + fArr2[1];
            fArr2 = ai[i];
            fArr2[0] = cos + fArr2[0];
        }
        if (i == 0) {
            for (i3 = 0; i3 < this.ad[0] * 2; i3++) {
                float[] fArr3 = ai[0];
                fArr3[i3] = fArr3[i3] * am;
            }
        }
        while (i2 < this.ad[i] * 2) {
            ae[i][i2] = (int) (ai[i][i2] * 65536.0f);
            i2++;
        }
        return this.ad[i] * 2;
    }

    /* Access modifiers changed, original: 0000 */
    public float am(int i, int i2, float f) {
        return 1.0f - ((float) Math.pow(10.0d, (double) ((-((((float) this.al[i][0][i2]) + (((float) (this.al[i][1][i2] - this.al[i][0][i2])) * f)) * 0.0015258789f)) / 20.0f)));
    }

    /* Access modifiers changed, original: 0000 */
    public float ap(int i, int i2, float f) {
        return gx.aq((((float) this.ar[i][0][i2]) + (((float) (this.ar[i][1][i2] - this.ar[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    /* Access modifiers changed, original: 0000 */
    public float ar(int i, int i2, float f) {
        return gx.aq((((float) this.ar[i][0][i2]) + (((float) (this.ar[i][1][i2] - this.ar[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    /* Access modifiers changed, original: 0000 */
    public float au(int i, int i2, float f) {
        return gx.aq((((float) this.ar[i][0][i2]) + (((float) (this.ar[i][1][i2] - this.ar[i][0][i2])) * f)) * 1.2207031E-4f);
    }

    /* Access modifiers changed, original: 0000 */
    public int aw(int i, float f) {
        int i2 = 0;
        if (i == 0) {
            am = (float) Math.pow(0.1d, (double) (((((float) this.aj[0]) + (((float) (this.aj[1] - this.aj[0])) * f)) * 0.0030517578f) / 20.0f));
            ak = (int) (am * 65536.0f);
        }
        if (this.ad[i] == 0) {
            return 0;
        }
        int i3;
        float ad = ad(i, 0, f);
        ai[i][0] = (ad * -2.0f) * ((float) Math.cos((double) ar(i, 0, f)));
        ai[i][1] = ad * ad;
        for (i3 = 1; i3 < this.ad[i]; i3++) {
            float ad2 = ad(i, i3, f);
            float cos = (ad2 * -2.0f) * ((float) Math.cos((double) ar(i, i3, f)));
            float f2 = ad2 * ad2;
            int i4 = i3 * 2;
            int i5 = i4 - 1;
            ai[i][i4 + 1] = ai[i][i5] * f2;
            ai[i][i4] = (ai[i][i5] * cos) + (ai[i][i4 - 2] * f2);
            while (i5 >= 2) {
                float[] fArr = ai[i];
                fArr[i5] = fArr[i5] + ((ai[i][i5 - 1] * cos) + (ai[i][i5 - 2] * f2));
                i5--;
            }
            float[] fArr2 = ai[i];
            fArr2[1] = (f2 + (ai[i][0] * cos)) + fArr2[1];
            fArr2 = ai[i];
            fArr2[0] = cos + fArr2[0];
        }
        if (i == 0) {
            for (i3 = 0; i3 < this.ad[0] * 2; i3++) {
                float[] fArr3 = ai[0];
                fArr3[i3] = fArr3[i3] * am;
            }
        }
        while (i2 < this.ad[i] * 2) {
            ae[i][i2] = (int) (ai[i][i2] * 65536.0f);
            i2++;
        }
        return this.ad[i] * 2;
    }

    /* Access modifiers changed, original: 0000 */
    public int ax(int i, float f) {
        int i2 = 0;
        if (i == 0) {
            am = (float) Math.pow(0.1d, (double) (((((float) this.aj[0]) + (((float) (this.aj[1] - this.aj[0])) * f)) * 0.0030517578f) / 20.0f));
            ak = (int) (am * 65536.0f);
        }
        if (this.ad[i] == 0) {
            return 0;
        }
        int i3;
        float ad = ad(i, 0, f);
        ai[i][0] = (ad * -2.0f) * ((float) Math.cos((double) ar(i, 0, f)));
        ai[i][1] = ad * ad;
        for (i3 = 1; i3 < this.ad[i]; i3++) {
            float ad2 = ad(i, i3, f);
            float cos = (ad2 * -2.0f) * ((float) Math.cos((double) ar(i, i3, f)));
            float f2 = ad2 * ad2;
            int i4 = i3 * 2;
            int i5 = i4 - 1;
            ai[i][i4 + 1] = ai[i][i5] * f2;
            ai[i][i4] = (ai[i][i5] * cos) + (ai[i][i4 - 2] * f2);
            while (i5 >= 2) {
                float[] fArr = ai[i];
                fArr[i5] = fArr[i5] + ((ai[i][i5 - 1] * cos) + (ai[i][i5 - 2] * f2));
                i5--;
            }
            float[] fArr2 = ai[i];
            fArr2[1] = (f2 + (ai[i][0] * cos)) + fArr2[1];
            fArr2 = ai[i];
            fArr2[0] = cos + fArr2[0];
        }
        if (i == 0) {
            for (i3 = 0; i3 < this.ad[0] * 2; i3++) {
                float[] fArr3 = ai[0];
                fArr3[i3] = fArr3[i3] * am;
            }
        }
        while (i2 < this.ad[i] * 2) {
            ae[i][i2] = (int) (ai[i][i2] * 65536.0f);
            i2++;
        }
        return this.ad[i] * 2;
    }

    /* Access modifiers changed, original: 0000 */
    public float az(int i, int i2, float f) {
        return gx.aq((((float) this.ar[i][0][i2]) + (((float) (this.ar[i][1][i2] - this.ar[i][0][i2])) * f)) * 1.2207031E-4f);
    }
}
