package com.jagex.oldscape.android;

import android.app.Activity;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.jagex.jagex3.client.input.softkeyboard.ad;
import com.jagex.jagex3.client.input.softkeyboard.aq;
import defpackage.mv;

public class ay extends aq implements TextWatcher, OnEditorActionListener, OnFocusChangeListener {
    static final String ad = "ProgrammaticEdit";
    static final LayoutParams aq = new LayoutParams(-2, -2);
    final EditText aj;
    final ad al;
    final Activity ar;

    ay(Activity activity, ad adVar, int i, int i2) {
        try {
            this.ar = activity;
            this.al = adVar;
            this.aj = as(-244479994);
            activity.addContentView(this.aj, aq);
            this.aj.addTextChangedListener(this);
            this.aj.setInputType(i);
            this.aj.setImeOptions(268435456 | i2);
            this.aj.setOnEditorActionListener(this);
            this.aj.setOnFocusChangeListener(this);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aa() {
        this.aj.bringToFront();
        this.aj.requestFocus();
        ((InputMethodManager) this.ar.getSystemService("input_method")).showSoftInput(this.aj, 0);
    }

    public void ab() {
        this.aj.clearFocus();
        ((ViewGroup) this.aj.getParent()).removeView(this.aj);
    }

    public void ac() {
        this.aj.bringToFront();
        this.aj.requestFocus();
        ((InputMethodManager) this.ar.getSystemService("input_method")).showSoftInput(this.aj, 0);
    }

    public void ad(View view, boolean z) {
        if (z) {
            this.al.ap(this.ai * 1811775569, -383130646);
        }
    }

    public void ae(int i) {
        try {
            this.aj.setTag(ad);
            this.aj.setFilters(new InputFilter[0]);
            this.aj.setText("");
            this.aj.setTag(null);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void af() {
        this.aj.setTag(ad);
        this.aj.setFilters(new InputFilter[0]);
        this.aj.setText("");
        this.aj.setTag(null);
    }

    public void afterTextChanged(Editable editable) {
        try {
            if (!ad.equals(this.aj.getTag())) {
                this.al.ak(this.ae, editable.toString(), (byte) 91);
                this.aj.setSelection(this.aj.getText().length());
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.afterTextChanged(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag() {
        if (VERSION.SDK_INT >= 26) {
            this.aj.setAutofillHints(new String[]{"password"});
        }
    }

    public void ah() {
        this.aj.setTag(ad);
        this.aj.setFilters(new InputFilter[0]);
        this.aj.setText("");
        this.aj.setTag(null);
    }

    public void ai(int i) {
        try {
            this.aj.bringToFront();
            this.aj.requestFocus();
            ((InputMethodManager) this.ar.getSystemService("input_method")).showSoftInput(this.aj, 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean aj(byte b) {
        try {
            return this.aj.hasFocus();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ak(int i, int i2) {
        try {
            this.aj.setFilters(new InputFilter[]{new LengthFilter(i)});
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void al(String str, byte b) {
        try {
            this.aj.setTag(ad);
            this.aj.setText(str);
            this.aj.setSelection(this.aj.getText().length());
            this.aj.setTag(null);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void am(int i) {
        try {
            this.aj.clearFocus();
            ((ViewGroup) this.aj.getParent()).removeView(this.aj);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void an() {
        this.aj.clearFocus();
        ((ViewGroup) this.aj.getParent()).removeView(this.aj);
    }

    public void ao() {
        this.aj.bringToFront();
        this.aj.requestFocus();
        ((InputMethodManager) this.ar.getSystemService("input_method")).showSoftInput(this.aj, 0);
    }

    /* Access modifiers changed, original: 0000 */
    public void ap() {
        if (VERSION.SDK_INT >= 26) {
            this.aj.setAutofillHints(new String[]{"password"});
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(int i) {
        try {
            if (VERSION.SDK_INT >= 26) {
                this.aj.setAutofillHints(new String[]{"username"});
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i) {
        try {
            if (VERSION.SDK_INT >= 26) {
                this.aj.setAutofillHints(new String[]{"password"});
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public EditText as(int i) {
        try {
            return new aj(this, this.ar);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void at(int i) {
        this.aj.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void au(String str) {
        this.aj.setTag(ad);
        this.aj.setText(str);
        this.aj.setSelection(this.aj.getText().length());
        this.aj.setTag(null);
    }

    public void av() {
        this.aj.clearFocus();
        ((ViewGroup) this.aj.getParent()).removeView(this.aj);
    }

    public boolean aw() {
        return this.aj.hasFocus();
    }

    public boolean ax() {
        return this.aj.hasFocus();
    }

    public void ay() {
        this.aj.setTag(ad);
        this.aj.setFilters(new InputFilter[0]);
        this.aj.setText("");
        this.aj.setTag(null);
    }

    public boolean az() {
        return this.aj.hasFocus();
    }

    public void ba(int i) {
        this.aj.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void bb(Editable editable) {
        if (!ad.equals(this.aj.getTag())) {
            this.al.ak(this.ae, editable.toString(), (byte) 32);
            this.aj.setSelection(this.aj.getText().length());
        }
    }

    public boolean bc(TextView textView, int i, KeyEvent keyEvent) {
        if (5 == i) {
            this.al.as(1396316418);
            return true;
        } else if (6 != i) {
            return false;
        } else {
            this.al.ag(-1190983618);
            return true;
        }
    }

    public void bd(CharSequence charSequence, int i, int i2, int i3) {
        this.ae = charSequence.toString();
        this.al.ap(this.ai * -1924957314, -383130646);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            this.ae = charSequence.toString();
            this.al.ap(this.ai * 1811775569, -383130646);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ay.beforeTextChanged(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void bf(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void bi(Editable editable) {
        if (!ad.equals(this.aj.getTag())) {
            this.al.ak(this.ae, editable.toString(), (byte) 28);
            this.aj.setSelection(this.aj.getText().length());
        }
    }

    public void bk(int i) {
        this.aj.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void bl(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void bm(int i) {
        this.aj.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void bo(CharSequence charSequence, int i, int i2, int i3) {
        this.ae = charSequence.toString();
        this.al.ap(this.ai * 1811775569, -383130646);
    }

    public void bq(CharSequence charSequence, int i, int i2, int i3) {
        this.ae = charSequence.toString();
        this.al.ap(this.ai * 1811775569, -383130646);
    }

    public void bs(int i) {
        this.aj.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    /* Access modifiers changed, original: 0000 */
    public EditText bv() {
        return new aj(this, this.ar);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (5 == i) {
            try {
                this.al.as(-254729250);
                return true;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ay.onEditorAction(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        } else if (6 != i) {
            return false;
        } else {
            this.al.ag(-1815419748);
            return true;
        }
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            try {
                this.al.ap(this.ai * 1811775569, -383130646);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ay.onFocusChange(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
