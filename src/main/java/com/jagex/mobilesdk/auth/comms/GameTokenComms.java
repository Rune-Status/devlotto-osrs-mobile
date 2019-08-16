package com.jagex.mobilesdk.auth.comms;

import android.os.AsyncTask;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

public class GameTokenComms extends AsyncTask<Void, Void, String> {
    private final FetchGameTokenCallback callback;
    private Exception exception;
    private final Map<String, String> headers;
    private int responseCode;
    private final String url;

    public interface FetchGameTokenCallback {
        void onGameTokenResult(CommsResult<String> commsResult, Exception exception);
    }

    GameTokenComms(String str, Map<String, String> map, FetchGameTokenCallback fetchGameTokenCallback) {
        this.url = str;
        this.headers = map;
        this.callback = fetchGameTokenCallback;
    }

    /* Access modifiers changed, original: protected|varargs */
    public String doInBackground(Void... voidArr) {
        return fetchGameTokenAction(this.url, this.headers);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String fetchGameTokenAction(String str, Map<String, String> map) {
        Exception e;
        Throwable th;
        HttpURLConnection httpURLConnection = null;
        String str2 = "";
        String str3;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                String stringBuilder;
                for (Entry entry : map.entrySet()) {
                    httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection2.setInstanceFollowRedirects(false);
                this.responseCode = httpURLConnection2.getResponseCode();
                if (this.responseCode == 200) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                    StringBuilder stringBuilder2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuilder2.append(readLine);
                    }
                    stringBuilder = stringBuilder2.toString();
                } else {
                    this.exception = new Exception(CommsUtils.ERROR_INVALID_HTTP_RESPONSE);
                    stringBuilder = str2;
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    return stringBuilder;
                }
                str3 = stringBuilder;
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

    public void fetchGameTokenPostAction(String str, FetchGameTokenCallback fetchGameTokenCallback) {
        fetchGameTokenCallback.onGameTokenResult(new CommsResult(str, CommsUtils.mapResponseCode(this.responseCode)), this.exception);
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(String str) {
        fetchGameTokenPostAction(str, this.callback);
    }
}
