package defpackage;

import android.support.v4.internal.view.SupportMenu;
import java.util.Collection;

/* renamed from: da */
public class da extends mp {
    static kh ad;
    static kh ak;
    static gz aq = new gz(64, null);
    public static hv jc;
    boolean ai;
    public String aj;
    public int al;
    char ar;

    da() {
        try {
            this.ai = true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("da.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void af(Collection collection) {
        collection.add(aq);
    }

    static boolean af(kh khVar, int i, byte b) {
        try {
            byte[] as = khVar.as(i, (byte) 0);
            if (as == null) {
                return false;
            }
            ab.ay(as, 761824442);
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("da.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static da ag(int i) {
        long j = (long) i;
        da daVar = (da) aq.ad(j);
        if (daVar == null) {
            byte[] ar = ad.ar(11, i, 1390145176);
            daVar = new da();
            if (ar != null) {
                daVar.al(new lj(ar), (byte) 1);
            }
            daVar.ar(-2139263953);
            aq.ar(daVar, j);
        }
        return daVar;
    }

    public static da ak(int i) {
        long j = (long) i;
        da daVar = (da) aq.ad(j);
        if (daVar == null) {
            byte[] ar = ad.ar(11, i, 1014448367);
            daVar = new da();
            if (ar != null) {
                daVar.al(new lj(ar), (byte) 1);
            }
            daVar.ar(-2139263953);
            aq.ar(daVar, j);
        }
        return daVar;
    }

    public static da am(int i) {
        long j = (long) i;
        da daVar = (da) aq.ad(j);
        if (daVar == null) {
            byte[] ar = ad.ar(11, i, 2017481893);
            daVar = new da();
            if (ar != null) {
                daVar.al(new lj(ar), (byte) 1);
            }
            daVar.ar(-2139263953);
            aq.ar(daVar, j);
        }
        return daVar;
    }

    public static void an(Collection collection) {
        collection.add(aq);
    }

    static final int ao(int i, int i2, byte b) {
        int i3 = 2;
        if (-1 == i) {
            return 12345678;
        }
        try {
            int i4 = ((i & 127) * i2) / 128;
            if (i4 >= 2) {
                i3 = i4 > 126 ? 126 : i4;
            }
            return i3 + (65408 & i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("da.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static al aq(int i, int i2) {
        int i3 = i >> 16;
        int i4 = SupportMenu.USER_MASK & i;
        try {
            return ((dt.ae[i3] == null || dt.ae[i3][i4] == null) && !cs.al(i3, -2098224040)) ? null : dt.ae[i3][i4];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("da.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static da as(int i) {
        long j = (long) i;
        da daVar = (da) aq.ad(j);
        if (daVar == null) {
            byte[] ar = ad.ar(11, i, 1469348998);
            daVar = new da();
            if (ar != null) {
                daVar.al(new lj(ar), (byte) 1);
            }
            daVar.ar(-2139263953);
            aq.ar(daVar, j);
        }
        return daVar;
    }

    public static void ay(Collection collection) {
        collection.add(aq);
    }

    public static void gk(al alVar, byte b) {
        try {
            if (client.nm * -906072549 == alVar.go * 1922158365) {
                client.nk[alVar.gl * -759353647] = true;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("da.gk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean aa() {
        return this.ar == 's';
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(lj ljVar, int i) {
        if (i == 1) {
            this.ar = ig.ar(ljVar.ay(1990621657), (byte) -14);
        } else if (2 == i) {
            this.al = ljVar.at((byte) -41) * 1856127597;
        } else if (i == 4) {
            this.ai = false;
        } else if (i == 5) {
            this.aj = ljVar.bm(1944125482);
        }
    }

    public boolean ah() {
        return this.ar == 's';
    }

    public boolean ai(int i) {
        try {
            return this.ar == 's';
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("da.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(lj ljVar, int i, int i2) {
        if (i == 1) {
            try {
                this.ar = ig.ar(ljVar.ay(2114302545), (byte) 30);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("da.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (2 == i) {
            this.al = ljVar.at((byte) -98) * 1856127597;
        } else if (i == 4) {
            this.ai = false;
        } else if (i == 5) {
            this.aj = ljVar.bm(1046597518);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, byte b) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    aj(ljVar, af, 861398285);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("da.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public boolean ao() {
        return this.ar == 's';
    }

    /* Access modifiers changed, original: 0000 */
    public void ap() {
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i) {
    }

    /* Access modifiers changed, original: 0000 */
    public void au() {
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, -1797832033);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, 139232719);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az() {
    }
}
