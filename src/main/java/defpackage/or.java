package defpackage;

/* renamed from: or */
final class or implements od {
    static final int ak = 4;
    static final int bd = 0;

    or() {
    }

    public void ad(Object obj, lj ljVar, int i) {
        try {
            ae((Long) obj, ljVar, (byte) 16);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("or.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(Long l, lj ljVar, byte b) {
        try {
            ljVar.ak(l.longValue());
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("or.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public Object ai(lj ljVar) {
        return Long.valueOf(ljVar.bk(-1344005859));
    }

    public Object aj(lj ljVar) {
        return Long.valueOf(ljVar.bk(-688426341));
    }

    public Object al(lj ljVar) {
        return Long.valueOf(ljVar.bk(-1181933798));
    }

    public Object aq(lj ljVar, byte b) {
        try {
            return Long.valueOf(ljVar.bk(1930652482));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("or.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(Object obj, lj ljVar) {
        ae((Long) obj, ljVar, (byte) 16);
    }
}
