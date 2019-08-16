package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzz;

final class zzj extends zzc {
    private final /* synthetic */ zzab zzau;

    zzj(AccountTransferClient accountTransferClient, zzab zzab) {
        this.zzau = zzab;
        super();
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzz zzz) throws RemoteException {
        zzz.zza(this.zzax, this.zzau);
    }
}
