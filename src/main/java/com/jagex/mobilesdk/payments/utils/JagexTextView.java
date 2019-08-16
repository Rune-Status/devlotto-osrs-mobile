package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import java.util.Hashtable;
import java.util.Locale;

public class JagexTextView extends AppCompatTextView {
    private static final String ATTRIBUTE = "customFont";
    private static final String SCHEME = "http://schemas.android.com/apk/res-auto";
    private static final Hashtable<String, Typeface> typeFaces = new Hashtable(2);

    public enum CustomFont {
        BAGUE_SANS_BLACK("fonts/bague_sans_black.otf"),
        BAGUE_SANS_THIN("fonts/bague_sans_thin.otf");
        
        private final String fileName;

        private CustomFont(String str) {
            this.fileName = str;
        }

        public static CustomFont fromString(String str) {
            return valueOf(str.toUpperCase(Locale.US));
        }

        public Typeface asTypeface(Context context) {
            try {
                return Typeface.createFromAsset(context.getAssets(), this.fileName);
            } catch (Exception e) {
                return null;
            }
        }
    }

    public JagexTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        applyCustomFont(context, attributeSet);
    }

    public JagexTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        applyCustomFont(context, attributeSet);
    }

    private void applyCustomFont(Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            String attributeValue = attributeSet.getAttributeValue(SCHEME, ATTRIBUTE);
            if (attributeValue != null) {
                Typeface typeface = (Typeface) typeFaces.get(attributeValue);
                if (typeface == null) {
                    typeface = CustomFont.fromString(attributeValue).asTypeface(context);
                    typeFaces.put(attributeValue, typeface);
                    setTypeface(typeface);
                    return;
                }
                setTypeface(typeface);
                return;
            }
            throw new IllegalArgumentException("You must provide \"customFont\" for your text view");
        }
    }
}
