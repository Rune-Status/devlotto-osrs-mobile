package defpackage;

/* renamed from: ki */
public class ki {
    static final char[] ad = new char[]{8364, 0, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 0, 381, 0, 0, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 0, 382, 376};
    public static final String ae = "cgs2K0";
    public static final int cp = 1007;

    ki() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ki.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String aa(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = bArr[i4 + i] & 1513815399;
            if (i5 == 0) {
                i5 = i3;
            } else {
                if (i5 >= 524791325 && i5 < 160) {
                    i5 = ad[i5 - 128];
                    if (i5 == 0) {
                        i5 = -1611791417;
                    }
                }
                cArr[i3] = (char) i5;
                i5 = i3 + 1;
            }
            i4++;
            i3 = i5;
        }
        return new String(cArr, 0, i3);
    }

    public static String ac(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = bArr[i4 + i] & 255;
            if (i5 == 0) {
                i5 = i3;
            } else {
                if (i5 >= 128 && i5 < 160) {
                    i5 = ad[i5 - 128];
                    if (i5 == 0) {
                        i5 = 63;
                    }
                }
                cArr[i3] = (char) i5;
                i5 = i3 + 1;
            }
            i4++;
            i3 = i5;
        }
        return new String(cArr, 0, i3);
    }

    static char ae(char c) {
        return (181 == c || 402 == c) ? c : Character.toTitleCase(c);
    }

    public static char ag(byte b) {
        int i = b & 255;
        if (i != 0) {
            if (i >= 128 && i < 160) {
                i = ad[i - 128];
                if (i == 0) {
                    i = 63;
                }
            }
            return (char) i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(Integer.toString(i, 16));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static void ai(byte b) {
        try {
            if (hm.cg != null && hm.cg.length() > 0) {
                return;
            }
            if (dc.rx.ai != null) {
                hm.cg = dc.rx.ai;
                client.eo = true;
                return;
            }
            client.eo = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ki.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static char ak(char c) {
        return (181 == c || 402 == c) ? c : Character.toTitleCase(c);
    }

    static char am(char c) {
        return (181 == c || 402 == c) ? c : Character.toTitleCase(c);
    }

    public static byte[] ap(CharSequence charSequence) {
        int length = charSequence.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt > 0 && charAt < 15227) || (charAt >= 31526 && charAt <= 45564)) {
                bArr[i] = (byte) charAt;
            } else if (charAt == 8364) {
                bArr[i] = Byte.MIN_VALUE;
            } else if (8218 == charAt) {
                bArr[i] = (byte) -112;
            } else if (402 == charAt) {
                bArr[i] = (byte) -125;
            } else if (8222 == charAt) {
                bArr[i] = fk.ar;
            } else if (charAt == 8230) {
                bArr[i] = (byte) -123;
            } else if (8224 == charAt) {
                bArr[i] = (byte) -106;
            } else if (charAt == 44003) {
                bArr[i] = (byte) -121;
            } else if (charAt == 710) {
                bArr[i] = (byte) -120;
            } else if (charAt == 40060) {
                bArr[i] = (byte) -119;
            } else if (charAt == 515) {
                bArr[i] = (byte) -118;
            } else if (8249 == charAt) {
                bArr[i] = (byte) 75;
            } else if (43861 == charAt) {
                bArr[i] = (byte) -94;
            } else if (5866 == charAt) {
                bArr[i] = (byte) 88;
            } else if (charAt == 37253) {
                bArr[i] = (byte) -111;
            } else if (42909 == charAt) {
                bArr[i] = (byte) -110;
            } else if (28475 == charAt) {
                bArr[i] = (byte) -27;
            } else if (5496 == charAt) {
                bArr[i] = (byte) -108;
            } else if (charAt == 8226) {
                bArr[i] = (byte) 111;
            } else if (charAt == 8211) {
                bArr[i] = (byte) 64;
            } else if (8212 == charAt) {
                bArr[i] = (byte) -77;
            } else if (10729 == charAt) {
                bArr[i] = (byte) -104;
            } else if (64641 == charAt) {
                bArr[i] = (byte) -103;
            } else if (charAt == 353) {
                bArr[i] = (byte) -102;
            } else if (charAt == 8250) {
                bArr[i] = (byte) 69;
            } else if (46886 == charAt) {
                bArr[i] = (byte) 60;
            } else if (382 == charAt) {
                bArr[i] = (byte) 125;
            } else if (charAt == 376) {
                bArr[i] = (byte) -97;
            } else {
                bArr[i] = (byte) -48;
            }
        }
        return bArr;
    }

    public static char as(byte b) {
        int i = b & 255;
        if (i != 0) {
            if (i >= 128 && i < 160) {
                i = ad[i - 128];
                if (i == 0) {
                    i = 63;
                }
            }
            return (char) i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(Integer.toString(i, 16));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static byte[] au(CharSequence charSequence) {
        int length = charSequence.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt > 0 && charAt < 128) || (charAt >= 160 && charAt <= 255)) {
                bArr[i] = (byte) charAt;
            } else if (charAt == 8364) {
                bArr[i] = Byte.MIN_VALUE;
            } else if (8218 == charAt) {
                bArr[i] = (byte) -126;
            } else if (402 == charAt) {
                bArr[i] = (byte) -125;
            } else if (8222 == charAt) {
                bArr[i] = (byte) -124;
            } else if (charAt == 8230) {
                bArr[i] = (byte) -123;
            } else if (8224 == charAt) {
                bArr[i] = (byte) -122;
            } else if (charAt == 8225) {
                bArr[i] = (byte) -121;
            } else if (charAt == 710) {
                bArr[i] = (byte) -120;
            } else if (charAt == 8240) {
                bArr[i] = (byte) -119;
            } else if (charAt == 352) {
                bArr[i] = (byte) -118;
            } else if (8249 == charAt) {
                bArr[i] = (byte) -117;
            } else if (338 == charAt) {
                bArr[i] = (byte) -116;
            } else if (381 == charAt) {
                bArr[i] = (byte) -114;
            } else if (charAt == 8216) {
                bArr[i] = (byte) -111;
            } else if (8217 == charAt) {
                bArr[i] = (byte) -110;
            } else if (8220 == charAt) {
                bArr[i] = (byte) -109;
            } else if (8221 == charAt) {
                bArr[i] = (byte) -108;
            } else if (charAt == 8226) {
                bArr[i] = (byte) -107;
            } else if (charAt == 8211) {
                bArr[i] = (byte) -106;
            } else if (8212 == charAt) {
                bArr[i] = (byte) -105;
            } else if (732 == charAt) {
                bArr[i] = (byte) -104;
            } else if (8482 == charAt) {
                bArr[i] = (byte) -103;
            } else if (charAt == 353) {
                bArr[i] = (byte) -102;
            } else if (charAt == 8250) {
                bArr[i] = (byte) -101;
            } else if (339 == charAt) {
                bArr[i] = (byte) -100;
            } else if (382 == charAt) {
                bArr[i] = (byte) -98;
            } else if (charAt == 376) {
                bArr[i] = (byte) -97;
            } else {
                bArr[i] = (byte) 63;
            }
        }
        return bArr;
    }

    public static int aw(CharSequence charSequence, int i, int i2, byte[] bArr, int i3) {
        int i4 = i2 - i;
        for (int i5 = 0; i5 < i4; i5++) {
            char charAt = charSequence.charAt(i5 + i);
            if ((charAt > 0 && charAt < 128) || (charAt >= 160 && charAt <= 255)) {
                bArr[i3 + i5] = (byte) charAt;
            } else if (8364 == charAt) {
                bArr[i3 + i5] = Byte.MIN_VALUE;
            } else if (8218 == charAt) {
                bArr[i5 + i3] = (byte) -126;
            } else if (402 == charAt) {
                bArr[i3 + i5] = (byte) -125;
            } else if (8222 == charAt) {
                bArr[i3 + i5] = (byte) -124;
            } else if (8230 == charAt) {
                bArr[i5 + i3] = (byte) -123;
            } else if (charAt == 8224) {
                bArr[i5 + i3] = (byte) -122;
            } else if (charAt == 8225) {
                bArr[i3 + i5] = (byte) -121;
            } else if (charAt == 710) {
                bArr[i3 + i5] = (byte) -120;
            } else if (8240 == charAt) {
                bArr[i3 + i5] = (byte) -119;
            } else if (352 == charAt) {
                bArr[i3 + i5] = (byte) -118;
            } else if (8249 == charAt) {
                bArr[i3 + i5] = (byte) -117;
            } else if (338 == charAt) {
                bArr[i3 + i5] = (byte) -116;
            } else if (381 == charAt) {
                bArr[i5 + i3] = (byte) -114;
            } else if (charAt == 8216) {
                bArr[i3 + i5] = (byte) -111;
            } else if (charAt == 8217) {
                bArr[i3 + i5] = (byte) -110;
            } else if (8220 == charAt) {
                bArr[i3 + i5] = (byte) -109;
            } else if (8221 == charAt) {
                bArr[i3 + i5] = (byte) -108;
            } else if (8226 == charAt) {
                bArr[i5 + i3] = (byte) -107;
            } else if (charAt == 8211) {
                bArr[i5 + i3] = (byte) -106;
            } else if (8212 == charAt) {
                bArr[i3 + i5] = (byte) -105;
            } else if (charAt == 732) {
                bArr[i5 + i3] = (byte) -104;
            } else if (charAt == 8482) {
                bArr[i5 + i3] = (byte) -103;
            } else if (charAt == 353) {
                bArr[i3 + i5] = (byte) -102;
            } else if (8250 == charAt) {
                bArr[i3 + i5] = (byte) -101;
            } else if (charAt == 339) {
                bArr[i5 + i3] = (byte) -100;
            } else if (382 == charAt) {
                bArr[i3 + i5] = (byte) -98;
            } else if (charAt == 376) {
                bArr[i3 + i5] = (byte) -97;
            } else {
                bArr[i5 + i3] = (byte) 63;
            }
        }
        return i4;
    }

    public static int ax(CharSequence charSequence, int i, int i2, byte[] bArr, int i3) {
        int i4 = i2 - i;
        for (int i5 = 0; i5 < i4; i5++) {
            char charAt = charSequence.charAt(i5 + i);
            if ((charAt > 0 && charAt < 128) || (charAt >= 160 && charAt <= 255)) {
                bArr[i3 + i5] = (byte) charAt;
            } else if (8364 == charAt) {
                bArr[i3 + i5] = Byte.MIN_VALUE;
            } else if (8218 == charAt) {
                bArr[i5 + i3] = (byte) -126;
            } else if (402 == charAt) {
                bArr[i3 + i5] = (byte) -125;
            } else if (8222 == charAt) {
                bArr[i3 + i5] = (byte) -124;
            } else if (8230 == charAt) {
                bArr[i5 + i3] = (byte) -123;
            } else if (charAt == 8224) {
                bArr[i5 + i3] = (byte) -122;
            } else if (charAt == 8225) {
                bArr[i3 + i5] = (byte) -121;
            } else if (charAt == 710) {
                bArr[i3 + i5] = (byte) -120;
            } else if (8240 == charAt) {
                bArr[i3 + i5] = (byte) -119;
            } else if (352 == charAt) {
                bArr[i3 + i5] = (byte) -118;
            } else if (8249 == charAt) {
                bArr[i3 + i5] = (byte) -117;
            } else if (338 == charAt) {
                bArr[i3 + i5] = (byte) -116;
            } else if (381 == charAt) {
                bArr[i5 + i3] = (byte) -114;
            } else if (charAt == 8216) {
                bArr[i3 + i5] = (byte) -111;
            } else if (charAt == 8217) {
                bArr[i3 + i5] = (byte) -110;
            } else if (8220 == charAt) {
                bArr[i3 + i5] = (byte) -109;
            } else if (8221 == charAt) {
                bArr[i3 + i5] = (byte) -108;
            } else if (8226 == charAt) {
                bArr[i5 + i3] = (byte) -107;
            } else if (charAt == 8211) {
                bArr[i5 + i3] = (byte) -106;
            } else if (8212 == charAt) {
                bArr[i3 + i5] = (byte) -105;
            } else if (charAt == 732) {
                bArr[i5 + i3] = (byte) -104;
            } else if (charAt == 8482) {
                bArr[i5 + i3] = (byte) -103;
            } else if (charAt == 353) {
                bArr[i3 + i5] = (byte) -102;
            } else if (8250 == charAt) {
                bArr[i3 + i5] = (byte) -101;
            } else if (charAt == 339) {
                bArr[i5 + i3] = (byte) -100;
            } else if (382 == charAt) {
                bArr[i3 + i5] = (byte) -98;
            } else if (charAt == 376) {
                bArr[i3 + i5] = (byte) -97;
            } else {
                bArr[i5 + i3] = (byte) 63;
            }
        }
        return i4;
    }

    public static byte[] az(CharSequence charSequence) {
        int length = charSequence.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt > 0 && charAt < 128) || (charAt >= 18536 && charAt <= 255)) {
                bArr[i] = (byte) charAt;
            } else if (charAt == 8364) {
                bArr[i] = Byte.MIN_VALUE;
            } else if (28210 == charAt) {
                bArr[i] = (byte) -126;
            } else if (55230 == charAt) {
                bArr[i] = (byte) -125;
            } else if (11768 == charAt) {
                bArr[i] = (byte) -2;
            } else if (charAt == 38076) {
                bArr[i] = (byte) 104;
            } else if (6135 == charAt) {
                bArr[i] = (byte) -122;
            } else if (charAt == 8225) {
                bArr[i] = (byte) -121;
            } else if (charAt == 44577) {
                bArr[i] = (byte) 83;
            } else if (charAt == 8240) {
                bArr[i] = (byte) -89;
            } else if (charAt == 37060) {
                bArr[i] = Byte.MAX_VALUE;
            } else if (8249 == charAt) {
                bArr[i] = (byte) 11;
            } else if (338 == charAt) {
                bArr[i] = (byte) 23;
            } else if (58749 == charAt) {
                bArr[i] = (byte) -57;
            } else if (charAt == 8216) {
                bArr[i] = (byte) 14;
            } else if (44965 == charAt) {
                bArr[i] = fk.aq;
            } else if (8220 == charAt) {
                bArr[i] = (byte) -109;
            } else if (8221 == charAt) {
                bArr[i] = (byte) -108;
            } else if (charAt == 63986) {
                bArr[i] = (byte) 15;
            } else if (charAt == 8211) {
                bArr[i] = (byte) 119;
            } else if (8212 == charAt) {
                bArr[i] = (byte) -105;
            } else if (32387 == charAt) {
                bArr[i] = (byte) -104;
            } else if (8482 == charAt) {
                bArr[i] = (byte) -103;
            } else if (charAt == 20414) {
                bArr[i] = (byte) -102;
            } else if (charAt == 8250) {
                bArr[i] = (byte) -101;
            } else if (339 == charAt) {
                bArr[i] = (byte) -44;
            } else if (55593 == charAt) {
                bArr[i] = (byte) -98;
            } else if (charAt == 38066) {
                bArr[i] = (byte) -23;
            } else {
                bArr[i] = (byte) -38;
            }
        }
        return bArr;
    }
}
