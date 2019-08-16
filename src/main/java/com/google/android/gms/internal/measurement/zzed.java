package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.Param;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class zzed extends zzjs {
    zzed(zzjt zzjt) {
        super(zzjt);
    }

    private final Boolean zza(double d, zzkj zzkj) {
        try {
            return zza(new BigDecimal(d), zzkj, Math.ulp(d));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private final Boolean zza(long j, zzkj zzkj) {
        try {
            return zza(new BigDecimal(j), zzkj, 0.0d);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private final Boolean zza(zzkh zzkh, String str, zzks[] zzksArr, long j) {
        Boolean zza;
        Object obj;
        if (zzkh.zzato != null) {
            zza = zza(j, zzkh.zzato);
            if (zza == null) {
                return null;
            }
            if (!zza.booleanValue()) {
                return Boolean.valueOf(false);
            }
        }
        HashSet hashSet = new HashSet();
        for (zzki zzki : zzkh.zzatm) {
            if (TextUtils.isEmpty(zzki.zzatt)) {
                zzgi().zziy().zzg("null or empty param name in filter. event", zzgf().zzbm(str));
                return null;
            }
            hashSet.add(zzki.zzatt);
        }
        ArrayMap arrayMap = new ArrayMap();
        for (zzks zzks : zzksArr) {
            if (hashSet.contains(zzks.name)) {
                Object obj2;
                if (zzks.zzave != null) {
                    obj = zzks.name;
                    obj2 = zzks.zzave;
                } else if (zzks.zzasw != null) {
                    obj = zzks.name;
                    obj2 = zzks.zzasw;
                } else if (zzks.zzale != null) {
                    obj = zzks.name;
                    obj2 = zzks.zzale;
                } else {
                    zzgi().zziy().zze("Unknown value for param. event, param", zzgf().zzbm(str), zzgf().zzbn(zzks.name));
                    return null;
                }
                arrayMap.put(obj, obj2);
            }
        }
        for (zzki zzki2 : zzkh.zzatm) {
            boolean equals = Boolean.TRUE.equals(zzki2.zzats);
            String str2 = zzki2.zzatt;
            if (TextUtils.isEmpty(str2)) {
                zzgi().zziy().zzg("Event has empty param name. event", zzgf().zzbm(str));
                return null;
            }
            obj = arrayMap.get(str2);
            if (obj instanceof Long) {
                if (zzki2.zzatr == null) {
                    zzgi().zziy().zze("No number filter for long param. event, param", zzgf().zzbm(str), zzgf().zzbn(str2));
                    return null;
                }
                zza = zza(((Long) obj).longValue(), zzki2.zzatr);
                if (zza == null) {
                    return null;
                }
                if (((zza.booleanValue() ^ 1) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof Double) {
                if (zzki2.zzatr == null) {
                    zzgi().zziy().zze("No number filter for double param. event, param", zzgf().zzbm(str), zzgf().zzbn(str2));
                    return null;
                }
                zza = zza(((Double) obj).doubleValue(), zzki2.zzatr);
                if (zza == null) {
                    return null;
                }
                if (((zza.booleanValue() ^ 1) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof String) {
                if (zzki2.zzatq != null) {
                    zza = zza((String) obj, zzki2.zzatq);
                } else if (zzki2.zzatr != null) {
                    String str3 = (String) obj;
                    if (zzjz.zzcf(str3)) {
                        zza = zza(str3, zzki2.zzatr);
                    } else {
                        zzgi().zziy().zze("Invalid param value for number filter. event, param", zzgf().zzbm(str), zzgf().zzbn(str2));
                        return null;
                    }
                } else {
                    zzgi().zziy().zze("No filter for String param. event, param", zzgf().zzbm(str), zzgf().zzbn(str2));
                    return null;
                }
                if (zza == null) {
                    return null;
                }
                if (((zza.booleanValue() ^ 1) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj == null) {
                zzgi().zzjc().zze("Missing param for filter. event, param", zzgf().zzbm(str), zzgf().zzbn(str2));
                return Boolean.valueOf(false);
            } else {
                zzgi().zziy().zze("Unknown param type. event, param", zzgf().zzbm(str), zzgf().zzbn(str2));
                return null;
            }
        }
        return Boolean.valueOf(true);
    }

    private final Boolean zza(zzkk zzkk, zzkx zzkx) {
        zzfk zziy;
        String str;
        zzki zzki = zzkk.zzaud;
        if (zzki == null) {
            zziy = zzgi().zziy();
            str = "Missing property filter. property";
        } else {
            Boolean zza;
            boolean equals = Boolean.TRUE.equals(zzki.zzats);
            if (zzkx.zzave != null) {
                if (zzki.zzatr == null) {
                    zziy = zzgi().zziy();
                    str = "No number filter for long property. property";
                } else {
                    zza = zza(zzkx.zzave.longValue(), zzki.zzatr);
                }
            } else if (zzkx.zzasw != null) {
                if (zzki.zzatr == null) {
                    zziy = zzgi().zziy();
                    str = "No number filter for double property. property";
                } else {
                    zza = zza(zzkx.zzasw.doubleValue(), zzki.zzatr);
                }
            } else if (zzkx.zzale == null) {
                zziy = zzgi().zziy();
                str = "User property has no value, property";
            } else if (zzki.zzatq != null) {
                zza = zza(zzkx.zzale, zzki.zzatq);
            } else if (zzki.zzatr == null) {
                zzgi().zziy().zzg("No string or number filter defined. property", zzgf().zzbo(zzkx.name));
                return null;
            } else if (zzjz.zzcf(zzkx.zzale)) {
                zza = zza(zzkx.zzale, zzki.zzatr);
            } else {
                zzgi().zziy().zze("Invalid user property value for Numeric number filter. property, value", zzgf().zzbo(zzkx.name), zzkx.zzale);
                return null;
            }
            return zza(zza, equals);
        }
        zziy.zzg(str, zzgf().zzbo(zzkx.name));
        return null;
    }

    @VisibleForTesting
    private static Boolean zza(Boolean bool, boolean z) {
        return bool == null ? null : Boolean.valueOf(bool.booleanValue() ^ z);
    }

    private final Boolean zza(String str, int i, boolean z, String str2, List<String> list, String str3) {
        Boolean bool = null;
        if (str == null) {
            return bool;
        }
        CharSequence str4;
        boolean startsWith;
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return bool;
            }
        } else if (str2 == null) {
            return bool;
        }
        if (!(z || i == 1)) {
            str4 = str4.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str4).matches());
                } catch (PatternSyntaxException e) {
                    zzgi().zziy().zzg("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return bool;
                }
            case 2:
                startsWith = str4.startsWith(str2);
                break;
            case 3:
                startsWith = str4.endsWith(str2);
                break;
            case 4:
                startsWith = str4.contains(str2);
                break;
            case 5:
                startsWith = str4.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str4);
                break;
            default:
                return bool;
        }
        return Boolean.valueOf(startsWith);
    }

    private final Boolean zza(String str, zzkj zzkj) {
        Boolean bool = null;
        if (!zzjz.zzcf(str)) {
            return bool;
        }
        try {
            return zza(new BigDecimal(str), zzkj, 0.0d);
        } catch (NumberFormatException e) {
            return bool;
        }
    }

    @VisibleForTesting
    private final Boolean zza(String str, zzkl zzkl) {
        int i = 0;
        String str2 = null;
        Preconditions.checkNotNull(zzkl);
        if (str == null || zzkl.zzaue == null || zzkl.zzaue.intValue() == 0) {
            return null;
        }
        List list;
        if (zzkl.zzaue.intValue() == 6) {
            if (zzkl.zzauh == null || zzkl.zzauh.length == 0) {
                return null;
            }
        } else if (zzkl.zzauf == null) {
            return null;
        }
        int intValue = zzkl.zzaue.intValue();
        boolean z = zzkl.zzaug != null && zzkl.zzaug.booleanValue();
        String toUpperCase = (z || intValue == 1 || intValue == 6) ? zzkl.zzauf : zzkl.zzauf.toUpperCase(Locale.ENGLISH);
        if (zzkl.zzauh == null) {
            list = null;
        } else {
            String[] strArr = zzkl.zzauh;
            if (z) {
                list = Arrays.asList(strArr);
            } else {
                list = new ArrayList();
                int length = strArr.length;
                while (i < length) {
                    list.add(strArr[i].toUpperCase(Locale.ENGLISH));
                    i++;
                }
            }
        }
        if (intValue == 1) {
            str2 = toUpperCase;
        }
        return zza(str, intValue, z, toUpperCase, list, str2);
    }

    /* JADX WARNING: Missing block: B:35:0x0079, code skipped:
            if (r4 != null) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @VisibleForTesting
    private static Boolean zza(BigDecimal bigDecimal, zzkj zzkj, double d) {
        boolean z = false;
        boolean z2 = true;
        Preconditions.checkNotNull(zzkj);
        if (zzkj.zzatw != null) {
            if (zzkj.zzatw.intValue() == 0) {
                return null;
            }
            BigDecimal bigDecimal2;
            BigDecimal bigDecimal3;
            if (zzkj.zzatw.intValue() == 4) {
                if (zzkj.zzatz == null || zzkj.zzaua == null) {
                    return null;
                }
            } else if (zzkj.zzaty == null) {
                return null;
            }
            int intValue = zzkj.zzatw.intValue();
            BigDecimal bigDecimal4;
            if (zzkj.zzatw.intValue() == 4) {
                if (!zzjz.zzcf(zzkj.zzatz)) {
                    return null;
                }
                if (!zzjz.zzcf(zzkj.zzaua)) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(zzkj.zzatz);
                    bigDecimal4 = new BigDecimal(zzkj.zzaua);
                    bigDecimal3 = null;
                } catch (NumberFormatException e) {
                    return null;
                }
            } else if (!zzjz.zzcf(zzkj.zzaty)) {
                return null;
            } else {
                try {
                    bigDecimal3 = new BigDecimal(zzkj.zzaty);
                    bigDecimal4 = null;
                    bigDecimal2 = null;
                } catch (NumberFormatException e2) {
                    return null;
                }
            }
            if (intValue == 4) {
                if (bigDecimal2 == null) {
                    return null;
                }
            }
            switch (intValue) {
                case 1:
                    if (bigDecimal.compareTo(bigDecimal3) != -1) {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                case 2:
                    if (bigDecimal.compareTo(bigDecimal3) != 1) {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                case 3:
                    if (d != 0.0d) {
                        if (bigDecimal.compareTo(bigDecimal3.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal3.add(new BigDecimal(d).multiply(new BigDecimal(2)))) == -1) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (bigDecimal.compareTo(bigDecimal3) != 0) {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                case 4:
                    if (bigDecimal.compareTo(bigDecimal2) == -1 || bigDecimal.compareTo(bigDecimal4) == 1) {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                default:
                    return null;
            }
        }
        return null;
    }

    private final void zza(Integer num, Integer num2, zzki zzki, Boolean bool, Boolean bool2) {
        boolean z = false;
        if (zzki == null) {
            zzgi().zziy().zze("The leaf filter of event or user property filter is null. audience ID, filter ID", num, num2);
            return;
        }
        boolean z2 = (bool != null && bool.booleanValue()) || (bool2 != null && bool2.booleanValue());
        zzki.zzatu = Boolean.valueOf(z2);
        if (bool2 != null && bool2.booleanValue()) {
            z = true;
        }
        zzki.zzatv = Boolean.valueOf(z);
    }

    private static void zza(Map<Integer, Long> map, int i, long j) {
        Long l = (Long) map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }

    private static zzkq[] zzd(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        int i = 0;
        zzkq[] zzkqArr = new zzkq[map.size()];
        Iterator it = map.keySet().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return zzkqArr;
            }
            Integer num = (Integer) it.next();
            zzkq zzkq = new zzkq();
            zzkq.zzaux = num;
            zzkq.zzauy = (Long) map.get(num);
            zzkqArr[i2] = zzkq;
            i = i2 + 1;
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zza(String str, zzkg[] zzkgArr) {
        Preconditions.checkNotNull(zzkgArr);
        for (zzkg zzkg : zzkgArr) {
            int i;
            for (zzkh zzkh : zzkg.zzatg) {
                String zzal = Event.zzal(zzkh.zzatl);
                if (zzal != null) {
                    zzkh.zzatl = zzal;
                }
                zzki[] zzkiArr = zzkh.zzatm;
                int length = zzkiArr.length;
                int i2 = 0;
                while (true) {
                    i = i2;
                    if (i >= length) {
                        break;
                    }
                    zzki zzki = zzkiArr[i];
                    zzal = Param.zzal(zzki.zzatt);
                    if (zzal != null) {
                        zzki.zzatt = zzal;
                    }
                    zza(zzkg.zzate, zzkh.zzatk, zzki, zzkg.zzath, zzkg.zzati);
                    i2 = i + 1;
                }
            }
            for (zzkk zzkk : zzkg.zzatf) {
                String zzal2 = UserProperty.zzal(zzkk.zzauc);
                if (zzal2 != null) {
                    zzkk.zzauc = zzal2;
                }
                zza(zzkg.zzate, zzkk.zzatk, zzkk.zzaud, zzkg.zzath, zzkg.zzati);
            }
        }
        zzjh().zzb(str, zzkgArr);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x098b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x098b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0337  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @WorkerThread
    public final zzkp[] zza(String str, zzkr[] zzkrArr, zzkx[] zzkxArr) {
        int intValue;
        zzkv zzkv;
        BitSet bitSet;
        int intValue2;
        Map map;
        int i;
        Long l;
        int i2;
        zzks[] zzksArr;
        String str2;
        zzkr zzkr;
        Long l2;
        long j;
        int i3;
        zzet zzf;
        zzet zzet;
        Map map2;
        ArrayMap arrayMap;
        HashSet hashSet;
        ArrayMap arrayMap2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        zzkp zzkp;
        BitSet bitSet2;
        Map map9;
        Map map10;
        Map map11;
        Object obj;
        SQLiteException e;
        zzfk zziv;
        String str3;
        Preconditions.checkNotEmpty(str);
        HashSet hashSet2 = new HashSet();
        ArrayMap map32 = new ArrayMap();
        ArrayMap map52 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        Map arrayMap4 = new ArrayMap();
        boolean zzd = zzgk().zzd(str, zzez.zzajx);
        Map zzbi = zzjh().zzbi(str);
        if (zzbi != null) {
            for (Integer intValue3 : zzbi.keySet()) {
                intValue = intValue3.intValue();
                zzkv = (zzkv) zzbi.get(Integer.valueOf(intValue));
                BitSet bitSet3 = (BitSet) map52.get(Integer.valueOf(intValue));
                bitSet = (BitSet) arrayMap3.get(Integer.valueOf(intValue));
                if (zzd) {
                    ArrayMap arrayMap5 = new ArrayMap();
                    if (!(zzkv == null || zzkv.zzawn == null)) {
                        for (zzkq zzkq : zzkv.zzawn) {
                            if (zzkq.zzaux != null) {
                                arrayMap5.put(zzkq.zzaux, zzkq.zzauy);
                            }
                        }
                    }
                    arrayMap4.put(Integer.valueOf(intValue), arrayMap5);
                    map = arrayMap5;
                } else {
                    map = null;
                }
                if (bitSet3 == null) {
                    bitSet3 = new BitSet();
                    map52.put(Integer.valueOf(intValue), bitSet3);
                    bitSet = new BitSet();
                    arrayMap3.put(Integer.valueOf(intValue), bitSet);
                }
                for (i = 0; i < (zzkv.zzawl.length << 6); i++) {
                    Object obj2;
                    if (zzjz.zza(zzkv.zzawl, i)) {
                        zzgi().zzjc().zze("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i));
                        bitSet.set(i);
                        if (zzjz.zza(zzkv.zzawm, i)) {
                            bitSet3.set(i);
                            obj2 = 1;
                            if (map != null && obj2 == null) {
                                map.remove(Integer.valueOf(i));
                            }
                        }
                    }
                    obj2 = null;
                    map.remove(Integer.valueOf(i));
                }
                zzkp zzkp2 = new zzkp();
                map32.put(Integer.valueOf(intValue), zzkp2);
                zzkp2.zzauv = Boolean.valueOf(false);
                zzkp2.zzauu = zzkv;
                zzkp2.zzaut = new zzkv();
                zzkp2.zzaut.zzawm = zzjz.zza(bitSet3);
                zzkp2.zzaut.zzawl = zzjz.zza(bitSet);
                if (zzd) {
                    zzkp2.zzaut.zzawn = zzd(map);
                }
            }
        }
        Map map12 = arrayMap3;
        Object obj3;
        if (zzkrArr != null) {
            ArrayMap arrayMap6 = new ArrayMap();
            int length = zzkrArr.length;
            long j2 = 0;
            zzkr zzkr2 = null;
            Long l3 = null;
            intValue = 0;
            ArrayMap arrayMap7 = arrayMap4;
            ArrayMap map72 = map12;
            while (intValue < length) {
                zzkr zzkr3 = zzkrArr[intValue];
                String str4 = zzkr3.name;
                zzks[] zzksArr2 = zzkr3.zzava;
                zzks[] zzksArr3;
                Object map42;
                Object map62;
                Object map82;
                if (zzgk().zzd(str, zzez.zzajr)) {
                    zzjf();
                    Long l4 = (Long) zzjz.zzb(zzkr3, "_eid");
                    obj3 = l4 != null ? 1 : null;
                    Object obj4 = (obj3 == null || !str4.equals("_ep")) ? null : 1;
                    if (obj4 != null) {
                        zzjf();
                        str4 = (String) zzjz.zzb(zzkr3, "_en");
                        if (TextUtils.isEmpty(str4)) {
                            zzgi().zziv().zzg("Extra parameter without an event name. eventId", l4);
                        } else {
                            zzks[] zzksArr4;
                            if (zzkr2 == null || l3 == null || l4.longValue() != l3.longValue()) {
                                Pair zza = zzjh().zza(str, l4);
                                if (zza == null || zza.first == null) {
                                    zzgi().zziv().zze("Extra parameter without existing main event. eventName, eventId", str4, l4);
                                } else {
                                    zzkr zzkr4 = (zzkr) zza.first;
                                    j2 = ((Long) zza.second).longValue();
                                    zzjf();
                                    l = (Long) zzjz.zzb(zzkr4, "_eid");
                                    zzkr2 = zzkr4;
                                }
                            } else {
                                l = l3;
                            }
                            j2--;
                            if (j2 <= 0) {
                                zzek zzjh = zzjh();
                                zzjh.zzab();
                                zzjh.zzgi().zzjc().zzg("Clearing complex main event info. appId", str);
                                try {
                                    try {
                                        zzjh.getWritableDatabase().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                                    } catch (SQLiteException e2) {
                                        obj4 = e2;
                                        zzjh.zzgi().zziv().zzg("Error clearing complex main event", obj4);
                                        zzksArr4 = new zzks[(zzkr2.zzava.length + zzksArr2.length)];
                                        i2 = 0;
                                        while (r4 < r13) {
                                        }
                                        if (i2 <= 0) {
                                        }
                                        zzksArr3 = zzksArr;
                                        str2 = str4;
                                        zzkr = zzkr2;
                                        l2 = l;
                                        j = j2;
                                        i3 = intValue;
                                        zzf = zzjh().zzf(str, zzkr3.name);
                                        if (zzf == null) {
                                        }
                                        zzjh().zza(zzet);
                                        j2 = zzet.zzahh;
                                        map2 = (Map) arrayMap6.get(str2);
                                        if (map2 == null) {
                                        }
                                        map42 = map32;
                                        map62 = map52;
                                        map82 = map72;
                                        arrayMap = arrayMap7;
                                        for (Integer intValue32 : r8.keySet()) {
                                        }
                                        hashSet = hashSet2;
                                        arrayMap2 = arrayMap6;
                                        intValue = i3 + 1;
                                        arrayMap6 = arrayMap2;
                                        zzkr2 = zzkr;
                                        l3 = l2;
                                        map32 = map42;
                                        hashSet2 = hashSet;
                                        arrayMap7 = arrayMap;
                                        map52 = map62;
                                        map72 = map82;
                                        j2 = j;
                                    }
                                } catch (SQLiteException e3) {
                                    obj4 = e3;
                                }
                            } else {
                                zzjh().zza(str, l4, j2, zzkr2);
                            }
                            zzksArr4 = new zzks[(zzkr2.zzava.length + zzksArr2.length)];
                            i2 = 0;
                            for (zzks zzks : zzkr2.zzava) {
                                zzjf();
                                if (zzjz.zza(zzkr3, zzks.name) == null) {
                                    zzksArr4[i2] = zzks;
                                    i2++;
                                }
                            }
                            if (i2 <= 0) {
                                i = i2;
                                for (zzks zzks2 : zzksArr2) {
                                    zzksArr4[i] = zzks2;
                                    i++;
                                }
                                zzksArr = i == zzksArr4.length ? zzksArr4 : (zzks[]) Arrays.copyOf(zzksArr4, i);
                            } else {
                                zzgi().zziy().zzg("No unique parameters in main event. eventName", str4);
                                zzksArr = zzksArr2;
                            }
                            zzksArr3 = zzksArr;
                            str2 = str4;
                            zzkr = zzkr2;
                            l2 = l;
                            j = j2;
                            i3 = intValue;
                        }
                        l2 = l3;
                        zzkr = zzkr2;
                        hashSet = hashSet2;
                        arrayMap2 = arrayMap6;
                        arrayMap = arrayMap7;
                        map82 = map72;
                        map42 = map32;
                        map62 = map52;
                        j = j2;
                        i3 = intValue;
                    } else if (obj3 != null) {
                        zzjf();
                        obj4 = zzjz.zzb(zzkr3, "_epc");
                        if (obj4 == null) {
                            obj4 = Long.valueOf(0);
                        }
                        j2 = ((Long) obj4).longValue();
                        if (j2 <= 0) {
                            zzgi().zziy().zzg("Complex event with zero extra param count. eventName", str4);
                        } else {
                            zzjh().zza(str, l4, j2, zzkr3);
                        }
                        zzksArr3 = zzksArr2;
                        str2 = str4;
                        zzkr = zzkr3;
                        l2 = l4;
                        j = j2;
                        i3 = intValue;
                    } else {
                        i2 = intValue;
                        zzksArr3 = zzksArr2;
                        str2 = str4;
                        zzkr = zzkr2;
                        l2 = l3;
                        j = j2;
                        i3 = i2;
                    }
                    zzf = zzjh().zzf(str, zzkr3.name);
                    if (zzf == null) {
                        zzgi().zziy().zze("Event aggregate wasn't created during raw event logging. appId, event", zzfi.zzbp(str), zzgf().zzbm(str2));
                        zzet = new zzet(str, zzkr3.name, 1, 1, zzkr3.zzavb.longValue(), 0, null, null, null);
                    } else {
                        zzet = zzf.zzim();
                    }
                    zzjh().zza(zzet);
                    j2 = zzet.zzahh;
                    map2 = (Map) arrayMap6.get(str2);
                    if (map2 == null) {
                        map2 = zzjh().zzk(str, str2);
                        if (map2 == null) {
                            map2 = new ArrayMap();
                        }
                        arrayMap6.put(str2, map2);
                        map = map2;
                    } else {
                        map = map2;
                    }
                    map42 = map32;
                    map62 = map52;
                    map82 = map72;
                    arrayMap = arrayMap7;
                    while (r33.hasNext()) {
                        int intValue4 = intValue32.intValue();
                        if (hashSet2.contains(Integer.valueOf(intValue4))) {
                            zzgi().zzjc().zzg("Skipping failed audience ID", Integer.valueOf(intValue4));
                        } else {
                            BitSet bitSet4;
                            BitSet bitSet5;
                            zzkp = (zzkp) map42.get(Integer.valueOf(intValue4));
                            bitSet = (BitSet) map62.get(Integer.valueOf(intValue4));
                            bitSet2 = (BitSet) map82.get(Integer.valueOf(intValue4));
                            map2 = zzd ? (Map) arrayMap.get(Integer.valueOf(intValue4)) : null;
                            if (zzkp == null) {
                                zzkp = new zzkp();
                                map42.put(Integer.valueOf(intValue4), zzkp);
                                zzkp.zzauv = Boolean.valueOf(true);
                                bitSet = new BitSet();
                                map62.put(Integer.valueOf(intValue4), bitSet);
                                bitSet2 = new BitSet();
                                map82.put(Integer.valueOf(intValue4), bitSet2);
                                if (zzd) {
                                    map2 = new ArrayMap();
                                    arrayMap.put(Integer.valueOf(intValue4), map2);
                                }
                                bitSet4 = bitSet2;
                                bitSet5 = bitSet;
                                map9 = map2;
                            } else {
                                bitSet4 = bitSet2;
                                bitSet5 = bitSet;
                                map9 = map2;
                            }
                            for (zzkh zzkh : (List) r8.get(Integer.valueOf(intValue4))) {
                                zzfk zziy;
                                String str5;
                                Integer zzbp;
                                if (zzgi().isLoggable(2)) {
                                    zzgi().zzjc().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(intValue4), zzkh.zzatk, zzgf().zzbm(zzkh.zzatl));
                                    zzgi().zzjc().zzg("Filter definition", zzjf().zza(zzkh));
                                }
                                if (zzkh.zzatk == null || zzkh.zzatk.intValue() > 256) {
                                    zziy = zzgi().zziy();
                                    str5 = "Invalid event filter ID. appId, id";
                                    zzbp = zzfi.zzbp(str);
                                    obj4 = String.valueOf(zzkh.zzatk);
                                } else {
                                    Boolean zza2;
                                    zzfk zzjc;
                                    Boolean bool;
                                    if (zzd) {
                                        Object obj5 = (zzkh == null || zzkh.zzatm == null || zzkh.zzatm.length <= 0 || zzkh.zzatm[0].zzatu == null || !zzkh.zzatm[0].zzatu.booleanValue()) ? null : 1;
                                        if (bitSet5.get(zzkh.zzatk.intValue()) && obj5 == null) {
                                            zzgi().zzjc().zze("Event filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID", Integer.valueOf(intValue4), zzkh.zzatk);
                                        } else {
                                            zza2 = zza(zzkh, str2, zzksArr3, j2);
                                            zzjc = zzgi().zzjc();
                                            if (zza2 == null) {
                                                obj4 = "null";
                                            } else {
                                                bool = zza2;
                                            }
                                            zzjc.zzg("Event filter result", obj4);
                                            if (zza2 != null) {
                                                bitSet4.set(zzkh.zzatk.intValue());
                                                if (zza2.booleanValue()) {
                                                    bitSet5.set(zzkh.zzatk.intValue());
                                                    if (!(obj5 == null || zzkr3.zzavb == null)) {
                                                        zza(map9, zzkh.zzatk.intValue(), zzkr3.zzavb.longValue());
                                                    }
                                                }
                                            }
                                        }
                                    } else if (bitSet5.get(zzkh.zzatk.intValue())) {
                                        zziy = zzgi().zzjc();
                                        str5 = "Event filter already evaluated true. audience ID, filter ID";
                                        zzbp = Integer.valueOf(intValue4);
                                        obj4 = zzkh.zzatk;
                                    } else {
                                        zza2 = zza(zzkh, str2, zzksArr3, j2);
                                        zzjc = zzgi().zzjc();
                                        if (zza2 == null) {
                                            obj4 = "null";
                                        } else {
                                            bool = zza2;
                                        }
                                        zzjc.zzg("Event filter result", obj4);
                                        if (zza2 != null) {
                                            bitSet4.set(zzkh.zzatk.intValue());
                                            if (zza2.booleanValue()) {
                                                bitSet5.set(zzkh.zzatk.intValue());
                                            }
                                        }
                                    }
                                    hashSet2.add(Integer.valueOf(intValue4));
                                }
                                zziy.zze(str5, zzbp, obj4);
                            }
                        }
                    }
                    hashSet = hashSet2;
                    arrayMap2 = arrayMap6;
                } else {
                    i2 = intValue;
                    zzksArr3 = zzksArr2;
                    str2 = str4;
                    zzkr = zzkr2;
                    l2 = l3;
                    j = j2;
                    i3 = i2;
                    zzf = zzjh().zzf(str, zzkr3.name);
                    if (zzf == null) {
                    }
                    zzjh().zza(zzet);
                    j2 = zzet.zzahh;
                    map2 = (Map) arrayMap6.get(str2);
                    if (map2 == null) {
                    }
                    map42 = map32;
                    map62 = map52;
                    map82 = map72;
                    arrayMap = arrayMap7;
                    while (r33.hasNext()) {
                    }
                    hashSet = hashSet2;
                    arrayMap2 = arrayMap6;
                }
                intValue = i3 + 1;
                arrayMap6 = arrayMap2;
                zzkr2 = zzkr;
                l3 = l2;
                map32 = map42;
                hashSet2 = hashSet;
                arrayMap7 = arrayMap;
                map52 = map62;
                map72 = map82;
                j2 = j;
            }
            map10 = map32;
            arrayMap4 = arrayMap7;
            map12 = map72;
            map11 = map52;
        } else {
            obj3 = map32;
            Object map112 = map52;
        }
        if (zzkxArr != null) {
            Map arrayMap8 = new ArrayMap();
            int length2 = zzkxArr.length;
            i2 = 0;
            while (true) {
                int i4 = i2;
                if (i4 >= length2) {
                    break;
                }
                zzkx zzkx = zzkxArr[i4];
                map2 = (Map) arrayMap8.get(zzkx.name);
                if (map2 == null) {
                    map2 = zzjh().zzl(str, zzkx.name);
                    if (map2 == null) {
                        map2 = new ArrayMap();
                    }
                    arrayMap8.put(zzkx.name, map2);
                    map62 = map2;
                } else {
                    map62 = map2;
                }
                zzbi = map112;
                map9 = map10;
                Map map13 = map12;
                map42 = arrayMap8;
                for (Integer intValue322 : r14.keySet()) {
                    int intValue5 = intValue322.intValue();
                    if (hashSet2.contains(Integer.valueOf(intValue5))) {
                        zzgi().zzjc().zzg("Skipping failed audience ID", Integer.valueOf(intValue5));
                    } else {
                        zzkp = (zzkp) map9.get(Integer.valueOf(intValue5));
                        bitSet = (BitSet) zzbi.get(Integer.valueOf(intValue5));
                        bitSet2 = (BitSet) map13.get(Integer.valueOf(intValue5));
                        map2 = zzd ? (Map) arrayMap4.get(Integer.valueOf(intValue5)) : null;
                        if (zzkp == null) {
                            zzkp = new zzkp();
                            map9.put(Integer.valueOf(intValue5), zzkp);
                            zzkp.zzauv = Boolean.valueOf(true);
                            bitSet = new BitSet();
                            zzbi.put(Integer.valueOf(intValue5), bitSet);
                            bitSet2 = new BitSet();
                            map13.put(Integer.valueOf(intValue5), bitSet2);
                            if (zzd) {
                                ArrayMap arrayMap9 = new ArrayMap();
                                arrayMap4.put(Integer.valueOf(intValue5), arrayMap9);
                                map112 = arrayMap9;
                                for (zzkk zzkk : (List) r14.get(Integer.valueOf(intValue5))) {
                                    if (zzgi().isLoggable(2)) {
                                        zzgi().zzjc().zzd("Evaluating filter. audience, filter, property", Integer.valueOf(intValue5), zzkk.zzatk, zzgf().zzbo(zzkk.zzauc));
                                        zzgi().zzjc().zzg("Filter definition", zzjf().zza(zzkk));
                                    }
                                    Boolean zza3;
                                    Object obj6;
                                    Boolean obj62;
                                    if (zzkk.zzatk == null || zzkk.zzatk.intValue() > 256) {
                                        zzgi().zziy().zze("Invalid property filter ID. appId, id", zzfi.zzbp(str), String.valueOf(zzkk.zzatk));
                                        hashSet2.add(Integer.valueOf(intValue5));
                                        break;
                                    } else if (zzd) {
                                        obj = (zzkk == null || zzkk.zzaud == null || zzkk.zzaud.zzatu == null || !zzkk.zzaud.zzatu.booleanValue()) ? null : 1;
                                        if (bitSet.get(zzkk.zzatk.intValue()) && obj == null) {
                                            zzgi().zzjc().zze("Property filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID", Integer.valueOf(intValue5), zzkk.zzatk);
                                        } else {
                                            zza3 = zza(zzkk, zzkx);
                                            zzfk zzjc2 = zzgi().zzjc();
                                            if (zza3 == null) {
                                                obj62 = "null";
                                            } else {
                                                obj62 = zza3;
                                            }
                                            zzjc2.zzg("Property filter result", obj62);
                                            if (zza3 == null) {
                                                hashSet2.add(Integer.valueOf(intValue5));
                                            } else {
                                                bitSet2.set(zzkk.zzatk.intValue());
                                                bitSet.set(zzkk.zzatk.intValue(), zza3.booleanValue());
                                                if (!(!zza3.booleanValue() || obj == null || zzkx.zzaws == null)) {
                                                    zza(map112, zzkk.zzatk.intValue(), zzkx.zzaws.longValue());
                                                }
                                            }
                                        }
                                    } else if (bitSet.get(zzkk.zzatk.intValue())) {
                                        zzgi().zzjc().zze("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue5), zzkk.zzatk);
                                    } else {
                                        zza3 = zza(zzkk, zzkx);
                                        zzfk zzjc3 = zzgi().zzjc();
                                        if (zza3 == null) {
                                            obj62 = "null";
                                        } else {
                                            obj62 = zza3;
                                        }
                                        zzjc3.zzg("Property filter result", obj62);
                                        if (zza3 == null) {
                                            hashSet2.add(Integer.valueOf(intValue5));
                                        } else {
                                            bitSet2.set(zzkk.zzatk.intValue());
                                            if (zza3.booleanValue()) {
                                                bitSet.set(zzkk.zzatk.intValue());
                                            }
                                        }
                                    }
                                }
                                arrayMap4 = arrayMap4;
                            }
                        }
                        map112 = map2;
                        for (zzkk zzkk2 : (List) r14.get(Integer.valueOf(intValue5))) {
                        }
                        arrayMap4 = arrayMap4;
                    }
                }
                i2 = i4 + 1;
                arrayMap8 = map42;
                map112 = zzbi;
                map10 = map9;
                map12 = map13;
            }
        }
        zzkp[] zzkpArr = new zzkp[map112.size()];
        int i5 = 0;
        for (Integer intValue3222 : map112.keySet()) {
            intValue2 = intValue3222.intValue();
            if (!hashSet2.contains(Integer.valueOf(intValue2))) {
                zzkp zzkp3 = (zzkp) map10.get(Integer.valueOf(intValue2));
                zzkp zzkp4 = zzkp3 == null ? new zzkp() : zzkp3;
                zzkpArr[i5] = zzkp4;
                zzkp4.zzate = Integer.valueOf(intValue2);
                zzkp4.zzaut = new zzkv();
                zzkp4.zzaut.zzawm = zzjz.zza((BitSet) map112.get(Integer.valueOf(intValue2)));
                zzkp4.zzaut.zzawl = zzjz.zza((BitSet) map12.get(Integer.valueOf(intValue2)));
                if (zzd) {
                    zzkp4.zzaut.zzawn = zzd((Map) arrayMap4.get(Integer.valueOf(intValue2)));
                }
                zzek zzjh2 = zzjh();
                zzkv = zzkp4.zzaut;
                zzjh2.zzch();
                zzjh2.zzab();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzkv);
                try {
                    byte[] bArr = new byte[zzkv.zzwb()];
                    zzacb zzb = zzacb.zzb(bArr, 0, bArr.length);
                    zzkv.zza(zzb);
                    zzb.zzvt();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("audience_id", Integer.valueOf(intValue2));
                    contentValues.put("current_results", bArr);
                    try {
                        try {
                            if (zzjh2.getWritableDatabase().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzjh2.zzgi().zziv().zzg("Failed to insert filter results (got -1). appId", zzfi.zzbp(str));
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            zziv = zzjh2.zzgi().zziv();
                            str3 = "Error storing filter results. appId";
                            obj = e;
                            zziv.zze(str3, zzfi.zzbp(str), obj);
                            i5++;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                    }
                } catch (IOException e6) {
                    obj = e6;
                    zziv = zzjh2.zzgi().zziv();
                    str3 = "Configuration loss. Failed to serialize filter results. appId";
                    zziv.zze(str3, zzfi.zzbp(str), obj);
                    i5++;
                }
                i5++;
            }
        }
        return (zzkp[]) Arrays.copyOf(zzkpArr, i5);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzgn() {
        return false;
    }
}
