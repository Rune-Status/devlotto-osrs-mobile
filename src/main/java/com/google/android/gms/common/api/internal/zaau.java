package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;

abstract class zaau implements Runnable {
    private final /* synthetic */ zaak zagi;

    private zaau(zaak zaak) {
        this.zagi = zaak;
    }

    /* synthetic */ zaau(zaak zaak, zaal zaal) {
        this(zaak);
    }

    @WorkerThread
    public void run() {
        this.zagi.zaen.lock();
        try {
            if (!Thread.interrupted()) {
                zaan();
                this.zagi.zaen.unlock();
            }
        } catch (RuntimeException e) {
            this.zagi.zafs.zab(e);
        } finally {
            this.zagi.zaen.unlock();
        }
    }

    @WorkerThread
    public abstract void zaan();
}
