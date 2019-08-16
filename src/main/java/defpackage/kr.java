package defpackage;

/* renamed from: kr */
public class kr extends hq {
    public static final int ae = 1280;
    public static final int ai = 5;
    kp ad;
    fy aq;
    gf ar;

    kr(kp kpVar) {
        try {
            this.aq = new fy();
            this.ar = new gf();
            this.ad = kpVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kr.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int br(int i, int i2, int i3) {
        int i4 = 2;
        int i5 = ((i & 127) * i2) >> 7;
        if (i5 >= 2) {
            i4 = i5 > 126 ? 126 : i5;
        }
        return i4 + (65408 & i);
    }

    /* Access modifiers changed, original: protected */
    public hq ab() {
        kc kcVar;
        do {
            kcVar = (kc) this.aq.ak();
            if (kcVar == null) {
                return null;
            }
        } while (kcVar.ao == null);
        return kcVar.ao;
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(kc kcVar, int[] iArr, int i, int i2, int i3, int i4) {
        try {
            if ((this.ad.af[kcVar.ad * 1051654295] & 4) != 0 && kcVar.ax * -427609645 < 0) {
                int i5 = this.ad.at[kcVar.ad * 1051654295] / (hd.ad * -754139271);
                while (true) {
                    int i6 = ((1048575 + i5) - (kcVar.ay * -1795778743)) / i5;
                    if (i6 > i2) {
                        break;
                    }
                    kcVar.ao.ak(iArr, i, i6);
                    i += i6;
                    i2 -= i6;
                    kcVar.ay = (((i6 * i5) - 1048576) * 1380846329) + kcVar.ay;
                    int i7 = (hd.ad * -754139271) / 100;
                    i6 = 262144 / i5;
                    if (i6 < i7) {
                        i7 = i6;
                    }
                    hf hfVar = kcVar.ao;
                    if (this.ad.ab[kcVar.ad * 1051654295] == 0) {
                        kcVar.ao = hf.al(kcVar.ar, hfVar.bl(), hfVar.ax(), hfVar.aw());
                    } else {
                        boolean z = false;
                        kcVar.ao = hf.al(kcVar.ar, hfVar.bl(), 0, hfVar.aw());
                        kp kpVar = this.ad;
                        if (kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0) {
                            z = true;
                        }
                        kpVar.aa(kcVar, z, (byte) 10);
                        kcVar.ao.ah(i7, hfVar.ax());
                    }
                    if (kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0) {
                        kcVar.ao.as(-1);
                    }
                    hfVar.bq(i7);
                    hfVar.ak(iArr, i, i3 - i);
                    if (hfVar.bi()) {
                        this.ar.ad(hfVar);
                    }
                }
                kcVar.ay += (i5 * i2) * 1380846329;
            }
            kcVar.ao.ak(iArr, i, i2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kr.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ae() {
        kc kcVar;
        do {
            try {
                kcVar = (kc) this.aq.ak();
                if (kcVar == null) {
                    return null;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kr.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } while (kcVar.ao == null);
        return kcVar.ao;
    }

    /* Access modifiers changed, original: protected */
    public void ag(int i) {
        try {
            this.ar.ag(i);
            mb ae = this.aq.ae();
            while (true) {
                kc kcVar = (kc) ae;
                if (kcVar != null) {
                    if (!this.ad.bj(kcVar, (byte) -24)) {
                        int i2 = i;
                        while (i2 > kcVar.ah * 1132626509) {
                            aq(kcVar, kcVar.ah * 1132626509, -104564980);
                            i2 -= kcVar.ah * 1132626509;
                            if (this.ad.bh(kcVar, null, 0, i2, 121845990)) {
                                break;
                            }
                        }
                        aq(kcVar, i2, -104564980);
                        kcVar.ah -= -2080995707 * i2;
                    }
                    ae = this.aq.ak();
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kr.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public hq ai() {
        try {
            kc kcVar = (kc) this.aq.ae();
            return kcVar == null ? null : kcVar.ao != null ? kcVar.ao : ae();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kr.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(kc kcVar, int[] iArr, int i, int i2, int i3) {
        if ((this.ad.af[kcVar.ad * 1051654295] & 4) != 0 && kcVar.ax * -427609645 < 0) {
            int i4 = this.ad.at[kcVar.ad * 1051654295] / (hd.ad * -754139271);
            while (true) {
                int i5 = ((1048575 + i4) - (kcVar.ay * -1795778743)) / i4;
                if (i5 > i2) {
                    break;
                }
                kcVar.ao.ak(iArr, i, i5);
                i += i5;
                i2 -= i5;
                kcVar.ay = (((i5 * i4) - 1048576) * 1380846329) + kcVar.ay;
                int i6 = (hd.ad * -754139271) / 100;
                i5 = 262144 / i4;
                if (i5 >= i6) {
                    i5 = i6;
                }
                hf hfVar = kcVar.ao;
                if (this.ad.ab[kcVar.ad * 1051654295] == 0) {
                    kcVar.ao = hf.al(kcVar.ar, hfVar.bl(), hfVar.ax(), hfVar.aw());
                } else {
                    boolean z = false;
                    kcVar.ao = hf.al(kcVar.ar, hfVar.bl(), 0, hfVar.aw());
                    kp kpVar = this.ad;
                    if (kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0) {
                        z = true;
                    }
                    kpVar.aa(kcVar, z, (byte) -85);
                    kcVar.ao.ah(i5, hfVar.ax());
                }
                if (kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0) {
                    kcVar.ao.as(-1);
                }
                hfVar.bq(i5);
                hfVar.ak(iArr, i, i3 - i);
                if (hfVar.bi()) {
                    this.ar.ad(hfVar);
                }
            }
            kcVar.ay += (i4 * i2) * 1380846329;
        }
        kcVar.ao.ak(iArr, i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void ak(int[] iArr, int i, int i2) {
        try {
            this.ar.ak(iArr, i, i2);
            mb ae = this.aq.ae();
            while (true) {
                kc kcVar = (kc) ae;
                if (kcVar != null) {
                    if (!this.ad.bj(kcVar, (byte) 5)) {
                        int i3 = i;
                        int i4 = i2;
                        while (i4 > kcVar.ah * 1132626509) {
                            ad(kcVar, iArr, i3, kcVar.ah * 1132626509, i4 + i3, 2131427372);
                            i3 += kcVar.ah * 1132626509;
                            int i5 = i4 - (kcVar.ah * 1132626509);
                            if (this.ad.bh(kcVar, iArr, i3, i5, -1132279978)) {
                                break;
                            }
                            i4 = i5;
                        }
                        ad(kcVar, iArr, i3, i4, i3 + i4, 2131427372);
                        kcVar.ah -= -2080995707 * i4;
                    }
                    ae = this.aq.ak();
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kr.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(kc kcVar, int[] iArr, int i, int i2, int i3) {
        if ((this.ad.af[kcVar.ad * 1051654295] & 4) != 0 && kcVar.ax * -427609645 < 0) {
            int i4 = this.ad.at[kcVar.ad * 1051654295] / (hd.ad * 1085227143);
            while (true) {
                int i5 = ((-1802700550 + i4) - (kcVar.ay * -1795778743)) / i4;
                if (i5 > i2) {
                    break;
                }
                kcVar.ao.ak(iArr, i, i5);
                i += i5;
                i2 -= i5;
                kcVar.ay = (((i5 * i4) - 133397998) * 1380846329) + kcVar.ay;
                int i6 = (hd.ad * -754139271) / -1840557640;
                i5 = 262144 / i4;
                if (i5 >= i6) {
                    i5 = i6;
                }
                hf hfVar = kcVar.ao;
                if (this.ad.ab[kcVar.ad * 95393537] == 0) {
                    kcVar.ao = hf.al(kcVar.ar, hfVar.bl(), hfVar.ax(), hfVar.aw());
                } else {
                    kcVar.ao = hf.al(kcVar.ar, hfVar.bl(), 0, hfVar.aw());
                    this.ad.aa(kcVar, kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0, (byte) -110);
                    kcVar.ao.ah(i5, hfVar.ax());
                }
                if (kcVar.aq.ar[kcVar.ai * -460938436] < (short) 0) {
                    kcVar.ao.as(-1);
                }
                hfVar.bq(i5);
                hfVar.ak(iArr, i, i3 - i);
                if (hfVar.bi()) {
                    this.ar.ad(hfVar);
                }
            }
            kcVar.ay += (i4 * i2) * 1380846329;
        }
        kcVar.ao.ak(iArr, i, i2);
    }

    /* Access modifiers changed, original: protected */
    public int am() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public hq an() {
        kc kcVar = (kc) this.aq.ae();
        return kcVar == null ? null : kcVar.ao != null ? kcVar.ao : ae();
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(kc kcVar, int i) {
        boolean z = false;
        if ((this.ad.af[kcVar.ad * 1051654295] & 4) != 0 && kcVar.ax * -427609645 < 0) {
            int i2 = this.ad.at[kcVar.ad * 1051654295] / (hd.ad * -754139271);
            int i3 = ((i2 + 1048575) - (kcVar.ay * -1795778743)) / i2;
            kcVar.ay = (((kcVar.ay * -1795778743) + (i2 * i)) & 1048575) * 1380846329;
            if (i3 <= i) {
                if (this.ad.ab[kcVar.ad * 1051654295] == 0) {
                    kcVar.ao = hf.al(kcVar.ar, kcVar.ao.bl(), kcVar.ao.ax(), kcVar.ao.aw());
                } else {
                    kcVar.ao = hf.al(kcVar.ar, kcVar.ao.bl(), 0, kcVar.ao.aw());
                    kp kpVar = this.ad;
                    if (kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0) {
                        z = true;
                    }
                    kpVar.aa(kcVar, z, (byte) -87);
                }
                if (kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0) {
                    kcVar.ao.as(-1);
                }
                i = (kcVar.ay * -1795778743) / i2;
            }
        }
        kcVar.ao.ag(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(kc kcVar, int i, int i2) {
        boolean z = false;
        try {
            if ((this.ad.af[kcVar.ad * 1051654295] & 4) != 0 && kcVar.ax * -427609645 < 0) {
                int i3 = this.ad.at[kcVar.ad * 1051654295] / (hd.ad * -754139271);
                int i4 = ((i3 + 1048575) - (kcVar.ay * -1795778743)) / i3;
                kcVar.ay = (((kcVar.ay * -1795778743) + (i3 * i)) & 1048575) * 1380846329;
                if (i4 <= i) {
                    if (this.ad.ab[kcVar.ad * 1051654295] == 0) {
                        kcVar.ao = hf.al(kcVar.ar, kcVar.ao.bl(), kcVar.ao.ax(), kcVar.ao.aw());
                    } else {
                        kcVar.ao = hf.al(kcVar.ar, kcVar.ao.bl(), 0, kcVar.ao.aw());
                        kp kpVar = this.ad;
                        if (kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0) {
                            z = true;
                        }
                        kpVar.aa(kcVar, z, (byte) 5);
                    }
                    if (kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0) {
                        kcVar.ao.as(-1);
                    }
                    i = (kcVar.ay * -1795778743) / i3;
                }
            }
            kcVar.ao.ag(i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kr.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(kc kcVar, int[] iArr, int i, int i2, int i3) {
        if ((this.ad.af[kcVar.ad * 45579533] & 4) != 0 && kcVar.ax * -427609645 < 0) {
            int i4 = this.ad.at[kcVar.ad * 1051654295] / (hd.ad * -754139271);
            while (true) {
                int i5 = ((-1945836345 + i4) - (kcVar.ay * -1795778743)) / i4;
                if (i5 > i2) {
                    break;
                }
                kcVar.ao.ak(iArr, i, i5);
                i += i5;
                i2 -= i5;
                kcVar.ay = (((i5 * i4) - 1048576) * 1486352412) + kcVar.ay;
                int i6 = (hd.ad * -1507243289) / 760530472;
                i5 = -1271096177 / i4;
                if (i5 >= i6) {
                    i5 = i6;
                }
                hf hfVar = kcVar.ao;
                if (this.ad.ab[kcVar.ad * 1051654295] == 0) {
                    kcVar.ao = hf.al(kcVar.ar, hfVar.bl(), hfVar.ax(), hfVar.aw());
                } else {
                    kcVar.ao = hf.al(kcVar.ar, hfVar.bl(), 0, hfVar.aw());
                    this.ad.aa(kcVar, kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0, (byte) -5);
                    kcVar.ao.ah(i5, hfVar.ax());
                }
                if (kcVar.aq.ar[kcVar.ai * 1629182465] < (short) 0) {
                    kcVar.ao.as(-1);
                }
                hfVar.bq(i5);
                hfVar.ak(iArr, i, i3 - i);
                if (hfVar.bi()) {
                    this.ar.ad(hfVar);
                }
            }
            kcVar.ay += (i4 * i2) * -121343767;
        }
        kcVar.ao.ak(iArr, i, i2);
    }

    /* Access modifiers changed, original: 0000 */
    public void as(kc kcVar, int i) {
        boolean z = false;
        if ((this.ad.af[kcVar.ad * 1051654295] & 4) != 0 && kcVar.ax * -427609645 < 0) {
            int i2 = this.ad.at[kcVar.ad * 1051654295] / (hd.ad * -754139271);
            int i3 = ((i2 + 1048575) - (kcVar.ay * -1795778743)) / i2;
            kcVar.ay = (((kcVar.ay * -1795778743) + (i2 * i)) & 1048575) * 1380846329;
            if (i3 <= i) {
                if (this.ad.ab[kcVar.ad * 1051654295] == 0) {
                    kcVar.ao = hf.al(kcVar.ar, kcVar.ao.bl(), kcVar.ao.ax(), kcVar.ao.aw());
                } else {
                    kcVar.ao = hf.al(kcVar.ar, kcVar.ao.bl(), 0, kcVar.ao.aw());
                    kp kpVar = this.ad;
                    if (kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0) {
                        z = true;
                    }
                    kpVar.aa(kcVar, z, (byte) -69);
                }
                if (kcVar.aq.ar[kcVar.ai * -1981512837] < (short) 0) {
                    kcVar.ao.as(-1);
                }
                i = (kcVar.ay * -1795778743) / i2;
            }
        }
        kcVar.ao.ag(i);
    }

    /* Access modifiers changed, original: protected */
    public int at() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void au(kc kcVar, int i) {
        boolean z = false;
        if ((this.ad.af[kcVar.ad * -840509594] & 4) != 0 && kcVar.ax * -427609645 < 0) {
            int i2 = this.ad.at[kcVar.ad * -780458759] / (hd.ad * -754139271);
            int i3 = ((-971762691 + i2) - (kcVar.ay * -638578946)) / i2;
            kcVar.ay = (((kcVar.ay * -1795778743) + (i2 * i)) & 1048575) * 1380846329;
            if (i3 <= i) {
                if (this.ad.ab[kcVar.ad * 415672139] == 0) {
                    kcVar.ao = hf.al(kcVar.ar, kcVar.ao.bl(), kcVar.ao.ax(), kcVar.ao.aw());
                } else {
                    kcVar.ao = hf.al(kcVar.ar, kcVar.ao.bl(), 0, kcVar.ao.aw());
                    kp kpVar = this.ad;
                    if (kcVar.aq.ar[kcVar.ai * -1153152081] < (short) 0) {
                        z = true;
                    }
                    kpVar.aa(kcVar, z, (byte) -34);
                }
                if (kcVar.aq.ar[kcVar.ai * 597384290] < (short) 0) {
                    kcVar.ao.as(-1);
                }
                i = (kcVar.ay * 989457489) / i2;
            }
        }
        kcVar.ao.ag(i);
    }

    /* Access modifiers changed, original: protected */
    public int av() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public hq ay() {
        kc kcVar = (kc) this.aq.ae();
        return kcVar == null ? null : kcVar.ao != null ? kcVar.ao : ae();
    }

    /* Access modifiers changed, original: protected */
    public void ba(int[] iArr, int i, int i2) {
        this.ar.ak(iArr, i, i2);
        mb ae = this.aq.ae();
        while (true) {
            kc kcVar = (kc) ae;
            if (kcVar != null) {
                if (!this.ad.bj(kcVar, (byte) -16)) {
                    int i3 = i2;
                    int i4 = i;
                    while (i3 > kcVar.ah * 1132626509) {
                        ad(kcVar, iArr, i4, kcVar.ah * 1132626509, i3 + i4, 2131427372);
                        i4 += kcVar.ah * 1132626509;
                        int i5 = i3 - (kcVar.ah * 1132626509);
                        if (this.ad.bh(kcVar, iArr, i4, i5, -465501698)) {
                            break;
                        }
                        i3 = i5;
                    }
                    ad(kcVar, iArr, i4, i3, i4 + i3, 2131427372);
                    kcVar.ah -= -2080995707 * i3;
                }
                ae = this.aq.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void bd(int i) {
        this.ar.ag(i);
        mb ae = this.aq.ae();
        while (true) {
            kc kcVar = (kc) ae;
            if (kcVar != null) {
                if (!this.ad.bj(kcVar, (byte) -51)) {
                    int i2 = i;
                    while (i2 > kcVar.ah * 1132626509) {
                        aq(kcVar, kcVar.ah * 1132626509, -104564980);
                        i2 -= kcVar.ah * 1132626509;
                        if (this.ad.bh(kcVar, null, 0, i2, -1006311286)) {
                            break;
                        }
                    }
                    aq(kcVar, i2, -104564980);
                    kcVar.ah -= -2080995707 * i2;
                }
                ae = this.aq.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public int bk() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public void bm(int[] iArr, int i, int i2) {
        this.ar.ak(iArr, i, i2);
        mb ae = this.aq.ae();
        while (true) {
            kc kcVar = (kc) ae;
            if (kcVar != null) {
                if (!this.ad.bj(kcVar, (byte) -122)) {
                    int i3 = i2;
                    int i4 = i;
                    while (i3 > kcVar.ah * 1132626509) {
                        ad(kcVar, iArr, i4, kcVar.ah * 1132626509, i3 + i4, 2131427372);
                        i4 += kcVar.ah * 1132626509;
                        int i5 = i3 - (kcVar.ah * 1132626509);
                        if (this.ad.bh(kcVar, iArr, i4, i5, 2010361029)) {
                            break;
                        }
                        i3 = i5;
                    }
                    ad(kcVar, iArr, i4, i3, i4 + i3, 2131427372);
                    kcVar.ah -= -2080995707 * i3;
                }
                ae = this.aq.ak();
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void bs(int[] iArr, int i, int i2) {
        this.ar.ak(iArr, i, i2);
        mb ae = this.aq.ae();
        while (true) {
            kc kcVar = (kc) ae;
            if (kcVar != null) {
                if (!this.ad.bj(kcVar, (byte) -12)) {
                    int i3 = i2;
                    int i4 = i;
                    while (i3 > kcVar.ah * 1132626509) {
                        ad(kcVar, iArr, i4, kcVar.ah * 1132626509, i3 + i4, 2131427372);
                        i4 += kcVar.ah * 1132626509;
                        int i5 = i3 - (kcVar.ah * 1132626509);
                        if (this.ad.bh(kcVar, iArr, i4, i5, -692582798)) {
                            break;
                        }
                        i3 = i5;
                    }
                    ad(kcVar, iArr, i4, i3, i4 + i3, 2131427372);
                    kcVar.ah -= -2080995707 * i3;
                }
                ae = this.aq.ak();
            } else {
                return;
            }
        }
    }
}
