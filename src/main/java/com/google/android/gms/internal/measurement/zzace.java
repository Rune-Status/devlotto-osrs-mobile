package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class zzace<M extends zzacd<M>, T> {
    public final int tag;
    private final int type;
    protected final Class<T> zzbze;
    protected final boolean zzbzf;
    private final zzzv<?, ?> zzbzg;

    private zzace(int i, Class<T> cls, int i2, boolean z) {
        this(11, cls, null, 810, false);
    }

    private zzace(int i, Class<T> cls, zzzv<?, ?> zzzv, int i2, boolean z) {
        this.type = i;
        this.zzbze = cls;
        this.tag = i2;
        this.zzbzf = false;
        this.zzbzg = null;
    }

    public static <M extends zzacd<M>, T extends zzacj> zzace<M, T> zza(int i, Class<T> cls, long j) {
        return new zzace(11, cls, 810, false);
    }

    private final Object zzf(zzaca zzaca) {
        String valueOf;
        Class componentType = this.zzbzf ? this.zzbze.getComponentType() : this.zzbze;
        StringBuilder stringBuilder;
        try {
            zzacj zzacj;
            switch (this.type) {
                case 10:
                    zzacj = (zzacj) componentType.newInstance();
                    zzaca.zza(zzacj, this.tag >>> 3);
                    return zzacj;
                case 11:
                    zzacj = (zzacj) componentType.newInstance();
                    zzaca.zza(zzacj);
                    return zzacj;
                default:
                    int i = this.type;
                    stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (InstantiationException e) {
            valueOf = String.valueOf(componentType);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
            stringBuilder.append("Error creating instance of class ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        } catch (IllegalAccessException e2) {
            valueOf = String.valueOf(componentType);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
            stringBuilder.append("Error creating instance of class ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), e2);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzace)) {
            return false;
        }
        zzace zzace = (zzace) obj;
        return this.type == zzace.type && this.zzbze == zzace.zzbze && this.tag == zzace.tag && this.zzbzf == zzace.zzbzf;
    }

    public final int hashCode() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(Object obj, zzacb zzacb) {
        try {
            zzacb.zzar(this.tag);
            int i;
            switch (this.type) {
                case 10:
                    i = this.tag;
                    ((zzacj) obj).zza(zzacb);
                    zzacb.zzg(i >>> 3, 4);
                    return;
                case 11:
                    zzacb.zzb((zzacj) obj);
                    return;
                default:
                    i = this.type;
                    StringBuilder stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    /* Access modifiers changed, original: final */
    public final T zzi(List<zzacl> list) {
        int i = 0;
        if (list == null) {
            return null;
        }
        if (this.zzbzf) {
            int i2;
            ArrayList arrayList = new ArrayList();
            for (i2 = 0; i2 < list.size(); i2++) {
                zzacl zzacl = (zzacl) list.get(i2);
                if (zzacl.zzbtj.length != 0) {
                    arrayList.add(zzf(zzaca.zzi(zzacl.zzbtj)));
                }
            }
            i2 = arrayList.size();
            if (i2 == 0) {
                return null;
            }
            Object cast = this.zzbze.cast(Array.newInstance(this.zzbze.getComponentType(), i2));
            while (i < i2) {
                Array.set(cast, i, arrayList.get(i));
                i++;
            }
            return cast;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return this.zzbze.cast(zzf(zzaca.zzi(((zzacl) list.get(list.size() - 1)).zzbtj)));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzv(Object obj) {
        int i = this.tag >>> 3;
        switch (this.type) {
            case 10:
                return (zzacb.zzaq(i) << 1) + ((zzacj) obj).zzwb();
            case 11:
                return zzacb.zzb(i, (zzacj) obj);
            default:
                i = this.type;
                StringBuilder stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
