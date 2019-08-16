package defpackage;

import java.io.IOException;
import java.util.Collection;

/* renamed from: de */
public class de extends mp {
    static kh ad = null;
    static final int ag = 12;
    static gz aq = new gz(64, null);
    static final int aw = 32768;
    static final int bm = 171;
    static int dw;
    static int gh;
    ot ar;

    de() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("de.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static de ag(int i) {
        long j = (long) i;
        de deVar = (de) aq.ad(j);
        if (deVar == null) {
            byte[] ar = ad.ar(34, i, 1647220214);
            deVar = new de();
            if (ar != null) {
                deVar.al(new lj(ar), -292601319);
            }
            deVar.ar(-1929605007);
            aq.ar(deVar, j);
        }
        return deVar;
    }

    public static void ak(kh khVar) {
        ad = khVar;
    }

    public static de ap(int i) {
        long j = (long) i;
        de deVar = (de) aq.ad(j);
        if (deVar == null) {
            byte[] ar = ad.ar(34, i, 1183380162);
            deVar = new de();
            if (ar != null) {
                deVar.al(new lj(ar), -292601319);
            }
            deVar.ar(-1929605007);
            aq.ar(deVar, j);
        }
        return deVar;
    }

    public static void as(kh khVar) {
        ad = khVar;
    }

    public static void at(Collection collection) {
        collection.add(aq);
    }

    public static void av(Collection collection) {
        collection.add(aq);
    }

    public static void ba(Collection collection) {
        collection.add(aq);
    }

    public static void bk(Collection collection) {
        collection.add(aq);
    }

