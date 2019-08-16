package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.design.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.graphics.drawable.DrawableWrapper;

public class ShadowDrawableWrapper extends DrawableWrapper {
    static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    static final float SHADOW_BOTTOM_SCALE = 1.0f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners = true;
    final RectF contentBounds;
    float cornerRadius;
    final Paint cornerShadowPaint;
    Path cornerShadowPath;
    private boolean dirty = true;
    final Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning = false;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.shadowStartColor = ContextCompat.getColor(context, R.color.design_fab_shadow_start_color);
        this.shadowMiddleColor = ContextCompat.getColor(context, R.color.design_fab_shadow_mid_color);
        this.shadowEndColor = ContextCompat.getColor(context, R.color.design_fab_shadow_end_color);
        this.cornerShadowPaint = new Paint(5);
        this.cornerShadowPaint.setStyle(Style.FILL);
        this.cornerRadius = (float) Math.round(f);
        this.contentBounds = new RectF();
        this.edgeShadowPaint = new Paint(this.cornerShadowPaint);
        this.edgeShadowPaint.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    private void buildComponents(Rect rect) {
        float f = this.rawMaxShadowSize * SHADOW_MULTIPLIER;
        this.contentBounds.set(((float) rect.left) + this.rawMaxShadowSize, ((float) rect.top) + f, ((float) rect.right) - this.rawMaxShadowSize, ((float) rect.bottom) - f);
        getWrappedDrawable().setBounds((int) this.contentBounds.left, (int) this.contentBounds.top, (int) this.contentBounds.right, (int) this.contentBounds.bottom);
        buildShadowCorners();
    }

