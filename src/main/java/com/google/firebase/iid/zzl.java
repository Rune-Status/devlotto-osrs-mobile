package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;

public class zzl implements Parcelable {
    public static final Creator<zzl> CREATOR = new zzm();
    private Messenger zzal;
    private zzv zzam;

    public static final class zza extends ClassLoader {
        /* Access modifiers changed, original: protected|final */
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (FirebaseInstanceId.zzm()) {
                Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            }
            return zzl.class;
        }
    }

    public zzl(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.zzal = new Messenger(iBinder);
        } else {
            this.zzam = new zzw(iBinder);
        }
    }

    private final IBinder getBinder() {
        return this.zzal != null ? this.zzal.getBinder() : this.zzam.asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return z;
        }
        try {
            return getBinder().equals(((zzl) obj).getBinder());
        } catch (ClassCastException e) {
            return z;
        }
    }

    public int hashCode() {
        return getBinder().hashCode();
    }

    public final void send(Message message) throws RemoteException {
        if (this.zzal != null) {
            this.zzal.send(message);
        } else {
            this.zzam.send(message);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.zzal != null) {
            parcel.writeStrongBinder(this.zzal.getBinder());
        } else {
            parcel.writeStrongBinder(this.zzam.asBinder());
        }
    }
}
