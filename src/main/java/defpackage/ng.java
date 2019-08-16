package defpackage;

import java.util.Comparator;

/* renamed from: ng */
final class ng implements Comparator {
    public static final int ae = 16;
    public static final int au = 13;

    ng() {
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(nx nxVar, nx nxVar2, int i) {
        try {
            if (nxVar.ar.ar * 1561048985 < nxVar2.ar.ar * 1561048985) {
                return -1;
            }
            return nxVar.ar.ar * 1561048985 == nxVar2.ar.ar * 1561048985 ? 0 : 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ng.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ad((nx) obj, (nx) obj2, 2130903105);
    }

    /* Access modifiers changed, original: 0000 */
    public int aj(nx nxVar, nx nxVar2) {
        return nxVar.ar.ar * 1561048985 < nxVar2.ar.ar * 1561048985 ? -1 : nxVar.ar.ar * 1561048985 == nxVar2.ar.ar * 1561048985 ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int al(nx nxVar, nx nxVar2) {
        return nxVar.ar.ar * 857403152 < nxVar2.ar.ar * -417189447 ? -1 : nxVar.ar.ar * 1561048985 == nxVar2.ar.ar * 1561048985 ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(nx nxVar, nx nxVar2) {
        return nxVar.ar.ar * 1561048985 < nxVar2.ar.ar * 1561048985 ? -1 : nxVar.ar.ar * 1561048985 == nxVar2.ar.ar * 1561048985 ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(nx nxVar, nx nxVar2) {
        return nxVar.ar.ar * -532552316 < nxVar2.ar.ar * 339577071 ? -1 : nxVar.ar.ar * 1561048985 == nxVar2.ar.ar * -1757956156 ? 0 : 1;
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ad((nx) obj, (nx) obj2, 2130903105);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ng.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ng.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }
}
