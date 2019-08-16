package android.support.transition;

import android.graphics.Rect;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;

public class SidePropagation extends VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;
    private int mSide = 80;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARNING: Missing block: B:4:0x0011, code skipped:
            if (r1 != 0) goto L_0x0013;
     */
    /* JADX WARNING: Missing block: B:17:0x0030, code skipped:
            if (r1 != 0) goto L_0x0032;
     */
    /* JADX WARNING: Missing block: B:18:0x0032, code skipped:
            r1 = 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int distance(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 1;
        if (this.mSide == GravityCompat.START) {
            if (ViewCompat.getLayoutDirection(view) != 1) {
                i9 = 0;
            }
        } else if (this.mSide != GravityCompat.END) {
            i9 = this.mSide;
            return i9 == 3 ? i9 != 5 ? i9 != 48 ? i9 != 80 ? 0 : (i2 - i6) + Math.abs(i3 - i) : (i8 - i2) + Math.abs(i3 - i) : (i - i5) + Math.abs(i4 - i2) : (i7 - i) + Math.abs(i4 - i2);
        } else if (ViewCompat.getLayoutDirection(view) != 1) {
            i9 = 0;
        }
        i9 = 5;
        if (i9 == 3) {
        }
    }

    private int getMaxDistance(ViewGroup viewGroup) {
        int i = this.mSide;
        return (i == 3 || i == 5 || i == GravityCompat.START || i == GravityCompat.END) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    public long getStartDelay(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return 0;
        }
        int i;
        int centerX;
        int centerY;
        Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || getViewVisibility(transitionValues) == 0) {
            i = -1;
            transitionValues2 = transitionValues;
        } else {
            i = 1;
        }
        int viewX = getViewX(transitionValues2);
        int viewY = getViewY(transitionValues2);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (epicenter != null) {
            centerX = epicenter.centerX();
            centerY = epicenter.centerY();
        } else {
            centerX = (round + width) / 2;
            centerY = (round2 + height) / 2;
        }
        float distance = ((float) distance(viewGroup, viewX, viewY, centerX, centerY, round, round2, width, height)) / ((float) getMaxDistance(viewGroup));
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return (long) Math.round((((float) (duration * ((long) i))) / this.mPropagationSpeed) * distance);
    }

    public void setPropagationSpeed(float f) {
        if (f != 0.0f) {
            this.mPropagationSpeed = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    public void setSide(int i) {
        this.mSide = i;
    }
}
