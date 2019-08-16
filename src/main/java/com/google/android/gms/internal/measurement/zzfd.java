package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.iid.FirebaseInstanceId;
import java.math.BigInteger;
import java.util.Locale;

public final class zzfd extends zzdz {
    private String zzafa;
    private String zzafh;
    private long zzafl;
    private int zzagb;
    private int zzakd;
    private long zzake;
    private String zztf;
    private String zztg;
    private String zzth;

    zzfd(zzgn zzgn) {
        super(zzgn);
    }

    @WorkerThread
    private final String zzgr() {
        String str = null;
        zzab();
        zzfv();
        if (zzgk().zzbb(this.zzth) && !this.zzacv.isEnabled()) {
            return str;
        }
        try {
            return FirebaseInstanceId.getInstance().getId();
        } catch (IllegalStateException e) {
            zzgi().zziy().log("Failed to retrieve Firebase Instance Id");
            return str;
        }
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* Access modifiers changed, original: final */
    public final String getGmpAppId() {
        zzch();
        return this.zzafa;
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    /* Access modifiers changed, original: final */
    public final String zzah() {
        zzch();
        return this.zzth;
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final zzeb zzbl(String str) {
        zzab();
        zzfv();
        String zzah = zzah();
        String gmpAppId = getGmpAppId();
        zzch();
        String str2 = this.zztg;
        long zzis = (long) zzis();
        zzch();
        String str3 = this.zzafh;
        long zzgw = zzgk().zzgw();
        zzch();
        zzab();
        if (this.zzake == 0) {
            this.zzake = this.zzacv.zzgg().zzd(getContext(), getContext().getPackageName());
        }
        long j = this.zzake;
        boolean isEnabled = this.zzacv.isEnabled();
        boolean z = zzgj().zzamm;
        String zzgr = zzgr();
        zzch();
        long j2 = this.zzafl;
        long zzke = this.zzacv.zzke();
        int zzit = zzit();
        zzeh zzgk = zzgk();
        zzgk.zzfv();
        Boolean zzat = zzgk.zzat("google_analytics_adid_collection_enabled");
        boolean z2 = zzat == null || zzat.booleanValue();
        boolean booleanValue = Boolean.valueOf(z2).booleanValue();
        zzgk = zzgk();
        zzgk.zzfv();
        zzat = zzgk.zzat("google_analytics_ssaid_collection_enabled");
        z2 = zzat == null || zzat.booleanValue();
        return new zzeb(zzah, gmpAppId, str2, zzis, str3, zzgw, j, str, isEnabled, z ^ 1, zzgr, j2, zzke, zzit, booleanValue, Boolean.valueOf(z2).booleanValue(), zzgj().zzjo());
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

    public final /* bridge */ /* synthetic */ zzdu zzfx() {
        return super.zzfx();
    }

    public final /* bridge */ /* synthetic */ zzhm zzfy() {
        return super.zzfy();
    }

    public final /* bridge */ /* synthetic */ zzfd zzfz() {
        return super.zzfz();
    }

    public final /* bridge */ /* synthetic */ zzik zzga() {
        return super.zzga();
    }

    public final /* bridge */ /* synthetic */ zzih zzgb() {
        return super.zzgb();
    }

    public final /* bridge */ /* synthetic */ zzfe zzgc() {
        return super.zzgc();
    }

    public final /* bridge */ /* synthetic */ zzjj zzgd() {
        return super.zzgd();
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
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzgo() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final String zzir() {
        zzgg().zzlo().nextBytes(new byte[16]);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, r0)});
    }

    /* Access modifiers changed, original: final */
    public final int zzis() {
        zzch();
        return this.zzakd;
    }

    /* Access modifiers changed, original: final */
    public final int zzit() {
        zzch();
        return this.zzagb;
    }
}
