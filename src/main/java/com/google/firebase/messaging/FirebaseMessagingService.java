package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.firebase_messaging.zzac;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzab;
import com.google.firebase.iid.zzav;
import com.google.firebase.iid.zzb;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseMessagingService extends zzb {
    private static final Queue<String> zzdv = new ArrayDeque(10);

    @WorkerThread
    public void onDeletedMessages() {
    }

    @WorkerThread
    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    @WorkerThread
    public void onMessageSent(String str) {
    }

    @WorkerThread
    public void onNewToken(String str) {
    }

    @WorkerThread
    public void onSendError(String str, Exception exception) {
    }

    /* Access modifiers changed, original: protected|final */
    public final Intent zzb(Intent intent) {
        return zzav.zzai().zzaj();
    }

    public final boolean zzc(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException e) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (MessagingAnalytics.shouldUploadMetrics(intent)) {
            MessagingAnalytics.logNotificationOpen(intent);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Missing block: B:60:0x011b, code skipped:
            if (r1.equals("send_event") == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(Intent intent) {
        int i = 2;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            Task forResult;
            String stringExtra = intent.getStringExtra("google.message_id");
            if (TextUtils.isEmpty(stringExtra)) {
                forResult = Tasks.forResult(null);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("google.message_id", stringExtra);
                forResult = zzab.zzc(this).zza(2, bundle);
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                if (zzdv.contains(stringExtra)) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        stringExtra = String.valueOf(stringExtra);
                        Log.d("FirebaseMessaging", stringExtra.length() != 0 ? "Received duplicate message: ".concat(stringExtra) : new String("Received duplicate message: "));
                    }
                    int i2 = 1;
                    if (i2 == null) {
                        stringExtra = intent.getStringExtra("message_type");
                        if (stringExtra == null) {
                            stringExtra = "gcm";
                        }
                        int hashCode = stringExtra.hashCode();
                        if (hashCode == -2062414158) {
                            if (stringExtra.equals("deleted_messages")) {
                                i = 1;
                                switch (i) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } else if (hashCode == 102161) {
                            if (stringExtra.equals("gcm")) {
                                i = 0;
                                switch (i) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } else if (hashCode == 814694033) {
                            if (stringExtra.equals("send_error")) {
                                i = 3;
                                switch (i) {
                                    case 0:
                                        if (MessagingAnalytics.shouldUploadMetrics(intent)) {
                                            MessagingAnalytics.logNotificationReceived(intent);
                                        }
                                        Bundle extras = intent.getExtras();
                                        if (extras == null) {
                                            extras = new Bundle();
                                        }
                                        extras.remove("android.support.content.wakelockid");
                                        if (zzac.zzj(extras)) {
                                            if (!new zza(this, extras).zzar()) {
                                                if (MessagingAnalytics.shouldUploadMetrics(intent)) {
                                                    MessagingAnalytics.logNotificationForeground(intent);
                                                }
                                            }
                                        }
                                        onMessageReceived(new RemoteMessage(extras));
                                        break;
                                    case 1:
                                        onDeletedMessages();
                                        break;
                                    case 2:
                                        onMessageSent(intent.getStringExtra("google.message_id"));
                                        break;
                                    case 3:
                                        stringExtra = intent.getStringExtra("google.message_id");
                                        if (stringExtra == null) {
                                            stringExtra = intent.getStringExtra("message_id");
                                        }
                                        onSendError(stringExtra, new SendException(intent.getStringExtra("error")));
                                        break;
                                    default:
                                        stringExtra = String.valueOf(stringExtra);
                                        Log.w("FirebaseMessaging", stringExtra.length() != 0 ? "Received message with unknown type: ".concat(stringExtra) : new String("Received message with unknown type: "));
                                        break;
                                }
                            }
                        } else if (hashCode == 814800675) {
                        }
                        i = -1;
                        switch (i) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                break;
                        }
                    }
                    Tasks.await(forResult, 1, TimeUnit.SECONDS);
                }
                if (zzdv.size() >= 10) {
                    zzdv.remove();
                }
                zzdv.add(stringExtra);
            }
            Object i22 = null;
            if (i22 == null) {
            }
            try {
                Tasks.await(forResult, 1, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                action = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(action).length() + 20);
                stringBuilder.append("Message ack failed: ");
                stringBuilder.append(action);
                Log.w("FirebaseMessaging", stringBuilder.toString());
            }
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (MessagingAnalytics.shouldUploadMetrics(intent)) {
                MessagingAnalytics.logNotificationDismiss(intent);
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            onNewToken(intent.getStringExtra(CommsUtils.HTTP_PARAM_TOKEN));
        } else {
            action = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", action.length() != 0 ? "Unknown intent action: ".concat(action) : new String("Unknown intent action: "));
        }
    }
}
