package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings.Secure;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.appsflyer.AFLogger.LogLevel;
import com.appsflyer.AppsFlyerProperties.EmailsCryptType;
import com.appsflyer.OneLinkHttpTask.HttpsUrlConnectionProvider;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import com.appsflyer.share.Constants;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLib implements d {
    public static final String AF_PRE_INSTALL_PATH = "AF_PRE_INSTALL_PATH";
    public static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    public static final String ATTRIBUTION_ID_CONTENT_URI = "content://com.facebook.katana.provider.AttributionIdProvider";
    public static final String IS_STOP_TRACKING_USED = "is_stop_tracking_used";
    public static final String LOG_TAG = "AppsFlyer_4.9.0";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT = "/data/local/tmp/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT_ETC = "/etc/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_RO_PROP = "ro.appsflyer.preinstall.path";
    /* renamed from: ʻ */
    private static String f59;
    /* renamed from: ʻॱ */
    private static AppsFlyerTrackingRequestListener f60 = null;
    /* renamed from: ʼ */
    private static String f61;
    /* renamed from: ʼॱ */
    private static AppsFlyerLib f62 = new AppsFlyerLib();
    /* renamed from: ʽ */
    private static String f63;
    /* renamed from: ˊ */
    static final String f64;
    /* renamed from: ˊॱ */
    private static final List<String> f65 = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
    /* renamed from: ˎ */
    static AppsFlyerInAppPurchaseValidatorListener f66 = null;
    /* renamed from: ˏ */
    static final String f67 = BuildConfig.VERSION_NAME.substring(0, BuildConfig.VERSION_NAME.indexOf("."));
    /* renamed from: ͺ */
    private static final List<String> f68 = Arrays.asList(new String[]{"is_cache"});
    /* renamed from: ॱˊ */
    private static AppsFlyerConversionListener f69 = null;
    /* renamed from: ॱॱ */
    private static final String f70;
    protected Uri latestDeepLink = null;
    /* renamed from: ʽॱ */
    private ScheduledExecutorService f71 = null;
    /* renamed from: ʾ */
    private long f72;
    /* renamed from: ʿ */
    private d f73;
    /* renamed from: ˈ */
    private long f74;
    /* renamed from: ˉ */
    private Map<Long, String> f75;
    /* renamed from: ˊˊ */
    private boolean f76 = false;
    /* renamed from: ˊˋ */
    private boolean f77 = false;
    /* renamed from: ˊᐝ */
    private long f78;
    /* renamed from: ˋ */
    String f79;
    /* renamed from: ˋˊ */
    private String f80;
    /* renamed from: ˋˋ */
    private q f81 = new q();
    /* renamed from: ˋॱ */
    private long f82 = TimeUnit.SECONDS.toMillis(5);
    /* renamed from: ˋᐝ */
    private boolean f83 = false;
    /* renamed from: ˌ */
    private boolean f84 = false;
    /* renamed from: ˍ */
    private boolean f85;
    /* renamed from: ˎˎ */
    private boolean f86;
    /* renamed from: ˏॱ */
    private long f87 = -1;
    /* renamed from: ॱ */
    String f88;
    /* renamed from: ॱˋ */
    private e f89 = null;
    /* renamed from: ॱˎ */
    private boolean f90 = false;
    /* renamed from: ॱᐝ */
    private long f91;
    /* renamed from: ᐝ */
    private long f92 = -1;
    /* renamed from: ᐝॱ */
    private Map<String, String> f93;

    /* renamed from: com.appsflyer.AppsFlyerLib$5 */
    static final /* synthetic */ class AnonymousClass5 {
        /* renamed from: ˎ */
        static final /* synthetic */ int[] f34 = new int[EmailsCryptType.values().length];

        static {
            try {
                f34[EmailsCryptType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f34[EmailsCryptType.MD5.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f34[EmailsCryptType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f34[EmailsCryptType.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    final class a implements Runnable {
        /* renamed from: ʻ */
        private String f35;
        /* renamed from: ʼ */
        private boolean f36;
        /* renamed from: ˊ */
        private final String f38;
        /* renamed from: ˋ */
        private final Intent f39;
        /* renamed from: ˎ */
        private String f40;
        /* renamed from: ˏ */
        private String f41;
        /* renamed from: ॱ */
        private WeakReference<Context> f42;
        /* renamed from: ॱॱ */
        private String f43;
        /* renamed from: ᐝ */
        private boolean f44;

        private a(WeakReference<Context> weakReference, String str, String str2, String str3, String str4, boolean z, Intent intent, String str5) {
            this.f42 = weakReference;
            this.f40 = str;
            this.f41 = str2;
            this.f35 = str3;
            this.f43 = str4;
            this.f44 = true;
            this.f36 = z;
            this.f39 = intent;
            this.f38 = str5;
        }

        /* synthetic */ a(AppsFlyerLib appsFlyerLib, WeakReference weakReference, String str, String str2, String str3, String str4, boolean z, Intent intent, String str5, byte b) {
            this(weakReference, str, str2, str3, str4, z, intent, str5);
        }

        public final void run() {
            AppsFlyerLib.ॱ(AppsFlyerLib.this, (Context) this.f42.get(), this.f40, this.f41, this.f35, this.f43, this.f44, this.f36, this.f39, this.f38);
        }
    }

    final class b implements Runnable {
        /* renamed from: ˊ */
        private int f46;
        /* renamed from: ˋ */
        private WeakReference<Context> f47;
        /* renamed from: ˎ */
        private Map<String, Object> f48;
        /* renamed from: ˏ */
        private boolean f49;
        /* renamed from: ॱ */
        private String f50;

        private b(String str, Map<String, Object> map, Context context, boolean z, int i) {
            this.f47 = null;
            this.f50 = str;
            this.f48 = map;
            this.f47 = new WeakReference(context);
            this.f49 = z;
            this.f46 = i;
        }

        /* synthetic */ b(AppsFlyerLib appsFlyerLib, String str, Map map, Context context, boolean z, int i, byte b) {
            this(str, map, context, z, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x009f A:{Splitter:B:10:0x003c, ExcHandler: Throwable (r0_28 'th' java.lang.Throwable)} */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing block: B:32:0x009c, code skipped:
            r0 = move-exception;
     */
        /* JADX WARNING: Missing block: B:33:0x009d, code skipped:
            r1 = r0;
     */
        /* JADX WARNING: Missing block: B:34:0x009f, code skipped:
            r0 = move-exception;
     */
        /* JADX WARNING: Missing block: B:35:0x00a0, code skipped:
            com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
     */
        /* JADX WARNING: Missing block: B:42:?, code skipped:
            return;
     */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            Throwable th;
            Throwable th2;
            String str = null;
            if (!AppsFlyerLib.this.isTrackingStopped()) {
                if (this.f49 && this.f46 <= 2 && AppsFlyerLib.ॱ(AppsFlyerLib.this)) {
                    this.f48.put("rfr", AppsFlyerLib.this.f93);
                }
                this.f48.putAll(new e(this.f48, (Context) this.f47.get()));
                try {
                    String str2 = (String) this.f48.get("appsflyerKey");
                    synchronized (this.f48) {
                        try {
                            str = AFHelper.convertToJsonObject(this.f48).toString();
                            try {
                                AppsFlyerLib.ॱ(AppsFlyerLib.this, this.f50, str, str2, this.f47, null, this.f49);
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (IOException th5) {
                    th2 = th5;
                } catch (Throwable th6) {
                }
            } else {
                return;
            }
            AFLogger.afErrorLog("Exception while sending request to server. ", th2);
            if (str != null && this.f47 != null && !this.f50.contains("&isCachedRequest=true&timeincache=")) {
                CacheManager.getInstance().cacheRequest(new RequestCacheData(this.f50, str, BuildConfig.VERSION_NAME), (Context) this.f47.get());
                AFLogger.afErrorLog(th2.getMessage(), th2);
            }
        }
    }

    final class c implements Runnable {
        /* renamed from: ˊ */
        private WeakReference<Context> f51 = null;

        public c(Context context) {
            this.f51 = new WeakReference(context);
        }

        public final void run() {
            if (!AppsFlyerLib.this.f90) {
                AppsFlyerLib.this.f91 = System.currentTimeMillis();
                if (this.f51 != null) {
                    AppsFlyerLib.this.f90 = true;
                    try {
                        String ˊ = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
                        synchronized (this.f51) {
                            for (RequestCacheData requestCacheData : CacheManager.getInstance().getCachedRequests((Context) this.f51.get())) {
                                StringBuilder stringBuilder = new StringBuilder("resending request: ");
                                stringBuilder.append(requestCacheData.getRequestURL());
                                AFLogger.afInfoLog(stringBuilder.toString());
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long parseLong = Long.parseLong(requestCacheData.getCacheKey(), 10);
                                    AppsFlyerLib appsFlyerLib = AppsFlyerLib.this;
                                    StringBuilder stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append(requestCacheData.getRequestURL());
                                    stringBuilder2.append("&isCachedRequest=true&timeincache=");
                                    stringBuilder2.append(Long.toString((currentTimeMillis - parseLong) / 1000));
                                    AppsFlyerLib.ॱ(appsFlyerLib, stringBuilder2.toString(), requestCacheData.getPostData(), ˊ, this.f51, requestCacheData.getCacheKey(), false);
                                } catch (Exception e) {
                                    AFLogger.afErrorLog("Failed to resend cached request", e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        try {
                            AFLogger.afErrorLog("failed to check cache. ", e2);
                        } catch (Throwable th) {
                            AppsFlyerLib.this.f90 = false;
                        }
                    }
                    AppsFlyerLib.this.f90 = false;
                    AppsFlyerLib.this.f71.shutdown();
                    AppsFlyerLib.this.f71 = null;
                }
            }
        }
    }

    abstract class d implements Runnable {
        /* renamed from: ˊ */
        private String f53;
        /* renamed from: ˋ */
        private AtomicInteger f54 = new AtomicInteger(0);
        /* renamed from: ˎ */
        WeakReference<Context> f55 = null;
        /* renamed from: ˏ */
        private ScheduledExecutorService f56;

        d(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            this.f55 = new WeakReference(context);
            this.f53 = str;
            if (scheduledExecutorService == null) {
                this.f56 = AFExecutor.getInstance().m10();
            } else {
                this.f56 = scheduledExecutorService;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:74:0x0223  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0223  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            Throwable th;
            if (this.f53 != null && this.f53.length() != 0 && !AppsFlyerLib.this.isTrackingStopped()) {
                this.f54.incrementAndGet();
                HttpURLConnection httpURLConnection;
                try {
                    Context context = (Context) this.f55.get();
                    if (context == null) {
                        this.f54.decrementAndGet();
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    String ˏ = AppsFlyerLib.m72(context, AppsFlyerLib.m48(new WeakReference(context)));
                    String str = "";
                    if (ˏ != null) {
                        if (AppsFlyerLib.f65.contains(ˏ.toLowerCase())) {
                            AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", new Object[]{ˏ}));
                        } else {
                            str = "-".concat(String.valueOf(ˏ));
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(m35());
                    stringBuilder.append(context.getPackageName());
                    stringBuilder.append(str);
                    stringBuilder.append("?devkey=");
                    stringBuilder.append(this.f53);
                    stringBuilder.append("&device_id=");
                    stringBuilder.append(C0000r.m164(new WeakReference(context)));
                    s.m169().m176(stringBuilder.toString(), "");
                    StringBuilder stringBuilder2 = new StringBuilder("Calling server for attribution url: ");
                    stringBuilder2.append(stringBuilder.toString());
                    a.m129(stringBuilder2.toString());
                    httpURLConnection = (HttpURLConnection) new URL(stringBuilder.toString()).openConnection();
                    try {
                        httpURLConnection.setRequestMethod(CommsUtils.HTTP_ACTION_GET);
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setRequestProperty("Connection", "close");
                        httpURLConnection.connect();
                        int responseCode = httpURLConnection.getResponseCode();
                        String ˎ = AppsFlyerLib.m59(httpURLConnection);
                        s.m169().m182(stringBuilder.toString(), responseCode, ˎ);
                        if (responseCode == 200) {
                            AppsFlyerLib.m60(context, "appsflyerGetConversionDataTiming", System.currentTimeMillis() - currentTimeMillis);
                            a.m129("Attribution data: ".concat(String.valueOf(ˎ)));
                            if (ˎ.length() > 0 && context != null) {
                                StringBuilder stringBuilder3;
                                Map ˎ2 = AppsFlyerLib.m50(ˎ);
                                String str2 = (String) ˎ2.get("iscache");
                                if (str2 != null && Boolean.toString(false).equals(str2)) {
                                    AppsFlyerLib.m60(context, "appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                                }
                                if (ˎ2.containsKey(Constants.URL_SITE_ID)) {
                                    if (ˎ2.containsKey("af_channel")) {
                                        stringBuilder3 = new StringBuilder(Constants.LOG_INVITE_DETECTED_APP_INVITE_VIA_CHANNEL);
                                        stringBuilder3.append((String) ˎ2.get("af_channel"));
                                        AFLogger.afDebugLog(stringBuilder3.toString());
                                    } else {
                                        AFLogger.afDebugLog(String.format(Constants.LOG_CROSS_PROMOTION_APP_INSTALLED_FROM_CROSS_PROMOTION, new Object[]{ˎ2.get(Constants.URL_SITE_ID)}));
                                    }
                                }
                                if (ˎ2.containsKey(Constants.URL_SITE_ID)) {
                                    stringBuilder3 = new StringBuilder(Constants.LOG_INVITE_DETECTED_APP_INVITE_VIA_CHANNEL);
                                    stringBuilder3.append((String) ˎ2.get("af_channel"));
                                    AFLogger.afDebugLog(stringBuilder3.toString());
                                }
                                ˎ2.put("is_first_launch", Boolean.toString(false));
                                ˏ = new JSONObject(ˎ2).toString();
                                if (ˏ != null) {
                                    AppsFlyerLib.m61(context, "attributionId", ˏ);
                                } else {
                                    AppsFlyerLib.m61(context, "attributionId", ˎ);
                                }
                                stringBuilder = new StringBuilder("iscache=");
                                stringBuilder.append(str2);
                                stringBuilder.append(" caching conversion data");
                                AFLogger.afDebugLog(stringBuilder.toString());
                                if (AppsFlyerLib.f69 != null && this.f54.intValue() <= 1) {
                                    Map ˏ2;
                                    try {
                                        ˏ2 = AppsFlyerLib.m44(context);
                                    } catch (k e) {
                                        AFLogger.afErrorLog("Exception while trying to fetch attribution data. ", e);
                                        ˏ2 = ˎ2;
                                    }
                                    m34(ˏ2);
                                }
                            }
                        } else {
                            if (AppsFlyerLib.f69 != null) {
                                m36("Error connection to server: ".concat(String.valueOf(responseCode)), responseCode);
                            }
                            StringBuilder stringBuilder4 = new StringBuilder("AttributionIdFetcher response code: ");
                            stringBuilder4.append(responseCode);
                            stringBuilder4.append("  url: ");
                            stringBuilder4.append(stringBuilder);
                            a.m129(stringBuilder4.toString());
                        }
                        this.f54.decrementAndGet();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        this.f54.decrementAndGet();
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                    this.f56.shutdown();
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = null;
                    this.f54.decrementAndGet();
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            }
        }

        /* renamed from: ˋ */
        public abstract void m34(Map<String, String> map);

        /* renamed from: ॱ */
        public abstract String m35();

        /* renamed from: ॱ */
        public abstract void m36(String str, int i);
    }

    final class e extends d {
        public e(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            super(context, str, scheduledExecutorService);
        }

        /* Access modifiers changed, original: protected|final */
        /* renamed from: ˋ */
        public final void m37(Map<String, String> map) {
            map.put("is_first_launch", Boolean.toString(true));
            AppsFlyerLib.f69.onInstallConversionDataLoaded(map);
            AppsFlyerLib.m63((Context) this.f55.get(), "appsflyerConversionDataRequestRetries", 0);
        }

        /* renamed from: ॱ */
        public final String m38() {
            return ServerConfigHandler.getUrl("https://%sapi.%s/install_data/v3/");
        }

        /* Access modifiers changed, original: protected|final */
        /* renamed from: ॱ */
        public final void m39(String str, int i) {
            AppsFlyerLib.f69.onInstallConversionFailure(str);
            if (i >= 400 && i < 500) {
                AppsFlyerLib.m63((Context) this.f55.get(), "appsflyerConversionDataRequestRetries", AppsFlyerLib.m57((Context) this.f55.get()).getInt("appsflyerConversionDataRequestRetries", 0) + 1);
            }
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f67);
        stringBuilder.append("/androidevent?buildnumber=4.9.0&app_id=");
        f70 = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://%sattr.%s/api/v");
        stringBuilder.append(f70);
        f63 = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://%st.%s/api/v");
        stringBuilder.append(f70);
        f59 = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://%sevents.%s/api/v");
        stringBuilder.append(f70);
        f61 = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://%sregister.%s/api/v");
        stringBuilder.append(f70);
        f64 = stringBuilder.toString();
    }

    private AppsFlyerLib() {
        AFVersionDeclaration.init();
    }

    public static AppsFlyerLib getInstance() {
        return f62;
    }

    /* renamed from: ʻ */
    private static boolean m40(Context context) {
        if (context != null) {
            if (VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                        if (networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e);
                    return false;
                }
            } else if (VERSION.SDK_INT >= 16) {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e2);
                }
            }
        }
        return false;
    }

    /* renamed from: ʼ */
    private static String m41(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        string = m58(new WeakReference(context), "AF_STORE");
        return string == null ? null : string;
    }

    /* renamed from: ʽ */
    private static float m42(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra(Param.LEVEL, -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            return (intExtra == -1 || intExtra2 == -1) ? 50.0f : (((float) intExtra) / ((float) intExtra2)) * 100.0f;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return 1.0f;
        }
    }

    /* renamed from: ˊ */
    static int m43(SharedPreferences sharedPreferences) {
        return m56(sharedPreferences, "appsFlyerCount", false);
    }

    /* renamed from: ˊ */
    private static Map<String, String> m44(Context context) throws k {
        String string = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return m50(string);
        }
        throw new k();
    }

    /* renamed from: ˊ */
    private static void m45(Context context, String str) {
        Intent intent = new Intent("com.appsflyer.testIntgrationBroadcast");
        intent.putExtra("params", str);
        if (VERSION.SDK_INT < 26) {
            context.sendBroadcast(intent);
        } else if (context.getPackageManager().queryBroadcastReceivers(intent, 0).toString().contains("com.appsflyer.referrerSender")) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName("com.appsflyer.referrerSender", "com.appsflyer.referrerSender.Receiver"));
            context.sendBroadcast(intent2);
        }
    }

    /* renamed from: ˊ */
    private boolean m46() {
        if (this.f92 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f92;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long j = this.f92;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j));
            j = this.f87;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j));
            if (currentTimeMillis < this.f82 && !isTrackingStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.f82)}));
                return true;
            } else if (!isTrackingStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{format, format2, Long.valueOf(currentTimeMillis)}));
                return false;
            }
        } else if (!isTrackingStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    @Nullable
    /* renamed from: ˋ */
    private static String m47(String str, PackageManager packageManager, String str2) {
        try {
            Bundle bundle = packageManager.getApplicationInfo(str2, 128).metaData;
            if (bundle != null) {
                Object obj = bundle.get(str);
                if (obj != null) {
                    return obj.toString();
                }
            }
        } catch (Throwable th) {
            StringBuilder stringBuilder = new StringBuilder("Could not find ");
            stringBuilder.append(str);
            stringBuilder.append(" value in the manifest");
            AFLogger.afErrorLog(stringBuilder.toString(), th);
        }
        return null;
    }

    @Nullable
    /* renamed from: ˋ */
    private static String m48(WeakReference<Context> weakReference) {
        Object string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = m58((WeakReference) weakReference, "CHANNEL");
        }
        return (string == null || !string.equals("")) ? string : null;
    }

    /* renamed from: ˋ */
    private static Map<String, String> m49(Context context, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (String str2 : str.split("&")) {
            Object substring;
            Object obj;
            int indexOf = str2.indexOf("=");
            if (indexOf > 0) {
                substring = str2.substring(0, indexOf);
            } else {
                String substring2 = str2;
            }
            if (linkedHashMap.containsKey(substring2)) {
                obj = substring2;
            } else {
                if (substring2.equals(Constants.URL_CAMPAIGN)) {
                    obj = Param.CAMPAIGN;
                } else if (substring2.equals(Constants.URL_MEDIA_SOURCE)) {
                    String str3 = "media_source";
                } else if (substring2.equals("af_prt")) {
                    obj = "agency";
                    i = 1;
                } else {
                    obj = substring2;
                }
                linkedHashMap.put(obj, "");
            }
            if (indexOf > 0) {
                indexOf++;
                if (str2.length() > indexOf) {
                    substring2 = str2.substring(indexOf);
                    linkedHashMap.put(obj, substring2);
                }
            }
            substring2 = null;
            linkedHashMap.put(obj, substring2);
        }
        try {
            if (!linkedHashMap.containsKey("install_time")) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                long j = packageInfo.firstInstallTime;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                linkedHashMap.put("install_time", simpleDateFormat.format(new Date(j)));
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Could not fetch install time. ", e);
        }
        if (!linkedHashMap.containsKey("af_status")) {
            linkedHashMap.put("af_status", "Non-organic");
        }
        if (i != 0) {
            linkedHashMap.remove("media_source");
        }
        return linkedHashMap;
    }

    /* renamed from: ˋ */
    private static Map<String, String> m50(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (!f68.contains(str2)) {
                    String string = jSONObject.getString(str2);
                    if (!(TextUtils.isEmpty(string) || "null".equals(string))) {
                        hashMap.put(str2, string);
                    }
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: ˋ */
    private void m51(Application application) {
        AppsFlyerProperties.getInstance().loadProperties(application.getApplicationContext());
        if (VERSION.SDK_INT < 14) {
            AFLogger.afInfoLog("SDK<14 call trackEvent manually");
            AFLogger.afInfoLog("onBecameForeground");
            getInstance().f74 = System.currentTimeMillis();
            getInstance().m73((Context) application, null, null);
            AFLogger.resetDeltaTime();
        } else if (VERSION.SDK_INT >= 14 && this.f73 == null) {
            m.m145();
            this.f73 = new d() {
                /* renamed from: ˊ */
                public final void m32(Activity activity) {
                    if (2 > AppsFlyerLib.m43(AppsFlyerLib.m57((Context) activity))) {
                        i ˏ = i.m136(activity);
                        ˏ.f163.post(ˏ.f161);
                        ˏ.f163.post(ˏ.f166);
                    }
                    AFLogger.afInfoLog("onBecameForeground");
                    AppsFlyerLib.getInstance().m76();
                    AppsFlyerLib.getInstance().m73((Context) activity, null, null);
                    AFLogger.resetDeltaTime();
                }

                /* renamed from: ˊ */
                public final void m33(WeakReference<Context> weakReference) {
                    com.appsflyer.AFDeepLinkManager.AnonymousClass3.m5((Context) weakReference.get());
                    i ˏ = i.m136((Context) weakReference.get());
                    ˏ.f163.post(ˏ.f161);
                }
            };
            m.m146().m147(application, this.f73);
        }
    }

    /* renamed from: ˋ */
    private static void m52(Context context, String str, String str2, String str3) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.IS_MONITOR, false)) {
            Intent intent = new Intent("com.appsflyer.MonitorBroadcast");
            intent.setPackage("com.appsflyer.nightvision");
            intent.putExtra("message", str2);
            intent.putExtra(Param.VALUE, str3);
            intent.putExtra("packageName", "true");
            intent.putExtra(Constants.URL_MEDIA_SOURCE, new Integer(Process.myPid()));
            intent.putExtra("eventIdentifier", str);
            intent.putExtra("sdk", BuildConfig.VERSION_NAME);
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: ˋ */
    private static void m53(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!(scheduledExecutorService.isShutdown() || scheduledExecutorService.isTerminated())) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
    }

    /* renamed from: ˋ */
    private static void m54(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get((String) keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException e) {
            }
        }
        Collections.sort(arrayList);
        Iterator keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String str2 = (String) keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(str2));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        try {
                            if (jSONArray2.getLong(i2) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                str = str2;
                                i2++;
                            }
                        } catch (JSONException e2) {
                        }
                    }
                    continue;
                } catch (JSONException e3) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    /* renamed from: ˋ */
    private static boolean m55(@NonNull Context context) {
        if (m56(context.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false) > 2) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 2, ");
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (com.appsflyer.AFExecutor.3.AnonymousClass5.m7(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", th);
            return false;
        }
    }

    /* renamed from: ˎ */
    private static int m56(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            i++;
            Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        }
        if (s.m169().m174()) {
            s.m169().m181(String.valueOf(i));
        }
        return i;
    }

    /* renamed from: ˎ */
    static SharedPreferences m57(Context context) {
        return context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
    }

    @Nullable
    /* renamed from: ˎ */
    private static String m58(WeakReference<Context> weakReference, String str) {
        return weakReference.get() == null ? null : m47(str, ((Context) weakReference.get()).getPackageManager(), ((Context) weakReference.get()).getPackageName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065 A:{SYNTHETIC, Splitter:B:32:0x0065} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a A:{Catch:{ Throwable -> 0x008d }} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045 A:{SYNTHETIC, Splitter:B:17:0x0045} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065 A:{SYNTHETIC, Splitter:B:32:0x0065} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a A:{Catch:{ Throwable -> 0x008d }} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045 A:{SYNTHETIC, Splitter:B:17:0x0045} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065 A:{SYNTHETIC, Splitter:B:32:0x0065} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a A:{Catch:{ Throwable -> 0x008d }} */
    /* JADX WARNING: Missing block: B:19:0x0048, code skipped:
            if (r3 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @NonNull
    /* renamed from: ˎ */
    static String m59(HttpURLConnection httpURLConnection) {
        Reader inputStreamReader;
        String readLine;
        Throwable th;
        StringBuilder stringBuilder;
        JSONObject jSONObject;
        StringBuilder stringBuilder2 = new StringBuilder();
        Reader bufferedReader;
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                errorStream = httpURLConnection.getInputStream();
            }
            inputStreamReader = new InputStreamReader(errorStream);
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuilder2.append(readLine);
                        stringBuilder2.append(10);
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                throw th;
                            }
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                if (bufferedReader != null) {
                }
                if (inputStreamReader != null) {
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            inputStreamReader = null;
            if (bufferedReader != null) {
            }
            if (inputStreamReader != null) {
            }
            throw th;
        }
        inputStreamReader.close();
        readLine = stringBuilder2.toString();
        try {
            jSONObject = new JSONObject(readLine);
            return readLine;
        } catch (JSONException e) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("string_response", readLine);
                return jSONObject.toString();
            } catch (JSONException e2) {
                return new JSONObject().toString();
            }
        }
    }

    /* renamed from: ˎ */
    private static void m60(Context context, String str, long j) {
        Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putLong(str, j);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    /* renamed from: ˎ */
    private static void m61(Context context, String str, String str2) {
        Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putString(str, str2);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    /* renamed from: ˏ */
    private static String m62(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke(null, new Object[]{str});
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: ˏ */
    private static void m63(Context context, String str, int i) {
        Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putInt(str, i);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    /* renamed from: ˏ */
    private void m64(Context context, String str, String str2, String str3, String str4, Intent intent, String str5) {
        Context applicationContext = context.getApplicationContext();
        Object obj = null;
        Object obj2 = str2 == null ? 1 : null;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null) {
            obj = 1;
        }
        if (obj != null) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        if (obj2 != null) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (m46()) {
                return;
            }
            this.f92 = System.currentTimeMillis();
        }
        m53(AFExecutor.getInstance().m10(), new a(this, new WeakReference(applicationContext), str, str2, str3, str4, false, intent, str5, (byte) 0), 150, TimeUnit.MILLISECONDS);
    }

    /* renamed from: ˏ */
    private static void m65(Context context, Map<String, ? super String> map) {
        h hVar = d.f154;
        a ˊ = h.m134(context);
        map.put("network", ˊ.m131());
        if (ˊ.m132() != null) {
            map.put("operator", ˊ.m132());
        }
        if (ˊ.m133() != null) {
            map.put("carrier", ˊ.m133());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0244 A:{Catch:{ k -> 0x0227, all -> 0x01a3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0235 A:{Catch:{ k -> 0x0227, all -> 0x01a3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ˏ */
    private void m66(URL url, String str, String str2, WeakReference<Context> weakReference, String str3, boolean z) throws IOException {
        Throwable th;
        Writer writer;
        Context context = (Context) weakReference.get();
        Object obj = (!z || f69 == null) ? null : 1;
        HttpURLConnection httpURLConnection;
        try {
            s.m169().m176(url.toString(), str);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setRequestMethod(CommsUtils.HTTP_ACTION_POST);
                httpURLConnection.setRequestProperty(CommsUtils.HTTP_HEADER_CONTENT_LENGTH, String.valueOf(str.getBytes().length));
                httpURLConnection.setRequestProperty(CommsUtils.HTTP_HEADER_CONTENT_TYPE, CommsUtils.HTTP_HEADER_ACCEPT_JSON);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoOutput(true);
                try {
                    Writer outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                    try {
                        outputStreamWriter.write(str);
                        outputStreamWriter.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        String ˎ = m59(httpURLConnection);
                        s.m169().m182(url.toString(), responseCode, ˎ);
                        AFLogger.afInfoLog("response code: ".concat(String.valueOf(responseCode)));
                        m52(context, LOG_TAG, "SERVER_RESPONSE_CODE", Integer.toString(responseCode));
                        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        if (responseCode == 200) {
                            if (weakReference.get() != null && z) {
                                this.f87 = System.currentTimeMillis();
                                if (f60 != null) {
                                    f60.onTrackingRequestSuccess();
                                }
                            }
                            String string = AppsFlyerProperties.getInstance().getString("afUninstallToken");
                            if (string != null) {
                                AFLogger.afDebugLog("Uninstall Token exists: ".concat(String.valueOf(string)));
                                if (!sharedPreferences.getBoolean("sentRegisterRequestToAF", false)) {
                                    AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(string)));
                                    y.m204(context, new b(string));
                                }
                            } else if (AppsFlyerProperties.getInstance().getString("gcmProjectNumber") != null) {
                                AFLogger.afDebugLog("GCM Project number exists. Fetching token and sending to AF servers");
                                new a(new WeakReference(context)).execute(new Void[0]);
                            }
                            if (this.latestDeepLink != null) {
                                this.latestDeepLink = null;
                            }
                            if (str3 != null) {
                                CacheManager.getInstance().deleteRequest(str3, context);
                            }
                            if (weakReference.get() != null && str3 == null) {
                                m61(context, "sentSuccessfully", "true");
                                if (!this.f90 && System.currentTimeMillis() - this.f91 >= 15000) {
                                    if (this.f71 == null) {
                                        this.f71 = AFExecutor.getInstance().m10();
                                        m53(this.f71, new c(context), 1, TimeUnit.SECONDS);
                                    }
                                }
                            }
                            this.f83 = ServerConfigHandler.m89(ˎ).optBoolean("send_background", false);
                        } else if (f60 != null) {
                            f60.onTrackingRequestFailure("Failure: ".concat(String.valueOf(responseCode)));
                        }
                        responseCode = sharedPreferences.getInt("appsflyerConversionDataRequestRetries", 0);
                        long j = sharedPreferences.getLong("appsflyerConversionDataCacheExpiration", 0);
                        if (j != 0 && System.currentTimeMillis() - j > 5184000000L) {
                            m61(context, "attributionId", null);
                            m60(context, "appsflyerConversionDataCacheExpiration", 0);
                        }
                        if (sharedPreferences.getString("attributionId", null) == null && str2 != null && obj != null && f69 != null && responseCode <= 5) {
                            ScheduledExecutorService ˏ = AFExecutor.getInstance().m10();
                            m53(ˏ, new e(context.getApplicationContext(), str2, ˏ), 10, TimeUnit.MILLISECONDS);
                        } else if (str2 == null) {
                            AFLogger.afWarnLog("AppsFlyer dev key is missing.");
                        } else if (!(obj == null || f69 == null || sharedPreferences.getString("attributionId", null) == null || m56(sharedPreferences, "appsFlyerCount", false) <= 1)) {
                            Map ˊ = m44(context);
                            if (ˊ != null) {
                                try {
                                    if (!ˊ.containsKey("is_first_launch")) {
                                        ˊ.put("is_first_launch", Boolean.toString(false));
                                    }
                                    f69.onInstallConversionDataLoaded(ˊ);
                                } catch (Throwable th2) {
                                    AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        writer = outputStreamWriter;
                        if (writer == null) {
                            writer.close();
                        } else if (f60 != null) {
                            f60.onTrackingRequestFailure("No Connectivity");
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    writer = null;
                    if (writer == null) {
                    }
                    throw th2;
                }
            } catch (k e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            } catch (Throwable th5) {
                th2 = th5;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th2;
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th6) {
            th2 = th6;
            httpURLConnection = null;
            if (httpURLConnection != null) {
            }
            throw th2;
        }
    }

    /* renamed from: ॱ */
    private static File m67(String str) {
        if (str != null) {
            try {
                if (str.trim().length() > 0) {
                    return new File(str.trim());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        return null;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0047=Splitter:B:27:0x0047, B:18:0x002f=Splitter:B:18:0x002f} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A:{SYNTHETIC, Splitter:B:21:0x0038} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A:{SYNTHETIC, Splitter:B:13:0x0029} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ॱ */
    private static String m68(File file, String str) {
        Throwable th;
        Reader reader;
        Throwable th2;
        String str2 = null;
        Reader fileReader;
        try {
            Properties properties = new Properties();
            fileReader = new FileReader(file);
            try {
                properties.load(fileReader);
                AFLogger.afInfoLog("Found PreInstall property!");
                str2 = properties.getProperty(str);
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    AFLogger.afErrorLog(th3.getMessage(), th3);
                }
            } catch (FileNotFoundException e) {
            } catch (Throwable th4) {
                th = th4;
                try {
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable th32) {
                            AFLogger.afErrorLog(th32.getMessage(), th32);
                        }
                    }
                    return str2;
                } catch (Throwable th5) {
                    reader = fileReader;
                    th2 = th5;
                    if (reader != null) {
                    }
                    throw th2;
                }
            }
        } catch (FileNotFoundException e2) {
            fileReader = str2;
            StringBuilder stringBuilder = new StringBuilder("PreInstall file wasn't found: ");
            stringBuilder.append(file.getAbsolutePath());
            AFLogger.afDebugLog(stringBuilder.toString());
            if (fileReader != null) {
                fileReader.close();
            }
            return str2;
        } catch (Throwable th322) {
            reader = str2;
            th2 = th322;
            if (reader != null) {
                try {
                    reader.close();
                } catch (Throwable th3222) {
                    AFLogger.afErrorLog(th3222.getMessage(), th3222);
                }
            }
            throw th2;
        }
        return str2;
    }

    /* renamed from: ॱ */
    static void m69(Context context, String str) {
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            JSONObject jSONObject;
            JSONArray jSONArray;
            long currentTimeMillis = System.currentTimeMillis();
            String string = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("extraReferrers", null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                    jSONObject = jSONObject2;
                } else {
                    jSONArray = new JSONArray();
                    jSONObject = jSONObject2;
                }
            }
            if (((long) jSONArray.length()) < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (((long) jSONObject.length()) >= 4) {
                m54(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            string = jSONObject.toString();
            Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
            edit.putString("extraReferrers", string);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        } catch (JSONException e) {
        } catch (Throwable th) {
            StringBuilder stringBuilder = new StringBuilder("Couldn't save referrer - ");
            stringBuilder.append(str);
            stringBuilder.append(": ");
            AFLogger.afErrorLog(stringBuilder.toString(), th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void ॱ(AppsFlyerLib appsFlyerLib, Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, Intent intent, String str5) {
        if (context == null) {
            AFLogger.afDebugLog("sendTrackingWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
        if (!appsFlyerLib.isTrackingStopped()) {
            StringBuilder stringBuilder = new StringBuilder("sendTrackingWithEvent from activity: ");
            stringBuilder.append(context.getClass().getName());
            AFLogger.afInfoLog(stringBuilder.toString());
        }
        boolean z3 = str2 == null;
        Map ˎ = appsFlyerLib.m74(context, str, str2, str3, str4, z, sharedPreferences, z3, intent, str5);
        String str6 = (String) ˎ.get("appsflyerKey");
        if (str6 == null || str6.length() == 0) {
            AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
            return;
        }
        int i;
        ScheduledExecutorService ˏ;
        if (!appsFlyerLib.isTrackingStopped()) {
            AFLogger.afInfoLog("AppsFlyerLib.sendTrackingWithEvent");
        }
        str6 = z3 ? z2 ? f63 : f59 : f61;
        str6 = ServerConfigHandler.getUrl(str6);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str6);
        stringBuilder2.append(context.getPackageName());
        String obj = stringBuilder2.toString();
        int ˎ2 = m56(sharedPreferences, "appsFlyerCount", false);
        Object obj2 = (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) ? 1 : null;
        if (obj2 == null && ˎ.get(ServerParameters.ADVERTISING_ID_PARAM) != null) {
            try {
                if (TextUtils.isEmpty(appsFlyerLib.f79) && ˎ.remove("android_id") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (TextUtils.isEmpty(appsFlyerLib.f88) && ˎ.remove("imei") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
        Runnable bVar = new b(appsFlyerLib, obj, ˎ, context.getApplicationContext(), z3, ˎ2, (byte) 0);
        if (z3 && m55(context)) {
            obj2 = (appsFlyerLib.f93 == null || appsFlyerLib.f93.size() <= 0) ? null : 1;
            if (obj2 == null) {
                i = 500;
                AFLogger.afDebugLog("Failed to get new referrer, wait ...");
                if (AFDeepLinkManager.f12) {
                    ˏ = AFExecutor.getInstance().m10();
                } else {
                    AFLogger.afRDLog("ESP deeplink: execute launch on SerialExecutor");
                    ˏ = AFExecutor.getInstance().getSerialExecutor();
                }
                m53(ˏ, bVar, (long) i, TimeUnit.MILLISECONDS);
            }
        }
        i = 0;
        if (AFDeepLinkManager.f12) {
        }
        m53(ˏ, bVar, (long) i, TimeUnit.MILLISECONDS);
    }

    static /* synthetic */ void ॱ(AppsFlyerLib appsFlyerLib, String str, String str2, String str3, WeakReference weakReference, String str4, boolean z) throws IOException {
        URL url = new URL(str);
        StringBuilder stringBuilder = new StringBuilder("url: ");
        stringBuilder.append(url.toString());
        AFLogger.afInfoLog(stringBuilder.toString());
        a.m129("data: ".concat(String.valueOf(str2)));
        m52((Context) weakReference.get(), LOG_TAG, "EVENT_DATA", str2);
        try {
            appsFlyerLib.m66(url, str2, str3, weakReference, str4, z);
        } catch (IOException e) {
            AFLogger.afErrorLog("Exception in sendRequestToServer. ", e);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                appsFlyerLib.m66(new URL(str.replace("https:", "http:")), str2, str3, weakReference, str4, z);
                return;
            }
            stringBuilder = new StringBuilder("failed to send requeset to server. ");
            stringBuilder.append(e.getLocalizedMessage());
            AFLogger.afInfoLog(stringBuilder.toString());
            m52((Context) weakReference.get(), LOG_TAG, "ERROR", e.getLocalizedMessage());
            throw e;
        }
    }

    /* renamed from: ॱ */
    private static boolean m70(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* renamed from: ॱॱ */
    private static boolean m71(Context context) {
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false);
        return z || !m70(context);
    }

    /* renamed from: ᐝ */
    private static String m72(Context context, String str) throws NameNotFoundException {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        if (sharedPreferences.contains("CACHED_CHANNEL")) {
            return sharedPreferences.getString("CACHED_CHANNEL", null);
        }
        m61(context, "CACHED_CHANNEL", str);
        return str;
    }

    public AppsFlyerLib enableLocationCollection(boolean z) {
        this.f76 = z;
        return this;
    }

    public void enableUninstallTracking(String str) {
        s.m169().m177("enableUninstallTracking", str);
        AppsFlyerProperties.getInstance().set("gcmProjectNumber", str);
    }

    public String getAppsFlyerUID(Context context) {
        s.m169().m177("getAppsFlyerUID", new String[0]);
        return C0000r.m164(new WeakReference(context));
    }

    public String getAttributionId(ContentResolver contentResolver) {
        String str = null;
        Cursor query = contentResolver.query(Uri.parse(ATTRIBUTION_ID_CONTENT_URI), new String[]{ATTRIBUTION_ID_COLUMN_NAME}, str, str, str);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndex(ATTRIBUTION_ID_COLUMN_NAME));
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e) {
                            AFLogger.afErrorLog(e.getMessage(), e);
                        }
                    }
                    return str;
                }
            } catch (Exception e2) {
                AFLogger.afErrorLog("Could not collect cursor attribution. ", e2);
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e22) {
                        AFLogger.afErrorLog(e22.getMessage(), e22);
                    }
                }
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e3) {
                        AFLogger.afErrorLog(e3.getMessage(), e3);
                    }
                }
            }
        }
        if (query != null) {
            try {
                query.close();
            } catch (Exception e222) {
                AFLogger.afErrorLog(e222.getMessage(), e222);
            }
        }
        return str;
    }

    /* Access modifiers changed, original: protected */
    public void getConversionData(Context context, final ConversionDataListener conversionDataListener) {
        f69 = new AppsFlyerConversionListener() {
            public final void onAppOpenAttribution(Map<String, String> map) {
            }

            public final void onAttributionFailure(String str) {
            }

            public final void onInstallConversionDataLoaded(Map<String, String> map) {
                conversionDataListener.onConversionDataLoaded(map);
            }

            public final void onInstallConversionFailure(String str) {
                conversionDataListener.onConversionFailure(str);
            }
        };
    }

    public String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        return string != null ? string : ServerParameters.DEFAULT_HOST;
    }

    public String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        return string != null ? string : "";
    }

    public String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        string = m58(new WeakReference(context), "AF_STORE");
        if (string != null) {
            return string;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    public String getSdkVersion() {
        s.m169().m177("getSdkVersion", new String[0]);
        return "version: 4.9.0 (build 184)";
    }

    /* Access modifiers changed, original: protected */
    public void handleDeepLinkCallback(Context context, Map<String, Object> map, Uri uri) {
        Map ˋ;
        Object obj = uri.toString();
        if (obj == null) {
            obj = null;
        } else {
            Matcher matcher = Pattern.compile("fb\\d*?://authorize.*access_token=([^&]*)").matcher(obj);
            if (matcher.find()) {
                obj = new StringBuilder(obj).replace(matcher.start(1), matcher.end(1), "").toString().replaceFirst("&access_token=", "").replaceFirst("access_token=&", "").replaceFirst("access_token=", "");
            }
        }
        if (!map.containsKey("af_deeplink")) {
            map.put("af_deeplink", obj);
        }
        if (uri.getQueryParameter("af_deeplink") != null) {
            boolean z = "AppsFlyer_Test".equals(uri.getQueryParameter("media_source")) && Boolean.parseBoolean(uri.getQueryParameter("is_retargeting"));
            this.f77 = z;
            ˋ = m49(context, uri.getQuery());
            String path = uri.getPath();
            if (path != null) {
                ˋ.put("path", path);
            }
            path = uri.getScheme();
            if (path != null) {
                ˋ.put("scheme", path);
            }
            path = uri.getHost();
            if (path != null) {
                ˋ.put("host", path);
            }
        } else {
            ˋ = new HashMap();
            ˋ.put("link", uri.toString());
        }
        final WeakReference weakReference = new WeakReference(context);
        t tVar = new t(uri, this);
        tVar.setConnProvider(new HttpsUrlConnectionProvider());
        if (tVar.m198()) {
            tVar.m195(new c() {
                /* renamed from: ˋ */
                private void m27(Map<String, String> map) {
                    if (weakReference.get() != null) {
                        AppsFlyerLib.m61((Context) weakReference.get(), "deeplinkAttribution", new JSONObject(map).toString());
                    }
                }

                /* renamed from: ˊ */
                public final void m28(Map<String, String> map) {
                    for (String str : map.keySet()) {
                        ˋ.put(str, map.get(str));
                    }
                    m27(ˋ);
                    AppsFlyerLib.ˊ(ˋ);
                }

                /* renamed from: ˏ */
                public final void m29(String str) {
                    if (AppsFlyerLib.f69 != null) {
                        m27(ˋ);
                        AppsFlyerLib.f69.onAttributionFailure(str);
                    }
                }
            });
            AFExecutor.getInstance().getThreadPoolExecutor().execute(tVar);
        } else if (f69 != null) {
            try {
                f69.onAppOpenAttribution(ˋ);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener) {
        s ˏ = s.m169();
        String str2 = appsFlyerConversionListener == null ? "null" : "conversionDataListener";
        ˏ.m177("init", str, str2);
        AFLogger.m22(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{BuildConfig.VERSION_NAME, "184"}));
        this.f86 = true;
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str);
        a.m130(str);
        f69 = appsFlyerConversionListener;
        return this;
    }

    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if (context == null) {
            AFLogger.afWarnLog("init :: context is null, Google Install Referrer will be not initialized!");
        } else if (m55(context)) {
            if (this.f89 == null) {
                this.f89 = new e();
                this.f89.m113(context, this);
            } else {
                AFLogger.afWarnLog("AFInstallReferrer instance already created");
            }
        }
        return init(str, appsFlyerConversionListener);
    }

    public boolean isPreInstalledApp(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
        } catch (NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
            return false;
        }
    }

    public boolean isTrackingStopped() {
        return this.f84;
    }

    public void onHandleReferrer(Map<String, String> map) {
        this.f93 = map;
    }

    public void onPause(Context context) {
        com.appsflyer.AFDeepLinkManager.AnonymousClass3.m5(context);
        i ˏ = i.m136(context);
        ˏ.f163.post(ˏ.f161);
    }

    public void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        s.m169().m177("registerConversionListener", new String[0]);
        if (appsFlyerConversionListener != null) {
            f69 = appsFlyerConversionListener;
        }
    }

    public void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        s.m169().m177("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            f66 = appsFlyerInAppPurchaseValidatorListener;
        }
    }

    public void reportTrackSession(Context context) {
        s.m169().m177("reportTrackSession", new String[0]);
        s.m169().m185();
        m73(context, null, null);
    }

    public void sendDeepLinkData(Activity activity) {
        if (activity != null && activity.getIntent() != null) {
            s ˏ = s.m169();
            String localClassName = activity.getLocalClassName();
            new StringBuilder("activity_intent_").append(activity.getIntent().toString());
            ˏ.m177("sendDeepLinkData", localClassName, r2.toString());
        } else if (activity != null) {
            s.m169().m177("sendDeepLinkData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            s.m169().m177("sendDeepLinkData", "activity_null");
        }
        try {
            m51(activity.getApplication());
            StringBuilder stringBuilder = new StringBuilder("getDeepLinkData with activity ");
            stringBuilder.append(activity.getIntent().getDataString());
            AFLogger.afInfoLog(stringBuilder.toString());
        } catch (Exception e) {
            AFLogger.afInfoLog("getDeepLinkData Exception: ".concat(String.valueOf(e)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendPushNotificationData(Activity activity) {
        String str;
        Object th;
        StringBuilder stringBuilder;
        if (activity != null && activity.getIntent() != null) {
            s ˏ = s.m169();
            String localClassName = activity.getLocalClassName();
            new StringBuilder("activity_intent_").append(activity.getIntent().toString());
            ˏ.m177("sendPushNotificationData", localClassName, r5.toString());
        } else if (activity != null) {
            s.m169().m177("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            s.m169().m177("sendPushNotificationData", "activity_null");
        }
        if (activity instanceof Activity) {
            Activity activity2 = activity;
            Intent intent = activity2.getIntent();
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("af");
                    if (string != null) {
                        AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(string)));
                        extras.remove("af");
                        activity2.setIntent(intent.putExtras(extras));
                        str = string;
                    } else {
                        str = string;
                    }
                    this.f80 = str;
                    if (this.f80 == null) {
                        long j;
                        StringBuilder stringBuilder2;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (this.f75 == null) {
                            AFLogger.afInfoLog("pushes: initializing pushes history..");
                            this.f75 = new ConcurrentHashMap();
                            j = currentTimeMillis;
                        } else {
                            try {
                                long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000);
                                j = currentTimeMillis;
                                for (Long l : this.f75.keySet()) {
                                    try {
                                        JSONObject jSONObject = new JSONObject(this.f80);
                                        JSONObject jSONObject2 = new JSONObject((String) this.f75.get(l));
                                        if (jSONObject.get(Constants.URL_MEDIA_SOURCE).equals(jSONObject2.get(Constants.URL_MEDIA_SOURCE)) && jSONObject.get(Constants.URL_CAMPAIGN).equals(jSONObject2.get(Constants.URL_CAMPAIGN))) {
                                            stringBuilder2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID was already acknowledged! (old: ");
                                            stringBuilder2.append(jSONObject2);
                                            stringBuilder2.append(", new: ");
                                            stringBuilder2.append(jSONObject);
                                            stringBuilder2.append(")");
                                            AFLogger.afInfoLog(stringBuilder2.toString());
                                            this.f80 = null;
                                            return;
                                        }
                                        if (currentTimeMillis - l.longValue() > j2) {
                                            this.f75.remove(l);
                                        }
                                        if (l.longValue() <= j) {
                                            j = l.longValue();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        stringBuilder = new StringBuilder("Error while handling push notification measurement: ");
                                        stringBuilder.append(th.getClass().getSimpleName());
                                        AFLogger.afErrorLog(stringBuilder.toString(), th);
                                        if (this.f75.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                        }
                                        this.f75.put(Long.valueOf(currentTimeMillis), this.f80);
                                        m51(activity.getApplication());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                j = currentTimeMillis;
                                stringBuilder = new StringBuilder("Error while handling push notification measurement: ");
                                stringBuilder.append(th.getClass().getSimpleName());
                                AFLogger.afErrorLog(stringBuilder.toString(), th);
                                if (this.f75.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                }
                                this.f75.put(Long.valueOf(currentTimeMillis), this.f80);
                                m51(activity.getApplication());
                                return;
                            }
                        }
                        if (this.f75.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                            stringBuilder2 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                            stringBuilder2.append(j);
                            stringBuilder2.append(")");
                            AFLogger.afInfoLog(stringBuilder2.toString());
                            this.f75.remove(Long.valueOf(j));
                        }
                        this.f75.put(Long.valueOf(currentTimeMillis), this.f80);
                        m51(activity.getApplication());
                        return;
                    }
                    return;
                }
            }
        }
        str = null;
        this.f80 = str;
        if (this.f80 == null) {
        }
    }

    public void setAdditionalData(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            s.m169().m177("setAdditionalData", hashMap.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(hashMap).toString());
        }
    }

    public void setAndroidIdData(String str) {
        s.m169().m177("setAndroidIdData", str);
        this.f79 = str;
    }

    public void setAppId(String str) {
        s.m169().m177("setAppId", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_ID, str);
    }

    public void setAppInviteOneLink(String str) {
        s.m169().m177("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_ID, str);
    }

    @Deprecated
    public void setAppUserId(String str) {
        s.m169().m177("setAppUserId", str);
        setCustomerUserId(str);
    }

    public void setCollectAndroidID(boolean z) {
        s.m169().m177("setCollectAndroidID", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
    }

    @Deprecated
    public void setCollectFingerPrint(boolean z) {
        s.m169().m177("setCollectFingerPrint", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_FINGER_PRINT, Boolean.toString(z));
    }

    public void setCollectIMEI(boolean z) {
        s.m169().m177("setCollectIMEI", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
    }

    public void setConsumeAFDeepLinks(boolean z) {
        AppsFlyerProperties.getInstance().set("consumeAfDeepLink", z);
        s.m169().m177("setConsumeAFDeepLinks: ".concat(String.valueOf(z)), new String[0]);
    }

    public void setCurrencyCode(String str) {
        s.m169().m177("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    public void setCustomerIdAndTrack(String str, @NonNull Context context) {
        if (context != null) {
            boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null;
            if (z) {
                setCustomerUserId(str);
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
                StringBuilder stringBuilder = new StringBuilder("CustomerUserId set: ");
                stringBuilder.append(str);
                stringBuilder.append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(stringBuilder.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
                if (referrer == null) {
                    referrer = "";
                }
                m64(context, string, null, null, referrer, context instanceof Activity ? ((Activity) context).getIntent() : null, null);
                if (AppsFlyerProperties.getInstance().getString("afUninstallToken") != null) {
                    m75(context, AppsFlyerProperties.getInstance().getString("afUninstallToken"));
                    return;
                }
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
    }

    public void setCustomerUserId(String str) {
        s.m169().m177("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_USER_ID, str);
    }

    public void setDebugLog(boolean z) {
        s.m169().m177("setDebugLog", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("shouldLog", z);
        AppsFlyerProperties.getInstance().set("logLevel", (z ? LogLevel.DEBUG : LogLevel.NONE).getLevel());
    }

    /* Access modifiers changed, original: protected */
    public void setDeepLinkData(Intent intent) {
        if (intent != null) {
            try {
                if ("android.intent.action.VIEW".equals(intent.getAction())) {
                    this.latestDeepLink = intent.getData();
                    StringBuilder stringBuilder = new StringBuilder("Unity setDeepLinkData = ");
                    stringBuilder.append(this.latestDeepLink);
                    AFLogger.afDebugLog(stringBuilder.toString());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while setting deeplink data (unity). ", th);
            }
        }
    }

    public void setDeviceTrackingDisabled(boolean z) {
        s.m169().m177("setDeviceTrackingDisabled", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
    }

    public void setExtension(String str) {
        s.m169().m177("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    @Deprecated
    public void setGCMProjectID(String str) {
        s.m169().m177("setGCMProjectID", str);
        AFLogger.afWarnLog("Method 'setGCMProjectNumber' is deprecated. Please follow the documentation.");
        enableUninstallTracking(str);
    }

    @Deprecated
    public void setGCMProjectNumber(Context context, String str) {
        s.m169().m177("setGCMProjectNumber", str);
        AFLogger.afWarnLog("Method 'setGCMProjectNumber' is deprecated. Please use 'enableUninstallTracking'.");
        enableUninstallTracking(str);
    }

    @Deprecated
    public void setGCMProjectNumber(String str) {
        s.m169().m177("setGCMProjectNumber", str);
        AFLogger.afWarnLog("Method 'setGCMProjectNumber' is deprecated. Please follow the documentation.");
        enableUninstallTracking(str);
    }

    public void setHost(String str, String str2) {
        if (str != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
        }
        if (str2 == null || str2.isEmpty()) {
            AFLogger.afWarnLog("hostName cannot be null or empty");
        } else {
            AppsFlyerProperties.getInstance().set("custom_host", str2);
        }
    }

    @Deprecated
    public void setHostName(String str) {
        AppsFlyerProperties.getInstance().set("custom_host", str);
    }

    public void setImeiData(String str) {
        s.m169().m177("setImeiData", str);
        this.f88 = str;
    }

    public void setIsUpdate(boolean z) {
        s.m169().m177("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    public void setLogLevel(LogLevel logLevel) {
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    public void setMinTimeBetweenSessions(int i) {
        this.f82 = TimeUnit.SECONDS.toMillis((long) i);
    }

    public void setOutOfStore(String str) {
        if (str != null) {
            String toLowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", toLowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(toLowerCase)), true);
            return;
        }
        AFLogger.m20("Cannot set setOutOfStore with null");
    }

    public void setPluginDeepLinkData(Intent intent) {
        setDeepLinkData(intent);
    }

    public void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put(Constants.URL_MEDIA_SOURCE, str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            jSONObject.put(Constants.URL_CAMPAIGN, str2);
        }
        if (str3 != null) {
            jSONObject.put(Constants.URL_SITE_ID, str3);
        }
        if (jSONObject.has(Constants.URL_MEDIA_SOURCE)) {
            AppsFlyerProperties.getInstance().set("preInstallName", jSONObject.toString());
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    public void setResolveDeepLinkURLs(String... strArr) {
        s.m169().m177("setResolveDeepLinkURLs", Arrays.asList(strArr).toString());
        AFDeepLinkManager.f8 = strArr;
    }

    @Deprecated
    public void setUserEmail(String str) {
        s.m169().m177("setUserEmail", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.USER_EMAIL, str);
    }

    public void setUserEmails(EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        s.m169().m177("setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Object obj = null;
        for (String str : strArr) {
            switch (AnonymousClass5.f34[emailsCryptType.ordinal()]) {
                case 2:
                    obj = "md5_el_arr";
                    arrayList2.add(p.m158(str));
                    break;
                case 3:
                    obj = "sha256_el_arr";
                    arrayList2.add(p.m157(str));
                    break;
                case 4:
                    obj = "plain_el_arr";
                    arrayList2.add(str);
                    break;
                default:
                    obj = "sha1_el_arr";
                    arrayList2.add(p.m155(str));
                    break;
            }
        }
        hashMap.put(obj, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    public void setUserEmails(String... strArr) {
        s.m169().m177("setUserEmails", strArr);
        setUserEmails(EmailsCryptType.NONE, strArr);
    }

    public void startTracking(Application application) {
        if (this.f86) {
            startTracking(application, null);
        } else {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking(Application)' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        }
    }

    public void startTracking(Application application, String str) {
        startTracking(application, str, null);
    }

    public void startTracking(Application application, String str, AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
        s.m169().m177("startTracking", str);
        AFLogger.afInfoLog(String.format("Starting AppsFlyer Tracking: (v%s.%s)", new Object[]{BuildConfig.VERSION_NAME, "184"}));
        AFLogger.afInfoLog("Build Number: 184");
        AppsFlyerProperties.getInstance().loadProperties(application.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str);
            a.m130(str);
        } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY))) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
            return;
        }
        if (appsFlyerTrackingRequestListener != null) {
            f60 = appsFlyerTrackingRequestListener;
        }
        m51(application);
    }

    public void stopTracking(boolean z, Context context) {
        this.f84 = z;
        CacheManager.getInstance().clearCache(context);
        if (this.f84) {
            Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
            edit.putBoolean(IS_STOP_TRACKING_USED, true);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        }
    }

    public void trackAppLaunch(Context context, String str) {
        if (m55(context)) {
            if (this.f89 == null) {
                this.f89 = new e();
                this.f89.m113(context, this);
            } else {
                AFLogger.afWarnLog("AFInstallReferrer instance already created");
            }
        }
        m64(context, str, null, null, "", null, null);
    }

    public void trackEvent(Context context, String str, Map<String, Object> map) {
        Map hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            Map<String, Object> hashMap2 = map;
        }
        JSONObject jSONObject = new JSONObject(hashMap2);
        s.m169().m177("trackEvent", str, jSONObject.toString());
        m73(context, str, (Map) map);
    }

    public void trackLocation(Context context, double d, double d2) {
        s.m169().m177("trackLocation", String.valueOf(d), String.valueOf(d2));
        Map hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        m73(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
    }

    public void unregisterConversionListener() {
        s.m169().m177("unregisterConversionListener", new String[0]);
        f69 = null;
    }

    public void updateServerUninstallToken(Context context, String str) {
        if (str != null) {
            y.m204(context, new b(str));
        }
    }

    public void validateAndTrackInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        s ˏ = s.m169();
        String obj = map == null ? "" : map.toString();
        ˏ.m177("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, obj);
        if (!isTrackingStopped()) {
            StringBuilder stringBuilder = new StringBuilder("Validate in app called with parameters: ");
            stringBuilder.append(str3);
            stringBuilder.append(" ");
            stringBuilder.append(str4);
            stringBuilder.append(" ");
            stringBuilder.append(str5);
            AFLogger.afInfoLog(stringBuilder.toString());
        }
        if (str != null && str4 != null && str2 != null && str5 != null && str3 != null) {
            m53(AFExecutor.getInstance().m10(), new j(context.getApplicationContext(), AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY), str, str2, str3, str4, str5, map, context instanceof Activity ? ((Activity) context).getIntent() : null), 10, TimeUnit.MILLISECONDS);
        } else if (f66 != null) {
            f66.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    public void waitForCustomerUserId(boolean z) {
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˊ */
    public final void m73(Context context, String str, Map<String, Object> map) {
        Intent intent;
        String obj;
        String str2 = "";
        if (context instanceof Activity) {
            Object referrer;
            Activity activity = (Activity) context;
            intent = activity.getIntent();
            AFDeepLinkManager.getInstance().currentActivityHash = System.identityHashCode(activity);
            try {
                referrer = ActivityCompat.getReferrer(activity);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                referrer = null;
            }
            obj = referrer != null ? referrer.toString() : str2;
        } else {
            obj = "";
            intent = null;
        }
        if (AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY) == null) {
            AFLogger.afWarnLog("[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        Map map2;
        if (map2 == null) {
            map2 = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(map2);
        String referrer2 = AppsFlyerProperties.getInstance().getReferrer(context);
        String jSONObject2 = jSONObject.toString();
        if (referrer2 == null) {
            referrer2 = "";
        }
        m64(context, null, str, jSONObject2, referrer2, intent, obj);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04f4 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0506 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0517 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0541 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x054a A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x057c A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x05b6 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x05e3 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0603 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0be5  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x066d A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0698 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x06e0 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0852 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0870 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03a8 A:{SYNTHETIC, Splitter:B:133:0x03a8} */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0a33 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03ba A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03cc A:{Catch:{ Exception -> 0x0b51 }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x044f A:{Catch:{ Throwable -> 0x0be8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04b4 A:{Catch:{ Throwable -> 0x0be8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04f4 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0506 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0517 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0541 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x054a A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x057c A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05a9 A:{SKIP, Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x05b6 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x05e3 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0603 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x066d A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0be5  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0698 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x06e0 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0852 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0870 A:{Catch:{ Exception -> 0x0897, Throwable -> 0x088d }} */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Missing block: B:300:0x09da, code skipped:
            if (r2 != null) goto L_0x09dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ˎ */
    public final Map<String, Object> m74(Context context, String str, String str2, String str3, String str4, boolean z, SharedPreferences sharedPreferences, boolean z2, @Nullable Intent intent, @Nullable String str5) {
        StringBuilder stringBuilder;
        Throwable th;
        StringBuilder stringBuilder2;
        long currentTimeMillis;
        SharedPreferences sharedPreferences2;
        String string;
        Object obj;
        PackageInfo packageInfo;
        long j;
        l ॱ;
        boolean equals;
        int ˎ;
        HashMap hashMap;
        p pVar;
        StringBuilder stringBuilder3;
        Map<String, Object> hashMap2 = new HashMap();
        n.m148(context, hashMap2);
        long time = new Date().getTime();
        hashMap2.put("af_timestamp", Long.toString(time));
        String ˏ = a.m102(context, time);
        if (ˏ != null) {
            hashMap2.put("cksm_v1", ˏ);
        }
        try {
            if (isTrackingStopped()) {
                AFLogger.afInfoLog("SDK tracking has been stopped");
            } else {
                stringBuilder = new StringBuilder("******* sendTrackingWithEvent: ");
                stringBuilder.append(z2 ? "Launch" : str2);
                AFLogger.afInfoLog(stringBuilder.toString());
            }
            m52(context, LOG_TAG, "EVENT_CREATED_WITH_NAME", z2 ? "Launch" : str2);
            CacheManager.getInstance().init(context);
            List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!asList.contains("android.permission.INTERNET")) {
                AFLogger.afWarnLog("Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                m52(context, null, "PERMISSION_INTERNET_MISSING", null);
            }
            if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.afWarnLog("Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (!asList.contains("android.permission.ACCESS_WIFI_STATE")) {
                AFLogger.afWarnLog("Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml");
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while validation permissions. ", e);
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
        }
        if (z) {
            hashMap2.put("af_events_api", "1");
        }
        hashMap2.put("brand", Build.BRAND);
        hashMap2.put("device", Build.DEVICE);
        hashMap2.put("product", Build.PRODUCT);
        hashMap2.put("sdk", Integer.toString(VERSION.SDK_INT));
        hashMap2.put("model", Build.MODEL);
        hashMap2.put("deviceType", Build.TYPE);
        if (z2) {
            if ((context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ 1) != 0) {
                int i;
                if (!AppsFlyerProperties.getInstance().isOtherSdkStringDisabled()) {
                    hashMap2.put("batteryLevel", String.valueOf(m42(context)));
                }
                if ("OPPO".equals(Build.BRAND)) {
                    i = 23;
                    AFLogger.afRDLog("OPPO device found");
                } else {
                    i = 18;
                }
                if (VERSION.SDK_INT < i || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, false)) {
                    stringBuilder2 = new StringBuilder("OS SDK is=");
                    stringBuilder2.append(VERSION.SDK_INT);
                    stringBuilder2.append("; no KeyStore usage");
                    AFLogger.afRDLog(stringBuilder2.toString());
                } else {
                    stringBuilder2 = new StringBuilder("OS SDK is=");
                    stringBuilder2.append(VERSION.SDK_INT);
                    stringBuilder2.append("; use KeyStore");
                    AFLogger.afRDLog(stringBuilder2.toString());
                    AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
                    if (aFKeystoreWrapper.m16()) {
                        aFKeystoreWrapper.m14();
                    } else {
                        aFKeystoreWrapper.m18(C0000r.m164(new WeakReference(context)));
                    }
                    AppsFlyerProperties.getInstance().set("KSAppsFlyerId", aFKeystoreWrapper.m17());
                    AppsFlyerProperties.getInstance().set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.m15()));
                }
            }
            time = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getLong("AppsFlyerTimePassedSincePrevLaunch", 0);
            currentTimeMillis = System.currentTimeMillis();
            m60(context, "AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
            hashMap2.put("timepassedsincelastlaunch", Long.toString(time > 0 ? (currentTimeMillis - time) / 1000 : -1));
            ˏ = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
            if (ˏ != null) {
                hashMap2.put("onelink_id", ˏ);
                hashMap2.put("ol_ver", AppsFlyerProperties.getInstance().getString("onelinkVersion"));
            }
            time = sharedPreferences.getLong("appsflyerGetConversionDataTiming", 0);
            if (time > 0) {
                hashMap2.put("gcd_timing", Long.toString(time));
                Editor edit = sharedPreferences.edit();
                edit.putLong("appsflyerGetConversionDataTiming", 0);
                if (VERSION.SDK_INT >= 9) {
                    edit.apply();
                } else {
                    edit.commit();
                }
            }
        } else {
            sharedPreferences2 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            Editor edit2 = sharedPreferences2.edit();
            try {
                string = sharedPreferences2.getString("prev_event_name", null);
                if (string != null) {
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(sharedPreferences2.getLong("prev_event_timestamp", -1));
                    jSONObject.put("prev_event_timestamp", stringBuilder4.toString());
                    jSONObject.put("prev_event_value", sharedPreferences2.getString("prev_event_value", null));
                    jSONObject.put("prev_event_name", string);
                    hashMap2.put("prev_event", jSONObject.toString());
                }
                edit2.putString("prev_event_name", str2);
                edit2.putString("prev_event_value", str3);
                edit2.putLong("prev_event_timestamp", System.currentTimeMillis());
                if (VERSION.SDK_INT >= 9) {
                    edit2.apply();
                } else {
                    edit2.commit();
                }
            } catch (Exception e2) {
                AFLogger.afErrorLog("Error while processing previous event.", e2);
            }
        }
        ˏ = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
        String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
        if (!(ˏ == null || string2 == null || Integer.valueOf(string2).intValue() <= 0)) {
            hashMap2.put("reinstallCounter", string2);
            hashMap2.put("originalAppsflyerId", ˏ);
        }
        ˏ = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (ˏ != null) {
            hashMap2.put("customData", ˏ);
        }
        try {
            ˏ = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (ˏ != null) {
                hashMap2.put("installer_package", ˏ);
            }
        } catch (Exception e22) {
            AFLogger.afErrorLog("Exception while getting the app's installer package. ", e22);
        }
        ˏ = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.EXTENSION);
        if (ˏ != null && ˏ.length() > 0) {
            hashMap2.put(AppsFlyerProperties.EXTENSION, ˏ);
        }
        ˏ = m48(new WeakReference(context));
        string2 = m72(context, ˏ);
        if (string2 != null) {
            hashMap2.put(AppsFlyerProperties.CHANNEL, string2);
        }
        if (!(string2 == null || string2.equals(ˏ)) || (string2 == null && ˏ != null)) {
            hashMap2.put("af_latestchannel", ˏ);
        }
        sharedPreferences2 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        if (sharedPreferences2.contains("INSTALL_STORE")) {
            ˏ = sharedPreferences2.getString("INSTALL_STORE", null);
        } else {
            ˏ = (context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ 1) != 0 ? m41(context) : null;
            m61(context, "INSTALL_STORE", ˏ);
        }
        if (ˏ != null) {
            hashMap2.put("af_installstore", ˏ.toLowerCase());
        }
        SharedPreferences sharedPreferences3 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        ˏ = AppsFlyerProperties.getInstance().getString("preInstallName");
        if (ˏ == null) {
            if (sharedPreferences3.contains("preInstallName")) {
                ˏ = sharedPreferences3.getString("preInstallName", null);
            } else {
                if ((context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ 1) != 0) {
                    File ॱ2 = m67(m62(PRE_INSTALL_SYSTEM_RO_PROP));
                    Object obj2 = (ॱ2 == null || !ॱ2.exists()) ? 1 : null;
                    if (obj2 != null) {
                        ॱ2 = m67(m47(AF_PRE_INSTALL_PATH, context.getPackageManager(), context.getPackageName()));
                    }
                    obj2 = (ॱ2 == null || !ॱ2.exists()) ? 1 : null;
                    if (obj2 != null) {
                        ॱ2 = m67(PRE_INSTALL_SYSTEM_DEFAULT);
                    }
                    obj2 = (ॱ2 == null || !ॱ2.exists()) ? 1 : null;
                    File ॱ3 = obj2 != null ? m67(PRE_INSTALL_SYSTEM_DEFAULT_ETC) : ॱ2;
                    obj = (ॱ3 == null || !ॱ3.exists()) ? 1 : null;
                    if (obj == null) {
                        ˏ = m68(ॱ3, context.getPackageName());
                    }
                    ˏ = null;
                    if (ˏ == null) {
                        ˏ = m58(new WeakReference(context), "AF_PRE_INSTALL_NAME");
                    }
                }
                if (ˏ != null) {
                    m61(context, "preInstallName", ˏ);
                }
            }
            if (ˏ != null) {
                AppsFlyerProperties.getInstance().set("preInstallName", ˏ);
            }
        }
        if (ˏ != null) {
            hashMap2.put("af_preinstall_name", ˏ.toLowerCase());
        }
        ˏ = m41(context);
        if (ˏ != null) {
            hashMap2.put("af_currentstore", ˏ.toLowerCase());
        }
        if (str == null || str.length() < 0) {
            ˏ = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
            if (ˏ == null || ˏ.length() < 0) {
                AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
                m52(context, LOG_TAG, "DEV_KEY_MISSING", null);
                AFLogger.afInfoLog("AppsFlyer will not track this event.");
                return null;
            }
            hashMap2.put("appsflyerKey", ˏ);
        } else {
            hashMap2.put("appsflyerKey", str);
        }
        ˏ = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (ˏ != null) {
            hashMap2.put("appUserId", ˏ);
        }
        ˏ = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.USER_EMAILS);
        if (ˏ != null) {
            hashMap2.put("user_emails", ˏ);
        } else {
            ˏ = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.USER_EMAIL);
            if (ˏ != null) {
                hashMap2.put("sha1_el", p.m155(ˏ));
            }
        }
        if (str2 != null) {
            hashMap2.put("eventName", str2);
            if (str3 != null) {
                hashMap2.put("eventValue", str3);
            }
        }
        if (AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_ID) != null) {
            hashMap2.put(AppsFlyerProperties.APP_ID, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_ID));
        }
        ˏ = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (ˏ != null) {
            if (ˏ.length() != 3) {
                stringBuilder = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                stringBuilder.append(ˏ);
                stringBuilder.append("' is not a legal value.");
                AFLogger.afWarnLog(stringBuilder.toString());
            }
            hashMap2.put(Param.CURRENCY, ˏ);
        }
        ˏ = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.IS_UPDATE);
        if (ˏ != null) {
            hashMap2.put("isUpdate", ˏ);
        }
        hashMap2.put("af_preinstalled", Boolean.toString(isPreInstalledApp(context)));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            try {
                context.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                obj = getAttributionId(context.getContentResolver());
            } catch (NameNotFoundException e3) {
                AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
            } catch (Throwable th22) {
                AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th22);
            }
            if (obj != null) {
                hashMap2.put("fb", obj);
            }
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            SharedPreferences sharedPreferences4 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            boolean z3 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, true);
            string2 = sharedPreferences4.getString("imeiCached", null);
            if (z3 && TextUtils.isEmpty(this.f88)) {
                if (m71(context)) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        ˏ = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                        if (ˏ == null) {
                            if (string2 != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(string2)));
                                ˏ = string2;
                            }
                        }
                    } catch (InvocationTargetException e4) {
                        if (string2 != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(string2)));
                            ˏ = string2;
                        } else {
                            ˏ = null;
                        }
                        AFLogger.afWarnLog("WARNING: READ_PHONE_STATE is missing.");
                    } catch (Exception e222) {
                        if (string2 != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(string2)));
                        } else {
                            string2 = null;
                        }
                        AFLogger.afErrorLog("WARNING: other reason: ", e222);
                        ˏ = string2;
                    }
                }
                ˏ = null;
            } else {
                if (this.f88 != null) {
                    ˏ = this.f88;
                }
                ˏ = null;
            }
            if (ˏ != null) {
                m61(context, "imeiCached", ˏ);
                hashMap2.put("imei", ˏ);
            } else {
                AFLogger.afInfoLog("IMEI was not collected.");
            }
            z3 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, true);
            string2 = sharedPreferences4.getString("androidIdCached", null);
            if (z3 && TextUtils.isEmpty(this.f79)) {
                if (m71(context)) {
                    try {
                        ˏ = Secure.getString(context.getContentResolver(), "android_id");
                        if (ˏ == null) {
                            if (string2 != null) {
                                AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(string2)));
                                ˏ = string2;
                            }
                        }
                    } catch (Exception e2222) {
                        if (string2 != null) {
                            AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(string2)));
                        } else {
                            string2 = null;
                        }
                        AFLogger.afErrorLog(e2222.getMessage(), e2222);
                        ˏ = string2;
                    }
                }
                ˏ = null;
            } else {
                if (this.f79 != null) {
                    ˏ = this.f79;
                }
                ˏ = null;
            }
            if (ˏ != null) {
                m61(context, "androidIdCached", ˏ);
                hashMap2.put("android_id", ˏ);
            } else {
                AFLogger.afInfoLog("Android ID was not collected.");
            }
        } else {
            hashMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        try {
            ˏ = C0000r.m164(new WeakReference(context));
            if (ˏ != null) {
                hashMap2.put("uid", ˏ);
            }
        } catch (Exception e22222) {
            stringBuilder = new StringBuilder("ERROR: could not get uid ");
            stringBuilder.append(e22222.getMessage());
            AFLogger.afErrorLog(stringBuilder.toString(), e22222);
        }
        try {
            hashMap2.put("lang", Locale.getDefault().getDisplayLanguage());
        } catch (Exception e222222) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e222222);
        }
        try {
            hashMap2.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e2222222) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e2222222);
        }
        try {
            hashMap2.put("country", Locale.getDefault().getCountry());
        } catch (Exception e22222222) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e22222222);
        }
        hashMap2.put("platformextension", this.f81.m161());
        m65(context, (Map) hashMap2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        try {
            currentTimeMillis = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap2.put("installDate", simpleDateFormat.format(new Date(currentTimeMillis)));
        } catch (Exception e222222222) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e222222222);
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            try {
                if (packageInfo.versionCode > sharedPreferences.getInt("versionCode", 0)) {
                    m63(context, "appsflyerConversionDataRequestRetries", 0);
                    m63(context, "versionCode", packageInfo.versionCode);
                }
                hashMap2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                hashMap2.put("app_version_name", packageInfo.versionName);
                currentTimeMillis = packageInfo.firstInstallTime;
                j = packageInfo.lastUpdateTime;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap2.put("date1", simpleDateFormat.format(new Date(currentTimeMillis)));
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap2.put("date2", simpleDateFormat.format(new Date(j)));
                obj = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("appsFlyerFirstInstall", null);
                if (obj == null) {
                    if ((context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ 1) != 0) {
                        AFLogger.afDebugLog("AppsFlyer: first launch detected");
                        obj = simpleDateFormat.format(new Date());
                    } else {
                        obj = "";
                    }
                    m61(context, "appsFlyerFirstInstall", (String) obj);
                }
                AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(obj)));
                hashMap2.put("firstLaunchDate", obj);
            } catch (Throwable th3) {
                th22 = th3;
                AFLogger.afErrorLog("Exception while collecting app version data ", th22);
                if (str4.length() > 0) {
                }
                ˏ = sharedPreferences.getString("extraReferrers", null);
                if (ˏ != null) {
                }
                ˏ = AppsFlyerProperties.getInstance().getString("afUninstallToken");
                if (ˏ != null) {
                }
                this.f85 = y.m202(context);
                stringBuilder2 = new StringBuilder("didConfigureTokenRefreshService=");
                stringBuilder2.append(this.f85);
                AFLogger.afDebugLog(stringBuilder2.toString());
                if (!this.f85) {
                }
                if (z2) {
                }
                if (this.f77) {
                }
                time = System.currentTimeMillis();
                currentTimeMillis = this.f78;
                string = AppsFlyerProperties.getInstance().getReferrer(context);
                if (time - currentTimeMillis <= 30000) {
                }
                if (obj != null) {
                }
                if (AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM) == null) {
                }
                ॱ = n.m149(context.getContentResolver());
                if (ॱ != null) {
                }
                ˏ = AppsFlyerProperties.getInstance().getReferrer(context);
                hashMap2.put("referrer", ˏ);
                equals = "true".equals(sharedPreferences.getString("sentSuccessfully", ""));
                hashMap2.put("registeredUninstall", Boolean.valueOf(sharedPreferences.getBoolean("sentRegisterRequestToAF", false)));
                ˎ = m56(sharedPreferences, "appsFlyerCount", z2);
                hashMap2.put("counter", Integer.toString(ˎ));
                if (str2 != null) {
                }
                hashMap2.put("iaecounter", Integer.toString(m56(sharedPreferences, "appsFlyerInAppEventCount", str2 != null)));
                AppsFlyerProperties.getInstance().setFirstLaunchCalled();
                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                }
                hashMap2.put("isFirstCall", Boolean.toString(equals ^ 1));
                hashMap = new HashMap();
                hashMap.put("cpu_abi", m62("ro.product.cpu.abi"));
                hashMap.put("cpu_abi2", m62("ro.product.cpu.abi2"));
                hashMap.put("arch", m62("os.arch"));
                hashMap.put("build_display_id", m62("ro.build.display.id"));
                if (z2) {
                }
                hashMap.put(AFScreenManager.SCREEN_KEY, AFScreenManager.getScreenMetrics(context));
                hashMap2.put("deviceData", hashMap);
                pVar = new p();
                ˏ = (String) hashMap2.get("appsflyerKey");
                string2 = (String) hashMap2.get("af_timestamp");
                string = (String) hashMap2.get("uid");
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(ˏ.substring(0, 7));
                stringBuilder3.append(string.substring(0, 7));
                stringBuilder3.append(string2.substring(string2.length() - 7));
                hashMap2.put("af_v", p.m155(stringBuilder3.toString()));
                pVar = new p();
                ˏ = (String) hashMap2.get("appsflyerKey");
                stringBuilder = new StringBuilder();
                stringBuilder.append(ˏ);
                stringBuilder.append(hashMap2.get("af_timestamp"));
                ˏ = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(ˏ);
                stringBuilder.append(hashMap2.get("uid"));
                ˏ = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(ˏ);
                stringBuilder.append(hashMap2.get("installDate"));
                ˏ = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(ˏ);
                stringBuilder.append(hashMap2.get("counter"));
                ˏ = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(ˏ);
                stringBuilder.append(hashMap2.get("iaecounter"));
                hashMap2.put("af_v2", p.m155(p.m158(stringBuilder.toString())));
                hashMap2.put("ivc", Boolean.valueOf(m40(context)));
                if (sharedPreferences.contains(IS_STOP_TRACKING_USED)) {
                }
                if (AppsFlyerProperties.getInstance().getObject("consumeAfDeepLink") != null) {
                }
                return hashMap2;
            }
        } catch (Throwable th4) {
            th22 = th4;
        }
        if (str4.length() > 0) {
            hashMap2.put("referrer", str4);
        }
        ˏ = sharedPreferences.getString("extraReferrers", null);
        if (ˏ != null) {
            hashMap2.put("extraReferrers", ˏ);
        }
        ˏ = AppsFlyerProperties.getInstance().getString("afUninstallToken");
        if (ˏ != null) {
            hashMap2.put("af_gcm_token", b.m91(ˏ).m93());
        }
        this.f85 = y.m202(context);
        stringBuilder2 = new StringBuilder("didConfigureTokenRefreshService=");
        stringBuilder2.append(this.f85);
        AFLogger.afDebugLog(stringBuilder2.toString());
        if (this.f85) {
            hashMap2.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        if (z2) {
            AFDeepLinkManager.getInstance().processIntentForDeepLink(intent, context, hashMap2);
            if (this.f80 != null) {
                JSONObject jSONObject2 = new JSONObject(this.f80);
                jSONObject2.put("isPush", "true");
                hashMap2.put("af_deeplink", jSONObject2.toString());
            }
            this.f80 = null;
            hashMap2.put("open_referrer", str5);
        }
        if (this.f77) {
            hashMap2.put("testAppMode_retargeting", "true");
            m45(context, new JSONObject(hashMap2).toString());
            AFLogger.afInfoLog("Sent retargeting params to test app");
        }
        time = System.currentTimeMillis();
        currentTimeMillis = this.f78;
        string = AppsFlyerProperties.getInstance().getReferrer(context);
        obj = (time - currentTimeMillis <= 30000 || string == null || !string.contains("AppsFlyer_Test")) ? null : 1;
        if (obj != null) {
            hashMap2.put("testAppMode", "true");
            m45(context, new JSONObject(hashMap2).toString());
            AFLogger.afInfoLog("Sent params to test app");
            AFLogger.afInfoLog("Test mode ended!");
            this.f78 = 0;
        }
        if (AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM) == null) {
            n.m148(context, hashMap2);
            if (AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM) != null) {
                hashMap2.put("GAID_retry", "true");
            } else {
                hashMap2.put("GAID_retry", "false");
            }
        }
        ॱ = n.m149(context.getContentResolver());
        if (ॱ != null) {
            hashMap2.put("amazon_aid", ॱ.m142());
            hashMap2.put("amazon_aid_limit", String.valueOf(ॱ.m143()));
        }
        ˏ = AppsFlyerProperties.getInstance().getReferrer(context);
        if (ˏ != null && ˏ.length() > 0 && hashMap2.get("referrer") == null) {
            hashMap2.put("referrer", ˏ);
        }
        equals = "true".equals(sharedPreferences.getString("sentSuccessfully", ""));
        hashMap2.put("registeredUninstall", Boolean.valueOf(sharedPreferences.getBoolean("sentRegisterRequestToAF", false)));
        ˎ = m56(sharedPreferences, "appsFlyerCount", z2);
        hashMap2.put("counter", Integer.toString(ˎ));
        hashMap2.put("iaecounter", Integer.toString(m56(sharedPreferences, "appsFlyerInAppEventCount", str2 != null)));
        if (z2 && ˎ == 1) {
            AppsFlyerProperties.getInstance().setFirstLaunchCalled();
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                hashMap2.put("wait_cid", Boolean.toString(true));
            }
        }
        hashMap2.put("isFirstCall", Boolean.toString(equals ^ 1));
        hashMap = new HashMap();
        hashMap.put("cpu_abi", m62("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", m62("ro.product.cpu.abi2"));
        hashMap.put("arch", m62("os.arch"));
        hashMap.put("build_display_id", m62("ro.build.display.id"));
        if (z2) {
            if (this.f76) {
                b bVar = a.f124;
                Location ॱ4 = b.m108(context);
                HashMap hashMap3 = new HashMap(3);
                if (ॱ4 != null) {
                    hashMap3.put("lat", String.valueOf(ॱ4.getLatitude()));
                    hashMap3.put("lon", String.valueOf(ॱ4.getLongitude()));
                    hashMap3.put("ts", String.valueOf(ॱ4.getTime()));
                }
                if (!hashMap3.isEmpty()) {
                    hashMap.put("loc", hashMap3);
                }
            }
            d ˎ2 = a.f125.m111(context);
            hashMap.put("btl", Float.toString(ˎ2.m110()));
            if (ˎ2.m109() != null) {
                hashMap.put("btch", ˎ2.m109());
            }
            if (2 >= ˎ) {
                List ˋ = i.m136(context).m137();
                if (!ˋ.isEmpty()) {
                    hashMap.put("sensors", ˋ);
                }
            }
        }
        hashMap.put(AFScreenManager.SCREEN_KEY, AFScreenManager.getScreenMetrics(context));
        hashMap2.put("deviceData", hashMap);
        pVar = new p();
        ˏ = (String) hashMap2.get("appsflyerKey");
        string2 = (String) hashMap2.get("af_timestamp");
        string = (String) hashMap2.get("uid");
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(ˏ.substring(0, 7));
        stringBuilder3.append(string.substring(0, 7));
        stringBuilder3.append(string2.substring(string2.length() - 7));
        hashMap2.put("af_v", p.m155(stringBuilder3.toString()));
        pVar = new p();
        ˏ = (String) hashMap2.get("appsflyerKey");
        stringBuilder = new StringBuilder();
        stringBuilder.append(ˏ);
        stringBuilder.append(hashMap2.get("af_timestamp"));
        ˏ = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(ˏ);
        stringBuilder.append(hashMap2.get("uid"));
        ˏ = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(ˏ);
        stringBuilder.append(hashMap2.get("installDate"));
        ˏ = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(ˏ);
        stringBuilder.append(hashMap2.get("counter"));
        ˏ = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(ˏ);
        stringBuilder.append(hashMap2.get("iaecounter"));
        hashMap2.put("af_v2", p.m155(p.m158(stringBuilder.toString())));
        hashMap2.put("ivc", Boolean.valueOf(m40(context)));
        if (sharedPreferences.contains(IS_STOP_TRACKING_USED)) {
            hashMap2.put("istu", String.valueOf(sharedPreferences.getBoolean(IS_STOP_TRACKING_USED, false)));
        }
        if (AppsFlyerProperties.getInstance().getObject("consumeAfDeepLink") != null) {
            hashMap2.put("is_dp_api", String.valueOf(AppsFlyerProperties.getInstance().getBoolean("consumeAfDeepLink", false)));
            return hashMap2;
        }
        return hashMap2;
        obj = null;
        if (obj != null) {
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
        }
        ˏ = C0000r.m164(new WeakReference(context));
        if (ˏ != null) {
        }
        hashMap2.put("lang", Locale.getDefault().getDisplayLanguage());
        hashMap2.put("lang_code", Locale.getDefault().getLanguage());
        hashMap2.put("country", Locale.getDefault().getCountry());
        hashMap2.put("platformextension", this.f81.m161());
        m65(context, (Map) hashMap2);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        currentTimeMillis = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        hashMap2.put("installDate", simpleDateFormat2.format(new Date(currentTimeMillis)));
        packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        if (packageInfo.versionCode > sharedPreferences.getInt("versionCode", 0)) {
        }
        hashMap2.put("app_version_code", Integer.toString(packageInfo.versionCode));
        hashMap2.put("app_version_name", packageInfo.versionName);
        currentTimeMillis = packageInfo.firstInstallTime;
        j = packageInfo.lastUpdateTime;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        hashMap2.put("date1", simpleDateFormat2.format(new Date(currentTimeMillis)));
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        hashMap2.put("date2", simpleDateFormat2.format(new Date(j)));
        obj = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("appsFlyerFirstInstall", null);
        if (obj == null) {
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(obj)));
        hashMap2.put("firstLaunchDate", obj);
        if (str4.length() > 0) {
        }
        ˏ = sharedPreferences.getString("extraReferrers", null);
        if (ˏ != null) {
        }
        ˏ = AppsFlyerProperties.getInstance().getString("afUninstallToken");
        if (ˏ != null) {
        }
        this.f85 = y.m202(context);
        stringBuilder2 = new StringBuilder("didConfigureTokenRefreshService=");
        stringBuilder2.append(this.f85);
        AFLogger.afDebugLog(stringBuilder2.toString());
        if (this.f85) {
        }
        if (z2) {
        }
        if (this.f77) {
        }
        time = System.currentTimeMillis();
        currentTimeMillis = this.f78;
        string = AppsFlyerProperties.getInstance().getReferrer(context);
        if (time - currentTimeMillis <= 30000) {
        }
        if (obj != null) {
        }
        if (AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM) == null) {
        }
        ॱ = n.m149(context.getContentResolver());
        if (ॱ != null) {
        }
        ˏ = AppsFlyerProperties.getInstance().getReferrer(context);
        hashMap2.put("referrer", ˏ);
        equals = "true".equals(sharedPreferences.getString("sentSuccessfully", ""));
        hashMap2.put("registeredUninstall", Boolean.valueOf(sharedPreferences.getBoolean("sentRegisterRequestToAF", false)));
        ˎ = m56(sharedPreferences, "appsFlyerCount", z2);
        hashMap2.put("counter", Integer.toString(ˎ));
        if (str2 != null) {
        }
        hashMap2.put("iaecounter", Integer.toString(m56(sharedPreferences, "appsFlyerInAppEventCount", str2 != null)));
        AppsFlyerProperties.getInstance().setFirstLaunchCalled();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
        }
        hashMap2.put("isFirstCall", Boolean.toString(equals ^ 1));
        hashMap = new HashMap();
        hashMap.put("cpu_abi", m62("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", m62("ro.product.cpu.abi2"));
        hashMap.put("arch", m62("os.arch"));
        hashMap.put("build_display_id", m62("ro.build.display.id"));
        if (z2) {
        }
        hashMap.put(AFScreenManager.SCREEN_KEY, AFScreenManager.getScreenMetrics(context));
        hashMap2.put("deviceData", hashMap);
        pVar = new p();
        ˏ = (String) hashMap2.get("appsflyerKey");
        string2 = (String) hashMap2.get("af_timestamp");
        string = (String) hashMap2.get("uid");
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(ˏ.substring(0, 7));
        stringBuilder3.append(string.substring(0, 7));
        stringBuilder3.append(string2.substring(string2.length() - 7));
        hashMap2.put("af_v", p.m155(stringBuilder3.toString()));
        pVar = new p();
        ˏ = (String) hashMap2.get("appsflyerKey");
        stringBuilder = new StringBuilder();
        stringBuilder.append(ˏ);
        stringBuilder.append(hashMap2.get("af_timestamp"));
        ˏ = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(ˏ);
        stringBuilder.append(hashMap2.get("uid"));
        ˏ = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(ˏ);
        stringBuilder.append(hashMap2.get("installDate"));
        ˏ = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(ˏ);
        stringBuilder.append(hashMap2.get("counter"));
        ˏ = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(ˏ);
        stringBuilder.append(hashMap2.get("iaecounter"));
        hashMap2.put("af_v2", p.m155(p.m158(stringBuilder.toString())));
        hashMap2.put("ivc", Boolean.valueOf(m40(context)));
        if (sharedPreferences.contains(IS_STOP_TRACKING_USED)) {
        }
        if (AppsFlyerProperties.getInstance().getObject("consumeAfDeepLink") != null) {
        }
        return hashMap2;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˎ */
    public final void m75(Context context, String str) {
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null;
        if (z) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        Map hashMap = new HashMap();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        if (string == null) {
            AFLogger.afWarnLog("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            hashMap.put("app_version_name", packageInfo.versionName);
            hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j = packageInfo.firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("installDate", simpleDateFormat.format(new Date(j)));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        m65(context, hashMap);
        String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string2 != null) {
            hashMap.put("appUserId", string2);
        }
        try {
            hashMap.put("model", Build.MODEL);
            hashMap.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        l ॱ = n.m149(context.getContentResolver());
        if (ॱ != null) {
            hashMap.put("amazon_aid", ॱ.m142());
            hashMap.put("amazon_aid_limit", String.valueOf(ॱ.m143()));
        }
        string2 = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
        if (string2 != null) {
            hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, string2);
        }
        hashMap.put("devkey", string);
        hashMap.put("uid", C0000r.m164(new WeakReference(context)));
        hashMap.put("af_gcm_token", str);
        hashMap.put("launch_counter", Integer.toString(m56(context.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false)));
        hashMap.put("sdk", Integer.toString(VERSION.SDK_INT));
        string2 = m48(new WeakReference(context));
        if (string2 != null) {
            hashMap.put(AppsFlyerProperties.CHANNEL, string2);
        }
        try {
            o oVar = new o(context, isTrackingStopped());
            oVar.f199 = hashMap;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ServerConfigHandler.getUrl(f64));
            stringBuilder.append(packageName);
            oVar.execute(new String[]{stringBuilder.toString()});
        } catch (Throwable th22) {
            AFLogger.afErrorLog(th22.getMessage(), th22);
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final void m76() {
        this.f74 = System.currentTimeMillis();
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final void m77(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.afInfoLog("app went to background");
            SharedPreferences sharedPreferences = ((Context) weakReference.get()).getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
            long j = this.f72;
            long j2 = this.f74;
            HashMap hashMap = new HashMap();
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
            if (string == null) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            }
            l ॱ = n.m149(((Context) weakReference.get()).getContentResolver());
            if (ॱ != null) {
                hashMap.put("amazon_aid", ॱ.m142());
                hashMap.put("amazon_aid_limit", String.valueOf(ॱ.m143()));
            }
            String string3 = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
            if (string3 != null) {
                hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, string3);
            }
            hashMap.put("app_id", ((Context) weakReference.get()).getPackageName());
            hashMap.put("devkey", string);
            hashMap.put("uid", C0000r.m164(weakReference));
            hashMap.put("time_in_app", String.valueOf((j - j2) / 1000));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(m56(sharedPreferences, "appsFlyerCount", false)));
            hashMap.put(AppsFlyerProperties.CHANNEL, m48((WeakReference) weakReference));
            hashMap.put("originalAppsflyerId", string2 != null ? string2 : "");
            if (this.f83) {
                try {
                    o oVar = new o(null, isTrackingStopped());
                    oVar.f199 = hashMap;
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        AFLogger.afDebugLog("Main thread detected. Running callStats task in a new thread.");
                        oVar.execute(new String[]{ServerConfigHandler.getUrl("https://%sstats.%s/stats")});
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder("Running callStats task (on current thread: ");
                    stringBuilder.append(Thread.currentThread().toString());
                    stringBuilder.append(" )");
                    AFLogger.afDebugLog(stringBuilder.toString());
                    oVar.onPreExecute();
                    oVar.onPostExecute(oVar.doInBackground(ServerConfigHandler.getUrl("https://%sstats.%s/stats")));
                    return;
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Could not send callStats request", th);
                    return;
                }
            }
            AFLogger.afDebugLog("Stats call is disabled, ignore ...");
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ॱ */
    public final void m78() {
        this.f72 = System.currentTimeMillis();
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ॱ */
    public final void m79(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(AppsFlyerProperties.IS_MONITOR);
        if (stringExtra != null) {
            AFLogger.afInfoLog("Turning on monitoring.");
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_MONITOR, stringExtra.equals("true"));
            m52(context, null, "START_TRACKING", context.getPackageName());
            return;
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String stringExtra2 = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra2)));
        if (stringExtra2 != null) {
            Editor edit;
            if ("AppsFlyer_Test".equals(intent.getStringExtra("TestIntegrationMode"))) {
                edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
                edit.clear();
                if (VERSION.SDK_INT >= 9) {
                    edit.apply();
                } else {
                    edit.commit();
                }
                AppsFlyerProperties.getInstance().setFirstLaunchCalled(false);
                AFLogger.afInfoLog("Test mode started..");
                this.f78 = System.currentTimeMillis();
            }
            edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
            edit.putString("referrer", stringExtra2);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
            AppsFlyerProperties.getInstance().setReferrer(stringExtra2);
            if (AppsFlyerProperties.getInstance().isFirstLaunchCalled()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                if (stringExtra2 != null && stringExtra2.length() > 5) {
                    m53(AFExecutor.getInstance().m10(), new a(this, new WeakReference(context.getApplicationContext()), null, null, null, stringExtra2, true, intent, null, (byte) 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
}
