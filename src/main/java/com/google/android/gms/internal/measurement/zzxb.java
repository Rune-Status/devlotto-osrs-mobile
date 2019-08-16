package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzxb extends zzwx<Long> {
    zzxb(zzxh zzxh, String str, Long l) {
        super(zzxh, str, l, null);
    }

    private final Long zzfb(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException e) {
            String str2 = this.zzbpk;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 25) + String.valueOf(str).length());
            stringBuilder.append("Invalid long value for ");
            stringBuilder.append(str2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            Log.e("PhenotypeFlag", stringBuilder.toString());
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object zzfa(String str) {
        return zzfb(str);
    }
}
