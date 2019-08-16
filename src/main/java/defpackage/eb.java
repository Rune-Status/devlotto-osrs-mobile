package defpackage;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.MotionEventCompat;

/* renamed from: eb */
public class eb extends es {
    public static final int bn = 50;
    public static final int br = 56;
    static final int ex = 128;
    static hd pc;

    eb(int i, int i2) {
        try {
            super(i, i2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public eb(int[] iArr, int i, int i2) {
        try {
            super(iArr, i, i2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void aa(byte b) {
        try {
            if (!dv.bc(hm.dq * 2109476887, 2143247247) && !if.bv(hm.dq * 2109476887, 2130903395)) {
                int i = hm.dq * 2109476887;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            if (!gq.af(hm.dq * 2109476887, (byte) -3)) {
                                ex.bu(1795621861);
                                break;
                            }
                            break;
                        case 3:
                            if (!gq.af(hm.dq * 2109476887, (byte) -29)) {
                                cv.bw(-2123790062);
                                break;
                            }
                            break;
                        case 4:
                            if (!gq.af(hm.dq * 2109476887, (byte) 88)) {
                                ia.ac(false, false, 1712629986);
                                break;
                            }
                            break;
                        default:
                            if (!gq.af(hm.dq * 2109476887, (byte) 39)) {
                                client.aq.abx((byte) 122).gs(eo.am, 1066400917);
                                dw.av(false, 1023508634);
                                break;
                            }
                            break;
                    }
                }
                fg.bg(1956938966);
                oz.ao(false, -1168192866);
                hm.dq = 2016270425;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ar(kh khVar, int i, int i2, int i3, boolean z, int i4) {
        try {
            ko.aj = -515568231;
            ko.ai = khVar;
            ko.ae = 1495124335 * i;
            ne.am = 1291550091 * i2;
            mo.ak = -779850513 * i3;
            fx.ag = z;
            ko.as = 2123225200;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void cd(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i3;
        int i11 = i2;
        for (int i12 = -i5; i12 < 0; i12++) {
            int i13;
            int i14;
            int i15 = i8;
            while (i15 < 0) {
                i13 = i11 + 1;
                i11 = iArr2[i11];
                if (i11 != 0) {
                    i14 = i10 + 1;
                    iArr[i10] = i11;
                } else {
                    i14 = i10 + 1;
                }
                i11 = i13 + 1;
                i10 = iArr2[i13];
                if (i10 != 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i10;
                    i14 = i13;
                } else {
                    i14++;
                }
                i10 = i11 + 1;
                i11 = iArr2[i11];
                if (i11 != 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i11;
                    i14 = i13;
                } else {
                    i14++;
                }
                i11 = i10 + 1;
                i13 = iArr2[i10];
                if (i13 != 0) {
                    iArr[i14] = i13;
                }
                i15++;
                i10 = i14 + 1;
            }
            i13 = i9;
            i14 = i10;
            while (i13 < 0) {
                i10 = iArr2[i11];
                if (i10 != 0) {
                    iArr[i14] = i10;
                }
                i14++;
                i13++;
                i11++;
            }
            i10 = i14 + i6;
            i11 += i7;
        }
    }

    static void cf(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i3;
        int i11 = i2;
        for (int i12 = -i5; i12 < 0; i12++) {
            int i13;
            int i14;
            int i15 = i8;
            while (i15 < 0) {
                i13 = i11 + 1;
                i11 = iArr2[i11];
                if (i11 != 0) {
                    i14 = i10 + 1;
                    iArr[i10] = i11;
                } else {
                    i14 = i10 + 1;
                }
                i11 = i13 + 1;
                i10 = iArr2[i13];
                if (i10 != 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i10;
                    i14 = i13;
                } else {
                    i14++;
                }
                i10 = i11 + 1;
                i11 = iArr2[i11];
                if (i11 != 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i11;
                    i14 = i13;
                } else {
                    i14++;
                }
                i11 = i10 + 1;
                i13 = iArr2[i10];
                if (i13 != 0) {
                    iArr[i14] = i13;
                }
                i15++;
                i10 = i14 + 1;
            }
            i13 = i9;
            i14 = i10;
            while (i13 < 0) {
                i10 = iArr2[i11];
                if (i10 != 0) {
                    iArr[i14] = i10;
                }
                i14++;
                i13++;
                i11++;
            }
            i10 = i14 + i6;
            i11 += i7;
        }
    }

    static void cu(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2;
        int i8 = i;
        for (int i9 = -i4; i9 < 0; i9++) {
            int i10 = (i7 + i3) - 3;
            while (i7 < i10) {
                int i11 = i7 + 1;
                int i12 = i8 + 1;
                iArr[i7] = iArr2[i8];
                i7 = i11 + 1;
                i8 = i12 + 1;
                iArr[i11] = iArr2[i12];
                i11 = i7 + 1;
                i12 = i8 + 1;
                iArr[i7] = iArr2[i8];
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

    static void db(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = i6;
        int i13 = i4;
        for (int i14 = -i9; i14 < 0; i14++) {
            int i15 = -i8;
            int i16 = i13;
            while (i15 < 0) {
                i13 = iArr2[i16];
                if (i13 != 0) {
                    int i17 = iArr[i12];
                    int i18 = i17 + i13;
                    i13 = (i13 & 16711935) + (i17 & 1057890005);
                    i13 = (i13 & -366850243) + ((i18 - i13) & 65536);
                    iArr[i12] = (i18 - i13) | (i13 - (i13 >>> 8));
                }
                i15++;
                i16++;
                i12++;
            }
            i12 += i10;
            i13 = i16 + i11;
        }
    }

    static void dc(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = i6;
        int i13 = i4;
        for (int i14 = -i9; i14 < 0; i14++) {
            int i15 = -i8;
            int i16 = i13;
            while (i15 < 0) {
                i13 = iArr2[i16];
                if (i13 != 0) {
                    int i17 = iArr[i12];
                    int i18 = i17 + i13;
                    i13 = (i13 & 16711935) + (i17 & -1524713434);
                    i13 = (i13 & -862321715) + ((i18 - i13) & 1375972327);
                    iArr[i12] = (i18 - i13) | (i13 - (i13 >>> 8));
                }
                i15++;
                i16++;
                i12++;
            }
            i12 += i10;
            i13 = i16 + i11;
        }
    }

    static void dd(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = -(i3 >> 2);
        int i8 = -(i3 & 3);
        int i9 = i2;
        int i10 = i;
        for (int i11 = -i4; i11 < 0; i11++) {
            int i12;
            int i13;
            byte b;
            int i14 = i7;
            while (i14 < 0) {
                i12 = i10 + 1;
                byte b2 = bArr[i10];
                if (b2 != (byte) 0) {
                    i13 = i9 + 1;
                    iArr[i9] = iArr2[b2 & 255];
                } else {
                    i13 = i9 + 1;
                }
                i10 = i12 + 1;
                b = bArr[i12];
                if (b != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = iArr2[b & -1022289416];
                    i13 = i12;
                } else {
                    i13++;
                }
                i9 = i10 + 1;
                b2 = bArr[i10];
                if (b2 != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = iArr2[b2 & 255];
                    i13 = i12;
                } else {
                    i13++;
                }
                i10 = i9 + 1;
                byte b3 = bArr[i9];
                if (b3 != (byte) 0) {
                    iArr[i13] = iArr2[b3 & 1112354525];
                }
                i14++;
                i9 = i13 + 1;
            }
            i12 = i8;
            i13 = i9;
            while (i12 < 0) {
                b = bArr[i10];
                if (b != (byte) 0) {
                    iArr[i13] = iArr2[b & 255];
                }
                i13++;
                i12++;
                i10++;
            }
            i9 = i13 + i5;
            i10 += i6;
        }
    }

    static void de(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 256 - i8;
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14 = -i4;
            while (i14 < 0) {
                int i15 = iArr2[i12];
                if (i15 != 0) {
                    iArr[i11] = (((((i15 & 16711935) * i8) & -16711936) | (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i8) & 16711680)) >>> 8) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i10) & 16711680) | (((16711935 & i9) * i10) & -16711936)) >>> 8);
                }
                i11++;
                i14++;
                i12++;
            }
            i11 += i6;
            i12 += i7;
        }
    }

    static void df(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i3;
        for (int i11 = -i6; i11 < 0; i11++) {
            int i12 = i;
            int i13 = -i5;
            while (i13 < 0) {
                byte b = bArr[(i12 >> 16) + ((i2 >> 16) * i9)];
                if (b != (byte) 0) {
                    iArr[i10] = iArr2[b & 255];
                }
                i12 += i7;
                i13++;
                i10++;
            }
            i2 += i8;
            i10 += i4;
        }
    }

    static void dg(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = 256 - i11;
        int i13 = i4;
        for (int i14 = -i7; i14 < 0; i14++) {
            int i15 = i2;
            int i16 = -i6;
            while (i16 < 0) {
                int i17 = iArr2[(i15 >> 16) + ((i3 >> 16) * i10)];
                if (i17 != 0) {
                    int i18 = iArr[i13];
                    iArr[i13] = (((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i11) + ((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i12)) & 16711680) + (-16711936 & (((16711935 & i17) * i11) + ((16711935 & i18) * i12)))) >> 8;
                }
                i15 += i8;
                i16++;
                i13++;
            }
            i3 += i9;
            i13 += i5;
        }
    }

    static void di(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i4;
        for (int i12 = -i7; i12 < 0; i12++) {
            int i13 = -i6;
            int i14 = i2;
            while (i13 < 0) {
                int i15 = iArr2[(i14 >> 16) + ((i3 >> 16) * i10)];
                if (i15 != 0) {
                    iArr[i11] = i15;
                }
                i14 += i8;
                i13++;
                i11++;
            }
            i3 += i9;
            i11 += i5;
        }
    }

    static void dj(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = 256 - i11;
        int i13 = i4;
        for (int i14 = -i7; i14 < 0; i14++) {
            int i15 = i2;
            int i16 = -i6;
            while (i16 < 0) {
                int i17 = iArr2[(i15 >> 16) + ((i3 >> 16) * i10)];
                if (i17 != 0) {
                    int i18 = iArr[i13];
                    iArr[i13] = (((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i11) + ((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i12)) & 16711680) + (-16711936 & (((16711935 & i17) * i11) + ((16711935 & i18) * i12)))) >> 8;
                }
                i15 += i8;
                i16++;
                i13++;
            }
            i3 += i9;
            i13 += i5;
        }
    }

    static void dk(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = 256 - i11;
        int i13 = i4;
        for (int i14 = -i7; i14 < 0; i14++) {
            int i15 = i2;
            int i16 = -i6;
            while (i16 < 0) {
                int i17 = iArr2[(i15 >> 16) + ((i3 >> 16) * i10)];
                if (i17 != 0) {
                    int i18 = iArr[i13];
                    iArr[i13] = (((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i11) + ((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i12)) & 16711680) + (-16711936 & (((16711935 & i17) * i11) + ((16711935 & i18) * i12)))) >> 8;
                }
                i15 += i8;
                i16++;
                i13++;
            }
            i3 += i9;
            i13 += i5;
        }
    }

    static void dl(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i4;
        for (int i12 = -i7; i12 < 0; i12++) {
            int i13 = -i6;
            int i14 = i2;
            while (i13 < 0) {
                int i15 = iArr2[(i14 >> 16) + ((i3 >> 16) * i10)];
                if (i15 != 0) {
                    iArr[i11] = i15;
                }
                i14 += i8;
                i13++;
                i11++;
            }
            i3 += i9;
            i11 += i5;
        }
    }

    static void dp(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = i6;
        int i14 = i4;
        for (int i15 = -i9; i15 < 0; i15++) {
            int i16 = -i8;
            int i17 = i14;
            while (i16 < 0) {
                i14 = iArr2[i17];
                if (i14 != 0) {
                    int i18 = (16711935 & i14) * i12;
                    i14 = ((((i14 * i12) - i18) & 16711680) + (i18 & -16711936)) >>> 8;
                    i18 = iArr[i13];
                    int i19 = i14 + i18;
                    i14 = (i14 & 16711935) + (i18 & 16711935);
                    i14 = (i14 & 16777472) + ((i19 - i14) & 65536);
                    iArr[i13] = (i19 - i14) | (i14 - (i14 >>> 8));
                }
                i16++;
                i17++;
                i13++;
            }
            i13 += i10;
            i14 = i17 + i11;
        }
    }

    static void ds(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = -91414457 - i8;
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14 = -i4;
            while (i14 < 0) {
                int i15 = iArr2[i12];
                if (i15 != 0) {
                    iArr[i11] = (((((i15 & -1187372570) * i8) & -32342994) | (((538680948 & i15) * i8) & 16711680)) >>> 8) + (((((-1106167618 & i9) * i10) & -151465610) | (((-594762938 & i9) * i10) & -16711936)) >>> 8);
                }
                i14++;
                i12++;
                i11++;
            }
            i11 += i6;
            i12 += i7;
        }
    }

    static void du(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = i6;
        int i14 = i4;
        for (int i15 = -i9; i15 < 0; i15++) {
            int i16 = -i8;
            int i17 = i14;
            while (i16 < 0) {
                i14 = iArr2[i17];
                if (i14 != 0) {
                    int i18 = (-1572449399 & i14) * i12;
                    i14 = ((((i14 * i12) - i18) & -1708543760) + (i18 & -963693263)) >>> 8;
                    i18 = iArr[i13];
                    int i19 = i14 + i18;
                    i14 = (i14 & 16711935) + (i18 & 16711935);
                    i14 = (i14 & 16777472) + ((i19 - i14) & -727471197);
                    iArr[i13] = (i19 - i14) | (i14 - (i14 >>> 8));
                }
                i16++;
                i17++;
                i13++;
            }
            i13 += i10;
            i14 = i17 + i11;
        }
    }

    static void dw(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = 256 - i11;
        int i13 = i4;
        for (int i14 = -i7; i14 < 0; i14++) {
            int i15 = i2;
            int i16 = -i6;
            while (i16 < 0) {
                int i17 = iArr2[(i15 >> 16) + ((i3 >> 16) * i10)];
                if (i17 != 0) {
                    int i18 = iArr[i13];
                    iArr[i13] = (((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i11) + ((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i12)) & 16711680) + (-16711936 & (((16711935 & i17) * i11) + ((16711935 & i18) * i12)))) >> 8;
                }
                i15 += i8;
                i16++;
                i13++;
            }
            i3 += i9;
            i13 += i5;
        }
    }

    static void dy(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 256 - i8;
        int i10 = i3;
        int i11 = i2;
        for (int i12 = -i5; i12 < 0; i12++) {
            int i13 = -i4;
            while (i13 < 0) {
                int i14;
                int i15 = iArr2[i11];
                if (i15 != 0) {
                    i14 = iArr[i10];
                    if (i14 == 0) {
                        i14 = i10 + 1;
                        iArr[i10] = i15 | ((i9 - 48) << 24);
                    } else {
                        iArr[i10] = (((((i14 & 16711935) * i9) + ((i15 & 16711935) * i8)) & -16711936) + (16711680 & (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i9) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i8)))) >> 8;
                        i14 = i10 + 1;
                    }
                } else {
                    i14 = i10 + 1;
                }
                i13++;
                i11++;
                i10 = i14;
            }
            i10 += i6;
            i11 += i7;
        }
    }

    static void dz(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = -2000635528 - i11;
        int i13 = i4;
        for (int i14 = -i7; i14 < 0; i14++) {
            int i15 = i2;
            int i16 = -i6;
            while (i16 < 0) {
                int i17 = iArr2[(i15 >> 16) + ((i3 >> 16) * i10)];
                if (i17 != 0) {
                    int i18 = iArr[i13];
                    iArr[i13] = (((((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i11) + ((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i12)) & 1927607169) + ((((-763359197 & i17) * i11) + ((16711935 & i18) * i12)) & -16711936)) >> 8;
                }
                i15 += i8;
                i16++;
                i13++;
            }
            i3 += i9;
            i13 += i5;
        }
    }

    public void aa(ef efVar, int i, int i2, byte b) {
        try {
            int i3;
            int i4;
            int i5 = efVar.aj + i;
            int i6 = i2 + efVar.ai;
            int i7 = ((this.aq * 1462922907) * i6) + i5;
            int i8 = efVar.al;
            int i9 = efVar.ar;
            int i10 = (this.aq * 1462922907) - i9;
            int i11 = 0;
            if (i6 < this.al * -709973917) {
                i3 = (this.al * -709973917) - i6;
                i8 -= i3;
                i6 = -709973917 * this.al;
                i4 = (i3 * i9) + 0;
                i7 += i3 * (this.aq * 1462922907);
            } else {
                i4 = 0;
            }
            i6 += i8;
            i6 = i6 > this.aj * 157809585 ? i8 - (i6 - (this.aj * 157809585)) : i8;
            if (i5 < this.ai * 1947951707) {
                i8 = (this.ai * 1947951707) - i5;
                i9 -= i8;
                i5 = this.ai * 1947951707;
                i4 += i8;
                i7 += i8;
                i11 = i8 + 0;
                i8 = i10 + i8;
            } else {
                i8 = i10;
            }
            i5 += i9;
            if (i5 > this.ae * 428635993) {
                i5 -= this.ae * 428635993;
                i10 = i9 - i5;
                i3 = i11 + i5;
                i8 += i5;
            } else {
                i3 = i11;
                i10 = i9;
            }
            if (i10 > 0 && i6 > 0) {
                kt.ao(this.ad, efVar.ad, efVar.aq, i4, i7, i10, i6, i8, i3, -1749805364);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ab(ee eeVar, int i, int i2, int i3, short s) {
        try {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = eeVar.al + i;
            int i9 = i2 + eeVar.aj;
            int i10 = ((this.aq * 1462922907) * i9) + i8;
            int i11 = eeVar.ar;
            int i12 = eeVar.aq;
            int i13 = (this.aq * 1462922907) - i12;
            int i14 = 0;
            if (i9 < this.al * -709973917) {
                int i15 = (this.al * -709973917) - i9;
                i11 -= i15;
                i9 = this.al * -709973917;
                i4 = (i15 * i12) + 0;
                i10 += i15 * (this.aq * 1462922907);
            } else {
                i4 = 0;
            }
            i9 += i11;
            int i16 = i9 > this.aj * 157809585 ? i11 - (i9 - (this.aj * 157809585)) : i11;
            if (i8 < this.ai * 1947951707) {
                i9 = (this.ai * 1947951707) - i8;
                i12 -= i9;
                i8 = this.ai * 1947951707;
                i4 += i9;
                i10 += i9;
                i14 = i9 + 0;
                i13 += i9;
            }
            i8 += i12;
            if (i8 > this.ae * 428635993) {
                i8 -= this.ae * 428635993;
                i5 = i12 - i8;
                i6 = i14 + i8;
                i7 = i13 + i8;
            } else {
                i6 = i14;
                i7 = i13;
                i5 = i12;
            }
            if (i5 > 0 && i16 > 0) {
                if (256 == i3) {
                    hr.av(0, 0, 0, this.ad, eeVar.ad, i4, 0, i10, 0, i5, i16, i7, i6, -1903609113);
                } else {
                    cl.at(0, 0, 0, this.ad, eeVar.ad, i4, 0, i10, 0, i5, i16, i7, i6, i3, -490497679);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i) {
        try {
            aq(1730606085);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ae(int i, int i2, int i3, int i4, int i5) {
        try {
            if (i2 >= this.al * -709973917 && i2 < this.aj * 157809585) {
                if (i < this.ai * 1947951707) {
                    i3 -= (this.ai * 1947951707) - i;
                    i = this.ai * 1947951707;
                }
                if (i + i3 > this.ae * 428635993) {
                    i3 = (this.ae * 428635993) - i;
                }
                int i6 = this.aq;
                for (int i7 = 0; i7 < i3; i7++) {
                    this.ad[(((1462922907 * i6) * i2) + i) + i7] = i4;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ag(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                try {
                    ae(i, i2, i7 + 1, i5, -237172118);
                    return;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("eb.ag(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            ae(i + i7, i2, (-i7) + 1, i5, -809204408);
        } else if (i7 != 0) {
            int i9;
            int i10;
            int i11;
            if (i7 + i8 < 0) {
                i9 = i + i7;
                i7 = -i7;
                i10 = i2 + i8;
                i11 = -i8;
            } else {
                i11 = i8;
                i10 = i2;
                i9 = i;
            }
            if (i7 > i11) {
                i10 = (i10 << 16) + 32768;
                i8 = (int) Math.floor((((double) (i11 << 16)) / ((double) i7)) + 0.5d);
                i11 = i7 + i9;
                if (i9 < this.ai * 1947951707) {
                    i10 += ((this.ai * 1947951707) - i9) * i8;
                    i9 = this.ai * 1947951707;
                }
                if (i11 >= this.ae * 428635993) {
                    i11 = (this.ae * 428635993) - 1;
                }
                while (i9 <= i11) {
                    i7 = i10 >> 16;
                    if (i7 >= this.al * -709973917 && i7 < this.aj * 157809585) {
                        this.ad[(i7 * (this.aq * 1462922907)) + i9] = i5;
                    }
                    i10 += i8;
                    i9++;
                }
                return;
            }
            i9 = (i9 << 16) + 32768;
            i8 = (int) Math.floor((((double) (i7 << 16)) / ((double) i11)) + 0.5d);
            i11 += i10;
            if (i10 < this.al * -709973917) {
                i9 += ((this.al * -709973917) - i10) * i8;
                i10 = this.al * -709973917;
            }
            if (i11 >= this.aj * 157809585) {
                i11 = (this.aj * 157809585) - 1;
            }
            while (i10 <= i11) {
                i7 = i9 >> 16;
                if (i7 >= this.ai * 1947951707 && i7 < this.ae * 428635993) {
                    this.ad[i7 + ((this.aq * 1462922907) * i10)] = i5;
                }
                i9 += i8;
                i10++;
            }
        } else if (i8 >= 0) {
            ak(i, i2, i8 + 1, i5, -871948702);
        } else {
            ak(i, i8 + i2, (-i8) + 1, i5, -154707216);
        }
    }

    public void ah(ee eeVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            try {
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11 = eeVar.aq;
                int i12 = eeVar.ar;
                int i13 = eeVar.ai;
                int i14 = eeVar.ae;
                int i15 = (i13 << 16) / i3;
                int i16 = (i14 << 16) / i4;
                int i17 = 0;
                if (eeVar.al > 0) {
                    i6 = (((eeVar.al << 16) + i15) - 1) / i15;
                    i += i6;
                    i7 = ((i6 * i15) - (eeVar.al << 16)) + 0;
                } else {
                    i7 = 0;
                }
                if (eeVar.aj > 0) {
                    i6 = (((eeVar.aj << 16) + i16) - 1) / i16;
                    i2 += i6;
                    i17 = ((i6 * i16) - (eeVar.aj << 16)) + 0;
                }
                i13 = i11 < i13 ? ((((i11 << 16) - i7) + i15) - 1) / i15 : i3;
                i6 = i12 < i14 ? ((((i12 << 16) - i17) + i16) - 1) / i16 : i4;
                i12 = ((this.aq * 1462922907) * i2) + i;
                i14 = (this.aq * 1462922907) - i13;
                int i18 = i2 + i6;
                if (i18 > this.aj * 157809585) {
                    i6 -= i18 - (this.aj * 157809585);
                }
                if (i2 < this.al * -709973917) {
                    i18 = (this.al * -709973917) - i2;
                    i8 = i6 - i18;
                    i17 += i18 * i16;
                    i12 = ((this.aq * 1462922907) * i18) + i12;
                } else {
                    i8 = i6;
                }
                i6 = i13 + i;
                if (i6 > this.ae * 428635993) {
                    i18 = i6 - (this.ae * 428635993);
                    i6 = i13 - i18;
                    i9 = i14 + i18;
                } else {
                    i6 = i13;
                    i9 = i14;
                }
                if (i < this.ai * 1947951707) {
                    i13 = (this.ai * 1947951707) - i;
                    i10 = i6 - i13;
                    i18 = i12 + i13;
                    i14 = i7 + (i15 * i13);
                    i9 += i13;
                } else {
                    i10 = i6;
                    i18 = i12;
                    i14 = i7;
                }
                hw.af(this.ad, eeVar.ad, 0, i14, i17, i18, i9, i10, i8, i15, i16, i11, 2131099657);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("eb.ah(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public final void ai(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z, int i8) {
        int i9 = i3 + i;
        if (i9 >= 0) {
            int i10 = i4 + i2;
            if (i10 >= 0) {
                try {
                    if (i < this.aq * 1462922907 && i2 < this.ar * -1622836677) {
                        int i11;
                        int i12 = 0;
                        if (i < 0) {
                            i11 = 0 - i;
                        } else {
                            i11 = 0;
                            i9 = i3;
                        }
                        if (i2 < 0) {
                            i12 = 0 - i2;
                            i4 = i10;
                        }
                        i10 = i + i9 > this.aq * 1462922907 ? (this.aq * 1462922907) - i : i9;
                        if (i4 + i2 > this.ar * -1622836677) {
                            i4 = (this.ar * -1622836677) - i2;
                        }
                        int length = bArr.length / i7;
                        int i13 = (this.aq * 1462922907) - i10;
                        int i14;
                        int i15;
                        int i16;
                        int i17;
                        if (!z || (255 == (i5 >>> 24) && 255 == (i6 >>> 24))) {
                            i14 = i2 + i12;
                            i12 = (((1462922907 * this.aq) * i14) + i) + i11;
                            for (i15 = i14; i15 < i14 + i4; i15++) {
                                i16 = i11 + i;
                                i9 = i16;
                                while (true) {
                                    i17 = i12;
                                    if (i9 >= i10 + i16) {
                                        break;
                                    }
                                    if (bArr[((i9 - i) % i7) + (((i15 - i2) % length) * i7)] != (byte) 0) {
                                        i12 = i17 + 1;
                                        this.ad[i17] = i6;
                                    } else {
                                        i12 = i17 + 1;
                                        this.ad[i17] = i5;
                                    }
                                    i9++;
                                }
                                i12 = i17 + i13;
                            }
                            return;
                        }
                        i14 = i12 + i2;
                        i12 = (((1462922907 * this.aq) * i14) + i) + i11;
                        for (i15 = i14; i15 < i4 + i14; i15++) {
                            i16 = i11 + i;
                            i17 = i12;
                            for (i9 = i16; i9 < i10 + i16; i9++) {
                                i12 = bArr[((i9 - i) % i7) + (((i15 - i2) % length) * i7)] != (byte) 0 ? i6 : i5;
                                int i18 = i12 >>> 24;
                                int i19 = 255 - i18;
                                int i20 = this.ad[i17];
                                this.ad[i17] = (((((i12 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i18) + (i19 * (i20 & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) & 16711680) + ((((16711935 & i12) * i18) + ((16711935 & i20) * i19)) & -16711936)) >> 8;
                                i17++;
                            }
                            i12 = i17 + i13;
                        }
                    }
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("eb.ai(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
        }
    }

    public final void aj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte b) {
        if (i3 > 0 && i4 > 0) {
            int i9 = 0;
            try {
                int i10;
                int i11 = 65536 / i4;
                if (i < this.ai * 1947951707) {
                    i10 = i3 - ((this.ai * 1947951707) - i);
                    i = this.ai * 1947951707;
                } else {
                    i10 = i3;
                }
                if (i2 < this.al * -709973917) {
                    i9 = (((this.al * -709973917) - i2) * i11) + 0;
                    i4 -= (this.al * -709973917) - i2;
                    i2 = this.al * -709973917;
                }
                if (i10 + i > this.ae * 428635993) {
                    i10 = (this.ae * 428635993) - i;
                }
                if (i2 + i4 > this.aj * 157809585) {
                    i4 = (this.aj * 157809585) - i2;
                }
                int i12 = this.aq;
                int i13 = ((this.aq * 1462922907) * i2) + i;
                int i14 = -i4;
                int i15 = i9;
                while (i14 < 0) {
                    i9 = (65536 - i15) >> 8;
                    int i16 = i15 >> 8;
                    int i17 = (((i9 * i7) + (i8 * i16)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
                    if (i17 == 0) {
                        i9 = this.aq * 1462922907;
                    } else {
                        i9 = ((((i9 * (16711935 & i5)) + (i16 * (16711935 & i6))) & -16711936) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i16) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i9)) & 16711680)) >>> 8;
                        int i18 = 255 - i17;
                        i17 = ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i17) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((i9 & 16711935) * i17) >> 8) & 16711935);
                        i16 = -i10;
                        while (i16 < 0) {
                            i9 = this.ad[i13];
                            if (i9 == 0) {
                                this.ad[i13] = i17;
                            } else {
                                this.ad[i13] = (((((i9 & 16711935) * i18) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i18) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + i17;
                            }
                            i16++;
                            i13++;
                        }
                        i9 = (1462922907 * i12) - i10;
                    }
                    i14++;
                    i15 += i11;
                    i13 += i9;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("eb.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public final void ak(int i, int i2, int i3, int i4, int i5) {
        try {
            if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
                if (i2 < this.al * -709973917) {
                    i3 -= (this.al * -709973917) - i2;
                    i2 = this.al * -709973917;
                }
                if (i3 + i2 > this.aj * 157809585) {
                    i3 = (this.aj * 157809585) - i2;
                }
                int i6 = this.aq;
                for (int i7 = 0; i7 < i3; i7++) {
                    this.ad[((this.aq * 1462922907) * i7) + (((i6 * 1462922907) * i2) + i)] = i4;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void al(int i, int i2, int i3, int i4, int i5, byte b) {
        try {
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * -709973917) {
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i + i3 > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            if (i4 + i2 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i6 = this.aq;
            int i7 = ((this.aq * 1462922907) * i2) + i;
            for (int i8 = -i4; i8 < 0; i8++) {
                int i9 = -i3;
                while (i9 < 0) {
                    this.ad[i7] = i5;
                    i9++;
                    i7++;
                }
                i7 += (i6 * 1462922907) - i3;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void am(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (i2 >= this.al * -709973917 && i2 < this.aj * 157809585) {
                if (i < this.ai * 1947951707) {
                    i3 -= (this.ai * 1947951707) - i;
                    i = this.ai * 1947951707;
                }
                if (i3 + i > this.ae * 428635993) {
                    i3 = (this.ae * 428635993) - i;
                }
                int i7 = 256 - i5;
                int i8 = i + ((this.aq * 1462922907) * i2);
                int i9 = 0;
                while (i9 < i3) {
                    int i10 = this.ad[i8];
                    i10 = (((((i10 >> 16) & 255) * i7) + (((i4 >> 16) & 255) * i5)) >> 8) << 16;
                    this.ad[i8] = (i10 + ((((((this.ad[i8] >> 8) & 255) * i7) + (((i4 >> 8) & 255) * i5)) >> 8) << 8)) + ((((this.ad[i8] & 255) * i7) + ((i4 & 255) * i5)) >> 8);
                    i9++;
                    i8++;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ap(int i, int i2, int i3, int i4, int i5) {
        if (i3 == 0) {
            try {
                ev(i, i2, i4, -191998547);
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("eb.ap(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        int i6;
        int i7;
        int i8;
        if (i3 < 0) {
            i3 = -i3;
        }
        int i9 = i2 - i3;
        if (i9 < this.al * -709973917) {
            i9 = this.al * -709973917;
        }
        int i10 = (i2 + i3) + 1;
        if (i10 > this.aj * 157809585) {
            i10 = this.aj * 157809585;
        }
        int i11 = i3 * i3;
        int i12 = 0;
        int i13 = i2 - i9;
        int i14 = i13 * i13;
        int i15 = i14 - i13;
        if (i2 > i10) {
            i6 = i13;
            i2 = i10;
            i7 = i9;
        } else {
            i6 = i13;
            i7 = i9;
        }
        while (i7 < i2) {
            i13 = i14;
            i8 = i15;
            while (true) {
                if (i8 > i11 && i13 > i11) {
                    break;
                }
                i15 = i12 + 1;
                i13 = (i12 + i12) + i13;
                i8 = (i12 + i15) + i8;
                i12 = i15;
            }
            i9 = (i - i12) + 1;
            if (i9 < this.ai * 1947951707) {
                i9 = this.ai * 1947951707;
            }
            i14 = i + i12;
            i15 = i14 > this.ae * 428635993 ? this.ae * 428635993 : i14;
            i14 = ((this.aq * 1462922907) * i7) + i9;
            while (i9 < i15) {
                this.ad[i14] = i4;
                i9++;
                i14++;
            }
            i7++;
            i9 = i6 - 1;
            i14 = i13 - (i6 + i9);
            i15 = i8 - (i9 + i9);
            i6 = i9;
        }
        i13 = i7 - i2;
        i9 = (i13 * i13) + i11;
        i14 = i9 - i3;
        i9 -= i13;
        i6 = i7;
        int i16 = i13;
        i15 = i3;
        while (i6 < i10) {
            i13 = i9;
            i8 = i14;
            i12 = i15;
            while (i13 > i11 && i8 > i11) {
                i15 = i12 - 1;
                i13 -= i12 + i15;
                i8 -= i15 + i15;
                i12 = i15;
            }
            i9 = i - i12;
            if (i9 < this.ai * 1947951707) {
                i9 = this.ai * 1947951707;
            }
            i14 = i + i12;
            i7 = i14 > (this.ae * 428635993) + -1 ? (this.ae * 428635993) - 1 : i14;
            i14 = ((this.aq * 1462922907) * i6) + i9;
            i15 = i9;
            while (i15 <= i7) {
                this.ad[i14] = i4;
                i15++;
                i14++;
            }
            i9 = (i16 + i16) + i13;
            i13 = i16 + 1;
            i14 = (i16 + i13) + i8;
            i6++;
            i16 = i13;
            i15 = i12;
        }
    }

    public void aq(int i) {
        try {
            int i2 = ((this.ar * -1622836677) * (this.aq * 1462922907)) - 7;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                this.ad[i3] = 0;
                int i5 = i4 + 1;
                this.ad[i4] = 0;
                i4 = i5 + 1;
                this.ad[i5] = 0;
                i5 = i4 + 1;
                this.ad[i4] = 0;
                i4 = i5 + 1;
                this.ad[i5] = 0;
                i5 = i4 + 1;
                this.ad[i4] = 0;
                i4 = i5 + 1;
                this.ad[i5] = 0;
                this.ad[i4] = 0;
                i3 = i4 + 1;
            }
            while (i3 < i2 + 7) {
                this.ad[i3] = 0;
                i3++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ar(int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        try {
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * -709973917) {
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i + i3 > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            if (i4 + i2 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i7 = 256 - i6;
            int i8 = this.aq;
            int i9 = i + ((this.aq * 1462922907) * i2);
            for (int i10 = 0; i10 < i4; i10++) {
                int i11 = -i3;
                while (i11 < 0) {
                    int i12 = this.ad[i9];
                    this.ad[i9] = (((((i12 & 16711935) * i7) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i12) * i7) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i6) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i5) * i6) >> 8) & 16711935));
                    i11++;
                    i9++;
                }
                i9 += (1462922907 * i8) - i3;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void as(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
                if (i2 < this.al * -709973917) {
                    i3 -= (this.al * -709973917) - i2;
                    i2 = this.al * -709973917;
                }
                if (i3 + i2 > this.aj * 157809585) {
                    i3 = (this.aj * 157809585) - i2;
                }
                int i7 = 256 - i5;
                int i8 = ((this.aq * 1462922907) * i2) + i;
                for (int i9 = 0; i9 < i3; i9++) {
                    int i10 = this.ad[i8];
                    int i11 = this.ad[i8];
                    i10 = ((((((i10 >> 16) & 255) * i7) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i11 >> 8) & 255) * i7) + (((i4 >> 8) & 255) * i5)) >> 8) << 8);
                    this.ad[i8] = i10 + ((((this.ad[i8] & 255) * i7) + ((i4 & 255) * i5)) >> 8);
                    i8 += this.aq * 1462922907;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void au(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 != 0) {
            if (i5 >= 255) {
                try {
                    ap(i, i2, i3, i4, -1952038969);
                    return;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("eb.au(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            int i7;
            int i8;
            int i9;
            int i10;
            if (i3 < 0) {
                i3 = -i3;
            }
            int i11 = 255 - i5;
            int i12 = ((i4 >> 16) & 255) * i5;
            int i13 = ((i4 >> 8) & 255) * i5;
            int i14 = (i4 & 255) * i5;
            int i15 = i2 - i3;
            if (i15 < this.al * -709973917) {
                i15 = this.al * -709973917;
            }
            int i16 = (i2 + i3) + 1;
            if (i16 > this.aj * 157809585) {
                i16 = this.aj * 157809585;
            }
            int i17 = i3 * i3;
            int i18 = 0;
            int i19 = i2 - i15;
            int i20 = i19 * i19;
            int i21 = i20 - i19;
            if (i2 > i16) {
                i7 = i19;
                i8 = i15;
                i9 = i3;
                i2 = i16;
                i10 = i16;
            } else {
                i7 = i19;
                i8 = i15;
                i9 = i3;
                i10 = i16;
            }
            while (i8 < i2) {
                i19 = i20;
                i16 = i21;
                while (true) {
                    if (i16 > i17 && i19 > i17) {
                        break;
                    }
                    i21 = i18 + 1;
                    i19 = (i18 + i18) + i19;
                    i16 = (i18 + i21) + i16;
                    i18 = i21;
                }
                i15 = (i - i18) + 1;
                if (i15 < this.ai * 1947951707) {
                    i15 = this.ai * 1947951707;
                }
                i20 = i18 + i;
                i21 = i20 > this.ae * 428635993 ? this.ae * 428635993 : i20;
                i20 = ((this.aq * 1462922907) * i8) + i15;
                while (i15 < i21) {
                    this.ad[i20] = (((((((this.ad[i20] >> 16) & 255) * i11) + i12) >> 8) << 16) + ((((((this.ad[i20] >> 8) & 255) * i11) + i13) >> 8) << 8)) + ((((this.ad[i20] & 255) * i11) + i14) >> 8);
                    i15++;
                    i20++;
                }
                i8++;
                i15 = i7 - 1;
                i20 = i19 - (i7 + i15);
                i21 = i16 - (i15 + i15);
                i7 = i15;
            }
            i21 = -i7;
            i15 = (i21 * i21) + i17;
            i20 = i15 - i9;
            i15 -= i21;
            i19 = i8;
            i16 = i21;
            i18 = i17;
            while (i19 < i10) {
                i8 = i15;
                i21 = i9;
                i17 = i20;
                while (i8 > i18 && i17 > i18) {
                    i9 = i21 - 1;
                    i8 -= i21 + i9;
                    i21 = i9;
                    i17 -= i9 + i9;
                }
                i15 = i - i21;
                if (i15 < this.ai * 1947951707) {
                    i15 = this.ai * 1947951707;
                }
                i9 = i21 + i;
                i20 = i9 > (this.ae * 428635993) + -1 ? (this.ae * 428635993) - 1 : i9;
                i9 = ((this.aq * 1462922907) * i19) + i15;
                while (i15 <= i20) {
                    this.ad[i9] = (((((((this.ad[i9] >> 16) & 255) * i11) + i12) >> 8) << 16) + ((((((this.ad[i9] >> 8) & 255) * i11) + i13) >> 8) << 8)) + ((((this.ad[i9] & 255) * i11) + i14) >> 8);
                    i15++;
                    i9++;
                }
                i19++;
                i15 = (i16 + i16) + i8;
                i8 = i16 + 1;
                i20 = i17 + (i16 + i8);
                i9 = i21;
                i16 = i8;
            }
        }
    }

    public final void aw(ee eeVar, int i, int i2, int i3) {
        try {
            int i4;
            int i5;
            int i6 = eeVar.al + i;
            int i7 = i2 + eeVar.aj;
            int i8 = ((this.aq * 1462922907) * i7) + i6;
            int i9 = eeVar.ar;
            int i10 = eeVar.aq;
            int i11 = (this.aq * 1462922907) - i10;
            int i12 = 0;
            if (i7 < this.al * -709973917) {
                i4 = (this.al * -709973917) - i7;
                i9 -= i4;
                i7 = -709973917 * this.al;
                i5 = (i10 * i4) + 0;
                i8 += i4 * (this.aq * 1462922907);
            } else {
                i5 = 0;
            }
            i7 += i9;
            i7 = i7 > this.aj * 157809585 ? i9 - (i7 - (this.aj * 157809585)) : i9;
            if (i6 < this.ai * 1947951707) {
                i9 = (this.ai * 1947951707) - i6;
                i10 -= i9;
                i6 = this.ai * 1947951707;
                i5 += i9;
                i8 += i9;
                i12 = i9 + 0;
                i9 = i11 + i9;
            } else {
                i9 = i11;
            }
            i6 += i10;
            if (i6 > this.ae * 428635993) {
                i6 -= this.ae * 428635993;
                i11 = i10 - i6;
                i4 = i12 + i6;
                i9 += i6;
            } else {
                i4 = i12;
                i11 = i10;
            }
            if (i11 > 0 && i7 > 0) {
                ak.ac(this.ad, eeVar.ad, 0, i5, i8, i11, i7, i9, i4, (byte) 7);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ay(ef efVar, int i, int i2, int i3, int i4, int i5) {
        try {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11 = efVar.ar;
            int i12 = efVar.al;
            int i13 = efVar.ae;
            int i14 = efVar.am;
            int i15 = (i13 << 16) / i3;
            int i16 = (i14 << 16) / i4;
            int i17 = 0;
            if (efVar.aj > 0) {
                i6 = (((efVar.aj << 16) + i15) - 1) / i15;
                i += i6;
                i7 = ((i6 * i15) - (efVar.aj << 16)) + 0;
            } else {
                i7 = 0;
            }
            if (efVar.ai > 0) {
                i6 = (((efVar.ai << 16) + i16) - 1) / i16;
                i2 += i6;
                i17 = ((i6 * i16) - (efVar.ai << 16)) + 0;
            }
            i13 = i11 < i13 ? ((((i11 << 16) - i7) + i15) - 1) / i15 : i3;
            i6 = i12 < i14 ? ((((i12 << 16) - i17) + i16) - 1) / i16 : i4;
            i12 = ((this.aq * 1462922907) * i2) + i;
            i14 = (this.aq * 1462922907) - i13;
            int i18 = i2 + i6;
            if (i18 > this.aj * 157809585) {
                i6 -= i18 - (this.aj * 157809585);
            }
            if (i2 < this.al * -709973917) {
                i18 = (this.al * -709973917) - i2;
                i8 = i6 - i18;
                i17 += i18 * i16;
                i12 = ((this.aq * 1462922907) * i18) + i12;
            } else {
                i8 = i6;
            }
            i6 = i13 + i;
            if (i6 > this.ae * 428635993) {
                i18 = i6 - (this.ae * 428635993);
                i6 = i13 - i18;
                i9 = i14 + i18;
            } else {
                i6 = i13;
                i9 = i14;
            }
            if (i < this.ai * 1947951707) {
                i13 = (this.ai * 1947951707) - i;
                i10 = i6 - i13;
                i18 = i12 + i13;
                i14 = i7 + (i13 * i15);
                i9 += i13;
            } else {
                i10 = i6;
                i18 = i12;
                i14 = i7;
            }
            jm.an(this.ad, efVar.ad, efVar.aq, i14, i17, i18, i9, i10, i8, i15, i16, i11, (byte) -114);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void az(ee eeVar, int i, int i2, int i3) {
        try {
            int i4;
            int i5;
            int i6 = eeVar.al + i;
            int i7 = i2 + eeVar.aj;
            int i8 = ((this.aq * 1462922907) * i7) + i6;
            int i9 = eeVar.ar;
            int i10 = eeVar.aq;
            int i11 = (this.aq * 1462922907) - i10;
            if (i7 < this.al * -709973917) {
                int i12 = (this.al * -709973917) - i7;
                i9 -= i12;
                i7 = -709973917 * this.al;
                i4 = (i12 * i10) + 0;
                i8 += i12 * (this.aq * 1462922907);
            } else {
                i4 = 0;
            }
            i7 += i9;
            i7 = i7 > this.aj * 157809585 ? i9 - (i7 - (this.aj * 157809585)) : i9;
            if (i6 < this.ai * 1947951707) {
                i9 = (this.ai * 1947951707) - i6;
                i10 -= i9;
                i6 = this.ai * 1947951707;
                i4 += i9;
                i8 += i9;
                i11 += i9;
                i9 += 0;
            } else {
                i9 = 0;
            }
            i6 += i10;
            if (i6 > this.ae * 428635993) {
                i6 -= this.ae * 428635993;
                i5 = i10 - i6;
                i9 += i6;
                i11 += i6;
            } else {
                i5 = i10;
            }
            if (i5 > 0 && i7 > 0) {
                bn.ax(this.ad, eeVar.ad, i4, i8, i5, i7, i11, i9, -1801492098);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bb(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        if (i6 != 0) {
            try {
                int i7 = i - (eeVar.al << 4);
                int i8 = i2 - (eeVar.aj << 4);
                double d = ((double) (SupportMenu.USER_MASK & i5)) * 9.587379924285257E-5d;
                double d2 = (double) i6;
                int floor = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
                int floor2 = (int) Math.floor((Math.cos(d) * d2) + 0.5d);
                int i9 = -i8;
                int i10 = floor * i9;
                int i11 = -i7;
                int i12 = i11 * floor2;
                int i13 = i10 + i12;
                i9 *= floor2;
                int i14 = (-i11) * floor;
                int i15 = i9 + i14;
                int i16 = (((eeVar.aq << 4) - i7) * floor2) + i10;
                int i17 = i9 + ((-((eeVar.aq << 4) - i7)) * floor);
                i11 = i12 + (((eeVar.ar << 4) - i8) * floor);
                i9 = (((eeVar.ar << 4) - i8) * floor2) + i14;
                i10 = (((eeVar.aq << 4) - i7) * floor2) + (((eeVar.ar << 4) - i8) * floor);
                floor = (floor * (-((eeVar.aq << 4) - i7))) + (floor2 * ((eeVar.ar << 4) - i8));
                if (i13 < i16) {
                    i12 = i13;
                    floor2 = i16;
                } else {
                    i12 = i16;
                    floor2 = i13;
                }
                if (i11 < i12) {
                    i12 = i11;
                }
                if (i10 < i12) {
                    i12 = i10;
                }
                if (i11 <= floor2) {
                    i11 = floor2;
                }
                floor2 = i10 > i11 ? i10 : i11;
                if (i15 < i17) {
                    i11 = i15;
                    i10 = i17;
                } else {
                    i11 = i17;
                    i10 = i15;
                }
                if (i9 < i11) {
                    i11 = i9;
                }
                if (floor < i11) {
                    i11 = floor;
                }
                if (i9 <= i10) {
                    i9 = i10;
                }
                if (floor <= i9) {
                    floor = i9;
                }
                i9 = ((i12 >> 12) + i3) >> 4;
                i10 = ((((floor2 + 4095) >> 12) + i3) + 15) >> 4;
                i11 = ((i11 >> 12) + i4) >> 4;
                i15 = ((((floor + 4095) >> 12) + i4) + 15) >> 4;
                floor = i9 < this.ai * 1947951707 ? this.ai * 1947951707 : i9;
                i9 = i10 > this.ae * 428635993 ? this.ae * 428635993 : i10;
                i10 = i11 < this.al * -709973917 ? this.al * -709973917 : i11;
                i11 = i15 > this.aj * 157809585 ? this.aj * 157809585 : i15;
                floor2 = floor - i9;
                if (floor2 < 0) {
                    i9 = i10 - i11;
                    if (i9 < 0) {
                        i12 = ((this.aq * 1462922907) * i10) + floor;
                        double d3 = 1.6777216E7d / d2;
                        int floor3 = (int) Math.floor((Math.sin(d) * d3) + 0.5d);
                        int floor4 = (int) Math.floor((d3 * Math.cos(d)) + 0.5d);
                        i14 = ((floor << 4) + 8) - i3;
                        floor = ((i10 << 4) + 8) - i4;
                        i10 = (i7 << 8) - ((floor3 * floor) >> 4);
                        i11 = (i8 << 8) + ((floor * floor4) >> 4);
                        if (floor4 == 0) {
                            if (floor3 == 0) {
                                i15 = i12;
                                for (i17 = i9; i17 < 0; i17++) {
                                    if (i10 >= 0 && i11 >= 0 && i10 - (eeVar.aq << 12) < 0 && i11 - (eeVar.ar << 12) < 0) {
                                        floor = i15;
                                        for (i9 = floor2; i9 < 0; i9++) {
                                            i12 = eeVar.ad[(eeVar.aq * (i11 >> 12)) + (i10 >> 12)];
                                            if (i12 != 0) {
                                                this.ad[floor] = i12;
                                            }
                                            floor++;
                                        }
                                    }
                                    i15 += this.aq * 1462922907;
                                }
                            } else if (floor3 < 0) {
                                i13 = i9;
                                i16 = i10;
                                i17 = i12;
                                while (i13 < 0) {
                                    i9 = ((floor3 * i14) >> 4) + i11;
                                    if (i16 >= 0) {
                                        if (i16 - (eeVar.aq << 12) < 0) {
                                            floor = i9 - (eeVar.ar << 12);
                                            if (floor >= 0) {
                                                floor = (floor3 - floor) / floor3;
                                                i15 = floor2 + floor;
                                                i9 += floor3 * floor;
                                                floor += i17;
                                            } else {
                                                i15 = floor2;
                                                floor = i17;
                                            }
                                            i10 = (i9 - floor3) / floor3;
                                            if (i10 <= i15) {
                                                i10 = i15;
                                            }
                                            while (i10 < 0) {
                                                i15 = eeVar.ad[(i16 >> 12) + (eeVar.aq * (i9 >> 12))];
                                                if (i15 != 0) {
                                                    this.ad[floor] = i15;
                                                }
                                                floor++;
                                                i9 += floor3;
                                                i10++;
                                            }
                                        }
                                    }
                                    i17 += this.aq * 1462922907;
                                    i13++;
                                    i16 -= floor3;
                                }
                            } else {
                                i13 = i9;
                                i16 = i10;
                                i17 = i12;
                                while (i13 < 0) {
                                    i9 = ((i14 * floor3) >> 4) + i11;
                                    if (i16 >= 0) {
                                        if (i16 - (eeVar.aq << 12) < 0) {
                                            if (i9 < 0) {
                                                floor = ((floor3 - 1) - i9) / floor3;
                                                i15 = floor2 + floor;
                                                i9 += floor3 * floor;
                                                floor += i17;
                                            } else {
                                                i15 = floor2;
                                                floor = i17;
                                            }
                                            i10 = (((i9 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                            if (i10 <= i15) {
                                                i10 = i15;
                                            }
                                            while (i10 < 0) {
                                                i15 = eeVar.ad[(i16 >> 12) + (eeVar.aq * (i9 >> 12))];
                                                if (i15 != 0) {
                                                    this.ad[floor] = i15;
                                                }
                                                floor++;
                                                i9 += floor3;
                                                i10++;
                                            }
                                        }
                                    }
                                    i17 += this.aq * 1462922907;
                                    i13++;
                                    i16 -= floor3;
                                }
                            }
                        } else if (floor4 < 0) {
                            if (floor3 == 0) {
                                i13 = i9;
                                i16 = i11;
                                i17 = i12;
                                while (i13 < 0) {
                                    i9 = ((floor4 * i14) >> 4) + i10;
                                    if (i16 >= 0) {
                                        if (i16 - (eeVar.ar << 12) < 0) {
                                            floor = i9 - (eeVar.aq << 12);
                                            if (floor >= 0) {
                                                floor = (floor4 - floor) / floor4;
                                                i15 = floor2 + floor;
                                                i9 += floor * floor4;
                                                floor += i17;
                                            } else {
                                                i15 = floor2;
                                                floor = i17;
                                            }
                                            i11 = (i9 - floor4) / floor4;
                                            if (i11 <= i15) {
                                                i11 = i15;
                                            }
                                            while (i11 < 0) {
                                                i15 = eeVar.ad[(i9 >> 12) + (eeVar.aq * (i16 >> 12))];
                                                if (i15 != 0) {
                                                    this.ad[floor] = i15;
                                                }
                                                floor++;
                                                i9 += floor4;
                                                i11++;
                                            }
                                        }
                                    }
                                    i17 += this.aq * 1462922907;
                                    i13++;
                                    i16 += floor4;
                                }
                            } else if (floor3 < 0) {
                                i13 = i9;
                                i16 = i10;
                                i7 = i11;
                                while (i13 < 0) {
                                    i10 = ((i14 * floor4) >> 4) + i16;
                                    floor = ((i14 * floor3) >> 4) + i7;
                                    i9 = i10 - (eeVar.aq << 12);
                                    if (i9 >= 0) {
                                        i11 = (floor4 - i9) / floor4;
                                        i9 = floor2 + i11;
                                        i10 += floor4 * i11;
                                        floor += i11 * floor3;
                                        i11 += i12;
                                    } else {
                                        i9 = floor2;
                                        i11 = i12;
                                    }
                                    i17 = (i10 - floor4) / floor4;
                                    if (i17 <= i9) {
                                        i17 = i9;
                                    }
                                    i9 = floor - (eeVar.ar << 12);
                                    if (i9 >= 0) {
                                        i9 = (floor3 - i9) / floor3;
                                        i17 += i9;
                                        i10 += floor4 * i9;
                                        floor += floor3 * i9;
                                        i11 += i9;
                                    }
                                    i15 = (floor - floor3) / floor3;
                                    if (i15 > i17) {
                                        i9 = floor;
                                    } else {
                                        i9 = floor;
                                        i15 = i17;
                                    }
                                    while (i15 < 0) {
                                        floor = eeVar.ad[(i10 >> 12) + ((i9 >> 12) * eeVar.aq)];
                                        if (floor != 0) {
                                            this.ad[i11] = floor;
                                        }
                                        i10 += floor4;
                                        i9 += floor3;
                                        i15++;
                                        i11++;
                                    }
                                    i12 += this.aq * 1462922907;
                                    i13++;
                                    i16 -= floor3;
                                    i7 += floor4;
                                }
                            } else {
                                i13 = i9;
                                i16 = i10;
                                i7 = i11;
                                while (i13 < 0) {
                                    i10 = ((floor4 * i14) >> 4) + i16;
                                    floor = ((floor3 * i14) >> 4) + i7;
                                    i9 = i10 - (eeVar.aq << 12);
                                    if (i9 >= 0) {
                                        i11 = (floor4 - i9) / floor4;
                                        i9 = floor2 + i11;
                                        i10 += floor4 * i11;
                                        floor += floor3 * i11;
                                        i11 += i12;
                                    } else {
                                        i9 = floor2;
                                        i11 = i12;
                                    }
                                    i17 = (i10 - floor4) / floor4;
                                    if (i17 <= i9) {
                                        i17 = i9;
                                    }
                                    if (floor < 0) {
                                        i9 = ((floor3 - 1) - floor) / floor3;
                                        i17 += i9;
                                        i10 += floor4 * i9;
                                        floor += floor3 * i9;
                                        i11 += i9;
                                    }
                                    i15 = (((floor + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                    if (i15 > i17) {
                                        i9 = floor;
                                    } else {
                                        i9 = floor;
                                        i15 = i17;
                                    }
                                    while (i15 < 0) {
                                        floor = eeVar.ad[(i10 >> 12) + ((i9 >> 12) * eeVar.aq)];
                                        if (floor != 0) {
                                            this.ad[i11] = floor;
                                        }
                                        i10 += floor4;
                                        i9 += floor3;
                                        i15++;
                                        i11++;
                                    }
                                    i12 += this.aq * 1462922907;
                                    i13++;
                                    i16 -= floor3;
                                    i7 += floor4;
                                }
                            }
                        } else if (floor3 == 0) {
                            i13 = i9;
                            i16 = i11;
                            i17 = i12;
                            while (i13 < 0) {
                                i9 = ((floor4 * i14) >> 4) + i10;
                                if (i16 >= 0) {
                                    if (i16 - (eeVar.ar << 12) < 0) {
                                        if (i9 < 0) {
                                            floor = ((floor4 - 1) - i9) / floor4;
                                            i15 = floor2 + floor;
                                            i9 += floor4 * floor;
                                            floor += i17;
                                        } else {
                                            i15 = floor2;
                                            floor = i17;
                                        }
                                        i11 = (((i9 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                                        if (i11 <= i15) {
                                            i11 = i15;
                                        }
                                        while (i11 < 0) {
                                            i15 = eeVar.ad[((i16 >> 12) * eeVar.aq) + (i9 >> 12)];
                                            if (i15 != 0) {
                                                this.ad[floor] = i15;
                                            }
                                            floor++;
                                            i9 += floor4;
                                            i11++;
                                        }
                                    }
                                }
                                i17 += this.aq * 1462922907;
                                i13++;
                                i16 += floor4;
                            }
                        } else if (floor3 < 0) {
                            i13 = i9;
                            i16 = i10;
                            i7 = i11;
                            i17 = i14;
                            while (i13 < 0) {
                                i10 = ((floor4 * i17) >> 4) + i16;
                                i9 = ((floor3 * i17) >> 4) + i7;
                                if (i10 < 0) {
                                    floor = ((floor4 - 1) - i10) / floor4;
                                    i11 = floor2 + floor;
                                    i10 += floor * floor4;
                                    i9 += floor * floor3;
                                    floor += i12;
                                } else {
                                    i11 = floor2;
                                    floor = i12;
                                }
                                i15 = (((i10 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                                if (i15 <= i11) {
                                    i15 = i11;
                                }
                                i11 = i9 - (eeVar.ar << 12);
                                if (i11 >= 0) {
                                    i11 = (floor3 - i11) / floor3;
                                    i15 += i11;
                                    i10 += floor4 * i11;
                                    i9 += i11 * floor3;
                                    floor += i11;
                                }
                                i11 = (i9 - floor3) / floor3;
                                if (i11 <= i15) {
                                    i11 = i15;
                                }
                                while (i11 < 0) {
                                    i15 = eeVar.ad[(i10 >> 12) + ((i9 >> 12) * eeVar.aq)];
                                    if (i15 != 0) {
                                        this.ad[floor] = i15;
                                    }
                                    floor++;
                                    i10 += floor4;
                                    i9 += floor3;
                                    i11++;
                                }
                                i12 += this.aq * 1462922907;
                                i13++;
                                i16 -= floor3;
                                i7 += floor4;
                            }
                        } else {
                            i13 = i9;
                            i16 = i10;
                            i7 = i11;
                            while (i13 < 0) {
                                i10 = ((floor4 * i14) >> 4) + i16;
                                floor = ((floor3 * i14) >> 4) + i7;
                                if (i10 < 0) {
                                    i11 = ((floor4 - 1) - i10) / floor4;
                                    i9 = floor2 + i11;
                                    i10 += i11 * floor4;
                                    floor += floor3 * i11;
                                    i11 += i12;
                                } else {
                                    i9 = floor2;
                                    i11 = i12;
                                }
                                i17 = (((i10 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                                if (i17 <= i9) {
                                    i17 = i9;
                                }
                                if (floor < 0) {
                                    i9 = ((floor3 - 1) - floor) / floor3;
                                    i17 += i9;
                                    i10 += floor4 * i9;
                                    floor += i9 * floor3;
                                    i11 += i9;
                                }
                                i15 = (((floor + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                if (i15 > i17) {
                                    i9 = floor;
                                } else {
                                    i9 = floor;
                                    i15 = i17;
                                }
                                while (i15 < 0) {
                                    floor = eeVar.ad[((i9 >> 12) * eeVar.aq) + (i10 >> 12)];
                                    if (floor != 0) {
                                        this.ad[i11] = floor;
                                    }
                                    i10 += floor4;
                                    i9 += floor3;
                                    i15++;
                                    i11++;
                                }
                                i12 += this.aq * 1462922907;
                                i13++;
                                i16 -= floor3;
                                i7 += floor4;
                            }
                        }
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("eb.bb(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bc() {
        aq(-1318480327);
    }

    public final void be(int i, int i2, int i3, int i4, int i5) {
        if (i < this.ai * 1947951707) {
            i3 -= (this.ai * -1299438012) - i;
            i = this.ai * 2115831128;
        }
        if (i2 < this.al * -1074805024) {
            i4 -= (this.al * 1299082995) - i2;
            i2 = this.al * -4244952;
        }
        if (i + i3 > this.ae * 428635993) {
            i3 = (this.ae * -357305761) - i;
        }
        if (i4 + i2 > this.aj * -977599457) {
            i4 = (this.aj * 157809585) - i2;
        }
        int i6 = this.aq;
        int i7 = ((this.aq * -869224107) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                this.ad[i7] = i5;
                i9++;
                i7++;
            }
            i7 += (1749600904 * i6) - i3;
        }
    }

    public void bf(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8) {
        int i9 = -i3;
        try {
            int i10 = i9 / 2;
            int i11 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i12 = ((i11 * sin) + (i10 * cos)) + (i5 << 16);
            int i13 = (i6 << 16) + ((i11 * cos) - (i10 * sin));
            int i14 = ((this.aq * 1462922907) * i2) + i;
            i10 = 0;
            while (true) {
                int i15 = i10;
                if (i15 < i4) {
                    i11 = i13;
                    int i16 = i12;
                    i10 = i14;
                    for (int i17 = i9; i17 < 0; i17++) {
                        int i18 = eeVar.ad[(i16 >> 16) + (eeVar.aq * (i11 >> 16))];
                        if (i18 != 0) {
                            this.ad[i10] = i18;
                        }
                        i10++;
                        i16 += cos;
                        i11 -= sin;
                    }
                    i12 += sin;
                    i13 += cos;
                    i14 += this.aq * 1462922907;
                    i10 = i15 + 1;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.bf(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public void bg() {
        int i = ((this.ar * -1622836677) * (this.aq * 1462922907)) - 7;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            this.ad[i2] = 0;
            int i4 = i3 + 1;
            this.ad[i3] = 0;
            i3 = i4 + 1;
            this.ad[i4] = 0;
            i4 = i3 + 1;
            this.ad[i3] = 0;
            i3 = i4 + 1;
            this.ad[i4] = 0;
            i4 = i3 + 1;
            this.ad[i3] = 0;
            i3 = i4 + 1;
            this.ad[i4] = 0;
            this.ad[i3] = 0;
            i2 = i3 + 1;
        }
        while (i2 < i + 7) {
            this.ad[i2] = 0;
            i2++;
        }
    }

    public final void bh(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9 = 0;
            int i10 = 65536 / i4;
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * -709973917) {
                i9 = (((this.al * -709973917) - i2) * i10) + 0;
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i11 = this.aq;
            int i12 = ((this.aq * 1462922907) * i2) + i;
            int i13 = -i4;
            int i14 = i9;
            while (i13 < 0) {
                i9 = (65536 - i14) >> 8;
                int i15 = i14 >> 8;
                int i16 = (((i9 * i7) + (i8 * i15)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
                if (i16 == 0) {
                    i9 = this.aq * 1462922907;
                } else {
                    i9 = ((((i9 * (16711935 & i5)) + (i15 * (16711935 & i6))) & -16711936) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i15) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i9)) & 16711680)) >>> 8;
                    int i17 = 255 - i16;
                    i16 = ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i16) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((i9 & 16711935) * i16) >> 8) & 16711935);
                    i15 = -i3;
                    while (i15 < 0) {
                        i9 = this.ad[i12];
                        if (i9 == 0) {
                            this.ad[i12] = i16;
                        } else {
                            this.ad[i12] = (((((i9 & 16711935) * i17) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i17) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + i16;
                        }
                        i15++;
                        i12++;
                    }
                    i9 = (1462922907 * i11) - i3;
                }
                i13++;
                i14 += i10;
                i12 += i9;
            }
        }
    }

    public void bi(ee eeVar, int i, int i2, int i3, int i4, byte b) {
        try {
            if (i3 > eeVar.ai || i4 > eeVar.ae) {
                throw new IllegalArgumentException();
            }
            int i5 = ((eeVar.al * i3) / eeVar.ai) + i;
            int i6 = (((eeVar.ai + ((eeVar.aq + eeVar.al) * i3)) - 1) / eeVar.ai) + i;
            int i7 = ((eeVar.aj * i4) / eeVar.ae) + i2;
            int i8 = (((eeVar.ae + ((eeVar.ar + eeVar.aj) * i4)) - 1) / eeVar.ae) + i2;
            if (i5 < this.ai * 1947951707) {
                i5 = this.ai * 1947951707;
            }
            if (i6 > this.ae * 428635993) {
                i6 = this.ae * 428635993;
            }
            if (i7 < this.al * -709973917) {
                i7 = this.al * -709973917;
            }
            int i9 = i8 > this.aj * 157809585 ? this.aj * 157809585 : i8;
            if (i5 < i6 && i7 < i9) {
                int i10 = ((this.aq * 1462922907) * i7) + i5;
                int i11 = this.aq;
                if (i10 < this.ad.length) {
                    while (true) {
                        int i12 = i7;
                        if (i12 < i9) {
                            for (int i13 = i5; i13 < i6; i13++) {
                                i8 = (i13 - i) << 4;
                                int i14 = (i12 - i2) << 4;
                                i7 = ((eeVar.ai * i8) / i3) - (eeVar.al << 4);
                                int i15 = (((i8 + 16) * eeVar.ai) / i3) - (eeVar.al << 4);
                                i8 = ((eeVar.ae * i14) / i4) - (eeVar.aj << 4);
                                i14 = (((i14 + 16) * eeVar.ae) / i4) - (eeVar.aj << 4);
                                int i16 = ((i15 - i7) * (i14 - i8)) >> 1;
                                if (i16 == 0) {
                                    i7 = i10;
                                } else {
                                    int i17 = 0;
                                    if (i7 < 0) {
                                        i7 = 0;
                                    }
                                    if (i15 >= (eeVar.aq << 4)) {
                                        i15 = eeVar.aq << 4;
                                    }
                                    if (i8 < 0) {
                                        i8 = 0;
                                    }
                                    if (i14 >= (eeVar.ar << 4)) {
                                        i14 = eeVar.ar << 4;
                                    }
                                    int i18 = i15 - 1;
                                    int i19 = i14 - 1;
                                    int i20 = i7 >> 4;
                                    int i21 = i18 >> 4;
                                    int i22 = i8 >> 4;
                                    int i23 = i19 >> 4;
                                    int i24 = 0;
                                    int i25 = 0;
                                    int i26 = 0;
                                    int i27 = i22;
                                    while (i27 <= i23) {
                                        i14 = i27 == i22 ? 16 - (i8 & 15) : 16;
                                        if (i23 == i27) {
                                            i14 = (i19 & 15) + 1;
                                        }
                                        int i28 = i20;
                                        while (i28 <= i21) {
                                            int i29 = eeVar.ad[(eeVar.aq * i27) + i28];
                                            if (i29 != 0) {
                                                i15 = i20 == i28 ? (16 - (i7 & 15)) * i14 : i21 == i28 ? ((i18 & 15) + 1) * i14 : i14 << 4;
                                                i24 += i15;
                                                i25 += ((i29 >> 16) & 255) * i15;
                                                i17 += ((i29 >> 8) & 255) * i15;
                                                i26 += i15 * (i29 & 255);
                                            }
                                            i28++;
                                            i24 = i24;
                                        }
                                        i27++;
                                    }
                                    if (i24 >= i16) {
                                        i7 = (((i17 / i24) << 8) + ((i25 / i24) << 16)) + (i26 / i24);
                                        if (i7 == 0) {
                                            i7 = 1;
                                        }
                                        this.ad[i10] = i7;
                                    }
                                    i7 = i10 + 1;
                                }
                                i10 = i7;
                            }
                            i10 += (1462922907 * i11) - (i6 - i5);
                            i7 = i12 + 1;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void bj(int i, int i2, int i3, int i4, int i5) {
        if (i < this.ai * 1947951707) {
            i3 -= (this.ai * 1947951707) - i;
            i = this.ai * 1947951707;
        }
        if (i2 < this.al * -709973917) {
            i4 -= (this.al * -709973917) - i2;
            i2 = this.al * -709973917;
        }
        if (i + i3 > this.ae * 428635993) {
            i3 = (this.ae * 428635993) - i;
        }
        if (i4 + i2 > this.aj * 157809585) {
            i4 = (this.aj * 157809585) - i2;
        }
        int i6 = this.aq;
        int i7 = ((this.aq * 1462922907) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                this.ad[i7] = i5;
                i9++;
                i7++;
            }
            i7 += (i6 * 1462922907) - i3;
        }
    }

    public void bk(ee eeVar, int i, int i2, int i3, int i4, byte b) {
        if (i3 == 256) {
            try {
                aw(eeVar, i, i2, 16711935);
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("eb.bk(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        int i5;
        int i6;
        int i7 = eeVar.al + i;
        int i8 = i2 + eeVar.aj;
        int i9 = ((this.aq * 1462922907) * i8) + i7;
        int i10 = eeVar.ar;
        int i11 = eeVar.aq;
        int i12 = (this.aq * 1462922907) - i11;
        int i13 = 0;
        if (i8 < this.al * -709973917) {
            i5 = (this.al * -709973917) - i8;
            i10 -= i5;
            i8 = -709973917 * this.al;
            i6 = (i11 * i5) + 0;
            i9 += i5 * (this.aq * 1462922907);
        } else {
            i6 = 0;
        }
        i8 += i10;
        i8 = i8 > this.aj * 157809585 ? i10 - (i8 - (this.aj * 157809585)) : i10;
        if (i7 < this.ai * 1947951707) {
            i10 = (this.ai * 1947951707) - i7;
            i11 -= i10;
            i7 = this.ai * 1947951707;
            i6 += i10;
            i9 += i10;
            i13 = i10 + 0;
            i10 = i12 + i10;
        } else {
            i10 = i12;
        }
        i7 += i11;
        if (i7 > this.ae * 428635993) {
            i7 -= this.ae * 428635993;
            i12 = i11 - i7;
            i5 = i13 + i7;
            i10 += i7;
        } else {
            i5 = i13;
            i12 = i11;
        }
        if (i12 > 0 && i8 > 0) {
            fg.ba(this.ad, eeVar.ad, 0, i6, i9, i12, i8, i10, i5, i3, i4, 1768473139);
        }
    }

    public void bl(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        try {
            int i10 = (-i3) / 2;
            int i11 = (-i4) / 2;
            double d = ((double) i7) / 326.11d;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i8) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i8) >> 8;
            int i12 = (i5 << 16) + ((i10 * cos) + (sin * i11));
            i11 = (i6 << 16) + ((i11 * cos) - (i10 * sin));
            int i13 = i + ((this.aq * 1462922907) * i2);
            i10 = 0;
            while (true) {
                int i14 = i12;
                int i15 = i10;
                int i16 = i11;
                int i17 = i13;
                if (i15 < i4) {
                    i12 = iArr[i15];
                    i11 = i12 + i17;
                    i10 = (i12 * cos) + i14;
                    i13 = i16 - (i12 * sin);
                    i12 = -iArr2[i15];
                    while (i12 < 0) {
                        this.ad[i11] = eeVar.ad[((i13 >> 16) * eeVar.aq) + (i10 >> 16)];
                        i10 += cos;
                        i13 -= sin;
                        i12++;
                        i11++;
                    }
                    i12 = i14 + sin;
                    i11 = i16 + cos;
                    i13 = i17 + (this.aq * 1462922907);
                    i10 = i15 + 1;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.bl(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public final void bn(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9 = 0;
            int i10 = 1138528854 / i4;
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 974973047) - i;
                i = this.ai * 1604542131;
            }
            if (i2 < this.al * -709973917) {
                i9 = (((this.al * -709973917) - i2) * i10) + 0;
                i4 -= (this.al * 460482839) - i2;
                i2 = 1280866752 * this.al;
            }
            if (i3 + i > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * 1430812715) - i2;
            }
            int i11 = this.aq;
            int i12 = ((this.aq * 151292502) * i2) + i;
            int i13 = -i4;
            int i14 = i9;
            while (i13 < 0) {
                i9 = (-334118289 - i14) >> 8;
                int i15 = i14 >> 8;
                int i16 = (((i9 * i7) + (i8 * i15)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
                if (i16 == 0) {
                    i9 = this.aq * 723046969;
                } else {
                    i9 = ((((i9 * (-764615041 & i5)) + (i15 * (-1512439291 & i6))) & -16711936) + ((((-1462153902 & i6) * i15) + ((-337095511 & i5) * i9)) & 16711680)) >>> 8;
                    int i17 = -1517301232 - i16;
                    i16 = ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i16) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((i9 & 16711935) * i16) >> 8) & 892594601);
                    i15 = -i3;
                    while (i15 < 0) {
                        i9 = this.ad[i12];
                        if (i9 == 0) {
                            this.ad[i12] = i16;
                        } else {
                            this.ad[i12] = (((((i9 & 515335805) * i17) >> 8) & 16711935) + ((((598480639 & i9) * i17) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + i16;
                        }
                        i15++;
                        i12++;
                    }
                    i9 = (1462922907 * i11) - i3;
                }
                i13++;
                i14 += i10;
                i12 += i9;
            }
        }
    }

    public void bo(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, int i7) {
        int i8 = 0;
        int i9 = i2 < 0 ? -i2 : 0;
        try {
            int i10;
            int i11 = eeVar.ar + i2 <= i6 ? eeVar.ar : i6 - i2;
            if (i < 0) {
                i8 = -i;
            }
            if (eeVar.aq + i <= i5) {
                i10 = eeVar.aq;
            }
            int i12 = ((i + i3) + i8) + (((i2 + i4) + i9) * (this.aq * 1462922907));
            int i13 = i9;
            int i14 = i2 + i9;
            while (i13 < i11) {
                int i15;
                i10 = iArr[i14];
                int i16 = iArr2[i14];
                if (i < i10) {
                    i9 = i10 - i;
                    i15 = (i9 - i8) + i12;
                } else {
                    i15 = i12;
                    i9 = i8;
                }
                i10 += i16;
                if (eeVar.aq + i <= i10) {
                    i16 = eeVar.aq;
                    i10 = i9;
                } else {
                    i16 = i10 - i;
                    i10 = i9;
                }
                while (i10 < i16) {
                    i9 = eeVar.ad[(eeVar.aq * i13) + i10];
                    if (i9 != 0) {
                        this.ad[i15] = i9;
                    }
                    i10++;
                    i15++;
                }
                i12 += this.aq * 1462922907;
                i13++;
                i14++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void bp(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        int i8 = i3 + i;
        if (i8 >= 0) {
            int i9 = i4 + i2;
            if (i9 >= 0 && i < this.aq * -334560663 && i2 < this.ar * -1300538471) {
                int i10;
                int i11 = 0;
                if (i < 0) {
                    i10 = 0 - i;
                } else {
                    i8 = i3;
                    i10 = 0;
                }
                if (i2 < 0) {
                    i11 = 0 - i2;
                    i4 = i9;
                }
                i9 = i + i8 > this.aq * 1462922907 ? (this.aq * 1462922907) - i : i8;
                if (i4 + i2 > this.ar * -1622836677) {
                    i4 = (this.ar * -171772843) - i2;
                }
                int length = bArr.length / i7;
                int i12 = (this.aq * -491445416) - i9;
                int i13;
                int i14;
                int i15;
                int i16;
                if (!z || (-2036923552 == (i5 >>> 24) && -962824437 == (i6 >>> 24))) {
                    i13 = i11 + i2;
                    i11 = (((1462922907 * this.aq) * i13) + i) + i10;
                    for (i14 = i13; i14 < i13 + i4; i14++) {
                        i15 = i10 + i;
                        i8 = i15;
                        while (true) {
                            i16 = i11;
                            if (i8 >= i9 + i15) {
                                break;
                            }
                            if (bArr[((i8 - i) % i7) + (((i14 - i2) % length) * i7)] != (byte) 0) {
                                i11 = i16 + 1;
                                this.ad[i16] = i6;
                            } else {
                                i11 = i16 + 1;
                                this.ad[i16] = i5;
                            }
                            i8++;
                        }
                        i11 = i16 + i12;
                    }
                    return;
                }
                i13 = i11 + i2;
                i11 = (((2081768886 * this.aq) * i13) + i) + i10;
                for (i14 = i13; i14 < i4 + i13; i14++) {
                    i15 = i10 + i;
                    i16 = i11;
                    for (i8 = i15; i8 < i9 + i15; i8++) {
                        i11 = bArr[((i8 - i) % i7) + (((i14 - i2) % length) * i7)] != (byte) 0 ? i6 : i5;
                        int i17 = i11 >>> 24;
                        int i18 = -1201750231 - i17;
                        int i19 = this.ad[i16];
                        this.ad[i16] = (((((i11 & 1887026056) * i17) + (i18 * (i19 & -122980836))) & 1843811447) + ((((16711935 & i11) * i17) + ((-66013689 & i19) * i18)) & -16711936)) >> 8;
                        i16++;
                    }
                    i11 = i16 + i12;
                }
            }
        }
    }

    public void bq(ee eeVar, int i, int i2, int i3, int i4, int i5, byte b) {
        if (i3 > 0 && i4 > 0) {
            try {
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11 = eeVar.aq;
                int i12 = eeVar.ar;
                int i13 = eeVar.ai;
                int i14 = eeVar.ae;
                int i15 = (i13 << 16) / i3;
                int i16 = (i14 << 16) / i4;
                int i17 = 0;
                if (eeVar.al > 0) {
                    i6 = (((eeVar.al << 16) + i15) - 1) / i15;
                    i += i6;
                    i7 = ((i6 * i15) - (eeVar.al << 16)) + 0;
                } else {
                    i7 = 0;
                }
                if (eeVar.aj > 0) {
                    i6 = (((eeVar.aj << 16) + i16) - 1) / i16;
                    i2 += i6;
                    i17 = ((i6 * i16) - (eeVar.aj << 16)) + 0;
                }
                i13 = i11 < i13 ? ((((i11 << 16) - i7) + i15) - 1) / i15 : i3;
                i6 = i12 < i14 ? ((((i12 << 16) - i17) + i16) - 1) / i16 : i4;
                i12 = ((this.aq * 1462922907) * i2) + i;
                i14 = (this.aq * 1462922907) - i13;
                int i18 = i2 + i6;
                if (i18 > this.aj * 157809585) {
                    i6 -= i18 - (this.aj * 157809585);
                }
                if (i2 < this.al * -709973917) {
                    i18 = (this.al * -709973917) - i2;
                    i8 = i6 - i18;
                    i17 += i18 * i16;
                    i12 = ((this.aq * 1462922907) * i18) + i12;
                } else {
                    i8 = i6;
                }
                i6 = i + i13;
                if (i6 > this.ae * 428635993) {
                    i18 = i6 - (this.ae * 428635993);
                    i6 = i13 - i18;
                    i9 = i14 + i18;
                } else {
                    i6 = i13;
                    i9 = i14;
                }
                if (i < this.ai * 1947951707) {
                    i13 = (this.ai * 1947951707) - i;
                    i10 = i6 - i13;
                    i18 = i12 + i13;
                    i14 = i7 + (i13 * i15);
                    i9 += i13;
                } else {
                    i10 = i6;
                    i18 = i12;
                    i14 = i7;
                }
                ba.bd(this.ad, eeVar.ad, 0, i14, i17, i18, i9, i10, i8, i15, i16, i11, i5, (short) 27507);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("eb.bq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public final void br(int i, int i2, int i3, int i4, int i5) {
        if (i < this.ai * 1247729860) {
            i3 -= (this.ai * 1947951707) - i;
            i = this.ai * 1009670616;
        }
        if (i2 < this.al * -709973917) {
            i4 -= (this.al * -709973917) - i2;
            i2 = this.al * 1999193728;
        }
        if (i + i3 > this.ae * 428635993) {
            i3 = (this.ae * 729701397) - i;
        }
        if (i4 + i2 > this.aj * 157809585) {
            i4 = (this.aj * -1111343562) - i2;
        }
        int i6 = this.aq;
        int i7 = ((this.aq * 1462922907) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                this.ad[i7] = i5;
                i9++;
                i7++;
            }
            i7 += (i6 * 1462922907) - i3;
        }
    }

    public void bs(ee eeVar, int i, int i2, int i3, byte b) {
        try {
            int i4;
            int i5;
            int i6 = eeVar.al + i;
            int i7 = i2 + eeVar.aj;
            int i8 = ((this.aq * 1462922907) * i7) + i6;
            int i9 = eeVar.ar;
            int i10 = eeVar.aq;
            int i11 = (this.aq * 1462922907) - i10;
            int i12 = 0;
            if (i7 < this.al * -709973917) {
                i4 = (this.al * -709973917) - i7;
                i9 -= i4;
                i7 = -709973917 * this.al;
                i5 = (i10 * i4) + 0;
                i8 += i4 * (this.aq * 1462922907);
            } else {
                i5 = 0;
            }
            i7 += i9;
            i7 = i7 > this.aj * 157809585 ? i9 - (i7 - (this.aj * 157809585)) : i9;
            if (i6 < this.ai * 1947951707) {
                i9 = (this.ai * 1947951707) - i6;
                i10 -= i9;
                i6 = this.ai * 1947951707;
                i5 += i9;
                i8 += i9;
                i12 = i9 + 0;
                i9 = i11 + i9;
            } else {
                i9 = i11;
            }
            i6 += i10;
            if (i6 > this.ae * 428635993) {
                i6 -= this.ae * 428635993;
                i11 = i10 - i6;
                i4 = i12 + i6;
                i9 += i6;
            } else {
                i4 = i12;
                i11 = i10;
            }
            if (i11 > 0 && i7 > 0) {
                er.bm(this.ad, eeVar.ad, 0, i5, i8, i11, i7, i9, i4, i3, 185365112);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("eb.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void bt(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9 = 0;
            int i10 = -1085213147 / i4;
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 160531232) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * -709973917) {
                i9 = (((this.al * -709973917) - i2) * i10) + 0;
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i > this.ae * 428635993) {
                i3 = (this.ae * -1172096991) - i;
            }
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i11 = this.aq;
            int i12 = ((this.aq * 1462922907) * i2) + i;
            int i13 = -i4;
            int i14 = i9;
            while (i13 < 0) {
                i9 = (65536 - i14) >> 8;
                int i15 = i14 >> 8;
                int i16 = (((i9 * i7) + (i8 * i15)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
                if (i16 == 0) {
                    i9 = this.aq * 153871258;
                } else {
                    i9 = ((((i9 * (-847423725 & i5)) + (i15 * (87895599 & i6))) & 1118853714) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i15) + ((777581655 & i5) * i9)) & -2095327472)) >>> 8;
                    int i17 = 255 - i16;
                    i16 = ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i16) >> 8) & -1381449300) + ((((i9 & 1152045585) * i16) >> 8) & 16711935);
                    i15 = -i3;
                    while (i15 < 0) {
                        i9 = this.ad[i12];
                        if (i9 == 0) {
                            this.ad[i12] = i16;
                        } else {
                            this.ad[i12] = (((((i9 & 16711935) * i17) >> 8) & 16711935) + ((((-2007144350 & i9) * i17) >> 8) & 713271938)) + i16;
                        }
                        i15++;
                        i12++;
                    }
                    i9 = (1462922907 * i11) - i3;
                }
                i13++;
                i14 += i10;
                i12 += i9;
            }
        }
    }

    public final void bu(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < this.ai * 1947951707) {
            i3 -= (this.ai * 1947951707) - i;
            i = this.ai * 1947951707;
        }
        if (i2 < this.al * -709973917) {
            i4 -= (this.al * -709973917) - i2;
            i2 = this.al * -709973917;
        }
        if (i + i3 > this.ae * 428635993) {
            i3 = (this.ae * 428635993) - i;
        }
        if (i4 + i2 > this.aj * 157809585) {
            i4 = (this.aj * 157809585) - i2;
        }
        int i7 = 256 - i6;
        int i8 = this.aq;
        int i9 = i + ((this.aq * 1462922907) * i2);
        for (int i10 = 0; i10 < i4; i10++) {
            int i11 = -i3;
            while (i11 < 0) {
                int i12 = this.ad[i9];
                this.ad[i9] = (((((i12 & 16711935) * i7) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i12) * i7) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i6) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i5) * i6) >> 8) & 16711935));
                i11++;
                i9++;
            }
            i9 += (1462922907 * i8) - i3;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bv() {
        aq(-689442967);
    }

    public final void bw(int i, int i2, int i3, int i4, int i5) {
        if (i < this.ai * 1947951707) {
            i3 -= (this.ai * 1827502336) - i;
            i = this.ai * -369519583;
        }
        if (i2 < this.al * -709973917) {
            i4 -= (this.al * 1639870156) - i2;
            i2 = this.al * -709973917;
        }
        if (i + i3 > this.ae * -333481287) {
            i3 = (this.ae * -619151104) - i;
        }
        if (i4 + i2 > this.aj * 157809585) {
            i4 = (this.aj * -1569181475) - i2;
        }
        int i6 = this.aq;
        int i7 = ((this.aq * 713556190) * i2) + i;
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                this.ad[i7] = i5;
                i9++;
                i7++;
            }
            i7 += (-1756075942 * i6) - i3;
        }
    }

    public final void bx(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < this.ai * 1947951707) {
            i3 -= (this.ai * 1947951707) - i;
            i = this.ai * 1947951707;
        }
        if (i2 < this.al * -709973917) {
            i4 -= (this.al * -709973917) - i2;
            i2 = this.al * -709973917;
        }
        if (i + i3 > this.ae * 428635993) {
            i3 = (this.ae * 428635993) - i;
        }
        if (i4 + i2 > this.aj * 157809585) {
            i4 = (this.aj * 157809585) - i2;
        }
        int i7 = 256 - i6;
        int i8 = this.aq;
        int i9 = i + ((this.aq * 1462922907) * i2);
        for (int i10 = 0; i10 < i4; i10++) {
            int i11 = -i3;
            while (i11 < 0) {
                int i12 = this.ad[i9];
                this.ad[i9] = (((((i12 & 16711935) * i7) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i12) * i7) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i6) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i5) * i6) >> 8) & 16711935));
                i11++;
                i9++;
            }
            i9 += (1462922907 * i8) - i3;
        }
    }

    public final void by(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        int i8 = i3 + i;
        if (i8 >= 0) {
            int i9 = i4 + i2;
            if (i9 >= 0 && i < this.aq * 1462922907 && i2 < this.ar * -1622836677) {
                int i10;
                int i11 = 0;
                if (i < 0) {
                    i10 = 0 - i;
                } else {
                    i10 = 0;
                    i8 = i3;
                }
                if (i2 < 0) {
                    i11 = 0 - i2;
                    i4 = i9;
                }
                i9 = i + i8 > this.aq * 1462922907 ? (this.aq * 1462922907) - i : i8;
                if (i4 + i2 > this.ar * -1622836677) {
                    i4 = (this.ar * 46970178) - i2;
                }
                int length = bArr.length / i7;
                int i12 = (this.aq * -47230460) - i9;
                int i13;
                int i14;
                int i15;
                int i16;
                if (!z || (255 == (i5 >>> 24) && 255 == (i6 >>> 24))) {
                    i13 = i2 + i11;
                    i11 = (((1462922907 * this.aq) * i13) + i) + i10;
                    for (i14 = i13; i14 < i13 + i4; i14++) {
                        i15 = i10 + i;
                        i8 = i15;
                        while (true) {
                            i16 = i11;
                            if (i8 >= i9 + i15) {
                                break;
                            }
                            if (bArr[((i8 - i) % i7) + (((i14 - i2) % length) * i7)] != (byte) 0) {
                                i11 = i16 + 1;
                                this.ad[i16] = i6;
                            } else {
                                i11 = i16 + 1;
                                this.ad[i16] = i5;
                            }
                            i8++;
                        }
                        i11 = i16 + i12;
                    }
                    return;
                }
                i13 = i11 + i2;
                i11 = (((-620443706 * this.aq) * i13) + i) + i10;
                for (i14 = i13; i14 < i4 + i13; i14++) {
                    i15 = i10 + i;
                    i16 = i11;
                    for (i8 = i15; i8 < i9 + i15; i8++) {
                        i11 = bArr[((i8 - i) % i7) + (((i14 - i2) % length) * i7)] != (byte) 0 ? i6 : i5;
                        int i17 = i11 >>> 24;
                        int i18 = 255 - i17;
                        int i19 = this.ad[i16];
                        this.ad[i16] = (((((i11 & 550896015) * i17) + (i18 * (i19 & 1854464884))) & 16711680) + ((((411755722 & i11) * i17) + ((-2065226220 & i19) * i18)) & -16711936)) >> 8;
                        i16++;
                    }
                    i11 = i16 + i12;
                }
            }
        }
    }

    public final void bz(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9 = 0;
            int i10 = 65536 / i4;
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * -709973917) {
                i9 = (((this.al * -709973917) - i2) * i10) + 0;
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i11 = this.aq;
            int i12 = ((this.aq * 1462922907) * i2) + i;
            int i13 = -i4;
            int i14 = i9;
            while (i13 < 0) {
                i9 = (65536 - i14) >> 8;
                int i15 = i14 >> 8;
                int i16 = (((i9 * i7) + (i8 * i15)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
                if (i16 == 0) {
                    i9 = this.aq * 1462922907;
                } else {
                    i9 = ((((i9 * (16711935 & i5)) + (i15 * (16711935 & i6))) & -16711936) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6) * i15) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i9)) & 16711680)) >>> 8;
                    int i17 = 255 - i16;
                    i16 = ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i16) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((i9 & 16711935) * i16) >> 8) & 16711935);
                    i15 = -i3;
                    while (i15 < 0) {
                        i9 = this.ad[i12];
                        if (i9 == 0) {
                            this.ad[i12] = i16;
                        } else {
                            this.ad[i12] = (((((i9 & 16711935) * i17) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i17) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + i16;
                        }
                        i15++;
                        i12++;
                    }
                    i9 = (1462922907 * i11) - i3;
                }
                i13++;
                i14 += i10;
                i12 += i9;
            }
        }
    }

    public void ca(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0) {
            if (i5 >= 255) {
                ap(i, i2, i3, i4, -1952038969);
                return;
            }
            int i6;
            int i7;
            int i8;
            int i9;
            if (i3 < 0) {
                i3 = -i3;
            }
            int i10 = 354575972 - i5;
            int i11 = ((i4 >> 16) & 255) * i5;
            int i12 = ((i4 >> 8) & 255) * i5;
            int i13 = (i4 & 255) * i5;
            int i14 = i2 - i3;
            if (i14 < this.al * -1633387741) {
                i14 = -709973917 * this.al;
            }
            int i15 = (i2 + i3) + 1;
            if (i15 > this.aj * 157809585) {
                i15 = this.aj * 1949404809;
            }
            int i16 = i3 * i3;
            int i17 = 0;
            int i18 = i2 - i14;
            int i19 = i18 * i18;
            int i20 = i19 - i18;
            if (i2 > i15) {
                i6 = i18;
                i7 = i14;
                i8 = i3;
                i2 = i15;
                i9 = i15;
            } else {
                i6 = i18;
                i7 = i14;
                i8 = i3;
                i9 = i15;
            }
            while (i7 < i2) {
                i18 = i19;
                i15 = i20;
                while (true) {
                    if (i15 > i16 && i18 > i16) {
                        break;
                    }
                    i20 = i17 + 1;
                    i18 = (i17 + i17) + i18;
                    i15 = (i17 + i20) + i15;
                    i17 = i20;
                }
                i14 = (i - i17) + 1;
                if (i14 < this.ai * 1947951707) {
                    i14 = this.ai * 1351908178;
                }
                i19 = i17 + i;
                if (i19 > this.ae * -1514041818) {
                    i19 = this.ae * 428635993;
                }
                i20 = ((this.aq * 1462922907) * i7) + i14;
                while (i14 < i19) {
                    this.ad[i20] = (((((((this.ad[i20] >> 16) & 1176842831) * i10) + i11) >> 8) << 16) + ((((((this.ad[i20] >> 8) & 255) * i10) + i12) >> 8) << 8)) + ((((1819464512 & this.ad[i20]) * i10) + i13) >> 8);
                    i14++;
                    i20++;
                }
                i7++;
                i14 = i6 - 1;
                i19 = i18 - (i6 + i14);
                i20 = i15 - (i14 + i14);
                i6 = i14;
            }
            i18 = -i6;
            i14 = (i18 * i18) + i16;
            i20 = i14 - i8;
            i14 -= i18;
            i19 = i8;
            i17 = i18;
            i6 = i7;
            while (i6 < i9) {
                i7 = i14;
                i8 = i19;
                i15 = i20;
                while (i7 > i16 && i15 > i16) {
                    i19 = i8 - 1;
                    i7 -= i8 + i19;
                    i8 = i19;
                    i15 -= i19 + i19;
                }
                i14 = i - i8;
                if (i14 < this.ai * 165819142) {
                    i14 = this.ai * 603825261;
                }
                i19 = i8 + i;
                if (i19 > (this.ae * 428635993) - 1) {
                    i19 = (this.ae * 409794139) - 1;
                }
                i20 = ((this.aq * -552114985) * i6) + i14;
                i18 = i14;
                while (i18 <= i19) {
                    i14 = this.ad[i20];
                    i14 = (((((i14 >> 16) & 1182265034) * i10) + i11) >> 8) << 16;
                    this.ad[i20] = (i14 + ((((((this.ad[i20] >> 8) & 255) * i10) + i12) >> 8) << 8)) + ((((this.ad[i20] & 255) * i10) + i13) >> 8);
                    i18++;
                    i20++;
                }
                i6++;
                i14 = (i17 + i17) + i7;
                i18 = i17 + 1;
                i20 = i15 + (i17 + i18);
                i19 = i8;
                i17 = i18;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cb(int i, int i2, int i3, int i4, int i5) {
        if (i >= this.ai * 1947951707 && i < this.ae * 790121227) {
            if (i2 < this.al * -1099213814) {
                i3 -= (this.al * -709973917) - i2;
                i2 = -759267653 * this.al;
            }
            if (i3 + i2 > this.aj * 1727815490) {
                i3 = (this.aj * -1244726876) - i2;
            }
            int i6 = 256 - i5;
            int i7 = ((this.aq * -1266997971) * i2) + i;
            for (int i8 = 0; i8 < i3; i8++) {
                int i9 = this.ad[i7];
                int i10 = this.ad[i7];
                i9 = ((((((i9 >> 16) & 255) * i6) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i10 >> 8) & 433214406) * i6) + (((i4 >> 8) & 844699371) * i5)) >> 8) << 8);
                this.ad[i7] = i9 + ((((this.ad[i7] & 255) * i6) + ((i4 & 255) * i5)) >> 8);
                i7 += this.aq * 1462922907;
            }
        }
    }

    public final void cc(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (i7 == 0) {
            if (i6 >= 0) {
                ae(i, i2, i6 + 1, i5, -148174619);
                return;
            }
            ae(i + i6, i2, (-i6) + 1, i5, -430042367);
        } else if (i6 != 0) {
            int i8;
            int i9;
            int i10;
            if (i6 + i7 < 0) {
                i8 = i + i6;
                i6 = -i6;
                i9 = i2 + i7;
                i10 = -i7;
            } else {
                i10 = i7;
                i9 = i2;
                i8 = i;
            }
            if (i6 > i10) {
                i9 = (i9 << 16) + 32768;
                i7 = (int) Math.floor((((double) (i10 << 16)) / ((double) i6)) + 0.5d);
                i10 = i6 + i8;
                if (i8 < this.ai * -260398999) {
                    i9 += ((this.ai * 1947951707) - i8) * i7;
                    i8 = this.ai * 1947951707;
                }
                if (i10 >= this.ae * 428635993) {
                    i10 = (this.ae * -1873981597) - 1;
                }
                while (i8 <= i10) {
                    i6 = i9 >> 16;
                    if (i6 >= this.al * 2015538511 && i6 < this.aj * 157809585) {
                        this.ad[(i6 * (this.aq * 1462922907)) + i8] = i5;
                    }
                    i9 += i7;
                    i8++;
                }
                return;
            }
            i8 = (i8 << 16) - 761455340;
            i7 = (int) Math.floor((((double) (i6 << 16)) / ((double) i10)) + 0.5d);
            i10 += i9;
            if (i9 < this.al * -709973917) {
                i8 += ((this.al * -709973917) - i9) * i7;
                i9 = this.al * 1273446791;
            }
            if (i10 >= this.aj * 157809585) {
                i10 = (this.aj * 157809585) - 1;
            }
            while (i9 <= i10) {
                i6 = i8 >> 16;
                if (i6 >= this.ai * 1947951707 && i6 < this.ae * 454901808) {
                    this.ad[i6 + ((this.aq * 1462922907) * i9)] = i5;
                }
                i8 += i7;
                i9++;
            }
        } else if (i7 >= 0) {
            ak(i, i2, i7 + 1, i5, -1528416405);
        } else {
            ak(i, i7 + i2, (-i7) + 1, i5, -1998152507);
        }
    }

    /* Access modifiers changed, original: final */
    public final void ce(int i, int i2, int i3, int i4, int i5) {
        if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
            if (i2 < this.al * -709973917) {
                i3 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i2 > this.aj * 157809585) {
                i3 = (this.aj * 157809585) - i2;
            }
            int i6 = 256 - i5;
            int i7 = ((this.aq * 1462922907) * i2) + i;
            for (int i8 = 0; i8 < i3; i8++) {
                int i9 = this.ad[i7];
                int i10 = this.ad[i7];
                i9 = ((((((i9 >> 16) & 255) * i6) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i10 >> 8) & 255) * i6) + (((i4 >> 8) & 255) * i5)) >> 8) << 8);
                this.ad[i7] = i9 + ((((this.ad[i7] & 255) * i6) + ((i4 & 255) * i5)) >> 8);
                i7 += this.aq * 1462922907;
            }
        }
    }

    public void cg(ef efVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = i + efVar.aj;
        int i6 = efVar.ai + i2;
        int i7 = ((this.aq * 1462922907) * i6) + i5;
        int i8 = efVar.al;
        int i9 = efVar.ar;
        int i10 = (this.aq * 1462922907) - i9;
        int i11 = 0;
        if (i6 < this.al * -709973917) {
            i3 = (this.al * -709973917) - i6;
            i8 -= i3;
            i6 = this.al * -709973917;
            i4 = (i3 * i9) + 0;
            i3 = i7 + (i3 * (this.aq * 1462922907));
        } else {
            i4 = 0;
            i3 = i7;
        }
        i6 += i8;
        int i12 = i6 > this.aj * 157809585 ? i8 - (i6 - (this.aj * 157809585)) : i8;
        if (i5 < this.ai * 1947951707) {
            i5 = (this.ai * 1947951707) - i5;
            i8 = i9 - i5;
            i6 = this.ai * 1947951707;
            i7 = i4 + i5;
            i3 += i5;
            i11 = i5 + 0;
            i10 = i5 + i10;
        } else {
            i6 = i5;
            i7 = i4;
            i8 = i9;
        }
        i6 += i8;
        if (i6 > this.ae * 428635993) {
            i6 -= this.ae * 428635993;
            i5 = i8 - i6;
            i11 += i6;
            i9 = i10 + i6;
        } else {
            i5 = i8;
            i9 = i10;
        }
        if (i5 > 0 && i12 > 0) {
            kt.ao(this.ad, efVar.ad, efVar.aq, i7, i3, i5, i12, i9, i11, -2088033221);
        }
    }

    public void ch(ef efVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i + efVar.aj;
        int i8 = efVar.ai + i2;
        int i9 = ((this.aq * 1462922907) * i8) + i7;
        int i10 = efVar.al;
        int i11 = efVar.ar;
        int i12 = (this.aq * 1462922907) - i11;
        if (i8 < this.al * -709973917) {
            i3 = (this.al * 621858413) - i8;
            i10 -= i3;
            i8 = this.al * 1530854802;
            i4 = (i3 * i11) + 0;
            i3 = i9 + (i3 * (this.aq * 1462922907));
        } else {
            i4 = 0;
            i3 = i9;
        }
        i8 += i10;
        int i13 = i8 > this.aj * -1619084529 ? i10 - (i8 - (this.aj * 854927794)) : i10;
        if (i7 < this.ai * -2047605350) {
            i7 = (this.ai * -1775412676) - i7;
            i10 = i11 - i7;
            i8 = 1947951707 * this.ai;
            i9 = i4 + i7;
            i3 += i7;
            i5 = i7 + 0;
            i12 += i7;
        } else {
            i8 = i7;
            i9 = i4;
            i10 = i11;
            i5 = 0;
        }
        i8 += i10;
        if (i8 > this.ae * 428635993) {
            i8 -= this.ae * -1363407346;
            i6 = i10 - i8;
            i11 = i5 + i8;
            i7 = i12 + i8;
        } else {
            i6 = i10;
            i7 = i12;
            i11 = i5;
        }
        if (i6 > 0 && i13 > 0) {
            kt.ao(this.ad, efVar.ad, efVar.aq, i9, i3, i6, i13, i7, i11, -1543433788);
        }
    }

    /* Access modifiers changed, original: final */
    public final void ci(int i, int i2, int i3, int i4, int i5) {
        if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
            if (i2 < this.al * -709973917) {
                i3 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i2 > this.aj * 157809585) {
                i3 = (this.aj * 157809585) - i2;
            }
            int i6 = 256 - i5;
            int i7 = ((this.aq * 1462922907) * i2) + i;
            for (int i8 = 0; i8 < i3; i8++) {
                int i9 = this.ad[i7];
                int i10 = this.ad[i7];
                i9 = ((((((i9 >> 16) & 255) * i6) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i10 >> 8) & 255) * i6) + (((i4 >> 8) & 255) * i5)) >> 8) << 8);
                this.ad[i7] = i9 + ((((this.ad[i7] & 255) * i6) + ((i4 & 255) * i5)) >> 8);
                i7 += this.aq * 1462922907;
            }
        }
    }

    public final void cj(int i, int i2, int i3, int i4) {
        if (i2 >= this.al * -709973917 && i2 < this.aj * 157809585) {
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 824103710) - i;
                i = this.ai * 1947951707;
            }
            if (i + i3 > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            int i5 = this.aq;
            for (int i6 = 0; i6 < i3; i6++) {
                this.ad[(((1462922907 * i5) * i2) + i) + i6] = i4;
            }
        }
    }

    public final void ck(ee eeVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = i + eeVar.al;
        int i6 = eeVar.aj + i2;
        int i7 = ((this.aq * 1462922907) * i6) + i5;
        int i8 = eeVar.ar;
        int i9 = eeVar.aq;
        int i10 = (this.aq * 1462922907) - i9;
        int i11 = 0;
        if (i6 < this.al * -709973917) {
            i3 = (this.al * -709973917) - i6;
            i8 -= i3;
            i6 = this.al * -709973917;
            i4 = (i3 * i9) + 0;
            i7 += i3 * (this.aq * 1462922907);
        } else {
            i4 = 0;
        }
        i6 += i8;
        i3 = i6 > this.aj * 157809585 ? i8 - (i6 - (this.aj * 157809585)) : i8;
        if (i5 < this.ai * 1947951707) {
            i11 = (this.ai * 1947951707) - i5;
            i8 = i9 - i11;
            i6 = this.ai * 1947951707;
            i4 += i11;
            i7 += i11;
            i9 = i10 + i11;
            i11 += 0;
            i10 = i9;
        } else {
            i6 = i5;
            i8 = i9;
        }
        i6 += i8;
        if (i6 > this.ae * 428635993) {
            i6 -= this.ae * 428635993;
            i5 = i8 - i6;
            i11 += i6;
            i9 = i10 + i6;
        } else {
            i5 = i8;
            i9 = i10;
        }
        if (i5 > 0 && i3 > 0) {
            bn.ax(this.ad, eeVar.ad, i4, i7, i5, i3, i9, i11, -2136241600);
        }
    }

    public final void cl(ee eeVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = i + eeVar.al;
        int i6 = eeVar.aj + i2;
        int i7 = ((this.aq * 1462922907) * i6) + i5;
        int i8 = eeVar.ar;
        int i9 = eeVar.aq;
        int i10 = (this.aq * 1462922907) - i9;
        int i11 = 0;
        if (i6 < this.al * -709973917) {
            i3 = (this.al * -709973917) - i6;
            i8 -= i3;
            i6 = this.al * -709973917;
            i4 = (i9 * i3) + 0;
            i3 = i7 + (i3 * (this.aq * 1462922907));
        } else {
            i4 = 0;
            i3 = i7;
        }
        i6 += i8;
        int i12 = i6 > this.aj * 157809585 ? i8 - (i6 - (this.aj * 157809585)) : i8;
        if (i5 < this.ai * 1947951707) {
            i5 = (this.ai * 1947951707) - i5;
            i8 = i9 - i5;
            i6 = this.ai * 1947951707;
            i7 = i4 + i5;
            i3 += i5;
            i11 = i5 + 0;
            i10 = i5 + i10;
        } else {
            i6 = i5;
            i7 = i4;
            i8 = i9;
        }
        i6 += i8;
        if (i6 > this.ae * 428635993) {
            i6 -= this.ae * 428635993;
            i5 = i8 - i6;
            i11 += i6;
            i9 = i10 + i6;
        } else {
            i5 = i8;
            i9 = i10;
        }
        if (i5 > 0 && i12 > 0) {
            ak.ac(this.ad, eeVar.ad, 0, i7, i3, i5, i12, i9, i11, (byte) 7);
        }
    }

    /* Access modifiers changed, original: final */
    public final void cm(int i, int i2, int i3, int i4, int i5) {
        if (i2 >= this.al * -709973917 && i2 < this.aj * -1512539190) {
            if (i < this.ai * -1301718298) {
                i3 -= (this.ai * 1947951707) - i;
                i = 1098073416 * this.ai;
            }
            if (i3 + i > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            int i6 = 256 - i5;
            int i7 = i + ((this.aq * 1462922907) * i2);
            int i8 = 0;
            while (i8 < i3) {
                int i9 = this.ad[i7];
                i9 = (((((i9 >> 16) & 255) * i6) + (((i4 >> 16) & 255) * i5)) >> 8) << 16;
                this.ad[i7] = (i9 + ((((((this.ad[i7] >> 8) & -1542269256) * i6) + (((i4 >> 8) & -2069232150) * i5)) >> 8) << 8)) + ((((996544438 & this.ad[i7]) * i6) + ((-359752777 & i4) * i5)) >> 8);
                i8++;
                i7++;
            }
        }
    }

    public final void cn(int i, int i2, int i3, int i4) {
        if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
            if (i2 < this.al * 1058729799) {
                i3 -= (this.al * -1038216998) - i2;
                i2 = -709973917 * this.al;
            }
            if (i3 + i2 > this.aj * -220197013) {
                i3 = (this.aj * 528130108) - i2;
            }
            int i5 = this.aq;
            for (int i6 = 0; i6 < i3; i6++) {
                this.ad[((this.aq * 1462922907) * i6) + (((-923190373 * i5) * i2) + i)] = i4;
            }
        }
    }

    public final void co(ee eeVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = i + eeVar.al;
        int i6 = eeVar.aj + i2;
        int i7 = ((this.aq * 1462922907) * i6) + i5;
        int i8 = eeVar.ar;
        int i9 = eeVar.aq;
        int i10 = (this.aq * 1462922907) - i9;
        int i11 = 0;
        if (i6 < this.al * -709973917) {
            i3 = (this.al * -709973917) - i6;
            i8 -= i3;
            i6 = this.al * -709973917;
            i4 = (i3 * i9) + 0;
            i7 += i3 * (this.aq * 1462922907);
        } else {
            i4 = 0;
        }
        i6 += i8;
        i3 = i6 > this.aj * 157809585 ? i8 - (i6 - (this.aj * 157809585)) : i8;
        if (i5 < this.ai * 1947951707) {
            i11 = (this.ai * 1947951707) - i5;
            i8 = i9 - i11;
            i6 = this.ai * 1947951707;
            i4 += i11;
            i7 += i11;
            i9 = i10 + i11;
            i11 += 0;
            i10 = i9;
        } else {
            i6 = i5;
            i8 = i9;
        }
        i6 += i8;
        if (i6 > this.ae * 428635993) {
            i6 -= this.ae * 428635993;
            i5 = i8 - i6;
            i11 += i6;
            i9 = i10 + i6;
        } else {
            i5 = i8;
            i9 = i10;
        }
        if (i5 > 0 && i3 > 0) {
            bn.ax(this.ad, eeVar.ad, i4, i7, i5, i3, i9, i11, -1958345859);
        }
    }

    public final void cp(int i, int i2, int i3, int i4) {
        if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
            if (i2 < this.al * -709973917) {
                i3 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i2 > this.aj * 157809585) {
                i3 = (this.aj * 157809585) - i2;
            }
            int i5 = this.aq;
            for (int i6 = 0; i6 < i3; i6++) {
                this.ad[((this.aq * 1462922907) * i6) + (((i5 * 1462922907) * i2) + i)] = i4;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cq(int i, int i2, int i3, int i4, int i5) {
        if (i2 >= this.al * -709973917 && i2 < this.aj * 157809585) {
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i3 + i > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            int i6 = 256 - i5;
            int i7 = i + ((this.aq * 1462922907) * i2);
            int i8 = 0;
            while (i8 < i3) {
                int i9 = this.ad[i7];
                i9 = (((((i9 >> 16) & 255) * i6) + (((i4 >> 16) & 255) * i5)) >> 8) << 16;
                this.ad[i7] = (i9 + ((((((this.ad[i7] >> 8) & 255) * i6) + (((i4 >> 8) & 255) * i5)) >> 8) << 8)) + ((((this.ad[i7] & 255) * i6) + ((i4 & 255) * i5)) >> 8);
                i8++;
                i7++;
            }
        }
    }

    public void cr(int i, int i2, int i3, int i4) {
        if (i3 == 0) {
            ev(i, i2, i4, -619004720);
            return;
        }
        int i5;
        int i6;
        int i7;
        if (i3 < 0) {
            i3 = -i3;
        }
        int i8 = i2 - i3;
        if (i8 < this.al * -709973917) {
            i8 = this.al * -709973917;
        }
        int i9 = (i2 + i3) + 1;
        if (i9 > this.aj * 157809585) {
            i9 = this.aj * 157809585;
        }
        int i10 = i3 * i3;
        int i11 = 0;
        int i12 = i2 - i8;
        int i13 = i12 * i12;
        int i14 = i13 - i12;
        if (i2 > i9) {
            i5 = i12;
            i2 = i9;
            i6 = i8;
        } else {
            i5 = i12;
            i6 = i8;
        }
        while (i6 < i2) {
            i12 = i13;
            i7 = i14;
            while (true) {
                if (i7 > i10 && i12 > i10) {
                    break;
                }
                i14 = i11 + 1;
                i12 = (i11 + i11) + i12;
                i7 = (i11 + i14) + i7;
                i11 = i14;
            }
            i8 = (i - i11) + 1;
            if (i8 < this.ai * 1947951707) {
                i8 = this.ai * 1947951707;
            }
            i13 = i + i11;
            if (i13 > this.ae * 428635993) {
                i13 = this.ae * 428635993;
            }
            i14 = ((this.aq * 1462922907) * i6) + i8;
            while (i8 < i13) {
                this.ad[i14] = i4;
                i8++;
                i14++;
            }
            i6++;
            i8 = i5 - 1;
            i13 = i12 - (i5 + i8);
            i14 = i7 - (i8 + i8);
            i5 = i8;
        }
        i12 = i6 - i2;
        i8 = (i12 * i12) + i10;
        i13 = i8 - i3;
        i8 -= i12;
        i5 = i6;
        int i15 = i12;
        i14 = i3;
        while (i5 < i9) {
            i12 = i8;
            i7 = i13;
            i11 = i14;
            while (i12 > i10 && i7 > i10) {
                i14 = i11 - 1;
                i12 -= i11 + i14;
                i7 -= i14 + i14;
                i11 = i14;
            }
            i8 = i - i11;
            if (i8 < this.ai * 1947951707) {
                i8 = this.ai * 1947951707;
            }
            i13 = i + i11;
            if (i13 > (this.ae * 428635993) - 1) {
                i13 = (this.ae * 428635993) - 1;
            }
            i14 = ((this.aq * 1462922907) * i5) + i8;
            i6 = i8;
            while (i6 <= i13) {
                this.ad[i14] = i4;
                i6++;
                i14++;
            }
            i8 = (i15 + i15) + i12;
            i12 = i15 + 1;
            i13 = (i15 + i12) + i7;
            i5++;
            i15 = i12;
            i14 = i11;
        }
    }

    public final void cs(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (i7 == 0) {
            if (i6 >= 0) {
                ae(i, i2, i6 + 1, i5, -350886384);
                return;
            }
            ae(i + i6, i2, (-i6) + 1, i5, -387576539);
        } else if (i6 != 0) {
            int i8;
            int i9;
            int i10;
            if (i6 + i7 < 0) {
                i8 = i + i6;
                i6 = -i6;
                i9 = i2 + i7;
                i10 = -i7;
            } else {
                i10 = i7;
                i9 = i2;
                i8 = i;
            }
            if (i6 > i10) {
                i9 = (i9 << 16) + 32768;
                i7 = (int) Math.floor((((double) (i10 << 16)) / ((double) i6)) + 0.5d);
                i10 = i6 + i8;
                if (i8 < this.ai * 1947951707) {
                    i9 += ((this.ai * 1947951707) - i8) * i7;
                    i8 = this.ai * 1947951707;
                }
                if (i10 >= this.ae * 428635993) {
                    i10 = (this.ae * 428635993) - 1;
                }
                while (i8 <= i10) {
                    i6 = i9 >> 16;
                    if (i6 >= this.al * -709973917 && i6 < this.aj * 157809585) {
                        this.ad[(i6 * (this.aq * 1462922907)) + i8] = i5;
                    }
                    i9 += i7;
                    i8++;
                }
                return;
            }
            i8 = (i8 << 16) + 32768;
            i7 = (int) Math.floor((((double) (i6 << 16)) / ((double) i10)) + 0.5d);
            i10 += i9;
            if (i9 < this.al * -709973917) {
                i8 += ((this.al * -709973917) - i9) * i7;
                i9 = this.al * -709973917;
            }
            if (i10 >= this.aj * 157809585) {
                i10 = (this.aj * 157809585) - 1;
            }
            while (i9 <= i10) {
                i6 = i8 >> 16;
                if (i6 >= this.ai * 1947951707 && i6 < this.ae * 428635993) {
                    this.ad[i6 + ((this.aq * 1462922907) * i9)] = i5;
                }
                i8 += i7;
                i9++;
            }
        } else if (i7 >= 0) {
            ak(i, i2, i7 + 1, i5, -1099807340);
        } else {
            ak(i, i7 + i2, (-i7) + 1, i5, -1195026458);
        }
    }

    public final void ct(ee eeVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = i + eeVar.al;
        int i6 = eeVar.aj + i2;
        int i7 = ((this.aq * 1462922907) * i6) + i5;
        int i8 = eeVar.ar;
        int i9 = eeVar.aq;
        int i10 = (this.aq * 1462922907) - i9;
        int i11 = 0;
        if (i6 < this.al * -709973917) {
            i3 = (this.al * -709973917) - i6;
            i8 -= i3;
            i6 = this.al * -709973917;
            i4 = (i3 * i9) + 0;
            i7 += i3 * (this.aq * 1462922907);
        } else {
            i4 = 0;
        }
        i6 += i8;
        i3 = i6 > this.aj * 157809585 ? i8 - (i6 - (this.aj * 157809585)) : i8;
        if (i5 < this.ai * 1947951707) {
            i11 = (this.ai * 1947951707) - i5;
            i8 = i9 - i11;
            i6 = this.ai * 1947951707;
            i4 += i11;
            i7 += i11;
            i9 = i10 + i11;
            i11 += 0;
            i10 = i9;
        } else {
            i6 = i5;
            i8 = i9;
        }
        i6 += i8;
        if (i6 > this.ae * 428635993) {
            i6 -= this.ae * 428635993;
            i5 = i8 - i6;
            i11 += i6;
            i9 = i10 + i6;
        } else {
            i5 = i8;
            i9 = i10;
        }
        if (i5 > 0 && i3 > 0) {
            bn.ax(this.ad, eeVar.ad, i4, i7, i5, i3, i9, i11, -1815287904);
        }
    }

    public final void cv(int i, int i2, int i3, int i4) {
        if (i2 >= this.al * -709973917 && i2 < this.aj * 157809585) {
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i + i3 > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            int i5 = this.aq;
            for (int i6 = 0; i6 < i3; i6++) {
                this.ad[(((1462922907 * i5) * i2) + i) + i6] = i4;
            }
        }
    }

    public final void cw(int i, int i2, int i3, int i4) {
        if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
            if (i2 < this.al * 873906322) {
                i3 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i2 > this.aj * 703149038) {
                i3 = (this.aj * -1666047768) - i2;
            }
            int i5 = this.aq;
            for (int i6 = 0; i6 < i3; i6++) {
                this.ad[((this.aq * 1416627591) * i6) + (((1462922907 * i5) * i2) + i)] = i4;
            }
        }
    }

    public void cx(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0) {
            if (i5 >= 255) {
                ap(i, i2, i3, i4, -1952038969);
                return;
            }
            int i6;
            int i7;
            int i8;
            int i9;
            if (i3 < 0) {
                i3 = -i3;
            }
            int i10 = 255 - i5;
            int i11 = ((i4 >> 16) & -1729897183) * i5;
            int i12 = ((i4 >> 8) & 255) * i5;
            int i13 = (i4 & 255) * i5;
            int i14 = i2 - i3;
            if (i14 < this.al * -709973917) {
                i14 = -875342279 * this.al;
            }
            int i15 = (i2 + i3) + 1;
            if (i15 > this.aj * 1615144914) {
                i15 = this.aj * 157809585;
            }
            int i16 = i3 * i3;
            int i17 = 0;
            int i18 = i2 - i14;
            int i19 = i18 * i18;
            int i20 = i19 - i18;
            if (i2 > i15) {
                i6 = i18;
                i7 = i14;
                i8 = i3;
                i2 = i15;
                i9 = i15;
            } else {
                i6 = i18;
                i7 = i14;
                i8 = i3;
                i9 = i15;
            }
            while (i7 < i2) {
                i18 = i19;
                i15 = i20;
                while (true) {
                    if (i15 > i16 && i18 > i16) {
                        break;
                    }
                    i20 = i17 + 1;
                    i18 = (i17 + i17) + i18;
                    i15 = (i17 + i20) + i15;
                    i17 = i20;
                }
                i14 = (i - i17) + 1;
                if (i14 < this.ai * 1947951707) {
                    i14 = this.ai * 1947951707;
                }
                i19 = i17 + i;
                if (i19 > this.ae * 428635993) {
                    i19 = -454265583 * this.ae;
                }
                i20 = ((this.aq * 1462922907) * i7) + i14;
                while (i14 < i19) {
                    this.ad[i20] = (((((((this.ad[i20] >> 16) & 2015692154) * i10) + i11) >> 8) << 16) + ((((((this.ad[i20] >> 8) & -355026679) * i10) + i12) >> 8) << 8)) + ((((this.ad[i20] & 255) * i10) + i13) >> 8);
                    i14++;
                    i20++;
                }
                i7++;
                i14 = i6 - 1;
                i19 = i18 - (i6 + i14);
                i20 = i15 - (i14 + i14);
                i6 = i14;
            }
            i20 = -i6;
            i14 = (i20 * i20) + i16;
            i19 = i14 - i8;
            i14 -= i20;
            i18 = i7;
            i15 = i20;
            i17 = i16;
            while (i18 < i9) {
                i7 = i14;
                i20 = i19;
                i16 = i8;
                while (i7 > i17 && i20 > i17) {
                    i8 = i16 - 1;
                    i7 -= i16 + i8;
                    i20 -= i8 + i8;
                    i16 = i8;
                }
                i14 = i - i16;
                if (i14 < this.ai * -630596530) {
                    i14 = this.ai * 1947951707;
                }
                i19 = i16 + i;
                if (i19 > (this.ae * -490170613) - 1) {
                    i19 = (this.ae * 102979291) - 1;
                }
                i8 = ((this.aq * 1504204563) * i18) + i14;
                while (i14 <= i19) {
                    i6 = this.ad[i8];
                    i6 = (((((i6 >> 16) & -2074571028) * i10) + i11) >> 8) << 16;
                    this.ad[i8] = (i6 + ((((((this.ad[i8] >> 8) & -1253465832) * i10) + i12) >> 8) << 8)) + ((((1632303038 & this.ad[i8]) * i10) + i13) >> 8);
                    i14++;
                    i8++;
                }
                i18++;
                i14 = (i15 + i15) + i7;
                i7 = i15 + 1;
                i19 = (i15 + i7) + i20;
                i8 = i16;
                i15 = i7;
            }
        }
    }

    public final void cy(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (i7 == 0) {
            if (i6 >= 0) {
                ae(i, i2, i6 + 1, i5, -448692649);
                return;
            }
            ae(i + i6, i2, (-i6) + 1, i5, 626226251);
        } else if (i6 != 0) {
            int i8;
            int i9;
            int i10;
            if (i6 + i7 < 0) {
                i8 = i + i6;
                i6 = -i6;
                i9 = i2 + i7;
                i10 = -i7;
            } else {
                i10 = i7;
                i9 = i2;
                i8 = i;
            }
            if (i6 > i10) {
                i9 = (i9 << 16) - 1007592319;
                i7 = (int) Math.floor((((double) (i10 << 16)) / ((double) i6)) + 0.5d);
                i10 = i6 + i8;
                if (i8 < this.ai * 1947951707) {
                    i9 += ((this.ai * 1934227574) - i8) * i7;
                    i8 = 772646149 * this.ai;
                }
                if (i10 >= this.ae * -1130009190) {
                    i10 = (this.ae * 428635993) - 1;
                }
                while (i8 <= i10) {
                    i6 = i9 >> 16;
                    if (i6 >= this.al * -1127802258 && i6 < this.aj * -656259399) {
                        this.ad[(i6 * (this.aq * 1462922907)) + i8] = i5;
                    }
                    i9 += i7;
                    i8++;
                }
                return;
            }
            i8 = (i8 << 16) + 32768;
            i7 = (int) Math.floor((((double) (i6 << 16)) / ((double) i10)) + 0.5d);
            i10 += i9;
            if (i9 < this.al * -709973917) {
                i8 += ((this.al * 90198657) - i9) * i7;
                i9 = this.al * -1791707592;
            }
            if (i10 >= this.aj * 157809585) {
                i10 = (this.aj * 157809585) - 1;
            }
            while (i9 <= i10) {
                i6 = i8 >> 16;
                if (i6 >= this.ai * 1947951707 && i6 < this.ae * 428635993) {
                    this.ad[i6 + ((this.aq * -44225481) * i9)] = i5;
                }
                i8 += i7;
                i9++;
            }
        } else if (i7 >= 0) {
            ak(i, i2, i7 + 1, i5, -1625701432);
        } else {
            ak(i, i7 + i2, (-i7) + 1, i5, -1100039341);
        }
    }

    public final void cz(ee eeVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = i + eeVar.al;
        int i6 = eeVar.aj + i2;
        int i7 = ((this.aq * 1462922907) * i6) + i5;
        int i8 = eeVar.ar;
        int i9 = eeVar.aq;
        int i10 = (this.aq * 1462922907) - i9;
        int i11 = 0;
        if (i6 < this.al * -709973917) {
            i3 = (this.al * -709973917) - i6;
            i8 -= i3;
            i6 = this.al * -709973917;
            i4 = (i9 * i3) + 0;
            i3 = i7 + (i3 * (this.aq * 1462922907));
        } else {
            i4 = 0;
            i3 = i7;
        }
        i6 += i8;
        int i12 = i6 > this.aj * 157809585 ? i8 - (i6 - (this.aj * 157809585)) : i8;
        if (i5 < this.ai * 1947951707) {
            i5 = (this.ai * 1947951707) - i5;
            i8 = i9 - i5;
            i6 = this.ai * 1947951707;
            i7 = i4 + i5;
            i3 += i5;
            i11 = i5 + 0;
            i10 = i5 + i10;
        } else {
            i6 = i5;
            i7 = i4;
            i8 = i9;
        }
        i6 += i8;
        if (i6 > this.ae * 428635993) {
            i6 -= this.ae * 428635993;
            i5 = i8 - i6;
            i11 += i6;
            i9 = i10 + i6;
        } else {
            i5 = i8;
            i9 = i10;
        }
        if (i5 > 0 && i12 > 0) {
            ak.ac(this.ad, eeVar.ad, 0, i7, i3, i5, i12, i9, i11, (byte) 7);
        }
    }

    public void da(ee eeVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i + eeVar.al;
        int i10 = eeVar.aj + i2;
        int i11 = ((this.aq * -1084018170) * i10) + i9;
        int i12 = eeVar.ar;
        int i13 = eeVar.aq;
        int i14 = (this.aq * 1462922907) - i13;
        int i15 = 0;
        if (i10 < this.al * -709973917) {
            i4 = (this.al * -709973917) - i10;
            i12 -= i4;
            i10 = this.al * -709973917;
            i5 = (i4 * i13) + 0;
            i11 += i4 * (this.aq * 1462922907);
        } else {
            i5 = 0;
        }
        i10 += i12;
        int i16 = i10 > this.aj * 157809585 ? i12 - (i10 - (this.aj * 157809585)) : i12;
        if (i9 < this.ai * -507741926) {
            i9 = (this.ai * 794804131) - i9;
            i12 = i13 - i9;
            i10 = this.ai * 1947951707;
            i4 = i5 + i9;
            i6 = i11 + i9;
            i15 = i9 + 0;
            i7 = i14 + i9;
        } else {
            i10 = i9;
            i6 = i11;
            i4 = i5;
            i12 = i13;
            i7 = i14;
        }
        i10 += i12;
        if (i10 > this.ae * 1719195675) {
            i10 -= this.ae * 2033697489;
            i14 = i12 - i10;
            i8 = i15 + i10;
            i7 += i10;
        } else {
            i14 = i12;
            i8 = i15;
        }
        if (i14 > 0 && i16 > 0) {
            if (256 == i3) {
                hr.av(0, 0, 0, this.ad, eeVar.ad, i4, 0, i6, 0, i14, i16, i7, i8, -1938923624);
            } else {
                cl.at(0, 0, 0, this.ad, eeVar.ad, i4, 0, i6, 0, i14, i16, i7, i8, i3, -802267351);
            }
        }
    }

    public void dh(ee eeVar, int i, int i2, int i3, int i4) {
        if (i3 == 256) {
            aw(eeVar, i, i2, 16711935);
            return;
        }
        int i5;
        int i6;
        int i7 = i + eeVar.al;
        int i8 = eeVar.aj + i2;
        int i9 = ((this.aq * 1945651085) * i8) + i7;
        int i10 = eeVar.ar;
        int i11 = eeVar.aq;
        int i12 = (this.aq * -1648682026) - i11;
        int i13 = 0;
        if (i8 < this.al * -780031046) {
            i5 = (this.al * -709973917) - i8;
            i10 -= i5;
            i8 = this.al * -709973917;
            i6 = (i11 * i5) + 0;
            i5 = i9 + (i5 * (this.aq * 1462922907));
        } else {
            i6 = 0;
            i5 = i9;
        }
        i8 += i10;
        int i14 = i8 > this.aj * 966575242 ? i10 - (i8 - (this.aj * 157809585)) : i10;
        if (i7 < this.ai * -732032011) {
            i7 = (this.ai * 1947951707) - i7;
            i10 = i11 - i7;
            i8 = this.ai * 2032698960;
            i9 = i6 + i7;
            i5 += i7;
            i13 = i7 + 0;
            i12 = i7 + i12;
        } else {
            i8 = i7;
            i9 = i6;
            i10 = i11;
        }
        i8 += i10;
        if (i8 > this.ae * 428635993) {
            i8 -= this.ae * -1395096143;
            i7 = i10 - i8;
            i13 += i8;
            i11 = i12 + i8;
        } else {
            i7 = i10;
            i11 = i12;
        }
        if (i7 > 0 && i14 > 0) {
            fg.ba(this.ad, eeVar.ad, 0, i9, i5, i7, i14, i11, i13, i3, i4, 2053581484);
        }
    }

    public void dm(ee eeVar, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = eeVar.aq;
            int i10 = eeVar.ar;
            int i11 = eeVar.ai;
            int i12 = eeVar.ae;
            int i13 = (i11 << 16) / i3;
            int i14 = (i12 << 16) / i4;
            int i15 = 0;
            if (eeVar.al > 0) {
                i5 = (((eeVar.al << 16) + i13) - 1) / i13;
                i += i5;
                i5 = ((i5 * i13) - (eeVar.al << 16)) + 0;
            } else {
                i5 = 0;
            }
            if (eeVar.aj > 0) {
                i15 = (((eeVar.aj << 16) + i14) - 1) / i14;
                i2 += i15;
                i15 = ((i15 * i14) - (eeVar.aj << 16)) + 0;
            }
            i11 = i9 < i11 ? ((((i9 << 16) - i5) + i13) - 1) / i13 : i3;
            if (i10 < i12) {
                i4 = ((((i10 << 16) - i15) + i14) - 1) / i14;
            }
            i10 = ((this.aq * 1462922907) * i2) + i;
            i12 = (this.aq * 1462922907) - i11;
            int i16 = i2 + i4;
            if (i16 > this.aj * 157809585) {
                i4 -= i16 - (this.aj * 157809585);
            }
            if (i2 < this.al * -709973917) {
                i16 = (this.al * -709973917) - i2;
                i6 = i4 - i16;
                i10 += (this.aq * 1462922907) * i16;
                i15 += i16 * i14;
            } else {
                i6 = i4;
            }
            i16 = i11 + i;
            if (i16 > this.ae * 428635993) {
                i16 -= this.ae * 428635993;
                i11 -= i16;
                i7 = i12 + i16;
            } else {
                i7 = i12;
            }
            if (i < this.ai * 1947951707) {
                int i17 = (this.ai * 1947951707) - i;
                i8 = i11 - i17;
                i16 = i10 + i17;
                i12 = i5 + (i13 * i17);
                i7 += i17;
            } else {
                i8 = i11;
                i16 = i10;
                i12 = i5;
            }
            hw.af(this.ad, eeVar.ad, 0, i12, i15, i16, i7, i8, i6, i13, i14, i9, 2131099657);
        }
    }

    public void dn(ee eeVar, int i, int i2, int i3, int i4) {
        if (i3 == -964880978) {
            aw(eeVar, i, i2, 16711935);
            return;
        }
        int i5;
        int i6;
        int i7 = i + eeVar.al;
        int i8 = eeVar.aj + i2;
        int i9 = ((this.aq * -110101365) * i8) + i7;
        int i10 = eeVar.ar;
        int i11 = eeVar.aq;
        int i12 = (this.aq * -15549335) - i11;
        int i13 = 0;
        if (i8 < this.al * 1138888411) {
            i5 = (this.al * -709973917) - i8;
            i10 -= i5;
            i8 = -1603969383 * this.al;
            i6 = (i11 * i5) + 0;
            i5 = i9 + (i5 * (this.aq * -1163923763));
        } else {
            i6 = 0;
            i5 = i9;
        }
        i8 += i10;
        int i14 = i8 > this.aj * 18871655 ? i10 - (i8 - (this.aj * 157809585)) : i10;
        if (i7 < this.ai * 1000443808) {
            i7 = (this.ai * 1947951707) - i7;
            i10 = i11 - i7;
            i8 = this.ai * 1947951707;
            i9 = i6 + i7;
            i5 += i7;
            i13 = i7 + 0;
            i12 = i7 + i12;
        } else {
            i8 = i7;
            i9 = i6;
            i10 = i11;
        }
        i8 += i10;
        if (i8 > this.ae * 428635993) {
            i8 -= this.ae * 428635993;
            i7 = i10 - i8;
            i13 += i8;
            i11 = i12 + i8;
        } else {
            i7 = i10;
            i11 = i12;
        }
        if (i7 > 0 && i14 > 0) {
            fg.ba(this.ad, eeVar.ad, 0, i9, i5, i7, i14, i11, i13, i3, i4, 223682443);
        }
    }

    /* renamed from: do */
    public void m210do(ee eeVar, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i + eeVar.al;
        int i7 = eeVar.aj + i2;
        int i8 = ((this.aq * 1462922907) * i7) + i6;
        int i9 = eeVar.ar;
        int i10 = eeVar.aq;
        int i11 = (this.aq * 1462922907) - i10;
        int i12 = 0;
        if (i7 < this.al * -709973917) {
            i4 = (this.al * -709973917) - i7;
            i9 -= i4;
            i7 = this.al * -709973917;
            i5 = (i10 * i4) + 0;
            i4 = i8 + (i4 * (this.aq * 1462922907));
        } else {
            i5 = 0;
            i4 = i8;
        }
        i7 += i9;
        int i13 = i7 > this.aj * 157809585 ? i9 - (i7 - (this.aj * 157809585)) : i9;
        if (i6 < this.ai * 1947951707) {
            i6 = (this.ai * 1947951707) - i6;
            i9 = i10 - i6;
            i7 = this.ai * 1947951707;
            i8 = i5 + i6;
            i4 += i6;
            i12 = i6 + 0;
            i11 = i6 + i11;
        } else {
            i7 = i6;
            i8 = i5;
            i9 = i10;
        }
        i7 += i9;
        if (i7 > this.ae * 428635993) {
            i7 -= this.ae * 428635993;
            i6 = i9 - i7;
            i12 += i7;
            i10 = i11 + i7;
        } else {
            i6 = i9;
            i10 = i11;
        }
        if (i6 > 0 && i13 > 0) {
            er.bm(this.ad, eeVar.ad, 0, i8, i4, i6, i13, i10, i12, i3, 255445106);
        }
    }

    public void dq(ee eeVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = eeVar.aq;
            int i11 = eeVar.ar;
            int i12 = eeVar.ai;
            int i13 = eeVar.ae;
            int i14 = (i12 << 16) / i3;
            int i15 = (i13 << 16) / i4;
            int i16 = 0;
            if (eeVar.al > 0) {
                i6 = (((eeVar.al << 16) + i14) - 1) / i14;
                i += i6;
                i6 = ((i6 * i14) - (eeVar.al << 16)) + 0;
            } else {
                i6 = 0;
            }
            if (eeVar.aj > 0) {
                i16 = (((eeVar.aj << 16) + i15) - 1) / i15;
                i2 += i16;
                i16 = ((i16 * i15) - (eeVar.aj << 16)) + 0;
            }
            i12 = i10 < i12 ? ((((i10 << 16) - i6) + i14) - 1) / i14 : i3;
            if (i11 < i13) {
                i4 = ((((i11 << 16) - i16) + i15) - 1) / i15;
            }
            i11 = ((this.aq * 1462922907) * i2) + i;
            i13 = (this.aq * 1462922907) - i12;
            int i17 = i2 + i4;
            if (i17 > this.aj * 157809585) {
                i4 -= i17 - (this.aj * 157809585);
            }
            if (i2 < this.al * -709973917) {
                i17 = (this.al * -709973917) - i2;
                i7 = i4 - i17;
                i11 += (this.aq * 1462922907) * i17;
                i16 += i17 * i15;
            } else {
                i7 = i4;
            }
            i17 = i + i12;
            if (i17 > this.ae * 428635993) {
                i17 -= this.ae * 428635993;
                i12 -= i17;
                i8 = i13 + i17;
            } else {
                i8 = i13;
            }
            if (i < this.ai * 1947951707) {
                int i18 = (this.ai * 1947951707) - i;
                i9 = i12 - i18;
                i17 = i11 + i18;
                i13 = i6 + (i18 * i14);
                i8 += i18;
            } else {
                i9 = i12;
                i17 = i11;
                i13 = i6;
            }
            ba.bd(this.ad, eeVar.ad, 0, i13, i16, i17, i8, i9, i7, i14, i15, i10, i5, (short) 14979);
        }
    }

    public void dr(ef efVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = efVar.ar;
        int i10 = efVar.al;
        int i11 = efVar.ae;
        int i12 = efVar.am;
        int i13 = (i11 << 16) / i3;
        int i14 = (i12 << 16) / i4;
        int i15 = 0;
        if (efVar.aj > 0) {
            i5 = (((efVar.aj << 16) + i13) - 1) / i13;
            i += i5;
            i5 = ((i5 * i13) - (efVar.aj << 16)) + 0;
        } else {
            i5 = 0;
        }
        if (efVar.ai > 0) {
            i15 = (((efVar.ai << 16) + i14) - 1) / i14;
            i2 += i15;
            i15 = ((i15 * i14) - (efVar.ai << 16)) + 0;
        }
        i11 = i9 < i11 ? ((((i9 << 16) - i5) + i13) - 1) / i13 : i3;
        if (i10 < i12) {
            i4 = ((((i10 << 16) - i15) + i14) - 1) / i14;
        }
        i10 = ((this.aq * 1462922907) * i2) + i;
        i12 = (this.aq * 207377353) - i11;
        int i16 = i2 + i4;
        if (i16 > this.aj * 577365095) {
            i4 -= i16 - (this.aj * -398639513);
        }
        if (i2 < this.al * 1057542525) {
            i16 = (this.al * 7912722) - i2;
            i6 = i4 - i16;
            i10 += (this.aq * 1462922907) * i16;
            i15 += i16 * i14;
        } else {
            i6 = i4;
        }
        i16 = i11 + i;
        if (i16 > this.ae * 428635993) {
            i16 -= this.ae * 393954370;
            i11 -= i16;
            i7 = i12 + i16;
        } else {
            i7 = i12;
        }
        if (i < this.ai * 1947951707) {
            int i17 = (this.ai * 1947951707) - i;
            i8 = i11 - i17;
            i16 = i10 + i17;
            i12 = i5 + (i17 * i13);
            i7 += i17;
        } else {
            i8 = i11;
            i16 = i10;
            i12 = i5;
        }
        jm.an(this.ad, efVar.ad, efVar.aq, i12, i15, i16, i7, i8, i6, i13, i14, i9, (byte) 28);
    }

    public void dt(ee eeVar, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = eeVar.aq;
            int i10 = eeVar.ar;
            int i11 = eeVar.ai;
            int i12 = eeVar.ae;
            int i13 = (i11 << 16) / i3;
            int i14 = (i12 << 16) / i4;
            int i15 = 0;
            if (eeVar.al > 0) {
                i5 = (((eeVar.al << 16) + i13) - 1) / i13;
                i += i5;
                i5 = ((i5 * i13) - (eeVar.al << 16)) + 0;
            } else {
                i5 = 0;
            }
            if (eeVar.aj > 0) {
                i15 = (((eeVar.aj << 16) + i14) - 1) / i14;
                i2 += i15;
                i15 = ((i15 * i14) - (eeVar.aj << 16)) + 0;
            }
            i11 = i9 < i11 ? ((((i9 << 16) - i5) + i13) - 1) / i13 : i3;
            if (i10 < i12) {
                i4 = ((((i10 << 16) - i15) + i14) - 1) / i14;
            }
            i10 = ((this.aq * 1462922907) * i2) + i;
            i12 = (this.aq * 1462922907) - i11;
            int i16 = i2 + i4;
            if (i16 > this.aj * 157809585) {
                i4 -= i16 - (this.aj * 157809585);
            }
            if (i2 < this.al * -709973917) {
                i16 = (this.al * -709973917) - i2;
                i6 = i4 - i16;
                i10 += (this.aq * 1462922907) * i16;
                i15 += i16 * i14;
            } else {
                i6 = i4;
            }
            i16 = i11 + i;
            if (i16 > this.ae * 428635993) {
                i16 -= this.ae * 428635993;
                i11 -= i16;
                i7 = i12 + i16;
            } else {
                i7 = i12;
            }
            if (i < this.ai * 1947951707) {
                int i17 = (this.ai * 1947951707) - i;
                i8 = i11 - i17;
                i16 = i10 + i17;
                i12 = i5 + (i13 * i17);
                i7 += i17;
            } else {
                i8 = i11;
                i16 = i10;
                i12 = i5;
            }
            hw.af(this.ad, eeVar.ad, 0, i12, i15, i16, i7, i8, i6, i13, i14, i9, 2131099657);
        }
    }

    public void dv(ee eeVar, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = eeVar.aq;
            int i10 = eeVar.ar;
            int i11 = eeVar.ai;
            int i12 = eeVar.ae;
            int i13 = (i11 << 16) / i3;
            int i14 = (i12 << 16) / i4;
            int i15 = 0;
            if (eeVar.al > 0) {
                i5 = (((eeVar.al << 16) + i13) - 1) / i13;
                i += i5;
                i5 = ((i5 * i13) - (eeVar.al << 16)) + 0;
            } else {
                i5 = 0;
            }
            if (eeVar.aj > 0) {
                i15 = (((eeVar.aj << 16) + i14) - 1) / i14;
                i2 += i15;
                i15 = ((i15 * i14) - (eeVar.aj << 16)) + 0;
            }
            i11 = i9 < i11 ? ((((i9 << 16) - i5) + i13) - 1) / i13 : i3;
            if (i10 < i12) {
                i4 = ((((i10 << 16) - i15) + i14) - 1) / i14;
            }
            i10 = ((this.aq * 1462922907) * i2) + i;
            i12 = (this.aq * 1462922907) - i11;
            int i16 = i2 + i4;
            if (i16 > this.aj * 157809585) {
                i4 -= i16 - (this.aj * 157809585);
            }
            if (i2 < this.al * -709973917) {
                i16 = (this.al * -709973917) - i2;
                i6 = i4 - i16;
                i10 += (this.aq * 1462922907) * i16;
                i15 += i16 * i14;
            } else {
                i6 = i4;
            }
            i16 = i11 + i;
            if (i16 > this.ae * 428635993) {
                i16 -= this.ae * 428635993;
                i11 -= i16;
                i7 = i12 + i16;
            } else {
                i7 = i12;
            }
            if (i < this.ai * 1947951707) {
                int i17 = (this.ai * 1947951707) - i;
                i8 = i11 - i17;
                i16 = i10 + i17;
                i12 = i5 + (i13 * i17);
                i7 += i17;
            } else {
                i8 = i11;
                i16 = i10;
                i12 = i5;
            }
            hw.af(this.ad, eeVar.ad, 0, i12, i15, i16, i7, i8, i6, i13, i14, i9, 2131099657);
        }
    }

    public void dx(ee eeVar, int i, int i2, int i3, int i4, int i5) {
        if (i3 > 0 && i4 > 0) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = eeVar.aq;
            int i11 = eeVar.ar;
            int i12 = eeVar.ai;
            int i13 = eeVar.ae;
            int i14 = (i12 << 16) / i3;
            int i15 = (i13 << 16) / i4;
            int i16 = 0;
            if (eeVar.al > 0) {
                i6 = (((eeVar.al << 16) + i14) - 1) / i14;
                i += i6;
                i6 = ((i6 * i14) - (eeVar.al << 16)) + 0;
            } else {
                i6 = 0;
            }
            if (eeVar.aj > 0) {
                i16 = (((eeVar.aj << 16) + i15) - 1) / i15;
                i2 += i16;
                i16 = ((i16 * i15) - (eeVar.aj << 16)) + 0;
            }
            i12 = i10 < i12 ? ((((i10 << 16) - i6) + i14) - 1) / i14 : i3;
            if (i11 < i13) {
                i4 = ((((i11 << 16) - i16) + i15) - 1) / i15;
            }
            i11 = ((this.aq * 1462922907) * i2) + i;
            i13 = (this.aq * 1462922907) - i12;
            int i17 = i2 + i4;
            if (i17 > this.aj * 157809585) {
                i4 -= i17 - (this.aj * 157809585);
            }
            if (i2 < this.al * -709973917) {
                i17 = (this.al * -709973917) - i2;
                i7 = i4 - i17;
                i11 += (this.aq * 1462922907) * i17;
                i16 += i17 * i15;
            } else {
                i7 = i4;
            }
            i17 = i + i12;
            if (i17 > this.ae * 428635993) {
                i17 -= this.ae * 428635993;
                i12 -= i17;
                i8 = i13 + i17;
            } else {
                i8 = i13;
            }
            if (i < this.ai * 1947951707) {
                int i18 = (this.ai * 1947951707) - i;
                i9 = i12 - i18;
                i17 = i11 + i18;
                i13 = i6 + (i18 * i14);
                i8 += i18;
            } else {
                i9 = i12;
                i17 = i11;
                i13 = i6;
            }
            ba.bd(this.ad, eeVar.ad, 0, i13, i16, i17, i8, i9, i7, i14, i15, i10, i5, (short) 2395);
        }
    }

    public void ea(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        int i8 = -i3;
        try {
            int i9 = i8 / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i11 = ((i10 * sin) + (i9 * cos)) + (i5 << 16);
            int i12 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i13 = ((this.aq * 1462922907) * i2) + i;
            i9 = 0;
            while (true) {
                int i14 = i9;
                if (i14 < i4) {
                    i10 = i12;
                    int i15 = i11;
                    i9 = i13;
                    for (int i16 = i8; i16 < 0; i16++) {
                        int i17 = eeVar.ad[(i15 >> 16) + (eeVar.aq * (i10 >> 16))];
                        if (i17 != 0) {
                            this.ad[i9] = i17;
                        }
                        i9++;
                        i15 += cos;
                        i10 -= sin;
                    }
                    i11 += sin;
                    i12 += cos;
                    i13 += this.aq * 1462922907;
                    i9 = i14 + 1;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
        }
    }

    public void ec(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        int i8 = -i3;
        try {
            int i9 = i8 / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i11 = ((i10 * sin) + (i9 * cos)) + (i5 << 16);
            int i12 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i13 = ((this.aq * -1671976014) * i2) + i;
            i9 = 0;
            while (true) {
                int i14 = i9;
                if (i14 < i4) {
                    i10 = i12;
                    int i15 = i11;
                    i9 = i13;
                    for (int i16 = i8; i16 < 0; i16++) {
                        int i17 = eeVar.ad[(i15 >> 16) + (eeVar.aq * (i10 >> 16))];
                        if (i17 != 0) {
                            this.ad[i9] = i17;
                        }
                        i9++;
                        i15 += cos;
                        i10 -= sin;
                    }
                    i11 += sin;
                    i12 += cos;
                    i13 += this.aq * -1480543399;
                    i9 = i14 + 1;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
        }
    }

    public void ed(ee eeVar, int i, int i2, int i3, int i4) {
        if (i3 > eeVar.ai || i4 > eeVar.ae) {
            throw new IllegalArgumentException();
        }
        int i5 = ((eeVar.al * i3) / eeVar.ai) + i;
        int i6 = (((eeVar.ai + ((eeVar.aq + eeVar.al) * i3)) - 1) / eeVar.ai) + i;
        int i7 = ((eeVar.aj * i4) / eeVar.ae) + i2;
        int i8 = (((eeVar.ae + ((eeVar.ar + eeVar.aj) * i4)) - 1) / eeVar.ae) + i2;
        if (i5 < this.ai * 1947951707) {
            i5 = this.ai * 1947951707;
        }
        if (i6 > this.ae * 428635993) {
            i6 = -30897102 * this.ae;
        }
        if (i7 < this.al * -2027914461) {
            i7 = 1612787127 * this.al;
        }
        int i9 = i8 > this.aj * 157809585 ? this.aj * 157809585 : i8;
        if (i5 < i6 && i7 < i9) {
            int i10 = ((this.aq * 1462922907) * i7) + i5;
            int i11 = this.aq;
            if (i10 < this.ad.length) {
                while (true) {
                    int i12 = i7;
                    if (i12 < i9) {
                        for (int i13 = i5; i13 < i6; i13++) {
                            i8 = (i13 - i) << 4;
                            int i14 = (i12 - i2) << 4;
                            i7 = ((eeVar.ai * i8) / i3) - (eeVar.al << 4);
                            int i15 = (((i8 + 16) * eeVar.ai) / i3) - (eeVar.al << 4);
                            i8 = ((eeVar.ae * i14) / i4) - (eeVar.aj << 4);
                            i14 = (((i14 + 16) * eeVar.ae) / i4) - (eeVar.aj << 4);
                            int i16 = ((i15 - i7) * (i14 - i8)) >> 1;
                            if (i16 == 0) {
                                i7 = i10;
                            } else {
                                int i17 = 0;
                                if (i7 < 0) {
                                    i7 = 0;
                                }
                                if (i15 >= (eeVar.aq << 4)) {
                                    i15 = eeVar.aq << 4;
                                }
                                if (i8 < 0) {
                                    i8 = 0;
                                }
                                if (i14 >= (eeVar.ar << 4)) {
                                    i14 = eeVar.ar << 4;
                                }
                                int i18 = i15 - 1;
                                int i19 = i14 - 1;
                                int i20 = i7 >> 4;
                                int i21 = i18 >> 4;
                                int i22 = i8 >> 4;
                                int i23 = i19 >> 4;
                                int i24 = 0;
                                int i25 = 0;
                                int i26 = 0;
                                int i27 = i22;
                                while (i27 <= i23) {
                                    i14 = i27 == i22 ? 16 - (i8 & 15) : 16;
                                    if (i23 == i27) {
                                        i14 = (i19 & 15) + 1;
                                    }
                                    int i28 = i20;
                                    while (i28 <= i21) {
                                        int i29 = eeVar.ad[(eeVar.aq * i27) + i28];
                                        if (i29 != 0) {
                                            i15 = i20 == i28 ? (16 - (i7 & 15)) * i14 : i21 == i28 ? ((i18 & 15) + 1) * i14 : i14 << 4;
                                            i24 += i15;
                                            i25 += ((i29 >> 16) & -462200877) * i15;
                                            i17 += ((i29 >> 8) & 844076152) * i15;
                                            i26 += i15 * (i29 & 910572516);
                                        }
                                        i28++;
                                        i17 = i17;
                                    }
                                    i27++;
                                }
                                if (i24 >= i16) {
                                    i7 = (((i17 / i24) << 8) + ((i25 / i24) << 16)) + (i26 / i24);
                                    if (i7 == 0) {
                                        i7 = 1;
                                    }
                                    this.ad[i10] = i7;
                                }
                                i7 = i10 + 1;
                            }
                            i10 = i7;
                        }
                        i10 += (-1088657880 * i11) - (i6 - i5);
                        i7 = i12 + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void eg(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7 = i - (eeVar.al << 4);
            int i8 = i2 - (eeVar.aj << 4);
            double d = ((double) (1447471415 & i5)) * 9.587379924285257E-5d;
            double d2 = (double) i6;
            int floor = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * d2) + 0.5d);
            int i9 = -i8;
            int i10 = floor * i9;
            int i11 = -i7;
            int i12 = i11 * floor2;
            int i13 = i10 + i12;
            i9 *= floor2;
            int i14 = (-i11) * floor;
            int i15 = i9 + i14;
            int i16 = (((eeVar.aq << 4) - i7) * floor2) + i10;
            int i17 = i9 + ((-((eeVar.aq << 4) - i7)) * floor);
            i11 = i12 + (((eeVar.ar << 4) - i8) * floor);
            i9 = (((eeVar.ar << 4) - i8) * floor2) + i14;
            i10 = (((eeVar.aq << 4) - i7) * floor2) + (((eeVar.ar << 4) - i8) * floor);
            floor = (floor * (-((eeVar.aq << 4) - i7))) + (floor2 * ((eeVar.ar << 4) - i8));
            if (i13 < i16) {
                i12 = i13;
                floor2 = i16;
            } else {
                i12 = i16;
                floor2 = i13;
            }
            if (i11 < i12) {
                i12 = i11;
            }
            if (i10 < i12) {
                i12 = i10;
            }
            if (i11 <= floor2) {
                i11 = floor2;
            }
            floor2 = i10 > i11 ? i10 : i11;
            if (i15 < i17) {
                i11 = i15;
                i10 = i17;
            } else {
                i11 = i17;
                i10 = i15;
            }
            if (i9 < i11) {
                i11 = i9;
            }
            if (floor < i11) {
                i11 = floor;
            }
            if (i9 <= i10) {
                i9 = i10;
            }
            if (floor <= i9) {
                floor = i9;
            }
            i9 = ((i12 >> 12) + i3) >> 4;
            i10 = ((((1629135938 + floor2) >> 12) + i3) + 15) >> 4;
            i11 = ((i11 >> 12) + i4) >> 4;
            i15 = ((((floor + 914673271) >> 12) + i4) + 15) >> 4;
            floor = i9 < this.ai * 1947951707 ? this.ai * 1947951707 : i9;
            i9 = i10 > this.ae * 230100404 ? this.ae * -1556813671 : i10;
            i10 = i11 < this.al * 1142286708 ? -22757908 * this.al : i11;
            i11 = i15 > this.aj * 157809585 ? this.aj * 157809585 : i15;
            i9 = floor - i9;
            if (i9 < 0) {
                i15 = i10 - i11;
                if (i15 < 0) {
                    i17 = ((this.aq * 1462922907) * i10) + floor;
                    double d3 = 1.6777216E7d / d2;
                    int floor3 = (int) Math.floor((Math.sin(d) * d3) + 0.5d);
                    int floor4 = (int) Math.floor((d3 * Math.cos(d)) + 0.5d);
                    int i18 = ((floor << 4) + 8) - i3;
                    floor = ((i10 << 4) + 8) - i4;
                    floor2 = (i7 << 8) - ((floor3 * floor) >> 4);
                    i16 = ((floor * floor4) >> 4) + (i8 << 8);
                    if (floor4 == 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            while (i15 < 0) {
                                if (floor2 >= 0 && i16 >= 0 && floor2 - (eeVar.aq << 12) < 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i11;
                                    for (i10 = i9; i10 < 0; i10++) {
                                        i17 = eeVar.ad[(eeVar.aq * (i16 >> 12)) + (floor2 >> 12)];
                                        if (i17 != 0) {
                                            this.ad[floor] = i17;
                                        }
                                        floor++;
                                    }
                                }
                                i15++;
                                i11 += this.aq * -1921607761;
                            }
                        } else if (floor3 < 0) {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((floor3 * i18) >> 4) + i16;
                                if (floor2 >= 0 && floor2 - (eeVar.aq << 12) < 0) {
                                    floor = i15 - (eeVar.ar << 12);
                                    if (floor >= 0) {
                                        i10 = (floor3 - floor) / floor3;
                                        floor = i9 + i10;
                                        i15 += floor3 * i10;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (i15 - floor3) / floor3;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(floor2 >> 12) + (eeVar.aq * (i15 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor3;
                                        i17++;
                                        i10++;
                                    }
                                }
                                floor2 -= floor3;
                                i11 += this.aq * 1462922907;
                            }
                        } else {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((i18 * floor3) >> 4) + i16;
                                if (floor2 >= 0 && floor2 - (eeVar.aq << 12) < 0) {
                                    if (i15 < 0) {
                                        i10 = ((floor3 - 1) - i15) / floor3;
                                        floor = i9 + i10;
                                        i15 += floor3 * i10;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (((i15 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(floor2 >> 12) + (eeVar.aq * (i15 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor3;
                                        i17++;
                                        i10++;
                                    }
                                }
                                floor2 -= floor3;
                                i11 += this.aq * 1462922907;
                            }
                        }
                    } else if (floor4 < 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((floor4 * i18) >> 4) + floor2;
                                if (i16 >= 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i15 - (eeVar.aq << 12);
                                    if (floor >= 0) {
                                        i10 = (floor4 - floor) / floor4;
                                        floor = i9 + i10;
                                        i15 += i10 * floor4;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (i15 - floor4) / floor4;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(i15 >> 12) + (eeVar.aq * (i16 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor4;
                                        i17++;
                                        i10++;
                                    }
                                }
                                i16 += floor4;
                                i11 += this.aq * 1462922907;
                            }
                        } else if (floor3 < 0) {
                            i13 = floor2;
                            i10 = i9;
                            for (i7 = i15; i7 < 0; i7++) {
                                floor = ((i18 * floor4) >> 4) + i13;
                                i11 = ((i18 * floor3) >> 4) + i16;
                                i9 = floor - (eeVar.aq << 12);
                                if (i9 >= 0) {
                                    i15 = (floor4 - i9) / floor4;
                                    i9 = i10 + i15;
                                    floor += floor4 * i15;
                                    i11 += i15 * floor3;
                                    i15 += i17;
                                } else {
                                    i9 = i10;
                                    i15 = i17;
                                }
                                floor2 = (floor - floor4) / floor4;
                                if (floor2 > i9) {
                                    i9 = floor2;
                                }
                                floor2 = i11 - (eeVar.ar << 12);
                                if (floor2 >= 0) {
                                    floor2 = (floor3 - floor2) / floor3;
                                    i9 += floor2;
                                    floor += floor4 * floor2;
                                    i11 += floor3 * floor2;
                                    i15 += floor2;
                                }
                                i12 = (i11 - floor3) / floor3;
                                if (i12 > i9) {
                                    floor2 = floor;
                                } else {
                                    floor2 = floor;
                                    i12 = i9;
                                }
                                while (i12 < 0) {
                                    floor = eeVar.ad[(floor2 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                    if (floor != 0) {
                                        this.ad[i15] = floor;
                                    }
                                    i11 += floor3;
                                    i12++;
                                    i15++;
                                    floor2 += floor4;
                                }
                                i16 += floor4;
                                i17 += this.aq * 273949113;
                                i13 -= floor3;
                            }
                        } else {
                            i12 = i15;
                            i13 = floor2;
                            while (i12 < 0) {
                                i10 = ((floor4 * i18) >> 4) + i13;
                                i11 = ((floor3 * i18) >> 4) + i16;
                                floor = i10 - (eeVar.aq << 12);
                                if (floor >= 0) {
                                    i15 = (floor4 - floor) / floor4;
                                    floor = i9 + i15;
                                    i10 += floor4 * i15;
                                    i11 += floor3 * i15;
                                    i15 += i17;
                                } else {
                                    floor = i9;
                                    i15 = i17;
                                }
                                floor2 = (i10 - floor4) / floor4;
                                if (floor2 > floor) {
                                    floor = floor2;
                                }
                                if (i11 < 0) {
                                    floor2 = ((floor3 - 1) - i11) / floor3;
                                    floor += floor2;
                                    i10 += floor4 * floor2;
                                    i11 += floor3 * floor2;
                                    i15 += floor2;
                                }
                                floor2 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                if (floor2 <= floor) {
                                    floor2 = floor;
                                }
                                while (floor2 < 0) {
                                    floor = eeVar.ad[(i10 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                    if (floor != 0) {
                                        this.ad[i15] = floor;
                                    }
                                    i10 += floor4;
                                    i11 += floor3;
                                    floor2++;
                                    i15++;
                                }
                                i16 += floor4;
                                i17 += this.aq * 1462922907;
                                i12++;
                                i13 -= floor3;
                            }
                        }
                    } else if (floor3 == 0) {
                        i10 = i17;
                        for (i12 = i15; i12 < 0; i12++) {
                            i11 = ((floor4 * i18) >> 4) + floor2;
                            if (i16 >= 0 && i16 - (eeVar.ar << 12) < 0) {
                                if (i11 < 0) {
                                    floor = ((floor4 - 1) - i11) / floor4;
                                    i15 = i9 + floor;
                                    i11 += floor4 * floor;
                                    floor += i10;
                                } else {
                                    floor = i10;
                                    i15 = i9;
                                }
                                i17 = (((i11 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                                if (i17 > i15) {
                                    i15 = i17;
                                }
                                while (i15 < 0) {
                                    i17 = eeVar.ad[((i16 >> 12) * eeVar.aq) + (i11 >> 12)];
                                    if (i17 != 0) {
                                        this.ad[floor] = i17;
                                    }
                                    floor++;
                                    i11 += floor4;
                                    i15++;
                                }
                            }
                            i16 += floor4;
                            i10 += this.aq * 1462922907;
                        }
                    } else if (floor3 < 0) {
                        i7 = i15;
                        i8 = floor2;
                        i13 = i18;
                        while (i7 < 0) {
                            floor = ((floor4 * i13) >> 4) + i8;
                            i11 = ((floor3 * i13) >> 4) + i16;
                            if (floor < 0) {
                                i15 = ((floor4 - 1) - floor) / floor4;
                                i10 = i9 + i15;
                                floor += i15 * floor4;
                                i11 += i15 * floor3;
                                i15 += i17;
                            } else {
                                i10 = i9;
                                i15 = i17;
                            }
                            floor2 = (((floor + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                            if (floor2 > i10) {
                                i10 = floor2;
                            }
                            floor2 = i11 - (eeVar.ar << 12);
                            if (floor2 >= 0) {
                                floor2 = (floor3 - floor2) / floor3;
                                i10 += floor2;
                                floor += floor4 * floor2;
                                i11 += floor2 * floor3;
                                i15 += floor2;
                            }
                            i12 = (i11 - floor3) / floor3;
                            if (i12 > i10) {
                                floor2 = floor;
                            } else {
                                floor2 = floor;
                                i12 = i10;
                            }
                            while (i12 < 0) {
                                floor = eeVar.ad[(floor2 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                if (floor != 0) {
                                    this.ad[i15] = floor;
                                }
                                i11 += floor3;
                                i12++;
                                i15++;
                                floor2 += floor4;
                            }
                            i16 += floor4;
                            i17 += this.aq * 1462922907;
                            i7++;
                            i8 -= floor3;
                        }
                    } else {
                        i12 = i15;
                        i13 = floor2;
                        while (i12 < 0) {
                            i10 = ((floor4 * i18) >> 4) + i13;
                            i11 = ((floor3 * i18) >> 4) + i16;
                            if (i10 < 0) {
                                i15 = ((floor4 - 1) - i10) / floor4;
                                floor = i9 + i15;
                                i10 += i15 * floor4;
                                i11 += floor3 * i15;
                                i15 += i17;
                            } else {
                                floor = i9;
                                i15 = i17;
                            }
                            floor2 = (((i10 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                            if (floor2 > floor) {
                                floor = floor2;
                            }
                            if (i11 < 0) {
                                floor2 = ((floor3 - 1) - i11) / floor3;
                                floor += floor2;
                                i10 += floor4 * floor2;
                                i11 += floor2 * floor3;
                                i15 += floor2;
                            }
                            floor2 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                            if (floor2 <= floor) {
                                floor2 = floor;
                            }
                            while (floor2 < 0) {
                                floor = eeVar.ad[((i11 >> 12) * eeVar.aq) + (i10 >> 12)];
                                if (floor != 0) {
                                    this.ad[i15] = floor;
                                }
                                i10 += floor4;
                                i11 += floor3;
                                floor2++;
                                i15++;
                            }
                            i17 += this.aq * 1289621866;
                            i12++;
                            i13 -= floor3;
                            i16 += floor4;
                        }
                    }
                }
            }
        }
    }

    public void eh(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            double d = ((double) i7) / 326.11d;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i8) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i8) >> 8;
            int i11 = (i5 << 16) + ((i9 * cos) + (sin * i10));
            i10 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i12 = i + ((this.aq * 959372713) * i2);
            i9 = 0;
            while (true) {
                int i13 = i11;
                int i14 = i9;
                int i15 = i10;
                int i16 = i12;
                if (i14 < i4) {
                    i11 = iArr[i14];
                    i10 = i11 + i16;
                    i9 = (i11 * cos) + i13;
                    i12 = i15 - (i11 * sin);
                    i11 = -iArr2[i14];
                    while (i11 < 0) {
                        this.ad[i10] = eeVar.ad[((i12 >> 16) * eeVar.aq) + (i9 >> 16)];
                        i9 += cos;
                        i12 -= sin;
                        i11++;
                        i10++;
                    }
                    i11 = i13 + sin;
                    i10 = i15 + cos;
                    i12 = i16 + (this.aq * 1462922907);
                    i9 = i14 + 1;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ei(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7 = i - (eeVar.al << 4);
            int i8 = i2 - (eeVar.aj << 4);
            double d = ((double) (SupportMenu.USER_MASK & i5)) * 9.587379924285257E-5d;
            double d2 = (double) i6;
            int floor = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * d2) + 0.5d);
            int i9 = -i8;
            int i10 = floor * i9;
            int i11 = -i7;
            int i12 = i11 * floor2;
            int i13 = i10 + i12;
            i9 *= floor2;
            int i14 = (-i11) * floor;
            int i15 = i9 + i14;
            int i16 = (((eeVar.aq << 4) - i7) * floor2) + i10;
            int i17 = i9 + ((-((eeVar.aq << 4) - i7)) * floor);
            i11 = i12 + (((eeVar.ar << 4) - i8) * floor);
            i9 = (((eeVar.ar << 4) - i8) * floor2) + i14;
            i10 = (((eeVar.aq << 4) - i7) * floor2) + (((eeVar.ar << 4) - i8) * floor);
            floor = (floor * (-((eeVar.aq << 4) - i7))) + (floor2 * ((eeVar.ar << 4) - i8));
            if (i13 < i16) {
                i12 = i13;
                floor2 = i16;
            } else {
                i12 = i16;
                floor2 = i13;
            }
            if (i11 < i12) {
                i12 = i11;
            }
            if (i10 < i12) {
                i12 = i10;
            }
            if (i11 <= floor2) {
                i11 = floor2;
            }
            floor2 = i10 > i11 ? i10 : i11;
            if (i15 < i17) {
                i11 = i15;
                i10 = i17;
            } else {
                i11 = i17;
                i10 = i15;
            }
            if (i9 < i11) {
                i11 = i9;
            }
            if (floor < i11) {
                i11 = floor;
            }
            if (i9 <= i10) {
                i9 = i10;
            }
            if (floor <= i9) {
                floor = i9;
            }
            i9 = ((i12 >> 12) + i3) >> 4;
            i10 = ((((812806580 + floor2) >> 12) + i3) + 15) >> 4;
            i11 = ((i11 >> 12) + i4) >> 4;
            i15 = ((((floor + 937747598) >> 12) + i4) + 15) >> 4;
            floor = i9 < this.ai * -612418404 ? this.ai * -580168581 : i9;
            i9 = i10 > this.ae * 428635993 ? this.ae * 428635993 : i10;
            i10 = i11 < this.al * -1344288028 ? -709973917 * this.al : i11;
            i11 = i15 > this.aj * 157809585 ? this.aj * 157809585 : i15;
            i9 = floor - i9;
            if (i9 < 0) {
                i15 = i10 - i11;
                if (i15 < 0) {
                    i17 = ((this.aq * 1462922907) * i10) + floor;
                    double d3 = 1.6777216E7d / d2;
                    int floor3 = (int) Math.floor((Math.sin(d) * d3) + 0.5d);
                    int floor4 = (int) Math.floor((d3 * Math.cos(d)) + 0.5d);
                    int i18 = ((floor << 4) + 8) - i3;
                    floor = ((i10 << 4) + 8) - i4;
                    floor2 = (i7 << 8) - ((floor3 * floor) >> 4);
                    i16 = ((floor * floor4) >> 4) + (i8 << 8);
                    if (floor4 == 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            while (i15 < 0) {
                                if (floor2 >= 0 && i16 >= 0 && floor2 - (eeVar.aq << 12) < 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i11;
                                    for (i10 = i9; i10 < 0; i10++) {
                                        i17 = eeVar.ad[(eeVar.aq * (i16 >> 12)) + (floor2 >> 12)];
                                        if (i17 != 0) {
                                            this.ad[floor] = i17;
                                        }
                                        floor++;
                                    }
                                }
                                i15++;
                                i11 += this.aq * 1462922907;
                            }
                        } else if (floor3 < 0) {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((floor3 * i18) >> 4) + i16;
                                if (floor2 >= 0 && floor2 - (eeVar.aq << 12) < 0) {
                                    floor = i15 - (eeVar.ar << 12);
                                    if (floor >= 0) {
                                        i10 = (floor3 - floor) / floor3;
                                        floor = i9 + i10;
                                        i15 += floor3 * i10;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (i15 - floor3) / floor3;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(floor2 >> 12) + (eeVar.aq * (i15 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor3;
                                        i17++;
                                        i10++;
                                    }
                                }
                                floor2 -= floor3;
                                i11 += this.aq * -649534650;
                            }
                        } else {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((i18 * floor3) >> 4) + i16;
                                if (floor2 >= 0 && floor2 - (eeVar.aq << 12) < 0) {
                                    if (i15 < 0) {
                                        i10 = ((floor3 - 1) - i15) / floor3;
                                        floor = i9 + i10;
                                        i15 += floor3 * i10;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (((i15 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(floor2 >> 12) + (eeVar.aq * (i15 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor3;
                                        i17++;
                                        i10++;
                                    }
                                }
                                floor2 -= floor3;
                                i11 += this.aq * 1462922907;
                            }
                        }
                    } else if (floor4 < 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((floor4 * i18) >> 4) + floor2;
                                if (i16 >= 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i15 - (eeVar.aq << 12);
                                    if (floor >= 0) {
                                        i10 = (floor4 - floor) / floor4;
                                        floor = i9 + i10;
                                        i15 += i10 * floor4;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (i15 - floor4) / floor4;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(i15 >> 12) + (eeVar.aq * (i16 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor4;
                                        i17++;
                                        i10++;
                                    }
                                }
                                i16 += floor4;
                                i11 += this.aq * -640738854;
                            }
                        } else if (floor3 < 0) {
                            i12 = i15;
                            i13 = floor2;
                            while (i12 < 0) {
                                i10 = ((i18 * floor4) >> 4) + i13;
                                i11 = ((i18 * floor3) >> 4) + i16;
                                floor = i10 - (eeVar.aq << 12);
                                if (floor >= 0) {
                                    i15 = (floor4 - floor) / floor4;
                                    floor = i9 + i15;
                                    i10 += floor4 * i15;
                                    i11 += i15 * floor3;
                                    i15 += i17;
                                } else {
                                    floor = i9;
                                    i15 = i17;
                                }
                                floor2 = (i10 - floor4) / floor4;
                                if (floor2 > floor) {
                                    floor = floor2;
                                }
                                floor2 = i11 - (eeVar.ar << 12);
                                if (floor2 >= 0) {
                                    floor2 = (floor3 - floor2) / floor3;
                                    floor += floor2;
                                    i10 += floor4 * floor2;
                                    i11 += floor3 * floor2;
                                    i15 += floor2;
                                }
                                floor2 = (i11 - floor3) / floor3;
                                if (floor2 <= floor) {
                                    floor2 = floor;
                                }
                                while (floor2 < 0) {
                                    floor = eeVar.ad[(i10 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                    if (floor != 0) {
                                        this.ad[i15] = floor;
                                    }
                                    i10 += floor4;
                                    i11 += floor3;
                                    floor2++;
                                    i15++;
                                }
                                i16 += floor4;
                                i17 += this.aq * 1462922907;
                                i12++;
                                i13 -= floor3;
                            }
                        } else {
                            i13 = i15;
                            i7 = floor2;
                            i10 = i9;
                            while (i13 < 0) {
                                floor = ((floor4 * i18) >> 4) + i7;
                                i11 = ((floor3 * i18) >> 4) + i16;
                                i9 = floor - (eeVar.aq << 12);
                                if (i9 >= 0) {
                                    i15 = (floor4 - i9) / floor4;
                                    i9 = i10 + i15;
                                    floor += floor4 * i15;
                                    i11 += floor3 * i15;
                                    i15 += i17;
                                } else {
                                    i9 = i10;
                                    i15 = i17;
                                }
                                floor2 = (floor - floor4) / floor4;
                                if (floor2 > i9) {
                                    i9 = floor2;
                                }
                                if (i11 < 0) {
                                    floor2 = ((floor3 - 1) - i11) / floor3;
                                    i9 += floor2;
                                    floor += floor4 * floor2;
                                    i11 += floor3 * floor2;
                                    i15 += floor2;
                                }
                                i12 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                if (i12 > i9) {
                                    floor2 = floor;
                                } else {
                                    floor2 = floor;
                                    i12 = i9;
                                }
                                while (i12 < 0) {
                                    floor = eeVar.ad[(floor2 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                    if (floor != 0) {
                                        this.ad[i15] = floor;
                                    }
                                    i11 += floor3;
                                    i12++;
                                    floor2 += floor4;
                                    i15++;
                                }
                                i16 += floor4;
                                i17 += this.aq * -426889177;
                                i13++;
                                i7 -= floor3;
                            }
                        }
                    } else if (floor3 == 0) {
                        i10 = i17;
                        for (i12 = i15; i12 < 0; i12++) {
                            i11 = ((floor4 * i18) >> 4) + floor2;
                            if (i16 >= 0 && i16 - (eeVar.ar << 12) < 0) {
                                if (i11 < 0) {
                                    floor = ((floor4 - 1) - i11) / floor4;
                                    i15 = i9 + floor;
                                    i11 += floor4 * floor;
                                    floor += i10;
                                } else {
                                    floor = i10;
                                    i15 = i9;
                                }
                                i17 = (((i11 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                                if (i17 > i15) {
                                    i15 = i17;
                                }
                                while (i15 < 0) {
                                    i17 = eeVar.ad[((i16 >> 12) * eeVar.aq) + (i11 >> 12)];
                                    if (i17 != 0) {
                                        this.ad[floor] = i17;
                                    }
                                    floor++;
                                    i11 += floor4;
                                    i15++;
                                }
                            }
                            i16 += floor4;
                            i10 += this.aq * -899556456;
                        }
                    } else if (floor3 < 0) {
                        i7 = i15;
                        i8 = floor2;
                        i13 = i18;
                        while (i7 < 0) {
                            floor = ((floor4 * i13) >> 4) + i8;
                            i11 = ((floor3 * i13) >> 4) + i16;
                            if (floor < 0) {
                                i15 = ((floor4 - 1) - floor) / floor4;
                                i10 = i9 + i15;
                                floor += i15 * floor4;
                                i11 += i15 * floor3;
                                i15 += i17;
                            } else {
                                i10 = i9;
                                i15 = i17;
                            }
                            floor2 = (((floor + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                            if (floor2 > i10) {
                                i10 = floor2;
                            }
                            floor2 = i11 - (eeVar.ar << 12);
                            if (floor2 >= 0) {
                                floor2 = (floor3 - floor2) / floor3;
                                i10 += floor2;
                                floor += floor4 * floor2;
                                i11 += floor2 * floor3;
                                i15 += floor2;
                            }
                            i12 = (i11 - floor3) / floor3;
                            if (i12 > i10) {
                                floor2 = floor;
                            } else {
                                floor2 = floor;
                                i12 = i10;
                            }
                            while (i12 < 0) {
                                floor = eeVar.ad[(floor2 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                if (floor != 0) {
                                    this.ad[i15] = floor;
                                }
                                i11 += floor3;
                                i12++;
                                i15++;
                                floor2 += floor4;
                            }
                            i16 += floor4;
                            i17 += this.aq * 1462922907;
                            i7++;
                            i8 -= floor3;
                        }
                    } else {
                        i12 = i15;
                        i13 = floor2;
                        while (i12 < 0) {
                            i10 = ((floor4 * i18) >> 4) + i13;
                            i11 = ((floor3 * i18) >> 4) + i16;
                            if (i10 < 0) {
                                i15 = ((floor4 - 1) - i10) / floor4;
                                floor = i9 + i15;
                                i10 += i15 * floor4;
                                i11 += floor3 * i15;
                                i15 += i17;
                            } else {
                                floor = i9;
                                i15 = i17;
                            }
                            floor2 = (((i10 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                            if (floor2 > floor) {
                                floor = floor2;
                            }
                            if (i11 < 0) {
                                floor2 = ((floor3 - 1) - i11) / floor3;
                                floor += floor2;
                                i10 += floor4 * floor2;
                                i11 += floor2 * floor3;
                                i15 += floor2;
                            }
                            floor2 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                            if (floor2 <= floor) {
                                floor2 = floor;
                            }
                            while (floor2 < 0) {
                                floor = eeVar.ad[((i11 >> 12) * eeVar.aq) + (i10 >> 12)];
                                if (floor != 0) {
                                    this.ad[i15] = floor;
                                }
                                i10 += floor4;
                                i11 += floor3;
                                floor2++;
                                i15++;
                            }
                            i17 += this.aq * 1462922907;
                            i12++;
                            i13 -= floor3;
                            i16 += floor4;
                        }
                    }
                }
            }
        }
    }

    public void ek(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        int i8 = -i3;
        try {
            int i9 = i8 / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i7) >> 8;
            int i11 = ((i10 * sin) + (i9 * cos)) + (i5 << 16);
            int i12 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i13 = ((this.aq * 1462922907) * i2) + i;
            i9 = 0;
            while (true) {
                int i14 = i9;
                if (i14 < i4) {
                    i10 = i12;
                    int i15 = i11;
                    i9 = i13;
                    for (int i16 = i8; i16 < 0; i16++) {
                        int i17 = eeVar.ad[(i15 >> 16) + (eeVar.aq * (i10 >> 16))];
                        if (i17 != 0) {
                            this.ad[i9] = i17;
                        }
                        i9++;
                        i15 += cos;
                        i10 -= sin;
                    }
                    i11 += sin;
                    i12 += cos;
                    i13 += this.aq * 1462922907;
                    i9 = i14 + 1;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void en(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7 = i - (eeVar.al << 4);
            int i8 = i2 - (eeVar.aj << 4);
            double d = ((double) (SupportMenu.USER_MASK & i5)) * 9.587379924285257E-5d;
            double d2 = (double) i6;
            int floor = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * d2) + 0.5d);
            int i9 = -i8;
            int i10 = floor * i9;
            int i11 = -i7;
            int i12 = i11 * floor2;
            int i13 = i10 + i12;
            i9 *= floor2;
            int i14 = (-i11) * floor;
            int i15 = i9 + i14;
            int i16 = (((eeVar.aq << 4) - i7) * floor2) + i10;
            int i17 = i9 + ((-((eeVar.aq << 4) - i7)) * floor);
            i11 = i12 + (((eeVar.ar << 4) - i8) * floor);
            i9 = (((eeVar.ar << 4) - i8) * floor2) + i14;
            i10 = (((eeVar.aq << 4) - i7) * floor2) + (((eeVar.ar << 4) - i8) * floor);
            floor = (floor * (-((eeVar.aq << 4) - i7))) + (floor2 * ((eeVar.ar << 4) - i8));
            if (i13 < i16) {
                i12 = i13;
                floor2 = i16;
            } else {
                i12 = i16;
                floor2 = i13;
            }
            if (i11 < i12) {
                i12 = i11;
            }
            if (i10 < i12) {
                i12 = i10;
            }
            if (i11 <= floor2) {
                i11 = floor2;
            }
            floor2 = i10 > i11 ? i10 : i11;
            if (i15 < i17) {
                i11 = i15;
                i10 = i17;
            } else {
                i11 = i17;
                i10 = i15;
            }
            if (i9 < i11) {
                i11 = i9;
            }
            if (floor < i11) {
                i11 = floor;
            }
            if (i9 <= i10) {
                i9 = i10;
            }
            if (floor <= i9) {
                floor = i9;
            }
            i9 = ((i12 >> 12) + i3) >> 4;
            i10 = ((((floor2 + 4095) >> 12) + i3) + 15) >> 4;
            i11 = ((i11 >> 12) + i4) >> 4;
            i15 = ((((floor + 4095) >> 12) + i4) + 15) >> 4;
            floor = i9 < this.ai * 1947951707 ? this.ai * 1947951707 : i9;
            i9 = i10 > this.ae * 428635993 ? this.ae * 428635993 : i10;
            i10 = i11 < this.al * -709973917 ? this.al * -709973917 : i11;
            i11 = i15 > this.aj * 157809585 ? this.aj * 157809585 : i15;
            i9 = floor - i9;
            if (i9 < 0) {
                i15 = i10 - i11;
                if (i15 < 0) {
                    i17 = ((this.aq * 1462922907) * i10) + floor;
                    double d3 = 1.6777216E7d / d2;
                    int floor3 = (int) Math.floor((Math.sin(d) * d3) + 0.5d);
                    int floor4 = (int) Math.floor((d3 * Math.cos(d)) + 0.5d);
                    int i18 = ((floor << 4) + 8) - i3;
                    floor = ((i10 << 4) + 8) - i4;
                    floor2 = (i7 << 8) - ((floor3 * floor) >> 4);
                    i16 = ((floor * floor4) >> 4) + (i8 << 8);
                    if (floor4 == 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            while (i15 < 0) {
                                if (floor2 >= 0 && i16 >= 0 && floor2 - (eeVar.aq << 12) < 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i11;
                                    for (i10 = i9; i10 < 0; i10++) {
                                        i17 = eeVar.ad[(eeVar.aq * (i16 >> 12)) + (floor2 >> 12)];
                                        if (i17 != 0) {
                                            this.ad[floor] = i17;
                                        }
                                        floor++;
                                    }
                                }
                                i15++;
                                i11 += this.aq * 1462922907;
                            }
                        } else if (floor3 < 0) {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((floor3 * i18) >> 4) + i16;
                                if (floor2 >= 0 && floor2 - (eeVar.aq << 12) < 0) {
                                    floor = i15 - (eeVar.ar << 12);
                                    if (floor >= 0) {
                                        i10 = (floor3 - floor) / floor3;
                                        floor = i9 + i10;
                                        i15 += floor3 * i10;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (i15 - floor3) / floor3;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(floor2 >> 12) + (eeVar.aq * (i15 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor3;
                                        i17++;
                                        i10++;
                                    }
                                }
                                floor2 -= floor3;
                                i11 += this.aq * 1462922907;
                            }
                        } else {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((i18 * floor3) >> 4) + i16;
                                if (floor2 >= 0 && floor2 - (eeVar.aq << 12) < 0) {
                                    if (i15 < 0) {
                                        i10 = ((floor3 - 1) - i15) / floor3;
                                        floor = i9 + i10;
                                        i15 += floor3 * i10;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (((i15 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(floor2 >> 12) + (eeVar.aq * (i15 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor3;
                                        i17++;
                                        i10++;
                                    }
                                }
                                floor2 -= floor3;
                                i11 += this.aq * 1462922907;
                            }
                        }
                    } else if (floor4 < 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((floor4 * i18) >> 4) + floor2;
                                if (i16 >= 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i15 - (eeVar.aq << 12);
                                    if (floor >= 0) {
                                        i10 = (floor4 - floor) / floor4;
                                        floor = i9 + i10;
                                        i15 += i10 * floor4;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (i15 - floor4) / floor4;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(i15 >> 12) + (eeVar.aq * (i16 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor4;
                                        i17++;
                                        i10++;
                                    }
                                }
                                i16 += floor4;
                                i11 += this.aq * 1462922907;
                            }
                        } else if (floor3 < 0) {
                            i12 = i15;
                            i13 = floor2;
                            while (i12 < 0) {
                                i10 = ((i18 * floor4) >> 4) + i13;
                                i11 = ((i18 * floor3) >> 4) + i16;
                                floor = i10 - (eeVar.aq << 12);
                                if (floor >= 0) {
                                    i15 = (floor4 - floor) / floor4;
                                    floor = i9 + i15;
                                    i10 += floor4 * i15;
                                    i11 += i15 * floor3;
                                    i15 += i17;
                                } else {
                                    floor = i9;
                                    i15 = i17;
                                }
                                floor2 = (i10 - floor4) / floor4;
                                if (floor2 > floor) {
                                    floor = floor2;
                                }
                                floor2 = i11 - (eeVar.ar << 12);
                                if (floor2 >= 0) {
                                    floor2 = (floor3 - floor2) / floor3;
                                    floor += floor2;
                                    i10 += floor4 * floor2;
                                    i11 += floor3 * floor2;
                                    i15 += floor2;
                                }
                                floor2 = (i11 - floor3) / floor3;
                                if (floor2 <= floor) {
                                    floor2 = floor;
                                }
                                while (floor2 < 0) {
                                    floor = eeVar.ad[(i10 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                    if (floor != 0) {
                                        this.ad[i15] = floor;
                                    }
                                    i10 += floor4;
                                    i11 += floor3;
                                    floor2++;
                                    i15++;
                                }
                                i16 += floor4;
                                i17 += this.aq * 1462922907;
                                i12++;
                                i13 -= floor3;
                            }
                        } else {
                            i13 = i15;
                            i7 = floor2;
                            i10 = i9;
                            while (i13 < 0) {
                                floor = ((floor4 * i18) >> 4) + i7;
                                i11 = ((floor3 * i18) >> 4) + i16;
                                i9 = floor - (eeVar.aq << 12);
                                if (i9 >= 0) {
                                    i15 = (floor4 - i9) / floor4;
                                    i9 = i10 + i15;
                                    floor += floor4 * i15;
                                    i11 += floor3 * i15;
                                    i15 += i17;
                                } else {
                                    i9 = i10;
                                    i15 = i17;
                                }
                                floor2 = (floor - floor4) / floor4;
                                if (floor2 > i9) {
                                    i9 = floor2;
                                }
                                if (i11 < 0) {
                                    floor2 = ((floor3 - 1) - i11) / floor3;
                                    i9 += floor2;
                                    floor += floor4 * floor2;
                                    i11 += floor3 * floor2;
                                    i15 += floor2;
                                }
                                i12 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                if (i12 > i9) {
                                    floor2 = floor;
                                } else {
                                    floor2 = floor;
                                    i12 = i9;
                                }
                                while (i12 < 0) {
                                    floor = eeVar.ad[(floor2 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                    if (floor != 0) {
                                        this.ad[i15] = floor;
                                    }
                                    i11 += floor3;
                                    i12++;
                                    floor2 += floor4;
                                    i15++;
                                }
                                i16 += floor4;
                                i17 += this.aq * 1462922907;
                                i13++;
                                i7 -= floor3;
                            }
                        }
                    } else if (floor3 == 0) {
                        i10 = i17;
                        for (i12 = i15; i12 < 0; i12++) {
                            i11 = ((floor4 * i18) >> 4) + floor2;
                            if (i16 >= 0 && i16 - (eeVar.ar << 12) < 0) {
                                if (i11 < 0) {
                                    floor = ((floor4 - 1) - i11) / floor4;
                                    i15 = i9 + floor;
                                    i11 += floor4 * floor;
                                    floor += i10;
                                } else {
                                    floor = i10;
                                    i15 = i9;
                                }
                                i17 = (((i11 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                                if (i17 > i15) {
                                    i15 = i17;
                                }
                                while (i15 < 0) {
                                    i17 = eeVar.ad[((i16 >> 12) * eeVar.aq) + (i11 >> 12)];
                                    if (i17 != 0) {
                                        this.ad[floor] = i17;
                                    }
                                    floor++;
                                    i11 += floor4;
                                    i15++;
                                }
                            }
                            i16 += floor4;
                            i10 += this.aq * 1462922907;
                        }
                    } else if (floor3 < 0) {
                        i7 = i15;
                        i8 = floor2;
                        i13 = i18;
                        while (i7 < 0) {
                            floor = ((floor4 * i13) >> 4) + i8;
                            i11 = ((floor3 * i13) >> 4) + i16;
                            if (floor < 0) {
                                i15 = ((floor4 - 1) - floor) / floor4;
                                i10 = i9 + i15;
                                floor += i15 * floor4;
                                i11 += i15 * floor3;
                                i15 += i17;
                            } else {
                                i10 = i9;
                                i15 = i17;
                            }
                            floor2 = (((floor + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                            if (floor2 > i10) {
                                i10 = floor2;
                            }
                            floor2 = i11 - (eeVar.ar << 12);
                            if (floor2 >= 0) {
                                floor2 = (floor3 - floor2) / floor3;
                                i10 += floor2;
                                floor += floor4 * floor2;
                                i11 += floor2 * floor3;
                                i15 += floor2;
                            }
                            i12 = (i11 - floor3) / floor3;
                            if (i12 > i10) {
                                floor2 = floor;
                            } else {
                                floor2 = floor;
                                i12 = i10;
                            }
                            while (i12 < 0) {
                                floor = eeVar.ad[(floor2 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                if (floor != 0) {
                                    this.ad[i15] = floor;
                                }
                                i11 += floor3;
                                i12++;
                                i15++;
                                floor2 += floor4;
                            }
                            i16 += floor4;
                            i17 += this.aq * 1462922907;
                            i7++;
                            i8 -= floor3;
                        }
                    } else {
                        i12 = i15;
                        i13 = floor2;
                        while (i12 < 0) {
                            i10 = ((floor4 * i18) >> 4) + i13;
                            i11 = ((floor3 * i18) >> 4) + i16;
                            if (i10 < 0) {
                                i15 = ((floor4 - 1) - i10) / floor4;
                                floor = i9 + i15;
                                i10 += i15 * floor4;
                                i11 += floor3 * i15;
                                i15 += i17;
                            } else {
                                floor = i9;
                                i15 = i17;
                            }
                            floor2 = (((i10 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                            if (floor2 > floor) {
                                floor = floor2;
                            }
                            if (i11 < 0) {
                                floor2 = ((floor3 - 1) - i11) / floor3;
                                floor += floor2;
                                i10 += floor4 * floor2;
                                i11 += floor2 * floor3;
                                i15 += floor2;
                            }
                            floor2 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                            if (floor2 <= floor) {
                                floor2 = floor;
                            }
                            while (floor2 < 0) {
                                floor = eeVar.ad[((i11 >> 12) * eeVar.aq) + (i10 >> 12)];
                                if (floor != 0) {
                                    this.ad[i15] = floor;
                                }
                                i10 += floor4;
                                i11 += floor3;
                                floor2++;
                                i15++;
                            }
                            i17 += this.aq * 1462922907;
                            i12++;
                            i13 -= floor3;
                            i16 += floor4;
                        }
                    }
                }
            }
        }
    }

    public void eo(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            double d = ((double) i7) / 326.11d;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i8) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i8) >> 8;
            int i11 = (i5 << 16) + ((i9 * cos) + (sin * i10));
            i10 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i12 = i + ((this.aq * 1462922907) * i2);
            i9 = 0;
            while (true) {
                int i13 = i11;
                int i14 = i9;
                int i15 = i10;
                int i16 = i12;
                if (i14 < i4) {
                    i11 = iArr[i14];
                    i10 = i11 + i16;
                    i9 = (i11 * cos) + i13;
                    i12 = i15 - (i11 * sin);
                    i11 = -iArr2[i14];
                    while (i11 < 0) {
                        this.ad[i10] = eeVar.ad[((i12 >> 16) * eeVar.aq) + (i9 >> 16)];
                        i9 += cos;
                        i12 -= sin;
                        i11++;
                        i10++;
                    }
                    i11 = i13 + sin;
                    i10 = i15 + cos;
                    i12 = i16 + (this.aq * 1462922907);
                    i9 = i14 + 1;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
        }
    }

    public void eq(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7;
        int i8 = 0;
        int i9 = i2 < 0 ? -i2 : 0;
        int i10 = eeVar.ar + i2 <= i6 ? eeVar.ar : i6 - i2;
        if (i < 0) {
            i8 = -i;
        }
        if (eeVar.aq + i <= i5) {
            i7 = eeVar.aq;
        }
        i7 = ((i3 + i) + i8) + (((i4 + i2) + i9) * (this.aq * 1462922907));
        int i11 = i9;
        int i12 = i2 + i9;
        while (i11 < i10) {
            int i13;
            int i14 = iArr[i12];
            int i15 = iArr2[i12];
            if (i < i14) {
                i13 = i14 - i;
                i9 = (i13 - i8) + i7;
            } else {
                i9 = i7;
                i13 = i8;
            }
            i14 += i15;
            i14 = eeVar.aq + i <= i14 ? eeVar.aq : i14 - i;
            while (i13 < i14) {
                i15 = eeVar.ad[(eeVar.aq * i11) + i13];
                if (i15 != 0) {
                    this.ad[i9] = i15;
                }
                i9++;
                i13++;
            }
            i7 += this.aq * -331299831;
            i11++;
            i12++;
        }
    }

    public void et(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7;
        int i8 = 0;
        int i9 = i2 < 0 ? -i2 : 0;
        int i10 = eeVar.ar + i2 <= i6 ? eeVar.ar : i6 - i2;
        if (i < 0) {
            i8 = -i;
        }
        if (eeVar.aq + i <= i5) {
            i7 = eeVar.aq;
        }
        i7 = ((i3 + i) + i8) + (((i4 + i2) + i9) * (this.aq * 2116880585));
        int i11 = i9;
        int i12 = i2 + i9;
        while (i11 < i10) {
            int i13;
            int i14 = iArr[i12];
            int i15 = iArr2[i12];
            if (i < i14) {
                i13 = i14 - i;
                i9 = (i13 - i8) + i7;
            } else {
                i9 = i7;
                i13 = i8;
            }
            i14 += i15;
            i14 = eeVar.aq + i <= i14 ? eeVar.aq : i14 - i;
            while (i13 < i14) {
                i15 = eeVar.ad[(eeVar.aq * i11) + i13];
                if (i15 != 0) {
                    this.ad[i9] = i15;
                }
                i9++;
                i13++;
            }
            i7 += this.aq * 1462922907;
            i11++;
            i12++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ey(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            int i7 = i - (eeVar.al << 4);
            int i8 = i2 - (eeVar.aj << 4);
            double d = ((double) (SupportMenu.USER_MASK & i5)) * 9.587379924285257E-5d;
            double d2 = (double) i6;
            int floor = (int) Math.floor((Math.sin(d) * d2) + 0.5d);
            int floor2 = (int) Math.floor((Math.cos(d) * d2) + 0.5d);
            int i9 = -i8;
            int i10 = floor * i9;
            int i11 = -i7;
            int i12 = i11 * floor2;
            int i13 = i10 + i12;
            i9 *= floor2;
            int i14 = (-i11) * floor;
            int i15 = i9 + i14;
            int i16 = (((eeVar.aq << 4) - i7) * floor2) + i10;
            int i17 = i9 + ((-((eeVar.aq << 4) - i7)) * floor);
            i11 = i12 + (((eeVar.ar << 4) - i8) * floor);
            i9 = (((eeVar.ar << 4) - i8) * floor2) + i14;
            i10 = (((eeVar.aq << 4) - i7) * floor2) + (((eeVar.ar << 4) - i8) * floor);
            floor = (floor * (-((eeVar.aq << 4) - i7))) + (floor2 * ((eeVar.ar << 4) - i8));
            if (i13 < i16) {
                i12 = i13;
                floor2 = i16;
            } else {
                i12 = i16;
                floor2 = i13;
            }
            if (i11 < i12) {
                i12 = i11;
            }
            if (i10 < i12) {
                i12 = i10;
            }
            if (i11 <= floor2) {
                i11 = floor2;
            }
            floor2 = i10 > i11 ? i10 : i11;
            if (i15 < i17) {
                i11 = i15;
                i10 = i17;
            } else {
                i11 = i17;
                i10 = i15;
            }
            if (i9 < i11) {
                i11 = i9;
            }
            if (floor < i11) {
                i11 = floor;
            }
            if (i9 <= i10) {
                i9 = i10;
            }
            if (floor <= i9) {
                floor = i9;
            }
            i9 = ((i12 >> 12) + i3) >> 4;
            i10 = ((((floor2 + 4095) >> 12) + i3) + 15) >> 4;
            i11 = ((i11 >> 12) + i4) >> 4;
            i15 = ((((floor + 4095) >> 12) + i4) + 15) >> 4;
            floor = i9 < this.ai * 1947951707 ? this.ai * 1947951707 : i9;
            i9 = i10 > this.ae * 428635993 ? this.ae * 428635993 : i10;
            i10 = i11 < this.al * -709973917 ? this.al * -709973917 : i11;
            i11 = i15 > this.aj * 157809585 ? this.aj * 157809585 : i15;
            i9 = floor - i9;
            if (i9 < 0) {
                i15 = i10 - i11;
                if (i15 < 0) {
                    i17 = ((this.aq * 1462922907) * i10) + floor;
                    double d3 = 1.6777216E7d / d2;
                    int floor3 = (int) Math.floor((Math.sin(d) * d3) + 0.5d);
                    int floor4 = (int) Math.floor((d3 * Math.cos(d)) + 0.5d);
                    int i18 = ((floor << 4) + 8) - i3;
                    floor = ((i10 << 4) + 8) - i4;
                    floor2 = (i7 << 8) - ((floor3 * floor) >> 4);
                    i16 = ((floor * floor4) >> 4) + (i8 << 8);
                    if (floor4 == 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            while (i15 < 0) {
                                if (floor2 >= 0 && i16 >= 0 && floor2 - (eeVar.aq << 12) < 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i11;
                                    for (i10 = i9; i10 < 0; i10++) {
                                        i17 = eeVar.ad[(eeVar.aq * (i16 >> 12)) + (floor2 >> 12)];
                                        if (i17 != 0) {
                                            this.ad[floor] = i17;
                                        }
                                        floor++;
                                    }
                                }
                                i15++;
                                i11 += this.aq * 1462922907;
                            }
                        } else if (floor3 < 0) {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((floor3 * i18) >> 4) + i16;
                                if (floor2 >= 0 && floor2 - (eeVar.aq << 12) < 0) {
                                    floor = i15 - (eeVar.ar << 12);
                                    if (floor >= 0) {
                                        i10 = (floor3 - floor) / floor3;
                                        floor = i9 + i10;
                                        i15 += floor3 * i10;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (i15 - floor3) / floor3;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(floor2 >> 12) + (eeVar.aq * (i15 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor3;
                                        i17++;
                                        i10++;
                                    }
                                }
                                floor2 -= floor3;
                                i11 += this.aq * 1462922907;
                            }
                        } else {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((i18 * floor3) >> 4) + i16;
                                if (floor2 >= 0 && floor2 - (eeVar.aq << 12) < 0) {
                                    if (i15 < 0) {
                                        i10 = ((floor3 - 1) - i15) / floor3;
                                        floor = i9 + i10;
                                        i15 += floor3 * i10;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (((i15 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(floor2 >> 12) + (eeVar.aq * (i15 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor3;
                                        i17++;
                                        i10++;
                                    }
                                }
                                floor2 -= floor3;
                                i11 += this.aq * 1462922907;
                            }
                        }
                    } else if (floor4 < 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            for (i12 = i15; i12 < 0; i12++) {
                                i15 = ((floor4 * i18) >> 4) + floor2;
                                if (i16 >= 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i15 - (eeVar.aq << 12);
                                    if (floor >= 0) {
                                        i10 = (floor4 - floor) / floor4;
                                        floor = i9 + i10;
                                        i15 += i10 * floor4;
                                        i10 += i11;
                                    } else {
                                        floor = i9;
                                        i10 = i11;
                                    }
                                    i17 = (i15 - floor4) / floor4;
                                    if (i17 <= floor) {
                                        i17 = floor;
                                    }
                                    while (i17 < 0) {
                                        floor = eeVar.ad[(i15 >> 12) + (eeVar.aq * (i16 >> 12))];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor4;
                                        i17++;
                                        i10++;
                                    }
                                }
                                i16 += floor4;
                                i11 += this.aq * 1462922907;
                            }
                        } else if (floor3 < 0) {
                            i12 = i15;
                            i13 = floor2;
                            while (i12 < 0) {
                                i10 = ((i18 * floor4) >> 4) + i13;
                                i11 = ((i18 * floor3) >> 4) + i16;
                                floor = i10 - (eeVar.aq << 12);
                                if (floor >= 0) {
                                    i15 = (floor4 - floor) / floor4;
                                    floor = i9 + i15;
                                    i10 += floor4 * i15;
                                    i11 += i15 * floor3;
                                    i15 += i17;
                                } else {
                                    floor = i9;
                                    i15 = i17;
                                }
                                floor2 = (i10 - floor4) / floor4;
                                if (floor2 > floor) {
                                    floor = floor2;
                                }
                                floor2 = i11 - (eeVar.ar << 12);
                                if (floor2 >= 0) {
                                    floor2 = (floor3 - floor2) / floor3;
                                    floor += floor2;
                                    i10 += floor4 * floor2;
                                    i11 += floor3 * floor2;
                                    i15 += floor2;
                                }
                                floor2 = (i11 - floor3) / floor3;
                                if (floor2 <= floor) {
                                    floor2 = floor;
                                }
                                while (floor2 < 0) {
                                    floor = eeVar.ad[(i10 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                    if (floor != 0) {
                                        this.ad[i15] = floor;
                                    }
                                    i10 += floor4;
                                    i11 += floor3;
                                    floor2++;
                                    i15++;
                                }
                                i16 += floor4;
                                i17 += this.aq * 1462922907;
                                i12++;
                                i13 -= floor3;
                            }
                        } else {
                            i13 = i15;
                            i7 = floor2;
                            i10 = i9;
                            while (i13 < 0) {
                                floor = ((floor4 * i18) >> 4) + i7;
                                i11 = ((floor3 * i18) >> 4) + i16;
                                i9 = floor - (eeVar.aq << 12);
                                if (i9 >= 0) {
                                    i15 = (floor4 - i9) / floor4;
                                    i9 = i10 + i15;
                                    floor += floor4 * i15;
                                    i11 += floor3 * i15;
                                    i15 += i17;
                                } else {
                                    i9 = i10;
                                    i15 = i17;
                                }
                                floor2 = (floor - floor4) / floor4;
                                if (floor2 > i9) {
                                    i9 = floor2;
                                }
                                if (i11 < 0) {
                                    floor2 = ((floor3 - 1) - i11) / floor3;
                                    i9 += floor2;
                                    floor += floor4 * floor2;
                                    i11 += floor3 * floor2;
                                    i15 += floor2;
                                }
                                i12 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                if (i12 > i9) {
                                    floor2 = floor;
                                } else {
                                    floor2 = floor;
                                    i12 = i9;
                                }
                                while (i12 < 0) {
                                    floor = eeVar.ad[(floor2 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                    if (floor != 0) {
                                        this.ad[i15] = floor;
                                    }
                                    i11 += floor3;
                                    i12++;
                                    floor2 += floor4;
                                    i15++;
                                }
                                i16 += floor4;
                                i17 += this.aq * 1462922907;
                                i13++;
                                i7 -= floor3;
                            }
                        }
                    } else if (floor3 == 0) {
                        i10 = i17;
                        for (i12 = i15; i12 < 0; i12++) {
                            i11 = ((floor4 * i18) >> 4) + floor2;
                            if (i16 >= 0 && i16 - (eeVar.ar << 12) < 0) {
                                if (i11 < 0) {
                                    floor = ((floor4 - 1) - i11) / floor4;
                                    i15 = i9 + floor;
                                    i11 += floor4 * floor;
                                    floor += i10;
                                } else {
                                    floor = i10;
                                    i15 = i9;
                                }
                                i17 = (((i11 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                                if (i17 > i15) {
                                    i15 = i17;
                                }
                                while (i15 < 0) {
                                    i17 = eeVar.ad[((i16 >> 12) * eeVar.aq) + (i11 >> 12)];
                                    if (i17 != 0) {
                                        this.ad[floor] = i17;
                                    }
                                    floor++;
                                    i11 += floor4;
                                    i15++;
                                }
                            }
                            i16 += floor4;
                            i10 += this.aq * 1462922907;
                        }
                    } else if (floor3 < 0) {
                        i7 = i15;
                        i8 = floor2;
                        i13 = i18;
                        while (i7 < 0) {
                            floor = ((floor4 * i13) >> 4) + i8;
                            i11 = ((floor3 * i13) >> 4) + i16;
                            if (floor < 0) {
                                i15 = ((floor4 - 1) - floor) / floor4;
                                i10 = i9 + i15;
                                floor += i15 * floor4;
                                i11 += i15 * floor3;
                                i15 += i17;
                            } else {
                                i10 = i9;
                                i15 = i17;
                            }
                            floor2 = (((floor + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                            if (floor2 > i10) {
                                i10 = floor2;
                            }
                            floor2 = i11 - (eeVar.ar << 12);
                            if (floor2 >= 0) {
                                floor2 = (floor3 - floor2) / floor3;
                                i10 += floor2;
                                floor += floor4 * floor2;
                                i11 += floor2 * floor3;
                                i15 += floor2;
                            }
                            i12 = (i11 - floor3) / floor3;
                            if (i12 > i10) {
                                floor2 = floor;
                            } else {
                                floor2 = floor;
                                i12 = i10;
                            }
                            while (i12 < 0) {
                                floor = eeVar.ad[(floor2 >> 12) + ((i11 >> 12) * eeVar.aq)];
                                if (floor != 0) {
                                    this.ad[i15] = floor;
                                }
                                i11 += floor3;
                                i12++;
                                i15++;
                                floor2 += floor4;
                            }
                            i16 += floor4;
                            i17 += this.aq * 1462922907;
                            i7++;
                            i8 -= floor3;
                        }
                    } else {
                        i12 = i15;
                        i13 = floor2;
                        while (i12 < 0) {
                            i10 = ((floor4 * i18) >> 4) + i13;
                            i11 = ((floor3 * i18) >> 4) + i16;
                            if (i10 < 0) {
                                i15 = ((floor4 - 1) - i10) / floor4;
                                floor = i9 + i15;
                                i10 += i15 * floor4;
                                i11 += floor3 * i15;
                                i15 += i17;
                            } else {
                                floor = i9;
                                i15 = i17;
                            }
                            floor2 = (((i10 + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                            if (floor2 > floor) {
                                floor = floor2;
                            }
                            if (i11 < 0) {
                                floor2 = ((floor3 - 1) - i11) / floor3;
                                floor += floor2;
                                i10 += floor4 * floor2;
                                i11 += floor2 * floor3;
                                i15 += floor2;
                            }
                            floor2 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                            if (floor2 <= floor) {
                                floor2 = floor;
                            }
                            while (floor2 < 0) {
                                floor = eeVar.ad[((i11 >> 12) * eeVar.aq) + (i10 >> 12)];
                                if (floor != 0) {
                                    this.ad[i15] = floor;
                                }
                                i10 += floor4;
                                i11 += floor3;
                                floor2++;
                                i15++;
                            }
                            i17 += this.aq * 1462922907;
                            i12++;
                            i13 -= floor3;
                            i16 += floor4;
                        }
                    }
                }
            }
        }
    }

    public void ez(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            double d = ((double) i7) / 326.11d;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i8) >> 8;
            int cos = (((int) (Math.cos(d) * 65536.0d)) * i8) >> 8;
            int i11 = (i5 << 16) + ((i9 * cos) + (sin * i10));
            i10 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i12 = i + ((this.aq * 1462922907) * i2);
            i9 = 0;
            while (true) {
                int i13 = i11;
                int i14 = i9;
                int i15 = i10;
                int i16 = i12;
                if (i14 < i4) {
                    i11 = iArr[i14];
                    i10 = i11 + i16;
                    i9 = (i11 * cos) + i13;
                    i12 = i15 - (i11 * sin);
                    i11 = -iArr2[i14];
                    while (i11 < 0) {
                        this.ad[i10] = eeVar.ad[((i12 >> 16) * eeVar.aq) + (i9 >> 16)];
                        i9 += cos;
                        i12 -= sin;
                        i11++;
                        i10++;
                    }
                    i11 = i13 + sin;
                    i10 = i15 + cos;
                    i12 = i16 + (this.aq * 1462922907);
                    i9 = i14 + 1;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
        }
    }
}
