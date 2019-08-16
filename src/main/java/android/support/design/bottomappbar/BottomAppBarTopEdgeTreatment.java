package android.support.design.bottomappbar;

import android.support.design.shape.EdgeTreatment;
import android.support.design.shape.ShapePath;

public class BottomAppBarTopEdgeTreatment extends EdgeTreatment {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private float cradleVerticalOffset;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f, float f2, float f3) {
        this.fabMargin = f;
        this.roundedCornerRadius = f2;
        this.cradleVerticalOffset = f3;
        if (f3 >= 0.0f) {
            this.horizontalOffset = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* Access modifiers changed, original: 0000 */
    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    public void getEdgePath(float f, float f2, ShapePath shapePath) {
        if (this.fabDiameter == 0.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f3 = ((this.fabMargin * 2.0f) + this.fabDiameter) / 2.0f;
        float f4 = f2 * this.roundedCornerRadius;
        float f5 = (f / 2.0f) + this.horizontalOffset;
        float f6 = (this.cradleVerticalOffset * f2) + ((1.0f - f2) * f3);
        if (f6 / f3 >= 1.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f7 = f3 + f4;
        float f8 = f6 + f4;
        f7 = (float) Math.sqrt((double) ((f7 * f7) - (f8 * f8)));
        float f9 = f5 - f7;
        float f10 = f5 + f7;
        float toDegrees = (float) Math.toDegrees(Math.atan((double) (f7 / f8)));
        float f11 = 90.0f - toDegrees;
        f8 = f9 - f4;
        shapePath.lineTo(f8, 0.0f);
        float f12 = f4 * 2.0f;
        shapePath.addArc(f8, 0.0f, f9 + f4, f12, 270.0f, toDegrees);
        shapePath.addArc(f5 - f3, (-f3) - f6, f5 + f3, f3 - f6, 180.0f - f11, (2.0f * f11) - 180.0f);
        shapePath.addArc(f10 - f4, 0.0f, f10 + f4, f12, 270.0f - toDegrees, toDegrees);
        shapePath.lineTo(f, 0.0f);
    }

    /* Access modifiers changed, original: 0000 */
    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    /* Access modifiers changed, original: 0000 */
    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    /* Access modifiers changed, original: 0000 */
    public float getFabDiameter() {
        return this.fabDiameter;
    }

    /* Access modifiers changed, original: 0000 */
    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    /* Access modifiers changed, original: 0000 */
    public void setCradleVerticalOffset(float f) {
        this.cradleVerticalOffset = f;
    }

    /* Access modifiers changed, original: 0000 */
    public void setFabCradleMargin(float f) {
        this.fabMargin = f;
    }

    /* Access modifiers changed, original: 0000 */
    public void setFabCradleRoundedCornerRadius(float f) {
        this.roundedCornerRadius = f;
    }

    /* Access modifiers changed, original: 0000 */
    public void setFabDiameter(float f) {
        this.fabDiameter = f;
    }

    /* Access modifiers changed, original: 0000 */
    public void setHorizontalOffset(float f) {
        this.horizontalOffset = f;
    }
}
