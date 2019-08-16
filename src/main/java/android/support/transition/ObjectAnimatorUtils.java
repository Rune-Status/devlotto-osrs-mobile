package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

class ObjectAnimatorUtils {
    private ObjectAnimatorUtils() {
    }

    static <T> ObjectAnimator ofPointF(T t, Property<T, PointF> property, Path path) {
        return VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, null, path) : ObjectAnimator.ofFloat(t, new PathProperty(property, path), new float[]{0.0f, 1.0f});
    }
}
