package android.support.design.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.design.R;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

@RestrictTo({Scope.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private boolean singleLine;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    private static int getMeasuredDimension(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    private void loadFromAttributes(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected */
    public int getItemSpacing() {
        return this.itemSpacing;
    }

    /* Access modifiers changed, original: protected */
    public int getLineSpacing() {
        return this.lineSpacing;
    }

    /* Access modifiers changed, original: protected */
    public boolean isSingleLine() {
        return this.singleLine;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != 0) {
            Object obj = ViewCompat.getLayoutDirection(this) == 1 ? 1 : null;
            int paddingRight = obj != null ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = obj != null ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i5 = (i3 - i) - paddingLeft;
            int i6 = paddingTop;
            int i7 = paddingRight;
            int i8 = paddingTop;
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    int marginEnd;
                    LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        paddingTop = MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
                        marginEnd = MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
                        paddingLeft = paddingTop;
                    } else {
                        paddingLeft = 0;
                        marginEnd = 0;
                    }
                    paddingTop = childAt.getMeasuredWidth();
                    if (!this.singleLine && paddingTop + (r4 + paddingLeft) > i5) {
                        i8 = i6 + this.lineSpacing;
                        i7 = paddingRight;
                    }
                    paddingTop = i7 + paddingLeft;
                    int measuredWidth = childAt.getMeasuredWidth() + paddingTop;
                    i6 = childAt.getMeasuredHeight() + i8;
                    if (obj != null) {
                        childAt.layout(i5 - measuredWidth, i8, (i5 - i7) - paddingLeft, i6);
                    } else {
                        childAt.layout(paddingTop, i8, measuredWidth, i6);
                    }
                    i7 += ((paddingLeft + marginEnd) + childAt.getMeasuredWidth()) + this.itemSpacing;
                }
                i6 = i6;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int i3 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int i4 = 0;
        int i5 = 0;
        int i6 = paddingTop;
        int i7 = paddingTop;
        while (i4 < getChildCount()) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int i8;
                measureChild(childAt, i, i2);
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i8 = marginLayoutParams.leftMargin + 0;
                    paddingTop = marginLayoutParams.rightMargin + 0;
                } else {
                    i8 = 0;
                    paddingTop = 0;
                }
                if (childAt.getMeasuredWidth() + (paddingLeft + i8) > i3 - paddingRight && !isSingleLine()) {
                    paddingLeft = getPaddingLeft();
                    i7 = this.lineSpacing + i6;
                }
                i6 = (paddingLeft + i8) + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i6 > i5) {
                    i5 = i6;
                }
                i6 = measuredHeight + i7;
                paddingLeft += ((paddingTop + i8) + childAt.getMeasuredWidth()) + this.itemSpacing;
            }
            i4++;
            i6 = i6;
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, i5), getMeasuredDimension(size2, mode2, i6));
    }

    /* Access modifiers changed, original: protected */
    public void setItemSpacing(int i) {
        this.itemSpacing = i;
    }

    /* Access modifiers changed, original: protected */
    public void setLineSpacing(int i) {
        this.lineSpacing = i;
    }

    public void setSingleLine(boolean z) {
        this.singleLine = z;
    }
}
