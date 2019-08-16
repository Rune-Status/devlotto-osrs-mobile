package defpackage;

import com.google.android.gms.common.util.GmsVersion;

/* renamed from: bw */
public abstract class bw {
    public static final int aj = 23;
    static boolean ar = true;
    static int au = 0;
    public static final int aw = 8;
    public static final int be = 57;
    static final int bo = 6;
    static final int ds = 2;
    static ef ei;

    bw() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bw.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void aq(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bw.aq(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    static void bg(int i, short s) {
        if (i != -1) {
            try {
                if (cs.al(i, -2136824533)) {
                    al[] alVarArr = dt.ae[i];
                    for (al alVar : alVarArr) {
                        if (alVar.ec != null) {
                            il ilVar = new il();
                            ilVar.ar = alVar;
                            ilVar.ad = alVar.ec;
                            ar.aq(ilVar, GmsVersion.VERSION_LONGHORN, -1768146270);
                        }
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bw.bg(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void ac(int i) {
    }

    public abstract bl ad(int i);

    public abstract by ae();

    public abstract void ag(bc bcVar, bs bsVar, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract bl ai();

    public abstract bl aj();

    public abstract void ak(bc bcVar, av avVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract void al(bc bcVar, bs bsVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract by am();

    public abstract void ap(bc bcVar, bs bsVar, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract by aq(byte b);

    public abstract void ar(bc bcVar, av avVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b);

    public abstract void as(bc bcVar, av avVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public void au(int i, int i2) {
    }

    public void aw(int i) {
    }

    public void ax(int i) {
    }

    public void az(int i) {
    }
}
