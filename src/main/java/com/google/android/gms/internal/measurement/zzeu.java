package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Iterator;

@Class(creator = "EventParamsCreator")
@Reserved({1})
public final class zzeu extends AbstractSafeParcelable implements Iterable<String> {
    public static final Creator<zzeu> CREATOR = new zzew();
    @Field(getter = "z", id = 2)
    private final Bundle zzaho;

    @Constructor
    zzeu(@Param(id = 2) Bundle bundle) {
        this.zzaho = bundle;
    }

    /* Access modifiers changed, original: final */
    public final Object get(String str) {
        return this.zzaho.get(str);
    }

    /* Access modifiers changed, original: final */
    public final Long getLong(String str) {
        return Long.valueOf(this.zzaho.getLong(str));
    }

    /* Access modifiers changed, original: final */
    public final String getString(String str) {
        return this.zzaho.getString(str);
    }

    public final Iterator<String> iterator() {
        return new zzev(this);
    }

    public final int size() {
        return this.zzaho.size();
    }

    public final String toString() {
        return this.zzaho.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzin(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* Access modifiers changed, original: final */
    public final Double zzbk(String str) {
        return Double.valueOf(this.zzaho.getDouble(str));
    }

    public final Bundle zzin() {
        return new Bundle(this.zzaho);
    }
}
