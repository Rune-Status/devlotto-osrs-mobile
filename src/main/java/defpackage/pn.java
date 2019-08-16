package defpackage;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

/* renamed from: pn */
public class pn extends RuntimeException {
    public static URL ad;
    public static int aj;
    public static String aq;
    public static int ar;
    Throwable ae;
    String ai;

    pn(Throwable th, String str) {
        try {
            this.ai = str;
            this.ae = th;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pn.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static pn ae(Throwable th, String str) {
        if (!(th instanceof pn)) {
            return new pn(th, str);
        }
        pn pnVar = (pn) th;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(pnVar.ai);
        stringBuilder.append(' ');
        stringBuilder.append(str);
        pnVar.ai = stringBuilder.toString();
        return pnVar;
    }

    static String ag(Throwable th) throws IOException {
        String stringBuilder;
        if (th instanceof pn) {
            pn pnVar = (pn) th;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(pnVar.ai);
            stringBuilder2.append(" | ");
            stringBuilder = stringBuilder2.toString();
            th = pnVar.ae;
        } else {
            stringBuilder = "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
        String readLine = bufferedReader.readLine();
        while (true) {
            String readLine2 = bufferedReader.readLine();
            StringBuilder stringBuilder3;
            if (readLine2 == null) {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder);
                stringBuilder3.append("| ");
                stringBuilder3.append(readLine);
                return stringBuilder3.toString();
            }
            StringBuilder stringBuilder4;
            int indexOf = readLine2.indexOf(40);
            int i = indexOf + 1;
            int indexOf2 = readLine2.indexOf(41, i);
            if (indexOf >= 0 && indexOf2 >= 0) {
                String substring = readLine2.substring(i, indexOf2);
                indexOf2 = substring.indexOf(".java:");
                if (indexOf2 >= 0) {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(substring.substring(0, indexOf2));
                    stringBuilder3.append(substring.substring(indexOf2 + 5));
                    readLine2 = stringBuilder3.toString();
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(stringBuilder);
                    stringBuilder4.append(readLine2);
                    stringBuilder4.append(' ');
                    stringBuilder = stringBuilder4.toString();
                } else {
                    readLine2 = readLine2.substring(0, indexOf);
                }
            }
            readLine2 = readLine2.trim();
            readLine2 = readLine2.substring(readLine2.lastIndexOf(32) + 1);
            readLine2 = readLine2.substring(readLine2.lastIndexOf(9) + 1);
            stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder);
            stringBuilder4.append(readLine2);
            stringBuilder4.append(' ');
            stringBuilder = stringBuilder4.toString();
        }
    }

    public static void ai(String str, Throwable th) {
        String str2 = "";
        if (th != null) {
            try {
                str2 = ib.ar(th, 538267137);
            } catch (Exception e) {
                return;
            }
        }
        if (str != null) {
            StringBuilder stringBuilder;
            if (th != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(" | ");
                str2 = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            str2 = stringBuilder.toString();
        }
        PrintStream printStream = System.out;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Error: ");
        stringBuilder2.append(str2);
        printStream.println(stringBuilder2.toString());
        str2 = str2.replace(41732, 21014).replace('@', '_').replace(10653, '_').replace('#', 12526);
        if (ad != null) {
            URL url = ad;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("clienterror.ws?cv=");
            stringBuilder2.append(ar * -1079281305);
            stringBuilder2.append("&cs=");
            stringBuilder2.append(ai.al * -868864655);
            stringBuilder2.append("&u=");
            stringBuilder2.append(aq);
            stringBuilder2.append("&v1=");
            stringBuilder2.append(mr.ad);
            stringBuilder2.append("&v2=");
            stringBuilder2.append(mr.aq);
            stringBuilder2.append("&e=");
            stringBuilder2.append(str2);
            stringBuilder2.append("&ct=");
            stringBuilder2.append(aj * 2077132234);
            stringBuilder2.append("&e=");
            stringBuilder2.append(str2);
            DataInputStream dataInputStream = new DataInputStream(new URL(url, stringBuilder2.toString()).openStream());
            dataInputStream.read();
            dataInputStream.close();
        }
    }

    public static void aj(String str, Throwable th) {
        String str2 = "";
        if (th != null) {
            try {
                str2 = ib.ar(th, 801436861);
            } catch (Exception e) {
                return;
            }
        }
        if (str != null) {
            StringBuilder stringBuilder;
            if (th != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(" | ");
                str2 = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            str2 = stringBuilder.toString();
        }
        PrintStream printStream = System.out;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Error: ");
        stringBuilder2.append(str2);
        printStream.println(stringBuilder2.toString());
        str2 = str2.replace(':', 35929).replace('@', 62124).replace(44839, '_').replace(41004, 17822);
        if (ad != null) {
            URL url = ad;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("clienterror.ws?cv=");
            stringBuilder2.append(ar * -1079281305);
            stringBuilder2.append("&cs=");
            stringBuilder2.append(ai.al * -868864655);
            stringBuilder2.append("&u=");
            stringBuilder2.append(aq);
            stringBuilder2.append("&v1=");
            stringBuilder2.append(mr.ad);
            stringBuilder2.append("&v2=");
            stringBuilder2.append(mr.aq);
            stringBuilder2.append("&e=");
            stringBuilder2.append(str2);
            stringBuilder2.append("&ct=");
            stringBuilder2.append(aj * -316098831);
            stringBuilder2.append("&e=");
            stringBuilder2.append(str2);
            DataInputStream dataInputStream = new DataInputStream(new URL(url, stringBuilder2.toString()).openStream());
            dataInputStream.read();
            dataInputStream.close();
        }
    }

    static String ak(Throwable th) throws IOException {
        String stringBuilder;
        if (th instanceof pn) {
            pn pnVar = (pn) th;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(pnVar.ai);
            stringBuilder2.append(" | ");
            stringBuilder = stringBuilder2.toString();
            th = pnVar.ae;
        } else {
            stringBuilder = "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
        String readLine = bufferedReader.readLine();
        while (true) {
            String readLine2 = bufferedReader.readLine();
            StringBuilder stringBuilder3;
            if (readLine2 == null) {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder);
                stringBuilder3.append("| ");
                stringBuilder3.append(readLine);
                return stringBuilder3.toString();
            }
            StringBuilder stringBuilder4;
            int indexOf = readLine2.indexOf(1032206834);
            int i = indexOf + 1;
            int indexOf2 = readLine2.indexOf(41, i);
            if (indexOf >= 0 && indexOf2 >= 0) {
                String substring = readLine2.substring(i, indexOf2);
                indexOf2 = substring.indexOf(".java:");
                if (indexOf2 >= 0) {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(substring.substring(0, indexOf2));
                    stringBuilder3.append(substring.substring(indexOf2 + 5));
                    readLine2 = stringBuilder3.toString();
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(stringBuilder);
                    stringBuilder4.append(readLine2);
                    stringBuilder4.append(1693);
                    stringBuilder = stringBuilder4.toString();
                } else {
                    readLine2 = readLine2.substring(0, indexOf);
                }
            }
            readLine2 = readLine2.trim();
            readLine2 = readLine2.substring(readLine2.lastIndexOf(32) + 1);
            readLine2 = readLine2.substring(readLine2.lastIndexOf(9) + 1);
            stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder);
            stringBuilder4.append(readLine2);
            stringBuilder4.append(' ');
            stringBuilder = stringBuilder4.toString();
        }
    }

    public static pn am(Throwable th, String str) {
        if (!(th instanceof pn)) {
            return new pn(th, str);
        }
        pn pnVar = (pn) th;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(pnVar.ai);
        stringBuilder.append(25132);
        stringBuilder.append(str);
        pnVar.ai = stringBuilder.toString();
        return pnVar;
    }

    static String as(Throwable th) throws IOException {
        String stringBuilder;
        if (th instanceof pn) {
            pn pnVar = (pn) th;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(pnVar.ai);
            stringBuilder2.append(" | ");
            stringBuilder = stringBuilder2.toString();
            th = pnVar.ae;
        } else {
            stringBuilder = "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
        String readLine = bufferedReader.readLine();
        while (true) {
            String readLine2 = bufferedReader.readLine();
            StringBuilder stringBuilder3;
            if (readLine2 == null) {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder);
                stringBuilder3.append("| ");
                stringBuilder3.append(readLine);
                return stringBuilder3.toString();
            }
            StringBuilder stringBuilder4;
            int indexOf = readLine2.indexOf(40);
            int i = indexOf + 1;
            int indexOf2 = readLine2.indexOf(41, i);
            if (indexOf >= 0 && indexOf2 >= 0) {
                String substring = readLine2.substring(i, indexOf2);
                indexOf2 = substring.indexOf(".java:");
                if (indexOf2 >= 0) {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(substring.substring(0, indexOf2));
                    stringBuilder3.append(substring.substring(indexOf2 + 5));
                    readLine2 = stringBuilder3.toString();
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(stringBuilder);
                    stringBuilder4.append(readLine2);
                    stringBuilder4.append(' ');
                    stringBuilder = stringBuilder4.toString();
                } else {
                    readLine2 = readLine2.substring(0, indexOf);
                }
            }
            readLine2 = readLine2.trim();
            readLine2 = readLine2.substring(readLine2.lastIndexOf(32) + 1);
            readLine2 = readLine2.substring(readLine2.lastIndexOf(9) + 1);
            stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder);
            stringBuilder4.append(readLine2);
            stringBuilder4.append(' ');
            stringBuilder = stringBuilder4.toString();
        }
    }

    public Throwable al(byte b) {
        try {
            return this.ae;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pn.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public Throwable ap() {
        return this.ae;
    }

    public Throwable au() {
        return this.ae;
    }
}
