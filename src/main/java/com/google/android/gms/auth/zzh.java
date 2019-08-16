package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zzh implements zzj<Bundle> {
    private final /* synthetic */ Account zzo;

    zzh(Account account) {
        this.zzo = account;
    }

    public final /* synthetic */ Object zzb(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return (Bundle) zzd.zza(zzf.zza(iBinder).zza(this.zzo));
    }
}
