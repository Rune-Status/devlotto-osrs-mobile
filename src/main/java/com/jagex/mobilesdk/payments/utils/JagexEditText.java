package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

public class JagexEditText extends AppCompatEditText {
    public JagexEditText(Context context) {
        super(context);
    }

    public JagexEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JagexEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setTypeface(Typeface typeface) {
        super.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/bague_sans_thin.otf"));
    }

    public void setTypeface(Typeface typeface, int i) {
        super.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/bague_sans_thin.otf"), i);
    }
}
