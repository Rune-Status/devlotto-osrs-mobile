package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.internal.auth.zzz;

final class zzg extends zzb<DeviceMetaData> {
    private final /* synthetic */ zzv zzar;

    zzg(AccountTransferClient accountTransferClient, zzv zzv) {
        this.zzar = zzv;
        super();
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzz zzz) throws RemoteException {
        zzz.zza(new zzh(this, this), this.zzar);
    }
}
