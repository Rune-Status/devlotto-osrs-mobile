package defpackage;

import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.view.PointerIconCompat;
import java.util.Comparator;

/* renamed from: jf */
public class jf implements Comparator {
    public static final int bi = 6;
    static ee[] gr;
    final boolean ad;

    public jf(boolean z) {
        try {
            this.ad = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jf.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0132=Splitter:B:42:0x0132, B:32:0x0114=Splitter:B:32:0x0114, B:50:0x0148=Splitter:B:50:0x0148} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int aj(int i, hw hwVar, boolean z, int i2) {
        int[] iArr;
        int i3;
        al aq;
        boolean z2 = false;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            try {
                iArr = hl.ae;
                i3 = ds.am + 564452847;
                ds.am = i3;
                int i4 = iArr[i3 * -757592335];
                aq = da.aq(i4, -550158556);
                i3 = i4;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jf.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        i3 = -1;
        aq = z ? lj.az : hl.au;
        int i5;
        if (i == 1000) {
            ds.am -= 2037155908;
            aq.ba = hl.ae[ds.am * -757592335] * 1685885569;
            aq.bs = hl.ae[(ds.am * -757592335) + 1] * -1450929481;
            aq.ab = hl.ae[(ds.am * -757592335) + 2] * 1932562981;
            aq.av = hl.ae[(ds.am * -757592335) + 3] * -122098513;
            da.gk(aq, (byte) 2);
            client.aq.fo(aq, 290825320);
            if (-1 == i3 || aq.af * 1845699613 != 0) {
                return 1;
            }
            bm.fe(dt.ae[i3 >> 16], aq, false, -922502376);
            return 1;
        } else if (1001 == i) {
            ds.am -= 2037155908;
            aq.bm = hl.ae[ds.am * -757592335] * -846283905;
            aq.bq = hl.ae[(ds.am * -757592335) + 1] * -1937288673;
            aq.at = hl.ae[(ds.am * -757592335) + 2] * -1629038693;
            aq.bk = hl.ae[(ds.am * -757592335) + 3] * -458681677;
            da.gk(aq, (byte) 2);
            client.aq.fo(aq, 1606890893);
            if (-1 == i3 || aq.af * 1845699613 != 0) {
                return 1;
            }
            bm.fe(dt.ae[i3 >> 16], aq, false, -536923068);
            return 1;
        } else if (i == 1003) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            if (z2 == aq.bv) {
                return 1;
            }
            aq.bv = z2;
            da.gk(aq, (byte) 2);
            return 1;
        } else if (ce.cn == i) {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr[i5 * -757592335] == 1) {
                z2 = true;
            }
            aq.gi = z2;
            return 1;
        } else if (i != PointerIconCompat.TYPE_CELL) {
            return 2;
        } else {
            iArr = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            aq.gn = iArr[i5 * -757592335] == 1;
            return 1;
        }
    }

    public static ef[] aq(kh khVar, int i, int i2, int i3) {
        try {
            return !bv.ah(khVar, i, i2, 2083444197) ? null : cw.ax(2131689870);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jf.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void cx(hv hvVar, int i, int i2, int i3) {
        try {
            if (i == hvVar.cs * -1099198911 && i != -1) {
                int i4 = gn.aq(i, 1686872705).ao * -1484717029;
                if (1 == i4) {
                    hvVar.cr = 0;
                    hvVar.ca = 0;
                    hvVar.cx = i2 * 214456183;
                    hvVar.ct = 0;
                }
                if (i4 == 2) {
                    hvVar.ct = 0;
                }
            } else if (i == -1 || -1 == hvVar.cs * -1099198911 || gn.aq(i, 1974544003).au * 738694559 >= gn.aq(hvVar.cs * -1099198911, 1533042501).au * 738694559) {
                hvVar.cs = 1835762113 * i;
                hvVar.cr = 0;
                hvVar.ca = 0;
                hvVar.cx = i2 * 214456183;
                hvVar.ct = 0;
                hvVar.dn = hvVar.da * 85658191;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jf.cx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(eg egVar, eg egVar2, int i) {
        try {
            return this.ad ? egVar.ae((byte) 1).ar(egVar2.ae((byte) 1), 828804812) : egVar2.ae((byte) 1).ar(egVar.ae((byte) 1), 828804812);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jf.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ad((eg) obj, (eg) obj2, 1519412951);
    }

    /* Access modifiers changed, original: 0000 */
    public int aj(eg egVar, eg egVar2) {
        return this.ad ? egVar.ae((byte) 1).ar(egVar2.ae((byte) 1), 828804812) : egVar2.ae((byte) 1).ar(egVar.ae((byte) 1), 828804812);
    }

    /* Access modifiers changed, original: 0000 */
    public int al(eg egVar, eg egVar2) {
        return this.ad ? egVar.ae((byte) 1).ar(egVar2.ae((byte) 1), 828804812) : egVar2.ae((byte) 1).ar(egVar.ae((byte) 1), 828804812);
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(eg egVar, eg egVar2) {
        return this.ad ? egVar.ae((byte) 1).ar(egVar2.ae((byte) 1), 828804812) : egVar2.ae((byte) 1).ar(egVar.ae((byte) 1), 828804812);
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(eg egVar, eg egVar2) {
        return this.ad ? egVar.ae((byte) 1).ar(egVar2.ae((byte) 1), 828804812) : egVar2.ae((byte) 1).ar(egVar.ae((byte) 1), 828804812);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ad((eg) obj, (eg) obj2, 1581831989);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jf.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jf.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }
}
