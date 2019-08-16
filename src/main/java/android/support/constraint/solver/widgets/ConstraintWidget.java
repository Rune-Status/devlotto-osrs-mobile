package android.support.constraint.solver.widgets;

import android.support.constraint.solver.ArrayRow;
import android.support.constraint.solver.Cache;
import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor.ConnectionType;
import android.support.constraint.solver.widgets.ConstraintAnchor.Strength;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import java.util.ArrayList;

public class ConstraintWidget {
    private static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    protected ArrayList<ConstraintAnchor> mAnchors;
    ConstraintAnchor mBaseline;
    int mBaselineDistance;
    ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    protected float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    private int mDrawHeight;
    private int mDrawWidth;
    private int mDrawX;
    private int mDrawY;
    int mHeight;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    DimensionBehaviour mHorizontalDimensionBehaviour;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    float mHorizontalWeight;
    boolean mHorizontalWrapVisited;
    ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    int mMatchConstraintDefaultHeight;
    int mMatchConstraintDefaultWidth;
    int mMatchConstraintMaxHeight;
    int mMatchConstraintMaxWidth;
    int mMatchConstraintMinHeight;
    int mMatchConstraintMinWidth;
    protected int mMinHeight;
    protected int mMinWidth;
    protected int mOffsetX;
    protected int mOffsetY;
    ConstraintWidget mParent;
    ConstraintAnchor mRight;
    boolean mRightHasCentered;
    private int mSolverBottom;
    private int mSolverLeft;
    private int mSolverRight;
    private int mSolverTop;
    ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    DimensionBehaviour mVerticalDimensionBehaviour;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    float mVerticalWeight;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    int mWidth;
    private int mWrapHeight;
    private int mWrapWidth;
    protected int mX;
    protected int mY;

