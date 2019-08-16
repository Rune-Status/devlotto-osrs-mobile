package com.jagex.android;

import android.app.NativeActivity;
import android.view.KeyCharacterMap;
import android.view.inputmethod.InputMethodManager;
import defpackage.mv;

public class AndroidKeyboard {
    static NativeActivity ad;
    static KeyCharacterMap aq;
    static int ar;

    AndroidKeyboard() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/android/AndroidKeyboard.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void Hide() {
        try {
            ((InputMethodManager) ad.getSystemService("input_method")).hideSoftInputFromWindow(ad.getWindow().getDecorView().getWindowToken(), 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/android/AndroidKeyboard.Hide(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static boolean IsVisible() {
        try {
            return ((InputMethodManager) ad.getSystemService("input_method")).isAcceptingText();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/android/AndroidKeyboard.IsVisible(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int KeyCodeToUnicodeCharacter(int i, int i2) {
        try {
            return KeyCodeToUnicodeCharacter(i, i2, ar * -935422957);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/android/AndroidKeyboard.KeyCodeToUnicodeCharacter(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static int KeyCodeToUnicodeCharacter(int i, int i2, int i3) {
        try {
            if (aq == null || ar * -935422957 != i3) {
                aq = KeyCharacterMap.load(i3);
                ar = -1699195365 * i3;
            }
            return aq.get(i, i2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/android/AndroidKeyboard.KeyCodeToUnicodeCharacter(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void SetupMainActivity(NativeActivity nativeActivity) {
        try {
            ad = nativeActivity;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/android/AndroidKeyboard.SetupMainActivity(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void Show() {
        try {
            ((InputMethodManager) ad.getSystemService("input_method")).showSoftInput(ad.getWindow().getDecorView(), 2);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/android/AndroidKeyboard.Show(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
