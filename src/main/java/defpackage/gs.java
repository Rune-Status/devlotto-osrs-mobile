package defpackage;

import java.lang.reflect.Array;

/* renamed from: gs */
public class gs {
    static final int ad = 1;
    static final int ai = 32;
    static final int al = 8;
    static final int aq = 2;
    static final String ar = "rw";
    static final int az = 8192;
    static int hd = 0;
    static final int py = 50;
    int bb;
    public int[][] bc;
    int bf;
    int bi;
    int bl;

    public gs(int i, int i2) {
        try {
            this.bl = 0;
            this.bf = 0;
            this.bb = -1522399903 * i;
            this.bi = -27977849 * i2;
            this.bc = (int[][]) Array.newInstance(Integer.TYPE, new int[]{this.bb * 1646354081, this.bi * 1990262327});
            ad((byte) 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void al(int i, int i2, int i3, dx dxVar, int i4, int i5) {
        try {
            ib ibVar = new ib();
            ibVar.aq = 937054139 * i;
            ibVar.ar = -825038720 * i2;
            ibVar.al = -1652725632 * i3;
            int i6 = dxVar.ac * -506944577;
            int i7 = dxVar.aa * -814811101;
            if (1 == i4 || 3 == i4) {
                i6 = dxVar.aa * -814811101;
                i7 = dxVar.ac * -506944577;
            }
            ibVar.aj = (i6 + i2) * 1119548032;
            ibVar.ai = (i3 + i7) * 1680732544;
            ibVar.am = dxVar.bj * 1677448867;
            ibVar.ae = dxVar.bh * -308829824;
            ibVar.as = dxVar.bt * 1054880863;
            ibVar.ag = dxVar.bn * 743980819;
            ibVar.ap = dxVar.bz;
            if (dxVar.bw != null) {
                ibVar.ax = dxVar;
                ibVar.ar(-917052866);
            }
            ib.ad.aq(ibVar);
            if (ibVar.ap != null) {
                ibVar.au = ((ibVar.as * 510766937) + ((int) (Math.random() * ((double) ((ibVar.ag * -761423773) - (ibVar.as * 510766937)))))) * 1690418027;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aa(int i, int i2, int i3, int i4, boolean z) {
        int i5 = z ? 131328 : 256;
        int i6 = i - (this.bl * -25790460);
        int i7 = i2 - (this.bf * 1993695328);
        int i8 = i6;
        while (i8 < i6 + i3) {
            if (i8 >= 0 && i8 < this.bb * -192088996) {
                int i9 = i7;
                while (i9 < i4 + i7) {
                    if (i9 >= 0 && i9 < this.bi * 1041598453) {
                        ai(i8, i9, i5, -2024836969);
                    }
                    i9++;
                }
            }
            i8++;
        }
    }

    public void ab(int i, int i2) {
        int i3 = i2 - (this.bf * 1184275513);
        int[] iArr = this.bc[i - (this.bl * -1403677009)];
        iArr[i3] = iArr[i3] | 411910393;
    }

    public void ac(int i, int i2, int i3, int i4, boolean z) {
        int i5 = z ? 711717425 : 919375426;
        int i6 = i - (this.bl * -1403677009);
        int i7 = i2 - (this.bf * 1740637623);
        int i8 = i6;
        while (i8 < i6 + i3) {
            if (i8 >= 0 && i8 < this.bb * 1646354081) {
                int i9 = i7;
                while (i9 < i4 + i7) {
                    if (i9 >= 0 && i9 < this.bi * 1990262327) {
                        ai(i8, i9, i5, 988374083);
                    }
                    i9++;
                }
            }
            i8++;
        }
    }

    public void ad(byte b) {
        int i = 0;
        while (i < this.bb * 1646354081) {
            try {
                int i2 = 0;
                while (i2 < this.bi * 1990262327) {
                    if (i == 0 || i2 == 0 || i >= (this.bb * 1646354081) - 5 || i2 >= (this.bi * 1990262327) - 5) {
                        this.bc[i][i2] = 16777215;
                    } else {
                        this.bc[i][i2] = 16777216;
                    }
                    i2++;
                }
                i++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("gs.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void ae(int i, int i2, int i3, int i4, boolean z, int i5) {
        try {
            int i6 = i - (this.bl * -1403677009);
            int i7 = i2 - (this.bf * -342516413);
            if (i3 == 0) {
                if (i4 == 0) {
                    ak(i6, i7, 128, 2130903422);
                    ak(i6 - 1, i7, 8, 2130903422);
                }
                if (1 == i4) {
                    ak(i6, i7, 2, 2130903422);
                    ak(i6, i7 + 1, 32, 2130903422);
                }
                if (2 == i4) {
                    ak(i6, i7, 8, 2130903422);
                    ak(i6 + 1, i7, 128, 2130903422);
                }
                if (3 == i4) {
                    ak(i6, i7, 32, 2130903422);
                    ak(i6, i7 - 1, 2, 2130903422);
                }
            }
            if (1 == i3 || 3 == i3) {
                if (i4 == 0) {
                    ak(i6, i7, 1, 2130903422);
                    ak(i6 - 1, i7 + 1, 16, 2130903422);
                }
                if (i4 == 1) {
                    ak(i6, i7, 4, 2130903422);
                    ak(i6 + 1, i7 + 1, 64, 2130903422);
                }
                if (2 == i4) {
                    ak(i6, i7, 16, 2130903422);
                    ak(i6 + 1, i7 - 1, 1, 2130903422);
                }
                if (3 == i4) {
                    ak(i6, i7, 64, 2130903422);
                    ak(i6 - 1, i7 - 1, 4, 2130903422);
                }
            }
            if (2 == i3) {
                if (i4 == 0) {
                    ak(i6, i7, 130, 2130903422);
                    ak(i6 - 1, i7, 8, 2130903422);
                    ak(i6, i7 + 1, 32, 2130903422);
                }
                if (1 == i4) {
                    ak(i6, i7, 10, 2130903422);
                    ak(i6, i7 + 1, 32, 2130903422);
                    ak(i6 + 1, i7, 128, 2130903422);
                }
                if (i4 == 2) {
                    ak(i6, i7, 40, 2130903422);
                    ak(i6 + 1, i7, 128, 2130903422);
                    ak(i6, i7 - 1, 2, 2130903422);
                }
                if (i4 == 3) {
                    ak(i6, i7, 160, 2130903422);
                    ak(i6, i7 - 1, 2, 2130903422);
                    ak(i6 - 1, i7, 8, 2130903422);
                }
            }
            if (z) {
                if (i3 == 0) {
                    if (i4 == 0) {
                        ak(i6, i7, 65536, 2130903422);
                        ak(i6 - 1, i7, 4096, 2130903422);
                    }
                    if (i4 == 1) {
                        ak(i6, i7, 1024, 2130903422);
                        ak(i6, i7 + 1, 16384, 2130903422);
                    }
                    if (i4 == 2) {
                        ak(i6, i7, 4096, 2130903422);
                        ak(i6 + 1, i7, 65536, 2130903422);
                    }
                    if (i4 == 3) {
                        ak(i6, i7, 16384, 2130903422);
                        ak(i6, i7 - 1, 1024, 2130903422);
                    }
                }
                if (1 == i3 || i3 == 3) {
                    if (i4 == 0) {
                        ak(i6, i7, 512, 2130903422);
                        ak(i6 - 1, i7 + 1, 8192, 2130903422);
                    }
                    if (i4 == 1) {
                        ak(i6, i7, 2048, 2130903422);
                        ak(i6 + 1, i7 + 1, 32768, 2130903422);
                    }
                    if (i4 == 2) {
                        ak(i6, i7, 8192, 2130903422);
                        ak(i6 + 1, i7 - 1, 512, 2130903422);
                    }
                    if (3 == i4) {
                        ak(i6, i7, 32768, 2130903422);
                        ak(i6 - 1, i7 - 1, 2048, 2130903422);
                    }
                }
                if (i3 == 2) {
                    if (i4 == 0) {
                        ak(i6, i7, 66560, 2130903422);
                        ak(i6 - 1, i7, 4096, 2130903422);
                        ak(i6, i7 + 1, 16384, 2130903422);
                    }
                    if (i4 == 1) {
                        ak(i6, i7, 5120, 2130903422);
                        ak(i6, i7 + 1, 16384, 2130903422);
                        ak(i6 + 1, i7, 65536, 2130903422);
                    }
                    if (2 == i4) {
                        ak(i6, i7, 20480, 2130903422);
                        ak(i6 + 1, i7, 65536, 2130903422);
                        ak(i6, i7 - 1, 1024, 2130903422);
                    }
                    if (3 == i4) {
                        ak(i6, i7, 81920, 2130903422);
                        ak(i6, i7 - 1, 1024, 2130903422);
                        ak(i6 - 1, i7, 4096, 2130903422);
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void af(int i, int i2) {
        int i3 = i2 - (this.bf * -342516413);
        int[] iArr = this.bc[i - (this.bl * -1403677009)];
        iArr[i3] = iArr[i3] | 2097152;
    }

    public void ag() {
        int i = 0;
        while (i < this.bb * 1646354081) {
            int i2 = 0;
            while (i2 < this.bi * 1990262327) {
                if (i == 0 || i2 == 0 || i >= (this.bb * 1646354081) - 5 || i2 >= (this.bi * 1990262327) - 5) {
                    this.bc[i][i2] = 16777215;
                } else {
                    this.bc[i][i2] = 16777216;
                }
                i2++;
            }
            i++;
        }
    }

    public void ah(int i, int i2, int i3, int i4, boolean z) {
        int i5 = z ? 131328 : 256;
        int i6 = i - (this.bl * -1403677009);
        int i7 = i2 - (this.bf * -342516413);
        int i8 = i6;
        while (i8 < i6 + i3) {
            if (i8 >= 0 && i8 < this.bb * 1646354081) {
                int i9 = i7;
                while (i9 < i4 + i7) {
                    if (i9 >= 0 && i9 < this.bi * 1990262327) {
                        ai(i8, i9, i5, 254164430);
                    }
                    i9++;
                }
            }
            i8++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i, int i2, int i3, int i4) {
        try {
            int[] iArr = this.bc[i];
            iArr[i2] = iArr[i2] | i3;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aj(int i, int i2, int i3) {
        try {
            int i4 = i2 - (this.bf * -342516413);
            int[] iArr = this.bc[i - (this.bl * -1403677009)];
            iArr[i4] = iArr[i4] | 262144;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(int i, int i2, int i3, int i4) {
        try {
            int[] iArr = this.bc[i];
            iArr[i2] = iArr[i2] & i3;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void al(int i, int i2, int i3) {
        try {
            int i4 = i2 - (this.bf * -342516413);
            int[] iArr = this.bc[i - (this.bl * -1403677009)];
            iArr[i4] = iArr[i4] | 2097152;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void am(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        int i7 = z ? 131328 : 256;
        try {
            int i8;
            int i9;
            int i10 = i - (this.bl * -1403677009);
            int i11 = i2 - (this.bf * -342516413);
            if (1 == i5 || i5 == 3) {
                i8 = i4;
                i9 = i3;
            } else {
                i8 = i3;
                i9 = i4;
            }
            int i12 = i10;
            while (i12 < i8 + i10) {
                if (i12 >= 0 && i12 < this.bb * 1646354081) {
                    int i13 = i11;
                    while (i13 < i9 + i11) {
                        if (i13 >= 0 && i13 < this.bi * 1990262327) {
                            ak(i12, i13, i7, 2130903422);
                        }
                        i13++;
                    }
                }
                i12++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void an(int i, int i2) {
        int i3 = i2 - (this.bf * -342516413);
        int[] iArr = this.bc[i - (this.bl * -458436566)];
        iArr[i3] = iArr[i3] | 1110320025;
    }

    public void ao(int i, int i2, int i3, int i4, boolean z) {
        int i5 = z ? 131328 : 256;
        int i6 = i - (this.bl * -1403677009);
        int i7 = i2 - (this.bf * -342516413);
        int i8 = i6;
        while (i8 < i6 + i3) {
            if (i8 >= 0 && i8 < this.bb * 1646354081) {
                int i9 = i7;
                while (i9 < i4 + i7) {
                    if (i9 >= 0 && i9 < this.bi * 1990262327) {
                        ai(i8, i9, i5, -2057023172);
                    }
                    i9++;
                }
            }
            i8++;
        }
    }

    public void ap() {
        int i = 0;
        while (i < this.bb * 1646354081) {
            int i2 = 0;
            while (i2 < this.bi * 1990262327) {
                if (i == 0 || i2 == 0 || i >= (this.bb * 1646354081) - 5 || i2 >= (this.bi * 1990262327) - 5) {
                    this.bc[i][i2] = 16777215;
                } else {
                    this.bc[i][i2] = 16777216;
                }
                i2++;
            }
            i++;
        }
    }

    public void aq(int i, int i2, int i3, int i4, boolean z, int i5) {
        try {
            int i6 = i - (this.bl * -1403677009);
            int i7 = i2 - (this.bf * -342516413);
            if (i3 == 0) {
                if (i4 == 0) {
                    ai(i6, i7, 128, 438234920);
                    ai(i6 - 1, i7, 8, 331585420);
                }
                if (1 == i4) {
                    ai(i6, i7, 2, -433356723);
                    ai(i6, i7 + 1, 32, -2064414577);
                }
                if (i4 == 2) {
                    ai(i6, i7, 8, 1274830628);
                    ai(i6 + 1, i7, 128, -1614171366);
                }
                if (i4 == 3) {
                    ai(i6, i7, 32, 40011138);
                    ai(i6, i7 - 1, 2, 1173669930);
                }
            }
            if (1 == i3 || i3 == 3) {
                if (i4 == 0) {
                    ai(i6, i7, 1, -1156289072);
                    ai(i6 - 1, i7 + 1, 16, 95105405);
                }
                if (i4 == 1) {
                    ai(i6, i7, 4, 889906084);
                    ai(i6 + 1, i7 + 1, 64, -1209910110);
                }
                if (i4 == 2) {
                    ai(i6, i7, 16, -1362080438);
                    ai(i6 + 1, i7 - 1, 1, 1370679049);
                }
                if (i4 == 3) {
                    ai(i6, i7, 64, 2127625818);
                    ai(i6 - 1, i7 - 1, 4, -1232774380);
                }
            }
            if (2 == i3) {
                if (i4 == 0) {
                    ai(i6, i7, 130, 538190658);
                    ai(i6 - 1, i7, 8, -1088606685);
                    ai(i6, i7 + 1, 32, 380491229);
                }
                if (i4 == 1) {
                    ai(i6, i7, 10, 1462857643);
                    ai(i6, i7 + 1, 32, -374084869);
                    ai(i6 + 1, i7, 128, -388196033);
                }
                if (2 == i4) {
                    ai(i6, i7, 40, -645396234);
                    ai(i6 + 1, i7, 128, -1142853723);
                    ai(i6, i7 - 1, 2, 1239586627);
                }
                if (3 == i4) {
                    ai(i6, i7, 160, -142416670);
                    ai(i6, i7 - 1, 2, -130869505);
                    ai(i6 - 1, i7, 8, 696126286);
                }
            }
            if (z) {
                if (i3 == 0) {
                    if (i4 == 0) {
                        ai(i6, i7, 65536, -2119994243);
                        ai(i6 - 1, i7, 4096, 882256288);
                    }
                    if (i4 == 1) {
                        ai(i6, i7, 1024, 2035605981);
                        ai(i6, i7 + 1, 16384, 101974017);
                    }
                    if (2 == i4) {
                        ai(i6, i7, 4096, -129643881);
                        ai(i6 + 1, i7, 65536, 748310045);
                    }
                    if (i4 == 3) {
                        ai(i6, i7, 16384, 1303998475);
                        ai(i6, i7 - 1, 1024, 885172783);
                    }
                }
                if (i3 == 1 || i3 == 3) {
                    if (i4 == 0) {
                        ai(i6, i7, 512, 32685843);
                        ai(i6 - 1, i7 + 1, 8192, 1779874063);
                    }
                    if (1 == i4) {
                        ai(i6, i7, 2048, -23269742);
                        ai(i6 + 1, i7 + 1, 32768, 908777295);
                    }
                    if (i4 == 2) {
                        ai(i6, i7, 8192, 1096120065);
                        ai(i6 + 1, i7 - 1, 512, -723500230);
                    }
                    if (i4 == 3) {
                        ai(i6, i7, 32768, 1718874888);
                        ai(i6 - 1, i7 - 1, 2048, -2061117455);
                    }
                }
                if (2 == i3) {
                    if (i4 == 0) {
                        ai(i6, i7, 66560, -1788511998);
                        ai(i6 - 1, i7, 4096, -504403598);
                        ai(i6, i7 + 1, 16384, 1840905623);
                    }
                    if (1 == i4) {
                        ai(i6, i7, 5120, -661859920);
                        ai(i6, i7 + 1, 16384, -1654960315);
                        ai(i6 + 1, i7, 65536, 17481373);
                    }
                    if (2 == i4) {
                        ai(i6, i7, 20480, 1850620663);
                        ai(i6 + 1, i7, 65536, 1138250042);
                        ai(i6, i7 - 1, 1024, 366438797);
                    }
                    if (i4 == 3) {
                        ai(i6, i7, 81920, 378379693);
                        ai(i6, i7 - 1, 1024, -1461287310);
                        ai(i6 - 1, i7, 4096, -1587536822);
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(int i, int i2, int i3, int i4, boolean z, int i5) {
        int i6 = z ? 131328 : 256;
        try {
            int i7 = i - (this.bl * -1403677009);
            int i8 = i2 - (this.bf * -342516413);
            int i9 = i7;
            while (i9 < i7 + i3) {
                if (i9 >= 0 && i9 < this.bb * 1646354081) {
                    int i10 = i8;
                    while (i10 < i4 + i8) {
                        if (i10 >= 0 && i10 < this.bi * 1990262327) {
                            ai(i9, i10, i6, -1421656278);
                        }
                        i10++;
                    }
                }
                i9++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as(int i, int i2, int i3) {
        try {
            int i4 = i2 - (this.bf * -342516413);
            int[] iArr = this.bc[i - (this.bl * -1403677009)];
            iArr[i4] = iArr[i4] & -262145;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gs.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void at(int i, int i2, int i3) {
        int[] iArr = this.bc[i];
        iArr[i2] = iArr[i2] | i3;
    }

    public void au() {
        int i = 0;
        while (i < this.bb * 1646354081) {
            int i2 = 0;
            while (i2 < this.bi * 1990262327) {
                if (i == 0 || i2 == 0 || i >= (this.bb * 1646354081) - 5 || i2 >= (this.bi * 1990262327) - 5) {
                    this.bc[i][i2] = 16777215;
                } else {
                    this.bc[i][i2] = 16777216;
                }
                i2++;
            }
            i++;
        }
    }

    public void av(int i, int i2) {
        int i3 = i2 - (this.bf * -342516413);
        int[] iArr = this.bc[i - (this.bl * -1403677009)];
        iArr[i3] = iArr[i3] | 262144;
    }

    public void aw(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i - (this.bl * -1403677009);
        int i6 = i2 - (this.bf * -342516413);
        if (i3 == 0) {
            if (i4 == 0) {
                ai(i5, i6, 128, 1351818151);
                ai(i5 - 1, i6, 8, 555789279);
            }
            if (1 == i4) {
                ai(i5, i6, 2, 1107510189);
                ai(i5, i6 + 1, 32, 1450488058);
            }
            if (i4 == 2) {
                ai(i5, i6, 8, 1204631970);
                ai(i5 + 1, i6, 128, 1035594151);
            }
            if (i4 == 3) {
                ai(i5, i6, 32, -1895795393);
                ai(i5, i6 - 1, 2, -241456273);
            }
        }
        if (1 == i3 || i3 == 3) {
            if (i4 == 0) {
                ai(i5, i6, 1, 491804352);
                ai(i5 - 1, i6 + 1, 16, -1284197694);
            }
            if (i4 == 1) {
                ai(i5, i6, 4, 465997295);
                ai(i5 + 1, i6 + 1, 64, 1820461194);
            }
            if (i4 == 2) {
                ai(i5, i6, 16, 664461878);
                ai(i5 + 1, i6 - 1, 1, -1976258374);
            }
            if (i4 == 3) {
                ai(i5, i6, 64, -1769641035);
                ai(i5 - 1, i6 - 1, 4, -534400549);
            }
        }
        if (2 == i3) {
            if (i4 == 0) {
                ai(i5, i6, 130, -1038004919);
                ai(i5 - 1, i6, 8, 1960379813);
                ai(i5, i6 + 1, 32, 390528930);
            }
            if (i4 == 1) {
                ai(i5, i6, 10, -1162542461);
                ai(i5, i6 + 1, 32, -207209139);
                ai(i5 + 1, i6, 128, 1029492269);
            }
            if (2 == i4) {
                ai(i5, i6, 40, 2119737295);
                ai(i5 + 1, i6, 128, 1442146610);
                ai(i5, i6 - 1, 2, -525927000);
            }
            if (3 == i4) {
                ai(i5, i6, 160, -1345985653);
                ai(i5, i6 - 1, 2, -473130645);
                ai(i5 - 1, i6, 8, -2095298007);
            }
        }
        if (z) {
            if (i3 == 0) {
                if (i4 == 0) {
                    ai(i5, i6, 65536, 1612984779);
                    ai(i5 - 1, i6, 4096, 929684871);
                }
                if (i4 == 1) {
                    ai(i5, i6, 1024, -1965292880);
                    ai(i5, i6 + 1, 16384, -266198728);
                }
                if (2 == i4) {
                    ai(i5, i6, 4096, -1978742977);
                    ai(i5 + 1, i6, 65536, 1259426937);
                }
                if (i4 == 3) {
                    ai(i5, i6, 16384, 1559284974);
                    ai(i5, i6 - 1, 1024, -1013455937);
                }
            }
            if (i3 == 1 || i3 == 3) {
                if (i4 == 0) {
                    ai(i5, i6, 512, -1214175339);
                    ai(i5 - 1, i6 + 1, 8192, -847158454);
                }
                if (1 == i4) {
                    ai(i5, i6, 2048, -1591732609);
                    ai(i5 + 1, i6 + 1, 32768, 1694933680);
                }
                if (i4 == 2) {
                    ai(i5, i6, 8192, 787262068);
                    ai(i5 + 1, i6 - 1, 512, -1326225037);
                }
                if (i4 == 3) {
                    ai(i5, i6, 32768, 1977400527);
                    ai(i5 - 1, i6 - 1, 2048, 551644299);
                }
            }
            if (2 == i3) {
                if (i4 == 0) {
                    ai(i5, i6, 66560, -1813821555);
                    ai(i5 - 1, i6, 4096, 1963134203);
                    ai(i5, i6 + 1, 16384, -2085999012);
                }
                if (1 == i4) {
                    ai(i5, i6, 5120, 806448991);
                    ai(i5, i6 + 1, 16384, 975538345);
                    ai(i5 + 1, i6, 65536, 2140830844);
                }
                if (2 == i4) {
                    ai(i5, i6, 20480, 1888976051);
                    ai(i5 + 1, i6, 65536, -1541121330);
                    ai(i5, i6 - 1, 1024, -1814250599);
                }
                if (i4 == 3) {
                    ai(i5, i6, 81920, -630918883);
                    ai(i5, i6 - 1, 1024, -850743698);
                    ai(i5 - 1, i6, 4096, -769326584);
                }
            }
        }
    }

    public void ax() {
        int i = 0;
        while (i < this.bb * 354399997) {
            int i2 = 0;
            while (i2 < this.bi * 1990262327) {
                if (i == 0 || i2 == 0 || i >= (this.bb * 1646354081) - 5 || i2 >= (this.bi * -1634461212) - 5) {
                    this.bc[i][i2] = 16777215;
                } else {
                    this.bc[i][i2] = -1965049696;
                }
                i2++;
            }
            i++;
        }
    }

    public void ay(int i, int i2) {
        int i3 = i2 - (this.bf * -342516413);
        int[] iArr = this.bc[i - (this.bl * -1676816812)];
        iArr[i3] = iArr[i3] | 2097152;
    }

    public void az() {
        int i = 0;
        while (i < this.bb * -1899441554) {
            int i2 = 0;
            while (i2 < this.bi * 1929499789) {
                if (i == 0 || i2 == 0 || i >= (this.bb * -1955920994) - 5 || i2 >= (this.bi * 1990262327) - 5) {
                    this.bc[i][i2] = -1396293149;
                } else {
                    this.bc[i][i2] = -436612069;
                }
                i2++;
            }
            i++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ba(int i, int i2, int i3) {
        int[] iArr = this.bc[i];
        iArr[i2] = iArr[i2] | i3;
    }

    /* Access modifiers changed, original: 0000 */
    public void bb(int i, int i2, int i3) {
        int[] iArr = this.bc[i];
        iArr[i2] = iArr[i2] & i3;
    }

    public void bc(int i, int i2) {
        int i3 = i2 - (this.bf * -624791735);
        int[] iArr = this.bc[i - (this.bl * -1403677009)];
        iArr[i3] = iArr[i3] & 937009546;
    }

    public void bd(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int i8 = z ? -1854593164 : 256;
        int i9 = i - (this.bl * -1403677009);
        int i10 = i2 - (this.bf * 1349844505);
        if (1 == i5 || i5 == 3) {
            i6 = i4;
            i7 = i3;
        } else {
            i6 = i3;
            i7 = i4;
        }
        int i11 = i9;
        while (i11 < i6 + i9) {
            if (i11 >= 0 && i11 < this.bb * 1646354081) {
                int i12 = i10;
                while (i12 < i7 + i10) {
                    if (i12 >= 0 && i12 < this.bi * 1007833527) {
                        ak(i11, i12, i8, 2130903422);
                    }
                    i12++;
                }
            }
            i11++;
        }
    }

    public void bf(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int i8 = z ? 131328 : 256;
        int i9 = i - (this.bl * -1403677009);
        int i10 = i2 - (this.bf * -342516413);
        if (1 == i5 || i5 == 3) {
            i6 = i4;
            i7 = i3;
        } else {
            i6 = i3;
            i7 = i4;
        }
        int i11 = i9;
        while (i11 < i6 + i9) {
            if (i11 >= 0 && i11 < this.bb * 1646354081) {
                int i12 = i10;
                while (i12 < i7 + i10) {
                    if (i12 >= 0 && i12 < this.bi * 1990262327) {
                        ak(i11, i12, i8, 2130903422);
                    }
                    i12++;
                }
            }
            i11++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bi(int i, int i2, int i3) {
        int[] iArr = this.bc[i];
        iArr[i2] = iArr[i2] & i3;
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(int i, int i2, int i3) {
        int[] iArr = this.bc[i];
        iArr[i2] = iArr[i2] | i3;
    }

    public void bl(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int i8 = z ? -776893760 : 256;
        int i9 = i - (this.bl * -1403677009);
        int i10 = i2 - (this.bf * -342516413);
        if (1 == i5 || i5 == 3) {
            i6 = i4;
            i7 = i3;
        } else {
            i6 = i3;
            i7 = i4;
        }
        int i11 = i9;
        while (i11 < i6 + i9) {
            if (i11 >= 0 && i11 < this.bb * 909275889) {
                int i12 = i10;
                while (i12 < i7 + i10) {
                    if (i12 >= 0 && i12 < this.bi * -2115389818) {
                        ak(i11, i12, i8, 2130903422);
                    }
                    i12++;
                }
            }
            i11++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bm(int i, int i2, int i3) {
        int[] iArr = this.bc[i];
        iArr[i2] = iArr[i2] | i3;
    }

    public void bo(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int i8 = z ? -1461251017 : -1461382089;
        int i9 = i - (this.bl * -1403677009);
        int i10 = i2 - (this.bf * -342516413);
        if (1 == i5 || i5 == 3) {
            i6 = i4;
            i7 = i3;
        } else {
            i6 = i3;
            i7 = i4;
        }
        int i11 = i9;
        while (i11 < i6 + i9) {
            if (i11 >= 0 && i11 < this.bb * 1646354081) {
                int i12 = i10;
                while (i12 < i7 + i10) {
                    if (i12 >= 0 && i12 < this.bi * -1987426682) {
                        ak(i11, i12, i8, 2130903422);
                    }
                    i12++;
                }
            }
            i11++;
        }
    }

    public void bq(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i - (this.bl * -1403677009);
        int i6 = i2 - (this.bf * -342516413);
        if (i3 == 0) {
            if (i4 == 0) {
                ak(i5, i6, 128, 2130903422);
                ak(i5 - 1, i6, 8, 2130903422);
            }
            if (1 == i4) {
                ak(i5, i6, 2, 2130903422);
                ak(i5, i6 + 1, 32, 2130903422);
            }
            if (2 == i4) {
                ak(i5, i6, 8, 2130903422);
                ak(i5 + 1, i6, 128, 2130903422);
            }
            if (3 == i4) {
                ak(i5, i6, 32, 2130903422);
                ak(i5, i6 - 1, 2, 2130903422);
            }
        }
        if (1 == i3 || 3 == i3) {
            if (i4 == 0) {
                ak(i5, i6, 1, 2130903422);
                ak(i5 - 1, i6 + 1, 16, 2130903422);
            }
            if (i4 == 1) {
                ak(i5, i6, 4, 2130903422);
                ak(i5 + 1, i6 + 1, 64, 2130903422);
            }
            if (2 == i4) {
                ak(i5, i6, 16, 2130903422);
                ak(i5 + 1, i6 - 1, 1, 2130903422);
            }
            if (3 == i4) {
                ak(i5, i6, 64, 2130903422);
                ak(i5 - 1, i6 - 1, 4, 2130903422);
            }
        }
        if (2 == i3) {
            if (i4 == 0) {
                ak(i5, i6, 130, 2130903422);
                ak(i5 - 1, i6, 8, 2130903422);
                ak(i5, i6 + 1, 32, 2130903422);
            }
            if (1 == i4) {
                ak(i5, i6, 10, 2130903422);
                ak(i5, i6 + 1, 32, 2130903422);
                ak(i5 + 1, i6, 128, 2130903422);
            }
            if (i4 == 2) {
                ak(i5, i6, 40, 2130903422);
                ak(i5 + 1, i6, 128, 2130903422);
                ak(i5, i6 - 1, 2, 2130903422);
            }
            if (i4 == 3) {
                ak(i5, i6, 160, 2130903422);
                ak(i5, i6 - 1, 2, 2130903422);
                ak(i5 - 1, i6, 8, 2130903422);
            }
        }
        if (z) {
            if (i3 == 0) {
                if (i4 == 0) {
                    ak(i5, i6, 65536, 2130903422);
                    ak(i5 - 1, i6, 4096, 2130903422);
                }
                if (i4 == 1) {
                    ak(i5, i6, 1024, 2130903422);
                    ak(i5, i6 + 1, 16384, 2130903422);
                }
                if (i4 == 2) {
                    ak(i5, i6, 4096, 2130903422);
                    ak(i5 + 1, i6, 65536, 2130903422);
                }
                if (i4 == 3) {
                    ak(i5, i6, 16384, 2130903422);
                    ak(i5, i6 - 1, 1024, 2130903422);
                }
            }
            if (1 == i3 || i3 == 3) {
                if (i4 == 0) {
                    ak(i5, i6, 512, 2130903422);
                    ak(i5 - 1, i6 + 1, 8192, 2130903422);
                }
                if (i4 == 1) {
                    ak(i5, i6, 2048, 2130903422);
                    ak(i5 + 1, i6 + 1, 32768, 2130903422);
                }
                if (i4 == 2) {
                    ak(i5, i6, 8192, 2130903422);
                    ak(i5 + 1, i6 - 1, 512, 2130903422);
                }
                if (3 == i4) {
                    ak(i5, i6, 32768, 2130903422);
                    ak(i5 - 1, i6 - 1, 2048, 2130903422);
                }
            }
            if (i3 == 2) {
                if (i4 == 0) {
                    ak(i5, i6, 66560, 2130903422);
                    ak(i5 - 1, i6, 4096, 2130903422);
                    ak(i5, i6 + 1, 16384, 2130903422);
                }
                if (i4 == 1) {
                    ak(i5, i6, 5120, 2130903422);
                    ak(i5, i6 + 1, 16384, 2130903422);
                    ak(i5 + 1, i6, 65536, 2130903422);
                }
                if (2 == i4) {
                    ak(i5, i6, 20480, 2130903422);
                    ak(i5 + 1, i6, 65536, 2130903422);
                    ak(i5, i6 - 1, 1024, 2130903422);
                }
                if (3 == i4) {
                    ak(i5, i6, 81920, 2130903422);
                    ak(i5, i6 - 1, 1024, 2130903422);
                    ak(i5 - 1, i6, 4096, 2130903422);
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(int i, int i2, int i3) {
        int[] iArr = this.bc[i];
        iArr[i2] = iArr[i2] | i3;
    }
}
