package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: ix */
public class ix {
    static final BigInteger ad = new BigInteger("10001", 16);
    static final BigInteger aq = new BigInteger("83ff79a3e258b99ead1a70e1049883e78e513c4cdec538d8da9483879a9f81689c0c7d146d7b82b52d05cf26132b1cda5930eeef894e4ccf3d41eebc3aabe54598c4ca48eb5a31d736bfeea17875a35558b9e3fcd4aebe2a9cc970312a477771b36e173dc2ece6001ab895c553e2770de40073ea278026f36961c94428d8d7db", 16);
    public static final int au = 5;
    static int ax;
    static SecureRandom ec;
    static ee oj;

    ix() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ix.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void ae(int i) {
        try {
            jl.ad = new ok(32);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ix.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static ep[] aq(int i) {
        try {
            ep epVar = ep.ad;
            ep epVar2 = ep.aq;
            ep epVar3 = ep.ar;
            return new ep[]{epVar, epVar2, epVar3};
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ix.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void hc(al[] alVarArr, int i, byte b) {
        int i2 = 0;
        while (true) {
            try {
                int i3 = i2;
                if (i3 < alVarArr.length) {
                    al alVar = alVarArr[i3];
                    if (alVar != null) {
                        if (alVar.bc * -38514547 == i && !(alVar.aa && kq.hl(alVar, 1570854673))) {
                            if (alVar.af * 1845699613 == 0) {
                                if (alVar.aa || !kq.hl(alVar, 1570854673) || iq.kc == alVar) {
                                    ix.hc(alVarArr, alVar.ao * -1227024251, (byte) 121);
                                    if (alVar.fo != null) {
                                        ix.hc(alVar.fo, alVar.ao * -1227024251, (byte) 35);
                                    }
                                    is isVar = (is) client.kd.ad((long) (alVar.ao * -1227024251));
                                    if (isVar != null) {
                                        nn.hp(isVar.ad * 1810639839, 1493367328);
                                    }
                                }
                            }
                            if (alVar.af * 1845699613 == 6) {
                                if (!(-1 == alVar.cr * 102964449 && alVar.ca * -1965389049 == -1)) {
                                    i2 = ex.gh(alVar, (byte) -55) ? alVar.ca * -1965389049 : alVar.cr * 102964449;
                                    if (i2 != -1) {
                                        dp aq = gn.aq(i2, 2071434865);
                                        alVar.fp += client.gi * 825013123;
                                        while (alVar.fp * -1393695383 > aq.am[alVar.fb * 271099897]) {
                                            alVar.fp -= aq.am[alVar.fb * 271099897] * -1143932199;
                                            alVar.fb += 1785948745;
                                            if (alVar.fb * 271099897 >= aq.ai.length) {
                                                alVar.fb -= aq.as * 868835131;
                                                if (alVar.fb * 271099897 < 0 || alVar.fb * 271099897 >= aq.ai.length) {
                                                    alVar.fb = 0;
                                                }
                                            }
                                            da.gk(alVar, (byte) 2);
                                        }
                                    }
                                }
                                if (!(alVar.cd * 1590954277 == 0 || alVar.aa)) {
                                    i2 = alVar.cd;
                                    int i4 = alVar.cd;
                                    int i5 = client.gi;
                                    int i6 = client.gi;
                                    alVar.ck = (((((i2 * 1590954277) >> 16) * (i5 * 1546702779)) + (alVar.ck * -1022461825)) & 2047) * -1944500353;
                                    alVar.co = ((((((i4 * 1590954277) << 16) >> 16) * (1546702779 * i6)) + (alVar.co * 1019998723)) & 2047) * -1450063701;
                                    da.gk(alVar, (byte) 2);
                                }
                            }
                        }
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ix.hc(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }
}
