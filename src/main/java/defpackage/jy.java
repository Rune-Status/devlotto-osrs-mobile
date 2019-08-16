package defpackage;

import com.jagex.oldscape.osrenderer.ad;

/* renamed from: jy */
public class jy extends ft {
    static final int al = 0;
    static final int ar = 5;
    static int pa;
    int aq;

    jy() {
        try {
            this.aq = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jy.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static Object ai(byte[] bArr, boolean z, byte b) {
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length <= 136) {
                return z ? li.am(bArr, -1970113002) : bArr;
            } else {
                na naVar = new na();
                naVar.aq(bArr, 1637058919);
                return naVar;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jy.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(lp lpVar, int i, int i2, int i3, int i4) {
        int[] ay = ad.ay(-1171587707);
        int[] ap = lpVar.ap(-2072163014);
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 < ay.length) {
                i5 = ay[i6];
                int i7 = ay[i6 + 1];
                if (i7 >= 0 && i7 < 5) {
                    int i8 = ay[i6 + 2];
                    int i9 = ap[0];
                    int i10 = ay[i6 + 3];
                    int i11 = ap[1];
                    long ad = gq.ad((byte) 61);
                    i8 = ((i8 - i9) * i) / i3;
                    i9 = ((i10 - i11) * i2) / i4;
                    switch (i5) {
                        case 0:
                            ap(i7, i8, i9, ad);
                            break;
                        case 1:
                        case 3:
                            ag(i7, i8, i9, ad);
                            break;
                        case 2:
                            au(i7, i8, i9, ad);
                            break;
                        default:
                            break;
                    }
                }
                i5 = i6 + 4;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ab(int i, int i2, int i3, long j) {
        if (!az(i, (byte) -15)) {
            this.ad.ak(i, 0, i2, i3, j);
            this.aq = ((1 << i) | (this.aq * 1276670293)) * -2005662723;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(lp lpVar, int i, int i2, int i3, int i4) {
        int[] ay = ad.ay(-872713027);
        int[] ap = lpVar.ap(-1605815741);
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 < ay.length) {
                i5 = ay[i6];
                int i7 = ay[i6 + 1];
                if (i7 >= 0 && i7 < 5) {
                    int i8 = ay[i6 + 2];
                    int i9 = ap[0];
                    int i10 = ay[i6 + 3];
                    int i11 = ap[1];
                    long ad = gq.ad((byte) -66);
                    i8 = ((i8 - i9) * i) / i3;
                    i9 = ((i10 - i11) * i2) / i4;
                    switch (i5) {
                        case 0:
                            ap(i7, i8, i9, ad);
                            break;
                        case 1:
                        case 3:
                            ag(i7, i8, i9, ad);
                            break;
                        case 2:
                            au(i7, i8, i9, ad);
                            break;
                        default:
                            break;
                    }
                }
                i5 = i6 + 4;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af() {
        long aq = aq(551002832);
        for (int i = 0; i < 5; i++) {
            ag(i, -1, -1, aq);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(int i, int i2, int i3, long j) {
        try {
            if (az(i, (byte) 69)) {
                this.ad.as(i, 0, i2, i3, j);
                this.aq = ((1 << i) & (this.aq * 1276670293)) * -2005662723;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jy.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah() {
        long aq = aq(-1949738082);
        for (int i = 0; i < 5; i++) {
            ag(i, -1, -1, aq);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(lp lpVar, int i, int i2, int i3, int i4, byte b) {
        try {
            int[] ay = ad.ay(530851582);
            int[] ap = lpVar.ap(414877409);
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < ay.length) {
                    i5 = ay[i6];
                    int i7 = ay[i6 + 1];
                    if (i7 >= 0 && i7 < 5) {
                        int i8 = ay[i6 + 2];
                        int i9 = ap[0];
                        int i10 = ay[i6 + 3];
                        int i11 = ap[1];
                        long ad = gq.ad((byte) 75);
                        i8 = ((i8 - i9) * i) / i3;
                        i9 = ((i10 - i11) * i2) / i4;
                        switch (i5) {
                            case 0:
                                ap(i7, i8, i9, ad);
                                break;
                            case 1:
                            case 3:
                                ag(i7, i8, i9, ad);
                                break;
                            case 2:
                                au(i7, i8, i9, ad);
                                break;
                            default:
                                break;
                        }
                    }
                    i5 = i6 + 4;
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jy.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void an(int i, int i2, int i3, long j) {
        if (az(i, (byte) 89)) {
            this.ad.as(i, 0, i2, i3, j);
            this.aq = ((1 << i) & (this.aq * 1276670293)) * -2005662723;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ao() {
        long aq = aq(-1985406046);
        for (int i = 0; i < 5; i++) {
            ag(i, -1, -1, aq);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(int i, int i2, int i3, long j) {
        try {
            if (!az(i, (byte) -42)) {
                this.ad.ak(i, 0, i2, i3, j);
                this.aq = ((1 << i) | (this.aq * 1276670293)) * -2005662723;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jy.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(byte b) {
        try {
            long aq = aq(-679370926);
            for (int i = 0; i < 5; i++) {
                ag(i, -1, -1, aq);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jy.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void at(int i, int i2, int i3, long j) {
        if (az(i, (byte) 18)) {
            this.ad.ag(i, i2, i3, j);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(int i, int i2, int i3, long j) {
        try {
            if (az(i, (byte) -12)) {
                this.ad.ag(i, i2, i3, j);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jy.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void av(int i, int i2, int i3, long j) {
        if (!az(i, (byte) -77)) {
            this.ad.ak(i, 0, i2, i3, j);
            this.aq = ((1 << i) | (this.aq * 1276670293)) * -2005662723;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(lp lpVar, int i, int i2, int i3, int i4) {
        int[] ay = ad.ay(-304915776);
        int[] ap = lpVar.ap(-854940364);
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 < ay.length) {
                i5 = ay[i6];
                int i7 = ay[i6 + 1];
                if (i7 >= 0 && i7 < 5) {
                    int i8 = ay[i6 + 2];
                    int i9 = ap[0];
                    int i10 = ay[i6 + 3];
                    int i11 = ap[1];
                    long ad = gq.ad((byte) 29);
                    i8 = ((i8 - i9) * i) / i3;
                    i9 = ((i10 - i11) * i2) / i4;
                    switch (i5) {
                        case 0:
                            ap(i7, i8, i9, ad);
                            break;
                        case 1:
                        case 3:
                            ag(i7, i8, i9, ad);
                            break;
                        case 2:
                            au(i7, i8, i9, ad);
                            break;
                        default:
                            break;
                    }
                }
                i5 = i6 + 4;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(lp lpVar, int i, int i2, int i3, int i4) {
        int[] ay = ad.ay(1882679029);
        int[] ap = lpVar.ap(-1262512353);
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 < ay.length) {
                i5 = ay[i6];
                int i7 = ay[i6 + 1];
                if (i7 >= 0 && i7 < 5) {
                    int i8 = ay[i6 + 2];
                    int i9 = ap[0];
                    int i10 = ay[i6 + 3];
                    int i11 = ap[1];
                    long ad = gq.ad((byte) -100);
                    i8 = ((i8 - i9) * i) / i3;
                    i9 = ((i10 - i11) * i2) / i4;
                    switch (i5) {
                        case 0:
                            ap(i7, i8, i9, ad);
                            break;
                        case 1:
                        case 3:
                            ag(i7, i8, i9, ad);
                            break;
                        case 2:
                            au(i7, i8, i9, ad);
                            break;
                        default:
                            break;
                    }
                }
                i5 = i6 + 4;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(int i, int i2, int i3, long j) {
        if (az(i, (byte) 11)) {
            this.ad.as(i, 0, i2, i3, j);
            this.aq = ((1 << i) & (this.aq * -266519406)) * 1910707753;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean az(int i, byte b) {
        try {
            return ((this.aq * 1276670293) & (1 << i)) != 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jy.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ba(int i, int i2, int i3, long j) {
        if (az(i, (byte) -125)) {
            this.ad.ag(i, i2, i3, j);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bd(int i) {
        return ((1 << i) & (this.aq * -2036087283)) != 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(int i, int i2, int i3, long j) {
        if (az(i, (byte) 19)) {
            this.ad.ag(i, i2, i3, j);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bl(int i) {
        return ((1 << i) & (this.aq * -1759709915)) != 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bm(int i) {
        return ((1 << i) & (this.aq * 1276670293)) != 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bo(int i) {
        return ((1 << i) & (this.aq * -1385976506)) != 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bq(int i) {
        return ((1 << i) & (this.aq * 1276670293)) != 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(int i, int i2, int i3, long j) {
        if (az(i, (byte) 61)) {
            this.ad.ag(i, i2, i3, j);
        }
    }
}
