package defpackage;

import com.jagex.jagex3.client.input.softkeyboard.al;
import java.lang.reflect.Array;
import java.util.Iterator;

/* renamed from: cz */
public class cz extends ck {
    public static final int ab = 24;
    public static final int av = 25;
    static final int bc = 0;
    static final int bo = 19137016;
    static final int bt = 10;
    int aa;
    int ac;
    int ao;
    int aw;

    cz() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final boolean ac(byte b) {
        try {
            return bu.ar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final int ad(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        if (d2 != 0.0d) {
            d4 = d3 < 0.5d ? (1.0d + d2) * d3 : (d3 + d2) - (d2 * d3);
            double d7 = (2.0d * d3) - d4;
            d5 = 0.3333333333333333d + d;
            d6 = d5 > 1.0d ? d5 - 1.0d : d5;
            d5 = d - 0.3333333333333333d;
            if (d5 < 0.0d) {
                d5 += 1.0d;
            }
            d3 = 6.0d * d6 < 1.0d ? (d6 * ((d4 - d7) * 6.0d)) + d7 : 2.0d * d6 < 1.0d ? d4 : 3.0d * d6 < 2.0d ? (((0.6666666666666666d - d6) * (d4 - d7)) * 6.0d) + d7 : d7;
            d6 = 6.0d * d < 1.0d ? (((d4 - d7) * 6.0d) * d) + d7 : 2.0d * d < 1.0d ? d4 : 3.0d * d < 2.0d ? (((d4 - d7) * (0.6666666666666666d - d)) * 6.0d) + d7 : d7;
            if (6.0d * d5 < 1.0d) {
                d4 = (d5 * ((d4 - d7) * 6.0d)) + d7;
                d5 = d3;
            } else if (2.0d * d5 < 1.0d) {
                d5 = d3;
            } else if (3.0d * d5 < 2.0d) {
                d4 = d7 + (((0.6666666666666666d - d5) * (d4 - d7)) * 6.0d);
                d5 = d3;
            } else {
                d5 = d3;
                d4 = d7;
            }
        } else {
            d5 = d3;
            d4 = d3;
            d6 = d3;
        }
        return ((((int) (d5 * 256.0d)) << 16) + (((int) (256.0d * d6)) << 8)) + ((int) (d4 * 256.0d));
    }

    static String ap(byte b) {
        String str = "";
        try {
            Iterator it = it.aq.iterator();
            while (true) {
                String str2 = str;
                if (!it.hasNext()) {
                    return str2;
                }
                ip ipVar = (ip) it.next();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(ipVar.al);
                stringBuilder.append(':');
                stringBuilder.append(ipVar.ak);
                stringBuilder.append(10);
                str = stringBuilder.toString();
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("cz.ap(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    static dq[] aq(int i) {
        try {
            dq dqVar = dq.aq;
            dq dqVar2 = dq.ar;
            dq dqVar3 = dq.ad;
            return new dq[]{dqVar, dqVar2, dqVar3};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int az(int i, hw hwVar, boolean z, byte b) {
        al alVar;
        if (z) {
            try {
                alVar = lj.az;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cz.az(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        alVar = hl.au;
        int[] iArr;
        int i2;
        if (1600 == i) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bg * 817114559;
            return 1;
        } else if (1601 == i) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bx * -1344834291;
            return 1;
        } else if (1602 == i) {
            String[] strArr = hl.ak;
            i2 = hl.as - 1490481109;
            hl.as = i2;
            strArr[(i2 * -1883296125) - 1] = alVar.dm;
            return 1;
        } else if (i == 1603) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bu * -1004867185;
            return 1;
        } else if (i == 1604) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bw * 901029295;
            return 1;
        } else if (i == 1605) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.cl * -491867321;
            return 1;
        } else if (i == 1606) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.ck * -1022461825;
            return 1;
        } else if (i == 1607) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.cu * 2002818135;
            return 1;
        } else if (i == 1608) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.co * 1019998723;
            return 1;
        } else if (i == 1609) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bz * -39608137;
            return 1;
        } else if (1610 == i) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.by * 1175387377;
            return 1;
        } else if (i == 1611) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.br * 1839990687;
            return 1;
        } else if (1612 == i) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.be * 122478665;
            return 1;
        } else if (1613 == i) {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.bn.ad(2143475718);
            return 1;
        } else if (1614 != i) {
            return 2;
        } else {
            iArr = hl.ae;
            i2 = ds.am - 564452847;
            ds.am = i2;
            iArr[(i2 * -757592335) - 1] = alVar.cg ? 1 : 0;
            return 1;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x01e0=Splitter:B:64:0x01e0, B:202:0x0692=Splitter:B:202:0x0692} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int bc(int i, hw hwVar, boolean z, int i2) {
        int i3 = 0;
        int[] iArr;
        int i4;
        ii am;
        String[] strArr;
        int[] iArr2;
        int i5;
        String[] strArr2;
        da aq;
        String[] strArr3;
        int i6;
        int[] iArr3;
        int i7;
        al ac;
        if (6500 == i) {
            try {
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                if (cc.ad(-1469593928)) {
                    i3 = 1;
                }
                iArr[(i4 * -757592335) - 1] = i3;
                return 1;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cz.bc(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (6501 == i) {
            am = ci.am(829552399);
            if (am != null) {
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.ag * -936955627;
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.ap * -1124226875;
                strArr = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr[(i4 * -1883296125) - 1] = am.ax;
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.aw * -2015421483;
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.au * 2040602315;
                strArr = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr[(i4 * -1883296125) - 1] = am.az;
                return 1;
            }
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = -1;
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            strArr2 = hl.ak;
            i5 = hl.as - 1490481109;
            hl.as = i5;
            strArr2[(i5 * -1883296125) - 1] = "";
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            strArr2 = hl.ak;
            i5 = hl.as - 1490481109;
            hl.as = i5;
            strArr2[(i5 * -1883296125) - 1] = "";
            return 1;
        } else if (6502 == i) {
            am = ac.ak(88743004);
            if (am != null) {
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.ag * -936955627;
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.ap * -1124226875;
                strArr = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr[(i4 * -1883296125) - 1] = am.ax;
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.aw * -2015421483;
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.au * 2040602315;
                strArr = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr[(i4 * -1883296125) - 1] = am.az;
                return 1;
            }
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = -1;
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            strArr2 = hl.ak;
            i5 = hl.as - 1490481109;
            hl.as = i5;
            strArr2[(i5 * -1883296125) - 1] = "";
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            strArr2 = hl.ak;
            i5 = hl.as - 1490481109;
            hl.as = i5;
            strArr2[(i5 * -1883296125) - 1] = "";
            return 1;
        } else if (i == 6506) {
            iArr2 = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            i4 = iArr2[i5 * -757592335];
            for (i3 = 0; i3 < ii.ai * 1909797369; i3++) {
                if (i4 == ii.aj[i3].ag * -936955627) {
                    am = ii.aj[i3];
                    break;
                }
            }
            am = null;
            if (am != null) {
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.ag * -936955627;
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.ap * -1124226875;
                strArr = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr[(i4 * -1883296125) - 1] = am.ax;
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.aw * -2015421483;
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = am.au * 2040602315;
                strArr = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr[(i4 * -1883296125) - 1] = am.az;
                return 1;
            }
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = -1;
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            strArr2 = hl.ak;
            i5 = hl.as - 1490481109;
            hl.as = i5;
            strArr2[(i5 * -1883296125) - 1] = "";
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            strArr2 = hl.ak;
            i5 = hl.as - 1490481109;
            hl.as = i5;
            strArr2[(i5 * -1883296125) - 1] = "";
            return 1;
        } else if (i == 6507) {
            ds.am -= 2037155908;
            es.al(hl.ae[ds.am * -757592335], hl.ae[(ds.am * -757592335) + 1] == 1, hl.ae[(ds.am * -757592335) + 2], hl.ae[(ds.am * -757592335) + 3] == 1, 1188220611);
            return 1;
        } else if (i == 6511) {
            iArr2 = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            i3 = iArr2[i5 * -757592335];
            if (i3 >= 0) {
                if (i3 < ii.ai * 1909797369) {
                    am = ii.aj[i3];
                    iArr = hl.ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr[(i4 * -757592335) - 1] = am.ag * -936955627;
                    iArr = hl.ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr[(i4 * -757592335) - 1] = am.ap * -1124226875;
                    strArr = hl.ak;
                    i4 = hl.as - 1490481109;
                    hl.as = i4;
                    strArr[(i4 * -1883296125) - 1] = am.ax;
                    iArr = hl.ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr[(i4 * -757592335) - 1] = am.aw * -2015421483;
                    iArr = hl.ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr[(i4 * -757592335) - 1] = am.au * 2040602315;
                    strArr = hl.ak;
                    i4 = hl.as - 1490481109;
                    hl.as = i4;
                    strArr[(i4 * -1883296125) - 1] = am.az;
                    return 1;
                }
            }
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = -1;
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            strArr2 = hl.ak;
            i5 = hl.as - 1490481109;
            hl.as = i5;
            strArr2[(i5 * -1883296125) - 1] = "";
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = 0;
            strArr2 = hl.ak;
            i5 = hl.as - 1490481109;
            hl.as = i5;
            strArr2[(i5 * -1883296125) - 1] = "";
            return 1;
        } else if (6512 == i) {
            fu fuVar = gc.km;
            iArr2 = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            fuVar.cw(iArr2[i4 * -757592335] == 1, 1641722422);
            return 1;
        } else if (6513 == i) {
            ds.am += 1128905694;
            i3 = hl.ae[ds.am * -757592335];
            i5 = hl.ae[(ds.am * -757592335) + 1];
            aq = dy.aq(i5, 2133789455);
            if (aq.ai(1070210762)) {
                strArr3 = hl.ak;
                i6 = hl.as - 1490481109;
                hl.as = i6;
                strArr3[(i6 * -1883296125) - 1] = ln.aq(i3, -261772443).ag(i5, aq.aj, (byte) 0);
                return 1;
            }
            iArr3 = hl.ae;
            i6 = ds.am - 564452847;
            ds.am = i6;
            iArr3[(i6 * -757592335) - 1] = ln.aq(i3, -2023219986).as(i5, aq.al * 2073302885, -1903411049);
            return 1;
        } else if (6514 == i) {
            ds.am += 1128905694;
            i3 = hl.ae[ds.am * -757592335];
            i5 = hl.ae[(ds.am * -757592335) + 1];
            aq = dy.aq(i5, 2147254801);
            if (aq.ai(1070210762)) {
                strArr3 = hl.ak;
                i6 = hl.as - 1490481109;
                hl.as = i6;
                strArr3[(i6 * -1883296125) - 1] = aj.aq(i3, -1988812502).az(i5, aq.aj, -2131749952);
                return 1;
            }
            iArr3 = hl.ae;
            i6 = ds.am - 564452847;
            ds.am = i6;
            iArr3[(i6 * -757592335) - 1] = aj.aq(i3, 830244766).au(i5, aq.al * 2073302885, (byte) -39);
            return 1;
        } else if (i == 6515) {
            ds.am += 1128905694;
            i3 = hl.ae[ds.am * -757592335];
            i5 = hl.ae[(ds.am * -757592335) + 1];
            aq = dy.aq(i5, 2133678799);
            if (aq.ai(1070210762)) {
                strArr3 = hl.ak;
                i6 = hl.as - 1490481109;
                hl.as = i6;
                strArr3[(i6 * -1883296125) - 1] = gl.aq(i3, 674055344).ao(i5, aq.aj, 2014714483);
                return 1;
            }
            iArr3 = hl.ae;
            i6 = ds.am - 564452847;
            ds.am = i6;
            iArr3[(i6 * -757592335) - 1] = gl.aq(i3, 62855318).aa(i5, aq.al * 2073302885, -757592335);
            return 1;
        } else if (6516 == i) {
            ds.am += 1128905694;
            i3 = hl.ae[ds.am * -757592335];
            i5 = hl.ae[(ds.am * -757592335) + 1];
            aq = dy.aq(i5, 2146722860);
            if (aq.ai(1070210762)) {
                strArr3 = hl.ak;
                i6 = hl.as - 1490481109;
                hl.as = i6;
                strArr3[(i6 * -1883296125) - 1] = am.aq(i3, 1288224654).ae(i5, aq.aj, 1760974006);
                return 1;
            }
            iArr3 = hl.ae;
            i6 = ds.am - 564452847;
            ds.am = i6;
            iArr3[(i6 * -757592335) - 1] = am.aq(i3, -208937914).ai(i5, aq.al * 2073302885, 704937591);
            return 1;
        } else if (i == 6518) {
            int[] iArr4 = hl.ae;
            i7 = ds.am - 564452847;
            ds.am = i7;
            iArr4[(i7 * -757592335) - 1] = client.aq.ax ? 1 : 0;
            return 1;
        } else if (i == 6519) {
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = client.aq.abh((byte) 61) & 3;
            return 1;
        } else if (i == 6520 || 6522 == i) {
            ac = client.aq.abx((byte) 101).ac(2, 2066806294);
            strArr = hl.ak;
            i4 = hl.as + 1490481109;
            hl.as = i4;
            ac.av(strArr[i4 * -1883296125], -424876299);
            iArr = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            ac.bk(iArr[i4 * -757592335], -1040248022);
            ac.ay(-1435099557);
            return 1;
        } else if (6521 == i) {
            client.aq.abx((byte) 53).gl(2084631997);
            return 1;
        } else if (i == 6523) {
            ac = client.aq.abx((byte) 118).ac(1, 2066806294);
            strArr = hl.ak;
            i4 = hl.as + 1490481109;
            hl.as = i4;
            CharSequence charSequence = strArr[i4 * -1883296125];
            if (bj.au(charSequence, (byte) 126)) {
                ac.av(charSequence, -424876299);
                iArr = hl.ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                ac.bk(iArr[i4 * -757592335], 968600848);
                ac.ay(-1435099557);
                return 1;
            }
            throw new IllegalArgumentException();
        } else if (i == 6524) {
            iArr2 = hl.ae;
            i5 = ds.am - 564452847;
            ds.am = i5;
            iArr2[(i5 * -757592335) - 1] = client.aq.abx((byte) 43).ak(-523703227);
            return 1;
        } else if (i == 6525) {
            iArr = hl.ae;
            i7 = ds.am - 564452847;
            ds.am = i7;
            iArr[(i7 * -757592335) - 1] = client.aq.abx((byte) 126).as((byte) 106) ? 1 : 0;
            return 1;
        } else if (i != 6526) {
            return 2;
        } else {
            iArr = hl.ae;
            i4 = ds.am - 564452847;
            ds.am = i4;
            iArr[(i4 * -757592335) - 1] = client.aq.abx((byte) 105).ag(-366581893) ? 1 : 0;
            return 1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(lj ljVar, int i) {
        try {
            if (ljVar.af(1804771424) == cl.aq.ar * -597624687) {
                this.aj = ljVar.af(1804771424) * 215358735;
                this.ai = ljVar.af(1804771424) * 197920539;
                this.ad = ljVar.an(-1464407032) * -526695491;
                this.aq = ljVar.an(-1464407032) * 160833907;
                this.aw = ljVar.af(1804771424) * 842593577;
                this.ac = ljVar.af(1804771424) * 1970847925;
                this.ar = ljVar.an(-1464407032) * 1548537255;
                this.al = ljVar.an(-1464407032) * 1776610387;
                this.aa = ljVar.af(1804771424) * 2124975429;
                this.ao = ljVar.af(1804771424) * -926156713;
                this.ae = ljVar.bi(-719154564) * -1918794457;
                this.am = ljVar.bi(-497250259) * 382154643;
                return;
            }
            throw new IllegalStateException("");
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(lj ljVar) {
        this.ai = Math.min(this.ai * 418183955, 4) * 197920539;
        this.ak = (short[][][]) Array.newInstance(Short.TYPE, new int[]{1, 64, -628295818});
        this.as = (short[][][]) Array.newInstance(Short.TYPE, new int[]{this.ai * -1734344477, 1879240784, 1472649211});
        this.ag = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.ai * 418183955, 64, 64});
        this.ap = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.ai * 418183955, 1371208302, -1615593456});
        this.au = (di[][][][]) Array.newInstance(di[].class, new int[]{this.ai * 418183955, 377184060, 64});
        if (ljVar.af(1804771424) == dv.aq.ar * 1846011711) {
            int af = ljVar.af(1804771424);
            int af2 = ljVar.af(1804771424);
            int af3 = ljVar.af(1804771424);
            int af4 = ljVar.af(1804771424);
            if (this.ar * -293139945 == af && this.al * 1565963904 == af2 && this.aa * -1146487411 == af3 && this.ao * 1430953075 == af4) {
                for (af2 = 0; af2 < 8; af2++) {
                    for (af = 0; af < 8; af++) {
                        as((this.aa * -539742898) + af2, (this.ao * -855401672) + af, ljVar, 2131165261);
                    }
                }
                return;
            }
            throw new IllegalStateException("");
        }
        throw new IllegalStateException("");
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(lj ljVar) {
        this.ai = Math.min(this.ai * 418183955, 4) * 235996200;
        this.ak = (short[][][]) Array.newInstance(Short.TYPE, new int[]{1, 592313039, 581736812});
        this.as = (short[][][]) Array.newInstance(Short.TYPE, new int[]{this.ai * 418183955, 1972207287, 64});
        this.ag = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.ai * 418183955, -281710202, 894836979});
        this.ap = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.ai * 418183955, -653328500, -1325382459});
        this.au = (di[][][][]) Array.newInstance(di[].class, new int[]{this.ai * 418183955, -2093496833, 64});
        if (ljVar.af(1804771424) == dv.aq.ar * -1547610426) {
            int af = ljVar.af(1804771424);
            int af2 = ljVar.af(1804771424);
            int af3 = ljVar.af(1804771424);
            int af4 = ljVar.af(1804771424);
            if (this.ar * 1896480917 == af && this.al * 1871460315 == af2 && this.aa * -1146487411 == af3 && this.ao * -11716795 == af4) {
                for (af2 = 0; af2 < 8; af2++) {
                    for (af = 0; af < 8; af++) {
                        as((this.aa * -74380886) + af2, (this.ao * -365259139) + af, ljVar, 2131165261);
                    }
                }
                return;
            }
            throw new IllegalStateException("");
        }
        throw new IllegalStateException("");
    }

    /* Access modifiers changed, original: 0000 */
    public int al(int i) {
        try {
            return this.ac * -469095011;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(lj ljVar, int i) {
        try {
            this.ai = Math.min(this.ai * 418183955, 4) * 197920539;
            this.ak = (short[][][]) Array.newInstance(Short.TYPE, new int[]{1, 64, 64});
            this.as = (short[][][]) Array.newInstance(Short.TYPE, new int[]{this.ai * 418183955, 64, 64});
            this.ag = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.ai * 418183955, 64, 64});
            this.ap = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{this.ai * 418183955, 64, 64});
            this.au = (di[][][][]) Array.newInstance(di[].class, new int[]{this.ai * 418183955, 64, 64});
            if (ljVar.af(1804771424) == dv.aq.ar * 1846011711) {
                int af = ljVar.af(1804771424);
                int af2 = ljVar.af(1804771424);
                int af3 = ljVar.af(1804771424);
                int af4 = ljVar.af(1804771424);
                if (this.ar * -293139945 == af && this.al * 1871460315 == af2 && this.aa * -1146487411 == af3 && this.ao * 966816615 == af4) {
                    for (af2 = 0; af2 < 8; af2++) {
                        for (af = 0; af < 8; af++) {
                            as((this.aa * -581964696) + af2, (this.ao * -855401672) + af, ljVar, 2131165261);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("");
            }
            throw new IllegalStateException("");
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(byte b) {
        try {
            return this.aw * 803895065;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bc(int i) {
        try {
            return this.ao * 966816615;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.bc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int be() {
        return this.aw * -262844594;
    }

    /* Access modifiers changed, original: 0000 */
    public void bg(lj ljVar) {
        if (ljVar.af(1804771424) == cl.aq.ar * -597624687) {
            this.aj = ljVar.af(1804771424) * 215358735;
            this.ai = ljVar.af(1804771424) * 197920539;
            this.ad = ljVar.an(-1464407032) * -526695491;
            this.aq = ljVar.an(-1464407032) * 160833907;
            this.aw = ljVar.af(1804771424) * 842593577;
            this.ac = ljVar.af(1804771424) * 1970847925;
            this.ar = ljVar.an(-1464407032) * 1548537255;
            this.al = ljVar.an(-1464407032) * 1776610387;
            this.aa = ljVar.af(1804771424) * 2124975429;
            this.ao = ljVar.af(1804771424) * -926156713;
            this.ae = ljVar.bi(1282389016) * -1918794457;
            this.am = ljVar.bi(-65238398) * 382154643;
            return;
        }
        throw new IllegalStateException("");
    }

    /* Access modifiers changed, original: 0000 */
    public int bh() {
        return this.ac * -469095011;
    }

    /* Access modifiers changed, original: 0000 */
    public int bi(int i) {
        try {
            return this.aa * -1146487411;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int bj() {
        return this.ac * -469095011;
    }

    /* Access modifiers changed, original: 0000 */
    public int bn() {
        return this.aa * -1858847991;
    }

    /* Access modifiers changed, original: 0000 */
    public int bp() {
        return this.ao * 966816615;
    }

    /* Access modifiers changed, original: 0000 */
    public int br() {
        return this.aw * 803895065;
    }

    /* Access modifiers changed, original: 0000 */
    public int bt() {
        return this.ac * -469095011;
    }

    /* Access modifiers changed, original: 0000 */
    public void bu(lj ljVar) {
        if (ljVar.af(1804771424) == cl.aq.ar * 2076873543) {
            this.aj = ljVar.af(1804771424) * 215358735;
            this.ai = ljVar.af(1804771424) * 197920539;
            this.ad = ljVar.an(-1464407032) * -526695491;
            this.aq = ljVar.an(-1464407032) * 160833907;
            this.aw = ljVar.af(1804771424) * 842593577;
            this.ac = ljVar.af(1804771424) * -234887009;
            this.ar = ljVar.an(-1464407032) * -785735783;
            this.al = ljVar.an(-1464407032) * 1776610387;
            this.aa = ljVar.af(1804771424) * -1397202594;
            this.ao = ljVar.af(1804771424) * -926156713;
            this.ae = ljVar.bi(457075436) * 191058118;
            this.am = ljVar.bi(-469906572) * 382154643;
            return;
        }
        throw new IllegalStateException("");
    }

    /* Access modifiers changed, original: 0000 */
    public void bv(lj ljVar) {
        if (ljVar.af(1804771424) == cl.aq.ar * -597624687) {
            this.aj = ljVar.af(1804771424) * 215358735;
            this.ai = ljVar.af(1804771424) * 197920539;
            this.ad = ljVar.an(-1464407032) * 1750244702;
            this.aq = ljVar.an(-1464407032) * -5422277;
            this.aw = ljVar.af(1804771424) * -759441885;
            this.ac = ljVar.af(1804771424) * -983789908;
            this.ar = ljVar.an(-1464407032) * 1548537255;
            this.al = ljVar.an(-1464407032) * -508594038;
            this.aa = ljVar.af(1804771424) * -1406397668;
            this.ao = ljVar.af(1804771424) * -875152415;
            this.ae = ljVar.bi(862417943) * 1656114140;
            this.am = ljVar.bi(-252854252) * 1019196490;
            return;
        }
        throw new IllegalStateException("");
    }

    /* Access modifiers changed, original: 0000 */
    public int bw() {
        return this.aw * 803895065;
    }

    /* Access modifiers changed, original: 0000 */
    public void bx(lj ljVar) {
        if (ljVar.af(1804771424) == cl.aq.ar * -597624687) {
            this.aj = ljVar.af(1804771424) * 215358735;
            this.ai = ljVar.af(1804771424) * 197920539;
            this.ad = ljVar.an(-1464407032) * 459909525;
            this.aq = ljVar.an(-1464407032) * 1743912886;
            this.aw = ljVar.af(1804771424) * 842593577;
            this.ac = ljVar.af(1804771424) * -1159509868;
            this.ar = ljVar.an(-1464407032) * 1548537255;
            this.al = ljVar.an(-1464407032) * -286202846;
            this.aa = ljVar.af(1804771424) * -395068947;
            this.ao = ljVar.af(1804771424) * -926156713;
            this.ae = ljVar.bi(-482903427) * -1918794457;
            this.am = ljVar.bi(680426412) * -1204285648;
            return;
        }
        throw new IllegalStateException("");
    }

    /* Access modifiers changed, original: 0000 */
    public int by() {
        return this.aa * -1146487411;
    }

    /* Access modifiers changed, original: 0000 */
    public int bz() {
        return this.aa * -1146487411;
    }

    /* Access modifiers changed, original: 0000 */
    public int cv() {
        return this.ao * 2130913785;
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof cz)) {
                return false;
            }
            cz czVar = (cz) obj;
            if (czVar.ar * -293139945 != this.ar * -293139945 || czVar.al * 1871460315 != this.al * 1871460315 || this.aa * -1146487411 != czVar.aa * -1146487411) {
                return false;
            }
            return this.ao * 966816615 == czVar.ao * 966816615;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ff() {
        return (((this.ar * -293139945) | ((this.al * 1871460315) << 8)) | ((this.aa * -1146487411) << 16)) | ((this.ao * 966816615) << 24);
    }

    public int fr() {
        return (((this.ar * -446289302) | ((this.al * -1328269324) << 8)) | ((this.aa * -1146487411) << 16)) | ((this.ao * 2135493107) << 24);
    }

    public boolean fy(Object obj) {
        if (!(obj instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj;
        return czVar.ar * -1901582908 == this.ar * -293139945 && czVar.al * 1871460315 == this.al * 1657936358 && this.aa * -1146487411 == czVar.aa * 995592641 && this.ao * 160442026 == czVar.ao * -1089205896;
    }

    public int hashCode() {
        try {
            return (((this.ar * -293139945) | ((this.al * 1871460315) << 8)) | ((-1146487411 * this.aa) << 16)) | ((966816615 * this.ao) << 24);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cz.hashCode(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
