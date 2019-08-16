package com.jagex.mobilesdk.auth.comms;

import android.os.AsyncTask;
import com.jagex.mobilesdk.auth.AppAuthConverter;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

public class RefreshComms extends AsyncTask<Void, Void, JSONObject> {
    private RefreshTokenCallback callback;
    private Exception exception;
    private Map<String, String> headers;
    private Map<String, String> params;
    private int responseCode;
    private String url;

    public interface RefreshTokenCallback {
        void onTokenResult(String str, Long l, String str2, Exception exception);
    }

    RefreshComms(String str, Map<String, String> map, Map<String, String> map2, RefreshTokenCallback refreshTokenCallback) {
        this.url = str;
        this.headers = map;
        this.callback = refreshTokenCallback;
        this.params = map2;
    }

    /* Access modifiers changed, original: protected|varargs */
    public JSONObject doInBackground(Void... voidArr) {
        return refreshTokenAction(this.url, this.headers, this.params);
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(JSONObject jSONObject) {
        refreshTokenPostAction(jSONObject, this.callback);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JSONObject refreshTokenAction(String str, Map<String, String> map, Map<String, String> map2) {
        Exception e;
        HttpURLConnection httpURLConnection;
        Throwable th;
        Throwable th2;
        HttpURLConnection httpURLConnection2;
        JSONObject jSONObject = null;
        try {
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection3.setRequestMethod(CommsUtils.HTTP_ACTION_POST);
                httpURLConnection3.setDoOutput(true);
                for (Entry entry : map.entrySet()) {
                    httpURLConnection3.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                String formUrlEncode = CommsUtils.formUrlEncode(map2);
                httpURLConnection3.setRequestProperty(CommsUtils.HTTP_HEADER_CONTENT_LENGTH, String.valueOf(formUrlEncode.length()));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection3.getOutputStream());
                outputStreamWriter.write(formUrlEncode);
                outputStreamWriter.flush();
                httpURLConnection3.connect();
                this.responseCode = httpURLConnection3.getResponseCode();
                if (this.responseCode == 200) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection3.getInputStream()));
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
                    jSONObject = new JSONObject(stringBuilder.toString());
                } else {
                    this.exception = new Exception(CommsUtils.ERROR_INVALID_HTTP_RESPONSE);
                }
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = httpURLConnection3;
                try {
                    this.exception = e;
                    if (httpURLConnection != null) {
                        httpURLConnection3 = httpURLConnection;
                        httpURLConnection3.disconnect();
                    }
                    return jSONObject;
                } catch (Throwable th22) {
                    th = th22;
                    httpURLConnection2 = httpURLConnection;
                    th22 = th;
                    if (httpURLConnection2 != null) {
                    }
                    throw th22;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection3;
                httpURLConnection2 = httpURLConnection;
                th22 = th;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th22;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
            this.exception = e;
            if (httpURLConnection != null) {
            }
            return jSONObject;
        } catch (Throwable th4) {
            th22 = th4;
            if (httpURLConnection2 != null) {
            }
            throw th22;
        }
        return jSONObject;
    }

    public void refreshTokenPostAction(JSONObject jSONObject, RefreshTokenCallback refreshTokenCallback) {
        String str = "";
        try {
            Long valueOf = Long.valueOf(0);
            String str2 = "";
            if (jSONObject != null) {
                str = jSONObject.getString(AppAuthConverter.APPAUTH_ACCESS_TOKEN_KEY);
                valueOf = Long.valueOf(System.currentTimeMillis() + (jSONObject.getLong("expires_in") * 1000));
                str2 = jSONObject.getString("refresh_token");
            }
            refreshTokenCallback.onTokenResult(str, valueOf, str2, this.exception);
        } catch (JSONException e) {
            refreshTokenCallback.onTokenResult("", Long.valueOf(0), "", this.exception);
        }
    }
}
