package com.jagex.oldscape.android;

import defpackage.mv;
import java.io.OutputStream;
import java.io.PrintStream;

class ak extends PrintStream {
    final /* synthetic */ AndroidLauncher this$0;

    ak(AndroidLauncher androidLauncher, OutputStream outputStream) {
        this.this$0 = androidLauncher;
        super(outputStream);
    }

    public void ad(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.jagex.oldscape: ");
        stringBuilder.append(str);
        super.println(stringBuilder.toString());
    }

    public void println(String str) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com.jagex.oldscape: ");
            stringBuilder.append(str);
            super.println(stringBuilder.toString());
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("com/jagex/oldscape/android/ak.println(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }
}
