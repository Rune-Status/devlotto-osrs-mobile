package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class zzj implements ThreadFactory {
    static final ThreadFactory zzaj = new zzj();

    private zzj() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
