package defpackage;

import java.util.Collection;

/* renamed from: fs */
public class fs implements fm {
    static final int af = 600;
    public static final int am = 0;
    static final int sh = 500;

    fs() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fs.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void aj(Collection collection, int i) {
        try {
            collection.add(dk.ar);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fs.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int cq(float f, byte b) {
        try {
            int i = (int) ((((float) (client.hk * 1611262327)) * f) + ((float) (client.hf * 738069765)));
            return i < 128 ? 128 : i > bc.cn ? bc.cn : i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fs.cq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void dw(int i, int i2, int i3, byte b) {
        if (i < 128 || i2 < 128 || i > 13056 || i2 > 13056) {
            try {
                client.ig = 2017756437;
                client.iy = 289370865;
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fs.dw(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        int i4 = i - (ep.hp * 1722134867);
        int dg = (nh.dg(i, i2, am.jy * 1973701849, -1715176583) - i3) - (fj.hc * 1470433239);
        int i5 = i2 - (cc.hg * -91971475);
        int i6 = bl.aa[ay.hr * 1914902541];
        int i7 = bl.ao[ay.hr * 1914902541];
        int i8 = bl.aa[gs.hd * 772603733];
        int i9 = bl.ao[gs.hd * 772603733];
        int i10 = ((i5 * i9) - (i8 * i4)) >> 16;
        int i11 = ((i10 * i7) + (dg * i6)) >> 16;
        if (i11 >= 50) {
            client.ig = ((((((i4 * i9) + (i5 * i8)) >> 16) * (client.rn * -806359681)) / i11) + ((client.qr * 1271637141) / 2)) * -2017756437;
            client.iy = ((((((dg * i7) - (i6 * i10)) >> 16) * (client.rn * -806359681)) / i11) + ((client.rh * -402617027) / 2)) * -289370865;
            return;
        }
        client.ig = 2017756437;
        client.iy = 289370865;
    }

    static void fj(String str, int i, int i2, int i3, int i4) {
        try {
            client.fm.ag(str, i, i2, 16776960, -1, client.aq.uk.ad(-601277067));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fs.fj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ae(int i, long j) {
        return true;
    }

    public boolean ag(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean ai(int i, long j) {
        return true;
    }

    public boolean ak(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean am(char c, long j) {
        return true;
    }

    public boolean ap(int i, int i2, long j) {
        return true;
    }

    public boolean as(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean au(int i, long j) {
        return true;
    }

    public boolean az(int i, long j) {
        return true;
    }

    public boolean bb(int i, long j) {
        return true;
    }

    public boolean bc(int i, long j) {
        return true;
    }

    public boolean bd(int i, long j) {
        return true;
    }

    public boolean be(int i, int i2, long j) {
        return true;
    }

    public boolean bf(int i, long j) {
        return true;
    }

    public boolean bg(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean bh(int i, long j) {
        return true;
    }

    public boolean bi(int i, long j) {
        return true;
    }

    public boolean bj(int i, int i2, long j) {
        return true;
    }

    public boolean bl(int i, long j) {
        return true;
    }

    public boolean bn(int i, long j) {
        return true;
    }

    public boolean bo(int i, long j) {
        return true;
    }

    public boolean bp(int i, long j) {
        return true;
    }

    public boolean bq(int i, long j) {
        return true;
    }

    public boolean br(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean bt(int i, long j) {
        return true;
    }

    public boolean bu(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean bv(char c, long j) {
        return true;
    }

    public boolean bw(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean bx(int i, int i2, int i3, int i4, long j) {
        return true;
    }

    public boolean by(int i, long j) {
        return true;
    }

    public boolean bz(int i, long j) {
        return true;
    }

    public boolean cj(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean cm(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean cq(int i, int i2, int i3, long j) {
        return true;
    }

    public boolean cv(int i, long j) {
        return true;
    }
}
