package defpackage;

import java.lang.reflect.Array;

/* renamed from: hx */
public class hx {
    static final int ad = 14;
    static final int ap = 3500;
    static final int aq = 7;
    static final int ar = 6;
    static long ew = 0;
    static final int fy = 104;
    static final int jm = 1;
    int[][] ai;
    int aj;
    int al;

    public hx(int i, int i2) {
        try {
            if (i != i2) {
                int aq = be.aq(i, i2, (byte) 93);
                int i3 = i / aq;
                int i4 = i2 / aq;
                this.al = 1908215787 * i3;
                this.aj = 1832730145 * i4;
                this.ai = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i3, 14});
                for (int i5 = 0; i5 < i3; i5++) {
                    int[] iArr = this.ai[i5];
                    double d = (double) i3;
                    double d2 = (((double) i5) / d) + 6.0d;
                    int floor = (int) Math.floor((d2 - 7.0d) + 1.0d);
                    if (floor < 0) {
                        floor = 0;
                    }
                    aq = (int) Math.ceil(7.0d + d2);
                    if (aq > 14) {
                        aq = 14;
                    }
                    double d3 = ((double) i4) / d;
                    for (floor = 
/*
Method generation error in method: hx.<init>(int, int):void, dex: 
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r3_4 'floor' int) = (r3_2 'floor' int), (r3_3 'floor' int) binds: {(r3_2 'floor' int)=B:6:0x005c, (r3_3 'floor' int)=B:7:0x005e} in method: hx.<init>(int, int):void, dex: 
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:228)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:185)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:95)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:191)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:95)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:120)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:95)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:280)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:321)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:259)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:221)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:10)
	at jadx.core.ProcessClass.process(ProcessClass.java:38)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:539)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:511)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:222)
	... 31 more

*/

    static int ai(int i, byte b) {
        try {
            ie ieVar = (ie) it.ad.get(Integer.valueOf(i));
            return ieVar == null ? 0 : ieVar.ar((byte) 0);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hx.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static final void au(int i) {
        try {
            oz.ak(go.hf, -769293814);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hx.au(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static void cm(int i, int i2, byte b) {
        try {
            client.hf = 1292744653 * i;
            client.hq = 1490660383 * i2;
            client.hh = 0;
            client.hk = 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hx.cm(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] ad(byte[] bArr, short s) {
        try {
            if (this.ai != null) {
                int length = ((int) ((((long) (this.aj * 1052624353)) * ((long) bArr.length)) / ((long) (this.al * 547266755)))) + 14;
                int[] iArr = new int[length];
                int i = 0;
                int i2 = 0;
                for (byte b : bArr) {
                    int i3;
                    int[] iArr2 = this.ai[i];
                    for (i3 = 0; i3 < 14; i3++) {
                        int i4 = i2 + i3;
                        iArr[i4] = iArr[i4] + (iArr2[i3] * b);
                    }
                    i += this.aj * 1052624353;
                    i3 = i / (this.al * 547266755);
                    i2 += i3;
                    i -= i3 * (this.al * 547266755);
                }
                bArr = new byte[length];
                for (int i5 = 0; i5 < length; i5++) {
                    i = (iArr[i5] + 32768) >> 16;
                    if (i < -128) {
                        bArr[i5] = Byte.MIN_VALUE;
                    } else if (i > 127) {
                        bArr[i5] = Byte.MAX_VALUE;
                    } else {
                        bArr[i5] = (byte) i;
                    }
                }
            }
            return bArr;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hx.ad(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ae(int i) {
        return this.ai != null ? (int) ((((long) i) * ((long) (this.aj * -1938223395))) / ((long) (this.al * -1739122150))) : i;
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] ai(byte[] bArr) {
        if (this.ai != null) {
            int length = ((int) ((((long) (this.aj * 1052624353)) * ((long) bArr.length)) / ((long) (this.al * 547266755)))) + 14;
            int[] iArr = new int[length];
            int i = 0;
            int i2 = 0;
            for (byte b : bArr) {
                int i3;
                int[] iArr2 = this.ai[i];
                for (i3 = 0; i3 < 14; i3++) {
                    int i4 = i2 + i3;
                    iArr[i4] = iArr[i4] + (iArr2[i3] * b);
                }
                i += this.aj * 1052624353;
                i3 = i / (this.al * 547266755);
                i2 += i3;
                i -= i3 * (this.al * 547266755);
            }
            bArr = new byte[length];
            for (i = 0; i < length; i++) {
                i2 = (iArr[i] + 32768) >> 16;
                if (i2 < -128) {
                    bArr[i] = Byte.MIN_VALUE;
                } else if (i2 > 127) {
                    bArr[i] = Byte.MAX_VALUE;
                } else {
                    bArr[i] = (byte) i2;
                }
            }
        }
        return bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] aj(byte[] bArr) {
        if (this.ai != null) {
            int length = ((int) ((((long) (this.aj * 1052624353)) * ((long) bArr.length)) / ((long) (this.al * 547266755)))) + 14;
            int[] iArr = new int[length];
            int i = 0;
            int i2 = 0;
            for (byte b : bArr) {
                int i3;
                int[] iArr2 = this.ai[i];
                for (i3 = 0; i3 < 14; i3++) {
                    int i4 = i2 + i3;
                    iArr[i4] = iArr[i4] + (iArr2[i3] * b);
                }
                i += this.aj * 1052624353;
                i3 = i / (this.al * 547266755);
                i2 += i3;
                i -= i3 * (this.al * 547266755);
            }
            bArr = new byte[length];
            for (i = 0; i < length; i++) {
                i2 = (iArr[i] + 32768) >> 16;
                if (i2 < -128) {
                    bArr[i] = Byte.MIN_VALUE;
                } else if (i2 > 127) {
                    bArr[i] = Byte.MAX_VALUE;
                } else {
                    bArr[i] = (byte) i2;
                }
            }
        }
        return bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public int ak(int i) {
        return this.ai != null ? ((int) ((((long) i) * ((long) (this.aj * 1052624353))) / ((long) (this.al * 547266755)))) + 6 : i;
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] al(byte[] bArr) {
        int i = 0;
        if (this.ai != null) {
            int length = ((int) ((((long) (this.aj * 1166868154)) * ((long) bArr.length)) / ((long) (this.al * -372587413)))) + 14;
            int[] iArr = new int[length];
            int i2 = 0;
            int i3 = 0;
            for (byte b : bArr) {
                int i4;
                int[] iArr2 = this.ai[i2];
                for (i4 = 0; i4 < 14; i4++) {
                    int i5 = i3 + i4;
                    iArr[i5] = iArr[i5] + (iArr2[i4] * b);
                }
                i2 += this.aj * 1052624353;
                i4 = i2 / (this.al * -814781363);
                i3 += i4;
                i2 -= i4 * (this.al * 547266755);
            }
            bArr = new byte[length];
            while (i < length) {
                i2 = (iArr[i] + 32768) >> 16;
                if (i2 < 1601046435) {
                    bArr[i] = (byte) 82;
                } else if (i2 > 58535334) {
                    bArr[i] = (byte) 86;
                } else {
                    bArr[i] = (byte) i2;
                }
                i++;
            }
        }
        return bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public int am(int i) {
        return this.ai != null ? (int) ((((long) i) * ((long) (this.aj * 1052624353))) / ((long) (this.al * 547266755))) : i;
    }

    /* Access modifiers changed, original: 0000 */
    public int aq(int i, int i2) {
        try {
            return this.ai != null ? (int) ((((long) i) * ((long) (this.aj * 1052624353))) / ((long) (this.al * 547266755))) : i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hx.aq(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int ar(int i, int i2) {
        try {
            return this.ai != null ? ((int) ((((long) i) * ((long) (this.aj * 1052624353))) / ((long) (this.al * 547266755)))) + 6 : i;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hx.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int as(int i) {
        return this.ai != null ? ((int) ((((long) i) * ((long) (this.aj * 1052624353))) / ((long) (this.al * 547266755)))) + 6 : i;
    }
}
