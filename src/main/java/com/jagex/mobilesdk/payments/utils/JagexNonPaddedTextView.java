package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.util.AttributeSet;

public class JagexNonPaddedTextView extends JagexTextView {
    private final Rect bounds = new Rect();
    private final Paint paint = new Paint();

    public JagexNonPaddedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JagexNonPaddedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private String calculateTextParams() {
        String charSequence = getText().toString();
        int length = charSequence.length();
        this.paint.setTextSize(getTextSize());
        this.paint.getTextBounds(charSequence, 0, length, this.bounds);
        if (length == 0) {
            this.bounds.right = this.bounds.left;
        }
        return charSequence;
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(@NonNull Canvas canvas) {
        String calculateTextParams = calculateTextParams();
        int i = this.bounds.left;
        int i2 = this.bounds.bottom;
        this.bounds.offset(-this.bounds.left, -this.bounds.top);
        this.paint.setAntiAlias(true);
        this.paint.setColor(getCurrentTextColor());
        canvas.drawText(calculateTextParams, (float) (-i), (float) (this.bounds.bottom - i2), this.paint);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        calculateTextParams();
        setMeasuredDimension(this.bounds.width() + 1, (-this.bounds.top) + this.bounds.bottom);
    }
}
