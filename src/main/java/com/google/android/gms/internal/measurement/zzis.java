package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;

final class zzis implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ String zzapg;
    private final /* synthetic */ zzex zzaph;
    private final /* synthetic */ zzik zzaqv;
    private final /* synthetic */ boolean zzaqx;
    private final /* synthetic */ boolean zzaqy;

    zzis(zzik zzik, boolean z, boolean z2, zzex zzex, zzeb zzeb, String str) {
        this.zzaqv = zzik;
        this.zzaqx = z;
        this.zzaqy = z2;
        this.zzaph = zzex;
        this.zzapd = zzeb;
        this.zzapg = str;
    }

    public final void run() {
        zzfa zzd = this.zzaqv.zzaqp;
        if (zzd == null) {
            this.zzaqv.zzgi().zziv().log("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zzaqx) {
            this.zzaqv.zza(zzd, this.zzaqy ? null : this.zzaph, this.zzapd);
        } else {
            try {
                if (TextUtils.isEmpty(this.zzapg)) {
                    zzd.zza(this.zzaph, this.zzapd);
                } else {
                    zzd.zza(this.zzaph, this.zzapg, this.zzaqv.zzgi().zzje());
                }
            } catch (RemoteException e) {
                this.zzaqv.zzgi().zziv().zzg("Failed to send event to the service", e);
            }
        }
        this.zzaqv.zzcu();
    }
}
