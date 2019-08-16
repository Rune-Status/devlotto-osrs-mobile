package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzeg implements Creator<zzef> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        String str = null;
        zzex zzex = null;
        zzex zzex2 = null;
        zzex zzex3 = null;
        String str2 = null;
        zzka zzka = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzka = (zzka) SafeParcelReader.createParcelable(parcel, readHeader, zzka.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    zzex3 = (zzex) SafeParcelReader.createParcelable(parcel, readHeader, zzex.CREATOR);
                    break;
                case 9:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 10:
                    zzex2 = (zzex) SafeParcelReader.createParcelable(parcel, readHeader, zzex.CREATOR);
                    break;
                case 11:
                    j2 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    zzex = (zzex) SafeParcelReader.createParcelable(parcel, readHeader, zzex.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzef(str, str3, zzka, j, z, str2, zzex3, j3, zzex2, j2, zzex);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzef[i];
    }
}
