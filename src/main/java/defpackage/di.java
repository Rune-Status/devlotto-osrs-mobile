package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.jagex.jagex3.client.input.softkeyboard.al;

/* renamed from: di */
public class di {
    static int aj = 0;
    static ka ap = null;
    static final int at = 200;
    static final int aw = 8;
    public static final int ba = 28;
    static final int bc = 500;
    static final int og = 24624;
    public static ny rl;
    final int ad;
    final int aq;
    final int ar;

    di(int i, int i2, int i3) {
        try {
            this.ad = -1133321 * i;
            this.aq = -1052901385 * i2;
            this.ar = 830384953 * i3;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("di.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static al an(byte b) {
        try {
            al ac = client.aq.abx((byte) 13).ac(1, 2066806294);
            ac.av(hw.du, -424876299);
            return ac;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("di.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static dg aq(int i, int i2) {
        try {
            long j = (long) i;
            dg dgVar = (dg) dg.ar.ad(j);
            if (dgVar == null) {
                byte[] ar = dg.ad.ar(33, i, 1482264695);
                dgVar = new dg();
                if (ar != null) {
                    dgVar.ar(new lj(ar), (byte) 93);
                }
                dg.ar.ar(dgVar, j);
            }
            return dgVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("di.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void as(int i) {
        try {
            hm.dw = 0;
            bv.ak(hm.dw * -558950377, 1542437531);
            ip.ap(hm.dw * -558950377, (short) 300);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("di.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int au(int i, hw hwVar, boolean z, int i2) {
        al alVar;
        if (z) {
            try {
                alVar = lj.az;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("di.au(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        alVar = hl.au;
        int[] iArr;
        int i3;
        if (i == ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED) {
            iArr = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = alVar.bd * 562220279;
            return 1;
        } else if (i == 1501) {
            iArr = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = alVar.bo * -1014301405;
            return 1;
        } else if (1502 == i) {
            iArr = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = alVar.bl * 1272191791;
            return 1;
        } else if (1503 == i) {
            iArr = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = alVar.bf * 1813264797;
            return 1;
        } else if (i == 1504) {
            iArr = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = alVar.bv ? 1 : 0;
            return 1;
        } else if (i != 1505) {
            return 2;
        } else {
            iArr = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr[(i3 * -757592335) - 1] = alVar.bc * -38514547;
            return 1;
        }
    }
}
