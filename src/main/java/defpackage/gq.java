package defpackage;

import android.support.v4.internal.view.SupportMenu;

/* renamed from: gq */
public class gq {
    static final int ak = 15;
    static ef az = null;
    static final long bq = 4294967295L;
    static final int bv = 12;
    kh ad;
    ok al;
    kh aq;
    ok ar;

    public gq(kh khVar, kh khVar2) {
        try {
            this.ar = new ok(256);
            this.al = new ok(256);
            this.ad = khVar;
            this.aq = khVar2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gq.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static final long ad(byte b) {
        long currentTimeMillis;
        long j;
        synchronized (gq.class) {
            try {
                currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis < oh.ad * -1077274180735361621L) {
                    oh.aq += ((oh.ad * -1077274180735361621L) - currentTimeMillis) * -6346956408846436955L;
                }
                oh.ad = -8313460680364362493L * currentTimeMillis;
                j = oh.aq;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("gq.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            } catch (Throwable th) {
                Class cls = gq.class;
            }
        }
        return currentTimeMillis + (j * 1743295465322850861L);
    }

    static boolean af(int i, byte b) {
        try {
            if (hm.dn) {
                return false;
            }
            if (((client.al * -925529453) & nf.ai) != 0) {
                hm.cl = "";
                hm.cz = go.jf;
                hm.cd = go.jq;
                hm.cf = go.jk;
                hm.cu = -1949278637;
                hm.dq = i * -2016270425;
                return true;
            } else if (((client.al * -925529453) & 4) != 0) {
                if (((client.al * -925529453) & 1024) != 0) {
                    hm.cz = go.jp;
                    hm.cd = go.jg;
                    hm.cf = go.jo;
                } else {
                    hm.cz = go.iz;
                    hm.cd = go.ia;
                    hm.cf = go.jv;
                }
                hm.cl = go.iu;
                hm.cu = -1949278637;
                hm.dq = i * -2016270425;
                return true;
            } else if (((client.al * -925529453) & 1024) == 0) {
                return false;
            } else {
                hm.cz = go.ja;
                hm.cd = go.jw;
                hm.cf = go.jl;
                hm.cl = go.iu;
                hm.cu = -1949278637;
                hm.dq = i * -2016270425;
                return true;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gq.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ar(lj ljVar, int i) {
        try {
            return ce.al(ljVar, 32767, (short) -18954);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gq.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ee[] au(kh khVar, int i, int i2) {
        try {
            return !da.af(khVar, i, (byte) -111) ? null : ai.ac(2130903499);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gq.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ht ad(int i, int i2, int[] iArr, int i3) {
        long j = (long) (((((i << 4) & SupportMenu.USER_MASK) | (i >>> 12)) ^ i2) | (i << 16));
        try {
            ht htVar = (ht) this.al.ad(j);
            if (htVar != null) {
                return htVar;
            }
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            hp ad = hp.ad(this.ad, i, i2);
            if (ad == null) {
                return null;
            }
            htVar = ad.aq();
            this.al.aq(htVar, j);
            if (iArr == null) {
                return htVar;
            }
            iArr[0] = iArr[0] - htVar.ar.length;
            return htVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gq.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ht ae(int i, int i2, int[] iArr) {
        long j = 4294967296L ^ ((long) (((((i << 4) & SupportMenu.USER_MASK) | (i >>> 12)) ^ i2) | (i << 16)));
        ht htVar = (ht) this.al.ad(j);
        if (htVar != null) {
            return htVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        gy gyVar = (gy) this.ar.ad(j);
        if (gyVar == null) {
            gyVar = gy.ak(this.aq, i, i2);
            if (gyVar == null) {
                return null;
            }
            this.ar.aq(gyVar, j);
        }
        ht as = gyVar.as(iArr);
        if (as == null) {
            return null;
        }
        gyVar.ky();
        this.al.aq(as, j);
        return as;
    }

    public ht ag(int i, int[] iArr) {
        if (this.ad.aw(400345888) == 1) {
            return ad(0, i, iArr, 677623026);
        }
        if (this.ad.ax(i, (byte) 21) == 1) {
            return ad(i, 0, iArr, -615539457);
        }
        throw new RuntimeException();
    }

    /* Access modifiers changed, original: 0000 */
    public ht ai(int i, int i2, int[] iArr) {
        long j = (long) (((((i << 4) & 1876793456) | (i >>> 12)) ^ i2) | (i << 16));
        ht htVar = (ht) this.al.ad(j);
        if (htVar != null) {
            return htVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        hp ad = hp.ad(this.ad, i, i2);
        if (ad == null) {
            return null;
        }
        htVar = ad.aq();
        this.al.aq(htVar, j);
        if (iArr == null) {
            return htVar;
        }
        iArr[0] = iArr[0] - htVar.ar.length;
        return htVar;
    }

    /* Access modifiers changed, original: 0000 */
    public ht aj(int i, int i2, int[] iArr) {
        long j = (long) (((((i << 4) & SupportMenu.USER_MASK) | (i >>> 12)) ^ i2) | (i << 16));
        ht htVar = (ht) this.al.ad(j);
        if (htVar != null) {
            return htVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        hp ad = hp.ad(this.ad, i, i2);
        if (ad == null) {
            return null;
        }
        htVar = ad.aq();
        this.al.aq(htVar, j);
        if (iArr == null) {
            return htVar;
        }
        iArr[0] = iArr[0] - htVar.ar.length;
        return htVar;
    }

    public ht ak(int i, int[] iArr) {
        if (this.ad.aw(449918938) == 1) {
            return ad(0, i, iArr, -359011636);
        }
        if (this.ad.ax(i, (byte) 34) == 1) {
            return ad(i, 0, iArr, 452330065);
        }
        throw new RuntimeException();
    }

    public ht al(int i, int[] iArr, byte b) {
        try {
            if (this.aq.aw(-555317810) == 1) {
                return aq(0, i, iArr, -191579706);
            }
            if (this.aq.ax(i, (byte) 31) == 1) {
                return aq(i, 0, iArr, 1198969353);
            }
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gq.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ht am(int i, int i2, int[] iArr) {
        long j = 4294967296L ^ ((long) (((((i << 4) & -1070512194) | (i >>> 12)) ^ i2) | (i << 16)));
        ht htVar = (ht) this.al.ad(j);
        if (htVar != null) {
            return htVar;
        }
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        gy gyVar = (gy) this.ar.ad(j);
        if (gyVar == null) {
            gyVar = gy.ak(this.aq, i, i2);
            if (gyVar == null) {
                return null;
            }
            this.ar.aq(gyVar, j);
        }
        ht as = gyVar.as(iArr);
        if (as == null) {
            return null;
        }
        gyVar.ky();
        this.al.aq(as, j);
        return as;
    }

    public ht ap(int i, int[] iArr) {
        if (this.aq.aw(588356542) == 1) {
            return aq(0, i, iArr, 1939902667);
        }
        if (this.aq.ax(i, (byte) 77) == 1) {
            return aq(i, 0, iArr, -1946236801);
        }
        throw new RuntimeException();
    }

    /* Access modifiers changed, original: 0000 */
    public ht aq(int i, int i2, int[] iArr, int i3) {
        long j = 4294967296L ^ ((long) (((((i << 4) & SupportMenu.USER_MASK) | (i >>> 12)) ^ i2) | (i << 16)));
        try {
            ht htVar = (ht) this.al.ad(j);
            if (htVar != null) {
                return htVar;
            }
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            gy gyVar = (gy) this.ar.ad(j);
            if (gyVar == null) {
                gyVar = gy.ak(this.aq, i, i2);
                if (gyVar == null) {
                    return null;
                }
                this.ar.aq(gyVar, j);
            }
            gy gyVar2 = gyVar;
            htVar = gyVar2.as(iArr);
            if (htVar == null) {
                return null;
            }
            gyVar2.ky();
            this.al.aq(htVar, j);
            return htVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gq.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ht ar(int i, int[] iArr, int i2) {
        try {
            if (this.ad.aw(-465117978) == 1) {
                return ad(0, i, iArr, -664434297);
            }
            if (this.ad.ax(i, (byte) 75) == 1) {
                return ad(i, 0, iArr, -816073747);
            }
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gq.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ht as(int i, int[] iArr) {
        if (this.ad.aw(-2024711332) == 1) {
            return ad(0, i, iArr, 307402782);
        }
        if (this.ad.ax(i, (byte) 112) == 1) {
            return ad(i, 0, iArr, -544375720);
        }
        throw new RuntimeException();
    }

    public ht au(int i, int[] iArr) {
        if (this.aq.aw(-68659682) == 1) {
            return aq(0, i, iArr, -1227425204);
        }
        if (this.aq.ax(i, (byte) 3) == 1) {
            return aq(i, 0, iArr, 1332023212);
        }
        throw new RuntimeException();
    }
}
