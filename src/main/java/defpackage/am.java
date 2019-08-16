package defpackage;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: am */
public class am {
    static byte[][][] al = null;
    static File aq = null;
    static final int au = 13;
    public static int jy;
    static al[] ls;

    am() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("am.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean aa(int i) {
        return ((i >> 20) & 1) != 0;
    }

    public static boolean ab(int i) {
        return ((i >> 28) & 1) != 0;
    }

    public static boolean ac(int i) {
        return ((i >> 20) & 1) != 0;
    }

    public static final hd ae(mr mrVar, int i, int i2, int i3) {
        int i4 = 2;
        try {
            if (hd.ad * -754139271 == 0) {
                throw new IllegalStateException();
            } else if (i < 0 || i >= 2) {
                throw new IllegalArgumentException();
            } else {
                if (i2 < 256) {
                    i2 = 256;
                }
                try {
                    hd ad = hd.ak.ad(2029361096);
                    if (!hd.aq) {
                        i4 = 1;
                    }
                    ad.ag = new int[(i4 * 256)];
                    ad.aw(-698288233);
                    ad.az = ((i2 & -1024) + 1024) * 2038624033;
                    if (ad.az * 1742034145 > 16384) {
                        ad.az = -1144504320;
                    }
                    ad.ac(ad.az * 1742034145, -134091409);
                    if (hd.aj * 1436800795 > 0 && hd.ai == null) {
                        hd.ai = new gd();
                        hd.al = Executors.newScheduledThreadPool(1);
                        hd.al.scheduleAtFixedRate(hd.ai, 0, 1, TimeUnit.MILLISECONDS);
                    }
                    if (hd.ai == null) {
                        return ad;
                    }
                    if (hd.ai.ad[i] == null) {
                        hd.ai.ad[i] = ad;
                        return ad;
                    }
                    throw new IllegalArgumentException();
                } catch (Throwable th) {
                    return new gg();
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("am.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean af(int i) {
        return ((i >> 21) & 1) != 0;
    }

    public static boolean ag(int i, int i2) {
        return ((i >> (i2 + 1)) & 1) != 0;
    }

    public static boolean ah(int i) {
        return ((i >> 21) & 1) != 0;
    }

    public static boolean an(int i) {
        return ((i >> 28) & 1) != 0;
    }

    public static boolean ao(int i) {
        return ((i >> 20) & 1) != 0;
    }

    public static boolean ap(int i, int i2) {
        return ((i >> (i2 + 1)) & 1) != 0;
    }

    public static de aq(int i, int i2) {
        try {
            long j = (long) i;
            de deVar = (de) de.aq.ad(j);
            if (deVar == null) {
                byte[] ar = de.ad.ar(34, i, 1429747033);
                deVar = new de();
                if (ar != null) {
                    deVar.al(new lj(ar), -292601319);
                }
                deVar.ar(-1929605007);
                de.aq.ar(deVar, j);
            }
            return deVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("am.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void aq(int i, int i2, int i3) {
        int i4 = 0;
        try {
            int[] iArr = new int[4];
            int[] iArr2 = new int[4];
            iArr[0] = i;
            iArr2[0] = i2;
            int i5 = 1;
            while (i4 < 4) {
                if (i != ii.ak[i4]) {
                    iArr[i5] = ii.ak[i4];
                    iArr2[i5] = ii.am[i4];
                    i5++;
                }
                i4++;
            }
            ii.ak = iArr;
            ii.am = iArr2;
            by.ar(ii.aj, 0, ii.aj.length - 1, ii.ak, ii.am, -2025383810);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("am.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean at(int i) {
        return ((i >> 29) & 1) != 0;
    }

    public static boolean au(int i, int i2) {
        return ((i >> (i2 + 1)) & 1) != 0;
    }

    public static boolean av(int i) {
        return ((i >> 29) & 1) != 0;
    }

    public static int aw(int i) {
        return (i >> 17) & 7;
    }

    public static int ax(int i) {
        return (i >> 17) & 7;
    }

    public static boolean ay(int i) {
        return ((i >> 28) & 1) != 0;
    }

    public static int az(int i) {
        return (i >> 11) & 702847109;
    }

    public static boolean ba(int i) {
        return ((i >> 30) & 1) != 0;
    }

    public static boolean bk(int i) {
        return ((i >> 29) & 1) != 0;
    }

    public static boolean bm(int i) {
        return ((i >> 31) & 1) != 0;
    }

    public static boolean bq(int i) {
        return ((i >> 31) & 1) != 0;
    }

    public static boolean bs(int i) {
        return ((i >> 31) & 1) != 0;
    }
}
