package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.payments.MobilePaymentService.PendingTransactionUpdate;
import com.jagex.mobilesdk.payments.PackageListViewController.PackageListViewListener;
import com.jagex.mobilesdk.payments.model.JagexPackage;
import java.util.List;

public class PendingTransactionMonitor implements PackageListViewListener {
    final Activity activity;
    PackageListViewController controller;
    TransactionMonitorStatus purchasesAvailable = TransactionMonitorStatus.INITIALISING;
    final PendingTransactionUpdate updater;

    public enum TransactionMonitorStatus {
        INITIALISING,
        AVAILABLE,
        UNAVAILABLE
    }

    public PendingTransactionMonitor(@NonNull Activity activity, @NonNull JagexConfig jagexConfig, @NonNull PendingTransactionUpdate pendingTransactionUpdate) {
        this.updater = pendingTransactionUpdate;
        this.activity = activity;
        this.controller = new PackageListViewController(this, activity, jagexConfig);
    }

    public void applyPendingTransactions(PendingTransactionUpdate pendingTransactionUpdate) {
        this.controller.applyUnconsumedPurchases(true, pendingTransactionUpdate);
    }

    public void billingInitialiseAttempt(int i) {
        if (i != 0) {
            this.updater.transactionsAvailable(false);
        } else {
            this.activity.runOnUiThread(new Runnable() {
                public void run() {
                    PendingTransactionMonitor.this.controller.checkNetwork();
                    Boolean valueOf = Boolean.valueOf(PendingTransactionMonitor.this.controller.pendingTransactionsAvailable());
                    PendingTransactionMonitor.this.purchasesAvailable = valueOf.booleanValue() ? TransactionMonitorStatus.AVAILABLE : TransactionMonitorStatus.UNAVAILABLE;
                    if (PendingTransactionMonitor.this.updater != null) {
                        PendingTransactionMonitor.this.updater.transactionsAvailable(valueOf.booleanValue());
                    }
                }
            });
        }
    }

    public void onCategoriesLoaded(List<JagexPackage> list) {
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
    }

    public TransactionMonitorStatus pendingTransactionsAvailable() {
        if (this.purchasesAvailable != TransactionMonitorStatus.INITIALISING) {
            this.purchasesAvailable = Boolean.valueOf(this.controller.pendingTransactionsAvailable()).booleanValue() ? TransactionMonitorStatus.AVAILABLE : TransactionMonitorStatus.UNAVAILABLE;
        }
        return this.purchasesAvailable;
    }

    public void returnToGame() {
    }
}
