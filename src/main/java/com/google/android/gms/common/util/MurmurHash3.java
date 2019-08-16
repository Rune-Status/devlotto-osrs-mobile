package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class MurmurHash3 {
    private MurmurHash3() {
    }

    /* JADX WARNING: Missing block: B:6:0x0047, code skipped:
            r0 = r0 ^ r9;
            r0 = (r0 ^ (r0 >>> 16)) * -2048144789;
            r0 = (r0 ^ (r0 >>> 13)) * -1028477387;
     */
    /* JADX WARNING: Missing block: B:7:0x0059, code skipped:
            return r0 ^ (r0 >>> 16);
     */
    /* JADX WARNING: Missing block: B:9:0x0062, code skipped:
            r0 = r0 | ((r7[r2 + 1] & 255) << 8);
     */
    /* JADX WARNING: Missing block: B:10:0x006b, code skipped:
            r0 = (r0 | (r7[r2] & 255)) * -862048943;
            r0 = (((r0 << 15) | (r0 >>> 17)) * 461845907) ^ r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = (i2 & -4) + i;
        int i6 = i3;
        while (i < i5) {
            int i7 = ((((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16)) | (bArr[i + 3] << 24)) * -862048943;
            i6 ^= ((i7 >>> 17) | (i7 << 15)) * 461845907;
            i6 = (((i6 << 13) | (i6 >>> 19)) * 5) - 430675100;
            i += 4;
        }
        switch (i2 & 3) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                i4 = (bArr[i5 + 2] & 255) << 16;
                break;
            default:
                i4 = i6;
                break;
        }
    }
}
