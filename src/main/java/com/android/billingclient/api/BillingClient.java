package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.android.billingclient.api.Purchase.PurchasesResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponse {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    public static final class Builder {
        private final Context mContext;
        private PurchasesUpdatedListener mListener;

        private Builder(Context context) {
            this.mContext = context;
        }

        @UiThread
        public BillingClient build() {
            if (this.mContext == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.mListener != null) {
                return new BillingClientImpl(this.mContext, this.mListener);
            } else {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
        }

        @UiThread
        public Builder setListener(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.mListener = purchasesUpdatedListener;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {
        public static final String IN_APP_ITEMS_ON_VR = "inAppItemsOnVr";
        public static final String SUBSCRIPTIONS = "subscriptions";
        public static final String SUBSCRIPTIONS_ON_VR = "subscriptionsOnVr";
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SkuType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    @UiThread
    public static Builder newBuilder(@NonNull Context context) {
        return new Builder(context);
    }

    @UiThread
    public abstract void consumeAsync(String str, ConsumeResponseListener consumeResponseListener);

    @UiThread
    public abstract void endConnection();

    @UiThread
    public abstract int isFeatureSupported(String str);

    @UiThread
    public abstract boolean isReady();

    @UiThread
    public abstract int launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams);

    @UiThread
    public abstract void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @UiThread
    public abstract PurchasesResult queryPurchases(String str);

    @UiThread
    public abstract void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener);

    @UiThread
    public abstract void startConnection(@NonNull BillingClientStateListener billingClientStateListener);
}
