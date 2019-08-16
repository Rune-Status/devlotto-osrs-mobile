package defpackage;

import java.util.Collection;

/* renamed from: ey */
public class ey extends eg {
    public static final String ai = "cgcPRM";
    public static final int bv = 40;
    static final int ep = 3261415;
    static final int jd = 6;
    int ad;

    ey() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ey.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int ad(int i, int i2, int i3, byte b) {
        int i4 = i3 & 3;
        return i4 == 0 ? i : i4 == 1 ? i2 : i4 == 2 ? 7 - i : 7 - i2;
    }

    public static final ee ad(byte[] bArr, int i) {
        try {
            return cb.acb(bArr, 1549612164);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ey.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aw(Collection collection, int i) {
        try {
            collection.add(al.au);
            collection.add(al.az);
            collection.add(al.ax);
            collection.add(al.aw);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ey.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int az(int i, int i2, byte b) {
        try {
            int ax = ((int) (((double) (((ds.ax(45365 + i, 91923 + i2, 4, 2145711630) - 128) + ((ds.ax(i + 10294, 37821 + i2, 2, 2081377543) - 128) >> 1)) + ((ds.ax(i, i2, 1, 2082723098) - 128) >> 2))) * 0.3d)) + 35;
            return ax < 10 ? 10 : ax <= 60 ? ax : 60;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ey.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void br(int i) {
        int i2 = 0;
        while (i2 < client.pq * 924362057) {
            try {
                int i3;
                int[] iArr = client.pi;
                iArr[i2] = iArr[i2] - 1;
                int i4;
                if (client.pi[i2] < -10) {
                    client.pq += 1650893575;
                    i3 = i2;
                    while (i3 < client.pq * 924362057) {
                        i4 = i3 + 1;
                        client.pe[i3] = client.pe[i4];
                        client.ps[i3] = client.ps[i4];
                        client.pg[i3] = client.pg[i4];
                        client.pi[i3] = client.pi[i4];
                        client.pr[i3] = client.pr[i4];
                        i3 = i4;
                    }
                    i3 = i2 - 1;
                } else {
                    hp hpVar = client.ps[i2];
                    if (hpVar == null) {
                        hpVar = (hp) null;
                        hpVar = hp.ad(av.cg, client.pe[i2], 0);
                        if (hpVar != null) {
                            int[] iArr2 = client.pi;
                            iArr2[i2] = iArr2[i2] + hpVar.ar();
                            client.ps[i2] = hpVar;
                        }
                        i3 = i2;
                    }
                    if (client.pi[i2] < 0) {
                        if (client.pr[i2] != 0) {
                            int i5 = (client.pr[i2] & 255) * 128;
                            i4 = ((((client.pr[i2] >> 16) & 255) * 128) + 64) - (da.jc.bq * -1444273727);
                            int i6 = i4 < 0 ? -i4 : i4;
                            i4 = ((((client.pr[i2] >> 8) & 255) * 128) + 64) - (da.jc.bd * -1690563339);
                            if (i4 < 0) {
                                i4 = -i4;
                            }
                            i4 = (i4 + i6) - 128;
                            if (i4 > i5) {
                                client.pi[i2] = -100;
                                i3 = i2;
                            } else {
                                if (i4 < 0) {
                                    i4 = 0;
                                }
                                i4 = ((i5 - i4) * (client.pp * 1070201509)) / i5;
                            }
                        } else {
                            i4 = client.pz * -55365409;
                        }
                        if (i4 > 0) {
                            hf ar = hf.ar(hpVar.aq().ad(dk.px), 100, i4);
                            ar.as(client.pg[i2] - 1);
                            gd.pf.ad(ar);
                        }
                        client.pi[i2] = -100;
                        i3 = i2;
                    }
                    i3 = i2;
                }
                i2 = i3 + 1;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ey.br(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        if (client.pv && !au.ak((byte) -8)) {
            if (!(client.ph * -413365419 == 0 || -1 == client.pl * -1843875795)) {
                eb.ar(cw.dd, client.pl * -1843875795, 0, client.ph * -413365419, false, -1739629450);
            }
            client.pv = false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(ey eyVar, int i) {
        try {
            return (this.ad * 252964737) - (eyVar.ad * 252964737);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ey.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj) {
        return ad((ey) obj, 1793940957);
    }

    public int ai(eg egVar) {
        return ad((ey) egVar, 2035820658);
    }

    /* Access modifiers changed, original: 0000 */
    public int aj(ey eyVar) {
        return (this.ad * 252964737) - (eyVar.ad * 252964737);
    }

    /* Access modifiers changed, original: 0000 */
    public int al(ey eyVar) {
        return (this.ad * 252964737) - (eyVar.ad * 252964737);
    }

    public int ap(Object obj) {
        return ad((ey) obj, 1697531663);
    }

    public int aq(eg egVar, int i) {
        try {
            return ad((ey) egVar, 1176536735);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ey.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(ey eyVar) {
        return (this.ad * 2130399836) - (eyVar.ad * 1806984237);
    }

    public int as(Object obj) {
        return ad((ey) obj, -1544663498);
    }

    public int au(Object obj) {
        return ad((ey) obj, 1749125229);
    }

    public int compareTo(Object obj) {
        try {
            return ad((ey) obj, -1192631454);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ey.compareTo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
