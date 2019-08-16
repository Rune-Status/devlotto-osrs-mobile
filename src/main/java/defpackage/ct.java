package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;

/* renamed from: ct */
public class ct {
    public static final int aj = 1024;
    public static final int as = 1024;
    int ad;
    byte[][][] aq;

    ct(int i) {
        try {
            this.ad = 2014754911 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void am(Collection collection, short s) {
        try {
            collection.add(de.aq);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int aa(int i) {
        return (9 == i || 10 == i) ? 1 : i == 11 ? 8 : i;
    }

    /* Access modifiers changed, original: 0000 */
    public void ab() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = 0; i < this.ad * -783059943; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= i) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][0] = bArr;
        bArr = new byte[((this.ad * -631150105) * (this.ad * -1104231367))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * -1077210608; i++) {
                if (i <= i2) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= i) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][2] = bArr;
        bArr = new byte[((this.ad * 206846702) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i >= i2) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][3] = bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public int ac(int i) {
        return (9 == i || 10 == i) ? 1 : i == 11 ? 8 : i;
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, es esVar, int i9) {
        if (i7 != 0) {
            try {
                if (this.ad * 2044830623 != 0 && this.aq != null) {
                    esVar.ai(i, i2, i5, i6, i3, i4, this.aq[ar(i7, 1042454669) - 1][aq(i8, i7, (byte) 0)], this.ad * 2044830623, true, 164909632);
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ct.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(byte b) {
        int i = 0;
        try {
            int i2;
            int i3;
            byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            int i4 = 0;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                for (i3 = (this.ad * 2044830623) - 1; i3 >= 0; i3--) {
                    if (i3 <= (i2 >> 1)) {
                        bArr[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[2][0] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 >= (i2 << 1)) {
                        bArr[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[2][1] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 <= (i2 >> 1)) {
                        bArr[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[2][2] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            while (true) {
                i2 = i;
                if (i2 < this.ad * 2044830623) {
                    for (i3 = (this.ad * 2044830623) - 1; i3 >= 0; i3--) {
                        if (i3 >= (i2 << 1)) {
                            bArr[i4] = (byte) -1;
                        }
                        i4++;
                    }
                    i = i2 + 1;
                } else {
                    this.aq[2][3] = bArr;
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af() {
        if (this.aq == null) {
            this.aq = (byte[][][]) Array.newInstance(byte[].class, new int[]{8, 4});
            aj(-764801209);
            ai(373195124);
            ae((byte) 29);
            am((byte) -60);
            ak(1011337170);
            as(19136782);
            ag(2146588326);
            ap(-1950862457);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(int i) {
        try {
            int i2;
            int i3;
            byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            int i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 <= i2 - ((this.ad * 2044830623) / 2)) {
                        bArr2[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[6][0] = bArr2;
            bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 <= i2 - ((this.ad * 2044830623) / 2)) {
                        bArr2[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[6][1] = bArr2;
            bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                for (i3 = (this.ad * 2044830623) - 1; i3 >= 0; i3--) {
                    if (i3 <= i2 - ((this.ad * 2044830623) / 2)) {
                        bArr2[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[6][2] = bArr2;
            bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                int i5 = i4;
                for (i3 = (this.ad * 2044830623) - 1; i3 >= 0; i3--) {
                    if (i3 <= i2 - ((this.ad * 2044830623) / 2)) {
                        bArr2[i5] = (byte) -1;
                    }
                    i5++;
                }
                i4 = i5;
            }
            this.aq[6][3] = bArr2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah() {
        if (this.aq == null) {
            this.aq = (byte[][][]) Array.newInstance(byte[].class, new int[]{8, 4});
            aj(-660208518);
            ai(-259643859);
            ae((byte) 35);
            am((byte) -7);
            ak(1856871684);
            as(19136782);
            ag(2135375834);
            ap(-2014286844);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i) {
        try {
            int i2;
            int i3;
            byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            int i4 = 0;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 <= (i2 >> 1)) {
                        bArr[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[1][0] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i2 = 0;
            i3 = 0;
            while (i2 < this.ad * 2044830623) {
                i4 = 0;
                while (i4 < this.ad * 2044830623) {
                    if (i3 >= 0 && i3 < bArr.length && i4 >= (i2 << 1)) {
                        bArr[i3] = (byte) -1;
                    }
                    i3++;
                    i4++;
                }
                i2++;
            }
            this.aq[1][1] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                for (i3 = (this.ad * 2044830623) - 1; i3 >= 0; i3--) {
                    if (i3 <= (i2 >> 1)) {
                        bArr[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[1][2] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                for (i3 = (this.ad * 2044830623) - 1; i3 >= 0; i3--) {
                    if (i3 >= (i2 << 1)) {
                        bArr[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[1][3] = bArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i) {
        try {
            int i2;
            int i3;
            byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            int i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 <= i2) {
                        bArr[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[0][0] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 <= i2) {
                        bArr[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[0][1] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 >= i2) {
                        bArr[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[0][2] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 >= i2) {
                        bArr[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[0][3] = bArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(int i) {
        int i2 = 0;
        try {
            int i3;
            int i4;
            byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            int i5 = 0;
            for (i3 = (this.ad * 2044830623) - 1; i3 >= 0; i3--) {
                for (i4 = (this.ad * 2044830623) - 1; i4 >= 0; i4--) {
                    if (i4 >= (i3 >> 1)) {
                        bArr[i5] = (byte) -1;
                    }
                    i5++;
                }
            }
            this.aq[4][0] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i5 = 0;
            for (i3 = (this.ad * 2044830623) - 1; i3 >= 0; i3--) {
                for (i4 = 0; i4 < this.ad * 2044830623; i4++) {
                    if (i4 <= (i3 << 1)) {
                        bArr[i5] = (byte) -1;
                    }
                    i5++;
                }
            }
            this.aq[4][1] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i5 = 0;
            for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                for (i4 = 0; i4 < this.ad * 2044830623; i4++) {
                    if (i4 >= (i3 >> 1)) {
                        bArr[i5] = (byte) -1;
                    }
                    i5++;
                }
            }
            this.aq[4][2] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i5 = 0;
            while (true) {
                i3 = i2;
                if (i3 < this.ad * 2044830623) {
                    for (i4 = (this.ad * 2044830623) - 1; i4 >= 0; i4--) {
                        if (i4 <= (i3 << 1)) {
                            bArr[i5] = (byte) -1;
                        }
                        i5++;
                    }
                    i2 = i3 + 1;
                } else {
                    this.aq[4][3] = bArr;
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(int i) {
        try {
            if (this.aq == null) {
                this.aq = (byte[][][]) Array.newInstance(byte[].class, new int[]{8, 4});
                aj(228786303);
                ai(2040525811);
                ae((byte) 114);
                am((byte) -101);
                ak(607234371);
                as(19136782);
                ag(2131599798);
                ap(-2017127680);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void am(byte b) {
        try {
            int i;
            int i2;
            byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            int i3 = 0;
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                    if (i2 >= (i >> 1)) {
                        bArr[i3] = (byte) -1;
                    }
                    i3++;
                }
            }
            this.aq[3][0] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i3 = 0;
            for (i = 0; i < this.ad * 2044830623; i++) {
                for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                    if (i2 <= (i << 1)) {
                        bArr[i3] = (byte) -1;
                    }
                    i3++;
                }
            }
            this.aq[3][1] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i3 = 0;
            for (i = 0; i < this.ad * 2044830623; i++) {
                for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                    if (i2 >= (i >> 1)) {
                        bArr[i3] = (byte) -1;
                    }
                    i3++;
                }
            }
            this.aq[3][2] = bArr;
            bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i3 = 0;
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                    if (i2 <= (i << 1)) {
                        bArr[i3] = (byte) -1;
                    }
                    i3++;
                }
            }
            this.aq[3][3] = bArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void an() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2109155799) * (this.ad * 580459494))];
        int i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= i) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][0] = bArr;
        bArr = new byte[((this.ad * -332248539) * (this.ad * -1110019030))];
        i3 = 0;
        for (i2 = (this.ad * 201107392) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 1054520035; i++) {
                if (i <= i2) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][1] = bArr;
        bArr = new byte[((this.ad * 128031802) * (this.ad * 2044830623))];
        i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * -1935963130; i2++) {
                if (i2 >= i) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][2] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i >= i2) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][3] = bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public int ao(int i) {
        return (9 == i || 10 == i) ? 1 : i == 11 ? 8 : i;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(int i) {
        try {
            int i2;
            int i3;
            byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            int i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 >= i2 - ((this.ad * 2044830623) / 2)) {
                        bArr2[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[7][0] = bArr2;
            bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 >= i2 - ((this.ad * 2044830623) / 2)) {
                        bArr2[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[7][1] = bArr2;
            bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                for (i3 = (this.ad * 2044830623) - 1; i3 >= 0; i3--) {
                    if (i3 >= i2 - ((this.ad * 2044830623) / 2)) {
                        bArr2[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[7][2] = bArr2;
            bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                int i5 = i4;
                for (i3 = (this.ad * 2044830623) - 1; i3 >= 0; i3--) {
                    if (i3 >= i2 - ((this.ad * 2044830623) / 2)) {
                        bArr2[i5] = (byte) -1;
                    }
                    i5++;
                }
                i4 = i5;
            }
            this.aq[7][3] = bArr2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(int i, int i2, byte b) {
        int i3 = 9 == i2 ? (i + 1) & 3 : i;
        if (10 == i2) {
            i3 = (i3 + 3) & 3;
        }
        return 11 == i2 ? (i3 + 3) & 3 : i3;
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(int i, int i2) {
        return (9 == i || 10 == i) ? 1 : i == 11 ? 8 : i;
    }

    /* Access modifiers changed, original: 0000 */
    public void as(int i) {
        try {
            int i2;
            int i3;
            byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            int i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 <= (this.ad * 2044830623) / 2) {
                        bArr2[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[5][0] = bArr2;
            bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i2 <= (this.ad * 2044830623) / 2) {
                        bArr2[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[5][1] = bArr2;
            bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i3 >= (this.ad * 2044830623) / 2) {
                        bArr2[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[5][2] = bArr2;
            bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
            i4 = 0;
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                for (i3 = 0; i3 < this.ad * 2044830623; i3++) {
                    if (i2 >= (this.ad * 2044830623) / 2) {
                        bArr2[i4] = (byte) -1;
                    }
                    i4++;
                }
            }
            this.aq[5][3] = bArr2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ct.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void at() {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i4 = 0;
        for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= (i >> 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[1][0] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        i4 = 0;
        while (i2 < this.ad * 2044830623) {
            i = 0;
            while (i < this.ad * 2044830623) {
                if (i4 >= 0 && i4 < bArr.length && i >= (i2 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
                i++;
            }
            i2++;
        }
        this.aq[1][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        for (i4 = 0; i4 < this.ad * 2044830623; i4++) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i <= (i4 >> 1)) {
                    bArr[i2] = (byte) -1;
                }
                i2++;
            }
        }
        this.aq[1][2] = bArr;
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        for (i4 = (this.ad * 2044830623) - 1; i4 >= 0; i4--) {
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 >= (i4 << 1)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[1][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void au(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, es esVar) {
        if (i7 != 0 && this.ad * 2044830623 != 0 && this.aq != null) {
            esVar.ai(i, i2, i5, i6, i3, i4, this.aq[ar(i7, -181741406) - 1][aq(i8, i7, (byte) 0)], this.ad * 2044830623, true, 164909632);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void av() {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * -1978540270))];
        int i4 = 0;
        for (i = (this.ad * -1395628285) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * -742463407; i2++) {
                if (i2 <= (i >> 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[1][0] = bArr;
        bArr = new byte[((this.ad * -682086900) * (this.ad * -486479004))];
        i2 = 0;
        i4 = 0;
        while (i2 < this.ad * 2044830623) {
            i = 0;
            while (i < this.ad * 2102788051) {
                if (i4 >= 0 && i4 < bArr.length && i >= (i2 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
                i++;
            }
            i2++;
        }
        this.aq[1][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 1085537163))];
        i2 = 0;
        for (i4 = 0; i4 < this.ad * 2044830623; i4++) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i <= (i4 >> 1)) {
                    bArr[i2] = (byte) -1;
                }
                i2++;
            }
        }
        this.aq[1][2] = bArr;
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        for (i4 = (this.ad * 2044830623) - 1; i4 >= 0; i4--) {
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 >= (i4 << 1)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[1][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public int aw(int i, int i2) {
        int i3 = 9 == i2 ? (i + 1) & 3 : i;
        if (10 == i2) {
            i3 = (i3 + 3) & 3;
        }
        return 11 == i2 ? (i3 + 3) & 3 : i3;
    }

    /* Access modifiers changed, original: 0000 */
    public int ax(int i, int i2) {
        int i3 = 9 == i2 ? (i + 1) & 3 : i;
        if (10 == i2) {
            i3 = (i3 + 3) & 3;
        }
        return 11 == i2 ? (i3 + 3) & 3 : i3;
    }

    /* Access modifiers changed, original: 0000 */
    public void ay() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = 0; i < this.ad * 2071880903; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= i) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][0] = bArr;
        bArr = new byte[((this.ad * -1662482446) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 875147290) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * -830306101; i++) {
                if (i <= i2) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 889968287))];
        i3 = 0;
        for (i = 0; i < this.ad * -494214910; i++) {
            for (i2 = 0; i2 < this.ad * -37513080; i2++) {
                if (i2 >= i) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][2] = bArr;
        bArr = new byte[((this.ad * -786587863) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 1756192317) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i >= i2) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[0][3] = bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public int az(int i, int i2) {
        int i3 = 9 == i2 ? (i + 1) & 3 : i;
        if (10 == i2) {
            i3 = (i3 + 3) & 3;
        }
        return 11 == i2 ? (i3 + 3) & 3 : i3;
    }

    /* Access modifiers changed, original: 0000 */
    public void ba() {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i4 = 0;
        for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= (i >> 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[1][0] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        i4 = 0;
        while (i2 < this.ad * 2044830623) {
            i = 0;
            while (i < this.ad * 2044830623) {
                if (i4 >= 0 && i4 < bArr.length && i >= (i2 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
                i++;
            }
            i2++;
        }
        this.aq[1][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        for (i4 = 0; i4 < this.ad * 2044830623; i4++) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i <= (i4 >> 1)) {
                    bArr[i2] = (byte) -1;
                }
                i2++;
            }
        }
        this.aq[1][2] = bArr;
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        for (i4 = (this.ad * 2044830623) - 1; i4 >= 0; i4--) {
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 >= (i4 << 1)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[1][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bb() {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i4 = 0;
        for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= (i >> 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[3][0] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i4 = 0;
        for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i <= (i2 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[3][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        for (i4 = 0; i4 < this.ad * 2044830623; i4++) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i >= (i4 >> 1)) {
                    bArr[i2] = (byte) -1;
                }
                i2++;
            }
        }
        this.aq[3][2] = bArr;
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        for (i4 = (this.ad * 2044830623) - 1; i4 >= 0; i4--) {
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 <= (i4 << 1)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[3][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bc() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 525709911) * (this.ad * 2044830623))];
        byte[] bArr2 = new byte[((this.ad * 773678852) * (this.ad * -675483100))];
        int i3 = 0;
        for (i = 0; i < this.ad * -1890762352; i++) {
            for (i2 = 0; i2 < this.ad * -892117405; i2++) {
                if (i2 <= (this.ad * 2044830623) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][0] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * -2009899494))];
        i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i <= (this.ad * 2044830623) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][1] = bArr2;
        bArr2 = new byte[((this.ad * 1078774851) * (this.ad * 1986436549))];
        i3 = 0;
        for (i = 0; i < this.ad * -1274254654; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= (this.ad * 2044830623) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][2] = bArr2;
        bArr2 = new byte[((this.ad * 9404967) * (this.ad * 2044830623))];
        i3 = 0;
        for (i = 0; i < this.ad * 958492933; i++) {
            for (i2 = 0; i2 < this.ad * -2014857249; i2++) {
                if (i >= (this.ad * 1054924643) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bd() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * -243194769) * (this.ad * -1290723257))];
        int i3 = 0;
        for (i = (this.ad * 1962366973) - 1; i >= 0; i--) {
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 <= (i >> 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[2][0] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i = (this.ad * 899374967) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= (i << 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[2][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 1379245543))];
        i3 = 0;
        for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
            for (i = 0; i < this.ad * 1837453725; i++) {
                if (i <= (i2 >> 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[2][2] = bArr;
        bArr = new byte[((this.ad * 737184748) * (this.ad * -584351362))];
        i2 = 0;
        i3 = 0;
        while (i3 < this.ad * 2044830623) {
            int i4 = i2;
            for (i = (this.ad * -982526256) - 1; i >= 0; i--) {
                if (i >= (i3 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i2 = i4;
        }
        this.aq[2][3] = bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public void be() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2083502999) * (this.ad * 18255854))];
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * -1296203654; i2++) {
                if (i2 >= i - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][0] = bArr2;
        bArr2 = new byte[((this.ad * -772559712) * (this.ad * -1217699668))];
        i3 = 0;
        for (i2 = (this.ad * 1155328078) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 1318841128; i++) {
                if (i >= i2 - ((this.ad * -334814139) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][1] = bArr2;
        bArr2 = new byte[((this.ad * -2127601045) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * -679688910) - 1; i2 >= 0; i2--) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i >= i2 - ((this.ad * -1454061447) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][2] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 507279227))];
        i = 0;
        i3 = 0;
        while (i3 < this.ad * 790136624) {
            int i4 = i;
            for (i2 = (this.ad * 1764061415) - 1; i2 >= 0; i2--) {
                if (i2 >= i3 - ((this.ad * -192296900) / 2)) {
                    bArr2[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i = i4;
        }
        this.aq[7][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bf() {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i4 = 0;
        for (i = (this.ad * 710062880) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 2127397657; i2++) {
                if (i2 >= (i >> 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[3][0] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i4 = 0;
        for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i <= (i2 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[3][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        for (i4 = 0; i4 < this.ad * 2044830623; i4++) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i >= (i4 >> 1)) {
                    bArr[i2] = (byte) -1;
                }
                i2++;
            }
        }
        this.aq[3][2] = bArr;
        byte[] bArr2 = new byte[((this.ad * -522272385) * (this.ad * -697132808))];
        for (i4 = (this.ad * -1568754345) - 1; i4 >= 0; i4--) {
            for (i2 = (this.ad * -1264461105) - 1; i2 >= 0; i2--) {
                if (i2 <= (i4 << 1)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[3][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bg() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 429562910) * (this.ad * 2044830623))];
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 1161060178))];
        int i3 = 0;
        for (i = 0; i < this.ad * -1312375036; i++) {
            for (i2 = 0; i2 < this.ad * 1326075972; i2++) {
                if (i2 <= (this.ad * 94415672) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][0] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * -895317161))];
        i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 966777106; i2++) {
                if (i <= (this.ad * 1829713355) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][1] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 552077293))];
        i3 = 0;
        for (i = 0; i < this.ad * -1032992292; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= (this.ad * 2044830623) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][2] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * -1493788899))];
        i3 = 0;
        for (i = 0; i < this.ad * -2038100239; i++) {
            for (i2 = 0; i2 < this.ad * 1742293608; i2++) {
                if (i >= (this.ad * 2044830623) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bh() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 439107905) * (this.ad * -232643953))];
        byte[] bArr2 = new byte[((this.ad * -656889410) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = 0; i < this.ad * -1722578695; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= i - ((this.ad * -239672421) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][0] = bArr2;
        bArr2 = new byte[((this.ad * -230239937) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * -1682183648) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i >= i2 - ((this.ad * 138201833) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][1] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 608938643))];
        i3 = 0;
        for (i2 = (this.ad * -1008942183) - 1; i2 >= 0; i2--) {
            for (i = (this.ad * 1066184570) - 1; i >= 0; i--) {
                if (i >= i2 - ((this.ad * -77833879) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][2] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i = 0;
        i3 = 0;
        while (i3 < this.ad * 2044830623) {
            int i4 = i;
            for (i2 = (this.ad * -1393078487) - 1; i2 >= 0; i2--) {
                if (i2 >= i3 - ((this.ad * 649742853) / 2)) {
                    bArr2[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i = i4;
        }
        this.aq[7][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bi() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 439071914) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 >= (i >> 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[4][0] = bArr;
        bArr = new byte[((this.ad * -1953234541) * (this.ad * -590922288))];
        i3 = 0;
        for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= (i << 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[4][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 407698648))];
        i3 = 0;
        for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i >= (i2 >> 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[4][2] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        i3 = 0;
        while (i3 < this.ad * 1199017300) {
            int i4 = i2;
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i <= (i3 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i2 = i4;
        }
        this.aq[4][3] = bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public void bj() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        byte[] bArr2 = new byte[((this.ad * -402937216) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * -457808950; i2++) {
                if (i2 >= i - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][0] = bArr2;
        bArr2 = new byte[((this.ad * -1916141283) * (this.ad * 749745586))];
        i3 = 0;
        for (i2 = (this.ad * -13008749) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i >= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][1] = bArr2;
        bArr2 = new byte[((this.ad * -1745533031) * (this.ad * -862265949))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i >= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][2] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2061303565))];
        i = 0;
        i3 = 0;
        while (i3 < this.ad * 2050470221) {
            int i4 = i;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 >= i3 - ((this.ad * -664190824) / 2)) {
                    bArr2[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i = i4;
        }
        this.aq[7][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bk() {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr = new byte[((this.ad * 432479407) * (this.ad * 1399207910))];
        int i4 = 0;
        for (i = (this.ad * -1432127296) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * -610378014; i2++) {
                if (i2 <= (i >> 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[1][0] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * -432392400))];
        i2 = 0;
        i4 = 0;
        while (i2 < this.ad * 2044830623) {
            i = 0;
            while (i < this.ad * -1061801109) {
                if (i4 >= 0 && i4 < bArr.length && i >= (i2 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
                i++;
            }
            i2++;
        }
        this.aq[1][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 430741402))];
        i2 = 0;
        for (i4 = 0; i4 < this.ad * 132282500; i4++) {
            for (i = (this.ad * -1678094541) - 1; i >= 0; i--) {
                if (i <= (i4 >> 1)) {
                    bArr[i2] = (byte) -1;
                }
                i2++;
            }
        }
        this.aq[1][2] = bArr;
        byte[] bArr2 = new byte[((this.ad * -1600571437) * (this.ad * 2044830623))];
        for (i4 = (this.ad * 1891422966) - 1; i4 >= 0; i4--) {
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 >= (i4 << 1)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[1][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bl() {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i4 = 0;
        for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= (i >> 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[3][0] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i4 = 0;
        for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i <= (i2 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[3][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        for (i4 = 0; i4 < this.ad * 2044830623; i4++) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i >= (i4 >> 1)) {
                    bArr[i2] = (byte) -1;
                }
                i2++;
            }
        }
        this.aq[3][2] = bArr;
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        for (i4 = (this.ad * 2044830623) - 1; i4 >= 0; i4--) {
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 <= (i4 << 1)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[3][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bm() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
            for (i2 = (this.ad * -1684969101) - 1; i2 >= 0; i2--) {
                if (i2 <= (i >> 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[2][0] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 557783974; i2++) {
                if (i2 >= (i << 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[2][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = 0; i2 < this.ad * -917377233; i2++) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i <= (i2 >> 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[2][2] = bArr;
        bArr = new byte[((this.ad * -45973705) * (this.ad * 2083851112))];
        i2 = 0;
        i3 = 0;
        while (i3 < this.ad * 1972502289) {
            int i4 = i2;
            for (i = (this.ad * 1758045229) - 1; i >= 0; i--) {
                if (i >= (i3 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i2 = i4;
        }
        this.aq[2][3] = bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public void bo() {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr = new byte[((this.ad * -694871163) * (this.ad * -609951836))];
        int i4 = 0;
        for (i = (this.ad * -1310917469) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= (i >> 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[3][0] = bArr;
        bArr = new byte[((this.ad * -262981033) * (this.ad * 2044830623))];
        i4 = 0;
        for (i2 = 0; i2 < this.ad * 324511304; i2++) {
            for (i = 0; i < this.ad * -408369625; i++) {
                if (i <= (i2 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[3][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        for (i4 = 0; i4 < this.ad * -239744332; i4++) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i >= (i4 >> 1)) {
                    bArr[i2] = (byte) -1;
                }
                i2++;
            }
        }
        this.aq[3][2] = bArr;
        byte[] bArr2 = new byte[((this.ad * 977957279) * (this.ad * 344725810))];
        for (i4 = (this.ad * 2044830623) - 1; i4 >= 0; i4--) {
            for (i2 = (this.ad * -2132529883) - 1; i2 >= 0; i2--) {
                if (i2 <= (i4 << 1)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[3][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bq() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * -246094968) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = (this.ad * 1084450054) - 1; i >= 0; i--) {
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 <= (i >> 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[2][0] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * -591298188))];
        i3 = 0;
        for (i = (this.ad * -1874889570) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= (i << 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[2][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = 0; i2 < this.ad * 231107169; i2++) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i <= (i2 >> 1)) {
                    bArr[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[2][2] = bArr;
        bArr = new byte[((this.ad * -414347766) * (this.ad * -245560016))];
        i2 = 0;
        i3 = 0;
        while (i3 < this.ad * -276381664) {
            int i4 = i2;
            for (i = (this.ad * 1998631473) - 1; i >= 0; i--) {
                if (i >= (i3 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i2 = i4;
        }
        this.aq[2][3] = bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public void br() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= i - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][0] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i <= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][1] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i <= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][2] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i = 0;
        i3 = 0;
        while (i3 < this.ad * 2044830623) {
            int i4 = i;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 <= i3 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i = i4;
        }
        this.aq[6][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bs() {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i4 = 0;
        for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= (i >> 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
            }
        }
        this.aq[1][0] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        i4 = 0;
        while (i2 < this.ad * 2044830623) {
            i = 0;
            while (i < this.ad * 2044830623) {
                if (i4 >= 0 && i4 < bArr.length && i >= (i2 << 1)) {
                    bArr[i4] = (byte) -1;
                }
                i4++;
                i++;
            }
            i2++;
        }
        this.aq[1][1] = bArr;
        bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i2 = 0;
        for (i4 = 0; i4 < this.ad * 2044830623; i4++) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i <= (i4 >> 1)) {
                    bArr[i2] = (byte) -1;
                }
                i2++;
            }
        }
        this.aq[1][2] = bArr;
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        for (i4 = (this.ad * 2044830623) - 1; i4 >= 0; i4--) {
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 >= (i4 << 1)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[1][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bt() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= i - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][0] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i >= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][1] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i >= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[7][2] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i = 0;
        i3 = 0;
        while (i3 < this.ad * 2044830623) {
            int i4 = i;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 >= i3 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i = i4;
        }
        this.aq[7][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bu() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 180369476))];
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * -1957534303))];
        int i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= i - ((this.ad * 1501750911) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][0] = bArr2;
        bArr2 = new byte[((this.ad * -1661050111) * (this.ad * 1159160520))];
        i3 = 0;
        for (i2 = (this.ad * -611134777) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 1037564125; i++) {
                if (i <= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][1] = bArr2;
        bArr2 = new byte[((this.ad * 400987740) * (this.ad * -1967362716))];
        i3 = 0;
        for (i2 = (this.ad * 155051800) - 1; i2 >= 0; i2--) {
            for (i = (this.ad * 2072416814) - 1; i >= 0; i--) {
                if (i <= i2 - ((this.ad * -126721771) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][2] = bArr2;
        bArr2 = new byte[((this.ad * 164787049) * (this.ad * 951017879))];
        i = 0;
        i3 = 0;
        while (i3 < this.ad * 1805610215) {
            int i4 = i;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 <= i3 - ((this.ad * 955629073) / 2)) {
                    bArr2[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i = i4;
        }
        this.aq[6][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bv() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= (this.ad * 2044830623) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][0] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i <= (this.ad * 2044830623) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][1] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 >= (this.ad * 2044830623) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][2] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i >= (this.ad * 2044830623) / 2) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[5][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bw() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= i - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][0] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i <= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][1] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i <= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][2] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i = 0;
        i3 = 0;
        while (i3 < this.ad * 2044830623) {
            int i4 = i;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 <= i3 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i = i4;
        }
        this.aq[6][3] = bArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public void bx() {
        int i;
        int i2;
        byte[] bArr = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        byte[] bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        int i3 = 0;
        for (i = 0; i < this.ad * 2044830623; i++) {
            for (i2 = 0; i2 < this.ad * 2044830623; i2++) {
                if (i2 <= i - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][0] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = 0; i < this.ad * 2044830623; i++) {
                if (i <= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][1] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i3 = 0;
        for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
            for (i = (this.ad * 2044830623) - 1; i >= 0; i--) {
                if (i <= i2 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i3] = (byte) -1;
                }
                i3++;
            }
        }
        this.aq[6][2] = bArr2;
        bArr2 = new byte[((this.ad * 2044830623) * (this.ad * 2044830623))];
        i = 0;
        i3 = 0;
        while (i3 < this.ad * 2044830623) {
            int i4 = i;
            for (i2 = (this.ad * 2044830623) - 1; i2 >= 0; i2--) {
                if (i2 <= i3 - ((this.ad * 2044830623) / 2)) {
                    bArr2[i4] = (byte) -1;
                }
                i4++;
            }
            i3++;
            i = i4;
        }
        this.aq[6][3] = bArr2;
    }
}
