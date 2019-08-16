package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.internal.measurement.zzkd;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import com.google.firebase.analytics.FirebaseAnalytics.Event;
import com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty;
import java.util.Arrays;
import java.util.List;

public final class zzc {
    private static final List<String> zzbqm = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", Event.APP_OPEN});
    private static final List<String> zzbqn = Arrays.asList(new String[]{"auto", "app", "am"});
    private static final List<String> zzbqo = Arrays.asList(new String[]{"_r", "_dbg"});
    private static final List<String> zzbqp = Arrays.asList((String[]) ArrayUtils.concat(UserProperty.zzada, UserProperty.zzadb));
    private static final List<String> zzbqq = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    public static boolean zza(ConditionalUserProperty conditionalUserProperty) {
        if (conditionalUserProperty == null) {
            return false;
        }
        String str = conditionalUserProperty.origin;
        return (str == null || str.isEmpty()) ? false : ((conditionalUserProperty.value == null || zzkd.zzf(conditionalUserProperty.value) != null) && zzff(str) && zzw(str, conditionalUserProperty.name)) ? (conditionalUserProperty.expiredEventName == null || (zza(conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams) && zzb(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) ? (conditionalUserProperty.triggeredEventName == null || (zza(conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams) && zzb(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) ? conditionalUserProperty.timedOutEventName == null || (zza(conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams) && zzb(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams)) : false : false : false;
    }

    public static boolean zza(@NonNull String str, @Nullable Bundle bundle) {
        if (zzbqm.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String containsKey : zzbqo) {
                if (bundle.containsKey(containsKey)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static AppMeasurement.ConditionalUserProperty zzb(ConditionalUserProperty conditionalUserProperty) {
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = new AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty2.mOrigin = conditionalUserProperty.origin;
        conditionalUserProperty2.mActive = conditionalUserProperty.active;
        conditionalUserProperty2.mCreationTimestamp = conditionalUserProperty.creationTimestamp;
        conditionalUserProperty2.mExpiredEventName = conditionalUserProperty.expiredEventName;
        if (conditionalUserProperty.expiredEventParams != null) {
            conditionalUserProperty2.mExpiredEventParams = new Bundle(conditionalUserProperty.expiredEventParams);
        }
        conditionalUserProperty2.mName = conditionalUserProperty.name;
        conditionalUserProperty2.mTimedOutEventName = conditionalUserProperty.timedOutEventName;
        if (conditionalUserProperty.timedOutEventParams != null) {
            conditionalUserProperty2.mTimedOutEventParams = new Bundle(conditionalUserProperty.timedOutEventParams);
        }
        conditionalUserProperty2.mTimeToLive = conditionalUserProperty.timeToLive;
        conditionalUserProperty2.mTriggeredEventName = conditionalUserProperty.triggeredEventName;
        if (conditionalUserProperty.triggeredEventParams != null) {
            conditionalUserProperty2.mTriggeredEventParams = new Bundle(conditionalUserProperty.triggeredEventParams);
        }
        conditionalUserProperty2.mTriggeredTimestamp = conditionalUserProperty.triggeredTimestamp;
        conditionalUserProperty2.mTriggerEventName = conditionalUserProperty.triggerEventName;
        conditionalUserProperty2.mTriggerTimeout = conditionalUserProperty.triggerTimeout;
        if (conditionalUserProperty.value != null) {
            conditionalUserProperty2.mValue = zzkd.zzf(conditionalUserProperty.value);
        }
        return conditionalUserProperty2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzb(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!zzff(str)) {
            return false;
        }
        if (bundle == null) {
            return false;
        }
        String str3;
        Object obj;
        for (String str32 : zzbqo) {
            if (bundle.containsKey(str32)) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            str32 = "fcm_integration";
                            break;
                        case 1:
                            str32 = "fdl_integration";
                            break;
                        case 2:
                            str32 = "fiam_integration";
                            break;
                        default:
                            return false;
                    }
                    bundle.putString("_cis", str32);
                    return true;
                }
            } else if (str.equals("fdl")) {
                hashCode = 1;
                switch (obj) {
                    case null:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        break;
                }
                bundle.putString("_cis", str32);
                return true;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            obj = null;
            switch (obj) {
                case null:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                default:
                    break;
            }
            bundle.putString("_cis", str32);
            return true;
        }
        obj = -1;
        switch (obj) {
            case null:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        bundle.putString("_cis", str32);
        return true;
    }

    public static ConditionalUserProperty zzd(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = new ConditionalUserProperty();
        conditionalUserProperty2.origin = conditionalUserProperty.mOrigin;
        conditionalUserProperty2.active = conditionalUserProperty.mActive;
        conditionalUserProperty2.creationTimestamp = conditionalUserProperty.mCreationTimestamp;
        conditionalUserProperty2.expiredEventName = conditionalUserProperty.mExpiredEventName;
        if (conditionalUserProperty.mExpiredEventParams != null) {
            conditionalUserProperty2.expiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
        }
        conditionalUserProperty2.name = conditionalUserProperty.mName;
        conditionalUserProperty2.timedOutEventName = conditionalUserProperty.mTimedOutEventName;
        if (conditionalUserProperty.mTimedOutEventParams != null) {
            conditionalUserProperty2.timedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
        }
        conditionalUserProperty2.timeToLive = conditionalUserProperty.mTimeToLive;
        conditionalUserProperty2.triggeredEventName = conditionalUserProperty.mTriggeredEventName;
        if (conditionalUserProperty.mTriggeredEventParams != null) {
            conditionalUserProperty2.triggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
        }
        conditionalUserProperty2.triggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
        conditionalUserProperty2.triggerEventName = conditionalUserProperty.mTriggerEventName;
        conditionalUserProperty2.triggerTimeout = conditionalUserProperty.mTriggerTimeout;
        if (conditionalUserProperty.mValue != null) {
            conditionalUserProperty2.value = zzkd.zzf(conditionalUserProperty.mValue);
        }
        return conditionalUserProperty2;
    }

    public static boolean zzff(@NonNull String str) {
        return !zzbqn.contains(str);
    }

    public static boolean zzfg(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        codePointAt = Character.charCount(codePointAt);
        while (codePointAt < length) {
            int codePointAt2 = str.codePointAt(codePointAt);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            codePointAt += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean zzfh(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        codePointAt = Character.charCount(codePointAt);
        while (codePointAt < length) {
            int codePointAt2 = str.codePointAt(codePointAt);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            codePointAt += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static String zzfi(String str) {
        String zzak = AppMeasurement.Event.zzak(str);
        return zzak != null ? zzak : str;
    }

    public static String zzfj(String str) {
        String zzal = AppMeasurement.Event.zzal(str);
        return zzal != null ? zzal : str;
    }

    public static boolean zzw(@NonNull String str, @NonNull String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return !str.equals(AppMeasurement.FCM_ORIGIN) ? str.equals("frc") : true;
        } else {
            if (UserProperty.FIREBASE_LAST_NOTIFICATION.equals(str2)) {
                return str.equals(AppMeasurement.FCM_ORIGIN);
            }
            if (zzbqp.contains(str2)) {
                return false;
            }
            for (String matches : zzbqq) {
                if (str2.matches(matches)) {
                    return false;
                }
            }
            return true;
        }
    }
}
