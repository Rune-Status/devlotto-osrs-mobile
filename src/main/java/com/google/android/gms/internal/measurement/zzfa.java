package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

public interface zzfa extends IInterface {
    List<zzka> zza(zzeb zzeb, boolean z) throws RemoteException;

    List<zzef> zza(String str, String str2, zzeb zzeb) throws RemoteException;

    List<zzka> zza(String str, String str2, String str3, boolean z) throws RemoteException;

    List<zzka> zza(String str, String str2, boolean z, zzeb zzeb) throws RemoteException;

    void zza(long j, String str, String str2, String str3) throws RemoteException;

    void zza(zzeb zzeb) throws RemoteException;

    void zza(zzef zzef, zzeb zzeb) throws RemoteException;

    void zza(zzex zzex, zzeb zzeb) throws RemoteException;

    void zza(zzex zzex, String str, String str2) throws RemoteException;

    void zza(zzka zzka, zzeb zzeb) throws RemoteException;

    byte[] zza(zzex zzex, String str) throws RemoteException;

    void zzb(zzeb zzeb) throws RemoteException;

    void zzb(zzef zzef) throws RemoteException;

    String zzc(zzeb zzeb) throws RemoteException;

    void zzd(zzeb zzeb) throws RemoteException;

    List<zzef> zze(String str, String str2, String str3) throws RemoteException;
}
