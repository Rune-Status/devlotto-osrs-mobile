package com.google.android.gms.common.util;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@KeepForSdk
@VisibleForTesting
public class Strings {
    private static final Pattern zzhf = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    @Nullable
    @KeepForSdk
    public static String emptyToNull(@Nullable String str) {
        return TextUtils.isEmpty(str) ? null : str;
    }

    @KeepForSdk
    public static boolean isEmptyOrWhitespace(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}
