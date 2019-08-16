package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences.Editor;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzfy {
    private String value;
    private boolean zzamo;
    private final /* synthetic */ zzft zzamp;
    private final String zzamu = null;
    private final String zzny;

    public zzfy(zzft zzft, String str, String str2) {
        this.zzamp = zzft;
        Preconditions.checkNotEmpty(str);
        this.zzny = str;
    }

    @WorkerThread
    public final void zzbv(String str) {
        if (!zzkd.zzs(str, this.value)) {
            Editor edit = this.zzamp.zzji().edit();
            edit.putString(this.zzny, str);
            edit.apply();
            this.value = str;
        }
    }

    @WorkerThread
    public final String zzjq() {
        if (!this.zzamo) {
            this.zzamo = true;
            this.value = this.zzamp.zzji().getString(this.zzny, null);
        }
        return this.value;
    }
}
