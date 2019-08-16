package com.jagex.jagex3.client.input.softkeyboard;

import defpackage.mv;

class aj implements Runnable {
    final /* synthetic */ al this$0;
    final /* synthetic */ int val$formFieldIndex;
    final /* synthetic */ String val$text;

    aj(al alVar, String str, int i) {
        this.this$0 = alVar;
        this.val$text = str;
        this.val$formFieldIndex = i;
    }

    public void ad() {
        synchronized (this.this$0.am) {
            if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.am.size()) {
                ((aq) this.this$0.am.get(this.val$formFieldIndex)).al(this.val$text, (byte) 9);
            }
        }
    }

    public void aq() {
        synchronized (this.this$0.am) {
            if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.am.size()) {
                ((aq) this.this$0.am.get(this.val$formFieldIndex)).al(this.val$text, (byte) 9);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.am) {
                if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.am.size()) {
                    ((aq) this.this$0.am.get(this.val$formFieldIndex)).al(this.val$text, (byte) 9);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/aj.run(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
