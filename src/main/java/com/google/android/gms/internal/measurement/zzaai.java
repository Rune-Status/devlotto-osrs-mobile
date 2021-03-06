package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzzv.zzb;

final class zzaai implements zzabb {
    private static final zzaap zzbvl = new zzaaj();
    private final zzaap zzbvk;

    public zzaai() {
        this(new zzaak(zzzu.zzua(), zzuh()));
    }

    private zzaai(zzaap zzaap) {
        this.zzbvk = (zzaap) zzzw.zza(zzaap, "messageInfoFactory");
    }

    private static boolean zza(zzaao zzaao) {
        return zzaao.zzul() == zzb.zzbur;
    }

    private static zzaap zzuh() {
        try {
            return (zzaap) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            return zzbvl;
        }
    }

    public final <T> zzaba<T> zzg(Class<T> cls) {
        zzabc.zzh(cls);
        zzaao zze = this.zzbvk.zze(cls);
        if (zze.zzum()) {
            return zzzv.class.isAssignableFrom(cls) ? zzaau.zza(zzabc.zzuv(), zzzq.zztv(), zze.zzun()) : zzaau.zza(zzabc.zzut(), zzzq.zztw(), zze.zzun());
        } else {
            if (zzzv.class.isAssignableFrom(cls)) {
                if (zza(zze)) {
                    return zzaat.zza(cls, zze, zzaax.zzuq(), zzaae.zzug(), zzabc.zzuv(), zzzq.zztv(), zzaan.zzuj());
                }
                return zzaat.zza(cls, zze, zzaax.zzuq(), zzaae.zzug(), zzabc.zzuv(), null, zzaan.zzuj());
            } else if (zza(zze)) {
                return zzaat.zza(cls, zze, zzaax.zzup(), zzaae.zzuf(), zzabc.zzut(), zzzq.zztw(), zzaan.zzui());
            } else {
                return zzaat.zza(cls, zze, zzaax.zzup(), zzaae.zzuf(), zzabc.zzuu(), null, zzaan.zzui());
            }
        }
    }
}
