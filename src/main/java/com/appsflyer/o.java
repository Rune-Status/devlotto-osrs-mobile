package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

final class o extends AsyncTask<String, Void, String> {
    /* renamed from: ʻ */
    private boolean f196;
    /* renamed from: ʼ */
    private boolean f197;
    /* renamed from: ʽ */
    private HttpURLConnection f198;
    /* renamed from: ˊ */
    Map<String, String> f199;
    /* renamed from: ˋ */
    String f200;
    /* renamed from: ˎ */
    private String f201 = "";
    /* renamed from: ˏ */
    private boolean f202 = false;
    /* renamed from: ॱ */
    private boolean f203 = false;
    /* renamed from: ॱॱ */
    private WeakReference<Context> f204;
    /* renamed from: ᐝ */
    private URL f205;

    o(Context context, boolean z) {
        this.f204 = new WeakReference(context);
        this.f197 = true;
        this.f196 = true;
        this.f203 = z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCancelled() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPreExecute() {
        if (this.f200 == null) {
            this.f200 = new JSONObject(this.f199).toString();
        }
    }

    /* Access modifiers changed, original: protected|final|varargs */
    /* renamed from: ˋ */
    public final String doInBackground(String... strArr) {
        if (this.f203) {
            return null;
        }
        StringBuilder stringBuilder;
        try {
            int length;
            this.f205 = new URL(strArr[0]);
            if (this.f197) {
                s.m169().m176(this.f205.toString(), this.f200);
                length = this.f200.getBytes("UTF-8").length;
                stringBuilder = new StringBuilder("call = ");
                stringBuilder.append(this.f205);
                stringBuilder.append("; size = ");
                stringBuilder.append(length);
                stringBuilder.append(" byte");
                stringBuilder.append(length > 1 ? "s" : "");
                stringBuilder.append("; body = ");
                stringBuilder.append(this.f200);
                a.m129(stringBuilder.toString());
            }
            this.f198 = (HttpURLConnection) this.f205.openConnection();
            this.f198.setReadTimeout(30000);
            this.f198.setConnectTimeout(30000);
            this.f198.setRequestMethod(CommsUtils.HTTP_ACTION_POST);
            this.f198.setDoInput(true);
            this.f198.setDoOutput(true);
            this.f198.setRequestProperty(CommsUtils.HTTP_HEADER_CONTENT_TYPE, CommsUtils.HTTP_HEADER_ACCEPT_JSON);
            OutputStream outputStream = this.f198.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(this.f200);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            this.f198.connect();
            length = this.f198.getResponseCode();
            if (this.f196) {
                AppsFlyerLib.getInstance();
                this.f201 = AppsFlyerLib.m59(this.f198);
            }
            if (this.f197) {
                s.m169().m182(this.f205.toString(), length, this.f201);
            }
            if (length == 200) {
                AFLogger.afInfoLog("Status 200 ok");
                Context context = (Context) this.f204.get();
                if (this.f205.toString().startsWith(ServerConfigHandler.getUrl(AppsFlyerLib.f64)) && context != null) {
                    Editor edit = AppsFlyerLib.m57(context).edit();
                    edit.putBoolean("sentRegisterRequestToAF", true);
                    edit.apply();
                    AFLogger.afDebugLog("Successfully registered for Uninstall Tracking");
                }
            } else {
                this.f202 = true;
            }
        } catch (Throwable th) {
            stringBuilder = new StringBuilder("Error while calling ");
            stringBuilder.append(this.f205.toString());
            AFLogger.afErrorLog(stringBuilder.toString(), th);
            this.f202 = true;
        }
        return this.f201;
    }

    /* Access modifiers changed, original: protected|final */
    /* renamed from: ˋ */
    public final void onPostExecute(String str) {
        if (this.f202) {
            AFLogger.afInfoLog("Connection error: ".concat(String.valueOf(str)));
        } else {
            AFLogger.afInfoLog("Connection call succeeded: ".concat(String.valueOf(str)));
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˎ */
    public final HttpURLConnection m152() {
        return this.f198;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final void m153() {
        this.f196 = false;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ॱ */
    public final void m154() {
        this.f197 = false;
    }
}
