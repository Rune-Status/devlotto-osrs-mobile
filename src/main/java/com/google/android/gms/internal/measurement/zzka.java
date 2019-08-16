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

@Class(creator = "UserAttributeParcelCreator")
public final class zzka extends AbstractSafeParcelable {
    public static final Creator<zzka> CREATOR = new zzkb();
    @Field(id = 2)
    public final String name;
    @Field(id = 7)
    public final String origin;
    @Field(id = 1)
    private final int versionCode;
    @Field(id = 6)
    private final String zzale;
    @Field(id = 3)
    public final long zzast;
    @Field(id = 4)
    private final Long zzasu;
    @Field(id = 5)
    private final Float zzasv;
    @Field(id = 8)
    private final Double zzasw;

    @Constructor
    zzka(@Param(id = 1) int i, @Param(id = 2) String str, @Param(id = 3) long j, @Param(id = 4) Long l, @Param(id = 5) Float f, @Param(id = 6) String str2, @Param(id = 7) String str3, @Param(id = 8) Double d) {
        Double d2 = null;
        this.versionCode = i;
        this.name = str;
        this.zzast = j;
        this.zzasu = l;
        this.zzasv = null;
        if (i == 1) {
            if (f != null) {
                d2 = Double.valueOf(f.doubleValue());
            }
            this.zzasw = d2;
        } else {
            this.zzasw = d;
        }
        this.zzale = str2;
        this.origin = str3;
    }

    zzka(zzkc zzkc) {
        this(zzkc.name, zzkc.zzast, zzkc.value, zzkc.origin);
    }

    zzka(String str, long j, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.versionCode = 2;
        this.name = str;
        this.zzast = j;
        this.origin = str2;
        if (obj == null) {
            this.zzasu = null;
            this.zzasv = null;
            this.zzasw = null;
            this.zzale = null;
        } else if (obj instanceof Long) {
            this.zzasu = (Long) obj;
            this.zzasv = null;
            this.zzasw = null;
            this.zzale = null;
        } else if (obj instanceof String) {
            this.zzasu = null;
            this.zzasv = null;
            this.zzasw = null;
            this.zzale = (String) obj;
        } else if (obj instanceof Double) {
            this.zzasu = null;
            this.zzasv = null;
            this.zzasw = (Double) obj;
            this.zzale = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public final Object getValue() {
        return this.zzasu != null ? this.zzasu : this.zzasw != null ? this.zzasw : this.zzale != null ? this.zzale : null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzast);
        SafeParcelWriter.writeLongObject(parcel, 4, this.zzasu, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzale, false);
        SafeParcelWriter.writeString(parcel, 7, this.origin, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.zzasw, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
