package com.google.android.gms.internal.auth-api;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public interface zzw extends IInterface {
    void zzc(zzu zzu) throws RemoteException;

    void zzc(zzu zzu, CredentialRequest credentialRequest) throws RemoteException;

    void zzc(zzu zzu, zzs zzs) throws RemoteException;

    void zzc(zzu zzu, zzy zzy) throws RemoteException;
}
