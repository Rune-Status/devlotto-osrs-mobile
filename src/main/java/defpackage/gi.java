package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;

/* renamed from: gi */
public class gi {
    static final int ad = 8;
    static final int aq = 8;
    public static final int ar = 64;
    public static final int bd = 33;
    public static final int bm = 31;
    static final int cc = 512;
    static int[] fc;
    static pd rz;

    gi() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gi.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static al ar(int i, int i2, int i3) {
        try {
            al aq = da.aq(i, -550158556);
            return i2 == -1 ? aq : (aq == null || aq.fo == null || i2 >= aq.fo.length) ? null : aq.fo[i2];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gi.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* renamed from: if */
    static void m218if(String str, boolean z, int i) {
        int i2 = 0;
        try {
            String toLowerCase = str.toLowerCase();
            short[] sArr = new short[16];
            int i3 = 0;
            int i4 = 0;
            while (i4 < dh.ag * -1586661463) {
                short[] sArr2;
                dh aq = gl.aq(i4, -717610332);
                if (z && !aq.ci) {
                    sArr2 = sArr;
                } else if (-1 != aq.bp * 518600683) {
                    sArr2 = sArr;
                } else if (aq.ao.toLowerCase().indexOf(toLowerCase) == -1) {
                    sArr2 = sArr;
                } else if (i3 >= Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
                    if.rt = -413134145;
                    ib.ra = null;
                    return;
                } else {
                    if (i3 >= sArr.length) {
                        sArr2 = new short[(sArr.length * 2)];
                        for (int i5 = 0; i5 < i3; i5++) {
                            sArr2[i5] = sArr[i5];
                        }
                    } else {
                        sArr2 = sArr;
                    }
                    sArr2[i3] = (short) i4;
                    i3++;
                }
                i4++;
                sArr = sArr2;
            }
            ib.ra = sArr;
            el.rj = 0;
            if.rt = 413134145 * i3;
            String[] strArr = new String[(if.rt * 697017025)];
            while (i2 < if.rt * 697017025) {
                strArr[i2] = gl.aq(sArr[i2], 1569933284).ao;
                i2++;
            }
            fo.ad(strArr, ib.ra, (byte) 15);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gi.if(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
