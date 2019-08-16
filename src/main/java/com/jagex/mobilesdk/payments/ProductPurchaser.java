package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.payments.MobilePaymentService.PendingPurchaseUpdate;
import com.jagex.mobilesdk.payments.MobilePaymentService.PendingTransactionUpdate;
import com.jagex.mobilesdk.payments.PackageListViewController.PackageListViewListener;
import com.jagex.mobilesdk.payments.model.JagexPackage;
import com.jagex.mobilesdk.payments.model.JagexProducts;
import java.util.ArrayList;
import java.util.List;

public class ProductPurchaser implements PackageListViewListener, PendingTransactionUpdate {
    private final Activity activity;
    private final PackageListViewController controller;
    private List<JagexProducts> products = new ArrayList();
    private final PendingPurchaseUpdate updater;
    private boolean updaterAdvised;

    public ProductPurchaser(@NonNull Activity activity, @NonNull JagexConfig jagexConfig, @NonNull PendingPurchaseUpdate pendingPurchaseUpdate) {
        this.updater = pendingPurchaseUpdate;
        this.activity = activity;
        this.controller = new PackageListViewController(this, activity, jagexConfig);
    }

    public void adviseFailure() {
        if (!this.updaterAdvised) {
            this.updaterAdvised = true;
            this.updater.purchaseFailed();
        }
    }

    public void adviseSuccess() {
        if (!this.updaterAdvised) {
            this.updaterAdvised = true;
            this.updater.purchaseComplete();
        }
    }

    public void applyComplete() {
        adviseSuccess();
    }

    public void applyFailed() {
        adviseFailure();
    }

    public void billingInitialiseAttempt(int i) {
        if (i != 0) {
            adviseFailure();
        } else {
            this.activity.runOnUiThread(new Runnable() {
                public void run() {
                    ProductPurchaser.this.controller.checkNetwork();
                }
            });
        }
    }

    public void onCategoriesLoaded(List<JagexPackage> list) {
        this.products = new ArrayList();
        for (JagexPackage products : list) {
            for (JagexProducts add : products.getProducts()) {
                this.products.add(add);
            }
        }
        this.updater.purchaserReady(this.products.isEmpty() ^ 1);
    }

    public void onDisplayMessage(int i) {
    }

    public void onInternetStateChanged(boolean z) {
    }

    public void onPendingPurchasesAvailable() {
    }

    public void onShopLoaded(String str, String str2) {
    }

    public void onSuccessfulConsumption() {
        adviseSuccess();
    }

    public void purchaseItem(String str) {
        SkuDetails skuItem;
        this.updaterAdvised = false;
        for (JagexProducts jagexProducts : this.products) {
            if (str.equals(jagexProducts.getProductId())) {
                skuItem = jagexProducts.getSkuItem();
                break;
            }
        }
        skuItem = null;
        if (skuItem != null) {
            this.controller.buyProduct(skuItem, this);
        } else {
            adviseFailure();
        }
    }

    public void returnToGame() {
        adviseFailure();
    }

    public void transactionsAvailable(boolean z) {
    }
}
