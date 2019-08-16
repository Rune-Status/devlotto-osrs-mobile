package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

class TransitionUtils {
    private static final boolean HAS_IS_ATTACHED_TO_WINDOW = (VERSION.SDK_INT >= 19);
    private static final boolean HAS_OVERLAY = (VERSION.SDK_INT >= 18);
    private static final boolean HAS_PICTURE_BITMAP;
    private static final int MAX_IMAGE_SIZE = 1048576;

    static class MatrixEvaluator implements TypeEvaluator<Matrix> {
        final float[] mTempEndValues = new float[9];
        final Matrix mTempMatrix = new Matrix();
        final float[] mTempStartValues = new float[9];

        MatrixEvaluator() {
        }

        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.mTempStartValues);
            matrix2.getValues(this.mTempEndValues);
            for (int i = 0; i < 9; i++) {
                this.mTempEndValues[i] = ((this.mTempEndValues[i] - this.mTempStartValues[i]) * f) + this.mTempStartValues[i];
            }
            this.mTempMatrix.setValues(this.mTempEndValues);
            return this.mTempMatrix;
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 28) {
            z = false;
        }
        HAS_PICTURE_BITMAP = z;
    }

    private TransitionUtils() {
    }

    static View copyViewImage(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        ViewUtils.transformMatrixToGlobal(view, matrix);
        ViewUtils.transformMatrixToLocal(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ScaleType.CENTER_CROP);
        Bitmap createViewBitmap = createViewBitmap(view, matrix, rectF, viewGroup);
        if (createViewBitmap != null) {
            imageView.setImageBitmap(createViewBitmap);
        }
        imageView.measure(MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static Bitmap createViewBitmap(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        int isAttachedToWindow;
        boolean isAttachedToWindow2;
        int i;
        ViewGroup viewGroup2;
        int round;
        int round2;
        float min;
        Bitmap bitmap = null;
        int i2 = 0;
        if (HAS_IS_ATTACHED_TO_WINDOW) {
            isAttachedToWindow = view.isAttachedToWindow() ^ 1;
            if (viewGroup != null) {
                isAttachedToWindow2 = viewGroup.isAttachedToWindow();
                i = isAttachedToWindow;
                if (HAS_OVERLAY || i == 0) {
                    viewGroup2 = null;
                    round = Math.round(rectF.width());
                    round2 = Math.round(rectF.height());
                    if (round > 0 && round2 > 0) {
                        min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
                        round = Math.round(((float) round) * min);
                        round2 = Math.round(((float) round2) * min);
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        matrix.postScale(min, min);
                        Canvas beginRecording;
                        if (HAS_PICTURE_BITMAP) {
                            Picture picture = new Picture();
                            beginRecording = picture.beginRecording(round, round2);
                            beginRecording.concat(matrix);
                            view.draw(beginRecording);
                            picture.endRecording();
                            bitmap = Bitmap.createBitmap(picture);
                        } else {
                            bitmap = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                            beginRecording = new Canvas(bitmap);
                            beginRecording.concat(matrix);
                            view.draw(beginRecording);
                        }
                    }
                    if (HAS_OVERLAY && i != 0) {
                        viewGroup.getOverlay().remove(view);
                        viewGroup2.addView(view, i2);
                    }
                } else if (isAttachedToWindow2) {
                    viewGroup2 = (ViewGroup) view.getParent();
                    i2 = viewGroup2.indexOfChild(view);
                    viewGroup.getOverlay().add(view);
                    round = Math.round(rectF.width());
                    round2 = Math.round(rectF.height());
                    min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
                    round = Math.round(((float) round) * min);
                    round2 = Math.round(((float) round2) * min);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    matrix.postScale(min, min);
                    if (HAS_PICTURE_BITMAP) {
                    }
                    viewGroup.getOverlay().remove(view);
                    viewGroup2.addView(view, i2);
                }
                return bitmap;
            }
        }
        isAttachedToWindow = 0;
        isAttachedToWindow2 = false;
        i = isAttachedToWindow;
        if (HAS_OVERLAY) {
        }
        viewGroup2 = null;
        round = Math.round(rectF.width());
        round2 = Math.round(rectF.height());
        min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        round = Math.round(((float) round) * min);
        round2 = Math.round(((float) round2) * min);
        matrix.postTranslate(-rectF.left, -rectF.top);
        matrix.postScale(min, min);
        if (HAS_PICTURE_BITMAP) {
        }
        viewGroup.getOverlay().remove(view);
        viewGroup2.addView(view, i2);
        return bitmap;
    }

    static Animator mergeAnimators(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }
}
