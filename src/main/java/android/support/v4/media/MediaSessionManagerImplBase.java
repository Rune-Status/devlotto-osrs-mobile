package android.support.v4.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.provider.Settings.Secure;
import android.support.annotation.NonNull;
import android.support.v4.util.ObjectsCompat;
import android.text.TextUtils;
import android.util.Log;

class MediaSessionManagerImplBase implements MediaSessionManagerImpl {
    private static final boolean DEBUG = MediaSessionManager.DEBUG;
    private static final String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
    private static final String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
    private static final String TAG = "MediaSessionManager";
    ContentResolver mContentResolver = this.mContext.getContentResolver();
    Context mContext;

    static class RemoteUserInfoImplBase implements RemoteUserInfoImpl {
        private String mPackageName;
        private int mPid;
        private int mUid;

        RemoteUserInfoImplBase(String str, int i, int i2) {
            this.mPackageName = str;
            this.mPid = i;
            this.mUid = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfoImplBase)) {
                return false;
            }
            RemoteUserInfoImplBase remoteUserInfoImplBase = (RemoteUserInfoImplBase) obj;
            return TextUtils.equals(this.mPackageName, remoteUserInfoImplBase.mPackageName) && this.mPid == remoteUserInfoImplBase.mPid && this.mUid == remoteUserInfoImplBase.mUid;
        }

        public String getPackageName() {
            return this.mPackageName;
        }

        public int getPid() {
            return this.mPid;
        }

        public int getUid() {
            return this.mUid;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mPackageName, Integer.valueOf(this.mPid), Integer.valueOf(this.mUid));
        }
    }

    MediaSessionManagerImplBase(Context context) {
        this.mContext = context;
    }

    private boolean isPermissionGranted(RemoteUserInfoImpl remoteUserInfoImpl, String str) {
        if (remoteUserInfoImpl.getPid() < 0) {
            if (this.mContext.getPackageManager().checkPermission(str, remoteUserInfoImpl.getPackageName()) == 0) {
                return true;
            }
        } else if (this.mContext.checkPermission(str, remoteUserInfoImpl.getPid(), remoteUserInfoImpl.getUid()) == 0) {
            return true;
        }
        return false;
    }

    public Context getContext() {
        return this.mContext;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isEnabledNotificationListener(@NonNull RemoteUserInfoImpl remoteUserInfoImpl) {
        String string = Secure.getString(this.mContentResolver, ENABLED_NOTIFICATION_LISTENERS);
        if (string == null) {
            return false;
        }
        String[] split = string.split(":");
        for (String unflattenFromString : split) {
            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
            if (unflattenFromString2 != null && unflattenFromString2.getPackageName().equals(remoteUserInfoImpl.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public boolean isTrustedForMediaControl(@NonNull RemoteUserInfoImpl remoteUserInfoImpl) {
        StringBuilder stringBuilder;
        try {
            if (this.mContext.getPackageManager().getApplicationInfo(remoteUserInfoImpl.getPackageName(), 0).uid == remoteUserInfoImpl.getUid()) {
                return isPermissionGranted(remoteUserInfoImpl, PERMISSION_STATUS_BAR_SERVICE) || isPermissionGranted(remoteUserInfoImpl, PERMISSION_MEDIA_CONTENT_CONTROL) || remoteUserInfoImpl.getUid() == 1000 || isEnabledNotificationListener(remoteUserInfoImpl);
            } else {
                if (!DEBUG) {
                    return false;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Package name ");
                stringBuilder.append(remoteUserInfoImpl.getPackageName());
                stringBuilder.append(" doesn't match with the uid ");
                stringBuilder.append(remoteUserInfoImpl.getUid());
                Log.d(TAG, stringBuilder.toString());
                return false;
            }
        } catch (NameNotFoundException e) {
            if (!DEBUG) {
                return false;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Package ");
            stringBuilder.append(remoteUserInfoImpl.getPackageName());
            stringBuilder.append(" doesn't exist");
            Log.d(TAG, stringBuilder.toString());
            return false;
        }
    }
}
