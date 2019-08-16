package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zziy implements ServiceConnection, BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    final /* synthetic */ zzik zzaqv;
    private volatile boolean zzarb;
    private volatile zzfh zzarc;

    protected zziy(zzik zzik) {
        this.zzaqv = zzik;
    }

    @MainThread
    public final void onConnected(@Nullable Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                zzfa zzfa = (zzfa) this.zzarc.getService();
                this.zzarc = null;
                this.zzaqv.zzgh().zzc(new zzjb(this, zzfa));
            } catch (DeadObjectException | IllegalStateException e) {
                this.zzarc = null;
                this.zzarb = false;
            }
        }
    }

    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzfi zzjy = this.zzaqv.zzacv.zzjy();
        if (zzjy != null) {
            zzjy.zziy().zzg("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzarb = false;
            this.zzarc = null;
        }
        this.zzaqv.zzgh().zzc(new zzjd(this));
    }

    @MainThread
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zzaqv.zzgi().zzjb().log("Service connection suspended");
        this.zzaqv.zzgh().zzc(new zzjc(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d A:{SYNTHETIC, Splitter:B:37:0x008d} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d A:{SYNTHETIC, Splitter:B:37:0x008d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfa zzfa = null;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzarb = false;
                this.zzaqv.zzgi().zziv().log("Service connected with null binder");
                return;
            }
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    zzfa zzfa2;
                    if (iBinder == null) {
                        zzfa2 = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        zzfa2 = queryLocalInterface instanceof zzfa ? (zzfa) queryLocalInterface : new zzfc(iBinder);
                    }
                    try {
                        this.zzaqv.zzgi().zzjc().log("Bound to IMeasurementService interface");
                        zzfa = zzfa2;
                    } catch (RemoteException e) {
                        zzfa = zzfa2;
                        this.zzaqv.zzgi().zziv().log("Service connect failed to get IMeasurementService");
                        if (zzfa == null) {
                        }
                    }
                    if (zzfa == null) {
                        this.zzarb = false;
                        try {
                            ConnectionTracker.getInstance().unbindService(this.zzaqv.getContext(), this.zzaqv.zzaqo);
                        } catch (IllegalArgumentException e2) {
                        }
                    } else {
                        this.zzaqv.zzgh().zzc(new zziz(this, zzfa));
                    }
                }
                this.zzaqv.zzgi().zziv().zzg("Got binder with a wrong descriptor", interfaceDescriptor);
                if (zzfa == null) {
                }
            } catch (RemoteException e3) {
            }
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zzaqv.zzgi().zzjb().log("Service disconnected");
        this.zzaqv.zzgh().zzc(new zzja(this, componentName));
    }

    @WorkerThread
    public final void zzc(Intent intent) {
        this.zzaqv.zzab();
        Context context = this.zzaqv.getContext();
        ConnectionTracker instance = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzarb) {
                this.zzaqv.zzgi().zzjc().log("Connection attempt already in progress");
                return;
            }
            this.zzaqv.zzgi().zzjc().log("Using local app measurement service");
            this.zzarb = true;
            instance.bindService(context, intent, this.zzaqv.zzaqo, 129);
        }
    }

    @WorkerThread
    public final void zzkt() {
        this.zzaqv.zzab();
        Context context = this.zzaqv.getContext();
        synchronized (this) {
            if (this.zzarb) {
                this.zzaqv.zzgi().zzjc().log("Connection attempt already in progress");
            } else if (this.zzarc != null) {
                this.zzaqv.zzgi().zzjc().log("Already awaiting connection attempt");
            } else {
                this.zzarc = new zzfh(context, Looper.getMainLooper(), this, this);
                this.zzaqv.zzgi().zzjc().log("Connecting to remote service");
                this.zzarb = true;
                this.zzarc.checkAvailabilityAndConnect();
            }
        }
    }
}
