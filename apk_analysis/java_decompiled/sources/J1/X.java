package J1;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;

/* loaded from: classes.dex */
public final class X extends W {

    /* renamed from: E, reason: collision with root package name */
    public static final android.support.v4.media.session.y f3805E;

    /* renamed from: F, reason: collision with root package name */
    public static final SparseIntArray f3806F;

    /* renamed from: D, reason: collision with root package name */
    public long f3807D;

    static {
        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(16);
        f3805E = yVar;
        yVar.X(1, new int[]{2}, new int[]{R.layout.layout_loading}, new String[]{"layout_loading"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3806F = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 3);
        sparseIntArray.put(R.id.imageLogo, 4);
        sparseIntArray.put(R.id.textSignIn, 5);
        sparseIntArray.put(R.id.layoutInputEmail, 6);
        sparseIntArray.put(R.id.editEmail, 7);
        sparseIntArray.put(R.id.textLayoutPassword, 8);
        sparseIntArray.put(R.id.editPassword, 9);
        sparseIntArray.put(R.id.checkRememberMe, 10);
        sparseIntArray.put(R.id.viewLine, 11);
        sparseIntArray.put(R.id.buttonSignIn, 12);
        sparseIntArray.put(R.id.textNotHaveAccount, 13);
        sparseIntArray.put(R.id.textSignUp, 14);
        sparseIntArray.put(R.id.buttonContinueWithGoogle, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X(android.view.View r14) {
        /*
            r13 = this;
            android.support.v4.media.session.y r0 = J1.X.f3805E
            android.util.SparseIntArray r1 = J1.X.f3806F
            r2 = 16
            java.lang.Object[] r0 = W.g.g0(r14, r2, r0, r1)
            r1 = 3
            r1 = r0[r1]
            r5 = r1
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            r1 = 15
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 12
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 10
            r1 = r0[r1]
            com.google.android.material.checkbox.MaterialCheckBox r1 = (com.google.android.material.checkbox.MaterialCheckBox) r1
            r1 = 7
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.textfield.TextInputEditText r8 = (com.google.android.material.textfield.TextInputEditText) r8
            r1 = 9
            r1 = r0[r1]
            r9 = r1
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9
            r1 = 4
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r1 = 6
            r1 = r0[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 2
            r1 = r0[r1]
            r10 = r1
            J1.E1 r10 = (J1.E1) r10
            r1 = 8
            r1 = r0[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 13
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 5
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 14
            r1 = r0[r1]
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r1 = 11
            r1 = r0[r1]
            r12 = r1
            android.view.View r12 = (android.view.View) r12
            r3 = 0
            r2 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r5 = -1
            r2.f3807D = r5
            J1.E1 r14 = r2.f3795A
            if (r14 == 0) goto L70
            r14.f7858p = r2
        L70:
            r14 = 0
            r14 = r0[r14]
            androidx.core.widget.NestedScrollView r14 = (androidx.core.widget.NestedScrollView) r14
            r1 = 0
            r14.setTag(r1)
            r14 = 1
            r14 = r0[r14]
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r14.setTag(r1)
            r13.j0(r4)
            r13.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.X.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3807D = 0L;
        }
        this.f3795A.b0();
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3807D != 0) {
                    return true;
                }
                if (this.f3795A.d0()) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W.g
    public final void e0() {
        synchronized (this) {
            this.f3807D = 2L;
        }
        this.f3795A.e0();
        h0();
    }

    @Override // W.g
    public final void i0(InterfaceC0561w interfaceC0561w) {
        super.i0(interfaceC0561w);
        this.f3795A.i0(interfaceC0561w);
    }
}
