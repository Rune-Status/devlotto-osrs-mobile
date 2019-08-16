package defpackage;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

/* renamed from: oq */
public final class oq {
    RandomAccessFile ad;
    final long aq;
    long ar;

    public oq(File file, String str, long j) throws IOException {
        try {
            if (j == -1) {
                j = Long.MAX_VALUE;
            }
            if (file.length() > j) {
                file.delete();
            }
            this.ad = new RandomAccessFile(file, str);
            this.aq = 1012670401543525901L * j;
            this.ar = 0;
            int read = this.ad.read();
            if (!(read == -1 || str.equals("r"))) {
                this.ad.seek(0);
                this.ad.write(read);
            }
            this.ad.seek(0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oq.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void aa(boolean z) throws IOException {
        if (this.ad != null) {
            if (z) {
                try {
                    this.ad.getFD().sync();
                } catch (SyncFailedException e) {
                }
            }
            this.ad.close();
            this.ad = null;
        }
    }

    public final int ab(byte[] bArr, int i, int i2) throws IOException {
        int read = this.ad.read(bArr, i, i2);
        if (read > 0) {
            this.ar += ((long) read) * -8940550222147229605L;
        }
        return read;
    }

    public final void ac(boolean z) throws IOException {
        if (this.ad != null) {
            if (z) {
                try {
                    this.ad.getFD().sync();
                } catch (SyncFailedException e) {
                }
            }
            this.ad.close();
            this.ad = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void ad(long j) throws IOException {
        try {
            this.ad.seek(j);
            this.ar = -8940550222147229605L * j;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oq.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ae(long j) throws IOException {
        this.ad.seek(j);
        this.ar = -8940550222147229605L * j;
    }

    public final long af() throws IOException {
        return this.ad.length();
    }

    public final void ag(byte[] bArr, int i, int i2) throws IOException {
        long j = (long) i2;
        if ((this.ar * 8320797365323368403L) + j <= this.aq * 3233465831387654341L) {
            this.ad.write(bArr, i, i2);
            this.ar += j * -8940550222147229605L;
            return;
        }
        this.ad.seek(this.aq * 3233465831387654341L);
        this.ad.write(1);
        throw new EOFException();
    }

    public final long ah() throws IOException {
        return this.ad.length();
    }

    public final int ai(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            int read = this.ad.read(bArr, i, i2);
            if (read > 0) {
                this.ar += ((long) read) * -8940550222147229605L;
            }
            return read;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oq.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void aid() throws Throwable {
        if (this.ad != null) {
            System.out.println("");
            ar(-828841959);
        }
    }

    /* Access modifiers changed, original: protected */
    public void aif() throws Throwable {
        if (this.ad != null) {
            System.out.println("");
            ar(-474702155);
        }
    }

    /* Access modifiers changed, original: protected */
    public void ait() throws Throwable {
        if (this.ad != null) {
            System.out.println("");
            ar(-1663805458);
        }
    }

    public final long aj(byte b) throws IOException {
        try {
            return this.ad.length();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oq.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ak(byte[] bArr, int i, int i2) throws IOException {
        long j = (long) i2;
        if ((this.ar * 8320797365323368403L) + j <= this.aq * 3233465831387654341L) {
            this.ad.write(bArr, i, i2);
            this.ar += j * -8940550222147229605L;
            return;
        }
        this.ad.seek(this.aq * 3233465831387654341L);
        this.ad.write(1);
        throw new EOFException();
    }

    public final void al(boolean z, byte b) throws IOException {
        try {
            if (this.ad != null) {
                if (z) {
                    try {
                        this.ad.getFD().sync();
                    } catch (SyncFailedException e) {
                    }
                }
                this.ad.close();
                this.ad = null;
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oq.al(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void am(long j) throws IOException {
        this.ad.seek(j);
        this.ar = -8940550222147229605L * j;
    }

    public final int an(byte[] bArr, int i, int i2) throws IOException {
        int read = this.ad.read(bArr, i, i2);
        if (read > 0) {
            this.ar += ((long) read) * -8940550222147229605L;
        }
        return read;
    }

    public final void ao(boolean z) throws IOException {
        if (this.ad != null) {
            if (z) {
                try {
                    this.ad.getFD().sync();
                } catch (SyncFailedException e) {
                }
            }
            this.ad.close();
            this.ad = null;
        }
    }

    public final void ap() throws IOException {
        al(false, (byte) 44);
    }

    public final void aq(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            long j = (long) i2;
            if ((this.ar * 8320797365323368403L) + j <= this.aq * 3233465831387654341L) {
                this.ad.write(bArr, i, i2);
                this.ar += j * -8940550222147229605L;
                return;
            }
            this.ad.seek(this.aq * 3233465831387654341L);
            this.ad.write(1);
            throw new EOFException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oq.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void ar(int i) throws IOException {
        try {
            al(false, (byte) 93);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oq.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public final void as(byte[] bArr, int i, int i2) throws IOException {
        long j = (long) i2;
        if ((this.ar * 8320797365323368403L) + j <= this.aq * 3233465831387654341L) {
            this.ad.write(bArr, i, i2);
            this.ar += j * -8940550222147229605L;
            return;
        }
        this.ad.seek(this.aq * 3233465831387654341L);
        this.ad.write(1);
        throw new EOFException();
    }

    public final void au() throws IOException {
        al(false, (byte) 31);
    }

    public final int av(byte[] bArr, int i, int i2) throws IOException {
        int read = this.ad.read(bArr, i, i2);
        if (read > 0) {
            this.ar += ((long) read) * -8940550222147229605L;
        }
        return read;
    }

    public final void aw(boolean z) throws IOException {
        if (this.ad != null) {
            if (z) {
                try {
                    this.ad.getFD().sync();
                } catch (SyncFailedException e) {
                }
            }
            this.ad.close();
            this.ad = null;
        }
    }

    public final void ax() throws IOException {
        al(false, (byte) 86);
    }

    public final long ay() throws IOException {
        return this.ad.length();
    }

    public final void az() throws IOException {
        al(false, (byte) 47);
    }

    /* Access modifiers changed, original: protected */
    public void finalize() throws Throwable {
        try {
            if (this.ad != null) {
                System.out.println("");
                ar(-475298195);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("oq.finalize(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
