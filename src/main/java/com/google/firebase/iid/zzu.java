package com.google.firebase.iid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

final class zzu implements Continuation<Bundle, String> {
    private final /* synthetic */ zzr zzbr;

    zzu(zzr zzr) {
        this.zzbr = zzr;
    }

    public final /* synthetic */ Object then(@NonNull Task task) throws Exception {
        return zzr.zza((Bundle) task.getResult(IOException.class));
    }
}
