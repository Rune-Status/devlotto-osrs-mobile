package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.firebase_messaging.zzf;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

final class zzad implements ServiceConnection {
    @GuardedBy("this")
    int state;
    final Messenger zzcb;
    zzai zzcc;
    @GuardedBy("this")
    final Queue<zzak<?>> zzcd;
    @GuardedBy("this")
    final SparseArray<zzak<?>> zzce;
    final /* synthetic */ zzab zzcf;

    private zzad(zzab zzab) {
        this.zzcf = zzab;
        this.state = 0;
        this.zzcb = new Messenger(new zzf(Looper.getMainLooper(), new zzae(this)));
        this.zzcd = new ArrayDeque();
        this.zzce = new SparseArray();
    }

    private final void zzy() {
        this.zzcf.zzby.execute(new zzag(this));
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Service connected");
            }
            if (iBinder == null) {
                zza(0, "Null service connection");
                return;
            }
            try {
                this.zzcc = new zzai(iBinder);
                this.state = 2;
                zzy();
            } catch (RemoteException e) {
                zza(0, e.getMessage());
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Service disconnected");
            }
            zza(2, "Service disconnected");
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(int i) {
        synchronized (this) {
            zzak zzak = (zzak) this.zzce.get(i);
            if (zzak != null) {
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Timing out request: ");
                stringBuilder.append(i);
                Log.w("MessengerIpcClient", stringBuilder.toString());
                this.zzce.remove(i);
                zzak.zza(new zzal(3, "Timed out waiting for response"));
                zzz();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(int i, String str) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
            }
            switch (this.state) {
                case 0:
                    throw new IllegalStateException();
                case 1:
                case 2:
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Unbinding service");
                    }
                    this.state = 4;
                    ConnectionTracker.getInstance().unbindService(this.zzcf.zzac, this);
                    zzal zzal = new zzal(i, str);
                    for (zzak zza : this.zzcd) {
                        zza.zza(zzal);
                    }
                    this.zzcd.clear();
                    for (int i2 = 0; i2 < this.zzce.size(); i2++) {
                        ((zzak) this.zzce.valueAt(i2)).zza(zzal);
                    }
                    this.zzce.clear();
                    return;
                case 3:
                    this.state = 4;
                    return;
                case 4:
                    return;
                default:
                    int i3 = this.state;
                    StringBuilder stringBuilder = new StringBuilder(26);
                    stringBuilder.append("Unknown state: ");
                    stringBuilder.append(i3);
                    throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(Message message) {
        StringBuilder stringBuilder;
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            stringBuilder = new StringBuilder(41);
            stringBuilder.append("Received response to request: ");
            stringBuilder.append(i);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        synchronized (this) {
            zzak zzak = (zzak) this.zzce.get(i);
            if (zzak == null) {
                stringBuilder = new StringBuilder(50);
                stringBuilder.append("Received response for unknown request: ");
                stringBuilder.append(i);
                Log.w("MessengerIpcClient", stringBuilder.toString());
            } else {
                this.zzce.remove(i);
                zzz();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzak.zza(new zzal(4, "Not supported by GmsCore"));
                } else {
                    zzak.zzb(data);
                }
            }
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void zzaa() {
        synchronized (this) {
            if (this.state == 1) {
                zza(1, "Timed out while binding");
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:36:?, code skipped:
            return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(zzak zzak) {
        boolean z = false;
        synchronized (this) {
            switch (this.state) {
                case 0:
                    this.zzcd.add(zzak);
                    if (this.state == 0) {
                        z = true;
                    }
                    Preconditions.checkState(z);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.state = 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    if (!ConnectionTracker.getInstance().bindService(this.zzcf.zzac, intent, this, 1)) {
                        zza(0, "Unable to bind to service");
                        break;
                    }
                    this.zzcf.zzby.schedule(new zzaf(this), 30, TimeUnit.SECONDS);
                    break;
                case 1:
                    this.zzcd.add(zzak);
                    return true;
                case 2:
                    this.zzcd.add(zzak);
                    zzy();
                    return true;
                case 3:
                case 4:
                    return false;
                default:
                    int i = this.state;
                    StringBuilder stringBuilder = new StringBuilder(26);
                    stringBuilder.append("Unknown state: ");
                    stringBuilder.append(i);
                    throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzz() {
        synchronized (this) {
            if (this.state == 2 && this.zzcd.isEmpty() && this.zzce.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.state = 3;
                ConnectionTracker.getInstance().unbindService(this.zzcf.zzac, this);
            }
        }
    }
}
