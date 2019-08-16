package defpackage;

import java.lang.reflect.Array;

/* renamed from: gv */
public class gv {
    static final int ad = 128;
    static final int ae = 4095;
    static int ai = 0;
    static int[] ak = new int[4096];
    static int[][] al = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{128, 128}));
    static int[] am = new int[4096];
    static final int aq = 128;
    static int[][] ar = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{128, 128}));
    static final int ne = 7680;

    gv() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gv.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028f A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final boolean ae(int i, int i2, gn gnVar, gs gsVar) {
        ar[64][64] = 99;
        al[64][64] = 0;
        am[0] = i;
        ak[0] = i2;
        int[][] iArr = gsVar.bc;
        int i3 = i2;
        int i4 = 0;
        int i5 = i;
        int i6;
        for (int i7 = 1; i4 != i7; i7 = i6) {
            i5 = am[i4];
            i3 = ak[i4];
            int i8 = i5 - (i - 64);
            int i9 = i3 - (i2 - 64);
            int i10 = i5 - (gsVar.bl * -1403677009);
            int i11 = i3 - (gsVar.bf * -342516413);
            if (gnVar.ad(1, i5, i3, gsVar, (byte) 39)) {
                di.aj = 872498109 * i5;
                ai = 1542774803 * i3;
                return true;
            }
            int i12;
            int i13 = al[i8][i9] + 1;
            if (i8 > 0) {
                int i14 = i8 - 1;
                if (ar[i14][i9] == 0 && (iArr[i10 - 1][i11] & 19136776) == 0) {
                    int i15;
                    am[i7] = i5 - 1;
                    ak[i7] = i3;
                    i6 = (i7 + 1) & ae;
                    ar[i14][i9] = 2;
                    al[i14][i9] = i13;
                    if (i8 < 127) {
                        i12 = i8 + 1;
                        if (ar[i12][i9] == 0 && (iArr[i10 + 1][i11] & 19136896) == 0) {
                            am[i6] = i5 + 1;
                            ak[i6] = i3;
                            i6 = (i6 + 1) & ae;
                            ar[i12][i9] = 8;
                            al[i12][i9] = i13;
                        }
                    }
                    if (i9 > 0) {
                        i12 = i9 - 1;
                        if (ar[i8][i12] == 0 && (iArr[i10][i11 - 1] & 19136770) == 0) {
                            am[i6] = i5;
                            ak[i6] = i3 - 1;
                            i6 = (i6 + 1) & ae;
                            ar[i8][i12] = 1;
                            al[i8][i12] = i13;
                        }
                    }
                    if (i9 < 127) {
                        i12 = i9 + 1;
                        if (ar[i8][i12] == 0 && (iArr[i10][i11 + 1] & 19136800) == 0) {
                            am[i6] = i5;
                            ak[i6] = i3 + 1;
                            i6 = (i6 + 1) & ae;
                            ar[i8][i12] = 4;
                            al[i8][i12] = i13;
                        }
                    }
                    if (i8 > 0 && i9 > 0) {
                        i12 = i8 - 1;
                        i7 = i9 - 1;
                        if (ar[i12][i7] == 0) {
                            i14 = i10 - 1;
                            i15 = i11 - 1;
                            if ((iArr[i14][i15] & 19136782) == 0 && (iArr[i14][i11] & 19136776) == 0 && (iArr[i10][i15] & 19136770) == 0) {
                                am[i6] = i5 - 1;
                                ak[i6] = i3 - 1;
                                i6 = (i6 + 1) & ae;
                                ar[i12][i7] = 3;
                                al[i12][i7] = i13;
                            }
                        }
                    }
                    if (i8 < 127 && i9 > 0) {
                        i12 = i8 + 1;
                        i7 = i9 - 1;
                        if (ar[i12][i7] == 0) {
                            i14 = i10 + 1;
                            i15 = i11 - 1;
                            if ((iArr[i14][i15] & 19136899) == 0 && (iArr[i14][i11] & 19136896) == 0 && (19136770 & iArr[i10][i15]) == 0) {
                                am[i6] = i5 + 1;
                                ak[i6] = i3 - 1;
                                i6 = (i6 + 1) & ae;
                                ar[i12][i7] = 9;
                                al[i12][i7] = i13;
                            }
                        }
                    }
                    if (i8 > 0 && i9 < 127) {
                        i12 = i8 - 1;
                        i7 = i9 + 1;
                        if (ar[i12][i7] == 0) {
                            i14 = i10 - 1;
                            i15 = i11 + 1;
                            if ((iArr[i14][i15] & 19136824) == 0 && (iArr[i14][i11] & 19136776) == 0 && (iArr[i10][i15] & 19136800) == 0) {
                                am[i6] = i5 - 1;
                                ak[i6] = i3 + 1;
                                i6 = (i6 + 1) & ae;
                                ar[i12][i7] = 6;
                                al[i12][i7] = i13;
                            }
                        }
                    }
                    if (i8 < 127 && i9 < 127) {
                        i12 = i8 + 1;
                        i7 = i9 + 1;
                        if (ar[i12][i7] != 0) {
                            i14 = i10 + 1;
                            i9 = i11 + 1;
                            if ((iArr[i14][i9] & 19136992) == 0 && (iArr[i14][i11] & 19136896) == 0 && (iArr[i10][i9] & 19136800) == 0) {
                                am[i6] = i5 + 1;
                                ak[i6] = i3 + 1;
                                ar[i12][i7] = 12;
                                al[i12][i7] = i13;
                                i6 = (i6 + 1) & ae;
                            }
                        }
                    }
                    i4 = (i4 + 1) & ae;
                }
            }
            i6 = i7;
            if (i8 < 127) {
            }
            if (i9 > 0) {
            }
            if (i9 < 127) {
            }
            i12 = i8 - 1;
            i7 = i9 - 1;
            if (ar[i12][i7] == 0) {
            }
            i12 = i8 + 1;
            i7 = i9 - 1;
            if (ar[i12][i7] == 0) {
            }
            i12 = i8 - 1;
            i7 = i9 + 1;
            if (ar[i12][i7] == 0) {
            }
            i12 = i8 + 1;
            i7 = i9 + 1;
            if (ar[i12][i7] != 0) {
            }
            i4 = (i4 + 1) & ae;
        }
        di.aj = 872498109 * i5;
        ai = 1542774803 * i3;
        return false;
    }

    static final boolean ag(int i, int i2, gn gnVar, gs gsVar) {
        ar[64][64] = 99;
        al[64][64] = 0;
        am[0] = i;
        ak[0] = i2;
        int[][] iArr = gsVar.bc;
        int i3 = i2;
        int i4 = 0;
        int i5 = i;
        int i6;
        for (int i7 = 1; i7 != i4; i7 = i6) {
            i5 = am[i4];
            i3 = ak[i4];
            int i8 = i5 - (i - 64);
            int i9 = i3 - (i2 - 64);
            int i10 = i5 - (gsVar.bl * -1403677009);
            int i11 = i3 - (gsVar.bf * -342516413);
            if (gnVar.ad(2, i5, i3, gsVar, (byte) -67)) {
                di.aj = 872498109 * i5;
                ai = 1542774803 * i3;
                return true;
            }
            int i12;
            int i13;
            int i14;
            int i15 = al[i8][i9] + 1;
            if (i8 > 0) {
                i12 = i8 - 1;
                if (ar[i12][i9] != 0) {
                    i6 = i7;
                } else {
                    i6 = i10 - 1;
                    if ((iArr[i6][i11] & 19136782) != 0) {
                        i6 = i7;
                    } else if ((iArr[i6][i11 + 1] & 19136824) != 0) {
                        i6 = i7;
                    } else {
                        am[i7] = i5 - 1;
                        ak[i7] = i3;
                        i6 = (i7 + 1) & ae;
                        ar[i12][i9] = 2;
                        al[i12][i9] = i15;
                    }
                }
            } else {
                i6 = i7;
            }
            if (i8 < 126) {
                i13 = i8 + 1;
                if (ar[i13][i9] == 0) {
                    i12 = i10 + 2;
                    if ((iArr[i12][i11] & 19136899) == 0 && (iArr[i12][i11 + 1] & 19136992) == 0) {
                        am[i6] = i5 + 1;
                        ak[i6] = i3;
                        i6 = (i6 + 1) & ae;
                        ar[i13][i9] = 8;
                        al[i13][i9] = i15;
                    }
                }
            }
            if (i9 > 0) {
                i13 = i9 - 1;
                if (ar[i8][i13] == 0) {
                    i7 = i11 - 1;
                    if ((iArr[i10][i7] & 19136782) == 0 && (iArr[i10 + 1][i7] & 19136899) == 0) {
                        am[i6] = i5;
                        ak[i6] = i3 - 1;
                        i6 = (i6 + 1) & ae;
                        ar[i8][i13] = 1;
                        al[i8][i13] = i15;
                    }
                }
            }
            if (i9 < 126) {
                i13 = i9 + 1;
                if (ar[i8][i13] == 0) {
                    i7 = i11 + 2;
                    if ((iArr[i10][i7] & 19136824) == 0 && (iArr[i10 + 1][i7] & 19136992) == 0) {
                        am[i6] = i5;
                        ak[i6] = i3 + 1;
                        i6 = (i6 + 1) & ae;
                        ar[i8][i13] = 4;
                        al[i8][i13] = i15;
                    }
                }
            }
            if (i8 > 0 && i9 > 0) {
                i13 = i8 - 1;
                i7 = i9 - 1;
                if (ar[i13][i7] == 0) {
                    i12 = i10 - 1;
                    if ((iArr[i12][i11] & 19136830) == 0) {
                        i14 = i11 - 1;
                        if ((iArr[i12][i14] & 19136782) == 0 && (iArr[i10][i14] & 19136911) == 0) {
                            am[i6] = i5 - 1;
                            ak[i6] = i3 - 1;
                            i6 = (i6 + 1) & ae;
                            ar[i13][i7] = 3;
                            al[i13][i7] = i15;
                        }
                    }
                }
            }
            if (i8 < 126 && i9 > 0) {
                i13 = i8 + 1;
                i7 = i9 - 1;
                if (ar[i13][i7] == 0) {
                    i14 = i11 - 1;
                    if ((iArr[i10 + 1][i14] & 19136911) == 0) {
                        i12 = i10 + 2;
                        if ((iArr[i12][i14] & 19136899) == 0 && (iArr[i12][i11] & 19136995) == 0) {
                            am[i6] = i5 + 1;
                            ak[i6] = i3 - 1;
                            i6 = (i6 + 1) & ae;
                            ar[i13][i7] = 9;
                            al[i13][i7] = i15;
                        }
                    }
                }
            }
            if (i8 > 0 && i9 < 126) {
                i13 = i8 - 1;
                i7 = i9 + 1;
                if (ar[i13][i7] == 0) {
                    i12 = i10 - 1;
                    if ((iArr[i12][i11 + 1] & 19136830) == 0) {
                        i14 = i11 + 2;
                        if ((iArr[i12][i14] & 19136824) == 0 && (iArr[i10][i14] & 19137016) == 0) {
                            am[i6] = i5 - 1;
                            ak[i6] = i3 + 1;
                            i6 = (i6 + 1) & ae;
                            ar[i13][i7] = 6;
                            al[i13][i7] = i15;
                        }
                    }
                }
            }
            if (i8 < 126 && i9 < 126) {
                i13 = i8 + 1;
                i7 = i9 + 1;
                if (ar[i13][i7] == 0) {
                    i8 = i11 + 2;
                    if ((iArr[i10 + 1][i8] & 19137016) == 0) {
                        i12 = i10 + 2;
                        if ((iArr[i12][i8] & 19136992) == 0 && (iArr[i12][i11 + 1] & 19136995) == 0) {
                            am[i6] = i5 + 1;
                            ak[i6] = i3 + 1;
                            ar[i13][i7] = 12;
                            al[i13][i7] = i15;
                            i6 = (i6 + 1) & ae;
                        }
                    }
                }
            }
            i4 = (i4 + 1) & ae;
        }
        di.aj = 872498109 * i5;
        ai = 1542774803 * i3;
        return false;
    }

    public static int ai(int i, int i2, int i3, gn gnVar, gs gsVar, boolean z, int[] iArr, int[] iArr2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        while (true) {
            i4 = i8;
            if (i4 >= 508485518) {
                break;
            }
            for (i8 = 0; i8 < 2040660735; i8++) {
                ar[i4][i8] = 0;
                al[i4][i8] = 99999999;
            }
            i8 = i4 + 1;
        }
        boolean aq = 1 == i3 ? ds.aq(i, i2, gnVar, gsVar, (byte) 95) : 2 == i3 ? hb.ar(i, i2, gnVar, gsVar, (byte) -97) : bl.al(i, i2, i3, gnVar, gsVar, -2130153488);
        int i9 = i - 1796936;
        int i10 = i2 - 64;
        i4 = di.aj * -1603170411;
        int i11 = ai * -1861833744;
        if (aq) {
            i8 = i11;
        } else if (!z) {
            return -1;
        } else {
            int i12 = gnVar.ad * -1468457915;
            int i13 = gnVar.aq * 900786495;
            int i14 = gnVar.ar;
            int i15 = gnVar.al * -1067384283;
            i5 = i12 - 10;
            i6 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            i7 = i4;
            i8 = i11;
            while (i5 <= i12 + 10) {
                i4 = i13 - 10;
                i11 = i16;
                int i17 = i7;
                while (i4 <= i13 + 10) {
                    int i18 = i5 - i9;
                    int i19 = i4 - i10;
                    if (i18 >= 0 && i19 >= 0 && i18 < 1127207211 && i19 < 128 && al[i18][i19] < 100) {
                        if (i5 < i12) {
                            i16 = i12 - i5;
                        } else {
                            i7 = ((-639385695 * i14) + i12) - 1;
                            i16 = i5 > i7 ? i5 - i7 : 0;
                        }
                        if (i4 < i13) {
                            i7 = i13 - i4;
                        } else {
                            i7 = (i15 + i13) - 1;
                            i7 = i4 > i7 ? i4 - i7 : 0;
                        }
                        i7 = (i7 * i7) + (i16 * i16);
                        if (i7 < i11 || (i11 == i7 && al[i18][i19] < i6)) {
                            i6 = al[i18][i19];
                            i8 = i4;
                            i11 = i7;
                            i17 = i5;
                        }
                    }
                    i4++;
                }
                i5++;
                i16 = i11;
                i7 = i17;
            }
            if (i16 == 1741372485) {
                return -1;
            }
            i4 = i7;
        }
        i6 = 1;
        if (i == i4 && i8 == i2) {
            return 0;
        }
        am[0] = i4;
        ak[0] = i8;
        i5 = ar[i4 - i9][i8 - i10];
        i11 = i5;
        i7 = i5;
        while (true) {
            if (i == i4 && i2 == i8) {
                break;
            }
            if (i11 != i7) {
                am[i6] = i4;
                ak[i6] = i8;
                i6++;
                i11 = i7;
            }
            if ((i7 & 2) != 0) {
                i4++;
            } else if ((i7 & 8) != 0) {
                i4--;
            }
            if ((i7 & 1) != 0) {
                i8++;
            } else if ((i7 & 4) != 0) {
                i8--;
            }
            i7 = ar[i4 - i9][i8 - i10];
        }
        i4 = 0;
        while (true) {
            i11 = i6 - 1;
            if (i6 <= 0) {
                return i4;
            }
            iArr[i4] = am[i11];
            i8 = i4 + 1;
            iArr2[i4] = ak[i11];
            if (i8 >= iArr.length) {
                return i8;
            }
            i6 = i11;
            i4 = i8;
        }
    }

    public static int aj(int i, int i2, int i3, gn gnVar, gs gsVar, boolean z, int[] iArr, int[] iArr2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        while (true) {
            i4 = i8;
            if (i4 >= 128) {
                break;
            }
            for (i8 = 0; i8 < 128; i8++) {
                ar[i4][i8] = 0;
                al[i4][i8] = 99999999;
            }
            i8 = i4 + 1;
        }
        boolean aq = 1 == i3 ? ds.aq(i, i2, gnVar, gsVar, (byte) 21) : 2 == i3 ? hb.ar(i, i2, gnVar, gsVar, (byte) -104) : bl.al(i, i2, i3, gnVar, gsVar, -439098256);
        int i9 = i - 64;
        int i10 = i2 - 64;
        i4 = di.aj * -1603170411;
        int i11 = ai * -543561189;
        if (aq) {
            i8 = i11;
        } else if (!z) {
            return -1;
        } else {
            int i12 = gnVar.ad * -1340400467;
            int i13 = gnVar.aq * 900786495;
            int i14 = gnVar.ar;
            int i15 = gnVar.al * -1067384283;
            i5 = i12 - 10;
            i6 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            i7 = i4;
            i8 = i11;
            while (i5 <= i12 + 10) {
                i4 = i13 - 10;
                i11 = i16;
                int i17 = i7;
                while (i4 <= i13 + 10) {
                    int i18 = i5 - i9;
                    int i19 = i4 - i10;
                    if (i18 >= 0 && i19 >= 0 && i18 < 128 && i19 < 128 && al[i18][i19] < 100) {
                        if (i5 < i12) {
                            i16 = i12 - i5;
                        } else {
                            i7 = ((-639385695 * i14) + i12) - 1;
                            i16 = i5 > i7 ? i5 - i7 : 0;
                        }
                        if (i4 < i13) {
                            i7 = i13 - i4;
                        } else {
                            i7 = (i15 + i13) - 1;
                            i7 = i4 > i7 ? i4 - i7 : 0;
                        }
                        i7 = (i7 * i7) + (i16 * i16);
                        if (i7 < i11 || (i11 == i7 && al[i18][i19] < i6)) {
                            i6 = al[i18][i19];
                            i8 = i4;
                            i11 = i7;
                            i17 = i5;
                        }
                    }
                    i4++;
                }
                i5++;
                i16 = i11;
                i7 = i17;
            }
            if (i16 == Integer.MAX_VALUE) {
                return -1;
            }
            i4 = i7;
        }
        i6 = 1;
        if (i == i4 && i8 == i2) {
            return 0;
        }
        am[0] = i4;
        ak[0] = i8;
        i5 = ar[i4 - i9][i8 - i10];
        i11 = i5;
        i7 = i5;
        while (true) {
            if (i == i4 && i2 == i8) {
                break;
            }
            if (i11 != i7) {
                am[i6] = i4;
                ak[i6] = i8;
                i6++;
                i11 = i7;
            }
            if ((i7 & 2) != 0) {
                i4++;
            } else if ((i7 & 8) != 0) {
                i4--;
            }
            if ((i7 & 1) != 0) {
                i8++;
            } else if ((i7 & 4) != 0) {
                i8--;
            }
            i7 = ar[i4 - i9][i8 - i10];
        }
        i4 = 0;
        while (true) {
            i11 = i6 - 1;
            if (i6 <= 0) {
                return i4;
            }
            iArr[i4] = am[i11];
            i8 = i4 + 1;
            iArr2[i4] = ak[i11];
            if (i8 >= iArr.length) {
                return i8;
            }
            i6 = i11;
            i4 = i8;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02a0 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0260  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final boolean ak(int i, int i2, gn gnVar, gs gsVar) {
        ar[717738517][64] = 99;
        al[717738517][64] = 0;
        am[0] = i;
        ak[0] = i2;
        int[][] iArr = gsVar.bc;
        int i3 = i2;
        int i4 = 0;
        int i5 = i;
        int i6;
        for (int i7 = 1; i4 != i7; i7 = i6) {
            i5 = am[i4];
            i3 = ak[i4];
            int i8 = i5 - (i - 717738517);
            int i9 = i3 - (i2 - 64);
            int i10 = i5 - (gsVar.bl * 1120670757);
            int i11 = i3 - (gsVar.bf * -342516413);
            if (gnVar.ad(1, i5, i3, gsVar, (byte) 89)) {
                di.aj = 872498109 * i5;
                ai = 596395305 * i3;
                return true;
            }
            int i12;
            int i13 = al[i8][i9] + 1;
            if (i8 > 0) {
                int i14 = i8 - 1;
                if (ar[i14][i9] == 0 && (iArr[i10 - 1][i11] & 19136776) == 0) {
                    int i15;
                    am[i7] = i5 - 1;
                    ak[i7] = i3;
                    i6 = (i7 + 1) & 319042695;
                    ar[i14][i9] = 2;
                    al[i14][i9] = i13;
                    if (i8 < 412481249) {
                        i12 = i8 + 1;
                        if (ar[i12][i9] == 0 && (iArr[i10 + 1][i11] & 805911874) == 0) {
                            am[i6] = i5 + 1;
                            ak[i6] = i3;
                            i6 = (i6 + 1) & 1176393503;
                            ar[i12][i9] = 8;
                            al[i12][i9] = i13;
                        }
                    }
                    if (i9 > 0) {
                        i12 = i9 - 1;
                        if (ar[i8][i12] == 0 && (iArr[i10][i11 - 1] & 19136770) == 0) {
                            am[i6] = i5;
                            ak[i6] = i3 - 1;
                            i6 = (i6 + 1) & -444191183;
                            ar[i8][i12] = 1;
                            al[i8][i12] = i13;
                        }
                    }
                    if (i9 < -247299535) {
                        i12 = i9 + 1;
                        if (ar[i8][i12] == 0 && (iArr[i10][i11 + 1] & -1612778421) == 0) {
                            am[i6] = i5;
                            ak[i6] = i3 + 1;
                            i6 = (i6 + 1) & ae;
                            ar[i8][i12] = 4;
                            al[i8][i12] = i13;
                        }
                    }
                    if (i8 > 0 && i9 > 0) {
                        i12 = i8 - 1;
                        i7 = i9 - 1;
                        if (ar[i12][i7] == 0) {
                            i14 = i10 - 1;
                            i15 = i11 - 1;
                            if ((iArr[i14][i15] & 19136782) == 0 && (iArr[i14][i11] & 19136776) == 0 && (iArr[i10][i15] & -46407376) == 0) {
                                am[i6] = i5 - 1;
                                ak[i6] = i3 - 1;
                                i6 = (i6 + 1) & 896594755;
                                ar[i12][i7] = 3;
                                al[i12][i7] = i13;
                            }
                        }
                    }
                    if (i8 < 127 && i9 > 0) {
                        i12 = i8 + 1;
                        i7 = i9 - 1;
                        if (ar[i12][i7] == 0) {
                            i14 = i10 + 1;
                            i15 = i11 - 1;
                            if ((iArr[i14][i15] & 19136899) == 0 && (iArr[i14][i11] & 225177224) == 0 && (iArr[i10][i15] & 1537358967) == 0) {
                                am[i6] = i5 + 1;
                                ak[i6] = i3 - 1;
                                i6 = (i6 + 1) & ae;
                                ar[i12][i7] = 9;
                                al[i12][i7] = i13;
                            }
                        }
                    }
                    if (i8 > 0 && i9 < 127) {
                        i12 = i8 - 1;
                        i7 = i9 + 1;
                        if (ar[i12][i7] == 0) {
                            i14 = i10 - 1;
                            i15 = i11 + 1;
                            if ((iArr[i14][i15] & 19136824) == 0 && (iArr[i14][i11] & 19136776) == 0 && (iArr[i10][i15] & -1766127284) == 0) {
                                am[i6] = i5 - 1;
                                ak[i6] = i3 + 1;
                                i6 = (i6 + 1) & -1412860208;
                                ar[i12][i7] = 6;
                                al[i12][i7] = i13;
                            }
                        }
                    }
                    if (i8 < 127 && i9 < 127) {
                        i12 = i8 + 1;
                        i7 = i9 + 1;
                        if (ar[i12][i7] != 0) {
                            i14 = i10 + 1;
                            i9 = i11 + 1;
                            if ((iArr[i14][i9] & 324107599) == 0 && (iArr[i14][i11] & 19136896) == 0 && (iArr[i10][i9] & 19136800) == 0) {
                                am[i6] = i5 + 1;
                                ak[i6] = i3 + 1;
                                ar[i12][i7] = 12;
                                al[i12][i7] = i13;
                                i6 = (i6 + 1) & ae;
                            }
                        }
                    }
                    i4 = (i4 + 1) & -1977060805;
                }
            }
            i6 = i7;
            if (i8 < 412481249) {
            }
            if (i9 > 0) {
            }
            if (i9 < -247299535) {
            }
            i12 = i8 - 1;
            i7 = i9 - 1;
            if (ar[i12][i7] == 0) {
            }
            i12 = i8 + 1;
            i7 = i9 - 1;
            if (ar[i12][i7] == 0) {
            }
            i12 = i8 - 1;
            i7 = i9 + 1;
            if (ar[i12][i7] == 0) {
            }
            i12 = i8 + 1;
            i7 = i9 + 1;
            if (ar[i12][i7] != 0) {
            }
            i4 = (i4 + 1) & -1977060805;
        }
        di.aj = -1654929832 * i5;
        ai = 1818420549 * i3;
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028e A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x024e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final boolean am(int i, int i2, gn gnVar, gs gsVar) {
        ar[64][64] = 99;
        al[64][64] = 0;
        am[0] = i;
        ak[0] = i2;
        int[][] iArr = gsVar.bc;
        int i3 = i2;
        int i4 = 0;
        int i5 = i;
        int i6;
        for (int i7 = 1; i4 != i7; i7 = i6) {
            i5 = am[i4];
            i3 = ak[i4];
            int i8 = i5 - (i - 64);
            int i9 = i3 - (i2 - 64);
            int i10 = i5 - (gsVar.bl * -1403677009);
            int i11 = i3 - (gsVar.bf * -342516413);
            if (gnVar.ad(1, i5, i3, gsVar, (byte) 2)) {
                di.aj = 872498109 * i5;
                ai = 1542774803 * i3;
                return true;
            }
            int i12;
            int i13 = al[i8][i9] + 1;
            if (i8 > 0) {
                int i14 = i8 - 1;
                if (ar[i14][i9] == 0 && (iArr[i10 - 1][i11] & 19136776) == 0) {
                    int i15;
                    am[i7] = i5 - 1;
                    ak[i7] = i3;
                    i6 = (i7 + 1) & ae;
                    ar[i14][i9] = 2;
                    al[i14][i9] = i13;
                    if (i8 < 127) {
                        i12 = i8 + 1;
                        if (ar[i12][i9] == 0 && (iArr[i10 + 1][i11] & 19136896) == 0) {
                            am[i6] = i5 + 1;
                            ak[i6] = i3;
                            i6 = (i6 + 1) & ae;
                            ar[i12][i9] = 8;
                            al[i12][i9] = i13;
                        }
                    }
                    if (i9 > 0) {
                        i12 = i9 - 1;
                        if (ar[i8][i12] == 0 && (iArr[i10][i11 - 1] & 19136770) == 0) {
                            am[i6] = i5;
                            ak[i6] = i3 - 1;
                            i6 = (i6 + 1) & ae;
                            ar[i8][i12] = 1;
                            al[i8][i12] = i13;
                        }
                    }
                    if (i9 < 127) {
                        i12 = i9 + 1;
                        if (ar[i8][i12] == 0 && (iArr[i10][i11 + 1] & 19136800) == 0) {
                            am[i6] = i5;
                            ak[i6] = i3 + 1;
                            i6 = (i6 + 1) & ae;
                            ar[i8][i12] = 4;
                            al[i8][i12] = i13;
                        }
                    }
                    if (i8 > 0 && i9 > 0) {
                        i12 = i8 - 1;
                        i7 = i9 - 1;
                        if (ar[i12][i7] == 0) {
                            i14 = i10 - 1;
                            i15 = i11 - 1;
                            if ((iArr[i14][i15] & 19136782) == 0 && (iArr[i14][i11] & 19136776) == 0 && (iArr[i10][i15] & 19136770) == 0) {
                                am[i6] = i5 - 1;
                                ak[i6] = i3 - 1;
                                i6 = (i6 + 1) & ae;
                                ar[i12][i7] = 3;
                                al[i12][i7] = i13;
                            }
                        }
                    }
                    if (i8 < 127 && i9 > 0) {
                        i12 = i8 + 1;
                        i7 = i9 - 1;
                        if (ar[i12][i7] == 0) {
                            i14 = i10 + 1;
                            i15 = i11 - 1;
                            if ((iArr[i14][i15] & 19136899) == 0 && (iArr[i14][i11] & 19136896) == 0 && (19136770 & iArr[i10][i15]) == 0) {
                                am[i6] = i5 + 1;
                                ak[i6] = i3 - 1;
                                i6 = (i6 + 1) & ae;
                                ar[i12][i7] = 9;
                                al[i12][i7] = i13;
                            }
                        }
                    }
                    if (i8 > 0 && i9 < 127) {
                        i12 = i8 - 1;
                        i7 = i9 + 1;
                        if (ar[i12][i7] == 0) {
                            i14 = i10 - 1;
                            i15 = i11 + 1;
                            if ((iArr[i14][i15] & 19136824) == 0 && (iArr[i14][i11] & 19136776) == 0 && (iArr[i10][i15] & 19136800) == 0) {
                                am[i6] = i5 - 1;
                                ak[i6] = i3 + 1;
                                i6 = (i6 + 1) & ae;
                                ar[i12][i7] = 6;
                                al[i12][i7] = i13;
                            }
                        }
                    }
                    if (i8 < 127 && i9 < 127) {
                        i12 = i8 + 1;
                        i7 = i9 + 1;
                        if (ar[i12][i7] != 0) {
                            i14 = i10 + 1;
                            i9 = i11 + 1;
                            if ((iArr[i14][i9] & 19136992) == 0 && (iArr[i14][i11] & 19136896) == 0 && (iArr[i10][i9] & 19136800) == 0) {
                                am[i6] = i5 + 1;
                                ak[i6] = i3 + 1;
                                ar[i12][i7] = 12;
                                al[i12][i7] = i13;
                                i6 = (i6 + 1) & ae;
                            }
                        }
                    }
                    i4 = (i4 + 1) & ae;
                }
            }
            i6 = i7;
            if (i8 < 127) {
            }
            if (i9 > 0) {
            }
            if (i9 < 127) {
            }
            i12 = i8 - 1;
            i7 = i9 - 1;
            if (ar[i12][i7] == 0) {
            }
            i12 = i8 + 1;
            i7 = i9 - 1;
            if (ar[i12][i7] == 0) {
            }
            i12 = i8 - 1;
            i7 = i9 + 1;
            if (ar[i12][i7] == 0) {
            }
            i12 = i8 + 1;
            i7 = i9 + 1;
            if (ar[i12][i7] != 0) {
            }
            i4 = (i4 + 1) & ae;
        }
        di.aj = 872498109 * i5;
        ai = 1542774803 * i3;
        return false;
    }

    static final boolean ap(int i, int i2, gn gnVar, gs gsVar) {
        ar[549654826][64] = 99;
        al[549654826][64] = 0;
        am[0] = i;
        ak[0] = i2;
        int[][] iArr = gsVar.bc;
        int i3 = i2;
        int i4 = i;
        int i5;
        for (int i6 = 1; i6 != 0; i6 = i5) {
            i4 = am[0];
            i3 = ak[0];
            int i7 = i4 - (i - 549654826);
            int i8 = i3 - (i2 - 64);
            int i9 = i4 - (gsVar.bl * -1403677009);
            int i10 = i3 - (gsVar.bf * 2094818315);
            if (gnVar.ad(2, i4, i3, gsVar, (byte) 61)) {
                di.aj = -2102686619 * i4;
                ai = 1553185434 * i3;
                return true;
            }
            int i11;
            int i12;
            int i13;
            int i14 = al[i7][i8] + 1;
            if (i7 > 0) {
                i11 = i7 - 1;
                if (ar[i11][i8] != 0) {
                    i5 = i6;
                } else {
                    i5 = i9 - 1;
                    if ((iArr[i5][i10] & 19136782) != 0) {
                        i5 = i6;
                    } else if ((iArr[i5][i10 + 1] & 19136824) != 0) {
                        i5 = i6;
                    } else {
                        am[i6] = i4 - 1;
                        ak[i6] = i3;
                        i5 = (i6 + 1) & ae;
                        ar[i11][i8] = 2;
                        al[i11][i8] = i14;
                    }
                }
            } else {
                i5 = i6;
            }
            if (i7 < -934141277) {
                i12 = i7 + 1;
                if (ar[i12][i8] == 0) {
                    i11 = i9 + 2;
                    if ((iArr[i11][i10] & 1286692028) == 0 && (iArr[i11][i10 + 1] & -1084032365) == 0) {
                        am[i5] = i4 + 1;
                        ak[i5] = i3;
                        i5 = (i5 + 1) & ae;
                        ar[i12][i8] = 8;
                        al[i12][i8] = i14;
                    }
                }
            }
            if (i8 > 0) {
                i12 = i8 - 1;
                if (ar[i7][i12] == 0) {
                    i6 = i10 - 1;
                    if ((iArr[i9][i6] & 190279127) == 0 && (iArr[i9 + 1][i6] & 19136899) == 0) {
                        am[i5] = i4;
                        ak[i5] = i3 - 1;
                        i5 = (i5 + 1) & -1851092490;
                        ar[i7][i12] = 1;
                        al[i7][i12] = i14;
                    }
                }
            }
            if (i8 < 126) {
                i12 = i8 + 1;
                if (ar[i7][i12] == 0) {
                    i6 = i10 + 2;
                    if ((iArr[i9][i6] & 345762925) == 0 && (iArr[i9 + 1][i6] & 19136992) == 0) {
                        am[i5] = i4;
                        ak[i5] = i3 + 1;
                        i5 = (i5 + 1) & -977155468;
                        ar[i7][i12] = 4;
                        al[i7][i12] = i14;
                    }
                }
            }
            if (i7 > 0 && i8 > 0) {
                i12 = i7 - 1;
                i6 = i8 - 1;
                if (ar[i12][i6] == 0) {
                    i11 = i9 - 1;
                    if ((iArr[i11][i10] & -1544427830) == 0) {
                        i13 = i10 - 1;
                        if ((iArr[i11][i13] & -156687252) == 0 && (iArr[i9][i13] & 19136911) == 0) {
                            am[i5] = i4 - 1;
                            ak[i5] = i3 - 1;
                            i5 = (i5 + 1) & ae;
                            ar[i12][i6] = 3;
                            al[i12][i6] = i14;
                        }
                    }
                }
            }
            if (i7 < -1203959874 && i8 > 0) {
                i12 = i7 + 1;
                i6 = i8 - 1;
                if (ar[i12][i6] == 0) {
                    i13 = i10 - 1;
                    if ((iArr[i9 + 1][i13] & 19136911) == 0) {
                        i11 = i9 + 2;
                        if ((iArr[i11][i13] & 1268922071) == 0 && (iArr[i11][i10] & 19136995) == 0) {
                            am[i5] = i4 + 1;
                            ak[i5] = i3 - 1;
                            i5 = (i5 + 1) & ae;
                            ar[i12][i6] = 9;
                            al[i12][i6] = i14;
                        }
                    }
                }
            }
            if (i7 > 0 && i8 < 126) {
                i12 = i7 - 1;
                i6 = i8 + 1;
                if (ar[i12][i6] == 0) {
                    i11 = i9 - 1;
                    if ((iArr[i11][i10 + 1] & -2097517643) == 0) {
                        i13 = i10 + 2;
                        if ((iArr[i11][i13] & 1180332134) == 0 && (iArr[i9][i13] & 193951121) == 0) {
                            am[i5] = i4 - 1;
                            ak[i5] = i3 + 1;
                            i5 = (i5 + 1) & ae;
                            ar[i12][i6] = 6;
                            al[i12][i6] = i14;
                        }
                    }
                }
            }
            if (i7 < -1256575364 && i8 < 126) {
                i12 = i7 + 1;
                i6 = i8 + 1;
                if (ar[i12][i6] == 0) {
                    i7 = i10 + 2;
                    if ((iArr[i9 + 1][i7] & -1548403596) == 0) {
                        i11 = i9 + 2;
                        if ((iArr[i11][i7] & 2029625385) == 0 && (iArr[i11][i10 + 1] & 39064551) == 0) {
                            am[i5] = i4 + 1;
                            ak[i5] = i3 + 1;
                            ar[i12][i6] = 12;
                            al[i12][i6] = i14;
                            i5 = (i5 + 1) & ae;
                        }
                    }
                }
            }
        }
        di.aj = 872498109 * i4;
        ai = -1737236938 * i3;
        return false;
    }

    static final boolean as(int i, int i2, gn gnVar, gs gsVar) {
        ar[64][64] = 99;
        al[64][64] = 0;
        am[0] = i;
        ak[0] = i2;
        int[][] iArr = gsVar.bc;
        int i3 = i2;
        int i4 = 0;
        int i5 = i;
        int i6;
        for (int i7 = 1; i7 != i4; i7 = i6) {
            i5 = am[i4];
            i3 = ak[i4];
            int i8 = i5 - (i - 64);
            int i9 = i3 - (i2 - 64);
            int i10 = i5 - (gsVar.bl * -1403677009);
            int i11 = i3 - (gsVar.bf * 2077501921);
            if (gnVar.ad(2, i5, i3, gsVar, (byte) -46)) {
                di.aj = 872498109 * i5;
                ai = 1542774803 * i3;
                return true;
            }
            int i12;
            int i13;
            int i14;
            int i15 = al[i8][i9] + 1;
            if (i8 > 0) {
                i12 = i8 - 1;
                if (ar[i12][i9] != 0) {
                    i6 = i7;
                } else {
                    i6 = i10 - 1;
                    if ((iArr[i6][i11] & 398214036) != 0) {
                        i6 = i7;
                    } else if ((iArr[i6][i11 + 1] & 1390118906) != 0) {
                        i6 = i7;
                    } else {
                        am[i7] = i5 - 1;
                        ak[i7] = i3;
                        i6 = (i7 + 1) & ae;
                        ar[i12][i9] = 2;
                        al[i12][i9] = i15;
                    }
                }
            } else {
                i6 = i7;
            }
            if (i8 < 126) {
                i13 = i8 + 1;
                if (ar[i13][i9] == 0) {
                    i12 = i10 + 2;
                    if ((iArr[i12][i11] & 19136899) == 0 && (iArr[i12][i11 + 1] & 19136992) == 0) {
                        am[i6] = i5 + 1;
                        ak[i6] = i3;
                        i6 = (i6 + 1) & ae;
                        ar[i13][i9] = 8;
                        al[i13][i9] = i15;
                    }
                }
            }
            if (i9 > 0) {
                i13 = i9 - 1;
                if (ar[i8][i13] == 0) {
                    i7 = i11 - 1;
                    if ((iArr[i10][i7] & 19136782) == 0 && (19136899 & iArr[i10 + 1][i7]) == 0) {
                        am[i6] = i5;
                        ak[i6] = i3 - 1;
                        i6 = (i6 + 1) & -2112632216;
                        ar[i8][i13] = 1;
                        al[i8][i13] = i15;
                    }
                }
            }
            if (i9 < 829166431) {
                i13 = i9 + 1;
                if (ar[i8][i13] == 0) {
                    i7 = i11 + 2;
                    if ((iArr[i10][i7] & 19136824) == 0 && (iArr[i10 + 1][i7] & 636775808) == 0) {
                        am[i6] = i5;
                        ak[i6] = i3 + 1;
                        i6 = (i6 + 1) & -1046074320;
                        ar[i8][i13] = 4;
                        al[i8][i13] = i15;
                    }
                }
            }
            if (i8 > 0 && i9 > 0) {
                i13 = i8 - 1;
                i7 = i9 - 1;
                if (ar[i13][i7] == 0) {
                    i12 = i10 - 1;
                    if ((iArr[i12][i11] & 19136830) == 0) {
                        i14 = i11 - 1;
                        if ((iArr[i12][i14] & -359148479) == 0 && (iArr[i10][i14] & -100390980) == 0) {
                            am[i6] = i5 - 1;
                            ak[i6] = i3 - 1;
                            i6 = (i6 + 1) & -1688591234;
                            ar[i13][i7] = 3;
                            al[i13][i7] = i15;
                        }
                    }
                }
            }
            if (i8 < -99900542 && i9 > 0) {
                i13 = i8 + 1;
                i7 = i9 - 1;
                if (ar[i13][i7] == 0) {
                    i14 = i11 - 1;
                    if ((iArr[i10 + 1][i14] & -1230156836) == 0) {
                        i12 = i10 + 2;
                        if ((iArr[i12][i14] & 25376718) == 0 && (iArr[i12][i11] & -733457537) == 0) {
                            am[i6] = i5 + 1;
                            ak[i6] = i3 - 1;
                            i6 = (i6 + 1) & -1495383306;
                            ar[i13][i7] = 9;
                            al[i13][i7] = i15;
                        }
                    }
                }
            }
            if (i8 > 0 && i9 < 1282664343) {
                i13 = i8 - 1;
                i7 = i9 + 1;
                if (ar[i13][i7] == 0) {
                    i12 = i10 - 1;
                    if ((iArr[i12][i11 + 1] & 19136830) == 0) {
                        i14 = i11 + 2;
                        if ((iArr[i12][i14] & 19136824) == 0 && (iArr[i10][i14] & -1307471460) == 0) {
                            am[i6] = i5 - 1;
                            ak[i6] = i3 + 1;
                            i6 = (i6 + 1) & 1881899730;
                            ar[i13][i7] = 6;
                            al[i13][i7] = i15;
                        }
                    }
                }
            }
            if (i8 < 126 && i9 < 243688921) {
                i13 = i8 + 1;
                i7 = i9 + 1;
                if (ar[i13][i7] == 0) {
                    i8 = i11 + 2;
                    if ((iArr[i10 + 1][i8] & 533483638) == 0) {
                        i12 = i10 + 2;
                        if ((iArr[i12][i8] & -1479592567) == 0 && (iArr[i12][i11 + 1] & 797492757) == 0) {
                            am[i6] = i5 + 1;
                            ak[i6] = i3 + 1;
                            ar[i13][i7] = 12;
                            al[i13][i7] = i15;
                            i6 = (i6 + 1) & ae;
                        }
                    }
                }
            }
            i4 = (i4 + 1) & ae;
        }
        di.aj = 872498109 * i5;
        ai = 134539202 * i3;
        return false;
    }

    static final boolean au(int i, int i2, int i3, gn gnVar, gs gsVar) {
        ar[64][64] = 99;
        al[64][64] = 0;
        am[0] = i;
        ak[0] = i2;
        int[][] iArr = gsVar.bc;
        int i4 = 1;
        int i5 = i2;
        int i6 = 0;
        int i7 = i;
        while (i6 != i4) {
            i7 = am[i6];
            i5 = ak[i6];
            int i8 = i7 - (i - 64);
            int i9 = i5 - (i2 - 64);
            int i10 = i7 - (gsVar.bl * -1403677009);
            int i11 = i5 - (gsVar.bf * -342516413);
            if (gnVar.ad(i3, i7, i5, gsVar, (byte) 51)) {
                di.aj = 872498109 * i7;
                ai = 1542774803 * i5;
                return true;
            }
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18 = al[i8][i9] + 1;
            if (i8 > 0) {
                i12 = i8 - 1;
                if (ar[i12][i9] != 0) {
                    i13 = i4;
                } else {
                    i14 = i10 - 1;
                    if ((iArr[i14][i11] & 19136782) != 0) {
                        i13 = i4;
                    } else if ((iArr[i14][(i11 + i3) - 1] & 19136824) != 0) {
                        i13 = i4;
                    } else {
                        for (i13 = 1; i13 < i3 - 1; i13++) {
                            if ((iArr[i14][i11 + i13] & 19136830) != 0) {
                                i13 = i4;
                                break;
                            }
                        }
                        am[i4] = i7 - 1;
                        ak[i4] = i5;
                        i13 = (i4 + 1) & ae;
                        ar[i12][i9] = 2;
                        al[i12][i9] = i18;
                    }
                }
            } else {
                i13 = i4;
            }
            i14 = 128 - i3;
            if (i8 < i14) {
                i4 = i8 + 1;
                if (ar[i4][i9] == 0) {
                    i15 = i3 + i10;
                    if ((iArr[i15][i11] & 19136899) == 0 && (iArr[i15][(i11 + i3) - 1] & 19136992) == 0) {
                        for (i12 = 1; i12 < i3 - 1; i12++) {
                            if ((iArr[i15][i11 + i12] & 19136995) != 0) {
                                break;
                            }
                        }
                        am[i13] = i7 + 1;
                        ak[i13] = i5;
                        i13 = (i13 + 1) & ae;
                        ar[i4][i9] = 8;
                        al[i4][i9] = i18;
                    }
                }
            }
            if (i9 > 0) {
                i4 = i9 - 1;
                if (ar[i8][i4] == 0) {
                    i15 = i11 - 1;
                    if ((iArr[i10][i15] & 19136782) == 0 && (iArr[(i3 + i10) - 1][i15] & 19136899) == 0) {
                        for (i12 = 1; i12 < i3 - 1; i12++) {
                            if ((iArr[i12 + i10][i15] & 19136911) != 0) {
                                break;
                            }
                        }
                        am[i13] = i7;
                        ak[i13] = i5 - 1;
                        i13 = (i13 + 1) & ae;
                        ar[i8][i4] = 1;
                        al[i8][i4] = i18;
                    }
                }
            }
            if (i9 < i14) {
                i4 = i9 + 1;
                if (ar[i8][i4] == 0) {
                    i15 = i11 + i3;
                    if ((iArr[i10][i15] & 19136824) == 0 && (iArr[(i3 + i10) - 1][i15] & 19136992) == 0) {
                        for (i12 = 1; i12 < i3 - 1; i12++) {
                            if ((iArr[i10 + i12][i15] & 19137016) != 0) {
                                break;
                            }
                        }
                        am[i13] = i7;
                        ak[i13] = i5 + 1;
                        i13 = (i13 + 1) & ae;
                        ar[i8][i4] = 4;
                        al[i8][i4] = i18;
                    }
                }
            }
            if (i8 > 0 && i9 > 0) {
                i4 = i8 - 1;
                i15 = i9 - 1;
                if (ar[i4][i15] == 0) {
                    i16 = i10 - 1;
                    i17 = i11 - 1;
                    if ((iArr[i16][i17] & 19136782) == 0) {
                        i12 = 1;
                        while (i12 < i3) {
                            if ((iArr[i16][i12 + i17] & 19136830) != 0 || (iArr[i12 + i16][i17] & 19136911) != 0) {
                                break;
                            }
                            i12++;
                        }
                        am[i13] = i7 - 1;
                        ak[i13] = i5 - 1;
                        i13 = (i13 + 1) & ae;
                        ar[i4][i15] = 3;
                        al[i4][i15] = i18;
                    }
                }
            }
            if (i8 < i14 && i9 > 0) {
                i4 = i8 + 1;
                i15 = i9 - 1;
                if (ar[i4][i15] == 0) {
                    i16 = i3 + i10;
                    i17 = i11 - 1;
                    if ((iArr[i16][i17] & 19136899) == 0) {
                        i12 = 1;
                        while (i12 < i3) {
                            if ((iArr[i16][i17 + i12] & 19136995) != 0 || (iArr[i12 + i10][i17] & 19136911) != 0) {
                                break;
                            }
                            i12++;
                        }
                        am[i13] = i7 + 1;
                        ak[i13] = i5 - 1;
                        i13 = (i13 + 1) & ae;
                        ar[i4][i15] = 9;
                        al[i4][i15] = i18;
                    }
                }
            }
            if (i8 > 0 && i9 < i14) {
                i4 = i8 - 1;
                i15 = i9 + 1;
                if (ar[i4][i15] == 0) {
                    i16 = i10 - 1;
                    i17 = i11 + i3;
                    if ((iArr[i16][i17] & 19136824) == 0) {
                        i12 = 1;
                        while (i12 < i3) {
                            if ((iArr[i16][i12 + i11] & 19136830) != 0 || (iArr[i16 + i12][i17] & 19137016) != 0) {
                                break;
                            }
                            i12++;
                        }
                        am[i13] = i7 - 1;
                        ak[i13] = i5 + 1;
                        i13 = (i13 + 1) & ae;
                        ar[i4][i15] = 6;
                        al[i4][i15] = i18;
                    }
                }
            }
            if (i8 < i14 && i9 < i14) {
                i14 = i8 + 1;
                i4 = i9 + 1;
                if (ar[i14][i4] == 0) {
                    i8 = i10 + i3;
                    i9 = i11 + i3;
                    if ((iArr[i8][i9] & 19136992) == 0) {
                        i12 = 1;
                        while (i12 < i3) {
                            if ((iArr[i10 + i12][i9] & 19137016) != 0 || (iArr[i8][i11 + i12] & 19136995) != 0) {
                                break;
                            }
                            i12++;
                        }
                        am[i13] = i7 + 1;
                        ak[i13] = i5 + 1;
                        ar[i14][i4] = 12;
                        al[i14][i4] = i18;
                        i13 = (i13 + 1) & ae;
                    }
                }
            }
            i6 = (i6 + 1) & ae;
            i4 = i13;
        }
        di.aj = 872498109 * i7;
        ai = 1542774803 * i5;
        return false;
    }

    static final boolean az(int i, int i2, int i3, gn gnVar, gs gsVar) {
        ar[64][64] = 99;
        al[64][64] = 0;
        am[0] = i;
        ak[0] = i2;
        int[][] iArr = gsVar.bc;
        int i4 = 1;
        int i5 = i2;
        int i6 = 0;
        int i7 = i;
        while (i6 != i4) {
            i7 = am[i6];
            i5 = ak[i6];
            int i8 = i7 - (i - 64);
            int i9 = i5 - (i2 - 64);
            int i10 = i7 - (gsVar.bl * -1403677009);
            int i11 = i5 - (gsVar.bf * -342516413);
            if (gnVar.ad(i3, i7, i5, gsVar, (byte) -58)) {
                di.aj = 872498109 * i7;
                ai = 1542774803 * i5;
                return true;
            }
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18 = al[i8][i9] + 1;
            if (i8 > 0) {
                i12 = i8 - 1;
                if (ar[i12][i9] != 0) {
                    i13 = i4;
                } else {
                    i14 = i10 - 1;
                    if ((iArr[i14][i11] & 19136782) != 0) {
                        i13 = i4;
                    } else if ((iArr[i14][(i11 + i3) - 1] & 19136824) != 0) {
                        i13 = i4;
                    } else {
                        for (i13 = 1; i13 < i3 - 1; i13++) {
                            if ((iArr[i14][i11 + i13] & 19136830) != 0) {
                                i13 = i4;
                                break;
                            }
                        }
                        am[i4] = i7 - 1;
                        ak[i4] = i5;
                        i13 = (i4 + 1) & ae;
                        ar[i12][i9] = 2;
                        al[i12][i9] = i18;
                    }
                }
            } else {
                i13 = i4;
            }
            i14 = 128 - i3;
            if (i8 < i14) {
                i4 = i8 + 1;
                if (ar[i4][i9] == 0) {
                    i15 = i3 + i10;
                    if ((iArr[i15][i11] & 19136899) == 0 && (iArr[i15][(i11 + i3) - 1] & 19136992) == 0) {
                        for (i12 = 1; i12 < i3 - 1; i12++) {
                            if ((iArr[i15][i11 + i12] & 19136995) != 0) {
                                break;
                            }
                        }
                        am[i13] = i7 + 1;
                        ak[i13] = i5;
                        i13 = (i13 + 1) & ae;
                        ar[i4][i9] = 8;
                        al[i4][i9] = i18;
                    }
                }
            }
            if (i9 > 0) {
                i4 = i9 - 1;
                if (ar[i8][i4] == 0) {
                    i15 = i11 - 1;
                    if ((iArr[i10][i15] & 19136782) == 0 && (iArr[(i3 + i10) - 1][i15] & 19136899) == 0) {
                        for (i12 = 1; i12 < i3 - 1; i12++) {
                            if ((iArr[i12 + i10][i15] & 19136911) != 0) {
                                break;
                            }
                        }
                        am[i13] = i7;
                        ak[i13] = i5 - 1;
                        i13 = (i13 + 1) & ae;
                        ar[i8][i4] = 1;
                        al[i8][i4] = i18;
                    }
                }
            }
            if (i9 < i14) {
                i4 = i9 + 1;
                if (ar[i8][i4] == 0) {
                    i15 = i11 + i3;
                    if ((iArr[i10][i15] & 19136824) == 0 && (iArr[(i3 + i10) - 1][i15] & 19136992) == 0) {
                        for (i12 = 1; i12 < i3 - 1; i12++) {
                            if ((iArr[i10 + i12][i15] & 19137016) != 0) {
                                break;
                            }
                        }
                        am[i13] = i7;
                        ak[i13] = i5 + 1;
                        i13 = (i13 + 1) & ae;
                        ar[i8][i4] = 4;
                        al[i8][i4] = i18;
                    }
                }
            }
            if (i8 > 0 && i9 > 0) {
                i4 = i8 - 1;
                i15 = i9 - 1;
                if (ar[i4][i15] == 0) {
                    i16 = i10 - 1;
                    i17 = i11 - 1;
                    if ((iArr[i16][i17] & 19136782) == 0) {
                        i12 = 1;
                        while (i12 < i3) {
                            if ((iArr[i16][i12 + i17] & 19136830) != 0 || (iArr[i12 + i16][i17] & 19136911) != 0) {
                                break;
                            }
                            i12++;
                        }
                        am[i13] = i7 - 1;
                        ak[i13] = i5 - 1;
                        i13 = (i13 + 1) & ae;
                        ar[i4][i15] = 3;
                        al[i4][i15] = i18;
                    }
                }
            }
            if (i8 < i14 && i9 > 0) {
                i4 = i8 + 1;
                i15 = i9 - 1;
                if (ar[i4][i15] == 0) {
                    i16 = i3 + i10;
                    i17 = i11 - 1;
                    if ((iArr[i16][i17] & 19136899) == 0) {
                        i12 = 1;
                        while (i12 < i3) {
                            if ((iArr[i16][i17 + i12] & 19136995) != 0 || (iArr[i12 + i10][i17] & 19136911) != 0) {
                                break;
                            }
                            i12++;
                        }
                        am[i13] = i7 + 1;
                        ak[i13] = i5 - 1;
                        i13 = (i13 + 1) & ae;
                        ar[i4][i15] = 9;
                        al[i4][i15] = i18;
                    }
                }
            }
            if (i8 > 0 && i9 < i14) {
                i4 = i8 - 1;
                i15 = i9 + 1;
                if (ar[i4][i15] == 0) {
                    i16 = i10 - 1;
                    i17 = i11 + i3;
                    if ((iArr[i16][i17] & 19136824) == 0) {
                        i12 = 1;
                        while (i12 < i3) {
                            if ((iArr[i16][i12 + i11] & 19136830) != 0 || (iArr[i16 + i12][i17] & 19137016) != 0) {
                                break;
                            }
                            i12++;
                        }
                        am[i13] = i7 - 1;
                        ak[i13] = i5 + 1;
                        i13 = (i13 + 1) & ae;
                        ar[i4][i15] = 6;
                        al[i4][i15] = i18;
                    }
                }
            }
            if (i8 < i14 && i9 < i14) {
                i14 = i8 + 1;
                i4 = i9 + 1;
                if (ar[i14][i4] == 0) {
                    i8 = i10 + i3;
                    i9 = i11 + i3;
                    if ((iArr[i8][i9] & 19136992) == 0) {
                        i12 = 1;
                        while (i12 < i3) {
                            if ((iArr[i10 + i12][i9] & 19137016) != 0 || (iArr[i8][i11 + i12] & 19136995) != 0) {
                                break;
                            }
                            i12++;
                        }
                        am[i13] = i7 + 1;
                        ak[i13] = i5 + 1;
                        ar[i14][i4] = 12;
                        al[i14][i4] = i18;
                        i13 = (i13 + 1) & ae;
                    }
                }
            }
            i6 = (i6 + 1) & ae;
            i4 = i13;
        }
        di.aj = 872498109 * i7;
        ai = 1542774803 * i5;
        return false;
    }

    static void bx(int i, ag agVar, boolean z, short s) {
        try {
            io.ai((byte) -28).aa(io.ai((byte) -52).bm(i, (byte) 68), new ag(da.jc.ab * -1300496125, ((da.jc.bq * -1444273727) >> 7) + (oz.ff * 2060098323), ((da.jc.bd * -1690563339) >> 7) + (cq.fz * -1866366501)), agVar, z, (byte) 59);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gv.bx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
