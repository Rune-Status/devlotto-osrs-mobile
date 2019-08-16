package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread.UncaughtExceptionHandler;

final class zzgk implements UncaughtExceptionHandler {
    private final String zzanw;
    private final /* synthetic */ zzgi zzanx;

    public zzgk(zzgi zzgi, String str) {
        this.zzanx = zzgi;
        Preconditions.checkNotNull(str);
        this.zzanw = str;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (this) {
            this.zzanx.zzgi().zziv().zzg(this.zzanw, th);
        }
    }
}
