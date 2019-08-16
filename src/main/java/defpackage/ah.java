package defpackage;

/* renamed from: ah */
public class ah extends bw {
    public static final int ap = 4096;
    public static final int cp = 82;
    final be ad;
    final af aq;

    public ah(be beVar) {
        try {
            this.ad = beVar;
            this.aq = new af(this.ad);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ah.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void az(char c, int i) {
        Object obj = 1;
        Object obj2 = null;
        try {
            int i2;
            StringBuilder stringBuilder;
            if (2 == hm.cu * -710699557) {
                for (i2 = 0; i2 < hm.dj.length(); i2++) {
                    if (c == hm.dj.charAt(i2)) {
                        obj2 = 1;
                        break;
                    }
                }
                if (obj2 == null) {
                    return;
                }
                if (hm.dw * -558950377 == 0) {
                    if (hm.cg.length() < 320) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(hm.cg);
                        stringBuilder.append(c);
                        hm.cg = stringBuilder.toString();
                    }
                } else if (1 == hm.dw * -558950377 && hm.ch.length() < 20) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(hm.ch);
                    stringBuilder.append(c);
                    hm.ch = stringBuilder.toString();
                }
            } else if (4 == hm.cu * -710699557) {
                for (i2 = 0; i2 < hm.et.length(); i2++) {
                    if (c == hm.et.charAt(i2)) {
                        break;
                    }
                }
                obj = null;
                if (obj != null && hw.du.length() < 6) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(hw.du);
                    stringBuilder.append(c);
                    hw.du = stringBuilder.toString();
                }
            } else if (hm.cu * -710699557 == 5) {
                for (i2 = 0; i2 < hm.dj.length(); i2++) {
                    if (c == hm.dj.charAt(i2)) {
                        obj2 = 1;
                        break;
                    }
                }
                if (obj2 != null && hm.cg.length() < 320) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(hm.cg);
                    stringBuilder.append(c);
                    hm.cg = stringBuilder.toString();
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("ah.az(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public bl ad(int i) {
        try {
            return this.ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ah.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public by ae() {
        return this.aq;
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(bc bcVar, bs bsVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int length = bsVar.ad.length;
        int i11 = 0;
        while (i11 < length) {
            i7 = bsVar.ad[i11] - bc.ab;
            i8 = bsVar.aq[i11] - bc.av;
            i9 = bsVar.ar[i11] - bc.at;
            i10 = ((i4 * i7) + (i9 * i3)) >> 16;
            i7 = ((i9 * i4) - (i7 * i3)) >> 16;
            i9 = ((i2 * i8) - (i7 * i)) >> 16;
            i7 = ((i7 * i2) + (i8 * i)) >> 16;
            if (i7 >= 50) {
                if (bsVar.as != null) {
                    bs.aa[i11] = i10;
                    bs.ao[i11] = i9;
                    bs.ah[i11] = i7;
                }
                bs.aw[i11] = ((i10 * (this.ad.bq * 1516652957)) / i7) + (this.ad.bd * -1240378447);
                bs.ac[i11] = ((i9 * (this.ad.bq * 1516652957)) / i7) + (this.ad.bo * -1165057787);
                i11++;
            } else {
                return;
            }
        }
        this.ad.bm = 0;
        int length2 = bsVar.ae.length;
        i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 < length2) {
                int i13 = bsVar.ae[i12];
                int i14 = bsVar.am[i12];
                int i15 = bsVar.ak[i12];
                i9 = bs.aw[i13];
                i10 = bs.aw[i14];
                int i16 = bs.aw[i15];
                length = bs.ac[i13];
                i7 = bs.ac[i14];
                i8 = bs.ac[i15];
                if (((i8 - i7) * (i9 - i10)) - ((length - i7) * (i16 - i10)) > 0) {
                    this.ad.at = false;
                    if (i9 < 0 || i10 < 0 || i16 < 0 || i9 > this.ad.bl * 1505645037 || i10 > this.ad.bl * 1505645037 || i16 > this.ad.bl * 1505645037) {
                        this.ad.at = true;
                    }
                    if (bc.bd && bc.br(bc.bl, bc.bf, length, i7, i8, i9, i10, i16)) {
                        bc.bb = i5;
                        bc.bi = i6;
                    }
                    if (bsVar.as == null || -1 == bsVar.as[i12]) {
                        if (12345678 != bsVar.al[i12]) {
                            this.ad.aj(length, i7, i8, i9, i10, i16, bsVar.al[i12], bsVar.aj[i12], bsVar.ai[i12], (byte) 16);
                        }
                    } else if (bc.ad) {
                        be beVar = this.ad;
                        int al = il.ax.al(bsVar.as[i12], 423630940);
                        this.ad.aj(length, i7, i8, i9, i10, i16, kr.br(al, bsVar.al[i12], 2132501701), kr.br(al, bsVar.aj[i12], 2139092484), kr.br(al, bsVar.ai[i12], 2141408312), (byte) 16);
                    } else if (bsVar.ag) {
                        this.ad.ah(length, i7, i8, i9, i10, i16, bsVar.al[i12], bsVar.aj[i12], bsVar.ai[i12], bs.aa[0], bs.aa[1], bs.aa[3], bs.ao[0], bs.ao[1], bs.ao[3], bs.ah[0], bs.ah[1], bs.ah[3], bsVar.as[i12], 1867714624);
                    } else {
                        this.ad.ah(length, i7, i8, i9, i10, i16, bsVar.al[i12], bsVar.aj[i12], bsVar.ai[i12], bs.aa[i13], bs.aa[i14], bs.aa[i15], bs.ao[i13], bs.ao[i14], bs.ao[i15], bs.ah[i13], bs.ah[i14], bs.ah[i15], bsVar.as[i12], -49031837);
                    }
                }
                i11 = i12 + 1;
            } else {
                return;
            }
        }
    }

    public bl ai() {
        return this.ad;
    }

    public bl aj() {
        return this.ad;
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(bc bcVar, av avVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (i6 << 7) - bc.ab;
        int i9 = (i7 << 7) - bc.at;
        int i10 = i8 + 128;
        int i11 = i9 + 128;
        int i12 = bcVar.aj[i][i6][i7] - bc.av;
        int i13 = i6 + 1;
        int i14 = bcVar.aj[i][i13][i7] - bc.av;
        int i15 = i7 + 1;
        i13 = bcVar.aj[i][i13][i15] - bc.av;
        i15 = bcVar.aj[i][i6][i15] - bc.av;
        int i16 = i9 * i4;
        int i17 = i5 * i8;
        int i18 = (i16 + i17) >> 16;
        i9 *= i5;
        i8 *= i4;
        int i19 = (i9 - i8) >> 16;
        int i20 = ((i12 * i3) - (i19 * i2)) >> 16;
        int i21 = ((i12 * i2) + (i19 * i3)) >> 16;
        if (i21 >= 50) {
            i12 = i5 * i10;
            int i22 = (i16 + i12) >> 16;
            i10 *= i4;
            i9 = (i9 - i10) >> 16;
            int i23 = ((i3 * i14) - (i9 * i2)) >> 16;
            int i24 = ((i9 * i3) + (i14 * i2)) >> 16;
            if (i24 >= 50) {
                i9 = i4 * i11;
                int i25 = (i12 + i9) >> 16;
                i11 *= i5;
                i10 = (i11 - i10) >> 16;
                int i26 = ((i3 * i13) - (i10 * i2)) >> 16;
                int i27 = ((i10 * i3) + (i13 * i2)) >> 16;
                if (i27 >= 50) {
                    int i28 = (i9 + i17) >> 16;
                    i8 = (i11 - i8) >> 16;
                    int i29 = ((i15 * i3) - (i8 * i2)) >> 16;
                    int i30 = ((i8 * i3) + (i15 * i2)) >> 16;
                    if (i30 >= 50) {
                        be beVar;
                        int i31 = (this.ad.bd * -1240378447) + (((this.ad.bq * 1516652957) * i18) / i21);
                        int i32 = (((this.ad.bq * 1516652957) * i20) / i21) + (this.ad.bo * -1165057787);
                        i15 = (((this.ad.bq * 1516652957) * i22) / i24) + (this.ad.bd * -1240378447);
                        i12 = (this.ad.bo * -1165057787) + (((this.ad.bq * 1516652957) * i23) / i24);
                        i14 = (this.ad.bd * -1240378447) + (((this.ad.bq * 1516652957) * i25) / i27);
                        i10 = (this.ad.bo * -1165057787) + (((this.ad.bq * 1516652957) * i26) / i27);
                        i13 = (((this.ad.bq * 1516652957) * i28) / i30) + (this.ad.bd * -1240378447);
                        i11 = (this.ad.bo * -1165057787) + (((this.ad.bq * 1516652957) * i29) / i30);
                        this.ad.bm = 0;
                        if (((i12 - i11) * (i14 - i13)) - ((i15 - i13) * (i10 - i11)) > 0) {
                            this.ad.at = false;
                            if (i14 < 0 || i13 < 0 || i15 < 0 || i14 > this.ad.bl * 1505645037 || i13 > this.ad.bl * 1505645037 || i15 > this.ad.bl * 1505645037) {
                                this.ad.at = true;
                            }
                            if (bc.bd && bc.br(bc.bl, bc.bf, i10, i11, i12, i14, i13, i15)) {
                                bc.bb = i6;
                                bc.bi = i7;
                            }
                            if (-1 == avVar.aj * 1901002443) {
                                if (12345678 != avVar.ar * -881587749) {
                                    this.ad.aj(i10, i11, i12, i14, i13, i15, -881587749 * avVar.ar, 1700480373 * avVar.al, -1267802003 * avVar.aq, (byte) 16);
                                }
                            } else if (bc.ad) {
                                beVar = this.ad;
                                i8 = il.ax.al(avVar.aj * 1901002443, 729057137);
                                this.ad.aj(i10, i11, i12, i14, i13, i15, kr.br(i8, avVar.ar * -881587749, 2135091850), kr.br(i8, avVar.al * 1700480373, 2143958346), kr.br(i8, avVar.aq * -1267802003, 2137504023), (byte) 16);
                            } else if (avVar.ai) {
                                this.ad.ah(i10, i11, i12, i14, i13, i15, -881587749 * avVar.ar, 1700480373 * avVar.al, -1267802003 * avVar.aq, i18, i22, i28, i20, i23, i29, i21, i24, i30, avVar.aj * 1901002443, 1475116551);
                            } else {
                                this.ad.ah(i10, i11, i12, i14, i13, i15, avVar.ar * -881587749, avVar.al * 1700480373, avVar.aq * -1267802003, i25, i28, i22, i26, i29, i23, i27, i30, i24, avVar.aj * 1901002443, 766705723);
                            }
                        }
                        if (((i11 - i12) * (i31 - i15)) - ((i32 - i12) * (i13 - i15)) > 0) {
                            this.ad.at = false;
                            if (i31 < 0 || i15 < 0 || i13 < 0 || i31 > this.ad.bl * 1505645037 || i15 > this.ad.bl * 1505645037 || i13 > this.ad.bl * 1505645037) {
                                this.ad.at = true;
                            }
                            if (bc.bd && bc.br(bc.bl, bc.bf, i32, i12, i11, i31, i15, i13)) {
                                bc.bb = i6;
                                bc.bi = i7;
                            }
                            if (avVar.aj * 1901002443 == -1) {
                                if (12345678 != avVar.ad * -1296734259) {
                                    this.ad.aj(i32, i12, i11, i31, i15, i13, avVar.ad * -1296734259, avVar.aq * -1267802003, avVar.al * 1700480373, (byte) 16);
                                }
                            } else if (bc.ad) {
                                beVar = this.ad;
                                i8 = il.ax.al(avVar.aj * 1901002443, -351318718);
                                this.ad.aj(i32, i12, i11, i31, i15, i13, kr.br(i8, avVar.ad * -1296734259, 2139173598), kr.br(i8, avVar.aq * -1267802003, 2138584408), kr.br(i8, avVar.al * 1700480373, 2140813202), (byte) 16);
                            } else {
                                this.ad.ah(i32, i12, i11, i31, i15, i13, avVar.ad * -1296734259, avVar.aq * -1267802003, avVar.al * 1700480373, i18, i22, i28, i20, i23, i29, i21, i24, i30, avVar.aj * 1901002443, 732304793);
                            }
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(bc bcVar, bs bsVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            int i8;
            int i9;
            int i10;
            int i11;
            int length = bsVar.ad.length;
            int i12 = 0;
            while (i12 < length) {
                i8 = bsVar.ad[i12] - bc.ab;
                i9 = bsVar.aq[i12] - bc.av;
                i10 = bsVar.ar[i12] - bc.at;
                i11 = ((i4 * i8) + (i10 * i3)) >> 16;
                i8 = ((i10 * i4) - (i8 * i3)) >> 16;
                i10 = ((i2 * i9) - (i8 * i)) >> 16;
                i8 = ((i8 * i2) + (i9 * i)) >> 16;
                if (i8 >= 50) {
                    if (bsVar.as != null) {
                        bs.aa[i12] = i11;
                        bs.ao[i12] = i10;
                        bs.ah[i12] = i8;
                    }
                    bs.aw[i12] = ((i11 * (this.ad.bq * 1516652957)) / i8) + (this.ad.bd * -1240378447);
                    bs.ac[i12] = ((i10 * (this.ad.bq * 1516652957)) / i8) + (this.ad.bo * -1165057787);
                    i12++;
                } else {
                    return;
                }
            }
            this.ad.bm = 0;
            int length2 = bsVar.ae.length;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = bsVar.ae[i13];
                int i15 = bsVar.am[i13];
                int i16 = bsVar.ak[i13];
                i10 = bs.aw[i14];
                i11 = bs.aw[i15];
                int i17 = bs.aw[i16];
                length = bs.ac[i14];
                i8 = bs.ac[i15];
                i9 = bs.ac[i16];
                if (((i9 - i8) * (i10 - i11)) - ((length - i8) * (i17 - i11)) > 0) {
                    this.ad.at = false;
                    if (i10 < 0 || i11 < 0 || i17 < 0 || i10 > this.ad.bl * 1505645037 || i11 > this.ad.bl * 1505645037 || i17 > this.ad.bl * 1505645037) {
                        this.ad.at = true;
                    }
                    if (bc.bd && bc.br(bc.bl, bc.bf, length, i8, i9, i10, i11, i17)) {
                        bc.bb = i5;
                        bc.bi = i6;
                    }
                    if (bsVar.as == null || -1 == bsVar.as[i13]) {
                        if (12345678 != bsVar.al[i13]) {
                            this.ad.aj(length, i8, i9, i10, i11, i17, bsVar.al[i13], bsVar.aj[i13], bsVar.ai[i13], (byte) 16);
                        }
                    } else if (bc.ad) {
                        be beVar = this.ad;
                        int al = il.ax.al(bsVar.as[i13], -296031442);
                        this.ad.aj(length, i8, i9, i10, i11, i17, kr.br(al, bsVar.al[i13], 2146842309), kr.br(al, bsVar.aj[i13], 2144792946), kr.br(al, bsVar.ai[i13], 2136312754), (byte) 16);
                    } else if (bsVar.ag) {
                        this.ad.ah(length, i8, i9, i10, i11, i17, bsVar.al[i13], bsVar.aj[i13], bsVar.ai[i13], bs.aa[0], bs.aa[1], bs.aa[3], bs.ao[0], bs.ao[1], bs.ao[3], bs.ah[0], bs.ah[1], bs.ah[3], bsVar.as[i13], 1173794536);
                    } else {
                        this.ad.ah(length, i8, i9, i10, i11, i17, bsVar.al[i13], bsVar.aj[i13], bsVar.ai[i13], bs.aa[i14], bs.aa[i15], bs.aa[i16], bs.ao[i14], bs.ao[i15], bs.ao[i16], bs.ah[i14], bs.ah[i15], bs.ah[i16], bsVar.as[i13], 1907301777);
                    }
                }
                i13++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ah.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public by am() {
        return this.aq;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(bc bcVar, bs bsVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int length = bsVar.ad.length;
        int i11 = 0;
        while (i11 < length) {
            i7 = bsVar.ad[i11] - bc.ab;
            i8 = bsVar.aq[i11] - bc.av;
            i9 = bsVar.ar[i11] - bc.at;
            i10 = ((i4 * i7) + (i9 * i3)) >> 16;
            i7 = ((i9 * i4) - (i7 * i3)) >> 16;
            i9 = ((i2 * i8) - (i7 * i)) >> 16;
            i7 = ((i7 * i2) + (i8 * i)) >> 16;
            if (i7 >= 50) {
                if (bsVar.as != null) {
                    bs.aa[i11] = i10;
                    bs.ao[i11] = i9;
                    bs.ah[i11] = i7;
                }
                bs.aw[i11] = ((i10 * (this.ad.bq * 1516652957)) / i7) + (this.ad.bd * -1240378447);
                bs.ac[i11] = ((i9 * (this.ad.bq * 1516652957)) / i7) + (this.ad.bo * -1165057787);
                i11++;
            } else {
                return;
            }
        }
        this.ad.bm = 0;
        int length2 = bsVar.ae.length;
        i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 < length2) {
                int i13 = bsVar.ae[i12];
                int i14 = bsVar.am[i12];
                int i15 = bsVar.ak[i12];
                i9 = bs.aw[i13];
                i10 = bs.aw[i14];
                int i16 = bs.aw[i15];
                length = bs.ac[i13];
                i7 = bs.ac[i14];
                i8 = bs.ac[i15];
                if (((i8 - i7) * (i9 - i10)) - ((length - i7) * (i16 - i10)) > 0) {
                    this.ad.at = false;
                    if (i9 < 0 || i10 < 0 || i16 < 0 || i9 > this.ad.bl * -727810403 || i10 > this.ad.bl * 1983022024 || i16 > this.ad.bl * 1505645037) {
                        this.ad.at = true;
                    }
                    if (bc.bd && bc.br(bc.bl, bc.bf, length, i7, i8, i9, i10, i16)) {
                        bc.bb = i5;
                        bc.bi = i6;
                    }
                    if (bsVar.as == null || -1 == bsVar.as[i12]) {
                        if (807672127 != bsVar.al[i12]) {
                            this.ad.aj(length, i7, i8, i9, i10, i16, bsVar.al[i12], bsVar.aj[i12], bsVar.ai[i12], (byte) 16);
                        }
                    } else if (bc.ad) {
                        be beVar = this.ad;
                        int al = il.ax.al(bsVar.as[i12], 616427116);
                        this.ad.aj(length, i7, i8, i9, i10, i16, kr.br(al, bsVar.al[i12], 2136884524), kr.br(al, bsVar.aj[i12], 2142368708), kr.br(al, bsVar.ai[i12], 2135452232), (byte) 16);
                    } else if (bsVar.ag) {
                        this.ad.ah(length, i7, i8, i9, i10, i16, bsVar.al[i12], bsVar.aj[i12], bsVar.ai[i12], bs.aa[0], bs.aa[1], bs.aa[3], bs.ao[0], bs.ao[1], bs.ao[3], bs.ah[0], bs.ah[1], bs.ah[3], bsVar.as[i12], 564488983);
                    } else {
                        this.ad.ah(length, i7, i8, i9, i10, i16, bsVar.al[i12], bsVar.aj[i12], bsVar.ai[i12], bs.aa[i13], bs.aa[i14], bs.aa[i15], bs.ao[i13], bs.ao[i14], bs.ao[i15], bs.ah[i13], bs.ah[i14], bs.ah[i15], bsVar.as[i12], 1616022812);
                    }
                }
                i11 = i12 + 1;
            } else {
                return;
            }
        }
    }

    public by aq(byte b) {
        try {
            return this.aq;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ah.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(bc bcVar, av avVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        try {
            int i8 = (i6 << 7) - bc.ab;
            int i9 = (i7 << 7) - bc.at;
            int i10 = i8 + 128;
            int i11 = i9 + 128;
            int i12 = bcVar.aj[i][i6][i7] - bc.av;
            int i13 = i6 + 1;
            int i14 = bcVar.aj[i][i13][i7] - bc.av;
            int i15 = i7 + 1;
            i13 = bcVar.aj[i][i13][i15] - bc.av;
            i15 = bcVar.aj[i][i6][i15] - bc.av;
            int i16 = i9 * i4;
            int i17 = i5 * i8;
            int i18 = (i16 + i17) >> 16;
            i9 *= i5;
            i8 *= i4;
            int i19 = (i9 - i8) >> 16;
            int i20 = ((i12 * i3) - (i19 * i2)) >> 16;
            int i21 = ((i12 * i2) + (i19 * i3)) >> 16;
            if (i21 >= 50) {
                i12 = i5 * i10;
                int i22 = (i16 + i12) >> 16;
                i10 *= i4;
                i9 = (i9 - i10) >> 16;
                int i23 = ((i3 * i14) - (i9 * i2)) >> 16;
                int i24 = ((i9 * i3) + (i14 * i2)) >> 16;
                if (i24 >= 50) {
                    i9 = i4 * i11;
                    int i25 = (i12 + i9) >> 16;
                    i11 *= i5;
                    i10 = (i11 - i10) >> 16;
                    int i26 = ((i3 * i13) - (i10 * i2)) >> 16;
                    int i27 = ((i10 * i3) + (i13 * i2)) >> 16;
                    if (i27 >= 50) {
                        int i28 = (i9 + i17) >> 16;
                        i8 = (i11 - i8) >> 16;
                        int i29 = ((i15 * i3) - (i8 * i2)) >> 16;
                        int i30 = ((i8 * i3) + (i15 * i2)) >> 16;
                        if (i30 >= 50) {
                            be beVar;
                            int i31 = (this.ad.bd * -1240378447) + (((this.ad.bq * 1516652957) * i18) / i21);
                            int i32 = (((this.ad.bq * 1516652957) * i20) / i21) + (this.ad.bo * -1165057787);
                            i15 = (((this.ad.bq * 1516652957) * i22) / i24) + (this.ad.bd * -1240378447);
                            i12 = (this.ad.bo * -1165057787) + (((this.ad.bq * 1516652957) * i23) / i24);
                            i14 = (this.ad.bd * -1240378447) + (((this.ad.bq * 1516652957) * i25) / i27);
                            i10 = (this.ad.bo * -1165057787) + (((this.ad.bq * 1516652957) * i26) / i27);
                            i13 = (((this.ad.bq * 1516652957) * i28) / i30) + (this.ad.bd * -1240378447);
                            i11 = (this.ad.bo * -1165057787) + (((this.ad.bq * 1516652957) * i29) / i30);
                            this.ad.bm = 0;
                            if (((i12 - i11) * (i14 - i13)) - ((i15 - i13) * (i10 - i11)) > 0) {
                                this.ad.at = false;
                                if (i14 < 0 || i13 < 0 || i15 < 0 || i14 > this.ad.bl * 1505645037 || i13 > this.ad.bl * 1505645037 || i15 > this.ad.bl * 1505645037) {
                                    this.ad.at = true;
                                }
                                if (bc.bd && bc.br(bc.bl, bc.bf, i10, i11, i12, i14, i13, i15)) {
                                    bc.bb = i6;
                                    bc.bi = i7;
                                }
                                if (-1 == avVar.aj * 1901002443) {
                                    if (12345678 != avVar.ar * -881587749) {
                                        this.ad.aj(i10, i11, i12, i14, i13, i15, -881587749 * avVar.ar, 1700480373 * avVar.al, -1267802003 * avVar.aq, (byte) 16);
                                    }
                                } else if (bc.ad) {
                                    beVar = this.ad;
                                    i8 = il.ax.al(avVar.aj * 1901002443, -794768943);
                                    this.ad.aj(i10, i11, i12, i14, i13, i15, kr.br(i8, avVar.ar * -881587749, 2144785124), kr.br(i8, avVar.al * 1700480373, 2144112547), kr.br(i8, avVar.aq * -1267802003, 2143376772), (byte) 16);
                                } else if (avVar.ai) {
                                    this.ad.ah(i10, i11, i12, i14, i13, i15, -881587749 * avVar.ar, 1700480373 * avVar.al, -1267802003 * avVar.aq, i18, i22, i28, i20, i23, i29, i21, i24, i30, avVar.aj * 1901002443, 465534570);
                                } else {
                                    this.ad.ah(i10, i11, i12, i14, i13, i15, avVar.ar * -881587749, avVar.al * 1700480373, avVar.aq * -1267802003, i25, i28, i22, i26, i29, i23, i27, i30, i24, avVar.aj * 1901002443, 1078311354);
                                }
                            }
                            if (((i11 - i12) * (i31 - i15)) - ((i32 - i12) * (i13 - i15)) > 0) {
                                this.ad.at = false;
                                if (i31 < 0 || i15 < 0 || i13 < 0 || i31 > this.ad.bl * 1505645037 || i15 > this.ad.bl * 1505645037 || i13 > this.ad.bl * 1505645037) {
                                    this.ad.at = true;
                                }
                                if (bc.bd && bc.br(bc.bl, bc.bf, i32, i12, i11, i31, i15, i13)) {
                                    bc.bb = i6;
                                    bc.bi = i7;
                                }
                                if (avVar.aj * 1901002443 == -1) {
                                    if (12345678 != avVar.ad * -1296734259) {
                                        this.ad.aj(i32, i12, i11, i31, i15, i13, avVar.ad * -1296734259, avVar.aq * -1267802003, avVar.al * 1700480373, (byte) 16);
                                    }
                                } else if (bc.ad) {
                                    beVar = this.ad;
                                    i8 = il.ax.al(avVar.aj * 1901002443, -1017824031);
                                    this.ad.aj(i32, i12, i11, i31, i15, i13, kr.br(i8, avVar.ad * -1296734259, 2146112462), kr.br(i8, avVar.aq * -1267802003, 2134445236), kr.br(i8, avVar.al * 1700480373, 2134828157), (byte) 16);
                                } else {
                                    this.ad.ah(i32, i12, i11, i31, i15, i13, avVar.ad * -1296734259, avVar.aq * -1267802003, avVar.al * 1700480373, i18, i22, i28, i20, i23, i29, i21, i24, i30, avVar.aj * 1901002443, 55363571);
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ah.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(bc bcVar, av avVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (i6 << 7) - bc.ab;
        int i9 = (i7 << 7) - bc.at;
        int i10 = i8 + 128;
        int i11 = i9 + 128;
        int i12 = bcVar.aj[i][i6][i7] - bc.av;
        int i13 = i6 + 1;
        int i14 = bcVar.aj[i][i13][i7] - bc.av;
        int i15 = i7 + 1;
        i13 = bcVar.aj[i][i13][i15] - bc.av;
        i15 = bcVar.aj[i][i6][i15] - bc.av;
        int i16 = i9 * i4;
        int i17 = i5 * i8;
        int i18 = (i16 + i17) >> 16;
        i9 *= i5;
        i8 *= i4;
        int i19 = (i9 - i8) >> 16;
        int i20 = ((i12 * i3) - (i19 * i2)) >> 16;
        int i21 = ((i12 * i2) + (i19 * i3)) >> 16;
        if (i21 >= -2008462587) {
            i12 = i5 * i10;
            int i22 = (i16 + i12) >> 16;
            i10 *= i4;
            i9 = (i9 - i10) >> 16;
            int i23 = ((i3 * i14) - (i9 * i2)) >> 16;
            int i24 = ((i9 * i3) + (i14 * i2)) >> 16;
            if (i24 >= 50) {
                i9 = i4 * i11;
                int i25 = (i12 + i9) >> 16;
                i11 *= i5;
                i10 = (i11 - i10) >> 16;
                int i26 = ((i3 * i13) - (i10 * i2)) >> 16;
                int i27 = ((i10 * i3) + (i13 * i2)) >> 16;
                if (i27 >= 817126228) {
                    int i28 = (i9 + i17) >> 16;
                    i8 = (i11 - i8) >> 16;
                    int i29 = ((i15 * i3) - (i8 * i2)) >> 16;
                    int i30 = ((i8 * i3) + (i15 * i2)) >> 16;
                    if (i30 >= -901913477) {
                        be beVar;
                        int i31 = (this.ad.bd * -1240378447) + (((this.ad.bq * 1161508499) * i18) / i21);
                        int i32 = (((this.ad.bq * 2112057878) * i20) / i21) + (this.ad.bo * 516894512);
                        i15 = (((this.ad.bq * 1516652957) * i22) / i24) + (this.ad.bd * 241226838);
                        i12 = (this.ad.bo * -1165057787) + (((this.ad.bq * 422831714) * i23) / i24);
                        i14 = (((this.ad.bq * 1516652957) * i25) / i27) + (this.ad.bd * -894087608);
                        i10 = (((this.ad.bq * 1516652957) * i26) / i27) + (this.ad.bo * -1165057787);
                        i13 = (((this.ad.bq * -979936760) * i28) / i30) + (this.ad.bd * -1650908010);
                        i11 = (this.ad.bo * -1539833115) + (((this.ad.bq * 1516652957) * i29) / i30);
                        this.ad.bm = 0;
                        if (((i12 - i11) * (i14 - i13)) - ((i15 - i13) * (i10 - i11)) > 0) {
                            this.ad.at = false;
                            if (i14 < 0 || i13 < 0 || i15 < 0 || i14 > this.ad.bl * 1326712599 || i13 > this.ad.bl * 1505645037 || i15 > this.ad.bl * 1505645037) {
                                this.ad.at = true;
                            }
                            if (bc.bd && bc.br(bc.bl, bc.bf, i10, i11, i12, i14, i13, i15)) {
                                bc.bb = i6;
                                bc.bi = i7;
                            }
                            if (-1 == avVar.aj * -569417564) {
                                if (1897749822 != avVar.ar * -881587749) {
                                    this.ad.aj(i10, i11, i12, i14, i13, i15, -881587749 * avVar.ar, 1700480373 * avVar.al, 15430001 * avVar.aq, (byte) 16);
                                }
                            } else if (bc.ad) {
                                beVar = this.ad;
                                i8 = il.ax.al(avVar.aj * 1901002443, -744396346);
                                this.ad.aj(i10, i11, i12, i14, i13, i15, kr.br(i8, avVar.ar * 743649169, 2136317689), kr.br(i8, avVar.al * 1700480373, 2145699631), kr.br(i8, avVar.aq * -636706367, 2147465260), (byte) 16);
                            } else if (avVar.ai) {
                                this.ad.ah(i10, i11, i12, i14, i13, i15, -881587749 * avVar.ar, -541673337 * avVar.al, 1891113131 * avVar.aq, i18, i22, i28, i20, i23, i29, i21, i24, i30, avVar.aj * 517672611, 1204801293);
                            } else {
                                this.ad.ah(i10, i11, i12, i14, i13, i15, avVar.ar * 1999897388, avVar.al * -980919502, avVar.aq * 538839250, i25, i28, i22, i26, i29, i23, i27, i30, i24, avVar.aj * 1759123039, 983141394);
                            }
                        }
                        if (((i11 - i12) * (i31 - i15)) - ((i32 - i12) * (i13 - i15)) > 0) {
                            this.ad.at = false;
                            if (i31 < 0 || i15 < 0 || i13 < 0 || i31 > this.ad.bl * 1505645037 || i15 > this.ad.bl * 1396742333 || i13 > this.ad.bl * 1505645037) {
                                this.ad.at = true;
                            }
                            if (bc.bd && bc.br(bc.bl, bc.bf, i32, i12, i11, i31, i15, i13)) {
                                bc.bb = i6;
                                bc.bi = i7;
                            }
                            if (avVar.aj * 1103101792 == -1) {
                                if (12345678 != avVar.ad * -16936639) {
                                    this.ad.aj(i32, i12, i11, i31, i15, i13, avVar.ad * -1296734259, avVar.aq * -1267802003, avVar.al * 1700480373, (byte) 16);
                                }
                            } else if (bc.ad) {
                                beVar = this.ad;
                                i8 = il.ax.al(avVar.aj * 1901002443, -2002158141);
                                this.ad.aj(i32, i12, i11, i31, i15, i13, kr.br(i8, avVar.ad * -1296734259, 2133474557), kr.br(i8, avVar.aq * -1669194893, 2138177179), kr.br(i8, avVar.al * 1962820638, 2145004016), (byte) 16);
                            } else {
                                this.ad.ah(i32, i12, i11, i31, i15, i13, avVar.ad * 436565736, avVar.aq * -1267802003, avVar.al * 1700480373, i18, i22, i28, i20, i23, i29, i21, i24, i30, avVar.aj * 1746612420, 1945386458);
                            }
                        }
                    }
                }
            }
        }
    }
}
