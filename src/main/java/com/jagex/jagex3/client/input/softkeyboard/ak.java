package com.jagex.jagex3.client.input.softkeyboard;

import defpackage.mv;

class ak implements Runnable {
    final /* synthetic */ al this$0;

    ak(al alVar) {
        this.this$0 = alVar;
    }

    public void ad() {
        synchronized (this.this$0.am) {
            for (aq am : this.this$0.am) {
                am.am(2131034144);
            }
            this.this$0.am.clear();
        }
    }

    public void aq() {
        synchronized (this.this$0.am) {
            for (aq am : this.this$0.am) {
                am.am(2131034144);
            }
            this.this$0.am.clear();
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.am) {
                for (aq am : this.this$0.am) {
                    am.am(2131034144);
                }
                this.this$0.am.clear();
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/ak.run(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
