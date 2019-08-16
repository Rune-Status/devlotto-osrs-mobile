package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzj implements Creator<HintRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String str = null;
        String str2 = null;
        String[] strArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.createParcelable(parcel, readHeader, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 3:
                        z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 4:
                        strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                        break;
                    case 5:
                        z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 6:
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 7:
                        str = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                        break;
                }
            }
            i = SafeParcelReader.readInt(parcel, readHeader);
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
