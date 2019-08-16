package defpackage;

import android.support.v4.view.MotionEventCompat;
import java.net.URL;

/* renamed from: cc */
public class cc implements co {
    public static final int aa = 34;
    public static final int ac = 33;
    static final int ag = 70;
    static final int ca = 2;
    static int et;
    static int hg;
    int ad;
    int ae;
    int ai;
    int aj;
    int ak;
    int al;
    int am;
    int aq;
    int ar;
    int as;

    cc() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cc.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean ad(int i) {
        try {
            if (dd.as == null) {
                dd.as = ig.fx.ar(new URL(dt.ap), 2118032788);
                return false;
            }
            if (dd.as.aq((short) -10397)) {
                lj ljVar = new lj(dd.as.ar(-1656615300));
                ljVar.at((byte) -18);
                ii.ai = ljVar.an(-1464407032) * 2030747721;
                ii.aj = new ii[(ii.ai * 1909797369)];
                for (int i2 = 0; i2 < ii.ai * 1909797369; i2++) {
                    ii[] iiVarArr = ii.aj;
                    ii iiVar = new ii();
                    iiVarArr[i2] = iiVar;
                    iiVar.ag = ljVar.an(-1464407032) * 1275827773;
                    iiVar.ap = ljVar.at((byte) -70) * -1560308211;
                    iiVar.az = ljVar.bm(1843232909);
                    iiVar.ax = ljVar.bm(992890391);
                    iiVar.aw = ljVar.af(1804771424) * -1043118723;
                    iiVar.au = ljVar.ab(-1182543742) * -1834166557;
                    iiVar.ac = 1749951741 * i2;
                }
                by.ar(ii.aj, 0, ii.aj.length - 1, ii.ak, ii.am, 530834583);
                dd.as = null;
                return true;
            }
            return false;
        } catch (Exception e) {
            try {
                e.printStackTrace();
                dd.as = null;
            } catch (RuntimeException e2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cc.ad(");
                stringBuilder.append(')');
                throw mv.aq(e2, stringBuilder.toString());
            }
        }
    }

    static void ak(int i) {
        try {
            hz.ai = 0;
            for (int i2 = 0; i2 < 2048; i2++) {
                hz.aj[i2] = null;
                hz.al[i2] = (byte) 1;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cc.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void au(int i, byte b) {
        try {
            if (hm.cu * -710699557 == 2) {
                hm.dw = 341286823 * i;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cc.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final String bu(int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 >= -9) {
            return i4 < -6 ? hs.aq(16723968, 1251948699) : i4 < -3 ? hs.aq(16740352, -318312595) : i4 < 0 ? hs.aq(16756736, -1307965816) : i4 > 9 ? hs.aq(MotionEventCompat.ACTION_POINTER_INDEX_MASK, -972138974) : i4 > 6 ? hs.aq(4259584, 759911081) : i4 > 3 ? hs.aq(8453888, -1099836572) : i4 > 0 ? hs.aq(12648192, 1823390329) : hs.aq(16776960, -2143160592);
        } else {
            try {
                return hs.aq(16711680, -1391763137);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cc.bu(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    static void fk(al[] alVarArr, int i, int i2, int i3, boolean z, int i4) {
        int i5 = 0;
        while (i5 < alVarArr.length) {
            try {
                al alVar = alVarArr[i5];
                if (alVar != null) {
                    if (i == alVar.bc * -38514547) {
                        ay.gc(alVar, i2, i3, z, (byte) -41);
                        ae.gw(alVar, i2, i3, 256265004);
                        if (alVar.bg * 817114559 > (alVar.bu * -1004867185) - (alVar.bl * 1272191791)) {
                            alVar.bg = (alVar.bu * 911069233) - (alVar.bl * 1370115729);
                        }
                        if (alVar.bg * 817114559 < 0) {
                            alVar.bg = 0;
                        }
                        if (alVar.bx * -1344834291 > (alVar.bw * 901029295) - (alVar.bf * 1813264797)) {
                            alVar.bx = (alVar.bw * 1672455851) - (alVar.bf * -2087857455);
                        }
                        if (alVar.bx * -1344834291 < 0) {
                            alVar.bx = 0;
                        }
                        if (alVar.af * 1845699613 == 0) {
                            bm.fe(alVarArr, alVar, z, 44328010);
                        }
                    }
                }
                i5++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cc.fk(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public int[] aa(int i, int i2, int i3) {
        if (!aq(i, i2, i3, -1329684738)) {
            return null;
        }
        return new int[]{(((this.aj * -1439256128) - (this.ar * 1017663808)) + i2) + ((this.ak * 2102787928) - (this.ae * -811841544)), (((this.ai * 286147136) - (this.al * 1966990272)) + i3) + ((this.as * -1891496904) - (this.am * 355719096))};
    }

    public void ab(lj ljVar) {
        this.ad = ljVar.af(1804771424) * 1637131419;
        this.aq = ljVar.af(1804771424) * 1462395909;
        this.ar = ljVar.an(-1464407032) * 848854742;
        this.ae = ljVar.af(1804771424) * 385320400;
        this.al = ljVar.an(-1464407032) * -1476376721;
        this.am = ljVar.af(1804771424) * 52979399;
        this.aj = ljVar.an(-1464407032) * 1143588599;
        this.ak = ljVar.af(1804771424) * -1582599997;
        this.ai = ljVar.an(-1464407032) * -1052170951;
        this.as = ljVar.af(1804771424) * 209826871;
        ae((byte) 1);
    }

    public int[] ac(int i, int i2, int i3) {
        if (!aq(i, i2, i3, -1329684738)) {
            return null;
        }
        return new int[]{(((this.aj * -1439256128) - (this.ar * 1017663808)) + i2) + ((this.ak * 2102787928) - (this.ae * -811841544)), (((this.ai * 286147136) - (this.al * 1966990272)) + i3) + ((this.as * -1891496904) - (this.am * 355719096))};
    }

    public void ad(dm dmVar, byte b) {
        try {
            if (dmVar.as * -1795626233 > this.aj * -1834427705) {
                dmVar.as = this.aj * -50339263;
            }
            if (dmVar.ag * 1420737413 < this.aj * -1834427705) {
                dmVar.ag = this.aj * 1663545563;
            }
            if (dmVar.ap * -1938298965 > this.ai * 1212430601) {
                dmVar.ap = this.ai * -878027237;
            }
            if (dmVar.au * -1407875439 < this.ai * 1212430601) {
                dmVar.au = this.ai * -1674184967;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cc.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(byte b) {
    }

    public ag af(int i, int i2) {
        if (!ar(i, i2, 1395054992)) {
            return null;
        }
        return new ag(this.ad * 1717608851, ((this.ae * -811841544) - (this.ak * 2102787928)) + (((1017663808 * this.ar) - (-1439256128 * this.aj)) + i), (((1966990272 * this.al) - (286147136 * this.ai)) + i2) + ((355719096 * this.am) - (-1891496904 * this.as)));
    }

    public boolean ag(int i, int i2, int i3) {
        return i >= this.ad * 823789613 && i < (this.ad * -1407230659) + (this.aq * -1889351475) && i2 >= ((this.ar * -1594711739) << 6) + ((this.ae * -1155981100) << 3) && i2 <= (((this.ae * -101480193) << 3) + ((this.ar * -1594711739) << 6)) + 7 && i3 >= ((this.am * -2103018761) << 3) + ((this.al * -1775056399) << 6) && i3 <= (((this.al * 1976891279) << 6) + ((this.am * -2103018761) << 3)) + 7;
    }

    public int[] ah(int i, int i2, int i3) {
        if (!aq(i, i2, i3, -1329684738)) {
            return null;
        }
        return new int[]{(((this.aj * -1439256128) - (this.ar * 1017663808)) + i2) + ((this.ak * 2102787928) - (this.ae * -811841544)), (((this.ai * -833699490) - (this.al * -1153953607)) + i3) + ((this.as * -1891496904) - (this.am * -581892154))};
    }

    public void ai(lj ljVar, int i) {
        try {
            this.ad = ljVar.af(1804771424) * 1637131419;
            this.aq = ljVar.af(1804771424) * 1462395909;
            this.ar = ljVar.an(-1464407032) * 463915405;
            this.ae = ljVar.af(1804771424) * 1304131327;
            this.al = ljVar.an(-1464407032) * -1476376721;
            this.am = ljVar.af(1804771424) * 52979399;
            this.aj = ljVar.an(-1464407032) * 1143588599;
            this.ak = ljVar.af(1804771424) * -1582599997;
            this.ai = ljVar.an(-1464407032) * -1052170951;
            this.as = ljVar.af(1804771424) * 209826871;
            ae((byte) 1);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cc.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ag aj(int i, int i2, byte b) {
        try {
            if (!ar(i, i2, 1007774741)) {
                return null;
            }
            return new ag(this.ad * 1717608851, ((this.ae * -811841544) - (this.ak * 2102787928)) + (((1017663808 * this.ar) - (-1439256128 * this.aj)) + i), (((1966990272 * this.al) - (286147136 * this.ai)) + i2) + ((355719096 * this.am) - (-1891496904 * this.as)));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cc.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ak(dm dmVar) {
        if (dmVar.as * -1795626233 > this.aj * -1834427705) {
            dmVar.as = this.aj * -1176481687;
        }
        if (dmVar.ag * -61123627 < this.aj * 841106686) {
            dmVar.ag = this.aj * 212272808;
        }
        if (dmVar.ap * 161080714 > this.ai * 1212430601) {
            dmVar.ap = this.ai * 399170954;
        }
        if (dmVar.au * 462293757 < this.ai * -1146894300) {
            dmVar.au = this.ai * -1674184967;
        }
    }

    public int[] al(int i, int i2, int i3, int i4) {
        try {
            if (!aq(i, i2, i3, -1329684738)) {
                return null;
            }
            int i5 = this.aj;
            int i6 = this.ar;
            int i7 = this.ak;
            int i8 = this.ae;
            int i9 = this.ai;
            int i10 = this.al;
            int i11 = this.as;
            int i12 = this.am;
            return new int[]{(((i5 * -1439256128) - (i6 * 1017663808)) + i2) + ((2102787928 * i7) - (-811841544 * i8)), (((286147136 * i9) - (1966990272 * i10)) + i3) + ((-1891496904 * i11) - (355719096 * i12))};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cc.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void am(dm dmVar) {
        if (dmVar.as * -1795626233 > this.aj * 749853502) {
            dmVar.as = this.aj * 5406822;
        }
        if (dmVar.ag * 1420737413 < this.aj * -581738983) {
            dmVar.ag = this.aj * 599567526;
        }
        if (dmVar.ap * -1938298965 > this.ai * 701428931) {
            dmVar.ap = this.ai * 1094037554;
        }
        if (dmVar.au * 183283814 < this.ai * -2128168928) {
            dmVar.au = this.ai * 900168373;
        }
    }

    public void an(lj ljVar) {
        this.ad = ljVar.af(1804771424) * 1637131419;
        this.aq = ljVar.af(1804771424) * -938511817;
        this.ar = ljVar.an(-1464407032) * -1950717968;
        this.ae = ljVar.af(1804771424) * 1304131327;
        this.al = ljVar.an(-1464407032) * -255431240;
        this.am = ljVar.af(1804771424) * 52979399;
        this.aj = ljVar.an(-1464407032) * -621881589;
        this.ak = ljVar.af(1804771424) * 1875475544;
        this.ai = ljVar.an(-1464407032) * -1052170951;
        this.as = ljVar.af(1804771424) * 80752476;
        ae((byte) 1);
    }

    public int[] ao(int i, int i2, int i3) {
        if (!aq(i, i2, i3, -1329684738)) {
            return null;
        }
        return new int[]{(((this.aj * 1740663040) - (this.ar * 1017663808)) + i2) + ((this.ak * 1224170401) - (this.ae * 79107423)), (((this.ai * 1698206006) - (this.al * 1920029290)) + i3) + ((this.as * -1364338603) - (this.am * -100310671))};
    }

    public boolean ap(int i, int i2, int i3) {
        return i >= this.ad * 1717608851 && i < (this.ad * 1598480180) + (this.aq * -1889351475) && i2 >= ((this.ar * -1594711739) << 6) + ((this.ae * -2011360048) << 3) && i2 <= (((this.ae * -452158019) << 3) + ((this.ar * -1594711739) << 6)) + 7 && i3 >= ((this.am * 1260467319) << 3) + ((this.al * 1976891279) << 6) && i3 <= (((this.al * 1976891279) << 6) + ((this.am * -2103018761) << 3)) + 7;
    }

    public boolean aq(int i, int i2, int i3, int i4) {
        try {
            if (i < this.ad * 1717608851 || i >= (this.ad * 1717608851) + (this.aq * -1889351475) || i2 < ((this.ar * -1594711739) << 6) + ((this.ae * -101480193) << 3) || i2 > (((this.ae * -101480193) << 3) + ((this.ar * -1594711739) << 6)) + 7 || i3 < ((this.am * -2103018761) << 3) + ((this.al * 1976891279) << 6)) {
                return false;
            }
            return i3 <= (((this.al * 1976891279) << 6) + ((this.am * -2103018761) << 3)) + 7;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cc.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ar(int i, int i2, int i3) {
        try {
            if (i >= ((this.ak * 799719403) << 3) + ((this.aj * -1834427705) << 6) && i <= (((this.ak * 799719403) << 3) + ((this.aj * -1834427705) << 6)) + 7 && i2 >= ((this.as * -1847049849) << 3) + ((this.ai * 1212430601) << 6)) {
                if (i2 <= (((this.ai * 1212430601) << 6) + ((this.as * -1847049849) << 3)) + 7) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cc.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as(dm dmVar) {
        if (dmVar.as * 1650383641 > this.aj * -1834427705) {
            dmVar.as = this.aj * -1959873592;
        }
        if (dmVar.ag * 1420737413 < this.aj * -1834427705) {
            dmVar.ag = this.aj * 1663545563;
        }
        if (dmVar.ap * -1938298965 > this.ai * 1212430601) {
            dmVar.ap = this.ai * 2135804107;
        }
        if (dmVar.au * 598344146 < this.ai * 1769738915) {
            dmVar.au = this.ai * 460360370;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void at() {
    }

    public boolean au(int i, int i2, int i3) {
        return i >= this.ad * 1717608851 && i < (this.ad * 1717608851) + (this.aq * -1889351475) && i2 >= ((this.ar * -1594711739) << 6) + ((this.ae * -101480193) << 3) && i2 <= (((this.ae * -101480193) << 3) + ((this.ar * -1594711739) << 6)) + 7 && i3 >= ((this.am * -2103018761) << 3) + ((this.al * 1976891279) << 6) && i3 <= (((this.al * 1976891279) << 6) + ((this.am * -2103018761) << 3)) + 7;
    }

    /* Access modifiers changed, original: 0000 */
    public void av() {
    }

    public int[] aw(int i, int i2, int i3) {
        if (!aq(i, i2, i3, -1329684738)) {
            return null;
        }
        return new int[]{(((this.aj * -1439256128) - (this.ar * 1017663808)) + i2) + ((this.ak * 2102787928) - (this.ae * -811841544)), (((this.ai * 286147136) - (this.al * 1966990272)) + i3) + ((this.as * -1891496904) - (this.am * 355719096))};
    }

    public boolean ax(int i, int i2) {
        return i >= ((this.ak * 799719403) << 3) + ((this.aj * -1834427705) << 6) && i <= (((this.ak * 799719403) << 3) + ((this.aj * -1834427705) << 6)) + 7 && i2 >= ((this.as * -1847049849) << 3) + ((this.ai * 1212430601) << 6) && i2 <= (((this.ai * 1212430601) << 6) + ((this.as * -1847049849) << 3)) + 7;
    }

    public ag ay(int i, int i2) {
        if (!ar(i, i2, -2055304803)) {
            return null;
        }
        return new ag(this.ad * 1717608851, ((this.ae * -811841544) - (this.ak * 2102787928)) + (((1017663808 * this.ar) - (-1439256128 * this.aj)) + i), (((1966990272 * this.al) - (286147136 * this.ai)) + i2) + ((355719096 * this.am) - (-1891496904 * this.as)));
    }

    public boolean az(int i, int i2) {
        return i >= ((this.ak * 1489712446) << 3) + ((this.aj * -1834427705) << 6) && i <= (((this.ak * 799719403) << 3) + ((this.aj * -1978540231) << 6)) + 7 && i2 >= ((this.as * 755983394) << 3) + ((this.ai * 1212430601) << 6) && i2 <= (((this.ai * 1212430601) << 6) + ((this.as * -1847049849) << 3)) + 7;
    }
}
