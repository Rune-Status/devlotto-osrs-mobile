package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.Nullable;
import com.android.billingclient.api.BillingClient.SkuType;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R;
import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.MobileAuthStateManager.AuthManagerAction;
import com.jagex.mobilesdk.auth.MobileAuthStateWriter;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.MobilePaymentService.PendingTransactionUpdate;
import com.jagex.mobilesdk.payments.PurchaseHistory.Listener;
import com.jagex.mobilesdk.payments.comms.CompletePaymentComms.CompletePaymentCallback;
import com.jagex.mobilesdk.payments.comms.FetchPackagesComms.FetchPackagesCallback;
import com.jagex.mobilesdk.payments.comms.PaymentComms;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler.BillingWrapperListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler.FetchProductsListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler.PurchaseProductListener;
import com.jagex.mobilesdk.payments.model.CompletionStatus;
import com.jagex.mobilesdk.payments.model.JagexPackage;
import com.jagex.mobilesdk.payments.model.JagexProducts;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest.PaymentPayload;
import com.jagex.mobilesdk.payments.model.PaymentCompletionResponse;
import com.jagex.mobilesdk.payments.model.Shop;
import com.jagex.mobilesdk.payments.utils.Intents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class PackageListViewController implements BillingWrapperListener {
    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String HTTP_HEADER_ACCEPT_LANGUAGE = "Accept-Language";
    private static final String HTTP_HEADER_ACCEPT_RESOLUTION = "Accept-Resolution";
    private static final String HTTP_HEADER_ACCEPT_TYPE = "Accept-Type";
    private static final String HTTP_HEADER_AUTHORIZATION = "Authorization";
    private static final String HTTP_HEADER_BEARER = "Bearer";
    private static final String HTTP_HEADER_CONTENT_TYPE = "Content-Type";
    private static final String PAYMENTAPI_ANDROID = "/android";
    private static final String PAYMENTAPI_COMPLETION = "/completion/";
    private static final String PAYMENTAPI_SHOP = "shop/";
    private static final String SUBSCRIPTION_KNOWN_LIST = "KNOWN_LIST";
    private static final String SUBSCRIPTION_KNOWN_NAME = "KNOWN_NAME";
    private final Activity activity;
    private final MobileAuthStateManager authStateManager;
    private final MobileAuthStateWriter authStateWriter;
    private final BillingHandler billingHandler;
    private final Context context;
    private List<String> currentStoreSubscriptions = new ArrayList();
    private boolean isUserNotifiedOfPendingPurchase;
    private final JagexConfig jagexConfig;
    private HashMap<String, String> productTypeMap = new HashMap();
    private final PurchaseHistory purchaseHistory;
    BroadcastReceiver receiver;
    private final List<Purchase> unconsumedPurchases;
    private final PackageListViewListener viewListener;

    public interface PackageListViewListener {
        void billingInitialiseAttempt(int i);

        void onCategoriesLoaded(List<JagexPackage> list);

        void onDisplayMessage(int i);

        void onInternetStateChanged(boolean z);

        void onPendingPurchasesAvailable();

        void onShopLoaded(String str, String str2);

        void onSuccessfulConsumption();

        void returnToGame();
    }

    /* renamed from: com.jagex.mobilesdk.payments.PackageListViewController$9 */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] $SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus = new int[CompletionStatus.values().length];

        static {
            try {
                $SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.SUCCESS_CUSTOMER_MISMATCH.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.NETWORK_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    PackageListViewController(PackageListViewListener packageListViewListener, Activity activity, JagexConfig jagexConfig) {
        this.viewListener = packageListViewListener;
        this.context = activity.getApplicationContext();
        this.activity = activity;
        this.isUserNotifiedOfPendingPurchase = false;
        this.unconsumedPurchases = new ArrayList();
        this.billingHandler = new BillingHandler(activity, this);
        this.authStateWriter = new MobileAuthStateWriter(activity.getApplicationContext());
        this.authStateManager = MobileAuthStateManager.getInstance(this.authStateWriter, jagexConfig);
        this.jagexConfig = jagexConfig;
        this.purchaseHistory = new PurchaseHistory(activity);
        this.receiver = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                PackageListViewController packageListViewController = PackageListViewController.this;
                boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                packageListViewController.networkUpdate(Boolean.valueOf(z));
            }
        };
    }

    private void addToKnownSubscriptions(String str) {
        List knownSubscriptionList = getKnownSubscriptionList();
        if (!knownSubscriptionList.contains(str)) {
            knownSubscriptionList.add(str);
            saveKnownList(knownSubscriptionList);
        }
    }

    private List<JagexPackage> assignSKUItemToPackage(List<JagexPackage> list, List<SkuDetails> list2) {
        this.productTypeMap = new HashMap();
        for (SkuDetails skuDetails : list2) {
            this.productTypeMap.put(skuDetails.getSku(), skuDetails.getType());
        }
        for (JagexPackage jagexPackage : list) {
            for (JagexProducts jagexProducts : jagexPackage.getProducts()) {
                for (SkuDetails skuDetails2 : list2) {
                    if (jagexProducts.getSkuItem() == null) {
                        if (skuDetails2 != null && jagexProducts.getProductId().equals(skuDetails2.getSku())) {
                            jagexProducts.setSkuItem(skuDetails2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (JagexProducts jagexProducts2 : jagexPackage.getProducts()) {
                if (jagexProducts2.getSkuItem() != null) {
                    arrayList.add(jagexProducts2);
                }
            }
            jagexPackage.setProducts(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (JagexPackage jagexPackage2 : list) {
            if (jagexPackage2.getProducts().size() > 0) {
                arrayList2.add(jagexPackage2);
            }
        }
        return arrayList2;
    }

    private void completePayment(final Purchase purchase, String str, final String str2, final PendingTransactionUpdate pendingTransactionUpdate) {
        if (str2 == null) {
            this.viewListener.onDisplayMessage(R.string.ITEM_UNAVAILABLE);
            if (pendingTransactionUpdate != null) {
                pendingTransactionUpdate.applyFailed();
                return;
            }
            return;
        }
        PaymentCompletionRequest paymentCompletionRequest = new PaymentCompletionRequest(new PaymentPayload(purchase.getOriginalJson(), purchase.getSignature(), str2));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.jagexConfig.getPaymentUri());
        stringBuilder.append(PAYMENTAPI_COMPLETION);
        stringBuilder.append(this.jagexConfig.getShopName());
        stringBuilder.append(PAYMENTAPI_ANDROID);
        PaymentComms.completePaymentsComms(stringBuilder.toString(), this.authStateManager.getAuthState(), paymentCompletionRequest, new CompletePaymentCallback() {
            public void onCompletePaymentResult(CommsResult<PaymentCompletionResponse> commsResult, Exception exception) {
                if (commsResult != null) {
                    switch (AnonymousClass9.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[((PaymentCompletionResponse) commsResult.getResultValue()).getStatus().ordinal()]) {
                        case 1:
                            PackageListViewController.this.viewListener.onDisplayMessage(R.string.ITEM_NOT_OWNED);
                            break;
                        case 2:
                            break;
                        case 3:
                            PackageListViewController.this.viewListener.onDisplayMessage(R.string.ITEM_UNAVAILABLE);
                            if (pendingTransactionUpdate != null) {
                                pendingTransactionUpdate.applyFailed();
                            }
                            if (SkuType.INAPP.equals(str2)) {
                                PackageListViewController.this.billingHandler.consume(purchase);
                                return;
                            }
                            return;
                        case 4:
                            if (pendingTransactionUpdate != null) {
                                pendingTransactionUpdate.applyFailed();
                            }
                            PackageListViewController.this.viewListener.onDisplayMessage(R.string.SERVICE_UNAVAILABLE);
                            PackageListViewController.this.viewListener.returnToGame();
                            return;
                        default:
                            if (pendingTransactionUpdate != null) {
                                pendingTransactionUpdate.applyFailed();
                            }
                            PackageListViewController.this.viewListener.onDisplayMessage(R.string.DEVELOPER_ERROR);
                            PackageListViewController.this.viewListener.returnToGame();
                            return;
                    }
                    if (pendingTransactionUpdate != null) {
                        pendingTransactionUpdate.applyComplete();
                    }
                    if (SkuType.SUBS.equals(str2)) {
                        PackageListViewController.this.addToKnownSubscriptions(purchase.getPurchaseToken());
                    } else if (SkuType.INAPP.equals(str2)) {
                        PackageListViewController.this.billingHandler.consume(purchase);
                    }
                } else if (commsResult.responseCode == 401 || commsResult.responseCode == 403) {
                    PackageListViewController.this.authStateManager.clearAuthState();
                    if (pendingTransactionUpdate != null) {
                        pendingTransactionUpdate.applyFailed();
                    }
                }
            }
        }, true);
    }

    private void getCategories(String str) {
        HashMap hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bearer ");
        stringBuilder.append(str);
        hashMap.put("Authorization", stringBuilder.toString());
        float f = this.context.getResources().getDisplayMetrics().density;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(f);
        stringBuilder2.append(",d=android");
        hashMap.put("Accept-Resolution", stringBuilder2.toString());
        hashMap.put("Accept-Language", Locale.getDefault().getLanguage());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.jagexConfig.getPaymentUri());
        stringBuilder3.append(PAYMENTAPI_SHOP);
        stringBuilder3.append(this.jagexConfig.getShopName());
        PaymentComms.fetchPackagesComms(stringBuilder3.toString(), this.authStateManager.getAuthState(), this.context.getResources().getDisplayMetrics().density, new FetchPackagesCallback() {
            public void onFetchPackagesResult(CommsResult<Shop> commsResult, Exception exception) {
                if (commsResult != null && exception == null) {
                    final Shop shop = (Shop) commsResult.getResultValue();
                    PackageListViewController.this.viewListener.onShopLoaded(shop.getImageLogo(), shop.getImageBackground());
                    ArrayList arrayList = new ArrayList();
                    for (JagexPackage jagexPackage : shop.getCategories()) {
                        jagexPackage.setCategoryID((int) Math.pow(2.0d, (double) (jagexPackage.getCategoryID() - 1)));
                        for (JagexProducts productId : jagexPackage.getProducts()) {
                            arrayList.add(productId.getProductId());
                        }
                    }
                    PackageListViewController.this.billingHandler.fetchAllProducts(arrayList, new FetchProductsListener() {
                        public void products(boolean z, List<SkuDetails> list) {
                            final List access$300 = PackageListViewController.this.assignSKUItemToPackage(shop.getCategories(), list);
                            PackageListViewController.this.purchaseHistory.beginPurchaseHistoryQuery(new Listener() {
                                public void purchaseHistoryQueryCompleted(boolean z) {
                                    PackageListViewController.this.viewListener.onCategoriesLoaded(access$300);
                                    PackageListViewController.this.activity.runOnUiThread(new Runnable() {
                                        public void run() {
                                            PackageListViewController.this.queryPendingTransactions();
                                        }
                                    });
                                }
                            });
                        }
                    });
                } else if (commsResult.responseCode == 401) {
                    PackageListViewController.this.authStateManager.clearAuthState();
                    PackageListViewController.this.viewListener.onDisplayMessage(R.string.SHOP_UNAVAILABLE);
                    PackageListViewController.this.viewListener.returnToGame();
                }
            }
        }, true);
    }

    private List<String> getKnownSubscriptionList() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(SUBSCRIPTION_KNOWN_NAME, 0);
        ArrayList arrayList = new ArrayList();
        Set stringSet = sharedPreferences.getStringSet(SUBSCRIPTION_KNOWN_LIST, null);
        if (stringSet != null) {
            arrayList.addAll(stringSet);
        }
        return arrayList;
    }

    private void networkUpdate(Boolean bool) {
        this.viewListener.onInternetStateChanged(bool.booleanValue());
        if (bool.booleanValue()) {
            this.authStateManager.performActionWithFreshTokens(this.activity, new AuthManagerAction() {
                public void execute(@Nullable String str, Exception exception) {
                    if (exception != null) {
                        PackageListViewController.this.viewListener.onDisplayMessage(R.string.SHOP_UNAVAILABLE);
                        PackageListViewController.this.viewListener.returnToGame();
                        return;
                    }
                    PackageListViewController.this.getCategories(str);
                }
            });
        } else {
            this.viewListener.onDisplayMessage(R.string.NO_NETWORK);
        }
    }

    private void saveKnownList(List<String> list) {
        Editor edit = this.context.getSharedPreferences(SUBSCRIPTION_KNOWN_NAME, 0).edit();
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        edit.putStringSet(SUBSCRIPTION_KNOWN_LIST, hashSet);
        edit.apply();
        edit.commit();
    }

    private void sendPurchaseToServer(final Purchase purchase, final String str, final PendingTransactionUpdate pendingTransactionUpdate) {
        this.authStateManager.performActionWithFreshTokens(this.activity, new AuthManagerAction() {
            public void execute(@Nullable String str, Exception exception) {
                if (exception != null) {
                    if (pendingTransactionUpdate != null) {
                        pendingTransactionUpdate.applyFailed();
                    }
                    PackageListViewController.this.viewListener.returnToGame();
                    return;
                }
                PackageListViewController.this.completePayment(purchase, str, str, pendingTransactionUpdate);
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void applyUnconsumedPurchases(boolean z, final PendingTransactionUpdate pendingTransactionUpdate) {
        if (z) {
            final int size = this.unconsumedPurchases.size();
            if (size == 0) {
                pendingTransactionUpdate.applyComplete();
                return;
            }
            AnonymousClass6 anonymousClass6 = new PendingTransactionUpdate() {
                int countApplied = 0;

                public void applyComplete() {
                    this.countApplied++;
                    if (this.countApplied == size && pendingTransactionUpdate != null) {
                        pendingTransactionUpdate.applyComplete();
                    }
                }

                public void applyFailed() {
                    if (pendingTransactionUpdate != null) {
                        pendingTransactionUpdate.applyFailed();
                    }
                }

                public void transactionsAvailable(boolean z) {
                }
            };
            for (Purchase purchase : this.unconsumedPurchases) {
                String str = (String) this.productTypeMap.get(purchase.getSku());
                if (str != null) {
                    sendPurchaseToServer(purchase, str, anonymousClass6);
                } else {
                    processUnknownType(purchase, anonymousClass6);
                }
            }
        } else {
            this.viewListener.returnToGame();
        }
        List knownSubscriptionList = getKnownSubscriptionList();
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.currentStoreSubscriptions) {
            if (knownSubscriptionList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        saveKnownList(arrayList);
    }

    /* Access modifiers changed, original: 0000 */
    public void buyProduct(SkuDetails skuDetails, final PendingTransactionUpdate pendingTransactionUpdate) {
        this.billingHandler.initiatePurchaseFlow(skuDetails, new PurchaseProductListener() {
            public void purchaseError(int i) {
                if (pendingTransactionUpdate != null) {
                    pendingTransactionUpdate.applyFailed();
                }
            }

            public void purchased(Purchase purchase) {
                String str = (String) PackageListViewController.this.productTypeMap.get(purchase.getSku());
                if (str != null) {
                    PackageListViewController.this.sendPurchaseToServer(purchase, str, pendingTransactionUpdate);
                } else {
                    PackageListViewController.this.processUnknownType(purchase, pendingTransactionUpdate);
                }
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void checkNetwork() {
        try {
            this.context.unregisterReceiver(this.receiver);
        } catch (IllegalArgumentException e) {
        }
        this.context.registerReceiver(this.receiver, Intents.getConnectivityIntentFilter());
    }

    public boolean eligibleForIntroductoryPrice() {
        return this.purchaseHistory.eligibleForIntroductoryPrice();
    }

    public boolean eligibleForTrialPurchase() {
        return this.purchaseHistory.eligibleForTrialPurchase();
    }

    public void getPendingTransactions() {
        queryPendingTransactions();
    }

    public void onBillingManagerInitializeAttempt(int i) {
        this.viewListener.billingInitialiseAttempt(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void onDetach() {
        this.billingHandler.close();
        try {
            this.context.unregisterReceiver(this.receiver);
        } catch (IllegalArgumentException e) {
        }
    }

    public void onDisplayMessage(int i) {
        this.viewListener.onDisplayMessage(i);
    }

    public void onPurchaseConsumed(String str) {
        this.viewListener.onSuccessfulConsumption();
    }

    public boolean pendingTransactionsAvailable() {
        queryPendingTransactions();
        return this.unconsumedPurchases.size() != 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void processUnknownType(final Purchase purchase, final PendingTransactionUpdate pendingTransactionUpdate) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(purchase.getSku());
        this.billingHandler.fetchAllProducts(arrayList, new FetchProductsListener() {
            public void products(boolean z, List<SkuDetails> list) {
                if (list.isEmpty()) {
                    pendingTransactionUpdate.applyFailed();
                    return;
                }
                for (SkuDetails type : list) {
                    PackageListViewController.this.sendPurchaseToServer(purchase, type.getType(), pendingTransactionUpdate);
                }
            }
        });
    }

    public void queryPendingTransactions() {
        this.unconsumedPurchases.clear();
        this.currentStoreSubscriptions.clear();
        List<Purchase> queryPendingTransactions = this.billingHandler.queryPendingTransactions();
        if (queryPendingTransactions != null) {
            for (Purchase purchase : queryPendingTransactions) {
                if (!getKnownSubscriptionList().contains(purchase.getPurchaseToken())) {
                    this.unconsumedPurchases.add(purchase);
                }
                if (purchase.isAutoRenewing()) {
                    this.currentStoreSubscriptions.add(purchase.getPurchaseToken());
                }
                if (this.unconsumedPurchases.size() > 0 && !this.isUserNotifiedOfPendingPurchase) {
                    this.isUserNotifiedOfPendingPurchase = true;
                    this.viewListener.onPendingPurchasesAvailable();
                }
            }
        }
    }
}
