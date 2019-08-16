package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.util.LruCache;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager {
    private static final Object zamg = new Object();
    private static HashSet<Uri> zamh = new HashSet();
    private static ImageManager zami;
    private final Context mContext;
    private final Handler mHandler = new zal(Looper.getMainLooper());
    private final ExecutorService zamj = Executors.newFixedThreadPool(4);
    private final zaa zamk = null;
    private final zak zaml = new zak();
    private final Map<zaa, ImageReceiver> zamm = new HashMap();
    private final Map<Uri, ImageReceiver> zamn = new HashMap();
    private final Map<Uri, Long> zamo = new HashMap();

    @KeepName
    private final class ImageReceiver extends ResultReceiver {
        private final Uri mUri;
        private final ArrayList<zaa> zamp = new ArrayList();

        ImageReceiver(Uri uri) {
            super(new zal(Looper.getMainLooper()));
            this.mUri = uri;
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager.this.zamj.execute(new zab(this.mUri, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }

        public final void zab(zaa zaa) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zamp.add(zaa);
        }

        public final void zac(zaa zaa) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zamp.remove(zaa);
        }

        public final void zace() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.putExtra(Constants.EXTRA_URI, this.mUri);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.mContext.sendBroadcast(intent);
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z);
    }

    private static final class zaa extends LruCache<zab, Bitmap> {
        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            super.entryRemoved(z, (zab) obj, (Bitmap) obj2, (Bitmap) obj3);
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    private final class zab implements Runnable {
        private final Uri mUri;
        private final ParcelFileDescriptor zamr;

        public zab(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.mUri = uri;
            this.zamr = parcelFileDescriptor;
        }

        public final void run() {
            Bitmap bitmap = null;
            boolean z = false;
            Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            if (this.zamr != null) {
                try {
                    bitmap = BitmapFactory.decodeFileDescriptor(this.zamr.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.mUri);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    stringBuilder.append("OOM while loading bitmap for uri: ");
                    stringBuilder.append(valueOf);
                    Log.e("ImageManager", stringBuilder.toString(), e);
                    z = true;
                }
                try {
                    this.zamr.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.mHandler.post(new zad(this.mUri, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e3) {
                String valueOf2 = String.valueOf(this.mUri);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                stringBuilder2.append("Latch interrupted while posting ");
                stringBuilder2.append(valueOf2);
                Log.w("ImageManager", stringBuilder2.toString());
            }
        }
    }

    private final class zac implements Runnable {
        private final zaa zams;

        public zac(zaa zaa) {
            this.zams = zaa;
        }

        public final void run() {
            Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.zamm.get(this.zams);
            if (imageReceiver != null) {
                ImageManager.this.zamm.remove(this.zams);
                imageReceiver.zac(this.zams);
            }
            zab zab = this.zams.zamu;
            if (zab.uri == null) {
                this.zams.zaa(ImageManager.this.mContext, ImageManager.this.zaml, true);
                return;
            }
            Bitmap zaa = ImageManager.this.zaa(zab);
            if (zaa != null) {
                this.zams.zaa(ImageManager.this.mContext, zaa, true);
                return;
            }
            Long l = (Long) ImageManager.this.zamo.get(zab.uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    this.zams.zaa(ImageManager.this.mContext, ImageManager.this.zaml, true);
                    return;
                }
                ImageManager.this.zamo.remove(zab.uri);
            }
            this.zams.zaa(ImageManager.this.mContext, ImageManager.this.zaml);
            imageReceiver = (ImageReceiver) ImageManager.this.zamn.get(zab.uri);
            if (imageReceiver == null) {
                imageReceiver = new ImageReceiver(zab.uri);
                ImageManager.this.zamn.put(zab.uri, imageReceiver);
            }
            imageReceiver.zab(this.zams);
            if (!(this.zams instanceof zad)) {
                ImageManager.this.zamm.put(this.zams, imageReceiver);
            }
            synchronized (ImageManager.zamg) {
                if (!ImageManager.zamh.contains(zab.uri)) {
                    ImageManager.zamh.add(zab.uri);
                    imageReceiver.zace();
                }
            }
        }
    }

    private final class zad implements Runnable {
        private final Bitmap mBitmap;
        private final Uri mUri;
        private final CountDownLatch zadq;
        private boolean zamt;

        public zad(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.mUri = uri;
            this.mBitmap = bitmap;
            this.zamt = z;
            this.zadq = countDownLatch;
        }

        public final void run() {
            Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.mBitmap != null;
            if (ImageManager.this.zamk != null) {
                if (this.zamt) {
                    ImageManager.this.zamk.evictAll();
                    System.gc();
                    this.zamt = false;
                    ImageManager.this.mHandler.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.zamk.put(new zab(this.mUri), this.mBitmap);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.zamn.remove(this.mUri);
            if (imageReceiver != null) {
                ArrayList zaa = imageReceiver.zamp;
                int size = zaa.size();
                for (int i = 0; i < size; i++) {
                    zaa zaa2 = (zaa) zaa.get(i);
                    if (z) {
                        zaa2.zaa(ImageManager.this.mContext, this.mBitmap, false);
                    } else {
                        ImageManager.this.zamo.put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                        zaa2.zaa(ImageManager.this.mContext, ImageManager.this.zaml, false);
                    }
                    if (!(zaa2 instanceof zad)) {
                        ImageManager.this.zamm.remove(zaa2);
                    }
                }
            }
            this.zadq.countDown();
            synchronized (ImageManager.zamg) {
                ImageManager.zamh.remove(this.mUri);
            }
        }
    }

    private ImageManager(Context context, boolean z) {
        this.mContext = context.getApplicationContext();
    }

    public static ImageManager create(Context context) {
        if (zami == null) {
            zami = new ImageManager(context, false);
        }
        return zami;
    }

    private final Bitmap zaa(zab zab) {
        return this.zamk == null ? null : (Bitmap) this.zamk.get(zab);
    }

    private final void zaa(zaa zaa) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zac(zaa).run();
    }

    public final void loadImage(ImageView imageView, int i) {
        zaa(new zac(imageView, i));
    }

    public final void loadImage(ImageView imageView, Uri uri) {
        zaa(new zac(imageView, uri));
    }

    public final void loadImage(ImageView imageView, Uri uri, int i) {
        zaa zac = new zac(imageView, uri);
        zac.zamw = i;
        zaa(zac);
    }

    public final void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        zaa(new zad(onImageLoadedListener, uri));
    }

    public final void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i) {
        zaa zad = new zad(onImageLoadedListener, uri);
        zad.zamw = i;
        zaa(zad);
    }
}
