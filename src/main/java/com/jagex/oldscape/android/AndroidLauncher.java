package com.jagex.oldscape.android;

import android.app.NativeActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.util.DisplayMetrics;
import android.view.View;
import com.jagex.android.AndroidKeyboard;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginService;
import defpackage.ap;
import defpackage.au;
import defpackage.client;
import defpackage.dw;
import defpackage.jb;
import defpackage.lo;
import defpackage.mv;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidLauncher extends NativeActivity {
    static client ad;
    am aq;

    public static void init() {
        ad.acq(-2001472406);
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(String str, int i) {
        try {
            ad = new client();
            ad.ax = true;
            ad.abc(2, -1347894552);
            ad.ap("https://oldschool.runescape.com/slr.ws?order=LPWM", MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            this.aq = new am(this);
            this.aq.ba(false, 2017067155);
            ad.abf(this.aq, -995341401);
            try {
                ad.adg(new jb(new URL(this.aq.gn(str, -697803364))), (short) 20423);
                ad.ak(-1566816238);
            } catch (MalformedURLException e) {
            }
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/AndroidLauncher.ad(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(String str) {
        ad = new client();
        ad.ax = true;
        ad.abc(2, -1347894552);
        ad.ap("https://oldschool.runescape.com/slr.ws?order=LPWM", MotionEventCompat.ACTION_POINTER_INDEX_MASK);
        this.aq = new am(this);
        this.aq.ba(false, -659103144);
        ad.abf(this.aq, -995341401);
        try {
            ad.adg(new jb(new URL(this.aq.gn(str, -1643615909))), (short) 17091);
            ad.ak(-2125070734);
        } catch (MalformedURLException e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.keySet().contains("google.message_id")) {
                ad.aa(new lo().ad(intent, -789943118), 2131099922);
            }
        }
    }

    public void ai() {
        super.onDestroy();
        ad.adu((byte) 21);
        ad = null;
        this.aq.ar((byte) 0);
        System.exit(0);
    }

    public void aj() {
        super.onDestroy();
        ad.adu((byte) 53);
        ad = null;
        this.aq.ar((byte) 0);
        System.exit(0);
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(String str) {
        ad = new client();
        ad.ax = true;
        ad.abc(2, -1347894552);
        ad.ap("https://oldschool.runescape.com/slr.ws?order=LPWM", MotionEventCompat.ACTION_POINTER_INDEX_MASK);
        this.aq = new am(this);
        this.aq.ba(false, -1381450559);
        ad.abf(this.aq, -995341401);
        try {
            ad.adg(new jb(new URL(this.aq.gn(str, -679226934))), (short) 16476);
            ad.ak(-1783025369);
        } catch (MalformedURLException e) {
        }
    }

    public void al() {
        super.onDestroy();
        ad.adu((byte) 32);
        ad = null;
        this.aq.ar((byte) 0);
        System.exit(0);
    }

    /* Access modifiers changed, original: 0000 */
    public void am(String str) {
        ad = new client();
        ad.ax = true;
        ad.abc(2, -1347894552);
        ad.ap("https://oldschool.runescape.com/slr.ws?order=LPWM", MotionEventCompat.ACTION_POINTER_INDEX_MASK);
        this.aq = new am(this);
        this.aq.ba(false, -757230686);
        ad.abf(this.aq, -995341401);
        try {
            ad.adg(new jb(new URL(this.aq.gn(str, 2032769440))), (short) 28019);
            ad.ak(-1698891846);
        } catch (MalformedURLException e) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.keySet().contains("google.message_id")) {
                ad.aa(new lo().ad(intent, 1361064862), 2131099922);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(Intent intent, int i) {
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && extras.keySet().contains("google.message_id")) {
                    ad.aa(new lo().ad(intent, 595018106), 2131099922);
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/AndroidLauncher.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i) {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5895);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/AndroidLauncher.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.keySet().contains("google.message_id")) {
                ad.aa(new lo().ad(intent, 399055451), 2131099922);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.keySet().contains("google.message_id")) {
                ad.aa(new lo().ad(intent, 1794721530), 2131099922);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aw() {
        getWindow().getDecorView().setSystemUiVisibility(5895);
    }

    /* Access modifiers changed, original: 0000 */
    public void ax() {
        getWindow().getDecorView().setSystemUiVisibility(-1000676089);
    }

    /* Access modifiers changed, original: 0000 */
    public void az() {
        getWindow().getDecorView().setSystemUiVisibility(5895);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            super.onActivityResult(i, i2, intent);
            if (i == MobileAuthServiceListener.REQUEST_GOOGLE_LOGIN && intent != null) {
                if (i2 == 0) {
                    String stringExtra = intent.getStringExtra(FederatedLoginService.EXTRA_ONE_TIME_LOGIN_TOKEN);
                    dw.ez.ao(new au(true, -1), (byte) 0);
                    dw.ez.az(new ap(stringExtra, 0), 1878023417);
                } else if (i2 != 1402) {
                    dw.ez.ao(new au(false, 2), (byte) 0);
                } else {
                    dw.ez.ao(new au(false, 1), (byte) 0);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/AndroidLauncher.onActivityResult(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void onCreate(Bundle bundle) {
        try {
            System.setOut(new ak(this, System.out));
            AndroidKeyboard.SetupMainActivity(this);
            getWindow().setFormat(3);
            super.onCreate(bundle);
            Intent intent = getIntent();
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            String string = getString(R.string.jav_config_url);
            if (intent != null) {
                Uri data = intent.getData();
                String action = intent.getAction();
                if (!(data == null || action == null || !action.equals("android.intent.action.VIEW"))) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("https://");
                    stringBuilder.append(data.toString().split("//")[1]);
                    string = stringBuilder.toString().replace(":7", ":50");
                }
            }
            ad(string, -2100383905);
            aq(intent, 1103447693);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("com/jagex/oldscape/android/AndroidLauncher.onCreate(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    public void onDestroy() {
        try {
            super.onDestroy();
            ad.adu((byte) 61);
            ad = null;
            this.aq.ar((byte) 0);
            System.exit(0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/AndroidLauncher.onDestroy(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void onPause() {
        try {
            ad.adx((byte) 29);
            this.aq.al((byte) 59);
            ad.hu(1223423311);
            super.onPause();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/AndroidLauncher.onPause(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void onResume() {
        try {
            super.onResume();
            View decorView = getWindow().getDecorView();
            decorView.setFocusableInTouchMode(true);
            ar(-1833999923);
            this.aq.aj(2143515832);
            decorView.setOnSystemUiVisibilityChangeListener(new ai(this));
            decorView.setOnFocusChangeListener(new ae(this));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/AndroidLauncher.onResume(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
