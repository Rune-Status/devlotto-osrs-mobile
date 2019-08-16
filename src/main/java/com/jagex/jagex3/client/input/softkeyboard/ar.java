package com.jagex.jagex3.client.input.softkeyboard;

import defpackage.mv;

class ar implements Runnable {
    final /* synthetic */ al this$0;
    final /* synthetic */ int val$formFieldIndex;

    ar(al alVar, int i) {
        this.this$0 = alVar;
        this.val$formFieldIndex = i;
    }

    public void ad() {
        synchronized (this.this$0.am) {
            if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.am.size()) {
                ((aq) this.this$0.am.get(this.val$formFieldIndex)).ai(535290863);
            }
        }
    }

    public void aq() {
        synchronized (this.this$0.am) {
            if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.am.size()) {
                ((aq) this.this$0.am.get(this.val$formFieldIndex)).ai(-1854941031);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.am) {
                if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.am.size()) {
                    ((aq) this.this$0.am.get(this.val$formFieldIndex)).ai(1930932784);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/ar.run(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