    public enum ContentAlignment {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mLeft = new ConstraintAnchor(this, Type.LEFT);
        this.mTop = new ConstraintAnchor(this, Type.TOP);
        this.mRight = new ConstraintAnchor(this, Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, Type.CENTER);
        this.mAnchors = new ArrayList();
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mSolverLeft = 0;
        this.mSolverTop = 0;
        this.mSolverRight = 0;
        this.mSolverBottom = 0;
        this.mX = 0;
        this.mY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mHorizontalBiasPercent = DEFAULT_BIAS;
        this.mVerticalBiasPercent = DEFAULT_BIAS;
        this.mHorizontalDimensionBehaviour = DimensionBehaviour.FIXED;
        this.mVerticalDimensionBehaviour = DimensionBehaviour.FIXED;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalWeight = 0.0f;
        this.mVerticalWeight = 0.0f;
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        addAnchors();
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mLeft = new ConstraintAnchor(this, Type.LEFT);
        this.mTop = new ConstraintAnchor(this, Type.TOP);
        this.mRight = new ConstraintAnchor(this, Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, Type.CENTER);
        this.mAnchors = new ArrayList();
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mSolverLeft = 0;
        this.mSolverTop = 0;
        this.mSolverRight = 0;
        this.mSolverBottom = 0;
        this.mX = 0;
        this.mY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mHorizontalBiasPercent = DEFAULT_BIAS;
        this.mVerticalBiasPercent = DEFAULT_BIAS;
        this.mHorizontalDimensionBehaviour = DimensionBehaviour.FIXED;
        this.mVerticalDimensionBehaviour = DimensionBehaviour.FIXED;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalWeight = 0.0f;
        this.mVerticalWeight = 0.0f;
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.mX = i;
        this.mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
        forceUpdateDrawPosition();
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mBaseline);
    }

    private void applyConstraints(LinearSystem linearSystem, boolean z, boolean z2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintAnchor);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(constraintAnchor2);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        int margin = constraintAnchor.getMargin();
        int margin2 = constraintAnchor2.getMargin();
        if (this.mVisibility == 8) {
            z2 = true;
            i8 = 0;
        } else {
            i8 = i3;
        }
        if (createObjectVariable3 == null && createObjectVariable4 == null) {
            linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable, i));
            if (!z3) {
                if (z) {
                    linearSystem.addConstraint(LinearSystem.createRowEquals(linearSystem, createObjectVariable2, createObjectVariable, i4, true));
                } else if (z2) {
                    linearSystem.addConstraint(LinearSystem.createRowEquals(linearSystem, createObjectVariable2, createObjectVariable, i8, false));
                } else {
                    linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable2, i2));
                }
            }
        } else if (createObjectVariable3 != null && createObjectVariable4 == null) {
            linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable, createObjectVariable3, margin));
            if (z) {
                linearSystem.addConstraint(LinearSystem.createRowEquals(linearSystem, createObjectVariable2, createObjectVariable, i4, true));
            } else if (!z3) {
                if (z2) {
                    linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable2, createObjectVariable, i8));
                } else {
                    linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable2, i2));
                }
            }
        } else if (createObjectVariable3 == null && createObjectVariable4 != null) {
            linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable2, createObjectVariable4, margin2 * -1));
            if (z) {
                linearSystem.addConstraint(LinearSystem.createRowEquals(linearSystem, createObjectVariable2, createObjectVariable, i4, true));
            } else if (!z3) {
                if (z2) {
                    linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable2, createObjectVariable, i8));
                } else {
                    linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable, i));
                }
            }
        } else if (z2) {
            if (z) {
                linearSystem.addConstraint(LinearSystem.createRowEquals(linearSystem, createObjectVariable2, createObjectVariable, i4, true));
            } else {
                linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable2, createObjectVariable, i8));
            }
            if (constraintAnchor.getStrength() != constraintAnchor2.getStrength()) {
                SolverVariable createSlackVariable;
                if (constraintAnchor.getStrength() == Strength.STRONG) {
                    linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable, createObjectVariable3, margin));
                    createSlackVariable = linearSystem.createSlackVariable();
                    ArrayRow createRow = linearSystem.createRow();
                    createRow.createRowLowerThan(createObjectVariable2, createObjectVariable4, createSlackVariable, margin2 * -1);
                    linearSystem.addConstraint(createRow);
                    return;
                }
                createSlackVariable = linearSystem.createSlackVariable();
                ArrayRow createRow2 = linearSystem.createRow();
                createRow2.createRowGreaterThan(createObjectVariable, createObjectVariable3, createSlackVariable, margin);
                linearSystem.addConstraint(createRow2);
                linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable2, createObjectVariable4, margin2 * -1));
            } else if (createObjectVariable3 == createObjectVariable4) {
                linearSystem.addConstraint(LinearSystem.createRowCentering(linearSystem, createObjectVariable, createObjectVariable3, 0, 0.5f, createObjectVariable4, createObjectVariable2, 0, true));
            } else if (!z4) {
                linearSystem.addConstraint(LinearSystem.createRowGreaterThan(linearSystem, createObjectVariable, createObjectVariable3, margin, constraintAnchor.getConnectionType() != ConnectionType.STRICT));
                linearSystem.addConstraint(LinearSystem.createRowLowerThan(linearSystem, createObjectVariable2, createObjectVariable4, margin2 * -1, constraintAnchor2.getConnectionType() != ConnectionType.STRICT));
                linearSystem.addConstraint(LinearSystem.createRowCentering(linearSystem, createObjectVariable, createObjectVariable3, margin, f, createObjectVariable4, createObjectVariable2, margin2, false));
            }
        } else if (z3) {
            linearSystem.addGreaterThan(createObjectVariable, createObjectVariable3, margin, 3);
            linearSystem.addLowerThan(createObjectVariable2, createObjectVariable4, margin2 * -1, 3);
            linearSystem.addConstraint(LinearSystem.createRowCentering(linearSystem, createObjectVariable, createObjectVariable3, margin, f, createObjectVariable4, createObjectVariable2, margin2, true));
        } else if (!z4) {
            if (i5 == 1) {
                if (i6 > i8) {
                    i8 = i6;
                }
                if (i7 > 0) {
                    if (i7 >= i8) {
                        linearSystem.addLowerThan(createObjectVariable2, createObjectVariable, i7, 3);
                    }
                    linearSystem.addEquality(createObjectVariable2, createObjectVariable, i7, 3);
                    linearSystem.addGreaterThan(createObjectVariable, createObjectVariable3, margin, 2);
                    linearSystem.addLowerThan(createObjectVariable2, createObjectVariable4, -margin2, 2);
                    linearSystem.addCentering(createObjectVariable, createObjectVariable3, margin, f, createObjectVariable4, createObjectVariable2, margin2, 4);
                }
                i7 = i8;
                linearSystem.addEquality(createObjectVariable2, createObjectVariable, i7, 3);
                linearSystem.addGreaterThan(createObjectVariable, createObjectVariable3, margin, 2);
                linearSystem.addLowerThan(createObjectVariable2, createObjectVariable4, -margin2, 2);
                linearSystem.addCentering(createObjectVariable, createObjectVariable3, margin, f, createObjectVariable4, createObjectVariable2, margin2, 4);
            } else if (i6 == 0 && i7 == 0) {
                linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable, createObjectVariable3, margin));
                linearSystem.addConstraint(linearSystem.createRow().createRowEquals(createObjectVariable2, createObjectVariable4, margin2 * -1));
            } else {
                if (i7 > 0) {
                    linearSystem.addLowerThan(createObjectVariable2, createObjectVariable, i7, 3);
                }
                linearSystem.addGreaterThan(createObjectVariable, createObjectVariable3, margin, 2);
                linearSystem.addLowerThan(createObjectVariable2, createObjectVariable4, -margin2, 2);
                linearSystem.addCentering(createObjectVariable, createObjectVariable3, margin, f, createObjectVariable4, createObjectVariable2, margin2, 4);
            }
        }
    }

    public void addToSolver(LinearSystem linearSystem) {
        addToSolver(linearSystem, Integer.MAX_VALUE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:286:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05c7  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:285:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02c7 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:285:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addToSolver(LinearSystem linearSystem, int i) {
        SolverVariable createObjectVariable;
        boolean z;
        boolean z2;
        int i2;
        Object obj;
        boolean z3;
        int i3;
        Object obj2;
        int i4;
        int i5;
        float f;
        boolean z4;
        SolverVariable createObjectVariable2 = (i == Integer.MAX_VALUE || this.mLeft.mGroup == i) ? linearSystem.createObjectVariable(this.mLeft) : null;
        SolverVariable createObjectVariable3 = (i == Integer.MAX_VALUE || this.mRight.mGroup == i) ? linearSystem.createObjectVariable(this.mRight) : null;
        SolverVariable createObjectVariable4 = (i == Integer.MAX_VALUE || this.mTop.mGroup == i) ? linearSystem.createObjectVariable(this.mTop) : null;
        SolverVariable createObjectVariable5 = (i == Integer.MAX_VALUE || this.mBottom.mGroup == i) ? linearSystem.createObjectVariable(this.mBottom) : null;
        SolverVariable createObjectVariable6 = (i == Integer.MAX_VALUE || this.mBaseline.mGroup == i) ? linearSystem.createObjectVariable(this.mBaseline) : null;
        if (this.mParent != null) {
            boolean z5;
            boolean z6;
            ArrayRow createRow;
            if ((this.mLeft.mTarget == null || this.mLeft.mTarget.mTarget != this.mLeft) && (this.mRight.mTarget == null || this.mRight.mTarget.mTarget != this.mRight)) {
                z5 = false;
            } else {
                ((ConstraintWidgetContainer) this.mParent).addChain(this, 0);
                z5 = true;
            }
            if ((this.mTop.mTarget == null || this.mTop.mTarget.mTarget != this.mTop) && (this.mBottom.mTarget == null || this.mBottom.mTarget.mTarget != this.mBottom)) {
                z6 = false;
            } else {
                ((ConstraintWidgetContainer) this.mParent).addChain(this, 1);
                z6 = true;
            }
            if (this.mParent.getHorizontalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT && !z5) {
                if (this.mLeft.mTarget == null || this.mLeft.mTarget.mOwner != this.mParent) {
                    createObjectVariable = linearSystem.createObjectVariable(this.mParent.mLeft);
                    createRow = linearSystem.createRow();
                    createRow.createRowGreaterThan(createObjectVariable2, createObjectVariable, linearSystem.createSlackVariable(), 0);
                    linearSystem.addConstraint(createRow);
                } else if (this.mLeft.mTarget != null && this.mLeft.mTarget.mOwner == this.mParent) {
                    this.mLeft.setConnectionType(ConnectionType.STRICT);
                }
                if (this.mRight.mTarget == null || this.mRight.mTarget.mOwner != this.mParent) {
                    createObjectVariable = linearSystem.createObjectVariable(this.mParent.mRight);
                    createRow = linearSystem.createRow();
                    createRow.createRowGreaterThan(createObjectVariable, createObjectVariable3, linearSystem.createSlackVariable(), 0);
                    linearSystem.addConstraint(createRow);
                } else if (this.mRight.mTarget != null && this.mRight.mTarget.mOwner == this.mParent) {
                    this.mRight.setConnectionType(ConnectionType.STRICT);
                }
            }
            if (this.mParent.getVerticalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT && !z6) {
                if (this.mTop.mTarget == null || this.mTop.mTarget.mOwner != this.mParent) {
                    createObjectVariable = linearSystem.createObjectVariable(this.mParent.mTop);
                    createRow = linearSystem.createRow();
                    createRow.createRowGreaterThan(createObjectVariable4, createObjectVariable, linearSystem.createSlackVariable(), 0);
                    linearSystem.addConstraint(createRow);
                } else if (this.mTop.mTarget != null && this.mTop.mTarget.mOwner == this.mParent) {
                    this.mTop.setConnectionType(ConnectionType.STRICT);
                }
                if (this.mBottom.mTarget == null || this.mBottom.mTarget.mOwner != this.mParent) {
                    createObjectVariable = linearSystem.createObjectVariable(this.mParent.mBottom);
                    createRow = linearSystem.createRow();
                    createRow.createRowGreaterThan(createObjectVariable, createObjectVariable5, linearSystem.createSlackVariable(), 0);
                    linearSystem.addConstraint(createRow);
                } else if (this.mBottom.mTarget != null && this.mBottom.mTarget.mOwner == this.mParent) {
                    this.mBottom.setConnectionType(ConnectionType.STRICT);
                }
            }
            z = z5;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        int i6 = this.mWidth;
        if (i6 < this.mMinWidth) {
            i6 = this.mMinWidth;
        }
        int i7 = this.mHeight;
        if (i7 < this.mMinHeight) {
            i7 = this.mMinHeight;
        }
        boolean z7 = this.mHorizontalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z8 = this.mVerticalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z9 = (z7 || this.mLeft == null || this.mRight == null || !(this.mLeft.mTarget == null || this.mRight.mTarget == null)) ? z7 : true;
        z7 = (z8 || this.mTop == null || this.mBottom == null || (!(this.mTop.mTarget == null || this.mBottom.mTarget == null) || (this.mBaselineDistance != 0 && (this.mBaseline == null || !(this.mTop.mTarget == null || this.mBaseline.mTarget == null))))) ? z8 : true;
        int i8 = this.mDimensionRatioSide;
        float f2 = this.mDimensionRatio;
        if (this.mDimensionRatio > 0.0f && this.mVisibility != 8) {
            if (this.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT && this.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                float f3;
                if (z9 && !z7) {
                    i2 = 0;
                    f3 = f2;
                } else if (z9 || !z7) {
                    i2 = i8;
                    f3 = f2;
                } else {
                    i2 = 1;
                    f3 = this.mDimensionRatioSide == -1 ? 1.0f / f2 : f2;
                }
                obj = 1;
                f2 = f3;
                z8 = z9;
                z3 = z7;
                i3 = i6;
                obj2 = obj;
                i4 = i2;
                i5 = i7;
                f = f2;
                if (obj2 == null) {
                }
                if (this.mHorizontalDimensionBehaviour != DimensionBehaviour.WRAP_CONTENT) {
                }
                if (z4) {
                }
                applyConstraints(linearSystem, z7, z8, this.mLeft, this.mRight, this.mX, this.mX + i3, i3, this.mMinWidth, this.mHorizontalBiasPercent, z4, z, this.mMatchConstraintDefaultWidth, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth);
                if (this.mVerticalResolution != 2) {
                }
            } else {
                SolverVariable createObjectVariable7;
                SolverVariable createObjectVariable8;
                SolverVariable createObjectVariable9;
                if (this.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                    z8 = true;
                    z3 = z7;
                    i3 = (int) (((float) this.mHeight) * f2);
                    obj2 = null;
                    i4 = 0;
                    i5 = i7;
                    f = f2;
                } else if (this.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                    if (this.mDimensionRatioSide == -1) {
                        f2 = 1.0f / f2;
                    }
                    z8 = z9;
                    z3 = true;
                    i3 = i6;
                    obj2 = null;
                    i4 = 1;
                    i5 = (int) (((float) this.mWidth) * f2);
                    f = f2;
                }
                z4 = obj2 == null && (i4 == 0 || i4 == -1);
                z7 = this.mHorizontalDimensionBehaviour != DimensionBehaviour.WRAP_CONTENT && (this instanceof ConstraintWidgetContainer);
                if (this.mHorizontalResolution != 2 && (i == Integer.MAX_VALUE || (this.mLeft.mGroup == i && this.mRight.mGroup == i))) {
                    if (z4 || this.mLeft.mTarget == null || this.mRight.mTarget == null) {
                        applyConstraints(linearSystem, z7, z8, this.mLeft, this.mRight, this.mX, this.mX + i3, i3, this.mMinWidth, this.mHorizontalBiasPercent, z4, z, this.mMatchConstraintDefaultWidth, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth);
                    } else {
                        createObjectVariable7 = linearSystem.createObjectVariable(this.mLeft);
                        createObjectVariable8 = linearSystem.createObjectVariable(this.mRight);
                        createObjectVariable = linearSystem.createObjectVariable(this.mLeft.getTarget());
                        createObjectVariable9 = linearSystem.createObjectVariable(this.mRight.getTarget());
                        linearSystem.addGreaterThan(createObjectVariable7, createObjectVariable, this.mLeft.getMargin(), 3);
                        linearSystem.addLowerThan(createObjectVariable8, createObjectVariable9, this.mRight.getMargin() * -1, 3);
                        if (!z) {
                            linearSystem.addCentering(createObjectVariable7, createObjectVariable, this.mLeft.getMargin(), this.mHorizontalBiasPercent, createObjectVariable9, createObjectVariable8, this.mRight.getMargin(), 4);
                        }
                    }
                }
                if (this.mVerticalResolution != 2) {
                    SolverVariable solverVariable;
                    SolverVariable solverVariable2;
                    z7 = this.mVerticalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT && (this instanceof ConstraintWidgetContainer);
                    z4 = obj2 != null && (i4 == 1 || i4 == -1);
                    if (this.mBaselineDistance > 0) {
                        ConstraintAnchor constraintAnchor = this.mBottom;
                        if (i == Integer.MAX_VALUE || (this.mBottom.mGroup == i && this.mBaseline.mGroup == i)) {
                            linearSystem.addEquality(createObjectVariable6, createObjectVariable4, getBaselineDistance(), 5);
                        }
                        if (this.mBaseline.mTarget != null) {
                            i3 = this.mBaselineDistance;
                            constraintAnchor = this.mBaseline;
                        } else {
                            i3 = i5;
                        }
                        if (i != Integer.MAX_VALUE && (this.mTop.mGroup != i || constraintAnchor.mGroup != i)) {
                            solverVariable = createObjectVariable4;
                        } else if (!z4 || this.mTop.mTarget == null || this.mBottom.mTarget == null) {
                            applyConstraints(linearSystem, z7, z3, this.mTop, constraintAnchor, this.mY, this.mY + i3, i3, this.mMinHeight, this.mVerticalBiasPercent, z4, z2, this.mMatchConstraintDefaultHeight, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight);
                            linearSystem.addEquality(createObjectVariable5, createObjectVariable4, i5, 5);
                            solverVariable = createObjectVariable4;
                        } else {
                            createObjectVariable7 = linearSystem.createObjectVariable(this.mTop);
                            createObjectVariable8 = linearSystem.createObjectVariable(this.mBottom);
                            createObjectVariable = linearSystem.createObjectVariable(this.mTop.getTarget());
                            createObjectVariable9 = linearSystem.createObjectVariable(this.mBottom.getTarget());
                            linearSystem.addGreaterThan(createObjectVariable7, createObjectVariable, this.mTop.getMargin(), 3);
                            linearSystem.addLowerThan(createObjectVariable8, createObjectVariable9, this.mBottom.getMargin() * -1, 3);
                            if (!z2) {
                                linearSystem.addCentering(createObjectVariable7, createObjectVariable, this.mTop.getMargin(), this.mVerticalBiasPercent, createObjectVariable9, createObjectVariable8, this.mBottom.getMargin(), 4);
                            }
                            solverVariable = createObjectVariable4;
                        }
                    } else {
                        if (i == Integer.MAX_VALUE || (this.mTop.mGroup == i && this.mBottom.mGroup == i)) {
                            if (!z4 || this.mTop.mTarget == null || this.mBottom.mTarget == null) {
                                applyConstraints(linearSystem, z7, z3, this.mTop, this.mBottom, this.mY, this.mY + i5, i5, this.mMinHeight, this.mVerticalBiasPercent, z4, z2, this.mMatchConstraintDefaultHeight, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight);
                                solverVariable2 = createObjectVariable4;
                                if (obj2 == null) {
                                    ArrayRow createRow2 = linearSystem.createRow();
                                    if (i != Integer.MAX_VALUE && (this.mLeft.mGroup != i || this.mRight.mGroup != i)) {
                                        return;
                                    }
                                    if (i4 == 0) {
                                        linearSystem.addConstraint(createRow2.createRowDimensionRatio(createObjectVariable3, createObjectVariable2, createObjectVariable5, solverVariable2, f));
                                        return;
                                    } else if (i4 == 1) {
                                        linearSystem.addConstraint(createRow2.createRowDimensionRatio(createObjectVariable5, solverVariable2, createObjectVariable3, createObjectVariable2, f));
                                        return;
                                    } else {
                                        if (this.mMatchConstraintMinWidth > 0) {
                                            linearSystem.addGreaterThan(createObjectVariable3, createObjectVariable2, this.mMatchConstraintMinWidth, 3);
                                        }
                                        if (this.mMatchConstraintMinHeight > 0) {
                                            linearSystem.addGreaterThan(createObjectVariable5, solverVariable2, this.mMatchConstraintMinHeight, 3);
                                        }
                                        createRow2.createRowDimensionRatio(createObjectVariable3, createObjectVariable2, createObjectVariable5, solverVariable2, f);
                                        createObjectVariable7 = linearSystem.createErrorVariable();
                                        createObjectVariable = linearSystem.createErrorVariable();
                                        createObjectVariable7.strength = 4;
                                        createObjectVariable.strength = 4;
                                        createRow2.addError(createObjectVariable7, createObjectVariable);
                                        linearSystem.addConstraint(createRow2);
                                        return;
                                    }
                                }
                                return;
                            }
                            createObjectVariable7 = linearSystem.createObjectVariable(this.mTop);
                            createObjectVariable8 = linearSystem.createObjectVariable(this.mBottom);
                            createObjectVariable = linearSystem.createObjectVariable(this.mTop.getTarget());
                            createObjectVariable9 = linearSystem.createObjectVariable(this.mBottom.getTarget());
                            linearSystem.addGreaterThan(createObjectVariable7, createObjectVariable, this.mTop.getMargin(), 3);
                            linearSystem.addLowerThan(createObjectVariable8, createObjectVariable9, this.mBottom.getMargin() * -1, 3);
                            if (!z2) {
                                linearSystem.addCentering(createObjectVariable7, createObjectVariable, this.mTop.getMargin(), this.mVerticalBiasPercent, createObjectVariable9, createObjectVariable8, this.mBottom.getMargin(), 4);
                                solverVariable = createObjectVariable4;
                            }
                        }
                        solverVariable = createObjectVariable4;
                    }
                    solverVariable2 = solverVariable;
                    if (obj2 == null) {
                    }
                } else {
                    return;
                }
            }
        }
        i2 = i8;
        obj = null;
        z8 = z9;
        z3 = z7;
        i3 = i6;
        obj2 = obj;
        i4 = i2;
        i5 = i7;
        f = f2;
        if (obj2 == null) {
        }
        if (this.mHorizontalDimensionBehaviour != DimensionBehaviour.WRAP_CONTENT) {
        }
        if (z4) {
        }
        applyConstraints(linearSystem, z7, z8, this.mLeft, this.mRight, this.mX, this.mX + i3, i3, this.mMinWidth, this.mHorizontalBiasPercent, z4, z, this.mMatchConstraintDefaultWidth, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth);
        if (this.mVerticalResolution != 2) {
        }
    }

    public void connect(Type type, ConstraintWidget constraintWidget, Type type2) {
        connect(type, constraintWidget, type2, 0, Strength.STRONG);
    }

    public void connect(Type type, ConstraintWidget constraintWidget, Type type2, int i) {
        connect(type, constraintWidget, type2, i, Strength.STRONG);
    }

    public void connect(Type type, ConstraintWidget constraintWidget, Type type2, int i, Strength strength) {
        connect(type, constraintWidget, type2, i, strength, 0);
    }

    public void connect(Type type, ConstraintWidget constraintWidget, Type type2, int i, Strength strength, int i2) {
        ConstraintAnchor anchor;
        ConstraintAnchor anchor2;
        ConstraintAnchor anchor3;
        if (type == Type.CENTER) {
            if (type2 == Type.CENTER) {
                Object obj;
                Object obj2;
                anchor = getAnchor(Type.LEFT);
                anchor2 = getAnchor(Type.RIGHT);
                ConstraintAnchor anchor4 = getAnchor(Type.TOP);
                ConstraintAnchor anchor5 = getAnchor(Type.BOTTOM);
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(Type.LEFT, constraintWidget, Type.LEFT, 0, strength, i2);
                    connect(Type.RIGHT, constraintWidget, Type.RIGHT, 0, strength, i2);
                    int obj3 = 1;
                } else {
                    obj3 = null;
                }
                if ((anchor4 == null || !anchor4.isConnected()) && (anchor5 == null || !anchor5.isConnected())) {
                    connect(Type.TOP, constraintWidget, Type.TOP, 0, strength, i2);
                    connect(Type.BOTTOM, constraintWidget, Type.BOTTOM, 0, strength, i2);
                    int obj22 = 1;
                } else {
                    obj22 = null;
                }
                if (obj3 != null && obj22 != null) {
                    getAnchor(Type.CENTER).connect(constraintWidget.getAnchor(Type.CENTER), 0, i2);
                } else if (obj3 != null) {
                    getAnchor(Type.CENTER_X).connect(constraintWidget.getAnchor(Type.CENTER_X), 0, i2);
                } else if (obj22 != null) {
                    getAnchor(Type.CENTER_Y).connect(constraintWidget.getAnchor(Type.CENTER_Y), 0, i2);
                }
            } else if (type2 == Type.LEFT || type2 == Type.RIGHT) {
                connect(Type.LEFT, constraintWidget, type2, 0, strength, i2);
                connect(Type.RIGHT, constraintWidget, type2, 0, strength, i2);
                getAnchor(Type.CENTER).connect(constraintWidget.getAnchor(type2), 0, i2);
            } else if (type2 == Type.TOP || type2 == Type.BOTTOM) {
                connect(Type.TOP, constraintWidget, type2, 0, strength, i2);
                connect(Type.BOTTOM, constraintWidget, type2, 0, strength, i2);
                getAnchor(Type.CENTER).connect(constraintWidget.getAnchor(type2), 0, i2);
            }
        } else if (type == Type.CENTER_X && (type2 == Type.LEFT || type2 == Type.RIGHT)) {
            anchor = getAnchor(Type.LEFT);
            anchor2 = constraintWidget.getAnchor(type2);
            anchor3 = getAnchor(Type.RIGHT);
            anchor.connect(anchor2, 0, i2);
            anchor3.connect(anchor2, 0, i2);
            getAnchor(Type.CENTER_X).connect(anchor2, 0, i2);
        } else if (type == Type.CENTER_Y && (type2 == Type.TOP || type2 == Type.BOTTOM)) {
            anchor = constraintWidget.getAnchor(type2);
            getAnchor(Type.TOP).connect(anchor, 0, i2);
            getAnchor(Type.BOTTOM).connect(anchor, 0, i2);
            getAnchor(Type.CENTER_Y).connect(anchor, 0, i2);
        } else if (type == Type.CENTER_X && type2 == Type.CENTER_X) {
            getAnchor(Type.LEFT).connect(constraintWidget.getAnchor(Type.LEFT), 0, i2);
            getAnchor(Type.RIGHT).connect(constraintWidget.getAnchor(Type.RIGHT), 0, i2);
            getAnchor(Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0, i2);
        } else if (type == Type.CENTER_Y && type2 == Type.CENTER_Y) {
            getAnchor(Type.TOP).connect(constraintWidget.getAnchor(Type.TOP), 0, i2);
            getAnchor(Type.BOTTOM).connect(constraintWidget.getAnchor(Type.BOTTOM), 0, i2);
            getAnchor(Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0, i2);
        } else {
            anchor2 = getAnchor(type);
            anchor3 = constraintWidget.getAnchor(type2);
            if (anchor2.isValidConnection(anchor3)) {
                ConstraintAnchor anchor6;
                if (type == Type.BASELINE) {
                    anchor6 = getAnchor(Type.TOP);
                    ConstraintAnchor anchor7 = getAnchor(Type.BOTTOM);
                    if (anchor6 != null) {
                        anchor6.reset();
                    }
                    if (anchor7 != null) {
                        anchor7.reset();
                        i = 0;
                    } else {
                        i = 0;
                    }
                } else if (type == Type.TOP || type == Type.BOTTOM) {
                    anchor = getAnchor(Type.BASELINE);
                    if (anchor != null) {
                        anchor.reset();
                    }
                    anchor = getAnchor(Type.CENTER);
                    if (anchor.getTarget() != anchor3) {
                        anchor.reset();
                    }
                    anchor = getAnchor(type).getOpposite();
                    anchor6 = getAnchor(Type.CENTER_Y);
                    if (anchor6.isConnected()) {
                        anchor.reset();
                        anchor6.reset();
                    }
                } else if (type == Type.LEFT || type == Type.RIGHT) {
                    anchor = getAnchor(Type.CENTER);
                    if (anchor.getTarget() != anchor3) {
                        anchor.reset();
                    }
                    anchor = getAnchor(type).getOpposite();
                    anchor6 = getAnchor(Type.CENTER_X);
                    if (anchor6.isConnected()) {
                        anchor.reset();
                        anchor6.reset();
                    }
                }
                anchor2.connect(anchor3, i, strength, i2);
                anchor3.getOwner().connectedTo(anchor2.getOwner());
            }
        }
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        connect(constraintAnchor, constraintAnchor2, i, Strength.STRONG, 0);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2) {
        connect(constraintAnchor, constraintAnchor2, i, Strength.STRONG, i2);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, Strength strength, int i2) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i, strength, i2);
        }
    }

    public void connectedTo(ConstraintWidget constraintWidget) {
    }

    public void disconnectUnlockedWidget(ConstraintWidget constraintWidget) {
        ArrayList anchors = getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) anchors.get(i);
            if (constraintAnchor.isConnected() && constraintAnchor.getTarget().getOwner() == constraintWidget && constraintAnchor.getConnectionCreator() == 2) {
                constraintAnchor.reset();
            }
        }
    }

    public void disconnectWidget(ConstraintWidget constraintWidget) {
        ArrayList anchors = getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) anchors.get(i);
            if (constraintAnchor.isConnected() && constraintAnchor.getTarget().getOwner() == constraintWidget) {
                constraintAnchor.reset();
            }
        }
    }

    public void forceUpdateDrawPosition() {
        int i = this.mX;
        int i2 = this.mY;
        int i3 = this.mX;
        int i4 = this.mWidth;
        int i5 = this.mY;
        int i6 = this.mHeight;
        this.mDrawX = i;
        this.mDrawY = i2;
        this.mDrawWidth = (i3 + i4) - i;
        this.mDrawHeight = (i5 + i6) - i2;
    }

    public ConstraintAnchor getAnchor(Type type) {
        switch (type) {
            case LEFT:
                return this.mLeft;
            case TOP:
                return this.mTop;
            case RIGHT:
                return this.mRight;
            case BOTTOM:
                return this.mBottom;
            case BASELINE:
                return this.mBaseline;
            case CENTER_X:
                return this.mCenterX;
            case CENTER_Y:
                return this.mCenterY;
            case CENTER:
                return this.mCenter;
            default:
                return null;
        }
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public int getDrawBottom() {
        return getDrawY() + this.mDrawHeight;
    }

    public int getDrawHeight() {
        return this.mDrawHeight;
    }

    public int getDrawRight() {
        return getDrawX() + this.mDrawWidth;
    }

    public int getDrawWidth() {
        return this.mDrawWidth;
    }

    public int getDrawX() {
        return this.mDrawX + this.mOffsetX;
    }

    public int getDrawY() {
        return this.mDrawY + this.mOffsetY;
    }

    public int getHeight() {
        return this.mVisibility == 8 ? 0 : this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = null;
        ConstraintWidget constraintWidget2 = this;
        while (constraintWidget == null && constraintWidget2 != null) {
            ConstraintAnchor anchor = constraintWidget2.getAnchor(Type.LEFT);
            anchor = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = anchor == null ? null : anchor.getOwner();
            if (owner == getParent()) {
                return constraintWidget2;
            }
            ConstraintAnchor target = owner == null ? null : owner.getAnchor(Type.RIGHT).getTarget();
            if (target == null || target.getOwner() == constraintWidget2) {
                constraintWidget2 = owner;
            } else {
                constraintWidget = constraintWidget2;
            }
        }
        return constraintWidget;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mHorizontalDimensionBehaviour;
    }

    public int getInternalDrawBottom() {
        return this.mDrawY + this.mDrawHeight;
    }

    public int getInternalDrawRight() {
        return this.mDrawX + this.mDrawWidth;
    }

    /* Access modifiers changed, original: 0000 */
    public int getInternalDrawX() {
        return this.mDrawX;
    }

    /* Access modifiers changed, original: 0000 */
    public int getInternalDrawY() {
        return this.mDrawY;
    }

    public int getLeft() {
        return getX();
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizerWrapHeight() {
        int i = this.mHeight;
        if (this.mVerticalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            i = Math.max(this.mMatchConstraintMinHeight, i);
        } else if (this.mMatchConstraintMinHeight > 0) {
            i = this.mMatchConstraintMinHeight;
            this.mHeight = i;
        } else {
            i = 0;
        }
        return (this.mMatchConstraintMaxHeight <= 0 || this.mMatchConstraintMaxHeight >= i) ? i : this.mMatchConstraintMaxHeight;
    }

    public int getOptimizerWrapWidth() {
        int i = this.mWidth;
        if (this.mHorizontalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            i = Math.max(this.mMatchConstraintMinWidth, i);
        } else if (this.mMatchConstraintMinWidth > 0) {
            i = this.mMatchConstraintMinWidth;
            this.mWidth = i;
        } else {
            i = 0;
        }
        return (this.mMatchConstraintMaxWidth <= 0 || this.mMatchConstraintMaxWidth >= i) ? i : this.mMatchConstraintMaxWidth;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public WidgetContainer getRootWidgetContainer() {
        ConstraintWidget constraintWidget = this;
        while (constraintWidget.getParent() != null) {
            constraintWidget = constraintWidget.getParent();
        }
        return constraintWidget instanceof WidgetContainer ? (WidgetContainer) constraintWidget : null;
    }

    /* Access modifiers changed, original: protected */
    public int getRootX() {
        return this.mX + this.mOffsetX;
    }

    /* Access modifiers changed, original: protected */
    public int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.mType;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = null;
        ConstraintWidget constraintWidget2 = this;
        while (constraintWidget == null && constraintWidget2 != null) {
            ConstraintAnchor anchor = constraintWidget2.getAnchor(Type.TOP);
            anchor = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = anchor == null ? null : anchor.getOwner();
            if (owner == getParent()) {
                return constraintWidget2;
            }
            ConstraintAnchor target = owner == null ? null : owner.getAnchor(Type.BOTTOM).getTarget();
            if (target == null || target.getOwner() == constraintWidget2) {
                constraintWidget2 = owner;
            } else {
                constraintWidget = constraintWidget2;
            }
        }
        return constraintWidget;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mVerticalDimensionBehaviour;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public int getWidth() {
        return this.mVisibility == 8 ? 0 : this.mWidth;
    }

    public int getWrapHeight() {
        return this.mWrapHeight;
    }

    public int getWrapWidth() {
        return this.mWrapWidth;
    }

    public int getX() {
        return this.mX;
    }

    public int getY() {
        return this.mY;
    }

    public boolean hasAncestor(ConstraintWidget constraintWidget) {
        ConstraintWidget parent = getParent();
        if (parent == constraintWidget) {
            return true;
        }
        if (parent == constraintWidget.getParent()) {
            return false;
        }
        while (parent != null) {
            if (parent == constraintWidget || parent == constraintWidget.getParent()) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    public boolean hasBaseline() {
        return this.mBaselineDistance > 0;
    }

    public void immediateConnect(Type type, ConstraintWidget constraintWidget, Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, Strength.STRONG, 0, true);
    }

    public boolean isInHorizontalChain() {
        return (this.mLeft.mTarget != null && this.mLeft.mTarget.mTarget == this.mLeft) || (this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight);
    }

    public boolean isInVerticalChain() {
        return (this.mTop.mTarget != null && this.mTop.mTarget.mTarget == this.mTop) || (this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom);
    }

    public boolean isInsideConstraintLayout() {
        ConstraintWidget parent = getParent();
        if (parent == null) {
            return false;
        }
        while (parent != null) {
            if (parent instanceof ConstraintWidgetContainer) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isRootContainer() {
        return (this instanceof ConstraintWidgetContainer) && (this.mParent == null || !(this.mParent instanceof ConstraintWidgetContainer));
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mWrapWidth = 0;
        this.mWrapHeight = 0;
        this.mHorizontalBiasPercent = DEFAULT_BIAS;
        this.mVerticalBiasPercent = DEFAULT_BIAS;
        this.mHorizontalDimensionBehaviour = DimensionBehaviour.FIXED;
        this.mVerticalDimensionBehaviour = DimensionBehaviour.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        this.mHorizontalWeight = 0.0f;
        this.mVerticalWeight = 0.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
        if (!(this instanceof ConstraintWidgetContainer)) {
            if (getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                if (getWidth() == getWrapWidth()) {
                    setHorizontalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
                } else if (getWidth() > getMinWidth()) {
                    setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                }
            }
            if (getVerticalDimensionBehaviour() != DimensionBehaviour.MATCH_CONSTRAINT) {
                return;
            }
            if (getHeight() == getWrapHeight()) {
                setVerticalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
            } else if (getHeight() > getMinHeight()) {
                setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
            }
        }
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() == null || !(getParent() instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            ConstraintAnchor anchor = getAnchor(Type.LEFT);
            ConstraintAnchor anchor2 = getAnchor(Type.RIGHT);
            ConstraintAnchor anchor3 = getAnchor(Type.TOP);
            ConstraintAnchor anchor4 = getAnchor(Type.BOTTOM);
            ConstraintAnchor anchor5 = getAnchor(Type.CENTER);
            ConstraintAnchor anchor6 = getAnchor(Type.CENTER_X);
            ConstraintAnchor anchor7 = getAnchor(Type.CENTER_Y);
            if (constraintAnchor == anchor5) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                    anchor.reset();
                    anchor2.reset();
                }
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                    anchor3.reset();
                    anchor4.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
                this.mVerticalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor6) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                    anchor.reset();
                    anchor2.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor7) {
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                    anchor3.reset();
                    anchor4.reset();
                }
                this.mVerticalBiasPercent = 0.5f;
            } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
                if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                    anchor5.reset();
                }
            } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor5.reset();
            }
            constraintAnchor.reset();
        }
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent == null || !(parent instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            int size = this.mAnchors.size();
            for (int i = 0; i < size; i++) {
                ((ConstraintAnchor) this.mAnchors.get(i)).reset();
            }
        }
    }

    public void resetAnchors(int i) {
        ConstraintWidget parent = getParent();
        if (parent == null || !(parent instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            int size = this.mAnchors.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintAnchor constraintAnchor = (ConstraintAnchor) this.mAnchors.get(i2);
                if (i == constraintAnchor.getConnectionCreator()) {
                    if (constraintAnchor.isVerticalAnchor()) {
                        setVerticalBiasPercent(DEFAULT_BIAS);
                    } else {
                        setHorizontalBiasPercent(DEFAULT_BIAS);
                    }
                    constraintAnchor.reset();
                }
            }
        }
    }

    public void resetGroups() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) this.mAnchors.get(i)).mGroup = Integer.MAX_VALUE;
        }
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".left");
        createObjectVariable.setName(stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(".top");
        createObjectVariable2.setName(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(".right");
        createObjectVariable3.setName(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(".bottom");
        createObjectVariable4.setName(stringBuilder2.toString());
        if (this.mBaselineDistance > 0) {
            createObjectVariable = linearSystem.createObjectVariable(this.mBaseline);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append(".baseline");
            createObjectVariable.setName(stringBuilder3.toString());
        }
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        if (this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
        this.mHeight = i2;
        if (this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public void setDimensionRatio(String str) {
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int i2;
        float parseFloat;
        int length = str.length();
        int indexOf = str.indexOf(44);
        if (indexOf <= 0 || indexOf >= length - 1) {
            indexOf = 0;
            i2 = -1;
        } else {
            String substring = str.substring(0, indexOf);
            if (!substring.equalsIgnoreCase("W")) {
                i = substring.equalsIgnoreCase("H") ? 1 : -1;
            }
            indexOf++;
            i2 = i;
        }
        i = str.indexOf(58);
        String substring2;
        if (i < 0 || i >= length - 1) {
            substring2 = str.substring(indexOf);
            if (substring2.length() > 0) {
                parseFloat = Float.parseFloat(substring2);
            }
            parseFloat = 0.0f;
        } else {
            String substring3 = str.substring(indexOf, i);
            substring2 = str.substring(i + 1);
            if (substring3.length() > 0 && substring2.length() > 0) {
                try {
                    float parseFloat2 = Float.parseFloat(substring3);
                    parseFloat = Float.parseFloat(substring2);
                    if (parseFloat2 > 0.0f && parseFloat > 0.0f) {
                        parseFloat = i2 == 1 ? Math.abs(parseFloat / parseFloat2) : Math.abs(parseFloat2 / parseFloat);
                    }
                } catch (NumberFormatException e) {
                }
            }
            parseFloat = 0.0f;
        }
        if (parseFloat > 0.0f) {
            this.mDimensionRatio = parseFloat;
            this.mDimensionRatioSide = i2;
        }
    }

    public void setDrawHeight(int i) {
        this.mDrawHeight = i;
    }

    public void setDrawOrigin(int i, int i2) {
        this.mDrawX = i - this.mOffsetX;
        this.mDrawY = i2 - this.mOffsetY;
        this.mX = this.mDrawX;
        this.mY = this.mDrawY;
    }

    public void setDrawWidth(int i) {
        this.mDrawWidth = i;
    }

    public void setDrawX(int i) {
        this.mDrawX = i - this.mOffsetX;
        this.mX = this.mDrawX;
    }

    public void setDrawY(int i) {
        this.mDrawY = i - this.mOffsetY;
        this.mY = this.mDrawY;
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.mX = i;
        this.mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (this.mHorizontalDimensionBehaviour == DimensionBehaviour.FIXED && i5 < this.mWidth) {
            i5 = this.mWidth;
        }
        if (this.mVerticalDimensionBehaviour == DimensionBehaviour.FIXED && i6 < this.mHeight) {
            i6 = this.mHeight;
        }
        this.mWidth = i5;
        this.mHeight = i6;
        if (this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
        if (this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
    }

    public void setGoneMargin(Type type, int i) {
        switch (type) {
            case LEFT:
                this.mLeft.mGoneMargin = i;
                return;
            case TOP:
                this.mTop.mGoneMargin = i;
                return;
            case RIGHT:
                this.mRight.mGoneMargin = i;
                return;
            case BOTTOM:
                this.mBottom.mGoneMargin = i;
                return;
            default:
                return;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        if (this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        this.mWidth = i2 - i;
        if (this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mHorizontalDimensionBehaviour = dimensionBehaviour;
        if (this.mHorizontalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            setWidth(this.mWrapWidth);
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        this.mMatchConstraintMaxWidth = i3;
    }

    public void setHorizontalWeight(float f) {
        this.mHorizontalWeight = f;
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        this.mHeight = i2 - i;
        if (this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mVerticalDimensionBehaviour = dimensionBehaviour;
        if (this.mVerticalDimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            setHeight(this.mWrapHeight);
        }
    }

    public void setVerticalMatchStyle(int i, int i2, int i3) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        this.mMatchConstraintMaxHeight = i3;
    }

    public void setVerticalWeight(float f) {
        this.mVerticalWeight = f;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        if (this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
    }

    public void setWrapHeight(int i) {
        this.mWrapHeight = i;
    }

    public void setWrapWidth(int i) {
        this.mWrapWidth = i;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public String toString() {
        StringBuilder stringBuilder;
        String stringBuilder2;
        StringBuilder stringBuilder3 = new StringBuilder();
        if (this.mType != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("type: ");
            stringBuilder.append(this.mType);
            stringBuilder.append(" ");
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = "";
        }
        stringBuilder3.append(stringBuilder2);
        if (this.mDebugName != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("id: ");
            stringBuilder.append(this.mDebugName);
            stringBuilder.append(" ");
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = "";
        }
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("(");
        stringBuilder3.append(this.mX);
        stringBuilder3.append(", ");
        stringBuilder3.append(this.mY);
        stringBuilder3.append(") - (");
        stringBuilder3.append(this.mWidth);
        stringBuilder3.append(" x ");
        stringBuilder3.append(this.mHeight);
        stringBuilder3.append(")");
        stringBuilder3.append(" wrap: (");
        stringBuilder3.append(this.mWrapWidth);
        stringBuilder3.append(" x ");
        stringBuilder3.append(this.mWrapHeight);
        stringBuilder3.append(")");
        return stringBuilder3.toString();
    }

    public void updateDrawPosition() {
        int i = this.mX;
        int i2 = this.mY;
        int i3 = this.mX;
        int i4 = this.mWidth;
        int i5 = this.mY;
        int i6 = this.mHeight;
        this.mDrawX = i;
        this.mDrawY = i2;
        this.mDrawWidth = (i3 + i4) - i;
        this.mDrawHeight = (i5 + i6) - i2;
    }

    public void updateFromSolver(LinearSystem linearSystem) {
        updateFromSolver(linearSystem, Integer.MAX_VALUE);
    }

    public void updateFromSolver(LinearSystem linearSystem, int i) {
        if (i == Integer.MAX_VALUE) {
            setFrame(linearSystem.getObjectVariableValue(this.mLeft), linearSystem.getObjectVariableValue(this.mTop), linearSystem.getObjectVariableValue(this.mRight), linearSystem.getObjectVariableValue(this.mBottom));
        } else if (i == -2) {
            setFrame(this.mSolverLeft, this.mSolverTop, this.mSolverRight, this.mSolverBottom);
        } else {
            if (this.mLeft.mGroup == i) {
                this.mSolverLeft = linearSystem.getObjectVariableValue(this.mLeft);
            }
            if (this.mTop.mGroup == i) {
                this.mSolverTop = linearSystem.getObjectVariableValue(this.mTop);
            }
            if (this.mRight.mGroup == i) {
                this.mSolverRight = linearSystem.getObjectVariableValue(this.mRight);
            }
            if (this.mBottom.mGroup == i) {
                this.mSolverBottom = linearSystem.getObjectVariableValue(this.mBottom);
            }
        }
    }
}
