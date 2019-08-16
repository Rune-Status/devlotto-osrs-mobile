package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeClipBounds extends Transition {
    private static final String PROPNAME_BOUNDS = "android:clipBounds:bounds";
    private static final String PROPNAME_CLIP = "android:clipBounds:clip";
    private static final String[] sTransitionProperties = new String[]{PROPNAME_CLIP};

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getVisibility() != 8) {
            Rect clipBounds = ViewCompat.getClipBounds(view);
            transitionValues.values.put(PROPNAME_CLIP, clipBounds);
            if (clipBounds == null) {
                transitionValues.values.put(PROPNAME_BOUNDS, new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public Animator createAnimator(@NonNull ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !transitionValues.values.containsKey(PROPNAME_CLIP)) {
            return null;
        }
        if (!transitionValues2.values.containsKey(PROPNAME_CLIP)) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get(PROPNAME_CLIP);
        Object obj = (Rect) transitionValues2.values.get(PROPNAME_CLIP);
        int i = obj == null ? 1 : 0;
        if (rect == null && obj == null) {
            return null;
        }
        if (rect == null) {
            rect = (Rect) transitionValues.values.get(PROPNAME_BOUNDS);
        } else if (obj == null) {
            Rect obj2 = (Rect) transitionValues2.values.get(PROPNAME_BOUNDS);
        }
        if (rect.equals(obj2)) {
            return null;
        }
        ViewCompat.setClipBounds(transitionValues2.view, rect);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(transitionValues2.view, ViewUtils.CLIP_BOUNDS, new RectEvaluator(new Rect()), new Rect[]{rect, obj2});
        if (i == 0) {
            return ofObject;
        }
        final View view = transitionValues2.view;
        ofObject.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                ViewCompat.setClipBounds(view, null);
            }
        });
        return ofObject;
    }

    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }
}
