package com.jagex.mobilesdk.payments.model;

import com.android.billingclient.api.SkuDetails;

public class JagexProducts {
    private boolean available;
    private String productId;
    private boolean recommended;
    private SkuDetails skuItem;
    private String subtitle;
    private String title;

    public String getProductId() {
        return this.productId;
    }

    public SkuDetails getSkuItem() {
        return this.skuItem;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public boolean isRecommended() {
        return this.recommended;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setRecommended(boolean z) {
        this.recommended = z;
    }

    public void setSkuItem(SkuDetails skuDetails) {
        this.skuItem = skuDetails;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
