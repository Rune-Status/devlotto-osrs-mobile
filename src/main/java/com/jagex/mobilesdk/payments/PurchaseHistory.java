package com.jagex.mobilesdk.payments;

import android.app.Activity;
import com.android.billingclient.api.BillingClient.SkuType;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler.BillingWrapperListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler.FetchProductsListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler.PurchaseHistoryListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PurchaseHistory implements BillingWrapperListener {
    private final Activity activity;
    private BillingHandler billingHandler;
    private Listener listener;
    private final ArrayList<Purchase> purchaseHistory = new ArrayList();
    private final ArrayList<SkuDetails> skuDetails = new ArrayList();
    private Status status = Status.NOT_STARTED;

    public interface Listener {
        void purchaseHistoryQueryCompleted(boolean z);
    }

    private enum Status {
        NOT_STARTED,
        IN_PROGRESS,
        COMPLETED_SUCCESS,
        COMPLETED_ERROR
    }

    public PurchaseHistory(Activity activity) {
        this.activity = activity;
    }

    private void completeQuery(Status status) {
        this.status = status;
        if (this.listener != null) {
            this.listener.purchaseHistoryQueryCompleted(status == Status.COMPLETED_SUCCESS);
        }
    }

    private void queryPurchaseHistory() {
        this.activity.runOnUiThread(new Runnable() {
            public void run() {
                PurchaseHistory.this.billingHandler.queryPurchaseHistory(SkuType.SUBS, new PurchaseHistoryListener() {
                    public void purchaseHistory(boolean z, List<Purchase> list) {
                        if (z) {
                            PurchaseHistory.this.purchaseHistory.addAll(list);
                            PurchaseHistory.this.billingHandler.queryPurchaseHistory(SkuType.INAPP, new PurchaseHistoryListener() {
                                public void purchaseHistory(boolean z, List<Purchase> list) {
                                    if (z) {
                                        PurchaseHistory.this.purchaseHistory.addAll(list);
                                        PurchaseHistory.this.querySkuDetails();
                                        return;
                                    }
                                    PurchaseHistory.this.completeQuery(Status.COMPLETED_ERROR);
                                }
                            });
                            return;
                        }
                        PurchaseHistory.this.completeQuery(Status.COMPLETED_ERROR);
                    }
                });
            }
        });
    }

    private void querySkuDetails() {
        if (this.status == Status.IN_PROGRESS) {
            if (this.purchaseHistory.isEmpty()) {
                completeQuery(Status.COMPLETED_SUCCESS);
                return;
            }
            ArrayList arrayList = new ArrayList(this.purchaseHistory.size());
            Iterator it = this.purchaseHistory.iterator();
            while (it.hasNext()) {
                arrayList.add(((Purchase) it.next()).getSku());
            }
            this.billingHandler.fetchAllProducts(arrayList, new FetchProductsListener() {
                public void products(boolean z, List<SkuDetails> list) {
                    if (z) {
                        PurchaseHistory.this.skuDetails.addAll(list);
                        PurchaseHistory.this.completeQuery(Status.COMPLETED_SUCCESS);
                        return;
                    }
                    PurchaseHistory.this.completeQuery(Status.COMPLETED_ERROR);
                }
            });
        }
    }

    public void beginPurchaseHistoryQuery(Listener listener) {
        synchronized (this) {
            if (this.status == Status.IN_PROGRESS) {
                return;
            }
            this.status = Status.IN_PROGRESS;
            this.listener = listener;
            this.purchaseHistory.clear();
            this.skuDetails.clear();
            this.activity.runOnUiThread(new Runnable() {
                public void run() {
                    if (PurchaseHistory.this.billingHandler == null) {
                        PurchaseHistory.this.billingHandler = new BillingHandler(PurchaseHistory.this.activity, PurchaseHistory.this);
                    }
                }
            });
        }
    }

    public boolean eligibleForIntroductoryPrice() {
        if (this.status != Status.COMPLETED_SUCCESS) {
            return false;
        }
        Iterator it = this.skuDetails.iterator();
        while (it.hasNext()) {
            if (!((SkuDetails) it.next()).getIntroductoryPrice().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean eligibleForTrialPurchase() {
        if (this.status != Status.COMPLETED_SUCCESS) {
            return false;
        }
        Iterator it = this.skuDetails.iterator();
        while (it.hasNext()) {
            if (!((SkuDetails) it.next()).getFreeTrialPeriod().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public List<SkuDetails> getSkuDetails() {
        return this.skuDetails;
    }

    public void onBillingManagerInitializeAttempt(int i) {
        if (i == 0) {
            queryPurchaseHistory();
        } else {
            completeQuery(Status.COMPLETED_ERROR);
        }
    }

    public void onDisplayMessage(int i) {
    }

    public void onPurchaseConsumed(String str) {
    }

    public boolean purchaseHistoryQueryCompleted() {
        return this.status == Status.COMPLETED_SUCCESS || this.status == Status.COMPLETED_ERROR;
    }
}
