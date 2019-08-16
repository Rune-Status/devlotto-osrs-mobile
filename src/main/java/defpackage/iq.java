package defpackage;

import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: iq */
public final class iq extends ih {
    static al kc;
    public et ad;

    iq() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iq.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean ai(int i, int i2) {
        return ((i >> 21) & 1) != 0;
    }

    static File aq(String str, byte b) {
        RandomAccessFile randomAccessFile;
        try {
            if (ls.ad) {
                File file = (File) ls.ar.get(str);
                if (file == null) {
                    file = new File(am.aq, str);
                    try {
                        if (new File(file.getParent()).exists()) {
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                            try {
                                int read = randomAccessFile2.read();
                                randomAccessFile2.seek(0);
                                randomAccessFile2.write(read);
                                randomAccessFile2.seek(0);
                                randomAccessFile2.close();
                                ls.ar.put(str, file);
                            } catch (Exception e) {
                                randomAccessFile = randomAccessFile2;
                            }
                        } else {
                            throw new RuntimeException("");
                        }
                    } catch (Exception e2) {
                        randomAccessFile = null;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (Exception e3) {
                            }
                        }
                        throw new RuntimeException();
                    }
                }
                return file;
            }
            throw new RuntimeException("");
        } catch (RuntimeException e4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iq.aq(");
            stringBuilder.append(')');
            throw mv.aq(e4, stringBuilder.toString());
        }
    }

