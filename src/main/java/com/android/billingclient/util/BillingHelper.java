package com.android.billingclient.util;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public final class BillingHelper {
    public static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    public static int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    public static final String RESPONSE_BUY_INTENT = "BUY_INTENT";
    public static final String RESPONSE_CODE = "RESPONSE_CODE";
    public static final String RESPONSE_GET_SKU_DETAILS_LIST = "DETAILS_LIST";
    public static final String RESPONSE_INAPP_ITEM_LIST = "INAPP_PURCHASE_ITEM_LIST";
    private static final String RESPONSE_INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
    public static final String RESPONSE_INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    private static final String RESPONSE_INAPP_SIGNATURE = "INAPP_DATA_SIGNATURE";
    public static final String RESPONSE_INAPP_SIGNATURE_LIST = "INAPP_DATA_SIGNATURE_LIST";
    private static final String TAG = "BillingHelper";

    private static Purchase extractPurchase(String str, String str2) {
        if (str == null || str2 == null) {
            logWarn(TAG, "Received a bad purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got JSONException while parsing purchase data: ");
            stringBuilder.append(e);
            logWarn(TAG, stringBuilder.toString());
            return null;
        }
    }

    public static List<Purchase> extractPurchases(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList stringArrayList = bundle.getStringArrayList(RESPONSE_INAPP_PURCHASE_DATA_LIST);
        ArrayList stringArrayList2 = bundle.getStringArrayList(RESPONSE_INAPP_SIGNATURE_LIST);
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= stringArrayList.size() || i2 >= stringArrayList2.size()) {
                    break;
                }
                Purchase extractPurchase = extractPurchase((String) stringArrayList.get(i2), (String) stringArrayList2.get(i2));
                if (extractPurchase != null) {
                    arrayList.add(extractPurchase);
                }
                i = i2 + 1;
            }
        } else {
            logWarn(TAG, "Couldn't find purchase lists, trying to find single data.");
            Purchase extractPurchase2 = extractPurchase(bundle.getString(RESPONSE_INAPP_PURCHASE_DATA), bundle.getString(RESPONSE_INAPP_SIGNATURE));
            if (extractPurchase2 == null) {
                logWarn(TAG, "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(extractPurchase2);
        }
        return arrayList;
    }

    public static int getResponseCodeFromBundle(Bundle bundle, String str) {
        if (bundle == null) {
            logWarn(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get(RESPONSE_CODE);
        if (obj == null) {
            logVerbose(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected type for bundle response code: ");
            stringBuilder.append(obj.getClass().getName());
            logWarn(str, stringBuilder.toString());
            return 6;
        }
    }

    public static int getResponseCodeFromIntent(Intent intent, String str) {
        if (intent != null) {
            return getResponseCodeFromBundle(intent.getExtras(), str);
        }
        logWarn(TAG, "Got null intent!");
        return 6;
    }

    public static void logVerbose(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void logWarn(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }
}
