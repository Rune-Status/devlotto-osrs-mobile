package defpackage;

/* renamed from: kb */
public class kb {
    static final int an = 30;
    static final int ap = 7;
    public static final int ch = 105;
    static final int ev = 16777215;
    int[] ad;
    byte[] aq;
    int[] ar;

    public kb(byte[] bArr) {
        try {
            int length = bArr.length;
            this.ad = new int[length];
            this.aq = bArr;
            int[] iArr = new int[33];
            this.ar = new int[8];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                byte b = bArr[i2];
                if (b != (byte) 0) {
                    int i3;
                    int i4 = 1 << (32 - b);
                    int i5 = iArr[b];
                    this.ad[i2] = i5;
                    if ((i5 & i4) == 0) {
                        i4 |= i5;
                        i3 = b - 1;
                        while (i3 >= 1) {
                            int i6 = iArr[i3];
                            if (i6 != i5) {
                                break;
                            }
                            int i7 = 1 << (32 - i3);
                            if ((i6 & i7) != 0) {
                                iArr[i3] = iArr[i3 - 1];
                                break;
                            } else {
                                iArr[i3] = i6 | i7;
                                i3--;
                            }
                        }
                    } else {
                        i4 = iArr[b - 1];
                    }
                    iArr[b] = i4;
                    for (i3 = b + 1; i3 <= 32; i3++) {
                        if (iArr[i3] == i5) {
                            iArr[i3] = i4;
                        }
                    }
                    i3 = 0;
                    for (byte b2 = (byte) 0; b2 < b; b2++) {
                        if (((Integer.MIN_VALUE >>> b2) & i5) != 0) {
                            if (this.ar[i3] == 0) {
                                this.ar[i3] = i;
                            }
                            i3 = this.ar[i3];
                        } else {
                            i3++;
                        }
                        if (i3 >= this.ar.length) {
                            int[] iArr2 = new int[(this.ar.length * 2)];
                            for (i4 = 0; i4 < this.ar.length; i4++) {
                                iArr2[i4] = this.ar[i4];
                            }
                            this.ar = iArr2;
                        }
                    }
                    this.ar[i3] = i2;
                    if (i3 >= i) {
                        i = i3 + 1;
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kb.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static cd ad(byte[] bArr, byte b) {
        if (bArr != null) {
            return new cd(ey.ad(bArr, 751748243).ad);
        }
        try {
            return new cd();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kb.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ai(CharSequence charSequence, int i, boolean z, byte b) {
        if (i < 2 || i > 36) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        try {
            int length = charSequence.length();
            int i2 = 0;
            int i3 = 0;
            Object obj = null;
            Object obj2 = null;
            while (i3 < length) {
                int i4;
                char charAt = charSequence.charAt(i3);
                if (i3 == 0) {
                    if (charAt == '-') {
                        i4 = i2;
                        obj = 1;
                    } else if ('+' == charAt && z) {
                        i4 = i2;
                    }
                    i3++;
                    i2 = i4;
                }
                if (charAt >= '0' && charAt <= '9') {
                    i4 = charAt - 48;
                } else if (charAt >= 'A' && charAt <= 'Z') {
                    i4 = charAt - 55;
                } else if (charAt < 'a' || charAt > 'z') {
                    throw new NumberFormatException();
                } else {
                    i4 = charAt - 87;
                }
                if (i4 < i) {
                    if (obj != null) {
                        i4 = -i4;
                    }
                    i4 += i2 * i;
                    if (i4 / i == i2) {
                        int obj22 = 1;
                        i3++;
                        i2 = i4;
                    } else {
                        throw new NumberFormatException();
                    }
                }
                throw new NumberFormatException();
            }
            if (obj22 != null) {
                return i2;
            }
            throw new NumberFormatException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("kb.ai(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public static cm[] aq(int i) {
        try {
            cm cmVar = cm.ad;
            cm cmVar2 = cm.aq;
            cm cmVar3 = cm.ar;
            return new cm[]{cmVar, cmVar2, cmVar3};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kb.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ar(int i, int i2, int i3, int i4) {
        int i5;
        if (i3 > 179) {
            try {
                i5 = i2 / 2;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kb.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        i5 = i2;
        if (i3 > 192) {
            i5 /= 2;
        }
        if (i3 > 217) {
            i5 /= 2;
        }
        if (i3 > 243) {
            i5 /= 2;
        }
        return (((i5 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static final void az(String str, byte b) {
        try {
            ns aq = ib.aq(no.dc, client.eb.aj, 196180080);
            aq.ar.al(hs.ag(str, (short) -3471), -1763132433);
            aq.ar.ap(str, 635769462);
            client.eb.ar(aq, -821726032);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kb.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = 0;
        int i6 = i3 << 3;
        int i7 = i;
        while (i7 < i2 + i) {
            int i8 = bArr[i7] & 255;
            StringBuilder stringBuilder;
            try {
                int i9 = this.ad[i8];
                byte b = this.aq[i8];
                if (b != (byte) 0) {
                    int i10 = i6 >> 3;
                    i8 = i6 & 7;
                    int i11 = (((b + i8) - 1) >> 3) + i10;
                    int i12 = i8 + 24;
                    i8 = (((-i8) >> 31) & i5) | (i9 >>> i12);
                    bArr2[i10] = (byte) i8;
                    if (i10 < i11) {
                        i5 = i10 + 1;
                        i10 = i12 - 8;
                        i8 = i9 >>> i10;
                        bArr2[i5] = (byte) i8;
                        if (i5 < i11) {
                            i5++;
                            i10 -= 8;
                            i8 = i9 >>> i10;
                            bArr2[i5] = (byte) i8;
                            if (i5 < i11) {
                                i5++;
                                i10 -= 8;
                                i8 = i9 >>> i10;
                                bArr2[i5] = (byte) i8;
                                if (i5 < i11) {
                                    i8 = i9 << (-(i10 - 8));
                                    bArr2[i5 + 1] = (byte) i8;
                                }
                            }
                        }
                    }
                    i6 += b;
                    i7++;
                    i5 = i8;
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("");
                    stringBuilder.append(i8);
                    throw new RuntimeException(stringBuilder.toString());
                }
            } catch (RuntimeException e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("kb.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return ((i6 + 7) >> 3) - i3;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int aj(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = i3 + i2;
        int i5 = i;
        int i6 = 0;
        while (true) {
            byte b = bArr[i5];
            i6 = b < (byte) 0 ? this.ar[i6] : i6 + 1;
            int i7 = this.ar[i6];
            int i8;
            int i9;
            if (i7 < 0) {
                i8 = i2 + 1;
                bArr2[i2] = (byte) i7;
                if (i8 >= i4) {
                    break;
                }
                i6 = 0;
                i6 = (b & 64) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) i9;
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                i6 = (-791544721 & b) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) i9;
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                i6 = (b & 16) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) i9;
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                i6 = (b & 8) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) i9;
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                i6 = (b & 4) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) i9;
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                i6 = (b & 2) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) i9;
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                i6 = (b & 1) == 0 ? this.ar[i6] : i6 + 1;
                i7 = this.ar[i6];
                if (i7 >= 0) {
                    i2 = i8 + 1;
                    bArr2[i8] = (byte) i7;
                    if (i2 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i2 = i8;
                }
                i5++;
            } else {
                i8 = i2;
                if ((b & 64) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((-791544721 & b) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((b & 16) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((b & 8) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((b & 4) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((b & 2) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((b & 1) == 0) {
                }
                i7 = this.ar[i6];
                if (i7 >= 0) {
                }
                i5++;
            }
        }
        return (i5 + 1) - i;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int al(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = i3 + i2;
        int i5 = i;
        int i6 = 0;
        while (true) {
            byte b = bArr[i5];
            i6 = b < (byte) 0 ? this.ar[i6] : i6 + 1;
            int i7 = this.ar[i6];
            int i8;
            int i9;
            if (i7 < 0) {
                i8 = i2 + 1;
                bArr2[i2] = (byte) i7;
                if (i8 >= i4) {
                    break;
                }
                i6 = 0;
                i6 = (b & 64) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) i9;
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                i6 = (-903529111 & b) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) i9;
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                i6 = (b & 16) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) i9;
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                i6 = (b & 8) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) i9;
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                i6 = (b & 4) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i7 = i8 + 1;
                    bArr2[i8] = (byte) i9;
                    if (i7 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i7 = i8;
                }
                i6 = (b & 2) == 0 ? this.ar[i6] : i6 + 1;
                i9 = this.ar[i6];
                if (i9 >= 0) {
                    i8 = i7 + 1;
                    bArr2[i7] = (byte) i9;
                    if (i8 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i8 = i7;
                }
                i6 = (b & 1) == 0 ? this.ar[i6] : i6 + 1;
                i7 = this.ar[i6];
                if (i7 >= 0) {
                    i2 = i8 + 1;
                    bArr2[i8] = (byte) i7;
                    if (i2 >= i4) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i2 = i8;
                }
                i5++;
            } else {
                i8 = i2;
                if ((b & 64) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((-903529111 & b) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((b & 16) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((b & 8) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((b & 4) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((b & 2) == 0) {
                }
                i9 = this.ar[i6];
                if (i9 >= 0) {
                }
                if ((b & 1) == 0) {
                }
                i7 = this.ar[i6];
                if (i7 >= 0) {
                }
                i5++;
            }
        }
        return (i5 + 1) - i;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A:{SYNTHETIC, Splitter:B:15:0x0027} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d A:{SYNTHETIC, Splitter:B:24:0x003d} */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0053 A:{SYNTHETIC, Splitter:B:33:0x0053} */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0069 A:{SYNTHETIC, Splitter:B:42:0x0069} */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x007f A:{SYNTHETIC, Splitter:B:51:0x007f} */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0095 A:{SYNTHETIC, Splitter:B:60:0x0095} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ab A:{SYNTHETIC, Splitter:B:69:0x00ab} */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int aq(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4) {
        if (i3 == 0) {
            return 0;
        }
        int i5 = i3 + i2;
        int i6 = i;
        int i7 = 0;
        while (true) {
            byte b = bArr[i6];
            if (b < (byte) 0) {
                try {
                    i7 = this.ar[i7];
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("kb.aq(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
            i7++;
            int i8 = this.ar[i7];
            int i9;
            int i10;
            if (i8 < 0) {
                i9 = i2 + 1;
                bArr2[i2] = (byte) i8;
                if (i9 >= i5) {
                    break;
                }
                i7 = 0;
                i7 = (b & 64) == 0 ? this.ar[i7] : i7 + 1;
                i10 = this.ar[i7];
                if (i10 >= 0) {
                    i8 = i9 + 1;
                    bArr2[i9] = (byte) i10;
                    if (i8 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i8 = i9;
                }
                i7 = (b & 32) == 0 ? this.ar[i7] : i7 + 1;
                i10 = this.ar[i7];
                if (i10 >= 0) {
                    i9 = i8 + 1;
                    bArr2[i8] = (byte) i10;
                    if (i9 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i9 = i8;
                }
                i7 = (b & 16) == 0 ? this.ar[i7] : i7 + 1;
                i10 = this.ar[i7];
                if (i10 >= 0) {
                    i8 = i9 + 1;
                    bArr2[i9] = (byte) i10;
                    if (i8 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i8 = i9;
                }
                i7 = (b & 8) == 0 ? this.ar[i7] : i7 + 1;
                i10 = this.ar[i7];
                if (i10 >= 0) {
                    i9 = i8 + 1;
                    bArr2[i8] = (byte) i10;
                    if (i9 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i9 = i8;
                }
                i7 = (b & 4) == 0 ? this.ar[i7] : i7 + 1;
                i10 = this.ar[i7];
                if (i10 >= 0) {
                    i8 = i9 + 1;
                    bArr2[i9] = (byte) i10;
                    if (i8 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i8 = i9;
                }
                i7 = (b & 2) == 0 ? this.ar[i7] : i7 + 1;
                i10 = this.ar[i7];
                if (i10 >= 0) {
                    i9 = i8 + 1;
                    bArr2[i8] = (byte) i10;
                    if (i9 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i9 = i8;
                }
                i7 = (b & 1) == 0 ? this.ar[i7] : i7 + 1;
                i8 = this.ar[i7];
                if (i8 >= 0) {
                    i2 = i9 + 1;
                    bArr2[i9] = (byte) i8;
                    if (i2 >= i5) {
                        break;
                    }
                    i7 = 0;
                } else {
                    i2 = i9;
                }
                i6++;
            } else {
                i9 = i2;
                if ((b & 64) == 0) {
                }
                i10 = this.ar[i7];
                if (i10 >= 0) {
                }
                if ((b & 32) == 0) {
                }
                i10 = this.ar[i7];
                if (i10 >= 0) {
                }
                if ((b & 16) == 0) {
                }
                i10 = this.ar[i7];
                if (i10 >= 0) {
                }
                if ((b & 8) == 0) {
                }
                i10 = this.ar[i7];
                if (i10 >= 0) {
                }
                if ((b & 4) == 0) {
                }
                i10 = this.ar[i7];
                if (i10 >= 0) {
                }
                if ((b & 2) == 0) {
                }
                i10 = this.ar[i7];
                if (i10 >= 0) {
                }
                if ((b & 1) == 0) {
                }
                i8 = this.ar[i7];
                if (i8 >= 0) {
                }
                i6++;
            }
        }
        return (i6 + 1) - i;
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i3 << 3;
        int i5 = 0;
        int i6 = i;
        while (i6 < i2 + i) {
            int i7 = bArr[i6] & 255;
            int i8 = this.ad[i7];
            byte b = this.aq[i7];
            if (b != (byte) 0) {
                i7 = i4 >> 3;
                int i9 = i4 & 7;
                int i10 = -i9;
                int i11 = (((b + i9) - 1) >> 3) + i7;
                i9 += 24;
                i5 = (i5 & (i10 >> 31)) | (i8 >>> i9);
                bArr2[i7] = (byte) i5;
                if (i7 < i11) {
                    i7++;
                    i9 -= 8;
                    i5 = i8 >>> i9;
                    bArr2[i7] = (byte) i5;
                    if (i7 < i11) {
                        i7++;
                        i9 -= 8;
                        i5 = i8 >>> i9;
                        bArr2[i7] = (byte) i5;
                        if (i7 < i11) {
                            i7++;
                            i9 -= 8;
                            i5 = i8 >>> i9;
                            bArr2[i7] = (byte) i5;
                            if (i7 < i11) {
                                i5 = i8 << (-(i9 - 8));
                                bArr2[i7 + 1] = (byte) i5;
                            }
                        }
                    }
                }
                i4 += b;
                i6++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(i7);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        return ((i4 + 7) >> 3) - i3;
    }
}
