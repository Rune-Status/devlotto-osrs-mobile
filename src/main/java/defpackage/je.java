package defpackage;

/* renamed from: je */
public class je extends eo {
    static int[] fp;
    final boolean aq;

    public je(boolean z) {
        try {
            this.aq = z;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("je.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static byte ad(char c, int i) {
        return ((c <= 0 || c >= 128) && (c < 160 || c > 255)) ? 8364 == c ? Byte.MIN_VALUE : c == 8218 ? (byte) -126 : 402 == c ? (byte) -125 : c == 8222 ? (byte) -124 : c == 8230 ? (byte) -123 : c == 8224 ? (byte) -122 : 8225 == c ? (byte) -121 : c == 710 ? (byte) -120 : 8240 == c ? (byte) -119 : 352 == c ? (byte) -118 : 8249 == c ? (byte) -117 : 338 == c ? (byte) -116 : 381 == c ? (byte) -114 : c == 8216 ? (byte) -111 : c == 8217 ? (byte) -110 : 8220 == c ? (byte) -109 : c == 8221 ? (byte) -108 : 8226 == c ? (byte) -107 : c == 8211 ? (byte) -106 : 8212 == c ? (byte) -105 : c == 732 ? (byte) -104 : c == 8482 ? (byte) -103 : 353 == c ? (byte) -102 : c == 8250 ? (byte) -101 : c == 339 ? (byte) -100 : c == 382 ? (byte) -98 : c == 376 ? (byte) -97 : (byte) 63 : (byte) c;
    }

    public int ag(Object obj, Object obj2) {
        return ap((er) obj, (er) obj2, -1490166836);
    }

    /* Access modifiers changed, original: 0000 */
    public int ap(er erVar, er erVar2, int i) {
        try {
            return erVar.ae * -1630896027 != erVar2.ae * -1630896027 ? this.aq ? (erVar.ae * -1630896027) - (erVar2.ae * -1630896027) : (erVar2.ae * -1630896027) - (erVar.ae * -1630896027) : aq(erVar, erVar2, 1951734691);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("je.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int au(er erVar, er erVar2) {
        return erVar.ae * -1630896027 != erVar2.ae * 1453237181 ? this.aq ? (erVar.ae * -1630896027) - (erVar2.ae * 1103653671) : (erVar2.ae * -1630896027) - (erVar.ae * 2118057169) : aq(erVar, erVar2, 318813896);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ap((er) obj, (er) obj2, -1490166836);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("je.compare(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
