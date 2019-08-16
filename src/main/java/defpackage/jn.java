package defpackage;

import android.support.v4.view.ViewCompat;

/* renamed from: jn */
public class jn extends eo {
    static final int ag = 6;
    static final int dm = -117;
    final boolean aq;

    public jn(boolean z) {
        try {
            this.aq = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jn.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static byte[] al(CharSequence charSequence, int i) {
        try {
            int length = charSequence.length();
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = charSequence.charAt(i2);
                if ((charAt > 0 && charAt < 128) || (charAt >= 160 && charAt <= 255)) {
                    bArr[i2] = (byte) charAt;
                } else if (charAt == 8364) {
                    bArr[i2] = Byte.MIN_VALUE;
                } else if (8218 == charAt) {
                    bArr[i2] = (byte) -126;
                } else if (402 == charAt) {
                    bArr[i2] = (byte) -125;
                } else if (8222 == charAt) {
                    bArr[i2] = (byte) -124;
                } else if (charAt == 8230) {
                    bArr[i2] = (byte) -123;
                } else if (8224 == charAt) {
                    bArr[i2] = (byte) -122;
                } else if (charAt == 8225) {
                    bArr[i2] = (byte) -121;
                } else if (charAt == 710) {
                    bArr[i2] = (byte) -120;
                } else if (charAt == 8240) {
                    bArr[i2] = (byte) -119;
                } else if (charAt == 352) {
                    bArr[i2] = (byte) -118;
                } else if (8249 == charAt) {
                    bArr[i2] = (byte) -117;
                } else if (338 == charAt) {
                    bArr[i2] = (byte) -116;
                } else if (381 == charAt) {
                    bArr[i2] = (byte) -114;
                } else if (charAt == 8216) {
                    bArr[i2] = (byte) -111;
                } else if (8217 == charAt) {
                    bArr[i2] = (byte) -110;
                } else if (8220 == charAt) {
                    bArr[i2] = (byte) -109;
                } else if (8221 == charAt) {
                    bArr[i2] = (byte) -108;
                } else if (charAt == 8226) {
                    bArr[i2] = (byte) -107;
                } else if (charAt == 8211) {
                    bArr[i2] = (byte) -106;
                } else if (8212 == charAt) {
                    bArr[i2] = (byte) -105;
                } else if (732 == charAt) {
                    bArr[i2] = (byte) -104;
                } else if (8482 == charAt) {
                    bArr[i2] = (byte) -103;
                } else if (charAt == 353) {
                    bArr[i2] = (byte) -102;
                } else if (charAt == 8250) {
                    bArr[i2] = (byte) -101;
                } else if (339 == charAt) {
                    bArr[i2] = (byte) -100;
                } else if (382 == charAt) {
                    bArr[i2] = (byte) -98;
                } else if (charAt == 376) {
                    bArr[i2] = (byte) -97;
                } else {
                    bArr[i2] = (byte) 63;
                }
            }
            return bArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jn.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void an(int i) {
        try {
            fq.al = null;
            fq.aj = null;
            dv.ai = null;
            fq.ae = null;
            fq.am = null;
            eh.ak = (byte[][]) null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jn.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ap(bc bcVar, gs[] gsVarArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int sqrt;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        for (i2 = 0; i2 < 4; i2++) {
            i3 = 0;
            while (true) {
                i4 = i3;
                if (i4 >= 104) {
                    break;
                }
                for (i5 = 0; i5 < 104; i5++) {
                    if (1 == (in.aq[i2][i4][i5] & 1)) {
                        i3 = 2 == (in.aq[1][i4][i5] & 2) ? i2 - 1 : i2;
                        if (i3 >= 0) {
                            gsVarArr[i3].al(i4, i5, 1934630762);
                        }
                    }
                }
                i3 = i4 + 1;
            }
        }
        in.av += (((int) (Math.random() * 5.0d)) - 2) * 158815205;
        if (in.av * 1091482093 < -8) {
            in.av = -1270521640;
        }
        if (in.av * 1091482093 > 8) {
            in.av = 1270521640;
        }
        in.at += (((int) (Math.random() * 5.0d)) - 2) * 1733524561;
        if (in.at * 1538215089 < -16) {
            in.at = -1966589200;
        }
        if (in.at * 1538215089 > 16) {
            in.at = 1966589200;
        }
        i3 = 0;
        while (i3 < 4) {
            int i17;
            byte[][] bArr = in.am[i3];
            int sqrt2 = (int) Math.sqrt(5100.0d);
            i2 = 1;
            while (true) {
                i4 = i2;
                if (i4 >= 103) {
                    break;
                }
                i2 = 1;
                while (i2 < 103) {
                    i5 = i2 + 1;
                    i6 = i2 - 1;
                    i7 = in.ad[i3][i5][i4] - in.ad[i3][i6][i4];
                    i8 = i4 + 1;
                    i9 = i4 - 1;
                    i17 = in.ad[i3][i2][i8] - in.ad[i3][i2][i9];
                    sqrt = (int) Math.sqrt((double) ((i17 * i17) + ((i7 * i7) + 65536)));
                    in.ak[i2][i4] = (((((((i7 << 8) / sqrt) * -50) + ((65536 / sqrt) * -10)) + (((i17 << 8) / sqrt) * -50)) / ((sqrt2 * ox.aj) >> 8)) + 96) - ((bArr[i2][i4] >> 1) + ((((bArr[i6][i4] >> 2) + (bArr[i5][i4] >> 3)) + (bArr[i2][i9] >> 2)) + (bArr[i2][i8] >> 3)));
                    i2 = i5;
                }
                i2 = i4 + 1;
            }
            for (i2 = 0; i2 < 104; i2++) {
                in.as[i2] = 0;
                bz.ag[i2] = 0;
                in.ap[i2] = 0;
                cg.au[i2] = 0;
                ab.az[i2] = 0;
            }
            i5 = -5;
            i2 = i3;
            while (i5 < 109) {
                for (i3 = 0; i3 < 104; i3++) {
                    dc aq;
                    int[] iArr2;
                    i4 = i5 + 5;
                    if (i4 >= 0 && i4 < 104) {
                        i4 = am.al[i2][i4][i3] & 255;
                        if (i4 > 0) {
                            aq = cd.aq(i4 - 1, (byte) -87);
                            iArr2 = in.as;
                            iArr2[i3] = iArr2[i3] + (aq.aj * -76452573);
                            iArr2 = bz.ag;
                            iArr2[i3] = iArr2[i3] + (aq.ai * -556738379);
                            iArr2 = in.ap;
                            iArr2[i3] = iArr2[i3] + (aq.ae * 1427567131);
                            iArr2 = cg.au;
                            iArr2[i3] = (aq.am * 1756862521) + iArr2[i3];
                            iArr = ab.az;
                            iArr[i3] = iArr[i3] + 1;
                        }
                    }
                    i4 = i5 - 5;
                    if (i4 >= 0 && i4 < 104) {
                        i4 = am.al[i2][i4][i3] & 255;
                        if (i4 > 0) {
                            aq = cd.aq(i4 - 1, (byte) 7);
                            iArr2 = in.as;
                            iArr2[i3] = iArr2[i3] - (aq.aj * -76452573);
                            iArr2 = bz.ag;
                            iArr2[i3] = iArr2[i3] - (aq.ai * -556738379);
                            iArr2 = in.ap;
                            iArr2[i3] = iArr2[i3] - (aq.ae * 1427567131);
                            iArr2 = cg.au;
                            iArr2[i3] = iArr2[i3] - (aq.am * 1756862521);
                            iArr = ab.az;
                            iArr[i3] = iArr[i3] - 1;
                        }
                    }
                }
                if (i5 >= 1 && i5 < 103) {
                    int i18 = 0;
                    i17 = 0;
                    sqrt2 = 0;
                    i10 = 0;
                    i7 = 0;
                    i4 = -5;
                    while (i4 < 109) {
                        int i19;
                        int i20;
                        int i21;
                        int i22;
                        i6 = i4 + 5;
                        if (i6 < 0 || i6 >= 104) {
                            i3 = i17;
                        } else {
                            i18 += in.as[i6];
                            i3 = bz.ag[i6] + i17;
                            sqrt2 += in.ap[i6];
                            i10 += cg.au[i6];
                            i7 += ab.az[i6];
                        }
                        i17 = i4 - 5;
                        if (i17 < 0 || i17 >= 104) {
                            i19 = i3;
                            i20 = i10;
                            i21 = sqrt2;
                            i22 = i7;
                        } else {
                            i18 -= in.as[i17];
                            i19 = i3 - bz.ag[i17];
                            i20 = i10 - cg.au[i17];
                            i21 = sqrt2 - in.ap[i17];
                            i22 = i7 - ab.az[i17];
                        }
                        if (i4 < 1 || i4 >= 103) {
                            i3 = i18;
                        } else if (client.as && (in.aq[0][i5][i4] & 2) == 0 && (in.aq[i2][i5][i4] & 16) != 0) {
                            i3 = i18;
                        } else {
                            if (i2 < in.ar * 474821241) {
                                in.ar = 1544460233 * i2;
                            }
                            sqrt2 = am.al[i2][i5][i4] & 255;
                            i7 = in.aj[i2][i5][i4] & 255;
                            if (sqrt2 > 0 || i7 > 0) {
                                i17 = in.ad[i2][i5][i4];
                                i10 = i5 + 1;
                                i6 = in.ad[i2][i10][i4];
                                i9 = i4 + 1;
                                i8 = in.ad[i2][i10][i9];
                                sqrt = in.ad[i2][i5][i9];
                                i11 = in.ak[i5][i4];
                                i12 = in.ak[i10][i4];
                                i13 = in.ak[i10][i9];
                                int i23 = in.ak[i5][i9];
                                if (sqrt2 > 0) {
                                    i9 = (i18 * 256) / i20;
                                    i14 = i19 / i22;
                                    i10 = i21 / i22;
                                    i3 = bm.af(i9, i14, i10, -965010306);
                                    i15 = in.av;
                                    i10 += in.at * 1538215089;
                                    if (i10 < 0) {
                                        i10 = 0;
                                    } else if (i10 > 255) {
                                        i10 = 255;
                                    }
                                    i10 = bm.af((i9 + (i15 * 1091482093)) & 255, i14, i10, 1911848289);
                                    i16 = i3;
                                } else {
                                    i10 = -1;
                                    i16 = -1;
                                }
                                if (i2 > 0) {
                                    Object obj = (sqrt2 != 0 || fk.ai[i2][i5][i4] == (byte) 0) ? 1 : null;
                                    if (i7 > 0 && !ds.aq(i7 - 1, 1750520840).ai) {
                                        obj = null;
                                    }
                                    if (obj != null && i6 == i17 && i17 == i8 && i17 == sqrt) {
                                        int[] iArr3 = hj.ax[i2][i5];
                                        iArr3[i4] = iArr3[i4] | 2340;
                                    }
                                }
                                int i24 = -1 != i10 ? bl.az[da.ao(i10, 96, (byte) 5)] : ViewCompat.MEASURED_STATE_MASK;
                                if (i7 == 0) {
                                    bcVar.ai(i2, i5, i4, 0, 0, -1, i17, i6, i8, sqrt, da.ao(i16, i11, (byte) -56), da.ao(i16, i12, (byte) -17), da.ao(i16, i13, (byte) 27), da.ao(i16, i23, (byte) 83), 0, 0, 0, 0, i24, ViewCompat.MEASURED_STATE_MASK);
                                    i3 = i18;
                                } else {
                                    int i25;
                                    byte b = fk.ai[i2][i5][i4];
                                    byte b2 = ja.ae[i2][i5][i4];
                                    dj aq2 = ds.aq(i7 - 1, 1815737308);
                                    i7 = aq2.aj * 1610744207;
                                    if (i7 >= 0) {
                                        i3 = il.ax.al(i7, -1833386414);
                                        i25 = -1;
                                    } else if (16711935 == aq2.al * -1977739369) {
                                        i3 = -2;
                                        i7 = -1;
                                        i25 = -2;
                                    } else {
                                        i10 = bm.af(aq2.am * -385196275, aq2.ak * -947154665, aq2.as * 1306106505, -107985055);
                                        i15 = aq2.am;
                                        i25 = in.av;
                                        i3 = (in.at * 1538215089) + (aq2.as * 1306106505);
                                        if (i3 < 0) {
                                            i3 = 0;
                                        } else if (i3 > 255) {
                                            i3 = 255;
                                        }
                                        i3 = bm.af(((i15 * -385196275) + (i25 * 1091482093)) & 255, aq2.ak * -947154665, i3, -216392802);
                                        i25 = i10;
                                    }
                                    int i26 = ViewCompat.MEASURED_STATE_MASK;
                                    if (i3 != -2) {
                                        i26 = bl.az[hs.ah(i3, 96, -1820259412)];
                                    }
                                    if (-1 != aq2.ae * 681932363) {
                                        i10 = aq2.ag;
                                        i15 = in.av;
                                        i3 = (in.at * 1538215089) + (aq2.au * -2103328993);
                                        if (i3 < 0) {
                                            i3 = 0;
                                        } else if (i3 > 255) {
                                            i3 = 255;
                                        }
                                        i26 = bl.az[hs.ah(bm.af(((i10 * 572147523) + (i15 * 1091482093)) & 255, aq2.ap * 1745382697, i3, 1302278023), 96, -907692808)];
                                    }
                                    bcVar.ai(i2, i5, i4, b + 1, b2, i7, i17, i6, i8, sqrt, da.ao(i16, i11, (byte) -32), da.ao(i16, i12, (byte) -16), da.ao(i16, i13, (byte) -1), da.ao(i16, i23, (byte) 44), hs.ah(i25, i11, -394698238), hs.ah(i25, i12, 1143132773), hs.ah(i25, i13, -61517796), hs.ah(i25, i23, -961626476), i24, i26);
                                    i3 = i18;
                                }
                            } else {
                                i3 = i18;
                            }
                        }
                        i4++;
                        i7 = i22;
                        i10 = i20;
                        sqrt2 = i21;
                        i17 = i19;
                        i18 = i3;
                    }
                }
                i5++;
            }
            i3 = 1;
            while (true) {
                i5 = i3;
                if (i5 >= 103) {
                    break;
                }
                for (i3 = 1; i3 < 103; i3++) {
                    bcVar.aj(i2, i3, i5, jc.au(i2, i3, i5, 1580978967));
                }
                i3 = i5 + 1;
            }
            am.al[i2] = (byte[][]) null;
            in.aj[i2] = (byte[][]) null;
            fk.ai[i2] = (byte[][]) null;
            ja.ae[i2] = (byte[][]) null;
            in.am[i2] = (byte[][]) null;
            i3 = i2 + 1;
        }
        bcVar.bd(-50, -10, -50);
        i3 = 0;
        while (true) {
            i2 = i3;
            if (i2 >= 104) {
                break;
            }
            for (i3 = 0; i3 < 104; i3++) {
                if ((in.aq[1][i2][i3] & 2) == 2) {
                    bcVar.ar(i2, i3);
                }
            }
            i3 = i2 + 1;
        }
        i4 = 2;
        i3 = 0;
        i5 = 1;
        i2 = 4;
        while (i3 < 4) {
            if (i3 > 0) {
                i6 = i2 << 3;
                i8 = i5 << 3;
                sqrt = i4 << 3;
            } else {
                i6 = i2;
                i8 = i5;
                sqrt = i4;
            }
            i2 = 0;
            while (true) {
                i13 = i2;
                if (i13 > i3) {
                    break;
                }
                i12 = 0;
                while (i12 <= 104) {
                    i16 = 0;
                    while (i16 <= 104) {
                        if ((hj.ax[i13][i16][i12] & i8) != 0) {
                            i9 = i12;
                            while (i9 > 0 && (hj.ax[i13][i16][i9 - 1] & i8) != 0) {
                                i9--;
                            }
                            i11 = i12;
                            while (i11 < 104) {
                                i2 = i11 + 1;
                                if ((hj.ax[i13][i16][i2] & i8) == 0) {
                                    break;
                                }
                                i11 = i2;
                            }
                            i14 = i13;
                            while (i14 > 0) {
                                for (i2 = i9; i2 <= i11; i2++) {
                                    if ((hj.ax[i14 - 1][i16][i2] & i8) == 0) {
                                        break;
                                    }
                                }
                                i14--;
                            }
                            i15 = i13;
                            while (i15 < i3) {
                                for (i2 = i9; i2 <= i11; i2++) {
                                    if ((hj.ax[i15 + 1][i16][i2] & i8) == 0) {
                                        break;
                                    }
                                }
                                i15++;
                            }
                            if (((i15 + 1) - i14) * ((i11 - i9) + 1) >= 8) {
                                i5 = i16 * 128;
                                bc.al(i3, 1, i5, i5, i9 * 128, (i11 * 128) + 128, in.ad[i15][i16][i9] - 240, in.ad[i14][i16][i9]);
                                for (i5 = i14; i5 <= i15; i5++) {
                                    for (i2 = i9; i2 <= i11; i2++) {
                                        iArr = hj.ax[i5][i16];
                                        iArr[i2] = iArr[i2] & i8;
                                    }
                                }
                            }
                        }
                        try {
                            if ((hj.ax[i13][i16][i12] & sqrt) != 0) {
                                i9 = i16;
                                while (i9 > 0 && (hj.ax[i13][i9 - 1][i12] & sqrt) != 0) {
                                    i9--;
                                }
                                i11 = i16;
                                while (i11 < 104) {
                                    i2 = i11 + 1;
                                    if ((hj.ax[i13][i2][i12] & sqrt) == 0) {
                                        break;
                                    }
                                    i11 = i2;
                                }
                                i14 = i13;
                                while (i14 > 0) {
                                    for (i2 = i9; i2 <= i11; i2++) {
                                        if ((hj.ax[i14 - 1][i2][i12] & sqrt) == 0) {
                                            break;
                                        }
                                    }
                                    i14--;
                                }
                                i15 = i13;
                                while (i15 < i3) {
                                    for (i2 = i9; i2 <= i11; i2++) {
                                        if ((hj.ax[i15 + 1][i2][i12] & sqrt) == 0) {
                                            break;
                                        }
                                    }
                                    i15++;
                                }
                                if (((i15 + 1) - i14) * ((i11 - i9) + 1) >= 8) {
                                    i10 = i12 * 128;
                                    bc.al(i3, 2, i9 * 128, (i11 * 128) + 128, i10, i10, in.ad[i15][i9][i12] - 240, in.ad[i14][i9][i12]);
                                    for (i5 = i14; i5 <= i15; i5++) {
                                        for (i2 = i9; i2 <= i11; i2++) {
                                            iArr = hj.ax[i5][i2];
                                            iArr[i12] = iArr[i12] & sqrt;
                                        }
                                    }
                                }
                            }
                            if ((hj.ax[i13][i16][i12] & i6) != 0) {
                                i9 = i12;
                                while (i9 > 0 && (hj.ax[i13][i16][i9 - 1] & i6) != 0) {
                                    i9--;
                                }
                                i11 = i12;
                                while (i11 < 104) {
                                    i2 = i11 + 1;
                                    if ((hj.ax[i13][i16][i2] & i6) == 0) {
                                        break;
                                    }
                                    i11 = i2;
                                }
                                i14 = i16;
                                while (i14 > 0) {
                                    for (i2 = i9; i2 <= i11; i2++) {
                                        if ((hj.ax[i13][i14 - 1][i2] & i6) == 0) {
                                            break;
                                        }
                                    }
                                    i14--;
                                }
                                i15 = i16;
                                while (i15 < 104) {
                                    for (i2 = i9; i2 <= i11; i2++) {
                                        if ((hj.ax[i13][i15 + 1][i2] & i6) == 0) {
                                            break;
                                        }
                                    }
                                    i15++;
                                }
                                if (((i11 - i9) + 1) * ((i15 - i14) + 1) >= 4) {
                                    i7 = in.ad[i13][i14][i9];
                                    bc.al(i3, 4, i14 * 128, (i15 * 128) + 128, i9 * 128, (i11 * 128) + 128, i7, i7);
                                    for (i5 = i14; i5 <= i15; i5++) {
                                        for (i2 = i9; i2 <= i11; i2++) {
                                            iArr = hj.ax[i13][i5];
                                            iArr[i2] = iArr[i2] & i6;
                                        }
                                    }
                                }
                            }
                            i16++;
                        } catch (RuntimeException e) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("jn.ap(");
                            stringBuilder.append(')');
                            throw mv.aq(e, stringBuilder.toString());
                        }
                    }
                    i12++;
                }
                i2 = i13 + 1;
            }
            i3++;
            i4 = sqrt;
            i5 = i8;
            i2 = i6;
        }
    }

    public static void aq(kh khVar, String str, String str2, int i, boolean z, byte b) {
        try {
            int af = khVar.af(str, -1832200120);
            eb.ar(khVar, af, khVar.ay(af, str2, (byte) 98), i, z, -1804871046);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jn.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ap((er) obj, (er) obj2, 1717424075);
    }

    /* Access modifiers changed, original: 0000 */
    public int ap(er erVar, er erVar2, int i) {
        try {
            return erVar2.aj * -356714521 != erVar.aj * -356714521 ? this.aq ? (erVar.aj * -356714521) - (erVar2.aj * -356714521) : (erVar2.aj * -356714521) - (erVar.aj * -356714521) : aq(erVar, erVar2, 394605972);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jn.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int au(er erVar, er erVar2) {
        return erVar2.aj * -356714521 != erVar.aj * 423313846 ? this.aq ? (erVar.aj * -1329783208) - (erVar2.aj * -615759045) : (erVar2.aj * -356714521) - (erVar.aj * -1610243470) : aq(erVar, erVar2, 1059948869);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ap((er) obj, (er) obj2, 1900814801);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jn.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
