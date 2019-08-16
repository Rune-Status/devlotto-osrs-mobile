package defpackage;

import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import java.util.Random;

/* renamed from: oi */
public class oi extends mp {
    static int aa = 0;
    static int ac = 0;
    static int af = 0;
    public static ef[] ag = null;
    static int ah = 0;
    static String[] an = new String[100];
    static int ao = 255;
    static int au = -1;
    static int aw = -1;
    static int ax = -1;
    static Random ay = new Random();
    static int az = -1;
    byte[][] ad;
    public int ae;
    int[] ai;
    int[] aj;
    public int ak;
    int[] al;
    public int am;
    byte[] ap;
    int[] aq;
    int[] ar;
    public int as;

    public oi(byte[] bArr) {
        this.ad = new byte[256][];
        this.ae = 0;
        ad(bArr);
    }

    public oi(byte[] bArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, byte[][] bArr2) {
        int i = 0;
        this.ad = new byte[256][];
        this.ae = 0;
        this.aj = iArr;
        this.ai = iArr2;
        this.ar = iArr3;
        this.al = iArr4;
        ad(bArr);
        this.ad = bArr2;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        while (i < 256) {
            if (this.ai[i] < i2 && this.al[i] != 0) {
                i2 = this.ai[i];
            }
            if (this.ai[i] + this.al[i] > i3) {
                i3 = this.ai[i] + this.al[i];
            }
            i++;
        }
        this.am = this.ae - i2;
        this.ak = i3 - this.ae;
        this.as = this.ae - this.ai[120];
    }

