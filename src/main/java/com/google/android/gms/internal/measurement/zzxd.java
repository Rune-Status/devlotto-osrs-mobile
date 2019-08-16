package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzxd extends zzwx<Boolean> {
    zzxd(zzxh zzxh, String str, Boolean bool) {
        super(zzxh, str, bool, null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object zzfa(String str) {
        if (zzws.zzbom.matcher(str).matches()) {
            return Boolean.valueOf(true);
        }
        if (zzws.zzbon.matcher(str).matches()) {
            return Boolean.valueOf(false);
        }
        String str2 = this.zzbpk;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 28) + String.valueOf(str).length());
        stringBuilder.append("Invalid boolean value for ");
        stringBuilder.append(str2);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        Log.e("PhenotypeFlag", stringBuilder.toString());
        return null;
    }
}
