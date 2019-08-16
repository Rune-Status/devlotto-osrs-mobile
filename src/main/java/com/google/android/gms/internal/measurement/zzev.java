package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzev implements Iterator<String> {
    private Iterator<String> zzahp = this.zzahq.zzaho.keySet().iterator();
    private final /* synthetic */ zzeu zzahq;

    zzev(zzeu zzeu) {
        this.zzahq = zzeu;
    }

    public final boolean hasNext() {
        return this.zzahp.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.zzahp.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
