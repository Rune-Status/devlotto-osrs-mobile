package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzz;

final class zzd extends zzc {
    private final /* synthetic */ zzaf zzao;

    zzd(AccountTransferClient accountTransferClient, zzaf zzaf) {
        this.zzao = zzaf;
        super();
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzz zzz) throws RemoteException {
        zzz.zza(this.zzax, this.zzao);
    }
}
