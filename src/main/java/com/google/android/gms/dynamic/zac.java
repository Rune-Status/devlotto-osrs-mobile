package com.google.android.gms.dynamic;

import android.os.Bundle;

final class zac implements zaa {
    private final /* synthetic */ DeferredLifecycleHelper zari;
    private final /* synthetic */ Bundle zark;

    zac(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.zari = deferredLifecycleHelper;
        this.zark = bundle;
    }

    public final int getState() {
        return 1;
    }

    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        this.zari.zare.onCreate(this.zark);
    }
}
