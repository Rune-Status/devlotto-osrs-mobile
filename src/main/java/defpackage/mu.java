package defpackage;

/* renamed from: mu */
public class mu extends ld {
    mu() {
        try {
            System.nanoTime();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mu.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ae() {
        System.nanoTime();
    }

    public void aq(int i) {
        try {
            System.nanoTime();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mu.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
