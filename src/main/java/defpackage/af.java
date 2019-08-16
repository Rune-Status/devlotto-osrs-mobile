package defpackage;

import android.support.v4.app.NotificationManagerCompat;

/* renamed from: af */
public class af extends by {
    static final int ad = -65536;
    public static final int al = 1400;
    static kv cz = null;
    static final int so = 3;

    af(be beVar) {
        try {
            super(beVar);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("af.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final ot ad(lj ljVar, ot otVar, byte b) {
        try {
            int af = ljVar.af(1804771424);
            if (otVar == null) {
                otVar = new ot(la.ar(af, 73671585));
            }
            for (int i = 0; i < af; i++) {
                otVar.aq((ljVar.af(1804771424) == 1 ? 1 : null) != null ? new md(ljVar.bm(1487359127)) : new ms(ljVar.at((byte) -67)), (long) ljVar.av((byte) -71));
            }
            return otVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("af.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kb kbVar, int i) {
        try {
            ks.ad = kbVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("af.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static String aw(char c, int i, int i2) {
        try {
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = c;
            }
            return new String(cArr);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("af.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int bn(int i, int i2, int i3, int i4, int i5) {
        return ((i3 * i) + (i2 * i4)) >> 16;
    }

    static final void hv(byte b) {
        int i = 0;
        while (i < hz.ai * -1076782851) {
            try {
                client.jz[hz.ae[i]].ai((byte) -65);
                i++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("af.hv(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public final void ad(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Throwable e;
        StringBuilder stringBuilder;
        try {
            int i9 = 0;
            this.an[0] = -1;
            if (!(bpVar.bf == 2 || 1 == bpVar.bf)) {
                bpVar.ae();
            }
            int i10 = this.bo.bd * -1240378447;
            int i11 = this.bo.bo;
            int i12 = ae[i];
            int i13 = am[i];
            int i14 = ae[i2];
            int i15 = am[i2];
            int i16 = ae[i3];
            int i17 = am[i3];
            int i18 = ae[i4];
            int i19 = am[i4];
            while (true) {
                int i20 = i9;
                if (i20 < bpVar.aj) {
                    i9 = bpVar.ai[i20];
                    int i21 = bpVar.ae[i20];
                    try {
                        int i22;
                        int i23;
                        int i24 = bpVar.am[i20];
                        if (i3 != 0) {
                            i22 = ((i21 * i17) - (i9 * i16)) >> 16;
                            i9 = ((i9 * i17) + (i21 * i16)) >> 16;
                        } else {
                            i22 = i21;
                        }
                        if (i != 0) {
                            i21 = ((i22 * i12) + (i24 * i13)) >> 16;
                            i23 = ((i22 * i13) - (i12 * i24)) >> 16;
                        } else {
                            i23 = i22;
                            i21 = i24;
                        }
                        if (i2 != 0) {
                            i22 = ((i21 * i15) - (i9 * i14)) >> 16;
                            i9 = ((i9 * i15) + (i21 * i14)) >> 16;
                        } else {
                            i22 = i21;
                        }
                        i9 += i5;
                        i21 = i23 + i6;
                        i22 += i7;
                        i23 = ((i21 * i19) - (i18 * i22)) >> 16;
                        i22 = ((i22 * i19) + (i21 * i18)) >> 16;
                        this.aa[i20] = i22 - (((i18 * i6) + (i7 * i19)) >> 16);
                        this.aw[i20] = (((this.bo.bq * 1516652957) * i9) / i22) + i10;
                        this.ac[i20] = (((this.bo.bq * 1516652957) * i23) / i22) + (-1165057787 * i11);
                        if (bpVar.af > 0) {
                            this.ao[i20] = i9;
                            this.ah[i20] = i23;
                            this.af[i20] = i22;
                        }
                        i9 = i20 + 1;
                    } catch (RuntimeException e2) {
                        e = e2;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("af.ad(");
                        stringBuilder.append(')');
                        throw mv.aq(e, stringBuilder.toString());
                    }
                }
                try {
                    al(bpVar, false, false, 0);
                    return;
                } catch (Exception e3) {
                    return;
                }
            }
        } catch (RuntimeException e4) {
            e = e4;
            stringBuilder = new StringBuilder();
            stringBuilder.append("af.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ae(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.an[0] = -1;
        if (!(bpVar.bf == 2 || 1 == bpVar.bf)) {
            bpVar.ae();
        }
        int i8 = this.bo.bd * 181612658;
        int i9 = this.bo.bo;
        int i10 = ae[i];
        int i11 = am[i];
        int i12 = ae[i2];
        int i13 = am[i2];
        int i14 = ae[i3];
        int i15 = am[i3];
        int i16 = ae[i4];
        int i17 = am[i4];
        for (int i18 = 0; i18 < bpVar.aj; i18++) {
            int i19;
            int i20;
            int i21 = bpVar.ai[i18];
            int i22 = bpVar.ae[i18];
            int i23 = bpVar.am[i18];
            if (i3 != 0) {
                i19 = ((i22 * i15) - (i21 * i14)) >> 16;
                i21 = ((i21 * i15) + (i22 * i14)) >> 16;
            } else {
                i19 = i22;
            }
            if (i != 0) {
                i22 = ((i19 * i10) + (i23 * i11)) >> 16;
                i20 = ((i19 * i11) - (i10 * i23)) >> 16;
            } else {
                i20 = i19;
                i22 = i23;
            }
            if (i2 != 0) {
                i19 = ((i22 * i13) - (i21 * i12)) >> 16;
                i21 = ((i21 * i13) + (i22 * i12)) >> 16;
            } else {
                i19 = i22;
            }
            i21 += i5;
            i22 = i20 + i6;
            i19 += i7;
            i20 = ((i22 * i17) - (i16 * i19)) >> 16;
            i19 = ((i19 * i17) + (i22 * i16)) >> 16;
            this.aa[i18] = i19 - (((i16 * i6) + (i7 * i17)) >> 16);
            this.aw[i18] = (((this.bo.bq * 694369247) * i21) / i19) + i8;
            this.ac[i18] = (((this.bo.bq * 1002389590) * i20) / i19) + (-1165057787 * i9);
            if (bpVar.af > 0) {
                this.ao[i18] = i21;
                this.ah[i18] = i20;
                this.af[i18] = i19;
            }
        }
        try {
            al(bpVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: final */
    public final void ag(bp bpVar, boolean z, boolean z2, long j) {
        if (bpVar.bc < 1600) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int[] iArr;
            for (i = 0; i < bpVar.bc; i++) {
                this.an[i] = 0;
            }
            i = 0;
            while (true) {
                i2 = i;
                if (i2 >= bpVar.ak) {
                    break;
                }
                if (-2 != bpVar.ax[i2]) {
                    i3 = bpVar.as[i2];
                    i4 = bpVar.ag[i2];
                    i5 = bpVar.ap[i2];
                    i6 = this.aw[i3];
                    i7 = this.aw[i4];
                    int i12 = this.aw[i5];
                    int[] iArr2;
                    if (z && (i6 == -5000 || i7 == -5000 || -5000 == i12)) {
                        i = this.ao[i3];
                        i8 = this.ao[i4];
                        i9 = this.ao[i5];
                        i6 = this.ah[i3];
                        i7 = this.ah[i4];
                        i12 = this.ah[i5];
                        i10 = this.af[i3];
                        i11 = this.af[i4];
                        i -= i8;
                        i9 -= i8;
                        i6 -= i7;
                        i12 -= i7;
                        i10 -= i11;
                        int i13 = this.af[i5] - i11;
                        if ((((i * i12) - (i9 * i6)) * i11) + ((i8 * ((i6 * i13) - (i10 * i12))) + (i7 * ((i10 * i9) - (i13 * i)))) > 0) {
                            this.ax[i2] = true;
                            i = bpVar.bv + (((this.aa[i4] + this.aa[i3]) + this.aa[i5]) / 3);
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i6 = iArr2[i];
                            iArr2[i] = i6 + 1;
                            iArr[i6] = i2;
                        }
                    } else {
                        if (z2 && dz.an(this.ac[i3], this.ac[i4], this.ac[i5], i6, i7, i12, 5, -989045215)) {
                            aw.aw(j);
                            z2 = false;
                        }
                        if (((this.ac[i5] - this.ac[i4]) * (i6 - i7)) - ((i12 - i7) * (this.ac[i3] - this.ac[i4])) > 0) {
                            this.ax[i2] = false;
                            if (i6 < 0 || i7 < 0 || i12 < 0 || i6 > this.bo.bl * 1505645037 || i7 > this.bo.bl * 1505645037 || i12 > this.bo.bl * 1505645037) {
                                this.az[i2] = true;
                            } else {
                                this.az[i2] = false;
                            }
                            i = ((this.aa[i5] + (this.aa[i4] + this.aa[i3])) / 3) + bpVar.bv;
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i6 = iArr2[i];
                            iArr2[i] = i6 + 1;
                            iArr[i6] = i2;
                        }
                    }
                }
                i = i2 + 1;
            }
            int[] iArr3;
            if (bpVar.aw == null) {
                for (i8 = bpVar.bc - 1; i8 >= 0; i8--) {
                    i9 = this.an[i8];
                    if (i9 > 0) {
                        iArr3 = this.ab[i8];
                        for (i = 0; i < i9; i++) {
                            aj(bpVar, iArr3[i], -1021615455);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            for (i = 0; i < 12; i++) {
                this.av[i] = 0;
                this.bs[i] = 0;
            }
            for (i8 = bpVar.bc - 1; i8 >= 0; i8--) {
                i9 = this.an[i8];
                if (i9 > 0) {
                    iArr3 = this.ab[i8];
                    for (i = 0; i < i9; i++) {
                        i7 = iArr3[i];
                        byte b = bpVar.aw[i7];
                        int[] iArr5 = this.av;
                        i11 = iArr5[b];
                        iArr5[b] = i11 + 1;
                        this.at[b][i11] = i7;
                        if (b < (byte) 10) {
                            iArr4 = this.bs;
                            iArr4[b] = iArr4[b] + i8;
                        } else if ((byte) 10 == b) {
                            this.bk[i11] = i8;
                        } else {
                            this.ba[i11] = i8;
                        }
                    }
                }
            }
            i = (this.av[1] > 0 || this.av[2] > 0) ? (this.bs[1] + this.bs[2]) / (this.av[2] + this.av[1]) : 0;
            i8 = (this.av[3] > 0 || this.av[4] > 0) ? (this.bs[3] + this.bs[4]) / (this.av[3] + this.av[4]) : 0;
            i9 = (this.av[6] > 0 || this.av[8] > 0) ? (this.bs[6] + this.bs[8]) / (this.av[8] + this.av[6]) : 0;
            i10 = this.av[10];
            int[] iArr6 = this.at[10];
            iArr4 = this.bk;
            if (i10 == 0) {
                i10 = this.av[11];
                iArr6 = this.at[11];
                iArr4 = this.ba;
            }
            i6 = i10 > 0 ? iArr4[0] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            i11 = 0;
            i5 = 0;
            while (i5 < 10) {
                int[] iArr7;
                i2 = i11;
                i3 = i10;
                i4 = i6;
                while (i5 == 0 && r12 > i) {
                    i6 = i2 + 1;
                    aj(bpVar, iArr6[i2], -1228341996);
                    if (i6 == i3 && this.at[11] != iArr6) {
                        i3 = this.av[11];
                        iArr6 = this.at[11];
                        iArr4 = this.ba;
                        i6 = 0;
                    }
                    if (i6 < i3) {
                        i4 = iArr4[i6];
                        i2 = i6;
                    } else {
                        i4 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        i2 = i6;
                    }
                }
                iArr3 = iArr4;
                i10 = i2;
                i11 = i3;
                while (i5 == 3 && r12 > i8) {
                    i7 = i10 + 1;
                    aj(bpVar, iArr6[i10], -1154186803);
                    if (i7 == i11 && iArr6 != this.at[11]) {
                        i11 = this.av[11];
                        iArr6 = this.at[11];
                        iArr3 = this.ba;
                        i7 = 0;
                    }
                    if (i7 < i11) {
                        i4 = iArr3[i7];
                        i10 = i7;
                    } else {
                        i4 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        i10 = i7;
                    }
                }
                while (true) {
                    iArr4 = iArr3;
                    i3 = i10;
                    i2 = i11;
                    if (5 != i5 || i4 <= i9) {
                        i10 = this.av[i5];
                        iArr7 = this.at[i5];
                    } else {
                        i10 = i3 + 1;
                        aj(bpVar, iArr6[i3], -206817881);
                        if (i10 != i2 || iArr6 == this.at[11]) {
                            iArr3 = iArr4;
                            i11 = i2;
                        } else {
                            i11 = this.av[11];
                            iArr4 = this.at[11];
                            iArr3 = this.ba;
                            i10 = 0;
                            iArr6 = iArr4;
                        }
                        i4 = i10 < i11 ? iArr3[i10] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                    }
                }
                i10 = this.av[i5];
                iArr7 = this.at[i5];
                for (i6 = 0; i6 < i10; i6++) {
                    aj(bpVar, iArr7[i6], 784121302);
                }
                i5++;
                i10 = i2;
                i11 = i3;
                i6 = i4;
            }
            int[] iArr8 = iArr4;
            iArr = iArr6;
            i9 = i10;
            i2 = i6;
            while (i2 != -1000) {
                i6 = i11 + 1;
                aj(bpVar, iArr[i11], -827114978);
                if (i9 == i6 && iArr != this.at[11]) {
                    iArr = this.at[11];
                    i9 = this.av[11];
                    iArr8 = this.ba;
                    i6 = 0;
                }
                if (i6 < i9) {
                    i11 = i6;
                    i2 = iArr8[i6];
                } else {
                    i11 = i6;
                    i2 = -1000;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ai(bp bpVar, int i, int i2) {
        try {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = this.bo.bd * -1240378447;
            int i10 = this.bo.bo * -1165057787;
            int i11 = bpVar.as[i];
            int i12 = bpVar.ag[i];
            int i13 = bpVar.ap[i];
            int i14 = this.af[i11];
            int i15 = this.af[i12];
            int i16 = this.af[i13];
            if (bpVar.ac == null) {
                this.bo.bm = 0;
            } else {
                this.bo.bm = (bpVar.ac[i] & 255) * 767944399;
            }
            if (i14 >= 50) {
                this.bm[0] = this.aw[i11];
                this.bq[0] = this.ac[i11];
                this.bd[0] = bpVar.au[i];
                i3 = 1;
            } else {
                i3 = this.ao[i11];
                i4 = this.ah[i11];
                i5 = bpVar.au[i];
                if (i16 >= 50) {
                    i6 = as[i16 - i14] * (50 - i14);
                    this.bm[0] = (((this.bo.bq * 1516652957) * ((((this.ao[i13] - i3) * i6) >> 16) + i3)) / 50) + i9;
                    this.bq[0] = ((((((this.ah[i13] - i4) * i6) >> 16) + i4) * (this.bo.bq * 1516652957)) / 50) + i10;
                    this.bd[0] = ((i6 * (bpVar.ax[i] - i5)) >> 16) + i5;
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                if (i15 >= 50) {
                    i7 = (50 - i14) * as[i15 - i14];
                    this.bm[i6] = (((i3 + (((this.ao[i12] - i3) * i7) >> 16)) * (this.bo.bq * 1516652957)) / 50) + i9;
                    this.bq[i6] = (((i4 + (((this.ah[i12] - i4) * i7) >> 16)) * (this.bo.bq * 1516652957)) / 50) + i10;
                    i3 = i6 + 1;
                    this.bd[i6] = i5 + ((i7 * (bpVar.az[i] - i5)) >> 16);
                } else {
                    i3 = i6;
                }
            }
            if (i15 >= 50) {
                this.bm[i3] = this.aw[i12];
                this.bq[i3] = this.ac[i12];
                i4 = i3 + 1;
                this.bd[i3] = bpVar.az[i];
            } else {
                i6 = this.ao[i12];
                i4 = this.ah[i12];
                i5 = bpVar.az[i];
                if (i14 >= 50) {
                    i7 = as[i14 - i15] * (50 - i15);
                    this.bm[i3] = ((((((this.ao[i11] - i6) * i7) >> 16) + i6) * (this.bo.bq * 1516652957)) / 50) + i9;
                    this.bq[i3] = (((this.bo.bq * 1516652957) * ((((this.ah[i11] - i4) * i7) >> 16) + i4)) / 50) + i10;
                    this.bd[i3] = ((i7 * (bpVar.au[i] - i5)) >> 16) + i5;
                    i3++;
                }
                if (i16 >= 50) {
                    i7 = (50 - i15) * as[i16 - i15];
                    this.bm[i3] = (((i6 + (((this.ao[i13] - i6) * i7) >> 16)) * (this.bo.bq * 1516652957)) / 50) + i9;
                    this.bq[i3] = (((i4 + (((this.ah[i13] - i4) * i7) >> 16)) * (this.bo.bq * 1516652957)) / 50) + i10;
                    i4 = i3 + 1;
                    this.bd[i3] = i5 + ((i7 * (bpVar.ax[i] - i5)) >> 16);
                } else {
                    i4 = i3;
                }
            }
            if (i16 >= 50) {
                this.bm[i4] = this.aw[i13];
                this.bq[i4] = this.ac[i13];
                i3 = i4 + 1;
                this.bd[i4] = bpVar.ax[i];
                i8 = i3;
            } else {
                i3 = this.ao[i13];
                i5 = this.ah[i13];
                i7 = bpVar.ax[i];
                if (i15 >= 50) {
                    i15 = (50 - i16) * as[i15 - i16];
                    this.bm[i4] = (((this.bo.bq * 1516652957) * ((((this.ao[i12] - i3) * i15) >> 16) + i3)) / 50) + i9;
                    this.bq[i4] = (((this.bo.bq * 1516652957) * ((((this.ah[i12] - i5) * i15) >> 16) + i5)) / 50) + i10;
                    i6 = i4 + 1;
                    this.bd[i4] = ((i15 * (bpVar.az[i] - i7)) >> 16) + i7;
                } else {
                    i6 = i4;
                }
                if (i14 >= 50) {
                    i4 = as[i14 - i16] * (50 - i16);
                    this.bm[i6] = (((i3 + (((this.ao[i11] - i3) * i4) >> 16)) * (this.bo.bq * 1516652957)) / 50) + i9;
                    this.bq[i6] = (((this.bo.bq * 1516652957) * ((((this.ah[i11] - i5) * i4) >> 16) + i5)) / 50) + i10;
                    i3 = i6 + 1;
                    this.bd[i6] = ((i4 * (bpVar.au[i] - i7)) >> 16) + i7;
                    i8 = i3;
                } else {
                    i8 = i6;
                }
            }
            i10 = this.bm[0];
            i14 = this.bm[1];
            i15 = this.bm[2];
            i6 = this.bq[0];
            i4 = this.bq[1];
            i9 = this.bq[2];
            this.bo.at = false;
            if (i8 == 3) {
                if (i10 < 0 || i14 < 0 || i15 < 0 || i10 > this.bo.bl * 1505645037 || i14 > this.bo.bl * 1505645037 || i15 > this.bo.bl * 1505645037) {
                    this.bo.at = true;
                }
                if (bpVar.ao != null && bpVar.ao[i] != (short) -1) {
                    int i17;
                    int i18;
                    int i19;
                    if (bpVar.aa == null || (byte) -1 == bpVar.aa[i]) {
                        i17 = i12;
                        i18 = i11;
                        i19 = i13;
                    } else {
                        i5 = bpVar.aa[i] & 255;
                        i16 = bpVar.ay[i5];
                        i17 = bpVar.an[i5];
                        i18 = i16;
                        i19 = bpVar.ab[i5];
                    }
                    if (bpVar.ax[i] == -1) {
                        ((be) this.bo).ak(i6, i4, i9, i10, i14, i15, bpVar.au[i], bpVar.au[i], bpVar.au[i], this.ao[i18], this.ao[i17], this.ao[i19], this.ah[i18], this.ah[i17], this.ah[i19], this.af[i18], this.af[i17], this.af[i19], bpVar.ao[i], -1121279786);
                    } else {
                        ((be) this.bo).ak(i6, i4, i9, i10, i14, i15, this.bd[0], this.bd[1], this.bd[2], this.ao[i18], this.ao[i17], this.ao[i19], this.ah[i18], this.ah[i17], this.ah[i19], this.af[i18], this.af[i17], this.af[i19], bpVar.ao[i], -2063979865);
                    }
                } else if (bpVar.ax[i] == -1) {
                    ((be) this.bo).ae(i6, i4, i9, i10, i14, i15, ak[bpVar.au[i]], 1758318475);
                } else {
                    ((be) this.bo).aj(i6, i4, i9, i10, i14, i15, this.bd[0], this.bd[1], this.bd[2], (byte) 16);
                }
            }
            if (4 == i8) {
                if (i10 < 0 || i14 < 0 || i15 < 0 || i10 > this.bo.bl * 1505645037 || i14 > this.bo.bl * 1505645037 || i15 > this.bo.bl * 1505645037 || this.bm[3] < 0 || this.bm[3] > this.bo.bl * 1505645037) {
                    this.bo.at = true;
                }
                if (bpVar.ao != null && bpVar.ao[i] != (short) -1) {
                    if (bpVar.aa == null || bpVar.aa[i] == (byte) -1) {
                        i8 = i12;
                    } else {
                        i3 = bpVar.aa[i] & 255;
                        i16 = bpVar.ay[i3];
                        i5 = bpVar.an[i3];
                        i13 = bpVar.ab[i3];
                        i11 = i16;
                        i8 = i5;
                    }
                    short s = bpVar.ao[i];
                    if (-1 == bpVar.ax[i]) {
                        ((be) this.bo).ak(i6, i4, i9, i10, i14, i15, bpVar.au[i], bpVar.au[i], bpVar.au[i], this.ao[i11], this.ao[i8], this.ao[i13], this.ah[i11], this.ah[i8], this.ah[i13], this.af[i11], this.af[i8], this.af[i13], s, -1918247986);
                        ((be) this.bo).ak(i6, i9, this.bq[3], i10, i15, this.bm[3], bpVar.au[i], bpVar.au[i], bpVar.au[i], this.ao[i11], this.ao[i8], this.ao[i13], this.ah[i11], this.ah[i8], this.ah[i13], this.af[i11], this.af[i8], this.af[i13], s, 58248795);
                        return;
                    }
                    ((be) this.bo).ak(i6, i4, i9, i10, i14, i15, this.bd[0], this.bd[1], this.bd[2], this.ao[i11], this.ao[i8], this.ao[i13], this.ah[i11], this.ah[i8], this.ah[i13], this.af[i11], this.af[i8], this.af[i13], s, 103347252);
                    ((be) this.bo).ak(i6, i9, this.bq[3], i10, i15, this.bm[3], this.bd[0], this.bd[2], this.bd[3], this.ao[i11], this.ao[i8], this.ao[i13], this.ah[i11], this.ah[i8], this.ah[i13], this.af[i11], this.af[i8], this.af[i13], s, 438170834);
                } else if (bpVar.ax[i] == -1) {
                    i16 = ak[bpVar.au[i]];
                    ((be) this.bo).ae(i6, i4, i9, i10, i14, i15, i16, 1668222530);
                    ((be) this.bo).ae(i6, i9, this.bq[3], i10, i15, this.bm[3], i16, 1804854272);
                } else {
                    ((be) this.bo).aj(i6, i4, i9, i10, i14, i15, this.bd[0], this.bd[1], this.bd[2], (byte) 16);
                    ((be) this.bo).aj(i6, i9, this.bq[3], i10, i15, this.bm[3], this.bd[0], this.bd[2], this.bd[3], (byte) 16);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("af.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aj(bp bpVar, int i, int i2) {
        try {
            if (this.ax[i]) {
                ai(bpVar, i, 1669968516);
                return;
            }
            int i3 = bpVar.as[i];
            int i4 = bpVar.ag[i];
            int i5 = bpVar.ap[i];
            this.bo.at = this.az[i];
            if (bpVar.ac == null) {
                this.bo.bm = 0;
            } else {
                this.bo.bm = (bpVar.ac[i] & 255) * 767944399;
            }
            if (bpVar.ao != null && bpVar.ao[i] != (short) -1) {
                int i6;
                int i7;
                int i8;
                if (bpVar.aa == null || (byte) -1 == bpVar.aa[i]) {
                    i6 = i4;
                    i7 = i3;
                    i8 = i5;
                } else {
                    int i9 = bpVar.aa[i] & 255;
                    int i10 = bpVar.ay[i9];
                    i6 = bpVar.an[i9];
                    i7 = i10;
                    i8 = bpVar.ab[i9];
                }
                if (bpVar.ax[i] == -1) {
                    ((be) this.bo).ak(this.ac[i3], this.ac[i4], this.ac[i5], this.aw[i3], this.aw[i4], this.aw[i5], bpVar.au[i], bpVar.au[i], bpVar.au[i], this.ao[i7], this.ao[i6], this.ao[i8], this.ah[i7], this.ah[i6], this.ah[i8], this.af[i7], this.af[i6], this.af[i8], bpVar.ao[i], -1724112542);
                } else {
                    ((be) this.bo).ak(this.ac[i3], this.ac[i4], this.ac[i5], this.aw[i3], this.aw[i4], this.aw[i5], bpVar.au[i], bpVar.az[i], bpVar.ax[i], this.ao[i7], this.ao[i6], this.ao[i8], this.ah[i7], this.ah[i6], this.ah[i8], this.af[i7], this.af[i6], this.af[i8], bpVar.ao[i], -1870078986);
                }
            } else if (-1 == bpVar.ax[i]) {
                ((be) this.bo).ae(this.ac[i3], this.ac[i4], this.ac[i5], this.aw[i3], this.aw[i4], this.aw[i5], ak[bpVar.au[i]], 2125845081);
            } else {
                ((be) this.bo).aj(this.ac[i3], this.ac[i4], this.ac[i5], this.aw[i3], this.aw[i4], this.aw[i5], bpVar.au[i], bpVar.az[i], bpVar.ax[i], (byte) 16);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("af.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ak(bp bpVar, boolean z, boolean z2, long j) {
        if (bpVar.bc < 1600) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int[] iArr;
            for (i = 0; i < bpVar.bc; i++) {
                this.an[i] = 0;
            }
            i = 0;
            while (true) {
                i2 = i;
                if (i2 >= bpVar.ak) {
                    break;
                }
                if (-2 != bpVar.ax[i2]) {
                    i3 = bpVar.as[i2];
                    i4 = bpVar.ag[i2];
                    int i11 = bpVar.ap[i2];
                    i5 = this.aw[i3];
                    i6 = this.aw[i4];
                    int i12 = this.aw[i11];
                    int[] iArr2;
                    if (z && (i5 == -785258469 || i6 == -1862875330 || -5000 == i12)) {
                        i = this.ao[i3];
                        i7 = this.ao[i4];
                        i8 = this.ao[i11];
                        i5 = this.ah[i3];
                        i6 = this.ah[i4];
                        i12 = this.ah[i11];
                        i9 = this.af[i3];
                        i10 = this.af[i4];
                        i -= i7;
                        i8 -= i7;
                        i5 -= i6;
                        i12 -= i6;
                        i9 -= i10;
                        int i13 = this.af[i11] - i10;
                        if ((((i * i12) - (i8 * i5)) * i10) + ((i7 * ((i5 * i13) - (i9 * i12))) + (i6 * ((i9 * i8) - (i13 * i)))) > 0) {
                            this.ax[i2] = true;
                            i = bpVar.bv + (((this.aa[i4] + this.aa[i3]) + this.aa[i11]) / 3);
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    } else {
                        if (z2 && dz.an(this.ac[i3], this.ac[i4], this.ac[i11], i5, i6, i12, 5, 662312439)) {
                            aw.aw(j);
                            z2 = false;
                        }
                        if (((this.ac[i11] - this.ac[i4]) * (i5 - i6)) - ((i12 - i6) * (this.ac[i3] - this.ac[i4])) > 0) {
                            this.ax[i2] = false;
                            if (i5 < 0 || i6 < 0 || i12 < 0 || i5 > this.bo.bl * 1505645037 || i6 > this.bo.bl * 1505645037 || i12 > this.bo.bl * 1505645037) {
                                this.az[i2] = true;
                            } else {
                                this.az[i2] = false;
                            }
                            i = ((this.aa[i11] + (this.aa[i4] + this.aa[i3])) / 3) + bpVar.bv;
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    }
                }
                i = i2 + 1;
            }
            int[] iArr3;
            if (bpVar.aw == null) {
                for (i7 = bpVar.bc - 1; i7 >= 0; i7--) {
                    i8 = this.an[i7];
                    if (i8 > 0) {
                        iArr3 = this.ab[i7];
                        for (i = 0; i < i8; i++) {
                            aj(bpVar, iArr3[i], -652678941);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            for (i = 0; i < 12; i++) {
                this.av[i] = 0;
                this.bs[i] = 0;
            }
            for (i7 = bpVar.bc - 1; i7 >= 0; i7--) {
                i8 = this.an[i7];
                if (i8 > 0) {
                    iArr3 = this.ab[i7];
                    for (i = 0; i < i8; i++) {
                        i6 = iArr3[i];
                        byte b = bpVar.aw[i6];
                        int[] iArr5 = this.av;
                        i10 = iArr5[b];
                        iArr5[b] = i10 + 1;
                        this.at[b][i10] = i6;
                        if (b < (byte) 10) {
                            iArr4 = this.bs;
                            iArr4[b] = iArr4[b] + i7;
                        } else if ((byte) 10 == b) {
                            this.bk[i10] = i7;
                        } else {
                            this.ba[i10] = i7;
                        }
                    }
                }
            }
            i = (this.av[1] > 0 || this.av[2] > 0) ? (this.bs[1] + this.bs[2]) / (this.av[2] + this.av[1]) : 0;
            i7 = (this.av[3] > 0 || this.av[4] > 0) ? (this.bs[3] + this.bs[4]) / (this.av[3] + this.av[4]) : 0;
            i8 = (this.av[6] > 0 || this.av[8] > 0) ? (this.bs[6] + this.bs[8]) / (this.av[8] + this.av[6]) : 0;
            i9 = this.av[10];
            int[] iArr6 = this.at[10];
            iArr4 = this.bk;
            if (i9 == 0) {
                i9 = this.av[11];
                iArr6 = this.at[11];
                iArr4 = this.ba;
            }
            i5 = i9 > 0 ? iArr4[0] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            i10 = 0;
            i4 = 0;
            while (i4 < 10) {
                while (i4 == 0 && r5 > i) {
                    i5 = i10 + 1;
                    aj(bpVar, iArr6[i10], 1881555045);
                    if (i5 != i9 || this.at[11] == iArr6) {
                        i10 = i5;
                    } else {
                        i9 = this.av[11];
                        iArr6 = this.at[11];
                        iArr4 = this.ba;
                        i10 = 0;
                    }
                    i5 = i10 < i9 ? iArr4[i10] : 1950262084;
                }
                while (i4 == 3 && i5 > i7) {
                    i5 = i10 + 1;
                    aj(bpVar, iArr6[i10], 2034883883);
                    if (i5 != i9 || iArr6 == this.at[11]) {
                        i10 = i5;
                    } else {
                        i9 = this.av[11];
                        iArr6 = this.at[11];
                        iArr4 = this.ba;
                        i10 = 0;
                    }
                    i5 = i10 < i9 ? iArr4[i10] : 1212487745;
                }
                i2 = i10;
                i3 = i5;
                while (5 == i4 && i3 > i8) {
                    i10 = i2 + 1;
                    aj(bpVar, iArr6[i2], 1897114101);
                    if (i10 != i9 || iArr6 == this.at[11]) {
                        iArr3 = iArr4;
                    } else {
                        i9 = this.av[11];
                        iArr4 = this.at[11];
                        iArr3 = this.ba;
                        i10 = 0;
                        iArr6 = iArr4;
                    }
                    if (i10 < i9) {
                        i3 = iArr3[i10];
                        iArr4 = iArr3;
                        i2 = i10;
                    } else {
                        i3 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        iArr4 = iArr3;
                        i2 = i10;
                    }
                }
                i10 = this.av[i4];
                int[] iArr7 = this.at[i4];
                for (i5 = 0; i5 < i10; i5++) {
                    aj(bpVar, iArr7[i5], 1555136026);
                }
                i4++;
                i10 = i2;
                i5 = i3;
            }
            int[] iArr8 = iArr4;
            iArr = iArr6;
            i8 = i9;
            i2 = i5;
            while (i2 != -1000) {
                i5 = i10 + 1;
                aj(bpVar, iArr[i10], 974737876);
                if (i8 == i5 && iArr != this.at[11]) {
                    iArr = this.at[11];
                    i8 = this.av[11];
                    iArr8 = this.ba;
                    i5 = 0;
                }
                if (i5 < i8) {
                    i10 = i5;
                    i2 = iArr8[i5];
                } else {
                    i10 = i5;
                    i2 = -890390801;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:148:?, code skipped:
            r6 = r18.av[r9];
            r13 = r18.at[r9];
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:149:0x03de, code skipped:
            if (r3 >= r6) goto L_0x0462;
     */
    /* JADX WARNING: Missing block: B:150:0x03e0, code skipped:
            aj(r19, r13[r3], -1040412100);
            r3 = r3 + 1;
     */
    /* JADX WARNING: Missing block: B:175:0x0462, code skipped:
            r9 = r9 + 1;
            r3 = r2;
            r6 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void al(bp bpVar, boolean z, boolean z2, long j) {
        try {
            if (bpVar.bc < 1600) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int[] iArr;
                int[] iArr2;
                for (i = 0; i < bpVar.bc; i++) {
                    this.an[i] = 0;
                }
                boolean z3 = z2;
                for (i2 = 0; i2 < bpVar.ak; i2++) {
                    if (-2 != bpVar.ax[i2]) {
                        i3 = bpVar.as[i2];
                        int i11 = bpVar.ag[i2];
                        int i12 = bpVar.ap[i2];
                        i4 = this.aw[i3];
                        i5 = this.aw[i11];
                        i6 = this.aw[i12];
                        int[] iArr3;
                        if (z && (i4 == -5000 || i5 == -5000 || -5000 == i6)) {
                            i = this.ao[i3];
                            i7 = this.ao[i11];
                            i8 = this.ao[i12];
                            i4 = this.ah[i3];
                            i5 = this.ah[i11];
                            i6 = this.ah[i12];
                            i9 = this.af[i3];
                            i10 = this.af[i11];
                            i -= i7;
                            i8 -= i7;
                            i4 -= i5;
                            i6 -= i5;
                            i9 -= i10;
                            int i13 = this.af[i12] - i10;
                            if ((((i * i6) - (i8 * i4)) * i10) + ((i7 * ((i4 * i13) - (i9 * i6))) + (i5 * ((i9 * i8) - (i13 * i)))) > 0) {
                                this.ax[i2] = true;
                                i = bpVar.bv + (((this.aa[i11] + this.aa[i3]) + this.aa[i12]) / 3);
                                iArr = this.ab[i];
                                iArr3 = this.an;
                                i4 = iArr3[i];
                                iArr3[i] = i4 + 1;
                                iArr[i4] = i2;
                            }
                        } else {
                            boolean z4;
                            if (!z3) {
                                z4 = z3;
                            } else if (dz.an(this.ac[i3], this.ac[i11], this.ac[i12], i4, i5, i6, 5, 1638867378)) {
                                aw.aw(j);
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (((this.ac[i12] - this.ac[i11]) * (i4 - i5)) - ((i6 - i5) * (this.ac[i3] - this.ac[i11])) > 0) {
                                this.ax[i2] = false;
                                if (i4 < 0 || i5 < 0 || i6 < 0 || i4 > this.bo.bl * 1505645037 || i5 > this.bo.bl * 1505645037 || i6 > this.bo.bl * 1505645037) {
                                    this.az[i2] = true;
                                } else {
                                    this.az[i2] = false;
                                }
                                i7 = ((this.aa[i12] + (this.aa[i11] + this.aa[i3])) / 3) + bpVar.bv;
                                iArr3 = this.ab[i7];
                                iArr2 = this.an;
                                i5 = iArr2[i7];
                                iArr2[i7] = i5 + 1;
                                iArr3[i5] = i2;
                                z3 = z4;
                            } else {
                                z3 = z4;
                            }
                        }
                    }
                }
                if (bpVar.aw == null) {
                    for (i7 = bpVar.bc - 1; i7 >= 0; i7--) {
                        i8 = this.an[i7];
                        if (i8 > 0) {
                            iArr2 = this.ab[i7];
                            for (i = 0; i < i8; i++) {
                                aj(bpVar, iArr2[i], -503260942);
                            }
                        }
                    }
                    return;
                }
                int[] iArr4;
                for (i = 0; i < 12; i++) {
                    this.av[i] = 0;
                    this.bs[i] = 0;
                }
                for (i7 = bpVar.bc - 1; i7 >= 0; i7--) {
                    i8 = this.an[i7];
                    if (i8 > 0) {
                        iArr2 = this.ab[i7];
                        for (i = 0; i < i8; i++) {
                            i5 = iArr2[i];
                            byte b = bpVar.aw[i5];
                            int[] iArr5 = this.av;
                            i10 = iArr5[b];
                            iArr5[b] = i10 + 1;
                            this.at[b][i10] = i5;
                            if (b < (byte) 10) {
                                int[] iArr6 = this.bs;
                                iArr6[b] = iArr6[b] + i7;
                            } else if ((byte) 10 == b) {
                                this.bk[i10] = i7;
                            } else {
                                this.ba[i10] = i7;
                            }
                        }
                    }
                }
                i3 = (this.av[1] > 0 || this.av[2] > 0) ? (this.bs[1] + this.bs[2]) / (this.av[2] + this.av[1]) : 0;
                i2 = (this.av[3] > 0 || this.av[4] > 0) ? (this.bs[3] + this.bs[4]) / (this.av[3] + this.av[4]) : 0;
                int i14 = (this.av[6] > 0 || this.av[8] > 0) ? (this.bs[6] + this.bs[8]) / (this.av[8] + this.av[6]) : 0;
                i8 = this.av[10];
                iArr2 = this.at[10];
                iArr = this.bk;
                if (i8 == 0) {
                    i8 = this.av[11];
                    iArr2 = this.at[11];
                    iArr = this.ba;
                }
                i5 = 0;
                i10 = 0;
                i6 = i8 > 0 ? iArr[0] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                while (i10 < 10) {
                    iArr4 = iArr;
                    while (i10 == 0 && r7 > i3) {
                        i7 = i5 + 1;
                        aj(bpVar, iArr2[i5], 293026349);
                        if (i7 == i8 && this.at[11] != iArr2) {
                            i8 = this.av[11];
                            iArr2 = this.at[11];
                            iArr4 = this.ba;
                            i7 = 0;
                        }
                        if (i7 < i8) {
                            i6 = iArr4[i7];
                            i5 = i7;
                        } else {
                            i6 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                            i5 = i7;
                        }
                    }
                    iArr = iArr2;
                    while (i10 == 3 && r7 > i2) {
                        i4 = i5 + 1;
                        aj(bpVar, iArr[i5], -329842646);
                        if (i4 == i8 && iArr != this.at[11]) {
                            i8 = this.av[11];
                            iArr = this.at[11];
                            iArr4 = this.ba;
                            i4 = 0;
                        }
                        if (i4 < i8) {
                            i6 = iArr4[i4];
                            i5 = i4;
                        } else {
                            i6 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                            i5 = i4;
                        }
                    }
                    while (true) {
                        iArr2 = iArr;
                        i9 = i5;
                        if (5 != i10 || r7 <= i14) {
                            break;
                        }
                        i5 = i9 + 1;
                        aj(bpVar, iArr2[i9], 410104108);
                        if (i5 != i8 || iArr2 == this.at[11]) {
                            iArr = iArr2;
                        } else {
                            i8 = this.av[11];
                            iArr = this.at[11];
                            iArr4 = this.ba;
                            i5 = 0;
                        }
                        i6 = i5 < i8 ? iArr4[i5] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                    }
                }
                iArr4 = iArr2;
                while (i6 != -1000) {
                    i4 = i5 + 1;
                    aj(bpVar, iArr4[i5], -716590236);
                    if (i8 == i4 && iArr4 != this.at[11]) {
                        iArr4 = this.at[11];
                        i8 = this.av[11];
                        iArr = this.ba;
                        i4 = 0;
                    }
                    if (i4 < i8) {
                        i6 = iArr[i4];
                        i5 = i4;
                    } else {
                        i6 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        i5 = i4;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("af.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void am(bp bpVar, boolean z, boolean z2, long j) {
        if (bpVar.bc < 1600) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int[] iArr;
            for (i = 0; i < bpVar.bc; i++) {
                this.an[i] = 0;
            }
            i = 0;
            while (true) {
                i2 = i;
                if (i2 >= bpVar.ak) {
                    break;
                }
                if (-522177131 != bpVar.ax[i2]) {
                    i3 = bpVar.as[i2];
                    i4 = bpVar.ag[i2];
                    i5 = bpVar.ap[i2];
                    i6 = this.aw[i3];
                    i7 = this.aw[i4];
                    int i13 = this.aw[i5];
                    int[] iArr2;
                    if (z && (i6 == -746604545 || i7 == 1155788687 || 249917222 == i13)) {
                        i = this.ao[i3];
                        i8 = this.ao[i4];
                        i9 = this.ao[i5];
                        i6 = this.ah[i3];
                        i7 = this.ah[i4];
                        i13 = this.ah[i5];
                        i10 = this.af[i3];
                        i11 = this.af[i4];
                        i -= i8;
                        i9 -= i8;
                        i6 -= i7;
                        i13 -= i7;
                        i10 -= i11;
                        i12 = this.af[i5] - i11;
                        if ((((i * i13) - (i9 * i6)) * i11) + ((i8 * ((i6 * i12) - (i10 * i13))) + (i7 * ((i10 * i9) - (i12 * i)))) > 0) {
                            this.ax[i2] = true;
                            i = bpVar.bv + (((this.aa[i4] + this.aa[i3]) + this.aa[i5]) / 3);
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i6 = iArr2[i];
                            iArr2[i] = i6 + 1;
                            iArr[i6] = i2;
                        }
                    } else {
                        if (z2 && dz.an(this.ac[i3], this.ac[i4], this.ac[i5], i6, i7, i13, 5, 888923714)) {
                            aw.aw(j);
                            z2 = false;
                        }
                        if (((this.ac[i5] - this.ac[i4]) * (i6 - i7)) - ((i13 - i7) * (this.ac[i3] - this.ac[i4])) > 0) {
                            this.ax[i2] = false;
                            if (i6 < 0 || i7 < 0 || i13 < 0 || i6 > this.bo.bl * 1698138669 || i7 > this.bo.bl * 754375613 || i13 > this.bo.bl * 256500001) {
                                this.az[i2] = true;
                            } else {
                                this.az[i2] = false;
                            }
                            i = ((this.aa[i5] + (this.aa[i4] + this.aa[i3])) / 3) + bpVar.bv;
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i6 = iArr2[i];
                            iArr2[i] = i6 + 1;
                            iArr[i6] = i2;
                        }
                    }
                }
                i = i2 + 1;
            }
            int[] iArr3;
            if (bpVar.aw == null) {
                for (i8 = bpVar.bc - 1; i8 >= 0; i8--) {
                    i9 = this.an[i8];
                    if (i9 > 0) {
                        iArr3 = this.ab[i8];
                        for (i = 0; i < i9; i++) {
                            aj(bpVar, iArr3[i], -1091967157);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            for (i = 0; i < 12; i++) {
                this.av[i] = 0;
                this.bs[i] = 0;
            }
            for (i8 = bpVar.bc - 1; i8 >= 0; i8--) {
                i9 = this.an[i8];
                if (i9 > 0) {
                    iArr3 = this.ab[i8];
                    for (i = 0; i < i9; i++) {
                        i7 = iArr3[i];
                        byte b = bpVar.aw[i7];
                        int[] iArr5 = this.av;
                        i11 = iArr5[b];
                        iArr5[b] = i11 + 1;
                        this.at[b][i11] = i7;
                        if (b < (byte) 10) {
                            iArr4 = this.bs;
                            iArr4[b] = iArr4[b] + i8;
                        } else if ((byte) 10 == b) {
                            this.bk[i11] = i8;
                        } else {
                            this.ba[i11] = i8;
                        }
                    }
                }
            }
            i = (this.av[1] > 0 || this.av[2] > 0) ? (this.bs[1] + this.bs[2]) / (this.av[2] + this.av[1]) : 0;
            i8 = (this.av[3] > 0 || this.av[4] > 0) ? (this.bs[3] + this.bs[4]) / (this.av[3] + this.av[4]) : 0;
            i9 = (this.av[6] > 0 || this.av[8] > 0) ? (this.bs[6] + this.bs[8]) / (this.av[8] + this.av[6]) : 0;
            i10 = this.av[10];
            int[] iArr6 = this.at[10];
            iArr4 = this.bk;
            if (i10 == 0) {
                i10 = this.av[11];
                iArr6 = this.at[11];
                iArr4 = this.ba;
            }
            i6 = i10 > 0 ? iArr4[0] : NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            i11 = 0;
            i12 = 0;
            while (i12 < 10) {
                int[] iArr7;
                i3 = i11;
                i4 = i10;
                i5 = i6;
                while (i12 == 0 && r13 > i) {
                    i6 = i3 + 1;
                    aj(bpVar, iArr6[i3], -1332534162);
                    if (i6 == i4 && this.at[11] != iArr6) {
                        i4 = this.av[11];
                        iArr6 = this.at[11];
                        iArr4 = this.ba;
                        i6 = 0;
                    }
                    if (i6 < i4) {
                        i5 = iArr4[i6];
                        i3 = i6;
                    } else {
                        i5 = -1851866013;
                        i3 = i6;
                    }
                }
                iArr3 = iArr4;
                i10 = i3;
                i11 = i4;
                while (i12 == 3 && r13 > i8) {
                    i7 = i10 + 1;
                    aj(bpVar, iArr6[i10], -1282672674);
                    if (i7 == i11 && iArr6 != this.at[11]) {
                        i11 = this.av[11];
                        iArr6 = this.at[11];
                        iArr3 = this.ba;
                        i7 = 0;
                    }
                    if (i7 < i11) {
                        i5 = iArr3[i7];
                        i10 = i7;
                    } else {
                        i5 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        i10 = i7;
                    }
                }
                while (true) {
                    iArr4 = iArr3;
                    i4 = i10;
                    i3 = i11;
                    if (5 != i12 || i5 <= i9) {
                        i10 = this.av[i12];
                        iArr7 = this.at[i12];
                    } else {
                        i10 = i4 + 1;
                        aj(bpVar, iArr6[i4], -637701542);
                        if (i10 != i3 || iArr6 == this.at[11]) {
                            iArr3 = iArr4;
                            i11 = i3;
                        } else {
                            i11 = this.av[11];
                            iArr4 = this.at[11];
                            iArr3 = this.ba;
                            i10 = 0;
                            iArr6 = iArr4;
                        }
                        i5 = i10 < i11 ? iArr3[i10] : -1780431730;
                    }
                }
                i10 = this.av[i12];
                iArr7 = this.at[i12];
                for (i6 = 0; i6 < i10; i6++) {
                    aj(bpVar, iArr7[i6], 1031779200);
                }
                i12++;
                i10 = i3;
                i11 = i4;
                i6 = i5;
            }
            int[] iArr8 = iArr4;
            iArr = iArr6;
            i9 = i10;
            i2 = i6;
            while (i2 != 1714603034) {
                i6 = i11 + 1;
                aj(bpVar, iArr[i11], -63407820);
                if (i9 == i6 && iArr != this.at[11]) {
                    iArr = this.at[11];
                    i9 = this.av[11];
                    iArr8 = this.ba;
                    i6 = 0;
                }
                if (i6 < i9) {
                    i11 = i6;
                    i2 = iArr8[i6];
                } else {
                    i11 = i6;
                    i2 = -1000;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void ap(bp bpVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.bo.bd * -1240378447;
        int i9 = this.bo.bo * -1165057787;
        int i10 = bpVar.as[i];
        int i11 = bpVar.ag[i];
        int i12 = bpVar.ap[i];
        int i13 = this.af[i10];
        int i14 = this.af[i11];
        int i15 = this.af[i12];
        if (bpVar.ac == null) {
            this.bo.bm = 0;
        } else {
            this.bo.bm = (bpVar.ac[i] & 255) * 767944399;
        }
        if (i13 >= 50) {
            this.bm[0] = this.aw[i10];
            this.bq[0] = this.ac[i10];
            this.bd[0] = bpVar.au[i];
            i2 = 1;
        } else {
            i2 = this.ao[i10];
            i3 = this.ah[i10];
            i4 = bpVar.au[i];
            if (i15 >= 50) {
                i5 = as[i15 - i13] * (50 - i13);
                this.bm[0] = (((this.bo.bq * 1516652957) * ((((this.ao[i12] - i2) * i5) >> 16) + i2)) / 50) + i8;
                this.bq[0] = ((((((this.ah[i12] - i3) * i5) >> 16) + i3) * (this.bo.bq * 1516652957)) / 50) + i9;
                this.bd[0] = ((i5 * (bpVar.ax[i] - i4)) >> 16) + i4;
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (i14 >= 50) {
                i6 = (50 - i13) * as[i14 - i13];
                this.bm[i5] = (((i2 + (((this.ao[i11] - i2) * i6) >> 16)) * (this.bo.bq * 1516652957)) / 50) + i8;
                this.bq[i5] = (((i3 + (((this.ah[i11] - i3) * i6) >> 16)) * (this.bo.bq * 1516652957)) / 50) + i9;
                i2 = i5 + 1;
                this.bd[i5] = i4 + ((i6 * (bpVar.az[i] - i4)) >> 16);
            } else {
                i2 = i5;
            }
        }
        if (i14 >= 50) {
            this.bm[i2] = this.aw[i11];
            this.bq[i2] = this.ac[i11];
            i5 = i2 + 1;
            this.bd[i2] = bpVar.az[i];
        } else {
            i5 = this.ao[i11];
            i3 = this.ah[i11];
            i4 = bpVar.az[i];
            if (i13 >= 50) {
                i6 = as[i13 - i14] * (50 - i14);
                this.bm[i2] = ((((((this.ao[i10] - i5) * i6) >> 16) + i5) * (this.bo.bq * 1516652957)) / 50) + i8;
                this.bq[i2] = (((this.bo.bq * 1516652957) * ((((this.ah[i10] - i3) * i6) >> 16) + i3)) / 50) + i9;
                this.bd[i2] = ((i6 * (bpVar.au[i] - i4)) >> 16) + i4;
                i2++;
            }
            if (i15 >= 50) {
                i6 = (50 - i14) * as[i15 - i14];
                this.bm[i2] = (((i5 + (((this.ao[i12] - i5) * i6) >> 16)) * (this.bo.bq * 1516652957)) / 50) + i8;
                this.bq[i2] = (((i3 + (((this.ah[i12] - i3) * i6) >> 16)) * (this.bo.bq * 1516652957)) / 50) + i9;
                i5 = i2 + 1;
                this.bd[i2] = i4 + ((i6 * (bpVar.ax[i] - i4)) >> 16);
            } else {
                i5 = i2;
            }
        }
        if (i15 >= 50) {
            this.bm[i5] = this.aw[i12];
            this.bq[i5] = this.ac[i12];
            i2 = i5 + 1;
            this.bd[i5] = bpVar.ax[i];
            i7 = i2;
        } else {
            i3 = this.ao[i12];
            i4 = this.ah[i12];
            i6 = bpVar.ax[i];
            if (i14 >= 50) {
                i14 = (50 - i15) * as[i14 - i15];
                this.bm[i5] = (((this.bo.bq * 1516652957) * ((((this.ao[i11] - i3) * i14) >> 16) + i3)) / 50) + i8;
                this.bq[i5] = (((this.bo.bq * 1516652957) * ((((this.ah[i11] - i4) * i14) >> 16) + i4)) / 50) + i9;
                i2 = i5 + 1;
                this.bd[i5] = ((i14 * (bpVar.az[i] - i6)) >> 16) + i6;
            } else {
                i2 = i5;
            }
            if (i13 >= 50) {
                i13 = (50 - i15) * as[i13 - i15];
                this.bm[i2] = i8 + ((((((this.ao[i10] - i3) * i13) >> 16) + i3) * (this.bo.bq * 1516652957)) / 50);
                this.bq[i2] = (((this.bo.bq * 1516652957) * ((((this.ah[i10] - i4) * i13) >> 16) + i4)) / 50) + i9;
                i5 = i2 + 1;
                this.bd[i2] = (((bpVar.au[i] - i6) * i13) >> 16) + i6;
                i7 = i5;
            } else {
                i7 = i2;
            }
        }
        i13 = this.bm[0];
        i14 = this.bm[1];
        i15 = this.bm[2];
        i2 = this.bq[0];
        i8 = this.bq[1];
        i9 = this.bq[2];
        this.bo.at = false;
        if (i7 == 3) {
            if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > this.bo.bl * 1505645037 || i14 > this.bo.bl * 1505645037 || i15 > this.bo.bl * 1505645037) {
                this.bo.at = true;
            }
            if (bpVar.ao != null && bpVar.ao[i] != (short) -1) {
                int i16;
                int i17;
                int i18;
                if (bpVar.aa == null || (byte) -1 == bpVar.aa[i]) {
                    i16 = i11;
                    i17 = i10;
                    i18 = i12;
                } else {
                    i4 = bpVar.aa[i] & 255;
                    i3 = bpVar.ay[i4];
                    i16 = bpVar.an[i4];
                    i17 = i3;
                    i18 = bpVar.ab[i4];
                }
                if (bpVar.ax[i] == -1) {
                    ((be) this.bo).ak(i2, i8, i9, i13, i14, i15, bpVar.au[i], bpVar.au[i], bpVar.au[i], this.ao[i17], this.ao[i16], this.ao[i18], this.ah[i17], this.ah[i16], this.ah[i18], this.af[i17], this.af[i16], this.af[i18], bpVar.ao[i], -1106545840);
                } else {
                    ((be) this.bo).ak(i2, i8, i9, i13, i14, i15, this.bd[0], this.bd[1], this.bd[2], this.ao[i17], this.ao[i16], this.ao[i18], this.ah[i17], this.ah[i16], this.ah[i18], this.af[i17], this.af[i16], this.af[i18], bpVar.ao[i], -1864906082);
                }
            } else if (bpVar.ax[i] == -1) {
                ((be) this.bo).ae(i2, i8, i9, i13, i14, i15, ak[bpVar.au[i]], 1794337112);
            } else {
                ((be) this.bo).aj(i2, i8, i9, i13, i14, i15, this.bd[0], this.bd[1], this.bd[2], (byte) 16);
            }
        }
        if (4 == i7) {
            if (i13 < 0 || i14 < 0 || i15 < 0 || i13 > this.bo.bl * 1505645037 || i14 > this.bo.bl * 1505645037 || i15 > this.bo.bl * 1505645037 || this.bm[3] < 0 || this.bm[3] > this.bo.bl * 1505645037) {
                this.bo.at = true;
            }
            if (bpVar.ao != null && bpVar.ao[i] != (short) -1) {
                if (bpVar.aa == null || bpVar.aa[i] == (byte) -1) {
                    i7 = i10;
                } else {
                    i5 = bpVar.aa[i] & 255;
                    i10 = bpVar.ay[i5];
                    i11 = bpVar.an[i5];
                    i12 = bpVar.ab[i5];
                    i7 = i10;
                }
                short s = bpVar.ao[i];
                if (-1 == bpVar.ax[i]) {
                    ((be) this.bo).ak(i2, i8, i9, i13, i14, i15, bpVar.au[i], bpVar.au[i], bpVar.au[i], this.ao[i7], this.ao[i11], this.ao[i12], this.ah[i7], this.ah[i11], this.ah[i12], this.af[i7], this.af[i11], this.af[i12], s, -101056309);
                    ((be) this.bo).ak(i2, i9, this.bq[3], i13, i15, this.bm[3], bpVar.au[i], bpVar.au[i], bpVar.au[i], this.ao[i7], this.ao[i11], this.ao[i12], this.ah[i7], this.ah[i11], this.ah[i12], this.af[i7], this.af[i11], this.af[i12], s, 425645554);
                    return;
                }
                ((be) this.bo).ak(i2, i8, i9, i13, i14, i15, this.bd[0], this.bd[1], this.bd[2], this.ao[i7], this.ao[i11], this.ao[i12], this.ah[i7], this.ah[i11], this.ah[i12], this.af[i7], this.af[i11], this.af[i12], s, -907013145);
                ((be) this.bo).ak(i2, i9, this.bq[3], i13, i15, this.bm[3], this.bd[0], this.bd[2], this.bd[3], this.ao[i7], this.ao[i11], this.ao[i12], this.ah[i7], this.ah[i11], this.ah[i12], this.af[i7], this.af[i11], this.af[i12], s, -542105310);
            } else if (bpVar.ax[i] == -1) {
                i3 = ak[bpVar.au[i]];
                ((be) this.bo).ae(i2, i8, i9, i13, i14, i15, i3, 1846839202);
                ((be) this.bo).ae(i2, i9, this.bq[3], i13, i15, this.bm[3], i3, 1607685766);
            } else {
                ((be) this.bo).aj(i2, i8, i9, i13, i14, i15, this.bd[0], this.bd[1], this.bd[2], (byte) 16);
                ((be) this.bo).aj(i2, i9, this.bq[3], i13, i15, this.bm[3], this.bd[0], this.bd[2], this.bd[3], (byte) 16);
            }
        }
    }

    public final void aq(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            int i10 = 0;
            this.an[0] = -1;
            if (!(bpVar.bf == 2 || 1 == bpVar.bf)) {
                bpVar.ae();
            }
            int i11 = this.bo.bd * -1240378447;
            int i12 = this.bo.bo;
            int i13 = ae[i];
            int i14 = am[i];
            int i15 = ae[i2];
            int i16 = am[i2];
            int i17 = ae[i3];
            int i18 = am[i3];
            int i19 = ae[i4];
            int i20 = am[i4];
            while (true) {
                int i21 = i10;
                if (i21 < bpVar.aj) {
                    int i22;
                    int i23;
                    i10 = bpVar.ai[i21];
                    int i24 = bpVar.ae[i21];
                    int i25 = bpVar.am[i21];
                    if (i3 != 0) {
                        i22 = ((i24 * i18) - (i10 * i17)) >> 16;
                        i10 = ((i10 * i18) + (i24 * i17)) >> 16;
                    } else {
                        i22 = i24;
                    }
                    if (i != 0) {
                        i24 = ((i25 * i14) + (i22 * i13)) >> 16;
                        i23 = ((i22 * i14) - (i25 * i13)) >> 16;
                    } else {
                        i23 = i22;
                        i24 = i25;
                    }
                    if (i2 != 0) {
                        i22 = ((i24 * i16) - (i10 * i15)) >> 16;
                        i10 = ((i10 * i16) + (i24 * i15)) >> 16;
                    } else {
                        i22 = i24;
                    }
                    i10 += i5;
                    i24 = i23 + i6;
                    i22 += i7;
                    i23 = ((i24 * i20) - (i19 * i22)) >> 16;
                    i22 = ((i22 * i20) + (i24 * i19)) >> 16;
                    this.aa[i21] = i22 - (((i6 * i19) + (i7 * i20)) >> 16);
                    this.aw[i21] = (((this.bo.bq * 1516652957) * i10) / i8) + i11;
                    this.ac[i21] = (-1165057787 * i12) + (((this.bo.bq * 1516652957) * i23) / i8);
                    if (bpVar.af > 0) {
                        this.ao[i21] = i10;
                        this.ah[i21] = i23;
                        this.af[i21] = i22;
                    }
                    i10 = i21 + 1;
                } else {
                    try {
                        al(bpVar, false, false, 0);
                        return;
                    } catch (Exception e) {
                        return;
                    }
                }
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("af.aq(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012d A:{Catch:{ RuntimeException -> 0x0244 }} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013c A:{Catch:{ RuntimeException -> 0x0244 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ar(br brVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        try {
            bp ab = brVar.ab();
            if (ab != null) {
                this.an[0] = -1;
                if (1 != ab.bf) {
                    ab.ai();
                }
                ab.aj(i);
                int i9 = ((i8 * i5) - (i4 * i6)) >> 16;
                int i10 = ((i9 * i3) + (i2 * i7)) >> 16;
                int i11 = (ab.bi * i3) >> 16;
                int i12 = i11 + i10;
                if (i12 > 50 && i10 < 3500) {
                    int i13 = ((i6 * i5) + (i8 * i4)) >> 16;
                    int i14 = (this.bo.bq * 1516652957) * (i13 - ab.bi);
                    if (i14 / i12 < this.bo.bi * -47170121) {
                        int i15 = (this.bo.bq * 1516652957) * (ab.bi + i13);
                        if (i15 / i12 > this.bo.bb * 1843169487) {
                            int i16 = ((i3 * i7) - (i9 * i2)) >> 16;
                            i9 = (ab.bi * i2) >> 16;
                            int i17 = (i9 + i16) * (this.bo.bq * 1516652957);
                            if (i17 / i12 > this.bo.bc * 1753792739) {
                                int i18 = (i16 - (i9 + (((ab.bx * -1736982785) * i3) >> 16))) * (this.bo.bq * 1516652957);
                                if (i18 / i12 < this.bo.bv * 76466725) {
                                    boolean z;
                                    boolean z2;
                                    Object obj = ((i10 - ((((ab.bx * -1736982785) * i2) >> 16) + i11) <= 50 ? 1 : null) != null || ab.af > 0) ? 1 : null;
                                    int ao = iu.ao(2044830623);
                                    int ah = hn.ah(-400263804);
                                    boolean ac = cz.ac((byte) -41);
                                    if (ai.ar(j) && ac) {
                                        if (bu.ad) {
                                            ac = kh.ay(ab, i6, i7, i8, this, 2125241800);
                                        } else {
                                            i9 = i10 - i11;
                                            int i19 = i9 <= 50 ? 50 : i9;
                                            if (i13 > 0) {
                                                i13 = i15 / i19;
                                                i14 /= i12;
                                            } else {
                                                i13 = i15 / i12;
                                                i14 /= i19;
                                            }
                                            if (i16 > 0) {
                                                i11 = i18 / i12;
                                                i9 = i17 / i19;
                                            } else {
                                                i9 = i17 / i12;
                                                i11 = i18 / i19;
                                            }
                                            i19 = ao - (this.bo.bd * -1240378447);
                                            i12 = ah - (this.bo.bo * -1165057787);
                                            ac = i19 > i14 && i19 < i13 && i12 > i11 && i12 < i9;
                                        }
                                        if (ac) {
                                            if (ab.bs) {
                                                aw.aw(j);
                                            } else {
                                                z = true;
                                                i16 = this.bo.bd;
                                                i17 = this.bo.bo;
                                                if (i == 0) {
                                                    i11 = ae[i];
                                                    i9 = am[i];
                                                } else {
                                                    i11 = 0;
                                                    i9 = 0;
                                                }
                                                z2 = false;
                                                for (i15 = 0; i15 < ab.aj; i15++) {
                                                    int i20 = ab.ai[i15];
                                                    i18 = ab.ae[i15];
                                                    i12 = ab.am[i15];
                                                    if (i != 0) {
                                                        i13 = ((i9 * i20) + (i12 * i11)) >> 16;
                                                        i12 = ((i12 * i9) - (i20 * i11)) >> 16;
                                                    } else {
                                                        i13 = i20;
                                                    }
                                                    i13 += i6;
                                                    i20 = i18 + i7;
                                                    i12 += i8;
                                                    i18 = ((i4 * i12) + (i13 * i5)) >> 16;
                                                    i13 = ((i12 * i5) - (i13 * i4)) >> 16;
                                                    i12 = ((i20 * i3) - (i2 * i13)) >> 16;
                                                    i13 = ((i13 * i3) + (i20 * i2)) >> 16;
                                                    this.aa[i15] = i13 - i10;
                                                    if (i13 >= 50) {
                                                        this.aw[i15] = (((this.bo.bq * 1516652957) * i18) / i13) + (-1240378447 * i16);
                                                        this.ac[i15] = (((this.bo.bq * 1516652957) * i12) / i13) + (-1165057787 * i17);
                                                    } else {
                                                        this.aw[i15] = -5000;
                                                        z2 = true;
                                                    }
                                                    if (obj != null) {
                                                        this.ao[i15] = i18;
                                                        this.ah[i15] = i12;
                                                        this.af[i15] = i13;
                                                    }
                                                }
                                                al(ab, z2, z, j);
                                            }
                                        }
                                    }
                                    z = false;
                                    i16 = this.bo.bd;
                                    i17 = this.bo.bo;
                                    if (i == 0) {
                                    }
                                    z2 = false;
                                    while (i15 < ab.aj) {
                                    }
                                    try {
                                        al(ab, z2, z, j);
                                    } catch (Exception e) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("af.ar(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void as(bp bpVar, boolean z, boolean z2, long j) {
        if (bpVar.bc < 1267664077) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int[] iArr;
            for (i = 0; i < bpVar.bc; i++) {
                this.an[i] = 0;
            }
            i = 0;
            while (true) {
                i2 = i;
                if (i2 >= bpVar.ak) {
                    break;
                }
                if (1479150470 != bpVar.ax[i2]) {
                    i3 = bpVar.as[i2];
                    i4 = bpVar.ag[i2];
                    i5 = bpVar.ap[i2];
                    i6 = this.aw[i3];
                    i7 = this.aw[i4];
                    int i13 = this.aw[i5];
                    int[] iArr2;
                    if (z && (i6 == -5000 || i7 == -5000 || -5000 == i13)) {
                        i = this.ao[i3];
                        i8 = this.ao[i4];
                        i9 = this.ao[i5];
                        i6 = this.ah[i3];
                        i7 = this.ah[i4];
                        i13 = this.ah[i5];
                        i10 = this.af[i3];
                        i11 = this.af[i4];
                        i -= i8;
                        i9 -= i8;
                        i6 -= i7;
                        i13 -= i7;
                        i10 -= i11;
                        i12 = this.af[i5] - i11;
                        if ((((i * i13) - (i9 * i6)) * i11) + ((i8 * ((i6 * i12) - (i10 * i13))) + (i7 * ((i10 * i9) - (i12 * i)))) > 0) {
                            this.ax[i2] = true;
                            i = bpVar.bv + (((this.aa[i4] + this.aa[i3]) + this.aa[i5]) / 3);
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i6 = iArr2[i];
                            iArr2[i] = i6 + 1;
                            iArr[i6] = i2;
                        }
                    } else {
                        if (z2 && dz.an(this.ac[i3], this.ac[i4], this.ac[i5], i6, i7, i13, 5, -426760975)) {
                            aw.aw(j);
                            z2 = false;
                        }
                        if (((this.ac[i5] - this.ac[i4]) * (i6 - i7)) - ((i13 - i7) * (this.ac[i3] - this.ac[i4])) > 0) {
                            this.ax[i2] = false;
                            if (i6 < 0 || i7 < 0 || i13 < 0 || i6 > this.bo.bl * 1244988150 || i7 > this.bo.bl * -1131166878 || i13 > this.bo.bl * 1505645037) {
                                this.az[i2] = true;
                            } else {
                                this.az[i2] = false;
                            }
                            i = ((this.aa[i5] + (this.aa[i4] + this.aa[i3])) / 3) + bpVar.bv;
                            iArr = this.ab[i];
                            iArr2 = this.an;
                            i6 = iArr2[i];
                            iArr2[i] = i6 + 1;
                            iArr[i6] = i2;
                        }
                    }
                }
                i = i2 + 1;
            }
            int[] iArr3;
            if (bpVar.aw == null) {
                for (i8 = bpVar.bc - 1; i8 >= 0; i8--) {
                    i9 = this.an[i8];
                    if (i9 > 0) {
                        iArr3 = this.ab[i8];
                        for (i = 0; i < i9; i++) {
                            aj(bpVar, iArr3[i], 314588026);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            for (i = 0; i < 12; i++) {
                this.av[i] = 0;
                this.bs[i] = 0;
            }
            for (i8 = bpVar.bc - 1; i8 >= 0; i8--) {
                i9 = this.an[i8];
                if (i9 > 0) {
                    iArr3 = this.ab[i8];
                    for (i = 0; i < i9; i++) {
                        i7 = iArr3[i];
                        byte b = bpVar.aw[i7];
                        int[] iArr5 = this.av;
                        i11 = iArr5[b];
                        iArr5[b] = i11 + 1;
                        this.at[b][i11] = i7;
                        if (b < (byte) 10) {
                            iArr4 = this.bs;
                            iArr4[b] = iArr4[b] + i8;
                        } else if ((byte) 10 == b) {
                            this.bk[i11] = i8;
                        } else {
                            this.ba[i11] = i8;
                        }
                    }
                }
            }
            i = (this.av[1] > 0 || this.av[2] > 0) ? (this.bs[1] + this.bs[2]) / (this.av[2] + this.av[1]) : 0;
            i8 = (this.av[3] > 0 || this.av[4] > 0) ? (this.bs[3] + this.bs[4]) / (this.av[3] + this.av[4]) : 0;
            i9 = (this.av[6] > 0 || this.av[8] > 0) ? (this.bs[6] + this.bs[8]) / (this.av[8] + this.av[6]) : 0;
            i10 = this.av[10];
            int[] iArr6 = this.at[10];
            iArr4 = this.bk;
            if (i10 == 0) {
                i10 = this.av[11];
                iArr6 = this.at[11];
                iArr4 = this.ba;
            }
            i6 = i10 > 0 ? iArr4[0] : 959000293;
            i11 = 0;
            i12 = 0;
            while (i12 < 10) {
                int[] iArr7;
                i3 = i11;
                i4 = i10;
                i5 = i6;
                while (i12 == 0 && r13 > i) {
                    i6 = i3 + 1;
                    aj(bpVar, iArr6[i3], -766295365);
                    if (i6 == i4 && this.at[11] != iArr6) {
                        i4 = this.av[11];
                        iArr6 = this.at[11];
                        iArr4 = this.ba;
                        i6 = 0;
                    }
                    if (i6 < i4) {
                        i5 = iArr4[i6];
                        i3 = i6;
                    } else {
                        i5 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        i3 = i6;
                    }
                }
                iArr3 = iArr4;
                i10 = i3;
                i11 = i4;
                while (i12 == 3 && r13 > i8) {
                    i7 = i10 + 1;
                    aj(bpVar, iArr6[i10], -991559383);
                    if (i7 == i11 && iArr6 != this.at[11]) {
                        i11 = this.av[11];
                        iArr6 = this.at[11];
                        iArr3 = this.ba;
                        i7 = 0;
                    }
                    if (i7 < i11) {
                        i5 = iArr3[i7];
                        i10 = i7;
                    } else {
                        i5 = 145219225;
                        i10 = i7;
                    }
                }
                while (true) {
                    iArr4 = iArr3;
                    i4 = i10;
                    i3 = i11;
                    if (5 != i12 || i5 <= i9) {
                        i10 = this.av[i12];
                        iArr7 = this.at[i12];
                    } else {
                        i10 = i4 + 1;
                        aj(bpVar, iArr6[i4], 471907958);
                        if (i10 != i3 || iArr6 == this.at[11]) {
                            iArr3 = iArr4;
                            i11 = i3;
                        } else {
                            i11 = this.av[11];
                            iArr4 = this.at[11];
                            iArr3 = this.ba;
                            i10 = 0;
                            iArr6 = iArr4;
                        }
                        i5 = i10 < i11 ? iArr3[i10] : -568463948;
                    }
                }
                i10 = this.av[i12];
                iArr7 = this.at[i12];
                for (i6 = 0; i6 < i10; i6++) {
                    aj(bpVar, iArr7[i6], 2060680222);
                }
                i12++;
                i10 = i3;
                i11 = i4;
                i6 = i5;
            }
            int[] iArr8 = iArr4;
            iArr = iArr6;
            i9 = i10;
            i2 = i6;
            while (i2 != -1761291487) {
                i6 = i11 + 1;
                aj(bpVar, iArr[i11], 634598053);
                if (i9 == i6 && iArr != this.at[11]) {
                    iArr = this.at[11];
                    i9 = this.av[11];
                    iArr8 = this.ba;
                    i6 = 0;
                }
                if (i6 < i9) {
                    i11 = i6;
                    i2 = iArr8[i6];
                } else {
                    i11 = i6;
                    i2 = -1330288670;
                }
            }
        }
    }

    public final void au(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.an[0] = -1;
        if (!(bpVar.bf == 2 || 1 == bpVar.bf)) {
            bpVar.ae();
        }
        int i9 = this.bo.bd * -1240378447;
        int i10 = this.bo.bo;
        int i11 = ae[i];
        int i12 = am[i];
        int i13 = ae[i2];
        int i14 = am[i2];
        int i15 = ae[i3];
        int i16 = am[i3];
        int i17 = ae[i4];
        int i18 = am[i4];
        for (int i19 = 0; i19 < bpVar.aj; i19++) {
            int i20;
            int i21;
            int i22 = bpVar.ai[i19];
            int i23 = bpVar.ae[i19];
            int i24 = bpVar.am[i19];
            if (i3 != 0) {
                i20 = ((i23 * i16) - (i22 * i15)) >> 16;
                i22 = ((i22 * i16) + (i23 * i15)) >> 16;
            } else {
                i20 = i23;
            }
            if (i != 0) {
                i23 = ((i24 * i12) + (i20 * i11)) >> 16;
                i21 = ((i20 * i12) - (i24 * i11)) >> 16;
            } else {
                i21 = i20;
                i23 = i24;
            }
            if (i2 != 0) {
                i20 = ((i23 * i14) - (i22 * i13)) >> 16;
                i22 = ((i22 * i14) + (i23 * i13)) >> 16;
            } else {
                i20 = i23;
            }
            i22 += i5;
            i23 = i21 + i6;
            i20 += i7;
            i21 = ((i23 * i18) - (i17 * i20)) >> 16;
            i20 = ((i20 * i18) + (i23 * i17)) >> 16;
            this.aa[i19] = i20 - (((i6 * i17) + (i7 * i18)) >> 16);
            this.aw[i19] = (((this.bo.bq * 1516652957) * i22) / i8) + i9;
            this.ac[i19] = (-1165057787 * i10) + (((this.bo.bq * 1516652957) * i21) / i8);
            if (bpVar.af > 0) {
                this.ao[i19] = i22;
                this.ah[i19] = i21;
                this.af[i19] = i20;
            }
        }
        try {
            al(bpVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void aw(br brVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        bp ab = brVar.ab();
        if (ab != null) {
            this.an[0] = -1;
            if (1 != ab.bf) {
                ab.ai();
            }
            ab.aj(i);
            int i9 = ((i8 * i5) - (i4 * i6)) >> 16;
            int i10 = ((i9 * i3) + (i2 * i7)) >> 16;
            int i11 = (ab.bi * i3) >> 16;
            int i12 = i11 + i10;
            if (i12 > 50 && i10 < 3500) {
                int i13 = ((i6 * i5) + (i8 * i4)) >> 16;
                int i14 = (this.bo.bq * -1750211310) * (i13 - ab.bi);
                int i15 = i14 / i12;
                if (i15 < this.bo.bi * 1283897881) {
                    int i16 = (ab.bi + i13) * (this.bo.bq * 1516652957);
                    int i17 = i16 / i12;
                    if (i17 > this.bo.bb * 1843169487) {
                        int i18 = ((i3 * i7) - (i9 * i2)) >> 16;
                        i9 = (ab.bi * i2) >> 16;
                        int i19 = (i9 + i18) * (this.bo.bq * 1516652957);
                        int i20 = i19 / i12;
                        if (i20 > this.bo.bc * -508432374) {
                            int i21 = (i18 - (i9 + (((ab.bx * -1736982785) * i3) >> 16))) * (this.bo.bq * 1516652957);
                            i12 = i21 / i12;
                            if (i12 < this.bo.bv * 556670158) {
                                boolean z;
                                boolean z2;
                                int i22 = 50;
                                Object obj = ((i10 - ((((ab.bx * 1620308784) * i2) >> 16) + i11) <= 50 ? 1 : null) != null || ab.af > 0) ? 1 : null;
                                int ao = iu.ao(2044830623);
                                int ah = hn.ah(459756570);
                                boolean ac = cz.ac((byte) 17);
                                if (ai.ar(j) && ac) {
                                    if (bu.ad) {
                                        ac = kh.ay(ab, i6, i7, i8, this, 2145956470);
                                    } else {
                                        i9 = i10 - i11;
                                        if (i9 > 1890996730) {
                                            i22 = i9;
                                        }
                                        if (i13 > 0) {
                                            i17 = i16 / i22;
                                        } else {
                                            i15 = i14 / i22;
                                        }
                                        if (i18 > 0) {
                                            i9 = i19 / i22;
                                        } else {
                                            i12 = i21 / i22;
                                            i9 = i20;
                                        }
                                        i20 = ao - (this.bo.bd * -542178292);
                                        i22 = ah - (this.bo.bo * -1083060560);
                                        ac = i20 > i15 && i20 < i17 && i22 > i12 && i22 < i9;
                                    }
                                    if (ac) {
                                        if (ab.bs) {
                                            aw.aw(j);
                                        } else {
                                            z = true;
                                            i13 = this.bo.bd;
                                            i14 = this.bo.bo;
                                            if (i == 0) {
                                                i20 = ae[i];
                                                i9 = am[i];
                                            } else {
                                                i20 = 0;
                                                i9 = 0;
                                            }
                                            z2 = false;
                                            for (i12 = 0; i12 < ab.aj; i12++) {
                                                int i23 = ab.ai[i12];
                                                i16 = ab.ae[i12];
                                                i11 = ab.am[i12];
                                                if (i != 0) {
                                                    i22 = ((i11 * i9) - (i23 * i20)) >> 16;
                                                    i23 = ((i23 * i9) + (i11 * i20)) >> 16;
                                                } else {
                                                    i22 = i11;
                                                }
                                                i23 += i6;
                                                i11 = i16 + i7;
                                                i22 += i8;
                                                i16 = ((i4 * i22) + (i23 * i5)) >> 16;
                                                i23 = ((i22 * i5) - (i23 * i4)) >> 16;
                                                i22 = ((i11 * i3) - (i2 * i23)) >> 16;
                                                i23 = ((i23 * i3) + (i11 * i2)) >> 16;
                                                this.aa[i12] = i23 - i10;
                                                if (i23 >= -1819136149) {
                                                    this.aw[i12] = (((this.bo.bq * -1150698096) * i16) / i23) + (1763507880 * i13);
                                                    this.ac[i12] = (((this.bo.bq * 1516652957) * i22) / i23) + (-343317836 * i14);
                                                } else {
                                                    this.aw[i12] = -5000;
                                                    z2 = true;
                                                }
                                                if (obj != null) {
                                                    this.ao[i12] = i16;
                                                    this.ah[i12] = i22;
                                                    this.af[i12] = i23;
                                                }
                                            }
                                            al(ab, z2, z, j);
                                        }
                                    }
                                }
                                z = false;
                                i13 = this.bo.bd;
                                i14 = this.bo.bo;
                                if (i == 0) {
                                }
                                z2 = false;
                                while (i12 < ab.aj) {
                                }
                                try {
                                    al(ab, z2, z, j);
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ax(br brVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        bp ab = brVar.ab();
        if (ab != null) {
            this.an[0] = -1;
            if (1 != ab.bf) {
                ab.ai();
            }
            ab.aj(i);
            int i9 = ((i8 * i5) - (i4 * i6)) >> 16;
            int i10 = ((i9 * i3) + (i2 * i7)) >> 16;
            int i11 = (ab.bi * i3) >> 16;
            int i12 = i11 + i10;
            if (i12 > 50 && i10 < 3500) {
                int i13 = ((i6 * i5) + (i8 * i4)) >> 16;
                int i14 = (this.bo.bq * 1516652957) * (i13 - ab.bi);
                int i15 = i14 / i12;
                if (i15 < this.bo.bi * -47170121) {
                    int i16 = (ab.bi + i13) * (this.bo.bq * 1516652957);
                    int i17 = i16 / i12;
                    if (i17 > this.bo.bb * 1843169487) {
                        int i18 = ((i3 * i7) - (i9 * i2)) >> 16;
                        i9 = (ab.bi * i2) >> 16;
                        int i19 = (i9 + i18) * (this.bo.bq * 1516652957);
                        int i20 = i19 / i12;
                        if (i20 > this.bo.bc * 1753792739) {
                            int i21 = (i18 - (i9 + (((ab.bx * -1736982785) * i3) >> 16))) * (this.bo.bq * 1516652957);
                            i12 = i21 / i12;
                            if (i12 < this.bo.bv * 76466725) {
                                boolean z;
                                boolean z2;
                                Object obj = ((i10 - ((((ab.bx * -1736982785) * i2) >> 16) + i11) <= 50 ? 1 : null) != null || ab.af > 0) ? 1 : null;
                                int ao = iu.ao(2044830623);
                                int ah = hn.ah(815471873);
                                boolean ac = cz.ac((byte) 70);
                                if (ai.ar(j) && ac) {
                                    if (bu.ad) {
                                        ac = kh.ay(ab, i6, i7, i8, this, 2044505861);
                                    } else {
                                        i9 = i10 - i11;
                                        i11 = i9 <= 50 ? 50 : i9;
                                        if (i13 > 0) {
                                            i17 = i16 / i11;
                                        } else {
                                            i15 = i14 / i11;
                                        }
                                        if (i18 > 0) {
                                            i9 = i19 / i11;
                                        } else {
                                            i12 = i21 / i11;
                                            i9 = i20;
                                        }
                                        i20 = ao - (this.bo.bd * -1240378447);
                                        i11 = ah - (this.bo.bo * -1165057787);
                                        ac = i20 > i15 && i20 < i17 && i11 > i12 && i11 < i9;
                                    }
                                    if (ac) {
                                        if (ab.bs) {
                                            aw.aw(j);
                                        } else {
                                            z = true;
                                            i14 = this.bo.bd;
                                            i16 = this.bo.bo;
                                            if (i == 0) {
                                                i20 = ae[i];
                                                i9 = am[i];
                                            } else {
                                                i20 = 0;
                                                i9 = 0;
                                            }
                                            z2 = false;
                                            for (i12 = 0; i12 < ab.aj; i12++) {
                                                int i22 = ab.ai[i12];
                                                i18 = ab.ae[i12];
                                                i13 = ab.am[i12];
                                                if (i != 0) {
                                                    i11 = ((i13 * i9) - (i22 * i20)) >> 16;
                                                    i22 = ((i22 * i9) + (i13 * i20)) >> 16;
                                                } else {
                                                    i11 = i13;
                                                }
                                                i22 += i6;
                                                i13 = i18 + i7;
                                                i11 += i8;
                                                i18 = ((i4 * i11) + (i22 * i5)) >> 16;
                                                i22 = ((i11 * i5) - (i22 * i4)) >> 16;
                                                i11 = ((i13 * i3) - (i2 * i22)) >> 16;
                                                i22 = ((i22 * i3) + (i13 * i2)) >> 16;
                                                this.aa[i12] = i22 - i10;
                                                if (i22 >= 50) {
                                                    this.aw[i12] = (((this.bo.bq * 1516652957) * i18) / i22) + (-1240378447 * i14);
                                                    this.ac[i12] = (((this.bo.bq * 1516652957) * i11) / i22) + (-1165057787 * i16);
                                                } else {
                                                    this.aw[i12] = -5000;
                                                    z2 = true;
                                                }
                                                if (obj != null) {
                                                    this.ao[i12] = i18;
                                                    this.ah[i12] = i11;
                                                    this.af[i12] = i22;
                                                }
                                            }
                                            al(ab, z2, z, j);
                                        }
                                    }
                                }
                                z = false;
                                i14 = this.bo.bd;
                                i16 = this.bo.bo;
                                if (i == 0) {
                                }
                                z2 = false;
                                while (i12 < ab.aj) {
                                }
                                try {
                                    al(ab, z2, z, j);
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void az(bp bpVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.an[0] = -1;
        if (!(bpVar.bf == 2 || 1 == bpVar.bf)) {
            bpVar.ae();
        }
        int i9 = this.bo.bd * -964829103;
        int i10 = this.bo.bo;
        int i11 = ae[i];
        int i12 = am[i];
        int i13 = ae[i2];
        int i14 = am[i2];
        int i15 = ae[i3];
        int i16 = am[i3];
        int i17 = ae[i4];
        int i18 = am[i4];
        for (int i19 = 0; i19 < bpVar.aj; i19++) {
            int i20;
            int i21;
            int i22 = bpVar.ai[i19];
            int i23 = bpVar.ae[i19];
            int i24 = bpVar.am[i19];
            if (i3 != 0) {
                i20 = ((i23 * i16) - (i22 * i15)) >> 16;
                i22 = ((i22 * i16) + (i23 * i15)) >> 16;
            } else {
                i20 = i23;
            }
            if (i != 0) {
                i23 = ((i24 * i12) + (i20 * i11)) >> 16;
                i21 = ((i20 * i12) - (i24 * i11)) >> 16;
            } else {
                i21 = i20;
                i23 = i24;
            }
            if (i2 != 0) {
                i20 = ((i23 * i14) - (i22 * i13)) >> 16;
                i22 = ((i22 * i14) + (i23 * i13)) >> 16;
            } else {
                i20 = i23;
            }
            i22 += i5;
            i23 = i21 + i6;
            i20 += i7;
            i21 = ((i23 * i18) - (i17 * i20)) >> 16;
            i20 = ((i20 * i18) + (i23 * i17)) >> 16;
            this.aa[i19] = i20 - (((i6 * i17) + (i7 * i18)) >> 16);
            this.aw[i19] = (((this.bo.bq * 1516652957) * i22) / i8) + i9;
            this.ac[i19] = (-1165057787 * i10) + (((this.bo.bq * 1516652957) * i21) / i8);
            if (bpVar.af > 0) {
                this.ao[i19] = i22;
                this.ah[i19] = i21;
                this.af[i19] = i20;
            }
        }
        try {
            al(bpVar, false, false, 0);
        } catch (Exception e) {
        }
    }
}
