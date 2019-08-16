package defpackage;

import java.io.IOException;
import java.net.Socket;

/* renamed from: mt */
public class mt extends mk {
    Socket ad;
    mg aq;
    mz ar;

    mt(Socket socket, int i, int i2) throws IOException {
        this.ad = socket;
        this.ad.setSoTimeout(30000);
        this.ad.setTcpNoDelay(true);
        this.ad.setReceiveBufferSize(65536);
        this.ad.setSendBufferSize(65536);
        this.aq = new mg(this.ad.getInputStream(), i);
        this.ar = new mz(this.ad.getOutputStream(), i2);
    }

    public boolean aa(int i) throws IOException {
        return this.aq.al(i);
    }

    public void ab(byte[] bArr, int i, int i2) throws IOException {
        this.ar.aj(bArr, i, i2);
    }

    public int ac() throws IOException {
        return this.aq.aj();
    }

    public int ae(byte[] bArr, int i, int i2) throws IOException {
        return this.aq.ae(bArr, i, i2);
    }

    public int af(byte[] bArr, int i, int i2) throws IOException {
        return this.aq.ae(bArr, i, i2);
    }

    public void ag() {
        this.ar.ai();
        try {
            this.ad.close();
        } catch (IOException e) {
        }
        this.aq.am();
    }

    public int ah(byte[] bArr, int i, int i2) throws IOException {
        return this.aq.ae(bArr, i, i2);
    }

    public boolean ai(int i) throws IOException {
        return this.aq.al(i);
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
        return this.aq.aj();
    }

    public void ak(byte[] bArr, int i, int i2) throws IOException {
        this.ar.aj(bArr, i, i2);
    }

    public int al() throws IOException {
        return this.aq.ai();
    }

    public void an(byte[] bArr, int i, int i2) throws IOException {
        this.ar.aj(bArr, i, i2);
    }

    public boolean ao(int i) throws IOException {
        return this.aq.al(i);
    }

    public void ap() {
        this.ar.ai();
        try {
            this.ad.close();
        } catch (IOException e) {
        }
        this.aq.am();
    }

    public void ar() {
        this.ar.ai();
        try {
            this.ad.close();
        } catch (IOException e) {
        }
        this.aq.am();
    }

    public void as() {
        this.ar.ai();
        try {
            this.ad.close();
        } catch (IOException e) {
        }
        this.aq.am();
    }

    public int au() throws IOException {
        return this.aq.ai();
    }

    public void av(byte[] bArr, int i, int i2) throws IOException {
        this.ar.aj(bArr, i, i2);
    }

    public int aw() throws IOException {
        return this.aq.aj();
    }

    public int ax() throws IOException {
        return this.aq.aj();
    }

    public int az() throws IOException {
        return this.aq.ai();
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        ar();
    }
}
