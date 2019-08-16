package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import com.appsflyer.share.Constants;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class AFDeepLinkManager {
    /* renamed from: ʽ */
    private static Uri f7 = null;
    /* renamed from: ˊ */
    static String[] f8;
    /* renamed from: ˋ */
    private static Uri f9 = null;
    /* renamed from: ˎ */
    private static AFDeepLinkManager f10 = null;
    /* renamed from: ˏ */
    static final int f11 = ((int) TimeUnit.MILLISECONDS.toMillis(1500));
    /* renamed from: ॱ */
    static volatile boolean f12;
    protected int currentActivityHash = -1;

    private AFDeepLinkManager() {
    }

    public static AFDeepLinkManager getInstance() {
        if (f10 == null) {
            f10 = new AFDeepLinkManager();
        }
        return f10;
    }

    /* renamed from: ˏ */
    private void m6(final Context context, final Map<String, Object> map, final Uri uri) {
        StringBuilder stringBuilder;
        boolean z;
        String obj = uri.toString();
        if (f8 != null) {
            stringBuilder = new StringBuilder("Validate ESP deeplinks : ");
            stringBuilder.append(Arrays.asList(f8));
            AFLogger.afRDLog(stringBuilder.toString());
            if (!obj.contains("af_tranid=")) {
                for (String str : Arrays.asList(f8)) {
                    if (obj.contains("://".concat(String.valueOf(str)))) {
                        z = true;
                        break;
                    }
                    AFLogger.afRDLog("Validate ESP: reject ".concat(String.valueOf(str)));
                }
            }
        }
        z = false;
        if (z) {
            stringBuilder = new StringBuilder("Validation ESP succeeded for: ");
            stringBuilder.append(uri.toString());
            AFLogger.afRDLog(stringBuilder.toString());
            f12 = true;
            AFExecutor.getInstance().getSerialExecutor().execute(new Runnable() {
                /* renamed from: ॱ */
                static void m5(Context context) {
                    Context applicationContext = context.getApplicationContext();
                    AFLogger.afInfoLog("onBecameBackground");
                    AppsFlyerLib.getInstance().m78();
                    AFLogger.afInfoLog("callStatsBackground background call");
                    AppsFlyerLib.getInstance().m77(new WeakReference(applicationContext));
                    s ˏ = s.m169();
                    if (ˏ.m174()) {
                        ˏ.m175();
                        if (applicationContext != null) {
                            s.m166(applicationContext.getPackageName(), applicationContext.getPackageManager());
                        }
                        ˏ.m184();
                    } else {
                        AFLogger.afDebugLog("RD status is OFF");
                    }
                    AFExecutor.getInstance().m9();
                }

                public final void run() {
                    StringBuilder stringBuilder;
                    long currentTimeMillis;
                    Uri uri = null;
                    HashMap hashMap = new HashMap();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    try {
                        stringBuilder = new StringBuilder("ESP deeplink resoling is started: ");
                        stringBuilder.append(uri.toString());
                        AFLogger.afRDLog(stringBuilder.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setReadTimeout(AFDeepLinkManager.f11);
                        httpURLConnection.setConnectTimeout(AFDeepLinkManager.f11);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.connect();
                        AFLogger.afRDLog("ESP deeplink resoling is finished");
                        hashMap.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(httpURLConnection.getResponseCode()));
                        if (httpURLConnection.getResponseCode() >= 300 && httpURLConnection.getResponseCode() <= 305) {
                            uri = Uri.parse(httpURLConnection.getHeaderField(Constants.HTTP_REDIRECT_URL_HEADER_FIELD));
                        }
                        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                        httpURLConnection.disconnect();
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        hashMap.put(NotificationCompat.CATEGORY_STATUS, "-1");
                        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                    }
                    hashMap.put("latency", Long.toString(currentTimeMillis));
                    if (uri != null) {
                        hashMap.put("res", uri.toString());
                    } else {
                        hashMap.put("res", "");
                    }
                    stringBuilder = new StringBuilder("ESP deeplink results: ");
                    stringBuilder.append(new JSONObject(hashMap).toString());
                    AFLogger.afRDLog(stringBuilder.toString());
                    synchronized (map) {
                        map.put("af_deeplink_r", hashMap);
                        map.put("af_deeplink", uri.toString());
                    }
                    AFDeepLinkManager.f12 = false;
                    if (uri == null) {
                        uri = uri;
                    }
                    AppsFlyerLib.getInstance().handleDeepLinkCallback(context, map, uri);
                }
            });
            return;
        }
        AppsFlyerLib.getInstance().handleDeepLinkCallback(context, map, uri);
    }

    /* Access modifiers changed, original: protected */
    public void collectIntentsFromActivities(Intent intent) {
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        if (data != null && intent.getData() != f7) {
            f7 = intent.getData();
        }
    }

    /* Access modifiers changed, original: protected */
    public void processIntentForDeepLink(Intent intent, Context context, Map<String, Object> map) {
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        StringBuilder stringBuilder;
        if (data != null) {
            boolean z = AppsFlyerProperties.getInstance().getBoolean("consumeAfDeepLink", false);
            boolean z2 = (intent.getFlags() & 4194304) == 0;
            if (intent.hasExtra("appsflyer_click_ts") && !z) {
                long longExtra = intent.getLongExtra("appsflyer_click_ts", 0);
                long j = AppsFlyerProperties.getInstance().getLong("appsflyer_click_consumed_ts", 0);
                if (longExtra == 0 || longExtra == j) {
                    StringBuilder stringBuilder2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
                    stringBuilder2.append(data.toString());
                    stringBuilder2.append(" w/Ex: ");
                    stringBuilder2.append(String.valueOf(longExtra));
                    AFLogger.afInfoLog(stringBuilder2.toString());
                    return;
                }
                m6(context, map, data);
                AppsFlyerProperties.getInstance().set("appsflyer_click_consumed_ts", longExtra);
            } else if (!z && !z2) {
                if (this.currentActivityHash != AppsFlyerProperties.getInstance().getInt("lastActivityHash", 0)) {
                    m6(context, map, data);
                    AppsFlyerProperties.getInstance().set("lastActivityHash", this.currentActivityHash);
                    return;
                }
                stringBuilder = new StringBuilder("skipping re-use of previously consumed deep link: ");
                stringBuilder.append(data.toString());
                stringBuilder.append(" w/hC: ");
                stringBuilder.append(String.valueOf(this.currentActivityHash));
                AFLogger.afInfoLog(stringBuilder.toString());
            } else if (f9 == null || !data.equals(f9)) {
                m6(context, map, data);
                f9 = data;
            } else {
                StringBuilder stringBuilder3 = new StringBuilder("skipping re-use of previously consumed deep link: ");
                stringBuilder3.append(data.toString());
                stringBuilder3.append(Boolean.valueOf(z2).booleanValue() ? " w/sT" : " w/cAPI");
                AFLogger.afInfoLog(stringBuilder3.toString());
            }
        } else if (f7 != null) {
            m6(context, map, f7);
            stringBuilder = new StringBuilder("using trampoline Intent fallback with URI : ");
            stringBuilder.append(f7.toString());
            AFLogger.afInfoLog(stringBuilder.toString());
            f7 = null;
        } else if (AppsFlyerLib.getInstance().latestDeepLink != null) {
            m6(context, map, AppsFlyerLib.getInstance().latestDeepLink);
        }
    }
}
