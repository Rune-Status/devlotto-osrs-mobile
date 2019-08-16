package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class zzin implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzik zzaqv;
    private final /* synthetic */ AtomicReference zzaqw;

    zzin(zzik zzik, AtomicReference atomicReference, zzeb zzeb) {
        this.zzaqv = zzik;
        this.zzaqw = atomicReference;
        this.zzapd = zzeb;
    }

    public final void run() {
        synchronized (this.zzaqw) {
            Object obj;
            try {
                zzfa zzd = this.zzaqv.zzaqp;
                if (zzd == null) {
                    this.zzaqv.zzgi().zziv().log("Failed to get app instance id");
                    this.zzaqw.notify();
                    return;
                }
                this.zzaqw.set(zzd.zzc(this.zzapd));
                String str = (String) this.zzaqw.get();
                if (str != null) {
                    this.zzaqv.zzfy().zzbu(str);
                    this.zzaqv.zzgj().zzama.zzbv(str);
                }
                this.zzaqv.zzcu();
                obj = this.zzaqw;
                obj.notify();
            } catch (RemoteException e) {
                this.zzaqv.zzgi().zziv().zzg("Failed to get app instance id", e);
                obj = this.zzaqw;
            } catch (Throwable th) {
                this.zzaqw.notify();
            }
        }
    }
}
