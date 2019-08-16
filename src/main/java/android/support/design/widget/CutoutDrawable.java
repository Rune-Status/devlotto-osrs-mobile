package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.view.View;

class CutoutDrawable extends GradientDrawable {
    private final RectF cutoutBounds;
    private final Paint cutoutPaint = new Paint(1);
    private int savedLayer;

    CutoutDrawable() {
        setPaintStyles();
        this.cutoutBounds = new RectF();
    }

    private void postDraw(@NonNull Canvas canvas) {
        if (!useHardwareLayer(getCallback())) {
            canvas.restoreToCount(this.savedLayer);
        }
    }

    private void preDraw(@NonNull Canvas canvas) {
        Callback callback = getCallback();
        if (useHardwareLayer(callback)) {
            ((View) callback).setLayerType(2, null);
        } else {
            saveCanvasLayer(canvas);
        }
    }

    private void saveCanvasLayer(@NonNull Canvas canvas) {
        if (VERSION.SDK_INT >= 21) {
            this.savedLayer = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
            return;
        }
        this.savedLayer = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
    }

    private void setPaintStyles() {
        this.cutoutPaint.setStyle(Style.FILL_AND_STROKE);
        this.cutoutPaint.setColor(-1);
        this.cutoutPaint.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
    }

    private boolean useHardwareLayer(Callback callback) {
        return callback instanceof View;
    }

    public void draw(@NonNull Canvas canvas) {
        preDraw(canvas);
        super.draw(canvas);
        canvas.drawRect(this.cutoutBounds, this.cutoutPaint);
        postDraw(canvas);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasCutout() {
        return this.cutoutBounds.isEmpty() ^ 1;
    }

    /* Access modifiers changed, original: 0000 */
    public void removeCutout() {
        setCutout(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* Access modifiers changed, original: 0000 */
    public void setCutout(float f, float f2, float f3, float f4) {
        if (f != this.cutoutBounds.left || f2 != this.cutoutBounds.top || f3 != this.cutoutBounds.right || f4 != this.cutoutBounds.bottom) {
            this.cutoutBounds.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setCutout(RectF rectF) {
        setCutout(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
