package defpackage;

/* renamed from: bz */
public class bz {
    static final int af = 200;
    static int[] ag = null;
    static kh ak = null;
    static final int bk = 127;

    bz() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bz.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static long ad(int i, int i2, int i3, int i4) {
        return (long) (((i << 8) | (i3 << 16)) | i2);
    }

    static final byte[] bs(byte[] bArr, int i) {
        try {
            lj ljVar = new lj(bArr);
            int af = ljVar.af(1804771424);
            int at = ljVar.at((byte) -103);
            byte[] bArr2;
            if (at < 0 || (kh.aa * 1776694925 != 0 && at > kh.aa * 1776694925)) {
                throw new RuntimeException();
            } else if (af == 0) {
                bArr2 = new byte[at];
                ljVar.bd(bArr2, 0, at, (byte) 0);
                return bArr2;
            } else {
                int at2 = ljVar.at((byte) -13);
                if (at2 < 0 || (kh.aa * 1776694925 != 0 && at2 > kh.aa * 1776694925)) {
                    throw new RuntimeException();
                }
                bArr2 = new byte[at2];
                if (1 == af) {
                    kl.ad(bArr2, at2, bArr, at, 9);
                    return bArr2;
                }
                kh.az.ad(ljVar, bArr2, (byte) 1);
                return bArr2;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bz.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void hd(int i) {
        try {
            client.eb.ar(ib.aq(no.af, client.eb.aj, -454408837), -2057308453);
            mb ar = client.kd.ar();
            while (true) {
                is isVar = (is) ar;
                if (isVar == null) {
                    break;
                }
                if (isVar.aq * 657938815 == 0 || 3 == isVar.aq * 657938815) {
                    ay.hq(isVar, true, (byte) 27);
                }
                ar = client.kd.al();
            }
            if (client.lh != null) {
                da.gk(client.lh, (byte) 2);
                client.lh = null;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bz.hd(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
