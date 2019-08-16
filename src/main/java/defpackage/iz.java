package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: iz */
public class iz {
    static String ad = "true";
    static String ae = "<br>";
    public static String ai = "->";
    public static String aj = ")";
    public static String al = " (";
    public static String am = "</col>";
    static String aq = ",";
    static String ar = "|";
    public static final int bo = 2;

    iz() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iz.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ae(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<col=");
        stringBuilder.append(Integer.toHexString(i));
        stringBuilder.append(">");
        return stringBuilder.toString();
    }

    static String ai(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<img=");
        stringBuilder.append(i);
        stringBuilder.append(">");
        return stringBuilder.toString();
    }

    static String aj(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<img=");
        stringBuilder.append(i);
        stringBuilder.append(">");
        return stringBuilder.toString();
    }

    static String al(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<img=");
        stringBuilder.append(i);
        stringBuilder.append(">");
        return stringBuilder.toString();
    }

    public static oq aq(String str, String str2, boolean z, byte b) {
        StringBuilder stringBuilder;
        try {
            File file = mc.al;
            stringBuilder = new StringBuilder();
            stringBuilder.append("preferences");
            stringBuilder.append(str);
            stringBuilder.append(".dat");
            File file2 = new File(file, stringBuilder.toString());
            if (file2.exists()) {
                try {
                    return new oq(file2, "rw", 10000);
                } catch (IOException e) {
                }
            }
            String str3 = "";
            if (aw.az * -1890810221 == 33) {
                str3 = "_rc";
            } else if (aw.az * -1890810221 == 34) {
                str3 = "_wip";
            }
            File file3 = mc.ac;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("jagex_");
            stringBuilder2.append(str2);
            stringBuilder2.append("_preferences");
            stringBuilder2.append(str);
            stringBuilder2.append(str3);
            stringBuilder2.append(".dat");
            File file4 = new File(file3, stringBuilder2.toString());
            if (!z && file4.exists()) {
                try {
                    return new oq(file4, "rw", 10000);
                } catch (IOException e2) {
                }
            }
            return new oq(file2, "rw", 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        } catch (RuntimeException e4) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("iz.aq(");
            stringBuilder.append(')');
            throw mv.aq(e4, stringBuilder.toString());
        }
    }

    static String ar(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<img=");
        stringBuilder.append(i);
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
