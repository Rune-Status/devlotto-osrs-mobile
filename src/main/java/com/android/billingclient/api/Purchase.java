package com.android.billingclient.api;

import android.text.TextUtils;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class Purchase {
    private final String mOriginalJson;
    private final JSONObject mParsedJson = new JSONObject(this.mOriginalJson);
    private final String mSignature;

    public static class PurchasesResult {
        private List<Purchase> mPurchaseList;
        private int mResponseCode;

        PurchasesResult(int i, List<Purchase> list) {
            this.mPurchaseList = list;
            this.mResponseCode = i;
        }

        public List<Purchase> getPurchasesList() {
            return this.mPurchaseList;
        }

        public int getResponseCode() {
            return this.mResponseCode;
        }
    }

    public Purchase(String str, String str2) throws JSONException {
        this.mOriginalJson = str;
        this.mSignature = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.mOriginalJson, purchase.getOriginalJson()) && TextUtils.equals(this.mSignature, purchase.getSignature());
    }

    public String getOrderId() {
        return this.mParsedJson.optString("orderId");
    }

    public String getOriginalJson() {
        return this.mOriginalJson;
    }

    public String getPackageName() {
        return this.mParsedJson.optString("packageName");
    }

    public long getPurchaseTime() {
        return this.mParsedJson.optLong("purchaseTime");
    }

    public String getPurchaseToken() {
        return this.mParsedJson.optString(CommsUtils.HTTP_PARAM_TOKEN, this.mParsedJson.optString("purchaseToken"));
    }

    public String getSignature() {
        return this.mSignature;
    }

    public String getSku() {
        return this.mParsedJson.optString("productId");
    }

    public int hashCode() {
        return this.mOriginalJson.hashCode();
    }

    public boolean isAutoRenewing() {
        return this.mParsedJson.optBoolean("autoRenewing");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Purchase. Json: ");
        stringBuilder.append(this.mOriginalJson);
        return stringBuilder.toString();
    }
}
