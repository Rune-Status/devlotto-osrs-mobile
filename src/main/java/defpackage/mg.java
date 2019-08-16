package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: mg */
public class mg implements Runnable {
    Thread ad;
    IOException ae;
    int ai = 0;
    int aj = 0;
    byte[] al;
    InputStream aq;
    int ar;

    mg(InputStream inputStream, int i) {
        this.aq = inputStream;
        this.ar = i + 1;
        this.al = new byte[this.ar];
        this.ad = new Thread(this);
        this.ad.setDaemon(true);
        this.ad.start();
    }

    /* Access modifiers changed, original: 0000 */
    public int aa() throws IOException {
        synchronized (this) {
            if (this.aj != this.ai) {
                byte b = this.al[this.aj];
                this.aj = (this.aj + 1) % this.ar;
                notifyAll();
                return b & 255;
            } else if (this.ae == null) {
                return -1;
            } else {
                throw new IOException(this.ae.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ac() throws IOException {
        synchronized (this) {
            if (this.aj != this.ai) {
                byte b = this.al[this.aj];
                this.aj = (this.aj + 1) % this.ar;
                notifyAll();
                return b & 255;
            } else if (this.ae == null) {
                return -1;
            } else {
                throw new IOException(this.ae.toString());
            }
        }
    }

    public void ad() {
        while (true) {
            int ar = ar();
            if (ar != -1) {
                try {
                    ar = this.aq.read(this.al, this.ai, ar);
                    if (ar != -1) {
                        synchronized (this) {
                            this.ai = (ar + this.ai) % this.ar;
                        }
                    } else {
                        throw new EOFException();
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.ae = e;
                        return;
                    }
                }
            }
            return;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ae(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            int i3 = this.aj <= this.ai ? this.ai - this.aj : (this.ar - this.aj) + this.ai;
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 != 0 || this.ae == null) {
                if (this.aj + i2 <= this.ar) {
                    System.arraycopy(this.al, this.aj, bArr, i, i2);
                } else {
                    i3 = this.ar - this.aj;
                    System.arraycopy(this.al, this.aj, bArr, i, i3);
                    System.arraycopy(this.al, 0, bArr, i + i3, i2 - i3);
                }
                this.aj = (this.aj + i2) % this.ar;
                notifyAll();
            } else {
                throw new IOException(this.ae.toString());
            }
        }
        return i2;
    }

    /* Access modifiers changed, original: 0000 */
    public void af() {
        synchronized (this) {
            if (this.ae == null) {
                this.ae = new IOException("");
            }
            notifyAll();
        }
        try {
            this.ad.join();
        } catch (InterruptedException e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ag(int i) throws IOException {
        if (i == 0) {
            return true;
        }
        if (i <= 0 || i >= this.ar) {
            throw new IOException();
        }
        synchronized (this) {
            if ((this.aj <= this.ai ? this.ai - this.aj : (this.ar - this.aj) + this.ai) >= i) {
                return true;
            } else if (this.ae == null) {
                notifyAll();
                return false;
            } else {
                throw new IOException(this.ae.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ah() throws IOException {
        synchronized (this) {
            if (this.aj != this.ai) {
                byte b = this.al[this.aj];
                this.aj = (this.aj + 1) % this.ar;
                notifyAll();
                return b & 255;
            } else if (this.ae == null) {
                return -1;
            } else {
                throw new IOException(this.ae.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ai() throws IOException {
        synchronized (this) {
            if (this.aj != this.ai) {
                byte b = this.al[this.aj];
                this.aj = (this.aj + 1) % this.ar;
                notifyAll();
                return b & 255;
            } else if (this.ae == null) {
                return -1;
            } else {
                throw new IOException(this.ae.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int aj() throws IOException {
        int i;
        synchronized (this) {
            i = this.aj <= this.ai ? this.ai - this.aj : (this.ar - this.aj) + this.ai;
            if (i > 0 || this.ae == null) {
                notifyAll();
            } else {
                throw new IOException(this.ae.toString());
            }
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public int ak() {
        synchronized (this) {
            while (this.ae == null) {
                r0 = this.aj == 0 ? (this.ar - this.ai) - 1 : this.aj <= this.ai ? this.ar - this.ai : (this.aj - this.ai) - 1;
                if (r0 > 0) {
                    return r0;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            return -1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean al(int i) throws IOException {
        if (i == 0) {
            return true;
        }
        if (i <= 0 || i >= this.ar) {
            throw new IOException();
        }
        synchronized (this) {
            if ((this.aj <= this.ai ? this.ai - this.aj : (this.ar - this.aj) + this.ai) >= i) {
                return true;
            } else if (this.ae == null) {
                notifyAll();
                return false;
            } else {
                throw new IOException(this.ae.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void am() {
        synchronized (this) {
            if (this.ae == null) {
                this.ae = new IOException("");
            }
            notifyAll();
        }
        try {
            this.ad.join();
        } catch (InterruptedException e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ao() throws IOException {
        synchronized (this) {
            if (this.aj != this.ai) {
                byte b = this.al[this.aj];
                this.aj = (this.aj + 1) % this.ar;
                notifyAll();
                return b & 255;
            } else if (this.ae == null) {
                return -1;
            } else {
                throw new IOException(this.ae.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ap(int i) throws IOException {
        if (i == 0) {
            return true;
        }
        if (i <= 0 || i >= this.ar) {
            throw new IOException();
        }
        synchronized (this) {
            if ((this.aj <= this.ai ? this.ai - this.aj : (this.ar - this.aj) + this.ai) >= i) {
                return true;
            } else if (this.ae == null) {
                notifyAll();
                return false;
            } else {
                throw new IOException(this.ae.toString());
            }
        }
    }

    public void aq() {
        while (true) {
            int ar = ar();
            if (ar != -1) {
                try {
                    ar = this.aq.read(this.al, this.ai, ar);
                    if (ar != -1) {
                        synchronized (this) {
                            this.ai = (ar + this.ai) % this.ar;
                        }
                    } else {
                        throw new EOFException();
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.ae = e;
                        return;
                    }
                }
            }
            return;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ar() {
        synchronized (this) {
            while (this.ae == null) {
                r0 = this.aj == 0 ? (this.ar - this.ai) - 1 : this.aj <= this.ai ? this.ar - this.ai : (this.aj - this.ai) - 1;
                if (r0 > 0) {
                    return r0;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            return -1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int as() {
        synchronized (this) {
            while (this.ae == null) {
                r0 = this.aj == 0 ? (this.ar - this.ai) - 1 : this.aj <= this.ai ? this.ar - this.ai : (this.aj - this.ai) - 1;
                if (r0 > 0) {
                    return r0;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            return -1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean au(int i) throws IOException {
        if (i == 0) {
            return true;
        }
        if (i <= 0 || i >= this.ar) {
            throw new IOException();
        }
        synchronized (this) {
            if ((this.aj <= this.ai ? this.ai - this.aj : (this.ar - this.aj) + this.ai) >= i) {
                return true;
            } else if (this.ae == null) {
                notifyAll();
                return false;
            } else {
                throw new IOException(this.ae.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int aw() throws IOException {
        int i;
        synchronized (this) {
            i = this.aj <= this.ai ? this.ai - this.aj : (this.ar - this.aj) + this.ai;
            if (i > 0 || this.ae == null) {
                notifyAll();
            } else {
                throw new IOException(this.ae.toString());
            }
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public int ax() throws IOException {
        int i;
        synchronized (this) {
            i = this.aj <= this.ai ? this.ai - this.aj : (this.ar - this.aj) + this.ai;
            if (i > 0 || this.ae == null) {
                notifyAll();
            } else {
                throw new IOException(this.ae.toString());
            }
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public void ay() {
        synchronized (this) {
            if (this.ae == null) {
                this.ae = new IOException("");
            }
            notifyAll();
        }
        try {
            this.ad.join();
        } catch (InterruptedException e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int az() throws IOException {
        int i;
        synchronized (this) {
            i = this.aj <= this.ai ? this.ai - this.aj : (this.ar - this.aj) + this.ai;
            if (i > 0 || this.ae == null) {
                notifyAll();
            } else {
                throw new IOException(this.ae.toString());
            }
        }
        return i;
    }

    public void run() {
        while (true) {
            int ar = ar();
            if (ar != -1) {
                try {
                    ar = this.aq.read(this.al, this.ai, ar);
                    if (ar != -1) {
                        synchronized (this) {
                            this.ai = (ar + this.ai) % this.ar;
                        }
                    } else {
                        throw new EOFException();
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.ae = e;
                        return;
                    }
                }
            }
            return;
        }
    }
}
