package com.google.android.gms.dynamic;

import java.util.Iterator;

final class zaa implements OnDelegateCreatedListener<T> {
    private final /* synthetic */ DeferredLifecycleHelper zari;

    zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zari = deferredLifecycleHelper;
    }

    public final void onDelegateCreated(T t) {
        this.zari.zare = t;
        Iterator it = this.zari.zarg.iterator();
        while (it.hasNext()) {
            ((zaa) it.next()).zaa(this.zari.zare);
        }
        this.zari.zarg.clear();
        this.zari.zarf = null;
    }
}
