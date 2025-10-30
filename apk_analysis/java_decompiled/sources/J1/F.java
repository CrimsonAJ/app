package J1;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;

/* loaded from: classes.dex */
public final class F extends E {

    /* renamed from: J, reason: collision with root package name */
    public static final android.support.v4.media.session.y f3670J;
    public static final SparseIntArray K;

    /* renamed from: I, reason: collision with root package name */
    public long f3671I;

    static {
        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(14);
        f3670J = yVar;
        yVar.X(0, new int[]{1}, new int[]{R.layout.layout_loading}, new String[]{"layout_loading"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 2);
        sparseIntArray.put(R.id.buttonClose, 3);
        sparseIntArray.put(R.id.textTitleComment, 4);
        sparseIntArray.put(R.id.refreshLayout, 5);
        sparseIntArray.put(R.id.recyclerComments, 6);
        sparseIntArray.put(R.id.layoutInput, 7);
        sparseIntArray.put(R.id.editComment, 8);
        sparseIntArray.put(R.id.viewStroke, 9);
        sparseIntArray.put(R.id.buttonComment, 10);
        sparseIntArray.put(R.id.layoutActionComment, 11);
        sparseIntArray.put(R.id.layoutOption, 12);
        sparseIntArray.put(R.id.buttonDeleteComment, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public F(android.view.View r18) {
        /*
            r17 = this;
            android.support.v4.media.session.y r0 = J1.F.f3670J
            android.util.SparseIntArray r1 = J1.F.K
            r2 = 14
            r3 = r18
            java.lang.Object[] r16 = W.g.g0(r3, r2, r0, r1)
            r0 = 2
            r0 = r16[r0]
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r1 = 3
            r1 = r16[r1]
            r4 = r1
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            r1 = 10
            r1 = r16[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 13
            r1 = r16[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 8
            r1 = r16[r1]
            r7 = r1
            androidx.appcompat.widget.AppCompatEditText r7 = (androidx.appcompat.widget.AppCompatEditText) r7
            r1 = 11
            r1 = r16[r1]
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            r1 = 7
            r1 = r16[r1]
            r9 = r1
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r1 = 1
            r1 = r16[r1]
            r10 = r1
            J1.E1 r10 = (J1.E1) r10
            r1 = 12
            r1 = r16[r1]
            r11 = r1
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r1 = 6
            r1 = r16[r1]
            r12 = r1
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r1 = 5
            r1 = r16[r1]
            r13 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r13 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r13
            r1 = 4
            r1 = r16[r1]
            r14 = r1
            androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
            r1 = 9
            r1 = r16[r1]
            r15 = r1
            android.view.View r15 = (android.view.View) r15
            r1 = 0
            r2 = r3
            r3 = r0
            r0 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = -1
            r0.f3671I = r1
            J1.E1 r1 = r0.f3647C
            if (r1 == 0) goto L71
            r1.f7858p = r0
        L71:
            r1 = 0
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2 = 0
            r1.setTag(r2)
            r17.j0(r18)
            r0.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.F.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3671I = 0L;
        }
        this.f3647C.b0();
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3671I != 0) {
                    return true;
                }
                if (this.f3647C.d0()) {
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
            this.f3671I = 2L;
        }
        this.f3647C.e0();
        h0();
    }

    @Override // W.g
    public final void i0(InterfaceC0561w interfaceC0561w) {
        super.i0(interfaceC0561w);
        this.f3647C.i0(interfaceC0561w);
    }
}
