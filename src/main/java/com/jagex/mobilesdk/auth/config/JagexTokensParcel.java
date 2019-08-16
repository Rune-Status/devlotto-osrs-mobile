package com.jagex.mobilesdk.auth.config;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;

public class JagexTokensParcel implements Parcelable {
    private static final String ACCESS_TOKEN = "accessToken";
    public static final Creator<JagexTokensParcel> CREATOR = new Creator<JagexTokensParcel>() {
        public JagexTokensParcel createFromParcel(Parcel parcel) {
            return new JagexTokensParcel(parcel);
        }

        public JagexTokensParcel[] newArray(int i) {
            return new JagexTokensParcel[i];
        }
    };
    private static final String EXPIRES_IN = "expiresIn";
    private static final String REFRESH_TOKEN = "refreshToken";
    private final String accessToken;
    private final long expiresIn;
    private final String refreshToken;

    protected JagexTokensParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.accessToken = readBundle.getString(ACCESS_TOKEN);
        this.refreshToken = readBundle.getString(REFRESH_TOKEN);
        this.expiresIn = readBundle.getLong(EXPIRES_IN);
    }

    public JagexTokensParcel(@NonNull String str, @NonNull String str2, @NonNull long j) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.expiresIn = j;
    }

    public int describeContents() {
        return 0;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public long getExpiresIn() {
        return this.expiresIn;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString(ACCESS_TOKEN, this.accessToken);
        bundle.putString(REFRESH_TOKEN, this.refreshToken);
        bundle.putLong(EXPIRES_IN, this.expiresIn);
        parcel.writeBundle(bundle);
    }
}
