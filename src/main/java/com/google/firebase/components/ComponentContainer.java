package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.Set;

@KeepForSdk
public interface ComponentContainer {
    @KeepForSdk
    <T> T get(Class<T> cls);

    @KeepForSdk
    <T> Provider<T> getProvider(Class<T> cls);

    @KeepForSdk
    <T> Set<T> setOf(Class<T> cls);

    @KeepForSdk
    <T> Provider<Set<T>> setOfProvider(Class<T> cls);
}
