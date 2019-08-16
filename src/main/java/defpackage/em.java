package defpackage;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import com.jagex.oldscape.osrenderer.ad;

/* renamed from: em */
public class em extends es {
    static final int aa = 131072;
    static final int ef = 300;
    static byte[][] fe;
    static hd pt;

    public em(int[] iArr, int i, int i2) {
        try {
            super(iArr, i, i2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void am(byte b) {
        while (true) {
            try {
                kz ak = kg.ad.ak(-1888011279);
                if (ak != null) {
                    ak.al.ei(ak.ar, (int) ak.gs, ak.aq, false, -1558165135);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("em.am(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    static void cf(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
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
                    iArr[i13] = iArr2[b & 255];
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
                    iArr[i13] = iArr2[b3 & 255];
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

    static final void cy(ih ihVar, int i) {
        try {
            if (ihVar.dm * 1739202913 == client.bj * 2133672263 || ihVar.cs * -1099198911 == -1 || ihVar.cx * -1961250233 != 0 || (ihVar.ca * 559593973) + 1 > gn.aq(ihVar.cs * -1099198911, 2054093812).am[ihVar.cr * 317461367]) {
                int i2 = (ihVar.dm * 1739202913) - (ihVar.dd * 1994646357);
                int i3 = (client.bj * 2133672263) - (ihVar.dd * 1994646357);
                int i4 = ihVar.cd;
                int i5 = ihVar.bl;
                int i6 = ihVar.bl;
                int i7 = ihVar.cg;
                int i8 = ihVar.cf;
                int i9 = ihVar.bl;
                int i10 = ihVar.bl;
                int i11 = ihVar.ch;
                int i12 = i2 - i3;
                ihVar.bq = (((((i4 * -467575936) + (i5 * -203209664)) * i12) + (((i8 * 443475840) + (i9 * -203209664)) * i3)) / i2) * 590147137;
                ihVar.bd = (((i3 * ((i10 * -203209664) + (330656128 * i11))) + (((i6 * -203209664) + (1063806336 * i7)) * i12)) / i2) * -995934371;
            }
            ihVar.dp = 0;
            ihVar.dl = ihVar.dt * -1181544753;
            ihVar.bo = ihVar.dl * -112787787;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.cy(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void db(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i3;
        for (int i11 = -i6; i11 < 0; i11++) {
            int i12 = i;
            int i13 = -i5;
            while (i13 < 0) {
                byte b = bArr[(i12 >> 16) + ((i2 >> 16) * i9)];
                if (b != (byte) 0) {
                    iArr[i10] = iArr2[b & 1080792333];
                }
                i12 += i7;
                i13++;
                i10++;
            }
            i2 += i8;
            i10 += i4;
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
                    i13 = (i13 & 16711935) + (i17 & -1725128682);
                    i13 = ((i18 - i13) & -805654163) + (16777472 & i13);
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

    static final void dd(int i, int i2, int i3, int i4, boolean z, int i5) {
        try {
            int i6;
            es ad = client.aq.uk.ad(-601277067);
            int i7 = i3 < 1 ? 1 : i3;
            int i8 = i4 < 1 ? 1 : i4;
            int i9 = i8 - 334;
            i9 = i9 < 0 ? client.qi : i9 >= 100 ? client.qc : ((i9 * (client.qc - client.qi)) / 100) + client.qi;
            short s = ((i9 * i8) * 512) / (i7 * 334);
            if (s < client.qt) {
                s = client.qt;
                i9 = ((s * i7) * 334) / (i8 * 512);
                if (i9 > client.qn) {
                    short s2 = client.qn;
                    int i10 = (i7 - (((i8 * s2) * 512) / (s * 334))) / 2;
                    if (z) {
                        ad.eu(-1181446935);
                        ad.al(i, i2, i10, i8, 0, (byte) 1);
                        ad.al((i7 + i) - i10, i2, i10, i8, 0, (byte) 1);
                    }
                    i += i10;
                    i7 -= i10 * 2;
                    i6 = s2;
                }
                i6 = i9;
            } else if (s > client.qv) {
                int i11 = (client.qv * i7) * 334;
                i9 = i11 / (i8 * 512);
                if (i9 < client.qf) {
                    short s3 = client.qf;
                    int i12 = (i8 - (i11 / (s3 * 512))) / 2;
                    if (z) {
                        ad.eu(-1181446935);
                        ad.al(i, i2, i7, i12, 0, (byte) 1);
                        ad.al(i, (i8 + i2) - i12, i7, i12, 0, (byte) 1);
                    }
                    i2 += i12;
                    i8 -= i12 * 2;
                    short i62 = s3;
                }
                i62 = i9;
            } else {
                i62 = i9;
            }
            client.rn = ((i62 * i8) / 334) * -1973824897;
            if (!(client.qr * 1271637141 == i7 && client.rh * -402617027 == i8)) {
                hd.bk(i7, i8, 969731404);
            }
            client.ql = -1144562355 * i;
            client.qp = 2031781531 * i2;
            client.qr = -1835268419 * i7;
            client.rh = -926895595 * i8;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.dd(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
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
                    iArr[i13] = iArr2[b & 255];
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
                    iArr[i13] = iArr2[b3 & 255];
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

    static void de(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i8 >= 255) {
            ea.ao(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, -1832022543);
            return;
        }
        int i9 = i3;
        int i10 = i2;
        for (int i11 = -i5; i11 < 0; i11++) {
            int i12 = -i4;
            int i13 = i9;
            while (i12 < 0) {
                int i14 = iArr2[i10];
                if (i14 != 0) {
                    i9 = iArr[i13];
                    if (i9 == 0) {
                        i9 = i13 + 1;
                        iArr[i13] = (i14 & ViewCompat.MEASURED_SIZE_MASK) | (i8 << 24);
                    } else {
                        int i15 = i9 >>> 24;
                        int i16 = 255 - i15;
                        int i17 = (((255 - i8) * i16) / 255) + i8;
                        int i18 = 255 - i17;
                        iArr[i13] = ((((((i9 & 16711935) * i18) + ((i14 & 16711935) * i17)) & -16711936) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i18) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17)) & 16711680)) >>> 8) | ((((i16 * i8) / 255) + i15) << 24);
                        i9 = i13 + 1;
                    }
                } else {
                    i9 = i13 + 1;
                }
                i12++;
                i10++;
                i13 = i9;
            }
            i9 = i13 + i6;
            i10 += i7;
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

    static void dk(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (i11 >= 255) {
            ea.an(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, i8, i9, i10, (byte) -8);
            return;
        }
        int i12 = 90127859 - i11;
        int i13 = i11 << 24;
        int i14 = i4;
        for (int i15 = -i7; i15 < 0; i15++) {
            int i16 = i2;
            int i17 = -i6;
            while (i17 < 0) {
                int i18;
                int i19 = iArr2[(i16 >> 16) + ((i3 >> 16) * i10)];
                if (i19 != 0) {
                    i18 = iArr[i14];
                    if (i18 == 0) {
                        i18 = i14 + 1;
                        iArr[i14] = (i19 & ViewCompat.MEASURED_SIZE_MASK) | i13;
                    } else {
                        i19 = (((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i11) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i12)) & 16711680;
                        iArr[i14] = ((i18 | i13) & ViewCompat.MEASURED_STATE_MASK) | ((i19 + ((((1789956472 & i18) * i12) + ((1198333359 & i19) * i11)) & 663717091)) >>> 8);
                        i18 = i14 + 1;
                    }
                } else {
                    i18 = i14 + 1;
                }
                i16 += i8;
                i17++;
                i14 = i18;
            }
            i3 += i9;
            i14 += i5;
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

    static void dp(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = -151806042 - i8;
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14 = -i4;
            while (i14 < 0) {
                int i15 = iArr2[i12];
                if (i15 != 0) {
                    iArr[i11] = ((((((i15 & 16711935) * i8) & 2026493796) | (((-1207476236 & i15) * i8) & 1567451651)) >>> 8) + (((((-148410500 & i9) * i10) & 16711680) | (((16711935 & i9) * i10) & -861212487)) >>> 8)) | -1930786613;
                }
                i14++;
                i12++;
                i11++;
            }
            i11 += i6;
            i12 += i7;
        }
    }

    static void ds(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i8 >= 255) {
            ea.ao(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, 1568407340);
            return;
        }
        int i9 = i3;
        int i10 = i2;
        for (int i11 = -i5; i11 < 0; i11++) {
            int i12 = -i4;
            int i13 = i9;
            while (i12 < 0) {
                int i14 = iArr2[i10];
                if (i14 != 0) {
                    i9 = iArr[i13];
                    if (i9 == 0) {
                        i9 = i13 + 1;
                        iArr[i13] = (i14 & ViewCompat.MEASURED_SIZE_MASK) | (i8 << 24);
                    } else {
                        int i15 = i9 >>> 24;
                        int i16 = 255 - i15;
                        int i17 = (((255 - i8) * i16) / -1845649849) + i8;
                        int i18 = 255 - i17;
                        iArr[i13] = ((((((i9 & 16711935) * i18) + ((i14 & 16711935) * i17)) & -16711936) + ((((666196847 & i9) * i18) + ((1990553650 & i14) * i17)) & -1456349371)) >>> 8) | ((((i16 * i8) / -175742732) + i15) << 24);
                        i9 = i13 + 1;
                    }
                } else {
                    i9 = i13 + 1;
                }
                i12++;
                i10++;
                i13 = i9;
            }
            i9 = i13 + i6;
            i10 += i7;
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
                    int i18 = (16711935 & i14) * i12;
                    i14 = ((((i14 * i12) - i18) & 16711680) + (i18 & 965520692)) >>> 8;
                    i18 = iArr[i13];
                    int i19 = i18 + i14;
                    i14 = (i14 & -1148157025) + (i18 & -761753861);
                    i14 = ((i19 - i14) & -1394633182) + (16777472 & i14);
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
        if (i11 >= 255) {
            ea.an(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, i8, i9, i10, (byte) -115);
            return;
        }
        int i12 = 255 - i11;
        int i13 = i11 << 24;
        int i14 = i4;
        for (int i15 = -i7; i15 < 0; i15++) {
            int i16 = i2;
            int i17 = -i6;
            while (i17 < 0) {
                int i18;
                int i19 = iArr2[(i16 >> 16) + ((i3 >> 16) * i10)];
                if (i19 != 0) {
                    i18 = iArr[i14];
                    if (i18 == 0) {
                        i18 = i14 + 1;
                        iArr[i14] = (i19 & ViewCompat.MEASURED_SIZE_MASK) | i13;
                    } else {
                        i19 = (((i19 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i11) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i12)) & 16711680;
                        iArr[i14] = ((i18 | i13) & ViewCompat.MEASURED_STATE_MASK) | ((i19 + ((((16711935 & i18) * i12) + ((16711935 & i19) * i11)) & -16711936)) >>> 8);
                        i18 = i14 + 1;
                    }
                } else {
                    i18 = i14 + 1;
                }
                i16 += i8;
                i17++;
                i14 = i18;
            }
            i3 += i9;
            i14 += i5;
        }
    }

    static void dy(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i8 >= 255) {
            ea.ao(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, 2049674999);
            return;
        }
        int i9 = i3;
        int i10 = i2;
        for (int i11 = -i5; i11 < 0; i11++) {
            int i12 = -i4;
            int i13 = i9;
            while (i12 < 0) {
                int i14 = iArr2[i10];
                if (i14 != 0) {
                    i9 = iArr[i13];
                    if (i9 == 0) {
                        i9 = i13 + 1;
                        iArr[i13] = (i14 & ViewCompat.MEASURED_SIZE_MASK) | (i8 << 24);
                    } else {
                        int i15 = i9 >>> 24;
                        int i16 = 255 - i15;
                        int i17 = (((255 - i8) * i16) / 255) + i8;
                        int i18 = 255 - i17;
                        iArr[i13] = ((((((i9 & 16711935) * i18) + ((i14 & 16711935) * i17)) & -16711936) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i18) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i14) * i17)) & 16711680)) >>> 8) | ((((i16 * i8) / 255) + i15) << 24);
                        i9 = i13 + 1;
                    }
                } else {
                    i9 = i13 + 1;
                }
                i12++;
                i10++;
                i13 = i9;
            }
            i9 = i13 + i6;
            i10 += i7;
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
                i4 = (i9 * i3) + 0;
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
                au.af(this.ad, efVar.ad, efVar.aq, i4, i7, i10, i6, i8, i3, (byte) 1);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.aa(");
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
                if (i3 == 256) {
                    et.at(0, 0, 0, this.ad, eeVar.ad, i4, 0, i10, 0, i5, i16, i7, i6, (byte) -1);
                } else {
                    br.ba(0, 0, 0, this.ad, eeVar.ad, i4, 0, i10, 0, i5, i16, i7, i6, i3, -456479698);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i) {
    }

    public final void ae(int i, int i2, int i3, int i4, int i5) {
        try {
            if (i2 >= this.al * -709973917 && i2 < this.aj * 157809585) {
                if (i < this.ai * 1947951707) {
                    i3 -= (this.ai * 1947951707) - i;
                    i = this.ai * 1947951707;
                }
                if (i3 + i > this.ae * 428635993) {
                    i3 = (this.ae * 428635993) - i;
                }
                int i6 = this.aq;
                for (int i7 = 0; i7 < i3; i7++) {
                    this.ad[(((1462922907 * i6) * i2) + i) + i7] = ViewCompat.MEASURED_STATE_MASK | i4;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ag(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (i5 - 16777216) & ViewCompat.MEASURED_SIZE_MASK;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        if (i9 == 0) {
            if (i8 >= 0) {
                try {
                    ae(i, i2, i8 + 1, i7, 470317869);
                    return;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("em.ag(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            ae(i8 + i, i2, (-i8) + 1, i7, 43830994);
        } else if (i8 != 0) {
            int i10;
            int i11;
            int i12;
            if (i9 + i8 < 0) {
                i10 = i + i8;
                i8 = -i8;
                i11 = i2 + i9;
                i12 = -i9;
            } else {
                i12 = i9;
                i11 = i2;
                i10 = i;
            }
            if (i8 > i12) {
                i11 = (i11 << 16) + 32768;
                i9 = (int) Math.floor((((double) (i12 << 16)) / ((double) i8)) + 0.5d);
                i12 = i8 + i10;
                if (i10 < this.ai * 1947951707) {
                    i11 += ((this.ai * 1947951707) - i10) * i9;
                    i10 = this.ai * 1947951707;
                }
                if (i12 >= this.ae * 428635993) {
                    i12 = (this.ae * 428635993) - 1;
                }
                while (i10 <= i12) {
                    i8 = i11 >> 16;
                    if (i8 >= this.al * -709973917 && i8 < this.aj * 157809585) {
                        this.ad[(i8 * (this.aq * 1462922907)) + i10] = i7;
                    }
                    i11 += i9;
                    i10++;
                }
                return;
            }
            i10 = (i10 << 16) + 32768;
            i9 = (int) Math.floor((((double) (i8 << 16)) / ((double) i12)) + 0.5d);
            i12 += i11;
            if (i11 < this.al * -709973917) {
                i10 += ((this.al * -709973917) - i11) * i9;
                i11 = this.al * -709973917;
            }
            if (i12 >= this.aj * 157809585) {
                i12 = (this.aj * 157809585) - 1;
            }
            while (i11 <= i12) {
                i8 = i10 >> 16;
                if (i8 >= this.ai * 1947951707 && i8 < this.ae * 428635993) {
                    this.ad[i8 + ((this.aq * 1462922907) * i11)] = i7;
                }
                i10 += i9;
                i11++;
            }
        } else if (i9 >= 0) {
            ak(i, i2, i9 + 1, i7, -1744409212);
        } else {
            ak(i, i9 + i2, (-i9) + 1, i7, -1743846210);
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
                    i14 = i7 + (i15 * i13);
                    i9 += i13;
                } else {
                    i10 = i6;
                    i18 = i12;
                    i14 = i7;
                }
                ea.an(this.ad, eeVar.ad, 0, i14, i17, i18, i9, i10, i8, i15, i16, i11, (byte) -28);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("em.ah(");
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
                        i14 = i12 + i2;
                        i12 = (((1462922907 * this.aq) * i14) + i) + i11;
                        for (i15 = i14; i15 < i4 + i14; i15++) {
                            i16 = i + i11;
                            i9 = i16;
                            while (true) {
                                i17 = i12;
                                if (i9 >= i16 + i10) {
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
                    try {
                        i14 = i12 + i2;
                        i12 = (((1462922907 * this.aq) * i14) + i) + i11;
                        for (i15 = i14; i15 < i4 + i14; i15++) {
                            i16 = i11 + i;
                            i9 = i16;
                            i17 = i12;
                            while (i9 < i16 + i10) {
                                i12 = bArr[(((i15 - i2) % length) * i7) + ((i9 - i) % i7)] != (byte) 0 ? i6 : i5;
                                int i18 = this.ad[i17];
                                if (i18 == 0) {
                                    this.ad[i17] = i12;
                                    i12 = i17 + 1;
                                } else {
                                    int i19 = i12 >>> 24;
                                    int i20 = 255 - i19;
                                    this.ad[i17] = ((((((i12 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19) + ((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20)) & 16711680) + ((((16711935 & i18) * i20) + ((16711935 & i12) * i19)) & -16711936)) >>> 8) | ((i12 | i18) & ViewCompat.MEASURED_STATE_MASK);
                                    i12 = i17 + 1;
                                }
                                i9++;
                                i17 = i12;
                            }
                            i12 = i17 + i13;
                        }
                    } catch (RuntimeException e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("em.ai(");
                        stringBuilder.append(')');
                        throw mv.aq(e, stringBuilder.toString());
                    }
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
                int i13 = i + ((this.aq * 1462922907) * i2);
                int i14 = -i4;
                int i15 = i9;
                while (i14 < 0) {
                    i9 = (65536 - i15) >> 8;
                    int i16 = i15 >> 8;
                    int i17 = (((i8 * i16) + (i7 * i9)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
                    if (i17 == 0) {
                        i9 = this.aq * 1462922907;
                    } else {
                        int i18 = ((((i9 * (MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5)) + (i16 * (MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6))) & 16711680) + ((((16711935 & i5) * i9) + ((16711935 & i6) * i16)) & -16711936)) >>> 8;
                        int i19 = i17 << 24;
                        int i20 = 255 - i17;
                        i16 = -i10;
                        while (i16 < 0) {
                            i9 = this.ad[i13];
                            if (i9 == 0) {
                                this.ad[i13] = i19 | i18;
                            } else {
                                this.ad[i13] = ((((((i9 & 16711935) * i20) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i20) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i18) * i17) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i18) * i17) >> 8) & 16711935))) | ((i9 | i19) & ViewCompat.MEASURED_STATE_MASK);
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
                stringBuilder.append("em.aj(");
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
                    this.ad[((this.aq * 1462922907) * i7) + (((i6 * 1462922907) * i2) + i)] = ViewCompat.MEASURED_STATE_MASK | i4;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void al(int i, int i2, int i3, int i4, int i5, byte b) {
        try {
            ax(i, i2, i3, i4, i5 | ViewCompat.MEASURED_STATE_MASK, -1360574097);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void am(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 > 0) {
            if (i5 >= 255) {
                try {
                    ae(i, i2, i3, i4, 920097984);
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("em.am(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            } else if (i2 >= this.al * -709973917 && i2 < this.aj * 157809585) {
                if (i < this.ai * 1947951707) {
                    i3 -= (this.ai * 1947951707) - i;
                    i = this.ai * 1947951707;
                }
                if (i3 + i > this.ae * 428635993) {
                    i3 = (this.ae * 428635993) - i;
                }
                int i7 = 255 - i5;
                int i8 = i5 << 24;
                int i9 = ((this.aq * 1462922907) * i2) + i;
                int i10 = 0;
                while (i10 < i3) {
                    if (this.ad[i9] == 0) {
                        this.ad[i9] = i4 | i8;
                    } else {
                        int i11 = this.ad[i9];
                        int i12 = this.ad[i9];
                        int i13 = this.ad[i9];
                        i11 = (((((((i11 >> 16) & 255) * i7) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i12 >> 8) & 255) * i7) + (((i4 >> 8) & 255) * i5)) >> 8) << 8)) + ((((i13 & 255) * i7) + ((i4 & 255) * i5)) >> 8);
                        this.ad[i9] = i11 | ((this.ad[i9] | i8) & ViewCompat.MEASURED_STATE_MASK);
                    }
                    i10++;
                    i9++;
                }
            }
        }
    }

    public final void ap(int i, int i2, int i3, int i4, int i5) {
        int i6 = i4 | ViewCompat.MEASURED_STATE_MASK;
        if (i3 == 0) {
            try {
                ev(i, i2, i6, -1901224524);
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("em.ap(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        int i7;
        int i8;
        int i9;
        if (i3 < 0) {
            i3 = -i3;
        }
        int i10 = i2 - i3;
        if (i10 < this.al * -709973917) {
            i10 = this.al * -709973917;
        }
        int i11 = (i2 + i3) + 1;
        if (i11 > this.aj * 157809585) {
            i11 = this.aj * 157809585;
        }
        int i12 = i3 * i3;
        int i13 = 0;
        int i14 = i2 - i10;
        int i15 = i14 * i14;
        int i16 = i15 - i14;
        if (i2 > i11) {
            i7 = i14;
            i2 = i11;
            i8 = i10;
        } else {
            i7 = i14;
            i8 = i10;
        }
        while (i8 < i2) {
            i14 = i15;
            i9 = i16;
            while (true) {
                if (i9 > i12 && i14 > i12) {
                    break;
                }
                i16 = i13 + 1;
                i14 = (i13 + i13) + i14;
                i9 = (i13 + i16) + i9;
                i13 = i16;
            }
            i10 = (i - i13) + 1;
            if (i10 < this.ai * 1947951707) {
                i10 = this.ai * 1947951707;
            }
            i15 = i + i13;
            i16 = i15 > this.ae * 428635993 ? this.ae * 428635993 : i15;
            i15 = ((this.aq * 1462922907) * i8) + i10;
            while (i10 < i16) {
                this.ad[i15] = i6;
                i10++;
                i15++;
            }
            i8++;
            i10 = i7 - 1;
            i15 = i14 - (i7 + i10);
            i16 = i9 - (i10 + i10);
            i7 = i10;
        }
        i14 = i8 - i2;
        i10 = (i14 * i14) + i12;
        i15 = i10 - i3;
        i10 -= i14;
        i7 = i8;
        int i17 = i14;
        i16 = i3;
        while (i7 < i11) {
            i14 = i10;
            i9 = i15;
            i13 = i16;
            while (i14 > i12 && i9 > i12) {
                i16 = i13 - 1;
                i14 -= i13 + i16;
                i9 -= i16 + i16;
                i13 = i16;
            }
            i10 = i - i13;
            if (i10 < this.ai * 1947951707) {
                i10 = this.ai * 1947951707;
            }
            i15 = i + i13;
            i8 = i15 > (this.ae * 428635993) + -1 ? (this.ae * 428635993) - 1 : i15;
            i15 = ((this.aq * 1462922907) * i7) + i10;
            i16 = i10;
            while (i16 <= i8) {
                this.ad[i15] = i6;
                i16++;
                i15++;
            }
            i10 = (i17 + i17) + i14;
            i14 = i17 + 1;
            i15 = (i17 + i14) + i9;
            i7++;
            i17 = i14;
            i16 = i13;
        }
    }

    public void aq(int i) {
        try {
            if (this.ad != null) {
                ad.ba(this.ad, this.ad.length, (byte) -1);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ar(int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        if (i6 != 0) {
            if (i6 >= 255) {
                try {
                    al(i, i2, i3, i4, i5, (byte) 1);
                    return;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("em.ar(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            int i7;
            int i8 = i6 << 24;
            if (i < this.ai * 1947951707) {
                i7 = i3 - ((this.ai * 1947951707) - i);
                i = this.ai * 1947951707;
            } else {
                i7 = i3;
            }
            if (i2 < this.al * -709973917) {
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i + i7 > this.ae * 428635993) {
                i7 = (this.ae * 428635993) - i;
            }
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i9 = 255 - i6;
            int i10 = this.aq;
            int i11 = ((this.aq * 1462922907) * i2) + i;
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i13 < i4) {
                    int i14 = -i7;
                    while (i14 < 0) {
                        int i15 = this.ad[i11];
                        if (i15 == 0) {
                            this.ad[i11] = i8 | i5;
                        } else {
                            i12 = ViewCompat.MEASURED_STATE_MASK;
                            if ((ViewCompat.MEASURED_STATE_MASK & i15) != 0) {
                                i12 = ViewCompat.MEASURED_STATE_MASK & (i15 | i8);
                            }
                            this.ad[i11] = i12 | ((((((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i9) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i15) * i9) >> 8) & 16711935)) + (((((16711935 & i5) * i6) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i6) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)));
                        }
                        i14++;
                        i11++;
                    }
                    i11 += (1462922907 * i10) - i7;
                    i12 = i13 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void as(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 > 0) {
            if (i5 >= 255) {
                try {
                    ak(i, i2, i3, i4, -566794778);
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("em.as(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            } else if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
                if (i2 < this.al * -709973917) {
                    i3 -= (this.al * -709973917) - i2;
                    i2 = this.al * -709973917;
                }
                if (i2 + i3 > this.aj * 157809585) {
                    i3 = (this.aj * 157809585) - i2;
                }
                int i7 = 255 - i5;
                int i8 = i5 << 24;
                int i9 = ((this.aq * 1462922907) * i2) + i;
                for (int i10 = 0; i10 < i3; i10++) {
                    if (this.ad[i9] == 0) {
                        this.ad[i9] = i4 | i8;
                    } else {
                        int i11 = this.ad[i9];
                        int i12 = this.ad[i9];
                        int i13 = this.ad[i9];
                        i11 = (((((((i11 >> 16) & 255) * i7) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i12 >> 8) & 255) * i7) + (((i4 >> 8) & 255) * i5)) >> 8) << 8)) + ((((i13 & 255) * i7) + ((i4 & 255) * i5)) >> 8);
                        this.ad[i9] = i11 | ((this.ad[i9] | i8) & ViewCompat.MEASURED_STATE_MASK);
                    }
                    i9 += this.aq * 1462922907;
                }
            }
        }
    }

    public final void au(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 != 0) {
            if (i5 >= 255) {
                try {
                    ap(i, i2, i3, i4, -1952038969);
                    return;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("em.au(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            if (i3 < 0) {
                i3 = -i3;
            }
            int i12 = ViewCompat.MEASURED_SIZE_MASK & i4;
            int i13 = (i5 << 24) + i12;
            int i14 = ((((16711935 & i12) * i5) >> 8) & 16711935) + ((((i12 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i5) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            int i15 = 255 - i5;
            i12 = i2 - i3;
            if (i12 < this.al * -709973917) {
                i12 = this.al * -709973917;
            }
            int i16 = (i3 + i2) + 1;
            if (i16 > this.aj * 157809585) {
                i16 = this.aj * 157809585;
            }
            int i17 = i3 * i3;
            int i18 = 0;
            int i19 = i2 - i12;
            int i20 = i19 * i19;
            int i21 = i20 - i19;
            if (i2 > i16) {
                i7 = i19;
                i8 = i12;
                i2 = i16;
            } else {
                i7 = i19;
                i8 = i12;
            }
            while (i8 < i2) {
                i19 = i20;
                i9 = i21;
                i10 = i18;
                while (true) {
                    if (i9 > i17 && i19 > i17) {
                        break;
                    }
                    i21 = i10 + 1;
                    i19 = (i10 + i10) + i19;
                    i9 = (i10 + i21) + i9;
                    i10 = i21;
                }
                i12 = (i - i10) + 1;
                if (i12 < this.ai * 1947951707) {
                    i12 = this.ai * 1947951707;
                }
                i20 = i + i10;
                i18 = i20 > this.ae * 428635993 ? this.ae * 428635993 : i20;
                i21 = ((this.aq * 1462922907) * i8) + i12;
                i20 = i12;
                while (i20 < i18) {
                    i11 = this.ad[i21];
                    if (i11 == 0) {
                        this.ad[i21] = i13;
                        i12 = i21 + 1;
                    } else {
                        this.ad[i21] = ((ViewCompat.MEASURED_STATE_MASK & i11) == 0 ? ViewCompat.MEASURED_STATE_MASK : (i11 | i5) & ViewCompat.MEASURED_STATE_MASK) | ((((((i11 & 16711935) * i15) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i11) * i15) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + i14);
                        i12 = i21 + 1;
                    }
                    i20++;
                    i21 = i12;
                }
                i8++;
                i12 = i7 - 1;
                i20 = i19 - (i7 + i12);
                i21 = i9 - (i12 + i12);
                i7 = i12;
                i18 = i10;
            }
            i18 = -i7;
            i12 = (i18 * i18) + i17;
            i20 = i12 - i3;
            i12 -= i18;
            i10 = i8;
            i21 = i3;
            i7 = i18;
            while (i10 < i16) {
                i18 = i12;
                i19 = i20;
                i9 = i21;
                while (i18 > i17 && i19 > i17) {
                    i21 = i9 - 1;
                    i18 -= i9 + i21;
                    i19 -= i21 + i21;
                    i9 = i21;
                }
                i12 = i - i9;
                if (i12 < this.ai * 1947951707) {
                    i12 = this.ai * 1947951707;
                }
                i20 = i9 + i;
                i8 = i20 > (this.ae * 428635993) + -1 ? (this.ae * 428635993) - 1 : i20;
                i20 = ((this.aq * 1462922907) * i10) + i12;
                i21 = i12;
                while (i21 <= i8) {
                    i11 = this.ad[i20];
                    if (i11 == 0) {
                        this.ad[i20] = i13;
                    } else {
                        this.ad[i20] = ((ViewCompat.MEASURED_STATE_MASK & i11) == 0 ? ViewCompat.MEASURED_STATE_MASK : (i11 | i5) & ViewCompat.MEASURED_STATE_MASK) | ((((((i11 & 16711935) * i15) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i11) * i15) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + i14);
                    }
                    i21++;
                    i20++;
                }
                i12 = (i7 + i7) + i18;
                i18 = i7 + 1;
                i20 = (i7 + i18) + i19;
                i10++;
                i21 = i9;
                i7 = i18;
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
                i5 = (i4 * i10) + 0;
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
                ea.ao(this.ad, eeVar.ad, 0, i5, i8, i11, i7, i9, i4, -2038550413);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(int i, int i2, int i3, int i4, int i5, int i6) {
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
            int i7 = this.aq;
            int i8 = i + ((this.aq * 1462922907) * i2);
            for (int i9 = -i4; i9 < 0; i9++) {
                int i10 = -i3;
                while (i10 < 0) {
                    this.ad[i8] = i5;
                    i10++;
                    i8++;
                }
                i8 += (i7 * 1462922907) - i3;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.ax(");
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
                i14 = i7 + (i15 * i13);
                i9 += i13;
            } else {
                i10 = i6;
                i18 = i12;
                i14 = i7;
            }
            lh.av(this.ad, efVar.ad, efVar.aq, i14, i17, i18, i9, i10, i8, i15, i16, i11, -86352114);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.ay(");
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
                lq.ac(this.ad, eeVar.ad, i4, i8, i5, i7, i11, i9, (byte) 16);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.az(");
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
                        i11 = (i7 << 8) - ((floor * floor3) >> 4);
                        i10 = (i8 << 8) + ((floor * floor4) >> 4);
                        if (floor4 == 0) {
                            if (floor3 == 0) {
                                i15 = i12;
                                for (i17 = i9; i17 < 0; i17++) {
                                    if (i11 >= 0 && i10 >= 0 && i11 - (eeVar.aq << 12) < 0 && i10 - (eeVar.ar << 12) < 0) {
                                        floor = i15;
                                        for (i9 = floor2; i9 < 0; i9++) {
                                            i12 = eeVar.ad[((i10 >> 12) * eeVar.aq) + (i11 >> 12)];
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
                                i16 = i11;
                                i17 = i12;
                                while (i13 < 0) {
                                    i9 = ((floor3 * i14) >> 4) + i10;
                                    if (i16 >= 0) {
                                        if (i16 - (eeVar.aq << 12) < 0) {
                                            floor = i9 - (eeVar.ar << 12);
                                            if (floor >= 0) {
                                                floor = (floor3 - floor) / floor3;
                                                i15 = floor2 + floor;
                                                i9 += floor * floor3;
                                                floor += i17;
                                            } else {
                                                i15 = floor2;
                                                floor = i17;
                                            }
                                            i11 = (i9 - floor3) / floor3;
                                            if (i11 <= i15) {
                                                i11 = i15;
                                            }
                                            while (i11 < 0) {
                                                i15 = eeVar.ad[((i9 >> 12) * eeVar.aq) + (i16 >> 12)];
                                                if (i15 != 0) {
                                                    this.ad[floor] = i15;
                                                }
                                                floor++;
                                                i9 += floor3;
                                                i11++;
                                            }
                                        }
                                    }
                                    i17 += this.aq * 1462922907;
                                    i13++;
                                    i16 -= floor3;
                                }
                            } else {
                                i13 = i9;
                                i16 = i11;
                                i17 = i12;
                                while (i13 < 0) {
                                    i9 = ((i14 * floor3) >> 4) + i10;
                                    if (i16 >= 0) {
                                        if (i16 - (eeVar.aq << 12) < 0) {
                                            if (i9 < 0) {
                                                floor = ((floor3 - 1) - i9) / floor3;
                                                i15 = floor2 + floor;
                                                i9 += floor * floor3;
                                                floor += i17;
                                            } else {
                                                i15 = floor2;
                                                floor = i17;
                                            }
                                            i11 = (((i9 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                                            if (i11 <= i15) {
                                                i11 = i15;
                                            }
                                            while (i11 < 0) {
                                                i15 = eeVar.ad[(i16 >> 12) + ((i9 >> 12) * eeVar.aq)];
                                                if (i15 != 0) {
                                                    this.ad[floor] = i15;
                                                }
                                                floor++;
                                                i9 += floor3;
                                                i11++;
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
                                i16 = i10;
                                i17 = i12;
                                while (i13 < 0) {
                                    i9 = ((floor4 * i14) >> 4) + i11;
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
                                            i10 = (i9 - floor4) / floor4;
                                            if (i10 <= i15) {
                                                i10 = i15;
                                            }
                                            while (i10 < 0) {
                                                i15 = eeVar.ad[(eeVar.aq * (i16 >> 12)) + (i9 >> 12)];
                                                if (i15 != 0) {
                                                    this.ad[floor] = i15;
                                                }
                                                floor++;
                                                i9 += floor4;
                                                i10++;
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
                                i17 = floor2;
                                while (i13 < 0) {
                                    i10 = ((floor4 * i14) >> 4) + i7;
                                    i9 = ((i14 * floor3) >> 4) + i16;
                                    floor = i10 - (eeVar.aq << 12);
                                    if (floor >= 0) {
                                        floor = (floor4 - floor) / floor4;
                                        i11 = i17 + floor;
                                        i10 += floor * floor4;
                                        i9 += floor3 * floor;
                                        floor += i12;
                                    } else {
                                        i11 = i17;
                                        floor = i12;
                                    }
                                    i15 = (i10 - floor4) / floor4;
                                    if (i15 <= i11) {
                                        i15 = i11;
                                    }
                                    i11 = i9 - (eeVar.ar << 12);
                                    if (i11 >= 0) {
                                        i11 = (floor3 - i11) / floor3;
                                        i15 += i11;
                                        i10 += i11 * floor4;
                                        i9 += floor3 * i11;
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
                                    i16 += floor4;
                                    i7 -= floor3;
                                }
                            } else {
                                i13 = i9;
                                i16 = i10;
                                i7 = i11;
                                while (i13 < 0) {
                                    i10 = ((floor4 * i14) >> 4) + i7;
                                    floor = ((floor3 * i14) >> 4) + i16;
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
                                        floor = eeVar.ad[(eeVar.aq * (i9 >> 12)) + (i10 >> 12)];
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
                                    i16 += floor4;
                                    i7 -= floor3;
                                }
                            }
                        } else if (floor3 == 0) {
                            i13 = i9;
                            i16 = i10;
                            while (i13 < 0) {
                                floor = ((floor4 * i14) >> 4) + i11;
                                if (i16 >= 0) {
                                    if (i16 - (eeVar.ar << 12) < 0) {
                                        if (floor < 0) {
                                            i9 = ((floor4 - 1) - floor) / floor4;
                                            i17 = floor2 + i9;
                                            floor += i9 * floor4;
                                            i10 = i9 + i12;
                                        } else {
                                            i17 = floor2;
                                            i10 = i12;
                                        }
                                        i15 = (((floor + 1) - (eeVar.aq << 12)) - floor4) / floor4;
                                        if (i15 > i17) {
                                            i9 = floor;
                                        } else {
                                            i9 = floor;
                                            i15 = i17;
                                        }
                                        while (i15 < 0) {
                                            floor = eeVar.ad[((i16 >> 12) * eeVar.aq) + (i9 >> 12)];
                                            if (floor != 0) {
                                                this.ad[i10] = floor;
                                            }
                                            i9 += floor4;
                                            i15++;
                                            i10++;
                                        }
                                    }
                                }
                                i12 += this.aq * 1462922907;
                                i13++;
                                i16 += floor4;
                            }
                        } else if (floor3 < 0) {
                            i13 = i9;
                            i16 = i10;
                            i7 = i11;
                            i17 = i14;
                            while (i13 < 0) {
                                i10 = ((floor4 * i17) >> 4) + i7;
                                i9 = ((i17 * floor3) >> 4) + i16;
                                if (i10 < 0) {
                                    floor = ((floor4 - 1) - i10) / floor4;
                                    i11 = floor2 + floor;
                                    i10 += floor * floor4;
                                    i9 += floor3 * floor;
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
                                    i10 += i11 * floor4;
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
                                i16 += floor4;
                                i7 -= floor3;
                            }
                        } else {
                            i13 = i9;
                            i16 = i10;
                            i7 = i11;
                            while (i13 < 0) {
                                i10 = ((floor4 * i14) >> 4) + i7;
                                floor = ((floor3 * i14) >> 4) + i16;
                                if (i10 < 0) {
                                    i11 = ((floor4 - 1) - i10) / floor4;
                                    i9 = floor2 + i11;
                                    i10 += floor4 * i11;
                                    floor += i11 * floor3;
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
                                    i10 += i9 * floor4;
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
                                    floor = eeVar.ad[(i10 >> 12) + (eeVar.aq * (i9 >> 12))];
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
                                i16 += floor4;
                                i7 -= floor3;
                            }
                        }
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("em.bb(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bc() {
    }

    public final void be(int i, int i2, int i3, int i4, int i5) {
        ax(i, i2, i3, i4, i5 | ViewCompat.MEASURED_STATE_MASK, -1439378408);
    }

    public void bf(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8) {
        int i9 = -i3;
        try {
            int i10 = i9 / 2;
            int i11 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (i7 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i12 = ((i10 * cos) + (sin * i11)) + (i5 << 16);
            int i13 = (i6 << 16) + ((i11 * cos) - (i10 * sin));
            int i14 = i + ((this.aq * 1462922907) * i2);
            i10 = 0;
            while (true) {
                int i15 = i10;
                if (i15 < i4) {
                    i11 = i12;
                    int i16 = i13;
                    i10 = i14;
                    for (int i17 = i9; i17 < 0; i17++) {
                        int i18 = eeVar.ad[((i16 >> 16) * eeVar.aq) + (i11 >> 16)];
                        if (i18 != 0) {
                            this.ad[i10] = i18;
                        }
                        i10++;
                        i11 += cos;
                        i16 -= sin;
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
            stringBuilder.append("em.bf(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public void bg() {
        if (this.ad != null) {
            ad.ba(this.ad, this.ad.length, (byte) -1);
        }
    }

    public final void bh(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9 = 0;
            int i10 = -1854335939 / i4;
            if (i < this.ai * 331638879) {
                i3 -= (this.ai * 1872008237) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * -709973917) {
                i9 = (((this.al * -1695563520) - i2) * i10) + 0;
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -429436701;
            }
            if (i3 + i > this.ae * -911728161) {
                i3 = (this.ae * -1793248251) - i;
            }
            if (i2 + i4 > this.aj * -895045466) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i11 = this.aq;
            int i12 = i + ((this.aq * 1462922907) * i2);
            int i13 = -i4;
            int i14 = i9;
            while (i13 < 0) {
                i9 = (-157111810 - i14) >> 8;
                int i15 = i14 >> 8;
                int i16 = (((i8 * i15) + (i7 * i9)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
                if (i16 == 0) {
                    i9 = this.aq * 767703878;
                } else {
                    int i17 = ((((i9 * (MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5)) + (i15 * (1962413137 & i6))) & 16711680) + ((((-1744110262 & i5) * i9) + ((1819845814 & i6) * i15)) & -809298971)) >>> 8;
                    int i18 = i16 << 24;
                    int i19 = -28917902 - i16;
                    i15 = -i3;
                    while (i15 < 0) {
                        i9 = this.ad[i12];
                        if (i9 == 0) {
                            this.ad[i12] = i18 | i17;
                        } else {
                            this.ad[i12] = ((((((i9 & 16711935) * i19) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i19) >> 8) & 1134622963)) + (((((1150189370 & i17) * i16) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i17) * i16) >> 8) & 1925208211))) | ((i9 | i18) & ViewCompat.MEASURED_STATE_MASK);
                        }
                        i15++;
                        i12++;
                    }
                    i9 = (-729183479 * i11) - i3;
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
            int i6 = (((((eeVar.aq + eeVar.al) * i3) + eeVar.ai) - 1) / eeVar.ai) + i;
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
            if (i8 > this.aj * 157809585) {
                i8 = this.aj * 157809585;
            }
            if (i5 < i6 && i7 < r8) {
                int i9 = ((this.aq * 1462922907) * i7) + i5;
                int i10 = this.aq;
                if (i9 < this.ad.length) {
                    int i11 = i6;
                    int i12 = i5;
                    for (int i13 = i7; i13 < i8; i13++) {
                        int i14 = i12;
                        while (i14 < i11) {
                            int i15 = (i14 - i) << 4;
                            int i16 = (i13 - i2) << 4;
                            i7 = ((eeVar.ai * i15) / i3) - (eeVar.al << 4);
                            int i17 = (((i15 + 16) * eeVar.ai) / i3) - (eeVar.al << 4);
                            i15 = ((eeVar.ae * i16) / i4) - (eeVar.aj << 4);
                            i16 = (((i16 + 16) * eeVar.ae) / i4) - (eeVar.aj << 4);
                            int i18 = ((i17 - i7) * (i16 - i15)) >> 1;
                            if (i18 == 0) {
                                i7 = i9;
                                i15 = i11;
                                i16 = i8;
                            } else {
                                int i19 = 0;
                                if (i7 < 0) {
                                    i7 = 0;
                                }
                                if (i17 >= (eeVar.aq << 4)) {
                                    i17 = eeVar.aq << 4;
                                }
                                if (i15 < 0) {
                                    i15 = 0;
                                }
                                if (i16 >= (eeVar.ar << 4)) {
                                    i16 = eeVar.ar << 4;
                                }
                                int i20 = i17 - 1;
                                int i21 = i16 - 1;
                                int i22 = i7 >> 4;
                                int i23 = i20 >> 4;
                                int i24 = i15 >> 4;
                                int i25 = i21 >> 4;
                                int i26 = 0;
                                i17 = 0;
                                int i27 = 0;
                                int i28 = i24;
                                int i29 = i11;
                                int i30 = i8;
                                while (i28 <= i25) {
                                    i16 = i24 == i28 ? 16 - (i15 & 15) : 16;
                                    if (i28 == i25) {
                                        i16 = (i21 & 15) + 1;
                                    }
                                    int i31 = i22;
                                    i8 = i26;
                                    while (i31 <= i23) {
                                        i26 = eeVar.ad[(eeVar.aq * i28) + i31];
                                        if (i26 != 0) {
                                            i11 = i22 == i31 ? (16 - (i7 & 15)) * i16 : i23 == i31 ? ((i20 & 15) + 1) * i16 : i16 << 4;
                                            i8 += i11;
                                            i17 += ((i26 >> 16) & 255) * i11;
                                            i27 += ((i26 >> 8) & 255) * i11;
                                            i19 += i11 * (i26 & 255);
                                        }
                                        i31++;
                                        i8 = i8;
                                    }
                                    i28++;
                                    i26 = i8;
                                }
                                if (i26 >= i18) {
                                    this.ad[i9] = ((i19 / i26) + (((i17 / i26) << 16) + ((i27 / i26) << 8))) | ViewCompat.MEASURED_STATE_MASK;
                                }
                                i7 = i9 + 1;
                                i15 = i29;
                                i16 = i30;
                            }
                            i9 = i7;
                            i14++;
                            i8 = i16;
                            i11 = i15;
                        }
                        i9 += (1462922907 * i10) - (i6 - i5);
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void bj(int i, int i2, int i3, int i4, int i5) {
        ax(i, i2, i3, i4, i5 | 2023156187, 268500656);
    }

    public void bk(ee eeVar, int i, int i2, int i3, int i4, byte b) {
        if (i3 >= 255) {
            try {
                aw(eeVar, i, i2, 16711935);
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("em.bk(");
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
            hz.bm(this.ad, eeVar.ad, 0, i6, i9, i12, i8, i10, i5, i3, i4, 958891817);
        }
    }

    public void bl(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        try {
            int i10 = (-i3) / 2;
            int i11 = (-i4) / 2;
            double d = ((double) i7) / 326.11d;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i12 = (i5 << 16) + ((cos * i10) + (i11 * sin));
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
                        this.ad[i11] = eeVar.ad[(i10 >> 16) + ((i13 >> 16) * eeVar.aq)];
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
            stringBuilder.append("em.bl(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public final void bn(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9 = 0;
            int i10 = 65536 / i4;
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * -1036081535) - i;
                i = this.ai * 1630684888;
            }
            if (i2 < this.al * -709973917) {
                i9 = (((this.al * -709973917) - i2) * i10) + 0;
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i > this.ae * 428635993) {
                i3 = (this.ae * -324540825) - i;
            }
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i11 = this.aq;
            int i12 = i + ((this.aq * 168133341) * i2);
            int i13 = -i4;
            int i14 = i9;
            while (i13 < 0) {
                i9 = (65536 - i14) >> 8;
                int i15 = i14 >> 8;
                int i16 = (((i8 * i15) + (i7 * i9)) & 874825798) >>> 8;
                if (i16 == 0) {
                    i9 = this.aq * 1462922907;
                } else {
                    int i17 = ((((i9 * (MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5)) + (i15 * (MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6))) & 16711680) + ((((16711935 & i5) * i9) + ((1324417335 & i6) * i15)) & -16711936)) >>> 8;
                    int i18 = i16 << 24;
                    int i19 = 255 - i16;
                    i15 = -i3;
                    while (i15 < 0) {
                        i9 = this.ad[i12];
                        if (i9 == 0) {
                            this.ad[i12] = i18 | i17;
                        } else {
                            this.ad[i12] = ((((((i9 & -1749746105) * i19) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i19) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + (((((327242969 & i17) * i16) >> 8) & -1858392152) + ((((16711935 & i17) * i16) >> 8) & 535874968))) | ((i9 | i18) & -2012999161);
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
            int i10 = eeVar.ar + i2 <= i6 ? eeVar.ar : i6 - i2;
            if (i < 0) {
                i8 = -i;
            }
            int i11 = (((i2 + i4) + i9) * (this.aq * 1462922907)) + ((i + i3) + i8);
            int i12 = i2 + i9;
            for (int i13 = i9; i13 < i10; i13++) {
                int i14;
                int i15;
                i9 = iArr[i12];
                int i16 = iArr2[i12];
                if (i < i9) {
                    i14 = i9 - i;
                    i15 = (i14 - i8) + i11;
                } else {
                    i15 = i11;
                    i14 = i8;
                }
                i9 += i16;
                if (eeVar.aq + i <= i9) {
                    i16 = eeVar.aq;
                    i9 = i14;
                } else {
                    i16 = i9 - i;
                    i9 = i14;
                }
                while (i9 < i16) {
                    i14 = eeVar.ad[(eeVar.aq * i13) + i9];
                    if (i14 != 0) {
                        this.ad[i15] = i14;
                    }
                    i9++;
                    i15++;
                }
                i11 += this.aq * 1462922907;
                i12++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("em.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void bp(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, boolean z) {
        int i8 = i3 + i;
        if (i8 >= 0) {
            int i9 = i4 + i2;
            if (i9 >= 0 && i < this.aq * 1462922907 && i2 < this.ar * -262317418) {
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
                i9 = i + i8 > this.aq * 1462922907 ? (this.aq * 918392163) - i : i8;
                if (i4 + i2 > this.ar * -1622836677) {
                    i4 = (this.ar * 312583113) - i2;
                }
                int length = bArr.length / i7;
                int i12 = (this.aq * -1509121484) - i9;
                int i13;
                int i14;
                int i15;
                int i16;
                if (!z || (255 == (i5 >>> 24) && 277983376 == (i6 >>> 24))) {
                    i13 = i11 + i2;
                    i11 = (((967321391 * this.aq) * i13) + i) + i10;
                    for (i14 = i13; i14 < i4 + i13; i14++) {
                        i15 = i + i10;
                        i8 = i15;
                        while (true) {
                            i16 = i11;
                            if (i8 >= i15 + i9) {
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
                int i17 = i11 + i2;
                i11 = (((1462922907 * this.aq) * i17) + i) + i10;
                for (i13 = i17; i13 < i4 + i17; i13++) {
                    i16 = i10 + i;
                    i15 = i16;
                    while (true) {
                        i14 = i11;
                        if (i15 >= i16 + i9) {
                            break;
                        }
                        i11 = bArr[(((i13 - i2) % length) * i7) + ((i15 - i) % i7)] != (byte) 0 ? i6 : i5;
                        int i18 = this.ad[i14];
                        if (i18 == 0) {
                            i8 = i14 + 1;
                            this.ad[i14] = i11;
                        } else {
                            int i19 = i11 >>> 24;
                            int i20 = 647274022 - i19;
                            i8 = i14 + 1;
                            this.ad[i14] = ((((((i11 & 1340590984) * i19) + ((i18 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i20)) & -1106326120) + ((((16711935 & i18) * i20) + ((1362314192 & i11) * i19)) & -16711936)) >>> 8) | ((i11 | i18) & 1051743987);
                        }
                        i11 = i8;
                        i15++;
                    }
                    i11 = i14 + i12;
                }
            }
        }
    }

    public void bq(ee eeVar, int i, int i2, int i3, int i4, int i5, byte b) {
        if (i5 > 0 && i3 > 0 && i4 > 0) {
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
                int i18 = i6 + i2;
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
                fl.cu(this.ad, eeVar.ad, 0, i14, i17, i18, i9, i10, i8, i15, i16, i11, i5, -338192518);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("em.bq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public final void br(int i, int i2, int i3, int i4, int i5) {
        ax(i, i2, i3, i4, i5 | ViewCompat.MEASURED_STATE_MASK, -375467437);
    }

    public void bs(ee eeVar, int i, int i2, int i3, byte b) {
        if (i3 != 0) {
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
                    ew.bd(this.ad, eeVar.ad, 0, i5, i8, i11, i7, i9, i4, i3, 365447282);
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("em.bs(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public final void bt(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > 0 && i4 > 0) {
            int i9 = 0;
            int i10 = 65536 / i4;
            if (i < this.ai * 1863350650) {
                i3 -= (this.ai * 862387606) - i;
                i = this.ai * 1947951707;
            }
            if (i2 < this.al * -709973917) {
                i9 = (((this.al * -709973917) - i2) * i10) + 0;
                i4 -= (this.al * 1842095114) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * -1634726312) - i2;
            }
            int i11 = this.aq;
            int i12 = i + ((this.aq * 1462922907) * i2);
            int i13 = -i4;
            int i14 = i9;
            while (i13 < 0) {
                i9 = (65536 - i14) >> 8;
                int i15 = i14 >> 8;
                int i16 = (((i8 * i15) + (i7 * i9)) & -1196027498) >>> 8;
                if (i16 == 0) {
                    i9 = this.aq * -552808228;
                } else {
                    int i17 = ((((i9 * (216452964 & i5)) + (i15 * (-1695717907 & i6))) & -1046035330) + ((((2016820556 & i5) * i9) + ((-1237112721 & i6) * i15)) & -16711936)) >>> 8;
                    int i18 = i16 << 24;
                    int i19 = -819822982 - i16;
                    i15 = -i3;
                    while (i15 < 0) {
                        i9 = this.ad[i12];
                        if (i9 == 0) {
                            this.ad[i12] = i18 | i17;
                        } else {
                            this.ad[i12] = ((((((i9 & 16711935) * i19) >> 8) & 16711935) + ((((406693099 & i9) * i19) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i17) * i16) >> 8) & 27591934) + ((((16711935 & i17) * i16) >> 8) & 16711935))) | ((i9 | i18) & ViewCompat.MEASURED_STATE_MASK);
                        }
                        i15++;
                        i12++;
                    }
                    i9 = (1455417945 * i11) - i3;
                }
                i13++;
                i14 += i10;
                i12 += i9;
            }
        }
    }

    public final void bu(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            if (i6 >= 255) {
                al(i, i2, i3, i4, i5, (byte) 1);
                return;
            }
            int i7 = i6 << 24;
            if (i < this.ai * -1019119597) {
                i3 -= (this.ai * 1934889142) - i;
                i = 91233146 * this.ai;
            }
            if (i2 < this.al * -565571261) {
                i4 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i + i3 > this.ae * -1952134449) {
                i3 = (this.ae * 428635993) - i;
            }
            if (i2 + i4 > this.aj * 1234552250) {
                i4 = (this.aj * 1419626581) - i2;
            }
            int i8 = -1319337629 - i6;
            int i9 = this.aq;
            int i10 = ((this.aq * 1462922907) * i2) + i;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 < i4) {
                    int i13 = -i3;
                    while (i13 < 0) {
                        int i14 = this.ad[i10];
                        if (i14 == 0) {
                            this.ad[i10] = i7 | i5;
                        } else {
                            this.ad[i10] = ((-534134169 & i14) == 0 ? ViewCompat.MEASURED_STATE_MASK : (i14 | i7) & -747882649) | ((((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i8) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i14) * i8) >> 8) & 1803185568)) + (((((16711935 & i5) * i6) >> 8) & 16711935) + ((((461962852 & i5) * i6) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)));
                        }
                        i13++;
                        i10++;
                    }
                    i10 += (1462922907 * i9) - i3;
                    i11 = i12 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bv() {
    }

    public final void bw(int i, int i2, int i3, int i4, int i5) {
        ax(i, i2, i3, i4, i5 | ViewCompat.MEASURED_STATE_MASK, -587941983);
    }

    public final void bx(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 0) {
            if (i6 >= 255) {
                al(i, i2, i3, i4, i5, (byte) 1);
                return;
            }
            int i7 = i6 << 24;
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
            if (i2 + i4 > this.aj * 157809585) {
                i4 = (this.aj * 157809585) - i2;
            }
            int i8 = 255 - i6;
            int i9 = this.aq;
            int i10 = ((this.aq * 1462922907) * i2) + i;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 < i4) {
                    int i13 = -i3;
                    while (i13 < 0) {
                        int i14 = this.ad[i10];
                        if (i14 == 0) {
                            this.ad[i10] = i7 | i5;
                        } else {
                            i11 = ViewCompat.MEASURED_STATE_MASK;
                            if ((ViewCompat.MEASURED_STATE_MASK & i14) != 0) {
                                i11 = ViewCompat.MEASURED_STATE_MASK & (i14 | i7);
                            }
                            this.ad[i10] = i11 | ((((((i14 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i8) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i14) * i8) >> 8) & 16711935)) + (((((16711935 & i5) * i6) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5) * i6) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)));
                        }
                        i13++;
                        i10++;
                    }
                    i10 += (1462922907 * i9) - i3;
                    i11 = i12 + 1;
                } else {
                    return;
                }
            }
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
                    i4 = (this.ar * -1622836677) - i2;
                }
                int length = bArr.length / i7;
                int i12 = (this.aq * 1462922907) - i9;
                int i13;
                int i14;
                int i15;
                int i16;
                if (!z || (255 == (i5 >>> 24) && 255 == (i6 >>> 24))) {
                    i13 = i11 + i2;
                    i11 = (((1462922907 * this.aq) * i13) + i) + i10;
                    for (i14 = i13; i14 < i4 + i13; i14++) {
                        i15 = i + i10;
                        i8 = i15;
                        while (true) {
                            i16 = i11;
                            if (i8 >= i15 + i9) {
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
                i11 = (((1462922907 * this.aq) * i13) + i) + i10;
                for (i14 = i13; i14 < i4 + i13; i14++) {
                    i15 = i10 + i;
                    i8 = i15;
                    while (true) {
                        i16 = i11;
                        if (i8 >= i15 + i9) {
                            break;
                        }
                        i11 = bArr[(((i14 - i2) % length) * i7) + ((i8 - i) % i7)] != (byte) 0 ? i6 : i5;
                        int i17 = this.ad[i16];
                        if (i17 == 0) {
                            this.ad[i16] = i11;
                        } else {
                            int i18 = i11 >>> 24;
                            int i19 = 255 - i18;
                            this.ad[i16] = ((((((i11 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i18) + ((i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i19)) & 16711680) + ((((16711935 & i17) * i19) + ((16711935 & i11) * i18)) & -16711936)) >>> 8) | ((i11 | i17) & ViewCompat.MEASURED_STATE_MASK);
                        }
                        i11 = i16 + 1;
                        i8++;
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
            int i12 = i + ((this.aq * 1462922907) * i2);
            int i13 = -i4;
            int i14 = i9;
            while (i13 < 0) {
                i9 = (65536 - i14) >> 8;
                int i15 = i14 >> 8;
                int i16 = (((i8 * i15) + (i7 * i9)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
                if (i16 == 0) {
                    i9 = this.aq * 1462922907;
                } else {
                    int i17 = ((((i9 * (MotionEventCompat.ACTION_POINTER_INDEX_MASK & i5)) + (i15 * (MotionEventCompat.ACTION_POINTER_INDEX_MASK & i6))) & 16711680) + ((((16711935 & i5) * i9) + ((16711935 & i6) * i15)) & -16711936)) >>> 8;
                    int i18 = i16 << 24;
                    int i19 = 255 - i16;
                    i15 = -i3;
                    while (i15 < 0) {
                        i9 = this.ad[i12];
                        if (i9 == 0) {
                            this.ad[i12] = i18 | i17;
                        } else {
                            this.ad[i12] = ((((((i9 & 16711935) * i19) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i19) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i17) * i16) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + ((((16711935 & i17) * i16) >> 8) & 16711935))) | ((i9 | i18) & ViewCompat.MEASURED_STATE_MASK);
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

    public final void ca(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0) {
            if (i5 >= 920128889) {
                ap(i, i2, i3, i4, -1952038969);
                return;
            }
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            if (i3 < 0) {
                i3 = -i3;
            }
            int i11 = ViewCompat.MEASURED_SIZE_MASK & i4;
            int i12 = (i5 << 24) + i11;
            int i13 = ((((16711935 & i11) * i5) >> 8) & 841350898) + ((((i11 & -2074542665) * i5) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            int i14 = -636953000 - i5;
            i11 = i2 - i3;
            if (i11 < this.al * -938249424) {
                i11 = this.al * 1786498063;
            }
            int i15 = (i3 + i2) + 1;
            if (i15 > this.aj * 39480914) {
                i15 = this.aj * 1261513928;
            }
            int i16 = i3 * i3;
            int i17 = 0;
            int i18 = i2 - i11;
            int i19 = i18 * i18;
            int i20 = i19 - i18;
            if (i2 > i15) {
                i6 = i18;
                i7 = i11;
                i2 = i15;
            } else {
                i6 = i18;
                i7 = i11;
            }
            while (i7 < i2) {
                i18 = i19;
                i8 = i20;
                i9 = i17;
                while (true) {
                    if (i8 > i16 && i18 > i16) {
                        break;
                    }
                    i20 = i9 + 1;
                    i18 = (i9 + i9) + i18;
                    i8 = (i9 + i20) + i8;
                    i9 = i20;
                }
                i11 = (i - i9) + 1;
                if (i11 < this.ai * 1947951707) {
                    i11 = this.ai * 1054523313;
                }
                i19 = i + i9;
                if (i19 > this.ae * -1222448246) {
                    i19 = this.ae * 428635993;
                }
                i17 = ((this.aq * -759545307) * i7) + i11;
                i20 = i11;
                while (i20 < i19) {
                    i10 = this.ad[i17];
                    if (i10 == 0) {
                        this.ad[i17] = i12;
                    } else {
                        this.ad[i17] = ((1591432473 & i10) == 0 ? 742373401 : (i10 | i5) & 729836228) | ((((((i10 & 63814384) * i14) >> 8) & -1414673835) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i10) * i14) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + i13);
                    }
                    i20++;
                    i17++;
                }
                i7++;
                i11 = i6 - 1;
                i19 = i18 - (i6 + i11);
                i20 = i8 - (i11 + i11);
                i6 = i11;
                i17 = i9;
            }
            i17 = -i6;
            i11 = (i17 * i17) + i16;
            i19 = i11 - i3;
            i11 -= i17;
            i20 = i3;
            i9 = i7;
            i6 = i17;
            while (i9 < i15) {
                i17 = i11;
                i18 = i19;
                i8 = i20;
                while (i17 > i16 && i18 > i16) {
                    i20 = i8 - 1;
                    i17 -= i8 + i20;
                    i18 -= i20 + i20;
                    i8 = i20;
                }
                i11 = i - i8;
                if (i11 < this.ai * -1156746039) {
                    i11 = -641186188 * this.ai;
                }
                i19 = i8 + i;
                if (i19 > (this.ae * 1181421767) - 1) {
                    i19 = (this.ae * 428635993) - 1;
                }
                i20 = ((this.aq * 1462922907) * i9) + i11;
                i7 = i11;
                while (i7 <= i19) {
                    i10 = this.ad[i20];
                    if (i10 == 0) {
                        this.ad[i20] = i12;
                    } else {
                        i11 = ViewCompat.MEASURED_STATE_MASK;
                        if ((ViewCompat.MEASURED_STATE_MASK & i10) != 0) {
                            i11 = (i10 | i5) & -1294730759;
                        }
                        this.ad[i20] = i11 | ((((((i10 & 1958690789) * i14) >> 8) & 16711935) + ((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i10) * i14) >> 8) & -1599351026)) + i13);
                    }
                    i7++;
                    i20++;
                }
                i11 = (i6 + i6) + i17;
                i17 = i6 + 1;
                i19 = (i6 + i17) + i18;
                i20 = i8;
                i9++;
                i6 = i17;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cb(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 255) {
                ak(i, i2, i3, i4, 110577252);
            } else if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
                if (i2 < this.al * -709973917) {
                    i3 -= (this.al * -709973917) - i2;
                    i2 = this.al * -709973917;
                }
                if (i2 + i3 > this.aj * 157809585) {
                    i3 = (this.aj * 157809585) - i2;
                }
                int i6 = 255 - i5;
                int i7 = i5 << 24;
                int i8 = ((this.aq * 1462922907) * i2) + i;
                for (int i9 = 0; i9 < i3; i9++) {
                    if (this.ad[i8] == 0) {
                        this.ad[i8] = i4 | i7;
                    } else {
                        int i10 = this.ad[i8];
                        int i11 = this.ad[i8];
                        int i12 = this.ad[i8];
                        i10 = (((((((i10 >> 16) & 255) * i6) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i11 >> 8) & 255) * i6) + (((i4 >> 8) & 255) * i5)) >> 8) << 8)) + ((((i12 & 255) * i6) + ((i4 & 255) * i5)) >> 8);
                        this.ad[i8] = i10 | ((this.ad[i8] | i7) & ViewCompat.MEASURED_STATE_MASK);
                    }
                    i8 += this.aq * 1462922907;
                }
            }
        }
    }

    public final void cc(int i, int i2, int i3, int i4, int i5) {
        int i6 = (757258559 + i5) & 1211384830;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                ae(i, i2, i7 + 1, i6, -66543053);
                return;
            }
            ae(i7 + i, i2, (-i7) + 1, i6, 1655595826);
        } else if (i7 != 0) {
            int i9;
            int i10;
            if (i8 + i7 < 0) {
                i9 = i + i7;
                i7 = -i7;
                i10 = i2 + i8;
                i8 = -i8;
            } else {
                i9 = i;
                i10 = i2;
            }
            int i11;
            if (i7 > i8) {
                i10 = (i10 << 16) - 1467669918;
                i8 = (int) Math.floor((((double) (i8 << 16)) / ((double) i7)) + 0.5d);
                i7 += i9;
                if (i9 < this.ai * 1947951707) {
                    i10 += ((this.ai * 488641139) - i9) * i8;
                    i9 = this.ai * 864931303;
                }
                if (i7 >= this.ae * 428635993) {
                    i7 = (this.ae * -1085584571) - 1;
                }
                while (i9 <= i7) {
                    i11 = i10 >> 16;
                    if (i11 >= this.al * -709973917 && i11 < this.aj * 157809585) {
                        this.ad[(i11 * (this.aq * 1244139109)) + i9] = i6;
                    }
                    i10 += i8;
                    i9++;
                }
                return;
            }
            i9 = (i9 << 16) + 32768;
            i11 = (int) Math.floor((((double) (i7 << 16)) / ((double) i8)) + 0.5d);
            i7 = i8 + i10;
            if (i10 < this.al * -184763043) {
                i9 += ((this.al * -709973917) - i10) * i11;
                i10 = this.al * -709973917;
            }
            if (i7 >= this.aj * 157809585) {
                i7 = (this.aj * 157809585) - 1;
            }
            while (i10 <= i7) {
                i8 = i9 >> 16;
                if (i8 >= this.ai * 643345559 && i8 < this.ae * -1194603179) {
                    this.ad[i8 + ((this.aq * 1462922907) * i10)] = i6;
                }
                i9 += i11;
                i10++;
            }
        } else if (i8 >= 0) {
            ak(i, i2, i8 + 1, i6, -367977789);
        } else {
            ak(i, i8 + i2, (-i8) + 1, i6, -607337464);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cd(int i, int i2, int i3, int i4, int i5) {
        if (i < this.ai * -953929267) {
            i3 -= (this.ai * 1947951707) - i;
            i = 155338849 * this.ai;
        }
        if (i2 < this.al * 900026523) {
            i4 -= (this.al * -709973917) - i2;
            i2 = this.al * -709973917;
        }
        if (i + i3 > this.ae * -736466882) {
            i3 = (this.ae * 940614016) - i;
        }
        if (i4 + i2 > this.aj * 157809585) {
            i4 = (this.aj * 825855370) - i2;
        }
        int i6 = this.aq;
        int i7 = i + ((this.aq * 1462922907) * i2);
        for (int i8 = -i4; i8 < 0; i8++) {
            int i9 = -i3;
            while (i9 < 0) {
                this.ad[i7] = i5;
                i9++;
                i7++;
            }
            i7 += (53593322 * i6) - i3;
        }
    }

    /* Access modifiers changed, original: final */
    public final void ce(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 255) {
                ak(i, i2, i3, i4, -1446999506);
            } else if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
                if (i2 < this.al * -709973917) {
                    i3 -= (this.al * -709973917) - i2;
                    i2 = this.al * -709973917;
                }
                if (i2 + i3 > this.aj * 157809585) {
                    i3 = (this.aj * 157809585) - i2;
                }
                int i6 = 255 - i5;
                int i7 = i5 << 24;
                int i8 = ((this.aq * 1462922907) * i2) + i;
                for (int i9 = 0; i9 < i3; i9++) {
                    if (this.ad[i8] == 0) {
                        this.ad[i8] = i4 | i7;
                    } else {
                        int i10 = this.ad[i8];
                        int i11 = this.ad[i8];
                        int i12 = this.ad[i8];
                        i10 = (((((((i10 >> 16) & 255) * i6) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i11 >> 8) & 255) * i6) + (((i4 >> 8) & 255) * i5)) >> 8) << 8)) + ((((i12 & 255) * i6) + ((i4 & 255) * i5)) >> 8);
                        this.ad[i8] = i10 | ((this.ad[i8] | i7) & ViewCompat.MEASURED_STATE_MASK);
                    }
                    i8 += this.aq * 1462922907;
                }
            }
        }
    }

    public void cg(ef efVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i + efVar.aj;
        int i8 = efVar.ai + i2;
        int i9 = ((this.aq * -750451449) * i8) + i7;
        int i10 = efVar.al;
        int i11 = efVar.ar;
        int i12 = (this.aq * 1947393284) - i11;
        if (i8 < this.al * -1851886562) {
            i3 = (this.al * 940310566) - i8;
            i10 -= i3;
            i8 = -750210485 * this.al;
            i4 = (i11 * i3) + 0;
            i9 += i3 * (this.aq * -894501453);
        } else {
            i4 = 0;
        }
        i8 += i10;
        i3 = i8 > this.aj * 1315969306 ? i10 - (i8 - (this.aj * -1373037013)) : i10;
        if (i7 < this.ai * 1022371263) {
            i7 = (this.ai * 1583548982) - i7;
            i8 = this.ai * -1618089793;
            i10 = i4 + i7;
            i9 += i7;
            i5 = i11 - i7;
            i6 = i7 + 0;
            i12 = i7 + i12;
        } else {
            i8 = i7;
            i10 = i4;
            i5 = i11;
            i6 = 0;
        }
        i8 += i5;
        if (i8 > this.ae * 2111460649) {
            i8 -= this.ae * 241713077;
            i7 = i5 - i8;
            i6 += i8;
            i11 = i12 + i8;
        } else {
            i7 = i5;
            i11 = i12;
        }
        if (i7 > 0 && i3 > 0) {
            au.af(this.ad, efVar.ad, efVar.aq, i10, i9, i7, i3, i11, i6, (byte) 1);
        }
    }

    public void ch(ef efVar, int i, int i2) {
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
            au.af(this.ad, efVar.ad, efVar.aq, i7, i3, i5, i12, i9, i11, (byte) 1);
        }
    }

    /* Access modifiers changed, original: final */
    public final void ci(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 255) {
                ak(i, i2, i3, i4, -538177915);
            } else if (i >= this.ai * 1947951707 && i < this.ae * 428635993) {
                if (i2 < this.al * -709973917) {
                    i3 -= (this.al * -709973917) - i2;
                    i2 = this.al * -709973917;
                }
                if (i2 + i3 > this.aj * 157809585) {
                    i3 = (this.aj * 157809585) - i2;
                }
                int i6 = 255 - i5;
                int i7 = i5 << 24;
                int i8 = ((this.aq * 1462922907) * i2) + i;
                for (int i9 = 0; i9 < i3; i9++) {
                    if (this.ad[i8] == 0) {
                        this.ad[i8] = i4 | i7;
                    } else {
                        int i10 = this.ad[i8];
                        int i11 = this.ad[i8];
                        int i12 = this.ad[i8];
                        i10 = (((((((i10 >> 16) & 255) * i6) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i11 >> 8) & 255) * i6) + (((i4 >> 8) & 255) * i5)) >> 8) << 8)) + ((((i12 & 255) * i6) + ((i4 & 255) * i5)) >> 8);
                        this.ad[i8] = i10 | ((this.ad[i8] | i7) & ViewCompat.MEASURED_STATE_MASK);
                    }
                    i8 += this.aq * 1462922907;
                }
            }
        }
    }

    public final void cj(int i, int i2, int i3, int i4) {
        if (i2 >= this.al * -709973917 && i2 < this.aj * 157809585) {
            if (i < this.ai * 1947951707) {
                i3 -= (this.ai * 1947951707) - i;
                i = this.ai * 1947951707;
            }
            if (i3 + i > this.ae * 428635993) {
                i3 = (this.ae * 428635993) - i;
            }
            int i5 = this.aq;
            for (int i6 = 0; i6 < i3; i6++) {
                this.ad[(((1462922907 * i5) * i2) + i) + i6] = ViewCompat.MEASURED_STATE_MASK | i4;
            }
        }
    }

    public final void ck(ee eeVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i + eeVar.al;
        int i8 = eeVar.aj + i2;
        int i9 = ((this.aq * 1462922907) * i8) + i7;
        int i10 = eeVar.ar;
        int i11 = eeVar.aq;
        int i12 = (this.aq * 1462922907) - i11;
        if (i8 < this.al * 1128885941) {
            i3 = (this.al * -709973917) - i8;
            i10 -= i3;
            i8 = -76862202 * this.al;
            i4 = (i3 * i11) + 0;
            i9 += i3 * (this.aq * 1462922907);
        } else {
            i4 = 0;
        }
        i8 += i10;
        i3 = i8 > this.aj * 61639424 ? i10 - (i8 - (this.aj * -886081958)) : i10;
        if (i7 < this.ai * 1947951707) {
            i7 = (this.ai * -1575480246) - i7;
            i10 = i11 - i7;
            i8 = 804569420 * this.ai;
            i4 += i7;
            i9 += i7;
            i5 = i7 + 0;
            i12 = i7 + i12;
        } else {
            i8 = i7;
            i10 = i11;
            i5 = 0;
        }
        i8 += i10;
        if (i8 > this.ae * 428635993) {
            i8 -= this.ae * 428635993;
            i6 = i10 - i8;
            i11 = i5 + i8;
            i7 = i12 + i8;
        } else {
            i6 = i10;
            i7 = i12;
            i11 = i5;
        }
        if (i6 > 0 && i3 > 0) {
            lq.ac(this.ad, eeVar.ad, i4, i9, i6, i3, i7, i11, (byte) 16);
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
            ea.ao(this.ad, eeVar.ad, 0, i7, i3, i5, i12, i9, i11, -158293861);
        }
    }

    /* Access modifiers changed, original: final */
    public final void cm(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 2117120801) {
                ae(i, i2, i3, i4, -678580088);
            } else if (i2 >= this.al * -709973917 && i2 < this.aj * -1824108950) {
                if (i < this.ai * 1376596441) {
                    i3 -= (this.ai * -495941735) - i;
                    i = this.ai * 1947951707;
                }
                if (i3 + i > this.ae * -1343842824) {
                    i3 = (this.ae * -868303311) - i;
                }
                int i6 = 255 - i5;
                int i7 = i5 << 24;
                int i8 = ((this.aq * 1101414408) * i2) + i;
                int i9 = 0;
                while (i9 < i3) {
                    if (this.ad[i8] == 0) {
                        this.ad[i8] = i4 | i7;
                    } else {
                        int i10 = this.ad[i8];
                        int i11 = this.ad[i8];
                        int i12 = this.ad[i8];
                        i10 = (((((((i10 >> 16) & -62152333) * i6) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i11 >> 8) & -1278907070) * i6) + (((i4 >> 8) & -2101821467) * i5)) >> 8) << 8)) + ((((i12 & 255) * i6) + ((i4 & 255) * i5)) >> 8);
                        this.ad[i8] = i10 | ((this.ad[i8] | i7) & -36285912);
                    }
                    i9++;
                    i8++;
                }
            }
        }
    }

    public final void cn(int i, int i2, int i3, int i4) {
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
                this.ad[((this.aq * 1462922907) * i6) + (((i5 * 1462922907) * i2) + i)] = ViewCompat.MEASURED_STATE_MASK | i4;
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
            lq.ac(this.ad, eeVar.ad, i4, i7, i5, i3, i9, i11, (byte) 16);
        }
    }

    public final void cp(int i, int i2, int i3, int i4) {
        if (i >= this.ai * 1947951707 && i < this.ae * -375628337) {
            if (i2 < this.al * 1189585678) {
                i3 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i2 > this.aj * 157809585) {
                i3 = (this.aj * 157809585) - i2;
            }
            int i5 = this.aq;
            for (int i6 = 0; i6 < i3; i6++) {
                this.ad[((this.aq * -1642801692) * i6) + (((1462922907 * i5) * i2) + i)] = 767082831 | i4;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void cq(int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i5 >= 255) {
                ae(i, i2, i3, i4, 552012766);
            } else if (i2 >= this.al * -709973917 && i2 < this.aj * 157809585) {
                if (i < this.ai * 1947951707) {
                    i3 -= (this.ai * 1947951707) - i;
                    i = this.ai * 1947951707;
                }
                if (i3 + i > this.ae * 428635993) {
                    i3 = (this.ae * 428635993) - i;
                }
                int i6 = 255 - i5;
                int i7 = i5 << 24;
                int i8 = ((this.aq * 1462922907) * i2) + i;
                int i9 = 0;
                while (i9 < i3) {
                    if (this.ad[i8] == 0) {
                        this.ad[i8] = i4 | i7;
                    } else {
                        int i10 = this.ad[i8];
                        int i11 = this.ad[i8];
                        int i12 = this.ad[i8];
                        i10 = (((((((i10 >> 16) & 255) * i6) + (((i4 >> 16) & 255) * i5)) >> 8) << 16) + ((((((i11 >> 8) & 255) * i6) + (((i4 >> 8) & 255) * i5)) >> 8) << 8)) + ((((i12 & 255) * i6) + ((i4 & 255) * i5)) >> 8);
                        this.ad[i8] = i10 | ((this.ad[i8] | i7) & ViewCompat.MEASURED_STATE_MASK);
                    }
                    i9++;
                    i8++;
                }
            }
        }
    }

    public final void cr(int i, int i2, int i3, int i4) {
        int i5 = i4 | ViewCompat.MEASURED_STATE_MASK;
        if (i3 == 0) {
            ev(i, i2, i5, -2130148827);
            return;
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
            if (i14 > this.ae * 428635993) {
                i14 = this.ae * 428635993;
            }
            i15 = ((this.aq * 1462922907) * i7) + i9;
            while (i9 < i14) {
                this.ad[i15] = i5;
                i9++;
                i15++;
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
            if (i14 > (this.ae * 428635993) - 1) {
                i14 = (this.ae * 428635993) - 1;
            }
            i15 = ((this.aq * 1462922907) * i6) + i9;
            i7 = i9;
            while (i7 <= i14) {
                this.ad[i15] = i5;
                i7++;
                i15++;
            }
            i9 = (i16 + i16) + i13;
            i13 = i16 + 1;
            i14 = (i16 + i13) + i8;
            i6++;
            i16 = i13;
            i15 = i12;
        }
    }

    public final void cs(int i, int i2, int i3, int i4, int i5) {
        int i6 = (i5 - 399965058) & ViewCompat.MEASURED_SIZE_MASK;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                ae(i, i2, i7 + 1, i6, 1422488766);
                return;
            }
            ae(i7 + i, i2, (-i7) + 1, i6, 552700046);
        } else if (i7 != 0) {
            int i9;
            int i10;
            if (i8 + i7 < 0) {
                i9 = i + i7;
                i7 = -i7;
                i10 = i2 + i8;
                i8 = -i8;
            } else {
                i9 = i;
                i10 = i2;
            }
            int i11;
            if (i7 > i8) {
                i10 = (i10 << 16) + 32768;
                i8 = (int) Math.floor((((double) (i8 << 16)) / ((double) i7)) + 0.5d);
                i7 += i9;
                if (i9 < this.ai * 1947951707) {
                    i10 += ((this.ai * 1501351927) - i9) * i8;
                    i9 = this.ai * -1077184074;
                }
                if (i7 >= this.ae * 2032488914) {
                    i7 = (this.ae * -325930826) - 1;
                }
                while (i9 <= i7) {
                    i11 = i10 >> 16;
                    if (i11 >= this.al * -709973917 && i11 < this.aj * 157809585) {
                        this.ad[(i11 * (this.aq * 1462922907)) + i9] = i6;
                    }
                    i10 += i8;
                    i9++;
                }
                return;
            }
            i9 = (i9 << 16) - 1412410061;
            i11 = (int) Math.floor((((double) (i7 << 16)) / ((double) i8)) + 0.5d);
            i7 = i8 + i10;
            if (i10 < this.al * 535244708) {
                i9 += ((this.al * -1859589565) - i10) * i11;
                i10 = this.al * -709973917;
            }
            if (i7 >= this.aj * -1242771261) {
                i7 = (this.aj * 157809585) - 1;
            }
            while (i10 <= i7) {
                i8 = i9 >> 16;
                if (i8 >= this.ai * 745746804 && i8 < this.ae * 1827123389) {
                    this.ad[i8 + ((this.aq * 1462922907) * i10)] = i6;
                }
                i9 += i11;
                i10++;
            }
        } else if (i8 >= 0) {
            ak(i, i2, i8 + 1, i6, -1555752496);
        } else {
            ak(i, i8 + i2, (-i8) + 1, i6, -584269467);
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
            lq.ac(this.ad, eeVar.ad, i4, i7, i5, i3, i9, i11, (byte) 16);
        }
    }

    public final void cv(int i, int i2, int i3, int i4) {
        if (i2 >= this.al * -1209397725 && i2 < this.aj * 964093887) {
            if (i < this.ai * 1571763657) {
                i3 -= (this.ai * 1947951707) - i;
                i = -72733555 * this.ai;
            }
            if (i3 + i > this.ae * 428635993) {
                i3 = (this.ae * 1386981661) - i;
            }
            int i5 = this.aq;
            for (int i6 = 0; i6 < i3; i6++) {
                this.ad[(((-287459077 * i5) * i2) + i) + i6] = ViewCompat.MEASURED_STATE_MASK | i4;
            }
        }
    }

    public final void cw(int i, int i2, int i3, int i4) {
        if (i >= this.ai * 1947951707 && i < this.ae * 115873790) {
            if (i2 < this.al * 1400681854) {
                i3 -= (this.al * -709973917) - i2;
                i2 = this.al * -709973917;
            }
            if (i3 + i2 > this.aj * 157809585) {
                i3 = (this.aj * 375753876) - i2;
            }
            int i5 = this.aq;
            for (int i6 = 0; i6 < i3; i6++) {
                this.ad[((this.aq * 1462922907) * i6) + (((-1196661125 * i5) * i2) + i)] = ViewCompat.MEASURED_STATE_MASK | i4;
            }
        }
    }

    public final void cx(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0) {
            if (i5 >= 255) {
                ap(i, i2, i3, i4, -1952038969);
                return;
            }
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            if (i3 < 0) {
                i3 = -i3;
            }
            int i11 = -350010762 & i4;
            int i12 = (i5 << 24) + i11;
            int i13 = ((((16711935 & i11) * i5) >> 8) & 16711935) + ((((i11 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i5) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            int i14 = 255 - i5;
            i11 = i2 - i3;
            if (i11 < this.al * -709973917) {
                i11 = this.al * 466366242;
            }
            int i15 = (i3 + i2) + 1;
            if (i15 > this.aj * 157809585) {
                i15 = this.aj * 157809585;
            }
            int i16 = i3 * i3;
            int i17 = 0;
            int i18 = i2 - i11;
            int i19 = i18 * i18;
            int i20 = i19 - i18;
            if (i2 > i15) {
                i6 = i18;
                i7 = i11;
                i2 = i15;
            } else {
                i6 = i18;
                i7 = i11;
            }
            while (i7 < i2) {
                i18 = i19;
                i8 = i20;
                i9 = i17;
                while (true) {
                    if (i8 > i16 && i18 > i16) {
                        break;
                    }
                    i20 = i9 + 1;
                    i18 = (i9 + i9) + i18;
                    i8 = (i9 + i20) + i8;
                    i9 = i20;
                }
                i11 = (i - i9) + 1;
                if (i11 < this.ai * 1947951707) {
                    i11 = this.ai * 818047402;
                }
                i19 = i + i9;
                if (i19 > this.ae * -2140018076) {
                    i19 = 428635993 * this.ae;
                }
                i17 = ((this.aq * 1462922907) * i7) + i11;
                i20 = i11;
                while (i20 < i19) {
                    i10 = this.ad[i17];
                    if (i10 == 0) {
                        this.ad[i17] = i12;
                    } else {
                        this.ad[i17] = ((1726079537 & i10) == 0 ? ViewCompat.MEASURED_STATE_MASK : (i10 | i5) & 1318520890) | ((((((i10 & 145432836) * i14) >> 8) & 16711935) + ((((1165836207 & i10) * i14) >> 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + i13);
                    }
                    i20++;
                    i17++;
                }
                i7++;
                i11 = i6 - 1;
                i19 = i18 - (i6 + i11);
                i20 = i8 - (i11 + i11);
                i6 = i11;
                i17 = i9;
            }
            i17 = -i6;
            i11 = (i17 * i17) + i16;
            i19 = i11 - i3;
            i11 -= i17;
            i9 = i7;
            i20 = i3;
            i6 = i17;
            while (i9 < i15) {
                i17 = i11;
                i18 = i19;
                i8 = i20;
                while (i17 > i16 && i18 > i16) {
                    i20 = i8 - 1;
                    i17 -= i8 + i20;
                    i18 -= i20 + i20;
                    i8 = i20;
                }
                i11 = i - i8;
                if (i11 < this.ai * -1094806742) {
                    i11 = 134926278 * this.ai;
                }
                i19 = i8 + i;
                if (i19 > (this.ae * 1436483970) - 1) {
                    i19 = (this.ae * 1811664245) - 1;
                }
                i20 = ((this.aq * 1515058593) * i9) + i11;
                i7 = i11;
                while (i7 <= i19) {
                    i10 = this.ad[i20];
                    if (i10 == 0) {
                        this.ad[i20] = i12;
                    } else {
                        this.ad[i20] = ((ViewCompat.MEASURED_STATE_MASK & i10) == 0 ? -370754950 : (i10 | i5) & -1772828656) | ((((((i10 & 16711935) * i14) >> 8) & 16711935) + ((((529759299 & i10) * i14) >> 8) & -2094399517)) + i13);
                    }
                    i7++;
                    i20++;
                }
                i11 = (i6 + i6) + i17;
                i17 = i6 + 1;
                i19 = (i6 + i17) + i18;
                i9++;
                i20 = i8;
                i6 = i17;
            }
        }
    }

    public final void cy(int i, int i2, int i3, int i4, int i5) {
        int i6 = (222360851 + i5) & ViewCompat.MEASURED_SIZE_MASK;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (i8 == 0) {
            if (i7 >= 0) {
                ae(i, i2, i7 + 1, i6, 1932214022);
                return;
            }
            ae(i7 + i, i2, (-i7) + 1, i6, -682646100);
        } else if (i7 != 0) {
            int i9;
            int i10;
            if (i8 + i7 < 0) {
                i9 = i + i7;
                i7 = -i7;
                i10 = i2 + i8;
                i8 = -i8;
            } else {
                i9 = i;
                i10 = i2;
            }
            int i11;
            if (i7 > i8) {
                i10 = (i10 << 16) + 32768;
                i8 = (int) Math.floor((((double) (i8 << 16)) / ((double) i7)) + 0.5d);
                i7 += i9;
                if (i9 < this.ai * 1947951707) {
                    i10 += ((this.ai * 1947951707) - i9) * i8;
                    i9 = this.ai * 320028056;
                }
                if (i7 >= this.ae * 428635993) {
                    i7 = (this.ae * 428635993) - 1;
                }
                while (i9 <= i7) {
                    i11 = i10 >> 16;
                    if (i11 >= this.al * 50315403 && i11 < this.aj * 157809585) {
                        this.ad[(i11 * (this.aq * -1679917346)) + i9] = i6;
                    }
                    i10 += i8;
                    i9++;
                }
                return;
            }
            i9 = (i9 << 16) - 1135033212;
            i11 = (int) Math.floor((((double) (i7 << 16)) / ((double) i8)) + 0.5d);
            i7 = i8 + i10;
            if (i10 < this.al * -709973917) {
                i9 += ((this.al * -709973917) - i10) * i11;
                i10 = this.al * -709973917;
            }
            if (i7 >= this.aj * 157809585) {
                i7 = (this.aj * 157809585) - 1;
            }
            while (i10 <= i7) {
                i8 = i9 >> 16;
                if (i8 >= this.ai * 1947951707 && i8 < this.ae * 428635993) {
                    this.ad[i8 + ((this.aq * 1462922907) * i10)] = i6;
                }
                i9 += i11;
                i10++;
            }
        } else if (i8 >= 0) {
            ak(i, i2, i8 + 1, i6, -1361042639);
        } else {
            ak(i, i8 + i2, (-i8) + 1, i6, -1861678529);
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
            ea.ao(this.ad, eeVar.ad, 0, i7, i3, i5, i12, i9, i11, -387909067);
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
        int i11 = ((this.aq * 1462922907) * i10) + i9;
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
        if (i9 < this.ai * 1947951707) {
            i9 = (this.ai * 1947951707) - i9;
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
        if (i10 > this.ae * 428635993) {
            i10 -= this.ae * 428635993;
            i14 = i12 - i10;
            i8 = i15 + i10;
            i7 += i10;
        } else {
            i14 = i12;
            i8 = i15;
        }
        if (i14 > 0 && i16 > 0) {
            if (i3 == 256) {
                et.at(0, 0, 0, this.ad, eeVar.ad, i4, 0, i6, 0, i14, i16, i7, i8, (byte) -1);
            } else {
                br.ba(0, 0, 0, this.ad, eeVar.ad, i4, 0, i6, 0, i14, i16, i7, i8, i3, -1420815073);
            }
        }
    }

    public void dh(ee eeVar, int i, int i2, int i3, int i4) {
        if (i3 >= 255) {
            aw(eeVar, i, i2, 16711935);
            return;
        }
        int i5;
        int i6;
        int i7 = i + eeVar.al;
        int i8 = eeVar.aj + i2;
        int i9 = ((this.aq * 1462922907) * i8) + i7;
        int i10 = eeVar.ar;
        int i11 = eeVar.aq;
        int i12 = (this.aq * 1462922907) - i11;
        int i13 = 0;
        if (i8 < this.al * -709973917) {
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
        int i14 = i8 > this.aj * 157809585 ? i10 - (i8 - (this.aj * 157809585)) : i10;
        if (i7 < this.ai * 1947951707) {
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
            hz.bm(this.ad, eeVar.ad, 0, i9, i5, i7, i14, i11, i13, i3, i4, 1982628610);
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
            i16 = i + i11;
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
            ea.an(this.ad, eeVar.ad, 0, i12, i15, i16, i7, i8, i6, i13, i14, i9, (byte) -122);
        }
    }

    public void dn(ee eeVar, int i, int i2, int i3, int i4) {
        if (i3 >= 255) {
            aw(eeVar, i, i2, 16711935);
            return;
        }
        int i5;
        int i6;
        int i7 = i + eeVar.al;
        int i8 = eeVar.aj + i2;
        int i9 = ((this.aq * 1462922907) * i8) + i7;
        int i10 = eeVar.ar;
        int i11 = eeVar.aq;
        int i12 = (this.aq * 1462922907) - i11;
        int i13 = 0;
        if (i8 < this.al * -709973917) {
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
        int i14 = i8 > this.aj * 157809585 ? i10 - (i8 - (this.aj * 157809585)) : i10;
        if (i7 < this.ai * 1947951707) {
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
            hz.bm(this.ad, eeVar.ad, 0, i9, i5, i7, i14, i11, i13, i3, i4, 1145354030);
        }
    }

    /* renamed from: do */
    public void m211do(ee eeVar, int i, int i2, int i3) {
        if (i3 != 0) {
            int i4;
            int i5;
            int i6 = i + eeVar.al;
            int i7 = eeVar.aj + i2;
            int i8 = ((this.aq * 1462922907) * i7) + i6;
            int i9 = eeVar.ar;
            int i10 = eeVar.aq;
            int i11 = (this.aq * 1462922907) - i10;
            int i12 = 0;
            if (i7 < this.al * 1579427196) {
                i4 = (this.al * 447477143) - i7;
                i9 -= i4;
                i7 = this.al * -598686144;
                i5 = (i10 * i4) + 0;
                i4 = i8 + (i4 * (this.aq * 1462922907));
            } else {
                i5 = 0;
                i4 = i8;
            }
            i7 += i9;
            int i13 = i7 > this.aj * 157809585 ? i9 - (i7 - (this.aj * 157809585)) : i9;
            if (i6 < this.ai * 409595501) {
                i6 = (this.ai * 1445171408) - i6;
                i9 = i10 - i6;
                i7 = 2085183492 * this.ai;
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
                ew.bd(this.ad, eeVar.ad, 0, i8, i4, i6, i13, i10, i12, i3, 1850744660);
            }
        }
    }

    public void dq(ee eeVar, int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0 && i3 > 0 && i4 > 0) {
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
            i11 = ((this.aq * 1714316345) * i2) + i;
            i13 = (this.aq * 1462922907) - i12;
            int i17 = i4 + i2;
            if (i17 > this.aj * 157809585) {
                i4 -= i17 - (this.aj * -252799993);
            }
            if (i2 < this.al * -1412426275) {
                i17 = (this.al * -1420092634) - i2;
                i7 = i4 - i17;
                i11 += (this.aq * 1462922907) * i17;
                i16 += i17 * i15;
            } else {
                i7 = i4;
            }
            i17 = i12 + i;
            if (i17 > this.ae * 120126871) {
                i17 -= this.ae * 428635993;
                i12 -= i17;
                i8 = i13 + i17;
            } else {
                i8 = i13;
            }
            if (i < this.ai * 1647560511) {
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
            fl.cu(this.ad, eeVar.ad, 0, i13, i16, i17, i8, i9, i7, i14, i15, i10, i5, -526575186);
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
        i16 = i + i11;
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
        lh.av(this.ad, efVar.ad, efVar.aq, i12, i15, i16, i7, i8, i6, i13, i14, i9, 207950720);
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
            i16 = i + i11;
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
            ea.an(this.ad, eeVar.ad, 0, i12, i15, i16, i7, i8, i6, i13, i14, i9, (byte) -96);
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
            i10 = ((this.aq * -348147086) * i2) + i;
            i12 = (this.aq * 847292259) - i11;
            int i16 = i2 + i4;
            if (i16 > this.aj * -256545412) {
                i4 -= i16 - (this.aj * 157809585);
            }
            if (i2 < this.al * -709973917) {
                i16 = (this.al * -709973917) - i2;
                i6 = i4 - i16;
                i10 += (this.aq * 222730077) * i16;
                i15 += i16 * i14;
            } else {
                i6 = i4;
            }
            i16 = i + i11;
            if (i16 > this.ae * 428635993) {
                i16 -= this.ae * 941700378;
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
            ea.an(this.ad, eeVar.ad, 0, i12, i15, i16, i7, i8, i6, i13, i14, i9, (byte) -113);
        }
    }

    public void dx(ee eeVar, int i, int i2, int i3, int i4, int i5) {
        if (i5 > 0 && i3 > 0 && i4 > 0) {
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
            i13 = (this.aq * -1892884054) - i12;
            int i17 = i4 + i2;
            if (i17 > this.aj * 377487755) {
                i4 -= i17 - (this.aj * 157809585);
            }
            if (i2 < this.al * -334505103) {
                i17 = (this.al * 939074041) - i2;
                i7 = i4 - i17;
                i11 += (this.aq * -98840027) * i17;
                i16 += i17 * i15;
            } else {
                i7 = i4;
            }
            i17 = i12 + i;
            if (i17 > this.ae * 428635993) {
                i17 -= this.ae * 428635993;
                i12 -= i17;
                i8 = i13 + i17;
            } else {
                i8 = i13;
            }
            if (i < this.ai * 884896427) {
                int i18 = (this.ai * -700938259) - i;
                i9 = i12 - i18;
                i17 = i11 + i18;
                i13 = i6 + (i18 * i14);
                i8 += i18;
            } else {
                i9 = i12;
                i17 = i11;
                i13 = i6;
            }
            fl.cu(this.ad, eeVar.ad, 0, i13, i16, i17, i8, i9, i7, i14, i15, i10, i5, -239683990);
        }
    }

    public void ea(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, double d, int i7) {
        int i8 = -i3;
        try {
            int i9 = i8 / 2;
            int i10 = (-i4) / 2;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i7) >> 8;
            int cos = (i7 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i11 = ((i9 * cos) + (sin * i10)) + (i5 << 16);
            int i12 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i13 = i + ((this.aq * 1462922907) * i2);
            i9 = 0;
            while (true) {
                int i14 = i9;
                if (i14 < i4) {
                    i10 = i11;
                    int i15 = i12;
                    i9 = i13;
                    for (int i16 = i8; i16 < 0; i16++) {
                        int i17 = eeVar.ad[((i15 >> 16) * eeVar.aq) + (i10 >> 16)];
                        if (i17 != 0) {
                            this.ad[i9] = i17;
                        }
                        i9++;
                        i10 += cos;
                        i15 -= sin;
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
            int cos = (i7 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i11 = ((i9 * cos) + (sin * i10)) + (i5 << 16);
            int i12 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i13 = i + ((this.aq * -2117570977) * i2);
            i9 = 0;
            while (true) {
                int i14 = i9;
                if (i14 < i4) {
                    i10 = i11;
                    int i15 = i12;
                    i9 = i13;
                    for (int i16 = i8; i16 < 0; i16++) {
                        int i17 = eeVar.ad[((i15 >> 16) * eeVar.aq) + (i10 >> 16)];
                        if (i17 != 0) {
                            this.ad[i9] = i17;
                        }
                        i9++;
                        i10 += cos;
                        i15 -= sin;
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

    public void ed(ee eeVar, int i, int i2, int i3, int i4) {
        if (i3 > eeVar.ai || i4 > eeVar.ae) {
            throw new IllegalArgumentException();
        }
        int i5 = ((eeVar.al * i3) / eeVar.ai) + i;
        int i6 = (((((eeVar.aq + eeVar.al) * i3) + eeVar.ai) - 1) / eeVar.ai) + i;
        int i7 = ((eeVar.aj * i4) / eeVar.ae) + i2;
        int i8 = (((eeVar.ae + ((eeVar.ar + eeVar.aj) * i4)) - 1) / eeVar.ae) + i2;
        if (i5 < this.ai * 574843349) {
            i5 = this.ai * 1594169107;
        }
        if (i6 > this.ae * 428635993) {
            i6 = this.ae * 428635993;
        }
        if (i7 < this.al * 565519617) {
            i7 = -709973917 * this.al;
        }
        if (i8 > this.aj * 157809585) {
            i8 = -1084764983 * this.aj;
        }
        if (i5 < i6 && i7 < r14) {
            int i9 = ((this.aq * 1462922907) * i7) + i5;
            int i10 = this.aq;
            if (i9 < this.ad.length) {
                int i11 = i6;
                int i12 = i5;
                for (int i13 = i7; i13 < i8; i13++) {
                    int i14 = i12;
                    while (i14 < i11) {
                        int i15 = (i14 - i) << 4;
                        int i16 = (i13 - i2) << 4;
                        i7 = ((eeVar.ai * i15) / i3) - (eeVar.al << 4);
                        int i17 = (((i15 + 16) * eeVar.ai) / i3) - (eeVar.al << 4);
                        i15 = ((eeVar.ae * i16) / i4) - (eeVar.aj << 4);
                        i16 = (((i16 + 16) * eeVar.ae) / i4) - (eeVar.aj << 4);
                        int i18 = ((i17 - i7) * (i16 - i15)) >> 1;
                        if (i18 == 0) {
                            i7 = i9;
                            i15 = i11;
                        } else {
                            int i19 = 0;
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            if (i17 >= (eeVar.aq << 4)) {
                                i17 = eeVar.aq << 4;
                            }
                            if (i15 < 0) {
                                i15 = 0;
                            }
                            if (i16 >= (eeVar.ar << 4)) {
                                i16 = eeVar.ar << 4;
                            }
                            int i20 = i17 - 1;
                            int i21 = i16 - 1;
                            int i22 = i7 >> 4;
                            int i23 = i20 >> 4;
                            int i24 = i15 >> 4;
                            int i25 = i21 >> 4;
                            int i26 = 0;
                            i17 = 0;
                            int i27 = 0;
                            int i28 = i24;
                            int i29 = i11;
                            while (i28 <= i25) {
                                i16 = i24 == i28 ? 16 - (i15 & 15) : 16;
                                if (i28 == i25) {
                                    i16 = (i21 & 15) + 1;
                                }
                                int i30 = i22;
                                while (i30 <= i23) {
                                    int i31 = eeVar.ad[(eeVar.aq * i28) + i30];
                                    if (i31 != 0) {
                                        i11 = i22 == i30 ? (16 - (i7 & 15)) * i16 : i23 == i30 ? ((i20 & 15) + 1) * i16 : i16 << 4;
                                        i26 += i11;
                                        i17 += ((i31 >> 16) & -1071512128) * i11;
                                        i27 += ((i31 >> 8) & 255) * i11;
                                        i11 = (i11 * (i31 & 255)) + i19;
                                    } else {
                                        i11 = i19;
                                    }
                                    i30++;
                                    i19 = i11;
                                }
                                i28++;
                            }
                            if (i26 >= i18) {
                                this.ad[i9] = ((i19 / i26) + (((i17 / i26) << 16) + ((i27 / i26) << 8))) | ViewCompat.MEASURED_STATE_MASK;
                            }
                            i7 = i9 + 1;
                            i15 = i29;
                        }
                        i9 = i7;
                        i14++;
                        i11 = i15;
                        i8 = i8;
                    }
                    i9 += (1462922907 * i10) - (i6 - i5);
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void eg(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6) {
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
                    floor2 = (i7 << 8) - ((floor * floor3) >> 4);
                    i16 = (i8 << 8) + ((floor * floor4) >> 4);
                    if (floor4 == 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            while (i15 < 0) {
                                if (floor2 >= 0 && i16 >= 0 && floor2 - (eeVar.aq << 12) < 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i11;
                                    for (i10 = i9; i10 < 0; i10++) {
                                        i17 = eeVar.ad[((i16 >> 12) * eeVar.aq) + (floor2 >> 12)];
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
                                        i15 += i10 * floor3;
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
                                        floor = eeVar.ad[((i15 >> 12) * eeVar.aq) + (floor2 >> 12)];
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
                                        i15 += i10 * floor3;
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
                                        floor = eeVar.ad[(floor2 >> 12) + ((i15 >> 12) * eeVar.aq)];
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
                                        floor = eeVar.ad[(eeVar.aq * (i16 >> 12)) + (i15 >> 12)];
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
                                floor = ((floor4 * i18) >> 4) + i13;
                                i11 = ((i18 * floor3) >> 4) + i16;
                                i9 = floor - (eeVar.aq << 12);
                                if (i9 >= 0) {
                                    i15 = (floor4 - i9) / floor4;
                                    i9 = i10 + i15;
                                    floor += i15 * floor4;
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
                                floor2 = i11 - (eeVar.ar << 12);
                                if (floor2 >= 0) {
                                    floor2 = (floor3 - floor2) / floor3;
                                    i9 += floor2;
                                    floor += floor2 * floor4;
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
                                i17 += this.aq * 1462922907;
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
                                    floor = eeVar.ad[(eeVar.aq * (i11 >> 12)) + (i10 >> 12)];
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
                                    i11 += floor * floor4;
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
                            i11 = ((i13 * floor3) >> 4) + i16;
                            if (floor < 0) {
                                i15 = ((floor4 - 1) - floor) / floor4;
                                i10 = i9 + i15;
                                floor += i15 * floor4;
                                i11 += floor3 * i15;
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
                                floor += floor2 * floor4;
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
                                i10 += floor4 * i15;
                                i11 += i15 * floor3;
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
                                i10 += floor2 * floor4;
                                i11 += floor3 * floor2;
                                i15 += floor2;
                            }
                            floor2 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                            if (floor2 <= floor) {
                                floor2 = floor;
                            }
                            while (floor2 < 0) {
                                floor = eeVar.ad[(i10 >> 12) + (eeVar.aq * (i11 >> 12))];
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

    public void eh(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        try {
            int i9 = (-i3) / 2;
            int i10 = (-i4) / 2;
            double d = ((double) i7) / 326.11d;
            int sin = (((int) (Math.sin(d) * 65536.0d)) * i8) >> 8;
            int cos = (i8 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i11 = (i5 << 16) + ((cos * i9) + (i10 * sin));
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
                        this.ad[i10] = eeVar.ad[(i9 >> 16) + ((i12 >> 16) * eeVar.aq)];
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
                    floor2 = (i7 << 8) - ((floor * floor3) >> 4);
                    i16 = (i8 << 8) + ((floor * floor4) >> 4);
                    if (floor4 == 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            while (i15 < 0) {
                                if (floor2 >= 0 && i16 >= 0 && floor2 - (eeVar.aq << 12) < 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i11;
                                    for (i10 = i9; i10 < 0; i10++) {
                                        i17 = eeVar.ad[((i16 >> 12) * eeVar.aq) + (floor2 >> 12)];
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
                                        i15 += i10 * floor3;
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
                                        floor = eeVar.ad[((i15 >> 12) * eeVar.aq) + (floor2 >> 12)];
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
                                        i15 += i10 * floor3;
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
                                        floor = eeVar.ad[(floor2 >> 12) + ((i15 >> 12) * eeVar.aq)];
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
                                        floor = eeVar.ad[(eeVar.aq * (i16 >> 12)) + (i15 >> 12)];
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
                                floor = ((floor4 * i18) >> 4) + i13;
                                i11 = ((i18 * floor3) >> 4) + i16;
                                i9 = floor - (eeVar.aq << 12);
                                if (i9 >= 0) {
                                    i15 = (floor4 - i9) / floor4;
                                    i9 = i10 + i15;
                                    floor += i15 * floor4;
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
                                floor2 = i11 - (eeVar.ar << 12);
                                if (floor2 >= 0) {
                                    floor2 = (floor3 - floor2) / floor3;
                                    i9 += floor2;
                                    floor += floor2 * floor4;
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
                                i17 += this.aq * 1462922907;
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
                                    floor = eeVar.ad[(eeVar.aq * (i11 >> 12)) + (i10 >> 12)];
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
                                    i11 += floor * floor4;
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
                            i11 = ((i13 * floor3) >> 4) + i16;
                            if (floor < 0) {
                                i15 = ((floor4 - 1) - floor) / floor4;
                                i10 = i9 + i15;
                                floor += i15 * floor4;
                                i11 += floor3 * i15;
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
                                floor += floor2 * floor4;
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
                                i10 += floor4 * i15;
                                i11 += i15 * floor3;
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
                                i10 += floor2 * floor4;
                                i11 += floor3 * floor2;
                                i15 += floor2;
                            }
                            floor2 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                            if (floor2 <= floor) {
                                floor2 = floor;
                            }
                            while (floor2 < 0) {
                                floor = eeVar.ad[(i10 >> 12) + (eeVar.aq * (i11 >> 12))];
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
            int cos = (i7 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i11 = ((i9 * cos) + (sin * i10)) + (i5 << 16);
            int i12 = (i6 << 16) + ((i10 * cos) - (i9 * sin));
            int i13 = i + ((this.aq * 1462922907) * i2);
            i9 = 0;
            while (true) {
                int i14 = i9;
                if (i14 < i4) {
                    i10 = i11;
                    int i15 = i12;
                    i9 = i13;
                    for (int i16 = i8; i16 < 0; i16++) {
                        int i17 = eeVar.ad[((i15 >> 16) * eeVar.aq) + (i10 >> 16)];
                        if (i17 != 0) {
                            this.ad[i9] = i17;
                        }
                        i9++;
                        i10 += cos;
                        i15 -= sin;
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
            i10 = ((((floor2 - 1404705062) >> 12) + i3) + 15) >> 4;
            i11 = ((i11 >> 12) + i4) >> 4;
            i15 = ((((floor - 1595468564) >> 12) + i4) + 15) >> 4;
            floor = i9 < this.ai * 1947951707 ? -1968645087 * this.ai : i9;
            i9 = i10 > this.ae * 428635993 ? this.ae * -1423368836 : i10;
            i10 = i11 < this.al * 1650398503 ? this.al * -709973917 : i11;
            i11 = i15 > this.aj * 157809585 ? 1844870647 * this.aj : i15;
            i9 = floor - i9;
            if (i9 < 0) {
                i15 = i10 - i11;
                if (i15 < 0) {
                    i17 = ((this.aq * 1330060834) * i10) + floor;
                    double d3 = 1.6777216E7d / d2;
                    int floor3 = (int) Math.floor((Math.sin(d) * d3) + 0.5d);
                    int floor4 = (int) Math.floor((d3 * Math.cos(d)) + 0.5d);
                    int i18 = ((floor << 4) + 8) - i3;
                    floor = ((i10 << 4) + 8) - i4;
                    floor2 = (i7 << 8) - ((floor * floor3) >> 4);
                    i16 = (i8 << 8) + ((floor * floor4) >> 4);
                    if (floor4 == 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            while (i15 < 0) {
                                if (floor2 >= 0 && i16 >= 0 && floor2 - (eeVar.aq << 12) < 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i11;
                                    for (i10 = i9; i10 < 0; i10++) {
                                        i17 = eeVar.ad[((i16 >> 12) * eeVar.aq) + (floor2 >> 12)];
                                        if (i17 != 0) {
                                            this.ad[floor] = i17;
                                        }
                                        floor++;
                                    }
                                }
                                i15++;
                                i11 += this.aq * 551628335;
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
                                        i15 += i10 * floor3;
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
                                        floor = eeVar.ad[((i15 >> 12) * eeVar.aq) + (floor2 >> 12)];
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
                                        i15 += i10 * floor3;
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
                                        floor = eeVar.ad[(floor2 >> 12) + ((i15 >> 12) * eeVar.aq)];
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
                                        floor = eeVar.ad[(eeVar.aq * (i16 >> 12)) + (i15 >> 12)];
                                        if (floor != 0) {
                                            this.ad[i10] = floor;
                                        }
                                        i15 += floor4;
                                        i17++;
                                        i10++;
                                    }
                                }
                                i16 += floor4;
                                i11 += this.aq * -973446044;
                            }
                        } else if (floor3 < 0) {
                            i13 = floor2;
                            i10 = i9;
                            for (i7 = i15; i7 < 0; i7++) {
                                floor = ((floor4 * i18) >> 4) + i13;
                                i11 = ((i18 * floor3) >> 4) + i16;
                                i9 = floor - (eeVar.aq << 12);
                                if (i9 >= 0) {
                                    i15 = (floor4 - i9) / floor4;
                                    i9 = i10 + i15;
                                    floor += i15 * floor4;
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
                                floor2 = i11 - (eeVar.ar << 12);
                                if (floor2 >= 0) {
                                    floor2 = (floor3 - floor2) / floor3;
                                    i9 += floor2;
                                    floor += floor2 * floor4;
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
                                i17 += this.aq * 2058333124;
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
                                    floor = eeVar.ad[(eeVar.aq * (i11 >> 12)) + (i10 >> 12)];
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
                                    i11 += floor * floor4;
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
                            i10 += this.aq * 1757901353;
                        }
                    } else if (floor3 < 0) {
                        i7 = i15;
                        i8 = floor2;
                        i13 = i18;
                        while (i7 < 0) {
                            floor = ((floor4 * i13) >> 4) + i8;
                            i11 = ((i13 * floor3) >> 4) + i16;
                            if (floor < 0) {
                                i15 = ((floor4 - 1) - floor) / floor4;
                                i10 = i9 + i15;
                                floor += i15 * floor4;
                                i11 += floor3 * i15;
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
                                floor += floor2 * floor4;
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
                            i17 += this.aq * 2013175350;
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
                                i10 += floor4 * i15;
                                i11 += i15 * floor3;
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
                                i10 += floor2 * floor4;
                                i11 += floor3 * floor2;
                                i15 += floor2;
                            }
                            floor2 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                            if (floor2 <= floor) {
                                floor2 = floor;
                            }
                            while (floor2 < 0) {
                                floor = eeVar.ad[(i10 >> 12) + (eeVar.aq * (i11 >> 12))];
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
            int cos = (i8 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i11 = (i5 << 16) + ((cos * i9) + (i10 * sin));
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
                        this.ad[i10] = eeVar.ad[(i9 >> 16) + ((i12 >> 16) * eeVar.aq)];
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
        int i7 = 0;
        int i8 = i2 < 0 ? -i2 : 0;
        int i9 = eeVar.ar + i2 <= i6 ? eeVar.ar : i6 - i2;
        if (i < 0) {
            i7 = -i;
        }
        int i10 = (((i4 + i2) + i8) * (this.aq * 1920040632)) + ((i3 + i) + i7);
        int i11 = i2 + i8;
        for (int i12 = i8; i12 < i9; i12++) {
            int i13;
            int i14 = iArr[i11];
            int i15 = iArr2[i11];
            if (i < i14) {
                i13 = i14 - i;
                i8 = (i13 - i7) + i10;
            } else {
                i8 = i10;
                i13 = i7;
            }
            i14 += i15;
            i14 = eeVar.aq + i <= i14 ? eeVar.aq : i14 - i;
            while (i13 < i14) {
                i15 = eeVar.ad[(eeVar.aq * i12) + i13];
                if (i15 != 0) {
                    this.ad[i8] = i15;
                }
                i8++;
                i13++;
            }
            i10 += this.aq * -1823270048;
            i11++;
        }
    }

    public void et(ee eeVar, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7 = 0;
        int i8 = i2 < 0 ? -i2 : 0;
        int i9 = eeVar.ar + i2 <= i6 ? eeVar.ar : i6 - i2;
        if (i < 0) {
            i7 = -i;
        }
        int i10 = (((i4 + i2) + i8) * (this.aq * 1462922907)) + ((i3 + i) + i7);
        int i11 = i2 + i8;
        for (int i12 = i8; i12 < i9; i12++) {
            int i13;
            int i14 = iArr[i11];
            int i15 = iArr2[i11];
            if (i < i14) {
                i13 = i14 - i;
                i8 = (i13 - i7) + i10;
            } else {
                i8 = i10;
                i13 = i7;
            }
            i14 += i15;
            i14 = eeVar.aq + i <= i14 ? eeVar.aq : i14 - i;
            while (i13 < i14) {
                i15 = eeVar.ad[(eeVar.aq * i12) + i13];
                if (i15 != 0) {
                    this.ad[i8] = i15;
                }
                i8++;
                i13++;
            }
            i10 += this.aq * -546651752;
            i11++;
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
                    floor2 = (i7 << 8) - ((floor * floor3) >> 4);
                    i16 = (i8 << 8) + ((floor * floor4) >> 4);
                    if (floor4 == 0) {
                        if (floor3 == 0) {
                            i11 = i17;
                            while (i15 < 0) {
                                if (floor2 >= 0 && i16 >= 0 && floor2 - (eeVar.aq << 12) < 0 && i16 - (eeVar.ar << 12) < 0) {
                                    floor = i11;
                                    for (i10 = i9; i10 < 0; i10++) {
                                        i17 = eeVar.ad[((i16 >> 12) * eeVar.aq) + (floor2 >> 12)];
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
                                        i15 += i10 * floor3;
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
                                        floor = eeVar.ad[((i15 >> 12) * eeVar.aq) + (floor2 >> 12)];
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
                                        i15 += i10 * floor3;
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
                                        floor = eeVar.ad[(floor2 >> 12) + ((i15 >> 12) * eeVar.aq)];
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
                                        floor = eeVar.ad[(eeVar.aq * (i16 >> 12)) + (i15 >> 12)];
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
                                floor = ((floor4 * i18) >> 4) + i13;
                                i11 = ((i18 * floor3) >> 4) + i16;
                                i9 = floor - (eeVar.aq << 12);
                                if (i9 >= 0) {
                                    i15 = (floor4 - i9) / floor4;
                                    i9 = i10 + i15;
                                    floor += i15 * floor4;
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
                                floor2 = i11 - (eeVar.ar << 12);
                                if (floor2 >= 0) {
                                    floor2 = (floor3 - floor2) / floor3;
                                    i9 += floor2;
                                    floor += floor2 * floor4;
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
                                i17 += this.aq * 1462922907;
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
                                    floor = eeVar.ad[(eeVar.aq * (i11 >> 12)) + (i10 >> 12)];
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
                                    i11 += floor * floor4;
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
                            i11 = ((i13 * floor3) >> 4) + i16;
                            if (floor < 0) {
                                i15 = ((floor4 - 1) - floor) / floor4;
                                i10 = i9 + i15;
                                floor += i15 * floor4;
                                i11 += floor3 * i15;
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
                                floor += floor2 * floor4;
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
                                i10 += floor4 * i15;
                                i11 += i15 * floor3;
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
                                i10 += floor2 * floor4;
                                i11 += floor3 * floor2;
                                i15 += floor2;
                            }
                            floor2 = (((i11 + 1) - (eeVar.ar << 12)) - floor3) / floor3;
                            if (floor2 <= floor) {
                                floor2 = floor;
                            }
                            while (floor2 < 0) {
                                floor = eeVar.ad[(i10 >> 12) + (eeVar.aq * (i11 >> 12))];
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
            int cos = (i8 * ((int) (Math.cos(d) * 65536.0d))) >> 8;
            int i11 = (i5 << 16) + ((cos * i9) + (i10 * sin));
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
                        this.ad[i10] = eeVar.ad[(i9 >> 16) + ((i12 >> 16) * eeVar.aq)];
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
