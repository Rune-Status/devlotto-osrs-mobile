package com.jagex.oldscape.android;

import android.view.inputmethod.InputMethodManager;
import com.jagex.jagex3.client.input.softkeyboard.al;
import defpackage.lp;
import defpackage.mv;

public class ar extends al {
    final AndroidLauncher ad;

    ar(AndroidLauncher androidLauncher, int i, lp lpVar) {
        try {
            super(lpVar);
            this.ad = androidLauncher;
            aa(i, 43085959);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ar.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ac() {
        super.aj((byte) 99);
        ((InputMethodManager) this.ad.getSystemService("input_method")).hideSoftInputFromWindow(this.ad.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void ad(int i) {
        try {
            ay ayVar = new ay(this.ad, this.ai, 33, 5);
            ay ayVar2 = new ay(this.ad, this.ai, 129, 6);
            ayVar.aq(1866155994);
            ayVar2.ar(592246649);
            ah(ayVar, 1582536314);
            ah(ayVar2, 1793740319);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ar.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ae() {
        ay ayVar = new ay(this.ad, this.ai, -2131385816, 5);
        ay ayVar2 = new ay(this.ad, this.ai, -744000492, 6);
        ayVar.aq(1547883189);
        ayVar2.ar(-1246699472);
        ah(ayVar, 1314832472);
        ah(ayVar2, 1676536230);
    }

    public void ag() {
        ah(new ay(this.ad, this.ai, 1, 6), 2074230391);
    }

    public void ai() {
        ay ayVar = new ay(this.ad, this.ai, 33, 5);
        ay ayVar2 = new ay(this.ad, this.ai, 129, 6);
        ayVar.aq(1528644713);
        ayVar2.ar(-2000268673);
        ah(ayVar, 1920861770);
        ah(ayVar2, 1776974022);
    }

    public void aj(byte b) {
        try {
            super.aj((byte) 55);
            ((InputMethodManager) this.ad.getSystemService("input_method")).hideSoftInputFromWindow(this.ad.getWindow().getDecorView().getWindowToken(), 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ar.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ak() {
        ah(new ay(this.ad, this.ai, 2, 6), 1550483195);
    }

    public void al(int i) {
        try {
            ah(new ay(this.ad, this.ai, 33, 6), 1605440489);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ar.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void am() {
        ay ayVar = new ay(this.ad, this.ai, 33, 5);
        ay ayVar2 = new ay(this.ad, this.ai, 129, 6);
        ayVar.aq(1560322991);
        ayVar2.ar(-725623499);
        ah(ayVar, 1896732355);
        ah(ayVar2, 1422338126);
    }

    public void ap() {
        ah(new ay(this.ad, this.ai, 1, 6), 1490507349);
    }

    public void aq(int i) {
        try {
            ah(new ay(this.ad, this.ai, 2, 6), 1673570487);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ar.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ar(int i) {
        try {
            ah(new ay(this.ad, this.ai, 1, 6), 2033151427);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ar.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as() {
        ah(new ay(this.ad, this.ai, 2, 6), 2065137531);
    }

    public void au() {
        ah(new ay(this.ad, this.ai, 1, 6), 1709663875);
    }

    public void aw() {
        super.aj((byte) -43);
        ((InputMethodManager) this.ad.getSystemService("input_method")).hideSoftInputFromWindow(this.ad.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void ax() {
        ah(new ay(this.ad, this.ai, 33, 6), 1688410964);
    }

    public void az() {
        ah(new ay(this.ad, this.ai, 33, 6), 1543880702);
    }
}
