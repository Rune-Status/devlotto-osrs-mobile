package com.jagex.oldscape.android;

import android.app.AlertDialog.Builder;
import defpackage.go;
import defpackage.mv;

class ac implements Runnable {
    final /* synthetic */ am this$0;
    final /* synthetic */ String val$message;
    final /* synthetic */ String val$title;

    ac(am amVar, String str, String str2) {
        this.this$0 = amVar;
        this.val$title = str;
        this.val$message = str2;
    }

    public void ad() {
        new Builder(this.this$0.al).setTitle(this.val$title).setMessage(this.val$message).setPositiveButton(go.aj, null).create().show();
    }

    public void aq() {
        new Builder(this.this$0.al).setTitle(this.val$title).setMessage(this.val$message).setPositiveButton(go.aj, null).create().show();
    }

    public void run() {
        try {
            new Builder(this.this$0.al).setTitle(this.val$title).setMessage(this.val$message).setPositiveButton(go.aj, null).create().show();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ac.run(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