    static final void cj(int i) {
        try {
            int i2 = (nr.pj * -832115072) + 64;
            int i3 = (jy.pa * 754020480) + 64;
            int dg = nh.dg(i2, i3, am.jy * 1973701849, -1829424315) - (as.pm * 702519211);
            if (ep.hp * 1722134867 < i2) {
                ep.hp += ((((nf.qq * 1959130827) * (i2 - (ep.hp * 1722134867))) / 1000) + (gp.pb * -1148945841)) * 2022292187;
                if (ep.hp * 1722134867 > i2) {
                    ep.hp = 2022292187 * i2;
                }
            }
            if (ep.hp * 1722134867 > i2) {
                ep.hp -= ((gp.pb * -1148945841) + ((((ep.hp * 1722134867) - i2) * (nf.qq * 1959130827)) / 1000)) * 2022292187;
                if (ep.hp * 1722134867 < i2) {
                    ep.hp = i2 * 2022292187;
                }
            }
            if (fj.hc * 1470433239 < dg) {
                fj.hc += ((((nf.qq * 1959130827) * (dg - (fj.hc * 1470433239))) / 1000) + (gp.pb * -1148945841)) * -158868505;
                if (fj.hc * 1470433239 > dg) {
                    fj.hc = -158868505 * dg;
                }
            }
            if (fj.hc * 1470433239 > dg) {
                fj.hc -= (((((fj.hc * 1470433239) - dg) * (nf.qq * 1959130827)) / 1000) + (gp.pb * -1148945841)) * -158868505;
                if (fj.hc * 1470433239 < dg) {
                    fj.hc = -158868505 * dg;
                }
            }
            if (cc.hg * -91971475 < i3) {
                cc.hg += ((gp.pb * -1148945841) + (((i3 - (cc.hg * -91971475)) * (nf.qq * 1959130827)) / 1000)) * 660629861;
                if (cc.hg * -91971475 > i3) {
                    cc.hg = 660629861 * i3;
                }
            }
            if (cc.hg * -91971475 > i3) {
                cc.hg -= (((((cc.hg * -91971475) - i3) * (nf.qq * 1959130827)) / 1000) + (gp.pb * -1148945841)) * 660629861;
                if (cc.hg * -91971475 < i3) {
                    cc.hg = 660629861 * i3;
                }
            }
            i2 = (er.qy * -1599188608) + 64;
            i3 = (iw.qz * -1496312960) + 64;
            int i4 = i2 - (ep.hp * 1722134867);
            i3 -= cc.hg * -91971475;
            i2 = ((int) (Math.atan2((double) ((nh.dg(i2, i3, am.jy * 1973701849, -1701252271) - (bu.qx * 112876741)) - (fj.hc * 1470433239)), (double) ((int) Math.sqrt((double) ((i4 * i4) + (i3 * i3))))) * 325.949d)) & 2047;
            dg = ((int) (Math.atan2((double) i4, (double) i3) * -325.949d)) & 2047;
            if (i2 < 128) {
                i2 = 128;
            }
            if (i2 > bc.cn) {
                i2 = bc.cn;
            }
            if (ay.hr * 1914902541 < i2) {
                ay.hr += ((((i2 - (ay.hr * 1914902541)) * (ag.qa * 1944980087)) / 1000) + (dx.qj * -1534588573)) * -823462203;
                if (ay.hr * 1914902541 > i2) {
                    ay.hr = -823462203 * i2;
                }
            }
            if (ay.hr * 1914902541 > i2) {
                ay.hr -= ((dx.qj * -1534588573) + (((ag.qa * 1944980087) * ((ay.hr * 1914902541) - i2)) / 1000)) * -823462203;
                if (ay.hr * 1914902541 < i2) {
                    ay.hr = i2 * -823462203;
                }
            }
            i2 = dg - (gs.hd * 772603733);
            if (i2 > 1024) {
                i2 -= 2048;
            }
            i3 = i2 < -1024 ? i2 + 2048 : i2;
            if (i3 > 0) {
                gs.hd += ((((ag.qa * 1944980087) * i3) / 1000) + (dx.qj * -1534588573)) * 1300170237;
                gs.hd = ((gs.hd * 772603733) & 2047) * 1300170237;
            }
            if (i3 < 0) {
                gs.hd -= ((((-i3) * (ag.qa * 1944980087)) / 1000) + (dx.qj * -1534588573)) * 1300170237;
                gs.hd = ((gs.hd * 772603733) & 2047) * 1300170237;
            }
            i2 = dg - (gs.hd * 772603733);
            if (i2 > 1024) {
                i2 -= 2048;
            }
            if (i2 < -1024) {
                i2 += 2048;
            }
            if ((i2 < 0 && i3 > 0) || (i2 > 0 && i3 < 0)) {
                gs.hd = 1300170237 * dg;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("de.cj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ez(boolean z, byte b) {
        try {
            bt.bw((byte) -4);
            ij ijVar = client.eb;
            ijVar.ag -= 1731626383;
            if (client.eb.ag * 548603537 >= 50 || z) {
                client.eb.ag = 0;
                if (!client.em && client.eb.ae(1904221720) != null) {
                    client.eb.ar(ib.aq(no.an, client.eb.aj, 45546884), 21712528);
                    try {
                        client.eb.aq(167703849);
                    } catch (IOException e) {
                        client.em = true;
                    }
                }
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("de.ez(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public static String hj(al alVar, int i) {
        try {
            return (et.ar(hs.hy(alVar, (byte) 120), 1598384449) == 0 || alVar.eo == null || alVar.eo.trim().length() == 0) ? null : alVar.eo;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("de.hj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(lj ljVar, int i) {
        if (i == 249) {
            this.ar = af.ad(ljVar, this.ar, (byte) 1);
        }
    }

    public String ab(int i, String str) {
        return dt.ar(this.ar, i, str, 2122732708);
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, 1340713570);
            } else {
                return;
            }
        }
    }

    public String ae(int i, String str, int i2) {
        try {
            return dt.ar(this.ar, i, str, 2122732708);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("de.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int af(int i, int i2) {
        return pk.aq(this.ar, i, i2, 1306851838);
    }

    public int ah(int i, int i2) {
        return pk.aq(this.ar, i, i2, 1611755986);
    }

    public int ai(int i, int i2, int i3) {
        try {
            return pk.aq(this.ar, i, i2, 1895479285);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("de.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(lj ljVar, int i, int i2) {
        if (i == 249) {
            try {
                this.ar = af.ad(ljVar, this.ar, (byte) 1);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("de.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    aj(ljVar, af, -1598347152);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("de.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public String an(int i, String str) {
        return dt.ar(this.ar, i, str, 2122732708);
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(lj ljVar, int i) {
        if (i == 249) {
            this.ar = af.ad(ljVar, this.ar, (byte) 1);
        }
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
                aj(ljVar, af, -75555878);
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
                aj(ljVar, af, 699617848);
            } else {
                return;
            }
        }
    }

    public int ay(int i, int i2) {
        return pk.aq(this.ar, i, i2, 1588225916);
    }

    /* Access modifiers changed, original: 0000 */
    public void az() {
    }
}
