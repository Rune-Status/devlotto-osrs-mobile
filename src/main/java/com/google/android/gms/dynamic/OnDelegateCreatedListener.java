package com.google.android.gms.dynamic;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface OnDelegateCreatedListener<T extends LifecycleDelegate> {
    @KeepForSdk
    void onDelegateCreated(T t);
}
