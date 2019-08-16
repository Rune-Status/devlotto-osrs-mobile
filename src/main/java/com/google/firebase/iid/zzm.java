package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzm implements Creator<zzl> {
    zzm() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        return readStrongBinder != null ? new zzl(readStrongBinder) : null;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
