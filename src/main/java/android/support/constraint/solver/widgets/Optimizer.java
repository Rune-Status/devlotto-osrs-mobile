package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;

public class Optimizer {
    static void applyDirectResolutionHorizontalChain(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, ConstraintWidget constraintWidget) {
        int margin;
        int x;
        float f;
        float f2;
        int i2 = 0;
        int i3 = 0;
        float f3 = 0.0f;
        ConstraintWidget constraintWidget2 = null;
        ConstraintWidget constraintWidget3 = constraintWidget;
        while (true) {
            Object obj = 1;
            if (constraintWidget3 == null) {
                break;
            }
            if (constraintWidget3.getVisibility() != 8) {
                obj = null;
            }
            if (obj == null) {
                i2++;
                if (constraintWidget3.mHorizontalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT) {
                    margin = ((constraintWidget3.mLeft.mTarget != null ? constraintWidget3.mLeft.getMargin() : 0) + (i3 + constraintWidget3.getWidth())) + (constraintWidget3.mRight.mTarget != null ? constraintWidget3.mRight.getMargin() : 0);
                } else {
                    margin = i3;
                    f3 = constraintWidget3.mHorizontalWeight + f3;
                }
            } else {
                margin = i3;
            }
            ConstraintWidget constraintWidget4 = constraintWidget3.mRight.mTarget != null ? constraintWidget3.mRight.mTarget.mOwner : null;
            if (constraintWidget4 != null && (constraintWidget4.mLeft.mTarget == null || !(constraintWidget4.mLeft.mTarget == null || constraintWidget4.mLeft.mTarget.mOwner == constraintWidget3))) {
                constraintWidget4 = null;
            }
            constraintWidget2 = constraintWidget3;
            i3 = margin;
            constraintWidget3 = constraintWidget4;
        }
        if (constraintWidget2 != null) {
            x = constraintWidget2.mRight.mTarget != null ? constraintWidget2.mRight.mTarget.mOwner.getX() : 0;
            if (constraintWidget2.mRight.mTarget != null && constraintWidget2.mRight.mTarget.mOwner == constraintWidgetContainer) {
                x = constraintWidgetContainer.getRight();
            }
        } else {
            x = 0;
        }
        float f4 = ((float) (x + 0)) - ((float) i3);
        float f5 = f4 / ((float) (i2 + 1));
        if (i == 0) {
            f = f5;
            f2 = f5;
        } else {
            f = f4 / ((float) i);
            f2 = 0.0f;
        }
        float f6 = f2;
        while (constraintWidget != null) {
            margin = constraintWidget.mLeft.mTarget != null ? constraintWidget.mLeft.getMargin() : 0;
            i3 = constraintWidget.mRight.mTarget != null ? constraintWidget.mRight.getMargin() : 0;
            if (constraintWidget.getVisibility() != 8) {
                f5 = (float) margin;
                f6 += f5;
                linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, (int) (0.5f + f6));
                f5 = constraintWidget.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT ? f3 == 0.0f ? ((f - f5) - ((float) i3)) + f6 : ((((constraintWidget.mHorizontalWeight * f4) / f3) - f5) - ((float) i3)) + f6 : ((float) constraintWidget.getWidth()) + f6;
                linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, (int) (0.5f + f5));
                if (i == 0) {
                    f5 += f;
                }
                f5 += (float) i3;
            } else {
                margin = (int) ((f6 - (f / 2.0f)) + 0.5f);
                linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, margin);
                linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, margin);
                f5 = f6;
            }
            ConstraintWidget constraintWidget5 = constraintWidget.mRight.mTarget != null ? constraintWidget.mRight.mTarget.mOwner : null;
            if (!(constraintWidget5 == null || constraintWidget5.mLeft.mTarget == null || constraintWidget5.mLeft.mTarget.mOwner == constraintWidget)) {
                constraintWidget5 = null;
            }
            if (constraintWidget5 == constraintWidgetContainer) {
                constraintWidget = null;
                f6 = f5;
            } else {
                f6 = f5;
                constraintWidget = constraintWidget5;
            }
        }
    }

    static void applyDirectResolutionVerticalChain(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, ConstraintWidget constraintWidget) {
        int margin;
        int x;
        float f;
        float f2;
        int i2 = 0;
        int i3 = 0;
        float f3 = 0.0f;
        ConstraintWidget constraintWidget2 = null;
        ConstraintWidget constraintWidget3 = constraintWidget;
        while (true) {
            Object obj = 1;
            if (constraintWidget3 == null) {
                break;
            }
            if (constraintWidget3.getVisibility() != 8) {
                obj = null;
            }
            if (obj == null) {
                i2++;
                if (constraintWidget3.mVerticalDimensionBehaviour != DimensionBehaviour.MATCH_CONSTRAINT) {
                    margin = ((constraintWidget3.mTop.mTarget != null ? constraintWidget3.mTop.getMargin() : 0) + (i3 + constraintWidget3.getHeight())) + (constraintWidget3.mBottom.mTarget != null ? constraintWidget3.mBottom.getMargin() : 0);
                } else {
                    margin = i3;
                    f3 = constraintWidget3.mVerticalWeight + f3;
                }
            } else {
                margin = i3;
            }
            ConstraintWidget constraintWidget4 = constraintWidget3.mBottom.mTarget != null ? constraintWidget3.mBottom.mTarget.mOwner : null;
            if (constraintWidget4 != null && (constraintWidget4.mTop.mTarget == null || !(constraintWidget4.mTop.mTarget == null || constraintWidget4.mTop.mTarget.mOwner == constraintWidget3))) {
                constraintWidget4 = null;
            }
            constraintWidget2 = constraintWidget3;
            i3 = margin;
            constraintWidget3 = constraintWidget4;
        }
        if (constraintWidget2 != null) {
            x = constraintWidget2.mBottom.mTarget != null ? constraintWidget2.mBottom.mTarget.mOwner.getX() : 0;
            if (constraintWidget2.mBottom.mTarget != null && constraintWidget2.mBottom.mTarget.mOwner == constraintWidgetContainer) {
                x = constraintWidgetContainer.getBottom();
            }
        } else {
            x = 0;
        }
        float f4 = ((float) (x + 0)) - ((float) i3);
        float f5 = f4 / ((float) (i2 + 1));
        if (i == 0) {
            f = f5;
            f2 = f5;
        } else {
            f = f4 / ((float) i);
            f2 = 0.0f;
        }
        float f6 = f2;
        while (constraintWidget != null) {
            margin = constraintWidget.mTop.mTarget != null ? constraintWidget.mTop.getMargin() : 0;
            i3 = constraintWidget.mBottom.mTarget != null ? constraintWidget.mBottom.getMargin() : 0;
            if (constraintWidget.getVisibility() != 8) {
                f5 = (float) margin;
                f6 += f5;
                linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, (int) (0.5f + f6));
                f5 = constraintWidget.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT ? f3 == 0.0f ? ((f - f5) - ((float) i3)) + f6 : ((((constraintWidget.mVerticalWeight * f4) / f3) - f5) - ((float) i3)) + f6 : ((float) constraintWidget.getHeight()) + f6;
                linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, (int) (0.5f + f5));
                if (i == 0) {
                    f5 += f;
                }
                f5 += (float) i3;
            } else {
                margin = (int) ((f6 - (f / 2.0f)) + 0.5f);
                linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, margin);
                linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, margin);
                f5 = f6;
            }
            ConstraintWidget constraintWidget5 = constraintWidget.mBottom.mTarget != null ? constraintWidget.mBottom.mTarget.mOwner : null;
            if (!(constraintWidget5 == null || constraintWidget5.mTop.mTarget == null || constraintWidget5.mTop.mTarget.mOwner == constraintWidget)) {
                constraintWidget5 = null;
            }
            if (constraintWidget5 == constraintWidgetContainer) {
                constraintWidget = null;
                f6 = f5;
            } else {
                f6 = f5;
                constraintWidget = constraintWidget5;
            }
        }
    }

    static void checkHorizontalSimpleDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        int i;
        int width;
        if (constraintWidget.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            constraintWidget.mHorizontalResolution = 1;
        } else if (constraintWidgetContainer.mHorizontalDimensionBehaviour != DimensionBehaviour.WRAP_CONTENT && constraintWidget.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_PARENT) {
            constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
            constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
            i = constraintWidget.mLeft.mMargin;
            width = constraintWidgetContainer.getWidth() - constraintWidget.mRight.mMargin;
            linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, i);
            linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, width);
            constraintWidget.setHorizontalDimension(i, width);
            constraintWidget.mHorizontalResolution = 2;
        } else if (constraintWidget.mLeft.mTarget == null || constraintWidget.mRight.mTarget == null) {
            SolverVariable solverVariable;
            if (constraintWidget.mLeft.mTarget != null && constraintWidget.mLeft.mTarget.mOwner == constraintWidgetContainer) {
                i = constraintWidget.mLeft.getMargin();
                width = constraintWidget.getWidth() + i;
                constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
                constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
                linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, i);
                linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, width);
                constraintWidget.mHorizontalResolution = 2;
                constraintWidget.setHorizontalDimension(i, width);
            } else if (constraintWidget.mRight.mTarget != null && constraintWidget.mRight.mTarget.mOwner == constraintWidgetContainer) {
                constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
                constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
                i = constraintWidgetContainer.getWidth() - constraintWidget.mRight.getMargin();
                width = i - constraintWidget.getWidth();
                linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, width);
                linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, i);
                constraintWidget.mHorizontalResolution = 2;
                constraintWidget.setHorizontalDimension(width, i);
            } else if (constraintWidget.mLeft.mTarget != null && constraintWidget.mLeft.mTarget.mOwner.mHorizontalResolution == 2) {
                solverVariable = constraintWidget.mLeft.mTarget.mSolverVariable;
                constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
                constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
                i = (int) ((solverVariable.computedValue + ((float) constraintWidget.mLeft.getMargin())) + 0.5f);
                width = constraintWidget.getWidth() + i;
                linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, i);
                linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, width);
                constraintWidget.mHorizontalResolution = 2;
                constraintWidget.setHorizontalDimension(i, width);
            } else if (constraintWidget.mRight.mTarget == null || constraintWidget.mRight.mTarget.mOwner.mHorizontalResolution != 2) {
                i = constraintWidget.mLeft.mTarget != null ? 1 : 0;
                int i2 = constraintWidget.mRight.mTarget != null ? 1 : 0;
                if (i != 0 || i2 != 0) {
                    return;
                }
                if (constraintWidget instanceof Guideline) {
                    Guideline guideline = (Guideline) constraintWidget;
                    if (guideline.getOrientation() == 1) {
                        constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
                        constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
                        float relativeBegin = guideline.getRelativeBegin() != -1 ? (float) guideline.getRelativeBegin() : guideline.getRelativeEnd() != -1 ? (float) (constraintWidgetContainer.getWidth() - guideline.getRelativeEnd()) : guideline.getRelativePercent() * ((float) constraintWidgetContainer.getWidth());
                        i = (int) (relativeBegin + 0.5f);
                        linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, i);
                        linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, i);
                        constraintWidget.mHorizontalResolution = 2;
                        constraintWidget.mVerticalResolution = 2;
                        constraintWidget.setHorizontalDimension(i, i);
                        constraintWidget.setVerticalDimension(0, constraintWidgetContainer.getHeight());
                        return;
                    }
                    return;
                }
                constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
                constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
                i = constraintWidget.getX();
                width = constraintWidget.getWidth();
                linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, i);
                linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, i + width);
                constraintWidget.mHorizontalResolution = 2;
            } else {
                solverVariable = constraintWidget.mRight.mTarget.mSolverVariable;
                constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
                constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
                i = (int) ((solverVariable.computedValue - ((float) constraintWidget.mRight.getMargin())) + 0.5f);
                width = i - constraintWidget.getWidth();
                linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, width);
                linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, i);
                constraintWidget.mHorizontalResolution = 2;
                constraintWidget.setHorizontalDimension(width, i);
            }
        } else if (constraintWidget.mLeft.mTarget.mOwner == constraintWidgetContainer && constraintWidget.mRight.mTarget.mOwner == constraintWidgetContainer) {
            width = constraintWidget.mLeft.getMargin();
            i = constraintWidget.mRight.getMargin();
            if (constraintWidgetContainer.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                i = constraintWidgetContainer.getWidth() - i;
            } else {
                width += (int) ((((float) (((constraintWidgetContainer.getWidth() - width) - i) - constraintWidget.getWidth())) * constraintWidget.mHorizontalBiasPercent) + 0.5f);
                i = constraintWidget.getWidth() + width;
            }
            constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
            constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
            linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, width);
            linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, i);
            constraintWidget.mHorizontalResolution = 2;
            constraintWidget.setHorizontalDimension(width, i);
        } else {
            constraintWidget.mHorizontalResolution = 1;
        }
    }

    static void checkMatchParent(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        int i;
        int width;
        if (constraintWidgetContainer.mHorizontalDimensionBehaviour != DimensionBehaviour.WRAP_CONTENT && constraintWidget.mHorizontalDimensionBehaviour == DimensionBehaviour.MATCH_PARENT) {
            constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
            constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
            i = constraintWidget.mLeft.mMargin;
            width = constraintWidgetContainer.getWidth() - constraintWidget.mRight.mMargin;
            linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, i);
            linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, width);
            constraintWidget.setHorizontalDimension(i, width);
            constraintWidget.mHorizontalResolution = 2;
        }
        if (constraintWidgetContainer.mVerticalDimensionBehaviour != DimensionBehaviour.WRAP_CONTENT && constraintWidget.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_PARENT) {
            constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
            constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
            i = constraintWidget.mTop.mMargin;
            width = constraintWidgetContainer.getHeight() - constraintWidget.mBottom.mMargin;
            linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i);
            linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, width);
            if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i);
            }
            constraintWidget.setVerticalDimension(i, width);
            constraintWidget.mVerticalResolution = 2;
        }
    }

    static void checkVerticalSimpleDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        int i = 1;
        int i2;
        if (constraintWidget.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            constraintWidget.mVerticalResolution = 1;
        } else if (constraintWidgetContainer.mVerticalDimensionBehaviour != DimensionBehaviour.WRAP_CONTENT && constraintWidget.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_PARENT) {
            constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
            constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
            i2 = constraintWidget.mTop.mMargin;
            i = constraintWidgetContainer.getHeight() - constraintWidget.mBottom.mMargin;
            linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i2);
            linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, i);
            if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i2);
            }
            constraintWidget.setVerticalDimension(i2, i);
            constraintWidget.mVerticalResolution = 2;
        } else if (constraintWidget.mTop.mTarget == null || constraintWidget.mBottom.mTarget == null) {
            SolverVariable solverVariable;
            if (constraintWidget.mTop.mTarget != null && constraintWidget.mTop.mTarget.mOwner == constraintWidgetContainer) {
                i2 = constraintWidget.mTop.getMargin();
                i = constraintWidget.getHeight() + i2;
                constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
                constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
                linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i2);
                linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, i);
                if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                    constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                    linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i2);
                }
                constraintWidget.mVerticalResolution = 2;
                constraintWidget.setVerticalDimension(i2, i);
            } else if (constraintWidget.mBottom.mTarget != null && constraintWidget.mBottom.mTarget.mOwner == constraintWidgetContainer) {
                constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
                constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
                i2 = constraintWidgetContainer.getHeight() - constraintWidget.mBottom.getMargin();
                i = i2 - constraintWidget.getHeight();
                linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i);
                linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, i2);
                if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                    constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                    linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i);
                }
                constraintWidget.mVerticalResolution = 2;
                constraintWidget.setVerticalDimension(i, i2);
            } else if (constraintWidget.mTop.mTarget != null && constraintWidget.mTop.mTarget.mOwner.mVerticalResolution == 2) {
                solverVariable = constraintWidget.mTop.mTarget.mSolverVariable;
                constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
                constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
                i2 = (int) ((solverVariable.computedValue + ((float) constraintWidget.mTop.getMargin())) + 0.5f);
                i = constraintWidget.getHeight() + i2;
                linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i2);
                linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, i);
                if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                    constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                    linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i2);
                }
                constraintWidget.mVerticalResolution = 2;
                constraintWidget.setVerticalDimension(i2, i);
            } else if (constraintWidget.mBottom.mTarget != null && constraintWidget.mBottom.mTarget.mOwner.mVerticalResolution == 2) {
                solverVariable = constraintWidget.mBottom.mTarget.mSolverVariable;
                constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
                constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
                i2 = (int) ((solverVariable.computedValue - ((float) constraintWidget.mBottom.getMargin())) + 0.5f);
                i = i2 - constraintWidget.getHeight();
                linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i);
                linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, i2);
                if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                    constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                    linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i);
                }
                constraintWidget.mVerticalResolution = 2;
                constraintWidget.setVerticalDimension(i, i2);
            } else if (constraintWidget.mBaseline.mTarget == null || constraintWidget.mBaseline.mTarget.mOwner.mVerticalResolution != 2) {
                i2 = constraintWidget.mBaseline.mTarget != null ? 1 : 0;
                int i3 = constraintWidget.mTop.mTarget != null ? 1 : 0;
                if (constraintWidget.mBottom.mTarget == null) {
                    i = 0;
                }
                if (i2 != 0 || i3 != 0 || i != 0) {
                    return;
                }
                if (constraintWidget instanceof Guideline) {
                    Guideline guideline = (Guideline) constraintWidget;
                    if (guideline.getOrientation() == 0) {
                        constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
                        constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
                        float relativeBegin = guideline.getRelativeBegin() != -1 ? (float) guideline.getRelativeBegin() : guideline.getRelativeEnd() != -1 ? (float) (constraintWidgetContainer.getHeight() - guideline.getRelativeEnd()) : guideline.getRelativePercent() * ((float) constraintWidgetContainer.getHeight());
                        i2 = (int) (relativeBegin + 0.5f);
                        linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i2);
                        linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, i2);
                        constraintWidget.mVerticalResolution = 2;
                        constraintWidget.mHorizontalResolution = 2;
                        constraintWidget.setVerticalDimension(i2, i2);
                        constraintWidget.setHorizontalDimension(0, constraintWidgetContainer.getWidth());
                        return;
                    }
                    return;
                }
                constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
                constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
                i2 = constraintWidget.getY();
                i = constraintWidget.getHeight();
                linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i2);
                linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, i + i2);
                if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                    constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                    linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, i2 + constraintWidget.mBaselineDistance);
                }
                constraintWidget.mVerticalResolution = 2;
            } else {
                solverVariable = constraintWidget.mBaseline.mTarget.mSolverVariable;
                constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
                constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
                i2 = (int) ((solverVariable.computedValue - ((float) constraintWidget.mBaselineDistance)) + 0.5f);
                i = constraintWidget.getHeight() + i2;
                linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i2);
                linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, i);
                constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i2);
                constraintWidget.mVerticalResolution = 2;
                constraintWidget.setVerticalDimension(i2, i);
            }
        } else if (constraintWidget.mTop.mTarget.mOwner == constraintWidgetContainer && constraintWidget.mBottom.mTarget.mOwner == constraintWidgetContainer) {
            i = constraintWidget.mTop.getMargin();
            i2 = constraintWidget.mBottom.getMargin();
            if (constraintWidgetContainer.mVerticalDimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                i2 = constraintWidget.getHeight() + i;
            } else {
                i = (int) (((((float) (((constraintWidgetContainer.getHeight() - i) - i2) - constraintWidget.getHeight())) * constraintWidget.mVerticalBiasPercent) + ((float) i)) + 0.5f);
                i2 = constraintWidget.getHeight() + i;
            }
            constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
            constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
            linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i);
            linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, i2);
            if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i);
            }
            constraintWidget.mVerticalResolution = 2;
            constraintWidget.setVerticalDimension(i, i2);
        } else {
            constraintWidget.mVerticalResolution = 1;
        }
    }
}
