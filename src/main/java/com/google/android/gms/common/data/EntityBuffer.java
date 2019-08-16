package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zamd = false;
    private ArrayList<Integer> zame;

    @KeepForSdk
    protected EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    private final void zacb() {
        synchronized (this) {
            if (!this.zamd) {
                int count = this.mDataHolder.getCount();
                this.zame = new ArrayList();
                if (count > 0) {
                    this.zame.add(Integer.valueOf(0));
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    int i = 1;
                    while (i < count) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i);
                        String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i, windowIndex);
                        if (string2 != null) {
                            if (string2.equals(string)) {
                                string2 = string;
                            } else {
                                this.zame.add(Integer.valueOf(i));
                            }
                            i++;
                            string = string2;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder(String.valueOf(primaryDataMarkerColumn).length() + 78);
                            stringBuilder.append("Missing value for markerColumn: ");
                            stringBuilder.append(primaryDataMarkerColumn);
                            stringBuilder.append(", at row: ");
                            stringBuilder.append(i);
                            stringBuilder.append(", for window: ");
                            stringBuilder.append(windowIndex);
                            throw new NullPointerException(stringBuilder.toString());
                        }
                    }
                }
                this.zamd = true;
            }
        }
    }

    private final int zah(int i) {
        if (i >= 0 && i < this.zame.size()) {
            return ((Integer) this.zame.get(i)).intValue();
        }
        StringBuilder stringBuilder = new StringBuilder(53);
        stringBuilder.append("Position ");
        stringBuilder.append(i);
        stringBuilder.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @KeepForSdk
    public final T get(int i) {
        int i2;
        zacb();
        int zah = zah(i);
        if (i < 0) {
            i2 = 0;
        } else if (i == this.zame.size()) {
            i2 = 0;
        } else {
            i2 = i == this.zame.size() + -1 ? this.mDataHolder.getCount() - ((Integer) this.zame.get(i)).intValue() : ((Integer) this.zame.get(i + 1)).intValue() - ((Integer) this.zame.get(i)).intValue();
            if (i2 == 1) {
                int zah2 = zah(i);
                int windowIndex = this.mDataHolder.getWindowIndex(zah2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn != null && this.mDataHolder.getString(childDataMarkerColumn, zah2, windowIndex) == null) {
                    i2 = 0;
                }
            }
        }
        return getEntry(zah, i2);
    }

    /* Access modifiers changed, original: protected */
    @KeepForSdk
    public String getChildDataMarkerColumn() {
        return null;
    }

    @KeepForSdk
    public int getCount() {
        zacb();
        return this.zame.size();
    }

    @KeepForSdk
    public abstract T getEntry(int i, int i2);

    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();
}
