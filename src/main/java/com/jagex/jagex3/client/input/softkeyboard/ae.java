package com.jagex.jagex3.client.input.softkeyboard;

import defpackage.mv;

class ae implements Runnable {
    final /* synthetic */ al this$0;
    final /* synthetic */ int val$formFieldIndex;
    final /* synthetic */ int val$limit;

    ae(al alVar, int i, int i2) {
        this.this$0 = alVar;
        this.val$limit = i;
        this.val$formFieldIndex = i2;
    }

    public void ad() {
        synchronized (this.this$0.am) {
            if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.am.size()) {
                ((aq) this.this$0.am.get(this.val$formFieldIndex)).ak(this.val$limit, 2050183667);
            }
        }
    }

    public void aq() {
        synchronized (this.this$0.am) {
            if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.am.size()) {
                ((aq) this.this$0.am.get(this.val$formFieldIndex)).ak(this.val$limit, 1686614148);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.am) {
                if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.am.size()) {
                    ((aq) this.this$0.am.get(this.val$formFieldIndex)).ak(this.val$limit, 1923785391);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/ae.run(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
