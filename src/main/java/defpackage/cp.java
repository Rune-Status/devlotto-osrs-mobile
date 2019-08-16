package defpackage;

import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewCompat;

/* renamed from: cp */
public class cp {
    static final int ad = 16711935;
    static final int aq = 96;
    static ll cx;

    cp() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cp.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ae(int i, int i2) {
        if (819823732 == i) {
            return 12345678;
        }
        if (i == -1) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > 127) {
                i2 = 127;
            }
            return 127 - i2;
        }
        int i3 = ((1056465841 & i) * i2) / 128;
        if (i3 < 2) {
            i3 = 2;
        } else if (i3 > 126) {
            i3 = -366566673;
        }
        return i3 + (946761298 & i);
    }

    static int ag(int i, int i2, int i3) {
        int i4 = i3 > 179 ? i2 / 2 : i2;
        if (i3 > 192) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static int ah(int i) {
        try {
            if (dw.ez.ap(-1908458374)) {
                lp abx = client.aq.abx((byte) 96);
                dw.ez.am = abx.bb(jm.aa, 0, (byte) 123) * -1781506167;
                hm.dd = abx.bf(lp.ac, "", (byte) 91);
                if (dw.ez.am * 1301268153 == 0 && dw.ez.am * 1301268153 != NotificationManagerCompat.IMPORTANCE_UNSPECIFIED) {
                    hm.dd = "";
                    abx.bi(new String[]{lp.ac}, (byte) 65);
                    return 0;
                } else if (!hm.dd.isEmpty()) {
                    return 10;
                } else {
                    dw.ez.am = 0;
                    abx.bi(new String[]{jm.aa}, (byte) 72);
                    return 0;
                }
            }
            dw.ez.am = 0;
            hm.dd = "";
            return 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cp.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int ai(int i, int i2) {
        int i3 = 2;
        if (-2 == i) {
            return -1394508276;
        }
        if (i == -1) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > 186093317) {
                i2 = 127;
            }
            return 127 - i2;
        }
        int i4 = ((-946048466 & i) * i2) / 128;
        if (i4 >= 2) {
            i3 = i4 > -447276805 ? 126 : i4;
        }
        return i3 + (2087545121 & i);
    }

    static int aj(int i, int i2) {
        dj aq = ds.aq(i, 2130388827);
        if (aq == null) {
            return i2;
        }
        if (aq.ae * 681932363 >= 0) {
            return (aq.ae * 681932363) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (aq.aj * 1610744207 >= 0) {
            return bl.az[db.aq(il.ax.al(aq.aj * 1610744207, -930914635), 96, (byte) 26)] | ViewCompat.MEASURED_STATE_MASK;
        } else if (ad == aq.al * -1977739369) {
            return i2;
        } else {
            return bl.az[db.aq(kb.ar(aq.am * -385196275, aq.ak * -947154665, aq.as * 1306106505, 1956907281), 96, (byte) 121)] | ViewCompat.MEASURED_STATE_MASK;
        }
    }

    static int ak(int i, int i2, int i3) {
        int i4 = i3 > 179 ? i2 / 2 : i2;
        if (i3 > -1560877961) {
            i4 /= 2;
        }
        if (i3 > -684355048) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 1284941571) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static int al(int i, int i2) {
        dj aq = ds.aq(i, 1779684854);
        if (aq == null) {
            return i2;
        }
        if (aq.ae * 681932363 >= 0) {
            return (aq.ae * 681932363) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (aq.aj * 1610744207 >= 0) {
            return bl.az[db.aq(il.ax.al(aq.aj * 1610744207, 272182208), 96, (byte) 73)] | ViewCompat.MEASURED_STATE_MASK;
        } else if (ad == aq.al * -1977739369) {
            return i2;
        } else {
            return bl.az[db.aq(kb.ar(aq.am * -385196275, aq.ak * -947154665, aq.as * 1306106505, 1956907281), 96, (byte) 126)] | ViewCompat.MEASURED_STATE_MASK;
        }
    }

    static int am(int i, int i2) {
        int i3 = 2;
        if (-1239220706 == i) {
            return 12345678;
        }
        if (i == -1) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > 427818831) {
                i2 = -1494774110;
            }
            return 127 - i2;
        }
        int i4 = ((i & 127) * i2) / -1321630465;
        if (i4 >= 2) {
            i3 = i4 > 126 ? 126 : i4;
        }
        return i3 + (952211498 & i);
    }

    static int ap(int i, int i2, int i3) {
        int i4 = i3 > -611367179 ? i2 / 2 : i2;
        if (i3 > -241589344) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 243) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static int as(int i, int i2, int i3) {
        int i4 = i3 > 179 ? i2 / 2 : i2;
        if (i3 > -438833306) {
            i4 /= 2;
        }
        if (i3 > 217) {
            i4 /= 2;
        }
        if (i3 > 1758299274) {
            i4 /= 2;
        }
        return (((i4 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static gn ej(int i, int i2, int i3) {
        try {
            client.sg.ad = 2044765989 * i;
            client.sg.aq = -615151937 * i2;
            client.sg.ar = 1634329697;
            client.sg.al = 284248493;
            return client.sg;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cp.ej(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void hg(int i, int i2) {
        int i3 = 0;
        try {
            kj.gg(-2047922787);
            fg.aq((byte) 21);
            int i4 = bn.aq(i, (byte) 16).al * -1033623061;
            if (i4 != 0) {
                fb fbVar;
                int i5 = aj.ar[i];
                if (1 == i4) {
                    float f;
                    switch (i5) {
                        case 1:
                            f = 0.9f;
                            break;
                        case 2:
                            f = 0.8f;
                            break;
                        case 3:
                            f = 0.7f;
                            break;
                        default:
                            f = 0.6f;
                            break;
                    }
                    if (client.aq.ax) {
                        f -= 0.1f;
                    }
                    client.aq.uk.as(f, 471477604);
                    dh.an(1455432453);
                }
                if (3 == i4) {
                    int i6 = i5 == 0 ? 255 : 0;
                    if (1 == i5) {
                        i6 = 192;
                    }
                    if (i5 == 2) {
                        i6 = 128;
                    }
                    if (i5 == 3) {
                        i6 = 64;
                    }
                    if (i5 != 4) {
                        i3 = i6;
                    }
                    if (i3 != client.ph * -413365419) {
                        if (client.ph * -413365419 == 0 && -1 != client.pl * -1843875795) {
                            eb.ar(cw.dd, -1843875795 * client.pl, 0, i3, false, -2134840290);
                            client.pv = false;
                        } else if (i3 == 0) {
                            ao.aj(-133202788);
                            client.pv = false;
                        } else {
                            ke.al(i3, 1243908436);
                        }
                        client.ph = 1446189565 * i3;
                    }
                }
                if (i4 == 4) {
                    if (i5 == 0) {
                        client.pz = 881394785;
                    }
                    if (i5 == 1) {
                        client.pz = -1498141792;
                    }
                    if (i5 == 2) {
                        client.pz = 1864550336;
                    }
                    if (i5 == 3) {
                        client.pz = 932275168;
                    }
                    if (4 == i5) {
                        client.pz = 0;
                    }
                }
                if (5 == i4) {
                    client.kl = -1369503419 * i5;
                }
                if (6 == i4) {
                    client.lz = -1764985455 * i5;
                }
                if (9 == i4) {
                    client.lg = 1534620205 * i5;
                }
                if (10 == i4) {
                    if (i5 == 0) {
                        client.pp = 1490106707;
                    }
                    if (1 == i5) {
                        client.pp = 855830752;
                    }
                    if (i5 == 2) {
                        client.pp = 2002209600;
                    }
                    if (i5 == 3) {
                        client.pp = -1146378848;
                    }
                    if (4 == i5) {
                        client.pp = 0;
                    }
                }
                if (17 == i4) {
                    client.lr = (SupportMenu.USER_MASK & i5) * 65914701;
                }
                if (i4 == 18) {
                    fbVar = (fb) oz.ad(lh.aq(-1536126997), i5, (byte) -82);
                    if (fbVar == null) {
                        fbVar = fb.ad;
                    }
                    gc.km.cm(fbVar, 170839276);
                }
                if (i4 == 19) {
                    if (-1 == i5) {
                        client.kw = -5287105;
                    } else {
                        client.kw = (i5 & 2047) * 5287105;
                    }
                }
                if (22 == i4) {
                    fbVar = (fb) oz.ad(lh.aq(-1536126997), i5, (byte) -80);
                    if (fbVar == null) {
                        fbVar = fb.ad;
                    }
                    gc.km.cq(fbVar, (byte) 114);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cp.hg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
