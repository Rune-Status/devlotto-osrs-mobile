package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class zziu implements Runnable {
    private final /* synthetic */ String zzadn;
    private final /* synthetic */ String zzadu;
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ String zzapg;
    private final /* synthetic */ zzik zzaqv;
    private final /* synthetic */ AtomicReference zzaqw;

    zziu(zzik zzik, AtomicReference atomicReference, String str, String str2, String str3, zzeb zzeb) {
        this.zzaqv = zzik;
        this.zzaqw = atomicReference;
        this.zzapg = str;
        this.zzadn = str2;
        this.zzadu = str3;
        this.zzapd = zzeb;
    }

    public final void run() {
        synchronized (this.zzaqw) {
            Object obj;
            try {
                zzfa zzd = this.zzaqv.zzaqp;
                if (zzd == null) {
                    this.zzaqv.zzgi().zziv().zzd("Failed to get conditional properties", zzfi.zzbp(this.zzapg), this.zzadn, this.zzadu);
                    this.zzaqw.set(Collections.emptyList());
                    this.zzaqw.notify();
                    return;
                }
                AtomicReference atomicReference;
                Object zza;
                if (TextUtils.isEmpty(this.zzapg)) {
                    atomicReference = this.zzaqw;
                    zza = zzd.zza(this.zzadn, this.zzadu, this.zzapd);
                } else {
                    atomicReference = this.zzaqw;
                    zza = zzd.zze(this.zzapg, this.zzadn, this.zzadu);
                }
                atomicReference.set(zza);
                this.zzaqv.zzcu();
                obj = this.zzaqw;
                obj.notify();
            } catch (RemoteException e) {
                this.zzaqv.zzgi().zziv().zzd("Failed to get conditional properties", zzfi.zzbp(this.zzapg), this.zzadn, e);
                this.zzaqw.set(Collections.emptyList());
                obj = this.zzaqw;
            } catch (Throwable th) {
                this.zzaqw.notify();
            }
        }
    }
}
