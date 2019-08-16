package android.support.v4.content;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.share.Constants;
import java.util.ArrayList;

public final class MimeTypeFilter {
    private MimeTypeFilter() {
    }

    @Nullable
    public static String matches(@Nullable String str, @NonNull String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(Constants.URL_PATH_DELIMITER);
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(split, str2.split(Constants.URL_PATH_DELIMITER))) {
                return str2;
            }
        }
        return null;
    }

    @Nullable
    public static String matches(@Nullable String[] strArr, @NonNull String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split(Constants.URL_PATH_DELIMITER);
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(str2.split(Constants.URL_PATH_DELIMITER), split)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean matches(@Nullable String str, @NonNull String str2) {
        return str == null ? false : mimeTypeAgainstFilter(str.split(Constants.URL_PATH_DELIMITER), str2.split(Constants.URL_PATH_DELIMITER));
    }

    @NonNull
    public static String[] matchesMany(@Nullable String[] strArr, @NonNull String str) {
        int i = 0;
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(Constants.URL_PATH_DELIMITER);
        int length = strArr.length;
        while (i < length) {
            String str2 = strArr[i];
            if (mimeTypeAgainstFilter(str2.split(Constants.URL_PATH_DELIMITER), split)) {
                arrayList.add(str2);
            }
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean mimeTypeAgainstFilter(@NonNull String[] strArr, @NonNull String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        } else if (!strArr2[0].isEmpty() && !strArr2[1].isEmpty()) {
            return strArr.length != 2 ? false : ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) ? "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]) : false;
        } else {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
    }
}
