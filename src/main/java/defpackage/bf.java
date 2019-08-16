package defpackage;

import com.jagex.oldscape.osrenderer.ad;

/* renamed from: bf */
public class bf extends bw {
    public static final int ag = 10;
    static int ak = 0;
    protected static final String ao = "mglwnafh";
    final at ad;
    final bt aq;

    public bf(at atVar) {
        try {
            this.ad = atVar;
            this.aq = new bt(this.ad);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bf.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean ar(CharSequence charSequence, int i, boolean z, int i2) {
        if (i < 2 || i > 36) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        try {
            int length = charSequence.length();
            boolean z2 = false;
            Object obj = null;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                int i5;
                char charAt = charSequence.charAt(i4);
                if (i4 == 0) {
                    if ('-' == charAt) {
                        obj = 1;
                    } else if (charAt == '+' && z) {
                    }
                }
                if (charAt >= '0' && charAt <= '9') {
                    i5 = charAt - 48;
                } else if (charAt >= 'A' && charAt <= 'Z') {
                    i5 = charAt - 55;
                } else if (charAt < 'a' || charAt > 'z') {
                    return false;
                } else {
                    i5 = charAt - 87;
                }
                if (i5 >= i) {
                    return false;
                }
                if (obj != null) {
                    i5 = -i5;
                }
                int i6 = (i3 * i) + i5;
                if (i3 != i6 / i) {
                    return false;
                }
                z2 = true;
                i3 = i6;
            }
            return z2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("bf.ar(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    static final void as(int i) {
        try {
            oz.ak(go.hc, -769293814);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bf.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ac(int i) {
        if (cz.ac((byte) -29)) {
            ad.bq(iu.ao(2044830623) - (this.ad.bd * -749653441), hn.ah(-716957366) - (this.ad.bo * -1165057787), -264719135);
        }
        this.aq.al(i, 566244886);
    }

    public bl ad(int i) {
        try {
            return this.ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bf.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public by ae() {
        return this.aq;
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(bc bcVar, bs bsVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (ar) {
            int i7;
            int i8;
            int i9;
            int i10;
            int length = bsVar.ad.length;
            int i11 = 0;
            while (i11 < length) {
                i7 = bsVar.ad[i11] - bc.ab;
                i8 = bsVar.aq[i11] - bc.av;
                i9 = bsVar.ar[i11] - bc.at;
                i10 = ((i9 * i3) + (i7 * i4)) >> 16;
                i7 = ((i9 * i4) - (i7 * i3)) >> 16;
                i9 = ((i8 * i2) - (i * i7)) >> 16;
                i7 = ((i7 * i2) + (i8 * i)) >> 16;
                if (i7 >= 50) {
                    bs.aa[i11] = i10;
                    bs.ao[i11] = i9;
                    bs.ah[i11] = i7;
                    bs.aw[i11] = ((i10 * (this.ad.bq * 1516652957)) / i7) + (this.ad.bd * -1240378447);
                    bs.ac[i11] = ((i9 * (this.ad.bq * 927743615)) / i7) + (this.ad.bo * 345409275);
                    i11++;
                } else {
                    return;
                }
            }
            i11 = 0;
            this.ad.bm = 0;
            int length2 = bsVar.ae.length;
            while (true) {
                int i12 = i11;
                if (i12 < length2) {
                    int i13 = bsVar.ae[i12];
                    int i14 = bsVar.am[i12];
                    int i15 = bsVar.ak[i12];
                    i10 = bs.aw[i13];
                    int i16 = bs.aw[i14];
                    int i17 = bs.aw[i15];
                    i7 = bs.ac[i13];
                    i8 = bs.ac[i14];
                    i9 = bs.ac[i15];
                    if (bc.bd && bc.br(bc.bl, bc.bf, i7, i8, i9, i10, i16, i17)) {
                        bc.bb = i5;
                        bc.bi = i6;
                    }
                    i9 = bs.aa[i13];
                    i10 = bs.aa[i14];
                    i16 = bs.aa[i15];
                    length = bs.ao[i13];
                    i7 = bs.ao[i14];
                    i8 = bs.ao[i15];
                    i17 = bs.ah[i13];
                    int i18 = bs.ah[i14];
                    int i19 = bs.ah[i15];
                    if (bsVar.as != null && bsVar.as[i12] != -1) {
                        int i20 = i5 * 128;
                        float f = ((float) (bsVar.ad[i13] - i20)) / 128.0f;
                        float f2 = ((float) (bsVar.ad[i14] - i20)) / 128.0f;
                        float f3 = ((float) (bsVar.ad[i15] - i20)) / 128.0f;
                        i11 = bsVar.ar[i13];
                        i13 = i6 * 128;
                        this.ad.ak(length, i7, i8, i9, i10, i16, i17, i18, i19, bsVar.al[i12], bsVar.aj[i12], bsVar.ai[i12], f, f2, f3, ((float) (i11 - i13)) / 128.0f, ((float) (bsVar.ar[i14] - i13)) / 128.0f, ((float) (bsVar.ar[i15] - (1031054347 * i6))) / 128.0f, bsVar.as[i12], -1695047298);
                    } else if (bsVar.al[i12] != 12345678) {
                        this.ad.al(length, i7, i8, i9, i10, i16, i17, i18, i19, bsVar.al[i12], bsVar.aj[i12], bsVar.ai[i12], this.ad.bq * 1516652957, -1183504010);
                    }
                    i11 = i12 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public bl ai() {
        return this.ad;
    }

    public bl aj() {
        return this.ad;
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(bc bcVar, av avVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (ar) {
            int i8 = (i6 << 7) - bc.ab;
            int i9 = (i7 << 7) - bc.at;
            int i10 = i8 + 128;
            int i11 = i9 + 128;
            int i12 = bcVar.aj[i][i6][i7] - bc.av;
            int i13 = i6 + 1;
            int i14 = bcVar.aj[i][i13][i7] - bc.av;
            int i15 = i7 + 1;
            i13 = bcVar.aj[i][i13][i15] - bc.av;
            i15 = bcVar.aj[i][i6][i15] - bc.av;
            int i16 = i5 * i8;
            int i17 = i4 * i9;
            int i18 = (i16 + i17) >> 16;
            i9 *= i5;
            i8 *= i4;
            int i19 = (i9 - i8) >> 16;
            int i20 = ((i12 * i3) - (i19 * i2)) >> 16;
            int i21 = ((i12 * i2) + (i19 * i3)) >> 16;
            if (i21 >= -1134660590) {
                i12 = i10 * i5;
                int i22 = (i17 + i12) >> 16;
                i10 *= i4;
                i9 = (i9 - i10) >> 16;
                int i23 = ((i14 * i3) - (i2 * i9)) >> 16;
                int i24 = ((i9 * i3) + (i14 * i2)) >> 16;
                if (i24 >= 50) {
                    i9 = i11 * i4;
                    int i25 = (i12 + i9) >> 16;
                    i11 *= i5;
                    i10 = (i11 - i10) >> 16;
                    i17 = ((i13 * i3) - (i10 * i2)) >> 16;
                    int i26 = ((i10 * i3) + (i13 * i2)) >> 16;
                    if (i26 >= 50) {
                        int i27 = (i9 + i16) >> 16;
                        i8 = (i11 - i8) >> 16;
                        i19 = ((i15 * i3) - (i2 * i8)) >> 16;
                        int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                        if (i28 >= 794059460) {
                            at atVar;
                            int i29 = (this.ad.bd * -1240378447) + (((this.ad.bq * 1516652957) * i18) / i21);
                            int i30 = (((this.ad.bq * 1516652957) * i20) / i21) + (this.ad.bo * -1165057787);
                            i15 = (((this.ad.bq * -218118154) * i22) / i24) + (this.ad.bd * -1240378447);
                            i12 = (this.ad.bo * -1831384607) + (((this.ad.bq * -1630493813) * i23) / i24);
                            i14 = (((this.ad.bq * 1516652957) * i25) / i26) + (this.ad.bd * -1240378447);
                            i10 = (((this.ad.bq * -1014154528) * i17) / i26) + (this.ad.bo * 1159487222);
                            i13 = (((this.ad.bq * -1461448903) * i27) / i28) + (this.ad.bd * 1844346395);
                            i11 = (((this.ad.bq * -431766571) * i19) / i28) + (this.ad.bo * -1165057787);
                            this.ad.bm = 0;
                            if (((i12 - i11) * (i14 - i13)) - ((i10 - i11) * (i15 - i13)) > 0) {
                                this.ad.at = false;
                                if (i14 < 0 || i13 < 0 || i15 < 0 || i14 > this.ad.bl * 23110219 || i13 > this.ad.bl * 1505645037 || i15 > this.ad.bl * -1048837867) {
                                    this.ad.at = true;
                                }
                                if (bc.bd && bc.br(bc.bl, bc.bf, i10, i11, i12, i14, i13, i15)) {
                                    bc.bb = i6;
                                    bc.bi = i7;
                                }
                                if (avVar.aj * 669348422 == -1) {
                                    if (12345678 != avVar.ar * -881587749) {
                                        this.ad.al(i17, i19, i23, i25, i27, i22, i26, i28, i24, avVar.ar * -881587749, avVar.al * 1700480373, avVar.aq * -1267802003, this.ad.bq * 1516652957, -998611330);
                                    }
                                } else if (bc.ad) {
                                    atVar = this.ad;
                                    i8 = il.ax.al(avVar.aj * 2090844575, 2064423002);
                                    this.ad.aj(i10, i11, i12, i14, i13, i15, kr.br(i8, avVar.ar * 123743793, 2131105665), kr.br(i8, avVar.al * 1700480373, 2135841139), kr.br(i8, avVar.aq * -606608998, 2138352166), (byte) 104);
                                } else {
                                    this.ad.ak(i17, i19, i23, i25, i27, i22, i26, i28, i24, avVar.ar * -438514752, avVar.al * 1584663233, avVar.aq * -1267802003, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, avVar.aj * 1901002443, -2003817794);
                                }
                            }
                            if (((i11 - i12) * (i29 - i15)) - ((i13 - i15) * (i30 - i12)) > 0) {
                                this.ad.at = false;
                                if (i29 < 0 || i15 < 0 || i13 < 0 || i29 > this.ad.bl * 1505645037 || i15 > this.ad.bl * 1505645037 || i13 > this.ad.bl * 1505645037) {
                                    this.ad.at = true;
                                }
                                if (bc.bd && bc.br(bc.bl, bc.bf, i30, i12, i11, i29, i15, i13)) {
                                    bc.bb = i6;
                                    bc.bi = i7;
                                }
                                if (-1 == avVar.aj * 1901002443) {
                                    if (avVar.ad * -1296734259 != -1196359306) {
                                        this.ad.al(i20, i23, i19, i18, i22, i27, i21, i24, i28, avVar.ad * -1296734259, avVar.aq * 1058223318, avVar.al * 702704437, this.ad.bq * -736203964, -954295655);
                                    }
                                } else if (bc.ad) {
                                    atVar = this.ad;
                                    i8 = il.ax.al(avVar.aj * 2058753214, -276245483);
                                    this.ad.aj(i30, i12, i11, i29, i15, i13, kr.br(i8, avVar.ad * -1520157389, 2139288065), kr.br(i8, avVar.aq * 1028658419, 2135818963), kr.br(i8, avVar.al * -121879020, 2146766823), (byte) 116);
                                } else {
                                    this.ad.ak(i20, i23, i19, i18, i22, i27, i21, i24, i28, avVar.ad * -1296734259, avVar.aq * 541248387, avVar.al * 1700480373, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, avVar.aj * 10407229, 226761144);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(bc bcVar, bs bsVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            if (ar) {
                int i8;
                int i9;
                int i10;
                int i11;
                int length = bsVar.ad.length;
                int i12 = 0;
                while (i12 < length) {
                    i8 = bsVar.ad[i12] - bc.ab;
                    i9 = bsVar.aq[i12] - bc.av;
                    i10 = bsVar.ar[i12] - bc.at;
                    i11 = ((i10 * i3) + (i8 * i4)) >> 16;
                    i8 = ((i10 * i4) - (i8 * i3)) >> 16;
                    i10 = ((i9 * i2) - (i * i8)) >> 16;
                    i8 = ((i8 * i2) + (i9 * i)) >> 16;
                    if (i8 >= 50) {
                        bs.aa[i12] = i11;
                        bs.ao[i12] = i10;
                        bs.ah[i12] = i8;
                        bs.aw[i12] = ((i11 * (this.ad.bq * 1516652957)) / i8) + (this.ad.bd * -1240378447);
                        bs.ac[i12] = ((i10 * (this.ad.bq * 1516652957)) / i8) + (this.ad.bo * -1165057787);
                        i12++;
                    } else {
                        return;
                    }
                }
                this.ad.bm = 0;
                int length2 = bsVar.ae.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = bsVar.ae[i13];
                    int i15 = bsVar.am[i13];
                    int i16 = bsVar.ak[i13];
                    i11 = bs.aw[i14];
                    int i17 = bs.aw[i15];
                    int i18 = bs.aw[i16];
                    i8 = bs.ac[i14];
                    i9 = bs.ac[i15];
                    i10 = bs.ac[i16];
                    if (bc.bd && bc.br(bc.bl, bc.bf, i8, i9, i10, i11, i17, i18)) {
                        bc.bb = i5;
                        bc.bi = i6;
                    }
                    i10 = bs.aa[i14];
                    i11 = bs.aa[i15];
                    i17 = bs.aa[i16];
                    length = bs.ao[i14];
                    i8 = bs.ao[i15];
                    i9 = bs.ao[i16];
                    i18 = bs.ah[i14];
                    int i19 = bs.ah[i15];
                    int i20 = bs.ah[i16];
                    if (bsVar.as != null && bsVar.as[i13] != -1) {
                        int i21 = i5 * 128;
                        float f = ((float) (bsVar.ad[i14] - i21)) / 128.0f;
                        float f2 = ((float) (bsVar.ad[i15] - i21)) / 128.0f;
                        float f3 = ((float) (bsVar.ad[i16] - i21)) / 128.0f;
                        i12 = bsVar.ar[i14];
                        i14 = i6 * 128;
                        this.ad.ak(length, i8, i9, i10, i11, i17, i18, i19, i20, bsVar.al[i13], bsVar.aj[i13], bsVar.ai[i13], f, f2, f3, ((float) (i12 - i14)) / 128.0f, ((float) (bsVar.ar[i15] - i14)) / 128.0f, ((float) (bsVar.ar[i16] - i14)) / 128.0f, bsVar.as[i13], 137568652);
                    } else if (bsVar.al[i13] != 12345678) {
                        this.ad.al(length, i8, i9, i10, i11, i17, i18, i19, i20, bsVar.al[i13], bsVar.aj[i13], bsVar.ai[i13], this.ad.bq * 1516652957, -2121457622);
                    }
                    i13++;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bf.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public by am() {
        return this.aq;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(bc bcVar, bs bsVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (ar) {
            int i7;
            int i8;
            int i9;
            int i10;
            int length = bsVar.ad.length;
            int i11 = 0;
            while (i11 < length) {
                i7 = bsVar.ad[i11] - bc.ab;
                i8 = bsVar.aq[i11] - bc.av;
                i9 = bsVar.ar[i11] - bc.at;
                i10 = ((i9 * i3) + (i7 * i4)) >> 16;
                i7 = ((i9 * i4) - (i7 * i3)) >> 16;
                i9 = ((i8 * i2) - (i * i7)) >> 16;
                i7 = ((i7 * i2) + (i8 * i)) >> 16;
                if (i7 >= 50) {
                    bs.aa[i11] = i10;
                    bs.ao[i11] = i9;
                    bs.ah[i11] = i7;
                    bs.aw[i11] = ((i10 * (this.ad.bq * 1516652957)) / i7) + (this.ad.bd * -1240378447);
                    bs.ac[i11] = ((i9 * (this.ad.bq * 1516652957)) / i7) + (this.ad.bo * -1165057787);
                    i11++;
                } else {
                    return;
                }
            }
            i11 = 0;
            this.ad.bm = 0;
            int length2 = bsVar.ae.length;
            while (true) {
                int i12 = i11;
                if (i12 < length2) {
                    int i13 = bsVar.ae[i12];
                    int i14 = bsVar.am[i12];
                    int i15 = bsVar.ak[i12];
                    i10 = bs.aw[i13];
                    int i16 = bs.aw[i14];
                    int i17 = bs.aw[i15];
                    i7 = bs.ac[i13];
                    i8 = bs.ac[i14];
                    i9 = bs.ac[i15];
                    if (bc.bd && bc.br(bc.bl, bc.bf, i7, i8, i9, i10, i16, i17)) {
                        bc.bb = i5;
                        bc.bi = i6;
                    }
                    i9 = bs.aa[i13];
                    i10 = bs.aa[i14];
                    i16 = bs.aa[i15];
                    length = bs.ao[i13];
                    i7 = bs.ao[i14];
                    i8 = bs.ao[i15];
                    i17 = bs.ah[i13];
                    int i18 = bs.ah[i14];
                    int i19 = bs.ah[i15];
                    if (bsVar.as != null && bsVar.as[i12] != -1) {
                        int i20 = i5 * 128;
                        float f = ((float) (bsVar.ad[i13] - i20)) / 128.0f;
                        float f2 = ((float) (bsVar.ad[i14] - i20)) / 128.0f;
                        float f3 = ((float) (bsVar.ad[i15] - i20)) / 128.0f;
                        i11 = bsVar.ar[i13];
                        i13 = i6 * 128;
                        this.ad.ak(length, i7, i8, i9, i10, i16, i17, i18, i19, bsVar.al[i12], bsVar.aj[i12], bsVar.ai[i12], f, f2, f3, ((float) (i11 - i13)) / 128.0f, ((float) (bsVar.ar[i14] - i13)) / 128.0f, ((float) (bsVar.ar[i15] - i13)) / 128.0f, bsVar.as[i12], -1799449012);
                    } else if (bsVar.al[i12] != 12345678) {
                        this.ad.al(length, i7, i8, i9, i10, i16, i17, i18, i19, bsVar.al[i12], bsVar.aj[i12], bsVar.ai[i12], this.ad.bq * 1516652957, -935454053);
                    }
                    i11 = i12 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public by aq(byte b) {
        try {
            return this.aq;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bf.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(bc bcVar, av avVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        try {
            if (ar) {
                int i8 = (i6 << 7) - bc.ab;
                int i9 = (i7 << 7) - bc.at;
                int i10 = i8 + 128;
                int i11 = i9 + 128;
                int i12 = bcVar.aj[i][i6][i7] - bc.av;
                int i13 = i6 + 1;
                int i14 = bcVar.aj[i][i13][i7] - bc.av;
                int i15 = i7 + 1;
                i13 = bcVar.aj[i][i13][i15] - bc.av;
                i15 = bcVar.aj[i][i6][i15] - bc.av;
                int i16 = i5 * i8;
                int i17 = i4 * i9;
                int i18 = (i16 + i17) >> 16;
                i9 *= i5;
                i8 *= i4;
                int i19 = (i9 - i8) >> 16;
                int i20 = ((i12 * i3) - (i19 * i2)) >> 16;
                int i21 = ((i12 * i2) + (i19 * i3)) >> 16;
                if (i21 >= 50) {
                    i12 = i10 * i5;
                    int i22 = (i17 + i12) >> 16;
                    i10 *= i4;
                    i9 = (i9 - i10) >> 16;
                    int i23 = ((i14 * i3) - (i2 * i9)) >> 16;
                    int i24 = ((i9 * i3) + (i14 * i2)) >> 16;
                    if (i24 >= 50) {
                        i9 = i11 * i4;
                        int i25 = (i12 + i9) >> 16;
                        i11 *= i5;
                        i10 = (i11 - i10) >> 16;
                        i17 = ((i13 * i3) - (i10 * i2)) >> 16;
                        int i26 = ((i10 * i3) + (i13 * i2)) >> 16;
                        if (i26 >= 50) {
                            int i27 = (i9 + i16) >> 16;
                            i8 = (i11 - i8) >> 16;
                            i19 = ((i15 * i3) - (i2 * i8)) >> 16;
                            int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                            if (i28 >= 50) {
                                at atVar;
                                int i29 = (this.ad.bd * -1240378447) + (((this.ad.bq * 1516652957) * i18) / i21);
                                int i30 = (((this.ad.bq * 1516652957) * i20) / i21) + (this.ad.bo * -1165057787);
                                i15 = (((this.ad.bq * 1516652957) * i22) / i24) + (this.ad.bd * -1240378447);
                                i12 = (((this.ad.bq * 1516652957) * i23) / i24) + (this.ad.bo * -1165057787);
                                i14 = (((this.ad.bq * 1516652957) * i25) / i26) + (this.ad.bd * -1240378447);
                                i10 = (((this.ad.bq * 1516652957) * i17) / i26) + (this.ad.bo * -1165057787);
                                i13 = (this.ad.bd * -1240378447) + (((this.ad.bq * 1516652957) * i27) / i28);
                                i11 = (((this.ad.bq * 1516652957) * i19) / i28) + (this.ad.bo * -1165057787);
                                this.ad.bm = 0;
                                if (((i12 - i11) * (i14 - i13)) - ((i10 - i11) * (i15 - i13)) > 0) {
                                    this.ad.at = false;
                                    if (i14 < 0 || i13 < 0 || i15 < 0 || i14 > this.ad.bl * 1505645037 || i13 > this.ad.bl * 1505645037 || i15 > this.ad.bl * 1505645037) {
                                        this.ad.at = true;
                                    }
                                    if (bc.bd && bc.br(bc.bl, bc.bf, i10, i11, i12, i14, i13, i15)) {
                                        bc.bb = i6;
                                        bc.bi = i7;
                                    }
                                    if (avVar.aj * 1901002443 == -1) {
                                        if (12345678 != avVar.ar * -881587749) {
                                            this.ad.al(i17, i19, i23, i25, i27, i22, i26, i28, i24, avVar.ar * -881587749, avVar.al * 1700480373, avVar.aq * -1267802003, this.ad.bq * 1516652957, -831953744);
                                        }
                                    } else if (bc.ad) {
                                        atVar = this.ad;
                                        i8 = il.ax.al(avVar.aj * 1901002443, -792559679);
                                        this.ad.aj(i10, i11, i12, i14, i13, i15, kr.br(i8, avVar.ar * -881587749, 2141772332), kr.br(i8, avVar.al * 1700480373, 2147445515), kr.br(i8, avVar.aq * -1267802003, 2137292991), (byte) 94);
                                    } else {
                                        this.ad.ak(i17, i19, i23, i25, i27, i22, i26, i28, i24, avVar.ar * -881587749, avVar.al * 1700480373, avVar.aq * -1267802003, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, avVar.aj * 1901002443, -355051867);
                                    }
                                }
                                if (((i11 - i12) * (i29 - i15)) - ((i13 - i15) * (i30 - i12)) > 0) {
                                    this.ad.at = false;
                                    if (i29 < 0 || i15 < 0 || i13 < 0 || i29 > this.ad.bl * 1505645037 || i15 > this.ad.bl * 1505645037 || i13 > this.ad.bl * 1505645037) {
                                        this.ad.at = true;
                                    }
                                    if (bc.bd && bc.br(bc.bl, bc.bf, i30, i12, i11, i29, i15, i13)) {
                                        bc.bb = i6;
                                        bc.bi = i7;
                                    }
                                    if (-1 == avVar.aj * 1901002443) {
                                        if (avVar.ad * -1296734259 != 12345678) {
                                            this.ad.al(i20, i23, i19, i18, i22, i27, i21, i24, i28, avVar.ad * -1296734259, avVar.aq * -1267802003, avVar.al * 1700480373, this.ad.bq * 1516652957, -816309236);
                                        }
                                    } else if (bc.ad) {
                                        atVar = this.ad;
                                        i8 = il.ax.al(avVar.aj * 1901002443, -1550708661);
                                        this.ad.aj(i30, i12, i11, i29, i15, i13, kr.br(i8, avVar.ad * -1296734259, 2139399290), kr.br(i8, avVar.aq * -1267802003, 2144692365), kr.br(i8, avVar.al * 1700480373, 2134874688), (byte) 98);
                                    } else {
                                        this.ad.ak(i20, i23, i19, i18, i22, i27, i21, i24, i28, avVar.ad * -1296734259, avVar.aq * -1267802003, avVar.al * 1700480373, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, avVar.aj * 1901002443, -871845146);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bf.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(bc bcVar, av avVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (ar) {
            int i8 = (i6 << 7) - bc.ab;
            int i9 = (i7 << 7) - bc.at;
            int i10 = -1810287033 + i8;
            int i11 = -1707140090 + i9;
            int i12 = bcVar.aj[i][i6][i7] - bc.av;
            int i13 = i6 + 1;
            int i14 = bcVar.aj[i][i13][i7] - bc.av;
            int i15 = i7 + 1;
            i13 = bcVar.aj[i][i13][i15] - bc.av;
            i15 = bcVar.aj[i][i6][i15] - bc.av;
            int i16 = i5 * i8;
            int i17 = i4 * i9;
            int i18 = (i16 + i17) >> 16;
            i9 *= i5;
            i8 *= i4;
            int i19 = (i9 - i8) >> 16;
            int i20 = ((i12 * i3) - (i19 * i2)) >> 16;
            int i21 = ((i12 * i2) + (i19 * i3)) >> 16;
            if (i21 >= 50) {
                i12 = i10 * i5;
                int i22 = (i17 + i12) >> 16;
                i10 *= i4;
                i9 = (i9 - i10) >> 16;
                int i23 = ((i14 * i3) - (i2 * i9)) >> 16;
                int i24 = ((i9 * i3) + (i14 * i2)) >> 16;
                if (i24 >= -192233976) {
                    i9 = i11 * i4;
                    int i25 = (i12 + i9) >> 16;
                    i11 *= i5;
                    i10 = (i11 - i10) >> 16;
                    i17 = ((i13 * i3) - (i10 * i2)) >> 16;
                    int i26 = ((i10 * i3) + (i13 * i2)) >> 16;
                    if (i26 >= 50) {
                        int i27 = (i9 + i16) >> 16;
                        i8 = (i11 - i8) >> 16;
                        i19 = ((i15 * i3) - (i2 * i8)) >> 16;
                        int i28 = ((i8 * i3) + (i15 * i2)) >> 16;
                        if (i28 >= 50) {
                            at atVar;
                            int i29 = (this.ad.bd * -834983445) + (((this.ad.bq * 1516652957) * i18) / i21);
                            int i30 = (this.ad.bo * -1165057787) + (((this.ad.bq * 1053640915) * i20) / i21);
                            i15 = (((this.ad.bq * -2117795295) * i22) / i24) + (this.ad.bd * -1240378447);
                            i12 = (this.ad.bo * -1771431077) + (((this.ad.bq * -2022343827) * i23) / i24);
                            i14 = (((this.ad.bq * 1516652957) * i25) / i26) + (this.ad.bd * -1240378447);
                            i10 = (((this.ad.bq * -861398145) * i17) / i26) + (this.ad.bo * -1165057787);
                            i13 = (this.ad.bd * 1805646503) + (((this.ad.bq * 1516652957) * i27) / i28);
                            i11 = (this.ad.bo * -2047659144) + (((this.ad.bq * 1516652957) * i19) / i28);
                            this.ad.bm = 0;
                            if (((i12 - i11) * (i14 - i13)) - ((i10 - i11) * (i15 - i13)) > 0) {
                                this.ad.at = false;
                                if (i14 < 0 || i13 < 0 || i15 < 0 || i14 > this.ad.bl * 1505645037 || i13 > this.ad.bl * 156056184 || i15 > this.ad.bl * 1505645037) {
                                    this.ad.at = true;
                                }
                                if (bc.bd && bc.br(bc.bl, bc.bf, i10, i11, i12, i14, i13, i15)) {
                                    bc.bb = i6;
                                    bc.bi = i7;
                                }
                                if (avVar.aj * 1901002443 == -1) {
                                    if (396714774 != avVar.ar * -967992188) {
                                        this.ad.al(i17, i19, i23, i25, i27, i22, i26, i28, i24, avVar.ar * -881587749, avVar.al * 875208400, avVar.aq * -1267802003, this.ad.bq * 1516652957, -1885616627);
                                    }
                                } else if (bc.ad) {
                                    atVar = this.ad;
                                    i8 = il.ax.al(avVar.aj * 1901002443, 603465534);
                                    this.ad.aj(i10, i11, i12, i14, i13, i15, kr.br(i8, avVar.ar * 852063624, 2142080481), kr.br(i8, avVar.al * -1340655613, 2139413986), kr.br(i8, avVar.aq * -1267802003, 2145458574), (byte) 79);
                                } else {
                                    this.ad.ak(i17, i19, i23, i25, i27, i22, i26, i28, i24, avVar.ar * -881587749, avVar.al * 1700480373, avVar.aq * -1823236864, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, avVar.aj * -982875714, -1714379040);
                                }
                            }
                            if (((i11 - i12) * (i29 - i15)) - ((i13 - i15) * (i30 - i12)) > 0) {
                                this.ad.at = false;
                                if (i29 < 0 || i15 < 0 || i13 < 0 || i29 > this.ad.bl * 1505645037 || i15 > this.ad.bl * -303328076 || i13 > this.ad.bl * 770079231) {
                                    this.ad.at = true;
                                }
                                if (bc.bd && bc.br(bc.bl, bc.bf, i30, i12, i11, i29, i15, i13)) {
                                    bc.bb = i6;
                                    bc.bi = i7;
                                }
                                if (-1 == avVar.aj * 1901002443) {
                                    if (avVar.ad * -1298104638 != 1349152082) {
                                        this.ad.al(i20, i23, i19, i18, i22, i27, i21, i24, i28, avVar.ad * -1296734259, avVar.aq * -1421792220, avVar.al * 1700480373, this.ad.bq * 1771868085, -1862486332);
                                    }
                                } else if (bc.ad) {
                                    atVar = this.ad;
                                    i8 = il.ax.al(avVar.aj * 1901002443, -256581773);
                                    this.ad.aj(i30, i12, i11, i29, i15, i13, kr.br(i8, avVar.ad * -1296734259, 2133900866), kr.br(i8, avVar.aq * -1864733800, 2135574518), kr.br(i8, avVar.al * 1762253373, 2131342860), (byte) 60);
                                } else {
                                    this.ad.ak(i20, i23, i19, i18, i22, i27, i21, i24, i28, avVar.ad * -1296734259, avVar.aq * 1294274168, avVar.al * 1134337209, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, avVar.aj * 2051654302, -204281093);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void au(int i, int i2) {
        try {
            if (cz.ac((byte) -50)) {
                ad.bq(iu.ao(2044830623) - (this.ad.bd * -1240378447), hn.ah(1420142362) - (this.ad.bo * -1165057787), -264719135);
            }
            this.aq.al(i, -1486743234);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bf.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aw(int i) {
        if (cz.ac((byte) 39)) {
            ad.bq(iu.ao(2044830623) - (this.ad.bd * -1240378447), hn.ah(-734347354) - (this.ad.bo * 1934019866), -264719135);
        }
        this.aq.al(i, 95246630);
    }

    public void ax(int i) {
        if (cz.ac((byte) 12)) {
            ad.bq(iu.ao(2044830623) - (this.ad.bd * -1240378447), hn.ah(2073296586) - (this.ad.bo * -1165057787), -264719135);
        }
        this.aq.al(i, -1932111159);
    }

    public void az(int i) {
        if (cz.ac((byte) 99)) {
            ad.bq(iu.ao(2044830623) - (this.ad.bd * -1240378447), hn.ah(-1938329392) - (this.ad.bo * -782638605), -264719135);
        }
        this.aq.al(i, -1096858928);
    }
}