    private void buildShadowCorners() {
        RectF rectF = new RectF(-this.cornerRadius, -this.cornerRadius, this.cornerRadius, this.cornerRadius);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.shadowSize, -this.shadowSize);
        if (this.cornerShadowPath == null) {
            this.cornerShadowPath = new Path();
        } else {
            this.cornerShadowPath.reset();
        }
        this.cornerShadowPath.setFillType(FillType.EVEN_ODD);
        this.cornerShadowPath.moveTo(-this.cornerRadius, 0.0f);
        this.cornerShadowPath.rLineTo(-this.shadowSize, 0.0f);
        this.cornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.cornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.cornerShadowPath.close();
        float f = -rectF2.top;
        if (f > 0.0f) {
            float f2 = (SHADOW_BOTTOM_SCALE - (this.cornerRadius / f)) / 2.0f;
            Paint paint = this.cornerShadowPaint;
            int i = this.shadowStartColor;
            int i2 = this.shadowMiddleColor;
            int i3 = this.shadowEndColor;
            int[] iArr = new int[]{0, i, i2, i3};
            float[] fArr = new float[]{0.0f, r10, r10 + f2, SHADOW_BOTTOM_SCALE};
            paint.setShader(new RadialGradient(0.0f, 0.0f, f, iArr, fArr, TileMode.CLAMP));
        }
        Paint paint2 = this.edgeShadowPaint;
        float f3 = rectF.top;
        float f4 = rectF2.top;
        int i4 = this.shadowStartColor;
        int i5 = this.shadowMiddleColor;
        int i6 = this.shadowEndColor;
        int[] iArr2 = new int[]{i4, i5, i6};
        paint2.setShader(new LinearGradient(0.0f, f3, 0.0f, f4, iArr2, new float[]{0.0f, SHADOW_HORIZ_SCALE, SHADOW_BOTTOM_SCALE}, TileMode.CLAMP));
        this.edgeShadowPaint.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - COS_45) * ((double) f2))) : f;
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        return z ? (float) (((double) (SHADOW_MULTIPLIER * f)) + ((1.0d - COS_45) * ((double) f2))) : SHADOW_MULTIPLIER * f;
    }

    private void drawShadow(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(this.rotation, this.contentBounds.centerX(), this.contentBounds.centerY());
        float f = (-this.cornerRadius) - this.shadowSize;
        float f2 = this.cornerRadius;
        float f3 = f2 * 2.0f;
        Object obj = this.contentBounds.width() - f3 > 0.0f ? 1 : null;
        Object obj2 = this.contentBounds.height() - f3 > 0.0f ? 1 : null;
        float f4 = f2 / ((this.rawShadowSize - (this.rawShadowSize * SHADOW_HORIZ_SCALE)) + f2);
        float f5 = f2 / ((this.rawShadowSize - (this.rawShadowSize * SHADOW_TOP_SCALE)) + f2);
        float f6 = f2 / ((this.rawShadowSize - (SHADOW_BOTTOM_SCALE * this.rawShadowSize)) + f2);
        int save2 = canvas.save();
        canvas.translate(this.contentBounds.left + f2, this.contentBounds.top + f2);
        canvas.scale(f4, f5);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (obj != null) {
            canvas.scale(SHADOW_BOTTOM_SCALE / f4, SHADOW_BOTTOM_SCALE);
            canvas.drawRect(0.0f, f, this.contentBounds.width() - f3, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save2);
        save2 = canvas.save();
        canvas.translate(this.contentBounds.right - f2, this.contentBounds.bottom - f2);
        canvas.scale(f4, f6);
        canvas.rotate(180.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (obj != null) {
            canvas.scale(SHADOW_BOTTOM_SCALE / f4, SHADOW_BOTTOM_SCALE);
            canvas.drawRect(0.0f, f, this.contentBounds.width() - f3, this.shadowSize + (-this.cornerRadius), this.edgeShadowPaint);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.contentBounds.left + f2, this.contentBounds.bottom - f2);
        canvas.scale(f4, f6);
        canvas.rotate(270.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (obj2 != null) {
            canvas.scale(SHADOW_BOTTOM_SCALE / f6, SHADOW_BOTTOM_SCALE);
            canvas.drawRect(0.0f, f, this.contentBounds.height() - f3, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save3);
        save3 = canvas.save();
        canvas.translate(this.contentBounds.right - f2, this.contentBounds.top + f2);
        canvas.scale(f4, f5);
        canvas.rotate(90.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (obj2 != null) {
            canvas.scale(SHADOW_BOTTOM_SCALE / f5, SHADOW_BOTTOM_SCALE);
            canvas.drawRect(0.0f, f, this.contentBounds.height() - f3, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save3);
        canvas.restoreToCount(save);
    }

    private static int toEven(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    public void draw(Canvas canvas) {
        if (this.dirty) {
            buildComponents(getBounds());
            this.dirty = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getMinHeight() {
        return (Math.max(this.rawMaxShadowSize, this.cornerRadius + ((this.rawMaxShadowSize * SHADOW_MULTIPLIER) / 2.0f)) * 2.0f) + ((this.rawMaxShadowSize * SHADOW_MULTIPLIER) * 2.0f);
    }

    public float getMinWidth() {
        return (Math.max(this.rawMaxShadowSize, this.cornerRadius + (this.rawMaxShadowSize / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * 2.0f);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) calculateVerticalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        int ceil2 = (int) Math.ceil((double) calculateHorizontalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        this.dirty = true;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.addPaddingForCorners = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.cornerShadowPaint.setAlpha(i);
        this.edgeShadowPaint.setAlpha(i);
    }

    public void setCornerRadius(float f) {
        float round = (float) Math.round(f);
        if (this.cornerRadius != round) {
            this.cornerRadius = round;
            this.dirty = true;
            invalidateSelf();
        }
    }

    public void setMaxShadowSize(float f) {
        setShadowSize(this.rawShadowSize, f);
    }

    public final void setRotation(float f) {
        if (this.rotation != f) {
            this.rotation = f;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.rawMaxShadowSize);
    }

    public void setShadowSize(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float toEven = (float) toEven(f);
        float toEven2 = (float) toEven(f2);
        if (toEven > toEven2) {
            if (!this.printedShadowClipWarning) {
                this.printedShadowClipWarning = true;
            }
            toEven = toEven2;
        }
        if (this.rawShadowSize != toEven || this.rawMaxShadowSize != toEven2) {
            this.rawShadowSize = toEven;
            this.rawMaxShadowSize = toEven2;
            this.shadowSize = (float) Math.round(toEven * SHADOW_MULTIPLIER);
            this.maxShadowSize = toEven2;
            this.dirty = true;
            invalidateSelf();
        }
    }
}
