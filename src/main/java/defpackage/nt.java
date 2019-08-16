package defpackage;

import java.util.Comparator;

/* renamed from: nt */
final class nt implements Comparator {
    public static final byte ad = (byte) -1;
    static final int al = 1024;
    public static final int cw = 81;

    nt() {
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(nx nxVar, nx nxVar2, int i) {
        try {
            return nxVar.ad((byte) 108).compareTo(nxVar2.ad((byte) -30));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nt.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ad((nx) obj, (nx) obj2, -2009064526);
    }

    /* Access modifiers changed, original: 0000 */
    public int aj(nx nxVar, nx nxVar2) {
        return nxVar.ad((byte) 60).compareTo(nxVar2.ad((byte) 3));
    }

    /* Access modifiers changed, original: 0000 */
    public int al(nx nxVar, nx nxVar2) {
        return nxVar.ad((byte) 73).compareTo(nxVar2.ad((byte) 68));
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(nx nxVar, nx nxVar2) {
        return nxVar.ad((byte) 44).compareTo(nxVar2.ad((byte) 35));
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(nx nxVar, nx nxVar2) {
        return nxVar.ad((byte) 25).compareTo(nxVar2.ad((byte) 9));
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ad((nx) obj, (nx) obj2, 510822509);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nt.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nt.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }
}
