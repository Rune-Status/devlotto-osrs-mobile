package com.jagex.oldscape.android;

import android.view.View.OnSystemUiVisibilityChangeListener;
import defpackage.mv;

class ai implements OnSystemUiVisibilityChangeListener {
    final /* synthetic */ AndroidLauncher this$0;

    ai(AndroidLauncher androidLauncher) {
        this.this$0 = androidLauncher;
    }

    public void ad(int i) {
        this.this$0.ar(-863893923);
    }

    public void aq(int i) {
        this.this$0.ar(-1567460229);
    }

    public void ar(int i) {
        this.this$0.ar(-1781628839);
    }

    public void onSystemUiVisibilityChange(int i) {
        try {
            this.this$0.ar(-1167593782);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ai.onSystemUiVisibilityChange(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