    static void aq(int i, String str, String str2, int i2) {
        try {
            en.ar(i, str, str2, null, (byte) 54);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iq.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ef ar(byte[] bArr, int i) {
        try {
            ab.ay(bArr, 761824442);
            return an.aw(-505137403);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iq.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A:{SYNTHETIC, RETURN, Catch:{ RuntimeException -> 0x00be }} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9 A:{Catch:{ RuntimeException -> 0x00be }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bp ab() {
        try {
            if (this.ad == null) {
                return null;
            }
            dp aq = (-1 == this.cs * -1099198911 || this.cx * -1961250233 != 0) ? null : gn.aq(this.cs * -1099198911, 1433469741);
            dp aq2 = (-1 == this.ce * -1620542321 || (this.ce * -1620542321 == this.bb * -959328679 && aq != null)) ? null : gn.aq(this.ce * -1620542321, 1806089941);
            bp ai = this.ad.ai(aq, this.cr * 317461367, aq2, this.cy * 631506963, 578342776);
            if (ai == null) {
                return null;
            }
            bp bpVar;
            ai.ai();
            this.di = ai.bx * -1067272603;
            if (!(-1 == this.ck * 836985687 || -1 == this.co * 1215520647)) {
                bp aj = dd.aq(this.ck * 836985687, 812886062).aj(this.co * 1215520647, (byte) 92);
                if (aj != null) {
                    aj.ac(0, -(this.cz * -583056727), 0);
                    bpVar = new bp(new bp[]{ai, aj}, 2);
                    if (1 == this.ad.ae * -735434895) {
                        return bpVar;
                    }
                    bpVar.bs = true;
                    return bpVar;
                }
            }
            bpVar = ai;
            if (1 == this.ad.ae * -735434895) {
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iq.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ad(int i, byte b, byte b2) {
        try {
            int i2;
            int i3 = this.db[0];
            int i4 = this.dc[0];
            if (i == 0) {
                i3--;
                i4++;
            }
            if (1 == i) {
                i4++;
            }
            if (i == 2) {
                i3++;
                i4++;
            }
            if (i == 3) {
                i3--;
            }
            if (4 == i) {
                i3++;
            }
            if (i == 5) {
                i3--;
                i4--;
            }
            if (6 == i) {
                i4--;
            }
            if (i == 7) {
                i4--;
                i2 = i3 + 1;
            } else {
                i2 = i3;
            }
            if (-1 != this.cs * -1099198911 && gn.aq(this.cs * -1099198911, 1520322728).aa * 952452997 == 1) {
                this.cs = -1835762113;
            }
            if (this.da * -913482765 < 9) {
                this.da -= 751585989;
            }
            for (i3 = this.da * -913482765; i3 > 0; i3--) {
                int i5 = i3 - 1;
                this.db[i3] = this.db[i5];
                this.dc[i3] = this.dc[i5];
                this.du[i3] = this.du[i5];
            }
            this.db[0] = i2;
            this.dc[0] = i4;
            this.du[0] = b;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iq.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aj(int i, int i2, boolean z) {
        if (-1 != this.cs * -1099198911 && gn.aq(this.cs * -1099198911, 1554519509).aa * 952452997 == 1) {
            this.cs = -1835762113;
        }
        if (!z) {
            int i3 = i - this.db[0];
            int i4 = i2 - this.dc[0];
            if (i3 >= -8 && i3 <= 8 && i4 >= -8 && i4 <= 8) {
                if (this.da * -913482765 < 9) {
                    this.da -= 751585989;
                }
                for (i3 = this.da * -913482765; i3 > 0; i3--) {
                    int i5 = i3 - 1;
                    this.db[i3] = this.db[i5];
                    this.dc[i3] = this.dc[i5];
                    this.du[i3] = this.du[i5];
                }
                this.db[0] = i;
                this.dc[0] = i2;
                this.du[0] = (byte) 1;
                return;
            }
        }
        this.da = 0;
        this.dn = 0;
        this.dp = 0;
        this.db[0] = i;
        this.dc[0] = i2;
        this.bq = (this.db[0] * -1770577792) + (this.bl * -1322789824);
        this.bd = (this.dc[0] * 1369419392) + (this.bl * -65303744);
    }

    /* Access modifiers changed, original: final */
    public final void al(int i, int i2, boolean z) {
        if (-1 != this.cs * -1099198911 && gn.aq(this.cs * -1099198911, 1988908174).aa * 952452997 == 1) {
            this.cs = -1835762113;
        }
        if (!z) {
            int i3 = i - this.db[0];
            int i4 = i2 - this.dc[0];
            if (i3 >= -8 && i3 <= 8 && i4 >= -8 && i4 <= 8) {
                if (this.da * -913482765 < 9) {
                    this.da -= 751585989;
                }
                for (i3 = this.da * -913482765; i3 > 0; i3--) {
                    int i5 = i3 - 1;
                    this.db[i3] = this.db[i5];
                    this.dc[i3] = this.dc[i5];
                    this.du[i3] = this.du[i5];
                }
                this.db[0] = i;
                this.dc[0] = i2;
                this.du[0] = (byte) 1;
                return;
            }
        }
        this.da = 0;
        this.dn = 0;
        this.dp = 0;
        this.db[0] = i;
        this.dc[0] = i2;
        this.bq = (this.db[0] * -1770577792) + (this.bl * -1322789824);
        this.bd = (this.dc[0] * 1369419392) + (this.bl * -65303744);
    }

    /* Access modifiers changed, original: final */
    public final boolean ap(int i) {
        try {
            return this.ad != null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iq.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void aq(int i, int i2, boolean z, int i3) {
        try {
            if (-1 != this.cs * -1099198911 && gn.aq(this.cs * -1099198911, 1681427959).aa * 952452997 == 1) {
                this.cs = -1835762113;
            }
            if (!z) {
                int i4 = i - this.db[0];
                int i5 = i2 - this.dc[0];
                if (i4 >= -8 && i4 <= 8 && i5 >= -8 && i5 <= 8) {
                    if (this.da * -913482765 < 9) {
                        this.da -= 751585989;
                    }
                    for (i4 = this.da * -913482765; i4 > 0; i4--) {
                        int i6 = i4 - 1;
                        this.db[i4] = this.db[i6];
                        this.dc[i4] = this.dc[i6];
                        this.du[i4] = this.du[i6];
                    }
                    this.db[0] = i;
                    this.dc[0] = i2;
                    this.du[0] = (byte) 1;
                    return;
                }
            }
            this.da = 0;
            this.dn = 0;
            this.dp = 0;
            this.db[0] = i;
            this.dc[0] = i2;
            this.bq = (this.db[0] * -1770577792) + (this.bl * -1322789824);
            this.bd = (this.dc[0] * 1369419392) + (this.bl * -65303744);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iq.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void ar(int i, byte b) {
        int i2 = this.db[0];
        int i3 = this.dc[0];
        if (i == 0) {
            i2--;
            i3++;
        }
        if (1 == i) {
            i3++;
        }
        if (i == 2) {
            i2++;
            i3++;
        }
        if (i == 3) {
            i2--;
        }
        if (4 == i) {
            i2++;
        }
        if (i == 5) {
            i2--;
            i3--;
        }
        if (6 == i) {
            i3--;
        }
        if (i == 7) {
            i2++;
            i3--;
        }
        if (-1 != this.cs * -1099198911 && gn.aq(this.cs * -1099198911, 2044910580).aa * 952452997 == 1) {
            this.cs = -1835762113;
        }
        if (this.da * -913482765 < 9) {
            this.da -= 751585989;
        }
        for (int i4 = this.da * -913482765; i4 > 0; i4--) {
            int i5 = i4 - 1;
            this.db[i4] = this.db[i5];
            this.dc[i4] = this.dc[i5];
            this.du[i4] = this.du[i5];
        }
        this.db[0] = i2;
        this.dc[0] = i3;
        this.du[0] = b;
    }

    /* Access modifiers changed, original: final */
    public final boolean br() {
        return this.ad != null;
    }

    /* Access modifiers changed, original: final */
    public final boolean bw() {
        return this.ad != null;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bp dd() {
        if (this.ad == null) {
            return null;
        }
        dp aq = (-1 == this.cs * -1099198911 || this.cx * -1961250233 != 0) ? null : gn.aq(this.cs * -1099198911, 1871547802);
        dp aq2 = (-1 == this.ce * -1620542321 || (this.ce * -1620542321 == this.bb * -959328679 && aq != null)) ? null : gn.aq(this.ce * -1620542321, 1539681168);
        bp ai = this.ad.ai(aq, this.cr * 317461367, aq2, this.cy * 631506963, 578342776);
        if (ai == null) {
            return null;
        }
        bp bpVar;
        ai.ai();
        this.di = ai.bx * -1067272603;
        if (!(-1 == this.ck * 836985687 || -1 == this.co * 1215520647)) {
            bp aj = dd.aq(this.ck * 836985687, 812886062).aj(this.co * 1215520647, (byte) 33);
            if (aj != null) {
                aj.ac(0, -(this.cz * -583056727), 0);
                bpVar = new bp(new bp[]{ai, aj}, 2);
                if (1 == this.ad.ae * -735434895) {
                    bpVar.bs = true;
                }
                return bpVar;
            }
        }
        bpVar = ai;
        if (1 == this.ad.ae * -735434895) {
        }
        return bpVar;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bp dm() {
        if (this.ad == null) {
            return null;
        }
        dp aq = (-1 == this.cs * -1099198911 || this.cx * -1961250233 != 0) ? null : gn.aq(this.cs * -1099198911, 1373796045);
        dp aq2 = (-1 == this.ce * -1620542321 || (this.ce * -1620542321 == this.bb * -959328679 && aq != null)) ? null : gn.aq(this.ce * -1620542321, 1596827470);
        bp ai = this.ad.ai(aq, this.cr * 317461367, aq2, this.cy * 631506963, 578342776);
        if (ai == null) {
            return null;
        }
        bp bpVar;
        ai.ai();
        this.di = ai.bx * -1067272603;
        if (!(-1 == this.ck * 836985687 || -1 == this.co * 1215520647)) {
            bp aj = dd.aq(this.ck * 836985687, 812886062).aj(this.co * 1215520647, (byte) -6);
            if (aj != null) {
                aj.ac(0, -(this.cz * -583056727), 0);
                bpVar = new bp(new bp[]{ai, aj}, 2);
                if (1 == this.ad.ae * -735434895) {
                    bpVar.bs = true;
                }
                return bpVar;
            }
        }
        bpVar = ai;
        if (1 == this.ad.ae * -735434895) {
        }
        return bpVar;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bp dt() {
        if (this.ad == null) {
            return null;
        }
        dp aq = (-1 == this.cs * -1099198911 || this.cx * -1961250233 != 0) ? null : gn.aq(this.cs * -1099198911, 1902805010);
        dp aq2 = (-1 == this.ce * -1620542321 || (this.ce * -1620542321 == this.bb * -959328679 && aq != null)) ? null : gn.aq(this.ce * -1620542321, 2037846592);
        bp ai = this.ad.ai(aq, this.cr * 317461367, aq2, this.cy * 631506963, 578342776);
        if (ai == null) {
            return null;
        }
        bp bpVar;
        ai.ai();
        this.di = ai.bx * -1067272603;
        if (!(-1 == this.ck * 836985687 || -1 == this.co * 1215520647)) {
            bp aj = dd.aq(this.ck * 836985687, 812886062).aj(this.co * 1215520647, (byte) 57);
            if (aj != null) {
                aj.ac(0, -(this.cz * -583056727), 0);
                bpVar = new bp(new bp[]{ai, aj}, 2);
                if (1 == this.ad.ae * -735434895) {
                    bpVar.bs = true;
                }
                return bpVar;
            }
        }
        bpVar = ai;
        if (1 == this.ad.ae * -735434895) {
        }
        return bpVar;
    }
}
