package butterknife.internal;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.UiThread;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.TypedValue;
import android.view.View;
import java.lang.reflect.Array;
import java.util.List;

public final class Utils {
    private static final TypedValue VALUE = new TypedValue();

    private Utils() {
        throw new AssertionError("No instances.");
    }

    @SafeVarargs
    public static <T> T[] arrayOf(T... tArr) {
        return filterNull(tArr);
    }

    public static <T> T castParam(Object obj, String str, int i, String str2, int i2, Class<T> cls) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Parameter #");
            stringBuilder.append(i + 1);
            stringBuilder.append(" of method '");
            stringBuilder.append(str);
            stringBuilder.append("' was of the wrong type for parameter #");
            stringBuilder.append(i2 + 1);
            stringBuilder.append(" of method '");
            stringBuilder.append(str2);
            stringBuilder.append("'. See cause for more info.");
            throw new IllegalStateException(stringBuilder.toString(), e);
        }
    }

    public static <T> T castView(View view, @IdRes int i, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e) {
            String resourceEntryName = getResourceEntryName(view, i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View '");
            stringBuilder.append(resourceEntryName);
            stringBuilder.append("' with ID ");
            stringBuilder.append(i);
            stringBuilder.append(" for ");
            stringBuilder.append(str);
            stringBuilder.append(" was of the wrong type. See cause for more info.");
            throw new IllegalStateException(stringBuilder.toString(), e);
        }
    }

    private static <T> T[] filterNull(T[] tArr) {
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3;
            T t = tArr[i2];
            if (t != null) {
                tArr[i] = t;
                i3 = i + 1;
            } else {
                i3 = i;
            }
            i2++;
            i = i3;
        }
        if (i == length) {
            return tArr;
        }
        T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
        System.arraycopy(tArr, 0, tArr2, 0, i);
        return tArr2;
    }

    public static <T> T findOptionalViewAsType(View view, @IdRes int i, String str, Class<T> cls) {
        return castView(view.findViewById(i), i, str, cls);
    }

    public static View findRequiredView(View view, @IdRes int i, String str) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        String resourceEntryName = getResourceEntryName(view, i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Required view '");
        stringBuilder.append(resourceEntryName);
        stringBuilder.append("' with ID ");
        stringBuilder.append(i);
        stringBuilder.append(" for ");
        stringBuilder.append(str);
        stringBuilder.append(" was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static <T> T findRequiredViewAsType(View view, @IdRes int i, String str, Class<T> cls) {
        return castView(findRequiredView(view, i, str), i, str, cls);
    }

    @UiThread
    public static float getFloat(Context context, @DimenRes int i) {
        TypedValue typedValue = VALUE;
        context.getResources().getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Resource ID #0x");
        stringBuilder.append(Integer.toHexString(i));
        stringBuilder.append(" type #0x");
        stringBuilder.append(Integer.toHexString(typedValue.type));
        stringBuilder.append(" is not valid");
        throw new NotFoundException(stringBuilder.toString());
    }

    private static String getResourceEntryName(View view, @IdRes int i) {
        return view.isInEditMode() ? "<unavailable while editing>" : view.getContext().getResources().getResourceEntryName(i);
    }

    @UiThread
    public static Drawable getTintedDrawable(Context context, @DrawableRes int i, @AttrRes int i2) {
        if (context.getTheme().resolveAttribute(i2, VALUE, true)) {
            Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(context, i).mutate());
            DrawableCompat.setTint(wrap, ContextCompat.getColor(context, VALUE.resourceId));
            return wrap;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Required tint color attribute with name ");
        stringBuilder.append(context.getResources().getResourceEntryName(i2));
        stringBuilder.append(" and attribute ID ");
        stringBuilder.append(i2);
        stringBuilder.append(" was not found.");
        throw new NotFoundException(stringBuilder.toString());
    }

    @SafeVarargs
    public static <T> List<T> listOf(T... tArr) {
        return new ImmutableList(filterNull(tArr));
    }
}
