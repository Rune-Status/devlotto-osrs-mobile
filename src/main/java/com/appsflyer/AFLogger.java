package com.appsflyer;

import android.support.annotation.NonNull;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {
    /* renamed from: ˋ */
    private static long f27 = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        /* renamed from: ॱ */
        private int f26;

        private LogLevel(int i) {
            this.f26 = i;
        }

        public final int getLevel() {
            return this.f26;
        }
    }

    public static void afDebugLog(String str) {
        if (LogLevel.DEBUG.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            Log.d(AppsFlyerLib.LOG_TAG, m23(str, false));
        }
        s.m169().m179("D", m23(str, true));
    }

    public static void afErrorLog(String str, Throwable th) {
        m21(str, th, false);
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        m21(str, th, z);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    public static void afInfoLog(String str, boolean z) {
        if (LogLevel.INFO.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            Log.i(AppsFlyerLib.LOG_TAG, m23(str, false));
        }
        if (z) {
            s.m169().m179("I", m23(str, true));
        }
    }

    public static void afRDLog(String str) {
        if (LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            Log.v(AppsFlyerLib.LOG_TAG, m23(str, false));
        }
        s.m169().m179("V", m23(str, true));
    }

    public static void afWarnLog(String str) {
        m20(str);
    }

    public static void resetDeltaTime() {
        f27 = System.currentTimeMillis();
    }

    /* renamed from: ˊ */
    private static String m19(long j) {
        long toMillis = j - TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(j));
        toMillis -= TimeUnit.MINUTES.toMillis(TimeUnit.MILLISECONDS.toMinutes(toMillis));
        toMillis = TimeUnit.MILLISECONDS.toMillis(toMillis - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(toMillis)));
        return String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[]{Long.valueOf(r0), Long.valueOf(r4), Long.valueOf(r6), Long.valueOf(toMillis)});
    }

    /* renamed from: ˊ */
    static void m20(String str) {
        if (LogLevel.WARNING.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            Log.w(AppsFlyerLib.LOG_TAG, m23(str, false));
        }
        s.m169().m179("W", m23(str, true));
    }

    /* renamed from: ˋ */
    private static void m21(String str, Throwable th, boolean z) {
        if ((LogLevel.ERROR.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) && z) {
            Log.e(AppsFlyerLib.LOG_TAG, m23(str, false), th);
        }
        s.m169().m183(th);
    }

    /* renamed from: ˏ */
    static void m22(String str) {
        if (!AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            Log.d(AppsFlyerLib.LOG_TAG, m23(str, false));
        }
        s.m169().m179("F", str);
    }

    @NonNull
    /* renamed from: ॱ */
    private static String m23(String str, boolean z) {
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(m19(System.currentTimeMillis() - f27));
        stringBuilder.append(") [");
        stringBuilder.append(Thread.currentThread().getName());
        stringBuilder.append("] ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
