package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzo implements zzas {
    private final FirebaseInstanceId zzay;
    private final String zzaz;
    private final String zzba;
    private final String zzbb;
    private final String zzbc;

    zzo(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3, String str4) {
        this.zzay = firebaseInstanceId;
        this.zzaz = str;
        this.zzba = str2;
        this.zzbb = str3;
        this.zzbc = str4;
    }

    public final Task zzs() {
        return this.zzay.zza(this.zzaz, this.zzba, this.zzbb, this.zzbc);
    }
}
