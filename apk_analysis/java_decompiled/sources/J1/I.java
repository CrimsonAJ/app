package J1;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;

/* loaded from: classes.dex */
public final class I extends H {

    /* renamed from: F, reason: collision with root package name */
    public static final android.support.v4.media.session.y f3690F;

    /* renamed from: G, reason: collision with root package name */
    public static final SparseIntArray f3691G;

    /* renamed from: E, reason: collision with root package name */
    public long f3692E;

    static {
        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(14);
        f3690F = yVar;
        yVar.X(0, new int[]{1}, new int[]{R.layout.layout_loading}, new String[]{"layout_loading"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3691G = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 2);
        sparseIntArray.put(R.id.textTitleEditProfile, 3);
        sparseIntArray.put(R.id.imageAvatar, 4);
        sparseIntArray.put(R.id.layoutInputDisplayName, 5);
        sparseIntArray.put(R.id.editDisplayName, 6);
        sparseIntArray.put(R.id.textEmail, 7);
        sparseIntArray.put(R.id.buttonUpdate, 8);
        sparseIntArray.put(R.id.viewSelectAvatar, 9);
        sparseIntArray.put(R.id.recyclerAvatar, 10);
        sparseIntArray.put(R.id.textSelectAvatar, 11);
        sparseIntArray.put(R.id.buttonBackSelectAvatar, 12);
        sparseIntArray.put(R.id.groupSelectAvatar, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public I(android.view.View r15) {
        /*
            r14 = this;
            android.support.v4.media.session.y r0 = J1.I.f3690F
            android.util.SparseIntArray r1 = J1.I.f3691G
            r2 = 14
            java.lang.Object[] r0 = W.g.g0(r15, r2, r0, r1)
            r1 = 2
            r1 = r0[r1]
            r5 = r1
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            r1 = 12
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r1 = 8
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 6
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.textfield.TextInputEditText r7 = (com.google.android.material.textfield.TextInputEditText) r7
            r1 = 13
            r1 = r0[r1]
            r8 = r1
            androidx.constraintlayout.widget.Group r8 = (androidx.constraintlayout.widget.Group) r8
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            r1 = 5
            r1 = r0[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 1
            r1 = r0[r1]
            r10 = r1
            J1.E1 r10 = (J1.E1) r10
            r1 = 10
            r1 = r0[r1]
            r11 = r1
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r1 = 7
            r1 = r0[r1]
            r12 = r1
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            r1 = 11
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 3
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 9
            r1 = r0[r1]
            r13 = r1
            android.view.View r13 = (android.view.View) r13
            r3 = 0
            r2 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r5 = -1
            r2.f3692E = r5
            J1.E1 r15 = r2.f3679A
            if (r15 == 0) goto L6a
            r15.f7858p = r2
        L6a:
            r15 = 0
            r15 = r0[r15]
            androidx.constraintlayout.widget.ConstraintLayout r15 = (androidx.constraintlayout.widget.ConstraintLayout) r15
            r0 = 0
            r15.setTag(r0)
            r14.j0(r4)
            r14.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.I.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3692E = 0L;
        }
        this.f3679A.b0();
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3692E != 0) {
                    return true;
                }
                if (this.f3679A.d0()) {
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
            this.f3692E = 2L;
        }
        this.f3679A.e0();
        h0();
    }

    @Override // W.g
    public final void i0(InterfaceC0561w interfaceC0561w) {
        super.i0(interfaceC0561w);
        this.f3679A.i0(interfaceC0561w);
    }
}
