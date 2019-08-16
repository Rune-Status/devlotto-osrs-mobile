package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@KeepForSdk
public class ListenerHolders {
    private final Set<ListenerHolder<?>> zajn = Collections.newSetFromMap(new WeakHashMap());

    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(looper, "Looper must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder(looper, l, str);
    }

    @KeepForSdk
    public static <L> ListenerKey<L> createListenerKey(@NonNull L l, @NonNull String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new ListenerKey(l, str);
    }

    public final void release() {
        for (ListenerHolder clear : this.zajn) {
            clear.clear();
        }
        this.zajn.clear();
    }

    public final <L> ListenerHolder<L> zaa(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        ListenerHolder createListenerHolder = createListenerHolder(l, looper, str);
        this.zajn.add(createListenerHolder);
        return createListenerHolder;
    }
}
