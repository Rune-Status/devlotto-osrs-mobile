package android.support.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.transition.Transition.EpicenterCallback;
import android.support.transition.Transition.TransitionListener;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {
    private static final int FLAG_CHANGE_EPICENTER = 8;
    private static final int FLAG_CHANGE_INTERPOLATOR = 1;
    private static final int FLAG_CHANGE_PATH_MOTION = 4;
    private static final int FLAG_CHANGE_PROPAGATION = 2;
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;
    private int mChangeFlags = 0;
    int mCurrentListeners;
    private boolean mPlayTogether = true;
    boolean mStarted = false;
    private ArrayList<Transition> mTransitions = new ArrayList();

    static class TransitionSetListener extends TransitionListenerAdapter {
        TransitionSet mTransitionSet;

        TransitionSetListener(TransitionSet transitionSet) {
            this.mTransitionSet = transitionSet;
        }

        public void onTransitionEnd(@NonNull Transition transition) {
            TransitionSet transitionSet = this.mTransitionSet;
            transitionSet.mCurrentListeners--;
            if (this.mTransitionSet.mCurrentListeners == 0) {
                this.mTransitionSet.mStarted = false;
                this.mTransitionSet.end();
            }
            transition.removeListener(this);
        }

        public void onTransitionStart(@NonNull Transition transition) {
            if (!this.mTransitionSet.mStarted) {
                this.mTransitionSet.start();
                this.mTransitionSet.mStarted = true;
            }
        }
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.TRANSITION_SET);
        setOrdering(TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    private void setupStartEndListeners() {
        TransitionSetListener transitionSetListener = new TransitionSetListener(this);
        Iterator it = this.mTransitions.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).addListener(transitionSetListener);
        }
        this.mCurrentListeners = this.mTransitions.size();
    }

    @NonNull
    public TransitionSet addListener(@NonNull TransitionListener transitionListener) {
        return (TransitionSet) super.addListener(transitionListener);
    }

    @NonNull
    public TransitionSet addTarget(@IdRes int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.mTransitions.size()) {
                return (TransitionSet) super.addTarget(i);
            }
            ((Transition) this.mTransitions.get(i3)).addTarget(i);
            i2 = i3 + 1;
        }
    }

    @NonNull
    public TransitionSet addTarget(@NonNull View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.mTransitions.size()) {
                return (TransitionSet) super.addTarget(view);
            }
            ((Transition) this.mTransitions.get(i2)).addTarget(view);
            i = i2 + 1;
        }
    }

    @NonNull
    public TransitionSet addTarget(@NonNull Class cls) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.mTransitions.size()) {
                return (TransitionSet) super.addTarget(cls);
            }
            ((Transition) this.mTransitions.get(i2)).addTarget(cls);
            i = i2 + 1;
        }
    }

    @NonNull
    public TransitionSet addTarget(@NonNull String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.mTransitions.size()) {
                return (TransitionSet) super.addTarget(str);
            }
            ((Transition) this.mTransitions.get(i2)).addTarget(str);
            i = i2 + 1;
        }
    }

    @NonNull
    public TransitionSet addTransition(@NonNull Transition transition) {
        this.mTransitions.add(transition);
        transition.mParent = this;
        if (this.mDuration >= 0) {
            transition.setDuration(this.mDuration);
        }
        if ((this.mChangeFlags & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.mChangeFlags & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.mChangeFlags & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.mChangeFlags & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    /* Access modifiers changed, original: protected */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void cancel() {
        super.cancel();
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).cancel();
        }
    }

    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            Iterator it = this.mTransitions.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.isValidTarget(transitionValues.view)) {
                    transition.captureEndValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(transition);
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void capturePropagationValues(TransitionValues transitionValues) {
        super.capturePropagationValues(transitionValues);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).capturePropagationValues(transitionValues);
        }
    }

    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            Iterator it = this.mTransitions.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.isValidTarget(transitionValues.view)) {
                    transition.captureStartValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(transition);
                }
            }
        }
    }

    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.mTransitions = new ArrayList();
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            transitionSet.addTransition(((Transition) this.mTransitions.get(i)).clone());
        }
        return transitionSet;
    }

    /* Access modifiers changed, original: protected */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void createAnimators(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.mTransitions.size();
        int i = 0;
        while (i < size) {
            Transition transition = (Transition) this.mTransitions.get(i);
            if (startDelay > 0 && (this.mPlayTogether || i == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
            i++;
        }
    }

    @NonNull
    public Transition excludeTarget(int i, boolean z) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.mTransitions.size()) {
                return super.excludeTarget(i, z);
            }
            ((Transition) this.mTransitions.get(i3)).excludeTarget(i, z);
            i2 = i3 + 1;
        }
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.mTransitions.size()) {
                return super.excludeTarget(view, z);
            }
            ((Transition) this.mTransitions.get(i2)).excludeTarget(view, z);
            i = i2 + 1;
        }
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class cls, boolean z) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.mTransitions.size()) {
                return super.excludeTarget(cls, z);
            }
            ((Transition) this.mTransitions.get(i2)).excludeTarget(cls, z);
            i = i2 + 1;
        }
    }

    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.mTransitions.size()) {
                return super.excludeTarget(str, z);
            }
            ((Transition) this.mTransitions.get(i2)).excludeTarget(str, z);
            i = i2 + 1;
        }
    }

    /* Access modifiers changed, original: 0000 */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).forceToEnd(viewGroup);
        }
    }

    public int getOrdering() {
        return this.mPlayTogether ^ 1;
    }

    public Transition getTransitionAt(int i) {
        return (i < 0 || i >= this.mTransitions.size()) ? null : (Transition) this.mTransitions.get(i);
    }

    public int getTransitionCount() {
        return this.mTransitions.size();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void pause(View view) {
        super.pause(view);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).pause(view);
        }
    }

    @NonNull
    public TransitionSet removeListener(@NonNull TransitionListener transitionListener) {
        return (TransitionSet) super.removeListener(transitionListener);
    }

    @NonNull
    public TransitionSet removeTarget(@IdRes int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.mTransitions.size()) {
                return (TransitionSet) super.removeTarget(i);
            }
            ((Transition) this.mTransitions.get(i3)).removeTarget(i);
            i2 = i3 + 1;
        }
    }

    @NonNull
    public TransitionSet removeTarget(@NonNull View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.mTransitions.size()) {
                return (TransitionSet) super.removeTarget(view);
            }
            ((Transition) this.mTransitions.get(i2)).removeTarget(view);
            i = i2 + 1;
        }
    }

    @NonNull
    public TransitionSet removeTarget(@NonNull Class cls) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.mTransitions.size()) {
                return (TransitionSet) super.removeTarget(cls);
            }
            ((Transition) this.mTransitions.get(i2)).removeTarget(cls);
            i = i2 + 1;
        }
    }

    @NonNull
    public TransitionSet removeTarget(@NonNull String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.mTransitions.size()) {
                return (TransitionSet) super.removeTarget(str);
            }
            ((Transition) this.mTransitions.get(i2)).removeTarget(str);
            i = i2 + 1;
        }
    }

    @NonNull
    public TransitionSet removeTransition(@NonNull Transition transition) {
        this.mTransitions.remove(transition);
        transition.mParent = null;
        return this;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void resume(View view) {
        super.resume(view);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).resume(view);
        }
    }

    /* Access modifiers changed, original: protected */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void runAnimators() {
        if (this.mTransitions.isEmpty()) {
            start();
            end();
            return;
        }
        setupStartEndListeners();
        if (this.mPlayTogether) {
            Iterator it = this.mTransitions.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).runAnimators();
            }
            return;
        }
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= this.mTransitions.size()) {
                break;
            }
            final Transition transition = (Transition) this.mTransitions.get(i2);
            ((Transition) this.mTransitions.get(i2 - 1)).addListener(new TransitionListenerAdapter() {
                public void onTransitionEnd(@NonNull Transition transition) {
                    transition.runAnimators();
                    transition.removeListener(this);
                }
            });
            i = i2 + 1;
        }
        Transition transition2 = (Transition) this.mTransitions.get(0);
        if (transition2 != null) {
            transition2.runAnimators();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).setCanRemoveViews(z);
        }
    }

    @NonNull
    public TransitionSet setDuration(long j) {
        super.setDuration(j);
        if (this.mDuration >= 0) {
            int size = this.mTransitions.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.mTransitions.get(i)).setDuration(j);
            }
        }
        return this;
    }

    public void setEpicenterCallback(EpicenterCallback epicenterCallback) {
        super.setEpicenterCallback(epicenterCallback);
        this.mChangeFlags |= 8;
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).setEpicenterCallback(epicenterCallback);
        }
    }

    @NonNull
    public TransitionSet setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mChangeFlags |= 1;
        if (this.mTransitions != null) {
            int size = this.mTransitions.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.mTransitions.get(i)).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @NonNull
    public TransitionSet setOrdering(int i) {
        switch (i) {
            case 0:
                this.mPlayTogether = true;
                break;
            case 1:
                this.mPlayTogether = false;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid parameter for TransitionSet ordering: ");
                stringBuilder.append(i);
                throw new AndroidRuntimeException(stringBuilder.toString());
        }
        return this;
    }

    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.mChangeFlags |= 4;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.mTransitions.size()) {
                ((Transition) this.mTransitions.get(i2)).setPathMotion(pathMotion);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public void setPropagation(TransitionPropagation transitionPropagation) {
        super.setPropagation(transitionPropagation);
        this.mChangeFlags |= 2;
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).setPropagation(transitionPropagation);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public TransitionSet setSceneRoot(ViewGroup viewGroup) {
        super.setSceneRoot(viewGroup);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).setSceneRoot(viewGroup);
        }
        return this;
    }

    @NonNull
    public TransitionSet setStartDelay(long j) {
        return (TransitionSet) super.setStartDelay(j);
    }

    /* Access modifiers changed, original: 0000 */
    public String toString(String str) {
        String transition = super.toString(str);
        for (int i = 0; i < this.mTransitions.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(transition);
            stringBuilder.append("\n");
            Transition transition2 = (Transition) this.mTransitions.get(i);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("  ");
            stringBuilder.append(transition2.toString(stringBuilder2.toString()));
            transition = stringBuilder.toString();
        }
        return transition;
    }
}
