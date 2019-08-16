package com.appsflyer;

import android.support.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class ServerConfigHandler {
    public static String getUrl(String str) {
        return String.format(str, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AppsFlyerLib.getInstance().getHostName()});
    }

    @Nullable
    /* renamed from: ˋ */
    static JSONObject m89(String str) {
        JSONObject jSONObject;
        Throwable th;
        try {
            jSONObject = new JSONObject(str);
            try {
                if (jSONObject.optBoolean("monitor", false)) {
                    s.m169().m180();
                } else {
                    s.m169().m178();
                    s.m169().m175();
                }
            } catch (JSONException e) {
                s.m169().m178();
                s.m169().m175();
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                AFLogger.afErrorLog(th.getMessage(), th);
                s.m169().m178();
                s.m169().m175();
                return jSONObject;
            }
        } catch (JSONException e2) {
            jSONObject = null;
            s.m169().m178();
            s.m169().m175();
            return jSONObject;
        } catch (Throwable th3) {
            th = th3;
            jSONObject = null;
            AFLogger.afErrorLog(th.getMessage(), th);
            s.m169().m178();
            s.m169().m175();
            return jSONObject;
        }
        return jSONObject;
    }
}
