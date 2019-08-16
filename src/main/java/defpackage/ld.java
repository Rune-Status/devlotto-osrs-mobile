package defpackage;

/* renamed from: ld */
public abstract class ld {
    public static final int bn = 66;
    static final int br = 17;
    static final int bu = 15;

    ld() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ld.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ld ai() {
        return new mu();
    }

    public static ld aj() {
        return new mu();
    }

    public static ld al() {
        return new mu();
    }

    public static ld ar() {
        return new mu();
    }

    public abstract void ae();

    public abstract void aq(int i);
}
