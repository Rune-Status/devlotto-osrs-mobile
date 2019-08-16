package defpackage;

/* renamed from: jr */
public class jr {
    static final int ab = 11;
    static final int ad = 765;
    static final String ai = "Your client needs updating. Opening store page...";
    static final String aj = "Old School RuneScape has encountered a problem";
    static final String ak = "Application crashed";
    static final int al = -8355712;
    static final int aq = 503;
    static final String as = "Error loading application";
    static final int bu = 4;
    ef[] aa;
    int ac;
    long af;
    ef ah;
    ef ao;
    int aw;
    String ax;
    int ay;
    int az;

    jr() {
        try {
            this.af = 658014642237431475L;
            this.ay = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aa(ef[] efVarArr, ef efVar, ef efVar2) {
        this.aa = efVarArr;
        this.ao = efVar;
        this.ah = efVar2;
    }

    /* Access modifiers changed, original: 0000 */
    public void ab(es esVar) {
        if (this.aa != null) {
            long ad = gq.ad((byte) 15);
            if (-1 == this.af * -1946119548486451323L) {
                this.af = ad * -658014642237431475L;
            }
            if (ad - (this.af * -1946119548486451323L) >= 33) {
                this.af = ad * -658014642237431475L;
                this.ay += 1015385597;
            }
            int length = this.aa.length - 11;
            int i = this.ay * 1859066584;
            if (i >= length) {
                i = ((i - length) % 967704047) + length;
                if (i >= this.aa.length) {
                    i = this.aa.length - 1;
                }
            }
            ef efVar = this.aa[i];
            int i2 = (this.ac * -893393888) / 4;
            int i3 = (efVar.ar * i2) / efVar.al;
            if (i2 > efVar.al) {
                i = i2 / efVar.al;
                i3 = i * efVar.ar;
                i2 = efVar.al * i;
            }
            int i4 = ((this.aw * 1082045827) - i3) / 2;
            int i5 = ((((this.ac * -1919055791) / 4) - i2) / 2) + 10;
            if (i2 == efVar.al) {
                esVar.aa(efVar, i4, i5, (byte) -104);
            } else {
                esVar.ay(efVar, i4, i5, i3, i2, 587447670);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ac(ef[] efVarArr, ef efVar, ef efVar2) {
        this.aa = efVarArr;
        this.ao = efVar;
        this.ah = efVar2;
    }

    /* Access modifiers changed, original: 0000 */
    public void ad(int i, byte b) {
        try {
            this.az = 938240447 * i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ae(int i, oi oiVar, ew ewVar, float f, int i2) {
        try {
            ak("No Internet connection available. Please check your settings.", i, oiVar, ewVar, f, 157624746);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.ae(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void af(int i, String str, oi oiVar, float f, ew ewVar) {
        es ad = ewVar.ad(-601277067);
        ad.aq(2039450751);
        if (this.aa != null && this.ao != null && this.ah != null) {
            ag(f, (short) 19170);
            al(ad, 1095184008);
            aj(i, str, oiVar, ad, 2068521854);
            ewVar.ae(0, 0, 1706664316);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(float f, short s) {
        int i = ad;
        int i2 = aq;
        if (f > 1.5208747f) {
            i = (int) (503.0f * f);
        } else if (f > 0.0f) {
            i2 = (int) (765.0f / f);
        }
        try {
            this.aw = i * -1295915453;
            this.ac = 1258622463 * i2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(ef[] efVarArr, ef efVar, ef efVar2) {
        this.aa = efVarArr;
        this.ao = efVar;
        this.ah = efVar2;
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(mi miVar, oi oiVar, ew ewVar, float f, int i) {
        if (miVar != null) {
            try {
                if (this.ax == null) {
                    switch (miVar.as * 2019322079) {
                        case 0:
                        case 1:
                        case 4:
                        case 5:
                            this.ax = this.az * -1333230017 == 3 ? "Unable to connect to server" : "Unable to download content";
                            break;
                        case 3:
                            this.ax = ai;
                            break;
                        case 7:
                            this.ax = ak;
                            break;
                        default:
                            this.ax = as;
                            break;
                    }
                }
                es ad = ewVar.ad(-601277067);
                ad.aq(-718667825);
                ag(f, (short) 2101);
                al(ad, 84717924);
                oiVar.ap(aj, (this.aw * 955848299) / 2, ((this.ac * 293641721) / 8) - 20, -1, 0, ad);
                oiVar.ap(this.ax, (this.aw * 955848299) / 2, ((this.ac * 293641721) / 8) + 20, -1, 0, ad);
                ewVar.ae(0, 0, 542521666);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("jr.ai(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i, String str, oi oiVar, es esVar, int i2) {
        try {
            int i3 = (this.ac * 1882649087) / 16;
            int i4 = (this.ao.ar * i3) / this.ao.al;
            int i5 = (this.ac * -1295365645) / 16;
            int i6 = i3 / 2;
            int i7 = ((this.aw * 955848299) - i4) / 2;
            int i8 = i7 + (((((i * 90) / 100) + 5) * i4) / 100);
            esVar.ee(0, 0, i8, 1882649087 * this.ac, 1996757500);
            esVar.ay(this.ah, i7, i5, i4, i3, 587447670);
            esVar.ee(i8, 0, this.aw * 955848299, this.ac * 1882649087, 1851283082);
            esVar.ay(this.ah, i8 - ((i4 * 95) / 100), i5, i4, i3, 587447670);
            esVar.eu(-1181446935);
            esVar.ay(this.ao, i7, i5, i4, i3, 587447670);
            if (oiVar != null) {
                oiVar.ap(str, (this.aw * 955848299) / 2, (i6 + i5) + 5, al, 0, esVar);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ak(String str, int i, oi oiVar, ew ewVar, float f, int i2) {
        try {
            es ad = ewVar.ad(-601277067);
            ad.aq(1468517284);
            ag(f, (short) -3507);
            al(ad, 1225542044);
            oiVar.ap(str, (this.aw * 955848299) / 2, ((this.ac * 293641721) / 8) - 20, -1, 0, ad);
            oiVar.ap(String.format("Automatically retrying in %s...", new Object[]{Integer.valueOf(i)}), (this.aw * 955848299) / 2, ((this.ac * 293641721) / 8) + 20, -1, 0, ad);
            ewVar.ae(0, 0, -687126765);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void al(es esVar, int i) {
        try {
            if (this.aa != null) {
                long ad = gq.ad((byte) -89);
                if (-1 == this.af * -1946119548486451323L) {
                    this.af = ad * -658014642237431475L;
                }
                if (ad - (this.af * -1946119548486451323L) >= 33) {
                    this.af = ad * -658014642237431475L;
                    this.ay += 1015385597;
                }
                int length = this.aa.length - 11;
                int i2 = this.ay * -2142718123;
                if (i2 >= length) {
                    i2 = ((i2 - length) % 86) + length;
                    if (i2 >= this.aa.length) {
                        i2 = this.aa.length - 1;
                    }
                }
                ef efVar = this.aa[i2];
                int i3 = (this.ac * 1352979965) / 4;
                int i4 = (efVar.ar * i3) / efVar.al;
                if (i3 > efVar.al) {
                    i2 = i3 / efVar.al;
                    i4 = i2 * efVar.ar;
                    i3 = efVar.al * i2;
                }
                int i5 = ((this.aw * 955848299) - i4) / 2;
                int i6 = ((((this.ac * 1352979965) / 4) - i3) / 2) + 10;
                if (i3 == efVar.al) {
                    esVar.aa(efVar, i5, i6, (byte) 1);
                } else {
                    esVar.ay(efVar, i5, i6, i4, i3, 587447670);
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void am(int i, oi oiVar, ew ewVar, float f, int i2) {
        try {
            ak("Failed to contact server. Please check your Internet connection.", i, oiVar, ewVar, f, 1004919876);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void an(es esVar) {
        if (this.aa != null) {
            long ad = gq.ad((byte) 41);
            if (-1 == this.af * -1946119548486451323L) {
                this.af = ad * -658014642237431475L;
            }
            if (ad - (this.af * -1946119548486451323L) >= 33) {
                this.af = ad * -658014642237431475L;
                this.ay += 1015385597;
            }
            int length = this.aa.length - 11;
            int i = this.ay * -2142718123;
            if (i >= length) {
                i = ((i - length) % 86) + length;
                if (i >= this.aa.length) {
                    i = this.aa.length - 1;
                }
            }
            ef efVar = this.aa[i];
            int i2 = (this.ac * 1352979965) / 4;
            int i3 = (efVar.ar * i2) / efVar.al;
            if (i2 > efVar.al) {
                i = i2 / efVar.al;
                i3 = i * efVar.ar;
                i2 = efVar.al * i;
            }
            int i4 = ((this.aw * 955848299) - i3) / 2;
            int i5 = ((((this.ac * 1352979965) / 4) - i2) / 2) + 10;
            if (i2 == efVar.al) {
                esVar.aa(efVar, i4, i5, (byte) -121);
            } else {
                esVar.ay(efVar, i4, i5, i3, i2, 587447670);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ao(ef[] efVarArr, ef efVar, ef efVar2) {
        this.aa = efVarArr;
        this.ao = efVar;
        this.ah = efVar2;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean ap(int i) {
        try {
            if (this.aa != null) {
                if (this.ay * -2142718123 >= this.aa.length) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(ef[] efVarArr, ef efVar, ef efVar2, int i) {
        try {
            this.aa = efVarArr;
            this.ao = efVar;
            this.ah = efVar2;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i, String str, oi oiVar, float f, ew ewVar, byte b) {
        try {
            es ad = ewVar.ad(-601277067);
            ad.aq(48442328);
            if (this.aa != null && this.ao != null && this.ah != null) {
                ag(f, (short) -25781);
                al(ad, 815140877);
                aj(i, str, oiVar, ad, 2068521854);
                ewVar.ae(0, 0, -1972759285);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(oi oiVar, ew ewVar, float f, byte b) {
        try {
            es ad = ewVar.ad(-601277067);
            ad.aq(202006563);
            ag(f, (short) 21208);
            al(ad, 402175288);
            oiVar.ap(ai, (this.aw * 955848299) / 2, (this.ac * 293641721) / 8, -1, 0, ewVar.ad(-601277067));
            ewVar.ae(0, 0, -1620819279);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void at(es esVar) {
        if (this.aa != null) {
            long ad = gq.ad((byte) 24);
            if (-1 == this.af * -1946119548486451323L) {
                this.af = ad * -658014642237431475L;
            }
            if (ad - (this.af * -1946119548486451323L) >= 33) {
                this.af = ad * -658014642237431475L;
                this.ay += 1775917791;
            }
            int length = this.aa.length - 11;
            int i = this.ay * -2142718123;
            if (i >= length) {
                i = ((i - length) % 86) + length;
                if (i >= this.aa.length) {
                    i = this.aa.length - 1;
                }
            }
            ef efVar = this.aa[i];
            int i2 = (this.ac * 1352979965) / 4;
            int i3 = (efVar.ar * i2) / efVar.al;
            if (i2 > efVar.al) {
                i = i2 / efVar.al;
                i3 = i * efVar.ar;
                i2 = efVar.al * i;
            }
            int i4 = ((this.aw * 955848299) - i3) / 2;
            int i5 = ((((this.ac * -2102346350) / 4) - i2) / 2) + 10;
            if (i2 == efVar.al) {
                esVar.aa(efVar, i4, i5, (byte) -55);
            } else {
                esVar.ay(efVar, i4, i5, i3, i2, 587447670);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void au(byte b) {
        try {
            this.aa = null;
            this.ao = null;
            this.ah = null;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("jr.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void av(es esVar) {
        if (this.aa != null) {
            long ad = gq.ad((byte) 24);
            if (-1 == this.af * -1946119548486451323L) {
                this.af = ad * -658014642237431475L;
            }
            if (ad - (this.af * -1946119548486451323L) >= 33) {
                this.af = ad * -658014642237431475L;
                this.ay += 1015385597;
            }
            int length = this.aa.length - 11;
            int i = this.ay * -1285671517;
            if (i >= length) {
                i = ((i - length) % 86) + length;
                if (i >= this.aa.length) {
                    i = this.aa.length - 1;
                }
            }
            ef efVar = this.aa[i];
            int i2 = (this.ac * 1352979965) / 4;
            int i3 = (efVar.ar * i2) / efVar.al;
            if (i2 > efVar.al) {
                i = i2 / efVar.al;
                i3 = i * efVar.ar;
                i2 = efVar.al * i;
            }
            int i4 = ((this.aw * 955848299) - i3) / 2;
            int i5 = ((((this.ac * 1352979965) / 4) - i2) / 2) + 10;
            if (i2 == efVar.al) {
                esVar.aa(efVar, i4, i5, (byte) -64);
            } else {
                esVar.ay(efVar, i4, i5, i3, i2, 587447670);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aw(ef[] efVarArr, ef efVar, ef efVar2) {
        this.aa = efVarArr;
        this.ao = efVar;
        this.ah = efVar2;
    }

    /* Access modifiers changed, original: 0000 */
    public void ax(int i) {
        this.az = 938240447 * i;
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(int i, String str, oi oiVar, float f, ew ewVar) {
        es ad = ewVar.ad(-601277067);
        ad.aq(2109623162);
        if (this.aa != null && this.ao != null && this.ah != null) {
            ag(f, (short) -23542);
            al(ad, 261346536);
            aj(i, str, oiVar, ad, 2068521854);
            ewVar.ae(0, 0, -382139975);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void az(int i) {
        this.az = -197834979 * i;
    }

    /* Access modifiers changed, original: 0000 */
    public void ba(mi miVar, oi oiVar, ew ewVar, float f) {
        if (miVar != null) {
            if (this.ax == null) {
                String str;
                switch (miVar.as * 2019322079) {
                    case 0:
                    case 1:
                    case 4:
                    case 5:
                        if (this.az * -1333230017 != 3) {
                            str = "Unable to download content";
                            break;
                        } else {
                            str = "Unable to connect to server";
                            break;
                        }
                    case 3:
                        this.ax = ai;
                        break;
                    case 7:
                        str = ak;
                        break;
                    default:
                        this.ax = as;
                        break;
                }
                this.ax = str;
            }
            es ad = ewVar.ad(-601277067);
            ad.aq(65686546);
            ag(f, (short) 16117);
            al(ad, 26970522);
            oiVar.ap(aj, (this.aw * 955848299) / 2, ((this.ac * 293641721) / 8) - 20, -1, 0, ad);
            oiVar.ap(this.ax, (this.aw * 955848299) / 2, ((this.ac * 293641721) / 8) + 20, -1, 0, ad);
            ewVar.ae(0, 0, -2080583915);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bb(String str, int i, oi oiVar, ew ewVar, float f) {
        es ad = ewVar.ad(-601277067);
        ad.aq(-357406883);
        ag(f, (short) 24204);
        al(ad, 491082064);
        oiVar.ap(str, (this.aw * 955848299) / 2, ((this.ac * 293641721) / 8) - 20, -1, 0, ad);
        oiVar.ap(String.format("Automatically retrying in %s...", new Object[]{Integer.valueOf(i)}), (this.aw * 955848299) / 2, ((this.ac * -60832665) / 8) + 20, -1, 0, ad);
        ewVar.ae(0, 0, 788745514);
    }

    /* Access modifiers changed, original: 0000 */
    public void bc(float f) {
        int i = aq;
        int i2 = ad;
        if (f > 1.5208747f) {
            i2 = (int) (503.0f * f);
        } else if (f > 0.0f) {
            i = (int) (765.0f / f);
        }
        this.aw = i2 * -1295915453;
        this.ac = 1258622463 * i;
    }

    /* Access modifiers changed, original: 0000 */
    public void bd(int i, oi oiVar, ew ewVar, float f) {
        ak("No Internet connection available. Please check your settings.", i, oiVar, ewVar, f, -695983871);
    }

    /* Access modifiers changed, original: 0000 */
    public void be() {
        this.aa = null;
        this.ao = null;
        this.ah = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void bf(int i, oi oiVar, ew ewVar, float f) {
        ak("Failed to contact server. Please check your Internet connection.", i, oiVar, ewVar, f, -1356880894);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bg() {
        return this.aa != null && this.ay * -2142718123 >= this.aa.length;
    }

    /* Access modifiers changed, original: 0000 */
    public void bi(oi oiVar, ew ewVar, float f) {
        es ad = ewVar.ad(-601277067);
        ad.aq(1617222053);
        ag(f, (short) -17382);
        al(ad, 1623294037);
        oiVar.ap(ai, (this.aw * 955848299) / 2, (this.ac * 293641721) / 8, -1, 0, ewVar.ad(-601277067));
        ewVar.ae(0, 0, -1588034848);
    }

    /* Access modifiers changed, original: 0000 */
    public void bj() {
        this.aa = null;
        this.ao = null;
        this.ah = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void bk(int i, String str, oi oiVar, es esVar) {
        int i2 = (this.ac * 1612017441) / 16;
        int i3 = (this.ao.ar * i2) / this.ao.al;
        int i4 = (this.ac * 1854043728) / 16;
        int i5 = i2 / 2;
        int i6 = ((this.aw * 955848299) - i3) / 2;
        int i7 = i6 + (((((1016028751 * i) / 100) + 5) * i3) / 603461894);
        esVar.ee(0, 0, i7, 1336638032 * this.ac, 1750675580);
        esVar.ay(this.ah, i6, i4, i3, i2, 587447670);
        esVar.ee(i7, 0, this.aw * 955848299, this.ac * 1882649087, 1740602318);
        esVar.ay(this.ah, i7 - ((-1538092031 * i3) / 100), i4, i3, i2, 587447670);
        esVar.eu(-1181446935);
        esVar.ay(this.ao, i6, i4, i3, i2, 587447670);
        if (oiVar != null) {
            oiVar.ap(str, (this.aw * 955848299) / 2, (i5 + i4) + 5, al, 0, esVar);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bl(int i, oi oiVar, ew ewVar, float f) {
        ak("Failed to contact server. Please check your Internet connection.", i, oiVar, ewVar, f, -1701284127);
    }

    /* Access modifiers changed, original: 0000 */
    public void bm(int i, oi oiVar, ew ewVar, float f) {
        ak("No Internet connection available. Please check your settings.", i, oiVar, ewVar, f, -528485780);
    }

    /* Access modifiers changed, original: 0000 */
    public void bo(int i, oi oiVar, ew ewVar, float f) {
        ak("No Internet connection available. Please check your settings.", i, oiVar, ewVar, f, -236235883);
    }

    /* Access modifiers changed, original: 0000 */
    public void bq(int i, oi oiVar, ew ewVar, float f) {
        ak("No Internet connection available. Please check your settings.", i, oiVar, ewVar, f, 1738448097);
    }

    /* Access modifiers changed, original: 0000 */
    public void br() {
        this.aa = null;
        this.ao = null;
        this.ah = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void bs(mi miVar, oi oiVar, ew ewVar, float f) {
        if (miVar != null) {
            if (this.ax == null) {
                switch (miVar.as * 2019322079) {
                    case 0:
                    case 1:
                    case 4:
                    case 5:
                        this.ax = this.az * -1333230017 == 3 ? "Unable to connect to server" : "Unable to download content";
                        break;
                    case 3:
                        this.ax = ai;
                        break;
                    case 7:
                        this.ax = ak;
                        break;
                    default:
                        this.ax = as;
                        break;
                }
            }
            es ad = ewVar.ad(-601277067);
            ad.aq(250473394);
            ag(f, (short) -27453);
            al(ad, -4099600);
            oiVar.ap(aj, (this.aw * 955848299) / 2, ((this.ac * -2024272001) / 8) - 20, -1, 0, ad);
            oiVar.ap(this.ax, (this.aw * 955848299) / 2, ((this.ac * -689813446) / 8) + 20, -1, 0, ad);
            ewVar.ae(0, 0, -895767675);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bu() {
        return this.aa != null && this.ay * -955208597 >= this.aa.length;
    }

    /* Access modifiers changed, original: 0000 */
    public void bv(float f) {
        int i = -1959526619;
        int i2 = ad;
        if (f > 1.5208747f) {
            i2 = (int) (503.0f * f);
        } else if (f > 0.0f) {
            i = (int) (765.0f / f);
        }
        this.aw = i2 * -1295915453;
        this.ac = -1744361046 * i;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bw() {
        return this.aa != null && this.ay * -2142718123 >= this.aa.length;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bx() {
        return this.aa != null && this.ay * -2142718123 >= this.aa.length;
    }
}
