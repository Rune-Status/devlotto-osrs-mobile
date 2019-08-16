package defpackage;

/* renamed from: ay */
public final class ay {
    public static final int bs = 30;
    static int hr = 0;
    static final int ol = 48;
    int aa;
    int ac;
    int ad;
    int ae;
    int ag;
    int ai;
    int aj;
    int ak;
    int al;
    int am;
    int ap;
    int aq;
    int ar;
    int as;
    int au;
    int aw;
    int ax;
    int az;

    ay() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, int i) {
        try {
            da.ad = khVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ad(kh khVar, kh khVar2, kh khVar3, kp kpVar, int i) {
        try {
            fg.ad = khVar;
            ko.aq = khVar2;
            en.ar = khVar3;
            ji.al = kpVar;
            ko.aj = 0;
            return true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final short ae(int i, byte b) {
        int i2 = i + 1;
        try {
            return (short) ((i2 % 16) | ((i2 / 16) << 8));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static oi ag(kh khVar, kh khVar2, String str, String str2, int i) {
        try {
            int af = khVar.af(str, -1436064802);
            return hy.ae(khVar, khVar2, af, khVar.ay(af, str2, (byte) -104), (short) -26832);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static boolean ai(lv lvVar, int i, byte b) {
        boolean z = false;
        try {
            int jm = lvVar.jm(2, 1202562040);
            int jm2;
            int i2;
            int jm3;
            if (jm == 0) {
                if (lvVar.jm(1, -673458271) != 0) {
                    ay.ai(lvVar, i, (byte) -122);
                }
                jm = lvVar.jm(13, -1815051043);
                jm2 = lvVar.jm(13, 2089224891);
                if (lvVar.jm(1, 1738977305) == 1) {
                    z = true;
                }
                if (z) {
                    int[] iArr = hz.az;
                    i2 = hz.au - 825632607;
                    hz.au = i2;
                    iArr[(i2 * -1082782879) - 1] = i;
                }
                if (client.jz[i] == null) {
                    hv[] hvVarArr = client.jz;
                    hv hvVar = new hv();
                    hvVarArr[i] = hvVar;
                    hvVar.av = 886128595 * i;
                    if (hz.aj[i] != null) {
                        hvVar.ad(hz.aj[i], 2073848384);
                    }
                    hvVar.dl = hz.ag[i] * -290101431;
                    hvVar.cp = hz.ap[i] * 260026025;
                    int i3 = hz.as[i];
                    hvVar.du[0] = hz.al[i];
                    hvVar.ab = ((byte) (i3 >> 28)) * -762089045;
                    hvVar.as((jm + (((i3 >> 14) & 255) << 13)) - (oz.ff * 2060098323), (((i3 & 255) << 13) + jm2) - (cq.fz * -1866366501), (short) 16256);
                    hvVar.ba = false;
                    return true;
                }
                throw new RuntimeException();
            } else if (jm == 1) {
                jm3 = lvVar.jm(2, 925171153);
                jm = hz.as[i];
                hz.as[i] = (((jm3 + (jm >> 28)) & 3) << 28) + (268435455 & jm);
                return false;
            } else if (2 == jm) {
                i2 = lvVar.jm(5, 1267879505);
                int i4 = i2 & 7;
                int i5 = hz.as[i];
                jm2 = (i5 >> 14) & 255;
                jm = i5 & 255;
                if (i4 == 0) {
                    jm2--;
                    jm--;
                }
                if (1 == i4) {
                    jm--;
                }
                if (i4 == 2) {
                    jm3 = jm2 + 1;
                    jm--;
                } else {
                    jm3 = jm2;
                }
                if (3 == i4) {
                    jm3--;
                }
                if (4 == i4) {
                    jm3++;
                }
                if (i4 == 5) {
                    jm3--;
                    jm++;
                }
                if (i4 == 6) {
                    jm++;
                }
                if (7 == i4) {
                    jm3++;
                    jm++;
                }
                hz.as[i] = ((jm3 << 14) + ((((i2 >> 3) + (i5 >> 28)) & 3) << 28)) + jm;
                return false;
            } else {
                jm3 = lvVar.jm(18, 1204605393);
                jm = hz.as[i];
                hz.as[i] = ((((((jm3 >> 8) & 255) + (jm >> 14)) & 255) << 14) + ((((jm >> 28) + (jm3 >> 16)) & 3) << 28)) + (((jm3 & 255) + jm) & 255);
                return false;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int as(int i, int i2) {
        try {
            ip ipVar = (ip) it.aq.ad((long) i);
            return ipVar == null ? -1 : ipVar.ds == it.ar.ad ? -1 : ((ip) ipVar.ds).ad * -106728945;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void bc(byte b) {
        try {
            if (client.ep * -536395627 > 0 || gq.ad((byte) 12) > (ib.to * 6879058941696951225L) + 60000) {
                ej.bf(1836409861);
                return;
            }
            client.fq.aq(-885402790);
            he.ac(40, (byte) 102);
            aa.ev = client.eb.ae(1957704486);
            client.eb.ai(-742408241);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.bc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void bh(int i) {
        try {
            hm.cu = 461952968;
            lv.bs(go.ly, go.lb, go.lk, -1804322940);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.bh(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void gc(al alVar, int i, int i2, boolean z, byte b) {
        try {
            int i3 = alVar.bl;
            int i4 = alVar.bf;
            if (alVar.at * 538883731 == 0) {
                alVar.bl = alVar.bm * 787158961;
            } else if (1 == alVar.at * 538883731) {
                alVar.bl = (i - (alVar.bm * -499317633)) * -501412913;
            } else if (2 == alVar.at * 538883731) {
                alVar.bl = (((alVar.bm * -499317633) * i) >> 14) * -501412913;
            }
            if (alVar.bk * -606212997 == 0) {
                alVar.bf = alVar.bq * -562985301;
            } else if (1 == alVar.bk * -606212997) {
                alVar.bf = (i2 - (alVar.bq * 1542957535)) * -720431947;
            } else if (alVar.bk * -606212997 == 2) {
                alVar.bf = (((alVar.bq * 1542957535) * i2) >> 14) * -720431947;
            }
            if (4 == alVar.at * 538883731) {
                alVar.bl = (((alVar.bb * -48765065) * (alVar.bf * 1813264797)) / (alVar.bi * -616439117)) * -501412913;
            }
            if (alVar.bk * -606212997 == 4) {
                alVar.bf = (((alVar.bl * 1272191791) * (alVar.bi * -616439117)) / (alVar.bb * -48765065)) * -720431947;
            }
            if (alVar.an * 365070409 == al.ad) {
                client.lw = alVar;
            }
            if (z && alVar.fh != null) {
                if (alVar.bl * 1272191791 != i3 * 1272191791 || alVar.bf * 1813264797 != i4 * 1813264797) {
                    il ilVar = new il();
                    ilVar.ar = alVar;
                    ilVar.ad = alVar.fh;
                    client.nx.aq(ilVar);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.gc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void hq(is isVar, boolean z, byte b) {
        try {
            int i = isVar.ad * 1810639839;
            int i2 = (int) isVar.gs;
            isVar.ky();
            if (z) {
                ae.aj(i, (byte) -9);
            }
            dp.hb(i, (byte) 41);
            al aq = da.aq(i2, -550158556);
            if (aq != null) {
                da.gk(aq, (byte) 2);
            }
            gc.km.bz(859460203);
            if (client.ka * 676917989 != -1) {
                ag.gu(client.ka * 676917989, 1, 40700358);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.hq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ie(byte[] bArr, int i, int i2) {
        try {
            if (client.ek == null) {
                client.ek = new byte[24];
            }
            mq.ad(bArr, i, client.ek, 0, 24);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ay.ie(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
