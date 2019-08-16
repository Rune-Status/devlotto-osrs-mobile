package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public abstract class zzfb extends zzo implements zzfa {
    public zzfb() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:3:0x0010, code skipped:
            r10.writeNoException();
     */
    /* JADX WARNING: Missing block: B:6:0x0025, code skipped:
            r10.writeNoException();
            r10.writeTypedList(r0);
     */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        List zza;
        switch (i) {
            case 1:
                zza((zzex) zzp.zza(parcel, zzex.CREATOR), (zzeb) zzp.zza(parcel, zzeb.CREATOR));
                break;
            case 2:
                zza((zzka) zzp.zza(parcel, zzka.CREATOR), (zzeb) zzp.zza(parcel, zzeb.CREATOR));
                break;
            case 4:
                zza((zzeb) zzp.zza(parcel, zzeb.CREATOR));
                break;
            case 5:
                zza((zzex) zzp.zza(parcel, zzex.CREATOR), parcel.readString(), parcel.readString());
                break;
            case 6:
                zzb((zzeb) zzp.zza(parcel, zzeb.CREATOR));
                break;
            case 7:
                zza = zza((zzeb) zzp.zza(parcel, zzeb.CREATOR), zzp.zza(parcel));
                break;
            case 9:
                byte[] zza2 = zza((zzex) zzp.zza(parcel, zzex.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(zza2);
                break;
            case 10:
                zza(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                break;
            case 11:
                String zzc = zzc((zzeb) zzp.zza(parcel, zzeb.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(zzc);
                break;
            case 12:
                zza((zzef) zzp.zza(parcel, zzef.CREATOR), (zzeb) zzp.zza(parcel, zzeb.CREATOR));
                break;
            case 13:
                zzb((zzef) zzp.zza(parcel, zzef.CREATOR));
                break;
            case 14:
                zza = zza(parcel.readString(), parcel.readString(), zzp.zza(parcel), (zzeb) zzp.zza(parcel, zzeb.CREATOR));
                break;
            case 15:
                zza = zza(parcel.readString(), parcel.readString(), parcel.readString(), zzp.zza(parcel));
                break;
            case 16:
                zza = zza(parcel.readString(), parcel.readString(), (zzeb) zzp.zza(parcel, zzeb.CREATOR));
                break;
            case 17:
                zza = zze(parcel.readString(), parcel.readString(), parcel.readString());
                break;
            case 18:
                zzd((zzeb) zzp.zza(parcel, zzeb.CREATOR));
                break;
            default:
                return false;
        }
    }
}
