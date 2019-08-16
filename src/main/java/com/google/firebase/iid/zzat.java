package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzl.zza;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

final class zzat {
    private static int zzcj;
    private static PendingIntent zzcv;
    private final Context zzac;
    private final zzan zzas;
    @GuardedBy("responseCallbacks")
    private final SimpleArrayMap<String, TaskCompletionSource<Bundle>> zzcw = new SimpleArrayMap();
    private Messenger zzcx;
    private Messenger zzcy;
    private zzl zzcz;

    public zzat(Context context, zzan zzan) {
        this.zzac = context;
        this.zzas = zzan;
        this.zzcx = new Messenger(new zzau(this, Looper.getMainLooper()));
    }

    private static void zza(Context context, Intent intent) {
        synchronized (zzat.class) {
            try {
                if (zzcv == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    zzcv = PendingIntent.getBroadcast(context, 0, intent2, 0);
                }
                Object obj = "app";
                intent.putExtra(obj, zzcv);
            } finally {
                Class cls = zzat.class;
            }
        }
    }

    private final void zza(String str, Bundle bundle) {
        synchronized (this.zzcw) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zzcw.remove(str);
            if (taskCompletionSource == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            taskCompletionSource.setResult(bundle);
        }
    }

    private static String zzah() {
        synchronized (zzat.class) {
            int i;
            try {
                int i2 = zzcj;
                i = i2 + 1;
                zzcj = i;
                String num = Integer.toString(i2);
                return num;
            } finally {
                i = zzat.class;
            }
        }
    }

    private final void zzb(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("FirebaseInstanceId", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new zza());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof zzl) {
                this.zzcz = (zzl) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                this.zzcy = (Messenger) parcelableExtra;
            }
        }
        intent = (Intent) message.obj;
        String action = intent.getAction();
        String valueOf;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            CharSequence stringExtra = intent.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("unregistered");
            }
            String stringExtra2;
            if (stringExtra == null) {
                stringExtra2 = intent.getStringExtra("error");
                if (stringExtra2 == null) {
                    valueOf = String.valueOf(intent.getExtras());
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    stringBuilder.append("Unexpected response, no error or registration id ");
                    stringBuilder.append(valueOf);
                    Log.w("FirebaseInstanceId", stringBuilder.toString());
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    action = String.valueOf(stringExtra2);
                    Log.d("FirebaseInstanceId", action.length() != 0 ? "Received InstanceID error ".concat(action) : new String("Received InstanceID error "));
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length <= 2 || !"ID".equals(split[1])) {
                        valueOf = String.valueOf(stringExtra2);
                        Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Unexpected structured response ".concat(valueOf) : new String("Unexpected structured response "));
                        return;
                    }
                    stringExtra2 = split[2];
                    action = split[3];
                    if (action.startsWith(":")) {
                        action = action.substring(1);
                    }
                    zza(stringExtra2, intent.putExtra("error", action).getExtras());
                    return;
                }
                synchronized (this.zzcw) {
                    for (int i = 0; i < this.zzcw.size(); i++) {
                        zza((String) this.zzcw.keyAt(i), intent.getExtras());
                    }
                }
                return;
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (matcher.matches()) {
                action = matcher.group(1);
                stringExtra2 = matcher.group(2);
                Bundle extras = intent.getExtras();
                extras.putString("registration_id", stringExtra2);
                zza(action, extras);
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                valueOf = String.valueOf(stringExtra);
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Unexpected response string: ".concat(valueOf) : new String("Unexpected response string: "));
            }
        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
            valueOf = String.valueOf(action);
            Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
        }
    }

    private final Bundle zzd(Bundle bundle) throws IOException {
        Bundle zze = zze(bundle);
        if (zze == null || !zze.containsKey("google.messenger")) {
            return zze;
        }
        zze = zze(bundle);
        return (zze == null || !zze.containsKey("google.messenger")) ? zze : null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bf A:{SYNTHETIC} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Bundle zze(Bundle bundle) throws IOException {
        String zzah = zzah();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.zzcw) {
            this.zzcw.put(zzah, taskCompletionSource);
        }
        if (this.zzas.zzac() != 0) {
            Bundle bundle2;
            Intent intent = new Intent();
            intent.setPackage("com.google.android.gms");
            if (this.zzas.zzac() == 2) {
                intent.setAction("com.google.iid.TOKEN_REQUEST");
            } else {
                intent.setAction("com.google.android.c2dm.intent.REGISTER");
            }
            intent.putExtras(bundle);
            zza(this.zzac, intent);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzah).length() + 5);
            stringBuilder.append("|ID|");
            stringBuilder.append(zzah);
            stringBuilder.append("|");
            intent.putExtra("kid", stringBuilder.toString());
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
                stringBuilder2.append("Sending ");
                stringBuilder2.append(valueOf);
                Log.d("FirebaseInstanceId", stringBuilder2.toString());
            }
            intent.putExtra("google.messenger", this.zzcx);
            if (!(this.zzcy == null && this.zzcz == null)) {
                Message obtain = Message.obtain();
                obtain.obj = intent;
                try {
                    if (this.zzcy != null) {
                        this.zzcy.send(obtain);
                    } else {
                        this.zzcz.send(obtain);
                    }
                } catch (RemoteException e) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
                    }
                }
                bundle2 = (Bundle) Tasks.await(taskCompletionSource.getTask(), 30000, TimeUnit.MILLISECONDS);
                synchronized (this.zzcw) {
                    this.zzcw.remove(zzah);
                }
                return bundle2;
            }
            if (this.zzas.zzac() == 2) {
                this.zzac.sendBroadcast(intent);
            } else {
                this.zzac.startService(intent);
            }
            try {
                bundle2 = (Bundle) Tasks.await(taskCompletionSource.getTask(), 30000, TimeUnit.MILLISECONDS);
                synchronized (this.zzcw) {
                }
                return bundle2;
            } catch (InterruptedException | TimeoutException e2) {
                Log.w("FirebaseInstanceId", "No response");
                throw new IOException("TIMEOUT");
            } catch (ExecutionException e3) {
                throw new IOException(e3);
            } catch (Throwable th) {
                synchronized (this.zzcw) {
                    this.zzcw.remove(zzah);
                }
            }
        } else {
            throw new IOException("MISSING_INSTANCEID_SERVICE");
        }
    }

    /* Access modifiers changed, original: final */
    public final Bundle zzc(Bundle bundle) throws IOException {
        if (this.zzas.zzaf() < 12000000) {
            return zzd(bundle);
        }
        try {
            return (Bundle) Tasks.await(zzab.zzc(this.zzac).zzb(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
                stringBuilder.append("Error making request: ");
                stringBuilder.append(valueOf);
                Log.d("FirebaseInstanceId", stringBuilder.toString());
            }
            return ((e.getCause() instanceof zzal) && ((zzal) e.getCause()).getErrorCode() == 4) ? zzd(bundle) : null;
        }
    }
}
