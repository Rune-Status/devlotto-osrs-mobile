package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zah extends zaa implements ISignInButtonCreator {
    zah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper newSignInButton(IObjectWrapper iObjectWrapper, int i, int i2) throws RemoteException {
        Parcel zaa = zaa();
        zac.zaa(zaa, (IInterface) iObjectWrapper);
        zaa.writeInt(i);
        zaa.writeInt(i2);
        zaa = zaa(1, zaa);
        IObjectWrapper asInterface = Stub.asInterface(zaa.readStrongBinder());
        zaa.recycle();
        return asInterface;
    }

    public final IObjectWrapper newSignInButtonFromConfig(IObjectWrapper iObjectWrapper, SignInButtonConfig signInButtonConfig) throws RemoteException {
        Parcel zaa = zaa();
        zac.zaa(zaa, (IInterface) iObjectWrapper);
        zac.zaa(zaa, (Parcelable) signInButtonConfig);
        zaa = zaa(2, zaa);
        IObjectWrapper asInterface = Stub.asInterface(zaa.readStrongBinder());
        zaa.recycle();
        return asInterface;
    }
}
