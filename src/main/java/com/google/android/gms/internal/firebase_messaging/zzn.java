package com.google.android.gms.internal.firebase_messaging;

import android.content.Context;
import android.support.v4.content.ContextCompat;

public final class zzn implements zzv {
    private final Context zzac;

    public zzn(Context context) {
        this.zzac = context;
    }

    public final Integer zzb(int i) {
        return Integer.valueOf(ContextCompat.getColor(this.zzac, i));
    }
}
