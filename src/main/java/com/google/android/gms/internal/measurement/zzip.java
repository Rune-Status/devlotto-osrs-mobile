package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

final class zzip implements Runnable {
    private final /* synthetic */ zzig zzaqn;
    private final /* synthetic */ zzik zzaqv;

    zzip(zzik zzik, zzig zzig) {
        this.zzaqv = zzik;
        this.zzaqn = zzig;
    }

    public final void run() {
        zzfa zzd = this.zzaqv.zzaqp;
        if (zzd == null) {
            this.zzaqv.zzgi().zziv().log("Failed to send current screen to service");
            return;
        }
        try {
            long j;
            String packageName;
            String str;
            String str2;
            if (this.zzaqn == null) {
                j = 0;
                packageName = this.zzaqv.getContext().getPackageName();
                str = null;
                str2 = null;
            } else {
                j = this.zzaqn.zzaqb;
                str2 = this.zzaqn.zzuk;
                str = this.zzaqn.zzaqa;
                packageName = this.zzaqv.getContext().getPackageName();
            }
            zzd.zza(j, str2, str, packageName);
            this.zzaqv.zzcu();
        } catch (RemoteException e) {
            this.zzaqv.zzgi().zziv().zzg("Failed to send current screen to the service", e);
        }
    }
}
