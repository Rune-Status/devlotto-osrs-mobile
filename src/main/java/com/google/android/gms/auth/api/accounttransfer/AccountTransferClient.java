package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings.Builder;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzs;
import com.google.android.gms.internal.auth.zzu;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.internal.auth.zzy;
import com.google.android.gms.internal.auth.zzz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class AccountTransferClient extends GoogleApi<zzn> {
    private static final ClientKey<zzu> zzaj = new ClientKey();
    private static final AbstractClientBuilder<zzu, zzn> zzak = new zzc();
    private static final Api<zzn> zzal = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zzak, zzaj);

    private static class zza<T> extends zzs {
        private zzb<T> zzav;

        public zza(zzb<T> zzb) {
            this.zzav = zzb;
        }

        public final void onFailure(Status status) {
            this.zzav.zza(status);
        }
    }

    private static abstract class zzb<T> extends TaskApiCall<zzu, T> {
        private TaskCompletionSource<T> zzaw;

        private zzb() {
        }

        /* synthetic */ zzb(zzc zzc) {
            this();
        }

        /* Access modifiers changed, original: protected|synthetic */
        public /* synthetic */ void doExecute(AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
            zzu zzu = (zzu) anyClient;
            this.zzaw = taskCompletionSource;
            zza((zzz) zzu.getService());
        }

        /* Access modifiers changed, original: protected|final */
        public final void setResult(T t) {
            this.zzaw.setResult(t);
        }

        /* Access modifiers changed, original: protected|final */
        public final void zza(Status status) {
            AccountTransferClient.zza(this.zzaw, status);
        }

        public abstract void zza(zzz zzz) throws RemoteException;
    }

    private static abstract class zzc extends zzb<Void> {
        zzy zzax;

        private zzc() {
            super();
            this.zzax = new zzk(this);
        }

        /* synthetic */ zzc(zzc zzc) {
            this();
        }
    }

    AccountTransferClient(@NonNull Activity activity) {
        super(activity, zzal, null, new Builder().setMapper(new ApiExceptionMapper()).build());
    }

    AccountTransferClient(@NonNull Context context) {
        super(context, zzal, null, new Builder().setMapper(new ApiExceptionMapper()).build());
    }

    private static void zza(TaskCompletionSource taskCompletionSource, Status status) {
        taskCompletionSource.setException(new AccountTransferException(status));
    }

    public Task<DeviceMetaData> getDeviceMetaData(String str) {
        Preconditions.checkNotNull(str);
        return doRead((TaskApiCall) new zzg(this, new zzv(str)));
    }

    public Task<Void> notifyCompletion(String str, int i) {
        Preconditions.checkNotNull(str);
        return doWrite((TaskApiCall) new zzj(this, new zzab(str, i)));
    }

    public Task<byte[]> retrieveData(String str) {
        Preconditions.checkNotNull(str);
        return doRead((TaskApiCall) new zze(this, new zzad(str)));
    }

    public Task<Void> sendData(String str, byte[] bArr) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(bArr);
        return doWrite((TaskApiCall) new zzd(this, new zzaf(str, bArr)));
    }

    public Task<Void> showUserChallenge(String str, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(pendingIntent);
        return doWrite((TaskApiCall) new zzi(this, new zzah(str, pendingIntent)));
    }
}
