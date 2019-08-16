package com.appsflyer;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.appsflyer.share.Constants;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

final class t extends OneLinkHttpTask {
    /* renamed from: ˋ */
    private static List<String> f268 = Arrays.asList(new String[]{"onelink.me", "onelnk.com", "app.aflink.com"});
    /* renamed from: ˎ */
    private c f269;
    /* renamed from: ˏ */
    private String f270;

    interface c {
        /* renamed from: ˊ */
        void m25(Map<String, String> map);

        /* renamed from: ˏ */
        void m26(String str);
    }

    t(Uri uri, AppsFlyerLib appsFlyerLib) {
        super(appsFlyerLib);
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            int i = 0;
            for (String contains : f268) {
                if (uri.getHost().contains(contains)) {
                    i = 1;
                }
            }
            String[] split = uri.getPath().split(Constants.URL_PATH_DELIMITER);
            if (i != 0 && split.length == 3) {
                this.f102 = split[1];
                this.f270 = split[2];
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˊ */
    public final void m194() {
        this.f269.m26("Can't get one link data");
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˋ */
    public final void m195(@NonNull c cVar) {
        this.f269 = cVar;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˎ */
    public final void m196(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod(CommsUtils.HTTP_ACTION_GET);
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final void m197(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.optString(str2));
            }
            this.f269.m25(hashMap);
        } catch (JSONException e) {
            this.f269.m26("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final boolean m198() {
        return (TextUtils.isEmpty(this.f102) || TextUtils.isEmpty(this.f270)) ? false : true;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ॱ */
    public final String m199() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1"));
        stringBuilder.append(Constants.URL_PATH_DELIMITER);
        stringBuilder.append(this.f102);
        stringBuilder.append("?id=");
        stringBuilder.append(this.f270);
        return stringBuilder.toString();
    }
}
