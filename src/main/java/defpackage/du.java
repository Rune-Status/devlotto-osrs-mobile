package defpackage;

import java.util.Collection;

/* renamed from: du */
public class du extends mp {
    static kh ad = null;
    public static final int ag = 3;
    static gz aq = new gz(64, null);
    static final int bd = 19136911;
    static lr fw;
    public int ae;
    public int ai;
    public String aj;
    public int[] ak;
    public char al;
    public int[] am;
    public char ar;
    public String[] as;

    du() {
        try {
            this.aj = go.ak;
            this.ae = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("du.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ab(Collection collection) {
        collection.add(aq);
    }

    public static void ae(Collection collection, int i) {
        try {
            collection.add(dg.ar);
            collection.add(dg.al);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("du.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(kh khVar) {
        ad = khVar;
    }

    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r1 = r6.af(1804771424);
     */
    /* JADX WARNING: Missing block: B:19:0x0076, code skipped:
            if (r1 != 1) goto L_0x0103;
     */
    /* JADX WARNING: Missing block: B:20:0x0078, code skipped:
            if (r7 != 0) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:21:0x007a, code skipped:
            defpackage.in.ad[0][r8][r9] = (-r0) * 8;
     */
    /* JADX WARNING: Missing block: B:22:0x0087, code skipped:
            defpackage.in.ad[r7][r8][r9] = defpackage.in.ad[r7 - 1][r8][r9] - (r0 * 8);
     */
    /* JADX WARNING: Missing block: B:35:0x0103, code skipped:
            r0 = r1;
     */
    /* JADX WARNING: Missing block: B:49:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:50:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void ae(lj ljVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 0;
        if (i2 < 0 || i2 >= 104 || i3 < 0 || i3 >= 104) {
            while (true) {
                i8 = ljVar.af(1804771424);
                if (i8 == 0) {
                    return;
                }
                if (i8 == 1) {
                    ljVar.af(1804771424);
                    return;
                } else if (i8 <= 49) {
                    ljVar.af(1804771424);
                }
            }
        } else {
            try {
                in.aq[i][i2][i3] = (byte) 0;
                while (true) {
                    int af = ljVar.af(1804771424);
                    if (af == 0) {
                        if (i == 0) {
                            in.ad[0][i2][i3] = (-ey.az((932731 + i2) + i4, (556238 + i3) + i5, (byte) -102)) * 8;
                            return;
                        } else {
                            in.ad[i][i2][i3] = in.ad[i - 1][i2][i3] - 240;
                            return;
                        }
                    } else if (af == 1) {
                        break;
                    } else if (af <= 49) {
                        in.aj[i][i2][i3] = ljVar.ay(1949854684);
                        af -= 2;
                        fk.ai[i][i2][i3] = (byte) (af / 4);
                        ja.ae[i][i2][i3] = (byte) ((af + i6) & 3);
                    } else if (af <= 81) {
                        in.aq[i][i2][i3] = (byte) (af - 49);
                    } else {
                        am.al[i][i2][i3] = (byte) (af - 81);
                    }
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("du.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public static du ag(int i) {
        long j = (long) i;
        du duVar = (du) aq.ad(j);
        if (duVar == null) {
            byte[] ar = ad.ar(8, i, 2049401724);
            duVar = new du();
            if (ar != null) {
                duVar.ar(new lj(ar), 1555619716);
            }
            aq.ar(duVar, j);
        }
        return duVar;
    }

    public static du ak(int i) {
        long j = (long) i;
        du duVar = (du) aq.ad(j);
        if (duVar == null) {
            byte[] ar = ad.ar(8, i, 780068783);
            duVar = new du();
            if (ar != null) {
                duVar.ar(new lj(ar), 1590455386);
            }
            aq.ar(duVar, j);
        }
        return duVar;
    }

    public static boolean ak(int i, int i2) {
        return ((i >> 30) & 1) != 0;
    }

    public static void am(kh khVar) {
        ad = khVar;
    }

    public static void an(Collection collection) {
        collection.add(aq);
    }

    public static du ap(int i) {
        long j = (long) i;
        du duVar = (du) aq.ad(j);
        if (duVar == null) {
            byte[] ar = ad.ar(8, i, 729349821);
            duVar = new du();
            if (ar != null) {
                duVar.ar(new lj(ar), 1536793365);
            }
            aq.ar(duVar, j);
        }
        return duVar;
    }

    public static du as(int i) {
        long j = (long) i;
        du duVar = (du) aq.ad(j);
        if (duVar == null) {
            byte[] ar = ad.ar(8, i, 1313467541);
            duVar = new du();
            if (ar != null) {
                duVar.ar(new lj(ar), 1651829766);
            }
            aq.ar(duVar, j);
        }
        return duVar;
    }

    public static void av(Collection collection) {
        collection.add(aq);
    }

    public static void ay(Collection collection) {
        collection.add(aq);
    }

    public int aa() {
        return this.ae * -979082148;
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(lj ljVar, int i) {
        int i2 = 0;
        if (i == 1) {
            this.ar = (char) ljVar.af(1804771424);
        } else if (2 == i) {
            this.al = (char) ljVar.af(1804771424);
        } else if (i == 3) {
            this.aj = ljVar.bm(2138776678);
        } else if (i == 4) {
            this.ai = ljVar.at((byte) -40) * 271166955;
        } else if (i == 5) {
            this.ae = ljVar.an(-1464407032) * -265526637;
            this.am = new int[(this.ae * 2047609755)];
            this.as = new String[(this.ae * 2047609755)];
            while (i2 < this.ae * 2047609755) {
                this.am[i2] = ljVar.at((byte) -45);
                this.as[i2] = ljVar.bm(1653751149);
                i2++;
            }
        } else if (i == 6) {
            this.ae = ljVar.an(-1464407032) * -265526637;
            this.am = new int[(this.ae * 2047609755)];
            this.ak = new int[(this.ae * 2047609755)];
            while (i2 < this.ae * 2047609755) {
                this.am[i2] = ljVar.at((byte) -46);
                this.ak[i2] = ljVar.at((byte) -23);
                i2++;
            }
        }
    }

    public int af() {
        return this.ae * 2047609755;
    }

    public int ah() {
        return this.ae * 2047609755;
    }

    public int aj(int i) {
        try {
            return this.ae * 2047609755;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("du.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, int i2) {
        int i3 = 0;
        if (i == 1) {
            try {
                this.ar = (char) ljVar.af(1804771424);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("du.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (2 == i) {
            this.al = (char) ljVar.af(1804771424);
        } else if (i == 3) {
            this.aj = ljVar.bm(1511345196);
        } else if (i == 4) {
            this.ai = ljVar.at((byte) -7) * 271166955;
        } else if (i == 5) {
            this.ae = ljVar.an(-1464407032) * -265526637;
            this.am = new int[(this.ae * 2047609755)];
            this.as = new String[(this.ae * 2047609755)];
            while (i3 < this.ae * 2047609755) {
                this.am[i3] = ljVar.at((byte) -5);
                this.as[i3] = ljVar.bm(1779769982);
                i3++;
            }
        } else if (i == 6) {
            this.ae = ljVar.an(-1464407032) * -265526637;
            this.am = new int[(this.ae * 2047609755)];
            this.ak = new int[(this.ae * 2047609755)];
            while (i3 < this.ae * 2047609755) {
                this.am[i3] = ljVar.at((byte) -87);
                this.ak[i3] = ljVar.at((byte) -67);
                i3++;
            }
        }
    }

    public int ao() {
        return this.ae * 2047609755;
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, int i) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    al(ljVar, af, -1141540816);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("du.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, -1141540816);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(lj ljVar, int i) {
        int i2 = 0;
        if (i == 1) {
            this.ar = (char) ljVar.af(1804771424);
        } else if (2 == i) {
            this.al = (char) ljVar.af(1804771424);
        } else if (i == 3) {
            this.aj = ljVar.bm(1035401500);
        } else if (i == 4) {
            this.ai = ljVar.at((byte) -99) * 271166955;
        } else if (i == 5) {
            this.ae = ljVar.an(-1464407032) * -265526637;
            this.am = new int[(this.ae * 2047609755)];
            this.as = new String[(this.ae * 2047609755)];
            while (i2 < this.ae * 2047609755) {
                this.am[i2] = ljVar.at((byte) -112);
                this.as[i2] = ljVar.bm(1098017726);
                i2++;
            }
        } else if (i == 6) {
            this.ae = ljVar.an(-1464407032) * -265526637;
            this.am = new int[(this.ae * 2047609755)];
            this.ak = new int[(this.ae * 2047609755)];
            while (i2 < this.ae * 2047609755) {
                this.am[i2] = ljVar.at((byte) -109);
                this.ak[i2] = ljVar.at((byte) -80);
                i2++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(lj ljVar, int i) {
        int i2 = 0;
        if (i == 1) {
            this.ar = (char) ljVar.af(1804771424);
        } else if (2 == i) {
            this.al = (char) ljVar.af(1804771424);
        } else if (i == 3) {
            this.aj = ljVar.bm(1307142180);
        } else if (i == 4) {
            this.ai = ljVar.at((byte) -99) * 271166955;
        } else if (i == 5) {
            this.ae = ljVar.an(-1464407032) * -265526637;
            this.am = new int[(this.ae * 2047609755)];
            this.as = new String[(this.ae * 2047609755)];
            while (i2 < this.ae * 2047609755) {
                this.am[i2] = ljVar.at((byte) -45);
                this.as[i2] = ljVar.bm(1310590735);
                i2++;
            }
        } else if (i == 6) {
            this.ae = ljVar.an(-1464407032) * -265526637;
            this.am = new int[(this.ae * 2047609755)];
            this.ak = new int[(this.ae * 2047609755)];
            while (i2 < this.ae * 2047609755) {
                this.am[i2] = ljVar.at((byte) -86);
                this.ak[i2] = ljVar.at((byte) -28);
                i2++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, -1141540816);
            } else {
                return;
            }
        }
    }
}
