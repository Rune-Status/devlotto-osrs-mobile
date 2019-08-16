package defpackage;

/* renamed from: kt */
public class kt extends eo {
    public static final int bc = 39;
    static final int ei = 15;
    static int go;
    final boolean aq;

    public kt(boolean z) {
        try {
            this.aq = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kt.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ao(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i3 >> 2);
        int i9 = -(i3 & 3);
        int i10 = i2;
        int i11 = i;
        for (int i12 = -i4; i12 < 0; i12++) {
            int i13;
            int i14;
            byte b;
            int i15 = i8;
            while (i15 < 0) {
                i13 = i11 + 1;
                byte b2 = bArr[i11];
                if (b2 != (byte) 0) {
                    i14 = i10 + 1;
                    iArr[i10] = iArr2[b2 & 255];
                } else {
                    i14 = i10 + 1;
                }
                i11 = i13 + 1;
                b = bArr[i13];
                if (b != (byte) 0) {
                    i13 = i14 + 1;
                    iArr[i14] = iArr2[b & 255];
                    i14 = i13;
                } else {
                    i14++;
                }
                i10 = i11 + 1;
                b2 = bArr[i11];
                if (b2 != (byte) 0) {
                    i13 = i14 + 1;
                    iArr[i14] = iArr2[b2 & 255];
                    i14 = i13;
                } else {
                    i14++;
                }
                i11 = i10 + 1;
                byte b3 = bArr[i10];
                if (b3 != (byte) 0) {
                    iArr[i14] = iArr2[b3 & 255];
                }
                i15++;
                i10 = i14 + 1;
            }
            i13 = i9;
            i14 = i10;
            while (i13 < 0) {
                b = bArr[i11];
                if (b != (byte) 0) {
                    iArr[i14] = iArr2[b & 255];
                }
                i14++;
                i13++;
                i11++;
            }
            i10 = i14 + i5;
            i11 += i6;
        }
    }

    public int ag(Object obj, Object obj2) {
        return ap((er) obj, (er) obj2, (byte) 0);
    }

    /* Access modifiers changed, original: 0000 */
    public int ap(er erVar, er erVar2, byte b) {
        try {
            if (client.ar * -2059975617 == erVar.aj * -356714521) {
                if (erVar2.aj * -356714521 != client.ar * -2059975617) {
                    return this.aq ? -1 : 1;
                }
            } else if (client.ar * -2059975617 == erVar2.aj * -356714521) {
                return this.aq ? 1 : -1;
            }
            return aq(erVar, erVar2, 397848658);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kt.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int au(er erVar, er erVar2) {
        if (client.ar * -132826472 == erVar.aj * -356714521) {
            if (erVar2.aj * -356714521 != client.ar * -2059975617) {
                return this.aq ? -1 : 1;
            }
        } else if (client.ar * -836218963 == erVar2.aj * -356714521) {
            return !this.aq ? -1 : 1;
        }
        return aq(erVar, erVar2, -795912623);
    }

    /* Access modifiers changed, original: 0000 */
    public int az(er erVar, er erVar2) {
        if (client.ar * -1582883526 == erVar.aj * -1399746738) {
            if (erVar2.aj * -356714521 != client.ar * -123929965) {
                return this.aq ? -1 : 1;
            }
        } else if (client.ar * -1552987112 == erVar2.aj * -356714521) {
            return !this.aq ? -1 : 1;
        }
        return aq(erVar, erVar2, 791874956);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ap((er) obj, (er) obj2, (byte) 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kt.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
