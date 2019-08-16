package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

final class zzl extends ApiMethodImpl<Result, zzr> {
    private final /* synthetic */ Account zzo;

    zzl(zzh zzh, Api api, GoogleApiClient googleApiClient, Account account) {
        this.zzo = account;
        super(api, googleApiClient);
    }

    /* Access modifiers changed, original: protected|final */
    public final Result createFailedResult(Status status) {
        return new zzq(status);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) throws RemoteException {
        ((zzc) ((zzr) anyClient).getService()).zza(new zzm(this), this.zzo);
    }
}
