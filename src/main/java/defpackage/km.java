package defpackage;

import android.support.v4.view.InputDeviceCompat;
import java.lang.reflect.Array;

/* renamed from: km */
public final class km {
    int aa;
    int[] ab;
    int ac;
    final int ad;
    byte[] ae;
    int af;
    int ag;
    int ah;
    final int ai;
    final int aj;
    int ak;
    final int al;
    int am;
    int an;
    int ao;
    int ap;
    final int aq;
    final int ar;
    byte[] as;
    int at;
    int au;
    int aw;
    int ax;
    int[] ay;
    byte az;
    boolean[] ba;
    int[][] bb;
    int[] bc;
    byte[] bd;
    int[][] bf;
    int[][] bi;
    boolean[] bk;
    byte[][] bl;
    byte[] bm;
    byte[] bo;
    int[] bq;
    byte[] bs;
    int bv;

    km() {
        try {
            this.ad = 4096;
            this.aq = 16;
            this.ar = 258;
            this.al = 6;
            this.aj = 50;
            this.ai = 18002;
            this.am = 0;
            this.ag = 0;
            this.ay = new int[256];
            this.ab = new int[InputDeviceCompat.SOURCE_KEYBOARD];
            this.bk = new boolean[256];
            this.ba = new boolean[16];
            this.bs = new byte[256];
            this.bm = new byte[4096];
            this.bq = new int[16];
            this.bd = new byte[18002];
            this.bo = new byte[18002];
            this.bl = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{6, 258});
            this.bf = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.bb = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.bi = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.bc = new int[6];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("km.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static String ac(CharSequence charSequence, byte b) {
        try {
            return af.aw('*', charSequence.length(), -742300015);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("km.ac(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
