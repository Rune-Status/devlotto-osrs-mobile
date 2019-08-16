package defpackage;

import java.security.SecureRandom;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: ho */
public class ho {
    public static final int ae = 16;
    static kv cl = null;
    static final int ey = 14;
    static int mj;
    ExecutorService ad;
    Future aq;

    ho() {
        try {
            this.ad = Executors.newSingleThreadExecutor();
            this.aq = this.ad.submit(new iu());
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ho.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ak(Collection collection, byte b) {
        try {
            collection.add(dw.al);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ho.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int aw(int i, hw hwVar, boolean z, byte b) {
        al alVar;
        if (z) {
            try {
                alVar = lj.az;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ho.aw(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        alVar = hl.au;
        int[] iArr;
        int i2;
        int i3;
        String[] strArr;
        if (1800 == i) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = et.ar(hs.hy(alVar, (byte) 92), 272335607);
            return 1;
        } else if (i == 1801) {
            iArr = hl.ae;
            i2 = ds.am + 564452847;
            ds.am = i2;
            i3 = iArr[i2 * -757592335] - 1;
            if (alVar.dz == null || i3 >= alVar.dz.length || alVar.dz[i3] == null) {
                strArr = hl.ak;
                i3 = hl.as - 1490481109;
                hl.as = i3;
                strArr[(i3 * -1883296125) - 1] = "";
                return 1;
            }
            String[] strArr2 = hl.ak;
            int i4 = hl.as - 1490481109;
            hl.as = i4;
            strArr2[(i4 * -1883296125) - 1] = alVar.dz[i3];
            return 1;
        } else if (1802 != i) {
            return 2;
        } else {
            if (alVar.dg == null) {
                strArr = hl.ak;
                i3 = hl.as - 1490481109;
                hl.as = i3;
                strArr[(i3 * -1883296125) - 1] = "";
                return 1;
            }
            String[] strArr3 = hl.ak;
            i2 = hl.as - 1490481109;
            hl.as = i2;
            strArr3[(i2 * -1883296125) - 1] = alVar.dg;
            return 1;
        }
    }

    static void bt(int i, int i2, int i3) {
        try {
            if (client.ph * -413365419 != 0 && -1 != i) {
                eb.ar(cy.dl, i, 0, -413365419 * client.ph, false, -2092352892);
                client.pv = true;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ho.bt(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i) {
        try {
            this.ad.shutdown();
            this.ad = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ho.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ae() {
        return this.aq.isDone();
    }

    /* Access modifiers changed, original: 0000 */
    public SecureRandom ag() {
        try {
            return (SecureRandom) this.aq.get();
        } catch (Exception e) {
            return gd.ad((byte) 51);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai() {
        this.ad.shutdown();
        this.ad = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void aj() {
        this.ad.shutdown();
        this.ad = null;
    }

    /* Access modifiers changed, original: 0000 */
    public SecureRandom ak() {
        try {
            return (SecureRandom) this.aq.get();
        } catch (Exception e) {
            return gd.ad((byte) -120);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al() {
        this.ad.shutdown();
        this.ad = null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean am() {
        return this.aq.isDone();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean aq(byte b) {
        try {
            return this.aq.isDone();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ho.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public SecureRandom ar(int i) {
        try {
            return (SecureRandom) this.aq.get();
        } catch (Exception e) {
            try {
                return gd.ad((byte) -55);
            } catch (RuntimeException e2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ho.ar(");
                stringBuilder.append(')');
                throw mv.aq(e2, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public SecureRandom as() {
        try {
            return (SecureRandom) this.aq.get();
        } catch (Exception e) {
            return gd.ad((byte) 9);
        }
    }
}
