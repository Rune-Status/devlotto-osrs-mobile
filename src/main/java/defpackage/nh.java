package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: nh */
public class nh {
    static final String[][] ad;
    public static final int aj = 5;
    static final String[] aq = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static Calendar ar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    static final int av = 1;

    static {
        r0 = new String[7][];
        r0[0] = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        r0[1] = new String[]{"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"};
        r0[2] = new String[]{"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"};
        r0[3] = new String[]{"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        r0[4] = new String[]{"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"};
        r0[5] = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        r0[6] = new String[]{"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"};
        ad = r0;
        Calendar.getInstance();
    }

    nh() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nh.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String aq(long j) {
        ar.setTime(new Date(j));
        int i = ar.get(7);
        int i2 = ar.get(5);
        int i3 = ar.get(2);
        int i4 = ar.get(1);
        int i5 = ar.get(11);
        int i6 = ar.get(12);
        int i7 = ar.get(13);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aq[i - 1]);
        stringBuilder.append(", ");
        stringBuilder.append(i2 / 10);
        stringBuilder.append(i2 % 10);
        stringBuilder.append("-");
        stringBuilder.append(ad[0][i3]);
        stringBuilder.append("-");
        stringBuilder.append(i4);
        stringBuilder.append(" ");
        stringBuilder.append(i5 / 10);
        stringBuilder.append(i5 % 10);
        stringBuilder.append(":");
        stringBuilder.append(i6 / 10);
        stringBuilder.append(i6 % 10);
        stringBuilder.append(":");
        stringBuilder.append(i7 / 10);
        stringBuilder.append(i7 % 10);
        stringBuilder.append(" GMT");
        return stringBuilder.toString();
    }

    static final int dg(int i, int i2, int i3, int i4) {
        int i5 = i >> 7;
        int i6 = i2 >> 7;
        if (i5 < 0 || i6 < 0 || i5 > 103 || i6 > 103) {
            return 0;
        }
        if (i3 < 3) {
            try {
                if (2 == (in.aq[1][i5][i6] & 2)) {
                    i3++;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("nh.dg(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        int i7 = i & 127;
        int i8 = i2 & 127;
        int i9 = i5 + 1;
        int i10 = in.ad[i3][i9][i6];
        int i11 = 128 - i7;
        int i12 = in.ad[i3][i5][i6];
        i6++;
        return (((((in.ad[i3][i5][i6] * i11) + (in.ad[i3][i9][i6] * i7)) >> 7) * i8) + ((128 - i8) * (((i7 * i10) + (i12 * i11)) >> 7))) >> 7;
    }
}
