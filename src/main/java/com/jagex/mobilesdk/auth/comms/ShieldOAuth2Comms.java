package com.jagex.mobilesdk.auth.comms;

import android.os.AsyncTask;
import com.jagex.mobilesdk.auth.AppAuthConverter;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class ShieldOAuth2Comms extends AsyncTask<Void, Void, JSONObject> {
    private final ShieldOAuth2Callback callback;
    private Exception exception;
    private final Map<String, String> headers;
    private final Map<String, String> params;
    private int responseCode;
    private final String url;

    public interface ShieldOAuth2Callback {
        void onShieldOAuth2Result(CommsResult<MobileAuthState> commsResult, Exception exception);
    }

    ShieldOAuth2Comms(String str, Map<String, String> map, Map<String, String> map2, ShieldOAuth2Callback shieldOAuth2Callback) {
        this.url = str;
        this.headers = map;
        this.callback = shieldOAuth2Callback;
        this.params = map2;
    }

    /* Access modifiers changed, original: protected|varargs */
    public JSONObject doInBackground(Void... voidArr) {
        return shieldOAuth2Action(this.url, this.headers, this.params);
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(JSONObject jSONObject) {
        shieldOAuth2PostAction(jSONObject, this.callback);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JSONObject shieldOAuth2Action(String str, Map<String, String> map, Map<String, String> map2) {
        Exception e;
        HttpsURLConnection httpsURLConnection;
        Throwable th;
        Throwable th2;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            HttpsURLConnection httpsURLConnection3 = (HttpsURLConnection) new URL(str).openConnection();
            try {
                httpsURLConnection3.setRequestMethod(CommsUtils.HTTP_ACTION_POST);
                httpsURLConnection3.setDoOutput(true);
                for (Entry entry : map.entrySet()) {
                    httpsURLConnection3.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                String formUrlEncode = CommsUtils.formUrlEncode(map2);
                httpsURLConnection3.setRequestProperty(CommsUtils.HTTP_HEADER_CONTENT_LENGTH, String.valueOf(formUrlEncode.length()));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection3.getOutputStream());
                outputStreamWriter.write(formUrlEncode);
                outputStreamWriter.flush();
                httpsURLConnection3.connect();
                this.responseCode = httpsURLConnection3.getResponseCode();
                if (this.responseCode == 200) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection3.getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(readLine);
                        stringBuilder2.append(10);
                        stringBuilder.append(stringBuilder2.toString());
                    }
                    JSONObject jSONObject = new JSONObject(stringBuilder.toString());
                    if (httpsURLConnection3 != null) {
                        httpsURLConnection3.disconnect();
                    }
                    return jSONObject;
                }
                this.exception = new Exception(CommsUtils.ERROR_INVALID_HTTP_RESPONSE);
                if (httpsURLConnection3 == null) {
                    return null;
                }
                httpsURLConnection3.disconnect();
                return null;
            } catch (Exception e2) {
                e = e2;
                httpsURLConnection = httpsURLConnection3;
                try {
                    this.exception = e;
                    if (httpsURLConnection != null) {
                        return null;
                    }
                    httpsURLConnection3 = httpsURLConnection;
                    httpsURLConnection3.disconnect();
                    return null;
                } catch (Throwable th22) {
                    th = th22;
                    httpsURLConnection2 = httpsURLConnection;
                    th22 = th;
                    if (httpsURLConnection2 != null) {
                    }
                    throw th22;
                }
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = httpsURLConnection3;
                httpsURLConnection2 = httpsURLConnection;
                th22 = th;
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                }
                throw th22;
            }
        } catch (Exception e3) {
            e = e3;
            httpsURLConnection = null;
            this.exception = e;
            if (httpsURLConnection != null) {
            }
        } catch (Throwable th4) {
            th22 = th4;
            if (httpsURLConnection2 != null) {
            }
            throw th22;
        }
    }

    public void shieldOAuth2PostAction(JSONObject jSONObject, ShieldOAuth2Callback shieldOAuth2Callback) {
        MobileAuthState mobileAuthState = new MobileAuthState();
        if (jSONObject != null) {
            try {
                mobileAuthState.setAccessToken(jSONObject.getString(AppAuthConverter.APPAUTH_ACCESS_TOKEN_KEY));
                mobileAuthState.setRefreshToken(jSONObject.getString("refresh_token"));
                mobileAuthState.setAccessTokenExpiration(System.currentTimeMillis() + (jSONObject.getLong("expires_in") * 1000));
            } catch (JSONException e) {
                this.exception = e;
            }
        }
        shieldOAuth2Callback.onShieldOAuth2Result(new CommsResult(mobileAuthState, CommsUtils.mapResponseCode(this.responseCode)), this.exception);
    }
}
