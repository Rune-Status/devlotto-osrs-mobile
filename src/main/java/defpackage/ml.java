package defpackage;

import java.io.IOException;

/* renamed from: ml */
public class ml {
    public static final ml ad = new ml(3);
    public static final ml aj = new ml(4);
    public static final ml al = new ml(2);
    public static final ml aq = new ml(1);
    static final ml ar = new ml(0);
    public final int ai;

    ml(int i) {
        try {
            this.ai = 1641633683 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ml.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static byte[] al(byte b) {
        int i = 0;
        try {
            byte[] bArr = new byte[24];
            try {
                mc.as.aq(0);
                mc.as.al(bArr, (byte) 6);
                int i2 = 0;
                while (i2 < 24 && bArr[i2] == (byte) 0) {
                    i2++;
                }
                if (i2 >= 24) {
                    throw new IOException();
                }
            } catch (Exception e) {
                while (i < 24) {
                    bArr[i] = (byte) -1;
                    i++;
                }
            }
            return bArr;
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ml.al(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    static boolean aq(long j) {
        try {
            return ds.as(j) == 2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ml.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ax(int i) {
        try {
            if (hm.cu * -710699557 == 2) {
                if (hm.dw * -558950377 == 0) {
                    if (hm.cg.length() > 0) {
                        hm.cg = hm.cg.substring(0, hm.cg.length() - 1);
                    }
                } else if (1 == hm.dw * -558950377 && hm.ch.length() > 0) {
                    hm.ch = hm.ch.substring(0, hm.ch.length() - 1);
                }
            } else if (hm.cu * -710699557 == 4) {
                if (hw.du.length() > 0) {
                    hw.du = hw.du.substring(0, hw.du.length() - 1);
                }
            } else if (5 == hm.cu * -710699557 && hm.cg.length() > 0) {
                hm.cg = hm.cg.substring(0, hm.cg.length() - 1);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ml.ax(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void hz(byte b) {
        try {
            client.mt = client.mm * 1493036295;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ml.hz(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
