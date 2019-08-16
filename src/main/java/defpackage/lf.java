package defpackage;

import java.util.zip.Inflater;

/* renamed from: lf */
public class lf {
    public static final int ao = 21;
    static kh aq;
    Inflater ad;

    public lf() {
        try {
            this(-1, 1000000, 1000000);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lf.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    lf(int i, int i2, int i3) {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lf.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0070=Splitter:B:20:0x0070, B:9:0x0027=Splitter:B:9:0x0027} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ad(lj ljVar, byte[] bArr, byte b) {
        try {
            if ((byte) 31 == ljVar.ar[ljVar.al * -1631454091] && (byte) -117 == ljVar.ar[(ljVar.al * -1631454091) + 1]) {
                if (this.ad == null) {
                    this.ad = new Inflater(true);
                }
                this.ad.setInput(ljVar.ar, (ljVar.al * -1631454091) + 10, ljVar.ar.length - (((ljVar.al * -1631454091) + 10) + 8));
                this.ad.inflate(bArr);
                this.ad.reset();
                return;
            }
            throw new RuntimeException("");
        } catch (Exception e) {
            this.ad.reset();
            throw new RuntimeException("");
        } catch (RuntimeException e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lf.ad(");
            stringBuilder.append(')');
            throw mv.aq(e2, stringBuilder.toString());
        }
    }

    public void ai(lj ljVar, byte[] bArr) {
        if ((byte) 31 == ljVar.ar[ljVar.al * -1631454091] && (byte) -117 == ljVar.ar[(ljVar.al * -1631454091) + 1]) {
            if (this.ad == null) {
                this.ad = new Inflater(true);
            }
            try {
                this.ad.setInput(ljVar.ar, (ljVar.al * -1631454091) + 10, ljVar.ar.length - (((ljVar.al * -1631454091) + 10) + 8));
                this.ad.inflate(bArr);
                this.ad.reset();
                return;
            } catch (Exception e) {
                this.ad.reset();
                throw new RuntimeException("");
            }
        }
        throw new RuntimeException("");
    }

    public void aj(lj ljVar, byte[] bArr) {
        if ((byte) 31 == ljVar.ar[ljVar.al * -2145003649] && (byte) -117 == ljVar.ar[(ljVar.al * -1387873151) + 1]) {
            if (this.ad == null) {
                this.ad = new Inflater(true);
            }
            try {
                this.ad.setInput(ljVar.ar, (ljVar.al * -1631454091) + 10, ljVar.ar.length - (((ljVar.al * -648138615) + 10) + 8));
                this.ad.inflate(bArr);
                this.ad.reset();
                return;
            } catch (Exception e) {
                this.ad.reset();
                throw new RuntimeException("");
            }
        }
        throw new RuntimeException("");
    }

    public void al(lj ljVar, byte[] bArr) {
        if ((byte) 31 == ljVar.ar[ljVar.al * -2106848676] && (byte) -117 == ljVar.ar[(ljVar.al * -1631454091) + 1]) {
            if (this.ad == null) {
                this.ad = new Inflater(true);
            }
            try {
                this.ad.setInput(ljVar.ar, (ljVar.al * 984647660) + 10, ljVar.ar.length - (((ljVar.al * -1631454091) + 10) + 8));
                this.ad.inflate(bArr);
                this.ad.reset();
                return;
            } catch (Exception e) {
                this.ad.reset();
                throw new RuntimeException("");
            }
        }
        throw new RuntimeException("");
    }

    public void aq(lj ljVar, byte[] bArr) {
        if (fk.ar == ljVar.ar[ljVar.al * -1803652376] && (byte) -117 == ljVar.ar[(ljVar.al * 822294841) + 1]) {
            if (this.ad == null) {
                this.ad = new Inflater(true);
            }
            try {
                this.ad.setInput(ljVar.ar, (ljVar.al * -1631454091) + 10, ljVar.ar.length - (((ljVar.al * 447762409) + 10) + 8));
                this.ad.inflate(bArr);
                this.ad.reset();
                return;
            } catch (Exception e) {
                this.ad.reset();
                throw new RuntimeException("");
            }
        }
        throw new RuntimeException("");
    }

    public void ar(lj ljVar, byte[] bArr) {
        if ((byte) 31 == ljVar.ar[ljVar.al * -1631454091] && (byte) -117 == ljVar.ar[(ljVar.al * -1631454091) + 1]) {
            if (this.ad == null) {
                this.ad = new Inflater(true);
            }
            try {
                this.ad.setInput(ljVar.ar, (ljVar.al * -1631454091) + 10, ljVar.ar.length - (((ljVar.al * -1631454091) + 10) + 8));
                this.ad.inflate(bArr);
                this.ad.reset();
                return;
            } catch (Exception e) {
                this.ad.reset();
                throw new RuntimeException("");
            }
        }
        throw new RuntimeException("");
    }
}
