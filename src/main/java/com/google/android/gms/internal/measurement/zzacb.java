package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzacb {
    private final ByteBuffer zzbzc;

    private zzacb(ByteBuffer byteBuffer) {
        this.zzbzc = byteBuffer;
        this.zzbzc.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzacb(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e A:{RETURN} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder stringBuilder = new StringBuilder(39);
                                stringBuilder.append("Unpaired surrogate at index ");
                                stringBuilder.append(i2);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                    }
                    i2++;
                }
                i2 = i3 + i;
                if (i2 < length) {
                    return i2;
                }
                long j = (long) i2;
                StringBuilder stringBuilder2 = new StringBuilder(54);
                stringBuilder2.append("UTF-8 length does not fit in int: ");
                stringBuilder2.append(j + 4294967296L);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        i2 = i3;
        if (i2 < length) {
        }
    }

    private static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i = 0;
        int arrayOffset;
        int remaining;
        int i2;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byte[] array = byteBuffer.array();
                arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                remaining = byteBuffer.remaining();
                int length = charSequence.length();
                int i3 = remaining + arrayOffset;
                remaining = 0;
                while (remaining < length) {
                    i = remaining + arrayOffset;
                    if (i >= i3) {
                        break;
                    }
                    char charAt = charSequence.charAt(remaining);
                    if (charAt >= 128) {
                        break;
                    }
                    array[i] = (byte) charAt;
                    remaining++;
                }
                if (remaining == length) {
                    i2 = arrayOffset + length;
                } else {
                    i2 = arrayOffset + remaining;
                    while (remaining < length) {
                        char charAt2 = charSequence.charAt(remaining);
                        StringBuilder stringBuilder;
                        if (charAt2 < 128 && i2 < i3) {
                            arrayOffset = i2 + 1;
                            array[i2] = (byte) charAt2;
                        } else if (charAt2 < 2048 && i2 <= i3 - 2) {
                            i = i2 + 1;
                            array[i2] = (byte) ((charAt2 >>> 6) | 960);
                            arrayOffset = i + 1;
                            array[i] = (byte) ((charAt2 & 63) | 128);
                        } else if ((charAt2 < 55296 || 57343 < charAt2) && i2 <= i3 - 3) {
                            arrayOffset = i2 + 1;
                            array[i2] = (byte) ((charAt2 >>> 12) | 480);
                            i = arrayOffset + 1;
                            array[arrayOffset] = (byte) (((charAt2 >>> 6) & 63) | 128);
                            arrayOffset = i + 1;
                            array[i] = (byte) ((charAt2 & 63) | 128);
                        } else if (i2 <= i3 - 4) {
                            i = remaining + 1;
                            if (i != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    remaining = Character.toCodePoint(charAt2, charAt3);
                                    arrayOffset = i2 + 1;
                                    array[i2] = (byte) ((remaining >>> 18) | 240);
                                    i2 = arrayOffset + 1;
                                    array[arrayOffset] = (byte) (((remaining >>> 12) & 63) | 128);
                                    int i4 = i2 + 1;
                                    array[i2] = (byte) (((remaining >>> 6) & 63) | 128);
                                    arrayOffset = i4 + 1;
                                    array[i4] = (byte) ((remaining & 63) | 128);
                                    remaining = i;
                                }
                            } else {
                                i = remaining;
                            }
                            stringBuilder = new StringBuilder(39);
                            stringBuilder.append("Unpaired surrogate at index ");
                            stringBuilder.append(i - 1);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else {
                            stringBuilder = new StringBuilder(37);
                            stringBuilder.append("Failed writing ");
                            stringBuilder.append(charAt2);
                            stringBuilder.append(" at index ");
                            stringBuilder.append(i2);
                            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                        }
                        remaining++;
                        i2 = arrayOffset;
                    }
                }
                byteBuffer.position(i2 - byteBuffer.arrayOffset());
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            i2 = charSequence.length();
            while (i < i2) {
                arrayOffset = charSequence.charAt(i);
                if (arrayOffset >= 128) {
                    if (arrayOffset < 2048) {
                        remaining = (arrayOffset >>> 6) | 960;
                    } else if (arrayOffset < 55296 || 57343 < arrayOffset) {
                        byteBuffer.put((byte) ((arrayOffset >>> 12) | 480));
                        remaining = ((arrayOffset >>> 6) & 63) | 128;
                    } else {
                        remaining = i + 1;
                        if (remaining != charSequence.length()) {
                            char charAt4 = charSequence.charAt(remaining);
                            if (Character.isSurrogatePair(arrayOffset, charAt4)) {
                                arrayOffset = Character.toCodePoint(arrayOffset, charAt4);
                                byteBuffer.put((byte) ((arrayOffset >>> 18) | 240));
                                byteBuffer.put((byte) (((arrayOffset >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((arrayOffset >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((arrayOffset & 63) | 128));
                                i = remaining;
                                i++;
                            } else {
                                arrayOffset = remaining;
                            }
                        } else {
                            arrayOffset = i;
                        }
                        StringBuilder stringBuilder2 = new StringBuilder(39);
                        stringBuilder2.append("Unpaired surrogate at index ");
                        stringBuilder2.append(arrayOffset - 1);
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                    byteBuffer.put((byte) remaining);
                    arrayOffset = (arrayOffset & 63) | 128;
                }
                byteBuffer.put((byte) arrayOffset);
                i++;
            }
        }
    }

    public static int zzao(int i) {
        return i >= 0 ? zzas(i) : 10;
    }

    private final void zzap(int i) throws IOException {
        byte b = (byte) i;
        if (this.zzbzc.hasRemaining()) {
            this.zzbzc.put(b);
            return;
        }
        throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
    }

    public static int zzaq(int i) {
        return zzas(i << 3);
    }

    public static int zzas(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    private final void zzas(long j) throws IOException {
        while ((-128 & j) != 0) {
            zzap((((int) j) & 127) | 128);
            j >>>= 7;
        }
        zzap((int) j);
    }

    public static int zzat(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    public static int zzb(int i, zzacj zzacj) {
        int zzaq = zzaq(i);
        int zzwb = zzacj.zzwb();
        return zzaq + (zzwb + zzas(zzwb));
    }

    public static zzacb zzb(byte[] bArr, int i, int i2) {
        return new zzacb(bArr, 0, i2);
    }

    public static int zzc(int i, long j) {
        return zzaq(i) + zzat(j);
    }

    public static int zzc(int i, String str) {
        return zzaq(i) + zzfr(str);
    }

    public static int zzf(int i, int i2) {
        return zzaq(i) + zzao(i2);
    }

    public static int zzfr(String str) {
        int zza = zza(str);
        return zza + zzas(zza);
    }

    public static zzacb zzj(byte[] bArr) {
        return zzb(bArr, 0, bArr.length);
    }

    public final void zza(int i, double d) throws IOException {
        zzg(i, 1);
        long doubleToLongBits = Double.doubleToLongBits(d);
        if (this.zzbzc.remaining() >= 8) {
            this.zzbzc.putLong(doubleToLongBits);
            return;
        }
        throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
    }

    public final void zza(int i, float f) throws IOException {
        zzg(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.zzbzc.remaining() >= 4) {
            this.zzbzc.putInt(floatToIntBits);
            return;
        }
        throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
    }

    public final void zza(int i, long j) throws IOException {
        zzg(i, 0);
        zzas(j);
    }

    public final void zza(int i, zzacj zzacj) throws IOException {
        zzg(i, 2);
        zzb(zzacj);
    }

    public final void zza(int i, boolean z) throws IOException {
        zzg(i, 0);
        byte b = (byte) z;
        if (this.zzbzc.hasRemaining()) {
            this.zzbzc.put(b);
            return;
        }
        throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
    }

    public final void zzar(int i) throws IOException {
        while ((i & -128) != 0) {
            zzap((i & 127) | 128);
            i >>>= 7;
        }
        zzap(i);
    }

    public final void zzb(int i, long j) throws IOException {
        zzg(i, 0);
        zzas(j);
    }

    public final void zzb(int i, String str) throws IOException {
        zzg(i, 2);
        try {
            int zzas = zzas(str.length());
            if (zzas == zzas(str.length() * 3)) {
                int position = this.zzbzc.position();
                if (this.zzbzc.remaining() >= zzas) {
                    this.zzbzc.position(position + zzas);
                    zza((CharSequence) str, this.zzbzc);
                    int position2 = this.zzbzc.position();
                    this.zzbzc.position(position);
                    zzar((position2 - position) - zzas);
                    this.zzbzc.position(position2);
                    return;
                }
                throw new zzacc(zzas + position, this.zzbzc.limit());
            }
            zzar(zza(str));
            zza((CharSequence) str, this.zzbzc);
        } catch (BufferOverflowException e) {
            zzacc zzacc = new zzacc(this.zzbzc.position(), this.zzbzc.limit());
            zzacc.initCause(e);
            throw zzacc;
        }
    }

    public final void zzb(zzacj zzacj) throws IOException {
        zzar(zzacj.zzwa());
        zzacj.zza(this);
    }

    public final void zze(int i, int i2) throws IOException {
        zzg(i, 0);
        if (i2 >= 0) {
            zzar(i2);
        } else {
            zzas((long) i2);
        }
    }

    public final void zzg(int i, int i2) throws IOException {
        zzar((i << 3) | i2);
    }

    public final void zzk(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.zzbzc.remaining() >= length) {
            this.zzbzc.put(bArr, 0, length);
            return;
        }
        throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
    }

    public final void zzvt() {
        if (this.zzbzc.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.zzbzc.remaining())}));
        }
    }
}
