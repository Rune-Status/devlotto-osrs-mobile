package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class zzabe extends zzabd<FieldDescriptorType, Object> {
    zzabe(int i) {
        super(i, null);
    }

    public final void zzru() {
        if (!isImmutable()) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= zzuy()) {
                    break;
                }
                Entry zzah = zzah(i2);
                if (((zzzt) zzah.getKey()).zztz()) {
                    zzah.setValue(Collections.unmodifiableList((List) zzah.getValue()));
                }
                i = i2 + 1;
            }
            for (Entry entry : zzuz()) {
                if (((zzzt) entry.getKey()).zztz()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzru();
    }
}
