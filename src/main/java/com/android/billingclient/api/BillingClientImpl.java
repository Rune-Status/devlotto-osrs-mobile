package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.android.billingclient.api.BillingClient.FeatureType;
import com.android.billingclient.api.BillingClient.SkuType;
import com.android.billingclient.api.Purchase.PurchasesResult;
import com.android.billingclient.util.BillingHelper;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

class BillingClientImpl extends BillingClient {
    private static final String GET_SKU_DETAILS_ITEM_LIST = "ITEM_ID_LIST";
    private static final String LIBRARY_VERSION = "1.1";
    private static final String LIBRARY_VERSION_KEY = "libraryVersion";
    private static final int MAX_SKU_DETAILS_ITEMS_PER_REQUEST = 20;
    private static final String TAG = "BillingClient";
    private final Context mApplicationContext;
    private final BillingBroadcastManager mBroadcastManager;
    private int mClientState = 0;
    private ExecutorService mExecutorService;
    private boolean mIABv6Supported;
    private IInAppBillingService mService;
    private ServiceConnection mServiceConnection;
    private boolean mSubscriptionUpdateSupported;
    private boolean mSubscriptionsSupported;
    private final Handler mUiThreadHandler = new Handler();
    private final BroadcastReceiver onPurchaseFinishedReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            PurchasesUpdatedListener listener = BillingClientImpl.this.mBroadcastManager.getListener();
            if (listener == null) {
                BillingHelper.logWarn(BillingClientImpl.TAG, "PurchasesUpdatedListener is null - no way to return the response.");
            } else {
                listener.onPurchasesUpdated(intent.getIntExtra("response_code_key", 6), BillingHelper.extractPurchases(intent.getBundleExtra("response_bundle_key")));
            }
        }
    };

    private final class BillingServiceConnection implements ServiceConnection {
        private final BillingClientStateListener mListener;

        private BillingServiceConnection(@NonNull BillingClientStateListener billingClientStateListener) {
            if (billingClientStateListener != null) {
                this.mListener = billingClientStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when init is done.");
        }

        /* synthetic */ BillingServiceConnection(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, AnonymousClass1 anonymousClass1) {
            this(billingClientStateListener);
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            BillingHelper.logVerbose(BillingClientImpl.TAG, "Billing service connected.");
            BillingClientImpl.this.mService = Stub.asInterface(iBinder);
            String packageName = BillingClientImpl.this.mApplicationContext.getPackageName();
            BillingClientImpl.this.mSubscriptionsSupported = false;
            BillingClientImpl.this.mSubscriptionUpdateSupported = false;
            BillingClientImpl.this.mIABv6Supported = false;
            try {
                int isBillingSupported = BillingClientImpl.this.mService.isBillingSupported(6, packageName, SkuType.SUBS);
                if (isBillingSupported == 0) {
                    BillingHelper.logVerbose(BillingClientImpl.TAG, "In-app billing API version 6 with subs is supported.");
                    BillingClientImpl.this.mIABv6Supported = true;
                    BillingClientImpl.this.mSubscriptionsSupported = true;
                    BillingClientImpl.this.mSubscriptionUpdateSupported = true;
                } else {
                    if (BillingClientImpl.this.mService.isBillingSupported(6, packageName, SkuType.INAPP) == 0) {
                        BillingHelper.logVerbose(BillingClientImpl.TAG, "In-app billing API without subs version 6 supported.");
                        BillingClientImpl.this.mIABv6Supported = true;
                    }
                    isBillingSupported = BillingClientImpl.this.mService.isBillingSupported(5, packageName, SkuType.SUBS);
                    if (isBillingSupported == 0) {
                        BillingHelper.logVerbose(BillingClientImpl.TAG, "In-app billing API version 5 supported.");
                        BillingClientImpl.this.mSubscriptionUpdateSupported = true;
                        BillingClientImpl.this.mSubscriptionsSupported = true;
                    } else {
                        isBillingSupported = BillingClientImpl.this.mService.isBillingSupported(3, packageName, SkuType.SUBS);
                        if (isBillingSupported == 0) {
                            BillingHelper.logVerbose(BillingClientImpl.TAG, "In-app billing API version 3 with subscriptions is supported.");
                            BillingClientImpl.this.mSubscriptionsSupported = true;
                        } else if (BillingClientImpl.this.mIABv6Supported) {
                            isBillingSupported = 0;
                        } else {
                            isBillingSupported = BillingClientImpl.this.mService.isBillingSupported(3, packageName, SkuType.INAPP);
                            if (isBillingSupported == 0) {
                                BillingHelper.logVerbose(BillingClientImpl.TAG, "In-app billing API version 3 with in-app items is supported.");
                            } else {
                                BillingHelper.logWarn(BillingClientImpl.TAG, "Even billing API version 3 is not supported on this device.");
                            }
                        }
                    }
                }
                if (isBillingSupported == 0) {
                    BillingClientImpl.this.mClientState = 2;
                } else {
                    BillingClientImpl.this.mClientState = 0;
                    BillingClientImpl.this.mService = null;
                }
                this.mListener.onBillingSetupFinished(isBillingSupported);
            } catch (RemoteException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("RemoteException while setting up in-app billing");
                stringBuilder.append(e);
                BillingHelper.logWarn(BillingClientImpl.TAG, stringBuilder.toString());
                BillingClientImpl.this.mClientState = 0;
                BillingClientImpl.this.mService = null;
                this.mListener.onBillingSetupFinished(-1);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            BillingHelper.logWarn(BillingClientImpl.TAG, "Billing service disconnected.");
            BillingClientImpl.this.mService = null;
            BillingClientImpl.this.mClientState = 0;
            this.mListener.onBillingServiceDisconnected();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    @UiThread
    BillingClientImpl(@NonNull Context context, @NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
        this.mApplicationContext = context.getApplicationContext();
        this.mBroadcastManager = new BillingBroadcastManager(this.mApplicationContext, purchasesUpdatedListener);
    }

    private int broadcastFailureAndReturnBillingResponse(int i) {
        this.mBroadcastManager.getListener().onPurchasesUpdated(i, null);
        return i;
    }

    private Bundle constructExtraParams(BillingFlowParams billingFlowParams) {
        Bundle bundle = new Bundle();
        if (billingFlowParams.getReplaceSkusProrationMode() != 0) {
            bundle.putInt("prorationMode", billingFlowParams.getReplaceSkusProrationMode());
        }
        if (billingFlowParams.getAccountId() != null) {
            bundle.putString("accountId", billingFlowParams.getAccountId());
        }
        if (billingFlowParams.getVrPurchaseFlow()) {
            bundle.putBoolean("vr", true);
        }
        if (billingFlowParams.getOldSku() != null) {
            bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{billingFlowParams.getOldSku()})));
        }
        return bundle;
    }

    @WorkerThread
    private void consumeInternal(final String str, final ConsumeResponseListener consumeResponseListener) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Consuming purchase with token: ");
            stringBuilder.append(str);
            BillingHelper.logVerbose(TAG, stringBuilder.toString());
            final int consumePurchase = this.mService.consumePurchase(3, this.mApplicationContext.getPackageName(), str);
            if (consumePurchase == 0) {
                BillingHelper.logVerbose(TAG, "Successfully consumed purchase.");
                if (consumeResponseListener != null) {
                    postToUiThread(new Runnable() {
                        public void run() {
                            consumeResponseListener.onConsumeResponse(consumePurchase, str);
                        }
                    });
                    return;
                }
                return;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Error consuming purchase with token. Response code: ");
            stringBuilder2.append(consumePurchase);
            BillingHelper.logWarn(TAG, stringBuilder2.toString());
            postToUiThread(new Runnable() {
                public void run() {
                    BillingHelper.logWarn(BillingClientImpl.TAG, "Error consuming purchase.");
                    consumeResponseListener.onConsumeResponse(consumePurchase, str);
                }
            });
        } catch (RemoteException e) {
            postToUiThread(new Runnable() {
                public void run() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error consuming purchase; ex: ");
                    stringBuilder.append(e);
                    BillingHelper.logWarn(BillingClientImpl.TAG, stringBuilder.toString());
                    consumeResponseListener.onConsumeResponse(-1, str);
                }
            });
        }
    }

    private void executeAsync(Runnable runnable) {
        if (this.mExecutorService == null) {
            this.mExecutorService = Executors.newFixedThreadPool(BillingHelper.NUMBER_OF_CORES);
        }
        this.mExecutorService.submit(runnable);
    }

    private Bundle generateVrBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("vr", true);
        return bundle;
    }

    private int isBillingSupportedOnVr(String str) {
        try {
            return this.mService.isBillingSupportedExtraParams(7, this.mApplicationContext.getPackageName(), str, generateVrBundle()) == 0 ? 0 : -2;
        } catch (RemoteException e) {
            BillingHelper.logWarn(TAG, "RemoteException while checking if billing is supported; try to reconnect");
            return -1;
        }
    }

    private void postToUiThread(Runnable runnable) {
        this.mUiThreadHandler.post(runnable);
    }

    private PurchasesResult queryPurchasesInternal(String str, boolean z) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Querying owned items, item type: ");
        stringBuilder2.append(str);
        stringBuilder2.append("; history: ");
        stringBuilder2.append(z);
        BillingHelper.logVerbose(TAG, stringBuilder2.toString());
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        do {
            Bundle purchaseHistory;
            if (z) {
                try {
                    if (this.mIABv6Supported) {
                        purchaseHistory = this.mService.getPurchaseHistory(6, this.mApplicationContext.getPackageName(), str, str2, null);
                    } else {
                        BillingHelper.logWarn(TAG, "getPurchaseHistory is not supported on current device");
                        return new PurchasesResult(-2, null);
                    }
                } catch (RemoteException e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Got exception trying to get purchases: ");
                    stringBuilder.append(e);
                    stringBuilder.append("; try to reconnect");
                    BillingHelper.logWarn(TAG, stringBuilder.toString());
                    return new PurchasesResult(-1, null);
                }
            }
            purchaseHistory = this.mService.getPurchases(3, this.mApplicationContext.getPackageName(), str, str2);
            if (purchaseHistory == null) {
                BillingHelper.logWarn(TAG, "queryPurchases got null owned items list");
                return new PurchasesResult(6, null);
            }
            int responseCodeFromBundle = BillingHelper.getResponseCodeFromBundle(purchaseHistory, TAG);
            if (responseCodeFromBundle != 0) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("getPurchases() failed. Response code: ");
                stringBuilder2.append(responseCodeFromBundle);
                BillingHelper.logWarn(TAG, stringBuilder2.toString());
                return new PurchasesResult(responseCodeFromBundle, null);
            } else if (purchaseHistory.containsKey(BillingHelper.RESPONSE_INAPP_ITEM_LIST) && purchaseHistory.containsKey(BillingHelper.RESPONSE_INAPP_PURCHASE_DATA_LIST) && purchaseHistory.containsKey(BillingHelper.RESPONSE_INAPP_SIGNATURE_LIST)) {
                ArrayList stringArrayList = purchaseHistory.getStringArrayList(BillingHelper.RESPONSE_INAPP_ITEM_LIST);
                ArrayList stringArrayList2 = purchaseHistory.getStringArrayList(BillingHelper.RESPONSE_INAPP_PURCHASE_DATA_LIST);
                ArrayList stringArrayList3 = purchaseHistory.getStringArrayList(BillingHelper.RESPONSE_INAPP_SIGNATURE_LIST);
                if (stringArrayList == null) {
                    BillingHelper.logWarn(TAG, "Bundle returned from getPurchases() contains null SKUs list.");
                    return new PurchasesResult(6, null);
                } else if (stringArrayList2 == null) {
                    BillingHelper.logWarn(TAG, "Bundle returned from getPurchases() contains null purchases list.");
                    return new PurchasesResult(6, null);
                } else if (stringArrayList3 == null) {
                    BillingHelper.logWarn(TAG, "Bundle returned from getPurchases() contains null signatures list.");
                    return new PurchasesResult(6, null);
                } else {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 < stringArrayList2.size()) {
                            String str3 = (String) stringArrayList2.get(i2);
                            String str4 = (String) stringArrayList3.get(i2);
                            String str5 = (String) stringArrayList.get(i2);
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Sku is owned: ");
                            stringBuilder3.append(str5);
                            BillingHelper.logVerbose(TAG, stringBuilder3.toString());
                            try {
                                Purchase purchase = new Purchase(str3, str4);
                                if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                    BillingHelper.logWarn(TAG, "BUG: empty/null token!");
                                }
                                arrayList.add(purchase);
                                i = i2 + 1;
                            } catch (JSONException e2) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Got an exception trying to decode the purchase: ");
                                stringBuilder.append(e2);
                                BillingHelper.logWarn(TAG, stringBuilder.toString());
                                return new PurchasesResult(6, null);
                            }
                        }
                        str2 = purchaseHistory.getString(BillingHelper.INAPP_CONTINUATION_TOKEN);
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Continuation token: ");
                        stringBuilder2.append(str2);
                        BillingHelper.logVerbose(TAG, stringBuilder2.toString());
                    }
                }
            } else {
                BillingHelper.logWarn(TAG, "Bundle returned from getPurchases() doesn't contain required fields.");
                return new PurchasesResult(6, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new PurchasesResult(0, arrayList);
    }

    public void consumeAsync(final String str, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            consumeResponseListener.onConsumeResponse(-1, null);
        } else if (TextUtils.isEmpty(str)) {
            BillingHelper.logWarn(TAG, "Please provide a valid purchase token got from queryPurchases result.");
            consumeResponseListener.onConsumeResponse(5, str);
        } else {
            executeAsync(new Runnable() {
                public void run() {
                    BillingClientImpl.this.consumeInternal(str, consumeResponseListener);
                }
            });
        }
    }

    public void endConnection() {
        try {
            LocalBroadcastManager.getInstance(this.mApplicationContext).unregisterReceiver(this.onPurchaseFinishedReceiver);
            this.mBroadcastManager.destroy();
            if (!(this.mServiceConnection == null || this.mService == null)) {
                BillingHelper.logVerbose(TAG, "Unbinding from service.");
                this.mApplicationContext.unbindService(this.mServiceConnection);
                this.mServiceConnection = null;
            }
            this.mService = null;
            if (this.mExecutorService != null) {
                this.mExecutorService.shutdownNow();
                this.mExecutorService = null;
            }
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("There was an exception while ending connection: ");
            stringBuilder.append(e);
            BillingHelper.logWarn(TAG, stringBuilder.toString());
        } catch (Throwable th) {
            this.mClientState = 3;
        }
        this.mClientState = 3;
    }

    public int isFeatureSupported(String str) {
        if (!isReady()) {
            return -1;
        }
        int hashCode = str.hashCode();
        if (hashCode == -422092961) {
            if (str.equals(FeatureType.SUBSCRIPTIONS_UPDATE)) {
                hashCode = 1;
            }
            hashCode = -1;
        } else if (hashCode == 292218239) {
            if (str.equals(FeatureType.IN_APP_ITEMS_ON_VR)) {
                hashCode = 2;
            }
            hashCode = -1;
        } else if (hashCode == 1219490065) {
            if (str.equals(FeatureType.SUBSCRIPTIONS_ON_VR)) {
                hashCode = 3;
            }
            hashCode = -1;
        } else if (hashCode != 1987365622) {
            hashCode = -1;
        } else {
            if (str.equals(FeatureType.SUBSCRIPTIONS)) {
                hashCode = 0;
            }
            hashCode = -1;
        }
        switch (hashCode) {
            case 0:
                if (this.mSubscriptionsSupported) {
                    return 0;
                }
                break;
            case 1:
                if (this.mSubscriptionUpdateSupported) {
                    return 0;
                }
                break;
            case 2:
                return isBillingSupportedOnVr(SkuType.INAPP);
            case 3:
                return isBillingSupportedOnVr(SkuType.SUBS);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported feature: ");
                stringBuilder.append(str);
                BillingHelper.logWarn(TAG, stringBuilder.toString());
                return 5;
        }
        return -2;
    }

    public boolean isReady() {
        return (this.mClientState != 2 || this.mService == null || this.mServiceConnection == null) ? false : true;
    }

    public int launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams) {
        if (!isReady()) {
            return broadcastFailureAndReturnBillingResponse(-1);
        }
        String skuType = billingFlowParams.getSkuType();
        String sku = billingFlowParams.getSku();
        if (sku == null) {
            BillingHelper.logWarn(TAG, "Please fix the input params. SKU can't be null.");
            return broadcastFailureAndReturnBillingResponse(5);
        } else if (skuType == null) {
            BillingHelper.logWarn(TAG, "Please fix the input params. SkuType can't be null.");
            return broadcastFailureAndReturnBillingResponse(5);
        } else if (!skuType.equals(SkuType.SUBS) || this.mSubscriptionsSupported) {
            Object obj = billingFlowParams.getOldSku() != null ? 1 : null;
            if (obj != null && !this.mSubscriptionUpdateSupported) {
                BillingHelper.logWarn(TAG, "Current client doesn't support subscriptions update.");
                return broadcastFailureAndReturnBillingResponse(-2);
            } else if (!billingFlowParams.hasExtraParams() || this.mIABv6Supported) {
                StringBuilder stringBuilder;
                try {
                    Bundle buyIntentExtraParams;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Constructing buy intent for ");
                    stringBuilder2.append(sku);
                    stringBuilder2.append(", item type: ");
                    stringBuilder2.append(skuType);
                    BillingHelper.logVerbose(TAG, stringBuilder2.toString());
                    if (this.mIABv6Supported) {
                        Bundle constructExtraParams = constructExtraParams(billingFlowParams);
                        constructExtraParams.putString(LIBRARY_VERSION_KEY, "1.1");
                        buyIntentExtraParams = this.mService.getBuyIntentExtraParams(billingFlowParams.getVrPurchaseFlow() ? 7 : 6, this.mApplicationContext.getPackageName(), sku, skuType, null, constructExtraParams);
                    } else {
                        buyIntentExtraParams = obj != null ? this.mService.getBuyIntentToReplaceSkus(5, this.mApplicationContext.getPackageName(), Arrays.asList(new String[]{billingFlowParams.getOldSku()}), sku, SkuType.SUBS, null) : this.mService.getBuyIntent(3, this.mApplicationContext.getPackageName(), sku, skuType, null);
                    }
                    int responseCodeFromBundle = BillingHelper.getResponseCodeFromBundle(buyIntentExtraParams, TAG);
                    if (responseCodeFromBundle != 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unable to buy item, Error response code: ");
                        stringBuilder.append(responseCodeFromBundle);
                        BillingHelper.logWarn(TAG, stringBuilder.toString());
                        return broadcastFailureAndReturnBillingResponse(responseCodeFromBundle);
                    }
                    Intent intent = new Intent(activity, ProxyBillingActivity.class);
                    intent.putExtra(BillingHelper.RESPONSE_BUY_INTENT, (PendingIntent) buyIntentExtraParams.getParcelable(BillingHelper.RESPONSE_BUY_INTENT));
                    activity.startActivity(intent);
                    return 0;
                } catch (RemoteException e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("RemoteException while launching launching replace subscriptions flow: ; for sku: ");
                    stringBuilder.append(sku);
                    stringBuilder.append("; try to reconnect");
                    BillingHelper.logWarn(TAG, stringBuilder.toString());
                    return broadcastFailureAndReturnBillingResponse(-1);
                }
            } else {
                BillingHelper.logWarn(TAG, "Current client doesn't support extra params for buy intent.");
                return broadcastFailureAndReturnBillingResponse(-2);
            }
        } else {
            BillingHelper.logWarn(TAG, "Current client doesn't support subscriptions.");
            return broadcastFailureAndReturnBillingResponse(-2);
        }
    }

    public void queryPurchaseHistoryAsync(final String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (isReady()) {
            executeAsync(new Runnable() {
                public void run() {
                    final PurchasesResult access$400 = BillingClientImpl.this.queryPurchasesInternal(str, true);
                    BillingClientImpl.this.postToUiThread(new Runnable() {
                        public void run() {
                            purchaseHistoryResponseListener.onPurchaseHistoryResponse(access$400.getResponseCode(), access$400.getPurchasesList());
                        }
                    });
                }
            });
        } else {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(-1, null);
        }
    }

    public PurchasesResult queryPurchases(String str) {
        if (!isReady()) {
            return new PurchasesResult(-1, null);
        }
        if (!TextUtils.isEmpty(str)) {
            return queryPurchasesInternal(str, false);
        }
        BillingHelper.logWarn(TAG, "Please provide a valid SKU type.");
        return new PurchasesResult(5, null);
    }

    public void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (isReady()) {
            final String skuType = skuDetailsParams.getSkuType();
            final List skusList = skuDetailsParams.getSkusList();
            if (TextUtils.isEmpty(skuType)) {
                BillingHelper.logWarn(TAG, "Please fix the input params. SKU type can't be empty.");
                skuDetailsResponseListener.onSkuDetailsResponse(5, null);
                return;
            } else if (skusList == null) {
                BillingHelper.logWarn(TAG, "Please fix the input params. The list of SKUs can't be empty.");
                skuDetailsResponseListener.onSkuDetailsResponse(5, null);
                return;
            } else {
                executeAsync(new Runnable() {
                    public void run() {
                        final SkuDetailsResult querySkuDetailsInternal = BillingClientImpl.this.querySkuDetailsInternal(skuType, skusList);
                        BillingClientImpl.this.postToUiThread(new Runnable() {
                            public void run() {
                                skuDetailsResponseListener.onSkuDetailsResponse(querySkuDetailsInternal.getResponseCode(), querySkuDetailsInternal.getSkuDetailsList());
                            }
                        });
                    }
                });
                return;
            }
        }
        skuDetailsResponseListener.onSkuDetailsResponse(-1, null);
    }

    /* Access modifiers changed, original: 0000 */
    @VisibleForTesting
    public SkuDetailsResult querySkuDetailsInternal(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i, i2 > size ? size : i2));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(GET_SKU_DETAILS_ITEM_LIST, arrayList2);
            bundle.putString(LIBRARY_VERSION_KEY, "1.1");
            try {
                bundle = this.mService.getSkuDetails(3, this.mApplicationContext.getPackageName(), str, bundle);
                StringBuilder stringBuilder;
                if (bundle == null) {
                    BillingHelper.logWarn(TAG, "querySkuDetailsAsync got null sku details list");
                    return new SkuDetailsResult(4, null);
                } else if (bundle.containsKey(BillingHelper.RESPONSE_GET_SKU_DETAILS_LIST)) {
                    arrayList2 = bundle.getStringArrayList(BillingHelper.RESPONSE_GET_SKU_DETAILS_LIST);
                    if (arrayList2 == null) {
                        BillingHelper.logWarn(TAG, "querySkuDetailsAsync got null response list");
                        return new SkuDetailsResult(4, null);
                    }
                    i = 0;
                    while (i < arrayList2.size()) {
                        try {
                            SkuDetails skuDetails = new SkuDetails((String) arrayList2.get(i));
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Got sku details: ");
                            stringBuilder.append(skuDetails);
                            BillingHelper.logVerbose(TAG, stringBuilder.toString());
                            arrayList.add(skuDetails);
                            i++;
                        } catch (JSONException e) {
                            BillingHelper.logWarn(TAG, "Got a JSON exception trying to decode SkuDetails");
                            return new SkuDetailsResult(6, null);
                        }
                    }
                    i = i2;
                } else {
                    size = BillingHelper.getResponseCodeFromBundle(bundle, TAG);
                    if (size != 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("getSkuDetails() failed. Response code: ");
                        stringBuilder.append(size);
                        BillingHelper.logWarn(TAG, stringBuilder.toString());
                        return new SkuDetailsResult(size, arrayList);
                    }
                    BillingHelper.logWarn(TAG, "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return new SkuDetailsResult(6, arrayList);
                }
            } catch (RemoteException e2) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("querySkuDetailsAsync got a remote exception (try to reconnect): ");
                stringBuilder2.append(e2);
                BillingHelper.logWarn(TAG, stringBuilder2.toString());
                return new SkuDetailsResult(-1, null);
            }
        }
        return new SkuDetailsResult(0, arrayList);
    }

    public void startConnection(@NonNull BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            BillingHelper.logVerbose(TAG, "Service connection is valid. No need to re-initialize.");
            billingClientStateListener.onBillingSetupFinished(0);
        } else if (this.mClientState == 1) {
            BillingHelper.logWarn(TAG, "Client is already in the process of connecting to billing service.");
            billingClientStateListener.onBillingSetupFinished(5);
        } else if (this.mClientState == 3) {
            BillingHelper.logWarn(TAG, "Client was already closed and can't be reused. Please create another instance.");
            billingClientStateListener.onBillingSetupFinished(5);
        } else {
            this.mClientState = 1;
            this.mBroadcastManager.registerReceiver();
            LocalBroadcastManager.getInstance(this.mApplicationContext).registerReceiver(this.onPurchaseFinishedReceiver, new IntentFilter("proxy_activity_response_intent_action"));
            BillingHelper.logVerbose(TAG, "Starting in-app billing setup.");
            this.mServiceConnection = new BillingServiceConnection(this, billingClientStateListener, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List queryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty())) {
                ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        BillingHelper.logWarn(TAG, "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra(LIBRARY_VERSION_KEY, "1.1");
                        if (this.mApplicationContext.bindService(intent2, this.mServiceConnection, 1)) {
                            BillingHelper.logVerbose(TAG, "Service was bonded successfully.");
                            return;
                        }
                        BillingHelper.logWarn(TAG, "Connection to Billing service is blocked.");
                    }
                }
            }
            this.mClientState = 0;
            BillingHelper.logVerbose(TAG, "Billing service unavailable on device.");
            billingClientStateListener.onBillingSetupFinished(3);
        }
    }
}
