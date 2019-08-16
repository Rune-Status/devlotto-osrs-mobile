package com.appsflyer;

import android.text.TextUtils;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

public abstract class OneLinkHttpTask implements Runnable {
    /* renamed from: ˊ */
    String f102;
    /* renamed from: ˋ */
    private HttpsUrlConnectionProvider f103;
    /* renamed from: ॱ */
    private AppsFlyerLib f104;

    public static class HttpsUrlConnectionProvider {
        /* renamed from: ॱ */
        static HttpsURLConnection m88(String str) throws IOException {
            return (HttpsURLConnection) new URL(str).openConnection();
        }
    }

    OneLinkHttpTask(AppsFlyerLib appsFlyerLib) {
        this.f104 = appsFlyerLib;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        Throwable th;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        CharSequence charSequence = "";
        String ॱ = m83();
        AFLogger.afRDLog("oneLinkUrl: ".concat(String.valueOf(ॱ)));
        Object ˎ;
        try {
            HttpURLConnection ॱ2 = HttpsUrlConnectionProvider.m88(ॱ);
            ॱ2.addRequestProperty("content-type", CommsUtils.HTTP_HEADER_ACCEPT_JSON);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
            stringBuilder.append(currentTimeMillis);
            ॱ2.addRequestProperty("authorization", p.m155(stringBuilder.toString()));
            ॱ2.addRequestProperty("af-timestamp", String.valueOf(currentTimeMillis));
            ॱ2.setReadTimeout(3000);
            ॱ2.setConnectTimeout(3000);
            m81(ॱ2);
            int responseCode = ॱ2.getResponseCode();
            ˎ = AppsFlyerLib.m59(ॱ2);
            if (responseCode == 200) {
                try {
                    AFLogger.afInfoLog("Status 200 ok");
                } catch (Throwable th2) {
                    th = th2;
                }
                if (TextUtils.isEmpty(charSequence)) {
                    AFLogger.afInfoLog("Connection call succeeded: ".concat(String.valueOf(ˎ)));
                    m82(ˎ);
                    return;
                }
                AFLogger.afWarnLog("Connection error: ".concat(String.valueOf(charSequence)));
                m80();
                return;
            }
            StringBuilder stringBuilder2 = new StringBuilder("Response code = ");
            stringBuilder2.append(responseCode);
            stringBuilder2.append(" content = ");
            stringBuilder2.append(ˎ);
            charSequence = stringBuilder2.toString();
            if (TextUtils.isEmpty(charSequence)) {
            }
        } catch (Throwable th3) {
            th = th3;
            ˎ = "";
            AFLogger.afErrorLog("Error while calling ".concat(String.valueOf(ॱ)), th);
            StringBuilder stringBuilder3 = new StringBuilder("Error while calling ");
            stringBuilder3.append(ॱ);
            stringBuilder3.append(" stacktrace: ");
            stringBuilder3.append(th.toString());
            charSequence = stringBuilder3.toString();
            if (TextUtils.isEmpty(charSequence)) {
            }
        }
    }

    public void setConnProvider(HttpsUrlConnectionProvider httpsUrlConnectionProvider) {
        this.f103 = httpsUrlConnectionProvider;
    }

    /* renamed from: ˊ */
    public abstract void m80();

    /* renamed from: ˎ */
    public abstract void m81(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    /* renamed from: ˏ */
    public abstract void m82(String str);

    /* renamed from: ॱ */
    public abstract String m83();
}
