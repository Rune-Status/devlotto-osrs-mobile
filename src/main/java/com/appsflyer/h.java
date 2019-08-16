package com.appsflyer;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.os.EnvironmentCompat;
import android.telephony.TelephonyManager;

final class h {

    static final class a {
        /* renamed from: ˊ */
        private static String f149;
        /* renamed from: ˏ */
        private static String f150;
        /* renamed from: ˋ */
        private final String f151;
        /* renamed from: ˎ */
        private final String f152;
        /* renamed from: ॱ */
        private final String f153;

        a() {
        }

        a(@NonNull String str, @Nullable String str2, @Nullable String str3) {
            this.f152 = str;
            this.f153 = str2;
            this.f151 = str3;
        }

        /* renamed from: ˋ */
        static void m129(String str) {
            if (f150 == null) {
                m130(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
            }
            if (f150 != null && str.contains(f150)) {
                AFLogger.afInfoLog(str.replace(f150, f149));
            }
        }

        /* renamed from: ˏ */
        static void m130(String str) {
            f150 = str;
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            while (i < str.length()) {
                if (i == 0 || i == str.length() - 1) {
                    stringBuilder.append(str.charAt(i));
                } else {
                    stringBuilder.append("*");
                }
                i++;
            }
            f149 = stringBuilder.toString();
        }

        /* Access modifiers changed, original: final */
        /* renamed from: ˋ */
        public final String m131() {
            return this.f152;
        }

        /* Access modifiers changed, original: final */
        @Nullable
        /* renamed from: ˏ */
        public final String m132() {
            return this.f151;
        }

        /* Access modifiers changed, original: final */
        @Nullable
        /* renamed from: ॱ */
        public final String m133() {
            return this.f153;
        }
    }

    static final class d {
        /* renamed from: ˏ */
        static final h f154 = new h();
    }

    h() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049 A:{SYNTHETIC, Splitter:B:22:0x0049} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049 A:{SYNTHETIC, Splitter:B:22:0x0049} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049 A:{SYNTHETIC, Splitter:B:22:0x0049} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Missing block: B:24:0x004d, code skipped:
            if (r2.isEmpty() != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ˊ */
    static a m134(@NonNull Context context) {
        String simOperatorName;
        String networkOperatorName;
        Throwable th;
        String str = EnvironmentCompat.MEDIA_UNKNOWN;
        try {
            TelephonyManager telephonyManager;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Object obj;
                if (21 <= VERSION.SDK_INT) {
                    for (Network networkInfo : connectivityManager.getAllNetworks()) {
                        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(networkInfo);
                        obj = (networkInfo2 == null || !networkInfo2.isConnectedOrConnecting()) ? null : 1;
                        if (obj != null) {
                            str = 1 == networkInfo2.getType() ? "WIFI" : networkInfo2.getType() == 0 ? "MOBILE" : EnvironmentCompat.MEDIA_UNKNOWN;
                            telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            simOperatorName = telephonyManager.getSimOperatorName();
                            networkOperatorName = telephonyManager.getNetworkOperatorName();
                            if (networkOperatorName != null) {
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    AFLogger.afErrorLog("Exception while collecting network info. ", th);
                                    return new a(str, networkOperatorName, simOperatorName);
                                }
                            }
                            if (2 == telephonyManager.getPhoneType()) {
                                networkOperatorName = "CDMA";
                            }
                            return new a(str, networkOperatorName, simOperatorName);
                        }
                    }
                    str = EnvironmentCompat.MEDIA_UNKNOWN;
                    telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    simOperatorName = telephonyManager.getSimOperatorName();
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    if (networkOperatorName != null) {
                    }
                    if (2 == telephonyManager.getPhoneType()) {
                    }
                    return new a(str, networkOperatorName, simOperatorName);
                }
                NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(1);
                obj = (networkInfo3 == null || !networkInfo3.isConnectedOrConnecting()) ? null : 1;
                if (obj != null) {
                    str = "WIFI";
                } else {
                    networkInfo3 = connectivityManager.getNetworkInfo(0);
                    obj = (networkInfo3 == null || !networkInfo3.isConnectedOrConnecting()) ? null : 1;
                    if (obj != null) {
                        str = "MOBILE";
                    } else {
                        networkInfo3 = connectivityManager.getActiveNetworkInfo();
                        Object obj2 = (networkInfo3 == null || !networkInfo3.isConnectedOrConnecting()) ? null : 1;
                        if (obj2 != null) {
                            if (1 == networkInfo3.getType()) {
                                str = "WIFI";
                            } else if (networkInfo3.getType() == 0) {
                                str = "MOBILE";
                            }
                        }
                    }
                }
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
                simOperatorName = telephonyManager.getSimOperatorName();
                networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (networkOperatorName != null) {
                }
                if (2 == telephonyManager.getPhoneType()) {
                }
                return new a(str, networkOperatorName, simOperatorName);
            }
            str = EnvironmentCompat.MEDIA_UNKNOWN;
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            simOperatorName = telephonyManager.getSimOperatorName();
            try {
                networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (networkOperatorName != null) {
                }
                if (2 == telephonyManager.getPhoneType()) {
                }
            } catch (Throwable th3) {
                th = th3;
                networkOperatorName = null;
            }
        } catch (Throwable th4) {
            th = th4;
            networkOperatorName = null;
            simOperatorName = null;
        }
        return new a(str, networkOperatorName, simOperatorName);
    }
}
