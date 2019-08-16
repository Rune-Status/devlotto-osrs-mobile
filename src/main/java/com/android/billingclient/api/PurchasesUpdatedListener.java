package com.android.billingclient.api;

import android.support.annotation.Nullable;
import java.util.List;

public interface PurchasesUpdatedListener {
    void onPurchasesUpdated(int i, @Nullable List<Purchase> list);
}
