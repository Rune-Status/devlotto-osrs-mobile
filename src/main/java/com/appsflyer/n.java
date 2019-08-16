package com.appsflyer;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings.Secure;
import com.appsflyer.share.Constants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Map;

final class n {

    static final class e extends IllegalStateException {
        e(String str) {
            super(str);
        }
    }

    n() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e2 A:{SYNTHETIC, Splitter:B:30:0x00e2} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085 A:{SKIP} */
    /* JADX WARNING: Missing block: B:13:0x0034, code skipped:
            if (r1.length() == 0) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ˎ */
    static void m148(Context context, Map<String, Object> map) {
        int isGooglePlayServicesAvailable;
        Throwable th;
        boolean z = true;
        AFLogger.afInfoLog("Trying to fetch GAID..");
        StringBuilder stringBuilder = new StringBuilder();
        try {
            isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            isGooglePlayServicesAvailable = -1;
        }
        boolean z2 = false;
        String id;
        String bool;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                id = advertisingIdInfo.getId();
                try {
                    bool = Boolean.toString(advertisingIdInfo.isLimitAdTrackingEnabled() ^ 1);
                    if (id != null) {
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            z2 = true;
                            AFLogger.afErrorLog(th.getMessage(), th);
                            stringBuilder.append(th.getClass().getSimpleName());
                            stringBuilder.append(" |");
                            AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
                            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                                z = z2;
                            } else {
                                try {
                                    b ॱ = f.m119(context);
                                    id = ॱ.m114();
                                    bool = Boolean.toString(ॱ.m115() ^ 1);
                                    if (id == null || id.length() == 0) {
                                        stringBuilder.append("emptyOrNull (bypass) |");
                                        z = z2;
                                    } else {
                                        z = z2;
                                    }
                                } catch (Throwable th4) {
                                    Throwable th5 = th4;
                                    AFLogger.afErrorLog(th5.getMessage(), th5);
                                    stringBuilder.append(th5.getClass().getSimpleName());
                                    stringBuilder.append(" |");
                                    id = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
                                    bool = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
                                    if (th5.getLocalizedMessage() != null) {
                                        AFLogger.afInfoLog(th5.getLocalizedMessage());
                                        z = z2;
                                    } else {
                                        AFLogger.afInfoLog(th5.toString());
                                        z = z2;
                                    }
                                }
                            }
                            if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                            }
                            if (stringBuilder.length() > 0) {
                            }
                            if (id == null) {
                                return;
                            }
                            return;
                        }
                    }
                    stringBuilder.append("emptyOrNull |");
                } catch (Throwable th6) {
                    th = th6;
                    bool = null;
                }
                if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                    id = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
                    bool = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
                    stringBuilder.append("context = android.app.ReceiverRestrictedContext |");
                }
                if (stringBuilder.length() > 0) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(isGooglePlayServicesAvailable);
                    stringBuilder2.append(": ");
                    stringBuilder2.append(stringBuilder);
                    map.put("gaidError", stringBuilder2.toString());
                }
                if (id == null && bool != null) {
                    map.put(ServerParameters.ADVERTISING_ID_PARAM, id);
                    map.put("advertiserIdEnabled", bool);
                    AppsFlyerProperties.getInstance().set(ServerParameters.ADVERTISING_ID_PARAM, id);
                    AppsFlyerProperties.getInstance().set("advertiserIdEnabled", bool);
                    map.put("isGaidWithGps", String.valueOf(z));
                    return;
                }
                return;
            }
            stringBuilder.append("gpsAdInfo-null |");
            throw new e("GpsAdIndo is null");
        } catch (Throwable th7) {
            th = th7;
            id = null;
            bool = null;
            AFLogger.afErrorLog(th.getMessage(), th);
            stringBuilder.append(th.getClass().getSimpleName());
            stringBuilder.append(" |");
            AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
            }
            if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
            }
            if (stringBuilder.length() > 0) {
            }
            if (id == null) {
            }
        }
    }

    /* renamed from: ॱ */
    static l m149(ContentResolver contentResolver) {
        if (contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new l(e.AMAZON, Secure.getString(contentResolver, Constants.URL_ADVERTISING_ID), false);
        } else if (i == 2) {
            return null;
        } else {
            String string;
            try {
                string = Secure.getString(contentResolver, Constants.URL_ADVERTISING_ID);
            } catch (Throwable th) {
                AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                string = "";
            }
            return new l(e.AMAZON, string, true);
        }
    }
}
