package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState;

final class zaax implements GmsClientEventState {
    private final /* synthetic */ zaaw zahg;

    zaax(zaaw zaaw) {
        this.zahg = zaaw;
    }

    public final Bundle getConnectionHint() {
        return null;
    }

    public final boolean isConnected() {
        return this.zahg.isConnected();
    }
}
