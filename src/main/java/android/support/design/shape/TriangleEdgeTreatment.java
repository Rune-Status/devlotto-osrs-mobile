package android.support.design.shape;

import android.support.design.internal.Experimental;

@Experimental("The shapes API is currently experimental and subject to change")
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f, boolean z) {
        this.size = f;
        this.inside = z;
    }

    public void getEdgePath(float f, float f2, ShapePath shapePath) {
        float f3 = f / 2.0f;
        shapePath.lineTo(f3 - (this.size * f2), 0.0f);
        shapePath.lineTo(f3, (this.inside ? this.size : -this.size) * f2);
        shapePath.lineTo((this.size * f2) + f3, 0.0f);
        shapePath.lineTo(f, 0.0f);
    }
}
