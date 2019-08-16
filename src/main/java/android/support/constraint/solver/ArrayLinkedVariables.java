package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable.Type;
import java.io.PrintStream;
import java.util.Arrays;

public class ArrayLinkedVariables {
    private static final boolean DEBUG = false;
    private static final int NONE = -1;
    private int ROW_SIZE = 8;
    private SolverVariable candidate = null;
    int currentSize = 0;
    private int[] mArrayIndices = new int[this.ROW_SIZE];
    private int[] mArrayNextIndices = new int[this.ROW_SIZE];
    private float[] mArrayValues = new float[this.ROW_SIZE];
    private final Cache mCache;
    private boolean mDidFillOnce = false;
    private int mHead = -1;
    private int mLast = -1;
    private final ArrayRow mRow;

    ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
    }

    public final void add(SolverVariable solverVariable, float f) {
        if (f != 0.0f) {
            if (this.mHead == -1) {
                this.mHead = 0;
                this.mArrayValues[this.mHead] = f;
                this.mArrayIndices[this.mHead] = solverVariable.id;
                this.mArrayNextIndices[this.mHead] = -1;
                this.currentSize++;
                if (!this.mDidFillOnce) {
                    this.mLast++;
                    return;
                }
                return;
            }
            int i = this.mHead;
            int i2 = -1;
            int i3 = 0;
            while (i != -1 && i3 < this.currentSize) {
                int i4 = this.mArrayIndices[i];
                if (i4 == solverVariable.id) {
                    float[] fArr = this.mArrayValues;
                    fArr[i] = fArr[i] + f;
                    if (this.mArrayValues[i] == 0.0f) {
                        if (i == this.mHead) {
                            this.mHead = this.mArrayNextIndices[i];
                        } else {
                            this.mArrayNextIndices[i2] = this.mArrayNextIndices[i];
                        }
                        this.mCache.mIndexedVariables[i4].removeClientEquation(this.mRow);
                        if (this.mDidFillOnce) {
                            this.mLast = i;
                        }
                        this.currentSize--;
                        return;
                    }
                    return;
                }
                if (this.mArrayIndices[i] < solverVariable.id) {
                    i2 = i;
                }
                i = this.mArrayNextIndices[i];
                i3++;
            }
            i = this.mLast + 1;
            if (this.mDidFillOnce) {
                i = this.mArrayIndices[this.mLast] == -1 ? this.mLast : this.mArrayIndices.length;
            }
            if (i >= this.mArrayIndices.length && this.currentSize < this.mArrayIndices.length) {
                for (i3 = 0; i3 < this.mArrayIndices.length; i3++) {
                    if (this.mArrayIndices[i3] == -1) {
                        i = i3;
                        break;
                    }
                }
            }
            if (i >= this.mArrayIndices.length) {
                i = this.mArrayIndices.length;
                this.ROW_SIZE *= 2;
                this.mDidFillOnce = false;
                this.mLast = i - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, this.ROW_SIZE);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
            }
            this.mArrayIndices[i] = solverVariable.id;
            this.mArrayValues[i] = f;
            if (i2 != -1) {
                this.mArrayNextIndices[i] = this.mArrayNextIndices[i2];
                this.mArrayNextIndices[i2] = i;
            } else {
                this.mArrayNextIndices[i] = this.mHead;
                this.mHead = i;
            }
            this.currentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            if (this.mLast >= this.mArrayIndices.length) {
                this.mDidFillOnce = true;
                this.mLast = this.mArrayIndices.length - 1;
            }
        }
    }

    public final void clear() {
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.currentSize = 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean containsKey(SolverVariable solverVariable) {
        if (this.mHead == -1) {
            return false;
        }
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                return true;
            }
            i = this.mArrayNextIndices[i];
            i2++;
        }
        return false;
    }

    public void display() {
        int i = this.currentSize;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable variable = getVariable(i2);
            if (variable != null) {
                PrintStream printStream = System.out;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(variable);
                stringBuilder.append(" = ");
                stringBuilder.append(getVariableValue(i2));
                stringBuilder.append(" ");
                printStream.print(stringBuilder.toString());
            }
        }
        System.out.println(" }");
    }

    /* Access modifiers changed, original: 0000 */
    public void divideByAmount(float f) {
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            float[] fArr = this.mArrayValues;
            fArr[i] = fArr[i] / f;
            i = this.mArrayNextIndices[i];
            i2++;
        }
    }

    public final float get(SolverVariable solverVariable) {
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                return this.mArrayValues[i];
            }
            i = this.mArrayNextIndices[i];
            i2++;
        }
        return 0.0f;
    }

    /* Access modifiers changed, original: 0000 */
    public SolverVariable getPivotCandidate() {
        if (this.candidate != null) {
            return this.candidate;
        }
        int i = this.mHead;
        int i2 = 0;
        SolverVariable solverVariable = null;
        while (true) {
            int i3 = i;
            if (i3 == -1 || i2 >= this.currentSize) {
                return solverVariable;
            }
            if (this.mArrayValues[i3] < 0.0f) {
                SolverVariable solverVariable2 = this.mCache.mIndexedVariables[this.mArrayIndices[i3]];
                if (solverVariable == null || solverVariable.strength < solverVariable2.strength) {
                    solverVariable = solverVariable2;
                }
            }
            i = this.mArrayNextIndices[i3];
            i2++;
        }
    }

    /* Access modifiers changed, original: final */
    public final SolverVariable getVariable(int i) {
        int i2 = this.mHead;
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            if (i3 == i) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i2]];
            }
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final float getVariableValue(int i) {
        int i2 = this.mHead;
        int i3 = 0;
        while (i2 != -1 && i3 < this.currentSize) {
            if (i3 == i) {
                return this.mArrayValues[i2];
            }
            i2 = this.mArrayNextIndices[i2];
            i3++;
        }
        return 0.0f;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasAtLeastOnePositiveVariable() {
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            if (this.mArrayValues[i] > 0.0f) {
                return true;
            }
            i = this.mArrayNextIndices[i];
            i2++;
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void invert() {
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            float[] fArr = this.mArrayValues;
            fArr[i] = fArr[i] * -1.0f;
            i = this.mArrayNextIndices[i];
            i2++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004b A:{SYNTHETIC} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SolverVariable pickPivotCandidate() {
        int i = 0;
        SolverVariable solverVariable = null;
        SolverVariable solverVariable2 = null;
        int i2 = this.mHead;
        while (i2 != -1 && i < this.currentSize) {
            float f;
            float f2 = this.mArrayValues[i2];
            if (f2 < 0.0f) {
                if (f2 > -0.001f) {
                    this.mArrayValues[i2] = 0.0f;
                }
                f = f2;
                if (f != 0.0f) {
                    SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i2]];
                    if (solverVariable3.mType == Type.UNRESTRICTED) {
                        if (f < 0.0f) {
                            return solverVariable3;
                        }
                        if (solverVariable == null) {
                            solverVariable = solverVariable3;
                        }
                    } else if (f < 0.0f && (solverVariable2 == null || solverVariable3.strength < solverVariable2.strength)) {
                        solverVariable2 = solverVariable3;
                    }
                }
                i2 = this.mArrayNextIndices[i2];
                i++;
            } else {
                if (f2 < 0.001f) {
                    this.mArrayValues[i2] = 0.0f;
                }
                f = f2;
                if (f != 0.0f) {
                }
                i2 = this.mArrayNextIndices[i2];
                i++;
            }
            f = 0.0f;
            if (f != 0.0f) {
            }
            i2 = this.mArrayNextIndices[i2];
            i++;
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    public final void put(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            remove(solverVariable);
        } else if (this.mHead == -1) {
            this.mHead = 0;
            this.mArrayValues[this.mHead] = f;
            this.mArrayIndices[this.mHead] = solverVariable.id;
            this.mArrayNextIndices[this.mHead] = -1;
            this.currentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
        } else {
            int i = this.mHead;
            int i2 = -1;
            int i3 = 0;
            while (i != -1 && i3 < this.currentSize) {
                if (this.mArrayIndices[i] == solverVariable.id) {
                    this.mArrayValues[i] = f;
                    return;
                }
                if (this.mArrayIndices[i] < solverVariable.id) {
                    i2 = i;
                }
                i = this.mArrayNextIndices[i];
                i3++;
            }
            i = this.mLast + 1;
            if (this.mDidFillOnce) {
                i = this.mArrayIndices[this.mLast] == -1 ? this.mLast : this.mArrayIndices.length;
            }
            if (i >= this.mArrayIndices.length && this.currentSize < this.mArrayIndices.length) {
                for (i3 = 0; i3 < this.mArrayIndices.length; i3++) {
                    if (this.mArrayIndices[i3] == -1) {
                        i = i3;
                        break;
                    }
                }
            }
            if (i >= this.mArrayIndices.length) {
                i = this.mArrayIndices.length;
                this.ROW_SIZE *= 2;
                this.mDidFillOnce = false;
                this.mLast = i - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, this.ROW_SIZE);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
            }
            this.mArrayIndices[i] = solverVariable.id;
            this.mArrayValues[i] = f;
            if (i2 != -1) {
                this.mArrayNextIndices[i] = this.mArrayNextIndices[i2];
                this.mArrayNextIndices[i2] = i;
            } else {
                this.mArrayNextIndices[i] = this.mHead;
                this.mHead = i;
            }
            this.currentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            if (this.currentSize >= this.mArrayIndices.length) {
                this.mDidFillOnce = true;
            }
        }
    }

    public final float remove(SolverVariable solverVariable) {
        if (this.candidate == solverVariable) {
            this.candidate = null;
        }
        if (this.mHead == -1) {
            return 0.0f;
        }
        int i = this.mHead;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.currentSize) {
            int i4 = this.mArrayIndices[i];
            if (i4 == solverVariable.id) {
                if (i == this.mHead) {
                    this.mHead = this.mArrayNextIndices[i];
                } else {
                    this.mArrayNextIndices[i3] = this.mArrayNextIndices[i];
                }
                this.mCache.mIndexedVariables[i4].removeClientEquation(this.mRow);
                this.currentSize--;
                this.mArrayIndices[i] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = i;
                }
                return this.mArrayValues[i];
            }
            i2++;
            i3 = i;
            i = this.mArrayNextIndices[i];
        }
        return 0.0f;
    }

    /* Access modifiers changed, original: 0000 */
    public int sizeInBytes() {
        return (((this.mArrayIndices.length * 4) * 3) + 0) + 36;
    }

    public String toString() {
        String str = "";
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" -> ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.mArrayValues[i]);
            stringBuilder.append(" : ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.mCache.mIndexedVariables[this.mArrayIndices[i]]);
            str = stringBuilder.toString();
            i = this.mArrayNextIndices[i];
            i2++;
        }
        return str;
    }

    /* Access modifiers changed, original: 0000 */
    public void updateClientEquations(ArrayRow arrayRow) {
        int i = this.mHead;
        int i2 = 0;
        while (i != -1 && i2 < this.currentSize) {
            this.mCache.mIndexedVariables[this.mArrayIndices[i]].addClientEquation(arrayRow);
            i = this.mArrayNextIndices[i];
            i2++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void updateFromRow(ArrayRow arrayRow, ArrayRow arrayRow2) {
        int i = this.mHead;
        while (true) {
            int i2 = 0;
            int i3 = i;
            while (i3 != -1 && i2 < this.currentSize) {
                if (this.mArrayIndices[i3] == arrayRow2.variable.id) {
                    float f = this.mArrayValues[i3];
                    remove(arrayRow2.variable);
                    ArrayLinkedVariables arrayLinkedVariables = arrayRow2.variables;
                    i = arrayLinkedVariables.mHead;
                    i2 = 0;
                    while (i != -1 && i2 < arrayLinkedVariables.currentSize) {
                        add(this.mCache.mIndexedVariables[arrayLinkedVariables.mArrayIndices[i]], arrayLinkedVariables.mArrayValues[i] * f);
                        i = arrayLinkedVariables.mArrayNextIndices[i];
                        i2++;
                    }
                    arrayRow.constantValue += arrayRow2.constantValue * f;
                    arrayRow2.variable.removeClientEquation(arrayRow);
                    i = this.mHead;
                } else {
                    i3 = this.mArrayNextIndices[i3];
                    i2++;
                }
            }
            return;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void updateFromSystem(ArrayRow arrayRow, ArrayRow[] arrayRowArr) {
        int i = this.mHead;
        while (true) {
            int i2 = 0;
            int i3 = i;
            while (i3 != -1 && i2 < this.currentSize) {
                SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i3]];
                if (solverVariable.definitionId != -1) {
                    float f = this.mArrayValues[i3];
                    remove(solverVariable);
                    ArrayRow arrayRow2 = arrayRowArr[solverVariable.definitionId];
                    if (!arrayRow2.isSimpleDefinition) {
                        ArrayLinkedVariables arrayLinkedVariables = arrayRow2.variables;
                        i = arrayLinkedVariables.mHead;
                        i2 = 0;
                        while (i != -1 && i2 < arrayLinkedVariables.currentSize) {
                            add(this.mCache.mIndexedVariables[arrayLinkedVariables.mArrayIndices[i]], arrayLinkedVariables.mArrayValues[i] * f);
                            i = arrayLinkedVariables.mArrayNextIndices[i];
                            i2++;
                        }
                    }
                    arrayRow.constantValue += arrayRow2.constantValue * f;
                    arrayRow2.variable.removeClientEquation(arrayRow);
                    i = this.mHead;
                } else {
                    i3 = this.mArrayNextIndices[i3];
                    i2++;
                }
            }
            return;
        }
    }
}
