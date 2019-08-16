package android.support.constraint.solver;

import java.util.Arrays;

public class SolverVariable {
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 6;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static int uniqueId = 1;
    public float computedValue;
    int definitionId;
    public int id;
    ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    private String mName;
    Type mType;
    public int strength;
    float[] strengthVector;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.strengthVector = new float[6];
        this.mClientEquations = new ArrayRow[8];
        this.mClientEquationsCount = 0;
        this.mType = type;
    }

    public SolverVariable(String str, Type type) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.strengthVector = new float[6];
        this.mClientEquations = new ArrayRow[8];
        this.mClientEquationsCount = 0;
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type) {
        uniqueId++;
        StringBuilder stringBuilder;
        switch (type) {
            case UNRESTRICTED:
                stringBuilder = new StringBuilder();
                stringBuilder.append("U");
                stringBuilder.append(uniqueId);
                return stringBuilder.toString();
            case CONSTANT:
                stringBuilder = new StringBuilder();
                stringBuilder.append("C");
                stringBuilder.append(uniqueId);
                return stringBuilder.toString();
            case SLACK:
                stringBuilder = new StringBuilder();
                stringBuilder.append("S");
                stringBuilder.append(uniqueId);
                return stringBuilder.toString();
            case ERROR:
                stringBuilder = new StringBuilder();
                stringBuilder.append("e");
                stringBuilder.append(uniqueId);
                return stringBuilder.toString();
            default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("V");
                stringBuilder.append(uniqueId);
                return stringBuilder.toString();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void addClientEquation(ArrayRow arrayRow) {
        int i = 0;
        while (i < this.mClientEquationsCount) {
            if (this.mClientEquations[i] != arrayRow) {
                i++;
            } else {
                return;
            }
        }
        if (this.mClientEquationsCount >= this.mClientEquations.length) {
            this.mClientEquations = (ArrayRow[]) Arrays.copyOf(this.mClientEquations, this.mClientEquations.length * 2);
        }
        this.mClientEquations[this.mClientEquationsCount] = arrayRow;
        this.mClientEquationsCount++;
    }

    /* Access modifiers changed, original: 0000 */
    public void clearStrengths() {
        for (int i = 0; i < 6; i++) {
            this.strengthVector[i] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    /* Access modifiers changed, original: 0000 */
    public void removeClientEquation(ArrayRow arrayRow) {
        int i = 0;
        for (int i2 = 0; i2 < this.mClientEquationsCount; i2++) {
            if (this.mClientEquations[i2] == arrayRow) {
                while (i < (this.mClientEquationsCount - i2) - 1) {
                    int i3 = i2 + i;
                    this.mClientEquations[i3] = this.mClientEquations[i3 + 1];
                    i++;
                }
                this.mClientEquationsCount--;
                return;
            }
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.definitionId = -1;
        this.computedValue = 0.0f;
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setType(Type type) {
        this.mType = type;
    }

    /* Access modifiers changed, original: 0000 */
    public String strengthsToString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this);
        stringBuilder.append("[");
        String stringBuilder2 = stringBuilder.toString();
        for (int i = 0; i < this.strengthVector.length; i++) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(this.strengthVector[i]);
            stringBuilder2 = stringBuilder3.toString();
            if (i < this.strengthVector.length - 1) {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append(", ");
                stringBuilder2 = stringBuilder3.toString();
            } else {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append("] ");
                stringBuilder2 = stringBuilder3.toString();
            }
        }
        return stringBuilder2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.mName);
        return stringBuilder.toString();
    }
}
