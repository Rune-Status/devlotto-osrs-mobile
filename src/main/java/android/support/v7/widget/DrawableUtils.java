package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.graphics.drawable.WrappedDrawable;
import android.support.v7.graphics.drawable.DrawableWrapper;
import android.util.Log;
import java.lang.reflect.Field;

@RestrictTo({Scope.LIBRARY_GROUP})
public class DrawableUtils {
    public static final Rect INSETS_NONE = new Rect();
    private static final String TAG = "DrawableUtils";
    private static final String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
    private static Class<?> sInsetsClazz;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                sInsetsClazz = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    private DrawableUtils() {
    }

    public static boolean canSafelyMutateDrawable(@NonNull Drawable drawable) {
        if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainerState) {
                for (Drawable canSafelyMutateDrawable : ((DrawableContainerState) constantState).getChildren()) {
                    if (!canSafelyMutateDrawable(canSafelyMutateDrawable)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof WrappedDrawable) {
            return canSafelyMutateDrawable(((WrappedDrawable) drawable).getWrappedDrawable());
        } else {
            if (drawable instanceof DrawableWrapper) {
                return canSafelyMutateDrawable(((DrawableWrapper) drawable).getWrappedDrawable());
            }
            if (drawable instanceof ScaleDrawable) {
                return canSafelyMutateDrawable(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    static void fixDrawable(@NonNull Drawable drawable) {
        if (VERSION.SDK_INT == 21 && VECTOR_DRAWABLE_CLAZZ_NAME.equals(drawable.getClass().getName())) {
            fixVectorDrawableTinting(drawable);
        }
    }

    private static void fixVectorDrawableTinting(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(ThemeUtils.CHECKED_STATE_SET);
        } else {
            drawable.setState(ThemeUtils.EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0050 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095 A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A:{SYNTHETIC, Splitter:B:37:0x008e} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0050 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095 A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A:{SYNTHETIC, Splitter:B:37:0x008e} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0050 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095 A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A:{SYNTHETIC, Splitter:B:37:0x008e} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0050 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095 A:{Catch:{ Exception -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A:{SYNTHETIC, Splitter:B:37:0x008e} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c A:{Catch:{ Exception -> 0x0083 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Rect getOpticalBounds(Drawable drawable) {
        if (sInsetsClazz != null) {
            try {
                Drawable unwrap = DrawableCompat.unwrap(drawable);
                Object invoke = unwrap.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(unwrap, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : sInsetsClazz.getFields()) {
                        Object obj;
                        String name = field.getName();
                        int hashCode = name.hashCode();
                        if (hashCode != -1383228885) {
                            if (hashCode != 115029) {
                                if (hashCode != 3317767) {
                                    if (hashCode == 108511772 && name.equals("right")) {
                                        obj = 2;
                                        switch (obj) {
                                            case null:
                                                rect.left = field.getInt(invoke);
                                                break;
                                            case 1:
                                                rect.top = field.getInt(invoke);
                                                break;
                                            case 2:
                                                rect.right = field.getInt(invoke);
                                                break;
                                            case 3:
                                                rect.bottom = field.getInt(invoke);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } else if (name.equals("left")) {
                                    obj = null;
                                    switch (obj) {
                                        case null:
                                            break;
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            } else if (name.equals("top")) {
                                obj = 1;
                                switch (obj) {
                                    case null:
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } else if (name.equals("bottom")) {
                            obj = 3;
                            switch (obj) {
                                case null:
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                default:
                                    break;
                            }
                        }
                        obj = -1;
                        switch (obj) {
                            case null:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                break;
                        }
                    }
                    return rect;
                }
            } catch (Exception e) {
                Log.e(TAG, "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return INSETS_NONE;
    }

    public static Mode parseTintMode(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }
}
