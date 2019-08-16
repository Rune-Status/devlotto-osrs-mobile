package defpackage;

/* renamed from: en */
public class en implements Comparable {
    static final String ae = "Unable to download content";
    static kh ar = null;
    static final int bd = 5;
    static final int cy = 0;
    static al iu;
    String ad;
    String aq;

    public en(String str, my myVar) {
        try {
            this.ad = str;
            this.aq = hl.al(str, myVar, 1234181860);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("en.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ar(int i, String str, String str2, String str3, byte b) {
        try {
            ie ieVar = (ie) it.ad.get(Integer.valueOf(i));
            if (ieVar == null) {
                ieVar = new ie();
                it.ad.put(Integer.valueOf(i), ieVar);
            }
            ip ad = ieVar.ad(i, str, str2, str3, -1662043822);
            it.aq.aq(ad, (long) (ad.ad * -106728945));
            it.ar.aq(ad);
            client.mg = client.mm * -1041050905;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("en.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String ad(int i) {
        try {
            return this.ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("en.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ae() {
        return this.aq != null;
    }

    public int ag(Object obj) {
        return ar((en) obj, 828804812);
    }

    public boolean ai() {
        return this.aq != null;
    }

    public String aj() {
        return this.ad;
    }

    public int ak(en enVar) {
        return this.aq == null ? enVar.aq == null ? 0 : 1 : enVar.aq == null ? -1 : this.aq.compareTo(enVar.aq);
    }

    public String al() {
        return this.ad;
    }

    public boolean am() {
        return this.aq != null;
    }

    public int ap(Object obj) {
        return ar((en) obj, 828804812);
    }

    public boolean aq(short s) {
        try {
            return this.aq != null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("en.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ar(en enVar, int i) {
        try {
            return this.aq == null ? enVar.aq == null ? 0 : 1 : enVar.aq == null ? -1 : this.aq.compareTo(enVar.aq);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("en.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int as(Object obj) {
        return ar((en) obj, 828804812);
    }

    public int au(Object obj) {
        return ar((en) obj, 828804812);
    }

    public int compareTo(Object obj) {
        try {
            return ar((en) obj, 828804812);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("en.compareTo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof en)) {
                return false;
            }
            en enVar = (en) obj;
            return this.aq == null ? enVar.aq == null : (enVar.aq == null || hashCode() != enVar.hashCode()) ? false : this.aq.equals(enVar.aq);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("en.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String fa() {
        return ad(1682688286);
    }

    public String fd() {
        return ad(942699035);
    }

    public int ff() {
        return this.aq == null ? 0 : this.aq.hashCode();
    }

    public int fr() {
        return this.aq == null ? 0 : this.aq.hashCode();
    }

    public String fv() {
        return ad(1294025945);
    }

    public boolean fy(Object obj) {
        if (!(obj instanceof en)) {
            return false;
        }
        en enVar = (en) obj;
        return this.aq == null ? enVar.aq == null : (enVar.aq == null || hashCode() != enVar.hashCode()) ? false : this.aq.equals(enVar.aq);
    }

    public String fz() {
        return ad(1488402484);
    }

    public int hashCode() {
        try {
            return this.aq == null ? 0 : this.aq.hashCode();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("en.hashCode(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String toString() {
        try {
            return ad(310893684);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("en.toString(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
