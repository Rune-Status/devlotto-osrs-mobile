package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class zzn extends zzc {
    private final /* synthetic */ zzm zzbm;

    zzn(zzm zzm) {
        this.zzbm = zzm;
    }

    public final void zzf(Status status) throws RemoteException {
        this.zzbm.setResult(status);
    }
}
