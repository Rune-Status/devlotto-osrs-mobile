package com.jagex.mobilesdk.payments.comms;

import android.os.AsyncTask;
import com.google.gson.Gson;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import com.jagex.mobilesdk.payments.model.Shop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

public class FetchPackagesComms extends AsyncTask<Void, Void, Shop> {
    private FetchPackagesCallback callback;
    private Exception exception;
    private Map<String, String> headers;
    private int responseCode = 0;
    private String url;

    public interface FetchPackagesCallback {
        void onFetchPackagesResult(CommsResult<Shop> commsResult, Exception exception);
    }

    FetchPackagesComms(String str, Map<String, String> map, FetchPackagesCallback fetchPackagesCallback) {
        this.url = str;
        this.headers = map;
        this.callback = fetchPackagesCallback;
    }

    /* Access modifiers changed, original: protected|varargs */
    public Shop doInBackground(Void... voidArr) {
        return fetchPackagesAction(this.url, this.headers);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Missing block: B:37:0x00a8, code skipped:
            if (r0 != null) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Shop fetchPackagesAction(String str, Map<String, String> map) {
        Exception e;
        HttpURLConnection httpURLConnection;
        Throwable th;
        Throwable th2;
        HttpURLConnection httpURLConnection2 = null;
        HttpURLConnection httpURLConnection3;
        try {
            httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
            try {
                for (Entry entry : map.entrySet()) {
                    httpURLConnection3.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection3.setRequestMethod(CommsUtils.HTTP_ACTION_GET);
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
                    Shop shop = (Shop) new Gson().fromJson(stringBuilder.toString(), Shop.class);
                    if (httpURLConnection3 == null) {
                        return shop;
                    }
                    httpURLConnection3.disconnect();
                    return shop;
                }
                this.exception = new Exception(CommsUtils.ERROR_INVALID_HTTP_RESPONSE);
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = httpURLConnection3;
                try {
                    this.exception = e;
                    if (httpURLConnection != null) {
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
                }
                throw th22;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
            this.exception = e;
            if (httpURLConnection != null) {
                httpURLConnection3 = httpURLConnection;
                httpURLConnection3.disconnect();
            }
            return null;
        } catch (Throwable th4) {
            th22 = th4;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th22;
        }
    }

    public void fetchPackagesPostAction(Shop shop, FetchPackagesCallback fetchPackagesCallback) {
        fetchPackagesCallback.onFetchPackagesResult(new CommsResult(shop, this.responseCode), this.exception);
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(Shop shop) {
        fetchPackagesPostAction(shop, this.callback);
    }
}
