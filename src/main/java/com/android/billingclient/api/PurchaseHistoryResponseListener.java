package com.android.billingclient.api;

import java.util.List;

public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryResponse(int i, List<Purchase> list);
}
