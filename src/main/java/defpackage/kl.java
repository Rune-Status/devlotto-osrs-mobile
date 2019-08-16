package defpackage;

/* renamed from: kl */
public final class kl {
    static final int ad = 4096;
    static final int ae = 50;
    static final int ai = 6;
    static final int aj = 1;
    static final int al = 0;
    static km am = new km();
    static final int aq = 16;
    static final int ar = 23;

    kl() throws Throwable {
        throw new Error();
    }

    static byte aa(km kmVar) {
        return (byte) kl.ai(8, kmVar);
    }

    static void ab(km kmVar) {
        int i = 0;
        kmVar.at = 0;
        while (i < 256) {
            if (kmVar.bk[i]) {
                kmVar.bs[kmVar.at * 418566379] = (byte) i;
                kmVar.at -= 1285466173;
            }
            i++;
        }
    }

    static byte ac(km kmVar) {
        return (byte) kl.ai(8, kmVar);
    }

    public static int ad(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        synchronized (am) {
            am.ae = bArr2;
            am.am = -832872681 * i3;
            am.as = bArr;
            am.ag = 0;
            am.ap = -1506179959 * i;
            am.ac = 0;
            am.aw = 0;
            am.ak = 0;
            am.au = 0;
            kl.ar(am);
            i4 = am.ap;
            am.ae = null;
            am.as = null;
        }
        return i - (i4 * -1152831047);
    }

    static void ae(km kmVar) {
        int i = 0;
        kmVar.at = 0;
        while (i < 256) {
            if (kmVar.bk[i]) {
                kmVar.bs[kmVar.at * 418566379] = (byte) i;
                kmVar.at -= 1285466173;
            }
            i++;
        }
    }

    static int af(int i, km kmVar) {
        int i2;
        while (kmVar.ac * -1860935163 < i) {
            kmVar.aw = (((kmVar.aw * 1491916203) << 8) | (kmVar.ae[kmVar.am * 698206375] & 255)) * -287608408;
            kmVar.ac -= 248981912;
            kmVar.am += 1630513192;
            kmVar.ak -= 2019375593;
            i2 = kmVar.ak;
        }
        i2 = kmVar.aw;
        int i3 = kmVar.ac;
        kmVar.ac -= 505748173 * i;
        return ((i2 * 1640064338) >> ((i3 * 1413130407) - i)) & ((1 << i) - 1);
    }

    public static int ag(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        synchronized (am) {
            am.ae = bArr2;
            am.am = -1658981508 * i3;
            am.as = bArr;
            am.ag = 0;
            am.ap = -1506179959 * i;
            am.ac = 0;
            am.aw = 0;
            am.ak = 0;
            am.au = 0;
            kl.ar(am);
            i4 = am.ap;
            am.ae = null;
            am.as = null;
        }
        return i - (i4 * -1152831047);
    }

    static byte ah(km kmVar) {
        return (byte) kl.ai(1, kmVar);
    }

    static int ai(int i, km kmVar) {
        int i2;
        while (kmVar.ac * -1860935163 < i) {
            kmVar.aw = (((kmVar.aw * 1491916203) << 8) | (kmVar.ae[kmVar.am * 698206375] & 255)) * -1011909373;
            kmVar.ac -= 248981912;
            kmVar.am -= 832872681;
            kmVar.ak -= 2019375593;
            i2 = kmVar.ak;
        }
        i2 = kmVar.aw;
        int i3 = kmVar.ac;
        kmVar.ac -= 505748173 * i;
        return ((i2 * 1491916203) >> ((i3 * -1860935163) - i)) & ((1 << i) - 1);
    }

    static byte aj(km kmVar) {
        return (byte) kl.ai(1, kmVar);
    }

    public static int ak(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        synchronized (am) {
            am.ae = bArr2;
            am.am = -832872681 * i3;
            am.as = bArr;
            am.ag = 0;
            am.ap = -1506179959 * i;
            am.ac = 0;
            am.aw = 0;
            am.ak = 0;
            am.au = 0;
            kl.ar(am);
            i4 = am.ap;
            am.ae = null;
            am.as = null;
        }
        return i - (i4 * -1152831047);
    }

