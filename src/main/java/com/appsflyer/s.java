package com.appsflyer;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class s {
    /* renamed from: ˊ */
    private static s f219;
    /* renamed from: ʻ */
    private final String f220;
    /* renamed from: ʻॱ */
    private final String f221;
    /* renamed from: ʼ */
    private final String f222;
    /* renamed from: ʼॱ */
    private final String f223;
    /* renamed from: ʽ */
    private final String f224;
    /* renamed from: ʽॱ */
    private final String f225;
    /* renamed from: ʾ */
    private final String f226;
    /* renamed from: ʿ */
    private final String f227;
    /* renamed from: ˈ */
    private final String f228;
    /* renamed from: ˉ */
    private JSONArray f229;
    /* renamed from: ˊˊ */
    private int f230;
    /* renamed from: ˊˋ */
    private JSONObject f231;
    /* renamed from: ˊॱ */
    private final String f232;
    /* renamed from: ˊᐝ */
    private final String f233;
    /* renamed from: ˋ */
    private final String f234;
    /* renamed from: ˋˊ */
    private final String f235;
    /* renamed from: ˋॱ */
    private final String f236;
    /* renamed from: ˍ */
    private String f237;
    /* renamed from: ˎ */
    private boolean f238;
    /* renamed from: ˎˎ */
    private boolean f239;
    /* renamed from: ˏ */
    private boolean f240;
    /* renamed from: ˏॱ */
    private final String f241;
    /* renamed from: ͺ */
    private final String f242;
    /* renamed from: ॱ */
    private final String f243;
    /* renamed from: ॱˊ */
    private final String f244;
    /* renamed from: ॱˋ */
    private final String f245;
    /* renamed from: ॱˎ */
    private final String f246;
    /* renamed from: ॱॱ */
    private final String f247;
    /* renamed from: ॱᐝ */
    private final String f248;
    /* renamed from: ᐝ */
    private final String f249;
    /* renamed from: ᐝॱ */
    private final String f250;

    private s() {
        this.f238 = true;
        this.f240 = true;
        this.f243 = "brand";
        this.f234 = "model";
        this.f220 = "platform";
        this.f247 = "platform_version";
        this.f224 = ServerParameters.ADVERTISING_ID_PARAM;
        this.f222 = "imei";
        this.f249 = "android_id";
        this.f242 = "sdk_version";
        this.f236 = "devkey";
        this.f244 = "originalAppsFlyerId";
        this.f241 = "uid";
        this.f232 = "app_id";
        this.f246 = "app_version";
        this.f221 = AppsFlyerProperties.CHANNEL;
        this.f245 = "preInstall";
        this.f248 = "data";
        this.f250 = "r_debugging_off";
        this.f227 = "r_debugging_on";
        this.f225 = "public_api_call";
        this.f228 = "exception";
        this.f223 = "server_request";
        this.f226 = "server_response";
        this.f235 = "yyyy-MM-dd HH:mm:ssZ";
        this.f233 = "MM-dd HH:mm:ss.SSS";
        this.f230 = 0;
        this.f237 = "-1";
        this.f229 = new JSONArray();
        this.f230 = 0;
        this.f239 = false;
    }

    /* renamed from: ʼ */
    private void m165() {
        synchronized (this) {
            this.f229 = null;
            this.f229 = new JSONArray();
            this.f230 = 0;
        }
    }

    /* renamed from: ˋ */
    static void m166(String str, PackageManager packageManager) {
        try {
            if (f219 == null) {
                f219 = new s();
            }
            f219.m170(str, packageManager);
            if (f219 == null) {
                f219 = new s();
            }
            String ॱॱ = f219.m173();
            o oVar = new o(null, AppsFlyerLib.getInstance().isTrackingStopped());
            oVar.f200 = ॱॱ;
            oVar.m154();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ServerConfigHandler.getUrl("https://%smonitorsdk.%s/remote-debug?app_id="));
            stringBuilder.append(str);
            oVar.execute(new String[]{stringBuilder.toString()});
        } catch (Throwable th) {
        }
    }

    /* renamed from: ˋ */
    private void m167(String str, String str2, String str3, String str4) {
        synchronized (this) {
            try {
                this.f231.put("sdk_version", str);
                if (str2 != null && str2.length() > 0) {
                    this.f231.put("devkey", str2);
                }
                if (str3 != null && str3.length() > 0) {
                    this.f231.put("originalAppsFlyerId", str3);
                }
                if (str4 != null && str4.length() > 0) {
                    this.f231.put("uid", str4);
                }
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: ˎ */
    private void m168(String str, String str2, String str3, String str4) {
        synchronized (this) {
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        this.f231.put("app_id", str);
                    }
                } catch (Throwable th) {
                    return;
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.f231.put("app_version", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f231.put(AppsFlyerProperties.CHANNEL, str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.f231.put("preInstall", str4);
            }
        }
    }

    /* renamed from: ˏ */
    static s m169() {
        if (f219 == null) {
            f219 = new s();
        }
        return f219;
    }

    /* renamed from: ˏ */
    private void m170(String str, PackageManager packageManager) {
        synchronized (this) {
            AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
            AppsFlyerLib instance2 = AppsFlyerLib.getInstance();
            String string = instance.getString("remote_debug_static_data");
            if (string != null) {
                try {
                    this.f231 = new JSONObject(string);
                } catch (Throwable th) {
                }
            } else {
                this.f231 = new JSONObject();
                m171(Build.BRAND, Build.MODEL, VERSION.RELEASE, instance.getString(ServerParameters.ADVERTISING_ID_PARAM), instance2.f88, instance2.f79);
                m167("4.9.0.184", instance.getString(AppsFlyerProperties.AF_KEY), instance.getString("KSAppsFlyerId"), instance.getString("uid"));
                try {
                    m168(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), instance.getString(AppsFlyerProperties.CHANNEL), instance.getString("preInstallName"));
                } catch (Throwable th2) {
                }
                instance.set("remote_debug_static_data", this.f231.toString());
            }
            try {
                this.f231.put("launch_counter", this.f237);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: ˏ */
    private void m171(String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (this) {
            try {
                this.f231.put("brand", str);
                this.f231.put("model", str2);
                this.f231.put("platform", "Android");
                this.f231.put("platform_version", str3);
                if (str4 != null && str4.length() > 0) {
                    this.f231.put(ServerParameters.ADVERTISING_ID_PARAM, str4);
                }
                if (str5 != null && str5.length() > 0) {
                    this.f231.put("imei", str5);
                }
                if (str6 != null && str6.length() > 0) {
                    this.f231.put("android_id", str6);
                }
            } catch (Throwable th) {
            }
        }
    }

    /* JADX WARNING: Missing block: B:38:?, code skipped:
            return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ॱ */
    private void m172(String str, String str2, String... strArr) {
        Object obj = 1;
        synchronized (this) {
            if (!(this.f240 && (this.f238 || this.f239))) {
                obj = null;
            }
            if (obj == null || this.f230 >= 98304) {
            } else {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str3 = "";
                    if (strArr.length > 0) {
                        StringBuilder stringBuilder = new StringBuilder();
                        for (int length = strArr.length - 1; length > 0; length--) {
                            stringBuilder.append(strArr[length]);
                            stringBuilder.append(", ");
                        }
                        stringBuilder.append(strArr[0]);
                        str3 = stringBuilder.toString();
                    }
                    String format = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ENGLISH).format(Long.valueOf(currentTimeMillis));
                    if (str != null) {
                        obj = String.format("%18s %5s _/%s [%s] %s %s", new Object[]{format, Long.valueOf(Thread.currentThread().getId()), AppsFlyerLib.LOG_TAG, str, str2, str3});
                    } else {
                        obj = String.format("%18s %5s %s/%s %s", new Object[]{format, Long.valueOf(Thread.currentThread().getId()), str2, AppsFlyerLib.LOG_TAG, str3});
                    }
                    this.f229.put(obj);
                    this.f230 = obj.getBytes().length + this.f230;
                } catch (Throwable th) {
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:11:0x0019, code skipped:
            r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ॱॱ */
    private String m173() {
        String jSONObject;
        synchronized (this) {
            try {
                this.f231.put("data", this.f229);
                jSONObject = this.f231.toString();
                m165();
            } catch (JSONException e) {
            } catch (Throwable th) {
            }
        }
        return jSONObject;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ʻ */
    public final boolean m174() {
        return this.f239;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˊ */
    public final void m175() {
        synchronized (this) {
            m172("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            this.f239 = false;
            this.f238 = false;
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˊ */
    public final void m176(String str, String str2) {
        m172("server_request", str, str2);
    }

    /* Access modifiers changed, original: final|varargs */
    /* renamed from: ˊ */
    public final void m177(String str, String... strArr) {
        m172("public_api_call", str, strArr);
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˋ */
    public final void m178() {
        synchronized (this) {
            this.f238 = false;
            m165();
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˋ */
    public final void m179(String str, String str2) {
        m172(null, str, str2);
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˎ */
    public final void m180() {
        synchronized (this) {
            this.f239 = true;
            m172("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˎ */
    public final void m181(String str) {
        synchronized (this) {
            this.f237 = str;
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final void m182(String str, int i, String str2) {
        m172("server_response", str, String.valueOf(i), str2);
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final void m183(Throwable th) {
        String[] strArr;
        int i = 1;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        StackTraceElement[] stackTrace = cause == null ? th.getStackTrace() : cause.getStackTrace();
        if (stackTrace == null) {
            strArr = new String[]{message};
        } else {
            String[] strArr2 = new String[(stackTrace.length + 1)];
            strArr2[0] = message;
            while (i < stackTrace.length) {
                strArr2[i] = stackTrace[i].toString();
                i++;
            }
            strArr = strArr2;
        }
        m172("exception", simpleName, strArr);
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ॱ */
    public final void m184() {
        synchronized (this) {
            this.f231 = null;
            this.f229 = null;
            f219 = null;
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ᐝ */
    public final void m185() {
        this.f240 = false;
    }
}
