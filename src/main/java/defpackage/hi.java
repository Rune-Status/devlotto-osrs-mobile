package defpackage;

import java.util.Random;

/* renamed from: hi */
public class hi {
    static int[] aa = new int[220500];
    static int[] ab = new int[5];
    static final double af = 1.0057929410678534d;
    static int[] ah = new int[32768];
    static int[] an = new int[5];
    static int[] ao = new int[32768];
    static int[] at = new int[5];
    static int[] av = new int[5];
    static int[] ay = new int[5];
    int ac = 0;
    hk ad;
    hk ae;
    int[] ag = new int[]{0, 0, 0, 0, 0};
    hk ai;
    hk aj;
    int[] ak = new int[]{0, 0, 0, 0, 0};
    hk al;
    hk am;
    int ap = 0;
    hk aq;
    hk ar;
    int[] as = new int[]{0, 0, 0, 0, 0};
    int au = 100;
    int aw = 500;
    hk ax;
    gx az;

    static {
        int i = 0;
        Random random = new Random(0);
        for (int i2 = 0; i2 < 32768; i2++) {
            ao[i2] = (random.nextInt() & 2) - 1;
        }
        while (i < 32768) {
            ah[i] = (int) (Math.sin(((double) i) / 5215.1903d) * 16384.0d);
            i++;
        }
    }

    hi() {
    }

