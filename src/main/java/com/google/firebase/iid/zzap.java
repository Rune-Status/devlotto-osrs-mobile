package com.google.firebase.iid;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

final /* synthetic */ class zzap implements ComponentFactory {
    static final ComponentFactory zzcq = new zzap();

    private zzap() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return new zza((FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class));
    }
}
