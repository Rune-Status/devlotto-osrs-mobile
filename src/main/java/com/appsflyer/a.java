package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import defpackage.la;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class a {
    /* renamed from: ˊ */
    private static long f120 = 3950183758939332917L;
    /* renamed from: ˋ */
    private static int f121 = 1;
    /* renamed from: ˎ */
    private static int f122;
    /* renamed from: ˏ */
    private static char[] f123 = new char[]{5961, 46707, 21798, 62661, 37779, 12616, 53362, 32629, 7924, 48528, 23382, 64010, 39204, 14577, 51105, 25949, 1025, 41859, 17094, 57762, 36704, 11796, 52694, 27779, 3007, 43371, 18483, 6130, 46725, 21575, 62335, 37412, 12781, 53391, '1', 54731, 'y', 41292, 16915, 58342, 34041, 9796, 51059, 26718, 2508, 43705, 19533, 60687, 36404, 12252, 53387, 29288, 4899, 46303, 'b', 41300, 16904, 58362, 33973, 9836, 50958, 26694, 2449, 43705, 19495, 60788, 36381, 12243, 53471, 29224, 4964, 46307, 21902, 63114, 38928, 14652, 55994, 31731, 7324, 48660, 24403, 241, 41470, 17201, 58375, 34138, 11125, 35407, 26906, 51449, 44975, 3444, 60494, 17225, 8915, 33210, 26408, 50705, 42249, 1233, 64390, 22890, 14390, 40936, 32483, 56730, 45918, 4652, 61949, 20658, 14238, 56093, 31271, 39282, 14481, 24519, 64796, 7206, 45857, 53948, 29120, 38684, 13919, 21879, 62636, 3048, 43266, 51202, 28586, 36515, 11773, 17195, 57930, 384, 47412, 6158, 64347, 23224, 15854, 40757, 32271, 53512, 45202, 5115, 62825, 21587, 14170, 38557, 27101, 52013, 43601, 3505, 60572, 20433, 'a', 41307, 16910, 58349, 33979, 9824, 51034, 26717, 2502, 43704, 19558, 60777, 36393, 12227, 53391, '.', '\\', 41243, 63425, 22271, 46519, 5205, 29521, 53707, 12538, 40950, 65143, 23835, 48073, 6792, 31166, 55400, '/', 41302, 16907, 58364, 33980, 9836, '.', 41247, 16965, 58307, 33959, 9763, 50966, 26717, 2434, 43764, 'C', 41309, 16911, 58364, 33983, 9850, 51019, 26654, 2541, 43685, 19569, 60706, 36364, 12229, 53391, 29300, 4926, 'F', 41300, 16899, 58355, 33969, 9837, 50974, 26631, 2503, 43773, 19573, 60706, 36360, 12177, 53381, 29306, 4915, 46317, 21983, 63183, 38996, 14648, 56058, 31659, 7384, 48730, 24331, 227, 41380, 17185, 58451, 34067, 9923, 51120, 27002, 2635, 43805, 19654, 60848, 36649, 12392, 4469, 45122, 21260, 62148, 38312, 14184, 54872, 30976, 6358, 48035, 23909, 64561, 40751, 16083, 49540, 25445, 555, 42484, 17609, 59273, 35167, 10276, 52210, 27298, 'C', 41309, 16911, 58364, 33983, 9850, 51019, 26654, 2554, 43704, 19572, 60715, 36377, 12242, 53394, 29278, 4904, 46310, 21983, 63135, 38992, 14640, 56033, 31661, 'F', 41300, 16899, 58355, 33969, 9837, 50974, 26650, 2502, 43691, 19581, 60716, 36377, 12177, 53396, 29310, 4918, 46313, 21983, 63116, 38992, 14652, 56042, 31715, 7317, 48712, 24342, 255, 41379, 17253, 58390, 34076, 9929, 51105, 26978, 2591, 43793, 19665, 60861, 36726, 12344, 53513, 29403, 5000, 46450, 22123, 63398};

    static final class e extends HashMap<String, Object> {
        /* renamed from: ˎ */
        private static int f114 = 0;
        /* renamed from: ˏ */
        private static long f115 = -7481529154018449095L;
        /* renamed from: ॱ */
        private static char[] f116 = new char[]{'a', 26975, 53805, 15327, 42125, 3696, 30515, 57596, 18876, 45920, 7255, 34051, 18161, 12248, 38016, 32086, 57875, 24432, 13896, 36115, 25815, 64392, 20834, 10278, 49141, 'k', 26972, 53780, 33572, 59930, 20825, 47237, 10179, 36155, 62516, 25514, 51951, 12333, 40733, 1603, 28047, 54483, 16949, 43387, 4277, 32683, 58667, 19484, 47952, 8911, 35279, 63288, 24163, 50675, 11519, 39464, 266, 26719, 55244, 16064, 42010, 4984, 31413, 57849, 20274, 46614, 7515, 33923, 62352, 22851, 'k', 26972, 53780, 15250, 42205, 3620, 30575, 'f', 26960, 53760, 15320, 42128, 3665, 30519, 57594, 18854, 45922, 7250, 34103, 61133, 22417, 49531, '4', 26903, 53835, 15237, 42196, '-', 26955, 53777, 15237, 42190, 'f', 26968, 53787, 15303, 42113, 3705, 30582, 57576, 18861, 45935, 7263, 34049, 61133, 22417, 49527, 10809, 37879, 64745, 26217, 53086, 14354, 41357, 2704, 29822, 56628, 18148, 44975, 6435, 33355, 60188, 21722, 48527, 9984, 36924, 63978, 25256, 52321, 13645, 40450, 1990, 28807, 55887, 17248, 44211, 'b', 26968, 53776, 15310, 42117, 3704, 30566, 57530, 18940, 45873, 7262, 34122, 61085, 22403, 49452, 10855, 37793, 64753, 10529, 16407, 64342, 4761, 36299, 10036, 24178, 51681, 24801, 39471, 13582, 44118, 51074, 32465, 59504, 886, 47795, 54781, 20267, 58900, 4442, 35011, 9188, 23838, 62540, 28549, 34511, 12305, 43813, 49770, 32173, 38127, 3617, 47447, 53397, 19406, 58624, 't', 26972, 53791, 15323, 42113, 3695, 30519, 57595, 18877, 45939, 7263, 'x', 26881, 53828, 33253, 59594, 21386, 47694, 9501, 36857, 10693, '&', 26945, 7278, 29954, '&', 26953, 17019, 11028, 36894, 31110, 59016, 19505, 13627, 41635, 2981, 61742, 24085, 50957, 44249, 5516, 33634, 26663};
        /* renamed from: ॱॱ */
        private static int f117 = 1;
        /* renamed from: ˊ */
        private final Context f118;
        /* renamed from: ˋ */
        private final Map<String, Object> f119;

        static final class b {
            /* renamed from: ˋ */
            private String f111;
            /* renamed from: ˎ */
            private final Object f112;
            /* renamed from: ॱ */
            private long f113;

            b() {
            }

            b(long j, String str) {
                this.f112 = new Object();
                this.f113 = 0;
                this.f111 = "";
                this.f113 = j;
                this.f111 = str;
            }

            b(String str) {
                this(System.currentTimeMillis(), str);
            }

            /* JADX WARNING: Missing block: B:19:?, code skipped:
            return false;
     */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            /* renamed from: ˎ */
            private boolean m90(long j, String str) {
                synchronized (this.f112) {
                    if (str != null) {
                        if (!str.equals(this.f111)) {
                            if (j - this.f113 > 2000) {
                                this.f113 = j;
                                this.f111 = str;
                                return true;
                            }
                        }
                    }
                }
            }

            @NonNull
            /* renamed from: ˏ */
            static b m91(String str) {
                if (str == null) {
                    return new b(0, "");
                }
                String[] split = str.split(",");
                return split.length < 2 ? new b(0, "") : new b(Long.parseLong(split[0]), split[1]);
            }

            @NonNull
            /* renamed from: ॱ */
            static String m92(String str) throws Exception {
                int i = 0;
                byte[] bytes = str.getBytes();
                for (int i2 = 0; i2 < bytes.length; i2++) {
                    bytes[i2] = (byte) (bytes[i2] ^ ((i2 % 2) + 42));
                }
                StringBuilder stringBuilder = new StringBuilder();
                int length = bytes.length;
                while (i < length) {
                    String toHexString = Integer.toHexString(bytes[i]);
                    if (toHexString.length() == 1) {
                        toHexString = "0".concat(String.valueOf(toHexString));
                    }
                    stringBuilder.append(toHexString);
                    i++;
                }
                return stringBuilder.toString();
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.f113);
                stringBuilder.append(",");
                stringBuilder.append(this.f111);
                return stringBuilder.toString();
            }

            /* Access modifiers changed, original: final */
            /* renamed from: ˋ */
            public final String m93() {
                return this.f111;
            }

            /* Access modifiers changed, original: final */
            /* renamed from: ॱ */
            public final boolean m94(b bVar) {
                return m90(bVar.f113, bVar.f111);
            }
        }

        e(Map<String, Object> map, Context context) {
            this.f119 = map;
            this.f118 = context;
            put(m96(), m95());
        }

        /* JADX WARNING: Missing block: B:23:0x01b2, code skipped:
            if ((r0 % 2 != 0 ? 78 : 29) != 78) goto L_0x00d4;
     */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: ˊ */
        private String m95() {
            String obj;
            String obj2;
            StringBuilder stringBuilder;
            int i = -2700;
            int i2 = 1;
            StringBuilder stringBuilder2;
            try {
                obj = this.f119.get(m98(0, 12, 0).intern()).toString();
                obj2 = this.f119.get(m98(77, 15, 0).intern()).toString();
                String replaceAll = m98(92, 5, 0).intern().replaceAll(m98(97, 5, 0).intern(), "");
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(obj);
                stringBuilder3.append(obj2);
                stringBuilder3.append(replaceAll);
                obj = p.m157(stringBuilder3.toString());
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("");
                stringBuilder2.append(obj.substring(0, 16));
                obj2 = stringBuilder2.toString();
            } catch (Exception e) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(m98(102, 44, 0).intern());
                stringBuilder2.append(e);
                AFLogger.afRDLog(stringBuilder2.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(m98(146, 18, 0).intern());
                obj2 = stringBuilder.toString();
            }
            StringBuilder stringBuilder4;
            try {
                int i3;
                Intent registerReceiver = this.f118.registerReceiver(null, new IntentFilter(m98(164, 37, 10560).intern()));
                if (registerReceiver != null) {
                    i = registerReceiver.getIntExtra(m98(201, 11, 0).intern(), -2700);
                }
                if (this.f118.getApplicationInfo().nativeLibraryDir.contains(m98(212, 3, 0).intern())) {
                    i3 = 1;
                } else {
                    char i32 = 0;
                }
                if (i32 != 1) {
                    f114 = (f117 + 53) % 128;
                } else {
                    i32 = f117 + 75;
                    f114 = i32 % 128;
                }
                i2 = 0;
                i32 = ((SensorManager) this.f118.getSystemService(m98(215, 6, 33174).intern())).getSensorList(-1).size();
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(m98(221, 1, 10663).intern());
                stringBuilder5.append(i);
                stringBuilder5.append(m98(222, 2, 0).intern());
                stringBuilder5.append(i2);
                stringBuilder5.append(m98(224, 2, 7240).intern());
                stringBuilder5.append(i32);
                stringBuilder5.append(m98(226, 2, 0).intern());
                stringBuilder5.append(this.f119.size());
                obj = stringBuilder5.toString();
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(obj2);
                stringBuilder4.append(b.m92(obj));
                return stringBuilder4.toString();
            } catch (Exception e2) {
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(m98(102, 44, 0).intern());
                stringBuilder4.append(e2);
                AFLogger.afRDLog(stringBuilder4.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append(obj2);
                stringBuilder.append(m98(228, 16, 16925).intern());
                return stringBuilder.toString();
            }
        }

        @NonNull
        /* renamed from: ˋ */
        private String m96() {
            f114 = (f117 + 89) % 128;
            StringBuilder stringBuilder;
            try {
                int i;
                String num = Integer.toString(VERSION.SDK_INT);
                String obj = this.f119.get(m98(0, 12, 0).intern()).toString();
                String obj2 = this.f119.get(m98(12, 5, 18067).intern()).toString();
                if ((obj2 == null ? 54 : 21) != 21) {
                    i = f114 + 17;
                    f117 = i % 128;
                    obj2 = ((i % 2 == 0 ? 1 : 0) != 1 ? m98(17, 8, 24382) : m98(40, 36, 24382)).intern();
                }
                new StringBuilder(obj).reverse();
                StringBuilder ˋ = m97(num, obj2, stringBuilder.toString());
                i = ˋ.length();
                if ((i > 4 ? 0 : 1) != 1) {
                    ˋ.delete(4, i);
                } else {
                    while (i < 4) {
                        f114 = (f117 + 13) % 128;
                        i++;
                        ˋ.append('1');
                    }
                }
                ˋ.insert(0, m98(25, 3, 0).intern());
                return ˋ.toString();
            } catch (Exception e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(m98(28, 42, 33602).intern());
                stringBuilder.append(e);
                AFLogger.afRDLog(stringBuilder.toString());
                return m98(70, 7, 0).intern();
            }
        }

        /* renamed from: ˋ */
        private static StringBuilder m97(@NonNull String... strArr) throws Exception {
            int i;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                Object i3;
                if (i2 < 3) {
                    i3 = 18;
                } else {
                    i3 = 94;
                }
                if (i3 == 94) {
                    break;
                }
                arrayList.add(Integer.valueOf(strArr[i2].length()));
                i2++;
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder stringBuilder = new StringBuilder();
            f117 = (f114 + 15) % 128;
            int i4 = 0;
            while (true) {
                if ((i4 < intValue ? 69 : 57) != 69) {
                    return stringBuilder;
                }
                Number number = null;
                int i5 = 0;
                while (i5 < 3) {
                    i3 = strArr[i5].charAt(i4);
                    if (number == null) {
                        i2 = f117 + 15;
                        f114 = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw new NullPointerException();
                        }
                    } else {
                        i3 ^= number.intValue();
                    }
                    i5++;
                    number = Integer.valueOf(i3);
                }
                stringBuilder.append(Integer.toHexString(number.intValue()));
                i3 = i4 + 1;
                f114 = (f117 + 67) % 128;
                i4 = i3;
            }
        }

        /* renamed from: ॱ */
        private static String m98(int i, int i2, char c) {
            char[] cArr = new char[i2];
            f117 = (f114 + 95) % 128;
            int i3 = 0;
            while (true) {
                Object obj;
                if (i3 < i2) {
                    obj = 50;
                } else {
                    int obj2 = 11;
                }
                if (obj2 == 11) {
                    return new String(cArr);
                }
                f114 = (f117 + 95) % 128;
                cArr[i3] = (char) ((int) ((((long) f116[i + i3]) ^ (((long) i3) * f115)) ^ ((long) c)));
                i3++;
            }
        }
    }

    a() {
    }

    /* renamed from: ˊ */
    private static String m99(Context context, String str) {
        s ˏ;
        String intern;
        StringBuilder stringBuilder;
        try {
            Iterator it = ((List) PackageManager.class.getDeclaredMethod(m103(la.ae, 24, 4370).intern(), new Class[]{Integer.TYPE}).invoke(context.getPackageManager(), new Object[]{Integer.valueOf(0)})).iterator();
            char c;
            do {
                if ((it.hasNext() ? 1 : 0) != 1) {
                    return Boolean.FALSE.toString();
                }
                f121 = (f122 + 93) % 128;
                if (((ApplicationInfo) it.next()).packageName.equals(str)) {
                    c = 1;
                    continue;
                } else {
                    c = 0;
                    continue;
                }
            } while (c != 1);
            f122 = (f121 + 85) % 128;
            return Boolean.TRUE.toString();
        } catch (IllegalAccessException e) {
            ˏ = s.m169();
            intern = m103(284, 24, 0).intern();
            stringBuilder = new StringBuilder();
            stringBuilder.append(m103(308, 47, 0).intern());
            stringBuilder.append(e);
            ˏ.m179(intern, stringBuilder.toString());
        } catch (NoSuchMethodException e2) {
            ˏ = s.m169();
            intern = m103(284, 24, 0).intern();
            stringBuilder = new StringBuilder();
            stringBuilder.append(m103(308, 47, 0).intern());
            stringBuilder.append(e2);
            ˏ.m179(intern, stringBuilder.toString());
        } catch (InvocationTargetException e3) {
            ˏ = s.m169();
            intern = m103(284, 24, 0).intern();
            stringBuilder = new StringBuilder();
            stringBuilder.append(m103(308, 47, 0).intern());
            stringBuilder.append(e3);
            ˏ.m179(intern, stringBuilder.toString());
        }
    }

    /* renamed from: ˎ */
    private static String m100(String str) {
        int i = f122 + 9;
        f121 = i % 128;
        if (i % 2 != 0) {
            if ((!str.contains(m103(169, 1, 0).intern()) ? 35 : 74) == 35) {
                return str;
            }
        } else if (!str.contains(m103(8832, 1, 0).intern())) {
            return str;
        }
        String[] split = str.split(m103(170, 2, 0).intern());
        i = split.length;
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = i - 1;
        stringBuilder.append(split[i2]);
        stringBuilder.append(m103(169, 1, 0).intern());
        int i3 = 1;
        while (true) {
            Object obj;
            if (i3 < i2) {
                obj = 44;
            } else {
                i = 95;
            }
            if (obj != 95) {
                f122 = (f121 + 87) % 128;
                stringBuilder.append(split[i3]);
                stringBuilder.append(m103(169, 1, 0).intern());
                i3++;
            } else {
                stringBuilder.append(split[0]);
                return stringBuilder.toString();
            }
        }
    }

    /* renamed from: ˏ */
    private static String m101(Context context) {
        PackageManager packageManager;
        String packageName;
        int i = f122 + 37;
        f121 = i % 128;
        if ((i % 2 == 0 ? 0 : 29) != 29) {
            try {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            } catch (NameNotFoundException e) {
                return null;
            }
        }
        packageManager = context.getPackageManager();
        packageName = context.getPackageName();
        packageName = packageManager.getPackageInfo(packageName, 0).packageName;
        int i2 = f121 + 77;
        f122 = i2 % 128;
        if ((i2 % 2 != 0 ? 45 : 88) != 45) {
            return packageName;
        }
        i2 = 0 / 0;
        return packageName;
    }

    /* JADX WARNING: Missing block: B:21:0x00f9, code skipped:
            if ((m106(m103(87, 65, 11028).intern()) ? 24 : 69) != 69) goto L_0x00fb;
     */
    /* JADX WARNING: Missing block: B:46:0x023b, code skipped:
            if (m106(m103(86, 25, 11028).intern()) == false) goto L_0x023d;
     */
    /* JADX WARNING: Missing block: B:47:0x023d, code skipped:
            r0 = m103(35, 1, 54779);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @Nullable
    /* renamed from: ˏ */
    static String m102(Context context, long j) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder2.append((m106(m103(0, 34, 5928).intern()) ? m103(34, 1, 0) : m103(35, 1, 54779)).intern());
        StringBuilder stringBuilder4 = new StringBuilder();
        String packageName = context.getPackageName();
        String ˎ = m100(packageName);
        stringBuilder2.append(m103(34, 1, 0).intern());
        stringBuilder4.append(ˎ);
        if (m104(context) == null) {
            stringBuilder2.append(m103(35, 1, 54779).intern());
            stringBuilder4.append(packageName);
        } else {
            stringBuilder2.append(m103(34, 1, 0).intern());
            stringBuilder4.append(packageName);
        }
        ˎ = m101(context);
        if (ˎ == null) {
            stringBuilder2.append(m103(35, 1, 54779).intern());
            stringBuilder4.append(packageName);
        } else {
            stringBuilder2.append(m103(34, 1, 0).intern());
            stringBuilder4.append(ˎ);
        }
        stringBuilder4.append(m99(context, packageName));
        stringBuilder.append(stringBuilder4.toString());
        try {
            long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(m103(36, 18, 0).intern(), Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            stringBuilder.append(simpleDateFormat.format(new Date(j2)));
            int i = f121 + 61;
            f122 = i % 128;
            if ((i % 2 != 0 ? 13 : 85) != 85) {
                stringBuilder.append(j);
            } else {
                stringBuilder.append(j);
            }
            String ॱ = m103(34, 1, 0);
            stringBuilder3.append(ॱ.intern());
            if (m106(m103(111, 23, 56188).intern())) {
                ॱ = m103(34, 1, 0).intern();
            } else {
                ॱ = m103(35, 1, 54779).intern();
                f122 = (f121 + 87) % 128;
            }
            stringBuilder3.append(ॱ);
            if (m106(m103(134, 20, 47445).intern())) {
                i = f121 + 107;
                f122 = i % 128;
                if (i % 2 != 0) {
                    ॱ = m103(72, 0, 0).intern();
                } else {
                    ॱ = m103(34, 1, 0);
                    ॱ = ॱ.intern();
                }
            } else {
                ॱ = m103(35, 1, 54779);
                ॱ = ॱ.intern();
            }
            stringBuilder3.append(ॱ);
            if (m106(m103(154, 15, 0).intern())) {
                i = f121 + 107;
                f122 = i % 128;
                if ((i % 2 != 0 ? 87 : 29) != 29) {
                    ॱ = m103(122, 1, 0).intern();
                } else {
                    ॱ = m103(34, 1, 0);
                    ॱ = ॱ.intern();
                }
            } else {
                ॱ = m103(35, 1, 54779);
                ॱ = ॱ.intern();
            }
            stringBuilder3.append(ॱ);
            ॱ = p.m158(p.m157(stringBuilder.toString()));
            packageName = stringBuilder2.toString();
            stringBuilder = new StringBuilder(ॱ);
            stringBuilder.setCharAt(17, Integer.toString(Integer.parseInt(packageName, 2), 16).charAt(0));
            ॱ = stringBuilder.toString();
            packageName = stringBuilder3.toString();
            stringBuilder = new StringBuilder(ॱ);
            stringBuilder.setCharAt(27, Integer.toString(Integer.parseInt(packageName, 2), 16).charAt(0));
            return m105(stringBuilder.toString(), Long.valueOf(j));
        } catch (NameNotFoundException e) {
            return m103(54, 32, 0).intern();
        }
    }

    /* renamed from: ॱ */
    private static String m103(int i, int i2, char c) {
        f121 = (f122 + 103) % 128;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (true) {
            if ((i3 < i2 ? 1 : null) != 1) {
                return new String(cArr);
            }
            f121 = (f122 + 61) % 128;
            cArr[i3] = (char) ((int) ((((long) f123[i + i3]) ^ (((long) i3) * f120)) ^ ((long) c)));
            i3++;
        }
    }

    /* renamed from: ॱ */
    private static String m104(Context context) {
        f122 = (f121 + 23) % 128;
        if ((System.getProperties().containsKey(m103(172, 14, 63403).intern()) ? 0 : 1) == 1) {
            return null;
        }
        f122 = (f121 + 89) % 128;
        try {
            Matcher matcher = Pattern.compile(m103(192, 10, 0).intern()).matcher(context.getCacheDir().getPath().replace(m103(186, 6, 0).intern(), ""));
            if ((matcher.find() ? 0 : 1) == 1) {
                return null;
            }
            int i = f122 + 15;
            f121 = i % 128;
            return i % 2 == 0 ? matcher.group(0) : matcher.group(1);
        } catch (Exception e) {
            s ˏ = s.m169();
            String intern = m103(202, 17, 0).intern();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(m103(219, 41, 0).intern());
            stringBuilder.append(e);
            ˏ.m179(intern, stringBuilder.toString());
            return null;
        }
    }

    /* JADX WARNING: Missing block: B:12:0x002e, code skipped:
            if ((r13 != null ? 51 : 60) == 51) goto L_0x0030;
     */
    /* JADX WARNING: Missing block: B:22:0x005b, code skipped:
            if (r13 != null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ॱ */
    private static String m105(String str, Long l) {
        if ((str != null ? 0 : 1) == 0) {
            int i = f122 + 45;
            f121 = i % 128;
            if (i % 2 == 0) {
                Object[] objArr = null;
                i = objArr.length;
            }
            if (str.length() == 32) {
                StringBuilder stringBuilder = new StringBuilder(str);
                String obj = l.toString();
                i = 0;
                int i2 = 0;
                while (true) {
                    if ((i2 < obj.length() ? 0 : 1) == 1) {
                        break;
                    }
                    i += Character.getNumericValue(obj.charAt(i2));
                    i2++;
                }
                String toHexString = Integer.toHexString(i);
                stringBuilder.replace(7, toHexString.length() + 7, toHexString);
                f121 = (f122 + 77) % 128;
                long j = 0;
                int i3 = 0;
                while (i3 < stringBuilder.length()) {
                    i = f121 + 35;
                    f122 = i % 128;
                    if (i % 2 != 0) {
                        j -= (long) Character.getNumericValue(stringBuilder.charAt(i3));
                        i3 += 29;
                    } else {
                        j = ((long) Character.getNumericValue(stringBuilder.charAt(i3))) + j;
                        i3++;
                    }
                }
                while (j > 100) {
                    i = f121 + 89;
                    f122 = i % 128;
                    j = i % 2 != 0 ? j * 100 : j % 100;
                }
                stringBuilder.insert(23, (int) j);
                if (j < 10) {
                    i = f121 + 15;
                    f122 = i % 128;
                    if (i % 2 != 0) {
                        stringBuilder.insert(101, m103(36, 1, 54779).intern());
                    } else {
                        stringBuilder.insert(23, m103(35, 1, 54779).intern());
                    }
                }
                return stringBuilder.toString();
            }
        }
        return m103(54, 32, 0).intern();
    }

    /* renamed from: ॱ */
    private static boolean m106(String str) {
        int i = f122 + 121;
        f121 = i % 128;
        if (i % 2 == 0) {
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
