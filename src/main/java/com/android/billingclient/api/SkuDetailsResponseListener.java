package com.android.billingclient.api;

import java.util.List;

public interface SkuDetailsResponseListener {
    void onSkuDetailsResponse(int i, List<SkuDetails> list);
}
