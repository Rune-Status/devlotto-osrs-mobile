package com.google.android.gms.auth;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

public final class CookieUtil {
    private CookieUtil() {
    }

    public static String getCookieUrl(String str, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Object obj = zza(bool) ? "https" : "http";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 3) + String.valueOf(str).length());
        stringBuilder.append(obj);
        stringBuilder.append("://");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public static String getCookieValue(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append('=');
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append(str2);
        }
        if (zza(bool)) {
            stringBuilder.append(";HttpOnly");
        }
        if (zza(bool2)) {
            stringBuilder.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            stringBuilder.append(";Domain=");
            stringBuilder.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            stringBuilder.append(";Path=");
            stringBuilder.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            stringBuilder.append(";Max-Age=");
            stringBuilder.append(l);
        }
        return stringBuilder.toString();
    }

    private static boolean zza(Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
