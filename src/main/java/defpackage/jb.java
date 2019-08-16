package defpackage;

import android.support.v4.app.NotificationCompat;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/* renamed from: jb */
public class jb {
    public static final int ap = 4;
    public static final int as = 38;
    static int[] av = null;
    public static final int cz = 99;
    URL ad;
    List ai;
    final List aj;
    final jt al;
    jg aq;
    jp ar;

    public jb(URL url) {
        try {
            this.al = new jt("universal");
            this.aj = new LinkedList();
            this.ai = new LinkedList();
            this.ad = url;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jb.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public URL ac() {
        return this.ad;
    }

    public boolean ad(int i, byte b) {
        try {
            if (this.aq == null) {
                this.aq = new jg();
                lr.ad(i, this.al.ar, 1788681357);
            }
            try {
                if (this.ad == null) {
                    throw new Exception();
                } else if (this.ar == null) {
                    this.ar = this.aq.ar(this.ad, -1433765249);
                    return false;
                } else if (!this.ar.aq((short) 26504)) {
                    return false;
                } else {
                    mw mwVar = new mw(new String(this.ar.ar(-1656615300), "CP1252").split("[\\r\\n]+"));
                    jt jtVar = this.al;
                    while (true) {
                        String[] aq = mwVar.aq((byte) 0);
                        if (aq == null) {
                            String ad = mwVar.ad(-900329858);
                            if (ad != null) {
                                jtVar = new jt(ad);
                                this.aj.add(jtVar);
                            } else {
                                this.aq.aj(1601168944);
                                this.aq = null;
                                return true;
                            }
                        } else if (aq[0].equals("param")) {
                            aq(aq[1], jtVar, (byte) -27);
                        } else if (aq[0].equals(NotificationCompat.CATEGORY_MESSAGE)) {
                            ar(aq[1], jtVar, (short) -17729);
                        } else {
                            al(aq, jtVar, (byte) -81);
                        }
                    }
                }
            } catch (Exception e) {
                if (this.aq != null) {
                    this.aq.aj(1552550090);
                    this.aq = null;
                }
                return true;
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jb.ad(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public boolean ae(int i) {
        if (this.aq == null) {
            this.aq = new jg();
            lr.ad(i, this.al.ar, 1353909355);
        }
        try {
            if (this.ad == null) {
                throw new Exception();
            } else if (this.ar == null) {
                this.ar = this.aq.ar(this.ad, -2318423);
                return false;
            } else if (!this.ar.aq((short) -8831)) {
                return false;
            } else {
                mw mwVar = new mw(new String(this.ar.ar(-1656615300), "CP1252").split("[\\r\\n]+"));
                jt jtVar = this.al;
                while (true) {
                    String[] aq = mwVar.aq((byte) 0);
                    if (aq == null) {
                        String ad = mwVar.ad(-882533623);
                        if (ad != null) {
                            jtVar = new jt(ad);
                            this.aj.add(jtVar);
                        } else {
                            this.aq.aj(1554673676);
                            this.aq = null;
                            return true;
                        }
                    } else if (aq[0].equals("param")) {
                        aq(aq[1], jtVar, (byte) 23);
                    } else if (aq[0].equals(NotificationCompat.CATEGORY_MESSAGE)) {
                        ar(aq[1], jtVar, (short) 9052);
                    } else {
                        al(aq, jtVar, (byte) -109);
                    }
                }
            }
        } catch (Exception e) {
            if (this.aq != null) {
                this.aq.aj(2004920795);
                this.aq = null;
            }
            return true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(String[] strArr, jt jtVar) {
        jtVar.ad.put(strArr[0], strArr[1]);
    }

    public URL ai(int i) {
        try {
            return this.ad;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jb.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public jt aj(int i) {
        try {
            return this.al;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jb.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(String str, jt jtVar) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            jtVar.aq.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(String[] strArr, jt jtVar, byte b) {
        try {
            jtVar.ad.put(strArr[0], strArr[1]);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jb.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void am(String str, jt jtVar) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            jtVar.aq.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(String[] strArr, jt jtVar) {
        jtVar.ad.put(strArr[0], strArr[1]);
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(String str, jt jtVar, byte b) {
        try {
            int indexOf = str.indexOf(61);
            if (indexOf != -1) {
                jtVar.aq.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jb.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(String str, jt jtVar, short s) {
        int i = 0;
        try {
            int indexOf = str.indexOf(61);
            if (indexOf != -1) {
                String toLowerCase = str.substring(0, indexOf).trim().toLowerCase();
                StringBuilder stringBuilder = new StringBuilder(str.substring(indexOf + 1).trim());
                while (true) {
                    indexOf = stringBuilder.indexOf("\\\\", i);
                    i = stringBuilder.indexOf("\\n", i);
                    if (indexOf < 0 && i < 0) {
                        break;
                    } else if (indexOf < 0 || (i >= 0 && i < indexOf)) {
                        stringBuilder.replace(i, i + 2, "\n");
                        i++;
                    } else {
                        stringBuilder.replace(indexOf, indexOf + 2, "\\");
                        i = indexOf + 1;
                    }
                }
                if (toLowerCase.startsWith("lang")) {
                    try {
                        this.ai.add(new jc(Integer.parseInt(toLowerCase.substring(4)), stringBuilder.toString()));
                    } catch (NumberFormatException e) {
                    }
                }
                jtVar.ar.put(toLowerCase, stringBuilder.toString());
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("jb.ar(");
            stringBuilder2.append(')');
            throw mv.aq(e2, stringBuilder2.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(String str, jt jtVar) {
        int i = 0;
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            String toLowerCase = str.substring(0, indexOf).trim().toLowerCase();
            StringBuilder stringBuilder = new StringBuilder(str.substring(indexOf + 1).trim());
            while (true) {
                indexOf = stringBuilder.indexOf("\\\\", i);
                i = stringBuilder.indexOf("\\n", i);
                if (indexOf < 0 && i < 0) {
                    break;
                } else if (indexOf < 0 || (i >= 0 && i < indexOf)) {
                    stringBuilder.replace(i, i + 2, "\n");
                    i++;
                } else {
                    stringBuilder.replace(indexOf, indexOf + 2, "\\");
                    i = indexOf + 1;
                }
            }
            if (toLowerCase.startsWith("lang")) {
                try {
                    this.ai.add(new jc(Integer.parseInt(toLowerCase.substring(4)), stringBuilder.toString()));
                } catch (NumberFormatException e) {
                }
            }
            jtVar.ar.put(toLowerCase, stringBuilder.toString());
        }
    }

    public jt au() {
        return this.al;
    }

    public URL aw() {
        return this.ad;
    }

    public jt ax() {
        return this.al;
    }

    public jt az() {
        return this.al;
    }
}
