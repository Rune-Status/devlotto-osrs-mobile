package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable.Type;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import com.appsflyer.share.Constants;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

public class LinearSystem {
    private static final boolean DEBUG = false;
    private static int POOL_SIZE = 1000;
    private int TABLE_SIZE;
    private boolean[] mAlreadyTestedCandidates;
    final Cache mCache;
    private Goal mGoal;
    private int mMaxColumns;
    private int mMaxRows;
    int mNumColumns;
    private int mNumRows;
    private SolverVariable[] mPoolVariables;
    private int mPoolVariablesCount;
    private ArrayRow[] mRows;
    private HashMap<String, SolverVariable> mVariables;
    int mVariablesID;
    private ArrayRow[] tempClientsCopy;

    public LinearSystem() {
        this.mVariablesID = 0;
        this.mVariables = null;
        this.mGoal = new Goal();
        this.TABLE_SIZE = 32;
        this.mMaxColumns = this.TABLE_SIZE;
        this.mRows = null;
        this.mAlreadyTestedCandidates = new boolean[this.TABLE_SIZE];
        this.mNumColumns = 1;
        this.mNumRows = 0;
        this.mMaxRows = this.TABLE_SIZE;
        this.mPoolVariables = new SolverVariable[POOL_SIZE];
        this.mPoolVariablesCount = 0;
        this.tempClientsCopy = new ArrayRow[this.TABLE_SIZE];
        this.mRows = new ArrayRow[this.TABLE_SIZE];
        releaseRows();
        this.mCache = new Cache();
    }

    private SolverVariable acquireSolverVariable(Type type) {
        SolverVariable solverVariable;
        SolverVariable solverVariable2 = (SolverVariable) this.mCache.solverVariablePool.acquire();
        if (solverVariable2 == null) {
            solverVariable = new SolverVariable(type);
        } else {
            solverVariable2.reset();
            solverVariable2.setType(type);
            solverVariable = solverVariable2;
        }
        if (this.mPoolVariablesCount >= POOL_SIZE) {
            POOL_SIZE *= 2;
            this.mPoolVariables = (SolverVariable[]) Arrays.copyOf(this.mPoolVariables, POOL_SIZE);
        }
        SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i = this.mPoolVariablesCount;
        this.mPoolVariablesCount = i + 1;
        solverVariableArr[i] = solverVariable;
        return solverVariable;
    }

    private void addError(ArrayRow arrayRow) {
        arrayRow.addError(createErrorVariable(), createErrorVariable());
    }

    private void addSingleError(ArrayRow arrayRow, int i) {
        arrayRow.addSingleError(createErrorVariable(), i);
    }

    private void computeValues() {
        for (int i = 0; i < this.mNumRows; i++) {
            ArrayRow arrayRow = this.mRows[i];
            arrayRow.variable.computedValue = arrayRow.constantValue;
        }
    }

