package com.jagex.mobilesdk.auth.config;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import java.util.Objects;

public class JagexConfigParcel implements Parcelable {
    private static final String CLIENT_ID = "clientId";
    private static final String CLIENT_SECRET = "clientSecret";
    public static final Creator<JagexConfigParcel> CREATOR = new Creator<JagexConfigParcel>() {
        public JagexConfigParcel createFromParcel(Parcel parcel) {
            return new JagexConfigParcel(parcel);
        }

        public JagexConfigParcel[] newArray(int i) {
            return new JagexConfigParcel[i];
        }
    };
    private static final String ISSUER_URI = "issuerUri";
    private static final String PAYMENT_URI = "paymentUri";
    private static final String REDIRECT_URI = "redirectUri";
    private static final String SCOPE = "scope";
    private static final String SHOP_NAME = "shopName";
    private final JagexConfig config;

    protected JagexConfigParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.config = new BasicJagexConfig(readBundle.getString(CLIENT_ID), readBundle.getString(CLIENT_SECRET), readBundle.getString("scope"), Uri.parse(readBundle.getString(REDIRECT_URI)), Uri.parse(readBundle.getString(ISSUER_URI)), readBundle.getString(SHOP_NAME), readBundle.getString(PAYMENT_URI));
    }

    public JagexConfigParcel(@NonNull JagexConfig jagexConfig) {
        this.config = (JagexConfig) Objects.requireNonNull(jagexConfig);
    }

    public int describeContents() {
        return 0;
    }

    public JagexConfig getConfig() {
        return this.config;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString(CLIENT_ID, this.config.getClientId());
        bundle.putString(CLIENT_SECRET, this.config.getClientSecret());
        bundle.putString("scope", this.config.getScope());
        bundle.putString(ISSUER_URI, this.config.getIssuerUri().toString());
        bundle.putString(REDIRECT_URI, this.config.getRedirectUri().toString());
        bundle.putString(SHOP_NAME, this.config.getShopName());
        bundle.putString(PAYMENT_URI, this.config.getPaymentUri());
        parcel.writeBundle(bundle);
    }
}
