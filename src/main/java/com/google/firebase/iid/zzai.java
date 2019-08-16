package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

final class zzai {
    private final Messenger zzal;
    private final zzl zzci;

    zzai(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.zzal = new Messenger(iBinder);
            this.zzci = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.zzci = new zzl(iBinder);
            this.zzal = null;
        } else {
            interfaceDescriptor = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", interfaceDescriptor.length() != 0 ? "Invalid interface descriptor: ".concat(interfaceDescriptor) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* Access modifiers changed, original: final */
    public final void send(Message message) throws RemoteException {
        if (this.zzal != null) {
            this.zzal.send(message);
        } else if (this.zzci != null) {
            this.zzci.send(message);
        } else {
            throw new IllegalStateException("Both messengers are null");
        }
    }
}
