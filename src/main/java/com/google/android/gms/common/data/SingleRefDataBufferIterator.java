package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.NoSuchElementException;

@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zamf;

    public SingleRefDataBufferIterator(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    public T next() {
        StringBuilder stringBuilder;
        if (hasNext()) {
            this.zalk++;
            if (this.zalk == 0) {
                this.zamf = this.zalj.get(0);
                if (!(this.zamf instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(this.zamf.getClass());
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    stringBuilder.append("DataBuffer reference of type ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" is not movable");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            ((DataBufferRef) this.zamf).zag(this.zalk);
            return this.zamf;
        }
        int i = this.zalk;
        stringBuilder = new StringBuilder(46);
        stringBuilder.append("Cannot advance the iterator beyond ");
        stringBuilder.append(i);
        throw new NoSuchElementException(stringBuilder.toString());
    }
}
