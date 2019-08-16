package defpackage;

/* renamed from: kg */
public class kg implements Runnable {
    static final kg ad = new kg();
    public static final int cn = 80;
    static int mn;
    Thread aj;
    int al;
    final fy aq;
    final fy ar;

    kg() {
        try {
            this.aq = new fy();
            this.ar = new fy();
            this.al = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kg.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void aa(int i, byte[] bArr, mh mhVar) {
        kz kzVar = new kz();
        kzVar.ad = 0;
        kzVar.gs = (long) i;
        kzVar.aq = bArr;
        kzVar.ar = mhVar;
        ad.az(kzVar, 1386197870);
        ad.aj(756627983);
    }

    static final int ad(my myVar, int i) {
        if (myVar == null) {
            return 12;
        }
        try {
            return myVar.as * 11875179 == 3 ? 20 : 12;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kg.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void af(int i, mh mhVar, kv kvVar) {
        kz kzVar = new kz();
        kzVar.ad = 1675084609;
        kzVar.gs = (long) i;
        kzVar.ar = mhVar;
        kzVar.al = kvVar;
        ad.az(kzVar, 2061053333);
        ad.aj(19733020);
    }

    static void ah(int i, byte[] bArr, mh mhVar) {
        kz kzVar = new kz();
        kzVar.ad = 0;
        kzVar.gs = (long) i;
        kzVar.aq = bArr;
        kzVar.ar = mhVar;
        ad.az(kzVar, 171054072);
        ad.aj(-1428313961);
    }

    static void an(int i, mh mhVar, kv kvVar) {
        kz kzVar = new kz();
        kzVar.ad = 1854193609;
        kzVar.gs = (long) i;
        kzVar.ar = mhVar;
        kzVar.al = kvVar;
        ad.az(kzVar, 1683762588);
        ad.aj(211717788);
    }

    static void ao(int i, byte[] bArr, mh mhVar) {
        kz kzVar = new kz();
        kzVar.ad = 0;
        kzVar.gs = (long) i;
        kzVar.aq = bArr;
        kzVar.ar = mhVar;
        ad.az(kzVar, 990008492);
        ad.aj(-1667721766);
    }

    static void at(int i, mh mhVar, kv kvVar) {
        byte[] ae = ad.ae(i, mhVar, 1241533864);
        if (ae != null) {
            kvVar.ei(mhVar, i, ae, true, -1558165135);
            return;
        }
        kvVar.ei(mhVar, i, mhVar.ad(i, (byte) 36), true, -1558165135);
    }

    static void ay(int i, mh mhVar, kv kvVar) {
        kz kzVar = new kz();
        kzVar.ad = 1675084609;
        kzVar.gs = (long) i;
        kzVar.ar = mhVar;
        kzVar.al = kvVar;
        ad.az(kzVar, 1699810419);
        ad.aj(652597681);
    }

    public static void bm() {
        while (true) {
            kz ak = ad.ak(-1142665370);
            if (ak != null) {
                ak.al.ei(ak.ar, (int) ak.gs, ak.aq, false, -1558165135);
            } else {
                return;
            }
        }
    }

    public static void bp() {
        ad.ac(2039816659);
    }

    public static void bq() {
        while (true) {
            kz ak = ad.ak(-1171064977);
            if (ak != null) {
                ak.al.ei(ak.ar, (int) ak.gs, ak.aq, false, -1558165135);
            } else {
                return;
            }
        }
    }

    public static void bs() {
        while (true) {
            kz ak = ad.ak(-2113168067);
            if (ak != null) {
                ak.al.ei(ak.ar, (int) ak.gs, ak.aq, false, -1558165135);
            } else {
                return;
            }
        }
    }

    public static void cv() {
        ad.ac(2039816659);
    }

    /* Access modifiers changed, original: 0000 */
    public void ab() {
        synchronized (this) {
            if (this.al * -711297259 == 0) {
                this.aj = new Thread(ad);
                this.aj.setDaemon(true);
                this.aj.start();
                this.aj.setPriority(5);
            }
            this.al = -959213832;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(int i) {
        synchronized (this) {
            try {
                if (this.al * -711297259 != 0) {
                    this.al = 1372790845;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
            } catch (RuntimeException e2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kg.ac(");
                stringBuilder.append(')');
                throw mv.aq(e2, stringBuilder.toString());
            }
        }
    }

    public void ad() {
        while (true) {
            try {
                kz as = as((byte) -80);
                if (as == null) {
                    kh.ad(100);
                    if (!ag(570088956)) {
                        au(356760463);
                    } else {
                        return;
                    }
                }
                if (as.ad * 1094634689 == 0) {
                    as.ar.aq((int) as.gs, as.aq, as.aq.length, 157809585);
                } else if (1 == as.ad * 1094634689) {
                    as.aq = as.ar.ad((int) as.gs, (byte) 72);
                    ax(as, (short) -24574);
                }
                if (!ag(570088956)) {
                    ap(-2063915888);
                } else {
                    return;
                }
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] ae(int i, mh mhVar, int i2) {
        synchronized (this) {
            try {
                mb ae = this.aq.ae();
                while (true) {
                    kz kzVar = (kz) ae;
                    if (kzVar == null) {
                        return null;
                    } else if (((long) i) == kzVar.gs && mhVar == kzVar.ar && kzVar.ad * 1094634689 == 0) {
                        byte[] bArr = kzVar.aq;
                        return bArr;
                    } else {
                        ae = this.aq.ak();
                    }
                }
            } catch (Exception e) {
                try {
                    iv.ad(null, e, 1692244937);
                    return null;
                } catch (RuntimeException e2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("kg.ae(");
                    stringBuilder.append(')');
                    throw mv.aq(e2, stringBuilder.toString());
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ag(int i) {
        synchronized (this) {
            try {
                if (this.al * -711297259 <= 1) {
                    this.al = 0;
                    notifyAll();
                    return true;
                }
                return false;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kg.ag(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i) {
        synchronized (this) {
            try {
                if (this.al * -711297259 == 0) {
                    this.aj = new Thread(ad);
                    this.aj.setDaemon(true);
                    this.aj.start();
                    this.aj.setPriority(5);
                }
                this.al = -959213832;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kg.aj(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public kz ak(int i) {
        kz kzVar;
        synchronized (this) {
            try {
                kzVar = (kz) this.ar.aj();
            } catch (Exception e) {
                try {
                    iv.ad(null, e, 1692244937);
                    return null;
                } catch (RuntimeException e2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("kg.ak(");
                    stringBuilder.append(')');
                    throw mv.aq(e2, stringBuilder.toString());
                }
            }
        }
        return kzVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(int i) {
        synchronized (this) {
            try {
                this.al = -959213832;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kg.ap(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void aq() {
        while (true) {
            try {
                kz as = as((byte) -16);
                if (as == null) {
                    kh.ad(100);
                    if (!ag(570088956)) {
                        au(83881959);
                    } else {
                        return;
                    }
                }
                if (as.ad * 1094634689 == 0) {
                    as.ar.aq((int) as.gs, as.aq, as.aq.length, 157809585);
                } else if (1 == as.ad * 1094634689) {
                    as.aq = as.ar.ad((int) as.gs, (byte) 40);
                    ax(as, (short) -32186);
                }
                if (!ag(570088956)) {
                    ap(-949902817);
                } else {
                    return;
                }
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public kz as(byte b) {
        synchronized (this) {
            kz kzVar;
            try {
                kzVar = (kz) this.aq.ae();
            } catch (Exception e) {
                try {
                    iv.ad(null, e, 1692244937);
                    kzVar = null;
                } catch (RuntimeException e2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("kg.as(");
                    stringBuilder.append(')');
                    throw mv.aq(e2, stringBuilder.toString());
                }
            }
            if (kzVar == null) {
                return null;
            }
            kzVar.ky();
            return kzVar;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(int i) {
        synchronized (this) {
            try {
                this.al -= 1372790845;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kg.au(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void av() {
        synchronized (this) {
            if (this.al * -711297259 == 0) {
                this.aj = new Thread(ad);
                this.aj.setDaemon(true);
                this.aj.start();
                this.aj.setPriority(5);
            }
            this.al = -984607649;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(kz kzVar, short s) {
        synchronized (this) {
            try {
                this.ar.aq(kzVar);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kg.ax(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az(kz kzVar, int i) {
        synchronized (this) {
            try {
                this.aq.aq(kzVar);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("kg.az(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] ba(int i, mh mhVar) {
        synchronized (this) {
            try {
                mb ae = this.aq.ae();
                while (true) {
                    kz kzVar = (kz) ae;
                    if (kzVar == null) {
                        return null;
                    } else if (((long) i) == kzVar.gs && mhVar == kzVar.ar && kzVar.ad * 169319014 == 0) {
                        byte[] bArr = kzVar.aq;
                        return bArr;
                    } else {
                        ae = this.aq.ak();
                    }
                }
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                return null;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public kz bb() {
        synchronized (this) {
            kz kzVar;
            try {
                kzVar = (kz) this.aq.ae();
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                kzVar = null;
            }
            if (kzVar == null) {
                return null;
            }
            kzVar.ky();
            return kzVar;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bc() {
        synchronized (this) {
            if (this.al * -711297259 <= 1) {
                this.al = 0;
                notifyAll();
                return true;
            }
            return false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public kz bd() {
        kz kzVar;
        synchronized (this) {
            try {
                kzVar = (kz) this.ar.aj();
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                return null;
            }
        }
        return kzVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void be() {
        synchronized (this) {
            this.al -= 1372790845;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public kz bf() {
        synchronized (this) {
            kz kzVar;
            try {
                kzVar = (kz) this.aq.ae();
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                kzVar = null;
            }
            if (kzVar == null) {
                return null;
            }
            kzVar.ky();
            return kzVar;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bg() {
        synchronized (this) {
            if (this.al * -711297259 <= 1) {
                this.al = 0;
                notifyAll();
                return true;
            }
            return false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bh(kz kzVar) {
        synchronized (this) {
            this.aq.aq(kzVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bi() {
        synchronized (this) {
            if (this.al * -711297259 <= 1) {
                this.al = 0;
                notifyAll();
                return true;
            }
            return false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bj(kz kzVar) {
        synchronized (this) {
            this.aq.aq(kzVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] bk(int i, mh mhVar) {
        synchronized (this) {
            try {
                mb ae = this.aq.ae();
                while (true) {
                    kz kzVar = (kz) ae;
                    if (kzVar == null) {
                        return null;
                    } else if (((long) i) == kzVar.gs && mhVar == kzVar.ar && kzVar.ad * 1094634689 == 0) {
                        byte[] bArr = kzVar.aq;
                        return bArr;
                    } else {
                        ae = this.aq.ak();
                    }
                }
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                return null;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public kz bl() {
        synchronized (this) {
            kz kzVar;
            try {
                kzVar = (kz) this.aq.ae();
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                kzVar = null;
            }
            if (kzVar == null) {
                return null;
            }
            kzVar.ky();
            return kzVar;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bn(kz kzVar) {
        synchronized (this) {
            this.aq.aq(kzVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public kz bo() {
        kz kzVar;
        synchronized (this) {
            try {
                kzVar = (kz) this.ar.aj();
            } catch (Exception e) {
                iv.ad(null, e, 1692244937);
                return null;
            }
        }
        return kzVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void br() {
        synchronized (this) {
            this.al -= 1372790845;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bt(kz kzVar) {
        synchronized (this) {
            this.aq.aq(kzVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bu() {
        synchronized (this) {
            this.al = -959213832;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bv() {
        synchronized (this) {
            if (this.al * -711297259 <= 1) {
                this.al = 0;
                notifyAll();
                return true;
            }
            return false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bw() {
        synchronized (this) {
            this.al -= 5613340;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bx() {
        synchronized (this) {
            this.al = 2105878153;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void by(kz kzVar) {
        synchronized (this) {
            this.ar.aq(kzVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bz(kz kzVar) {
        synchronized (this) {
            this.ar.aq(kzVar);
        }
    }

    public void run() {
        while (true) {
            try {
                kz as = as((byte) -2);
                if (as == null) {
                    kh.ad(100);
                    if (!ag(570088956)) {
                        au(2871535);
                    } else {
                        return;
                    }
                }
                if (as.ad * 1094634689 == 0) {
                    as.ar.aq((int) as.gs, as.aq, as.aq.length, 157809585);
                } else if (1 == as.ad * 1094634689) {
                    as.aq = as.ar.ad((int) as.gs, (byte) 58);
                    ax(as, (short) -19428);
                }
                if (!ag(570088956)) {
                    ap(1478960811);
                } else {
                    return;
                }
            } catch (Exception e) {
                try {
                    iv.ad(null, e, 1692244937);
                    return;
                } catch (RuntimeException e2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("kg.run(");
                    stringBuilder.append(')');
                    throw mv.aq(e2, stringBuilder.toString());
                }
            }
        }
    }
}
