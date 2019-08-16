package com.google.android.gms.internal.auth-api-phone;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzm extends TaskApiCall<zzi, Void> {
    private TaskCompletionSource<Void> zzf;

    private zzm() {
    }

    /* synthetic */ zzm(zzk zzk) {
        this();
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ void doExecute(AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzi zzi = (zzi) anyClient;
        this.zzf = taskCompletionSource;
        zza((zze) zzi.getService());
    }

    public abstract void zza(zze zze) throws RemoteException;

    /* Access modifiers changed, original: protected|final */
    public final void zzb(Status status) {
        TaskUtil.setResultOrApiException(status, this.zzf);
    }
}
