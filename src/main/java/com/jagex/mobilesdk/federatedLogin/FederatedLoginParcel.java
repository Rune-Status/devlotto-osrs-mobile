package com.jagex.mobilesdk.federatedLogin;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;

public class FederatedLoginParcel implements Parcelable {
    public static final Creator<FederatedLoginParcel> CREATOR = new Creator<FederatedLoginParcel>() {
        public FederatedLoginParcel createFromParcel(Parcel parcel) {
            return new FederatedLoginParcel(parcel);
        }

        public FederatedLoginParcel[] newArray(int i) {
            return new FederatedLoginParcel[i];
        }
    };
    private static final String GOOGLE_CLIENT_ID_KEY = "googleClientId";
    private static final String ISSUER_URL_KEY = "issuerURL";
    private static final String PACKAGE_ID_KEY = "packageId";
    private final String googleClientId;
    private final String issuerURL;
    private final String packageId;

    protected FederatedLoginParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.packageId = readBundle.getString(PACKAGE_ID_KEY);
        this.googleClientId = readBundle.getString(GOOGLE_CLIENT_ID_KEY);
        this.issuerURL = readBundle.getString(ISSUER_URL_KEY);
    }

    public FederatedLoginParcel(@NonNull String str, @NonNull String str2, @NonNull Uri uri) {
        this.packageId = str;
        this.googleClientId = str2;
        this.issuerURL = uri.toString();
    }

    public int describeContents() {
        return 0;
    }

    public String getGoogleClientId() {
        return this.googleClientId;
    }

    public String getIssuerURL() {
        return this.issuerURL;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString(PACKAGE_ID_KEY, this.packageId);
        bundle.putString(GOOGLE_CLIENT_ID_KEY, this.googleClientId);
        bundle.putString(ISSUER_URL_KEY, this.issuerURL);
        parcel.writeBundle(bundle);
    }
}
