package android.support.v4.util;

import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

public class ObjectsCompat {
    private ObjectsCompat() {
    }

    public static boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        return VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(@Nullable Object... objArr) {
        return VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }

    public static int hashCode(@Nullable Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }
}
