package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: mz */
public class mz implements Runnable {
    Thread ad;
    IOException ae;
    int ai = 0;
    int aj = 0;
    byte[] al;
    boolean am;
    OutputStream aq;
    int ar;

    mz(OutputStream outputStream, int i) {
        this.aq = outputStream;
        this.ar = i + 1;
        this.al = new byte[this.ar];
        this.ad = new Thread(this);
        this.ad.setDaemon(true);
        this.ad.start();
    }

    public void ad() {
        do {
            int al = al();
            if (al != -1) {
                try {
                    if (this.aj + al <= this.ar) {
                        this.aq.write(this.al, this.aj, al);
                    } else {
                        int i = this.ar - this.aj;
                        this.aq.write(this.al, this.aj, i);
                        this.aq.write(this.al, 0, al - i);
                    }
                    synchronized (this) {
                        this.aj = (al + this.aj) % this.ar;
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.ae = e;
                        return;
                    }
                }
            }
            return;
        } while (!ar());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ae() {
        if (!this.am) {
            return false;
        }
        try {
            this.aq.close();
            if (this.ae == null) {
                this.ae = new IOException("");
            }
        } catch (IOException e) {
            if (this.ae == null) {
                this.ae = new IOException(e);
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public int ag() {
        synchronized (this) {
            while (this.ae == null) {
                int i;
                if (this.aj <= this.ai) {
                    i = this.ai - this.aj;
                } else {
                    i = (this.ar - this.aj) + this.ai;
                }
                if (i > 0) {
                    return i;
                }
                try {
                    this.aq.flush();
                    if (ar()) {
                        return -1;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (IOException e2) {
                    this.ae = e2;
                    return -1;
                }
            }
            return -1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai() {
        synchronized (this) {
            this.am = true;
            notifyAll();
        }
        try {
            this.ad.join();
        } catch (InterruptedException e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.ae == null) {
                if ((this.aj <= this.ai ? ((this.ar - this.ai) + this.aj) - 1 : (this.aj - this.ai) - 1) >= i2) {
                    if (this.ai + i2 <= this.ar) {
                        System.arraycopy(bArr, i, this.al, this.ai, i2);
                    } else {
                        int i3 = this.ar - this.ai;
                        System.arraycopy(bArr, i, this.al, this.ai, i3);
                        System.arraycopy(bArr, i + i3, this.al, 0, i2 - i3);
                    }
                    this.ai = (this.ai + i2) % this.ar;
                    notifyAll();
                } else {
                    throw new IOException("");
                }
            }
            throw new IOException(this.ae.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ak() {
        if (!this.am) {
            return false;
        }
        try {
            this.aq.close();
            if (this.ae == null) {
                this.ae = new IOException("");
            }
        } catch (IOException e) {
            if (this.ae == null) {
                this.ae = new IOException(e);
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public int al() {
        synchronized (this) {
            while (this.ae == null) {
                int i;
                if (this.aj <= this.ai) {
                    i = this.ai - this.aj;
                } else {
                    i = (this.ar - this.aj) + this.ai;
                }
                if (i > 0) {
                    return i;
                }
                try {
                    this.aq.flush();
                    if (ar()) {
                        return -1;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (IOException e2) {
                    this.ae = e2;
                    return -1;
                }
            }
            return -1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean am() {
        if (!this.am) {
            return false;
        }
        try {
            this.aq.close();
            if (this.ae == null) {
                this.ae = new IOException("");
            }
        } catch (IOException e) {
            if (this.ae == null) {
                this.ae = new IOException(e);
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public int ap() {
        synchronized (this) {
            while (this.ae == null) {
                int i;
                if (this.aj <= this.ai) {
                    i = this.ai - this.aj;
                } else {
                    i = (this.ar - this.aj) + this.ai;
                }
                if (i > 0) {
                    return i;
                }
                try {
                    this.aq.flush();
                    if (ar()) {
                        return -1;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (IOException e2) {
                    this.ae = e2;
                    return -1;
                }
            }
            return -1;
        }
    }

    public void aq() {
        do {
            int al = al();
            if (al != -1) {
                try {
                    if (this.aj + al <= this.ar) {
                        this.aq.write(this.al, this.aj, al);
                    } else {
                        int i = this.ar - this.aj;
                        this.aq.write(this.al, this.aj, i);
                        this.aq.write(this.al, 0, al - i);
                    }
                    synchronized (this) {
                        this.aj = (al + this.aj) % this.ar;
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.ae = e;
                        return;
                    }
                }
            }
            return;
        } while (!ar());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ar() {
        if (!this.am) {
            return false;
        }
        try {
            this.aq.close();
            if (this.ae == null) {
                this.ae = new IOException("");
            }
        } catch (IOException e) {
            if (this.ae == null) {
                this.ae = new IOException(e);
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public int as() {
        synchronized (this) {
            while (this.ae == null) {
                int i;
                if (this.aj <= this.ai) {
                    i = this.ai - this.aj;
                } else {
                    i = (this.ar - this.aj) + this.ai;
                }
                if (i > 0) {
                    return i;
                }
                try {
                    this.aq.flush();
                    if (ar()) {
                        return -1;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (IOException e2) {
                    this.ae = e2;
                    return -1;
                }
            }
            return -1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.ae == null) {
                if ((this.aj <= this.ai ? ((this.ar - this.ai) + this.aj) - 1 : (this.aj - this.ai) - 1) >= i2) {
                    if (this.ai + i2 <= this.ar) {
                        System.arraycopy(bArr, i, this.al, this.ai, i2);
                    } else {
                        int i3 = this.ar - this.ai;
                        System.arraycopy(bArr, i, this.al, this.ai, i3);
                        System.arraycopy(bArr, i + i3, this.al, 0, i2 - i3);
                    }
                    this.ai = (this.ai + i2) % this.ar;
                    notifyAll();
                } else {
                    throw new IOException("");
                }
            }
            throw new IOException(this.ae.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az() {
        synchronized (this) {
            this.am = true;
            notifyAll();
        }
        try {
            this.ad.join();
        } catch (InterruptedException e) {
        }
    }

    public void run() {
        do {
            int al = al();
            if (al != -1) {
                try {
                    if (this.aj + al <= this.ar) {
                        this.aq.write(this.al, this.aj, al);
                    } else {
                        int i = this.ar - this.aj;
                        this.aq.write(this.al, this.aj, i);
                        this.aq.write(this.al, 0, al - i);
                    }
                    synchronized (this) {
                        this.aj = (al + this.aj) % this.ar;
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.ae = e;
                        return;
                    }
                }
            }
            return;
        } while (!ar());
    }
}
