package android.support.v4.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Log;

@RequiresApi(19)
class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final String TAG = "DocumentFile";

    private DocumentsContractApi19() {
    }

    public static boolean canRead(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(getRawType(context, uri));
    }

    public static boolean canWrite(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String rawType = getRawType(context, uri);
        int queryForInt = queryForInt(context, uri, "flags", 0);
        return !TextUtils.isEmpty(rawType) ? (queryForInt & 4) != 0 ? true : (!"vnd.android.document/directory".equals(rawType) || (queryForInt & 8) == 0) ? (TextUtils.isEmpty(rawType) || (queryForInt & 2) == 0) ? false : true : true : false;
    }

    private static void closeQuietly(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    public static boolean exists(Context context, Uri uri) {
        AutoCloseable query;
        Object e;
        Throwable th;
        try {
            query = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            try {
                boolean z = query.getCount() > 0;
                closeQuietly(query);
                return z;
            } catch (Exception e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(query);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            query = null;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            closeQuietly(query);
            throw th;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed query: ");
            stringBuilder.append(e);
            Log.w(TAG, stringBuilder.toString());
            closeQuietly(query);
            return false;
        } catch (Throwable th4) {
            th = th4;
            closeQuietly(query);
            throw th;
        }
    }

    public static long getFlags(Context context, Uri uri) {
        return queryForLong(context, uri, "flags", 0);
    }

    @Nullable
    public static String getName(Context context, Uri uri) {
        return queryForString(context, uri, "_display_name", null);
    }

    @Nullable
    private static String getRawType(Context context, Uri uri) {
        return queryForString(context, uri, "mime_type", null);
    }

    @Nullable
    public static String getType(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        return "vnd.android.document/directory".equals(rawType) ? null : rawType;
    }

    public static boolean isDirectory(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static boolean isFile(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        return ("vnd.android.document/directory".equals(rawType) || TextUtils.isEmpty(rawType)) ? false : true;
    }

    public static boolean isVirtual(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (getFlags(context, uri) & 512) != 0;
    }

    public static long lastModified(Context context, Uri uri) {
        return queryForLong(context, uri, "last_modified", 0);
    }

    public static long length(Context context, Uri uri) {
        return queryForLong(context, uri, "_size", 0);
    }

    private static int queryForInt(Context context, Uri uri, String str, int i) {
        return (int) queryForLong(context, uri, str, (long) i);
    }

    private static long queryForLong(Context context, Uri uri, String str, long j) {
        Object e;
        Throwable th;
        AutoCloseable query;
        try {
            query = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                if (!query.moveToFirst() || query.isNull(0)) {
                    closeQuietly(query);
                    return j;
                }
                j = query.getLong(0);
                closeQuietly(query);
                return j;
            } catch (Exception e2) {
                e = e2;
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed query: ");
                    stringBuilder.append(e);
                    Log.w(TAG, stringBuilder.toString());
                    closeQuietly(query);
                    return j;
                } catch (Throwable th2) {
                    th = th2;
                    closeQuietly(query);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeQuietly(query);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            query = null;
        } catch (Throwable th4) {
            th = th4;
            query = null;
            closeQuietly(query);
            throw th;
        }
    }

    @Nullable
    private static String queryForString(Context context, Uri uri, String str, @Nullable String str2) {
        Object e;
        Throwable th;
        AutoCloseable query;
        try {
            query = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                if (!query.moveToFirst() || query.isNull(0)) {
                    closeQuietly(query);
                    return str2;
                }
                str2 = query.getString(0);
                closeQuietly(query);
                return str2;
            } catch (Exception e2) {
                e = e2;
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed query: ");
                    stringBuilder.append(e);
                    Log.w(TAG, stringBuilder.toString());
                    closeQuietly(query);
                    return str2;
                } catch (Throwable th2) {
                    th = th2;
                    closeQuietly(query);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeQuietly(query);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            query = null;
        } catch (Throwable th4) {
            th = th4;
            query = null;
            closeQuietly(query);
            throw th;
        }
    }
}
