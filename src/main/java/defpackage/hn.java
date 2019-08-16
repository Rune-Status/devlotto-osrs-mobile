package defpackage;

import com.appsflyer.share.Constants;
import com.google.android.gms.common.internal.ImagesContract;

/* renamed from: hn */
public class hn extends br {
    static final int fr = 104;
    static final int sb = 97;
    int ad;
    dp ae;
    int ai;
    int aj;
    int ak;
    int al;
    int am;
    int aq;
    int ar;

    hn(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, br brVar) {
        try {
            this.ad = -1261301423 * i;
            this.aq = 215710513 * i2;
            this.ar = 505635279 * i3;
            this.al = -1355713759 * i4;
            this.aj = -1349353341 * i5;
            this.ai = -1291316205 * i6;
            if (i7 != -1) {
                this.ae = gn.aq(i7, 1862527949);
                this.am = 0;
                this.ak = (client.bj * -2035072149) + 1306632515;
                if (this.ae.ao * -1484717029 == 0 && brVar != null && (brVar instanceof hn)) {
                    hn hnVar = (hn) brVar;
                    if (hnVar.ae == this.ae) {
                        this.am = hnVar.am * 1;
                        this.ak = hnVar.ak * 1;
                        return;
                    }
                }
                if (z && this.ae.as * 1295326563 != -1) {
                    this.am = ((int) (Math.random() * ((double) this.ae.ai.length))) * -1855010383;
                    this.ak -= ((int) (Math.random() * ((double) this.ae.am[this.am * 1301405521]))) * -1306632515;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hn.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final int ah(int i) {
        try {
            return bu.aj * -645814395;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hn.ah(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static String id(String str, boolean z, int i) {
        String str2 = z ? "https://" : "http://";
        try {
            StringBuilder stringBuilder;
            if (1 == client.ai * 975409481) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("-wtrc");
                str = stringBuilder.toString();
            } else if (2 == client.ai * 975409481) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("-wtqa");
                str = stringBuilder.toString();
            } else {
                if (client.ai * 975409481 == 3) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("-wtwip");
                } else if (5 == client.ai * 975409481) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("-wti");
                } else if (4 == client.ai * 975409481) {
                    str = ImagesContract.LOCAL;
                }
                str = stringBuilder.toString();
            }
            String str3 = "";
            if (client.au != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("/p=");
                stringBuilder.append(client.au);
                str3 = stringBuilder.toString();
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str2);
            stringBuilder2.append(str);
            stringBuilder2.append(".");
            stringBuilder2.append("runescape.com");
            stringBuilder2.append("/l=");
            stringBuilder2.append(oc.ag);
            stringBuilder2.append("/a=");
            stringBuilder2.append(client.az * -236990673);
            stringBuilder2.append(str3);
            stringBuilder2.append(Constants.URL_PATH_DELIMITER);
            return stringBuilder2.toString();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("hn.id(");
            stringBuilder3.append(')');
            throw mv.aq(e, stringBuilder3.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bp ab() {
        try {
            if (this.ae != null) {
                int i = (client.bj * 2133672263) - (this.ak * -1903555435);
                if (i > 100 && this.ae.as * 1295326563 > 0) {
                    i = 100;
                }
                while (i > this.ae.am[this.am * 1301405521]) {
                    i -= this.ae.am[this.am * 1301405521];
                    this.am -= 1855010383;
                    if (this.am * 1301405521 >= this.ae.ai.length) {
                        this.am -= this.ae.as * -917107597;
                        if (this.am * 1301405521 < 0 || this.am * 1301405521 >= this.ae.ai.length) {
                            this.ae = null;
                            break;
                        }
                    }
                }
                this.ak = ((client.bj * 2133672263) - i) * -1306632515;
            }
            dx aq = aj.aq(this.ad * -2063083599, 1275494030);
            if (aq.bw != null) {
                aq = aq.ap(1551892961);
            }
            if (aq == null) {
                return null;
            }
            int i2;
            int i3;
            if (this.ar * 1843922223 == 1 || this.ar * 1843922223 == 3) {
                i2 = -506944577 * aq.ac;
                i3 = -814811101 * aq.aa;
            } else {
                i2 = aq.aa * -814811101;
                i3 = -506944577 * aq.ac;
            }
            int i4 = (this.aj * -1372991957) + (i3 >> 1);
            int i5 = ((i3 + 1) >> 1) + (this.aj * -1372991957);
            int i6 = (i2 >> 1) + (this.ai * 1827329563);
            int i7 = ((i2 + 1) >> 1) + (this.ai * 1827329563);
            int[][] iArr = in.ad[this.al * 119525601];
            int i8 = iArr[i5][i6];
            i6 = iArr[i4][i6];
            int i9 = iArr[i4][i7];
            i7 = iArr[i5][i7];
            return aq.as(this.aq * -220070447, 1843922223 * this.ar, iArr, (i3 << 6) + ((this.aj * -1372991957) << 7), (((i6 + i8) + i9) + i7) >> 2, (i2 << 6) + ((1827329563 * this.ai) << 7), this.ae, this.am * 1301405521, 704455419);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hn.ab(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dd() {
        if (this.ae != null) {
            int i = (client.bj * 2133672263) - (this.ak * -1903555435);
            if (i > 100 && this.ae.as * 1295326563 > 0) {
                i = 678318608;
            }
            while (i > this.ae.am[this.am * 1301405521]) {
                i -= this.ae.am[this.am * 1301405521];
                this.am -= 254926771;
                if (this.am * 296448834 >= this.ae.ai.length) {
                    this.am -= this.ae.as * -917107597;
                    if (this.am * -1897768248 < 0 || this.am * 1301405521 >= this.ae.ai.length) {
                        this.ae = null;
                        break;
                    }
                }
            }
            this.ak = ((client.bj * 2133672263) - i) * -514356341;
        }
        dx aq = aj.aq(this.ad * -104688693, -944075839);
        if (aq.bw != null) {
            aq = aq.ap(-1890130046);
        }
        if (aq == null) {
            return null;
        }
        int i2;
        int i3;
        if (this.ar * 1843922223 == 1 || this.ar * 688913058 == 3) {
            i2 = aq.ac * -506944577;
            i3 = aq.aa * 662191405;
        } else {
            i2 = aq.aa * -1526754921;
            i3 = 636030236 * aq.ac;
        }
        int i4 = (this.aj * -1372991957) + (i3 >> 1);
        int i5 = ((i3 + 1) >> 1) + (this.aj * -1201716890);
        int i6 = (i2 >> 1) + (this.ai * 1827329563);
        int i7 = ((i2 + 1) >> 1) + (this.ai * 610449084);
        int[][] iArr = in.ad[this.al * 119525601];
        int i8 = iArr[i5][i6];
        i6 = iArr[i4][i6];
        int i9 = iArr[i4][i7];
        i7 = iArr[i5][i7];
        return aq.as(this.aq * -220070447, this.ar * -1836488276, iArr, (i3 << 6) + ((this.aj * 1927771358) << 7), (((i6 + i8) + i9) + i7) >> 2, (i2 << 6) + ((1071322137 * this.ai) << 7), this.ae, this.am * 1301405521, -8694535);
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dm() {
        if (this.ae != null) {
            int i = (client.bj * 2133672263) - (this.ak * -1903555435);
            if (i > 100 && this.ae.as * 1295326563 > 0) {
                i = 100;
            }
            while (i > this.ae.am[this.am * 1301405521]) {
                i -= this.ae.am[this.am * 1301405521];
                this.am -= 1855010383;
                if (this.am * 1301405521 >= this.ae.ai.length) {
                    this.am -= this.ae.as * -917107597;
                    if (this.am * 1301405521 < 0 || this.am * 1301405521 >= this.ae.ai.length) {
                        this.ae = null;
                        break;
                    }
                }
            }
            this.ak = ((client.bj * 2133672263) - i) * -1306632515;
        }
        dx aq = aj.aq(this.ad * -2063083599, 878338386);
        if (aq.bw != null) {
            aq = aq.ap(1659543128);
        }
        if (aq == null) {
            return null;
        }
        int i2;
        int i3;
        if (this.ar * 1843922223 == 1 || this.ar * 1843922223 == 3) {
            i2 = -506944577 * aq.ac;
            i3 = -814811101 * aq.aa;
        } else {
            i2 = aq.aa * -814811101;
            i3 = -506944577 * aq.ac;
        }
        int i4 = (this.aj * -1372991957) + (i3 >> 1);
        int i5 = ((i3 + 1) >> 1) + (this.aj * -1372991957);
        int i6 = (i2 >> 1) + (this.ai * 1827329563);
        int i7 = ((i2 + 1) >> 1) + (this.ai * 1827329563);
        int[][] iArr = in.ad[this.al * 119525601];
        int i8 = iArr[i5][i6];
        i6 = iArr[i4][i6];
        int i9 = iArr[i4][i7];
        i7 = iArr[i5][i7];
        return aq.as(this.aq * -220070447, this.ar * 1843922223, iArr, (i3 << 6) + ((this.aj * -1372991957) << 7), (((i6 + i8) + i9) + i7) >> 2, (i2 << 6) + ((1827329563 * this.ai) << 7), this.ae, this.am * 1301405521, -847050747);
    }

    /* Access modifiers changed, original: protected|final */
    public final bp dt() {
        if (this.ae != null) {
            int i = (client.bj * 2133672263) - (this.ak * -1903555435);
            if (i > 100 && this.ae.as * 1295326563 > 0) {
                i = 100;
            }
            while (i > this.ae.am[this.am * 1301405521]) {
                i -= this.ae.am[this.am * 1301405521];
                this.am -= 1855010383;
                if (this.am * 1301405521 >= this.ae.ai.length) {
                    this.am -= this.ae.as * -917107597;
                    if (this.am * 1301405521 < 0 || this.am * 1301405521 >= this.ae.ai.length) {
                        this.ae = null;
                        break;
                    }
                }
            }
            this.ak = ((client.bj * 2133672263) - i) * -1306632515;
        }
        dx aq = aj.aq(this.ad * -2063083599, -763176637);
        if (aq.bw != null) {
            aq = aq.ap(-1668883708);
        }
        if (aq == null) {
            return null;
        }
        int i2;
        int i3;
        if (this.ar * 1843922223 == 1 || this.ar * 1843922223 == 3) {
            i2 = -506944577 * aq.ac;
            i3 = -814811101 * aq.aa;
        } else {
            i2 = aq.aa * -814811101;
            i3 = -506944577 * aq.ac;
        }
        int i4 = (this.aj * -1372991957) + (i3 >> 1);
        int i5 = ((i3 + 1) >> 1) + (this.aj * -1372991957);
        int i6 = (i2 >> 1) + (this.ai * 1827329563);
        int i7 = ((i2 + 1) >> 1) + (this.ai * 1827329563);
        int[][] iArr = in.ad[this.al * 119525601];
        int i8 = iArr[i5][i6];
        i6 = iArr[i4][i6];
        int i9 = iArr[i4][i7];
        i7 = iArr[i5][i7];
        return aq.as(this.aq * -220070447, this.ar * 1843922223, iArr, (i3 << 6) + ((this.aj * -1372991957) << 7), (((i6 + i8) + i9) + i7) >> 2, (i2 << 6) + ((1827329563 * this.ai) << 7), this.ae, this.am * 1301405521, 1894757220);
    }
}
