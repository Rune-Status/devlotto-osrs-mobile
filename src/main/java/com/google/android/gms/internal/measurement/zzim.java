package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

final class zzim implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzik zzaqv;

    zzim(zzik zzik, zzeb zzeb) {
        this.zzaqv = zzik;
        this.zzapd = zzeb;
    }

    public final void run() {
        zzfa zzd = this.zzaqv.zzaqp;
        if (zzd == null) {
            this.zzaqv.zzgi().zziv().log("Failed to reset data on the service; null service");
            return;
        }
        try {
            zzd.zzd(this.zzapd);
        } catch (RemoteException e) {
            this.zzaqv.zzgi().zziv().zzg("Failed to reset data on the service", e);
        }
        this.zzaqv.zzcu();
    }
}
