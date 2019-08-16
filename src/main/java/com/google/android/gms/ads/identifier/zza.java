package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

final class zza extends Thread {
    private final /* synthetic */ Map zzl;

    zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.zzl = map;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        Throwable e;
        String message;
        String str;
        StringBuilder stringBuilder;
        zzc zzc = new zzc();
        Map map = this.zzl;
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, (String) map.get(str2));
        }
        String uri = buildUpon.build().toString();
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(uri).length() + 65);
                stringBuilder2.append("Received non-success response code ");
                stringBuilder2.append(responseCode);
                stringBuilder2.append(" from pinging URL: ");
                stringBuilder2.append(uri);
                Log.w("HttpUrlPinger", stringBuilder2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            message = e.getMessage();
            str = "Error while parsing ping URL: ";
            stringBuilder = new StringBuilder((String.valueOf(uri).length() + 32) + String.valueOf(message).length());
            stringBuilder.append(str);
            stringBuilder.append(uri);
            stringBuilder.append(". ");
            stringBuilder.append(message);
            Log.w("HttpUrlPinger", stringBuilder.toString(), e);
        } catch (IOException | RuntimeException e3) {
            message = e3.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(uri).length() + 27) + String.valueOf(message).length());
            str = "Error while pinging URL: ";
            e = e3;
            stringBuilder.append(str);
            stringBuilder.append(uri);
            stringBuilder.append(". ");
            stringBuilder.append(message);
            Log.w("HttpUrlPinger", stringBuilder.toString(), e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
