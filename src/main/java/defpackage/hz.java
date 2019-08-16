package defpackage;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import java.util.Collection;

/* renamed from: hz */
public class hz {
    static final int ad = 2;
    public static int[] ae = new int[2048];
    static int[] ag = new int[2048];
    public static int ai = 0;
    static lj[] aj = new lj[2048];
    static int[] ak = new int[2048];
    static byte[] al = new byte[2048];
    static int am = 0;
    static int[] ap = new int[2048];
    static final int aq = 1;
    static byte[] ar = new byte[2048];
    static int[] as = new int[2048];
    static int au = 0;
    static lj ax = new lj(new byte[5000]);
    static int[] az = new int[2048];
    static final int bk = 0;
    static al kp;
    static mx nc;

    hz() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hz.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean aa(lv lvVar, int i) {
        int jm = lvVar.jm(2, -930825706);
        int jm2;
        int jm3;
        int i2;
        int jm4;
        if (jm == 0) {
            if (lvVar.jm(1, -736634928) != 0) {
                ay.ai(lvVar, i, (byte) -7);
            }
            jm2 = lvVar.jm(13, -123105263);
            jm3 = lvVar.jm(13, -1823269778);
            if ((lvVar.jm(1, -1789145859) == 1 ? 1 : 0) != 0) {
                int[] iArr = az;
                i2 = au - 825632607;
                au = i2;
                iArr[(i2 * 359672219) - 1] = i;
            }
            if (client.jz[i] == null) {
                hv[] hvVarArr = client.jz;
                hv hvVar = new hv();
                hvVarArr[i] = hvVar;
                hvVar.av = 961403166 * i;
                if (aj[i] != null) {
                    hvVar.ad(aj[i], 2073848384);
                }
                hvVar.dl = ag[i] * -290101431;
                hvVar.cp = ap[i] * 260026025;
                jm = as[i];
                hvVar.du[0] = al[i];
                hvVar.ab = ((byte) (jm >> 28)) * -1809168854;
                hvVar.as((jm2 + (((jm >> 14) & 255) << 13)) - (oz.ff * 2060098323), (((jm & -1995755421) << 13) + jm3) - (cq.fz * -1866366501), (short) 16256);
                hvVar.ba = false;
                return true;
            }
            throw new RuntimeException();
        } else if (jm == 1) {
            jm4 = lvVar.jm(2, -1504642170);
            jm = as[i];
            as[i] = (((jm4 + (jm >> 28)) & 3) << 28) + (1569969707 & jm);
            return false;
        } else if (2 == jm) {
            jm3 = lvVar.jm(5, -24575314);
            i2 = jm3 & 7;
            int i3 = as[i];
            jm = (i3 >> 14) & 2014052863;
            jm2 = i3 & 255;
            if (i2 == 0) {
                jm--;
                jm2--;
            }
            jm4 = 1 == i2 ? jm2 - 1 : jm2;
            if (i2 == 2) {
                jm++;
                jm4--;
            }
            if (3 == i2) {
                jm--;
            }
            if (4 == i2) {
                jm++;
            }
            if (i2 == 5) {
                jm--;
                jm4++;
            }
            if (i2 == 6) {
                jm4++;
            }
            if (7 == i2) {
                jm++;
                jm4++;
            }
            as[i] = jm4 + ((jm << 14) + ((((jm3 >> 3) + (i3 >> 28)) & 3) << 28));
            return false;
        } else {
            jm4 = lvVar.jm(18, 523394109);
            jm = as[i];
            as[i] = ((((((jm4 >> 8) & -1900594447) + (jm >> 14)) & -115061850) << 14) + ((((jm >> 28) + (jm4 >> 16)) & 3) << 28)) + (2063570067 & ((784016102 & jm4) + jm));
            return false;
        }
    }

    static void ac(lv lvVar, int i) {
        int i2;
        int i3;
        if (lvVar.jm(1, 1478317452) == 1) {
            i2 = 1;
        } else {
            boolean i22 = false;
        }
        if (i22 != 0) {
            int[] iArr = az;
            i3 = au - 825632607;
            au = i3;
            iArr[(i3 * -1082782879) - 1] = i;
        }
        int jm = lvVar.jm(2, -1478099679);
        hv hvVar = client.jz[i];
        int jm2;
        if (jm == 0) {
            if (i22 != 0) {
                hvVar.ba = false;
            } else if (client.jj * 869197827 != i) {
                as[i] = ((hvVar.dc[0] + (cq.fz * -1866366501)) >> 13) + (((((oz.ff * 2060098323) + hvVar.db[0]) >> 13) << 14) + ((hvVar.ab * -1300496125) << 28));
                if (hvVar.cb * 773750935 != -1) {
                    ag[i] = hvVar.cb * 773750935;
                } else {
                    ag[i] = hvVar.dl * 786971385;
                }
                ap[i] = hvVar.cp * -298920551;
                client.jz[i] = null;
                if (lvVar.jm(1, 304679646) != 0) {
                    ay.ai(lvVar, i, (byte) 25);
                }
            } else {
                throw new RuntimeException();
            }
        } else if (1 == jm) {
            jm2 = lvVar.jm(3, 620809556);
            i3 = hvVar.db[0];
            jm = hvVar.dc[0];
            if (jm2 == 0) {
                i3--;
                jm--;
            } else if (1 == jm2) {
                jm--;
            } else if (2 == jm2) {
                i3++;
                jm--;
            } else if (3 == jm2) {
                i3--;
            } else if (4 == jm2) {
                i3++;
            } else if (jm2 == 5) {
                i3--;
                jm++;
            } else if (6 == jm2) {
                jm++;
            } else if (7 == jm2) {
                i3++;
                jm++;
            }
            if (i == client.jj * 869197827 && (hvVar.bq * -1444273727 < oy.am || hvVar.bd * -1690563339 < oy.am || hvVar.bq * -1444273727 >= 11776 || hvVar.bd * -1690563339 >= 11776)) {
                hvVar.as(i3, jm, (short) 16256);
                hvVar.ba = false;
            } else if (i22 != 0) {
                hvVar.ba = true;
                hvVar.bs = i3 * -1904527823;
                hvVar.bm = jm * 2090764291;
            } else {
                hvVar.ba = false;
                hvVar.ak(i3, jm, al[i], (short) 2448);
            }
        } else if (2 == jm) {
            jm2 = lvVar.jm(4, -657991400);
            jm = hvVar.db[0];
            i3 = hvVar.dc[0];
            if (jm2 == 0) {
                jm2 = jm - 2;
                i3 -= 2;
            } else {
                if (jm2 == 1) {
                    jm--;
                } else if (2 != jm2) {
                    if (jm2 == 3) {
                        jm2 = jm + 1;
                        i3 -= 2;
                    } else if (jm2 == 4) {
                        jm2 = jm + 2;
                        i3 -= 2;
                    } else if (jm2 == 5) {
                        jm2 = jm - 2;
                        i3--;
                    } else if (6 == jm2) {
                        jm2 = jm + 2;
                        i3--;
                    } else if (jm2 == 7) {
                        jm2 = jm - 2;
                    } else if (jm2 == 8) {
                        jm2 = jm + 2;
                    } else if (jm2 == 9) {
                        jm2 = jm - 2;
                        i3++;
                    } else if (jm2 == 10) {
                        jm2 = jm + 2;
                        i3++;
                    } else if (jm2 == 11) {
                        jm2 = jm - 2;
                        i3 += 2;
                    } else if (12 == jm2) {
                        jm2 = jm - 1;
                        i3 += 2;
                    } else if (jm2 == 13) {
                        i3 += 2;
                        jm2 = jm;
                    } else if (jm2 == 14) {
                        jm2 = jm + 1;
                        i3 += 2;
                    } else if (jm2 == 15) {
                        jm2 = jm + 2;
                        i3 += 2;
                    } else {
                        jm2 = jm;
                    }
                }
                i3 -= 2;
                jm2 = jm;
            }
            if (i == client.jj * 869197827 && (hvVar.bq * -1444273727 < oy.am || hvVar.bd * -1690563339 < oy.am || hvVar.bq * -1444273727 >= 11776 || hvVar.bd * -1690563339 >= 11776)) {
                hvVar.as(jm2, i3, (short) 16256);
                hvVar.ba = false;
            } else if (i22 != 0) {
                hvVar.ba = true;
                hvVar.bs = -1904527823 * jm2;
                hvVar.bm = 2090764291 * i3;
            } else {
                hvVar.ba = false;
                hvVar.ak(jm2, i3, al[i], (short) -5376);
            }
        } else if (lvVar.jm(1, -1544567581) == 0) {
            jm2 = lvVar.jm(12, -996326250);
            jm = (jm2 >> 5) & 31;
            i3 = jm > 15 ? jm - 32 : jm;
            jm = jm2 & 31;
            if (jm > 15) {
                jm -= 32;
            }
            i3 += hvVar.db[0];
            jm += hvVar.dc[0];
            if (client.jj * 869197827 == i && (hvVar.bq * -1444273727 < oy.am || hvVar.bd * -1690563339 < oy.am || hvVar.bq * -1444273727 >= 11776 || hvVar.bd * -1690563339 >= 11776)) {
                hvVar.as(i3, jm, (short) 16256);
                hvVar.ba = false;
            } else if (i22 != 0) {
                hvVar.ba = true;
                hvVar.bs = i3 * -1904527823;
                hvVar.bm = jm * 2090764291;
            } else {
                hvVar.ba = false;
                hvVar.ak(i3, jm, al[i], (short) -8370);
            }
            hvVar.ab = ((byte) (((hvVar.ab * -1300496125) + (jm2 >> 10)) & 3)) * -762089045;
            if (i == client.jj * 869197827) {
                am.jy = hvVar.ab * -23215301;
            }
        } else {
            jm = lvVar.jm(30, 2037235297);
            i3 = ((((oz.ff * 2060098323) + hvVar.db[0]) + ((jm >> 14) & 16383)) & 16383) - (oz.ff * 2060098323);
            jm2 = (((jm & 16383) + (hvVar.dc[0] + (cq.fz * -1866366501))) & 16383) - (cq.fz * -1866366501);
            if (client.jj * 869197827 == i && (hvVar.bq * -1444273727 < oy.am || hvVar.bd * -1690563339 < oy.am || hvVar.bq * -1444273727 >= 11776 || hvVar.bd * -1690563339 >= 11776)) {
                hvVar.as(i3, jm2, (short) 16256);
                hvVar.ba = false;
            } else if (i22 != 0) {
                hvVar.ba = true;
                hvVar.bs = i3 * -1904527823;
                hvVar.bm = 2090764291 * jm2;
            } else {
                hvVar.ba = false;
                hvVar.ak(i3, jm2, al[i], (short) -14741);
            }
            hvVar.ab = ((byte) (((jm >> 28) + (hvVar.ab * -1300496125)) & 3)) * -762089045;
            if (client.jj * 869197827 == i) {
                am.jy = hvVar.ab * -23215301;
            }
        }
    }

