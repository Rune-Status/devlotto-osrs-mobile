package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import java.util.List;

@Class(creator = "WakeLockEventCreator")
public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new zza();
    @Field(getter = "getTimeout", id = 16)
    private final long mTimeout;
    @Field(getter = "getTimeMillis", id = 2)
    private final long zzfo;
    @Field(getter = "getEventType", id = 11)
    private int zzfp;
    @Field(getter = "getWakeLockName", id = 4)
    private final String zzfq;
    @Field(getter = "getSecondaryWakeLockName", id = 10)
    private final String zzfr;
    @Field(getter = "getCodePackage", id = 17)
    private final String zzfs;
    @Field(getter = "getWakeLockType", id = 5)
    private final int zzft;
    @Field(getter = "getCallingPackages", id = 6)
    private final List<String> zzfu;
    @Field(getter = "getEventKey", id = 12)
    private final String zzfv;
    @Field(getter = "getElapsedRealtime", id = 8)
    private final long zzfw;
    @Field(getter = "getDeviceState", id = 14)
    private int zzfx;
    @Field(getter = "getHostPackage", id = 13)
    private final String zzfy;
    @Field(getter = "getBeginPowerPercentage", id = 15)
    private final float zzfz;
    @VersionField(id = 1)
    private final int zzg;
    private long zzga;

    @Constructor
    WakeLockEvent(@Param(id = 1) int i, @Param(id = 2) long j, @Param(id = 11) int i2, @Param(id = 4) String str, @Param(id = 5) int i3, @Param(id = 6) List<String> list, @Param(id = 12) String str2, @Param(id = 8) long j2, @Param(id = 14) int i4, @Param(id = 10) String str3, @Param(id = 13) String str4, @Param(id = 15) float f, @Param(id = 16) long j3, @Param(id = 17) String str5) {
        this.zzg = i;
        this.zzfo = j;
        this.zzfp = i2;
        this.zzfq = str;
        this.zzfr = str3;
        this.zzfs = str5;
        this.zzft = i3;
        this.zzga = -1;
        this.zzfu = list;
        this.zzfv = str2;
        this.zzfw = j2;
        this.zzfx = i4;
        this.zzfy = str4;
        this.zzfz = f;
        this.mTimeout = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5);
    }

    public final int getEventType() {
        return this.zzfp;
    }

    public final long getTimeMillis() {
        return this.zzfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzg);
        SafeParcelWriter.writeLong(parcel, 2, getTimeMillis());
        SafeParcelWriter.writeString(parcel, 4, this.zzfq, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzft);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzfu, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzfw);
        SafeParcelWriter.writeString(parcel, 10, this.zzfr, false);
        SafeParcelWriter.writeInt(parcel, 11, getEventType());
        SafeParcelWriter.writeString(parcel, 12, this.zzfv, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzfy, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzfx);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzfz);
        SafeParcelWriter.writeLong(parcel, 16, this.mTimeout);
        SafeParcelWriter.writeString(parcel, 17, this.zzfs, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zzu() {
        return this.zzga;
    }

    public final String zzv() {
        String str = this.zzfq;
        int i = this.zzft;
        Object join = this.zzfu == null ? "" : TextUtils.join(",", this.zzfu);
        int i2 = this.zzfx;
        Object obj = this.zzfr == null ? "" : this.zzfr;
        Object obj2 = this.zzfy == null ? "" : this.zzfy;
        float f = this.zzfz;
        Object obj3 = this.zzfs == null ? "" : this.zzfs;
        StringBuilder stringBuilder = new StringBuilder(((((String.valueOf(str).length() + 45) + String.valueOf(join).length()) + String.valueOf(obj).length()) + String.valueOf(obj2).length()) + String.valueOf(obj3).length());
        stringBuilder.append("\t");
        stringBuilder.append(str);
        stringBuilder.append("\t");
        stringBuilder.append(i);
        stringBuilder.append("\t");
        stringBuilder.append(join);
        stringBuilder.append("\t");
        stringBuilder.append(i2);
        stringBuilder.append("\t");
        stringBuilder.append(obj);
        stringBuilder.append("\t");
        stringBuilder.append(obj2);
        stringBuilder.append("\t");
        stringBuilder.append(f);
        stringBuilder.append("\t");
        stringBuilder.append(obj3);
        return stringBuilder.toString();
    }
}
