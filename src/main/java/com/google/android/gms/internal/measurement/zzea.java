package com.google.android.gms.internal.measurement;

import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

final class zzea {
    private final zzgn zzacv;
    private String zzaez;
    private String zzafa;
    private String zzafb;
    private String zzafc;
    private long zzafd;
    private long zzafe;
    private long zzaff;
    private long zzafg;
    private String zzafh;
    private long zzafi;
    private long zzafj;
    private boolean zzafk;
    private long zzafl;
    private boolean zzafm;
    private boolean zzafn;
    private long zzafo;
    private long zzafp;
    private long zzafq;
    private long zzafr;
    private long zzafs;
    private long zzaft;
    private String zzafu;
    private boolean zzafv;
    private long zzafw;
    private long zzafx;
    private String zztg;
    private final String zzth;

    @WorkerThread
    zzea(zzgn zzgn, String str) {
        Preconditions.checkNotNull(zzgn);
        Preconditions.checkNotEmpty(str);
        this.zzacv = zzgn;
        this.zzth = str;
        this.zzacv.zzgh().zzab();
    }

    @WorkerThread
    public final String getAppInstanceId() {
        this.zzacv.zzgh().zzab();
        return this.zzaez;
    }

    @WorkerThread
    public final String getGmpAppId() {
        this.zzacv.zzgh().zzab();
        return this.zzafa;
    }

    @WorkerThread
    public final boolean isMeasurementEnabled() {
        this.zzacv.zzgh().zzab();
        return this.zzafk;
    }

