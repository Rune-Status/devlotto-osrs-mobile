package com.appsflyer.share;

import android.content.Context;
import android.os.AsyncTask;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.ServerParameters;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class CrossPromotionHelper {

    static final class c extends AsyncTask<String, Void, Void> {
        /* renamed from: ˊ */
        private d f251;
        /* renamed from: ˎ */
        private WeakReference<Context> f252;
        /* renamed from: ॱ */
        private boolean f253;

        c(d dVar, Context context, boolean z) {
            this.f251 = dVar;
            this.f252 = new WeakReference(context);
            this.f253 = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
        /* JADX WARNING: Missing block: B:11:0x0033, code skipped:
            if (r0 != null) goto L_0x0035;
     */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: ˎ */
        private Void m186(String... strArr) {
            Throwable th;
            HttpURLConnection httpURLConnection;
            Throwable th2;
            HttpURLConnection httpURLConnection2 = null;
            if (!this.f253) {
                String str = strArr[0];
                HttpURLConnection httpURLConnection3;
                try {
                    httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection3.setConnectTimeout(10000);
                        httpURLConnection3.setInstanceFollowRedirects(false);
                        int responseCode = httpURLConnection3.getResponseCode();
                        if (responseCode == 200) {
                            AFLogger.afInfoLog("Cross promotion impressions success: ".concat(String.valueOf(str)), false);
                        } else if (responseCode == 301 || responseCode == 302) {
                            AFLogger.afInfoLog("Cross promotion redirection success: ".concat(String.valueOf(str)), false);
                            if (!(this.f251 == null || this.f252.get() == null)) {
                                this.f251.m192(httpURLConnection3.getHeaderField(Constants.HTTP_REDIRECT_URL_HEADER_FIELD));
                                this.f251.m193((Context) this.f252.get());
                            }
                        } else {
                            StringBuilder stringBuilder = new StringBuilder("call to ");
                            stringBuilder.append(str);
                            stringBuilder.append(" failed: ");
                            stringBuilder.append(responseCode);
                            AFLogger.afInfoLog(stringBuilder.toString());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection = httpURLConnection3;
                        httpURLConnection2 = httpURLConnection;
                        th2 = th;
                        if (httpURLConnection2 != null) {
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (httpURLConnection2 != null) {
                    }
                    throw th2;
                }
            }
            return null;
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m186((String[]) objArr);
        }
    }

    public static void trackAndOpenStore(Context context, String str, String str2) {
        trackAndOpenStore(context, str, str2, null);
    }

    public static void trackAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator ˋ = m187(context, str, str2, map, ServerConfigHandler.getUrl(Constants.BASE_URL_APP_APPSFLYER_COM));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("af_campaign", str2);
        AppsFlyerLib.getInstance().trackEvent(context, "af_cross_promotion", hashMap);
        new c(new d(), context, AppsFlyerLib.getInstance().isTrackingStopped()).execute(new String[]{ˋ.generateLink()});
    }

    public static void trackCrossPromoteImpression(Context context, String str, String str2) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
            return;
        }
        LinkGenerator ˋ = m187(context, str, str2, null, ServerConfigHandler.getUrl("https://%simpression.%s"));
        new c(null, null, AppsFlyerLib.getInstance().isTrackingStopped()).execute(new String[]{ˋ.generateLink()});
    }

    /* renamed from: ˋ */
    private static LinkGenerator m187(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.m190(str3).m191(str).addParameter(Constants.URL_SITE_ID, context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
        if (string != null) {
            linkGenerator.addParameter(Constants.URL_ADVERTISING_ID, string);
        }
        return linkGenerator;
    }
}
