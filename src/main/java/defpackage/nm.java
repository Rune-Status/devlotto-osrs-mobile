package defpackage;

import java.util.Comparator;

/* renamed from: nm */
final class nm implements Comparator {
    public static final int ac = 11;
    public static final int at = 32;

    nm() {
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(nx nxVar, nx nxVar2, byte b) {
        try {
            if (nxVar.aq * -3945319248063608953L < nxVar2.aq * -3945319248063608953L) {
                return -1;
            }
            return nxVar.aq * -3945319248063608953L == nxVar2.aq * -3945319248063608953L ? 0 : 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nm.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ad((nx) obj, (nx) obj2, (byte) 0);
    }

    /* Access modifiers changed, original: 0000 */
    public int al(nx nxVar, nx nxVar2) {
        return nxVar.aq * -3945319248063608953L < nxVar2.aq * -3945319248063608953L ? -1 : nxVar.aq * -3945319248063608953L == nxVar2.aq * -3945319248063608953L ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(nx nxVar, nx nxVar2) {
        return nxVar.aq * -3945319248063608953L < nxVar2.aq * -3945319248063608953L ? -1 : nxVar.aq * -3945319248063608953L == nxVar2.aq * -3945319248063608953L ? 0 : 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(nx nxVar, nx nxVar2) {
        return nxVar.aq * -3945319248063608953L < nxVar2.aq * -3945319248063608953L ? -1 : nxVar.aq * -3945319248063608953L == nxVar2.aq * -3945319248063608953L ? 0 : 1;
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ad((nx) obj, (nx) obj2, (byte) 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nm.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nm.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }
}
