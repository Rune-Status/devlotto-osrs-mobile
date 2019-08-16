package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzef extends AbstractSafeParcelable {
    public static final Creator<zzef> CREATOR = new zzeg();
    @Field(id = 6)
    public boolean active;
    @Field(id = 5)
    public long creationTimestamp;
    @Field(id = 3)
    public String origin;
    @Field(id = 2)
    public String packageName;
    @Field(id = 11)
    public long timeToLive;
    @Field(id = 7)
    public String triggerEventName;
    @Field(id = 9)
    public long triggerTimeout;
    @Field(id = 4)
    public zzka zzage;
    @Field(id = 8)
    public zzex zzagf;
    @Field(id = 10)
    public zzex zzagg;
    @Field(id = 12)
    public zzex zzagh;

    zzef(zzef zzef) {
        Preconditions.checkNotNull(zzef);
        this.packageName = zzef.packageName;
        this.origin = zzef.origin;
        this.zzage = zzef.zzage;
        this.creationTimestamp = zzef.creationTimestamp;
        this.active = zzef.active;
        this.triggerEventName = zzef.triggerEventName;
        this.zzagf = zzef.zzagf;
        this.triggerTimeout = zzef.triggerTimeout;
        this.zzagg = zzef.zzagg;
        this.timeToLive = zzef.timeToLive;
        this.zzagh = zzef.zzagh;
    }

    @Constructor
    zzef(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) zzka zzka, @Param(id = 5) long j, @Param(id = 6) boolean z, @Param(id = 7) String str3, @Param(id = 8) zzex zzex, @Param(id = 9) long j2, @Param(id = 10) zzex zzex2, @Param(id = 11) long j3, @Param(id = 12) zzex zzex3) {
        this.packageName = str;
        this.origin = str2;
        this.zzage = zzka;
        this.creationTimestamp = j;
        this.active = z;
        this.triggerEventName = str3;
        this.zzagf = zzex;
        this.triggerTimeout = j2;
        this.zzagg = zzex2;
        this.timeToLive = j3;
        this.zzagh = zzex3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, this.origin, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzage, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.creationTimestamp);
        SafeParcelWriter.writeBoolean(parcel, 6, this.active);
        SafeParcelWriter.writeString(parcel, 7, this.triggerEventName, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzagf, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.triggerTimeout);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzagg, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.timeToLive);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzagh, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
