package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor.Stub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@KeepForSdk
@Class(creator = "GetServiceRequestCreator")
@Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Creator<GetServiceRequest> CREATOR = new zzd();
    @VersionField(id = 1)
    private final int version;
    @Field(id = 2)
    private final int zzdf;
    @Field(id = 3)
    private int zzdg;
    @Field(id = 4)
    String zzdh;
    @Field(id = 5)
    IBinder zzdi;
    @Field(id = 6)
    Scope[] zzdj;
    @Field(id = 7)
    Bundle zzdk;
    @Field(id = 8)
    Account zzdl;
    @Field(id = 10)
    Feature[] zzdm;
    @Field(id = 11)
    Feature[] zzdn;
    @Field(id = 12)
    private boolean zzdo;

    public GetServiceRequest(int i) {
        this.version = 4;
        this.zzdg = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzdf = i;
        this.zzdo = true;
    }

    @Constructor
    GetServiceRequest(@Param(id = 1) int i, @Param(id = 2) int i2, @Param(id = 3) int i3, @Param(id = 4) String str, @Param(id = 5) IBinder iBinder, @Param(id = 6) Scope[] scopeArr, @Param(id = 7) Bundle bundle, @Param(id = 8) Account account, @Param(id = 10) Feature[] featureArr, @Param(id = 11) Feature[] featureArr2, @Param(id = 12) boolean z) {
        this.version = i;
        this.zzdf = i2;
        this.zzdg = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzdh = "com.google.android.gms";
        } else {
            this.zzdh = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = AccountAccessor.getAccountBinderSafe(Stub.asInterface(iBinder));
            }
            this.zzdl = account2;
        } else {
            this.zzdi = iBinder;
            this.zzdl = account;
        }
        this.zzdj = scopeArr;
        this.zzdk = bundle;
        this.zzdm = featureArr;
        this.zzdn = featureArr2;
        this.zzdo = z;
    }

    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzdk;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.version);
        SafeParcelWriter.writeInt(parcel, 2, this.zzdf);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdg);
        SafeParcelWriter.writeString(parcel, 4, this.zzdh, false);
        SafeParcelWriter.writeIBinder(parcel, 5, this.zzdi, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zzdj, i, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzdk, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzdl, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 10, this.zzdm, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, this.zzdn, i, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzdo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
