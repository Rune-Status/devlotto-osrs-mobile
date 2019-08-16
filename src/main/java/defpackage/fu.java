package defpackage;

import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;

/* renamed from: fu */
public class fu {
    static final int ad = 500;
    static long ae = 0;
    static final int ai = 16777215;
    static final int al = 7169111;
    static final int am = 20;
    public static final int aq = 2000;
    static final int ar = 6116423;
    static final fc as = new fc(go.lj, "", -1, -1, PointerIconCompat.TYPE_CELL, -1, false, false);
    int aa;
    int ab;
    int ac;
    boolean af;
    int ag;
    boolean ah;
    int an;
    boolean ao;
    int ap;
    String at;
    int au;
    int av;
    oi aw;
    int ax;
    int ay;
    int az;
    int bb;
    int bc;
    public boolean bd;
    int be;
    int bf;
    boolean bg;
    String bh;
    boolean bi;
    String bj;
    String bk;
    int bl;
    String[] bm;
    int bn;
    int bo;
    boolean bp;
    boolean[] bq;
    int br;
    final int[] bs;
    int bt;
    fb bu;
    fc[] bv;
    fb bw;
    boolean bx;
    ee[] by;
    boolean bz;
    boolean cj;
    kh cm;
    public boolean cq;
    int cv;