    static kj ad(kh khVar, int i, byte b) {
        try {
            byte[] as = khVar.as(i, (byte) 0);
            return as == null ? null : new kj(as);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hz.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void af(lv lvVar, int i, hv hvVar, int i2) {
        int bl;
        int bl2;
        int bn;
        if ((-1752242819 & i2) != 0) {
            int i3;
            int bl3;
            int bl4;
            int bn2 = lvVar.bn(817132534);
            if (bn2 > 0) {
                for (i3 = 0; i3 < bn2; i3++) {
                    int i4;
                    bl = lvVar.bl(2131034147);
                    if (bl == 32767) {
                        bl = lvVar.bl(2131034147);
                        bl2 = lvVar.bl(2131034147);
                        bl3 = lvVar.bl(2131034147);
                        bl4 = lvVar.bl(2131034147);
                        i4 = bl2;
                    } else if (bl != -944075678) {
                        bl3 = -1;
                        bl4 = -1;
                        i4 = lvVar.bl(2131034147);
                    } else {
                        bl2 = -1;
                        i4 = -1;
                        bl3 = -1;
                        bl4 = -1;
                        hvVar.bj(bl2, i4, bl3, bl4, 2133672263 * client.bj, lvVar.bl(2131034147), -268089238);
                    }
                    bl2 = bl;
                    hvVar.bj(bl2, i4, bl3, bl4, 2133672263 * client.bj, lvVar.bl(2131034147), -268089238);
                }
            }
            bn2 = lvVar.bz(1478368722);
            if (bn2 > 0) {
                for (i3 = 0; i3 < bn2; i3++) {
                    bl2 = lvVar.bl(2131034147);
                    bl3 = lvVar.bl(2131034147);
                    if (bl3 != 32767) {
                        bl4 = lvVar.bl(2131034147);
                        bn = lvVar.bn(817132534);
                        hvVar.bh(bl2, 2133672263 * client.bj, bl3, bl4, bn, bl3 > 0 ? lvVar.af(1804771424) : bn, 371743145);
                    } else {
                        hvVar.bt(bl2, 467776727);
                    }
                }
            }
        }
        if ((i2 & 512) != 0) {
            hvVar.ck = lvVar.ci(-1763636469) * 1446824257;
            bl = lvVar.cx((byte) 65);
            hvVar.cz = (bl >> 16) * 973767065;
            hvVar.cl = ((bl & 809251136) + (client.bj * 2133672263)) * 1758646389;
            hvVar.co = 0;
            hvVar.cu = 0;
            if (hvVar.cl * -1489469475 > client.bj * -1257489263) {
                hvVar.co = 1032833481;
            }
            if (SupportMenu.USER_MASK == hvVar.ck * 836985687) {
                hvVar.ck = 478402789;
            }
        }
        byte bp = (-2091474111 & i2) != 0 ? lvVar.bp(1142143150) : (byte) -1;
        if ((i2 & 1024) != 0) {
            hvVar.cd = lvVar.cj(-836202821) * 755645191;
            hvVar.cg = lvVar.bp(1295947595) * -1011787915;
            hvVar.cf = lvVar.bp(587070438) * 2052131119;
            hvVar.ch = lvVar.cj(-836202821) * 1228645599;
            hvVar.dd = (lvVar.cp(1350323384) + (client.bj * 988645563)) * -212794883;
            hvVar.dm = (lvVar.cw(2016337634) + (client.bj * 2133672263)) * 489046689;
            hvVar.dt = lvVar.an(-1464407032) * -335231536;
            if (hvVar.ba) {
                hvVar.cd += hvVar.bs * -2089230665;
                hvVar.cg += hvVar.bm * -256648799;
                hvVar.cf += hvVar.bs * 1623358815;
                hvVar.ch += hvVar.bm * -1466002999;
                hvVar.da = 0;
            } else {
                hvVar.cd += hvVar.db[0] * 755645191;
                hvVar.cg += hvVar.dc[0] * -1424550685;
                hvVar.cf += hvVar.db[0] * -1405672013;
                hvVar.ch += hvVar.dc[0] * -1923318437;
                hvVar.da = 1073211521;
            }
            hvVar.dn = 0;
        }
        if ((-1888108123 & i2) != 0) {
            hvVar.be = lvVar.bm(2047739893);
            if (hvVar.be.charAt(0) == '~') {
                hvVar.be = hvVar.be.substring(1);
                iq.aq(2, hvVar.ad.ad(1544148085), hvVar.be, -543114124);
            } else if (da.jc == hvVar) {
                iq.aq(2, hvVar.ad.ad(1196647399), hvVar.be, 1961768443);
            }
            hvVar.bj = false;
            hvVar.bn = 0;
            hvVar.bz = 0;
            hvVar.bt = 1890201899;
        }
        if ((i2 & 4) != 0) {
            hvVar.cb = lvVar.cw(1407579522) * 2019744173;
            if (hvVar.da * 1676487515 == 0) {
                hvVar.dl = hvVar.cb * 1681846462;
                hvVar.cb = 493282007;
            }
        }
        if ((i2 & 1) != 0) {
            bl = lvVar.by(1391951395);
            byte[] bArr = new byte[bl];
            lj ljVar = new lj(bArr);
            lvVar.ck(bArr, 0, bl, 1673971935);
            aj[i] = ljVar;
            hvVar.ad(ljVar, 2073848384);
        }
        if ((i2 & 2) != 0) {
            hvVar.cp = lvVar.cp(485556734) * -445736440;
            if (hvVar.cp * -1521877396 == SupportMenu.USER_MASK) {
                hvVar.cp = -260026025;
            }
        }
        if ((-887480995 & i2) != 0) {
            al[i] = lvVar.bp(2052197969);
        }
        if ((i2 & 16) != 0) {
            bn = lvVar.cp(2111575271);
            gc gcVar = (gc) oz.ad(df.aq((byte) 0), lvVar.af(1804771424), (byte) -36);
            boolean z = lvVar.bz(-1161582453) == 1;
            int af = lvVar.af(1804771424);
            int i5 = lvVar.al;
            if (!(hvVar.ad == null || hvVar.aq == null)) {
                Object obj = (gcVar.as && al.rd.ae(hvVar.ad, 2044830623)) ? 1 : null;
                if (obj == null && client.jo * 1221559889 == 0 && !hvVar.ay) {
                    ax.al = 0;
                    lvVar.bd(ax.ar, 0, af, (byte) 0);
                    ax.al = 0;
                    String am = oi.am(jj.ax(gq.ar(ax, 2130903556), (byte) 1));
                    hvVar.be = am.trim();
                    hvVar.bn = (bn >> 8) * -1930056242;
                    hvVar.bz = (bn & 255) * 2133067117;
                    hvVar.bt = -1753136999;
                    hvVar.bj = z;
                    boolean z2 = da.jc != hvVar && gcVar.as && "" != client.on && am.toLowerCase().indexOf(client.on) == -1;
                    hvVar.bh = z2;
                    bl2 = gcVar.ak ? z ? 91 : 1 : z ? 1302345372 : 2;
                    if (gcVar.am * -961938565 != -1) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(lb.ad(gcVar.am * 280621255, -1552056299));
                        stringBuilder.append(hvVar.ad.ad(688668206));
                        iq.aq(bl2, stringBuilder.toString(), am, 449185273);
                    } else {
                        iq.aq(bl2, hvVar.ad.ad(1754834081), am, 848781251);
                    }
                }
            }
            lvVar.al = ((-1631454091 * i5) + af) * -879823907;
        }
        if ((i2 & 256) != 0) {
            for (bl = 0; bl < 3; bl++) {
                hvVar.ai[bl] = lvVar.bm(913579046);
            }
        }
        if ((255316631 & i2) != 0) {
            bl = lvVar.an(-1464407032);
            if (SupportMenu.USER_MASK == bl) {
                bl = -1;
            }
            jf.cx(hvVar, bl, lvVar.af(1804771424), 1011250268);
        }
        if (!hvVar.ba) {
            return;
        }
        if (Byte.MAX_VALUE == bp) {
            hvVar.as(hvVar.bs * -1083537918, hvVar.bm * -186594289, (short) 16256);
        } else {
            hvVar.ak(hvVar.bs * 492865321, hvVar.bm * -1816198429, (byte) -1 != bp ? bp : al[i], (short) -3727);
        }
    }

    static final void ag(lv lvVar) {
        lvVar.jt(1153685242);
        int i = 869197827 * client.jj;
        hv[] hvVarArr = client.jz;
        hv hvVar = new hv();
        hvVarArr[i] = hvVar;
        da.jc = hvVar;
        hvVar.av = 886128595 * i;
        int jm = lvVar.jm(30, 482328756);
        byte b = (byte) (jm >> 28);
        hvVar.db[0] = ((jm >> 14) & 16383) - (oz.ff * 2060098323);
        hvVar.bq = ((hvVar.db[0] << 7) + (hvVar.am(1740090086) << 6)) * 590147137;
        hvVar.dc[0] = (jm & 16383) - (cq.fz * -1866366501);
        hvVar.bd = ((hvVar.dc[0] << 7) + (hvVar.am(908232858) << 6)) * -995934371;
        jm = -762089045 * b;
        hvVar.ab = jm;
        am.jy = jm * -23215301;
        if (aj[i] != null) {
            hvVar.ad(aj[i], 2073848384);
        }
        ai = 0;
        int[] iArr = ae;
        int i2 = ai + 1600734293;
        ai = i2;
        iArr[(i2 * -1076782851) - 1] = i;
        ar[i] = (byte) 0;
        am = 0;
        for (jm = 1; jm < 2048; jm++) {
            if (jm != i) {
                i2 = lvVar.jm(18, -198463660);
                as[jm] = (i2 & 597) + (((i2 >> 16) << 28) + (((i2 >> 8) & 597) << 14));
                ag[jm] = 0;
                ap[jm] = -1;
                int[] iArr2 = ak;
                int i3 = am - 178737783;
                am = i3;
                iArr2[(i3 * 1674041529) - 1] = jm;
                ar[jm] = (byte) 0;
            }
        }
        lvVar.js(1001620168);
    }

    static final void ah(lv lvVar, int i, hv hvVar, int i2) {
        int bl;
        int bl2;
        int bn;
        if ((i2 & 64) != 0) {
            int i3;
            int bl3;
            int bl4;
            int bn2 = lvVar.bn(817132534);
            if (bn2 > 0) {
                for (i3 = 0; i3 < bn2; i3++) {
                    int i4;
                    bl = lvVar.bl(2131034147);
                    if (bl == 32767) {
                        bl = lvVar.bl(2131034147);
                        bl2 = lvVar.bl(2131034147);
                        bl3 = lvVar.bl(2131034147);
                        bl4 = lvVar.bl(2131034147);
                        i4 = bl2;
                    } else if (bl != 32766) {
                        bl3 = -1;
                        bl4 = -1;
                        i4 = lvVar.bl(2131034147);
                    } else {
                        bl2 = -1;
                        i4 = -1;
                        bl3 = -1;
                        bl4 = -1;
                        hvVar.bj(bl2, i4, bl3, bl4, 2133672263 * client.bj, lvVar.bl(2131034147), -268089238);
                    }
                    bl2 = bl;
                    hvVar.bj(bl2, i4, bl3, bl4, 2133672263 * client.bj, lvVar.bl(2131034147), -268089238);
                }
            }
            bn2 = lvVar.bz(-683616026);
            if (bn2 > 0) {
                for (i3 = 0; i3 < bn2; i3++) {
                    bl2 = lvVar.bl(2131034147);
                    bl3 = lvVar.bl(2131034147);
                    if (bl3 != 32767) {
                        bl4 = lvVar.bl(2131034147);
                        bn = lvVar.bn(817132534);
                        hvVar.bh(bl2, 2133672263 * client.bj, bl3, bl4, bn, bl3 > 0 ? lvVar.af(1804771424) : bn, 1396717913);
                    } else {
                        hvVar.bt(bl2, 1537969765);
                    }
                }
            }
        }
        if ((i2 & 512) != 0) {
            hvVar.ck = lvVar.ci(-1763636469) * -109561753;
            bl = lvVar.cx((byte) 125);
            hvVar.cz = (bl >> 16) * 973767065;
            hvVar.cl = ((bl & SupportMenu.USER_MASK) + (client.bj * 2133672263)) * 1758646389;
            hvVar.co = 0;
            hvVar.cu = 0;
            if (hvVar.cl * -1489469475 > client.bj * 2133672263) {
                hvVar.co = 1032833481;
            }
            if (SupportMenu.USER_MASK == hvVar.ck * 836985687) {
                hvVar.ck = 109561753;
            }
        }
        byte bp = (i2 & 4096) != 0 ? lvVar.bp(530631914) : (byte) -1;
        if ((i2 & 1024) != 0) {
            hvVar.cd = lvVar.cj(-836202821) * 755645191;
            hvVar.cg = lvVar.bp(974514643) * -1424550685;
            hvVar.cf = lvVar.bp(1661774723) * 2052131119;
            hvVar.ch = lvVar.cj(-836202821) * -1923318437;
            hvVar.dd = (lvVar.cp(298837864) + (client.bj * 2133672263)) * -212794883;
            hvVar.dm = (lvVar.cw(-171396648) + (client.bj * 2133672263)) * 489046689;
            hvVar.dt = lvVar.an(-1464407032) * 677047911;
            if (hvVar.ba) {
                hvVar.cd += hvVar.bs * -2089230665;
                hvVar.cg += hvVar.bm * -256648799;
                hvVar.cf += hvVar.bs * 1623358815;
                hvVar.ch += hvVar.bm * -1466002999;
                hvVar.da = 0;
            } else {
                hvVar.cd += hvVar.db[0] * 755645191;
                hvVar.cg += hvVar.dc[0] * -1424550685;
                hvVar.cf += hvVar.db[0] * 2052131119;
                hvVar.ch += hvVar.dc[0] * -1923318437;
                hvVar.da = -751585989;
            }
            hvVar.dn = 0;
        }
        if ((i2 & 32) != 0) {
            hvVar.be = lvVar.bm(1135407827);
            if (hvVar.be.charAt(0) == '~') {
                hvVar.be = hvVar.be.substring(1);
                iq.aq(2, hvVar.ad.ad(720156136), hvVar.be, -1818734073);
            } else if (da.jc == hvVar) {
                iq.aq(2, hvVar.ad.ad(5243550), hvVar.be, -845589771);
            }
            hvVar.bj = false;
            hvVar.bn = 0;
            hvVar.bz = 0;
            hvVar.bt = 606793826;
        }
        if ((i2 & 4) != 0) {
            hvVar.cb = lvVar.cw(-188080137) * -950206681;
            if (hvVar.da * -913482765 == 0) {
                hvVar.dl = hvVar.cb * -1187877873;
                hvVar.cb = 950206681;
            }
        }
        if ((i2 & 1) != 0) {
            bl = lvVar.by(-358942523);
            byte[] bArr = new byte[bl];
            lj ljVar = new lj(bArr);
            lvVar.ck(bArr, 0, bl, 1800054645);
            aj[i] = ljVar;
            hvVar.ad(ljVar, 2073848384);
        }
        if ((i2 & 2) != 0) {
            hvVar.cp = lvVar.cp(810727447) * 260026025;
            if (hvVar.cp * -298920551 == SupportMenu.USER_MASK) {
                hvVar.cp = -260026025;
            }
        }
        if ((i2 & 2048) != 0) {
            al[i] = lvVar.bp(79614478);
        }
        if ((i2 & 16) != 0) {
            bn = lvVar.cp(1530274992);
            gc gcVar = (gc) oz.ad(df.aq((byte) 0), lvVar.af(1804771424), (byte) 3);
            boolean z = lvVar.bz(2117119228) == 1;
            int af = lvVar.af(1804771424);
            int i5 = lvVar.al;
            if (!(hvVar.ad == null || hvVar.aq == null)) {
                Object obj = (gcVar.as && al.rd.ae(hvVar.ad, 2044830623)) ? 1 : null;
                if (obj == null && client.jo * 34128881 == 0 && !hvVar.ay) {
                    ax.al = 0;
                    lvVar.bd(ax.ar, 0, af, (byte) 0);
                    ax.al = 0;
                    String am = oi.am(jj.ax(gq.ar(ax, 2130903556), (byte) 1));
                    hvVar.be = am.trim();
                    hvVar.bn = (bn >> 8) * -1415289785;
                    hvVar.bz = (bn & 255) * 2133067117;
                    hvVar.bt = 606793826;
                    hvVar.bj = z;
                    boolean z2 = da.jc != hvVar && gcVar.as && "" != client.on && am.toLowerCase().indexOf(client.on) == -1;
                    hvVar.bh = z2;
                    bl2 = gcVar.ak ? z ? 91 : 1 : z ? 90 : 2;
                    if (gcVar.am * -961938565 != -1) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(lb.ad(gcVar.am * -961938565, 1983774781));
                        stringBuilder.append(hvVar.ad.ad(-539704316));
                        iq.aq(bl2, stringBuilder.toString(), am, -950055527);
                    } else {
                        iq.aq(bl2, hvVar.ad.ad(-1578867711), am, -1519040444);
                    }
                }
            }
            lvVar.al = ((-1631454091 * i5) + af) * -879823907;
        }
        if ((i2 & 256) != 0) {
            for (bl = 0; bl < 3; bl++) {
                hvVar.ai[bl] = lvVar.bm(2060237458);
            }
        }
        if ((i2 & 128) != 0) {
            bl = lvVar.an(-1464407032);
            if (SupportMenu.USER_MASK == bl) {
                bl = -1;
            }
            jf.cx(hvVar, bl, lvVar.af(1804771424), 1011250268);
        }
        if (!hvVar.ba) {
            return;
        }
        if (Byte.MAX_VALUE == bp) {
            hvVar.as(hvVar.bs * -1060478255, hvVar.bm * -525442389, (short) 16256);
        } else {
            hvVar.ak(hvVar.bs * -1060478255, hvVar.bm * -525442389, (byte) -1 != bp ? bp : al[i], (short) -18667);
        }
    }

