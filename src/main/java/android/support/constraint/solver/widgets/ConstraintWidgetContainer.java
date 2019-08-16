package android.support.constraint.solver.widgets;

import android.support.constraint.solver.ArrayRow;
import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;
import java.util.Arrays;

public class ConstraintWidgetContainer extends WidgetContainer {
    static boolean ALLOW_ROOT_GROUP = true;
    private static final int CHAIN_FIRST = 0;
    private static final int CHAIN_FIRST_VISIBLE = 2;
    private static final int CHAIN_LAST = 1;
    private static final int CHAIN_LAST_VISIBLE = 3;
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final boolean DEBUG_OPTIMIZE = false;
    private static final int FLAG_CHAIN_DANGLING = 1;
    private static final int FLAG_CHAIN_OPTIMIZE = 0;
    private static final int FLAG_RECOMPUTE_BOUNDS = 2;
    private static final int MAX_ITERATIONS = 8;
    public static final int OPTIMIZATION_ALL = 2;
    public static final int OPTIMIZATION_BASIC = 4;
    public static final int OPTIMIZATION_CHAIN = 8;
    public static final int OPTIMIZATION_NONE = 1;
    private static final boolean USE_SNAPSHOT = true;
    private static final boolean USE_THREAD = false;
    private boolean[] flags;
    protected LinearSystem mBackgroundSystem;
    private ConstraintWidget[] mChainEnds;
    private boolean mHeightMeasuredTooSmall;
    private ConstraintWidget[] mHorizontalChainsArray;
    private int mHorizontalChainsSize;
    private ConstraintWidget[] mMatchConstraintsChainedWidgets;
    private int mOptimizationLevel;
    int mPaddingBottom;
    int mPaddingLeft;
    int mPaddingRight;
    int mPaddingTop;
    private Snapshot mSnapshot;
    protected LinearSystem mSystem;
    private ConstraintWidget[] mVerticalChainsArray;
    private int mVerticalChainsSize;
    private boolean mWidthMeasuredTooSmall;
    int mWrapHeight;
    int mWrapWidth;

    public ConstraintWidgetContainer() {
        this.mSystem = new LinearSystem();
        this.mBackgroundSystem = null;
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mMatchConstraintsChainedWidgets = new ConstraintWidget[4];
        this.mVerticalChainsArray = new ConstraintWidget[4];
        this.mHorizontalChainsArray = new ConstraintWidget[4];
        this.mOptimizationLevel = 2;
        this.flags = new boolean[3];
        this.mChainEnds = new ConstraintWidget[4];
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
    }

    public ConstraintWidgetContainer(int i, int i2) {
        super(i, i2);
        this.mSystem = new LinearSystem();
        this.mBackgroundSystem = null;
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mMatchConstraintsChainedWidgets = new ConstraintWidget[4];
        this.mVerticalChainsArray = new ConstraintWidget[4];
        this.mHorizontalChainsArray = new ConstraintWidget[4];
        this.mOptimizationLevel = 2;
        this.flags = new boolean[3];
        this.mChainEnds = new ConstraintWidget[4];
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
    }

    public ConstraintWidgetContainer(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.mSystem = new LinearSystem();
        this.mBackgroundSystem = null;
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mMatchConstraintsChainedWidgets = new ConstraintWidget[4];
        this.mVerticalChainsArray = new ConstraintWidget[4];
        this.mHorizontalChainsArray = new ConstraintWidget[4];
        this.mOptimizationLevel = 2;
        this.flags = new boolean[3];
        this.mChainEnds = new ConstraintWidget[4];
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
    }

    private void addHorizontalChain(ConstraintWidget constraintWidget) {
        int i = 0;
        while (i < this.mHorizontalChainsSize) {
            if (this.mHorizontalChainsArray[i] != constraintWidget) {
                i++;
            } else {
                return;
            }
        }
        if (this.mHorizontalChainsSize + 1 >= this.mHorizontalChainsArray.length) {
            this.mHorizontalChainsArray = (ConstraintWidget[]) Arrays.copyOf(this.mHorizontalChainsArray, this.mHorizontalChainsArray.length * 2);
        }
        this.mHorizontalChainsArray[this.mHorizontalChainsSize] = constraintWidget;
        this.mHorizontalChainsSize++;
    }

