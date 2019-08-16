package defpackage;

/* renamed from: kj */
public class kj extends mb {
    int ad;
    byte[] ae;
    ke[] ai;
    byte[] aj;
    byte[] al;
    int[] am;
    ht[] aq;
    short[] ar;

    kj(byte[] bArr) {
        try {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            ke keVar;
            int i6;
            ke keVar2;
            byte b;
            byte b2;
            ke keVar3;
            this.aq = new ht[128];
            this.ar = new short[128];
            this.al = new byte[128];
            this.aj = new byte[128];
            this.ai = new ke[128];
            this.ae = new byte[128];
            this.am = new int[128];
            lj ljVar = new lj(bArr);
            int i7 = 0;
            while (ljVar.ar[(ljVar.al * -1631454091) + i7] != (byte) 0) {
                i7++;
            }
            byte[] bArr2 = new byte[i7];
            for (i = 0; i < i7; i++) {
                bArr2[i] = ljVar.ay(1786621367);
            }
            ljVar.al -= 879823907;
            int i8 = ljVar.al * -1631454091;
            ljVar.al += (i7 + 1) * -879823907;
            i7 = 0;
            while (ljVar.ar[(ljVar.al * -1631454091) + i7] != (byte) 0) {
                i7++;
            }
            byte[] bArr3 = new byte[i7];
            for (i = 0; i < i7; i++) {
                bArr3[i] = ljVar.ay(1221173997);
            }
            ljVar.al -= 879823907;
            int i9 = ljVar.al * -1631454091;
            ljVar.al += (i7 + 1) * -879823907;
            i7 = 0;
            while (ljVar.ar[(ljVar.al * -1631454091) + i7] != (byte) 0) {
                i7++;
            }
            byte[] bArr4 = new byte[i7];
            for (i = 0; i < i7; i++) {
                bArr4[i] = ljVar.ay(-898085381);
            }
            ljVar.al -= 879823907;
            int i10 = i7 + 1;
            byte[] bArr5 = new byte[i10];
            if (i10 > 1) {
                bArr5[1] = (byte) 1;
                i2 = 1;
                i3 = 2;
                i4 = 2;
                while (i4 < i10) {
                    i = ljVar.af(1804771424);
                    if (i == 0) {
                        i7 = i3 + 1;
                        i2 = i3;
                    } else {
                        if (i <= i2) {
                            i--;
                        }
                        i7 = i3;
                        i2 = i;
                    }
                    bArr5[i4] = (byte) i2;
                    i4++;
                    i3 = i7;
                }
                i5 = i3;
            } else {
                i5 = i10;
            }
            ke[] keVarArr = new ke[i5];
            for (i = 0; i < keVarArr.length; i++) {
                keVar = new ke();
                keVarArr[i] = keVar;
                i3 = ljVar.af(1804771424);
                if (i3 > 0) {
                    keVar.ad = new byte[(i3 * 2)];
                }
                i3 = ljVar.af(1804771424);
                if (i3 > 0) {
                    keVar.aq = new byte[((i3 * 2) + 2)];
                    keVar.aq[1] = (byte) 64;
                }
            }
            i = ljVar.af(1804771424);
            byte[] bArr6 = i > 0 ? new byte[(i * 2)] : null;
            i = ljVar.af(1804771424);
            byte[] bArr7 = i > 0 ? new byte[(i * 2)] : null;
            i3 = 0;
            while (ljVar.ar[(ljVar.al * -1631454091) + i3] != (byte) 0) {
                i3++;
            }
            byte[] bArr8 = new byte[i3];
            for (i7 = 0; i7 < i3; i7++) {
                bArr8[i7] = ljVar.ay(-1958611656);
            }
            ljVar.al -= 879823907;
            i7 = 0;
            for (i3 = 0; i3 < 128; i3++) {
                i7 += ljVar.af(1804771424);
                this.ar[i3] = (short) i7;
            }
            i7 = 0;
            for (i3 = 0; i3 < 128; i3++) {
                i7 += ljVar.af(1804771424);
                short[] sArr = this.ar;
                sArr[i3] = (short) (sArr[i3] + (i7 << 8));
            }
            i7 = 0;
            i2 = 0;
            i3 = 0;
            for (i10 = 0; i10 < 128; i10++) {
                if (i7 == 0) {
                    if (i2 < bArr8.length) {
                        i7 = bArr8[i2];
                        i2++;
                    } else {
                        i7 = -1;
                    }
                    i3 = ljVar.bc(-2034341338);
                }
                short[] sArr2 = this.ar;
                sArr2[i10] = (short) (sArr2[i10] + (((i3 - 1) & 2) << 14));
                this.am[i10] = i3;
                i7--;
            }
            i3 = 0;
            i10 = 0;
            i7 = 0;
            i2 = i8;
            for (i6 = 0; i6 < 128; i6++) {
                if (this.am[i6] != 0) {
                    if (i3 == 0) {
                        if (i10 < bArr2.length) {
                            i3 = bArr2[i10];
                            i10++;
                        } else {
                            i3 = -1;
                        }
                        i7 = ljVar.ar[i2] - 1;
                        i2++;
                    }
                    this.ae[i6] = (byte) i7;
                    i3--;
                }
            }
            i3 = 0;
            i10 = 0;
            i7 = 0;
            i2 = i9;
            for (i6 = 0; i6 < 128; i6++) {
                if (this.am[i6] != 0) {
                    if (i3 == 0) {
                        if (i10 < bArr3.length) {
                            i3 = bArr3[i10];
                            i10++;
                        } else {
                            i3 = -1;
                        }
                        i7 = (ljVar.ar[i2] + 16) << 2;
                        i2++;
                    }
                    this.aj[i6] = (byte) i7;
                    i3--;
                }
            }
            i7 = 0;
            i3 = 0;
            ke keVar4 = null;
            for (i10 = 0; i10 < 128; i10++) {
                if (this.am[i10] != 0) {
                    if (i7 == 0) {
                        keVar4 = keVarArr[bArr5[i3]];
                        if (i3 < bArr4.length) {
                            i7 = bArr4[i3];
                            i3++;
                        } else {
                            i7 = -1;
                        }
                    }
                    this.ai[i10] = keVar4;
                    i7--;
                }
            }
            i7 = 0;
            i3 = 0;
            i2 = 0;
            for (i10 = 0; i10 < 128; i10++) {
                if (i7 == 0) {
                    if (i3 < bArr8.length) {
                        i7 = bArr8[i3];
                        i3++;
                    } else {
                        i7 = -1;
                    }
                    if (this.am[i10] > 0) {
                        i2 = ljVar.af(1804771424) + 1;
                    }
                }
                this.al[i10] = (byte) i2;
                i7--;
            }
            this.ad = (ljVar.af(1804771424) + 1) * 1622034879;
            for (i3 = 0; i3 < i5; i3++) {
                keVar4 = keVarArr[i3];
                if (keVar4.ad != null) {
                    for (i7 = 1; i7 < keVar4.ad.length; i7 += 2) {
                        keVar4.ad[i7] = ljVar.ay(-104361500);
                    }
                }
                if (keVar4.aq != null) {
                    for (i7 = 3; i7 < keVar4.aq.length - 2; i7 += 2) {
                        keVar4.aq[i7] = ljVar.ay(63354396);
                    }
                }
            }
            if (bArr6 != null) {
                for (i7 = 1; i7 < bArr6.length; i7 += 2) {
                    bArr6[i7] = ljVar.ay(1091442642);
                }
            }
            if (bArr7 != null) {
                for (i7 = 1; i7 < bArr7.length; i7 += 2) {
                    bArr7[i7] = ljVar.ay(-1721198330);
                }
            }
            for (i2 = 0; i2 < i5; i2++) {
                keVar2 = keVarArr[i2];
                if (keVar2.aq != null) {
                    i7 = 0;
                    for (i3 = 2; i3 < keVar2.aq.length; i3 += 2) {
                        i7 = (i7 + 1) + ljVar.af(1804771424);
                        keVar2.aq[i3] = (byte) i7;
                    }
                }
            }
            for (i2 = 0; i2 < i5; i2++) {
                keVar2 = keVarArr[i2];
                if (keVar2.ad != null) {
                    i7 = 0;
                    for (i3 = 2; i3 < keVar2.ad.length; i3 += 2) {
                        i7 = (i7 + 1) + ljVar.af(1804771424);
                        keVar2.ad[i3] = (byte) i7;
                    }
                }
            }
            if (bArr6 != null) {
                i7 = ljVar.af(1804771424);
                bArr6[0] = (byte) i7;
                for (i3 = 2; i3 < bArr6.length; i3 += 2) {
                    i7 = (i7 + 1) + ljVar.af(1804771424);
                    bArr6[i3] = (byte) i7;
                }
                i10 = bArr6[0];
                i7 = bArr6[1];
                for (i3 = 0; i3 < i10; i3++) {
                    this.al[i3] = (byte) (((this.al[i3] * i7) + 32) >> 6);
                }
                i2 = 2;
                while (i2 < bArr6.length) {
                    byte b3 = bArr6[i2];
                    byte b4 = bArr6[i2 + 1];
                    i8 = b3 - i10;
                    i6 = (i7 * i8) + (i8 / 2);
                    b = i10;
                    while (b < b3) {
                        this.al[b] = (byte) (((ds.ai(i6, i8, 709129606) * this.al[b]) + 32) >> 6);
                        b++;
                        i6 = (b4 - i7) + i6;
                    }
                    i2 += 2;
                    b2 = b4;
                    byte b5 = b3;
                }
                while (i10 < 128) {
                    this.al[i10] = (byte) (((this.al[i10] * i7) + 32) >> 6);
                    i10++;
                }
            }
            if (bArr7 != null) {
                i7 = ljVar.af(1804771424);
                bArr7[0] = (byte) i7;
                for (i3 = 2; i3 < bArr7.length; i3 += 2) {
                    i7 = (i7 + 1) + ljVar.af(1804771424);
                    bArr7[i3] = (byte) i7;
                }
                i7 = bArr7[0];
                i2 = bArr7[1] << 1;
                for (i10 = 0; i10 < i7; i10++) {
                    i3 = (this.aj[i10] & 255) + i2;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i3 > 128) {
                        i3 = 128;
                    }
                    this.aj[i10] = (byte) i3;
                }
                i10 = 2;
                i4 = i2;
                while (i10 < bArr7.length) {
                    b = bArr7[i10];
                    i6 = bArr7[i10 + 1] << 1;
                    i8 = b - i7;
                    i3 = (i4 * i8) + (i8 / 2);
                    byte b6 = i7;
                    while (b6 < b) {
                        i7 = ds.ai(i3, i8, -1584701088) + (this.aj[b6] & 255);
                        if (i7 < 0) {
                            i7 = 0;
                        }
                        if (i7 > 128) {
                            i7 = 128;
                        }
                        this.aj[b6] = (byte) i7;
                        b6++;
                        i3 = (i6 - i4) + i3;
                    }
                    i10 += 2;
                    i4 = i6;
                    b2 = b;
                }
                while (i7 < 128) {
                    i = (this.aj[i7] & 255) + i4;
                    if (i < 0) {
                        i = 0;
                    }
                    if (i > 128) {
                        i = 128;
                    }
                    this.aj[i7] = (byte) i;
                    i7++;
                }
            }
            for (i7 = 0; i7 < i5; i7++) {
                keVarArr[i7].ar = ljVar.af(1804771424) * -1966862625;
            }
            for (i7 = 0; i7 < i5; i7++) {
                keVar3 = keVarArr[i7];
                if (keVar3.ad != null) {
                    keVar3.al = ljVar.af(1804771424) * 887769349;
                }
                if (keVar3.aq != null) {
                    keVar3.aj = ljVar.af(1804771424) * 799434867;
                }
                if (keVar3.ar * -1174721249 > 0) {
                    keVar3.ai = ljVar.af(1804771424) * -1806680247;
                }
            }
            for (i7 = 0; i7 < i5; i7++) {
                keVarArr[i7].am = ljVar.af(1804771424) * -1330918623;
            }
            for (i7 = 0; i7 < i5; i7++) {
                keVar3 = keVarArr[i7];
                if (keVar3.am * -345278239 > 0) {
                    keVar3.ae = ljVar.af(1804771424) * -68129953;
                }
            }
            for (i = 0; i < i5; i++) {
                keVar = keVarArr[i];
                if (keVar.ae * 1839509663 > 0) {
                    keVar.ak = ljVar.af(1804771424) * 1926434693;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kj.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ac(int i) {
        try {
            oz.ak(go.hr, -769293814);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kj.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static kj aj(kh khVar, int i) {
        byte[] as = khVar.as(i, (byte) 0);
        return as == null ? null : new kj(as);
    }

    static kj al(kh khVar, int i) {
        byte[] as = khVar.as(i, (byte) 0);
        return as == null ? null : new kj(as);
    }

    static void dm(int i) {
        try {
            if (((da.jc.bq * -1444273727) >> 7) == client.os * -1798825039 && client.ow * -1416880445 == ((da.jc.bd * -1690563339) >> 7)) {
                client.os = 0;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kj.dm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void gg(int i) {
        try {
            mb ar = client.kd.ar();
            while (true) {
                is isVar = (is) ar;
                if (isVar != null) {
                    int i2 = isVar.ad * 1810639839;
                    if (cs.al(i2, -2070139937)) {
                        boolean z;
                        al[] alVarArr = dt.ae[i2];
                        for (i2 = 0; i2 < alVarArr.length; i2++) {
                            if (alVarArr[i2] != null) {
                                z = alVarArr[i2].aa;
                                break;
                            }
                        }
                        z = true;
                        if (!z) {
                            al aq = da.aq((int) isVar.gs, -550158556);
                            if (aq != null) {
                                da.gk(aq, (byte) 2);
                            }
                        }
                    }
                    ar = client.kd.al();
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kj.gg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ae(gq gqVar, byte[] bArr, int[] iArr) {
        ht htVar = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < 128) {
            if (bArr == null || bArr[i] != (byte) 0) {
                int i3 = this.am[i];
                if (i3 != 0) {
                    if (i3 != i2) {
                        int i4 = i3 - 1;
                        htVar = (i4 & 1) == 0 ? gqVar.ar(i4 >> 2, iArr, -1774301677) : gqVar.al(i4 >> 2, iArr, (byte) 1);
                        if (htVar == null) {
                            z = false;
                            i2 = i3;
                        } else {
                            i2 = i3;
                        }
                    }
                    if (htVar != null) {
                        this.aq[i] = htVar;
                        this.am[i] = 0;
                    }
                }
            }
            i++;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public void ag() {
        this.am = null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ai(gq gqVar, byte[] bArr, int[] iArr) {
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ak(gq gqVar, byte[] bArr, int[] iArr) {
        ht htVar = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < 128) {
            if (bArr == null || bArr[i] != (byte) 0) {
                int i3 = this.am[i];
                if (i3 != 0) {
                    if (i3 != i2) {
                        int i4 = i3 - 1;
                        htVar = (i4 & 1) == 0 ? gqVar.ar(i4 >> 2, iArr, -2037208279) : gqVar.al(i4 >> 2, iArr, (byte) 1);
                        if (htVar == null) {
                            z = false;
                            i2 = i3;
                        } else {
                            i2 = i3;
                        }
                    }
                    if (htVar != null) {
                        this.aq[i] = htVar;
                        this.am[i] = 0;
                    }
                }
            }
            i++;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean am(gq gqVar, byte[] bArr, int[] iArr) {
        ht htVar = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < 128) {
            if (bArr == null || bArr[i] != (byte) 0) {
                int i3 = this.am[i];
                if (i3 != 0) {
                    if (i3 != i2) {
                        int i4 = i3 - 1;
                        htVar = (i4 & 1) == 0 ? gqVar.ar(i4 >> 2, iArr, -2061472942) : gqVar.al(i4 >> 2, iArr, (byte) 1);
                        if (htVar == null) {
                            z = false;
                            i2 = i3;
                        } else {
                            i2 = i3;
                        }
                    }
                    if (htVar != null) {
                        this.aq[i] = htVar;
                        this.am[i] = 0;
                    }
                }
            }
            i++;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap() {
        this.am = null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean aq(gq gqVar, byte[] bArr, int[] iArr, byte b) {
        boolean z = true;
        ht htVar = null;
        int i = 0;
        int i2 = 0;
        while (i < 128) {
            if (bArr == null || bArr[i] != (byte) 0) {
                try {
                    int i3 = this.am[i];
                    if (i3 != 0) {
                        if (i3 != i2) {
                            int i4 = i3 - 1;
                            htVar = (i4 & 1) == 0 ? gqVar.ar(i4 >> 2, iArr, -2139936696) : gqVar.al(i4 >> 2, iArr, (byte) 1);
                            if (htVar == null) {
                                z = false;
                                i2 = i3;
                            } else {
                                i2 = i3;
                            }
                        }
                        if (htVar != null) {
                            this.aq[i] = htVar;
                            this.am[i] = 0;
                        }
                    }
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("kj.aq(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            i++;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i) {
        try {
            this.am = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kj.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as() {
        this.am = null;
    }
}
