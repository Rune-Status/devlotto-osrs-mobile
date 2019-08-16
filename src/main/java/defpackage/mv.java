package defpackage;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;

/* renamed from: mv */
public class mv {
    static final int ad = 1;
    static final char[] al = new char[]{'[', ']', '#'};
    static final int aq = 12;
    static final char[] ar = new char[]{' ', 160, '_', '-', 224, 225, 226, 228, 227, 192, 193, 194, 196, 195, 232, 233, 234, 235, 200, 201, 202, 203, 237, 238, 239, 205, 206, 207, 242, 243, 244, 246, 245, 210, 211, 212, 214, 213, 249, 250, 251, 252, 217, 218, 219, 220, 231, 199, 255, 376, 241, 209, 223};

    mv() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mv.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ac(String str) {
        return (str == null || str.isEmpty() || str.charAt(0) == '#') ? "" : str;
    }

    static final int ae(my myVar) {
        return (myVar != null && myVar.as * -178234436 == 3) ? 20 : 12;
    }

    static final boolean ag(char c) {
        if (Character.isISOControl(c)) {
            return false;
        }
        if (fo.az(c, -899025580)) {
            return true;
        }
        char[] cArr = ar;
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        cArr = al;
        for (char c22 : cArr) {
            if (c22 == c) {
                return true;
            }
        }
        return false;
    }

    static final int ak(my myVar) {
        return (myVar != null && myVar.as * -1893498495 == 3) ? 20 : 12;
    }

    static final int am(my myVar) {
        return (myVar != null && myVar.as * 11875179 == 3) ? 20 : 12;
    }

    static final boolean ap(char c) {
        return 160 == c || c == 14994 || c == '_' || '-' == c;
    }

