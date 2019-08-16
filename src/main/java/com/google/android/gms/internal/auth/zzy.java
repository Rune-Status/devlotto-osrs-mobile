package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public abstract class zzy extends zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzb((Status) zzc.zza(parcel, Status.CREATOR));
                break;
            case 2:
                zza((Status) zzc.zza(parcel, Status.CREATOR), (zzt) zzc.zza(parcel, zzt.CREATOR));
                break;
            case 3:
                zza((Status) zzc.zza(parcel, Status.CREATOR), (zzl) zzc.zza(parcel, zzl.CREATOR));
                break;
            case 4:
                zzd();
                break;
            case 5:
                onFailure((Status) zzc.zza(parcel, Status.CREATOR));
                break;
            case 6:
                zza(parcel.createByteArray());
                break;
            case 7:
                zza((DeviceMetaData) zzc.zza(parcel, DeviceMetaData.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
