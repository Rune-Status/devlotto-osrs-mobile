package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzwv extends ContentObserver {
    private final /* synthetic */ zzwu zzbpf;

    zzwv(zzwu zzwu, Handler handler) {
        this.zzbpf = zzwu;
        super(null);
    }

    public final void onChange(boolean z) {
        this.zzbpf.zzsi();
        this.zzbpf.zzsk();
    }
}
