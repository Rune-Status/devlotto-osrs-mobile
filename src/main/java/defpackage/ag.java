package defpackage;

import java.util.Date;

/* renamed from: ag */
public class ag {
    public static final int at = 26;
    protected static final String az = "public";
    static int qa;
    public int ad;
    public int aq;
    public int ar;

    public ag(int i) {
        try {
            if (i == -1) {
                this.ad = 460753369;
                return;
            }
            this.ad = ((i >> 28) & 3) * -460753369;
            this.aq = ((i >> 14) & 16383) * 1986358431;
            this.ar = (i & 16383) * 1003836073;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ag(int i, int i2, int i3) {
        try {
            this.ad = -460753369 * i;
            this.aq = 1986358431 * i2;
            this.ar = 1003836073 * i3;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public ag(ag agVar) {
        try {
            this.ad = agVar.ad * 1;
            this.aq = agVar.aq * 1;
            this.ar = agVar.ar * 1;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, int i) {
        try {
            dj.ad = khVar;
            dj.aq = new dj[khVar.ax(4, (byte) 70)];
            for (int i2 = 0; i2 < dj.aq.length; i2++) {
                byte[] ar = dj.ad.ar(4, i2, 1305744235);
                dj.aq[i2] = new dj();
                if (ar != null) {
                    dj.aq[i2].al(new lj(ar), i2, -2028610392);
                }
                dj.aq[i2].ar((byte) -96);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static void ad(kh khVar, kh khVar2, boolean z, oi oiVar, int i) {
        try {
            ai.am = khVar;
            da.ak = khVar2;
            if.as = z;
            dh.ag = ai.am.ax(10, (byte) 52) * -1565188967;
            dh.ax = oiVar;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static int bs(int i, hw hwVar, boolean z, int i2) {
        String[] strArr;
        int i3;
        String str;
        int[] iArr;
        int i4;
        String[] strArr2;
        int i5;
        StringBuilder stringBuilder;
        String str2;
        String[] strArr3;
        int[] iArr2;
        int i6;
        String[] strArr4;
        int i7;
        if (4100 == i) {
            try {
                strArr = hl.ak;
                i3 = hl.as + 1490481109;
                hl.as = i3;
                str = strArr[i3 * -1883296125];
                iArr = hl.ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                i3 = iArr[i4 * -757592335];
                strArr2 = hl.ak;
                i5 = hl.as - 1490481109;
                hl.as = i5;
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(i3);
                strArr2[(i5 * -1883296125) - 1] = stringBuilder.toString();
                return 1;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("ag.bs(");
                stringBuilder2.append(')');
                throw mv.aq(e, stringBuilder2.toString());
            }
        } else if (i == 4101) {
            hl.as -= 1314005078;
            str = hl.ak[hl.as * -1883296125];
            str2 = hl.ak[(hl.as * -1883296125) + 1];
            strArr2 = hl.ak;
            i5 = hl.as - 1490481109;
            hl.as = i5;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            strArr2[(i5 * -1883296125) - 1] = stringBuilder.toString();
            return 1;
        } else if (i == 4102) {
            strArr = hl.ak;
            i3 = hl.as + 1490481109;
            hl.as = i3;
            str = strArr[i3 * -1883296125];
            iArr = hl.ae;
            i4 = ds.am + 564452847;
            ds.am = i4;
            i3 = iArr[i4 * -757592335];
            strArr2 = hl.ak;
            i5 = hl.as - 1490481109;
            hl.as = i5;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(ic.ae(i3, true, (byte) 31));
            strArr2[(i5 * -1883296125) - 1] = stringBuilder.toString();
            return 1;
        } else if (i == 4103) {
            strArr = hl.ak;
            i3 = hl.as + 1490481109;
            hl.as = i3;
            str = strArr[i3 * -1883296125];
            strArr3 = hl.ak;
            i4 = hl.as - 1490481109;
            hl.as = i4;
            strArr3[(i4 * -1883296125) - 1] = str.toLowerCase();
            return 1;
        } else if (i == 4104) {
            iArr2 = hl.ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            hl.ax.setTime(new Date((((long) iArr2[i3 * -757592335]) + 11745) * 86400000));
            i6 = hl.ax.get(5);
            i3 = hl.ax.get(2);
            i4 = hl.ax.get(1);
            strArr4 = hl.ak;
            i7 = hl.as - 1490481109;
            hl.as = i7;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(i6);
            stringBuilder3.append("-");
            stringBuilder3.append(hl.aw[i3]);
            stringBuilder3.append("-");
            stringBuilder3.append(i4);
            strArr4[(i7 * -1883296125) - 1] = stringBuilder3.toString();
            return 1;
        } else if (i == 4105) {
            hl.as -= 1314005078;
            str = hl.ak[hl.as * -1883296125];
            str2 = hl.ak[(hl.as * -1883296125) + 1];
            if (da.jc.aq == null || !da.jc.aq.ar) {
                strArr3 = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr3[(i4 * -1883296125) - 1] = str;
                return 1;
            }
            strArr = hl.ak;
            i4 = hl.as - 1490481109;
            hl.as = i4;
            strArr[(i4 * -1883296125) - 1] = str2;
            return 1;
        } else if (i == 4106) {
            iArr2 = hl.ae;
            i3 = ds.am + 564452847;
            ds.am = i3;
            i6 = iArr2[i3 * -757592335];
            strArr3 = hl.ak;
            i4 = hl.as - 1490481109;
            hl.as = i4;
            strArr3[(i4 * -1883296125) - 1] = Integer.toString(i6);
            return 1;
        } else if (4107 == i) {
            hl.as -= 1314005078;
            iArr2 = hl.ae;
            i3 = ds.am - 564452847;
            ds.am = i3;
            iArr2[(i3 * -757592335) - 1] = fl.ao(dt.ad(hl.ak[hl.as * -1883296125], hl.ak[(hl.as * -1883296125) + 1], oc.ag, (byte) -7), 179562398);
            return 1;
        } else {
            i6 = 0;
            oi oiVar;
            int[] iArr3;
            if (i == 4108) {
                strArr = hl.ak;
                i3 = hl.as + 1490481109;
                hl.as = i3;
                str = strArr[i3 * -1883296125];
                ds.am += 1128905694;
                i3 = hl.ae[ds.am * -757592335];
                oiVar = new oi(dn.df.ar(hl.ae[(ds.am * -757592335) + 1], 0, 846618595));
                iArr3 = hl.ae;
                i7 = ds.am - 564452847;
                ds.am = i7;
                iArr3[(i7 * -757592335) - 1] = oiVar.ae(str, i3);
                return 1;
            } else if (i == 4109) {
                strArr = hl.ak;
                i3 = hl.as + 1490481109;
                hl.as = i3;
                str = strArr[i3 * -1883296125];
                ds.am += 1128905694;
                i3 = hl.ae[ds.am * -757592335];
                oiVar = new oi(dn.df.ar(hl.ae[(ds.am * -757592335) + 1], 0, 1443790125));
                iArr3 = hl.ae;
                i7 = ds.am - 564452847;
                ds.am = i7;
                iArr3[(i7 * -757592335) - 1] = oiVar.ai(str, i3);
                return 1;
            } else if (i == 4110) {
                hl.as -= 1314005078;
                str = hl.ak[hl.as * -1883296125];
                str2 = hl.ak[(hl.as * -1883296125) + 1];
                iArr3 = hl.ae;
                i5 = ds.am + 564452847;
                ds.am = i5;
                if (iArr3[i5 * -757592335] == 1) {
                    strArr3 = hl.ak;
                    i4 = hl.as - 1490481109;
                    hl.as = i4;
                    strArr3[(i4 * -1883296125) - 1] = str;
                    return 1;
                }
                strArr = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr[(i4 * -1883296125) - 1] = str2;
                return 1;
            } else if (i == 4111) {
                strArr = hl.ak;
                i3 = hl.as + 1490481109;
                hl.as = i3;
                str = strArr[i3 * -1883296125];
                strArr3 = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr3[(i4 * -1883296125) - 1] = oi.am(str);
                return 1;
            } else if (i == 4112) {
                strArr = hl.ak;
                i3 = hl.as + 1490481109;
                hl.as = i3;
                str = strArr[i3 * -1883296125];
                iArr = hl.ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                i3 = iArr[i4 * -757592335];
                strArr2 = hl.ak;
                i5 = hl.as - 1490481109;
                hl.as = i5;
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append((char) i3);
                strArr2[(i5 * -1883296125) - 1] = stringBuilder.toString();
                return 1;
            } else if (4113 == i) {
                iArr = hl.ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                i3 = iArr[i4 * -757592335];
                iArr3 = hl.ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                if (ew.aa((char) i3, -1639904462)) {
                    i6 = 1;
                }
                iArr3[(i5 * -757592335) - 1] = i6;
                return 1;
            } else if (i == 4114) {
                iArr2 = hl.ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                i6 = iArr2[i4 * -757592335];
                iArr3 = hl.ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                iArr3[(i5 * -757592335) - 1] = fo.az((char) i6, -1933024472) ? 1 : 0;
                return 1;
            } else if (i == 4115) {
                iArr2 = hl.ae;
                i3 = ds.am + 564452847;
                ds.am = i3;
                i6 = iArr2[i3 * -757592335];
                iArr = hl.ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                iArr[(i5 * -757592335) - 1] = cf.ag((char) i6, -1444821049) ? 1 : 0;
                return 1;
            } else if (4116 == i) {
                iArr2 = hl.ae;
                i3 = ds.am + 564452847;
                ds.am = i3;
                i6 = iArr2[i3 * -757592335];
                iArr = hl.ae;
                i4 = ds.am - 564452847;
                ds.am = i4;
                iArr[(i4 * -757592335) - 1] = hb.ap((char) i6, -453340594) ? 1 : 0;
                return 1;
            } else if (4117 == i) {
                strArr = hl.ak;
                i3 = hl.as + 1490481109;
                hl.as = i3;
                str = strArr[i3 * -1883296125];
                if (str != null) {
                    iArr = hl.ae;
                    i4 = ds.am - 564452847;
                    ds.am = i4;
                    iArr[(i4 * -757592335) - 1] = str.length();
                    return 1;
                }
                iArr2 = hl.ae;
                i3 = ds.am - 564452847;
                ds.am = i3;
                iArr2[(i3 * -757592335) - 1] = 0;
                return 1;
            } else if (i == 4118) {
                strArr = hl.ak;
                i3 = hl.as + 1490481109;
                hl.as = i3;
                str = strArr[i3 * -1883296125];
                ds.am += 1128905694;
                i3 = hl.ae[ds.am * -757592335];
                i4 = hl.ae[(ds.am * -757592335) + 1];
                strArr4 = hl.ak;
                i7 = hl.as - 1490481109;
                hl.as = i7;
                strArr4[(i7 * -1883296125) - 1] = str.substring(i3, i4);
                return 1;
            } else if (i == 4119) {
                strArr = hl.ak;
                i3 = hl.as + 1490481109;
                hl.as = i3;
                String str3 = strArr[i3 * -1883296125];
                StringBuilder stringBuilder4 = new StringBuilder(str3.length());
                i6 = 0;
                for (i3 = 0; i3 < str3.length(); i3++) {
                    char charAt = str3.charAt(i3);
                    if ('<' == charAt) {
                        i6 = 1;
                    } else if (charAt == '>') {
                        i6 = 0;
                    } else if (i6 == 0) {
                        stringBuilder4.append(charAt);
                    }
                }
                strArr = hl.ak;
                i3 = hl.as - 1490481109;
                hl.as = i3;
                strArr[(i3 * -1883296125) - 1] = stringBuilder4.toString();
                return 1;
            } else if (i == 4120) {
                strArr = hl.ak;
                i3 = hl.as + 1490481109;
                hl.as = i3;
                str = strArr[i3 * -1883296125];
                iArr = hl.ae;
                i4 = ds.am + 564452847;
                ds.am = i4;
                i3 = iArr[i4 * -757592335];
                iArr3 = hl.ae;
                i5 = ds.am - 564452847;
                ds.am = i5;
                iArr3[(i5 * -757592335) - 1] = str.indexOf(i3);
                return 1;
            } else if (4121 == i) {
                hl.as -= 1314005078;
                str = hl.ak[hl.as * -1883296125];
                str2 = hl.ak[(hl.as * -1883296125) + 1];
                iArr3 = hl.ae;
                i5 = ds.am + 564452847;
                ds.am = i5;
                i4 = iArr3[i5 * -757592335];
                int[] iArr4 = hl.ae;
                i7 = ds.am - 564452847;
                ds.am = i7;
                iArr4[(i7 * -757592335) - 1] = str.indexOf(str2, i4);
                return 1;
            } else if (i != 4122) {
                return 2;
            } else {
                strArr = hl.ak;
                i3 = hl.as + 1490481109;
                hl.as = i3;
                str = strArr[i3 * -1883296125];
                strArr3 = hl.ak;
                i4 = hl.as - 1490481109;
                hl.as = i4;
                strArr3[(i4 * -1883296125) - 1] = str.toUpperCase();
                return 1;
            }
        }
    }

    static final void gu(int i, int i2, int i3) {
        try {
            if (cs.al(i, -2066085455)) {
                fb.ge(dt.ae[i], i2, 1770104048);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.gu(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int ad(byte b) {
        try {
            return (((this.ad * 1224907159) << 28) | ((this.aq * -1822118049) << 14)) | (738029977 * this.ar);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ae(ag agVar) {
        return this.ad * 1224907159 == agVar.ad * 1224907159 && this.aq * -1822118049 == agVar.aq * -1822118049 && this.ar * 738029977 == agVar.ar * 738029977;
    }

    /* Access modifiers changed, original: 0000 */
    public String ag(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.ad * -838578692);
        stringBuilder.append(str);
        stringBuilder.append((this.aq * -1822118049) >> 6);
        stringBuilder.append(str);
        stringBuilder.append((this.ar * 738029977) >> 6);
        stringBuilder.append(str);
        stringBuilder.append((this.aq * -1822118049) & 63);
        stringBuilder.append(str);
        stringBuilder.append((this.ar * 1548733681) & 63);
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ai(ag agVar) {
        return this.ad * 1505720447 == agVar.ad * -1968925188 && this.aq * -1289912309 == agVar.aq * -663218414 && this.ar * 82181661 == agVar.ar * 738029977;
    }

    public int aj() {
        return (((this.ad * 1224907159) << 28) | ((this.aq * -106989137) << 14)) | (this.ar * 543251581);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ak(ag agVar) {
        return this.ad * 1224907159 == agVar.ad * 1224907159 && this.aq * -1822118049 == agVar.aq * -1822118049 && this.ar * 738029977 == agVar.ar * 738029977;
    }

    public int al() {
        return (((this.ad * 1224907159) << 28) | ((this.aq * -1822118049) << 14)) | (this.ar * 738029977);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean am(ag agVar) {
        return this.ad * 1224907159 == agVar.ad * 1224907159 && this.aq * -1822118049 == agVar.aq * -1822118049 && this.ar * 738029977 == agVar.ar * 738029977;
    }

    /* Access modifiers changed, original: 0000 */
    public String ap(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.ad * -1932748105);
        stringBuilder.append(str);
        stringBuilder.append((this.aq * 1577759024) >> 6);
        stringBuilder.append(str);
        stringBuilder.append((this.ar * 738029977) >> 6);
        stringBuilder.append(str);
        stringBuilder.append((this.aq * -1822118049) & 63);
        stringBuilder.append(str);
        stringBuilder.append((this.ar * 738029977) & 63);
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean aq(ag agVar, int i) {
        try {
            if (this.ad * 1224907159 != agVar.ad * 1224907159 || this.aq * -1822118049 != agVar.aq * -1822118049) {
                return false;
            }
            return this.ar * 738029977 == agVar.ar * 738029977;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String ar(String str, int i) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.ad * 1224907159);
            stringBuilder.append(str);
            stringBuilder.append((this.aq * -1822118049) >> 6);
            stringBuilder.append(str);
            stringBuilder.append((this.ar * 738029977) >> 6);
            stringBuilder.append(str);
            stringBuilder.append((this.aq * -1822118049) & 63);
            stringBuilder.append(str);
            stringBuilder.append((this.ar * 738029977) & 63);
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("ag.ar(");
            stringBuilder2.append(')');
            throw mv.aq(e, stringBuilder2.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String as(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.ad * 1224907159);
        stringBuilder.append(str);
        stringBuilder.append((this.aq * -1822118049) >> 6);
        stringBuilder.append(str);
        stringBuilder.append((this.ar * 738029977) >> 6);
        stringBuilder.append(str);
        stringBuilder.append((this.aq * -1822118049) & 63);
        stringBuilder.append(str);
        stringBuilder.append((this.ar * 738029977) & 63);
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            return !(obj instanceof ag) ? false : aq((ag) obj, 790568727);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.equals(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String fa() {
        return ar(",", 1954471488);
    }

    public String fd() {
        return ar(",", 1988653840);
    }

    public int ff() {
        return ad((byte) 0);
    }

    public int fr() {
        return ad((byte) -14);
    }

    public String fv() {
        return ar(",", 1924284585);
    }

    public boolean fy(Object obj) {
        return this == obj ? true : !(obj instanceof ag) ? false : aq((ag) obj, 1774063702);
    }

    public String fz() {
        return ar(",", 2078751679);
    }

    public int hashCode() {
        try {
            return ad((byte) -47);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.hashCode(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public String toString() {
        try {
            return ar(",", 2021781755);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ag.toString(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
