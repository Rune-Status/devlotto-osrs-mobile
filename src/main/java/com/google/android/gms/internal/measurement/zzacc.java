package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzacc extends IOException {
    zzacc(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder(108);
        stringBuilder.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        stringBuilder.append(i);
        stringBuilder.append(" limit ");
        stringBuilder.append(i2);
        stringBuilder.append(").");
        super(stringBuilder.toString());
    }
}
