package com.google.firebase.events;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class Event<T> {
    private final T payload;
    private final Class<T> type;

    @KeepForSdk
    public Event(Class<T> cls, T t) {
        this.type = (Class) Preconditions.checkNotNull(cls);
        this.payload = Preconditions.checkNotNull(t);
    }

    @KeepForSdk
    public T getPayload() {
        return this.payload;
    }

    @KeepForSdk
    public Class<T> getType() {
        return this.type;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.type, this.payload});
    }
}
