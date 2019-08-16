package com.jagex.mobilesdk.auth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class JagexCompatActivity extends AppCompatActivity {
    public static final String EXTRA_ERROR_MESSAGE;
    public static final String EXTRA_EXCEPTION_CLASS;
    public static final String EXTRA_EXCEPTION_MESSAGE;
    private static final String PACKAGE_NAME = JagexCompatActivity.class.getPackage().getName();

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".ERROR_MESSAGE");
        EXTRA_ERROR_MESSAGE = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".EXCEPTION_CLASS");
        EXTRA_EXCEPTION_CLASS = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".EXCEPTION_MESSAGE");
        EXTRA_EXCEPTION_MESSAGE = stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public void finish(int i) {
        finish(i, null);
    }

    /* Access modifiers changed, original: protected */
    public void finish(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    /* Access modifiers changed, original: protected */
    public void finishWithError(int i, String str, Exception exception) {
        Intent intent = new Intent();
        String str2 = "";
        String str3 = "";
        if (exception != null) {
            str2 = exception.getClass().toString();
            str3 = exception.getMessage();
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str == null) {
            str = "";
        }
        intent.putExtra(EXTRA_EXCEPTION_CLASS, str2).putExtra(EXTRA_EXCEPTION_MESSAGE, str3).putExtra(EXTRA_ERROR_MESSAGE, str);
        finish(i, intent);
    }
}
