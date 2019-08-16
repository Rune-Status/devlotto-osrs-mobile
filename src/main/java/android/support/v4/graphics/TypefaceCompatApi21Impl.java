package android.support.v4.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.provider.FontsContractCompat.FontInfo;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RequiresApi(21)
@RestrictTo({Scope.LIBRARY_GROUP})
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {
    private static final String TAG = "TypefaceCompatApi21Impl";

    TypefaceCompatApi21Impl() {
    }

    private File getFile(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/proc/self/fd/");
            stringBuilder.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(stringBuilder.toString());
            return OsConstants.S_ISREG(Os.stat(readlink).st_mode) ? new File(readlink) : null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0065 A:{Catch:{ all -> 0x0065, all -> 0x0050 }, Splitter:B:5:0x0018, ExcHandler: all (r1_12 'th' java.lang.Throwable A:{Catch:{ all -> 0x0065, all -> 0x0050 }})} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0054  */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:38:0x0054, code skipped:
            if (r2 != null) goto L_0x0056;
     */
    /* JADX WARNING: Missing block: B:40:?, code skipped:
            r4.close();
     */
    /* JADX WARNING: Missing block: B:48:0x0060, code skipped:
            r3 = move-exception;
     */
    /* JADX WARNING: Missing block: B:50:?, code skipped:
            r1.addSuppressed(r3);
     */
    /* JADX WARNING: Missing block: B:51:0x0065, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:52:0x0066, code skipped:
            r2 = null;
            r3 = r1;
     */
    /* JADX WARNING: Missing block: B:54:0x006d, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:56:?, code skipped:
            r2.addSuppressed(r1);
     */
    /* JADX WARNING: Missing block: B:57:0x0072, code skipped:
            r4.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, @NonNull FontInfo[] fontInfoArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        Throwable th;
        Throwable th2;
        Throwable th3;
        if (fontInfoArr.length < 1) {
            return null;
        }
        FontInfo findBestInfo = findBestInfo(fontInfoArr, i);
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(findBestInfo.getUri(), "r", cancellationSignal);
            try {
                File file = getFile(openFileDescriptor);
                Typeface createFromInputStream;
                if (file == null || !file.canRead()) {
                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    try {
                        createFromInputStream = super.createFromInputStream(context, fileInputStream);
                        fileInputStream.close();
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return createFromInputStream;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    createFromInputStream = Typeface.createFromFile(file);
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return createFromInputStream;
                }
            } catch (Throwable th5) {
                th3 = th5;
                th = th2;
            }
        } catch (IOException e) {
            return null;
        }
        if (openFileDescriptor != null) {
        }
        throw th3;
        if (th2 != null) {
            fileInputStream.close();
        } else {
            fileInputStream.close();
        }
        throw th;
        throw th3;
        throw th;
    }
}
