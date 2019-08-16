package com.jagex.oldscape.android;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import defpackage.mv;

class aj extends EditText {
    final /* synthetic */ ay this$0;

    aj(ay ayVar, Context context) {
        this.this$0 = ayVar;
        super(context);
    }

    public InputConnection ad(EditorInfo editorInfo) {
        return new ap(this, super.onCreateInputConnection(editorInfo), true);
    }

    public boolean al() {
        return true;
    }

    public boolean aq() {
        return true;
    }

    public boolean ar() {
        return true;
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        try {
            return new ap(this, super.onCreateInputConnection(editorInfo), true);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/aj.onCreateInputConnection(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
