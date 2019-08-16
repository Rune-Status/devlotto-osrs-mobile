package com.jagex.mobilesdk.payments.comms;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FetchImageComms extends AsyncTask<Void, Void, Bitmap> {
    private FetchImageCallback callback;
    private Exception exception;
    private int responseCode = 0;
    private String url;

    public interface FetchImageCallback {
        void onFetchImageResult(CommsResult<Bitmap> commsResult, Exception exception);
    }

    FetchImageComms(String str, FetchImageCallback fetchImageCallback) {
        this.url = str;
        this.callback = fetchImageCallback;
    }

    /* Access modifiers changed, original: protected|varargs */
    public Bitmap doInBackground(Void... voidArr) {
        return fetchImageAction(this.url);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Missing block: B:12:0x0030, code skipped:
            if (r0 != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Bitmap fetchImageAction(String str) {
        Exception e;
        HttpURLConnection httpURLConnection;
        Throwable th;
        Throwable th2;
        HttpURLConnection httpURLConnection2 = null;
        Bitmap decodeStream;
        try {
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection3.setRequestMethod(CommsUtils.HTTP_ACTION_GET);
                httpURLConnection3.connect();
                this.responseCode = httpURLConnection3.getResponseCode();
                if (this.responseCode == 200) {
                    InputStream inputStream = httpURLConnection3.getInputStream();
                    if (inputStream != null) {
                        decodeStream = BitmapFactory.decodeStream(inputStream);
                        if (httpURLConnection3 != null) {
                            httpURLConnection3.disconnect();
                        }
                        return decodeStream;
                    }
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
                    return decodeStream;
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
            return decodeStream;
        } catch (Throwable th4) {
            th22 = th4;
            if (httpURLConnection2 != null) {
            }
            throw th22;
        }
    }

    public void fetchImagePostAction(Bitmap bitmap, FetchImageCallback fetchImageCallback) {
        fetchImageCallback.onFetchImageResult(new CommsResult(bitmap, this.responseCode), this.exception);
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(Bitmap bitmap) {
        fetchImagePostAction(bitmap, this.callback);
    }
}
