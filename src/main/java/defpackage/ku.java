package defpackage;

/* renamed from: ku */
public class ku extends eo {
    public static final int al = 3;
    static final int ba = 19136992;
    final boolean aq;

    public ku(boolean z) {
        try {
            this.aq = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ku.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int af(int i, hw hwVar, boolean z, int i2) {
        try {
            int[] iArr = hl.ae;
            int i3 = ds.am + 564452847;
            ds.am = i3;
            al aq = da.aq(iArr[i3 * -757592335], -550158556);
            int[] iArr2;
            int i4;
            String[] strArr;
            if (i == 2800) {
                iArr2 = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr2[(i4 * -757592335) - 1] = et.ar(hs.hy(aq, (byte) 94), 655550254);
                return 1;
            } else if (2801 == i) {
                iArr2 = hl.ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                i3 = iArr2[i4 * -757592335] - 1;
                if (aq.dz == null || i3 >= aq.dz.length || aq.dz[i3] == null) {
                    strArr = hl.ak;
                    i3 = hl.as - 1490481109;
                    hl.as = i3;
                    strArr[(i3 * -1883296125) - 1] = "";
                    return 1;
                }
                String[] strArr2 = hl.ak;
                int i5 = hl.as - 1490481109;
                hl.as = i5;
                strArr2[(i5 * -1883296125) - 1] = aq.dz[i3];
                return 1;
            } else if (i != 2802) {
                return 2;
            } else {
                if (aq.dg == null) {
                    strArr = hl.ak;
                    i3 = hl.as - 1490481109;
                    hl.as = i3;
                    strArr[(i3 * -1883296125) - 1] = "";
                    return 1;
                }
                String[] strArr3 = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr3[(i4 * -1883296125) - 1] = aq.dg;
                return 1;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ku.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ap((er) obj, (er) obj2, (byte) -96);
    }

    /* Access modifiers changed, original: 0000 */
    public int ap(er erVar, er erVar2, byte b) {
        try {
            return (client.ar * -2059975617 == erVar.aj * -356714521 && client.ar * -2059975617 == erVar2.aj * -356714521) ? this.aq ? erVar.ae((byte) 1).ar(erVar2.ae((byte) 1), 828804812) : erVar2.ae((byte) 1).ar(erVar.ae((byte) 1), 828804812) : aq(erVar, erVar2, 53133220);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ku.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int au(er erVar, er erVar2) {
        return (client.ar * -2059975617 == erVar.aj * -356714521 && client.ar * -2059975617 == erVar2.aj * -356714521) ? this.aq ? erVar.ae((byte) 1).ar(erVar2.ae((byte) 1), 828804812) : erVar2.ae((byte) 1).ar(erVar.ae((byte) 1), 828804812) : aq(erVar, erVar2, 684718931);
    }

    /* Access modifiers changed, original: 0000 */
    public int az(er erVar, er erVar2) {
        return (client.ar * -2059975617 == erVar.aj * -356714521 && client.ar * -2059975617 == erVar2.aj * -356714521) ? this.aq ? erVar.ae((byte) 1).ar(erVar2.ae((byte) 1), 828804812) : erVar2.ae((byte) 1).ar(erVar.ae((byte) 1), 828804812) : aq(erVar, erVar2, -469366321);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ap((er) obj, (er) obj2, (byte) 29);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ku.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
