package com.jagex.oldscape.android;

import defpackage.mv;

class ax implements Runnable {
    final /* synthetic */ am this$0;
    final /* synthetic */ boolean val$keepScreenOn;

    ax(am amVar, boolean z) {
        this.this$0 = amVar;
        this.val$keepScreenOn = z;
    }

    public void ad() {
        if (this.val$keepScreenOn) {
            this.this$0.al.getWindow().addFlags(128);
        } else {
            this.this$0.al.getWindow().clearFlags(128);
        }
    }

    public void aq() {
        if (this.val$keepScreenOn) {
            this.this$0.al.getWindow().addFlags(128);
        } else {
            this.this$0.al.getWindow().clearFlags(128);
        }
    }

    public void run() {
        try {
            if (this.val$keepScreenOn) {
                this.this$0.al.getWindow().addFlags(128);
            } else {
                this.this$0.al.getWindow().clearFlags(128);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ax.run(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
