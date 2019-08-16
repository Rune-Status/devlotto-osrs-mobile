package com.google.android.gms.internal.measurement;

final class zzfj implements Runnable {
    private final /* synthetic */ int zzakw;
    private final /* synthetic */ String zzakx;
    private final /* synthetic */ Object zzaky;
    private final /* synthetic */ Object zzakz;
    private final /* synthetic */ Object zzala;
    private final /* synthetic */ zzfi zzalb;

    zzfj(zzfi zzfi, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzalb = zzfi;
        this.zzakw = i;
        this.zzakx = str;
        this.zzaky = obj;
        this.zzakz = obj2;
        this.zzala = obj3;
    }

    public final void run() {
        zzft zzgj = this.zzalb.zzacv.zzgj();
        if (zzgj.isInitialized()) {
            char c;
            if (this.zzalb.zzakl == 0) {
                zzfi zzfi;
                if (this.zzalb.zzgk().zzds()) {
                    zzfi = this.zzalb;
                    this.zzalb.zzgl();
                    c = 'C';
                } else {
                    zzfi = this.zzalb;
                    this.zzalb.zzgl();
                    c = 'c';
                }
                zzfi.zzakl = c;
            }
            if (this.zzalb.zzafi < 0) {
                this.zzalb.zzafi = this.zzalb.zzgk().zzgw();
            }
            char charAt = "01VDIWEA?".charAt(this.zzakw);
            c = this.zzalb.zzakl;
            long zzb = this.zzalb.zzafi;
            String zza = zzfi.zza(true, this.zzakx, this.zzaky, this.zzakz, this.zzala);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(zza).length() + 24);
            stringBuilder.append("2");
            stringBuilder.append(charAt);
            stringBuilder.append(c);
            stringBuilder.append(zzb);
            stringBuilder.append(":");
            stringBuilder.append(zza);
            String stringBuilder2 = stringBuilder.toString();
            if (stringBuilder2.length() > 1024) {
                stringBuilder2 = this.zzakx.substring(0, 1024);
            }
            zzgj.zzals.zzc(stringBuilder2, 1);
            return;
        }
        this.zzalb.zza(6, "Persisted config not initialized. Not logging error/warn");
    }
}
