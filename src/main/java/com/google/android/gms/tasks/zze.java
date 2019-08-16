package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

final class zze<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, zzq<TResult> {
    private final Executor zzd;
    private final Continuation<TResult, Task<TContinuationResult>> zze;
    private final zzu<TContinuationResult> zzf;

    public zze(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation, @NonNull zzu<TContinuationResult> zzu) {
        this.zzd = executor;
        this.zze = continuation;
        this.zzf = zzu;
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onCanceled() {
        this.zzf.zza();
    }

    public final void onComplete(@NonNull Task<TResult> task) {
        this.zzd.execute(new zzf(this, task));
    }

    public final void onFailure(@NonNull Exception exception) {
        this.zzf.setException(exception);
    }

    public final void onSuccess(TContinuationResult tContinuationResult) {
        this.zzf.setResult(tContinuationResult);
    }
}
