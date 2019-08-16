package android.support.v4.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    };
    private int mActivePointerId = -1;
    private final Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private OverScroller mScroller;
    private final Runnable mSetIdleRunnable = new Runnable() {
        public void run() {
            ViewDragHelper.this.setDragState(0);
        }
    };
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;

    public static abstract class Callback {
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(@NonNull View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, @Px int i3, @Px int i4) {
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i);
    }

    private ViewDragHelper(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (callback != null) {
            this.mParentView = viewGroup;
            this.mCallback = callback;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.mEdgeSize = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
            this.mMaxVelocity = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.mMinVelocity = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.mScroller = new OverScroller(context, sInterpolator);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private boolean checkNewEdgeDrag(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.mInitialEdgesTouched[i] & i2) != i2 || (this.mTrackingEdges & i2) == 0 || (this.mEdgeDragsLocked[i] & i2) == i2 || (this.mEdgeDragsInProgress[i] & i2) == i2) {
            return false;
        }
        if (abs <= ((float) this.mTouchSlop) && abs2 <= ((float) this.mTouchSlop)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.mCallback.onEdgeLock(i2)) {
            return (this.mEdgeDragsInProgress[i] & i2) == 0 && abs > ((float) this.mTouchSlop);
        } else {
            int[] iArr = this.mEdgeDragsLocked;
            iArr[i] = iArr[i] | i2;
            return false;
        }
    }

    private boolean checkTouchSlop(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.mCallback.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.mCallback.getViewVerticalDragRange(view) > 0;
        if (z && z2) {
            if ((f * f) + (f2 * f2) > ((float) (this.mTouchSlop * this.mTouchSlop))) {
                return true;
            }
        } else if (z) {
            if (Math.abs(f) > ((float) this.mTouchSlop)) {
                return true;
            }
        } else if (!z2) {
            return false;
        } else {
            if (Math.abs(f2) > ((float) this.mTouchSlop)) {
                return true;
            }
        }
        return false;
    }

    private float clampMag(float f, float f2, float f3) {
        float abs = Math.abs(f);
        return abs < f2 ? 0.0f : abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    private int clampMag(int i, int i2, int i3) {
        int abs = Math.abs(i);
        return abs < i2 ? 0 : abs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    private void clearMotionHistory() {
        if (this.mInitialMotionX != null) {
            Arrays.fill(this.mInitialMotionX, 0.0f);
            Arrays.fill(this.mInitialMotionY, 0.0f);
            Arrays.fill(this.mLastMotionX, 0.0f);
            Arrays.fill(this.mLastMotionY, 0.0f);
            Arrays.fill(this.mInitialEdgesTouched, 0);
            Arrays.fill(this.mEdgeDragsInProgress, 0);
            Arrays.fill(this.mEdgeDragsLocked, 0);
            this.mPointersDown = 0;
        }
    }

    private void clearMotionHistory(int i) {
        if (this.mInitialMotionX != null && isPointerDown(i)) {
            this.mInitialMotionX[i] = 0.0f;
            this.mInitialMotionY[i] = 0.0f;
            this.mLastMotionX[i] = 0.0f;
            this.mLastMotionY[i] = 0.0f;
            this.mInitialEdgesTouched[i] = 0;
            this.mEdgeDragsInProgress[i] = 0;
            this.mEdgeDragsLocked[i] = 0;
            this.mPointersDown = (1 << i) & this.mPointersDown;
        }
    }

    private int computeAxisDuration(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        float f = (float) (width / 2);
        float distanceInfluenceForSnapDuration = distanceInfluenceForSnapDuration(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)));
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(((distanceInfluenceForSnapDuration * f) + f) / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), MAX_SETTLE_DURATION);
    }

    private int computeSettleDuration(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        int clampMag = clampMag(i3, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int clampMag2 = clampMag(i4, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(clampMag);
        int abs4 = Math.abs(clampMag2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (clampMag != 0) {
            f = (float) abs3;
            f2 = (float) i5;
        } else {
            f = (float) abs;
            f2 = (float) i6;
        }
        float f3 = f / f2;
        if (clampMag2 != 0) {
            f = (float) abs4;
            f2 = (float) i5;
        } else {
            f = (float) abs2;
            f2 = (float) i6;
        }
        f2 = f / f2;
        return (int) ((f2 * ((float) computeAxisDuration(i2, clampMag2, this.mCallback.getViewVerticalDragRange(view)))) + (((float) computeAxisDuration(i, clampMag, this.mCallback.getViewHorizontalDragRange(view))) * f3));
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f, @NonNull Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.mTouchSlop = (int) (((float) create.mTouchSlop) * (1.0f / f));
        return create;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    private void dispatchViewReleased(float f, float f2) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f, f2);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    private void dragTo(int i, int i2, int i3, int i4) {
        int clampViewPositionHorizontal;
        int clampViewPositionVertical;
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        if (i3 != 0) {
            clampViewPositionHorizontal = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i, i3);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, clampViewPositionHorizontal - left);
        } else {
            clampViewPositionHorizontal = i;
        }
        if (i4 != 0) {
            clampViewPositionVertical = this.mCallback.clampViewPositionVertical(this.mCapturedView, i2, i4);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, clampViewPositionVertical - top);
        } else {
            clampViewPositionVertical = i2;
        }
        if (i3 != 0 || i4 != 0) {
            this.mCallback.onViewPositionChanged(this.mCapturedView, clampViewPositionHorizontal, clampViewPositionVertical, clampViewPositionHorizontal - left, clampViewPositionVertical - top);
        }
    }

    private void ensureMotionHistorySizeForId(int i) {
        if (this.mInitialMotionX == null || this.mInitialMotionX.length <= i) {
            int i2 = i + 1;
            float[] fArr = new float[i2];
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (this.mInitialMotionX != null) {
                System.arraycopy(this.mInitialMotionX, 0, fArr, 0, this.mInitialMotionX.length);
                System.arraycopy(this.mInitialMotionY, 0, fArr2, 0, this.mInitialMotionY.length);
                System.arraycopy(this.mLastMotionX, 0, fArr3, 0, this.mLastMotionX.length);
                System.arraycopy(this.mLastMotionY, 0, fArr4, 0, this.mLastMotionY.length);
                System.arraycopy(this.mInitialEdgesTouched, 0, iArr, 0, this.mInitialEdgesTouched.length);
                System.arraycopy(this.mEdgeDragsInProgress, 0, iArr2, 0, this.mEdgeDragsInProgress.length);
                System.arraycopy(this.mEdgeDragsLocked, 0, iArr3, 0, this.mEdgeDragsLocked.length);
            }
            this.mInitialMotionX = fArr;
            this.mInitialMotionY = fArr2;
            this.mLastMotionX = fArr3;
            this.mLastMotionY = fArr4;
            this.mInitialEdgesTouched = iArr;
            this.mEdgeDragsInProgress = iArr2;
            this.mEdgeDragsLocked = iArr3;
        }
    }

    private boolean forceSettleCapturedViewAt(int i, int i2, int i3, int i4) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top, i5, i6, computeSettleDuration(this.mCapturedView, i5, i6, i3, i4));
        setDragState(2);
        return true;
    }

    private int getEdgesTouched(int i, int i2) {
        int i3 = i < this.mParentView.getLeft() + this.mEdgeSize ? 1 : 0;
        if (i2 < this.mParentView.getTop() + this.mEdgeSize) {
            i3 |= 4;
        }
        if (i > this.mParentView.getRight() - this.mEdgeSize) {
            i3 |= 2;
        }
        return i2 > this.mParentView.getBottom() - this.mEdgeSize ? i3 | 8 : i3;
    }

    private boolean isValidPointerForActionMove(int i) {
        if (isPointerDown(i)) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring pointerId=");
        stringBuilder.append(i);
        stringBuilder.append(" because ACTION_DOWN was not received ");
        stringBuilder.append("for this pointer before ACTION_MOVE. It likely happened because ");
        stringBuilder.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e(TAG, stringBuilder.toString());
        return false;
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    private void reportNewEdgeDrags(float f, float f2, int i) {
        int i2 = 1;
        if (!checkNewEdgeDrag(f, f2, i, 1)) {
            i2 = 0;
        }
        if (checkNewEdgeDrag(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (checkNewEdgeDrag(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (checkNewEdgeDrag(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i] = iArr[i] | i2;
            this.mCallback.onEdgeDragStarted(i2, i);
        }
    }

    private void saveInitialMotion(float f, float f2, int i) {
        ensureMotionHistorySizeForId(i);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i] = f;
        fArr[i] = f;
        fArr = this.mInitialMotionY;
        this.mLastMotionY[i] = f2;
        fArr[i] = f2;
        this.mInitialEdgesTouched[i] = getEdgesTouched((int) f, (int) f2);
        this.mPointersDown |= 1 << i;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (isValidPointerForActionMove(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.mLastMotionX[pointerId] = x;
                this.mLastMotionY[pointerId] = y;
            }
        }
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    /* Access modifiers changed, original: protected */
    public boolean canScroll(@NonNull View view, boolean z, int i, int i2, int i3, int i4) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight()) {
                    int i6 = i4 + scrollY;
                    if (i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                        if (canScroll(childAt, true, i, i2, i5 - childAt.getLeft(), i6 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (z) {
            if (view.canScrollHorizontally(-i)) {
                return true;
            }
            if (view.canScrollVertically(-i2)) {
                return true;
            }
        }
        return false;
    }

    public void cancel() {
        this.mActivePointerId = -1;
        clearMotionHistory();
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void captureChildView(@NonNull View view, int i) {
        if (view.getParent() == this.mParentView) {
            this.mCapturedView = view;
            this.mActivePointerId = i;
            this.mCallback.onViewCaptured(view, i);
            setDragState(1);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        stringBuilder.append(this.mParentView);
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public boolean checkTouchSlop(int i) {
        int length = this.mInitialMotionX.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (checkTouchSlop(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i, int i2) {
        if (!isPointerDown(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.mLastMotionX[i2] - this.mInitialMotionX[i2];
        float f2 = this.mLastMotionY[i2] - this.mInitialMotionY[i2];
        if (z && z2) {
            if ((f * f) + (f2 * f2) > ((float) (this.mTouchSlop * this.mTouchSlop))) {
                return true;
            }
        } else if (z) {
            if (Math.abs(f) > ((float) this.mTouchSlop)) {
                return true;
            }
        } else if (!z2) {
            return false;
        } else {
            if (Math.abs(f2) > ((float) this.mTouchSlop)) {
                return true;
            }
        }
        return false;
    }

    public boolean continueSettling(boolean z) {
        if (this.mDragState == 2) {
            int i;
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top = currY - this.mCapturedView.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.mCapturedView, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.mCapturedView, top);
            }
            if (!(left == 0 && top == 0)) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY()) {
                this.mScroller.abortAnimation();
                i = 0;
            } else {
                boolean i2 = computeScrollOffset;
            }
            if (i2 == 0) {
                if (z) {
                    this.mParentView.post(this.mSetIdleRunnable);
                } else {
                    setDragState(0);
                }
            }
        }
        return this.mDragState == 2;
    }

    @Nullable
    public View findTopChildUnder(int i, int i2) {
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i, int i2, int i3, int i4) {
        if (this.mReleaseInProgress) {
            this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId), i, i3, i2, i4);
            setDragState(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    public int getActivePointerId() {
        return this.mActivePointerId;
    }

    @Nullable
    public View getCapturedView() {
        return this.mCapturedView;
    }

    @Px
    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    public float getMinVelocity() {
        return this.mMinVelocity;
    }

    @Px
    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    public boolean isCapturedViewUnder(int i, int i2) {
        return isViewUnder(this.mCapturedView, i, i2);
    }

    public boolean isEdgeTouched(int i) {
        int length = this.mInitialEdgesTouched.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (isEdgeTouched(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEdgeTouched(int i, int i2) {
        return isPointerDown(i2) && (this.mInitialEdgesTouched[i2] & i) != 0;
    }

    public boolean isPointerDown(int i) {
        return ((1 << i) & this.mPointersDown) != 0;
    }

    public boolean isViewUnder(@Nullable View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int i = 0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        float x;
        float y;
        View findTopChildUnder;
        int i2;
        switch (actionMasked) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                i = motionEvent.getPointerId(0);
                findTopChildUnder = findTopChildUnder((int) x, (int) y);
                saveInitialMotion(x, y, i);
                tryCaptureViewForDrag(findTopChildUnder, i);
                i2 = this.mInitialEdgesTouched[i];
                if ((this.mTrackingEdges & i2) != 0) {
                    this.mCallback.onEdgeTouched(i2 & this.mTrackingEdges, i);
                    return;
                }
                return;
            case 1:
                if (this.mDragState == 1) {
                    releaseViewForPointerUp();
                }
                cancel();
                return;
            case 2:
                if (this.mDragState != 1) {
                    i2 = motionEvent.getPointerCount();
                    while (i < i2) {
                        actionMasked = motionEvent.getPointerId(i);
                        if (isValidPointerForActionMove(actionMasked)) {
                            float x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.mInitialMotionX[actionMasked];
                            float f2 = y2 - this.mInitialMotionY[actionMasked];
                            reportNewEdgeDrags(f, f2, actionMasked);
                            if (this.mDragState != 1) {
                                findTopChildUnder = findTopChildUnder((int) x2, (int) y2);
                                if (checkTouchSlop(findTopChildUnder, f, f2) && tryCaptureViewForDrag(findTopChildUnder, actionMasked)) {
                                }
                            }
                            saveLastMotion(motionEvent);
                            return;
                        }
                        i++;
                    }
                    saveLastMotion(motionEvent);
                    return;
                } else if (isValidPointerForActionMove(this.mActivePointerId)) {
                    i = motionEvent.findPointerIndex(this.mActivePointerId);
                    x = motionEvent.getX(i);
                    i2 = (int) (x - this.mLastMotionX[this.mActivePointerId]);
                    i = (int) (motionEvent.getY(i) - this.mLastMotionY[this.mActivePointerId]);
                    dragTo(this.mCapturedView.getLeft() + i2, this.mCapturedView.getTop() + i, i2, i);
                    saveLastMotion(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.mDragState == 1) {
                    dispatchViewReleased(0.0f, 0.0f);
                }
                cancel();
                return;
            case 5:
                i = motionEvent.getPointerId(actionIndex);
                x = motionEvent.getX(actionIndex);
                y = motionEvent.getY(actionIndex);
                saveInitialMotion(x, y, i);
                if (this.mDragState == 0) {
                    tryCaptureViewForDrag(findTopChildUnder((int) x, (int) y), i);
                    i2 = this.mInitialEdgesTouched[i];
                    if ((this.mTrackingEdges & i2) != 0) {
                        this.mCallback.onEdgeTouched(i2 & this.mTrackingEdges, i);
                        return;
                    }
                    return;
                } else if (isCapturedViewUnder((int) x, (int) y)) {
                    tryCaptureViewForDrag(this.mCapturedView, i);
                    return;
                } else {
                    return;
                }
            case 6:
                actionMasked = motionEvent.getPointerId(actionIndex);
                if (this.mDragState == 1 && actionMasked == this.mActivePointerId) {
                    actionIndex = motionEvent.getPointerCount();
                    while (i < actionIndex) {
                        int pointerId = motionEvent.getPointerId(i);
                        if (pointerId != this.mActivePointerId) {
                            if (findTopChildUnder((int) motionEvent.getX(i), (int) motionEvent.getY(i)) == this.mCapturedView && tryCaptureViewForDrag(this.mCapturedView, pointerId)) {
                                i = this.mActivePointerId;
                                if (i == -1) {
                                    releaseViewForPointerUp();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                    }
                }
                clearMotionHistory(actionMasked);
                return;
            default:
                return;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setDragState(int i) {
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != i) {
            this.mDragState = i;
            this.mCallback.onViewDragStateChanged(i);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    public void setEdgeTrackingEnabled(int i) {
        this.mTrackingEdges = i;
    }

    public void setMinVelocity(float f) {
        this.mMinVelocity = f;
    }

    public boolean settleCapturedViewAt(int i, int i2) {
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i, i2, (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Missing block: B:40:0x00d4, code skipped:
            if (r8 != r7) goto L_0x00e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        float x;
        float y;
        int pointerId;
        switch (actionMasked) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                pointerId = motionEvent.getPointerId(0);
                saveInitialMotion(x, y, pointerId);
                View findTopChildUnder = findTopChildUnder((int) x, (int) y);
                if (findTopChildUnder == this.mCapturedView && this.mDragState == 2) {
                    tryCaptureViewForDrag(findTopChildUnder, pointerId);
                }
                actionMasked = this.mInitialEdgesTouched[pointerId];
                if ((this.mTrackingEdges & actionMasked) != 0) {
                    this.mCallback.onEdgeTouched(actionMasked & this.mTrackingEdges, pointerId);
                    break;
                }
                break;
            case 1:
            case 3:
                cancel();
                break;
            case 2:
                if (!(this.mInitialMotionX == null || this.mInitialMotionY == null)) {
                    pointerId = motionEvent.getPointerCount();
                    for (actionIndex = 0; actionIndex < pointerId; actionIndex++) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        if (isValidPointerForActionMove(pointerId2)) {
                            x = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            float f = x - this.mInitialMotionX[pointerId2];
                            float f2 = y2 - this.mInitialMotionY[pointerId2];
                            View findTopChildUnder2 = findTopChildUnder((int) x, (int) y2);
                            Object obj = (findTopChildUnder2 == null || !checkTouchSlop(findTopChildUnder2, f, f2)) ? null : 1;
                            if (obj != null) {
                                int left = findTopChildUnder2.getLeft();
                                int i = (int) f;
                                i = this.mCallback.clampViewPositionHorizontal(findTopChildUnder2, left + i, i);
                                int top = findTopChildUnder2.getTop();
                                int i2 = (int) f2;
                                i2 = this.mCallback.clampViewPositionVertical(findTopChildUnder2, top + i2, i2);
                                int viewHorizontalDragRange = this.mCallback.getViewHorizontalDragRange(findTopChildUnder2);
                                int viewVerticalDragRange = this.mCallback.getViewVerticalDragRange(findTopChildUnder2);
                                if (viewHorizontalDragRange != 0) {
                                    if (viewHorizontalDragRange > 0) {
                                    }
                                }
                                if (viewVerticalDragRange != 0) {
                                    if (viewVerticalDragRange > 0 && i2 == top) {
                                    }
                                }
                                saveLastMotion(motionEvent);
                                break;
                            }
                            reportNewEdgeDrags(f, f2, pointerId2);
                            if (this.mDragState != 1) {
                                if (obj != null && tryCaptureViewForDrag(findTopChildUnder2, pointerId2)) {
                                }
                            }
                            saveLastMotion(motionEvent);
                        }
                    }
                    saveLastMotion(motionEvent);
                }
                break;
            case 5:
                actionMasked = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                y = motionEvent.getY(actionIndex);
                saveInitialMotion(x2, y, actionMasked);
                if (this.mDragState != 0) {
                    if (this.mDragState == 2) {
                        View findTopChildUnder3 = findTopChildUnder((int) x2, (int) y);
                        if (findTopChildUnder3 == this.mCapturedView) {
                            tryCaptureViewForDrag(findTopChildUnder3, actionMasked);
                            break;
                        }
                    }
                }
                actionIndex = this.mInitialEdgesTouched[actionMasked];
                if ((this.mTrackingEdges & actionIndex) != 0) {
                    this.mCallback.onEdgeTouched(actionIndex & this.mTrackingEdges, actionMasked);
                    break;
                }
                break;
            case 6:
                clearMotionHistory(motionEvent.getPointerId(actionIndex));
                break;
        }
        return this.mDragState == 1;
    }

    public boolean smoothSlideViewTo(@NonNull View view, int i, int i2) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean forceSettleCapturedViewAt = forceSettleCapturedViewAt(i, i2, 0, 0);
        if (!(forceSettleCapturedViewAt || this.mDragState != 0 || this.mCapturedView == null)) {
            this.mCapturedView = null;
        }
        return forceSettleCapturedViewAt;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean tryCaptureViewForDrag(View view, int i) {
        if (view == this.mCapturedView && this.mActivePointerId == i) {
            return true;
        }
        if (view == null || !this.mCallback.tryCaptureView(view, i)) {
            return false;
        }
        this.mActivePointerId = i;
        captureChildView(view, i);
        return true;
    }
}
