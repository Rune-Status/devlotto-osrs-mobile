package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

@RestrictTo({Scope.LIBRARY_GROUP})
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@Nullable Context context) {
        super(context);
    }

    public AlertDialogLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    private static int resolveMinimumHeight(View view) {
        int minimumHeight = ViewCompat.getMinimumHeight(view);
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return resolveMinimumHeight(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    private boolean tryOnMeasure(int i, int i2) {
        int i3;
        int id;
        int measuredHeight;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if (id != R.id.contentPanel && id != R.id.customPanel) {
                    return false;
                } else {
                    if (view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            id = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            id = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i3 = resolveMinimumHeight(view2);
            measuredHeight = view2.getMeasuredHeight() - i3;
            paddingTop += i3;
            id = View.combineMeasuredStates(id, view2.getMeasuredState());
            i4 = measuredHeight;
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight = view3.getMeasuredHeight();
            paddingTop += measuredHeight;
            id = View.combineMeasuredStates(id, view3.getMeasuredState());
            i5 = measuredHeight;
        } else {
            i5 = 0;
        }
        measuredHeight = size - paddingTop;
        if (view2 != null) {
            i4 = Math.min(measuredHeight, i4);
            if (i4 > 0) {
                measuredHeight -= i4;
                i4 += i3;
            } else {
                i4 = i3;
            }
            view2.measure(i, MeasureSpec.makeMeasureSpec(i4, 1073741824));
            i3 = view2.getMeasuredHeight() + (paddingTop - i3);
            i4 = View.combineMeasuredStates(id, view2.getMeasuredState());
            i6 = i3;
        } else {
            i4 = id;
            i6 = paddingTop;
        }
        if (view3 == null || measuredHeight <= 0) {
            measuredHeight = i4;
        } else {
            view3.measure(i, MeasureSpec.makeMeasureSpec(measuredHeight + i5, mode));
            i6 = view3.getMeasuredHeight() + (i6 - i5);
            measuredHeight = View.combineMeasuredStates(i4, view3.getMeasuredState());
        }
        i4 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                i4 = Math.max(i4, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i4 + (getPaddingLeft() + getPaddingRight()), i, measuredHeight), View.resolveSizeAndState(i6, i2, 0));
        if (mode2 != 1073741824) {
            forceUniformWidth(childCount, i2);
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = getPaddingRight();
        int paddingRight2 = getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i6 = gravity & 112;
        measuredHeight = i6 != 16 ? i6 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        int i7 = measuredHeight;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                measuredHeight = layoutParams.gravity;
                if (measuredHeight < 0) {
                    measuredHeight = GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK & gravity;
                }
                measuredHeight = GravityCompat.getAbsoluteGravity(measuredHeight, ViewCompat.getLayoutDirection(this)) & 7;
                int i9 = measuredHeight != 1 ? measuredHeight != 5 ? layoutParams.leftMargin + paddingLeft : ((i5 - paddingRight) - measuredWidth) - layoutParams.rightMargin : ((((((i5 - paddingLeft) - paddingRight2) - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                i7 = layoutParams.topMargin + (hasDividerBeforeChildAt(i8) ? i7 + intrinsicHeight : i7);
                setChildFrame(childAt, i9, i7, measuredWidth, measuredHeight2);
                i7 += layoutParams.bottomMargin + measuredHeight2;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (!tryOnMeasure(i, i2)) {
            super.onMeasure(i, i2);
        }
    }
}
