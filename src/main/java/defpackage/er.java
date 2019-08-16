package defpackage;

import android.support.v4.view.MotionEventCompat;

/* renamed from: er */
public class er extends eg {
    public static final int ac = 64;
    static final int ay = 512;
    public static final int bc = 50;
    static int qy;
    public int ae;
    public int ai;
    public int aj;

    er() {
        try {
            this.aj = -538454999;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("er.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static fo[] ad(int i) {
        try {
            fo foVar = fo.aq;
            fo foVar2 = fo.al;
            fo foVar3 = fo.ad;
            fo foVar4 = fo.ar;
            return new fo[]{foVar, foVar2, foVar3, foVar4};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("er.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void bm(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 256 - i8;
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14 = -i4;
            while (i14 < 0) {
                int i15;
                int i16 = iArr2[i12];
                if (i16 != 0) {
                    i15 = iArr[i11];
                    if (i15 == 0) {
                        i15 = i11 + 1;
                        iArr[i11] = i16 | ((i10 - 48) << 24);
                    } else {
                        iArr[i11] = (((((i15 & 16711935) * i10) + ((i16 & 16711935) * i8)) & -16711936) + (16711680 & (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i15) * i10) + ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i16) * i8)))) >> 8;
                        i15 = i11 + 1;
                    }
                } else {
                    i15 = i11 + 1;
                }
                i14++;
                i12++;
                i11 = i15;
            }
            i11 += i6;
            i12 += i7;
        }
    }

    static void bx(byte b) {
        try {
            client.aq.acf(cz.ap((byte) 0), -198111027);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("er.bx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int be() {
        return this.aj * -356714521;
    }

    /* Access modifiers changed, original: 0000 */
    public void bg(int i, int i2, int i3) {
        try {
            this.aj = 538454999 * i;
            this.ai = 195607539 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("er.bg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bh() {
        return this.aj * -356714521;
    }

    public int bj() {
        return this.aj * 363183518;
    }

    public boolean bn() {
        return this.aj * -1680274553 > 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void br(int i, int i2) {
        this.aj = 538454999 * i;
        this.ai = -755762660 * i2;
    }

    public boolean bt() {
        return this.aj * -356714521 > 0;
    }

    public boolean bu(int i) {
        try {
            return this.aj * -356714521 > 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("er.bu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bw(int i, int i2) {
        this.aj = 538454999 * i;
        this.ai = 195607539 * i2;
    }

    public int bx(int i) {
        try {
            return this.aj * -356714521;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("er.bx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean by() {
        return this.aj * -356714521 > 0;
    }

    public boolean bz() {
        return this.aj * -356714521 > 0;
    }
}
