package com.google.android.gms.internal.measurement;

final class zzabl {
    static String zza(zzzb zzzb) {
        zzabm zzabm = new zzabm(zzzb);
        StringBuilder stringBuilder = new StringBuilder(zzabm.size());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= zzabm.size()) {
                return stringBuilder.toString();
            }
            i = zzabm.zzae(i2);
            String str;
            if (i != 34) {
                if (i == 39) {
                    str = "\\'";
                } else if (i != 92) {
                    switch (i) {
                        case 7:
                            str = "\\a";
                            break;
                        case 8:
                            str = "\\b";
                            break;
                        case 9:
                            str = "\\t";
                            break;
                        case 10:
                            str = "\\n";
                            break;
                        case 11:
                            str = "\\v";
                            break;
                        case 12:
                            str = "\\f";
                            break;
                        case 13:
                            str = "\\r";
                            break;
                        default:
                            if (i < 32 || i > 126) {
                                stringBuilder.append('\\');
                                stringBuilder.append((char) (((i >>> 6) & 3) + 48));
                                stringBuilder.append((char) (((i >>> 3) & 7) + 48));
                                i = (i & 7) + 48;
                            }
                            stringBuilder.append((char) i);
                            continue;
                    }
                } else {
                    str = "\\\\";
                }
                stringBuilder.append(str);
            } else {
                str = "\\\"";
                stringBuilder.append(str);
            }
            i = i2 + 1;
        }
    }
}
