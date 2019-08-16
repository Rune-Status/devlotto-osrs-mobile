package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.android.billingclient.BuildConfig;

/* renamed from: pu */
public class pu implements aq {
    public static final int am = 32;
    static final String aq = "\\.";
    static final String ar = "_";
    int ae;
    int ai;
    int aj;
    client al;

    public pu(client client) {
        try {
            this.al = client;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pu.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x0189 A:{Catch:{ RuntimeException -> 0x027e }} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e A:{Catch:{ RuntimeException -> 0x027e }} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x023e A:{Catch:{ RuntimeException -> 0x027e }} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A:{Catch:{ RuntimeException -> 0x027e }} */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086 A:{Catch:{ RuntimeException -> 0x027e }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ad ad(byte b) {
        String toLowerCase;
        String property;
        String str;
        boolean z;
        int i;
        int i2;
        try {
            String toLowerCase2;
            int i3 = this.al.ax ? this.al.abh((byte) 110) == 2 ? 5 : 6 : mc.ax.startsWith("win") ? 1 : mc.ax.startsWith("mac") ? 2 : mc.ax.startsWith("linux") ? 3 : 4;
            try {
                toLowerCase = System.getProperty("os.arch").toLowerCase();
            } catch (Exception e) {
                toLowerCase = "";
            }
            try {
                toLowerCase2 = System.getProperty("os.version").toLowerCase();
            } catch (Exception e2) {
                toLowerCase2 = "";
            }
            String property2;
            try {
                property2 = System.getProperty("java.vendor");
                try {
                    property = System.getProperty("java.version");
                    str = property2;
                } catch (Exception e3) {
                    property = BuildConfig.VERSION_NAME;
                    str = property2;
                    if (!toLowerCase.startsWith("amd64")) {
                    }
                    if (i3 != 1) {
                    }
                    if (str.toLowerCase().indexOf("sun") == -1) {
                    }
                    al(property, -1964656159);
                    if (this.aj * 1325327187 <= 3) {
                    }
                    return new ad(i3, z, i2, i, this.aj * 1325327187, this.ai * -2025426779, this.ae * -229381051, false, ((int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) + 1, this.aj * 1325327187 <= 3 ? Runtime.getRuntime().availableProcessors() : 0, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[3], 0, "");
                }
            } catch (Exception e4) {
                property2 = "Unknown";
            }
            z = toLowerCase.startsWith("amd64") || toLowerCase.startsWith("x86_64");
            if (i3 != 1) {
                if (toLowerCase2.indexOf("4.0") != -1) {
                    i2 = 1;
                } else if (toLowerCase2.indexOf("4.1") != -1) {
                    i2 = 2;
                } else if (toLowerCase2.indexOf("4.9") != -1) {
                    i2 = 3;
                } else if (toLowerCase2.indexOf("5.0") != -1) {
                    i2 = 4;
                } else if (toLowerCase2.indexOf("5.1") != -1) {
                    i2 = 5;
                } else if (toLowerCase2.indexOf("5.2") != -1) {
                    i2 = 8;
                } else if (toLowerCase2.indexOf("6.0") != -1) {
                    i2 = 6;
                } else if (toLowerCase2.indexOf("6.1") != -1) {
                    i2 = 7;
                } else if (toLowerCase2.indexOf("6.2") != -1) {
                    i2 = 9;
                } else if (toLowerCase2.indexOf("6.3") != -1) {
                    i2 = 10;
                } else {
                    if (toLowerCase2.indexOf("10.0") != -1) {
                        i2 = 11;
                    }
                    i2 = 0;
                }
            } else if (2 != i3) {
                int am;
                if (i3 == 5) {
                    am = this.al.abx((byte) 17).am(-1495219271) + 10000;
                } else {
                    if (6 == i3) {
                        am = this.al.abx((byte) 99).am(1608758339) + le.bq;
                    }
                    i2 = 0;
                }
                i2 = am;
            } else if (toLowerCase2.indexOf("10.4") != -1) {
                i2 = 20;
            } else if (toLowerCase2.indexOf("10.5") != -1) {
                i2 = 21;
            } else if (toLowerCase2.indexOf("10.6") != -1) {
                i2 = 22;
            } else if (toLowerCase2.indexOf("10.7") != -1) {
                i2 = 23;
            } else if (toLowerCase2.indexOf("10.8") != -1) {
                i2 = 24;
            } else if (toLowerCase2.indexOf("10.9") != -1) {
                i2 = 25;
            } else if (toLowerCase2.indexOf("10.10") != -1) {
                i2 = 26;
            } else if (toLowerCase2.indexOf("10.11") != -1) {
                i2 = 27;
            } else if (toLowerCase2.indexOf("10.12") != -1) {
                i2 = 28;
            } else {
                if (toLowerCase2.indexOf("10.13") != -1) {
                    i2 = 29;
                }
                i2 = 0;
            }
            i = str.toLowerCase().indexOf("sun") == -1 ? 1 : str.toLowerCase().indexOf("microsoft") != -1 ? 2 : str.toLowerCase().indexOf("apple") != -1 ? 3 : str.toLowerCase().indexOf("oracle") != -1 ? 5 : str.toLowerCase().indexOf("android") != -1 ? 6 : 4;
            al(property, -1964656159);
            return new ad(i3, z, i2, i, this.aj * 1325327187, this.ai * -2025426779, this.ae * -229381051, false, ((int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) + 1, this.aj * 1325327187 <= 3 ? Runtime.getRuntime().availableProcessors() : 0, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[3], 0, "");
        } catch (RuntimeException e5) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pu.ad(");
            stringBuilder.append(')');
            throw mv.aq(e5, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(String str) {
        if (str.startsWith("1.")) {
            aj(str, -672169498);
        } else {
            ai(str, 1289718743);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(String str) {
        String[] split = str.split(aq);
        try {
            this.aj = Integer.parseInt(split[0]) * 940923099;
            this.ai = Integer.parseInt(split[1]) * 805566253;
            this.ae = Integer.parseInt(split[2]) * 826033805;
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(String str, int i) {
        try {
            String[] split = str.split(aq);
            try {
                this.aj = Integer.parseInt(split[0]) * 940923099;
                this.ai = Integer.parseInt(split[1]) * 805566253;
                this.ae = Integer.parseInt(split[2]) * 826033805;
            } catch (Exception e) {
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pu.ai(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(String str, int i) {
        try {
            String[] split = str.split(aq);
            try {
                this.aj = Integer.parseInt(split[1]) * 940923099;
                split = split[2].split(ar);
                this.ai = Integer.parseInt(split[0]) * 805566253;
                this.ae = Integer.parseInt(split[1]) * 826033805;
            } catch (Exception e) {
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pu.aj(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(String str) {
        String[] split = str.split(aq);
        try {
            this.aj = Integer.parseInt(split[1]) * 940923099;
            split = split[2].split(ar);
            this.ai = Integer.parseInt(split[0]) * 805566253;
            this.ae = Integer.parseInt(split[1]) * 826033805;
        } catch (Exception e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(String str, int i) {
        try {
            if (str.startsWith("1.")) {
                aj(str, -1651044020);
            } else {
                ai(str, 1184414280);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pu.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void am(String str) {
        String[] split = str.split(aq);
        try {
            this.aj = Integer.parseInt(split[1]) * 940923099;
            split = split[2].split(ar);
            this.ai = Integer.parseInt(split[0]) * 799532781;
            this.ae = Integer.parseInt(split[1]) * 826033805;
        } catch (Exception e) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ad aq() {
        String toLowerCase;
        String toLowerCase2;
        String property;
        String str;
        boolean z;
        int i;
        int i2;
        int i3 = this.al.ax ? this.al.abh((byte) 76) == 2 ? 5 : 6 : mc.ax.startsWith("win") ? 1 : mc.ax.startsWith("mac") ? 2 : mc.ax.startsWith("linux") ? 3 : 4;
        try {
            toLowerCase = System.getProperty("os.arch").toLowerCase();
        } catch (Exception e) {
            toLowerCase = "";
        }
        try {
            toLowerCase2 = System.getProperty("os.version").toLowerCase();
        } catch (Exception e2) {
            toLowerCase2 = "";
        }
        String property2;
        try {
            property2 = System.getProperty("java.vendor");
            try {
                property = System.getProperty("java.version");
                str = property2;
            } catch (Exception e3) {
                property = BuildConfig.VERSION_NAME;
                str = property2;
                if (!toLowerCase.startsWith("amd64")) {
                }
                if (i3 != 1) {
                }
                if (str.toLowerCase().indexOf("sun") == -1) {
                }
                al(property, -1964656159);
                if (this.aj * 1325327187 <= 3) {
                }
                return new ad(i3, z, i2, i, this.aj * 1325327187, this.ai * -2025426779, this.ae * -229381051, false, ((int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) + 1, this.aj * 1325327187 <= 3 ? Runtime.getRuntime().availableProcessors() : 0, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[3], 0, "");
            }
        } catch (Exception e4) {
            property2 = "Unknown";
        }
        z = toLowerCase.startsWith("amd64") || toLowerCase.startsWith("x86_64");
        if (i3 != 1) {
            if (toLowerCase2.indexOf("4.0") != -1) {
                i2 = 1;
            } else if (toLowerCase2.indexOf("4.1") != -1) {
                i2 = 2;
            } else if (toLowerCase2.indexOf("4.9") != -1) {
                i2 = 3;
            } else if (toLowerCase2.indexOf("5.0") != -1) {
                i2 = 4;
            } else if (toLowerCase2.indexOf("5.1") != -1) {
                i2 = 5;
            } else if (toLowerCase2.indexOf("5.2") != -1) {
                i2 = 8;
            } else if (toLowerCase2.indexOf("6.0") != -1) {
                i2 = 6;
            } else if (toLowerCase2.indexOf("6.1") != -1) {
                i2 = 7;
            } else if (toLowerCase2.indexOf("6.2") != -1) {
                i2 = 9;
            } else if (toLowerCase2.indexOf("6.3") != -1) {
                i2 = 10;
            } else {
                if (toLowerCase2.indexOf("10.0") != -1) {
                    i2 = 11;
                }
                i2 = 0;
            }
        } else if (2 == i3) {
            if (toLowerCase2.indexOf("10.4") != -1) {
                i2 = 20;
            } else if (toLowerCase2.indexOf("10.5") != -1) {
                i2 = 21;
            } else if (toLowerCase2.indexOf("10.6") != -1) {
                i2 = 22;
            } else if (toLowerCase2.indexOf("10.7") != -1) {
                i2 = 23;
            } else if (toLowerCase2.indexOf("10.8") != -1) {
                i2 = 24;
            } else if (toLowerCase2.indexOf("10.9") != -1) {
                i2 = 25;
            } else if (toLowerCase2.indexOf("10.10") != -1) {
                i2 = 26;
            } else if (toLowerCase2.indexOf("10.11") != -1) {
                i2 = 27;
            } else if (toLowerCase2.indexOf("10.12") != -1) {
                i2 = 28;
            } else {
                if (toLowerCase2.indexOf("10.13") != -1) {
                    i2 = 29;
                }
                i2 = 0;
            }
        } else if (i3 == 5) {
            i2 = this.al.abx((byte) 81).am(-157769848) + 10000;
        } else {
            if (6 == i3) {
                i2 = this.al.abx((byte) 111).am(-13223816) + le.bq;
            }
            i2 = 0;
        }
        i = str.toLowerCase().indexOf("sun") == -1 ? 1 : str.toLowerCase().indexOf("microsoft") != -1 ? 2 : str.toLowerCase().indexOf("apple") != -1 ? 3 : str.toLowerCase().indexOf("oracle") != -1 ? 5 : str.toLowerCase().indexOf("android") != -1 ? 6 : 4;
        al(property, -1964656159);
        return new ad(i3, z, i2, i, this.aj * 1325327187, this.ai * -2025426779, this.ae * -229381051, false, ((int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) + 1, this.aj * 1325327187 <= 3 ? Runtime.getRuntime().availableProcessors() : 0, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[3], 0, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ad ar() {
        String toLowerCase;
        String toLowerCase2;
        String property;
        String str;
        boolean z;
        int i;
        int i2;
        int i3 = this.al.ax ? this.al.abh((byte) 30) == 2 ? 5 : 6 : mc.ax.startsWith("win") ? 1 : mc.ax.startsWith("mac") ? 2 : mc.ax.startsWith("linux") ? 3 : 4;
        try {
            toLowerCase = System.getProperty("os.arch").toLowerCase();
        } catch (Exception e) {
            toLowerCase = "";
        }
        try {
            toLowerCase2 = System.getProperty("os.version").toLowerCase();
        } catch (Exception e2) {
            toLowerCase2 = "";
        }
        String property2;
        try {
            property2 = System.getProperty("java.vendor");
            try {
                property = System.getProperty("java.version");
                str = property2;
            } catch (Exception e3) {
                property = BuildConfig.VERSION_NAME;
                str = property2;
                if (!toLowerCase.startsWith("amd64")) {
                }
                if (i3 != 1) {
                }
                if (str.toLowerCase().indexOf("sun") == -1) {
                }
                al(property, -1964656159);
                if (this.aj * 1325327187 <= 3) {
                }
                return new ad(i3, z, i2, i, this.aj * 1325327187, this.ai * -2025426779, this.ae * -229381051, false, ((int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) + 1, this.aj * 1325327187 <= 3 ? Runtime.getRuntime().availableProcessors() : 0, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[3], 0, "");
            }
        } catch (Exception e4) {
            property2 = "Unknown";
        }
        z = toLowerCase.startsWith("amd64") || toLowerCase.startsWith("x86_64");
        if (i3 != 1) {
            if (toLowerCase2.indexOf("4.0") != -1) {
                i2 = 1;
            } else if (toLowerCase2.indexOf("4.1") != -1) {
                i2 = 2;
            } else if (toLowerCase2.indexOf("4.9") != -1) {
                i2 = 3;
            } else if (toLowerCase2.indexOf("5.0") != -1) {
                i2 = 4;
            } else if (toLowerCase2.indexOf("5.1") != -1) {
                i2 = 5;
            } else if (toLowerCase2.indexOf("5.2") != -1) {
                i2 = 8;
            } else if (toLowerCase2.indexOf("6.0") != -1) {
                i2 = 6;
            } else if (toLowerCase2.indexOf("6.1") != -1) {
                i2 = 7;
            } else if (toLowerCase2.indexOf("6.2") != -1) {
                i2 = 9;
            } else if (toLowerCase2.indexOf("6.3") != -1) {
                i2 = 10;
            } else {
                if (toLowerCase2.indexOf("10.0") != -1) {
                    i2 = 11;
                }
                i2 = 0;
            }
        } else if (2 == i3) {
            if (toLowerCase2.indexOf("10.4") != -1) {
                i2 = 20;
            } else if (toLowerCase2.indexOf("10.5") != -1) {
                i2 = 21;
            } else if (toLowerCase2.indexOf("10.6") != -1) {
                i2 = 22;
            } else if (toLowerCase2.indexOf("10.7") != -1) {
                i2 = 23;
            } else if (toLowerCase2.indexOf("10.8") != -1) {
                i2 = 24;
            } else if (toLowerCase2.indexOf("10.9") != -1) {
                i2 = 25;
            } else if (toLowerCase2.indexOf("10.10") != -1) {
                i2 = 26;
            } else if (toLowerCase2.indexOf("10.11") != -1) {
                i2 = 27;
            } else if (toLowerCase2.indexOf("10.12") != -1) {
                i2 = 28;
            } else {
                if (toLowerCase2.indexOf("10.13") != -1) {
                    i2 = 29;
                }
                i2 = 0;
            }
        } else if (i3 == 5) {
            i2 = this.al.abx((byte) 12).am(433188549) + 10000;
        } else {
            if (6 == i3) {
                i2 = this.al.abx((byte) 87).am(-1538633988) + le.bq;
            }
            i2 = 0;
        }
        i = str.toLowerCase().indexOf("sun") == -1 ? 1 : str.toLowerCase().indexOf("microsoft") != -1 ? 2 : str.toLowerCase().indexOf("apple") != -1 ? 3 : str.toLowerCase().indexOf("oracle") != -1 ? 5 : str.toLowerCase().indexOf("android") != -1 ? 6 : 4;
        al(property, -1964656159);
        return new ad(i3, z, i2, i, this.aj * 1325327187, this.ai * -2025426779, this.ae * -229381051, false, ((int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) + 1, this.aj * 1325327187 <= 3 ? Runtime.getRuntime().availableProcessors() : 0, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[3], 0, "");
    }

    /* Access modifiers changed, original: 0000 */
    public void as(String str) {
        String[] split = str.split(aq);
        try {
            this.aj = Integer.parseInt(split[0]) * 940923099;
            this.ai = Integer.parseInt(split[1]) * 805566253;
            this.ae = Integer.parseInt(split[2]) * 826033805;
        } catch (Exception e) {
        }
    }
}
