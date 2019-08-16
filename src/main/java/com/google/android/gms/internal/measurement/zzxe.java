package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzxe extends zzwx<Double> {
    zzxe(zzxh zzxh, String str, Double d) {
        super(zzxh, str, d, null);
    }

    private final Double zzfd(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException e) {
            String str2 = this.zzbpk;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 27) + String.valueOf(str).length());
            stringBuilder.append("Invalid double value for ");
            stringBuilder.append(str2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            Log.e("PhenotypeFlag", stringBuilder.toString());
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object zzfa(String str) {
        return zzfd(str);
    }
}
