package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.UUID;

/* renamed from: com.appsflyer.r */
final class C0000r {
    /* renamed from: ˋ */
    private static String f218;

    C0000r() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A:{SYNTHETIC, Splitter:B:26:0x003a} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030 A:{SYNTHETIC, Splitter:B:19:0x0030} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A:{SYNTHETIC, Splitter:B:26:0x003a} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030 A:{SYNTHETIC, Splitter:B:19:0x0030} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0057 A:{Splitter:B:3:0x0008, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:38:0x0057, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:39:0x0059, code skipped:
            r1 = e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ˊ */
    private static String m163(File file) {
        Throwable e;
        byte[] bArr;
        Throwable th;
        byte[] bArr2 = null;
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                bArr2 = new byte[((int) randomAccessFile.length())];
                randomAccessFile.readFully(bArr2);
                randomAccessFile.close();
                try {
                    randomAccessFile.close();
                } catch (IOException e2) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e2);
                }
            } catch (IOException e3) {
                e = e3;
                bArr = bArr2;
                try {
                    AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
                    if (randomAccessFile != null) {
                    }
                    bArr2 = bArr;
                    if (bArr2 == null) {
                    }
                    return new String(bArr2);
                } catch (Throwable th2) {
                    e = th2;
                    th2 = e;
                    if (randomAccessFile != null) {
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
            }
        } catch (IOException e4) {
            e = e4;
            randomAccessFile = bArr2;
            bArr = bArr2;
            AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e5) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e5);
                }
            }
            bArr2 = bArr;
            if (bArr2 == null) {
            }
            return new String(bArr2);
        } catch (Throwable th4) {
            e = th4;
            randomAccessFile = bArr2;
            th2 = e;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e22) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e22);
                }
            }
            throw th2;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return new String(bArr2);
    }

    /* renamed from: ˏ */
    public static String m164(WeakReference<Context> weakReference) {
        String str = null;
        synchronized (C0000r.class) {
            try {
                if (weakReference.get() == null) {
                    str = f218;
                } else {
                    if (f218 == null) {
                        if (weakReference.get() != null) {
                            str = AppsFlyerLib.m57((Context) weakReference.get()).getString("AF_INSTALLATION", null);
                        }
                        if (str != null) {
                            f218 = str;
                        } else {
                            File file = new File(((Context) weakReference.get()).getFilesDir(), "AF_INSTALLATION");
                            if (file.exists()) {
                                f218 = C0000r.m163(file);
                                file.delete();
                            } else {
                                if (VERSION.SDK_INT >= 9) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(currentTimeMillis);
                                    stringBuilder.append("-");
                                    stringBuilder.append(Math.abs(new SecureRandom().nextLong()));
                                    str = stringBuilder.toString();
                                } else {
                                    str = UUID.randomUUID().toString();
                                }
                                f218 = str;
                            }
                            String str2 = f218;
                            Editor edit = AppsFlyerLib.m57((Context) weakReference.get()).edit();
                            edit.putString("AF_INSTALLATION", str2);
                            if (VERSION.SDK_INT >= 9) {
                                edit.apply();
                            } else {
                                edit.commit();
                            }
                        }
                        if (f218 != null) {
                            AppsFlyerProperties.getInstance().set("uid", f218);
                        }
                    }
                    str = f218;
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("Error getting AF unique ID", e);
            } catch (Throwable th) {
                Class cls = C0000r.class;
            }
        }
        return str;
    }
}
