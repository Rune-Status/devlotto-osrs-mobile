package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaqf = new char[]{'u', 'l', 'l'};
    private static final char[] zaqg = new char[]{'r', 'u', 'e'};
    private static final char[] zaqh = new char[]{'r', 'u', 'e', '\"'};
    private static final char[] zaqi = new char[]{'a', 'l', 's', 'e'};
    private static final char[] zaqj = new char[]{'a', 'l', 's', 'e', '\"'};
    private static final char[] zaqk = new char[]{10};
    private static final zaa<Integer> zaqm = new zaa();
    private static final zaa<Long> zaqn = new zab();
    private static final zaa<Float> zaqo = new zac();
    private static final zaa<Double> zaqp = new zad();
    private static final zaa<Boolean> zaqq = new zae();
    private static final zaa<String> zaqr = new zaf();
    private static final zaa<BigInteger> zaqs = new zag();
    private static final zaa<BigDecimal> zaqt = new zah();
    private final char[] zaqa = new char[1];
    private final char[] zaqb = new char[32];
    private final char[] zaqc = new char[1024];
    private final StringBuilder zaqd = new StringBuilder(32);
    private final StringBuilder zaqe = new StringBuilder(1024);
    private final Stack<Integer> zaql = new Stack();

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super(str, th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    private interface zaa<O> {
        O zah(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException;
    }

    private final int zaa(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        char zaj = zaj(bufferedReader);
        if (zaj == 0) {
            throw new ParseException("Unexpected EOF");
        } else if (zaj == ',') {
            throw new ParseException("Missing value");
        } else if (zaj == 'n') {
            zab(bufferedReader, zaqf);
            return 0;
        } else {
            int i;
            bufferedReader.mark(1024);
            int i2;
            if (zaj == '\"') {
                i2 = 0;
                i = 0;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c = cArr[i];
                    if (Character.isISOControl(c)) {
                        throw new ParseException("Unexpected control character while reading string");
                    } else if (c == '\"' && i2 == 0) {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i + 1));
                        return i;
                    } else {
                        i2 = c == '\\' ? i2 ^ 1 : 0;
                        i++;
                    }
                }
            } else {
                cArr[0] = zaj;
                i2 = 1;
                while (i2 < cArr.length && bufferedReader.read(cArr, i2, 1) != -1) {
                    if (cArr[i2] == '}' || cArr[i2] == ',' || Character.isWhitespace(cArr[i2]) || cArr[i2] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i2 - 1));
                        cArr[i2] = 0;
                        return i2;
                    }
                    i2++;
                }
                i = i2;
            }
            if (i == cArr.length) {
                throw new ParseException("Absurdly long value");
            }
            throw new ParseException("Unexpected EOF");
        }
    }

    private final String zaa(BufferedReader bufferedReader) throws ParseException, IOException {
        String str = null;
        this.zaql.push(Integer.valueOf(2));
        char zaj = zaj(bufferedReader);
        if (zaj == '\"') {
            this.zaql.push(Integer.valueOf(3));
            str = zab(bufferedReader, this.zaqb, this.zaqd, null);
            zak(3);
            if (zaj(bufferedReader) != ':') {
                throw new ParseException("Expected key/value separator");
            }
        } else if (zaj == ']') {
            zak(2);
            zak(1);
            zak(5);
        } else if (zaj == '}') {
            zak(2);
        } else {
            StringBuilder stringBuilder = new StringBuilder(19);
            stringBuilder.append("Unexpected token: ");
            stringBuilder.append(zaj);
            throw new ParseException(stringBuilder.toString());
        }
        return str;
    }

    private final String zaa(BufferedReader bufferedReader, char[] cArr, StringBuilder stringBuilder, char[] cArr2) throws ParseException, IOException {
        char zaj = zaj(bufferedReader);
        if (zaj == '\"') {
            return zab(bufferedReader, cArr, stringBuilder, cArr2);
        }
        if (zaj == 'n') {
            zab(bufferedReader, zaqf);
            return null;
        }
        throw new ParseException("Expected string");
    }

    private final <T extends FastJsonResponse> ArrayList<T> zaa(BufferedReader bufferedReader, Field<?, ?> field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char zaj = zaj(bufferedReader);
        StringBuilder stringBuilder;
        if (zaj == ']') {
            zak(5);
            return arrayList;
        } else if (zaj == 'n') {
            zab(bufferedReader, zaqf);
            zak(5);
            return null;
        } else if (zaj == '{') {
            this.zaql.push(Integer.valueOf(1));
            while (true) {
                try {
                    FastJsonResponse zacp = field.zacp();
                    if (!zaa(bufferedReader, zacp)) {
                        return arrayList;
                    }
                    arrayList.add(zacp);
                    zaj = zaj(bufferedReader);
                    if (zaj != ',') {
                        if (zaj == ']') {
                            zak(5);
                            return arrayList;
                        }
                        stringBuilder = new StringBuilder(19);
                        stringBuilder.append("Unexpected token: ");
                        stringBuilder.append(zaj);
                        throw new ParseException(stringBuilder.toString());
                    } else if (zaj(bufferedReader) == '{') {
                        this.zaql.push(Integer.valueOf(1));
                    } else {
                        throw new ParseException("Expected start of next object in array");
                    }
                } catch (InstantiationException e) {
                    throw new ParseException("Error instantiating inner object", e);
                } catch (IllegalAccessException e2) {
                    throw new ParseException("Error instantiating inner object", e2);
                }
            }
        } else {
            stringBuilder = new StringBuilder(19);
            stringBuilder.append("Unexpected token: ");
            stringBuilder.append(zaj);
            throw new ParseException(stringBuilder.toString());
        }
    }

    private final <O> ArrayList<O> zaa(BufferedReader bufferedReader, zaa<O> zaa) throws ParseException, IOException {
        char zaj = zaj(bufferedReader);
        if (zaj == 'n') {
            zab(bufferedReader, zaqf);
            return null;
        } else if (zaj == '[') {
            this.zaql.push(Integer.valueOf(5));
            ArrayList arrayList = new ArrayList();
            while (true) {
                bufferedReader.mark(1024);
                char zaj2 = zaj(bufferedReader);
                if (zaj2 == 0) {
                    throw new ParseException("Unexpected EOF");
                } else if (zaj2 != ',') {
                    if (zaj2 != ']') {
                        bufferedReader.reset();
                        arrayList.add(zaa.zah(this, bufferedReader));
                    } else {
                        zak(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    private final boolean zaa(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        Map fieldMappings = fastJsonResponse.getFieldMappings();
        Object zaa = zaa(bufferedReader);
        if (zaa == null) {
            zak(1);
            return false;
        }
        while (zaa != null) {
            Field field = (Field) fieldMappings.get(zaa);
            if (field == null) {
                zaa = zab(bufferedReader);
            } else {
                StringBuilder stringBuilder;
                this.zaql.push(Integer.valueOf(4));
                char zaj;
                switch (field.zapq) {
                    case 0:
                        if (!field.zapr) {
                            fastJsonResponse.zaa(field, zad(bufferedReader));
                            break;
                        }
                        fastJsonResponse.zaa(field, zaa(bufferedReader, zaqm));
                        break;
                    case 1:
                        if (!field.zapr) {
                            fastJsonResponse.zaa(field, zaf(bufferedReader));
                            break;
                        }
                        fastJsonResponse.zab(field, zaa(bufferedReader, zaqs));
                        break;
                    case 2:
                        if (!field.zapr) {
                            fastJsonResponse.zaa(field, zae(bufferedReader));
                            break;
                        }
                        fastJsonResponse.zac(field, zaa(bufferedReader, zaqn));
                        break;
                    case 3:
                        if (!field.zapr) {
                            fastJsonResponse.zaa(field, zag(bufferedReader));
                            break;
                        }
                        fastJsonResponse.zad(field, zaa(bufferedReader, zaqo));
                        break;
                    case 4:
                        if (!field.zapr) {
                            fastJsonResponse.zaa(field, zah(bufferedReader));
                            break;
                        }
                        fastJsonResponse.zae(field, zaa(bufferedReader, zaqp));
                        break;
                    case 5:
                        if (!field.zapr) {
                            fastJsonResponse.zaa(field, zai(bufferedReader));
                            break;
                        }
                        fastJsonResponse.zaf(field, zaa(bufferedReader, zaqt));
                        break;
                    case 6:
                        if (!field.zapr) {
                            fastJsonResponse.zaa(field, zaa(bufferedReader, false));
                            break;
                        }
                        fastJsonResponse.zag(field, zaa(bufferedReader, zaqq));
                        break;
                    case 7:
                        if (!field.zapr) {
                            fastJsonResponse.zaa(field, zac(bufferedReader));
                            break;
                        }
                        fastJsonResponse.zah(field, zaa(bufferedReader, zaqr));
                        break;
                    case 8:
                        fastJsonResponse.zaa(field, Base64Utils.decode(zaa(bufferedReader, this.zaqc, this.zaqe, zaqk)));
                        break;
                    case 9:
                        fastJsonResponse.zaa(field, Base64Utils.decodeUrlSafe(zaa(bufferedReader, this.zaqc, this.zaqe, zaqk)));
                        break;
                    case 10:
                        Map map;
                        zaj = zaj(bufferedReader);
                        if (zaj == 'n') {
                            zab(bufferedReader, zaqf);
                            map = null;
                        } else if (zaj == '{') {
                            this.zaql.push(Integer.valueOf(1));
                            map = new HashMap();
                            while (true) {
                                char zaj2 = zaj(bufferedReader);
                                if (zaj2 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                } else if (zaj2 == '\"') {
                                    String zab = zab(bufferedReader, this.zaqb, this.zaqd, null);
                                    String valueOf;
                                    if (zaj(bufferedReader) != ':') {
                                        valueOf = String.valueOf(zab);
                                        throw new ParseException(valueOf.length() != 0 ? "No map value found for key ".concat(valueOf) : new String("No map value found for key "));
                                    } else if (zaj(bufferedReader) != '\"') {
                                        valueOf = String.valueOf(zab);
                                        throw new ParseException(valueOf.length() != 0 ? "Expected String value for key ".concat(valueOf) : new String("Expected String value for key "));
                                    } else {
                                        map.put(zab, zab(bufferedReader, this.zaqb, this.zaqd, null));
                                        zaj2 = zaj(bufferedReader);
                                        if (zaj2 != ',') {
                                            if (zaj2 == '}') {
                                                zak(1);
                                            } else {
                                                StringBuilder stringBuilder2 = new StringBuilder(48);
                                                stringBuilder2.append("Unexpected character while parsing string map: ");
                                                stringBuilder2.append(zaj2);
                                                throw new ParseException(stringBuilder2.toString());
                                            }
                                        }
                                    }
                                } else if (zaj2 == '}') {
                                    zak(1);
                                }
                            }
                        } else {
                            throw new ParseException("Expected start of a map object");
                        }
                        fastJsonResponse.zaa(field, map);
                        break;
                    case 11:
                        if (field.zapr) {
                            zaj = zaj(bufferedReader);
                            if (zaj == 'n') {
                                zab(bufferedReader, zaqf);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zapu, null);
                                break;
                            }
                            this.zaql.push(Integer.valueOf(5));
                            if (zaj == '[') {
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zapu, zaa(bufferedReader, field));
                                break;
                            }
                            throw new ParseException("Expected array start");
                        }
                        zaj = zaj(bufferedReader);
                        if (zaj == 'n') {
                            zab(bufferedReader, zaqf);
                            fastJsonResponse.addConcreteTypeInternal(field, field.zapu, null);
                            break;
                        }
                        this.zaql.push(Integer.valueOf(1));
                        if (zaj == '{') {
                            try {
                                FastJsonResponse zacp = field.zacp();
                                zaa(bufferedReader, zacp);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zapu, zacp);
                                break;
                            } catch (InstantiationException e) {
                                throw new ParseException("Error instantiating inner object", e);
                            } catch (IllegalAccessException e2) {
                                throw new ParseException("Error instantiating inner object", e2);
                            }
                        }
                        throw new ParseException("Expected start of object");
                    default:
                        int i = field.zapq;
                        stringBuilder = new StringBuilder(30);
                        stringBuilder.append("Invalid field type ");
                        stringBuilder.append(i);
                        throw new ParseException(stringBuilder.toString());
                }
                zak(4);
                zak(2);
                char zaj3 = zaj(bufferedReader);
                if (zaj3 == ',') {
                    zaa = zaa(bufferedReader);
                } else if (zaj3 == '}') {
                    zaa = null;
                } else {
                    stringBuilder = new StringBuilder(55);
                    stringBuilder.append("Expected end of object or field separator, but found: ");
                    stringBuilder.append(zaj3);
                    throw new ParseException(stringBuilder.toString());
                }
            }
        }
        zak(1);
        return true;
    }

    private final boolean zaa(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        while (true) {
            char zaj = zaj(bufferedReader);
            if (zaj != '\"') {
                if (zaj == 'f') {
                    zab(bufferedReader, z ? zaqj : zaqi);
                    return false;
                } else if (zaj == 'n') {
                    zab(bufferedReader, zaqf);
                    return false;
                } else if (zaj == 't') {
                    zab(bufferedReader, z ? zaqh : zaqg);
                    return true;
                } else {
                    StringBuilder stringBuilder = new StringBuilder(19);
                    stringBuilder.append("Unexpected token: ");
                    stringBuilder.append(zaj);
                    throw new ParseException(stringBuilder.toString());
                }
            } else if (z) {
                throw new ParseException("No boolean value found in string");
            } else {
                z = true;
            }
        }
    }

    private final String zab(BufferedReader bufferedReader) throws ParseException, IOException {
        int i = 1;
        bufferedReader.mark(1024);
        char zaj = zaj(bufferedReader);
        int i2;
        if (zaj != '\"') {
            if (zaj == ',') {
                throw new ParseException("Missing value");
            } else if (zaj == '[') {
                this.zaql.push(Integer.valueOf(5));
                bufferedReader.mark(32);
                if (zaj(bufferedReader) == ']') {
                    zak(5);
                } else {
                    bufferedReader.reset();
                    int i3 = 0;
                    i2 = 0;
                    while (i > 0) {
                        char zaj2 = zaj(bufferedReader);
                        if (zaj2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        } else if (Character.isISOControl(zaj2)) {
                            throw new ParseException("Unexpected control character while reading array");
                        } else {
                            if (zaj2 == '\"' && i2 == 0) {
                                i3 ^= 1;
                            }
                            if (zaj2 == '[' && i3 == 0) {
                                i++;
                            }
                            if (zaj2 == ']' && i3 == 0) {
                                i--;
                            }
                            i2 = (zaj2 != '\\' || i3 == 0) ? 0 : i2 ^ 1;
                        }
                    }
                    zak(5);
                }
            } else if (zaj != '{') {
                bufferedReader.reset();
                zaa(bufferedReader, this.zaqc);
            } else {
                this.zaql.push(Integer.valueOf(1));
                bufferedReader.mark(32);
                char zaj3 = zaj(bufferedReader);
                if (zaj3 == '}') {
                    zak(1);
                } else if (zaj3 == '\"') {
                    bufferedReader.reset();
                    zaa(bufferedReader);
                    do {
                    } while (zab(bufferedReader) != null);
                    zak(1);
                } else {
                    StringBuilder stringBuilder = new StringBuilder(18);
                    stringBuilder.append("Unexpected token ");
                    stringBuilder.append(zaj3);
                    throw new ParseException(stringBuilder.toString());
                }
            }
        } else if (bufferedReader.read(this.zaqa) != -1) {
            zaj = this.zaqa[0];
            i2 = 0;
            while (true) {
                if (zaj == '\"' && i2 == 0) {
                    break;
                }
                i = zaj == '\\' ? i2 ^ 1 : 0;
                if (bufferedReader.read(this.zaqa) != -1) {
                    zaj = this.zaqa[0];
                    if (Character.isISOControl(zaj)) {
                        throw new ParseException("Unexpected control character while reading string");
                    }
                    i2 = i;
                } else {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
            }
        } else {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char zaj4 = zaj(bufferedReader);
        if (zaj4 == ',') {
            zak(2);
            return zaa(bufferedReader);
        } else if (zaj4 == '}') {
            zak(2);
            return null;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(18);
            stringBuilder2.append("Unexpected token ");
            stringBuilder2.append(zaj4);
            throw new ParseException(stringBuilder2.toString());
        }
    }

    private static String zab(BufferedReader bufferedReader, char[] cArr, StringBuilder stringBuilder, char[] cArr2) throws ParseException, IOException {
        stringBuilder.setLength(0);
        bufferedReader.mark(cArr.length);
        int i = 0;
        int i2 = 0;
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                int i3 = 0;
                while (i3 < read) {
                    int i4;
                    char c = cArr[i3];
                    if (Character.isISOControl(c)) {
                        if (cArr2 != null) {
                            for (char c2 : cArr2) {
                                if (c2 == c) {
                                    i4 = 1;
                                    break;
                                }
                            }
                        }
                        i4 = 0;
                        if (i4 == 0) {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    }
                    if (c == '\"' && i2 == 0) {
                        stringBuilder.append(cArr, 0, i3);
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i3 + 1));
                        return i != 0 ? JsonUtils.unescapeString(stringBuilder.toString()) : stringBuilder.toString();
                    } else {
                        if (c == '\\') {
                            i2 ^= 1;
                            i4 = 1;
                        } else {
                            i2 = 0;
                            i4 = i;
                        }
                        i3++;
                        i = i4;
                    }
                }
                stringBuilder.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
            } else {
                throw new ParseException("Unexpected EOF while parsing string");
            }
        }
    }

    private final void zab(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i = 0;
        while (i < cArr.length) {
            int read = bufferedReader.read(this.zaqb, 0, cArr.length - i);
            if (read != -1) {
                int i2 = 0;
                while (i2 < read) {
                    if (cArr[i2 + i] == this.zaqb[i2]) {
                        i2++;
                    } else {
                        throw new ParseException("Unexpected character");
                    }
                }
                i += read;
            } else {
                throw new ParseException("Unexpected EOF");
            }
        }
    }

    private final String zac(BufferedReader bufferedReader) throws ParseException, IOException {
        return zaa(bufferedReader, this.zaqb, this.zaqd, null);
    }

    private final int zad(BufferedReader bufferedReader) throws ParseException, IOException {
        int i = 0;
        int zaa = zaa(bufferedReader, this.zaqc);
        if (zaa == 0) {
            return 0;
        }
        char[] cArr = this.zaqc;
        if (zaa > 0) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (cArr[0] == '-') {
                i2 = Integer.MIN_VALUE;
                i3 = 1;
                i4 = 1;
            } else {
                i2 = -2147483647;
                i3 = 0;
                i4 = 0;
            }
            if (i4 < zaa) {
                i5 = i4 + 1;
                i = Character.digit(cArr[i4], 10);
                if (i >= 0) {
                    i = -i;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            i5 = i4;
            while (i5 < zaa) {
                i4 = Character.digit(cArr[i5], 10);
                if (i4 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (i >= -214748364) {
                    i *= 10;
                    if (i >= i2 + i4) {
                        i -= i4;
                        i5++;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (i3 == 0) {
                return -i;
            }
            if (i5 > 1) {
                return i;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    private final long zae(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa = zaa(bufferedReader, this.zaqc);
        if (zaa == 0) {
            return 0;
        }
        char[] cArr = this.zaqc;
        if (zaa > 0) {
            long j;
            Object obj;
            int i;
            long j2;
            int i2 = 0;
            if (cArr[0] == '-') {
                i2 = 1;
                j = Long.MIN_VALUE;
                obj = 1;
            } else {
                j = -9223372036854775807L;
                obj = null;
            }
            if (i2 < zaa) {
                i = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    j2 = (long) (-digit);
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            j2 = 0;
            i = i2;
            while (i < zaa) {
                i2 = Character.digit(cArr[i], 10);
                if (i2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (j2 >= -922337203685477580L) {
                    j2 *= 10;
                    long j3 = (long) i2;
                    if (j2 >= j + j3) {
                        j2 -= j3;
                        i++;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (obj == null) {
                return -j2;
            }
            if (i > 1) {
                return j2;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    private final BigInteger zaf(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa = zaa(bufferedReader, this.zaqc);
        return zaa == 0 ? null : new BigInteger(new String(this.zaqc, 0, zaa));
    }

    private final float zag(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa = zaa(bufferedReader, this.zaqc);
        return zaa == 0 ? 0.0f : Float.parseFloat(new String(this.zaqc, 0, zaa));
    }

    private final double zah(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa = zaa(bufferedReader, this.zaqc);
        return zaa == 0 ? 0.0d : Double.parseDouble(new String(this.zaqc, 0, zaa));
    }

    private final BigDecimal zai(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa = zaa(bufferedReader, this.zaqc);
        return zaa == 0 ? null : new BigDecimal(new String(this.zaqc, 0, zaa));
    }

    private final char zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zaqa) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.zaqa[0])) {
            if (bufferedReader.read(this.zaqa) == -1) {
                return 0;
            }
        }
        return this.zaqa[0];
    }

    private final void zak(int i) throws ParseException {
        if (this.zaql.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder(46);
            stringBuilder.append("Expected state ");
            stringBuilder.append(i);
            stringBuilder.append(" but had empty stack");
            throw new ParseException(stringBuilder.toString());
        }
        int intValue = ((Integer) this.zaql.pop()).intValue();
        if (intValue != i) {
            StringBuilder stringBuilder2 = new StringBuilder(46);
            stringBuilder2.append("Expected state ");
            stringBuilder2.append(i);
            stringBuilder2.append(" but had ");
            stringBuilder2.append(intValue);
            throw new ParseException(stringBuilder2.toString());
        }
    }

    @KeepForSdk
    public void parse(InputStream inputStream, T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            this.zaql.push(Integer.valueOf(0));
            char zaj = zaj(bufferedReader);
            if (zaj != 0) {
                if (zaj == '[') {
                    this.zaql.push(Integer.valueOf(5));
                    Map fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() == 1) {
                        Field field = (Field) ((Entry) fieldMappings.entrySet().iterator().next()).getValue();
                        t.addConcreteTypeArrayInternal(field, field.zapu, zaa(bufferedReader, field));
                    } else {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                } else if (zaj == '{') {
                    this.zaql.push(Integer.valueOf(1));
                    zaa(bufferedReader, (FastJsonResponse) t);
                } else {
                    StringBuilder stringBuilder = new StringBuilder(19);
                    stringBuilder.append("Unexpected token: ");
                    stringBuilder.append(zaj);
                    throw new ParseException(stringBuilder.toString());
                }
                zak(0);
                try {
                    bufferedReader.close();
                    return;
                } catch (IOException e) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                    return;
                }
            }
            throw new ParseException("No data to parse");
        } catch (IOException e2) {
            throw new ParseException(e2);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
        }
    }
}
