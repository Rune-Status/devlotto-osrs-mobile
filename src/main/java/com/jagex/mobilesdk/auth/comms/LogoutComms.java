package com.jagex.mobilesdk.auth.comms;

import android.os.AsyncTask;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

public class LogoutComms extends AsyncTask<Void, Void, String> {
    private PerformLogoutCallback callback;
    private Exception exception;
    private Map<String, String> headers;
    private Map<String, String> params;
    private int responseCode;
    private String url;

    public interface PerformLogoutCallback {
        void onLogoutResult(CommsResult<String> commsResult, Exception exception);
    }

    LogoutComms(String str, Map<String, String> map, Map<String, String> map2, PerformLogoutCallback performLogoutCallback) {
        this.url = str;
        this.headers = map;
        this.callback = performLogoutCallback;
        this.params = map2;
    }

    /* Access modifiers changed, original: protected|varargs */
    public String doInBackground(Void... voidArr) {
        return logoutAction(this.url, this.headers, this.params);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String logoutAction(String str, Map<String, String> map, Map<String, String> map2) {
        Exception e;
        Throwable th;
        HttpURLConnection httpURLConnection = null;
        String str2 = "";
        String str3;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setRequestMethod(CommsUtils.HTTP_ACTION_POST);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setInstanceFollowRedirects(false);
                for (Entry entry : map.entrySet()) {
                    httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                String formUrlEncode = CommsUtils.formUrlEncode(map2);
                httpURLConnection2.setRequestProperty(CommsUtils.HTTP_HEADER_CONTENT_LENGTH, String.valueOf(formUrlEncode.length()));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection2.getOutputStream());
                outputStreamWriter.write(formUrlEncode);
                outputStreamWriter.flush();
                httpURLConnection2.connect();
                this.responseCode = httpURLConnection2.getResponseCode();
                if (this.responseCode == 200) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
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
                    formUrlEncode = stringBuilder.toString();
                } else {
                    this.exception = new Exception(CommsUtils.ERROR_INVALID_HTTP_RESPONSE);
                    formUrlEncode = str2;
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    return formUrlEncode;
                }
                str3 = formUrlEncode;
                return str3;
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = httpURLConnection2;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            try {
                this.exception = e;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    str3 = str2;
                } else {
                    str3 = str2;
                }
                return str3;
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection != null) {
                }
                throw th;
            }
        }
    }

    public void logoutPostAction(String str, PerformLogoutCallback performLogoutCallback) {
        performLogoutCallback.onLogoutResult(new CommsResult(str, CommsUtils.mapResponseCode(this.responseCode)), this.exception);
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(String str) {
        logoutPostAction(str, this.callback);
    }
}
