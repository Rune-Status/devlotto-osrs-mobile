package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);
    private static final String UTC_ID = "UTC";

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder stringBuilder = new StringBuilder(((z ? ".sss".length() : 0) + "yyyy-MM-ddThh:mm:ss".length()) + (timeZone.getRawOffset() == 0 ? "Z" : "+hh:mm").length());
        padInt(stringBuilder, gregorianCalendar.get(1), "yyyy".length());
        stringBuilder.append('-');
        padInt(stringBuilder, gregorianCalendar.get(2) + 1, "MM".length());
        stringBuilder.append('-');
        padInt(stringBuilder, gregorianCalendar.get(5), "dd".length());
        stringBuilder.append('T');
        padInt(stringBuilder, gregorianCalendar.get(11), "hh".length());
        stringBuilder.append(':');
        padInt(stringBuilder, gregorianCalendar.get(12), "mm".length());
        stringBuilder.append(':');
        padInt(stringBuilder, gregorianCalendar.get(13), "ss".length());
        if (z) {
            stringBuilder.append('.');
            padInt(stringBuilder, gregorianCalendar.get(14), "sss".length());
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            i = Math.abs(i % 60);
            stringBuilder.append(offset < 0 ? '-' : '+');
            padInt(stringBuilder, abs, "hh".length());
            stringBuilder.append(':');
            padInt(stringBuilder, i, "mm".length());
        } else {
            stringBuilder.append('Z');
        }
        return stringBuilder.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder stringBuilder, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            stringBuilder.append('0');
        }
        stringBuilder.append(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        Exception exception;
        String message;
        StringBuilder stringBuilder;
        ParseException parseException;
        String substring;
        StringBuilder stringBuilder2;
        try {
            int index = parsePosition.getIndex();
            int i = index + 4;
            int parseInt = parseInt(str, index, i);
            if (checkOffset(str, i, '-')) {
                i++;
            }
            index = i + 2;
            int parseInt2 = parseInt(str, i, index);
            i = checkOffset(str, index, '-') ? index + 1 : index;
            int i2 = i + 2;
            int parseInt3 = parseInt(str, i, i2);
            boolean checkOffset = checkOffset(str, i2, 'T');
            if (checkOffset || str.length() > i2) {
                int parseInt4;
                int parseInt5;
                int i3;
                int min;
                if (checkOffset) {
                    index = i2 + 1;
                    i = index + 2;
                    parseInt4 = parseInt(str, index, i);
                    if (checkOffset(str, i, ':')) {
                        i++;
                    }
                    index = i + 2;
                    parseInt5 = parseInt(str, i, index);
                    i = checkOffset(str, index, ':') ? index + 1 : index;
                    if (str.length() > i) {
                        char charAt = str.charAt(i);
                        if (!(charAt == 'Z' || charAt == '+' || charAt == '-')) {
                            i2 = i + 2;
                            i = parseInt(str, i, i2);
                            index = 59;
                            if (i <= 59 || i >= 63) {
                                index = i;
                            }
                            if (checkOffset(str, i2, '.')) {
                                i3 = i2 + 1;
                                i2 = indexOfNonDigit(str, i3 + 1);
                                min = Math.min(i2, i3 + 3);
                                i = parseInt(str, i3, min);
                                switch (min - i3) {
                                    case 1:
                                        i *= 100;
                                        break;
                                    case 2:
                                        i *= 10;
                                        break;
                                }
                                i3 = i;
                                min = index;
                            } else {
                                i3 = 0;
                                min = index;
                            }
                        }
                    }
                    index = parseInt4;
                    i2 = i;
                    min = 0;
                    parseInt4 = index;
                    i3 = 0;
                } else {
                    index = 0;
                    parseInt5 = 0;
                    min = 0;
                    parseInt4 = index;
                    i3 = 0;
                }
                if (str.length() > i2) {
                    TimeZone timeZone;
                    char charAt2 = str.charAt(i2);
                    if (charAt2 == 'Z') {
                        timeZone = TIMEZONE_UTC;
                        index = i2 + 1;
                    } else if (charAt2 == '+' || charAt2 == '-') {
                        substring = str.substring(i2);
                        if (substring.length() < 5) {
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(substring);
                            stringBuilder2.append("00");
                            substring = stringBuilder2.toString();
                        }
                        index = substring.length() + i2;
                        if ("+0000".equals(substring) || "+00:00".equals(substring)) {
                            timeZone = TIMEZONE_UTC;
                        } else {
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("GMT");
                            stringBuilder3.append(substring);
                            String stringBuilder4 = stringBuilder3.toString();
                            timeZone = TimeZone.getTimeZone(stringBuilder4);
                            String id = timeZone.getID();
                            if (!(id.equals(stringBuilder4) || id.replace(":", "").equals(stringBuilder4))) {
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Mismatching time zone indicator: ");
                                stringBuilder2.append(stringBuilder4);
                                stringBuilder2.append(" given, resolves to ");
                                stringBuilder2.append(timeZone.getID());
                                throw new IndexOutOfBoundsException(stringBuilder2.toString());
                            }
                        }
                    } else {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Invalid time zone indicator '");
                        stringBuilder2.append(charAt2);
                        stringBuilder2.append("'");
                        throw new IndexOutOfBoundsException(stringBuilder2.toString());
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                    gregorianCalendar.setLenient(false);
                    gregorianCalendar.set(1, parseInt);
                    gregorianCalendar.set(2, parseInt2 - 1);
                    gregorianCalendar.set(5, parseInt3);
                    gregorianCalendar.set(11, parseInt4);
                    gregorianCalendar.set(12, parseInt5);
                    gregorianCalendar.set(13, min);
                    gregorianCalendar.set(14, i3);
                    parsePosition.setIndex(index);
                    return gregorianCalendar.getTime();
                }
                throw new IllegalArgumentException("No time zone indicator");
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3);
            parsePosition.setIndex(i2);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException e) {
            exception = e;
            if (str == null) {
                substring = null;
            } else {
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append('\"');
                stringBuilder5.append(str);
                stringBuilder5.append('\"');
                substring = stringBuilder5.toString();
            }
            message = exception.getMessage();
            if (message == null || message.isEmpty()) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("(");
                stringBuilder2.append(exception.getClass().getName());
                stringBuilder2.append(")");
                message = stringBuilder2.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse date [");
            stringBuilder.append(substring);
            stringBuilder.append("]: ");
            stringBuilder.append(message);
            parseException = new ParseException(stringBuilder.toString(), parsePosition.getIndex());
            parseException.initCause(exception);
            throw parseException;
        } catch (NumberFormatException e2) {
            exception = e2;
            if (str == null) {
            }
            message = exception.getMessage();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("(");
            stringBuilder2.append(exception.getClass().getName());
            stringBuilder2.append(")");
            message = stringBuilder2.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse date [");
            stringBuilder.append(substring);
            stringBuilder.append("]: ");
            stringBuilder.append(message);
            parseException = new ParseException(stringBuilder.toString(), parsePosition.getIndex());
            parseException.initCause(exception);
            throw parseException;
        } catch (IllegalArgumentException e22) {
            exception = e22;
            if (str == null) {
            }
            message = exception.getMessage();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("(");
            stringBuilder2.append(exception.getClass().getName());
            stringBuilder2.append(")");
            message = stringBuilder2.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse date [");
            stringBuilder.append(substring);
            stringBuilder.append("]: ");
            stringBuilder.append(message);
            parseException = new ParseException(stringBuilder.toString(), parsePosition.getIndex());
            parseException.initCause(exception);
            throw parseException;
        }
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        int i3;
        int digit;
        StringBuilder stringBuilder;
        if (i < i2) {
            i3 = i + 1;
            digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                digit = -digit;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid number: ");
                stringBuilder.append(str.substring(i, i2));
                throw new NumberFormatException(stringBuilder.toString());
            }
        }
        digit = 0;
        i3 = i;
        while (i3 < i2) {
            int digit2 = Character.digit(str.charAt(i3), 10);
            if (digit2 >= 0) {
                digit = (digit * 10) - digit2;
                i3++;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid number: ");
                stringBuilder.append(str.substring(i, i2));
                throw new NumberFormatException(stringBuilder.toString());
            }
        }
        return -digit;
    }
}
