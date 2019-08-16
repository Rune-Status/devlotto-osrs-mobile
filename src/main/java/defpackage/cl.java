package defpackage;

import android.support.v4.internal.view.SupportMenu;

/* renamed from: cl */
public class cl {
    static final cl ad = new cl(0);
    static final cl aq = new cl(1);
    static final int bs = 200;
    static boolean cs;
    static int hs;
    final int ar;

    cl(int i) {
        try {
            this.ar = -814626703 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cl.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ad(CharSequence[] charSequenceArr, int i, int i2, byte b) {
        StringBuilder stringBuilder;
        if (i2 == 0) {
            return "";
        }
        CharSequence charSequence;
        if (i2 == 1) {
            charSequence = charSequenceArr[i];
            if (charSequence == null) {
                return "null";
            }
            try {
                return charSequence.toString();
            } catch (RuntimeException e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("cl.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        int i3 = i2 + i;
        int i4 = 0;
        for (int i5 = i; i5 < i3; i5++) {
            CharSequence charSequence2 = charSequenceArr[i5];
            i4 = charSequence2 == null ? i4 + 4 : i4 + charSequence2.length();
        }
        stringBuilder = new StringBuilder(i4);
        while (i < i3) {
            charSequence = charSequenceArr[i];
            if (charSequence == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(charSequence);
            }
            i++;
        }
        return stringBuilder.toString();
    }

    static final void am(lv lvVar, int i, hv hvVar, int i2, int i3) {
        int bl;
        int bl2;
        int i4;
        if ((i2 & 64) != 0) {
            try {
                int i5;
                int bl3;
                int bl4;
                int i6;
                int bn = lvVar.bn(817132534);
                if (bn > 0) {
                    for (i5 = 0; i5 < bn; i5++) {
                        bl3 = lvVar.bl(2131034147);
                        if (bl3 == 32767) {
                            bl3 = lvVar.bl(2131034147);
                            bl = lvVar.bl(2131034147);
                            bl4 = lvVar.bl(2131034147);
                            bl2 = lvVar.bl(2131034147);
                            i6 = bl4;
                            i4 = bl3;
                        } else if (bl3 != 32766) {
                            bl = lvVar.bl(2131034147);
                            bl2 = -1;
                            i6 = -1;
                            i4 = bl3;
                        } else {
                            bl4 = -1;
                            bl = -1;
                            i6 = -1;
                            bl3 = -1;
                            hvVar.bj(bl4, bl, i6, bl3, 2133672263 * client.bj, lvVar.bl(2131034147), -268089238);
                        }
                        bl3 = bl2;
                        bl4 = i4;
                        hvVar.bj(bl4, bl, i6, bl3, 2133672263 * client.bj, lvVar.bl(2131034147), -268089238);
                    }
                }
                bn = lvVar.bz(-1573580372);
                if (bn > 0) {
                    for (i5 = 0; i5 < bn; i5++) {
                        bl4 = lvVar.bl(2131034147);
                        i6 = lvVar.bl(2131034147);
                        if (i6 != 32767) {
                            bl3 = lvVar.bl(2131034147);
                            i4 = lvVar.bn(817132534);
                            hvVar.bh(bl4, 2133672263 * client.bj, i6, bl3, i4, i6 > 0 ? lvVar.af(1804771424) : i4, 149839703);
                        } else {
                            hvVar.bt(bl4, 1303059627);
                        }
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cl.am(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        if ((i2 & 512) != 0) {
            hvVar.ck = lvVar.ci(-1763636469) * -109561753;
            bl2 = lvVar.cx((byte) 2);
            hvVar.cz = (bl2 >> 16) * 973767065;
            hvVar.cl = ((bl2 & SupportMenu.USER_MASK) + (client.bj * 2133672263)) * 1758646389;
            hvVar.co = 0;
            hvVar.cu = 0;
            if (hvVar.cl * -1489469475 > client.bj * 2133672263) {
                hvVar.co = 1032833481;
            }
            if (SupportMenu.USER_MASK == hvVar.ck * 836985687) {
                hvVar.ck = 109561753;
            }
        }
        byte bp = (i2 & 4096) != 0 ? lvVar.bp(1642035208) : (byte) -1;
        if ((i2 & 1024) != 0) {
            hvVar.cd = lvVar.cj(-836202821) * 755645191;
            hvVar.cg = lvVar.bp(349305476) * -1424550685;
            hvVar.cf = lvVar.bp(1122570053) * 2052131119;
            hvVar.ch = lvVar.cj(-836202821) * -1923318437;
            hvVar.dd = (lvVar.cp(1198751057) + (client.bj * 2133672263)) * -212794883;
            hvVar.dm = (lvVar.cw(-734252795) + (client.bj * 2133672263)) * 489046689;
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
        bl = 1;
        if ((i2 & 32) != 0) {
            hvVar.be = lvVar.bm(1226282615);
            if (hvVar.be.charAt(0) == '~') {
                hvVar.be = hvVar.be.substring(1);
                iq.aq(2, hvVar.ad.ad(-5859470), hvVar.be, -1174170592);
            } else if (da.jc == hvVar) {
                iq.aq(2, hvVar.ad.ad(-1640868605), hvVar.be, -785978418);
            }
            hvVar.bj = false;
            hvVar.bn = 0;
            hvVar.bz = 0;
            hvVar.bt = 606793826;
        }
        if ((i2 & 4) != 0) {
            hvVar.cb = lvVar.cw(-576461101) * -950206681;
            if (hvVar.da * -913482765 == 0) {
                hvVar.dl = hvVar.cb * -1187877873;
                hvVar.cb = 950206681;
            }
        }
        if ((i2 & 1) != 0) {
            bl2 = lvVar.by(1635704831);
            byte[] bArr = new byte[bl2];
            lj ljVar = new lj(bArr);
            lvVar.ck(bArr, 0, bl2, 1584468696);
            hz.aj[i] = ljVar;
            hvVar.ad(ljVar, 2073848384);
        }
        if ((i2 & 2) != 0) {
            hvVar.cp = lvVar.cp(1577117632) * 260026025;
            if (hvVar.cp * -298920551 == SupportMenu.USER_MASK) {
                hvVar.cp = -260026025;
            }
        }
        if ((i2 & 2048) != 0) {
            hz.al[i] = lvVar.bp(157615616);
        }
        if ((i2 & 16) != 0) {
            i4 = lvVar.cp(763171251);
            gc gcVar = (gc) oz.ad(df.aq((byte) 0), lvVar.af(1804771424), (byte) -57);
            boolean z = lvVar.bz(-942698273) == 1;
            int af = lvVar.af(1804771424);
            int i7 = lvVar.al;
            if (!(hvVar.ad == null || hvVar.aq == null)) {
                Object obj = (gcVar.as && al.rd.ae(hvVar.ad, 2044830623)) ? 1 : null;
                if (obj == null && client.jo * 34128881 == 0 && !hvVar.ay) {
                    hz.ax.al = 0;
                    lvVar.bd(hz.ax.ar, 0, af, (byte) 0);
                    hz.ax.al = 0;
                    String am = oi.am(jj.ax(gq.ar(hz.ax, 2130903556), (byte) 1));
                    hvVar.be = am.trim();
                    hvVar.bn = (i4 >> 8) * -1415289785;
                    hvVar.bz = (i4 & 255) * 2133067117;
                    hvVar.bt = 606793826;
                    hvVar.bj = z;
                    boolean z2 = da.jc != hvVar && gcVar.as && "" != client.on && am.toLowerCase().indexOf(client.on) == -1;
                    hvVar.bh = z2;
                    if (!gcVar.ak) {
                        bl = z ? 90 : 2;
                    } else if (z) {
                        bl = 91;
                    }
                    if (gcVar.am * -961938565 != -1) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(lb.ad(gcVar.am * -961938565, -855904832));
                        stringBuilder2.append(hvVar.ad.ad(-1644555382));
                        iq.aq(bl, stringBuilder2.toString(), am, 72587239);
                    } else {
                        iq.aq(bl, hvVar.ad.ad(-675447559), am, -131232963);
                    }
                }
            }
            lvVar.al = ((-1631454091 * i7) + af) * -879823907;
        }
        if ((i2 & 256) != 0) {
            for (bl2 = 0; bl2 < 3; bl2++) {
                hvVar.ai[bl2] = lvVar.bm(1988137600);
            }
        }
        if ((i2 & 128) != 0) {
            bl2 = lvVar.an(-1464407032);
            if (SupportMenu.USER_MASK == bl2) {
                bl2 = -1;
            }
            jf.cx(hvVar, bl2, lvVar.af(1804771424), 1011250268);
        }
        if (!hvVar.ba) {
            return;
        }
        if (Byte.MAX_VALUE == bp) {
            hvVar.as(hvVar.bs * -1060478255, hvVar.bm * -525442389, (short) 16256);
        } else {
            hvVar.ak(hvVar.bs * -1060478255, hvVar.bm * -525442389, (byte) -1 != bp ? bp : hz.al[i], (short) -24430);
        }
    }

    static void at(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14 = i6;
        int i15 = i4;
        for (int i16 = -i9; i16 < 0; i16++) {
            int i17 = -i8;
            int i18 = i15;
            while (i17 < 0) {
                i15 = iArr2[i18];
                if (i15 != 0) {
                    int i19 = (16711935 & i15) * i12;
                    i15 = ((((i15 * i12) - i19) & 16711680) + (i19 & -16711936)) >>> 8;
                    i19 = iArr[i14];
                    int i20 = i15 + i19;
                    i15 = (i15 & 16711935) + (i19 & 16711935);
                    i15 = (i15 & 16777472) + ((i20 - i15) & 65536);
                    iArr[i14] = (i20 - i15) | (i15 - (i15 >>> 8));
                }
                i17++;
                i18++;
                i14++;
            }
            i14 += i10;
            i15 = i18 + i11;
        }
    }

    static final boolean ay(int i, int i2, int i3) {
        try {
            dx aq = aj.aq(i, 1396810894);
            int i4 = 11 == i2 ? 10 : i2;
            if (i4 >= 5 && i4 <= 8) {
                i4 = 4;
            }
            return aq.ai(i4, 598450988);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cl.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void bp(int i) {
        int i2 = 0;
        try {
            int[] iArr = hz.ae;
            for (int i3 = 0; i3 < hz.ai * -1076782851; i3++) {
                hv hvVar = client.jz[iArr[i3]];
                if (hvVar != null && hvVar.bt * 1765530939 > 0) {
                    hvVar.bt -= 548074483;
                    if (hvVar.bt * 1765530939 == 0) {
                        hvVar.be = null;
                    }
                }
            }
            while (i2 < client.ed * -1087962683) {
                iq iqVar = client.eg[client.er[i2]];
                if (iqVar != null && iqVar.bt * 1765530939 > 0) {
                    iqVar.bt -= 548074483;
                    if (iqVar.bt * 1765530939 == 0) {
                        iqVar.be = null;
                    }
                }
                i2++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cl.bp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void eu(boolean z, lv lvVar, byte b) {
        int i = 0;
        StringBuilder stringBuilder;
        try {
            client.ji = 0;
            client.eu = 0;
            hs.ee((byte) 48);
            cf.ew(z, lvVar, 1602745435);
            dk.el(lvVar, (byte) 1);
            for (int i2 = 0; i2 < client.ji * -389857001; i2++) {
                int i3 = client.ku[i2];
                if (client.eg[i3].dv * -1263904863 != client.bj * 2133672263) {
                    client.eg[i3].ad = null;
                    client.eg[i3] = null;
                }
            }
            if (client.eb.am * -271485777 == lvVar.al * -1631454091) {
                while (i < client.ed * -1087962683) {
                    if (client.eg[client.er[i]] != null) {
                        i++;
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(i);
                        stringBuilder.append(iz.aq);
                        stringBuilder.append(client.ed * -1087962683);
                        throw new RuntimeException(stringBuilder.toString());
                    }
                }
                return;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(lvVar.al * -1631454091);
            stringBuilder2.append(iz.aq);
            stringBuilder2.append(client.eb.am * -271485777);
            throw new RuntimeException(stringBuilder2.toString());
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("cl.eu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