    static byte al(km kmVar) {
        return (byte) kl.ai(8, kmVar);
    }

    static void am(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        for (byte b = i; b <= i2; b++) {
            for (i4 = 0; i4 < i3; i4++) {
                if (bArr[i4] == b) {
                    iArr3[i5] = i4;
                    i5++;
                }
            }
        }
        for (i5 = 0; i5 < 23; i5++) {
            iArr2[i5] = 0;
        }
        for (i5 = 0; i5 < i3; i5++) {
            i4 = bArr[i5] + 1;
            iArr2[i4] = iArr2[i4] + 1;
        }
        for (i5 = 1; i5 < 23; i5++) {
            iArr2[i5] = iArr2[i5] + iArr2[i5 - 1];
        }
        for (i5 = 0; i5 < 23; i5++) {
            iArr[i5] = 0;
        }
        i5 = 0;
        i4 = i;
        while (i4 <= i2) {
            int i6 = i4 + 1;
            i5 += iArr2[i6] - iArr2[i4];
            iArr[i4] = i5 - 1;
            i5 <<= 1;
            i4 = i6;
        }
        for (i5 = i + 1; i5 <= i2; i5++) {
            iArr2[i5] = ((iArr[i5 - 1] + 1) << 1) - iArr2[i5];
        }
    }

    static void an(km kmVar) {
        int i = 0;
        kmVar.at = 0;
        while (i < 256) {
            if (kmVar.bk[i]) {
                kmVar.bs[kmVar.at * 57669145] = (byte) i;
                kmVar.at -= 1285466173;
            }
            i++;
        }
    }

    static byte ao(km kmVar) {
        return (byte) kl.ai(8, kmVar);
    }

