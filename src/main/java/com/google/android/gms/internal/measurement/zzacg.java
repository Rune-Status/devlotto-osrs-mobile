package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class zzacg implements Cloneable {
    private Object value;
    private zzace<?, ?> zzbzl;
    private List<zzacl> zzbzm = new ArrayList();

    zzacg() {
    }

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zza()];
        zza(zzacb.zzj(bArr));
        return bArr;
    }

    private final zzacg zzvv() {
        int i = 0;
        zzacg zzacg = new zzacg();
        try {
            zzacg.zzbzl = this.zzbzl;
            if (this.zzbzm == null) {
                zzacg.zzbzm = null;
            } else {
                zzacg.zzbzm.addAll(this.zzbzm);
            }
            if (this.value != null) {
                Object obj;
                int i2;
                if (this.value instanceof zzacj) {
                    obj = (zzacj) ((zzacj) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    obj = ((byte[]) this.value).clone();
                } else if (this.value instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.value;
                    byte[][] bArr2 = new byte[bArr.length][];
                    zzacg.value = bArr2;
                    for (i2 = 0; i2 < bArr.length; i2++) {
                        bArr2[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.value instanceof boolean[]) {
                    obj = ((boolean[]) this.value).clone();
                } else if (this.value instanceof int[]) {
                    obj = ((int[]) this.value).clone();
                } else if (this.value instanceof long[]) {
                    obj = ((long[]) this.value).clone();
                } else if (this.value instanceof float[]) {
                    obj = ((float[]) this.value).clone();
                } else if (this.value instanceof double[]) {
                    obj = ((double[]) this.value).clone();
                } else if (this.value instanceof zzacj[]) {
                    zzacj[] zzacjArr = (zzacj[]) this.value;
                    zzacj[] zzacjArr2 = new zzacj[zzacjArr.length];
                    zzacg.value = zzacjArr2;
                    while (true) {
                        i2 = i;
                        if (i2 >= zzacjArr.length) {
                            break;
                        }
                        zzacjArr2[i2] = (zzacj) zzacjArr[i2].clone();
                        i = i2 + 1;
                    }
                }
                zzacg.value = obj;
                return zzacg;
            }
            return zzacg;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return zzvv();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacg)) {
            return false;
        }
        zzacg zzacg = (zzacg) obj;
        if (this.value != null && zzacg.value != null) {
            return this.zzbzl == zzacg.zzbzl ? !this.zzbzl.zzbze.isArray() ? this.value.equals(zzacg.value) : this.value instanceof byte[] ? Arrays.equals((byte[]) this.value, (byte[]) zzacg.value) : this.value instanceof int[] ? Arrays.equals((int[]) this.value, (int[]) zzacg.value) : this.value instanceof long[] ? Arrays.equals((long[]) this.value, (long[]) zzacg.value) : this.value instanceof float[] ? Arrays.equals((float[]) this.value, (float[]) zzacg.value) : this.value instanceof double[] ? Arrays.equals((double[]) this.value, (double[]) zzacg.value) : this.value instanceof boolean[] ? Arrays.equals((boolean[]) this.value, (boolean[]) zzacg.value) : Arrays.deepEquals((Object[]) this.value, (Object[]) zzacg.value) : false;
        } else {
            if (this.zzbzm != null && zzacg.zzbzm != null) {
                return this.zzbzm.equals(zzacg.zzbzm);
            }
            try {
                return Arrays.equals(toByteArray(), zzacg.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: final */
    public final int zza() {
        int i = 0;
        if (this.value != null) {
            zzace zzace = this.zzbzl;
            Object obj = this.value;
            if (!zzace.zzbzf) {
                return zzace.zzv(obj);
            }
            int length = Array.getLength(obj);
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Array.get(obj, i3) != null) {
                    i2 += zzace.zzv(Array.get(obj, i3));
                }
            }
            return i2;
        }
        for (zzacl zzacl : this.zzbzm) {
            i = (zzacl.zzbtj.length + (zzacb.zzas(zzacl.tag) + 0)) + i;
        }
        return i;
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzacb zzacb) throws IOException {
        if (this.value != null) {
            zzace zzace = this.zzbzl;
            Object obj = this.value;
            if (zzace.zzbzf) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        zzace.zza(obj2, zzacb);
                    }
                }
                return;
            }
            zzace.zza(obj, zzacb);
            return;
        }
        for (zzacl zzacl : this.zzbzm) {
            zzacb.zzar(zzacl.tag);
            zzacb.zzk(zzacl.zzbtj);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzacl zzacl) throws IOException {
        if (this.zzbzm != null) {
            this.zzbzm.add(zzacl);
            return;
        }
        Object zzb;
        if (this.value instanceof zzacj) {
            byte[] bArr = zzacl.zzbtj;
            zzaca zza = zzaca.zza(bArr, 0, bArr.length);
            int zzvn = zza.zzvn();
            if (zzvn == bArr.length - zzacb.zzao(zzvn)) {
                zzb = ((zzacj) this.value).zzb(zza);
            } else {
                throw zzaci.zzvw();
            }
        } else if (this.value instanceof zzacj[]) {
            zzacj[] zzacjArr = (zzacj[]) this.zzbzl.zzi(Collections.singletonList(zzacl));
            zzacj[] zzacjArr2 = (zzacj[]) this.value;
            zzacj[] zzb2 = (zzacj[]) Arrays.copyOf(zzacjArr2, zzacjArr2.length + zzacjArr.length);
            System.arraycopy(zzacjArr, 0, zzb2, zzacjArr2.length, zzacjArr.length);
        } else {
            zzb2 = this.zzbzl.zzi(Collections.singletonList(zzacl));
        }
        this.zzbzl = this.zzbzl;
        this.value = zzb2;
        this.zzbzm = null;
    }

    /* Access modifiers changed, original: final */
    public final <T> T zzb(zzace<?, T> zzace) {
        if (this.value == null) {
            this.zzbzl = zzace;
            this.value = zzace.zzi(this.zzbzm);
            this.zzbzm = null;
        } else if (!this.zzbzl.equals(zzace)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return this.value;
    }
}
