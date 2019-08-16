package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.StyleRes;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.ItemInvoker;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends LinearLayoutCompat implements ItemInvoker, MenuView {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    @RestrictTo({Scope.LIBRARY_GROUP})
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    private static class ActionMenuPresenterCallback implements Callback {
        ActionMenuPresenterCallback() {
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            return false;
        }
    }

    public static class LayoutParams extends android.support.v7.widget.LinearLayoutCompat.LayoutParams {
        @ExportedProperty
        public int cellsUsed;
        @ExportedProperty
        public boolean expandable;
        boolean expanded;
        @ExportedProperty
        public int extraPixels;
        @ExportedProperty
        public boolean isOverflowButton;
        @ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.isOverflowButton = false;
        }

        LayoutParams(int i, int i2, boolean z) {
            super(i, i2);
            this.isOverflowButton = z;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((android.view.ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private class MenuBuilderCallback implements MenuBuilder.Callback {
        MenuBuilderCallback() {
        }

        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return ActionMenuView.this.mOnMenuItemClickListener != null && ActionMenuView.this.mOnMenuItemClickListener.onMenuItemClick(menuItem);
        }

        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (ActionMenuView.this.mMenuBuilderCallback != null) {
                ActionMenuView.this.mMenuBuilderCallback.onMenuModeChange(menuBuilder);
            }
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f);
        this.mGeneratedItemPadding = (int) (f * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    static int measureChildForCells(View view, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.hasText();
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z2 && i5 < 2) {
                i5 = 2;
            }
        }
        if (!layoutParams.isOverflowButton && z2) {
            z = true;
        }
        layoutParams.expandable = z;
        layoutParams.cellsUsed = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onMeasureExactFormat(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i3 = size - (paddingLeft + paddingRight);
        int i4 = i3 / this.mMinCellSize;
        size = this.mMinCellSize;
        if (i4 == 0) {
            setMeasuredDimension(i3, 0);
            return;
        }
        View childAt;
        int i5;
        int i6;
        LayoutParams layoutParams;
        long j;
        Object obj;
        int i7 = this.mMinCellSize + ((i3 % size) / i4);
        int childCount = getChildCount();
        int i8 = 0;
        Object obj2 = null;
        paddingLeft = 0;
        int i9 = 0;
        int i10 = 0;
        long j2 = 0;
        int i11 = 0;
        while (i11 < childCount) {
            int i12;
            childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                i5 = paddingLeft;
                i6 = i10;
                i12 = i4;
            } else {
                boolean z = childAt instanceof ActionMenuItemView;
                i5 = paddingLeft + 1;
                if (z) {
                    childAt.setPadding(this.mGeneratedItemPadding, 0, this.mGeneratedItemPadding, 0);
                }
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = false;
                layoutParams.extraPixels = 0;
                layoutParams.cellsUsed = 0;
                layoutParams.expandable = false;
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                boolean z2 = z && ((ActionMenuItemView) childAt).hasText();
                layoutParams.preventEdgeOffset = z2;
                i6 = measureChildForCells(childAt, i7, layoutParams.isOverflowButton ? 1 : i4, childMeasureSpec, paddingTop);
                i9 = Math.max(i9, i6);
                paddingLeft = layoutParams.expandable ? i10 + 1 : i10;
                i12 = i4 - i6;
                j2 = i6 == 1 ? ((long) (1 << i11)) | j2 : j2;
                i8 = Math.max(i8, childAt.getMeasuredHeight());
                i6 = paddingLeft;
                obj2 = layoutParams.isOverflowButton ? 1 : obj2;
            }
            paddingLeft = i5;
            i11++;
            i10 = i6;
            i4 = i12;
        }
        Object obj3 = (obj2 == null || paddingLeft != 2) ? null : 1;
        Object obj4 = null;
        long j3 = j2;
        paddingTop = i4;
        while (i10 > 0 && paddingTop > 0) {
            i5 = 0;
            i4 = Integer.MAX_VALUE;
            j2 = 0;
            int i13 = 0;
            while (i13 < childCount) {
                layoutParams = (LayoutParams) getChildAt(i13).getLayoutParams();
                if (!layoutParams.expandable) {
                    size = i4;
                } else if (layoutParams.cellsUsed < i4) {
                    size = layoutParams.cellsUsed;
                    j2 = 1 << i13;
                    i5 = 1;
                } else if (layoutParams.cellsUsed == i4) {
                    j2 |= 1 << i13;
                    i5++;
                    size = i4;
                } else {
                    size = i4;
                }
                i13++;
                i4 = size;
            }
            j3 |= j2;
            if (i5 > paddingTop) {
                j = j3;
                break;
            }
            i5 = paddingTop;
            i6 = 0;
            while (i6 < childCount) {
                View childAt2 = getChildAt(i6);
                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                long j4 = (long) (1 << i6);
                if ((j2 & j4) != 0) {
                    if (obj3 != null && layoutParams.preventEdgeOffset && i5 == 1) {
                        childAt2.setPadding(this.mGeneratedItemPadding + i7, 0, this.mGeneratedItemPadding, 0);
                    }
                    layoutParams.cellsUsed++;
                    layoutParams.expanded = true;
                    size = i5 - 1;
                } else if (layoutParams.cellsUsed == i4 + 1) {
                    j3 |= j4;
                    size = i5;
                } else {
                    size = i5;
                }
                i6++;
                i5 = size;
            }
            obj4 = 1;
            paddingTop = i5;
        }
        j = j3;
        Object obj5 = (obj2 == null && paddingLeft == 1) ? 1 : null;
        if (paddingTop <= 0 || j == 0 || (paddingTop >= paddingLeft - 1 && obj5 == null && i9 <= 1)) {
            obj = obj4;
        } else {
            float f;
            int i14;
            float bitCount = (float) Long.bitCount(j);
            if (obj5 == null) {
                if (!((1 & j) == 0 || ((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset)) {
                    bitCount -= 0.5f;
                }
                size = childCount - 1;
                if (!((((long) (1 << size)) & j) == 0 || ((LayoutParams) getChildAt(size).getLayoutParams()).preventEdgeOffset)) {
                    f = bitCount - 0.5f;
                    paddingLeft = f <= 0.0f ? (int) (((float) (paddingTop * i7)) / f) : 0;
                    i14 = 0;
                    obj = obj4;
                    while (i14 < childCount) {
                        if ((((long) (1 << i14)) & j) == 0) {
                            obj5 = obj;
                        } else {
                            View childAt3 = getChildAt(i14);
                            layoutParams = (LayoutParams) childAt3.getLayoutParams();
                            if (childAt3 instanceof ActionMenuItemView) {
                                layoutParams.extraPixels = paddingLeft;
                                layoutParams.expanded = true;
                                if (i14 == 0 && !layoutParams.preventEdgeOffset) {
                                    layoutParams.leftMargin = (-paddingLeft) / 2;
                                }
                            } else if (layoutParams.isOverflowButton) {
                                layoutParams.extraPixels = paddingLeft;
                                layoutParams.expanded = true;
                                layoutParams.rightMargin = (-paddingLeft) / 2;
                            } else {
                                if (i14 != 0) {
                                    layoutParams.leftMargin = paddingLeft / 2;
                                }
                                if (i14 != childCount - 1) {
                                    layoutParams.rightMargin = paddingLeft / 2;
                                    obj5 = obj;
                                } else {
                                    obj5 = obj;
                                }
                            }
                            obj5 = 1;
                        }
                        i14++;
                        obj = obj5;
                    }
                }
            }
            f = bitCount;
            if (f <= 0.0f) {
            }
            i14 = 0;
            obj = obj4;
            while (i14 < childCount) {
            }
        }
        size = 0;
        if (obj != null) {
            while (true) {
                paddingLeft = size;
                if (paddingLeft >= childCount) {
                    break;
                }
                childAt = getChildAt(paddingLeft);
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.expanded) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(layoutParams.extraPixels + (layoutParams.cellsUsed * i7), 1073741824), childMeasureSpec);
                }
                size = paddingLeft + 1;
            }
        }
        if (mode == 1073741824) {
            i8 = size2;
        }
        setMeasuredDimension(i3, i8);
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    public void dismissPopupMenus() {
        if (this.mPresenter != null) {
            this.mPresenter.dismissPopupMenus();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.gravity > 0) {
            return layoutParams2;
        }
        layoutParams2.gravity = 16;
        return layoutParams2;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            this.mMenu = new MenuBuilder(context);
            this.mMenu.setCallback(new MenuBuilderCallback());
            this.mPresenter = new ActionMenuPresenter(context);
            this.mPresenter.setReserveOverflow(true);
            this.mPresenter.setCallback(this.mActionMenuPresenterCallback != null ? this.mActionMenuPresenterCallback : new ActionMenuPresenterCallback());
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getWindowAnimations() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean hasSupportDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z = ((ActionMenuChildView) childAt).needsDividerAfter() | 0;
        }
        return (i <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? z : ((ActionMenuChildView) childAt2).needsDividerBefore() | z;
    }

    public boolean hideOverflowMenu() {
        return this.mPresenter != null && this.mPresenter.hideOverflowMenu();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isOverflowMenuShowPending() {
        return this.mPresenter != null && this.mPresenter.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        return this.mPresenter != null && this.mPresenter.isOverflowMenuShowing();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mPresenter != null) {
            this.mPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mFormatItems) {
            int i5;
            LayoutParams layoutParams;
            int childCount = getChildCount();
            int i6 = (i4 - i2) / 2;
            int dividerWidth = getDividerWidth();
            int i7 = i3 - i;
            int paddingRight = getPaddingRight();
            int paddingLeft = getPaddingLeft();
            boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
            int i8 = (i7 - paddingRight) - paddingLeft;
            paddingLeft = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() == 8) {
                    paddingRight = paddingLeft;
                    i5 = i9;
                } else {
                    layoutParams = (LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.isOverflowButton) {
                        paddingLeft = childAt.getMeasuredWidth();
                        if (hasSupportDividerBeforeChildAt(i10)) {
                            paddingLeft += dividerWidth;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (isLayoutRtl) {
                            paddingRight = layoutParams.leftMargin + getPaddingLeft();
                            i5 = paddingRight + paddingLeft;
                        } else {
                            i5 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                            paddingRight = i5 - paddingLeft;
                        }
                        int i11 = i6 - (measuredHeight / 2);
                        childAt.layout(paddingRight, i11, i5, measuredHeight + i11);
                        paddingRight = 1;
                        i5 = i9;
                        i8 -= paddingLeft;
                    } else {
                        i8 -= layoutParams.rightMargin + (childAt.getMeasuredWidth() + layoutParams.leftMargin);
                        hasSupportDividerBeforeChildAt(i10);
                        i5 = i9 + 1;
                        paddingRight = paddingLeft;
                    }
                }
                i10++;
                paddingLeft = paddingRight;
                i9 = i5;
            }
            if (childCount == 1 && paddingLeft == 0) {
                View childAt2 = getChildAt(0);
                paddingLeft = childAt2.getMeasuredWidth();
                i5 = childAt2.getMeasuredHeight();
                i9 = (i7 / 2) - (paddingLeft / 2);
                i8 = i6 - (i5 / 2);
                childAt2.layout(i9, i8, paddingLeft + i9, i5 + i8);
                return;
            }
            paddingRight = i9 - (paddingLeft ^ 1);
            i5 = 0;
            i8 = Math.max(0, paddingRight > 0 ? i8 / paddingRight : 0);
            View childAt3;
            if (isLayoutRtl) {
                paddingLeft = getWidth() - getPaddingRight();
                i5 = 0;
                while (i5 < childCount) {
                    childAt3 = getChildAt(i5);
                    layoutParams = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() == 8) {
                        paddingRight = paddingLeft;
                    } else if (layoutParams.isOverflowButton) {
                        paddingRight = paddingLeft;
                    } else {
                        paddingLeft -= layoutParams.rightMargin;
                        i10 = childAt3.getMeasuredWidth();
                        dividerWidth = childAt3.getMeasuredHeight();
                        i7 = i6 - (dividerWidth / 2);
                        childAt3.layout(paddingLeft - i10, i7, paddingLeft, dividerWidth + i7);
                        paddingRight = paddingLeft - ((layoutParams.leftMargin + i10) + i8);
                    }
                    i5++;
                    paddingLeft = paddingRight;
                }
                return;
            }
            paddingLeft = getPaddingLeft();
            while (i5 < childCount) {
                childAt3 = getChildAt(i5);
                layoutParams = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8) {
                    paddingRight = paddingLeft;
                } else if (layoutParams.isOverflowButton) {
                    paddingRight = paddingLeft;
                } else {
                    paddingLeft += layoutParams.leftMargin;
                    i10 = childAt3.getMeasuredWidth();
                    dividerWidth = childAt3.getMeasuredHeight();
                    i7 = i6 - (dividerWidth / 2);
                    childAt3.layout(paddingLeft, i7, paddingLeft + i10, dividerWidth + i7);
                    paddingRight = ((layoutParams.rightMargin + i10) + i8) + paddingLeft;
                }
                i5++;
                paddingLeft = paddingRight;
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.mFormatItems;
        this.mFormatItems = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.mFormatItems) {
            this.mFormatItemsWidth = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.mFormatItems || this.mMenu == null || size == this.mFormatItemsWidth)) {
            this.mFormatItemsWidth = size;
            this.mMenu.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.mFormatItems || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        onMeasureExactFormat(i, i2);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.mPresenter.setExpandedActionViewsExclusive(z);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setMenuCallbacks(Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.mPresenter.setOverflowIcon(drawable);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setOverflowReserved(boolean z) {
        this.mReserveOverflow = z;
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        this.mPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        return this.mPresenter != null && this.mPresenter.showOverflowMenu();
    }
}
