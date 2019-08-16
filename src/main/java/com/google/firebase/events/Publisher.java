package com.google.firebase.events;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface Publisher {
    @KeepForSdk
    void publish(Event<?> event);
}
