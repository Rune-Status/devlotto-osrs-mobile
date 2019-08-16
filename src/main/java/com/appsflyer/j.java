package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

final class j implements Runnable {
    /* renamed from: ʻ */
    private static String f173;
    /* renamed from: ʼ */
    private String f174;
    /* renamed from: ʽ */
    private final Intent f175;
    /* renamed from: ˊ */
    private String f176;
    /* renamed from: ˋ */
    private String f177;
    /* renamed from: ˎ */
    private String f178;
    /* renamed from: ˏ */
    private String f179;
    /* renamed from: ॱ */
    private WeakReference<Context> f180;
    /* renamed from: ॱॱ */
    private String f181;
    /* renamed from: ᐝ */
    private Map<String, String> f182;

    static {
        StringBuilder stringBuilder = new StringBuilder("https://%svalidate.%s/api/v");
        stringBuilder.append(AppsFlyerLib.f67);
        stringBuilder.append("/androidevent?buildnumber=4.9.0&app_id=");
        f173 = stringBuilder.toString();
    }

    j(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, @Nullable Intent intent) {
        this.f180 = new WeakReference(context);
        this.f179 = str;
        this.f176 = str2;
        this.f177 = str4;
        this.f174 = str5;
        this.f181 = str6;
        this.f182 = map;
        this.f178 = str3;
        this.f175 = intent;
    }

