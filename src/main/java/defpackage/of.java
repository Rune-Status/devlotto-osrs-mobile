package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: of */
public class of {
    static final int ad = 200000000;
    static final int bb = 9;
    long ae;
    long ag;
    byte[] ai;
    int aj;
    long ak;
    long al;
    int am;
    long ap;
    oq aq;
    byte[] ar;
    long as;

    public of(oq oqVar, int i, int i2) throws IOException {
        try {
            this.al = -6745150409221572071L;
            this.ae = 8528910661296539917L;
            this.am = 0;
            this.aq = oqVar;
            long aj = oqVar.aj((byte) 46) * -6744462527243793741L;
            this.as = aj;
            this.ag = aj * 7454252536370455337L;
            this.ar = new byte[i];
            this.ai = new byte[i2];
            this.ak = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("of.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aa(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        if (i3 <= bArr.length) {
            long j;
            int i4;
            int ai;
            if (this.ae * -7842733447067708869L != -1 && this.ak * -3816172788541330593L >= this.ae * -7842733447067708869L) {
                j = (long) i2;
                if ((this.ak * -3816172788541330593L) + j <= (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655))) {
                    System.arraycopy(this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), bArr, i, i2);
                    this.ak += j * 3863769977619853471L;
                    return;
                }
            }
            long j2 = this.ak * -3816172788541330593L;
            if (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= (this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437))) {
                i3 = i;
                i4 = i2;
            } else {
                i3 = (int) (((long) (this.aj * -2126332437)) - ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)));
                i4 = i3 > i2 ? i2 : i3;
                System.arraycopy(this.ar, (int) ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)), bArr, i, i4);
                this.ak += ((long) i4) * 3863769977619853471L;
                i3 = i + i4;
                i4 = i2 - i4;
            }
            if (i4 > this.ar.length) {
                this.aq.ad(this.ak * -3816172788541330593L);
                this.ap = this.ak * 5361311321347816615L;
                while (i4 > 0) {
                    ai = this.aq.ai(bArr, i3, i4, 1832381435);
                    if (ai == -1) {
                        break;
                    }
                    long j3 = (long) ai;
                    this.ap += 5906142844006448057L * j3;
                    this.ak += j3 * 3863769977619853471L;
                    i3 += ai;
                    i4 -= ai;
                }
            } else if (i4 > 0) {
                ai(1108849627);
                ai = i4 > this.aj * -2126332437 ? this.aj * -2126332437 : i4;
                System.arraycopy(this.ar, 0, bArr, i3, ai);
                i3 += ai;
                i4 -= ai;
                this.ak = (((long) ai) * 3863769977619853471L) + this.ak;
            }
            if (this.ae * -7842733447067708869L != -1) {
                if (this.ae * -7842733447067708869L > this.ak * -3816172788541330593L && i4 > 0) {
                    int i5 = ((int) ((this.ae * -7842733447067708869L) - (this.ak * -3816172788541330593L))) + i3;
                    ai = i3 + i4;
                    if (i5 <= ai) {
                        ai = i5;
                    }
                    while (i3 < ai) {
                        bArr[i3] = (byte) 0;
                        i4--;
                        this.ak += 3863769977619853471L;
                        i3++;
                    }
                }
                try {
                    long j4 = (this.ae * -7842733447067708869L < j2 || this.ae * -7842733447067708869L >= ((long) i2) + j2) ? (j2 < this.ae * -7842733447067708869L || j2 >= ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) ? -1 : j2 : this.ae * -7842733447067708869L;
                    if (((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L) <= j2 || (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655)) > ((long) i2) + j2) {
                        j = ((long) i2) + j2;
                        if (j <= this.ae * -7842733447067708869L || j > ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) {
                            j = -1;
                        }
                    } else {
                        j = (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655));
                    }
                    if (j4 > -1 && j > j4) {
                        System.arraycopy(this.ai, (int) (j4 - (this.ae * -7842733447067708869L)), bArr, ((int) (j4 - j2)) + i, (int) (j - j4));
                        if (j > this.ak * -3816172788541330593L) {
                            i4 = (int) (((long) i4) - (j - (this.ak * -3816172788541330593L)));
                            this.ak = j * 3863769977619853471L;
                        }
                    }
                } catch (IOException e) {
                    this.ap = -5906142844006448057L;
                    throw e;
                }
            }
            if (i4 > 0) {
                throw new EOFException();
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException(i3 - bArr.length);
    }

    /* Access modifiers changed, original: 0000 */
    public void ab() throws IOException {
        this.aj = 0;
        if (this.ak * -3816172788541330593L != this.ap * 8287275035000920713L) {
            this.aq.ad(this.ak * -3816172788541330593L);
            this.ap = this.ak * 5361311321347816615L;
        }
        this.al = this.ak * -8866430928351969863L;
        while (this.aj * -2126332437 < this.ar.length) {
            int length = this.ar.length - (this.aj * -1535066124);
            if (length > -1184570736) {
                length = ad;
            }
            length = this.aq.ai(this.ar, this.aj * 587986208, length, -249162191);
            if (length != -1) {
                this.ap += ((long) length) * 5906142844006448057L;
                this.aj = (length * 229872500) + this.aj;
            } else {
                return;
            }
        }
    }

    public void ac(byte[] bArr) throws IOException {
        aj(bArr, 0, bArr.length, 579654321);
    }

    public void ad(byte b) throws IOException {
        try {
            am((byte) -66);
            this.aq.ar(-85549225);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("of.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ae(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            long j = (long) i2;
            if ((this.ak * -3816172788541330593L) + j > this.ag * -5637267499068599549L) {
                this.ag = ((this.ak * -3816172788541330593L) + j) * 5692103562687426475L;
            }
            if (-1 != this.ae * -7842733447067708869L && (this.ak * -3816172788541330593L < this.ae * -7842733447067708869L || this.ak * -3816172788541330593L > (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655)))) {
                am((byte) -97);
            }
            if (this.ae * -7842733447067708869L != -1 && (this.ak * -3816172788541330593L) + j > ((long) this.ai.length) + (this.ae * -7842733447067708869L)) {
                int length = (int) (((long) this.ai.length) - ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)));
                System.arraycopy(bArr, i, this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), length);
                this.ak += ((long) length) * 3863769977619853471L;
                i += length;
                i2 -= length;
                this.am = this.ai.length * 2106494585;
                am((byte) -16);
            }
            if (i2 > this.ai.length) {
                if (this.ak * -3816172788541330593L != this.ap * 8287275035000920713L) {
                    this.aq.ad(this.ak * -3816172788541330593L);
                    this.ap = this.ak * 5361311321347816615L;
                }
                this.aq.aq(bArr, i, i2, 1782227141);
                long j2 = (long) i2;
                this.ap += 5906142844006448057L * j2;
                if (this.ap * 8287275035000920713L > this.as * -144419341302598533L) {
                    this.as = this.ap * 4550685214744569803L;
                }
                j = (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (this.al * -5518982963724698153L < this.ak * -3816172788541330593L || this.al * -5518982963724698153L >= (this.ak * -3816172788541330593L) + j2) ? -1 : this.al * -5518982963724698153L : this.ak * -3816172788541330593L;
                long j3 = ((this.ak * -3816172788541330593L) + j2 <= this.al * -5518982963724698153L || (this.ak * -3816172788541330593L) + j2 > ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) <= this.ak * -3816172788541330593L || (this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437)) > (this.ak * -3816172788541330593L) + j2) ? -1 : ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) : (this.ak * -3816172788541330593L) + j2;
                if (j > -1 && j3 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (this.ak * -3816172788541330593L)), this.ar, (int) (j - (this.al * -5518982963724698153L)), (int) (j3 - j));
                }
                this.ak += 3863769977619853471L * j2;
            } else if (i2 > 0) {
                if (-1 == this.ae * -7842733447067708869L) {
                    this.ae = this.ak * -5911105890179844819L;
                }
                System.arraycopy(bArr, i, this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), i2);
                this.ak += ((long) i2) * 3863769977619853471L;
                if ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L) > ((long) (this.am * -1307673655))) {
                    this.am = ((int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L))) * 2106494585;
                }
            }
        } catch (IOException e) {
            this.ap = -5906142844006448057L;
            throw e;
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("of.ae(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public void af(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        try {
            if (i3 <= bArr.length) {
                int i4;
                int ai;
                if (this.ae * -7842733447067708869L != -1 && this.ak * -3816172788541330593L >= this.ae * -7842733447067708869L) {
                    long j = (long) i2;
                    if ((this.ak * -3816172788541330593L) + j <= (this.ae * -7842733447067708869L) + ((long) (this.am * -1700593287))) {
                        System.arraycopy(this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), bArr, i, i2);
                        this.ak += j * 3863769977619853471L;
                        return;
                    }
                }
                long j2 = this.ak * -3816172788541330593L;
                if (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= (this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437))) {
                    i3 = i;
                    i4 = i2;
                } else {
                    i3 = (int) (((long) (this.aj * -2126332437)) - ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)));
                    i4 = i3 > i2 ? i2 : i3;
                    System.arraycopy(this.ar, (int) ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)), bArr, i, i4);
                    this.ak += ((long) i4) * 3863769977619853471L;
                    i3 = i + i4;
                    i4 = i2 - i4;
                }
                if (i4 > this.ar.length) {
                    this.aq.ad(this.ak * -3816172788541330593L);
                    this.ap = this.ak * 5361311321347816615L;
                    while (i4 > 0) {
                        ai = this.aq.ai(bArr, i3, i4, 1245461406);
                        if (ai == -1) {
                            break;
                        }
                        long j3 = (long) ai;
                        this.ap += 5906142844006448057L * j3;
                        this.ak += j3 * 3863769977619853471L;
                        i3 += ai;
                        i4 -= ai;
                    }
                } else if (i4 > 0) {
                    ai(1390690258);
                    ai = i4 > this.aj * -2126332437 ? this.aj * -2126332437 : i4;
                    System.arraycopy(this.ar, 0, bArr, i3, ai);
                    i3 += ai;
                    i4 -= ai;
                    this.ak = (((long) ai) * 3863769977619853471L) + this.ak;
                }
                if (this.ae * -7842733447067708869L != -1) {
                    long j4;
                    if (this.ae * -7842733447067708869L > this.ak * -3816172788541330593L && i4 > 0) {
                        int i5 = ((int) ((this.ae * -7842733447067708869L) - (this.ak * -3816172788541330593L))) + i3;
                        ai = i3 + i4;
                        if (i5 <= ai) {
                            ai = i5;
                        }
                        while (i3 < ai) {
                            bArr[i3] = (byte) 0;
                            i4--;
                            this.ak += 3863769977619853471L;
                            i3++;
                        }
                    }
                    ai = i4;
                    long j5 = (this.ae * -7842733447067708869L < j2 || this.ae * -7842733447067708869L >= ((long) i2) + j2) ? (j2 < this.ae * -7842733447067708869L || j2 >= ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) ? -1 : j2 : this.ae * -7842733447067708869L;
                    if (((long) (this.am * -1064331293)) + (this.ae * -7842733447067708869L) <= j2 || (this.ae * -7842733447067708869L) + ((long) (this.am * 2004618537)) > ((long) i2) + j2) {
                        j4 = ((long) i2) + j2;
                        if (j4 <= this.ae * -7842733447067708869L || j4 > ((long) (this.am * 1170079925)) + (this.ae * -7842733447067708869L)) {
                            j4 = -1;
                        }
                    } else {
                        j4 = (this.ae * -7842733447067708869L) + ((long) (this.am * 988598442));
                    }
                    if (j5 > -1 && j4 > j5) {
                        System.arraycopy(this.ai, (int) (j5 - (this.ae * -7842733447067708869L)), bArr, ((int) (j5 - j2)) + i, (int) (j4 - j5));
                        if (j4 > this.ak * -3816172788541330593L) {
                            ai = (int) (((long) ai) - (j4 - (this.ak * -3816172788541330593L)));
                            this.ak = j4 * 3863769977619853471L;
                            i4 = ai;
                        }
                    }
                    i4 = ai;
                }
                if (i4 > 0) {
                    throw new EOFException();
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException(i3 - bArr.length);
        } catch (IOException e) {
            this.ap = -5906142844006448057L;
            throw e;
        }
    }

    public void ag(long j) throws IOException {
        if (j >= 0) {
            this.ak = 3863769977619853471L * j;
            return;
        }
        throw new IOException("");
    }

    public void ah(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        try {
            if (i3 <= bArr.length) {
                int i4;
                int ai;
                if (this.ae * -7842733447067708869L != -1 && this.ak * -3816172788541330593L >= this.ae * -7842733447067708869L) {
                    long j = (long) i2;
                    if ((this.ak * -3816172788541330593L) + j <= (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655))) {
                        System.arraycopy(this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), bArr, i, i2);
                        this.ak += j * 3863769977619853471L;
                        return;
                    }
                }
                long j2 = this.ak * -3816172788541330593L;
                if (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= (this.al * -5518982963724698153L) + ((long) (this.aj * 1792535783))) {
                    i3 = i;
                    i4 = i2;
                } else {
                    i3 = (int) (((long) (this.aj * -1533569606)) - ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)));
                    i4 = i3 > i2 ? i2 : i3;
                    System.arraycopy(this.ar, (int) ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)), bArr, i, i4);
                    this.ak += ((long) i4) * 3863769977619853471L;
                    i3 = i + i4;
                    i4 = i2 - i4;
                }
                if (i4 > this.ar.length) {
                    this.aq.ad(this.ak * -3816172788541330593L);
                    this.ap = this.ak * 5361311321347816615L;
                    while (i4 > 0) {
                        ai = this.aq.ai(bArr, i3, i4, -1048813461);
                        if (ai == -1) {
                            break;
                        }
                        long j3 = (long) ai;
                        this.ap += 5906142844006448057L * j3;
                        this.ak += j3 * 3863769977619853471L;
                        i3 += ai;
                        i4 -= ai;
                    }
                } else if (i4 > 0) {
                    ai(-1180148202);
                    ai = i4 > this.aj * -2126332437 ? this.aj * -2126332437 : i4;
                    System.arraycopy(this.ar, 0, bArr, i3, ai);
                    i3 += ai;
                    i4 -= ai;
                    this.ak = (((long) ai) * 3863769977619853471L) + this.ak;
                }
                if (this.ae * -7842733447067708869L != -1) {
                    long j4;
                    if (this.ae * -7842733447067708869L > this.ak * -3816172788541330593L && i4 > 0) {
                        int i5 = ((int) ((this.ae * -7842733447067708869L) - (this.ak * -3816172788541330593L))) + i3;
                        ai = i3 + i4;
                        if (i5 <= ai) {
                            ai = i5;
                        }
                        while (i3 < ai) {
                            bArr[i3] = (byte) 0;
                            i4--;
                            this.ak += 3863769977619853471L;
                            i3++;
                        }
                    }
                    ai = i4;
                    long j5 = (this.ae * -7842733447067708869L < j2 || this.ae * -7842733447067708869L >= ((long) i2) + j2) ? (j2 < this.ae * -7842733447067708869L || j2 >= ((long) (this.am * -786452894)) + (this.ae * -7842733447067708869L)) ? -1 : j2 : this.ae * -7842733447067708869L;
                    if (((long) (this.am * 934000798)) + (this.ae * -7842733447067708869L) <= j2 || (this.ae * -7842733447067708869L) + ((long) (this.am * -202247602)) > ((long) i2) + j2) {
                        j4 = ((long) i2) + j2;
                        if (j4 <= this.ae * -7842733447067708869L || j4 > ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) {
                            j4 = -1;
                        }
                    } else {
                        j4 = (this.ae * -7842733447067708869L) + ((long) (this.am * 1369614433));
                    }
                    if (j5 > -1 && j4 > j5) {
                        System.arraycopy(this.ai, (int) (j5 - (this.ae * -7842733447067708869L)), bArr, ((int) (j5 - j2)) + i, (int) (j4 - j5));
                        if (j4 > this.ak * -3816172788541330593L) {
                            ai = (int) (((long) ai) - (j4 - (this.ak * -3816172788541330593L)));
                            this.ak = j4 * 3863769977619853471L;
                            i4 = ai;
                        }
                    }
                    i4 = ai;
                }
                if (i4 > 0) {
                    throw new EOFException();
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException(i3 - bArr.length);
        } catch (IOException e) {
            this.ap = -5906142844006448057L;
            throw e;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i) throws IOException {
        try {
            this.aj = 0;
            if (this.ak * -3816172788541330593L != this.ap * 8287275035000920713L) {
                this.aq.ad(this.ak * -3816172788541330593L);
                this.ap = this.ak * 5361311321347816615L;
            }
            this.al = this.ak * -8866430928351969863L;
            while (this.aj * -2126332437 < this.ar.length) {
                int length = this.ar.length - (this.aj * -2126332437);
                if (length > ad) {
                    length = ad;
                }
                length = this.aq.ai(this.ar, this.aj * -2126332437, length, 264760004);
                if (length != -1) {
                    this.ap += ((long) length) * 5906142844006448057L;
                    this.aj = (length * -1423408445) + this.aj;
                } else {
                    return;
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("of.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aj(byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4 = i2 + i;
        if (i4 <= bArr.length) {
            long j;
            int i5;
            int ai;
            if (this.ae * -7842733447067708869L != -1 && this.ak * -3816172788541330593L >= this.ae * -7842733447067708869L) {
                j = (long) i2;
                if ((this.ak * -3816172788541330593L) + j <= (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655))) {
                    System.arraycopy(this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), bArr, i, i2);
                    this.ak += j * 3863769977619853471L;
                    return;
                }
            }
            long j2 = this.ak * -3816172788541330593L;
            if (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= (this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437))) {
                i4 = i;
                i5 = i2;
            } else {
                i4 = (int) (((long) (this.aj * -2126332437)) - ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)));
                i5 = i4 > i2 ? i2 : i4;
                System.arraycopy(this.ar, (int) ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)), bArr, i, i5);
                this.ak += ((long) i5) * 3863769977619853471L;
                i4 = i + i5;
                i5 = i2 - i5;
            }
            if (i5 > this.ar.length) {
                this.aq.ad(this.ak * -3816172788541330593L);
                this.ap = this.ak * 5361311321347816615L;
                while (i5 > 0) {
                    ai = this.aq.ai(bArr, i4, i5, 587983925);
                    if (ai == -1) {
                        break;
                    }
                    long j3 = (long) ai;
                    this.ap += 5906142844006448057L * j3;
                    this.ak += j3 * 3863769977619853471L;
                    i4 += ai;
                    i5 -= ai;
                }
            } else if (i5 > 0) {
                ai(-1380746344);
                ai = i5 > this.aj * -2126332437 ? this.aj * -2126332437 : i5;
                System.arraycopy(this.ar, 0, bArr, i4, ai);
                i4 += ai;
                i5 -= ai;
                this.ak = (((long) ai) * 3863769977619853471L) + this.ak;
            }
            if (this.ae * -7842733447067708869L != -1) {
                if (this.ae * -7842733447067708869L > this.ak * -3816172788541330593L && i5 > 0) {
                    int i6 = ((int) ((this.ae * -7842733447067708869L) - (this.ak * -3816172788541330593L))) + i4;
                    ai = i4 + i5;
                    if (i6 <= ai) {
                        ai = i6;
                    }
                    while (i4 < ai) {
                        bArr[i4] = (byte) 0;
                        i5--;
                        this.ak += 3863769977619853471L;
                        i4++;
                    }
                }
                try {
                    long j4 = (this.ae * -7842733447067708869L < j2 || this.ae * -7842733447067708869L >= ((long) i2) + j2) ? (j2 < this.ae * -7842733447067708869L || j2 >= ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) ? -1 : j2 : this.ae * -7842733447067708869L;
                    if (((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L) <= j2 || (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655)) > ((long) i2) + j2) {
                        j = ((long) i2) + j2;
                        if (j <= this.ae * -7842733447067708869L || j > ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) {
                            j = -1;
                        }
                    } else {
                        j = (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655));
                    }
                    if (j4 > -1 && j > j4) {
                        System.arraycopy(this.ai, (int) (j4 - (this.ae * -7842733447067708869L)), bArr, ((int) (j4 - j2)) + i, (int) (j - j4));
                        if (j > this.ak * -3816172788541330593L) {
                            i5 = (int) (((long) i5) - (j - (this.ak * -3816172788541330593L)));
                            this.ak = j * 3863769977619853471L;
                        }
                    }
                } catch (IOException e) {
                    this.ap = -5906142844006448057L;
                    throw e;
                } catch (RuntimeException e2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("of.aj(");
                    stringBuilder.append(')');
                    throw mv.aq(e2, stringBuilder.toString());
                }
            }
            if (i5 > 0) {
                throw new EOFException();
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException(i4 - bArr.length);
    }

    public void ak() throws IOException {
        am((byte) -11);
        this.aq.ar(216092137);
    }

    public void al(byte[] bArr, byte b) throws IOException {
        try {
            aj(bArr, 0, bArr.length, -1118366817);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("of.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void am(byte b) throws IOException {
        try {
            if (this.ae * -7842733447067708869L != -1) {
                if (this.ae * -7842733447067708869L != this.ap * 8287275035000920713L) {
                    this.aq.ad(this.ae * -7842733447067708869L);
                    this.ap = this.ae * -496278781964909149L;
                }
                this.aq.aq(this.ai, 0, this.am * -1307673655, -280111438);
                this.ap += ((long) this.am) * -1483441448845654207L;
                if (this.ap * 8287275035000920713L > this.as * -144419341302598533L) {
                    this.as = this.ap * 4550685214744569803L;
                }
                long j = (this.ae * -7842733447067708869L < this.al * -5518982963724698153L || this.ae * -7842733447067708869L >= ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (this.al * -5518982963724698153L < this.ae * -7842733447067708869L || this.al * -5518982963724698153L >= ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) ? -1 : this.al * -5518982963724698153L : this.ae * -7842733447067708869L;
                long j2 = (((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L) <= this.al * -5518982963724698153L || (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655)) > ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? ((this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437)) <= this.ae * -7842733447067708869L || ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) > (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655))) ? -1 : ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) : ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L);
                if (j > -1 && j2 > j) {
                    System.arraycopy(this.ai, (int) (j - (this.ae * -7842733447067708869L)), this.ar, (int) (j - (this.al * -5518982963724698153L)), (int) (j2 - j));
                }
                this.ae = 8528910661296539917L;
                this.am = 0;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("of.am(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void an() throws IOException {
        this.aj = 0;
        if (this.ak * -3816172788541330593L != this.ap * 8287275035000920713L) {
            this.aq.ad(this.ak * -3816172788541330593L);
            this.ap = this.ak * 5361311321347816615L;
        }
        this.al = this.ak * -8866430928351969863L;
        while (this.aj * -1538829620 < this.ar.length) {
            int length = this.ar.length - (this.aj * 1148693393);
            if (length > 1588736470) {
                length = 1666110923;
            }
            length = this.aq.ai(this.ar, this.aj * -2126332437, length, -1688656732);
            if (length != -1) {
                this.ap += ((long) length) * 5906142844006448057L;
                this.aj = (length * -1205896083) + this.aj;
            } else {
                return;
            }
        }
    }

    public void ao(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        if (i3 <= bArr.length) {
            long j;
            int i4;
            int ai;
            if (this.ae * -7842733447067708869L != -1 && this.ak * -3816172788541330593L >= this.ae * -7842733447067708869L) {
                j = (long) i2;
                if ((this.ak * -3816172788541330593L) + j <= (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655))) {
                    System.arraycopy(this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), bArr, i, i2);
                    this.ak += j * 3863769977619853471L;
                    return;
                }
            }
            long j2 = this.ak * -3816172788541330593L;
            if (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= (this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437))) {
                i3 = i;
                i4 = i2;
            } else {
                i3 = (int) (((long) (this.aj * -2126332437)) - ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)));
                i4 = i3 > i2 ? i2 : i3;
                System.arraycopy(this.ar, (int) ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)), bArr, i, i4);
                this.ak += ((long) i4) * 3863769977619853471L;
                i3 = i + i4;
                i4 = i2 - i4;
            }
            if (i4 > this.ar.length) {
                this.aq.ad(this.ak * -3816172788541330593L);
                this.ap = this.ak * 5361311321347816615L;
                while (i4 > 0) {
                    ai = this.aq.ai(bArr, i3, i4, -1832571416);
                    if (ai == -1) {
                        break;
                    }
                    long j3 = (long) ai;
                    this.ap += 5906142844006448057L * j3;
                    this.ak += j3 * 3863769977619853471L;
                    i3 += ai;
                    i4 -= ai;
                }
            } else if (i4 > 0) {
                ai(-1657684389);
                ai = i4 > this.aj * -2126332437 ? this.aj * -2126332437 : i4;
                System.arraycopy(this.ar, 0, bArr, i3, ai);
                i3 += ai;
                i4 -= ai;
                this.ak = (((long) ai) * 3863769977619853471L) + this.ak;
            }
            if (this.ae * -7842733447067708869L != -1) {
                if (this.ae * -7842733447067708869L > this.ak * -3816172788541330593L && i4 > 0) {
                    int i5 = ((int) ((this.ae * -7842733447067708869L) - (this.ak * -3816172788541330593L))) + i3;
                    ai = i3 + i4;
                    if (i5 <= ai) {
                        ai = i5;
                    }
                    while (i3 < ai) {
                        bArr[i3] = (byte) 0;
                        i4--;
                        this.ak += 3863769977619853471L;
                        i3++;
                    }
                }
                try {
                    long j4 = (this.ae * -7842733447067708869L < j2 || this.ae * -7842733447067708869L >= ((long) i2) + j2) ? (j2 < this.ae * -7842733447067708869L || j2 >= ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) ? -1 : j2 : this.ae * -7842733447067708869L;
                    if (((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L) <= j2 || (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655)) > ((long) i2) + j2) {
                        j = ((long) i2) + j2;
                        if (j <= this.ae * -7842733447067708869L || j > ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) {
                            j = -1;
                        }
                    } else {
                        j = (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655));
                    }
                    if (j4 > -1 && j > j4) {
                        System.arraycopy(this.ai, (int) (j4 - (this.ae * -7842733447067708869L)), bArr, ((int) (j4 - j2)) + i, (int) (j - j4));
                        if (j > this.ak * -3816172788541330593L) {
                            i4 = (int) (((long) i4) - (j - (this.ak * -3816172788541330593L)));
                            this.ak = j * 3863769977619853471L;
                        }
                    }
                } catch (IOException e) {
                    this.ap = -5906142844006448057L;
                    throw e;
                }
            }
            if (i4 > 0) {
                throw new EOFException();
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException(i3 - bArr.length);
    }

    public long ap() {
        return this.ag * -5637267499068599549L;
    }

    public void aq(long j) throws IOException {
        if (j >= 0) {
            try {
                this.ak = 3863769977619853471L * j;
                return;
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("of.aq(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        throw new IOException("");
    }

    public long ar(int i) {
        try {
            return this.ag * -5637267499068599549L;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("of.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as(long j) throws IOException {
        if (j >= 0) {
            this.ak = 3863769977619853471L * j;
            return;
        }
        throw new IOException("");
    }

    /* Access modifiers changed, original: 0000 */
    public void at() throws IOException {
        this.aj = 0;
        if (this.ak * -3816172788541330593L != this.ap * 8287275035000920713L) {
            this.aq.ad(this.ak * -3816172788541330593L);
            this.ap = this.ak * 5361311321347816615L;
        }
        this.al = this.ak * -8866430928351969863L;
        while (this.aj * -2126332437 < this.ar.length) {
            int length = this.ar.length - (this.aj * -2126332437);
            if (length > ad) {
                length = ad;
            }
            length = this.aq.ai(this.ar, this.aj * -2126332437, length, 1239618213);
            if (length != -1) {
                this.ap += ((long) length) * 5906142844006448057L;
                this.aj = (length * -1423408445) + this.aj;
            } else {
                return;
            }
        }
    }

    public long au() {
        return this.ag * -5637267499068599549L;
    }

    /* Access modifiers changed, original: 0000 */
    public void av() throws IOException {
        this.aj = 0;
        if (this.ak * -3816172788541330593L != this.ap * 8287275035000920713L) {
            this.aq.ad(this.ak * -3816172788541330593L);
            this.ap = this.ak * 5361311321347816615L;
        }
        this.al = this.ak * -8866430928351969863L;
        while (this.aj * -2126332437 < this.ar.length) {
            int length = this.ar.length - (this.aj * -2126332437);
            if (length > ad) {
                length = ad;
            }
            length = this.aq.ai(this.ar, this.aj * -2126332437, length, -1811837083);
            if (length != -1) {
                this.ap += ((long) length) * 5906142844006448057L;
                this.aj = (length * -1423408445) + this.aj;
            } else {
                return;
            }
        }
    }

    public void aw(byte[] bArr) throws IOException {
        aj(bArr, 0, bArr.length, -1757662000);
    }

    public void ax(byte[] bArr) throws IOException {
        aj(bArr, 0, bArr.length, 294048848);
    }

    public void ay(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        try {
            if (i3 <= bArr.length) {
                int i4;
                int ai;
                if (this.ae * -7842733447067708869L != -1 && this.ak * -3816172788541330593L >= this.ae * -7842733447067708869L) {
                    long j = (long) i2;
                    if ((this.ak * -3816172788541330593L) + j <= (this.ae * -7842733447067708869L) + ((long) (this.am * -712708271))) {
                        System.arraycopy(this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), bArr, i, i2);
                        this.ak += j * 3863769977619853471L;
                        return;
                    }
                }
                long j2 = this.ak * -3816172788541330593L;
                if (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= (this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437))) {
                    i3 = i;
                    i4 = i2;
                } else {
                    i3 = (int) (((long) (this.aj * -2126332437)) - ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)));
                    i4 = i3 > i2 ? i2 : i3;
                    System.arraycopy(this.ar, (int) ((this.ak * -3816172788541330593L) - (this.al * -5518982963724698153L)), bArr, i, i4);
                    this.ak += ((long) i4) * 3863769977619853471L;
                    i3 = i + i4;
                    i4 = i2 - i4;
                }
                if (i4 > this.ar.length) {
                    this.aq.ad(this.ak * -3816172788541330593L);
                    this.ap = this.ak * 5361311321347816615L;
                    while (i4 > 0) {
                        ai = this.aq.ai(bArr, i3, i4, -1348401349);
                        if (ai == -1) {
                            break;
                        }
                        long j3 = (long) ai;
                        this.ap += 5906142844006448057L * j3;
                        this.ak += j3 * 3863769977619853471L;
                        i3 += ai;
                        i4 -= ai;
                    }
                } else if (i4 > 0) {
                    ai(-2023314284);
                    ai = i4 > this.aj * -2126332437 ? this.aj * -2126332437 : i4;
                    System.arraycopy(this.ar, 0, bArr, i3, ai);
                    i3 += ai;
                    i4 -= ai;
                    this.ak = (((long) ai) * 3863769977619853471L) + this.ak;
                }
                if (this.ae * -7842733447067708869L != -1) {
                    long j4;
                    if (this.ae * -7842733447067708869L > this.ak * -3816172788541330593L && i4 > 0) {
                        int i5 = ((int) ((this.ae * -7842733447067708869L) - (this.ak * -3816172788541330593L))) + i3;
                        ai = i3 + i4;
                        if (i5 <= ai) {
                            ai = i5;
                        }
                        while (i3 < ai) {
                            bArr[i3] = (byte) 0;
                            i4--;
                            this.ak += 3863769977619853471L;
                            i3++;
                        }
                    }
                    ai = i4;
                    long j5 = (this.ae * -7842733447067708869L < j2 || this.ae * -7842733447067708869L >= ((long) i2) + j2) ? (j2 < this.ae * -7842733447067708869L || j2 >= ((long) (this.am * 998591280)) + (this.ae * -7842733447067708869L)) ? -1 : j2 : this.ae * -7842733447067708869L;
                    if (((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L) <= j2 || (this.ae * -7842733447067708869L) + ((long) (this.am * 18001922)) > ((long) i2) + j2) {
                        j4 = ((long) i2) + j2;
                        if (j4 <= this.ae * -7842733447067708869L || j4 > ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) {
                            j4 = -1;
                        }
                    } else {
                        j4 = (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655));
                    }
                    if (j5 > -1 && j4 > j5) {
                        System.arraycopy(this.ai, (int) (j5 - (this.ae * -7842733447067708869L)), bArr, ((int) (j5 - j2)) + i, (int) (j4 - j5));
                        if (j4 > this.ak * -3816172788541330593L) {
                            ai = (int) (((long) ai) - (j4 - (this.ak * -3816172788541330593L)));
                            this.ak = j4 * 3863769977619853471L;
                            i4 = ai;
                        }
                    }
                    i4 = ai;
                }
                if (i4 > 0) {
                    throw new EOFException();
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException(i3 - bArr.length);
        } catch (IOException e) {
            this.ap = -5906142844006448057L;
            throw e;
        }
    }

    public void az(byte[] bArr) throws IOException {
        aj(bArr, 0, bArr.length, -1137526851);
    }

    public void ba(byte[] bArr, int i, int i2) throws IOException {
        try {
            long j = (long) i2;
            if ((this.ak * -3816172788541330593L) + j > this.ag * -5637267499068599549L) {
                this.ag = ((this.ak * -3816172788541330593L) + j) * 5692103562687426475L;
            }
            if (-1 != this.ae * -7842733447067708869L && (this.ak * -3816172788541330593L < this.ae * -7842733447067708869L || this.ak * -3816172788541330593L > (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655)))) {
                am((byte) -100);
            }
            if (this.ae * -7842733447067708869L != -1 && (this.ak * -3816172788541330593L) + j > ((long) this.ai.length) + (this.ae * -7842733447067708869L)) {
                int length = (int) (((long) this.ai.length) - ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)));
                System.arraycopy(bArr, i, this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), length);
                this.ak += ((long) length) * 3863769977619853471L;
                i += length;
                i2 -= length;
                this.am = this.ai.length * 2106494585;
                am((byte) -127);
            }
            if (i2 > this.ai.length) {
                if (this.ak * -3816172788541330593L != this.ap * 8287275035000920713L) {
                    this.aq.ad(this.ak * -3816172788541330593L);
                    this.ap = this.ak * 5361311321347816615L;
                }
                this.aq.aq(bArr, i, i2, 2081943425);
                long j2 = (long) i2;
                this.ap += 5906142844006448057L * j2;
                if (this.ap * 8287275035000920713L > this.as * -144419341302598533L) {
                    this.as = this.ap * 4550685214744569803L;
                }
                j = (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (this.al * -5518982963724698153L < this.ak * -3816172788541330593L || this.al * -5518982963724698153L >= (this.ak * -3816172788541330593L) + j2) ? -1 : this.al * -5518982963724698153L : this.ak * -3816172788541330593L;
                long j3 = ((this.ak * -3816172788541330593L) + j2 <= this.al * -5518982963724698153L || (this.ak * -3816172788541330593L) + j2 > ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) <= this.ak * -3816172788541330593L || (this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437)) > (this.ak * -3816172788541330593L) + j2) ? -1 : ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) : (this.ak * -3816172788541330593L) + j2;
                if (j > -1 && j3 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (this.ak * -3816172788541330593L)), this.ar, (int) (j - (this.al * -5518982963724698153L)), (int) (j3 - j));
                }
                this.ak += 3863769977619853471L * j2;
            } else if (i2 > 0) {
                if (-1 == this.ae * -7842733447067708869L) {
                    this.ae = this.ak * -5911105890179844819L;
                }
                System.arraycopy(bArr, i, this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), i2);
                this.ak += ((long) i2) * 3863769977619853471L;
                if ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L) > ((long) (this.am * -1307673655))) {
                    this.am = ((int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L))) * 2106494585;
                }
            }
        } catch (IOException e) {
            this.ap = -5906142844006448057L;
            throw e;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bd() throws IOException {
        if (this.ae * -7842733447067708869L != -1) {
            if (this.ae * -7842733447067708869L != this.ap * 8287275035000920713L) {
                this.aq.ad(this.ae * -7842733447067708869L);
                this.ap = this.ae * -496278781964909149L;
            }
            this.aq.aq(this.ai, 0, this.am * 1018790271, 1529472390);
            this.ap += ((long) this.am) * -1483441448845654207L;
            if (this.ap * 8287275035000920713L > this.as * -144419341302598533L) {
                this.as = this.ap * 4550685214744569803L;
            }
            long j = (this.ae * -7842733447067708869L < this.al * -5518982963724698153L || this.ae * -7842733447067708869L >= ((long) (this.aj * -1975213385)) + (this.al * -5518982963724698153L)) ? (this.al * -5518982963724698153L < this.ae * -7842733447067708869L || this.al * -5518982963724698153L >= ((long) (this.am * 313641737)) + (this.ae * -7842733447067708869L)) ? -1 : this.al * -5518982963724698153L : this.ae * -7842733447067708869L;
            long j2 = (((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L) <= this.al * -5518982963724698153L || (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655)) > ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? ((this.al * -5518982963724698153L) + ((long) (this.aj * -930617513)) <= this.ae * -7842733447067708869L || ((long) (this.aj * -1088724721)) + (this.al * -5518982963724698153L) > (this.ae * -7842733447067708869L) + ((long) (this.am * -1348593555))) ? -1 : ((long) (this.aj * 46486837)) + (this.al * -5518982963724698153L) : ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L);
            if (j > -1 && j2 > j) {
                System.arraycopy(this.ai, (int) (j - (this.ae * -7842733447067708869L)), this.ar, (int) (j - (this.al * -5518982963724698153L)), (int) (j2 - j));
            }
            this.ae = 8528910661296539917L;
            this.am = 0;
        }
    }

    public void bk(byte[] bArr, int i, int i2) throws IOException {
        try {
            long j = (long) i2;
            if ((this.ak * -3816172788541330593L) + j > this.ag * -5637267499068599549L) {
                this.ag = ((this.ak * -3816172788541330593L) + j) * 5692103562687426475L;
            }
            if (-1 != this.ae * -7842733447067708869L && (this.ak * -3816172788541330593L < this.ae * -7842733447067708869L || this.ak * -3816172788541330593L > (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655)))) {
                am((byte) -24);
            }
            if (this.ae * -7842733447067708869L != -1 && (this.ak * -3816172788541330593L) + j > ((long) this.ai.length) + (this.ae * -7842733447067708869L)) {
                int length = (int) (((long) this.ai.length) - ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)));
                System.arraycopy(bArr, i, this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), length);
                this.ak += ((long) length) * 3863769977619853471L;
                i += length;
                i2 -= length;
                this.am = this.ai.length * 2106494585;
                am((byte) -82);
            }
            if (i2 > this.ai.length) {
                if (this.ak * -3816172788541330593L != this.ap * 8287275035000920713L) {
                    this.aq.ad(this.ak * -3816172788541330593L);
                    this.ap = this.ak * 5361311321347816615L;
                }
                this.aq.aq(bArr, i, i2, -298477435);
                long j2 = (long) i2;
                this.ap += 5906142844006448057L * j2;
                if (this.ap * 8287275035000920713L > this.as * -144419341302598533L) {
                    this.as = this.ap * 4550685214744569803L;
                }
                j = (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (this.al * -5518982963724698153L < this.ak * -3816172788541330593L || this.al * -5518982963724698153L >= (this.ak * -3816172788541330593L) + j2) ? -1 : this.al * -5518982963724698153L : this.ak * -3816172788541330593L;
                long j3 = ((this.ak * -3816172788541330593L) + j2 <= this.al * -5518982963724698153L || (this.ak * -3816172788541330593L) + j2 > ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) <= this.ak * -3816172788541330593L || (this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437)) > (this.ak * -3816172788541330593L) + j2) ? -1 : ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) : (this.ak * -3816172788541330593L) + j2;
                if (j > -1 && j3 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (this.ak * -3816172788541330593L)), this.ar, (int) (j - (this.al * -5518982963724698153L)), (int) (j3 - j));
                }
                this.ak += 3863769977619853471L * j2;
            } else if (i2 > 0) {
                if (-1 == this.ae * -7842733447067708869L) {
                    this.ae = this.ak * -5911105890179844819L;
                }
                System.arraycopy(bArr, i, this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), i2);
                this.ak += ((long) i2) * 3863769977619853471L;
                if ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L) > ((long) (this.am * -1307673655))) {
                    this.am = ((int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L))) * 2106494585;
                }
            }
        } catch (IOException e) {
            this.ap = -5906142844006448057L;
            throw e;
        }
    }

    public void bm(byte[] bArr, int i, int i2) throws IOException {
        try {
            long j = (long) i2;
            if ((this.ak * -3816172788541330593L) + j > this.ag * -5637267499068599549L) {
                this.ag = ((this.ak * -3816172788541330593L) + j) * 5692103562687426475L;
            }
            if (-1 != this.ae * -7842733447067708869L && (this.ak * -3816172788541330593L < this.ae * -7842733447067708869L || this.ak * -3816172788541330593L > (this.ae * -7842733447067708869L) + ((long) (this.am * 1674903596)))) {
                am((byte) -52);
            }
            if (this.ae * -7842733447067708869L != -1 && (this.ak * -3816172788541330593L) + j > ((long) this.ai.length) + (this.ae * -7842733447067708869L)) {
                int length = (int) (((long) this.ai.length) - ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)));
                System.arraycopy(bArr, i, this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), length);
                this.ak += ((long) length) * 3863769977619853471L;
                i += length;
                i2 -= length;
                this.am = this.ai.length * 2106494585;
                am((byte) -22);
            }
            if (i2 > this.ai.length) {
                if (this.ak * -3816172788541330593L != this.ap * 8287275035000920713L) {
                    this.aq.ad(this.ak * -3816172788541330593L);
                    this.ap = this.ak * 5361311321347816615L;
                }
                this.aq.aq(bArr, i, i2, 620765258);
                long j2 = (long) i2;
                this.ap += 5906142844006448057L * j2;
                if (this.ap * 8287275035000920713L > this.as * -144419341302598533L) {
                    this.as = this.ap * 4550685214744569803L;
                }
                j = (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= ((long) (this.aj * 1937987703)) + (this.al * -5518982963724698153L)) ? (this.al * -5518982963724698153L < this.ak * -3816172788541330593L || this.al * -5518982963724698153L >= (this.ak * -3816172788541330593L) + j2) ? -1 : this.al * -5518982963724698153L : this.ak * -3816172788541330593L;
                long j3 = ((this.ak * -3816172788541330593L) + j2 <= this.al * -5518982963724698153L || (this.ak * -3816172788541330593L) + j2 > ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (((long) (this.aj * 1336136196)) + (this.al * -5518982963724698153L) <= this.ak * -3816172788541330593L || (this.al * -5518982963724698153L) + ((long) (this.aj * -966054340)) > (this.ak * -3816172788541330593L) + j2) ? -1 : ((long) (this.aj * -1607914216)) + (this.al * -5518982963724698153L) : (this.ak * -3816172788541330593L) + j2;
                if (j > -1 && j3 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (this.ak * -3816172788541330593L)), this.ar, (int) (j - (this.al * -5518982963724698153L)), (int) (j3 - j));
                }
                this.ak += 3863769977619853471L * j2;
            } else if (i2 > 0) {
                if (-1 == this.ae * -7842733447067708869L) {
                    this.ae = this.ak * -5911105890179844819L;
                }
                System.arraycopy(bArr, i, this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), i2);
                this.ak += ((long) i2) * 3863769977619853471L;
                if ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L) > ((long) (this.am * 1219245999))) {
                    this.am = ((int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L))) * 645136238;
                }
            }
        } catch (IOException e) {
            this.ap = -5906142844006448057L;
            throw e;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bq() throws IOException {
        if (this.ae * -7842733447067708869L != -1) {
            if (this.ae * -7842733447067708869L != this.ap * 8287275035000920713L) {
                this.aq.ad(this.ae * -7842733447067708869L);
                this.ap = this.ae * -496278781964909149L;
            }
            this.aq.aq(this.ai, 0, this.am * -1307673655, -626707163);
            this.ap += ((long) this.am) * -1483441448845654207L;
            if (this.ap * 8287275035000920713L > this.as * -144419341302598533L) {
                this.as = this.ap * 4550685214744569803L;
            }
            long j = (this.ae * -7842733447067708869L < this.al * -5518982963724698153L || this.ae * -7842733447067708869L >= ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (this.al * -5518982963724698153L < this.ae * -7842733447067708869L || this.al * -5518982963724698153L >= ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L)) ? -1 : this.al * -5518982963724698153L : this.ae * -7842733447067708869L;
            long j2 = (((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L) <= this.al * -5518982963724698153L || (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655)) > ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? ((this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437)) <= this.ae * -7842733447067708869L || ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) > (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655))) ? -1 : ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) : ((long) (this.am * -1307673655)) + (this.ae * -7842733447067708869L);
            if (j > -1 && j2 > j) {
                System.arraycopy(this.ai, (int) (j - (this.ae * -7842733447067708869L)), this.ar, (int) (j - (this.al * -5518982963724698153L)), (int) (j2 - j));
            }
            this.ae = 8528910661296539917L;
            this.am = 0;
        }
    }

    public void bs(byte[] bArr, int i, int i2) throws IOException {
        try {
            long j = (long) i2;
            if ((this.ak * -3816172788541330593L) + j > this.ag * -5637267499068599549L) {
                this.ag = ((this.ak * -3816172788541330593L) + j) * 5692103562687426475L;
            }
            if (-1 != this.ae * -7842733447067708869L && (this.ak * -3816172788541330593L < this.ae * -7842733447067708869L || this.ak * -3816172788541330593L > (this.ae * -7842733447067708869L) + ((long) (this.am * -1307673655)))) {
                am((byte) -48);
            }
            if (this.ae * -7842733447067708869L != -1 && (this.ak * -3816172788541330593L) + j > ((long) this.ai.length) + (this.ae * -7842733447067708869L)) {
                int length = (int) (((long) this.ai.length) - ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)));
                System.arraycopy(bArr, i, this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), length);
                this.ak += ((long) length) * 3863769977619853471L;
                i += length;
                i2 -= length;
                this.am = this.ai.length * 2106494585;
                am((byte) -92);
            }
            if (i2 > this.ai.length) {
                if (this.ak * -3816172788541330593L != this.ap * 8287275035000920713L) {
                    this.aq.ad(this.ak * -3816172788541330593L);
                    this.ap = this.ak * 5361311321347816615L;
                }
                this.aq.aq(bArr, i, i2, 359463483);
                long j2 = (long) i2;
                this.ap += 5906142844006448057L * j2;
                if (this.ap * 8287275035000920713L > this.as * -144419341302598533L) {
                    this.as = this.ap * 4550685214744569803L;
                }
                j = (this.ak * -3816172788541330593L < this.al * -5518982963724698153L || this.ak * -3816172788541330593L >= ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (this.al * -5518982963724698153L < this.ak * -3816172788541330593L || this.al * -5518982963724698153L >= (this.ak * -3816172788541330593L) + j2) ? -1 : this.al * -5518982963724698153L : this.ak * -3816172788541330593L;
                long j3 = ((this.ak * -3816172788541330593L) + j2 <= this.al * -5518982963724698153L || (this.ak * -3816172788541330593L) + j2 > ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L)) ? (((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) <= this.ak * -3816172788541330593L || (this.al * -5518982963724698153L) + ((long) (this.aj * -2126332437)) > (this.ak * -3816172788541330593L) + j2) ? -1 : ((long) (this.aj * -2126332437)) + (this.al * -5518982963724698153L) : (this.ak * -3816172788541330593L) + j2;
                if (j > -1 && j3 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (this.ak * -3816172788541330593L)), this.ar, (int) (j - (this.al * -5518982963724698153L)), (int) (j3 - j));
                }
                this.ak += 3863769977619853471L * j2;
            } else if (i2 > 0) {
                if (-1 == this.ae * -7842733447067708869L) {
                    this.ae = this.ak * -5911105890179844819L;
                }
                System.arraycopy(bArr, i, this.ai, (int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L)), i2);
                this.ak += ((long) i2) * 3863769977619853471L;
                if ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L) > ((long) (this.am * -1307673655))) {
                    this.am = ((int) ((this.ak * -3816172788541330593L) - (this.ae * -7842733447067708869L))) * 2106494585;
                }
            }
        } catch (IOException e) {
            this.ap = -5906142844006448057L;
            throw e;
        }
    }
}
