package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

final class zzht implements Runnable {
    private final /* synthetic */ zzhm zzaps;
    private final /* synthetic */ ConditionalUserProperty zzapw;

    zzht(zzhm zzhm, ConditionalUserProperty conditionalUserProperty) {
        this.zzaps = zzhm;
        this.zzapw = conditionalUserProperty;
    }

    public final void run() {
        this.zzaps.zzb(this.zzapw);
    }
}
