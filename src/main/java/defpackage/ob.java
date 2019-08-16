package defpackage;

/* renamed from: ob */
final class ob implements od {
    static final int au = 2;
    public static final int az = 61;

    ob() {
    }

    public void ad(Object obj, lj ljVar, int i) {
        try {
            ae((Integer) obj, ljVar, 1672718132);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ob.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(Integer num, lj ljVar, int i) {
        try {
            ljVar.ae(num.intValue(), (byte) 36);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ob.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public Object ai(lj ljVar) {
        return Integer.valueOf(ljVar.at((byte) -126));
    }

    public Object aj(lj ljVar) {
        return Integer.valueOf(ljVar.at((byte) -100));
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(Integer num, lj ljVar) {
        ljVar.ae(num.intValue(), (byte) 27);
    }

    public Object al(lj ljVar) {
        return Integer.valueOf(ljVar.at((byte) 1));
    }

    /* Access modifiers changed, original: 0000 */
    public void am(Integer num, lj ljVar) {
        ljVar.ae(num.intValue(), (byte) 62);
    }

    public Object aq(lj ljVar, byte b) {
        try {
            return Integer.valueOf(ljVar.at((byte) -52));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ob.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(Object obj, lj ljVar) {
        ae((Integer) obj, ljVar, 176667607);
    }
}
