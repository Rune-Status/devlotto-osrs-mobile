package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class SkuDetails {
    private final String mOriginalJson;
    private final JSONObject mParsedJson = new JSONObject(this.mOriginalJson);

    static class SkuDetailsResult {
        private int mResponseCode;
        private List<SkuDetails> mSkuDetailsList;

        SkuDetailsResult(int i, List<SkuDetails> list) {
            this.mSkuDetailsList = list;
            this.mResponseCode = i;
        }

        /* Access modifiers changed, original: 0000 */
        public int getResponseCode() {
            return this.mResponseCode;
        }

        /* Access modifiers changed, original: 0000 */
        public List<SkuDetails> getSkuDetailsList() {
            return this.mSkuDetailsList;
        }
    }

    public SkuDetails(String str) throws JSONException {
        this.mOriginalJson = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.mOriginalJson, ((SkuDetails) obj).mOriginalJson);
    }

    public String getDescription() {
        return this.mParsedJson.optString("description");
    }

    public String getFreeTrialPeriod() {
        return this.mParsedJson.optString("freeTrialPeriod");
    }

    public String getIntroductoryPrice() {
        return this.mParsedJson.optString("introductoryPrice");
    }

    public String getIntroductoryPriceAmountMicros() {
        return this.mParsedJson.optString("introductoryPriceAmountMicros");
    }

    public String getIntroductoryPriceCycles() {
        return this.mParsedJson.optString("introductoryPriceCycles");
    }

    public String getIntroductoryPricePeriod() {
        return this.mParsedJson.optString("introductoryPricePeriod");
    }

    public String getPrice() {
        return this.mParsedJson.optString(Param.PRICE);
    }

    public long getPriceAmountMicros() {
        return this.mParsedJson.optLong("price_amount_micros");
    }

    public String getPriceCurrencyCode() {
        return this.mParsedJson.optString("price_currency_code");
    }

    public String getSku() {
        return this.mParsedJson.optString("productId");
    }

    public String getSubscriptionPeriod() {
        return this.mParsedJson.optString("subscriptionPeriod");
    }

    public String getTitle() {
        return this.mParsedJson.optString("title");
    }

    public String getType() {
        return this.mParsedJson.optString(AppMeasurement.Param.TYPE);
    }

    public int hashCode() {
        return this.mOriginalJson.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SkuDetails: ");
        stringBuilder.append(this.mOriginalJson);
        return stringBuilder.toString();
    }
}
