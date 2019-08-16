package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzz;

final class zze extends zzb<byte[]> {
    private final /* synthetic */ zzad zzap;

    zze(AccountTransferClient accountTransferClient, zzad zzad) {
        this.zzap = zzad;
        super();
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzz zzz) throws RemoteException {
        zzz.zza(new zzf(this, this), this.zzap);
    }
}
