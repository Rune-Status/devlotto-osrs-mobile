package defpackage;

/* renamed from: lt */
public class lt {
    public static final int ad = 2;
    public static final int aq = 3;

    lt() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lt.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ad(short s) {
        try {
            bi.ak = new int[2000];
            int i = 0;
            int i2 = 240;
            while (i < 16) {
                bi.ak[i] = cz.ad((double) (((float) i2) / 360.0f), 0.9998999834060669d, (double) (((((float) i) * 0.425f) / 16.0f) + 0.075f));
                i++;
                i2 -= 12;
            }
            i2 = 48;
            while (i < bi.ak.length) {
                int ad = cz.ad((double) (((float) i2) / 360.0f), 0.9998999834060669d, 0.5d);
                int i3 = i;
                while (i3 < i * 2 && i3 < bi.ak.length) {
                    bi.ak[i3] = ad;
                    i3++;
                }
                i2 -= 8;
                i = i3;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lt.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int al(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if ((i6 & 1) == 1) {
            i8 = i5;
            i9 = i4;
        } else {
            i8 = i4;
            i9 = i5;
        }
        int i10 = i3 & 3;
        return i10 == 0 ? i2 : 1 == i10 ? (7 - i) - (i8 - 1) : i10 == 2 ? (7 - i2) - (i9 - 1) : i;
    }

    static final int aw(int i, int i2, int i3, int i4, byte b) {
        try {
            int i5 = (65536 - bl.ao[(i3 * 1024) / i4]) >> 1;
            return ((i5 * i2) >> 16) + (((65536 - i5) * i) >> 16);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lt.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void eo(byte b) {
        try {
            de.ez(false, (byte) 124);
            client.fd = 0;
            int i = 0;
            Object obj = 1;
            while (i < em.fe.length) {
                if (hb.fb[i] != -1 && em.fe[i] == null) {
                    em.fe[i] = dh.ch.ar(hb.fb[i], 0, 925697726);
                    if (em.fe[i] == null) {
                        client.fd += 1383152275;
                        obj = null;
                    }
                }
                if (-1 != je.fp[i] && bq.fl[i] == null) {
                    bq.fl[i] = dh.ch.al(je.fp[i], 0, lh.fo[i], -1268309390);
                    if (bq.fl[i] == null) {
                        client.fd += 1383152275;
                        obj = null;
                    }
                }
                i++;
            }
            if (obj == null) {
                client.fu = -710603943;
                return;
            }
            int i2;
            int i3;
            client.fj = 0;
            int i4 = 1;
            for (i2 = 0; i2 < em.fe.length; i2++) {
                byte[] bArr = bq.fl[i2];
                if (bArr != null) {
                    i = ((gi.fc[i2] >> 8) * 64) - (oz.ff * 2060098323);
                    i3 = ((gi.fc[i2] & 255) * 64) - (cq.fz * -1866366501);
                    if (client.gw) {
                        i = 10;
                        i3 = 10;
                    }
                    i4 &= ej.am(bArr, i, i3, -960061635);
                }
            }
            if (i4 == 0) {
                client.fu = -1421207886;
                return;
            }
            int i5;
            int i6;
            int i7;
            int i8;
            if (client.fu * -793473815 != 0) {
                client.aq.uk.am(527432848);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(go.ap);
                stringBuilder.append(iz.ae);
                stringBuilder.append(iz.al);
                stringBuilder.append(100);
                stringBuilder.append("%");
                stringBuilder.append(iz.aj);
                mv.cg(stringBuilder.toString(), true, 1401877624);
            }
            bt.bw((byte) 17);
            ce.fk.ad();
            for (i4 = 0; i4 < 4; i4++) {
                client.gc[i4].ad((byte) 0);
            }
            i4 = 0;
            while (true) {
                i3 = i4;
                if (i3 >= 4) {
                    break;
                }
                i4 = 0;
                while (true) {
                    i = i4;
                    if (i >= 104) {
                        break;
                    }
                    for (i4 = 0; i4 < 104; i4++) {
                        in.aq[i3][i][i4] = (byte) 0;
                    }
                    i4 = i + 1;
                }
                i4 = i3 + 1;
            }
            bt.bw((byte) 79);
            ba.ad(-118989527);
            int length = em.fe.length;
            hv.ad(-519697303);
            de.ez(true, (byte) 32);
            if (!client.gw) {
                byte[] bArr2;
                for (i5 = 0; i5 < length; i5++) {
                    i = gi.fc[i5];
                    i3 = oz.ff;
                    i2 = gi.fc[i5];
                    i6 = cq.fz;
                    bArr2 = em.fe[i5];
                    if (bArr2 != null) {
                        bt.bw((byte) -28);
                        bi.al(bArr2, ((i >> 8) * 64) - (i3 * 2060098323), ((i2 & 255) * 64) - (-1866366501 * i6), (jw.fa * 99003128) - 48, (ak.fv * -1307754344) - 48, client.gc, (byte) 76);
                    }
                }
                for (i4 = 0; i4 < length; i4++) {
                    i = gi.fc[i4];
                    i3 = oz.ff;
                    i2 = gi.fc[i4];
                    i6 = cq.fz;
                    if (em.fe[i4] == null && ak.fv * -1774082029 < 800) {
                        bt.bw((byte) -98);
                        hr.ar(((i >> 8) * 64) - (i3 * 2060098323), ((i2 & 255) * 64) - (-1866366501 * i6), 64, 64, -1162548156);
                    }
                }
                de.ez(true, (byte) 9);
                for (i7 = 0; i7 < length; i7++) {
                    bArr2 = bq.fl[i7];
                    if (bArr2 != null) {
                        i = gi.fc[i7];
                        i3 = oz.ff;
                        i2 = gi.fc[i7];
                        i6 = cq.fz;
                        bt.bw((byte) 18);
                        el.ak(bArr2, ((i >> 8) * 64) - (i3 * 2060098323), ((i2 & 255) * 64) - (-1866366501 * i6), ce.fk, client.gc, 1178194327);
                    }
                }
            }
            if (client.gw) {
                int i9;
                for (i = 0; i < 4; i++) {
                    bt.bw((byte) 27);
                    i4 = 0;
                    while (true) {
                        i9 = i4;
                        if (i9 >= 13) {
                            break;
                        }
                        for (int i10 = 0; i10 < 13; i10++) {
                            i5 = client.gp[i][i9][i10];
                            if (-1 != i5) {
                                i8 = (i5 >> 14) & 1023;
                                i7 = (i5 >> 3) & 2047;
                                i3 = i8 / 8;
                                i2 = i7 / 8;
                                i4 = 0;
                                while (i4 < gi.fc.length) {
                                    if ((i3 << 8) + i2 == gi.fc[i4] && em.fe[i4] != null) {
                                        cj.aj(em.fe[i4], i, i9 * 8, i10 * 8, (i5 >> 24) & 3, (i8 & 7) * 8, (i7 & 7) * 8, (i5 >> 1) & 3, client.gc, 1697208132);
                                        obj = 1;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            obj = null;
                            if (obj == null) {
                                do.ai(i, i9 * 8, i10 * 8, (byte) -113);
                            }
                        }
                        i4 = i9 + 1;
                    }
                }
                i4 = 0;
                while (true) {
                    i = i4;
                    if (i >= 13) {
                        break;
                    }
                    for (i4 = 0; i4 < 13; i4++) {
                        if (client.gp[0][i][i4] == -1) {
                            hr.ar(i * 8, i4 * 8, 8, 8, 1339917540);
                        }
                    }
                    i4 = i + 1;
                }
                de.ez(true, (byte) 84);
                for (i = 0; i < 4; i++) {
                    bt.bw((byte) 27);
                    i4 = 0;
                    while (true) {
                        int i11 = i4;
                        if (i11 >= 13) {
                            break;
                        }
                        for (i9 = 0; i9 < 13; i9++) {
                            i5 = client.gp[i][i11][i9];
                            if (i5 != -1) {
                                i8 = (i5 >> 14) & 1023;
                                i7 = (i5 >> 3) & 2047;
                                i3 = i8 / 8;
                                i2 = i7 / 8;
                                i4 = 0;
                                while (i4 < gi.fc.length) {
                                    if ((i3 << 8) + i2 == gi.fc[i4] && bq.fl[i4] != null) {
                                        ab.as(bq.fl[i4], i, i11 * 8, i9 * 8, (i5 >> 24) & 3, (i8 & 7) * 8, (i7 & 7) * 8, (i5 >> 1) & 3, ce.fk, client.gc, -526333493);
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        }
                        i4 = i11 + 1;
                    }
                }
            }
            de.ez(true, (byte) 107);
            bt.bw((byte) 18);
            jn.ap(ce.fk, client.gc, 153510495);
            de.ez(true, (byte) 113);
            i4 = in.ar * 474821241;
            if (i4 > am.jy * 1973701849) {
                i4 = am.jy * 1973701849;
            }
            if (i4 < (am.jy * 1973701849) - 1) {
                i4 = am.jy;
            }
            if (client.as) {
                ce.fk.aq(in.ar * 474821241);
            } else {
                ce.fk.aq(0);
            }
            i4 = 0;
            while (true) {
                i = i4;
                if (i >= 104) {
                    break;
                }
                for (i4 = 0; i4 < 104; i4++) {
                    ek.er(i, i4, 741165799);
                }
                i4 = i + 1;
            }
            bt.bw((byte) -29);
            ai.en(-631565567);
            dx.aj.al();
            if (client.aq.adc(719851941)) {
                ns aq = ib.aq(no.as, client.eb.aj, 212072780);
                aq.ar.ae(1057001181, (byte) 94);
                client.eb.ar(aq, -1629192313);
            }
            if (!client.gw) {
                i3 = ((jw.fa * 1622988127) - 6) / 8;
                i2 = ((jw.fa * 1622988127) + 6) / 8;
                i6 = ((ak.fv * -1774082029) - 6) / 8;
                i8 = ((ak.fv * -1774082029) + 6) / 8;
                i4 = i3 - 1;
                while (true) {
                    i = i4;
                    if (i > i2 + 1) {
                        break;
                    }
                    i4 = i6 - 1;
                    while (i4 <= i8 + 1) {
                        if (i < i3 || i > i2 || i4 < i6 || i4 > i8) {
                            kv kvVar = dh.ch;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("m");
                            stringBuilder2.append(i);
                            stringBuilder2.append("_");
                            stringBuilder2.append(i4);
                            kvVar.bk(stringBuilder2.toString(), 1286187574);
                            kvVar = dh.ch;
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("l");
                            stringBuilder2.append(i);
                            stringBuilder2.append("_");
                            stringBuilder2.append(i4);
                            kvVar.bk(stringBuilder2.toString(), -634044302);
                        }
                        i4++;
                    }
                    i4 = i + 1;
                }
            }
            he.ac(30, (byte) 102);
            bt.bw((byte) -59);
            cj.aq(-345800283);
            client.eb.ar(ib.aq(no.cg, client.eb.aj, 378296580), -615548865);
            il.adv(-3403253);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("lt.eo(");
            stringBuilder3.append(')');
            throw mv.aq(e, stringBuilder3.toString());
        }
    }
}
