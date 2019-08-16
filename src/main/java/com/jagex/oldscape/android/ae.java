package com.jagex.oldscape.android;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import defpackage.mv;

class ae implements OnFocusChangeListener {
    final /* synthetic */ AndroidLauncher this$0;

    ae(AndroidLauncher androidLauncher) {
        this.this$0 = androidLauncher;
    }

    public void ad(View view, boolean z) {
        if (z) {
            this.this$0.ar(-2119554016);
        }
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            try {
                this.this$0.ar(-1526830798);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ae.onFocusChange(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }
}
