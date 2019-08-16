package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences.Editor;
import android.support.annotation.WorkerThread;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzfx {
    private final long zzabi;
    private final /* synthetic */ zzft zzamp;
    @VisibleForTesting
    private final String zzamr;
    private final String zzams;
    private final String zzamt;

    private zzfx(zzft zzft, String str, long j) {
        this.zzamp = zzft;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.zzamr = String.valueOf(str).concat(":start");
        this.zzams = String.valueOf(str).concat(":count");
        this.zzamt = String.valueOf(str).concat(":value");
        this.zzabi = j;
    }

    /* synthetic */ zzfx(zzft zzft, String str, long j, zzfu zzfu) {
        this(zzft, str, j);
    }

    @WorkerThread
    private final void zzfh() {
        this.zzamp.zzab();
        long currentTimeMillis = this.zzamp.zzbt().currentTimeMillis();
        Editor edit = this.zzamp.zzji().edit();
        edit.remove(this.zzams);
        edit.remove(this.zzamt);
        edit.putLong(this.zzamr, currentTimeMillis);
        edit.apply();
    }

    @WorkerThread
    private final long zzfj() {
        return this.zzamp.zzji().getLong(this.zzamr, 0);
    }

    @WorkerThread
    public final void zzc(String str, long j) {
        this.zzamp.zzab();
        if (zzfj() == 0) {
            zzfh();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.zzamp.zzji().getLong(this.zzams, 0);
        if (j2 <= 0) {
            Editor edit = this.zzamp.zzji().edit();
            edit.putString(this.zzamt, str);
            edit.putLong(this.zzams, 1);
            edit.apply();
            return;
        }
        long j3 = 1 + j2;
        Object obj = (this.zzamp.zzgg().zzlo().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3 ? 1 : null;
        Editor edit2 = this.zzamp.zzji().edit();
        if (obj != null) {
            edit2.putString(this.zzamt, str);
        }
        edit2.putLong(this.zzams, j3);
        edit2.apply();
    }

    @WorkerThread
    public final Pair<String, Long> zzfi() {
        this.zzamp.zzab();
        this.zzamp.zzab();
        long zzfj = zzfj();
        if (zzfj == 0) {
            zzfh();
            zzfj = 0;
        } else {
            zzfj = Math.abs(zzfj - this.zzamp.zzbt().currentTimeMillis());
        }
        if (zzfj < this.zzabi) {
            return null;
        }
        if (zzfj > (this.zzabi << 1)) {
            zzfh();
            return null;
        }
        String string = this.zzamp.zzji().getString(this.zzamt, null);
        long j = this.zzamp.zzji().getLong(this.zzams, 0);
        zzfh();
        return (string == null || j <= 0) ? zzft.zzalr : new Pair(string, Long.valueOf(j));
    }
}
