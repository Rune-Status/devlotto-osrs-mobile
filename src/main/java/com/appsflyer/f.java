package com.appsflyer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

final class f {

    static final class b {
        /* renamed from: ˊ */
        private final String f136;
        /* renamed from: ˋ */
        private final boolean f137;

        b(String str, boolean z) {
            this.f136 = str;
            this.f137 = z;
        }

        /* renamed from: ˊ */
        public final String m114() {
            return this.f136;
        }

        /* Access modifiers changed, original: final */
        /* renamed from: ˏ */
        public final boolean m115() {
            return this.f137;
        }
    }

    static final class c implements ServiceConnection {
        /* renamed from: ˊ */
        private final LinkedBlockingQueue<IBinder> f138;
        /* renamed from: ˋ */
        private boolean f139;

        private c() {
            this.f139 = false;
            this.f138 = new LinkedBlockingQueue(1);
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f138.put(iBinder);
            } catch (InterruptedException e) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        /* renamed from: ˊ */
        public final IBinder m116() throws InterruptedException {
            if (this.f139) {
                throw new IllegalStateException();
            }
            this.f139 = true;
            return (IBinder) this.f138.take();
        }
    }

    static final class e implements IInterface {
        /* renamed from: ˊ */
        private IBinder f140;

        e(IBinder iBinder) {
            this.f140 = iBinder;
        }

        public final IBinder asBinder() {
            return this.f140;
        }

        /* renamed from: ˊ */
        public final String m117() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f140.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                return readString;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* Access modifiers changed, original: final */
        /* renamed from: ˋ */
        public final boolean m118() throws RemoteException {
            boolean z = true;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f140.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                obtain2.recycle();
                obtain.recycle();
                return z;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    f() {
    }

    /* renamed from: ॱ */
    static b m119(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                c cVar = new c();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        e eVar = new e(cVar.m116());
                        b bVar = new b(eVar.m117(), eVar.m118());
                        if (context != null) {
                            context.unbindService(cVar);
                        }
                        return bVar;
                    }
                    if (context != null) {
                        context.unbindService(cVar);
                    }
                    throw new IOException("Google Play connection failed");
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    if (context != null) {
                        context.unbindService(cVar);
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }
}
