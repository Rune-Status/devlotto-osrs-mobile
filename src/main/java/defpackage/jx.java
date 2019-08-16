package defpackage;

import java.util.Comparator;

/* renamed from: jx */
public class jx implements Comparator {
    static final int aw = 585;
    final boolean ad;

    public jx(boolean z) {
        try {
            this.ad = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jx.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ar(long j) {
        StringBuilder stringBuilder;
        int i = 0;
        if (j <= 0 || j >= 6582952005840035281L || j % 37 == 0) {
            return null;
        }
        long j2 = j;
        while (0 != j2) {
            i++;
            try {
                j2 /= 37;
            } catch (RuntimeException e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("jx.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = ly.ad[(int) (j - (j3 * 37))];
            if (c == '_') {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = 160;
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public int ad(er erVar, er erVar2, int i) {
        try {
            if (this.ad) {
                return (erVar.ai * 364336443) - (erVar2.ai * 364336443);
            }
            return (erVar2.ai * 364336443) - (erVar.ai * 364336443);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jx.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ag(Object obj, Object obj2) {
        return ad((er) obj, (er) obj2, -291535640);
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(er erVar, er erVar2) {
        return this.ad ? (erVar.ai * -250433725) - (erVar2.ai * 364336443) : (erVar2.ai * 364336443) - (erVar.ai * -386112701);
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(er erVar, er erVar2) {
        return this.ad ? (erVar.ai * 364336443) - (erVar2.ai * 364336443) : (erVar2.ai * 364336443) - (erVar.ai * 364336443);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ad((er) obj, (er) obj2, 1156291542);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jx.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jx.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean fy(Object obj) {
        return super.equals(obj);
    }
}
