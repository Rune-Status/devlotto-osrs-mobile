package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zzd implements Runnable {
    private static final Logger zzbd = new Logger("RevokeAccessOperation", new String[0]);
    private final String zzbe;
    private final StatusPendingResult zzbf = new StatusPendingResult(null);

    private zzd(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzbe = str;
    }

    public static PendingResult<Status> zzc(String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        zzd zzd = new zzd(str);
        new Thread(zzd).start();
        return zzd.zzbf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        Result result;
        IOException e;
        Result result2;
        Logger logger;
        Exception e2;
        Status status = Status.RESULT_INTERNAL_ERROR;
        String valueOf;
        Object result3;
        try {
            String valueOf2 = String.valueOf("https://accounts.google.com/o/oauth2/revoke?token=");
            valueOf = String.valueOf(this.zzbe);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2)).openConnection();
            httpURLConnection.setRequestProperty(CommsUtils.HTTP_HEADER_CONTENT_TYPE, CommsUtils.HTTP_HEADER_ACCEPT_FORM_URLENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                result3 = Status.RESULT_SUCCESS;
            } else {
                zzbd.e("Unable to revoke access!", new Object[0]);
                result3 = status;
            }
            try {
                Logger logger2 = zzbd;
                StringBuilder stringBuilder = new StringBuilder(26);
                stringBuilder.append("Response Code: ");
                stringBuilder.append(responseCode);
                logger2.d(stringBuilder.toString(), new Object[0]);
            } catch (IOException e3) {
                e = e3;
                result2 = result3;
                logger = zzbd;
                valueOf = String.valueOf(e.toString());
                logger.e(valueOf.length() != 0 ? "IOException when revoking access: ".concat(valueOf) : new String("IOException when revoking access: "), new Object[0]);
                result3 = status;
                this.zzbf.setResult(result3);
            } catch (Exception e4) {
                e2 = e4;
                result2 = result3;
                logger = zzbd;
                valueOf = String.valueOf(e2.toString());
                if (valueOf.length() == 0) {
                }
                logger.e(valueOf.length() == 0 ? "Exception when revoking access: ".concat(valueOf) : new String("Exception when revoking access: "), new Object[0]);
                result3 = status;
                this.zzbf.setResult(result3);
            }
        } catch (IOException e5) {
            e = e5;
        } catch (Exception e6) {
            e2 = e6;
            logger = zzbd;
            valueOf = String.valueOf(e2.toString());
            logger.e(valueOf.length() == 0 ? "Exception when revoking access: ".concat(valueOf) : new String("Exception when revoking access: "), new Object[0]);
            result3 = status;
            this.zzbf.setResult(result3);
        }
        this.zzbf.setResult(result3);
    }
}
