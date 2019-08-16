package android.support.v4.graphics;

import android.graphics.Path;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.util.Log;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP})
public class PathParser {
    private static final String LOGTAG = "PathParser";

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    public static class PathDataNode {
        @RestrictTo({Scope.LIBRARY_GROUP})
        public float[] mParams;
        @RestrictTo({Scope.LIBRARY_GROUP})
        public char mType;

        PathDataNode(char c, float[] fArr) {
            this.mType = c;
            this.mParams = fArr;
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            this.mParams = PathParser.copyOfRange(pathDataNode.mParams, 0, pathDataNode.mParams.length);
        }

        /* JADX WARNING: Missing block: B:8:0x0029, code skipped:
            r4 = r12;
            r2 = r13;
            r6 = r14;
            r5 = r15;
     */
        /* JADX WARNING: Missing block: B:37:0x00d9, code skipped:
            r15 = r4;
     */
        /* JADX WARNING: Missing block: B:54:0x01b9, code skipped:
            r4 = r12;
            r2 = r13;
            r1 = r8;
            r3 = r7;
            r6 = r7;
            r5 = r8;
     */
        /* JADX WARNING: Missing block: B:78:0x0254, code skipped:
            r4 = r12;
            r2 = r13;
            r1 = r7;
     */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void addCommand(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f5, f6);
                    f4 = f6;
                    f3 = f5;
                    f2 = f6;
                    f = f5;
                    break;
            }
            i = 2;
            int i2 = 0;
            while (true) {
                float f7 = f5;
                float f8 = f6;
                float f9 = f;
                float f10 = f2;
                int i3 = i2;
                if (i3 < fArr2.length) {
                    int i4;
                    int i5;
                    float f11;
                    float f12;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    switch (c2) {
                        case 'A':
                            i4 = i3 + 5;
                            i5 = i3 + 6;
                            drawArc(path, f9, f10, fArr2[i4], fArr2[i5], fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                            f11 = fArr2[i4];
                            f12 = fArr2[i5];
                            break;
                        case 'C':
                            i6 = i3 + 2;
                            i7 = i3 + 3;
                            i8 = i3 + 4;
                            i9 = i3 + 5;
                            path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                            f11 = fArr2[i8];
                            f12 = fArr2[i9];
                            f3 = fArr2[i6];
                            f4 = fArr2[i7];
                            f5 = f7;
                            f6 = f8;
                            f = f11;
                            f2 = f12;
                            break;
                        case 'H':
                            i10 = i3 + 0;
                            path.lineTo(fArr2[i10], f10);
                            f11 = fArr2[i10];
                            f5 = f7;
                            f6 = f8;
                            f = f11;
                            f2 = f10;
                            break;
                        case 'L':
                            i10 = i3 + 0;
                            i11 = i3 + 1;
                            path.lineTo(fArr2[i10], fArr2[i11]);
                            f11 = fArr2[i10];
                            f5 = f7;
                            f6 = f8;
                            f = f11;
                            f2 = fArr2[i11];
                            break;
                        case 'M':
                            i10 = i3 + 0;
                            f11 = fArr2[i10];
                            i12 = i3 + 1;
                            f12 = fArr2[i12];
                            if (i3 <= 0) {
                                path.moveTo(fArr2[i10], fArr2[i12]);
                                f5 = f11;
                                f6 = f12;
                                f = f11;
                                f2 = f12;
                                break;
                            }
                            path.lineTo(fArr2[i10], fArr2[i12]);
                            f5 = f7;
                            f6 = f8;
                            f = f11;
                            f2 = f12;
                            break;
                        case 'Q':
                            i13 = i3 + 0;
                            i14 = i3 + 1;
                            i11 = i3 + 2;
                            i2 = i3 + 3;
                            path.quadTo(fArr2[i13], fArr2[i14], fArr2[i11], fArr2[i2]);
                            f4 = fArr2[i13];
                            f6 = fArr2[i14];
                            f5 = fArr2[i11];
                            f2 = fArr2[i2];
                            f3 = f4;
                            f11 = f6;
                            f = f5;
                            break;
                        case 'S':
                            if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                f6 = (2.0f * f9) - f3;
                                f3 = (2.0f * f10) - f4;
                            } else {
                                f3 = f10;
                                f6 = f9;
                            }
                            i8 = i3 + 0;
                            i6 = i3 + 1;
                            i7 = i3 + 2;
                            i9 = i3 + 3;
                            path.cubicTo(f6, f3, fArr2[i8], fArr2[i6], fArr2[i7], fArr2[i9]);
                            f4 = fArr2[i8];
                            f6 = fArr2[i6];
                            f5 = fArr2[i7];
                            f2 = fArr2[i9];
                            f3 = f4;
                            f11 = f6;
                            f = f5;
                            break;
                        case 'T':
                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                f10 = (2.0f * f10) - f4;
                                f9 = (2.0f * f9) - f3;
                            }
                            i13 = i3 + 0;
                            i14 = i3 + 1;
                            path.quadTo(f9, f10, fArr2[i13], fArr2[i14]);
                            f11 = fArr2[i13];
                            f12 = fArr2[i14];
                            f5 = f7;
                            f6 = f8;
                            f4 = f10;
                            f3 = f9;
                            f = f11;
                            f2 = f12;
                            break;
                        case 'V':
                            i10 = i3 + 0;
                            path.lineTo(f9, fArr2[i10]);
                            f12 = fArr2[i10];
                            f5 = f7;
                            f6 = f8;
                            f = f9;
                            f2 = f12;
                            break;
                        case 'a':
                            i4 = i3 + 5;
                            i5 = i3 + 6;
                            drawArc(path, f9, f10, fArr2[i4] + f9, fArr2[i5] + f10, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                            f11 = fArr2[i4] + f9;
                            f12 = fArr2[i5] + f10;
                            break;
                        case 'c':
                            i8 = i3 + 2;
                            i6 = i3 + 3;
                            i7 = i3 + 4;
                            i4 = i3 + 5;
                            path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i8], fArr2[i6], fArr2[i7], fArr2[i4]);
                            f3 = fArr2[i8] + f9;
                            f4 = fArr2[i6] + f10;
                            f9 += fArr2[i7];
                            f5 = f10 + fArr2[i4];
                            break;
                        case 'h':
                            i10 = i3 + 0;
                            path.rLineTo(fArr2[i10], 0.0f);
                            f9 += fArr2[i10];
                            break;
                        case 'l':
                            i10 = i3 + 0;
                            i11 = i3 + 1;
                            path.rLineTo(fArr2[i10], fArr2[i11]);
                            f9 += fArr2[i10];
                            f10 += fArr2[i11];
                            break;
                        case 'm':
                            i11 = i3 + 0;
                            f6 = fArr2[i11] + f9;
                            int i15 = i3 + 1;
                            f5 = fArr2[i15] + f10;
                            if (i3 <= 0) {
                                path.rMoveTo(fArr2[i11], fArr2[i15]);
                                f7 = f6;
                                f8 = f5;
                                f9 = f6;
                                f10 = f5;
                                break;
                            }
                            path.rLineTo(fArr2[i11], fArr2[i15]);
                            f9 = f6;
                            f10 = f5;
                            break;
                        case 'q':
                            i13 = i3 + 0;
                            i12 = i3 + 1;
                            i11 = i3 + 2;
                            i2 = i3 + 3;
                            path.rQuadTo(fArr2[i13], fArr2[i12], fArr2[i11], fArr2[i2]);
                            f3 = fArr2[i13] + f9;
                            f4 = fArr2[i12] + f10;
                            f9 += fArr2[i11];
                            f5 = f10 + fArr2[i2];
                            break;
                        case 's':
                            if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                f6 = f9 - f3;
                                f3 = f10 - f4;
                            } else {
                                f6 = 0.0f;
                                f3 = 0.0f;
                            }
                            i8 = i3 + 0;
                            i6 = i3 + 1;
                            i7 = i3 + 2;
                            i4 = i3 + 3;
                            path.rCubicTo(f6, f3, fArr2[i8], fArr2[i6], fArr2[i7], fArr2[i4]);
                            f3 = fArr2[i8] + f9;
                            f4 = fArr2[i6] + f10;
                            f9 += fArr2[i7];
                            f5 = f10 + fArr2[i4];
                            break;
                        case 't':
                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                f4 = f10 - f4;
                                f3 = f9 - f3;
                            } else {
                                f4 = 0.0f;
                                f3 = 0.0f;
                            }
                            i10 = i3 + 0;
                            i11 = i3 + 1;
                            path.rQuadTo(f3, f4, fArr2[i10], fArr2[i11]);
                            f4 += f10;
                            f3 += f9;
                            f9 = fArr2[i10] + f9;
                            f10 = fArr2[i11] + f10;
                            break;
                        case 'v':
                            i10 = i3 + 0;
                            path.rLineTo(0.0f, fArr2[i10]);
                            f10 += fArr2[i10];
                            break;
                    }
                }
                fArr[0] = f9;
                fArr[1] = f10;
                fArr[2] = f3;
                fArr[3] = f4;
                fArr[4] = f7;
                fArr[5] = f8;
                return;
                i2 = i3 + i;
                c = c2;
            }
        }

        private static void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            int ceil = (int) Math.ceil(Math.abs((4.0d * d9) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d10 = -d3;
            double d11 = d10 * cos;
            double d12 = d4 * sin;
            double d13 = d10 * sin;
            double d14 = d4 * cos;
            double d15 = d9 / ((double) ceil);
            double d16 = (sin2 * d13) + (cos2 * d14);
            cos2 = (sin2 * d11) - (cos2 * d12);
            int i = 0;
            while (i < ceil) {
                double d17 = d8 + d15;
                d10 = Math.sin(d17);
                double cos3 = Math.cos(d17);
                double d18 = (((d3 * cos) * cos3) + d) - (d12 * d10);
                double d19 = (((d3 * sin) * cos3) + d2) + (d14 * d10);
                double d20 = (d11 * d10) - (d12 * cos3);
                cos3 = (cos3 * d14) + (d10 * d13);
                d10 = d17 - d8;
                double tan = Math.tan(d10 / 2.0d);
                tan = (Math.sin(d10) * (Math.sqrt((tan * (3.0d * tan)) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((cos2 * tan) + d5), (float) ((d16 * tan) + d6), (float) (d18 - (tan * d20)), (float) (d19 - (tan * cos3)), (float) d18, (float) d19);
                i++;
                d8 = d17;
                d16 = cos3;
                d6 = d19;
                cos2 = d20;
                d5 = d18;
            }
        }

        private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double toRadians = Math.toRadians((double) f7);
            double cos = Math.cos(toRadians);
            double sin = Math.sin(toRadians);
            double d = (double) f;
            double d2 = (double) f2;
            double d3 = (double) f5;
            double d4 = ((d * cos) + (d2 * sin)) / d3;
            double d5 = (double) f6;
            double d6 = ((((double) (-f)) * sin) + (d2 * cos)) / d5;
            double d7 = (double) f4;
            double d8 = ((((double) f3) * cos) + (d7 * sin)) / d3;
            double d9 = ((((double) (-f3)) * sin) + (d7 * cos)) / d5;
            double d10 = d4 - d8;
            d7 = d6 - d9;
            double d11 = (d4 + d8) / 2.0d;
            double d12 = (d6 + d9) / 2.0d;
            double d13 = (d10 * d10) + (d7 * d7);
            if (d13 == 0.0d) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d14 = (1.0d / d13) - 0.25d;
            if (d14 < 0.0d) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Points are too far apart ");
                stringBuilder.append(d13);
                Log.w(PathParser.LOGTAG, stringBuilder.toString());
                float sqrt = (float) (Math.sqrt(d13) / 1.99999d);
                drawArc(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            d13 = Math.sqrt(d14);
            d14 = d10 * d13;
            d10 = d13 * d7;
            if (z == z2) {
                d10 = d11 - d10;
                d7 = d12 + d14;
            } else {
                d10 += d11;
                d7 = d12 - d14;
            }
            d6 = Math.atan2(d6 - d7, d4 - d10);
            d8 = Math.atan2(d9 - d7, d8 - d10) - d6;
            int i = (d8 > 0.0d ? 1 : (d8 == 0.0d ? 0 : -1));
            if (z2 != (i >= 0)) {
                d8 = i > 0 ? d8 - 6.283185307179586d : d8 + 6.283185307179586d;
            }
            d10 *= d3;
            d4 = d7 * d5;
            arcToBezier(path, (d10 * cos) - (d4 * sin), (d4 * cos) + (d10 * sin), d3, d5, d, d2, toRadians, d6, d8);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                addCommand(path, fArr, c, pathDataNodeArr[i].mType, pathDataNodeArr[i].mParams);
                c = pathDataNodeArr[i].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            for (int i = 0; i < pathDataNode.mParams.length; i++) {
                this.mParams[i] = (pathDataNode.mParams[i] * (1.0f - f)) + (pathDataNode2.mParams[i] * f);
            }
        }
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        int i = 0;
        while (i < pathDataNodeArr.length) {
            if (pathDataNodeArr[i].mType != pathDataNodeArr2[i].mType || pathDataNodeArr[i].mParams.length != pathDataNodeArr2[i].mParams.length) {
                return false;
            }
            i++;
        }
        return true;
    }

    static float[] copyOfRange(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            length = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, length);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int nextStart = nextStart(str, i);
            String trim = str.substring(i2, nextStart).trim();
            if (trim.length() > 0) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i = nextStart + 1;
            i2 = nextStart;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            addNode(arrayList, str.charAt(i2), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] createNodesFromPathData = createNodesFromPathData(str);
        if (createNodesFromPathData == null) {
            return null;
        }
        try {
            PathDataNode.nodesToPath(createNodesFromPathData, path);
            return path;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error in parsing ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a A:{LOOP_END, LOOP:0: B:1:0x0008->B:22:0x003a} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0024 A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:10:0x0021, code skipped:
            r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void extract(String str, int i, ExtractFloatResult extractFloatResult) {
        extractFloatResult.mEndWithNegOrDot = false;
        boolean z = false;
        boolean z2 = false;
        int i2 = i;
        boolean z3 = false;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt != ' ') {
                if (charAt == 'E' || charAt == 'e') {
                    z3 = true;
                    if (z2) {
                        i2++;
                    } else {
                        extractFloatResult.mEndPosition = i2;
                    }
                }
                switch (charAt) {
                    case ',':
                        break;
                    case '-':
                        if (!(i2 == i || z3)) {
                            extractFloatResult.mEndWithNegOrDot = true;
                        }
                    case '.':
                        if (!z) {
                            z = true;
                            z3 = false;
                            break;
                        }
                        extractFloatResult.mEndWithNegOrDot = true;
                }
            }
            z2 = true;
            z3 = false;
            if (z2) {
            }
        }
        extractFloatResult.mEndPosition = i2;
    }

    private static float[] getFloats(String str) {
        int i = 0;
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i2 = 1;
            while (i2 < length) {
                extract(str, i2, extractFloatResult);
                int i3 = extractFloatResult.mEndPosition;
                if (i2 < i3) {
                    fArr[i] = Float.parseFloat(str.substring(i2, i3));
                    i++;
                }
                i2 = extractFloatResult.mEndWithNegOrDot ? i3 : i3 + 1;
            }
            return copyOfRange(fArr, 0, i);
        } catch (NumberFormatException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("error in parsing \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].mType = pathDataNodeArr2[i].mType;
            for (int i2 = 0; i2 < pathDataNodeArr2[i].mParams.length; i2++) {
                pathDataNodeArr[i].mParams[i2] = pathDataNodeArr2[i].mParams[i2];
            }
        }
    }
}
