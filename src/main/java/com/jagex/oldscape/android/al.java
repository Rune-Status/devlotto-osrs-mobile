package com.jagex.oldscape.android;

import defpackage.mv;

class al implements Runnable {
    final /* synthetic */ ag this$0;

    al(ag agVar) {
        this.this$0 = agVar;
    }

    public void ad() {
        this.this$0.am.applyPendingTransactions(this.this$0.aj, this.this$0.ag);
    }

    public void aq() {
        this.this$0.am.applyPendingTransactions(this.this$0.aj, this.this$0.ag);
    }

    public void run() {
        try {
            this.this$0.am.applyPendingTransactions(this.this$0.aj, this.this$0.ag);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/al.run(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
