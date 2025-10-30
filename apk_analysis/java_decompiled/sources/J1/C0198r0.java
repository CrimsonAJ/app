package J1;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;

/* renamed from: J1.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198r0 extends AbstractC0197q0 {

    /* renamed from: G, reason: collision with root package name */
    public static final android.support.v4.media.session.y f4064G;

    /* renamed from: H, reason: collision with root package name */
    public static final SparseIntArray f4065H;

    /* renamed from: F, reason: collision with root package name */
    public long f4066F;

    static {
        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(19);
        f4064G = yVar;
        yVar.X(1, new int[]{2}, new int[]{R.layout.layout_loading}, new String[]{"layout_loading"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4065H = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 3);
        sparseIntArray.put(R.id.imageLogo, 4);
        sparseIntArray.put(R.id.textCreateYourAccount, 5);
        sparseIntArray.put(R.id.layoutDisplayName, 6);
        sparseIntArray.put(R.id.editDisplayName, 7);
        sparseIntArray.put(R.id.layoutInputEmail, 8);
        sparseIntArray.put(R.id.editEmail, 9);
        sparseIntArray.put(R.id.textLayoutPassword, 10);
        sparseIntArray.put(R.id.editPassword, 11);
        sparseIntArray.put(R.id.textLayoutRetypePassword, 12);
        sparseIntArray.put(R.id.editRetypePassword, 13);
        sparseIntArray.put(R.id.viewLine, 14);
        sparseIntArray.put(R.id.buttonSignUp, 15);
        sparseIntArray.put(R.id.textNotHaveAccount, 16);
        sparseIntArray.put(R.id.textSignIn, 17);
        sparseIntArray.put(R.id.buttonContinueWithGoogle, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0198r0(android.view.View r15) {
        /*
            r14 = this;
            android.support.v4.media.session.y r0 = J1.C0198r0.f4064G
            android.util.SparseIntArray r1 = J1.C0198r0.f4065H
            r2 = 19
            java.lang.Object[] r13 = W.g.g0(r15, r2, r0, r1)
            r0 = 3
            r0 = r13[r0]
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r1 = 18
            r1 = r13[r1]
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r1 = 15
            r1 = r13[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 7
            r1 = r13[r1]
            r6 = r1
            com.google.android.material.textfield.TextInputEditText r6 = (com.google.android.material.textfield.TextInputEditText) r6
            r1 = 9
            r1 = r13[r1]
            r7 = r1
            com.google.android.material.textfield.TextInputEditText r7 = (com.google.android.material.textfield.TextInputEditText) r7
            r1 = 11
            r1 = r13[r1]
            r8 = r1
            com.google.android.material.textfield.TextInputEditText r8 = (com.google.android.material.textfield.TextInputEditText) r8
            r1 = 13
            r1 = r13[r1]
            r9 = r1
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9
            r1 = 4
            r1 = r13[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r1 = 6
            r1 = r13[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 8
            r1 = r13[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 2
            r1 = r13[r1]
            r10 = r1
            J1.E1 r10 = (J1.E1) r10
            r1 = 5
            r1 = r13[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 10
            r1 = r13[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 12
            r1 = r13[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 16
            r1 = r13[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 17
            r1 = r13[r1]
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r1 = 14
            r1 = r13[r1]
            r12 = r1
            android.view.View r12 = (android.view.View) r12
            r1 = 0
            r2 = r15
            r3 = r0
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r14.f4066F = r1
            J1.E1 r1 = r14.f4051C
            if (r1 == 0) goto L84
            r1.f7858p = r14
        L84:
            r1 = 0
            r1 = r13[r1]
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r2 = 0
            r1.setTag(r2)
            r1 = 1
            r1 = r13[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1.setTag(r2)
            r14.j0(r15)
            r14.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0198r0.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4066F = 0L;
        }
        this.f4051C.b0();
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4066F != 0) {
                    return true;
                }
                if (this.f4051C.d0()) {
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
            this.f4066F = 2L;
        }
        this.f4051C.e0();
        h0();
    }

    @Override // W.g
    public final void i0(InterfaceC0561w interfaceC0561w) {
        super.i0(interfaceC0561w);
        this.f4051C.i0(interfaceC0561w);
    }
}
