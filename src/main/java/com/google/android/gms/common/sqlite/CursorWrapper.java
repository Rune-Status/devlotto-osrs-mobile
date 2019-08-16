package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor zzez;

    @KeepForSdk
    public CursorWrapper(Cursor cursor) {
        super(cursor);
        Object obj = cursor;
        for (int i = 0; i < 10 && (obj instanceof android.database.CursorWrapper); i++) {
            obj = ((android.database.CursorWrapper) obj).getWrappedCursor();
        }
        if (obj instanceof AbstractWindowedCursor) {
            this.zzez = (AbstractWindowedCursor) obj;
        } else {
            String valueOf = String.valueOf(obj.getClass().getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown type: ".concat(valueOf) : new String("Unknown type: "));
        }
    }

    @KeepForSdk
    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.zzez.fillWindow(i, cursorWindow);
    }

    @KeepForSdk
    public CursorWindow getWindow() {
        return this.zzez.getWindow();
    }

    public /* synthetic */ Cursor getWrappedCursor() {
        return this.zzez;
    }

    public boolean onMove(int i, int i2) {
        return this.zzez.onMove(i, i2);
    }

    @KeepForSdk
    public void setWindow(CursorWindow cursorWindow) {
        this.zzez.setWindow(cursorWindow);
    }
}
