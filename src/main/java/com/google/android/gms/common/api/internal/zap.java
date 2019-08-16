package com.google.android.gms.common.api.internal;

final class zap extends ThreadLocal<Boolean> {
    zap() {
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object initialValue() {
        return Boolean.valueOf(false);
    }
}
