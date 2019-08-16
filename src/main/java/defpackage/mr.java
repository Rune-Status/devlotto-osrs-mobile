package defpackage;

/* renamed from: mr */
public class mr implements Runnable {
    public static String ad = null;
    static final int ak = 4;
    static final int am = 2;
    public static String aq = null;
    public static final int au = 12;
    boolean ai;
    Thread aj;
    ll al;
    ll ar;

    public mr() {
        try {
            this.ar = null;
            this.al = null;
            this.ai = false;
            ad = "Unknown";
            aq = "1.6";
            try {
                ad = System.getProperty("java.vendor");
                aq = System.getProperty("java.version");
            } catch (Exception e) {
            }
            this.ai = false;
            this.aj = new Thread(this);
            this.aj.setPriority(10);
            this.aj.setDaemon(true);
            this.aj.start();
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mr.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public static void ad(int i) {
        try {
            op.ad = new fz();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mr.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Missing block: B:14:?, code skipped:
            r0 = r1.ai * -1491126973;
     */
    /* JADX WARNING: Missing block: B:15:0x0023, code skipped:
            if (r0 != 1) goto L_0x003c;
     */
    /* JADX WARNING: Missing block: B:16:0x0025, code skipped:
            r1.ak = new java.net.Socket(java.net.InetAddress.getByName((java.lang.String) r1.am), r1.ae);
     */
    /* JADX WARNING: Missing block: B:17:0x0036, code skipped:
            r1.aj = 1;
     */
    /* JADX WARNING: Missing block: B:19:0x003a, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x003b, code skipped:
            throw r0;
     */
    /* JADX WARNING: Missing block: B:21:0x003c, code skipped:
            if (r0 != 2) goto L_0x005a;
     */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            r2 = new java.lang.Thread((java.lang.Runnable) r1.am);
            r2.setDaemon(true);
            r2.start();
            r2.setPriority(r1.ae);
            r1.ak = r2;
     */
    /* JADX WARNING: Missing block: B:25:0x0057, code skipped:
            r1.aj = 2;
     */
    /* JADX WARNING: Missing block: B:27:0x005b, code skipped:
            if (4 != r0) goto L_0x0036;
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            r1.ak = new java.io.DataInputStream(((java.net.URL) r1.am).openStream());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ad() {
        while (true) {
            synchronized (this) {
                while (!this.ai) {
                    if (this.ar != null) {
                        ll llVar = this.ar;
                        this.ar = this.ar.ad;
                        if (this.ar == null) {
                            this.al = null;
                        }
                    } else {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    }
                }
                return;
            }
        }
        while (true) {
        }
    }

    public final void ae() {
        synchronized (this) {
            this.ai = true;
            notifyAll();
        }
        try {
            this.aj.join();
        } catch (InterruptedException e) {
        }
    }

    public final ll ag(String str, int i) {
        return al(1, i, 0, str, 2064127053);
    }

    public final ll ai(Runnable runnable, int i, int i2) {
        try {
            return al(2, i, 0, runnable, 2086916092);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mr.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final ll aj(String str, int i, byte b) {
        try {
            return al(1, i, 0, str, 2144670331);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mr.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final ll ak(int i, int i2, int i3, Object obj) {
        ll llVar = new ll();
        llVar.ai = -1097990293 * i;
        llVar.ae = i2;
        llVar.am = obj;
        synchronized (this) {
            if (this.al != null) {
                this.al.ad = llVar;
                this.al = llVar;
            } else {
                this.ar = llVar;
                this.al = llVar;
            }
            notify();
        }
        return llVar;
    }

    /* Access modifiers changed, original: final */
    public final ll al(int i, int i2, int i3, Object obj, int i4) {
        try {
            ll llVar = new ll();
            llVar.ai = -1097990293 * i;
            llVar.ae = i2;
            llVar.am = obj;
            synchronized (this) {
                if (this.al != null) {
                    this.al.ad = llVar;
                    this.al = llVar;
                } else {
                    this.ar = llVar;
                    this.al = llVar;
                }
                notify();
            }
            return llVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mr.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void am() {
        synchronized (this) {
            this.ai = true;
            notifyAll();
        }
        try {
            this.aj.join();
        } catch (InterruptedException e) {
        }
    }

    public final ll ap(String str, int i) {
        return al(1, i, 0, str, 2055994819);
    }

    /* JADX WARNING: Missing block: B:14:?, code skipped:
            r0 = r1.ai * -1491126973;
     */
    /* JADX WARNING: Missing block: B:15:0x0023, code skipped:
            if (r0 != 1) goto L_0x003c;
     */
    /* JADX WARNING: Missing block: B:16:0x0025, code skipped:
            r1.ak = new java.net.Socket(java.net.InetAddress.getByName((java.lang.String) r1.am), r1.ae);
     */
    /* JADX WARNING: Missing block: B:17:0x0036, code skipped:
            r1.aj = 1;
     */
    /* JADX WARNING: Missing block: B:19:0x003a, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x003b, code skipped:
            throw r0;
     */
    /* JADX WARNING: Missing block: B:21:0x003c, code skipped:
            if (r0 != 2) goto L_0x005a;
     */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            r2 = new java.lang.Thread((java.lang.Runnable) r1.am);
            r2.setDaemon(true);
            r2.start();
            r2.setPriority(r1.ae);
            r1.ak = r2;
     */
    /* JADX WARNING: Missing block: B:25:0x0057, code skipped:
            r1.aj = 2;
     */
    /* JADX WARNING: Missing block: B:27:0x005b, code skipped:
            if (4 != r0) goto L_0x0036;
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            r1.ak = new java.io.DataInputStream(((java.net.URL) r1.am).openStream());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void aq() {
        while (true) {
            synchronized (this) {
                while (!this.ai) {
                    if (this.ar != null) {
                        ll llVar = this.ar;
                        this.ar = this.ar.ad;
                        if (this.ar == null) {
                            this.al = null;
                        }
                    } else {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    }
                }
                return;
            }
        }
        while (true) {
        }
    }

    public final void ar(int i) {
        try {
            synchronized (this) {
                this.ai = true;
                notifyAll();
            }
            try {
                this.aj.join();
            } catch (InterruptedException e) {
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mr.ar(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final ll as(int i, int i2, int i3, Object obj) {
        ll llVar = new ll();
        llVar.ai = -1097990293 * i;
        llVar.ae = i2;
        llVar.am = obj;
        synchronized (this) {
            if (this.al != null) {
                this.al.ad = llVar;
                this.al = llVar;
            } else {
                this.ar = llVar;
                this.al = llVar;
            }
            notify();
        }
        return llVar;
    }

    public final ll au(String str, int i) {
        return al(1, i, 0, str, 2093872511);
    }

    public final ll aw(Runnable runnable, int i) {
        return al(2, i, 0, runnable, 2125838308);
    }

    public final ll ax(Runnable runnable, int i) {
        return al(2, i, 0, runnable, 2119608167);
    }

    public final ll az(Runnable runnable, int i) {
        return al(2, i, 0, runnable, 2089085491);
    }

    /* JADX WARNING: Missing block: B:15:?, code skipped:
            r0 = r1.ai * -1491126973;
     */
    /* JADX WARNING: Missing block: B:16:0x0023, code skipped:
            if (r0 != 1) goto L_0x0055;
     */
    /* JADX WARNING: Missing block: B:17:0x0025, code skipped:
            r1.ak = new java.net.Socket(java.net.InetAddress.getByName((java.lang.String) r1.am), r1.ae);
     */
    /* JADX WARNING: Missing block: B:18:0x0036, code skipped:
            r1.aj = 1;
     */
    /* JADX WARNING: Missing block: B:26:0x0055, code skipped:
            if (r0 != 2) goto L_0x0074;
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            r2 = new java.lang.Thread((java.lang.Runnable) r1.am);
            r2.setDaemon(true);
            r2.start();
            r2.setPriority(r1.ae);
            r1.ak = r2;
     */
    /* JADX WARNING: Missing block: B:35:0x0075, code skipped:
            if (4 != r0) goto L_0x0036;
     */
    /* JADX WARNING: Missing block: B:37:?, code skipped:
            r1.ak = new java.io.DataInputStream(((java.net.URL) r1.am).openStream());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        ll llVar;
        while (true) {
            try {
                synchronized (this) {
                    while (!this.ai) {
                        if (this.ar != null) {
                            llVar = this.ar;
                            this.ar = this.ar.ad;
                            if (this.ar == null) {
                                this.al = null;
                            }
                        } else {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    return;
                }
            } catch (ThreadDeath e2) {
                throw e2;
            } catch (RuntimeException e3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mr.run(");
                stringBuilder.append(')');
                throw mv.aq(e3, stringBuilder.toString());
            } catch (Throwable th) {
                llVar.aj = 2;
            }
        }
        while (true) {
        }
    }
}
