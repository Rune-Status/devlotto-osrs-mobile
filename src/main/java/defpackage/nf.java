package defpackage;

import java.util.Comparator;

/* renamed from: nf */
final class nf implements Comparator {
    public static final int ai = 33554432;
    static int qq;

    nf() {
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(nx nxVar, nx nxVar2, int i) {
        try {
            if (nxVar.ar.al * 840986365 < nxVar2.ar.al * 840986365) {
                return -1;
            }
            return nxVar2.ar.al * 840986365 == nxVar.ar.al * 840986365 ? 0 : 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nf.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ad((nx) obj, (nx) obj2, 917766956);
    }

    /* Access modifiers changed, original: 0000 */
    public int aj(nx nxVar, nx nxVar2) {
        return nxVar.ar.al * 1831330576 < nxVar2.ar.al * 840986365 ? -1 : nxVar2.ar.al * 840986365 == nxVar.ar.al * 840986365 ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int al(nx nxVar, nx nxVar2) {
        return nxVar.ar.al * 1315011492 < nxVar2.ar.al * -1211101380 ? -1 : nxVar2.ar.al * -517330982 == nxVar.ar.al * 840986365 ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(nx nxVar, nx nxVar2) {
        return nxVar.ar.al * 840986365 < nxVar2.ar.al * 840986365 ? -1 : nxVar2.ar.al * 840986365 == nxVar.ar.al * 840986365 ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(nx nxVar, nx nxVar2) {
        return nxVar.ar.al * 1221595584 < nxVar2.ar.al * -623874282 ? -1 : nxVar2.ar.al * 1701071199 == nxVar.ar.al * 840986365 ? 0 : 1;
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ad((nx) obj, (nx) obj2, 917766956);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nf.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nf.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }
}
