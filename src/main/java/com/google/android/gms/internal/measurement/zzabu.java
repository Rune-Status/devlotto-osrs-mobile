package com.google.android.gms.internal.measurement;

public enum zzabu {
    DOUBLE(zzabz.DOUBLE, 1),
    FLOAT(zzabz.FLOAT, 5),
    INT64(zzabz.LONG, 0),
    UINT64(zzabz.LONG, 0),
    INT32(zzabz.INT, 0),
    FIXED64(zzabz.LONG, 1),
    FIXED32(zzabz.INT, 5),
    BOOL(zzabz.BOOLEAN, 0),
    STRING(zzabz.STRING, 2),
    GROUP(zzabz.MESSAGE, 3),
    MESSAGE(zzabz.MESSAGE, 2),
    BYTES(zzabz.BYTE_STRING, 2),
    UINT32(zzabz.INT, 0),
    ENUM(zzabz.ENUM, 0),
    SFIXED32(zzabz.INT, 5),
    SFIXED64(zzabz.LONG, 1),
    SINT32(zzabz.INT, 0),
    SINT64(zzabz.LONG, 0);
    
    private final zzabz zzbyi;
    private final int zzbyj;

    private zzabu(zzabz zzabz, int i) {
        this.zzbyi = zzabz;
        this.zzbyj = i;
    }

    public final zzabz zzvk() {
        return this.zzbyi;
    }
}
