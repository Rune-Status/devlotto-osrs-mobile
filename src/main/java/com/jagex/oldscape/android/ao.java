package com.jagex.oldscape.android;

import com.jagex.mobilesdk.payments.MobilePaymentService.PendingTransactionUpdate;
import defpackage.ax;
import defpackage.az;
import defpackage.mv;

class ao implements PendingTransactionUpdate {
    static final String aq = "com_jagex_auth_mobile_android_osrs";
    static final String ar = "gamesso.token.create payments payments.android.oldschool";
    final /* synthetic */ ag this$0;

    ao(ag agVar) {
        this.this$0 = agVar;
    }

    public void ad(boolean z) {
        this.this$0.ap = new az(z);
        this.this$0.au = false;
    }

    public void ae() {
        this.this$0.ay = new ax(true);
        this.this$0.an = false;
    }

    public void ag() {
        this.this$0.ay = new ax(true);
        this.this$0.an = false;
    }

    public void ai() {
        this.this$0.ay = new ax(false);
        this.this$0.an = false;
    }

    public void aj() {
        this.this$0.ay = new ax(false);
        this.this$0.an = false;
    }

    public void ak() {
        this.this$0.ay = new ax(true);
        this.this$0.an = false;
    }

    public void al() {
        this.this$0.ay = new ax(false);
        this.this$0.an = false;
    }

    public void am() {
        this.this$0.ay = new ax(true);
        this.this$0.an = false;
    }

    public void applyComplete() {
        try {
            this.this$0.ay = new ax(true);
            this.this$0.an = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ao.applyComplete(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void applyFailed() {
        try {
            this.this$0.ay = new ax(false);
            this.this$0.an = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ao.applyFailed(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aq(boolean z) {
        this.this$0.ap = new az(z);
        this.this$0.au = false;
    }

    public void ar(boolean z) {
        this.this$0.ap = new az(z);
        this.this$0.au = false;
    }

    public void as() {
        this.this$0.ay = new ax(true);
        this.this$0.an = false;
    }

    public void transactionsAvailable(boolean z) {
        try {
            this.this$0.ap = new az(z);
            this.this$0.au = false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ao.transactionsAvailable(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
