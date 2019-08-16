package com.jagex.oldscape.android;

import android.app.Activity;
import android.net.Uri;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.MobileAuthService;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.config.JagexConfigBuilder;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginService;
import com.jagex.mobilesdk.notifications.LocalNotificationsManager;
import com.jagex.mobilesdk.notifications.MobileNotificationService;
import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.MobilePaymentService.PendingTransactionUpdate;
import com.jagex.mobilesdk.utils.MobileUtilsService;
import defpackage.aa;
import defpackage.ap;
import defpackage.ax;
import defpackage.az;
import defpackage.bu;
import defpackage.cm;
import defpackage.iv;
import defpackage.mv;
import java.util.HashMap;
import java.util.Map;

public class ag extends aa {
    final MobileAuthService ae;
    final PendingTransactionUpdate ag;
    final LocalNotificationsManager ai;
    final Activity aj;
    final FederatedLoginService ak;
    final MobilePaymentService am;
    az ap;
    final MobileUtilsService as;
    boolean au;

    ag(String str, String str2, String str3, Activity activity) {
        try {
            super(str, str2, str3);
            this.au = false;
            this.aj = activity;
            JagexConfig ba = ba(2129197844);
            this.ai = new LocalNotificationsManager(activity);
            this.ae = new MobileAuthService(activity, ba);
            this.am = new MobilePaymentService(activity, ba);
            this.ak = new FederatedLoginService(ba, bu.aj(1802495838), activity.getPackageName());
            this.as = new MobileUtilsService();
            this.ag = new ao(this);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aa(long j) {
        try {
            if (this.af) {
                try {
                    MobileAttributionService.setUserID(String.valueOf(j));
                } catch (Throwable th) {
                    iv.ad(null, th, 1692244937);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.aa(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ab(byte b) {
        try {
            this.am.beginPurchaseHistoryQuery();
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.ab(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void ac(String str, byte b) {
        try {
            this.as.openBrowser(this.aj, Uri.parse(str));
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.ac(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public boolean ad(int i) {
        try {
            return this.ae.isUserAuthenticated();
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
                return false;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.ad(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void ae(byte b) {
        try {
            this.ak.authenticateWithGooglePlay(this.aj);
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.ae(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public az af(int i) {
        try {
            return this.ap;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ag(cm cmVar, boolean z, int i) {
        try {
            int i2;
            switch (cmVar.al * -592100039) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 4;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            try {
                this.am.openStore(this.aj, i2, i2);
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ah(String str, Map map, int i) {
        if (str != null) {
            if (map == null) {
                try {
                    map = new HashMap();
                } catch (Throwable th) {
                    try {
                        iv.ad(null, th, 1692244937);
                        return;
                    } catch (RuntimeException e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("com/jagex/oldscape/android/ag.ah(");
                        stringBuilder.append(')');
                        throw mv.aq(e, stringBuilder.toString());
                    }
                }
            }
            MobileAttributionService.sendEvent(this.aj, str, map);
        }
    }

    public void ai(byte b) {
        try {
            throw new UnsupportedOperationException();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ap aj(String str, int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 0;
        } else if (i != CommsResult.RESULT_PENDING_TRANSACTIONS_AVAILABLE) {
            switch (i) {
                case 1401:
                    i3 = 3;
                    break;
                case 1402:
                    i3 = 1;
                    break;
                case CommsResult.RESULT_JAGEX_ACCESS_ERROR /*1403*/:
                    i3 = 5;
                    break;
                case CommsResult.RESULT_NOT_AUTHORIZED /*1404*/:
                    i3 = 4;
                    break;
                default:
                    i3 = 2;
                    break;
            }
        } else {
            i3 = 6;
        }
        try {
            return new ap(str, i3);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ak(int i) {
        try {
            this.ae.createAccount(this.aj, Uri.parse(this.ah));
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.ak(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public boolean al(int i) {
        try {
            this.ae.requestGameToken(this.aj, this.ab, new aa(this));
            return true;
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
                return false;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.al(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public boolean am(int i) {
        return true;
    }

    public void an(int i) {
        try {
            if (!this.an) {
                this.an = true;
                this.ay = null;
                try {
                    this.aj.runOnUiThread(new al(this));
                } catch (Throwable th) {
                    iv.ad(null, th, 1692244937);
                    this.ay = new ax(false);
                    this.an = false;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.an(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ao(String str, int i) {
        try {
            ah(str, null, -1987593994);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.ao(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ap(int i, int i2, int i3) {
        try {
            this.am.openStore(this.aj, i, i2);
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.ap(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void aq(byte b) {
        try {
            this.ae.logout(new ah(this));
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void ar(String str, String str2, String str3, String str4, short s) {
        try {
            this.ae.requestOAuth2Tokens(this.aj, str, str2, str3, str4, new af(this));
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.ar(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void as(int i) {
        try {
            this.am.openStore(this.aj);
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.as(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public boolean at(int i) {
        try {
            return this.am.eligibleForTrialPurchase();
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
                return false;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.at(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void au(byte b) {
        try {
            if (!this.af) {
                try {
                    MobileAttributionService.init(this.aj, "D26Pdv7QqeyK23LpPkdUAA");
                    this.af = true;
                } catch (Throwable th) {
                    iv.ad(null, th, 1692244937);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public boolean av(int i) {
        try {
            return this.am.purchaseHistoryQueryCompleted();
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
                return true;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.av(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void aw(byte b) {
        try {
            this.ai.openNotificationSettings(this.aj);
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.aw(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void ax(int i) {
        try {
            MobileNotificationService.getLatestDeviceToken(new as(this));
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.ax(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public void ay(int i) {
        try {
            if (!this.au) {
                this.au = true;
                this.ap = null;
                try {
                    this.aj.runOnUiThread(new au(this));
                } catch (Throwable th) {
                    iv.ad(null, th, 1692244937);
                    this.ap = new az(false);
                    this.au = false;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.ay(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void az(int i) {
        try {
            MobileNotificationService.initPushNotificationService(this.aj.getApplicationContext());
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.az(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public JagexConfig ba(int i) {
        try {
            JagexConfigBuilder jagexConfigBuilder = new JagexConfigBuilder(this.aj);
            jagexConfigBuilder.setClientId("com_jagex_auth_mobile_android_osrs");
            jagexConfigBuilder.setScope("gamesso.token.create payments payments.android.oldschool");
            jagexConfigBuilder.setRedirectUri("com.jagex.mobilesdk.android.osrs:/oauth2redirect");
            jagexConfigBuilder.setIssuerUri(this.aa);
            jagexConfigBuilder.setShopName("oldschool");
            jagexConfigBuilder.setPaymentUri(this.ao);
            jagexConfigBuilder.setClientSecret("public");
            return jagexConfigBuilder.build();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/ag.ba(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ap bb(String str, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else if (i != CommsResult.RESULT_PENDING_TRANSACTIONS_AVAILABLE) {
            switch (i) {
                case 1401:
                    i2 = 3;
                    break;
                case 1402:
                    i2 = 1;
                    break;
                case CommsResult.RESULT_JAGEX_ACCESS_ERROR /*1403*/:
                    i2 = 5;
                    break;
                case CommsResult.RESULT_NOT_AUTHORIZED /*1404*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 2;
                    break;
            }
        } else {
            i2 = 6;
        }
        return new ap(str, i2);
    }

    public void bc() {
        throw new UnsupportedOperationException();
    }

    public void bd(String str, String str2, String str3, String str4) {
        try {
            this.ae.requestOAuth2Tokens(this.aj, str, str2, str3, str4, new af(this));
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public boolean be() {
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public ap bf(String str, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else if (i != CommsResult.RESULT_PENDING_TRANSACTIONS_AVAILABLE) {
            switch (i) {
                case 1401:
                    i2 = 3;
                    break;
                case 1402:
                    i2 = 1;
                    break;
                case CommsResult.RESULT_JAGEX_ACCESS_ERROR /*1403*/:
                    i2 = 5;
                    break;
                case CommsResult.RESULT_NOT_AUTHORIZED /*1404*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 2;
                    break;
            }
        } else {
            i2 = 6;
        }
        return new ap(str, i2);
    }

    public void bg() {
        try {
            this.ak.authenticateWithGooglePlay(this.aj);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void bh() {
        try {
            this.ae.createAccount(this.aj, Uri.parse(this.ah));
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ap bi(String str, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else if (i != CommsResult.RESULT_PENDING_TRANSACTIONS_AVAILABLE) {
            switch (i) {
                case 1401:
                    i2 = 3;
                    break;
                case 1402:
                    i2 = 1;
                    break;
                case CommsResult.RESULT_JAGEX_ACCESS_ERROR /*1403*/:
                    i2 = 5;
                    break;
                case CommsResult.RESULT_NOT_AUTHORIZED /*1404*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 2;
                    break;
            }
        } else {
            i2 = 6;
        }
        return new ap(str, i2);
    }

    public void bj() {
        try {
            this.ae.createAccount(this.aj, Uri.parse(this.ah));
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public boolean bk(byte b) {
        try {
            return this.am.eligibleForIntroductoryPrice();
        } catch (Throwable th) {
            try {
                iv.ad(null, th, 1692244937);
                return false;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/ag.bk(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    public boolean bl() {
        try {
            this.ae.requestGameToken(this.aj, this.ab, new aa(this));
            return true;
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
            return false;
        }
    }

    public void bm() {
        try {
            this.ae.logout(new ah(this));
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void bn() {
        try {
            this.am.openStore(this.aj);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public boolean bo() {
        try {
            this.ae.requestGameToken(this.aj, this.ab, new aa(this));
            return true;
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
            return false;
        }
    }

    public void bp(cm cmVar, boolean z) {
        int i;
        switch (cmVar.al * -1050478439) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 4;
                break;
            default:
                i = 15;
                break;
        }
        try {
            this.am.openStore(this.aj, i, i);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void bq() {
        try {
            this.ae.logout(new ah(this));
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public boolean br() {
        return true;
    }

    public boolean bs() {
        try {
            return this.ae.isUserAuthenticated();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
            return false;
        }
    }

    public void bt() {
        try {
            this.ae.createAccount(this.aj, Uri.parse(this.ah));
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void bu() {
        try {
            this.ak.authenticateWithGooglePlay(this.aj);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void bv() {
        throw new UnsupportedOperationException();
    }

    public void bw() {
        try {
            this.ak.authenticateWithGooglePlay(this.aj);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void bx() {
        try {
            this.ak.authenticateWithGooglePlay(this.aj);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void by(cm cmVar, boolean z) {
        int i;
        switch (cmVar.al * -592100039) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 4;
                break;
            default:
                i = 15;
                break;
        }
        try {
            this.am.openStore(this.aj, i, i);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void bz() {
        try {
            this.am.openStore(this.aj);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void ca(long j) {
        if (this.af) {
            try {
                MobileAttributionService.setUserID(String.valueOf(j));
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        }
    }

    public void cb() {
        try {
            this.ai.openNotificationSettings(this.aj);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void cc(long j) {
        if (this.af) {
            try {
                MobileAttributionService.setUserID(String.valueOf(j));
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        }
    }

    public az cd() {
        return this.ap;
    }

    public void ce(String str) {
        try {
            this.as.openBrowser(this.aj, Uri.parse(str));
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public az cf() {
        return this.ap;
    }

    public az cg() {
        return this.ap;
    }

    public void ch() {
        if (!this.au) {
            this.au = true;
            this.ap = null;
            try {
                this.aj.runOnUiThread(new au(this));
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
                this.ap = new az(false);
                this.au = false;
            }
        }
    }

    public void ci() {
        try {
            MobileNotificationService.getLatestDeviceToken(new as(this));
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void cj(int i, int i2) {
        try {
            this.am.openStore(this.aj, i, i2);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void ck(String str, Map map) {
        if (str != null) {
            if (map == null) {
                try {
                    map = new HashMap();
                } catch (Throwable th) {
                    iv.ad(null, th, 1692244937);
                    return;
                }
            }
            MobileAttributionService.sendEvent(this.aj, str, map);
        }
    }

    public void cl(String str, Map map) {
        if (str != null) {
            if (map == null) {
                try {
                    map = new HashMap();
                } catch (Throwable th) {
                    iv.ad(null, th, 1692244937);
                    return;
                }
            }
            MobileAttributionService.sendEvent(this.aj, str, map);
        }
    }

    public void cm() {
        if (!this.af) {
            try {
                MobileAttributionService.init(this.aj, "D26Pdv7QqeyK23LpPkdUAA");
                this.af = true;
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        }
    }

    public void cn() {
        if (!this.af) {
            try {
                MobileAttributionService.init(this.aj, "D26Pdv7QqeyK23LpPkdUAA");
                this.af = true;
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        }
    }

    public void co(String str, Map map) {
        if (str != null) {
            if (map == null) {
                try {
                    map = new HashMap();
                } catch (Throwable th) {
                    iv.ad(null, th, 1692244937);
                    return;
                }
            }
            MobileAttributionService.sendEvent(this.aj, str, map);
        }
    }

    public void cp() {
        try {
            MobileNotificationService.initPushNotificationService(this.aj.getApplicationContext());
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void cq() {
        if (!this.af) {
            try {
                MobileAttributionService.init(this.aj, "D26Pdv7QqeyK23LpPkdUAA");
                this.af = true;
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        }
    }

    public void cr(long j) {
        if (this.af) {
            try {
                MobileAttributionService.setUserID(String.valueOf(j));
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        }
    }

    public void cs(long j) {
        if (this.af) {
            try {
                MobileAttributionService.setUserID(String.valueOf(j));
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        }
    }

    public void ct(String str) {
        ah(str, null, 1290255871);
    }

    public void cu(String str, Map map) {
        if (str != null) {
            if (map == null) {
                try {
                    map = new HashMap();
                } catch (Throwable th) {
                    iv.ad(null, th, 1692244937);
                    return;
                }
            }
            MobileAttributionService.sendEvent(this.aj, str, map);
        }
    }

    public void cv(int i, int i2) {
        try {
            this.am.openStore(this.aj, i, i2);
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void cw() {
        try {
            MobileNotificationService.initPushNotificationService(this.aj.getApplicationContext());
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void cx(long j) {
        if (this.af) {
            try {
                MobileAttributionService.setUserID(String.valueOf(j));
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
            }
        }
    }

    public void cy(String str) {
        try {
            this.as.openBrowser(this.aj, Uri.parse(str));
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void cz(String str, Map map) {
        if (str != null) {
            if (map == null) {
                try {
                    map = new HashMap();
                } catch (Throwable th) {
                    iv.ad(null, th, 1692244937);
                    return;
                }
            }
            MobileAttributionService.sendEvent(this.aj, str, map);
        }
    }

    public boolean da() {
        try {
            return this.am.purchaseHistoryQueryCompleted();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
            return true;
        }
    }

    public boolean db() {
        try {
            return this.am.purchaseHistoryQueryCompleted();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
            return true;
        }
    }

    public boolean dc() {
        try {
            return this.am.purchaseHistoryQueryCompleted();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
            return true;
        }
    }

    public void dd() {
        if (!this.au) {
            this.au = true;
            this.ap = null;
            try {
                this.aj.runOnUiThread(new au(this));
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
                this.ap = new az(false);
                this.au = false;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public JagexConfig de() {
        JagexConfigBuilder jagexConfigBuilder = new JagexConfigBuilder(this.aj);
        jagexConfigBuilder.setClientId("com_jagex_auth_mobile_android_osrs");
        jagexConfigBuilder.setScope("gamesso.token.create payments payments.android.oldschool");
        jagexConfigBuilder.setRedirectUri("com.jagex.mobilesdk.android.osrs:/oauth2redirect");
        jagexConfigBuilder.setIssuerUri(this.aa);
        jagexConfigBuilder.setShopName("oldschool");
        jagexConfigBuilder.setPaymentUri(this.ao);
        jagexConfigBuilder.setClientSecret("public");
        return jagexConfigBuilder.build();
    }

    public void df() {
        try {
            this.am.beginPurchaseHistoryQuery();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public JagexConfig dh() {
        JagexConfigBuilder jagexConfigBuilder = new JagexConfigBuilder(this.aj);
        jagexConfigBuilder.setClientId("com_jagex_auth_mobile_android_osrs");
        jagexConfigBuilder.setScope("gamesso.token.create payments payments.android.oldschool");
        jagexConfigBuilder.setRedirectUri("com.jagex.mobilesdk.android.osrs:/oauth2redirect");
        jagexConfigBuilder.setIssuerUri(this.aa);
        jagexConfigBuilder.setShopName("oldschool");
        jagexConfigBuilder.setPaymentUri(this.ao);
        jagexConfigBuilder.setClientSecret("public");
        return jagexConfigBuilder.build();
    }

    public void di() {
        try {
            this.am.beginPurchaseHistoryQuery();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void dl() {
        try {
            this.am.beginPurchaseHistoryQuery();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    public void dm() {
        if (!this.an) {
            this.an = true;
            this.ay = null;
            try {
                this.aj.runOnUiThread(new al(this));
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
                this.ay = new ax(false);
                this.an = false;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public JagexConfig dn() {
        JagexConfigBuilder jagexConfigBuilder = new JagexConfigBuilder(this.aj);
        jagexConfigBuilder.setClientId("com_jagex_auth_mobile_android_osrs");
        jagexConfigBuilder.setScope("gamesso.token.create payments payments.android.oldschool");
        jagexConfigBuilder.setRedirectUri("com.jagex.mobilesdk.android.osrs:/oauth2redirect");
        jagexConfigBuilder.setIssuerUri(this.aa);
        jagexConfigBuilder.setShopName("oldschool");
        jagexConfigBuilder.setPaymentUri(this.ao);
        jagexConfigBuilder.setClientSecret("public");
        return jagexConfigBuilder.build();
    }

    /* renamed from: do */
    public boolean m206do() {
        try {
            return this.am.eligibleForTrialPurchase();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
            return false;
        }
    }

    public boolean dp() {
        try {
            return this.am.eligibleForIntroductoryPrice();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
            return false;
        }
    }

    public void dr() {
        try {
            this.am.beginPurchaseHistoryQuery();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public JagexConfig ds() {
        JagexConfigBuilder jagexConfigBuilder = new JagexConfigBuilder(this.aj);
        jagexConfigBuilder.setClientId("com_jagex_auth_mobile_android_osrs");
        jagexConfigBuilder.setScope("gamesso.token.create payments payments.android.oldschool");
        jagexConfigBuilder.setRedirectUri("com.jagex.mobilesdk.android.osrs:/oauth2redirect");
        jagexConfigBuilder.setIssuerUri(this.aa);
        jagexConfigBuilder.setShopName("oldschool");
        jagexConfigBuilder.setPaymentUri(this.ao);
        jagexConfigBuilder.setClientSecret("public");
        return jagexConfigBuilder.build();
    }

    public void dt() {
        if (!this.an) {
            this.an = true;
            this.ay = null;
            try {
                this.aj.runOnUiThread(new al(this));
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
                this.ay = new ax(false);
                this.an = false;
            }
        }
    }

    public boolean du() {
        try {
            return this.am.eligibleForIntroductoryPrice();
        } catch (Throwable th) {
            iv.ad(null, th, 1692244937);
            return false;
        }
    }

    public void dv() {
        if (!this.an) {
            this.an = true;
            this.ay = null;
            try {
                this.aj.runOnUiThread(new al(this));
            } catch (Throwable th) {
                iv.ad(null, th, 1692244937);
                this.ay = new ax(false);
                this.an = false;
            }
        }
    }
}
