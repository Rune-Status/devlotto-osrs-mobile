package defpackage;

/* renamed from: br */
public abstract class br extends mp {
    static pl oq;
    public int bx;

    protected br() {
        try {
            this.bx = 1549132824;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("br.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    protected static final boolean adb(int i) {
        try {
            return jd.uq.ap(-1982668322);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("br.adb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ba(int i, int i2, int i3, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
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
                    int i20 = i19 + i15;
                    i15 = (i15 & 16711935) + (i19 & 16711935);
                    i15 = ((i20 - i15) & 65536) + (16777472 & i15);
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

    static final void ch(int i, int i2, int i3, int i4, byte b) {
        try {
            int cq;
            int random;
            long nanoTime = System.nanoTime();
            client.ii += 1415731479;
            kj.dm(1140550612);
            hy.dt(-1161603040);
            cd.dv(-506836209);
            fq.dr(true, 1075735112);
            gc.di(-1459332423);
            fq.dr(false, 1200064415);
            fq.df(-1032283265);
            lz.da(328456814);
            em.dd(i, i2, i3, i4, true, 5379157);
            int i5 = client.ql * 618079109;
            int i6 = -1964052589 * client.qp;
            int i7 = client.qr * 1271637141;
            int i8 = client.rh * -402617027;
            int i9 = i7 + i5;
            int i10 = i6 + i8;
            client.aq.uk.ad(-601277067).ee(i5, i6, i9, i10, 1577736138);
            bw aci = client.aq.aci(-454516323);
            bl ad = aci.ad(-1323922372);
            ad.ad((byte) 12);
            ad.bv(i5, i6, i9, i10, 941244310);
            ad.bg(1621815858);
            if (!client.po) {
                cq = fs.cq(ec.rs, (byte) 14);
                if ((client.f2if * 2128975215) / 256 > cq) {
                    cq = (client.f2if * 2128975215) / 256;
                }
                int i11 = (!client.qh[4] || client.qk[4] + 128 <= cq) ? cq : client.qk[4] + 128;
                ba.dj(eo.hv * 1897176415, ne.hz * -1979475191, 1983928325 * cl.hs, i11, ig.cn(ec.rs, -1205039571) & 2047, ao.at(i11, 2093769575), i8, -1256819788);
            }
            int db = !client.po ? fw.db(-962506934) : lz.dc(-399293621);
            int i12 = ep.hp;
            int i13 = fj.hc;
            int i14 = cc.hg;
            int i15 = ay.hr;
            int i16 = gs.hd;
            for (cq = 0; cq < 5; cq++) {
                if (client.qh[cq]) {
                    random = (int) (((Math.random() * ((double) ((client.qu[cq] * 2) + 1))) - ((double) client.qu[cq])) + (Math.sin(((double) client.qg[cq]) * (((double) client.qd[cq]) / 100.0d)) * ((double) client.qk[cq])));
                    if (cq == 0) {
                        ep.hp += 2022292187 * random;
                    }
                    if (cq == 1) {
                        fj.hc += -158868505 * random;
                    }
                    if (2 == cq) {
                        cc.hg += 660629861 * random;
                    }
                    if (3 == cq) {
                        gs.hd = (((gs.hd * 772603733) + random) & 2047) * 1300170237;
                    }
                    if (cq == 4) {
                        ay.hr = (random * -823462203) + ay.hr;
                        if (ay.hr * 1914902541 < 128) {
                            ay.hr = 1971020416;
                        }
                        if (ay.hr * 1914902541 > bc.cn) {
                            ay.hr = -1853411141;
                        }
                    }
                }
            }
            cq = -1;
            if (fg.bg(1200122796)) {
                cq = -878530631 * client.bh.as;
                random = client.bh.ag * 1685737557;
            } else {
                random = -1;
            }
            boolean z = cq >= i5 && cq < i9 && random >= i6 && random < i10;
            au.ax(cq - i5, random - i6, z, -1631139272);
            aci.au(client.bj * 2133672263, -1014874158);
            bt.bw((byte) -81);
            bt.bw((byte) -2);
            int bi = ad.bi(-709641588);
            ad.ar(client.rn * -806359681, (short) -4342);
            if (client.sc) {
                ce.fk.bu(aci, 1722134867 * ep.hp, 1470433239 * fj.hc, -91971475 * cc.hg, 1914902541 * ay.hr, 772603733 * gs.hd, db);
            }
            ad.bb(bi, (byte) 1);
            bt.bw((byte) 46);
            ce.fk.ax();
            cx.dy(i5, i6, i7, i8, -463098858);
            dm.du(i5, i6, 1175988316);
            ((cv) il.ax).ba(client.gi * 1546702779, -403358657);
            fx.dx((byte) 28);
            ep.hp = (1722134867 * i12) * 2022292187;
            fj.hc = (1470433239 * i13) * -158868505;
            cc.hg = (-91971475 * i14) * 660629861;
            ay.hr = (1914902541 * i15) * -823462203;
            gs.hd = (772603733 * i16) * 1300170237;
            if (client.be && cu.am(true, false, 1978852694) == 0) {
                client.be = false;
            }
            if (client.be) {
                client.aq.uk.ad(-601277067).al(i5, i6, i7, i8, 0, (byte) 1);
                mv.cg(go.ap, false, -202037108);
            }
            client.sv.ad(System.nanoTime() - nanoTime);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("br.ch(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void ha(byte b) {
        int i = 0;
        while (i < hz.ai * -1076782851) {
            try {
                client.jz[hz.ae[i]].ar(1952205610);
                i++;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("br.ha(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        iy.am(-1683588514);
        if (li.or != null) {
            li.or.cu(-1097203272);
        }
    }

    public abstract bp ab();

    public abstract bp dd();

    public abstract bp dm();

    public abstract bp dt();
}