    /* renamed from: ॱ */
    private static HttpURLConnection m140(String str, String str2) throws IOException {
        try {
            o oVar = new o(null, AppsFlyerLib.getInstance().isTrackingStopped());
            oVar.f200 = str;
            oVar.m153();
            StringBuilder stringBuilder;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                stringBuilder = new StringBuilder("Main thread detected. Calling ");
                stringBuilder.append(str2);
                stringBuilder.append(" in a new thread.");
                AFLogger.afDebugLog(stringBuilder.toString());
                oVar.execute(new String[]{str2});
            } else {
                stringBuilder = new StringBuilder("Calling ");
                stringBuilder.append(str2);
                stringBuilder.append(" (on current thread: ");
                stringBuilder.append(Thread.currentThread().toString());
                stringBuilder.append(" )");
                AFLogger.afDebugLog(stringBuilder.toString());
                oVar.onPreExecute();
                oVar.onPostExecute(oVar.doInBackground(str2));
            }
            return oVar.m152();
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not send callStats request", th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void ॱ(j jVar, Map map, Map map2, WeakReference weakReference) {
        Throwable th;
        HttpURLConnection httpURLConnection = null;
        if (weakReference.get() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ServerConfigHandler.getUrl(f173));
            stringBuilder.append(((Context) weakReference.get()).getPackageName());
            String obj = stringBuilder.toString();
            SharedPreferences ˎ = AppsFlyerLib.m57((Context) weakReference.get());
            String string = ˎ.getString("referrer", httpURLConnection);
            if (string == null) {
                string = "";
            }
            Map ˎ2 = AppsFlyerLib.getInstance().m74((Context) weakReference.get(), jVar.f179, AFInAppEventType.PURCHASE, "", string, true, ˎ, false, jVar.f175, httpURLConnection);
            ˎ2.put(Param.PRICE, jVar.f174);
            ˎ2.put(Param.CURRENCY, jVar.f181);
            JSONObject jSONObject = new JSONObject(ˎ2);
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (Entry entry : map.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject.put("receipt_data", jSONObject2);
            } catch (JSONException e) {
                AFLogger.afErrorLog("Failed to build 'receipt_data'", e);
            }
            if (map2 != null) {
                jSONObject2 = new JSONObject();
                try {
                    for (Entry entry2 : map2.entrySet()) {
                        jSONObject2.put((String) entry2.getKey(), entry2.getValue());
                    }
                    jSONObject.put("extra_prms", jSONObject2);
                } catch (JSONException e2) {
                    AFLogger.afErrorLog("Failed to build 'extra_prms'", e2);
                }
            }
            String jSONObject3 = jSONObject.toString();
            s.m169().m176(obj, jSONObject3);
            try {
                httpURLConnection = m140(jSONObject3, obj);
                int i = -1;
                if (httpURLConnection != null) {
                    try {
                        i = httpURLConnection.getResponseCode();
                    } catch (Throwable th2) {
                        th = th2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                AppsFlyerLib.getInstance();
                String ˎ3 = AppsFlyerLib.m59(httpURLConnection);
                s.m169().m182(obj, i, ˎ3);
                jSONObject = new JSONObject(ˎ3);
                if (i == 200) {
                    StringBuilder stringBuilder2 = new StringBuilder("Validate-WH response - 200: ");
                    stringBuilder2.append(jSONObject.toString());
                    AFLogger.afInfoLog(stringBuilder2.toString());
                } else {
                    stringBuilder = new StringBuilder("Validate-WH response failed - ");
                    stringBuilder.append(i);
                    stringBuilder.append(": ");
                    stringBuilder.append(jSONObject.toString());
                    AFLogger.afWarnLog(stringBuilder.toString());
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: ॱ */
    private static void m141(boolean z, String str, String str2, String str3, String str4) {
        if (AppsFlyerLib.f66 != null) {
            StringBuilder stringBuilder = new StringBuilder("Validate callback parameters: ");
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(str2);
            stringBuilder.append(" ");
            stringBuilder.append(str3);
            AFLogger.afDebugLog(stringBuilder.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AppsFlyerLib.f66.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AppsFlyerLib.f66;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        Throwable th;
        HttpURLConnection httpURLConnection = null;
        if (this.f179 != null && this.f179.length() != 0 && !AppsFlyerLib.getInstance().isTrackingStopped()) {
            try {
                Context context = (Context) this.f180.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.f176);
                    hashMap.put("sig-data", this.f177);
                    hashMap.put("signature", this.f178);
                    final HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(hashMap);
                    Executors.newSingleThreadScheduledExecutor().schedule(new Runnable() {
                        public final void run() {
                            j.ॱ(j.this, hashMap2, j.this.f182, j.this.f180);
                        }
                    }, 5, TimeUnit.MILLISECONDS);
                    hashMap.put("dev_key", this.f179);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM));
                    String jSONObject = new JSONObject(hashMap).toString();
                    String url = ServerConfigHandler.getUrl("https://%ssdk-services.%s/validate-android-signature");
                    s.m169().m176(url, jSONObject);
                    httpURLConnection = m140(jSONObject, url);
                    int i = -1;
                    if (httpURLConnection != null) {
                        try {
                            i = httpURLConnection.getResponseCode();
                        } catch (Throwable th2) {
                            th = th2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    AppsFlyerLib.getInstance();
                    String ˎ = AppsFlyerLib.m59(httpURLConnection);
                    s.m169().m182(url, i, ˎ);
                    JSONObject jSONObject2 = new JSONObject(ˎ);
                    jSONObject2.put("code", i);
                    if (i == 200) {
                        StringBuilder stringBuilder = new StringBuilder("Validate response 200 ok: ");
                        stringBuilder.append(jSONObject2.toString());
                        AFLogger.afInfoLog(stringBuilder.toString());
                        m141(jSONObject2.optBoolean("result") ? jSONObject2.getBoolean("result") : false, this.f177, this.f174, this.f181, jSONObject2.toString());
                    } else {
                        AFLogger.afInfoLog("Failed Validate request");
                        m141(false, this.f177, this.f174, this.f181, jSONObject2.toString());
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (AppsFlyerLib.f66 != null) {
                        AFLogger.afErrorLog("Failed Validate request + ex", th);
                        m141(false, this.f177, this.f174, this.f181, th.getMessage());
                    }
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            }
        }
    }
}
