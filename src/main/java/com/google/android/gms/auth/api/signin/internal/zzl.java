package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class zzl extends zzc {
    private final /* synthetic */ zzk zzbl;

    zzl(zzk zzk) {
        this.zzbl = zzk;
    }

    public final void zze(Status status) throws RemoteException {
        this.zzbl.setResult(status);
    }
}