    private void addVerticalChain(ConstraintWidget constraintWidget) {
        int i = 0;
        while (i < this.mVerticalChainsSize) {
            if (this.mVerticalChainsArray[i] != constraintWidget) {
                i++;
            } else {
                return;
            }
        }
        if (this.mVerticalChainsSize + 1 >= this.mVerticalChainsArray.length) {
            this.mVerticalChainsArray = (ConstraintWidget[]) Arrays.copyOf(this.mVerticalChainsArray, this.mVerticalChainsArray.length * 2);
        }
        this.mVerticalChainsArray[this.mVerticalChainsSize] = constraintWidget;
        this.mVerticalChainsSize++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:220:0x0133 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0133 A:{SYNTHETIC} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyHorizontalChain(LinearSystem linearSystem) {
        LinearSystem linearSystem2 = linearSystem;
        for (int i = 0; i < this.mHorizontalChainsSize; i++) {
            ConstraintWidget constraintWidget = this.mHorizontalChainsArray[i];
            int countMatchConstraintsChainedWidgets = countMatchConstraintsChainedWidgets(linearSystem, this.mChainEnds, this.mHorizontalChainsArray[i], 0, this.flags);
            ConstraintWidget constraintWidget2 = this.mChainEnds[2];
            if (constraintWidget2 != null) {
                int margin;
                if (!this.flags[1]) {
                    Object obj = constraintWidget.mHorizontalChainStyle == 0 ? 1 : null;
                    Object obj2 = constraintWidget.mHorizontalChainStyle == 2 ? 1 : null;
                    Object obj3 = this.mHorizontalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT ? 1 : null;
                    if ((this.mOptimizationLevel != 2 && this.mOptimizationLevel != 8) || !this.flags[0] || !constraintWidget.mHorizontalChainFixedPosition || obj2 != null || obj3 != null || constraintWidget.mHorizontalChainStyle != 0) {
                        ConstraintWidget constraintWidget3;
                        int margin2;
                        int i2;
                        ConstraintWidget constraintWidget4;
                        ConstraintAnchor constraintAnchor;
                        SolverVariable solverVariable;
                        if (countMatchConstraintsChainedWidgets != 0 && obj2 == null) {
                            float f = 0.0f;
                            constraintWidget3 = null;
                            ConstraintWidget constraintWidget5 = constraintWidget2;
                            while (constraintWidget5 != null) {
                                if (constraintWidget5.mHorizontalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT) {
                                    margin2 = constraintWidget5.mLeft.getMargin();
                                    if (constraintWidget3 != null) {
                                        margin2 += constraintWidget3.mRight.getMargin();
                                    }
                                    linearSystem2.addGreaterThan(constraintWidget5.mLeft.mSolverVariable, constraintWidget5.mLeft.mTarget.mSolverVariable, margin2, constraintWidget5.mLeft.mTarget.mOwner.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT ? 2 : 3);
                                    margin2 = constraintWidget5.mRight.getMargin();
                                    if (constraintWidget5.mRight.mTarget.mOwner.mLeft.mTarget != null && constraintWidget5.mRight.mTarget.mOwner.mLeft.mTarget.mOwner == constraintWidget5) {
                                        margin2 += constraintWidget5.mRight.mTarget.mOwner.mLeft.getMargin();
                                    }
                                    linearSystem2.addLowerThan(constraintWidget5.mRight.mSolverVariable, constraintWidget5.mRight.mTarget.mSolverVariable, -margin2, constraintWidget5.mRight.mTarget.mOwner.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT ? 2 : 3);
                                } else {
                                    f += constraintWidget5.mHorizontalWeight;
                                    if (constraintWidget5.mRight.mTarget != null) {
                                        margin2 = constraintWidget5.mRight.getMargin();
                                        if (constraintWidget5 != this.mChainEnds[3]) {
                                            margin2 += constraintWidget5.mRight.mTarget.mOwner.mLeft.getMargin();
                                        }
                                    } else {
                                        margin2 = 0;
                                    }
                                    linearSystem2.addGreaterThan(constraintWidget5.mRight.mSolverVariable, constraintWidget5.mLeft.mSolverVariable, 0, 1);
                                    linearSystem2.addLowerThan(constraintWidget5.mRight.mSolverVariable, constraintWidget5.mRight.mTarget.mSolverVariable, -margin2, 1);
                                }
                                constraintWidget3 = constraintWidget5;
                                constraintWidget5 = constraintWidget5.mHorizontalNextWidget;
                            }
                            if (countMatchConstraintsChainedWidgets != 1) {
                                margin2 = 0;
                                while (true) {
                                    i2 = countMatchConstraintsChainedWidgets - 1;
                                    if (margin2 >= i2) {
                                        break;
                                    }
                                    ConstraintWidget constraintWidget6 = this.mMatchConstraintsChainedWidgets[margin2];
                                    int i3 = margin2 + 1;
                                    constraintWidget4 = this.mMatchConstraintsChainedWidgets[i3];
                                    SolverVariable solverVariable2 = constraintWidget6.mLeft.mSolverVariable;
                                    SolverVariable solverVariable3 = constraintWidget6.mRight.mSolverVariable;
                                    SolverVariable solverVariable4 = constraintWidget4.mLeft.mSolverVariable;
                                    SolverVariable solverVariable5 = constraintWidget4.mRight.mSolverVariable;
                                    if (constraintWidget4 == this.mChainEnds[3]) {
                                        solverVariable5 = this.mChainEnds[1].mRight.mSolverVariable;
                                    }
                                    margin2 = constraintWidget6.mLeft.getMargin();
                                    if (!(constraintWidget6.mLeft.mTarget == null || constraintWidget6.mLeft.mTarget.mOwner.mRight.mTarget == null || constraintWidget6.mLeft.mTarget.mOwner.mRight.mTarget.mOwner != constraintWidget6)) {
                                        margin2 += constraintWidget6.mLeft.mTarget.mOwner.mRight.getMargin();
                                    }
                                    linearSystem2.addGreaterThan(solverVariable2, constraintWidget6.mLeft.mTarget.mSolverVariable, margin2, 2);
                                    margin = constraintWidget6.mRight.getMargin();
                                    if (constraintWidget6.mRight.mTarget == null || constraintWidget6.mHorizontalNextWidget == null) {
                                        margin2 = margin;
                                    } else {
                                        margin2 = (constraintWidget6.mHorizontalNextWidget.mLeft.mTarget != null ? constraintWidget6.mHorizontalNextWidget.mLeft.getMargin() : 0) + margin;
                                    }
                                    linearSystem2.addLowerThan(solverVariable3, constraintWidget6.mRight.mTarget.mSolverVariable, -margin2, 2);
                                    if (i3 == i2) {
                                        margin2 = constraintWidget4.mLeft.getMargin();
                                        if (!(constraintWidget4.mLeft.mTarget == null || constraintWidget4.mLeft.mTarget.mOwner.mRight.mTarget == null || constraintWidget4.mLeft.mTarget.mOwner.mRight.mTarget.mOwner != constraintWidget4)) {
                                            margin2 += constraintWidget4.mLeft.mTarget.mOwner.mRight.getMargin();
                                        }
                                        linearSystem2.addGreaterThan(solverVariable4, constraintWidget4.mLeft.mTarget.mSolverVariable, margin2, 2);
                                        constraintAnchor = constraintWidget4.mRight;
                                        if (constraintWidget4 == this.mChainEnds[3]) {
                                            constraintAnchor = this.mChainEnds[1].mRight;
                                        }
                                        margin = constraintAnchor.getMargin();
                                        if (!(constraintAnchor.mTarget == null || constraintAnchor.mTarget.mOwner.mLeft.mTarget == null || constraintAnchor.mTarget.mOwner.mLeft.mTarget.mOwner != constraintWidget4)) {
                                            margin += constraintAnchor.mTarget.mOwner.mLeft.getMargin();
                                        }
                                        linearSystem2.addLowerThan(solverVariable5, constraintAnchor.mTarget.mSolverVariable, -margin, 2);
                                    }
                                    if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                                        linearSystem2.addLowerThan(solverVariable3, solverVariable2, constraintWidget.mMatchConstraintMaxWidth, 2);
                                    }
                                    ArrayRow createRow = linearSystem.createRow();
                                    createRow.createRowEqualDimension(constraintWidget6.mHorizontalWeight, f, constraintWidget4.mHorizontalWeight, solverVariable2, constraintWidget6.mLeft.getMargin(), solverVariable3, constraintWidget6.mRight.getMargin(), solverVariable4, constraintWidget4.mLeft.getMargin(), solverVariable5, constraintWidget4.mRight.getMargin());
                                    linearSystem2.addConstraint(createRow);
                                    margin2 = i3;
                                }
                            } else {
                                constraintWidget5 = this.mMatchConstraintsChainedWidgets[0];
                                margin2 = constraintWidget5.mLeft.getMargin();
                                if (constraintWidget5.mLeft.mTarget != null) {
                                    margin2 += constraintWidget5.mLeft.mTarget.getMargin();
                                }
                                margin = constraintWidget5.mRight.getMargin();
                                if (constraintWidget5.mRight.mTarget != null) {
                                    margin += constraintWidget5.mRight.mTarget.getMargin();
                                }
                                solverVariable = constraintWidget.mRight.mTarget.mSolverVariable;
                                if (constraintWidget5 == this.mChainEnds[3]) {
                                    solverVariable = this.mChainEnds[1].mRight.mTarget.mSolverVariable;
                                }
                                if (constraintWidget5.mMatchConstraintDefaultWidth == 1) {
                                    linearSystem2.addGreaterThan(constraintWidget.mLeft.mSolverVariable, constraintWidget.mLeft.mTarget.mSolverVariable, margin2, 1);
                                    linearSystem2.addLowerThan(constraintWidget.mRight.mSolverVariable, solverVariable, -margin, 1);
                                    linearSystem2.addEquality(constraintWidget.mRight.mSolverVariable, constraintWidget.mLeft.mSolverVariable, constraintWidget.getWidth(), 2);
                                } else {
                                    linearSystem2.addEquality(constraintWidget5.mLeft.mSolverVariable, constraintWidget5.mLeft.mTarget.mSolverVariable, margin2, 1);
                                    linearSystem2.addEquality(constraintWidget5.mRight.mSolverVariable, solverVariable, -margin, 1);
                                }
                            }
                        } else {
                            int margin3;
                            SolverVariable solverVariable6;
                            Object obj4 = null;
                            ConstraintWidget constraintWidget7 = null;
                            ConstraintWidget constraintWidget8 = constraintWidget2;
                            ConstraintWidget constraintWidget9 = null;
                            while (constraintWidget8 != null) {
                                ConstraintWidget constraintWidget10;
                                Object obj5;
                                ConstraintWidget constraintWidget11;
                                constraintWidget3 = constraintWidget8.mHorizontalNextWidget;
                                if (constraintWidget3 == null) {
                                    constraintWidget10 = this.mChainEnds[1];
                                    obj5 = 1;
                                } else {
                                    constraintWidget10 = constraintWidget9;
                                    obj5 = obj4;
                                }
                                if (obj2 != null) {
                                    ConstraintAnchor constraintAnchor2 = constraintWidget8.mLeft;
                                    margin2 = constraintAnchor2.getMargin();
                                    linearSystem2.addGreaterThan(constraintAnchor2.mSolverVariable, constraintAnchor2.mTarget.mSolverVariable, constraintWidget7 != null ? margin2 + constraintWidget7.mRight.getMargin() : margin2, constraintWidget2 != constraintWidget8 ? 3 : 1);
                                    if (constraintWidget8.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                                        constraintAnchor = constraintWidget8.mRight;
                                        if (constraintWidget8.mMatchConstraintDefaultWidth == 1) {
                                            linearSystem2.addEquality(constraintAnchor.mSolverVariable, constraintAnchor2.mSolverVariable, Math.max(constraintWidget8.mMatchConstraintMinWidth, constraintWidget8.getWidth()), 3);
                                        } else {
                                            linearSystem2.addGreaterThan(constraintAnchor2.mSolverVariable, constraintAnchor2.mTarget.mSolverVariable, constraintAnchor2.mMargin, 3);
                                            linearSystem2.addLowerThan(constraintAnchor.mSolverVariable, constraintAnchor2.mSolverVariable, constraintWidget8.mMatchConstraintMinWidth, 3);
                                        }
                                    }
                                } else if (obj != null || obj5 == null || constraintWidget7 == null) {
                                    if (obj != null || obj5 != null || constraintWidget7 != null) {
                                        constraintAnchor = constraintWidget8.mLeft;
                                        ConstraintAnchor constraintAnchor3 = constraintWidget8.mRight;
                                        i2 = constraintAnchor.getMargin();
                                        margin3 = constraintAnchor3.getMargin();
                                        linearSystem2.addGreaterThan(constraintAnchor.mSolverVariable, constraintAnchor.mTarget.mSolverVariable, i2, 1);
                                        linearSystem2.addLowerThan(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, -margin3, 1);
                                        solverVariable = constraintAnchor.mTarget != null ? constraintAnchor.mTarget.mSolverVariable : null;
                                        if (constraintWidget7 == null) {
                                            solverVariable = constraintWidget.mLeft.mTarget != null ? constraintWidget.mLeft.mTarget.mSolverVariable : null;
                                        }
                                        constraintWidget4 = constraintWidget3 == null ? constraintWidget10.mRight.mTarget != null ? constraintWidget10.mRight.mTarget.mOwner : null : constraintWidget3;
                                        if (constraintWidget4 != null) {
                                            solverVariable6 = constraintWidget4.mLeft.mSolverVariable;
                                            if (obj5 != null) {
                                                solverVariable6 = constraintWidget10.mRight.mTarget != null ? constraintWidget10.mRight.mTarget.mSolverVariable : null;
                                            }
                                            if (!(solverVariable == null || solverVariable6 == null)) {
                                                linearSystem.addCentering(constraintAnchor.mSolverVariable, solverVariable, i2, 0.5f, solverVariable6, constraintAnchor3.mSolverVariable, margin3, 4);
                                                constraintWidget11 = constraintWidget4;
                                                if (obj5 != null) {
                                                    constraintWidget11 = null;
                                                }
                                                constraintWidget7 = constraintWidget8;
                                                constraintWidget9 = constraintWidget10;
                                                obj4 = obj5;
                                                constraintWidget8 = constraintWidget11;
                                            }
                                        }
                                        constraintWidget11 = constraintWidget4;
                                        if (obj5 != null) {
                                        }
                                        constraintWidget7 = constraintWidget8;
                                        constraintWidget9 = constraintWidget10;
                                        obj4 = obj5;
                                        constraintWidget8 = constraintWidget11;
                                    } else if (constraintWidget8.mLeft.mTarget == null) {
                                        linearSystem2.addEquality(constraintWidget8.mLeft.mSolverVariable, constraintWidget8.getDrawX());
                                    } else {
                                        linearSystem2.addEquality(constraintWidget8.mLeft.mSolverVariable, constraintWidget.mLeft.mTarget.mSolverVariable, constraintWidget8.mLeft.getMargin(), 5);
                                    }
                                } else if (constraintWidget8.mRight.mTarget == null) {
                                    linearSystem2.addEquality(constraintWidget8.mRight.mSolverVariable, constraintWidget8.getDrawRight());
                                } else {
                                    linearSystem2.addEquality(constraintWidget8.mRight.mSolverVariable, constraintWidget10.mRight.mTarget.mSolverVariable, -constraintWidget8.mRight.getMargin(), 5);
                                }
                                constraintWidget11 = constraintWidget3;
                                if (obj5 != null) {
                                }
                                constraintWidget7 = constraintWidget8;
                                constraintWidget9 = constraintWidget10;
                                obj4 = obj5;
                                constraintWidget8 = constraintWidget11;
                            }
                            if (obj2 != null) {
                                constraintAnchor = constraintWidget2.mLeft;
                                ConstraintAnchor constraintAnchor4 = constraintWidget9.mRight;
                                i2 = constraintAnchor.getMargin();
                                margin3 = constraintAnchor4.getMargin();
                                solverVariable = constraintWidget.mLeft.mTarget != null ? constraintWidget.mLeft.mTarget.mSolverVariable : null;
                                solverVariable6 = constraintWidget9.mRight.mTarget != null ? constraintWidget9.mRight.mTarget.mSolverVariable : null;
                                if (!(solverVariable == null || solverVariable6 == null)) {
                                    linearSystem2.addLowerThan(constraintAnchor4.mSolverVariable, solverVariable6, -margin3, 1);
                                    linearSystem.addCentering(constraintAnchor.mSolverVariable, solverVariable, i2, constraintWidget.mHorizontalBiasPercent, solverVariable6, constraintAnchor4.mSolverVariable, margin3, 4);
                                }
                            }
                        }
                    } else {
                        Optimizer.applyDirectResolutionHorizontalChain(this, linearSystem2, countMatchConstraintsChainedWidgets, constraintWidget);
                    }
                } else {
                    margin = constraintWidget.getDrawX();
                    while (constraintWidget2 != null) {
                        linearSystem2.addEquality(constraintWidget2.mLeft.mSolverVariable, margin);
                        margin += (constraintWidget2.mLeft.getMargin() + constraintWidget2.getWidth()) + constraintWidget2.mRight.getMargin();
                        constraintWidget2 = constraintWidget2.mHorizontalNextWidget;
                    }
                }
            }
            linearSystem2 = linearSystem2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:229:0x013b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x013b A:{SYNTHETIC} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyVerticalChain(LinearSystem linearSystem) {
        LinearSystem linearSystem2 = linearSystem;
        for (int i = 0; i < this.mVerticalChainsSize; i++) {
            ConstraintWidget constraintWidget = this.mVerticalChainsArray[i];
            int countMatchConstraintsChainedWidgets = countMatchConstraintsChainedWidgets(linearSystem, this.mChainEnds, this.mVerticalChainsArray[i], 1, this.flags);
            ConstraintWidget constraintWidget2 = this.mChainEnds[2];
            if (constraintWidget2 != null) {
                int margin;
                if (!this.flags[1]) {
                    Object obj = constraintWidget.mVerticalChainStyle == 0 ? 1 : null;
                    Object obj2 = constraintWidget.mVerticalChainStyle == 2 ? 1 : null;
                    Object obj3 = this.mVerticalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT ? 1 : null;
                    if ((this.mOptimizationLevel != 2 && this.mOptimizationLevel != 8) || !this.flags[0] || !constraintWidget.mVerticalChainFixedPosition || obj2 != null || obj3 != null || constraintWidget.mVerticalChainStyle != 0) {
                        ConstraintWidget constraintWidget3;
                        int margin2;
                        int i2;
                        ConstraintWidget constraintWidget4;
                        SolverVariable solverVariable;
                        ConstraintAnchor constraintAnchor;
                        SolverVariable solverVariable2;
                        if (countMatchConstraintsChainedWidgets != 0 && obj2 == null) {
                            float f = 0.0f;
                            constraintWidget3 = null;
                            ConstraintWidget constraintWidget5 = constraintWidget2;
                            while (constraintWidget5 != null) {
                                if (constraintWidget5.mVerticalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT) {
                                    margin2 = constraintWidget5.mTop.getMargin();
                                    if (constraintWidget3 != null) {
                                        margin2 += constraintWidget3.mBottom.getMargin();
                                    }
                                    linearSystem2.addGreaterThan(constraintWidget5.mTop.mSolverVariable, constraintWidget5.mTop.mTarget.mSolverVariable, margin2, constraintWidget5.mTop.mTarget.mOwner.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT ? 2 : 3);
                                    margin2 = constraintWidget5.mBottom.getMargin();
                                    if (constraintWidget5.mBottom.mTarget.mOwner.mTop.mTarget != null && constraintWidget5.mBottom.mTarget.mOwner.mTop.mTarget.mOwner == constraintWidget5) {
                                        margin2 += constraintWidget5.mBottom.mTarget.mOwner.mTop.getMargin();
                                    }
                                    linearSystem2.addLowerThan(constraintWidget5.mBottom.mSolverVariable, constraintWidget5.mBottom.mTarget.mSolverVariable, -margin2, constraintWidget5.mBottom.mTarget.mOwner.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT ? 2 : 3);
                                } else {
                                    f += constraintWidget5.mVerticalWeight;
                                    if (constraintWidget5.mBottom.mTarget != null) {
                                        margin2 = constraintWidget5.mBottom.getMargin();
                                        if (constraintWidget5 != this.mChainEnds[3]) {
                                            margin2 += constraintWidget5.mBottom.mTarget.mOwner.mTop.getMargin();
                                        }
                                    } else {
                                        margin2 = 0;
                                    }
                                    linearSystem2.addGreaterThan(constraintWidget5.mBottom.mSolverVariable, constraintWidget5.mTop.mSolverVariable, 0, 1);
                                    linearSystem2.addLowerThan(constraintWidget5.mBottom.mSolverVariable, constraintWidget5.mBottom.mTarget.mSolverVariable, -margin2, 1);
                                }
                                constraintWidget3 = constraintWidget5;
                                constraintWidget5 = constraintWidget5.mVerticalNextWidget;
                            }
                            if (countMatchConstraintsChainedWidgets != 1) {
                                margin2 = 0;
                                while (true) {
                                    i2 = countMatchConstraintsChainedWidgets - 1;
                                    if (margin2 >= i2) {
                                        break;
                                    }
                                    ConstraintWidget constraintWidget6 = this.mMatchConstraintsChainedWidgets[margin2];
                                    int i3 = margin2 + 1;
                                    constraintWidget4 = this.mMatchConstraintsChainedWidgets[i3];
                                    solverVariable = constraintWidget6.mTop.mSolverVariable;
                                    SolverVariable solverVariable3 = constraintWidget6.mBottom.mSolverVariable;
                                    SolverVariable solverVariable4 = constraintWidget4.mTop.mSolverVariable;
                                    SolverVariable solverVariable5 = constraintWidget4.mBottom.mSolverVariable;
                                    if (constraintWidget4 == this.mChainEnds[3]) {
                                        solverVariable5 = this.mChainEnds[1].mBottom.mSolverVariable;
                                    }
                                    margin2 = constraintWidget6.mTop.getMargin();
                                    if (!(constraintWidget6.mTop.mTarget == null || constraintWidget6.mTop.mTarget.mOwner.mBottom.mTarget == null || constraintWidget6.mTop.mTarget.mOwner.mBottom.mTarget.mOwner != constraintWidget6)) {
                                        margin2 += constraintWidget6.mTop.mTarget.mOwner.mBottom.getMargin();
                                    }
                                    linearSystem2.addGreaterThan(solverVariable, constraintWidget6.mTop.mTarget.mSolverVariable, margin2, 2);
                                    margin = constraintWidget6.mBottom.getMargin();
                                    if (constraintWidget6.mBottom.mTarget == null || constraintWidget6.mVerticalNextWidget == null) {
                                        margin2 = margin;
                                    } else {
                                        margin2 = (constraintWidget6.mVerticalNextWidget.mTop.mTarget != null ? constraintWidget6.mVerticalNextWidget.mTop.getMargin() : 0) + margin;
                                    }
                                    linearSystem2.addLowerThan(solverVariable3, constraintWidget6.mBottom.mTarget.mSolverVariable, -margin2, 2);
                                    if (i3 == i2) {
                                        margin2 = constraintWidget4.mTop.getMargin();
                                        if (!(constraintWidget4.mTop.mTarget == null || constraintWidget4.mTop.mTarget.mOwner.mBottom.mTarget == null || constraintWidget4.mTop.mTarget.mOwner.mBottom.mTarget.mOwner != constraintWidget4)) {
                                            margin2 += constraintWidget4.mTop.mTarget.mOwner.mBottom.getMargin();
                                        }
                                        linearSystem2.addGreaterThan(solverVariable4, constraintWidget4.mTop.mTarget.mSolverVariable, margin2, 2);
                                        constraintAnchor = constraintWidget4.mBottom;
                                        if (constraintWidget4 == this.mChainEnds[3]) {
                                            constraintAnchor = this.mChainEnds[1].mBottom;
                                        }
                                        margin = constraintAnchor.getMargin();
                                        if (!(constraintAnchor.mTarget == null || constraintAnchor.mTarget.mOwner.mTop.mTarget == null || constraintAnchor.mTarget.mOwner.mTop.mTarget.mOwner != constraintWidget4)) {
                                            margin += constraintAnchor.mTarget.mOwner.mTop.getMargin();
                                        }
                                        linearSystem2.addLowerThan(solverVariable5, constraintAnchor.mTarget.mSolverVariable, -margin, 2);
                                    }
                                    if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                                        linearSystem2.addLowerThan(solverVariable3, solverVariable, constraintWidget.mMatchConstraintMaxHeight, 2);
                                    }
                                    ArrayRow createRow = linearSystem.createRow();
                                    createRow.createRowEqualDimension(constraintWidget6.mVerticalWeight, f, constraintWidget4.mVerticalWeight, solverVariable, constraintWidget6.mTop.getMargin(), solverVariable3, constraintWidget6.mBottom.getMargin(), solverVariable4, constraintWidget4.mTop.getMargin(), solverVariable5, constraintWidget4.mBottom.getMargin());
                                    linearSystem2.addConstraint(createRow);
                                    margin2 = i3;
                                }
                            } else {
                                constraintWidget5 = this.mMatchConstraintsChainedWidgets[0];
                                margin2 = constraintWidget5.mTop.getMargin();
                                if (constraintWidget5.mTop.mTarget != null) {
                                    margin2 += constraintWidget5.mTop.mTarget.getMargin();
                                }
                                margin = constraintWidget5.mBottom.getMargin();
                                if (constraintWidget5.mBottom.mTarget != null) {
                                    margin += constraintWidget5.mBottom.mTarget.getMargin();
                                }
                                solverVariable2 = constraintWidget.mBottom.mTarget.mSolverVariable;
                                if (constraintWidget5 == this.mChainEnds[3]) {
                                    solverVariable2 = this.mChainEnds[1].mBottom.mTarget.mSolverVariable;
                                }
                                if (constraintWidget5.mMatchConstraintDefaultHeight == 1) {
                                    linearSystem2.addGreaterThan(constraintWidget.mTop.mSolverVariable, constraintWidget.mTop.mTarget.mSolverVariable, margin2, 1);
                                    linearSystem2.addLowerThan(constraintWidget.mBottom.mSolverVariable, solverVariable2, -margin, 1);
                                    linearSystem2.addEquality(constraintWidget.mBottom.mSolverVariable, constraintWidget.mTop.mSolverVariable, constraintWidget.getHeight(), 2);
                                } else {
                                    linearSystem2.addEquality(constraintWidget5.mTop.mSolverVariable, constraintWidget5.mTop.mTarget.mSolverVariable, margin2, 1);
                                    linearSystem2.addEquality(constraintWidget5.mBottom.mSolverVariable, solverVariable2, -margin, 1);
                                }
                            }
                        } else {
                            int margin3;
                            SolverVariable solverVariable6;
                            Object obj4 = null;
                            ConstraintWidget constraintWidget7 = null;
                            ConstraintWidget constraintWidget8 = constraintWidget2;
                            ConstraintWidget constraintWidget9 = null;
                            while (constraintWidget8 != null) {
                                ConstraintWidget constraintWidget10;
                                Object obj5;
                                ConstraintWidget constraintWidget11;
                                constraintWidget3 = constraintWidget8.mVerticalNextWidget;
                                if (constraintWidget3 == null) {
                                    constraintWidget10 = this.mChainEnds[1];
                                    obj5 = 1;
                                } else {
                                    constraintWidget10 = constraintWidget9;
                                    obj5 = obj4;
                                }
                                if (obj2 != null) {
                                    ConstraintAnchor constraintAnchor2 = constraintWidget8.mTop;
                                    int margin4 = constraintAnchor2.getMargin();
                                    if (constraintWidget7 != null) {
                                        margin4 += constraintWidget7.mBottom.getMargin();
                                    }
                                    margin2 = constraintWidget2 != constraintWidget8 ? 3 : 1;
                                    SolverVariable solverVariable7;
                                    if (constraintAnchor2.mTarget != null) {
                                        solverVariable7 = constraintAnchor2.mSolverVariable;
                                        solverVariable2 = constraintAnchor2.mTarget.mSolverVariable;
                                        solverVariable = solverVariable7;
                                    } else if (constraintWidget8.mBaseline.mTarget != null) {
                                        solverVariable7 = constraintWidget8.mBaseline.mSolverVariable;
                                        solverVariable2 = constraintWidget8.mBaseline.mTarget.mSolverVariable;
                                        margin4 -= constraintAnchor2.getMargin();
                                        solverVariable = solverVariable7;
                                    } else {
                                        solverVariable2 = null;
                                        solverVariable = null;
                                    }
                                    if (!(solverVariable == null || solverVariable2 == null)) {
                                        linearSystem2.addGreaterThan(solverVariable, solverVariable2, margin4, margin2);
                                    }
                                    if (constraintWidget8.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                                        constraintAnchor = constraintWidget8.mBottom;
                                        if (constraintWidget8.mMatchConstraintDefaultHeight == 1) {
                                            linearSystem2.addEquality(constraintAnchor.mSolverVariable, constraintAnchor2.mSolverVariable, Math.max(constraintWidget8.mMatchConstraintMinHeight, constraintWidget8.getHeight()), 3);
                                        } else {
                                            linearSystem2.addGreaterThan(constraintAnchor2.mSolverVariable, constraintAnchor2.mTarget.mSolverVariable, constraintAnchor2.mMargin, 3);
                                            linearSystem2.addLowerThan(constraintAnchor.mSolverVariable, constraintAnchor2.mSolverVariable, constraintWidget8.mMatchConstraintMinHeight, 3);
                                        }
                                    }
                                } else if (obj != null || obj5 == null || constraintWidget7 == null) {
                                    if (obj != null || obj5 != null || constraintWidget7 != null) {
                                        constraintAnchor = constraintWidget8.mTop;
                                        ConstraintAnchor constraintAnchor3 = constraintWidget8.mBottom;
                                        i2 = constraintAnchor.getMargin();
                                        margin3 = constraintAnchor3.getMargin();
                                        linearSystem2.addGreaterThan(constraintAnchor.mSolverVariable, constraintAnchor.mTarget.mSolverVariable, i2, 1);
                                        linearSystem2.addLowerThan(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, -margin3, 1);
                                        solverVariable2 = constraintAnchor.mTarget != null ? constraintAnchor.mTarget.mSolverVariable : null;
                                        if (constraintWidget7 == null) {
                                            solverVariable2 = constraintWidget.mTop.mTarget != null ? constraintWidget.mTop.mTarget.mSolverVariable : null;
                                        }
                                        constraintWidget4 = constraintWidget3 == null ? constraintWidget10.mBottom.mTarget != null ? constraintWidget10.mBottom.mTarget.mOwner : null : constraintWidget3;
                                        if (constraintWidget4 != null) {
                                            solverVariable6 = constraintWidget4.mTop.mSolverVariable;
                                            if (obj5 != null) {
                                                solverVariable6 = constraintWidget10.mBottom.mTarget != null ? constraintWidget10.mBottom.mTarget.mSolverVariable : null;
                                            }
                                            if (!(solverVariable2 == null || solverVariable6 == null)) {
                                                linearSystem.addCentering(constraintAnchor.mSolverVariable, solverVariable2, i2, 0.5f, solverVariable6, constraintAnchor3.mSolverVariable, margin3, 4);
                                                constraintWidget11 = constraintWidget4;
                                                if (obj5 != null) {
                                                    constraintWidget11 = null;
                                                }
                                                constraintWidget7 = constraintWidget8;
                                                constraintWidget9 = constraintWidget10;
                                                obj4 = obj5;
                                                constraintWidget8 = constraintWidget11;
                                            }
                                        }
                                        constraintWidget11 = constraintWidget4;
                                        if (obj5 != null) {
                                        }
                                        constraintWidget7 = constraintWidget8;
                                        constraintWidget9 = constraintWidget10;
                                        obj4 = obj5;
                                        constraintWidget8 = constraintWidget11;
                                    } else if (constraintWidget8.mTop.mTarget == null) {
                                        linearSystem2.addEquality(constraintWidget8.mTop.mSolverVariable, constraintWidget8.getDrawY());
                                    } else {
                                        linearSystem2.addEquality(constraintWidget8.mTop.mSolverVariable, constraintWidget.mTop.mTarget.mSolverVariable, constraintWidget8.mTop.getMargin(), 5);
                                    }
                                } else if (constraintWidget8.mBottom.mTarget == null) {
                                    linearSystem2.addEquality(constraintWidget8.mBottom.mSolverVariable, constraintWidget8.getDrawBottom());
                                } else {
                                    linearSystem2.addEquality(constraintWidget8.mBottom.mSolverVariable, constraintWidget10.mBottom.mTarget.mSolverVariable, -constraintWidget8.mBottom.getMargin(), 5);
                                }
                                constraintWidget11 = constraintWidget3;
                                if (obj5 != null) {
                                }
                                constraintWidget7 = constraintWidget8;
                                constraintWidget9 = constraintWidget10;
                                obj4 = obj5;
                                constraintWidget8 = constraintWidget11;
                            }
                            if (obj2 != null) {
                                constraintAnchor = constraintWidget2.mTop;
                                ConstraintAnchor constraintAnchor4 = constraintWidget9.mBottom;
                                i2 = constraintAnchor.getMargin();
                                margin3 = constraintAnchor4.getMargin();
                                solverVariable2 = constraintWidget.mTop.mTarget != null ? constraintWidget.mTop.mTarget.mSolverVariable : null;
                                solverVariable6 = constraintWidget9.mBottom.mTarget != null ? constraintWidget9.mBottom.mTarget.mSolverVariable : null;
                                if (!(solverVariable2 == null || solverVariable6 == null)) {
                                    linearSystem2.addLowerThan(constraintAnchor4.mSolverVariable, solverVariable6, -margin3, 1);
                                    linearSystem.addCentering(constraintAnchor.mSolverVariable, solverVariable2, i2, constraintWidget.mVerticalBiasPercent, solverVariable6, constraintAnchor4.mSolverVariable, margin3, 4);
                                }
                            }
                        }
                    } else {
                        Optimizer.applyDirectResolutionVerticalChain(this, linearSystem2, countMatchConstraintsChainedWidgets, constraintWidget);
                    }
                } else {
                    margin = constraintWidget.getDrawY();
                    while (constraintWidget2 != null) {
                        linearSystem2.addEquality(constraintWidget2.mTop.mSolverVariable, margin);
                        margin += (constraintWidget2.mTop.getMargin() + constraintWidget2.getHeight()) + constraintWidget2.mBottom.getMargin();
                        constraintWidget2 = constraintWidget2.mVerticalNextWidget;
                    }
                }
            }
            linearSystem2 = linearSystem2;
        }
    }

    private int countMatchConstraintsChainedWidgets(LinearSystem linearSystem, ConstraintWidget[] constraintWidgetArr, ConstraintWidget constraintWidget, int i, boolean[] zArr) {
        int i2;
        zArr[0] = USE_SNAPSHOT;
        zArr[1] = false;
        constraintWidgetArr[0] = null;
        constraintWidgetArr[2] = null;
        constraintWidgetArr[1] = null;
        constraintWidgetArr[3] = null;
        boolean z;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6;
        int i3;
        if (i == 0) {
            z = (constraintWidget.mLeft.mTarget == null || constraintWidget.mLeft.mTarget.mOwner == this) ? USE_SNAPSHOT : false;
            constraintWidget.mHorizontalNextWidget = null;
            constraintWidget2 = constraintWidget.getVisibility() != 8 ? constraintWidget : null;
            constraintWidget3 = null;
            i2 = 0;
            constraintWidget4 = constraintWidget2;
            constraintWidget5 = constraintWidget2;
            constraintWidget6 = constraintWidget;
            while (constraintWidget6.mRight.mTarget != null) {
                constraintWidget6.mHorizontalNextWidget = null;
                if (constraintWidget6.getVisibility() != 8) {
                    if (constraintWidget5 == null) {
                        constraintWidget5 = constraintWidget6;
                    }
                    if (!(constraintWidget4 == null || constraintWidget4 == constraintWidget6)) {
                        constraintWidget4.mHorizontalNextWidget = constraintWidget6;
                    }
                    constraintWidget4 = constraintWidget6;
                } else {
                    linearSystem.addEquality(constraintWidget6.mLeft.mSolverVariable, constraintWidget6.mLeft.mTarget.mSolverVariable, 0, 5);
                    linearSystem.addEquality(constraintWidget6.mRight.mSolverVariable, constraintWidget6.mLeft.mSolverVariable, 0, 5);
                }
                if (constraintWidget6.getVisibility() != 8 && constraintWidget6.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                    if (constraintWidget6.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                        zArr[0] = false;
                    }
                    if (constraintWidget6.mDimensionRatio <= 0.0f) {
                        zArr[0] = false;
                        i3 = i2 + 1;
                        if (i3 >= this.mMatchConstraintsChainedWidgets.length) {
                            this.mMatchConstraintsChainedWidgets = (ConstraintWidget[]) Arrays.copyOf(this.mMatchConstraintsChainedWidgets, this.mMatchConstraintsChainedWidgets.length * 2);
                        }
                        this.mMatchConstraintsChainedWidgets[i2] = constraintWidget6;
                        i2 = i3;
                    }
                }
                if (constraintWidget6.mRight.mTarget.mOwner.mLeft.mTarget == null || constraintWidget6.mRight.mTarget.mOwner.mLeft.mTarget.mOwner != constraintWidget6 || constraintWidget6.mRight.mTarget.mOwner == constraintWidget6) {
                    break;
                }
                constraintWidget2 = constraintWidget6.mRight.mTarget.mOwner;
                constraintWidget3 = constraintWidget2;
                constraintWidget6 = constraintWidget2;
            }
            if (!(constraintWidget6.mRight.mTarget == null || constraintWidget6.mRight.mTarget.mOwner == this)) {
                z = false;
            }
            if (constraintWidget.mLeft.mTarget == null || constraintWidget3.mRight.mTarget == null) {
                zArr[1] = USE_SNAPSHOT;
            }
            constraintWidget.mHorizontalChainFixedPosition = z;
            constraintWidget3.mHorizontalNextWidget = null;
            constraintWidgetArr[0] = constraintWidget;
            constraintWidgetArr[2] = constraintWidget5;
            constraintWidgetArr[1] = constraintWidget3;
            constraintWidgetArr[3] = constraintWidget4;
        } else {
            z = (constraintWidget.mTop.mTarget == null || constraintWidget.mTop.mTarget.mOwner == this) ? USE_SNAPSHOT : false;
            constraintWidget.mVerticalNextWidget = null;
            constraintWidget2 = constraintWidget.getVisibility() != 8 ? constraintWidget : null;
            constraintWidget3 = null;
            i2 = 0;
            constraintWidget4 = constraintWidget2;
            constraintWidget5 = constraintWidget2;
            constraintWidget6 = constraintWidget;
            while (constraintWidget6.mBottom.mTarget != null) {
                constraintWidget6.mVerticalNextWidget = null;
                if (constraintWidget6.getVisibility() != 8) {
                    if (constraintWidget5 == null) {
                        constraintWidget5 = constraintWidget6;
                    }
                    if (!(constraintWidget4 == null || constraintWidget4 == constraintWidget6)) {
                        constraintWidget4.mVerticalNextWidget = constraintWidget6;
                    }
                    constraintWidget4 = constraintWidget6;
                } else {
                    linearSystem.addEquality(constraintWidget6.mTop.mSolverVariable, constraintWidget6.mTop.mTarget.mSolverVariable, 0, 5);
                    linearSystem.addEquality(constraintWidget6.mBottom.mSolverVariable, constraintWidget6.mTop.mSolverVariable, 0, 5);
                }
                if (constraintWidget6.getVisibility() != 8 && constraintWidget6.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                    if (constraintWidget6.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                        zArr[0] = false;
                    }
                    if (constraintWidget6.mDimensionRatio <= 0.0f) {
                        zArr[0] = false;
                        i3 = i2 + 1;
                        if (i3 >= this.mMatchConstraintsChainedWidgets.length) {
                            this.mMatchConstraintsChainedWidgets = (ConstraintWidget[]) Arrays.copyOf(this.mMatchConstraintsChainedWidgets, this.mMatchConstraintsChainedWidgets.length * 2);
                        }
                        this.mMatchConstraintsChainedWidgets[i2] = constraintWidget6;
                        i2 = i3;
                    }
                }
                if (constraintWidget6.mBottom.mTarget.mOwner.mTop.mTarget == null || constraintWidget6.mBottom.mTarget.mOwner.mTop.mTarget.mOwner != constraintWidget6 || constraintWidget6.mBottom.mTarget.mOwner == constraintWidget6) {
                    break;
                }
                constraintWidget2 = constraintWidget6.mBottom.mTarget.mOwner;
                constraintWidget3 = constraintWidget2;
                constraintWidget6 = constraintWidget2;
            }
            if (!(constraintWidget6.mBottom.mTarget == null || constraintWidget6.mBottom.mTarget.mOwner == this)) {
                z = false;
            }
            if (constraintWidget.mTop.mTarget == null || constraintWidget3.mBottom.mTarget == null) {
                zArr[1] = USE_SNAPSHOT;
            }
            constraintWidget.mVerticalChainFixedPosition = z;
            constraintWidget3.mVerticalNextWidget = null;
            constraintWidgetArr[0] = constraintWidget;
            constraintWidgetArr[2] = constraintWidget5;
            constraintWidgetArr[1] = constraintWidget3;
            constraintWidgetArr[3] = constraintWidget4;
        }
        return i2;
    }

    public static ConstraintWidgetContainer createContainer(ConstraintWidgetContainer constraintWidgetContainer, String str, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2 = 0;
        Rectangle bounds = WidgetContainer.getBounds(arrayList);
        if (bounds.width == 0 || bounds.height == 0) {
            return null;
        }
        if (i > 0) {
            int min = Math.min(bounds.x, bounds.y);
            if (i > min) {
                i = min;
            }
            bounds.grow(i, i);
        }
        constraintWidgetContainer.setOrigin(bounds.x, bounds.y);
        constraintWidgetContainer.setDimension(bounds.width, bounds.height);
        constraintWidgetContainer.setDebugName(str);
        ConstraintWidget parent = ((ConstraintWidget) arrayList.get(0)).getParent();
        int size = arrayList.size();
        while (i2 < size) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i2);
            if (constraintWidget.getParent() == parent) {
                constraintWidgetContainer.add(constraintWidget);
                constraintWidget.setX(constraintWidget.getX() - bounds.x);
                constraintWidget.setY(constraintWidget.getY() - bounds.y);
            }
            i2++;
        }
        return constraintWidgetContainer;
    }

    private boolean optimize(LinearSystem linearSystem) {
        int i;
        ConstraintWidget constraintWidget;
        int i2;
        int i3;
        int size = this.mChildren.size();
        for (i = 0; i < size; i++) {
            constraintWidget = (ConstraintWidget) this.mChildren.get(i);
            constraintWidget.mHorizontalResolution = -1;
            constraintWidget.mVerticalResolution = -1;
            if (constraintWidget.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                constraintWidget.mHorizontalResolution = 1;
                constraintWidget.mVerticalResolution = 1;
            }
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i6 == 0) {
            int i7 = 0;
            i = 0;
            i2 = 0;
            while (i7 < size) {
                constraintWidget = (ConstraintWidget) this.mChildren.get(i7);
                if (constraintWidget.mHorizontalResolution == -1) {
                    if (this.mHorizontalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget.mHorizontalResolution = 1;
                    } else {
                        Optimizer.checkHorizontalSimpleDependency(this, linearSystem, constraintWidget);
                    }
                }
                if (constraintWidget.mVerticalResolution == -1) {
                    if (this.mVerticalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget.mVerticalResolution = 1;
                    } else {
                        Optimizer.checkVerticalSimpleDependency(this, linearSystem, constraintWidget);
                    }
                }
                if (constraintWidget.mVerticalResolution == -1) {
                    i++;
                }
                i7++;
                i2 = constraintWidget.mHorizontalResolution == -1 ? i2 + 1 : i2;
            }
            i3 = ((i == 0 && i2 == 0) || (i5 == i && i4 == i2)) ? 1 : i6;
            i4 = i2;
            i5 = i;
            i6 = i3;
        }
        i = 0;
        i2 = 0;
        i6 = 0;
        while (i6 < size) {
            constraintWidget = (ConstraintWidget) this.mChildren.get(i6);
            if (constraintWidget.mHorizontalResolution == 1 || constraintWidget.mHorizontalResolution == -1) {
                i++;
            }
            i3 = (constraintWidget.mVerticalResolution == 1 || constraintWidget.mVerticalResolution == -1) ? i2 + 1 : i2;
            i6++;
            i2 = i3;
        }
        return (i == 0 && i2 == 0) ? USE_SNAPSHOT : false;
    }

    private void resetChains() {
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
    }

    static int setGroup(ConstraintAnchor constraintAnchor, int i) {
        int i2 = constraintAnchor.mGroup;
        if (constraintAnchor.mOwner.getParent() == null) {
            return i;
        }
        if (i2 <= i) {
            return i2;
        }
        constraintAnchor.mGroup = i;
        ConstraintAnchor opposite = constraintAnchor.getOpposite();
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        i2 = opposite != null ? setGroup(opposite, i) : i;
        if (constraintAnchor2 != null) {
            i2 = setGroup(constraintAnchor2, i2);
        }
        if (opposite != null) {
            i2 = setGroup(opposite, i2);
        }
        constraintAnchor.mGroup = i2;
        return i2;
    }

    /* Access modifiers changed, original: 0000 */
    public void addChain(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            while (constraintWidget.mLeft.mTarget != null && constraintWidget.mLeft.mTarget.mOwner.mRight.mTarget != null && constraintWidget.mLeft.mTarget.mOwner.mRight.mTarget == constraintWidget.mLeft && constraintWidget.mLeft.mTarget.mOwner != constraintWidget) {
                constraintWidget = constraintWidget.mLeft.mTarget.mOwner;
            }
            addHorizontalChain(constraintWidget);
        } else if (i == 1) {
            while (constraintWidget.mTop.mTarget != null && constraintWidget.mTop.mTarget.mOwner.mBottom.mTarget != null && constraintWidget.mTop.mTarget.mOwner.mBottom.mTarget == constraintWidget.mTop && constraintWidget.mTop.mTarget.mOwner != constraintWidget) {
                constraintWidget = constraintWidget.mTop.mTarget.mOwner;
            }
            addVerticalChain(constraintWidget);
        }
    }

    public boolean addChildrenToSolver(LinearSystem linearSystem, int i) {
        int i2;
        boolean z;
        addToSolver(linearSystem, i);
        int size = this.mChildren.size();
        if (this.mOptimizationLevel != 2 && this.mOptimizationLevel != 4) {
            i2 = 0;
            z = true;
        } else if (optimize(linearSystem)) {
            return false;
        } else {
            i2 = 0;
            z = false;
        }
        while (i2 < size) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.mChildren.get(i2);
            if (constraintWidget instanceof ConstraintWidgetContainer) {
                DimensionBehaviour dimensionBehaviour = constraintWidget.mHorizontalDimensionBehaviour;
                DimensionBehaviour dimensionBehaviour2 = constraintWidget.mVerticalDimensionBehaviour;
                if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                }
                if (dimensionBehaviour2 == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
                }
                constraintWidget.addToSolver(linearSystem, i);
                if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (dimensionBehaviour2 == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.setVerticalDimensionBehaviour(dimensionBehaviour2);
                }
            } else {
                if (z) {
                    Optimizer.checkMatchParent(this, linearSystem, constraintWidget);
                }
                constraintWidget.addToSolver(linearSystem, i);
            }
            i2++;
        }
        if (this.mHorizontalChainsSize > 0) {
            applyHorizontalChain(linearSystem);
        }
        if (this.mVerticalChainsSize > 0) {
            applyVerticalChain(linearSystem);
        }
        return USE_SNAPSHOT;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void findHorizontalWrapRecursive(ConstraintWidget constraintWidget, boolean[] zArr) {
        ConstraintWidget constraintWidget2 = null;
        boolean z = USE_SNAPSHOT;
        if (constraintWidget.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mDimensionRatio > 0.0f) {
            zArr[0] = false;
            return;
        }
        int optimizerWrapWidth = constraintWidget.getOptimizerWrapWidth();
        if (constraintWidget.mHorizontalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mDimensionRatio <= 0.0f) {
            int relativeEnd;
            int i;
            constraintWidget.mHorizontalWrapVisited = USE_SNAPSHOT;
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    int relativeBegin;
                    if (guideline.getRelativeBegin() != -1) {
                        relativeBegin = guideline.getRelativeBegin();
                    } else if (guideline.getRelativeEnd() != -1) {
                        relativeEnd = guideline.getRelativeEnd();
                        i = 0;
                    } else {
                        relativeBegin = 0;
                    }
                    relativeEnd = 0;
                    i = relativeBegin;
                } else {
                    relativeEnd = optimizerWrapWidth;
                    i = optimizerWrapWidth;
                }
            } else if (!constraintWidget.mRight.isConnected() && !constraintWidget.mLeft.isConnected()) {
                relativeEnd = optimizerWrapWidth;
                i = constraintWidget.getX() + optimizerWrapWidth;
            } else if (constraintWidget.mRight.mTarget == null || constraintWidget.mLeft.mTarget == null || (constraintWidget.mRight.mTarget != constraintWidget.mLeft.mTarget && (constraintWidget.mRight.mTarget.mOwner != constraintWidget.mLeft.mTarget.mOwner || constraintWidget.mRight.mTarget.mOwner == constraintWidget.mParent))) {
                ConstraintWidget constraintWidget3;
                if (constraintWidget.mRight.mTarget != null) {
                    constraintWidget3 = constraintWidget.mRight.mTarget.mOwner;
                    i = constraintWidget.mRight.getMargin() + optimizerWrapWidth;
                    if (!(constraintWidget3.isRoot() || constraintWidget3.mHorizontalWrapVisited)) {
                        findHorizontalWrapRecursive(constraintWidget3, zArr);
                    }
                } else {
                    constraintWidget3 = null;
                    i = optimizerWrapWidth;
                }
                if (constraintWidget.mLeft.mTarget != null) {
                    constraintWidget2 = constraintWidget.mLeft.mTarget.mOwner;
                    optimizerWrapWidth += constraintWidget.mLeft.getMargin();
                    if (!(constraintWidget2.isRoot() || constraintWidget2.mHorizontalWrapVisited)) {
                        findHorizontalWrapRecursive(constraintWidget2, zArr);
                    }
                }
                if (!(constraintWidget.mRight.mTarget == null || constraintWidget3.isRoot())) {
                    if (constraintWidget.mRight.mTarget.mType == Type.RIGHT) {
                        i += constraintWidget3.mDistToRight - constraintWidget3.getOptimizerWrapWidth();
                    } else if (constraintWidget.mRight.mTarget.getType() == Type.LEFT) {
                        i += constraintWidget3.mDistToRight;
                    }
                    boolean z2 = (constraintWidget3.mRightHasCentered || !(constraintWidget3.mLeft.mTarget == null || constraintWidget3.mRight.mTarget == null || constraintWidget3.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT)) ? USE_SNAPSHOT : false;
                    constraintWidget.mRightHasCentered = z2;
                    if (constraintWidget.mRightHasCentered && (constraintWidget3.mLeft.mTarget == null || constraintWidget3.mLeft.mTarget.mOwner != constraintWidget)) {
                        i += i - constraintWidget3.mDistToRight;
                    }
                }
                if (!(constraintWidget.mLeft.mTarget == null || constraintWidget2.isRoot())) {
                    if (constraintWidget.mLeft.mTarget.getType() == Type.LEFT) {
                        optimizerWrapWidth += constraintWidget2.mDistToLeft - constraintWidget2.getOptimizerWrapWidth();
                    } else if (constraintWidget.mLeft.mTarget.getType() == Type.RIGHT) {
                        optimizerWrapWidth += constraintWidget2.mDistToLeft;
                    }
                    if (!constraintWidget2.mLeftHasCentered && (constraintWidget2.mLeft.mTarget == null || constraintWidget2.mRight.mTarget == null || constraintWidget2.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT)) {
                        z = false;
                    }
                    constraintWidget.mLeftHasCentered = z;
                    if (constraintWidget.mLeftHasCentered && (constraintWidget2.mRight.mTarget == null || constraintWidget2.mRight.mTarget.mOwner != constraintWidget)) {
                        optimizerWrapWidth += optimizerWrapWidth - constraintWidget2.mDistToLeft;
                        relativeEnd = i;
                        if (constraintWidget.getVisibility() == 8) {
                            optimizerWrapWidth -= constraintWidget.mWidth;
                            relativeEnd -= constraintWidget.mWidth;
                        }
                        constraintWidget.mDistToLeft = optimizerWrapWidth;
                        constraintWidget.mDistToRight = relativeEnd;
                        return;
                    }
                }
                relativeEnd = i;
                if (constraintWidget.getVisibility() == 8) {
                }
                constraintWidget.mDistToLeft = optimizerWrapWidth;
                constraintWidget.mDistToRight = relativeEnd;
                return;
            } else {
                zArr[0] = false;
                return;
            }
            optimizerWrapWidth = i;
            if (constraintWidget.getVisibility() == 8) {
            }
            constraintWidget.mDistToLeft = optimizerWrapWidth;
            constraintWidget.mDistToRight = relativeEnd;
            return;
        }
        zArr[0] = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void findVerticalWrapRecursive(ConstraintWidget constraintWidget, boolean[] zArr) {
        ConstraintWidget constraintWidget2 = null;
        boolean z = USE_SNAPSHOT;
        if (constraintWidget.mVerticalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mDimensionRatio <= 0.0f) {
            int relativeEnd;
            int i;
            int optimizerWrapHeight = constraintWidget.getOptimizerWrapHeight();
            constraintWidget.mVerticalWrapVisited = USE_SNAPSHOT;
            int relativeBegin;
            ConstraintWidget owner;
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 0) {
                    if (guideline.getRelativeBegin() != -1) {
                        relativeBegin = guideline.getRelativeBegin();
                    } else if (guideline.getRelativeEnd() != -1) {
                        relativeEnd = guideline.getRelativeEnd();
                        i = 0;
                    } else {
                        relativeBegin = 0;
                    }
                    relativeEnd = 0;
                    i = relativeBegin;
                } else {
                    relativeEnd = optimizerWrapHeight;
                    i = optimizerWrapHeight;
                }
            } else if (constraintWidget.mBaseline.mTarget == null && constraintWidget.mTop.mTarget == null && constraintWidget.mBottom.mTarget == null) {
                relativeEnd = optimizerWrapHeight;
                i = constraintWidget.getY() + optimizerWrapHeight;
            } else if (constraintWidget.mBottom.mTarget != null && constraintWidget.mTop.mTarget != null && (constraintWidget.mBottom.mTarget == constraintWidget.mTop.mTarget || (constraintWidget.mBottom.mTarget.mOwner == constraintWidget.mTop.mTarget.mOwner && constraintWidget.mBottom.mTarget.mOwner != constraintWidget.mParent))) {
                zArr[0] = false;
                return;
            } else if (constraintWidget.mBaseline.isConnected()) {
                owner = constraintWidget.mBaseline.mTarget.getOwner();
                if (!owner.mVerticalWrapVisited) {
                    findVerticalWrapRecursive(owner, zArr);
                }
                int max = Math.max((owner.mDistToTop - owner.mHeight) + optimizerWrapHeight, optimizerWrapHeight);
                relativeBegin = Math.max((owner.mDistToBottom - owner.mHeight) + optimizerWrapHeight, optimizerWrapHeight);
                if (constraintWidget.getVisibility() == 8) {
                    max -= constraintWidget.mHeight;
                    relativeBegin -= constraintWidget.mHeight;
                }
                constraintWidget.mDistToTop = max;
                constraintWidget.mDistToBottom = relativeBegin;
                return;
            } else {
                if (constraintWidget.mTop.isConnected()) {
                    owner = constraintWidget.mTop.mTarget.getOwner();
                    i = constraintWidget.mTop.getMargin() + optimizerWrapHeight;
                    if (!(owner.isRoot() || owner.mVerticalWrapVisited)) {
                        findVerticalWrapRecursive(owner, zArr);
                    }
                } else {
                    owner = null;
                    i = optimizerWrapHeight;
                }
                if (constraintWidget.mBottom.isConnected()) {
                    constraintWidget2 = constraintWidget.mBottom.mTarget.getOwner();
                    optimizerWrapHeight += constraintWidget.mBottom.getMargin();
                    if (!(constraintWidget2.isRoot() || constraintWidget2.mVerticalWrapVisited)) {
                        findVerticalWrapRecursive(constraintWidget2, zArr);
                    }
                }
                if (!(constraintWidget.mTop.mTarget == null || owner.isRoot())) {
                    if (constraintWidget.mTop.mTarget.getType() == Type.TOP) {
                        i += owner.mDistToTop - owner.getOptimizerWrapHeight();
                    } else if (constraintWidget.mTop.mTarget.getType() == Type.BOTTOM) {
                        i += owner.mDistToTop;
                    }
                    boolean z2 = (owner.mTopHasCentered || !(owner.mTop.mTarget == null || owner.mTop.mTarget.mOwner == constraintWidget || owner.mBottom.mTarget == null || owner.mBottom.mTarget.mOwner == constraintWidget || owner.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT)) ? USE_SNAPSHOT : false;
                    constraintWidget.mTopHasCentered = z2;
                    if (constraintWidget.mTopHasCentered && (owner.mBottom.mTarget == null || owner.mBottom.mTarget.mOwner != constraintWidget)) {
                        i += i - owner.mDistToTop;
                    }
                }
                if (!(constraintWidget.mBottom.mTarget == null || constraintWidget2.isRoot())) {
                    if (constraintWidget.mBottom.mTarget.getType() == Type.BOTTOM) {
                        optimizerWrapHeight += constraintWidget2.mDistToBottom - constraintWidget2.getOptimizerWrapHeight();
                    } else if (constraintWidget.mBottom.mTarget.getType() == Type.TOP) {
                        optimizerWrapHeight += constraintWidget2.mDistToBottom;
                    }
                    if (!constraintWidget2.mBottomHasCentered && (constraintWidget2.mTop.mTarget == null || constraintWidget2.mTop.mTarget.mOwner == constraintWidget || constraintWidget2.mBottom.mTarget == null || constraintWidget2.mBottom.mTarget.mOwner == constraintWidget || constraintWidget2.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT)) {
                        z = false;
                    }
                    constraintWidget.mBottomHasCentered = z;
                    if (constraintWidget.mBottomHasCentered && (constraintWidget2.mTop.mTarget == null || constraintWidget2.mTop.mTarget.mOwner != constraintWidget)) {
                        optimizerWrapHeight += optimizerWrapHeight - constraintWidget2.mDistToBottom;
                    }
                }
                if (constraintWidget.getVisibility() == 8) {
                    i -= constraintWidget.mHeight;
                    optimizerWrapHeight -= constraintWidget.mHeight;
                }
                constraintWidget.mDistToTop = i;
                constraintWidget.mDistToBottom = optimizerWrapHeight;
                return;
            }
            optimizerWrapHeight = relativeEnd;
            if (constraintWidget.getVisibility() == 8) {
            }
            constraintWidget.mDistToTop = i;
            constraintWidget.mDistToBottom = optimizerWrapHeight;
            return;
        }
        zArr[0] = false;
    }

    public void findWrapSize(ArrayList<ConstraintWidget> arrayList, boolean[] zArr) {
        ConstraintWidget constraintWidget;
        int i;
        int size = arrayList.size();
        zArr[0] = USE_SNAPSHOT;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            constraintWidget = (ConstraintWidget) arrayList.get(i8);
            if (!constraintWidget.isRoot()) {
                if (!constraintWidget.mHorizontalWrapVisited) {
                    findHorizontalWrapRecursive(constraintWidget, zArr);
                }
                if (!constraintWidget.mVerticalWrapVisited) {
                    findVerticalWrapRecursive(constraintWidget, zArr);
                }
                if (zArr[0]) {
                    i = constraintWidget.mDistToLeft;
                    int i9 = constraintWidget.mDistToRight;
                    int width = constraintWidget.getWidth();
                    int i10 = constraintWidget.mDistToTop;
                    int i11 = constraintWidget.mDistToBottom;
                    int height = constraintWidget.getHeight();
                    i = constraintWidget.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_PARENT ? (constraintWidget.getWidth() + constraintWidget.mLeft.mMargin) + constraintWidget.mRight.mMargin : (i + i9) - width;
                    i9 = constraintWidget.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_PARENT ? (constraintWidget.getHeight() + constraintWidget.mTop.mMargin) + constraintWidget.mBottom.mMargin : (i10 + i11) - height;
                    if (constraintWidget.getVisibility() == 8) {
                        i = 0;
                        i9 = 0;
                    }
                    i2 = Math.max(i2, constraintWidget.mDistToLeft);
                    i3 = Math.max(i3, constraintWidget.mDistToRight);
                    i6 = Math.max(i6, constraintWidget.mDistToBottom);
                    i5 = Math.max(i5, constraintWidget.mDistToTop);
                    i4 = Math.max(i4, i);
                    i7 = Math.max(i7, i9);
                } else {
                    return;
                }
            }
            i8++;
            i2 = i2;
            i3 = i3;
            i6 = i6;
        }
        this.mWrapWidth = Math.max(this.mMinWidth, Math.max(Math.max(i2, i3), i4));
        this.mWrapHeight = Math.max(this.mMinHeight, Math.max(Math.max(i5, i6), i7));
        for (i = 0; i < size; i++) {
            constraintWidget = (ConstraintWidget) arrayList.get(i);
            constraintWidget.mHorizontalWrapVisited = false;
            constraintWidget.mVerticalWrapVisited = false;
            constraintWidget.mLeftHasCentered = false;
            constraintWidget.mRightHasCentered = false;
            constraintWidget.mTopHasCentered = false;
            constraintWidget.mBottomHasCentered = false;
        }
    }

    public ArrayList<Guideline> getHorizontalGuidelines() {
        ArrayList arrayList = new ArrayList();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.mChildren.get(i);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 0) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public LinearSystem getSystem() {
        return this.mSystem;
    }

    public String getType() {
        return "ConstraintLayout";
    }

    public ArrayList<Guideline> getVerticalGuidelines() {
        ArrayList arrayList = new ArrayList();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.mChildren.get(i);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public boolean handlesInternalConstraints() {
        return false;
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.mHeightMeasuredTooSmall;
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.mWidthMeasuredTooSmall;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layout() {
        boolean z;
        boolean z2;
        int i;
        ConstraintWidget constraintWidget;
        Exception e;
        int i2;
        int max;
        int i3 = this.mX;
        int i4 = this.mY;
        int max2 = Math.max(0, getWidth());
        int max3 = Math.max(0, getHeight());
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        if (this.mParent != null) {
            if (this.mSnapshot == null) {
                this.mSnapshot = new Snapshot(this);
            }
            this.mSnapshot.updateFrom(this);
            setX(this.mPaddingLeft);
            setY(this.mPaddingTop);
            resetAnchors();
            resetSolverVariables(this.mSystem.getCache());
        } else {
            this.mX = 0;
            this.mY = 0;
        }
        DimensionBehaviour dimensionBehaviour = this.mVerticalDimensionBehaviour;
        DimensionBehaviour dimensionBehaviour2 = this.mHorizontalDimensionBehaviour;
        if (this.mOptimizationLevel == 2 && (this.mVerticalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT || this.mHorizontalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT)) {
            findWrapSize(this.mChildren, this.flags);
            z = this.flags[0];
            if (max2 > 0 && max3 > 0 && (this.mWrapWidth > max2 || this.mWrapHeight > max3)) {
                z = false;
            }
            if (z) {
                if (this.mHorizontalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                    this.mHorizontalDimensionBehaviour = DimensionBehaviour.FIXED;
                    if (max2 <= 0 || max2 >= this.mWrapWidth) {
                        setWidth(Math.max(this.mMinWidth, this.mWrapWidth));
                    } else {
                        this.mWidthMeasuredTooSmall = USE_SNAPSHOT;
                        setWidth(max2);
                    }
                }
                if (this.mVerticalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                    this.mVerticalDimensionBehaviour = DimensionBehaviour.FIXED;
                    if (max3 <= 0 || max3 >= this.mWrapHeight) {
                        setHeight(Math.max(this.mMinHeight, this.mWrapHeight));
                        z2 = z;
                    } else {
                        this.mHeightMeasuredTooSmall = USE_SNAPSHOT;
                        setHeight(max3);
                        z2 = z;
                    }
                }
            }
            z2 = z;
        } else {
            z2 = false;
        }
        resetChains();
        int size = this.mChildren.size();
        for (i = 0; i < size; i++) {
            constraintWidget = (ConstraintWidget) this.mChildren.get(i);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).layout();
            }
        }
        boolean z3 = USE_SNAPSHOT;
        boolean z4 = z2;
        int i5 = 0;
        while (z3) {
            int i6 = i5 + 1;
            try {
                this.mSystem.reset();
                z2 = addChildrenToSolver(this.mSystem, Integer.MAX_VALUE);
                if (z2) {
                    try {
                        this.mSystem.minimize();
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        if (!z2) {
                        }
                        if (i6 < 8) {
                        }
                        z2 = false;
                        z = z4;
                        i = Math.max(this.mMinWidth, getWidth());
                        if (i > getWidth()) {
                        }
                        i = Math.max(this.mMinHeight, getHeight());
                        if (i <= getHeight()) {
                        }
                        if (z3) {
                        }
                        z2 = z3;
                        z3 = z;
                        z4 = z2;
                        i5 = i6;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                z2 = z3;
            }
            if (!z2) {
                updateFromSolver(this.mSystem, Integer.MAX_VALUE);
                i2 = 0;
                while (i2 < size) {
                    constraintWidget = (ConstraintWidget) this.mChildren.get(i2);
                    if (constraintWidget.mHorizontalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.getWidth() >= constraintWidget.getWrapWidth()) {
                        if (constraintWidget.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.getHeight() < constraintWidget.getWrapHeight()) {
                            this.flags[2] = USE_SNAPSHOT;
                            break;
                        }
                        i2++;
                    } else {
                        this.flags[2] = USE_SNAPSHOT;
                        break;
                    }
                }
            }
            updateChildrenFromSolver(this.mSystem, Integer.MAX_VALUE, this.flags);
            if (i6 < 8 || !this.flags[2]) {
                z2 = false;
                z = z4;
            } else {
                i5 = 0;
                i2 = 0;
                for (i = 0; i < size; i++) {
                    constraintWidget = (ConstraintWidget) this.mChildren.get(i);
                    i2 = Math.max(i2, constraintWidget.mX + constraintWidget.getWidth());
                    i5 = Math.max(i5, constraintWidget.getHeight() + constraintWidget.mY);
                }
                max = Math.max(this.mMinWidth, i2);
                i = Math.max(this.mMinHeight, i5);
                if (dimensionBehaviour2 != DimensionBehaviour.WRAP_CONTENT || getWidth() >= max) {
                    z2 = false;
                    z = z4;
                } else {
                    setWidth(max);
                    this.mHorizontalDimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                    z2 = USE_SNAPSHOT;
                    z = USE_SNAPSHOT;
                }
                if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT && getHeight() < i) {
                    setHeight(i);
                    this.mVerticalDimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                    z2 = USE_SNAPSHOT;
                    z = USE_SNAPSHOT;
                }
            }
            i = Math.max(this.mMinWidth, getWidth());
            if (i > getWidth()) {
                setWidth(i);
                this.mHorizontalDimensionBehaviour = DimensionBehaviour.FIXED;
                z2 = USE_SNAPSHOT;
                z = USE_SNAPSHOT;
            }
            i = Math.max(this.mMinHeight, getHeight());
            if (i <= getHeight()) {
                setHeight(i);
                this.mVerticalDimensionBehaviour = DimensionBehaviour.FIXED;
                z2 = USE_SNAPSHOT;
                z3 = USE_SNAPSHOT;
            } else {
                z3 = z;
            }
            if (z3) {
                if (this.mHorizontalDimensionBehaviour != DimensionBehaviour.WRAP_CONTENT || max2 <= 0 || getWidth() <= max2) {
                    z = z2;
                } else {
                    this.mWidthMeasuredTooSmall = USE_SNAPSHOT;
                    this.mHorizontalDimensionBehaviour = DimensionBehaviour.FIXED;
                    setWidth(max2);
                    z = USE_SNAPSHOT;
                    z3 = true;
                }
                if (this.mVerticalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT && max3 > 0 && getHeight() > max3) {
                    this.mHeightMeasuredTooSmall = USE_SNAPSHOT;
                    this.mVerticalDimensionBehaviour = DimensionBehaviour.FIXED;
                    setHeight(max3);
                    z = USE_SNAPSHOT;
                    z3 = USE_SNAPSHOT;
                }
            } else {
                z = z2;
            }
            z2 = z3;
            z3 = z;
            z4 = z2;
            i5 = i6;
        }
        if (this.mParent != null) {
            max = Math.max(this.mMinWidth, getWidth());
            i2 = Math.max(this.mMinHeight, getHeight());
            this.mSnapshot.applyTo(this);
            setWidth((max + this.mPaddingLeft) + this.mPaddingRight);
            setHeight((this.mPaddingTop + i2) + this.mPaddingBottom);
        } else {
            this.mX = i3;
            this.mY = i4;
        }
        if (z4) {
            this.mHorizontalDimensionBehaviour = dimensionBehaviour2;
            this.mVerticalDimensionBehaviour = dimensionBehaviour;
        }
        resetSolverVariables(this.mSystem.getCache());
        if (this == getRootConstraintContainer()) {
            updateDrawPosition();
        }
    }

    public int layoutFindGroups() {
        int i;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        Type[] typeArr = new Type[]{Type.LEFT, Type.RIGHT, Type.TOP, Type.BASELINE, Type.BOTTOM};
        int size = this.mChildren.size();
        int i2 = 1;
        for (i = 0; i < size; i++) {
            constraintWidget = (ConstraintWidget) this.mChildren.get(i);
            constraintAnchor = constraintWidget.mLeft;
            if (constraintAnchor.mTarget == null) {
                constraintAnchor.mGroup = Integer.MAX_VALUE;
            } else if (setGroup(constraintAnchor, i2) == i2) {
                i2++;
            }
            constraintAnchor = constraintWidget.mTop;
            if (constraintAnchor.mTarget == null) {
                constraintAnchor.mGroup = Integer.MAX_VALUE;
            } else if (setGroup(constraintAnchor, i2) == i2) {
                i2++;
            }
            constraintAnchor = constraintWidget.mRight;
            if (constraintAnchor.mTarget == null) {
                constraintAnchor.mGroup = Integer.MAX_VALUE;
            } else if (setGroup(constraintAnchor, i2) == i2) {
                i2++;
            }
            constraintAnchor = constraintWidget.mBottom;
            if (constraintAnchor.mTarget == null) {
                constraintAnchor.mGroup = Integer.MAX_VALUE;
            } else if (setGroup(constraintAnchor, i2) == i2) {
                i2++;
            }
            constraintAnchor2 = constraintWidget.mBaseline;
            if (constraintAnchor2.mTarget == null) {
                constraintAnchor2.mGroup = Integer.MAX_VALUE;
            } else if (setGroup(constraintAnchor2, i2) == i2) {
                i2++;
            }
        }
        i = 1;
        while (i != 0) {
            i = 0;
            for (int i3 = 0; i3 < size; i3++) {
                constraintWidget = (ConstraintWidget) this.mChildren.get(i3);
                for (Type type : typeArr) {
                    constraintAnchor = null;
                    switch (type) {
                        case LEFT:
                            constraintAnchor = constraintWidget.mLeft;
                            break;
                        case TOP:
                            constraintAnchor = constraintWidget.mTop;
                            break;
                        case RIGHT:
                            constraintAnchor = constraintWidget.mRight;
                            break;
                        case BOTTOM:
                            constraintAnchor = constraintWidget.mBottom;
                            break;
                        case BASELINE:
                            constraintAnchor = constraintWidget.mBaseline;
                            break;
                    }
                    ConstraintAnchor constraintAnchor3 = constraintAnchor.mTarget;
                    if (constraintAnchor3 != null) {
                        if (!(constraintAnchor3.mOwner.getParent() == null || constraintAnchor3.mGroup == constraintAnchor.mGroup)) {
                            i = constraintAnchor.mGroup > constraintAnchor3.mGroup ? constraintAnchor3.mGroup : constraintAnchor.mGroup;
                            constraintAnchor.mGroup = i;
                            constraintAnchor3.mGroup = i;
                            i = 1;
                        }
                        constraintAnchor3 = constraintAnchor3.getOpposite();
                        if (!(constraintAnchor3 == null || constraintAnchor3.mGroup == constraintAnchor.mGroup)) {
                            i = constraintAnchor.mGroup > constraintAnchor3.mGroup ? constraintAnchor3.mGroup : constraintAnchor.mGroup;
                            constraintAnchor.mGroup = i;
                            constraintAnchor3.mGroup = i;
                            i = 1;
                        }
                    }
                }
            }
        }
        int[] iArr = new int[((this.mChildren.size() * typeArr.length) + 1)];
        Arrays.fill(iArr, -1);
        i2 = 0;
        for (i = 0; i < size; i++) {
            int i4;
            constraintWidget = (ConstraintWidget) this.mChildren.get(i);
            ConstraintAnchor constraintAnchor4 = constraintWidget.mLeft;
            if (constraintAnchor4.mGroup != Integer.MAX_VALUE) {
                i4 = constraintAnchor4.mGroup;
                if (iArr[i4] == -1) {
                    iArr[i4] = i2;
                    i2++;
                }
                constraintAnchor4.mGroup = iArr[i4];
            }
            constraintAnchor4 = constraintWidget.mTop;
            if (constraintAnchor4.mGroup != Integer.MAX_VALUE) {
                i4 = constraintAnchor4.mGroup;
                if (iArr[i4] == -1) {
                    iArr[i4] = i2;
                    i2++;
                }
                constraintAnchor4.mGroup = iArr[i4];
            }
            constraintAnchor4 = constraintWidget.mRight;
            if (constraintAnchor4.mGroup != Integer.MAX_VALUE) {
                i4 = constraintAnchor4.mGroup;
                if (iArr[i4] == -1) {
                    iArr[i4] = i2;
                    i2++;
                }
                constraintAnchor4.mGroup = iArr[i4];
            }
            constraintAnchor4 = constraintWidget.mBottom;
            if (constraintAnchor4.mGroup != Integer.MAX_VALUE) {
                i4 = constraintAnchor4.mGroup;
                if (iArr[i4] == -1) {
                    iArr[i4] = i2;
                    i2++;
                }
                constraintAnchor4.mGroup = iArr[i4];
            }
            constraintAnchor2 = constraintWidget.mBaseline;
            if (constraintAnchor2.mGroup != Integer.MAX_VALUE) {
                int i5 = constraintAnchor2.mGroup;
                if (iArr[i5] == -1) {
                    iArr[i5] = i2;
                    i2++;
                }
                constraintAnchor2.mGroup = iArr[i5];
            }
        }
        return i2;
    }

    public int layoutFindGroupsSimple() {
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.mChildren.get(i);
            constraintWidget.mLeft.mGroup = 0;
            constraintWidget.mRight.mGroup = 0;
            constraintWidget.mTop.mGroup = 1;
            constraintWidget.mBottom.mGroup = 1;
            constraintWidget.mBaseline.mGroup = 1;
        }
        return 2;
    }

    public void layoutWithGroup(int i) {
        int i2 = 0;
        int i3 = this.mX;
        int i4 = this.mY;
        if (this.mParent != null) {
            if (this.mSnapshot == null) {
                this.mSnapshot = new Snapshot(this);
            }
            this.mSnapshot.updateFrom(this);
            this.mX = 0;
            this.mY = 0;
            resetAnchors();
            resetSolverVariables(this.mSystem.getCache());
        } else {
            this.mX = 0;
            this.mY = 0;
        }
        int size = this.mChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.mChildren.get(i5);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).layout();
            }
        }
        this.mLeft.mGroup = 0;
        this.mRight.mGroup = 0;
        this.mTop.mGroup = 1;
        this.mBottom.mGroup = 1;
        this.mSystem.reset();
        while (i2 < i) {
            try {
                addToSolver(this.mSystem, i2);
                this.mSystem.minimize();
                updateFromSolver(this.mSystem, i2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            updateFromSolver(this.mSystem, -2);
            i2++;
        }
        if (this.mParent != null) {
            int width = getWidth();
            i2 = getHeight();
            this.mSnapshot.applyTo(this);
            setWidth(width);
            setHeight(i2);
        } else {
            this.mX = i3;
            this.mY = i4;
        }
        if (this == getRootConstraintContainer()) {
            updateDrawPosition();
        }
    }

    public void reset() {
        this.mSystem.reset();
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        super.reset();
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.mPaddingLeft = i;
        this.mPaddingTop = i2;
        this.mPaddingRight = i3;
        this.mPaddingBottom = i4;
    }

    public void updateChildrenFromSolver(LinearSystem linearSystem, int i, boolean[] zArr) {
        zArr[2] = false;
        updateFromSolver(linearSystem, i);
        int size = this.mChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.mChildren.get(i2);
            constraintWidget.updateFromSolver(linearSystem, i);
            if (constraintWidget.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.getWidth() < constraintWidget.getWrapWidth()) {
                zArr[2] = USE_SNAPSHOT;
            }
            if (constraintWidget.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.getHeight() < constraintWidget.getWrapHeight()) {
                zArr[2] = USE_SNAPSHOT;
            }
        }
    }
}
