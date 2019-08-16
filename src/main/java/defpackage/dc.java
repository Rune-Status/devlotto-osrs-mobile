package defpackage;

/* renamed from: dc */
public class dc extends mp {
    static kh ad = null;
    static dc[] aq = null;
    static dc ar = new dc();
    static ef au = null;
    static final int br = 500;
    static final int cp = 21;
    static int eq;
    static he rx;
    public int ae;
    public int ai;
    public int aj;
    int al;
    public int am;

    dc() {
        try {
            this.al = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dc.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(kh khVar) {
        ad = khVar;
        aq = new dc[khVar.ax(1, (byte) 118)];
        for (int i = 0; i < aq.length; i++) {
            byte[] ar = ad.ar(1, i, 948105930);
            aq[i] = new dc();
            if (ar != null) {
                aq[i].al(new lj(ar), i, 46639333);
            }
            aq[i].ar(2145457699);
        }
    }

    public static dc am(int i) {
        return (i < 0 || i >= aq.length) ? ar : aq[i];
    }

    static char aq(char c, int i) {
        if (181 == c || 402 == c) {
            return c;
        }
        try {
            return Character.toTitleCase(c);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dc.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void av(String str, int i, int i2) {
        try {
            ns aq = ib.aq(no.ch, client.eb.aj, 1882142592);
            aq.ar.al(hs.ag(str, (short) 9023) + 1, 97702866);
            aq.ar.ap(str, 635769462);
            aq.ar.al(i, -184921009);
            client.eb.ar(aq, 1343971639);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dc.av(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void cr(ih ihVar, int i) {
        try {
            dp aq;
            ihVar.an = false;
            if (-1 != ihVar.ce * -1620542321) {
                aq = gn.aq(ihVar.ce * -1620542321, 1570182002);
                if (aq == null || aq.ai == null) {
                    ihVar.ce = 1377230225;
                } else {
                    ihVar.cc += 1709877137;
                    if (ihVar.cy * 631506963 < aq.ai.length && ihVar.cc * -2022639247 > aq.am[ihVar.cy * 631506963]) {
                        ihVar.cc = 1709877137;
                        ihVar.cy += 2083586587;
                        cx.be(aq, ihVar.cy * 631506963, ihVar.bq * -1444273727, ihVar.bd * -1690563339, -1827884972);
                    }
                    if (ihVar.cy * 631506963 >= aq.ai.length) {
                        ihVar.cc = 0;
                        ihVar.cy = 0;
                        cx.be(aq, ihVar.cy * 631506963, ihVar.bq * -1444273727, ihVar.bd * -1690563339, -2092624707);
                    }
                }
            }
            if (ihVar.ck * 836985687 != -1 && client.bj * 2133672263 >= ihVar.cl * -1489469475) {
                if (ihVar.co * 1215520647 < 0) {
                    ihVar.co = 0;
                }
                int i2 = dd.aq(ihVar.ck * 836985687, 812886062).ae * -1443510939;
                if (i2 != -1) {
                    aq = gn.aq(i2, 1698001737);
                    if (aq == null || aq.ai == null) {
                        ihVar.ck = 109561753;
                    } else {
                        ihVar.cu -= 747977287;
                        if (ihVar.co * 1215520647 < aq.ai.length && ihVar.cu * -103436151 > aq.am[ihVar.co * 1215520647]) {
                            ihVar.cu = -747977287;
                            ihVar.co -= 1032833481;
                            cx.be(aq, ihVar.co * 1215520647, ihVar.bq * -1444273727, ihVar.bd * -1690563339, -1845438593);
                        }
                        if (ihVar.co * 1215520647 >= aq.ai.length && (ihVar.co * 1215520647 < 0 || ihVar.co * 1215520647 >= aq.ai.length)) {
                            ihVar.ck = 109561753;
                        }
                    }
                } else {
                    ihVar.ck = 109561753;
                }
            }
            if (-1 == ihVar.cs * -1099198911 || ihVar.cx * -1961250233 > 1 || gn.aq(ihVar.cs * -1099198911, 1739559101).ac * -1282229259 != 1 || ihVar.dn * -2036302051 <= 0 || ihVar.dd * 1994646357 > client.bj * 2133672263 || ihVar.dm * 1739202913 >= client.bj * 2133672263) {
                if (ihVar.cs * -1099198911 != -1 && ihVar.cx * -1961250233 == 0) {
                    aq = gn.aq(ihVar.cs * -1099198911, 1581884397);
                    if (aq == null || aq.ai == null) {
                        ihVar.cs = -1835762113;
                    } else {
                        ihVar.ca -= 16815523;
                        if (ihVar.cr * 317461367 < aq.ai.length && ihVar.ca * 559593973 > aq.am[ihVar.cr * 317461367]) {
                            ihVar.ca = -16815523;
                            ihVar.cr += 919647815;
                            cx.be(aq, ihVar.cr * 317461367, ihVar.bq * -1444273727, ihVar.bd * -1690563339, -1941143458);
                        }
                        if (ihVar.cr * 317461367 >= aq.ai.length) {
                            ihVar.cr -= aq.as * -284194699;
                            ihVar.ct -= 44443503;
                            if (ihVar.ct * 2010441841 >= aq.aw * 1246262671) {
                                ihVar.cs = -1835762113;
                            } else if (ihVar.cr * 317461367 < 0 || ihVar.cr * 317461367 >= aq.ai.length) {
                                ihVar.cs = -1835762113;
                            } else {
                                cx.be(aq, ihVar.cr * 317461367, ihVar.bq * -1444273727, ihVar.bd * -1690563339, -1645300731);
                            }
                        }
                        ihVar.an = aq.ap;
                    }
                }
                if (ihVar.cx * -1961250233 > 0) {
                    ihVar.cx -= 214456183;
                    return;
                }
                return;
            }
            ihVar.cx = 214456183;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dc.cr(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(int i) {
        double d = ((double) ((i >> 16) & 255)) / 256.0d;
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (i & 255)) / 256.0d;
        double d4 = d2 < d ? d2 : d;
        double d5 = d3 < d4 ? d3 : d4;
        d4 = d2 > d ? d2 : d;
        double d6 = d3 > d4 ? d3 : d4;
        d4 = d6 + d5;
        double d7 = d4 / 2.0d;
        double d8 = 0.0d;
        if (d6 != d5) {
            d4 = d7 < 0.5d ? (d6 - d5) / d4 : 0.0d;
            if (d7 >= 0.5d) {
                d4 = (d6 - d5) / ((2.0d - d6) - d5);
            }
            if (d6 == d) {
                d8 = (d2 - d3) / (d6 - d5);
            } else if (d2 == d6) {
                d8 = ((d3 - d) / (d6 - d5)) + 2.0d;
            } else if (d6 == d3) {
                d8 = ((d - d2) / (d6 - d5)) + 4.0d;
            }
        } else {
            d4 = 0.0d;
        }
        d8 /= 6.0d;
        this.ai = ((int) (256.0d * d4)) * 930829725;
        this.ae = ((int) (256.0d * d7)) * 1197774867;
        if (this.ai * -556738379 < 0) {
            this.ai = 0;
        } else if (this.ai * -556738379 > 255) {
            this.ai = 1138378595;
        }
        if (this.ae * 1427567131 < 0) {
            this.ae = 0;
        } else if (this.ae * 1427567131 > 255) {
            this.ae = 489913069;
        }
        if (d7 > 0.5d) {
            this.am = ((int) ((d4 * (1.0d - d7)) * 512.0d)) * 581752329;
        } else {
            this.am = ((int) ((d4 * d7) * 512.0d)) * 581752329;
        }
        if (this.am * 1756862521 < 1) {
            this.am = 581752329;
        }
        this.aj = ((int) (((double) (this.am * 1756862521)) * d8)) * -1718211957;
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(int i) {
        double d = ((double) ((i >> 16) & 255)) / 256.0d;
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (i & 255)) / 256.0d;
        double d4 = d2 < d ? d2 : d;
        double d5 = d3 < d4 ? d3 : d4;
        d4 = d2 > d ? d2 : d;
        double d6 = d3 > d4 ? d3 : d4;
        d4 = d6 + d5;
        double d7 = d4 / 2.0d;
        double d8 = 0.0d;
        if (d6 != d5) {
            d4 = d7 < 0.5d ? (d6 - d5) / d4 : 0.0d;
            if (d7 >= 0.5d) {
                d4 = (d6 - d5) / ((2.0d - d6) - d5);
            }
            if (d6 == d) {
                d8 = (d2 - d3) / (d6 - d5);
            } else if (d2 == d6) {
                d8 = ((d3 - d) / (d6 - d5)) + 2.0d;
            } else if (d6 == d3) {
                d8 = ((d - d2) / (d6 - d5)) + 4.0d;
            }
        } else {
            d4 = 0.0d;
        }
        d8 /= 6.0d;
        this.ai = ((int) (256.0d * d4)) * 930829725;
        this.ae = ((int) (256.0d * d7)) * 1197774867;
        if (this.ai * 1787286159 < 0) {
            this.ai = 0;
        } else if (this.ai * 1495723447 > 255) {
            this.ai = 1138378595;
        }
        if (this.ae * 1427567131 < 0) {
            this.ae = 0;
        } else if (this.ae * 1427567131 > 255) {
            this.ae = -1419064946;
        }
        if (d7 > 0.5d) {
            this.am = ((int) ((d4 * (1.0d - d7)) * 512.0d)) * -1947107674;
        } else {
            this.am = ((int) ((d4 * d7) * 512.0d)) * 581752329;
        }
        if (this.am * 1756862521 < 1) {
            this.am = -16135992;
        }
        this.aj = ((int) (((double) (this.am * 1590346902)) * d8)) * -1718211957;
    }

    /* Access modifiers changed, original: 0000 */
    public void ag() {
        ai(this.al * -1984741578, -1897085335);
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i, int i2) {
        double d = ((double) ((i >> 16) & 255)) / 256.0d;
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d3 = ((double) (i & 255)) / 256.0d;
        double d4 = d2 < d ? d2 : d;
        double d5 = d3 < d4 ? d3 : d4;
        d4 = d2 > d ? d2 : d;
        double d6 = d3 > d4 ? d3 : d4;
        d4 = d6 + d5;
        double d7 = d4 / 2.0d;
        double d8 = 0.0d;
        if (d6 != d5) {
            d4 = d7 < 0.5d ? (d6 - d5) / d4 : 0.0d;
            if (d7 >= 0.5d) {
                d4 = (d6 - d5) / ((2.0d - d6) - d5);
            }
            if (d6 == d) {
                d8 = (d2 - d3) / (d6 - d5);
            } else if (d2 == d6) {
                d8 = ((d3 - d) / (d6 - d5)) + 2.0d;
            } else if (d6 == d3) {
                d8 = ((d - d2) / (d6 - d5)) + 4.0d;
            }
        } else {
            d4 = 0.0d;
        }
        d8 /= 6.0d;
        try {
            this.ai = ((int) (256.0d * d4)) * 930829725;
            this.ae = ((int) (256.0d * d7)) * 1197774867;
            if (this.ai * -556738379 < 0) {
                this.ai = 0;
            } else if (this.ai * -556738379 > 255) {
                this.ai = 1138378595;
            }
            if (this.ae * 1427567131 < 0) {
                this.ae = 0;
            } else if (this.ae * 1427567131 > 255) {
                this.ae = 489913069;
            }
            if (d7 > 0.5d) {
                this.am = ((int) ((d4 * (1.0d - d7)) * 512.0d)) * 581752329;
            } else {
                this.am = ((int) ((d4 * d7) * 512.0d)) * 581752329;
            }
            if (this.am * 1756862521 < 1) {
                this.am = 581752329;
            }
            this.aj = ((int) (((double) (this.am * 1756862521)) * d8)) * -1718211957;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dc.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(lj ljVar, int i, int i2, int i3) {
        if (1 == i) {
            try {
                this.al = ljVar.av((byte) -49) * 1865984719;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dc.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak() {
        ai(this.al * -2047264580, -1936100069);
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, int i2) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    aj(ljVar, af, i, -832555353);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dc.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(lj ljVar, int i) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, i, 1067164091);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i) {
        try {
            ai(this.al * -1846141905, -1950721029);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dc.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as() {
        ai(this.al * -383076872, -1969272503);
    }

    /* Access modifiers changed, original: 0000 */
    public void au(lj ljVar, int i) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, i, -1027821381);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(lj ljVar, int i, int i2) {
        if (1 == i) {
            this.al = ljVar.av((byte) -43) * 1865984719;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(lj ljVar, int i, int i2) {
        if (1 == i) {
            this.al = ljVar.av((byte) -79) * 1865984719;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az(lj ljVar, int i) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                aj(ljVar, af, i, -894009160);
            } else {
                return;
            }
        }
    }
}
