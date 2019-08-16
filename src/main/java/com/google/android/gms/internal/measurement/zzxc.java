package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzxc extends zzwx<Integer> {
    zzxc(zzxh zzxh, String str, Integer num) {
        super(zzxh, str, num, null);
    }

    private final Integer zzfc(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            String str2 = this.zzbpk;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 28) + String.valueOf(str).length());
            stringBuilder.append("Invalid integer value for ");
            stringBuilder.append(str2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            Log.e("PhenotypeFlag", stringBuilder.toString());
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object zzfa(String str) {
        return zzfc(str);
    }
}
