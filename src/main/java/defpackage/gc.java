package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;

/* renamed from: gc */
public class gc implements lk {
    static final int ac = 2;
    static final gc ad = new gc(0, -1, true, false, true);
    static final gc ai = new gc(5, 10, false, false, true);
    static final gc aj = new gc(4, 3, false, false, true);
    static final gc al = new gc(3, 2, false, false, true);
    static final gc aq = new gc(1, 0, true, true, true);
    static final gc ar = new gc(2, 1, true, true, false);
    public static final int bj = 58;
    static final int cm = 17;
    public static fu km = null;
    static final int si = 2;
    final int ae;
    public final boolean ak;
    public final int am;
    public final boolean as;

    gc(int i, int i2, boolean z, boolean z2, boolean z3) {
        try {
            this.ae = -278588343 * i;
            this.am = 257862579 * i2;
            this.ak = z2;
            this.as = z3;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gc.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static gc[] ae() {
        return new gc[]{aj, ai, al, ar, aq, ad};
    }

    /* JADX WARNING: Missing block: B:30:?, code skipped:
            return 'u';
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            return 'o';
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            return 'n';
     */
    /* JADX WARNING: Missing block: B:33:?, code skipped:
            return 'i';
     */
    /* JADX WARNING: Missing block: B:34:?, code skipped:
            return 'e';
     */
    /* JADX WARNING: Missing block: B:35:?, code skipped:
            return 'c';
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static char aj(char c, int i) {
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
                                                                                                try {
                                                                                                    return Character.toLowerCase(c);
                                                                                                } catch (RuntimeException e) {
                                                                                                    StringBuilder stringBuilder = new StringBuilder();
                                                                                                    stringBuilder.append("gc.aj(");
                                                                                                    stringBuilder.append(')');
                                                                                                    throw mv.aq(e, stringBuilder.toString());
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
        }
        return 'a';
    }

    public static gc[] am() {
        return new gc[]{aj, ai, al, ar, aq, ad};
    }

    public static gc[] ar() {
        return new gc[]{aj, ai, al, ar, aq, ad};
    }

    static int bd(int i) {
        try {
            int i2 = hm.fw.ar * 767223527;
            int i3 = hm.fw.al * 1488950355;
            hj bq = ck.bq(-622860494);
            int i4 = (bq.ak * -844626013) + 23;
            int i5 = (hm.as * 1034216923) + (bq.ae * 987359585);
            int i6 = 0;
            for (int i7 = (hm.eg * 1754320713) * (bq.al * -507697637); i7 < ii.ai * 1909797369; i7++) {
                if (i2 >= i5 && i3 >= i4 && i2 < (bq.ad * -1025891283) + i5 && i3 < (bq.aq * -415854127) + i4) {
                    return i7;
                }
                i4 += (bq.aq * -415854127) + (bq.ai * 1921233033);
                i6++;
                if (i6 >= bq.al * -507697637) {
                    i4 = (bq.ak * -844626013) + 23;
                    i5 += (bq.ad * -1025891283) + (bq.aj * -1320970971);
                    i6 = 0;
                }
            }
            return -1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gc.bd(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void di(int i) {
        try {
            int i2 = hz.ai;
            int[] iArr = hz.ae;
            int i3 = 0;
            while (i3 < -1076782851 * i2) {
                if (!(client.kw * 1452663617 == iArr[i3] || iArr[i3] == client.jj * 869197827)) {
                    cn.dl(client.jz[iArr[i3]], true, -1490481109);
                }
                i3++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gc.di(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(int i) {
        try {
            return this.ae * -1303699975;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gc.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ai() {
        return this.ae * -1303699975;
    }

    public int aj() {
        return this.ae * -1303699975;
    }

    public int al() {
        return this.ae * -517191505;
    }
}
