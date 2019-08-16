package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

final class d {
    /* renamed from: ˏ */
    private String f267;

    d() {
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final void m192(String str) {
        this.f267 = str;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ॱ */
    public final void m193(Context context) {
        if (this.f267 != null) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f267)).setFlags(268435456));
        }
    }
}
