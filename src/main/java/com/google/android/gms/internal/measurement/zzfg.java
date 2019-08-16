package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.Param;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfg extends zzhj {
    private static final AtomicReference<String[]> zzaki = new AtomicReference();
    private static final AtomicReference<String[]> zzakj = new AtomicReference();
    private static final AtomicReference<String[]> zzakk = new AtomicReference();

    zzfg(zzgn zzgn) {
        super(zzgn);
    }

    @Nullable
    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        int i = 0;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        while (i < strArr.length) {
            if (zzkd.zzs(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(strArr2[i]);
                        stringBuilder.append("(");
                        stringBuilder.append(strArr[i]);
                        stringBuilder.append(")");
                        strArr3[i] = stringBuilder.toString();
                    }
                    str = strArr3[i];
                }
                return str;
            }
            i++;
        }
        return str;
    }

    @Nullable
    private final String zzb(zzeu zzeu) {
        return zzeu == null ? null : !zziu() ? zzeu.toString() : zzb(zzeu.zzin());
    }

    private final boolean zziu() {
        return this.zzacv.zzgi().isLoggable(3);
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zza(zzes zzes) {
        if (zzes == null) {
            return null;
        }
        if (!zziu()) {
            return zzes.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event{appId='");
        stringBuilder.append(zzes.zzth);
        stringBuilder.append("', name='");
        stringBuilder.append(zzbm(zzes.name));
        stringBuilder.append("', params=");
        stringBuilder.append(zzb(zzes.zzahg));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zzb(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!zziu()) {
            return bundle.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : bundle.keySet()) {
            stringBuilder.append(stringBuilder.length() != 0 ? ", " : "Bundle[{");
            stringBuilder.append(zzbn(str));
            stringBuilder.append("=");
            stringBuilder.append(bundle.get(str));
        }
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zzb(zzex zzex) {
        if (zzex == null) {
            return null;
        }
        if (!zziu()) {
            return zzex.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("origin=");
        stringBuilder.append(zzex.origin);
        stringBuilder.append(",name=");
        stringBuilder.append(zzbm(zzex.name));
        stringBuilder.append(",params=");
        stringBuilder.append(zzb(zzex.zzahg));
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zzbm(String str) {
        return str == null ? null : zziu() ? zza(str, Event.zzacx, Event.zzacw, zzaki) : str;
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zzbn(String str) {
        return str == null ? null : zziu() ? zza(str, Param.zzacz, Param.zzacy, zzakj) : str;
    }

    /* Access modifiers changed, original: protected|final */
    @Nullable
    public final String zzbo(String str) {
        if (str == null) {
            return null;
        }
        if (!zziu()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zza(str, UserProperty.zzadb, UserProperty.zzada, zzakk);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("experiment_id");
        stringBuilder.append("(");
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    public final /* bridge */ /* synthetic */ void zzfu() {
        super.zzfu();
    }

    public final /* bridge */ /* synthetic */ void zzfv() {
        super.zzfv();
    }

    public final /* bridge */ /* synthetic */ void zzfw() {
        super.zzfw();
    }

    public final /* bridge */ /* synthetic */ zzer zzge() {
        return super.zzge();
    }

    public final /* bridge */ /* synthetic */ zzfg zzgf() {
        return super.zzgf();
    }

    public final /* bridge */ /* synthetic */ zzkd zzgg() {
        return super.zzgg();
    }

    public final /* bridge */ /* synthetic */ zzgi zzgh() {
        return super.zzgh();
    }

    public final /* bridge */ /* synthetic */ zzfi zzgi() {
        return super.zzgi();
    }

    public final /* bridge */ /* synthetic */ zzft zzgj() {
        return super.zzgj();
    }

    public final /* bridge */ /* synthetic */ zzeh zzgk() {
        return super.zzgk();
    }

    public final /* bridge */ /* synthetic */ zzee zzgl() {
        return super.zzgl();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzgn() {
        return false;
    }
}
