package defpackage;

/* renamed from: hc */
public class hc {
    int ad = gy.al(16);
    int[] ae;
    int ai = gy.al(8);
    int aj = (gy.al(6) + 1);
    int al = (gy.al(24) + 1);
    int aq = gy.al(24);
    int ar = gy.al(24);

    hc() {
        int i = 0;
        int[] iArr = new int[this.aj];
        for (int i2 = 0; i2 < this.aj; i2++) {
            iArr[i2] = (((gy.ar() != 0 ? 1 : 0) != 0 ? gy.al(5) : 0) << 3) | gy.al(3);
        }
        this.ae = new int[(this.aj * 8)];
        while (i < this.aj * 8) {
            this.ae[i] = (iArr[i >> 3] & (1 << (i & 7))) != 0 ? gy.al(8) : -1;
            i++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = gy.ap[this.ai].ad;
            int i4 = (this.ar - this.aq) / this.al;
            int[] iArr = new int[i4];
            i2 = 0;
            while (true) {
                int i5 = i2;
                if (i5 < 8) {
                    int i6 = 0;
                    while (i6 < i4) {
                        int i7;
                        int i8;
                        if (i5 == 0) {
                            i2 = gy.ap[this.ai].ar();
                            for (i7 = i3 - 1; i7 >= 0; i7--) {
                                i8 = i6 + i7;
                                if (i8 < i4) {
                                    iArr[i8] = i2 % this.aj;
                                }
                                i2 /= this.aj;
                            }
                        }
                        i8 = 0;
                        while (i8 < i3) {
                            i2 = this.ae[(iArr[i6] * 8) + i5];
                            if (i2 >= 0) {
                                int i9 = (this.al * i6) + this.aq;
                                gk gkVar = gy.ap[i2];
                                if (this.ad == 0) {
                                    int i10 = this.al / gkVar.ad;
                                    for (i7 = 0; i7 < i10; i7++) {
                                        float[] al = gkVar.al();
                                        for (i2 = 0; i2 < gkVar.ad; i2++) {
                                            int i11 = (i9 + i7) + (i2 * i10);
                                            fArr[i11] = fArr[i11] + al[i2];
                                        }
                                    }
                                } else {
                                    i2 = 0;
                                    while (i2 < this.al) {
                                        float[] al2 = gkVar.al();
                                        for (i7 = 0; i7 < gkVar.ad; i7++) {
                                            int i12 = i9 + i2;
                                            fArr[i12] = fArr[i12] + al2[i7];
                                            i2++;
                                        }
                                    }
                                }
                            }
                            i2 = i6 + 1;
                            if (i2 >= i4) {
                                break;
                            }
                            i8++;
                            i6 = i2;
                        }
                        i2 = i6;
                        i6 = i2;
                    }
                    i2 = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = gy.ap[this.ai].ad;
            int i4 = (this.ar - this.aq) / this.al;
            int[] iArr = new int[i4];
            i2 = 0;
            while (true) {
                int i5 = i2;
                if (i5 < 8) {
                    int i6 = 0;
                    while (i6 < i4) {
                        int i7;
                        int i8;
                        if (i5 == 0) {
                            i2 = gy.ap[this.ai].ar();
                            for (i7 = i3 - 1; i7 >= 0; i7--) {
                                i8 = i6 + i7;
                                if (i8 < i4) {
                                    iArr[i8] = i2 % this.aj;
                                }
                                i2 /= this.aj;
                            }
                        }
                        i8 = 0;
                        while (i8 < i3) {
                            i2 = this.ae[(iArr[i6] * 8) + i5];
                            if (i2 >= 0) {
                                int i9 = (this.al * i6) + this.aq;
                                gk gkVar = gy.ap[i2];
                                if (this.ad == 0) {
                                    int i10 = this.al / gkVar.ad;
                                    for (i7 = 0; i7 < i10; i7++) {
                                        float[] al = gkVar.al();
                                        for (i2 = 0; i2 < gkVar.ad; i2++) {
                                            int i11 = (i9 + i7) + (i2 * i10);
                                            fArr[i11] = fArr[i11] + al[i2];
                                        }
                                    }
                                } else {
                                    i2 = 0;
                                    while (i2 < this.al) {
                                        float[] al2 = gkVar.al();
                                        for (i7 = 0; i7 < gkVar.ad; i7++) {
                                            int i12 = i9 + i2;
                                            fArr[i12] = fArr[i12] + al2[i7];
                                            i2++;
                                        }
                                    }
                                }
                            }
                            i2 = i6 + 1;
                            if (i2 >= i4) {
                                break;
                            }
                            i8++;
                            i6 = i2;
                        }
                        i2 = i6;
                        i6 = i2;
                    }
                    i2 = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = gy.ap[this.ai].ad;
            int i4 = (this.ar - this.aq) / this.al;
            int[] iArr = new int[i4];
            i2 = 0;
            while (true) {
                int i5 = i2;
                if (i5 < 8) {
                    int i6 = 0;
                    while (i6 < i4) {
                        int i7;
                        int i8;
                        if (i5 == 0) {
                            i2 = gy.ap[this.ai].ar();
                            for (i7 = i3 - 1; i7 >= 0; i7--) {
                                i8 = i6 + i7;
                                if (i8 < i4) {
                                    iArr[i8] = i2 % this.aj;
                                }
                                i2 /= this.aj;
                            }
                        }
                        i8 = 0;
                        while (i8 < i3) {
                            i2 = this.ae[(iArr[i6] * 8) + i5];
                            if (i2 >= 0) {
                                int i9 = (this.al * i6) + this.aq;
                                gk gkVar = gy.ap[i2];
                                if (this.ad == 0) {
                                    int i10 = this.al / gkVar.ad;
                                    for (i7 = 0; i7 < i10; i7++) {
                                        float[] al = gkVar.al();
                                        for (i2 = 0; i2 < gkVar.ad; i2++) {
                                            int i11 = (i9 + i7) + (i2 * i10);
                                            fArr[i11] = fArr[i11] + al[i2];
                                        }
                                    }
                                } else {
                                    i2 = 0;
                                    while (i2 < this.al) {
                                        float[] al2 = gkVar.al();
                                        for (i7 = 0; i7 < gkVar.ad; i7++) {
                                            int i12 = i9 + i2;
                                            fArr[i12] = fArr[i12] + al2[i7];
                                            i2++;
                                        }
                                    }
                                }
                            }
                            i2 = i6 + 1;
                            if (i2 >= i4) {
                                break;
                            }
                            i8++;
                            i6 = i2;
                        }
                        i2 = i6;
                        i6 = i2;
                    }
                    i2 = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = gy.ap[this.ai].ad;
            int i4 = (this.ar - this.aq) / this.al;
            int[] iArr = new int[i4];
            i2 = 0;
            while (true) {
                int i5 = i2;
                if (i5 < 8) {
                    int i6 = 0;
                    while (i6 < i4) {
                        int i7;
                        int i8;
                        if (i5 == 0) {
                            i2 = gy.ap[this.ai].ar();
                            for (i7 = i3 - 1; i7 >= 0; i7--) {
                                i8 = i6 + i7;
                                if (i8 < i4) {
                                    iArr[i8] = i2 % this.aj;
                                }
                                i2 /= this.aj;
                            }
                        }
                        i8 = 0;
                        while (i8 < i3) {
                            i2 = this.ae[(iArr[i6] * 8) + i5];
                            if (i2 >= 0) {
                                int i9 = (this.al * i6) + this.aq;
                                gk gkVar = gy.ap[i2];
                                if (this.ad == 0) {
                                    int i10 = this.al / gkVar.ad;
                                    for (i7 = 0; i7 < i10; i7++) {
                                        float[] al = gkVar.al();
                                        for (i2 = 0; i2 < gkVar.ad; i2++) {
                                            int i11 = (i9 + i7) + (i2 * i10);
                                            fArr[i11] = fArr[i11] + al[i2];
                                        }
                                    }
                                } else {
                                    i2 = 0;
                                    while (i2 < this.al) {
                                        float[] al2 = gkVar.al();
                                        for (i7 = 0; i7 < gkVar.ad; i7++) {
                                            int i12 = i9 + i2;
                                            fArr[i12] = fArr[i12] + al2[i7];
                                            i2++;
                                        }
                                    }
                                }
                            }
                            i2 = i6 + 1;
                            if (i2 >= i4) {
                                break;
                            }
                            i8++;
                            i6 = i2;
                        }
                        i2 = i6;
                        i6 = i2;
                    }
                    i2 = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(float[] fArr, int i, boolean z) {
        int i2;
        for (i2 = 0; i2 < i; i2++) {
            fArr[i2] = 0.0f;
        }
        if (!z) {
            int i3 = gy.ap[this.ai].ad;
            int i4 = (this.ar - this.aq) / this.al;
            int[] iArr = new int[i4];
            i2 = 0;
            while (true) {
                int i5 = i2;
                if (i5 < 8) {
                    int i6 = 0;
                    while (i6 < i4) {
                        int i7;
                        int i8;
                        if (i5 == 0) {
                            i2 = gy.ap[this.ai].ar();
                            for (i7 = i3 - 1; i7 >= 0; i7--) {
                                i8 = i6 + i7;
                                if (i8 < i4) {
                                    iArr[i8] = i2 % this.aj;
                                }
                                i2 /= this.aj;
                            }
                        }
                        i8 = 0;
                        while (i8 < i3) {
                            i2 = this.ae[(iArr[i6] * 8) + i5];
                            if (i2 >= 0) {
                                int i9 = (this.al * i6) + this.aq;
                                gk gkVar = gy.ap[i2];
                                if (this.ad == 0) {
                                    int i10 = this.al / gkVar.ad;
                                    for (i7 = 0; i7 < i10; i7++) {
                                        float[] al = gkVar.al();
                                        for (i2 = 0; i2 < gkVar.ad; i2++) {
                                            int i11 = (i9 + i7) + (i2 * i10);
                                            fArr[i11] = fArr[i11] + al[i2];
                                        }
                                    }
                                } else {
                                    i2 = 0;
                                    while (i2 < this.al) {
                                        float[] al2 = gkVar.al();
                                        for (i7 = 0; i7 < gkVar.ad; i7++) {
                                            int i12 = i9 + i2;
                                            fArr[i12] = fArr[i12] + al2[i7];
                                            i2++;
                                        }
                                    }
                                }
                            }
                            i2 = i6 + 1;
                            if (i2 >= i4) {
                                break;
                            }
                            i8++;
                            i6 = i2;
                        }
                        i2 = i6;
                        i6 = i2;
                    }
                    i2 = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }
}
