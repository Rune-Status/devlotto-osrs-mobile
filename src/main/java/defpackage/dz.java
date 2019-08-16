package defpackage;

import java.util.Collection;

/* renamed from: dz */
public class dz extends mp {
    static gz al = new gz(30, null);
    static gz ar = new gz(64, null);
    public static final int be = 46;
    public static final int bp = 58;
    static final int bs = 2;
    static oi fn;
    static int ml;
    public int ae;
    short[] ag;
    int ai;
    int aj;
    short[] ak;
    short[] am;
    int ap;
    short[] as;
    int au;
    int aw;
    int ax;
    int az;

    dz() {
        try {
            this.ae = 1240865683;
            this.ap = -1911590016;
            this.au = -827411584;
            this.az = 0;
            this.ax = 0;
            this.aw = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dz.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int ac(int i, int i2, int i3) {
        int i4 = i - 1;
        int i5 = i2 - 1;
        try {
            int aa = dk.aa(i4, i5, (byte) 3);
            int i6 = i + 1;
            int aa2 = dk.aa(i6, i5, (byte) 3);
            int i7 = i2 + 1;
            int aa3 = dk.aa(i4, i7, (byte) 3);
            int aa4 = dk.aa(i6, i7, (byte) 3);
            i4 = dk.aa(i4, i2, (byte) 3);
            i6 = dk.aa(i6, i2, (byte) 3);
            i5 = dk.aa(i, i5, (byte) 3);
            return (((((i4 + i6) + i5) + dk.aa(i, i7, (byte) 3)) / 8) + ((((aa + aa2) + aa3) + aa4) / 16)) + (dk.aa(i, i2, (byte) 3) / 4);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dz.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ae(kh khVar, kh khVar2) {
        oc.ad = khVar;
        lf.aq = khVar2;
    }

    public static void af(Collection collection) {
        collection.add(ar);
        collection.add(al);
    }

    public static void ah(Collection collection) {
        collection.add(ar);
        collection.add(al);
    }

    public static dz ak(int i) {
        long j = (long) i;
        dz dzVar = (dz) ar.ad(j);
        if (dzVar == null) {
            byte[] ar = oc.ad.ar(13, i, 2044939169);
            dzVar = new dz();
            dzVar.aj = 784557271 * i;
            if (ar != null) {
                dzVar.ar(new lj(ar), (byte) -82);
            }
            ar.ar(dzVar, j);
        }
        return dzVar;
    }

    public static void am(kh khVar, kh khVar2) {
        oc.ad = khVar;
        lf.aq = khVar2;
    }

    public static void an(Collection collection) {
        collection.add(ar);
        collection.add(al);
    }

    static final boolean an(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            int i9 = (bu.aj * -645814395) + i7;
            if (i9 < i && i9 < i2 && i9 < i3) {
                return false;
            }
            i9 = (bu.aj * -645814395) - i7;
            if (i9 > i && i9 > i2 && i9 > i3) {
                return false;
            }
            i9 = (bu.al * 1111875095) + i7;
            if (i9 < i4 && i9 < i5 && i9 < i6) {
                return false;
            }
            i9 = (bu.al * 1111875095) - i7;
            return i9 <= i4 || i9 <= i5 || i9 <= i6;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dz.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void aq(lv lvVar, int i, int i2) {
        StringBuilder stringBuilder;
        try {
            int i3 = lvVar.al * -1631454091;
            hz.au = 0;
            cx.ar(lvVar, -1692113868);
            eq.ae(lvVar, (byte) 125);
            if ((lvVar.al * -1631454091) - i3 != i) {
                stringBuilder = new StringBuilder();
                stringBuilder.append((lvVar.al * -1631454091) - i3);
                stringBuilder.append(" ");
                stringBuilder.append(i);
                throw new RuntimeException(stringBuilder.toString());
            }
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("dz.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ay(Collection collection) {
        collection.add(ar);
        collection.add(al);
    }

    static void bf(int i) {
        try {
            if (cc.ad(404460328)) {
                hm.ez = true;
                hm.eg = 0;
                hm.ed = 0;
                hm.er = null;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dz.bf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final bp aa(int i) {
        int i2 = 0;
        bp bpVar = (bp) al.ad((long) (this.aj * 359517927));
        if (bpVar == null) {
            bo ad = bo.ad(lf.aq, this.ai * 1293777631, 0);
            if (ad == null) {
                return null;
            }
            if (this.am != null) {
                for (int i3 = 0; i3 < this.am.length; i3++) {
                    ad.au(this.am[i3], this.ak[i3]);
                }
            }
            if (this.as != null) {
                while (i2 < this.as.length) {
                    ad.az(this.as[i2], this.ag[i2]);
                    i2++;
                }
            }
            bpVar = ad.af((this.ax * -975646751) + 64, (this.aw * -1916286517) + 850, -30, -50, -30);
            al.ar(bpVar, (long) (this.aj * 359517927));
        }
        bpVar = (-1 == this.ae * -1443510939 || i == -1) ? bpVar.ar(true) : gn.aq(this.ae * -1443510939, 1852327277).am(bpVar, i, (byte) -91);
        if (!(this.ap * 1313346775 == 128 && this.au * 1285910103 == 128)) {
            bpVar.aa(this.ap * 1313346775, this.au * 1285910103, this.ap * 1313346775);
        }
        if (this.az * 1245248493 == 0) {
            return bpVar;
        }
        if (90 == this.az * 1245248493) {
            bpVar.au();
        }
        if (this.az * 1245248493 == 180) {
            bpVar.au();
            bpVar.au();
        }
        if (270 != this.az * 1245248493) {
            return bpVar;
        }
        bpVar.au();
        bpVar.au();
        bpVar.au();
        return bpVar;
    }

    public final bp ac(int i) {
        int i2 = 0;
        bp bpVar = (bp) al.ad((long) (this.aj * 359517927));
        if (bpVar == null) {
            bo ad = bo.ad(lf.aq, this.ai * 1293777631, 0);
            if (ad == null) {
                return null;
            }
            if (this.am != null) {
                for (int i3 = 0; i3 < this.am.length; i3++) {
                    ad.au(this.am[i3], this.ak[i3]);
                }
            }
            if (this.as != null) {
                while (i2 < this.as.length) {
                    ad.az(this.as[i2], this.ag[i2]);
                    i2++;
                }
            }
            bpVar = ad.af((this.ax * -975646751) + 64, (this.aw * -1916286517) + 850, -30, -50, -30);
            al.ar(bpVar, (long) (this.aj * 359517927));
        }
        bpVar = (-1 == this.ae * -1443510939 || i == -1) ? bpVar.ar(true) : gn.aq(this.ae * -1443510939, 1832552789).am(bpVar, i, (byte) 3);
        if (!(this.ap * 1313346775 == 128 && this.au * 1285910103 == 128)) {
            bpVar.aa(this.ap * 1313346775, this.au * 1285910103, this.ap * 1313346775);
        }
        if (this.az * 1245248493 == 0) {
            return bpVar;
        }
        if (90 == this.az * 1245248493) {
            bpVar.au();
        }
        if (this.az * 1245248493 == 180) {
            bpVar.au();
            bpVar.au();
        }
        if (270 != this.az * 1245248493) {
            return bpVar;
        }
        bpVar.au();
        bpVar.au();
        bpVar.au();
        return bpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, (byte) 25);
            } else {
                return;
            }
        }
    }

    public final bp aj(int i, byte b) {
        int i2 = 0;
        try {
            bp bpVar = (bp) al.ad((long) (this.aj * 359517927));
            if (bpVar == null) {
                bo ad = bo.ad(lf.aq, this.ai * 1293777631, 0);
                if (ad == null) {
                    return null;
                }
                if (this.am != null) {
                    for (int i3 = 0; i3 < this.am.length; i3++) {
                        ad.au(this.am[i3], this.ak[i3]);
                    }
                }
                if (this.as != null) {
                    while (i2 < this.as.length) {
                        ad.az(this.as[i2], this.ag[i2]);
                        i2++;
                    }
                }
                bpVar = ad.af((this.ax * -975646751) + 64, (this.aw * -1916286517) + 850, -30, -50, -30);
                al.ar(bpVar, (long) (this.aj * 359517927));
            }
            bpVar = (-1 == this.ae * -1443510939 || i == -1) ? bpVar.ar(true) : gn.aq(this.ae * -1443510939, 1402452958).am(bpVar, i, (byte) 7);
            if (!(this.ap * 1313346775 == 128 && this.au * 1285910103 == 128)) {
                bpVar.aa(this.ap * 1313346775, this.au * 1285910103, this.ap * 1313346775);
            }
            if (this.az * 1245248493 == 0) {
                return bpVar;
            }
            if (90 == this.az * 1245248493) {
                bpVar.au();
            }
            if (this.az * 1245248493 == 180) {
                bpVar.au();
                bpVar.au();
            }
            if (270 != this.az * 1245248493) {
                return bpVar;
            }
            bpVar.au();
            bpVar.au();
            bpVar.au();
            return bpVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dz.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(lj ljVar, int i, byte b) {
        int i2 = 0;
        int af;
        if (1 == i) {
            try {
                this.ai = ljVar.an(-1464407032) * 1437909279;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dz.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (i == 2) {
            this.ae = ljVar.an(-1464407032) * -1240865683;
        } else if (4 == i) {
            this.ap = ljVar.an(-1464407032) * 354164455;
        } else if (5 == i) {
            this.au = ljVar.an(-1464407032) * -1549968025;
        } else if (6 == i) {
            this.az = ljVar.an(-1464407032) * 730765797;
        } else if (i == 7) {
            this.ax = ljVar.af(1804771424) * 1162064929;
        } else if (i == 8) {
            this.aw = ljVar.af(1804771424) * 937038819;
        } else if (40 == i) {
            af = ljVar.af(1804771424);
            this.am = new short[af];
            this.ak = new short[af];
            while (i2 < af) {
                this.am[i2] = (short) ljVar.an(-1464407032);
                this.ak[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i == 41) {
            af = ljVar.af(1804771424);
            this.as = new short[af];
            this.ag = new short[af];
            while (i2 < af) {
                this.as[i2] = (short) ljVar.an(-1464407032);
                this.ag[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        }
    }

    public final bp ao(int i) {
        int i2 = 0;
        bp bpVar = (bp) al.ad((long) (this.aj * 1738132843));
        if (bpVar == null) {
            bo ad = bo.ad(lf.aq, this.ai * -1917396018, 0);
            if (ad == null) {
                return null;
            }
            if (this.am != null) {
                for (int i3 = 0; i3 < this.am.length; i3++) {
                    ad.au(this.am[i3], this.ak[i3]);
                }
            }
            if (this.as != null) {
                while (i2 < this.as.length) {
                    ad.az(this.as[i2], this.ag[i2]);
                    i2++;
                }
            }
            bpVar = ad.af((this.ax * -1242137314) - 780630989, (this.aw * -1916286517) + 850, -30, -2104099562, -371487106);
            al.ar(bpVar, (long) (this.aj * 359517927));
        }
        bpVar = (-1 == this.ae * -733760351 || i == -1) ? bpVar.ar(true) : gn.aq(this.ae * 1899038470, 1941860825).am(bpVar, i, (byte) -45);
        if (!(this.ap * 1313346775 == -648331714 && this.au * -162915679 == -1949282117)) {
            bpVar.aa(this.ap * -1163881439, this.au * 1285910103, this.ap * -296072129);
        }
        if (this.az * 895635704 == 0) {
            return bpVar;
        }
        if (90 == this.az * 1245248493) {
            bpVar.au();
        }
        if (this.az * 1872720462 == -105562877) {
            bpVar.au();
            bpVar.au();
        }
        if (-1458342792 != this.az * -33288561) {
            return bpVar;
        }
        bpVar.au();
        bpVar.au();
        bpVar.au();
        return bpVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, (byte) 25);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(lj ljVar, byte b) {
        while (true) {
            try {
                int af = ljVar.af(1804771424);
                if (af != 0) {
                    al(ljVar, af, (byte) 25);
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dz.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, (byte) 25);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, (byte) 25);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(lj ljVar, int i) {
        int i2 = 0;
        int af;
        if (1 == i) {
            this.ai = ljVar.an(-1464407032) * -1867600306;
        } else if (i == 2) {
            this.ae = ljVar.an(-1464407032) * -1240865683;
        } else if (4 == i) {
            this.ap = ljVar.an(-1464407032) * 560590217;
        } else if (5 == i) {
            this.au = ljVar.an(-1464407032) * -1159697030;
        } else if (6 == i) {
            this.az = ljVar.an(-1464407032) * 730765797;
        } else if (i == 7) {
            this.ax = ljVar.af(1804771424) * -1158446330;
        } else if (i == 8) {
            this.aw = ljVar.af(1804771424) * -445857850;
        } else if (1376109736 == i) {
            af = ljVar.af(1804771424);
            this.am = new short[af];
            this.ak = new short[af];
            while (i2 < af) {
                this.am[i2] = (short) ljVar.an(-1464407032);
                this.ak[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i == -600350395) {
            af = ljVar.af(1804771424);
            this.as = new short[af];
            this.ag = new short[af];
            while (i2 < af) {
                this.as[i2] = (short) ljVar.an(-1464407032);
                this.ag[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(lj ljVar, int i) {
        int i2 = 0;
        int af;
        if (1 == i) {
            this.ai = ljVar.an(-1464407032) * -695223040;
        } else if (i == 2) {
            this.ae = ljVar.an(-1464407032) * -1240865683;
        } else if (4 == i) {
            this.ap = ljVar.an(-1464407032) * 1495874993;
        } else if (5 == i) {
            this.au = ljVar.an(-1464407032) * -1913421405;
        } else if (6 == i) {
            this.az = ljVar.an(-1464407032) * 730765797;
        } else if (i == 7) {
            this.ax = ljVar.af(1804771424) * 1162064929;
        } else if (i == 8) {
            this.aw = ljVar.af(1804771424) * 937038819;
        } else if (1332761897 == i) {
            af = ljVar.af(1804771424);
            this.am = new short[af];
            this.ak = new short[af];
            while (i2 < af) {
                this.am[i2] = (short) ljVar.an(-1464407032);
                this.ak[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        } else if (i == 41) {
            af = ljVar.af(1804771424);
            this.as = new short[af];
            this.ag = new short[af];
            while (i2 < af) {
                this.as[i2] = (short) ljVar.an(-1464407032);
                this.ag[i2] = (short) ljVar.an(-1464407032);
                i2++;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az(lj ljVar) {
        while (true) {
            int af = ljVar.af(1804771424);
            if (af != 0) {
                al(ljVar, af, (byte) 25);
            } else {
                return;
            }
        }
    }
}
