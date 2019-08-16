package defpackage;

import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: mi */
public class mi {
    static final mi ad = new mi(7, AppMeasurement.CRASH_ORIGIN);
    public static final mi ae = new mi(2, "invalidhost");
    public static final mi ai = new mi(3, "js5connect_outofdate");
    public static final mi aj = new mi(4, "js5connect_full");
    static final mi ak = new mi(8, "alreadyloaded");
    public static final mi al = new mi(5, "js5connect");
    static final mi am = new mi(6, "wrongjava");
    public static final mi aq = new mi(1, "js5crc");
    public static final mi ar = new mi(0, "js5io");
    public static final int bg = 52;
    protected static mr sm;
    public final int as;

    mi(int i, String str) {
        try {
            this.as = -2146348257 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mi.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
