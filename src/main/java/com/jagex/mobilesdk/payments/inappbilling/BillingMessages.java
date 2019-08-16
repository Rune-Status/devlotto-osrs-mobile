package com.jagex.mobilesdk.payments.inappbilling;

import com.jagex.mobilesdk.R;

public class BillingMessages {
    public static int getErrorMessage(int i) {
        switch (i) {
            case -2:
                return R.string.FEATURE_NOT_SUPPORTED;
            case -1:
                return R.string.SERVICE_DISCONNECTED;
            case 1:
                return R.string.USER_CANCELED;
            case 2:
                return R.string.SERVICE_UNAVAILABLE;
            case 3:
                return R.string.BILLING_UNAVAILABLE;
            case 4:
                return R.string.ITEM_UNAVAILABLE;
            case 5:
                return R.string.DEVELOPER_ERROR;
            case 6:
                return R.string.ERROR;
            case 7:
                return R.string.ITEM_ALREADY_OWNED;
            case 8:
                return R.string.ITEM_NOT_OWNED;
            default:
                return R.string.ERROR;
        }
    }
}
