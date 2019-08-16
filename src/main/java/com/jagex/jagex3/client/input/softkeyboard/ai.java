package com.jagex.jagex3.client.input.softkeyboard;

import defpackage.mv;

class ai implements Runnable {
    final /* synthetic */ al this$0;
    final /* synthetic */ int val$type;

    ai(al alVar, int i) {
        this.this$0 = alVar;
        this.val$type = i;
    }

    public void ad() {
        switch (this.val$type) {
            case 0:
                this.this$0.ad(-2078466695);
                return;
            case 1:
                this.this$0.aq(1930503577);
                return;
            case 2:
                this.this$0.ar(-1795137746);
                return;
            case 3:
                this.this$0.al(-1396381581);
                return;
            default:
                return;
        }
    }

    public void aq() {
        switch (this.val$type) {
            case 0:
                this.this$0.ad(-1994555885);
                return;
            case 1:
                this.this$0.aq(1930503577);
                return;
            case 2:
                this.this$0.ar(739029283);
                return;
            case 3:
                this.this$0.al(1480070231);
                return;
            default:
                return;
        }
    }

    public void run() {
        StringBuilder stringBuilder;
        try {
            switch (this.val$type) {
                case 0:
                    this.this$0.ad(-2067989365);
                    return;
                case 1:
                    this.this$0.aq(1930503577);
                    return;
                case 2:
                    this.this$0.ar(1048980083);
                    return;
                case 3:
                    this.this$0.al(1250799883);
                    return;
                default:
                    return;
            }
        } catch (RuntimeException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/ai.run(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/ai.run(");
        stringBuilder.append(')');
        throw mv.aq(e, stringBuilder.toString());
    }
}
