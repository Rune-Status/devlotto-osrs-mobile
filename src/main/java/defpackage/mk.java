package defpackage;

import java.io.IOException;
import java.net.Socket;

/* renamed from: mk */
public abstract class mk {
    static final int bv = 1;

    protected mk() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mk.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static mk bk(Socket socket, int i, int i2) throws IOException {
        return new mt(socket, i, i2);
    }

    public abstract boolean aa(int i) throws IOException;

    public abstract void ab(byte[] bArr, int i, int i2) throws IOException;

    public abstract int ac() throws IOException;

    public abstract int ae(byte[] bArr, int i, int i2) throws IOException;

    public abstract int af(byte[] bArr, int i, int i2) throws IOException;

    public abstract void ag();

    public abstract int ah(byte[] bArr, int i, int i2) throws IOException;

    public abstract boolean ai(int i) throws IOException;

    public abstract int aj() throws IOException;

    public abstract void ak(byte[] bArr, int i, int i2) throws IOException;

    public abstract int al() throws IOException;

    public abstract void an(byte[] bArr, int i, int i2) throws IOException;

    public abstract boolean ao(int i) throws IOException;

    public abstract void ap();

    public abstract void ar();

    public abstract void as();

    public abstract int au() throws IOException;

    public abstract void av(byte[] bArr, int i, int i2) throws IOException;

    public abstract int aw() throws IOException;

    public abstract int ax() throws IOException;

    public abstract int az() throws IOException;
}
