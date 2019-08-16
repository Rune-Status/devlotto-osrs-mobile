package com.google.firebase.events;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface EventHandler<T> {
    @KeepForSdk
    void handle(Event<T> event);
}
