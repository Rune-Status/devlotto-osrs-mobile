package com.google.android.gms.internal.measurement;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class zzgl<V> extends FutureTask<V> implements Comparable<zzgl> {
    private final String zzanw;
    private final /* synthetic */ zzgi zzanx;
    private final long zzany = zzgi.zzanv.getAndIncrement();
    final boolean zzanz;

    zzgl(zzgi zzgi, Runnable runnable, boolean z, String str) {
        this.zzanx = zzgi;
        super(runnable, null);
        Preconditions.checkNotNull(str);
        this.zzanw = str;
        this.zzanz = false;
        if (this.zzany == Long.MAX_VALUE) {
            zzgi.zzgi().zziv().log("Tasks index overflow");
        }
    }

    zzgl(zzgi zzgi, Callable<V> callable, boolean z, String str) {
        this.zzanx = zzgi;
        super(callable);
        Preconditions.checkNotNull(str);
        this.zzanw = str;
        this.zzanz = z;
        if (this.zzany == Long.MAX_VALUE) {
            zzgi.zzgi().zziv().log("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        zzgl zzgl = (zzgl) obj;
        if (this.zzanz != zzgl.zzanz) {
            return this.zzanz ? -1 : 1;
        } else {
            if (this.zzany < zzgl.zzany) {
                return -1;
            }
            if (this.zzany > zzgl.zzany) {
                return 1;
            }
            this.zzanx.zzgi().zziw().zzg("Two tasks share the same index. index", Long.valueOf(this.zzany));
            return 0;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void setException(Throwable th) {
        this.zzanx.zzgi().zziv().zzg(this.zzanw, th);
        if (th instanceof zzgj) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
