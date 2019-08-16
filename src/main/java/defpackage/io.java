package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: io */
public class io {
    public static final io ad = new io(14);
    public static final io ae = new io(1);
    static final io ag = new io(3);
    static final int ah = 20;
    static final io ai = new io(11);
    public static final io aj = new io(8);
    static final io ak = new io(12);
    public static final io al = new io(10);
    static final io am = new io(4);
    static final io ap = new io(7);
    static final io aq = new io(5);
    public static final io ar = new io(2);
    static final io as = new io(0);
    static final io au = new io(9);
    public static final io ax = new io(6);
    static final io az = new io(13);
    static final int bx = 3;
    final int aw;

    io(int i) {
        try {
            this.aw = 821176237 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("io.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static pd ai(byte b) {
        try {
            return gi.rz;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("io.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ar(File file, byte b) {
        try {
            if (file.exists()) {
                mc.as = new of(new oq(file, "rw", 25), 24, 0);
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            int read = randomAccessFile.read();
            randomAccessFile.seek(0);
            randomAccessFile.write(read);
            randomAccessFile.seek(0);
            randomAccessFile.close();
            mc.as = new of(new oq(file, "rw", 25), 24, 0);
        } catch (IOException e) {
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("io.ar(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    static final void fl(int i, int i2, int i3, boolean z, int i4) {
        try {
            if (cs.al(i, -2127659600)) {
                cc.fk(dt.ae[i], -1, i2, i3, z, -1588208233);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("io.fl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static al hn(al alVar, int i) {
        try {
            int al = ln.al(hs.hy(alVar, (byte) 57), -1686961685);
            if (al == 0) {
                return null;
            }
            al alVar2 = alVar;
            for (int i2 = 0; i2 < al; i2++) {
                alVar2 = da.aq(alVar2.bc * -38514547, -550158556);
                if (alVar2 == null) {
                    return null;
                }
            }
            return alVar2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("io.hn(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
