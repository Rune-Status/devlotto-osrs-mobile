package com.jagex.mobilesdk.federatedLogin.comms;

import android.os.AsyncTask;
import com.google.gson.Gson;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import com.jagex.mobilesdk.federatedLogin.model.FederatedLoginRequest;
import com.jagex.mobilesdk.federatedLogin.model.FederatedLoginResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

public class FederatedComms extends AsyncTask<Void, Void, FederatedLoginResponse> {
    private final FederatedLoginRequest body;
    private final PerformFederatedCallback callback;
    private Exception exception;
    private final Map<String, String> headers;
    private int responseCode;
    private final String url;

    public interface PerformFederatedCallback {
        void onFederatedLoginResult(CommsResult<FederatedLoginResponse> commsResult, Exception exception);
    }

    public FederatedComms(String str, Map<String, String> map, FederatedLoginRequest federatedLoginRequest, PerformFederatedCallback performFederatedCallback) {
        this.url = str;
        this.headers = map;
        this.callback = performFederatedCallback;
        this.body = federatedLoginRequest;
    }

    /* Access modifiers changed, original: protected|varargs */
    public FederatedLoginResponse doInBackground(Void... voidArr) {
        return federatedLoginAction(this.url, this.headers, this.body);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Missing block: B:37:0x00c2, code skipped:
            if (r0 != null) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FederatedLoginResponse federatedLoginAction(String str, Map<String, String> map, FederatedLoginRequest federatedLoginRequest) {
        Exception e;
        HttpURLConnection httpURLConnection;
        Throwable th;
        Throwable th2;
        HttpURLConnection httpURLConnection2 = null;
        try {
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
            try {
                for (Entry entry : map.entrySet()) {
                    httpURLConnection3.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                String toJson = new Gson().toJson((Object) federatedLoginRequest);
                httpURLConnection3.setRequestMethod(CommsUtils.HTTP_ACTION_POST);
                httpURLConnection3.setDoOutput(true);
                httpURLConnection3.getOutputStream().write(toJson.getBytes("UTF-8"));
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
                    FederatedLoginResponse federatedLoginResponse = (FederatedLoginResponse) new Gson().fromJson(stringBuilder.toString(), FederatedLoginResponse.class);
                    if (httpURLConnection3 == null) {
                        return federatedLoginResponse;
                    }
                    httpURLConnection3.disconnect();
                    return federatedLoginResponse;
                }
                this.exception = new Exception(CommsUtils.ERROR_INVALID_HTTP_RESPONSE);
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = httpURLConnection3;
                try {
                    this.exception = e;
                    if (httpURLConnection != null) {
                        httpURLConnection3 = httpURLConnection;
                        httpURLConnection3.disconnect();
                    }
                    return null;
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
            return null;
        } catch (Throwable th4) {
            th22 = th4;
            if (httpURLConnection2 != null) {
            }
            throw th22;
        }
    }

    public void federatedLoginPostAction(FederatedLoginResponse federatedLoginResponse, PerformFederatedCallback performFederatedCallback) {
        performFederatedCallback.onFederatedLoginResult(new CommsResult(federatedLoginResponse, this.responseCode), this.exception);
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(FederatedLoginResponse federatedLoginResponse) {
        federatedLoginPostAction(federatedLoginResponse, this.callback);
    }
}
