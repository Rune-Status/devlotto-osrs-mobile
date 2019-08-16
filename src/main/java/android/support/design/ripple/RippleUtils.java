package android.support.design.ripple;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.graphics.ColorUtils;
import android.util.StateSet;

@RestrictTo({Scope.LIBRARY_GROUP})
public class RippleUtils {
    private static final int[] FOCUSED_STATE_SET = new int[]{16842908};
    private static final int[] HOVERED_FOCUSED_STATE_SET = new int[]{16843623, 16842908};
    private static final int[] HOVERED_STATE_SET = new int[]{16843623};
    private static final int[] PRESSED_STATE_SET = new int[]{16842919};
    private static final int[] SELECTED_FOCUSED_STATE_SET = new int[]{16842913, 16842908};
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET = new int[]{16842913, 16843623, 16842908};
    private static final int[] SELECTED_HOVERED_STATE_SET = new int[]{16842913, 16843623};
    private static final int[] SELECTED_PRESSED_STATE_SET = new int[]{16842913, 16842919};
    private static final int[] SELECTED_STATE_SET = new int[]{16842913};
    public static final boolean USE_FRAMEWORK_RIPPLE = (VERSION.SDK_INT >= 21);

    private RippleUtils() {
    }

    @NonNull
    public static ColorStateList convertToRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        int[] iArr;
        int colorForState;
        int[] iArr2;
        int colorForState2;
        if (USE_FRAMEWORK_RIPPLE) {
            iArr = SELECTED_STATE_SET;
            colorForState = getColorForState(colorStateList, SELECTED_PRESSED_STATE_SET);
            iArr2 = StateSet.NOTHING;
            colorForState2 = getColorForState(colorStateList, PRESSED_STATE_SET);
            return new ColorStateList(new int[][]{iArr, iArr2}, new int[]{colorForState, colorForState2});
        }
        iArr = SELECTED_PRESSED_STATE_SET;
        colorForState = getColorForState(colorStateList, SELECTED_PRESSED_STATE_SET);
        iArr2 = SELECTED_HOVERED_FOCUSED_STATE_SET;
        colorForState2 = getColorForState(colorStateList, SELECTED_HOVERED_FOCUSED_STATE_SET);
        int[] iArr3 = SELECTED_FOCUSED_STATE_SET;
        int colorForState3 = getColorForState(colorStateList, SELECTED_FOCUSED_STATE_SET);
        int[] iArr4 = SELECTED_HOVERED_STATE_SET;
        int colorForState4 = getColorForState(colorStateList, SELECTED_HOVERED_STATE_SET);
        int[] iArr5 = SELECTED_STATE_SET;
        int[] iArr6 = PRESSED_STATE_SET;
        int colorForState5 = getColorForState(colorStateList, PRESSED_STATE_SET);
        int[] iArr7 = HOVERED_FOCUSED_STATE_SET;
        int colorForState6 = getColorForState(colorStateList, HOVERED_FOCUSED_STATE_SET);
        int[] iArr8 = FOCUSED_STATE_SET;
        int colorForState7 = getColorForState(colorStateList, FOCUSED_STATE_SET);
        int[] iArr9 = HOVERED_STATE_SET;
        int colorForState8 = getColorForState(colorStateList, HOVERED_STATE_SET);
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{colorForState, colorForState2, colorForState3, colorForState4, 0, colorForState5, colorForState6, colorForState7, colorForState8, 0});
    }

    @ColorInt
    @TargetApi(21)
    private static int doubleAlpha(@ColorInt int i) {
        return ColorUtils.setAlphaComponent(i, Math.min(Color.alpha(i) * 2, 255));
    }

    @ColorInt
    private static int getColorForState(@Nullable ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return USE_FRAMEWORK_RIPPLE ? doubleAlpha(colorForState) : colorForState;
    }
}