    public static int ap(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        synchronized (am) {
            am.ae = bArr2;
            am.am = -832872681 * i3;
            am.as = bArr;
            am.ag = 0;
            am.ap = -1506179959 * i;
            am.ac = 0;
            am.aw = 0;
            am.ak = 0;
            am.au = 0;
            kl.ar(am);
            i4 = am.ap;
            am.ae = null;
            am.as = null;
        }
        return i - (i4 * -1152831047);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARNING: Missing block: B:17:0x00a7, code skipped:
            r6 = r5;
            r8 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void aq(km kmVar) {
        int i = 1;
        byte b = kmVar.az;
        int i2 = kmVar.ax * -1893452065;
        int i3 = kmVar.an;
        int i4 = kmVar.af;
        int[] iArr = jb.av;
        int i5 = kmVar.ah;
        byte[] bArr = kmVar.as;
        int i6 = kmVar.ag * 562540317;
        int i7 = kmVar.ap * -1152831047;
        int i8 = (kmVar.bv * 168566869) + 1;
        int i9 = i5 * 1272015279;
        int i10 = i3 * 86629643;
        i5 = i7;
        byte b2 = i4 * -37533507;
        loop0:
        while (true) {
            byte b3;
            if (i2 <= 0) {
                i2 = i10;
                b3 = b2;
                while (i2 != i8) {
                }
                i = 0;
                i10 = i2;
                b2 = b3;
                break loop0;
            }
            i3 = i6;
            i4 = i5;
            while (i4 != 0) {
                if (i2 == 1) {
                    if (i4 != 0) {
                        bArr[i3] = b;
                        i6 = i3 + 1;
                        i5 = i4 - 1;
                        i2 = i10;
                        b3 = b2;
                        while (i2 != i8) {
                            b = (byte) b3;
                            i10 = iArr[i9];
                            byte b4 = (byte) i10;
                            i9 = i10 >> 8;
                            i2++;
                            byte b5;
                            if (b4 != b3) {
                                if (i5 == 0) {
                                    break loop0;
                                }
                                bArr[i6] = b;
                                i5--;
                                i6++;
                                b5 = b4;
                                b3 = b5;
                            } else if (i2 != i8) {
                                i10 = iArr[i9];
                                b4 = (byte) i10;
                                i9 = i10 >> 8;
                                i10 = i2 + 1;
                                if (i10 != i8) {
                                    if (b4 != b3) {
                                        b3 = b4;
                                    } else {
                                        i2 = iArr[i9];
                                        b4 = (byte) i2;
                                        i9 = i2 >> 8;
                                        i10++;
                                        if (i10 != i8) {
                                            if (b4 != b3) {
                                                b3 = b4;
                                            } else {
                                                i3 = iArr[i9];
                                                byte b6 = (byte) i3;
                                                i3 = iArr[i3 >> 8];
                                                i10 = (i10 + 1) + 1;
                                                i9 = i3 >> 8;
                                                i2 = (b6 & 255) + 4;
                                                b2 = (byte) i3;
                                            }
                                        }
                                        i2 = 3;
                                        b2 = b3;
                                    }
                                }
                                i2 = 2;
                                b2 = b3;
                            } else if (i5 == 0) {
                                b4 = b3;
                                break loop0;
                            } else {
                                bArr[i6] = b;
                                i5--;
                                i6++;
                                b5 = b3;
                                b3 = b5;
                            }
                        }
                        i = 0;
                        i10 = i2;
                        b2 = b3;
                        break loop0;
                    }
                    i6 = i3;
                    i5 = i4;
                    break;
                }
                bArr[i3] = b;
                i2--;
                i3++;
                i4--;
            }
            i6 = i3;
            i5 = i4;
            i = i2;
            break loop0;
        }
        i3 = kmVar.au;
        kmVar.au += (i7 - i5) * -1070649651;
        i3 = kmVar.au;
        kmVar.az = b;
        kmVar.ax = 1926563103 * i;
        kmVar.an = 666764963 * i10;
        kmVar.af = -668667243 * r8;
        jb.av = iArr;
        kmVar.ah = 1766165839 * i9;
        kmVar.as = bArr;
        kmVar.ag = -1847293131 * i6;
        kmVar.ap = -1506179959 * i5;
    }

    static void ar(km kmVar) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    public static int as(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        synchronized (am) {
            am.ae = bArr2;
            am.am = -832872681 * i3;
            am.as = bArr;
            am.ag = 0;
            am.ap = -1728625749 * i;
            am.ac = 0;
            am.aw = 0;
            am.ak = 0;
            am.au = 0;
            kl.ar(am);
            i4 = am.ap;
            am.ae = null;
            am.as = null;
        }
        return i - (i4 * -1152831047);
    }

    static void at(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        for (byte b = i; b <= i2; b++) {
            for (i4 = 0; i4 < i3; i4++) {
                if (bArr[i4] == b) {
                    iArr3[i5] = i4;
                    i5++;
                }
            }
        }
        for (i5 = 0; i5 < 23; i5++) {
            iArr2[i5] = 0;
        }
        for (i5 = 0; i5 < i3; i5++) {
            i4 = bArr[i5] + 1;
            iArr2[i4] = iArr2[i4] + 1;
        }
        for (i5 = 1; i5 < 23; i5++) {
            iArr2[i5] = iArr2[i5] + iArr2[i5 - 1];
        }
        for (i5 = 0; i5 < 23; i5++) {
            iArr[i5] = 0;
        }
        i5 = 0;
        i4 = i;
        while (i4 <= i2) {
            int i6 = i4 + 1;
            i5 += iArr2[i6] - iArr2[i4];
            iArr[i4] = i5 - 1;
            i5 <<= 1;
            i4 = i6;
        }
        for (i5 = i + 1; i5 <= i2; i5++) {
            iArr2[i5] = ((iArr[i5 - 1] + 1) << 1) - iArr2[i5];
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARNING: Missing block: B:17:0x00a5, code skipped:
            r4 = 1;
            r8 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void au(km kmVar) {
        byte b = kmVar.az;
        int i = kmVar.ax * -1893452065;
        int i2 = kmVar.an;
        int i3 = kmVar.af;
        int[] iArr = jb.av;
        int i4 = kmVar.ah;
        byte[] bArr = kmVar.as;
        int i5 = kmVar.ag * 562540317;
        int i6 = kmVar.ap * -994423862;
        int i7 = (kmVar.bv * 168566869) + 1;
        int i8 = i4 * -1641861596;
        int i9 = i2 * -711870042;
        i4 = i6;
        byte b2 = i3 * -37533507;
        loop0:
        while (true) {
            byte b3;
            if (i <= 0) {
                b3 = b2;
                while (i9 != i7) {
                }
                i = 0;
                b2 = b3;
                break loop0;
            }
            i2 = i5;
            i3 = i4;
            while (i3 != 0) {
                if (i == 1) {
                    if (i3 != 0) {
                        bArr[i2] = b;
                        i5 = i2 + 1;
                        i4 = i3 - 1;
                        b3 = b2;
                        while (i9 != i7) {
                            b = (byte) b3;
                            i = iArr[i8];
                            byte b4 = (byte) i;
                            i8 = i >> 8;
                            i9++;
                            byte b5;
                            if (b4 != b3) {
                                if (i4 == 0) {
                                    break loop0;
                                }
                                bArr[i5] = b;
                                i4--;
                                i5++;
                                b5 = b4;
                                b3 = b5;
                            } else if (i9 != i7) {
                                i = iArr[i8];
                                b4 = (byte) i;
                                i8 = i >> 8;
                                i9++;
                                if (i9 != i7) {
                                    if (b4 != b3) {
                                        b3 = b4;
                                    } else {
                                        i = iArr[i8];
                                        b4 = (byte) i;
                                        i8 = i >> 8;
                                        i9++;
                                        if (i9 != i7) {
                                            if (b4 != b3) {
                                                b3 = b4;
                                            } else {
                                                i2 = iArr[i8];
                                                b5 = (byte) i2;
                                                i2 = iArr[i2 >> 8];
                                                i9 = (i9 + 1) + 1;
                                                i8 = i2 >> 8;
                                                i = (b5 & 255) + 4;
                                                b2 = (byte) i2;
                                            }
                                        }
                                        i = 3;
                                        b2 = b3;
                                    }
                                }
                                i = 2;
                                b2 = b3;
                            } else if (i4 == 0) {
                                b4 = b3;
                                break loop0;
                            } else {
                                bArr[i5] = b;
                                i4--;
                                i5++;
                                b5 = b3;
                                b3 = b5;
                            }
                        }
                        i = 0;
                        b2 = b3;
                        break loop0;
                    }
                    i5 = i2;
                    i4 = i3;
                    i = 1;
                    break;
                }
                bArr[i2] = b;
                i--;
                i2++;
                i3--;
            }
            i5 = i2;
            i4 = i3;
            break loop0;
        }
        i2 = kmVar.au;
        kmVar.au += (i6 - i4) * -822589094;
        i2 = kmVar.au;
        kmVar.az = b;
        kmVar.ax = -1609833308 * i;
        kmVar.an = 666764963 * i9;
        kmVar.af = -668667243 * r8;
        jb.av = iArr;
        kmVar.ah = 217714276 * i8;
        kmVar.as = bArr;
        kmVar.ag = -934341500 * i5;
        kmVar.ap = -1506179959 * i4;
    }

    static void av(km kmVar) {
        int i = 0;
        kmVar.at = 0;
        while (i < 256) {
            if (kmVar.bk[i]) {
                kmVar.bs[kmVar.at * 1709255587] = (byte) i;
                kmVar.at -= 862662711;
            }
            i++;
        }
    }

    static void aw(km kmVar) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARNING: Missing block: B:17:0x00a7, code skipped:
            r6 = r5;
            r8 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void ax(km kmVar) {
        int i = 1;
        byte b = kmVar.az;
        int i2 = kmVar.ax * -1893452065;
        int i3 = kmVar.an;
        int i4 = kmVar.af;
        int[] iArr = jb.av;
        int i5 = kmVar.ah;
        byte[] bArr = kmVar.as;
        int i6 = kmVar.ag * -523608887;
        int i7 = kmVar.ap * -1152831047;
        int i8 = (kmVar.bv * 168566869) + 1;
        int i9 = i5 * 1272015279;
        int i10 = i3 * -118868162;
        i5 = i7;
        byte b2 = i4 * -1336726033;
        loop0:
        while (true) {
            byte b3;
            if (i2 <= 0) {
                i2 = i10;
                b3 = b2;
                while (i2 != i8) {
                }
                i = 0;
                i10 = i2;
                b2 = b3;
                break loop0;
            }
            i3 = i6;
            i4 = i5;
            while (i4 != 0) {
                if (i2 == 1) {
                    if (i4 != 0) {
                        bArr[i3] = b;
                        i6 = i3 + 1;
                        i5 = i4 - 1;
                        i2 = i10;
                        b3 = b2;
                        while (i2 != i8) {
                            b = (byte) b3;
                            i10 = iArr[i9];
                            byte b4 = (byte) i10;
                            i9 = i10 >> 8;
                            i2++;
                            byte b5;
                            if (b4 != b3) {
                                if (i5 == 0) {
                                    break loop0;
                                }
                                bArr[i6] = b;
                                i5--;
                                i6++;
                                b5 = b4;
                                b3 = b5;
                            } else if (i2 != i8) {
                                i10 = iArr[i9];
                                b4 = (byte) i10;
                                i9 = i10 >> 8;
                                i10 = i2 + 1;
                                if (i10 != i8) {
                                    if (b4 != b3) {
                                        b3 = b4;
                                    } else {
                                        i2 = iArr[i9];
                                        b4 = (byte) i2;
                                        i9 = i2 >> 8;
                                        i10++;
                                        if (i10 != i8) {
                                            if (b4 != b3) {
                                                b3 = b4;
                                            } else {
                                                i3 = iArr[i9];
                                                byte b6 = (byte) i3;
                                                i3 = iArr[i3 >> 8];
                                                i10 = (i10 + 1) + 1;
                                                i9 = i3 >> 8;
                                                i2 = (b6 & 255) + 4;
                                                b2 = (byte) i3;
                                            }
                                        }
                                        i2 = 3;
                                        b2 = b3;
                                    }
                                }
                                i2 = 2;
                                b2 = b3;
                            } else if (i5 == 0) {
                                b4 = b3;
                                break loop0;
                            } else {
                                bArr[i6] = b;
                                i5--;
                                i6++;
                                b5 = b3;
                                b3 = b5;
                            }
                        }
                        i = 0;
                        i10 = i2;
                        b2 = b3;
                        break loop0;
                    }
                    i6 = i3;
                    i5 = i4;
                    break;
                }
                bArr[i3] = b;
                i2--;
                i3++;
                i4--;
            }
            i6 = i3;
            i5 = i4;
            i = i2;
            break loop0;
        }
        i3 = kmVar.au;
        kmVar.au += (i7 - i5) * 2105134717;
        i3 = kmVar.au;
        kmVar.az = b;
        kmVar.ax = 1926563103 * i;
        kmVar.an = 666764963 * i10;
        kmVar.af = -668667243 * r8;
        jb.av = iArr;
        kmVar.ah = 1766165839 * i9;
        kmVar.as = bArr;
        kmVar.ag = -1594301328 * i6;
        kmVar.ap = -1163076661 * i5;
    }

    static int ay(int i, km kmVar) {
        int i2;
        while (kmVar.ac * -1860935163 < i) {
            kmVar.aw = (((kmVar.aw * 1491916203) << 8) | (kmVar.ae[kmVar.am * 698206375] & 255)) * -1011909373;
            kmVar.ac -= 248981912;
            kmVar.am -= 832872681;
            kmVar.ak -= 2019375593;
            i2 = kmVar.ak;
        }
        i2 = kmVar.aw;
        int i3 = kmVar.ac;
        kmVar.ac -= 505748173 * i;
        return ((i2 * 1491916203) >> ((i3 * -1860935163) - i)) & ((1 << i) - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARNING: Missing block: B:17:0x00a5, code skipped:
            r4 = 1;
            r8 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void az(km kmVar) {
        byte b = kmVar.az;
        int i = kmVar.ax * -1893452065;
        int i2 = kmVar.an;
        int i3 = kmVar.af;
        int[] iArr = jb.av;
        int i4 = kmVar.ah;
        byte[] bArr = kmVar.as;
        int i5 = kmVar.ag * 562540317;
        int i6 = kmVar.ap * -1152831047;
        int i7 = (kmVar.bv * 168566869) + 1;
        int i8 = i4 * 1272015279;
        int i9 = i2 * 86629643;
        i4 = i6;
        byte b2 = i3 * -37533507;
        loop0:
        while (true) {
            byte b3;
            if (i <= 0) {
                b3 = b2;
                while (i9 != i7) {
                }
                i = 0;
                b2 = b3;
                break loop0;
            }
            i2 = i5;
            i3 = i4;
            while (i3 != 0) {
                if (i == 1) {
                    if (i3 != 0) {
                        bArr[i2] = b;
                        i5 = i2 + 1;
                        i4 = i3 - 1;
                        b3 = b2;
                        while (i9 != i7) {
                            b = (byte) b3;
                            i = iArr[i8];
                            byte b4 = (byte) i;
                            i8 = i >> 8;
                            i9++;
                            byte b5;
                            if (b4 != b3) {
                                if (i4 == 0) {
                                    break loop0;
                                }
                                bArr[i5] = b;
                                i4--;
                                i5++;
                                b5 = b4;
                                b3 = b5;
                            } else if (i9 != i7) {
                                i = iArr[i8];
                                b4 = (byte) i;
                                i8 = i >> 8;
                                i9++;
                                if (i9 != i7) {
                                    if (b4 != b3) {
                                        b3 = b4;
                                    } else {
                                        i = iArr[i8];
                                        b4 = (byte) i;
                                        i8 = i >> 8;
                                        i9++;
                                        if (i9 != i7) {
                                            if (b4 != b3) {
                                                b3 = b4;
                                            } else {
                                                i2 = iArr[i8];
                                                b5 = (byte) i2;
                                                i2 = iArr[i2 >> 8];
                                                i9 = (i9 + 1) + 1;
                                                i8 = i2 >> 8;
                                                i = (b5 & 255) + 4;
                                                b2 = (byte) i2;
                                            }
                                        }
                                        i = 3;
                                        b2 = b3;
                                    }
                                }
                                i = 2;
                                b2 = b3;
                            } else if (i4 == 0) {
                                b4 = b3;
                                break loop0;
                            } else {
                                bArr[i5] = b;
                                i4--;
                                i5++;
                                b5 = b3;
                                b3 = b5;
                            }
                        }
                        i = 0;
                        b2 = b3;
                        break loop0;
                    }
                    i5 = i2;
                    i4 = i3;
                    i = 1;
                    break;
                }
                bArr[i2] = b;
                i--;
                i2++;
                i3--;
            }
            i5 = i2;
            i4 = i3;
            break loop0;
        }
        i2 = kmVar.au;
        kmVar.au += (i6 - i4) * -1070649651;
        i2 = kmVar.au;
        kmVar.az = b;
        kmVar.ax = 1926563103 * i;
        kmVar.an = 666764963 * i9;
        kmVar.af = -668667243 * r8;
        jb.av = iArr;
        kmVar.ah = 1766165839 * i8;
        kmVar.as = bArr;
        kmVar.ag = -1847293131 * i5;
        kmVar.ap = -1506179959 * i4;
    }
}
