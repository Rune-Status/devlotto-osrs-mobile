package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class ViewUtils {
    private ViewUtils() {
    }

    @KeepForSdk
    public static String getXmlAttributeString(String str, String str2, Context context, AttributeSet attributeSet, boolean z, boolean z2, String str3) {
        StringBuilder stringBuilder;
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z) {
            String substring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(packageName).length() + 8) + String.valueOf(substring).length());
                stringBuilder2.append(packageName);
                stringBuilder2.append(":string/");
                stringBuilder2.append(substring);
                resources.getValue(stringBuilder2.toString(), typedValue, true);
            } catch (NotFoundException e) {
                stringBuilder = new StringBuilder((String.valueOf(str2).length() + 30) + String.valueOf(attributeValue).length());
                stringBuilder.append("Could not find resource for ");
                stringBuilder.append(str2);
                stringBuilder.append(": ");
                stringBuilder.append(attributeValue);
                Log.w(str3, stringBuilder.toString());
            }
            if (typedValue.string != null) {
                attributeValue = typedValue.string.toString();
            } else {
                substring = String.valueOf(typedValue);
                StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(str2).length() + 28) + String.valueOf(substring).length());
                stringBuilder3.append("Resource ");
                stringBuilder3.append(str2);
                stringBuilder3.append(" was not a string: ");
                stringBuilder3.append(substring);
                Log.w(str3, stringBuilder3.toString());
            }
        }
        if (z2 && attributeValue == null) {
            stringBuilder = new StringBuilder(String.valueOf(str2).length() + 33);
            stringBuilder.append("Required XML attribute \"");
            stringBuilder.append(str2);
            stringBuilder.append("\" missing");
            Log.w(str3, stringBuilder.toString());
        }
        return attributeValue;
    }
}
