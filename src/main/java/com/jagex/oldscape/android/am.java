package com.jagex.oldscape.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.OrientationEventListener;
import com.jagex.jagex3.client.input.softkeyboard.al;
import defpackage.aa;
import defpackage.client;
import defpackage.dw;
import defpackage.ee;
import defpackage.ef;
import defpackage.el;
import defpackage.iq;
import defpackage.iv;
import defpackage.lj;
import defpackage.lp;
import defpackage.ml;
import defpackage.mv;
import defpackage.oi;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class am extends lp {
    static final String ad = "font.font";
    static final String aq = "fontmetrics.font";
    static int[] ar = new int[]{-1, -1, -1, -1, 13, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 71, 72, 86, -1, 81, -1, 80, 83, -1, -1, -1, 84, 85, -1, 26, 27, -1, -1, 74, 57, 58, 73, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 104, 105, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, 101, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, -1, -1, -1, 91, -1, -1, -1, -1, 90, 89, 88, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    volatile boolean ae;
    BroadcastReceiver ag;
    volatile int ai;
    final Rect aj;
    volatile boolean ak;
    final AndroidLauncher al;
    volatile boolean am;
    BroadcastReceiver ap;
    boolean as;
    final OrientationEventListener au;
    final int[] az;

    am(AndroidLauncher androidLauncher) {
        try {
            this.aj = new Rect();
            this.ai = 1653309013;
            this.ae = false;
            this.am = false;
            this.ak = false;
            this.as = false;
            this.ag = new aq(this);
            this.ap = new az(this);
            this.az = new int[2];
            this.al = androidLauncher;
            this.ay = new ad(androidLauncher);
            aq(this.al, 1786862728);
            this.au = ad(2048471836);
            if (this.au.canDetectOrientation()) {
                this.au.enable();
            }
            this.an = bl("mglwnafh", false, -357405610);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ee aa(byte[] bArr, int i) {
        try {
            return an(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), -373050328);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public oi ab(int i) {
        try {
            byte[] av = av(ad, (byte) -9);
            byte[] av2 = av(aq, (byte) -21);
            return (av == null || av2 == null) ? null : dw.az(av, av2, 631185903);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public al ac(int i, int i2) {
        try {
            if (this.ah == null || this.ah.ao(-1400749668) != i) {
                gl(1921690598);
                this.ah = new ar(this.al, i, this);
                this.ah.af(client.aq.acn(1570410705), -918213360);
            } else {
                this.ah.bs(-1929209575);
            }
            return this.ah;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public OrientationEventListener ad(int i) {
        try {
            return new aw(this, this.al, 2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(int i) {
        try {
            this.al.unregisterReceiver(this.ag);
            this.al.unregisterReceiver(this.ap);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ef[] af(int i, int i2) {
        try {
            byte[] ay = ay(i, (byte) 97);
            return ay == null ? null : el.ad(ay, 264866849);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean ag(int i) {
        try {
            return this.am;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ef ah(int i, byte b) {
        try {
            byte[] ay = ay(i, (byte) 6);
            return ay == null ? null : iq.ar(ay, 481820916);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i) {
        try {
            this.al.registerReceiver(this.ag, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.al.registerReceiver(this.ap, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aj(int i) {
        try {
            super.aj(2146619111);
            client.aq.acs(true, -497201567);
            ai(-826034833);
            bs(this.as, -265631818);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ak(int i) {
        try {
            return this.ai * 892498179;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void al(byte b) {
        try {
            super.al((byte) 90);
            client.aq.acs(false, -169112679);
            ae(-1624745926);
            bs(false, -1172333500);
            gl(1461586453);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int am(int i) {
        try {
            return VERSION.SDK_INT;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ee an(Bitmap bitmap, int i) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(height * width)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            return new ee(iArr, width, height);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public Object ao(ml mlVar, int i) {
        try {
            switch (mlVar.ai * -943694181) {
                case 0:
                    return bv("license.txt", -757592335);
                case 1:
                    return ab(-54898626);
                case 2:
                    return ah(R.raw.bar_empty, (byte) 85);
                case 3:
                    return af(2131558402, -1962736919);
                case 4:
                    return ah(2131558401, (byte) 85);
                default:
                    return null;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int[] ap(int i) {
        try {
            if (this.al != null) {
                this.al.getWindow().getDecorView().getLocationOnScreen(this.az);
            }
            return this.az;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(Context context, int i) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            this.am = false;
            this.ak = false;
            if (activeNetworkInfo != null) {
                this.am = activeNetworkInfo.getType() == 1;
                this.ak = !this.am;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(byte b) {
        try {
            this.au.disable();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean as(byte b) {
        try {
            return this.ae;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void at(byte b) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
            this.al.startActivity(intent);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.at(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean au(int i) {
        try {
            return this.am || this.ak;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047 A:{SYNTHETIC, Splitter:B:20:0x0047} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026 A:{SYNTHETIC, Splitter:B:10:0x0026} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] av(String str, byte b) {
        DataInputStream dataInputStream;
        Throwable th;
        DataInputStream dataInputStream2;
        try {
            AssetFileDescriptor openFd = this.al.getAssets().openFd(str);
            byte[] bArr = new byte[((int) openFd.getLength())];
            dataInputStream2 = new DataInputStream(openFd.createInputStream());
            try {
                dataInputStream2.readFully(bArr);
                try {
                    dataInputStream2.close();
                    return bArr;
                } catch (IOException e) {
                    return bArr;
                }
            } catch (IOException e2) {
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    return null;
                }
                try {
                    dataInputStream.close();
                    return null;
                } catch (IOException e3) {
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException e4) {
                    }
                }
                try {
                    throw th;
                } catch (RuntimeException e5) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("com/jagex/oldscape/android/am.av(");
                    stringBuilder.append(')');
                    throw mv.aq(e5, stringBuilder.toString());
                }
            }
        } catch (IOException e6) {
            dataInputStream = null;
            if (dataInputStream != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = null;
            if (dataInputStream2 != null) {
            }
            throw th;
        }
    }

    public float aw(int i) {
        try {
            if (this.al == null) {
                return -1.0f;
            }
            this.al.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.aj);
            return ((float) this.aj.height()) / ((float) this.al.getWindow().getDecorView().getHeight());
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.aw(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ax(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < ar.length) {
                    return ar[i];
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/am.ax(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        return -1;
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] ay(int i, byte b) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new GZIPInputStream(this.al.getResources().openRawResource(i)));
            lj ljVar = new lj(4);
            bufferedInputStream.read(ljVar.ar);
            byte[] bArr = new byte[ljVar.at((byte) -2)];
            bufferedInputStream.read(bArr);
            bufferedInputStream.close();
            return bArr;
        } catch (IOException e) {
            try {
                iv.ad("", e, 1692244937);
                return null;
            } catch (RuntimeException e2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/am.ay(");
                stringBuilder.append(')');
                throw mv.aq(e2, stringBuilder.toString());
            }
        }
    }

    public String az(byte b) {
        try {
            return VERSION.SDK_INT >= 21 ? this.al.getNoBackupFilesDir().getAbsolutePath() : this.al.getFilesDir().getAbsolutePath();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.az(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ba(boolean z, int i) {
        try {
            this.as = z;
            bs(this.as, 709876796);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int bb(String str, int i, byte b) {
        try {
            return this.al.getPreferences(0).getInt(str, i);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bb(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bc(String str, String str2, byte b) {
        try {
            this.al.runOnUiThread(new ac(this, str, str2));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bc(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bd(String str, String str2, int i) {
        try {
            Editor edit = this.al.getPreferences(0).edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bd(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public OrientationEventListener be() {
        return new aw(this, this.al, 2);
    }

    public String bf(String str, String str2, byte b) {
        try {
            return this.al.getPreferences(0).getString(str, str2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bf(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bg(String str, String str2, String str3, int i) {
        try {
            if (this.af == null) {
                try {
                    this.af = new ag(str, str2, str3, this.al);
                } catch (Throwable th) {
                    iv.ad(null, th, 1692244937);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bg(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bh(Context context) {
        boolean z = true;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        this.am = false;
        this.ak = false;
        if (activeNetworkInfo != null) {
            this.am = activeNetworkInfo.getType() == 1;
            if (this.am) {
                z = false;
            }
            this.ak = z;
        }
    }

    public void bi(String[] strArr, byte b) {
        try {
            Editor edit = this.al.getPreferences(0).edit();
            for (String remove : strArr) {
                edit.remove(remove);
            }
            edit.apply();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bi(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bj(Context context) {
        boolean z = true;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        this.am = false;
        this.ak = false;
        if (activeNetworkInfo != null) {
            this.am = activeNetworkInfo.getType() == 1;
            if (this.am) {
                z = false;
            }
            this.ak = z;
        }
    }

    public void bk(int i) {
        try {
            this.al.moveTaskToBack(true);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bk(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean bl(String str, boolean z, int i) {
        try {
            return this.al.getPreferences(0).getBoolean(str, z);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bl(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bm(Runnable runnable, int i) {
        try {
            this.al.runOnUiThread(runnable);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bn() {
        this.au.disable();
    }

    public void bo(String str, int i, byte b) {
        try {
            Editor edit = this.al.getPreferences(0).edit();
            edit.putInt(str, i);
            edit.apply();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bo(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bp() {
        super.aj(2138185080);
        client.aq.acs(true, -2115285346);
        ai(-1845937406);
        bs(this.as, -1118837303);
    }

    public void bq(String str, boolean z, int i) {
        try {
            Editor edit = this.al.getPreferences(0).edit();
            edit.putBoolean(str, z);
            edit.apply();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public OrientationEventListener br() {
        return new aw(this, this.al, 2);
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(boolean z, int i) {
        try {
            this.al.runOnUiThread(new ax(this, z));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bs(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bt(Context context) {
        boolean z = true;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        this.am = false;
        this.ak = false;
        if (activeNetworkInfo != null) {
            this.am = activeNetworkInfo.getType() == 1;
            if (this.am) {
                z = false;
            }
            this.ak = z;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public OrientationEventListener bu() {
        return new aw(this, this.al, 2);
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A:{SYNTHETIC, Splitter:B:11:0x0023} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String bv(String str, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream open;
        try {
            open = this.al.getAssets().open(str);
            try {
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                String str2 = new String(bArr);
                if (open == null) {
                    return str2;
                }
                try {
                    open.close();
                    return str2;
                } catch (IOException e) {
                    return str2;
                }
            } catch (IOException e2) {
                inputStream = open;
                if (inputStream == null) {
                    return null;
                }
                try {
                    inputStream.close();
                    return null;
                } catch (IOException e3) {
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (open != null) {
                }
                try {
                    throw th;
                } catch (RuntimeException e4) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("com/jagex/oldscape/android/am.bv(");
                    stringBuilder.append(')');
                    throw mv.aq(e4, stringBuilder.toString());
                }
            }
        } catch (IOException e5) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            open = null;
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e6) {
                }
            }
            throw th;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public OrientationEventListener bw() {
        return new aw(this, this.al, 2);
    }

    public aa bx(int i) {
        try {
            return this.af;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/am.bx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void by() {
        super.aj(2146882865);
        client.aq.acs(true, -677486358);
        ai(940070565);
        bs(this.as, 656144284);
    }

    public void bz() {
        super.al((byte) 30);
        client.aq.acs(false, -1075531487);
        ae(-1437383452);
        bs(false, -757111422);
        gl(1374491663);
    }

    public boolean ca() {
        return this.ae;
    }

    public int cb() {
        return VERSION.SDK_INT;
    }

    public int cc() {
        return VERSION.SDK_INT;
    }

    public boolean cd() {
        return this.am || this.ak;
    }

    public int ce() {
        return VERSION.SDK_INT;
    }

    public String cf() {
        return VERSION.SDK_INT >= 21 ? this.al.getNoBackupFilesDir().getAbsolutePath() : this.al.getFilesDir().getAbsolutePath();
    }

    public String cg() {
        return VERSION.SDK_INT >= 21 ? this.al.getNoBackupFilesDir().getAbsolutePath() : this.al.getFilesDir().getAbsolutePath();
    }

    public String ch() {
        return VERSION.SDK_INT >= 21 ? this.al.getNoBackupFilesDir().getAbsolutePath() : this.al.getFilesDir().getAbsolutePath();
    }

    public int ci() {
        return VERSION.SDK_INT;
    }

    /* Access modifiers changed, original: 0000 */
    public void cj() {
        this.al.registerReceiver(this.ag, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.al.registerReceiver(this.ap, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public boolean ck() {
        return this.am;
    }

    public boolean cl() {
        return this.am || this.ak;
    }

    /* Access modifiers changed, original: 0000 */
    public void cm() {
        this.al.registerReceiver(this.ag, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.al.registerReceiver(this.ap, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* Access modifiers changed, original: 0000 */
    public void cn() {
        this.al.unregisterReceiver(this.ag);
        this.al.unregisterReceiver(this.ap);
    }

    public int[] co() {
        if (this.al != null) {
            this.al.getWindow().getDecorView().getLocationOnScreen(this.az);
        }
        return this.az;
    }

    /* Access modifiers changed, original: 0000 */
    public void cp() {
        this.al.unregisterReceiver(this.ag);
        this.al.unregisterReceiver(this.ap);
    }

    /* Access modifiers changed, original: 0000 */
    public void cq() {
        this.al.registerReceiver(this.ag, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.al.registerReceiver(this.ap, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public int cr() {
        return this.ai * 892498179;
    }

    public int cs() {
        return this.ai * 892498179;
    }

    public boolean ct() {
        return this.am;
    }

    public int[] cu() {
        if (this.al != null) {
            this.al.getWindow().getDecorView().getLocationOnScreen(this.az);
        }
        return this.az;
    }

    public void cv() {
        super.aj(2133167639);
        client.aq.acs(true, -809419415);
        ai(1212010782);
        bs(this.as, 1837667012);
    }

    /* Access modifiers changed, original: 0000 */
    public void cw() {
        this.al.unregisterReceiver(this.ag);
        this.al.unregisterReceiver(this.ap);
    }

    public boolean cx() {
        return this.ae;
    }

    public int cy() {
        return VERSION.SDK_INT;
    }

    public boolean cz() {
        return this.am || this.ak;
    }

    public ee da(byte[] bArr) {
        return an(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), -373050328);
    }

    public ee db(byte[] bArr) {
        return an(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), -373050328);
    }

    public ee dc(byte[] bArr) {
        return an(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), -373050328);
    }

    public int dd(int i) {
        return (i < 0 || i >= ar.length) ? -1 : ar[i];
    }

    /* Access modifiers changed, original: 0000 */
    public ef de(int i) {
        byte[] ay = ay(i, (byte) 21);
        return ay == null ? null : iq.ar(ay, -1307202721);
    }

    public al df(int i) {
        if (this.ah == null || this.ah.ao(-1400749668) != i) {
            gl(1710043797);
            this.ah = new ar(this.al, i, this);
            this.ah.af(client.aq.acn(1845425276), 57146562);
        } else {
            this.ah.bs(450406087);
        }
        return this.ah;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A:{SYNTHETIC, Splitter:B:16:0x002e} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026 A:{SYNTHETIC, Splitter:B:10:0x0026} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] dg(String str) {
        DataInputStream dataInputStream;
        Throwable th;
        DataInputStream dataInputStream2;
        try {
            AssetFileDescriptor openFd = this.al.getAssets().openFd(str);
            byte[] bArr = new byte[((int) openFd.getLength())];
            dataInputStream2 = new DataInputStream(openFd.createInputStream());
            try {
                dataInputStream2.readFully(bArr);
                try {
                    dataInputStream2.close();
                    return bArr;
                } catch (IOException e) {
                    return bArr;
                }
            } catch (IOException e2) {
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException e3) {
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            dataInputStream = null;
            if (dataInputStream != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = null;
            if (dataInputStream2 != null) {
            }
            throw th;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ef dh(int i) {
        byte[] ay = ay(i, (byte) -39);
        return ay == null ? null : iq.ar(ay, -471338109);
    }

    public al di(int i) {
        if (this.ah == null || this.ah.ao(-1400749668) != i) {
            gl(1997352470);
            this.ah = new ar(this.al, i, this);
            this.ah.af(client.aq.acn(2139684978), 839210433);
        } else {
            this.ah.bs(-1819678530);
        }
        return this.ah;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A:{SYNTHETIC, Splitter:B:16:0x002e} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026 A:{SYNTHETIC, Splitter:B:10:0x0026} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] dj(String str) {
        DataInputStream dataInputStream;
        Throwable th;
        DataInputStream dataInputStream2;
        try {
            AssetFileDescriptor openFd = this.al.getAssets().openFd(str);
            byte[] bArr = new byte[((int) openFd.getLength())];
            dataInputStream2 = new DataInputStream(openFd.createInputStream());
            try {
                dataInputStream2.readFully(bArr);
                try {
                    dataInputStream2.close();
                    return bArr;
                } catch (IOException e) {
                    return bArr;
                }
            } catch (IOException e2) {
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException e3) {
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            dataInputStream = null;
            if (dataInputStream != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = null;
            if (dataInputStream2 != null) {
            }
            throw th;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public oi dk() {
        byte[] av = av(ad, (byte) -63);
        byte[] av2 = av(aq, (byte) -102);
        return (av == null || av2 == null) ? null : dw.az(av, av2, -135971571);
    }

    public al dl(int i) {
        if (this.ah == null || this.ah.ao(-1400749668) != i) {
            gl(1315362805);
            this.ah = new ar(this.al, i, this);
            this.ah.af(client.aq.acn(1531066612), 2127723163);
        } else {
            this.ah.bs(642336993);
        }
        return this.ah;
    }

    public int dm(int i) {
        return (i < 0 || i >= ar.length) ? -1 : ar[i];
    }

    public Object dn(ml mlVar) {
        switch (mlVar.ai * -943694181) {
            case 0:
                return bv("license.txt", -757592335);
            case 1:
                return ab(-1869904504);
            case 2:
                return ah(R.raw.bar_empty, (byte) 85);
            case 3:
                return af(2131558402, -1962736919);
            case 4:
                return ah(2131558401, (byte) 85);
            default:
                return null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: do */
    public ef[] m207do(int i) {
        byte[] ay = ay(i, (byte) 1);
        return ay == null ? null : el.ad(ay, -1634180698);
    }

    public Object dp(ml mlVar) {
        switch (mlVar.ai * -943694181) {
            case 0:
                return bv("license.txt", -757592335);
            case 1:
                return ab(-89330580);
            case 2:
                return ah(R.raw.bar_empty, (byte) 85);
            case 3:
                return af(2131558402, -1962736919);
            case 4:
                return ah(2131558401, (byte) 85);
            default:
                return null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ee dq(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(height * width)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return new ee(iArr, width, height);
    }

    public al dr(int i) {
        if (this.ah == null || this.ah.ao(-1400749668) != i) {
            gl(1862513767);
            this.ah = new ar(this.al, i, this);
            this.ah.af(client.aq.acn(1841503017), 1642392937);
        } else {
            this.ah.bs(-613161105);
        }
        return this.ah;
    }

    /* Access modifiers changed, original: 0000 */
    public ef ds(int i) {
        byte[] ay = ay(i, (byte) -53);
        return ay == null ? null : iq.ar(ay, 91870205);
    }

    public float dt() {
        if (this.al == null) {
            return -1.0f;
        }
        this.al.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.aj);
        return ((float) this.aj.height()) / ((float) this.al.getWindow().getDecorView().getHeight());
    }

    public Object du(ml mlVar) {
        switch (mlVar.ai * -943694181) {
            case 0:
                return bv("license.txt", -757592335);
            case 1:
                return ab(-2085598609);
            case 2:
                return ah(R.raw.bar_empty, (byte) 85);
            case 3:
                return af(-473200638, -1962736919);
            case 4:
                return ah(2131558401, (byte) 85);
            default:
                return null;
        }
    }

    public float dv() {
        if (this.al == null) {
            return -1.0f;
        }
        this.al.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.aj);
        return ((float) this.aj.height()) / ((float) this.al.getWindow().getDecorView().getHeight());
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A:{SYNTHETIC, Splitter:B:16:0x002e} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026 A:{SYNTHETIC, Splitter:B:10:0x0026} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] dw(String str) {
        DataInputStream dataInputStream;
        Throwable th;
        DataInputStream dataInputStream2;
        try {
            AssetFileDescriptor openFd = this.al.getAssets().openFd(str);
            byte[] bArr = new byte[((int) openFd.getLength())];
            dataInputStream2 = new DataInputStream(openFd.createInputStream());
            try {
                dataInputStream2.readFully(bArr);
                try {
                    dataInputStream2.close();
                    return bArr;
                } catch (IOException e) {
                    return bArr;
                }
            } catch (IOException e2) {
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException e3) {
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            dataInputStream = null;
            if (dataInputStream != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = null;
            if (dataInputStream2 != null) {
            }
            throw th;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public oi dx() {
        byte[] av = av(ad, (byte) -50);
        byte[] av2 = av(aq, (byte) -35);
        return (av == null || av2 == null) ? null : dw.az(av, av2, 1172325096);
    }

    /* Access modifiers changed, original: 0000 */
    public ef[] dy(int i) {
        byte[] ay = ay(i, (byte) -61);
        return ay == null ? null : el.ad(ay, -2131137739);
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A:{SYNTHETIC, Splitter:B:16:0x002e} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026 A:{SYNTHETIC, Splitter:B:10:0x0026} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] dz(String str) {
        DataInputStream dataInputStream;
        Throwable th;
        DataInputStream dataInputStream2;
        try {
            AssetFileDescriptor openFd = this.al.getAssets().openFd(str);
            byte[] bArr = new byte[((int) openFd.getLength())];
            dataInputStream2 = new DataInputStream(openFd.createInputStream());
            try {
                dataInputStream2.readFully(bArr);
                try {
                    dataInputStream2.close();
                    return bArr;
                } catch (IOException e) {
                    return bArr;
                }
            } catch (IOException e2) {
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException e3) {
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            dataInputStream = null;
            if (dataInputStream != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = null;
            if (dataInputStream2 != null) {
            }
            throw th;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ea(boolean z) {
        this.al.runOnUiThread(new ax(this, z));
    }

    public String eb(String str, String str2) {
        return this.al.getPreferences(0).getString(str, str2);
    }

    public void ec(boolean z) {
        this.as = z;
        bs(this.as, -328948637);
    }

    public void ed(String str, String str2) {
        Editor edit = this.al.getPreferences(0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public boolean ee(String str, boolean z) {
        return this.al.getPreferences(0).getBoolean(str, z);
    }

    public void ef(String[] strArr) {
        int i = 0;
        Editor edit = this.al.getPreferences(0).edit();
        while (i < strArr.length) {
            edit.remove(strArr[i]);
            i++;
        }
        edit.apply();
    }

    public void eg(String str, boolean z) {
        Editor edit = this.al.getPreferences(0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public void eh(boolean z) {
        this.as = z;
        bs(this.as, -809662777);
    }

    /* Access modifiers changed, original: 0000 */
    public void ei(boolean z) {
        this.al.runOnUiThread(new ax(this, z));
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A:{SYNTHETIC, Splitter:B:11:0x0023} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String ej(String str) {
        InputStream inputStream;
        Throwable th;
        InputStream open;
        try {
            open = this.al.getAssets().open(str);
            try {
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                String str2 = new String(bArr);
                if (open == null) {
                    return str2;
                }
                try {
                    open.close();
                    return str2;
                } catch (IOException e) {
                    return str2;
                }
            } catch (IOException e2) {
                inputStream = open;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (open != null) {
                }
                throw th;
            }
        } catch (IOException e4) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            open = null;
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ek(boolean z) {
        this.al.runOnUiThread(new ax(this, z));
    }

    public boolean el(String str, boolean z) {
        return this.al.getPreferences(0).getBoolean(str, z);
    }

    public int em(String str, int i) {
        return this.al.getPreferences(0).getInt(str, i);
    }

    public void en(Runnable runnable) {
        this.al.runOnUiThread(runnable);
    }

    public void eo() {
        this.al.moveTaskToBack(true);
    }

    public String ep(String str, String str2) {
        return this.al.getPreferences(0).getString(str, str2);
    }

    public void eq() {
        this.al.moveTaskToBack(true);
    }

    public void er(String str, int i) {
        Editor edit = this.al.getPreferences(0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A:{SYNTHETIC, Splitter:B:11:0x0023} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String es(String str) {
        InputStream inputStream;
        Throwable th;
        InputStream open;
        try {
            open = this.al.getAssets().open(str);
            try {
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                String str2 = new String(bArr);
                if (open == null) {
                    return str2;
                }
                try {
                    open.close();
                    return str2;
                } catch (IOException e) {
                    return str2;
                }
            } catch (IOException e2) {
                inputStream = open;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (open != null) {
                }
                throw th;
            }
        } catch (IOException e4) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            open = null;
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    public void et() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
        this.al.startActivity(intent);
    }

    public boolean eu(String str, boolean z) {
        return this.al.getPreferences(0).getBoolean(str, z);
    }

    public String ev(String str, String str2) {
        return this.al.getPreferences(0).getString(str, str2);
    }

    public boolean ew(String str, boolean z) {
        return this.al.getPreferences(0).getBoolean(str, z);
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A:{SYNTHETIC, Splitter:B:11:0x0023} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String ex(String str) {
        InputStream inputStream;
        Throwable th;
        InputStream open;
        try {
            open = this.al.getAssets().open(str);
            try {
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                String str2 = new String(bArr);
                if (open == null) {
                    return str2;
                }
                try {
                    open.close();
                    return str2;
                } catch (IOException e) {
                    return str2;
                }
            } catch (IOException e2) {
                inputStream = open;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (open != null) {
                }
                throw th;
            }
        } catch (IOException e4) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            open = null;
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    public void ey(Runnable runnable) {
        this.al.runOnUiThread(runnable);
    }

    public void ez() {
        this.al.moveTaskToBack(true);
    }

    public void fh(String str, String str2) {
        this.al.runOnUiThread(new ac(this, str, str2));
    }

    public void fm(String str, String str2) {
        this.al.runOnUiThread(new ac(this, str, str2));
    }

    public aa fn() {
        return this.af;
    }

    public void fq(String str, String str2, String str3) {
        if (this.af == null) {
            try {
                this.af = new ag(str, str2, str3, this.al);
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        }
    }

    public void fs(String str, String str2) {
        this.al.runOnUiThread(new ac(this, str, str2));
    }

    public aa ft() {
        return this.af;
    }

    public aa fw() {
        return this.af;
    }

    public void fx(String str, String str2, String str3) {
        if (this.af == null) {
            try {
                this.af = new ag(str, str2, str3, this.al);
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        }
    }
}
