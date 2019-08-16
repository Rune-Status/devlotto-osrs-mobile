package com.google.android.gms.tasks;

import android.support.annotation.NonNull;

public class TaskCompletionSource<TResult> {
    private final zzu<TResult> zza = new zzu();

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(@NonNull Exception exception) {
        this.zza.setException(exception);
    }

    public void setResult(TResult tResult) {
        this.zza.setResult(tResult);
    }

    public boolean trySetException(@NonNull Exception exception) {
        return this.zza.trySetException(exception);
    }

    public boolean trySetResult(TResult tResult) {
        return this.zza.trySetResult(tResult);
    }
}
