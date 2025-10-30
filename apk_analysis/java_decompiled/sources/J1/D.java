package J1;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;

/* loaded from: classes.dex */
public final class D extends C {

    /* renamed from: D, reason: collision with root package name */
    public static final android.support.v4.media.session.y f3638D;

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f3639E;

    /* renamed from: C, reason: collision with root package name */
    public long f3640C;

    static {
        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(11);
        f3638D = yVar;
        yVar.X(0, new int[]{1}, new int[]{R.layout.layout_loading}, new String[]{"layout_loading"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3639E = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 2);
        sparseIntArray.put(R.id.textTitleEditProfile, 3);
        sparseIntArray.put(R.id.layoutInputCurrentPassword, 4);
        sparseIntArray.put(R.id.editCurrentPassword, 5);
        sparseIntArray.put(R.id.layoutInputNewPassword, 6);
        sparseIntArray.put(R.id.editNewPassword, 7);
        sparseIntArray.put(R.id.layoutInputConfirmPassword, 8);
        sparseIntArray.put(R.id.editConfirmPassword, 9);
        sparseIntArray.put(R.id.buttonUpdate, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D(android.view.View r13) {
        /*
            r12 = this;
            android.support.v4.media.session.y r0 = J1.D.f3638D
            android.util.SparseIntArray r1 = J1.D.f3639E
            r2 = 11
            java.lang.Object[] r0 = W.g.g0(r13, r2, r0, r1)
            r1 = 2
            r1 = r0[r1]
            r5 = r1
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            r1 = 10
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 9
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.textfield.TextInputEditText r7 = (com.google.android.material.textfield.TextInputEditText) r7
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.textfield.TextInputEditText r8 = (com.google.android.material.textfield.TextInputEditText) r8
            r1 = 7
            r1 = r0[r1]
            r9 = r1
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9
            r1 = 8
            r1 = r0[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 4
            r1 = r0[r1]
            r10 = r1
            com.google.android.material.textfield.TextInputLayout r10 = (com.google.android.material.textfield.TextInputLayout) r10
            r1 = 6
            r1 = r0[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 1
            r1 = r0[r1]
            r11 = r1
            J1.E1 r11 = (J1.E1) r11
            r1 = 3
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r3 = 0
            r2 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r5 = -1
            r2.f3640C = r5
            J1.E1 r13 = r2.f3620B
            if (r13 == 0) goto L56
            r13.f7858p = r2
        L56:
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r0 = 0
            r13.setTag(r0)
            r12.j0(r4)
            r12.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.D.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3640C = 0L;
        }
        this.f3620B.b0();
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3640C != 0) {
                    return true;
                }
                if (this.f3620B.d0()) {
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
            this.f3640C = 2L;
        }
        this.f3620B.e0();
        h0();
    }

    @Override // W.g
    public final void i0(InterfaceC0561w interfaceC0561w) {
        super.i0(interfaceC0561w);
        this.f3620B.i0(interfaceC0561w);
    }
}
