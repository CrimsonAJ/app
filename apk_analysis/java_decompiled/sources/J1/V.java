package J1;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;

/* loaded from: classes.dex */
public final class V extends U {

    /* renamed from: C, reason: collision with root package name */
    public static final android.support.v4.media.session.y f3789C;

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f3790D;

    /* renamed from: B, reason: collision with root package name */
    public long f3791B;

    static {
        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(10);
        f3789C = yVar;
        yVar.X(0, new int[]{1}, new int[]{R.layout.layout_loading}, new String[]{"layout_loading"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3790D = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 2);
        sparseIntArray.put(R.id.imageLogo, 3);
        sparseIntArray.put(R.id.textLetYouIn, 4);
        sparseIntArray.put(R.id.buttonContinueWithGoogle, 5);
        sparseIntArray.put(R.id.viewLine, 6);
        sparseIntArray.put(R.id.buttonSignInWithPassword, 7);
        sparseIntArray.put(R.id.textNotHaveAccount, 8);
        sparseIntArray.put(R.id.textSignUp, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V(android.view.View r12) {
        /*
            r11 = this;
            android.support.v4.media.session.y r0 = J1.V.f3789C
            android.util.SparseIntArray r1 = J1.V.f3790D
            r2 = 10
            java.lang.Object[] r0 = W.g.g0(r12, r2, r0, r1)
            r1 = 2
            r1 = r0[r1]
            r5 = r1
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 7
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 3
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            J1.E1 r8 = (J1.E1) r8
            r1 = 4
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 8
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 9
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            r1 = 6
            r1 = r0[r1]
            r10 = r1
            android.view.View r10 = (android.view.View) r10
            r3 = 0
            r2 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r5 = -1
            r2.f3791B = r5
            J1.E1 r12 = r2.f3785y
            if (r12 == 0) goto L4f
            r12.f7858p = r2
        L4f:
            r12 = 0
            r12 = r0[r12]
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r0 = 0
            r12.setTag(r0)
            r11.j0(r4)
            r11.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.V.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3791B = 0L;
        }
        this.f3785y.b0();
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3791B != 0) {
                    return true;
                }
                if (this.f3785y.d0()) {
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
            this.f3791B = 2L;
        }
        this.f3785y.e0();
        h0();
    }

    @Override // W.g
    public final void i0(InterfaceC0561w interfaceC0561w) {
        super.i0(interfaceC0561w);
        this.f3785y.i0(interfaceC0561w);
    }
}
