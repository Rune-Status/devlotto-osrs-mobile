package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: mh */
public final class mh {
    static byte[] ad = new byte[520];
    int aj;
    int al;
    of aq;
    of ar;

    public mh(int i, of ofVar, of ofVar2, int i2) {
        try {
            this.aq = null;
            this.ar = null;
            this.aj = 1356672680;
            this.al = 1509410101 * i;
            this.aq = ofVar;
            this.ar = ofVar2;
            this.aj = -1302014983 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mh.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void aj(int i, int i2, int i3, int i4, int i5) {
        try {
            mb ae = ib.ad.ae();
            while (true) {
                ib ibVar = (ib) ae;
                if (ibVar != null) {
                    if (-1 != ibVar.am * 1046754583 || ibVar.ap != null) {
                        int i6 = i2 > ibVar.aj * 1473036269 ? (i2 - (ibVar.aj * 1473036269)) + 0 : i2 < ibVar.ar * 1319686961 ? ((ibVar.ar * 1319686961) - i2) + 0 : 0;
                        if (i3 > ibVar.ai * -1743535669) {
                            i6 += i3 - (ibVar.ai * -1743535669);
                        } else if (i3 < ibVar.al * -1701208527) {
                            i6 += (ibVar.al * -1701208527) - i3;
                        }
                        if (i6 - 64 > ibVar.ae * 473397289 || client.pp * 1070201509 == 0 || ibVar.aq * -1403904653 != i) {
                            if (ibVar.ak != null) {
                                gd.pf.aq(ibVar.ak);
                                ibVar.ak = null;
                            }
                            if (ibVar.az != null) {
                                gd.pf.aq(ibVar.az);
                                ibVar.az = null;
                            }
                        } else {
                            hp ad;
                            i6 -= 64;
                            if (i6 < 0) {
                                i6 = 0;
                            }
                            i6 = (((ibVar.ae * 473397289) - i6) * (client.pp * 1070201509)) / (ibVar.ae * 473397289);
                            if (ibVar.ak != null) {
                                ibVar.ak.ap(i6);
                            } else if (ibVar.am * 1046754583 >= 0) {
                                ad = hp.ad(av.cg, ibVar.am * 1046754583, 0);
                                if (ad != null) {
                                    hf ar = hf.ar(ad.aq().ad(dk.px), 100, i6);
                                    ar.as(-1);
                                    gd.pf.ad(ar);
                                    ibVar.ak = ar;
                                }
                            }
                            if (ibVar.az != null) {
                                ibVar.az.ap(i6);
                                if (!ibVar.az.ke()) {
                                    ibVar.az = null;
                                }
                            } else if (ibVar.ap != null) {
                                int i7 = ibVar.au - (1690418027 * i4);
                                ibVar.au = i7;
                                if (i7 * 1008441667 <= 0) {
                                    ad = hp.ad(av.cg, ibVar.ap[(int) (Math.random() * ((double) ibVar.ap.length))], 0);
                                    if (ad != null) {
                                        hf ar2 = hf.ar(ad.aq().ad(dk.px), 100, i6);
                                        ar2.as(0);
                                        gd.pf.ad(ar2);
                                        ibVar.az = ar2;
                                        ibVar.au = ((ibVar.as * 510766937) + ((int) (Math.random() * ((double) ((ibVar.ag * -761423773) - (ibVar.as * 510766937)))))) * 1690418027;
                                    }
                                }
                            }
                        }
                    }
                    ae = ib.ad.ak();
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mh.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int bj(int i, int i2, int i3, int i4, int i5) {
        return ((i2 * i3) - (i4 * i)) >> 16;
    }

    public byte[] ad(int i, byte b) {
        try {
            synchronized (this.aq) {
                try {
                    int i2 = i * 6;
                    if (this.ar.ar(1051654295) < ((long) (i2 + 6))) {
                        return null;
                    }
                    this.ar.aq((long) i2);
                    this.ar.aj(ad, 0, 6, -1848127243);
                    int i3 = (((ad[0] & 255) << 16) + ((ad[1] & 255) << 8)) + (ad[2] & 255);
                    int i4 = (((ad[4] & 255) << 8) + ((ad[3] & 255) << 16)) + (ad[5] & 255);
                    if (i3 < 0 || i3 > this.aj * 1828945481) {
                        return null;
                    }
                    if (i4 > 0) {
                        if (((long) i4) <= this.aq.ar(1051654295) / 520) {
                            byte[] bArr = new byte[i3];
                            int i5 = 0;
                            int i6 = 0;
                            while (i5 < i3) {
                                if (i4 == 0) {
                                    return null;
                                }
                                int i7;
                                int i8;
                                this.aq.aq(((long) i4) * 520);
                                int i9 = i3 - i5;
                                int i10;
                                if (i > 65535) {
                                    if (i9 > 510) {
                                        i9 = 510;
                                    }
                                    this.aq.aj(ad, 0, i9 + 10, 1728179150);
                                    i7 = (((ad[2] & 255) << 8) + (((ad[1] & 255) << 16) + ((ad[0] & 255) << 24))) + (ad[3] & 255);
                                    i4 = (((ad[7] & 255) << 8) + ((ad[6] & 255) << 16)) + (ad[8] & 255);
                                    i10 = ad[9] & 255;
                                    i8 = ((ad[4] & 255) << 8) + (ad[5] & 255);
                                    i2 = 10;
                                } else {
                                    if (i9 > 512) {
                                        i9 = 512;
                                    }
                                    this.aq.aj(ad, 0, i9 + 8, 1547505963);
                                    i7 = (ad[1] & 255) + ((ad[0] & 255) << 8);
                                    i8 = ((ad[2] & 255) << 8) + (ad[3] & 255);
                                    i4 = (((ad[4] & 255) << 16) + ((ad[5] & 255) << 8)) + (ad[6] & 255);
                                    i10 = ad[7] & 255;
                                    i2 = 8;
                                }
                                if (i7 != i || i6 != i8 || this.al * -713677539 != i10) {
                                    return null;
                                } else if (i4 < 0 || ((long) i4) > this.aq.ar(1051654295) / 520) {
                                    return null;
                                } else {
                                    i8 = i2;
                                    while (i8 < i2 + i9) {
                                        bArr[i5] = ad[i8];
                                        i8++;
                                        i5++;
                                    }
                                    i6++;
                                }
                            }
                            return bArr;
                        }
                    }
                    return null;
                } catch (IOException e) {
                    return null;
                }
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mh.ad(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ae(int i, byte[] bArr, int i2, boolean z) {
        synchronized (this.aq) {
            int i3;
            if (z) {
                try {
                    int i4 = i * 6;
                    if (this.ar.ar(1051654295) < ((long) (i4 + 6))) {
                        return false;
                    }
                    this.ar.aq((long) i4);
                    this.ar.aj(ad, 0, 6, 1404432136);
                    i3 = (ad[5] & -1698533263) + (((ad[4] & 255) << 8) + ((ad[3] & 225845933) << 16));
                    if (i3 <= 0 || ((long) i3) > this.aq.ar(1051654295) / 520) {
                        return false;
                    }
                } catch (IOException e) {
                    return false;
                }
            }
            i3 = (int) ((this.aq.ar(1051654295) + 519) / 520);
            if (i3 == 0) {
                i3 = 1;
            }
            ad[0] = (byte) (i2 >> 16);
            ad[1] = (byte) (i2 >> 8);
            ad[2] = (byte) i2;
            ad[3] = (byte) (i3 >> 16);
            ad[4] = (byte) (i3 >> 8);
            ad[5] = (byte) i3;
            this.ar.aq((long) (i * 6));
            this.ar.ae(ad, 0, 6, 1918872850);
            int i5 = i3;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = z;
            while (i6 < i2) {
                int i8;
                if (z2) {
                    int i9;
                    this.aq.aq(((long) i5) * 520);
                    int i10;
                    if (i > 65535) {
                        try {
                            this.aq.aj(ad, 0, 10, 952339580);
                            i9 = ((((ad[1] & 1862585160) << 16) + ((ad[0] & 255) << 24)) + ((ad[2] & -1336350863) << 8)) + (ad[3] & 921382687);
                            i10 = (ad[5] & 675014150) + ((ad[4] & 1426597019) << 8);
                            i3 = (ad[8] & 255) + (((ad[6] & -1404941155) << 16) + ((ad[7] & -128273580) << 8));
                            i8 = ad[9] & 255;
                        } catch (EOFException e2) {
                        }
                    } else {
                        this.aq.aj(ad, 0, 8, 1357422326);
                        i9 = (ad[1] & 984643143) + ((ad[0] & -1360984332) << 8);
                        i10 = ((ad[2] & 870049028) << 8) + (ad[3] & -266185013);
                        i3 = (ad[6] & -836106939) + (((ad[5] & 1797102010) << 8) + ((ad[4] & -726000104) << 16));
                        i8 = ad[7] & 255;
                    }
                    if (i != i9 || i10 != i7 || this.al * -713677539 != i8) {
                        return false;
                    } else if (i3 < 0 || ((long) i3) > this.aq.ar(1051654295) / 520) {
                        return false;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                    i8 = (int) ((this.aq.ar(1051654295) + 519) / 520);
                    if (i8 == 0) {
                        i8++;
                    }
                    if (i5 == i8) {
                        i8++;
                    }
                    z2 = false;
                    i3 = i8;
                }
                if (i > 65535) {
                    i8 = i2 - i6;
                    if (i8 <= -1993484538) {
                        i3 = 0;
                    }
                    ad[0] = (byte) (i >> 24);
                    ad[1] = (byte) (i >> 16);
                    ad[2] = (byte) (i >> 8);
                    ad[3] = (byte) i;
                    ad[4] = (byte) (i7 >> 8);
                    ad[5] = (byte) i7;
                    ad[6] = (byte) (i3 >> 16);
                    ad[7] = (byte) (i3 >> 8);
                    ad[8] = (byte) i3;
                    ad[9] = (byte) (this.al * -713677539);
                    this.aq.aq(((long) i5) * 520);
                    this.aq.ae(ad, 0, 10, 1869261483);
                    if (i8 > 510) {
                        i8 = -1349046051;
                    }
                    this.aq.ae(bArr, i6, i8, 1966652146);
                } else {
                    i8 = i2 - i6;
                    if (i8 <= 512) {
                        i3 = 0;
                    }
                    ad[0] = (byte) (i >> 8);
                    ad[1] = (byte) i;
                    ad[2] = (byte) (i7 >> 8);
                    ad[3] = (byte) i7;
                    ad[4] = (byte) (i3 >> 16);
                    ad[5] = (byte) (i3 >> 8);
                    ad[6] = (byte) i3;
                    ad[7] = (byte) (this.al * -713677539);
                    this.aq.aq(((long) i5) * 520);
                    this.aq.ae(ad, 0, 8, 1995008300);
                    if (i8 > 512) {
                        i8 = 512;
                    }
                    this.aq.ae(bArr, i6, i8, 1963276972);
                }
                i5 = i3;
                i6 = i8 + i6;
                i7++;
            }
            return true;
        }
    }

    public boolean ai(int i, byte[] bArr, int i2) {
        boolean ar;
        synchronized (this.aq) {
            if (i2 >= 0) {
                if (i2 <= this.aj * 1828945481) {
                    ar = ar(i, bArr, i2, true, 924464555);
                    if (!ar) {
                        ar = ar(i, bArr, i2, false, -177371490);
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.al * -713677539);
            stringBuilder.append(',');
            stringBuilder.append(i);
            stringBuilder.append(',');
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return ar;
    }

    public boolean aj(int i, byte[] bArr, int i2) {
        boolean ar;
        synchronized (this.aq) {
            if (i2 >= 0) {
                if (i2 <= this.aj * 1828945481) {
                    ar = ar(i, bArr, i2, true, -1387634233);
                    if (!ar) {
                        ar = ar(i, bArr, i2, false, -1205996340);
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.al * 1851619805);
            stringBuilder.append(28714);
            stringBuilder.append(i);
            stringBuilder.append(28276);
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return ar;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ak(int i, byte[] bArr, int i2, boolean z) {
        synchronized (this.aq) {
            int i3;
            if (z) {
                try {
                    int i4 = i * 6;
                    if (this.ar.ar(1051654295) < ((long) (i4 + 6))) {
                        return false;
                    }
                    this.ar.aq((long) i4);
                    this.ar.aj(ad, 0, 6, -1922059046);
                    i3 = (ad[5] & 255) + (((ad[4] & 255) << 8) + ((ad[3] & 255) << 16));
                    if (i3 <= 0 || ((long) i3) > this.aq.ar(1051654295) / 520) {
                        return false;
                    }
                } catch (IOException e) {
                    return false;
                }
            }
            i3 = (int) ((this.aq.ar(1051654295) + 519) / 520);
            if (i3 == 0) {
                i3 = 1;
            }
            ad[0] = (byte) (i2 >> 16);
            ad[1] = (byte) (i2 >> 8);
            ad[2] = (byte) i2;
            ad[3] = (byte) (i3 >> 16);
            ad[4] = (byte) (i3 >> 8);
            ad[5] = (byte) i3;
            this.ar.aq((long) (i * 6));
            this.ar.ae(ad, 0, 6, 1338756374);
            int i5 = i3;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = z;
            while (i6 < i2) {
                int i8;
                if (z2) {
                    int i9;
                    this.aq.aq(((long) i5) * 520);
                    int i10;
                    if (i > 65535) {
                        try {
                            this.aq.aj(ad, 0, 10, 1707463877);
                            i9 = ((((ad[1] & 255) << 16) + ((ad[0] & 255) << 24)) + ((ad[2] & 255) << 8)) + (ad[3] & 255);
                            i10 = (ad[5] & 255) + ((ad[4] & 255) << 8);
                            i3 = (ad[8] & 255) + (((ad[6] & 255) << 16) + ((ad[7] & 255) << 8));
                            i8 = ad[9] & 255;
                        } catch (EOFException e2) {
                        }
                    } else {
                        this.aq.aj(ad, 0, 8, -266378131);
                        i9 = (ad[1] & 255) + ((ad[0] & 255) << 8);
                        i10 = ((ad[2] & 255) << 8) + (ad[3] & 255);
                        i3 = (ad[6] & 255) + (((ad[5] & 255) << 8) + ((ad[4] & 255) << 16));
                        i8 = ad[7] & 255;
                    }
                    if (i != i9 || i10 != i7 || this.al * -713677539 != i8) {
                        return false;
                    } else if (i3 < 0 || ((long) i3) > this.aq.ar(1051654295) / 520) {
                        return false;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                    i8 = (int) ((this.aq.ar(1051654295) + 519) / 520);
                    if (i8 == 0) {
                        i8++;
                    }
                    if (i5 == i8) {
                        i8++;
                    }
                    z2 = false;
                    i3 = i8;
                }
                if (i > 65535) {
                    i8 = i2 - i6;
                    if (i8 <= 510) {
                        i3 = 0;
                    }
                    ad[0] = (byte) (i >> 24);
                    ad[1] = (byte) (i >> 16);
                    ad[2] = (byte) (i >> 8);
                    ad[3] = (byte) i;
                    ad[4] = (byte) (i7 >> 8);
                    ad[5] = (byte) i7;
                    ad[6] = (byte) (i3 >> 16);
                    ad[7] = (byte) (i3 >> 8);
                    ad[8] = (byte) i3;
                    ad[9] = (byte) (this.al * -713677539);
                    this.aq.aq(((long) i5) * 520);
                    this.aq.ae(ad, 0, 10, 1725592727);
                    if (i8 > 510) {
                        i8 = 510;
                    }
                    this.aq.ae(bArr, i6, i8, 1724247566);
                } else {
                    i8 = i2 - i6;
                    if (i8 <= 512) {
                        i3 = 0;
                    }
                    ad[0] = (byte) (i >> 8);
                    ad[1] = (byte) i;
                    ad[2] = (byte) (i7 >> 8);
                    ad[3] = (byte) i7;
                    ad[4] = (byte) (i3 >> 16);
                    ad[5] = (byte) (i3 >> 8);
                    ad[6] = (byte) i3;
                    ad[7] = (byte) (this.al * -713677539);
                    this.aq.aq(((long) i5) * 520);
                    this.aq.ae(ad, 0, 8, 1963089514);
                    if (i8 > 512) {
                        i8 = 512;
                    }
                    this.aq.ae(bArr, i6, i8, 1296943847);
                }
                i5 = i3;
                i6 = i8 + i6;
                i7++;
            }
            return true;
        }
    }

    public boolean al(int i, byte[] bArr, int i2) {
        boolean ar;
        synchronized (this.aq) {
            if (i2 >= 0) {
                if (i2 <= this.aj * 1828945481) {
                    ar = ar(i, bArr, i2, true, 1533266610);
                    if (!ar) {
                        ar = ar(i, bArr, i2, false, -773304670);
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.al * -713677539);
            stringBuilder.append(',');
            stringBuilder.append(i);
            stringBuilder.append(',');
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return ar;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean am(int i, byte[] bArr, int i2, boolean z) {
        synchronized (this.aq) {
            int i3;
            if (z) {
                try {
                    int i4 = i * 6;
                    if (this.ar.ar(1051654295) < ((long) (i4 + 6))) {
                        return false;
                    }
                    this.ar.aq((long) i4);
                    this.ar.aj(ad, 0, 6, -192330374);
                    i3 = (ad[5] & 255) + (((ad[4] & 255) << 8) + ((ad[3] & 255) << 16));
                    if (i3 <= 0 || ((long) i3) > this.aq.ar(1051654295) / 520) {
                        return false;
                    }
                } catch (IOException e) {
                    return false;
                }
            }
            i3 = (int) ((this.aq.ar(1051654295) + 519) / 520);
            if (i3 == 0) {
                i3 = 1;
            }
            ad[0] = (byte) (i2 >> 16);
            ad[1] = (byte) (i2 >> 8);
            ad[2] = (byte) i2;
            ad[3] = (byte) (i3 >> 16);
            ad[4] = (byte) (i3 >> 8);
            ad[5] = (byte) i3;
            this.ar.aq((long) (i * 6));
            this.ar.ae(ad, 0, 6, 2002015826);
            int i5 = i3;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = z;
            while (i6 < i2) {
                int i8;
                if (z2) {
                    int i9;
                    this.aq.aq(((long) i5) * 520);
                    int i10;
                    if (i > 65535) {
                        try {
                            this.aq.aj(ad, 0, 10, 865084335);
                            i9 = ((((ad[1] & 255) << 16) + ((ad[0] & 255) << 24)) + ((ad[2] & 255) << 8)) + (ad[3] & 255);
                            i10 = (ad[5] & 255) + ((ad[4] & 255) << 8);
                            i3 = (ad[8] & 255) + (((ad[6] & 255) << 16) + ((ad[7] & 255) << 8));
                            i8 = ad[9] & 255;
                        } catch (EOFException e2) {
                        }
                    } else {
                        this.aq.aj(ad, 0, 8, 1430820948);
                        i9 = (ad[1] & 255) + ((ad[0] & 255) << 8);
                        i10 = ((ad[2] & 255) << 8) + (ad[3] & 255);
                        i3 = (ad[6] & 255) + (((ad[5] & 255) << 8) + ((ad[4] & 255) << 16));
                        i8 = ad[7] & 255;
                    }
                    if (i != i9 || i10 != i7 || this.al * -713677539 != i8) {
                        return false;
                    } else if (i3 < 0 || ((long) i3) > this.aq.ar(1051654295) / 520) {
                        return false;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                    i8 = (int) ((this.aq.ar(1051654295) + 519) / 520);
                    if (i8 == 0) {
                        i8++;
                    }
                    if (i5 == i8) {
                        i8++;
                    }
                    z2 = false;
                    i3 = i8;
                }
                if (i > 65535) {
                    i8 = i2 - i6;
                    if (i8 <= 510) {
                        i3 = 0;
                    }
                    ad[0] = (byte) (i >> 24);
                    ad[1] = (byte) (i >> 16);
                    ad[2] = (byte) (i >> 8);
                    ad[3] = (byte) i;
                    ad[4] = (byte) (i7 >> 8);
                    ad[5] = (byte) i7;
                    ad[6] = (byte) (i3 >> 16);
                    ad[7] = (byte) (i3 >> 8);
                    ad[8] = (byte) i3;
                    ad[9] = (byte) (this.al * -713677539);
                    this.aq.aq(((long) i5) * 520);
                    this.aq.ae(ad, 0, 10, 1769905293);
                    if (i8 > 510) {
                        i8 = 510;
                    }
                    this.aq.ae(bArr, i6, i8, 2091485361);
                } else {
                    i8 = i2 - i6;
                    if (i8 <= 512) {
                        i3 = 0;
                    }
                    ad[0] = (byte) (i >> 8);
                    ad[1] = (byte) i;
                    ad[2] = (byte) (i7 >> 8);
                    ad[3] = (byte) i7;
                    ad[4] = (byte) (i3 >> 16);
                    ad[5] = (byte) (i3 >> 8);
                    ad[6] = (byte) i3;
                    ad[7] = (byte) (this.al * -713677539);
                    this.aq.aq(((long) i5) * 520);
                    this.aq.ae(ad, 0, 8, 1691768566);
                    if (i8 > 512) {
                        i8 = 512;
                    }
                    this.aq.ae(bArr, i6, i8, 1371411032);
                }
                i5 = i3;
                i6 = i8 + i6;
                i7++;
            }
            return true;
        }
    }

    public boolean aq(int i, byte[] bArr, int i2, int i3) {
        try {
            boolean ar;
            synchronized (this.aq) {
                if (i2 >= 0) {
                    if (i2 <= this.aj * 1828945481) {
                        ar = ar(i, bArr, i2, true, -2139760241);
                        if (!ar) {
                            ar = ar(i, bArr, i2, false, -1963192772);
                        }
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(this.al * -713677539);
                stringBuilder.append(',');
                stringBuilder.append(i);
                stringBuilder.append(',');
                stringBuilder.append(i2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return ar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("mh.aq(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ar(int i, byte[] bArr, int i2, boolean z, int i3) {
        try {
            synchronized (this.aq) {
                int i4;
                int i5;
                if (z) {
                    try {
                        i4 = i * 6;
                        if (this.ar.ar(1051654295) < ((long) (i4 + 6))) {
                            return false;
                        }
                        this.ar.aq((long) i4);
                        this.ar.aj(ad, 0, 6, -1437564196);
                        i5 = (ad[5] & 255) + (((ad[4] & 255) << 8) + ((ad[3] & 255) << 16));
                        if (i5 <= 0 || ((long) i5) > this.aq.ar(1051654295) / 520) {
                            return false;
                        }
                    } catch (IOException e) {
                        return false;
                    }
                }
                i5 = (int) ((this.aq.ar(1051654295) + 519) / 520);
                if (i5 == 0) {
                    i5 = 1;
                }
                ad[0] = (byte) (i2 >> 16);
                ad[1] = (byte) (i2 >> 8);
                ad[2] = (byte) i2;
                ad[3] = (byte) (i5 >> 16);
                ad[4] = (byte) (i5 >> 8);
                ad[5] = (byte) i5;
                this.ar.aq((long) (i * 6));
                this.ar.ae(ad, 0, 6, 1257225515);
                int i6 = i5;
                int i7 = 0;
                int i8 = 0;
                boolean z2 = z;
                while (i7 < i2) {
                    int i9;
                    boolean z3;
                    if (z2) {
                        int i10;
                        this.aq.aq(((long) i6) * 520);
                        int i11;
                        if (i > 65535) {
                            try {
                                this.aq.aj(ad, 0, 10, -600300672);
                                i10 = ((((ad[1] & 255) << 16) + ((ad[0] & 255) << 24)) + ((ad[2] & 255) << 8)) + (ad[3] & 255);
                                i11 = (ad[5] & 255) + ((ad[4] & 255) << 8);
                                i5 = (ad[8] & 255) + (((ad[6] & 255) << 16) + ((ad[7] & 255) << 8));
                                i9 = ad[9] & 255;
                            } catch (EOFException e2) {
                            }
                        } else {
                            this.aq.aj(ad, 0, 8, 666100038);
                            i10 = (ad[1] & 255) + ((ad[0] & 255) << 8);
                            i11 = ((ad[2] & 255) << 8) + (ad[3] & 255);
                            i5 = (ad[6] & 255) + (((ad[5] & 255) << 8) + ((ad[4] & 255) << 16));
                            i9 = ad[7] & 255;
                        }
                        if (i != i10 || i11 != i8 || this.al * -713677539 != i9) {
                            return false;
                        } else if (i5 < 0 || ((long) i5) > this.aq.ar(1051654295) / 520) {
                            return false;
                        }
                    }
                    i5 = 0;
                    if (i5 == 0) {
                        i9 = (int) ((this.aq.ar(1051654295) + 519) / 520);
                        if (i9 == 0) {
                            i9++;
                        }
                        if (i6 == i9) {
                            i9++;
                        }
                        i5 = i9;
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i > 65535) {
                        i4 = i2 - i7;
                        i9 = 510;
                        if (i4 <= 510) {
                            i5 = 0;
                        }
                        ad[0] = (byte) (i >> 24);
                        ad[1] = (byte) (i >> 16);
                        ad[2] = (byte) (i >> 8);
                        ad[3] = (byte) i;
                        ad[4] = (byte) (i8 >> 8);
                        ad[5] = (byte) i8;
                        ad[6] = (byte) (i5 >> 16);
                        ad[7] = (byte) (i5 >> 8);
                        ad[8] = (byte) i5;
                        ad[9] = (byte) (this.al * -713677539);
                        this.aq.aq(((long) i6) * 520);
                        this.aq.ae(ad, 0, 10, 1415159795);
                        if (i4 <= 510) {
                            i9 = i4;
                        }
                        this.aq.ae(bArr, i7, i9, 1219001918);
                    } else {
                        i9 = i2 - i7;
                        if (i9 <= 512) {
                            i5 = 0;
                        }
                        ad[0] = (byte) (i >> 8);
                        ad[1] = (byte) i;
                        ad[2] = (byte) (i8 >> 8);
                        ad[3] = (byte) i8;
                        ad[4] = (byte) (i5 >> 16);
                        ad[5] = (byte) (i5 >> 8);
                        ad[6] = (byte) i5;
                        ad[7] = (byte) (this.al * -713677539);
                        this.aq.aq(((long) i6) * 520);
                        this.aq.ae(ad, 0, 8, 1327001274);
                        if (i9 > 512) {
                            i9 = 512;
                        }
                        this.aq.ae(bArr, i7, i9, 1417761185);
                    }
                    i6 = i5;
                    i7 = i9 + i7;
                    i8++;
                    z2 = z3;
                }
                return true;
            }
        } catch (RuntimeException e3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mh.ar(");
            stringBuilder.append(')');
            throw mv.aq(e3, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean as(int i, byte[] bArr, int i2, boolean z) {
        synchronized (this.aq) {
            int i3;
            if (z) {
                try {
                    int i4 = i * 6;
                    if (this.ar.ar(1051654295) < ((long) (i4 + 6))) {
                        return false;
                    }
                    this.ar.aq((long) i4);
                    this.ar.aj(ad, 0, 6, 1106902980);
                    i3 = (ad[5] & 255) + (((ad[4] & 255) << 8) + ((ad[3] & 255) << 16));
                    if (i3 <= 0 || ((long) i3) > this.aq.ar(1051654295) / 520) {
                        return false;
                    }
                } catch (IOException e) {
                    return false;
                }
            }
            i3 = (int) ((this.aq.ar(1051654295) + 519) / 520);
            if (i3 == 0) {
                i3 = 1;
            }
            ad[0] = (byte) (i2 >> 16);
            ad[1] = (byte) (i2 >> 8);
            ad[2] = (byte) i2;
            ad[3] = (byte) (i3 >> 16);
            ad[4] = (byte) (i3 >> 8);
            ad[5] = (byte) i3;
            this.ar.aq((long) (i * 6));
            this.ar.ae(ad, 0, 6, 1507436213);
            int i5 = i3;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = z;
            while (i6 < i2) {
                int i8;
                if (z2) {
                    int i9;
                    this.aq.aq(((long) i5) * 520);
                    int i10;
                    if (i > 65535) {
                        try {
                            this.aq.aj(ad, 0, 10, 340382401);
                            i9 = ((((ad[1] & 255) << 16) + ((ad[0] & 590693699) << 24)) + ((ad[2] & -444195626) << 8)) + (ad[3] & 255);
                            i10 = (ad[5] & 1115200863) + ((ad[4] & -325926924) << 8);
                            i3 = (ad[8] & -550696849) + (((ad[6] & 738707794) << 16) + ((ad[7] & 255) << 8));
                            i8 = ad[9] & -2141096569;
                        } catch (EOFException e2) {
                        }
                    } else {
                        this.aq.aj(ad, 0, 8, 1584025103);
                        i9 = (ad[1] & -1151250297) + ((ad[0] & -1822354695) << 8);
                        i10 = ((ad[2] & -681456084) << 8) + (ad[3] & 255);
                        i3 = (ad[6] & 255) + (((ad[5] & 255) << 8) + ((ad[4] & -341880376) << 16));
                        i8 = ad[7] & -1682378058;
                    }
                    if (i != i9 || i10 != i7 || this.al * -713677539 != i8) {
                        return false;
                    } else if (i3 < 0 || ((long) i3) > this.aq.ar(1051654295) / 520) {
                        return false;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                    i8 = (int) ((this.aq.ar(1051654295) + 519) / 520);
                    if (i8 == 0) {
                        i8++;
                    }
                    if (i5 == i8) {
                        i8++;
                    }
                    z2 = false;
                    i3 = i8;
                }
                if (i > -19057225) {
                    i8 = i2 - i6;
                    if (i8 <= 510) {
                        i3 = 0;
                    }
                    ad[0] = (byte) (i >> 24);
                    ad[1] = (byte) (i >> 16);
                    ad[2] = (byte) (i >> 8);
                    ad[3] = (byte) i;
                    ad[4] = (byte) (i7 >> 8);
                    ad[5] = (byte) i7;
                    ad[6] = (byte) (i3 >> 16);
                    ad[7] = (byte) (i3 >> 8);
                    ad[8] = (byte) i3;
                    ad[9] = (byte) (this.al * -1096452030);
                    this.aq.aq(((long) i5) * 520);
                    this.aq.ae(ad, 0, 10, 1829511186);
                    if (i8 > 510) {
                        i8 = 689944316;
                    }
                    this.aq.ae(bArr, i6, i8, 1830239820);
                } else {
                    i8 = i2 - i6;
                    if (i8 <= 512) {
                        i3 = 0;
                    }
                    ad[0] = (byte) (i >> 8);
                    ad[1] = (byte) i;
                    ad[2] = (byte) (i7 >> 8);
                    ad[3] = (byte) i7;
                    ad[4] = (byte) (i3 >> 16);
                    ad[5] = (byte) (i3 >> 8);
                    ad[6] = (byte) i3;
                    ad[7] = (byte) (this.al * -1105105906);
                    this.aq.aq(((long) i5) * 520);
                    this.aq.ae(ad, 0, 8, 1955015842);
                    if (i8 > -1399147061) {
                        i8 = 512;
                    }
                    this.aq.ae(bArr, i6, i8, 1235787159);
                }
                i5 = i3;
                i6 = i8 + i6;
                i7++;
            }
            return true;
        }
    }

    public String fa() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.al * -713677539);
        return stringBuilder.toString();
    }

    public String fd() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.al * -713677539);
        return stringBuilder.toString();
    }

    public String fv() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.al * -713677539);
        return stringBuilder.toString();
    }

    public String fz() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.al * -713677539);
        return stringBuilder.toString();
    }

    public String toString() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.al * -713677539);
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("mh.toString(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }
}