    public static String am(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    static int aq(byte[][] bArr, byte[][] bArr2, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        int i3 = iArr[i];
        int i4 = iArr3[i] + i3;
        int i5 = iArr[i2];
        int i6 = iArr3[i2] + i5;
        int i7 = i5 > i3 ? i5 : i3;
        if (i6 >= i4) {
            i6 = i4;
        }
        i4 = iArr2[i];
        if (iArr2[i2] < i4) {
            i4 = iArr2[i2];
        }
        byte[] bArr3 = bArr2[i];
        byte[] bArr4 = bArr[i2];
        i3 = i7 - i3;
        int i8 = i7 - i5;
        i5 = i4;
        while (i7 < i6) {
            i4 = bArr3[i3] + bArr4[i8];
            if (i4 >= i5) {
                i4 = i5;
            }
            i7++;
            i3++;
            i8++;
            i5 = i4;
        }
        return -i5;
    }

    static int bm(byte[][] bArr, byte[][] bArr2, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        int i3 = iArr[i];
        int i4 = iArr3[i] + i3;
        int i5 = iArr[i2];
        int i6 = iArr3[i2] + i5;
        int i7 = i5 > i3 ? i5 : i3;
        if (i6 >= i4) {
            i6 = i4;
        }
        i4 = iArr2[i];
        if (iArr2[i2] < i4) {
            i4 = iArr2[i2];
        }
        byte[] bArr3 = bArr2[i];
        byte[] bArr4 = bArr[i2];
        i3 = i7 - i3;
        int i8 = i7 - i5;
        i5 = i4;
        while (i7 < i6) {
            i4 = bArr3[i3] + bArr4[i8];
            if (i4 >= i5) {
                i4 = i5;
            }
            i7++;
            i3++;
            i8++;
            i5 = i4;
        }
        return -i5;
    }

    static int bq(byte[][] bArr, byte[][] bArr2, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        int i3 = iArr[i];
        int i4 = iArr3[i] + i3;
        int i5 = iArr[i2];
        int i6 = iArr3[i2] + i5;
        int i7 = i5 > i3 ? i5 : i3;
        if (i6 >= i4) {
            i6 = i4;
        }
        i4 = iArr2[i];
        if (iArr2[i2] < i4) {
            i4 = iArr2[i2];
        }
        byte[] bArr3 = bArr2[i];
        byte[] bArr4 = bArr[i2];
        i3 = i7 - i3;
        int i8 = i7 - i5;
        i5 = i4;
        while (i7 < i6) {
            i4 = bArr3[i3] + bArr4[i8];
            if (i4 >= i5) {
                i4 = i5;
            }
            i7++;
            i3++;
            i8++;
            i5 = i4;
        }
        return -i5;
    }

    public static String br(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    public static String bw(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(int i, int i2) {
        au = -1;
        az = -1;
        ax = i2;
        aw = i2;
        ac = i;
        aa = i;
        ao = 255;
        ah = 0;
        af = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void ab(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i | ViewCompat.MEASURED_STATE_MASK;
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14;
            int i15;
            int i16 = i8;
            while (i16 < 0) {
                i14 = i12 + 1;
                if (bArr[i12] != (byte) 0) {
                    i15 = i11 + 1;
                    iArr[i11] = i10;
                } else {
                    i15 = i11 + 1;
                }
                i12 = i14 + 1;
                if (bArr[i14] != (byte) 0) {
                    i14 = i15 + 1;
                    iArr[i15] = i10;
                    i15 = i14;
                } else {
                    i15++;
                }
                i11 = i12 + 1;
                if (bArr[i12] != (byte) 0) {
                    i14 = i15 + 1;
                    iArr[i15] = i10;
                    i15 = i14;
                } else {
                    i15++;
                }
                if (bArr[i11] != (byte) 0) {
                    iArr[i15] = i10;
                }
                i12 = i11 + 1;
                i16++;
                i11 = i15 + 1;
            }
            i14 = i9;
            i15 = i11;
            while (i14 < 0) {
                if (bArr[i12] != (byte) 0) {
                    iArr[i15] = i10;
                }
                i15++;
                i14++;
                i12++;
            }
            i11 = i15 + i6;
            i12 += i7;
        }
    }

    public void ac(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = 0;
        if (str != null) {
            aa(i3, i4);
            ay.setSeed((long) i5);
            ao = (ay.nextInt() & 31) + 192;
            int[] iArr = new int[str.length()];
            int i7 = 0;
            while (true) {
                int i8 = i6;
                if (i8 < str.length()) {
                    iArr[i8] = i7;
                    if ((ay.nextInt() & 3) == 0) {
                        i7++;
                    }
                    i6 = i8 + 1;
                } else {
                    ay(str, i, i2, iArr, null, esVar);
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(byte[] bArr) {
        this.aq = new int[256];
        int i;
        if (bArr.length == InputDeviceCompat.SOURCE_KEYBOARD) {
            for (i = 0; i < this.aq.length; i++) {
                this.aq[i] = bArr[i] & 255;
            }
            this.ae = bArr[256] & 255;
            return;
        }
        int i2;
        int i3;
        i = 0;
        int i4 = 0;
        while (i < 256) {
            this.aq[i] = bArr[i4] & 255;
            i++;
            i4++;
        }
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        i = 0;
        while (i < 256) {
            iArr[i] = bArr[i4] & 255;
            i++;
            i4++;
        }
        i = 0;
        while (i < 256) {
            iArr2[i] = bArr[i4] & 255;
            i++;
            i4++;
        }
        byte[][] bArr2 = new byte[256][];
        for (i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = new byte[iArr[i2]];
            int i5 = 0;
            i3 = 0;
            while (i3 < bArr2[i2].length) {
                i5 = (byte) (i5 + bArr[i4]);
                bArr2[i2][i3] = i5;
                i3++;
                i4++;
            }
        }
        byte[][] bArr3 = new byte[256][];
        i2 = i4;
        for (int i6 = 0; i6 < 256; i6++) {
            bArr3[i6] = new byte[iArr[i6]];
            i3 = 0;
            i4 = 0;
            while (i4 < bArr3[i6].length) {
                i3 = (byte) (i3 + bArr[i2]);
                bArr3[i6][i4] = i3;
                i4++;
                i2++;
            }
        }
        this.ap = new byte[65536];
        i4 = 0;
        while (i4 < 256) {
            if (!(i4 == 32 || i4 == 160)) {
                i2 = 0;
                while (i2 < 256) {
                    if (!(i2 == 32 || i2 == 160)) {
                        this.ap[(i4 << 8) + i2] = (byte) oi.aq(bArr2, bArr3, iArr2, this.aq, iArr, i4, i2);
                    }
                    i2++;
                }
            }
            i4++;
        }
        this.ae = iArr2[32] + iArr[32];
    }

    public int ae(String str, int i) {
        return aj(str, new int[]{i}, an);
    }

    /* Access modifiers changed, original: 0000 */
    public void af(String str, int i, int i2, es esVar) {
        int i3 = i2 - this.ae;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 < str.length()) {
                if (str.charAt(i7) != 0) {
                    int ad = (char) (je.ad(str.charAt(i7), -684280981) & 255);
                    if (ad == '<') {
                        i4 = i7;
                    } else {
                        int i8;
                        if (ad != '>' || i4 == -1) {
                            i8 = i4;
                        } else {
                            char c;
                            String substring = str.substring(i4 + 1, i7);
                            if (substring.equals("lt")) {
                                c = '<';
                            } else if (substring.equals("gt")) {
                                c = '>';
                            } else if (substring.startsWith("img=")) {
                                try {
                                    ef efVar = ag[nz.al(substring.substring(4), (byte) 121)];
                                    try {
                                        esVar.aa(efVar, i, (this.ae + i3) - efVar.am, (byte) -64);
                                        i += efVar.ae;
                                        i4 = -1;
                                        i5 = -1;
                                    } catch (Exception e) {
                                    }
                                } catch (Exception e2) {
                                }
                            } else {
                                ao(substring);
                                i4 = -1;
                            }
                            ad = c;
                            i8 = -1;
                        }
                        if (ad == 160) {
                            ad = 32;
                        }
                        if (i8 == -1) {
                            if (!(this.ap == null || i5 == -1)) {
                                i += this.ap[(i5 << 8) + ad];
                            }
                            int i9 = this.ar[ad];
                            int i10 = this.al[ad];
                            if (ad == 32) {
                                if (ah > 0) {
                                    af += ah;
                                    i += af >> 8;
                                    af &= 255;
                                }
                                i6 = i;
                            } else if (ao >= 255) {
                                if (aw != -1) {
                                    an(this.ad[ad], (this.aj[ad] + i) + 1, (this.ai[ad] + i3) + 1, i9, i10, aw, esVar);
                                }
                                an(this.ad[ad], i + this.aj[ad], i3 + this.ai[ad], i9, i10, aa, esVar);
                                i6 = i;
                            } else {
                                if (aw != -1) {
                                    av(this.ad[ad], (this.aj[ad] + i) + 1, (this.ai[ad] + i3) + 1, i9, i10, aw, ao, esVar);
                                }
                                av(this.ad[ad], i + this.aj[ad], i3 + this.ai[ad], i9, i10, aa, ao, esVar);
                                i6 = i;
                            }
                            int i11 = this.aq[ad];
                            if (au != -1) {
                                esVar.ae(i6, i3 + ((int) (((double) this.ae) * 0.7d)), i11, au, 806719319);
                            }
                            if (az != -1) {
                                esVar.ae(i6, (this.ae + i3) + 1, i11, az, -773695406);
                            }
                            i = i6 + i11;
                            i5 = ad;
                            i4 = i8;
                        } else {
                            i4 = i8;
                        }
                    }
                }
                i6 = i7 + 1;
            } else {
                return;
            }
        }
    }

    public void ag(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            aa(i3, i4);
            af(str, i - al(str), i2, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '<') {
                obj = 1;
            } else if (charAt == '>') {
                obj = null;
            } else if (obj == null && charAt == ' ') {
                i2++;
            }
        }
        if (i2 > 0) {
            ah = ((i - al(str)) << 8) / i2;
        }
    }

    public int ai(String str, int i) {
        int[] iArr = new int[]{i};
        int aj = aj(str, iArr, an);
        int i2 = 0;
        int i3 = 0;
        while (i3 < aj) {
            int al = al(an[i3]);
            if (al <= i2) {
                al = i2;
            }
            i3++;
            i2 = al;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int aj(String str, int[] iArr, String[] strArr) {
        if (str == null) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(100);
        int length = str.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        while (i < length) {
            int i10;
            int i11;
            int i12;
            char charAt = str.charAt(i);
            if (charAt == '<') {
                i10 = i2;
                i11 = i3;
                i12 = i5;
                i4 = i;
            } else {
                int i13;
                int i14;
                if (charAt != '>' || i4 == -1) {
                    i13 = i7;
                    i10 = i2;
                } else {
                    String substring = str.substring(i4 + 1, i);
                    stringBuilder.append('<');
                    stringBuilder.append(substring);
                    stringBuilder.append('>');
                    if (substring.equals("br")) {
                        strArr[i3] = stringBuilder.toString().substring(i2, stringBuilder.length());
                        i3++;
                        i2 = stringBuilder.length();
                        i14 = 0;
                        i6 = 0;
                        i7 = -1;
                    } else if (substring.equals("lt")) {
                        i5 += ar('<');
                        if (!(this.ap == null || i6 == -1)) {
                            i5 += this.ap[(i6 << 8) + 60];
                        }
                        i6 = 60;
                        i14 = i5;
                    } else if (substring.equals("gt")) {
                        i5 += ar('>');
                        if (!(this.ap == null || i6 == -1)) {
                            i5 += this.ap[(i6 << 8) + 62];
                        }
                        i6 = 62;
                        i14 = i5;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i14 = ag[nz.al(substring.substring(4), (byte) 3)].ae + i5;
                            i6 = 0;
                        } catch (Exception e) {
                            i14 = i5;
                        }
                    } else {
                        i14 = i5;
                    }
                    charAt = 0;
                    i4 = -1;
                    i5 = i14;
                    i13 = i7;
                    i10 = i2;
                }
                if (i4 == -1) {
                    char c;
                    int length2;
                    if (charAt != 0) {
                        stringBuilder.append(charAt);
                        i5 += ar(charAt);
                        if (!(this.ap == null || i6 == -1)) {
                            i5 += this.ap[(i6 << 8) + charAt];
                        }
                        c = charAt;
                        i2 = i5;
                    } else {
                        c = i6;
                        i2 = i5;
                    }
                    if (charAt == ' ') {
                        length2 = stringBuilder.length();
                        i7 = 1;
                        i6 = i2;
                    } else {
                        i7 = i8;
                        i6 = i9;
                        length2 = i13;
                    }
                    if (iArr != null) {
                        if (i2 > iArr[i3 < iArr.length ? i3 : iArr.length - 1] && length2 >= 0) {
                            strArr[i3] = stringBuilder.toString().substring(i10, length2 - i7);
                            i11 = i3 + 1;
                            i2 -= i6;
                            i14 = -1;
                            i13 = 0;
                            i10 = length2;
                            if (charAt != '-') {
                                i5 = 0;
                                i3 = i2;
                                i14 = stringBuilder.length();
                            } else {
                                i5 = i7;
                                i3 = i6;
                            }
                            i8 = i5;
                            i9 = i3;
                            i12 = i2;
                            i6 = i13;
                            i7 = i14;
                        }
                    }
                    char c2 = c;
                    i11 = i3;
                    i14 = length2;
                    if (charAt != '-') {
                    }
                    i8 = i5;
                    i9 = i3;
                    i12 = i2;
                    i6 = i13;
                    i7 = i14;
                } else {
                    i11 = i3;
                    i12 = i5;
                    i7 = i13;
                }
            }
            i++;
            i5 = i12;
            i2 = i10;
            i3 = i11;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i2) {
            return i3;
        }
        strArr[i3] = stringBuilder2.substring(i2, stringBuilder2.length());
        return i3 + 1;
    }

    public void ak(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            aa(i3, i4);
            af(str, i, i2, esVar);
        }
    }

    public int al(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        char c = 65535;
        int i2 = 0;
        int i3 = -1;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == '<') {
                charAt = c;
                i3 = i2;
            } else {
                if (charAt == '>' && i3 != -1) {
                    String substring = str.substring(i3 + 1, i2);
                    if (substring.equals("lt")) {
                        i3 = -1;
                        charAt = '<';
                    } else if (substring.equals("gt")) {
                        i3 = -1;
                        charAt = '>';
                    } else {
                        if (substring.startsWith("img=")) {
                            try {
                                i += ag[nz.al(substring.substring(4), (byte) 53)].ae;
                                charAt = 65535;
                                i3 = -1;
                            } catch (Exception e) {
                            }
                        }
                        charAt = c;
                        i3 = -1;
                    }
                }
                if (charAt == 160) {
                    charAt = ' ';
                }
                if (i3 == -1) {
                    i += this.aq[(char) (je.ad(charAt, 825545575) & 255)];
                    if (!(this.ap == null || c == 65535)) {
                        i += this.ap[(c << 8) + charAt];
                    }
                } else {
                    charAt = c;
                }
            }
            i2++;
            c = charAt;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public void an(byte[] bArr, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = ((esVar.aq * 1462922907) * i2) + i;
        int i12 = (esVar.aq * 1462922907) - i3;
        int i13 = 0;
        if (i2 < esVar.al * -709973917) {
            i6 = (esVar.al * -709973917) - i2;
            i2 = -709973917 * esVar.al;
            i11 += (esVar.aq * 1462922907) * i6;
            i4 -= i6;
            i6 = (i6 * i3) + 0;
        } else {
            i6 = 0;
        }
        int i14 = i2 + i4;
        int i15 = i14 > esVar.aj * 157809585 ? i4 - (i14 - (esVar.aj * 157809585)) : i4;
        if (i < esVar.ai * 1947951707) {
            i7 = (esVar.ai * 1947951707) - i;
            i13 = i7 + 0;
            i12 += i7;
            i14 = i6 + i7;
            i8 = i11 + i7;
            i3 -= i7;
            i = esVar.ai * 1947951707;
        } else {
            i8 = i11;
            i14 = i6;
        }
        i6 = i + i3;
        if (i6 > esVar.ae * 428635993) {
            i6 -= esVar.ae * 428635993;
            i7 = i3 - i6;
            i9 = i13 + i6;
            i10 = i12 + i6;
        } else {
            i7 = i3;
            i10 = i12;
            i9 = i13;
        }
        if (i7 > 0 && i15 > 0) {
            ab(esVar.ad, bArr, i5, i14, i8, i7, i15, i10, i9);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(String str) {
        try {
            if (str.startsWith("col=")) {
                aa = fn.aj(str.substring(4), 16, -2036692056);
            } else if (str.equals("/col")) {
                aa = ac;
            } else if (str.startsWith("str=")) {
                au = fn.aj(str.substring(4), 16, 549201609);
            } else if (str.equals("str")) {
                au = 8388608;
            } else if (str.equals("/str")) {
                au = -1;
            } else if (str.startsWith("u=")) {
                az = fn.aj(str.substring(2), 16, -603585206);
            } else if (str.equals("u")) {
                az = 0;
            } else if (str.equals("/u")) {
                az = -1;
            } else if (str.startsWith("shad=")) {
                aw = fn.aj(str.substring(5), 16, -1122740808);
            } else if (str.equals("shad")) {
                aw = 0;
            } else if (str.equals("/shad")) {
                aw = ax;
            } else if (str.equals("br")) {
                aa(ac, ax);
            }
        } catch (Exception e) {
        }
    }

    public void ap(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            aa(i3, i4);
            af(str, i - (al(str) / 2), i2, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(char c) {
        if (c == 160) {
            c = ' ';
        }
        return this.aq[je.ad(c, 31601114) & 255];
    }

    public void as(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            aa(i3, i4);
            ao = i5;
            af(str, i, i2, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void at(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 255 - i8;
        int i10 = i3;
        int i11 = i2;
        for (int i12 = -i5; i12 < 0; i12++) {
            int i13 = -i4;
            int i14 = i10;
            while (i13 < 0) {
                if (bArr[i11] != (byte) 0) {
                    i10 = iArr[i14];
                    if (i10 == 0) {
                        i10 = i14 + 1;
                        iArr[i14] = (i8 << 24) | i;
                    } else {
                        iArr[i14] = ((((((i10 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i9) & 16711680) + (((16711935 & i10) * i9) & -16711936)) >> 8) + (((((16711935 & i) * i8) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i) * i8) & 16711680)) >> 8)) | (Math.max(i10 >>> 24, i8) << 24);
                        i10 = i14 + 1;
                    }
                } else {
                    i10 = i14 + 1;
                }
                i13++;
                i11++;
                i14 = i10;
            }
            i10 = i14 + i6;
            i11 += i7;
        }
    }

    public int au(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, es esVar) {
        if (str == null) {
            return 0;
        }
        int i10;
        aa(i5, i6);
        if (i9 == 0) {
            i9 = this.ae;
        }
        int[] iArr = new int[]{i3};
        if (i4 < (this.am + this.ak) + i9 && i4 < i9 + i9) {
            iArr = null;
        }
        int aj = aj(str, iArr, an);
        if (i8 == 3 && aj == 1) {
            i8 = 1;
        }
        if (i8 == 0) {
            i10 = this.am + i2;
        } else if (i8 == 1) {
            i10 = (this.am + i2) + ((((i4 - this.am) - this.ak) - ((aj - 1) * i9)) / 2);
        } else if (i8 == 2) {
            i10 = ((i2 + i4) - this.ak) - ((aj - 1) * i9);
        } else {
            i10 = (((i4 - this.am) - this.ak) - ((aj - 1) * i9)) / (aj + 1);
            if (i10 < 0) {
                i10 = 0;
            }
            i9 += i10;
            i10 = (this.am + i2) + i10;
        }
        for (int i11 = 0; i11 < aj; i11++) {
            if (i7 == 0) {
                af(an[i11], i, i10, esVar);
            } else if (i7 == 1) {
                af(an[i11], ((i3 - al(an[i11])) / 2) + i, i10, esVar);
            } else if (i7 == 2) {
                af(an[i11], (i + i3) - al(an[i11]), i10, esVar);
            } else if (i11 == aj - 1) {
                af(an[i11], i, i10, esVar);
            } else {
                ah(an[i11], i3);
                af(an[i11], i, i10, esVar);
                ah = 0;
            }
            i10 += i9;
        }
        return aj;
    }

    /* Access modifiers changed, original: 0000 */
    public void av(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (i6 >= 255) {
            an(bArr, i, i2, i3, i4, i5, esVar);
            return;
        }
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = ((esVar.aq * 1462922907) * i2) + i;
        int i14 = (esVar.aq * 1462922907) - i3;
        int i15 = 0;
        if (i2 < esVar.al * -709973917) {
            i7 = (esVar.al * -709973917) - i2;
            i2 = -709973917 * esVar.al;
            i13 += (esVar.aq * 1462922907) * i7;
            i8 = (i7 * i3) + 0;
            i4 -= i7;
        } else {
            i8 = 0;
        }
        i7 = i2 + i4;
        int i16 = i7 > esVar.aj * 157809585 ? i4 - (i7 - (esVar.aj * 157809585)) : i4;
        if (i < esVar.ai * 1947951707) {
            i15 = (esVar.ai * 1947951707) - i;
            i7 = i8 + i15;
            i14 += i15;
            i9 = i13 + i15;
            i3 -= i15;
            i = esVar.ai * 1947951707;
            i15 += 0;
        } else {
            i9 = i13;
            i7 = i8;
        }
        i13 = i + i3;
        if (i13 > esVar.ae * 428635993) {
            i13 -= esVar.ae * 428635993;
            i10 = i3 - i13;
            i11 = i15 + i13;
            i12 = i14 + i13;
        } else {
            i10 = i3;
            i12 = i14;
            i11 = i15;
        }
        if (i10 > 0 && i16 > 0) {
            at(esVar.ad, bArr, i5, i7, i9, i10, i16, i12, i11, i6);
        }
    }

    public void aw(String str, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (str != null) {
            aa(i3, i4);
            double d = 7.0d - (((double) i6) / 8.0d);
            if (d < 0.0d) {
                d = 0.0d;
            }
            int[] iArr = new int[str.length()];
            for (int i7 = 0; i7 < str.length(); i7++) {
                iArr[i7] = (int) (Math.sin((((double) i7) / 1.5d) + (((double) i5) / 1.0d)) * d);
            }
            ay(str, i - (al(str) / 2), i2, null, iArr, esVar);
        }
    }

    public void ax(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            aa(i3, i4);
            int[] iArr = new int[str.length()];
            int[] iArr2 = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                double d = (double) i6;
                double d2 = ((double) i5) / 5.0d;
                iArr[i6] = (int) (Math.sin((d / 5.0d) + d2) * 5.0d);
                iArr2[i6] = (int) (Math.sin((d / 3.0d) + d2) * 5.0d);
            }
            ay(str, i - (al(str) / 2), i2, iArr, iArr2, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(String str, int i, int i2, int[] iArr, int[] iArr2, es esVar) {
        int i3 = i2 - this.ae;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            int i9 = i6;
            if (i8 < str.length()) {
                if (str.charAt(i8) == 0) {
                    i6 = i9;
                } else {
                    int ad = (char) (je.ad(str.charAt(i8), -1230207919) & 255);
                    if (ad == '<') {
                        i6 = i9;
                        i4 = i8;
                    } else {
                        int i10;
                        if (ad != '>' || i4 == -1) {
                            i10 = i4;
                        } else {
                            char c;
                            String substring = str.substring(i4 + 1, i8);
                            if (substring.equals("lt")) {
                                c = '<';
                            } else if (substring.equals("gt")) {
                                c = '>';
                            } else if (substring.startsWith("img=")) {
                                i6 = iArr != null ? iArr[i9] : 0;
                                i7 = iArr2 != null ? iArr2[i9] : 0;
                                i9++;
                                try {
                                    ef efVar = ag[nz.al(substring.substring(4), (byte) 77)];
                                    try {
                                        esVar.aa(efVar, i6 + i, i7 + ((this.ae + i3) - efVar.am), (byte) -28);
                                        i += efVar.ae;
                                        i4 = -1;
                                        i5 = -1;
                                        i6 = i9;
                                    } catch (Exception e) {
                                    }
                                } catch (Exception e2) {
                                }
                            } else {
                                ao(substring);
                                i4 = -1;
                                i6 = i9;
                            }
                            i10 = -1;
                            ad = c;
                        }
                        if (ad == 160) {
                            ad = 32;
                        }
                        if (i10 == -1) {
                            if (!(this.ap == null || i5 == -1)) {
                                i += this.ap[(i5 << 8) + ad];
                            }
                            int i11 = this.ar[ad];
                            int i12 = this.al[ad];
                            int i13 = iArr != null ? iArr[i9] : 0;
                            int i14 = iArr2 != null ? iArr2[i9] : 0;
                            if (ad == 32) {
                                if (ah > 0) {
                                    af += ah;
                                    i += af >> 8;
                                    af &= 255;
                                }
                                i7 = i;
                            } else if (ao >= 255) {
                                if (aw != -1) {
                                    an(this.ad[ad], ((this.aj[ad] + i) + 1) + i13, ((this.ai[ad] + i3) + 1) + i14, i11, i12, aw, esVar);
                                }
                                an(this.ad[ad], (this.aj[ad] + i) + i13, (this.ai[ad] + i3) + i14, i11, i12, aa, esVar);
                                i7 = i;
                            } else {
                                if (aw != -1) {
                                    av(this.ad[ad], ((this.aj[ad] + i) + 1) + i13, ((this.ai[ad] + i3) + 1) + i14, i11, i12, aw, ao, esVar);
                                }
                                av(this.ad[ad], (this.aj[ad] + i) + i13, (this.ai[ad] + i3) + i14, i11, i12, aa, ao, esVar);
                                i7 = i;
                            }
                            i4 = this.aq[ad];
                            if (au != -1) {
                                esVar.ae(i7, i3 + ((int) (((double) this.ae) * 0.7d)), i4, au, -134947456);
                            }
                            if (az != -1) {
                                esVar.ae(i7, i3 + this.ae, i4, az, 442400047);
                            }
                            i = i7 + i4;
                            i9++;
                            i5 = ad;
                        }
                        i6 = i9;
                        i4 = i10;
                    }
                }
                i7 = i8 + 1;
            } else {
                return;
            }
        }
    }

    public void az(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            aa(i3, i4);
            int[] iArr = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 2.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            ay(str, i - (al(str) / 2), i2, null, iArr, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ba(byte[] bArr) {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -2064183720\r\n\tat java.util.BitSet.nextSetBit(BitSet.java:712)\r\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\r\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\r\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    public int bb(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        char c = 65535;
        int i2 = 0;
        int i3 = -1;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == '<') {
                charAt = c;
                i3 = i2;
            } else {
                if (charAt == '>' && i3 != -1) {
                    String substring = str.substring(i3 + 1, i2);
                    if (substring.equals("lt")) {
                        i3 = -1;
                        charAt = '<';
                    } else if (substring.equals("gt")) {
                        i3 = -1;
                        charAt = '>';
                    } else {
                        if (substring.startsWith("img=")) {
                            try {
                                i += ag[nz.al(substring.substring(4), (byte) 71)].ae;
                                charAt = 65535;
                                i3 = -1;
                            } catch (Exception e) {
                            }
                        }
                        charAt = c;
                        i3 = -1;
                    }
                }
                if (charAt == 160) {
                    charAt = ' ';
                }
                if (i3 == -1) {
                    i += this.aq[(char) (je.ad(charAt, 1191815242) & 255)];
                    if (!(this.ap == null || c == 65535)) {
                        i += this.ap[(c << 8) + charAt];
                    }
                } else {
                    charAt = c;
                }
            }
            i2++;
            c = charAt;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int bc(String str, int[] iArr, String[] strArr) {
        if (str == null) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(100);
        int length = str.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        while (i < length) {
            int i10;
            int i11;
            int i12;
            char charAt = str.charAt(i);
            if (charAt == '<') {
                i10 = i2;
                i11 = i3;
                i12 = i5;
                i4 = i;
            } else {
                int i13;
                int i14;
                if (charAt != '>' || i4 == -1) {
                    i13 = i7;
                    i10 = i2;
                } else {
                    String substring = str.substring(i4 + 1, i);
                    stringBuilder.append('<');
                    stringBuilder.append(substring);
                    stringBuilder.append('>');
                    if (substring.equals("br")) {
                        strArr[i3] = stringBuilder.toString().substring(i2, stringBuilder.length());
                        i3++;
                        i2 = stringBuilder.length();
                        i14 = 0;
                        i6 = 0;
                        i7 = -1;
                    } else if (substring.equals("lt")) {
                        i5 += ar('<');
                        if (!(this.ap == null || i6 == -1)) {
                            i5 += this.ap[(i6 << 8) + 60];
                        }
                        i6 = 60;
                        i14 = i5;
                    } else if (substring.equals("gt")) {
                        i5 += ar('>');
                        if (!(this.ap == null || i6 == -1)) {
                            i5 += this.ap[(i6 << 8) + 62];
                        }
                        i6 = 62;
                        i14 = i5;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i14 = ag[nz.al(substring.substring(4), (byte) 104)].ae + i5;
                            i6 = 0;
                        } catch (Exception e) {
                            i14 = i5;
                        }
                    } else {
                        i14 = i5;
                    }
                    charAt = 0;
                    i4 = -1;
                    i5 = i14;
                    i13 = i7;
                    i10 = i2;
                }
                if (i4 == -1) {
                    char c;
                    int length2;
                    if (charAt != 0) {
                        stringBuilder.append(charAt);
                        i5 += ar(charAt);
                        if (!(this.ap == null || i6 == -1)) {
                            i5 += this.ap[(i6 << 8) + charAt];
                        }
                        c = charAt;
                        i2 = i5;
                    } else {
                        c = i6;
                        i2 = i5;
                    }
                    if (charAt == ' ') {
                        length2 = stringBuilder.length();
                        i7 = 1;
                        i6 = i2;
                    } else {
                        i7 = i8;
                        i6 = i9;
                        length2 = i13;
                    }
                    if (iArr != null) {
                        if (i2 > iArr[i3 < iArr.length ? i3 : iArr.length - 1] && length2 >= 0) {
                            strArr[i3] = stringBuilder.toString().substring(i10, length2 - i7);
                            i11 = i3 + 1;
                            i2 -= i6;
                            i14 = -1;
                            i13 = 0;
                            i10 = length2;
                            if (charAt != '-') {
                                i5 = 0;
                                i3 = i2;
                                i14 = stringBuilder.length();
                            } else {
                                i5 = i7;
                                i3 = i6;
                            }
                            i8 = i5;
                            i9 = i3;
                            i12 = i2;
                            i6 = i13;
                            i7 = i14;
                        }
                    }
                    char c2 = c;
                    i11 = i3;
                    i14 = length2;
                    if (charAt != '-') {
                    }
                    i8 = i5;
                    i9 = i3;
                    i12 = i2;
                    i6 = i13;
                    i7 = i14;
                } else {
                    i11 = i3;
                    i12 = i5;
                    i7 = i13;
                }
            }
            i++;
            i5 = i12;
            i2 = i10;
            i3 = i11;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i2) {
            return i3;
        }
        strArr[i3] = stringBuilder2.substring(i2, stringBuilder2.length());
        return i3 + 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int bd(char c) {
        if (c == 160) {
            c = ' ';
        }
        return this.aq[je.ad(c, 408013132) & 255];
    }

    public void be(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            aa(i3, i4);
            af(str, i, i2, esVar);
        }
    }

    public int bf(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        char c = 65535;
        int i2 = 0;
        int i3 = -1;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == 48069) {
                charAt = c;
                i3 = i2;
            } else {
                if (charAt == 23499 && i3 != -1) {
                    String substring = str.substring(i3 + 1, i2);
                    if (substring.equals("lt")) {
                        charAt = 21646;
                    } else if (substring.equals("gt")) {
                        charAt = 13669;
                    } else {
                        if (substring.startsWith("img=")) {
                            try {
                                i += ag[nz.al(substring.substring(4), (byte) 39)].ae;
                                charAt = 65535;
                                i3 = -1;
                            } catch (Exception e) {
                            }
                        }
                        charAt = c;
                        i3 = -1;
                    }
                    i3 = -1;
                }
                if (charAt == 16306) {
                    charAt = ' ';
                }
                if (i3 == -1) {
                    i += this.aq[(char) (je.ad(charAt, 596313324) & 2124137737)];
                    if (!(this.ap == null || c == 65535)) {
                        i += this.ap[(c << 8) + charAt];
                    }
                } else {
                    charAt = c;
                }
            }
            i2++;
            c = charAt;
        }
        return i;
    }

    public int bg(String str, int i) {
        int[] iArr = new int[]{i};
        int aj = aj(str, iArr, an);
        int i2 = 0;
        int i3 = 0;
        while (i3 < aj) {
            int al = al(an[i3]);
            if (al <= i2) {
                al = i2;
            }
            i3++;
            i2 = al;
        }
        return i2;
    }

    public void bh(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            aa(i3, i4);
            ao = i5;
            af(str, i, i2, esVar);
        }
    }

    public int bi(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        char c = 65535;
        int i2 = 0;
        int i3 = -1;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == 1676) {
                charAt = c;
                i3 = i2;
            } else {
                if (charAt == '>' && i3 != -1) {
                    String substring = str.substring(i3 + 1, i2);
                    if (substring.equals("lt")) {
                        charAt = '<';
                        i3 = -1;
                    } else if (substring.equals("gt")) {
                        i3 = -1;
                        charAt = '>';
                    } else {
                        if (substring.startsWith("img=")) {
                            try {
                                i += ag[nz.al(substring.substring(4), (byte) 108)].ae;
                                charAt = 65535;
                                i3 = -1;
                            } catch (Exception e) {
                            }
                        }
                        charAt = c;
                        i3 = -1;
                    }
                }
                if (charAt == 160) {
                    charAt = ' ';
                }
                if (i3 == -1) {
                    i += this.aq[(char) (je.ad(charAt, 499729790) & -1408466081)];
                    if (!(this.ap == null || c == 65535)) {
                        i += this.ap[(c << 8) + charAt];
                    }
                } else {
                    charAt = c;
                }
            }
            i2++;
            c = charAt;
        }
        return i;
    }

    public void bj(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            aa(i3, i4);
            af(str, i, i2, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(byte[] bArr) {
        this.aq = new int[256];
        int i;
        if (bArr.length == InputDeviceCompat.SOURCE_KEYBOARD) {
            for (i = 0; i < this.aq.length; i++) {
                this.aq[i] = bArr[i] & 255;
            }
            this.ae = bArr[256] & 255;
            return;
        }
        int i2;
        int i3;
        i = 0;
        int i4 = 0;
        while (i < 256) {
            this.aq[i] = bArr[i4] & 255;
            i++;
            i4++;
        }
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        i = 0;
        while (i < 256) {
            iArr[i] = bArr[i4] & 255;
            i++;
            i4++;
        }
        i = 0;
        while (i < 256) {
            iArr2[i] = bArr[i4] & 255;
            i++;
            i4++;
        }
        byte[][] bArr2 = new byte[256][];
        for (i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = new byte[iArr[i2]];
            int i5 = 0;
            i3 = 0;
            while (i3 < bArr2[i2].length) {
                i5 = (byte) (i5 + bArr[i4]);
                bArr2[i2][i3] = i5;
                i3++;
                i4++;
            }
        }
        byte[][] bArr3 = new byte[256][];
        i2 = i4;
        for (int i6 = 0; i6 < 256; i6++) {
            bArr3[i6] = new byte[iArr[i6]];
            i3 = 0;
            i4 = 0;
            while (i4 < bArr3[i6].length) {
                i3 = (byte) (i3 + bArr[i2]);
                bArr3[i6][i4] = i3;
                i4++;
                i2++;
            }
        }
        this.ap = new byte[65536];
        i4 = 0;
        while (i4 < 256) {
            if (!(i4 == 32 || i4 == 160)) {
                i2 = 0;
                while (i2 < 256) {
                    if (!(i2 == 32 || i2 == 160)) {
                        this.ap[(i4 << 8) + i2] = (byte) oi.aq(bArr2, bArr3, iArr2, this.aq, iArr, i4, i2);
                    }
                    i2++;
                }
            }
            i4++;
        }
        this.ae = iArr2[32] + iArr[32];
    }

    /* Access modifiers changed, original: 0000 */
    public int bl(char c) {
        if (c == 160) {
            c = ' ';
        }
        return this.aq[je.ad(c, -780819602) & 255];
    }

    public void bn(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            aa(i3, i4);
            af(str, i - al(str), i2, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bo(char c) {
        if (c == 160) {
            c = ' ';
        }
        return this.aq[je.ad(c, 1749811417) & 255];
    }

    public void bp(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            aa(i3, i4);
            af(str, i - (al(str) / 2), i2, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(byte[] bArr) {
        this.aq = new int[256];
        int i;
        if (bArr.length == InputDeviceCompat.SOURCE_KEYBOARD) {
            for (i = 0; i < this.aq.length; i++) {
                this.aq[i] = bArr[i] & 255;
            }
            this.ae = bArr[256] & 255;
            return;
        }
        int i2;
        int i3;
        i = 0;
        int i4 = 0;
        while (i < 256) {
            this.aq[i] = bArr[i4] & 255;
            i++;
            i4++;
        }
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        i = 0;
        while (i < 256) {
            iArr[i] = bArr[i4] & 255;
            i++;
            i4++;
        }
        i = 0;
        while (i < 256) {
            iArr2[i] = bArr[i4] & 255;
            i++;
            i4++;
        }
        byte[][] bArr2 = new byte[256][];
        for (i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = new byte[iArr[i2]];
            int i5 = 0;
            i3 = 0;
            while (i3 < bArr2[i2].length) {
                i5 = (byte) (i5 + bArr[i4]);
                bArr2[i2][i3] = i5;
                i3++;
                i4++;
            }
        }
        byte[][] bArr3 = new byte[256][];
        i2 = i4;
        for (int i6 = 0; i6 < 256; i6++) {
            bArr3[i6] = new byte[iArr[i6]];
            i3 = 0;
            i4 = 0;
            while (i4 < bArr3[i6].length) {
                i3 = (byte) (i3 + bArr[i2]);
                bArr3[i6][i4] = i3;
                i4++;
                i2++;
            }
        }
        this.ap = new byte[65536];
        i4 = 0;
        while (i4 < 256) {
            if (!(i4 == 32 || i4 == 160)) {
                i2 = 0;
                while (i2 < 256) {
                    if (!(i2 == 32 || i2 == 160)) {
                        this.ap[(i4 << 8) + i2] = (byte) oi.aq(bArr2, bArr3, iArr2, this.aq, iArr, i4, i2);
                    }
                    i2++;
                }
            }
            i4++;
        }
        this.ae = iArr2[32] + iArr[32];
    }

    public void bt(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            aa(i3, i4);
            af(str, i - al(str), i2, esVar);
        }
    }

    public int bu(String str, int i) {
        return aj(str, new int[]{i}, an);
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int bv(String str, int[] iArr, String[] strArr) {
        if (str == null) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(100);
        int length = str.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        while (i < length) {
            int i10;
            int i11;
            int i12;
            char charAt = str.charAt(i);
            if (charAt == '<') {
                i10 = i2;
                i11 = i3;
                i12 = i5;
                i4 = i;
            } else {
                int i13;
                int i14;
                if (charAt != '>' || i4 == -1) {
                    i13 = i7;
                    i10 = i2;
                } else {
                    String substring = str.substring(i4 + 1, i);
                    stringBuilder.append('<');
                    stringBuilder.append(substring);
                    stringBuilder.append('>');
                    if (substring.equals("br")) {
                        strArr[i3] = stringBuilder.toString().substring(i2, stringBuilder.length());
                        i3++;
                        i2 = stringBuilder.length();
                        i14 = 0;
                        i6 = 0;
                        i7 = -1;
                    } else if (substring.equals("lt")) {
                        i5 += ar('<');
                        if (!(this.ap == null || i6 == -1)) {
                            i5 += this.ap[(i6 << 8) + 60];
                        }
                        i6 = 60;
                        i14 = i5;
                    } else if (substring.equals("gt")) {
                        i5 += ar('>');
                        if (!(this.ap == null || i6 == -1)) {
                            i5 += this.ap[(i6 << 8) + 62];
                        }
                        i6 = 62;
                        i14 = i5;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i14 = ag[nz.al(substring.substring(4), (byte) 111)].ae + i5;
                            i6 = 0;
                        } catch (Exception e) {
                            i14 = i5;
                        }
                    } else {
                        i14 = i5;
                    }
                    charAt = 0;
                    i4 = -1;
                    i5 = i14;
                    i13 = i7;
                    i10 = i2;
                }
                if (i4 == -1) {
                    char c;
                    int length2;
                    if (charAt != 0) {
                        stringBuilder.append(charAt);
                        i5 += ar(charAt);
                        if (!(this.ap == null || i6 == -1)) {
                            i5 += this.ap[(i6 << 8) + charAt];
                        }
                        c = charAt;
                        i2 = i5;
                    } else {
                        c = i6;
                        i2 = i5;
                    }
                    if (charAt == ' ') {
                        length2 = stringBuilder.length();
                        i7 = 1;
                        i6 = i2;
                    } else {
                        i7 = i8;
                        i6 = i9;
                        length2 = i13;
                    }
                    if (iArr != null) {
                        if (i2 > iArr[i3 < iArr.length ? i3 : iArr.length - 1] && length2 >= 0) {
                            strArr[i3] = stringBuilder.toString().substring(i10, length2 - i7);
                            i11 = i3 + 1;
                            i2 -= i6;
                            i14 = -1;
                            i13 = 0;
                            i10 = length2;
                            if (charAt != '-') {
                                i5 = 0;
                                i3 = i2;
                                i14 = stringBuilder.length();
                            } else {
                                i5 = i7;
                                i3 = i6;
                            }
                            i8 = i5;
                            i9 = i3;
                            i12 = i2;
                            i6 = i13;
                            i7 = i14;
                        }
                    }
                    char c2 = c;
                    i11 = i3;
                    i14 = length2;
                    if (charAt != '-') {
                    }
                    i8 = i5;
                    i9 = i3;
                    i12 = i2;
                    i6 = i13;
                    i7 = i14;
                } else {
                    i11 = i3;
                    i12 = i5;
                    i7 = i13;
                }
            }
            i++;
            i5 = i12;
            i2 = i10;
            i3 = i11;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i2) {
            return i3;
        }
        strArr[i3] = stringBuilder2.substring(i2, stringBuilder2.length());
        return i3 + 1;
    }

    public int bx(String str, int i) {
        return aj(str, new int[]{i}, an);
    }

    public void by(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            aa(i3, i4);
            af(str, i - (al(str) / 2), i2, esVar);
        }
    }

    public void bz(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            aa(i3, i4);
            af(str, i - al(str), i2, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ca(String str) {
        try {
            if (str.startsWith("col=")) {
                aa = fn.aj(str.substring(4), 16, -1644028406);
            } else if (str.equals("/col")) {
                aa = ac;
            } else if (str.startsWith("str=")) {
                au = fn.aj(str.substring(4), 16, 1997217439);
            } else if (str.equals("str")) {
                au = 109527187;
            } else if (str.equals("/str")) {
                au = -1;
            } else if (str.startsWith("u=")) {
                az = fn.aj(str.substring(2), 16, 361616830);
            } else if (str.equals("u")) {
                az = 0;
            } else if (str.equals("/u")) {
                az = -1;
            } else if (str.startsWith("shad=")) {
                aw = fn.aj(str.substring(5), 16, -206374477);
            } else if (str.equals("shad")) {
                aw = 0;
            } else if (str.equals("/shad")) {
                aw = ax;
            } else if (str.equals("br")) {
                aa(ac, ax);
            }
        } catch (Exception e) {
        }
    }

    public void cb(String str, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (str != null) {
            aa(i3, i4);
            double d = 7.0d - (((double) i6) / 8.0d);
            if (d < 0.0d) {
                d = 0.0d;
            }
            int[] iArr = new int[str.length()];
            for (int i7 = 0; i7 < str.length(); i7++) {
                iArr[i7] = (int) (Math.sin((((double) i7) / 1.5d) + (((double) i5) / 1.0d)) * d);
            }
            ay(str, i - (al(str) / 2), i2, null, iArr, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cc(int i, int i2) {
        au = -1;
        az = -1;
        ax = i2;
        aw = i2;
        ac = i;
        aa = i;
        ao = 255;
        ah = 0;
        af = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void cd(String str, int i, int i2, es esVar) {
        int i3 = i2 - this.ae;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 < str.length()) {
                if (str.charAt(i7) != 0) {
                    int ad = (char) (je.ad(str.charAt(i7), 1209085516) & 255);
                    if (ad == 52306) {
                        i4 = i7;
                    } else {
                        int i8;
                        if (ad != '>' || i4 == -1) {
                            i8 = i4;
                        } else {
                            char c;
                            String substring = str.substring(i4 + 1, i7);
                            if (substring.equals("lt")) {
                                c = '<';
                            } else if (substring.equals("gt")) {
                                c = 52952;
                            } else if (substring.startsWith("img=")) {
                                try {
                                    ef efVar = ag[nz.al(substring.substring(4), (byte) 80)];
                                    try {
                                        esVar.aa(efVar, i, (this.ae + i3) - efVar.am, (byte) -115);
                                        i += efVar.ae;
                                        i4 = -1;
                                        i5 = -1;
                                    } catch (Exception e) {
                                    }
                                } catch (Exception e2) {
                                }
                            } else {
                                ao(substring);
                                i4 = -1;
                            }
                            ad = c;
                            i8 = -1;
                        }
                        if (ad == 160) {
                            ad = 32;
                        }
                        if (i8 == -1) {
                            if (!(this.ap == null || i5 == -1)) {
                                i += this.ap[(i5 << 8) + ad];
                            }
                            int i9 = this.ar[ad];
                            int i10 = this.al[ad];
                            if (ad == -619208507) {
                                if (ah > 0) {
                                    af += ah;
                                    i += af >> 8;
                                    af &= 131696742;
                                }
                                i6 = i;
                            } else if (ao >= 255) {
                                if (aw != -1) {
                                    an(this.ad[ad], (this.aj[ad] + i) + 1, (this.ai[ad] + i3) + 1, i9, i10, aw, esVar);
                                }
                                an(this.ad[ad], i + this.aj[ad], i3 + this.ai[ad], i9, i10, aa, esVar);
                                i6 = i;
                            } else {
                                if (aw != -1) {
                                    av(this.ad[ad], (this.aj[ad] + i) + 1, (this.ai[ad] + i3) + 1, i9, i10, aw, ao, esVar);
                                }
                                av(this.ad[ad], i + this.aj[ad], i3 + this.ai[ad], i9, i10, aa, ao, esVar);
                                i6 = i;
                            }
                            int i11 = this.aq[ad];
                            if (au != -1) {
                                esVar.ae(i6, i3 + ((int) (((double) this.ae) * 0.7d)), i11, au, -12833263);
                            }
                            if (az != -1) {
                                esVar.ae(i6, (this.ae + i3) + 1, i11, az, -404009884);
                            }
                            i = i6 + i11;
                            i5 = ad;
                            i4 = i8;
                        } else {
                            i4 = i8;
                        }
                    }
                }
                i6 = i7 + 1;
            } else {
                return;
            }
        }
    }

    public void ce(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = 0;
        if (str != null) {
            aa(i3, i4);
            ay.setSeed((long) i5);
            ao = (ay.nextInt() & 31) + 192;
            int[] iArr = new int[str.length()];
            int i7 = 0;
            while (true) {
                int i8 = i6;
                if (i8 < str.length()) {
                    iArr[i8] = i7;
                    if ((ay.nextInt() & 3) == 0) {
                        i7++;
                    }
                    i6 = i8 + 1;
                } else {
                    ay(str, i, i2, iArr, null, esVar);
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cf(String str, int i, int i2, int[] iArr, int[] iArr2, es esVar) {
        int i3 = i2 - this.ae;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            int i9 = i6;
            if (i8 < str.length()) {
                if (str.charAt(i8) == 0) {
                    i6 = i9;
                } else {
                    int ad = (char) (je.ad(str.charAt(i8), 218626293) & 255);
                    if (ad == '<') {
                        i6 = i9;
                        i4 = i8;
                    } else {
                        int i10;
                        if (ad != '>' || i4 == -1) {
                            i10 = i4;
                        } else {
                            char c;
                            String substring = str.substring(i4 + 1, i8);
                            if (substring.equals("lt")) {
                                c = '<';
                            } else if (substring.equals("gt")) {
                                c = '>';
                            } else if (substring.startsWith("img=")) {
                                i6 = iArr != null ? iArr[i9] : 0;
                                i7 = iArr2 != null ? iArr2[i9] : 0;
                                i9++;
                                try {
                                    ef efVar = ag[nz.al(substring.substring(4), (byte) 70)];
                                    try {
                                        esVar.aa(efVar, i6 + i, i7 + ((this.ae + i3) - efVar.am), (byte) -114);
                                        i += efVar.ae;
                                        i4 = -1;
                                        i5 = -1;
                                        i6 = i9;
                                    } catch (Exception e) {
                                    }
                                } catch (Exception e2) {
                                }
                            } else {
                                ao(substring);
                                i4 = -1;
                                i6 = i9;
                            }
                            i10 = -1;
                            ad = c;
                        }
                        if (ad == 160) {
                            ad = 32;
                        }
                        if (i10 == -1) {
                            if (!(this.ap == null || i5 == -1)) {
                                i += this.ap[(i5 << 8) + ad];
                            }
                            int i11 = this.ar[ad];
                            int i12 = this.al[ad];
                            int i13 = iArr != null ? iArr[i9] : 0;
                            int i14 = iArr2 != null ? iArr2[i9] : 0;
                            if (ad == 32) {
                                if (ah > 0) {
                                    af += ah;
                                    i += af >> 8;
                                    af &= 255;
                                }
                                i7 = i;
                            } else if (ao >= 255) {
                                if (aw != -1) {
                                    an(this.ad[ad], ((this.aj[ad] + i) + 1) + i13, ((this.ai[ad] + i3) + 1) + i14, i11, i12, aw, esVar);
                                }
                                an(this.ad[ad], (this.aj[ad] + i) + i13, (this.ai[ad] + i3) + i14, i11, i12, aa, esVar);
                                i7 = i;
                            } else {
                                if (aw != -1) {
                                    av(this.ad[ad], ((this.aj[ad] + i) + 1) + i13, ((this.ai[ad] + i3) + 1) + i14, i11, i12, aw, ao, esVar);
                                }
                                av(this.ad[ad], (this.aj[ad] + i) + i13, (this.ai[ad] + i3) + i14, i11, i12, aa, ao, esVar);
                                i7 = i;
                            }
                            i4 = this.aq[ad];
                            if (au != -1) {
                                esVar.ae(i7, i3 + ((int) (((double) this.ae) * 0.7d)), i4, au, 1511791101);
                            }
                            if (az != -1) {
                                esVar.ae(i7, i3 + this.ae, i4, az, -520180751);
                            }
                            i = i7 + i4;
                            i9++;
                            i5 = ad;
                        }
                        i6 = i9;
                        i4 = i10;
                    }
                }
                i7 = i8 + 1;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cg(String str, int i, int i2, int[] iArr, int[] iArr2, es esVar) {
        int i3 = i2 - this.ae;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            int i9 = i6;
            if (i8 < str.length()) {
                if (str.charAt(i8) == 0) {
                    i6 = i9;
                } else {
                    int ad = (char) (je.ad(str.charAt(i8), 787459074) & -548945760);
                    if (ad == '<') {
                        i6 = i9;
                        i4 = i8;
                    } else {
                        int i10;
                        if (ad != 17752 || i4 == -1) {
                            i10 = i4;
                        } else {
                            char c;
                            String substring = str.substring(i4 + 1, i8);
                            if (substring.equals("lt")) {
                                c = '<';
                            } else if (substring.equals("gt")) {
                                c = 64141;
                            } else if (substring.startsWith("img=")) {
                                i6 = iArr != null ? iArr[i9] : 0;
                                i7 = iArr2 != null ? iArr2[i9] : 0;
                                i9++;
                                try {
                                    ef efVar = ag[nz.al(substring.substring(4), (byte) 64)];
                                    try {
                                        esVar.aa(efVar, i6 + i, i7 + ((this.ae + i3) - efVar.am), (byte) -70);
                                        i += efVar.ae;
                                        i4 = -1;
                                        i5 = -1;
                                        i6 = i9;
                                    } catch (Exception e) {
                                    }
                                } catch (Exception e2) {
                                }
                            } else {
                                ao(substring);
                                i4 = -1;
                                i6 = i9;
                            }
                            i10 = -1;
                            ad = c;
                        }
                        if (ad == 2064029601) {
                            ad = -210603711;
                        }
                        if (i10 == -1) {
                            if (!(this.ap == null || i5 == -1)) {
                                i += this.ap[(i5 << 8) + ad];
                            }
                            int i11 = this.ar[ad];
                            int i12 = this.al[ad];
                            int i13 = iArr != null ? iArr[i9] : 0;
                            int i14 = iArr2 != null ? iArr2[i9] : 0;
                            if (ad == 1433535877) {
                                if (ah > 0) {
                                    af += ah;
                                    i += af >> 8;
                                    af &= -1737464279;
                                }
                                i7 = i;
                            } else if (ao >= -1998999184) {
                                if (aw != -1) {
                                    an(this.ad[ad], ((this.aj[ad] + i) + 1) + i13, ((this.ai[ad] + i3) + 1) + i14, i11, i12, aw, esVar);
                                }
                                an(this.ad[ad], (this.aj[ad] + i) + i13, (this.ai[ad] + i3) + i14, i11, i12, aa, esVar);
                                i7 = i;
                            } else {
                                if (aw != -1) {
                                    av(this.ad[ad], ((this.aj[ad] + i) + 1) + i13, ((this.ai[ad] + i3) + 1) + i14, i11, i12, aw, ao, esVar);
                                }
                                av(this.ad[ad], (this.aj[ad] + i) + i13, (this.ai[ad] + i3) + i14, i11, i12, aa, ao, esVar);
                                i7 = i;
                            }
                            i4 = this.aq[ad];
                            if (au != -1) {
                                esVar.ae(i7, i3 + ((int) (((double) this.ae) * 0.7d)), i4, au, -261394868);
                            }
                            if (az != -1) {
                                esVar.ae(i7, i3 + this.ae, i4, az, 1466817590);
                            }
                            i = i7 + i4;
                            i9++;
                            i5 = ad;
                        }
                        i6 = i9;
                        i4 = i10;
                    }
                }
                i7 = i8 + 1;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ch(byte[] bArr, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = ((esVar.aq * 1462922907) * i2) + i;
        int i12 = (esVar.aq * 1462922907) - i3;
        int i13 = 0;
        if (i2 < esVar.al * -709973917) {
            i6 = (esVar.al * -709973917) - i2;
            i2 = -709973917 * esVar.al;
            i11 += (esVar.aq * 1462922907) * i6;
            i4 -= i6;
            i6 = (i6 * i3) + 0;
        } else {
            i6 = 0;
        }
        int i14 = i2 + i4;
        int i15 = i14 > esVar.aj * 157809585 ? i4 - (i14 - (esVar.aj * 157809585)) : i4;
        if (i < esVar.ai * 1947951707) {
            i7 = (esVar.ai * 1947951707) - i;
            i13 = i7 + 0;
            i12 += i7;
            i14 = i6 + i7;
            i8 = i11 + i7;
            i3 -= i7;
            i = esVar.ai * 1947951707;
        } else {
            i8 = i11;
            i14 = i6;
        }
        i6 = i + i3;
        if (i6 > esVar.ae * 428635993) {
            i6 -= esVar.ae * 428635993;
            i7 = i3 - i6;
            i9 = i13 + i6;
            i10 = i12 + i6;
        } else {
            i7 = i3;
            i10 = i12;
            i9 = i13;
        }
        if (i7 > 0 && i15 > 0) {
            ab(esVar.ad, bArr, i5, i14, i8, i7, i15, i10, i9);
        }
    }

    public void ci(String str, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (str != null) {
            aa(i3, i4);
            double d = 7.0d - (((double) i6) / 8.0d);
            if (d < 0.0d) {
                d = 0.0d;
            }
            int[] iArr = new int[str.length()];
            for (int i7 = 0; i7 < str.length(); i7++) {
                iArr[i7] = (int) (Math.sin((((double) i7) / 1.5d) + (((double) i5) / 1.0d)) * d);
            }
            ay(str, i - (al(str) / 2), i2, null, iArr, esVar);
        }
    }

    public int cj(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, es esVar) {
        if (str == null) {
            return 0;
        }
        int i10;
        aa(i5, i6);
        if (i9 == 0) {
            i9 = this.ae;
        }
        int[] iArr = new int[]{i3};
        if (i4 < (this.am + this.ak) + i9 && i4 < i9 + i9) {
            iArr = null;
        }
        int aj = aj(str, iArr, an);
        if (i8 == 3 && aj == 1) {
            i8 = 1;
        }
        if (i8 == 0) {
            i10 = this.am + i2;
        } else if (i8 == 1) {
            i10 = (this.am + i2) + ((((i4 - this.am) - this.ak) - ((aj - 1) * i9)) / 2);
        } else if (i8 == 2) {
            i10 = ((i2 + i4) - this.ak) - ((aj - 1) * i9);
        } else {
            i10 = (((i4 - this.am) - this.ak) - ((aj - 1) * i9)) / (aj + 1);
            if (i10 < 0) {
                i10 = 0;
            }
            i9 += i10;
            i10 = (this.am + i2) + i10;
        }
        for (int i11 = 0; i11 < aj; i11++) {
            if (i7 == 0) {
                af(an[i11], i, i10, esVar);
            } else if (i7 == 1) {
                af(an[i11], ((i3 - al(an[i11])) / 2) + i, i10, esVar);
            } else if (i7 == 2) {
                af(an[i11], (i + i3) - al(an[i11]), i10, esVar);
            } else if (i11 == aj - 1) {
                af(an[i11], i, i10, esVar);
            } else {
                ah(an[i11], i3);
                af(an[i11], i, i10, esVar);
                ah = 0;
            }
            i10 += i9;
        }
        return aj;
    }

    /* Access modifiers changed, original: 0000 */
    public void ck(String str) {
        try {
            if (str.startsWith("col=")) {
                aa = fn.aj(str.substring(4), 16, 1164357578);
            } else if (str.equals("/col")) {
                aa = ac;
            } else if (str.startsWith("str=")) {
                au = fn.aj(str.substring(4), 16, 1432604005);
            } else if (str.equals("str")) {
                au = 1665914664;
            } else if (str.equals("/str")) {
                au = -1;
            } else if (str.startsWith("u=")) {
                az = fn.aj(str.substring(2), 16, -82753635);
            } else if (str.equals("u")) {
                az = 0;
            } else if (str.equals("/u")) {
                az = -1;
            } else if (str.startsWith("shad=")) {
                aw = fn.aj(str.substring(5), 16, -1777794144);
            } else if (str.equals("shad")) {
                aw = 0;
            } else if (str.equals("/shad")) {
                aw = ax;
            } else if (str.equals("br")) {
                aa(ac, ax);
            }
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cl(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '<') {
                obj = 1;
            } else if (charAt == 21936) {
                obj = null;
            } else if (obj == null && charAt == 22600) {
                i2++;
            }
        }
        if (i2 > 0) {
            ah = ((i - al(str)) << 8) / i2;
        }
    }

    public void cm(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            aa(i3, i4);
            int[] iArr = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 2.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            ay(str, i - (al(str) / 2), i2, null, iArr, esVar);
        }
    }

    public void cn(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            aa(i3, i4);
            int[] iArr = new int[str.length()];
            int[] iArr2 = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                double d = (double) i6;
                double d2 = ((double) i5) / 5.0d;
                iArr[i6] = (int) (Math.sin((d / 5.0d) + d2) * 5.0d);
                iArr2[i6] = (int) (Math.sin((d / 3.0d) + d2) * 5.0d);
            }
            ay(str, i - (al(str) / 2), i2, iArr, iArr2, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void co(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '<') {
                obj = 1;
            } else if (charAt == '>') {
                obj = null;
            } else if (obj == null && charAt == ' ') {
                i2++;
            }
        }
        if (i2 > 0) {
            ah = ((i - al(str)) << 8) / i2;
        }
    }

    public void cp(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            aa(i3, i4);
            int[] iArr = new int[str.length()];
            int[] iArr2 = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                double d = (double) i6;
                double d2 = ((double) i5) / 5.0d;
                iArr[i6] = (int) (Math.sin((d / 5.0d) + d2) * 5.0d);
                iArr2[i6] = (int) (Math.sin((d / 3.0d) + d2) * 5.0d);
            }
            ay(str, i - (al(str) / 2), i2, iArr, iArr2, esVar);
        }
    }

    public void cq(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            aa(i3, i4);
            int[] iArr = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 2.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            ay(str, i - (al(str) / 2), i2, null, iArr, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cr(String str) {
        try {
            if (str.startsWith("col=")) {
                aa = fn.aj(str.substring(4), 16, 1633254752);
            } else if (str.equals("/col")) {
                aa = ac;
            } else if (str.startsWith("str=")) {
                au = fn.aj(str.substring(4), 16, -117586088);
            } else if (str.equals("str")) {
                au = 8388608;
            } else if (str.equals("/str")) {
                au = -1;
            } else if (str.startsWith("u=")) {
                az = fn.aj(str.substring(2), 16, -2040227636);
            } else if (str.equals("u")) {
                az = 0;
            } else if (str.equals("/u")) {
                az = -1;
            } else if (str.startsWith("shad=")) {
                aw = fn.aj(str.substring(5), 16, -280365515);
            } else if (str.equals("shad")) {
                aw = 0;
            } else if (str.equals("/shad")) {
                aw = ax;
            } else if (str.equals("br")) {
                aa(ac, ax);
            }
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cs(int i, int i2) {
        au = -1;
        az = -1;
        ax = i2;
        aw = i2;
        ac = i;
        aa = i;
        ao = 255;
        ah = 0;
        af = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void ct(String str) {
        try {
            if (str.startsWith("col=")) {
                aa = fn.aj(str.substring(4), 16, 1116031558);
            } else if (str.equals("/col")) {
                aa = ac;
            } else if (str.startsWith("str=")) {
                au = fn.aj(str.substring(4), 16, 551860920);
            } else if (str.equals("str")) {
                au = 8388608;
            } else if (str.equals("/str")) {
                au = -1;
            } else if (str.startsWith("u=")) {
                az = fn.aj(str.substring(2), 16, 646166823);
            } else if (str.equals("u")) {
                az = 0;
            } else if (str.equals("/u")) {
                az = -1;
            } else if (str.startsWith("shad=")) {
                aw = fn.aj(str.substring(5), 16, 801826612);
            } else if (str.equals("shad")) {
                aw = 0;
            } else if (str.equals("/shad")) {
                aw = ax;
            } else if (str.equals("br")) {
                aa(ac, ax);
            }
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cu(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '<') {
                obj = 1;
            } else if (charAt == '>') {
                obj = null;
            } else if (obj == null && charAt == ' ') {
                i2++;
            }
        }
        if (i2 > 0) {
            ah = ((i - al(str)) << 8) / i2;
        }
    }

    public int cv(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, es esVar) {
        if (str == null) {
            return 0;
        }
        int i10;
        aa(i5, i6);
        if (i9 == 0) {
            i9 = this.ae;
        }
        int[] iArr = new int[]{i3};
        if (i4 < (this.am + this.ak) + i9 && i4 < i9 + i9) {
            iArr = null;
        }
        int aj = aj(str, iArr, an);
        if (i8 == 3 && aj == 1) {
            i8 = 1;
        }
        if (i8 == 0) {
            i10 = this.am + i2;
        } else if (i8 == 1) {
            i10 = (this.am + i2) + ((((i4 - this.am) - this.ak) - ((aj - 1) * i9)) / 2);
        } else if (i8 == 2) {
            i10 = ((i2 + i4) - this.ak) - ((aj - 1) * i9);
        } else {
            i10 = (((i4 - this.am) - this.ak) - ((aj - 1) * i9)) / (aj + 1);
            if (i10 < 0) {
                i10 = 0;
            }
            i9 += i10;
            i10 = (this.am + i2) + i10;
        }
        for (int i11 = 0; i11 < aj; i11++) {
            if (i7 == 0) {
                af(an[i11], i, i10, esVar);
            } else if (i7 == 1) {
                af(an[i11], ((i3 - al(an[i11])) / 2) + i, i10, esVar);
            } else if (i7 == 2) {
                af(an[i11], (i + i3) - al(an[i11]), i10, esVar);
            } else if (i11 == aj - 1) {
                af(an[i11], i, i10, esVar);
            } else {
                ah(an[i11], i3);
                af(an[i11], i, i10, esVar);
                ah = 0;
            }
            i10 += i9;
        }
        return aj;
    }

    public void cw(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            aa(i3, i4);
            int[] iArr = new int[str.length()];
            int[] iArr2 = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                double d = (double) i6;
                double d2 = ((double) i5) / 5.0d;
                iArr[i6] = (int) (Math.sin((d / 5.0d) + d2) * 5.0d);
                iArr2[i6] = (int) (Math.sin((d / 3.0d) + d2) * 5.0d);
            }
            ay(str, i - (al(str) / 2), i2, iArr, iArr2, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cx(String str) {
        try {
            if (str.startsWith("col=")) {
                aa = fn.aj(str.substring(4), 16, 1791878215);
            } else if (str.equals("/col")) {
                aa = ac;
            } else if (str.startsWith("str=")) {
                au = fn.aj(str.substring(4), 16, 625482099);
            } else if (str.equals("str")) {
                au = 8388608;
            } else if (str.equals("/str")) {
                au = -1;
            } else if (str.startsWith("u=")) {
                az = fn.aj(str.substring(2), 16, 1835936842);
            } else if (str.equals("u")) {
                az = 0;
            } else if (str.equals("/u")) {
                az = -1;
            } else if (str.startsWith("shad=")) {
                aw = fn.aj(str.substring(5), 16, 198899150);
            } else if (str.equals("shad")) {
                aw = 0;
            } else if (str.equals("/shad")) {
                aw = ax;
            } else if (str.equals("br")) {
                aa(ac, ax);
            }
        } catch (Exception e) {
        }
    }

    public void cy(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = 0;
        if (str != null) {
            aa(i3, i4);
            ay.setSeed((long) i5);
            ao = (ay.nextInt() & 31) + 192;
            int[] iArr = new int[str.length()];
            int i7 = 0;
            while (true) {
                int i8 = i6;
                if (i8 < str.length()) {
                    iArr[i8] = i7;
                    if ((ay.nextInt() & 3) == 0) {
                        i7++;
                    }
                    i6 = i8 + 1;
                } else {
                    ay(str, i, i2, iArr, null, esVar);
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cz(String str, int i, int i2, es esVar) {
        int i3 = i2 - this.ae;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 < str.length()) {
                if (str.charAt(i7) != 0) {
                    int ad = (char) (je.ad(str.charAt(i7), -519442973) & -1811332695);
                    if (ad == '<') {
                        i4 = i7;
                    } else {
                        int i8;
                        if (ad != 8053 || i4 == -1) {
                            i8 = i4;
                        } else {
                            char c;
                            String substring = str.substring(i4 + 1, i7);
                            if (substring.equals("lt")) {
                                c = '<';
                            } else if (substring.equals("gt")) {
                                c = '>';
                            } else if (substring.startsWith("img=")) {
                                try {
                                    ef efVar = ag[nz.al(substring.substring(4), (byte) 39)];
                                    try {
                                        esVar.aa(efVar, i, (this.ae + i3) - efVar.am, (byte) -22);
                                        i += efVar.ae;
                                        i4 = -1;
                                        i5 = -1;
                                    } catch (Exception e) {
                                    }
                                } catch (Exception e2) {
                                }
                            } else {
                                ao(substring);
                                i4 = -1;
                            }
                            ad = c;
                            i8 = -1;
                        }
                        if (ad == -2134306742) {
                            ad = -309439122;
                        }
                        if (i8 == -1) {
                            if (!(this.ap == null || i5 == -1)) {
                                i += this.ap[(i5 << 8) + ad];
                            }
                            int i9 = this.ar[ad];
                            int i10 = this.al[ad];
                            if (ad == 608949641) {
                                if (ah > 0) {
                                    af += ah;
                                    i += af >> 8;
                                    af &= 255;
                                }
                                i6 = i;
                            } else if (ao >= 255) {
                                if (aw != -1) {
                                    an(this.ad[ad], (this.aj[ad] + i) + 1, (this.ai[ad] + i3) + 1, i9, i10, aw, esVar);
                                }
                                an(this.ad[ad], i + this.aj[ad], i3 + this.ai[ad], i9, i10, aa, esVar);
                                i6 = i;
                            } else {
                                if (aw != -1) {
                                    av(this.ad[ad], (this.aj[ad] + i) + 1, (this.ai[ad] + i3) + 1, i9, i10, aw, ao, esVar);
                                }
                                av(this.ad[ad], i + this.aj[ad], i3 + this.ai[ad], i9, i10, aa, ao, esVar);
                                i6 = i;
                            }
                            int i11 = this.aq[ad];
                            if (au != -1) {
                                esVar.ae(i6, i3 + ((int) (((double) this.ae) * 0.7d)), i11, au, -376754709);
                            }
                            if (az != -1) {
                                esVar.ae(i6, (this.ae + i3) + 1, i11, az, -242920956);
                            }
                            i = i6 + i11;
                            i5 = ad;
                            i4 = i8;
                        } else {
                            i4 = i8;
                        }
                    }
                }
                i6 = i7 + 1;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void db(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (i6 >= 255) {
            an(bArr, i, i2, i3, i4, i5, esVar);
            return;
        }
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = ((esVar.aq * 1462922907) * i2) + i;
        int i14 = (esVar.aq * 1462922907) - i3;
        int i15 = 0;
        if (i2 < esVar.al * -709973917) {
            i7 = (esVar.al * -709973917) - i2;
            i2 = -709973917 * esVar.al;
            i13 += (esVar.aq * 1462922907) * i7;
            i8 = (i7 * i3) + 0;
            i4 -= i7;
        } else {
            i8 = 0;
        }
        i7 = i2 + i4;
        int i16 = i7 > esVar.aj * 157809585 ? i4 - (i7 - (esVar.aj * 157809585)) : i4;
        if (i < esVar.ai * 1947951707) {
            i15 = (esVar.ai * 1947951707) - i;
            i7 = i8 + i15;
            i14 += i15;
            i9 = i13 + i15;
            i3 -= i15;
            i = esVar.ai * 1947951707;
            i15 += 0;
        } else {
            i9 = i13;
            i7 = i8;
        }
        i13 = i + i3;
        if (i13 > esVar.ae * 428635993) {
            i13 -= esVar.ae * 428635993;
            i10 = i3 - i13;
            i11 = i15 + i13;
            i12 = i14 + i13;
        } else {
            i10 = i3;
            i12 = i14;
            i11 = i15;
        }
        if (i10 > 0 && i16 > 0) {
            at(esVar.ad, bArr, i5, i7, i9, i10, i16, i12, i11, i6);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dc(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 1569890677 - i8;
        int i10 = i3;
        int i11 = i2;
        for (int i12 = -i5; i12 < 0; i12++) {
            int i13 = -i4;
            int i14 = i10;
            while (i13 < 0) {
                if (bArr[i11] != (byte) 0) {
                    i10 = iArr[i14];
                    if (i10 == 0) {
                        i10 = i14 + 1;
                        iArr[i14] = (i8 << 24) | i;
                    } else {
                        iArr[i14] = (Math.max(i10 >>> 24, i8) << 24) | ((((((1798997081 & i10) * i9) & -2103943590) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i10) * i9) & -858364444)) >> 8) + (((((16711935 & i) * i8) & -1051955405) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i) * i8) & -1411660367)) >> 8));
                        i10 = i14 + 1;
                    }
                } else {
                    i10 = i14 + 1;
                }
                i13++;
                i11++;
                i14 = i10;
            }
            i10 = i14 + i6;
            i11 += i7;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dd(byte[] bArr, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = ((esVar.aq * 1462922907) * i2) + i;
        int i13 = (esVar.aq * 1462922907) - i3;
        int i14 = 0;
        if (i2 < esVar.al * -709973917) {
            i6 = (esVar.al * -709973917) - i2;
            i7 = (i6 * i3) + 0;
            i12 += (esVar.aq * 1391170389) * i6;
            i4 -= i6;
            i2 = esVar.al * 1430576433;
        } else {
            i7 = 0;
        }
        i6 = i2 + i4;
        int i15 = i6 > esVar.aj * 157809585 ? i4 - (i6 - (esVar.aj * 157809585)) : i4;
        if (i < esVar.ai * 1947951707) {
            i8 = (esVar.ai * 1057131353) - i;
            i14 = i8 + 0;
            i13 += i8;
            i9 = i12 + i8;
            i6 = i7 + i8;
            i3 -= i8;
            i = esVar.ai * 1947951707;
        } else {
            i9 = i12;
            i6 = i7;
        }
        i12 = i + i3;
        if (i12 > esVar.ae * 428635993) {
            i12 -= esVar.ae * 745698082;
            i8 = i3 - i12;
            i10 = i14 + i12;
            i11 = i13 + i12;
        } else {
            i8 = i3;
            i11 = i13;
            i10 = i14;
        }
        if (i8 > 0 && i15 > 0) {
            ab(esVar.ad, bArr, i5, i6, i9, i8, i15, i11, i10);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dm(byte[] bArr, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = ((esVar.aq * 1462922907) * i2) + i;
        int i13 = (esVar.aq * 1462922907) - i3;
        int i14 = 0;
        if (i2 < esVar.al * -709973917) {
            i6 = (esVar.al * -709973917) - i2;
            i12 += (esVar.aq * -537649162) * i6;
            i7 = (i6 * i3) + 0;
            i4 -= i6;
            i2 = -709973917 * esVar.al;
        } else {
            i7 = 0;
        }
        i6 = i2 + i4;
        int i15 = i6 > esVar.aj * -1379081264 ? i4 - (i6 - (esVar.aj * 316090763)) : i4;
        if (i < esVar.ai * 325821114) {
            i8 = (esVar.ai * 1947951707) - i;
            i14 = i8 + 0;
            i13 += i8;
            i6 = i7 + i8;
            i9 = i12 + i8;
            i3 -= i8;
            i = esVar.ai * 655727684;
        } else {
            i9 = i12;
            i6 = i7;
        }
        i7 = i + i3;
        if (i7 > esVar.ae * 428635993) {
            i7 -= esVar.ae * 428635993;
            i8 = i3 - i7;
            i10 = i14 + i7;
            i11 = i13 + i7;
        } else {
            i8 = i3;
            i11 = i13;
            i10 = i14;
        }
        if (i8 > 0 && i15 > 0) {
            ab(esVar.ad, bArr, i5, i6, i9, i8, i15, i11, i10);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dp(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 255 - i8;
        int i10 = i3;
        int i11 = i2;
        for (int i12 = -i5; i12 < 0; i12++) {
            int i13 = -i4;
            int i14 = i10;
            while (i13 < 0) {
                if (bArr[i11] != (byte) 0) {
                    i10 = iArr[i14];
                    if (i10 == 0) {
                        i10 = i14 + 1;
                        iArr[i14] = (i8 << 24) | i;
                    } else {
                        iArr[i14] = (Math.max(i10 >>> 24, i8) << 24) | ((((((1746943472 & i10) * i9) & 797036790) + (((-1574780716 & i10) * i9) & 16711680)) >> 8) + (((((-1414743434 & i) * i8) & 2107977211) + (((-212667706 & i) * i8) & 16711680)) >> 8));
                        i10 = i14 + 1;
                    }
                } else {
                    i10 = i14 + 1;
                }
                i13++;
                i11++;
                i14 = i10;
            }
            i10 = i14 + i6;
            i11 += i7;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dt(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i | ViewCompat.MEASURED_STATE_MASK;
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14;
            int i15;
            int i16 = i8;
            while (i16 < 0) {
                i14 = i12 + 1;
                if (bArr[i12] != (byte) 0) {
                    i15 = i11 + 1;
                    iArr[i11] = i10;
                } else {
                    i15 = i11 + 1;
                }
                i12 = i14 + 1;
                if (bArr[i14] != (byte) 0) {
                    i14 = i15 + 1;
                    iArr[i15] = i10;
                    i15 = i14;
                } else {
                    i15++;
                }
                i11 = i12 + 1;
                if (bArr[i12] != (byte) 0) {
                    i14 = i15 + 1;
                    iArr[i15] = i10;
                    i15 = i14;
                } else {
                    i15++;
                }
                if (bArr[i11] != (byte) 0) {
                    iArr[i15] = i10;
                }
                i12 = i11 + 1;
                i16++;
                i11 = i15 + 1;
            }
            i14 = i9;
            i15 = i11;
            while (i14 < 0) {
                if (bArr[i12] != (byte) 0) {
                    iArr[i15] = i10;
                }
                i15++;
                i14++;
                i12++;
            }
            i11 = i15 + i6;
            i12 += i7;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void du(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 255 - i8;
        int i10 = i3;
        int i11 = i2;
        for (int i12 = -i5; i12 < 0; i12++) {
            int i13 = -i4;
            int i14 = i10;
            while (i13 < 0) {
                if (bArr[i11] != (byte) 0) {
                    i10 = iArr[i14];
                    if (i10 == 0) {
                        i10 = i14 + 1;
                        iArr[i14] = (i8 << 24) | i;
                    } else {
                        iArr[i14] = ((((((i10 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) * i9) & 16711680) + (((16711935 & i10) * i9) & -16711936)) >> 8) + (((((16711935 & i) * i8) & -16711936) + (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i) * i8) & 16711680)) >> 8)) | (Math.max(i10 >>> 24, i8) << 24);
                        i10 = i14 + 1;
                    }
                } else {
                    i10 = i14 + 1;
                }
                i13++;
                i11++;
                i14 = i10;
            }
            i10 = i14 + i6;
            i11 += i7;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dv(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (i6 >= 255) {
            an(bArr, i, i2, i3, i4, i5, esVar);
            return;
        }
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = ((esVar.aq * 1476464071) * i2) + i;
        int i14 = (esVar.aq * 875765280) - i3;
        int i15 = 0;
        if (i2 < esVar.al * -90134308) {
            i7 = (esVar.al * -709973917) - i2;
            i4 -= i7;
            i2 = esVar.al * -1931019270;
            i8 = (i7 * i3) + 0;
            i13 += i7 * (esVar.aq * 964690079);
        } else {
            i8 = 0;
        }
        i7 = i2 + i4;
        int i16 = i7 > esVar.aj * 157809585 ? i4 - (i7 - (esVar.aj * 1092632302)) : i4;
        if (i < esVar.ai * 1947951707) {
            i15 = (esVar.ai * 1947951707) - i;
            i9 = i13 + i15;
            i14 += i15;
            i7 = i8 + i15;
            i3 -= i15;
            i = esVar.ai * 1947951707;
            i15 += 0;
        } else {
            i7 = i8;
            i9 = i13;
        }
        i8 = i + i3;
        if (i8 > esVar.ae * 182231443) {
            i8 -= esVar.ae * 428635993;
            i10 = i3 - i8;
            i11 = i15 + i8;
            i12 = i14 + i8;
        } else {
            i12 = i14;
            i10 = i3;
            i11 = i15;
        }
        if (i10 > 0 && i16 > 0) {
            at(esVar.ad, bArr, i5, i7, i9, i10, i16, i12, i11, i6);
        }
    }
}