    @WorkerThread
    public final void setAppVersion(String str) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zztg, str) ^ 1;
        this.zztg = str;
    }

    @WorkerThread
    public final void setMeasurementEnabled(boolean z) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafk != z ? 1 : 0) | this.zzafv;
        this.zzafk = z;
    }

    @WorkerThread
    public final void zzaa(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafp != j ? 1 : 0) | this.zzafv;
        this.zzafp = j;
    }

    @WorkerThread
    public final void zzab(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafq != j ? 1 : 0) | this.zzafv;
        this.zzafq = j;
    }

    @WorkerThread
    public final void zzac(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafr != j ? 1 : 0) | this.zzafv;
        this.zzafr = j;
    }

    @WorkerThread
    public final void zzad(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzaft != j ? 1 : 0) | this.zzafv;
        this.zzaft = j;
    }

    @WorkerThread
    public final void zzae(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafs != j ? 1 : 0) | this.zzafv;
        this.zzafs = j;
    }

    @WorkerThread
    public final void zzaf(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafl != j ? 1 : 0) | this.zzafv;
        this.zzafl = j;
    }

    @WorkerThread
    public final String zzag() {
        this.zzacv.zzgh().zzab();
        return this.zztg;
    }

    @WorkerThread
    public final String zzah() {
        this.zzacv.zzgh().zzab();
        return this.zzth;
    }

    @WorkerThread
    public final void zzam(String str) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zzaez, str) ^ 1;
        this.zzaez = str;
    }

    @WorkerThread
    public final void zzan(String str) {
        this.zzacv.zzgh().zzab();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzafv |= zzkd.zzs(this.zzafa, str) ^ 1;
        this.zzafa = str;
    }

    @WorkerThread
    public final void zzao(String str) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zzafb, str) ^ 1;
        this.zzafb = str;
    }

    @WorkerThread
    public final void zzap(String str) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zzafc, str) ^ 1;
        this.zzafc = str;
    }

    @WorkerThread
    public final void zzaq(String str) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zzafh, str) ^ 1;
        this.zzafh = str;
    }

    @WorkerThread
    public final void zzar(String str) {
        this.zzacv.zzgh().zzab();
        this.zzafv |= zzkd.zzs(this.zzafu, str) ^ 1;
        this.zzafu = str;
    }

    @WorkerThread
    public final void zzd(boolean z) {
        this.zzacv.zzgh().zzab();
        this.zzafv = this.zzafm != z;
        this.zzafm = z;
    }

    @WorkerThread
    public final void zze(boolean z) {
        this.zzacv.zzgh().zzab();
        this.zzafv = this.zzafn != z;
        this.zzafn = z;
    }

    @WorkerThread
    public final void zzgp() {
        this.zzacv.zzgh().zzab();
        this.zzafv = false;
    }

    @WorkerThread
    public final String zzgq() {
        this.zzacv.zzgh().zzab();
        return this.zzafb;
    }

    @WorkerThread
    public final String zzgr() {
        this.zzacv.zzgh().zzab();
        return this.zzafc;
    }

    @WorkerThread
    public final long zzgs() {
        this.zzacv.zzgh().zzab();
        return this.zzafe;
    }

    @WorkerThread
    public final long zzgt() {
        this.zzacv.zzgh().zzab();
        return this.zzaff;
    }

    @WorkerThread
    public final long zzgu() {
        this.zzacv.zzgh().zzab();
        return this.zzafg;
    }

    @WorkerThread
    public final String zzgv() {
        this.zzacv.zzgh().zzab();
        return this.zzafh;
    }

    @WorkerThread
    public final long zzgw() {
        this.zzacv.zzgh().zzab();
        return this.zzafi;
    }

    @WorkerThread
    public final long zzgx() {
        this.zzacv.zzgh().zzab();
        return this.zzafj;
    }

    @WorkerThread
    public final long zzgy() {
        this.zzacv.zzgh().zzab();
        return this.zzafd;
    }

    @WorkerThread
    public final long zzgz() {
        this.zzacv.zzgh().zzab();
        return this.zzafw;
    }

    @WorkerThread
    public final long zzha() {
        this.zzacv.zzgh().zzab();
        return this.zzafx;
    }

    @WorkerThread
    public final void zzhb() {
        this.zzacv.zzgh().zzab();
        long j = this.zzafd + 1;
        if (j > 2147483647L) {
            this.zzacv.zzgi().zziy().zzg("Bundle index overflow. appId", zzfi.zzbp(this.zzth));
            j = 0;
        }
        this.zzafv = true;
        this.zzafd = j;
    }

    @WorkerThread
    public final long zzhc() {
        this.zzacv.zzgh().zzab();
        return this.zzafo;
    }

    @WorkerThread
    public final long zzhd() {
        this.zzacv.zzgh().zzab();
        return this.zzafp;
    }

    @WorkerThread
    public final long zzhe() {
        this.zzacv.zzgh().zzab();
        return this.zzafq;
    }

    @WorkerThread
    public final long zzhf() {
        this.zzacv.zzgh().zzab();
        return this.zzafr;
    }

    @WorkerThread
    public final long zzhg() {
        this.zzacv.zzgh().zzab();
        return this.zzaft;
    }

    @WorkerThread
    public final long zzhh() {
        this.zzacv.zzgh().zzab();
        return this.zzafs;
    }

    @WorkerThread
    public final String zzhi() {
        this.zzacv.zzgh().zzab();
        return this.zzafu;
    }

    @WorkerThread
    public final String zzhj() {
        this.zzacv.zzgh().zzab();
        String str = this.zzafu;
        zzar(null);
        return str;
    }

    @WorkerThread
    public final long zzhk() {
        this.zzacv.zzgh().zzab();
        return this.zzafl;
    }

    @WorkerThread
    public final boolean zzhl() {
        this.zzacv.zzgh().zzab();
        return this.zzafm;
    }

    @WorkerThread
    public final boolean zzhm() {
        this.zzacv.zzgh().zzab();
        return this.zzafn;
    }

    @WorkerThread
    public final void zzr(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafe != j ? 1 : 0) | this.zzafv;
        this.zzafe = j;
    }

    @WorkerThread
    public final void zzs(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzaff != j ? 1 : 0) | this.zzafv;
        this.zzaff = j;
    }

    @WorkerThread
    public final void zzt(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafg != j ? 1 : 0) | this.zzafv;
        this.zzafg = j;
    }

    @WorkerThread
    public final void zzu(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafi != j ? 1 : 0) | this.zzafv;
        this.zzafi = j;
    }

    @WorkerThread
    public final void zzv(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafj != j ? 1 : 0) | this.zzafv;
        this.zzafj = j;
    }

    @WorkerThread
    public final void zzw(long j) {
        int i = 1;
        Preconditions.checkArgument(j >= 0);
        this.zzacv.zzgh().zzab();
        boolean z = this.zzafv;
        if (this.zzafd == j) {
            i = 0;
        }
        this.zzafv = z | i;
        this.zzafd = j;
    }

    @WorkerThread
    public final void zzx(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafw != j ? 1 : 0) | this.zzafv;
        this.zzafw = j;
    }

    @WorkerThread
    public final void zzy(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafx != j ? 1 : 0) | this.zzafv;
        this.zzafx = j;
    }

    @WorkerThread
    public final void zzz(long j) {
        this.zzacv.zzgh().zzab();
        this.zzafv = (this.zzafo != j ? 1 : 0) | this.zzafv;
        this.zzafo = j;
    }
}
