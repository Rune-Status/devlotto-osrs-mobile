package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.config.JagexConfigParcel;
import com.jagex.mobilesdk.payments.PendingTransactionMonitor.TransactionMonitorStatus;
import com.jagex.mobilesdk.payments.utils.SecurityProviderUpdate;
import java.util.HashMap;

public class MobilePaymentService {
    public static final int CATEGORY_BONDS = 1;
    public static final int CATEGORY_DEFAULT = 15;
    public static final int CATEGORY_KEYS = 2;
    public static final int CATEGORY_MEMBERSHIP = 4;
    public static final int CATEGORY_RUNECOINS = 8;
    public static final int CATEGORY_SINGLEPURCHASE = 16;
    private static final String EVENT_SHOP_OPENED = "soR6cK";
    private static final String EVENT_SHOP_PAGE = "shop_page";
    static final String EXTRA_CONFIG;
    static final String PACKAGE_CONFIG;
    private static final String PACKAGE_NAME = MobilePaymentService.class.getPackage().getName();
    static final String SELECTED_CONFIG;
    @NonNull
    private final JagexConfig config;
    private PendingTransactionMonitor pendingTransactions;
    private ProductPurchaser productPurchaser;
    private final PurchaseHistory purchaseHistory;

    public interface PendingTransactionUpdate {
        void applyComplete();

        void applyFailed();

        void transactionsAvailable(boolean z);
    }

    public interface PendingPurchaseUpdate {
        void purchaseComplete();

        void purchaseFailed();

        void purchaserReady(boolean z);
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".CONFIG");
        EXTRA_CONFIG = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".PACKAGEID.CONFIG");
        PACKAGE_CONFIG = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".SELECTED.CONFIG");
        SELECTED_CONFIG = stringBuilder.toString();
    }

    public MobilePaymentService(@NonNull Activity activity, @NonNull JagexConfig jagexConfig) {
        this.config = jagexConfig;
        this.purchaseHistory = new PurchaseHistory(activity);
        SecurityProviderUpdate.ProviderUpdate(activity);
    }

    private Intent createIntent(Activity activity, int i, int i2) {
        Bundle bundle = new Bundle();
        HashMap hashMap = new HashMap();
        hashMap.put(EVENT_SHOP_PAGE, Integer.valueOf(i));
        MobileAttributionService.sendEvent(activity, EVENT_SHOP_OPENED, hashMap);
        bundle.putParcelable(EXTRA_CONFIG, new JagexConfigParcel(this.config));
        bundle.putInt(PACKAGE_CONFIG, i);
        bundle.putInt(SELECTED_CONFIG, i2);
        return new Intent(activity, StoreActivity.class).addFlags(65536).putExtras(bundle);
    }

    public void applyPendingTransactions(final Activity activity, final PendingTransactionUpdate pendingTransactionUpdate) {
        if (this.pendingTransactions != null) {
            this.pendingTransactions.applyPendingTransactions(pendingTransactionUpdate);
        } else {
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    MobilePaymentService.this.pendingTransactions = new PendingTransactionMonitor(activity, MobilePaymentService.this.config, new PendingTransactionUpdate() {
                        public void applyComplete() {
                        }

                        public void applyFailed() {
                        }

                        public void transactionsAvailable(boolean z) {
                            if (z) {
                                MobilePaymentService.this.pendingTransactions.applyPendingTransactions(pendingTransactionUpdate);
                            } else {
                                pendingTransactionUpdate.applyComplete();
                            }
                        }
                    });
                }
            });
        }
    }

    public void beginPurchaseHistoryQuery() {
        this.purchaseHistory.beginPurchaseHistoryQuery(null);
    }

    public void checkForPendingTransactions(@NonNull Activity activity, @NonNull PendingTransactionUpdate pendingTransactionUpdate) {
        if (this.pendingTransactions == null) {
            this.pendingTransactions = new PendingTransactionMonitor(activity, this.config, pendingTransactionUpdate);
            return;
        }
        TransactionMonitorStatus pendingTransactionsAvailable = this.pendingTransactions.pendingTransactionsAvailable();
        if (pendingTransactionUpdate != null) {
            pendingTransactionUpdate.transactionsAvailable(pendingTransactionsAvailable == TransactionMonitorStatus.AVAILABLE);
        }
    }

    public boolean eligibleForIntroductoryPrice() {
        return this.purchaseHistory.eligibleForIntroductoryPrice();
    }

    public boolean eligibleForTrialPurchase() {
        return this.purchaseHistory.eligibleForTrialPurchase();
    }

    public void openStore(@NonNull Activity activity) {
        activity.startActivity(createIntent(activity, 15, 1));
    }

    public void openStore(@NonNull Activity activity, int i, int i2) {
        activity.startActivity(createIntent(activity, i, i2));
    }

    public boolean purchaseHistoryQueryCompleted() {
        return this.purchaseHistory.purchaseHistoryQueryCompleted();
    }

    public void purchaseShopItem(final Activity activity, final String str, final PendingPurchaseUpdate pendingPurchaseUpdate) {
        if (this.productPurchaser != null) {
            this.productPurchaser.purchaseItem(str);
        } else {
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    MobilePaymentService.this.productPurchaser = new ProductPurchaser(activity, MobilePaymentService.this.config, new PendingPurchaseUpdate() {
                        public void purchaseComplete() {
                            pendingPurchaseUpdate.purchaseComplete();
                        }

                        public void purchaseFailed() {
                            pendingPurchaseUpdate.purchaseFailed();
                        }

                        public void purchaserReady(boolean z) {
                            pendingPurchaseUpdate.purchaserReady(z);
                            if (z) {
                                MobilePaymentService.this.productPurchaser.purchaseItem(str);
                            } else {
                                pendingPurchaseUpdate.purchaseFailed();
                            }
                        }
                    });
                }
            });
        }
    }
}