    public static ArrayRow createRowCentering(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, boolean z) {
        ArrayRow createRow = linearSystem.createRow();
        createRow.createRowCentering(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (z) {
            SolverVariable createErrorVariable = linearSystem.createErrorVariable();
            SolverVariable createErrorVariable2 = linearSystem.createErrorVariable();
            createErrorVariable.strength = 4;
            createErrorVariable2.strength = 4;
            createRow.addError(createErrorVariable, createErrorVariable2);
        }
        return createRow;
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f, boolean z) {
        ArrayRow createRow = linearSystem.createRow();
        if (z) {
            linearSystem.addError(createRow);
        }
        return createRow.createRowDimensionPercent(solverVariable, solverVariable2, solverVariable3, f);
    }

    public static ArrayRow createRowEquals(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        ArrayRow createRow = linearSystem.createRow();
        createRow.createRowEquals(solverVariable, solverVariable2, i);
        if (z) {
            linearSystem.addSingleError(createRow, 1);
        }
        return createRow;
    }

    public static ArrayRow createRowGreaterThan(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        SolverVariable createSlackVariable = linearSystem.createSlackVariable();
        ArrayRow createRow = linearSystem.createRow();
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i);
        if (z) {
            linearSystem.addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * -1.0f));
        }
        return createRow;
    }

    public static ArrayRow createRowLowerThan(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        SolverVariable createSlackVariable = linearSystem.createSlackVariable();
        ArrayRow createRow = linearSystem.createRow();
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i);
        if (z) {
            linearSystem.addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * -1.0f));
        }
        return createRow;
    }

    private SolverVariable createVariable(String str, Type type) {
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(type);
        acquireSolverVariable.setName(str);
        this.mVariablesID++;
        this.mNumColumns++;
        acquireSolverVariable.id = this.mVariablesID;
        if (this.mVariables == null) {
            this.mVariables = new HashMap();
        }
        this.mVariables.put(str, acquireSolverVariable);
        this.mCache.mIndexedVariables[this.mVariablesID] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    private void displayRows() {
        displaySolverVariables();
        String str = "";
        for (int i = 0; i < this.mNumRows; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.mRows[i]);
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("\n");
            str = stringBuilder.toString();
        }
        if (this.mGoal.variables.size() != 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(this.mGoal);
            stringBuilder2.append("\n");
            str = stringBuilder2.toString();
        }
        System.out.println(str);
    }

    private void displaySolverVariables() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Display Rows (");
        stringBuilder.append(this.mNumRows);
        stringBuilder.append("x");
        stringBuilder.append(this.mNumColumns);
        stringBuilder.append(") :\n\t | C | ");
        String stringBuilder2 = stringBuilder.toString();
        for (int i = 1; i <= this.mNumColumns; i++) {
            Object obj = this.mCache.mIndexedVariables[i];
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(obj);
            stringBuilder2 = stringBuilder3.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append(" | ");
            stringBuilder2 = stringBuilder4.toString();
        }
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append("\n");
        System.out.println(stringBuilder5.toString());
    }

    private int enforceBFS(Goal goal) throws Exception {
        Object obj;
        int i;
        int i2 = 0;
        while (i2 < this.mNumRows) {
            if (this.mRows[i2].variable.mType != Type.UNRESTRICTED && this.mRows[i2].constantValue < 0.0f) {
                obj = 1;
                break;
            }
            i2++;
        }
        obj = null;
        if (obj != null) {
            i2 = 0;
            Object obj2 = null;
            while (obj2 == null) {
                int i3 = i2 + 1;
                int i4 = -1;
                int i5 = -1;
                float f = Float.MAX_VALUE;
                i = 0;
                for (i2 = 0; i2 < this.mNumRows; i2++) {
                    ArrayRow arrayRow = this.mRows[i2];
                    if (arrayRow.variable.mType != Type.UNRESTRICTED && arrayRow.constantValue < 0.0f) {
                        int i6 = 1;
                        int i7 = i;
                        float f2 = f;
                        while (i6 < this.mNumColumns) {
                            int i8;
                            SolverVariable solverVariable = this.mCache.mIndexedVariables[i6];
                            float f3 = arrayRow.variables.get(solverVariable);
                            if (f3 <= 0.0f) {
                                i8 = i7;
                            } else {
                                float f4;
                                i8 = 0;
                                int i9 = i5;
                                i = i7;
                                while (true) {
                                    f4 = f2;
                                    if (i8 >= 6) {
                                        break;
                                    }
                                    f2 = solverVariable.strengthVector[i8] / f3;
                                    if ((f2 >= f4 || i8 != i) && i8 <= i) {
                                        i5 = i4;
                                        i7 = i9;
                                        f2 = f4;
                                    } else {
                                        i = i8;
                                        i5 = i2;
                                        i7 = i6;
                                    }
                                    i8++;
                                    i4 = i5;
                                    i9 = i7;
                                }
                                i5 = i9;
                                i8 = i;
                                f2 = f4;
                            }
                            i6++;
                            i7 = i8;
                        }
                        i = i7;
                        f = f2;
                    }
                }
                if (i4 != -1) {
                    ArrayRow arrayRow2 = this.mRows[i4];
                    arrayRow2.variable.definitionId = -1;
                    arrayRow2.pivot(this.mCache.mIndexedVariables[i5]);
                    arrayRow2.variable.definitionId = i4;
                    for (i2 = 0; i2 < this.mNumRows; i2++) {
                        this.mRows[i2].updateRowWithEquation(arrayRow2);
                    }
                    goal.updateFromSystem(this);
                    i2 = i3;
                } else {
                    obj2 = 1;
                    i2 = i3;
                }
            }
        } else {
            i2 = 0;
        }
        i = 0;
        while (i < this.mNumRows && (this.mRows[i].variable.mType == Type.UNRESTRICTED || this.mRows[i].constantValue >= 0.0f)) {
            i++;
        }
        return i2;
    }

    private String getDisplaySize(int i) {
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        StringBuilder stringBuilder;
        if (i4 > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i4);
            stringBuilder.append(" Mb");
            return stringBuilder.toString();
        } else if (i3 > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i3);
            stringBuilder.append(" Kb");
            return stringBuilder.toString();
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("");
            stringBuilder2.append(i2);
            stringBuilder2.append(" bytes");
            return stringBuilder2.toString();
        }
    }

    private void increaseTableSize() {
        this.TABLE_SIZE *= 2;
        this.mRows = (ArrayRow[]) Arrays.copyOf(this.mRows, this.TABLE_SIZE);
        this.mCache.mIndexedVariables = (SolverVariable[]) Arrays.copyOf(this.mCache.mIndexedVariables, this.TABLE_SIZE);
        this.mAlreadyTestedCandidates = new boolean[this.TABLE_SIZE];
        this.mMaxColumns = this.TABLE_SIZE;
        this.mMaxRows = this.TABLE_SIZE;
        this.mGoal.variables.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int optimize(Goal goal) {
        int i;
        for (i = 0; i < this.mNumColumns; i++) {
            this.mAlreadyTestedCandidates[i] = false;
        }
        int i2 = 0;
        i = 0;
        boolean z = false;
        while (!z) {
            SolverVariable solverVariable;
            boolean z2;
            int i3;
            int i4 = i + 1;
            SolverVariable pivotCandidate = goal.getPivotCandidate();
            if (pivotCandidate != null) {
                if (this.mAlreadyTestedCandidates[pivotCandidate.id]) {
                    solverVariable = null;
                    z2 = z;
                    i3 = i2;
                } else {
                    this.mAlreadyTestedCandidates[pivotCandidate.id] = true;
                    i2++;
                    if (i2 >= this.mNumColumns) {
                        solverVariable = pivotCandidate;
                        z2 = true;
                        i3 = i2;
                    }
                }
                if (solverVariable != null) {
                    float f = Float.MAX_VALUE;
                    i = -1;
                    for (int i5 = 0; i5 < this.mNumRows; i5++) {
                        ArrayRow arrayRow = this.mRows[i5];
                        if (arrayRow.variable.mType != Type.UNRESTRICTED && arrayRow.hasVariable(solverVariable)) {
                            float f2 = arrayRow.variables.get(solverVariable);
                            if (f2 < 0.0f) {
                                float f3 = (-arrayRow.constantValue) / f2;
                                if (f3 < f) {
                                    i = i5;
                                    f = f3;
                                }
                            }
                        }
                    }
                    if (i > -1) {
                        ArrayRow arrayRow2 = this.mRows[i];
                        arrayRow2.variable.definitionId = -1;
                        arrayRow2.pivot(solverVariable);
                        arrayRow2.variable.definitionId = i;
                        for (i = 0; i < this.mNumRows; i++) {
                            this.mRows[i].updateRowWithEquation(arrayRow2);
                        }
                        goal.updateFromSystem(this);
                        try {
                            enforceBFS(goal);
                            i2 = i3;
                            i = i4;
                            z = z2;
                        } catch (Exception e) {
                            e.printStackTrace();
                            i2 = i3;
                            i = i4;
                            z = z2;
                        }
                    }
                }
                i2 = i3;
                i = i4;
                z = true;
            }
            solverVariable = pivotCandidate;
            z2 = z;
            i3 = i2;
            if (solverVariable != null) {
            }
            i2 = i3;
            i = i4;
            z = true;
        }
        return i;
    }

    private void releaseRows() {
        for (int i = 0; i < this.mRows.length; i++) {
            Object obj = this.mRows[i];
            if (obj != null) {
                this.mCache.arrayRowPool.release(obj);
            }
            this.mRows[i] = null;
        }
    }

    private void updateRowFromVariables(ArrayRow arrayRow) {
        if (this.mNumRows > 0) {
            arrayRow.variables.updateFromSystem(arrayRow, this.mRows);
            if (arrayRow.variables.currentSize == 0) {
                arrayRow.isSimpleDefinition = true;
            }
        }
    }

    public void addCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        ArrayRow createRow = createRow();
        createRow.createRowCentering(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        SolverVariable createErrorVariable = createErrorVariable();
        SolverVariable createErrorVariable2 = createErrorVariable();
        createErrorVariable.strength = i3;
        createErrorVariable2.strength = i3;
        createRow.addError(createErrorVariable, createErrorVariable2);
        addConstraint(createRow);
    }

    public void addConstraint(ArrayRow arrayRow) {
        int i = 0;
        if (arrayRow != null) {
            if (this.mNumRows + 1 >= this.mMaxRows || this.mNumColumns + 1 >= this.mMaxColumns) {
                increaseTableSize();
            }
            if (!arrayRow.isSimpleDefinition) {
                updateRowFromVariables(arrayRow);
                arrayRow.ensurePositiveConstant();
                arrayRow.pickRowVariable();
                if (!arrayRow.hasKeyVariable()) {
                    return;
                }
            }
            if (this.mRows[this.mNumRows] != null) {
                this.mCache.arrayRowPool.release(this.mRows[this.mNumRows]);
            }
            if (!arrayRow.isSimpleDefinition) {
                arrayRow.updateClientEquations();
            }
            this.mRows[this.mNumRows] = arrayRow;
            arrayRow.variable.definitionId = this.mNumRows;
            this.mNumRows++;
            int i2 = arrayRow.variable.mClientEquationsCount;
            if (i2 > 0) {
                while (this.tempClientsCopy.length < i2) {
                    this.tempClientsCopy = new ArrayRow[(this.tempClientsCopy.length * 2)];
                }
                ArrayRow[] arrayRowArr = this.tempClientsCopy;
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayRowArr[i3] = arrayRow.variable.mClientEquations[i3];
                }
                while (i < i2) {
                    ArrayRow arrayRow2 = arrayRowArr[i];
                    if (arrayRow2 != arrayRow) {
                        arrayRow2.variables.updateFromRow(arrayRow2, arrayRow);
                        arrayRow2.updateClientEquations();
                    }
                    i++;
                }
            }
        }
    }

    public ArrayRow addEquality(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow createRow = createRow();
        createRow.createRowEquals(solverVariable, solverVariable2, i);
        SolverVariable createErrorVariable = createErrorVariable();
        SolverVariable createErrorVariable2 = createErrorVariable();
        createErrorVariable.strength = i2;
        createErrorVariable2.strength = i2;
        createRow.addError(createErrorVariable, createErrorVariable2);
        addConstraint(createRow);
        return createRow;
    }

    public void addEquality(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.definitionId;
        ArrayRow arrayRow;
        if (solverVariable.definitionId != -1) {
            arrayRow = this.mRows[i2];
            if (arrayRow.isSimpleDefinition) {
                arrayRow.constantValue = (float) i;
                return;
            }
            arrayRow = createRow();
            arrayRow.createRowEquals(solverVariable, i);
            addConstraint(arrayRow);
            return;
        }
        arrayRow = createRow();
        arrayRow.createRowDefinition(solverVariable, i);
        addConstraint(arrayRow);
    }

    public void addGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = i2;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i);
        addConstraint(createRow);
    }

    public void addLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = i2;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i);
        addConstraint(createRow);
    }

    public SolverVariable createErrorVariable() {
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(Type.ERROR);
        this.mVariablesID++;
        this.mNumColumns++;
        acquireSolverVariable.id = this.mVariablesID;
        this.mCache.mIndexedVariables[this.mVariablesID] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public SolverVariable createObjectVariable(Object obj) {
        SolverVariable solverVariable = null;
        if (obj != null) {
            if (this.mNumColumns + 1 >= this.mMaxColumns) {
                increaseTableSize();
            }
            if (obj instanceof ConstraintAnchor) {
                ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
                solverVariable = constraintAnchor.getSolverVariable();
                if (solverVariable == null) {
                    constraintAnchor.resetSolverVariable(this.mCache);
                    solverVariable = constraintAnchor.getSolverVariable();
                }
                if (solverVariable.id == -1 || solverVariable.id > this.mVariablesID || this.mCache.mIndexedVariables[solverVariable.id] == null) {
                    if (solverVariable.id != -1) {
                        solverVariable.reset();
                    }
                    this.mVariablesID++;
                    this.mNumColumns++;
                    solverVariable.id = this.mVariablesID;
                    solverVariable.mType = Type.UNRESTRICTED;
                    this.mCache.mIndexedVariables[this.mVariablesID] = solverVariable;
                }
            }
        }
        return solverVariable;
    }

    public ArrayRow createRow() {
        ArrayRow arrayRow = (ArrayRow) this.mCache.arrayRowPool.acquire();
        if (arrayRow == null) {
            return new ArrayRow(this.mCache);
        }
        arrayRow.reset();
        return arrayRow;
    }

    public SolverVariable createSlackVariable() {
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(Type.SLACK);
        this.mVariablesID++;
        this.mNumColumns++;
        acquireSolverVariable.id = this.mVariablesID;
        this.mCache.mIndexedVariables[this.mVariablesID] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    /* Access modifiers changed, original: 0000 */
    public void displayReadableRows() {
        displaySolverVariables();
        String str = "";
        for (int i = 0; i < this.mNumRows; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.mRows[i].toReadableString());
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("\n");
            str = stringBuilder.toString();
        }
        if (this.mGoal != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(this.mGoal);
            stringBuilder2.append("\n");
            str = stringBuilder2.toString();
        }
        System.out.println(str);
    }

    /* Access modifiers changed, original: 0000 */
    public void displaySystemInformations() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.TABLE_SIZE; i++) {
            if (this.mRows[i] != null) {
                i2 += this.mRows[i].sizeInBytes();
            }
        }
        i = 0;
        for (int i3 = 0; i3 < this.mNumRows; i3++) {
            if (this.mRows[i3] != null) {
                i += this.mRows[i3].sizeInBytes();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Linear System -> Table size: ");
        stringBuilder.append(this.TABLE_SIZE);
        stringBuilder.append(" (");
        stringBuilder.append(getDisplaySize(this.TABLE_SIZE * this.TABLE_SIZE));
        stringBuilder.append(") -- row sizes: ");
        stringBuilder.append(getDisplaySize(i2));
        stringBuilder.append(", actual size: ");
        stringBuilder.append(getDisplaySize(i));
        stringBuilder.append(" rows: ");
        stringBuilder.append(this.mNumRows);
        stringBuilder.append(Constants.URL_PATH_DELIMITER);
        stringBuilder.append(this.mMaxRows);
        stringBuilder.append(" cols: ");
        stringBuilder.append(this.mNumColumns);
        stringBuilder.append(Constants.URL_PATH_DELIMITER);
        stringBuilder.append(this.mMaxColumns);
        stringBuilder.append(" ");
        stringBuilder.append(0);
        stringBuilder.append(" occupied cells, ");
        stringBuilder.append(getDisplaySize(0));
        printStream.println(stringBuilder.toString());
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        String str = "";
        for (int i = 0; i < this.mNumRows; i++) {
            if (this.mRows[i].variable.mType == Type.UNRESTRICTED) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.mRows[i].toReadableString());
                str = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("\n");
                str = stringBuilder.toString();
            }
        }
        if (this.mGoal.variables.size() != 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(this.mGoal);
            stringBuilder2.append("\n");
            str = stringBuilder2.toString();
        }
        System.out.println(str);
    }

    public Cache getCache() {
        return this.mCache;
    }

    /* Access modifiers changed, original: 0000 */
    public Goal getGoal() {
        return this.mGoal;
    }

    public int getMemoryUsed() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i3 >= this.mNumRows) {
                return i2;
            }
            if (this.mRows[i3] != null) {
                i2 += this.mRows[i3].sizeInBytes();
            }
            i = i3 + 1;
        }
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    public int getObjectVariableValue(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).getSolverVariable();
        return solverVariable != null ? (int) (solverVariable.computedValue + 0.5f) : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public ArrayRow getRow(int i) {
        return this.mRows[i];
    }

    /* Access modifiers changed, original: 0000 */
    public float getValueFor(String str) {
        SolverVariable variable = getVariable(str, Type.UNRESTRICTED);
        return variable == null ? 0.0f : variable.computedValue;
    }

    /* Access modifiers changed, original: 0000 */
    public SolverVariable getVariable(String str, Type type) {
        if (this.mVariables == null) {
            this.mVariables = new HashMap();
        }
        SolverVariable solverVariable = (SolverVariable) this.mVariables.get(str);
        return solverVariable == null ? createVariable(str, type) : solverVariable;
    }

    public void minimize() throws Exception {
        minimizeGoal(this.mGoal);
    }

    /* Access modifiers changed, original: 0000 */
    public void minimizeGoal(Goal goal) throws Exception {
        goal.updateFromSystem(this);
        enforceBFS(goal);
        optimize(goal);
        computeValues();
    }

    /* Access modifiers changed, original: 0000 */
    public void rebuildGoalFromErrors() {
        this.mGoal.updateFromSystem(this);
    }

    public void reset() {
        int i;
        for (SolverVariable solverVariable : this.mCache.mIndexedVariables) {
            if (solverVariable != null) {
                solverVariable.reset();
            }
        }
        this.mCache.solverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        Arrays.fill(this.mCache.mIndexedVariables, null);
        if (this.mVariables != null) {
            this.mVariables.clear();
        }
        this.mVariablesID = 0;
        this.mGoal.variables.clear();
        this.mNumColumns = 1;
        for (i = 0; i < this.mNumRows; i++) {
            this.mRows[i].used = false;
        }
        releaseRows();
        this.mNumRows = 0;
    }
}