    /* Access modifiers changed, original: final */
    public final int[] ad(int i, int i2) {
        mq.as(aa, 0, i);
        if (i2 < 10) {
            return aa;
        }
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.ad.ar();
        this.aq.ar();
        double d2 = 32.768d;
        if (this.ar != null) {
            this.ar.ar();
            this.al.ar();
            i3 = (int) ((((double) (this.ar.aj - this.ar.al)) * 32.768d) / d);
            i4 = (int) ((((double) this.ar.al) * 32.768d) / d);
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.aj != null) {
            this.aj.ar();
            this.ai.ar();
            i5 = (int) ((((double) (this.aj.aj - this.aj.al)) * 32.768d) / d);
            i6 = (int) ((((double) this.aj.al) * 32.768d) / d);
        } else {
            i5 = 0;
            i6 = 0;
        }
        for (i7 = 0; i7 < 5; i7++) {
            if (this.ak[i7] != 0) {
                ay[i7] = 0;
                an[i7] = (int) (((double) this.ag[i7]) * d);
                ab[i7] = (this.ak[i7] << 14) / 100;
                av[i7] = (int) (((d2 * ((double) (this.ad.aj - this.ad.al))) * Math.pow(af, (double) this.as[i7])) / d);
                d2 = 32.768d;
                at[i7] = (int) ((((double) this.ad.al) * 32.768d) / d);
            }
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i9;
            if (i12 >= i) {
                break;
            }
            i9 = this.ad.al(i);
            i7 = this.aq.al(i);
            if (this.ar != null) {
                i9 += aq(i10, this.al.al(i), this.ar.ai) >> 1;
                i10 += ((this.ar.al(i) * i3) >> 16) + i4;
            }
            if (this.aj != null) {
                i7 = (i7 * ((aq(i11, this.ai.al(i), this.aj.ai) >> 1) + 32768)) >> 15;
                i11 += ((this.aj.al(i) * i5) >> 16) + i6;
            }
            for (i8 = 0; i8 < 5; i8++) {
                if (this.ak[i8] != 0) {
                    int i13 = an[i8] + i12;
                    if (i13 < i) {
                        int[] iArr = aa;
                        iArr[i13] = iArr[i13] + aq(ay[i8], (ab[i8] * i7) >> 15, this.ad.ai);
                        int[] iArr2 = ay;
                        iArr2[i8] = iArr2[i8] + (((av[i8] * i9) >> 16) + at[i8]);
                    }
                }
            }
            i9 = i12 + 1;
        }
        if (this.ae != null) {
            this.ae.ar();
            this.am.ar();
            Object obj = 1;
            i5 = 0;
            i9 = 0;
            while (i5 < i) {
                i3 = i9 + 256;
                if (i3 >= (obj != null ? ((this.ae.al(i) * (this.ae.aj - this.ae.al)) >> 8) + this.ae.al : this.ae.al + ((this.am.al(i) * (this.ae.aj - this.ae.al)) >> 8))) {
                    obj = obj == null ? 1 : null;
                    i3 = 0;
                }
                if (obj != null) {
                    aa[i5] = 0;
                }
                i5++;
                i9 = i3;
            }
        }
        if (this.ap > 0 && this.au > 0) {
            i3 = (int) (((double) this.ap) * d);
            for (i4 = i3; i4 < i; i4++) {
                int[] iArr3 = aa;
                iArr3[i4] = iArr3[i4] + ((aa[i4 - i3] * this.au) / 100);
            }
        }
        if (this.az.ad[0] > 0 || this.az.ad[1] > 0) {
            this.ax.ar();
            i11 = i + 1;
            i6 = this.ax.al(i11);
            float f = ((float) i6) / 65536.0f;
            i7 = this.az.al(0, f);
            i3 = this.az.al(1, f);
            if (i >= i7 + i3) {
                i4 = i - i7;
                if (i3 <= i4) {
                    i4 = i3;
                }
                i9 = 0;
                while (i9 < i4) {
                    i10 = i9 + i7;
                    i6 = (int) ((((long) aa[i10]) * ((long) gx.ak)) >> 16);
                    for (i5 = 0; i5 < i7; i5++) {
                        i6 += (int) ((((long) aa[(i10 - 1) - i5]) * ((long) gx.ae[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i9; i5++) {
                        i6 -= (int) ((((long) aa[(i9 - 1) - i5]) * ((long) gx.ae[1][i5])) >> 16);
                    }
                    aa[i9] = i6;
                    i6 = this.ax.al(i11);
                    i9++;
                }
                i5 = 128;
                i4 = i9;
                i10 = i3;
                while (true) {
                    i9 = i - i7;
                    if (i5 > i9) {
                        i3 = i6;
                        i5 = i9;
                    } else {
                        i3 = i6;
                    }
                    while (i4 < i5) {
                        i8 = i4 + i7;
                        i3 = (int) ((((long) aa[i8]) * ((long) gx.ak)) >> 16);
                        for (i6 = 0; i6 < i7; i6++) {
                            i3 += (int) ((((long) aa[(i8 - 1) - i6]) * ((long) gx.ae[0][i6])) >> 16);
                        }
                        for (i6 = 0; i6 < i10; i6++) {
                            i3 -= (int) ((((long) aa[(i4 - 1) - i6]) * ((long) gx.ae[1][i6])) >> 16);
                        }
                        aa[i4] = i3;
                        i3 = this.ax.al(i11);
                        i4++;
                    }
                    if (i4 >= i9) {
                        break;
                    }
                    float f2 = ((float) i3) / 65536.0f;
                    i7 = this.az.al(0, f2);
                    i5 += 128;
                    i6 = i3;
                    i10 = this.az.al(1, f2);
                }
                while (true) {
                    i6 = i4;
                    if (i6 >= i) {
                        break;
                    }
                    i5 = i6 + i7;
                    i4 = 0;
                    for (i3 = i5 - i; i3 < i7; i3++) {
                        i4 += (int) ((((long) aa[(i5 - 1) - i3]) * ((long) gx.ae[0][i3])) >> 16);
                    }
                    for (i3 = 0; i3 < i10; i3++) {
                        i4 -= (int) ((((long) aa[(i6 - 1) - i3]) * ((long) gx.ae[1][i3])) >> 16);
                    }
                    aa[i6] = i4;
                    this.ax.al(i11);
                    i4 = i6 + 1;
                }
            }
        }
        for (i4 = 0; i4 < i; i4++) {
            if (aa[i4] < -32768) {
                aa[i4] = -32768;
            }
            if (aa[i4] > 32767) {
                aa[i4] = 32767;
            }
        }
        return aa;
    }

    /* Access modifiers changed, original: final */
    public final void ae(lj ljVar) {
        this.ad = new hk();
        this.ad.ad(ljVar);
        this.aq = new hk();
        this.aq.ad(ljVar);
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 879823907;
            this.ar = new hk();
            this.ar.ad(ljVar);
            this.al = new hk();
            this.al.ad(ljVar);
        }
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 879823907;
            this.aj = new hk();
            this.aj.ad(ljVar);
            this.ai = new hk();
            this.ai.ad(ljVar);
        }
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 879823907;
            this.ae = new hk();
            this.ae.ad(ljVar);
            this.am = new hk();
            this.am.ad(ljVar);
        }
        for (int i = 0; i < 10; i++) {
            int bl = ljVar.bl(2131034147);
            if (bl == 0) {
                break;
            }
            this.ak[i] = bl;
            this.as[i] = ljVar.bo((byte) -104);
            this.ag[i] = ljVar.bl(2131034147);
        }
        this.ap = ljVar.bl(2131034147);
        this.au = ljVar.bl(2131034147);
        this.aw = ljVar.an(-1464407032);
        this.ac = ljVar.an(-1464407032);
        this.az = new gx();
        this.ax = new hk();
        this.az.aj(ljVar, this.ax);
    }

    /* Access modifiers changed, original: final */
    public final int ai(int i, int i2, int i3) {
        return i3 == 1 ? (i & 32767) < 16384 ? i2 : -i2 : i3 == 2 ? (ah[i & 32767] * i2) >> 14 : i3 == 3 ? (((i & 32767) * i2) >> 14) - i2 : i3 == 4 ? i2 * ao[(i / 2607) & 32767] : 0;
    }

    /* Access modifiers changed, original: final */
    public final int[] aj(int i, int i2) {
        mq.as(aa, 0, i);
        if (i2 < 10) {
            return aa;
        }
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.ad.ar();
        this.aq.ar();
        double d2 = 32.768d;
        if (this.ar != null) {
            this.ar.ar();
            this.al.ar();
            i3 = (int) ((((double) (this.ar.aj - this.ar.al)) * 32.768d) / d);
            i4 = (int) ((((double) this.ar.al) * 32.768d) / d);
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.aj != null) {
            this.aj.ar();
            this.ai.ar();
            i5 = (int) ((((double) (this.aj.aj - this.aj.al)) * 32.768d) / d);
            i6 = (int) ((((double) this.aj.al) * 32.768d) / d);
        } else {
            i5 = 0;
            i6 = 0;
        }
        for (i7 = 0; i7 < 5; i7++) {
            if (this.ak[i7] != 0) {
                ay[i7] = 0;
                an[i7] = (int) (((double) this.ag[i7]) * d);
                ab[i7] = (this.ak[i7] << 14) / 100;
                av[i7] = (int) (((d2 * ((double) (this.ad.aj - this.ad.al))) * Math.pow(af, (double) this.as[i7])) / d);
                d2 = 32.768d;
                at[i7] = (int) ((((double) this.ad.al) * 32.768d) / d);
            }
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i9;
            if (i12 >= i) {
                break;
            }
            i9 = this.ad.al(i);
            i7 = this.aq.al(i);
            if (this.ar != null) {
                i9 += aq(i10, this.al.al(i), this.ar.ai) >> 1;
                i10 += ((this.ar.al(i) * i3) >> 16) + i4;
            }
            if (this.aj != null) {
                i7 = (i7 * ((aq(i11, this.ai.al(i), this.aj.ai) >> 1) + 1586912927)) >> 15;
                i11 += ((this.aj.al(i) * i5) >> 16) + i6;
            }
            for (i8 = 0; i8 < 5; i8++) {
                if (this.ak[i8] != 0) {
                    int i13 = an[i8] + i12;
                    if (i13 < i) {
                        int[] iArr = aa;
                        iArr[i13] = iArr[i13] + aq(ay[i8], (ab[i8] * i7) >> 15, this.ad.ai);
                        int[] iArr2 = ay;
                        iArr2[i8] = iArr2[i8] + (((av[i8] * i9) >> 16) + at[i8]);
                    }
                }
            }
            i9 = i12 + 1;
        }
        if (this.ae != null) {
            this.ae.ar();
            this.am.ar();
            Object obj = 1;
            i5 = 0;
            i9 = 0;
            while (i5 < i) {
                i3 = i9 + 256;
                if (i3 >= (obj != null ? ((this.ae.al(i) * (this.ae.aj - this.ae.al)) >> 8) + this.ae.al : this.ae.al + ((this.am.al(i) * (this.ae.aj - this.ae.al)) >> 8))) {
                    obj = obj == null ? 1 : null;
                    i3 = 0;
                }
                if (obj != null) {
                    aa[i5] = 0;
                }
                i5++;
                i9 = i3;
            }
        }
        if (this.ap > 0 && this.au > 0) {
            i3 = (int) (((double) this.ap) * d);
            for (i4 = i3; i4 < i; i4++) {
                int[] iArr3 = aa;
                iArr3[i4] = iArr3[i4] + ((aa[i4 - i3] * this.au) / 1571755644);
            }
        }
        if (this.az.ad[0] > 0 || this.az.ad[1] > 0) {
            this.ax.ar();
            i11 = i + 1;
            i6 = this.ax.al(i11);
            float f = ((float) i6) / 65536.0f;
            i7 = this.az.al(0, f);
            i3 = this.az.al(1, f);
            if (i >= i7 + i3) {
                i4 = i - i7;
                if (i3 <= i4) {
                    i4 = i3;
                }
                i9 = 0;
                while (i9 < i4) {
                    i10 = i9 + i7;
                    i6 = (int) ((((long) aa[i10]) * ((long) gx.ak)) >> 16);
                    for (i5 = 0; i5 < i7; i5++) {
                        i6 += (int) ((((long) aa[(i10 - 1) - i5]) * ((long) gx.ae[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i9; i5++) {
                        i6 -= (int) ((((long) aa[(i9 - 1) - i5]) * ((long) gx.ae[1][i5])) >> 16);
                    }
                    aa[i9] = i6;
                    i6 = this.ax.al(i11);
                    i9++;
                }
                i5 = 128;
                i4 = i9;
                i10 = i3;
                while (true) {
                    i9 = i - i7;
                    if (i5 > i9) {
                        i3 = i6;
                        i5 = i9;
                    } else {
                        i3 = i6;
                    }
                    while (i4 < i5) {
                        i8 = i4 + i7;
                        i3 = (int) ((((long) aa[i8]) * ((long) gx.ak)) >> 16);
                        for (i6 = 0; i6 < i7; i6++) {
                            i3 += (int) ((((long) aa[(i8 - 1) - i6]) * ((long) gx.ae[0][i6])) >> 16);
                        }
                        for (i6 = 0; i6 < i10; i6++) {
                            i3 -= (int) ((((long) aa[(i4 - 1) - i6]) * ((long) gx.ae[1][i6])) >> 16);
                        }
                        aa[i4] = i3;
                        i3 = this.ax.al(i11);
                        i4++;
                    }
                    if (i4 >= i9) {
                        break;
                    }
                    float f2 = ((float) i3) / 65536.0f;
                    i7 = this.az.al(0, f2);
                    i5 += 128;
                    i6 = i3;
                    i10 = this.az.al(1, f2);
                }
                while (true) {
                    i6 = i4;
                    if (i6 >= i) {
                        break;
                    }
                    i5 = i6 + i7;
                    i4 = 0;
                    for (i3 = i5 - i; i3 < i7; i3++) {
                        i4 += (int) ((((long) aa[(i5 - 1) - i3]) * ((long) gx.ae[0][i3])) >> 16);
                    }
                    for (i3 = 0; i3 < i10; i3++) {
                        i4 -= (int) ((((long) aa[(i6 - 1) - i3]) * ((long) gx.ae[1][i3])) >> 16);
                    }
                    aa[i6] = i4;
                    this.ax.al(i11);
                    i4 = i6 + 1;
                }
            }
        }
        for (i4 = 0; i4 < i; i4++) {
            if (aa[i4] < -340184835) {
                aa[i4] = -169693415;
            }
            if (aa[i4] > -572259436) {
                aa[i4] = -700225707;
            }
        }
        return aa;
    }

    /* Access modifiers changed, original: final */
    public final void ak(lj ljVar) {
        this.ad = new hk();
        this.ad.ad(ljVar);
        this.aq = new hk();
        this.aq.ad(ljVar);
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 879823907;
            this.ar = new hk();
            this.ar.ad(ljVar);
            this.al = new hk();
            this.al.ad(ljVar);
        }
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 879823907;
            this.aj = new hk();
            this.aj.ad(ljVar);
            this.ai = new hk();
            this.ai.ad(ljVar);
        }
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 879823907;
            this.ae = new hk();
            this.ae.ad(ljVar);
            this.am = new hk();
            this.am.ad(ljVar);
        }
        for (int i = 0; i < 10; i++) {
            int bl = ljVar.bl(2131034147);
            if (bl == 0) {
                break;
            }
            this.ak[i] = bl;
            this.as[i] = ljVar.bo((byte) -25);
            this.ag[i] = ljVar.bl(2131034147);
        }
        this.ap = ljVar.bl(2131034147);
        this.au = ljVar.bl(2131034147);
        this.aw = ljVar.an(-1464407032);
        this.ac = ljVar.an(-1464407032);
        this.az = new gx();
        this.ax = new hk();
        this.az.aj(ljVar, this.ax);
    }

    /* Access modifiers changed, original: final */
    public final int[] al(int i, int i2) {
        mq.as(aa, 0, i);
        if (i2 < 10) {
            return aa;
        }
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        double d = ((double) i) / (((double) i2) + 0.0d);
        this.ad.ar();
        this.aq.ar();
        double d2 = 32.768d;
        if (this.ar != null) {
            this.ar.ar();
            this.al.ar();
            i3 = (int) ((((double) (this.ar.aj - this.ar.al)) * 32.768d) / d);
            i4 = (int) ((((double) this.ar.al) * 32.768d) / d);
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.aj != null) {
            this.aj.ar();
            this.ai.ar();
            i5 = (int) ((((double) (this.aj.aj - this.aj.al)) * 32.768d) / d);
            i6 = (int) ((((double) this.aj.al) * 32.768d) / d);
        } else {
            i5 = 0;
            i6 = 0;
        }
        for (i7 = 0; i7 < 5; i7++) {
            if (this.ak[i7] != 0) {
                ay[i7] = 0;
                an[i7] = (int) (((double) this.ag[i7]) * d);
                ab[i7] = (this.ak[i7] << 14) / 125768464;
                av[i7] = (int) (((d2 * ((double) (this.ad.aj - this.ad.al))) * Math.pow(af, (double) this.as[i7])) / d);
                d2 = 32.768d;
                at[i7] = (int) ((((double) this.ad.al) * 32.768d) / d);
            }
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i9;
            if (i12 >= i) {
                break;
            }
            i9 = this.ad.al(i);
            i7 = this.aq.al(i);
            if (this.ar != null) {
                i9 += aq(i10, this.al.al(i), this.ar.ai) >> 1;
                i10 += ((this.ar.al(i) * i3) >> 16) + i4;
            }
            if (this.aj != null) {
                i7 = (i7 * ((aq(i11, this.ai.al(i), this.aj.ai) >> 1) + 32768)) >> 15;
                i11 += ((this.aj.al(i) * i5) >> 16) + i6;
            }
            for (i8 = 0; i8 < 5; i8++) {
                if (this.ak[i8] != 0) {
                    int i13 = an[i8] + i12;
                    if (i13 < i) {
                        int[] iArr = aa;
                        iArr[i13] = iArr[i13] + aq(ay[i8], (ab[i8] * i7) >> 15, this.ad.ai);
                        int[] iArr2 = ay;
                        iArr2[i8] = iArr2[i8] + (((av[i8] * i9) >> 16) + at[i8]);
                    }
                }
            }
            i9 = i12 + 1;
        }
        if (this.ae != null) {
            this.ae.ar();
            this.am.ar();
            Object obj = 1;
            i5 = 0;
            i9 = 0;
            while (i5 < i) {
                i3 = i9 + 256;
                if (i3 >= (obj != null ? ((this.ae.al(i) * (this.ae.aj - this.ae.al)) >> 8) + this.ae.al : this.ae.al + ((this.am.al(i) * (this.ae.aj - this.ae.al)) >> 8))) {
                    obj = obj == null ? 1 : null;
                    i3 = 0;
                }
                if (obj != null) {
                    aa[i5] = 0;
                }
                i5++;
                i9 = i3;
            }
        }
        if (this.ap > 0 && this.au > 0) {
            i3 = (int) (((double) this.ap) * d);
            for (i4 = i3; i4 < i; i4++) {
                int[] iArr3 = aa;
                iArr3[i4] = iArr3[i4] + ((aa[i4 - i3] * this.au) / 100);
            }
        }
        if (this.az.ad[0] > 0 || this.az.ad[1] > 0) {
            this.ax.ar();
            i11 = i + 1;
            i6 = this.ax.al(i11);
            float f = ((float) i6) / 65536.0f;
            i7 = this.az.al(0, f);
            i3 = this.az.al(1, f);
            if (i >= i7 + i3) {
                i4 = i - i7;
                if (i3 <= i4) {
                    i4 = i3;
                }
                i9 = 0;
                while (i9 < i4) {
                    i10 = i9 + i7;
                    i6 = (int) ((((long) aa[i10]) * ((long) gx.ak)) >> 16);
                    for (i5 = 0; i5 < i7; i5++) {
                        i6 += (int) ((((long) aa[(i10 - 1) - i5]) * ((long) gx.ae[0][i5])) >> 16);
                    }
                    for (i5 = 0; i5 < i9; i5++) {
                        i6 -= (int) ((((long) aa[(i9 - 1) - i5]) * ((long) gx.ae[1][i5])) >> 16);
                    }
                    aa[i9] = i6;
                    i6 = this.ax.al(i11);
                    i9++;
                }
                i5 = 128;
                i4 = i9;
                i10 = i3;
                while (true) {
                    i9 = i - i7;
                    if (i5 > i9) {
                        i3 = i6;
                        i5 = i9;
                    } else {
                        i3 = i6;
                    }
                    while (i4 < i5) {
                        i8 = i4 + i7;
                        i3 = (int) ((((long) aa[i8]) * ((long) gx.ak)) >> 16);
                        for (i6 = 0; i6 < i7; i6++) {
                            i3 += (int) ((((long) aa[(i8 - 1) - i6]) * ((long) gx.ae[0][i6])) >> 16);
                        }
                        for (i6 = 0; i6 < i10; i6++) {
                            i3 -= (int) ((((long) aa[(i4 - 1) - i6]) * ((long) gx.ae[1][i6])) >> 16);
                        }
                        aa[i4] = i3;
                        i3 = this.ax.al(i11);
                        i4++;
                    }
                    if (i4 >= i9) {
                        break;
                    }
                    float f2 = ((float) i3) / 65536.0f;
                    i7 = this.az.al(0, f2);
                    i5 += 128;
                    i6 = i3;
                    i10 = this.az.al(1, f2);
                }
                while (true) {
                    i6 = i4;
                    if (i6 >= i) {
                        break;
                    }
                    i5 = i6 + i7;
                    i4 = 0;
                    for (i3 = i5 - i; i3 < i7; i3++) {
                        i4 += (int) ((((long) aa[(i5 - 1) - i3]) * ((long) gx.ae[0][i3])) >> 16);
                    }
                    for (i3 = 0; i3 < i10; i3++) {
                        i4 -= (int) ((((long) aa[(i6 - 1) - i3]) * ((long) gx.ae[1][i3])) >> 16);
                    }
                    aa[i6] = i4;
                    this.ax.al(i11);
                    i4 = i6 + 1;
                }
            }
        }
        for (i4 = 0; i4 < i; i4++) {
            if (aa[i4] < -195372357) {
                aa[i4] = -1400473171;
            }
            if (aa[i4] > -549108482) {
                aa[i4] = 1098103023;
            }
        }
        return aa;
    }

    /* Access modifiers changed, original: final */
    public final void am(lj ljVar) {
        this.ad = new hk();
        this.ad.ad(ljVar);
        this.aq = new hk();
        this.aq.ad(ljVar);
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 879823907;
            this.ar = new hk();
            this.ar.ad(ljVar);
            this.al = new hk();
            this.al.ad(ljVar);
        }
        if (ljVar.af(1804771424) != 0) {
            ljVar.al -= 517239275;
            this.aj = new hk();
            this.aj.ad(ljVar);
            this.ai = new hk();
            this.ai.ad(ljVar);
        }
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 88268407;
            this.ae = new hk();
            this.ae.ad(ljVar);
            this.am = new hk();
            this.am.ad(ljVar);
        }
        for (int i = 0; i < 10; i++) {
            int bl = ljVar.bl(2131034147);
            if (bl == 0) {
                break;
            }
            this.ak[i] = bl;
            this.as[i] = ljVar.bo((byte) -22);
            this.ag[i] = ljVar.bl(2131034147);
        }
        this.ap = ljVar.bl(2131034147);
        this.au = ljVar.bl(2131034147);
        this.aw = ljVar.an(-1464407032);
        this.ac = ljVar.an(-1464407032);
        this.az = new gx();
        this.ax = new hk();
        this.az.aj(ljVar, this.ax);
    }