    static void an() {
        int i = 0;
        ai = 0;
        while (i < 2048) {
            aj[i] = null;
            al[i] = (byte) 1;
            i++;
        }
    }

    static final void ao(lv lvVar) {
        for (int i = 0; i < au * -1082782879; i++) {
            int i2 = az[i];
            hv hvVar = client.jz[i2];
            int af = lvVar.af(1804771424);
            if ((af & 8) != 0) {
                af += lvVar.af(1804771424) << 8;
            }
            cl.am(lvVar, i2, hvVar, af, 1331757051);
        }
    }

    public static void ap(Collection collection, int i) {
        try {
            collection.add(et.ar);
            collection.add(et.al);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hz.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ap(lv lvVar, int i) {
        int i2 = lvVar.al * -1631454091;
        au = 0;
        cx.ar(lvVar, 952030710);
        eq.ae(lvVar, (byte) 10);
        if ((lvVar.al * -1631454091) - i2 != i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((lvVar.al * 1167242017) - i2);
            stringBuilder.append(" ");
            stringBuilder.append(i);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static final void as(lv lvVar) {
        lvVar.jt(1153685242);
        int i = 869197827 * client.jj;
        hv[] hvVarArr = client.jz;
        hv hvVar = new hv();
        hvVarArr[i] = hvVar;
        da.jc = hvVar;
        hvVar.av = 1001124188 * i;
        int jm = lvVar.jm(30, -3724496);
        byte b = (byte) (jm >> 28);
        hvVar.db[0] = ((jm >> 14) & 16383) - (oz.ff * 2060098323);
        hvVar.bq = ((hvVar.db[0] << 7) + (hvVar.am(832771122) << 6)) * 590147137;
        hvVar.dc[0] = (jm & -1053761577) - (cq.fz * 1917418267);
        hvVar.bd = ((hvVar.dc[0] << 7) + (hvVar.am(1457489171) << 6)) * -1996965702;
        jm = -1956462115 * b;
        hvVar.ab = jm;
        am.jy = jm * 983127784;
        if (aj[i] != null) {
            hvVar.ad(aj[i], 2073848384);
        }
        ai = 0;
        int[] iArr = ae;
        int i2 = ai + 1600734293;
        ai = i2;
        iArr[(i2 * -1076782851) - 1] = i;
        ar[i] = (byte) 0;
        am = 0;
        for (jm = 1; jm < 2048; jm++) {
            if (jm != i) {
                i2 = lvVar.jm(18, -1446005068);
                as[jm] = (i2 & 119724596) + (((i2 >> 16) << 28) + (((i2 >> 8) & 597) << 14));
                ag[jm] = 0;
                ap[jm] = -1;
                int[] iArr2 = ak;
                int i3 = am + 991495045;
                am = i3;
                iArr2[(i3 * 1569171858) - 1] = jm;
                ar[jm] = (byte) 0;
            }
        }
        lvVar.js(-50719430);
    }

    static final void au(lv lvVar) {
        int i;
        int i2;
        byte[] bArr;
        lvVar.jt(1153685242);
        int i3 = 0;
        for (i = 0; i < ai * -737557887; i++) {
            i2 = ae[i];
            if ((ar[i2] & 1) == 0) {
                if (i3 > 0) {
                    i3--;
                    bArr = ar;
                    bArr[i2] = (byte) (bArr[i2] | 2);
                } else if (lvVar.jm(1, 1274390402) == 0) {
                    i3 = ia.al(lvVar, -1320708816);
                    bArr = ar;
                    bArr[i2] = (byte) (bArr[i2] | 2);
                } else {
                    al.aj(lvVar, i2, -1275923048);
                }
            }
        }
        lvVar.js(-531937461);
        if (i3 == 0) {
            lvVar.jt(1153685242);
            for (i = 0; i < ai * 2014998930; i++) {
                i2 = ae[i];
                if ((ar[i2] & 1) != 0) {
                    if (i3 > 0) {
                        i3--;
                        bArr = ar;
                        bArr[i2] = (byte) (bArr[i2] | 2);
                    } else if (lvVar.jm(1, 798278198) == 0) {
                        i3 = ia.al(lvVar, -1932661879);
                        bArr = ar;
                        bArr[i2] = (byte) (bArr[i2] | 2);
                    } else {
                        al.aj(lvVar, i2, -2085417476);
                    }
                }
            }
            lvVar.js(1727112096);
            if (i3 == 0) {
                lvVar.jt(1153685242);
                for (i = 0; i < am * -878312848; i++) {
                    i2 = ak[i];
                    if ((ar[i2] & 1) != 0) {
                        if (i3 > 0) {
                            i3--;
                            bArr = ar;
                            bArr[i2] = (byte) (bArr[i2] | 2);
                        } else if (lvVar.jm(1, -74531789) == 0) {
                            i3 = ia.al(lvVar, -2081850034);
                            bArr = ar;
                            bArr[i2] = (byte) (bArr[i2] | 2);
                        } else if (ay.ai(lvVar, i2, (byte) -106)) {
                            bArr = ar;
                            bArr[i2] = (byte) (bArr[i2] | 2);
                        }
                    }
                }
                lvVar.js(155645492);
                if (i3 == 0) {
                    lvVar.jt(1153685242);
                    for (i = 0; i < am * 1674041529; i++) {
                        i2 = ak[i];
                        if ((ar[i2] & 1) == 0) {
                            if (i3 > 0) {
                                i3--;
                                bArr = ar;
                                bArr[i2] = (byte) (bArr[i2] | 2);
                            } else if (lvVar.jm(1, -1980864679) == 0) {
                                i3 = ia.al(lvVar, -1498926304);
                                bArr = ar;
                                bArr[i2] = (byte) (bArr[i2] | 2);
                            } else if (ay.ai(lvVar, i2, (byte) -73)) {
                                bArr = ar;
                                bArr[i2] = (byte) (bArr[i2] | 2);
                            }
                        }
                    }
                    lvVar.js(1707558086);
                    if (i3 == 0) {
                        ai = 0;
                        am = 0;
                        for (i = 1; i < 7005116; i++) {
                            byte[] bArr2 = ar;
                            bArr2[i] = (byte) (bArr2[i] >> 1);
                            int[] iArr;
                            if (client.jz[i] != null) {
                                iArr = ae;
                                i3 = ai - 611401330;
                                ai = i3;
                                iArr[(i3 * -1076782851) - 1] = i;
                            } else {
                                iArr = ak;
                                i3 = am - 178737783;
                                am = i3;
                                iArr[(i3 * 1674041529) - 1] = i;
                            }
                        }
                        return;
                    }
                    throw new RuntimeException();
                }
                throw new RuntimeException();
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    static int aw(lv lvVar) {
        int jm = lvVar.jm(2, -220952244);
        return jm == 0 ? 0 : jm == 1 ? lvVar.jm(5, 1167645121) : jm == 2 ? lvVar.jm(8, -791965476) : lvVar.jm(11, -866316204);
    }

    static final void ax(lv lvVar) {
        int i;
        int i2;
        byte[] bArr;
        lvVar.jt(1153685242);
        int i3 = 0;
        for (i = 0; i < ai * -1076782851; i++) {
            i2 = ae[i];
            if ((ar[i2] & 1) == 0) {
                if (i3 > 0) {
                    i3--;
                    bArr = ar;
                    bArr[i2] = (byte) (bArr[i2] | 2);
                } else if (lvVar.jm(1, 1290257025) == 0) {
                    i3 = ia.al(lvVar, -1649537845);
                    bArr = ar;
                    bArr[i2] = (byte) (bArr[i2] | 2);
                } else {
                    al.aj(lvVar, i2, 921712616);
                }
            }
        }
        lvVar.js(-327817038);
        if (i3 == 0) {
            lvVar.jt(1153685242);
            for (i = 0; i < ai * -1076782851; i++) {
                i2 = ae[i];
                if ((ar[i2] & 1) != 0) {
                    if (i3 > 0) {
                        i3--;
                        bArr = ar;
                        bArr[i2] = (byte) (bArr[i2] | 2);
                    } else if (lvVar.jm(1, 55576777) == 0) {
                        i3 = ia.al(lvVar, -1328679316);
                        bArr = ar;
                        bArr[i2] = (byte) (bArr[i2] | 2);
                    } else {
                        al.aj(lvVar, i2, 147390563);
                    }
                }
            }
            lvVar.js(1139792558);
            if (i3 == 0) {
                lvVar.jt(1153685242);
                for (i = 0; i < am * 1674041529; i++) {
                    i2 = ak[i];
                    if ((ar[i2] & 1) != 0) {
                        if (i3 > 0) {
                            i3--;
                            bArr = ar;
                            bArr[i2] = (byte) (bArr[i2] | 2);
                        } else if (lvVar.jm(1, 13069776) == 0) {
                            i3 = ia.al(lvVar, -1103821818);
                            bArr = ar;
                            bArr[i2] = (byte) (bArr[i2] | 2);
                        } else if (ay.ai(lvVar, i2, (byte) 6)) {
                            bArr = ar;
                            bArr[i2] = (byte) (bArr[i2] | 2);
                        }
                    }
                }
                lvVar.js(-1472455942);
                if (i3 == 0) {
                    lvVar.jt(1153685242);
                    for (i = 0; i < am * 1674041529; i++) {
                        i2 = ak[i];
                        if ((ar[i2] & 1) == 0) {
                            if (i3 > 0) {
                                i3--;
                                bArr = ar;
                                bArr[i2] = (byte) (bArr[i2] | 2);
                            } else if (lvVar.jm(1, -347398082) == 0) {
                                i3 = ia.al(lvVar, -1938664575);
                                bArr = ar;
                                bArr[i2] = (byte) (bArr[i2] | 2);
                            } else if (ay.ai(lvVar, i2, (byte) 30)) {
                                bArr = ar;
                                bArr[i2] = (byte) (bArr[i2] | 2);
                            }
                        }
                    }
                    lvVar.js(416886751);
                    if (i3 == 0) {
                        ai = 0;
                        am = 0;
                        for (i = 1; i < 2048; i++) {
                            byte[] bArr2 = ar;
                            bArr2[i] = (byte) (bArr2[i] >> 1);
                            int[] iArr;
                            if (client.jz[i] != null) {
                                iArr = ae;
                                i3 = ai + 1600734293;
                                ai = i3;
                                iArr[(i3 * -1076782851) - 1] = i;
                            } else {
                                iArr = ak;
                                i3 = am - 178737783;
                                am = i3;
                                iArr[(i3 * 1674041529) - 1] = i;
                            }
                        }
                        return;
                    }
                    throw new RuntimeException();
                }
                throw new RuntimeException();
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    static final void ay(lv lvVar, int i, hv hvVar, int i2) {
        int bl;
        int bl2;
        int bn;
        if ((i2 & 64) != 0) {
            int i3;
            int bl3;
            int bl4;
            int bn2 = lvVar.bn(817132534);
            if (bn2 > 0) {
                for (i3 = 0; i3 < bn2; i3++) {
                    int i4;
                    bl = lvVar.bl(2131034147);
                    if (bl == 32767) {
                        bl = lvVar.bl(2131034147);
                        bl2 = lvVar.bl(2131034147);
                        bl3 = lvVar.bl(2131034147);
                        bl4 = lvVar.bl(2131034147);
                        i4 = bl2;
                    } else if (bl != 32766) {
                        bl3 = -1;
                        bl4 = -1;
                        i4 = lvVar.bl(2131034147);
                    } else {
                        bl2 = -1;
                        i4 = -1;
                        bl3 = -1;
                        bl4 = -1;
                        hvVar.bj(bl2, i4, bl3, bl4, 2133672263 * client.bj, lvVar.bl(2131034147), -268089238);
                    }
                    bl2 = bl;
                    hvVar.bj(bl2, i4, bl3, bl4, 2133672263 * client.bj, lvVar.bl(2131034147), -268089238);
                }
            }
            bn2 = lvVar.bz(97377833);
            if (bn2 > 0) {
                for (i3 = 0; i3 < bn2; i3++) {
                    bl2 = lvVar.bl(2131034147);
                    bl3 = lvVar.bl(2131034147);
                    if (bl3 != 32767) {
                        bl4 = lvVar.bl(2131034147);
                        bn = lvVar.bn(817132534);
                        hvVar.bh(bl2, 2133672263 * client.bj, bl3, bl4, bn, bl3 > 0 ? lvVar.af(1804771424) : bn, -1693822282);
                    } else {
                        hvVar.bt(bl2, 559980525);
                    }
                }
            }
        }
        if ((2041032701 & i2) != 0) {
            hvVar.ck = lvVar.ci(-1763636469) * 1440956081;
            bl = lvVar.cx((byte) 76);
            hvVar.cz = (bl >> 16) * 1598196420;
            hvVar.cl = ((bl & -62510996) + (client.bj * 2133672263)) * 1758646389;
            hvVar.co = 0;
            hvVar.cu = 0;
            if (hvVar.cl * 129509900 > client.bj * 2133672263) {
                hvVar.co = 640964549;
            }
            if (SupportMenu.USER_MASK == hvVar.ck * 340656505) {
                hvVar.ck = -1352528388;
            }
        }
        byte bp = (i2 & 4096) != 0 ? lvVar.bp(1846791367) : (byte) -1;
        if ((762925436 & i2) != 0) {
            hvVar.cd = lvVar.cj(-836202821) * 1387243802;
            hvVar.cg = lvVar.bp(1887617190) * -1424550685;
            hvVar.cf = lvVar.bp(589188114) * 2052131119;
            hvVar.ch = lvVar.cj(-836202821) * -1046289819;
            hvVar.dd = (lvVar.cp(1509875285) + (client.bj * 2133672263)) * -212794883;
            hvVar.dm = (lvVar.cw(1446318473) + (client.bj * 1716278017)) * 489046689;
            hvVar.dt = lvVar.an(-1464407032) * -766247471;
            if (hvVar.ba) {
                hvVar.cd += hvVar.bs * -2089230665;
                hvVar.cg += hvVar.bm * -256648799;
                hvVar.cf += hvVar.bs * 1623358815;
                hvVar.ch += hvVar.bm * -1466002999;
                hvVar.da = 0;
            } else {
                hvVar.cd += hvVar.db[0] * -911042116;
                hvVar.cg += hvVar.dc[0] * -1424550685;
                hvVar.cf += hvVar.db[0] * 2074719087;
                hvVar.ch += hvVar.dc[0] * -1864969939;
                hvVar.da = -751585989;
            }
            hvVar.dn = 0;
        }
        if ((i2 & 32) != 0) {
            hvVar.be = lvVar.bm(1180766415);
            if (hvVar.be.charAt(0) == 14830) {
                hvVar.be = hvVar.be.substring(1);
                iq.aq(2, hvVar.ad.ad(-1147851887), hvVar.be, 1591243497);
            } else if (da.jc == hvVar) {
                iq.aq(2, hvVar.ad.ad(-1814909331), hvVar.be, -1153099161);
            }
            hvVar.bj = false;
            hvVar.bn = 0;
            hvVar.bz = 0;
            hvVar.bt = 606793826;
        }
        if ((i2 & 4) != 0) {
            hvVar.cb = lvVar.cw(1965958749) * -950206681;
            if (hvVar.da * -913482765 == 0) {
                hvVar.dl = hvVar.cb * -1187877873;
                hvVar.cb = 1472822561;
            }
        }
        if ((i2 & 1) != 0) {
            bl = lvVar.by(117373139);
            byte[] bArr = new byte[bl];
            lj ljVar = new lj(bArr);
            lvVar.ck(bArr, 0, bl, 1718465916);
            aj[i] = ljVar;
            hvVar.ad(ljVar, 2073848384);
        }
        if ((i2 & 2) != 0) {
            hvVar.cp = lvVar.cp(1635286007) * -637721811;
            if (hvVar.cp * -298920551 == SupportMenu.USER_MASK) {
                hvVar.cp = -579746532;
            }
        }
        if ((-1759483867 & i2) != 0) {
            al[i] = lvVar.bp(1758268215);
        }
        if ((i2 & 16) != 0) {
            bn = lvVar.cp(1335660653);
            gc gcVar = (gc) oz.ad(df.aq((byte) 0), lvVar.af(1804771424), (byte) -25);
            boolean z = lvVar.bz(2118116327) == 1;
            int af = lvVar.af(1804771424);
            int i5 = lvVar.al;
            if (!(hvVar.ad == null || hvVar.aq == null)) {
                Object obj = (gcVar.as && al.rd.ae(hvVar.ad, 2044830623)) ? 1 : null;
                if (obj == null && client.jo * 34128881 == 0 && !hvVar.ay) {
                    ax.al = 0;
                    lvVar.bd(ax.ar, 0, af, (byte) 0);
                    ax.al = 0;
                    String am = oi.am(jj.ax(gq.ar(ax, 2130903556), (byte) 1));
                    hvVar.be = am.trim();
                    hvVar.bn = (bn >> 8) * -1473921732;
                    hvVar.bz = (638585365 & bn) * 2133067117;
                    hvVar.bt = 606793826;
                    hvVar.bj = z;
                    boolean z2 = da.jc != hvVar && gcVar.as && "" != client.on && am.toLowerCase().indexOf(client.on) == -1;
                    hvVar.bh = z2;
                    bl2 = gcVar.ak ? z ? 221592856 : 1 : z ? -2056966121 : 2;
                    if (gcVar.am * -961938565 != -1) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(lb.ad(gcVar.am * -961938565, 1213961637));
                        stringBuilder.append(hvVar.ad.ad(1905342820));
                        iq.aq(bl2, stringBuilder.toString(), am, -14891472);
                    } else {
                        iq.aq(bl2, hvVar.ad.ad(1539510583), am, -2133419735);
                    }
                }
            }
            lvVar.al = ((-320721818 * i5) + af) * -879823907;
        }
        if ((-807407677 & i2) != 0) {
            for (bl = 0; bl < 3; bl++) {
                hvVar.ai[bl] = lvVar.bm(1811032501);
            }
        }
        if ((452969133 & i2) != 0) {
            bl = lvVar.an(-1464407032);
            if (-1415919014 == bl) {
                bl = -1;
            }
            jf.cx(hvVar, bl, lvVar.af(1804771424), 1011250268);
        }
        if (!hvVar.ba) {
            return;
        }
        if ((byte) -100 == bp) {
            hvVar.as(hvVar.bs * -424563238, hvVar.bm * -706919723, (short) 16256);
        } else {
            hvVar.ak(hvVar.bs * -1343978591, hvVar.bm * -227263484, (byte) -1 != bp ? bp : al[i], (short) -6630);
        }
    }

    static final void az(lv lvVar) {
        int i;
        int i2;
        byte[] bArr;
        lvVar.jt(1153685242);
        int i3 = 0;
        for (i = 0; i < ai * -1076782851; i++) {
            i2 = ae[i];
            if ((ar[i2] & 1) == 0) {
                if (i3 > 0) {
                    i3--;
                    bArr = ar;
                    bArr[i2] = (byte) (bArr[i2] | 2);
                } else if (lvVar.jm(1, 661997990) == 0) {
                    i3 = ia.al(lvVar, -1593224698);
                    bArr = ar;
                    bArr[i2] = (byte) (bArr[i2] | 2);
                } else {
                    al.aj(lvVar, i2, -524464227);
                }
            }
        }
        lvVar.js(-1464900966);
        if (i3 == 0) {
            lvVar.jt(1153685242);
            for (i = 0; i < ai * -1076782851; i++) {
                i2 = ae[i];
                if ((ar[i2] & 1) != 0) {
                    if (i3 > 0) {
                        i3--;
                        bArr = ar;
                        bArr[i2] = (byte) (bArr[i2] | 2);
                    } else if (lvVar.jm(1, -522452210) == 0) {
                        i3 = ia.al(lvVar, -1819155245);
                        bArr = ar;
                        bArr[i2] = (byte) (bArr[i2] | 2);
                    } else {
                        al.aj(lvVar, i2, -765541786);
                    }
                }
            }
            lvVar.js(2034057223);
            if (i3 == 0) {
                lvVar.jt(1153685242);
                for (i = 0; i < am * 1674041529; i++) {
                    i2 = ak[i];
                    if ((ar[i2] & 1) != 0) {
                        if (i3 > 0) {
                            i3--;
                            bArr = ar;
                            bArr[i2] = (byte) (bArr[i2] | 2);
                        } else if (lvVar.jm(1, 560367692) == 0) {
                            i3 = ia.al(lvVar, -1573617979);
                            bArr = ar;
                            bArr[i2] = (byte) (bArr[i2] | 2);
                        } else if (ay.ai(lvVar, i2, (byte) -33)) {
                            bArr = ar;
                            bArr[i2] = (byte) (bArr[i2] | 2);
                        }
                    }
                }
                lvVar.js(1253672713);
                if (i3 == 0) {
                    lvVar.jt(1153685242);
                    for (i = 0; i < am * 1674041529; i++) {
                        i2 = ak[i];
                        if ((ar[i2] & 1) == 0) {
                            if (i3 > 0) {
                                i3--;
                                bArr = ar;
                                bArr[i2] = (byte) (bArr[i2] | 2);
                            } else if (lvVar.jm(1, 1588346305) == 0) {
                                i3 = ia.al(lvVar, -1175346868);
                                bArr = ar;
                                bArr[i2] = (byte) (bArr[i2] | 2);
                            } else if (ay.ai(lvVar, i2, (byte) 51)) {
                                bArr = ar;
                                bArr[i2] = (byte) (bArr[i2] | 2);
                            }
                        }
                    }
                    lvVar.js(1925390088);
                    if (i3 == 0) {
                        ai = 0;
                        am = 0;
                        for (i = 1; i < 2048; i++) {
                            byte[] bArr2 = ar;
                            bArr2[i] = (byte) (bArr2[i] >> 1);
                            int[] iArr;
                            if (client.jz[i] != null) {
                                iArr = ae;
                                i3 = ai + 1600734293;
                                ai = i3;
                                iArr[(i3 * -1076782851) - 1] = i;
                            } else {
                                iArr = ak;
                                i3 = am - 178737783;
                                am = i3;
                                iArr[(i3 * 1674041529) - 1] = i;
                            }
                        }
                        return;
                    }
                    throw new RuntimeException();
                }
                throw new RuntimeException();
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    static void bm(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = 255 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = -i4;
            while (i15 < 0) {
                int i16 = iArr2[i13];
                if (i16 != 0) {
                    iArr[i12] = ((((((i16 & 16711935) * i8) & -16711936) | (((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i16) * i8) & 16711680)) >>> 8) + (((((MotionEventCompat.ACTION_POINTER_INDEX_MASK & i9) * i11) & 16711680) | (((16711935 & i9) * i11) & -16711936)) >>> 8)) | ViewCompat.MEASURED_STATE_MASK;
                }
                i12++;
                i15++;
                i13++;
            }
            i12 += i6;
            i13 += i7;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x01be A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0278 A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e9 A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x028f A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fe A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01be A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e9 A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0278 A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fe A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x028f A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A:{SYNTHETIC, RETURN, SKIP, Catch:{ RuntimeException -> 0x0054 }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0215 A:{Catch:{ RuntimeException -> 0x0054 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void cc(ih ihVar, int i) {
        try {
            ihVar.ce = ihVar.bb * 107039383;
            if (ihVar.da * -913482765 == 0) {
                ihVar.dp = 0;
                return;
            }
            if (ihVar.cs * -1099198911 != -1 && ihVar.cx * -1961250233 == 0) {
                dp aq = gn.aq(ihVar.cs * -1099198911, 1577044091);
                if (ihVar.dn * -2036302051 > 0 && aq.ac * -1282229259 == 0) {
                    ihVar.dp -= 1566844069;
                    return;
                } else if (ihVar.dn * -2036302051 <= 0 && aq.aa * 952452997 == 0) {
                    ihVar.dp -= 1566844069;
                    return;
                }
            }
            int i2 = ihVar.bq * -1444273727;
            int i3 = ihVar.bd * -1690563339;
            int i4 = (ihVar.db[(ihVar.da * -913482765) - 1] * 128) + (ihVar.bl * -203209664);
            int i5 = (ihVar.dc[(ihVar.da * -913482765) - 1] * 128) + (ihVar.bl * -203209664);
            if (i2 < i4) {
                if (i3 < i5) {
                    ihVar.dl = -1962644224;
                } else if (i3 > i5) {
                    ihVar.dl = -170721536;
                } else {
                    ihVar.dl = 1080800768;
                }
            } else if (i2 > i4) {
                if (i3 < i5) {
                    ihVar.dl = 540400384;
                } else if (i3 > i5) {
                    ihVar.dl = -1251522304;
                } else {
                    ihVar.dl = 1791922688;
                }
            } else if (i3 < i5) {
                ihVar.dl = -711121920;
            } else if (i3 > i5) {
                ihVar.dl = 0;
            }
            byte b = ihVar.du[(ihVar.da * -913482765) - 1];
            int i6 = i4 - i2;
            if (i6 <= 256 && i6 >= InputDeviceCompat.SOURCE_ANY) {
                i6 = i5 - i3;
                if (i6 <= 256 && i6 >= InputDeviceCompat.SOURCE_ANY) {
                    i6 = ((ihVar.dl * 786971385) - (ihVar.bo * 1494200757)) & 2047;
                    int i7 = i6 > 1024 ? i6 - 2048 : i6;
                    i6 = ihVar.bg * 926790595;
                    if (i7 >= -256 && i7 <= 256) {
                        i6 = ihVar.bv * 2104350909;
                    } else if (i7 >= 256 && i7 < 768) {
                        i6 = ihVar.bw * -408098593;
                    } else if (i7 >= -768 && i7 <= -256) {
                        i6 = ihVar.bu * -1703494427;
                    }
                    if (-1 == i6) {
                        i6 = ihVar.bv * 2104350909;
                    }
                    ihVar.ce = i6 * -1377230225;
                    if (ihVar instanceof iq ? ((iq) ihVar).ad.bf : true) {
                        i6 = (ihVar.dl * 786971385 == ihVar.bo * 1494200757 || -1 != ihVar.cp * -298920551 || ihVar.df * -1865295889 == 0) ? 4 : 2;
                        if (ihVar.da * -913482765 > 2) {
                            i6 = 6;
                        }
                        if (ihVar.da * -913482765 > 3) {
                            i6 = 8;
                        }
                        if (ihVar.dp * 1368972499 > 0 && ihVar.da * -913482765 > 1) {
                            ihVar.dp += 1566844069;
                        }
                        if ((byte) 2 == b) {
                            i6 <<= 1;
                        }
                        if (i6 >= 8 && ihVar.bv * 2104350909 == ihVar.ce * -1620542321 && ihVar.br * 1765837275 != -1) {
                            ihVar.ce = ihVar.br * -1398940683;
                        }
                        if (!(i2 == i4 && i5 == i3)) {
                            if (i2 < i4) {
                                ihVar.bq += i6 * 590147137;
                                if (ihVar.bq * -1444273727 > i4) {
                                    ihVar.bq = i4 * 590147137;
                                }
                            } else if (i2 > i4) {
                                ihVar.bq -= i6 * 590147137;
                                if (ihVar.bq * -1444273727 < i4) {
                                    ihVar.bq = i4 * 590147137;
                                }
                            }
                            if (i3 < i5) {
                                ihVar.bd = (i6 * -995934371) + ihVar.bd;
                                if (ihVar.bd * -1690563339 > i5) {
                                    ihVar.bd = i5 * -995934371;
                                }
                            } else if (i3 > i5) {
                                ihVar.bd -= i6 * -995934371;
                                if (ihVar.bd * -1690563339 < i5) {
                                    ihVar.bd = i5 * -995934371;
                                }
                            }
                        }
                        if (i4 != ihVar.bq * -1444273727 && i5 == ihVar.bd * -1690563339) {
                            ihVar.da += 751585989;
                            if (ihVar.dn * -2036302051 > 0) {
                                ihVar.dn -= 1984052021;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    i6 = ihVar.da * -913482765 > 1 ? 6 : 4;
                    if (ihVar.da * -913482765 > 2) {
                        i6 = 8;
                    }
                    if (ihVar.dp * 1368972499 > 0 && ihVar.da * -913482765 > 1) {
                        ihVar.dp += 1566844069;
                    }
                    if ((byte) 2 == b) {
                    }
                    ihVar.ce = ihVar.br * -1398940683;
                    if (i2 < i4) {
                    }
                    if (i3 < i5) {
                    }
                    if (i4 != ihVar.bq * -1444273727) {
                        return;
                    }
                    return;
                    i6 = 8;
                    if ((byte) 2 == b) {
                    }
                    ihVar.ce = ihVar.br * -1398940683;
                    if (i2 < i4) {
                    }
                    if (i3 < i5) {
                    }
                    if (i4 != ihVar.bq * -1444273727) {
                    }
                }
            }
            ihVar.bq = i4 * 590147137;
            ihVar.bd = i5 * -995934371;
            ihVar.da += 751585989;
            if (ihVar.dn * -2036302051 > 0) {
                ihVar.dn -= 1984052021;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hz.cc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void cs(ih ihVar, byte b) {
        Object obj = null;
        try {
            if (ihVar.df * -1865295889 != 0) {
                int i;
                if (ihVar.cp * -298920551 != -1) {
                    ih ihVar2 = null;
                    if (ihVar.cp * -298920551 < 32768) {
                        ihVar2 = client.eg[ihVar.cp * -298920551];
                    } else if (ihVar.cp * -298920551 >= 32768) {
                        ihVar2 = client.jz[(ihVar.cp * -298920551) - 32768];
                    }
                    if (ihVar2 != null) {
                        int i2 = (ihVar.bq * -1444273727) - (ihVar2.bq * -1444273727);
                        i = (ihVar.bd * -1690563339) - (ihVar2.bd * -1690563339);
                        if (!(i2 == 0 && i == 0)) {
                            ihVar.dl = (((int) (Math.atan2((double) i2, (double) i) * 325.949d)) & 2047) * -290101431;
                        }
                    } else if (ihVar.ci) {
                        ihVar.cp = -260026025;
                        ihVar.ci = false;
                    }
                }
                if (ihVar.cb * 773750935 != -1 && (ihVar.da * -913482765 == 0 || ihVar.dp * 1368972499 > 0)) {
                    ihVar.dl = ihVar.cb * -1187877873;
                    ihVar.cb = 950206681;
                }
                i = ((ihVar.dl * 786971385) - (ihVar.bo * 1494200757)) & 2047;
                if (i == 0 && ihVar.ci) {
                    ihVar.cp = -260026025;
                    ihVar.ci = false;
                }
                if (i != 0) {
                    ihVar.dr += 984437019;
                    if (i > 1024) {
                        ihVar.bo -= ihVar.df * -105399917;
                        if (i < ihVar.df * -1865295889 || i > 2048 - (ihVar.df * -1865295889)) {
                            ihVar.bo = ihVar.dl * -112787787;
                        } else {
                            obj = 1;
                        }
                        if (ihVar.ce * -1620542321 == ihVar.bb * -959328679 && (ihVar.dr * 41132307 > 25 || r0 != null)) {
                            if (-1 != ihVar.bi * -527604101) {
                                ihVar.ce = ihVar.bi * -1981889195;
                            } else {
                                ihVar.ce = ihVar.bv * -160492557;
                            }
                        }
                    } else {
                        ihVar.bo += ihVar.df * -105399917;
                        if (i < ihVar.df * -1865295889 || i > 2048 - (ihVar.df * -1865295889)) {
                            ihVar.bo = ihVar.dl * -112787787;
                        } else {
                            obj = 1;
                        }
                        if (ihVar.bb * -959328679 == ihVar.ce * -1620542321 && (ihVar.dr * 41132307 > 25 || obj != null)) {
                            if (ihVar.bc * 1146773125 != -1) {
                                ihVar.ce = ihVar.bc * -1949719125;
                            } else {
                                ihVar.ce = ihVar.bv * -160492557;
                            }
                        }
                    }
                    ihVar.bo = ((ihVar.bo * 1494200757) & 2047) * 28472477;
                    return;
                }
                ihVar.dr = 0;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hz.cs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
