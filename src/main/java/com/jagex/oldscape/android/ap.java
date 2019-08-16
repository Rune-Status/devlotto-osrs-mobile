package com.jagex.oldscape.android;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import defpackage.mv;

class ap extends InputConnectionWrapper {
    final /* synthetic */ aj this$1;

    ap(aj ajVar, InputConnection inputConnection, boolean z) {
        this.this$1 = ajVar;
        super(inputConnection, z);
    }

    public boolean ad(KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.getKeyCode() == 67) {
            if (keyEvent.getAction() != 1) {
                return true;
            }
            deleteSurroundingText(1, 0);
            return true;
        } else if (keyEvent.getAction() != 0) {
            return true;
        } else {
            if (this.this$1.this$0.aj.dispatchKeyEvent(keyEvent) || super.sendKeyEvent(keyEvent)) {
                z = true;
            }
            return z;
        }
    }

    public boolean al(KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.getKeyCode() == 67) {
            if (keyEvent.getAction() != 1) {
                return true;
            }
            deleteSurroundingText(1, 0);
            return true;
        } else if (keyEvent.getAction() != 0) {
            return true;
        } else {
            if (this.this$1.this$0.aj.dispatchKeyEvent(keyEvent) || super.sendKeyEvent(keyEvent)) {
                z = true;
            }
            return z;
        }
    }

    public boolean aq(KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.getKeyCode() == 67) {
            if (keyEvent.getAction() != 1) {
                return true;
            }
            deleteSurroundingText(1, 0);
            return true;
        } else if (keyEvent.getAction() != 0) {
            return true;
        } else {
            if (this.this$1.this$0.aj.dispatchKeyEvent(keyEvent) || super.sendKeyEvent(keyEvent)) {
                z = true;
            }
            return z;
        }
    }

    public boolean ar(KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.getKeyCode() == 67) {
            if (keyEvent.getAction() != 1) {
                return true;
            }
            deleteSurroundingText(1, 0);
            return true;
        } else if (keyEvent.getAction() != 0) {
            return true;
        } else {
            if (this.this$1.this$0.aj.dispatchKeyEvent(keyEvent) || super.sendKeyEvent(keyEvent)) {
                z = true;
            }
            return z;
        }
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = false;
        try {
            if (keyEvent.getKeyCode() == 67) {
                if (keyEvent.getAction() != 1) {
                    return true;
                }
                deleteSurroundingText(1, 0);
                return true;
            } else if (keyEvent.getAction() != 0) {
                return true;
            } else {
                if (this.this$1.this$0.aj.dispatchKeyEvent(keyEvent) || super.sendKeyEvent(keyEvent)) {
                    z = true;
                }
                return z;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ap.sendKeyEvent(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
