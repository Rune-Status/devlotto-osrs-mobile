package defpackage;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: ea */
public class ea extends ez {
    static final int aa = 10;
    public static final int am = 200;
    public static final int bd = 1;
    static ef[] tl;
    public ff ag;
    final my ak;
    int as;

    public ea(my myVar) {
        try {
            super(400);
            this.as = -1678861571;
            this.ag = new ff();
            this.ak = myVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ea.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static long ad(int i) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(hn.id("services", false, 1518957261));
            stringBuilder.append("m=accountappeal/login.ws");
            URLConnection openConnection = new URL(stringBuilder.toString()).openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            lj ljVar = new lj(new byte[1000]);
            do {
                int read = inputStream.read(ljVar.ar, ljVar.al * -1631454091, 1000 - (ljVar.al * -1631454091));
                if (read == -1) {
                    ljVar.al = 0;
                    return ljVar.bk(1417758063);
                }
                ljVar.al = (read * -879823907) + ljVar.al;
            } while (ljVar.al * -1631454091 < 1000);
            return 0;
        } catch (Exception e) {
            return 0;
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("ea.ad(");
            stringBuilder2.append(')');
            throw mv.aq(e2, stringBuilder2.toString());
        }
    }

    public static int ak(int i, int i2) {
        try {
            return ds.as(bu.ac[i]);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ea.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void an(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, byte b) {
        int i11 = i4;
        for (int i12 = -i7; i12 < 0; i12++) {
            int i13 = i2;
            int i14 = -i6;
            while (i14 < 0) {
                int i15 = iArr2[(i13 >> 16) + ((i3 >> 16) * i10)];
                if (i15 != 0) {
                    iArr[i11] = i15;
                }
                i13 += i8;
                i14++;
                i11++;
            }
            i3 += i9;
            i11 += i5;
        }
    }

    static void ao(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -(i4 >> 2);
        int i10 = -(i4 & 3);
        int i11 = i3;
        int i12 = i2;
        for (int i13 = -i5; i13 < 0; i13++) {
            int i14;
            int i15;
            int i16 = i9;
            while (i16 < 0) {
                i14 = i12 + 1;
                i12 = iArr2[i12];
                if (i12 != 0) {
                    i15 = i11 + 1;
                    iArr[i11] = i12;
                } else {
                    i15 = i11 + 1;
                }
                i12 = i14 + 1;
                i11 = iArr2[i14];
                if (i11 != 0) {
                    i14 = i15 + 1;
                    iArr[i15] = i11;
                    i15 = i14;
                } else {
                    i15++;
                }
                i11 = i12 + 1;
                i12 = iArr2[i12];
                if (i12 != 0) {
                    i14 = i15 + 1;
                    iArr[i15] = i12;
                    i15 = i14;
                } else {
                    i15++;
                }
                i12 = i11 + 1;
                i14 = iArr2[i11];
                if (i14 != 0) {
                    iArr[i15] = i14;
                }
                i16++;
                i11 = i15 + 1;
            }
            i14 = i10;
            i15 = i11;
            while (i14 < 0) {
                i11 = iArr2[i12];
                if (i11 != 0) {
                    iArr[i15] = i11;
                }
                i15++;
                i14++;
                i12++;
            }
            i11 = i15 + i6;
            i12 += i7;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg[] af(int i, int i2) {
        try {
            return new eu[i];
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ea.af(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg ah(byte b) {
        try {
            return new eu();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ea.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg cb() {
        return new eu();
    }

    /* Access modifiers changed, original: 0000 */
    public eg[] cc(int i) {
        return new eu[i];
    }

    /* Access modifiers changed, original: 0000 */
    public eg ce() {
        return new eu();
    }

    public boolean ck(en enVar, boolean z) {
        eu euVar = (eu) aj(enVar, (byte) 16);
        return euVar == null ? false : (z && euVar.aj * -356714521 == 0) ? false : true;
    }

    public boolean cl(en enVar, boolean z) {
        eu euVar = (eu) aj(enVar, (byte) 16);
        return euVar == null ? false : (z && euVar.aj * -356714521 == 0) ? false : true;
    }

    public boolean co(en enVar, boolean z) {
        eu euVar = (eu) aj(enVar, (byte) 16);
        return euVar == null ? false : (z && euVar.aj * -356714521 == 0) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0130 A:{Catch:{ RuntimeException -> 0x00d0 }} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095 A:{Catch:{ RuntimeException -> 0x00d0 }} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb A:{Catch:{ RuntimeException -> 0x00d0 }} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ct(lj ljVar, int i, byte b) {
        while (ljVar.al * -1631454091 < i) {
            try {
                Object obj = ljVar.af(1804771424) == 1 ? 1 : null;
                en enVar = new en(ljVar.bm(1940697186), this.ak);
                en enVar2 = new en(ljVar.bm(1220420596), this.ak);
                int an = ljVar.an(-1464407032);
                int af = ljVar.af(1804771424);
                int af2 = ljVar.af(1804771424);
                boolean z = (af2 & 2) != 0;
                boolean z2 = (af2 & 1) != 0;
                if (an > 0) {
                    ljVar.bm(1509326711);
                    ljVar.af(1804771424);
                    ljVar.at((byte) -75);
                }
                ljVar.bm(1241181195);
                if (enVar.aq((short) -12803)) {
                    eg egVar;
                    eu euVar;
                    eg egVar2 = (eu) ai(enVar, 1944034546);
                    if (obj != null) {
                        egVar = (eu) ai(enVar2, 854055858);
                        if (!(egVar == null || egVar == egVar2)) {
                            if (egVar2 != null) {
                                ak(egVar, (byte) 17);
                                egVar = egVar2;
                            }
                            if (egVar == null) {
                                az(egVar, enVar, enVar2, 1918183986);
                                if (egVar.aj * -356714521 != an) {
                                    eq eqVar = (eq) this.ag.aq();
                                    Object obj2 = 1;
                                    while (eqVar != null) {
                                        if (eqVar.aq.equals(enVar)) {
                                            if (an != 0 && eqVar.ar == (short) 0) {
                                                eqVar.ad();
                                            } else if (an == 0 && eqVar.ar != (short) 0) {
                                                eqVar.ad();
                                            }
                                            obj2 = null;
                                        }
                                        eqVar = (eq) this.ag.ar();
                                    }
                                    if (obj2 != null) {
                                        this.ag.ad(new eq(enVar, an));
                                        euVar = egVar;
                                    }
                                }
                                egVar2 = egVar;
                            } else if (aq((byte) -90) < 400) {
                                euVar = (eu) ag(enVar, enVar2, -850207814);
                            }
                            if (euVar.aj * -356714521 != an) {
                                int i2 = this.as - 1678861571;
                                this.as = i2;
                                euVar.ai = ((i2 * -1038101931) - 1) * 195607539;
                                if (-1 == euVar.aj * -356714521 && an == 0) {
                                    euVar.ai = -(euVar.ai * 1);
                                }
                                euVar.aj = 538454999 * an;
                            }
                            euVar.ae = -1759235731 * af;
                            euVar.ad = z;
                            euVar.al = z2;
                        }
                    }
                    egVar = egVar2;
                    if (egVar == null) {
                    }
                    if (euVar.aj * -356714521 != an) {
                    }
                    euVar.ae = -1759235731 * af;
                    euVar.ad = z;
                    euVar.al = z2;
                } else {
                    throw new IllegalStateException();
                }
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ea.ct(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        au(472776182);
    }

    public boolean cu(en enVar, boolean z) {
        eu euVar = (eu) aj(enVar, (byte) 16);
        return euVar == null ? false : (z && euVar.aj * -356714521 == 0) ? false : true;
    }

    public boolean cx(en enVar, boolean z, int i) {
        try {
            eu euVar = (eu) aj(enVar, (byte) 16);
            return euVar == null ? false : (z && euVar.aj * -356714521 == 0) ? false : true;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ea.cx(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public eg cy() {
        return new eu();
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cz(lj ljVar, int i) {
        while (ljVar.al * -1631454091 < i) {
            Object obj = ljVar.af(1804771424) == 1 ? 1 : null;
            en enVar = new en(ljVar.bm(1378989130), this.ak);
            en enVar2 = new en(ljVar.bm(1899360822), this.ak);
            int an = ljVar.an(-1464407032);
            int af = ljVar.af(1804771424);
            int af2 = ljVar.af(1804771424);
            boolean z = (af2 & 2) != 0;
            boolean z2 = (af2 & 1) != 0;
            if (an > 0) {
                ljVar.bm(2003936400);
                ljVar.af(1804771424);
                ljVar.at((byte) -117);
            }
            ljVar.bm(1138565227);
            if (enVar.aq((short) -31635)) {
                eg egVar;
                eu euVar;
                eg egVar2 = (eu) ai(enVar, 133191182);
                if (obj != null) {
                    eg egVar3 = (eu) ai(enVar2, 449392118);
                    if (!(egVar3 == null || egVar3 == egVar2)) {
                        if (egVar2 != null) {
                            ak(egVar3, (byte) 60);
                            egVar = egVar2;
                        } else {
                            egVar = egVar3;
                        }
                        if (egVar == null) {
                            az(egVar, enVar, enVar2, 1692121294);
                            if (egVar.aj * -356714521 != an) {
                                eq eqVar = (eq) this.ag.aq();
                                obj = 1;
                                while (eqVar != null) {
                                    if (eqVar.aq.equals(enVar)) {
                                        if (an != 0 && eqVar.ar == (short) 0) {
                                            eqVar.ad();
                                        } else if (an == 0 && eqVar.ar != (short) 0) {
                                            eqVar.ad();
                                        }
                                        obj = null;
                                    }
                                    eqVar = (eq) this.ag.ar();
                                }
                                if (obj != null) {
                                    this.ag.ad(new eq(enVar, an));
                                    euVar = egVar;
                                }
                            }
                            egVar2 = egVar;
                        } else if (aq((byte) -39) < 400) {
                            euVar = (eu) ag(enVar, enVar2, -1863415619);
                        }
                        if (euVar.aj * -356714521 != an) {
                            int i2 = this.as - 1678861571;
                            this.as = i2;
                            euVar.ai = ((i2 * -1038101931) - 1) * 195607539;
                            if (-1 == euVar.aj * -356714521 && an == 0) {
                                euVar.ai = -(euVar.ai * 1);
                            }
                            euVar.aj = 538454999 * an;
                        }
                        euVar.ae = -1759235731 * af;
                        euVar.ad = z;
                        euVar.al = z2;
                    }
                }
                egVar = egVar2;
                if (egVar == null) {
                }
                if (euVar.aj * -356714521 != an) {
                }
                euVar.ae = -1759235731 * af;
                euVar.ad = z;
                euVar.al = z2;
            } else {
                throw new IllegalStateException();
            }
        }
        au(1839021877);
    }
}