    /* Access modifiers changed, original: final */
    public final int aq(int i, int i2, int i3) {
        return i3 == 1 ? (i & 32767) < 16384 ? i2 : -i2 : i3 == 2 ? (ah[i & 32767] * i2) >> 14 : i3 == 3 ? (((i & 32767) * i2) >> 14) - i2 : i3 == 4 ? i2 * ao[(i / 2607) & 32767] : 0;
    }

    /* Access modifiers changed, original: final */
    public final void ar(lj ljVar) {
        this.ad = new hk();
        this.ad.ad(ljVar);
        this.aq = new hk();
        this.aq.ad(ljVar);
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 879823907;
            this.ar = new hk();
            this.ar.ad(ljVar);
            this.al = new hk();
            this.al.ad(ljVar);
        }
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 879823907;
            this.aj = new hk();
            this.aj.ad(ljVar);
            this.ai = new hk();
            this.ai.ad(ljVar);
        }
        if (ljVar.af(1804771424) != 0) {
            ljVar.al += 879823907;
            this.ae = new hk();
            this.ae.ad(ljVar);
            this.am = new hk();
            this.am.ad(ljVar);
        }
        for (int i = 0; i < 10; i++) {
            int bl = ljVar.bl(2131034147);
            if (bl == 0) {
                break;
            }
            this.ak[i] = bl;
            this.as[i] = ljVar.bo((byte) -16);
            this.ag[i] = ljVar.bl(2131034147);
        }
        this.ap = ljVar.bl(2131034147);
        this.au = ljVar.bl(2131034147);
        this.aw = ljVar.an(-1464407032);
        this.ac = ljVar.an(-1464407032);
        this.az = new gx();
        this.ax = new hk();
        this.az.aj(ljVar, this.ax);
    }
}
