package com.appsflyer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_KEY = "AppsFlyerKey";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_FINGER_PRINT = "collectFingerPrint";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_MAC = "collectMAC";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String IS_MONITOR = "shouldMonitor";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    /* renamed from: ˏ */
    private static AppsFlyerProperties f96 = new AppsFlyerProperties();
    /* renamed from: ˊ */
    private boolean f97;
    /* renamed from: ˋ */
    private boolean f98;
    /* renamed from: ˎ */
    private Map<String, Object> f99 = Collections.synchronizedMap(new HashMap());
    /* renamed from: ॱ */
    private String f100;
    /* renamed from: ॱॱ */
    private boolean f101 = false;

    public enum EmailsCryptType {
        NONE(0),
        SHA1(1),
        MD5(2),
        SHA256(3);
        
        /* renamed from: ˋ */
        private final int f95;

        private EmailsCryptType(int i) {
            this.f95 = i;
        }

        public final int getValue() {
            return this.f95;
        }
    }

    private AppsFlyerProperties() {
    }

    public static AppsFlyerProperties getInstance() {
        return f96;
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        return string == null ? z : Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        return string == null ? i : Integer.valueOf(string).intValue();
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        return string == null ? j : Long.valueOf(string).longValue();
    }

    public Object getObject(String str) {
        return this.f99.get(str);
    }

    public String getReferrer(Context context) {
        return this.f100 != null ? this.f100 : getString("AF_REFERRER") != null ? getString("AF_REFERRER") : context != null ? AppsFlyerLib.m57(context).getString("referrer", null) : null;
    }

    public String getString(String str) {
        return (String) this.f99.get(str);
    }

    public boolean isEnableLog() {
        return getBoolean("shouldLog", true);
    }

    /* Access modifiers changed, original: protected */
    public boolean isFirstLaunchCalled() {
        return this.f97;
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    /* Access modifiers changed, original: protected */
    public boolean isOnReceiveCalled() {
        return this.f98;
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public void loadProperties(Context context) {
        if (!this.f101) {
            String string = AppsFlyerLib.m57(context).getString("savedProperties", null);
            if (string != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        string = (String) keys.next();
                        if (this.f99.get(string) == null) {
                            this.f99.put(string, jSONObject.getString(string));
                        }
                    }
                    this.f101 = true;
                } catch (JSONException e) {
                    AFLogger.afErrorLog("Failed loading properties", e);
                }
                StringBuilder stringBuilder = new StringBuilder("Done loading properties: ");
                stringBuilder.append(this.f101);
                AFLogger.afDebugLog(stringBuilder.toString());
            }
        }
    }

    public void remove(String str) {
        this.f99.remove(str);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void saveProperties(SharedPreferences sharedPreferences) {
        String jSONObject = new JSONObject(this.f99).toString();
        Editor edit = sharedPreferences.edit();
        edit.putString("savedProperties", jSONObject);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    public void set(String str, int i) {
        this.f99.put(str, Integer.toString(i));
    }

    public void set(String str, long j) {
        this.f99.put(str, Long.toString(j));
    }

    public void set(String str, String str2) {
        this.f99.put(str, str2);
    }

    public void set(String str, boolean z) {
        this.f99.put(str, Boolean.toString(z));
    }

    public void set(String str, String[] strArr) {
        this.f99.put(str, strArr);
    }

    public void setCustomData(String str) {
        this.f99.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    /* Access modifiers changed, original: protected */
    public void setFirstLaunchCalled() {
        this.f97 = true;
    }

    /* Access modifiers changed, original: protected */
    public void setFirstLaunchCalled(boolean z) {
        this.f97 = z;
    }

    /* Access modifiers changed, original: protected */
    public void setOnReceiveCalled() {
        this.f98 = true;
    }

    /* Access modifiers changed, original: protected */
    public void setReferrer(String str) {
        set("AF_REFERRER", str);
        this.f100 = str;
    }

    public void setUserEmails(String str) {
        this.f99.put(USER_EMAILS, str);
    }
}
