package com.appsflyer.cache;

import android.content.Context;
import android.util.Log;
import com.appsflyer.AppsFlyerLib;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class CacheManager {
    public static final String AF_CACHE_DIR = "AFRequestCache";
    public static final int CACHE_MAX_SIZE = 40;
    /* renamed from: ˋ */
    private static CacheManager f129 = new CacheManager();

    private CacheManager() {
    }

    public static CacheManager getInstance() {
        return f129;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c A:{SYNTHETIC, Splitter:B:16:0x002c} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024 A:{SYNTHETIC, Splitter:B:10:0x0024} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ˏ */
    private static RequestCacheData m112(File file) {
        Reader reader;
        Throwable th;
        Reader fileReader;
        try {
            fileReader = new FileReader(file);
            try {
                char[] cArr = new char[((int) file.length())];
                fileReader.read(cArr);
                RequestCacheData requestCacheData = new RequestCacheData(cArr);
                requestCacheData.setCacheKey(file.getName());
                try {
                    fileReader.close();
                    return requestCacheData;
                } catch (IOException e) {
                    return requestCacheData;
                }
            } catch (Exception e2) {
                reader = fileReader;
                if (reader != null) {
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileReader != null) {
                }
                throw th;
            }
        } catch (Exception e3) {
            reader = null;
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e4) {
                    return null;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0 A:{SYNTHETIC, Splitter:B:29:0x00b0} */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A:{SYNTHETIC, RETURN, Catch:{ Exception -> 0x0029, all -> 0x00a9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A:{SYNTHETIC, Splitter:B:15:0x0034} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0 A:{SYNTHETIC, Splitter:B:29:0x00b0} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cacheRequest(RequestCacheData requestCacheData, Context context) {
        Throwable th;
        Throwable th2;
        Writer writer;
        Writer outputStreamWriter;
        try {
            File file = new File(context.getFilesDir(), AF_CACHE_DIR);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length <= 40) {
                    Log.i(AppsFlyerLib.LOG_TAG, "caching request...");
                    File file2 = new File(new File(context.getFilesDir(), AF_CACHE_DIR), Long.toString(System.currentTimeMillis()));
                    file2.createNewFile();
                    outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true));
                    try {
                        outputStreamWriter.write("version=");
                        outputStreamWriter.write(requestCacheData.getVersion());
                        outputStreamWriter.write(10);
                        outputStreamWriter.write("url=");
                        outputStreamWriter.write(requestCacheData.getRequestURL());
                        outputStreamWriter.write(10);
                        outputStreamWriter.write("data=");
                        outputStreamWriter.write(requestCacheData.getPostData());
                        outputStreamWriter.write(10);
                        outputStreamWriter.flush();
                        try {
                            outputStreamWriter.close();
                            return;
                        } catch (IOException e) {
                            return;
                        }
                    } catch (Exception e2) {
                        try {
                            Log.i(AppsFlyerLib.LOG_TAG, "Could not cache request");
                            if (outputStreamWriter == null) {
                                try {
                                    outputStreamWriter.close();
                                    return;
                                } catch (IOException e3) {
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th22) {
                            th = th22;
                            writer = outputStreamWriter;
                            outputStreamWriter = writer;
                            th22 = th;
                            if (outputStreamWriter != null) {
                            }
                            throw th22;
                        }
                    } catch (Throwable th3) {
                        th22 = th3;
                        if (outputStreamWriter != null) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException e4) {
                            }
                        }
                        throw th22;
                    }
                }
                Log.i(AppsFlyerLib.LOG_TAG, "reached cache limit, not caching request");
                return;
            }
            file.mkdir();
        } catch (Exception e5) {
            outputStreamWriter = null;
            Log.i(AppsFlyerLib.LOG_TAG, "Could not cache request");
            if (outputStreamWriter == null) {
            }
        } catch (Throwable th4) {
            th = th4;
            writer = null;
            outputStreamWriter = writer;
            th22 = th;
            if (outputStreamWriter != null) {
            }
            throw th22;
        }
    }

    public void clearCache(Context context) {
        try {
            File file = new File(context.getFilesDir(), AF_CACHE_DIR);
            if (file.exists()) {
                for (File file2 : file.listFiles()) {
                    StringBuilder stringBuilder = new StringBuilder("Found cached request");
                    stringBuilder.append(file2.getName());
                    Log.i(AppsFlyerLib.LOG_TAG, stringBuilder.toString());
                    deleteRequest(m112(file2).getCacheKey(), context);
                }
                return;
            }
            file.mkdir();
        } catch (Exception e) {
            Log.i(AppsFlyerLib.LOG_TAG, "Could not cache request");
        }
    }

    public void deleteRequest(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), AF_CACHE_DIR), str);
        StringBuilder stringBuilder = new StringBuilder("Deleting ");
        stringBuilder.append(str);
        stringBuilder.append(" from cache");
        Log.i(AppsFlyerLib.LOG_TAG, stringBuilder.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                stringBuilder = new StringBuilder("Could not delete ");
                stringBuilder.append(str);
                stringBuilder.append(" from cache");
                Log.i(AppsFlyerLib.LOG_TAG, stringBuilder.toString(), e);
            }
        }
    }

    public List<RequestCacheData> getCachedRequests(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), AF_CACHE_DIR);
            if (file.exists()) {
                for (File file2 : file.listFiles()) {
                    StringBuilder stringBuilder = new StringBuilder("Found cached request");
                    stringBuilder.append(file2.getName());
                    Log.i(AppsFlyerLib.LOG_TAG, stringBuilder.toString());
                    arrayList.add(m112(file2));
                }
            } else {
                file.mkdir();
            }
        } catch (Exception e) {
            Log.i(AppsFlyerLib.LOG_TAG, "Could not cache request");
        }
        return arrayList;
    }

    public void init(Context context) {
        try {
            if (!new File(context.getFilesDir(), AF_CACHE_DIR).exists()) {
                new File(context.getFilesDir(), AF_CACHE_DIR).mkdir();
            }
        } catch (Exception e) {
            Log.i(AppsFlyerLib.LOG_TAG, "Could not create cache directory");
        }
    }
}
