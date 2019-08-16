package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: op */
public class op {
    static fz ad = new fz();

    op() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("op.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static Class aa(String str) throws ClassNotFoundException {
        return str.equals("B") ? Byte.TYPE : str.equals("I") ? Integer.TYPE : str.equals("S") ? Short.TYPE : str.equals("J") ? Long.TYPE : str.equals("Z") ? Boolean.TYPE : str.equals("F") ? Float.TYPE : str.equals("D") ? Double.TYPE : str.equals("C") ? Character.TYPE : str.equals("void") ? Void.TYPE : Class.forName(str);
    }

    static Class ac(String str) throws ClassNotFoundException {
        return str.equals("B") ? Byte.TYPE : str.equals("I") ? Integer.TYPE : str.equals("S") ? Short.TYPE : str.equals("J") ? Long.TYPE : str.equals("Z") ? Boolean.TYPE : str.equals("F") ? Float.TYPE : str.equals("D") ? Double.TYPE : str.equals("C") ? Character.TYPE : str.equals("void") ? Void.TYPE : Class.forName(str);
    }

    public static void ae() {
        ad = new fz();
    }

    public static void ag(lv lvVar) {
        os osVar = (os) ad.aj();
        if (osVar != null) {
            int i = lvVar.al;
            lvVar.ae(osVar.ad * -950939157, (byte) 112);
            for (int i2 = 0; i2 < osVar.aq * -390335084; i2++) {
                if (osVar.al[i2] != 0) {
                    lvVar.al(osVar.al[i2], -839321672);
                } else {
                    try {
                        int i3 = osVar.ar[i2];
                        int i4;
                        if (i3 == 0) {
                            i4 = osVar.aj[i2].getInt(null);
                            lvVar.al(0, -976840441);
                            lvVar.ae(i4, (byte) 26);
                        } else if (1 == i3) {
                            osVar.aj[i2].setInt(null, osVar.ai[i2]);
                            lvVar.al(0, -2146011050);
                        } else if (i3 == 2) {
                            i4 = osVar.aj[i2].getModifiers();
                            lvVar.al(0, -1744178352);
                            lvVar.ae(i4, (byte) 53);
                        }
                        if (i3 == 3) {
                            Method method = osVar.ae[i2];
                            byte[][] bArr = osVar.am[i2];
                            Object[] objArr = new Object[bArr.length];
                            for (i3 = 0; i3 < bArr.length; i3++) {
                                objArr[i3] = new ObjectInputStream(new ByteArrayInputStream(bArr[i3])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                lvVar.al(0, -907861944);
                            } else if (invoke instanceof Number) {
                                lvVar.al(1, -1887726607);
                                lvVar.ak(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                lvVar.al(2, -2124071678);
                                lvVar.ap((String) invoke, 635769462);
                            } else {
                                lvVar.al(4, -268971532);
                            }
                        } else if (4 == i3) {
                            i3 = osVar.ae[i2].getModifiers();
                            lvVar.al(0, -1860833201);
                            lvVar.ae(i3, (byte) 62);
                        }
                    } catch (ClassNotFoundException e) {
                        lvVar.al(-10, -1918966885);
                    } catch (InvalidClassException e2) {
                        lvVar.al(-11, -375551147);
                    } catch (StreamCorruptedException e3) {
                        lvVar.al(1589048243, -196900433);
                    } catch (OptionalDataException e4) {
                        lvVar.al(-1781839446, -1892835297);
                    } catch (IllegalAccessException e5) {
                        lvVar.al(-14, 84275406);
                    } catch (IllegalArgumentException e6) {
                        lvVar.al(-15, -1532660667);
                    } catch (InvocationTargetException e7) {
                        lvVar.al(-1181930062, -1596936808);
                    } catch (SecurityException e8) {
                        lvVar.al(-17, -2054775451);
                    } catch (IOException e9) {
                        lvVar.al(-18, -235397207);
                    } catch (NullPointerException e10) {
                        lvVar.al(-19, -1188948628);
                    } catch (Exception e11) {
                        lvVar.al(-1971903660, -751777511);
                    } catch (Throwable th) {
                        lvVar.al(-21, -320856809);
                    }
                }
            }
            lvVar.br(641563908 * i, 1825832670);
            osVar.ky();
        }
    }

    public static void ai() {
        ad = new fz();
    }

    public static boolean ak() {
        return ((os) ad.aj()) != null;
    }

    public static boolean am() {
        return ((os) ad.aj()) != null;
    }

    public static void ap(lv lvVar) {
        os osVar = (os) ad.aj();
        if (osVar != null) {
            int i = lvVar.al;
            lvVar.ae(osVar.ad * -950939157, (byte) 14);
            for (int i2 = 0; i2 < osVar.aq * -1966460865; i2++) {
                if (osVar.al[i2] != 0) {
                    lvVar.al(osVar.al[i2], -172039479);
                } else {
                    try {
                        int i3 = osVar.ar[i2];
                        int i4;
                        if (i3 == 0) {
                            i4 = osVar.aj[i2].getInt(null);
                            lvVar.al(0, -1520221309);
                            lvVar.ae(i4, (byte) 19);
                        } else if (1 == i3) {
                            osVar.aj[i2].setInt(null, osVar.ai[i2]);
                            lvVar.al(0, -784049718);
                        } else if (i3 == 2) {
                            i4 = osVar.aj[i2].getModifiers();
                            lvVar.al(0, -1216625079);
                            lvVar.ae(i4, (byte) 55);
                        }
                        if (i3 == 3) {
                            Method method = osVar.ae[i2];
                            byte[][] bArr = osVar.am[i2];
                            Object[] objArr = new Object[bArr.length];
                            for (i3 = 0; i3 < bArr.length; i3++) {
                                objArr[i3] = new ObjectInputStream(new ByteArrayInputStream(bArr[i3])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                lvVar.al(0, -1941579272);
                            } else if (invoke instanceof Number) {
                                lvVar.al(1, -304595225);
                                lvVar.ak(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                lvVar.al(2, 97984115);
                                lvVar.ap((String) invoke, 635769462);
                            } else {
                                lvVar.al(4, -1641164098);
                            }
                        } else if (4 == i3) {
                            i3 = osVar.ae[i2].getModifiers();
                            lvVar.al(0, -807399437);
                            lvVar.ae(i3, (byte) 119);
                        }
                    } catch (ClassNotFoundException e) {
                        lvVar.al(-10, -1512771202);
                    } catch (InvalidClassException e2) {
                        lvVar.al(-11, -1980703743);
                    } catch (StreamCorruptedException e3) {
                        lvVar.al(-12, -1549505650);
                    } catch (OptionalDataException e4) {
                        lvVar.al(-13, -1175080285);
                    } catch (IllegalAccessException e5) {
                        lvVar.al(-14, -1138951756);
                    } catch (IllegalArgumentException e6) {
                        lvVar.al(-15, 33187693);
                    } catch (InvocationTargetException e7) {
                        lvVar.al(-16, -1634892280);
                    } catch (SecurityException e8) {
                        lvVar.al(-17, -306375426);
                    } catch (IOException e9) {
                        lvVar.al(-18, 83709247);
                    } catch (NullPointerException e10) {
                        lvVar.al(-19, -1233051745);
                    } catch (Exception e11) {
                        lvVar.al(-20, -1334506244);
                    } catch (Throwable th) {
                        lvVar.al(-21, -2127190700);
                    }
                }
            }
            lvVar.br(-1631454091 * i, 1766704003);
            osVar.ky();
        }
    }

    public static void as(lv lvVar) {
        os osVar = (os) ad.aj();
        if (osVar != null) {
            int i = lvVar.al;
            lvVar.ae(osVar.ad * 113652966, (byte) 96);
            for (int i2 = 0; i2 < osVar.aq * -1231099466; i2++) {
                if (osVar.al[i2] != 0) {
                    lvVar.al(osVar.al[i2], -286852989);
                } else {
                    try {
                        int i3 = osVar.ar[i2];
                        int i4;
                        if (i3 == 0) {
                            i4 = osVar.aj[i2].getInt(null);
                            lvVar.al(0, -1949748509);
                            lvVar.ae(i4, (byte) 47);
                        } else if (1 == i3) {
                            osVar.aj[i2].setInt(null, osVar.ai[i2]);
                            lvVar.al(0, -1369238952);
                        } else if (i3 == 2) {
                            i4 = osVar.aj[i2].getModifiers();
                            lvVar.al(0, 51593952);
                            lvVar.ae(i4, (byte) 103);
                        }
                        if (i3 == 3) {
                            Method method = osVar.ae[i2];
                            byte[][] bArr = osVar.am[i2];
                            Object[] objArr = new Object[bArr.length];
                            for (i3 = 0; i3 < bArr.length; i3++) {
                                objArr[i3] = new ObjectInputStream(new ByteArrayInputStream(bArr[i3])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                lvVar.al(0, -1833915532);
                            } else if (invoke instanceof Number) {
                                lvVar.al(1, -1275219644);
                                lvVar.ak(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                lvVar.al(2, -198298688);
                                lvVar.ap((String) invoke, 635769462);
                            } else {
                                lvVar.al(4, -1471476454);
                            }
                        } else if (4 == i3) {
                            i3 = osVar.ae[i2].getModifiers();
                            lvVar.al(0, -1958495580);
                            lvVar.ae(i3, (byte) 98);
                        }
                    } catch (ClassNotFoundException e) {
                        lvVar.al(-10, -102543835);
                    } catch (InvalidClassException e2) {
                        lvVar.al(-1401358067, -658137561);
                    } catch (StreamCorruptedException e3) {
                        lvVar.al(411232122, -984718496);
                    } catch (OptionalDataException e4) {
                        lvVar.al(-615552914, -1600191822);
                    } catch (IllegalAccessException e5) {
                        lvVar.al(-1767075325, -2048559102);
                    } catch (IllegalArgumentException e6) {
                        lvVar.al(-15, -983132910);
                    } catch (InvocationTargetException e7) {
                        lvVar.al(-749348704, 50324457);
                    } catch (SecurityException e8) {
                        lvVar.al(-17, -320175117);
                    } catch (IOException e9) {
                        lvVar.al(-18, -1187873476);
                    } catch (NullPointerException e10) {
                        lvVar.al(-19, -933040002);
                    } catch (Exception e11) {
                        lvVar.al(-1684352405, -905254913);
                    } catch (Throwable th) {
                        lvVar.al(-21, -463502599);
                    }
                }
            }
            lvVar.br(-1631454091 * i, 1236910392);
            osVar.ky();
        }
    }

    public static void au(lj ljVar, int i) {
        os osVar = new os();
        osVar.aq = ljVar.af(1804771424) * 1561968575;
        osVar.ad = ljVar.at((byte) -118) * 1858522819;
        osVar.ar = new int[(osVar.aq * -1966460865)];
        osVar.al = new int[(osVar.aq * -1966460865)];
        osVar.aj = new Field[(osVar.aq * -1966460865)];
        osVar.ai = new int[(osVar.aq * -1966460865)];
        osVar.ae = new Method[(osVar.aq * -1966460865)];
        osVar.am = new byte[(osVar.aq * -1966460865)][][];
        int i2 = 0;
        while (i2 < osVar.aq * -1966460865) {
            try {
                int af = ljVar.af(1804771424);
                String bm;
                String bm2;
                int at;
                if (af == 0 || af == 1 || 2 == af) {
                    bm = ljVar.bm(1243023638);
                    bm2 = ljVar.bm(1195876599);
                    at = 1 == af ? ljVar.at((byte) -109) : 0;
                    osVar.ar[i2] = af;
                    osVar.ai[i2] = at;
                    if (hs.aj(bm, -1132419009).getClassLoader() != null) {
                        osVar.aj[i2] = hs.aj(bm, -1954549805).getDeclaredField(bm2);
                        i2++;
                    } else {
                        throw new SecurityException();
                    }
                } else if (3 == af || af == 4) {
                    bm = ljVar.bm(1898654252);
                    bm2 = ljVar.bm(1198424771);
                    int af2 = ljVar.af(1804771424);
                    String[] strArr = new String[af2];
                    for (at = 0; at < af2; at++) {
                        strArr[at] = ljVar.bm(2011914740);
                    }
                    String bm3 = ljVar.bm(1294877346);
                    byte[][] bArr = new byte[af2][];
                    if (af == 3) {
                        for (at = 0; at < af2; at++) {
                            int at2 = ljVar.at((byte) -92);
                            bArr[at] = new byte[at2];
                            ljVar.bd(bArr[at], 0, at2, (byte) 0);
                        }
                    }
                    osVar.ar[i2] = af;
                    Class[] clsArr = new Class[af2];
                    for (at = 0; at < af2; at++) {
                        clsArr[at] = hs.aj(strArr[at], 1136779364);
                    }
                    Class aj = hs.aj(bm3, 60650648);
                    if (hs.aj(bm, 2074788766).getClassLoader() != null) {
                        Method[] declaredMethods = hs.aj(bm, 1629608975).getDeclaredMethods();
                        for (Method method : declaredMethods) {
                            if (method.getName().equals(bm2)) {
                                Class[] parameterTypes = method.getParameterTypes();
                                if (clsArr.length == parameterTypes.length) {
                                    Object obj;
                                    for (af = 0; af < clsArr.length; af++) {
                                        if (clsArr[af] != parameterTypes[af]) {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    obj = 1;
                                    if (obj != null) {
                                        if (aj == method.getReturnType()) {
                                            osVar.ae[i2] = method;
                                        }
                                    }
                                }
                            }
                        }
                        osVar.am[i2] = bArr;
                        i2++;
                    } else {
                        throw new SecurityException();
                    }
                } else {
                    i2++;
                }
            } catch (ClassNotFoundException e) {
                osVar.al[i2] = -1;
            } catch (SecurityException e2) {
                osVar.al[i2] = -2;
            } catch (NullPointerException e3) {
                osVar.al[i2] = -3;
            } catch (Exception e4) {
                osVar.al[i2] = -4;
            } catch (Throwable th) {
                osVar.al[i2] = -5;
            }
        }
        ad.aq(osVar);
    }

    public static void aw(lj ljVar, int i) {
        os osVar = new os();
        osVar.aq = ljVar.af(1804771424) * 1561968575;
        osVar.ad = ljVar.at((byte) -76) * 1858522819;
        osVar.ar = new int[(osVar.aq * -1966460865)];
        osVar.al = new int[(osVar.aq * -1966460865)];
        osVar.aj = new Field[(osVar.aq * -1966460865)];
        osVar.ai = new int[(osVar.aq * -1966460865)];
        osVar.ae = new Method[(osVar.aq * -1966460865)];
        osVar.am = new byte[(osVar.aq * -1966460865)][][];
        int i2 = 0;
        while (i2 < osVar.aq * -1966460865) {
            try {
                int af = ljVar.af(1804771424);
                String bm;
                String bm2;
                int at;
                if (af == 0 || af == 1 || 2 == af) {
                    bm = ljVar.bm(1317338142);
                    bm2 = ljVar.bm(1730788269);
                    at = 1 == af ? ljVar.at((byte) -33) : 0;
                    osVar.ar[i2] = af;
                    osVar.ai[i2] = at;
                    if (hs.aj(bm, 1926734082).getClassLoader() != null) {
                        osVar.aj[i2] = hs.aj(bm, 1282380076).getDeclaredField(bm2);
                        i2++;
                    } else {
                        throw new SecurityException();
                    }
                } else if (3 == af || af == 4) {
                    bm = ljVar.bm(1487328117);
                    bm2 = ljVar.bm(976662440);
                    int af2 = ljVar.af(1804771424);
                    String[] strArr = new String[af2];
                    for (at = 0; at < af2; at++) {
                        strArr[at] = ljVar.bm(1117945496);
                    }
                    String bm3 = ljVar.bm(977505865);
                    byte[][] bArr = new byte[af2][];
                    if (af == 3) {
                        for (at = 0; at < af2; at++) {
                            int at2 = ljVar.at((byte) -4);
                            bArr[at] = new byte[at2];
                            ljVar.bd(bArr[at], 0, at2, (byte) 0);
                        }
                    }
                    osVar.ar[i2] = af;
                    Class[] clsArr = new Class[af2];
                    for (at = 0; at < af2; at++) {
                        clsArr[at] = hs.aj(strArr[at], 749714449);
                    }
                    Class aj = hs.aj(bm3, 491729570);
                    if (hs.aj(bm, 1222254619).getClassLoader() != null) {
                        Method[] declaredMethods = hs.aj(bm, -822513930).getDeclaredMethods();
                        for (Method method : declaredMethods) {
                            if (method.getName().equals(bm2)) {
                                Class[] parameterTypes = method.getParameterTypes();
                                if (clsArr.length == parameterTypes.length) {
                                    Object obj;
                                    for (af = 0; af < clsArr.length; af++) {
                                        if (clsArr[af] != parameterTypes[af]) {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    obj = 1;
                                    if (obj != null) {
                                        if (aj == method.getReturnType()) {
                                            osVar.ae[i2] = method;
                                        }
                                    }
                                }
                            }
                        }
                        osVar.am[i2] = bArr;
                        i2++;
                    } else {
                        throw new SecurityException();
                    }
                } else {
                    i2++;
                }
            } catch (ClassNotFoundException e) {
                osVar.al[i2] = -1;
            } catch (SecurityException e2) {
                osVar.al[i2] = -2;
            } catch (NullPointerException e3) {
                osVar.al[i2] = -3;
            } catch (Exception e4) {
                osVar.al[i2] = -4;
            } catch (Throwable th) {
                osVar.al[i2] = -5;
            }
        }
        ad.aq(osVar);
    }

    public static void ax(lj ljVar, int i) {
        os osVar = new os();
        osVar.aq = ljVar.af(1804771424) * -545140009;
        osVar.ad = ljVar.at((byte) -126) * 944147917;
        osVar.ar = new int[(osVar.aq * 783113747)];
        osVar.al = new int[(osVar.aq * 1974991607)];
        osVar.aj = new Field[(osVar.aq * -1966460865)];
        osVar.ai = new int[(osVar.aq * -110126277)];
        osVar.ae = new Method[(osVar.aq * -1966460865)];
        osVar.am = new byte[(osVar.aq * 1947001981)][][];
        int i2 = 0;
        while (i2 < osVar.aq * -1966460865) {
            try {
                int af = ljVar.af(1804771424);
                String bm;
                String bm2;
                int at;
                if (af == 0 || af == 1 || 2 == af) {
                    bm = ljVar.bm(1695136663);
                    bm2 = ljVar.bm(1690767693);
                    at = 1 == af ? ljVar.at((byte) -30) : 0;
                    osVar.ar[i2] = af;
                    osVar.ai[i2] = at;
                    if (hs.aj(bm, 1252284105).getClassLoader() != null) {
                        osVar.aj[i2] = hs.aj(bm, 1987010655).getDeclaredField(bm2);
                        i2++;
                    } else {
                        throw new SecurityException();
                    }
                } else if (3 == af || af == 4) {
                    bm = ljVar.bm(1562018091);
                    bm2 = ljVar.bm(1135289971);
                    int af2 = ljVar.af(1804771424);
                    String[] strArr = new String[af2];
                    for (at = 0; at < af2; at++) {
                        strArr[at] = ljVar.bm(1682416419);
                    }
                    String bm3 = ljVar.bm(1196988633);
                    byte[][] bArr = new byte[af2][];
                    if (af == 3) {
                        for (at = 0; at < af2; at++) {
                            int at2 = ljVar.at((byte) -84);
                            bArr[at] = new byte[at2];
                            ljVar.bd(bArr[at], 0, at2, (byte) 0);
                        }
                    }
                    osVar.ar[i2] = af;
                    Class[] clsArr = new Class[af2];
                    for (at = 0; at < af2; at++) {
                        clsArr[at] = hs.aj(strArr[at], -528016939);
                    }
                    Class aj = hs.aj(bm3, -1778440932);
                    if (hs.aj(bm, -597613942).getClassLoader() != null) {
                        Method[] declaredMethods = hs.aj(bm, 93977073).getDeclaredMethods();
                        for (Method method : declaredMethods) {
                            if (method.getName().equals(bm2)) {
                                Class[] parameterTypes = method.getParameterTypes();
                                if (clsArr.length == parameterTypes.length) {
                                    Object obj;
                                    for (af = 0; af < clsArr.length; af++) {
                                        if (clsArr[af] != parameterTypes[af]) {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    obj = 1;
                                    if (obj != null) {
                                        if (aj == method.getReturnType()) {
                                            osVar.ae[i2] = method;
                                        }
                                    }
                                }
                            }
                        }
                        osVar.am[i2] = bArr;
                        i2++;
                    } else {
                        throw new SecurityException();
                    }
                } else {
                    i2++;
                }
            } catch (ClassNotFoundException e) {
                osVar.al[i2] = -1;
            } catch (SecurityException e2) {
                osVar.al[i2] = -2;
            } catch (NullPointerException e3) {
                osVar.al[i2] = -3;
            } catch (Exception e4) {
                osVar.al[i2] = -4;
            } catch (Throwable th) {
                osVar.al[i2] = -5;
            }
        }
        ad.aq(osVar);
    }

    public static void az(lj ljVar, int i) {
        os osVar = new os();
        osVar.aq = ljVar.af(1804771424) * 1561968575;
        osVar.ad = ljVar.at((byte) -93) * 1858522819;
        osVar.ar = new int[(osVar.aq * -1599864965)];
        osVar.al = new int[(osVar.aq * -127383704)];
        osVar.aj = new Field[(osVar.aq * -1966460865)];
        osVar.ai = new int[(osVar.aq * -2145986637)];
        osVar.ae = new Method[(osVar.aq * -1966460865)];
        osVar.am = new byte[(osVar.aq * -1966460865)][][];
        int i2 = 0;
        while (i2 < osVar.aq * 211859090) {
            try {
                int af = ljVar.af(1804771424);
                String bm;
                String bm2;
                int at;
                if (af == 0 || af == 1 || 2 == af) {
                    bm = ljVar.bm(1064871647);
                    bm2 = ljVar.bm(1515062297);
                    at = 1 == af ? ljVar.at((byte) -1) : 0;
                    osVar.ar[i2] = af;
                    osVar.ai[i2] = at;
                    if (hs.aj(bm, -889227096).getClassLoader() != null) {
                        osVar.aj[i2] = hs.aj(bm, 1414681848).getDeclaredField(bm2);
                        i2++;
                    } else {
                        throw new SecurityException();
                    }
                } else if (3 == af || af == 4) {
                    bm = ljVar.bm(1080465522);
                    bm2 = ljVar.bm(1027759832);
                    int af2 = ljVar.af(1804771424);
                    String[] strArr = new String[af2];
                    for (at = 0; at < af2; at++) {
                        strArr[at] = ljVar.bm(2044226402);
                    }
                    String bm3 = ljVar.bm(1677413529);
                    byte[][] bArr = new byte[af2][];
                    if (af == 3) {
                        for (at = 0; at < af2; at++) {
                            int at2 = ljVar.at((byte) -69);
                            bArr[at] = new byte[at2];
                            ljVar.bd(bArr[at], 0, at2, (byte) 0);
                        }
                    }
                    osVar.ar[i2] = af;
                    Class[] clsArr = new Class[af2];
                    for (at = 0; at < af2; at++) {
                        clsArr[at] = hs.aj(strArr[at], 1039246619);
                    }
                    Class aj = hs.aj(bm3, -1523468106);
                    if (hs.aj(bm, 134766138).getClassLoader() != null) {
                        Method[] declaredMethods = hs.aj(bm, 420114596).getDeclaredMethods();
                        for (Method method : declaredMethods) {
                            if (method.getName().equals(bm2)) {
                                Class[] parameterTypes = method.getParameterTypes();
                                if (clsArr.length == parameterTypes.length) {
                                    Object obj;
                                    for (af = 0; af < clsArr.length; af++) {
                                        if (clsArr[af] != parameterTypes[af]) {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    obj = 1;
                                    if (obj != null) {
                                        if (aj == method.getReturnType()) {
                                            osVar.ae[i2] = method;
                                        }
                                    }
                                }
                            }
                        }
                        osVar.am[i2] = bArr;
                        i2++;
                    } else {
                        throw new SecurityException();
                    }
                } else {
                    i2++;
                }
            } catch (ClassNotFoundException e) {
                osVar.al[i2] = -1;
            } catch (SecurityException e2) {
                osVar.al[i2] = -2;
            } catch (NullPointerException e3) {
                osVar.al[i2] = -3;
            } catch (Exception e4) {
                osVar.al[i2] = -4;
            } catch (Throwable th) {
                osVar.al[i2] = -5;
            }
        }
        ad.aq(osVar);
    }
}
