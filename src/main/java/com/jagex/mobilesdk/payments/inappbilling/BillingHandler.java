package com.jagex.mobilesdk.payments.inappbilling;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClient.SkuType;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.Purchase.PurchasesResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsParams.Builder;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BillingHandler implements PurchasesUpdatedListener {
    private Activity mActivity;
    private BillingClient mBillingClient;
    private boolean mIsServiceConnected = false;
    private final float priceDivisor = 1000000.0f;
    private PurchaseProductListener purchaseListener;
    private SkuDetails purchasedSKU;
    private BillingWrapperListener wrapperListener;

    public interface FetchProductsListener {
        void products(boolean z, List<SkuDetails> list);
    }

    public interface PurchaseProductListener {
        void purchaseError(int i);

        void purchased(Purchase purchase);
    }

    public interface BillingWrapperListener {
        void onBillingManagerInitializeAttempt(int i);

        void onDisplayMessage(int i);

        void onPurchaseConsumed(String str);
    }

    public interface PurchaseHistoryListener {
        void purchaseHistory(boolean z, List<Purchase> list);
    }

    public BillingHandler(Activity activity, BillingWrapperListener billingWrapperListener) {
        this.mActivity = activity;
        this.wrapperListener = billingWrapperListener;
        initializeBilling();
    }

    private void fetchProductsType(String str, List<String> list, final FetchProductsListener fetchProductsListener) {
        Builder newBuilder = SkuDetailsParams.newBuilder();
        newBuilder.setSkusList(list).setType(str);
        this.mBillingClient.querySkuDetailsAsync(newBuilder.build(), new SkuDetailsResponseListener() {
            public void onSkuDetailsResponse(int i, List<SkuDetails> list) {
                if (i == 0) {
                    fetchProductsListener.products(true, list);
                    return;
                }
                fetchProductsListener.products(false, new ArrayList());
                if (BillingHandler.this.wrapperListener != null) {
                    BillingHandler.this.wrapperListener.onDisplayMessage(BillingMessages.getErrorMessage(i));
                }
            }
        });
    }

    private void initializeBilling() {
        if (this.mBillingClient == null) {
            this.mBillingClient = BillingClient.newBuilder(this.mActivity).setListener(this).build();
        }
        this.mBillingClient.startConnection(new BillingClientStateListener() {
            public void onBillingServiceDisconnected() {
                BillingHandler.this.mIsServiceConnected = false;
            }

            public void onBillingSetupFinished(int i) {
                if (BillingHandler.this.wrapperListener != null) {
                    BillingHandler.this.wrapperListener.onBillingManagerInitializeAttempt(i);
                }
            }
        });
    }

    public void close() {
        this.wrapperListener = null;
        this.purchaseListener = null;
        if (this.mBillingClient != null && this.mIsServiceConnected) {
            this.mBillingClient.endConnection();
        }
    }

    public void consume(Purchase purchase) {
        this.mBillingClient.consumeAsync(purchase.getPurchaseToken(), new ConsumeResponseListener() {
            public void onConsumeResponse(int i, String str) {
                if (i == 0) {
                    if (BillingHandler.this.wrapperListener != null) {
                        BillingHandler.this.wrapperListener.onPurchaseConsumed(str);
                    }
                } else if (i == -1) {
                    BillingHandler.this.initializeBilling();
                } else if (BillingHandler.this.wrapperListener != null) {
                    BillingHandler.this.wrapperListener.onDisplayMessage(BillingMessages.getErrorMessage(i));
                }
            }
        });
    }

    public void fetchAllProducts(final List<String> list, final FetchProductsListener fetchProductsListener) {
        String str = SkuType.SUBS;
        final ArrayList arrayList = new ArrayList();
        fetchProductsType(str, list, new FetchProductsListener() {
            public void products(final boolean z, List<SkuDetails> list) {
                arrayList.addAll(list);
                BillingHandler.this.fetchProductsType(SkuType.INAPP, list, new FetchProductsListener() {
                    public void products(boolean z, List<SkuDetails> list) {
                        arrayList.addAll(list);
                        FetchProductsListener fetchProductsListener = fetchProductsListener;
                        boolean z2 = z && z;
                        fetchProductsListener.products(z2, arrayList);
                    }
                });
            }
        });
    }

    public void initiatePurchaseFlow(SkuDetails skuDetails, @NonNull PurchaseProductListener purchaseProductListener) {
        this.purchaseListener = purchaseProductListener;
        this.purchasedSKU = skuDetails;
        this.mBillingClient.launchBillingFlow(this.mActivity, BillingFlowParams.newBuilder().setSku(skuDetails.getSku()).setType(skuDetails.getType()).build());
    }

    public void onPurchasesUpdated(int i, @Nullable List<Purchase> list) {
        if (i == 0) {
            for (Purchase purchase : list) {
                if (this.purchasedSKU != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(AFInAppEventParameterName.REVENUE, Float.valueOf(((float) this.purchasedSKU.getPriceAmountMicros()) / 1000000.0f));
                    hashMap.put(AFInAppEventParameterName.CURRENCY, this.purchasedSKU.getPriceCurrencyCode());
                    hashMap.put(AFInAppEventParameterName.CONTENT_TYPE, this.purchasedSKU.getTitle());
                    hashMap.put(AFInAppEventParameterName.CONTENT_ID, this.purchasedSKU.getSku());
                    MobileAttributionService.sendEvent(this.mActivity, AFInAppEventType.PURCHASE, hashMap);
                }
                if (this.purchaseListener != null) {
                    this.purchaseListener.purchased(purchase);
                }
            }
        } else if (this.purchaseListener != null) {
            this.purchaseListener.purchaseError(i);
        }
    }

    public List<Purchase> queryPendingTransactions() {
        PurchasesResult queryPurchases = this.mBillingClient.queryPurchases(SkuType.INAPP);
        if (queryPurchases.getResponseCode() == 0) {
            PurchasesResult queryPurchases2 = this.mBillingClient.queryPurchases(SkuType.SUBS);
            if (queryPurchases2.getResponseCode() == 0) {
                queryPurchases.getPurchasesList().addAll(queryPurchases2.getPurchasesList());
                return queryPurchases.getPurchasesList();
            } else if (this.wrapperListener == null) {
                return null;
            } else {
                this.wrapperListener.onDisplayMessage(BillingMessages.getErrorMessage(queryPurchases2.getResponseCode()));
                return null;
            }
        } else if (this.wrapperListener == null) {
            return null;
        } else {
            this.wrapperListener.onDisplayMessage(BillingMessages.getErrorMessage(queryPurchases.getResponseCode()));
            return null;
        }
    }

    public void queryPurchaseHistory(String str, final PurchaseHistoryListener purchaseHistoryListener) {
        this.mBillingClient.queryPurchaseHistoryAsync(str, new PurchaseHistoryResponseListener() {
            public void onPurchaseHistoryResponse(int i, List<Purchase> list) {
                if (i == 0) {
                    purchaseHistoryListener.purchaseHistory(true, list);
                    return;
                }
                if (BillingHandler.this.wrapperListener != null) {
                    BillingHandler.this.wrapperListener.onDisplayMessage(BillingMessages.getErrorMessage(i));
                }
                purchaseHistoryListener.purchaseHistory(false, new ArrayList());
            }
        });
    }
}