    public static pn aq(Throwable th, String str) {
        try {
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
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("mv.aq(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    static final boolean as(char c) {
        if (Character.isISOControl(c)) {
            return false;
        }
        if (fo.az(c, -941322390)) {
            return true;
        }
        char[] cArr = ar;
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        cArr = al;
        for (char c22 : cArr) {
            if (c22 == c) {
                return true;
            }
        }
        return false;
    }

    static final boolean au(char c) {
        return 160 == c || c == ' ' || c == '_' || '-' == c;
    }

    public static String aw(String str) {
        return (str == null || str.isEmpty() || str.charAt(0) == 18131) ? "" : str;
    }

    /* JADX WARNING: Missing block: B:27:?, code skipped:
            return 'u';
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            return 'o';
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            return 'n';
     */
    /* JADX WARNING: Missing block: B:30:?, code skipped:
            return 'i';
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            return 'e';
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            return 'c';
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static char ax(char c) {
        switch (c) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
                break;
            default:
                switch (c) {
                    case 199:
                        break;
                    case 200:
                    case 201:
                    case 202:
                    case 203:
                        break;
                    default:
                        switch (c) {
                            case 205:
                            case 206:
                            case 207:
                                break;
                            default:
                                switch (c) {
                                    case 209:
                                        break;
                                    case 210:
                                    case 211:
                                    case 212:
                                    case 213:
                                    case 214:
                                        break;
                                    default:
                                        switch (c) {
                                            case 217:
                                            case 218:
                                            case 219:
                                            case 220:
                                                break;
                                            default:
                                                switch (c) {
                                                    case 223:
                                                        return 'b';
                                                    case 224:
                                                    case 225:
                                                    case 226:
                                                    case 227:
                                                    case 228:
                                                        break;
                                                    default:
                                                        switch (c) {
                                                            case 231:
                                                                break;
                                                            case 232:
                                                            case 233:
                                                            case 234:
                                                            case 235:
                                                                break;
                                                            default:
                                                                switch (c) {
                                                                    case 237:
                                                                    case 238:
                                                                    case 239:
                                                                        break;
                                                                    default:
                                                                        switch (c) {
                                                                            case 241:
                                                                                break;
                                                                            case 242:
                                                                            case 243:
                                                                            case 244:
                                                                            case 245:
                                                                            case 246:
                                                                                break;
                                                                            default:
                                                                                switch (c) {
                                                                                    case 249:
                                                                                    case Callback.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                                                                                    case 251:
                                                                                    case 252:
                                                                                        break;
                                                                                    default:
                                                                                        switch (c) {
                                                                                            case ' ':
                                                                                            case '-':
                                                                                            case '_':
                                                                                            case 160:
                                                                                                return '_';
                                                                                            case '#':
                                                                                            case '[':
                                                                                            case ']':
                                                                                                return c;
                                                                                            case 255:
                                                                                            case 376:
                                                                                                return 'y';
                                                                                            default:
                                                                                                return Character.toLowerCase(c);
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        return 'a';
    }

    /* JADX WARNING: Missing block: B:27:?, code skipped:
            return 'u';
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            return 'o';
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            return 'n';
     */
    /* JADX WARNING: Missing block: B:30:?, code skipped:
            return 'i';
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            return 'e';
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            return 'c';
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static char az(char c) {
        switch (c) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
                break;
            default:
                switch (c) {
                    case 199:
                        break;
                    case 200:
                    case 201:
                    case 202:
                    case 203:
                        break;
                    default:
                        switch (c) {
                            case 205:
                            case 206:
                            case 207:
                                break;
                            default:
                                switch (c) {
                                    case 209:
                                        break;
                                    case 210:
                                    case 211:
                                    case 212:
                                    case 213:
                                    case 214:
                                        break;
                                    default:
                                        switch (c) {
                                            case 217:
                                            case 218:
                                            case 219:
                                            case 220:
                                                break;
                                            default:
                                                switch (c) {
                                                    case 223:
                                                        return 'b';
                                                    case 224:
                                                    case 225:
                                                    case 226:
                                                    case 227:
                                                    case 228:
                                                        break;
                                                    default:
                                                        switch (c) {
                                                            case 231:
                                                                break;
                                                            case 232:
                                                            case 233:
                                                            case 234:
                                                            case 235:
                                                                break;
                                                            default:
                                                                switch (c) {
                                                                    case 237:
                                                                    case 238:
                                                                    case 239:
                                                                        break;
                                                                    default:
                                                                        switch (c) {
                                                                            case 241:
                                                                                break;
                                                                            case 242:
                                                                            case 243:
                                                                            case 244:
                                                                            case 245:
                                                                            case 246:
                                                                                break;
                                                                            default:
                                                                                switch (c) {
                                                                                    case 249:
                                                                                    case Callback.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                                                                                    case 251:
                                                                                    case 252:
                                                                                        break;
                                                                                    default:
                                                                                        switch (c) {
                                                                                            case ' ':
                                                                                            case '-':
                                                                                            case '_':
                                                                                            case 160:
                                                                                                return '_';
                                                                                            case '#':
                                                                                            case '[':
                                                                                            case ']':
                                                                                                return c;
                                                                                            case 255:
                                                                                            case 376:
                                                                                                return 'y';
                                                                                            default:
                                                                                                return Character.toLowerCase(c);
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        return 'a';
    }

    static final void cg(String str, boolean z, int i) {
        try {
            if (client.ju) {
                int i2;
                int i3 = 6;
                if (!client.aq.ax) {
                    i2 = 6;
                } else if (hl.tk * 1350811837 > 1000) {
                    i3 = (hl.tk * 660197000) / 32768;
                    i2 = (jw.tx * 1363681614) / 32768;
                } else {
                    i3 = (hl.tk * -1531909056) / 32768;
                    i2 = (jw.tx * 930896318) / 32768;
                }
                int i4 = i3 + 4;
                int i5 = i2 + 4;
                int ai = client.fm.ai(str, Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                int ae = client.fm.ae(str, Callback.DEFAULT_SWIPE_ANIMATION_DURATION) * 13;
                es ad = client.aq.uk.ad(-601277067);
                i2 = i4 - 4;
                int i6 = i5 - 4;
                int i7 = (ai + 4) + 4;
                int i8 = (ae + 4) + 4;
                ad.al(i2, i6, i7, i8, 0, (byte) 1);
                ad.em(i2, i6, i7, i8, ViewCompat.MEASURED_SIZE_MASK, 886702648);
                client.fm.au(str, i4, i5, ai, ae, ViewCompat.MEASURED_SIZE_MASK, -1, 1, 1, 0, ad);
                ic.fx(i2, i6, i7, i8, 1827338275);
                if (z) {
                    client.aq.uk.ae(0, 0, 2068607304);
                } else {
                    aj.ft(i4, i5, ai, ae, (byte) 18);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mv.cg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
