package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public static class LayoutParams extends MarginLayoutParams {
        public int gravity;
        public float weight;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = -1;
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2);
            this.gravity = -1;
            this.weight = f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LinearLayoutCompat_Layout);
            this.weight = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.gravity = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
            this.weight = layoutParams.weight;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = -1;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.LinearLayoutCompat, i, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        i2 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* Access modifiers changed, original: 0000 */
    public void drawDividersHorizontal(Canvas canvas) {
        LayoutParams layoutParams;
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, isLayoutRtl ? layoutParams.rightMargin + virtualChildAt.getRight() : (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            int paddingLeft;
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                paddingLeft = isLayoutRtl ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.mDividerWidth;
            } else {
                layoutParams = (LayoutParams) virtualChildAt2.getLayoutParams();
                paddingLeft = isLayoutRtl ? (virtualChildAt2.getLeft() - layoutParams.leftMargin) - this.mDividerWidth : layoutParams.rightMargin + virtualChildAt2.getRight();
            }
            drawVerticalDivider(canvas, paddingLeft);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            int height;
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                height = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt2.getLayoutParams();
                height = layoutParams.bottomMargin + virtualChildAt2.getBottom();
            }
            drawHorizontalDivider(canvas, height);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    /* Access modifiers changed, original: 0000 */
    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -2) : this.mOrientation == 1 ? new LayoutParams(-1, -2) : null;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getBaseline() {
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        if (getChildCount() > this.mBaselineAlignedChildIndex) {
            View childAt = getChildAt(this.mBaselineAlignedChildIndex);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i;
                int i2 = this.mBaselineChildTop;
                if (this.mOrientation == 1) {
                    i = this.mGravity & 112;
                    if (i != 48) {
                        i = i != 16 ? i != 80 ? i2 : ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength : i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2);
                        return (((LayoutParams) childAt.getLayoutParams()).topMargin + i) + baseline;
                    }
                }
                i = i2;
                return (((LayoutParams) childAt.getLayoutParams()).topMargin + i) + baseline;
            } else if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    /* Access modifiers changed, original: 0000 */
    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    /* Access modifiers changed, original: 0000 */
    public int getLocationOffset(View view) {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    /* Access modifiers changed, original: 0000 */
    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    /* Access modifiers changed, original: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    /* Access modifiers changed, original: protected */
    @RestrictTo({Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            if ((this.mShowDividers & 1) != 0) {
                return true;
            }
        } else if (i == getChildCount()) {
            if ((this.mShowDividers & 4) != 0) {
                return true;
            }
        } else if ((this.mShowDividers & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* Access modifiers changed, original: 0000 */
    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = getPaddingBottom();
        int paddingBottom2 = getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.mGravity;
        int i9 = this.mGravity & 112;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        i8 = GravityCompat.getAbsoluteGravity(i8 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK, ViewCompat.getLayoutDirection(this));
        int paddingLeft = i8 != 1 ? i8 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.mTotalLength : (((i3 - i) - this.mTotalLength) / 2) + getPaddingLeft();
        if (isLayoutRtl) {
            i5 = -1;
            i6 = virtualChildCount - 1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i10 = 0;
        while (i10 < virtualChildCount) {
            int measureNullChild;
            int i11 = i6 + (i5 * i10);
            View virtualChildAt = getVirtualChildAt(i11);
            if (virtualChildAt == null) {
                measureNullChild = measureNullChild(i11) + paddingLeft;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                measureNullChild = (!z || layoutParams.height == -1) ? -1 : virtualChildAt.getBaseline();
                int i12 = layoutParams.gravity;
                if (i12 < 0) {
                    i12 = i9;
                }
                i12 &= 112;
                if (i12 == 16) {
                    i12 = ((((((i7 - paddingTop) - paddingBottom2) - measuredHeight) / 2) + paddingTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                } else if (i12 != 48) {
                    if (i12 != 80) {
                        measureNullChild = paddingTop;
                    } else {
                        i12 = ((i7 - paddingBottom) - measuredHeight) - layoutParams.bottomMargin;
                        measureNullChild = measureNullChild != -1 ? i12 - (iArr2[2] - (virtualChildAt.getMeasuredHeight() - measureNullChild)) : i12;
                    }
                    i12 = measureNullChild;
                } else {
                    i12 = layoutParams.topMargin + paddingTop;
                    i12 = measureNullChild != -1 ? (iArr[1] - measureNullChild) + i12 : i12;
                }
                if (hasDividerBeforeChildAt(i11)) {
                    paddingLeft += this.mDividerWidth;
                }
                int i13 = layoutParams.leftMargin + paddingLeft;
                setChildFrame(virtualChildAt, i13 + getLocationOffset(virtualChildAt), i12, measuredWidth, measuredHeight);
                paddingLeft = i13 + ((measuredWidth + layoutParams.rightMargin) + getNextLocationOffset(virtualChildAt));
                i8 = getChildrenSkipCount(virtualChildAt, i11) + i10;
                i10 = i8 + 1;
            } else {
                measureNullChild = paddingLeft;
            }
            i8 = i10;
            paddingLeft = measureNullChild;
            i10 = i8 + 1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = getPaddingRight();
        int paddingRight2 = getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i6 = this.mGravity & 112;
        int i7 = this.mGravity;
        i6 = i6 != 16 ? i6 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength : getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        int i8 = 0;
        int i9 = i6;
        while (i8 < virtualChildCount) {
            int measureNullChild;
            View virtualChildAt = getVirtualChildAt(i8);
            if (virtualChildAt == null) {
                measureNullChild = i9 + measureNullChild(i8);
                i6 = i8;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                i6 = layoutParams.gravity;
                if (i6 < 0) {
                    i6 = GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK & i7;
                }
                i6 = GravityCompat.getAbsoluteGravity(i6, ViewCompat.getLayoutDirection(this)) & 7;
                int i10 = i6 != 1 ? i6 != 5 ? layoutParams.leftMargin + paddingLeft : ((i5 - paddingRight) - measuredWidth) - layoutParams.rightMargin : ((((((i5 - paddingLeft) - paddingRight2) - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                if (hasDividerBeforeChildAt(i8)) {
                    i9 += this.mDividerHeight;
                }
                int i11 = i9 + layoutParams.topMargin;
                setChildFrame(virtualChildAt, i10, i11 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                i6 = getChildrenSkipCount(virtualChildAt, i8) + i8;
                measureNullChild = ((measuredHeight + layoutParams.bottomMargin) + getNextLocationOffset(virtualChildAt)) + i11;
            } else {
                i6 = i8;
                measureNullChild = i9;
            }
            i8 = i6 + 1;
            i9 = measureNullChild;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        int measuredHeight;
        int i5;
        int max;
        int i6;
        Object obj;
        int i7;
        LayoutParams layoutParams;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z = this.mBaselineAligned;
        boolean z2 = this.mUseLargestChild;
        Object obj2 = mode == 1073741824 ? 1 : null;
        float f = 0.0f;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        Object obj3 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        Object obj4 = 1;
        Object obj5 = null;
        while (i8 < virtualChildCount) {
            float f2;
            Object obj6;
            View virtualChildAt = getVirtualChildAt(i8);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i8);
            } else if (virtualChildAt.getVisibility() == 8) {
                i8 += getChildrenSkipCount(virtualChildAt, i8);
            } else {
                Object obj7;
                Object obj8;
                int i14;
                if (hasDividerBeforeChildAt(i8)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt.getLayoutParams();
                f2 = f + layoutParams2.weight;
                if (mode == 1073741824 && layoutParams2.width == 0 && layoutParams2.weight > 0.0f) {
                    if (obj2 != null) {
                        this.mTotalLength += layoutParams2.leftMargin + layoutParams2.rightMargin;
                    } else {
                        i3 = this.mTotalLength;
                        this.mTotalLength = Math.max(i3, (layoutParams2.leftMargin + i3) + layoutParams2.rightMargin);
                    }
                    if (z) {
                        i3 = MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(i3, i3);
                        i3 = i9;
                    } else {
                        obj3 = 1;
                        i4 = i9;
                        if (mode2 == 1073741824 && layoutParams2.height == -1) {
                            obj7 = 1;
                            obj8 = 1;
                        } else {
                            obj7 = null;
                            obj8 = obj5;
                        }
                        i14 = layoutParams2.topMargin + layoutParams2.bottomMargin;
                        measuredHeight = virtualChildAt.getMeasuredHeight() + i14;
                        i13 = View.combineMeasuredStates(i13, virtualChildAt.getMeasuredState());
                        if (z) {
                            i9 = virtualChildAt.getBaseline();
                            if (i9 != -1) {
                                i5 = ((((layoutParams2.gravity < 0 ? this.mGravity : layoutParams2.gravity) & 112) >> 4) & -2) >> 1;
                                iArr[i5] = Math.max(iArr[i5], i9);
                                iArr2[i5] = Math.max(iArr2[i5], measuredHeight - i9);
                            }
                        }
                        i9 = Math.max(i10, measuredHeight);
                        obj6 = (obj4 == null && layoutParams2.height == -1) ? 1 : null;
                        if (layoutParams2.weight <= 0.0f) {
                            max = Math.max(i12, obj7 != null ? i14 : measuredHeight);
                            measuredHeight = i11;
                        } else {
                            if (obj7 == null) {
                                i14 = measuredHeight;
                            }
                            measuredHeight = Math.max(i11, i14);
                            max = i12;
                        }
                        i8 += getChildrenSkipCount(virtualChildAt, i8);
                        i6 = i9;
                        obj = obj3;
                        i12 = max;
                        obj5 = obj8;
                        i7 = i13;
                        i11 = measuredHeight;
                        i8++;
                        i10 = i6;
                        obj3 = obj;
                        i13 = i7;
                        i9 = i4;
                        obj4 = obj6;
                        f = f2;
                    }
                } else {
                    if (layoutParams2.width != 0 || layoutParams2.weight <= 0.0f) {
                        i4 = Integer.MIN_VALUE;
                    } else {
                        layoutParams2.width = -2;
                        i4 = 0;
                    }
                    measureChildBeforeLayout(virtualChildAt, i8, i, f2 == 0.0f ? this.mTotalLength : 0, i2, 0);
                    if (i4 != Integer.MIN_VALUE) {
                        layoutParams2.width = i4;
                    }
                    i3 = virtualChildAt.getMeasuredWidth();
                    if (obj2 != null) {
                        this.mTotalLength += ((layoutParams2.leftMargin + i3) + layoutParams2.rightMargin) + getNextLocationOffset(virtualChildAt);
                    } else {
                        max = this.mTotalLength;
                        this.mTotalLength = Math.max(max, (((max + i3) + layoutParams2.leftMargin) + layoutParams2.rightMargin) + getNextLocationOffset(virtualChildAt));
                    }
                    i3 = z2 ? Math.max(i3, i9) : i9;
                }
                i4 = i3;
                if (mode2 == 1073741824) {
                }
                obj7 = null;
                obj8 = obj5;
                i14 = layoutParams2.topMargin + layoutParams2.bottomMargin;
                measuredHeight = virtualChildAt.getMeasuredHeight() + i14;
                i13 = View.combineMeasuredStates(i13, virtualChildAt.getMeasuredState());
                if (z) {
                }
                i9 = Math.max(i10, measuredHeight);
                if (obj4 == null) {
                }
                if (layoutParams2.weight <= 0.0f) {
                }
                i8 += getChildrenSkipCount(virtualChildAt, i8);
                i6 = i9;
                obj = obj3;
                i12 = max;
                obj5 = obj8;
                i7 = i13;
                i11 = measuredHeight;
                i8++;
                i10 = i6;
                obj3 = obj;
                i13 = i7;
                i9 = i4;
                obj4 = obj6;
                f = f2;
            }
            i6 = i10;
            obj = obj3;
            i7 = i13;
            i4 = i9;
            obj6 = obj4;
            f2 = f;
            i8++;
            i10 = i6;
            obj3 = obj;
            i13 = i7;
            i9 = i4;
            obj4 = obj6;
            f = f2;
        }
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        i8 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i10 : Math.max(i10, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z2 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            i6 = 0;
            while (i6 < virtualChildCount) {
                View virtualChildAt2 = getVirtualChildAt(i6);
                if (virtualChildAt2 == null) {
                    this.mTotalLength += measureNullChild(i6);
                    i3 = i6;
                } else if (virtualChildAt2.getVisibility() == 8) {
                    i3 = getChildrenSkipCount(virtualChildAt2, i6) + i6;
                } else {
                    layoutParams = (LayoutParams) virtualChildAt2.getLayoutParams();
                    if (obj2 != null) {
                        this.mTotalLength = ((layoutParams.rightMargin + (layoutParams.leftMargin + i9)) + getNextLocationOffset(virtualChildAt2)) + this.mTotalLength;
                        i3 = i6;
                    } else {
                        measuredHeight = this.mTotalLength;
                        this.mTotalLength = Math.max(measuredHeight, (layoutParams.rightMargin + ((measuredHeight + i9) + layoutParams.leftMargin)) + getNextLocationOffset(virtualChildAt2));
                        i6++;
                    }
                }
                i6 = i3;
                i6++;
            }
        }
        i6 = i8;
        this.mTotalLength += getPaddingLeft() + getPaddingRight();
        i4 = View.resolveSizeAndState(Math.max(this.mTotalLength, getSuggestedMinimumWidth()), i, 0);
        i7 = (ViewCompat.MEASURED_SIZE_MASK & i4) - this.mTotalLength;
        if (obj3 != null || (i7 != 0 && f > 0.0f)) {
            if (this.mWeightSum > 0.0f) {
                f = this.mWeightSum;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.mTotalLength = 0;
            i5 = -1;
            i10 = 0;
            measuredHeight = i11;
            obj = obj4;
            i9 = i13;
            float f3 = f;
            while (i10 < virtualChildCount) {
                Object obj9;
                View virtualChildAt3 = getVirtualChildAt(i10);
                if (virtualChildAt3 == null) {
                    i3 = i5;
                    i6 = measuredHeight;
                    obj9 = obj;
                } else if (virtualChildAt3.getVisibility() == 8) {
                    i3 = i5;
                    i6 = measuredHeight;
                    obj9 = obj;
                } else {
                    layoutParams = (LayoutParams) virtualChildAt3.getLayoutParams();
                    f = layoutParams.weight;
                    if (f > 0.0f) {
                        i8 = (int) ((((float) i7) * f) / f3);
                        int childMeasureSpec = getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin, layoutParams.height);
                        if (layoutParams.width == 0 && mode == 1073741824) {
                            virtualChildAt3.measure(MeasureSpec.makeMeasureSpec(i8 > 0 ? i8 : 0, 1073741824), childMeasureSpec);
                        } else {
                            i6 = virtualChildAt3.getMeasuredWidth() + i8;
                            if (i6 < 0) {
                                i6 = 0;
                            }
                            virtualChildAt3.measure(MeasureSpec.makeMeasureSpec(i6, 1073741824), childMeasureSpec);
                        }
                        i9 = View.combineMeasuredStates(i9, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                        f3 -= f;
                        i7 -= i8;
                    }
                    if (obj2 != null) {
                        this.mTotalLength += ((virtualChildAt3.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin) + getNextLocationOffset(virtualChildAt3);
                    } else {
                        i6 = this.mTotalLength;
                        this.mTotalLength = Math.max(i6, (((virtualChildAt3.getMeasuredWidth() + i6) + layoutParams.leftMargin) + layoutParams.rightMargin) + getNextLocationOffset(virtualChildAt3));
                    }
                    Object obj10 = (mode2 == 1073741824 || layoutParams.height != -1) ? null : 1;
                    i8 = layoutParams.topMargin + layoutParams.bottomMargin;
                    max = virtualChildAt3.getMeasuredHeight() + i8;
                    i5 = Math.max(i5, max);
                    i6 = Math.max(measuredHeight, obj10 != null ? i8 : max);
                    obj9 = (obj == null || layoutParams.height != -1) ? null : 1;
                    if (z) {
                        measuredHeight = virtualChildAt3.getBaseline();
                        if (measuredHeight != -1) {
                            i3 = ((((layoutParams.gravity < 0 ? this.mGravity : layoutParams.gravity) & 112) >> 4) & -2) >> 1;
                            iArr[i3] = Math.max(iArr[i3], measuredHeight);
                            iArr2[i3] = Math.max(iArr2[i3], max - measuredHeight);
                        }
                    }
                    i3 = i5;
                }
                i10++;
                i5 = i3;
                measuredHeight = i6;
                obj = obj9;
                i7 = i7;
            }
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i5 = Math.max(i5, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            i13 = i9;
            obj4 = obj;
            i8 = virtualChildCount;
            i3 = measuredHeight;
            i6 = i5;
        } else {
            measuredHeight = Math.max(i11, i12);
            if (z2 && mode != 1073741824) {
                i3 = 0;
                while (true) {
                    i8 = i3;
                    if (i8 >= virtualChildCount) {
                        break;
                    }
                    View virtualChildAt4 = getVirtualChildAt(i8);
                    if (!(virtualChildAt4 == null || virtualChildAt4.getVisibility() == 8 || ((LayoutParams) virtualChildAt4.getLayoutParams()).weight <= 0.0f)) {
                        virtualChildAt4.measure(MeasureSpec.makeMeasureSpec(i9, 1073741824), MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                    i3 = i8 + 1;
                }
            }
            i8 = virtualChildCount;
            i3 = measuredHeight;
        }
        if (obj4 != null || mode2 == 1073741824) {
            i3 = i6;
        }
        setMeasuredDimension((ViewCompat.MEASURED_STATE_MASK & i13) | i4, View.resolveSizeAndState(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i13 << 16));
        if (obj5 != null) {
            forceUniformHeight(i8, i);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int measureNullChild(int i) {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void measureVertical(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        View virtualChildAt;
        LayoutParams layoutParams;
        int i8;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int i9 = this.mBaselineAlignedChildIndex;
        boolean z = this.mUseLargestChild;
        float f = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        Object obj2 = null;
        Object obj3 = 1;
        Object obj4 = null;
        while (i15 < virtualChildCount) {
            Object obj5;
            Object obj6;
            Object obj7;
            float f2;
            View virtualChildAt2 = getVirtualChildAt(i15);
            if (virtualChildAt2 == null) {
                this.mTotalLength += measureNullChild(i15);
                i3 = i11;
                obj5 = obj2;
                obj6 = obj4;
                i4 = i12;
                obj7 = obj3;
                f2 = f;
            } else if (virtualChildAt2.getVisibility() == 8) {
                i15 += getChildrenSkipCount(virtualChildAt2, i15);
                i3 = i11;
                obj5 = obj2;
                obj6 = obj4;
                i4 = i12;
                obj7 = obj3;
                f2 = f;
            } else {
                if (hasDividerBeforeChildAt(i15)) {
                    this.mTotalLength += this.mDividerHeight;
                }
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                f2 = f + layoutParams2.weight;
                if (mode2 == 1073741824 && layoutParams2.height == 0 && layoutParams2.weight > 0.0f) {
                    i5 = this.mTotalLength;
                    this.mTotalLength = Math.max(i5, (layoutParams2.topMargin + i5) + layoutParams2.bottomMargin);
                    obj2 = 1;
                } else {
                    int i16;
                    if (layoutParams2.height != 0 || layoutParams2.weight <= 0.0f) {
                        i16 = Integer.MIN_VALUE;
                    } else {
                        layoutParams2.height = -2;
                        i16 = 0;
                    }
                    measureChildBeforeLayout(virtualChildAt2, i15, i, 0, i2, f2 == 0.0f ? this.mTotalLength : 0);
                    if (i16 != Integer.MIN_VALUE) {
                        layoutParams2.height = i16;
                    }
                    i5 = virtualChildAt2.getMeasuredHeight();
                    i6 = this.mTotalLength;
                    this.mTotalLength = Math.max(i6, (((i6 + i5) + layoutParams2.topMargin) + layoutParams2.bottomMargin) + getNextLocationOffset(virtualChildAt2));
                    if (z) {
                        i12 = Math.max(i5, i12);
                    }
                }
                if (i9 >= 0 && i9 == i15 + 1) {
                    this.mBaselineChildTop = this.mTotalLength;
                }
                if (i15 >= i9 || layoutParams2.weight <= 0.0f) {
                    if (mode == 1073741824 || layoutParams2.width != -1) {
                        obj = null;
                        obj6 = obj4;
                    } else {
                        obj = 1;
                        obj6 = 1;
                    }
                    i7 = layoutParams2.rightMargin + layoutParams2.leftMargin;
                    int measuredWidth = virtualChildAt2.getMeasuredWidth() + i7;
                    int max = Math.max(i11, measuredWidth);
                    i11 = View.combineMeasuredStates(i10, virtualChildAt2.getMeasuredState());
                    obj7 = (obj3 == null || layoutParams2.width != -1) ? null : 1;
                    if (layoutParams2.weight > 0.0f) {
                        i6 = Math.max(i13, obj != null ? i7 : measuredWidth);
                        i7 = i14;
                    } else {
                        if (obj != null) {
                            measuredWidth = i7;
                        }
                        i7 = Math.max(i14, measuredWidth);
                        i6 = i13;
                    }
                    i15 += getChildrenSkipCount(virtualChildAt2, i15);
                    i3 = max;
                    obj5 = obj2;
                    i4 = i12;
                    i14 = i7;
                    i13 = i6;
                    i10 = i11;
                } else {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
            }
            i15++;
            i11 = i3;
            obj2 = obj5;
            obj4 = obj6;
            i12 = i4;
            obj3 = obj7;
            f = f2;
        }
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerHeight;
        }
        if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.mTotalLength = 0;
            i3 = 0;
            while (i3 < virtualChildCount) {
                virtualChildAt = getVirtualChildAt(i3);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i3);
                    i5 = i3;
                } else if (virtualChildAt.getVisibility() == 8) {
                    i5 = getChildrenSkipCount(virtualChildAt, i3) + i3;
                } else {
                    layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    i8 = this.mTotalLength;
                    this.mTotalLength = Math.max(i8, (layoutParams.bottomMargin + ((i8 + i12) + layoutParams.topMargin)) + getNextLocationOffset(virtualChildAt));
                    i5 = i3;
                }
                i3 = i5 + 1;
            }
        }
        this.mTotalLength += getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(this.mTotalLength, getSuggestedMinimumHeight()), i2, 0);
        i8 = (ViewCompat.MEASURED_SIZE_MASK & resolveSizeAndState) - this.mTotalLength;
        if (obj2 != null || (i8 != 0 && f > 0.0f)) {
            if (this.mWeightSum > 0.0f) {
                f = this.mWeightSum;
            }
            this.mTotalLength = 0;
            i4 = i11;
            int i17 = 0;
            Object obj8 = obj3;
            i7 = i10;
            float f3 = f;
            while (i17 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i17);
                if (virtualChildAt3.getVisibility() == 8) {
                    i5 = i4;
                    obj = obj8;
                    i15 = i7;
                } else {
                    layoutParams = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f4 = layoutParams.weight;
                    if (f4 > 0.0f) {
                        i15 = (int) ((((float) i8) * f4) / f3);
                        i6 = getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin, layoutParams.width);
                        if (layoutParams.height == 0 && mode2 == 1073741824) {
                            virtualChildAt3.measure(i6, MeasureSpec.makeMeasureSpec(i15 > 0 ? i15 : 0, 1073741824));
                        } else {
                            i3 = virtualChildAt3.getMeasuredHeight() + i15;
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            virtualChildAt3.measure(i6, MeasureSpec.makeMeasureSpec(i3, 1073741824));
                        }
                        i3 = i8 - i15;
                        i15 = View.combineMeasuredStates(i7, virtualChildAt3.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                        f3 -= f4;
                    } else {
                        i3 = i8;
                        i15 = i7;
                    }
                    i6 = layoutParams.leftMargin + layoutParams.rightMargin;
                    i8 = virtualChildAt3.getMeasuredWidth() + i6;
                    i7 = Math.max(i4, i8);
                    Object obj9 = (mode == 1073741824 || layoutParams.width != -1) ? null : 1;
                    if (obj9 == null) {
                        i6 = i8;
                    }
                    i4 = Math.max(i14, i6);
                    obj = (obj8 == null || layoutParams.width != -1) ? null : 1;
                    i8 = this.mTotalLength;
                    this.mTotalLength = Math.max(i8, (layoutParams.bottomMargin + ((virtualChildAt3.getMeasuredHeight() + i8) + layoutParams.topMargin)) + getNextLocationOffset(virtualChildAt3));
                    i5 = i7;
                    i8 = i3;
                    i14 = i4;
                }
                i4 = i5;
                i17++;
                obj8 = obj;
                i7 = i15;
            }
            this.mTotalLength += getPaddingTop() + getPaddingBottom();
            i3 = i4;
            obj3 = obj8;
            i10 = i7;
            i5 = i14;
        } else {
            i14 = Math.max(i14, i13);
            if (z && mode2 != 1073741824) {
                i5 = 0;
                while (true) {
                    i3 = i5;
                    if (i3 >= virtualChildCount) {
                        break;
                    }
                    virtualChildAt = getVirtualChildAt(i3);
                    if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || ((LayoutParams) virtualChildAt.getLayoutParams()).weight <= 0.0f)) {
                        virtualChildAt.measure(MeasureSpec.makeMeasureSpec(virtualChildAt.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    i5 = i3 + 1;
                }
            }
            i3 = i11;
            i5 = i14;
        }
        if (obj3 != null || mode == 1073741824) {
            i5 = i3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i5 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i10), resolveSizeAndState);
        if (obj4 != null) {
            forceUniformWidth(virtualChildCount, i2);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("base aligned child index out of range (0, ");
            stringBuilder.append(getChildCount());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.mBaselineAlignedChildIndex = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            int i2 = (GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK & i) == 0 ? GravityCompat.START | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.mGravity = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if ((this.mGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) != i2) {
            this.mGravity = i2 | (this.mGravity & -8388616);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.mGravity & 112) != i2) {
            this.mGravity = i2 | (this.mGravity & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
