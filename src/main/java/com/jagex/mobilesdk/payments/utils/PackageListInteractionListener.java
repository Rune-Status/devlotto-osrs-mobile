package com.jagex.mobilesdk.payments.utils;

import com.android.billingclient.api.SkuDetails;

public interface PackageListInteractionListener {
    void finish();

    void onCollapsePackages();

    void onPackageExpanded();

    void onShopLoaded(String str, String str2);

    void onShowHideMoreProducts(boolean z, int i);

    void purchaseProduct(SkuDetails skuDetails);

    void setPackageExpandCollapseDetails(boolean z, int i);
}
