package X0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class C extends B {
    @Override // B6.u0
    public final void I(View view, float f9) {
        view.setTransitionAlpha(f9);
    }

    @Override // X0.B, B6.u0
    public final void J(View view, int i9) {
        view.setTransitionVisibility(i9);
    }

    @Override // X0.B
    public final void a0(View view, int i9, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i9, i10, i11, i12);
    }

    @Override // X0.B
    public final void b0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // X0.B
    public final void c0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // B6.u0
    public final float z(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
