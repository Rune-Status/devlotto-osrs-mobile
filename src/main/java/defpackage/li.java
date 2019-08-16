package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collection;

/* renamed from: li */
public final class li extends mk implements Runnable {
    static final int aa = 2340;
    static final int au = 100;
    static ec or;
    InputStream ad;
    byte[] ae;
    final int ag;
    ll ai;
    mr aj;
    int ak;
    boolean al;
    int am;
    final int ap;
    OutputStream aq;
    Socket ar;
    boolean as;

    public li(Socket socket, mr mrVar, int i) throws IOException {
        try {
            this.al = false;
            this.am = 0;
            this.ak = 0;
            this.as = false;
            this.aj = mrVar;
            this.ar = socket;
            this.ag = 986432913 * i;
            this.ap = (i - 100) * -847562555;
            this.ar.setSoTimeout(30000);
            this.ar.setTcpNoDelay(true);
            this.ar.setReceiveBufferSize(65536);
            this.ar.setSendBufferSize(65536);
            this.ad = this.ar.getInputStream();
            this.aq = this.ar.getOutputStream();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static byte[] am(byte[] bArr, int i) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ap(Collection collection, int i) {
        try {
            collection.add(dr.al);
            collection.add(dr.aj);
            collection.add(dr.ai);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean aa(int i) throws IOException {
        return !this.al && this.ad.available() >= i;
    }

    public void ab(byte[] bArr, int i, int i2) throws IOException {
        am(bArr, i, i2, 1980430841);
    }

    public int ac() throws IOException {
        return this.al ? 0 : this.ad.available();
    }

    /* JADX WARNING: Missing block: B:11:0x001a, code skipped:
            if (r8.ad == null) goto L_0x0021;
     */
    /* JADX WARNING: Missing block: B:12:0x001c, code skipped:
            r8.ad.close();
     */
    /* JADX WARNING: Missing block: B:14:0x0023, code skipped:
            if (r8.aq == null) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:15:0x0025, code skipped:
            r8.aq.close();
     */
    /* JADX WARNING: Missing block: B:17:0x002c, code skipped:
            if (r8.ar == null) goto L_0x0033;
     */
    /* JADX WARNING: Missing block: B:18:0x002e, code skipped:
            r8.ar.close();
     */
    /* JADX WARNING: Missing block: B:29:0x004f, code skipped:
            if (r0 <= 0) goto L_0x0007;
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            r8.aq.write(r8.ae, r1 * -2096458258, r0);
     */
    /* JADX WARNING: Missing block: B:52:?, code skipped:
            r8.as = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ad() {
        int i;
        while (true) {
            try {
                synchronized (this) {
                    if (this.am * -1639382849 == this.ak * 213147753) {
                        if (this.al) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    int i2 = this.am;
                    i = this.ak * -380108083 >= this.am * -1639382849 ? (this.ak * -380108083) - (this.am * -139400488) : (this.ag * 109064232) - (this.am * -1639382849);
                }
            } catch (Exception e2) {
                iv.ad(null, e2, 1692244937);
                return;
            }
        }
        while (true) {
        }
        this.ae = null;
        return;
        this.am = ((i + (this.am * -1639382849)) % (this.ag * -520119439)) * -1295356097;
        try {
            if (this.am * -1639382849 == this.ak * -380108083) {
                this.aq.flush();
            }
        } catch (IOException e3) {
            this.as = true;
        }
    }

    public int ae(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (this.al) {
                return 0;
            }
            int i3 = i2;
            while (i3 > 0) {
                int read = this.ad.read(bArr, i, i3);
                if (read > 0) {
                    i += read;
                    i3 -= read;
                } else {
                    throw new EOFException();
                }
            }
            return i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int af(byte[] bArr, int i, int i2) throws IOException {
        if (this.al) {
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = this.ad.read(bArr, i, i3);
            if (read > 0) {
                i += read;
                i3 -= read;
            } else {
                throw new EOFException();
            }
        }
        return i2;
    }

    public void ag() {
        if (!this.al) {
            synchronized (this) {
                this.al = true;
                notifyAll();
            }
            if (this.ai != null) {
                while (this.ai.aj == 0) {
                    kh.ad(1);
                }
                if (this.ai.aj == 1) {
                    try {
                        ((Thread) this.ai.ak).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.ai = null;
        }
    }

    public int ah(byte[] bArr, int i, int i2) throws IOException {
        if (this.al) {
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = this.ad.read(bArr, i, i3);
            if (read > 0) {
                i += read;
                i3 -= read;
            } else {
                throw new EOFException();
            }
        }
        return i2;
    }

    public boolean ai(int i) throws IOException {
        try {
            return !this.al && this.ad.available() >= i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void aid() {
        ar();
    }

    /* Access modifiers changed, original: protected */
    public void aif() {
        ar();
    }

    /* Access modifiers changed, original: protected */
    public void ait() {
        ar();
    }

    public int aj() throws IOException {
        try {
            return this.al ? 0 : this.ad.available();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ak(byte[] bArr, int i, int i2) throws IOException {
        try {
            am(bArr, i, i2, -1774772544);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int al() throws IOException {
        try {
            return this.al ? 0 : this.ad.read();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void am(byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        try {
            if (!this.al) {
                if (this.as) {
                    this.as = false;
                    throw new IOException();
                }
                if (this.ae == null) {
                    this.ae = new byte[(this.ag * -520119439)];
                }
                synchronized (this) {
                    while (i4 < i2) {
                        this.ae[this.ak * -380108083] = bArr[i4 + i];
                        this.ak = (((this.ak * -380108083) + 1) % (this.ag * -520119439)) * 1111210501;
                        if (this.ak * -380108083 != ((this.ap * -2024045043) + (this.am * -1639382849)) % (this.ag * -520119439)) {
                            i4++;
                        } else {
                            throw new IOException();
                        }
                    }
                    if (this.ai == null) {
                        this.ai = this.aj.ai(this, 3, 783460868);
                    }
                    notifyAll();
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void an(byte[] bArr, int i, int i2) throws IOException {
        am(bArr, i, i2, -1124180068);
    }

    public boolean ao(int i) throws IOException {
        return !this.al && this.ad.available() >= i;
    }

    public void ap() {
        if (!this.al) {
            synchronized (this) {
                this.al = true;
                notifyAll();
            }
            if (this.ai != null) {
                while (this.ai.aj == 0) {
                    kh.ad(1);
                }
                if (this.ai.aj == 1) {
                    try {
                        ((Thread) this.ai.ak).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.ai = null;
        }
    }

    /* JADX WARNING: Missing block: B:11:0x001a, code skipped:
            if (r8.ad == null) goto L_0x0021;
     */
    /* JADX WARNING: Missing block: B:12:0x001c, code skipped:
            r8.ad.close();
     */
    /* JADX WARNING: Missing block: B:14:0x0023, code skipped:
            if (r8.aq == null) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:15:0x0025, code skipped:
            r8.aq.close();
     */
    /* JADX WARNING: Missing block: B:17:0x002c, code skipped:
            if (r8.ar == null) goto L_0x0033;
     */
    /* JADX WARNING: Missing block: B:18:0x002e, code skipped:
            r8.ar.close();
     */
    /* JADX WARNING: Missing block: B:29:0x004c, code skipped:
            if (r0 <= 0) goto L_0x000a;
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            r8.aq.write(r8.ae, r1 * -1639382849, r0);
     */
    /* JADX WARNING: Missing block: B:52:?, code skipped:
            r8.as = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void aq() {
        int i;
        while (true) {
            synchronized (this) {
                if (this.am * -1639382849 == this.ak * -380108083) {
                    if (this.al) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                int i2 = this.am;
                i = this.ak * -380108083 >= this.am * -1639382849 ? (this.ak * -380108083) - (this.am * -1639382849) : (this.ag * -520119439) - (this.am * -1639382849);
            }
        }
        while (true) {
        }
        this.ae = null;
        return;
        try {
            this.am = ((i + (this.am * -1639382849)) % (this.ag * -520119439)) * -1295356097;
            try {
                if (this.am * -1639382849 == this.ak * -380108083) {
                    this.aq.flush();
                }
            } catch (IOException e2) {
                this.as = true;
            }
        } catch (Exception e3) {
            iv.ad(null, e3, 1692244937);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ar() {
        try {
            if (!this.al) {
                synchronized (this) {
                    this.al = true;
                    notifyAll();
                }
                if (this.ai != null) {
                    while (this.ai.aj == 0) {
                        kh.ad(1);
                    }
                    if (this.ai.aj == 1) {
                        try {
                            ((Thread) this.ai.ak).join();
                        } catch (InterruptedException e) {
                        }
                    }
                }
                this.ai = null;
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.ar(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public void as() {
        if (!this.al) {
            synchronized (this) {
                this.al = true;
                notifyAll();
            }
            if (this.ai != null) {
                while (this.ai.aj == 0) {
                    kh.ad(1);
                }
                if (this.ai.aj == 1) {
                    try {
                        ((Thread) this.ai.ak).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.ai = null;
        }
    }

    public int au() throws IOException {
        return this.al ? 0 : this.ad.read();
    }

    public void av(byte[] bArr, int i, int i2) throws IOException {
        am(bArr, i, i2, -1758492357);
    }

    public int aw() throws IOException {
        return this.al ? 0 : this.ad.available();
    }

    public int ax() throws IOException {
        return this.al ? 0 : this.ad.available();
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (!this.al) {
            if (this.as) {
                this.as = false;
                throw new IOException();
            }
            if (this.ae == null) {
                this.ae = new byte[(this.ag * -520119439)];
            }
            synchronized (this) {
                while (i3 < i2) {
                    this.ae[this.ak * -380108083] = bArr[i3 + i];
                    this.ak = (((this.ak * -380108083) + 1) % (this.ag * -520119439)) * -735998517;
                    if (this.ak * -380108083 != ((this.ap * -1637069053) + (this.am * -1639382849)) % (this.ag * -2107457149)) {
                        i3++;
                    } else {
                        throw new IOException();
                    }
                }
                if (this.ai == null) {
                    this.ai = this.aj.ai(this, 3, -547217637);
                }
                notifyAll();
            }
        }
    }

    public int az() throws IOException {
        return this.al ? 0 : this.ad.read();
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            ar();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("li.finalize(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0019, code skipped:
            if (r7.ad == null) goto L_0x0020;
     */
    /* JADX WARNING: Missing block: B:12:0x001b, code skipped:
            r7.ad.close();
     */
    /* JADX WARNING: Missing block: B:14:0x0022, code skipped:
            if (r7.aq == null) goto L_0x0029;
     */
    /* JADX WARNING: Missing block: B:15:0x0024, code skipped:
            r7.aq.close();
     */
    /* JADX WARNING: Missing block: B:17:0x002b, code skipped:
            if (r7.ar == null) goto L_0x0032;
     */
    /* JADX WARNING: Missing block: B:18:0x002d, code skipped:
            r7.ar.close();
     */
    /* JADX WARNING: Missing block: B:29:0x004b, code skipped:
            if (r0 <= 0) goto L_0x0009;
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            r7.aq.write(r7.ae, r1 * -1639382849, r0);
     */
    /* JADX WARNING: Missing block: B:57:?, code skipped:
            r7.as = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        int i;
        while (true) {
            synchronized (this) {
                if (this.am * -1639382849 == this.ak * -380108083) {
                    if (this.al) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                int i2 = this.am;
                i = this.ak * -380108083 >= this.am * -1639382849 ? (this.ak * -380108083) - (this.am * -1639382849) : (this.ag * -520119439) - (this.am * -1639382849);
            }
        }
        while (true) {
        }
        this.ae = null;
        return;
        try {
            this.am = ((i + (this.am * -1639382849)) % (this.ag * -520119439)) * -1295356097;
            try {
                if (this.am * -1639382849 == this.ak * -380108083) {
                    this.aq.flush();
                }
            } catch (IOException e2) {
                this.as = true;
            }
        } catch (Exception e3) {
            try {
                iv.ad(null, e3, 1692244937);
            } catch (RuntimeException e4) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("li.run(");
                stringBuilder.append(')');
                throw mv.aq(e4, stringBuilder.toString());
            }
        }
    }
}
