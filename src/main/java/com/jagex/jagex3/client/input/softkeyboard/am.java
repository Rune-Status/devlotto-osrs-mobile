package com.jagex.jagex3.client.input.softkeyboard;

import defpackage.mv;

class am implements Runnable {
    final /* synthetic */ al this$0;

    am(al alVar) {
        this.this$0 = alVar;
    }

    public void ad() {
        synchronized (this.this$0.am) {
            for (aq ae : this.this$0.am) {
                ae.ae(2131689903);
            }
        }
    }

    public void aq() {
        synchronized (this.this$0.am) {
            for (aq ae : this.this$0.am) {
                ae.ae(2131689903);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.am) {
                for (aq ae : this.this$0.am) {
                    ae.ae(2131689903);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/am.run(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
