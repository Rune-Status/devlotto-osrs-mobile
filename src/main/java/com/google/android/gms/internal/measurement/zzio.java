package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

final class zzio implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzik zzaqv;

    zzio(zzik zzik, zzeb zzeb) {
        this.zzaqv = zzik;
        this.zzapd = zzeb;
    }

    public final void run() {
        zzfa zzd = this.zzaqv.zzaqp;
        if (zzd == null) {
            this.zzaqv.zzgi().zziv().log("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzd.zza(this.zzapd);
            this.zzaqv.zza(zzd, null, this.zzapd);
            this.zzaqv.zzcu();
        } catch (RemoteException e) {
            this.zzaqv.zzgi().zziv().zzg("Failed to send app launch to the service", e);
        }
    }
}
