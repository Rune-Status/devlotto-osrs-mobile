package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences.Editor;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzfv {
    private boolean value;
    private final boolean zzamn = true;
    private boolean zzamo;
    private final /* synthetic */ zzft zzamp;
    private final String zzny;

    public zzfv(zzft zzft, String str, boolean z) {
        this.zzamp = zzft;
        Preconditions.checkNotEmpty(str);
        this.zzny = str;
    }

    @WorkerThread
    public final boolean get() {
        if (!this.zzamo) {
            this.zzamo = true;
            this.value = this.zzamp.zzji().getBoolean(this.zzny, this.zzamn);
        }
        return this.value;
    }

    @WorkerThread
    public final void set(boolean z) {
        Editor edit = this.zzamp.zzji().edit();
        edit.putBoolean(this.zzny, z);
        edit.apply();
        this.value = z;
    }
}
