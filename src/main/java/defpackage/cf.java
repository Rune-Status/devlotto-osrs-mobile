package defpackage;

import android.support.v4.view.InputDeviceCompat;

/* renamed from: cf */
public abstract class cf {
    static kh ap;
    static int ts;
    public final ag ad;
    int al;
    public final ag aq;
    int ar;

    cf(ag agVar, ag agVar2) {
        try {
            this.aq = agVar;
            this.ad = agVar2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cf.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ad(int i, int i2, int i3) {
        int i4 = 1;
        while (i2 > 1) {
            if ((i2 & 1) != 0) {
                i4 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        return i2 == 1 ? i4 * i : i4;
    }

    public static boolean ag(char c, int i) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    static dn[] aq(int i) {
        try {
            dn dnVar = dn.aq;
            dn dnVar2 = dn.ad;
            dn dnVar3 = dn.ar;
            return new dn[]{dnVar, dnVar2, dnVar3};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cf.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ee[] as(kh khVar, String str, String str2, int i) {
        try {
            int af = khVar.af(str, -1722117767);
            return ec.aj(khVar, af, khVar.ay(af, str2, (byte) -1), 1896946038);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cf.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void bj(int i) {
        try {
            String str;
            he.ac(10, (byte) 102);
            hm.cu = -1123687120;
            if (hm.dd == null || hm.dd.isEmpty()) {
                str = go.jc;
            } else {
                str = String.format(go.jb, new Object[]{hm.dd});
            }
            lv.bs(go.jy, go.jj, str, -1804322940);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cf.bj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void bl(ii iiVar, int i) {
        try {
            if (iiVar.as(2140430810) != client.ak) {
                client.ak = iiVar.as(2135388117);
                gl.ab(iiVar.as(2142679161), (byte) -86);
                client.aq.abx((byte) 29).bq(ft.aw, iiVar.as(2133920206), 403111112);
            }
            cj.dk = iiVar.az;
            client.ar = iiVar.ag * -2101303893;
            client.al = iiVar.ap * -1749213625;
            de.dw = (client.ai * 975409481 == 0 ? 43594 : nq.ad + (iiVar.ag * -936955627)) * -1585831627;
            dt.dg = (client.ai * 975409481 == 0 ? 443 : (iiVar.ag * -936955627) + 50000) * -1552481665;
            is.dz = de.dw * 1119773237;
            hm.dn = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cf.bl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ew(boolean z, lv lvVar, int i) {
        while (lvVar.jx(client.eb.am * -271485777, 902907202) >= 27) {
            try {
                int jm = lvVar.jm(15, -1755746638);
                if (jm == 32767) {
                    break;
                }
                Object obj;
                int jm2;
                int i2;
                if (client.eg[jm] == null) {
                    client.eg[jm] = new iq();
                    obj = 1;
                } else {
                    obj = null;
                }
                iq iqVar = client.eg[jm];
                int[] iArr = client.er;
                int i3 = client.ed + 1629279501;
                client.ed = i3;
                iArr[(i3 * -1087962683) - 1] = jm;
                iqVar.dv = client.bj * 327012327;
                if (z) {
                    jm2 = lvVar.jm(8, -1265555198);
                    if (jm2 > 127) {
                        i3 = jm2 + InputDeviceCompat.SOURCE_ANY;
                    }
                    i3 = jm2;
                } else {
                    jm2 = lvVar.jm(5, -101996060);
                    if (jm2 > 15) {
                        i3 = jm2 - 32;
                    }
                    i3 = jm2;
                }
                int jm3 = lvVar.jm(1, -679212896);
                jm2 = client.kt[lvVar.jm(3, 362439624)];
                if (obj != null) {
                    jm2 *= 28472477;
                    iqVar.bo = jm2;
                    iqVar.dl = jm2 * -1594720355;
                }
                if (1 == lvVar.jm(1, -1455052365)) {
                    iArr = client.ee;
                    i2 = client.eu + 36070333;
                    client.eu = i2;
                    iArr[(i2 * -434278507) - 1] = jm;
                }
                if (z) {
                    jm2 = lvVar.jm(8, 1835260473);
                    if (jm2 > 127) {
                        i2 = jm2 + InputDeviceCompat.SOURCE_ANY;
                    }
                    i2 = jm2;
                } else {
                    jm2 = lvVar.jm(5, -312080715);
                    if (jm2 > 15) {
                        i2 = jm2 - 32;
                    }
                    i2 = jm2;
                }
                iqVar.ad = ln.aq(lvVar.jm(14, -2010338679), -1831247624);
                iqVar.bl = iqVar.ad.ae * 754611297;
                iqVar.df = iqVar.ad.bm * 1365923169;
                if (iqVar.df * -1865295889 == 0) {
                    iqVar.bo = 0;
                }
                iqVar.bv = iqVar.ad.au * -807775609;
                iqVar.bg = iqVar.ad.az * -1796920383;
                iqVar.bu = iqVar.ad.ax * -1696768433;
                iqVar.bw = iqVar.ad.aw * -267583933;
                iqVar.bb = iqVar.ad.as * -1181446935;
                iqVar.bi = iqVar.ad.ag * 1924889079;
                iqVar.bc = iqVar.ad.ap * 1354581455;
                iqVar.aq(i3 + da.jc.db[0], i2 + da.jc.dc[0], 1 == jm3, 1471734565);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cf.ew(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        lvVar.js(-1488643978);
    }

    public abstract cx aa();

    /* Access modifiers changed, original: 0000 */
    public boolean ab(int i, int i2) {
        if (!ai(-194368061)) {
            return false;
        }
        dy aq = jg.aq(aq((byte) -80), (byte) 106);
        int al = al(971944642);
        int aj = aj(-710585697);
        switch (aq.ao.al * 2031829131) {
            case 0:
                al /= 2;
                if (i < (this.ar * 873510662) - al || i > al + (this.ar * -1990240936)) {
                    return false;
                }
            case 1:
                if (i <= (this.ar * 702431797) - al || i > this.ar * -1863180211) {
                    return false;
                }
            case 2:
                if (i < this.ar * 1215352869 || i >= al + (this.ar * -1659852431)) {
                    return false;
                }
        }
        switch (aq.ah.al * -1223343934) {
            case 0:
                al = aj / 2;
                if (i2 < (this.al * 373754673) - al || i2 > (this.al * 373754673) + al) {
                    return false;
                }
            case 1:
                if (i2 < this.al * 373754673 || i2 >= (this.al * 541150392) + aj) {
                    return false;
                }
            case 2:
                if (i2 <= (this.al * 373754673) - aj || i2 > this.al * -815836725) {
                    return false;
                }
        }
        return true;
    }

    public abstract cx ac();

    /* Access modifiers changed, original: 0000 */
    public boolean ad(int i, int i2, byte b) {
        try {
            return ae(i, i2, (short) 255) || am(i, i2, (byte) 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cf.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ae(int i, int i2, short s) {
        try {
            if (!ai(1075997286)) {
                return false;
            }
            dy aq = jg.aq(aq((byte) -6), (byte) 19);
            int al = al(-891199191);
            int aj = aj(-2075643866);
            switch (aq.ao.al * 2031829131) {
                case 0:
                    if (i < (this.ar * 702431797) - (al / 2)) {
                        return false;
                    }
                    if (i > (al / 2) + (this.ar * 702431797)) {
                        return false;
                    }
                    break;
                case 1:
                    if (i <= (this.ar * 702431797) - al) {
                        return false;
                    }
                    if (i > this.ar * 702431797) {
                        return false;
                    }
                    break;
                case 2:
                    if (i < this.ar * 702431797) {
                        return false;
                    }
                    if (i >= al + (this.ar * 702431797)) {
                        return false;
                    }
                    break;
            }
            switch (aq.ah.al * 1526243869) {
                case 0:
                    if (i2 < (this.al * 373754673) - (aj / 2) || i2 > (this.al * 373754673) + (aj / 2)) {
                        return false;
                    }
                case 1:
                    if (i2 < this.al * 373754673) {
                        return false;
                    }
                    if (i2 >= (this.al * 373754673) + aj) {
                        return false;
                    }
                    break;
                case 2:
                    if (i2 <= (this.al * 373754673) - aj) {
                        return false;
                    }
                    if (i2 > this.al * 373754673) {
                        return false;
                    }
                    break;
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cf.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract int af();

    /* Access modifiers changed, original: 0000 */
    public boolean ag(int i, int i2) {
        return ae(i, i2, (short) 255) || am(i, i2, (byte) 0);
    }

    public abstract int ah();

    /* Access modifiers changed, original: 0000 */
    public boolean ai(int i) {
        try {
            return aq((byte) 4) >= 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cf.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public abstract int aj(int i);

    /* Access modifiers changed, original: 0000 */
    public boolean ak(int i, int i2) {
        return ae(i, i2, (short) 255) || am(i, i2, (byte) 0);
    }

    public abstract int al(int i);

    /* Access modifiers changed, original: 0000 */
    public boolean am(int i, int i2, byte b) {
        try {
            cx ar = ar(930346503);
            if (ar == null || i < (this.ar * 702431797) - ((ar.aq * 1941420509) / 2) || i > (this.ar * 702431797) + ((ar.aq * 1941420509) / 2) || i2 < this.al * 373754673) {
                return false;
            }
            return i2 <= (ar.ar * 2118315349) + (this.al * 373754673);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cf.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean an() {
        return aq((byte) 27) >= 0;
    }

    public abstract int ao();

    /* Access modifiers changed, original: 0000 */
    public boolean ap(int i, int i2) {
        return ae(i, i2, (short) 255) || am(i, i2, (byte) 0);
    }

    public abstract int aq(byte b);

    public abstract cx ar(int i);

    /* Access modifiers changed, original: 0000 */
    public boolean as(int i, int i2) {
        return ae(i, i2, (short) 255) || am(i, i2, (byte) 0);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean at(int i, int i2) {
        if (!ai(-322604101)) {
            return false;
        }
        dy aq = jg.aq(aq((byte) -86), Byte.MAX_VALUE);
        int al = al(-1186445885);
        int aj = aj(-1531966831);
        switch (aq.ao.al * -333815450) {
            case 0:
                al /= 2;
                if (i < (this.ar * 702431797) - al || i > al + (this.ar * -1177321188)) {
                    return false;
                }
            case 1:
                if (i <= (this.ar * 702431797) - al || i > this.ar * 702431797) {
                    return false;
                }
            case 2:
                if (i < this.ar * -1602611671 || i >= al + (this.ar * 845242641)) {
                    return false;
                }
        }
        switch (aq.ah.al * -1986689310) {
            case 0:
                al = aj / 2;
                if (i2 < (this.al * 373754673) - al || i2 > (this.al * -1885136617) + al) {
                    return false;
                }
            case 1:
                if (i2 < this.al * 373754673 || i2 >= (this.al * 373754673) + aj) {
                    return false;
                }
            case 2:
                if (i2 <= (this.al * 373754673) - aj || i2 > this.al * -145636533) {
                    return false;
                }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean au(int i, int i2) {
        return ae(i, i2, (short) 255) || am(i, i2, (byte) 0);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean av(int i, int i2) {
        if (!ai(-747156422)) {
            return false;
        }
        dy aq = jg.aq(aq((byte) 59), (byte) 77);
        int al = al(906375794);
        int aj = aj(1827797012);
        switch (aq.ao.al * -340418379) {
            case 0:
                al /= 2;
                if (i < (this.ar * 29176954) - al || i > al + (this.ar * -1105473816)) {
                    return false;
                }
            case 1:
                if (i <= (this.ar * 702431797) - al || i > this.ar * -834391198) {
                    return false;
                }
            case 2:
                if (i < this.ar * -57825873 || i >= al + (this.ar * 702431797)) {
                    return false;
                }
        }
        switch (aq.ah.al * 258727033) {
            case 0:
                al = aj / 2;
                if (i2 < (this.al * 373754673) - al || i2 > (this.al * -1607334237) + al) {
                    return false;
                }
            case 1:
                if (i2 < this.al * 373754673 || i2 >= (this.al * -1010619332) + aj) {
                    return false;
                }
            case 2:
                if (i2 <= (this.al * -449400622) - aj || i2 > this.al * -1845792628) {
                    return false;
                }
        }
        return true;
    }

    public abstract int aw();

    public abstract int ax();

    /* Access modifiers changed, original: 0000 */
    public boolean ay() {
        return aq((byte) 57) >= 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean az(int i, int i2) {
        return ae(i, i2, (short) 255) || am(i, i2, (byte) 0);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ba(int i, int i2) {
        if (!ai(1583066611)) {
            return false;
        }
        dy aq = jg.aq(aq((byte) 11), (byte) 35);
        int al = al(586154169);
        int aj = aj(1457252510);
        switch (aq.ao.al * 2031829131) {
            case 0:
                al /= 2;
                if (i < (this.ar * 702431797) - al || i > al + (this.ar * 702431797)) {
                    return false;
                }
            case 1:
                if (i <= (this.ar * 702431797) - al || i > this.ar * 702431797) {
                    return false;
                }
            case 2:
                if (i < this.ar * 702431797 || i >= al + (this.ar * 702431797)) {
                    return false;
                }
        }
        switch (aq.ah.al * 1526243869) {
            case 0:
                al = aj / 2;
                if (i2 < (this.al * 373754673) - al || i2 > (this.al * 373754673) + al) {
                    return false;
                }
            case 1:
                if (i2 < this.al * 373754673 || i2 >= (this.al * 373754673) + aj) {
                    return false;
                }
            case 2:
                if (i2 <= (this.al * 373754673) - aj || i2 > this.al * 373754673) {
                    return false;
                }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bk(int i, int i2) {
        if (!ai(1642935596)) {
            return false;
        }
        dy aq = jg.aq(aq((byte) 10), (byte) 36);
        int al = al(-616705525);
        int aj = aj(-1929070514);
        switch (aq.ao.al * -1105596490) {
            case 0:
                al /= 2;
                if (i < (this.ar * 702431797) - al || i > al + (this.ar * 702431797)) {
                    return false;
                }
            case 1:
                if (i <= (this.ar * 398213133) - al || i > this.ar * 855310581) {
                    return false;
                }
            case 2:
                if (i < this.ar * 2107437196 || i >= al + (this.ar * -1874795253)) {
                    return false;
                }
        }
        switch (aq.ah.al * -1689052056) {
            case 0:
                al = aj / 2;
                if (i2 < (this.al * 373754673) - al || i2 > (this.al * 373754673) + al) {
                    return false;
                }
            case 1:
                if (i2 < this.al * 301518066 || i2 >= (this.al * -1162337474) + aj) {
                    return false;
                }
            case 2:
                if (i2 <= (this.al * 373754673) - aj || i2 > this.al * -35369460) {
                    return false;
                }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bm(int i, int i2) {
        cx ar = ar(930346503);
        if (ar == null || i < (this.ar * 1013544481) - ((ar.aq * 1941420509) / 2) || i > (this.ar * 702431797) + ((ar.aq * 998534751) / 2) || i2 < this.al * -1291950435) {
            return false;
        }
        return i2 <= (ar.ar * -665759134) + (this.al * 1965273948);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bs(int i, int i2) {
        cx ar = ar(930346503);
        if (ar == null || i < (this.ar * 702431797) - ((ar.aq * 6919642) / 2) || i > (this.ar * 1753179862) + ((ar.aq * -1368894138) / 2) || i2 < this.al * 1877742197) {
            return false;
        }
        return i2 <= (ar.ar * -913420583) + (this.al * 373754673);
    }
}
