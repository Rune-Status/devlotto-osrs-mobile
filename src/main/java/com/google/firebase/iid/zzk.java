package com.google.firebase.iid;

import java.util.concurrent.Executor;

final /* synthetic */ class zzk implements Executor {
    static final Executor zzak = new zzk();

    private zzk() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
