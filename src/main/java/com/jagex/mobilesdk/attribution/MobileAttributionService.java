package com.jagex.mobilesdk.attribution;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import java.util.HashMap;
import java.util.Map;

public final class MobileAttributionService {
    private static final String INSTALL_CONVERSION_DATA_LOADED = "af_started_first_time";

    private MobileAttributionService() {
    }

    public static void init(@NonNull final Activity activity, String str) {
        AppsFlyerLib.getInstance().init(str, new AppsFlyerConversionListener() {
            public void onAppOpenAttribution(Map<String, String> map) {
            }

            public void onAttributionFailure(String str) {
            }

            public void onInstallConversionDataLoaded(Map<String, String> map) {
                if (((String) map.get("is_first_launch")).equals("true")) {
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(map);
                    MobileAttributionService.sendEvent(activity, MobileAttributionService.INSTALL_CONVERSION_DATA_LOADED, hashMap);
                }
            }

            public void onInstallConversionFailure(String str) {
            }
        }, activity.getApplicationContext());
        AppsFlyerLib.getInstance().setCollectIMEI(false);
        AppsFlyerLib.getInstance().setCollectAndroidID(false);
        AppsFlyerLib.getInstance().startTracking(activity.getApplication());
        AppsFlyerLib.getInstance().trackAppLaunch(activity.getApplicationContext(), str);
    }

    public static void sendEvent(@NonNull Activity activity, @NonNull String str, Map<String, Object> map) {
        AppsFlyerLib.getInstance().trackEvent(activity.getApplicationContext(), str, map);
    }

    public static void setUserID(@NonNull String str) {
        AppsFlyerLib.getInstance().setCustomerUserId(str);
    }
}
