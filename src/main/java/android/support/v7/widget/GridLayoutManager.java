package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final Rect mDecorInsets = new Rect();
    boolean mPendingSpanCountChange = false;
    final SparseIntArray mPreLayoutSpanIndexCache = new SparseIntArray();
    final SparseIntArray mPreLayoutSpanSizeCache = new SparseIntArray();
    View[] mSet;
    int mSpanCount = -1;
    SpanSizeLookup mSpanSizeLookup = new DefaultSpanSizeLookup();

    public static abstract class SpanSizeLookup {
        private boolean mCacheSpanIndices = false;
        final SparseIntArray mSpanIndexCache = new SparseIntArray();

        /* Access modifiers changed, original: 0000 */
        public int findReferenceIndexFromCache(int i) {
            int size = this.mSpanIndexCache.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.mSpanIndexCache.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            size = i2 - 1;
            return (size < 0 || size >= this.mSpanIndexCache.size()) ? -1 : this.mSpanIndexCache.keyAt(size);
        }

        /* Access modifiers changed, original: 0000 */
        public int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            i3 = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, i3);
            return i3;
        }

        public int getSpanGroupIndex(int i, int i2) {
            int spanSize = getSpanSize(i);
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                int spanSize2 = getSpanSize(i3);
                int i6 = i5 + spanSize2;
                if (i6 == i2) {
                    i4++;
                    spanSize2 = 0;
                } else if (i6 > i2) {
                    i4++;
                } else {
                    spanSize2 = i6;
                }
                i3++;
                i5 = spanSize2;
            }
            return i5 + spanSize > i2 ? i4 + 1 : i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int getSpanIndex(int i, int i2) {
            int spanSize = getSpanSize(i);
            if (spanSize == i2) {
                return 0;
            }
            int spanSize2;
            int i3;
            if (this.mCacheSpanIndices && this.mSpanIndexCache.size() > 0) {
                int findReferenceIndexFromCache = findReferenceIndexFromCache(i);
                if (findReferenceIndexFromCache >= 0) {
                    spanSize2 = this.mSpanIndexCache.get(findReferenceIndexFromCache) + getSpanSize(findReferenceIndexFromCache);
                    i3 = findReferenceIndexFromCache + 1;
                    while (i3 < i) {
                        findReferenceIndexFromCache = getSpanSize(i3);
                        spanSize2 += findReferenceIndexFromCache;
                        if (spanSize2 == i2) {
                            findReferenceIndexFromCache = 0;
                        } else if (spanSize2 <= i2) {
                            findReferenceIndexFromCache = spanSize2;
                        }
                        i3++;
                        spanSize2 = findReferenceIndexFromCache;
                    }
                    return spanSize + spanSize2 > i2 ? spanSize2 : 0;
                }
            }
            i3 = 0;
            spanSize2 = 0;
            while (i3 < i) {
            }
            if (spanSize + spanSize2 > i2) {
            }
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            this.mCacheSpanIndices = z;
        }
    }

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        public int getSpanIndex(int i, int i2) {
            return i % i2;
        }

        public int getSpanSize(int i) {
            return 1;
        }
    }

    public static class LayoutParams extends android.support.v7.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex = -1;
        int mSpanSize = 0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.support.v7.widget.RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setSpanCount(LayoutManager.getProperties(context, attributeSet, i, i2).spanCount);
    }

    private void assignSpans(Recycler recycler, State state, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        if (z) {
            i3 = 1;
            i4 = 0;
            i5 = 0;
        } else {
            i5 = i - 1;
            i4 = 0;
            i3 = -1;
            i = -1;
        }
        while (i5 != i) {
            View view = this.mSet[i5];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.mSpanSize = getSpanSize(recycler, state, getPosition(view));
            layoutParams.mSpanIndex = i4;
            i4 = layoutParams.mSpanSize + i4;
            i5 += i3;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.mPreLayoutSpanIndexCache.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    private void calculateItemBorders(int i) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i);
    }

    static int[] calculateItemBorders(int[] iArr, int i, int i2) {
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        iArr[0] = 0;
        int i3 = i2 / i;
        int i4 = i2 % i;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i5 <= i) {
            int i8;
            int i9 = i7 + i4;
            if (i9 <= 0 || i - i9 >= i4) {
                i8 = i3;
            } else {
                i8 = i3 + 1;
                i9 -= i;
            }
            i6 += i8;
            iArr[i5] = i6;
            i5++;
            i7 = i9;
        }
        return iArr;
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private void ensureAnchorIsInCorrectSpan(Recycler recycler, State state, AnchorInfo anchorInfo, int i) {
        Object obj = 1;
        if (i != 1) {
            obj = null;
        }
        int spanIndex = getSpanIndex(recycler, state, anchorInfo.mPosition);
        if (obj != null) {
            while (spanIndex > 0 && anchorInfo.mPosition > 0) {
                anchorInfo.mPosition--;
                spanIndex = getSpanIndex(recycler, state, anchorInfo.mPosition);
            }
            return;
        }
        int itemCount = state.getItemCount();
        int i2 = anchorInfo.mPosition;
        int i3 = spanIndex;
        while (i2 < itemCount - 1) {
            int i4 = i2 + 1;
            spanIndex = getSpanIndex(recycler, state, i4);
            if (spanIndex <= i3) {
                break;
            }
            i3 = spanIndex;
            i2 = i4;
        }
        anchorInfo.mPosition = i2;
    }

    private void ensureViewSet() {
        if (this.mSet == null || this.mSet.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private int getSpanGroupIndex(Recycler recycler, State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanGroupIndex(i, this.mSpanCount);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getSpanGroupIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. ");
        stringBuilder.append(i);
        Log.w(TAG, stringBuilder.toString());
        return 0;
    }

    private int getSpanIndex(Recycler recycler, State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i, this.mSpanCount);
        }
        int i2 = this.mPreLayoutSpanIndexCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = recycler.convertPreLayoutPositionToPostLayout(i);
        if (i2 != -1) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i2, this.mSpanCount);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        stringBuilder.append(i);
        Log.w(TAG, stringBuilder.toString());
        return 0;
    }

    private int getSpanSize(Recycler recycler, State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(i);
        }
        int i2 = this.mPreLayoutSpanSizeCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        i2 = recycler.convertPreLayoutPositionToPostLayout(i);
        if (i2 != -1) {
            return this.mSpanSizeLookup.getSpanSize(i2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        stringBuilder.append(i);
        Log.w(TAG, stringBuilder.toString());
        return 1;
    }

    private void guessMeasurement(float f, int i) {
        calculateItemBorders(Math.max(Math.round(((float) this.mSpanCount) * f), i));
    }

    private void measureChild(View view, int i, boolean z) {
        int i2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i3 = ((rect.top + rect.bottom) + layoutParams.topMargin) + layoutParams.bottomMargin;
        int i4 = layoutParams.rightMargin + ((rect.right + rect.left) + layoutParams.leftMargin);
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.mOrientation == 1) {
            spaceForSpanRange = LayoutManager.getChildMeasureSpec(spaceForSpanRange, i, i4, layoutParams.width, false);
            i3 = LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i3, layoutParams.height, true);
            i2 = spaceForSpanRange;
        } else {
            spaceForSpanRange = LayoutManager.getChildMeasureSpec(spaceForSpanRange, i, i3, layoutParams.height, false);
            i2 = LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i4, layoutParams.width, true);
            i3 = spaceForSpanRange;
        }
        measureChildWithDecorationsAndMargin(view, i2, i3, z);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        android.support.v7.widget.RecyclerView.LayoutParams layoutParams = (android.support.v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, layoutParams) : shouldMeasureChild(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    private void updateMeasurements() {
        calculateItemBorders(getOrientation() == 1 ? (getWidth() - getPaddingRight()) - getPaddingLeft() : (getHeight() - getPaddingBottom()) - getPaddingTop());
    }

    public boolean checkLayoutParams(android.support.v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* Access modifiers changed, original: 0000 */
    public void collectPrefetchPositionsForLayoutState(State state, LayoutState layoutState, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = this.mSpanCount;
        for (int i2 = 0; i2 < this.mSpanCount && layoutState.hasMore(state) && i > 0; i2++) {
            int i3 = layoutState.mCurrentPosition;
            layoutPrefetchRegistry.addPosition(i3, Math.max(0, layoutState.mScrollingOffset));
            i -= this.mSpanSizeLookup.getSpanSize(i3);
            layoutState.mCurrentPosition += layoutState.mItemDirection;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public View findReferenceChild(Recycler recycler, State state, int i, int i2, int i3) {
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View view3;
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (getSpanIndex(recycler, state, position) != 0) {
                    view3 = view2;
                } else if (((android.support.v7.widget.RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view3 = childAt;
                    }
                } else if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                    return childAt;
                } else {
                    if (view == null) {
                        view3 = view2;
                        view = childAt;
                    }
                }
                i += i4;
                view2 = view3;
            }
            view3 = view2;
            i += i4;
            view2 = view3;
        }
        return view != null ? view : view2;
    }

    public android.support.v7.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    public android.support.v7.widget.RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public android.support.v7.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getColumnCountForAccessibility(Recycler recycler, State state) {
        return this.mOrientation == 1 ? this.mSpanCount : state.getItemCount() < 1 ? 0 : getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getRowCountForAccessibility(Recycler recycler, State state) {
        return this.mOrientation == 0 ? this.mSpanCount : state.getItemCount() < 1 ? 0 : getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int getSpaceForSpanRange(int i, int i2) {
        return (this.mOrientation == 1 && isLayoutRTL()) ? this.mCachedBorders[this.mSpanCount - i] - this.mCachedBorders[(this.mSpanCount - i) - i2] : this.mCachedBorders[i2 + i] - this.mCachedBorders[i];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    /* Access modifiers changed, original: 0000 */
    public void layoutChunk(Recycler recycler, State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        int i;
        int spanSize;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        Object obj = modeInOther != 1073741824 ? 1 : null;
        int i2 = getChildCount() > 0 ? this.mCachedBorders[this.mSpanCount] : 0;
        if (obj != null) {
            updateMeasurements();
        }
        boolean z = layoutState.mItemDirection == 1;
        int i3 = this.mSpanCount;
        if (!z) {
            i3 = getSpanIndex(recycler, state, layoutState.mCurrentPosition) + getSpanSize(recycler, state, layoutState.mCurrentPosition);
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.mSpanCount && layoutState.hasMore(state) && i3 > 0) {
            i = layoutState.mCurrentPosition;
            spanSize = getSpanSize(recycler, state, i);
            if (spanSize <= this.mSpanCount) {
                i3 -= spanSize;
                if (i3 >= 0) {
                    View next = layoutState.next(recycler);
                    if (next == null) {
                        break;
                    }
                    i4 += spanSize;
                    this.mSet[i5] = next;
                    i5++;
                } else {
                    break;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Item at position ");
            stringBuilder.append(i);
            stringBuilder.append(" requires ");
            stringBuilder.append(spanSize);
            stringBuilder.append(" spans but GridLayoutManager has only ");
            stringBuilder.append(this.mSpanCount);
            stringBuilder.append(" spans.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (i5 == 0) {
            layoutChunkResult.mFinished = true;
            return;
        }
        View view;
        LayoutParams layoutParams;
        int i6;
        int spaceForSpanRange;
        int i7;
        assignSpans(recycler, state, i5, i4, z);
        spanSize = 0;
        i4 = 0;
        float f = 0.0f;
        while (i4 < i5) {
            View view2 = this.mSet[i4];
            if (layoutState.mScrapList == null) {
                if (z) {
                    addView(view2);
                } else {
                    addView(view2, 0);
                }
            } else if (z) {
                addDisappearingView(view2);
            } else {
                addDisappearingView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.mDecorInsets);
            measureChild(view2, modeInOther, false);
            i3 = this.mOrientationHelper.getDecoratedMeasurement(view2);
            if (i3 > spanSize) {
                spanSize = i3;
            }
            float decoratedMeasurementInOther = (((float) this.mOrientationHelper.getDecoratedMeasurementInOther(view2)) * 1.0f) / ((float) ((LayoutParams) view2.getLayoutParams()).mSpanSize);
            if (decoratedMeasurementInOther <= f) {
                decoratedMeasurementInOther = f;
            }
            i4++;
            f = decoratedMeasurementInOther;
        }
        if (obj != null) {
            guessMeasurement(f, i2);
            i = 0;
            spanSize = 0;
            while (spanSize < i5) {
                View view3 = this.mSet[spanSize];
                measureChild(view3, 1073741824, true);
                i3 = this.mOrientationHelper.getDecoratedMeasurement(view3);
                if (i3 <= i) {
                    i3 = i;
                }
                spanSize++;
                i = i3;
            }
        } else {
            i = spanSize;
        }
        for (i4 = 0; i4 < i5; i4++) {
            view = this.mSet[i4];
            if (this.mOrientationHelper.getDecoratedMeasurement(view) != i) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                Rect rect = layoutParams.mDecorInsets;
                i6 = ((rect.top + rect.bottom) + layoutParams.topMargin) + layoutParams.bottomMargin;
                spanSize = ((rect.right + rect.left) + layoutParams.leftMargin) + layoutParams.rightMargin;
                spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
                if (this.mOrientation == 1) {
                    spanSize = LayoutManager.getChildMeasureSpec(spaceForSpanRange, 1073741824, spanSize, layoutParams.width, false);
                    i3 = MeasureSpec.makeMeasureSpec(i - i6, 1073741824);
                } else {
                    spanSize = MeasureSpec.makeMeasureSpec(i - spanSize, 1073741824);
                    i3 = LayoutManager.getChildMeasureSpec(spaceForSpanRange, 1073741824, i6, layoutParams.height, false);
                }
                measureChildWithDecorationsAndMargin(view, spanSize, i3, true);
            }
        }
        layoutChunkResult.mConsumed = i;
        if (this.mOrientation == 1) {
            if (layoutState.mLayoutDirection == -1) {
                i3 = layoutState.mOffset;
                i = i3 - i;
            } else {
                spanSize = layoutState.mOffset;
                i3 = i + spanSize;
                i = spanSize;
            }
            i4 = 0;
            spanSize = 0;
            i7 = 0;
            modeInOther = i3;
            spaceForSpanRange = i;
        } else if (layoutState.mLayoutDirection == -1) {
            spanSize = layoutState.mOffset;
            spaceForSpanRange = 0;
            modeInOther = 0;
            i4 = spanSize - i;
            i7 = 0;
        } else {
            i4 = layoutState.mOffset;
            spanSize = i + i4;
            spaceForSpanRange = 0;
            modeInOther = 0;
            i7 = 0;
        }
        while (i7 < i5) {
            view = this.mSet[i7];
            layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.mOrientation != 1) {
                spaceForSpanRange = getPaddingTop() + this.mCachedBorders[layoutParams.mSpanIndex];
                i = spanSize;
                modeInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(view) + spaceForSpanRange;
                i6 = i4;
                i2 = i;
            } else if (isLayoutRTL()) {
                i2 = getPaddingLeft() + this.mCachedBorders[this.mSpanCount - layoutParams.mSpanIndex];
                i6 = i2 - this.mOrientationHelper.getDecoratedMeasurementInOther(view);
            } else {
                spanSize = this.mCachedBorders[layoutParams.mSpanIndex] + getPaddingLeft();
                i = this.mOrientationHelper.getDecoratedMeasurementInOther(view) + spanSize;
                i4 = spanSize;
                i6 = i4;
                i2 = i;
            }
            layoutDecoratedWithMargins(view, i6, spaceForSpanRange, i2, modeInOther);
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                layoutChunkResult.mIgnoreConsumed = true;
            }
            layoutChunkResult.mFocusable |= view.hasFocusable();
            i7++;
            spanSize = i2;
            i4 = i6;
        }
        Arrays.fill(this.mSet, null);
    }

    /* Access modifiers changed, original: 0000 */
    public void onAnchorReady(Recycler recycler, State state, AnchorInfo anchorInfo, int i) {
        super.onAnchorReady(recycler, state, anchorInfo, i);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            ensureAnchorIsInCorrectSpan(recycler, state, anchorInfo, i);
        }
        ensureViewSet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Missing block: B:62:0x0112, code skipped:
            if (r7 != (r20 > r11 ? 1 : null)) goto L_0x0114;
     */
    /* JADX WARNING: Missing block: B:75:0x0138, code skipped:
            if (r7 == r14) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public View onFocusSearchFailed(View view, int i, Recycler recycler, State state) {
        View findContainingItemView = findContainingItemView(view);
        View view2 = null;
        if (findContainingItemView == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
        int i2 = layoutParams.mSpanIndex;
        int i3 = layoutParams.mSpanIndex + layoutParams.mSpanSize;
        if (super.onFocusSearchFailed(view, i, recycler, state) == null) {
            return null;
        }
        int childCount;
        int i4;
        int i5;
        if (((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout ? 1 : null) != null) {
            childCount = getChildCount() - 1;
            i4 = -1;
            i5 = -1;
        } else {
            i4 = getChildCount();
            childCount = 0;
            i5 = 1;
        }
        Object obj = (this.mOrientation == 1 && isLayoutRTL()) ? 1 : null;
        int spanGroupIndex = getSpanGroupIndex(recycler, state, childCount);
        View view3 = null;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1;
        for (int i10 = childCount; i10 != i4; i10 += i5) {
            int spanGroupIndex2 = getSpanGroupIndex(recycler, state, i10);
            View childAt = getChildAt(i10);
            if (childAt == findContainingItemView) {
                break;
            }
            View view4;
            if (childAt.hasFocusable() && spanGroupIndex2 != spanGroupIndex) {
                if (view2 != null) {
                    break;
                }
                view4 = view2;
            } else {
                layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i11 = layoutParams.mSpanIndex;
                int i12 = layoutParams.mSpanSize + layoutParams.mSpanIndex;
                if (childAt.hasFocusable() && i11 == i2 && i12 == i3) {
                    return childAt;
                }
                Object obj2;
                if (!(childAt.hasFocusable() && view2 == null) && (childAt.hasFocusable() || view3 != null)) {
                    int min = Math.min(i12, i3) - Math.max(i11, i2);
                    if (childAt.hasFocusable()) {
                        if (min <= i7) {
                            if (min == i7) {
                            }
                        }
                    } else if (view2 == null) {
                        obj2 = null;
                        if (isViewPartiallyVisible(childAt, false, true)) {
                            if (min <= i8) {
                                if (min == i8) {
                                    if (i11 > i9) {
                                        obj2 = 1;
                                    }
                                }
                            }
                        }
                    }
                    obj2 = null;
                    if (obj2 != null) {
                        view4 = view2;
                    } else if (childAt.hasFocusable()) {
                        i6 = layoutParams.mSpanIndex;
                        view4 = childAt;
                        i7 = Math.min(i12, i3) - Math.max(i11, i2);
                    } else {
                        i9 = layoutParams.mSpanIndex;
                        i8 = Math.min(i12, i3) - Math.max(i11, i2);
                        view4 = view2;
                        view3 = childAt;
                    }
                }
                obj2 = 1;
                if (obj2 != null) {
                }
            }
            view2 = view4;
        }
        return view2 != null ? view2 : view3;
    }

    public void onInitializeAccessibilityNodeInfoForItem(Recycler recycler, State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            int spanGroupIndex = getSpanGroupIndex(recycler, state, layoutParams2.getViewLayoutPosition());
            if (this.mOrientation == 0) {
                int spanIndex = layoutParams2.getSpanIndex();
                int spanSize = layoutParams2.getSpanSize();
                boolean z = this.mSpanCount > 1 && layoutParams2.getSpanSize() == this.mSpanCount;
                accessibilityNodeInfoCompat.setCollectionItemInfo(CollectionItemInfoCompat.obtain(spanIndex, spanSize, spanGroupIndex, 1, z, false));
                return;
            }
            int spanIndex2 = layoutParams2.getSpanIndex();
            int spanSize2 = layoutParams2.getSpanSize();
            boolean z2 = this.mSpanCount > 1 && layoutParams2.getSpanSize() == this.mSpanCount;
            accessibilityNodeInfoCompat.setCollectionItemInfo(CollectionItemInfoCompat.obtain(spanGroupIndex, 1, spanIndex2, spanSize2, z2, false));
            return;
        }
        super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        if (state.isPreLayout()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recycler, state);
        clearPreLayoutSpanMappingCache();
    }

    public void onLayoutCompleted(State state) {
        super.onLayoutCompleted(state);
        this.mPendingSpanCountChange = false;
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            paddingTop = LayoutManager.chooseSize(i2, paddingTop + rect.height(), getMinimumHeight());
            paddingLeft = LayoutManager.chooseSize(i, paddingLeft + this.mCachedBorders[this.mCachedBorders.length - 1], getMinimumWidth());
        } else {
            paddingLeft = LayoutManager.chooseSize(i, paddingLeft + rect.width(), getMinimumWidth());
            paddingTop = LayoutManager.chooseSize(i2, paddingTop + this.mCachedBorders[this.mCachedBorders.length - 1], getMinimumHeight());
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    public void setSpanCount(int i) {
        if (i != this.mSpanCount) {
            this.mPendingSpanCountChange = true;
            if (i >= 1) {
                this.mSpanCount = i;
                this.mSpanSizeLookup.invalidateSpanIndexCache();
                requestLayout();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Span count should be at least 1. Provided ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }
}
