package defpackage;

import android.support.v4.internal.view.SupportMenu;
import java.util.Collection;

/* renamed from: dk */
public class dk extends mp {
    static final int aa = 4;
    static kh ad = null;
    public static int aq = 0;
    static gz ar = new gz(64, null);
    static final int ay = 19136899;
    static kv dv = null;
    static final int pd = 2;
    static hx px;
    protected static boolean uf;
    public int al;

    dk() {
        try {
            this.al = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dk.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int aa(int i, int i2, byte b) {
        int i3 = (i2 * 57) + i;
        i3 ^= i3 << 13;
        return ((((i3 * (((i3 * i3) * 15731) + 789221)) + 1376312589) & Integer.MAX_VALUE) >> 19) & 255;
    }

    public static void aa(Collection collection) {
        collection.add(ar);
    }

    public static void ac(Collection collection) {
        collection.add(ar);
    }

    public static void ae(kh khVar) {
        ad = khVar;
        aq = ad.ax(16, (byte) 66) * -965677975;
    }

    public static final void ai(int i, boolean z, int i2, int i3) {
        if (i < 8000 || i > 48000) {
            throw new IllegalArgumentException();
        }
        try {
            hd.ad = 1345223369 * i;
            hd.aq = z;
            hd.aj = -1762088173 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dk.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ai(kh khVar) {
        ad = khVar;
        aq = ad.ax(16, (byte) 15) * -965677975;
    }

    public static dk ak(int i) {
        long j = (long) i;
        dk dkVar = (dk) ar.ad(j);
        if (dkVar == null) {
            byte[] ar = ad.ar(16, i, 1255202426);
            dkVar = new dk();
            if (ar != null) {
                dkVar.ar(new lj(ar), (byte) 3);
            }
            ar.ar(dkVar, j);
        }
        return dkVar;
    }

    public static dk am(int i) {
        long j = (long) i;
        dk dkVar = (dk) ar.ad(j);
        if (dkVar == null) {
            byte[] ar = ad.ar(16, i, 1220422661);
            dkVar = new dk();
            if (ar != null) {
                dkVar.ar(new lj(ar), (byte) 103);
            }
            ar.ar(dkVar, j);
        }
        return dkVar;
    }

    public static dk as(int i) {
        long j = (long) i;
        dk dkVar = (dk) ar.ad(j);
        if (dkVar == null) {
            byte[] ar = ad.ar(16, i, 1687131268);
            dkVar = new dk();
            if (ar != null) {
                dkVar.ar(new lj(ar), (byte) -29);
            }
            ar.ar(dkVar, j);
        }
        return dkVar;
    }

    static final void el(lv lvVar, byte b) {
        int i = 0;
        while (true) {
            try {
                int i2 = i;
                if (i2 < client.eu * -434278507) {
                    int ci;
                    int ci2;
                    iq iqVar = client.eg[client.ee[i2]];
                    int af = lvVar.af(1804771424);
                    if ((af & 1) != 0) {
                        iqVar.cp = lvVar.cw(-1618924725) * 260026025;
                        if (SupportMenu.USER_MASK == iqVar.cp * -298920551) {
                            iqVar.cp = -260026025;
                        }
                    }
                    if ((af & 64) != 0) {
                        ci = (iqVar.bq * -1444273727) - (((lvVar.ci(-1763636469) - (oz.ff * 2060098323)) - (oz.ff * 2060098323)) * 64);
                        ci2 = (iqVar.bd * -1690563339) - (((lvVar.ci(-1763636469) - (cq.fz * -1866366501)) - (cq.fz * -1866366501)) * 64);
                        if (!(ci == 0 && ci2 == 0)) {
                            iqVar.cb = (((int) (Math.atan2((double) ci, (double) ci2) * 325.949d)) & 2047) * -950206681;
                        }
                    }
                    if ((af & 32) != 0) {
                        ci = lvVar.an(-1464407032);
                        if (SupportMenu.USER_MASK == ci) {
                            ci = -1;
                        }
                        ci2 = lvVar.by(131074147);
                        if (iqVar.cs * -1099198911 == ci && ci != -1) {
                            ci = gn.aq(ci, 2106987893).ao * -1484717029;
                            if (ci == 1) {
                                iqVar.cr = 0;
                                iqVar.ca = 0;
                                iqVar.cx = ci2 * 214456183;
                                iqVar.ct = 0;
                            }
                            if (2 == ci) {
                                iqVar.ct = 0;
                            }
                        } else if (-1 == ci || iqVar.cs * -1099198911 == -1 || gn.aq(ci, 1567312296).au * 738694559 >= gn.aq(iqVar.cs * -1099198911, 1399233092).au * 738694559) {
                            iqVar.cs = ci * 1835762113;
                            iqVar.cr = 0;
                            iqVar.ca = 0;
                            iqVar.cx = 214456183 * ci2;
                            iqVar.ct = 0;
                            iqVar.dn = iqVar.da * 85658191;
                        }
                    }
                    if ((af & 4) != 0) {
                        iqVar.ad = ln.aq(lvVar.an(-1464407032), -335837796);
                        iqVar.bl = iqVar.ad.ae * 754611297;
                        iqVar.df = iqVar.ad.bm * 1365923169;
                        iqVar.bv = iqVar.ad.au * -807775609;
                        iqVar.bg = iqVar.ad.az * -1796920383;
                        iqVar.bu = iqVar.ad.ax * -1696768433;
                        iqVar.bw = iqVar.ad.aw * -267583933;
                        iqVar.bb = iqVar.ad.as * -1181446935;
                        iqVar.bi = iqVar.ad.ag * 1924889079;
                        iqVar.bc = iqVar.ad.ap * 1354581455;
                    }
                    if ((af & 16) != 0) {
                        int i3;
                        int bl;
                        int bl2;
                        int i4;
                        int bz = lvVar.bz(1758786396);
                        if (bz > 0) {
                            for (i3 = 0; i3 < bz; i3++) {
                                int bl3 = lvVar.bl(2131034147);
                                if (32767 == bl3) {
                                    bl3 = lvVar.bl(2131034147);
                                    bl = lvVar.bl(2131034147);
                                    ci2 = lvVar.bl(2131034147);
                                    bl2 = lvVar.bl(2131034147);
                                    i4 = ci2;
                                } else if (32766 != bl3) {
                                    bl = lvVar.bl(2131034147);
                                    bl2 = -1;
                                    i4 = -1;
                                } else {
                                    ci = -1;
                                    ci2 = -1;
                                    i4 = -1;
                                    bl2 = -1;
                                    iqVar.bj(ci, ci2, i4, bl2, client.bj * 2133672263, lvVar.bl(2131034147), -268089238);
                                }
                                ci2 = bl;
                                ci = bl3;
                                iqVar.bj(ci, ci2, i4, bl2, client.bj * 2133672263, lvVar.bl(2131034147), -268089238);
                            }
                        }
                        bz = lvVar.bn(817132534);
                        if (bz > 0) {
                            for (i3 = 0; i3 < bz; i3++) {
                                ci = lvVar.bl(2131034147);
                                i4 = lvVar.bl(2131034147);
                                if (32767 != i4) {
                                    bl2 = lvVar.bl(2131034147);
                                    bl = lvVar.af(1804771424);
                                    iqVar.bh(ci, client.bj * 2133672263, i4, bl2, bl, i4 > 0 ? lvVar.by(-1971674359) : bl, -1067219324);
                                } else {
                                    iqVar.bt(ci, 948543635);
                                }
                            }
                        }
                    }
                    if ((af & 8) != 0) {
                        iqVar.ck = lvVar.cw(463239668) * -109561753;
                        ci = lvVar.cx((byte) 29);
                        iqVar.cz = (ci >> 16) * 973767065;
                        iqVar.cl = ((ci & SupportMenu.USER_MASK) + (client.bj * 2133672263)) * 1758646389;
                        iqVar.co = 0;
                        iqVar.cu = 0;
                        if (iqVar.cl * -1489469475 > client.bj * 2133672263) {
                            iqVar.co = 1032833481;
                        }
                        if (iqVar.ck * 836985687 == SupportMenu.USER_MASK) {
                            iqVar.ck = 109561753;
                        }
                    }
                    if ((af & 2) != 0) {
                        iqVar.be = lvVar.bm(1472832056);
                        iqVar.bt = -1027126548;
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dk.el(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 2080821238);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, int i2) {
        if (5 == i) {
            try {
                this.al = ljVar.an(-1464407032) * 1324725955;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dk.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 2062234507);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, byte b) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    al(ljVar, af, 2041027515);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dk.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, 2105555553);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(lj ljVar, int i) {
        if (5 == i) {
            this.al = ljVar.an(-1464407032) * 1324725955;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(lj ljVar, int i) {
        if (5 == i) {
            this.al = ljVar.an(-1464407032) * 1324725955;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az(lj ljVar, int i) {
        if (5 == i) {
            this.al = ljVar.an(-1464407032) * 1324725955;
        }
    }
}
