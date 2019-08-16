package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import com.android.billingclient.util.BillingHelper;

class BillingBroadcastManager {
    private static final String ACTION = "com.android.vending.billing.PURCHASES_UPDATED";
    private static final String TAG = "BillingBroadcastManager";
    private final Context mContext;
    private final BillingBroadcastReceiver mReceiver;

    private class BillingBroadcastReceiver extends BroadcastReceiver {
        private boolean mIsRegistered;
        private final PurchasesUpdatedListener mListener;

        private BillingBroadcastReceiver(@NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
            this.mListener = purchasesUpdatedListener;
        }

        public void onReceive(Context context, Intent intent) {
            this.mListener.onPurchasesUpdated(BillingHelper.getResponseCodeFromIntent(intent, BillingBroadcastManager.TAG), BillingHelper.extractPurchases(intent.getExtras()));
        }

        public void register(Context context, IntentFilter intentFilter) {
            if (!this.mIsRegistered) {
                context.registerReceiver(BillingBroadcastManager.this.mReceiver, intentFilter);
                this.mIsRegistered = true;
            }
        }

        public void unRegister(Context context) {
            if (this.mIsRegistered) {
                context.unregisterReceiver(BillingBroadcastManager.this.mReceiver);
                this.mIsRegistered = false;
                return;
            }
            BillingHelper.logWarn(BillingBroadcastManager.TAG, "Receiver is not registered.");
        }
    }

    BillingBroadcastManager(Context context, @NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
        this.mContext = context;
        this.mReceiver = new BillingBroadcastReceiver(purchasesUpdatedListener);
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        this.mReceiver.unRegister(this.mContext);
    }

    /* Access modifiers changed, original: 0000 */
    public PurchasesUpdatedListener getListener() {
        return this.mReceiver.mListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void registerReceiver() {
        this.mReceiver.register(this.mContext, new IntentFilter(ACTION));
    }
}
