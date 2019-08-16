package com.appsflyer;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.HashMap;

final class e implements InstallReferrerStateListener {
    /* renamed from: ˋ */
    private d f134;
    /* renamed from: ˎ */
    private InstallReferrerClient f135;

    e() {
    }

    public final void onInstallReferrerServiceDisconnected() {
        AFLogger.afDebugLog("Install Referrer service disconnected");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0019 A:{SYNTHETIC, Splitter:B:4:0x0019} */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInstallReferrerSetupFinished(int i) {
        Throwable th;
        ReferrerDetails referrerDetails = null;
        HashMap hashMap = new HashMap();
        hashMap.put("code", String.valueOf(i));
        switch (i) {
            case 0:
                try {
                    AFLogger.afDebugLog("InstallReferrer connected");
                    if (!this.f135.isReady()) {
                        AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                        hashMap.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                        break;
                    }
                    referrerDetails = this.f135.getInstallReferrer();
                    try {
                        this.f135.endConnection();
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    break;
                }
            case 1:
                AFLogger.afWarnLog("InstallReferrer not supported");
                break;
            case 2:
                AFLogger.afWarnLog("InstallReferrer not supported");
                break;
            default:
                AFLogger.afWarnLog("responseCode not found.");
                break;
        }
        if (referrerDetails != null) {
            try {
                if (referrerDetails.getInstallReferrer() != null) {
                    hashMap.put("val", referrerDetails.getInstallReferrer());
                }
                hashMap.put("clk", Long.toString(referrerDetails.getReferrerClickTimestampSeconds()));
                hashMap.put("install", Long.toString(referrerDetails.getInstallBeginTimestampSeconds()));
            } catch (Exception e) {
                e.printStackTrace();
                hashMap.put("val", "-1");
                hashMap.put("clk", "-1");
                hashMap.put("install", "-1");
            }
        }
        if (this.f134 == null) {
            this.f134.onHandleReferrer(hashMap);
            return;
        }
        return;
        StringBuilder stringBuilder = new StringBuilder("Failed to get install referrer: ");
        stringBuilder.append(th.getMessage());
        AFLogger.afWarnLog(stringBuilder.toString());
        hashMap.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
        if (referrerDetails != null) {
        }
        if (this.f134 == null) {
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* renamed from: ॱ */
    public final void m113(Context context, d dVar) {
        this.f134 = dVar;
        try {
            this.f135 = InstallReferrerClient.newBuilder(context).build();
            this.f135.startConnection(this);
        } catch (Throwable th) {
            AFLogger.afErrorLog("referrerClient -> startConnection", th);
        }
    }
}
