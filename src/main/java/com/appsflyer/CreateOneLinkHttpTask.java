package com.appsflyer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.appsflyer.share.Constants;
import com.appsflyer.share.LinkGenerator;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateOneLinkHttpTask extends OneLinkHttpTask {
    /* renamed from: ʻ */
    private Context f105;
    /* renamed from: ʽ */
    private boolean f106 = false;
    /* renamed from: ˋ */
    private String f107 = "";
    /* renamed from: ˎ */
    private String f108;
    /* renamed from: ˏ */
    private Map<String, String> f109;
    /* renamed from: ॱ */
    private ResponseListener f110;

    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(@NonNull String str, @NonNull Map<String, String> map, AppsFlyerLib appsFlyerLib, @NonNull Context context, boolean z) {
        super(appsFlyerLib);
        this.f106 = z;
        this.f105 = context;
        if (this.f105 != null) {
            this.f107 = context.getPackageName();
        } else {
            AFLogger.afWarnLog("CreateOneLinkHttpTask: context can't be null");
        }
        this.f102 = str;
        this.f108 = "-1";
        this.f109 = map;
    }

    public void setListener(@NonNull ResponseListener responseListener) {
        this.f110 = responseListener;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˊ */
    public final void m84() {
        LinkGenerator addParameters = new LinkGenerator(Constants.USER_INVITE_LINK_TYPE).setBaseURL(this.f102, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN), this.f107).addParameter(Constants.URL_SITE_ID, this.f107).addParameters(this.f109);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            addParameters.setReferrerCustomerId(string);
        }
        this.f110.onResponse(addParameters.generateLink());
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˎ */
    public final void m85(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        if (!this.f106) {
            httpsURLConnection.setRequestMethod(CommsUtils.HTTP_ACTION_POST);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject(this.f109);
            jSONObject.put("ttl", this.f108);
            jSONObject.put("data", jSONObject2);
            httpsURLConnection.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
            dataOutputStream.writeBytes(jSONObject.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final void m86(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.f110.onResponse(jSONObject.optString((String) keys.next()));
            }
        } catch (JSONException e) {
            this.f110.onResponseError("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ॱ */
    public final String m87() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1"));
        stringBuilder.append(Constants.URL_PATH_DELIMITER);
        stringBuilder.append(this.f102);
        return stringBuilder.toString();
    }
}
