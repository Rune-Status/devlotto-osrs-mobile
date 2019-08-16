package com.jagex.oldscape.android;

import defpackage.mv;

class au implements Runnable {
    final /* synthetic */ ag this$0;

    au(ag agVar) {
        this.this$0 = agVar;
    }

    public void ad() {
        this.this$0.am.checkForPendingTransactions(this.this$0.aj, this.this$0.ag);
    }

    public void aq() {
        this.this$0.am.checkForPendingTransactions(this.this$0.aj, this.this$0.ag);
    }

    public void run() {
        try {
            this.this$0.am.checkForPendingTransactions(this.this$0.aj, this.this$0.ag);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/au.run(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