    public fu(oi oiVar, ee[] eeVarArr, boolean z, kh khVar) {
        int i = 0;
        try {
            this.ao = false;
            this.ah = false;
            this.af = false;
            this.an = -1345222505;
            this.ab = -710618543;
            this.at = null;
            this.bk = null;
            this.bs = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
            this.bm = new String[8];
            this.bq = new boolean[8];
            this.bd = false;
            this.bc = 0;
            this.bv = new fc[ad];
            this.bg = false;
            this.bx = false;
            this.bu = fb.al;
            this.bw = fb.al;
            this.cv = 906003973;
            this.cj = false;
            this.cq = true;
            this.aw = oiVar;
            this.ao = z;
            this.by = eeVarArr;
            this.cm = khVar;
            this.aa = oiVar.ak * -1212133117;
            this.ag = -877488449;
            this.ap = -1547793585;
            this.au = 279241713;
            this.az = -1645052095;
            this.ax = 1233124096;
            this.bn = Math.max(this.by.length, 20) * -193672283;
            this.bt = this.bn * 246414869;
            if (z) {
                this.ac = oiVar.am * -292127914;
            } else {
                this.ac = ((oiVar.am + oiVar.ak) - 1) * 2001419691;
            }
            while (i < this.bv.length) {
                this.bv[i] = new fc();
                i++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static nb[] ad(byte b) {
        try {
            nb nbVar = nb.aq;
            nb nbVar2 = nb.aj;
            nb nbVar3 = nb.ar;
            nb nbVar4 = nb.al;
            nb nbVar5 = nb.ad;
            return new nb[]{nbVar, nbVar2, nbVar3, nbVar4, nbVar5};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0036=Splitter:B:11:0x0036, B:50:0x0118=Splitter:B:50:0x0118, B:27:0x0099=Splitter:B:27:0x0099} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int am(int i, hw hwVar, boolean z, int i2) {
        int i3;
        al aq;
        boolean z2;
        boolean z3 = false;
        if (i >= 2000) {
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            try {
                int[] iArr = hl.ae;
                i3 = ds.am + 564452847;
                ds.am = i3;
                aq = da.aq(iArr[i3 * -757592335], -550158556);
                z2 = false;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fu.am(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        aq = z ? lj.az : hl.au;
        z2 = true;
        int[] iArr2;
        int i4;
        int i5;
        String[] strArr;
        if (i == 1300) {
            iArr2 = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = iArr2[i4 * -757592335] - 1;
            if (i3 < 0 || i3 > 9) {
                hl.as += 1490481109;
                return 1;
            }
            String[] strArr2 = hl.ak;
            i5 = hl.as + 1490481109;
            hl.as = i5;
            aq.ac(i3, strArr2[i5 * -1883296125], 1977364976);
            return 1;
        } else if (i == 1301) {
            ds.am += 1128905694;
            aq.dj = gi.ar(hl.ae[ds.am * -757592335], hl.ae[(ds.am * -757592335) + 1], -1201935479);
            return 1;
        } else if (1302 == i) {
            iArr2 = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr2[i5 * -757592335] == 1) {
                z3 = true;
            }
            aq.ez = z3;
            return 1;
        } else if (i == 1303) {
            iArr2 = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.et = iArr2[i4 * -757592335] * -1776379629;
            return 1;
        } else if (i == 1304) {
            iArr2 = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            aq.eq = iArr2[i4 * -757592335] * 50248067;
            return 1;
        } else if (1305 == i) {
            strArr = hl.ak;
            i4 = hl.as + 1490481109;
            hl.as = i4;
            aq.dg = strArr[i4 * -1883296125];
            return 1;
        } else if (1306 == i) {
            strArr = hl.ak;
            i4 = hl.as + 1490481109;
            hl.as = i4;
            aq.eo = strArr[i4 * -1883296125];
            return 1;
        } else if (i == 1307) {
            aq.dz = null;
            return 1;
        } else if (1308 == i) {
            iArr2 = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            if (iArr2[i5 * -757592335] == 1) {
                z3 = true;
            }
            aq.gv = z3;
            return 1;
        } else if (i == 1350) {
            int i6;
            byte[] bArr;
            byte[] bArr2;
            if (z2) {
                ds.am += 1349561174;
                i6 = 0;
                while (i6 < 10 && hl.ae[(ds.am * -757592335) + i6] >= 0) {
                    i6 += 2;
                }
                if (i6 > 0) {
                    bArr = new byte[(i6 / 2)];
                    bArr2 = new byte[(i6 / 2)];
                    i5 = i6;
                    while (true) {
                        i5 -= 2;
                        if (i5 < 0) {
                            break;
                        }
                        bArr[i5 / 2] = (byte) hl.ae[(ds.am * -757592335) + i5];
                        bArr2[i5 / 2] = (byte) hl.ae[((ds.am * -757592335) + i5) + 1];
                    }
                } else {
                    bArr2 = null;
                    bArr = null;
                }
            } else {
                ds.am += 1128905694;
                bArr = new byte[]{(byte) hl.ae[ds.am * -757592335]};
                bArr2 = new byte[]{(byte) hl.ae[(ds.am * -757592335) + 1]};
            }
            int[] iArr3 = hl.ae;
            i6 = ds.am + 564452847;
            ds.am = i6;
            i5 = iArr3[i6 * -757592335] - 1;
            if (i5 < 0 || i5 > 9) {
                throw new RuntimeException();
            }
            iw.ak(aq, i5, bArr, bArr2, (byte) -42);
            return 1;
        } else if (i == 1351) {
            ds.am += 1128905694;
            byte b = (byte) hl.ae[ds.am * -757592335];
            byte b2 = (byte) hl.ae[(ds.am * -757592335) + 1];
            iw.ak(aq, 10, new byte[]{b}, new byte[]{b2}, (byte) -28);
            return 1;
        } else if (1352 == i) {
            ds.am += 1693358541;
            i3 = hl.ae[ds.am * -757592335] - 1;
            i4 = hl.ae[(ds.am * -757592335) + 1];
            i5 = hl.ae[(ds.am * -757592335) + 2];
            if (i3 < 0 || i3 > 9) {
                throw new RuntimeException();
            }
            ni.as(aq, i3, i4, i5, 1747766724);
            return 1;
        } else if (1353 == i) {
            iArr2 = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = iArr2[i4 * -757592335];
            int[] iArr4 = hl.ae;
            i5 = ds.am + 564452847;
            ds.am = i5;
            ni.as(aq, 10, i3, iArr4[i5 * -757592335], 1712546226);
            return 1;
        } else if (1354 == i) {
            ds.am += 564452847;
            i3 = hl.ae[ds.am * -757592335] - 1;
            if (i3 < 0 || i3 > 9) {
                throw new RuntimeException();
            }
            gg.ag(aq, i3, -2119301726);
            return 1;
        } else if (i != 1355) {
            return 2;
        } else {
            gg.ag(aq, 10, -2097651775);
            return 1;
        }
    }

    static int aq(int i) {
        return 15;
    }

    static boolean dh(byte b) {
        try {
            return ((client.je * -683458643) & 2) != 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.dh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final String gr(int i, int i2) {
        int i3 = i2 - i;
        if (i3 < -1104785816) {
            return hs.aq(16711680, 744596583);
        }
        int i4;
        if (i3 < -539502650) {
            i4 = 16723968;
            i3 = 1296532591;
        } else if (i3 >= -3) {
            return i3 < 0 ? hs.aq(62903865, -535390807) : i3 > 9 ? hs.aq(MotionEventCompat.ACTION_POINTER_INDEX_MASK, 1040839194) : i3 > 6 ? hs.aq(-1366619460, -399414428) : i3 > 3 ? hs.aq(8453888, -1510010628) : i3 > 0 ? hs.aq(12648192, -341476518) : hs.aq(-1119622512, -410010240);
        } else {
            i4 = 16740352;
            i3 = 881578731;
        }
        return hs.aq(i4, i3);
    }

    static boolean hh(int i) {
        return 704180439 == i || -612323758 == i || i == -1608665827 || i == 25 || 30 == i;
    }

    static boolean hk(int i) {
        return 57 == i || 58 == i || i == 81742156 || i == 25 || 30 == i;
    }

    static boolean ht(int i) {
        return 57 == i || 58 == i || i == 1007 || i == 25 || 30 == i;
    }

    static boolean hx(int i) {
        return -643371094 == i || 58 == i || i == 735859867 || i == 25 || 30 == i;
    }

    public void aa(String str, String str2, int i) {
        try {
            this.at = str;
            this.bk = str2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ab(es esVar, int i) {
        try {
            esVar.al(-2107401557 * this.bo, -1793346699 * this.bl, -250428839 * this.bf, -682781883 * this.bb, 84208761 * this.ag, (byte) 1);
            esVar.al((this.bo * -2107401557) + 1, (this.bl * -1793346699) + 1, (this.bf * -250428839) - 2, (this.ac * 980276483) + 1, 0, (byte) 1);
            esVar.em((this.bo * -2107401557) + 1, (this.bl * -1793346699) + ((this.ac * 980276483) + 3), (this.bf * -250428839) - 2, (this.bb * -682781883) - ((this.ac * 980276483) + 4), ViewCompat.MEASURED_STATE_MASK, 820612451);
            int i2 = this.ao ? this.aw.as : 0;
            this.aw.ak(go.gb, (this.bo * -2107401557) + 3, (((this.ac * 980276483) - 1) + (this.bl * -1793346699)) - i2, this.ag * 84208761, -1, esVar);
            int i3 = client.bh.am[0];
            int i4 = client.bh.ak[0];
            for (int i5 = 0; i5 < this.bc * -1494278369; i5++) {
                int i6 = (((this.bl * -1793346699) + (this.ac * 980276483)) + 3) + ((this.ac * 980276483) * (((this.bc * -1494278369) - 1) - i5));
                boolean ak = ak(i3, i4, i6, 1962358115);
                if (this.ao) {
                    if (ak) {
                        esVar.al((this.bo * -2107401557) + 2, ((this.bl * -1793346699) + ((this.ac * 980276483) * ((this.bc * -1494278369) - i5))) + 3, (this.bf * -250428839) - 4, 980276483 * this.ac, -1314965785 * this.au, (byte) 1);
                    } else if (i5 % 2 == 1) {
                        esVar.al((this.bo * -2107401557) + 2, ((this.bl * -1793346699) + ((this.ac * 980276483) * ((this.bc * -1494278369) - i5))) + 3, (this.bf * -250428839) - 4, 980276483 * this.ac, 628536441 * this.ap, (byte) 1);
                    }
                }
                this.aw.ak(at(i5, (byte) -37), (this.aa * 551395755) + (this.bo * -2107401557), (((this.ac * 980276483) + i6) - 1) - i2, ak ? this.ax * -1698345779 : 826666815 * this.az, 0, esVar);
            }
            aj.ft(this.bo * -2107401557, this.bl * -1793346699, this.bf * -250428839, this.bb * -682781883, (byte) 18);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ac(int i) {
        try {
            if (this.af) {
                al ar = gi.ar(this.ay * -1012473727, this.an * 2133166297, -1201935479);
                if (!(ar == null || ar.ew == null)) {
                    il ilVar = new il();
                    ilVar.ar = ar;
                    ilVar.ad = ar.ew;
                    dm.ad(ilVar, 658065626);
                }
                this.af = false;
                da.gk(ar, (byte) 2);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* renamed from: ad */
    public final void m214ad(byte b) {
        try {
            am(-564452847);
            if (client.bh.ad != io.ad) {
                if (!this.bd) {
                    client.bh.ab(-1178314347);
                } else {
                    return;
                }
            }
            bh(-993005652);
            if (!dq.gy(347939907) && !ja.gd(-791160181)) {
                if (this.bi) {
                    aq(2131689564);
                    return;
                }
                int br = br((byte) -1);
                boolean z = false;
                if (client.bh.ad == io.ae && br >= 0) {
                    fc fcVar = this.bv[br];
                    int i = fcVar.ar * -1484618507;
                    if (39 == i || 40 == i || i == 41 || 42 == i || i == 43 || i == 33 || 34 == i || i == 35 || i == 36 || i == 37 || 38 == i || ce.cn == i) {
                        z = an.gt(fcVar.aq * 595563667, fcVar.ad * -193944913, 80678785);
                    }
                }
                if (!z) {
                    ar(40418711);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(int i, int i2, int i3) {
        try {
            if (this.bi) {
                int i4 = 0;
                while (i4 < this.bc * -1494278369) {
                    if (ak(i, i2, (((this.ac * 980276483) + (this.bl * -1793346699)) + 3) + ((this.ac * 980276483) * (((this.bc * -1494278369) - 1) - i4)), 1904446238)) {
                        break;
                    }
                    i4++;
                }
                i4 = -1;
                if (-1 != i4) {
                    as(i4, 679225932);
                }
                cj(1486406451);
                bk(-865063661);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int af(byte b) {
        try {
            return this.ay * -1012473727;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ag(fc fcVar, int i, int i2, int i3) {
        try {
            String str = fcVar.aj;
            String str2 = fcVar.ai;
            int i4 = fcVar.ar * -1484618507;
            cy.fw(fcVar.ad * -193944913, fcVar.aq * 595563667, i4, fcVar.al * 1302296735, str, str2, i, i2, 349447921);
            if (fo.ad(i4, 799410134)) {
                bs(i, i2, true, str2, str, -630553452);
            }
            client.bh.an(io.ax, -2044827347);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ah(boolean z, int i) {
        try {
            this.af = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i, int i2, int i3) {
        int i4 = 0;
        try {
            int al;
            int al2 = this.aw.al(go.gb);
            int i5 = 0;
            while (i5 < this.bc * -1494278369) {
                al = this.aw.al(at(i5, (byte) -115));
                if (al <= al2) {
                    al = al2;
                }
                i5++;
                al2 = al;
            }
            i5 = al2 + (this.aa * 1102791510);
            int i6 = (((this.bc * -1494278369) + 1) * (this.ac * 980276483)) + 7;
            al = i - (i5 / 2);
            if (al + i5 > hl.tk * 1350811837) {
                al = (hl.tk * 1350811837) - i5;
            }
            if (al < 0) {
                al = 0;
            }
            al2 = i2 + i6 > jw.tx * -1083397279 ? (jw.tx * -1083397279) - i6 : i2;
            if (al2 >= 0) {
                i4 = al2;
            }
            this.bo = al * 629116931;
            this.bl = -1486928675 * i4;
            this.bf = 1094739433 * i5;
            this.bb = 716375949 * i6;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i) {
        try {
            ai((this.bo * -2107401557) - ((this.bf * -250428839) / 2), (this.bl * -1793346699) - ((this.bb * -682781883) / 2), -1949287855);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ak(int i, int i2, int i3, int i4) {
        try {
            return client.bh.ad != io.al && i > this.bo * -2107401557 && i < (this.bo * -2107401557) + (this.bf * -250428839) && i2 >= i3 && i2 <= ((this.ac * 980276483) + i3) - 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(int i, int i2, byte b) {
        try {
            ai(i, i2, -1966239852);
            bh.es(i, i2, 1443302907);
            this.bi = true;
            client.bh.an(io.al, -2030978708);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void am(int i) {
        try {
            this.bt += 728590985;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int an(int i) {
        try {
            return this.ab * 1795836239;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ao(int i) {
        try {
            return this.af;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean ap(int i, int i2) {
        if (i < 0) {
            return false;
        }
        try {
            int i3 = this.bv[i].ar * -1484618507;
            if (i3 >= 2000) {
                i3 -= 2000;
            }
            return i3 == 1007;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: aq */
    public void m215aq(int i) {
        try {
            if (client.bh.ad == io.ar) {
                ae(client.bh.am[0], client.bh.ak[0], 1672153769);
            } else if (au(client.bh.am[0], client.bh.ak[0], (byte) -28)) {
                cj(1159926450);
                bk(-524089949);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i) {
        try {
            if (io.ar == client.bh.ad && ((dt.gz((byte) 54) && this.bc * -1494278369 > 2 && !be(33858881) && !bj(-396985267)) || ap(br((byte) -1), -516784415))) {
                client.bh.an(io.al, -2036772506);
            }
            if (io.ar == client.bh.ad) {
                if (this.bc * -1494278369 > 0) {
                    as(br((byte) -1), 679225932);
                }
                client.bh.an(io.ax, -2124005434);
            } else if (io.al != client.bh.ad && io.aj != client.bh.ad) {
            } else {
                if (this.bc * -1494278369 > 0) {
                    al(client.bh.am[0], client.bh.ak[0], (byte) 1);
                } else {
                    client.bh.an(io.ax, -2102142847);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void as(int i, int i2) {
        if (i >= 0) {
            try {
                ag(this.bv[i], client.bh.ai[0], client.bh.ae[0], -719133820);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fu.as(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String at(int i, byte b) {
        if (i < 0) {
            return "";
        }
        StringBuilder stringBuilder;
        try {
            fc fcVar = this.bv[i];
            if (fcVar.ai.length() <= 0) {
                return fcVar.aj;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(fcVar.aj);
            stringBuilder.append(go.gq);
            stringBuilder.append(fcVar.ai);
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("fu.at(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean au(int i, int i2, byte b) {
        if (i == -1 || i2 == -1) {
            return false;
        }
        try {
            if (i < (this.bo * -2107401557) - 10) {
                return true;
            }
            if (i > ((this.bf * -250428839) + (this.bo * -2107401557)) + 10) {
                return true;
            }
            if (i2 < (this.bl * -1793346699) - 10) {
                return true;
            }
            return i2 > ((this.bb * -682781883) + (this.bl * -1793346699)) + 10;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void av(int i, int i2, es esVar, int i3) {
        StringBuilder stringBuilder;
        try {
            if (!this.cq) {
                if (this.bc * -1494278369 >= 2 || client.ky * -82596523 != 0 || this.af) {
                    String stringBuilder2;
                    String stringBuilder3;
                    int br = br((byte) -1);
                    StringBuilder stringBuilder4;
                    if (client.ky * -82596523 == 1 && this.bc * -1494278369 < 2) {
                        stringBuilder4 = new StringBuilder();
                        stringBuilder4.append(go.ge);
                        stringBuilder4.append(go.gq);
                        stringBuilder4.append(client.it);
                        stringBuilder4.append(" ");
                        stringBuilder4.append(iz.ai);
                        stringBuilder2 = stringBuilder4.toString();
                    } else if (!this.af || this.bc * -1494278369 >= 2) {
                        stringBuilder2 = at(br, (byte) -105);
                    } else {
                        stringBuilder4 = new StringBuilder();
                        stringBuilder4.append(this.at);
                        stringBuilder4.append(go.gq);
                        stringBuilder4.append(this.bk);
                        stringBuilder4.append(" ");
                        stringBuilder4.append(iz.ai);
                        stringBuilder2 = stringBuilder4.toString();
                    }
                    if (this.bc * -1494278369 > 2) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(stringBuilder2);
                        stringBuilder.append(hs.aq(16777215, -107964007));
                        stringBuilder.append(" ");
                        stringBuilder.append('/');
                        stringBuilder.append(" ");
                        stringBuilder.append((this.bc * -1494278369) - 2);
                        stringBuilder.append(go.gj);
                        stringBuilder3 = stringBuilder.toString();
                    } else {
                        stringBuilder3 = stringBuilder2;
                    }
                    this.aw.ac(stringBuilder3, (this.aa * 551395755) + i, ((this.aw.am + i2) + this.aw.ak) - 1, 16777215, 0, (client.bj * 2133672263) / 1000, esVar);
                }
            }
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("fu.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aw(int i, int i2, int i3, int i4, short s) {
        try {
            al ar = gi.ar(i, i2, -1201935479);
            if (!(ar == null || ar.ee == null)) {
                il ilVar = new il();
                ilVar.ar = ar;
                ilVar.ad = ar.ee;
                dm.ad(ilVar, 1890621970);
            }
            this.ab = 710618543 * i4;
            this.af = true;
            this.ay = 253321089 * i;
            this.an = 1345222505 * i2;
            this.av = 1832640157 * i3;
            da.gk(ar, (byte) 2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ax(int i, String str, int i2, int i3) {
        boolean z = true;
        if (i >= 1 && i <= 8) {
            try {
                if (str.equalsIgnoreCase("null")) {
                    str = null;
                }
                int i4 = i - 1;
                this.bm[i4] = str;
                boolean[] zArr = this.bq;
                if (i2 != 0) {
                    z = false;
                }
                zArr[i4] = z;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fu.ax(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public int ay(int i) {
        try {
            return this.an * 2133166297;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void az(int i) {
        int i2 = 0;
        while (i2 < 8) {
            try {
                this.bm[i2] = null;
                this.bq[i2] = false;
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fu.az(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void ba(int i, int i2, boolean z, int i3) {
        try {
            bs(i, i2, z, null, null, -1990263791);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void bb(String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2, int i5) {
        try {
            if (!cv((byte) -59) && this.bc * -1494278369 < ad) {
                this.bv[this.bc * -1494278369].aq(str, str2, i3, i4, i, i2, z, z2, -1724219635);
                this.bc += 849583327;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void bc(al alVar, int i, int i2, int i3) {
        try {
            String hj;
            StringBuilder stringBuilder;
            int i4;
            int i5;
            if (alVar.ay * 1113829289 == 1) {
                bi(alVar.fg, "", 24, 0, 0, -1227024251 * alVar.ao, (byte) 1);
            }
            if (alVar.ay * 1113829289 == 2 && !this.af) {
                hj = de.hj(alVar, -1929912919);
                if (hj != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(hs.aq(MotionEventCompat.ACTION_POINTER_INDEX_MASK, -340144187));
                    stringBuilder.append(alVar.fd);
                    bi(hj, stringBuilder.toString(), 25, 0, -1, -1227024251 * alVar.ao, (byte) 1);
                }
            }
            if (3 == alVar.ay * 1113829289) {
                bi(go.gg, "", 26, 0, 0, -1227024251 * alVar.ao, (byte) 1);
            }
            if (alVar.ay * 1113829289 == 4) {
                bi(alVar.fg, "", 28, 0, 0, -1227024251 * alVar.ao, (byte) 1);
            }
            if (5 == alVar.ay * 1113829289) {
                bi(alVar.fg, "", 29, 0, 0, -1227024251 * alVar.ao, (byte) 1);
            }
            if (alVar.ay * 1113829289 == 6 && client.lh == null) {
                bi(alVar.fg, "", 30, 0, -1, -1227024251 * alVar.ao, (byte) 1);
            }
            if (2 == alVar.af * 1845699613) {
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    i4 = i7;
                    if (i4 >= alVar.bf * 1813264797) {
                        break;
                    }
                    for (int i8 = 0; i8 < alVar.bl * 1272191791; i8++) {
                        i7 = ((alVar.df * 1340041391) + 32) * i8;
                        int i9 = ((alVar.da * 1649065889) + 32) * i4;
                        if (i6 < 20) {
                            i7 += alVar.db[i6];
                            i9 += alVar.dc[i6];
                        }
                        if (i >= i7 && i2 >= i9 && i < i7 + 32 && i2 < i9 + 32) {
                            bv.gf(i6, alVar, 1495270130);
                            if (alVar.fj[i6] > 0) {
                                dh aq = gl.aq(alVar.fj[i6] - 1, -1022308280);
                                if (1 == client.ky * -82596523 && du.ak(hs.hy(alVar, (byte) 81), 741531169)) {
                                    if (alVar.ao * -1227024251 != fw.ix * 221295727 || az.ke * -80320813 != i6) {
                                        hj = go.ge;
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append(client.it);
                                        stringBuilder.append(" ");
                                        stringBuilder.append(iz.ai);
                                        stringBuilder.append(" ");
                                        stringBuilder.append(hs.aq(16748608, 338660655));
                                        stringBuilder.append(aq.ao);
                                        bi(hj, stringBuilder.toString(), 31, -1129192407 * aq.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                    }
                                } else if (!this.af || !du.ak(hs.hy(alVar, (byte) 24), 741531169)) {
                                    int i10;
                                    String[] strArr = aq.bl;
                                    i7 = (this.bx && ci(2117727639)) ? aq.ah(2131099739) : -1;
                                    if (du.ak(hs.hy(alVar, (byte) 21), 741531169)) {
                                        for (i10 = 4; i10 >= 3; i10--) {
                                            if (i7 != i10) {
                                                bv(alVar, aq, i6, i10, false, -116750307);
                                            }
                                        }
                                    }
                                    dh dhVar = aq;
                                    int i11 = i7;
                                    if (ad.as(hs.hy(alVar, (byte) 118), -2120967235)) {
                                        hj = go.ge;
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append(hs.aq(16748608, 1153422483));
                                        stringBuilder.append(dhVar.ao);
                                        bi(hj, stringBuilder.toString(), 38, -1129192407 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                    }
                                    if (du.ak(hs.hy(alVar, (byte) 92), 741531169) && strArr != null) {
                                        for (i10 = 2; i10 >= 0; i10--) {
                                            if (i10 != i11) {
                                                bv(alVar, dhVar, i6, i10, false, -116750307);
                                            }
                                        }
                                        if (i11 >= 0) {
                                            bv(alVar, dhVar, i6, i11, true, -116750307);
                                        }
                                    }
                                    String[] strArr2 = alVar.dp;
                                    if (strArr2 != null) {
                                        i5 = 4;
                                        while (i5 >= 0) {
                                            if (strArr2[i5] != null) {
                                                int i12 = i5 == 0 ? 39 : 0;
                                                if (i5 == 1) {
                                                    i12 = 40;
                                                }
                                                if (2 == i5) {
                                                    i12 = 41;
                                                }
                                                if (3 == i5) {
                                                    i12 = 42;
                                                }
                                                if (i5 == 4) {
                                                    i12 = 43;
                                                }
                                                hj = strArr2[i5];
                                                stringBuilder = new StringBuilder();
                                                stringBuilder.append(hs.aq(16748608, -2092855391));
                                                stringBuilder.append(dhVar.ao);
                                                bi(hj, stringBuilder.toString(), i12, -1129192407 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                            }
                                            i5--;
                                        }
                                    }
                                    hj = go.gz;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(hs.aq(16748608, 1072345173));
                                    stringBuilder.append(dhVar.ao);
                                    bi(hj, stringBuilder.toString(), ce.cn, -1129192407 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                } else if (((this.av * 549558197) & 16) == 16) {
                                    hj = this.at;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(this.bk);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(iz.ai);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(hs.aq(16748608, 124238143));
                                    stringBuilder.append(aq.ao);
                                    bi(hj, stringBuilder.toString(), 32, -1129192407 * aq.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                }
                            }
                        }
                        i6++;
                    }
                    i7 = i4 + 1;
                }
            }
            if (!alVar.aa) {
                return;
            }
            if (!this.af) {
                for (i5 = 9; i5 >= 5; i5--) {
                    hj = bw(alVar, i5, -1515410453);
                    if (hj != null) {
                        bi(hj, alVar.dg, 1007, i5 + 1, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
                    }
                }
                hj = de.hj(alVar, 470100160);
                if (hj != null) {
                    bi(hj, alVar.dg, 25, 0, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
                }
                for (i4 = 4; i4 >= 0; i4--) {
                    hj = bw(alVar, i4, -702118477);
                    if (hj != null) {
                        bb(hj, alVar.dg, 57, i4 + 1, 988026877 * alVar.ah, -1227024251 * alVar.ao, false, alVar.gv, -1331715867);
                    }
                }
                if (aa.ad(hs.hy(alVar, (byte) 103), 342391620)) {
                    bi(go.ae, "", 30, 0, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
                }
            } else if (iq.ai(hs.hy(alVar, (byte) 17), 2052034804) && ((this.av * 549558197) & 32) == 32) {
                hj = this.at;
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.bk);
                stringBuilder.append(" ");
                stringBuilder.append(iz.ai);
                stringBuilder.append(" ");
                stringBuilder.append(alVar.dg);
                bi(hj, stringBuilder.toString(), 58, 0, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("fu.bc(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public final void bd(int i, int i2, int i3, int i4, int i5) {
        StringBuilder stringBuilder;
        try {
            if (client.ky * -82596523 == 0 && !this.af) {
                bi(go.ga, "", 23, 0, i - i3, i2 - i4, (byte) 1);
            }
            if (ca.aa(i - i3, i2 - i4, 782696153)) {
                int ap;
                int i6;
                this.bd = false;
                long j = -1;
                long j2 = -1;
                for (int i7 = 0; i7 < at.ad(-1785754277); i7++) {
                    long j3;
                    long al = el.al(i7, 1569171858);
                    if (j != al) {
                        String str;
                        StringBuilder stringBuilder2;
                        long j4;
                        int aj = if.aj(i7, (byte) 8);
                        int ae = ac.ae(i7, -166536846);
                        int ak = ea.ak(i7, 2130903186);
                        ap = ep.ap(i7, (byte) -105);
                        if (2 == ak && aj.fq(aj, ae, al)) {
                            dx aq = aj.aq(ap, -1973522032);
                            if (aq.bw != null) {
                                aq = aq.ap(175387051);
                            }
                            if (aq != null) {
                                if (1 == client.ky * -82596523) {
                                    str = go.ge;
                                    stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append(client.it);
                                    stringBuilder2.append(" ");
                                    stringBuilder2.append(iz.ai);
                                    stringBuilder2.append(" ");
                                    stringBuilder2.append(hs.aq(SupportMenu.USER_MASK, -751190188));
                                    stringBuilder2.append(aq.ap);
                                    bi(str, stringBuilder2.toString(), 1, ap, aj, ae, (byte) 1);
                                } else if (!this.af) {
                                    String[] strArr = aq.bs;
                                    if (strArr != null) {
                                        int i8 = 4;
                                        while (i8 >= 0) {
                                            if (strArr[i8] != null) {
                                                i6 = i8 == 0 ? 3 : 0;
                                                if (i8 == 1) {
                                                    i6 = 4;
                                                }
                                                if (2 == i8) {
                                                    i6 = 5;
                                                }
                                                if (3 == i8) {
                                                    i6 = 6;
                                                }
                                                if (4 == i8) {
                                                    i6 = 1001;
                                                }
                                                str = strArr[i8];
                                                stringBuilder2 = new StringBuilder();
                                                stringBuilder2.append(hs.aq(SupportMenu.USER_MASK, -1575595844));
                                                stringBuilder2.append(aq.ap);
                                                bi(str, stringBuilder2.toString(), i6, ap, aj, ae, (byte) 1);
                                            }
                                            i8--;
                                        }
                                    }
                                    dx dxVar = aq;
                                    String str2 = go.gz;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(hs.aq(SupportMenu.USER_MASK, 1878692969));
                                    stringBuilder.append(dxVar.ap);
                                    bi(str2, stringBuilder.toString(), 1002, dxVar.ak * 144682743, aj, ae, (byte) 1);
                                } else if (4 == ((this.av * 549558197) & 4)) {
                                    str = this.at;
                                    stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append(this.bk);
                                    stringBuilder2.append(" ");
                                    stringBuilder2.append(iz.ai);
                                    stringBuilder2.append(" ");
                                    stringBuilder2.append(hs.aq(SupportMenu.USER_MASK, -2089934735));
                                    stringBuilder2.append(aq.ap);
                                    bi(str, stringBuilder2.toString(), 2, ap, aj, ae, (byte) 1);
                                }
                            }
                            j = al;
                        }
                        if (ak == 1) {
                            iq eb = an.eb(ap, (byte) 24);
                            if (eb != null) {
                                if (1 == eb.ad.ae * -735434895 && ((eb.bq * -1444273727) & 127) == 64 && 64 == ((eb.bd * -1690563339) & 127)) {
                                    bo(eb, aj, ae, -1032432792);
                                    bl(eb, aj, ae, 769044748);
                                }
                                bg(eb.ad, ap, aj, ae, -1658793692);
                            }
                            j = al;
                        }
                        if (ak == 0) {
                            hv hvVar = client.jz[ap];
                            if (hvVar != null) {
                                if (64 == ((hvVar.bq * -1444273727) & 127) && 64 == ((hvVar.bd * -1690563339) & 127)) {
                                    bo(hvVar, aj, ae, -1099365129);
                                    bl(hvVar, aj, ae, 194947109);
                                }
                                if (ap != dx.em((byte) -28)) {
                                    bx(hvVar, ap, aj, ae, -553559762);
                                    j4 = j2;
                                } else {
                                    j4 = al;
                                }
                            }
                            j = al;
                        } else {
                            j4 = j2;
                        }
                        if (3 == ak) {
                            fy ef = fe.ef(am.jy * 1973701849, aj, ae, 2133490282);
                            if (ef != null) {
                                for (ja jaVar = (ja) ef.am(); jaVar != null; jaVar = (ja) ef.as()) {
                                    dh aq2 = gl.aq(jaVar.ad * -1830817693, -178425906);
                                    if (client.ky * -82596523 == 1) {
                                        str = go.ge;
                                        stringBuilder2 = new StringBuilder();
                                        stringBuilder2.append(client.it);
                                        stringBuilder2.append(" ");
                                        stringBuilder2.append(iz.ai);
                                        stringBuilder2.append(" ");
                                        stringBuilder2.append(hs.aq(16748608, -132333716));
                                        stringBuilder2.append(aq2.ao);
                                        bi(str, stringBuilder2.toString(), 16, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                    } else if (!this.af) {
                                        String[] strArr2 = aq2.bo;
                                        int i9 = 4;
                                        while (i9 >= 0) {
                                            dh dhVar;
                                            if (strArr2 != null && strArr2[i9] != null) {
                                                i6 = i9 == 0 ? 18 : 0;
                                                if (1 == i9) {
                                                    i6 = 19;
                                                }
                                                if (i9 == 2) {
                                                    i6 = 20;
                                                }
                                                if (3 == i9) {
                                                    i6 = 21;
                                                }
                                                if (4 == i9) {
                                                    i6 = 22;
                                                }
                                                str = strArr2[i9];
                                                stringBuilder2 = new StringBuilder();
                                                stringBuilder2.append(hs.aq(16748608, -630950616));
                                                stringBuilder2.append(aq2.ao);
                                                bi(str, stringBuilder2.toString(), i6, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                                dhVar = aq2;
                                            } else if (2 == i9) {
                                                str = go.aq;
                                                stringBuilder2 = new StringBuilder();
                                                stringBuilder2.append(hs.aq(16748608, 1408921181));
                                                stringBuilder2.append(aq2.ao);
                                                bi(str, stringBuilder2.toString(), 20, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                                dhVar = aq2;
                                            } else {
                                                dhVar = aq2;
                                            }
                                            aq2 = dhVar;
                                            i9--;
                                        }
                                        str = go.gz;
                                        stringBuilder2 = new StringBuilder();
                                        stringBuilder2.append(hs.aq(16748608, 1652898755));
                                        stringBuilder2.append(aq2.ao);
                                        bi(str, stringBuilder2.toString(), 1004, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                    } else if (((this.av * 549558197) & 1) == 1) {
                                        str = this.at;
                                        stringBuilder2 = new StringBuilder();
                                        stringBuilder2.append(this.bk);
                                        stringBuilder2.append(" ");
                                        stringBuilder2.append(iz.ai);
                                        stringBuilder2.append(" ");
                                        stringBuilder2.append(hs.aq(16748608, 20842319));
                                        stringBuilder2.append(aq2.ao);
                                        bi(str, stringBuilder2.toString(), 17, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                    }
                                }
                            }
                        }
                        j = al;
                        j3 = j4;
                        j2 = j3;
                    }
                    j3 = j2;
                    j2 = j3;
                }
                if (j2 != -1) {
                    i6 = ak.ai(j2);
                    ap = eq.am(j2);
                    int em = dx.em((byte) 63);
                    bx(client.jz[em], em, i6, ap, 545778359);
                    return;
                }
                return;
            }
            this.bd = true;
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bd(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean be(int i) {
        try {
            return this.bc * -1494278369 > 0 && this.bx && ci(-1016421539) && this.bv[(this.bc * -1494278369) - 1].ae;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.be(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bf(int i, int i2, int i3) {
        try {
            fc fcVar = this.bv[i];
            this.bv[i] = this.bv[i2];
            this.bv[i2] = fcVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void bg(et etVar, int i, int i2, int i3, int i4) {
        StringBuilder stringBuilder;
        try {
            if (this.bc * -1494278369 < 400) {
                if (etVar.bq != null) {
                    etVar = etVar.am(1213739659);
                }
                if (etVar != null && etVar.bl) {
                    if (!etVar.bb || i == client.lr * 770492805) {
                        String stringBuilder2;
                        String str;
                        StringBuilder stringBuilder3;
                        String str2 = etVar.ai;
                        if (etVar.an * 2013139053 != 0) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str2);
                            stringBuilder.append(cc.bu(etVar.an * 2013139053, da.jc.ae * -1589952451, 1249092605));
                            stringBuilder.append(" ");
                            stringBuilder.append(iz.al);
                            stringBuilder.append(go.gt);
                            stringBuilder.append(etVar.an * 2013139053);
                            stringBuilder.append(iz.aj);
                            stringBuilder2 = stringBuilder.toString();
                        } else {
                            stringBuilder2 = str2;
                        }
                        if (etVar.bb && cn(-749304435)) {
                            str = go.gz;
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(hs.aq(16776960, 1852917034));
                            stringBuilder3.append(stringBuilder2);
                            bi(str, stringBuilder3.toString(), 1003, i, i2, i3, (byte) 1);
                        }
                        if (1 == client.ky * -82596523) {
                            str = go.ge;
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(client.it);
                            stringBuilder3.append(" ");
                            stringBuilder3.append(iz.ai);
                            stringBuilder3.append(" ");
                            stringBuilder3.append(hs.aq(16776960, 1751586376));
                            stringBuilder3.append(stringBuilder2);
                            bi(str, stringBuilder3.toString(), 7, i, i2, i3, (byte) 1);
                        } else if (!this.af) {
                            int i5;
                            int i6 = (etVar.bb && cn(1784710743)) ? 2000 : 0;
                            String[] strArr = etVar.af;
                            if (strArr != null) {
                                int i7 = 4;
                                while (i7 >= 0) {
                                    if (strArr[i7] != null) {
                                        if (!strArr[i7].equalsIgnoreCase(go.gr)) {
                                            i5 = i7 == 0 ? i6 + 9 : 0;
                                            if (1 == i7) {
                                                i5 = i6 + 10;
                                            }
                                            if (2 == i7) {
                                                i5 = i6 + 11;
                                            }
                                            if (i7 == 3) {
                                                i5 = i6 + 12;
                                            }
                                            if (4 == i7) {
                                                i5 = i6 + 13;
                                            }
                                            str = strArr[i7];
                                            stringBuilder3 = new StringBuilder();
                                            stringBuilder3.append(hs.aq(16776960, -273437249));
                                            stringBuilder3.append(stringBuilder2);
                                            bi(str, stringBuilder3.toString(), i5, i, i2, i3, (byte) 1);
                                        }
                                    }
                                    i7--;
                                }
                            }
                            String[] strArr2 = strArr;
                            if (strArr2 != null) {
                                int i8 = 4;
                                while (i8 >= 0) {
                                    if (strArr2[i8] != null) {
                                        if (strArr2[i8].equalsIgnoreCase(go.gr) && this.bw != fb.al) {
                                            int i9 = (this.bw == fb.aq || (fb.ad == this.bw && etVar.an * 2013139053 > da.jc.ae * -1589952451)) ? 2000 : 0;
                                            i5 = i8 == 0 ? i9 + 9 : 0;
                                            if (i8 == 1) {
                                                i5 = i9 + 10;
                                            }
                                            if (2 == i8) {
                                                i5 = i9 + 11;
                                            }
                                            if (i8 == 3) {
                                                i5 = i9 + 12;
                                            }
                                            if (i8 == 4) {
                                                i5 = i9 + 13;
                                            }
                                            str = strArr2[i8];
                                            stringBuilder3 = new StringBuilder();
                                            stringBuilder3.append(hs.aq(16776960, -1984383514));
                                            stringBuilder3.append(stringBuilder2);
                                            bi(str, stringBuilder3.toString(), i5, i, i2, i3, (byte) 1);
                                        }
                                    }
                                    i8--;
                                }
                            }
                            if (!etVar.bb || !cn(1438110190)) {
                                str = go.gz;
                                stringBuilder3 = new StringBuilder();
                                stringBuilder3.append(hs.aq(16776960, -969568601));
                                stringBuilder3.append(stringBuilder2);
                                bi(str, stringBuilder3.toString(), 1003, i, i2, i3, (byte) 1);
                            }
                        } else if (2 == ((this.av * 549558197) & 2)) {
                            str = this.at;
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(this.bk);
                            stringBuilder3.append(" ");
                            stringBuilder3.append(iz.ai);
                            stringBuilder3.append(" ");
                            stringBuilder3.append(hs.aq(16776960, -1985105362));
                            stringBuilder3.append(stringBuilder2);
                            bi(str, stringBuilder3.toString(), 8, i, i2, i3, (byte) 1);
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bh(int i) {
        Object obj = null;
        while (obj == null) {
            obj = 1;
            int i2 = 0;
            while (i2 < (this.bc * -1494278369) - 1) {
                try {
                    fc fcVar = this.bv[i2];
                    int i3 = i2 + 1;
                    fc fcVar2 = this.bv[i3];
                    if (fcVar.ar * -1484618507 < 1000 && fcVar2.ar * -1484618507 > 1000) {
                        bf(i2, i3, 1863427953);
                        obj = null;
                    }
                    i2 = i3;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("fu.bh(");
                    stringBuilder.append(')');
                    throw mv.aq(e, stringBuilder.toString());
                }
            }
        }
    }

    public final void bi(String str, String str2, int i, int i2, int i3, int i4, byte b) {
        try {
            bb(str, str2, i, i2, i3, i4, false, false, -1331715867);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean bj(int i) {
        try {
            return this.bc * -1494278369 > 0 && this.bv[(this.bc * -1494278369) - 1].am;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(int i) {
        try {
            ic.fx(this.bo * -2107401557, this.bl * -1793346699, this.bf * -250428839, this.bb * -682781883, 1449758297);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(ih ihVar, int i, int i2, int i3) {
        try {
            int i4 = hz.ai;
            int[] iArr = hz.ae;
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < -1076782851 * i4) {
                    ih ihVar2 = client.jz[iArr[i6]];
                    if (ihVar2 != null && ihVar2 != ihVar && ihVar2.bq * -1444273727 == ihVar.bq * -1444273727 && ihVar.bd * -1690563339 == ihVar2.bd * -1690563339) {
                        bx(ihVar2, iArr[i6], i, i2, 165465104);
                    }
                    i5 = i6 + 1;
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bm(es esVar, byte b) {
        int i = 0;
        try {
            if (client.ip) {
                if (this.bt * -1635701831 < this.bn * 728835117) {
                    if (this.cv * -8607437 != -1) {
                        cs(1353252255);
                    }
                    if (this.by == null) {
                        bq(esVar, 0, 734592489);
                        return;
                    }
                    int i2 = this.by[0].aq;
                    int length = this.by.length / 2;
                    if (this.bz) {
                        i = this.by.length / 2;
                    }
                    if (this.bp) {
                        int i3 = i2 * 3;
                        es esVar2 = esVar;
                        esVar2.bs(this.by[i + ((length * (this.bt * -1635701831)) / (this.bn * 728835117))], ((this.br * -2065303691) - (i3 / 2)) + 8, ((this.be * -1655223839) - (i3 / 2)) + 8, 255 - ((this.bt * -492139193) / (this.bn * 728835117)), (byte) 7);
                    } else {
                        int i4 = i2 * 3;
                        esVar.aw(this.by[i + ((length * (this.bt * -1635701831)) / (this.bn * 728835117))], ((this.br * -2065303691) - (i4 / 2)) + 8, ((this.be * -1655223839) - (i4 / 2)) + 8, 16711935);
                    }
                    bq(esVar, i2, 1264164675);
                } else if (this.bt * -1635701831 < this.bn * 1457670234) {
                    if (this.by != null) {
                        i = this.by[0].aq;
                    }
                    bq(esVar, i, -349364238);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bn(int i) {
        try {
            bt(688481336);
            this.bc = 849583327;
            this.bv[0].ad(as, 1613090704);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(ih ihVar, int i, int i2, int i3) {
        try {
            int ev = ig.ev(-1128028274);
            for (int i4 = 0; i4 < ev; i4++) {
                ih eb = an.eb(fk.ep(i4, -1638666039), (byte) 59);
                if (eb != null && ihVar != eb && eb.ad.ae * -735434895 == 1 && ihVar.bq * -1444273727 == eb.bq * -1444273727 && ihVar.bd * -1690563339 == eb.bd * -1690563339) {
                    bg(eb.ad, fk.ep(i4, -1263202406), i, i2, -2144393740);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bp(String str, int i) {
        int i2 = 0;
        while (i2 < this.bc * -1494278369) {
            StringBuilder stringBuilder;
            try {
                if (23 == this.bv[i2].ar * -1484618507) {
                    fc fcVar = this.bv[i2];
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(hs.aq(16777215, 116562523));
                    stringBuilder.append(str);
                    fcVar.ai = stringBuilder.toString();
                    return;
                }
                i2++;
            } catch (RuntimeException e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("fu.bp(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bq(es esVar, int i, int i2) {
        try {
            if (this.cj && this.bh != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.bh);
                if (this.bj != null && this.bj.length() > 0) {
                    stringBuilder.append(go.gq);
                    stringBuilder.append(this.bj);
                    stringBuilder.append(iz.am);
                }
                String stringBuilder2 = stringBuilder.toString();
                int i3 = ((this.br * -2065303691) + i) + 8;
                int al = this.aw.al(stringBuilder2);
                int i4 = this.br * -2065303691 > (esVar.aq * 1462922907) / 2 ? (((this.br * -2065303691) - i) - 8) - al : i3;
                if (this.bp) {
                    int i5 = 255;
                    if (this.bt * -1635701831 > this.bn * 728835117) {
                        i5 = 255 - (((this.bt * -984278386) - (this.bn * -1956245082)) / (this.bn * 1457670234));
                    }
                    esVar.ef(i4 - 5, (this.be * -1655223839) - 8, al + 10, this.aw.ae + 10, 0, i5, 1483178772);
                    esVar.ar(i4 - 4, (this.be * -1655223839) - 7, al + 8, this.aw.ae + 8, 6710886, i5, (byte) 15);
                    this.aw.as(stringBuilder2, i4, (this.be * -1655223839) + (this.aw.ae / 2), 16777215, 0, i5, esVar);
                    return;
                }
                esVar.em(i4 - 5, (this.be * -1655223839) - 8, al + 10, this.aw.ae + 10, 0, 1237388788);
                esVar.al(i4 - 4, (this.be * -1655223839) - 7, al + 8, this.aw.ae + 8, 6710886, (byte) 1);
                this.aw.ak(stringBuilder2, i4, (this.aw.ae / 2) + (this.be * -1655223839), 16777215, 0, esVar);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("fu.bq(");
            stringBuilder3.append(')');
            throw mv.aq(e, stringBuilder3.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final int br(byte b) {
        try {
            return this.bc * -1494278369 <= 0 ? -1 : (this.bc * -1494278369) - 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.br(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(int i, int i2, boolean z, String str, String str2, int i3) {
        try {
            this.br = -842538787 * i;
            this.be = -497894879 * i2;
            this.bz = z;
            this.bt = 0;
            this.bj = str;
            this.bh = str2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bt(int i) {
        try {
            this.bc = 0;
            this.bd = false;
            client.bh.ay((byte) -48);
            cj(1061926721);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bt(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void bv(al alVar, dh dhVar, int i, int i2, boolean z, int i3) {
        try {
            String str;
            int i4;
            String[] strArr = dhVar.bl;
            int i5 = 37;
            if (strArr != null && strArr[i2] != null) {
                if (i2 == 0) {
                    i5 = 33;
                } else if (i2 == 1) {
                    i5 = 34;
                } else if (2 == i2) {
                    i5 = 35;
                } else if (i2 == 3) {
                    i5 = 36;
                }
                str = strArr[i2];
                i4 = i5;
            } else if (4 == i2) {
                str = go.ar;
                i4 = 37;
            } else {
                str = null;
                i4 = -1;
            }
            if (i4 != -1 && str != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(hs.aq(16748608, -1542305944));
                stringBuilder.append(dhVar.ao);
                bb(str, stringBuilder.toString(), i4, -1129192407 * dhVar.ac, i, alVar.ao * -1227024251, z, false, -1331715867);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("fu.bv(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String bw(al alVar, int i, int i2) {
        try {
            return ((!ai.aq(hs.hy(alVar, (byte) 103), i, -1548486523) && alVar.ej == null) || alVar.dz == null || alVar.dz.length <= i || alVar.dz[i] == null || alVar.dz[i].trim().length() == 0) ? null : alVar.dz[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.bw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void bx(hv hvVar, int i, int i2, int i3, int i4) {
        try {
            if (da.jc != hvVar && this.bc * -1494278369 < 400) {
                StringBuilder stringBuilder;
                String stringBuilder2;
                if (hvVar.am * -2101033323 == 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(hvVar.ai[0]);
                    stringBuilder.append(hvVar.ad);
                    stringBuilder.append(hvVar.ai[1]);
                    stringBuilder.append(cc.bu(hvVar.ae * -1589952451, da.jc.ae * -1589952451, -1147080362));
                    stringBuilder.append(" ");
                    stringBuilder.append(iz.al);
                    stringBuilder.append(go.gt);
                    stringBuilder.append(hvVar.ae * -1589952451);
                    stringBuilder.append(iz.aj);
                    stringBuilder.append(hvVar.ai[2]);
                    stringBuilder2 = stringBuilder.toString();
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(hvVar.ai[0]);
                    stringBuilder.append(hvVar.ad);
                    stringBuilder.append(hvVar.ai[1]);
                    stringBuilder.append(" ");
                    stringBuilder.append(iz.al);
                    stringBuilder.append(go.gm);
                    stringBuilder.append(hvVar.am * -2101033323);
                    stringBuilder.append(iz.aj);
                    stringBuilder.append(hvVar.ai[2]);
                    stringBuilder2 = stringBuilder.toString();
                }
                String str;
                if (client.ky * -82596523 == 1) {
                    str = go.ge;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(client.it);
                    stringBuilder.append(" ");
                    stringBuilder.append(iz.ai);
                    stringBuilder.append(" ");
                    stringBuilder.append(hs.aq(16777215, 1022006366));
                    stringBuilder.append(stringBuilder2);
                    bi(str, stringBuilder.toString(), 14, i, i2, i3, (byte) 1);
                } else if (!this.af) {
                    for (int i5 = 7; i5 >= 0; i5--) {
                        if (this.bm[i5] != null) {
                            int i6;
                            if (!this.bm[i5].equalsIgnoreCase(go.gr)) {
                                if (this.bq[i5]) {
                                    i6 = 2000;
                                }
                                i6 = 0;
                            } else if (this.bu != fb.al) {
                                i6 = (fb.aq == this.bu || (fb.ad == this.bu && hvVar.ae * -1589952451 > da.jc.ae * -1589952451)) ? 2000 : 0;
                                if (!(da.jc.af * -1540441435 == 0 || hvVar.af * -1540441435 == 0)) {
                                    if (da.jc.af * -1540441435 == hvVar.af * -1540441435) {
                                        i6 = 2000;
                                    }
                                    i6 = 0;
                                }
                            }
                            int i7 = this.bs[i5];
                            str = this.bm[i5];
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(hs.aq(16777215, 663375409));
                            stringBuilder3.append(stringBuilder2);
                            bi(str, stringBuilder3.toString(), i7 + i6, i, i2, i3, (byte) 1);
                        }
                    }
                } else if (((this.av * 549558197) & 8) == 8) {
                    str = this.at;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(this.bk);
                    stringBuilder.append(" ");
                    stringBuilder.append(iz.ai);
                    stringBuilder.append(" ");
                    stringBuilder.append(hs.aq(16777215, -1748040258));
                    stringBuilder.append(stringBuilder2);
                    bi(str, stringBuilder.toString(), 15, i, i2, i3, (byte) 1);
                }
                bp(stringBuilder2, 1941768861);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("fu.bx(");
            stringBuilder4.append(')');
            throw mv.aq(e, stringBuilder4.toString());
        }
    }

    public void bz(int i) {
        int i2 = 0;
        while (i2 < this.bc * -1494278369) {
            try {
                if (ak.by(this.bv[i2].ar * -1484618507, -1958181988)) {
                    if (i2 < (this.bc * -1494278369) - 1) {
                        int i3 = i2;
                        while (i3 < (this.bc * -1494278369) - 1) {
                            int i4 = i3 + 1;
                            bf(i3, i4, 2078496375);
                            i3 = i4;
                        }
                    }
                    i2--;
                    this.bc -= 849583327;
                }
                i2++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fu.bz(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        aj(-1679882261);
    }

    /* Access modifiers changed, original: 0000 */
    public void ca() {
        if (io.ar == client.bh.ad && ((dt.gz((byte) 113) && this.bc * -1494278369 > 2 && !be(33858881) && !bj(-396985267)) || ap(br((byte) -1), -711306563))) {
            client.bh.an(io.al, -2043948702);
        }
        if (io.ar == client.bh.ad) {
            if (this.bc * -1494278369 > 0) {
                as(br((byte) -1), 679225932);
            }
            client.bh.an(io.ax, -2049008334);
        } else if (io.al != client.bh.ad && io.aj != client.bh.ad) {
        } else {
            if (this.bc * -1494278369 > 0) {
                al(client.bh.am[0], client.bh.ak[0], (byte) 1);
            } else {
                client.bh.an(io.ax, -2069148766);
            }
        }
    }

    public void cb(boolean z, int i) {
        try {
            this.ah = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cc(boolean z, byte b) {
        try {
            this.cj = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cd() {
        ai((this.bo * -2107401557) - ((this.bf * -250428839) / 2), (this.bl * 1607806514) - ((this.bb * -682781883) / 2), -1967016522);
    }

    public boolean ce(int i) {
        try {
            return this.ah;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ce(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cf(int i, int i2) {
        int i3;
        int al;
        int i4 = 0;
        int al2 = this.aw.al(go.gb);
        for (i3 = 0; i3 < this.bc * -1494278369; i3++) {
            al = this.aw.al(at(i3, (byte) -76));
            if (al > al2) {
                al2 = al;
            }
        }
        al = al2 + (this.aa * 1102791510);
        int i5 = (((this.bc * -1494278369) + 1) * (this.ac * 980276483)) + 7;
        al2 = i - (al / 2);
        if (al2 + al > hl.tk * 1350811837) {
            al2 = (hl.tk * 1350811837) - al;
        }
        if (al2 < 0) {
            al2 = 0;
        }
        i3 = i2 + i5 > jw.tx * -1083397279 ? (jw.tx * -1083397279) - i5 : i2;
        if (i3 >= 0) {
            i4 = i3;
        }
        this.bo = al2 * 629116931;
        this.bl = -1486928675 * i4;
        this.bf = 1094739433 * al;
        this.bb = 716375949 * i5;
    }

    /* Access modifiers changed, original: 0000 */
    public void cg(int i, int i2) {
        int i3;
        int al;
        int i4 = 0;
        int al2 = this.aw.al(go.gb);
        for (i3 = 0; i3 < this.bc * -1494278369; i3++) {
            al = this.aw.al(at(i3, (byte) -64));
            if (al > al2) {
                al2 = al;
            }
        }
        al = al2 + (this.aa * 1102791510);
        int i5 = (((this.bc * -1494278369) + 1) * (this.ac * 360736406)) + 7;
        al2 = i - (al / 2);
        if (al2 + al > hl.tk * -455418685) {
            al2 = (hl.tk * 1350811837) - al;
        }
        if (al2 < 0) {
            al2 = 0;
        }
        i3 = i2 + i5 > jw.tx * 1110704524 ? (jw.tx * 652297643) - i5 : i2;
        if (i3 >= 0) {
            i4 = i3;
        }
        this.bo = al2 * 2143697261;
        this.bl = -1648852093 * i4;
        this.bf = 1934876540 * al;
        this.bb = 410724371 * i5;
    }

    /* Access modifiers changed, original: 0000 */
    public void ch(int i, int i2) {
        int i3;
        int al;
        int i4 = 0;
        int al2 = this.aw.al(go.gb);
        for (i3 = 0; i3 < this.bc * -1494278369; i3++) {
            al = this.aw.al(at(i3, (byte) -51));
            if (al > al2) {
                al2 = al;
            }
        }
        al = al2 + (this.aa * 1102791510);
        int i5 = (((this.bc * -1494278369) + 1) * (this.ac * 980276483)) + 7;
        al2 = i - (al / 2);
        if (al2 + al > hl.tk * 1350811837) {
            al2 = (hl.tk * 1350811837) - al;
        }
        if (al2 < 0) {
            al2 = 0;
        }
        i3 = i2 + i5 > jw.tx * -1083397279 ? (jw.tx * -1083397279) - i5 : i2;
        if (i3 >= 0) {
            i4 = i3;
        }
        this.bo = al2 * 629116931;
        this.bl = -1486928675 * i4;
        this.bf = 1094739433 * al;
        this.bb = 716375949 * i5;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ci(int i) {
        try {
            return this.ah || client.bh.ba(81, -1620542321);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.ci(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cj(int i) {
        try {
            if (this.bi) {
                this.bi = false;
                client.bh.an(io.ax, -2135662995);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ck(int i, int i2) {
        ai(i, i2, -2044857218);
        bh.es(i, i2, 989209489);
        this.bi = true;
        client.bh.an(io.al, -2085691452);
    }

    /* Access modifiers changed, original: 0000 */
    public void cl() {
        ai((this.bo * -2107401557) - ((this.bf * -250428839) / 2), (this.bl * -1793346699) - ((this.bb * -682781883) / 2), -1784022166);
    }

    public void cm(fb fbVar, int i) {
        try {
            this.bu = fbVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean cn(int i) {
        try {
            return this.bg;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void co(int i, int i2) {
        ai(i, i2, -2145768376);
        bh.es(i, i2, 1866109867);
        this.bi = true;
        client.bh.an(io.al, -2106684386);
    }

    public void cp(boolean z, int i) {
        try {
            this.bx = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cp(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cq(fb fbVar, byte b) {
        try {
            this.bw = fbVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void cr() {
        am(-564452847);
        if (client.bh.ad != io.ad) {
            if (!this.bd) {
                client.bh.ab(-1066048880);
            } else {
                return;
            }
        }
        bh(846209629);
        if (!dq.gy(184951167) && !ja.gd(-774745629)) {
            if (this.bi) {
                aq(2131689564);
                return;
            }
            int br = br((byte) -1);
            boolean z = false;
            if (client.bh.ad == io.ae && br >= 0) {
                fc fcVar = this.bv[br];
                int i = fcVar.ar * -1484618507;
                if (678150384 == i || 40 == i || i == 255691782 || 42 == i || i == 730659175 || i == -1059507648 || 34 == i || i == 35 || i == 36 || i == -2083226978 || 38 == i || ce.cn == i) {
                    z = an.gt(fcVar.aq * -1472852022, fcVar.ad * 413143603, 1389781645);
                }
            }
            if (!z) {
                ar(-2131990257);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cs(int i) {
        try {
            if (this.cv * -8607437 >= 0) {
                ee[] au = gq.au(this.cm, this.cv * -8607437, -1322792631);
                if (au != null || this.cv * -8607437 < 0) {
                    this.by = au;
                    this.cv = 906003973;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ct(int i, int i2) {
        ai(i, i2, -1900178821);
        bh.es(i, i2, 1501028390);
        this.bi = true;
        client.bh.an(io.al, -2063028306);
    }

    /* Access modifiers changed, original: 0000 */
    public void cu(int i, int i2) {
        ai(i, i2, -1889902604);
        bh.es(i, i2, -2104285925);
        this.bi = true;
        client.bh.an(io.al, -2077509146);
    }

    public boolean cv(byte b) {
        try {
            return this.bi;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cv(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void cw(boolean z, int i) {
        try {
            this.bg = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cx() {
        if (io.ar == client.bh.ad && ((dt.gz((byte) 67) && this.bc * 50955271 > 2 && !be(33858881) && !bj(-396985267)) || ap(br((byte) -1), -399374890))) {
            client.bh.an(io.al, -2028766543);
        }
        if (io.ar == client.bh.ad) {
            if (this.bc * 704421380 > 0) {
                as(br((byte) -1), 679225932);
            }
            client.bh.an(io.ax, -2106588104);
        } else if (io.al != client.bh.ad && io.aj != client.bh.ad) {
        } else {
            if (this.bc * -1944099764 > 0) {
                al(client.bh.am[0], client.bh.ak[0], (byte) 1);
            } else {
                client.bh.an(io.ax, -2117318470);
            }
        }
    }

    public void cy(int i, boolean z, byte b) {
        try {
            this.cv = -906003973 * i;
            this.bp = z;
            cs(1663821808);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fu.cy(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void cz() {
        ai((this.bo * -2107401557) - ((this.bf * -250428839) / 2), (this.bl * -1793346699) - ((this.bb * -682781883) / 2), -1910753024);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean da(int i, int i2, int i3) {
        return client.bh.ad != io.al && i > this.bo * 616245559 && i < (this.bo * -2107401557) + (this.bf * -1468336408) && i2 >= i3 && i2 <= ((this.ac * 201564285) + i3) - 1;
    }

    /* Access modifiers changed, original: final */
    public final void db(int i) {
        if (i >= 0) {
            ag(this.bv[i], client.bh.ai[0], client.bh.ae[0], -719133820);
        }
    }

    /* Access modifiers changed, original: final */
    public final void dc(int i) {
        if (i >= 0) {
            ag(this.bv[i], client.bh.ai[0], client.bh.ae[0], -719133820);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dd(int i, int i2) {
        if (this.bi) {
            int i3 = 0;
            while (i3 < this.bc * -1494278369) {
                if (ak(i, i2, (((this.ac * 980276483) + (this.bl * -1793346699)) + 3) + ((this.ac * 980276483) * (((this.bc * -1494278369) - 1) - i3)), 1318410287)) {
                    break;
                }
                i3++;
            }
            i3 = -1;
            if (-1 != i3) {
                as(i3, 679225932);
            }
            cj(1118579969);
            bk(-1976119261);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean de(int i, int i2) {
        return (i == -1 || i2 == -1) ? false : i < (this.bo * 1465749595) + -10 ? true : i > ((this.bf * -250428839) + (this.bo * -2107401557)) + 10 ? true : i2 < (this.bl * 1557263309) + -10 ? true : i2 > ((this.bb * -682781883) + (this.bl * -1793346699)) + 10;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean df(int i, int i2, int i3) {
        return client.bh.ad != io.al && i > this.bo * -2107401557 && i < (this.bo * -2107401557) + (this.bf * -284002531) && i2 >= i3 && i2 <= ((this.ac * 790445062) + i3) - 1;
    }

    public void dg(int i, int i2, int i3, int i4) {
        al ar = gi.ar(i, i2, -1201935479);
        if (!(ar == null || ar.ee == null)) {
            il ilVar = new il();
            ilVar.ar = ar;
            ilVar.ad = ar.ee;
            dm.ad(ilVar, 2001407361);
        }
        this.ab = 710618543 * i4;
        this.af = true;
        this.ay = 253321089 * i;
        this.an = 1345222505 * i2;
        this.av = 1832640157 * i3;
        da.gk(ar, (byte) 2);
    }

    /* Access modifiers changed, original: final */
    public final boolean dh(int i) {
        if (i < 0) {
            return false;
        }
        int i2 = this.bv[i].ar * -1484618507;
        if (i2 >= 2000) {
            i2 -= 2000;
        }
        return i2 == 1007;
    }

    /* Access modifiers changed, original: 0000 */
    public void di() {
        this.bt -= 1578889899;
    }

    public void dj() {
        if (this.af) {
            al ar = gi.ar(this.ay * -1012473727, this.an * 2133166297, -1201935479);
            if (!(ar == null || ar.ew == null)) {
                il ilVar = new il();
                ilVar.ar = ar;
                ilVar.ad = ar.ew;
                dm.ad(ilVar, 19631766);
            }
            this.af = false;
            da.gk(ar, (byte) 2);
        }
    }

    public void dk(int i, int i2, int i3, int i4) {
        al ar = gi.ar(i, i2, -1201935479);
        if (!(ar == null || ar.ee == null)) {
            il ilVar = new il();
            ilVar.ar = ar;
            ilVar.ad = ar.ee;
            dm.ad(ilVar, 1164518979);
        }
        this.ab = 710618543 * i4;
        this.af = true;
        this.ay = 253321089 * i;
        this.an = 1345222505 * i2;
        this.av = 1114846553 * i3;
        da.gk(ar, (byte) 2);
    }

    /* Access modifiers changed, original: 0000 */
    public void dl() {
        this.bt -= 1478579716;
    }

    /* Access modifiers changed, original: 0000 */
    public void dm(int i, int i2) {
        if (this.bi) {
            int i3 = 0;
            while (i3 < this.bc * 554156598) {
                if (ak(i, i2, (((this.ac * 12494599) + (this.bl * -694907117)) + 3) + ((this.ac * 980276483) * (((this.bc * -1494278369) - 1) - i3)), 2073799544)) {
                    break;
                }
                i3++;
            }
            i3 = -1;
            if (-1 != i3) {
                as(i3, 679225932);
            }
            cj(1663514639);
            bk(-944035662);
        }
    }

    /* Access modifiers changed, original: final */
    public final void dn(fc fcVar, int i, int i2) {
        String str = fcVar.aj;
        String str2 = fcVar.ai;
        int i3 = fcVar.ar * -1484618507;
        cy.fw(fcVar.ad * -193944913, fcVar.aq * 595563667, i3, fcVar.al * 1992577767, str, str2, i, i2, 2077476809);
        if (fo.ad(i3, 1124324808)) {
            bs(i, i2, true, str2, str, -578497507);
        }
        client.bh.an(io.ax, -2116100856);
    }

    /* renamed from: do */
    public void m216do() {
        for (int i = 0; i < 8; i++) {
            this.bm[i] = null;
            this.bq[i] = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void dp(fc fcVar, int i, int i2) {
        String str = fcVar.aj;
        String str2 = fcVar.ai;
        int i3 = fcVar.ar * 37013531;
        cy.fw(fcVar.ad * 1454050944, fcVar.aq * -413831872, i3, fcVar.al * 1408235657, str, str2, i, i2, 1371709930);
        if (fo.ad(i3, 1713123867)) {
            bs(i, i2, true, str2, str, -748075476);
        }
        client.bh.an(io.ax, -2061197116);
    }

    public void dq() {
        for (int i = 0; i < 8; i++) {
            this.bm[i] = null;
            this.bq[i] = false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean dr(int i, int i2, int i3) {
        return client.bh.ad != io.al && i > this.bo * 267768193 && i < (this.bo * -2107401557) + (this.bf * -250428839) && i2 >= i3 && i2 <= ((this.ac * 980276483) + i3) - 1;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ds(int i, int i2) {
        return (i == -1 || i2 == -1) ? false : i < (this.bo * 381657776) + -10 ? true : i > ((this.bf * -250428839) + (this.bo * -2107401557)) + 10 ? true : i2 < (this.bl * 1955958605) + -10 ? true : i2 > ((this.bb * -531262701) + (this.bl * -1793346699)) + 10;
    }

    /* Access modifiers changed, original: 0000 */
    public void dt(int i, int i2) {
        if (this.bi) {
            int i3 = 0;
            while (i3 < this.bc * -1494278369) {
                if (ak(i, i2, (((this.ac * 980276483) + (this.bl * -1793346699)) + 3) + ((this.ac * 980276483) * (((this.bc * -1494278369) - 1) - i3)), 2063654857)) {
                    break;
                }
                i3++;
            }
            i3 = -1;
            if (-1 != i3) {
                as(i3, 679225932);
            }
            cj(1653686018);
            bk(-2089581109);
        }
    }

    /* Access modifiers changed, original: final */
    public final void du(fc fcVar, int i, int i2) {
        String str = fcVar.aj;
        String str2 = fcVar.ai;
        int i3 = fcVar.ar * -1484618507;
        cy.fw(fcVar.ad * 2094723706, fcVar.aq * 595563667, i3, fcVar.al * -967060996, str, str2, i, i2, 528843251);
        if (fo.ad(i3, 668242981)) {
            bs(i, i2, true, str2, str, -926460969);
        }
        client.bh.an(io.ax, -2116500944);
    }

    /* Access modifiers changed, original: 0000 */
    public void dv() {
        this.bt += 174568130;
    }

    public void dw(int i, int i2, int i3, int i4) {
        al ar = gi.ar(i, i2, -1201935479);
        if (!(ar == null || ar.ee == null)) {
            il ilVar = new il();
            ilVar.ar = ar;
            ilVar.ad = ar.ee;
            dm.ad(ilVar, -770879601);
        }
        this.ab = 710618543 * i4;
        this.af = true;
        this.ay = 253321089 * i;
        this.an = 1345222505 * i2;
        this.av = 1832640157 * i3;
        da.gk(ar, (byte) 2);
    }

    public void dx(int i, String str, int i2) {
        boolean z = true;
        if (i >= 1 && i <= 8) {
            if (str.equalsIgnoreCase("null")) {
                str = null;
            }
            int i3 = i - 1;
            this.bm[i3] = str;
            boolean[] zArr = this.bq;
            if (i2 != 0) {
                z = false;
            }
            zArr[i3] = z;
        }
    }

    public void dy() {
        for (int i = 0; i < 8; i++) {
            this.bm[i] = null;
            this.bq[i] = false;
        }
    }

    public void dz() {
        if (this.af) {
            al ar = gi.ar(this.ay * -1012473727, this.an * 2133166297, -1201935479);
            if (!(ar == null || ar.ew == null)) {
                il ilVar = new il();
                ilVar.ar = ar;
                ilVar.ad = ar.ew;
                dm.ad(ilVar, -930439103);
            }
            this.af = false;
            da.gk(ar, (byte) 2);
        }
    }

    public boolean ea() {
        return this.af;
    }

    public int eb() {
        return this.ab * 1703827169;
    }

    public boolean ec() {
        return this.af;
    }

    public int ed() {
        return this.ay * -1012473727;
    }

    public int ee() {
        return this.an * 1918259327;
    }

    /* Access modifiers changed, original: 0000 */
    public String ef(int i) {
        if (i < 0) {
            return "";
        }
        fc fcVar = this.bv[i];
        if (fcVar.ai.length() <= 0) {
            return fcVar.aj;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fcVar.aj);
        stringBuilder.append(go.gq);
        stringBuilder.append(fcVar.ai);
        return stringBuilder.toString();
    }

    public int eg() {
        return this.ay * -1012473727;
    }

    public boolean eh() {
        return this.af;
    }

    public void ei(boolean z) {
        this.af = z;
    }

    public void ej(int i, int i2, boolean z) {
        bs(i, i2, z, null, null, -441801897);
    }

    public boolean ek() {
        return this.af;
    }

    public int el() {
        return this.ab * 1795836239;
    }

    public void em(es esVar) {
        esVar.al(-2107401557 * this.bo, -1216057982 * this.bl, -250428839 * this.bf, -682781883 * this.bb, 84208761 * this.ag, (byte) 1);
        esVar.al((this.bo * -2107401557) + 1, (this.bl * 663607068) + 1, (this.bf * 69693623) - 2, (this.ac * 980276483) + 1, 0, (byte) 1);
        esVar.em((this.bo * 1903515461) + 1, (this.bl * -1793346699) + ((this.ac * 603137790) + 3), (this.bf * 898105430) - 2, (this.bb * -682781883) - ((this.ac * 980276483) + 4), -400287944, -1992535637);
        int i = this.ao ? this.aw.as : 0;
        this.aw.ak(go.gb, (this.bo * -2107401557) + 3, (((this.ac * 980276483) - 1) + (this.bl * -812119050)) - i, this.ag * 84208761, -1, esVar);
        int i2 = client.bh.am[0];
        int i3 = client.bh.ak[0];
        for (int i4 = 0; i4 < this.bc * -666946818; i4++) {
            int i5;
            int i6;
            int i7 = (((this.bl * -1793346699) + (this.ac * 1400975552)) + 3) + ((this.ac * 107097331) * (((this.bc * -1680775232) - 1) - i4));
            boolean ak = ak(i2, i3, i7, 1446069038);
            if (this.ao) {
                if (ak) {
                    esVar.al((this.bo * -2107401557) + 2, ((this.bl * -1738839177) + ((this.ac * 980276483) * ((this.bc * -819826538) - i4))) + 3, (this.bf * 886346196) - 4, 1628052694 * this.ac, 1776102730 * this.au, (byte) 1);
                } else if (i4 % 2 == 1) {
                    esVar.al((this.bo * 1235022052) + 2, ((this.bl * 92534749) + ((this.ac * 104758044) * ((this.bc * -1494278369) - i4))) + 3, (this.bf * -250428839) - 4, -1211780905 * this.ac, -1226404516 * this.ap, (byte) 1);
                }
            }
            if (ak) {
                i5 = this.ax;
                i6 = -348477425;
            } else {
                i5 = 1802289958;
                i6 = this.az;
            }
            this.aw.ak(at(i4, (byte) -117), (this.aa * 960400820) + (this.bo * -2107401557), (((this.ac * 558732195) + i7) - 1) - i, i5 * i6, 0, esVar);
        }
        aj.ft(this.bo * -737895439, this.bl * -1793346699, this.bf * -250428839, this.bb * 1094062746, (byte) 18);
    }

    public void en(boolean z) {
        this.af = z;
    }

    public void eo(String str, String str2) {
        this.at = str;
        this.bk = str2;
    }

    public void ep(es esVar) {
        esVar.al(1127616665 * this.bo, -1793346699 * this.bl, -250428839 * this.bf, -682781883 * this.bb, 84208761 * this.ag, (byte) 1);
        esVar.al((this.bo * -2107401557) + 1, (this.bl * -1793346699) + 1, (this.bf * -250428839) - 2, (this.ac * -841536691) + 1, 0, (byte) 1);
        esVar.em((this.bo * -1434922170) + 1, (this.bl * -895048429) + ((this.ac * 980276483) + 3), (this.bf * -250428839) - 2, (this.bb * -682781883) - ((this.ac * -514134659) + 4), ViewCompat.MEASURED_STATE_MASK, 77950090);
        int i = this.ao ? this.aw.as : 0;
        this.aw.ak(go.gb, (this.bo * 5678682) + 3, (((this.ac * 980276483) - 1) + (this.bl * -1793346699)) - i, this.ag * 84208761, -1, esVar);
        int i2 = client.bh.am[0];
        int i3 = client.bh.ak[0];
        for (int i4 = 0; i4 < this.bc * -129096652; i4++) {
            int i5;
            int i6;
            int i7 = (((this.bl * -1793346699) + (this.ac * -440435924)) + 3) + ((this.ac * -703071025) * (((this.bc * 1507605296) - 1) - i4));
            boolean ak = ak(i2, i3, i7, 1528009954);
            if (this.ao) {
                if (ak) {
                    esVar.al((this.bo * -2107401557) + 2, ((this.bl * -896447419) + ((this.ac * 980276483) * ((this.bc * -607075900) - i4))) + 3, (this.bf * -2070428608) - 4, 1775895765 * this.ac, -1314965785 * this.au, (byte) 1);
                } else if (i4 % 2 == 1) {
                    esVar.al((this.bo * 538495877) + 2, ((this.bl * -1793346699) + ((this.ac * 1966231901) * ((this.bc * -336197391) - i4))) + 3, (this.bf * -250428839) - 4, 1065031141 * this.ac, 1783679313 * this.ap, (byte) 1);
                }
            }
            if (ak) {
                i5 = this.ax;
                i6 = -1698345779;
            } else {
                i5 = 1060487525;
                i6 = this.az;
            }
            this.aw.ak(at(i4, (byte) -110), (this.aa * -706546058) + (this.bo * 2011670757), (((this.ac * 980276483) + i7) - 1) - i, i5 * i6, 0, esVar);
        }
        aj.ft(this.bo * -2107401557, this.bl * -1129178898, this.bf * -250428839, this.bb * -682781883, (byte) 18);
    }

    public void eq(String str, String str2) {
        this.at = str;
        this.bk = str2;
    }

    public int er() {
        return this.an * 2133166297;
    }

    /* Access modifiers changed, original: 0000 */
    public void es(int i, int i2, boolean z, String str, String str2) {
        this.br = -842538787 * i;
        this.be = -497894879 * i2;
        this.bz = z;
        this.bt = 0;
        this.bj = str;
        this.bh = str2;
    }

    public void et(String str, String str2) {
        this.at = str;
        this.bk = str2;
    }

    public int eu() {
        return this.an * 2133166297;
    }

    public int ev() {
        return this.ab * 1795836239;
    }

    public int ew() {
        return this.an * 2133166297;
    }

    /* Access modifiers changed, original: 0000 */
    public void ex() {
        ic.fx(this.bo * -2107401557, this.bl * -1793346699, this.bf * -250428839, this.bb * -682781883, 2035013451);
    }

    public void ey(boolean z) {
        this.af = z;
    }

    public void ez(String str, String str2) {
        this.at = str;
        this.bk = str2;
    }

    /* Access modifiers changed, original: 0000 */
    public void fb(ih ihVar, int i, int i2) {
        int ev = ig.ev(-255991795);
        for (int i3 = 0; i3 < ev; i3++) {
            ih eb = an.eb(fk.ep(i3, 269440315), (byte) 57);
            if (eb != null && ihVar != eb && eb.ad.ae * -735434895 == 1 && ihVar.bq * -1444273727 == eb.bq * -1444273727 && ihVar.bd * -1690563339 == eb.bd * -1690563339) {
                bg(eb.ad, fk.ep(i3, -291876496), i, i2, -1764144882);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fc(ih ihVar, int i, int i2) {
        int ev = ig.ev(-1281591300);
        for (int i3 = 0; i3 < ev; i3++) {
            ih eb = an.eb(fk.ep(i3, -1679482517), (byte) 2);
            if (eb != null && ihVar != eb && eb.ad.ae * 671963496 == 1 && ihVar.bq * 199346679 == eb.bq * -1837892171 && ihVar.bd * -1690563339 == eb.bd * -1690563339) {
                bg(eb.ad, fk.ep(i3, -1895285164), i, i2, -2098881772);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fe(int i, int i2) {
        fc fcVar = this.bv[i];
        this.bv[i] = this.bv[i2];
        this.bv[i2] = fcVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void fg(es esVar, int i) {
        if (this.cj && this.bh != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.bh);
            if (this.bj != null && this.bj.length() > 0) {
                stringBuilder.append(go.gq);
                stringBuilder.append(this.bj);
                stringBuilder.append(iz.am);
            }
            String stringBuilder2 = stringBuilder.toString();
            int i2 = this.br;
            int al = this.aw.al(stringBuilder2);
            int i3 = this.br * 126724567 > (esVar.aq * 1462922907) / 2 ? (((this.br * 1832578073) - i) - 8) - al : ((i2 * 209599850) + i) + 8;
            if (this.bp) {
                int i4 = 255;
                if (this.bt * 876106439 > this.bn * 728835117) {
                    i4 = 255 - (((this.bt * -1075100598) - (this.bn * -1956245082)) / (this.bn * 1457670234));
                }
                esVar.ef(i3 - 5, (this.be * -471282141) - 8, al + 10, this.aw.ae + 10, 0, i4, 2065869650);
                esVar.ar(i3 - 4, (this.be * -162410149) - 7, al + 8, this.aw.ae + 8, 1655199212, i4, (byte) 15);
                this.aw.as(stringBuilder2, i3, (this.be * -1655223839) + (this.aw.ae / 2), 539385612, 0, i4, esVar);
                return;
            }
            esVar.em(i3 - 5, (this.be * -1655223839) - 8, al + 10, this.aw.ae + 10, 0, 1238181428);
            esVar.al(i3 - 4, (this.be * -1655223839) - 7, al + 8, this.aw.ae + 8, 6710886, (byte) 1);
            this.aw.ak(stringBuilder2, i3, (this.aw.ae / 2) + (this.be * 675014654), 16777215, 0, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fh(es esVar, int i) {
        if (this.cj && this.bh != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.bh);
            if (this.bj != null && this.bj.length() > 0) {
                stringBuilder.append(go.gq);
                stringBuilder.append(this.bj);
                stringBuilder.append(iz.am);
            }
            String stringBuilder2 = stringBuilder.toString();
            int i2 = this.br;
            int al = this.aw.al(stringBuilder2);
            int i3 = this.br * -2065303691 > (esVar.aq * 668851031) / 2 ? (((this.br * -643607445) - i) - 8) - al : ((i2 * 1908829034) + i) + 8;
            if (this.bp) {
                int i4 = 255;
                if (this.bt * -1635701831 > this.bn * 728835117) {
                    i4 = 255 - (((this.bt * 1669956629) - (this.bn * -1979549342)) / (this.bn * 1457670234));
                }
                esVar.ef(i3 - 5, (this.be * 2077130201) - 8, al + 10, this.aw.ae + 10, 0, i4, 1083381606);
                esVar.ar(i3 - 4, (this.be * -1655223839) - 7, al + 8, this.aw.ae + 8, 6710886, i4, (byte) 15);
                this.aw.as(stringBuilder2, i3, (this.be * -985879017) + (this.aw.ae / 2), 16777215, 0, i4, esVar);
                return;
            }
            esVar.em(i3 - 5, (this.be * -933465138) - 8, al + 10, this.aw.ae + 10, 0, -552486580);
            esVar.al(i3 - 4, (this.be * -1655223839) - 7, al + 8, this.aw.ae + 8, 6710886, (byte) 1);
            this.aw.ak(stringBuilder2, i3, (this.aw.ae / 2) + (this.be * -972265801), 16777215, 0, esVar);
        }
    }

    public final void fi(int i, int i2, int i3, int i4) {
        if (client.ky * -82596523 == 0 && !this.af) {
            bi(go.ga, "", 23, 0, i - i3, i2 - i4, (byte) 1);
        }
        if (ca.aa(i - i3, i2 - i4, 782696153)) {
            int ap;
            int i5;
            this.bd = false;
            long j = -1;
            long j2 = -1;
            for (int i6 = 0; i6 < at.ad(-1603307806); i6++) {
                long j3;
                long al = el.al(i6, 1569171858);
                if (j != al) {
                    String str;
                    StringBuilder stringBuilder;
                    long j4;
                    int aj = if.aj(i6, (byte) 43);
                    int ae = ac.ae(i6, -166536846);
                    int ak = ea.ak(i6, 2130903186);
                    ap = ep.ap(i6, (byte) -93);
                    if (2 == ak && aj.fq(aj, ae, al)) {
                        dx aq = aj.aq(ap, -855217838);
                        if (aq.bw != null) {
                            aq = aq.ap(-2103126261);
                        }
                        if (aq != null) {
                            if (1 == client.ky * -82596523) {
                                str = go.ge;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(client.it);
                                stringBuilder.append(" ");
                                stringBuilder.append(iz.ai);
                                stringBuilder.append(" ");
                                stringBuilder.append(hs.aq(SupportMenu.USER_MASK, 367138639));
                                stringBuilder.append(aq.ap);
                                bi(str, stringBuilder.toString(), 1, ap, aj, ae, (byte) 1);
                            } else if (!this.af) {
                                String[] strArr = aq.bs;
                                if (strArr != null) {
                                    int i7 = 4;
                                    while (i7 >= 0) {
                                        if (strArr[i7] != null) {
                                            i5 = i7 == 0 ? 3 : 0;
                                            if (i7 == 1) {
                                                i5 = 4;
                                            }
                                            if (2 == i7) {
                                                i5 = 5;
                                            }
                                            if (3 == i7) {
                                                i5 = 6;
                                            }
                                            if (4 == i7) {
                                                i5 = 1001;
                                            }
                                            str = strArr[i7];
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(SupportMenu.USER_MASK, -112064367));
                                            stringBuilder.append(aq.ap);
                                            bi(str, stringBuilder.toString(), i5, ap, aj, ae, (byte) 1);
                                        }
                                        i7--;
                                    }
                                }
                                dx dxVar = aq;
                                String str2 = go.gz;
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(hs.aq(SupportMenu.USER_MASK, 1011560879));
                                stringBuilder2.append(dxVar.ap);
                                bi(str2, stringBuilder2.toString(), 1002, 144682743 * dxVar.ak, aj, ae, (byte) 1);
                            } else if (4 == ((this.av * 549558197) & 4)) {
                                str = this.at;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(this.bk);
                                stringBuilder.append(" ");
                                stringBuilder.append(iz.ai);
                                stringBuilder.append(" ");
                                stringBuilder.append(hs.aq(SupportMenu.USER_MASK, -1361599859));
                                stringBuilder.append(aq.ap);
                                bi(str, stringBuilder.toString(), 2, ap, aj, ae, (byte) 1);
                            }
                        }
                        j = al;
                    }
                    if (ak == 1) {
                        iq eb = an.eb(ap, (byte) 120);
                        if (eb != null) {
                            if (1 == eb.ad.ae * -735434895 && ((eb.bq * -1444273727) & 127) == 64 && 64 == ((eb.bd * -1690563339) & 127)) {
                                bo(eb, aj, ae, -1208104264);
                                bl(eb, aj, ae, 1269264606);
                            }
                            bg(eb.ad, ap, aj, ae, -1812115575);
                        }
                        j = al;
                    }
                    if (ak == 0) {
                        hv hvVar = client.jz[ap];
                        if (hvVar != null) {
                            if (64 == ((hvVar.bq * -1444273727) & 127) && 64 == ((hvVar.bd * -1690563339) & 127)) {
                                bo(hvVar, aj, ae, -1547852517);
                                bl(hvVar, aj, ae, 786411406);
                            }
                            if (ap != dx.em((byte) -50)) {
                                bx(hvVar, ap, aj, ae, -93361934);
                                j4 = j2;
                            } else {
                                j4 = al;
                            }
                        }
                        j = al;
                    } else {
                        j4 = j2;
                    }
                    if (3 == ak) {
                        fy ef = fe.ef(am.jy * 1973701849, aj, ae, 2138199462);
                        if (ef != null) {
                            for (ja jaVar = (ja) ef.am(); jaVar != null; jaVar = (ja) ef.as()) {
                                dh aq2 = gl.aq(jaVar.ad * -1830817693, -2107680624);
                                if (client.ky * -82596523 == 1) {
                                    str = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(client.it);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(iz.ai);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(hs.aq(16748608, -596475807));
                                    stringBuilder.append(aq2.ao);
                                    bi(str, stringBuilder.toString(), 16, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                } else if (!this.af) {
                                    String[] strArr2 = aq2.bo;
                                    int i8 = 4;
                                    while (i8 >= 0) {
                                        if (strArr2 != null && strArr2[i8] != null) {
                                            i5 = i8 == 0 ? 18 : 0;
                                            if (1 == i8) {
                                                i5 = 19;
                                            }
                                            if (i8 == 2) {
                                                i5 = 20;
                                            }
                                            if (3 == i8) {
                                                i5 = 21;
                                            }
                                            if (4 == i8) {
                                                i5 = 22;
                                            }
                                            str = strArr2[i8];
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(16748608, 1173773414));
                                            stringBuilder.append(aq2.ao);
                                            bi(str, stringBuilder.toString(), i5, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                        } else if (2 == i8) {
                                            str = go.aq;
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(16748608, -2003365457));
                                            stringBuilder.append(aq2.ao);
                                            bi(str, stringBuilder.toString(), 20, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                        }
                                        aq2 = aq2;
                                        i8--;
                                    }
                                    str = go.gz;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(hs.aq(16748608, 1884451514));
                                    stringBuilder.append(aq2.ao);
                                    bi(str, stringBuilder.toString(), 1004, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                } else if (((this.av * 549558197) & 1) == 1) {
                                    str = this.at;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(this.bk);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(iz.ai);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(hs.aq(16748608, -1385047925));
                                    stringBuilder.append(aq2.ao);
                                    bi(str, stringBuilder.toString(), 17, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                }
                            }
                        }
                    }
                    j = al;
                    j3 = j4;
                    j2 = j3;
                }
                j3 = j2;
                j2 = j3;
            }
            if (j2 != -1) {
                i5 = ak.ai(j2);
                ap = eq.am(j2);
                int em = dx.em((byte) -80);
                bx(client.jz[em], em, i5, ap, -365285591);
                return;
            }
            return;
        }
        this.bd = true;
    }

    public final void fj(int i, int i2, int i3, int i4) {
        if (client.ky * -82596523 == 0 && !this.af) {
            bi(go.ga, "", 23, 0, i - i3, i2 - i4, (byte) 1);
        }
        if (ca.aa(i - i3, i2 - i4, 782696153)) {
            int ap;
            int i5;
            this.bd = false;
            long j = -1;
            long j2 = -1;
            for (int i6 = 0; i6 < at.ad(-2090500417); i6++) {
                long j3;
                long al = el.al(i6, 1569171858);
                if (j == al) {
                    j3 = j;
                } else {
                    String str;
                    StringBuilder stringBuilder;
                    long j4;
                    int aj = if.aj(i6, (byte) 12);
                    int ae = ac.ae(i6, -166536846);
                    int ak = ea.ak(i6, 2130903186);
                    ap = ep.ap(i6, (byte) -115);
                    if (2 == ak && aj.fq(aj, ae, al)) {
                        dx aq = aj.aq(ap, 1076204713);
                        if (aq.bw != null) {
                            aq = aq.ap(2075928245);
                        }
                        if (aq == null) {
                            j = j2;
                            j3 = al;
                            j2 = j;
                        } else if (1 == client.ky * -82596523) {
                            str = go.ge;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(client.it);
                            stringBuilder.append(" ");
                            stringBuilder.append(iz.ai);
                            stringBuilder.append(" ");
                            stringBuilder.append(hs.aq(SupportMenu.USER_MASK, 2121557196));
                            stringBuilder.append(aq.ap);
                            bi(str, stringBuilder.toString(), 1, ap, aj, ae, (byte) 1);
                        } else if (!this.af) {
                            String[] strArr = aq.bs;
                            if (strArr != null) {
                                int i7 = 4;
                                while (i7 >= 0) {
                                    if (strArr[i7] != null) {
                                        i5 = i7 == 0 ? 3 : 0;
                                        if (i7 == 1) {
                                            i5 = 4;
                                        }
                                        if (2 == i7) {
                                            i5 = 5;
                                        }
                                        if (3 == i7) {
                                            i5 = 6;
                                        }
                                        if (4 == i7) {
                                            i5 = 1001;
                                        }
                                        str = strArr[i7];
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append(hs.aq(1906700817, -246927144));
                                        stringBuilder.append(aq.ap);
                                        bi(str, stringBuilder.toString(), i5, ap, aj, ae, (byte) 1);
                                    }
                                    i7--;
                                }
                            }
                            dx dxVar = aq;
                            String str2 = go.gz;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(hs.aq(2144243086, 376651160));
                            stringBuilder2.append(dxVar.ap);
                            bi(str2, stringBuilder2.toString(), 1002, 144682743 * dxVar.ak, aj, ae, (byte) 1);
                        } else if (4 == ((this.av * 826868278) & 4)) {
                            str = this.at;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(this.bk);
                            stringBuilder.append(" ");
                            stringBuilder.append(iz.ai);
                            stringBuilder.append(" ");
                            stringBuilder.append(hs.aq(SupportMenu.USER_MASK, -621446497));
                            stringBuilder.append(aq.ap);
                            bi(str, stringBuilder.toString(), 2, ap, aj, ae, (byte) 1);
                        }
                    }
                    if (ak == 1) {
                        iq eb = an.eb(ap, (byte) -32);
                        if (eb == null) {
                            j = j2;
                            j3 = al;
                            j2 = j;
                        } else {
                            if (1 == eb.ad.ae * -735434895 && ((eb.bq * -1344240776) & -850922186) == -406333296 && 64 == ((eb.bd * 894733385) & 1056095916)) {
                                bo(eb, aj, ae, -372168307);
                                bl(eb, aj, ae, 1032204319);
                            }
                            bg(eb.ad, ap, aj, ae, -1918318064);
                        }
                    }
                    if (ak == 0) {
                        hv hvVar = client.jz[ap];
                        if (hvVar == null) {
                            j = j2;
                            j3 = al;
                            j2 = j;
                        } else {
                            if (-223396180 == ((hvVar.bq * -202290799) & 127) && 64 == (-1312552079 & (hvVar.bd * -1690563339))) {
                                bo(hvVar, aj, ae, -1341798268);
                                bl(hvVar, aj, ae, 1005148019);
                            }
                            if (ap != dx.em((byte) -78)) {
                                bx(hvVar, ap, aj, ae, -1240340464);
                                j4 = j2;
                            } else {
                                j4 = al;
                            }
                        }
                    } else {
                        j4 = j2;
                    }
                    if (3 == ak) {
                        fy ef = fe.ef(am.jy * 1973701849, aj, ae, 2143911866);
                        if (ef != null) {
                            for (ja jaVar = (ja) ef.am(); jaVar != null; jaVar = (ja) ef.as()) {
                                dh aq2 = gl.aq(jaVar.ad * -1830817693, -2127930717);
                                StringBuilder stringBuilder3;
                                if (client.ky * -872973127 == 1) {
                                    str = go.ge;
                                    stringBuilder3 = new StringBuilder();
                                    stringBuilder3.append(client.it);
                                    stringBuilder3.append(" ");
                                    stringBuilder3.append(iz.ai);
                                    stringBuilder3.append(" ");
                                    stringBuilder3.append(hs.aq(965339392, -2085985443));
                                    stringBuilder3.append(aq2.ao);
                                    bi(str, stringBuilder3.toString(), 16, -1642063969 * jaVar.ad, aj, ae, (byte) 1);
                                } else if (!this.af) {
                                    String[] strArr2 = aq2.bo;
                                    ja jaVar2 = jaVar;
                                    int i8 = 4;
                                    while (i8 >= 0) {
                                        if (strArr2 != null && strArr2[i8] != null) {
                                            i5 = i8 == 0 ? 18 : 0;
                                            if (1 == i8) {
                                                i5 = 19;
                                            }
                                            if (i8 == 2) {
                                                i5 = 20;
                                            }
                                            if (3 == i8) {
                                                i5 = 21;
                                            }
                                            if (4 == i8) {
                                                i5 = 22;
                                            }
                                            str = strArr2[i8];
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(2084969494, -590072163));
                                            stringBuilder.append(aq2.ao);
                                            bi(str, stringBuilder.toString(), i5, 1475118958 * jaVar2.ad, aj, ae, (byte) 1);
                                        } else if (2 == i8) {
                                            str = go.aq;
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(16748608, 41456211));
                                            stringBuilder.append(aq2.ao);
                                            bi(str, stringBuilder.toString(), 20, -1830817693 * jaVar2.ad, aj, ae, (byte) 1);
                                        }
                                        aq2 = aq2;
                                        jaVar2 = jaVar2;
                                        i8--;
                                    }
                                    str = go.gz;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(hs.aq(16748608, 23436641));
                                    stringBuilder.append(aq2.ao);
                                    bi(str, stringBuilder.toString(), -1207586980, -1830817693 * jaVar2.ad, aj, ae, (byte) 1);
                                } else if (((this.av * -179430866) & 1) == 1) {
                                    str = this.at;
                                    stringBuilder3 = new StringBuilder();
                                    stringBuilder3.append(this.bk);
                                    stringBuilder3.append(" ");
                                    stringBuilder3.append(iz.ai);
                                    stringBuilder3.append(" ");
                                    stringBuilder3.append(hs.aq(16748608, 929898151));
                                    stringBuilder3.append(aq2.ao);
                                    bi(str, stringBuilder3.toString(), 17, 1825872431 * jaVar.ad, aj, ae, (byte) 1);
                                }
                            }
                        }
                    }
                    j = j4;
                    j3 = al;
                    j2 = j;
                }
                j = j3;
            }
            if (j2 != -1) {
                i5 = ak.ai(j2);
                ap = eq.am(j2);
                int em = dx.em((byte) 54);
                bx(client.jz[em], em, i5, ap, 542085406);
                return;
            }
            return;
        }
        this.bd = true;
    }

    /* Access modifiers changed, original: 0000 */
    public void fk(int i, int i2) {
        fc fcVar = this.bv[i];
        this.bv[i] = this.bv[i2];
        this.bv[i2] = fcVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void fl(int i, int i2) {
        fc fcVar = this.bv[i];
        this.bv[i] = this.bv[i2];
        this.bv[i2] = fcVar;
    }

    public void fm(es esVar) {
        int i = 0;
        if (client.ip) {
            if (this.bt * 2080788900 < this.bn * 728835117) {
                if (this.cv * -8607437 != -1) {
                    cs(1932009922);
                }
                if (this.by == null) {
                    bq(esVar, 0, -1533396402);
                    return;
                }
                int i2 = this.by[0].aq;
                int length = this.by.length / 2;
                if (this.bz) {
                    i = this.by.length / 2;
                }
                if (this.bp) {
                    int i3 = (this.bt * -492139193) / (this.bn * -758460892);
                    ee eeVar = this.by[i + ((length * (this.bt * -295694822)) / (this.bn * 728835117))];
                    int i4 = (i2 * 3) / 2;
                    esVar.bs(eeVar, ((this.br * 199315676) - i4) + 8, ((this.be * -1655223839) - i4) + 8, 1084393372 - i3, (byte) 7);
                } else {
                    int i5 = (i2 * 3) / 2;
                    esVar.aw(this.by[i + ((length * (this.bt * -1635701831)) / (this.bn * 728835117))], ((this.br * 1945539119) - i5) + 8, ((this.be * -1655223839) - i5) + 8, 16711935);
                }
                bq(esVar, i2, -1082986887);
            } else if (this.bt * -208141535 < this.bn * 1457670234) {
                if (this.by != null) {
                    i = this.by[0].aq;
                }
                bq(esVar, i, -1685849785);
            }
        }
    }

    public void fn(es esVar) {
        int i = 0;
        if (client.ip) {
            if (this.bt * -1635701831 < this.bn * 728835117) {
                if (this.cv * -8607437 != -1) {
                    cs(1675759113);
                }
                if (this.by == null) {
                    bq(esVar, 0, 853893179);
                    return;
                }
                int i2 = this.by[0].aq;
                int length = this.by.length / 2;
                if (this.bz) {
                    i = this.by.length / 2;
                }
                if (this.bp) {
                    int i3 = (this.bt * -492139193) / (this.bn * 728835117);
                    ee eeVar = this.by[i + ((length * (this.bt * -1635701831)) / (this.bn * 728835117))];
                    int i4 = (i2 * 3) / 2;
                    esVar.bs(eeVar, ((this.br * -2065303691) - i4) + 8, ((this.be * -1655223839) - i4) + 8, 255 - i3, (byte) 7);
                } else {
                    int i5 = (i2 * 3) / 2;
                    esVar.aw(this.by[i + ((length * (this.bt * -1635701831)) / (this.bn * 728835117))], ((this.br * -2065303691) - i5) + 8, ((this.be * -1655223839) - i5) + 8, 16711935);
                }
                bq(esVar, i2, -1424820993);
            } else if (this.bt * -1635701831 < this.bn * 1457670234) {
                if (this.by != null) {
                    i = this.by[0].aq;
                }
                bq(esVar, i, 390812266);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fo(ih ihVar, int i, int i2) {
        int i3 = hz.ai;
        int[] iArr = hz.ae;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 < -1076782851 * i3) {
                ih ihVar2 = client.jz[iArr[i5]];
                if (ihVar2 != null && ihVar2 != ihVar && ihVar2.bq * -1444273727 == ihVar.bq * -1444273727 && ihVar.bd * -1690563339 == ihVar2.bd * -1690563339) {
                    bx(ihVar2, iArr[i5], i, i2, -570270144);
                }
                i4 = i5 + 1;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fp(ih ihVar, int i, int i2) {
        int i3 = hz.ai;
        int[] iArr = hz.ae;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 < -1679930490 * i3) {
                ih ihVar2 = client.jz[iArr[i5]];
                if (ihVar2 != null && ihVar2 != ihVar && ihVar2.bq * -1444273727 == ihVar.bq * 244871978 && ihVar.bd * -1690563339 == ihVar2.bd * -1690563339) {
                    bx(ihVar2, iArr[i5], i, i2, -1211429147);
                }
                i4 = i5 + 1;
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fq(int i, int i2, boolean z, String str, String str2) {
        this.br = 1968008432 * i;
        this.be = -497894879 * i2;
        this.bz = z;
        this.bt = 0;
        this.bj = str;
        this.bh = str2;
    }

    /* Access modifiers changed, original: 0000 */
    public void fs(es esVar, int i) {
        if (this.cj && this.bh != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.bh);
            if (this.bj != null && this.bj.length() > 0) {
                stringBuilder.append(go.gq);
                stringBuilder.append(this.bj);
                stringBuilder.append(iz.am);
            }
            String stringBuilder2 = stringBuilder.toString();
            int i2 = this.br;
            int al = this.aw.al(stringBuilder2);
            int i3 = this.br * 43555582 > (esVar.aq * 757488019) / 2 ? (((this.br * -1447978049) - i) - 8) - al : ((i2 * 929213849) + i) + 8;
            if (this.bp) {
                int i4 = 255;
                if (this.bt * -1635701831 > this.bn * 728835117) {
                    i4 = 255 - (((this.bt * -984278386) - (this.bn * -1956245082)) / (this.bn * 1457670234));
                }
                esVar.ef(i3 - 5, (this.be * -1520274009) - 8, al + 10, this.aw.ae + 10, 0, i4, 829538027);
                esVar.ar(i3 - 4, (this.be * -240431343) - 7, al + 8, this.aw.ae + 8, 2118201887, i4, (byte) 15);
                this.aw.as(stringBuilder2, i3, (this.be * 760196909) + (this.aw.ae / 2), 441519209, 0, i4, esVar);
                return;
            }
            esVar.em(i3 - 5, (this.be * -468379087) - 8, al + 10, this.aw.ae + 10, 0, -495743522);
            esVar.al(i3 - 4, (this.be * -1655223839) - 7, al + 8, this.aw.ae + 8, 6710886, (byte) 1);
            this.aw.ak(stringBuilder2, i3, (this.aw.ae / 2) + (this.be * -252315273), 16777215, 0, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ft(int i, int i2, boolean z, String str, String str2) {
        this.br = -842538787 * i;
        this.be = -497894879 * i2;
        this.bz = z;
        this.bt = 0;
        this.bj = str;
        this.bh = str2;
    }

    public final void fu(int i, int i2, int i3, int i4) {
        if (client.ky * -82596523 == 0 && !this.af) {
            bi(go.ga, "", 23, 0, i - i3, i2 - i4, (byte) 1);
        }
        if (ca.aa(i - i3, i2 - i4, 782696153)) {
            int ap;
            int i5;
            this.bd = false;
            long j = -1;
            long j2 = -1;
            for (int i6 = 0; i6 < at.ad(-1341825755); i6++) {
                long j3;
                long al = el.al(i6, 1569171858);
                if (j != al) {
                    String str;
                    StringBuilder stringBuilder;
                    long j4;
                    int aj = if.aj(i6, (byte) 11);
                    int ae = ac.ae(i6, -166536846);
                    int ak = ea.ak(i6, 2130903186);
                    ap = ep.ap(i6, (byte) -84);
                    if (2 == ak && aj.fq(aj, ae, al)) {
                        dx aq = aj.aq(ap, -950593962);
                        if (aq.bw != null) {
                            aq = aq.ap(-514077893);
                        }
                        if (aq != null) {
                            if (1 == client.ky * -82596523) {
                                str = go.ge;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(client.it);
                                stringBuilder.append(" ");
                                stringBuilder.append(iz.ai);
                                stringBuilder.append(" ");
                                stringBuilder.append(hs.aq(SupportMenu.USER_MASK, 1084860420));
                                stringBuilder.append(aq.ap);
                                bi(str, stringBuilder.toString(), 1, ap, aj, ae, (byte) 1);
                            } else if (!this.af) {
                                String[] strArr = aq.bs;
                                if (strArr != null) {
                                    int i7 = 4;
                                    while (i7 >= 0) {
                                        if (strArr[i7] != null) {
                                            i5 = i7 == 0 ? 3 : 0;
                                            if (i7 == 1) {
                                                i5 = 4;
                                            }
                                            if (2 == i7) {
                                                i5 = 5;
                                            }
                                            if (3 == i7) {
                                                i5 = 6;
                                            }
                                            if (4 == i7) {
                                                i5 = 1001;
                                            }
                                            str = strArr[i7];
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(SupportMenu.USER_MASK, -930233509));
                                            stringBuilder.append(aq.ap);
                                            bi(str, stringBuilder.toString(), i5, ap, aj, ae, (byte) 1);
                                        }
                                        i7--;
                                    }
                                }
                                dx dxVar = aq;
                                String str2 = go.gz;
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(hs.aq(SupportMenu.USER_MASK, 1141413447));
                                stringBuilder2.append(dxVar.ap);
                                bi(str2, stringBuilder2.toString(), 1002, 144682743 * dxVar.ak, aj, ae, (byte) 1);
                            } else if (4 == ((this.av * 549558197) & 4)) {
                                str = this.at;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(this.bk);
                                stringBuilder.append(" ");
                                stringBuilder.append(iz.ai);
                                stringBuilder.append(" ");
                                stringBuilder.append(hs.aq(SupportMenu.USER_MASK, -1149564938));
                                stringBuilder.append(aq.ap);
                                bi(str, stringBuilder.toString(), 2, ap, aj, ae, (byte) 1);
                            }
                        }
                        j = al;
                    }
                    if (ak == 1) {
                        iq eb = an.eb(ap, (byte) 59);
                        if (eb != null) {
                            if (1 == eb.ad.ae * -735434895 && ((eb.bq * -1444273727) & 127) == 64 && 64 == ((eb.bd * -1690563339) & 127)) {
                                bo(eb, aj, ae, -1250477354);
                                bl(eb, aj, ae, 1549794801);
                            }
                            bg(eb.ad, ap, aj, ae, -1919268893);
                        }
                        j = al;
                    }
                    if (ak == 0) {
                        hv hvVar = client.jz[ap];
                        if (hvVar != null) {
                            if (64 == ((hvVar.bq * -1444273727) & 127) && 64 == ((hvVar.bd * -1690563339) & 127)) {
                                bo(hvVar, aj, ae, -1691370892);
                                bl(hvVar, aj, ae, -201069104);
                            }
                            if (ap != dx.em((byte) 92)) {
                                bx(hvVar, ap, aj, ae, 621817710);
                                j4 = j2;
                            } else {
                                j4 = al;
                            }
                        }
                        j = al;
                    } else {
                        j4 = j2;
                    }
                    if (3 == ak) {
                        fy ef = fe.ef(am.jy * 1973701849, aj, ae, 2137773951);
                        if (ef != null) {
                            for (ja jaVar = (ja) ef.am(); jaVar != null; jaVar = (ja) ef.as()) {
                                dh aq2 = gl.aq(jaVar.ad * -1830817693, -30550964);
                                if (client.ky * -82596523 == 1) {
                                    str = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(client.it);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(iz.ai);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(hs.aq(16748608, -419877380));
                                    stringBuilder.append(aq2.ao);
                                    bi(str, stringBuilder.toString(), 16, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                } else if (!this.af) {
                                    String[] strArr2 = aq2.bo;
                                    int i8 = 4;
                                    while (i8 >= 0) {
                                        if (strArr2 != null && strArr2[i8] != null) {
                                            i5 = i8 == 0 ? 18 : 0;
                                            if (1 == i8) {
                                                i5 = 19;
                                            }
                                            if (i8 == 2) {
                                                i5 = 20;
                                            }
                                            if (3 == i8) {
                                                i5 = 21;
                                            }
                                            if (4 == i8) {
                                                i5 = 22;
                                            }
                                            str = strArr2[i8];
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(16748608, 1789158203));
                                            stringBuilder.append(aq2.ao);
                                            bi(str, stringBuilder.toString(), i5, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                        } else if (2 == i8) {
                                            str = go.aq;
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(16748608, -437586939));
                                            stringBuilder.append(aq2.ao);
                                            bi(str, stringBuilder.toString(), 20, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                        }
                                        aq2 = aq2;
                                        i8--;
                                    }
                                    str = go.gz;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(hs.aq(16748608, 1186199299));
                                    stringBuilder.append(aq2.ao);
                                    bi(str, stringBuilder.toString(), 1004, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                } else if (((this.av * 549558197) & 1) == 1) {
                                    str = this.at;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(this.bk);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(iz.ai);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(hs.aq(16748608, 961017207));
                                    stringBuilder.append(aq2.ao);
                                    bi(str, stringBuilder.toString(), 17, -1830817693 * jaVar.ad, aj, ae, (byte) 1);
                                }
                            }
                        }
                    }
                    j = al;
                    j3 = j4;
                    j2 = j3;
                }
                j3 = j2;
                j2 = j3;
            }
            if (j2 != -1) {
                i5 = ak.ai(j2);
                ap = eq.am(j2);
                int em = dx.em((byte) 39);
                bx(client.jz[em], em, i5, ap, 577670820);
                return;
            }
            return;
        }
        this.bd = true;
    }

    public void fw(es esVar) {
        int i = 0;
        if (client.ip) {
            if (this.bt * -1635701831 < this.bn * 728835117) {
                if (this.cv * -8607437 != -1) {
                    cs(1028425662);
                }
                if (this.by == null) {
                    bq(esVar, 0, 718953402);
                    return;
                }
                int i2 = this.by[0].aq;
                int length = this.by.length / 2;
                if (this.bz) {
                    i = this.by.length / 2;
                }
                if (this.bp) {
                    int i3 = (this.bt * -492139193) / (this.bn * 728835117);
                    ee eeVar = this.by[i + ((length * (this.bt * -1635701831)) / (this.bn * 728835117))];
                    int i4 = (i2 * 3) / 2;
                    esVar.bs(eeVar, ((this.br * -2065303691) - i4) + 8, ((this.be * -1655223839) - i4) + 8, 255 - i3, (byte) 7);
                } else {
                    int i5 = (i2 * 3) / 2;
                    esVar.aw(this.by[i + ((length * (this.bt * -1635701831)) / (this.bn * 728835117))], ((this.br * -2065303691) - i5) + 8, ((this.be * -1655223839) - i5) + 8, 16711935);
                }
                bq(esVar, i2, 1307547781);
            } else if (this.bt * -1635701831 < this.bn * 1457670234) {
                if (this.by != null) {
                    i = this.by[0].aq;
                }
                bq(esVar, i, 1452756777);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void fx(int i, int i2, boolean z, String str, String str2) {
        this.br = 1050976298 * i;
        this.be = 1256882852 * i2;
        this.bz = z;
        this.bt = 0;
        this.bj = str;
        this.bh = str2;
    }

    /* Access modifiers changed, original: 0000 */
    public String ga(al alVar, int i) {
        return ((!ai.aq(hs.hy(alVar, (byte) 53), i, -2094486677) && alVar.ej == null) || alVar.dz == null || alVar.dz.length <= i || alVar.dz[i] == null || alVar.dz[i].trim().length() == 0) ? null : alVar.dz[i];
    }

    /* Access modifiers changed, original: 0000 */
    public String gb(al alVar, int i) {
        return ((!ai.aq(hs.hy(alVar, (byte) 72), i, -1863012986) && alVar.ej == null) || alVar.dz == null || alVar.dz.length <= i || alVar.dz[i] == null || alVar.dz[i].trim().length() == 0) ? null : alVar.dz[i];
    }

    public final void gc(String str, String str2, int i, int i2, int i3, int i4) {
        bb(str, str2, i, i2, i3, i4, false, false, -1331715867);
    }

    /* Access modifiers changed, original: final */
    public final boolean gd() {
        return this.bc * -1494278369 > 0 && this.bx && ci(2142040707) && this.bv[(this.bc * -1494278369) - 1].ae;
    }

    /* Access modifiers changed, original: final */
    public final void ge(hv hvVar, int i, int i2, int i3) {
        if (da.jc != hvVar && this.bc * -1494278369 < 400) {
            StringBuilder stringBuilder;
            String stringBuilder2;
            if (hvVar.am * -2101033323 == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hvVar.ai[0]);
                stringBuilder.append(hvVar.ad);
                stringBuilder.append(hvVar.ai[1]);
                stringBuilder.append(cc.bu(hvVar.ae * -1589952451, da.jc.ae * -1589952451, -2065658649));
                stringBuilder.append(" ");
                stringBuilder.append(iz.al);
                stringBuilder.append(go.gt);
                stringBuilder.append(hvVar.ae * -1589952451);
                stringBuilder.append(iz.aj);
                stringBuilder.append(hvVar.ai[2]);
                stringBuilder2 = stringBuilder.toString();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hvVar.ai[0]);
                stringBuilder.append(hvVar.ad);
                stringBuilder.append(hvVar.ai[1]);
                stringBuilder.append(" ");
                stringBuilder.append(iz.al);
                stringBuilder.append(go.gm);
                stringBuilder.append(hvVar.am * -2101033323);
                stringBuilder.append(iz.aj);
                stringBuilder.append(hvVar.ai[2]);
                stringBuilder2 = stringBuilder.toString();
            }
            String str;
            if (client.ky * -82596523 == 1) {
                str = go.ge;
                stringBuilder = new StringBuilder();
                stringBuilder.append(client.it);
                stringBuilder.append(" ");
                stringBuilder.append(iz.ai);
                stringBuilder.append(" ");
                stringBuilder.append(hs.aq(16777215, 1440808297));
                stringBuilder.append(stringBuilder2);
                bi(str, stringBuilder.toString(), 14, i, i2, i3, (byte) 1);
            } else if (!this.af) {
                for (int i4 = 7; i4 >= 0; i4--) {
                    if (this.bm[i4] != null) {
                        int i5;
                        if (!this.bm[i4].equalsIgnoreCase(go.gr)) {
                            if (this.bq[i4]) {
                                i5 = 2000;
                            }
                            i5 = 0;
                        } else if (this.bu != fb.al) {
                            i5 = (fb.aq == this.bu || (fb.ad == this.bu && hvVar.ae * -1589952451 > da.jc.ae * -1589952451)) ? 2000 : 0;
                            if (!(da.jc.af * -1540441435 == 0 || hvVar.af * -1540441435 == 0)) {
                                if (da.jc.af * -1540441435 == hvVar.af * -1540441435) {
                                    i5 = 2000;
                                }
                                i5 = 0;
                            }
                        }
                        int i6 = this.bs[i4];
                        str = this.bm[i4];
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(hs.aq(16777215, 2093872495));
                        stringBuilder3.append(stringBuilder2);
                        bi(str, stringBuilder3.toString(), i6 + i5, i, i2, i3, (byte) 1);
                    }
                }
            } else if (((this.av * 549558197) & 8) == 8) {
                str = this.at;
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.bk);
                stringBuilder.append(" ");
                stringBuilder.append(iz.ai);
                stringBuilder.append(" ");
                stringBuilder.append(hs.aq(16777215, -1820666193));
                stringBuilder.append(stringBuilder2);
                bi(str, stringBuilder.toString(), 15, i, i2, i3, (byte) 1);
            }
            bp(stringBuilder2, 1710146423);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean gf() {
        return this.bc * -1494278369 > 0 && this.bx && ci(-2106851931) && this.bv[(this.bc * -1494278369) - 1].ae;
    }

    /* Access modifiers changed, original: final */
    public final int gg() {
        return this.bc * 1414601458 <= 0 ? -1 : (this.bc * -1494278369) - 1;
    }

    public final void gh(al alVar, int i, int i2) {
        String hj;
        StringBuilder stringBuilder;
        int i3;
        int i4;
        int i5;
        if (alVar.ay * 1113829289 == 1) {
            bi(alVar.fg, "", 24, 0, 0, -752576039 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 2 && !this.af) {
            hj = de.hj(alVar, -510107516);
            if (hj != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hs.aq(-346172042, -1755721097));
                stringBuilder.append(alVar.fd);
                bi(hj, stringBuilder.toString(), 25, 0, -1, alVar.ao * 688099975, (byte) 1);
            }
        }
        if (3 == alVar.ay * 1113829289) {
            bi(go.gg, "", 26, 0, 0, -1227024251 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 4) {
            bi(alVar.fg, "", 28, 0, 0, -1626644719 * alVar.ao, (byte) 1);
        }
        if (5 == alVar.ay * 1113829289) {
            bi(alVar.fg, "", 29, 0, 0, -1316187234 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 6 && client.lh == null) {
            bi(alVar.fg, "", 30, 0, -1, -1227024251 * alVar.ao, (byte) 1);
        }
        if (2 == alVar.af * 1845699613) {
            int i6 = 0;
            i3 = 0;
            while (true) {
                int i7 = i3;
                if (i7 >= alVar.bf * 1813264797) {
                    break;
                }
                i3 = 0;
                while (true) {
                    i4 = i3;
                    if (i4 >= alVar.bl * 1272191791) {
                        break;
                    }
                    i3 = ((alVar.df * 102348331) + 32) * i4;
                    int i8 = ((alVar.da * 1649065889) + 194723327) * i7;
                    if (i6 < 20) {
                        i3 += alVar.db[i6];
                        i8 += alVar.dc[i6];
                    }
                    if (i >= i3 && i2 >= i8 && i < i3 - 608130906 && i2 < 1840048325 + i8) {
                        bv.gf(i6, alVar, 1544968914);
                        if (alVar.fj[i6] > 0) {
                            dh aq = gl.aq(alVar.fj[i6] - 1, -118127467);
                            if (1 == client.ky * 118529617 && du.ak(hs.hy(alVar, (byte) 87), 741531169)) {
                                if (alVar.ao * -1227024251 != fw.ix * 221295727 || az.ke * 1380625151 != i6) {
                                    hj = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(client.it);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(iz.ai);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(hs.aq(1376543559, 1109444374));
                                    stringBuilder.append(aq.ao);
                                    bi(hj, stringBuilder.toString(), 1903322019, -1129192407 * aq.ac, i6, alVar.ao * -57385183, (byte) 1);
                                }
                            } else if (!this.af || !du.ak(hs.hy(alVar, (byte) 105), 741531169)) {
                                int i9;
                                String[] strArr = aq.bl;
                                i3 = (this.bx && ci(-1466249873)) ? aq.ah(2131099739) : -1;
                                if (du.ak(hs.hy(alVar, (byte) 72), 741531169)) {
                                    for (i9 = 4; i9 >= 3; i9--) {
                                        if (i3 != i9) {
                                            bv(alVar, aq, i6, i9, false, -116750307);
                                        }
                                    }
                                }
                                String[] strArr2 = strArr;
                                dh dhVar = aq;
                                int i10 = i3;
                                if (ad.as(hs.hy(alVar, (byte) 23), -1968549638)) {
                                    hj = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(hs.aq(16748608, -480477832));
                                    stringBuilder.append(dhVar.ao);
                                    bi(hj, stringBuilder.toString(), 1266109563, -1129192407 * dhVar.ac, i6, -1498127523 * alVar.ao, (byte) 1);
                                }
                                if (du.ak(hs.hy(alVar, (byte) 50), 741531169) && strArr2 != null) {
                                    for (i9 = 2; i9 >= 0; i9--) {
                                        if (i9 != i10) {
                                            bv(alVar, dhVar, i6, i9, false, -116750307);
                                        }
                                    }
                                    if (i10 >= 0) {
                                        bv(alVar, dhVar, i6, i10, true, -116750307);
                                    }
                                }
                                String[] strArr3 = alVar.dp;
                                if (strArr3 != null) {
                                    i5 = 4;
                                    while (i5 >= 0) {
                                        if (strArr3[i5] != null) {
                                            int i11 = i5 == 0 ? 39 : 0;
                                            if (i5 == 1) {
                                                i11 = 40;
                                            }
                                            if (2 == i5) {
                                                i11 = -157872502;
                                            }
                                            if (3 == i5) {
                                                i11 = 42;
                                            }
                                            if (i5 == 4) {
                                                i11 = 43;
                                            }
                                            hj = strArr3[i5];
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(6561625, 911204750));
                                            stringBuilder.append(dhVar.ao);
                                            bi(hj, stringBuilder.toString(), i11, 1810672553 * dhVar.ac, i6, 467650587 * alVar.ao, (byte) 1);
                                        }
                                        i5--;
                                    }
                                }
                                hj = go.gz;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(hs.aq(16748608, -1269445172));
                                stringBuilder.append(dhVar.ao);
                                bi(hj, stringBuilder.toString(), -612554318, -1129192407 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                            } else if (((this.av * -717314159) & 16) == 16) {
                                hj = this.at;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(this.bk);
                                stringBuilder.append(" ");
                                stringBuilder.append(iz.ai);
                                stringBuilder.append(" ");
                                stringBuilder.append(hs.aq(16748608, 95423119));
                                stringBuilder.append(aq.ao);
                                bi(hj, stringBuilder.toString(), -1157985874, -1129192407 * aq.ac, i6, -1559452139 * alVar.ao, (byte) 1);
                            }
                        }
                    }
                    i6++;
                    i3 = i4 + 1;
                }
                i3 = i7 + 1;
            }
        }
        if (!alVar.aa) {
            return;
        }
        if (!this.af) {
            i3 = 9;
            while (true) {
                i5 = i3;
                if (i5 < 5) {
                    break;
                }
                hj = bw(alVar, i5, -780843068);
                if (hj != null) {
                    bi(hj, alVar.dg, 25576203, i5 + 1, -1487170298 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
                }
                i3 = i5 - 1;
            }
            hj = de.hj(alVar, -465905474);
            if (hj != null) {
                bi(hj, alVar.dg, 25, 0, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
            }
            for (i4 = 4; i4 >= 0; i4--) {
                hj = bw(alVar, i4, -1359256670);
                if (hj != null) {
                    bb(hj, alVar.dg, 57, i4 + 1, 2003068734 * alVar.ah, -1462629728 * alVar.ao, false, alVar.gv, -1331715867);
                }
            }
            if (aa.ad(hs.hy(alVar, (byte) 122), 390816015)) {
                bi(go.ae, "", 30, 0, -1050998233 * alVar.ah, alVar.ao * -1824966901, (byte) 1);
            }
        } else if (iq.ai(hs.hy(alVar, (byte) 58), 1707007932) && ((this.av * 458760098) & 1974993748) == 32) {
            hj = this.at;
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.bk);
            stringBuilder.append(" ");
            stringBuilder.append(iz.ai);
            stringBuilder.append(" ");
            stringBuilder.append(alVar.dg);
            bi(hj, stringBuilder.toString(), -612132940, 0, 988026877 * alVar.ah, alVar.ao * 1873002007, (byte) 1);
        }
    }

    public final void gi(al alVar, int i, int i2) {
        String hj;
        StringBuilder stringBuilder;
        int i3;
        int i4;
        int i5;
        if (alVar.ay * 1113829289 == 1) {
            bi(alVar.fg, "", 24, 0, 0, 1535204827 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1721713675 == 2 && !this.af) {
            hj = de.hj(alVar, 469737647);
            if (hj != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hs.aq(-2004390732, 501525663));
                stringBuilder.append(alVar.fd);
                bi(hj, stringBuilder.toString(), 25, 0, -1, alVar.ao * 1789459558, (byte) 1);
            }
        }
        if (3 == alVar.ay * 1113829289) {
            bi(go.gg, "", 26, 0, 0, -1227024251 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1107923222 == 4) {
            bi(alVar.fg, "", 28, 0, 0, -1130362201 * alVar.ao, (byte) 1);
        }
        if (5 == alVar.ay * 1113829289) {
            bi(alVar.fg, "", 29, 0, 0, 100116281 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 6 && client.lh == null) {
            bi(alVar.fg, "", 30, 0, -1, alVar.ao * 835749611, (byte) 1);
        }
        if (2 == alVar.af * -1780403414) {
            int i6 = 0;
            i3 = 0;
            while (true) {
                int i7 = i3;
                if (i7 >= alVar.bf * 1315229551) {
                    break;
                }
                i3 = 0;
                while (true) {
                    i4 = i3;
                    if (i4 >= alVar.bl * 1272191791) {
                        break;
                    }
                    i3 = ((alVar.df * 1340041391) + 32) * i4;
                    int i8 = ((alVar.da * 287660486) + 32) * i7;
                    if (i6 < 20) {
                        i3 += alVar.db[i6];
                        i8 += alVar.dc[i6];
                    }
                    if (i >= i3 && i2 >= i8 && i < i3 + 32 && i2 < i8 + 32) {
                        bv.gf(i6, alVar, 1447160129);
                        if (alVar.fj[i6] > 0) {
                            dh aq = gl.aq(alVar.fj[i6] - 1, 1385641199);
                            if (1 == client.ky * -82596523 && du.ak(hs.hy(alVar, (byte) 114), 741531169)) {
                                if (alVar.ao * 957456848 != fw.ix * 221295727 || az.ke * -1043845274 != i6) {
                                    hj = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(client.it);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(iz.ai);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(hs.aq(16748608, 1135364849));
                                    stringBuilder.append(aq.ao);
                                    bi(hj, stringBuilder.toString(), 31, -783823017 * aq.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                }
                            } else if (!this.af || !du.ak(hs.hy(alVar, (byte) 39), 741531169)) {
                                int i9;
                                String[] strArr = aq.bl;
                                i3 = (this.bx && ci(1880805452)) ? aq.ah(2131099739) : -1;
                                if (du.ak(hs.hy(alVar, (byte) 58), 741531169)) {
                                    for (i9 = 4; i9 >= 3; i9--) {
                                        if (i3 != i9) {
                                            bv(alVar, aq, i6, i9, false, -116750307);
                                        }
                                    }
                                }
                                dh dhVar = aq;
                                int i10 = i3;
                                if (ad.as(hs.hy(alVar, (byte) 120), -2093074787)) {
                                    hj = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(hs.aq(-2105728462, 318950210));
                                    stringBuilder.append(dhVar.ao);
                                    bi(hj, stringBuilder.toString(), 1964271530, -1129192407 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                }
                                if (du.ak(hs.hy(alVar, (byte) 53), 741531169) && strArr != null) {
                                    for (i9 = 2; i9 >= 0; i9--) {
                                        if (i9 != i10) {
                                            bv(alVar, dhVar, i6, i9, false, -116750307);
                                        }
                                    }
                                    if (i10 >= 0) {
                                        bv(alVar, dhVar, i6, i10, true, -116750307);
                                    }
                                }
                                String[] strArr2 = alVar.dp;
                                if (strArr2 != null) {
                                    i5 = 4;
                                    while (i5 >= 0) {
                                        if (strArr2[i5] != null) {
                                            int i11 = i5 == 0 ? -819366330 : 0;
                                            if (i5 == 1) {
                                                i11 = 40;
                                            }
                                            if (2 == i5) {
                                                i11 = -1059503408;
                                            }
                                            if (3 == i5) {
                                                i11 = 324285198;
                                            }
                                            if (i5 == 4) {
                                                i11 = -392321620;
                                            }
                                            hj = strArr2[i5];
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(16748608, 316576901));
                                            stringBuilder.append(dhVar.ao);
                                            bi(hj, stringBuilder.toString(), i11, -1129192407 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                        }
                                        i5--;
                                    }
                                }
                                hj = go.gz;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(hs.aq(1107154117, -720795870));
                                stringBuilder.append(dhVar.ao);
                                bi(hj, stringBuilder.toString(), -466573270, -1129192407 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                            } else if (((this.av * 732669436) & 16) == 16) {
                                hj = this.at;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(this.bk);
                                stringBuilder.append(" ");
                                stringBuilder.append(iz.ai);
                                stringBuilder.append(" ");
                                stringBuilder.append(hs.aq(16748608, 1897164670));
                                stringBuilder.append(aq.ao);
                                bi(hj, stringBuilder.toString(), 32, -1129192407 * aq.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                            }
                        }
                    }
                    i6++;
                    i3 = i4 + 1;
                }
                i3 = i7 + 1;
            }
        }
        if (!alVar.aa) {
            return;
        }
        if (!this.af) {
            i3 = 9;
            while (true) {
                i5 = i3;
                if (i5 < 5) {
                    break;
                }
                hj = bw(alVar, i5, -899226042);
                if (hj != null) {
                    bi(hj, alVar.dg, -757666561, i5 + 1, -2014478116 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
                }
                i3 = i5 - 1;
            }
            hj = de.hj(alVar, 476574484);
            if (hj != null) {
                bi(hj, alVar.dg, 25, 0, 988026877 * alVar.ah, alVar.ao * 341967384, (byte) 1);
            }
            for (i4 = 4; i4 >= 0; i4--) {
                hj = bw(alVar, i4, -1081489159);
                if (hj != null) {
                    bb(hj, alVar.dg, 57, i4 + 1, -1411907577 * alVar.ah, -1227024251 * alVar.ao, false, alVar.gv, -1331715867);
                }
            }
            if (aa.ad(hs.hy(alVar, (byte) 31), 660349817)) {
                bi(go.ae, "", 30, 0, 988026877 * alVar.ah, alVar.ao * -1315305975, (byte) 1);
            }
        } else if (iq.ai(hs.hy(alVar, (byte) 62), 1571698260) && ((this.av * 549558197) & 32) == 32) {
            hj = this.at;
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.bk);
            stringBuilder.append(" ");
            stringBuilder.append(iz.ai);
            stringBuilder.append(" ");
            stringBuilder.append(alVar.dg);
            bi(hj, stringBuilder.toString(), 58, 0, 988026877 * alVar.ah, alVar.ao * 2136861953, (byte) 1);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String gj(al alVar, int i) {
        return ((!ai.aq(hs.hy(alVar, (byte) 99), i, -1626618589) && alVar.ej == null) || alVar.dz == null || alVar.dz.length <= i || alVar.dz[i] == null || alVar.dz[i].trim().length() == 0) ? null : alVar.dz[i];
    }

    /* Access modifiers changed, original: final */
    public final int gk() {
        return this.bc * -1494278369 <= 0 ? -1 : (this.bc * -1494278369) - 1;
    }

    public final void gl(al alVar, int i, int i2) {
        String hj;
        StringBuilder stringBuilder;
        int i3;
        int i4;
        int i5;
        if (alVar.ay * 1113829289 == 1) {
            bi(alVar.fg, "", 24, 0, 0, 819628204 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 2 && !this.af) {
            hj = de.hj(alVar, -118757381);
            if (hj != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hs.aq(MotionEventCompat.ACTION_POINTER_INDEX_MASK, -527953068));
                stringBuilder.append(alVar.fd);
                bi(hj, stringBuilder.toString(), 25, 0, -1, alVar.ao * 1466223008, (byte) 1);
            }
        }
        if (3 == alVar.ay * 1113829289) {
            bi(go.gg, "", 26, 0, 0, alVar.ao * -1581573934, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 4) {
            bi(alVar.fg, "", 28, 0, 0, -1227024251 * alVar.ao, (byte) 1);
        }
        if (5 == alVar.ay * 1113829289) {
            bi(alVar.fg, "", 29, 0, 0, 565729380 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1088516262 == 6 && client.lh == null) {
            bi(alVar.fg, "", 30, 0, -1, alVar.ao * 1396136628, (byte) 1);
        }
        if (2 == alVar.af * 1845699613) {
            int i6 = 0;
            i3 = 0;
            while (true) {
                int i7 = i3;
                if (i7 >= alVar.bf * 1813264797) {
                    break;
                }
                i3 = 0;
                while (true) {
                    i4 = i3;
                    if (i4 >= alVar.bl * 1848571735) {
                        break;
                    }
                    i3 = ((alVar.df * 271499456) + 32) * i4;
                    int i8 = ((alVar.da * 1649065889) + 32) * i7;
                    if (i6 < 20) {
                        i3 += alVar.db[i6];
                        i8 += alVar.dc[i6];
                    }
                    if (i >= i3 && i2 >= i8 && i < i3 + 32 && i2 < i8 - 1486439841) {
                        bv.gf(i6, alVar, 1524308868);
                        if (alVar.fj[i6] > 0) {
                            dh aq = gl.aq(alVar.fj[i6] - 1, 800550269);
                            if (1 == client.ky * 3186196 && du.ak(hs.hy(alVar, (byte) 93), 741531169)) {
                                if (alVar.ao * -664829918 != 433007917 * fw.ix || az.ke * -80320813 != i6) {
                                    hj = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(client.it);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(iz.ai);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(hs.aq(16748608, 647315019));
                                    stringBuilder.append(aq.ao);
                                    bi(hj, stringBuilder.toString(), -1704127126, 650411388 * aq.ac, i6, -1694887252 * alVar.ao, (byte) 1);
                                }
                            } else if (!this.af || !du.ak(hs.hy(alVar, (byte) 84), 741531169)) {
                                int i9;
                                String[] strArr = aq.bl;
                                i3 = (this.bx && ci(730359000)) ? aq.ah(2131099739) : -1;
                                if (du.ak(hs.hy(alVar, (byte) 97), 741531169)) {
                                    for (i9 = 4; i9 >= 3; i9--) {
                                        if (i3 != i9) {
                                            bv(alVar, aq, i6, i9, false, -116750307);
                                        }
                                    }
                                }
                                dh dhVar = aq;
                                int i10 = i3;
                                if (ad.as(hs.hy(alVar, (byte) 55), -1974322690)) {
                                    hj = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(hs.aq(16748608, -1704267305));
                                    stringBuilder.append(dhVar.ao);
                                    bi(hj, stringBuilder.toString(), 630414360, 865422072 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                }
                                if (du.ak(hs.hy(alVar, (byte) 57), 741531169) && strArr != null) {
                                    for (i9 = 2; i9 >= 0; i9--) {
                                        if (i9 != i10) {
                                            bv(alVar, dhVar, i6, i9, false, -116750307);
                                        }
                                    }
                                    if (i10 >= 0) {
                                        bv(alVar, dhVar, i6, i10, true, -116750307);
                                    }
                                }
                                String[] strArr2 = alVar.dp;
                                if (strArr2 != null) {
                                    i5 = 4;
                                    while (i5 >= 0) {
                                        if (strArr2[i5] != null) {
                                            int i11 = i5 == 0 ? 39 : 0;
                                            if (i5 == 1) {
                                                i11 = 1037613795;
                                            }
                                            if (2 == i5) {
                                                i11 = 41;
                                            }
                                            if (3 == i5) {
                                                i11 = 42;
                                            }
                                            if (i5 == 4) {
                                                i11 = 1989775085;
                                            }
                                            hj = strArr2[i5];
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(16748608, 427994671));
                                            stringBuilder.append(dhVar.ao);
                                            bi(hj, stringBuilder.toString(), i11, -1129192407 * dhVar.ac, i6, -974667187 * alVar.ao, (byte) 1);
                                        }
                                        i5--;
                                    }
                                }
                                hj = go.gz;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(hs.aq(78805132, -288836225));
                                stringBuilder.append(dhVar.ao);
                                bi(hj, stringBuilder.toString(), 1114599530, dhVar.ac * -1981960341, i6, -1227024251 * alVar.ao, (byte) 1);
                            } else if (((this.av * -282077677) & 16) == 16) {
                                hj = this.at;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(this.bk);
                                stringBuilder.append(" ");
                                stringBuilder.append(iz.ai);
                                stringBuilder.append(" ");
                                stringBuilder.append(hs.aq(16748608, -1556571495));
                                stringBuilder.append(aq.ao);
                                bi(hj, stringBuilder.toString(), -782374619, -1129192407 * aq.ac, i6, -1048747596 * alVar.ao, (byte) 1);
                            }
                        }
                    }
                    i6++;
                    i3 = i4 + 1;
                }
                i3 = i7 + 1;
            }
        }
        if (!alVar.aa) {
            return;
        }
        if (!this.af) {
            i3 = 9;
            while (true) {
                i5 = i3;
                if (i5 < 5) {
                    break;
                }
                hj = bw(alVar, i5, -1157080985);
                if (hj != null) {
                    bi(hj, alVar.dg, 1007, i5 + 1, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
                }
                i3 = i5 - 1;
            }
            hj = de.hj(alVar, 677643513);
            if (hj != null) {
                bi(hj, alVar.dg, 25, 0, alVar.ah * 348541299, -1227024251 * alVar.ao, (byte) 1);
            }
            for (i4 = 4; i4 >= 0; i4--) {
                hj = bw(alVar, i4, -1698036332);
                if (hj != null) {
                    bb(hj, alVar.dg, -1302743339, i4 + 1, -737234630 * alVar.ah, -1227024251 * alVar.ao, false, alVar.gv, -1331715867);
                }
            }
            if (aa.ad(hs.hy(alVar, (byte) 8), -77490703)) {
                bi(go.ae, "", 30, 0, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
            }
        } else if (iq.ai(hs.hy(alVar, (byte) 68), 984906844) && ((this.av * 549558197) & 32) == 32) {
            hj = this.at;
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.bk);
            stringBuilder.append(" ");
            stringBuilder.append(iz.ai);
            stringBuilder.append(" ");
            stringBuilder.append(alVar.dg);
            bi(hj, stringBuilder.toString(), 58, 0, 988026877 * alVar.ah, alVar.ao * 1563196456, (byte) 1);
        }
    }

    /* Access modifiers changed, original: final */
    public final int gm() {
        return this.bc * -1494278369 <= 0 ? -1 : (this.bc * -1494278369) - 1;
    }

    /* Access modifiers changed, original: final */
    public final void gn(al alVar, dh dhVar, int i, int i2, boolean z) {
        String str;
        int i3;
        int i4 = 37;
        String[] strArr = dhVar.bl;
        if (strArr != null && strArr[i2] != null) {
            if (i2 == 0) {
                i4 = 33;
            } else if (i2 == 1) {
                i4 = 34;
            } else if (2 == i2) {
                i4 = 35;
            } else if (i2 == 3) {
                i4 = 36;
            }
            str = strArr[i2];
            i3 = i4;
        } else if (4 == i2) {
            str = go.ar;
            i3 = 37;
        } else {
            str = null;
            i3 = -1;
        }
        if (i3 != -1 && str != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(hs.aq(16748608, -1577839166));
            stringBuilder.append(dhVar.ao);
            bb(str, stringBuilder.toString(), i3, -1129192407 * dhVar.ac, i, alVar.ao * -766377064, z, false, -1331715867);
        }
    }

    public final void go(al alVar, int i, int i2) {
        String hj;
        StringBuilder stringBuilder;
        int i3;
        int i4;
        int i5;
        if (alVar.ay * 1895431446 == 1) {
            bi(alVar.fg, "", 24, 0, 0, -1992652866 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 2 && !this.af) {
            hj = de.hj(alVar, 106855264);
            if (hj != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hs.aq(MotionEventCompat.ACTION_POINTER_INDEX_MASK, 1183173928));
                stringBuilder.append(alVar.fd);
                bi(hj, stringBuilder.toString(), 25, 0, -1, -1227024251 * alVar.ao, (byte) 1);
            }
        }
        if (3 == alVar.ay * 1113829289) {
            bi(go.gg, "", 26, 0, 0, -1227024251 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 4) {
            bi(alVar.fg, "", 28, 0, 0, -1227024251 * alVar.ao, (byte) 1);
        }
        if (5 == alVar.ay * 1113829289) {
            bi(alVar.fg, "", 29, 0, 0, -1227024251 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 6 && client.lh == null) {
            bi(alVar.fg, "", 30, 0, -1, alVar.ao * -157099819, (byte) 1);
        }
        if (2 == alVar.af * 1845699613) {
            int i6 = 0;
            i3 = 0;
            while (true) {
                int i7 = i3;
                if (i7 >= alVar.bf * 1813264797) {
                    break;
                }
                i3 = 0;
                while (true) {
                    i4 = i3;
                    if (i4 >= alVar.bl * -1938476888) {
                        break;
                    }
                    i3 = ((alVar.df * 1340041391) + 511396172) * i4;
                    int i8 = ((alVar.da * 256598164) - 571277261) * i7;
                    if (i6 < 20) {
                        i3 += alVar.db[i6];
                        i8 += alVar.dc[i6];
                    }
                    if (i >= i3 && i2 >= i8 && i < i3 + 32 && i2 < i8 + 32) {
                        bv.gf(i6, alVar, -1583883526);
                        if (alVar.fj[i6] > 0) {
                            dh aq = gl.aq(alVar.fj[i6] - 1, -236407211);
                            if (1 == client.ky * -1263845708 && du.ak(hs.hy(alVar, (byte) 68), 741531169)) {
                                if (alVar.ao * -1166265366 != fw.ix * 221295727 || az.ke * -697771576 != i6) {
                                    hj = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(client.it);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(iz.ai);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(hs.aq(-1937574774, 1767272732));
                                    stringBuilder.append(aq.ao);
                                    bi(hj, stringBuilder.toString(), 31, -1129192407 * aq.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                }
                            } else if (!this.af || !du.ak(hs.hy(alVar, (byte) 40), 741531169)) {
                                int i9;
                                String[] strArr = aq.bl;
                                i3 = (this.bx && ci(249957184)) ? aq.ah(2131099739) : -1;
                                if (du.ak(hs.hy(alVar, (byte) 95), 741531169)) {
                                    for (i9 = 4; i9 >= 3; i9--) {
                                        if (i3 != i9) {
                                            bv(alVar, aq, i6, i9, false, -116750307);
                                        }
                                    }
                                }
                                dh dhVar = aq;
                                int i10 = i3;
                                if (ad.as(hs.hy(alVar, (byte) 95), -1980961756)) {
                                    hj = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(hs.aq(16748608, -1681562206));
                                    stringBuilder.append(dhVar.ao);
                                    bi(hj, stringBuilder.toString(), 38, -469240582 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                }
                                if (du.ak(hs.hy(alVar, (byte) 93), 741531169) && strArr != null) {
                                    for (i9 = 2; i9 >= 0; i9--) {
                                        if (i9 != i10) {
                                            bv(alVar, dhVar, i6, i9, false, -116750307);
                                        }
                                    }
                                    if (i10 >= 0) {
                                        bv(alVar, dhVar, i6, i10, true, -116750307);
                                    }
                                }
                                String[] strArr2 = alVar.dp;
                                if (strArr2 != null) {
                                    i5 = 4;
                                    while (i5 >= 0) {
                                        if (strArr2[i5] != null) {
                                            int i11 = i5 == 0 ? 1418512042 : 0;
                                            if (i5 == 1) {
                                                i11 = -1653492314;
                                            }
                                            if (2 == i5) {
                                                i11 = 1936695572;
                                            }
                                            if (3 == i5) {
                                                i11 = 42;
                                            }
                                            if (i5 == 4) {
                                                i11 = 1214386358;
                                            }
                                            hj = strArr2[i5];
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(16748608, 1341275038));
                                            stringBuilder.append(dhVar.ao);
                                            bi(hj, stringBuilder.toString(), i11, 1998043325 * dhVar.ac, i6, 277902931 * alVar.ao, (byte) 1);
                                        }
                                        i5--;
                                    }
                                }
                                hj = go.gz;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(hs.aq(-189345067, -1950218834));
                                stringBuilder.append(dhVar.ao);
                                bi(hj, stringBuilder.toString(), ce.cn, dhVar.ac * -1732114790, i6, -1227024251 * alVar.ao, (byte) 1);
                            } else if (((this.av * -208120836) & 16) == 16) {
                                hj = this.at;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(this.bk);
                                stringBuilder.append(" ");
                                stringBuilder.append(iz.ai);
                                stringBuilder.append(" ");
                                stringBuilder.append(hs.aq(-1238193759, -362505781));
                                stringBuilder.append(aq.ao);
                                bi(hj, stringBuilder.toString(), 32, -1129192407 * aq.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                            }
                        }
                    }
                    i6++;
                    i3 = i4 + 1;
                }
                i3 = i7 + 1;
            }
        }
        if (!alVar.aa) {
            return;
        }
        if (!this.af) {
            i3 = 9;
            while (true) {
                i5 = i3;
                if (i5 < 5) {
                    break;
                }
                hj = bw(alVar, i5, -2092312266);
                if (hj != null) {
                    bi(hj, alVar.dg, -690696340, i5 + 1, 1462987400 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
                }
                i3 = i5 - 1;
            }
            hj = de.hj(alVar, 384217495);
            if (hj != null) {
                bi(hj, alVar.dg, 25, 0, 988026877 * alVar.ah, alVar.ao * -920602793, (byte) 1);
            }
            for (i4 = 4; i4 >= 0; i4--) {
                hj = bw(alVar, i4, -727868980);
                if (hj != null) {
                    bb(hj, alVar.dg, 57, i4 + 1, -169157961 * alVar.ah, 1930256849 * alVar.ao, false, alVar.gv, -1331715867);
                }
            }
            if (aa.ad(hs.hy(alVar, (byte) 71), 4247219)) {
                bi(go.ae, "", 30, 0, 1570095591 * alVar.ah, alVar.ao * -1861222562, (byte) 1);
            }
        } else if (iq.ai(hs.hy(alVar, (byte) 66), 1324711142) && ((this.av * -595669614) & 32) == -1980908752) {
            hj = this.at;
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.bk);
            stringBuilder.append(" ");
            stringBuilder.append(iz.ai);
            stringBuilder.append(" ");
            stringBuilder.append(alVar.dg);
            bi(hj, stringBuilder.toString(), 58, 0, 988026877 * alVar.ah, alVar.ao * -1183021000, (byte) 1);
        }
    }

    public final void gp(al alVar, int i, int i2) {
        String hj;
        StringBuilder stringBuilder;
        int i3;
        int i4;
        int i5;
        if (alVar.ay * 1113829289 == 1) {
            bi(alVar.fg, "", 24, 0, 0, -1227024251 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 2 && !this.af) {
            hj = de.hj(alVar, -94945549);
            if (hj != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hs.aq(MotionEventCompat.ACTION_POINTER_INDEX_MASK, -1957727954));
                stringBuilder.append(alVar.fd);
                bi(hj, stringBuilder.toString(), 25, 0, -1, -1227024251 * alVar.ao, (byte) 1);
            }
        }
        if (3 == alVar.ay * 1113829289) {
            bi(go.gg, "", 26, 0, 0, -1227024251 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 4) {
            bi(alVar.fg, "", 28, 0, 0, -1227024251 * alVar.ao, (byte) 1);
        }
        if (5 == alVar.ay * 1113829289) {
            bi(alVar.fg, "", 29, 0, 0, -1227024251 * alVar.ao, (byte) 1);
        }
        if (alVar.ay * 1113829289 == 6 && client.lh == null) {
            bi(alVar.fg, "", 30, 0, -1, -1227024251 * alVar.ao, (byte) 1);
        }
        if (2 == alVar.af * 1845699613) {
            int i6 = 0;
            i3 = 0;
            while (true) {
                int i7 = i3;
                if (i7 >= alVar.bf * 1813264797) {
                    break;
                }
                i3 = 0;
                while (true) {
                    i4 = i3;
                    if (i4 >= alVar.bl * 1272191791) {
                        break;
                    }
                    i3 = ((alVar.df * 1340041391) + 32) * i4;
                    int i8 = ((alVar.da * 1649065889) + 32) * i7;
                    if (i6 < 20) {
                        i3 += alVar.db[i6];
                        i8 += alVar.dc[i6];
                    }
                    if (i >= i3 && i2 >= i8 && i < i3 + 32 && i2 < i8 + 32) {
                        bv.gf(i6, alVar, 1167422017);
                        if (alVar.fj[i6] > 0) {
                            dh aq = gl.aq(alVar.fj[i6] - 1, -580801750);
                            if (1 == client.ky * -82596523 && du.ak(hs.hy(alVar, (byte) 13), 741531169)) {
                                if (alVar.ao * -1227024251 != 221295727 * fw.ix || az.ke * -80320813 != i6) {
                                    hj = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(client.it);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(iz.ai);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(hs.aq(16748608, 1340532327));
                                    stringBuilder.append(aq.ao);
                                    bi(hj, stringBuilder.toString(), 31, aq.ac * -1129192407, i6, -1227024251 * alVar.ao, (byte) 1);
                                }
                            } else if (!this.af || !du.ak(hs.hy(alVar, (byte) 83), 741531169)) {
                                int i9;
                                String[] strArr = aq.bl;
                                i3 = (this.bx && ci(-970698865)) ? aq.ah(2131099739) : -1;
                                if (du.ak(hs.hy(alVar, (byte) 43), 741531169)) {
                                    for (i9 = 4; i9 >= 3; i9--) {
                                        if (i3 != i9) {
                                            bv(alVar, aq, i6, i9, false, -116750307);
                                        }
                                    }
                                }
                                dh dhVar = aq;
                                int i10 = i3;
                                if (ad.as(hs.hy(alVar, (byte) 34), -1835013473)) {
                                    hj = go.ge;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(hs.aq(16748608, -984653513));
                                    stringBuilder.append(dhVar.ao);
                                    bi(hj, stringBuilder.toString(), 38, -1129192407 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                }
                                if (du.ak(hs.hy(alVar, (byte) 81), 741531169) && strArr != null) {
                                    for (i9 = 2; i9 >= 0; i9--) {
                                        if (i9 != i10) {
                                            bv(alVar, dhVar, i6, i9, false, -116750307);
                                        }
                                    }
                                    if (i10 >= 0) {
                                        bv(alVar, dhVar, i6, i10, true, -116750307);
                                    }
                                }
                                String[] strArr2 = alVar.dp;
                                if (strArr2 != null) {
                                    i5 = 4;
                                    while (i5 >= 0) {
                                        if (strArr2[i5] != null) {
                                            int i11 = i5 == 0 ? 39 : 0;
                                            if (i5 == 1) {
                                                i11 = 40;
                                            }
                                            if (2 == i5) {
                                                i11 = 41;
                                            }
                                            if (3 == i5) {
                                                i11 = 42;
                                            }
                                            if (i5 == 4) {
                                                i11 = 43;
                                            }
                                            hj = strArr2[i5];
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(hs.aq(16748608, 177363820));
                                            stringBuilder.append(dhVar.ao);
                                            bi(hj, stringBuilder.toString(), i11, -1129192407 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                                        }
                                        i5--;
                                    }
                                }
                                hj = go.gz;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(hs.aq(16748608, -1943757688));
                                stringBuilder.append(dhVar.ao);
                                bi(hj, stringBuilder.toString(), ce.cn, -1129192407 * dhVar.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                            } else if (((this.av * 549558197) & 16) == 16) {
                                hj = this.at;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(this.bk);
                                stringBuilder.append(" ");
                                stringBuilder.append(iz.ai);
                                stringBuilder.append(" ");
                                stringBuilder.append(hs.aq(16748608, 1050937343));
                                stringBuilder.append(aq.ao);
                                bi(hj, stringBuilder.toString(), 32, -1129192407 * aq.ac, i6, -1227024251 * alVar.ao, (byte) 1);
                            }
                        }
                    }
                    i6++;
                    i3 = i4 + 1;
                }
                i3 = i7 + 1;
            }
        }
        if (!alVar.aa) {
            return;
        }
        if (!this.af) {
            i3 = 9;
            while (true) {
                i5 = i3;
                if (i5 < 5) {
                    break;
                }
                hj = bw(alVar, i5, -2097104211);
                if (hj != null) {
                    bi(hj, alVar.dg, 1007, i5 + 1, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
                }
                i3 = i5 - 1;
            }
            hj = de.hj(alVar, -1397784008);
            if (hj != null) {
                bi(hj, alVar.dg, 25, 0, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
            }
            for (i4 = 4; i4 >= 0; i4--) {
                hj = bw(alVar, i4, -2098168027);
                if (hj != null) {
                    bb(hj, alVar.dg, 57, i4 + 1, 988026877 * alVar.ah, -1227024251 * alVar.ao, false, alVar.gv, -1331715867);
                }
            }
            if (aa.ad(hs.hy(alVar, (byte) 126), -743738724)) {
                bi(go.ae, "", 30, 0, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
            }
        } else if (iq.ai(hs.hy(alVar, (byte) 107), 1987243619) && ((this.av * 549558197) & 32) == 32) {
            hj = this.at;
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.bk);
            stringBuilder.append(" ");
            stringBuilder.append(iz.ai);
            stringBuilder.append(" ");
            stringBuilder.append(alVar.dg);
            bi(hj, stringBuilder.toString(), 58, 0, 988026877 * alVar.ah, -1227024251 * alVar.ao, (byte) 1);
        }
    }

    /* Access modifiers changed, original: final */
    public final int gq() {
        return this.bc * -949946262 <= 0 ? -1 : (this.bc * -1494278369) - 1;
    }

    /* Access modifiers changed, original: final */
    public final void gs(hv hvVar, int i, int i2, int i3) {
        if (da.jc != hvVar && this.bc * 727788060 < 400) {
            StringBuilder stringBuilder;
            String stringBuilder2;
            if (hvVar.am * -1352440117 == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hvVar.ai[0]);
                stringBuilder.append(hvVar.ad);
                stringBuilder.append(hvVar.ai[1]);
                stringBuilder.append(cc.bu(hvVar.ae * -2087787269, da.jc.ae * 1213632765, 1298706679));
                stringBuilder.append(" ");
                stringBuilder.append(iz.al);
                stringBuilder.append(go.gt);
                stringBuilder.append(hvVar.ae * -1589952451);
                stringBuilder.append(iz.aj);
                stringBuilder.append(hvVar.ai[2]);
                stringBuilder2 = stringBuilder.toString();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hvVar.ai[0]);
                stringBuilder.append(hvVar.ad);
                stringBuilder.append(hvVar.ai[1]);
                stringBuilder.append(" ");
                stringBuilder.append(iz.al);
                stringBuilder.append(go.gm);
                stringBuilder.append(hvVar.am * -2101033323);
                stringBuilder.append(iz.aj);
                stringBuilder.append(hvVar.ai[2]);
                stringBuilder2 = stringBuilder.toString();
            }
            String str;
            if (client.ky * -82596523 == 1) {
                str = go.ge;
                stringBuilder = new StringBuilder();
                stringBuilder.append(client.it);
                stringBuilder.append(" ");
                stringBuilder.append(iz.ai);
                stringBuilder.append(" ");
                stringBuilder.append(hs.aq(949861225, 1933360286));
                stringBuilder.append(stringBuilder2);
                bi(str, stringBuilder.toString(), 14, i, i2, i3, (byte) 1);
            } else if (!this.af) {
                for (int i4 = 7; i4 >= 0; i4--) {
                    if (this.bm[i4] != null) {
                        int i5;
                        if (!this.bm[i4].equalsIgnoreCase(go.gr)) {
                            if (this.bq[i4]) {
                                i5 = 1972420772;
                            }
                            i5 = 0;
                        } else if (this.bu != fb.al) {
                            i5 = (fb.aq == this.bu || (fb.ad == this.bu && hvVar.ae * -1186365613 > da.jc.ae * -1589952451)) ? 238488069 : 0;
                            if (!(da.jc.af * -1185749045 == 0 || hvVar.af * -1540441435 == 0)) {
                                if (da.jc.af * -2052413239 == hvVar.af * -1540441435) {
                                    i5 = 2000;
                                }
                                i5 = 0;
                            }
                        }
                        int i6 = this.bs[i4];
                        str = this.bm[i4];
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(hs.aq(1800590478, -1454522201));
                        stringBuilder3.append(stringBuilder2);
                        bi(str, stringBuilder3.toString(), i6 + i5, i, i2, i3, (byte) 1);
                    }
                }
            } else if (((this.av * 549558197) & 8) == 8) {
                str = this.at;
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.bk);
                stringBuilder.append(" ");
                stringBuilder.append(iz.ai);
                stringBuilder.append(" ");
                stringBuilder.append(hs.aq(-1432773249, -701730167));
                stringBuilder.append(stringBuilder2);
                bi(str, stringBuilder.toString(), 15, i, i2, i3, (byte) 1);
            }
            bp(stringBuilder2, 1577346709);
        }
    }

    /* Access modifiers changed, original: final */
    public final int gt() {
        return this.bc * -1494278369 <= 0 ? -1 : (this.bc * -1494278369) - 1;
    }

    /* Access modifiers changed, original: final */
    public final void gu(hv hvVar, int i, int i2, int i3) {
        if (da.jc != hvVar && this.bc * -1494278369 < 400) {
            StringBuilder stringBuilder;
            String stringBuilder2;
            if (hvVar.am * -2101033323 == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hvVar.ai[0]);
                stringBuilder.append(hvVar.ad);
                stringBuilder.append(hvVar.ai[1]);
                stringBuilder.append(cc.bu(hvVar.ae * -1589952451, da.jc.ae * -1589952451, -730191780));
                stringBuilder.append(" ");
                stringBuilder.append(iz.al);
                stringBuilder.append(go.gt);
                stringBuilder.append(hvVar.ae * -1589952451);
                stringBuilder.append(iz.aj);
                stringBuilder.append(hvVar.ai[2]);
                stringBuilder2 = stringBuilder.toString();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hvVar.ai[0]);
                stringBuilder.append(hvVar.ad);
                stringBuilder.append(hvVar.ai[1]);
                stringBuilder.append(" ");
                stringBuilder.append(iz.al);
                stringBuilder.append(go.gm);
                stringBuilder.append(hvVar.am * -2101033323);
                stringBuilder.append(iz.aj);
                stringBuilder.append(hvVar.ai[2]);
                stringBuilder2 = stringBuilder.toString();
            }
            String str;
            if (client.ky * -82596523 == 1) {
                str = go.ge;
                stringBuilder = new StringBuilder();
                stringBuilder.append(client.it);
                stringBuilder.append(" ");
                stringBuilder.append(iz.ai);
                stringBuilder.append(" ");
                stringBuilder.append(hs.aq(16777215, -821951189));
                stringBuilder.append(stringBuilder2);
                bi(str, stringBuilder.toString(), 14, i, i2, i3, (byte) 1);
            } else if (!this.af) {
                for (int i4 = 7; i4 >= 0; i4--) {
                    if (this.bm[i4] != null) {
                        int i5;
                        if (!this.bm[i4].equalsIgnoreCase(go.gr)) {
                            if (this.bq[i4]) {
                                i5 = 2000;
                            }
                            i5 = 0;
                        } else if (this.bu != fb.al) {
                            i5 = (fb.aq == this.bu || (fb.ad == this.bu && hvVar.ae * -1589952451 > da.jc.ae * -1589952451)) ? 2000 : 0;
                            if (!(da.jc.af * -1540441435 == 0 || hvVar.af * -1540441435 == 0)) {
                                if (da.jc.af * -1540441435 == hvVar.af * -1540441435) {
                                    i5 = 2000;
                                }
                                i5 = 0;
                            }
                        }
                        int i6 = this.bs[i4];
                        str = this.bm[i4];
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(hs.aq(16777215, -942541994));
                        stringBuilder3.append(stringBuilder2);
                        bi(str, stringBuilder3.toString(), i6 + i5, i, i2, i3, (byte) 1);
                    }
                }
            } else if (((this.av * 549558197) & 8) == 8) {
                str = this.at;
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.bk);
                stringBuilder.append(" ");
                stringBuilder.append(iz.ai);
                stringBuilder.append(" ");
                stringBuilder.append(hs.aq(16777215, 482130633));
                stringBuilder.append(stringBuilder2);
                bi(str, stringBuilder.toString(), 15, i, i2, i3, (byte) 1);
            }
            bp(stringBuilder2, 1551357411);
        }
    }

    /* Access modifiers changed, original: final */
    public final void gv(et etVar, int i, int i2, int i3) {
        if (this.bc * 48188459 < 1854541519) {
            if (etVar.bq != null) {
                etVar = etVar.am(-2081026401);
            }
            if (etVar != null && etVar.bl) {
                if (!etVar.bb || i == client.lr * 770492805) {
                    String stringBuilder;
                    String str;
                    StringBuilder stringBuilder2;
                    String str2 = etVar.ai;
                    if (etVar.an * 35654054 != 0) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(str2);
                        stringBuilder3.append(cc.bu(etVar.an * -998336884, da.jc.ae * -1589952451, 1710109664));
                        stringBuilder3.append(" ");
                        stringBuilder3.append(iz.al);
                        stringBuilder3.append(go.gt);
                        stringBuilder3.append(etVar.an * 1785682765);
                        stringBuilder3.append(iz.aj);
                        stringBuilder = stringBuilder3.toString();
                    } else {
                        stringBuilder = str2;
                    }
                    if (etVar.bb && cn(-1043143516)) {
                        str = go.gz;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(hs.aq(-1545948844, 2118226060));
                        stringBuilder2.append(stringBuilder);
                        bi(str, stringBuilder2.toString(), -1827135914, i, i2, i3, (byte) 1);
                    }
                    if (1 == client.ky * -82596523) {
                        str = go.ge;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(client.it);
                        stringBuilder2.append(" ");
                        stringBuilder2.append(iz.ai);
                        stringBuilder2.append(" ");
                        stringBuilder2.append(hs.aq(16776960, 294594307));
                        stringBuilder2.append(stringBuilder);
                        bi(str, stringBuilder2.toString(), 7, i, i2, i3, (byte) 1);
                    } else if (!this.af) {
                        int i4;
                        int i5 = (etVar.bb && cn(1136632868)) ? -691745431 : 0;
                        String[] strArr = etVar.af;
                        if (strArr != null) {
                            int i6 = 4;
                            while (i6 >= 0) {
                                if (!(strArr[i6] == null || strArr[i6].equalsIgnoreCase(go.gr))) {
                                    i4 = i6 == 0 ? i5 + 9 : 0;
                                    if (1 == i6) {
                                        i4 = i5 + 10;
                                    }
                                    if (2 == i6) {
                                        i4 = i5 + 11;
                                    }
                                    if (i6 == 3) {
                                        i4 = i5 + 12;
                                    }
                                    if (4 == i6) {
                                        i4 = i5 + 13;
                                    }
                                    str = strArr[i6];
                                    stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append(hs.aq(16776960, -2103349017));
                                    stringBuilder2.append(stringBuilder);
                                    bi(str, stringBuilder2.toString(), i4, i, i2, i3, (byte) 1);
                                }
                                i6--;
                            }
                        }
                        if (strArr != null) {
                            i5 = 4;
                            while (i5 >= 0) {
                                if (!(strArr[i5] == null || !strArr[i5].equalsIgnoreCase(go.gr) || this.bw == fb.al)) {
                                    int i7 = (this.bw == fb.aq || (fb.ad == this.bw && etVar.an * 2013139053 > da.jc.ae * 267086724)) ? 2000 : 0;
                                    i4 = i5 == 0 ? i7 + 9 : 0;
                                    if (i5 == 1) {
                                        i4 = i7 + 10;
                                    }
                                    if (2 == i5) {
                                        i4 = i7 + 11;
                                    }
                                    if (i5 == 3) {
                                        i4 = i7 + 12;
                                    }
                                    if (i5 == 4) {
                                        i4 = i7 + 13;
                                    }
                                    str = strArr[i5];
                                    stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append(hs.aq(272959256, -1725837241));
                                    stringBuilder2.append(stringBuilder);
                                    bi(str, stringBuilder2.toString(), i4, i, i2, i3, (byte) 1);
                                }
                                i5--;
                            }
                        }
                        if (!etVar.bb || !cn(-658912588)) {
                            str = go.gz;
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(hs.aq(16776960, 1854991598));
                            stringBuilder2.append(stringBuilder);
                            bi(str, stringBuilder2.toString(), 1003, i, i2, i3, (byte) 1);
                        }
                    } else if (2 == ((this.av * 549558197) & 2)) {
                        str = this.at;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(this.bk);
                        stringBuilder2.append(" ");
                        stringBuilder2.append(iz.ai);
                        stringBuilder2.append(" ");
                        stringBuilder2.append(hs.aq(16776960, 1746285476));
                        stringBuilder2.append(stringBuilder);
                        bi(str, stringBuilder2.toString(), 8, i, i2, i3, (byte) 1);
                    }
                }
            }
        }
    }

    public final void gw(String str, String str2, int i, int i2, int i3, int i4) {
        bb(str, str2, i, i2, i3, i4, false, false, -1331715867);
    }

    /* Access modifiers changed, original: final */
    public final boolean gx() {
        return this.bc * -1494278369 > 0 && this.bx && ci(412407735) && this.bv[(this.bc * -1494278369) - 1].ae;
    }

    /* Access modifiers changed, original: final */
    public final boolean gy() {
        return this.bc * 1739909375 > 0 && this.bx && ci(-1966800009) && this.bv[(this.bc * -1494278369) - 1].ae;
    }

    /* Access modifiers changed, original: final */
    public final void gz(hv hvVar, int i, int i2, int i3) {
        if (da.jc != hvVar && this.bc * 1948559066 < -257065932) {
            StringBuilder stringBuilder;
            String stringBuilder2;
            if (hvVar.am * -1238814454 == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hvVar.ai[0]);
                stringBuilder.append(hvVar.ad);
                stringBuilder.append(hvVar.ai[1]);
                stringBuilder.append(cc.bu(hvVar.ae * -1589952451, da.jc.ae * -1589952451, -2035308052));
                stringBuilder.append(" ");
                stringBuilder.append(iz.al);
                stringBuilder.append(go.gt);
                stringBuilder.append(hvVar.ae * 655322721);
                stringBuilder.append(iz.aj);
                stringBuilder.append(hvVar.ai[2]);
                stringBuilder2 = stringBuilder.toString();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(hvVar.ai[0]);
                stringBuilder.append(hvVar.ad);
                stringBuilder.append(hvVar.ai[1]);
                stringBuilder.append(" ");
                stringBuilder.append(iz.al);
                stringBuilder.append(go.gm);
                stringBuilder.append(hvVar.am * -1908894878);
                stringBuilder.append(iz.aj);
                stringBuilder.append(hvVar.ai[2]);
                stringBuilder2 = stringBuilder.toString();
            }
            String str;
            if (client.ky * -82596523 == 1) {
                str = go.ge;
                stringBuilder = new StringBuilder();
                stringBuilder.append(client.it);
                stringBuilder.append(" ");
                stringBuilder.append(iz.ai);
                stringBuilder.append(" ");
                stringBuilder.append(hs.aq(-2146691293, 694912264));
                stringBuilder.append(stringBuilder2);
                bi(str, stringBuilder.toString(), 14, i, i2, i3, (byte) 1);
            } else if (!this.af) {
                for (int i4 = 7; i4 >= 0; i4--) {
                    if (this.bm[i4] != null) {
                        int i5;
                        if (!this.bm[i4].equalsIgnoreCase(go.gr)) {
                            if (this.bq[i4]) {
                                i5 = -1447519892;
                            }
                            i5 = 0;
                        } else if (this.bu != fb.al) {
                            i5 = (fb.aq == this.bu || (fb.ad == this.bu && hvVar.ae * 2013244422 > da.jc.ae * -1589952451)) ? 306351156 : 0;
                            if (!(da.jc.af * -1540441435 == 0 || hvVar.af * -1555015671 == 0)) {
                                if (da.jc.af * 521701063 == hvVar.af * -1540441435) {
                                    i5 = -360292974;
                                }
                                i5 = 0;
                            }
                        }
                        int i6 = this.bs[i4];
                        str = this.bm[i4];
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(hs.aq(509465220, -1805057412));
                        stringBuilder3.append(stringBuilder2);
                        bi(str, stringBuilder3.toString(), i6 + i5, i, i2, i3, (byte) 1);
                    }
                }
            } else if (((this.av * 549558197) & 8) == 8) {
                str = this.at;
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.bk);
                stringBuilder.append(" ");
                stringBuilder.append(iz.ai);
                stringBuilder.append(" ");
                stringBuilder.append(hs.aq(1409393111, 1635363296));
                stringBuilder.append(stringBuilder2);
                bi(str, stringBuilder.toString(), 15, i, i2, i3, (byte) 1);
            }
            bp(stringBuilder2, 1941408063);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ha(String str) {
        for (int i = 0; i < this.bc * -1494278369; i++) {
            if (23 == this.bv[i].ar * -1484618507) {
                fc fcVar = this.bv[i];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(hs.aq(16777215, -1991823676));
                stringBuilder.append(str);
                fcVar.ai = stringBuilder.toString();
                return;
            }
        }
    }

    public void hb(fb fbVar) {
        this.bw = fbVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void hc() {
        Object obj = null;
        while (obj == null) {
            int i = 0;
            obj = 1;
            while (i < (this.bc * -1494278369) - 1) {
                fc fcVar = this.bv[i];
                int i2 = i + 1;
                fc fcVar2 = this.bv[i2];
                if (fcVar.ar * -1484618507 < 1000 && fcVar2.ar * -1484618507 > 1000) {
                    bf(i, i2, 2087621199);
                    obj = null;
                }
                i = i2;
            }
        }
    }

    public void hd() {
        bt(1803444019);
        this.bc = 849583327;
        this.bv[0].ad(as, 1499495594);
    }

    public boolean he() {
        return this.bi;
    }

    public void hf() {
        int i = 0;
        while (i < this.bc * -1494278369) {
            if (ak.by(this.bv[i].ar * -1484618507, -1849162683)) {
                if (i < (this.bc * -1494278369) - 1) {
                    int i2 = i;
                    while (i2 < (this.bc * -1494278369) - 1) {
                        int i3 = i2 + 1;
                        bf(i2, i3, 2009005077);
                        i2 = i3;
                    }
                }
                i--;
                this.bc -= 849583327;
            }
            i++;
        }
        aj(-1679882261);
    }

    public void hg() {
        bt(2067198999);
        this.bc = 1764089529;
        this.bv[0].ad(as, 1976916507);
    }

    /* Access modifiers changed, original: 0000 */
    public void hi(String str) {
        for (int i = 0; i < this.bc * -1494278369; i++) {
            if (23 == this.bv[i].ar * -1484618507) {
                fc fcVar = this.bv[i];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(hs.aq(16777215, 963797718));
                stringBuilder.append(str);
                fcVar.ai = stringBuilder.toString();
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hj() {
        return this.bg;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hl() {
        return this.bg;
    }

    public void hm(fb fbVar) {
        this.bu = fbVar;
    }

    public void hn(fb fbVar) {
        this.bw = fbVar;
    }

    public void ho(fb fbVar) {
        this.bu = fbVar;
    }

    /* Access modifiers changed, original: final */
    public final boolean hp() {
        return this.bc * -1494278369 > 0 && this.bv[(this.bc * -1494278369) - 1].am;
    }

    public void hq() {
        int i = 0;
        while (i < this.bc * -1494278369) {
            if (ak.by(this.bv[i].ar * -1484618507, -1803385080)) {
                if (i < (this.bc * 2141859347) - 1) {
                    int i2 = i;
                    while (i2 < (this.bc * -684697150) - 1) {
                        int i3 = i2 + 1;
                        bf(i2, i3, 2065299155);
                        i2 = i3;
                    }
                }
                i--;
                this.bc -= 849583327;
            }
            i++;
        }
        aj(-1679882261);
    }

    public void hr() {
        bt(-1002058666);
        this.bc = 849583327;
        this.bv[0].ad(as, 1007392561);
    }

    /* Access modifiers changed, original: 0000 */
    public void hs() {
        if (this.bi) {
            this.bi = false;
            client.bh.an(io.ax, -2081925940);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void hu(String str) {
        for (int i = 0; i < this.bc * -1494278369; i++) {
            if (23 == this.bv[i].ar * -1484618507) {
                fc fcVar = this.bv[i];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(hs.aq(16777215, 689859090));
                stringBuilder.append(str);
                fcVar.ai = stringBuilder.toString();
                return;
            }
        }
    }

    public boolean hv() {
        return this.bi;
    }

    public void hw(fb fbVar) {
        this.bu = fbVar;
    }

    public void hy(fb fbVar) {
        this.bw = fbVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void hz() {
        if (this.bi) {
            this.bi = false;
            client.bh.an(io.ax, -2128896881);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ia() {
        if (this.cv * -8607437 >= 0) {
            ee[] au = gq.au(this.cm, this.cv * -8607437, -1678946155);
            if (au != null || this.cv * -8607437 < 0) {
                this.by = au;
                this.cv = 906003973;
            }
        }
    }

    public void ib(boolean z) {
        this.ah = z;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ic() {
        return this.bg;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean id() {
        return this.bg;
    }

    public void ie(boolean z) {
        this.bg = z;
    }

    /* renamed from: if */
    public void m217if(boolean z) {
        this.bg = z;
    }

    public void ig(boolean z) {
        this.ah = z;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ih() {
        return this.ah || client.bh.ba(1722142050, -1620542321);
    }

    public void ii(boolean z) {
        this.ah = z;
    }

    public void ij(boolean z) {
        this.cj = z;
    }

    public void ik(boolean z) {
        this.bx = z;
    }

    public void il(int i, boolean z) {
        this.cv = -906003973 * i;
        this.bp = z;
        cs(1378037745);
    }

    public boolean im() {
        return this.ah;
    }

    public void in(boolean z) {
        this.bx = z;
    }

    public void io(boolean z) {
        this.bg = z;
    }

    public boolean ip() {
        return this.ah;
    }

    public void iq(boolean z) {
        this.bx = z;
    }

    public void ir(boolean z) {
        this.ah = z;
    }

    public void is(boolean z) {
        this.ah = z;
    }

    public void it(int i, boolean z) {
        this.cv = -906003973 * i;
        this.bp = z;
        cs(2063685184);
    }

    /* Access modifiers changed, original: 0000 */
    public void iu() {
        if (this.cv * -8607437 >= 0) {
            ee[] au = gq.au(this.cm, this.cv * -8607437, -1565895970);
            if (au != null || this.cv * -8607437 < 0) {
                this.by = au;
                this.cv = 906003973;
            }
        }
    }

    public void iv(boolean z) {
        this.bg = z;
    }

    public void iw(boolean z) {
        this.bx = z;
    }

    public void ix(boolean z) {
        this.bx = z;
    }

    public boolean iy() {
        return this.ah;
    }

    /* Access modifiers changed, original: 0000 */
    public void iz() {
        if (this.cv * 1595680759 >= 0) {
            ee[] au = gq.au(this.cm, this.cv * 1934505179, -83656329);
            if (au != null || this.cv * -8607437 < 0) {
                this.by = au;
                this.cv = -559593910;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void jv() {
        if (this.cv * -8607437 >= 0) {
            ee[] au = gq.au(this.cm, this.cv * -8607437, -126325657);
            if (au != null || this.cv * -8607437 < 0) {
                this.by = au;
                this.cv = 906003973;
            }
        }
    }
}
