package defpackage;

/* renamed from: nc */
public abstract class nc {
    static final int ax = 2;
    static nz rb;

    nc() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nc.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public static Object ag(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length <= -1535448017) {
            return z ? li.am(bArr, -1802799828) : bArr;
        } else {
            na naVar = new na();
            naVar.aq(bArr, 1307343829);
            return naVar;
        }
    }

    public static Object ak(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length <= 136) {
            return z ? li.am(bArr, -1068244088) : bArr;
        } else {
            na naVar = new na();
            naVar.aq(bArr, 1764427405);
            return naVar;
        }
    }

    public static Object ap(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length <= 136) {
            return z ? li.am(bArr, -1267965781) : bArr;
        } else {
            na naVar = new na();
            naVar.aq(bArr, 1636727248);
            return naVar;
        }
    }

    public static Object as(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length <= 136) {
            return z ? li.am(bArr, -920904628) : bArr;
        } else {
            na naVar = new na();
            naVar.aq(bArr, 617654571);
            return naVar;
        }
    }

    public static byte[] au(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return z ? li.am(bArr, -1991580387) : bArr;
        } else if (obj instanceof nc) {
            return ((nc) obj).ad((byte) 20);
        } else {
            throw new IllegalArgumentException();
        }
    }

    static byte[] aw(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    static byte[] ax(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    static byte[] az(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public abstract byte[] ad(byte b);

    public abstract void aj(byte[] bArr);

    public abstract void al(byte[] bArr);

    public abstract void aq(byte[] bArr, int i);

    public abstract byte[] ar();
}
