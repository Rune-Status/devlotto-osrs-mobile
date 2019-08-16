package defpackage;

/* renamed from: ko */
public class ko {
    public static final int ad = 1;
    static int ae;
    static kh ai;
    static int aj;
    static kh aq;
    static int as;
    static gq au;

    ko() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ko.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aa(int i) {
        if (aj * -557713751 != 0) {
            mo.ak = -779850513 * i;
        } else {
            ji.al.ad(i, (byte) 107);
        }
    }

    public static void ab(int i, kh khVar, int i2, int i3, int i4, boolean z) {
        aj = -515568231;
        ai = khVar;
        ae = -1153851252 * i2;
        ne.am = 1291550091 * i3;
        mo.ak = -779850513 * i4;
        fx.ag = z;
        as = -783619209 * i;
    }

    public static void ac(kh khVar, int i, int i2, int i3, boolean z) {
        aj = -515568231;
        ai = khVar;
        ae = 1495124335 * i;
        ne.am = 353296041 * i2;
        mo.ak = -779850513 * i3;
        fx.ag = z;
        as = 982029596;
    }

    static long ad(CharSequence charSequence, int i) {
        try {
            int length = charSequence.length();
            long j = 0;
            for (int i2 = 0; i2 < length; i2++) {
                j *= 37;
                char charAt = charSequence.charAt(i2);
                if (charAt >= 'A' && charAt <= 'Z') {
                    j += (long) ((charAt + 1) - 65);
                } else if (charAt >= 'a' && charAt <= 'z') {
                    j += (long) ((charAt + 1) - 97);
                } else if (charAt >= '0' && charAt <= '9') {
                    j += (long) ((charAt + 27) - 48);
                }
                if (j >= 177917621779460413L) {
                    break;
                }
            }
            while (j % 37 == 0 && j != 0) {
                j /= 37;
            }
            return j;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ko.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(int[] iArr, int[] iArr2, int i) {
        if (iArr == null || iArr2 == null) {
            try {
                nx.ae = null;
                mn.am = null;
                ce.ak = (byte[][][]) null;
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ko.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        nx.ae = iArr;
        mn.am = new int[iArr.length];
        ce.ak = new byte[iArr.length][][];
        for (int i2 = 0; i2 < nx.ae.length; i2++) {
            ce.ak[i2] = new byte[iArr2[i2]][];
        }
    }

    public static void af() {
        ji.al.ap(-640650544);
        aj = -515568231;
        ai = null;
    }

    public static void ah() {
        ji.al.ap(-640650544);
        aj = -515568231;
        ai = null;
    }

    public static void an(int i, kh khVar, String str, String str2, int i2, boolean z) {
        int af = khVar.af(str, -543126033);
        lh.ae(i, khVar, af, khVar.ay(af, str2, (byte) 53), i2, z, (byte) 1);
    }

    public static void ao() {
        ji.al.ap(-640650544);
        aj = -515568231;
        ai = null;
    }

    public static void ap(kh khVar, String str, String str2, int i, boolean z) {
        int af = khVar.af(str, -1870935897);
        eb.ar(khVar, af, khVar.ay(af, str2, (byte) 44), i, z, -1833431893);
    }

    public static void at(int i, kh khVar, int i2, int i3, int i4, boolean z) {
        aj = -515568231;
        ai = khVar;
        ae = -900648995 * i2;
        ne.am = 1291550091 * i3;
        mo.ak = -779850513 * i4;
        fx.ag = z;
        as = -1936313519 * i;
    }

    public static void au(kh khVar, String str, String str2, int i, boolean z) {
        int af = khVar.af(str, -668665613);
        eb.ar(khVar, af, khVar.ay(af, str2, (byte) 24), i, z, -1643140044);
    }

    public static void av(int i, kh khVar, int i2, int i3, int i4, boolean z) {
        aj = -515568231;
        ai = khVar;
        ae = 1495124335 * i2;
        ne.am = 1291550091 * i3;
        mo.ak = -779850513 * i4;
        fx.ag = z;
        as = -783619209 * i;
    }

    public static void aw(kh khVar, int i, int i2, int i3, boolean z) {
        aj = -515568231;
        ai = khVar;
        ae = -1147779628 * i;
        ne.am = -364396516 * i2;
        mo.ak = -853328461 * i3;
        fx.ag = z;
        as = 2123225200;
    }

    public static void ax(kh khVar, String str, String str2, int i, boolean z) {
        int af = khVar.af(str, 619462);
        eb.ar(khVar, af, khVar.ay(af, str2, (byte) -11), i, z, -2078951090);
    }

    public static void ay(int i, kh khVar, String str, String str2, int i2, boolean z) {
        int af = khVar.af(str, -1807568087);
        lh.ae(i, khVar, af, khVar.ay(af, str2, (byte) -1), i2, z, (byte) 1);
    }

    public static void az(kh khVar, String str, String str2, int i, boolean z) {
        int af = khVar.af(str, -1437116534);
        eb.ar(khVar, af, khVar.ay(af, str2, (byte) 1), i, z, -2139598362);
    }

    public static boolean ba() {
        return aj * -557713751 != 0 ? true : ji.al.au(-1746595456);
    }

    public static void bd() {
        try {
            if (aj * -1011912026 == 1) {
                int aq = ji.al.aq((byte) 11);
                if (aq <= 0 || !ji.al.au(-2130261982)) {
                    ji.al.ap(-640650544);
                    ji.al.aj((short) -26502);
                    if (ai != null) {
                        aj = -1031136462;
                    } else {
                        aj = 0;
                    }
                    di.ap = null;
                    au = null;
                    return;
                }
                aq -= as * 655711815;
                if (aq < 0) {
                    aq = 0;
                }
                ji.al.ad(aq, (byte) 111);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ji.al.ap(-640650544);
            aj = 0;
            di.ap = null;
            au = null;
            ai = null;
        }
    }

    public static void bk(int i) {
        aj = -515568231;
        ai = null;
        ae = -1495124335;
        ne.am = -1291550091;
        mo.ak = 0;
        fx.ag = false;
        as = -783619209 * i;
    }

    public static boolean bl() {
        try {
            if (aj * 330078020 == 2) {
                if (di.ap == null) {
                    di.ap = ka.ad(ai, ae * 247580, ne.am * -775929309);
                    if (di.ap == null) {
                        return false;
                    }
                }
                if (au == null) {
                    au = new gq(en.ar, aq);
                }
                if (ji.al.ar(di.ap, fg.ad, au, -108286494, -260596706)) {
                    ji.al.al(1696181433);
                    ji.al.ad(mo.ak * 223887887, (byte) 104);
                    ji.al.as(di.ap, fx.ag, 1262545265);
                    aj = 0;
                    di.ap = null;
                    au = null;
                    ai = null;
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            ji.al.ap(-640650544);
            aj = 0;
            di.ap = null;
            au = null;
            ai = null;
        }
        return false;
    }

    public static boolean bm() {
        return aj * -557713751 != 0 ? true : ji.al.au(180942312);
    }

    public static boolean bo() {
        try {
            if (aj * -557713751 == 2) {
                if (di.ap == null) {
                    di.ap = ka.ad(ai, ae * 1134540175, ne.am * -775929309);
                    if (di.ap == null) {
                        return false;
                    }
                }
                if (au == null) {
                    au = new gq(en.ar, aq);
                }
                if (ji.al.ar(di.ap, fg.ad, au, 22050, -476739578)) {
                    ji.al.al(1644518559);
                    ji.al.ad(mo.ak * 223887887, (byte) 86);
                    ji.al.as(di.ap, fx.ag, 1262545265);
                    aj = 0;
                    di.ap = null;
                    au = null;
                    ai = null;
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            ji.al.ap(-640650544);
            aj = 0;
            di.ap = null;
            au = null;
            ai = null;
        }
        return false;
    }

    public static boolean bq() {
        return aj * -557713751 != 0 ? true : ji.al.au(1088540870);
    }

    public static boolean bs() {
        return aj * -557713751 != 0 ? true : ji.al.au(-495754512);
    }
}
