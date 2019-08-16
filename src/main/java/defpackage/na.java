package defpackage;

import java.nio.ByteBuffer;

/* renamed from: na */
public class na extends nc {
    public static final int an = 25;
    ByteBuffer ad;

    na() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("na.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] ad(byte b) {
        try {
            byte[] bArr = new byte[this.ad.capacity()];
            this.ad.position(0);
            this.ad.get(bArr);
            return bArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("na.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(byte[] bArr) {
        this.ad = ByteBuffer.allocateDirect(bArr.length);
        this.ad.position(0);
        this.ad.put(bArr);
    }

    /* Access modifiers changed, original: 0000 */
    public void al(byte[] bArr) {
        this.ad = ByteBuffer.allocateDirect(bArr.length);
        this.ad.position(0);
        this.ad.put(bArr);
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(byte[] bArr, int i) {
        try {
            this.ad = ByteBuffer.allocateDirect(bArr.length);
            this.ad.position(0);
            this.ad.put(bArr);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("na.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] ar() {
        byte[] bArr = new byte[this.ad.capacity()];
        this.ad.position(0);
        this.ad.get(bArr);
        return bArr;
    }
}
