package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zag<ResultT> extends zac {
    private final TaskCompletionSource<ResultT> zacm;
    private final TaskApiCall<AnyClient, ResultT> zacq;
    private final StatusExceptionMapper zacr;

    public zag(int i, TaskApiCall<AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.zacm = taskCompletionSource;
        this.zacq = taskApiCall;
        this.zacr = statusExceptionMapper;
    }

    public final void zaa(@NonNull Status status) {
        this.zacm.trySetException(this.zacr.getException(status));
    }

    public final void zaa(zaa<?> zaa) throws DeadObjectException {
        try {
            this.zacq.doExecute(zaa.zaab(), this.zacm);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            zaa(zab.zaa(e2));
        } catch (RuntimeException e3) {
            zaa(e3);
        }
    }

    public final void zaa(@NonNull zaab zaab, boolean z) {
        zaab.zaa(this.zacm, z);
    }

    public final void zaa(@NonNull RuntimeException runtimeException) {
        this.zacm.trySetException(runtimeException);
    }

    @Nullable
    public final Feature[] zab(zaa<?> zaa) {
        return this.zacq.zabt();
    }

    public final boolean zac(zaa<?> zaa) {
        return this.zacq.shouldAutoResolveMissingFeatures();
    }
}
