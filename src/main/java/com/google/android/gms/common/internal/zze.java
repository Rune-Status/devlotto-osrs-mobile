package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.os.EnvironmentCompat;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

final class zze extends GmsClientSupervisor implements Callback {
    private final Handler mHandler;
    @GuardedBy("mConnectionStatus")
    private final HashMap<zza, zzf> zzdu = new HashMap();
    private final Context zzdv;
    private final ConnectionTracker zzdw;
    private final long zzdx;
    private final long zzdy;

    zze(Context context) {
        this.zzdv = context.getApplicationContext();
        this.mHandler = new com.google.android.gms.internal.common.zze(context.getMainLooper(), this);
        this.zzdw = ConnectionTracker.getInstance();
        this.zzdx = 5000;
        this.zzdy = 300000;
    }

    public final boolean handleMessage(Message message) {
        zza zza;
        zzf zzf;
        switch (message.what) {
            case 0:
                synchronized (this.zzdu) {
                    zza = (zza) message.obj;
                    zzf = (zzf) this.zzdu.get(zza);
                    if (zzf != null && zzf.zzr()) {
                        if (zzf.isBound()) {
                            zzf.zzf("GmsClientSupervisor");
                        }
                        this.zzdu.remove(zza);
                    }
                }
                return true;
            case 1:
                synchronized (this.zzdu) {
                    zza = (zza) message.obj;
                    zzf = (zzf) this.zzdu.get(zza);
                    if (zzf != null && zzf.getState() == 3) {
                        String valueOf = String.valueOf(zza);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        stringBuilder.append("Timeout waiting for ServiceConnection callback ");
                        stringBuilder.append(valueOf);
                        Log.wtf("GmsClientSupervisor", stringBuilder.toString(), new Exception());
                        ComponentName componentName = zzf.getComponentName();
                        if (componentName == null) {
                            componentName = zza.getComponentName();
                        }
                        zzf.onServiceDisconnected(componentName == null ? new ComponentName(zza.getPackage(), EnvironmentCompat.MEDIA_UNKNOWN) : componentName);
                    }
                }
                return true;
            default:
                return false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(zza zza, ServiceConnection serviceConnection, String str) {
        boolean isBound;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzdu) {
            zzf zzf = (zzf) this.zzdu.get(zza);
            if (zzf == null) {
                zzf = new zzf(this, zza);
                zzf.zza(serviceConnection, str);
                zzf.zze(str);
                this.zzdu.put(zza, zzf);
            } else {
                this.mHandler.removeMessages(0, zza);
                if (!zzf.zza(serviceConnection)) {
                    zzf.zza(serviceConnection, str);
                    switch (zzf.getState()) {
                        case 1:
                            serviceConnection.onServiceConnected(zzf.getComponentName(), zzf.getBinder());
                            break;
                        case 2:
                            zzf.zze(str);
                            break;
                        default:
                            break;
                    }
                }
                String valueOf = String.valueOf(zza);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 81);
                stringBuilder.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
            isBound = zzf.isBound();
        }
        return isBound;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzb(zza zza, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzdu) {
            zzf zzf = (zzf) this.zzdu.get(zza);
            String valueOf;
            StringBuilder stringBuilder;
            if (zzf == null) {
                valueOf = String.valueOf(zza);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
                stringBuilder.append("Nonexistent connection status for service config: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (zzf.zza(serviceConnection)) {
                zzf.zzb(serviceConnection, str);
                if (zzf.zzr()) {
                    this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, zza), this.zzdx);
                }
            } else {
                valueOf = String.valueOf(zza);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 76);
                stringBuilder.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }
}
